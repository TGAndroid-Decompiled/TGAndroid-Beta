package be;

import aa.b0;
import c8.v0;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import zd.c2;
public final class b implements c2 {
    public Object f3143a = e.f3168p;
    public zd.m f3144b;
    public final c f3145c;

    public b(c cVar) {
        this.f3145c = cVar;
    }

    @Override
    public final void a(ee.r rVar, int i7) {
        zd.m mVar = this.f3144b;
        if (mVar != null) {
            mVar.a(rVar, i7);
        }
    }

    public final Object b(ce.e eVar) {
        k kVar;
        k kVar2;
        Object obj = this.f3143a;
        boolean z10 = true;
        if (obj == e.f3168p || obj == e.f3164l) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c.h;
            c cVar = this.f3145c;
            k kVar3 = (k) atomicReferenceFieldUpdater.get(cVar);
            while (!cVar.r(c.f3146b.get(cVar), true)) {
                long andIncrement = c.f3147c.getAndIncrement(cVar);
                long j3 = e.f3156b;
                long j10 = andIncrement / j3;
                int i7 = (int) (andIncrement % j3);
                if (kVar3.f10630c != j10) {
                    k l10 = cVar.l(j10, kVar3);
                    if (l10 == null) {
                        continue;
                    } else {
                        kVar = l10;
                    }
                } else {
                    kVar = kVar3;
                }
                Object z11 = cVar.z(kVar, i7, andIncrement, null);
                b0 b0Var = e.f3165m;
                if (z11 != b0Var) {
                    b0 b0Var2 = e.f3167o;
                    if (z11 == b0Var2) {
                        if (andIncrement < cVar.p()) {
                            kVar.b();
                        }
                        kVar3 = kVar;
                    } else if (z11 == e.f3166n) {
                        zd.m l11 = zd.b0.l(v0.b(eVar));
                        try {
                            this.f3144b = l11;
                            try {
                                Object z12 = cVar.z(kVar, i7, andIncrement, this);
                                if (z12 == b0Var) {
                                    a(kVar, i7);
                                } else {
                                    if (z12 == b0Var2) {
                                        if (andIncrement < cVar.p()) {
                                            kVar.b();
                                        }
                                        k kVar4 = (k) c.h.get(cVar);
                                        while (true) {
                                            if (cVar.r(c.f3146b.get(cVar), true)) {
                                                zd.m mVar = this.f3144b;
                                                kotlin.jvm.internal.j.b(mVar);
                                                this.f3144b = null;
                                                this.f3143a = e.f3164l;
                                                Throwable m10 = cVar.m();
                                                if (m10 == null) {
                                                    mVar.resumeWith(Boolean.FALSE);
                                                } else {
                                                    mVar.resumeWith(af.b.b(m10));
                                                }
                                            } else {
                                                long andIncrement2 = c.f3147c.getAndIncrement(cVar);
                                                long j11 = e.f3156b;
                                                long j12 = andIncrement2 / j11;
                                                int i10 = (int) (andIncrement2 % j11);
                                                if (kVar4.f10630c != j12) {
                                                    kVar2 = cVar.l(j12, kVar4);
                                                    if (kVar2 == null) {
                                                    }
                                                } else {
                                                    kVar2 = kVar4;
                                                }
                                                Object z13 = cVar.z(kVar2, i10, andIncrement2, this);
                                                if (z13 == e.f3165m) {
                                                    a(kVar2, i10);
                                                    break;
                                                } else if (z13 == e.f3167o) {
                                                    if (andIncrement2 < cVar.p()) {
                                                        kVar2.b();
                                                    }
                                                    kVar4 = kVar2;
                                                } else if (z13 != e.f3166n) {
                                                    kVar2.b();
                                                    this.f3143a = z13;
                                                    this.f3144b = null;
                                                } else {
                                                    throw new IllegalStateException("unexpected");
                                                }
                                            }
                                        }
                                    } else {
                                        kVar.b();
                                        this.f3143a = z12;
                                        this.f3144b = null;
                                    }
                                    l11.B(Boolean.TRUE, null);
                                }
                                Object r10 = l11.r();
                                jd.a aVar = jd.a.f16999a;
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
                        this.f3143a = z11;
                        return Boolean.valueOf(z10);
                    }
                } else {
                    throw new IllegalStateException("unreachable");
                }
            }
            this.f3143a = e.f3164l;
            Throwable m11 = cVar.m();
            if (m11 == null) {
                z10 = false;
            } else {
                int i11 = ee.s.f10631a;
                throw m11;
            }
        }
        return Boolean.valueOf(z10);
    }
}
