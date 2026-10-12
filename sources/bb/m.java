package bb;

import ae.c1;
import ae.e0;
import ae.e2;
import ae.g0;
import ae.o0;
import ae.v;
import ae.y;
import ae.y0;
import java.util.concurrent.locks.LockSupport;
import sd.p;
public final class m {
    public static final n1.d f3836c = new n1.d("firebase_sessions_enabled");
    public static final n1.d d = new n1.d("firebase_sessions_sampling_rate");
    public static final n1.d f3837e = new n1.d("firebase_sessions_restart_timeout");
    public static final n1.d f3838f = new n1.d("firebase_sessions_cache_duration");
    public static final n1.d f3839g = new n1.d("firebase_sessions_cache_updated_time");
    public final k1.f f3840a;
    public f f3841b;

    public m(k1.f fVar) {
        Object obj;
        jd.h hVar;
        long j3;
        this.f3840a = fVar;
        p jVar = new j(this, null, 0);
        Thread currentThread = Thread.currentThread();
        y0 a2 = e2.a();
        boolean booleanValue = ((Boolean) a2.fold(Boolean.FALSE, y.d)).booleanValue();
        if (!booleanValue) {
            hVar = a2;
        } else {
            jd.i iVar = jd.i.f14126a;
            if (booleanValue) {
                obj = a2.fold(iVar, y.f520c);
            } else {
                obj = a2;
            }
            hVar = (jd.h) obj;
            iVar.plus(hVar);
        }
        he.e eVar = o0.f482a;
        if (hVar != eVar && hVar.get(jd.d.f14125a) == null) {
            hVar = hVar.plus(eVar);
        }
        ae.h hVar2 = new ae.h(hVar, currentThread, a2);
        hVar2.L(e0.f440a, hVar2, jVar);
        y0 y0Var = hVar2.f463e;
        if (y0Var != null) {
            int i10 = y0.f522f;
            y0Var.h(false);
        }
        while (!Thread.interrupted()) {
            try {
                if (y0Var != null) {
                    j3 = y0Var.i();
                } else {
                    j3 = Long.MAX_VALUE;
                }
                if (hVar2.u() instanceof c1) {
                    LockSupport.parkNanos(hVar2, j3);
                } else {
                    if (y0Var != null) {
                        int i11 = y0.f522f;
                        y0Var.f(false);
                    }
                    Object u10 = g0.u(hVar2.u());
                    v vVar = u10 instanceof v ? (v) u10 : null;
                    if (vVar == null) {
                        return;
                    }
                    throw vVar.f511a;
                }
            } catch (Throwable th2) {
                if (y0Var != null) {
                    int i12 = y0.f522f;
                    y0Var.f(false);
                }
                throw th2;
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        hVar2.i(interruptedException);
        throw interruptedException;
    }

    public static final void a(m mVar, n1.b bVar) {
        mVar.getClass();
        mVar.f3841b = new f((Boolean) bVar.a(f3836c), (Double) bVar.a(d), (Integer) bVar.a(f3837e), (Integer) bVar.a(f3838f), (Long) bVar.a(f3839g));
    }

    public final boolean b() {
        f fVar = this.f3841b;
        if (fVar != null) {
            Long l4 = fVar.f3819e;
            if (fVar != null) {
                Integer num = fVar.d;
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

    public final java.lang.Object c(n1.d r6, java.lang.Object r7, ld.c r8) {
        throw new UnsupportedOperationException("Method not decompiled: bb.m.c(n1.d, java.lang.Object, ld.c):java.lang.Object");
    }
}
