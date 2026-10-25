package ib;

import java.lang.reflect.Field;
import org.telegram.ui.Components.b10;
public final class u extends t {
    public final hb.n f13964b;

    public u(hb.n nVar, v vVar) {
        super(vVar);
        this.f13964b = nVar;
    }

    @Override
    public final Object a() {
        return this.f13964b.U1();
    }

    @Override
    public final void c(Object obj, nb.a aVar, s sVar) {
        Field field = sVar.f13959b;
        Object read = sVar.f13961f.read(aVar);
        if (read == null && sVar.f13962g) {
            return;
        }
        if (!sVar.h) {
            field.set(obj, read);
            return;
        }
        throw new RuntimeException(b10.j("Cannot set value of 'static final' ", kb.c.d(field, false)));
    }

    @Override
    public final Object b(Object obj) {
        return obj;
    }
}
