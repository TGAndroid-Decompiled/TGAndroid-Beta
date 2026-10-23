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
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.h80;
import org.telegram.ui.Components.j80;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.n50;
import org.telegram.ui.Components.n60;
import org.telegram.ui.Components.t21;
import org.telegram.ui.Components.tz;
import org.telegram.ui.Components.yj0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.b61;
import org.telegram.ui.ey;
import org.telegram.ui.k01;
public final class o3 extends AnimatorListenerAdapter {
    public final int f5628a;
    public final Object f5629b;
    public final Object f5630c;
    public final Object d;

    public o3(Object obj, Object obj2, Object obj3, int i10) {
        this.f5628a = i10;
        this.d = obj;
        this.f5629b = obj2;
        this.f5630c = obj3;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f5628a) {
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
        switch (this.f5628a) {
            case 0:
                m7 m7Var = (m7) this.f5630c;
                p3 p3Var = (p3) this.d;
                p4 p4Var = p3Var.f5648a;
                p4Var.f5713u3 = false;
                p4Var.f5716v3 = 1.0f;
                p4Var.invalidate();
                boolean[] zArr = (boolean[]) this.f5629b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    p4 p4Var2 = p3Var.f5648a;
                    p4Var2.f5701q3 = true;
                    try {
                        p4Var2.performHapticFeedback(3);
                    } catch (Exception unused) {
                    }
                }
                m7Var.setAllowDrawReaction(true);
                m7Var.f5561r = true;
                ImageReceiver imageReceiver = m7Var.e;
                if (imageReceiver.getLottieAnimation() != null) {
                    imageReceiver.getLottieAnimation().N(0, false, true);
                }
                p4 p4Var3 = p3Var.f5648a;
                org.telegram.ui.Components.r5 r5Var = p4Var3.f5695o3;
                if (r5Var != null) {
                    r5Var.o(p4Var3);
                    p3Var.f5648a.f5695o3 = null;
                    return;
                }
                return;
            case 1:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.d).f20676x.remove((AnimatorSet) this.f5629b);
                View view = (View) this.f5630c;
                if (view instanceof org.telegram.ui.ActionBar.e1) {
                    bk0 bk0Var = ((org.telegram.ui.ActionBar.e1) view).f20837c;
                    if (bk0Var.getAnimatedDrawable() != null) {
                        bk0Var.getAnimatedDrawable().start();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.d;
                ViewGroup viewGroup = (ViewGroup) this.f5629b;
                if (viewGroup != null) {
                    chatActivityEnterView.f24124m1.removeView(chatActivityEnterView.f24078e1);
                    viewGroup.addView(chatActivityEnterView.f24078e1, (ViewGroup.LayoutParams) this.f5630c);
                }
                chatActivityEnterView.f24078e1.setAlpha(1.0f);
                chatActivityEnterView.f24097h1.setAlpha(1.0f);
                chatActivityEnterView.h = 0.0f;
                chatActivityEnterView.f24129n = 0.0f;
                chatActivityEnterView.C1();
                gi.b0 b0Var = chatActivityEnterView.f24120l0;
                if (b0Var != null) {
                    b0Var.setAlpha(0.0f);
                    chatActivityEnterView.f24120l0.setScaleX(0.0f);
                    chatActivityEnterView.f24120l0.setScaleY(0.0f);
                }
                if (chatActivityEnterView.O1 != null && chatActivityEnterView.P && !chatActivityEnterView.O && MessagesController.getGlobalMainSettings().getInt("voiceoncehint", 0) < 3) {
                    chatActivityEnterView.O1.b();
                    return;
                }
                return;
            case 3:
                ((ChatAttachAlertPhotoLayout) this.d).T = false;
                ((View) this.f5629b).setVisibility(4);
                ((ImageView) this.f5630c).sendAccessibilityEvent(8);
                return;
            case 4:
                if (((c2.b) this.d).f4493a) {
                    ((View) this.f5630c).postDelayed((org.telegram.ui.Cells.u5) this.f5629b, 300L);
                    return;
                }
                return;
            case 5:
                mm0 mm0Var = (mm0) this.f5630c;
                s4.s sVar = (s4.s) this.f5629b;
                tz tzVar = (tz) this.d;
                if (animator.equals(tzVar.M0)) {
                    int L0 = sVar.L0();
                    mm0Var.setTranslationY(0.0f);
                    if (mm0Var == tzVar.D0) {
                        mm0Var.setPadding(0, AndroidUtilities.dp(36.0f), 0, AndroidUtilities.dp(44.0f) + tzVar.f31009q2);
                    } else if (mm0Var == tzVar.f30981h0) {
                        mm0Var.setPadding(0, tzVar.f30962b1, 0, AndroidUtilities.dp(44.0f) + tzVar.f31009q2);
                    } else if (mm0Var == tzVar.P) {
                        mm0Var.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(44.0f) + tzVar.f31009q2);
                    }
                    if (L0 != -1) {
                        sVar.h1(L0, 0);
                    }
                    tzVar.M0 = null;
                    return;
                }
                return;
            case 6:
                n60 n60Var = (n60) this.d;
                super.onAnimationEnd(animator);
                boolean[] zArr2 = (boolean[]) this.f5629b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    ((n50) this.f5630c).run();
                }
                n60Var.h.setRotationY(0.0f);
                n60Var.f28874r0.setRotationY(0.0f);
                n60Var.O0 = false;
                n60Var.invalidate();
                return;
            case 7:
                h80 h80Var = (h80) this.f5629b;
                h80Var.setProgress(0.0f);
                h80Var.invalidate();
                AndroidUtilities.removeFromParent(h80Var);
                ViewTreeObserver viewTreeObserver = ((ViewGroup) this.f5630c).getViewTreeObserver();
                j80 j80Var = (j80) this.d;
                View view2 = j80Var.f27557f;
                viewTreeObserver.removeOnPreDrawListener(j80Var.f27585y);
                if (j80Var.P) {
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
            case 8:
                LaunchActivity launchActivity = (LaunchActivity) this.d;
                launchActivity.G0 = null;
                launchActivity.f33505z0.invalidate();
                launchActivity.f33483o0.invalidate();
                launchActivity.f33483o0.setImageDrawable(null);
                t21 t21Var = launchActivity.f33483o0;
                t21Var.f30622c = null;
                t21Var.f30620a.setShader(null);
                t21Var.f30624n = null;
                t21Var.f30625r = null;
                launchActivity.f33483o0.setVisibility(8);
                launchActivity.f33485p0.setVisibility(8);
                bk0 bk0Var2 = (bk0) this.f5629b;
                if (bk0Var2 != null) {
                    bk0Var2.setImageDrawable((yj0) this.f5630c);
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.themeAccentListUpdated, new Object[0]);
                if (bk0Var2 != null) {
                    bk0Var2.setVisibility(0);
                }
                ey.f37036z4 = false;
                return;
            default:
                b61 b61Var = (b61) this.d;
                b61Var.f35929s1 = null;
                b61Var.invalidate();
                boolean[] zArr3 = (boolean[]) this.f5629b;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    ((k01) this.f5630c).run();
                    return;
                }
                return;
        }
    }

    public o3(c2.b bVar, View view) {
        this.f5628a = 4;
        this.d = bVar;
        this.f5630c = view;
        this.f5629b = new org.telegram.ui.Cells.u5(this, 11);
    }
}
