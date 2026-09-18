package gb;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
public final class s {
    public final String f9586a;
    public final Field f9587b;
    public final String f9588c;
    public final Method d;
    public final db.u e;
    public final db.u f9589f;
    public final boolean f9590g;
    public final boolean h;

    public s(String str, Field field, Method method, db.u uVar, db.u uVar2, boolean z10, boolean z11) {
        this.d = method;
        this.e = uVar;
        this.f9589f = uVar2;
        this.f9590g = z10;
        this.h = z11;
        this.f9586a = str;
        this.f9587b = field;
        this.f9588c = field.getName();
    }

    public final void a(lb.b bVar, Object obj) {
        Object obj2;
        Method method = this.d;
        if (method != null) {
            try {
                obj2 = method.invoke(obj, null);
            } catch (InvocationTargetException e) {
                throw new RuntimeException(a4.a.p("Accessor ", ib.c.d(method, false), " threw exception"), e.getCause());
            }
        } else {
            obj2 = this.f9587b.get(obj);
        }
        if (obj2 == obj) {
            return;
        }
        bVar.g(this.f9586a);
        this.e.write(bVar, obj2);
    }
}
