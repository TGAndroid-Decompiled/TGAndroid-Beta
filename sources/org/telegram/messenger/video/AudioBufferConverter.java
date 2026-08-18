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
        return (int) Math.ceil((((double) this.mRemixer.getRemixedSize(i, i3, i5)) * ((double) i4)) / ((double) i2));
    }

    public ShortBuffer convert(ShortBuffer shortBuffer, int i, int i2, int i3, int i4) {
        checkChannels(i2, i4);
        int remixedSize = this.mRemixer.getRemixedSize(shortBuffer.remaining(), i2, i4);
        ShortBuffer shortBufferCreateBuffer = createBuffer(remixedSize);
        this.mRemixer.remix(shortBuffer, i2, shortBufferCreateBuffer, i4);
        shortBufferCreateBuffer.rewind();
        ShortBuffer shortBufferCreateBuffer2 = createBuffer(((int) Math.ceil((((double) remixedSize) * ((double) i3)) / ((double) i))) + 10);
        this.mResampler.resample(shortBufferCreateBuffer, i, shortBufferCreateBuffer2, i3, i4);
        shortBufferCreateBuffer2.limit(shortBufferCreateBuffer2.position());
        shortBufferCreateBuffer2.rewind();
        return shortBufferCreateBuffer2;
    }

    private void checkChannels(int i, int i2) {
        if (i == 6 && (i2 == 1 || i2 == 2)) {
            return;
        }
        if (i != 1 && i != 2) {
            throw new UnsupportedOperationException("Input channel count (" + i + ") not supported.");
        }
        if (i2 == 1 || i2 == 2) {
            return;
        }
        throw new UnsupportedOperationException("Output channel count (" + i2 + ") not supported.");
    }

    private ShortBuffer createBuffer(int i) {
        ShortBuffer shortBufferAsShortBuffer = ByteBuffer.allocateDirect(i * 2).order(ByteOrder.nativeOrder()).asShortBuffer();
        shortBufferAsShortBuffer.clear();
        shortBufferAsShortBuffer.limit(i);
        return shortBufferAsShortBuffer;
    }
}
