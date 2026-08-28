package oa;

import java.lang.reflect.Field;
public final class u extends t {
    public final na.n f19168b;

    public u(na.n nVar, v vVar) {
        super(vVar);
        this.f19168b = nVar;
    }

    @Override
    public final Object a() {
        return this.f19168b.Y1();
    }

    @Override
    public final void c(Object obj, ta.a aVar, s sVar) {
        Field field = sVar.f19162b;
        Object read = sVar.f19165f.read(aVar);
        if (read == null && sVar.f19166g) {
            return;
        }
        if (!sVar.h) {
            field.set(obj, read);
            return;
        }
        throw new RuntimeException(ta.b.d("Cannot set value of 'static final' ", qa.c.d(field, false)));
    }

    @Override
    public final Object b(Object obj) {
        return obj;
    }
}
