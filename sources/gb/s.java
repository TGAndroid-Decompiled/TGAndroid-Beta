package gb;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
public final class s {
    public final String f10552a;
    public final Field f10553b;
    public final String f10554c;
    public final Method d;
    public final db.u f10555e;
    public final db.u f10556f;
    public final boolean f10557g;
    public final boolean h;

    public s(String str, Field field, Method method, db.u uVar, db.u uVar2, boolean z10, boolean z11) {
        this.d = method;
        this.f10555e = uVar;
        this.f10556f = uVar2;
        this.f10557g = z10;
        this.h = z11;
        this.f10552a = str;
        this.f10553b = field;
        this.f10554c = field.getName();
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
            obj2 = this.f10553b.get(obj);
        }
        if (obj2 == obj) {
            return;
        }
        bVar.g(this.f10552a);
        this.f10555e.write(bVar, obj2);
    }
}
