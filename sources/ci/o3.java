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
import org.telegram.ui.Components.ak0;
import org.telegram.ui.Components.f80;
import org.telegram.ui.Components.h80;
import org.telegram.ui.Components.l50;
import org.telegram.ui.Components.l60;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.rz;
import org.telegram.ui.Components.s21;
import org.telegram.ui.Components.xj0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.a61;
import org.telegram.ui.ey;
import org.telegram.ui.j01;
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
                rz rzVar = (rz) this.d;
                if (animator.equals(rzVar.M0)) {
                    rzVar.M0 = null;
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
                org.telegram.ui.Components.p5 p5Var = p4Var3.f5695o3;
                if (p5Var != null) {
                    p5Var.o(p4Var3);
                    p3Var.f5648a.f5695o3 = null;
                    return;
                }
                return;
            case 1:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.d).f20677x.remove((AnimatorSet) this.f5629b);
                View view = (View) this.f5630c;
                if (view instanceof org.telegram.ui.ActionBar.e1) {
                    ak0 ak0Var = ((org.telegram.ui.ActionBar.e1) view).f20838c;
                    if (ak0Var.getAnimatedDrawable() != null) {
                        ak0Var.getAnimatedDrawable().start();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.d;
                ViewGroup viewGroup = (ViewGroup) this.f5629b;
                if (viewGroup != null) {
                    chatActivityEnterView.f24125m1.removeView(chatActivityEnterView.f24079e1);
                    viewGroup.addView(chatActivityEnterView.f24079e1, (ViewGroup.LayoutParams) this.f5630c);
                }
                chatActivityEnterView.f24079e1.setAlpha(1.0f);
                chatActivityEnterView.f24098h1.setAlpha(1.0f);
                chatActivityEnterView.h = 0.0f;
                chatActivityEnterView.f24130n = 0.0f;
                chatActivityEnterView.C1();
                gi.b0 b0Var = chatActivityEnterView.f24121l0;
                if (b0Var != null) {
                    b0Var.setAlpha(0.0f);
                    chatActivityEnterView.f24121l0.setScaleX(0.0f);
                    chatActivityEnterView.f24121l0.setScaleY(0.0f);
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
                lm0 lm0Var = (lm0) this.f5630c;
                s4.s sVar = (s4.s) this.f5629b;
                rz rzVar = (rz) this.d;
                if (animator.equals(rzVar.M0)) {
                    int L0 = sVar.L0();
                    lm0Var.setTranslationY(0.0f);
                    if (lm0Var == rzVar.D0) {
                        lm0Var.setPadding(0, AndroidUtilities.dp(36.0f), 0, AndroidUtilities.dp(44.0f) + rzVar.f30353q2);
                    } else if (lm0Var == rzVar.f30325h0) {
                        lm0Var.setPadding(0, rzVar.f30306b1, 0, AndroidUtilities.dp(44.0f) + rzVar.f30353q2);
                    } else if (lm0Var == rzVar.P) {
                        lm0Var.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(44.0f) + rzVar.f30353q2);
                    }
                    if (L0 != -1) {
                        sVar.h1(L0, 0);
                    }
                    rzVar.M0 = null;
                    return;
                }
                return;
            case 6:
                l60 l60Var = (l60) this.d;
                super.onAnimationEnd(animator);
                boolean[] zArr2 = (boolean[]) this.f5629b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    ((l50) this.f5630c).run();
                }
                l60Var.h.setRotationY(0.0f);
                l60Var.f28208r0.setRotationY(0.0f);
                l60Var.O0 = false;
                l60Var.invalidate();
                return;
            case 7:
                f80 f80Var = (f80) this.f5629b;
                f80Var.setProgress(0.0f);
                f80Var.invalidate();
                AndroidUtilities.removeFromParent(f80Var);
                ViewTreeObserver viewTreeObserver = ((ViewGroup) this.f5630c).getViewTreeObserver();
                h80 h80Var = (h80) this.d;
                View view2 = h80Var.f26906f;
                viewTreeObserver.removeOnPreDrawListener(h80Var.f26934y);
                if (h80Var.P) {
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
                launchActivity.f33507z0.invalidate();
                launchActivity.f33485o0.invalidate();
                launchActivity.f33485o0.setImageDrawable(null);
                s21 s21Var = launchActivity.f33485o0;
                s21Var.f30421c = null;
                s21Var.f30419a.setShader(null);
                s21Var.f30423n = null;
                s21Var.f30424r = null;
                launchActivity.f33485o0.setVisibility(8);
                launchActivity.f33487p0.setVisibility(8);
                ak0 ak0Var2 = (ak0) this.f5629b;
                if (ak0Var2 != null) {
                    ak0Var2.setImageDrawable((xj0) this.f5630c);
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.themeAccentListUpdated, new Object[0]);
                if (ak0Var2 != null) {
                    ak0Var2.setVisibility(0);
                }
                ey.f37011z4 = false;
                return;
            default:
                a61 a61Var = (a61) this.d;
                a61Var.f35646s1 = null;
                a61Var.invalidate();
                boolean[] zArr3 = (boolean[]) this.f5629b;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    ((j01) this.f5630c).run();
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
