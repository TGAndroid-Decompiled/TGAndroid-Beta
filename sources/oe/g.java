package oe;

import c8.w9;
import java.util.List;
public final class g implements me.d {
    public final me.d f21825a;
    public final me.d f21826b;

    public g(me.d keyDesc, me.d valueDesc) {
        kotlin.jvm.internal.j.e(keyDesc, "keyDesc");
        kotlin.jvm.internal.j.e(valueDesc, "valueDesc");
        this.f21825a = keyDesc;
        this.f21826b = valueDesc;
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
    public final int d(String name) {
        kotlin.jvm.internal.j.e(name, "name");
        Integer b10 = xd.k.b(name);
        if (b10 != null) {
            return b10.intValue();
        }
        throw new IllegalArgumentException(name.concat(" is not a valid map index"));
    }

    @Override
    public final w9 e() {
        return me.f.d;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof g) {
                g gVar = (g) obj;
                if (!kotlin.jvm.internal.j.a(this.f21825a, gVar.f21825a) || !kotlin.jvm.internal.j.a(this.f21826b, gVar.f21826b)) {
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
    public final String g(int i7) {
        return String.valueOf(i7);
    }

    @Override
    public final List getAnnotations() {
        return hd.n.f14177a;
    }

    @Override
    public final List h(int i7) {
        if (i7 >= 0) {
            return hd.n.f14177a;
        }
        throw new IllegalArgumentException(i5.c.j(i7, "Illegal index ", ", kotlin.collections.LinkedHashMap expects only non-negative indices").toString());
    }

    public final int hashCode() {
        return this.f21826b.hashCode() + ((this.f21825a.hashCode() + 710441009) * 31);
    }

    @Override
    public final me.d i(int i7) {
        if (i7 >= 0) {
            int i10 = i7 % 2;
            if (i10 != 0) {
                if (i10 == 1) {
                    return this.f21826b;
                }
                throw new IllegalStateException("Unreached");
            }
            return this.f21825a;
        }
        throw new IllegalArgumentException(i5.c.j(i7, "Illegal index ", ", kotlin.collections.LinkedHashMap expects only non-negative indices").toString());
    }

    @Override
    public final boolean isInline() {
        return false;
    }

    @Override
    public final boolean j(int i7) {
        if (i7 >= 0) {
            return false;
        }
        throw new IllegalArgumentException(i5.c.j(i7, "Illegal index ", ", kotlin.collections.LinkedHashMap expects only non-negative indices").toString());
    }

    public final String toString() {
        return "kotlin.collections.LinkedHashMap(" + this.f21825a + ", " + this.f21826b + ')';
    }
}
