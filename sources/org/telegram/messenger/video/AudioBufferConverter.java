package org.telegram.messenger.video;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
public class AudioBufferConverter {
    private static final int BYTES_PER_SHORT = 2;
    private static final String TAG = "AudioBufferConverter";
    private final bg.a mRemixer = new Object();
    private final cg.a mResampler = new rb.a(6);

    private void checkChannels(int i10, int i11) {
        if (i10 != 6 || (i11 != 1 && i11 != 2)) {
            if (i10 != 1 && i10 != 2) {
                throw new UnsupportedOperationException(i2.g.j(i10, "Input channel count (", ") not supported."));
            }
            if (i11 != 1 && i11 != 2) {
                throw new UnsupportedOperationException(i2.g.j(i11, "Output channel count (", ") not supported."));
            }
        }
    }

    private ShortBuffer createBuffer(int i10) {
        ShortBuffer asShortBuffer = ByteBuffer.allocateDirect(i10 * 2).order(ByteOrder.nativeOrder()).asShortBuffer();
        asShortBuffer.clear();
        asShortBuffer.limit(i10);
        return asShortBuffer;
    }

    public int calculateRequiredOutputSize(int i10, int i11, int i12, int i13, int i14) {
        checkChannels(i12, i14);
        return (int) Math.ceil((this.mRemixer.E1(i10, i12, i14) * i13) / i11);
    }

    public ShortBuffer convert(ShortBuffer shortBuffer, int i10, int i11, int i12, int i13) {
        checkChannels(i11, i13);
        int E1 = this.mRemixer.E1(shortBuffer.remaining(), i11, i13);
        ShortBuffer createBuffer = createBuffer(E1);
        this.mRemixer.O0(shortBuffer, i11, createBuffer, i13);
        createBuffer.rewind();
        ShortBuffer createBuffer2 = createBuffer(((int) Math.ceil((E1 * i12) / i10)) + 10);
        this.mResampler.z(createBuffer, i10, createBuffer2, i12, i13);
        createBuffer2.limit(createBuffer2.position());
        createBuffer2.rewind();
        return createBuffer2;
    }
}
