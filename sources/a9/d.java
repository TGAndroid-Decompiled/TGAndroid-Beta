package a9;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.internal.play_billing.i3;
import com.google.android.gms.internal.play_billing.m3;
import com.google.android.gms.internal.play_billing.p3;
import j$.util.Objects;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
public final class d implements ServiceConnection {
    public final int f340a;
    public Object f341b;

    public d() {
        this.f340a = 2;
    }

    @Override
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        n6.k kVar;
        com.google.android.gms.internal.play_billing.g gVar = null;
        wf.e eVar = null;
        switch (this.f340a) {
            case 0:
                e eVar2 = (e) this.f341b;
                eVar2.f345b.b("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
                eVar2.a().post(new b(this, iBinder));
                return;
            case 1:
                com.google.android.gms.internal.play_billing.u.g("BillingClientTesting", "Billing Override Service connected.");
                c5.d0 d0Var = (c5.d0) this.f341b;
                int i10 = com.google.android.gms.internal.play_billing.f.f7345b;
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
                int i11 = c5.e0.f4230a;
                i3 c10 = c5.e0.c(26, m3.BROADCAST_ACTION_UNSPECIFIED);
                Objects.requireNonNull(c10, "ApiSuccess should not be null");
                pf.b bVar = d0Var.h;
                bVar.getClass();
                try {
                    bVar.i0(c10, (p3) bVar.f45592b);
                    return;
                } catch (Throwable th2) {
                    com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
                    return;
                }
            case 2:
                int i12 = wf.d.f50427a;
                if (iBinder != null) {
                    IInterface queryLocalInterface2 = iBinder.queryLocalInterface("android.support.customtabs.ICustomTabsService");
                    if (queryLocalInterface2 != null && (queryLocalInterface2 instanceof wf.e)) {
                        eVar = (wf.e) queryLocalInterface2;
                    } else {
                        ?? obj = new Object();
                        obj.f50426a = iBinder;
                        eVar = obj;
                    }
                }
                n6.k kVar2 = new n6.k(26, eVar, componentName);
                if (((of.d) ((WeakReference) this.f341b).get()) != null) {
                    of.f.f17171b = kVar2;
                    if (MessagesController.getInstance(UserConfig.selectedAccount).isWebBrowserUseCustomTabs() && (kVar = of.f.f17171b) != null) {
                        try {
                            ((wf.c) ((wf.e) kVar.f16729b)).G0();
                            return;
                        } catch (RemoteException unused) {
                            return;
                        } catch (Exception e7) {
                            FileLog.e(e7);
                            return;
                        }
                    }
                    return;
                }
                return;
            default:
                StringBuilder sb2 = new StringBuilder("Connected to SessionLifecycleService. Queue size ");
                pi.f fVar = (pi.f) this.f341b;
                LinkedBlockingDeque linkedBlockingDeque = (LinkedBlockingDeque) fVar.f45940c;
                sb2.append(linkedBlockingDeque.size());
                Log.d("SessionLifecycleClient", sb2.toString());
                fVar.f45939b = new Messenger(iBinder);
                ArrayList arrayList = new ArrayList();
                linkedBlockingDeque.drainTo(arrayList);
                ae.g0.q(ae.g0.b((jd.h) fVar.f45938a), new bb.i(fVar, arrayList, null, 6));
                return;
        }
    }

    @Override
    public final void onServiceDisconnected(ComponentName componentName) {
        switch (this.f340a) {
            case 0:
                e eVar = (e) this.f341b;
                eVar.f345b.b("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
                eVar.a().post(new c(this, 0));
                return;
            case 1:
                com.google.android.gms.internal.play_billing.u.h("BillingClientTesting", "Billing Override Service disconnected.");
                c5.d0 d0Var = (c5.d0) this.f341b;
                d0Var.E = null;
                d0Var.D = 0;
                return;
            case 2:
                if (((of.d) ((WeakReference) this.f341b).get()) != null) {
                    of.f.f17171b = null;
                    return;
                }
                return;
            default:
                Log.d("SessionLifecycleClient", "Disconnected from SessionLifecycleService");
                pi.f fVar = (pi.f) this.f341b;
                fVar.f45939b = null;
                fVar.getClass();
                return;
        }
    }

    public d(Object obj, int i10) {
        this.f340a = i10;
        this.f341b = obj;
    }
}
