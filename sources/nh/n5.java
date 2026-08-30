package nh;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLParseException;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.b90;
import org.telegram.ui.Components.hg0;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.nr0;
import org.telegram.ui.Components.vs;
public final class n5 implements Runnable {
    public final int f15662a;
    public final Object f15663b;

    public n5(Object obj, int i10) {
        this.f15662a = i10;
        this.f15663b = obj;
    }

    @Override
    public final void run() {
        String str;
        boolean z4 = false;
        switch (this.f15662a) {
            case 0:
                r5 r5Var = (r5) this.f15663b;
                if (r5Var.isShowing()) {
                    r5Var.q(true);
                    return;
                }
                return;
            case 1:
                ((ph.r7) this.f15663b).run();
                return;
            case 2:
                ph.t0 t0Var = (ph.t0) this.f15663b;
                t0Var.b(t0Var.f42319b);
                t0Var.f42320c = false;
                return;
            case 3:
                x6 x6Var = (x6) this.f15663b;
                x6Var.c();
                x6Var.a(true);
                return;
            case 4:
                ((w5) this.f15663b).accept(null);
                return;
            case 5:
                ((h7) this.f15663b).onDetachedFromWindow();
                return;
            case 6:
                q7 q7Var = (q7) this.f15663b;
                ArrayList arrayList = q7Var.f15809c;
                if (arrayList != null) {
                    q7Var.f15807a.f15250w1 = arrayList;
                }
                d4 d4Var = q7Var.f15807a;
                long j10 = q7Var.f15808b;
                if (d4Var.f15258y1 != j10 || d4Var.f15250w1 != null) {
                    d4Var.f15258y1 = j10;
                    d4Var.j1();
                    d4Var.i1();
                    d4Var.f1(true);
                    TL_stories.PeerStories peerStories = d4Var.G0.N0;
                    if (peerStories != null) {
                        d4Var.P1.S(peerStories, true);
                        return;
                    }
                    t6 t6Var = d4Var.P1;
                    TL_stories.PeerStories y10 = t6Var.y(j10);
                    if (y10 == null) {
                        y10 = t6Var.z(j10);
                        z4 = true;
                    }
                    t6Var.S(y10, z4);
                    return;
                }
                return;
            case 7:
                ((b90) this.f15663b).d(true);
                return;
            case 8:
                ((d8) this.f15663b).requestLayout();
                return;
            case 9:
                m8 m8Var = (m8) this.f15663b;
                ph.f3 f3Var = m8Var.f15640c;
                if (f3Var != null) {
                    f3Var.e(true);
                    m8Var.f15640c = null;
                }
                m8Var.b(false);
                return;
            case 10:
                k8 k8Var = (k8) this.f15663b;
                if (k8Var.v) {
                    k8Var.B = true;
                    k8Var.C = System.currentTimeMillis();
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    k8Var.e = new LinearGradient(0.0f, 0.0f, 40.0f, 0.0f, new int[]{16777215, 771751935, 771751935, 16777215}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, tileMode);
                    k8Var.f15551f = new LinearGradient(0.0f, 0.0f, 40.0f, 0.0f, new int[]{16777215, 553648127, 553648127, 16777215}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, tileMode);
                    k8Var.invalidate();
                    return;
                }
                return;
            case 11:
                i9 i9Var = ((r8) this.f15663b).f15853b;
                try {
                    w8 w8Var = i9Var.f15488s;
                    if (w8Var != null) {
                        if (i9Var.f15451b) {
                            AndroidUtilities.removeFromParent(w8Var);
                        } else {
                            i9Var.f15476n.removeView(w8Var);
                        }
                        i9Var.f15488s = null;
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 12:
                ((w8) this.f15663b).F0.K(true);
                return;
            case 13:
                ((r9) this.f15663b).c();
                return;
            case 14:
                o3.d dVar = (o3.d) this.f15663b;
                if (!dVar.f16246c) {
                    o3.i iVar = dVar.f16245b;
                    if (iVar != null) {
                        iVar.c(dVar.f16244a);
                    }
                    dVar.d.f16255x.remove(dVar);
                    dVar.f16246c = true;
                    return;
                }
                return;
            case 15:
                ((o3.b) this.f15663b).c(null);
                return;
            case 16:
                ((li) this.f15663b).hide();
                return;
            case 17:
                oh.r rVar = (oh.r) this.f15663b;
                nr0 nr0Var = rVar.T;
                d6 d6Var = rVar.f16601a;
                if (d6Var == null) {
                    str = "";
                } else {
                    str = d6Var.E;
                }
                nr0Var.a(str);
                return;
            case 18:
                TLParseException.lambda$doThrowOrLog$0((TLParseException) this.f15663b);
                return;
            case 19:
                org.telegram.ui.Components.voip.k0 k0Var = (org.telegram.ui.Components.voip.k0) this.f15663b;
                k0Var.M0 = null;
                k0Var.setVisibleParticipant(true);
                return;
            case 20:
                org.telegram.ui.Components.voip.g1 g1Var = (org.telegram.ui.Components.voip.g1) this.f15663b;
                g1Var.H = false;
                g1Var.o(false);
                g1Var.T = false;
                return;
            case 21:
                org.telegram.ui.Components.voip.g1 g1Var2 = (org.telegram.ui.Components.voip.g1) ((hg0) this.f15663b).f25412b;
                g1Var2.e.invalidate();
                if (!g1Var2.e.isInLayout()) {
                    g1Var2.e.requestLayout();
                    g1Var2.d.requestLayout();
                    g1Var2.f29640f.requestLayout();
                    return;
                }
                return;
            case 22:
                ((org.telegram.ui.Components.voip.f1) this.f15663b).f29627a.i(false);
                return;
            case 23:
                org.telegram.ui.Components.voip.h2 h2Var = (org.telegram.ui.Components.voip.h2) this.f15663b;
                h2Var.e = false;
                HashMap hashMap = h2Var.f29671a;
                ArrayList arrayList2 = h2Var.f29673c;
                ArrayList arrayList3 = h2Var.f29672b;
                if (!arrayList3.isEmpty() || !arrayList2.isEmpty()) {
                    if (h2Var.getParent() != null) {
                        TransitionManager.beginDelayedTransition(h2Var, h2Var.d);
                    }
                    int i10 = 0;
                    while (i10 < arrayList3.size()) {
                        org.telegram.ui.Components.voip.g2 g2Var = (org.telegram.ui.Components.voip.g2) arrayList3.get(i10);
                        int i11 = 0;
                        while (true) {
                            if (i11 >= arrayList2.size()) {
                                break;
                            } else if (g2Var.f29647a.equals(((org.telegram.ui.Components.voip.g2) arrayList2.get(i11)).f29647a)) {
                                arrayList3.remove(i10);
                                arrayList2.remove(i11);
                                i10--;
                            } else {
                                i11++;
                            }
                        }
                        i10++;
                    }
                    for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                        h2Var.addView((View) arrayList3.get(i12), k7.b6.t(-2, -2, 1, 4, 0, 0, 4));
                    }
                    for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                        h2Var.removeView((View) arrayList2.get(i13));
                    }
                    hashMap.clear();
                    for (int i14 = 0; i14 < h2Var.getChildCount(); i14++) {
                        org.telegram.ui.Components.voip.g2 g2Var2 = (org.telegram.ui.Components.voip.g2) h2Var.getChildAt(i14);
                        hashMap.put(g2Var2.f29647a, g2Var2);
                    }
                    arrayList3.clear();
                    arrayList2.clear();
                    h2Var.e = true;
                    AndroidUtilities.runOnUIThread(new n5(h2Var, 23), 700L);
                    Runnable runnable = h2Var.h;
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
                return;
            case 24:
                TextView[] textViewArr = ((org.telegram.ui.Components.voip.p2) this.f15663b).f29856a;
                TextView textView = textViewArr[0];
                textViewArr[0] = textViewArr[1];
                textViewArr[1] = textView;
                return;
            case 25:
                TextView[] textViewArr2 = ((org.telegram.ui.Components.voip.p2) ((vs) this.f15663b).e).f29856a;
                TextView textView2 = textViewArr2[0];
                textViewArr2[0] = textViewArr2[1];
                textViewArr2[1] = textView2;
                return;
            case 26:
                org.telegram.ui.Components.voip.t2 t2Var = (org.telegram.ui.Components.voip.t2) this.f15663b;
                if (t2Var.getVisibility() == 0) {
                    t2Var.a();
                    return;
                }
                return;
            case 27:
                org.telegram.ui.Components.voip.x2 x2Var = (org.telegram.ui.Components.voip.x2) this.f15663b;
                x2Var.e = Bitmap.createBitmap(x2Var.getMeasuredWidth(), x2Var.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                new Canvas(x2Var.e).drawText(x2Var.d, x2Var.getMeasuredWidth() / 2, (int) ((x2Var.getMeasuredHeight() / 2) - ((x2Var.f30033a.ascent() + x2Var.f30033a.descent()) / 2.0f)), x2Var.f30033a);
                x2Var.postInvalidate();
                return;
            case 28:
                ((org.telegram.ui.web.k) this.f15663b).f39553w.V2.N(true);
                return;
            default:
                org.telegram.ui.web.i iVar2 = ((org.telegram.ui.web.o) this.f15663b).h.e;
                if (iVar2 != null) {
                    iVar2.d();
                    return;
                }
                return;
        }
    }
}
