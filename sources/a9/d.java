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
    public final int f342a;
    public Object f343b;

    public d() {
        this.f342a = 2;
    }

    @Override
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        o0.a aVar;
        com.google.android.gms.internal.play_billing.g gVar = null;
        vf.e eVar = null;
        switch (this.f342a) {
            case 0:
                e eVar2 = (e) this.f343b;
                eVar2.f347b.b("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
                eVar2.a().post(new b(this, iBinder));
                return;
            case 1:
                com.google.android.gms.internal.play_billing.u.g("BillingClientTesting", "Billing Override Service connected.");
                c5.d0 d0Var = (c5.d0) this.f343b;
                int i10 = com.google.android.gms.internal.play_billing.f.f7296b;
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
                int i11 = c5.e0.f4180a;
                i3 c10 = c5.e0.c(26, m3.BROADCAST_ACTION_UNSPECIFIED);
                Objects.requireNonNull(c10, "ApiSuccess should not be null");
                of.b bVar = d0Var.h;
                bVar.getClass();
                try {
                    bVar.c0(c10, (p3) bVar.f17158b);
                    return;
                } catch (Throwable th2) {
                    com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
                    return;
                }
            case 2:
                int i12 = vf.d.f48264a;
                if (iBinder != null) {
                    IInterface queryLocalInterface2 = iBinder.queryLocalInterface("android.support.customtabs.ICustomTabsService");
                    if (queryLocalInterface2 != null && (queryLocalInterface2 instanceof vf.e)) {
                        eVar = (vf.e) queryLocalInterface2;
                    } else {
                        ?? obj = new Object();
                        obj.f48263a = iBinder;
                        eVar = obj;
                    }
                }
                o0.a aVar2 = new o0.a(19, eVar, componentName);
                if (((nf.d) ((WeakReference) this.f343b).get()) != null) {
                    nf.f.f16880b = aVar2;
                    if (MessagesController.getInstance(UserConfig.selectedAccount).isWebBrowserUseCustomTabs() && (aVar = nf.f.f16880b) != null) {
                        try {
                            ((vf.c) ((vf.e) aVar.f16928b)).H0();
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
                qi.f fVar = (qi.f) this.f343b;
                LinkedBlockingDeque linkedBlockingDeque = (LinkedBlockingDeque) fVar.f45529c;
                sb2.append(linkedBlockingDeque.size());
                Log.d("SessionLifecycleClient", sb2.toString());
                fVar.f45528b = new Messenger(iBinder);
                ArrayList arrayList = new ArrayList();
                linkedBlockingDeque.drainTo(arrayList);
                zd.e0.q(zd.e0.b((id.h) fVar.f45527a), new bb.i(fVar, arrayList, null, 6));
                return;
        }
    }

    @Override
    public final void onServiceDisconnected(ComponentName componentName) {
        switch (this.f342a) {
            case 0:
                e eVar = (e) this.f343b;
                eVar.f347b.b("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
                eVar.a().post(new c(this, 0));
                return;
            case 1:
                com.google.android.gms.internal.play_billing.u.h("BillingClientTesting", "Billing Override Service disconnected.");
                c5.d0 d0Var = (c5.d0) this.f343b;
                d0Var.E = null;
                d0Var.D = 0;
                return;
            case 2:
                if (((nf.d) ((WeakReference) this.f343b).get()) != null) {
                    nf.f.f16880b = null;
                    return;
                }
                return;
            default:
                Log.d("SessionLifecycleClient", "Disconnected from SessionLifecycleService");
                qi.f fVar = (qi.f) this.f343b;
                fVar.f45528b = null;
                fVar.getClass();
                return;
        }
    }

    public d(Object obj, int i10) {
        this.f342a = i10;
        this.f343b = obj;
    }
}
