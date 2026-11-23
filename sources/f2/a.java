package f2;

import a8.ja;
import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import b3.u;
import c8.nd;
import fi.a1;
import fi.a6;
import fi.b1;
import fi.b5;
import fi.c1;
import fi.c3;
import fi.d1;
import fi.d7;
import fi.e1;
import fi.e9;
import fi.f9;
import fi.h8;
import fi.j8;
import fi.m7;
import fi.n5;
import fi.o8;
import fi.o9;
import fi.p5;
import fi.p6;
import fi.s3;
import fi.t6;
import fi.t8;
import fi.w8;
import fi.x2;
import fi.x4;
import fi.z3;
import h2.j0;
import h2.l0;
import h2.v;
import hi.a8;
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
    public final int f11052a;
    public final Object f11053b;

    public a(Object obj, int i7) {
        this.f11052a = i7;
        this.f11053b = obj;
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
        switch (this.f11052a) {
            case 0:
                ab.q qVar = (ab.q) this.f11053b;
                ((Context) qVar.f988b).unregisterReceiver((b) qVar.f989c);
                return;
            case 1:
                b bVar = (b) this.f11053b;
                if (bVar.f11056c.f987a) {
                    bVar.f11054a.f19628a.C1(3, false);
                    return;
                }
                return;
            case 2:
                cx cxVar = ((tv) this.f11053b).P0;
                if (cxVar.M && cxVar.k4().I()) {
                    cxVar.F0.h();
                    return;
                } else {
                    cxVar.R4(true, true);
                    return;
                }
            case 3:
                ((a1) this.f11053b).f11747a.t(false);
                return;
            case 4:
                c1 c1Var = ((b1) this.f11053b).f11794a;
                ls.f(c1Var.f11839e).k(176, Long.valueOf(c1Var.g()));
                return;
            case 5:
                e1 e1Var = (e1) this.f11053b;
                f9 f9Var = e1Var.f11915c;
                if (f9Var != null && e1Var.G() && (nVar = e1Var.f11913a) != null && nVar.f60034c == 0 && (launchActivity = LaunchActivity.H1) != null && nd.a(launchActivity)) {
                    f9Var.T();
                    return;
                }
                return;
            case 6:
                wi.n nVar2 = ((d1) this.f11053b).f11882e.f11913a;
                if (nVar2 != null) {
                    nVar2.c();
                    return;
                }
                return;
            case 7:
                ((x2) this.f11053b).f12764a.O0();
                return;
            case 8:
                z3 z3Var = ((c3) this.f11053b).f11854y;
                s3 s3Var = z3Var.A1;
                if (s3Var != null) {
                    if (!z3Var.D1 && !z3Var.E1 && !z3Var.F1) {
                        f9 f9Var2 = ((w8) s3Var).d;
                        if (!f9Var2.f12027o0.getCurrentPeerView().b1(true) && !f9Var2.f12027o0.E(true)) {
                            f9Var2.u(true);
                            return;
                        }
                        return;
                    } else if (z3Var.f12937y1.f12768e) {
                        ((e9) z3Var.f12930w2.f12815c).loopBack();
                        return;
                    } else {
                        z3Var.G0 = 0L;
                        return;
                    }
                }
                return;
            case 9:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) this.f11053b;
                int i10 = ProfileStoriesView.f43842t0;
                profileStoriesView.getClass();
                g0.a4(profileStoriesView);
                return;
            case 10:
                b5.a(((x4) this.f11053b).d);
                return;
            case 11:
                n5 n5Var = (n5) this.f11053b;
                if (n5Var.isShowing()) {
                    n5Var.K0(true);
                    return;
                }
                return;
            case 12:
                hi.b1 b1Var = (hi.b1) this.f11053b;
                b1Var.c(b1Var.f14283b);
                b1Var.f14284c = false;
                return;
            case 13:
                ((a8) this.f11053b).run();
                return;
            case 14:
                t6 t6Var = (t6) this.f11053b;
                t6Var.c();
                t6Var.a(true);
                return;
            case 15:
                ((p5) this.f11053b).a(null);
                return;
            case 16:
                ((d7) this.f11053b).R();
                return;
            case 17:
                m7 m7Var = (m7) this.f11053b;
                ArrayList arrayList = m7Var.f12317c;
                if (arrayList != null) {
                    m7Var.f12315a.f12881j1 = arrayList;
                }
                z3 z3Var2 = m7Var.f12315a;
                long j3 = m7Var.f12316b;
                if (z3Var2.l1 != j3 || z3Var2.f12881j1 != null) {
                    z3Var2.l1 = j3;
                    z3Var2.h1();
                    z3Var2.g1();
                    z3Var2.d1(true);
                    TL_stories.PeerStories peerStories = z3Var2.f12916t0.Q0;
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
            case 18:
                ((o0) this.f11053b).f(true);
                return;
            case 19:
                ((fi.a8) this.f11053b).requestLayout();
                return;
            case 20:
                j8 j8Var = (j8) this.f11053b;
                l3 l3Var = j8Var.f12203c;
                if (l3Var != null) {
                    l3Var.f(true);
                    j8Var.f12203c = null;
                }
                j8Var.b(false);
                return;
            case 21:
                h8 h8Var = (h8) this.f11053b;
                if (h8Var.f12116w) {
                    h8Var.F = true;
                    h8Var.G = System.currentTimeMillis();
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    h8Var.f12111e = new LinearGradient(0.0f, 0.0f, 40.0f, 0.0f, new int[]{16777215, 771751935, 771751935, 16777215}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, tileMode);
                    h8Var.f12112f = new LinearGradient(0.0f, 0.0f, 40.0f, 0.0f, new int[]{16777215, 553648127, 553648127, 16777215}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, tileMode);
                    h8Var.invalidate();
                    return;
                }
                return;
            case 22:
                f9 f9Var3 = ((o8) this.f11053b).f12390b;
                try {
                    t8 t8Var = f9Var3.f12036s;
                    if (t8Var != null) {
                        if (f9Var3.f11999b) {
                            g0.E2(t8Var);
                        } else {
                            f9Var3.f12025n.removeView(t8Var);
                        }
                        f9Var3.f12036s = null;
                        f9Var3.v();
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 23:
                ((t8) this.f11053b).f12646s0.Q(true);
                return;
            case 24:
                ((o9) this.f11053b).c();
                return;
            case 25:
                ((ui) this.f11053b).hide();
                return;
            case 26:
                gi.m mVar = (gi.m) this.f11053b;
                fq0 fq0Var = mVar.f13681a0;
                a6 a6Var = mVar.f13680a;
                if (a6Var == null) {
                    str = "";
                } else {
                    str = a6Var.E;
                }
                fq0Var.a(str);
                return;
            case 27:
                ((j0) this.f11053b).getClass();
                return;
            case 28:
                v vVar = (v) this.f11053b;
                b3.f fVar = (b3.f) vVar.f13854a.get();
                if (fVar != null) {
                    int b10 = vVar.f13856c.b();
                    b3.g gVar = fVar.f2895a;
                    synchronized (gVar) {
                        synchronized (gVar) {
                            int i11 = gVar.f2913n;
                            if (i11 == 0 || gVar.f2905e) {
                                if (i11 != b10 || gVar.f2914o == null) {
                                    gVar.f2913n = b10;
                                    if (b10 != 1 && b10 != 0 && b10 != 8) {
                                        if (gVar.f2914o == null) {
                                            Context context = gVar.f2902a;
                                            String str2 = l0.f13815a;
                                            if (context != null && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
                                                String networkCountryIso = telephonyManager.getNetworkCountryIso();
                                                if (!TextUtils.isEmpty(networkCountryIso)) {
                                                    d = ja.d(networkCountryIso);
                                                    gVar.f2914o = d;
                                                }
                                            }
                                            d = ja.d(Locale.getDefault().getCountry());
                                            gVar.f2914o = d;
                                        }
                                        gVar.f2911l = gVar.b(b10);
                                        gVar.d.getClass();
                                        long elapsedRealtime = SystemClock.elapsedRealtime();
                                        if (gVar.f2907g > 0) {
                                            i7 = (int) (elapsedRealtime - gVar.h);
                                        } else {
                                            i7 = 0;
                                        }
                                        gVar.d(gVar.f2908i, i7, gVar.f2911l);
                                        gVar.h = elapsedRealtime;
                                        gVar.f2908i = 0L;
                                        gVar.f2910k = 0L;
                                        gVar.f2909j = 0L;
                                        u uVar = gVar.f2906f;
                                        uVar.f2945a.clear();
                                        uVar.f2947c = -1;
                                        uVar.d = 0;
                                        uVar.f2948e = 0;
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
            default:
                ((hi.i) this.f11053b).f14772c.f15143a0 = false;
                return;
        }
    }
}
