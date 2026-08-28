package oa;

import g7.t6;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;
public final class x implements la.v {
    public final g5.b f19175a;
    public final na.g f19176b;
    public final j f19177c;
    public final ArrayList d;

    public x(g5.b bVar, na.g gVar, j jVar, ArrayList arrayList) {
        this.f19175a = bVar;
        this.f19176b = gVar;
        this.f19177c = jVar;
        this.d = arrayList;
    }

    public static void a(Class cls, String str, Field field, Field field2) {
        throw new IllegalArgumentException("Class " + cls.getName() + " declares multiple JSON fields named '" + str + "'; conflict is caused by fields " + qa.c.c(field) + " and " + qa.c.c(field2) + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("duplicate-fields"));
    }

    public final oa.v b(la.g r29, sa.a r30, java.lang.Class r31, boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: oa.x.b(la.g, sa.a, java.lang.Class, boolean):oa.v");
    }

    public final boolean c(Field field, boolean z10) {
        List<la.a> list;
        boolean z11;
        na.g gVar = this.f19176b;
        gVar.getClass();
        if ((136 & field.getModifiers()) != 0 || field.isSynthetic() || gVar.b(field.getType(), z10)) {
            z11 = true;
            break;
        }
        if (z10) {
            list = gVar.f18536a;
        } else {
            list = gVar.f18537b;
        }
        if (!list.isEmpty()) {
            la.b bVar = new la.b(field);
            for (la.a aVar : list) {
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
    public final la.u create(la.g gVar, sa.a aVar) {
        Class cls = aVar.f47502a;
        if (!Object.class.isAssignableFrom(cls)) {
            return null;
        }
        t6 t6Var = qa.c.f46123a;
        if (!Modifier.isStatic(cls.getModifiers()) && (cls.isAnonymousClass() || cls.isLocalClass())) {
            return new la.d(2);
        }
        na.d.f(this.d);
        if (qa.c.f46123a.d(cls)) {
            return new w(cls, b(gVar, aVar, cls, true));
        }
        return new u(this.f19175a.l(aVar), b(gVar, aVar, cls, false));
    }
}
