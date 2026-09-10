package gb;

import java.lang.reflect.Field;
import org.telegram.ui.Cells.r6;
public final class u extends t {
    public final fb.n f8720b;

    public u(fb.n nVar, v vVar) {
        super(vVar);
        this.f8720b = nVar;
    }

    @Override
    public final Object a() {
        return this.f8720b.n2();
    }

    @Override
    public final void c(Object obj, lb.a aVar, s sVar) {
        Field field = sVar.f8715b;
        Object read = sVar.f8717f.read(aVar);
        if (read == null && sVar.f8718g) {
            return;
        }
        if (!sVar.h) {
            field.set(obj, read);
            return;
        }
        throw new RuntimeException(r6.i("Cannot set value of 'static final' ", ib.c.d(field, false)));
    }

    @Override
    public final Object b(Object obj) {
        return obj;
    }
}
