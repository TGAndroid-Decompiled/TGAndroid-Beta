package ci;

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
import org.telegram.ui.Components.g80;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.jm0;
import org.telegram.ui.Components.m60;
import org.telegram.ui.Components.n50;
import org.telegram.ui.Components.tz;
import org.telegram.ui.Components.yj0;
import org.telegram.ui.g01;
import org.telegram.ui.x51;
public final class p3 extends AnimatorListenerAdapter {
    public final int f5722a;
    public final Object f5723b;
    public final Object f5724c;
    public final Object d;

    public p3(Object obj, Object obj2, Object obj3, int i10) {
        this.f5722a = i10;
        this.d = obj;
        this.f5723b = obj2;
        this.f5724c = obj3;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f5722a) {
            case 5:
                tz tzVar = (tz) this.d;
                if (animator.equals(tzVar.M0)) {
                    tzVar.M0 = null;
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
        switch (this.f5722a) {
            case 0:
                n7 n7Var = (n7) this.f5724c;
                q3 q3Var = (q3) this.d;
                q4 q4Var = q3Var.f5761a;
                q4Var.f5826u3 = false;
                q4Var.f5829v3 = 1.0f;
                q4Var.invalidate();
                boolean[] zArr = (boolean[]) this.f5723b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    q4 q4Var2 = q3Var.f5761a;
                    q4Var2.f5814q3 = true;
                    try {
                        q4Var2.performHapticFeedback(3);
                    } catch (Exception unused) {
                    }
                }
                n7Var.setAllowDrawReaction(true);
                n7Var.f5655r = true;
                ImageReceiver imageReceiver = n7Var.e;
                if (imageReceiver.getLottieAnimation() != null) {
                    imageReceiver.getLottieAnimation().N(0, false, true);
                }
                q4 q4Var3 = q3Var.f5761a;
                org.telegram.ui.Components.r5 r5Var = q4Var3.f5808o3;
                if (r5Var != null) {
                    r5Var.o(q4Var3);
                    q3Var.f5761a.f5808o3 = null;
                    return;
                }
                return;
            case 1:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.d).f20603x.remove((AnimatorSet) this.f5723b);
                View view = (View) this.f5724c;
                if (view instanceof org.telegram.ui.ActionBar.e1) {
                    yj0 yj0Var = ((org.telegram.ui.ActionBar.e1) view).f20763c;
                    if (yj0Var.getAnimatedDrawable() != null) {
                        yj0Var.getAnimatedDrawable().start();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.d;
                ViewGroup viewGroup = (ViewGroup) this.f5723b;
                if (viewGroup != null) {
                    chatActivityEnterView.f23982m1.removeView(chatActivityEnterView.f23936e1);
                    viewGroup.addView(chatActivityEnterView.f23936e1, (ViewGroup.LayoutParams) this.f5724c);
                }
                chatActivityEnterView.f23936e1.setAlpha(1.0f);
                chatActivityEnterView.f23955h1.setAlpha(1.0f);
                chatActivityEnterView.h = 0.0f;
                chatActivityEnterView.f23987n = 0.0f;
                chatActivityEnterView.C1();
                gi.b0 b0Var = chatActivityEnterView.f23978l0;
                if (b0Var != null) {
                    b0Var.setAlpha(0.0f);
                    chatActivityEnterView.f23978l0.setScaleX(0.0f);
                    chatActivityEnterView.f23978l0.setScaleY(0.0f);
                }
                if (chatActivityEnterView.O1 != null && chatActivityEnterView.P && !chatActivityEnterView.O && MessagesController.getGlobalMainSettings().getInt("voiceoncehint", 0) < 3) {
                    chatActivityEnterView.O1.b();
                    return;
                }
                return;
            case 3:
                ((ChatAttachAlertPhotoLayout) this.d).T = false;
                ((View) this.f5723b).setVisibility(4);
                ((ImageView) this.f5724c).sendAccessibilityEvent(8);
                return;
            case 4:
                if (((c2.b) this.d).f4489a) {
                    ((View) this.f5724c).postDelayed((org.telegram.ui.Cells.k7) this.f5723b, 300L);
                    return;
                }
                return;
            case 5:
                jm0 jm0Var = (jm0) this.f5724c;
                s4.s sVar = (s4.s) this.f5723b;
                tz tzVar = (tz) this.d;
                if (animator.equals(tzVar.M0)) {
                    int L0 = sVar.L0();
                    jm0Var.setTranslationY(0.0f);
                    if (jm0Var == tzVar.D0) {
                        jm0Var.setPadding(0, AndroidUtilities.dp(36.0f), 0, AndroidUtilities.dp(44.0f) + tzVar.f30763p2);
                    } else if (jm0Var == tzVar.f30738h0) {
                        jm0Var.setPadding(0, tzVar.f30719b1, 0, AndroidUtilities.dp(44.0f) + tzVar.f30763p2);
                    } else if (jm0Var == tzVar.P) {
                        jm0Var.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(44.0f) + tzVar.f30763p2);
                    }
                    if (L0 != -1) {
                        sVar.h1(L0, 0);
                    }
                    tzVar.M0 = null;
                    return;
                }
                return;
            case 6:
                m60 m60Var = (m60) this.d;
                super.onAnimationEnd(animator);
                boolean[] zArr2 = (boolean[]) this.f5723b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    ((n50) this.f5724c).run();
                }
                m60Var.h.setRotationY(0.0f);
                m60Var.f28427r0.setRotationY(0.0f);
                m60Var.O0 = false;
                m60Var.invalidate();
                return;
            case 7:
                g80 g80Var = (g80) this.f5723b;
                g80Var.setProgress(0.0f);
                g80Var.invalidate();
                AndroidUtilities.removeFromParent(g80Var);
                ViewTreeObserver viewTreeObserver = ((ViewGroup) this.f5724c).getViewTreeObserver();
                i80 i80Var = (i80) this.d;
                View view2 = i80Var.f27162f;
                viewTreeObserver.removeOnPreDrawListener(i80Var.f27190y);
                if (i80Var.P) {
                    view2.setVisibility(0);
                    if (view2 instanceof yh.g1) {
                        yh.g1 g1Var = (yh.g1) view2;
                        FrameLayout frameLayout = g1Var.d;
                        frameLayout.invalidate();
                        frameLayout.invalidateDrawable(g1Var.e);
                        return;
                    }
                    return;
                }
                return;
            default:
                x51 x51Var = (x51) this.d;
                x51Var.f43082r1 = null;
                x51Var.invalidate();
                boolean[] zArr3 = (boolean[]) this.f5723b;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    ((g01) this.f5724c).run();
                    return;
                }
                return;
        }
    }

    public p3(c2.b bVar, View view) {
        this.f5722a = 4;
        this.d = bVar;
        this.f5724c = view;
        this.f5723b = new org.telegram.ui.Cells.k7(this, 9);
    }
}
