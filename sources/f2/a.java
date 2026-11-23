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
import fi.a6;
import fi.a8;
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
import hi.j1;
import hi.u3;
import hi.v8;
import java.util.ArrayList;
import java.util.Locale;
import n2.p0;
import org.telegram.messenger.g0;
import org.telegram.messenger.ks;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.eq0;
import org.telegram.ui.Components.ti;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.bx;
import org.telegram.ui.sv;
public final class a implements Runnable {
    public final int f11013a;
    public final Object f11014b;

    public a(Object obj, int i7) {
        this.f11013a = i7;
        this.f11014b = obj;
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
        switch (this.f11013a) {
            case 0:
                b bVar = (b) this.f11014b;
                if (bVar.f11017c.f987a) {
                    bVar.f11015a.f19342a.C1(3, false);
                    return;
                }
                return;
            case 1:
                bx bxVar = ((sv) this.f11014b).P0;
                if (bxVar.M && bxVar.k4().I()) {
                    bxVar.F0.h();
                    return;
                } else {
                    bxVar.R4(true, true);
                    return;
                }
            case 2:
                ((a1) this.f11014b).f11709a.t(false);
                return;
            case 3:
                c1 c1Var = ((b1) this.f11014b).f11756a;
                ks.f(c1Var.f11801e).k(176, Long.valueOf(c1Var.g()));
                return;
            case 4:
                e1 e1Var = (e1) this.f11014b;
                f9 f9Var = e1Var.f11877c;
                if (f9Var != null && e1Var.O0() && (nVar = e1Var.f11875a) != null && nVar.f60117c == 0 && (launchActivity = LaunchActivity.H1) != null && od.a(launchActivity)) {
                    f9Var.T();
                    return;
                }
                return;
            case 5:
                wi.n nVar2 = ((d1) this.f11014b).f11844e.f11875a;
                if (nVar2 != null) {
                    nVar2.c();
                    return;
                }
                return;
            case 6:
                ((x2) this.f11014b).f12726a.O0();
                return;
            case 7:
                z3 z3Var = ((c3) this.f11014b).f11816y;
                s3 s3Var = z3Var.A1;
                if (s3Var != null) {
                    if (!z3Var.D1 && !z3Var.E1 && !z3Var.F1) {
                        f9 f9Var2 = ((w8) s3Var).d;
                        if (!f9Var2.f11989o0.getCurrentPeerView().b1(true) && !f9Var2.f11989o0.E(true)) {
                            f9Var2.u(true);
                            return;
                        }
                        return;
                    } else if (z3Var.f12899y1.f12730e) {
                        ((e9) z3Var.f12892w2.f12777c).loopBack();
                        return;
                    } else {
                        z3Var.G0 = 0L;
                        return;
                    }
                }
                return;
            case 8:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) this.f11014b;
                int i10 = ProfileStoriesView.f43923t0;
                profileStoriesView.getClass();
                g0.a4(profileStoriesView);
                return;
            case 9:
                b5.a(((x4) this.f11014b).d);
                return;
            case 10:
                n5 n5Var = (n5) this.f11014b;
                if (n5Var.isShowing()) {
                    n5Var.K0(true);
                    return;
                }
                return;
            case 11:
                j1 j1Var = (j1) this.f11014b;
                j1Var.c(j1Var.f14719b);
                j1Var.f14720c = false;
                return;
            case 12:
                ((v8) this.f11014b).run();
                return;
            case 13:
                t6 t6Var = (t6) this.f11014b;
                t6Var.c();
                t6Var.a(true);
                return;
            case 14:
                ((p5) this.f11014b).a(null);
                return;
            case 15:
                ((d7) this.f11014b).S();
                return;
            case 16:
                m7 m7Var = (m7) this.f11014b;
                ArrayList arrayList = m7Var.f12279c;
                if (arrayList != null) {
                    m7Var.f12277a.f12843j1 = arrayList;
                }
                z3 z3Var2 = m7Var.f12277a;
                long j3 = m7Var.f12278b;
                if (z3Var2.l1 != j3 || z3Var2.f12843j1 != null) {
                    z3Var2.l1 = j3;
                    z3Var2.h1();
                    z3Var2.g1();
                    z3Var2.d1(true);
                    TL_stories.PeerStories peerStories = z3Var2.f12878t0.Q0;
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
                ((p0) this.f11014b).f(true);
                return;
            case 18:
                ((a8) this.f11014b).requestLayout();
                return;
            case 19:
                j8 j8Var = (j8) this.f11014b;
                u3 u3Var = j8Var.f12165c;
                if (u3Var != null) {
                    u3Var.f(true);
                    j8Var.f12165c = null;
                }
                j8Var.b(false);
                return;
            case 20:
                h8 h8Var = (h8) this.f11014b;
                if (h8Var.f12078w) {
                    h8Var.F = true;
                    h8Var.G = System.currentTimeMillis();
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    h8Var.f12073e = new LinearGradient(0.0f, 0.0f, 40.0f, 0.0f, new int[]{16777215, 771751935, 771751935, 16777215}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, tileMode);
                    h8Var.f12074f = new LinearGradient(0.0f, 0.0f, 40.0f, 0.0f, new int[]{16777215, 553648127, 553648127, 16777215}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, tileMode);
                    h8Var.invalidate();
                    return;
                }
                return;
            case 21:
                f9 f9Var3 = ((o8) this.f11014b).f12352b;
                try {
                    t8 t8Var = f9Var3.f11998s;
                    if (t8Var != null) {
                        if (f9Var3.f11961b) {
                            g0.E2(t8Var);
                        } else {
                            f9Var3.f11987n.removeView(t8Var);
                        }
                        f9Var3.f11998s = null;
                        f9Var3.v();
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 22:
                ((t8) this.f11014b).f12608s0.Q(true);
                return;
            case 23:
                ((o9) this.f11014b).c();
                return;
            case 24:
                ((ti) this.f11014b).hide();
                return;
            case 25:
                gi.m mVar = (gi.m) this.f11014b;
                eq0 eq0Var = mVar.f13644a0;
                a6 a6Var = mVar.f13643a;
                if (a6Var == null) {
                    str = "";
                } else {
                    str = a6Var.E;
                }
                eq0Var.a(str);
                return;
            case 26:
                ((j0) this.f11014b).getClass();
                return;
            case 27:
                v vVar = (v) this.f11014b;
                b3.f fVar = (b3.f) vVar.f13817a.get();
                if (fVar != null) {
                    int b10 = vVar.f13819c.b();
                    b3.g gVar = fVar.f2847a;
                    synchronized (gVar) {
                        synchronized (gVar) {
                            int i11 = gVar.f2865n;
                            if (i11 == 0 || gVar.f2857e) {
                                if (i11 != b10 || gVar.f2866o == null) {
                                    gVar.f2865n = b10;
                                    if (b10 != 1 && b10 != 0 && b10 != 8) {
                                        if (gVar.f2866o == null) {
                                            Context context = gVar.f2854a;
                                            String str2 = l0.f13778a;
                                            if (context != null && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
                                                String networkCountryIso = telephonyManager.getNetworkCountryIso();
                                                if (!TextUtils.isEmpty(networkCountryIso)) {
                                                    d = ka.d(networkCountryIso);
                                                    gVar.f2866o = d;
                                                }
                                            }
                                            d = ka.d(Locale.getDefault().getCountry());
                                            gVar.f2866o = d;
                                        }
                                        gVar.f2863l = gVar.b(b10);
                                        gVar.d.getClass();
                                        long elapsedRealtime = SystemClock.elapsedRealtime();
                                        if (gVar.f2859g > 0) {
                                            i7 = (int) (elapsedRealtime - gVar.h);
                                        } else {
                                            i7 = 0;
                                        }
                                        gVar.d(gVar.f2860i, i7, gVar.f2863l);
                                        gVar.h = elapsedRealtime;
                                        gVar.f2860i = 0L;
                                        gVar.f2862k = 0L;
                                        gVar.f2861j = 0L;
                                        u uVar = gVar.f2858f;
                                        uVar.f2897a.clear();
                                        uVar.f2899c = -1;
                                        uVar.d = 0;
                                        uVar.f2900e = 0;
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
                ((hi.i) this.f11014b).f14616c.f14928a0 = false;
                return;
            default:
                ((hi.m) this.f11014b).invalidateSelf();
                return;
        }
    }
}
