package ig;

import android.os.Bundle;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.TextView;
import bi.u3;
import java.util.ArrayList;
import java.util.HashMap;
import ji.h2;
import ji.w4;
import m.t3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.tgnet.TLParseException;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Cells.h3;
import org.telegram.ui.Cells.j3;
import org.telegram.ui.Components.voip.n2;
import org.telegram.ui.fo;
import org.telegram.ui.kg1;
import w7.z5;
public final class t0 implements Runnable {
    public final int f11632a;
    public final Object f11633b;

    public t0(Object obj, int i10) {
        this.f11632a = i10;
        this.f11633b = obj;
    }

    @Override
    public final void run() {
        int i10 = this.f11632a;
        Object obj = this.f11633b;
        switch (i10) {
            case 0:
                u0 u0Var = (u0) ((a6.i) obj).f307b;
                u0Var.f11653c.W2.N(true);
                u0Var.b0();
                return;
            case 1:
                w0 w0Var = (w0) obj;
                w0Var.f11680c.W2.N(true);
                w0Var.V(true);
                return;
            case 2:
                g1 g1Var = (g1) obj;
                g1Var.f11516a.W2.N(true);
                g1Var.Y(true);
                return;
            case 3:
                ((u3) obj).run(Boolean.FALSE);
                return;
            case 4:
                NotificationCenter.getInstance(((b2) obj).f11451a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                return;
            case 5:
                j2.f fVar = (j2.f) obj;
                j2.a l4 = fVar.l();
                fVar.q(l4, 1028, new j2.c(l4));
                fVar.f12532f.d();
                return;
            case 6:
                h3 h3Var = ((j3) obj).f21083b;
                h3Var.requestFocus();
                AndroidUtilities.showKeyboard(h3Var);
                return;
            case 7:
                AndroidUtilities.showKeyboard(((ji.x) obj).f13610e0.f21083b);
                return;
            case 8:
                ((ji.d0) obj).invalidate();
                return;
            case 9:
                t3 t3Var = (t3) obj;
                t3Var.f14985c = null;
                t3Var.d = null;
                t3Var.e = null;
                t3Var.f14986f = null;
                t3Var.e(null);
                return;
            case 10:
                ((ji.a2) obj).invalidateSelf();
                return;
            case 11:
                ((h2) obj).c();
                return;
            case 12:
                ((k2.e) obj).c();
                return;
            case 13:
                e2.r rVar = (e2.r) obj;
                rVar.getClass();
                if (Thread.currentThread() == rVar.f8395a) {
                    rVar.e(-1, new j2.e(26));
                    return;
                }
                return;
            case 14:
                k2.s0 s0Var = (k2.s0) obj;
                if (s0Var.f13997a0 >= 300000) {
                    s0Var.f14008n.g();
                    s0Var.f13997a0 = 0L;
                    return;
                }
                return;
            case 15:
                ((lh.b) obj).invalidate();
                return;
            case 16:
                mh.c cVar = (mh.c) obj;
                GroupCallMessage groupCallMessage = cVar.H;
                if (groupCallMessage != null) {
                    cVar.f15569a.a(groupCallMessage.isSendDelayed(), true);
                    cVar.f15570b.a(cVar.H.isSendError(), true);
                    return;
                }
                return;
            case 17:
                n2.d dVar = (n2.d) obj;
                if (!dVar.f15657c) {
                    n2.g gVar = dVar.f15656b;
                    if (gVar != null) {
                        gVar.a(dVar.f15655a);
                    }
                    dVar.d.f15666x.remove(dVar);
                    dVar.f15657c = true;
                    return;
                }
                return;
            case 18:
                ((n2.b) obj).a(null);
                return;
            case 19:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, (f6) obj, Boolean.TRUE, null, -1);
                return;
            case 20:
                ((w4) obj).d1();
                return;
            case 21:
                kg1 kg1Var = (kg1) obj;
                if (kg1Var.getParentLayout() != null) {
                    kg1Var.H = true;
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", kg1Var.f37380a);
                    fo foVar = new fo(bundle);
                    foVar.f35694ja = true;
                    kg1Var.presentFragment(foVar);
                    return;
                }
                return;
            case 22:
                TLParseException.lambda$doThrowOrLog$0((TLParseException) obj);
                return;
            case 23:
                org.telegram.ui.Components.voip.l0 l0Var = (org.telegram.ui.Components.voip.l0) obj;
                l0Var.P0 = null;
                l0Var.setVisibleParticipant(true);
                return;
            case 24:
                org.telegram.ui.Components.voip.h1 h1Var = (org.telegram.ui.Components.voip.h1) obj;
                h1Var.K = false;
                h1Var.o(false);
                h1Var.W = false;
                return;
            case 25:
                org.telegram.ui.Components.voip.h1 h1Var2 = (org.telegram.ui.Components.voip.h1) ((mg.b) obj).f15500b;
                h1Var2.e.invalidate();
                if (!h1Var2.e.isInLayout()) {
                    h1Var2.e.requestLayout();
                    h1Var2.d.requestLayout();
                    h1Var2.f29883f.requestLayout();
                    return;
                }
                return;
            case 26:
                ((org.telegram.ui.Components.voip.g1) obj).f29857a.i(false);
                return;
            case 27:
                org.telegram.ui.Components.voip.f2 f2Var = (org.telegram.ui.Components.voip.f2) obj;
                f2Var.e = false;
                HashMap hashMap = f2Var.f29844a;
                ArrayList arrayList = f2Var.f29846c;
                ArrayList arrayList2 = f2Var.f29845b;
                if (!arrayList2.isEmpty() || !arrayList.isEmpty()) {
                    if (f2Var.getParent() != null) {
                        TransitionManager.beginDelayedTransition(f2Var, f2Var.d);
                    }
                    int i11 = 0;
                    while (i11 < arrayList2.size()) {
                        org.telegram.ui.Components.voip.e2 e2Var = (org.telegram.ui.Components.voip.e2) arrayList2.get(i11);
                        int i12 = 0;
                        while (true) {
                            if (i12 >= arrayList.size()) {
                                break;
                            } else if (e2Var.f29831a.equals(((org.telegram.ui.Components.voip.e2) arrayList.get(i12)).f29831a)) {
                                arrayList2.remove(i11);
                                arrayList.remove(i12);
                                i11--;
                            } else {
                                i12++;
                            }
                        }
                        i11++;
                    }
                    for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                        f2Var.addView((View) arrayList2.get(i13), z5.t(-2, -2, 1, 4, 0, 0, 4));
                    }
                    for (int i14 = 0; i14 < arrayList.size(); i14++) {
                        f2Var.removeView((View) arrayList.get(i14));
                    }
                    hashMap.clear();
                    for (int i15 = 0; i15 < f2Var.getChildCount(); i15++) {
                        org.telegram.ui.Components.voip.e2 e2Var2 = (org.telegram.ui.Components.voip.e2) f2Var.getChildAt(i15);
                        hashMap.put(e2Var2.f29831a, e2Var2);
                    }
                    arrayList2.clear();
                    arrayList.clear();
                    f2Var.e = true;
                    AndroidUtilities.runOnUIThread(new t0(f2Var, 27), 700L);
                    Runnable runnable = f2Var.h;
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
                return;
            case 28:
                TextView[] textViewArr = ((n2) obj).f30006a;
                TextView textView = textViewArr[0];
                textViewArr[0] = textViewArr[1];
                textViewArr[1] = textView;
                return;
            default:
                TextView[] textViewArr2 = ((n2) ((hg.j0) obj).e).f30006a;
                TextView textView2 = textViewArr2[0];
                textViewArr2[0] = textViewArr2[1];
                textViewArr2[1] = textView2;
                return;
        }
    }
}
