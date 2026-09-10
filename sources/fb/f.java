package fb;

import db.u;
import db.v;
import java.lang.reflect.Modifier;
import java.util.Collections;
import java.util.List;
import v7.p8;
public final class f implements v, Cloneable {
    public static final f f7907c = new f();
    public List f7908a;
    public final List f7909b;

    public f() {
        List list = Collections.EMPTY_LIST;
        this.f7908a = list;
        this.f7909b = list;
    }

    public final f clone() {
        try {
            return (f) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final boolean b(Class cls, boolean z10) {
        List<db.a> list;
        if (!z10 && !Enum.class.isAssignableFrom(cls)) {
            p8 p8Var = ib.c.f10550a;
            if (!Modifier.isStatic(cls.getModifiers()) && (cls.isAnonymousClass() || cls.isLocalClass())) {
                return true;
            }
        }
        if (z10) {
            list = this.f7908a;
        } else {
            list = this.f7909b;
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
        Class cls = aVar.f12419a;
        boolean b10 = b(cls, true);
        boolean b11 = b(cls, false);
        if (!b10 && !b11) {
            return null;
        }
        return new e(this, b11, b10, gVar, aVar);
    }
}
