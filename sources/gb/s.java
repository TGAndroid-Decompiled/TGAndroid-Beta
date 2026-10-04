package gb;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
public final class s {
    public final String f10417a;
    public final Field f10418b;
    public final String f10419c;
    public final Method d;
    public final db.u f10420e;
    public final db.u f10421f;
    public final boolean f10422g;
    public final boolean h;

    public s(String str, Field field, Method method, db.u uVar, db.u uVar2, boolean z10, boolean z11) {
        this.d = method;
        this.f10420e = uVar;
        this.f10421f = uVar2;
        this.f10422g = z10;
        this.h = z11;
        this.f10417a = str;
        this.f10418b = field;
        this.f10419c = field.getName();
    }

    public final void a(lb.b bVar, Object obj) {
        Object obj2;
        Method method = this.d;
        if (method != null) {
            try {
                obj2 = method.invoke(obj, null);
            } catch (InvocationTargetException e7) {
                throw new RuntimeException(a4.a.q("Accessor ", ib.c.d(method, false), " threw exception"), e7.getCause());
            }
        } else {
            obj2 = this.f10418b.get(obj);
        }
        if (obj2 == obj) {
            return;
        }
        bVar.g(this.f10417a);
        this.f10420e.write(bVar, obj2);
    }
}
