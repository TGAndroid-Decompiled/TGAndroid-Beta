package b7;

import android.location.Location;
import android.os.Parcel;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
public final class b implements Continuation, com.google.android.gms.common.api.internal.s {
    public static final b f1551a = new Object();
    public static final b f1552b = new Object();
    public static final b f1553c = new Object();

    public void a(m mVar, com.google.android.gms.common.api.internal.n nVar, boolean z10, TaskCompletionSource taskCompletionSource) {
        u5.c cVar;
        synchronized (mVar.R) {
            try {
                k kVar = (k) mVar.R.remove(nVar);
                if (kVar == null) {
                    taskCompletionSource.setResult(Boolean.FALSE);
                    return;
                }
                com.google.android.gms.common.api.internal.p e10 = kVar.f1565b.e();
                e10.f2872b = null;
                e10.f2873c = null;
                if (z10) {
                    u5.c[] m10 = mVar.m();
                    if (m10 != null) {
                        int length = m10.length;
                        int i9 = 0;
                        while (true) {
                            if (i9 < length) {
                                cVar = m10[i9];
                                if ("location_updates_with_callback".equals(cVar.f48105a)) {
                                    break;
                                }
                                i9++;
                            } else {
                                cVar = null;
                                break;
                            }
                        }
                        if (cVar != null && cVar.b() >= 1) {
                            c0 c0Var = (c0) mVar.u();
                            n nVar2 = new n(2, null, kVar, null, null, null);
                            g gVar = new g(Boolean.TRUE, taskCompletionSource);
                            Parcel M0 = c0Var.M0();
                            f.c(M0, nVar2);
                            f.d(M0, gVar);
                            c0Var.Q0(M0, 89);
                        }
                    }
                    c0 c0Var2 = (c0) mVar.u();
                    q qVar = new q(2, null, null, kVar, null, new i(taskCompletionSource), null);
                    Parcel M02 = c0Var2.M0();
                    f.c(M02, qVar);
                    c0Var2.Q0(M02, 59);
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
        u5.c cVar;
        m mVar = (m) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        q7.b bVar = new q7.b(Long.MAX_VALUE, 0, false, null, null);
        u5.c[] m10 = mVar.m();
        if (m10 != null) {
            int length = m10.length;
            int i9 = 0;
            while (true) {
                if (i9 < length) {
                    cVar = m10[i9];
                    if ("get_last_location_with_request".equals(cVar.f48105a)) {
                        break;
                    }
                    i9++;
                } else {
                    cVar = null;
                    break;
                }
            }
            if (cVar != null && cVar.b() >= 1) {
                c0 c0Var = (c0) mVar.u();
                h hVar = new h(0, taskCompletionSource);
                Parcel M0 = c0Var.M0();
                f.c(M0, bVar);
                f.d(M0, hVar);
                c0Var.Q0(M0, 82);
                return;
            }
        }
        c0 c0Var2 = (c0) mVar.u();
        Parcel M02 = c0Var2.M0();
        Parcel obtain = Parcel.obtain();
        try {
            try {
                c0Var2.f1549b.transact(7, M02, obtain, 0);
                obtain.readException();
                M02.recycle();
                obtain.recycle();
                taskCompletionSource.setResult((Location) f.a(obtain, Location.CREATOR));
            } catch (RuntimeException e10) {
                obtain.recycle();
                throw e10;
            }
        } catch (Throwable th) {
            M02.recycle();
            throw th;
        }
    }

    @Override
    public Object then(Task task) {
        return null;
    }
}
