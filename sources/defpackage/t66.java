package defpackage;

import java.util.List;
public final class t66 implements o8a {
    public final o8a a;
    public final o8a b;

    public t66(o8a o8aVar, o8a o8aVar2) {
        o8aVar.getClass();
        o8aVar2.getClass();
        this.a = o8aVar;
        this.b = o8aVar2;
    }

    @Override
    public final String a() {
        return "kotlin.collections.LinkedHashMap";
    }

    @Override
    public final boolean c() {
        return false;
    }

    @Override
    public final int d(String str) {
        str.getClass();
        Integer b = kdb.b(str);
        if (b != null) {
            return b.intValue();
        }
        lq5.j(str.concat(" is not a valid map index"));
        return 0;
    }

    @Override
    public final nye e() {
        return tdb.d;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof t66) {
                t66 t66Var = (t66) obj;
                if (!ur5.a(this.a, t66Var.a) || !ur5.a(this.b, t66Var.b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override
    public final int f() {
        return 2;
    }

    @Override
    public final String g(int i) {
        return String.valueOf(i);
    }

    @Override
    public final List getAnnotations() {
        return x24.a;
    }

    @Override
    public final List h(int i) {
        if (i >= 0) {
            return x24.a;
        }
        bya.a(qd4.n(i, "Illegal index ", ", kotlin.collections.LinkedHashMap expects only non-negative indices"));
        return null;
    }

    public final int hashCode() {
        return this.b.hashCode() + ((this.a.hashCode() + 710441009) * 31);
    }

    @Override
    public final o8a i(int i) {
        if (i >= 0) {
            int i2 = i % 2;
            if (i2 != 0) {
                if (i2 == 1) {
                    return this.b;
                }
                grb.i("Unreached");
                return null;
            }
            return this.a;
        }
        bya.a(qd4.n(i, "Illegal index ", ", kotlin.collections.LinkedHashMap expects only non-negative indices"));
        return null;
    }

    @Override
    public final boolean isInline() {
        return false;
    }

    public final String toString() {
        return "kotlin.collections.LinkedHashMap(" + this.a + ", " + this.b + ')';
    }
}
