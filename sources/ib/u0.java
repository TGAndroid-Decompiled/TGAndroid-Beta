package ib;

import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
public class u0 extends fb.u {
    public static fb.i a(nb.a aVar, int i10) {
        int c10 = m1.j.c(i10);
        if (c10 != 5) {
            if (c10 != 6) {
                if (c10 != 7) {
                    if (c10 == 8) {
                        aVar.t();
                        return fb.k.f10395a;
                    }
                    throw new IllegalStateException("Unexpected token: ".concat(ic.a.C(i10)));
                }
                return new fb.m(Boolean.valueOf(aVar.n()));
            }
            return new fb.m(new hb.i(aVar.v()));
        }
        return new fb.m(aVar.v());
    }

    public static void b(fb.i iVar, nb.b bVar) {
        if (iVar != null && !(iVar instanceof fb.k)) {
            boolean z10 = iVar instanceof fb.m;
            if (z10) {
                if (z10) {
                    fb.m mVar = (fb.m) iVar;
                    Serializable serializable = mVar.f10397a;
                    if (serializable instanceof Number) {
                        bVar.q(mVar.q());
                        return;
                    } else if (serializable instanceof Boolean) {
                        bVar.s(mVar.o());
                        return;
                    } else {
                        bVar.r(mVar.m());
                        return;
                    }
                }
                throw new IllegalStateException("Not a JSON Primitive: " + iVar);
            }
            boolean z11 = iVar instanceof fb.h;
            if (z11) {
                bVar.b();
                if (z11) {
                    ArrayList arrayList = ((fb.h) iVar).f10394a;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        b((fb.i) obj, bVar);
                    }
                    bVar.e();
                    return;
                }
                throw new IllegalStateException("Not a JSON Array: " + iVar);
            } else if (iVar instanceof fb.l) {
                bVar.c();
                Iterator it = ((hb.k) iVar.h().f10396a.entrySet()).iterator();
                while (((hb.j) it).hasNext()) {
                    hb.l b10 = ((hb.j) it).b();
                    bVar.g((String) b10.getKey());
                    b((fb.i) b10.getValue(), bVar);
                }
                bVar.f();
                return;
            } else {
                throw new IllegalArgumentException("Couldn't write " + iVar.getClass());
            }
        }
        bVar.i();
    }

    @Override
    public final Object read(nb.a aVar) {
        fb.i hVar;
        String str;
        fb.i hVar2;
        boolean z10;
        if (aVar instanceof l) {
            l lVar = (l) aVar;
            int x9 = lVar.x();
            if (x9 != 5 && x9 != 2 && x9 != 4 && x9 != 10) {
                fb.i iVar = (fb.i) lVar.J();
                lVar.C();
                return iVar;
            }
            throw new IllegalStateException("Unexpected " + ic.a.C(x9) + " when reading a JsonElement.");
        }
        int x10 = aVar.x();
        int c10 = m1.j.c(x10);
        if (c10 != 0) {
            if (c10 != 2) {
                hVar = null;
            } else {
                aVar.b();
                hVar = new fb.l();
            }
        } else {
            aVar.a();
            hVar = new fb.h();
        }
        if (hVar == null) {
            return a(aVar, x10);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (aVar.k()) {
                if (hVar instanceof fb.l) {
                    str = aVar.r();
                } else {
                    str = null;
                }
                int x11 = aVar.x();
                int c11 = m1.j.c(x11);
                if (c11 != 0) {
                    if (c11 != 2) {
                        hVar2 = null;
                    } else {
                        aVar.b();
                        hVar2 = new fb.l();
                    }
                } else {
                    aVar.a();
                    hVar2 = new fb.h();
                }
                if (hVar2 != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (hVar2 == null) {
                    hVar2 = a(aVar, x11);
                }
                if (hVar instanceof fb.h) {
                    ((fb.h) hVar).f10394a.add(hVar2);
                } else {
                    ((fb.l) hVar).n(str, hVar2);
                }
                if (z10) {
                    arrayDeque.addLast(hVar);
                    hVar = hVar2;
                }
            } else {
                if (hVar instanceof fb.h) {
                    aVar.e();
                } else {
                    aVar.f();
                }
                if (arrayDeque.isEmpty()) {
                    return hVar;
                }
                hVar = (fb.i) arrayDeque.removeLast();
            }
        }
    }

    @Override
    public final void write(nb.b bVar, Object obj) {
        b((fb.i) obj, bVar);
    }
}
