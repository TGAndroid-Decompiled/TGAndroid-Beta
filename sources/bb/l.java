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
    public static final n1.d f2178c = new n1.d("firebase_sessions_enabled");
    public static final n1.d d = new n1.d("firebase_sessions_sampling_rate");
    public static final n1.d e = new n1.d("firebase_sessions_restart_timeout");
    public static final n1.d f2179f = new n1.d("firebase_sessions_cache_duration");
    public static final n1.d f2180g = new n1.d("firebase_sessions_cache_updated_time");
    public final k1.f f2181a;
    public e f2182b;

    public l(k1.f fVar) {
        Object obj;
        id.h hVar;
        long j3;
        this.f2181a = fVar;
        p iVar = new i(this, null, 0);
        Thread currentThread = Thread.currentThread();
        w0 a2 = c2.a();
        boolean booleanValue = ((Boolean) a2.fold(Boolean.FALSE, x.d)).booleanValue();
        if (!booleanValue) {
            hVar = a2;
        } else {
            id.i iVar2 = id.i.f10565a;
            if (booleanValue) {
                obj = a2.fold(iVar2, x.f48063c);
            } else {
                obj = a2;
            }
            hVar = (id.h) obj;
            iVar2.plus(hVar);
        }
        ge.e eVar = m0.f48027a;
        if (hVar != eVar && hVar.get(id.d.f10564a) == null) {
            hVar = hVar.plus(eVar);
        }
        zd.h hVar2 = new zd.h(hVar, currentThread, a2);
        hVar2.L(d0.f47995a, hVar2, iVar);
        w0 w0Var = hVar2.e;
        if (w0Var != null) {
            int i10 = w0.f48060f;
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
                        int i11 = w0.f48060f;
                        w0Var.f(false);
                    }
                    Object u10 = e0.u(hVar2.u());
                    v vVar = u10 instanceof v ? (v) u10 : null;
                    if (vVar == null) {
                        return;
                    }
                    throw vVar.f48057a;
                }
            } catch (Throwable th2) {
                if (w0Var != null) {
                    int i12 = w0.f48060f;
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
        lVar.f2182b = new e((Boolean) bVar.a(f2178c), (Double) bVar.a(d), (Integer) bVar.a(e), (Integer) bVar.a(f2179f), (Long) bVar.a(f2180g));
    }

    public final boolean b() {
        e eVar = this.f2182b;
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
