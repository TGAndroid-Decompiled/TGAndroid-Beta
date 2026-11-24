package defpackage;

import java.nio.ByteBuffer;
public final class bpb extends cf0 {
    public final byte i;

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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bpb.d(java.nio.ByteBuffer):void");
    }

    @Override
    public final l20 h(l20 l20Var) {
        switch (this.i) {
            case 0:
                int i = l20Var.c;
                if (g8c.N(i)) {
                    if (i != 4) {
                        return new l20(l20Var.a, l20Var.b, 4);
                    }
                    return l20.e;
                }
                throw new o20(l20Var);
            default:
                int i2 = l20Var.c;
                if (g8c.N(i2)) {
                    if (i2 != 2) {
                        return new l20(l20Var.a, l20Var.b, 2);
                    }
                    return l20.e;
                }
                throw new o20(l20Var);
        }
    }
}
