package j3;

import java.nio.ByteBuffer;

public final class z extends y {

    public int[] f12495i;

    public int[] f12496j;

    @Override
    public final void b(ByteBuffer byteBuffer) {
        int[] iArr = this.f12496j;
        iArr.getClass();
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBufferJ = j(((iLimit - iPosition) / this.f12490b.d) * this.f12491c.d);
        while (iPosition < iLimit) {
            for (int i10 : iArr) {
                byteBufferJ.putShort(byteBuffer.getShort((i10 * 2) + iPosition));
            }
            iPosition += this.f12490b.d;
        }
        byteBuffer.position(iLimit);
        byteBufferJ.flip();
    }

    @Override
    public final h f(h hVar) throws i {
        int[] iArr = this.f12495i;
        if (iArr == null) {
            return h.f12342e;
        }
        int i10 = hVar.f12345c;
        int i11 = hVar.f12344b;
        if (i10 != 2) {
            throw new i(hVar);
        }
        boolean z10 = i11 != iArr.length;
        int i12 = 0;
        while (i12 < iArr.length) {
            int i13 = iArr[i12];
            if (i13 >= i11) {
                throw new i(hVar);
            }
            z10 |= i13 != i12;
            i12++;
        }
        return z10 ? new h(hVar.f12343a, iArr.length, 2) : h.f12342e;
    }

    @Override
    public final void g() {
        this.f12496j = this.f12495i;
    }

    @Override
    public final void i() {
        this.f12496j = null;
        this.f12495i = null;
    }
}
