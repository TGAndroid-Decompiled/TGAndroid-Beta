package org.telegram.messenger.video;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
public class AudioBufferConverter {
    private static final int BYTES_PER_SHORT = 2;
    private static final String TAG = "AudioBufferConverter";
    private final eg.a mRemixer = new pb.b(7);
    private final fg.a mResampler = new sa.d(9);

    private void checkChannels(int i7, int i10) {
        if (i7 != 6 || (i10 != 1 && i10 != 2)) {
            if (i7 != 1 && i7 != 2) {
                throw new UnsupportedOperationException(i5.c.j(i7, "Input channel count (", ") not supported."));
            }
            if (i10 != 1 && i10 != 2) {
                throw new UnsupportedOperationException(i5.c.j(i10, "Output channel count (", ") not supported."));
            }
        }
    }

    private ShortBuffer createBuffer(int i7) {
        ShortBuffer asShortBuffer = ByteBuffer.allocateDirect(i7 * 2).order(ByteOrder.nativeOrder()).asShortBuffer();
        asShortBuffer.clear();
        asShortBuffer.limit(i7);
        return asShortBuffer;
    }

    public int calculateRequiredOutputSize(int i7, int i10, int i11, int i12, int i13) {
        checkChannels(i11, i13);
        return (int) Math.ceil((this.mRemixer.M1(i7, i11, i13) * i12) / i10);
    }

    public ShortBuffer convert(ShortBuffer shortBuffer, int i7, int i10, int i11, int i12) {
        checkChannels(i10, i12);
        int M1 = this.mRemixer.M1(shortBuffer.remaining(), i10, i12);
        ShortBuffer createBuffer = createBuffer(M1);
        this.mRemixer.E0(shortBuffer, i10, createBuffer, i12);
        createBuffer.rewind();
        ShortBuffer createBuffer2 = createBuffer(((int) Math.ceil((M1 * i11) / i7)) + 10);
        this.mResampler.f0(createBuffer, i7, createBuffer2, i11, i12);
        createBuffer2.limit(createBuffer2.position());
        createBuffer2.rewind();
        return createBuffer2;
    }
}
