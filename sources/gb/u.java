package gb;

import java.lang.reflect.Field;
import org.telegram.ui.Cells.p6;
public final class u extends t {
    public final fb.n f10559b;

    public u(fb.n nVar, v vVar) {
        super(vVar);
        this.f10559b = nVar;
    }

    @Override
    public final Object a() {
        return this.f10559b.h2();
    }

    @Override
    public final void c(Object obj, lb.a aVar, s sVar) {
        Field field = sVar.f10553b;
        Object read = sVar.f10556f.read(aVar);
        if (read == null && sVar.f10557g) {
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
