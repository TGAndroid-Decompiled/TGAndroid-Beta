package gb;

import eb.v;
import java.lang.reflect.Modifier;
import java.util.Collections;
import java.util.List;
import v7.r8;
public final class h implements v, Cloneable {
    public static final h f10053c = new h();
    public List f10054a;
    public final List f10055b;

    public h() {
        List list = Collections.EMPTY_LIST;
        this.f10054a = list;
        this.f10055b = list;
    }

    public final h clone() {
        try {
            return (h) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final boolean b(Class cls, boolean z10) {
        List<eb.a> list;
        if (!z10 && !Enum.class.isAssignableFrom(cls)) {
            r8 r8Var = jb.c.f12958a;
            if (!Modifier.isStatic(cls.getModifiers()) && (cls.isAnonymousClass() || cls.isLocalClass())) {
                return true;
            }
        }
        if (z10) {
            list = this.f10054a;
        } else {
            list = this.f10055b;
        }
        for (eb.a aVar : list) {
            if (aVar.shouldSkipClass(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final eb.u create(eb.g gVar, lb.a aVar) {
        Class cls = aVar.f14653a;
        boolean b10 = b(cls, true);
        boolean b11 = b(cls, false);
        if (!b10 && !b11) {
            return null;
        }
        return new g(this, b11, b10, gVar, aVar);
    }
}
