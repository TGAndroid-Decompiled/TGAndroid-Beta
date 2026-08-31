package l3;

import java.nio.ByteBuffer;
public final class b0 extends a0 {
    public int[] f11492i;
    public int[] f11493j;

    @Override
    public final void b(ByteBuffer byteBuffer) {
        int[] iArr = this.f11493j;
        iArr.getClass();
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer j10 = j(((limit - position) / this.f11487b.d) * this.f11488c.d);
        while (position < limit) {
            for (int i10 : iArr) {
                j10.putShort(byteBuffer.getShort((i10 * 2) + position));
            }
            position += this.f11487b.d;
        }
        byteBuffer.position(limit);
        j10.flip();
    }

    @Override
    public final l f(l lVar) {
        boolean z4;
        boolean z10;
        int[] iArr = this.f11492i;
        if (iArr == null) {
            return l.f11559e;
        }
        int i10 = lVar.f11562c;
        int i11 = lVar.f11561b;
        if (i10 == 2) {
            if (i11 != iArr.length) {
                z4 = true;
            } else {
                z4 = false;
            }
            for (int i12 = 0; i12 < iArr.length; i12++) {
                int i13 = iArr[i12];
                if (i13 < i11) {
                    if (i13 != i12) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    z4 |= z10;
                } else {
                    throw new m(lVar);
                }
            }
            if (z4) {
                return new l(lVar.f11560a, iArr.length, 2);
            }
            return l.f11559e;
        }
        throw new m(lVar);
    }

    @Override
    public final void g() {
        this.f11493j = this.f11492i;
    }

    @Override
    public final void i() {
        this.f11493j = null;
        this.f11492i = null;
    }
}
