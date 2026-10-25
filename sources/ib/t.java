package ib;

import a8.rd;
import java.util.Map;
public abstract class t extends fb.u {
    public final v f13963a;

    public t(v vVar) {
        this.f13963a = vVar;
    }

    public abstract Object a();

    public abstract Object b(Object obj);

    public abstract void c(Object obj, nb.a aVar, s sVar);

    @Override
    public final Object read(nb.a aVar) {
        if (aVar.x() == 9) {
            aVar.t();
            return null;
        }
        Object a2 = a();
        Map map = this.f13963a.f13966a;
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
        } catch (IllegalAccessException e) {
            rd rdVar = kb.c.f16505a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.11.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
        } catch (IllegalStateException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override
    public final void write(nb.b bVar, Object obj) {
        if (obj == null) {
            bVar.i();
            return;
        }
        bVar.c();
        try {
            for (s sVar : this.f13963a.f13967b) {
                sVar.a(bVar, obj);
            }
            bVar.f();
        } catch (IllegalAccessException e) {
            rd rdVar = kb.c.f16505a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.11.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
        }
    }
}
