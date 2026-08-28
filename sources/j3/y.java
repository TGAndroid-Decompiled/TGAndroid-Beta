package j3;

import java.nio.ByteBuffer;
public final class y extends x {
    public int[] f13395i;
    public int[] f13396j;

    @Override
    public final void b(ByteBuffer byteBuffer) {
        int[] iArr = this.f13396j;
        iArr.getClass();
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer j10 = j(((limit - position) / this.f13390b.d) * this.f13391c.d);
        while (position < limit) {
            for (int i9 : iArr) {
                j10.putShort(byteBuffer.getShort((i9 * 2) + position));
            }
            position += this.f13390b.d;
        }
        byteBuffer.position(limit);
        j10.flip();
    }

    @Override
    public final h f(h hVar) {
        boolean z10;
        boolean z11;
        int[] iArr = this.f13395i;
        if (iArr == null) {
            return h.f13246e;
        }
        int i9 = hVar.f13249c;
        int i10 = hVar.f13248b;
        if (i9 == 2) {
            if (i10 != iArr.length) {
                z10 = true;
            } else {
                z10 = false;
            }
            for (int i11 = 0; i11 < iArr.length; i11++) {
                int i12 = iArr[i11];
                if (i12 < i10) {
                    if (i12 != i11) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    z10 |= z11;
                } else {
                    throw new i(hVar);
                }
            }
            if (z10) {
                return new h(hVar.f13247a, iArr.length, 2);
            }
            return h.f13246e;
        }
        throw new i(hVar);
    }

    @Override
    public final void g() {
        this.f13396j = this.f13395i;
    }

    @Override
    public final void i() {
        this.f13396j = null;
        this.f13395i = null;
    }
}
