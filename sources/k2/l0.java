package k2;

import java.nio.ByteBuffer;
public final class l0 extends c2.i {
    public static final int f14622i = Float.floatToIntBits(Float.NaN);

    public static void k(int i10, ByteBuffer byteBuffer) {
        int floatToIntBits = Float.floatToIntBits((float) (i10 * 4.656612875245797E-10d));
        if (floatToIntBits == f14622i) {
            floatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(floatToIntBits);
    }

    @Override
    public final void c(ByteBuffer byteBuffer) {
        ByteBuffer j3;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i10 = limit - position;
        int i11 = this.f4157b.f4155c;
        if (i11 != 21) {
            if (i11 != 22) {
                if (i11 != 1342177280) {
                    if (i11 == 1610612736) {
                        j3 = j(i10);
                        while (position < limit) {
                            k((byteBuffer.get(position + 3) & 255) | ((byteBuffer.get(position + 2) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position) & 255) << 24), j3);
                            position += 4;
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    j3 = j((i10 / 3) * 4);
                    while (position < limit) {
                        k(((byteBuffer.get(position + 2) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position) & 255) << 24), j3);
                        position += 3;
                    }
                }
            } else {
                j3 = j(i10);
                while (position < limit) {
                    k((byteBuffer.get(position) & 255) | ((byteBuffer.get(position + 1) & 255) << 8) | ((byteBuffer.get(position + 2) & 255) << 16) | ((byteBuffer.get(position + 3) & 255) << 24), j3);
                    position += 4;
                }
            }
        } else {
            j3 = j((i10 / 3) * 4);
            while (position < limit) {
                k(((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position + 2) & 255) << 24), j3);
                position += 3;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        j3.flip();
    }

    @Override
    public final c2.f f(c2.f fVar) {
        int i10 = fVar.f4155c;
        if (i10 != 21 && i10 != 1342177280 && i10 != 22 && i10 != 1610612736 && i10 != 4) {
            throw new c2.g(fVar);
        }
        if (i10 != 4) {
            return new c2.f(fVar.f4153a, fVar.f4154b, 4);
        }
        return c2.f.f4152e;
    }
}
