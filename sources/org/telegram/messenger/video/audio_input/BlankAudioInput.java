package org.telegram.messenger.video.audio_input;

import org.telegram.messenger.video.AudioConversions;

public class BlankAudioInput extends AudioInput {
    public final long durationUs;
    private int remainingShorts;
    private int requiredShortsForDuration;

    @Override
    public int getSampleRate() {
        return -1;
    }

    public BlankAudioInput(long j) {
        this.durationUs = j;
    }

    @Override
    public boolean hasRemaining() {
        return this.remainingShorts > 0;
    }

    @Override
    public void start(int i, int i2) {
        int usToShorts = AudioConversions.usToShorts(this.durationUs, i, i2);
        this.requiredShortsForDuration = usToShorts;
        this.remainingShorts = usToShorts;
    }

    @Override
    public short getNext() {
        if (!hasRemaining()) {
            throw new RuntimeException("Audio input has no remaining value.");
        }
        this.remainingShorts--;
        if (!isLoopingEnabled() || this.remainingShorts != 0) {
            return (short) 0;
        }
        this.remainingShorts = this.requiredShortsForDuration;
        return (short) 0;
    }

    @Override
    public void release() {
        this.remainingShorts = 0;
    }
}
