package gb;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
public final class s {
    public final String f10489a;
    public final Field f10490b;
    public final String f10491c;
    public final Method d;
    public final db.u f10492e;
    public final db.u f10493f;
    public final boolean f10494g;
    public final boolean h;

    public s(String str, Field field, Method method, db.u uVar, db.u uVar2, boolean z10, boolean z11) {
        this.d = method;
        this.f10492e = uVar;
        this.f10493f = uVar2;
        this.f10494g = z10;
        this.h = z11;
        this.f10489a = str;
        this.f10490b = field;
        this.f10491c = field.getName();
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
            obj2 = this.f10490b.get(obj);
        }
        if (obj2 == obj) {
            return;
        }
        bVar.g(this.f10489a);
        this.f10492e.write(bVar, obj2);
    }
}
