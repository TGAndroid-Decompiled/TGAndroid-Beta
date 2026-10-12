package ig;

import android.os.Bundle;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.TextView;
import bi.u3;
import java.util.ArrayList;
import java.util.HashMap;
import ji.h2;
import ji.h5;
import m.q3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.tgnet.TLParseException;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Cells.h3;
import org.telegram.ui.Cells.j3;
import org.telegram.ui.Components.o60;
import org.telegram.ui.Components.voip.o2;
import org.telegram.ui.fo;
import org.telegram.ui.lg1;
import w7.a6;
public final class t0 implements Runnable {
    public final int f11628a;
    public final Object f11629b;

    public t0(Object obj, int i10) {
        this.f11628a = i10;
        this.f11629b = obj;
    }

    @Override
    public final void run() {
        int i10 = this.f11628a;
        Object obj = this.f11629b;
        switch (i10) {
            case 0:
                u0 u0Var = (u0) ((a6.i) obj).f305b;
                u0Var.f11649c.W2.N(true);
                u0Var.b0();
                return;
            case 1:
                w0 w0Var = (w0) obj;
                w0Var.f11676c.W2.N(true);
                w0Var.V(true);
                return;
            case 2:
                g1 g1Var = (g1) obj;
                g1Var.f11512a.W2.N(true);
                g1Var.Y(true);
                return;
            case 3:
                ((u3) obj).run(Boolean.FALSE);
                return;
            case 4:
                NotificationCenter.getInstance(((b2) obj).f11447a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                return;
            case 5:
                j2.f fVar = (j2.f) obj;
                j2.a l4 = fVar.l();
                fVar.q(l4, 1028, new j2.c(l4));
                fVar.f12528f.d();
                return;
            case 6:
                h3 h3Var = ((j3) obj).f21368b;
                h3Var.requestFocus();
                AndroidUtilities.showKeyboard(h3Var);
                return;
            case 7:
                AndroidUtilities.showKeyboard(((ji.x) obj).f13607e0.f21368b);
                return;
            case 8:
                ((ji.d0) obj).invalidate();
                return;
            case 9:
                q3 q3Var = (q3) obj;
                q3Var.f15221c = null;
                q3Var.d = null;
                q3Var.e = null;
                q3Var.f15222f = null;
                q3Var.e(null);
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
                if (Thread.currentThread() == rVar.f8392a) {
                    rVar.e(-1, new j2.e(26));
                    return;
                }
                return;
            case 14:
                k2.s0 s0Var = (k2.s0) obj;
                if (s0Var.f13994a0 >= 300000) {
                    s0Var.f14005n.d();
                    s0Var.f13994a0 = 0L;
                    return;
                }
                return;
            case 15:
                ((lh.b) obj).invalidate();
                return;
            case 16:
                o60 o60Var = (o60) ((l2.f) obj).f14503b;
                o60Var.f27876p0 = true;
                FileLog.d("RoundVideo camera flip first frame: elapsedMs=" + o60.k(o60Var));
                o60Var.t(true);
                o60.l(o60Var);
                return;
            case 17:
                mh.c cVar = (mh.c) obj;
                GroupCallMessage groupCallMessage = cVar.H;
                if (groupCallMessage != null) {
                    cVar.f15834a.a(groupCallMessage.isSendDelayed(), true);
                    cVar.f15835b.a(cVar.H.isSendError(), true);
                    return;
                }
                return;
            case 18:
                n2.d dVar = (n2.d) obj;
                if (!dVar.f15943c) {
                    n2.g gVar = dVar.f15942b;
                    if (gVar != null) {
                        gVar.a(dVar.f15941a);
                    }
                    dVar.d.f15952x.remove(dVar);
                    dVar.f15943c = true;
                    return;
                }
                return;
            case 19:
                ((n2.b) obj).a(null);
                return;
            case 20:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, (f6) obj, Boolean.TRUE, null, -1);
                return;
            case 21:
                ((h5) obj).U0();
                return;
            case 22:
                lg1 lg1Var = (lg1) obj;
                if (lg1Var.getParentLayout() != null) {
                    lg1Var.H = true;
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", lg1Var.f37957a);
                    fo foVar = new fo(bundle);
                    foVar.f35993ja = true;
                    lg1Var.presentFragment(foVar);
                    return;
                }
                return;
            case 23:
                TLParseException.lambda$doThrowOrLog$0((TLParseException) obj);
                return;
            case 24:
                org.telegram.ui.Components.voip.l0 l0Var = (org.telegram.ui.Components.voip.l0) obj;
                l0Var.P0 = null;
                l0Var.setVisibleParticipant(true);
                return;
            case 25:
                org.telegram.ui.Components.voip.h1 h1Var = (org.telegram.ui.Components.voip.h1) obj;
                h1Var.K = false;
                h1Var.o(false);
                h1Var.W = false;
                return;
            case 26:
                org.telegram.ui.Components.voip.h1 h1Var2 = (org.telegram.ui.Components.voip.h1) ((mg.b) obj).f15765b;
                h1Var2.e.invalidate();
                if (!h1Var2.e.isInLayout()) {
                    h1Var2.e.requestLayout();
                    h1Var2.d.requestLayout();
                    h1Var2.f30214f.requestLayout();
                    return;
                }
                return;
            case 27:
                ((org.telegram.ui.Components.voip.g1) obj).f30188a.i(false);
                return;
            case 28:
                org.telegram.ui.Components.voip.f2 f2Var = (org.telegram.ui.Components.voip.f2) obj;
                f2Var.e = false;
                HashMap hashMap = f2Var.f30175a;
                ArrayList arrayList = f2Var.f30177c;
                ArrayList arrayList2 = f2Var.f30176b;
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
                            } else if (e2Var.f30162a.equals(((org.telegram.ui.Components.voip.e2) arrayList.get(i12)).f30162a)) {
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
                        f2Var.addView((View) arrayList2.get(i13), a6.t(-2, -2, 1, 4, 0, 0, 4));
                    }
                    for (int i14 = 0; i14 < arrayList.size(); i14++) {
                        f2Var.removeView((View) arrayList.get(i14));
                    }
                    hashMap.clear();
                    for (int i15 = 0; i15 < f2Var.getChildCount(); i15++) {
                        org.telegram.ui.Components.voip.e2 e2Var2 = (org.telegram.ui.Components.voip.e2) f2Var.getChildAt(i15);
                        hashMap.put(e2Var2.f30162a, e2Var2);
                    }
                    arrayList2.clear();
                    arrayList.clear();
                    f2Var.e = true;
                    AndroidUtilities.runOnUIThread(new t0(f2Var, 28), 700L);
                    Runnable runnable = f2Var.h;
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
                return;
            default:
                TextView[] textViewArr = ((o2) obj).f30386a;
                TextView textView = textViewArr[0];
                textViewArr[0] = textViewArr[1];
                textViewArr[1] = textView;
                return;
        }
    }
}
