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
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Cells.h3;
import org.telegram.ui.Cells.j3;
import org.telegram.ui.Components.e60;
import org.telegram.ui.Components.eu;
import org.telegram.ui.Components.voip.h2;
import org.telegram.ui.Components.voip.q2;
import org.telegram.ui.Components.voip.u2;
import org.telegram.ui.Components.voip.y2;
import org.telegram.ui.il;
import org.telegram.ui.yf1;
import org.telegram.ui.yn;
import w7.z5;
public final class h0 implements Runnable {
    public final int f11671a;
    public final Object f11672b;

    public h0(p0 p0Var, k1 k1Var) {
        this.f11671a = 0;
        this.f11672b = k1Var;
    }

    @Override
    public final void run() {
        switch (this.f11671a) {
            case 0:
                try {
                    p0.h((k1) this.f11672b);
                    return;
                } catch (n e7) {
                    e2.a.f("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e7);
                    throw new RuntimeException(e7);
                }
            case 1:
                h3 h3Var = ((j3) this.f11672b).f22311b;
                h3Var.requestFocus();
                AndroidUtilities.showKeyboard(h3Var);
                return;
            case 2:
                AndroidUtilities.showKeyboard(((ii.x) this.f11672b).f12747e0.f22311b);
                return;
            case 3:
                ((ii.e0) this.f11672b).invalidate();
                return;
            case 4:
                p3 p3Var = (p3) this.f11672b;
                p3Var.f15856c = null;
                p3Var.d = null;
                p3Var.f15857e = null;
                p3Var.f15858f = null;
                p3Var.c(null);
                return;
            case 5:
                ((b2) this.f11672b).invalidateSelf();
                return;
            case 6:
                ((i2) this.f11672b).c();
                return;
            case 7:
                j2.f fVar = (j2.f) this.f11672b;
                j2.a l4 = fVar.l();
                fVar.q(l4, 1028, new j2.c(l4, 5));
                fVar.f13657f.d();
                return;
            case 8:
                k2.f0 f0Var = (k2.f0) this.f11672b;
                if (f0Var.f14418k0 >= 300000) {
                    f0Var.f14429t.m();
                    f0Var.f14418k0 = 0L;
                    return;
                }
                return;
            case 9:
                ((kh.b) this.f11672b).invalidate();
                return;
            case 10:
                e60 e60Var = (e60) ((l2.g) this.f11672b).f15268b;
                il ilVar = e60Var.E;
                if (e60Var.f25958l0) {
                    e60Var.f25958l0 = false;
                    ilVar.animate().cancel();
                    ilVar.animate().alpha(0.0f).setDuration(100L).setInterpolator(new DecelerateInterpolator()).start();
                    return;
                }
                return;
            case 11:
                lh.c cVar = (lh.c) this.f11672b;
                GroupCallMessage groupCallMessage = cVar.H;
                if (groupCallMessage != null) {
                    cVar.f15587a.a(groupCallMessage.isSendDelayed(), true);
                    cVar.f15588b.a(cVar.H.isSendError(), true);
                    return;
                }
                return;
            case 12:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, (h6) this.f11672b, Boolean.TRUE, null, -1);
                return;
            case 13:
                n2.e eVar = (n2.e) this.f11672b;
                if (!eVar.f16530c) {
                    n2.h hVar = eVar.f16529b;
                    if (hVar != null) {
                        hVar.a(eVar.f16528a);
                    }
                    eVar.d.f16540x.remove(eVar);
                    eVar.f16530c = true;
                    return;
                }
                return;
            case 14:
                ((n2.b) this.f11672b).a(null);
                return;
            case 15:
                yf1 yf1Var = (yf1) this.f11672b;
                if (yf1Var.getParentLayout() != null) {
                    yf1Var.H = true;
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", yf1Var.f43170a);
                    yn ynVar = new yn(bundle);
                    ynVar.ha = true;
                    yf1Var.presentFragment(ynVar);
                    return;
                }
                return;
            case 16:
                ((l2.g) this.f11672b).C();
                return;
            case 17:
                TLParseException.lambda$doThrowOrLog$0((TLParseException) this.f11672b);
                return;
            case 18:
                org.telegram.ui.Components.voip.m0 m0Var = (org.telegram.ui.Components.voip.m0) this.f11672b;
                m0Var.P0 = null;
                m0Var.setVisibleParticipant(true);
                return;
            case 19:
                org.telegram.ui.Components.voip.k1 k1Var = (org.telegram.ui.Components.voip.k1) this.f11672b;
                k1Var.K = false;
                k1Var.o(false);
                k1Var.W = false;
                return;
            case 20:
                org.telegram.ui.Components.voip.k1 k1Var2 = (org.telegram.ui.Components.voip.k1) ((lg.b) this.f11672b).f15510b;
                k1Var2.f31942e.invalidate();
                if (!k1Var2.f31942e.isInLayout()) {
                    k1Var2.f31942e.requestLayout();
                    k1Var2.d.requestLayout();
                    k1Var2.f31943f.requestLayout();
                    return;
                }
                return;
            case 21:
                ((org.telegram.ui.Components.voip.j1) this.f11672b).f31926a.i(false);
                return;
            case 22:
                org.telegram.ui.Components.voip.i2 i2Var = (org.telegram.ui.Components.voip.i2) this.f11672b;
                i2Var.f31910e = false;
                HashMap hashMap = i2Var.f31907a;
                ArrayList arrayList = i2Var.f31909c;
                ArrayList arrayList2 = i2Var.f31908b;
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
                            } else if (h2Var.f31894a.equals(((h2) arrayList.get(i11)).f31894a)) {
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
                        i2Var.addView((View) arrayList2.get(i12), z5.t(-2, -2, 1, 4, 0, 0, 4));
                    }
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        i2Var.removeView((View) arrayList.get(i13));
                    }
                    hashMap.clear();
                    for (int i14 = 0; i14 < i2Var.getChildCount(); i14++) {
                        h2 h2Var2 = (h2) i2Var.getChildAt(i14);
                        hashMap.put(h2Var2.f31894a, h2Var2);
                    }
                    arrayList2.clear();
                    arrayList.clear();
                    i2Var.f31910e = true;
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
                TextView[] textViewArr = ((q2) this.f11672b).f32100a;
                TextView textView = textViewArr[0];
                textViewArr[0] = textViewArr[1];
                textViewArr[1] = textView;
                return;
            case 24:
                TextView[] textViewArr2 = ((q2) ((gg.k0) this.f11672b).f10667e).f32100a;
                TextView textView2 = textViewArr2[0];
                textViewArr2[0] = textViewArr2[1];
                textViewArr2[1] = textView2;
                return;
            case 25:
                u2 u2Var = (u2) this.f11672b;
                if (u2Var.getVisibility() == 0) {
                    u2Var.a();
                    return;
                }
                return;
            case 26:
                y2 y2Var = (y2) this.f11672b;
                y2Var.f32316e = Bitmap.createBitmap(y2Var.getMeasuredWidth(), y2Var.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                new Canvas(y2Var.f32316e).drawText(y2Var.d, y2Var.getMeasuredWidth() / 2, (int) ((y2Var.getMeasuredHeight() / 2) - ((y2Var.f32313a.ascent() + y2Var.f32313a.descent()) / 2.0f)), y2Var.f32313a);
                y2Var.postInvalidate();
                return;
            case 27:
                ((org.telegram.ui.web.k) this.f11672b).f42259w.f25250f3.N(true);
                return;
            case 28:
                org.telegram.ui.web.i iVar = ((org.telegram.ui.web.n) this.f11672b).h.f42296f;
                if (iVar != null) {
                    iVar.d();
                    return;
                }
                return;
            default:
                ((eu) this.f11672b).requestFocus();
                return;
        }
    }

    public h0(Object obj, int i10) {
        this.f11671a = i10;
        this.f11672b = obj;
    }
}
