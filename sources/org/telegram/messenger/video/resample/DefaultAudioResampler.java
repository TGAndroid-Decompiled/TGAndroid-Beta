package org.telegram.messenger.video.resample;

import java.nio.ShortBuffer;

public class DefaultAudioResampler implements AudioResampler {
    @Override
    public void resample(ShortBuffer shortBuffer, int i, ShortBuffer shortBuffer2, int i2, int i3) {
        if (i < i2) {
            AudioResampler.UPSAMPLE.resample(shortBuffer, i, shortBuffer2, i2, i3);
        } else if (i > i2) {
            AudioResampler.DOWNSAMPLE.resample(shortBuffer, i, shortBuffer2, i2, i3);
        } else {
            AudioResampler.PASSTHROUGH.resample(shortBuffer, i, shortBuffer2, i2, i3);
        }
    }
}
