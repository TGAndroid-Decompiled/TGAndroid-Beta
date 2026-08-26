package org.telegram.messenger.video.audio_input;

import org.telegram.messenger.video.AudioConversions;

public final class BlankAudioInput extends AudioInput {
    public final long durationUs;
    public int remainingShorts;

    public BlankAudioInput(long j) {
        this.durationUs = j;
    }

    @Override
    public final short getNext() {
        if (!hasRemaining()) {
            throw new RuntimeException("Audio input has no remaining value.");
        }
        this.remainingShorts--;
        return (short) 0;
    }

    @Override
    public final int getSampleRate() {
        return -1;
    }

    @Override
    public final boolean hasRemaining() {
        return this.remainingShorts > 0;
    }

    @Override
    public final void release() {
        this.remainingShorts = 0;
    }

    @Override
    public final void start(int i, int i2) {
        this.remainingShorts = AudioConversions.usToShorts(this.durationUs, i, i2);
    }
}
