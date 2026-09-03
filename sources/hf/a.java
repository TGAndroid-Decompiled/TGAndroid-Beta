package hf;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.internal.play_billing.g;
import com.google.android.gms.internal.play_billing.i3;
import com.google.android.gms.internal.play_billing.m3;
import com.google.android.gms.internal.play_billing.p3;
import com.google.android.gms.internal.play_billing.u;
import f7.b;
import gf.c;
import gf.d;
import gf.e;
import j$.util.Objects;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import ld.e0;
import n7.qa;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import p2.y;
import p2.z;
import rf.f;
import uc.h;
public final class a implements ServiceConnection {
    public final int f7048a;
    public Object f7049b;

    public a() {
        this.f7048a = 0;
    }

    @Override
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        b bVar;
        e eVar = null;
        g gVar = null;
        switch (this.f7048a) {
            case 0:
                int i10 = d.f6534a;
                if (iBinder != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.customtabs.ICustomTabsService");
                    if (queryLocalInterface != null && (queryLocalInterface instanceof e)) {
                        eVar = (e) queryLocalInterface;
                    } else {
                        ?? obj = new Object();
                        obj.f6533a = iBinder;
                        eVar = obj;
                    }
                }
                b bVar2 = new b(6, eVar, componentName);
                if (((ze.b) ((WeakReference) this.f7049b).get()) != null) {
                    ze.d.f47471b = bVar2;
                    if (MessagesController.getInstance(UserConfig.selectedAccount).isWebBrowserUseCustomTabs() && (bVar = ze.d.f47471b) != null) {
                        try {
                            ((c) ((e) bVar.f6001b)).F0();
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
            case 1:
                StringBuilder sb = new StringBuilder("Connected to SessionLifecycleService. Queue size ");
                f fVar = (f) this.f7049b;
                LinkedBlockingDeque linkedBlockingDeque = (LinkedBlockingDeque) fVar.d;
                sb.append(linkedBlockingDeque.size());
                Log.d("SessionLifecycleClient", sb.toString());
                fVar.f43491c = new Messenger(iBinder);
                ArrayList arrayList = new ArrayList();
                linkedBlockingDeque.drainTo(arrayList);
                e0.q(e0.b((h) fVar.f43490b), new k1.c(fVar, arrayList, null, 5));
                return;
            case 2:
                o8.c cVar = (o8.c) this.f7049b;
                cVar.f16451b.b("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
                cVar.a().post(new o8.a(this, iBinder));
                return;
            default:
                u.g("BillingClientTesting", "Billing Override Service connected.");
                y yVar = (y) this.f7049b;
                int i11 = com.google.android.gms.internal.play_billing.f.f3459b;
                if (iBinder != null) {
                    IInterface queryLocalInterface2 = iBinder.queryLocalInterface("com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService");
                    if (queryLocalInterface2 instanceof g) {
                        gVar = (g) queryLocalInterface2;
                    } else {
                        gVar = new a7.a(iBinder, "com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService", 2);
                    }
                }
                yVar.E = gVar;
                yVar.D = 2;
                int i12 = z.f41054a;
                i3 c3 = z.c(26, m3.BROADCAST_ACTION_UNSPECIFIED);
                Objects.requireNonNull(c3, "ApiSuccess should not be null");
                qa qaVar = yVar.h;
                qaVar.getClass();
                try {
                    qaVar.l1(c3, (p3) qaVar.f14687b);
                    return;
                } catch (Throwable th2) {
                    u.i("BillingLogger", "Unable to log.", th2);
                    return;
                }
        }
    }

    @Override
    public final void onServiceDisconnected(ComponentName componentName) {
        switch (this.f7048a) {
            case 0:
                if (((ze.b) ((WeakReference) this.f7049b).get()) != null) {
                    ze.d.f47471b = null;
                    return;
                }
                return;
            case 1:
                Log.d("SessionLifecycleClient", "Disconnected from SessionLifecycleService");
                f fVar = (f) this.f7049b;
                fVar.f43491c = null;
                fVar.getClass();
                return;
            case 2:
                o8.c cVar = (o8.c) this.f7049b;
                cVar.f16451b.b("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
                cVar.a().post(new o8.b(this, 0));
                return;
            default:
                u.h("BillingClientTesting", "Billing Override Service disconnected.");
                y yVar = (y) this.f7049b;
                yVar.E = null;
                yVar.D = 0;
                return;
        }
    }

    public a(Object obj, int i10) {
        this.f7048a = i10;
        this.f7049b = obj;
    }
}
