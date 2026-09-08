package bi;

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
import org.telegram.ui.Components.d50;
import org.telegram.ui.Components.kz;
import org.telegram.ui.Components.l70;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.w50;
import org.telegram.ui.h90;
import org.telegram.ui.j71;
public final class j4 extends AnimatorListenerAdapter {
    public final int f3163a;
    public final Object f3164b;
    public final Object f3165c;
    public final Object d;

    public j4(Object obj, Object obj2, Object obj3, int i10) {
        this.f3163a = i10;
        this.d = obj;
        this.f3164b = obj2;
        this.f3165c = obj3;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f3163a) {
            case 5:
                kz kzVar = (kz) this.d;
                if (animator.equals(kzVar.M0)) {
                    kzVar.M0 = null;
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
        switch (this.f3163a) {
            case 0:
                z8 z8Var = (z8) this.f3165c;
                k4 k4Var = (k4) this.d;
                o5 o5Var = k4Var.f3221a;
                o5Var.f3492u3 = false;
                o5Var.f3495v3 = 1.0f;
                o5Var.invalidate();
                boolean[] zArr = (boolean[]) this.f3164b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    o5 o5Var2 = k4Var.f3221a;
                    o5Var2.f3480q3 = true;
                    try {
                        o5Var2.performHapticFeedback(3);
                    } catch (Exception unused) {
                    }
                }
                z8Var.setAllowDrawReaction(true);
                z8Var.f4098r = true;
                ImageReceiver imageReceiver = z8Var.f4095e;
                if (imageReceiver.getLottieAnimation() != null) {
                    imageReceiver.getLottieAnimation().L(0, false, true);
                }
                o5 o5Var3 = k4Var.f3221a;
                org.telegram.ui.Components.q5 q5Var = o5Var3.f3474o3;
                if (q5Var != null) {
                    q5Var.o(o5Var3);
                    k4Var.f3221a.f3474o3 = null;
                    return;
                }
                return;
            case 1:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.d).f20223x.remove((AnimatorSet) this.f3164b);
                View view = (View) this.f3165c;
                if (view instanceof org.telegram.ui.ActionBar.f1) {
                    aj0 aj0Var = ((org.telegram.ui.ActionBar.f1) view).f20430c;
                    if (aj0Var.getAnimatedDrawable() != null) {
                        aj0Var.getAnimatedDrawable().start();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.d;
                ViewGroup viewGroup = (ViewGroup) this.f3164b;
                if (viewGroup != null) {
                    chatActivityEnterView.l1.removeView(chatActivityEnterView.f23717e1);
                    viewGroup.addView(chatActivityEnterView.f23717e1, (ViewGroup.LayoutParams) this.f3165c);
                }
                chatActivityEnterView.f23717e1.setAlpha(1.0f);
                chatActivityEnterView.f23736h1.setAlpha(1.0f);
                chatActivityEnterView.h = 0.0f;
                chatActivityEnterView.f23766n = 0.0f;
                chatActivityEnterView.F1();
                fi.c0 c0Var = chatActivityEnterView.f23758l0;
                if (c0Var != null) {
                    c0Var.setAlpha(0.0f);
                    chatActivityEnterView.f23758l0.setScaleX(0.0f);
                    chatActivityEnterView.f23758l0.setScaleY(0.0f);
                }
                if (chatActivityEnterView.N1 != null && chatActivityEnterView.P && !chatActivityEnterView.O && MessagesController.getGlobalMainSettings().getInt("voiceoncehint", 0) < 3) {
                    chatActivityEnterView.N1.b();
                    return;
                }
                return;
            case 3:
                ((ChatAttachAlertPhotoLayout) this.d).T = false;
                ((View) this.f3164b).setVisibility(4);
                ((ImageView) this.f3165c).sendAccessibilityEvent(8);
                return;
            case 4:
                if (((com.google.firebase.messaging.m) this.d).f6398a) {
                    ((View) this.f3165c).postDelayed((org.telegram.ui.Cells.l7) this.f3164b, 300L);
                    return;
                }
                return;
            case 5:
                ll0 ll0Var = (ll0) this.f3165c;
                s4.s sVar = (s4.s) this.f3164b;
                kz kzVar = (kz) this.d;
                if (animator.equals(kzVar.M0)) {
                    int L0 = sVar.L0();
                    ll0Var.setTranslationY(0.0f);
                    if (ll0Var == kzVar.D0) {
                        ll0Var.setPadding(0, AndroidUtilities.dp(36.0f), 0, AndroidUtilities.dp(44.0f) + kzVar.f28003q2);
                    } else if (ll0Var == kzVar.f27975h0) {
                        ll0Var.setPadding(0, kzVar.f27955b1, 0, AndroidUtilities.dp(44.0f) + kzVar.f28003q2);
                    } else if (ll0Var == kzVar.P) {
                        ll0Var.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(44.0f) + kzVar.f28003q2);
                    }
                    if (L0 != -1) {
                        sVar.h1(L0, 0);
                    }
                    kzVar.M0 = null;
                    return;
                }
                return;
            case 6:
                w50 w50Var = (w50) this.d;
                super.onAnimationEnd(animator);
                boolean[] zArr2 = (boolean[]) this.f3164b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    ((d50) this.f3165c).run();
                }
                w50Var.f32154b.setRotationY(0.0f);
                w50Var.m0.setRotationY(0.0f);
                w50Var.E0 = false;
                w50Var.invalidate();
                return;
            case 7:
                l70 l70Var = (l70) this.f3164b;
                l70Var.setProgress(0.0f);
                l70Var.invalidate();
                AndroidUtilities.removeFromParent(l70Var);
                ViewTreeObserver viewTreeObserver = ((ViewGroup) this.f3165c).getViewTreeObserver();
                n70 n70Var = (n70) this.d;
                View view2 = n70Var.f28664f;
                viewTreeObserver.removeOnPreDrawListener(n70Var.f28692y);
                if (n70Var.P) {
                    view2.setVisibility(0);
                    if (view2 instanceof yh.h1) {
                        yh.h1 h1Var = (yh.h1) view2;
                        FrameLayout frameLayout = h1Var.d;
                        frameLayout.invalidate();
                        frameLayout.invalidateDrawable(h1Var.f50342e);
                        return;
                    }
                    return;
                }
                return;
            default:
                j71 j71Var = (j71) this.d;
                j71Var.f37694r1 = null;
                j71Var.invalidate();
                boolean[] zArr3 = (boolean[]) this.f3164b;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    ((h90) this.f3165c).run();
                    return;
                }
                return;
        }
    }

    public j4(com.google.firebase.messaging.m mVar, View view) {
        this.f3163a = 4;
        this.d = mVar;
        this.f3165c = view;
        this.f3164b = new org.telegram.ui.Cells.l7(this, 10);
    }
}
