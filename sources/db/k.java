package db;

import bb.l;
import java.util.concurrent.locks.LockSupport;
import ld.p;
import td.a1;
import td.d0;
import td.d2;
import td.e0;
import td.m0;
import td.v;
import td.w0;
import td.x;
public final class k {
    public static final n1.d f5857c = new n1.d("firebase_sessions_enabled");
    public static final n1.d d = new n1.d("firebase_sessions_sampling_rate");
    public static final n1.d e = new n1.d("firebase_sessions_restart_timeout");
    public static final n1.d f5858f = new n1.d("firebase_sessions_cache_duration");
    public static final n1.d f5859g = new n1.d("firebase_sessions_cache_updated_time");
    public final k1.f f5860a;
    public e f5861b;

    public k(k1.f fVar) {
        Object obj;
        cd.h hVar;
        long j10;
        this.f5860a = fVar;
        p lVar = new l(this, null, 3);
        Thread currentThread = Thread.currentThread();
        w0 a2 = d2.a();
        boolean booleanValue = ((Boolean) a2.fold(Boolean.FALSE, x.d)).booleanValue();
        if (!booleanValue) {
            hVar = a2;
        } else {
            cd.i iVar = cd.i.f4123a;
            if (booleanValue) {
                obj = a2.fold(iVar, x.f48677c);
            } else {
                obj = a2;
            }
            hVar = (cd.h) obj;
            iVar.plus(hVar);
        }
        ae.e eVar = m0.f48641a;
        if (hVar != eVar && hVar.get(cd.d.f4122a) == null) {
            hVar = hVar.plus(eVar);
        }
        td.h hVar2 = new td.h(hVar, currentThread, a2);
        hVar2.L(d0.f48607a, hVar2, lVar);
        w0 w0Var = hVar2.e;
        if (w0Var != null) {
            int i10 = w0.f48674f;
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
                        int i11 = w0.f48674f;
                        w0Var.f(false);
                    }
                    Object u10 = e0.u(hVar2.u());
                    v vVar = u10 instanceof v ? (v) u10 : null;
                    if (vVar == null) {
                        return;
                    }
                    throw vVar.f48671a;
                }
            } catch (Throwable th2) {
                if (w0Var != null) {
                    int i12 = w0.f48674f;
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
        kVar.f5861b = new e((Boolean) bVar.a(f5857c), (Double) bVar.a(d), (Integer) bVar.a(e), (Integer) bVar.a(f5858f), (Long) bVar.a(f5859g));
    }

    public final boolean b() {
        e eVar = this.f5861b;
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

    public final java.lang.Object c(n1.d r6, java.lang.Object r7, ed.c r8) {
        throw new UnsupportedOperationException("Method not decompiled: db.k.c(n1.d, java.lang.Object, ed.c):java.lang.Object");
    }
}
