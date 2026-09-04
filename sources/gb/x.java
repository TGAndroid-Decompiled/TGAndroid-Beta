package gb;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;
import v7.m8;
public final class x implements db.v {
    public final pf.b f10566a;
    public final fb.f f10567b;
    public final j f10568c;
    public final ArrayList d;

    public x(pf.b bVar, fb.f fVar, j jVar, ArrayList arrayList) {
        this.f10566a = bVar;
        this.f10567b = fVar;
        this.f10568c = jVar;
        this.d = arrayList;
    }

    public static void a(Class cls, String str, Field field, Field field2) {
        throw new IllegalArgumentException("Class " + cls.getName() + " declares multiple JSON fields named '" + str + "'; conflict is caused by fields " + ib.c.c(field) + " and " + ib.c.c(field2) + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("duplicate-fields"));
    }

    public final gb.v b(db.g r29, kb.a r30, java.lang.Class r31, boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: gb.x.b(db.g, kb.a, java.lang.Class, boolean):gb.v");
    }

    public final boolean c(Field field, boolean z10) {
        List<db.a> list;
        boolean z11;
        fb.f fVar = this.f10567b;
        fVar.getClass();
        if ((136 & field.getModifiers()) != 0 || field.isSynthetic() || fVar.b(field.getType(), z10)) {
            z11 = true;
            break;
        }
        if (z10) {
            list = fVar.f9428a;
        } else {
            list = fVar.f9429b;
        }
        if (!list.isEmpty()) {
            db.b bVar = new db.b(field);
            for (db.a aVar : list) {
                if (aVar.shouldSkipField(bVar)) {
                    z11 = true;
                    break;
                }
            }
        }
        z11 = false;
        return !z11;
    }

    @Override
    public final db.u create(db.g gVar, kb.a aVar) {
        Class cls = aVar.f14888a;
        if (!Object.class.isAssignableFrom(cls)) {
            return null;
        }
        m8 m8Var = ib.c.f11937a;
        if (!Modifier.isStatic(cls.getModifiers()) && (cls.isAnonymousClass() || cls.isLocalClass())) {
            return new db.d(2);
        }
        fb.d.f(this.d);
        if (ib.c.f11937a.d(cls)) {
            return new w(cls, b(gVar, aVar, cls, true));
        }
        return new u(this.f10566a.T(aVar), b(gVar, aVar, cls, false));
    }
}
