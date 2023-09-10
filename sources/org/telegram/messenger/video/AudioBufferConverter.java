package org.telegram.messenger.video;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import org.telegram.messenger.video.remix.AudioRemixer;
import org.telegram.messenger.video.remix.DefaultAudioRemixer;
import org.telegram.messenger.video.resample.AudioResampler;
import org.telegram.messenger.video.resample.DefaultAudioResampler;
public class AudioBufferConverter {
    private static final int BYTES_PER_SHORT = 2;
    private static final String TAG = "AudioBufferConverter";
    private final AudioRemixer mRemixer = new DefaultAudioRemixer();
    private final AudioResampler mResampler = new DefaultAudioResampler();

    public int calculateRequiredOutputSize(int i, int i2, int i3, int i4, int i5) {
        checkChannels(i3, i5);
        double remixedSize = this.mRemixer.getRemixedSize(i, i3, i5);
        double d = i4;
        Double.isNaN(remixedSize);
        Double.isNaN(d);
        double d2 = i2;
        Double.isNaN(d2);
        return (int) Math.ceil((remixedSize * d) / d2);
    }

    public ShortBuffer convert(ShortBuffer shortBuffer, int i, int i2, int i3, int i4) {
        checkChannels(i2, i4);
        int remixedSize = this.mRemixer.getRemixedSize(shortBuffer.remaining(), i2, i4);
        ShortBuffer createBuffer = createBuffer(remixedSize);
        this.mRemixer.remix(shortBuffer, i2, createBuffer, i4);
        createBuffer.rewind();
        double d = remixedSize;
        double d2 = i3;
        Double.isNaN(d);
        Double.isNaN(d2);
        double d3 = d * d2;
        double d4 = i;
        Double.isNaN(d4);
        ShortBuffer createBuffer2 = createBuffer(((int) Math.ceil(d3 / d4)) + 10);
        this.mResampler.resample(createBuffer, i, createBuffer2, i3, i2);
        createBuffer2.limit(createBuffer2.position());
        createBuffer2.rewind();
        return createBuffer2;
    }

    private void checkChannels(int i, int i2) {
        if (i != 1 && i != 2) {
            throw new UnsupportedOperationException("Input channel count (" + i + ") not supported.");
        } else if (i2 == 1 || i2 == 2) {
        } else {
            throw new UnsupportedOperationException("Output channel count (" + i2 + ") not supported.");
        }
    }

    private ShortBuffer createBuffer(int i) {
        ShortBuffer asShortBuffer = ByteBuffer.allocateDirect(i * 2).order(ByteOrder.nativeOrder()).asShortBuffer();
        asShortBuffer.clear();
        asShortBuffer.limit(i);
        return asShortBuffer;
    }
}
