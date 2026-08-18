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
        int iRemaining = shortBuffer.remaining() / i3;
        int iCeil = (int) Math.ceil(((double) iRemaining) * (((double) i2) / ((double) i)));
        int i4 = iRemaining - iCeil;
        float fRatio = ratio(iCeil, iCeil);
        float fRatio2 = ratio(i4, i4);
        int i5 = iCeil;
        int i6 = i4;
        while (i5 > 0 && i6 > 0) {
            if (fRatio >= fRatio2) {
                shortBuffer2.put(shortBuffer.get());
                if (i3 == 2) {
                    shortBuffer2.put(shortBuffer.get());
                }
                i5--;
                fRatio = ratio(i5, iCeil);
            } else {
                shortBuffer.position(shortBuffer.position() + i3);
                i6--;
                fRatio2 = ratio(i6, i4);
            }
        }
    }
}
