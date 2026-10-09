package gb;

import java.lang.reflect.Field;
public final class u extends t {
    public final fb.n f10496b;

    public u(fb.n nVar, v vVar) {
        super(vVar);
        this.f10496b = nVar;
    }

    @Override
    public final Object a() {
        return this.f10496b.v2();
    }

    @Override
    public final void c(Object obj, lb.a aVar, s sVar) {
        Field field = sVar.f10490b;
        Object read = sVar.f10493f.read(aVar);
        if (read == null && sVar.f10494g) {
            return;
        }
        if (!sVar.h) {
            field.set(obj, read);
            return;
        }
        throw new RuntimeException(sc.v.i("Cannot set value of 'static final' ", ib.c.d(field, false)));
    }

    @Override
    public final Object b(Object obj) {
        return obj;
    }
}
