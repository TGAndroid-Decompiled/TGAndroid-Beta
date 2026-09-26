package i2;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Bundle;
import android.transition.TransitionManager;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.TextView;
import ii.b2;
import ii.i2;
import java.util.ArrayList;
import java.util.HashMap;
import m.p3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.tgnet.TLParseException;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.h3;
import org.telegram.ui.Cells.j3;
import org.telegram.ui.Components.c60;
import org.telegram.ui.Components.voip.h2;
import org.telegram.ui.Components.voip.q2;
import org.telegram.ui.Components.voip.u2;
import org.telegram.ui.Components.voip.y2;
import org.telegram.ui.il;
import org.telegram.ui.wf1;
import org.telegram.ui.wn;
import w7.y5;
public final class h0 implements Runnable {
    public final int f10709a;
    public final Object f10710b;

    public h0(p0 p0Var, k1 k1Var) {
        this.f10709a = 0;
        this.f10710b = k1Var;
    }

    @Override
    public final void run() {
        switch (this.f10709a) {
            case 0:
                try {
                    p0.g((k1) this.f10710b);
                    return;
                } catch (n e) {
                    e2.a.f("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e);
                    throw new RuntimeException(e);
                }
            case 1:
                h3 h3Var = ((j3) this.f10710b).f20491b;
                h3Var.requestFocus();
                AndroidUtilities.showKeyboard(h3Var);
                return;
            case 2:
                AndroidUtilities.showKeyboard(((ii.x) this.f10710b).f11711e0.f20491b);
                return;
            case 3:
                ((ii.e0) this.f10710b).invalidate();
                return;
            case 4:
                p3 p3Var = (p3) this.f10710b;
                p3Var.f14525c = null;
                p3Var.d = null;
                p3Var.e = null;
                p3Var.f14526f = null;
                p3Var.c(null);
                return;
            case 5:
                ((b2) this.f10710b).invalidateSelf();
                return;
            case 6:
                ((i2) this.f10710b).c();
                return;
            case 7:
                j2.f fVar = (j2.f) this.f10710b;
                j2.a l4 = fVar.l();
                fVar.q(l4, 1028, new j2.c(l4, 4));
                fVar.f12567f.d();
                return;
            case 8:
                k2.e0 e0Var = (k2.e0) this.f10710b;
                if (e0Var.f13255k0 >= 300000) {
                    e0Var.f13266t.o();
                    e0Var.f13255k0 = 0L;
                    return;
                }
                return;
            case 9:
                ((kh.b) this.f10710b).invalidate();
                return;
            case 10:
                c60 c60Var = (c60) ((l.d) this.f10710b).f13924a;
                il ilVar = c60Var.E;
                if (c60Var.f23230l0) {
                    c60Var.f23230l0 = false;
                    ilVar.animate().cancel();
                    ilVar.animate().alpha(0.0f).setDuration(100L).setInterpolator(new DecelerateInterpolator()).start();
                    return;
                }
                return;
            case 11:
                lh.c cVar = (lh.c) this.f10710b;
                GroupCallMessage groupCallMessage = cVar.H;
                if (groupCallMessage != null) {
                    cVar.f14333a.a(groupCallMessage.isSendDelayed(), true);
                    cVar.f14334b.a(cVar.H.isSendError(), true);
                    return;
                }
                return;
            case 12:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, (g6) this.f10710b, Boolean.TRUE, null, -1);
                return;
            case 13:
                n2.d dVar = (n2.d) this.f10710b;
                if (!dVar.f15114c) {
                    n2.h hVar = dVar.f15113b;
                    if (hVar != null) {
                        hVar.a(dVar.f15112a);
                    }
                    dVar.d.f15125x.remove(dVar);
                    dVar.f15114c = true;
                    return;
                }
                return;
            case 14:
                ((n2.b) this.f10710b).a(null);
                return;
            case 15:
                wf1 wf1Var = (wf1) this.f10710b;
                if (wf1Var.getParentLayout() != null) {
                    wf1Var.H = true;
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", wf1Var.f39307a);
                    wn wnVar = new wn(bundle);
                    wnVar.f39528ja = true;
                    wf1Var.presentFragment(wnVar);
                    return;
                }
                return;
            case 16:
                ((ka.c) this.f10710b).Z();
                return;
            case 17:
                oi.d dVar2 = (oi.d) this.f10710b;
                AndroidUtilities.runOnUIThread(new oi.c(dVar2.f15754a, dVar2.f15755b, 1), 500L);
                return;
            case 18:
                TLParseException.lambda$doThrowOrLog$0((TLParseException) this.f10710b);
                return;
            case 19:
                org.telegram.ui.Components.voip.m0 m0Var = (org.telegram.ui.Components.voip.m0) this.f10710b;
                m0Var.P0 = null;
                m0Var.setVisibleParticipant(true);
                return;
            case 20:
                org.telegram.ui.Components.voip.k1 k1Var = (org.telegram.ui.Components.voip.k1) this.f10710b;
                k1Var.K = false;
                k1Var.o(false);
                k1Var.W = false;
                return;
            case 21:
                org.telegram.ui.Components.voip.k1 k1Var2 = (org.telegram.ui.Components.voip.k1) ((lg.b) this.f10710b).f14264b;
                k1Var2.e.invalidate();
                if (!k1Var2.e.isInLayout()) {
                    k1Var2.e.requestLayout();
                    k1Var2.d.requestLayout();
                    k1Var2.f29342f.requestLayout();
                    return;
                }
                return;
            case 22:
                ((org.telegram.ui.Components.voip.j1) this.f10710b).f29326a.i(false);
                return;
            case 23:
                org.telegram.ui.Components.voip.i2 i2Var = (org.telegram.ui.Components.voip.i2) this.f10710b;
                i2Var.e = false;
                HashMap hashMap = i2Var.f29309a;
                ArrayList arrayList = i2Var.f29311c;
                ArrayList arrayList2 = i2Var.f29310b;
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
                            } else if (h2Var.f29297a.equals(((h2) arrayList.get(i11)).f29297a)) {
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
                        i2Var.addView((View) arrayList2.get(i12), y5.t(-2, -2, 1, 4, 0, 0, 4));
                    }
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        i2Var.removeView((View) arrayList.get(i13));
                    }
                    hashMap.clear();
                    for (int i14 = 0; i14 < i2Var.getChildCount(); i14++) {
                        h2 h2Var2 = (h2) i2Var.getChildAt(i14);
                        hashMap.put(h2Var2.f29297a, h2Var2);
                    }
                    arrayList2.clear();
                    arrayList.clear();
                    i2Var.e = true;
                    AndroidUtilities.runOnUIThread(new h0(i2Var, 23), 700L);
                    Runnable runnable = i2Var.h;
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
                return;
            case 24:
                TextView[] textViewArr = ((q2) this.f10710b).f29490a;
                TextView textView = textViewArr[0];
                textViewArr[0] = textViewArr[1];
                textViewArr[1] = textView;
                return;
            case 25:
                TextView[] textViewArr2 = ((q2) ((gg.k0) this.f10710b).e).f29490a;
                TextView textView2 = textViewArr2[0];
                textViewArr2[0] = textViewArr2[1];
                textViewArr2[1] = textView2;
                return;
            case 26:
                u2 u2Var = (u2) this.f10710b;
                if (u2Var.getVisibility() == 0) {
                    u2Var.a();
                    return;
                }
                return;
            case 27:
                y2 y2Var = (y2) this.f10710b;
                y2Var.e = Bitmap.createBitmap(y2Var.getMeasuredWidth(), y2Var.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                new Canvas(y2Var.e).drawText(y2Var.d, y2Var.getMeasuredWidth() / 2, (int) ((y2Var.getMeasuredHeight() / 2) - ((y2Var.f29685a.ascent() + y2Var.f29685a.descent()) / 2.0f)), y2Var.f29685a);
                y2Var.postInvalidate();
                return;
            case 28:
                ((org.telegram.ui.web.k) this.f10710b).f39122w.Y2.N(true);
                return;
            default:
                org.telegram.ui.web.i iVar = ((org.telegram.ui.web.n) this.f10710b).h.e;
                if (iVar != null) {
                    iVar.d();
                    return;
                }
                return;
        }
    }

    public h0(Object obj, int i10) {
        this.f10709a = i10;
        this.f10710b = obj;
    }
}
