package gb;

import java.lang.reflect.Array;
import java.util.ArrayList;
public final class b extends db.u {
    public static final a f10503c = new a();
    public final Class f10504a;
    public final o f10505b;

    public b(db.g gVar, db.u uVar, Class cls) {
        this.f10505b = new o(gVar, uVar, cls);
        this.f10504a = cls;
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
            arrayList.add(((db.u) this.f10505b.f10544c).read(aVar));
        }
        aVar.e();
        int size = arrayList.size();
        Class cls = this.f10504a;
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
            this.f10505b.write(bVar, Array.get(obj, i10));
        }
        bVar.e();
    }
}
