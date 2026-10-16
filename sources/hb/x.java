package hb;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;
import v7.r8;
public final class x implements eb.v {
    public final qf.b f10465a;
    public final gb.h f10466b;
    public final j f10467c;
    public final ArrayList d;

    public x(qf.b bVar, gb.h hVar, j jVar, ArrayList arrayList) {
        this.f10465a = bVar;
        this.f10466b = hVar;
        this.f10467c = jVar;
        this.d = arrayList;
    }

    public static void a(Class cls, String str, Field field, Field field2) {
        throw new IllegalArgumentException("Class " + cls.getName() + " declares multiple JSON fields named '" + str + "'; conflict is caused by fields " + jb.c.c(field) + " and " + jb.c.c(field2) + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("duplicate-fields"));
    }

    public final hb.v b(eb.g r29, lb.a r30, java.lang.Class r31, boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: hb.x.b(eb.g, lb.a, java.lang.Class, boolean):hb.v");
    }

    public final boolean c(Field field, boolean z10) {
        List<eb.a> list;
        boolean z11;
        gb.h hVar = this.f10466b;
        hVar.getClass();
        if ((136 & field.getModifiers()) != 0 || field.isSynthetic() || hVar.b(field.getType(), z10)) {
            z11 = true;
            break;
        }
        if (z10) {
            list = hVar.f10054a;
        } else {
            list = hVar.f10055b;
        }
        if (!list.isEmpty()) {
            eb.b bVar = new eb.b(field);
            for (eb.a aVar : list) {
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
    public final eb.u create(eb.g gVar, lb.a aVar) {
        Class cls = aVar.f14653a;
        if (!Object.class.isAssignableFrom(cls)) {
            return null;
        }
        r8 r8Var = jb.c.f12958a;
        if (!Modifier.isStatic(cls.getModifiers()) && (cls.isAnonymousClass() || cls.isLocalClass())) {
            return new eb.d(2);
        }
        gb.d.f(this.d);
        if (jb.c.f12958a.d(cls)) {
            return new w(cls, b(gVar, aVar, cls, true));
        }
        return new u(this.f10465a.W(aVar), b(gVar, aVar, cls, false));
    }
}
