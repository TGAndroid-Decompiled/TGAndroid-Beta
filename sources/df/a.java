package df;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import cf.d;
import cf.e;
import com.google.android.gms.internal.play_billing.f;
import com.google.android.gms.internal.play_billing.g;
import com.google.android.gms.internal.play_billing.i3;
import com.google.android.gms.internal.play_billing.m3;
import com.google.android.gms.internal.play_billing.p3;
import com.google.android.gms.internal.play_billing.u;
import com.google.firebase.messaging.t;
import ha.l;
import hd.f0;
import j$.util.Objects;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import n2.y;
import n2.z;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import qc.h;
import ve.c;
import we.b;
public final class a implements ServiceConnection {
    public final int f4481a;
    public Object f4482b;

    public a() {
        this.f4481a = 0;
    }

    @Override
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        b bVar;
        e eVar = null;
        g gVar = null;
        switch (this.f4481a) {
            case 0:
                int i9 = d.f2378a;
                if (iBinder != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.customtabs.ICustomTabsService");
                    if (queryLocalInterface != null && (queryLocalInterface instanceof e)) {
                        eVar = (e) queryLocalInterface;
                    } else {
                        ?? obj = new Object();
                        obj.f2377a = iBinder;
                        eVar = obj;
                    }
                }
                b bVar2 = new b(eVar, componentName, false, 10);
                if (((c) ((WeakReference) this.f4482b).get()) != null) {
                    ve.e.f48385b = bVar2;
                    if (MessagesController.getInstance(UserConfig.selectedAccount).isWebBrowserUseCustomTabs() && (bVar = ve.e.f48385b) != null) {
                        try {
                            ((cf.c) ((e) bVar.f48793b)).F0();
                            return;
                        } catch (RemoteException unused) {
                            return;
                        } catch (Exception e10) {
                            FileLog.e(e10);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 1:
                StringBuilder sb2 = new StringBuilder("Connected to SessionLifecycleService. Queue size ");
                t tVar = (t) this.f4482b;
                LinkedBlockingDeque linkedBlockingDeque = (LinkedBlockingDeque) tVar.d;
                sb2.append(linkedBlockingDeque.size());
                Log.d("SessionLifecycleClient", sb2.toString());
                tVar.f4178c = new Messenger(iBinder);
                ArrayList arrayList = new ArrayList();
                linkedBlockingDeque.drainTo(arrayList);
                f0.q(f0.b((h) tVar.f4177b), new l(tVar, arrayList, null, 2));
                return;
            case 2:
                k8.c cVar = (k8.c) this.f4482b;
                cVar.f14672b.b("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
                cVar.a().post(new k8.a(this, iBinder));
                return;
            default:
                u.g("BillingClientTesting", "Billing Override Service connected.");
                y yVar = (y) this.f4482b;
                int i10 = f.f3561b;
                if (iBinder != null) {
                    IInterface queryLocalInterface2 = iBinder.queryLocalInterface("com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService");
                    if (queryLocalInterface2 instanceof g) {
                        gVar = (g) queryLocalInterface2;
                    } else {
                        gVar = new b7.a(iBinder, "com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService", 3);
                    }
                }
                yVar.E = gVar;
                yVar.D = 2;
                int i11 = z.f18363a;
                i3 c10 = z.c(26, m3.BROADCAST_ACTION_UNSPECIFIED);
                Objects.requireNonNull(c10, "ApiSuccess should not be null");
                g5.b bVar3 = yVar.h;
                bVar3.getClass();
                try {
                    bVar3.F(c10, (p3) bVar3.f7111b);
                    return;
                } catch (Throwable th) {
                    u.i("BillingLogger", "Unable to log.", th);
                    return;
                }
        }
    }

    @Override
    public final void onServiceDisconnected(ComponentName componentName) {
        switch (this.f4481a) {
            case 0:
                if (((c) ((WeakReference) this.f4482b).get()) != null) {
                    ve.e.f48385b = null;
                    return;
                }
                return;
            case 1:
                Log.d("SessionLifecycleClient", "Disconnected from SessionLifecycleService");
                t tVar = (t) this.f4482b;
                tVar.f4178c = null;
                tVar.getClass();
                return;
            case 2:
                k8.c cVar = (k8.c) this.f4482b;
                cVar.f14672b.b("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
                cVar.a().post(new k8.b(this, 0));
                return;
            default:
                u.h("BillingClientTesting", "Billing Override Service disconnected.");
                y yVar = (y) this.f4482b;
                yVar.E = null;
                yVar.D = 0;
                return;
        }
    }

    public a(Object obj, int i9) {
        this.f4481a = i9;
        this.f4482b = obj;
    }
}
