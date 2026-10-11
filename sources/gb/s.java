package gb;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
public final class s {
    public final String f10488a;
    public final Field f10489b;
    public final String f10490c;
    public final Method d;
    public final db.u f10491e;
    public final db.u f10492f;
    public final boolean f10493g;
    public final boolean h;

    public s(String str, Field field, Method method, db.u uVar, db.u uVar2, boolean z10, boolean z11) {
        this.d = method;
        this.f10491e = uVar;
        this.f10492f = uVar2;
        this.f10493g = z10;
        this.h = z11;
        this.f10488a = str;
        this.f10489b = field;
        this.f10490c = field.getName();
    }

    public final void a(lb.b bVar, Object obj) {
        Object obj2;
        Method method = this.d;
        if (method != null) {
            try {
                obj2 = method.invoke(obj, null);
            } catch (InvocationTargetException e7) {
                throw new RuntimeException(a1.g.q("Accessor ", ib.c.d(method, false), " threw exception"), e7.getCause());
            }
        } else {
            obj2 = this.f10489b.get(obj);
        }
        if (obj2 == obj) {
            return;
        }
        bVar.g(this.f10488a);
        this.f10491e.write(bVar, obj2);
    }
}
