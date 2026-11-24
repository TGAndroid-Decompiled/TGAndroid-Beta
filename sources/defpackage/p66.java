package defpackage;

import java.util.List;
public final class p66 implements y6a {
    public final y6a a;
    public final y6a b;

    public p66(y6a y6aVar, y6a y6aVar2) {
        y6aVar.getClass();
        y6aVar2.getClass();
        this.a = y6aVar;
        this.b = y6aVar2;
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
        Integer b = obb.b(str);
        if (b != null) {
            return b.intValue();
        }
        u36.j(str.concat(" is not a valid map index"));
        return 0;
    }

    @Override
    public final yve e() {
        return xbb.d;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof p66) {
                p66 p66Var = (p66) obj;
                if (!rr5.a(this.a, p66Var.a) || !rr5.a(this.b, p66Var.b)) {
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
        return n34.a;
    }

    @Override
    public final List h(int i) {
        if (i >= 0) {
            return n34.a;
        }
        c1b.a(td4.o(i, "Illegal index ", ", kotlin.collections.LinkedHashMap expects only non-negative indices"));
        return null;
    }

    public final int hashCode() {
        return this.b.hashCode() + ((this.a.hashCode() + 710441009) * 31);
    }

    @Override
    public final y6a i(int i) {
        if (i >= 0) {
            int i2 = i % 2;
            if (i2 != 0) {
                if (i2 == 1) {
                    return this.b;
                }
                dq9.m("Unreached");
                return null;
            }
            return this.a;
        }
        c1b.a(td4.o(i, "Illegal index ", ", kotlin.collections.LinkedHashMap expects only non-negative indices"));
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
