package ab;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import java.util.HashSet;
public final class o0 extends Handler {
    public final int f448a;
    public final Object f449b;

    public o0(Object obj, int i10) {
        this.f448a = i10;
        this.f449b = obj;
    }

    private final void a(Message message) {
        oa.d dVar;
        Pair pair = (Pair) message.obj;
        Object obj = pair.first;
        Object obj2 = pair.second;
        int i10 = message.what;
        if (i10 != 1) {
            if (i10 == 2) {
                n2.b bVar = (n2.b) this.f449b;
                if (obj == bVar.f17032x && bVar.k()) {
                    bVar.f17032x = null;
                    synchronized (bVar.f17024o) {
                        le.b bVar2 = bVar.f17033y;
                        bVar2.getClass();
                        dVar = new oa.d(14);
                        ((e9.k0) bVar2.f16009b).f();
                        bVar.f17033y = null;
                    }
                    if (!(obj2 instanceof Exception) && !(obj2 instanceof NoSuchMethodError)) {
                        try {
                            byte[] g02 = bVar.f17014b.g0(bVar.v, ((n2.w) obj2).f17075a);
                            if (bVar.f17031w != null && g02 != null && g02.length != 0) {
                                bVar.f17031w = g02;
                            }
                            bVar.f17025p = 4;
                            bVar.i(new j5.b(dVar, 19));
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
        n2.b bVar3 = (n2.b) this.f449b;
        n2.e eVar = bVar3.f17015c;
        if (obj == bVar3.f17034z) {
            if (bVar3.f17025p == 2 || bVar3.k()) {
                bVar3.f17034z = null;
                if (obj2 instanceof Exception) {
                    eVar.X((Exception) obj2, false);
                    return;
                }
                try {
                    bVar3.f17014b.j0(((n2.w) obj2).f17075a);
                    eVar.f17040c = null;
                    HashSet hashSet = (HashSet) eVar.f17039b;
                    e9.n0 u10 = e9.n0.u(hashSet);
                    hashSet.clear();
                    e9.l0 listIterator = u10.listIterator(0);
                    while (listIterator.hasNext()) {
                        n2.b bVar4 = (n2.b) listIterator.next();
                        if (bVar4.n()) {
                            bVar4.j(true);
                        }
                    }
                } catch (Exception e10) {
                    eVar.X(e10, true);
                }
            }
        }
    }

    private final void b(Message message) {
        n4.n nVar;
        n4.l lVar;
        o0 o0Var;
        if (message.what == 1) {
            synchronized (((n4.l) this.f449b).f17103a) {
                nVar = (n4.n) ((n4.l) this.f449b).d.get();
                lVar = (n4.l) this.f449b;
                o0Var = lVar.e;
            }
            if (nVar != null && lVar == nVar.b() && o0Var != null) {
                nVar.d((n4.t) message.obj);
                ((n4.l) this.f449b).a(nVar, o0Var);
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
        this.f448a = i10;
        this.f449b = obj;
    }

    public o0(kd.h hVar) {
        super(Looper.getMainLooper());
        this.f448a = 0;
        this.f449b = hVar;
    }

    public o0(p4.g gVar) {
        super(Looper.getMainLooper());
        this.f448a = 10;
        this.f449b = gVar;
    }

    public o0(Looper looper, qi.e eVar) {
        super(looper);
        this.f448a = 4;
        this.f449b = eVar;
    }
}
