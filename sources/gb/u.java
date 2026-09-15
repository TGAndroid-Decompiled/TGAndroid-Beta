package gb;

import java.lang.reflect.Field;
import org.telegram.ui.Cells.p6;
public final class u extends t {
    public final fb.n f9588b;

    public u(fb.n nVar, v vVar) {
        super(vVar);
        this.f9588b = nVar;
    }

    @Override
    public final Object a() {
        return this.f9588b.p2();
    }

    @Override
    public final void c(Object obj, lb.a aVar, s sVar) {
        Field field = sVar.f9583b;
        Object read = sVar.f9585f.read(aVar);
        if (read == null && sVar.f9586g) {
            return;
        }
        if (!sVar.h) {
            field.set(obj, read);
            return;
        }
        throw new RuntimeException(p6.i("Cannot set value of 'static final' ", ib.c.d(field, false)));
    }

    @Override
    public final Object b(Object obj) {
        return obj;
    }
}
