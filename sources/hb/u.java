package hb;

import java.lang.reflect.Field;
public final class u extends t {
    public final gb.n f11790b;

    public u(gb.n nVar, v vVar) {
        super(vVar);
        this.f11790b = nVar;
    }

    @Override
    public final Object a() {
        return this.f11790b.f2();
    }

    @Override
    public final void c(Object obj, mb.a aVar, s sVar) {
        Field field = sVar.f11785b;
        Object read = sVar.f11787f.read(aVar);
        if (read == null && sVar.f11788g) {
            return;
        }
        if (!sVar.h) {
            field.set(obj, read);
            return;
        }
        throw new RuntimeException(si.o0.h("Cannot set value of 'static final' ", jb.c.d(field, false)));
    }

    @Override
    public final Object b(Object obj) {
        return obj;
    }
}
