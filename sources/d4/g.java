package d4;

import java.nio.ByteBuffer;
public final class g extends n3.i {
    public long f4136s;
    public int v;
    public int f4137w;

    @Override
    public final void b() {
        super.b();
        this.v = 0;
    }

    public final boolean m(n3.i iVar) {
        ByteBuffer byteBuffer;
        h5.a.f(!iVar.d(1073741824));
        h5.a.f(!iVar.d(268435456));
        h5.a.f(!iVar.d(4));
        int i10 = this.v;
        if (i10 > 0) {
            if (i10 < this.f4137w && iVar.d(Integer.MIN_VALUE) == d(Integer.MIN_VALUE)) {
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
            this.f14227f = iVar.f14227f;
            if (iVar.d(1)) {
                this.f14207b = 1;
            }
        }
        if (iVar.d(Integer.MIN_VALUE)) {
            this.f14207b = Integer.MIN_VALUE;
        }
        ByteBuffer byteBuffer3 = iVar.d;
        if (byteBuffer3 != null) {
            k(byteBuffer3.remaining());
            this.d.put(byteBuffer3);
        }
        this.f4136s = iVar.f14227f;
        return true;
    }
}
