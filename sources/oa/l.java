package oa;

import java.io.IOException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
public final class l extends ta.a {
    public static final k E = new k();
    public static final Object F = new Object();
    public Object[] A;
    public int B;
    public String[] C;
    public int[] D;

    @Override
    public final void C() {
        int b10 = m1.j.b(x());
        if (b10 != 1) {
            if (b10 != 9) {
                if (b10 != 3) {
                    if (b10 != 4) {
                        K();
                        int i9 = this.B;
                        if (i9 > 0) {
                            int[] iArr = this.D;
                            int i10 = i9 - 1;
                            iArr[i10] = iArr[i10] + 1;
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

    public final void F(int i9) {
        if (x() == i9) {
            return;
        }
        throw new IllegalStateException("Expected " + ta.b.k(i9) + " but was " + ta.b.k(x()) + H());
    }

    public final String G(boolean z10) {
        StringBuilder sb2 = new StringBuilder("$");
        int i9 = 0;
        while (true) {
            int i10 = this.B;
            if (i9 < i10) {
                Object[] objArr = this.A;
                Object obj = objArr[i9];
                if (obj instanceof la.h) {
                    i9++;
                    if (i9 < i10 && (objArr[i9] instanceof Iterator)) {
                        int i11 = this.D[i9];
                        if (z10 && i11 > 0 && (i9 == i10 - 1 || i9 == i10 - 2)) {
                            i11--;
                        }
                        sb2.append('[');
                        sb2.append(i11);
                        sb2.append(']');
                    }
                } else if ((obj instanceof la.l) && (i9 = i9 + 1) < i10 && (objArr[i9] instanceof Iterator)) {
                    sb2.append('.');
                    String str = this.C[i9];
                    if (str != null) {
                        sb2.append(str);
                    }
                }
                i9++;
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
        String[] strArr = this.C;
        int i9 = this.B - 1;
        if (z10) {
            str = "<skipped>";
        } else {
            str = str2;
        }
        strArr[i9] = str;
        L(entry.getValue());
        return str2;
    }

    public final Object J() {
        return this.A[this.B - 1];
    }

    public final Object K() {
        Object[] objArr = this.A;
        int i9 = this.B - 1;
        this.B = i9;
        Object obj = objArr[i9];
        objArr[i9] = null;
        return obj;
    }

    public final void L(Object obj) {
        int i9 = this.B;
        Object[] objArr = this.A;
        if (i9 == objArr.length) {
            int i10 = i9 * 2;
            this.A = Arrays.copyOf(objArr, i10);
            this.D = Arrays.copyOf(this.D, i10);
            this.C = (String[]) Arrays.copyOf(this.C, i10);
        }
        Object[] objArr2 = this.A;
        int i11 = this.B;
        this.B = i11 + 1;
        objArr2[i11] = obj;
    }

    @Override
    public final void a() {
        F(1);
        L(((la.h) J()).f16725a.iterator());
        this.D[this.B - 1] = 0;
    }

    @Override
    public final void b() {
        F(3);
        L(((na.k) ((la.l) J()).f16727a.entrySet()).iterator());
    }

    @Override
    public final void close() {
        this.A = new Object[]{F};
        this.B = 1;
    }

    @Override
    public final void e() {
        F(2);
        K();
        K();
        int i9 = this.B;
        if (i9 > 0) {
            int[] iArr = this.D;
            int i10 = i9 - 1;
            iArr[i10] = iArr[i10] + 1;
        }
    }

    @Override
    public final void f() {
        F(4);
        this.C[this.B - 1] = null;
        K();
        K();
        int i9 = this.B;
        if (i9 > 0) {
            int[] iArr = this.D;
            int i10 = i9 - 1;
            iArr[i10] = iArr[i10] + 1;
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
        boolean p6 = ((la.m) K()).p();
        int i9 = this.B;
        if (i9 > 0) {
            int[] iArr = this.D;
            int i10 = i9 - 1;
            iArr[i10] = iArr[i10] + 1;
        }
        return p6;
    }

    @Override
    public final double o() {
        int x10 = x();
        if (x10 != 7 && x10 != 6) {
            throw new IllegalStateException("Expected " + ta.b.k(7) + " but was " + ta.b.k(x10) + H());
        }
        double q10 = ((la.m) J()).q();
        if (!Double.isNaN(q10) && !Double.isInfinite(q10)) {
            K();
            int i9 = this.B;
            if (i9 > 0) {
                int[] iArr = this.D;
                int i10 = i9 - 1;
                iArr[i10] = iArr[i10] + 1;
            }
            return q10;
        }
        throw new IOException("JSON forbids NaN and infinities: " + q10);
    }

    @Override
    public final int p() {
        int parseInt;
        int x10 = x();
        if (x10 != 7 && x10 != 6) {
            throw new IllegalStateException("Expected " + ta.b.k(7) + " but was " + ta.b.k(x10) + H());
        }
        la.m mVar = (la.m) J();
        if (mVar.f16728a instanceof Number) {
            parseInt = mVar.r().intValue();
        } else {
            parseInt = Integer.parseInt(mVar.n());
        }
        K();
        int i9 = this.B;
        if (i9 > 0) {
            int[] iArr = this.D;
            int i10 = i9 - 1;
            iArr[i10] = iArr[i10] + 1;
        }
        return parseInt;
    }

    @Override
    public final long q() {
        long parseLong;
        int x10 = x();
        if (x10 != 7 && x10 != 6) {
            throw new IllegalStateException("Expected " + ta.b.k(7) + " but was " + ta.b.k(x10) + H());
        }
        la.m mVar = (la.m) J();
        if (mVar.f16728a instanceof Number) {
            parseLong = mVar.r().longValue();
        } else {
            parseLong = Long.parseLong(mVar.n());
        }
        K();
        int i9 = this.B;
        if (i9 > 0) {
            int[] iArr = this.D;
            int i10 = i9 - 1;
            iArr[i10] = iArr[i10] + 1;
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
        int i9 = this.B;
        if (i9 > 0) {
            int[] iArr = this.D;
            int i10 = i9 - 1;
            iArr[i10] = iArr[i10] + 1;
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
            throw new IllegalStateException("Expected " + ta.b.k(6) + " but was " + ta.b.k(x10) + H());
        }
        String n10 = ((la.m) K()).n();
        int i9 = this.B;
        if (i9 > 0) {
            int[] iArr = this.D;
            int i10 = i9 - 1;
            iArr[i10] = iArr[i10] + 1;
        }
        return n10;
    }

    @Override
    public final int x() {
        if (this.B == 0) {
            return 10;
        }
        Object J = J();
        if (J instanceof Iterator) {
            boolean z10 = this.A[this.B - 2] instanceof la.l;
            Iterator it = (Iterator) J;
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
        } else if (J instanceof la.l) {
            return 3;
        } else {
            if (J instanceof la.h) {
                return 1;
            }
            if (J instanceof la.m) {
                Serializable serializable = ((la.m) J).f16728a;
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
            } else if (J instanceof la.k) {
                return 9;
            } else {
                if (J == F) {
                    throw new IllegalStateException("JsonReader is closed");
                }
                throw new IOException("Custom JsonElement subclass " + J.getClass().getName() + " is not supported");
            }
        }
    }
}
