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
public final class l {
    public static final n1.d f3837c = new n1.d("firebase_sessions_enabled");
    public static final n1.d d = new n1.d("firebase_sessions_sampling_rate");
    public static final n1.d f3838e = new n1.d("firebase_sessions_restart_timeout");
    public static final n1.d f3839f = new n1.d("firebase_sessions_cache_duration");
    public static final n1.d f3840g = new n1.d("firebase_sessions_cache_updated_time");
    public final k1.f f3841a;
    public e f3842b;

    public l(k1.f fVar) {
        Object obj;
        jd.h hVar;
        long j3;
        this.f3841a = fVar;
        p iVar = new i(this, null, 0);
        Thread currentThread = Thread.currentThread();
        y0 a2 = e2.a();
        boolean booleanValue = ((Boolean) a2.fold(Boolean.FALSE, y.d)).booleanValue();
        if (!booleanValue) {
            hVar = a2;
        } else {
            jd.i iVar2 = jd.i.f14128a;
            if (booleanValue) {
                obj = a2.fold(iVar2, y.f518c);
            } else {
                obj = a2;
            }
            hVar = (jd.h) obj;
            iVar2.plus(hVar);
        }
        he.e eVar = o0.f480a;
        if (hVar != eVar && hVar.get(jd.d.f14127a) == null) {
            hVar = hVar.plus(eVar);
        }
        ae.h hVar2 = new ae.h(hVar, currentThread, a2);
        hVar2.L(e0.f438a, hVar2, iVar);
        y0 y0Var = hVar2.f461e;
        if (y0Var != null) {
            int i10 = y0.f520f;
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
                        int i11 = y0.f520f;
                        y0Var.f(false);
                    }
                    Object u10 = g0.u(hVar2.u());
                    v vVar = u10 instanceof v ? (v) u10 : null;
                    if (vVar == null) {
                        return;
                    }
                    throw vVar.f509a;
                }
            } catch (Throwable th2) {
                if (y0Var != null) {
                    int i12 = y0.f520f;
                    y0Var.f(false);
                }
                throw th2;
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        hVar2.i(interruptedException);
        throw interruptedException;
    }

    public static final void a(l lVar, n1.b bVar) {
        lVar.getClass();
        lVar.f3842b = new e((Boolean) bVar.a(f3837c), (Double) bVar.a(d), (Integer) bVar.a(f3838e), (Integer) bVar.a(f3839f), (Long) bVar.a(f3840g));
    }

    public final boolean b() {
        e eVar = this.f3842b;
        if (eVar != null) {
            Long l4 = eVar.f3820e;
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

    public final java.lang.Object c(n1.d r6, java.lang.Object r7, ld.c r8) {
        throw new UnsupportedOperationException("Method not decompiled: bb.l.c(n1.d, java.lang.Object, ld.c):java.lang.Object");
    }
}
