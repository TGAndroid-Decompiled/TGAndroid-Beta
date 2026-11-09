package di;

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
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ah0;
import org.telegram.ui.Components.dh0;
import org.telegram.ui.Components.et;
import org.telegram.ui.Components.hy;
import org.telegram.ui.Components.j60;
import org.telegram.ui.Components.l60;
import org.telegram.ui.Components.p40;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.Components.s30;
import org.telegram.ui.Components.yz0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.qw0;
import org.telegram.ui.s11;
import org.telegram.ui.yw;
public final class h3 extends AnimatorListenerAdapter {
    public final int f9061a;
    public final Object f9062b;
    public final Object f9063c;
    public final Object d;

    public h3(Object obj, Object obj2, Object obj3, int i7) {
        this.f9061a = i7;
        this.d = obj;
        this.f9062b = obj2;
        this.f9063c = obj3;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f9061a) {
            case 6:
                hy hyVar = (hy) this.d;
                if (animator.equals(hyVar.M0)) {
                    hyVar.M0 = null;
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
        switch (this.f9061a) {
            case 0:
                e7 e7Var = (e7) this.f9063c;
                i3 i3Var = (i3) this.d;
                j4 j4Var = i3Var.f9103a;
                j4Var.f9172d3 = false;
                j4Var.f9175e3 = 1.0f;
                j4Var.invalidate();
                boolean[] zArr = (boolean[]) this.f9062b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    j4 j4Var2 = i3Var.f9103a;
                    j4Var2.Z2 = true;
                    try {
                        j4Var2.performHapticFeedback(3);
                    } catch (Exception unused) {
                    }
                }
                e7Var.setAllowDrawReaction(true);
                e7Var.f8960r = true;
                ImageReceiver imageReceiver = e7Var.f8957e;
                if (imageReceiver.B() != null) {
                    imageReceiver.B().N(0, false, true);
                }
                j4 j4Var3 = i3Var.f9103a;
                org.telegram.ui.Components.i5 i5Var = j4Var3.X2;
                if (i5Var != null) {
                    i5Var.n(j4Var3);
                    i3Var.f9103a.X2 = null;
                    return;
                }
                return;
            case 1:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.d).f27295y.remove((AnimatorSet) this.f9062b);
                View view = (View) this.f9063c;
                if (view instanceof org.telegram.ui.ActionBar.z0) {
                    dh0 dh0Var = ((org.telegram.ui.ActionBar.z0) view).f28819c;
                    if (dh0Var.getAnimatedDrawable() != null) {
                        dh0Var.getAnimatedDrawable().start();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                org.telegram.ui.ActionBar.k3 k3Var = (org.telegram.ui.ActionBar.k3) this.d;
                org.telegram.ui.ActionBar.h3 h3Var = (org.telegram.ui.ActionBar.h3) this.f9063c;
                org.telegram.ui.ActionBar.c3 c3Var = (org.telegram.ui.ActionBar.c3) this.f9062b;
                ViewGroup viewGroup = c3Var.f27367b;
                if (viewGroup == null) {
                    viewGroup = c3Var.f27368c;
                }
                if (viewGroup != null && c3Var.f27376m == null && (i7 = c3Var.f27371g) > 0 && (i10 = c3Var.h) > 0) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        org.telegram.ui.ActionBar.k3.g(viewGroup, -c3Var.f27372i, new org.telegram.messenger.voip.k(2, c3Var, h3Var));
                        k3Var.f27701b = null;
                        k3Var.invalidate();
                        return;
                    }
                    c3Var.f27376m = Bitmap.createBitmap(i7, i10, Bitmap.Config.RGB_565);
                    Canvas canvas = new Canvas(c3Var.f27376m);
                    canvas.translate(0.0f, -c3Var.f27372i);
                    viewGroup.draw(canvas);
                }
                h3Var.mo25d().setDrawingFromOverlay(false);
                h3Var.release();
                k3Var.f27701b = null;
                k3Var.invalidate();
                return;
            case 3:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.d;
                ViewGroup viewGroup2 = (ViewGroup) this.f9062b;
                if (viewGroup2 != null) {
                    chatActivityEnterView.f31092m1.removeView(chatActivityEnterView.f31046e1);
                    viewGroup2.addView(chatActivityEnterView.f31046e1, (ViewGroup.LayoutParams) this.f9063c);
                }
                chatActivityEnterView.f31046e1.setAlpha(1.0f);
                chatActivityEnterView.f31065h1.setAlpha(1.0f);
                chatActivityEnterView.h = 0.0f;
                chatActivityEnterView.f31097n = 0.0f;
                chatActivityEnterView.H1();
                hi.y yVar = chatActivityEnterView.f31087l0;
                if (yVar != null) {
                    yVar.setAlpha(0.0f);
                    chatActivityEnterView.f31087l0.setScaleX(0.0f);
                    chatActivityEnterView.f31087l0.setScaleY(0.0f);
                }
                if (chatActivityEnterView.O1 != null && chatActivityEnterView.P && !chatActivityEnterView.O && qp.e1().getInt("voiceoncehint", 0) < 3) {
                    chatActivityEnterView.O1.b();
                    return;
                }
                return;
            case 4:
                ((ChatAttachAlertPhotoLayout) this.d).T = false;
                ((View) this.f9062b).setVisibility(4);
                ((ImageView) this.f9063c).sendAccessibilityEvent(8);
                return;
            case 5:
                if (((ab.q) this.d).f989a) {
                    ((View) this.f9063c).postDelayed((et) this.f9062b, 300L);
                    return;
                }
                return;
            case 6:
                qj0 qj0Var = (qj0) this.f9063c;
                v4.s sVar = (v4.s) this.f9062b;
                hy hyVar = (hy) this.d;
                if (animator.equals(hyVar.M0)) {
                    int L0 = sVar.L0();
                    qj0Var.setTranslationY(0.0f);
                    if (qj0Var == hyVar.D0) {
                        qj0Var.setPadding(0, org.telegram.messenger.g0.L(36.0f), 0, org.telegram.messenger.g0.L(44.0f) + hyVar.f34457q2);
                    } else if (qj0Var == hyVar.f34430h0) {
                        qj0Var.setPadding(0, hyVar.f34411b1, 0, org.telegram.messenger.g0.L(44.0f) + hyVar.f34457q2);
                    } else if (qj0Var == hyVar.P) {
                        qj0Var.setPadding(org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(44.0f) + hyVar.f34457q2);
                    }
                    if (L0 != -1) {
                        sVar.h1(L0, 0);
                    }
                    hyVar.M0 = null;
                    return;
                }
                return;
            case 7:
                p40 p40Var = (p40) this.d;
                super.onAnimationEnd(animator);
                boolean[] zArr2 = (boolean[]) this.f9062b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    ((s30) this.f9063c).run();
                }
                p40Var.f36894f.setRotationY(0.0f);
                p40Var.f36912q0.setRotationY(0.0f);
                p40Var.N0 = false;
                p40Var.invalidate();
                return;
            case 8:
                j60 j60Var = (j60) this.f9062b;
                j60Var.setProgress(0.0f);
                j60Var.invalidate();
                org.telegram.messenger.g0.E2(j60Var);
                ViewTreeObserver viewTreeObserver = ((ViewGroup) this.f9063c).getViewTreeObserver();
                l60 l60Var = (l60) this.d;
                View view2 = l60Var.f35594f;
                viewTreeObserver.removeOnPreDrawListener(l60Var.f35622y);
                if (l60Var.P) {
                    view2.setVisibility(0);
                    if (view2 instanceof zh.y0) {
                        zh.y0 y0Var = (zh.y0) view2;
                        FrameLayout frameLayout = y0Var.d;
                        frameLayout.invalidate();
                        frameLayout.invalidateDrawable(y0Var.f60608e);
                        return;
                    }
                    return;
                }
                return;
            case 9:
                org.telegram.ui.Components.voip.k0 k0Var = (org.telegram.ui.Components.voip.k0) this.d;
                k0Var.N0 = null;
                ((org.telegram.ui.Components.voip.y) this.f9062b).E = false;
                org.telegram.ui.Components.voip.y yVar2 = k0Var.E;
                if (yVar2 != null) {
                    if (yVar2.getParent() != null) {
                        k0Var.removeView(k0Var.E);
                        ((org.telegram.ui.Components.voip.y) this.f9063c).e();
                    }
                    k0Var.E = null;
                    return;
                }
                return;
            case 10:
                LaunchActivity launchActivity = (LaunchActivity) this.d;
                launchActivity.E0 = null;
                launchActivity.f41304x0.invalidate();
                launchActivity.m0.invalidate();
                launchActivity.m0.setImageDrawable(null);
                yz0 yz0Var = launchActivity.m0;
                yz0Var.f40847c = null;
                yz0Var.f40845a.setShader(null);
                yz0Var.f40850n = null;
                yz0Var.f40851r = null;
                launchActivity.m0.setVisibility(8);
                launchActivity.f41285n0.setVisibility(8);
                dh0 dh0Var2 = (dh0) this.f9062b;
                if (dh0Var2 != null) {
                    dh0Var2.setImageDrawable((ah0) this.f9063c);
                }
                qs.e().k(267, new Object[0]);
                if (dh0Var2 != null) {
                    dh0Var2.setVisibility(0);
                }
                yw.f52206y4 = false;
                return;
            default:
                s11 s11Var = (s11) this.d;
                s11Var.f49703s1 = null;
                s11Var.invalidate();
                boolean[] zArr3 = (boolean[]) this.f9062b;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    ((qw0) this.f9063c).run();
                    return;
                }
                return;
        }
    }

    public h3(ab.q qVar, View view) {
        this.f9061a = 5;
        this.d = qVar;
        this.f9063c = view;
        this.f9062b = new et(this, 1);
    }
}
