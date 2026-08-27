package ka;

import ad.p;
import android.util.Log;
import h7.k6;
import ia.m;
import id.b1;
import id.d0;
import id.d2;
import id.f0;
import id.n0;
import id.v;
import id.x;
import id.x0;
import java.io.IOException;
import java.util.concurrent.locks.LockSupport;

public final class k {

    public static final n1.e f15133c = new n1.e("firebase_sessions_enabled");
    public static final n1.e d = new n1.e("firebase_sessions_sampling_rate");

    public static final n1.e f15134e = new n1.e("firebase_sessions_restart_timeout");

    public static final n1.e f15135f = new n1.e("firebase_sessions_cache_duration");

    public static final n1.e f15136g = new n1.e("firebase_sessions_cache_updated_time");

    public final k1.f f15137a;

    public e f15138b;

    public k(k1.f fVar) throws Throwable {
        rc.h hVar;
        this.f15137a = fVar;
        p mVar = new m(this, false ? 1 : 0, 6);
        Thread threadCurrentThread = Thread.currentThread();
        x0 x0VarA = d2.a();
        boolean zBooleanValue = ((Boolean) x0VarA.fold(Boolean.FALSE, x.d)).booleanValue();
        if (zBooleanValue) {
            rc.i iVar = rc.i.f46899a;
            rc.h hVar2 = (rc.h) (zBooleanValue ? x0VarA.fold(iVar, x.f11210c) : x0VarA);
            iVar.plus(hVar2);
            hVar = hVar2;
        } else {
            hVar = x0VarA;
        }
        pd.e eVar = n0.f11171a;
        rc.h hVarPlus = hVar;
        if (hVar != eVar && hVar.get(rc.d.f46898a) == null) {
            hVarPlus = hVar;
            hVarPlus = hVar.plus(eVar);
        }
        hVarPlus = hVar;
        id.h hVar3 = new id.h(hVarPlus, threadCurrentThread, x0VarA);
        hVar3.L(d0.f11128a, hVar3, mVar);
        x0 x0Var = hVar3.f11155e;
        if (x0Var != null) {
            int i10 = x0.f11212f;
            x0Var.h(false);
        }
        while (!Thread.interrupted()) {
            try {
                long jI = x0Var != null ? x0Var.i() : Long.MAX_VALUE;
                if (!(hVar3.u() instanceof b1)) {
                    if (x0Var != null) {
                        int i11 = x0.f11212f;
                        x0Var.f(false);
                    }
                    Object objU = f0.u(hVar3.u());
                    v vVar = objU instanceof v ? (v) objU : null;
                    if (vVar != null) {
                        throw vVar.f11204a;
                    }
                    return;
                }
                LockSupport.parkNanos(hVar3, jI);
            } catch (Throwable th) {
                if (x0Var != null) {
                    int i12 = x0.f11212f;
                    x0Var.f(false);
                }
                throw th;
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        hVar3.i(interruptedException);
        throw interruptedException;
    }

    public static final void a(k kVar, n1.b bVar) {
        kVar.getClass();
        kVar.f15138b = new e((Boolean) bVar.a(f15133c), (Double) bVar.a(d), (Integer) bVar.a(f15134e), (Integer) bVar.a(f15135f), (Long) bVar.a(f15136g));
    }

    public final boolean b() {
        e eVar = this.f15138b;
        if (eVar == null) {
            kotlin.jvm.internal.j.h("sessionConfigs");
            throw null;
        }
        Long l10 = eVar.f15119e;
        if (eVar != null) {
            Integer num = eVar.d;
            return l10 == null || num == null || (System.currentTimeMillis() - l10.longValue()) / ((long) 1000) >= ((long) num.intValue());
        }
        kotlin.jvm.internal.j.h("sessionConfigs");
        throw null;
    }

    public final Object c(n1.e eVar, Object obj, tc.c cVar) {
        i iVar;
        if (cVar instanceof i) {
            iVar = (i) cVar;
            int i10 = iVar.f15129c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                iVar.f15129c = i10 - Integer.MIN_VALUE;
            } else {
                iVar = new i(this, cVar);
            }
        } else {
            iVar = new i(this, cVar);
        }
        Object obj2 = iVar.f15127a;
        sc.a aVar = sc.a.f47847a;
        int i11 = iVar.f15129c;
        try {
            if (i11 == 0) {
                k6.b(obj2);
                k1.f fVar = this.f15137a;
                j jVar = new j(obj, eVar, this, null);
                iVar.f15129c = 1;
                if (fVar.c(new n1.c(jVar, null, 1), iVar) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                k6.b(obj2);
            }
        } catch (IOException e9) {
            Log.w("SettingsCache", "Failed to update cache config value: " + e9);
        }
        return pc.i.f45696a;
    }
}
