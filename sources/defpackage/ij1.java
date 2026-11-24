package defpackage;

import java.util.ArrayList;
public final class ij1 implements ss4 {
    public final cy2 a;
    public final int b;
    public final w11 c;
    public final byte d;
    public final Object e;

    public ij1(Object obj, cy2 cy2Var, int i, w11 w11Var, byte b) {
        this.d = b;
        this.a = cy2Var;
        this.b = i;
        this.c = w11Var;
        this.e = obj;
    }

    @Override
    public final im4 D(int i, w11 w11Var) {
        w11 w11Var2;
        cy2 cy2Var = this.a;
        cy2Var.getClass();
        w11 w11Var3 = w11.a;
        w11 w11Var4 = this.c;
        int i2 = this.b;
        if (w11Var != w11Var3) {
            w11Var2 = w11Var;
        } else {
            if (i2 != -3) {
                if (i != -3) {
                    if (i2 != -2) {
                        if (i != -2) {
                            i += i2;
                            if (i < 0) {
                                i = Integer.MAX_VALUE;
                            }
                        }
                    }
                }
                i = i2;
            }
            w11Var2 = w11Var4;
        }
        if (cy2Var.equals(cy2Var) && i == i2 && w11Var2 == w11Var4) {
            return this;
        }
        byte b = this.d;
        Object obj = this.e;
        switch (b) {
            case 0:
                return new ij1((t83) obj, cy2Var, i, w11Var2, (byte) 0);
            default:
                return new ij1((im4) obj, cy2Var, i, w11Var2, (byte) 1);
        }
    }

    public final Object a(jm4 jm4Var, px2 px2Var) {
        Object b = ibe.b(new gj1(jm4Var, this, null, (byte) 0), px2Var);
        if (b == ly2.a) {
            return b;
        }
        return g7c.a;
    }

    public final String b() {
        ArrayList arrayList = new ArrayList(4);
        k34 k34Var = k34.a;
        cy2 cy2Var = this.a;
        if (cy2Var != k34Var) {
            arrayList.add("context=" + cy2Var);
        }
        int i = this.b;
        if (i != -3) {
            arrayList.add("capacity=" + i);
        }
        w11 w11Var = w11.a;
        w11 w11Var2 = this.c;
        if (w11Var2 != w11Var) {
            arrayList.add("onBufferOverflow=" + w11Var2);
        }
        return getClass().getSimpleName() + '[' + km2.f(arrayList, ", ", null, null, null, 62) + ']';
    }

    @Override
    public final Object g(jm4 jm4Var, px2 px2Var) {
        Object a;
        cy2 a2;
        switch (this.d) {
            case 1:
                int i = this.b;
                ly2 ly2Var = ly2.a;
                g7c g7cVar = g7c.a;
                if (i == -3) {
                    cy2 context = px2Var.getContext();
                    Boolean bool = Boolean.FALSE;
                    qn2 qn2Var = new qn2((byte) 2);
                    cy2 cy2Var = this.a;
                    if (!((Boolean) cy2Var.fold(bool, qn2Var)).booleanValue()) {
                        a2 = context.plus(cy2Var);
                    } else {
                        a2 = t1e.a(context, cy2Var, false);
                    }
                    if (rr5.a(a2, context)) {
                        a = ((im4) this.e).g(jm4Var, px2Var);
                        if (a != ly2Var) {
                            a = g7cVar;
                        }
                        if (a != ly2Var) {
                            return g7cVar;
                        }
                    } else {
                        jk2 jk2Var = jk2.b;
                        if (rr5.a(a2.get(jk2Var), context.get(jk2Var))) {
                            cy2 context2 = px2Var.getContext();
                            if (!(jm4Var instanceof n6a)) {
                                jm4Var = new um4(jm4Var, context2);
                            }
                            a = wsd.a(a2, jm4Var, gfd.b(a2), new hj1(this, null, (byte) 1), px2Var);
                            if (a != ly2Var) {
                                return g7cVar;
                            }
                        }
                    }
                    return a;
                }
                a = a(jm4Var, px2Var);
                if (a != ly2Var) {
                    return g7cVar;
                }
                return a;
            default:
                return a(jm4Var, px2Var);
        }
    }

    public final String toString() {
        byte b = this.d;
        Object obj = this.e;
        switch (b) {
            case 0:
                return "block[" + ((t83) obj) + "] -> " + b();
            default:
                return ((im4) obj) + " -> " + b();
        }
    }
}
