package hb;

import java.lang.reflect.Array;
import java.util.ArrayList;
public final class b extends eb.u {
    public static final a f10405c = new a();
    public final Class f10406a;
    public final o f10407b;

    public b(eb.g gVar, eb.u uVar, Class cls) {
        this.f10407b = new o(gVar, uVar, cls);
        this.f10406a = cls;
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
            arrayList.add(((eb.u) this.f10407b.f10445c).read(aVar));
        }
        aVar.e();
        int size = arrayList.size();
        Class cls = this.f10406a;
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
            this.f10407b.write(bVar, Array.get(obj, i10));
        }
        bVar.e();
    }
}
