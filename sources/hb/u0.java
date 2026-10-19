package hb;

import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
public class u0 extends eb.u {
    public static eb.i a(mb.a aVar, int i10) {
        int c10 = m1.j.c(i10);
        if (c10 != 5) {
            if (c10 != 6) {
                if (c10 != 7) {
                    if (c10 == 8) {
                        aVar.t();
                        return eb.k.f8575a;
                    }
                    throw new IllegalStateException("Unexpected token: ".concat(i2.e.E(i10)));
                }
                return new eb.m(Boolean.valueOf(aVar.n()));
            }
            return new eb.m(new gb.h(aVar.v()));
        }
        return new eb.m(aVar.v());
    }

    public static void b(eb.i iVar, mb.b bVar) {
        if (iVar != null && !(iVar instanceof eb.k)) {
            boolean z10 = iVar instanceof eb.m;
            if (z10) {
                if (z10) {
                    eb.m mVar = (eb.m) iVar;
                    Serializable serializable = mVar.f8577a;
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
            boolean z11 = iVar instanceof eb.h;
            if (z11) {
                bVar.b();
                if (z11) {
                    ArrayList arrayList = ((eb.h) iVar).f8574a;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        b((eb.i) obj, bVar);
                    }
                    bVar.e();
                    return;
                }
                throw new IllegalStateException("Not a JSON Array: " + iVar);
            } else if (iVar instanceof eb.l) {
                bVar.c();
                Iterator it = ((gb.k) iVar.h().f8576a.entrySet()).iterator();
                while (((gb.j) it).hasNext()) {
                    gb.l b10 = ((gb.j) it).b();
                    bVar.g((String) b10.getKey());
                    b((eb.i) b10.getValue(), bVar);
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
    public final Object read(mb.a aVar) {
        eb.i hVar;
        String str;
        eb.i hVar2;
        boolean z10;
        if (aVar instanceof l) {
            l lVar = (l) aVar;
            int x10 = lVar.x();
            if (x10 != 5 && x10 != 2 && x10 != 4 && x10 != 10) {
                eb.i iVar = (eb.i) lVar.J();
                lVar.C();
                return iVar;
            }
            throw new IllegalStateException("Unexpected " + i2.e.E(x10) + " when reading a JsonElement.");
        }
        int x11 = aVar.x();
        int c10 = m1.j.c(x11);
        if (c10 != 0) {
            if (c10 != 2) {
                hVar = null;
            } else {
                aVar.b();
                hVar = new eb.l();
            }
        } else {
            aVar.a();
            hVar = new eb.h();
        }
        if (hVar == null) {
            return a(aVar, x11);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (aVar.k()) {
                if (hVar instanceof eb.l) {
                    str = aVar.r();
                } else {
                    str = null;
                }
                int x12 = aVar.x();
                int c11 = m1.j.c(x12);
                if (c11 != 0) {
                    if (c11 != 2) {
                        hVar2 = null;
                    } else {
                        aVar.b();
                        hVar2 = new eb.l();
                    }
                } else {
                    aVar.a();
                    hVar2 = new eb.h();
                }
                if (hVar2 != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (hVar2 == null) {
                    hVar2 = a(aVar, x12);
                }
                if (hVar instanceof eb.h) {
                    ((eb.h) hVar).f8574a.add(hVar2);
                } else {
                    ((eb.l) hVar).n(str, hVar2);
                }
                if (z10) {
                    arrayDeque.addLast(hVar);
                    hVar = hVar2;
                }
            } else {
                if (hVar instanceof eb.h) {
                    aVar.e();
                } else {
                    aVar.f();
                }
                if (arrayDeque.isEmpty()) {
                    return hVar;
                }
                hVar = (eb.i) arrayDeque.removeLast();
            }
        }
    }

    @Override
    public final void write(mb.b bVar, Object obj) {
        b((eb.i) obj, bVar);
    }
}
