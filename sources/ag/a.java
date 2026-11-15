package ag;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.internal.play_billing.f;
import com.google.android.gms.internal.play_billing.g;
import com.google.android.gms.internal.play_billing.i3;
import com.google.android.gms.internal.play_billing.m3;
import com.google.android.gms.internal.play_billing.p3;
import com.google.android.gms.internal.play_billing.u;
import f5.y;
import j$.util.Objects;
import java.lang.ref.WeakReference;
import org.telegram.messenger.a8;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import tg.x;
import vf.c;
import wf.b;
import zf.d;
import zf.e;
public final class a implements ServiceConnection {
    public final int f1052a;
    public Object f1053b;

    public a() {
        this.f1052a = 0;
    }

    @Override
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        x xVar;
        e eVar = null;
        g gVar = null;
        switch (this.f1052a) {
            case 0:
                int i7 = d.f61358a;
                if (iBinder != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.customtabs.ICustomTabsService");
                    if (queryLocalInterface != null && (queryLocalInterface instanceof e)) {
                        eVar = (e) queryLocalInterface;
                    } else {
                        ?? obj = new Object();
                        obj.f61357a = iBinder;
                        eVar = obj;
                    }
                }
                x xVar2 = new x(10, eVar, componentName);
                if (((vf.a) ((WeakReference) this.f1053b).get()) != null) {
                    c.f58808b = xVar2;
                    if (np.s1(m10.f24934t0).O2() && (xVar = c.f58808b) != null) {
                        try {
                            ((zf.c) ((e) xVar.f57596b)).i1();
                            return;
                        } catch (RemoteException unused) {
                            return;
                        } catch (Exception e10) {
                            a8.g(e10, true);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 1:
                d9.c cVar = (d9.c) this.f1053b;
                cVar.f7608b.b("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
                cVar.a().post(new d9.a(this, iBinder));
                return;
            default:
                u.g("BillingClientTesting", "Billing Override Service connected.");
                f5.x xVar3 = (f5.x) this.f1053b;
                int i10 = f.f6726b;
                if (iBinder != null) {
                    IInterface queryLocalInterface2 = iBinder.queryLocalInterface("com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService");
                    if (queryLocalInterface2 instanceof g) {
                        gVar = (g) queryLocalInterface2;
                    } else {
                        gVar = new a8.a(iBinder, "com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService", 3);
                    }
                }
                xVar3.E = gVar;
                xVar3.D = 2;
                int i11 = y.f11021a;
                i3 c10 = y.c(26, m3.BROADCAST_ACTION_UNSPECIFIED);
                Objects.requireNonNull(c10, "ApiSuccess should not be null");
                b bVar = xVar3.h;
                bVar.getClass();
                try {
                    bVar.e0(c10, (p3) bVar.f59107b);
                    return;
                } catch (Throwable th2) {
                    u.i("BillingLogger", "Unable to log.", th2);
                    return;
                }
        }
    }

    @Override
    public final void onServiceDisconnected(ComponentName componentName) {
        switch (this.f1052a) {
            case 0:
                if (((vf.a) ((WeakReference) this.f1053b).get()) != null) {
                    c.f58808b = null;
                    return;
                }
                return;
            case 1:
                d9.c cVar = (d9.c) this.f1053b;
                cVar.f7608b.b("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
                cVar.a().post(new d9.b(this, 0));
                return;
            default:
                u.h("BillingClientTesting", "Billing Override Service disconnected.");
                f5.x xVar = (f5.x) this.f1053b;
                xVar.E = null;
                xVar.D = 0;
                return;
        }
    }

    public a(Object obj, int i7) {
        this.f1052a = i7;
        this.f1053b = obj;
    }
}
