package org.telegram.messenger.video.audio_input;

import java.nio.ShortBuffer;
import org.telegram.messenger.video.AudioBufferConverter;
import org.telegram.messenger.video.AudioConversions;
import org.telegram.messenger.video.AudioDecoder;

public final class GeneralAudioInput extends AudioInput {
    public final AudioBufferConverter audioBufferConverter = new AudioBufferConverter();
    public ShortBuffer buffer;
    public final AudioDecoder decoder;
    public boolean hasRemaining;
    public int outputChannelCount;
    public int outputSampleRate;
    public int requiredShortsForStartOffset;
    public int startOffsetShortsCounter;
    public long startOffsetUs;

    public GeneralAudioInput(String str) {
        this.decoder = new AudioDecoder(str);
    }

    public final void decode() {
        ShortBuffer shortBuffer = this.buffer;
        if (shortBuffer == null || shortBuffer.remaining() <= 0) {
            AudioDecoder audioDecoder = this.decoder;
            AudioDecoder.DecodedBufferData decodedBufferDataDecode = audioDecoder.decode();
            if (decodedBufferDataDecode.index < 0) {
                this.buffer = null;
                return;
            }
            this.buffer = this.audioBufferConverter.convert(decodedBufferDataDecode.byteBuffer.asShortBuffer(), audioDecoder.getSampleRate(), audioDecoder.getChannelCount(), this.outputSampleRate, this.outputChannelCount);
            audioDecoder.releaseOutputBuffer(decodedBufferDataDecode.index);
        }
    }

    @Override
    public final short getNext() {
        if (!this.hasRemaining) {
            throw new RuntimeException("Audio input has no remaining value.");
        }
        int i = this.startOffsetShortsCounter;
        if (i < this.requiredShortsForStartOffset) {
            this.startOffsetShortsCounter = i + 1;
            return (short) 0;
        }
        decode();
        ShortBuffer shortBuffer = this.buffer;
        short s = (shortBuffer == null || shortBuffer.remaining() <= 0) ? (short) 0 : this.buffer.get();
        decode();
        ShortBuffer shortBuffer2 = this.buffer;
        if (shortBuffer2 != null && shortBuffer2.remaining() >= 1) {
            return s;
        }
        this.hasRemaining = false;
        return s;
    }

    @Override
    public final int getSampleRate() {
        return this.decoder.getSampleRate();
    }

    @Override
    public final boolean hasRemaining() {
        return this.hasRemaining;
    }

    @Override
    public final void release() {
        this.buffer = null;
        this.hasRemaining = false;
        AudioDecoder audioDecoder = this.decoder;
        audioDecoder.stop();
        audioDecoder.release();
    }

    public final void setEndTimeUs(long j) {
        this.decoder.setEndTimeUs(j);
    }

    public final void setStartTimeUs(long j) {
        this.decoder.setStartTimeUs(j);
    }

    @Override
    public final void start(int i, int i2) {
        this.outputSampleRate = i;
        this.outputChannelCount = i2;
        this.hasRemaining = true;
        this.decoder.start();
        this.requiredShortsForStartOffset = AudioConversions.usToShorts(this.startOffsetUs, this.outputSampleRate, this.outputChannelCount);
        this.startOffsetShortsCounter = 0;
    }

    public GeneralAudioInput(String str, int i) {
        this.decoder = new AudioDecoder(str, i);
    }
}
