package gb;

import java.util.Map;
import v7.k8;
public abstract class t extends db.u {
    public final v f10495a;

    public t(v vVar) {
        this.f10495a = vVar;
    }

    public abstract Object a();

    public abstract Object b(Object obj);

    public abstract void c(Object obj, lb.a aVar, s sVar);

    @Override
    public final Object read(lb.a aVar) {
        if (aVar.x() == 9) {
            aVar.t();
            return null;
        }
        Object a2 = a();
        Map map = this.f10495a.f10498a;
        try {
            aVar.b();
            while (aVar.k()) {
                s sVar = (s) map.get(aVar.r());
                if (sVar == null) {
                    aVar.C();
                } else {
                    c(a2, aVar, sVar);
                }
            }
            aVar.f();
            return b(a2);
        } catch (IllegalAccessException e7) {
            k8 k8Var = ib.c.f12092a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.11.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e7);
        } catch (IllegalStateException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override
    public final void write(lb.b bVar, Object obj) {
        if (obj == null) {
            bVar.i();
            return;
        }
        bVar.c();
        try {
            for (s sVar : this.f10495a.f10499b) {
                sVar.a(bVar, obj);
            }
            bVar.f();
        } catch (IllegalAccessException e7) {
            k8 k8Var = ib.c.f12092a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.11.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e7);
        }
    }
}
