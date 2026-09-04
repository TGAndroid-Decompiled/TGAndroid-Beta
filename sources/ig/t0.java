package ig;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Bundle;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.TextView;
import bi.r3;
import java.util.ArrayList;
import java.util.HashMap;
import ji.g2;
import m.p3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.tgnet.TLParseException;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Cells.g3;
import org.telegram.ui.Cells.i3;
import org.telegram.ui.Components.voip.n2;
import org.telegram.ui.Components.voip.r2;
import org.telegram.ui.Components.voip.v2;
import org.telegram.ui.co;
import org.telegram.ui.eg1;
import w7.x5;
public final class t0 implements Runnable {
    public final int f12208a;
    public final Object f12209b;

    public t0(Object obj, int i10) {
        this.f12208a = i10;
        this.f12209b = obj;
    }

    @Override
    public final void run() {
        switch (this.f12208a) {
            case 0:
                u0 u0Var = (u0) ((a6.m) this.f12209b).f316b;
                u0Var.f12229c.Y2.N(true);
                u0Var.b0();
                return;
            case 1:
                w0 w0Var = (w0) this.f12209b;
                w0Var.f12259c.Y2.N(true);
                w0Var.V(true);
                return;
            case 2:
                g1 g1Var = (g1) this.f12209b;
                g1Var.f12079a.Y2.N(true);
                g1Var.Y(true);
                return;
            case 3:
                ((r3) this.f12209b).run(Boolean.FALSE);
                return;
            case 4:
                NotificationCenter.getInstance(((b2) this.f12209b).f12006a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                return;
            case 5:
                j2.f fVar = (j2.f) this.f12209b;
                j2.a l4 = fVar.l();
                fVar.q(l4, 1028, new j2.c(l4, 3));
                fVar.f13180f.d();
                return;
            case 6:
                g3 g3Var = ((i3) this.f12209b).f22074b;
                g3Var.requestFocus();
                AndroidUtilities.showKeyboard(g3Var);
                return;
            case 7:
                AndroidUtilities.showKeyboard(((ji.x) this.f12209b).f14316e0.f22074b);
                return;
            case 8:
                ((ji.d0) this.f12209b).invalidate();
                return;
            case 9:
                p3 p3Var = (p3) this.f12209b;
                p3Var.f15636c = null;
                p3Var.d = null;
                p3Var.f15637e = null;
                p3Var.f15638f = null;
                p3Var.c(null);
                return;
            case 10:
                ((ji.z1) this.f12209b).invalidateSelf();
                return;
            case 11:
                ((g2) this.f12209b).c();
                return;
            case 12:
                k2.d0 d0Var = (k2.d0) this.f12209b;
                if (d0Var.f14550k0 >= 300000) {
                    d0Var.f14561t.d();
                    d0Var.f14550k0 = 0L;
                    return;
                }
                return;
            case 13:
                ((lh.b) this.f12209b).invalidate();
                return;
            case 14:
                mh.c cVar = (mh.c) this.f12209b;
                GroupCallMessage groupCallMessage = cVar.H;
                if (groupCallMessage != null) {
                    cVar.f16314a.a(groupCallMessage.isSendDelayed(), true);
                    cVar.f16315b.a(cVar.H.isSendError(), true);
                    return;
                }
                return;
            case 15:
                n2.d dVar = (n2.d) this.f12209b;
                if (!dVar.f16382c) {
                    n2.g gVar = dVar.f16381b;
                    if (gVar != null) {
                        gVar.a(dVar.f16380a);
                    }
                    dVar.d.f16392x.remove(dVar);
                    dVar.f16382c = true;
                    return;
                }
                return;
            case 16:
                ((n2.b) this.f12209b).a(null);
                return;
            case 17:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, (i6) this.f12209b, Boolean.TRUE, null, -1);
                return;
            case 18:
                ((mg.n) this.f12209b).e();
                return;
            case 19:
                eg1 eg1Var = (eg1) this.f12209b;
                if (eg1Var.getParentLayout() != null) {
                    eg1Var.H = true;
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", eg1Var.f36025a);
                    co coVar = new co(bundle);
                    coVar.f35307ja = true;
                    eg1Var.presentFragment(coVar);
                    return;
                }
                return;
            case 20:
                TLParseException.lambda$doThrowOrLog$0((TLParseException) this.f12209b);
                return;
            case 21:
                org.telegram.ui.Components.voip.l0 l0Var = (org.telegram.ui.Components.voip.l0) this.f12209b;
                l0Var.P0 = null;
                l0Var.setVisibleParticipant(true);
                return;
            case 22:
                org.telegram.ui.Components.voip.h1 h1Var = (org.telegram.ui.Components.voip.h1) this.f12209b;
                h1Var.K = false;
                h1Var.o(false);
                h1Var.W = false;
                return;
            case 23:
                org.telegram.ui.Components.voip.h1 h1Var2 = (org.telegram.ui.Components.voip.h1) ((mg.b) this.f12209b).f16235b;
                h1Var2.f31521e.invalidate();
                if (!h1Var2.f31521e.isInLayout()) {
                    h1Var2.f31521e.requestLayout();
                    h1Var2.d.requestLayout();
                    h1Var2.f31522f.requestLayout();
                    return;
                }
                return;
            case 24:
                ((org.telegram.ui.Components.voip.g1) this.f12209b).f31496a.i(false);
                return;
            case 25:
                org.telegram.ui.Components.voip.f2 f2Var = (org.telegram.ui.Components.voip.f2) this.f12209b;
                f2Var.f31485e = false;
                HashMap hashMap = f2Var.f31482a;
                ArrayList arrayList = f2Var.f31484c;
                ArrayList arrayList2 = f2Var.f31483b;
                if (!arrayList2.isEmpty() || !arrayList.isEmpty()) {
                    if (f2Var.getParent() != null) {
                        TransitionManager.beginDelayedTransition(f2Var, f2Var.d);
                    }
                    int i10 = 0;
                    while (i10 < arrayList2.size()) {
                        org.telegram.ui.Components.voip.e2 e2Var = (org.telegram.ui.Components.voip.e2) arrayList2.get(i10);
                        int i11 = 0;
                        while (true) {
                            if (i11 >= arrayList.size()) {
                                break;
                            } else if (e2Var.f31469a.equals(((org.telegram.ui.Components.voip.e2) arrayList.get(i11)).f31469a)) {
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
                        f2Var.addView((View) arrayList2.get(i12), x5.t(-2, -2, 1, 4, 0, 0, 4));
                    }
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        f2Var.removeView((View) arrayList.get(i13));
                    }
                    hashMap.clear();
                    for (int i14 = 0; i14 < f2Var.getChildCount(); i14++) {
                        org.telegram.ui.Components.voip.e2 e2Var2 = (org.telegram.ui.Components.voip.e2) f2Var.getChildAt(i14);
                        hashMap.put(e2Var2.f31469a, e2Var2);
                    }
                    arrayList2.clear();
                    arrayList.clear();
                    f2Var.f31485e = true;
                    AndroidUtilities.runOnUIThread(new t0(f2Var, 25), 700L);
                    Runnable runnable = f2Var.h;
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
                return;
            case 26:
                TextView[] textViewArr = ((n2) this.f12209b).f31669a;
                TextView textView = textViewArr[0];
                textViewArr[0] = textViewArr[1];
                textViewArr[1] = textView;
                return;
            case 27:
                TextView[] textViewArr2 = ((n2) ((hg.k0) this.f12209b).f11127e).f31669a;
                TextView textView2 = textViewArr2[0];
                textViewArr2[0] = textViewArr2[1];
                textViewArr2[1] = textView2;
                return;
            case 28:
                r2 r2Var = (r2) this.f12209b;
                if (r2Var.getVisibility() == 0) {
                    r2Var.a();
                    return;
                }
                return;
            default:
                v2 v2Var = (v2) this.f12209b;
                v2Var.f31902e = Bitmap.createBitmap(v2Var.getMeasuredWidth(), v2Var.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                new Canvas(v2Var.f31902e).drawText(v2Var.d, v2Var.getMeasuredWidth() / 2, (int) ((v2Var.getMeasuredHeight() / 2) - ((v2Var.f31899a.ascent() + v2Var.f31899a.descent()) / 2.0f)), v2Var.f31899a);
                v2Var.postInvalidate();
                return;
        }
    }
}
