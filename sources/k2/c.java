package k2;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import li.f2;
import li.y1;
import m.r3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.tgnet.TLParseException;
import org.telegram.ui.ActionBar.x6;
import org.telegram.ui.Cells.e3;
import org.telegram.ui.Cells.g3;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.ju;
import org.telegram.ui.Components.ny0;
import org.telegram.ui.Components.voip.h1;
import org.telegram.ui.Components.voip.h2;
import org.telegram.ui.Components.voip.i1;
import org.telegram.ui.Components.voip.i2;
import org.telegram.ui.Components.voip.q2;
import org.telegram.ui.Components.voip.u2;
import org.telegram.ui.Components.voip.y2;
import org.telegram.ui.web.e1;
public final class c implements Runnable {
    public final int f16129a;
    public final Object f16130b;

    public c(Object obj, int i10) {
        this.f16129a = i10;
        this.f16130b = obj;
    }

    @Override
    public final void run() {
        switch (this.f16129a) {
            case 0:
                ((f) this.f16130b).c();
                return;
            case 1:
                e2.r rVar = (e2.r) this.f16130b;
                rVar.getClass();
                if (Thread.currentThread() == rVar.f9713a) {
                    rVar.e(-1, new jh.l(4));
                    return;
                }
                return;
            case 2:
                u0 u0Var = (u0) this.f16130b;
                if (u0Var.f16284a0 >= 300000) {
                    u0Var.f16295n.i();
                    u0Var.f16284a0 = 0L;
                    return;
                }
                return;
            case 3:
                e3 e3Var = ((g3) this.f16130b).d;
                e3Var.requestFocus();
                AndroidUtilities.showKeyboard(e3Var);
                return;
            case 4:
                AndroidUtilities.showKeyboard(((li.w) this.f16130b).f17586e0.d);
                return;
            case 5:
                ((li.c0) this.f16130b).invalidate();
                return;
            case 6:
                r3 r3Var = (r3) this.f16130b;
                r3Var.f17846c = null;
                r3Var.d = null;
                r3Var.e = null;
                r3Var.f17847f = null;
                r3Var.e(null);
                return;
            case 7:
                ((y1) this.f16130b).invalidateSelf();
                return;
            case 8:
                ((f2) this.f16130b).c();
                return;
            case 9:
                ((mh.b) this.f16130b).invalidate();
                return;
            case 10:
                n2.d dVar = (n2.d) this.f16130b;
                if (!dVar.f18608c) {
                    n2.g gVar = dVar.f18607b;
                    if (gVar != null) {
                        gVar.a(dVar.f18606a);
                    }
                    dVar.d.f18617x.remove(dVar);
                    dVar.f18608c = true;
                    return;
                }
                return;
            case 11:
                ((n2.b) this.f16130b).a(null);
                return;
            case 12:
                nh.c cVar = (nh.c) this.f16130b;
                GroupCallMessage groupCallMessage = cVar.H;
                if (groupCallMessage != null) {
                    cVar.f18853a.a(groupCallMessage.isSendDelayed(), true);
                    cVar.f18854b.a(cVar.H.isSendError(), true);
                    return;
                }
                return;
            case 13:
                ((jg.i) this.f16130b).f0();
                return;
            case 14:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, (x6) this.f16130b, Boolean.TRUE, null, -1);
                return;
            case 15:
                TLParseException.lambda$doThrowOrLog$0((TLParseException) this.f16130b);
                return;
            case 16:
                org.telegram.ui.Components.voip.l0 l0Var = (org.telegram.ui.Components.voip.l0) this.f16130b;
                l0Var.P0 = null;
                l0Var.setVisibleParticipant(true);
                return;
            case 17:
                i1 i1Var = (i1) this.f16130b;
                i1Var.K = false;
                i1Var.o(false);
                i1Var.W = false;
                return;
            case 18:
                i1 i1Var2 = (i1) ((ng.b) this.f16130b).f18784b;
                i1Var2.e.invalidate();
                if (!i1Var2.e.isInLayout()) {
                    i1Var2.e.requestLayout();
                    i1Var2.d.requestLayout();
                    i1Var2.f33849f.requestLayout();
                    return;
                }
                return;
            case 19:
                ((h1) this.f16130b).f33831a.i(false);
                return;
            case 20:
                i2 i2Var = (i2) this.f16130b;
                i2Var.e = false;
                HashMap hashMap = i2Var.f33856a;
                ArrayList arrayList = i2Var.f33858c;
                ArrayList arrayList2 = i2Var.f33857b;
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
                            } else if (h2Var.f33832a.equals(((h2) arrayList.get(i11)).f33832a)) {
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
                        i2Var.addView((View) arrayList2.get(i12), gb1.x(-2, -2, 1, 4, 0, 0, 4));
                    }
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        i2Var.removeView((View) arrayList.get(i13));
                    }
                    hashMap.clear();
                    for (int i14 = 0; i14 < i2Var.getChildCount(); i14++) {
                        h2 h2Var2 = (h2) i2Var.getChildAt(i14);
                        hashMap.put(h2Var2.f33832a, h2Var2);
                    }
                    arrayList2.clear();
                    arrayList.clear();
                    i2Var.e = true;
                    AndroidUtilities.runOnUIThread(new c(i2Var, 20), 700L);
                    Runnable runnable = i2Var.h;
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
                return;
            case 21:
                TextView[] textViewArr = ((q2) this.f16130b).f34032a;
                TextView textView = textViewArr[0];
                textViewArr[0] = textViewArr[1];
                textViewArr[1] = textView;
                return;
            case 22:
                TextView[] textViewArr2 = ((q2) ((ig.k0) this.f16130b).e).f34032a;
                TextView textView2 = textViewArr2[0];
                textViewArr2[0] = textViewArr2[1];
                textViewArr2[1] = textView2;
                return;
            case 23:
                u2 u2Var = (u2) this.f16130b;
                if (u2Var.getVisibility() == 0) {
                    u2Var.a();
                    return;
                }
                return;
            case 24:
                y2 y2Var = (y2) this.f16130b;
                y2Var.e = Bitmap.createBitmap(y2Var.getMeasuredWidth(), y2Var.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                new Canvas(y2Var.e).drawText(y2Var.d, y2Var.getMeasuredWidth() / 2, (int) ((y2Var.getMeasuredHeight() / 2) - ((y2Var.f34222a.ascent() + y2Var.f34222a.descent()) / 2.0f)), y2Var.f34222a);
                y2Var.postInvalidate();
                return;
            case 25:
                ((org.telegram.ui.web.l) this.f16130b).f45306w.f32152g3.O(true);
                return;
            case 26:
                org.telegram.ui.web.j jVar = ((org.telegram.ui.web.o) this.f16130b).f45336b.f45343f;
                if (jVar != null) {
                    jVar.d();
                    return;
                }
                return;
            case 27:
                ((ju) this.f16130b).requestFocus();
                return;
            case 28:
                qf.d.r(((org.telegram.ui.web.t0) this.f16130b).f45380b.e.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                return;
            default:
                e1 e1Var = (e1) this.f16130b;
                Utilities.searchQueue.postRunnable(new ny0(e1Var, new ArrayList(e1Var.f45224b.f45230f), e1Var.f45224b.f45232r));
                return;
        }
    }
}
