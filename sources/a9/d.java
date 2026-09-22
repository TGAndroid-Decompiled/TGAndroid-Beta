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
    public final int f316a;
    public Object f317b;

    public d() {
        this.f316a = 2;
    }

    @Override
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        m5.e eVar;
        com.google.android.gms.internal.play_billing.g gVar = null;
        vf.e eVar2 = null;
        switch (this.f316a) {
            case 0:
                e eVar3 = (e) this.f317b;
                eVar3.f321b.b("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
                eVar3.a().post(new b(this, iBinder));
                return;
            case 1:
                com.google.android.gms.internal.play_billing.u.g("BillingClientTesting", "Billing Override Service connected.");
                c5.c0 c0Var = (c5.c0) this.f317b;
                int i10 = com.google.android.gms.internal.play_billing.f.f6777b;
                if (iBinder != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService");
                    if (queryLocalInterface instanceof com.google.android.gms.internal.play_billing.g) {
                        gVar = (com.google.android.gms.internal.play_billing.g) queryLocalInterface;
                    } else {
                        gVar = new a(iBinder, "com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService", 2);
                    }
                }
                c0Var.E = gVar;
                c0Var.D = 2;
                int i11 = c5.d0.f3869a;
                i3 c10 = c5.d0.c(26, m3.BROADCAST_ACTION_UNSPECIFIED);
                Objects.requireNonNull(c10, "ApiSuccess should not be null");
                of.b bVar = c0Var.h;
                bVar.getClass();
                try {
                    bVar.j0(c10, (p3) bVar.f15697b);
                    return;
                } catch (Throwable th2) {
                    com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
                    return;
                }
            case 2:
                int i12 = vf.d.f44615a;
                if (iBinder != null) {
                    IInterface queryLocalInterface2 = iBinder.queryLocalInterface("android.support.customtabs.ICustomTabsService");
                    if (queryLocalInterface2 != null && (queryLocalInterface2 instanceof vf.e)) {
                        eVar2 = (vf.e) queryLocalInterface2;
                    } else {
                        ?? obj = new Object();
                        obj.f44614a = iBinder;
                        eVar2 = obj;
                    }
                }
                m5.e eVar4 = new m5.e(24, eVar2, componentName);
                if (((nf.d) ((WeakReference) this.f317b).get()) != null) {
                    nf.f.f15445b = eVar4;
                    if (MessagesController.getInstance(UserConfig.selectedAccount).isWebBrowserUseCustomTabs() && (eVar = nf.f.f15445b) != null) {
                        try {
                            ((vf.c) ((vf.e) eVar.f14968b)).H0();
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
            default:
                StringBuilder sb2 = new StringBuilder("Connected to SessionLifecycleService. Queue size ");
                oi.f fVar = (oi.f) this.f317b;
                LinkedBlockingDeque linkedBlockingDeque = (LinkedBlockingDeque) fVar.f15765c;
                sb2.append(linkedBlockingDeque.size());
                Log.d("SessionLifecycleClient", sb2.toString());
                fVar.f15764b = new Messenger(iBinder);
                ArrayList arrayList = new ArrayList();
                linkedBlockingDeque.drainTo(arrayList);
                zd.e0.q(zd.e0.b((id.h) fVar.f15763a), new bb.i(fVar, arrayList, null, 6));
                return;
        }
    }

    @Override
    public final void onServiceDisconnected(ComponentName componentName) {
        switch (this.f316a) {
            case 0:
                e eVar = (e) this.f317b;
                eVar.f321b.b("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
                eVar.a().post(new c(this, 0));
                return;
            case 1:
                com.google.android.gms.internal.play_billing.u.h("BillingClientTesting", "Billing Override Service disconnected.");
                c5.c0 c0Var = (c5.c0) this.f317b;
                c0Var.E = null;
                c0Var.D = 0;
                return;
            case 2:
                if (((nf.d) ((WeakReference) this.f317b).get()) != null) {
                    nf.f.f15445b = null;
                    return;
                }
                return;
            default:
                Log.d("SessionLifecycleClient", "Disconnected from SessionLifecycleService");
                oi.f fVar = (oi.f) this.f317b;
                fVar.f15764b = null;
                fVar.getClass();
                return;
        }
    }

    public d(Object obj, int i10) {
        this.f316a = i10;
        this.f317b = obj;
    }
}
