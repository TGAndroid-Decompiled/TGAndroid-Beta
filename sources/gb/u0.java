package gb;

import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
public class u0 extends db.u {
    public static db.i a(lb.a aVar, int i10) {
        int c10 = m1.j.c(i10);
        if (c10 != 5) {
            if (c10 != 6) {
                if (c10 != 7) {
                    if (c10 == 8) {
                        aVar.t();
                        return db.k.f6709a;
                    }
                    throw new IllegalStateException("Unexpected token: ".concat(i2.g.E(i10)));
                }
                return new db.m(Boolean.valueOf(aVar.n()));
            }
            return new db.m(new fb.h(aVar.v()));
        }
        return new db.m(aVar.v());
    }

    public static void b(db.i iVar, lb.b bVar) {
        if (iVar != null && !(iVar instanceof db.k)) {
            boolean z10 = iVar instanceof db.m;
            if (z10) {
                if (z10) {
                    db.m mVar = (db.m) iVar;
                    Serializable serializable = mVar.f6711a;
                    if (serializable instanceof Number) {
                        bVar.q(mVar.r());
                        return;
                    } else if (serializable instanceof Boolean) {
                        bVar.s(mVar.p());
                        return;
                    } else {
                        bVar.r(mVar.n());
                        return;
                    }
                }
                throw new IllegalStateException("Not a JSON Primitive: " + iVar);
            }
            boolean z11 = iVar instanceof db.h;
            if (z11) {
                bVar.b();
                if (z11) {
                    ArrayList arrayList = ((db.h) iVar).f6708a;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        b((db.i) obj, bVar);
                    }
                    bVar.e();
                    return;
                }
                throw new IllegalStateException("Not a JSON Array: " + iVar);
            } else if (iVar instanceof db.l) {
                bVar.c();
                Iterator it = ((fb.k) iVar.i().f6710a.entrySet()).iterator();
                while (((fb.j) it).hasNext()) {
                    fb.l b10 = ((fb.j) it).b();
                    bVar.g((String) b10.getKey());
                    b((db.i) b10.getValue(), bVar);
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
    public final Object read(lb.a aVar) {
        db.i hVar;
        String str;
        db.i hVar2;
        boolean z10;
        if (aVar instanceof l) {
            l lVar = (l) aVar;
            int x10 = lVar.x();
            if (x10 != 5 && x10 != 2 && x10 != 4 && x10 != 10) {
                db.i iVar = (db.i) lVar.J();
                lVar.C();
                return iVar;
            }
            throw new IllegalStateException("Unexpected " + i2.g.E(x10) + " when reading a JsonElement.");
        }
        int x11 = aVar.x();
        int c10 = m1.j.c(x11);
        if (c10 != 0) {
            if (c10 != 2) {
                hVar = null;
            } else {
                aVar.b();
                hVar = new db.l();
            }
        } else {
            aVar.a();
            hVar = new db.h();
        }
        if (hVar == null) {
            return a(aVar, x11);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (aVar.k()) {
                if (hVar instanceof db.l) {
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
                        hVar2 = new db.l();
                    }
                } else {
                    aVar.a();
                    hVar2 = new db.h();
                }
                if (hVar2 != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (hVar2 == null) {
                    hVar2 = a(aVar, x12);
                }
                if (hVar instanceof db.h) {
                    ((db.h) hVar).f6708a.add(hVar2);
                } else {
                    ((db.l) hVar).o(str, hVar2);
                }
                if (z10) {
                    arrayDeque.addLast(hVar);
                    hVar = hVar2;
                }
            } else {
                if (hVar instanceof db.h) {
                    aVar.e();
                } else {
                    aVar.f();
                }
                if (arrayDeque.isEmpty()) {
                    return hVar;
                }
                hVar = (db.i) arrayDeque.removeLast();
            }
        }
    }

    @Override
    public final void write(lb.b bVar, Object obj) {
        b((db.i) obj, bVar);
    }
}
