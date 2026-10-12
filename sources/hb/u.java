package hb;

import java.lang.reflect.Field;
public final class u extends t {
    public final gb.o f10455b;

    public u(gb.o oVar, v vVar) {
        super(vVar);
        this.f10455b = oVar;
    }

    @Override
    public final Object a() {
        return this.f10455b.f2();
    }

    @Override
    public final void c(Object obj, mb.a aVar, s sVar) {
        Field field = sVar.f10450b;
        Object read = sVar.f10452f.read(aVar);
        if (read == null && sVar.f10453g) {
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
