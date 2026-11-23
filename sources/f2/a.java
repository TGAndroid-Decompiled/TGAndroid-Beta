package f2;

import a8.ka;
import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import b3.u;
import c8.od;
import fi.a1;
import fi.a5;
import fi.a8;
import fi.b1;
import fi.c1;
import fi.c3;
import fi.d1;
import fi.d7;
import fi.e1;
import fi.e9;
import fi.f9;
import fi.h8;
import fi.j8;
import fi.m5;
import fi.m7;
import fi.o5;
import fi.o8;
import fi.o9;
import fi.p6;
import fi.s3;
import fi.t6;
import fi.t8;
import fi.w4;
import fi.w8;
import fi.x2;
import fi.z3;
import fi.z5;
import h2.j0;
import h2.l0;
import h2.v;
import hi.b8;
import hi.l3;
import java.util.ArrayList;
import java.util.Locale;
import n2.o0;
import org.telegram.messenger.g0;
import org.telegram.messenger.ls;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.fq0;
import org.telegram.ui.Components.ui;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.cx;
import org.telegram.ui.tv;
public final class a implements Runnable {
    public final int f11015a;
    public final Object f11016b;

    public a(Object obj, int i7) {
        this.f11015a = i7;
        this.f11016b = obj;
    }

    @Override
    public final void run() {
        wi.n nVar;
        LaunchActivity launchActivity;
        String str;
        int i7;
        String d;
        TelephonyManager telephonyManager;
        boolean z10 = false;
        switch (this.f11015a) {
            case 0:
                b bVar = (b) this.f11016b;
                if (bVar.f11019c.f987a) {
                    bVar.f11017a.f19594a.C1(3, false);
                    return;
                }
                return;
            case 1:
                cx cxVar = ((tv) this.f11016b).P0;
                if (cxVar.M && cxVar.k4().I()) {
                    cxVar.F0.h();
                    return;
                } else {
                    cxVar.R4(true, true);
                    return;
                }
            case 2:
                ((a1) this.f11016b).f11710a.t(false);
                return;
            case 3:
                c1 c1Var = ((b1) this.f11016b).f11756a;
                ls.f(c1Var.f11788e).k(176, Long.valueOf(c1Var.g()));
                return;
            case 4:
                e1 e1Var = (e1) this.f11016b;
                f9 f9Var = e1Var.f11866c;
                if (f9Var != null && e1Var.G() && (nVar = e1Var.f11864a) != null && nVar.f59999c == 0 && (launchActivity = LaunchActivity.H1) != null && od.a(launchActivity)) {
                    f9Var.T();
                    return;
                }
                return;
            case 5:
                wi.n nVar2 = ((d1) this.f11016b).f11834e.f11864a;
                if (nVar2 != null) {
                    nVar2.c();
                    return;
                }
                return;
            case 6:
                ((x2) this.f11016b).f12714a.O0();
                return;
            case 7:
                z3 z3Var = ((c3) this.f11016b).f11803y;
                s3 s3Var = z3Var.A1;
                if (s3Var != null) {
                    if (!z3Var.D1 && !z3Var.E1 && !z3Var.F1) {
                        f9 f9Var2 = ((w8) s3Var).d;
                        if (!f9Var2.f11978o0.getCurrentPeerView().b1(true) && !f9Var2.f11978o0.E(true)) {
                            f9Var2.u(true);
                            return;
                        }
                        return;
                    } else if (z3Var.f12888y1.f12718e) {
                        ((e9) z3Var.f12881w2.f12767c).loopBack();
                        return;
                    } else {
                        z3Var.G0 = 0L;
                        return;
                    }
                }
                return;
            case 8:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) this.f11016b;
                int i10 = ProfileStoriesView.f43807t0;
                profileStoriesView.getClass();
                g0.a4(profileStoriesView);
                return;
            case 9:
                a5.a(((w4) this.f11016b).d);
                return;
            case 10:
                m5 m5Var = (m5) this.f11016b;
                if (m5Var.isShowing()) {
                    m5Var.K0(true);
                    return;
                }
                return;
            case 11:
                hi.a1 a1Var = (hi.a1) this.f11016b;
                a1Var.c(a1Var.f14171b);
                a1Var.f14172c = false;
                return;
            case 12:
                ((b8) this.f11016b).run();
                return;
            case 13:
                t6 t6Var = (t6) this.f11016b;
                t6Var.c();
                t6Var.a(true);
                return;
            case 14:
                ((o5) this.f11016b).a(null);
                return;
            case 15:
                ((d7) this.f11016b).R();
                return;
            case 16:
                m7 m7Var = (m7) this.f11016b;
                ArrayList arrayList = m7Var.f12271c;
                if (arrayList != null) {
                    m7Var.f12269a.f12832j1 = arrayList;
                }
                z3 z3Var2 = m7Var.f12269a;
                long j3 = m7Var.f12270b;
                if (z3Var2.l1 != j3 || z3Var2.f12832j1 != null) {
                    z3Var2.l1 = j3;
                    z3Var2.h1();
                    z3Var2.g1();
                    z3Var2.d1(true);
                    TL_stories.PeerStories peerStories = z3Var2.f12867t0.Q0;
                    if (peerStories != null) {
                        z3Var2.C1.V(peerStories, true);
                        return;
                    }
                    p6 p6Var = z3Var2.C1;
                    TL_stories.PeerStories y10 = p6Var.y(j3);
                    if (y10 == null) {
                        y10 = p6Var.z(j3);
                        z10 = true;
                    }
                    p6Var.V(y10, z10);
                    return;
                }
                return;
            case 17:
                ((o0) this.f11016b).f(true);
                return;
            case 18:
                ((a8) this.f11016b).requestLayout();
                return;
            case 19:
                j8 j8Var = (j8) this.f11016b;
                l3 l3Var = j8Var.f12156c;
                if (l3Var != null) {
                    l3Var.f(true);
                    j8Var.f12156c = null;
                }
                j8Var.b(false);
                return;
            case 20:
                h8 h8Var = (h8) this.f11016b;
                if (h8Var.f12067w) {
                    h8Var.F = true;
                    h8Var.G = System.currentTimeMillis();
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    h8Var.f12062e = new LinearGradient(0.0f, 0.0f, 40.0f, 0.0f, new int[]{16777215, 771751935, 771751935, 16777215}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, tileMode);
                    h8Var.f12063f = new LinearGradient(0.0f, 0.0f, 40.0f, 0.0f, new int[]{16777215, 553648127, 553648127, 16777215}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, tileMode);
                    h8Var.invalidate();
                    return;
                }
                return;
            case 21:
                f9 f9Var3 = ((o8) this.f11016b).f12340b;
                try {
                    t8 t8Var = f9Var3.f11987s;
                    if (t8Var != null) {
                        if (f9Var3.f11950b) {
                            g0.E2(t8Var);
                        } else {
                            f9Var3.f11976n.removeView(t8Var);
                        }
                        f9Var3.f11987s = null;
                        f9Var3.v();
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 22:
                ((t8) this.f11016b).f12599s0.Q(true);
                return;
            case 23:
                ((o9) this.f11016b).c();
                return;
            case 24:
                ((ui) this.f11016b).hide();
                return;
            case 25:
                gi.m mVar = (gi.m) this.f11016b;
                fq0 fq0Var = mVar.f13644a0;
                z5 z5Var = mVar.f13643a;
                if (z5Var == null) {
                    str = "";
                } else {
                    str = z5Var.E;
                }
                fq0Var.a(str);
                return;
            case 26:
                ((j0) this.f11016b).getClass();
                return;
            case 27:
                v vVar = (v) this.f11016b;
                b3.f fVar = (b3.f) vVar.f13817a.get();
                if (fVar != null) {
                    int b10 = vVar.f13819c.b();
                    b3.g gVar = fVar.f2846a;
                    synchronized (gVar) {
                        synchronized (gVar) {
                            int i11 = gVar.f2864n;
                            if (i11 == 0 || gVar.f2856e) {
                                if (i11 != b10 || gVar.f2865o == null) {
                                    gVar.f2864n = b10;
                                    if (b10 != 1 && b10 != 0 && b10 != 8) {
                                        if (gVar.f2865o == null) {
                                            Context context = gVar.f2853a;
                                            String str2 = l0.f13778a;
                                            if (context != null && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
                                                String networkCountryIso = telephonyManager.getNetworkCountryIso();
                                                if (!TextUtils.isEmpty(networkCountryIso)) {
                                                    d = ka.d(networkCountryIso);
                                                    gVar.f2865o = d;
                                                }
                                            }
                                            d = ka.d(Locale.getDefault().getCountry());
                                            gVar.f2865o = d;
                                        }
                                        gVar.f2862l = gVar.b(b10);
                                        gVar.d.getClass();
                                        long elapsedRealtime = SystemClock.elapsedRealtime();
                                        if (gVar.f2858g > 0) {
                                            i7 = (int) (elapsedRealtime - gVar.h);
                                        } else {
                                            i7 = 0;
                                        }
                                        gVar.d(gVar.f2859i, i7, gVar.f2862l);
                                        gVar.h = elapsedRealtime;
                                        gVar.f2859i = 0L;
                                        gVar.f2861k = 0L;
                                        gVar.f2860j = 0L;
                                        u uVar = gVar.f2857f;
                                        uVar.f2896a.clear();
                                        uVar.f2898c = -1;
                                        uVar.d = 0;
                                        uVar.f2899e = 0;
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                    }
                }
                return;
            case 28:
                ((hi.h) this.f11016b).f14662c.f14963a0 = false;
                return;
            default:
                ((hi.l) this.f11016b).invalidateSelf();
                return;
        }
    }
}
