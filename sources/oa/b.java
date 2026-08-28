package oa;

import java.lang.reflect.Array;
import java.util.ArrayList;
public final class b extends la.u {
    public static final a f19112c = new a();
    public final Class f19113a;
    public final o f19114b;

    public b(la.g gVar, la.u uVar, Class cls) {
        this.f19114b = new o(gVar, uVar, cls);
        this.f19113a = cls;
    }

    @Override
    public final Object read(ta.a aVar) {
        if (aVar.x() == 9) {
            aVar.t();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        aVar.a();
        while (aVar.k()) {
            arrayList.add(((la.u) this.f19114b.f19153c).read(aVar));
        }
        aVar.e();
        int size = arrayList.size();
        Class cls = this.f19113a;
        if (cls.isPrimitive()) {
            Object newInstance = Array.newInstance(cls, size);
            for (int i9 = 0; i9 < size; i9++) {
                Array.set(newInstance, i9, arrayList.get(i9));
            }
            return newInstance;
        }
        return arrayList.toArray((Object[]) Array.newInstance(cls, size));
    }

    @Override
    public final void write(ta.c cVar, Object obj) {
        if (obj == null) {
            cVar.i();
            return;
        }
        cVar.b();
        int length = Array.getLength(obj);
        for (int i9 = 0; i9 < length; i9++) {
            this.f19114b.write(cVar, Array.get(obj, i9));
        }
        cVar.e();
    }
}
