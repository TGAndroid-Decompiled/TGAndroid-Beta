package org.telegram.messenger.video;

import j3.r0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
public class AudioBufferConverter {
    private static final int BYTES_PER_SHORT = 2;
    private static final String TAG = "AudioBufferConverter";
    private final jf.a mRemixer = new v9.d(11);
    private final kf.a mResampler = new wa.a(12);

    private void checkChannels(int i9, int i10) {
        if (i9 != 6 || (i10 != 1 && i10 != 2)) {
            if (i9 != 1 && i9 != 2) {
                throw new UnsupportedOperationException(r0.m(i9, "Input channel count (", ") not supported."));
            }
            if (i10 != 1 && i10 != 2) {
                throw new UnsupportedOperationException(r0.m(i10, "Output channel count (", ") not supported."));
            }
        }
    }

    private ShortBuffer createBuffer(int i9) {
        ShortBuffer asShortBuffer = ByteBuffer.allocateDirect(i9 * 2).order(ByteOrder.nativeOrder()).asShortBuffer();
        asShortBuffer.clear();
        asShortBuffer.limit(i9);
        return asShortBuffer;
    }

    public int calculateRequiredOutputSize(int i9, int i10, int i11, int i12, int i13) {
        checkChannels(i11, i13);
        return (int) Math.ceil((this.mRemixer.B1(i9, i11, i13) * i12) / i10);
    }

    public ShortBuffer convert(ShortBuffer shortBuffer, int i9, int i10, int i11, int i12) {
        checkChannels(i10, i12);
        int B1 = this.mRemixer.B1(shortBuffer.remaining(), i10, i12);
        ShortBuffer createBuffer = createBuffer(B1);
        this.mRemixer.H0(shortBuffer, i10, createBuffer, i12);
        createBuffer.rewind();
        ShortBuffer createBuffer2 = createBuffer(((int) Math.ceil((B1 * i11) / i9)) + 10);
        this.mResampler.g0(createBuffer, i9, createBuffer2, i11, i12);
        createBuffer2.limit(createBuffer2.position());
        createBuffer2.rewind();
        return createBuffer2;
    }
}
