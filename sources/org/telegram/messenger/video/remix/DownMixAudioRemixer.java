package org.telegram.messenger.video.remix;

import java.nio.ShortBuffer;
import org.telegram.messenger.LiteMode;
public class DownMixAudioRemixer implements AudioRemixer {
    @Override
    public void remix(ShortBuffer shortBuffer, int i, ShortBuffer shortBuffer2, int i2) {
        int i3;
        int min = Math.min(shortBuffer.remaining() / 2, shortBuffer2.remaining());
        for (int i4 = 0; i4 < min; i4++) {
            int i5 = shortBuffer.get() + LiteMode.FLAG_CHAT_SCALE;
            int i6 = shortBuffer.get() + LiteMode.FLAG_CHAT_SCALE;
            int i7 = 65535;
            if (i5 < 32768 || i6 < 32768) {
                i3 = (i5 * i6) / LiteMode.FLAG_CHAT_SCALE;
            } else {
                i3 = (((i5 + i6) * 2) - ((i5 * i6) / LiteMode.FLAG_CHAT_SCALE)) - 65535;
            }
            if (i3 != 65536) {
                i7 = i3;
            }
            shortBuffer2.put((short) (i7 - LiteMode.FLAG_CHAT_SCALE));
        }
    }

    @Override
    public int getRemixedSize(int i, int i2, int i3) {
        return i / 2;
    }
}
