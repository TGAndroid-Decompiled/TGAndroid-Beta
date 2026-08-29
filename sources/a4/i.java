package a4;

import java.nio.ByteBuffer;
public final class i extends m3.i {
    public long f89n;
    public int f90r;
    public int f91s;

    @Override
    public final void clear() {
        super.clear();
        this.f90r = 0;
    }

    public final boolean d(m3.i iVar) {
        ByteBuffer byteBuffer;
        f5.a.f(!iVar.getFlag(1073741824));
        f5.a.f(!iVar.hasSupplementalData());
        f5.a.f(!iVar.isEndOfStream());
        int i10 = this.f90r;
        if (i10 > 0) {
            if (i10 < this.f91s && iVar.isDecodeOnly() == isDecodeOnly()) {
                ByteBuffer byteBuffer2 = iVar.f16828b;
                if (byteBuffer2 != null && (byteBuffer = this.f16828b) != null) {
                    if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                        return false;
                    }
                }
            } else {
                return false;
            }
        }
        int i11 = this.f90r;
        this.f90r = i11 + 1;
        if (i11 == 0) {
            this.d = iVar.d;
            if (iVar.isKeyFrame()) {
                setFlags(1);
            }
        }
        if (iVar.isDecodeOnly()) {
            setFlags(Integer.MIN_VALUE);
        }
        ByteBuffer byteBuffer3 = iVar.f16828b;
        if (byteBuffer3 != null) {
            b(byteBuffer3.remaining());
            this.f16828b.put(byteBuffer3);
        }
        this.f89n = iVar.d;
        return true;
    }
}
