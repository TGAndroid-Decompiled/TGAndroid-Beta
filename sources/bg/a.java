package bg;

import ag.d;
import ag.e;
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
import e5.w;
import e5.x;
import j$.util.Objects;
import java.lang.ref.WeakReference;
import org.telegram.messenger.a8;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import p4.q;
import sf.c;
import tf.b;
public final class a implements ServiceConnection {
    public final int f3296a;
    public Object f3297b;

    public a() {
        this.f3296a = 0;
    }

    @Override
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        q qVar;
        e eVar = null;
        g gVar = null;
        switch (this.f3296a) {
            case 0:
                int i3 = d.f421a;
                if (iBinder != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.customtabs.ICustomTabsService");
                    if (queryLocalInterface != null && (queryLocalInterface instanceof e)) {
                        eVar = (e) queryLocalInterface;
                    } else {
                        ?? obj = new Object();
                        obj.f420a = iBinder;
                        eVar = obj;
                    }
                }
                q qVar2 = new q(eVar, componentName);
                if (((sf.a) ((WeakReference) this.f3297b).get()) != null) {
                    c.f54711b = qVar2;
                    if (hp.s1(h10.f22829t0).O2() && (qVar = c.f54711b) != null) {
                        try {
                            ((ag.c) ((e) qVar.f53181a)).I0();
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
                c9.c cVar = (c9.c) this.f3297b;
                cVar.f4248b.b("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
                cVar.a().post(new c9.a(this, iBinder));
                return;
            default:
                u.g("BillingClientTesting", "Billing Override Service connected.");
                w wVar = (w) this.f3297b;
                int i10 = f.f7394b;
                if (iBinder != null) {
                    IInterface queryLocalInterface2 = iBinder.queryLocalInterface("com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService");
                    if (queryLocalInterface2 instanceof g) {
                        gVar = (g) queryLocalInterface2;
                    } else {
                        gVar = new b8.a(iBinder, "com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService", 3);
                    }
                }
                wVar.E = gVar;
                wVar.D = 2;
                int i11 = x.f9636a;
                i3 c2 = x.c(26, m3.BROADCAST_ACTION_UNSPECIFIED);
                Objects.requireNonNull(c2, "ApiSuccess should not be null");
                b bVar = wVar.h;
                bVar.getClass();
                try {
                    bVar.N(c2, (p3) bVar.f55094a);
                    return;
                } catch (Throwable th2) {
                    u.i("BillingLogger", "Unable to log.", th2);
                    return;
                }
        }
    }

    @Override
    public final void onServiceDisconnected(ComponentName componentName) {
        switch (this.f3296a) {
            case 0:
                if (((sf.a) ((WeakReference) this.f3297b).get()) != null) {
                    c.f54711b = null;
                    return;
                }
                return;
            case 1:
                c9.c cVar = (c9.c) this.f3297b;
                cVar.f4248b.b("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
                cVar.a().post(new c9.b(this, 0));
                return;
            default:
                u.h("BillingClientTesting", "Billing Override Service disconnected.");
                w wVar = (w) this.f3297b;
                wVar.E = null;
                wVar.D = 0;
                return;
        }
    }

    public a(Object obj, int i3) {
        this.f3296a = i3;
        this.f3297b = obj;
    }
}
