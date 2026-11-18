package ai;

import a8.xa;
import android.graphics.Bitmap;
import android.os.Looper;
import bi.e4;
import di.pb;
import di.x8;
import fi.m5;
import fi.p6;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Map;
import org.telegram.messenger.AppStartReceiver;
import org.telegram.messenger.PushListenerController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.bz;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.nt;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.Dictation.DictationLid;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.Wallet.j9;
import org.telegram.ui.Wallet.n6;
import org.telegram.ui.qb1;
public final class o implements Runnable {
    public final int f1394a;

    public o(int i7) {
        this.f1394a = i7;
    }

    @Override
    public final void run() {
        lc Y;
        org.telegram.ui.ActionBar.h2 c02;
        int i7 = 0;
        switch (this.f1394a) {
            case 0:
                t[] tVarArr = DictationAsr.f43023a;
                ArrayList arrayList = new ArrayList(DictationAsr.f43028g);
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
                    for (int i10 = 0; i10 < bg.i.f3247y; i10++) {
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
                        Utilities.f22779e.c(new bg.e(0, arrayList2));
                    }
                    bg.i.B = null;
                    return;
                }
                return;
            case 4:
                org.telegram.ui.ActionBar.h2 Q = LaunchActivity.Q();
                if (Q != 0) {
                    ?? obj2 = new Object();
                    obj2.f28921a = true;
                    Q.showAsSheet(new PremiumPreviewFragment(0, "gifts"), obj2);
                    return;
                }
                return;
            case 5:
                gc t6 = e4.h().t(gd.M0(2131749561, null), null);
                t6.f35471t = true;
                t6.j();
                return;
            case 6:
                ks.e().k(99, 512);
                return;
            case 7:
                lc.Y().N(gd.M0(2131745666, null), gd.M0(2131751094, null)).j();
                return;
            case 8:
                org.telegram.ui.ActionBar.h2 T = LaunchActivity.T();
                if (T != null) {
                    n6 n6Var = new n6();
                    j9 j9Var = n6Var.f44632j0;
                    if (j9Var != null) {
                        j9Var.b(false);
                    }
                    if (!n6Var.f44629g0) {
                        n6Var.I0 = true;
                    } else {
                        n6Var.I0 = false;
                        n6Var.f44628f0 = 1;
                        hi.i1 i1Var = n6Var.f44643s0;
                        if (i1Var != null) {
                            i1Var.setPosition(1);
                        }
                    }
                    T.presentFragment(n6Var);
                    return;
                }
                return;
            case 9:
                org.telegram.ui.ActionBar.h2 T2 = LaunchActivity.T();
                if ((T2 instanceof qb1) && (c02 = ((qb1) T2).c0()) != null) {
                    T2 = c02;
                }
                if (T2 != null) {
                    Y = lc.b0(T2);
                } else {
                    Y = lc.Y();
                }
                gc Q2 = Y.Q(2131624052, 36, gd.M0(2131750200, null));
                Q2.f35471t = true;
                Q2.j();
                return;
            case 10:
                org.telegram.messenger.q2.APP_ERROR.a();
                return;
            case 11:
                org.telegram.ui.ActionBar.h2 T3 = LaunchActivity.T();
                if (T3 != null) {
                    T3.presentFragment(new pb());
                    return;
                }
                return;
            case 12:
                x8[][] x8VarArr = x8.S;
                return;
            case 13:
                return;
            case 14:
                int i11 = m5.f12267r1;
                return;
            case 15:
                Comparator comparator = p6.X;
                return;
            case 16:
                int i12 = hi.f0.f14606y0;
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
                kg.w1[] w1VarArr = kg.w1.f18518g;
                return;
            case 22:
                HashSet hashSet = ki.t2.f18914b1;
                return;
            case 23:
                int i13 = mi.h.I;
                return;
            case 24:
                int i14 = AppStartReceiver.f22607a;
                bz.t();
                if (bz.f23194s.length() > 0) {
                    bz.f23208x = true;
                    bz.y();
                }
                org.telegram.messenger.t0.x();
                return;
            case 25:
                Utilities.f22779e.c(new o(28));
                return;
            case 26:
                boolean z10 = a8.f22838j;
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
                org.telegram.utils.twidget.p1.d(org.telegram.messenger.t0.f26913b);
                return;
            default:
                if (((nt) org.telegram.messenger.t0.l()).hasServices()) {
                    ((nt) org.telegram.messenger.t0.l()).onRequestPushToken();
                    return;
                }
                if (org.telegram.messenger.s2.f26721a) {
                    ((nt) org.telegram.messenger.t0.l()).getClass();
                    a8.b("No valid Google Play Services APK found.");
                }
                bz.h = "__NO_GOOGLE_PLAY_SERVICES__";
                ((nt) org.telegram.messenger.t0.l()).getClass();
                PushListenerController.sendRegistrationToServer(2, null);
                return;
        }
    }

    public o(Object obj, int i7) {
        this.f1394a = i7;
    }

    private final void a() {
    }

    private final void b() {
    }

    private final void c() {
    }
}
