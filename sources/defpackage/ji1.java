package defpackage;

import java.util.ArrayList;
public final class ji1 implements vs4 {
    public final mx2 a;
    public final int b;
    public final x01 c;
    public final byte d;
    public final Object e;

    public ji1(Object obj, mx2 mx2Var, int i, x01 x01Var, byte b) {
        this.d = b;
        this.a = mx2Var;
        this.b = i;
        this.c = x01Var;
        this.e = obj;
    }

    @Override
    public final mm4 D(int i, x01 x01Var) {
        x01 x01Var2;
        mx2 mx2Var = this.a;
        mx2Var.getClass();
        x01 x01Var3 = x01.a;
        x01 x01Var4 = this.c;
        int i2 = this.b;
        if (x01Var != x01Var3) {
            x01Var2 = x01Var;
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
            x01Var2 = x01Var4;
        }
        if (mx2Var.equals(mx2Var) && i == i2 && x01Var2 == x01Var4) {
            return this;
        }
        byte b = this.d;
        Object obj = this.e;
        switch (b) {
            case 0:
                return new ji1((a83) obj, mx2Var, i, x01Var2, (byte) 0);
            default:
                return new ji1((mm4) obj, mx2Var, i, x01Var2, (byte) 1);
        }
    }

    public final Object a(nm4 nm4Var, zw2 zw2Var) {
        Object b = xde.b(new hi1(nm4Var, this, null, (byte) 0), zw2Var);
        if (b == vx2.a) {
            return b;
        }
        return f9c.a;
    }

    public final String b() {
        ArrayList arrayList = new ArrayList(4);
        u24 u24Var = u24.a;
        mx2 mx2Var = this.a;
        if (mx2Var != u24Var) {
            arrayList.add("context=" + mx2Var);
        }
        int i = this.b;
        if (i != -3) {
            arrayList.add("capacity=" + i);
        }
        x01 x01Var = x01.a;
        x01 x01Var2 = this.c;
        if (x01Var2 != x01Var) {
            arrayList.add("onBufferOverflow=" + x01Var2);
        }
        return getClass().getSimpleName() + '[' + sl2.f(arrayList, ", ", null, null, null, 62) + ']';
    }

    @Override
    public final Object k(nm4 nm4Var, zw2 zw2Var) {
        Object a;
        mx2 a2;
        switch (this.d) {
            case 1:
                int i = this.b;
                vx2 vx2Var = vx2.a;
                f9c f9cVar = f9c.a;
                if (i == -3) {
                    mx2 context = zw2Var.getContext();
                    Boolean bool = Boolean.FALSE;
                    xm2 xm2Var = new xm2((byte) 2);
                    mx2 mx2Var = this.a;
                    if (!((Boolean) mx2Var.fold(bool, xm2Var)).booleanValue()) {
                        a2 = context.plus(mx2Var);
                    } else {
                        a2 = g4e.a(context, mx2Var, false);
                    }
                    if (ur5.a(a2, context)) {
                        a = ((mm4) this.e).k(nm4Var, zw2Var);
                        if (a != vx2Var) {
                            a = f9cVar;
                        }
                        if (a != vx2Var) {
                            return f9cVar;
                        }
                    } else {
                        rj2 rj2Var = rj2.b;
                        if (ur5.a(a2.get(rj2Var), context.get(rj2Var))) {
                            mx2 context2 = zw2Var.getContext();
                            if (!(nm4Var instanceof d8a)) {
                                nm4Var = new an4(nm4Var, context2);
                            }
                            a = jvd.a(a2, nm4Var, xhd.b(a2), new ii1(this, null, (byte) 1), zw2Var);
                            if (a != vx2Var) {
                                return f9cVar;
                            }
                        }
                    }
                    return a;
                }
                a = a(nm4Var, zw2Var);
                if (a != vx2Var) {
                    return f9cVar;
                }
                return a;
            default:
                return a(nm4Var, zw2Var);
        }
    }

    public final String toString() {
        byte b = this.d;
        Object obj = this.e;
        switch (b) {
            case 0:
                return "block[" + ((a83) obj) + "] -> " + b();
            default:
                return ((mm4) obj) + " -> " + b();
        }
    }
}
