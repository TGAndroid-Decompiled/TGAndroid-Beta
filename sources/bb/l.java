package bb;

import java.util.concurrent.locks.LockSupport;
import rd.p;
import zd.a1;
import zd.c2;
import zd.d0;
import zd.e0;
import zd.m0;
import zd.v;
import zd.w0;
import zd.x;
public final class l {
    public static final n1.d f3485c = new n1.d("firebase_sessions_enabled");
    public static final n1.d d = new n1.d("firebase_sessions_sampling_rate");
    public static final n1.d e = new n1.d("firebase_sessions_restart_timeout");
    public static final n1.d f3486f = new n1.d("firebase_sessions_cache_duration");
    public static final n1.d f3487g = new n1.d("firebase_sessions_cache_updated_time");
    public final k1.f f3488a;
    public e f3489b;

    public l(k1.f fVar) {
        Object obj;
        id.h hVar;
        long j3;
        this.f3488a = fVar;
        p iVar = new i(this, null, 0);
        Thread currentThread = Thread.currentThread();
        w0 a2 = c2.a();
        boolean booleanValue = ((Boolean) a2.fold(Boolean.FALSE, x.d)).booleanValue();
        if (!booleanValue) {
            hVar = a2;
        } else {
            id.i iVar2 = id.i.f11084a;
            if (booleanValue) {
                obj = a2.fold(iVar2, x.f48972c);
            } else {
                obj = a2;
            }
            hVar = (id.h) obj;
            iVar2.plus(hVar);
        }
        ge.e eVar = m0.f48936a;
        if (hVar != eVar && hVar.get(id.d.f11083a) == null) {
            hVar = hVar.plus(eVar);
        }
        zd.h hVar2 = new zd.h(hVar, currentThread, a2);
        hVar2.L(d0.f48904a, hVar2, iVar);
        w0 w0Var = hVar2.e;
        if (w0Var != null) {
            int i10 = w0.f48969f;
            w0Var.h(false);
        }
        while (!Thread.interrupted()) {
            try {
                if (w0Var != null) {
                    j3 = w0Var.i();
                } else {
                    j3 = Long.MAX_VALUE;
                }
                if (hVar2.u() instanceof a1) {
                    LockSupport.parkNanos(hVar2, j3);
                } else {
                    if (w0Var != null) {
                        int i11 = w0.f48969f;
                        w0Var.f(false);
                    }
                    Object u10 = e0.u(hVar2.u());
                    v vVar = u10 instanceof v ? (v) u10 : null;
                    if (vVar == null) {
                        return;
                    }
                    throw vVar.f48966a;
                }
            } catch (Throwable th2) {
                if (w0Var != null) {
                    int i12 = w0.f48969f;
                    w0Var.f(false);
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
        lVar.f3489b = new e((Boolean) bVar.a(f3485c), (Double) bVar.a(d), (Integer) bVar.a(e), (Integer) bVar.a(f3486f), (Long) bVar.a(f3487g));
    }

    public final boolean b() {
        e eVar = this.f3489b;
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

    public final java.lang.Object c(n1.d r6, java.lang.Object r7, kd.c r8) {
        throw new UnsupportedOperationException("Method not decompiled: bb.l.c(n1.d, java.lang.Object, kd.c):java.lang.Object");
    }
}
