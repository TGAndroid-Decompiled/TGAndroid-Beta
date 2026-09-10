package gb;

import java.lang.reflect.Array;
import java.util.ArrayList;
public final class b extends db.u {
    public static final a f8666c = new a();
    public final Class f8667a;
    public final o f8668b;

    public b(db.g gVar, db.u uVar, Class cls) {
        this.f8668b = new o(gVar, uVar, cls);
        this.f8667a = cls;
    }

    @Override
    public final Object read(lb.a aVar) {
        if (aVar.x() == 9) {
            aVar.t();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        aVar.a();
        while (aVar.k()) {
            arrayList.add(((db.u) this.f8668b.f8706c).read(aVar));
        }
        aVar.e();
        int size = arrayList.size();
        Class cls = this.f8667a;
        if (cls.isPrimitive()) {
            Object newInstance = Array.newInstance(cls, size);
            for (int i10 = 0; i10 < size; i10++) {
                Array.set(newInstance, i10, arrayList.get(i10));
            }
            return newInstance;
        }
        return arrayList.toArray((Object[]) Array.newInstance(cls, size));
    }

    @Override
    public final void write(lb.b bVar, Object obj) {
        if (obj == null) {
            bVar.i();
            return;
        }
        bVar.b();
        int length = Array.getLength(obj);
        for (int i10 = 0; i10 < length; i10++) {
            this.f8668b.write(bVar, Array.get(obj, i10));
        }
        bVar.e();
    }
}
