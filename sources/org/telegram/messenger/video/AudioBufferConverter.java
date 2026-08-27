package org.telegram.messenger.video;

import e7.v;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

public class AudioBufferConverter {
    private static final int BYTES_PER_SHORT = 2;
    private static final String TAG = "AudioBufferConverter";
    private final kf.a mRemixer = new w9.d(11);
    private final lf.a mResampler = new v(13);

    private void checkChannels(int i10, int i11) {
        if (i10 == 6 && (i11 == 1 || i11 == 2)) {
            return;
        }
        if (i10 != 1 && i10 != 2) {
            throw new UnsupportedOperationException(i0.a.l(i10, "Input channel count (", ") not supported."));
        }
        if (i11 != 1 && i11 != 2) {
            throw new UnsupportedOperationException(i0.a.l(i11, "Output channel count (", ") not supported."));
        }
    }

    private ShortBuffer createBuffer(int i10) {
        ShortBuffer shortBufferAsShortBuffer = ByteBuffer.allocateDirect(i10 * 2).order(ByteOrder.nativeOrder()).asShortBuffer();
        shortBufferAsShortBuffer.clear();
        shortBufferAsShortBuffer.limit(i10);
        return shortBufferAsShortBuffer;
    }

    public int calculateRequiredOutputSize(int i10, int i11, int i12, int i13, int i14) {
        checkChannels(i12, i14);
        return (int) Math.ceil((((double) this.mRemixer.C1(i10, i12, i14)) * ((double) i13)) / ((double) i11));
    }

    public ShortBuffer convert(ShortBuffer shortBuffer, int i10, int i11, int i12, int i13) {
        checkChannels(i11, i13);
        int iC1 = this.mRemixer.C1(shortBuffer.remaining(), i11, i13);
        ShortBuffer shortBufferCreateBuffer = createBuffer(iC1);
        this.mRemixer.D0(shortBuffer, i11, shortBufferCreateBuffer, i13);
        shortBufferCreateBuffer.rewind();
        ShortBuffer shortBufferCreateBuffer2 = createBuffer(((int) Math.ceil((((double) iC1) * ((double) i12)) / ((double) i10))) + 10);
        this.mResampler.c0(shortBufferCreateBuffer, i10, shortBufferCreateBuffer2, i12, i13);
        shortBufferCreateBuffer2.limit(shortBufferCreateBuffer2.position());
        shortBufferCreateBuffer2.rewind();
        return shortBufferCreateBuffer2;
    }
}
