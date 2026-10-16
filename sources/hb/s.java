package hb;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
public final class s {
    public final String f10453a;
    public final Field f10454b;
    public final String f10455c;
    public final Method d;
    public final eb.u e;
    public final eb.u f10456f;
    public final boolean f10457g;
    public final boolean h;

    public s(String str, Field field, Method method, eb.u uVar, eb.u uVar2, boolean z10, boolean z11) {
        this.d = method;
        this.e = uVar;
        this.f10456f = uVar2;
        this.f10457g = z10;
        this.h = z11;
        this.f10453a = str;
        this.f10454b = field;
        this.f10455c = field.getName();
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
            obj2 = this.f10454b.get(obj);
        }
        if (obj2 == obj) {
            return;
        }
        bVar.g(this.f10453a);
        this.e.write(bVar, obj2);
    }
}
