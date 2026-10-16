package ab;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import java.util.HashSet;
import ji.h5;
import ji.m5;
import z7.xf;
public final class o0 extends Handler {
    public final int f450a;
    public final Object f451b;

    public o0(Object obj, int i10) {
        this.f450a = i10;
        this.f451b = obj;
    }

    private final void a(Message message) {
        oa.d dVar;
        Pair pair = (Pair) message.obj;
        Object obj = pair.first;
        Object obj2 = pair.second;
        int i10 = message.what;
        if (i10 != 1) {
            if (i10 == 2) {
                n2.b bVar = (n2.b) this.f451b;
                if (obj == bVar.f15652x && bVar.k()) {
                    bVar.f15652x = null;
                    synchronized (bVar.f15644o) {
                        h5 h5Var = bVar.f15653y;
                        h5Var.getClass();
                        dVar = new oa.d(14);
                        ((e9.k0) h5Var.f13315b).f();
                        bVar.f15653y = null;
                    }
                    if (!(obj2 instanceof Exception) && !(obj2 instanceof NoSuchMethodError)) {
                        try {
                            byte[] g02 = bVar.f15634b.g0(bVar.v, ((n2.v) obj2).f15692a);
                            if (bVar.f15651w != null && g02 != null && g02.length != 0) {
                                bVar.f15651w = g02;
                            }
                            bVar.f15645p = 4;
                            bVar.i(new m5(dVar, 10));
                            return;
                        } catch (Exception e) {
                            e = e;
                            bVar.m(e, true);
                            return;
                        } catch (NoSuchMethodError e7) {
                            e = e7;
                            bVar.m(e, true);
                            return;
                        }
                    }
                    bVar.m((Throwable) obj2, false);
                    return;
                }
                return;
            }
            return;
        }
        n2.b bVar2 = (n2.b) this.f451b;
        xf xfVar = bVar2.f15635c;
        if (obj == bVar2.f15654z) {
            if (bVar2.f15645p == 2 || bVar2.k()) {
                bVar2.f15654z = null;
                if (obj2 instanceof Exception) {
                    xfVar.a((Exception) obj2, false);
                    return;
                }
                try {
                    bVar2.f15634b.j0(((n2.v) obj2).f15692a);
                    xfVar.f49869b = null;
                    HashSet hashSet = (HashSet) xfVar.f49868a;
                    e9.n0 u10 = e9.n0.u(hashSet);
                    hashSet.clear();
                    e9.l0 listIterator = u10.listIterator(0);
                    while (listIterator.hasNext()) {
                        n2.b bVar3 = (n2.b) listIterator.next();
                        if (bVar3.n()) {
                            bVar3.j(true);
                        }
                    }
                } catch (Exception e10) {
                    xfVar.a(e10, true);
                }
            }
        }
    }

    private final void b(Message message) {
        n4.n nVar;
        n4.l lVar;
        o0 o0Var;
        if (message.what == 1) {
            synchronized (((n4.l) this.f451b).f15723a) {
                nVar = (n4.n) ((n4.l) this.f451b).d.get();
                lVar = (n4.l) this.f451b;
                o0Var = lVar.e;
            }
            if (nVar != null && lVar == nVar.b() && o0Var != null) {
                nVar.d((n4.t) message.obj);
                ((n4.l) this.f451b).a(nVar, o0Var);
                nVar.d(null);
            }
        }
    }

    @Override
    public final void handleMessage(android.os.Message r12) {
        throw new UnsupportedOperationException("Method not decompiled: ab.o0.handleMessage(android.os.Message):void");
    }

    public o0(Object obj, Looper looper, int i10) {
        super(looper);
        this.f450a = i10;
        this.f451b = obj;
    }

    public o0(kd.h hVar) {
        super(Looper.getMainLooper());
        this.f450a = 0;
        this.f451b = hVar;
    }

    public o0(p4.g gVar) {
        super(Looper.getMainLooper());
        this.f450a = 10;
        this.f451b = gVar;
    }

    public o0(Looper looper, pi.e eVar) {
        super(looper);
        this.f450a = 4;
        this.f451b = eVar;
    }
}
