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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.h3;
import org.telegram.ui.Cells.j3;
import org.telegram.ui.Components.su;
import org.telegram.ui.Components.t60;
import org.telegram.ui.Components.voip.h2;
import org.telegram.ui.Components.voip.q2;
import org.telegram.ui.Components.voip.u2;
import org.telegram.ui.Components.voip.y2;
import org.telegram.ui.eg1;
import org.telegram.ui.zn;
import w7.x5;
public final class h0 implements Runnable {
    public final int f11720a;
    public final Object f11721b;

    public h0(p0 p0Var, k1 k1Var) {
        this.f11720a = 0;
        this.f11721b = k1Var;
    }

    @Override
    public final void run() {
        switch (this.f11720a) {
            case 0:
                try {
                    p0.f((k1) this.f11721b);
                    return;
                } catch (n e7) {
                    e2.a.f("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e7);
                    throw new RuntimeException(e7);
                }
            case 1:
                h3 h3Var = ((j3) this.f11721b).f22289b;
                h3Var.requestFocus();
                AndroidUtilities.showKeyboard(h3Var);
                return;
            case 2:
                AndroidUtilities.showKeyboard(((ii.x) this.f11721b).f12793e0.f22289b);
                return;
            case 3:
                ((ii.e0) this.f11721b).invalidate();
                return;
            case 4:
                q3 q3Var = (q3) this.f11721b;
                q3Var.f15822c = null;
                q3Var.d = null;
                q3Var.f15823e = null;
                q3Var.f15824f = null;
                q3Var.e(null);
                return;
            case 5:
                ((b2) this.f11721b).invalidateSelf();
                return;
            case 6:
                ((i2) this.f11721b).c();
                return;
            case 7:
                j2.f fVar = (j2.f) this.f11721b;
                j2.a l4 = fVar.l();
                fVar.q(l4, 1028, new j2.c(l4, 3));
                fVar.f13693f.d();
                return;
            case 8:
                k2.d0 d0Var = (k2.d0) this.f11721b;
                if (d0Var.f14440j0 >= 300000) {
                    d0Var.f14451s.d();
                    d0Var.f14440j0 = 0L;
                    return;
                }
                return;
            case 9:
                ((kh.b) this.f11721b).invalidate();
                return;
            case 10:
                t60 t60Var = (t60) ((m2.t) this.f11721b).f15997b;
                t60Var.f31021o0 = true;
                FileLog.d("RoundVideo camera flip first frame: elapsedMs=" + t60.k(t60Var));
                t60Var.s();
                return;
            case 11:
                lh.c cVar = (lh.c) this.f11721b;
                GroupCallMessage groupCallMessage = cVar.H;
                if (groupCallMessage != null) {
                    cVar.f15586a.a(groupCallMessage.isSendDelayed(), true);
                    cVar.f15587b.a(cVar.H.isSendError(), true);
                    return;
                }
                return;
            case 12:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, (g6) this.f11721b, Boolean.TRUE, null, -1);
                return;
            case 13:
                n2.d dVar = (n2.d) this.f11721b;
                if (!dVar.f16546c) {
                    n2.g gVar = dVar.f16545b;
                    if (gVar != null) {
                        gVar.a(dVar.f16544a);
                    }
                    dVar.d.f16556x.remove(dVar);
                    dVar.f16546c = true;
                    return;
                }
                return;
            case 14:
                ((n2.b) this.f11721b).a(null);
                return;
            case 15:
                eg1 eg1Var = (eg1) this.f11721b;
                if (eg1Var.getParentLayout() != null) {
                    eg1Var.H = true;
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", eg1Var.f37311a);
                    zn znVar = new zn(bundle);
                    znVar.f44822ja = true;
                    eg1Var.presentFragment(znVar);
                    return;
                }
                return;
            case 16:
                ((k2.g0) this.f11721b).M0();
                return;
            case 17:
                TLParseException.lambda$doThrowOrLog$0((TLParseException) this.f11721b);
                return;
            case 18:
                org.telegram.ui.Components.voip.n0 n0Var = (org.telegram.ui.Components.voip.n0) this.f11721b;
                n0Var.P0 = null;
                n0Var.setVisibleParticipant(true);
                return;
            case 19:
                org.telegram.ui.Components.voip.k1 k1Var = (org.telegram.ui.Components.voip.k1) this.f11721b;
                k1Var.K = false;
                k1Var.o(false);
                k1Var.W = false;
                return;
            case 20:
                org.telegram.ui.Components.voip.k1 k1Var2 = (org.telegram.ui.Components.voip.k1) ((lg.b) this.f11721b).f15509b;
                k1Var2.f32061e.invalidate();
                if (!k1Var2.f32061e.isInLayout()) {
                    k1Var2.f32061e.requestLayout();
                    k1Var2.d.requestLayout();
                    k1Var2.f32062f.requestLayout();
                    return;
                }
                return;
            case 21:
                ((org.telegram.ui.Components.voip.j1) this.f11721b).f32041a.i(false);
                return;
            case 22:
                org.telegram.ui.Components.voip.i2 i2Var = (org.telegram.ui.Components.voip.i2) this.f11721b;
                i2Var.f32032e = false;
                HashMap hashMap = i2Var.f32029a;
                ArrayList arrayList = i2Var.f32031c;
                ArrayList arrayList2 = i2Var.f32030b;
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
                            } else if (h2Var.f32014a.equals(((h2) arrayList.get(i11)).f32014a)) {
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
                        i2Var.addView((View) arrayList2.get(i12), x5.t(-2, -2, 1, 4, 0, 0, 4));
                    }
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        i2Var.removeView((View) arrayList.get(i13));
                    }
                    hashMap.clear();
                    for (int i14 = 0; i14 < i2Var.getChildCount(); i14++) {
                        h2 h2Var2 = (h2) i2Var.getChildAt(i14);
                        hashMap.put(h2Var2.f32014a, h2Var2);
                    }
                    arrayList2.clear();
                    arrayList.clear();
                    i2Var.f32032e = true;
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
                TextView[] textViewArr = ((q2) this.f11721b).f32222a;
                TextView textView = textViewArr[0];
                textViewArr[0] = textViewArr[1];
                textViewArr[1] = textView;
                return;
            case 24:
                TextView[] textViewArr2 = ((q2) ((gg.j0) this.f11721b).f10664e).f32222a;
                TextView textView2 = textViewArr2[0];
                textViewArr2[0] = textViewArr2[1];
                textViewArr2[1] = textView2;
                return;
            case 25:
                u2 u2Var = (u2) this.f11721b;
                if (u2Var.getVisibility() == 0) {
                    u2Var.a();
                    return;
                }
                return;
            case 26:
                y2 y2Var = (y2) this.f11721b;
                y2Var.f32438e = Bitmap.createBitmap(y2Var.getMeasuredWidth(), y2Var.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                new Canvas(y2Var.f32438e).drawText(y2Var.d, y2Var.getMeasuredWidth() / 2, (int) ((y2Var.getMeasuredHeight() / 2) - ((y2Var.f32435a.ascent() + y2Var.f32435a.descent()) / 2.0f)), y2Var.f32435a);
                y2Var.postInvalidate();
                return;
            case 27:
                ((org.telegram.ui.web.k) this.f11721b).f43562w.W2.N(true);
                return;
            case 28:
                org.telegram.ui.web.i iVar = ((org.telegram.ui.web.n) this.f11721b).h.f43603e;
                if (iVar != null) {
                    iVar.d();
                    return;
                }
                return;
            default:
                ((su) this.f11721b).requestFocus();
                return;
        }
    }

    public h0(Object obj, int i10) {
        this.f11720a = i10;
        this.f11721b = obj;
    }
}
