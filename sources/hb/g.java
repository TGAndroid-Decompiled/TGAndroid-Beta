package hb;

import a8.rd;
import fb.u;
import fb.v;
import java.lang.reflect.Modifier;
import java.util.Collections;
import java.util.List;
public final class g implements v, Cloneable {
    public static final g f12735c = new g();
    public List f12736a;
    public final List f12737b;

    public g() {
        List list = Collections.EMPTY_LIST;
        this.f12736a = list;
        this.f12737b = list;
    }

    public final g clone() {
        try {
            return (g) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final boolean b(Class cls, boolean z10) {
        List<fb.a> list;
        if (!z10 && !Enum.class.isAssignableFrom(cls)) {
            rd rdVar = kb.c.f16504a;
            if (!Modifier.isStatic(cls.getModifiers()) && (cls.isAnonymousClass() || cls.isLocalClass())) {
                return true;
            }
        }
        if (z10) {
            list = this.f12736a;
        } else {
            list = this.f12737b;
        }
        for (fb.a aVar : list) {
            if (aVar.shouldSkipClass(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final u create(fb.g gVar, mb.a aVar) {
        Class cls = aVar.f18406a;
        boolean b10 = b(cls, true);
        boolean b11 = b(cls, false);
        if (!b10 && !b11) {
            return null;
        }
        return new f(this, b11, b10, gVar, aVar);
    }
}
