package fi;

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
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.c40;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.g01;
import org.telegram.ui.Components.gk;
import org.telegram.ui.Components.mh0;
import org.telegram.ui.Components.ph0;
import org.telegram.ui.Components.ry;
import org.telegram.ui.Components.u60;
import org.telegram.ui.Components.x60;
import org.telegram.ui.Components.y60;
import org.telegram.ui.Components.z40;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.cx;
import org.telegram.ui.r11;
import org.telegram.ui.wt0;
public final class a3 extends AnimatorListenerAdapter {
    public final int f11718a;
    public final Object f11719b;
    public final Object f11720c;
    public final Object d;

    public a3(Object obj, Object obj2, Object obj3, int i7) {
        this.f11718a = i7;
        this.d = obj;
        this.f11719b = obj2;
        this.f11720c = obj3;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f11718a) {
            case 6:
                ry ryVar = (ry) this.d;
                if (animator.equals(ryVar.N0)) {
                    ryVar.N0 = null;
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
        int i7;
        int i10;
        switch (this.f11718a) {
            case 0:
                u6 u6Var = (u6) this.f11720c;
                b3 b3Var = (b3) this.d;
                z3 z3Var = b3Var.f11764a;
                z3Var.f12820e3 = false;
                z3Var.f12823f3 = 1.0f;
                z3Var.invalidate();
                boolean[] zArr = (boolean[]) this.f11719b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    z3 z3Var2 = b3Var.f11764a;
                    z3Var2.f12809a3 = true;
                    try {
                        z3Var2.performHapticFeedback(3);
                    } catch (Exception unused) {
                    }
                }
                u6Var.setAllowDrawReaction(true);
                u6Var.f12621r = true;
                ImageReceiver imageReceiver = u6Var.f12618e;
                if (imageReceiver.B() != null) {
                    imageReceiver.B().N(0, false, true);
                }
                z3 z3Var3 = b3Var.f11764a;
                org.telegram.ui.Components.o5 o5Var = z3Var3.Y2;
                if (o5Var != null) {
                    o5Var.n(z3Var3);
                    b3Var.f11764a.Y2 = null;
                    return;
                }
                return;
            case 1:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.d).f28743y.remove((AnimatorSet) this.f11719b);
                View view = (View) this.f11720c;
                if (view instanceof org.telegram.ui.ActionBar.z0) {
                    ph0 ph0Var = ((org.telegram.ui.ActionBar.z0) view).f30303c;
                    if (ph0Var.getAnimatedDrawable() != null) {
                        ph0Var.getAnimatedDrawable().start();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                org.telegram.ui.ActionBar.n3 n3Var = (org.telegram.ui.ActionBar.n3) this.d;
                org.telegram.ui.ActionBar.k3 k3Var = (org.telegram.ui.ActionBar.k3) this.f11720c;
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.f11719b;
                ViewGroup viewGroup = f3Var.f28926b;
                if (viewGroup == null) {
                    viewGroup = f3Var.f28927c;
                }
                if (viewGroup != null && f3Var.f28935m == null && (i7 = f3Var.f28930g) > 0 && (i10 = f3Var.h) > 0) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        org.telegram.ui.ActionBar.n3.g(viewGroup, -f3Var.f28931i, new org.telegram.ui.ActionBar.c3(f3Var, k3Var));
                        n3Var.f29272b = null;
                        n3Var.invalidate();
                        return;
                    }
                    f3Var.f28935m = Bitmap.createBitmap(i7, i10, Bitmap.Config.RGB_565);
                    Canvas canvas = new Canvas(f3Var.f28935m);
                    canvas.translate(0.0f, -f3Var.f28931i);
                    viewGroup.draw(canvas);
                }
                k3Var.mo25d().setDrawingFromOverlay(false);
                k3Var.release();
                n3Var.f29272b = null;
                n3Var.invalidate();
                return;
            case 3:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.d;
                ViewGroup viewGroup2 = (ViewGroup) this.f11719b;
                if (viewGroup2 != null) {
                    chatActivityEnterView.f32542a2.removeView(chatActivityEnterView.f32584f1);
                    viewGroup2.addView(chatActivityEnterView.f32584f1, (ViewGroup.LayoutParams) this.f11720c);
                }
                chatActivityEnterView.f32584f1.setAlpha(1.0f);
                chatActivityEnterView.f32607i1.setAlpha(1.0f);
                chatActivityEnterView.h = 0.0f;
                chatActivityEnterView.f32642n = 0.0f;
                chatActivityEnterView.i2();
                ki.z zVar = chatActivityEnterView.m0;
                if (zVar != null) {
                    zVar.setAlpha(0.0f);
                    chatActivityEnterView.m0.setScaleX(0.0f);
                    chatActivityEnterView.m0.setScaleY(0.0f);
                }
                if (chatActivityEnterView.C2 != null && chatActivityEnterView.Q && !chatActivityEnterView.P && mp.g1().getInt("voiceoncehint", 0) < 3) {
                    chatActivityEnterView.C2.i();
                    return;
                }
                return;
            case 4:
                ((ChatAttachAlertPhotoLayout) this.d).U = false;
                ((View) this.f11719b).setVisibility(4);
                ((ImageView) this.f11720c).sendAccessibilityEvent(8);
                return;
            case 5:
                if (((ab.q) this.d).f987a) {
                    ((View) this.f11720c).postDelayed((gk) this.f11719b, 300L);
                    return;
                }
                return;
            case 6:
                ck0 ck0Var = (ck0) this.f11720c;
                v4.t tVar = (v4.t) this.f11719b;
                ry ryVar = (ry) this.d;
                if (animator.equals(ryVar.N0)) {
                    int L0 = tVar.L0();
                    ck0Var.setTranslationY(0.0f);
                    if (ck0Var == ryVar.E0) {
                        ck0Var.setPadding(0, org.telegram.messenger.g0.L(36.0f), 0, org.telegram.messenger.g0.L(44.0f) + ryVar.f39388r2);
                    } else if (ck0Var == ryVar.f39360i0) {
                        ck0Var.setPadding(0, ryVar.f39342c1, 0, org.telegram.messenger.g0.L(44.0f) + ryVar.f39388r2);
                    } else if (ck0Var == ryVar.Q) {
                        ck0Var.setPadding(org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(44.0f) + ryVar.f39388r2);
                    }
                    if (L0 != -1) {
                        tVar.h1(L0, 0);
                    }
                    ryVar.N0 = null;
                    return;
                }
                return;
            case 7:
                z40 z40Var = (z40) this.d;
                super.onAnimationEnd(animator);
                boolean[] zArr2 = (boolean[]) this.f11719b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    ((c40) this.f11720c).run();
                }
                z40Var.f42773f.setRotationY(0.0f);
                z40Var.f42793r0.setRotationY(0.0f);
                z40Var.O0 = false;
                z40Var.invalidate();
                return;
            case 8:
                u60 u60Var = (u60) this.f11719b;
                u60Var.setProgress(0.0f);
                u60Var.invalidate();
                org.telegram.messenger.g0.E2(u60Var);
                ViewTreeObserver viewTreeObserver = ((ViewGroup) this.f11720c).getViewTreeObserver();
                y60 y60Var = (y60) this.d;
                View view2 = y60Var.f42351f;
                viewTreeObserver.removeOnPreDrawListener(y60Var.f42382y);
                if (y60Var.S) {
                    if (view2 instanceof x60) {
                        ((x60) view2).setScrimHidden(false);
                    } else {
                        view2.setVisibility(0);
                    }
                    if (view2 instanceof bi.c3) {
                        bi.c3 c3Var = (bi.c3) view2;
                        FrameLayout frameLayout = c3Var.d;
                        frameLayout.invalidate();
                        frameLayout.invalidateDrawable(c3Var.f3463e);
                        return;
                    }
                    return;
                }
                return;
            case 9:
                org.telegram.ui.Components.voip.k0 k0Var = (org.telegram.ui.Components.voip.k0) this.d;
                k0Var.O0 = null;
                ((org.telegram.ui.Components.voip.y) this.f11719b).F = false;
                org.telegram.ui.Components.voip.y yVar = k0Var.F;
                if (yVar != null) {
                    if (yVar.getParent() != null) {
                        k0Var.removeView(k0Var.F);
                        ((org.telegram.ui.Components.voip.y) this.f11720c).e();
                    }
                    k0Var.F = null;
                    return;
                }
                return;
            case 10:
                LaunchActivity launchActivity = (LaunchActivity) this.d;
                launchActivity.F0 = null;
                launchActivity.f43112y0.invalidate();
                launchActivity.f43091n0.invalidate();
                launchActivity.f43091n0.setImageDrawable(null);
                g01 g01Var = launchActivity.f43091n0;
                g01Var.f35277c = null;
                g01Var.f35275a.setShader(null);
                g01Var.f35280n = null;
                g01Var.f35281r = null;
                launchActivity.f43091n0.setVisibility(8);
                launchActivity.f43092o0.setVisibility(8);
                ph0 ph0Var2 = (ph0) this.f11719b;
                if (ph0Var2 != null) {
                    ph0Var2.setImageDrawable((mh0) this.f11720c);
                }
                ks.e().k(270, new Object[0]);
                if (ph0Var2 != null) {
                    ph0Var2.setVisibility(0);
                }
                cx.C4 = false;
                return;
            default:
                r11 r11Var = (r11) this.d;
                r11Var.f51421t1 = null;
                r11Var.invalidate();
                boolean[] zArr3 = (boolean[]) this.f11719b;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    ((wt0) this.f11720c).run();
                    return;
                }
                return;
        }
    }

    public a3(ab.q qVar, View view) {
        this.f11718a = 5;
        this.d = qVar;
        this.f11720c = view;
        this.f11719b = new gk(this, 4);
    }
}
