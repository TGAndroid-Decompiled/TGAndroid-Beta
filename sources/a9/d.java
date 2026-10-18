package a9;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.internal.play_billing.i3;
import com.google.android.gms.internal.play_billing.n3;
import com.google.android.gms.internal.play_billing.q3;
import j$.util.Objects;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
public final class d implements ServiceConnection {
    public final int f322a;
    public Object f323b;

    public d() {
        this.f322a = 3;
    }

    @Override
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        xf.c cVar;
        com.google.android.gms.internal.play_billing.g gVar = null;
        xf.f fVar = null;
        switch (this.f322a) {
            case 0:
                e eVar = (e) this.f323b;
                eVar.f327b.b("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
                eVar.a().post(new b(this, iBinder));
                return;
            case 1:
                StringBuilder sb2 = new StringBuilder("Connected to SessionLifecycleService. Queue size ");
                com.google.firebase.messaging.r rVar = (com.google.firebase.messaging.r) this.f323b;
                LinkedBlockingDeque linkedBlockingDeque = (LinkedBlockingDeque) rVar.d;
                sb2.append(linkedBlockingDeque.size());
                Log.d("SessionLifecycleClient", sb2.toString());
                rVar.f7662c = new Messenger(iBinder);
                ArrayList arrayList = new ArrayList();
                linkedBlockingDeque.drainTo(arrayList);
                be.f0.q(be.f0.b((kd.h) rVar.f7661b), new ab.l(rVar, arrayList, null, 2));
                return;
            case 2:
                com.google.android.gms.internal.play_billing.u.g("BillingClientTesting", "Billing Override Service connected.");
                c5.d0 d0Var = (c5.d0) this.f323b;
                int i10 = com.google.android.gms.internal.play_billing.f.f7103b;
                if (iBinder != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService");
                    if (queryLocalInterface instanceof com.google.android.gms.internal.play_billing.g) {
                        gVar = (com.google.android.gms.internal.play_billing.g) queryLocalInterface;
                    } else {
                        gVar = new a(iBinder, "com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService", 2);
                    }
                }
                d0Var.E = gVar;
                d0Var.D = 2;
                int i11 = c5.e0.f4730a;
                i3 c10 = c5.e0.c(26, n3.BROADCAST_ACTION_UNSPECIFIED);
                Objects.requireNonNull(c10, "ApiSuccess should not be null");
                n4.s sVar = d0Var.h;
                sVar.getClass();
                try {
                    sVar.V(c10, (q3) sVar.f17124b);
                    return;
                } catch (Throwable th2) {
                    com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
                    return;
                }
            default:
                int i12 = xf.e.f49778a;
                if (iBinder != null) {
                    IInterface queryLocalInterface2 = iBinder.queryLocalInterface("android.support.customtabs.ICustomTabsService");
                    if (queryLocalInterface2 != null && (queryLocalInterface2 instanceof xf.f)) {
                        fVar = (xf.f) queryLocalInterface2;
                    } else {
                        ?? obj = new Object();
                        obj.f49777a = iBinder;
                        fVar = obj;
                    }
                }
                xf.c cVar2 = new xf.c(fVar, componentName);
                if (((pf.b) ((WeakReference) this.f323b).get()) != null) {
                    pf.d.f44288b = cVar2;
                    if (MessagesController.getInstance(UserConfig.selectedAccount).isWebBrowserUseCustomTabs() && (cVar = pf.d.f44288b) != null) {
                        try {
                            ((xf.d) ((xf.f) cVar.f49775a)).G0();
                            return;
                        } catch (RemoteException unused) {
                            return;
                        } catch (Exception e) {
                            FileLog.e(e);
                            return;
                        }
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final void onServiceDisconnected(ComponentName componentName) {
        switch (this.f322a) {
            case 0:
                e eVar = (e) this.f323b;
                eVar.f327b.b("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
                eVar.a().post(new c(this, 0));
                return;
            case 1:
                Log.d("SessionLifecycleClient", "Disconnected from SessionLifecycleService");
                com.google.firebase.messaging.r rVar = (com.google.firebase.messaging.r) this.f323b;
                rVar.f7662c = null;
                rVar.getClass();
                return;
            case 2:
                com.google.android.gms.internal.play_billing.u.h("BillingClientTesting", "Billing Override Service disconnected.");
                c5.d0 d0Var = (c5.d0) this.f323b;
                d0Var.E = null;
                d0Var.D = 0;
                return;
            default:
                if (((pf.b) ((WeakReference) this.f323b).get()) != null) {
                    pf.d.f44288b = null;
                    return;
                }
                return;
        }
    }

    public d(Object obj, int i10) {
        this.f322a = i10;
        this.f323b = obj;
    }
}
