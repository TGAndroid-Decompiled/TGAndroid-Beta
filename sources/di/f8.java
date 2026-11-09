package di;

import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.view.ViewGroup;
import fi.ua;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.ui;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.di;
import org.telegram.ui.Components.tp0;
import org.telegram.ui.Stories.recorder.FfmpegAudioWaveformLoader;
public final class f8 implements Runnable {
    public final int f8995a;
    public final Object f8996b;

    public f8(Object obj, int i7) {
        this.f8995a = i7;
        this.f8996b = obj;
    }

    @Override
    public final void run() {
        String str;
        switch (this.f8995a) {
            case 0:
                ((n2.n0) this.f8996b).f(true);
                return;
            case 1:
                ((l8) this.f8996b).requestLayout();
                return;
            case 2:
                u8 u8Var = (u8) this.f8996b;
                fi.m3 m3Var = u8Var.f9838c;
                if (m3Var != null) {
                    m3Var.f(true);
                    u8Var.f9838c = null;
                }
                u8Var.b(false);
                return;
            case 3:
                s8 s8Var = (s8) this.f8996b;
                if (s8Var.f9761w) {
                    s8Var.E = true;
                    s8Var.F = System.currentTimeMillis();
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    s8Var.f9756e = new LinearGradient(0.0f, 0.0f, 40.0f, 0.0f, new int[]{16777215, 771751935, 771751935, 16777215}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, tileMode);
                    s8Var.f9757f = new LinearGradient(0.0f, 0.0f, 40.0f, 0.0f, new int[]{16777215, 553648127, 553648127, 16777215}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, tileMode);
                    s8Var.invalidate();
                    return;
                }
                return;
            case 4:
                q9 q9Var = ((z8) this.f8996b).f10019b;
                try {
                    e9 e9Var = q9Var.f9634s;
                    if (e9Var != null) {
                        if (q9Var.f9597b) {
                            org.telegram.messenger.g0.E2(e9Var);
                        } else {
                            q9Var.f9623n.removeView(e9Var);
                        }
                        q9Var.f9634s = null;
                        q9Var.v();
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 5:
                ((e9) this.f8996b).f8975r0.Q(true);
                return;
            case 6:
                ((z9) this.f8996b).c();
                return;
            case 7:
                ((di) this.f8996b).hide();
                return;
            case 8:
                ei.n nVar = (ei.n) this.f8996b;
                tp0 tp0Var = nVar.W;
                k6 k6Var = nVar.f10829a;
                if (k6Var == null) {
                    str = "";
                } else {
                    str = k6Var.E;
                }
                tp0Var.a(str);
                return;
            case 9:
                ab.q qVar = (ab.q) this.f8996b;
                ((Context) qVar.f990b).unregisterReceiver((f2.a) qVar.f991c);
                return;
            case 10:
                f2.a aVar = (f2.a) this.f8996b;
                if (aVar.f10889c.f989a) {
                    aVar.f10887a.f17772a.C1(3, false);
                    return;
                }
                return;
            case 11:
                ((fi.h) this.f8996b).f12120c.W = false;
                return;
            case 12:
                ((fi.l) this.f8996b).invalidateSelf();
                return;
            case 13:
                ((fi.d0) this.f8996b).f11773g = -1L;
                return;
            case 14:
                fi.m0 m0Var = (fi.m0) this.f8996b;
                tg.i iVar = m0Var.f12394b.H;
                if (iVar != null) {
                    iVar.b();
                }
                m0Var.f12394b.k();
                return;
            case 15:
                ((fi.u0) this.f8996b).a(false);
                return;
            case 16:
                cc.e();
                ug.w0 w0Var = new ug.w0((org.telegram.ui.ActionBar.f2) new bi.w4((fi.c5) this.f8996b), 14, false);
                w0Var.setOnDismissListener(new fi.d1(0));
                w0Var.show();
                return;
            case 17:
                ((fi.r1) this.f8996b).G();
                return;
            case 18:
                fi.y1 y1Var = (fi.y1) this.f8996b;
                ArrayList arrayList = y1Var.f13150w;
                ArrayList arrayList2 = y1Var.f13149s;
                fi.z1 z1Var = y1Var.N;
                fi.k2 k2Var = z1Var.f13241s;
                int i7 = fi.k2.f12251y1;
                ui b02 = ui.b0(k2Var.f28621a);
                String str2 = y1Var.H;
                if ("premium".equalsIgnoreCase(str2)) {
                    ArrayList i02 = b02.i0(7, false);
                    y1Var.f13152y = 0;
                    arrayList2.clear();
                    arrayList.clear();
                    y1Var.D.clear();
                    y1Var.f13147n.clear();
                    y1Var.f13152y++;
                    arrayList2.add(null);
                    arrayList.add(0L);
                    arrayList2.addAll(i02);
                    y1Var.f13152y = i02.size() + y1Var.f13152y;
                    y1Var.I = y1Var.H;
                    y1Var.f();
                    fi.m1.z1(z1Var.f13235b, 0, 0);
                    z1Var.f13238f.c(false);
                    z1Var.f13237e.n(false);
                    return;
                } else if (z1Var.f12882a == 1 && org.telegram.messenger.i6.d(y1Var.H)) {
                    TLRPC.TL_messages_getStickers tL_messages_getStickers = new TLRPC.TL_messages_getStickers();
                    tL_messages_getStickers.emoticon = y1Var.H;
                    tL_messages_getStickers.hash = 0L;
                    ConnectionsManager.getInstance(k2Var.f28621a).sendRequest(tL_messages_getStickers, new bi.j(12, y1Var, str2));
                    return;
                } else {
                    String[] G0 = org.telegram.messenger.g0.G0();
                    String[] strArr = y1Var.J;
                    if (strArr == null || !Arrays.equals(G0, strArr)) {
                        ui.b0(k2Var.f28621a).M(G0, false);
                    }
                    y1Var.J = G0;
                    b02.V(G0, y1Var.H, false, new a3.h(y1Var, str2, b02, 8), false, false, false, true, 50);
                    return;
                }
            case 19:
                fi.e2 e2Var = (fi.e2) ((ah.j) this.f8996b).f1080b;
                if (!e2Var.f11860n) {
                    e2Var.f11861r.setVisibility(8);
                    return;
                }
                return;
            case 20:
                fi.i2 i2Var = (fi.i2) ((fi.h2) this.f8996b).f12127b;
                ArrayList arrayList3 = i2Var.f12179o;
                if (!arrayList3.isEmpty()) {
                    i2Var.f12176l.e(true, 0.0f);
                    int i10 = i2Var.f12175k + 1;
                    i2Var.f12175k = i10;
                    if (i10 > arrayList3.size() - 1) {
                        i2Var.f12175k = 0;
                    }
                    ch.f0 f0Var = i2Var.f12174j;
                    f0Var.e((ch.o0) arrayList3.get(i2Var.f12175k));
                    i2Var.f12174j = i2Var.f12173i;
                    i2Var.f12173i = f0Var;
                    i2Var.f12180p.invalidate();
                    return;
                }
                return;
            case 21:
                FfmpegAudioWaveformLoader.b((FfmpegAudioWaveformLoader) this.f8996b);
                return;
            case 22:
                ((fi.b3) this.f8996b).b(null);
                return;
            case 23:
                ((fi.e3) this.f8996b).E();
                return;
            case 24:
                fi.n9 n9Var = (fi.n9) this.f8996b;
                if (n9Var.I) {
                    n9Var.I = false;
                    n9Var.invalidate();
                    return;
                }
                return;
            case 25:
                fi.g6 g6Var = (fi.g6) ((fi.f6) this.f8996b).f11984q;
                g6Var.Q = System.currentTimeMillis();
                g6Var.R = 0L;
                g6Var.f12094r0 = true;
                ((fi.r9) g6Var.f12071a).f12758a.J0.a(0L, true);
                g6Var.invalidate();
                return;
            case 26:
                fi.p pVar = (fi.p) this.f8996b;
                if (pVar.getParent() instanceof ViewGroup) {
                    ((ViewGroup) pVar.getParent()).removeView(pVar);
                    return;
                }
                return;
            case 27:
                fi.d dVar = (fi.d) this.f8996b;
                if (dVar != null) {
                    dVar.setLoading(false);
                    return;
                }
                return;
            case 28:
                ((fi.p8) ((ah.n) this.f8996b).f1095n).fullScroll(130);
                return;
            default:
                ua uaVar = (ua) this.f8996b;
                uaVar.f12902g0.onTouchEvent(org.telegram.messenger.g0.R());
                uaVar.f12901f0.n0(org.telegram.messenger.g0.R());
                return;
        }
    }
}
