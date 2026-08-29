package l3;

import java.nio.ByteBuffer;
public final class z extends y {
    public int[] f14254i;
    public int[] f14255j;

    @Override
    public final void b(ByteBuffer byteBuffer) {
        int[] iArr = this.f14255j;
        iArr.getClass();
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer j10 = j(((limit - position) / this.f14249b.d) * this.f14250c.d);
        while (position < limit) {
            for (int i10 : iArr) {
                j10.putShort(byteBuffer.getShort((i10 * 2) + position));
            }
            position += this.f14249b.d;
        }
        byteBuffer.position(limit);
        j10.flip();
    }

    @Override
    public final h f(h hVar) {
        boolean z10;
        boolean z11;
        int[] iArr = this.f14254i;
        if (iArr == null) {
            return h.f14098e;
        }
        int i10 = hVar.f14101c;
        int i11 = hVar.f14100b;
        if (i10 == 2) {
            if (i11 != iArr.length) {
                z10 = true;
            } else {
                z10 = false;
            }
            for (int i12 = 0; i12 < iArr.length; i12++) {
                int i13 = iArr[i12];
                if (i13 < i11) {
                    if (i13 != i12) {
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
                return new h(hVar.f14099a, iArr.length, 2);
            }
            return h.f14098e;
        }
        throw new i(hVar);
    }

    @Override
    public final void g() {
        this.f14255j = this.f14254i;
    }

    @Override
    public final void i() {
        this.f14255j = null;
        this.f14254i = null;
    }
}
