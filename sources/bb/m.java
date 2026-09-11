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
public final class m {
    public static final n1.d f2565c = new n1.d("firebase_sessions_enabled");
    public static final n1.d d = new n1.d("firebase_sessions_sampling_rate");
    public static final n1.d f2566e = new n1.d("firebase_sessions_restart_timeout");
    public static final n1.d f2567f = new n1.d("firebase_sessions_cache_duration");
    public static final n1.d f2568g = new n1.d("firebase_sessions_cache_updated_time");
    public final k1.f f2569a;
    public f f2570b;

    public m(k1.f fVar) {
        Object obj;
        id.h hVar;
        long j3;
        this.f2569a = fVar;
        p jVar = new j(this, null, 0);
        Thread currentThread = Thread.currentThread();
        w0 a2 = c2.a();
        boolean booleanValue = ((Boolean) a2.fold(Boolean.FALSE, x.d)).booleanValue();
        if (!booleanValue) {
            hVar = a2;
        } else {
            id.i iVar = id.i.f11954a;
            if (booleanValue) {
                obj = a2.fold(iVar, x.f51614c);
            } else {
                obj = a2;
            }
            hVar = (id.h) obj;
            iVar.plus(hVar);
        }
        ge.e eVar = m0.f51570a;
        if (hVar != eVar && hVar.get(id.d.f11953a) == null) {
            hVar = hVar.plus(eVar);
        }
        zd.h hVar2 = new zd.h(hVar, currentThread, a2);
        hVar2.L(d0.f51530a, hVar2, jVar);
        w0 w0Var = hVar2.f51558e;
        if (w0Var != null) {
            int i10 = w0.f51610f;
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
                        int i11 = w0.f51610f;
                        w0Var.f(false);
                    }
                    Object u10 = e0.u(hVar2.u());
                    v vVar = u10 instanceof v ? (v) u10 : null;
                    if (vVar == null) {
                        return;
                    }
                    throw vVar.f51607a;
                }
            } catch (Throwable th2) {
                if (w0Var != null) {
                    int i12 = w0.f51610f;
                    w0Var.f(false);
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
        mVar.f2570b = new f((Boolean) bVar.a(f2565c), (Double) bVar.a(d), (Integer) bVar.a(f2566e), (Integer) bVar.a(f2567f), (Long) bVar.a(f2568g));
    }

    public final boolean b() {
        f fVar = this.f2570b;
        if (fVar != null) {
            Long l4 = fVar.f2548e;
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

    public final java.lang.Object c(n1.d r6, java.lang.Object r7, kd.c r8) {
        throw new UnsupportedOperationException("Method not decompiled: bb.m.c(n1.d, java.lang.Object, kd.c):java.lang.Object");
    }
}
