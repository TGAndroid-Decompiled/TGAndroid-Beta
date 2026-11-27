package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import j$.util.Objects;
import java.lang.ref.WeakReference;
public final class t8a implements ServiceConnection {
    public final byte a;
    public Object b;

    public t8a(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        qx6 qx6Var;
        bj5 bj5Var = null;
        sed sedVar = null;
        switch (this.a) {
            case 0:
                int i = aj5.a;
                if (iBinder != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.customtabs.ICustomTabsService");
                    if (queryLocalInterface != null && (queryLocalInterface instanceof bj5)) {
                        bj5Var = (bj5) queryLocalInterface;
                    } else {
                        ?? obj = new Object();
                        obj.a = iBinder;
                        bj5Var = obj;
                    }
                }
                qx6 qx6Var2 = new qx6(bj5Var, componentName, false, (byte) 17);
                if (((k01) ((WeakReference) this.b).get()) != null) {
                    m01.b = qx6Var2;
                    if (uc7.s1(yac.t0).U2() && (qx6Var = m01.b) != null) {
                        try {
                            ((zi5) ((bj5) qx6Var.b)).b();
                            return;
                        } catch (RemoteException unused) {
                            return;
                        } catch (Exception e) {
                            cc4.g(e, true);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 1:
                y3d y3dVar = (y3d) this.b;
                y3dVar.b.b("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
                y3dVar.a().post(new w3d(this, iBinder));
                return;
            default:
                old.g("BillingClientTesting", "Billing Override Service connected.");
                cnd cndVar = (cnd) this.b;
                int i2 = eed.b;
                if (iBinder != null) {
                    IInterface queryLocalInterface2 = iBinder.queryLocalInterface("com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService");
                    if (queryLocalInterface2 instanceof sed) {
                        sedVar = (sed) queryLocalInterface2;
                    } else {
                        sedVar = new v3d(iBinder, "com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService", (byte) 10);
                    }
                }
                cndVar.E = sedVar;
                cndVar.D = (byte) 2;
                int i3 = pnd.a;
                wme c = pnd.c(26, uoe.BROADCAST_ACTION_UNSPECIFIED);
                Objects.requireNonNull(c, "ApiSuccess should not be null");
                zhc zhcVar = cndVar.h;
                zhcVar.getClass();
                try {
                    zhcVar.r(c, (cqe) zhcVar.b);
                    return;
                } catch (Throwable th) {
                    old.i("BillingLogger", "Unable to log.", th);
                    return;
                }
        }
    }

    @Override
    public final void onServiceDisconnected(ComponentName componentName) {
        switch (this.a) {
            case 0:
                if (((k01) ((WeakReference) this.b).get()) != null) {
                    m01.b = null;
                    return;
                }
                return;
            case 1:
                y3d y3dVar = (y3d) this.b;
                y3dVar.b.b("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
                y3dVar.a().post(new x3d(this, (byte) 0));
                return;
            default:
                old.h("BillingClientTesting", "Billing Override Service disconnected.");
                cnd cndVar = (cnd) this.b;
                cndVar.E = null;
                cndVar.D = (byte) 0;
                return;
        }
    }

    public t8a() {
        this.a = (byte) 0;
    }
}
