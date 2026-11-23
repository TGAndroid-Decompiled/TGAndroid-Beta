package ai;

import a8.xa;
import android.graphics.Bitmap;
import android.os.Looper;
import bi.l4;
import di.pb;
import di.y8;
import fi.n5;
import fi.p6;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Map;
import ki.t2;
import org.telegram.messenger.AppStartReceiver;
import org.telegram.messenger.PushListenerController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.bz;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.nt;
import org.telegram.messenger.s2;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.kc;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.Dictation.DictationLid;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.Wallet.k9;
import org.telegram.ui.Wallet.o6;
import org.telegram.ui.ob1;
public final class k implements Runnable {
    public final int f1316a;

    public k(int i7) {
        this.f1316a = i7;
    }

    @Override
    public final void run() {
        kc Y;
        org.telegram.ui.ActionBar.g2 c02;
        int i7 = 0;
        switch (this.f1316a) {
            case 0:
                q[] qVarArr = DictationAsr.f43143a;
                ArrayList arrayList = new ArrayList(DictationAsr.f43148g);
                int size = arrayList.size();
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    ((Runnable) obj).run();
                }
                return;
            case 1:
                DictationAsr.b0(true);
                return;
            case 2:
                DictationLid.b();
                return;
            case 3:
                xa xaVar = bg.i.B;
                if (xaVar != null) {
                    ArrayList arrayList2 = null;
                    for (int i10 = 0; i10 < bg.i.f3217y; i10++) {
                        if (((Bitmap[]) xaVar.d)[i10] != null) {
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            arrayList2.add(((Bitmap[]) xaVar.d)[i10]);
                        }
                        ((Bitmap[]) xaVar.d)[i10] = null;
                        ((bg.e0[]) xaVar.f714c)[i10] = null;
                    }
                    if (!arrayList2.isEmpty()) {
                        Utilities.f22877e.c(new bg.e(0, arrayList2));
                    }
                    bg.i.B = null;
                    return;
                }
                return;
            case 4:
                org.telegram.ui.ActionBar.g2 Q = LaunchActivity.Q();
                if (Q != 0) {
                    ?? obj2 = new Object();
                    obj2.f28948a = true;
                    Q.showAsSheet(new PremiumPreviewFragment(0, "gifts"), obj2);
                    return;
                }
                return;
            case 5:
                fc t6 = l4.h().t(gd.N0(2131749560, null), null);
                t6.f35101t = true;
                t6.j();
                return;
            case 6:
                ks.e().k(99, 512);
                return;
            case 7:
                kc.Y().N(gd.N0(2131745665, null), gd.N0(2131751093, null)).j();
                return;
            case 8:
                org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                if (T != null) {
                    o6 o6Var = new o6();
                    k9 k9Var = o6Var.f44804j0;
                    if (k9Var != null) {
                        k9Var.b(false);
                    }
                    if (!o6Var.f44801g0) {
                        o6Var.I0 = true;
                    } else {
                        o6Var.I0 = false;
                        o6Var.f44800f0 = 1;
                        hi.q1 q1Var = o6Var.f44815s0;
                        if (q1Var != null) {
                            q1Var.setPosition(1);
                        }
                    }
                    T.presentFragment(o6Var);
                    return;
                }
                return;
            case 9:
                org.telegram.ui.ActionBar.g2 T2 = LaunchActivity.T();
                if ((T2 instanceof ob1) && (c02 = ((ob1) T2).c0()) != null) {
                    T2 = c02;
                }
                if (T2 != null) {
                    Y = kc.b0(T2);
                } else {
                    Y = kc.Y();
                }
                fc Q2 = Y.Q(2131624052, 36, gd.N0(2131750199, null));
                Q2.f35101t = true;
                Q2.j();
                return;
            case 10:
                org.telegram.messenger.q2.APP_ERROR.a();
                return;
            case 11:
                org.telegram.ui.ActionBar.g2 T3 = LaunchActivity.T();
                if (T3 != null) {
                    T3.presentFragment(new pb());
                    return;
                }
                return;
            case 12:
                y8[][] y8VarArr = y8.S;
                return;
            case 13:
                return;
            case 14:
                int i11 = n5.f12305r1;
                return;
            case 15:
                Comparator comparator = p6.X;
                return;
            case 16:
                int i12 = hi.n0.f14963y0;
                return;
            case 17:
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
            case 18:
                return;
            case 19:
                mp.g1().edit().putInt("storydualhint", mp.g1().getInt("storydualhint", 0) + 1).apply();
                return;
            case 20:
                return;
            case 21:
                kg.w1[] w1VarArr = kg.w1.f18613g;
                return;
            case 22:
                HashSet hashSet = t2.f19012b1;
                return;
            case 23:
                int i13 = mi.h.I;
                return;
            case 24:
                int i14 = AppStartReceiver.f22705a;
                bz.t();
                if (bz.f23319s.length() > 0) {
                    bz.f23333x = true;
                    bz.y();
                }
                org.telegram.messenger.t0.x();
                return;
            case 25:
                Utilities.f22877e.c(new k(28));
                return;
            case 26:
                boolean z10 = a8.f22949j;
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
            case 27:
                org.telegram.messenger.t0.x();
                return;
            case 28:
                org.telegram.utils.twidget.p1.d(org.telegram.messenger.t0.f27013b);
                return;
            default:
                if (((nt) org.telegram.messenger.t0.l()).hasServices()) {
                    ((nt) org.telegram.messenger.t0.l()).onRequestPushToken();
                    return;
                }
                if (s2.f26829a) {
                    ((nt) org.telegram.messenger.t0.l()).getClass();
                    a8.b("No valid Google Play Services APK found.");
                }
                bz.h = "__NO_GOOGLE_PLAY_SERVICES__";
                ((nt) org.telegram.messenger.t0.l()).getClass();
                PushListenerController.sendRegistrationToServer(2, null);
                return;
        }
    }

    public k(Object obj, int i7) {
        this.f1316a = i7;
    }

    private final void a() {
    }

    private final void b() {
    }

    private final void c() {
    }
}
