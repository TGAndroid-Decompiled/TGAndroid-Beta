package ib;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
public final class s {
    public final String f13957a;
    public final Field f13958b;
    public final String f13959c;
    public final Method d;
    public final fb.u e;
    public final fb.u f13960f;
    public final boolean f13961g;
    public final boolean h;

    public s(String str, Field field, Method method, fb.u uVar, fb.u uVar2, boolean z10, boolean z11) {
        this.d = method;
        this.e = uVar;
        this.f13960f = uVar2;
        this.f13961g = z10;
        this.h = z11;
        this.f13957a = str;
        this.f13958b = field;
        this.f13959c = field.getName();
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
            obj2 = this.f13958b.get(obj);
        }
        if (obj2 == obj) {
            return;
        }
        bVar.g(this.f13957a);
        this.e.write(bVar, obj2);
    }
}
