package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import j$.util.Objects;
import java.lang.ref.WeakReference;
public final class b5a implements ServiceConnection {
    public final byte a;
    public Object b;

    public b5a(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        lv6 lv6Var;
        zg5 zg5Var = null;
        z9d z9dVar = null;
        switch (this.a) {
            case 0:
                int i = yg5.a;
                if (iBinder != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.customtabs.ICustomTabsService");
                    if (queryLocalInterface != null && (queryLocalInterface instanceof zg5)) {
                        zg5Var = (zg5) queryLocalInterface;
                    } else {
                        ?? obj = new Object();
                        obj.a = iBinder;
                        zg5Var = obj;
                    }
                }
                lv6 lv6Var2 = new lv6(zg5Var, componentName, false, (byte) 17);
                if (((b01) ((WeakReference) this.b).get()) != null) {
                    d01.b = lv6Var2;
                    if (na7.q1(y6c.t0).O2() && (lv6Var = d01.b) != null) {
                        try {
                            ((xg5) ((zg5) lv6Var.b)).b();
                            return;
                        } catch (RemoteException unused) {
                            return;
                        } catch (Exception e) {
                            fa4.g(e, true);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 1:
                hzc hzcVar = (hzc) this.b;
                hzcVar.b.b("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
                hzcVar.a().post(new fzc(this, iBinder));
                return;
            default:
                xgd.g("BillingClientTesting", "Billing Override Service connected.");
                lid lidVar = (lid) this.b;
                int i2 = l9d.b;
                if (iBinder != null) {
                    IInterface queryLocalInterface2 = iBinder.queryLocalInterface("com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService");
                    if (queryLocalInterface2 instanceof z9d) {
                        z9dVar = (z9d) queryLocalInterface2;
                    } else {
                        z9dVar = new ezc(iBinder, "com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService", (byte) 10);
                    }
                }
                lidVar.E = z9dVar;
                lidVar.D = (byte) 2;
                int i3 = yid.a;
                fie c = yid.c(26, dke.BROADCAST_ACTION_UNSPECIFIED);
                Objects.requireNonNull(c, "ApiSuccess should not be null");
                aec aecVar = lidVar.h;
                aecVar.getClass();
                try {
                    aecVar.t(c, (lle) aecVar.b);
                    return;
                } catch (Throwable th) {
                    xgd.i("BillingLogger", "Unable to log.", th);
                    return;
                }
        }
    }

    @Override
    public final void onServiceDisconnected(ComponentName componentName) {
        switch (this.a) {
            case 0:
                if (((b01) ((WeakReference) this.b).get()) != null) {
                    d01.b = null;
                    return;
                }
                return;
            case 1:
                hzc hzcVar = (hzc) this.b;
                hzcVar.b.b("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
                hzcVar.a().post(new gzc(this, (byte) 0));
                return;
            default:
                xgd.h("BillingClientTesting", "Billing Override Service disconnected.");
                lid lidVar = (lid) this.b;
                lidVar.E = null;
                lidVar.D = (byte) 0;
                return;
        }
    }
}
