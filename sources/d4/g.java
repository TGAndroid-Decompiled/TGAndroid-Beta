package d4;

import java.nio.ByteBuffer;
public final class g extends n3.i {
    public long f4225s;
    public int v;
    public int f4226w;

    @Override
    public final void b() {
        super.b();
        this.v = 0;
    }

    public final boolean m(n3.i iVar) {
        ByteBuffer byteBuffer;
        h5.a.f(!iVar.e(1073741824));
        h5.a.f(!iVar.e(268435456));
        h5.a.f(!iVar.e(4));
        int i10 = this.v;
        if (i10 > 0) {
            if (i10 < this.f4226w && iVar.e(Integer.MIN_VALUE) == e(Integer.MIN_VALUE)) {
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
            this.f15216f = iVar.f15216f;
            if (iVar.e(1)) {
                this.f15193b = 1;
            }
        }
        if (iVar.e(Integer.MIN_VALUE)) {
            this.f15193b = Integer.MIN_VALUE;
        }
        ByteBuffer byteBuffer3 = iVar.d;
        if (byteBuffer3 != null) {
            j(byteBuffer3.remaining());
            this.d.put(byteBuffer3);
        }
        this.f4225s = iVar.f15216f;
        return true;
    }
}
