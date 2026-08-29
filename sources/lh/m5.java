package lh;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import java.util.ArrayList;
import java.util.Arrays;
import nh.y9;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.fr0;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.ni;
import org.telegram.ui.Components.v80;
import org.telegram.ui.Stories.recorder.FfmpegAudioWaveformLoader;
public final class m5 implements Runnable {
    public final int f15926a;
    public final Object f15927b;

    public m5(Object obj, int i10) {
        this.f15926a = i10;
        this.f15927b = obj;
    }

    @Override
    public final void run() {
        String str;
        boolean z10 = false;
        switch (this.f15926a) {
            case 0:
                q5 q5Var = (q5) this.f15927b;
                if (q5Var.isShowing()) {
                    q5Var.q(true);
                    return;
                }
                return;
            case 1:
                ((nh.o8) this.f15927b).run();
                return;
            case 2:
                nh.a1 a1Var = (nh.a1) this.f15927b;
                a1Var.b(a1Var.f17373b);
                a1Var.f17374c = false;
                return;
            case 3:
                w6 w6Var = (w6) this.f15927b;
                w6Var.c();
                w6Var.a(true);
                return;
            case 4:
                ((v5) this.f15927b).accept(null);
                return;
            case 5:
                ((g7) this.f15927b).onDetachedFromWindow();
                return;
            case 6:
                q7 q7Var = (q7) this.f15927b;
                ArrayList arrayList = q7Var.f16134c;
                if (arrayList != null) {
                    q7Var.f16132a.f15532v1 = arrayList;
                }
                d4 d4Var = q7Var.f16132a;
                long j10 = q7Var.f16133b;
                if (d4Var.f15540x1 != j10 || d4Var.f15532v1 != null) {
                    d4Var.f15540x1 = j10;
                    d4Var.j1();
                    d4Var.i1();
                    d4Var.f1(true);
                    TL_stories.PeerStories peerStories = d4Var.F0.M0;
                    if (peerStories != null) {
                        d4Var.O1.S(peerStories, true);
                        return;
                    }
                    s6 s6Var = d4Var.O1;
                    TL_stories.PeerStories y8 = s6Var.y(j10);
                    if (y8 == null) {
                        y8 = s6Var.z(j10);
                        z10 = true;
                    }
                    s6Var.S(y8, z10);
                    return;
                }
                return;
            case 7:
                ((v80) this.f15927b).d(true);
                return;
            case 8:
                ((d8) this.f15927b).requestLayout();
                return;
            case 9:
                m8 m8Var = (m8) this.f15927b;
                nh.t3 t3Var = m8Var.f15935c;
                if (t3Var != null) {
                    t3Var.e(true);
                    m8Var.f15935c = null;
                }
                m8Var.b(false);
                return;
            case 10:
                k8 k8Var = (k8) this.f15927b;
                if (k8Var.v) {
                    k8Var.A = true;
                    k8Var.B = System.currentTimeMillis();
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    k8Var.f15859e = new LinearGradient(0.0f, 0.0f, 40.0f, 0.0f, new int[]{16777215, 771751935, 771751935, 16777215}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, tileMode);
                    k8Var.f15860f = new LinearGradient(0.0f, 0.0f, 40.0f, 0.0f, new int[]{16777215, 553648127, 553648127, 16777215}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, tileMode);
                    k8Var.invalidate();
                    return;
                }
                return;
            case 11:
                i9 i9Var = ((r8) this.f15927b).f16187b;
                try {
                    w8 w8Var = i9Var.f15783s;
                    if (w8Var != null) {
                        if (i9Var.f15745b) {
                            AndroidUtilities.removeFromParent(w8Var);
                        } else {
                            i9Var.f15771n.removeView(w8Var);
                        }
                        i9Var.f15783s = null;
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 12:
                ((w8) this.f15927b).E0.K(true);
                return;
            case 13:
                ((r9) this.f15927b).c();
                return;
            case 14:
                ((ni) this.f15927b).hide();
                return;
            case 15:
                mh.r rVar = (mh.r) this.f15927b;
                fr0 fr0Var = rVar.S;
                c6 c6Var = rVar.f17041a;
                if (c6Var == null) {
                    str = "";
                } else {
                    str = c6Var.E;
                }
                fr0Var.a(str);
                return;
            case 16:
                ((nh.h) this.f15927b).f17824c.S = false;
                return;
            case 17:
                ((nh.l) this.f15927b).invalidateSelf();
                return;
            case 18:
                ((nh.d0) this.f15927b).f17509g = -1L;
                return;
            case 19:
                nh.m0 m0Var = (nh.m0) this.f15927b;
                bg.j jVar = m0Var.f18104b.D;
                if (jVar != null) {
                    jVar.b();
                }
                m0Var.f18104b.k();
                return;
            case 20:
                ((nh.v0) this.f15927b).a(false);
                return;
            case 21:
                mc.e();
                cg.p1 p1Var = new cg.p1((org.telegram.ui.ActionBar.o2) new cg.z1((nh.c5) this.f15927b), 14, false);
                p1Var.setOnDismissListener(new bg.f0(1));
                p1Var.show();
                return;
            case 22:
                ((nh.r1) this.f15927b).G();
                return;
            case 23:
                nh.x1 x1Var = (nh.x1) this.f15927b;
                ArrayList arrayList2 = x1Var.v;
                ArrayList arrayList3 = x1Var.f18819s;
                nh.y1 y1Var = x1Var.J;
                nh.k2 k2Var = y1Var.f18859s;
                MediaDataController mediaDataController = MediaDataController.getInstance(nh.k2.T(k2Var));
                String str2 = x1Var.D;
                if ("premium".equalsIgnoreCase(str2)) {
                    ArrayList<TLRPC.Document> recentStickers = mediaDataController.getRecentStickers(7);
                    x1Var.f18821x = 0;
                    arrayList3.clear();
                    arrayList2.clear();
                    x1Var.f18822y.clear();
                    x1Var.f18817n.clear();
                    x1Var.f18821x++;
                    arrayList3.add(null);
                    arrayList2.add(0L);
                    arrayList3.addAll(recentStickers);
                    x1Var.f18821x = recentStickers.size() + x1Var.f18821x;
                    x1Var.E = x1Var.D;
                    x1Var.l();
                    nh.n1.w1(y1Var.f18853b, 0, 0);
                    y1Var.f18856f.c(false);
                    y1Var.f18855e.n(false);
                    return;
                } else if (y1Var.f18712a == 1 && Emoji.fullyConsistsOfEmojis(x1Var.D)) {
                    TLRPC.TL_messages_getStickers tL_messages_getStickers = new TLRPC.TL_messages_getStickers();
                    tL_messages_getStickers.emoticon = x1Var.D;
                    tL_messages_getStickers.hash = 0L;
                    ConnectionsManager.getInstance(nh.k2.V(k2Var)).sendRequest(tL_messages_getStickers, new bg.h3(16, x1Var, str2));
                    return;
                } else {
                    String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                    String[] strArr = x1Var.F;
                    if (strArr == null || !Arrays.equals(currentKeyboardLanguage, strArr)) {
                        MediaDataController.getInstance(nh.k2.W(k2Var)).fetchNewEmojiKeywords(currentKeyboardLanguage);
                    }
                    x1Var.F = currentKeyboardLanguage;
                    mediaDataController.getEmojiSuggestions(currentKeyboardLanguage, x1Var.D, false, new androidx.car.app.utils.a(11, x1Var, mediaDataController, str2), null, false, false, false, true, 50, false);
                    return;
                }
            case 24:
                nh.d2 d2Var = (nh.d2) ((bh.c) this.f15927b).f2649b;
                if (!d2Var.h) {
                    d2Var.f17525n.setVisibility(8);
                    return;
                }
                return;
            case 25:
                nh.h2 h2Var = (nh.h2) ((nh.g2) this.f15927b).f17691b;
                ArrayList arrayList4 = h2Var.f17836o;
                if (!arrayList4.isEmpty()) {
                    h2Var.f17833l.d(0.0f, true);
                    int i10 = h2Var.f17832k + 1;
                    h2Var.f17832k = i10;
                    if (i10 > arrayList4.size() - 1) {
                        h2Var.f17832k = 0;
                    }
                    kg.h0 h0Var = h2Var.f17831j;
                    h0Var.e((kg.q0) arrayList4.get(h2Var.f17832k));
                    h2Var.f17831j = h2Var.f17830i;
                    h2Var.f17830i = h0Var;
                    h2Var.f17837p.invalidate();
                    return;
                }
                return;
            case 26:
                FfmpegAudioWaveformLoader.b((FfmpegAudioWaveformLoader) this.f15927b);
                return;
            case 27:
                ((nh.j3) this.f15927b).b(null);
                return;
            case 28:
                ((nh.m3) this.f15927b).E();
                return;
            default:
                y9 y9Var = (y9) this.f15927b;
                if (y9Var.E) {
                    y9Var.E = false;
                    y9Var.invalidate();
                    return;
                }
                return;
        }
    }
}
