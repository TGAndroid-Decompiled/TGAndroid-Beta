package gb;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;
import v7.n8;
public final class x implements db.v {
    public final of.b f9599a;
    public final fb.g f9600b;
    public final j f9601c;
    public final ArrayList d;

    public x(of.b bVar, fb.g gVar, j jVar, ArrayList arrayList) {
        this.f9599a = bVar;
        this.f9600b = gVar;
        this.f9601c = jVar;
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
        fb.g gVar = this.f9600b;
        gVar.getClass();
        if ((136 & field.getModifiers()) != 0 || field.isSynthetic() || gVar.b(field.getType(), z10)) {
            z11 = true;
            break;
        }
        if (z10) {
            list = gVar.f9026a;
        } else {
            list = gVar.f9027b;
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
        Class cls = aVar.f13575a;
        if (!Object.class.isAssignableFrom(cls)) {
            return null;
        }
        n8 n8Var = ib.c.f11070a;
        if (!Modifier.isStatic(cls.getModifiers()) && (cls.isAnonymousClass() || cls.isLocalClass())) {
            return new db.d(2);
        }
        fb.d.f(this.d);
        if (ib.c.f11070a.d(cls)) {
            return new w(cls, b(gVar, aVar, cls, true));
        }
        return new u(this.f9599a.Q(aVar), b(gVar, aVar, cls, false));
    }
}
