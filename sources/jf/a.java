package jf;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.internal.play_billing.f;
import com.google.android.gms.internal.play_billing.g;
import com.google.android.gms.internal.play_billing.i3;
import com.google.android.gms.internal.play_billing.m3;
import com.google.android.gms.internal.play_billing.p3;
import com.google.android.gms.internal.play_billing.u;
import f7.b;
import hf.c;
import hf.d;
import hf.e;
import j$.util.Objects;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import ld.e0;
import n7.qa;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import p2.x;
import p2.y;
import uc.h;
public final class a implements ServiceConnection {
    public final int f10004a;
    public Object f10005b;

    public a() {
        this.f10004a = 0;
    }

    @Override
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        b bVar;
        e eVar = null;
        g gVar = null;
        switch (this.f10004a) {
            case 0:
                int i10 = d.f7383a;
                if (iBinder != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.customtabs.ICustomTabsService");
                    if (queryLocalInterface != null && (queryLocalInterface instanceof e)) {
                        eVar = (e) queryLocalInterface;
                    } else {
                        ?? obj = new Object();
                        obj.f7382a = iBinder;
                        eVar = obj;
                    }
                }
                b bVar2 = new b(7, eVar, componentName);
                if (((af.e) ((WeakReference) this.f10005b).get()) != null) {
                    af.g.f183b = bVar2;
                    if (MessagesController.getInstance(UserConfig.selectedAccount).isWebBrowserUseCustomTabs() && (bVar = af.g.f183b) != null) {
                        try {
                            ((c) ((e) bVar.f6120b)).F0();
                            return;
                        } catch (RemoteException unused) {
                            return;
                        } catch (Exception e6) {
                            FileLog.e(e6);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 1:
                StringBuilder sb = new StringBuilder("Connected to SessionLifecycleService. Queue size ");
                sf.e eVar2 = (sf.e) this.f10005b;
                LinkedBlockingDeque linkedBlockingDeque = (LinkedBlockingDeque) eVar2.d;
                sb.append(linkedBlockingDeque.size());
                Log.d("SessionLifecycleClient", sb.toString());
                eVar2.f47316c = new Messenger(iBinder);
                ArrayList arrayList = new ArrayList();
                linkedBlockingDeque.drainTo(arrayList);
                e0.q(e0.b((h) eVar2.f47315b), new k1.c(eVar2, arrayList, null, 5));
                return;
            case 2:
                o8.c cVar = (o8.c) this.f10005b;
                cVar.f16627b.b("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
                cVar.a().post(new o8.a(this, iBinder));
                return;
            default:
                u.g("BillingClientTesting", "Billing Override Service connected.");
                x xVar = (x) this.f10005b;
                int i11 = f.f3472b;
                if (iBinder != null) {
                    IInterface queryLocalInterface2 = iBinder.queryLocalInterface("com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService");
                    if (queryLocalInterface2 instanceof g) {
                        gVar = (g) queryLocalInterface2;
                    } else {
                        gVar = new a7.a(iBinder, "com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService", 2);
                    }
                }
                xVar.E = gVar;
                xVar.D = 2;
                int i12 = y.f44185a;
                i3 c3 = y.c(26, m3.BROADCAST_ACTION_UNSPECIFIED);
                Objects.requireNonNull(c3, "ApiSuccess should not be null");
                qa qaVar = xVar.h;
                qaVar.getClass();
                try {
                    qaVar.w1(c3, (p3) qaVar.f15699b);
                    return;
                } catch (Throwable th2) {
                    u.i("BillingLogger", "Unable to log.", th2);
                    return;
                }
        }
    }

    @Override
    public final void onServiceDisconnected(ComponentName componentName) {
        switch (this.f10004a) {
            case 0:
                if (((af.e) ((WeakReference) this.f10005b).get()) != null) {
                    af.g.f183b = null;
                    return;
                }
                return;
            case 1:
                Log.d("SessionLifecycleClient", "Disconnected from SessionLifecycleService");
                sf.e eVar = (sf.e) this.f10005b;
                eVar.f47316c = null;
                eVar.getClass();
                return;
            case 2:
                o8.c cVar = (o8.c) this.f10005b;
                cVar.f16627b.b("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
                cVar.a().post(new o8.b(this, 0));
                return;
            default:
                u.h("BillingClientTesting", "Billing Override Service disconnected.");
                x xVar = (x) this.f10005b;
                xVar.E = null;
                xVar.D = 0;
                return;
        }
    }

    public a(Object obj, int i10) {
        this.f10004a = i10;
        this.f10005b = obj;
    }
}
