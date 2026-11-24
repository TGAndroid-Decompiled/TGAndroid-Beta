package defpackage;

import android.media.MediaDataSource;
public final class y01 extends MediaDataSource {
    public final byte[] a;

    public y01(byte[] bArr) {
        this.a = bArr;
    }

    @Override
    public final long getSize() {
        return this.a.length;
    }

    @Override
    public final int readAt(long j, byte[] bArr, int i, int i2) {
        byte[] bArr2 = this.a;
        if (j >= bArr2.length) {
            return -1;
        }
        int min = (int) Math.min(i2, bArr2.length - j);
        System.arraycopy(bArr2, (int) j, bArr, i, min);
        return min;
    }

    @Override
    public final void close() {
    }
}
