package defpackage;

import java.nio.ByteBuffer;
public final class btb extends ef0 {
    public final byte i;

    public btb(byte b) {
        this.i = b;
    }

    public static void m(int i, ByteBuffer byteBuffer) {
        int floatToIntBits;
        float f = (float) (i * 4.656612875245797E-10d);
        if (Float.isNaN(f)) {
            floatToIntBits = 0;
        } else {
            floatToIntBits = Float.floatToIntBits(f);
        }
        byteBuffer.putInt(floatToIntBits);
    }

    @Override
    public final void d(java.nio.ByteBuffer r19) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.btb.d(java.nio.ByteBuffer):void");
    }

    @Override
    public final m20 h(m20 m20Var) {
        switch (this.i) {
            case 0:
                int i = m20Var.c;
                if (gcc.N(i)) {
                    if (i != 4) {
                        return new m20(m20Var.a, m20Var.b, 4);
                    }
                    return m20.e;
                }
                throw new p20(m20Var);
            default:
                int i2 = m20Var.c;
                if (gcc.N(i2)) {
                    if (i2 != 2) {
                        return new m20(m20Var.a, m20Var.b, 2);
                    }
                    return m20.e;
                }
                throw new p20(m20Var);
        }
    }
}
