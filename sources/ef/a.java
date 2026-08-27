package ef;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.internal.play_billing.f;
import com.google.android.gms.internal.play_billing.g;
import com.google.android.gms.internal.play_billing.h3;
import com.google.android.gms.internal.play_billing.l3;
import com.google.android.gms.internal.play_billing.o3;
import com.google.android.gms.internal.play_billing.u;
import com.google.firebase.messaging.t;
import df.c;
import df.d;
import df.e;
import ia.m;
import id.f0;
import j$.util.Objects;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import n2.x;
import n2.y;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import rc.h;
import xe.b;

public final class a implements ServiceConnection {

    public final int f5380a;

    public Object f5381b;

    public a() {
        this.f5380a = 0;
    }

    @Override
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        b bVar;
        boolean z10 = false;
        int i10 = 2;
        ?? r10 = 0;
        g eVar = null;
        switch (this.f5380a) {
            case 0:
                int i11 = d.f4922a;
                if (iBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("android.support.customtabs.ICustomTabsService");
                    if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof e)) {
                        c cVar = new c();
                        cVar.f4921a = iBinder;
                        r10 = cVar;
                    } else {
                        r10 = (e) iInterfaceQueryLocalInterface;
                    }
                }
                b bVar2 = new b(r10, componentName, z10, 18);
                if (((we.c) ((WeakReference) this.f5381b).get()) != null) {
                    we.e.f49296b = bVar2;
                    if (MessagesController.getInstance(UserConfig.selectedAccount).isWebBrowserUseCustomTabs() && (bVar = we.e.f49296b) != null) {
                        try {
                            ((c) ((e) bVar.f49392b)).F0();
                        } catch (RemoteException unused) {
                            return;
                        } catch (Exception e9) {
                            FileLog.e(e9);
                            return;
                        }
                        break;
                    }
                }
                break;
            case 1:
                StringBuilder sb2 = new StringBuilder("Connected to SessionLifecycleService. Queue size ");
                t tVar = (t) this.f5381b;
                LinkedBlockingDeque linkedBlockingDeque = (LinkedBlockingDeque) tVar.d;
                sb2.append(linkedBlockingDeque.size());
                Log.d("SessionLifecycleClient", sb2.toString());
                tVar.f4620c = new Messenger(iBinder);
                ArrayList arrayList = new ArrayList();
                linkedBlockingDeque.drainTo(arrayList);
                f0.q(f0.b((h) tVar.f4619b), new m(tVar, arrayList, r10, i10));
                break;
            case 2:
                l8.c cVar2 = (l8.c) this.f5381b;
                cVar2.f15453b.b("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
                cVar2.a().post(new l8.a(this, iBinder));
                break;
            default:
                u.g("BillingClientTesting", "Billing Override Service connected.");
                x xVar = (x) this.f5381b;
                int i12 = f.f4008b;
                if (iBinder != null) {
                    IInterface iInterfaceQueryLocalInterface2 = iBinder.queryLocalInterface("com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService");
                    eVar = iInterfaceQueryLocalInterface2 instanceof g ? (g) iInterfaceQueryLocalInterface2 : new com.google.android.gms.internal.play_billing.e(iBinder, "com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService", 2);
                }
                xVar.E = eVar;
                xVar.D = 2;
                int i13 = y.f18189a;
                h3 h3VarC = y.c(26, l3.BROADCAST_ACTION_UNSPECIFIED);
                Objects.requireNonNull(h3VarC, "ApiSuccess should not be null");
                g5.b bVar3 = xVar.h;
                bVar3.getClass();
                try {
                    bVar3.E(h3VarC, (o3) bVar3.f6389b);
                } catch (Throwable th) {
                    u.i("BillingLogger", "Unable to log.", th);
                }
                break;
        }
    }

    @Override
    public final void onServiceDisconnected(ComponentName componentName) {
        int i10 = 0;
        switch (this.f5380a) {
            case 0:
                if (((we.c) ((WeakReference) this.f5381b).get()) != null) {
                    we.e.f49296b = null;
                }
                break;
            case 1:
                Log.d("SessionLifecycleClient", "Disconnected from SessionLifecycleService");
                t tVar = (t) this.f5381b;
                tVar.f4620c = null;
                tVar.getClass();
                break;
            case 2:
                l8.c cVar = (l8.c) this.f5381b;
                cVar.f15453b.b("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
                cVar.a().post(new l8.b(this, i10));
                break;
            default:
                u.h("BillingClientTesting", "Billing Override Service disconnected.");
                x xVar = (x) this.f5381b;
                xVar.E = null;
                xVar.D = 0;
                break;
        }
    }

    public a(Object obj, int i10) {
        this.f5380a = i10;
        this.f5381b = obj;
    }
}
