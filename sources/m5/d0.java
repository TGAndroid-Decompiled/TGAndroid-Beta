package m5;

import android.os.Parcel;
import android.os.RemoteException;
import java.util.Iterator;

public final class d0 implements Runnable {

    public final int f17763a;

    public final e0 f17764b;

    public final int f17765c;

    public d0(e0 e0Var, int i10, int i11) {
        this.f17763a = i11;
        this.f17764b = e0Var;
        this.f17765c = i10;
    }

    private final void a() {
        e0 e0Var = this.f17764b;
        f0 f0Var = e0Var.f17769b;
        f0Var.f17782x = -1;
        f0Var.f17783y = -1;
        f0Var.f17779t = null;
        f0Var.f17780u = null;
        f0Var.v = 0.0d;
        f0Var.j();
        f0Var.f17781w = false;
        f0Var.f17784z = null;
        f0 f0Var2 = e0Var.f17769b;
        f0Var2.F = 1;
        int i10 = this.f17765c;
        synchronized (f0Var2.E) {
            try {
                Iterator it = e0Var.f17769b.E.iterator();
                while (it.hasNext()) {
                    n5.r rVar = ((n5.j) it.next()).f18321a.f18304e;
                    if (rVar != null) {
                        try {
                            v5.a aVar = new v5.a(i10);
                            n5.p pVar = (n5.p) rVar;
                            Parcel parcelM0 = pVar.M0();
                            com.google.android.gms.internal.cast.t.c(parcelM0, aVar);
                            pVar.Q0(parcelM0, 3);
                        } catch (RemoteException e9) {
                            n5.c.f18302m.a(e9, "Unable to call %s on %s.", "onDisconnected", n5.r.class.getSimpleName());
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        e0Var.f17769b.h();
        f0 f0Var3 = e0Var.f17769b;
        com.google.android.gms.common.api.internal.n nVar = a9.i.N(f0Var3.f3391f, f0Var3.f17770k, "castDeviceControllerListenerKey").f3318c;
        y5.l.i(nVar, "Key must not be null");
        f0Var3.c(nVar, 8415);
    }

    private final void b() {
        e0 e0Var = this.f17764b;
        int i10 = this.f17765c;
        if (i10 == 0) {
            f0 f0Var = e0Var.f17769b;
            f0Var.F = 2;
            f0Var.f17772m = true;
            f0Var.f17773n = true;
            synchronized (f0Var.E) {
                try {
                    Iterator it = e0Var.f17769b.E.iterator();
                    while (it.hasNext()) {
                        ((n5.j) it.next()).a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        f0 f0Var2 = e0Var.f17769b;
        f0Var2.F = 1;
        synchronized (f0Var2.E) {
            try {
                Iterator it2 = e0Var.f17769b.E.iterator();
                while (it2.hasNext()) {
                    n5.r rVar = ((n5.j) it2.next()).f18321a.f18304e;
                    if (rVar != null) {
                        try {
                            v5.a aVar = new v5.a(i10);
                            n5.p pVar = (n5.p) rVar;
                            Parcel parcelM0 = pVar.M0();
                            com.google.android.gms.internal.cast.t.c(parcelM0, aVar);
                            pVar.Q0(parcelM0, 3);
                        } catch (RemoteException e9) {
                            n5.c.f18302m.a(e9, "Unable to call %s on %s.", "onConnectionFailed", n5.r.class.getSimpleName());
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        e0Var.f17769b.h();
    }

    @Override
    public final void run() {
        switch (this.f17763a) {
            case 0:
                a();
                return;
            case 1:
                b();
                return;
            case 2:
                this.f17764b.f17769b.D.b(this.f17765c);
                return;
            default:
                e0 e0Var = this.f17764b;
                f0 f0Var = e0Var.f17769b;
                f0Var.F = 3;
                int i10 = this.f17765c;
                synchronized (f0Var.E) {
                    try {
                        Iterator it = e0Var.f17769b.E.iterator();
                        while (it.hasNext()) {
                            n5.r rVar = ((n5.j) it.next()).f18321a.f18304e;
                            if (rVar != null) {
                                try {
                                    n5.p pVar = (n5.p) rVar;
                                    Parcel parcelM0 = pVar.M0();
                                    parcelM0.writeInt(i10);
                                    pVar.Q0(parcelM0, 2);
                                } catch (RemoteException e9) {
                                    n5.c.f18302m.a(e9, "Unable to call %s on %s.", "onConnectionSuspended", n5.r.class.getSimpleName());
                                }
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
        }
    }
}
