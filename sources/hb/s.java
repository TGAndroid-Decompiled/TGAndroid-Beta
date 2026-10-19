package hb;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
public final class s {
    public final String f11759a;
    public final Field f11760b;
    public final String f11761c;
    public final Method d;
    public final eb.u e;
    public final eb.u f11762f;
    public final boolean f11763g;
    public final boolean h;

    public s(String str, Field field, Method method, eb.u uVar, eb.u uVar2, boolean z10, boolean z11) {
        this.d = method;
        this.e = uVar;
        this.f11762f = uVar2;
        this.f11763g = z10;
        this.h = z11;
        this.f11759a = str;
        this.f11760b = field;
        this.f11761c = field.getName();
    }

    public final void a(mb.b bVar, Object obj) {
        Object obj2;
        Method method = this.d;
        if (method != null) {
            try {
                obj2 = method.invoke(obj, null);
            } catch (InvocationTargetException e) {
                throw new RuntimeException(a1.g.p("Accessor ", jb.c.d(method, false), " threw exception"), e.getCause());
            }
        } else {
            obj2 = this.f11760b.get(obj);
        }
        if (obj2 == obj) {
            return;
        }
        bVar.g(this.f11759a);
        this.e.write(bVar, obj2);
    }
}
