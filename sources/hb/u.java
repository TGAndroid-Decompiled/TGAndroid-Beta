package hb;

import java.lang.reflect.Field;
public final class u extends t {
    public final gb.n f11763b;

    public u(gb.n nVar, v vVar) {
        super(vVar);
        this.f11763b = nVar;
    }

    @Override
    public final Object a() {
        return this.f11763b.f2();
    }

    @Override
    public final void c(Object obj, mb.a aVar, s sVar) {
        Field field = sVar.f11758b;
        Object read = sVar.f11760f.read(aVar);
        if (read == null && sVar.f11761g) {
            return;
        }
        if (!sVar.h) {
            field.set(obj, read);
            return;
        }
        throw new RuntimeException(r4.c.h("Cannot set value of 'static final' ", jb.c.d(field, false)));
    }

    @Override
    public final Object b(Object obj) {
        return obj;
    }
}
