package oi;

import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import c8.ma;
import hi.s6;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.gj;
import org.telegram.messenger.ls;
import org.telegram.tgnet.TLParseException;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.es0;
import org.telegram.ui.Components.g8;
import org.telegram.ui.Components.ot;
public final class c2 implements Runnable {
    public final int f22043a;
    public final Object f22044b;

    public c2(Object obj, int i7) {
        this.f22043a = i7;
        this.f22044b = obj;
    }

    @Override
    public final void run() {
        int L;
        Animation animation = null;
        int i7 = 0;
        switch (this.f22043a) {
            case 0:
                ((g2) this.f22044b).c();
                return;
            case 1:
                TLParseException.lambda$doThrowOrLog$0((TLParseException) this.f22044b);
                return;
            case 2:
                Drawable drawable = ActionBarLayout.f28707w1;
                org.telegram.messenger.g0.g3((ai.b1) this.f22044b);
                return;
            case 3:
                ((org.telegram.ui.ActionBar.p0) this.f22044b).setSelectedForDelete(false);
                return;
            case 4:
                org.telegram.ui.ActionBar.v0 v0Var = (org.telegram.ui.ActionBar.v0) this.f22044b;
                v0Var.f30110a0 = true;
                org.telegram.messenger.g0.l2(new s6(v0Var, 19), 8.0f);
                return;
            case 5:
                ((org.telegram.ui.ActionBar.i1) this.f22044b).c();
                return;
            case 6:
                org.telegram.ui.ActionBar.p1 p1Var = (org.telegram.ui.ActionBar.p1) this.f22044b;
                org.telegram.ui.ActionBar.t1 t1Var = p1Var.d;
                int i10 = org.telegram.messenger.g0.f24046q.x;
                t1Var.M = i10;
                int L2 = i10 - org.telegram.messenger.g0.L(56.0f);
                if (org.telegram.messenger.g0.Q1()) {
                    if (org.telegram.messenger.g0.P1()) {
                        L = org.telegram.messenger.g0.L(446.0f);
                    } else {
                        L = org.telegram.messenger.g0.L(496.0f);
                    }
                } else {
                    L = org.telegram.messenger.g0.L(356.0f);
                }
                int min = Math.min(L, L2);
                Rect rect = t1Var.B0;
                int i11 = min + rect.left + rect.right;
                if (t1Var.Y0) {
                    ViewGroup.LayoutParams layoutParams = p1Var.getLayoutParams();
                    if (layoutParams != null && layoutParams.width != i11) {
                        layoutParams.width = i11;
                        p1Var.requestLayout();
                        return;
                    }
                    return;
                }
                Window window = t1Var.getWindow();
                WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams();
                layoutParams2.copyFrom(window.getAttributes());
                layoutParams2.width = i11;
                try {
                    window.setAttributes(layoutParams2);
                    return;
                } catch (Throwable th2) {
                    a8.g(th2, true);
                    return;
                }
            case 7:
                org.telegram.ui.ActionBar.w1 w1Var = (org.telegram.ui.ActionBar.w1) this.f22044b;
                w1Var.n1.setVisibility(0);
                w1Var.f30167p1.setAlpha(0.0f);
                int i12 = w1Var.l1;
                if (i12 != 0 && i12 != -1) {
                    try {
                        animation = AnimationUtils.loadAnimation(w1Var.getContext(), i12);
                    } catch (Resources.NotFoundException e10) {
                        a8.g(e10, true);
                    }
                }
                if (animation != null) {
                    w1Var.f30166o1.startAnimation(animation);
                } else {
                    w1Var.f30166o1.setAlpha(0.0f);
                    w1Var.f30166o1.animate().setDuration(300L).alpha(1.0f).start();
                }
                w1Var.f30167p1.animate().setDuration(300L).alpha(1.0f).setListener(new org.telegram.ui.ActionBar.u1(w1Var, 0)).start();
                return;
            case 8:
                org.telegram.ui.ActionBar.w2 w2Var = (org.telegram.ui.ActionBar.w2) ((ki.e2) this.f22044b).f18667c;
                DialogInterface.OnDismissListener onDismissListener = w2Var.I0;
                if (onDismissListener != null) {
                    onDismissListener.onDismiss(w2Var);
                }
                try {
                    w2Var.L();
                    return;
                } catch (Exception e11) {
                    a8.g(e11, true);
                    return;
                }
            case 9:
                try {
                    ((org.telegram.ui.ActionBar.o2) this.f22044b).f29846b.L();
                    return;
                } catch (Exception e12) {
                    a8.g(e12, true);
                    return;
                }
            case 10:
                org.telegram.ui.ActionBar.j3 j3Var = (org.telegram.ui.ActionBar.j3) this.f22044b;
                if (j3Var.mo25d() != null) {
                    j3Var.mo25d().setDrawingFromOverlay(true);
                    return;
                }
                return;
            case 11:
                ((org.telegram.ui.ActionBar.m3) this.f22044b).f();
                return;
            case 12:
                org.telegram.ui.ActionBar.j4 j4Var = (org.telegram.ui.ActionBar.j4) ((androidx.mediarouter.app.f0) this.f22044b).f2689b;
                j4Var.k();
                j4Var.j();
                return;
            case 13:
                org.telegram.ui.ActionBar.j4 j4Var2 = ((org.telegram.ui.ActionBar.g4) this.f22044b).f28985b;
                j4Var2.f29052c.dismiss();
                j4Var2.f29054f.removeAllViews();
                return;
            case 14:
                ((org.telegram.ui.ActionBar.g4) this.f22044b).f28985b.f29052c.dismiss();
                return;
            case 15:
                Drawable drawable2 = (Drawable) this.f22044b;
                m6.d = null;
                m6.P();
                if (!m6.f29337b) {
                    m6.j(drawable2);
                    m6.h(drawable2);
                }
                ls.e().k(279, new Object[0]);
                return;
            case 16:
                g8 g8Var = (g8) m6.f29399e5.remove((gj) this.f22044b);
                if (g8Var != null) {
                    g8Var.f35457i = null;
                    return;
                }
                return;
            case 17:
                org.telegram.ui.Components.voip.k0 k0Var = (org.telegram.ui.Components.voip.k0) this.f22044b;
                k0Var.Q0 = null;
                k0Var.setVisibleParticipant(true);
                return;
            case 18:
                org.telegram.ui.Components.voip.s0 s0Var = (org.telegram.ui.Components.voip.s0) this.f22044b;
                long uptimeMillis = SystemClock.uptimeMillis();
                ArrayList arrayList = s0Var.f41335a;
                ArrayList arrayList2 = new ArrayList(arrayList);
                int size = arrayList2.size();
                while (i7 < size) {
                    Object obj = arrayList2.get(i7);
                    i7++;
                    org.telegram.ui.Components.voip.r0 r0Var = (org.telegram.ui.Components.voip.r0) obj;
                    if (r0Var.f41315b && uptimeMillis - r0Var.f41316c > 5000) {
                        arrayList.remove(r0Var);
                        s0Var.removeView(r0Var);
                    }
                }
                c2 c2Var = s0Var.h;
                s0Var.removeCallbacks(c2Var);
                if (!arrayList.isEmpty()) {
                    s0Var.postDelayed(c2Var, 500L);
                    return;
                }
                return;
            case 19:
                org.telegram.ui.Components.voip.j1 j1Var = ((org.telegram.ui.Components.voip.g1) this.f22044b).h;
                wi.n nVar = j1Var.f41086a;
                if (nVar != null) {
                    nVar.c();
                }
                org.telegram.ui.Components.voip.i1 i1Var = j1Var.f41090f;
                if (i1Var != null) {
                    i1Var.a();
                    return;
                }
                return;
            case 20:
                org.telegram.ui.Components.voip.d2 d2Var = (org.telegram.ui.Components.voip.d2) this.f22044b;
                d2Var.f40957e = false;
                HashMap hashMap = d2Var.f40954a;
                ArrayList arrayList3 = d2Var.f40956c;
                ArrayList arrayList4 = d2Var.f40955b;
                if (!arrayList4.isEmpty() || !arrayList3.isEmpty()) {
                    if (d2Var.getParent() != null) {
                        TransitionManager.beginDelayedTransition(d2Var, d2Var.d);
                    }
                    int i13 = 0;
                    while (i13 < arrayList4.size()) {
                        org.telegram.ui.Components.voip.c2 c2Var2 = (org.telegram.ui.Components.voip.c2) arrayList4.get(i13);
                        int i14 = 0;
                        while (true) {
                            if (i14 >= arrayList3.size()) {
                                break;
                            } else if (c2Var2.f40935a.equals(((org.telegram.ui.Components.voip.c2) arrayList3.get(i14)).f40935a)) {
                                arrayList4.remove(i13);
                                arrayList3.remove(i14);
                                i13--;
                            } else {
                                i14++;
                            }
                        }
                        i13++;
                    }
                    for (int i15 = 0; i15 < arrayList4.size(); i15++) {
                        d2Var.addView((View) arrayList4.get(i15), ma.t(-2, -2, 1, 4, 0, 0, 4));
                    }
                    for (int i16 = 0; i16 < arrayList3.size(); i16++) {
                        d2Var.removeView((View) arrayList3.get(i16));
                    }
                    hashMap.clear();
                    while (i7 < d2Var.getChildCount()) {
                        org.telegram.ui.Components.voip.c2 c2Var3 = (org.telegram.ui.Components.voip.c2) d2Var.getChildAt(i7);
                        hashMap.put(c2Var3.f40935a, c2Var3);
                        i7++;
                    }
                    arrayList4.clear();
                    arrayList3.clear();
                    d2Var.f40957e = true;
                    org.telegram.messenger.g0.h3(new c2(d2Var, 20), 700L);
                    Runnable runnable = d2Var.h;
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
                return;
            case 21:
                TextView[] textViewArr = ((org.telegram.ui.Components.voip.k2) this.f22044b).f41145a;
                TextView textView = textViewArr[0];
                textViewArr[0] = textViewArr[1];
                textViewArr[1] = textView;
                return;
            case 22:
                TextView[] textViewArr2 = ((org.telegram.ui.Components.voip.k2) ((jg.j0) this.f22044b).f17572e).f41145a;
                TextView textView2 = textViewArr2[0];
                textViewArr2[0] = textViewArr2[1];
                textViewArr2[1] = textView2;
                return;
            case 23:
                org.telegram.ui.Components.voip.o2 o2Var = (org.telegram.ui.Components.voip.o2) this.f22044b;
                if (o2Var.getVisibility() == 0) {
                    o2Var.a();
                    return;
                }
                return;
            case 24:
                org.telegram.ui.Components.voip.s2 s2Var = (org.telegram.ui.Components.voip.s2) this.f22044b;
                s2Var.f41354e = Bitmap.createBitmap(s2Var.getMeasuredWidth(), s2Var.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                new Canvas(s2Var.f41354e).drawText(s2Var.d, s2Var.getMeasuredWidth() / 2, (int) ((s2Var.getMeasuredHeight() / 2) - ((s2Var.f41351a.ascent() + s2Var.f41351a.descent()) / 2.0f)), s2Var.f41351a);
                s2Var.postInvalidate();
                return;
            case 25:
                ((org.telegram.ui.web.k) this.f22044b).f53219x.f35789g3.O(true);
                return;
            case 26:
                org.telegram.ui.web.i iVar = ((org.telegram.ui.web.m) ((hi.s2) this.f22044b).f15369c).f53233f;
                if (iVar != null) {
                    iVar.d();
                    return;
                }
                return;
            case 27:
                ((ot) this.f22044b).requestFocus();
                return;
            case 28:
                vf.c.t(((org.telegram.ui.web.o0) this.f22044b).f53265b.f53277e.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                return;
            default:
                hi.s2 s2Var2 = (hi.s2) this.f22044b;
                Utilities.f22812g.c(new es0((Object) s2Var2, (Object) new ArrayList(((org.telegram.ui.web.x0) s2Var2.f15369c).f53396f), (Serializable) ((org.telegram.ui.web.x0) s2Var2.f15369c).f53398r, 14));
                return;
        }
    }
}
