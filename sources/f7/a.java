package f7;

import android.location.Location;
import android.os.Parcel;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
public final class a implements Continuation, com.google.android.gms.common.api.internal.s {
    public static final a f5997a = new Object();
    public static final a f5998b = new Object();
    public static final a f5999c = new Object();

    public void a(l lVar, com.google.android.gms.common.api.internal.n nVar, boolean z4, TaskCompletionSource taskCompletionSource) {
        y5.c cVar;
        synchronized (lVar.S) {
            try {
                j jVar = (j) lVar.S.remove(nVar);
                if (jVar == null) {
                    taskCompletionSource.setResult(Boolean.FALSE);
                    return;
                }
                com.google.android.gms.common.api.internal.p e = jVar.f6013b.e();
                e.f2825b = null;
                e.f2826c = null;
                if (z4) {
                    y5.c[] l10 = lVar.l();
                    if (l10 != null) {
                        int length = l10.length;
                        int i10 = 0;
                        while (true) {
                            if (i10 < length) {
                                cVar = l10[i10];
                                if ("location_updates_with_callback".equals(cVar.f47171a)) {
                                    break;
                                }
                                i10++;
                            } else {
                                cVar = null;
                                break;
                            }
                        }
                        if (cVar != null && cVar.e() >= 1) {
                            a0 a0Var = (a0) lVar.u();
                            m mVar = new m(2, null, jVar, null, null, null);
                            f fVar = new f(Boolean.TRUE, taskCompletionSource);
                            Parcel M0 = a0Var.M0();
                            e.c(M0, mVar);
                            e.d(M0, fVar);
                            a0Var.Q0(M0, 89);
                        }
                    }
                    a0 a0Var2 = (a0) lVar.u();
                    p pVar = new p(2, null, null, jVar, null, new h(taskCompletionSource), null);
                    Parcel M02 = a0Var2.M0();
                    e.c(M02, pVar);
                    a0Var2.Q0(M02, 59);
                } else {
                    taskCompletionSource.setResult(Boolean.TRUE);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public void accept(Object obj, Object obj2) {
        y5.c cVar;
        l lVar = (l) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        u7.b bVar = new u7.b(Long.MAX_VALUE, 0, false, null, null);
        y5.c[] l10 = lVar.l();
        if (l10 != null) {
            int length = l10.length;
            int i10 = 0;
            while (true) {
                if (i10 < length) {
                    cVar = l10[i10];
                    if ("get_last_location_with_request".equals(cVar.f47171a)) {
                        break;
                    }
                    i10++;
                } else {
                    cVar = null;
                    break;
                }
            }
            if (cVar != null && cVar.e() >= 1) {
                a0 a0Var = (a0) lVar.u();
                g gVar = new g(0, taskCompletionSource);
                Parcel M0 = a0Var.M0();
                e.c(M0, bVar);
                e.d(M0, gVar);
                a0Var.Q0(M0, 82);
                return;
            }
        }
        a0 a0Var2 = (a0) lVar.u();
        Parcel M02 = a0Var2.M0();
        Parcel obtain = Parcel.obtain();
        try {
            try {
                a0Var2.f123b.transact(7, M02, obtain, 0);
                obtain.readException();
                M02.recycle();
                obtain.recycle();
                taskCompletionSource.setResult((Location) e.a(obtain, Location.CREATOR));
            } catch (RuntimeException e) {
                obtain.recycle();
                throw e;
            }
        } catch (Throwable th2) {
            M02.recycle();
            throw th2;
        }
    }

    @Override
    public Object then(Task task) {
        return null;
    }
}
