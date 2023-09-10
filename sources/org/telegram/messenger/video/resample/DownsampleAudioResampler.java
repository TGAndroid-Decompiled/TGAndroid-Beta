package org.telegram.messenger.video.resample;

import java.nio.ShortBuffer;
public class DownsampleAudioResampler implements AudioResampler {
    private static float ratio(int i, int i2) {
        return i / i2;
    }

    @Override
    public void resample(ShortBuffer shortBuffer, int i, ShortBuffer shortBuffer2, int i2, int i3) {
        if (i < i2) {
            throw new IllegalArgumentException("Illegal use of DownsampleAudioResampler");
        }
        if (i3 != 1 && i3 != 2) {
            throw new IllegalArgumentException("Illegal use of DownsampleAudioResampler. Channels:" + i3);
        }
        int remaining = shortBuffer.remaining() / i3;
        double d = remaining;
        double d2 = i2;
        double d3 = i;
        Double.isNaN(d2);
        Double.isNaN(d3);
        Double.isNaN(d);
        int ceil = (int) Math.ceil(d * (d2 / d3));
        int i4 = remaining - ceil;
        float ratio = ratio(ceil, ceil);
        float ratio2 = ratio(i4, i4);
        int i5 = ceil;
        int i6 = i4;
        while (i5 > 0 && i6 > 0) {
            if (ratio >= ratio2) {
                shortBuffer2.put(shortBuffer.get());
                if (i3 == 2) {
                    shortBuffer2.put(shortBuffer.get());
                }
                i5--;
                ratio = ratio(i5, ceil);
            } else {
                shortBuffer.position(shortBuffer.position() + i3);
                i6--;
                ratio2 = ratio(i6, i4);
            }
        }
    }
}
