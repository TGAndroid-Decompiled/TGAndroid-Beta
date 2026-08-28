package na;

import g7.t6;
import java.lang.reflect.Modifier;
import java.util.Collections;
import java.util.List;
import la.u;
import la.v;
public final class g implements v, Cloneable {
    public static final g f18535c = new g();
    public List f18536a;
    public final List f18537b;

    public g() {
        List list = Collections.EMPTY_LIST;
        this.f18536a = list;
        this.f18537b = list;
    }

    public final g clone() {
        try {
            return (g) super.clone();
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }

    public final boolean b(Class cls, boolean z10) {
        List<la.a> list;
        if (!z10 && !Enum.class.isAssignableFrom(cls)) {
            t6 t6Var = qa.c.f46123a;
            if (!Modifier.isStatic(cls.getModifiers()) && (cls.isAnonymousClass() || cls.isLocalClass())) {
                return true;
            }
        }
        if (z10) {
            list = this.f18536a;
        } else {
            list = this.f18537b;
        }
        for (la.a aVar : list) {
            if (aVar.shouldSkipClass(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final u create(la.g gVar, sa.a aVar) {
        Class cls = aVar.f47502a;
        boolean b10 = b(cls, true);
        boolean b11 = b(cls, false);
        if (!b10 && !b11) {
            return null;
        }
        return new f(this, b11, b10, gVar, aVar);
    }
}
