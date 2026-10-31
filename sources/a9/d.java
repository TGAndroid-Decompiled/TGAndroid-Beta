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
import org.telegram.messenger.d20;
import org.telegram.messenger.f8;
import org.telegram.messenger.vp;
public final class d implements ServiceConnection {
    public final int f321a;
    public Object f322b;

    public d() {
        this.f321a = 3;
    }

    @Override
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        m4.c cVar;
        com.google.android.gms.internal.play_billing.g gVar = null;
        pf.e eVar = null;
        switch (this.f321a) {
            case 0:
                e eVar2 = (e) this.f322b;
                eVar2.f326b.b("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
                eVar2.a().post(new b(this, iBinder));
                return;
            case 1:
                StringBuilder sb2 = new StringBuilder("Connected to SessionLifecycleService. Queue size ");
                ji.f fVar = (ji.f) this.f322b;
                LinkedBlockingDeque linkedBlockingDeque = (LinkedBlockingDeque) fVar.d;
                sb2.append(linkedBlockingDeque.size());
                Log.d("SessionLifecycleClient", sb2.toString());
                fVar.f10442c = new Messenger(iBinder);
                ArrayList arrayList = new ArrayList();
                linkedBlockingDeque.drainTo(arrayList);
                td.e0.q(td.e0.b((cd.h) fVar.f10441b), new bb.l(fVar, arrayList, null, 2));
                return;
            case 2:
                com.google.android.gms.internal.play_billing.u.g("BillingClientTesting", "Billing Override Service connected.");
                c5.z zVar = (c5.z) this.f322b;
                int i10 = com.google.android.gms.internal.play_billing.f.f5095b;
                if (iBinder != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService");
                    if (queryLocalInterface instanceof com.google.android.gms.internal.play_billing.g) {
                        gVar = (com.google.android.gms.internal.play_billing.g) queryLocalInterface;
                    } else {
                        gVar = new a(iBinder, "com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService", 2);
                    }
                }
                zVar.E = gVar;
                zVar.D = 2;
                int i11 = c5.a0.f3733a;
                i3 c10 = c5.a0.c(26, m3.BROADCAST_ACTION_UNSPECIFIED);
                Objects.requireNonNull(c10, "ApiSuccess should not be null");
                hf.b bVar = zVar.h;
                bVar.getClass();
                try {
                    bVar.B0(c10, (p3) bVar.f7657b);
                    return;
                } catch (Throwable th2) {
                    com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
                    return;
                }
            default:
                int i12 = pf.d.f44917a;
                if (iBinder != null) {
                    IInterface queryLocalInterface2 = iBinder.queryLocalInterface("android.support.customtabs.ICustomTabsService");
                    if (queryLocalInterface2 != null && (queryLocalInterface2 instanceof pf.e)) {
                        eVar = (pf.e) queryLocalInterface2;
                    } else {
                        ?? obj = new Object();
                        obj.f44916a = iBinder;
                        eVar = obj;
                    }
                }
                m4.c cVar2 = new m4.c(eVar, componentName, false, 21);
                if (((gf.d) ((WeakReference) this.f322b).get()) != null) {
                    gf.f.f7488b = cVar2;
                    if (vp.r1(d20.f15147s0).M2() && (cVar = gf.f.f7488b) != null) {
                        try {
                            ((pf.c) ((pf.e) cVar.f12705b)).I0();
                            return;
                        } catch (RemoteException unused) {
                            return;
                        } catch (Exception e) {
                            f8.g(e, true);
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
        switch (this.f321a) {
            case 0:
                e eVar = (e) this.f322b;
                eVar.f326b.b("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
                eVar.a().post(new c(this, 0));
                return;
            case 1:
                Log.d("SessionLifecycleClient", "Disconnected from SessionLifecycleService");
                ji.f fVar = (ji.f) this.f322b;
                fVar.f10442c = null;
                fVar.getClass();
                return;
            case 2:
                com.google.android.gms.internal.play_billing.u.h("BillingClientTesting", "Billing Override Service disconnected.");
                c5.z zVar = (c5.z) this.f322b;
                zVar.E = null;
                zVar.D = 0;
                return;
            default:
                if (((gf.d) ((WeakReference) this.f322b).get()) != null) {
                    gf.f.f7488b = null;
                    return;
                }
                return;
        }
    }

    public d(Object obj, int i10) {
        this.f321a = i10;
        this.f322b = obj;
    }
}
