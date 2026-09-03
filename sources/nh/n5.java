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
import org.telegram.ui.Components.c90;
import org.telegram.ui.Components.ig0;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.nr0;
import org.telegram.ui.Components.us;
public final class n5 implements Runnable {
    public final int f15642a;
    public final Object f15643b;

    public n5(Object obj, int i10) {
        this.f15642a = i10;
        this.f15643b = obj;
    }

    @Override
    public final void run() {
        String str;
        boolean z4 = false;
        switch (this.f15642a) {
            case 0:
                r5 r5Var = (r5) this.f15643b;
                if (r5Var.isShowing()) {
                    r5Var.q(true);
                    return;
                }
                return;
            case 1:
                ((ph.q7) this.f15643b).run();
                return;
            case 2:
                ph.t0 t0Var = (ph.t0) this.f15643b;
                t0Var.b(t0Var.f42384b);
                t0Var.f42385c = false;
                return;
            case 3:
                x6 x6Var = (x6) this.f15643b;
                x6Var.c();
                x6Var.a(true);
                return;
            case 4:
                ((w5) this.f15643b).accept(null);
                return;
            case 5:
                ((h7) this.f15643b).onDetachedFromWindow();
                return;
            case 6:
                q7 q7Var = (q7) this.f15643b;
                ArrayList arrayList = q7Var.f15789c;
                if (arrayList != null) {
                    q7Var.f15787a.f15230w1 = arrayList;
                }
                d4 d4Var = q7Var.f15787a;
                long j10 = q7Var.f15788b;
                if (d4Var.f15238y1 != j10 || d4Var.f15230w1 != null) {
                    d4Var.f15238y1 = j10;
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
                ((c90) this.f15643b).d(true);
                return;
            case 8:
                ((d8) this.f15643b).requestLayout();
                return;
            case 9:
                m8 m8Var = (m8) this.f15643b;
                ph.f3 f3Var = m8Var.f15620c;
                if (f3Var != null) {
                    f3Var.e(true);
                    m8Var.f15620c = null;
                }
                m8Var.b(false);
                return;
            case 10:
                k8 k8Var = (k8) this.f15643b;
                if (k8Var.v) {
                    k8Var.B = true;
                    k8Var.C = System.currentTimeMillis();
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    k8Var.e = new LinearGradient(0.0f, 0.0f, 40.0f, 0.0f, new int[]{16777215, 771751935, 771751935, 16777215}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, tileMode);
                    k8Var.f15531f = new LinearGradient(0.0f, 0.0f, 40.0f, 0.0f, new int[]{16777215, 553648127, 553648127, 16777215}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, tileMode);
                    k8Var.invalidate();
                    return;
                }
                return;
            case 11:
                i9 i9Var = ((r8) this.f15643b).f15833b;
                try {
                    w8 w8Var = i9Var.f15468s;
                    if (w8Var != null) {
                        if (i9Var.f15431b) {
                            AndroidUtilities.removeFromParent(w8Var);
                        } else {
                            i9Var.f15456n.removeView(w8Var);
                        }
                        i9Var.f15468s = null;
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 12:
                ((w8) this.f15643b).F0.K(true);
                return;
            case 13:
                ((r9) this.f15643b).c();
                return;
            case 14:
                o3.e eVar = (o3.e) this.f15643b;
                if (!eVar.f16231c) {
                    o3.j jVar = eVar.f16230b;
                    if (jVar != null) {
                        jVar.c(eVar.f16229a);
                    }
                    eVar.d.f16240x.remove(eVar);
                    eVar.f16231c = true;
                    return;
                }
                return;
            case 15:
                ((o3.b) this.f15643b).c(null);
                return;
            case 16:
                ((li) this.f15643b).hide();
                return;
            case 17:
                oh.r rVar = (oh.r) this.f15643b;
                nr0 nr0Var = rVar.T;
                d6 d6Var = rVar.f16581a;
                if (d6Var == null) {
                    str = "";
                } else {
                    str = d6Var.E;
                }
                nr0Var.a(str);
                return;
            case 18:
                TLParseException.lambda$doThrowOrLog$0((TLParseException) this.f15643b);
                return;
            case 19:
                org.telegram.ui.Components.voip.k0 k0Var = (org.telegram.ui.Components.voip.k0) this.f15643b;
                k0Var.M0 = null;
                k0Var.setVisibleParticipant(true);
                return;
            case 20:
                org.telegram.ui.Components.voip.g1 g1Var = (org.telegram.ui.Components.voip.g1) this.f15643b;
                g1Var.H = false;
                g1Var.o(false);
                g1Var.T = false;
                return;
            case 21:
                org.telegram.ui.Components.voip.g1 g1Var2 = (org.telegram.ui.Components.voip.g1) ((ig0) this.f15643b).f25705b;
                g1Var2.e.invalidate();
                if (!g1Var2.e.isInLayout()) {
                    g1Var2.e.requestLayout();
                    g1Var2.d.requestLayout();
                    g1Var2.f29612f.requestLayout();
                    return;
                }
                return;
            case 22:
                ((org.telegram.ui.Components.voip.f1) this.f15643b).f29599a.i(false);
                return;
            case 23:
                org.telegram.ui.Components.voip.h2 h2Var = (org.telegram.ui.Components.voip.h2) this.f15643b;
                h2Var.e = false;
                HashMap hashMap = h2Var.f29643a;
                ArrayList arrayList2 = h2Var.f29645c;
                ArrayList arrayList3 = h2Var.f29644b;
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
                            } else if (g2Var.f29619a.equals(((org.telegram.ui.Components.voip.g2) arrayList2.get(i11)).f29619a)) {
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
                        hashMap.put(g2Var2.f29619a, g2Var2);
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
                TextView[] textViewArr = ((org.telegram.ui.Components.voip.p2) this.f15643b).f29828a;
                TextView textView = textViewArr[0];
                textViewArr[0] = textViewArr[1];
                textViewArr[1] = textView;
                return;
            case 25:
                TextView[] textViewArr2 = ((org.telegram.ui.Components.voip.p2) ((us) this.f15643b).e).f29828a;
                TextView textView2 = textViewArr2[0];
                textViewArr2[0] = textViewArr2[1];
                textViewArr2[1] = textView2;
                return;
            case 26:
                org.telegram.ui.Components.voip.t2 t2Var = (org.telegram.ui.Components.voip.t2) this.f15643b;
                if (t2Var.getVisibility() == 0) {
                    t2Var.a();
                    return;
                }
                return;
            case 27:
                org.telegram.ui.Components.voip.x2 x2Var = (org.telegram.ui.Components.voip.x2) this.f15643b;
                x2Var.e = Bitmap.createBitmap(x2Var.getMeasuredWidth(), x2Var.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                new Canvas(x2Var.e).drawText(x2Var.d, x2Var.getMeasuredWidth() / 2, (int) ((x2Var.getMeasuredHeight() / 2) - ((x2Var.f30005a.ascent() + x2Var.f30005a.descent()) / 2.0f)), x2Var.f30005a);
                x2Var.postInvalidate();
                return;
            case 28:
                ((org.telegram.ui.web.k) this.f15643b).f39503w.V2.N(true);
                return;
            default:
                org.telegram.ui.web.i iVar = ((org.telegram.ui.web.o) this.f15643b).h.e;
                if (iVar != null) {
                    iVar.d();
                    return;
                }
                return;
        }
    }
}
