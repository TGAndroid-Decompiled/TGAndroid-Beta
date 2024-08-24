package org.telegram.messenger.video.remix;

import java.nio.ShortBuffer;

public interface AudioRemixer {
    public static final AudioRemixer DOWNMIX = new DownMixAudioRemixer();
    public static final AudioRemixer UPMIX = new UpMixAudioRemixer();
    public static final AudioRemixer PASSTHROUGH = new PassThroughAudioRemixer();
    public static final AudioRemixer SURROUND = new SurroundAudioRemixer();

    int getRemixedSize(int i, int i2, int i3);

    void remix(ShortBuffer shortBuffer, int i, ShortBuffer shortBuffer2, int i2);
}
