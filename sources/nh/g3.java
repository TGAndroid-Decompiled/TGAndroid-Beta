package nh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.f50;
import org.telegram.ui.Components.jj0;
import org.telegram.ui.Components.jy0;
import org.telegram.ui.Components.kz;
import org.telegram.ui.Components.m70;
import org.telegram.ui.Components.o70;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.x50;
import org.telegram.ui.q61;
public final class g3 extends AnimatorListenerAdapter {
    public final int f15347a;
    public final Object f15348b;
    public final Object f15349c;
    public final Object d;

    public g3(Object obj, Object obj2, Object obj3, int i10) {
        this.f15347a = i10;
        this.d = obj;
        this.f15348b = obj2;
        this.f15349c = obj3;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f15347a) {
            case 5:
                kz kzVar = (kz) this.d;
                if (animator.equals(kzVar.J0)) {
                    kzVar.J0 = null;
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
        switch (this.f15347a) {
            case 0:
                y6 y6Var = (y6) this.f15349c;
                h3 h3Var = (h3) this.d;
                d4 d4Var = h3Var.f15377a;
                d4Var.f15233r3 = false;
                d4Var.f15236s3 = 1.0f;
                d4Var.invalidate();
                boolean[] zArr = (boolean[]) this.f15348b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    d4 d4Var2 = h3Var.f15377a;
                    d4Var2.f15221n3 = true;
                    try {
                        d4Var2.performHapticFeedback(3);
                    } catch (Exception unused) {
                    }
                }
                y6Var.setAllowDrawReaction(true);
                y6Var.f16083r = true;
                ImageReceiver imageReceiver = y6Var.e;
                if (imageReceiver.getLottieAnimation() != null) {
                    imageReceiver.getLottieAnimation().L(0, false, true);
                }
                d4 d4Var3 = h3Var.f15377a;
                org.telegram.ui.Components.l5 l5Var = d4Var3.f15215l3;
                if (l5Var != null) {
                    l5Var.o(d4Var3);
                    h3Var.f15377a.f15215l3 = null;
                    return;
                }
                return;
            case 1:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.d).f19501x.remove((AnimatorSet) this.f15348b);
                View view = (View) this.f15349c;
                if (view instanceof org.telegram.ui.ActionBar.g1) {
                    jj0 jj0Var = ((org.telegram.ui.ActionBar.g1) view).f19704c;
                    if (jj0Var.getAnimatedDrawable() != null) {
                        jj0Var.getAnimatedDrawable().start();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.d;
                ViewGroup viewGroup = (ViewGroup) this.f15348b;
                if (viewGroup != null) {
                    chatActivityEnterView.f22781i1.removeView(chatActivityEnterView.f22738b1);
                    viewGroup.addView(chatActivityEnterView.f22738b1, (ViewGroup.LayoutParams) this.f15349c);
                }
                chatActivityEnterView.f22738b1.setAlpha(1.0f);
                chatActivityEnterView.f22756e1.setAlpha(1.0f);
                chatActivityEnterView.h = 0.0f;
                chatActivityEnterView.f22804n = 0.0f;
                chatActivityEnterView.F1();
                rh.a0 a0Var = chatActivityEnterView.f22780i0;
                if (a0Var != null) {
                    a0Var.setAlpha(0.0f);
                    chatActivityEnterView.f22780i0.setScaleX(0.0f);
                    chatActivityEnterView.f22780i0.setScaleY(0.0f);
                }
                if (chatActivityEnterView.K1 != null && chatActivityEnterView.M && !chatActivityEnterView.L && MessagesController.getGlobalMainSettings().getInt("voiceoncehint", 0) < 3) {
                    chatActivityEnterView.K1.b();
                    return;
                }
                return;
            case 3:
                ((ChatAttachAlertPhotoLayout) this.d).Q = false;
                ((View) this.f15348b).setVisibility(4);
                ((ImageView) this.f15349c).sendAccessibilityEvent(8);
                return;
            case 4:
                if (((cb.m) this.d).f2232a) {
                    ((View) this.f15349c).postDelayed((m2.b) this.f15348b, 300L);
                    return;
                }
                return;
            case 5:
                sl0 sl0Var = (sl0) this.f15349c;
                f2.w wVar = (f2.w) this.f15348b;
                kz kzVar = (kz) this.d;
                if (animator.equals(kzVar.J0)) {
                    int L0 = wVar.L0();
                    sl0Var.setTranslationY(0.0f);
                    if (sl0Var == kzVar.A0) {
                        sl0Var.setPadding(0, AndroidUtilities.dp(36.0f), 0, AndroidUtilities.dp(44.0f) + kzVar.f26452n2);
                    } else if (sl0Var == kzVar.f26423e0) {
                        sl0Var.setPadding(0, kzVar.Y0, 0, AndroidUtilities.dp(44.0f) + kzVar.f26452n2);
                    } else if (sl0Var == kzVar.M) {
                        sl0Var.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(44.0f) + kzVar.f26452n2);
                    }
                    if (L0 != -1) {
                        wVar.h1(L0, 0);
                    }
                    kzVar.J0 = null;
                    return;
                }
                return;
            case 6:
                x50 x50Var = (x50) this.d;
                super.onAnimationEnd(animator);
                boolean[] zArr2 = (boolean[]) this.f15348b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    ((f50) this.f15349c).run();
                }
                x50Var.f30548b.setRotationY(0.0f);
                x50Var.f30559j0.setRotationY(0.0f);
                x50Var.B0 = false;
                x50Var.invalidate();
                return;
            case 7:
                m70 m70Var = (m70) this.f15348b;
                m70Var.setProgress(0.0f);
                m70Var.invalidate();
                AndroidUtilities.removeFromParent(m70Var);
                ViewTreeObserver viewTreeObserver = ((ViewGroup) this.f15349c).getViewTreeObserver();
                o70 o70Var = (o70) this.d;
                View view2 = o70Var.f27466f;
                viewTreeObserver.removeOnPreDrawListener(o70Var.f27494y);
                if (o70Var.P) {
                    view2.setVisibility(0);
                    if (view2 instanceof kh.x1) {
                        kh.x1 x1Var = (kh.x1) view2;
                        FrameLayout frameLayout = x1Var.d;
                        frameLayout.invalidate();
                        frameLayout.invalidateDrawable(x1Var.e);
                        return;
                    }
                    return;
                }
                return;
            default:
                q61 q61Var = (q61) this.d;
                q61Var.f37626o1 = null;
                q61Var.invalidate();
                boolean[] zArr3 = (boolean[]) this.f15348b;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    ((jy0) this.f15349c).run();
                    return;
                }
                return;
        }
    }

    public g3(cb.m mVar, View view) {
        this.f15347a = 4;
        this.d = mVar;
        this.f15349c = view;
        this.f15348b = new m2.b(this, 19);
    }
}
