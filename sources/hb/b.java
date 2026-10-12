package hb;

import java.lang.reflect.Array;
import java.util.ArrayList;
public final class b extends eb.u {
    public static final a f10401c = new a();
    public final Class f10402a;
    public final o f10403b;

    public b(eb.g gVar, eb.u uVar, Class cls) {
        this.f10403b = new o(gVar, uVar, cls);
        this.f10402a = cls;
    }

    @Override
    public final Object read(mb.a aVar) {
        if (aVar.x() == 9) {
            aVar.t();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        aVar.a();
        while (aVar.k()) {
            arrayList.add(((eb.u) this.f10403b.f10441c).read(aVar));
        }
        aVar.e();
        int size = arrayList.size();
        Class cls = this.f10402a;
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
    public final void write(mb.b bVar, Object obj) {
        if (obj == null) {
            bVar.i();
            return;
        }
        bVar.b();
        int length = Array.getLength(obj);
        for (int i10 = 0; i10 < length; i10++) {
            this.f10403b.write(bVar, Array.get(obj, i10));
        }
        bVar.e();
    }
}
