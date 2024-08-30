package org.telegram.messenger.video.remix;

import java.nio.ShortBuffer;

public class DefaultAudioRemixer implements AudioRemixer {
    @Override
    public int getRemixedSize(int i, int i2, int i3) {
        return (i2 == 6 ? AudioRemixer.SURROUND : i2 > i3 ? AudioRemixer.DOWNMIX : i2 < i3 ? AudioRemixer.UPMIX : AudioRemixer.PASSTHROUGH).getRemixedSize(i, i2, i3);
    }

    @Override
    public void remix(ShortBuffer shortBuffer, int i, ShortBuffer shortBuffer2, int i2) {
        (i == 6 ? AudioRemixer.SURROUND : i > i2 ? AudioRemixer.DOWNMIX : i < i2 ? AudioRemixer.UPMIX : AudioRemixer.PASSTHROUGH).remix(shortBuffer, i, shortBuffer2, i2);
    }
}
