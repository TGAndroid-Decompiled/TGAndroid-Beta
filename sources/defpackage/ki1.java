package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public final class ki1 extends ef0 {
    public lo5 i;
    public lo5 j;

    @Override
    public final void d(ByteBuffer byteBuffer) {
        int i;
        boolean z;
        int i2;
        int i3;
        lo5 lo5Var = this.j;
        lo5Var.getClass();
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer l = l(((limit - position) / this.b.d) * this.c.d);
        while (position < limit) {
            for (int i4 = 0; i4 < lo5Var.b; i4++) {
                int u = (gcc.u(this.b.c) * lo5Var.b(i4)) + position;
                int i5 = this.b.c;
                if (i5 != 2) {
                    if (i5 != 3) {
                        if (i5 != 4) {
                            if (i5 != 21) {
                                if (i5 != 22) {
                                    if (i5 != 268435456) {
                                        if (i5 != 1342177280) {
                                            if (i5 != 1610612736) {
                                                if (i5 != 1879048192) {
                                                    if (i5 != 1895825408) {
                                                        if (i5 != 1912602624) {
                                                            p3d.e(this.b.c, "Unexpected encoding: ");
                                                            return;
                                                        }
                                                    }
                                                }
                                                l.putDouble(byteBuffer.getDouble(u));
                                            }
                                        }
                                    }
                                }
                                l.putInt(byteBuffer.getInt(u));
                            }
                            ByteOrder order = byteBuffer.order();
                            ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
                            if (order == byteOrder) {
                                i = u;
                            } else {
                                i = u + 2;
                            }
                            byte b = byteBuffer.get(i);
                            byte b2 = byteBuffer.get(u + 1);
                            if (byteBuffer.order() == byteOrder) {
                                u += 2;
                            }
                            int i6 = ((((b << 24) & (-16777216)) | ((b2 << 16) & 16711680)) | ((byteBuffer.get(u) << 8) & 65280)) >> 8;
                            boolean z2 = true;
                            if (((-16777216) & i6) != 0 && (i6 & (-8388608)) != -8388608) {
                                z = false;
                            } else {
                                z = true;
                            }
                            yve.h(z, "Value out of range of 24-bit integer: %s", Integer.toHexString(i6));
                            if (l.remaining() < 3) {
                                z2 = false;
                            }
                            yve.f(z2);
                            if (l.order() == byteOrder) {
                                i2 = (i6 & 16711680) >> 16;
                            } else {
                                i2 = i6 & 255;
                            }
                            byte b3 = (byte) i2;
                            byte b4 = (byte) ((65280 & i6) >> 8);
                            if (l.order() == byteOrder) {
                                i3 = i6 & 255;
                            } else {
                                i3 = (i6 & 16711680) >> 16;
                            }
                            l.put(b3).put(b4).put((byte) i3);
                        }
                        l.putFloat(byteBuffer.getFloat(u));
                    } else {
                        l.put(byteBuffer.get(u));
                    }
                }
                l.putShort(byteBuffer.getShort(u));
            }
            position += this.b.d;
        }
        byteBuffer.position(limit);
        l.flip();
    }

    @Override
    public final m20 h(m20 m20Var) {
        boolean z;
        boolean z2;
        int i = m20Var.c;
        lo5 lo5Var = this.i;
        if (lo5Var == null) {
            return m20.e;
        }
        int i2 = m20Var.b;
        if (gcc.N(i)) {
            int i3 = lo5Var.b;
            if (i2 != i3) {
                z = true;
            } else {
                z = false;
            }
            for (int i4 = 0; i4 < i3; i4++) {
                int b = lo5Var.b(i4);
                if (b < i2) {
                    if (b != i4) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    z |= z2;
                } else {
                    throw new p20("Channel map (" + lo5Var + ") trying to access non-existent input channel.", m20Var);
                }
            }
            if (z) {
                return new m20(m20Var.a, i3, i);
            }
            return m20.e;
        }
        throw new p20(m20Var);
    }

    @Override
    public final void i() {
        this.j = this.i;
    }

    @Override
    public final void k() {
        this.j = null;
        this.i = null;
    }
}
