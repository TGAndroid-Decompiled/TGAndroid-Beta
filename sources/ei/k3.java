package ei;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.d60;
import org.telegram.ui.Components.ey;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.fh0;
import org.telegram.ui.Components.k40;
import org.telegram.ui.Components.lt;
import org.telegram.ui.Components.n30;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.wz0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.g11;
import org.telegram.ui.uw;
import org.telegram.ui.xt0;
public final class k3 extends AnimatorListenerAdapter {
    public final int f10564a;
    public final Object f10565b;
    public final Object f10566c;
    public final Object d;

    public k3(Object obj, Object obj2, Object obj3, int i3) {
        this.f10564a = i3;
        this.d = obj;
        this.f10565b = obj2;
        this.f10566c = obj3;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f10564a) {
            case 6:
                ey eyVar = (ey) this.d;
                if (animator.equals(eyVar.N0)) {
                    eyVar.N0 = null;
                    return;
                }
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i3;
        int i10;
        switch (this.f10564a) {
            case 0:
                e7 e7Var = (e7) this.f10566c;
                l3 l3Var = (l3) this.d;
                j4 j4Var = l3Var.f10604a;
                j4Var.f10454e3 = false;
                j4Var.f10457f3 = 1.0f;
                j4Var.invalidate();
                boolean[] zArr = (boolean[]) this.f10565b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    j4 j4Var2 = l3Var.f10604a;
                    j4Var2.f10443a3 = true;
                    try {
                        j4Var2.performHapticFeedback(3);
                    } catch (Exception unused) {
                    }
                }
                e7Var.setAllowDrawReaction(true);
                e7Var.f10234r = true;
                ImageReceiver imageReceiver = e7Var.f10231e;
                if (imageReceiver.B() != null) {
                    imageReceiver.B().N(0, false, true);
                }
                j4 j4Var3 = l3Var.f10604a;
                org.telegram.ui.Components.g5 g5Var = j4Var3.Y2;
                if (g5Var != null) {
                    g5Var.n(j4Var3);
                    l3Var.f10604a.Y2 = null;
                    return;
                }
                return;
            case 1:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.d).f27342y.remove((AnimatorSet) this.f10565b);
                View view = (View) this.f10566c;
                if (view instanceof org.telegram.ui.ActionBar.y0) {
                    fh0 fh0Var = ((org.telegram.ui.ActionBar.y0) view).f28814c;
                    if (fh0Var.getAnimatedDrawable() != null) {
                        fh0Var.getAnimatedDrawable().start();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                org.telegram.ui.ActionBar.j3 j3Var = (org.telegram.ui.ActionBar.j3) this.d;
                org.telegram.ui.ActionBar.g3 g3Var = (org.telegram.ui.ActionBar.g3) this.f10566c;
                org.telegram.ui.ActionBar.a3 a3Var = (org.telegram.ui.ActionBar.a3) this.f10565b;
                ViewGroup viewGroup = a3Var.f27352b;
                if (viewGroup == null) {
                    viewGroup = a3Var.f27353c;
                }
                if (viewGroup != null && a3Var.f27361m == null && (i3 = a3Var.f27356g) > 0 && (i10 = a3Var.h) > 0) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        org.telegram.ui.ActionBar.j3.g(viewGroup, -a3Var.f27357i, new mi.f(6, a3Var, g3Var));
                        j3Var.f27655b = null;
                        j3Var.invalidate();
                        return;
                    }
                    a3Var.f27361m = Bitmap.createBitmap(i3, i10, Bitmap.Config.RGB_565);
                    Canvas canvas = new Canvas(a3Var.f27361m);
                    canvas.translate(0.0f, -a3Var.f27357i);
                    viewGroup.draw(canvas);
                }
                g3Var.mo25d().setDrawingFromOverlay(false);
                g3Var.release();
                j3Var.f27655b = null;
                j3Var.invalidate();
                return;
            case 3:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.d;
                ViewGroup viewGroup2 = (ViewGroup) this.f10565b;
                if (viewGroup2 != null) {
                    chatActivityEnterView.f31163n1.removeView(chatActivityEnterView.f31118f1);
                    viewGroup2.addView(chatActivityEnterView.f31118f1, (ViewGroup.LayoutParams) this.f10566c);
                }
                chatActivityEnterView.f31118f1.setAlpha(1.0f);
                chatActivityEnterView.f31136i1.setAlpha(1.0f);
                chatActivityEnterView.h = 0.0f;
                chatActivityEnterView.f31161n = 0.0f;
                chatActivityEnterView.G1();
                ii.a0 a0Var = chatActivityEnterView.m0;
                if (a0Var != null) {
                    a0Var.setAlpha(0.0f);
                    chatActivityEnterView.m0.setScaleX(0.0f);
                    chatActivityEnterView.m0.setScaleY(0.0f);
                }
                if (chatActivityEnterView.P1 != null && chatActivityEnterView.Q && !chatActivityEnterView.P && hp.e1().getInt("voiceoncehint", 0) < 3) {
                    chatActivityEnterView.P1.b();
                    return;
                }
                return;
            case 4:
                ((ChatAttachAlertPhotoLayout) this.d).U = false;
                ((View) this.f10565b).setVisibility(4);
                ((ImageView) this.f10566c).sendAccessibilityEvent(8);
                return;
            case 5:
                if (((b4.n) this.d).f2377a) {
                    ((View) this.f10566c).postDelayed((lt) this.f10565b, 300L);
                    return;
                }
                return;
            case 6:
                tj0 tj0Var = (tj0) this.f10566c;
                u4.s sVar = (u4.s) this.f10565b;
                ey eyVar = (ey) this.d;
                if (animator.equals(eyVar.N0)) {
                    int L0 = sVar.L0();
                    tj0Var.setTranslationY(0.0f);
                    if (tj0Var == eyVar.E0) {
                        tj0Var.setPadding(0, org.telegram.messenger.g0.L(36.0f), 0, org.telegram.messenger.g0.L(44.0f) + eyVar.f33573r2);
                    } else if (tj0Var == eyVar.f33545i0) {
                        tj0Var.setPadding(0, eyVar.f33527c1, 0, org.telegram.messenger.g0.L(44.0f) + eyVar.f33573r2);
                    } else if (tj0Var == eyVar.Q) {
                        tj0Var.setPadding(org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(44.0f) + eyVar.f33573r2);
                    }
                    if (L0 != -1) {
                        sVar.h1(L0, 0);
                    }
                    eyVar.N0 = null;
                    return;
                }
                return;
            case 7:
                k40 k40Var = (k40) this.d;
                super.onAnimationEnd(animator);
                boolean[] zArr2 = (boolean[]) this.f10565b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    ((n30) this.f10566c).run();
                }
                k40Var.f35275f.setRotationY(0.0f);
                k40Var.f35295r0.setRotationY(0.0f);
                k40Var.O0 = false;
                k40Var.invalidate();
                return;
            case 8:
                d60 d60Var = (d60) this.f10565b;
                d60Var.setProgress(0.0f);
                d60Var.invalidate();
                org.telegram.messenger.g0.E2(d60Var);
                ViewTreeObserver viewTreeObserver = ((ViewGroup) this.f10566c).getViewTreeObserver();
                f60 f60Var = (f60) this.d;
                View view2 = f60Var.f33724f;
                viewTreeObserver.removeOnPreDrawListener(f60Var.f33752y);
                if (f60Var.P) {
                    view2.setVisibility(0);
                    if (view2 instanceof ai.q2) {
                        ai.q2 q2Var = (ai.q2) view2;
                        FrameLayout frameLayout = q2Var.d;
                        frameLayout.invalidate();
                        frameLayout.invalidateDrawable(q2Var.f898e);
                        return;
                    }
                    return;
                }
                return;
            case 9:
                org.telegram.ui.Components.voip.x xVar = (org.telegram.ui.Components.voip.x) this.d;
                xVar.O0 = null;
                ((org.telegram.ui.Components.voip.r) this.f10565b).F = false;
                org.telegram.ui.Components.voip.r rVar = xVar.F;
                if (rVar != null) {
                    if (rVar.getParent() != null) {
                        xVar.removeView(xVar.F);
                        ((org.telegram.ui.Components.voip.r) this.f10566c).e();
                    }
                    xVar.F = null;
                    return;
                }
                return;
            case 10:
                LaunchActivity launchActivity = (LaunchActivity) this.d;
                launchActivity.H0 = null;
                launchActivity.A0.invalidate();
                launchActivity.f41310p0.invalidate();
                launchActivity.f41310p0.setImageDrawable(null);
                wz0 wz0Var = launchActivity.f41310p0;
                wz0Var.f40176c = null;
                wz0Var.f40174a.setShader(null);
                wz0Var.f40179n = null;
                wz0Var.f40180r = null;
                launchActivity.f41310p0.setVisibility(8);
                launchActivity.f41312q0.setVisibility(8);
                fh0 fh0Var2 = (fh0) this.f10565b;
                if (fh0Var2 != null) {
                    fh0Var2.setImageDrawable((ch0) this.f10566c);
                }
                hs.e().k(267, new Object[0]);
                if (fh0Var2 != null) {
                    fh0Var2.setVisibility(0);
                }
                uw.f50199y4 = false;
                return;
            default:
                g11 g11Var = (g11) this.d;
                g11Var.f45479t1 = null;
                g11Var.invalidate();
                boolean[] zArr3 = (boolean[]) this.f10565b;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    ((xt0) this.f10566c).run();
                    return;
                }
                return;
        }
    }

    public k3(b4.n nVar, View view) {
        this.f10564a = 5;
        this.d = nVar;
        this.f10566c = view;
        this.f10565b = new lt(this, 0);
    }
}
