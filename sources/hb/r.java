package hb;

import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
public final class r extends eb.u {
    public static final p f11755c = new p(eb.t.f8578a, 1);
    public final eb.g f11756a;
    public final eb.t f11757b;

    public r(eb.g gVar, eb.t tVar) {
        this.f11756a = gVar;
        this.f11757b = tVar;
    }

    public final Serializable a(mb.a aVar, int i10) {
        int c10 = m1.j.c(i10);
        if (c10 != 5) {
            if (c10 != 6) {
                if (c10 != 7) {
                    if (c10 == 8) {
                        aVar.t();
                        return null;
                    }
                    throw new IllegalStateException("Unexpected token: ".concat(i0.a.E(i10)));
                }
                return Boolean.valueOf(aVar.n());
            }
            return this.f11757b.a(aVar);
        }
        return aVar.v();
    }

    @Override
    public final Object read(mb.a aVar) {
        Object arrayList;
        String str;
        Serializable arrayList2;
        boolean z10;
        int x10 = aVar.x();
        int c10 = m1.j.c(x10);
        if (c10 != 0) {
            if (c10 != 2) {
                arrayList = null;
            } else {
                aVar.b();
                arrayList = new gb.m(true);
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
                int c11 = m1.j.c(x11);
                if (c11 != 0) {
                    if (c11 != 2) {
                        arrayList2 = null;
                    } else {
                        aVar.b();
                        arrayList2 = new gb.m(true);
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
    public final void write(mb.b bVar, Object obj) {
        if (obj == null) {
            bVar.i();
            return;
        }
        Class<?> cls = obj.getClass();
        eb.g gVar = this.f11756a;
        gVar.getClass();
        eb.u b10 = gVar.b(new lb.a(cls));
        if (b10 instanceof r) {
            bVar.c();
            bVar.f();
            return;
        }
        b10.write(bVar, obj);
    }
}
