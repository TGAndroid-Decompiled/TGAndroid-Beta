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
import f5.w;
import j$.util.Objects;
import java.lang.ref.WeakReference;
import org.telegram.messenger.a8;
import org.telegram.messenger.j10;
import org.telegram.messenger.mp;
import tg.x;
import vf.c;
import wf.b;
import zf.d;
import zf.e;
public final class a implements ServiceConnection {
    public final int f1051a;
    public Object f1052b;

    public a() {
        this.f1051a = 0;
    }

    @Override
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        x xVar;
        e eVar = null;
        g gVar = null;
        switch (this.f1051a) {
            case 0:
                int i7 = d.f61924a;
                if (iBinder != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.customtabs.ICustomTabsService");
                    if (queryLocalInterface != null && (queryLocalInterface instanceof e)) {
                        eVar = (e) queryLocalInterface;
                    } else {
                        ?? obj = new Object();
                        obj.f61923a = iBinder;
                        eVar = obj;
                    }
                }
                x xVar2 = new x(10, eVar, componentName);
                if (((vf.a) ((WeakReference) this.f1052b).get()) != null) {
                    c.f59377b = xVar2;
                    if (mp.u1(j10.f24773t0).U2() && (xVar = c.f59377b) != null) {
                        try {
                            ((zf.c) ((e) xVar.f58164b)).i1();
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
                d9.c cVar = (d9.c) this.f1052b;
                cVar.f7894b.b("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
                cVar.a().post(new d9.a(this, iBinder));
                return;
            default:
                u.g("BillingClientTesting", "Billing Override Service connected.");
                w wVar = (w) this.f1052b;
                int i10 = f.f7012b;
                if (iBinder != null) {
                    IInterface queryLocalInterface2 = iBinder.queryLocalInterface("com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService");
                    if (queryLocalInterface2 instanceof g) {
                        gVar = (g) queryLocalInterface2;
                    } else {
                        gVar = new a8.a(iBinder, "com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService", 3);
                    }
                }
                wVar.E = gVar;
                wVar.D = 2;
                int i11 = f5.x.f11327a;
                i3 c10 = f5.x.c(26, m3.BROADCAST_ACTION_UNSPECIFIED);
                Objects.requireNonNull(c10, "ApiSuccess should not be null");
                b bVar = wVar.h;
                bVar.getClass();
                try {
                    bVar.e0(c10, (p3) bVar.f59672b);
                    return;
                } catch (Throwable th2) {
                    u.i("BillingLogger", "Unable to log.", th2);
                    return;
                }
        }
    }

    @Override
    public final void onServiceDisconnected(ComponentName componentName) {
        switch (this.f1051a) {
            case 0:
                if (((vf.a) ((WeakReference) this.f1052b).get()) != null) {
                    c.f59377b = null;
                    return;
                }
                return;
            case 1:
                d9.c cVar = (d9.c) this.f1052b;
                cVar.f7894b.b("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
                cVar.a().post(new d9.b(this, 0));
                return;
            default:
                u.h("BillingClientTesting", "Billing Override Service disconnected.");
                w wVar = (w) this.f1052b;
                wVar.E = null;
                wVar.D = 0;
                return;
        }
    }

    public a(Object obj, int i7) {
        this.f1051a = i7;
        this.f1052b = obj;
    }
}
