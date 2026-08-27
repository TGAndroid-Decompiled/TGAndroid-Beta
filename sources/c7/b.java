package c7;

import android.location.Location;
import android.os.Parcel;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class b implements Continuation, com.google.android.gms.common.api.internal.s {

    public static final b f2458a = new b();

    public static final b f2459b = new b();

    public static final b f2460c = new b();

    public void a(l lVar, com.google.android.gms.common.api.internal.n nVar, boolean z10, TaskCompletionSource taskCompletionSource) {
        v5.c cVar;
        synchronized (lVar.R) {
            try {
                j jVar = (j) lVar.R.remove(nVar);
                if (jVar == null) {
                    taskCompletionSource.setResult(Boolean.FALSE);
                    return;
                }
                com.google.android.gms.common.api.internal.p pVarE = jVar.f2471b.e();
                pVarE.f3317b = null;
                pVarE.f3318c = null;
                if (z10) {
                    v5.c[] cVarArrL = lVar.l();
                    if (cVarArrL != null) {
                        int length = cVarArrL.length;
                        int i10 = 0;
                        while (true) {
                            if (i10 >= length) {
                                cVar = null;
                                break;
                            }
                            cVar = cVarArrL[i10];
                            if ("location_updates_with_callback".equals(cVar.f48790a)) {
                                break;
                            } else {
                                i10++;
                            }
                        }
                        if (cVar != null && cVar.b() >= 1) {
                            b0 b0Var = (b0) lVar.u();
                            m mVar = new m(2, null, jVar, null, null, null);
                            f fVar = new f(Boolean.TRUE, taskCompletionSource);
                            Parcel parcelM0 = b0Var.M0();
                            e.c(parcelM0, mVar);
                            e.d(parcelM0, fVar);
                            b0Var.Q0(parcelM0, 89);
                        }
                    }
                    b0 b0Var2 = (b0) lVar.u();
                    p pVar = new p(2, null, null, jVar, null, new h(taskCompletionSource), null);
                    Parcel parcelM1 = b0Var2.M0();
                    e.c(parcelM1, pVar);
                    b0Var2.Q0(parcelM1, 59);
                } else {
                    taskCompletionSource.setResult(Boolean.TRUE);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override
    public void accept(Object obj, Object obj2) {
        v5.c cVar;
        l lVar = (l) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        r7.b bVar = new r7.b(Long.MAX_VALUE, 0, false, null, null);
        v5.c[] cVarArrL = lVar.l();
        if (cVarArrL != null) {
            int length = cVarArrL.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    cVar = null;
                    break;
                }
                cVar = cVarArrL[i10];
                if ("get_last_location_with_request".equals(cVar.f48790a)) {
                    break;
                } else {
                    i10++;
                }
            }
            if (cVar != null && cVar.b() >= 1) {
                b0 b0Var = (b0) lVar.u();
                g gVar = new g(0, taskCompletionSource);
                Parcel parcelM0 = b0Var.M0();
                e.c(parcelM0, bVar);
                e.d(parcelM0, gVar);
                b0Var.Q0(parcelM0, 82);
                return;
            }
        }
        b0 b0Var2 = (b0) lVar.u();
        Parcel parcelM1 = b0Var2.M0();
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                b0Var2.f2456b.transact(7, parcelM1, parcelObtain, 0);
                parcelObtain.readException();
                parcelM1.recycle();
                Location location = (Location) e.a(parcelObtain, Location.CREATOR);
                parcelObtain.recycle();
                taskCompletionSource.setResult(location);
            } catch (RuntimeException e9) {
                parcelObtain.recycle();
                throw e9;
            }
        } catch (Throwable th) {
            parcelM1.recycle();
            throw th;
        }
    }

    @Override
    public Object then(Task task) {
        return null;
    }
}
