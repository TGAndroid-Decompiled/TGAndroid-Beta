package be;

import c8.u0;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import zd.b0;
import zd.c2;
public final class b implements c2 {
    public Object f3185a = e.f3210p;
    public zd.m f3186b;
    public final c f3187c;

    public b(c cVar) {
        this.f3187c = cVar;
    }

    @Override
    public final void a(ee.r rVar, int i7) {
        zd.m mVar = this.f3186b;
        if (mVar != null) {
            mVar.a(rVar, i7);
        }
    }

    public final Object b(ce.e eVar) {
        k kVar;
        k kVar2;
        Object obj = this.f3185a;
        boolean z9 = true;
        if (obj == e.f3210p || obj == e.f3206l) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c.h;
            c cVar = this.f3187c;
            k kVar3 = (k) atomicReferenceFieldUpdater.get(cVar);
            while (!cVar.r(c.f3188b.get(cVar), true)) {
                long andIncrement = c.f3189c.getAndIncrement(cVar);
                long j3 = e.f3198b;
                long j10 = andIncrement / j3;
                int i7 = (int) (andIncrement % j3);
                if (kVar3.f10794c != j10) {
                    k l10 = cVar.l(j10, kVar3);
                    if (l10 == null) {
                        continue;
                    } else {
                        kVar = l10;
                    }
                } else {
                    kVar = kVar3;
                }
                Object z10 = cVar.z(kVar, i7, andIncrement, null);
                com.google.android.gms.internal.clearcut.e eVar2 = e.f3207m;
                if (z10 != eVar2) {
                    com.google.android.gms.internal.clearcut.e eVar3 = e.f3209o;
                    if (z10 == eVar3) {
                        if (andIncrement < cVar.p()) {
                            kVar.b();
                        }
                        kVar3 = kVar;
                    } else if (z10 == e.f3208n) {
                        zd.m l11 = b0.l(u0.b(eVar));
                        try {
                            this.f3186b = l11;
                            try {
                                Object z11 = cVar.z(kVar, i7, andIncrement, this);
                                if (z11 == eVar2) {
                                    a(kVar, i7);
                                } else {
                                    if (z11 == eVar3) {
                                        if (andIncrement < cVar.p()) {
                                            kVar.b();
                                        }
                                        k kVar4 = (k) c.h.get(cVar);
                                        while (true) {
                                            if (cVar.r(c.f3188b.get(cVar), true)) {
                                                zd.m mVar = this.f3186b;
                                                kotlin.jvm.internal.j.b(mVar);
                                                this.f3186b = null;
                                                this.f3185a = e.f3206l;
                                                Throwable m10 = cVar.m();
                                                if (m10 == null) {
                                                    mVar.resumeWith(Boolean.FALSE);
                                                } else {
                                                    mVar.resumeWith(af.b.b(m10));
                                                }
                                            } else {
                                                long andIncrement2 = c.f3189c.getAndIncrement(cVar);
                                                long j11 = e.f3198b;
                                                long j12 = andIncrement2 / j11;
                                                int i10 = (int) (andIncrement2 % j11);
                                                if (kVar4.f10794c != j12) {
                                                    kVar2 = cVar.l(j12, kVar4);
                                                    if (kVar2 == null) {
                                                    }
                                                } else {
                                                    kVar2 = kVar4;
                                                }
                                                Object z12 = cVar.z(kVar2, i10, andIncrement2, this);
                                                if (z12 == e.f3207m) {
                                                    a(kVar2, i10);
                                                    break;
                                                } else if (z12 == e.f3209o) {
                                                    if (andIncrement2 < cVar.p()) {
                                                        kVar2.b();
                                                    }
                                                    kVar4 = kVar2;
                                                } else if (z12 != e.f3208n) {
                                                    kVar2.b();
                                                    this.f3185a = z12;
                                                    this.f3186b = null;
                                                } else {
                                                    throw new IllegalStateException("unexpected");
                                                }
                                            }
                                        }
                                    } else {
                                        kVar.b();
                                        this.f3185a = z11;
                                        this.f3186b = null;
                                    }
                                    l11.B(Boolean.TRUE, null);
                                }
                                Object r10 = l11.r();
                                jd.a aVar = jd.a.f16643a;
                                return r10;
                            } catch (Throwable th2) {
                                th = th2;
                                l11.A();
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    } else {
                        kVar.b();
                        this.f3185a = z10;
                        return Boolean.valueOf(z9);
                    }
                } else {
                    throw new IllegalStateException("unreachable");
                }
            }
            this.f3185a = e.f3206l;
            Throwable m11 = cVar.m();
            if (m11 == null) {
                z9 = false;
            } else {
                int i11 = ee.s.f10795a;
                throw m11;
            }
        }
        return Boolean.valueOf(z9);
    }
}
