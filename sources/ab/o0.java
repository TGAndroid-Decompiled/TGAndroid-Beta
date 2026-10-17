package ab;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import java.util.HashSet;
public final class o0 extends Handler {
    public final int f449a;
    public final Object f450b;

    public o0(Object obj, int i10) {
        this.f449a = i10;
        this.f450b = obj;
    }

    private final void a(Message message) {
        oa.d dVar;
        Pair pair = (Pair) message.obj;
        Object obj = pair.first;
        Object obj2 = pair.second;
        int i10 = message.what;
        if (i10 != 1) {
            if (i10 == 2) {
                n2.b bVar = (n2.b) this.f450b;
                if (obj == bVar.f17028x && bVar.k()) {
                    bVar.f17028x = null;
                    synchronized (bVar.f17020o) {
                        le.b bVar2 = bVar.f17029y;
                        bVar2.getClass();
                        dVar = new oa.d(14);
                        ((e9.k0) bVar2.f16003b).f();
                        bVar.f17029y = null;
                    }
                    if (!(obj2 instanceof Exception) && !(obj2 instanceof NoSuchMethodError)) {
                        try {
                            byte[] g02 = bVar.f17010b.g0(bVar.v, ((n2.w) obj2).f17071a);
                            if (bVar.f17027w != null && g02 != null && g02.length != 0) {
                                bVar.f17027w = g02;
                            }
                            bVar.f17021p = 4;
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
        n2.b bVar3 = (n2.b) this.f450b;
        n2.e eVar = bVar3.f17011c;
        if (obj == bVar3.f17030z) {
            if (bVar3.f17021p == 2 || bVar3.k()) {
                bVar3.f17030z = null;
                if (obj2 instanceof Exception) {
                    eVar.X((Exception) obj2, false);
                    return;
                }
                try {
                    bVar3.f17010b.j0(((n2.w) obj2).f17071a);
                    eVar.f17036c = null;
                    HashSet hashSet = (HashSet) eVar.f17035b;
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
            synchronized (((n4.l) this.f450b).f17099a) {
                nVar = (n4.n) ((n4.l) this.f450b).d.get();
                lVar = (n4.l) this.f450b;
                o0Var = lVar.e;
            }
            if (nVar != null && lVar == nVar.b() && o0Var != null) {
                nVar.d((n4.t) message.obj);
                ((n4.l) this.f450b).a(nVar, o0Var);
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
        this.f449a = i10;
        this.f450b = obj;
    }

    public o0(kd.h hVar) {
        super(Looper.getMainLooper());
        this.f449a = 0;
        this.f450b = hVar;
    }

    public o0(p4.g gVar) {
        super(Looper.getMainLooper());
        this.f449a = 10;
        this.f450b = gVar;
    }

    public o0(Looper looper, qi.e eVar) {
        super(looper);
        this.f449a = 4;
        this.f450b = eVar;
    }
}
