package m2;

import java.nio.ByteBuffer;
public final class a1 extends e2.n {
    public static final int f18816i = Float.floatToIntBits(Float.NaN);

    public static void m(int i3, ByteBuffer byteBuffer) {
        int floatToIntBits = Float.floatToIntBits((float) (i3 * 4.656612875245797E-10d));
        if (floatToIntBits == f18816i) {
            floatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(floatToIntBits);
    }

    @Override
    public final void c(ByteBuffer byteBuffer) {
        ByteBuffer l10;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i3 = limit - position;
        int i10 = this.f9359b.f9355c;
        if (i10 != 2) {
            if (i10 != 1342177280) {
                if (i10 != 1610612736) {
                    if (i10 != 1879048192) {
                        if (i10 != 21) {
                            if (i10 == 22) {
                                l10 = l(i3);
                                while (position < limit) {
                                    m((byteBuffer.get(position) & 255) | ((byteBuffer.get(position + 1) & 255) << 8) | ((byteBuffer.get(position + 2) & 255) << 16) | ((byteBuffer.get(position + 3) & 255) << 24), l10);
                                    position += 4;
                                }
                            } else {
                                throw new IllegalStateException();
                            }
                        } else {
                            l10 = l((i3 / 3) * 4);
                            while (position < limit) {
                                m(((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position + 2) & 255) << 24), l10);
                                position += 3;
                            }
                        }
                    } else {
                        l10 = l(i3 / 2);
                        while (position < limit) {
                            l10.putFloat((float) byteBuffer.getDouble(position));
                            position += 8;
                        }
                    }
                } else {
                    l10 = l(i3);
                    while (position < limit) {
                        m((byteBuffer.get(position + 3) & 255) | ((byteBuffer.get(position + 2) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position) & 255) << 24), l10);
                        position += 4;
                    }
                }
            } else {
                l10 = l((i3 / 3) * 4);
                while (position < limit) {
                    m(((byteBuffer.get(position + 2) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position) & 255) << 24), l10);
                    position += 3;
                }
            }
        } else {
            l10 = l(i3 * 2);
            while (position < limit) {
                m(((byteBuffer.get(position) & 255) << 16) | ((byteBuffer.get(position + 1) & 255) << 24), l10);
                position += 2;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        l10.flip();
    }

    @Override
    public final e2.j h(e2.j jVar) {
        int i3 = jVar.f9355c;
        if (!g2.n0.L(i3) && i3 != 2) {
            throw new e2.l(jVar);
        }
        if (i3 != 4) {
            return new e2.j(jVar.f9353a, jVar.f9354b, 4);
        }
        return e2.j.f9352e;
    }
}
