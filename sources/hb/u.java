package hb;

import java.lang.reflect.Field;
public final class u extends t {
    public final gb.p f10459b;

    public u(gb.p pVar, v vVar) {
        super(vVar);
        this.f10459b = pVar;
    }

    @Override
    public final Object a() {
        return this.f10459b.i2();
    }

    @Override
    public final void c(Object obj, mb.a aVar, s sVar) {
        Field field = sVar.f10454b;
        Object read = sVar.f10456f.read(aVar);
        if (read == null && sVar.f10457g) {
            return;
        }
        if (!sVar.h) {
            field.set(obj, read);
            return;
        }
        throw new RuntimeException(t8.b.h("Cannot set value of 'static final' ", jb.c.d(field, false)));
    }

    @Override
    public final Object b(Object obj) {
        return obj;
    }
}
