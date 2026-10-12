package gb;

import eb.u;
import eb.v;
import java.lang.reflect.Modifier;
import java.util.Collections;
import java.util.List;
import v7.r8;
public final class g implements v, Cloneable {
    public static final g f10049c = new g();
    public List f10050a;
    public final List f10051b;

    public g() {
        List list = Collections.EMPTY_LIST;
        this.f10050a = list;
        this.f10051b = list;
    }

    public final g clone() {
        try {
            return (g) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final boolean b(Class cls, boolean z10) {
        List<eb.a> list;
        if (!z10 && !Enum.class.isAssignableFrom(cls)) {
            r8 r8Var = jb.c.f12954a;
            if (!Modifier.isStatic(cls.getModifiers()) && (cls.isAnonymousClass() || cls.isLocalClass())) {
                return true;
            }
        }
        if (z10) {
            list = this.f10050a;
        } else {
            list = this.f10051b;
        }
        for (eb.a aVar : list) {
            if (aVar.shouldSkipClass(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final u create(eb.g gVar, lb.a aVar) {
        Class cls = aVar.f14653a;
        boolean b10 = b(cls, true);
        boolean b11 = b(cls, false);
        if (!b10 && !b11) {
            return null;
        }
        return new f(this, b11, b10, gVar, aVar);
    }
}
