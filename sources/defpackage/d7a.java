package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import j$.util.Objects;
import java.lang.ref.WeakReference;
public final class d7a implements ServiceConnection {
    public final byte a;
    public Object b;

    public d7a(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        hi2 hi2Var;
        yi5 yi5Var = null;
        bcd bcdVar = null;
        switch (this.a) {
            case 0:
                int i = xi5.a;
                if (iBinder != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.customtabs.ICustomTabsService");
                    if (queryLocalInterface != null && (queryLocalInterface instanceof yi5)) {
                        yi5Var = (yi5) queryLocalInterface;
                    } else {
                        ?? obj = new Object();
                        obj.a = iBinder;
                        yi5Var = obj;
                    }
                }
                hi2 hi2Var2 = new hi2(yi5Var, componentName, (byte) 19);
                if (((j11) ((WeakReference) this.b).get()) != null) {
                    l11.b = hi2Var2;
                    if (oc7.r1(z8c.t0).Q2() && (hi2Var = l11.b) != null) {
                        try {
                            ((wi5) ((yi5) hi2Var.b)).b();
                            return;
                        } catch (RemoteException unused) {
                            return;
                        } catch (Exception e) {
                            fc4.g(e, true);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 1:
                i1d i1dVar = (i1d) this.b;
                i1dVar.b.b("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
                i1dVar.a().post(new g1d(this, iBinder));
                return;
            default:
                yid.g("BillingClientTesting", "Billing Override Service connected.");
                nkd nkdVar = (nkd) this.b;
                int i2 = nbd.b;
                if (iBinder != null) {
                    IInterface queryLocalInterface2 = iBinder.queryLocalInterface("com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService");
                    if (queryLocalInterface2 instanceof bcd) {
                        bcdVar = (bcd) queryLocalInterface2;
                    } else {
                        bcdVar = new f1d(iBinder, "com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService", (byte) 10);
                    }
                }
                nkdVar.E = bcdVar;
                nkdVar.D = (byte) 2;
                int i3 = ald.a;
                gke c = ald.c(26, fme.BROADCAST_ACTION_UNSPECIFIED);
                Objects.requireNonNull(c, "ApiSuccess should not be null");
                rhb rhbVar = nkdVar.h;
                rhbVar.getClass();
                try {
                    rhbVar.L(c, (nne) rhbVar.b);
                    return;
                } catch (Throwable th) {
                    yid.i("BillingLogger", "Unable to log.", th);
                    return;
                }
        }
    }

    @Override
    public final void onServiceDisconnected(ComponentName componentName) {
        switch (this.a) {
            case 0:
                if (((j11) ((WeakReference) this.b).get()) != null) {
                    l11.b = null;
                    return;
                }
                return;
            case 1:
                i1d i1dVar = (i1d) this.b;
                i1dVar.b.b("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
                i1dVar.a().post(new h1d(this, (byte) 0));
                return;
            default:
                yid.h("BillingClientTesting", "Billing Override Service disconnected.");
                nkd nkdVar = (nkd) this.b;
                nkdVar.E = null;
                nkdVar.D = (byte) 0;
                return;
        }
    }

    public d7a() {
        this.a = (byte) 0;
    }
}
