package ai;

import a8.wa;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.BatteryManager;
import android.os.Looper;
import android.os.SystemClock;
import bi.dd;
import bi.ea;
import di.w5;
import di.y6;
import hi.a3;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Map;
import kg.t1;
import org.telegram.messenger.AppStartReceiver;
import org.telegram.messenger.KeepAliveJob;
import org.telegram.messenger.PushListenerController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.g5;
import org.telegram.messenger.id;
import org.telegram.messenger.iz;
import org.telegram.messenger.k4;
import org.telegram.messenger.p10;
import org.telegram.messenger.p2;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.r2;
import org.telegram.messenger.rc;
import org.telegram.messenger.sc;
import org.telegram.messenger.support.JobIntentService;
import org.telegram.messenger.tt;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.hc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ob1;
public final class m0 implements Runnable {
    public final int f1578a;

    public m0(int i7) {
        this.f1578a = i7;
    }

    @Override
    public final void run() {
        hc X;
        f2 c02;
        ActivityManager activityManager;
        switch (this.f1578a) {
            case 0:
                hc.X().N(id.M0(2131745864, null), id.M0(2131751106, null)).j();
                return;
            case 1:
                wa waVar = bg.i.B;
                if (waVar != null) {
                    ArrayList arrayList = null;
                    for (int i7 = 0; i7 < bg.i.f3298y; i7++) {
                        if (((Bitmap[]) waVar.d)[i7] != null) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(((Bitmap[]) waVar.d)[i7]);
                        }
                        ((Bitmap[]) waVar.d)[i7] = null;
                        ((bg.d0[]) waVar.f701c)[i7] = null;
                    }
                    if (!arrayList.isEmpty()) {
                        Utilities.f21336e.c(new bg.e(0, arrayList));
                    }
                    bg.i.B = null;
                    return;
                }
                return;
            case 2:
                f2 T = LaunchActivity.T();
                if ((T instanceof ob1) && (c02 = ((ob1) T).c0()) != null) {
                    T = c02;
                }
                if (T != null) {
                    X = hc.a0(T);
                } else {
                    X = hc.X();
                }
                cc Q = X.Q(2131624051, 36, id.M0(2131750217, null));
                Q.f32555t = true;
                Q.j();
                return;
            case 3:
                p2.APP_ERROR.a();
                return;
            case 4:
                f2 T2 = LaunchActivity.T();
                if (T2 != null) {
                    T2.presentFragment(new dd());
                    return;
                }
                return;
            case 5:
                ea[][] eaVarArr = ea.S;
                return;
            case 6:
                qs.e().k(99, 512);
                return;
            case 7:
                return;
            case 8:
                int i10 = w5.n1;
                return;
            case 9:
                Comparator comparator = y6.X;
                return;
            case 10:
                int i11 = fi.e0.f11821x0;
                return;
            case 11:
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
            case 12:
                return;
            case 13:
                qp.e1().edit().putInt("storydualhint", qp.e1().getInt("storydualhint", 0) + 1).apply();
                return;
            case 14:
                HashSet hashSet = a3.f14507a1;
                return;
            case 15:
                return;
            case 16:
                int i12 = ji.h.H;
                return;
            case 17:
                t1[] t1VarArr = t1.f17546g;
                return;
            case 18:
                int i13 = AppStartReceiver.f21165a;
                iz.t();
                if (iz.f23434s.length() > 0) {
                    iz.f23448x = true;
                    iz.y();
                }
                org.telegram.messenger.t0.x();
                return;
            case 19:
                Utilities.f21336e.c(new m0(22));
                return;
            case 20:
                boolean z9 = a8.f21395j;
                StringBuilder sb2 = new StringBuilder();
                for (Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
                    StackTraceElement[] value = entry.getValue();
                    sb2.append("Thread: ");
                    sb2.append(entry.getKey().getName());
                    sb2.append("\n");
                    for (StackTraceElement stackTraceElement : value) {
                        sb2.append("\tat ");
                        sb2.append(stackTraceElement);
                        sb2.append("\n");
                    }
                    sb2.append("\n\n");
                }
                a8.d("ANR thread dump\n" + sb2.toString());
                a8.j();
                a8.c(false);
                return;
            case 21:
                org.telegram.messenger.t0.x();
                return;
            case 22:
                Context context = org.telegram.messenger.t0.f25566b;
                if (!org.telegram.utils.twidget.h1.a() && (activityManager = (ActivityManager) context.getSystemService("activity")) != null && !activityManager.isLowRamDevice()) {
                    try {
                        org.telegram.utils.twidget.r0.f52954i.h(context);
                        return;
                    } catch (Exception e10) {
                        a8.g(e10, true);
                        return;
                    }
                }
                return;
            case 23:
                if (((tt) org.telegram.messenger.t0.l()).hasServices()) {
                    ((tt) org.telegram.messenger.t0.l()).onRequestPushToken();
                    return;
                }
                if (r2.f25212a) {
                    ((tt) org.telegram.messenger.t0.l()).getClass();
                    a8.b("No valid Google Play Services APK found.");
                }
                iz.h = "__NO_GOOGLE_PLAY_SERVICES__";
                ((tt) org.telegram.messenger.t0.l()).getClass();
                PushListenerController.sendRegistrationToServer(2, null);
                return;
            case 24:
                return;
            case 25:
                break;
            case 26:
                qs.e().k(259, new Object[0]);
                return;
            case 27:
                KeepAliveJob.a();
                return;
            case 28:
                if (!KeepAliveJob.f21239b && KeepAliveJob.f21238a == null) {
                    try {
                        if (r2.f25212a) {
                            a8.b("starting keep-alive job");
                        }
                        synchronized (KeepAliveJob.f21240c) {
                            KeepAliveJob.f21239b = true;
                        }
                        JobIntentService.enqueueWork(org.telegram.messenger.t0.f25566b, KeepAliveJob.class, 1000, new Intent());
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            default:
                int i14 = -1;
                try {
                    BatteryManager batteryManager = (BatteryManager) org.telegram.messenger.t0.f25566b.getSystemService("batterymanager");
                    if (batteryManager != null) {
                        i14 = batteryManager.getIntProperty(4);
                    }
                } catch (Throwable th2) {
                    a8.g(th2, true);
                }
                sc.f25452l = SystemClock.elapsedRealtime();
                sc.f25453m = false;
                if (i14 >= 0 && i14 <= 100) {
                    sc.f25452l = SystemClock.elapsedRealtime();
                    if (sc.f25451k != i14) {
                        sc.f25451k = i14;
                        org.telegram.messenger.g0.h3(new rc(0));
                        return;
                    }
                    return;
                }
                return;
        }
        for (int i15 = 0; i15 < 4; i15++) {
            if (p10.i(i15).p()) {
                ConnectionsManager.getInstance(i15).resumeNetworkMaybe();
                Utilities.f21336e.c(new k4(g5.r(i15), 3));
            }
        }
    }

    public m0(Object obj, int i7) {
        this.f1578a = i7;
    }

    private final void a() {
    }

    private final void b() {
    }

    private final void c() {
    }

    private final void d() {
    }
}
