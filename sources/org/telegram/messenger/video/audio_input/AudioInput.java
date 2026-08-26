package org.telegram.messenger.video.audio_input;

public abstract class AudioInput {
    public float volume = 1.0f;

    public abstract short getNext();

    public abstract int getSampleRate();

    public abstract boolean hasRemaining();

    public abstract void release();

    public abstract void start(int i, int i2);
}
