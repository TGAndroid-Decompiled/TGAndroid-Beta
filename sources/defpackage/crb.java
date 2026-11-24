package defpackage;

import java.nio.ByteBuffer;
public final class crb extends cg0 {
    public final byte i;

    public crb(byte b) {
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.crb.d(java.nio.ByteBuffer):void");
    }

    @Override
    public final l30 h(l30 l30Var) {
        switch (this.i) {
            case 0:
                int i = l30Var.c;
                if (hac.N(i)) {
                    if (i != 4) {
                        return new l30(l30Var.a, l30Var.b, 4);
                    }
                    return l30.e;
                }
                throw new o30(l30Var);
            default:
                int i2 = l30Var.c;
                if (hac.N(i2)) {
                    if (i2 != 2) {
                        return new l30(l30Var.a, l30Var.b, 2);
                    }
                    return l30.e;
                }
                throw new o30(l30Var);
        }
    }
}
