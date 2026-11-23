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
import c8.na;
import hi.c7;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.fj;
import org.telegram.messenger.ks;
import org.telegram.tgnet.TLParseException;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.as0;
import org.telegram.ui.Components.f8;
import org.telegram.ui.Components.mt;
public final class c2 implements Runnable {
    public final int f22109a;
    public final Object f22110b;

    public c2(Object obj, int i7) {
        this.f22109a = i7;
        this.f22110b = obj;
    }

    @Override
    public final void run() {
        int L;
        Animation animation = null;
        int i7 = 0;
        switch (this.f22109a) {
            case 0:
                ((g2) this.f22110b).c();
                return;
            case 1:
                TLParseException.lambda$doThrowOrLog$0((TLParseException) this.f22110b);
                return;
            case 2:
                Drawable drawable = ActionBarLayout.f28765w1;
                org.telegram.messenger.g0.g3((ai.x0) this.f22110b);
                return;
            case 3:
                ((org.telegram.ui.ActionBar.p0) this.f22110b).setSelectedForDelete(false);
                return;
            case 4:
                org.telegram.ui.ActionBar.v0 v0Var = (org.telegram.ui.ActionBar.v0) this.f22110b;
                v0Var.f30170a0 = true;
                org.telegram.messenger.g0.l2(new c7(v0Var, 19), 8.0f);
                return;
            case 5:
                ((org.telegram.ui.ActionBar.i1) this.f22110b).c();
                return;
            case 6:
                org.telegram.ui.ActionBar.p1 p1Var = (org.telegram.ui.ActionBar.p1) this.f22110b;
                org.telegram.ui.ActionBar.t1 t1Var = p1Var.d;
                int i10 = org.telegram.messenger.g0.f24226q.x;
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
                org.telegram.ui.ActionBar.w1 w1Var = (org.telegram.ui.ActionBar.w1) this.f22110b;
                w1Var.n1.setVisibility(0);
                w1Var.f30217p1.setAlpha(0.0f);
                int i12 = w1Var.l1;
                if (i12 != 0 && i12 != -1) {
                    try {
                        animation = AnimationUtils.loadAnimation(w1Var.getContext(), i12);
                    } catch (Resources.NotFoundException e10) {
                        a8.g(e10, true);
                    }
                }
                if (animation != null) {
                    w1Var.f30216o1.startAnimation(animation);
                } else {
                    w1Var.f30216o1.setAlpha(0.0f);
                    w1Var.f30216o1.animate().setDuration(300L).alpha(1.0f).start();
                }
                w1Var.f30217p1.animate().setDuration(300L).alpha(1.0f).setListener(new org.telegram.ui.ActionBar.u1(w1Var, 0)).start();
                return;
            case 8:
                org.telegram.ui.ActionBar.w2 w2Var = (org.telegram.ui.ActionBar.w2) ((ki.e2) this.f22110b).f18734c;
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
                    ((org.telegram.ui.ActionBar.o2) this.f22110b).f29892b.L();
                    return;
                } catch (Exception e12) {
                    a8.g(e12, true);
                    return;
                }
            case 10:
                org.telegram.ui.ActionBar.j3 j3Var = (org.telegram.ui.ActionBar.j3) this.f22110b;
                if (j3Var.mo25d() != null) {
                    j3Var.mo25d().setDrawingFromOverlay(true);
                    return;
                }
                return;
            case 11:
                ((org.telegram.ui.ActionBar.m3) this.f22110b).f();
                return;
            case 12:
                org.telegram.ui.ActionBar.j4 j4Var = (org.telegram.ui.ActionBar.j4) ((androidx.mediarouter.app.f0) this.f22110b).f2641b;
                j4Var.k();
                j4Var.j();
                return;
            case 13:
                org.telegram.ui.ActionBar.j4 j4Var2 = ((org.telegram.ui.ActionBar.g4) this.f22110b).f29044b;
                j4Var2.f29105c.dismiss();
                j4Var2.f29107f.removeAllViews();
                return;
            case 14:
                ((org.telegram.ui.ActionBar.g4) this.f22110b).f29044b.f29105c.dismiss();
                return;
            case 15:
                Drawable drawable2 = (Drawable) this.f22110b;
                n6.d = null;
                n6.P();
                if (!n6.f29407b) {
                    n6.j(drawable2);
                    n6.h(drawable2);
                }
                ks.e().k(279, new Object[0]);
                return;
            case 16:
                f8 f8Var = (f8) n6.f29469e5.remove((fj) this.f22110b);
                if (f8Var != null) {
                    f8Var.f35046i = null;
                    return;
                }
                return;
            case 17:
                org.telegram.ui.Components.voip.l0 l0Var = (org.telegram.ui.Components.voip.l0) this.f22110b;
                l0Var.Q0 = null;
                l0Var.setVisibleParticipant(true);
                return;
            case 18:
                org.telegram.ui.Components.voip.t0 t0Var = (org.telegram.ui.Components.voip.t0) this.f22110b;
                long uptimeMillis = SystemClock.uptimeMillis();
                ArrayList arrayList = t0Var.f41231a;
                ArrayList arrayList2 = new ArrayList(arrayList);
                int size = arrayList2.size();
                while (i7 < size) {
                    Object obj = arrayList2.get(i7);
                    i7++;
                    org.telegram.ui.Components.voip.s0 s0Var = (org.telegram.ui.Components.voip.s0) obj;
                    if (s0Var.f41211b && uptimeMillis - s0Var.f41212c > 5000) {
                        arrayList.remove(s0Var);
                        t0Var.removeView(s0Var);
                    }
                }
                c2 c2Var = t0Var.h;
                t0Var.removeCallbacks(c2Var);
                if (!arrayList.isEmpty()) {
                    t0Var.postDelayed(c2Var, 500L);
                    return;
                }
                return;
            case 19:
                org.telegram.ui.Components.voip.k1 k1Var = ((org.telegram.ui.Components.voip.h1) this.f22110b).h;
                wi.n nVar = k1Var.f40990a;
                if (nVar != null) {
                    nVar.c();
                }
                org.telegram.ui.Components.voip.j1 j1Var = k1Var.f40994f;
                if (j1Var != null) {
                    j1Var.a();
                    return;
                }
                return;
            case 20:
                org.telegram.ui.Components.voip.e2 e2Var = (org.telegram.ui.Components.voip.e2) this.f22110b;
                e2Var.f40864e = false;
                HashMap hashMap = e2Var.f40861a;
                ArrayList arrayList3 = e2Var.f40863c;
                ArrayList arrayList4 = e2Var.f40862b;
                if (!arrayList4.isEmpty() || !arrayList3.isEmpty()) {
                    if (e2Var.getParent() != null) {
                        TransitionManager.beginDelayedTransition(e2Var, e2Var.d);
                    }
                    int i13 = 0;
                    while (i13 < arrayList4.size()) {
                        org.telegram.ui.Components.voip.d2 d2Var = (org.telegram.ui.Components.voip.d2) arrayList4.get(i13);
                        int i14 = 0;
                        while (true) {
                            if (i14 >= arrayList3.size()) {
                                break;
                            } else if (d2Var.f40828a.equals(((org.telegram.ui.Components.voip.d2) arrayList3.get(i14)).f40828a)) {
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
                        e2Var.addView((View) arrayList4.get(i15), na.t(-2, -2, 1, 4, 0, 0, 4));
                    }
                    for (int i16 = 0; i16 < arrayList3.size(); i16++) {
                        e2Var.removeView((View) arrayList3.get(i16));
                    }
                    hashMap.clear();
                    while (i7 < e2Var.getChildCount()) {
                        org.telegram.ui.Components.voip.d2 d2Var2 = (org.telegram.ui.Components.voip.d2) e2Var.getChildAt(i7);
                        hashMap.put(d2Var2.f40828a, d2Var2);
                        i7++;
                    }
                    arrayList4.clear();
                    arrayList3.clear();
                    e2Var.f40864e = true;
                    org.telegram.messenger.g0.h3(new c2(e2Var, 20), 700L);
                    Runnable runnable = e2Var.h;
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
                return;
            case 21:
                TextView[] textViewArr = ((org.telegram.ui.Components.voip.l2) this.f22110b).f41039a;
                TextView textView = textViewArr[0];
                textViewArr[0] = textViewArr[1];
                textViewArr[1] = textView;
                return;
            case 22:
                TextView[] textViewArr2 = ((org.telegram.ui.Components.voip.l2) ((jg.j0) this.f22110b).f17640e).f41039a;
                TextView textView2 = textViewArr2[0];
                textViewArr2[0] = textViewArr2[1];
                textViewArr2[1] = textView2;
                return;
            case 23:
                org.telegram.ui.Components.voip.p2 p2Var = (org.telegram.ui.Components.voip.p2) this.f22110b;
                if (p2Var.getVisibility() == 0) {
                    p2Var.a();
                    return;
                }
                return;
            case 24:
                org.telegram.ui.Components.voip.t2 t2Var = (org.telegram.ui.Components.voip.t2) this.f22110b;
                t2Var.f41250e = Bitmap.createBitmap(t2Var.getMeasuredWidth(), t2Var.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                new Canvas(t2Var.f41250e).drawText(t2Var.d, t2Var.getMeasuredWidth() / 2, (int) ((t2Var.getMeasuredHeight() / 2) - ((t2Var.f41247a.ascent() + t2Var.f41247a.descent()) / 2.0f)), t2Var.f41247a);
                t2Var.postInvalidate();
                return;
            case 25:
                ((org.telegram.ui.web.k) this.f22110b).f53454x.f35323g3.O(true);
                return;
            case 26:
                org.telegram.ui.web.i iVar = ((org.telegram.ui.web.m) ((hi.b3) this.f22110b).f14223c).f53468f;
                if (iVar != null) {
                    iVar.d();
                    return;
                }
                return;
            case 27:
                ((mt) this.f22110b).requestFocus();
                return;
            case 28:
                vf.c.t(((org.telegram.ui.web.o0) this.f22110b).f53500b.f53512e.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                return;
            default:
                hi.b3 b3Var = (hi.b3) this.f22110b;
                Utilities.f22879g.c(new as0(b3Var, new ArrayList(((org.telegram.ui.web.x0) b3Var.f14223c).f53632f), ((org.telegram.ui.web.x0) b3Var.f14223c).f53634r, 15));
                return;
        }
    }
}
