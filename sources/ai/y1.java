package ai;

import android.graphics.Bitmap;
import android.os.Looper;
import b8.kg;
import ci.e9;
import ci.wb;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Map;
import org.telegram.messenger.AppStartReceiver;
import org.telegram.messenger.KeepAliveJob;
import org.telegram.messenger.PushListenerController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.az;
import org.telegram.messenger.bd;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.lt;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.ac;
import org.telegram.ui.Components.fc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.gb1;
public final class y1 implements Runnable {
    public final int f1108a;

    public y1(int i3) {
        this.f1108a = i3;
    }

    @Override
    public final void run() {
        fc X;
        org.telegram.ui.ActionBar.d2 c02;
        switch (this.f1108a) {
            case 0:
                org.telegram.ui.ActionBar.d2 Q = LaunchActivity.Q();
                if (Q != 0) {
                    ?? obj = new Object();
                    obj.f27395a = true;
                    Q.showAsSheet(new PremiumPreviewFragment(0, "gifts"), obj);
                    return;
                }
                return;
            case 1:
                fc.X().N(bd.M0(2131745871, null), bd.M0(2131751106, null)).j();
                return;
            case 2:
                kg kgVar = cg.h.B;
                if (kgVar != null) {
                    ArrayList arrayList = null;
                    for (int i3 = 0; i3 < cg.h.f4663y; i3++) {
                        if (((Bitmap[]) kgVar.d)[i3] != null) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(((Bitmap[]) kgVar.d)[i3]);
                        }
                        ((Bitmap[]) kgVar.d)[i3] = null;
                        ((cg.c0[]) kgVar.f2723c)[i3] = null;
                    }
                    if (!arrayList.isEmpty()) {
                        Utilities.f21387e.c(new cg.e(0, arrayList));
                    }
                    cg.h.B = null;
                    return;
                }
                return;
            case 3:
                org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                if ((T instanceof gb1) && (c02 = ((gb1) T).c0()) != null) {
                    T = c02;
                }
                if (T != null) {
                    X = fc.a0(T);
                } else {
                    X = fc.X();
                }
                ac Q2 = X.Q(2131624051, 36, bd.M0(2131750224, null));
                Q2.f31802t = true;
                Q2.j();
                return;
            case 4:
                org.telegram.messenger.p2.APP_ERROR.a();
                return;
            case 5:
                org.telegram.ui.ActionBar.d2 T2 = LaunchActivity.T();
                if (T2 != null) {
                    T2.presentFragment(new wb());
                    return;
                }
                return;
            case 6:
                e9[][] e9VarArr = e9.S;
                return;
            case 7:
                hs.e().k(99, 512);
                return;
            case 8:
                return;
            case 9:
                hs.e().k(175, new Object[0]);
                return;
            case 10:
                ei.n1.b();
                return;
            case 11:
                ei.n1 n1Var = ei.n1.f10647a0;
                n1Var.f10651e.invalidate();
                if (!n1Var.f10651e.isInLayout()) {
                    n1Var.f10651e.requestLayout();
                    n1Var.d.requestLayout();
                    n1Var.f10652f.requestLayout();
                    return;
                }
                return;
            case 12:
                int i10 = ei.w5.f11183o1;
                return;
            case 13:
                Comparator comparator = ei.z6.X;
                return;
            case 14:
                int i11 = gi.e0.f12616y0;
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
                hp.e1().edit().putInt("storydualhint", hp.e1().getInt("storydualhint", 0) + 1).apply();
                return;
            case 18:
                HashSet hashSet = ii.a3.f14789b1;
                return;
            case 19:
                return;
            case 20:
                int i12 = ki.h.I;
                return;
            case 21:
                lg.u1[] u1VarArr = lg.u1.f18483g;
                return;
            case 22:
                int i13 = AppStartReceiver.f21215a;
                az.t();
                if (az.f21661s.length() > 0) {
                    az.f21675x = true;
                    az.y();
                }
                org.telegram.messenger.t0.x();
                return;
            case 23:
                boolean z10 = a8.f21471j;
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
            case 24:
                org.telegram.messenger.t0.x();
                return;
            case 25:
                if (((lt) org.telegram.messenger.t0.l()).hasServices()) {
                    ((lt) org.telegram.messenger.t0.l()).onRequestPushToken();
                    return;
                }
                if (org.telegram.messenger.r2.f25040a) {
                    ((lt) org.telegram.messenger.t0.l()).getClass();
                    a8.b("No valid Google Play Services APK found.");
                }
                az.h = "__NO_GOOGLE_PLAY_SERVICES__";
                ((lt) org.telegram.messenger.t0.l()).getClass();
                PushListenerController.sendRegistrationToServer(2, null);
                return;
            case 26:
                return;
            case 27:
                break;
            case 28:
                hs.e().k(259, new Object[0]);
                return;
            default:
                KeepAliveJob.a();
                return;
        }
        for (int i14 = 0; i14 < 4; i14++) {
            if (h10.i(i14).p()) {
                ConnectionsManager.getInstance(i14).resumeNetworkMaybe();
                Utilities.f21387e.c(new org.telegram.messenger.x4(org.telegram.messenger.g5.r(i14), 4));
            }
        }
    }

    public y1(Object obj, int i3) {
        this.f1108a = i3;
    }

    private final void a() {
    }

    private final void b() {
    }

    private final void c() {
    }

    private final void e() {
    }
}
