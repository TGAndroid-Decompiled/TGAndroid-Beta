package di;

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
import org.telegram.ui.Components.c31;
import org.telegram.ui.Components.j80;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.p50;
import org.telegram.ui.Components.p60;
import org.telegram.ui.Components.sz;
import org.telegram.ui.Components.yj0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ey;
import org.telegram.ui.f61;
import org.telegram.ui.q01;
public final class o3 extends AnimatorListenerAdapter {
    public final int f8867a;
    public final Object f8868b;
    public final Object f8869c;
    public final Object d;

    public o3(Object obj, Object obj2, Object obj3, int i10) {
        this.f8867a = i10;
        this.d = obj;
        this.f8868b = obj2;
        this.f8869c = obj3;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f8867a) {
            case 5:
                sz szVar = (sz) this.d;
                if (animator.equals(szVar.M0)) {
                    szVar.M0 = null;
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
        switch (this.f8867a) {
            case 0:
                m7 m7Var = (m7) this.f8869c;
                p3 p3Var = (p3) this.d;
                q4 q4Var = p3Var.f8898a;
                q4Var.f8992j3 = false;
                q4Var.f8995k3 = 1.0f;
                q4Var.invalidate();
                boolean[] zArr = (boolean[]) this.f8868b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    q4 q4Var2 = p3Var.f8898a;
                    q4Var2.f8980f3 = true;
                    try {
                        q4Var2.performHapticFeedback(3);
                    } catch (Exception unused) {
                    }
                }
                m7Var.setAllowDrawReaction(true);
                m7Var.f8791r = true;
                ImageReceiver imageReceiver = m7Var.e;
                if (imageReceiver.getLottieAnimation() != null) {
                    imageReceiver.getLottieAnimation().N(0, false, true);
                }
                q4 q4Var3 = p3Var.f8898a;
                org.telegram.ui.Components.t5 t5Var = q4Var3.f8974d3;
                if (t5Var != null) {
                    t5Var.o(q4Var3);
                    p3Var.f8898a.f8974d3 = null;
                    return;
                }
                return;
            case 1:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.d).f22367x.remove((AnimatorSet) this.f8868b);
                View view = (View) this.f8869c;
                if (view instanceof org.telegram.ui.ActionBar.g1) {
                    bk0 bk0Var = ((org.telegram.ui.ActionBar.g1) view).f22639c;
                    if (bk0Var.getAnimatedDrawable() != null) {
                        bk0Var.getAnimatedDrawable().start();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.d;
                ViewGroup viewGroup = (ViewGroup) this.f8868b;
                if (viewGroup != null) {
                    chatActivityEnterView.f25919m1.removeView(chatActivityEnterView.f25873e1);
                    viewGroup.addView(chatActivityEnterView.f25873e1, (ViewGroup.LayoutParams) this.f8869c);
                }
                chatActivityEnterView.f25873e1.setAlpha(1.0f);
                chatActivityEnterView.f25892h1.setAlpha(1.0f);
                chatActivityEnterView.h = 0.0f;
                chatActivityEnterView.f25924n = 0.0f;
                chatActivityEnterView.C1();
                hi.i0 i0Var = chatActivityEnterView.f25915l0;
                if (i0Var != null) {
                    i0Var.setAlpha(0.0f);
                    chatActivityEnterView.f25915l0.setScaleX(0.0f);
                    chatActivityEnterView.f25915l0.setScaleY(0.0f);
                }
                if (chatActivityEnterView.O1 != null && chatActivityEnterView.P && !chatActivityEnterView.O && MessagesController.getGlobalMainSettings().getInt("voiceoncehint", 0) < 3) {
                    chatActivityEnterView.O1.b();
                    return;
                }
                return;
            case 3:
                ((ChatAttachAlertPhotoLayout) this.d).T = false;
                ((View) this.f8868b).setVisibility(4);
                ((ImageView) this.f8869c).sendAccessibilityEvent(8);
                return;
            case 4:
                if (((c2.b) this.d).f5929a) {
                    ((View) this.f8869c).postDelayed((m.g3) this.f8868b, 300L);
                    return;
                }
                return;
            case 5:
                nm0 nm0Var = (nm0) this.f8869c;
                s4.t tVar = (s4.t) this.f8868b;
                sz szVar = (sz) this.d;
                if (animator.equals(szVar.M0)) {
                    int L0 = tVar.L0();
                    nm0Var.setTranslationY(0.0f);
                    if (nm0Var == szVar.D0) {
                        nm0Var.setPadding(0, AndroidUtilities.dp(36.0f), 0, AndroidUtilities.dp(44.0f) + szVar.f32756q2);
                    } else if (nm0Var == szVar.f32728h0) {
                        nm0Var.setPadding(0, szVar.f32709b1, 0, AndroidUtilities.dp(44.0f) + szVar.f32756q2);
                    } else if (nm0Var == szVar.P) {
                        nm0Var.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(44.0f) + szVar.f32756q2);
                    }
                    if (L0 != -1) {
                        tVar.h1(L0, 0);
                    }
                    szVar.M0 = null;
                    return;
                }
                return;
            case 6:
                p60 p60Var = (p60) this.d;
                super.onAnimationEnd(animator);
                boolean[] zArr2 = (boolean[]) this.f8868b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    ((p50) this.f8869c).run();
                }
                p60Var.f31477f.setRotationY(0.0f);
                p60Var.f31495q0.setRotationY(0.0f);
                p60Var.N0 = false;
                p60Var.invalidate();
                return;
            case 7:
                j80 j80Var = (j80) this.f8868b;
                j80Var.setProgress(0.0f);
                j80Var.invalidate();
                AndroidUtilities.removeFromParent(j80Var);
                ViewTreeObserver viewTreeObserver = ((ViewGroup) this.f8869c).getViewTreeObserver();
                l80 l80Var = (l80) this.d;
                View view2 = l80Var.f30145f;
                viewTreeObserver.removeOnPreDrawListener(l80Var.f30173y);
                if (l80Var.P) {
                    view2.setVisibility(0);
                    if (view2 instanceof zh.g1) {
                        zh.g1 g1Var = (zh.g1) view2;
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
                launchActivity.f35595z0.invalidate();
                launchActivity.f35573o0.invalidate();
                launchActivity.f35573o0.setImageDrawable(null);
                c31 c31Var = launchActivity.f35573o0;
                c31Var.f27048c = null;
                c31Var.f27046a.setShader(null);
                c31Var.f27050n = null;
                c31Var.f27051r = null;
                launchActivity.f35573o0.setVisibility(8);
                launchActivity.f35575p0.setVisibility(8);
                bk0 bk0Var2 = (bk0) this.f8868b;
                if (bk0Var2 != null) {
                    bk0Var2.setImageDrawable((yj0) this.f8869c);
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.themeAccentListUpdated, new Object[0]);
                if (bk0Var2 != null) {
                    bk0Var2.setVisibility(0);
                }
                ey.f38974y4 = false;
                return;
            default:
                f61 f61Var = (f61) this.d;
                f61Var.f39226s1 = null;
                f61Var.invalidate();
                boolean[] zArr3 = (boolean[]) this.f8868b;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    ((q01) this.f8869c).run();
                    return;
                }
                return;
        }
    }

    public o3(c2.b bVar, View view) {
        this.f8867a = 4;
        this.d = bVar;
        this.f8869c = view;
        this.f8868b = new m.g3(this, 15);
    }
}
