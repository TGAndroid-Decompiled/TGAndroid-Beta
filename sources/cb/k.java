package cb;

import ab.l;
import be.b1;
import be.d0;
import be.d2;
import be.f0;
import be.n0;
import be.v;
import be.x;
import be.x0;
import java.util.concurrent.locks.LockSupport;
import td.p;
public final class k {
    public static final n1.d f5076c = new n1.d("firebase_sessions_enabled");
    public static final n1.d d = new n1.d("firebase_sessions_sampling_rate");
    public static final n1.d e = new n1.d("firebase_sessions_restart_timeout");
    public static final n1.d f5077f = new n1.d("firebase_sessions_cache_duration");
    public static final n1.d f5078g = new n1.d("firebase_sessions_cache_updated_time");
    public final k1.f f5079a;
    public e f5080b;

    public k(k1.f fVar) {
        Object obj;
        kd.h hVar;
        long j10;
        this.f5079a = fVar;
        p lVar = new l(this, null, 3);
        Thread currentThread = Thread.currentThread();
        x0 a2 = d2.a();
        boolean booleanValue = ((Boolean) a2.fold(Boolean.FALSE, x.d)).booleanValue();
        if (!booleanValue) {
            hVar = a2;
        } else {
            kd.i iVar = kd.i.f15029a;
            if (booleanValue) {
                obj = a2.fold(iVar, x.f4334c);
            } else {
                obj = a2;
            }
            hVar = (kd.h) obj;
            iVar.plus(hVar);
        }
        ie.e eVar = n0.f4302a;
        if (hVar != eVar && hVar.get(kd.d.f15028a) == null) {
            hVar = hVar.plus(eVar);
        }
        be.h hVar2 = new be.h(hVar, currentThread, a2);
        hVar2.L(d0.f4267a, hVar2, lVar);
        x0 x0Var = hVar2.e;
        if (x0Var != null) {
            int i10 = x0.f4336f;
            x0Var.h(false);
        }
        while (!Thread.interrupted()) {
            try {
                if (x0Var != null) {
                    j10 = x0Var.i();
                } else {
                    j10 = Long.MAX_VALUE;
                }
                if (hVar2.u() instanceof b1) {
                    LockSupport.parkNanos(hVar2, j10);
                } else {
                    if (x0Var != null) {
                        int i11 = x0.f4336f;
                        x0Var.f(false);
                    }
                    Object u10 = f0.u(hVar2.u());
                    v vVar = u10 instanceof v ? (v) u10 : null;
                    if (vVar == null) {
                        return;
                    }
                    throw vVar.f4328a;
                }
            } catch (Throwable th2) {
                if (x0Var != null) {
                    int i12 = x0.f4336f;
                    x0Var.f(false);
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
        kVar.f5080b = new e((Boolean) bVar.a(f5076c), (Double) bVar.a(d), (Integer) bVar.a(e), (Integer) bVar.a(f5077f), (Long) bVar.a(f5078g));
    }

    public final boolean b() {
        e eVar = this.f5080b;
        if (eVar != null) {
            Long l4 = eVar.e;
            if (eVar != null) {
                Integer num = eVar.d;
                if (l4 != null && num != null && (System.currentTimeMillis() - l4.longValue()) / 1000 < num.intValue()) {
                    return false;
                }
                return true;
            }
            kotlin.jvm.internal.i.h("sessionConfigs");
            throw null;
        }
        kotlin.jvm.internal.i.h("sessionConfigs");
        throw null;
    }

    public final java.lang.Object c(n1.d r6, java.lang.Object r7, md.c r8) {
        throw new UnsupportedOperationException("Method not decompiled: cb.k.c(n1.d, java.lang.Object, md.c):java.lang.Object");
    }
}
