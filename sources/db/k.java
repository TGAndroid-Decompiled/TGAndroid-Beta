package db;

import bb.l;
import ce.b1;
import ce.d0;
import ce.d2;
import ce.f0;
import ce.n0;
import ce.v;
import ce.x;
import ce.x0;
import java.util.concurrent.locks.LockSupport;
import ud.p;
public final class k {
    public static final n1.d f8304c = new n1.d("firebase_sessions_enabled");
    public static final n1.d d = new n1.d("firebase_sessions_sampling_rate");
    public static final n1.d e = new n1.d("firebase_sessions_restart_timeout");
    public static final n1.d f8305f = new n1.d("firebase_sessions_cache_duration");
    public static final n1.d f8306g = new n1.d("firebase_sessions_cache_updated_time");
    public final k1.f f8307a;
    public e f8308b;

    public k(k1.f fVar) {
        Object obj;
        ld.h hVar;
        long j10;
        this.f8307a = fVar;
        p lVar = new l(this, null, 3);
        Thread currentThread = Thread.currentThread();
        x0 a2 = d2.a();
        boolean booleanValue = ((Boolean) a2.fold(Boolean.FALSE, x.d)).booleanValue();
        if (!booleanValue) {
            hVar = a2;
        } else {
            ld.i iVar = ld.i.f16988a;
            if (booleanValue) {
                obj = a2.fold(iVar, x.f6277c);
            } else {
                obj = a2;
            }
            hVar = (ld.h) obj;
            iVar.plus(hVar);
        }
        je.e eVar = n0.f6245a;
        if (hVar != eVar && hVar.get(ld.d.f16987a) == null) {
            hVar = hVar.plus(eVar);
        }
        ce.h hVar2 = new ce.h(hVar, currentThread, a2);
        hVar2.L(d0.f6210a, hVar2, lVar);
        x0 x0Var = hVar2.e;
        if (x0Var != null) {
            int i10 = x0.f6279f;
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
                        int i11 = x0.f6279f;
                        x0Var.f(false);
                    }
                    Object u10 = f0.u(hVar2.u());
                    v vVar = u10 instanceof v ? (v) u10 : null;
                    if (vVar == null) {
                        return;
                    }
                    throw vVar.f6271a;
                }
            } catch (Throwable th2) {
                if (x0Var != null) {
                    int i12 = x0.f6279f;
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
        kVar.f8308b = new e((Boolean) bVar.a(f8304c), (Double) bVar.a(d), (Integer) bVar.a(e), (Integer) bVar.a(f8305f), (Long) bVar.a(f8306g));
    }

    public final boolean b() {
        e eVar = this.f8308b;
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

    public final java.lang.Object c(n1.d r6, java.lang.Object r7, nd.c r8) {
        throw new UnsupportedOperationException("Method not decompiled: db.k.c(n1.d, java.lang.Object, nd.c):java.lang.Object");
    }
}
