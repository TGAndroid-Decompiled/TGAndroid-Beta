package ib;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
public final class s {
    public final String f13958a;
    public final Field f13959b;
    public final String f13960c;
    public final Method d;
    public final fb.u e;
    public final fb.u f13961f;
    public final boolean f13962g;
    public final boolean h;

    public s(String str, Field field, Method method, fb.u uVar, fb.u uVar2, boolean z10, boolean z11) {
        this.d = method;
        this.e = uVar;
        this.f13961f = uVar2;
        this.f13962g = z10;
        this.h = z11;
        this.f13958a = str;
        this.f13959b = field;
        this.f13960c = field.getName();
    }

    public final void a(nb.b bVar, Object obj) {
        Object obj2;
        Method method = this.d;
        if (method != null) {
            try {
                obj2 = method.invoke(obj, null);
            } catch (InvocationTargetException e) {
                throw new RuntimeException(a1.g.p("Accessor ", kb.c.d(method, false), " threw exception"), e.getCause());
            }
        } else {
            obj2 = this.f13959b.get(obj);
        }
        if (obj2 == obj) {
            return;
        }
        bVar.g(this.f13958a);
        this.e.write(bVar, obj2);
    }
}
