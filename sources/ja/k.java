package ja;

import ha.l;
import hd.b1;
import hd.d0;
import hd.d2;
import hd.f0;
import hd.n0;
import hd.v;
import hd.x;
import hd.x0;
import java.util.concurrent.locks.LockSupport;
import zc.p;
public final class k {
    public static final n1.d f14279c = new n1.d("firebase_sessions_enabled");
    public static final n1.d d = new n1.d("firebase_sessions_sampling_rate");
    public static final n1.d f14280e = new n1.d("firebase_sessions_restart_timeout");
    public static final n1.d f14281f = new n1.d("firebase_sessions_cache_duration");
    public static final n1.d f14282g = new n1.d("firebase_sessions_cache_updated_time");
    public final k1.f f14283a;
    public e f14284b;

    public k(k1.f fVar) {
        Object obj;
        qc.h hVar;
        long j10;
        this.f14283a = fVar;
        p lVar = new l(this, null, 3);
        Thread currentThread = Thread.currentThread();
        x0 a2 = d2.a();
        boolean booleanValue = ((Boolean) a2.fold(Boolean.FALSE, x.d)).booleanValue();
        if (!booleanValue) {
            hVar = a2;
        } else {
            qc.i iVar = qc.i.f46140a;
            if (booleanValue) {
                obj = a2.fold(iVar, x.f10501c);
            } else {
                obj = a2;
            }
            hVar = (qc.h) obj;
            iVar.plus(hVar);
        }
        od.e eVar = n0.f10462a;
        if (hVar != eVar && hVar.get(qc.d.f46139a) == null) {
            hVar = hVar.plus(eVar);
        }
        hd.h hVar2 = new hd.h(hVar, currentThread, a2);
        hVar2.L(d0.f10419a, hVar2, lVar);
        x0 x0Var = hVar2.f10446e;
        if (x0Var != null) {
            int i9 = x0.f10503f;
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
                        int i10 = x0.f10503f;
                        x0Var.f(false);
                    }
                    Object u10 = f0.u(hVar2.u());
                    v vVar = u10 instanceof v ? (v) u10 : null;
                    if (vVar == null) {
                        return;
                    }
                    throw vVar.f10495a;
                }
            } catch (Throwable th) {
                if (x0Var != null) {
                    int i11 = x0.f10503f;
                    x0Var.f(false);
                }
                throw th;
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        hVar2.i(interruptedException);
        throw interruptedException;
    }

    public static final void a(k kVar, n1.b bVar) {
        kVar.getClass();
        kVar.f14284b = new e((Boolean) bVar.a(f14279c), (Double) bVar.a(d), (Integer) bVar.a(f14280e), (Integer) bVar.a(f14281f), (Long) bVar.a(f14282g));
    }

    public final boolean b() {
        e eVar = this.f14284b;
        if (eVar != null) {
            Long l10 = eVar.f14265e;
            if (eVar != null) {
                Integer num = eVar.d;
                if (l10 != null && num != null && (System.currentTimeMillis() - l10.longValue()) / 1000 < num.intValue()) {
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

    public final java.lang.Object c(n1.d r6, java.lang.Object r7, sc.c r8) {
        throw new UnsupportedOperationException("Method not decompiled: ja.k.c(n1.d, java.lang.Object, sc.c):java.lang.Object");
    }
}
