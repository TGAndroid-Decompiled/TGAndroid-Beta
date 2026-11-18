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
    public final int f11023a;
    public final Object f11024b;

    public a(Object obj, int i7) {
        this.f11023a = i7;
        this.f11024b = obj;
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
        switch (this.f11023a) {
            case 0:
                ab.q qVar = (ab.q) this.f11024b;
                ((Context) qVar.f988b).unregisterReceiver((b) qVar.f989c);
                return;
            case 1:
                b bVar = (b) this.f11024b;
                if (bVar.f11027c.f987a) {
                    bVar.f11025a.f19600a.C1(3, false);
                    return;
                }
                return;
            case 2:
                cx cxVar = ((tv) this.f11024b).P0;
                if (cxVar.M && cxVar.k4().I()) {
                    cxVar.F0.h();
                    return;
                } else {
                    cxVar.R4(true, true);
                    return;
                }
            case 3:
                ((a1) this.f11024b).f11718a.t(false);
                return;
            case 4:
                c1 c1Var = ((b1) this.f11024b).f11764a;
                ks.f(c1Var.f11796e).k(176, Long.valueOf(c1Var.g()));
                return;
            case 5:
                e1 e1Var = (e1) this.f11024b;
                f9 f9Var = e1Var.f11874c;
                if (f9Var != null && e1Var.G() && (nVar = e1Var.f11872a) != null && nVar.f59988c == 0 && (launchActivity = LaunchActivity.H1) != null && nd.a(launchActivity)) {
                    f9Var.T();
                    return;
                }
                return;
            case 6:
                wi.n nVar2 = ((d1) this.f11024b).f11842e.f11872a;
                if (nVar2 != null) {
                    nVar2.c();
                    return;
                }
                return;
            case 7:
                ((x2) this.f11024b).f12722a.O0();
                return;
            case 8:
                z3 z3Var = ((c3) this.f11024b).f11811y;
                s3 s3Var = z3Var.A1;
                if (s3Var != null) {
                    if (!z3Var.D1 && !z3Var.E1 && !z3Var.F1) {
                        f9 f9Var2 = ((w8) s3Var).d;
                        if (!f9Var2.f11986o0.getCurrentPeerView().b1(true) && !f9Var2.f11986o0.E(true)) {
                            f9Var2.u(true);
                            return;
                        }
                        return;
                    } else if (z3Var.f12896y1.f12726e) {
                        ((e9) z3Var.f12889w2.f12775c).loopBack();
                        return;
                    } else {
                        z3Var.G0 = 0L;
                        return;
                    }
                }
                return;
            case 9:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) this.f11024b;
                int i10 = ProfileStoriesView.f43797t0;
                profileStoriesView.getClass();
                g0.a4(profileStoriesView);
                return;
            case 10:
                a5.a(((w4) this.f11024b).d);
                return;
            case 11:
                m5 m5Var = (m5) this.f11024b;
                if (m5Var.isShowing()) {
                    m5Var.K0(true);
                    return;
                }
                return;
            case 12:
                hi.b1 b1Var = (hi.b1) this.f11024b;
                b1Var.c(b1Var.f14258b);
                b1Var.f14259c = false;
                return;
            case 13:
                ((b8) this.f11024b).run();
                return;
            case 14:
                t6 t6Var = (t6) this.f11024b;
                t6Var.c();
                t6Var.a(true);
                return;
            case 15:
                ((o5) this.f11024b).a(null);
                return;
            case 16:
                ((d7) this.f11024b).R();
                return;
            case 17:
                m7 m7Var = (m7) this.f11024b;
                ArrayList arrayList = m7Var.f12279c;
                if (arrayList != null) {
                    m7Var.f12277a.f12840j1 = arrayList;
                }
                z3 z3Var2 = m7Var.f12277a;
                long j3 = m7Var.f12278b;
                if (z3Var2.l1 != j3 || z3Var2.f12840j1 != null) {
                    z3Var2.l1 = j3;
                    z3Var2.h1();
                    z3Var2.g1();
                    z3Var2.d1(true);
                    TL_stories.PeerStories peerStories = z3Var2.f12875t0.Q0;
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
                ((o0) this.f11024b).f(true);
                return;
            case 19:
                ((a8) this.f11024b).requestLayout();
                return;
            case 20:
                j8 j8Var = (j8) this.f11024b;
                m3 m3Var = j8Var.f12164c;
                if (m3Var != null) {
                    m3Var.f(true);
                    j8Var.f12164c = null;
                }
                j8Var.b(false);
                return;
            case 21:
                h8 h8Var = (h8) this.f11024b;
                if (h8Var.f12075w) {
                    h8Var.F = true;
                    h8Var.G = System.currentTimeMillis();
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    h8Var.f12070e = new LinearGradient(0.0f, 0.0f, 40.0f, 0.0f, new int[]{16777215, 771751935, 771751935, 16777215}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, tileMode);
                    h8Var.f12071f = new LinearGradient(0.0f, 0.0f, 40.0f, 0.0f, new int[]{16777215, 553648127, 553648127, 16777215}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, tileMode);
                    h8Var.invalidate();
                    return;
                }
                return;
            case 22:
                f9 f9Var3 = ((o8) this.f11024b).f12348b;
                try {
                    t8 t8Var = f9Var3.f11995s;
                    if (t8Var != null) {
                        if (f9Var3.f11958b) {
                            g0.E2(t8Var);
                        } else {
                            f9Var3.f11984n.removeView(t8Var);
                        }
                        f9Var3.f11995s = null;
                        f9Var3.v();
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 23:
                ((t8) this.f11024b).f12607s0.Q(true);
                return;
            case 24:
                ((o9) this.f11024b).c();
                return;
            case 25:
                ((si) this.f11024b).hide();
                return;
            case 26:
                gi.m mVar = (gi.m) this.f11024b;
                dq0 dq0Var = mVar.f13652a0;
                z5 z5Var = mVar.f13651a;
                if (z5Var == null) {
                    str = "";
                } else {
                    str = z5Var.E;
                }
                dq0Var.a(str);
                return;
            case 27:
                ((j0) this.f11024b).getClass();
                return;
            case 28:
                v vVar = (v) this.f11024b;
                b3.f fVar = (b3.f) vVar.f13825a.get();
                if (fVar != null) {
                    int b10 = vVar.f13827c.b();
                    b3.g gVar = fVar.f2875a;
                    synchronized (gVar) {
                        synchronized (gVar) {
                            int i11 = gVar.f2893n;
                            if (i11 == 0 || gVar.f2885e) {
                                if (i11 != b10 || gVar.f2894o == null) {
                                    gVar.f2893n = b10;
                                    if (b10 != 1 && b10 != 0 && b10 != 8) {
                                        if (gVar.f2894o == null) {
                                            Context context = gVar.f2882a;
                                            String str2 = l0.f13786a;
                                            if (context != null && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
                                                String networkCountryIso = telephonyManager.getNetworkCountryIso();
                                                if (!TextUtils.isEmpty(networkCountryIso)) {
                                                    d = ja.d(networkCountryIso);
                                                    gVar.f2894o = d;
                                                }
                                            }
                                            d = ja.d(Locale.getDefault().getCountry());
                                            gVar.f2894o = d;
                                        }
                                        gVar.f2891l = gVar.b(b10);
                                        gVar.d.getClass();
                                        long elapsedRealtime = SystemClock.elapsedRealtime();
                                        if (gVar.f2887g > 0) {
                                            i7 = (int) (elapsedRealtime - gVar.h);
                                        } else {
                                            i7 = 0;
                                        }
                                        gVar.d(gVar.f2888i, i7, gVar.f2891l);
                                        gVar.h = elapsedRealtime;
                                        gVar.f2888i = 0L;
                                        gVar.f2890k = 0L;
                                        gVar.f2889j = 0L;
                                        u uVar = gVar.f2886f;
                                        uVar.f2925a.clear();
                                        uVar.f2927c = -1;
                                        uVar.d = 0;
                                        uVar.f2928e = 0;
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
                ((hi.h) this.f11024b).f14713c.f15043a0 = false;
                return;
        }
    }
}
