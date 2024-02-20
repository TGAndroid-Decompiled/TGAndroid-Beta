package org.telegram.messenger.video.remix;

import java.nio.ShortBuffer;
import org.telegram.messenger.LiteMode;
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

    private short mix(short s, short s2) {
        int i;
        int i2 = s + LiteMode.FLAG_CHAT_SCALE;
        int i3 = s2 + LiteMode.FLAG_CHAT_SCALE;
        if (i2 < 32768 || i3 < 32768) {
            i = (i2 * i3) / LiteMode.FLAG_CHAT_SCALE;
        } else {
            i = (((i2 + i3) * 2) - ((i2 * i3) / LiteMode.FLAG_CHAT_SCALE)) - 65535;
        }
        return (short) ((i != 65536 ? i : 65535) - LiteMode.FLAG_CHAT_SCALE);
    }
}
