package gb;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
public final class s {
    public final String f10580a;
    public final Field f10581b;
    public final String f10582c;
    public final Method d;
    public final db.u f10583e;
    public final db.u f10584f;
    public final boolean f10585g;
    public final boolean h;

    public s(String str, Field field, Method method, db.u uVar, db.u uVar2, boolean z10, boolean z11) {
        this.d = method;
        this.f10583e = uVar;
        this.f10584f = uVar2;
        this.f10585g = z10;
        this.h = z11;
        this.f10580a = str;
        this.f10581b = field;
        this.f10582c = field.getName();
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
            obj2 = this.f10581b.get(obj);
        }
        if (obj2 == obj) {
            return;
        }
        bVar.g(this.f10580a);
        this.f10583e.write(bVar, obj2);
    }
}
