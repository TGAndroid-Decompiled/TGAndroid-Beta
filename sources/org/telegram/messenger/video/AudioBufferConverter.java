package org.telegram.messenger.video;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import k2.p1;
public class AudioBufferConverter {
    private static final int BYTES_PER_SHORT = 2;
    private static final String TAG = "AudioBufferConverter";
    private final fg.a mRemixer = new nb.a(7);
    private final gg.a mResampler = new ra.e(8);

    private void checkChannels(int i3, int i10) {
        if (i3 != 6 || (i10 != 1 && i10 != 2)) {
            if (i3 != 1 && i3 != 2) {
                throw new UnsupportedOperationException(p1.j(i3, "Input channel count (", ") not supported."));
            }
            if (i10 != 1 && i10 != 2) {
                throw new UnsupportedOperationException(p1.j(i10, "Output channel count (", ") not supported."));
            }
        }
    }

    private ShortBuffer createBuffer(int i3) {
        ShortBuffer asShortBuffer = ByteBuffer.allocateDirect(i3 * 2).order(ByteOrder.nativeOrder()).asShortBuffer();
        asShortBuffer.clear();
        asShortBuffer.limit(i3);
        return asShortBuffer;
    }

    public int calculateRequiredOutputSize(int i3, int i10, int i11, int i12, int i13) {
        checkChannels(i11, i13);
        return (int) Math.ceil((this.mRemixer.v1(i3, i11, i13) * i12) / i10);
    }

    public ShortBuffer convert(ShortBuffer shortBuffer, int i3, int i10, int i11, int i12) {
        checkChannels(i10, i12);
        int v12 = this.mRemixer.v1(shortBuffer.remaining(), i10, i12);
        ShortBuffer createBuffer = createBuffer(v12);
        this.mRemixer.H0(shortBuffer, i10, createBuffer, i12);
        createBuffer.rewind();
        ShortBuffer createBuffer2 = createBuffer(((int) Math.ceil((v12 * i11) / i3)) + 10);
        this.mResampler.l0(createBuffer, i3, createBuffer2, i11, i12);
        createBuffer2.limit(createBuffer2.position());
        createBuffer2.rewind();
        return createBuffer2;
    }
}
