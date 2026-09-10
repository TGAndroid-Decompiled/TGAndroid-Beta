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
import n7.a1;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
public final class d implements ServiceConnection {
    public final int f315a;
    public Object f316b;

    public d() {
        this.f315a = 2;
    }

    @Override
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        a1 a1Var;
        com.google.android.gms.internal.play_billing.g gVar = null;
        uf.e eVar = null;
        switch (this.f315a) {
            case 0:
                e eVar2 = (e) this.f316b;
                eVar2.f320b.b("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
                eVar2.a().post(new b(this, iBinder));
                return;
            case 1:
                com.google.android.gms.internal.play_billing.u.g("BillingClientTesting", "Billing Override Service connected.");
                c5.d0 d0Var = (c5.d0) this.f316b;
                int i10 = com.google.android.gms.internal.play_billing.f.f5552b;
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
                int i11 = c5.e0.f4287a;
                i3 c10 = c5.e0.c(26, m3.BROADCAST_ACTION_UNSPECIFIED);
                Objects.requireNonNull(c10, "ApiSuccess should not be null");
                n4.y yVar = d0Var.h;
                yVar.getClass();
                try {
                    yVar.N(c10, (p3) yVar.f13824b);
                    return;
                } catch (Throwable th2) {
                    com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
                    return;
                }
            case 2:
                int i12 = uf.d.f42664a;
                if (iBinder != null) {
                    IInterface queryLocalInterface2 = iBinder.queryLocalInterface("android.support.customtabs.ICustomTabsService");
                    if (queryLocalInterface2 != null && (queryLocalInterface2 instanceof uf.e)) {
                        eVar = (uf.e) queryLocalInterface2;
                    } else {
                        ?? obj = new Object();
                        obj.f42663a = iBinder;
                        eVar = obj;
                    }
                }
                a1 a1Var2 = new a1(18, eVar, componentName);
                if (((nf.d) ((WeakReference) this.f316b).get()) != null) {
                    nf.f.f14043b = a1Var2;
                    if (MessagesController.getInstance(UserConfig.selectedAccount).isWebBrowserUseCustomTabs() && (a1Var = nf.f.f14043b) != null) {
                        try {
                            ((uf.c) ((uf.e) a1Var.f13938b)).H0();
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
                ki.f fVar = (ki.f) this.f316b;
                LinkedBlockingDeque linkedBlockingDeque = (LinkedBlockingDeque) fVar.f12540c;
                sb2.append(linkedBlockingDeque.size());
                Log.d("SessionLifecycleClient", sb2.toString());
                fVar.f12539b = new Messenger(iBinder);
                ArrayList arrayList = new ArrayList();
                linkedBlockingDeque.drainTo(arrayList);
                zd.e0.q(zd.e0.b((id.h) fVar.f12538a), new bb.i(fVar, arrayList, null, 6));
                return;
        }
    }

    @Override
    public final void onServiceDisconnected(ComponentName componentName) {
        switch (this.f315a) {
            case 0:
                e eVar = (e) this.f316b;
                eVar.f320b.b("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
                eVar.a().post(new c(this, 0));
                return;
            case 1:
                com.google.android.gms.internal.play_billing.u.h("BillingClientTesting", "Billing Override Service disconnected.");
                c5.d0 d0Var = (c5.d0) this.f316b;
                d0Var.E = null;
                d0Var.D = 0;
                return;
            case 2:
                if (((nf.d) ((WeakReference) this.f316b).get()) != null) {
                    nf.f.f14043b = null;
                    return;
                }
                return;
            default:
                Log.d("SessionLifecycleClient", "Disconnected from SessionLifecycleService");
                ki.f fVar = (ki.f) this.f316b;
                fVar.f12539b = null;
                fVar.getClass();
                return;
        }
    }

    public d(Object obj, int i10) {
        this.f315a = i10;
        this.f316b = obj;
    }
}
