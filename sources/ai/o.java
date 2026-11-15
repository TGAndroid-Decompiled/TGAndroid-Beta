package ai;

import a8.xa;
import android.graphics.Bitmap;
import android.os.Looper;
import di.mb;
import di.v8;
import fi.o5;
import fi.s6;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Map;
import ki.x2;
import org.telegram.messenger.AppStartReceiver;
import org.telegram.messenger.PushListenerController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.g5;
import org.telegram.messenger.gz;
import org.telegram.messenger.hd;
import org.telegram.messenger.k4;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.qt;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.xb;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.Dictation.DictationLid;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.mb1;
public final class o implements Runnable {
    public final int f1418a;

    public o(int i7) {
        this.f1418a = i7;
    }

    @Override
    public final void run() {
        cc X;
        org.telegram.ui.ActionBar.e2 c02;
        int i7 = 0;
        switch (this.f1418a) {
            case 0:
                s[] sVarArr = DictationAsr.f42579a;
                ArrayList arrayList = new ArrayList(DictationAsr.f42584g);
                int size = arrayList.size();
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    ((Runnable) obj).run();
                }
                return;
            case 1:
                DictationAsr.T(true);
                return;
            case 2:
                DictationLid.b();
                return;
            case 3:
                xa xaVar = bg.i.B;
                if (xaVar != null) {
                    ArrayList arrayList2 = null;
                    for (int i10 = 0; i10 < bg.i.f3253y; i10++) {
                        if (((Bitmap[]) xaVar.d)[i10] != null) {
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            arrayList2.add(((Bitmap[]) xaVar.d)[i10]);
                        }
                        ((Bitmap[]) xaVar.d)[i10] = null;
                        ((bg.d0[]) xaVar.f714c)[i10] = null;
                    }
                    if (!arrayList2.isEmpty()) {
                        Utilities.f22416e.c(new bg.e(0, arrayList2));
                    }
                    bg.i.B = null;
                    return;
                }
                return;
            case 4:
                org.telegram.ui.ActionBar.e2 Q = LaunchActivity.Q();
                if (Q != 0) {
                    ?? obj2 = new Object();
                    obj2.f28476a = true;
                    Q.showAsSheet(new PremiumPreviewFragment(0, "gifts"), obj2);
                    return;
                }
                return;
            case 5:
                ns.e().k(99, 512);
                return;
            case 6:
                cc.X().N(hd.M0(2131745861, null), hd.M0(2131751105, null)).j();
                return;
            case 7:
                org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
                if ((T instanceof mb1) && (c02 = ((mb1) T).c0()) != null) {
                    T = c02;
                }
                if (T != null) {
                    X = cc.a0(T);
                } else {
                    X = cc.X();
                }
                xb Q2 = X.Q(2131624052, 36, hd.M0(2131750216, null));
                Q2.f41653t = true;
                Q2.j();
                return;
            case 8:
                org.telegram.messenger.p2.APP_ERROR.a();
                return;
            case 9:
                org.telegram.ui.ActionBar.e2 T2 = LaunchActivity.T();
                if (T2 != null) {
                    T2.presentFragment(new mb());
                    return;
                }
                return;
            case 10:
                v8[][] v8VarArr = v8.S;
                return;
            case 11:
                return;
            case 12:
                int i11 = o5.f12118r1;
                return;
            case 13:
                Comparator comparator = s6.X;
                return;
            case 14:
                int i12 = hi.e0.f14191y0;
                return;
            case 15:
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
            case 16:
                return;
            case 17:
                np.e1().edit().putInt("storydualhint", np.e1().getInt("storydualhint", 0) + 1).apply();
                return;
            case 18:
                return;
            case 19:
                kg.v1[] v1VarArr = kg.v1.f18122g;
                return;
            case 20:
                HashSet hashSet = x2.f18648b1;
                return;
            case 21:
                int i13 = mi.h.I;
                return;
            case 22:
                int i14 = AppStartReceiver.f22244a;
                gz.t();
                if (gz.f23978s.length() > 0) {
                    gz.f23992x = true;
                    gz.y();
                }
                org.telegram.messenger.t0.x();
                return;
            case 23:
                Utilities.f22416e.c(new o(26));
                return;
            case 24:
                boolean z10 = a8.f22472j;
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
            case 25:
                org.telegram.messenger.t0.x();
                return;
            case 26:
                org.telegram.utils.twidget.l1.c(org.telegram.messenger.t0.f26600b);
                return;
            case 27:
                if (((qt) org.telegram.messenger.t0.l()).hasServices()) {
                    ((qt) org.telegram.messenger.t0.l()).onRequestPushToken();
                    return;
                }
                if (org.telegram.messenger.r2.f26198a) {
                    ((qt) org.telegram.messenger.t0.l()).getClass();
                    a8.b("No valid Google Play Services APK found.");
                }
                gz.h = "__NO_GOOGLE_PLAY_SERVICES__";
                ((qt) org.telegram.messenger.t0.l()).getClass();
                PushListenerController.sendRegistrationToServer(2, null);
                return;
            case 28:
                return;
        }
        while (i7 < 4) {
            if (m10.i(i7).p()) {
                ConnectionsManager.getInstance(i7).resumeNetworkMaybe();
                Utilities.f22416e.c(new k4(g5.r(i7), 3));
            }
            i7++;
        }
    }

    public o(Object obj, int i7) {
        this.f1418a = i7;
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
