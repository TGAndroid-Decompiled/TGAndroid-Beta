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
    public final int f341a;
    public Object f342b;

    public d() {
        this.f341a = 2;
    }

    @Override
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        o0.a aVar;
        com.google.android.gms.internal.play_billing.g gVar = null;
        vf.e eVar = null;
        switch (this.f341a) {
            case 0:
                e eVar2 = (e) this.f342b;
                eVar2.f345b.b("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
                eVar2.a().post(new b(this, iBinder));
                return;
            case 1:
                com.google.android.gms.internal.play_billing.u.g("BillingClientTesting", "Billing Override Service connected.");
                c5.d0 d0Var = (c5.d0) this.f342b;
                int i10 = com.google.android.gms.internal.play_billing.f.f5795b;
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
                int i11 = c5.e0.f4401a;
                i3 c10 = c5.e0.c(26, m3.BROADCAST_ACTION_UNSPECIFIED);
                Objects.requireNonNull(c10, "ApiSuccess should not be null");
                pf.b bVar = d0Var.h;
                bVar.getClass();
                try {
                    bVar.u0(c10, (p3) bVar.f44073b);
                    return;
                } catch (Throwable th2) {
                    com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
                    return;
                }
            case 2:
                int i12 = vf.d.f47812a;
                if (iBinder != null) {
                    IInterface queryLocalInterface2 = iBinder.queryLocalInterface("android.support.customtabs.ICustomTabsService");
                    if (queryLocalInterface2 != null && (queryLocalInterface2 instanceof vf.e)) {
                        eVar = (vf.e) queryLocalInterface2;
                    } else {
                        ?? obj = new Object();
                        obj.f47811a = iBinder;
                        eVar = obj;
                    }
                }
                o0.a aVar2 = new o0.a(19, eVar, componentName);
                if (((of.d) ((WeakReference) this.f342b).get()) != null) {
                    of.f.f17034b = aVar2;
                    if (MessagesController.getInstance(UserConfig.selectedAccount).isWebBrowserUseCustomTabs() && (aVar = of.f.f17034b) != null) {
                        try {
                            ((vf.c) ((vf.e) aVar.f16796b)).H0();
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
                fg.f fVar = (fg.f) this.f342b;
                LinkedBlockingDeque linkedBlockingDeque = (LinkedBlockingDeque) fVar.f9522c;
                sb2.append(linkedBlockingDeque.size());
                Log.d("SessionLifecycleClient", sb2.toString());
                fVar.f9521b = new Messenger(iBinder);
                ArrayList arrayList = new ArrayList();
                linkedBlockingDeque.drainTo(arrayList);
                zd.e0.q(zd.e0.b((id.h) fVar.f9520a), new bb.j(fVar, arrayList, null, 6));
                return;
        }
    }

    @Override
    public final void onServiceDisconnected(ComponentName componentName) {
        switch (this.f341a) {
            case 0:
                e eVar = (e) this.f342b;
                eVar.f345b.b("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
                eVar.a().post(new c(this, 0));
                return;
            case 1:
                com.google.android.gms.internal.play_billing.u.h("BillingClientTesting", "Billing Override Service disconnected.");
                c5.d0 d0Var = (c5.d0) this.f342b;
                d0Var.E = null;
                d0Var.D = 0;
                return;
            case 2:
                if (((of.d) ((WeakReference) this.f342b).get()) != null) {
                    of.f.f17034b = null;
                    return;
                }
                return;
            default:
                Log.d("SessionLifecycleClient", "Disconnected from SessionLifecycleService");
                fg.f fVar = (fg.f) this.f342b;
                fVar.f9521b = null;
                fVar.getClass();
                return;
        }
    }

    public d(Object obj, int i10) {
        this.f341a = i10;
        this.f342b = obj;
    }
}
