package ia;

import android.util.Log;
import com.google.android.gms.tasks.Task;
import h7.k6;
import h7.k7;

public final class l0 implements h0 {

    public static final double f11045f = Math.random();

    public static final int f11046g = 0;

    public final t8.h f11047a;

    public final z9.d f11048b;

    public final ka.h f11049c;
    public final ae.b d;

    public final rc.h f11050e;

    public l0(t8.h hVar, z9.d dVar, ka.h hVar2, ae.b bVar, rc.h hVar3) {
        this.f11047a = hVar;
        this.f11048b = dVar;
        this.f11049c = hVar2;
        this.d = bVar;
        this.f11050e = hVar3;
    }

    public static final Object a(l0 l0Var, tc.c cVar) {
        i0 i0Var;
        if (cVar instanceof i0) {
            i0Var = (i0) cVar;
            int i10 = i0Var.f11026c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                i0Var.f11026c = i10 - Integer.MIN_VALUE;
            } else {
                i0Var = new i0(l0Var, cVar);
            }
        } else {
            i0Var = new i0(l0Var, cVar);
        }
        Object objA = i0Var.f11024a;
        sc.a aVar = sc.a.f47847a;
        int i11 = i0Var.f11026c;
        try {
            if (i11 == 0) {
                k6.b(objA);
                Task taskD = ((z9.c) l0Var.f11048b).d();
                kotlin.jvm.internal.j.d(taskD, "firebaseInstallations.id");
                i0Var.f11026c = 1;
                objA = k7.a(taskD, i0Var);
                if (objA == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                k6.b(objA);
            }
            return (String) objA;
        } catch (Exception e9) {
            Log.e("SessionFirelogPublisher", "Error getting Firebase Installation ID. Using an empty ID", e9);
            return "";
        }
    }

    public static final Object b(l0 l0Var, tc.c cVar) {
        k0 k0Var;
        if (cVar instanceof k0) {
            k0Var = (k0) cVar;
            int i10 = k0Var.d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                k0Var.d = i10 - Integer.MIN_VALUE;
            } else {
                k0Var = new k0(l0Var, cVar);
            }
        } else {
            k0Var = new k0(l0Var, cVar);
        }
        Object obj = k0Var.f11042b;
        sc.a aVar = sc.a.f47847a;
        int i11 = k0Var.d;
        boolean zBooleanValue = true;
        if (i11 == 0) {
            k6.b(obj);
            Log.d("SessionFirelogPublisher", "Data Collection is enabled for at least one Subscriber");
            ka.h hVar = l0Var.f11049c;
            k0Var.f11041a = l0Var;
            k0Var.d = 1;
            if (hVar.b(k0Var) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            l0Var = k0Var.f11041a;
            k6.b(obj);
        }
        ka.h hVar2 = l0Var.f11049c;
        Boolean boolB = hVar2.f15125a.b();
        if (boolB != null) {
            zBooleanValue = boolB.booleanValue();
        } else {
            Boolean boolA = hVar2.f15126b.a();
            if (boolA != null) {
                zBooleanValue = boolA.booleanValue();
            }
        }
        if (!zBooleanValue) {
            Log.d("SessionFirelogPublisher", "Sessions SDK disabled. Events will not be sent.");
            return Boolean.FALSE;
        }
        if (f11045f <= l0Var.f11049c.a()) {
            return Boolean.TRUE;
        }
        Log.d("SessionFirelogPublisher", "Sessions SDK has dropped this session due to sampling.");
        return Boolean.FALSE;
    }
}
