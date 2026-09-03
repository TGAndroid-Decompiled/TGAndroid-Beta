package na;

import dd.p;
import java.util.concurrent.locks.LockSupport;
import ld.a1;
import ld.c2;
import ld.d0;
import ld.e0;
import ld.m0;
import ld.v;
import ld.w0;
import ld.x;
public final class k {
    public static final n1.d f14877c = new n1.d("firebase_sessions_enabled");
    public static final n1.d d = new n1.d("firebase_sessions_sampling_rate");
    public static final n1.d e = new n1.d("firebase_sessions_restart_timeout");
    public static final n1.d f14878f = new n1.d("firebase_sessions_cache_duration");
    public static final n1.d f14879g = new n1.d("firebase_sessions_cache_updated_time");
    public final k1.g f14880a;
    public e f14881b;

    public k(k1.g gVar) {
        Object obj;
        uc.h hVar;
        long j10;
        this.f14880a = gVar;
        p cVar = new k1.c(this, (uc.c) null, 6);
        Thread currentThread = Thread.currentThread();
        w0 a2 = c2.a();
        boolean booleanValue = ((Boolean) a2.fold(Boolean.FALSE, x.d)).booleanValue();
        if (!booleanValue) {
            hVar = a2;
        } else {
            uc.i iVar = uc.i.f45281a;
            if (booleanValue) {
                obj = a2.fold(iVar, x.f12046c);
            } else {
                obj = a2;
            }
            hVar = (uc.h) obj;
            iVar.plus(hVar);
        }
        sd.e eVar = m0.f12010a;
        if (hVar != eVar && hVar.get(uc.d.f45280a) == null) {
            hVar = hVar.plus(eVar);
        }
        ld.h hVar2 = new ld.h(hVar, currentThread, a2);
        hVar2.L(d0.f11978a, hVar2, cVar);
        w0 w0Var = hVar2.e;
        if (w0Var != null) {
            int i10 = w0.f12043f;
            w0Var.h(false);
        }
        while (!Thread.interrupted()) {
            try {
                if (w0Var != null) {
                    j10 = w0Var.i();
                } else {
                    j10 = Long.MAX_VALUE;
                }
                if (hVar2.u() instanceof a1) {
                    LockSupport.parkNanos(hVar2, j10);
                } else {
                    if (w0Var != null) {
                        int i11 = w0.f12043f;
                        w0Var.f(false);
                    }
                    Object u10 = e0.u(hVar2.u());
                    v vVar = u10 instanceof v ? (v) u10 : null;
                    if (vVar == null) {
                        return;
                    }
                    throw vVar.f12040a;
                }
            } catch (Throwable th2) {
                if (w0Var != null) {
                    int i12 = w0.f12043f;
                    w0Var.f(false);
                }
                throw th2;
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        hVar2.i(interruptedException);
        throw interruptedException;
    }

    public static final void a(k kVar, n1.b bVar) {
        kVar.getClass();
        kVar.f14881b = new e((Boolean) bVar.a(f14877c), (Double) bVar.a(d), (Integer) bVar.a(e), (Integer) bVar.a(f14878f), (Long) bVar.a(f14879g));
    }

    public final boolean b() {
        e eVar = this.f14881b;
        if (eVar != null) {
            Long l10 = eVar.e;
            if (eVar != null) {
                Integer num = eVar.d;
                if (l10 != null && num != null && (System.currentTimeMillis() - l10.longValue()) / 1000 < num.intValue()) {
                    return false;
                }
                return true;
            }
            kotlin.jvm.internal.j.h("sessionConfigs");
            throw null;
        }
        kotlin.jvm.internal.j.h("sessionConfigs");
        throw null;
    }

    public final java.lang.Object c(n1.d r6, java.lang.Object r7, wc.c r8) {
        throw new UnsupportedOperationException("Method not decompiled: na.k.c(n1.d, java.lang.Object, wc.c):java.lang.Object");
    }
}
