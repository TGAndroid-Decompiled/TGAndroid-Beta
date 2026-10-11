package fb;

import db.u;
import db.v;
import java.lang.reflect.Modifier;
import java.util.Collections;
import java.util.List;
import v7.k8;
public final class f implements v, Cloneable {
    public static final f f9814c = new f();
    public List f9815a;
    public final List f9816b;

    public f() {
        List list = Collections.EMPTY_LIST;
        this.f9815a = list;
        this.f9816b = list;
    }

    public final f clone() {
        try {
            return (f) super.clone();
        } catch (CloneNotSupportedException e7) {
            throw new AssertionError(e7);
        }
    }

    public final boolean b(Class cls, boolean z10) {
        List<db.a> list;
        if (!z10 && !Enum.class.isAssignableFrom(cls)) {
            k8 k8Var = ib.c.f12091a;
            if (!Modifier.isStatic(cls.getModifiers()) && (cls.isAnonymousClass() || cls.isLocalClass())) {
                return true;
            }
        }
        if (z10) {
            list = this.f9815a;
        } else {
            list = this.f9816b;
        }
        for (db.a aVar : list) {
            if (aVar.shouldSkipClass(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final u create(db.g gVar, kb.a aVar) {
        Class cls = aVar.f14778a;
        boolean b10 = b(cls, true);
        boolean b11 = b(cls, false);
        if (!b10 && !b11) {
            return null;
        }
        return new e(this, b11, b10, gVar, aVar);
    }
}
