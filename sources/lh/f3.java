package lh;

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
import org.telegram.ui.Components.aj0;
import org.telegram.ui.Components.b50;
import org.telegram.ui.Components.fz;
import org.telegram.ui.Components.h70;
import org.telegram.ui.Components.j70;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.s50;
import org.telegram.ui.a01;
import org.telegram.ui.d61;
public final class f3 extends AnimatorListenerAdapter {
    public final int f15590a;
    public final Object f15591b;
    public final Object f15592c;
    public final Object d;

    public f3(Object obj, Object obj2, Object obj3, int i10) {
        this.f15590a = i10;
        this.d = obj;
        this.f15591b = obj2;
        this.f15592c = obj3;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f15590a) {
            case 5:
                fz fzVar = (fz) this.d;
                if (animator.equals(fzVar.I0)) {
                    fzVar.I0 = null;
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
        switch (this.f15590a) {
            case 0:
                x6 x6Var = (x6) this.f15592c;
                g3 g3Var = (g3) this.d;
                d4 d4Var = g3Var.f15619a;
                d4Var.f15515q3 = false;
                d4Var.f15518r3 = 1.0f;
                d4Var.invalidate();
                boolean[] zArr = (boolean[]) this.f15591b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    d4 d4Var2 = g3Var.f15619a;
                    d4Var2.f15503m3 = true;
                    try {
                        d4Var2.performHapticFeedback(3);
                    } catch (Exception unused) {
                    }
                }
                x6Var.setAllowDrawReaction(true);
                x6Var.f16404r = true;
                ImageReceiver imageReceiver = x6Var.f16401e;
                if (imageReceiver.getLottieAnimation() != null) {
                    imageReceiver.getLottieAnimation().L(0, false, true);
                }
                d4 d4Var3 = g3Var.f15619a;
                org.telegram.ui.Components.p5 p5Var = d4Var3.f15498k3;
                if (p5Var != null) {
                    p5Var.o(d4Var3);
                    g3Var.f15619a.f15498k3 = null;
                    return;
                }
                return;
            case 1:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.d).f22712x.remove((AnimatorSet) this.f15591b);
                View view = (View) this.f15592c;
                if (view instanceof org.telegram.ui.ActionBar.g1) {
                    aj0 aj0Var = ((org.telegram.ui.ActionBar.g1) view).f22965c;
                    if (aj0Var.getAnimatedDrawable() != null) {
                        aj0Var.getAnimatedDrawable().start();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.d;
                ViewGroup viewGroup = (ViewGroup) this.f15591b;
                if (viewGroup != null) {
                    chatActivityEnterView.f26132h1.removeView(chatActivityEnterView.f26088a1);
                    viewGroup.addView(chatActivityEnterView.f26088a1, (ViewGroup.LayoutParams) this.f15592c);
                }
                chatActivityEnterView.f26088a1.setAlpha(1.0f);
                chatActivityEnterView.f26106d1.setAlpha(1.0f);
                chatActivityEnterView.h = 0.0f;
                chatActivityEnterView.f26160n = 0.0f;
                chatActivityEnterView.F1();
                ph.z zVar = chatActivityEnterView.f26131h0;
                if (zVar != null) {
                    zVar.setAlpha(0.0f);
                    chatActivityEnterView.f26131h0.setScaleX(0.0f);
                    chatActivityEnterView.f26131h0.setScaleY(0.0f);
                }
                if (chatActivityEnterView.J1 != null && chatActivityEnterView.L && !chatActivityEnterView.K && MessagesController.getGlobalMainSettings().getInt("voiceoncehint", 0) < 3) {
                    chatActivityEnterView.J1.b();
                    return;
                }
                return;
            case 3:
                ((ChatAttachAlertPhotoLayout) this.d).P = false;
                ((View) this.f15591b).setVisibility(4);
                ((ImageView) this.f15592c).sendAccessibilityEvent(8);
                return;
            case 4:
                if (((ab.m) this.d).f324a) {
                    ((View) this.f15592c).postDelayed((m7) this.f15591b, 300L);
                    return;
                }
                return;
            case 5:
                jl0 jl0Var = (jl0) this.f15592c;
                f2.w wVar = (f2.w) this.f15591b;
                fz fzVar = (fz) this.d;
                if (animator.equals(fzVar.I0)) {
                    int L0 = wVar.L0();
                    jl0Var.setTranslationY(0.0f);
                    if (jl0Var == fzVar.f28657z0) {
                        jl0Var.setPadding(0, AndroidUtilities.dp(36.0f), 0, AndroidUtilities.dp(44.0f) + fzVar.f28614m2);
                    } else if (jl0Var == fzVar.f28585d0) {
                        jl0Var.setPadding(0, fzVar.X0, 0, AndroidUtilities.dp(44.0f) + fzVar.f28614m2);
                    } else if (jl0Var == fzVar.L) {
                        jl0Var.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(44.0f) + fzVar.f28614m2);
                    }
                    if (L0 != -1) {
                        wVar.h1(L0, 0);
                    }
                    fzVar.I0 = null;
                    return;
                }
                return;
            case 6:
                s50 s50Var = (s50) this.d;
                super.onAnimationEnd(animator);
                boolean[] zArr2 = (boolean[]) this.f15591b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    ((b50) this.f15592c).run();
                }
                s50Var.f32495b.setRotationY(0.0f);
                s50Var.f32506i0.setRotationY(0.0f);
                s50Var.A0 = false;
                s50Var.invalidate();
                return;
            case 7:
                h70 h70Var = (h70) this.f15591b;
                h70Var.setProgress(0.0f);
                h70Var.invalidate();
                AndroidUtilities.removeFromParent(h70Var);
                ViewTreeObserver viewTreeObserver = ((ViewGroup) this.f15592c).getViewTreeObserver();
                j70 j70Var = (j70) this.d;
                View view2 = j70Var.f29577f;
                viewTreeObserver.removeOnPreDrawListener(j70Var.f29605y);
                if (j70Var.P) {
                    view2.setVisibility(0);
                    if (view2 instanceof ih.y1) {
                        ih.y1 y1Var = (ih.y1) view2;
                        FrameLayout frameLayout = y1Var.d;
                        frameLayout.invalidate();
                        frameLayout.invalidateDrawable(y1Var.f9528e);
                        return;
                    }
                    return;
                }
                return;
            default:
                d61 d61Var = (d61) this.d;
                d61Var.f37348n1 = null;
                d61Var.invalidate();
                boolean[] zArr3 = (boolean[]) this.f15591b;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    ((a01) this.f15592c).run();
                    return;
                }
                return;
        }
    }

    public f3(ab.m mVar, View view) {
        this.f15590a = 4;
        this.d = mVar;
        this.f15592c = view;
        this.f15591b = new m7(this, 20);
    }
}
