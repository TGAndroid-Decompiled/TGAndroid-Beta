package n2;

import java.nio.ByteBuffer;
public final class z0 extends f2.o {
    public static final int f21322i = Float.floatToIntBits(Float.NaN);

    public static void m(int i7, ByteBuffer byteBuffer) {
        int floatToIntBits = Float.floatToIntBits((float) (i7 * 4.656612875245797E-10d));
        if (floatToIntBits == f21322i) {
            floatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(floatToIntBits);
    }

    @Override
    public final void c(ByteBuffer byteBuffer) {
        ByteBuffer l10;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i7 = limit - position;
        int i10 = this.f11087b.f11083c;
        if (i10 != 2) {
            if (i10 != 1342177280) {
                if (i10 != 1610612736) {
                    if (i10 != 1879048192) {
                        if (i10 != 21) {
                            if (i10 == 22) {
                                l10 = l(i7);
                                while (position < limit) {
                                    m((byteBuffer.get(position) & 255) | ((byteBuffer.get(position + 1) & 255) << 8) | ((byteBuffer.get(position + 2) & 255) << 16) | ((byteBuffer.get(position + 3) & 255) << 24), l10);
                                    position += 4;
                                }
                            } else {
                                throw new IllegalStateException();
                            }
                        } else {
                            l10 = l((i7 / 3) * 4);
                            while (position < limit) {
                                m(((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position + 2) & 255) << 24), l10);
                                position += 3;
                            }
                        }
                    } else {
                        l10 = l(i7 / 2);
                        while (position < limit) {
                            l10.putFloat((float) byteBuffer.getDouble(position));
                            position += 8;
                        }
                    }
                } else {
                    l10 = l(i7);
                    while (position < limit) {
                        m((byteBuffer.get(position + 3) & 255) | ((byteBuffer.get(position + 2) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position) & 255) << 24), l10);
                        position += 4;
                    }
                }
            } else {
                l10 = l((i7 / 3) * 4);
                while (position < limit) {
                    m(((byteBuffer.get(position + 2) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position) & 255) << 24), l10);
                    position += 3;
                }
            }
        } else {
            l10 = l(i7 * 2);
            while (position < limit) {
                m(((byteBuffer.get(position) & 255) << 16) | ((byteBuffer.get(position + 1) & 255) << 24), l10);
                position += 2;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        l10.flip();
    }

    @Override
    public final f2.k h(f2.k kVar) {
        int i7 = kVar.f11083c;
        if (!h2.l0.L(i7) && i7 != 2) {
            throw new f2.m(kVar);
        }
        if (i7 != 4) {
            return new f2.k(kVar.f11081a, kVar.f11082b, 4);
        }
        return f2.k.f11080e;
    }
}
