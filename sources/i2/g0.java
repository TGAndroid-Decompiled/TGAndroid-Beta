package i2;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Bundle;
import android.transition.TransitionManager;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
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
import org.telegram.ui.Cells.i3;
import org.telegram.ui.Cells.k3;
import org.telegram.ui.Components.b60;
import org.telegram.ui.Components.voip.g2;
import org.telegram.ui.Components.voip.p2;
import org.telegram.ui.Components.voip.t2;
import org.telegram.ui.Components.voip.x2;
import org.telegram.ui.Components.x50;
import org.telegram.ui.fg1;
import org.telegram.ui.kl;
import org.telegram.ui.zn;
import w7.y5;
public final class g0 implements Runnable {
    public final int f10716a;
    public final Object f10717b;

    public g0(o0 o0Var, j1 j1Var) {
        this.f10716a = 0;
        this.f10717b = j1Var;
    }

    @Override
    public final void run() {
        switch (this.f10716a) {
            case 0:
                try {
                    o0.g((j1) this.f10717b);
                    return;
                } catch (n e) {
                    e2.a.f("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e);
                    throw new RuntimeException(e);
                }
            case 1:
                i3 i3Var = ((k3) this.f10717b).f20542b;
                i3Var.requestFocus();
                AndroidUtilities.showKeyboard(i3Var);
                return;
            case 2:
                AndroidUtilities.showKeyboard(((ii.x) this.f10717b).f11751e0.f20542b);
                return;
            case 3:
                ((ii.e0) this.f10717b).invalidate();
                return;
            case 4:
                p3 p3Var = (p3) this.f10717b;
                p3Var.f14520c = null;
                p3Var.d = null;
                p3Var.e = null;
                p3Var.f14521f = null;
                p3Var.c(null);
                return;
            case 5:
                ((a2) this.f10717b).invalidateSelf();
                return;
            case 6:
                ((h2) this.f10717b).c();
                return;
            case 7:
                j2.f fVar = (j2.f) this.f10717b;
                j2.a l4 = fVar.l();
                fVar.q(l4, 1028, new j2.c(l4, 5));
                fVar.f12579f.d();
                return;
            case 8:
                k2.f0 f0Var = (k2.f0) this.f10717b;
                if (f0Var.f13272k0 >= 300000) {
                    f0Var.f13283t.n();
                    f0Var.f13272k0 = 0L;
                    return;
                }
                return;
            case 9:
                ((kh.b) this.f10717b).invalidate();
                return;
            case 10:
                b60 b60Var = ((x50) ((ki.l0) this.f10717b)).f30225a;
                kl klVar = b60Var.E;
                if (b60Var.f22879i0) {
                    b60Var.f22879i0 = false;
                    klVar.animate().cancel();
                    klVar.animate().alpha(0.0f).setDuration(100L).setInterpolator(new DecelerateInterpolator()).start();
                    return;
                }
                return;
            case 11:
                lh.c cVar = (lh.c) this.f10717b;
                GroupCallMessage groupCallMessage = cVar.H;
                if (groupCallMessage != null) {
                    cVar.f14317a.a(groupCallMessage.isSendDelayed(), true);
                    cVar.f14318b.a(cVar.H.isSendError(), true);
                    return;
                }
                return;
            case 12:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, (i6) this.f10717b, Boolean.TRUE, null, -1);
                return;
            case 13:
                n2.d dVar = (n2.d) this.f10717b;
                if (!dVar.f15125c) {
                    n2.g gVar = dVar.f15124b;
                    if (gVar != null) {
                        gVar.a(dVar.f15123a);
                    }
                    dVar.d.f15134x.remove(dVar);
                    dVar.f15125c = true;
                    return;
                }
                return;
            case 14:
                ((n2.b) this.f10717b).a(null);
                return;
            case 15:
                fg1 fg1Var = (fg1) this.f10717b;
                if (fg1Var.getParentLayout() != null) {
                    fg1Var.H = true;
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", fg1Var.f33621a);
                    zn znVar = new zn(bundle);
                    znVar.f40385ja = true;
                    fg1Var.presentFragment(znVar);
                    return;
                }
                return;
            case 16:
                ((k2.e) this.f10717b).H();
                return;
            case 17:
                oi.d dVar2 = (oi.d) this.f10717b;
                AndroidUtilities.runOnUIThread(new oi.c(dVar2.f15758a, dVar2.f15759b, 1), 500L);
                return;
            case 18:
                TLParseException.lambda$doThrowOrLog$0((TLParseException) this.f10717b);
                return;
            case 19:
                org.telegram.ui.Components.voip.m0 m0Var = (org.telegram.ui.Components.voip.m0) this.f10717b;
                m0Var.P0 = null;
                m0Var.setVisibleParticipant(true);
                return;
            case 20:
                org.telegram.ui.Components.voip.j1 j1Var = (org.telegram.ui.Components.voip.j1) this.f10717b;
                j1Var.K = false;
                j1Var.o(false);
                j1Var.W = false;
                return;
            case 21:
                org.telegram.ui.Components.voip.j1 j1Var2 = (org.telegram.ui.Components.voip.j1) ((lg.b) this.f10717b).f14248b;
                j1Var2.e.invalidate();
                if (!j1Var2.e.isInLayout()) {
                    j1Var2.e.requestLayout();
                    j1Var2.d.requestLayout();
                    j1Var2.f29375f.requestLayout();
                    return;
                }
                return;
            case 22:
                ((org.telegram.ui.Components.voip.i1) this.f10717b).f29356a.i(false);
                return;
            case 23:
                org.telegram.ui.Components.voip.h2 h2Var = (org.telegram.ui.Components.voip.h2) this.f10717b;
                h2Var.e = false;
                HashMap hashMap = h2Var.f29345a;
                ArrayList arrayList = h2Var.f29347c;
                ArrayList arrayList2 = h2Var.f29346b;
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
                            } else if (g2Var.f29321a.equals(((g2) arrayList.get(i11)).f29321a)) {
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
                        h2Var.addView((View) arrayList2.get(i12), y5.t(-2, -2, 1, 4, 0, 0, 4));
                    }
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        h2Var.removeView((View) arrayList.get(i13));
                    }
                    hashMap.clear();
                    for (int i14 = 0; i14 < h2Var.getChildCount(); i14++) {
                        g2 g2Var2 = (g2) h2Var.getChildAt(i14);
                        hashMap.put(g2Var2.f29321a, g2Var2);
                    }
                    arrayList2.clear();
                    arrayList.clear();
                    h2Var.e = true;
                    AndroidUtilities.runOnUIThread(new g0(h2Var, 23), 700L);
                    Runnable runnable = h2Var.h;
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
                return;
            case 24:
                TextView[] textViewArr = ((p2) this.f10717b).f29526a;
                TextView textView = textViewArr[0];
                textViewArr[0] = textViewArr[1];
                textViewArr[1] = textView;
                return;
            case 25:
                TextView[] textViewArr2 = ((p2) ((gg.k0) this.f10717b).e).f29526a;
                TextView textView2 = textViewArr2[0];
                textViewArr2[0] = textViewArr2[1];
                textViewArr2[1] = textView2;
                return;
            case 26:
                t2 t2Var = (t2) this.f10717b;
                if (t2Var.getVisibility() == 0) {
                    t2Var.a();
                    return;
                }
                return;
            case 27:
                x2 x2Var = (x2) this.f10717b;
                x2Var.e = Bitmap.createBitmap(x2Var.getMeasuredWidth(), x2Var.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                new Canvas(x2Var.e).drawText(x2Var.d, x2Var.getMeasuredWidth() / 2, (int) ((x2Var.getMeasuredHeight() / 2) - ((x2Var.f29721a.ascent() + x2Var.f29721a.descent()) / 2.0f)), x2Var.f29721a);
                x2Var.postInvalidate();
                return;
            case 28:
                ((org.telegram.ui.web.k) this.f10717b).f38984w.Y2.N(true);
                return;
            default:
                org.telegram.ui.web.i iVar = ((org.telegram.ui.web.o) this.f10717b).h.f39028f;
                if (iVar != null) {
                    iVar.d();
                    return;
                }
                return;
        }
    }

    public g0(Object obj, int i10) {
        this.f10716a = i10;
        this.f10717b = obj;
    }
}
