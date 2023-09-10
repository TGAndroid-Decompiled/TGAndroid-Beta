package org.telegram.messenger.video.remix;

import java.nio.ShortBuffer;
public class UpMixAudioRemixer implements AudioRemixer {
    @Override
    public int getRemixedSize(int i, int i2, int i3) {
        return i * 2;
    }

    @Override
    public void remix(ShortBuffer shortBuffer, int i, ShortBuffer shortBuffer2, int i2) {
        int min = Math.min(shortBuffer.remaining(), shortBuffer2.remaining() / 2);
        for (int i3 = 0; i3 < min; i3++) {
            short s = shortBuffer.get();
            shortBuffer2.put(s);
            shortBuffer2.put(s);
        }
    }
}
