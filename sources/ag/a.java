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
import d9.b;
import f5.w;
import f5.x;
import j$.util.Objects;
import java.lang.ref.WeakReference;
import org.telegram.messenger.a8;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import q4.q;
import v6.e;
import vf.c;
import zf.d;
public final class a implements ServiceConnection {
    public final int f1054a;
    public Object f1055b;

    public a() {
        this.f1054a = 0;
    }

    @Override
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        e eVar;
        zf.e eVar2 = null;
        g gVar = null;
        switch (this.f1054a) {
            case 0:
                int i7 = d.f60026a;
                if (iBinder != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.customtabs.ICustomTabsService");
                    if (queryLocalInterface != null && (queryLocalInterface instanceof zf.e)) {
                        eVar2 = (zf.e) queryLocalInterface;
                    } else {
                        ?? obj = new Object();
                        obj.f60025a = iBinder;
                        eVar2 = obj;
                    }
                }
                e eVar3 = new e(eVar2, componentName);
                if (((vf.a) ((WeakReference) this.f1055b).get()) != null) {
                    c.f57210b = eVar3;
                    if (qp.s1(p10.f24459s0).O2() && (eVar = c.f57210b) != null) {
                        try {
                            ((zf.c) ((zf.e) eVar.f57127a)).I0();
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
                d9.c cVar = (d9.c) this.f1055b;
                cVar.f8222b.b("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
                cVar.a().post(new d9.a(this, iBinder));
                return;
            default:
                u.g("BillingClientTesting", "Billing Override Service connected.");
                w wVar = (w) this.f1055b;
                int i10 = f.f7339b;
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
                int i11 = x.f11193a;
                i3 c10 = x.c(26, m3.BROADCAST_ACTION_UNSPECIFIED);
                Objects.requireNonNull(c10, "ApiSuccess should not be null");
                q qVar = wVar.h;
                qVar.getClass();
                try {
                    qVar.q(c10, (p3) qVar.f53686b);
                    return;
                } catch (Throwable th2) {
                    u.i("BillingLogger", "Unable to log.", th2);
                    return;
                }
        }
    }

    @Override
    public final void onServiceDisconnected(ComponentName componentName) {
        switch (this.f1054a) {
            case 0:
                if (((vf.a) ((WeakReference) this.f1055b).get()) != null) {
                    c.f57210b = null;
                    return;
                }
                return;
            case 1:
                d9.c cVar = (d9.c) this.f1055b;
                cVar.f8222b.b("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
                cVar.a().post(new b(this, 0));
                return;
            default:
                u.h("BillingClientTesting", "Billing Override Service disconnected.");
                w wVar = (w) this.f1055b;
                wVar.E = null;
                wVar.D = 0;
                return;
        }
    }

    public a(Object obj, int i7) {
        this.f1054a = i7;
        this.f1055b = obj;
    }
}
