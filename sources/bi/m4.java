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
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.p60;
import org.telegram.ui.Components.r50;
import org.telegram.ui.Components.wz;
import org.telegram.ui.l90;
import org.telegram.ui.r71;
public final class m4 extends AnimatorListenerAdapter {
    public final int f3306a;
    public final Object f3307b;
    public final Object f3308c;
    public final Object d;

    public m4(Object obj, Object obj2, Object obj3, int i10) {
        this.f3306a = i10;
        this.d = obj;
        this.f3307b = obj2;
        this.f3308c = obj3;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f3306a) {
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
        switch (this.f3306a) {
            case 0:
                c9 c9Var = (c9) this.f3308c;
                n4 n4Var = (n4) this.d;
                q5 q5Var = n4Var.f3358a;
                q5Var.f3568u3 = false;
                q5Var.f3571v3 = 1.0f;
                q5Var.invalidate();
                boolean[] zArr = (boolean[]) this.f3307b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    q5 q5Var2 = n4Var.f3358a;
                    q5Var2.f3556q3 = true;
                    try {
                        q5Var2.performHapticFeedback(3);
                    } catch (Exception unused) {
                    }
                }
                c9Var.setAllowDrawReaction(true);
                c9Var.f2912r = true;
                ImageReceiver imageReceiver = c9Var.e;
                if (imageReceiver.getLottieAnimation() != null) {
                    imageReceiver.getLottieAnimation().N(0, false, true);
                }
                q5 q5Var3 = n4Var.f3358a;
                org.telegram.ui.Components.s5 s5Var = q5Var3.f3550o3;
                if (s5Var != null) {
                    s5Var.o(q5Var3);
                    n4Var.f3358a.f3550o3 = null;
                    return;
                }
                return;
            case 1:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.d).f19546x.remove((AnimatorSet) this.f3307b);
                View view = (View) this.f3308c;
                if (view instanceof org.telegram.ui.ActionBar.e1) {
                    bk0 bk0Var = ((org.telegram.ui.ActionBar.e1) view).f19721c;
                    if (bk0Var.getAnimatedDrawable() != null) {
                        bk0Var.getAnimatedDrawable().start();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.d;
                ViewGroup viewGroup = (ViewGroup) this.f3307b;
                if (viewGroup != null) {
                    chatActivityEnterView.f22923m1.removeView(chatActivityEnterView.f22877e1);
                    viewGroup.addView(chatActivityEnterView.f22877e1, (ViewGroup.LayoutParams) this.f3308c);
                }
                chatActivityEnterView.f22877e1.setAlpha(1.0f);
                chatActivityEnterView.f22896h1.setAlpha(1.0f);
                chatActivityEnterView.h = 0.0f;
                chatActivityEnterView.f22928n = 0.0f;
                chatActivityEnterView.D1();
                fi.b0 b0Var = chatActivityEnterView.f22919l0;
                if (b0Var != null) {
                    b0Var.setAlpha(0.0f);
                    chatActivityEnterView.f22919l0.setScaleX(0.0f);
                    chatActivityEnterView.f22919l0.setScaleY(0.0f);
                }
                if (chatActivityEnterView.O1 != null && chatActivityEnterView.P && !chatActivityEnterView.O && MessagesController.getGlobalMainSettings().getInt("voiceoncehint", 0) < 3) {
                    chatActivityEnterView.O1.b();
                    return;
                }
                return;
            case 3:
                ((ChatAttachAlertPhotoLayout) this.d).T = false;
                ((View) this.f3307b).setVisibility(4);
                ((ImageView) this.f3308c).sendAccessibilityEvent(8);
                return;
            case 4:
                if (((c2.b) this.d).f4118a) {
                    ((View) this.f3308c).postDelayed((org.telegram.ui.Cells.t6) this.f3307b, 300L);
                    return;
                }
                return;
            case 5:
                mm0 mm0Var = (mm0) this.f3308c;
                s4.s sVar = (s4.s) this.f3307b;
                wz wzVar = (wz) this.d;
                if (animator.equals(wzVar.M0)) {
                    int L0 = sVar.L0();
                    mm0Var.setTranslationY(0.0f);
                    if (mm0Var == wzVar.D0) {
                        mm0Var.setPadding(0, AndroidUtilities.dp(36.0f), 0, AndroidUtilities.dp(44.0f) + wzVar.f31054p2);
                    } else if (mm0Var == wzVar.f31029h0) {
                        mm0Var.setPadding(0, wzVar.f31010b1, 0, AndroidUtilities.dp(44.0f) + wzVar.f31054p2);
                    } else if (mm0Var == wzVar.P) {
                        mm0Var.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(44.0f) + wzVar.f31054p2);
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
                boolean[] zArr2 = (boolean[]) this.f3307b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    ((r50) this.f3308c).run();
                }
                p60Var.h.setRotationY(0.0f);
                p60Var.f28188r0.setRotationY(0.0f);
                p60Var.O0 = false;
                p60Var.invalidate();
                return;
            case 7:
                k80 k80Var = (k80) this.f3307b;
                k80Var.setProgress(0.0f);
                k80Var.invalidate();
                AndroidUtilities.removeFromParent(k80Var);
                ViewTreeObserver viewTreeObserver = ((ViewGroup) this.f3308c).getViewTreeObserver();
                m80 m80Var = (m80) this.d;
                View view2 = m80Var.f27275f;
                viewTreeObserver.removeOnPreDrawListener(m80Var.f27303y);
                if (m80Var.P) {
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
                r71Var.f39658r1 = null;
                r71Var.invalidate();
                boolean[] zArr3 = (boolean[]) this.f3307b;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    ((l90) this.f3308c).run();
                    return;
                }
                return;
        }
    }

    public m4(c2.b bVar, View view) {
        this.f3306a = 4;
        this.d = bVar;
        this.f3308c = view;
        this.f3307b = new org.telegram.ui.Cells.t6(this, 10);
    }
}
