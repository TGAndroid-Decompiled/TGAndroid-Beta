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
import org.telegram.ui.Components.g50;
import org.telegram.ui.Components.jj0;
import org.telegram.ui.Components.jy0;
import org.telegram.ui.Components.kz;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.p70;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.y50;
import org.telegram.ui.x61;
public final class g3 extends AnimatorListenerAdapter {
    public final int f15327a;
    public final Object f15328b;
    public final Object f15329c;
    public final Object d;

    public g3(Object obj, Object obj2, Object obj3, int i10) {
        this.f15327a = i10;
        this.d = obj;
        this.f15328b = obj2;
        this.f15329c = obj3;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f15327a) {
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
        switch (this.f15327a) {
            case 0:
                y6 y6Var = (y6) this.f15329c;
                h3 h3Var = (h3) this.d;
                d4 d4Var = h3Var.f15357a;
                d4Var.f15213r3 = false;
                d4Var.f15216s3 = 1.0f;
                d4Var.invalidate();
                boolean[] zArr = (boolean[]) this.f15328b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    d4 d4Var2 = h3Var.f15357a;
                    d4Var2.f15201n3 = true;
                    try {
                        d4Var2.performHapticFeedback(3);
                    } catch (Exception unused) {
                    }
                }
                y6Var.setAllowDrawReaction(true);
                y6Var.f16063r = true;
                ImageReceiver imageReceiver = y6Var.e;
                if (imageReceiver.getLottieAnimation() != null) {
                    imageReceiver.getLottieAnimation().L(0, false, true);
                }
                d4 d4Var3 = h3Var.f15357a;
                org.telegram.ui.Components.l5 l5Var = d4Var3.f15195l3;
                if (l5Var != null) {
                    l5Var.o(d4Var3);
                    h3Var.f15357a.f15195l3 = null;
                    return;
                }
                return;
            case 1:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.d).f19476x.remove((AnimatorSet) this.f15328b);
                View view = (View) this.f15329c;
                if (view instanceof org.telegram.ui.ActionBar.g1) {
                    jj0 jj0Var = ((org.telegram.ui.ActionBar.g1) view).f19679c;
                    if (jj0Var.getAnimatedDrawable() != null) {
                        jj0Var.getAnimatedDrawable().start();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.d;
                ViewGroup viewGroup = (ViewGroup) this.f15328b;
                if (viewGroup != null) {
                    chatActivityEnterView.f22754i1.removeView(chatActivityEnterView.f22711b1);
                    viewGroup.addView(chatActivityEnterView.f22711b1, (ViewGroup.LayoutParams) this.f15329c);
                }
                chatActivityEnterView.f22711b1.setAlpha(1.0f);
                chatActivityEnterView.f22729e1.setAlpha(1.0f);
                chatActivityEnterView.h = 0.0f;
                chatActivityEnterView.f22777n = 0.0f;
                chatActivityEnterView.F1();
                rh.z zVar = chatActivityEnterView.f22753i0;
                if (zVar != null) {
                    zVar.setAlpha(0.0f);
                    chatActivityEnterView.f22753i0.setScaleX(0.0f);
                    chatActivityEnterView.f22753i0.setScaleY(0.0f);
                }
                if (chatActivityEnterView.K1 != null && chatActivityEnterView.M && !chatActivityEnterView.L && MessagesController.getGlobalMainSettings().getInt("voiceoncehint", 0) < 3) {
                    chatActivityEnterView.K1.b();
                    return;
                }
                return;
            case 3:
                ((ChatAttachAlertPhotoLayout) this.d).Q = false;
                ((View) this.f15328b).setVisibility(4);
                ((ImageView) this.f15329c).sendAccessibilityEvent(8);
                return;
            case 4:
                if (((cb.m) this.d).f2255a) {
                    ((View) this.f15329c).postDelayed((m2.b) this.f15328b, 300L);
                    return;
                }
                return;
            case 5:
                rl0 rl0Var = (rl0) this.f15329c;
                f2.w wVar = (f2.w) this.f15328b;
                kz kzVar = (kz) this.d;
                if (animator.equals(kzVar.J0)) {
                    int L0 = wVar.L0();
                    rl0Var.setTranslationY(0.0f);
                    if (rl0Var == kzVar.A0) {
                        rl0Var.setPadding(0, AndroidUtilities.dp(36.0f), 0, AndroidUtilities.dp(44.0f) + kzVar.f26464n2);
                    } else if (rl0Var == kzVar.f26435e0) {
                        rl0Var.setPadding(0, kzVar.Y0, 0, AndroidUtilities.dp(44.0f) + kzVar.f26464n2);
                    } else if (rl0Var == kzVar.M) {
                        rl0Var.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(44.0f) + kzVar.f26464n2);
                    }
                    if (L0 != -1) {
                        wVar.h1(L0, 0);
                    }
                    kzVar.J0 = null;
                    return;
                }
                return;
            case 6:
                y50 y50Var = (y50) this.d;
                super.onAnimationEnd(animator);
                boolean[] zArr2 = (boolean[]) this.f15328b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    ((g50) this.f15329c).run();
                }
                y50Var.f30873b.setRotationY(0.0f);
                y50Var.f30884j0.setRotationY(0.0f);
                y50Var.B0 = false;
                y50Var.invalidate();
                return;
            case 7:
                n70 n70Var = (n70) this.f15328b;
                n70Var.setProgress(0.0f);
                n70Var.invalidate();
                AndroidUtilities.removeFromParent(n70Var);
                ViewTreeObserver viewTreeObserver = ((ViewGroup) this.f15329c).getViewTreeObserver();
                p70 p70Var = (p70) this.d;
                View view2 = p70Var.f27754f;
                viewTreeObserver.removeOnPreDrawListener(p70Var.f27782y);
                if (p70Var.P) {
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
                x61 x61Var = (x61) this.d;
                x61Var.f39883o1 = null;
                x61Var.invalidate();
                boolean[] zArr3 = (boolean[]) this.f15328b;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    ((jy0) this.f15329c).run();
                    return;
                }
                return;
        }
    }

    public g3(cb.m mVar, View view) {
        this.f15327a = 4;
        this.d = mVar;
        this.f15329c = view;
        this.f15328b = new m2.b(this, 19);
    }
}
