package hb;

import java.lang.reflect.Field;
public final class u extends t {
    public final gb.n f11765b;

    public u(gb.n nVar, v vVar) {
        super(vVar);
        this.f11765b = nVar;
    }

    @Override
    public final Object a() {
        return this.f11765b.f2();
    }

    @Override
    public final void c(Object obj, mb.a aVar, s sVar) {
        Field field = sVar.f11760b;
        Object read = sVar.f11762f.read(aVar);
        if (read == null && sVar.f11763g) {
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
