package i2;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Bundle;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.TextView;
import ii.b2;
import ii.i2;
import java.util.ArrayList;
import java.util.HashMap;
import m.q3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.tgnet.TLParseException;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Cells.h3;
import org.telegram.ui.Cells.j3;
import org.telegram.ui.Components.s60;
import org.telegram.ui.Components.voip.g2;
import org.telegram.ui.Components.voip.h2;
import org.telegram.ui.Components.voip.p2;
import org.telegram.ui.Components.voip.t2;
import org.telegram.ui.Components.voip.x2;
import org.telegram.ui.fg1;
import org.telegram.ui.zn;
import w7.x5;
public final class h0 implements Runnable {
    public final int f11721a;
    public final Object f11722b;

    public h0(p0 p0Var, k1 k1Var) {
        this.f11721a = 0;
        this.f11722b = k1Var;
    }

    @Override
    public final void run() {
        switch (this.f11721a) {
            case 0:
                try {
                    p0.f((k1) this.f11722b);
                    return;
                } catch (n e7) {
                    e2.a.f("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e7);
                    throw new RuntimeException(e7);
                }
            case 1:
                h3 h3Var = ((j3) this.f11722b).f22297b;
                h3Var.requestFocus();
                AndroidUtilities.showKeyboard(h3Var);
                return;
            case 2:
                AndroidUtilities.showKeyboard(((ii.x) this.f11722b).f12794e0.f22297b);
                return;
            case 3:
                ((ii.e0) this.f11722b).invalidate();
                return;
            case 4:
                q3 q3Var = (q3) this.f11722b;
                q3Var.f15797c = null;
                q3Var.d = null;
                q3Var.f15798e = null;
                q3Var.f15799f = null;
                q3Var.e(null);
                return;
            case 5:
                ((b2) this.f11722b).invalidateSelf();
                return;
            case 6:
                ((i2) this.f11722b).c();
                return;
            case 7:
                j2.f fVar = (j2.f) this.f11722b;
                j2.a l4 = fVar.l();
                fVar.q(l4, 1028, new j2.c(l4, 3));
                fVar.f13694f.d();
                return;
            case 8:
                k2.d0 d0Var = (k2.d0) this.f11722b;
                if (d0Var.f14441j0 >= 300000) {
                    d0Var.f14452s.d();
                    d0Var.f14441j0 = 0L;
                    return;
                }
                return;
            case 9:
                ((kh.b) this.f11722b).invalidate();
                return;
            case 10:
                s60 s60Var = (s60) ((m2.t) this.f11722b).f15972b;
                s60Var.f30688o0 = true;
                FileLog.d("RoundVideo camera flip first frame: elapsedMs=" + s60.k(s60Var));
                s60Var.s();
                return;
            case 11:
                lh.c cVar = (lh.c) this.f11722b;
                GroupCallMessage groupCallMessage = cVar.H;
                if (groupCallMessage != null) {
                    cVar.f15583a.a(groupCallMessage.isSendDelayed(), true);
                    cVar.f15584b.a(cVar.H.isSendError(), true);
                    return;
                }
                return;
            case 12:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, (h6) this.f11722b, Boolean.TRUE, null, -1);
                return;
            case 13:
                n2.d dVar = (n2.d) this.f11722b;
                if (!dVar.f16500c) {
                    n2.g gVar = dVar.f16499b;
                    if (gVar != null) {
                        gVar.a(dVar.f16498a);
                    }
                    dVar.d.f16510x.remove(dVar);
                    dVar.f16500c = true;
                    return;
                }
                return;
            case 14:
                ((n2.b) this.f11722b).a(null);
                return;
            case 15:
                fg1 fg1Var = (fg1) this.f11722b;
                if (fg1Var.getParentLayout() != null) {
                    fg1Var.H = true;
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", fg1Var.f37556a);
                    zn znVar = new zn(bundle);
                    znVar.f44821ja = true;
                    fg1Var.presentFragment(znVar);
                    return;
                }
                return;
            case 16:
                ((k2.g0) this.f11722b).M0();
                return;
            case 17:
                oi.d dVar2 = (oi.d) this.f11722b;
                AndroidUtilities.runOnUIThread(new oi.c(dVar2.f17169a, dVar2.f17170b, 1), 500L);
                return;
            case 18:
                TLParseException.lambda$doThrowOrLog$0((TLParseException) this.f11722b);
                return;
            case 19:
                org.telegram.ui.Components.voip.m0 m0Var = (org.telegram.ui.Components.voip.m0) this.f11722b;
                m0Var.P0 = null;
                m0Var.setVisibleParticipant(true);
                return;
            case 20:
                org.telegram.ui.Components.voip.j1 j1Var = (org.telegram.ui.Components.voip.j1) this.f11722b;
                j1Var.K = false;
                j1Var.o(false);
                j1Var.W = false;
                return;
            case 21:
                org.telegram.ui.Components.voip.j1 j1Var2 = (org.telegram.ui.Components.voip.j1) ((lg.b) this.f11722b).f15506b;
                j1Var2.f32002e.invalidate();
                if (!j1Var2.f32002e.isInLayout()) {
                    j1Var2.f32002e.requestLayout();
                    j1Var2.d.requestLayout();
                    j1Var2.f32003f.requestLayout();
                    return;
                }
                return;
            case 22:
                ((org.telegram.ui.Components.voip.i1) this.f11722b).f31982a.i(false);
                return;
            case 23:
                h2 h2Var = (h2) this.f11722b;
                h2Var.f31973e = false;
                HashMap hashMap = h2Var.f31970a;
                ArrayList arrayList = h2Var.f31972c;
                ArrayList arrayList2 = h2Var.f31971b;
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
                            } else if (g2Var.f31944a.equals(((g2) arrayList.get(i11)).f31944a)) {
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
                        hashMap.put(g2Var2.f31944a, g2Var2);
                    }
                    arrayList2.clear();
                    arrayList.clear();
                    h2Var.f31973e = true;
                    AndroidUtilities.runOnUIThread(new h0(h2Var, 23), 700L);
                    Runnable runnable = h2Var.h;
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
                return;
            case 24:
                TextView[] textViewArr = ((p2) this.f11722b).f32163a;
                TextView textView = textViewArr[0];
                textViewArr[0] = textViewArr[1];
                textViewArr[1] = textView;
                return;
            case 25:
                TextView[] textViewArr2 = ((p2) ((gg.j0) this.f11722b).f10665e).f32163a;
                TextView textView2 = textViewArr2[0];
                textViewArr2[0] = textViewArr2[1];
                textViewArr2[1] = textView2;
                return;
            case 26:
                t2 t2Var = (t2) this.f11722b;
                if (t2Var.getVisibility() == 0) {
                    t2Var.a();
                    return;
                }
                return;
            case 27:
                x2 x2Var = (x2) this.f11722b;
                x2Var.f32379e = Bitmap.createBitmap(x2Var.getMeasuredWidth(), x2Var.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                new Canvas(x2Var.f32379e).drawText(x2Var.d, x2Var.getMeasuredWidth() / 2, (int) ((x2Var.getMeasuredHeight() / 2) - ((x2Var.f32376a.ascent() + x2Var.f32376a.descent()) / 2.0f)), x2Var.f32376a);
                x2Var.postInvalidate();
                return;
            case 28:
                ((org.telegram.ui.web.k) this.f11722b).f43372w.W2.N(true);
                return;
            default:
                org.telegram.ui.web.i iVar = ((org.telegram.ui.web.n) this.f11722b).h.f43413e;
                if (iVar != null) {
                    iVar.d();
                    return;
                }
                return;
        }
    }

    public h0(Object obj, int i10) {
        this.f11721a = i10;
        this.f11722b = obj;
    }
}
