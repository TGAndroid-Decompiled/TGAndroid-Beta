package ei;

import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import b8.xb;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import org.telegram.messenger.li;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ac;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.tp0;
import org.telegram.ui.Stories.recorder.FfmpegAudioWaveformLoader;
public final class z5 implements Runnable {
    public final int f11272a;
    public final Object f11273b;

    public z5(Object obj, int i3) {
        this.f11272a = i3;
        this.f11273b = obj;
    }

    @Override
    public final void run() {
        String str;
        int i3;
        String d;
        TelephonyManager telephonyManager;
        boolean z10 = true;
        switch (this.f11272a) {
            case 0:
                gi.z0 z0Var = (gi.z0) this.f11273b;
                z0Var.c(z0Var.f13997b);
                z0Var.f13998c = false;
                return;
            case 1:
                ((gi.c8) this.f11273b).run();
                return;
            case 2:
                d7 d7Var = (d7) this.f11273b;
                d7Var.c();
                d7Var.a(true);
                return;
            case 3:
                ((y5) this.f11273b).a(null);
                return;
            case 4:
                ((n7) this.f11273b).R();
                return;
            case 5:
                w7 w7Var = (w7) this.f11273b;
                ArrayList arrayList = w7Var.f11191c;
                if (arrayList != null) {
                    w7Var.f11189a.f10470j1 = arrayList;
                }
                j4 j4Var = w7Var.f11189a;
                long j10 = w7Var.f11190b;
                if (j4Var.f10477l1 != j10 || j4Var.f10470j1 != null) {
                    j4Var.f10477l1 = j10;
                    j4Var.h1();
                    j4Var.g1();
                    j4Var.d1(true);
                    TL_stories.PeerStories peerStories = j4Var.f10506t0.R0;
                    if (peerStories != null) {
                        j4Var.C1.V(peerStories, true);
                        return;
                    }
                    z6 z6Var = j4Var.C1;
                    TL_stories.PeerStories y9 = z6Var.y(j10);
                    if (y9 == null) {
                        y9 = z6Var.z(j10);
                    } else {
                        z10 = false;
                    }
                    z6Var.V(y9, z10);
                    return;
                }
                return;
            case 6:
                ((m2.p0) this.f11273b).f(true);
                return;
            case 7:
                ((k8) this.f11273b).requestLayout();
                return;
            case 8:
                t8 t8Var = (t8) this.f11273b;
                gi.l3 l3Var = t8Var.f11057c;
                if (l3Var != null) {
                    l3Var.f(true);
                    t8Var.f11057c = null;
                }
                t8Var.b(false);
                return;
            case 9:
                r8 r8Var = (r8) this.f11273b;
                if (r8Var.f10903w) {
                    r8Var.F = true;
                    r8Var.G = System.currentTimeMillis();
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    r8Var.f10898e = new LinearGradient(0.0f, 0.0f, 40.0f, 0.0f, new int[]{16777215, 771751935, 771751935, 16777215}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, tileMode);
                    r8Var.f10899f = new LinearGradient(0.0f, 0.0f, 40.0f, 0.0f, new int[]{16777215, 553648127, 553648127, 16777215}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, tileMode);
                    r8Var.invalidate();
                    return;
                }
                return;
            case 10:
                r9 r9Var = ((z8) this.f11273b).f11301b;
                try {
                    e9 e9Var = r9Var.f10948s;
                    if (e9Var != null) {
                        if (r9Var.f10911b) {
                            org.telegram.messenger.g0.E2(e9Var);
                        } else {
                            r9Var.f10936n.removeView(e9Var);
                        }
                        r9Var.f10948s = null;
                        r9Var.E();
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 11:
                ((e9) this.f11273b).f10249s0.Y(true);
                return;
            case 12:
                ((aa) this.f11273b).c();
                return;
            case 13:
                ((bi) this.f11273b).hide();
                return;
            case 14:
                fi.m mVar = (fi.m) this.f11273b;
                tp0 tp0Var = mVar.f11616a0;
                k6 k6Var = mVar.f11615a;
                if (k6Var == null) {
                    str = "";
                } else {
                    str = k6Var.E;
                }
                tp0Var.a(str);
                return;
            case 15:
                g2.w wVar = (g2.w) this.f11273b;
                a3.f fVar = (a3.f) wVar.f11912a.get();
                if (fVar != null) {
                    int b10 = wVar.f11914c.b();
                    a3.g gVar = fVar.f69a;
                    synchronized (gVar) {
                        synchronized (gVar) {
                            int i10 = gVar.f87n;
                            if (i10 == 0 || gVar.f79e) {
                                if (i10 != b10 || gVar.f88o == null) {
                                    gVar.f87n = b10;
                                    if (b10 != 1 && b10 != 0 && b10 != 8) {
                                        if (gVar.f88o == null) {
                                            Context context = gVar.f76a;
                                            String str2 = g2.n0.f11873a;
                                            if (context != null && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
                                                String networkCountryIso = telephonyManager.getNetworkCountryIso();
                                                if (!TextUtils.isEmpty(networkCountryIso)) {
                                                    d = xb.d(networkCountryIso);
                                                    gVar.f88o = d;
                                                }
                                            }
                                            d = xb.d(Locale.getDefault().getCountry());
                                            gVar.f88o = d;
                                        }
                                        gVar.f85l = gVar.b(b10);
                                        gVar.d.getClass();
                                        long elapsedRealtime = SystemClock.elapsedRealtime();
                                        if (gVar.f81g > 0) {
                                            i3 = (int) (elapsedRealtime - gVar.h);
                                        } else {
                                            i3 = 0;
                                        }
                                        gVar.d(gVar.f82i, i3, gVar.f85l);
                                        gVar.h = elapsedRealtime;
                                        gVar.f82i = 0L;
                                        gVar.f84k = 0L;
                                        gVar.f83j = 0L;
                                        a3.w wVar2 = gVar.f80f;
                                        wVar2.f120a.clear();
                                        wVar2.f122c = -1;
                                        wVar2.d = 0;
                                        wVar2.f123e = 0;
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
            case 16:
                ((gi.h) this.f11273b).f12854c.f13136a0 = false;
                return;
            case 17:
                ((gi.l) this.f11273b).invalidateSelf();
                return;
            case 18:
                ((gi.d0) this.f11273b).f12538g = -1L;
                return;
            case 19:
                gi.m0 m0Var = (gi.m0) this.f11273b;
                ug.i iVar = m0Var.f13172b.I;
                if (iVar != null) {
                    iVar.b();
                }
                m0Var.f13172b.k();
                return;
            case 20:
                ((gi.u0) this.f11273b).a(false);
                return;
            case 21:
                ac.e();
                vg.v0 v0Var = new vg.v0((org.telegram.ui.ActionBar.d2) new ai.c7((gi.a5) this.f11273b), 14, false);
                v0Var.setOnDismissListener(new gi.d1(0));
                v0Var.show();
                return;
            case 22:
                ((gi.r1) this.f11273b).G();
                return;
            case 23:
                gi.x1 x1Var = (gi.x1) this.f11273b;
                ArrayList arrayList2 = x1Var.f13821w;
                ArrayList arrayList3 = x1Var.f13820s;
                gi.y1 y1Var = x1Var.O;
                gi.i2 i2Var = y1Var.f13920s;
                int i11 = gi.i2.f12950z1;
                li b02 = li.b0(i2Var.f28583a);
                String str3 = x1Var.I;
                if ("premium".equalsIgnoreCase(str3)) {
                    ArrayList i02 = b02.i0(7, false);
                    x1Var.f13823y = 0;
                    arrayList3.clear();
                    arrayList2.clear();
                    x1Var.E.clear();
                    x1Var.f13818n.clear();
                    x1Var.f13823y++;
                    arrayList3.add(null);
                    arrayList2.add(0L);
                    arrayList3.addAll(i02);
                    x1Var.f13823y = i02.size() + x1Var.f13823y;
                    x1Var.J = x1Var.I;
                    x1Var.f();
                    gi.m1.z1(y1Var.f13914b, 0, 0);
                    y1Var.f13917f.c(false);
                    y1Var.f13916e.n(false);
                    return;
                } else if (y1Var.f13653a == 1 && org.telegram.messenger.i6.d(x1Var.I)) {
                    TLRPC.TL_messages_getStickers tL_messages_getStickers = new TLRPC.TL_messages_getStickers();
                    tL_messages_getStickers.emoticon = x1Var.I;
                    tL_messages_getStickers.hash = 0L;
                    ConnectionsManager.getInstance(i2Var.f28583a).sendRequest(tL_messages_getStickers, new ai.f3(15, x1Var, str3));
                    return;
                } else {
                    String[] G0 = org.telegram.messenger.g0.G0();
                    String[] strArr = x1Var.K;
                    if (strArr == null || !Arrays.equals(G0, strArr)) {
                        li.b0(i2Var.f28583a).M(G0, false);
                    }
                    x1Var.K = G0;
                    b02.V(G0, x1Var.I, false, new aa.a(x1Var, str3, b02, 6), false, false, false, true, 50);
                    return;
                }
            case 24:
                gi.d2 d2Var = (gi.d2) ((bh.h) this.f11273b).f3317b;
                if (!d2Var.f12553n) {
                    d2Var.f12554r.setVisibility(8);
                    return;
                }
                return;
            case 25:
                gi.g2 g2Var = (gi.g2) ((g6.q) this.f11273b).f12031b;
                ArrayList arrayList4 = g2Var.f12829o;
                if (!arrayList4.isEmpty()) {
                    g2Var.f12826l.e(true, 0.0f);
                    int i12 = g2Var.f12825k + 1;
                    g2Var.f12825k = i12;
                    if (i12 > arrayList4.size() - 1) {
                        g2Var.f12825k = 0;
                    }
                    dh.e0 e0Var = g2Var.f12824j;
                    e0Var.e((dh.n0) arrayList4.get(g2Var.f12825k));
                    g2Var.f12824j = g2Var.f12823i;
                    g2Var.f12823i = e0Var;
                    g2Var.f12830p.invalidate();
                    return;
                }
                return;
            case 26:
                FfmpegAudioWaveformLoader.b((FfmpegAudioWaveformLoader) this.f11273b);
                return;
            case 27:
                ((gi.z2) this.f11273b).b(null);
                return;
            case 28:
                ((gi.c3) this.f11273b).E();
                return;
            default:
                gi.o9 o9Var = (gi.o9) this.f11273b;
                if (o9Var.J) {
                    o9Var.J = false;
                    o9Var.invalidate();
                    return;
                }
                return;
        }
    }
}
