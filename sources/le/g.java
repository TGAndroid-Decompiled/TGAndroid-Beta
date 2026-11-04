package le;

import b8.jd;
import java.util.List;
import k2.p1;
public final class g implements je.d {
    public final je.d f18189a;
    public final je.d f18190b;

    public g(je.d keyDesc, je.d valueDesc) {
        kotlin.jvm.internal.j.e(keyDesc, "keyDesc");
        kotlin.jvm.internal.j.e(valueDesc, "valueDesc");
        this.f18189a = keyDesc;
        this.f18190b = valueDesc;
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
        Integer b10 = ud.k.b(name);
        if (b10 != null) {
            return b10.intValue();
        }
        throw new IllegalArgumentException(name.concat(" is not a valid map index"));
    }

    @Override
    public final jd e() {
        return je.f.d;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof g) {
                g gVar = (g) obj;
                if (!kotlin.jvm.internal.j.a(this.f18189a, gVar.f18189a) || !kotlin.jvm.internal.j.a(this.f18190b, gVar.f18190b)) {
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
    public final String g(int i3) {
        return String.valueOf(i3);
    }

    @Override
    public final List getAnnotations() {
        return ed.o.f9953a;
    }

    @Override
    public final List h(int i3) {
        if (i3 >= 0) {
            return ed.o.f9953a;
        }
        throw new IllegalArgumentException(p1.j(i3, "Illegal index ", ", kotlin.collections.LinkedHashMap expects only non-negative indices").toString());
    }

    public final int hashCode() {
        return this.f18190b.hashCode() + ((this.f18189a.hashCode() + 710441009) * 31);
    }

    @Override
    public final je.d i(int i3) {
        if (i3 >= 0) {
            int i10 = i3 % 2;
            if (i10 != 0) {
                if (i10 == 1) {
                    return this.f18190b;
                }
                throw new IllegalStateException("Unreached");
            }
            return this.f18189a;
        }
        throw new IllegalArgumentException(p1.j(i3, "Illegal index ", ", kotlin.collections.LinkedHashMap expects only non-negative indices").toString());
    }

    @Override
    public final boolean isInline() {
        return false;
    }

    @Override
    public final boolean j(int i3) {
        if (i3 >= 0) {
            return false;
        }
        throw new IllegalArgumentException(p1.j(i3, "Illegal index ", ", kotlin.collections.LinkedHashMap expects only non-negative indices").toString());
    }

    public final String toString() {
        return "kotlin.collections.LinkedHashMap(" + this.f18189a + ", " + this.f18190b + ')';
    }
}
