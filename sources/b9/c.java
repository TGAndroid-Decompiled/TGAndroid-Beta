package b9;

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
public final class c implements ServiceConnection {
    public final int f3682a;
    public Object f3683b;

    public c() {
        this.f3682a = 3;
    }

    @Override
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        yf.c cVar;
        com.google.android.gms.internal.play_billing.g gVar = null;
        yf.f fVar = null;
        switch (this.f3682a) {
            case 0:
                d dVar = (d) this.f3683b;
                dVar.f3686b.b("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
                dVar.a().post(new a(this, iBinder));
                return;
            case 1:
                StringBuilder sb2 = new StringBuilder("Connected to SessionLifecycleService. Queue size ");
                com.google.firebase.messaging.q qVar = (com.google.firebase.messaging.q) this.f3683b;
                LinkedBlockingDeque linkedBlockingDeque = (LinkedBlockingDeque) qVar.f7759c;
                sb2.append(linkedBlockingDeque.size());
                Log.d("SessionLifecycleClient", sb2.toString());
                qVar.f7758b = new Messenger(iBinder);
                ArrayList arrayList = new ArrayList();
                linkedBlockingDeque.drainTo(arrayList);
                ce.f0.q(ce.f0.b((ld.h) qVar.f7757a), new bb.l(qVar, arrayList, null, 2));
                return;
            case 2:
                com.google.android.gms.internal.play_billing.u.g("BillingClientTesting", "Billing Override Service connected.");
                d5.b0 b0Var = (d5.b0) this.f3683b;
                int i10 = com.google.android.gms.internal.play_billing.f.f7213b;
                if (iBinder != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService");
                    if (queryLocalInterface instanceof com.google.android.gms.internal.play_billing.g) {
                        gVar = (com.google.android.gms.internal.play_billing.g) queryLocalInterface;
                    } else {
                        gVar = new a8.a(iBinder, "com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService", 3);
                    }
                }
                b0Var.E = gVar;
                b0Var.D = 2;
                int i11 = d5.c0.f7953a;
                i3 c10 = d5.c0.c(26, m3.BROADCAST_ACTION_UNSPECIFIED);
                Objects.requireNonNull(c10, "ApiSuccess should not be null");
                rf.b bVar = b0Var.h;
                bVar.getClass();
                try {
                    bVar.b0(c10, (p3) bVar.f47370b);
                    return;
                } catch (Throwable th2) {
                    com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
                    return;
                }
            default:
                int i12 = yf.e.f52589a;
                if (iBinder != null) {
                    IInterface queryLocalInterface2 = iBinder.queryLocalInterface("android.support.customtabs.ICustomTabsService");
                    if (queryLocalInterface2 != null && (queryLocalInterface2 instanceof yf.f)) {
                        fVar = (yf.f) queryLocalInterface2;
                    } else {
                        ?? obj = new Object();
                        obj.f52588a = iBinder;
                        fVar = obj;
                    }
                }
                yf.c cVar2 = new yf.c(fVar, componentName);
                if (((qf.b) ((WeakReference) this.f3683b).get()) != null) {
                    qf.d.f47072b = cVar2;
                    if (MessagesController.getInstance(UserConfig.selectedAccount).isWebBrowserUseCustomTabs() && (cVar = qf.d.f47072b) != null) {
                        try {
                            ((yf.d) ((yf.f) cVar.f52586a)).G0();
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
        switch (this.f3682a) {
            case 0:
                d dVar = (d) this.f3683b;
                dVar.f3686b.b("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
                dVar.a().post(new b(this, 0));
                return;
            case 1:
                Log.d("SessionLifecycleClient", "Disconnected from SessionLifecycleService");
                com.google.firebase.messaging.q qVar = (com.google.firebase.messaging.q) this.f3683b;
                qVar.f7758b = null;
                qVar.getClass();
                return;
            case 2:
                com.google.android.gms.internal.play_billing.u.h("BillingClientTesting", "Billing Override Service disconnected.");
                d5.b0 b0Var = (d5.b0) this.f3683b;
                b0Var.E = null;
                b0Var.D = 0;
                return;
            default:
                if (((qf.b) ((WeakReference) this.f3683b).get()) != null) {
                    qf.d.f47072b = null;
                    return;
                }
                return;
        }
    }

    public c(Object obj, int i10) {
        this.f3682a = i10;
        this.f3683b = obj;
    }
}
