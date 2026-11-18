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
import hi.m3;
import java.util.ArrayList;
import java.util.Locale;
import n2.o0;
import org.telegram.messenger.g0;
import org.telegram.messenger.ks;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.dq0;
import org.telegram.ui.Components.si;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.cx;
import org.telegram.ui.tv;
public final class a implements Runnable {
    public final int f11020a;
    public final Object f11021b;

    public a(Object obj, int i7) {
        this.f11020a = i7;
        this.f11021b = obj;
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
        switch (this.f11020a) {
            case 0:
                ab.q qVar = (ab.q) this.f11021b;
                ((Context) qVar.f988b).unregisterReceiver((b) qVar.f989c);
                return;
            case 1:
                b bVar = (b) this.f11021b;
                if (bVar.f11024c.f987a) {
                    bVar.f11022a.f19597a.C1(3, false);
                    return;
                }
                return;
            case 2:
                cx cxVar = ((tv) this.f11021b).P0;
                if (cxVar.M && cxVar.k4().I()) {
                    cxVar.F0.h();
                    return;
                } else {
                    cxVar.R4(true, true);
                    return;
                }
            case 3:
                ((a1) this.f11021b).f11715a.t(false);
                return;
            case 4:
                c1 c1Var = ((b1) this.f11021b).f11761a;
                ks.f(c1Var.f11793e).k(176, Long.valueOf(c1Var.g()));
                return;
            case 5:
                e1 e1Var = (e1) this.f11021b;
                f9 f9Var = e1Var.f11871c;
                if (f9Var != null && e1Var.G() && (nVar = e1Var.f11869a) != null && nVar.f59989c == 0 && (launchActivity = LaunchActivity.H1) != null && nd.a(launchActivity)) {
                    f9Var.T();
                    return;
                }
                return;
            case 6:
                wi.n nVar2 = ((d1) this.f11021b).f11839e.f11869a;
                if (nVar2 != null) {
                    nVar2.c();
                    return;
                }
                return;
            case 7:
                ((x2) this.f11021b).f12719a.O0();
                return;
            case 8:
                z3 z3Var = ((c3) this.f11021b).f11808y;
                s3 s3Var = z3Var.A1;
                if (s3Var != null) {
                    if (!z3Var.D1 && !z3Var.E1 && !z3Var.F1) {
                        f9 f9Var2 = ((w8) s3Var).d;
                        if (!f9Var2.f11983o0.getCurrentPeerView().b1(true) && !f9Var2.f11983o0.E(true)) {
                            f9Var2.u(true);
                            return;
                        }
                        return;
                    } else if (z3Var.f12893y1.f12723e) {
                        ((e9) z3Var.f12886w2.f12772c).loopBack();
                        return;
                    } else {
                        z3Var.G0 = 0L;
                        return;
                    }
                }
                return;
            case 9:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) this.f11021b;
                int i10 = ProfileStoriesView.f43797t0;
                profileStoriesView.getClass();
                g0.a4(profileStoriesView);
                return;
            case 10:
                a5.a(((w4) this.f11021b).d);
                return;
            case 11:
                m5 m5Var = (m5) this.f11021b;
                if (m5Var.isShowing()) {
                    m5Var.K0(true);
                    return;
                }
                return;
            case 12:
                hi.b1 b1Var = (hi.b1) this.f11021b;
                b1Var.c(b1Var.f14255b);
                b1Var.f14256c = false;
                return;
            case 13:
                ((b8) this.f11021b).run();
                return;
            case 14:
                t6 t6Var = (t6) this.f11021b;
                t6Var.c();
                t6Var.a(true);
                return;
            case 15:
                ((o5) this.f11021b).a(null);
                return;
            case 16:
                ((d7) this.f11021b).R();
                return;
            case 17:
                m7 m7Var = (m7) this.f11021b;
                ArrayList arrayList = m7Var.f12276c;
                if (arrayList != null) {
                    m7Var.f12274a.f12837j1 = arrayList;
                }
                z3 z3Var2 = m7Var.f12274a;
                long j3 = m7Var.f12275b;
                if (z3Var2.l1 != j3 || z3Var2.f12837j1 != null) {
                    z3Var2.l1 = j3;
                    z3Var2.h1();
                    z3Var2.g1();
                    z3Var2.d1(true);
                    TL_stories.PeerStories peerStories = z3Var2.f12872t0.Q0;
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
                ((o0) this.f11021b).f(true);
                return;
            case 19:
                ((a8) this.f11021b).requestLayout();
                return;
            case 20:
                j8 j8Var = (j8) this.f11021b;
                m3 m3Var = j8Var.f12161c;
                if (m3Var != null) {
                    m3Var.f(true);
                    j8Var.f12161c = null;
                }
                j8Var.b(false);
                return;
            case 21:
                h8 h8Var = (h8) this.f11021b;
                if (h8Var.f12072w) {
                    h8Var.F = true;
                    h8Var.G = System.currentTimeMillis();
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    h8Var.f12067e = new LinearGradient(0.0f, 0.0f, 40.0f, 0.0f, new int[]{16777215, 771751935, 771751935, 16777215}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, tileMode);
                    h8Var.f12068f = new LinearGradient(0.0f, 0.0f, 40.0f, 0.0f, new int[]{16777215, 553648127, 553648127, 16777215}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, tileMode);
                    h8Var.invalidate();
                    return;
                }
                return;
            case 22:
                f9 f9Var3 = ((o8) this.f11021b).f12345b;
                try {
                    t8 t8Var = f9Var3.f11992s;
                    if (t8Var != null) {
                        if (f9Var3.f11955b) {
                            g0.E2(t8Var);
                        } else {
                            f9Var3.f11981n.removeView(t8Var);
                        }
                        f9Var3.f11992s = null;
                        f9Var3.v();
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 23:
                ((t8) this.f11021b).f12604s0.Q(true);
                return;
            case 24:
                ((o9) this.f11021b).c();
                return;
            case 25:
                ((si) this.f11021b).hide();
                return;
            case 26:
                gi.m mVar = (gi.m) this.f11021b;
                dq0 dq0Var = mVar.f13649a0;
                z5 z5Var = mVar.f13648a;
                if (z5Var == null) {
                    str = "";
                } else {
                    str = z5Var.E;
                }
                dq0Var.a(str);
                return;
            case 27:
                ((j0) this.f11021b).getClass();
                return;
            case 28:
                v vVar = (v) this.f11021b;
                b3.f fVar = (b3.f) vVar.f13822a.get();
                if (fVar != null) {
                    int b10 = vVar.f13824c.b();
                    b3.g gVar = fVar.f2876a;
                    synchronized (gVar) {
                        synchronized (gVar) {
                            int i11 = gVar.f2894n;
                            if (i11 == 0 || gVar.f2886e) {
                                if (i11 != b10 || gVar.f2895o == null) {
                                    gVar.f2894n = b10;
                                    if (b10 != 1 && b10 != 0 && b10 != 8) {
                                        if (gVar.f2895o == null) {
                                            Context context = gVar.f2883a;
                                            String str2 = l0.f13783a;
                                            if (context != null && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
                                                String networkCountryIso = telephonyManager.getNetworkCountryIso();
                                                if (!TextUtils.isEmpty(networkCountryIso)) {
                                                    d = ja.d(networkCountryIso);
                                                    gVar.f2895o = d;
                                                }
                                            }
                                            d = ja.d(Locale.getDefault().getCountry());
                                            gVar.f2895o = d;
                                        }
                                        gVar.f2892l = gVar.b(b10);
                                        gVar.d.getClass();
                                        long elapsedRealtime = SystemClock.elapsedRealtime();
                                        if (gVar.f2888g > 0) {
                                            i7 = (int) (elapsedRealtime - gVar.h);
                                        } else {
                                            i7 = 0;
                                        }
                                        gVar.d(gVar.f2889i, i7, gVar.f2892l);
                                        gVar.h = elapsedRealtime;
                                        gVar.f2889i = 0L;
                                        gVar.f2891k = 0L;
                                        gVar.f2890j = 0L;
                                        u uVar = gVar.f2887f;
                                        uVar.f2926a.clear();
                                        uVar.f2928c = -1;
                                        uVar.d = 0;
                                        uVar.f2929e = 0;
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
                ((hi.h) this.f11021b).f14710c.f15040a0 = false;
                return;
        }
    }
}
