package gb;

import java.lang.reflect.Field;
import org.telegram.ui.Cells.q3;
public final class u extends t {
    public final fb.n f9589b;

    public u(fb.n nVar, v vVar) {
        super(vVar);
        this.f9589b = nVar;
    }

    @Override
    public final Object a() {
        return this.f9589b.p2();
    }

    @Override
    public final void c(Object obj, lb.a aVar, s sVar) {
        Field field = sVar.f9584b;
        Object read = sVar.f9586f.read(aVar);
        if (read == null && sVar.f9587g) {
            return;
        }
        if (!sVar.h) {
            field.set(obj, read);
            return;
        }
        throw new RuntimeException(q3.i("Cannot set value of 'static final' ", ib.c.d(field, false)));
    }

    @Override
    public final Object b(Object obj) {
        return obj;
    }
}
