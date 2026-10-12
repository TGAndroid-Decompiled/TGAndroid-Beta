package gb;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
public final class s {
    public final String f10487a;
    public final Field f10488b;
    public final String f10489c;
    public final Method d;
    public final db.u f10490e;
    public final db.u f10491f;
    public final boolean f10492g;
    public final boolean h;

    public s(String str, Field field, Method method, db.u uVar, db.u uVar2, boolean z10, boolean z11) {
        this.d = method;
        this.f10490e = uVar;
        this.f10491f = uVar2;
        this.f10492g = z10;
        this.h = z11;
        this.f10487a = str;
        this.f10488b = field;
        this.f10489c = field.getName();
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
            obj2 = this.f10488b.get(obj);
        }
        if (obj2 == obj) {
            return;
        }
        bVar.g(this.f10487a);
        this.f10490e.write(bVar, obj2);
    }
}
