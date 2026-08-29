package d7;

import android.location.Location;
import android.os.Parcel;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
public final class a implements Continuation, com.google.android.gms.common.api.internal.s {
    public static final a f5427a = new Object();
    public static final a f5428b = new Object();
    public static final a f5429c = new Object();

    public void a(k kVar, com.google.android.gms.common.api.internal.n nVar, boolean z10, TaskCompletionSource taskCompletionSource) {
        w5.c cVar;
        synchronized (kVar.R) {
            try {
                i iVar = (i) kVar.R.remove(nVar);
                if (iVar == null) {
                    taskCompletionSource.setResult(Boolean.FALSE);
                    return;
                }
                com.google.android.gms.common.api.internal.p e10 = iVar.f5440b.e();
                e10.f3886b = null;
                e10.f3887c = null;
                if (z10) {
                    w5.c[] l10 = kVar.l();
                    if (l10 != null) {
                        int length = l10.length;
                        int i10 = 0;
                        while (true) {
                            if (i10 < length) {
                                cVar = l10[i10];
                                if ("location_updates_with_callback".equals(cVar.f49764a)) {
                                    break;
                                }
                                i10++;
                            } else {
                                cVar = null;
                                break;
                            }
                        }
                        if (cVar != null && cVar.b() >= 1) {
                            z zVar = (z) kVar.u();
                            l lVar = new l(2, null, iVar, null, null, null);
                            e eVar = new e(Boolean.TRUE, taskCompletionSource);
                            Parcel M0 = zVar.M0();
                            d.c(M0, lVar);
                            d.d(M0, eVar);
                            zVar.Q0(M0, 89);
                        }
                    }
                    z zVar2 = (z) kVar.u();
                    o oVar = new o(2, null, null, iVar, null, new g(taskCompletionSource), null);
                    Parcel M02 = zVar2.M0();
                    d.c(M02, oVar);
                    zVar2.Q0(M02, 59);
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
        w5.c cVar;
        k kVar = (k) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        s7.b bVar = new s7.b(Long.MAX_VALUE, 0, false, null, null);
        w5.c[] l10 = kVar.l();
        if (l10 != null) {
            int length = l10.length;
            int i10 = 0;
            while (true) {
                if (i10 < length) {
                    cVar = l10[i10];
                    if ("get_last_location_with_request".equals(cVar.f49764a)) {
                        break;
                    }
                    i10++;
                } else {
                    cVar = null;
                    break;
                }
            }
            if (cVar != null && cVar.b() >= 1) {
                z zVar = (z) kVar.u();
                f fVar = new f(0, taskCompletionSource);
                Parcel M0 = zVar.M0();
                d.c(M0, bVar);
                d.d(M0, fVar);
                zVar.Q0(M0, 82);
                return;
            }
        }
        z zVar2 = (z) kVar.u();
        Parcel M02 = zVar2.M0();
        Parcel obtain = Parcel.obtain();
        try {
            try {
                zVar2.f3996b.transact(7, M02, obtain, 0);
                obtain.readException();
                M02.recycle();
                obtain.recycle();
                taskCompletionSource.setResult((Location) d.a(obtain, Location.CREATOR));
            } catch (RuntimeException e10) {
                obtain.recycle();
                throw e10;
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
