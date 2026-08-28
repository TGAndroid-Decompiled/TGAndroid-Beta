package oa;

import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
public class u0 extends la.u {
    public static la.i a(ta.a aVar, int i9) {
        int b10 = m1.j.b(i9);
        if (b10 != 5) {
            if (b10 != 6) {
                if (b10 != 7) {
                    if (b10 == 8) {
                        aVar.t();
                        return la.k.f16726a;
                    }
                    throw new IllegalStateException("Unexpected token: ".concat(ta.b.k(i9)));
                }
                return new la.m(Boolean.valueOf(aVar.n()));
            }
            return new la.m(new na.i(aVar.v()));
        }
        return new la.m(aVar.v());
    }

    public static void b(la.i iVar, ta.c cVar) {
        if (iVar != null && !(iVar instanceof la.k)) {
            boolean z10 = iVar instanceof la.m;
            if (z10) {
                if (z10) {
                    la.m mVar = (la.m) iVar;
                    Serializable serializable = mVar.f16728a;
                    if (serializable instanceof Number) {
                        cVar.q(mVar.r());
                        return;
                    } else if (serializable instanceof Boolean) {
                        cVar.s(mVar.p());
                        return;
                    } else {
                        cVar.r(mVar.n());
                        return;
                    }
                }
                throw new IllegalStateException("Not a JSON Primitive: " + iVar);
            }
            boolean z11 = iVar instanceof la.h;
            if (z11) {
                cVar.b();
                if (z11) {
                    ArrayList arrayList = ((la.h) iVar).f16725a;
                    int size = arrayList.size();
                    int i9 = 0;
                    while (i9 < size) {
                        Object obj = arrayList.get(i9);
                        i9++;
                        b((la.i) obj, cVar);
                    }
                    cVar.e();
                    return;
                }
                throw new IllegalStateException("Not a JSON Array: " + iVar);
            } else if (iVar instanceof la.l) {
                cVar.c();
                Iterator it = ((na.k) iVar.i().f16727a.entrySet()).iterator();
                while (((na.j) it).hasNext()) {
                    na.l b10 = ((na.j) it).b();
                    cVar.g((String) b10.getKey());
                    b((la.i) b10.getValue(), cVar);
                }
                cVar.f();
                return;
            } else {
                throw new IllegalArgumentException("Couldn't write " + iVar.getClass());
            }
        }
        cVar.i();
    }

    @Override
    public final Object read(ta.a aVar) {
        la.i hVar;
        String str;
        la.i hVar2;
        boolean z10;
        if (aVar instanceof l) {
            l lVar = (l) aVar;
            int x10 = lVar.x();
            if (x10 != 5 && x10 != 2 && x10 != 4 && x10 != 10) {
                la.i iVar = (la.i) lVar.J();
                lVar.C();
                return iVar;
            }
            throw new IllegalStateException("Unexpected " + ta.b.k(x10) + " when reading a JsonElement.");
        }
        int x11 = aVar.x();
        int b10 = m1.j.b(x11);
        if (b10 != 0) {
            if (b10 != 2) {
                hVar = null;
            } else {
                aVar.b();
                hVar = new la.l();
            }
        } else {
            aVar.a();
            hVar = new la.h();
        }
        if (hVar == null) {
            return a(aVar, x11);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (aVar.k()) {
                if (hVar instanceof la.l) {
                    str = aVar.r();
                } else {
                    str = null;
                }
                int x12 = aVar.x();
                int b11 = m1.j.b(x12);
                if (b11 != 0) {
                    if (b11 != 2) {
                        hVar2 = null;
                    } else {
                        aVar.b();
                        hVar2 = new la.l();
                    }
                } else {
                    aVar.a();
                    hVar2 = new la.h();
                }
                if (hVar2 != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (hVar2 == null) {
                    hVar2 = a(aVar, x12);
                }
                if (hVar instanceof la.h) {
                    ((la.h) hVar).f16725a.add(hVar2);
                } else {
                    ((la.l) hVar).o(str, hVar2);
                }
                if (z10) {
                    arrayDeque.addLast(hVar);
                    hVar = hVar2;
                }
            } else {
                if (hVar instanceof la.h) {
                    aVar.e();
                } else {
                    aVar.f();
                }
                if (arrayDeque.isEmpty()) {
                    return hVar;
                }
                hVar = (la.i) arrayDeque.removeLast();
            }
        }
    }

    @Override
    public final void write(ta.c cVar, Object obj) {
        b((la.i) obj, cVar);
    }
}
