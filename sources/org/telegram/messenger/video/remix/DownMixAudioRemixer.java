package org.telegram.messenger.video.remix;

import java.nio.ShortBuffer;

public class DownMixAudioRemixer implements AudioRemixer {
    public static short mix(short s, short s2) {
        int i = s + 32768;
        int i2 = s2 + 32768;
        int i3 = (i < 32768 || i2 < 32768) ? (i * i2) / 32768 : (((i + i2) * 2) - ((i * i2) / 32768)) - 65535;
        return (short) ((i3 != 65536 ? i3 : 65535) - 32768);
    }

    @Override
    public int getRemixedSize(int i, int i2, int i3) {
        return i / 2;
    }

    @Override
    public void remix(ShortBuffer shortBuffer, int i, ShortBuffer shortBuffer2, int i2) {
        int min = Math.min(shortBuffer.remaining() / 2, shortBuffer2.remaining());
        for (int i3 = 0; i3 < min; i3++) {
            shortBuffer2.put(mix(shortBuffer.get(), shortBuffer.get()));
        }
    }
}
