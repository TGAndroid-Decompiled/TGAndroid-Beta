package d4;

import java.nio.ByteBuffer;
public final class g extends n3.i {
    public long f4155s;
    public int v;
    public int f4156w;

    @Override
    public final void c() {
        super.c();
        this.v = 0;
    }

    public final boolean n(n3.i iVar) {
        ByteBuffer byteBuffer;
        h5.a.f(!iVar.e(1073741824));
        h5.a.f(!iVar.e(268435456));
        h5.a.f(!iVar.e(4));
        int i10 = this.v;
        if (i10 > 0) {
            if (i10 < this.f4156w && iVar.e(Integer.MIN_VALUE) == e(Integer.MIN_VALUE)) {
                ByteBuffer byteBuffer2 = iVar.d;
                if (byteBuffer2 != null && (byteBuffer = this.d) != null) {
                    if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                        return false;
                    }
                }
            } else {
                return false;
            }
        }
        int i11 = this.v;
        this.v = i11 + 1;
        if (i11 == 0) {
            this.f14242f = iVar.f14242f;
            if (iVar.e(1)) {
                this.f14222b = 1;
            }
        }
        if (iVar.e(Integer.MIN_VALUE)) {
            this.f14222b = Integer.MIN_VALUE;
        }
        ByteBuffer byteBuffer3 = iVar.d;
        if (byteBuffer3 != null) {
            k(byteBuffer3.remaining());
            this.d.put(byteBuffer3);
        }
        this.f4155s = iVar.f14242f;
        return true;
    }
}
