package gf;

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
import com.google.firebase.messaging.s;
import ff.c;
import ff.d;
import ff.e;
import j$.util.Objects;
import ja.l;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import jd.e0;
import oc.i;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import p2.w;
import p2.x;
import sc.h;
import ze.b;
public final class a implements ServiceConnection {
    public final int f7274a;
    public Object f7275b;

    public a() {
        this.f7274a = 0;
    }

    @Override
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        b bVar;
        e eVar = null;
        g gVar = null;
        switch (this.f7274a) {
            case 0:
                int i10 = d.f6717a;
                if (iBinder != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.customtabs.ICustomTabsService");
                    if (queryLocalInterface != null && (queryLocalInterface instanceof e)) {
                        eVar = (e) queryLocalInterface;
                    } else {
                        ?? obj = new Object();
                        obj.f6716a = iBinder;
                        eVar = obj;
                    }
                }
                b bVar2 = new b(eVar, componentName);
                if (((ye.b) ((WeakReference) this.f7275b).get()) != null) {
                    ye.d.f50518b = bVar2;
                    if (MessagesController.getInstance(UserConfig.selectedAccount).isWebBrowserUseCustomTabs() && (bVar = ye.d.f50518b) != null) {
                        try {
                            ((c) ((e) bVar.f50824a)).F0();
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
                s sVar = (s) this.f7275b;
                LinkedBlockingDeque linkedBlockingDeque = (LinkedBlockingDeque) sVar.d;
                sb2.append(linkedBlockingDeque.size());
                Log.d("SessionLifecycleClient", sb2.toString());
                sVar.f5186c = new Messenger(iBinder);
                ArrayList arrayList = new ArrayList();
                linkedBlockingDeque.drainTo(arrayList);
                e0.q(e0.b((h) sVar.f5185b), new l(sVar, arrayList, null, 2));
                return;
            case 2:
                m8.c cVar = (m8.c) this.f7275b;
                cVar.f16893b.b("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
                cVar.a().post(new m8.a(this, iBinder));
                return;
            default:
                u.g("BillingClientTesting", "Billing Override Service connected.");
                w wVar = (w) this.f7275b;
                int i11 = f.f4580b;
                if (iBinder != null) {
                    IInterface queryLocalInterface2 = iBinder.queryLocalInterface("com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService");
                    if (queryLocalInterface2 instanceof g) {
                        gVar = (g) queryLocalInterface2;
                    } else {
                        gVar = new com.google.android.gms.internal.cast.a(iBinder, "com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService", 1);
                    }
                }
                wVar.E = gVar;
                wVar.D = 2;
                int i12 = x.f45497a;
                h3 c3 = x.c(26, l3.BROADCAST_ACTION_UNSPECIFIED);
                Objects.requireNonNull(c3, "ApiSuccess should not be null");
                i iVar = wVar.h;
                iVar.getClass();
                try {
                    iVar.A2(c3, (o3) iVar.f19483b);
                    return;
                } catch (Throwable th2) {
                    u.i("BillingLogger", "Unable to log.", th2);
                    return;
                }
        }
    }

    @Override
    public final void onServiceDisconnected(ComponentName componentName) {
        switch (this.f7274a) {
            case 0:
                if (((ye.b) ((WeakReference) this.f7275b).get()) != null) {
                    ye.d.f50518b = null;
                    return;
                }
                return;
            case 1:
                Log.d("SessionLifecycleClient", "Disconnected from SessionLifecycleService");
                s sVar = (s) this.f7275b;
                sVar.f5186c = null;
                sVar.getClass();
                return;
            case 2:
                m8.c cVar = (m8.c) this.f7275b;
                cVar.f16893b.b("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
                cVar.a().post(new m8.b(this, 0));
                return;
            default:
                u.h("BillingClientTesting", "Billing Override Service disconnected.");
                w wVar = (w) this.f7275b;
                wVar.E = null;
                wVar.D = 0;
                return;
        }
    }

    public a(Object obj, int i10) {
        this.f7274a = i10;
        this.f7275b = obj;
    }
}
