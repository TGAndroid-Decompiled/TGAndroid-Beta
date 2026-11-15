package fi;

import a8.ha;
import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import c8.kd;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.ns;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.vp0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Stories.ProfileStoriesView;
public final class c1 implements Runnable {
    public final int f11586a;
    public final Object f11587b;

    public c1(Object obj, int i7) {
        this.f11586a = i7;
        this.f11587b = obj;
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
        switch (this.f11586a) {
            case 0:
                e1 e1Var = ((d1) this.f11587b).f11620a;
                ns.f(e1Var.f11656e).k(176, Long.valueOf(e1Var.g()));
                return;
            case 1:
                g1 g1Var = (g1) this.f11587b;
                i9 i9Var = g1Var.f11726c;
                if (i9Var != null && g1Var.F() && (nVar = g1Var.f11724a) != null && nVar.f59424c == 0 && (launchActivity = LaunchActivity.H1) != null && kd.a(launchActivity)) {
                    i9Var.T();
                    return;
                }
                return;
            case 2:
                wi.n nVar2 = ((f1) this.f11587b).f11694e.f11724a;
                if (nVar2 != null) {
                    nVar2.c();
                    return;
                }
                return;
            case 3:
                ((z2) this.f11587b).f12578a.O0();
                return;
            case 4:
                b4 b4Var = ((e3) this.f11587b).f11671y;
                u3 u3Var = b4Var.A1;
                if (u3Var != null) {
                    if (!b4Var.D1 && !b4Var.E1 && !b4Var.F1) {
                        i9 i9Var2 = ((z8) u3Var).d;
                        if (!i9Var2.f11861o0.getCurrentPeerView().b1(true) && !i9Var2.f11861o0.E(true)) {
                            i9Var2.u(true);
                            return;
                        }
                        return;
                    } else if (b4Var.f11543y1.f12582e) {
                        ((h9) b4Var.f11536w2.f11407c).loopBack();
                        return;
                    } else {
                        b4Var.G0 = 0L;
                        return;
                    }
                }
                return;
            case 5:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) this.f11587b;
                int i10 = ProfileStoriesView.f43351t0;
                profileStoriesView.getClass();
                org.telegram.messenger.g0.b4(profileStoriesView);
                return;
            case 6:
                c5.a(((y4) this.f11587b).d);
                return;
            case 7:
                o5 o5Var = (o5) this.f11587b;
                if (o5Var.isShowing()) {
                    o5Var.J0(true);
                    return;
                }
                return;
            case 8:
                hi.a1 a1Var = (hi.a1) this.f11587b;
                a1Var.c(a1Var.f13862b);
                a1Var.f13863c = false;
                return;
            case 9:
                ((hi.b8) this.f11587b).run();
                return;
            case 10:
                w6 w6Var = (w6) this.f11587b;
                w6Var.c();
                w6Var.a(true);
                return;
            case 11:
                ((q5) this.f11587b).a(null);
                return;
            case 12:
                ((g7) this.f11587b).R();
                return;
            case 13:
                p7 p7Var = (p7) this.f11587b;
                ArrayList arrayList = p7Var.f12181c;
                if (arrayList != null) {
                    p7Var.f12179a.f11487j1 = arrayList;
                }
                b4 b4Var2 = p7Var.f12179a;
                long j3 = p7Var.f12180b;
                if (b4Var2.l1 != j3 || b4Var2.f11487j1 != null) {
                    b4Var2.l1 = j3;
                    b4Var2.h1();
                    b4Var2.g1();
                    b4Var2.d1(true);
                    TL_stories.PeerStories peerStories = b4Var2.f11522t0.Q0;
                    if (peerStories != null) {
                        b4Var2.C1.V(peerStories, true);
                        return;
                    }
                    s6 s6Var = b4Var2.C1;
                    TL_stories.PeerStories y10 = s6Var.y(j3);
                    if (y10 == null) {
                        y10 = s6Var.z(j3);
                        z10 = true;
                    }
                    s6Var.V(y10, z10);
                    return;
                }
                return;
            case 14:
                ((n2.o0) this.f11587b).f(true);
                return;
            case 15:
                ((d8) this.f11587b).requestLayout();
                return;
            case 16:
                m8 m8Var = (m8) this.f11587b;
                hi.l3 l3Var = m8Var.f12037c;
                if (l3Var != null) {
                    l3Var.f(true);
                    m8Var.f12037c = null;
                }
                m8Var.b(false);
                return;
            case 17:
                k8 k8Var = (k8) this.f11587b;
                if (k8Var.f11971w) {
                    k8Var.F = true;
                    k8Var.G = System.currentTimeMillis();
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    k8Var.f11966e = new LinearGradient(0.0f, 0.0f, 40.0f, 0.0f, new int[]{16777215, 771751935, 771751935, 16777215}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, tileMode);
                    k8Var.f11967f = new LinearGradient(0.0f, 0.0f, 40.0f, 0.0f, new int[]{16777215, 553648127, 553648127, 16777215}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, tileMode);
                    k8Var.invalidate();
                    return;
                }
                return;
            case 18:
                i9 i9Var3 = ((r8) this.f11587b).f12289b;
                try {
                    w8 w8Var = i9Var3.f11870s;
                    if (w8Var != null) {
                        if (i9Var3.f11833b) {
                            org.telegram.messenger.g0.E2(w8Var);
                        } else {
                            i9Var3.f11859n.removeView(w8Var);
                        }
                        i9Var3.f11870s = null;
                        i9Var3.v();
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 19:
                ((w8) this.f11587b).f12486s0.Q(true);
                return;
            case 20:
                ((r9) this.f11587b).c();
                return;
            case 21:
                ((ki) this.f11587b).hide();
                return;
            case 22:
                gi.m mVar = (gi.m) this.f11587b;
                vp0 vp0Var = mVar.f13337a0;
                c6 c6Var = mVar.f13336a;
                if (c6Var == null) {
                    str = "";
                } else {
                    str = c6Var.E;
                }
                vp0Var.a(str);
                return;
            case 23:
                ((h2.j0) this.f11587b).getClass();
                return;
            case 24:
                h2.v vVar = (h2.v) this.f11587b;
                b3.f fVar = (b3.f) vVar.f13510a.get();
                if (fVar != null) {
                    int b10 = vVar.f13512c.b();
                    b3.g gVar = fVar.f2881a;
                    synchronized (gVar) {
                        synchronized (gVar) {
                            int i11 = gVar.f2899n;
                            if (i11 == 0 || gVar.f2891e) {
                                if (i11 != b10 || gVar.f2900o == null) {
                                    gVar.f2899n = b10;
                                    if (b10 != 1 && b10 != 0 && b10 != 8) {
                                        if (gVar.f2900o == null) {
                                            Context context = gVar.f2888a;
                                            String str2 = h2.l0.f13471a;
                                            if (context != null && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
                                                String networkCountryIso = telephonyManager.getNetworkCountryIso();
                                                if (!TextUtils.isEmpty(networkCountryIso)) {
                                                    d = ha.d(networkCountryIso);
                                                    gVar.f2900o = d;
                                                }
                                            }
                                            d = ha.d(Locale.getDefault().getCountry());
                                            gVar.f2900o = d;
                                        }
                                        gVar.f2897l = gVar.b(b10);
                                        gVar.d.getClass();
                                        long elapsedRealtime = SystemClock.elapsedRealtime();
                                        if (gVar.f2893g > 0) {
                                            i7 = (int) (elapsedRealtime - gVar.h);
                                        } else {
                                            i7 = 0;
                                        }
                                        gVar.d(gVar.f2894i, i7, gVar.f2897l);
                                        gVar.h = elapsedRealtime;
                                        gVar.f2894i = 0L;
                                        gVar.f2896k = 0L;
                                        gVar.f2895j = 0L;
                                        b3.t tVar = gVar.f2892f;
                                        tVar.f2928a.clear();
                                        tVar.f2930c = -1;
                                        tVar.d = 0;
                                        tVar.f2931e = 0;
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
            case 25:
                ((hi.h) this.f11587b).f14354c.f14615a0 = false;
                return;
            case 26:
                ((hi.l) this.f11587b).invalidateSelf();
                return;
            case 27:
                ((hi.d0) this.f11587b).f14077g = -1L;
                return;
            case 28:
                hi.n0 n0Var = (hi.n0) this.f11587b;
                tg.i iVar = n0Var.f14720b.I;
                if (iVar != null) {
                    iVar.b();
                }
                n0Var.f14720b.k();
                return;
            default:
                ((hi.v0) this.f11587b).a(false);
                return;
        }
    }
}
