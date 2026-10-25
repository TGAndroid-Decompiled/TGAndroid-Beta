package ib;

import java.lang.reflect.Array;
import java.util.ArrayList;
public final class b extends fb.u {
    public static final a f13910c = new a();
    public final Class f13911a;
    public final o f13912b;

    public b(fb.g gVar, fb.u uVar, Class cls) {
        this.f13912b = new o(gVar, uVar, cls);
        this.f13911a = cls;
    }

    @Override
    public final Object read(nb.a aVar) {
        if (aVar.x() == 9) {
            aVar.t();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        aVar.a();
        while (aVar.k()) {
            arrayList.add(((fb.u) this.f13912b.f13950c).read(aVar));
        }
        aVar.e();
        int size = arrayList.size();
        Class cls = this.f13911a;
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
    public final void write(nb.b bVar, Object obj) {
        if (obj == null) {
            bVar.i();
            return;
        }
        bVar.b();
        int length = Array.getLength(obj);
        for (int i10 = 0; i10 < length; i10++) {
            this.f13912b.write(bVar, Array.get(obj, i10));
        }
        bVar.e();
    }
}
