package ai;

import a8.wa;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.BatteryManager;
import android.os.Looper;
import android.os.SystemClock;
import bi.dd;
import bi.ea;
import di.x5;
import di.z6;
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
import org.telegram.ui.Components.bc;
import org.telegram.ui.Components.gc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.rb1;
public final class m0 implements Runnable {
    public final int f1578a;

    public m0(int i7) {
        this.f1578a = i7;
    }

    @Override
    public final void run() {
        gc X;
        f2 c02;
        switch (this.f1578a) {
            case 0:
                gc.X().N(id.M0(2131745861, null), id.M0(2131751105, null)).j();
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
                        Utilities.f21341e.c(new bg.e(0, arrayList));
                    }
                    bg.i.B = null;
                    return;
                }
                return;
            case 2:
                f2 T = LaunchActivity.T();
                if ((T instanceof rb1) && (c02 = ((rb1) T).c0()) != null) {
                    T = c02;
                }
                if (T != null) {
                    X = gc.a0(T);
                } else {
                    X = gc.X();
                }
                bc Q = X.Q(2131624051, 36, id.M0(2131750216, null));
                Q.f32213t = true;
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
                int i10 = x5.f9934q1;
                return;
            case 9:
                Comparator comparator = z6.X;
                return;
            case 10:
                int i11 = fi.e0.f11825x0;
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
                HashSet hashSet = a3.f14509a1;
                return;
            case 15:
                return;
            case 16:
                int i12 = ji.h.H;
                return;
            case 17:
                t1[] t1VarArr = t1.f17549g;
                return;
            case 18:
                int i13 = AppStartReceiver.f21170a;
                iz.t();
                if (iz.f23438s.length() > 0) {
                    iz.f23452x = true;
                    iz.y();
                }
                org.telegram.messenger.t0.x();
                return;
            case 19:
                Utilities.f21341e.c(new m0(22));
                return;
            case 20:
                boolean z9 = a8.f21400j;
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
                org.telegram.utils.twidget.i1.c(org.telegram.messenger.t0.f25570b);
                return;
            case 23:
                if (((tt) org.telegram.messenger.t0.l()).hasServices()) {
                    ((tt) org.telegram.messenger.t0.l()).onRequestPushToken();
                    return;
                }
                if (r2.f25216a) {
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
                if (!KeepAliveJob.f21244b && KeepAliveJob.f21243a == null) {
                    try {
                        if (r2.f25216a) {
                            a8.b("starting keep-alive job");
                        }
                        synchronized (KeepAliveJob.f21245c) {
                            KeepAliveJob.f21244b = true;
                        }
                        JobIntentService.enqueueWork(org.telegram.messenger.t0.f25570b, KeepAliveJob.class, 1000, new Intent());
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            default:
                int i14 = -1;
                try {
                    BatteryManager batteryManager = (BatteryManager) org.telegram.messenger.t0.f25570b.getSystemService("batterymanager");
                    if (batteryManager != null) {
                        i14 = batteryManager.getIntProperty(4);
                    }
                } catch (Throwable th2) {
                    a8.g(th2, true);
                }
                sc.f25456l = SystemClock.elapsedRealtime();
                sc.f25457m = false;
                if (i14 >= 0 && i14 <= 100) {
                    sc.f25456l = SystemClock.elapsedRealtime();
                    if (sc.f25455k != i14) {
                        sc.f25455k = i14;
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
                Utilities.f21341e.c(new k4(g5.r(i15), 3));
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
