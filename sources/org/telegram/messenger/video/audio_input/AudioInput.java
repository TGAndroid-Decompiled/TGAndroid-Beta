package org.telegram.messenger.video.audio_input;

public abstract class AudioInput {
    private boolean loopingEnabled;
    private float volume = 1.0f;

    public abstract short getNext();

    public abstract int getSampleRate();

    public float getVolume() {
        return this.volume;
    }

    public abstract boolean hasRemaining();

    public boolean isLoopingEnabled() {
        return this.loopingEnabled;
    }

    public abstract void release();

    public void setVolume(float f) {
        this.volume = Math.max(0.0f, Math.min(f, 1.0f));
    }

    public abstract void start(int i, int i2);
}
