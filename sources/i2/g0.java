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
import m.q3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.tgnet.TLParseException;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Cells.g3;
import org.telegram.ui.Cells.i3;
import org.telegram.ui.Components.bu;
import org.telegram.ui.Components.voip.g2;
import org.telegram.ui.Components.voip.p2;
import org.telegram.ui.Components.voip.t2;
import org.telegram.ui.Components.voip.x2;
import org.telegram.ui.bo;
import org.telegram.ui.dg1;
import w7.x5;
public final class g0 implements Runnable {
    public final int f10712a;
    public final Object f10713b;

    public g0(o0 o0Var, j1 j1Var) {
        this.f10712a = 0;
        this.f10713b = j1Var;
    }

    @Override
    public final void run() {
        switch (this.f10712a) {
            case 0:
                try {
                    o0.g((j1) this.f10713b);
                    return;
                } catch (n e) {
                    e2.a.f("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e);
                    throw new RuntimeException(e);
                }
            case 1:
                g3 g3Var = ((i3) this.f10713b).f20229b;
                g3Var.requestFocus();
                AndroidUtilities.showKeyboard(g3Var);
                return;
            case 2:
                AndroidUtilities.showKeyboard(((ii.x) this.f10713b).f11747e0.f20229b);
                return;
            case 3:
                ((ii.e0) this.f10713b).invalidate();
                return;
            case 4:
                q3 q3Var = (q3) this.f10713b;
                q3Var.f14290c = null;
                q3Var.d = null;
                q3Var.e = null;
                q3Var.f14291f = null;
                q3Var.c(null);
                return;
            case 5:
                ((a2) this.f10713b).invalidateSelf();
                return;
            case 6:
                ((h2) this.f10713b).c();
                return;
            case 7:
                j2.f fVar = (j2.f) this.f10713b;
                j2.a l4 = fVar.l();
                fVar.q(l4, 1028, new j2.c(l4, 5));
                fVar.f12575f.d();
                return;
            case 8:
                k2.g0 g0Var = (k2.g0) this.f10713b;
                if (g0Var.f13274k0 >= 300000) {
                    g0Var.f13285t.p();
                    g0Var.f13274k0 = 0L;
                    return;
                }
                return;
            case 9:
                ((kh.b) this.f10713b).invalidate();
                return;
            case 10:
                lh.c cVar = (lh.c) this.f10713b;
                GroupCallMessage groupCallMessage = cVar.H;
                if (groupCallMessage != null) {
                    cVar.f14107a.a(groupCallMessage.isSendDelayed(), true);
                    cVar.f14108b.a(cVar.H.isSendError(), true);
                    return;
                }
                return;
            case 11:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, (h6) this.f10713b, Boolean.TRUE, null, -1);
                return;
            case 12:
                n2.d dVar = (n2.d) this.f10713b;
                if (!dVar.f14888c) {
                    n2.g gVar = dVar.f14887b;
                    if (gVar != null) {
                        gVar.a(dVar.f14886a);
                    }
                    dVar.d.f14897x.remove(dVar);
                    dVar.f14888c = true;
                    return;
                }
                return;
            case 13:
                ((n2.b) this.f10713b).a(null);
                return;
            case 14:
                dg1 dg1Var = (dg1) this.f10713b;
                if (dg1Var.getParentLayout() != null) {
                    dg1Var.H = true;
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", dg1Var.f33012a);
                    bo boVar = new bo(bundle);
                    boVar.f32358ja = true;
                    dg1Var.presentFragment(boVar);
                    return;
                }
                return;
            case 15:
                ni.d dVar2 = (ni.d) this.f10713b;
                AndroidUtilities.runOnUIThread(new ni.c(dVar2.f15252a, dVar2.f15253b, 1), 500L);
                return;
            case 16:
                ((a4.m) this.f10713b).w0();
                return;
            case 17:
                TLParseException.lambda$doThrowOrLog$0((TLParseException) this.f10713b);
                return;
            case 18:
                org.telegram.ui.Components.voip.m0 m0Var = (org.telegram.ui.Components.voip.m0) this.f10713b;
                m0Var.P0 = null;
                m0Var.setVisibleParticipant(true);
                return;
            case 19:
                org.telegram.ui.Components.voip.j1 j1Var = (org.telegram.ui.Components.voip.j1) this.f10713b;
                j1Var.K = false;
                j1Var.o(false);
                j1Var.W = false;
                return;
            case 20:
                org.telegram.ui.Components.voip.j1 j1Var2 = (org.telegram.ui.Components.voip.j1) ((lg.b) this.f10713b).f14038b;
                j1Var2.e.invalidate();
                if (!j1Var2.e.isInLayout()) {
                    j1Var2.e.requestLayout();
                    j1Var2.d.requestLayout();
                    j1Var2.f29010f.requestLayout();
                    return;
                }
                return;
            case 21:
                ((org.telegram.ui.Components.voip.i1) this.f10713b).f28991a.i(false);
                return;
            case 22:
                org.telegram.ui.Components.voip.h2 h2Var = (org.telegram.ui.Components.voip.h2) this.f10713b;
                h2Var.e = false;
                HashMap hashMap = h2Var.f28980a;
                ArrayList arrayList = h2Var.f28982c;
                ArrayList arrayList2 = h2Var.f28981b;
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
                            } else if (g2Var.f28956a.equals(((g2) arrayList.get(i11)).f28956a)) {
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
                        hashMap.put(g2Var2.f28956a, g2Var2);
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
                TextView[] textViewArr = ((p2) this.f10713b).f29161a;
                TextView textView = textViewArr[0];
                textViewArr[0] = textViewArr[1];
                textViewArr[1] = textView;
                return;
            case 24:
                TextView[] textViewArr2 = ((p2) ((gg.k0) this.f10713b).e).f29161a;
                TextView textView2 = textViewArr2[0];
                textViewArr2[0] = textViewArr2[1];
                textViewArr2[1] = textView2;
                return;
            case 25:
                t2 t2Var = (t2) this.f10713b;
                if (t2Var.getVisibility() == 0) {
                    t2Var.a();
                    return;
                }
                return;
            case 26:
                x2 x2Var = (x2) this.f10713b;
                x2Var.e = Bitmap.createBitmap(x2Var.getMeasuredWidth(), x2Var.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                new Canvas(x2Var.e).drawText(x2Var.d, x2Var.getMeasuredWidth() / 2, (int) ((x2Var.getMeasuredHeight() / 2) - ((x2Var.f29356a.ascent() + x2Var.f29356a.descent()) / 2.0f)), x2Var.f29356a);
                x2Var.postInvalidate();
                return;
            case 27:
                ((org.telegram.ui.web.k) this.f10713b).f39007w.Y2.N(true);
                return;
            case 28:
                org.telegram.ui.web.i iVar = ((org.telegram.ui.web.o) this.f10713b).h.f39049f;
                if (iVar != null) {
                    iVar.d();
                    return;
                }
                return;
            default:
                ((bu) this.f10713b).requestFocus();
                return;
        }
    }

    public g0(Object obj, int i10) {
        this.f10712a = i10;
        this.f10713b = obj;
    }
}
