package k2;

import java.nio.ByteBuffer;
public final class c1 extends c2.o {
    public static final int f14703i = Float.floatToIntBits(Float.NaN);

    public static void m(int i10, ByteBuffer byteBuffer) {
        int floatToIntBits = Float.floatToIntBits((float) (i10 * 4.656612875245797E-10d));
        if (floatToIntBits == f14703i) {
            floatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(floatToIntBits);
    }

    @Override
    public final void c(ByteBuffer byteBuffer) {
        ByteBuffer l4;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i10 = limit - position;
        int i11 = this.f4523b.f4519c;
        if (i11 != 2) {
            if (i11 != 1342177280) {
                if (i11 != 1610612736) {
                    if (i11 != 1879048192) {
                        if (i11 != 21) {
                            if (i11 == 22) {
                                l4 = l(i10);
                                while (position < limit) {
                                    m((byteBuffer.get(position) & 255) | ((byteBuffer.get(position + 1) & 255) << 8) | ((byteBuffer.get(position + 2) & 255) << 16) | ((byteBuffer.get(position + 3) & 255) << 24), l4);
                                    position += 4;
                                }
                            } else {
                                throw new IllegalStateException();
                            }
                        } else {
                            l4 = l((i10 / 3) * 4);
                            while (position < limit) {
                                m(((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position + 2) & 255) << 24), l4);
                                position += 3;
                            }
                        }
                    } else {
                        l4 = l(i10 / 2);
                        while (position < limit) {
                            l4.putFloat((float) byteBuffer.getDouble(position));
                            position += 8;
                        }
                    }
                } else {
                    l4 = l(i10);
                    while (position < limit) {
                        m((byteBuffer.get(position + 3) & 255) | ((byteBuffer.get(position + 2) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position) & 255) << 24), l4);
                        position += 4;
                    }
                }
            } else {
                l4 = l((i10 / 3) * 4);
                while (position < limit) {
                    m(((byteBuffer.get(position + 2) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position) & 255) << 24), l4);
                    position += 3;
                }
            }
        } else {
            l4 = l(i10 * 2);
            while (position < limit) {
                m(((byteBuffer.get(position) & 255) << 16) | ((byteBuffer.get(position + 1) & 255) << 24), l4);
                position += 2;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        l4.flip();
    }

    @Override
    public final c2.k h(c2.k kVar) {
        int i10 = kVar.f4519c;
        if (!e2.m0.L(i10) && i10 != 2) {
            throw new c2.m(kVar);
        }
        if (i10 != 4) {
            return new c2.k(kVar.f4517a, kVar.f4518b, 4);
        }
        return c2.k.e;
    }
}
