package fb;

import db.u;
import db.v;
import java.lang.reflect.Modifier;
import java.util.Collections;
import java.util.List;
import v7.n8;
public final class g implements v, Cloneable {
    public static final g f9025c = new g();
    public List f9026a;
    public final List f9027b;

    public g() {
        List list = Collections.EMPTY_LIST;
        this.f9026a = list;
        this.f9027b = list;
    }

    public final g clone() {
        try {
            return (g) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final boolean b(Class cls, boolean z10) {
        List<db.a> list;
        if (!z10 && !Enum.class.isAssignableFrom(cls)) {
            n8 n8Var = ib.c.f11070a;
            if (!Modifier.isStatic(cls.getModifiers()) && (cls.isAnonymousClass() || cls.isLocalClass())) {
                return true;
            }
        }
        if (z10) {
            list = this.f9026a;
        } else {
            list = this.f9027b;
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
        Class cls = aVar.f13575a;
        boolean b10 = b(cls, true);
        boolean b11 = b(cls, false);
        if (!b10 && !b11) {
            return null;
        }
        return new f(this, b11, b10, gVar, aVar);
    }
}
