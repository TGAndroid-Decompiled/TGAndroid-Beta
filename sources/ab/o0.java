package ab;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import java.util.HashSet;
import ji.d4;
import ji.m5;
public final class o0 extends Handler {
    public final int f446a;
    public final Object f447b;

    public o0(Object obj, int i10) {
        this.f446a = i10;
        this.f447b = obj;
    }

    private final void a(Message message) {
        oa.d dVar;
        Pair pair = (Pair) message.obj;
        Object obj = pair.first;
        Object obj2 = pair.second;
        int i10 = message.what;
        if (i10 != 1) {
            if (i10 == 2) {
                n2.b bVar = (n2.b) this.f447b;
                if (obj == bVar.f15938x && bVar.k()) {
                    bVar.f15938x = null;
                    synchronized (bVar.f15930o) {
                        d4 d4Var = bVar.f15939y;
                        d4Var.getClass();
                        dVar = new oa.d(14);
                        ((e9.k0) d4Var.f13233b).f();
                        bVar.f15939y = null;
                    }
                    if (!(obj2 instanceof Exception) && !(obj2 instanceof NoSuchMethodError)) {
                        try {
                            byte[] j02 = bVar.f15920b.j0(bVar.v, ((n2.w) obj2).f15981a);
                            if (bVar.f15937w != null && j02 != null && j02.length != 0) {
                                bVar.f15937w = j02;
                            }
                            bVar.f15931p = 4;
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
        n2.b bVar2 = (n2.b) this.f447b;
        n4.s sVar = bVar2.f15921c;
        if (obj == bVar2.f15940z) {
            if (bVar2.f15931p == 2 || bVar2.k()) {
                bVar2.f15940z = null;
                if (obj2 instanceof Exception) {
                    sVar.t((Exception) obj2, false);
                    return;
                }
                try {
                    bVar2.f15920b.k0(((n2.w) obj2).f15981a);
                    sVar.f16032c = null;
                    HashSet hashSet = (HashSet) sVar.f16031b;
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
                    sVar.t(e10, true);
                }
            }
        }
    }

    private final void b(Message message) {
        n4.n nVar;
        n4.l lVar;
        o0 o0Var;
        if (message.what == 1) {
            synchronized (((n4.l) this.f447b).f16009a) {
                nVar = (n4.n) ((n4.l) this.f447b).d.get();
                lVar = (n4.l) this.f447b;
                o0Var = lVar.e;
            }
            if (nVar != null && lVar == nVar.b() && o0Var != null) {
                nVar.d((n4.t) message.obj);
                ((n4.l) this.f447b).a(nVar, o0Var);
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
        this.f446a = i10;
        this.f447b = obj;
    }

    public o0(kd.h hVar) {
        super(Looper.getMainLooper());
        this.f446a = 0;
        this.f447b = hVar;
    }

    public o0(p4.g gVar) {
        super(Looper.getMainLooper());
        this.f446a = 10;
        this.f447b = gVar;
    }

    public o0(Looper looper, qi.e eVar) {
        super(looper);
        this.f446a = 4;
        this.f447b = eVar;
    }
}
