package oa;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
public final class s {
    public final String f19161a;
    public final Field f19162b;
    public final String f19163c;
    public final Method d;
    public final la.u f19164e;
    public final la.u f19165f;
    public final boolean f19166g;
    public final boolean h;

    public s(String str, Field field, Method method, la.u uVar, la.u uVar2, boolean z10, boolean z11) {
        this.d = method;
        this.f19164e = uVar;
        this.f19165f = uVar2;
        this.f19166g = z10;
        this.h = z11;
        this.f19161a = str;
        this.f19162b = field;
        this.f19163c = field.getName();
    }

    public final void a(ta.c cVar, Object obj) {
        Object obj2;
        Method method = this.d;
        if (method != null) {
            try {
                obj2 = method.invoke(obj, null);
            } catch (InvocationTargetException e10) {
                throw new RuntimeException(aa.d.o("Accessor ", qa.c.d(method, false), " threw exception"), e10.getCause());
            }
        } else {
            obj2 = this.f19162b.get(obj);
        }
        if (obj2 == obj) {
            return;
        }
        cVar.g(this.f19161a);
        this.f19164e.write(cVar, obj2);
    }
}
