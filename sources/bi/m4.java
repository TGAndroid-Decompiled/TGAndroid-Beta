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
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.j80;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.p60;
import org.telegram.ui.Components.r50;
import org.telegram.ui.Components.wz;
import org.telegram.ui.l90;
import org.telegram.ui.r71;
public final class m4 extends AnimatorListenerAdapter {
    public final int f3310a;
    public final Object f3311b;
    public final Object f3312c;
    public final Object d;

    public m4(Object obj, Object obj2, Object obj3, int i10) {
        this.f3310a = i10;
        this.d = obj;
        this.f3311b = obj2;
        this.f3312c = obj3;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f3310a) {
            case 5:
                wz wzVar = (wz) this.d;
                if (animator.equals(wzVar.M0)) {
                    wzVar.M0 = null;
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
        switch (this.f3310a) {
            case 0:
                c9 c9Var = (c9) this.f3312c;
                n4 n4Var = (n4) this.d;
                q5 q5Var = n4Var.f3362a;
                q5Var.f3572u3 = false;
                q5Var.f3575v3 = 1.0f;
                q5Var.invalidate();
                boolean[] zArr = (boolean[]) this.f3311b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    q5 q5Var2 = n4Var.f3362a;
                    q5Var2.f3560q3 = true;
                    try {
                        q5Var2.performHapticFeedback(3);
                    } catch (Exception unused) {
                    }
                }
                c9Var.setAllowDrawReaction(true);
                c9Var.f2916r = true;
                ImageReceiver imageReceiver = c9Var.e;
                if (imageReceiver.getLottieAnimation() != null) {
                    imageReceiver.getLottieAnimation().N(0, false, true);
                }
                q5 q5Var3 = n4Var.f3362a;
                org.telegram.ui.Components.s5 s5Var = q5Var3.f3554o3;
                if (s5Var != null) {
                    s5Var.o(q5Var3);
                    n4Var.f3362a.f3554o3 = null;
                    return;
                }
                return;
            case 1:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.d).f19246x.remove((AnimatorSet) this.f3311b);
                View view = (View) this.f3312c;
                if (view instanceof org.telegram.ui.ActionBar.e1) {
                    bk0 bk0Var = ((org.telegram.ui.ActionBar.e1) view).f19421c;
                    if (bk0Var.getAnimatedDrawable() != null) {
                        bk0Var.getAnimatedDrawable().start();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.d;
                ViewGroup viewGroup = (ViewGroup) this.f3311b;
                if (viewGroup != null) {
                    chatActivityEnterView.f22623m1.removeView(chatActivityEnterView.f22577e1);
                    viewGroup.addView(chatActivityEnterView.f22577e1, (ViewGroup.LayoutParams) this.f3312c);
                }
                chatActivityEnterView.f22577e1.setAlpha(1.0f);
                chatActivityEnterView.f22596h1.setAlpha(1.0f);
                chatActivityEnterView.h = 0.0f;
                chatActivityEnterView.f22628n = 0.0f;
                chatActivityEnterView.C1();
                fi.b0 b0Var = chatActivityEnterView.f22619l0;
                if (b0Var != null) {
                    b0Var.setAlpha(0.0f);
                    chatActivityEnterView.f22619l0.setScaleX(0.0f);
                    chatActivityEnterView.f22619l0.setScaleY(0.0f);
                }
                if (chatActivityEnterView.O1 != null && chatActivityEnterView.P && !chatActivityEnterView.O && MessagesController.getGlobalMainSettings().getInt("voiceoncehint", 0) < 3) {
                    chatActivityEnterView.O1.b();
                    return;
                }
                return;
            case 3:
                ((ChatAttachAlertPhotoLayout) this.d).T = false;
                ((View) this.f3311b).setVisibility(4);
                ((ImageView) this.f3312c).sendAccessibilityEvent(8);
                return;
            case 4:
                if (((c2.b) this.d).f4122a) {
                    ((View) this.f3312c).postDelayed((org.telegram.ui.Cells.l7) this.f3311b, 300L);
                    return;
                }
                return;
            case 5:
                mm0 mm0Var = (mm0) this.f3312c;
                s4.s sVar = (s4.s) this.f3311b;
                wz wzVar = (wz) this.d;
                if (animator.equals(wzVar.M0)) {
                    int L0 = sVar.L0();
                    mm0Var.setTranslationY(0.0f);
                    if (mm0Var == wzVar.D0) {
                        mm0Var.setPadding(0, AndroidUtilities.dp(36.0f), 0, AndroidUtilities.dp(44.0f) + wzVar.f30747p2);
                    } else if (mm0Var == wzVar.f30722h0) {
                        mm0Var.setPadding(0, wzVar.f30703b1, 0, AndroidUtilities.dp(44.0f) + wzVar.f30747p2);
                    } else if (mm0Var == wzVar.P) {
                        mm0Var.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(44.0f) + wzVar.f30747p2);
                    }
                    if (L0 != -1) {
                        sVar.h1(L0, 0);
                    }
                    wzVar.M0 = null;
                    return;
                }
                return;
            case 6:
                p60 p60Var = (p60) this.d;
                super.onAnimationEnd(animator);
                boolean[] zArr2 = (boolean[]) this.f3311b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    ((r50) this.f3312c).run();
                }
                p60Var.h.setRotationY(0.0f);
                p60Var.f27881r0.setRotationY(0.0f);
                p60Var.O0 = false;
                p60Var.invalidate();
                return;
            case 7:
                j80 j80Var = (j80) this.f3311b;
                j80Var.setProgress(0.0f);
                j80Var.invalidate();
                AndroidUtilities.removeFromParent(j80Var);
                ViewTreeObserver viewTreeObserver = ((ViewGroup) this.f3312c).getViewTreeObserver();
                l80 l80Var = (l80) this.d;
                View view2 = l80Var.f26645f;
                viewTreeObserver.removeOnPreDrawListener(l80Var.f26673y);
                if (l80Var.P) {
                    view2.setVisibility(0);
                    if (view2 instanceof yh.h1) {
                        yh.h1 h1Var = (yh.h1) view2;
                        FrameLayout frameLayout = h1Var.d;
                        frameLayout.invalidate();
                        frameLayout.invalidateDrawable(h1Var.e);
                        return;
                    }
                    return;
                }
                return;
            default:
                r71 r71Var = (r71) this.d;
                r71Var.f39351r1 = null;
                r71Var.invalidate();
                boolean[] zArr3 = (boolean[]) this.f3311b;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    ((l90) this.f3312c).run();
                    return;
                }
                return;
        }
    }

    public m4(c2.b bVar, View view) {
        this.f3310a = 4;
        this.d = bVar;
        this.f3312c = view;
        this.f3311b = new org.telegram.ui.Cells.l7(this, 9);
    }
}
