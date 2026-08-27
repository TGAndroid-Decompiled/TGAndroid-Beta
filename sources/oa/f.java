package oa;

import h7.w6;
import java.lang.reflect.Modifier;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import ma.u;
import ma.v;

public final class f implements v, Cloneable {

    public static final f f19384c = new f();

    public List f19385a;

    public final List f19386b;

    public f() {
        List list = Collections.EMPTY_LIST;
        this.f19385a = list;
        this.f19386b = list;
    }

    public final f clone() {
        try {
            return (f) super.clone();
        } catch (CloneNotSupportedException e9) {
            throw new AssertionError(e9);
        }
    }

    public final boolean b(Class cls, boolean z10) {
        if (!z10 && !Enum.class.isAssignableFrom(cls)) {
            w6 w6Var = ra.c.f46882a;
            if (!Modifier.isStatic(cls.getModifiers()) && (cls.isAnonymousClass() || cls.isLocalClass())) {
                return true;
            }
        }
        Iterator it = (z10 ? this.f19385a : this.f19386b).iterator();
        while (it.hasNext()) {
            if (((ma.a) it.next()).shouldSkipClass(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final u create(ma.g gVar, ta.a aVar) {
        Class cls = aVar.f48151a;
        boolean zB = b(cls, true);
        boolean zB2 = b(cls, false);
        if (zB || zB2) {
            return new e(this, zB2, zB, gVar, aVar);
        }
        return null;
    }
}
