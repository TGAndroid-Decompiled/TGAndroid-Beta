package hb;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
public final class s {
    public final String f11760a;
    public final Field f11761b;
    public final String f11762c;
    public final Method d;
    public final eb.u e;
    public final eb.u f11763f;
    public final boolean f11764g;
    public final boolean h;

    public s(String str, Field field, Method method, eb.u uVar, eb.u uVar2, boolean z10, boolean z11) {
        this.d = method;
        this.e = uVar;
        this.f11763f = uVar2;
        this.f11764g = z10;
        this.h = z11;
        this.f11760a = str;
        this.f11761b = field;
        this.f11762c = field.getName();
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
            obj2 = this.f11761b.get(obj);
        }
        if (obj2 == obj) {
            return;
        }
        bVar.g(this.f11760a);
        this.e.write(bVar, obj2);
    }
}
