package ib;

import a8.rd;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;
public final class x implements fb.v {
    public final rf.b f13970a;
    public final hb.g f13971b;
    public final j f13972c;
    public final ArrayList d;

    public x(rf.b bVar, hb.g gVar, j jVar, ArrayList arrayList) {
        this.f13970a = bVar;
        this.f13971b = gVar;
        this.f13972c = jVar;
        this.d = arrayList;
    }

    public static void a(Class cls, String str, Field field, Field field2) {
        throw new IllegalArgumentException("Class " + cls.getName() + " declares multiple JSON fields named '" + str + "'; conflict is caused by fields " + kb.c.c(field) + " and " + kb.c.c(field2) + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("duplicate-fields"));
    }

    public final ib.v b(fb.g r29, mb.a r30, java.lang.Class r31, boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: ib.x.b(fb.g, mb.a, java.lang.Class, boolean):ib.v");
    }

    public final boolean c(Field field, boolean z10) {
        List<fb.a> list;
        boolean z11;
        hb.g gVar = this.f13971b;
        gVar.getClass();
        if ((136 & field.getModifiers()) != 0 || field.isSynthetic() || gVar.b(field.getType(), z10)) {
            z11 = true;
            break;
        }
        if (z10) {
            list = gVar.f12737a;
        } else {
            list = gVar.f12738b;
        }
        if (!list.isEmpty()) {
            fb.b bVar = new fb.b(field);
            for (fb.a aVar : list) {
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
    public final fb.u create(fb.g gVar, mb.a aVar) {
        Class cls = aVar.f18407a;
        if (!Object.class.isAssignableFrom(cls)) {
            return null;
        }
        rd rdVar = kb.c.f16505a;
        if (!Modifier.isStatic(cls.getModifiers()) && (cls.isAnonymousClass() || cls.isLocalClass())) {
            return new fb.d(2);
        }
        hb.d.f(this.d);
        if (kb.c.f16505a.d(cls)) {
            return new w(cls, b(gVar, aVar, cls, true));
        }
        return new u(this.f13970a.K(aVar), b(gVar, aVar, cls, false));
    }
}
