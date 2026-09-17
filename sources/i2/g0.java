package i2;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Bundle;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.TextView;
import ii.a2;
import ii.h2;
import java.util.ArrayList;
import java.util.HashMap;
import m.p3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.tgnet.TLParseException;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Cells.g3;
import org.telegram.ui.Cells.i3;
import org.telegram.ui.Components.bu;
import org.telegram.ui.Components.voip.g2;
import org.telegram.ui.Components.voip.p2;
import org.telegram.ui.Components.voip.t2;
import org.telegram.ui.Components.voip.x2;
import org.telegram.ui.bo;
import org.telegram.ui.fg1;
import w7.x5;
public final class g0 implements Runnable {
    public final int f10715a;
    public final Object f10716b;

    public g0(o0 o0Var, j1 j1Var) {
        this.f10715a = 0;
        this.f10716b = j1Var;
    }

    @Override
    public final void run() {
        switch (this.f10715a) {
            case 0:
                try {
                    o0.g((j1) this.f10716b);
                    return;
                } catch (n e) {
                    e2.a.f("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e);
                    throw new RuntimeException(e);
                }
            case 1:
                g3 g3Var = ((i3) this.f10716b).f20239b;
                g3Var.requestFocus();
                AndroidUtilities.showKeyboard(g3Var);
                return;
            case 2:
                AndroidUtilities.showKeyboard(((ii.x) this.f10716b).f11750e0.f20239b);
                return;
            case 3:
                ((ii.e0) this.f10716b).invalidate();
                return;
            case 4:
                p3 p3Var = (p3) this.f10716b;
                p3Var.f14294c = null;
                p3Var.d = null;
                p3Var.e = null;
                p3Var.f14295f = null;
                p3Var.c(null);
                return;
            case 5:
                ((a2) this.f10716b).invalidateSelf();
                return;
            case 6:
                ((h2) this.f10716b).c();
                return;
            case 7:
                j2.f fVar = (j2.f) this.f10716b;
                j2.a l4 = fVar.l();
                fVar.q(l4, 1028, new j2.c(l4, 5));
                fVar.f12578f.d();
                return;
            case 8:
                k2.g0 g0Var = (k2.g0) this.f10716b;
                if (g0Var.f13277k0 >= 300000) {
                    g0Var.f13288t.p();
                    g0Var.f13277k0 = 0L;
                    return;
                }
                return;
            case 9:
                ((kh.b) this.f10716b).invalidate();
                return;
            case 10:
                lh.c cVar = (lh.c) this.f10716b;
                GroupCallMessage groupCallMessage = cVar.H;
                if (groupCallMessage != null) {
                    cVar.f14120a.a(groupCallMessage.isSendDelayed(), true);
                    cVar.f14121b.a(cVar.H.isSendError(), true);
                    return;
                }
                return;
            case 11:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, (i6) this.f10716b, Boolean.TRUE, null, -1);
                return;
            case 12:
                n2.d dVar = (n2.d) this.f10716b;
                if (!dVar.f14898c) {
                    n2.g gVar = dVar.f14897b;
                    if (gVar != null) {
                        gVar.a(dVar.f14896a);
                    }
                    dVar.d.f14907x.remove(dVar);
                    dVar.f14898c = true;
                    return;
                }
                return;
            case 13:
                ((n2.b) this.f10716b).a(null);
                return;
            case 14:
                fg1 fg1Var = (fg1) this.f10716b;
                if (fg1Var.getParentLayout() != null) {
                    fg1Var.H = true;
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", fg1Var.f33636a);
                    bo boVar = new bo(bundle);
                    boVar.f32336ja = true;
                    fg1Var.presentFragment(boVar);
                    return;
                }
                return;
            case 15:
                ni.d dVar2 = (ni.d) this.f10716b;
                AndroidUtilities.runOnUIThread(new ni.c(dVar2.f15262a, dVar2.f15263b, 1), 500L);
                return;
            case 16:
                ((a4.m) this.f10716b).w0();
                return;
            case 17:
                TLParseException.lambda$doThrowOrLog$0((TLParseException) this.f10716b);
                return;
            case 18:
                org.telegram.ui.Components.voip.m0 m0Var = (org.telegram.ui.Components.voip.m0) this.f10716b;
                m0Var.P0 = null;
                m0Var.setVisibleParticipant(true);
                return;
            case 19:
                org.telegram.ui.Components.voip.j1 j1Var = (org.telegram.ui.Components.voip.j1) this.f10716b;
                j1Var.K = false;
                j1Var.o(false);
                j1Var.W = false;
                return;
            case 20:
                org.telegram.ui.Components.voip.j1 j1Var2 = (org.telegram.ui.Components.voip.j1) ((lg.b) this.f10716b).f14051b;
                j1Var2.e.invalidate();
                if (!j1Var2.e.isInLayout()) {
                    j1Var2.e.requestLayout();
                    j1Var2.d.requestLayout();
                    j1Var2.f28987f.requestLayout();
                    return;
                }
                return;
            case 21:
                ((org.telegram.ui.Components.voip.i1) this.f10716b).f28968a.i(false);
                return;
            case 22:
                org.telegram.ui.Components.voip.h2 h2Var = (org.telegram.ui.Components.voip.h2) this.f10716b;
                h2Var.e = false;
                HashMap hashMap = h2Var.f28957a;
                ArrayList arrayList = h2Var.f28959c;
                ArrayList arrayList2 = h2Var.f28958b;
                if (!arrayList2.isEmpty() || !arrayList.isEmpty()) {
                    if (h2Var.getParent() != null) {
                        TransitionManager.beginDelayedTransition(h2Var, h2Var.d);
                    }
                    int i10 = 0;
                    while (i10 < arrayList2.size()) {
                        g2 g2Var = (g2) arrayList2.get(i10);
                        int i11 = 0;
                        while (true) {
                            if (i11 >= arrayList.size()) {
                                break;
                            } else if (g2Var.f28933a.equals(((g2) arrayList.get(i11)).f28933a)) {
                                arrayList2.remove(i10);
                                arrayList.remove(i11);
                                i10--;
                            } else {
                                i11++;
                            }
                        }
                        i10++;
                    }
                    for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                        h2Var.addView((View) arrayList2.get(i12), x5.t(-2, -2, 1, 4, 0, 0, 4));
                    }
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        h2Var.removeView((View) arrayList.get(i13));
                    }
                    hashMap.clear();
                    for (int i14 = 0; i14 < h2Var.getChildCount(); i14++) {
                        g2 g2Var2 = (g2) h2Var.getChildAt(i14);
                        hashMap.put(g2Var2.f28933a, g2Var2);
                    }
                    arrayList2.clear();
                    arrayList.clear();
                    h2Var.e = true;
                    AndroidUtilities.runOnUIThread(new g0(h2Var, 22), 700L);
                    Runnable runnable = h2Var.h;
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
                return;
            case 23:
                TextView[] textViewArr = ((p2) this.f10716b).f29138a;
                TextView textView = textViewArr[0];
                textViewArr[0] = textViewArr[1];
                textViewArr[1] = textView;
                return;
            case 24:
                TextView[] textViewArr2 = ((p2) ((gg.k0) this.f10716b).e).f29138a;
                TextView textView2 = textViewArr2[0];
                textViewArr2[0] = textViewArr2[1];
                textViewArr2[1] = textView2;
                return;
            case 25:
                t2 t2Var = (t2) this.f10716b;
                if (t2Var.getVisibility() == 0) {
                    t2Var.a();
                    return;
                }
                return;
            case 26:
                x2 x2Var = (x2) this.f10716b;
                x2Var.e = Bitmap.createBitmap(x2Var.getMeasuredWidth(), x2Var.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                new Canvas(x2Var.e).drawText(x2Var.d, x2Var.getMeasuredWidth() / 2, (int) ((x2Var.getMeasuredHeight() / 2) - ((x2Var.f29333a.ascent() + x2Var.f29333a.descent()) / 2.0f)), x2Var.f29333a);
                x2Var.postInvalidate();
                return;
            case 27:
                ((org.telegram.ui.web.k) this.f10716b).f38850w.Y2.N(true);
                return;
            case 28:
                org.telegram.ui.web.i iVar = ((org.telegram.ui.web.o) this.f10716b).h.f38892f;
                if (iVar != null) {
                    iVar.d();
                    return;
                }
                return;
            default:
                ((bu) this.f10716b).requestFocus();
                return;
        }
    }

    public g0(Object obj, int i10) {
        this.f10715a = i10;
        this.f10716b = obj;
    }
}
