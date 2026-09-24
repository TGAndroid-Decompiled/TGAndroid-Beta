package gb;

import java.lang.reflect.Field;
public final class u extends t {
    public final fb.n f9574b;

    public u(fb.n nVar, v vVar) {
        super(vVar);
        this.f9574b = nVar;
    }

    @Override
    public final Object a() {
        return this.f9574b.p2();
    }

    @Override
    public final void c(Object obj, lb.a aVar, s sVar) {
        Field field = sVar.f9569b;
        Object read = sVar.f9571f.read(aVar);
        if (read == null && sVar.f9572g) {
            return;
        }
        if (!sVar.h) {
            field.set(obj, read);
            return;
        }
        throw new RuntimeException(v7.j.g("Cannot set value of 'static final' ", ib.c.d(field, false)));
    }

    @Override
    public final Object b(Object obj) {
        return obj;
    }
}
