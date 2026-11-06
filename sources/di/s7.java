package di;

import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.ui;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.di;
import org.telegram.ui.Components.sp0;
import org.telegram.ui.Stories.recorder.FfmpegAudioWaveformLoader;
public final class s7 implements Runnable {
    public final int f9769a;
    public final Object f9770b;

    public s7(Object obj, int i7) {
        this.f9769a = i7;
        this.f9770b = obj;
    }

    @Override
    public final void run() {
        String str;
        boolean z9 = true;
        switch (this.f9769a) {
            case 0:
                w7 w7Var = (w7) this.f9770b;
                ArrayList arrayList = w7Var.f9912c;
                if (arrayList != null) {
                    w7Var.f9910a.f9157i1 = arrayList;
                }
                i4 i4Var = w7Var.f9910a;
                long j3 = w7Var.f9911b;
                if (i4Var.f9164k1 != j3 || i4Var.f9157i1 != null) {
                    i4Var.f9164k1 = j3;
                    i4Var.h1();
                    i4Var.g1();
                    i4Var.d1(true);
                    TL_stories.PeerStories peerStories = i4Var.f9192s0.P0;
                    if (peerStories != null) {
                        i4Var.B1.V(peerStories, true);
                        return;
                    }
                    y6 y6Var = i4Var.B1;
                    TL_stories.PeerStories y10 = y6Var.y(j3);
                    if (y10 == null) {
                        y10 = y6Var.z(j3);
                    } else {
                        z9 = false;
                    }
                    y6Var.V(y10, z9);
                    return;
                }
                return;
            case 1:
                ((n2.n0) this.f9770b).f(true);
                return;
            case 2:
                ((k8) this.f9770b).requestLayout();
                return;
            case 3:
                t8 t8Var = (t8) this.f9770b;
                fi.m3 m3Var = t8Var.f9796c;
                if (m3Var != null) {
                    m3Var.f(true);
                    t8Var.f9796c = null;
                }
                t8Var.b(false);
                return;
            case 4:
                r8 r8Var = (r8) this.f9770b;
                if (r8Var.f9730w) {
                    r8Var.E = true;
                    r8Var.F = System.currentTimeMillis();
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    r8Var.f9725e = new LinearGradient(0.0f, 0.0f, 40.0f, 0.0f, new int[]{16777215, 771751935, 771751935, 16777215}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, tileMode);
                    r8Var.f9726f = new LinearGradient(0.0f, 0.0f, 40.0f, 0.0f, new int[]{16777215, 553648127, 553648127, 16777215}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, tileMode);
                    r8Var.invalidate();
                    return;
                }
                return;
            case 5:
                p9 p9Var = ((y8) this.f9770b).f9992b;
                try {
                    d9 d9Var = p9Var.f9569s;
                    if (d9Var != null) {
                        if (p9Var.f9532b) {
                            org.telegram.messenger.g0.E2(d9Var);
                        } else {
                            p9Var.f9558n.removeView(d9Var);
                        }
                        p9Var.f9569s = null;
                        p9Var.v();
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 6:
                ((d9) this.f9770b).f8950r0.Q(true);
                return;
            case 7:
                ((y9) this.f9770b).c();
                return;
            case 8:
                ((di) this.f9770b).hide();
                return;
            case 9:
                ei.n nVar = (ei.n) this.f9770b;
                sp0 sp0Var = nVar.W;
                j6 j6Var = nVar.f10829a;
                if (j6Var == null) {
                    str = "";
                } else {
                    str = j6Var.E;
                }
                sp0Var.a(str);
                return;
            case 10:
                ab.q qVar = (ab.q) this.f9770b;
                ((Context) qVar.f990b).unregisterReceiver((f2.a) qVar.f991c);
                return;
            case 11:
                f2.a aVar = (f2.a) this.f9770b;
                if (aVar.f10889c.f989a) {
                    aVar.f10887a.f17771a.C1(3, false);
                    return;
                }
                return;
            case 12:
                ((fi.h) this.f9770b).f12120c.W = false;
                return;
            case 13:
                ((fi.l) this.f9770b).invalidateSelf();
                return;
            case 14:
                ((fi.d0) this.f9770b).f11773g = -1L;
                return;
            case 15:
                fi.m0 m0Var = (fi.m0) this.f9770b;
                tg.i iVar = m0Var.f12393b.H;
                if (iVar != null) {
                    iVar.b();
                }
                m0Var.f12393b.k();
                return;
            case 16:
                ((fi.u0) this.f9770b).a(false);
                return;
            case 17:
                cc.e();
                ug.w0 w0Var = new ug.w0((org.telegram.ui.ActionBar.f2) new bi.w4((fi.c5) this.f9770b), 14, false);
                w0Var.setOnDismissListener(new fi.d1(0));
                w0Var.show();
                return;
            case 18:
                ((fi.r1) this.f9770b).G();
                return;
            case 19:
                fi.y1 y1Var = (fi.y1) this.f9770b;
                ArrayList arrayList2 = y1Var.f13150w;
                ArrayList arrayList3 = y1Var.f13149s;
                fi.z1 z1Var = y1Var.N;
                fi.k2 k2Var = z1Var.f13241s;
                int i7 = fi.k2.f12251y1;
                ui b02 = ui.b0(k2Var.f28612a);
                String str2 = y1Var.H;
                if ("premium".equalsIgnoreCase(str2)) {
                    ArrayList i02 = b02.i0(7, false);
                    y1Var.f13152y = 0;
                    arrayList3.clear();
                    arrayList2.clear();
                    y1Var.D.clear();
                    y1Var.f13147n.clear();
                    y1Var.f13152y++;
                    arrayList3.add(null);
                    arrayList2.add(0L);
                    arrayList3.addAll(i02);
                    y1Var.f13152y = i02.size() + y1Var.f13152y;
                    y1Var.I = y1Var.H;
                    y1Var.f();
                    fi.m1.z1(z1Var.f13235b, 0, 0);
                    z1Var.f13238f.c(false);
                    z1Var.f13237e.n(false);
                    return;
                } else if (z1Var.f12881a == 1 && org.telegram.messenger.i6.d(y1Var.H)) {
                    TLRPC.TL_messages_getStickers tL_messages_getStickers = new TLRPC.TL_messages_getStickers();
                    tL_messages_getStickers.emoticon = y1Var.H;
                    tL_messages_getStickers.hash = 0L;
                    ConnectionsManager.getInstance(k2Var.f28612a).sendRequest(tL_messages_getStickers, new bi.j(12, y1Var, str2));
                    return;
                } else {
                    String[] G0 = org.telegram.messenger.g0.G0();
                    String[] strArr = y1Var.J;
                    if (strArr == null || !Arrays.equals(G0, strArr)) {
                        ui.b0(k2Var.f28612a).M(G0, false);
                    }
                    y1Var.J = G0;
                    b02.V(G0, y1Var.H, false, new a3.h(y1Var, str2, b02, 8), false, false, false, true, 50);
                    return;
                }
            case 20:
                fi.e2 e2Var = (fi.e2) ((ah.j) this.f9770b).f1080b;
                if (!e2Var.f11860n) {
                    e2Var.f11861r.setVisibility(8);
                    return;
                }
                return;
            case 21:
                fi.i2 i2Var = (fi.i2) ((fi.h2) this.f9770b).f12127b;
                ArrayList arrayList4 = i2Var.f12176o;
                if (!arrayList4.isEmpty()) {
                    i2Var.f12173l.e(true, 0.0f);
                    int i10 = i2Var.f12172k + 1;
                    i2Var.f12172k = i10;
                    if (i10 > arrayList4.size() - 1) {
                        i2Var.f12172k = 0;
                    }
                    ch.f0 f0Var = i2Var.f12171j;
                    f0Var.e((ch.o0) arrayList4.get(i2Var.f12172k));
                    i2Var.f12171j = i2Var.f12170i;
                    i2Var.f12170i = f0Var;
                    i2Var.f12177p.invalidate();
                    return;
                }
                return;
            case 22:
                FfmpegAudioWaveformLoader.b((FfmpegAudioWaveformLoader) this.f9770b);
                return;
            case 23:
                ((fi.b3) this.f9770b).b(null);
                return;
            case 24:
                ((fi.e3) this.f9770b).E();
                return;
            case 25:
                fi.o9 o9Var = (fi.o9) this.f9770b;
                if (o9Var.I) {
                    o9Var.I = false;
                    o9Var.invalidate();
                    return;
                }
                return;
            case 26:
                fi.g6 g6Var = (fi.g6) ((fi.f6) this.f9770b).f11984q;
                g6Var.Q = System.currentTimeMillis();
                g6Var.R = 0L;
                g6Var.f12094r0 = true;
                ((fi.s9) g6Var.f12071a).f12819a.J0.a(0L, true);
                g6Var.invalidate();
                return;
            case 27:
                fi.p pVar = (fi.p) this.f9770b;
                if (pVar.getParent() instanceof ViewGroup) {
                    ((ViewGroup) pVar.getParent()).removeView(pVar);
                    return;
                }
                return;
            case 28:
                fi.d dVar = (fi.d) this.f9770b;
                if (dVar != null) {
                    dVar.setLoading(false);
                    return;
                }
                return;
            default:
                ((fi.p8) ((ah.n) this.f9770b).f1095n).fullScroll(130);
                return;
        }
    }
}
