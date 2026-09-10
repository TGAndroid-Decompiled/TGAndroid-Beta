package gb;

import java.io.IOException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
public final class l extends lb.a {
    public static final k I = new k();
    public static final Object J = new Object();
    public Object[] E;
    public int F;
    public String[] G;
    public int[] H;

    @Override
    public final void C() {
        int c10 = m1.j.c(x());
        if (c10 != 1) {
            if (c10 != 9) {
                if (c10 != 3) {
                    if (c10 != 4) {
                        K();
                        int i10 = this.F;
                        if (i10 > 0) {
                            int[] iArr = this.H;
                            int i11 = i10 - 1;
                            iArr[i11] = iArr[i11] + 1;
                            return;
                        }
                        return;
                    }
                    I(true);
                    return;
                }
                f();
                return;
            }
            return;
        }
        e();
    }

    public final void F(int i10) {
        if (x() == i10) {
            return;
        }
        throw new IllegalStateException("Expected " + hc.b.E(i10) + " but was " + hc.b.E(x()) + H());
    }

    public final String G(boolean z10) {
        StringBuilder sb2 = new StringBuilder("$");
        int i10 = 0;
        while (true) {
            int i11 = this.F;
            if (i10 < i11) {
                Object[] objArr = this.E;
                Object obj = objArr[i10];
                if (obj instanceof db.h) {
                    i10++;
                    if (i10 < i11 && (objArr[i10] instanceof Iterator)) {
                        int i12 = this.H[i10];
                        if (z10 && i12 > 0 && (i10 == i11 - 1 || i10 == i11 - 2)) {
                            i12--;
                        }
                        sb2.append('[');
                        sb2.append(i12);
                        sb2.append(']');
                    }
                } else if ((obj instanceof db.l) && (i10 = i10 + 1) < i11 && (objArr[i10] instanceof Iterator)) {
                    sb2.append('.');
                    String str = this.G[i10];
                    if (str != null) {
                        sb2.append(str);
                    }
                }
                i10++;
            } else {
                return sb2.toString();
            }
        }
    }

    public final String H() {
        return " at path " + G(false);
    }

    public final String I(boolean z10) {
        String str;
        F(5);
        Map.Entry entry = (Map.Entry) ((Iterator) J()).next();
        String str2 = (String) entry.getKey();
        String[] strArr = this.G;
        int i10 = this.F - 1;
        if (z10) {
            str = "<skipped>";
        } else {
            str = str2;
        }
        strArr[i10] = str;
        L(entry.getValue());
        return str2;
    }

    public final Object J() {
        return this.E[this.F - 1];
    }

    public final Object K() {
        Object[] objArr = this.E;
        int i10 = this.F - 1;
        this.F = i10;
        Object obj = objArr[i10];
        objArr[i10] = null;
        return obj;
    }

    public final void L(Object obj) {
        int i10 = this.F;
        Object[] objArr = this.E;
        if (i10 == objArr.length) {
            int i11 = i10 * 2;
            this.E = Arrays.copyOf(objArr, i11);
            this.H = Arrays.copyOf(this.H, i11);
            this.G = (String[]) Arrays.copyOf(this.G, i11);
        }
        Object[] objArr2 = this.E;
        int i12 = this.F;
        this.F = i12 + 1;
        objArr2[i12] = obj;
    }

    @Override
    public final void a() {
        F(1);
        L(((db.h) J()).f6379a.iterator());
        this.H[this.F - 1] = 0;
    }

    @Override
    public final void b() {
        F(3);
        L(((fb.k) ((db.l) J()).f6381a.entrySet()).iterator());
    }

    @Override
    public final void close() {
        this.E = new Object[]{J};
        this.F = 1;
    }

    @Override
    public final void e() {
        F(2);
        K();
        K();
        int i10 = this.F;
        if (i10 > 0) {
            int[] iArr = this.H;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    @Override
    public final void f() {
        F(4);
        this.G[this.F - 1] = null;
        K();
        K();
        int i10 = this.F;
        if (i10 > 0) {
            int[] iArr = this.H;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    @Override
    public final String h() {
        return G(false);
    }

    @Override
    public final String j() {
        return G(true);
    }

    @Override
    public final boolean k() {
        int x10 = x();
        if (x10 != 4 && x10 != 2 && x10 != 10) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean n() {
        F(8);
        boolean p5 = ((db.m) K()).p();
        int i10 = this.F;
        if (i10 > 0) {
            int[] iArr = this.H;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return p5;
    }

    @Override
    public final double o() {
        int x10 = x();
        if (x10 != 7 && x10 != 6) {
            throw new IllegalStateException("Expected " + hc.b.E(7) + " but was " + hc.b.E(x10) + H());
        }
        double q6 = ((db.m) J()).q();
        if (!Double.isNaN(q6) && !Double.isInfinite(q6)) {
            K();
            int i10 = this.F;
            if (i10 > 0) {
                int[] iArr = this.H;
                int i11 = i10 - 1;
                iArr[i11] = iArr[i11] + 1;
            }
            return q6;
        }
        throw new IOException("JSON forbids NaN and infinities: " + q6);
    }

    @Override
    public final int p() {
        int parseInt;
        int x10 = x();
        if (x10 != 7 && x10 != 6) {
            throw new IllegalStateException("Expected " + hc.b.E(7) + " but was " + hc.b.E(x10) + H());
        }
        db.m mVar = (db.m) J();
        if (mVar.f6382a instanceof Number) {
            parseInt = mVar.r().intValue();
        } else {
            parseInt = Integer.parseInt(mVar.n());
        }
        K();
        int i10 = this.F;
        if (i10 > 0) {
            int[] iArr = this.H;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return parseInt;
    }

    @Override
    public final long q() {
        long parseLong;
        int x10 = x();
        if (x10 != 7 && x10 != 6) {
            throw new IllegalStateException("Expected " + hc.b.E(7) + " but was " + hc.b.E(x10) + H());
        }
        db.m mVar = (db.m) J();
        if (mVar.f6382a instanceof Number) {
            parseLong = mVar.r().longValue();
        } else {
            parseLong = Long.parseLong(mVar.n());
        }
        K();
        int i10 = this.F;
        if (i10 > 0) {
            int[] iArr = this.H;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return parseLong;
    }

    @Override
    public final String r() {
        return I(false);
    }

    @Override
    public final void t() {
        F(9);
        K();
        int i10 = this.F;
        if (i10 > 0) {
            int[] iArr = this.H;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    @Override
    public final String toString() {
        return l.class.getSimpleName() + H();
    }

    @Override
    public final String v() {
        int x10 = x();
        if (x10 != 6 && x10 != 7) {
            throw new IllegalStateException("Expected " + hc.b.E(6) + " but was " + hc.b.E(x10) + H());
        }
        String n10 = ((db.m) K()).n();
        int i10 = this.F;
        if (i10 > 0) {
            int[] iArr = this.H;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return n10;
    }

    @Override
    public final int x() {
        if (this.F == 0) {
            return 10;
        }
        Object J2 = J();
        if (J2 instanceof Iterator) {
            boolean z10 = this.E[this.F - 2] instanceof db.l;
            Iterator it = (Iterator) J2;
            if (it.hasNext()) {
                if (z10) {
                    return 5;
                }
                L(it.next());
                return x();
            } else if (!z10) {
                return 2;
            } else {
                return 4;
            }
        } else if (J2 instanceof db.l) {
            return 3;
        } else {
            if (J2 instanceof db.h) {
                return 1;
            }
            if (J2 instanceof db.m) {
                Serializable serializable = ((db.m) J2).f6382a;
                if (serializable instanceof String) {
                    return 6;
                }
                if (serializable instanceof Boolean) {
                    return 8;
                }
                if (serializable instanceof Number) {
                    return 7;
                }
                throw new AssertionError();
            } else if (J2 instanceof db.k) {
                return 9;
            } else {
                if (J2 == J) {
                    throw new IllegalStateException("JsonReader is closed");
                }
                throw new IOException("Custom JsonElement subclass " + J2.getClass().getName() + " is not supported");
            }
        }
    }
}
