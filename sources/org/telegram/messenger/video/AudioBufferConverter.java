package org.telegram.messenger.video;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
public class AudioBufferConverter {
    private static final int BYTES_PER_SHORT = 2;
    private static final String TAG = "AudioBufferConverter";
    private final j30 mRemixer = new rj2((byte) 17);
    private final q30 mResampler = new qf5((byte) 17);

    private void checkChannels(int i, int i2) {
        if (i != 6 || (i2 != 1 && i2 != 2)) {
            if (i != 1 && i != 2) {
                qyc.c(qd4.n(i, "Input channel count (", ") not supported."));
            } else if (i2 != 1 && i2 != 2) {
                qyc.c(qd4.n(i2, "Output channel count (", ") not supported."));
            }
        }
    }

    private ShortBuffer createBuffer(int i) {
        ShortBuffer asShortBuffer = ByteBuffer.allocateDirect(i << 1).order(ByteOrder.nativeOrder()).asShortBuffer();
        asShortBuffer.clear();
        asShortBuffer.limit(i);
        return asShortBuffer;
    }

    public int calculateRequiredOutputSize(int i, int i2, int i3, int i4, int i5) {
        checkChannels(i3, i5);
        return (int) Math.ceil((this.mRemixer.s1(i, i3, i5) * i4) / i2);
    }

    public ShortBuffer convert(ShortBuffer shortBuffer, int i, int i2, int i3, int i4) {
        checkChannels(i2, i4);
        int s1 = this.mRemixer.s1(shortBuffer.remaining(), i2, i4);
        ShortBuffer createBuffer = createBuffer(s1);
        this.mRemixer.p0(shortBuffer, i2, createBuffer, i4);
        createBuffer.rewind();
        ShortBuffer createBuffer2 = createBuffer(((int) Math.ceil((s1 * i3) / i)) + 10);
        this.mResampler.s(createBuffer, i, createBuffer2, i3, i4);
        createBuffer2.limit(createBuffer2.position());
        createBuffer2.rewind();
        return createBuffer2;
    }
}
