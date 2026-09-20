package gb;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
public final class s {
    public final String f9587a;
    public final Field f9588b;
    public final String f9589c;
    public final Method d;
    public final db.u e;
    public final db.u f9590f;
    public final boolean f9591g;
    public final boolean h;

    public s(String str, Field field, Method method, db.u uVar, db.u uVar2, boolean z10, boolean z11) {
        this.d = method;
        this.e = uVar;
        this.f9590f = uVar2;
        this.f9591g = z10;
        this.h = z11;
        this.f9587a = str;
        this.f9588b = field;
        this.f9589c = field.getName();
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
            obj2 = this.f9588b.get(obj);
        }
        if (obj2 == obj) {
            return;
        }
        bVar.g(this.f9587a);
        this.e.write(bVar, obj2);
    }
}
