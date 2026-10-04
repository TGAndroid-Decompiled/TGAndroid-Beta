package gb;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
public final class s {
    public final String f10416a;
    public final Field f10417b;
    public final String f10418c;
    public final Method d;
    public final db.u f10419e;
    public final db.u f10420f;
    public final boolean f10421g;
    public final boolean h;

    public s(String str, Field field, Method method, db.u uVar, db.u uVar2, boolean z10, boolean z11) {
        this.d = method;
        this.f10419e = uVar;
        this.f10420f = uVar2;
        this.f10421g = z10;
        this.h = z11;
        this.f10416a = str;
        this.f10417b = field;
        this.f10418c = field.getName();
    }

    public final void a(lb.b bVar, Object obj) {
        Object obj2;
        Method method = this.d;
        if (method != null) {
            try {
                obj2 = method.invoke(obj, null);
            } catch (InvocationTargetException e7) {
                throw new RuntimeException(a4.a.p("Accessor ", ib.c.d(method, false), " threw exception"), e7.getCause());
            }
        } else {
            obj2 = this.f10417b.get(obj);
        }
        if (obj2 == obj) {
            return;
        }
        bVar.g(this.f10416a);
        this.f10419e.write(bVar, obj2);
    }
}
