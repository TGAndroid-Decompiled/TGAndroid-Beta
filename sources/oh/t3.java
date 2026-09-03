package oh;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLParseException;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.d90;
import org.telegram.ui.Components.jg0;
import org.telegram.ui.Components.xs;
import org.telegram.ui.Components.xt;
import org.telegram.ui.Stories.ProfileStoriesView;
public final class t3 implements Runnable {
    public final int f17766a;
    public final Object f17767b;

    public t3(Object obj, int i10) {
        this.f17766a = i10;
        this.f17767b = obj;
    }

    @Override
    public final void run() {
        boolean z4 = false;
        switch (this.f17766a) {
            case 0:
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f17767b;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack() != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
                    return;
                }
                return;
            case 1:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) this.f17767b;
                int i10 = ProfileStoriesView.f34841p0;
                profileStoriesView.getClass();
                AndroidUtilities.vibrateCursor(profileStoriesView);
                return;
            case 2:
                e5.a(((a5) this.f17767b).d);
                return;
            case 3:
                r5 r5Var = (r5) this.f17767b;
                if (r5Var.isShowing()) {
                    r5Var.q(true);
                    return;
                }
                return;
            case 4:
                ((qh.o7) this.f17767b).run();
                return;
            case 5:
                qh.t0 t0Var = (qh.t0) this.f17767b;
                t0Var.b(t0Var.f46116b);
                t0Var.f46117c = false;
                return;
            case 6:
                x6 x6Var = (x6) this.f17767b;
                x6Var.c();
                x6Var.a(true);
                return;
            case 7:
                ((w5) this.f17767b).accept(null);
                return;
            case 8:
                ((h7) this.f17767b).onDetachedFromWindow();
                return;
            case 9:
                q7 q7Var = (q7) this.f17767b;
                ArrayList arrayList = q7Var.f17666c;
                if (arrayList != null) {
                    q7Var.f17664a.f17122w1 = arrayList;
                }
                f4 f4Var = q7Var.f17664a;
                long j10 = q7Var.f17665b;
                if (f4Var.f17130y1 != j10 || f4Var.f17122w1 != null) {
                    f4Var.f17130y1 = j10;
                    f4Var.j1();
                    f4Var.i1();
                    f4Var.f1(true);
                    TL_stories.PeerStories peerStories = f4Var.G0.N0;
                    if (peerStories != null) {
                        f4Var.P1.S(peerStories, true);
                        return;
                    }
                    t6 t6Var = f4Var.P1;
                    TL_stories.PeerStories y10 = t6Var.y(j10);
                    if (y10 == null) {
                        y10 = t6Var.z(j10);
                        z4 = true;
                    }
                    t6Var.S(y10, z4);
                    return;
                }
                return;
            case 10:
                ((d90) this.f17767b).d(true);
                return;
            case 11:
                ((d8) this.f17767b).requestLayout();
                return;
            case 12:
                m8 m8Var = (m8) this.f17767b;
                qh.e3 e3Var = m8Var.f17464c;
                if (e3Var != null) {
                    e3Var.e(true);
                    m8Var.f17464c = null;
                }
                m8Var.b(false);
                return;
            case 13:
                k8 k8Var = (k8) this.f17767b;
                if (k8Var.v) {
                    k8Var.B = true;
                    k8Var.C = System.currentTimeMillis();
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    k8Var.f17377e = new LinearGradient(0.0f, 0.0f, 40.0f, 0.0f, new int[]{16777215, 771751935, 771751935, 16777215}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, tileMode);
                    k8Var.f17378f = new LinearGradient(0.0f, 0.0f, 40.0f, 0.0f, new int[]{16777215, 553648127, 553648127, 16777215}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, tileMode);
                    k8Var.invalidate();
                    return;
                }
                return;
            case 14:
                i9 i9Var = ((r8) this.f17767b).f17703b;
                try {
                    w8 w8Var = i9Var.f17295s;
                    if (w8Var != null) {
                        if (i9Var.f17257b) {
                            AndroidUtilities.removeFromParent(w8Var);
                        } else {
                            i9Var.f17283n.removeView(w8Var);
                        }
                        i9Var.f17295s = null;
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 15:
                ((w8) this.f17767b).F0.K(true);
                return;
            case 16:
                ((r9) this.f17767b).c();
                return;
            case 17:
                TLParseException.lambda$doThrowOrLog$0((TLParseException) this.f17767b);
                return;
            case 18:
                org.telegram.ui.Components.voip.l0 l0Var = (org.telegram.ui.Components.voip.l0) this.f17767b;
                l0Var.M0 = null;
                l0Var.setVisibleParticipant(true);
                return;
            case 19:
                org.telegram.ui.Components.voip.h1 h1Var = (org.telegram.ui.Components.voip.h1) this.f17767b;
                h1Var.H = false;
                h1Var.o(false);
                h1Var.T = false;
                return;
            case 20:
                org.telegram.ui.Components.voip.h1 h1Var2 = (org.telegram.ui.Components.voip.h1) ((jg0) this.f17767b).f28098b;
                h1Var2.f32075e.invalidate();
                if (!h1Var2.f32075e.isInLayout()) {
                    h1Var2.f32075e.requestLayout();
                    h1Var2.d.requestLayout();
                    h1Var2.f32076f.requestLayout();
                    return;
                }
                return;
            case 21:
                ((org.telegram.ui.Components.voip.g1) this.f17767b).f32051a.i(false);
                return;
            case 22:
                org.telegram.ui.Components.voip.i2 i2Var = (org.telegram.ui.Components.voip.i2) this.f17767b;
                i2Var.f32100e = false;
                HashMap hashMap = i2Var.f32097a;
                ArrayList arrayList2 = i2Var.f32099c;
                ArrayList arrayList3 = i2Var.f32098b;
                if (!arrayList3.isEmpty() || !arrayList2.isEmpty()) {
                    if (i2Var.getParent() != null) {
                        TransitionManager.beginDelayedTransition(i2Var, i2Var.d);
                    }
                    int i11 = 0;
                    while (i11 < arrayList3.size()) {
                        org.telegram.ui.Components.voip.h2 h2Var = (org.telegram.ui.Components.voip.h2) arrayList3.get(i11);
                        int i12 = 0;
                        while (true) {
                            if (i12 >= arrayList2.size()) {
                                break;
                            } else if (h2Var.f32083a.equals(((org.telegram.ui.Components.voip.h2) arrayList2.get(i12)).f32083a)) {
                                arrayList3.remove(i11);
                                arrayList2.remove(i12);
                                i11--;
                            } else {
                                i12++;
                            }
                        }
                        i11++;
                    }
                    for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                        i2Var.addView((View) arrayList3.get(i13), k7.c6.t(-2, -2, 1, 4, 0, 0, 4));
                    }
                    for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                        i2Var.removeView((View) arrayList2.get(i14));
                    }
                    hashMap.clear();
                    for (int i15 = 0; i15 < i2Var.getChildCount(); i15++) {
                        org.telegram.ui.Components.voip.h2 h2Var2 = (org.telegram.ui.Components.voip.h2) i2Var.getChildAt(i15);
                        hashMap.put(h2Var2.f32083a, h2Var2);
                    }
                    arrayList3.clear();
                    arrayList2.clear();
                    i2Var.f32100e = true;
                    AndroidUtilities.runOnUIThread(new t3(i2Var, 22), 700L);
                    Runnable runnable = i2Var.h;
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
                return;
            case 23:
                TextView[] textViewArr = ((org.telegram.ui.Components.voip.q2) this.f17767b).f32296a;
                TextView textView = textViewArr[0];
                textViewArr[0] = textViewArr[1];
                textViewArr[1] = textView;
                return;
            case 24:
                TextView[] textViewArr2 = ((org.telegram.ui.Components.voip.q2) ((xs) this.f17767b).f33169e).f32296a;
                TextView textView2 = textViewArr2[0];
                textViewArr2[0] = textViewArr2[1];
                textViewArr2[1] = textView2;
                return;
            case 25:
                org.telegram.ui.Components.voip.u2 u2Var = (org.telegram.ui.Components.voip.u2) this.f17767b;
                if (u2Var.getVisibility() == 0) {
                    u2Var.a();
                    return;
                }
                return;
            case 26:
                org.telegram.ui.Components.voip.y2 y2Var = (org.telegram.ui.Components.voip.y2) this.f17767b;
                y2Var.f32491e = Bitmap.createBitmap(y2Var.getMeasuredWidth(), y2Var.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                new Canvas(y2Var.f32491e).drawText(y2Var.d, y2Var.getMeasuredWidth() / 2, (int) ((y2Var.getMeasuredHeight() / 2) - ((y2Var.f32488a.ascent() + y2Var.f32488a.descent()) / 2.0f)), y2Var.f32488a);
                y2Var.postInvalidate();
                return;
            case 27:
                ((org.telegram.ui.web.k) this.f17767b).f42574w.V2.N(true);
                return;
            case 28:
                org.telegram.ui.web.i iVar = ((org.telegram.ui.web.o) this.f17767b).h.f42621e;
                if (iVar != null) {
                    iVar.d();
                    return;
                }
                return;
            default:
                ((xt) this.f17767b).requestFocus();
                return;
        }
    }
}
