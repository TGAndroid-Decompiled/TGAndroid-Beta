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
import m.r3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.tgnet.TLParseException;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.h3;
import org.telegram.ui.Cells.j3;
import org.telegram.ui.Components.uu;
import org.telegram.ui.Components.voip.h2;
import org.telegram.ui.Components.voip.q2;
import org.telegram.ui.Components.voip.u2;
import org.telegram.ui.Components.voip.y2;
import org.telegram.ui.eo;
import org.telegram.ui.hg1;
import w7.w5;
public final class h0 implements Runnable {
    public final int f11719a;
    public final Object f11720b;

    public h0(p0 p0Var, k1 k1Var) {
        this.f11719a = 0;
        this.f11720b = k1Var;
    }

    @Override
    public final void run() {
        switch (this.f11719a) {
            case 0:
                try {
                    p0.h((k1) this.f11720b);
                    return;
                } catch (n e7) {
                    e2.a.f("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e7);
                    throw new RuntimeException(e7);
                }
            case 1:
                h3 h3Var = ((j3) this.f11720b).f22081b;
                h3Var.requestFocus();
                AndroidUtilities.showKeyboard(h3Var);
                return;
            case 2:
                AndroidUtilities.showKeyboard(((ii.x) this.f11720b).f12792e0.f22081b);
                return;
            case 3:
                ((ii.e0) this.f11720b).invalidate();
                return;
            case 4:
                r3 r3Var = (r3) this.f11720b;
                r3Var.f15557c = null;
                r3Var.d = null;
                r3Var.f15558e = null;
                r3Var.f15559f = null;
                r3Var.e(null);
                return;
            case 5:
                ((b2) this.f11720b).invalidateSelf();
                return;
            case 6:
                ((i2) this.f11720b).c();
                return;
            case 7:
                j2.f fVar = (j2.f) this.f11720b;
                j2.a l4 = fVar.l();
                fVar.q(l4, 1028, new j2.c(l4, 3));
                fVar.f13691f.d();
                return;
            case 8:
                k2.d0 d0Var = (k2.d0) this.f11720b;
                if (d0Var.f14438j0 >= 300000) {
                    d0Var.f14449s.i();
                    d0Var.f14438j0 = 0L;
                    return;
                }
                return;
            case 9:
                ((kh.b) this.f11720b).invalidate();
                return;
            case 10:
                lh.c cVar = (lh.c) this.f11720b;
                GroupCallMessage groupCallMessage = cVar.H;
                if (groupCallMessage != null) {
                    cVar.f15330a.a(groupCallMessage.isSendDelayed(), true);
                    cVar.f15331b.a(cVar.H.isSendError(), true);
                    return;
                }
                return;
            case 11:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, (g6) this.f11720b, Boolean.TRUE, null, -1);
                return;
            case 12:
                n2.d dVar = (n2.d) this.f11720b;
                if (!dVar.f16249c) {
                    n2.g gVar = dVar.f16248b;
                    if (gVar != null) {
                        gVar.a(dVar.f16247a);
                    }
                    dVar.d.f16259x.remove(dVar);
                    dVar.f16249c = true;
                    return;
                }
                return;
            case 13:
                ((n2.b) this.f11720b).a(null);
                return;
            case 14:
                hg1 hg1Var = (hg1) this.f11720b;
                if (hg1Var.getParentLayout() != null) {
                    hg1Var.H = true;
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", hg1Var.f38376a);
                    eo eoVar = new eo(bundle);
                    eoVar.f37316ja = true;
                    hg1Var.presentFragment(eoVar);
                    return;
                }
                return;
            case 15:
                ((l2.g) this.f11720b).v0();
                return;
            case 16:
                oi.d dVar2 = (oi.d) this.f11720b;
                AndroidUtilities.runOnUIThread(new oi.c(dVar2.f16921a, dVar2.f16922b, 1), 500L);
                return;
            case 17:
                TLParseException.lambda$doThrowOrLog$0((TLParseException) this.f11720b);
                return;
            case 18:
                org.telegram.ui.Components.voip.n0 n0Var = (org.telegram.ui.Components.voip.n0) this.f11720b;
                n0Var.P0 = null;
                n0Var.setVisibleParticipant(true);
                return;
            case 19:
                org.telegram.ui.Components.voip.k1 k1Var = (org.telegram.ui.Components.voip.k1) this.f11720b;
                k1Var.K = false;
                k1Var.o(false);
                k1Var.W = false;
                return;
            case 20:
                org.telegram.ui.Components.voip.k1 k1Var2 = (org.telegram.ui.Components.voip.k1) ((lg.b) this.f11720b).f15253b;
                k1Var2.f31747e.invalidate();
                if (!k1Var2.f31747e.isInLayout()) {
                    k1Var2.f31747e.requestLayout();
                    k1Var2.d.requestLayout();
                    k1Var2.f31748f.requestLayout();
                    return;
                }
                return;
            case 21:
                ((org.telegram.ui.Components.voip.j1) this.f11720b).f31732a.i(false);
                return;
            case 22:
                org.telegram.ui.Components.voip.i2 i2Var = (org.telegram.ui.Components.voip.i2) this.f11720b;
                i2Var.f31717e = false;
                HashMap hashMap = i2Var.f31714a;
                ArrayList arrayList = i2Var.f31716c;
                ArrayList arrayList2 = i2Var.f31715b;
                if (!arrayList2.isEmpty() || !arrayList.isEmpty()) {
                    if (i2Var.getParent() != null) {
                        TransitionManager.beginDelayedTransition(i2Var, i2Var.d);
                    }
                    int i10 = 0;
                    while (i10 < arrayList2.size()) {
                        h2 h2Var = (h2) arrayList2.get(i10);
                        int i11 = 0;
                        while (true) {
                            if (i11 >= arrayList.size()) {
                                break;
                            } else if (h2Var.f31700a.equals(((h2) arrayList.get(i11)).f31700a)) {
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
                        i2Var.addView((View) arrayList2.get(i12), w5.t(-2, -2, 1, 4, 0, 0, 4));
                    }
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        i2Var.removeView((View) arrayList.get(i13));
                    }
                    hashMap.clear();
                    for (int i14 = 0; i14 < i2Var.getChildCount(); i14++) {
                        h2 h2Var2 = (h2) i2Var.getChildAt(i14);
                        hashMap.put(h2Var2.f31700a, h2Var2);
                    }
                    arrayList2.clear();
                    arrayList.clear();
                    i2Var.f31717e = true;
                    AndroidUtilities.runOnUIThread(new h0(i2Var, 22), 700L);
                    Runnable runnable = i2Var.h;
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
                return;
            case 23:
                TextView[] textViewArr = ((q2) this.f11720b).f31908a;
                TextView textView = textViewArr[0];
                textViewArr[0] = textViewArr[1];
                textViewArr[1] = textView;
                return;
            case 24:
                TextView[] textViewArr2 = ((q2) ((gg.j0) this.f11720b).f10663e).f31908a;
                TextView textView2 = textViewArr2[0];
                textViewArr2[0] = textViewArr2[1];
                textViewArr2[1] = textView2;
                return;
            case 25:
                u2 u2Var = (u2) this.f11720b;
                if (u2Var.getVisibility() == 0) {
                    u2Var.a();
                    return;
                }
                return;
            case 26:
                y2 y2Var = (y2) this.f11720b;
                y2Var.f32124e = Bitmap.createBitmap(y2Var.getMeasuredWidth(), y2Var.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                new Canvas(y2Var.f32124e).drawText(y2Var.d, y2Var.getMeasuredWidth() / 2, (int) ((y2Var.getMeasuredHeight() / 2) - ((y2Var.f32121a.ascent() + y2Var.f32121a.descent()) / 2.0f)), y2Var.f32121a);
                y2Var.postInvalidate();
                return;
            case 27:
                ((org.telegram.ui.web.k) this.f11720b).f43317w.W2.N(true);
                return;
            case 28:
                org.telegram.ui.web.i iVar = ((org.telegram.ui.web.n) this.f11720b).h.f43358e;
                if (iVar != null) {
                    iVar.d();
                    return;
                }
                return;
            default:
                ((uu) this.f11720b).requestFocus();
                return;
        }
    }

    public h0(Object obj, int i10) {
        this.f11719a = i10;
        this.f11720b = obj;
    }
}
