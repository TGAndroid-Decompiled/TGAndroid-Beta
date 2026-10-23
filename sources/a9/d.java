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
    public final int f321a;
    public Object f322b;

    public d() {
        this.f321a = 3;
    }

    @Override
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        mi.q qVar;
        com.google.android.gms.internal.play_billing.g gVar = null;
        xf.e eVar = null;
        switch (this.f321a) {
            case 0:
                e eVar2 = (e) this.f322b;
                eVar2.f326b.b("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
                eVar2.a().post(new b(this, iBinder));
                return;
            case 1:
                StringBuilder sb2 = new StringBuilder("Connected to SessionLifecycleService. Queue size ");
                com.google.firebase.messaging.r rVar = (com.google.firebase.messaging.r) this.f322b;
                LinkedBlockingDeque linkedBlockingDeque = (LinkedBlockingDeque) rVar.d;
                sb2.append(linkedBlockingDeque.size());
                Log.d("SessionLifecycleClient", sb2.toString());
                rVar.f7673c = new Messenger(iBinder);
                ArrayList arrayList = new ArrayList();
                linkedBlockingDeque.drainTo(arrayList);
                be.f0.q(be.f0.b((kd.h) rVar.f7672b), new ab.l(rVar, arrayList, null, 2));
                return;
            case 2:
                com.google.android.gms.internal.play_billing.u.g("BillingClientTesting", "Billing Override Service connected.");
                c5.e0 e0Var = (c5.e0) this.f322b;
                int i10 = com.google.android.gms.internal.play_billing.f.f7114b;
                if (iBinder != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService");
                    if (queryLocalInterface instanceof com.google.android.gms.internal.play_billing.g) {
                        gVar = (com.google.android.gms.internal.play_billing.g) queryLocalInterface;
                    } else {
                        gVar = new a(iBinder, "com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService", 2);
                    }
                }
                e0Var.E = gVar;
                e0Var.D = 2;
                int i11 = c5.f0.f4736a;
                i3 c10 = c5.f0.c(26, n3.BROADCAST_ACTION_UNSPECIFIED);
                Objects.requireNonNull(c10, "ApiSuccess should not be null");
                n4.s sVar = e0Var.h;
                sVar.getClass();
                try {
                    sVar.U(c10, (q3) sVar.f17188b);
                    return;
                } catch (Throwable th2) {
                    com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
                    return;
                }
            default:
                int i12 = xf.d.f50228a;
                if (iBinder != null) {
                    IInterface queryLocalInterface2 = iBinder.queryLocalInterface("android.support.customtabs.ICustomTabsService");
                    if (queryLocalInterface2 != null && (queryLocalInterface2 instanceof xf.e)) {
                        eVar = (xf.e) queryLocalInterface2;
                    } else {
                        ?? obj = new Object();
                        obj.f50227a = iBinder;
                        eVar = obj;
                    }
                }
                mi.q qVar2 = new mi.q(29, eVar, componentName);
                if (((pf.b) ((WeakReference) this.f322b).get()) != null) {
                    pf.d.f44710b = qVar2;
                    if (MessagesController.getInstance(UserConfig.selectedAccount).isWebBrowserUseCustomTabs() && (qVar = pf.d.f44710b) != null) {
                        try {
                            ((xf.c) ((xf.e) qVar.f17036b)).G0();
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
        switch (this.f321a) {
            case 0:
                e eVar = (e) this.f322b;
                eVar.f326b.b("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
                eVar.a().post(new c(this, 0));
                return;
            case 1:
                Log.d("SessionLifecycleClient", "Disconnected from SessionLifecycleService");
                com.google.firebase.messaging.r rVar = (com.google.firebase.messaging.r) this.f322b;
                rVar.f7673c = null;
                rVar.getClass();
                return;
            case 2:
                com.google.android.gms.internal.play_billing.u.h("BillingClientTesting", "Billing Override Service disconnected.");
                c5.e0 e0Var = (c5.e0) this.f322b;
                e0Var.E = null;
                e0Var.D = 0;
                return;
            default:
                if (((pf.b) ((WeakReference) this.f322b).get()) != null) {
                    pf.d.f44710b = null;
                    return;
                }
                return;
        }
    }

    public d(Object obj, int i10) {
        this.f321a = i10;
        this.f322b = obj;
    }
}
