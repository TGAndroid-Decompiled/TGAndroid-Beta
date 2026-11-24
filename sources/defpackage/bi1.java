package defpackage;

import java.util.ArrayList;
public final class bi1 implements rq4 {
    public final sw2 a;
    public final int b;
    public final o01 c;
    public final byte d;
    public final Object e;

    public bi1(Object obj, sw2 sw2Var, int i, o01 o01Var, byte b) {
        this.d = b;
        this.a = sw2Var;
        this.b = i;
        this.c = o01Var;
        this.e = obj;
    }

    @Override
    public final hk4 C(int i, o01 o01Var) {
        o01 o01Var2;
        sw2 sw2Var = this.a;
        sw2Var.getClass();
        o01 o01Var3 = o01.a;
        o01 o01Var4 = this.c;
        int i2 = this.b;
        if (o01Var != o01Var3) {
            o01Var2 = o01Var;
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
            o01Var2 = o01Var4;
        }
        if (sw2Var.equals(sw2Var) && i == i2 && o01Var2 == o01Var4) {
            return this;
        }
        byte b = this.d;
        Object obj = this.e;
        switch (b) {
            case 0:
                return new bi1((h73) obj, sw2Var, i, o01Var2, (byte) 0);
            default:
                return new bi1((hk4) obj, sw2Var, i, o01Var2, (byte) 1);
        }
    }

    public final Object a(ik4 ik4Var, fw2 fw2Var) {
        Object b = h9e.b(new zh1(ik4Var, this, null, (byte) 0), fw2Var);
        if (b == bx2.a) {
            return b;
        }
        return g5c.a;
    }

    public final String b() {
        ArrayList arrayList = new ArrayList(4);
        z14 z14Var = z14.a;
        sw2 sw2Var = this.a;
        if (sw2Var != z14Var) {
            arrayList.add("context=" + sw2Var);
        }
        int i = this.b;
        if (i != -3) {
            arrayList.add("capacity=" + i);
        }
        o01 o01Var = o01.a;
        o01 o01Var2 = this.c;
        if (o01Var2 != o01Var) {
            arrayList.add("onBufferOverflow=" + o01Var2);
        }
        return getClass().getSimpleName() + '[' + yk2.f(arrayList, ", ", null, null, null, 62) + ']';
    }

    @Override
    public final Object h(ik4 ik4Var, fw2 fw2Var) {
        Object a;
        sw2 a2;
        switch (this.d) {
            case 1:
                int i = this.b;
                bx2 bx2Var = bx2.a;
                g5c g5cVar = g5c.a;
                if (i == -3) {
                    sw2 context = fw2Var.getContext();
                    Boolean bool = Boolean.FALSE;
                    dm2 dm2Var = new dm2((byte) 2);
                    sw2 sw2Var = this.a;
                    if (!((Boolean) sw2Var.fold(bool, dm2Var)).booleanValue()) {
                        a2 = context.plus(sw2Var);
                    } else {
                        a2 = qzd.a(context, sw2Var, false);
                    }
                    if (rp5.a(a2, context)) {
                        a = ((hk4) this.e).h(ik4Var, fw2Var);
                        if (a != bx2Var) {
                            a = g5cVar;
                        }
                        if (a != bx2Var) {
                            return g5cVar;
                        }
                    } else {
                        vi2 vi2Var = vi2.b;
                        if (rp5.a(a2.get(vi2Var), context.get(vi2Var))) {
                            sw2 context2 = fw2Var.getContext();
                            if (!(ik4Var instanceof l4a)) {
                                ik4Var = new uk4(ik4Var, context2);
                            }
                            a = tqd.a(a2, ik4Var, edd.b(a2), new ai1(this, null, (byte) 1), fw2Var);
                            if (a != bx2Var) {
                                return g5cVar;
                            }
                        }
                    }
                    return a;
                }
                a = a(ik4Var, fw2Var);
                if (a != bx2Var) {
                    return g5cVar;
                }
                return a;
            default:
                return a(ik4Var, fw2Var);
        }
    }

    public final String toString() {
        byte b = this.d;
        Object obj = this.e;
        switch (b) {
            case 0:
                return "block[" + ((h73) obj) + "] -> " + b();
            default:
                return ((hk4) obj) + " -> " + b();
        }
    }
}
