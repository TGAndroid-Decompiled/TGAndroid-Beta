package org.telegram.messenger.video.remix;

import java.nio.ShortBuffer;

public class DownMixAudioRemixer implements AudioRemixer {
    @Override
    public void remix(ShortBuffer shortBuffer, int i, ShortBuffer shortBuffer2, int i2) {
        int min = Math.min(shortBuffer.remaining() / 2, shortBuffer2.remaining());
        for (int i3 = 0; i3 < min; i3++) {
            shortBuffer2.put(mix(shortBuffer.get(), shortBuffer.get()));
        }
    }

    @Override
    public int getRemixedSize(int i, int i2, int i3) {
        return i / 2;
    }

    public static short mix(short s, short s2) {
        int i;
        int i2 = s + 32768;
        int i3 = s2 + 32768;
        if (i2 < 32768 || i3 < 32768) {
            i = (i2 * i3) / 32768;
        } else {
            i = (((i2 + i3) * 2) - ((i2 * i3) / 32768)) - 65535;
        }
        return (short) ((i != 65536 ? i : 65535) - 32768);
    }
}
