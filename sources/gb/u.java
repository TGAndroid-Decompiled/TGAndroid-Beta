package gb;

import java.lang.reflect.Field;
public final class u extends t {
    public final fb.o f10494b;

    public u(fb.o oVar, v vVar) {
        super(vVar);
        this.f10494b = oVar;
    }

    @Override
    public final Object a() {
        return this.f10494b.w2();
    }

    @Override
    public final void c(Object obj, lb.a aVar, s sVar) {
        Field field = sVar.f10488b;
        Object read = sVar.f10491f.read(aVar);
        if (read == null && sVar.f10492g) {
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
