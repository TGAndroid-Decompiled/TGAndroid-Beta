package oa;

import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
public final class r extends la.u {
    public static final p f19158c = new p(la.t.f16729a, 1);
    public final la.g f19159a;
    public final la.t f19160b;

    public r(la.g gVar, la.t tVar) {
        this.f19159a = gVar;
        this.f19160b = tVar;
    }

    public final Serializable a(ta.a aVar, int i9) {
        int b10 = m1.j.b(i9);
        if (b10 != 5) {
            if (b10 != 6) {
                if (b10 != 7) {
                    if (b10 == 8) {
                        aVar.t();
                        return null;
                    }
                    throw new IllegalStateException("Unexpected token: ".concat(ta.b.k(i9)));
                }
                return Boolean.valueOf(aVar.n());
            }
            return this.f19160b.a(aVar);
        }
        return aVar.v();
    }

    @Override
    public final Object read(ta.a aVar) {
        Object arrayList;
        String str;
        Serializable arrayList2;
        boolean z10;
        int x10 = aVar.x();
        int b10 = m1.j.b(x10);
        if (b10 != 0) {
            if (b10 != 2) {
                arrayList = null;
            } else {
                aVar.b();
                arrayList = new na.m(true);
            }
        } else {
            aVar.a();
            arrayList = new ArrayList();
        }
        if (arrayList == null) {
            return a(aVar, x10);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (aVar.k()) {
                if (arrayList instanceof Map) {
                    str = aVar.r();
                } else {
                    str = null;
                }
                int x11 = aVar.x();
                int b11 = m1.j.b(x11);
                if (b11 != 0) {
                    if (b11 != 2) {
                        arrayList2 = null;
                    } else {
                        aVar.b();
                        arrayList2 = new na.m(true);
                    }
                } else {
                    aVar.a();
                    arrayList2 = new ArrayList();
                }
                if (arrayList2 != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (arrayList2 == null) {
                    arrayList2 = a(aVar, x11);
                }
                if (arrayList instanceof List) {
                    ((List) arrayList).add(arrayList2);
                } else {
                    ((Map) arrayList).put(str, arrayList2);
                }
                if (z10) {
                    arrayDeque.addLast(arrayList);
                    arrayList = arrayList2;
                }
            } else {
                if (arrayList instanceof List) {
                    aVar.e();
                } else {
                    aVar.f();
                }
                if (arrayDeque.isEmpty()) {
                    return arrayList;
                }
                arrayList = arrayDeque.removeLast();
            }
        }
    }

    @Override
    public final void write(ta.c cVar, Object obj) {
        if (obj == null) {
            cVar.i();
            return;
        }
        Class<?> cls = obj.getClass();
        la.g gVar = this.f19159a;
        gVar.getClass();
        la.u b10 = gVar.b(new sa.a(cls));
        if (b10 instanceof r) {
            cVar.c();
            cVar.f();
            return;
        }
        b10.write(cVar, obj);
    }
}
