package la;

import bd.p;
import ja.l;
import java.util.concurrent.locks.LockSupport;
import jd.a1;
import jd.c2;
import jd.d0;
import jd.e0;
import jd.m0;
import jd.v;
import jd.w0;
import jd.x;
public final class k {
    public static final n1.d f15137c = new n1.d("firebase_sessions_enabled");
    public static final n1.d d = new n1.d("firebase_sessions_sampling_rate");
    public static final n1.d f15138e = new n1.d("firebase_sessions_restart_timeout");
    public static final n1.d f15139f = new n1.d("firebase_sessions_cache_duration");
    public static final n1.d f15140g = new n1.d("firebase_sessions_cache_updated_time");
    public final k1.f f15141a;
    public e f15142b;

    public k(k1.f fVar) {
        Object obj;
        sc.h hVar;
        long j10;
        this.f15141a = fVar;
        p lVar = new l(this, null, 6);
        Thread currentThread = Thread.currentThread();
        w0 a2 = c2.a();
        boolean booleanValue = ((Boolean) a2.fold(Boolean.FALSE, x.d)).booleanValue();
        if (!booleanValue) {
            hVar = a2;
        } else {
            sc.i iVar = sc.i.f47711a;
            if (booleanValue) {
                obj = a2.fold(iVar, x.f11539c);
            } else {
                obj = a2;
            }
            hVar = (sc.h) obj;
            iVar.plus(hVar);
        }
        qd.e eVar = m0.f11495a;
        if (hVar != eVar && hVar.get(sc.d.f47710a) == null) {
            hVar = hVar.plus(eVar);
        }
        jd.h hVar2 = new jd.h(hVar, currentThread, a2);
        hVar2.L(d0.f11455a, hVar2, lVar);
        w0 w0Var = hVar2.f11483e;
        if (w0Var != null) {
            int i10 = w0.f11535f;
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
                        int i11 = w0.f11535f;
                        w0Var.f(false);
                    }
                    Object u10 = e0.u(hVar2.u());
                    v vVar = u10 instanceof v ? (v) u10 : null;
                    if (vVar == null) {
                        return;
                    }
                    throw vVar.f11532a;
                }
            } catch (Throwable th2) {
                if (w0Var != null) {
                    int i12 = w0.f11535f;
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
        kVar.f15142b = new e((Boolean) bVar.a(f15137c), (Double) bVar.a(d), (Integer) bVar.a(f15138e), (Integer) bVar.a(f15139f), (Long) bVar.a(f15140g));
    }

    public final boolean b() {
        e eVar = this.f15142b;
        if (eVar != null) {
            Long l10 = eVar.f15123e;
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

    public final java.lang.Object c(n1.d r6, java.lang.Object r7, uc.c r8) {
        throw new UnsupportedOperationException("Method not decompiled: la.k.c(n1.d, java.lang.Object, uc.c):java.lang.Object");
    }
}
