package ai;

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
import org.telegram.ui.Components.b60;
import org.telegram.ui.Components.d50;
import org.telegram.ui.Components.kz;
import org.telegram.ui.Components.lj0;
import org.telegram.ui.Components.u70;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.g71;
import org.telegram.ui.h90;
public final class y4 extends AnimatorListenerAdapter {
    public final int f1750a;
    public final Object f1751b;
    public final Object f1752c;
    public final Object d;

    public y4(Object obj, Object obj2, Object obj3, int i10) {
        this.f1750a = i10;
        this.d = obj;
        this.f1751b = obj2;
        this.f1752c = obj3;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f1750a) {
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
        switch (this.f1750a) {
            case 0:
                q9 q9Var = (q9) this.f1752c;
                z4 z4Var = (z4) this.d;
                f6 f6Var = z4Var.f1784a;
                f6Var.f859u3 = false;
                f6Var.f862v3 = 1.0f;
                f6Var.invalidate();
                boolean[] zArr = (boolean[]) this.f1751b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    f6 f6Var2 = z4Var.f1784a;
                    f6Var2.f847q3 = true;
                    try {
                        f6Var2.performHapticFeedback(3);
                    } catch (Exception unused) {
                    }
                }
                q9Var.setAllowDrawReaction(true);
                q9Var.f1440r = true;
                ImageReceiver imageReceiver = q9Var.e;
                if (imageReceiver.getLottieAnimation() != null) {
                    imageReceiver.getLottieAnimation().N(0, false, true);
                }
                f6 f6Var3 = z4Var.f1784a;
                org.telegram.ui.Components.q5 q5Var = f6Var3.f841o3;
                if (q5Var != null) {
                    q5Var.o(f6Var3);
                    z4Var.f1784a.f841o3 = null;
                    return;
                }
                return;
            case 1:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.d).f18620x.remove((AnimatorSet) this.f1751b);
                View view = (View) this.f1752c;
                if (view instanceof org.telegram.ui.ActionBar.f1) {
                    lj0 lj0Var = ((org.telegram.ui.ActionBar.f1) view).f18810c;
                    if (lj0Var.getAnimatedDrawable() != null) {
                        lj0Var.getAnimatedDrawable().start();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.d;
                ViewGroup viewGroup = (ViewGroup) this.f1751b;
                if (viewGroup != null) {
                    chatActivityEnterView.l1.removeView(chatActivityEnterView.f21945e1);
                    viewGroup.addView(chatActivityEnterView.f21945e1, (ViewGroup.LayoutParams) this.f1752c);
                }
                chatActivityEnterView.f21945e1.setAlpha(1.0f);
                chatActivityEnterView.f21964h1.setAlpha(1.0f);
                chatActivityEnterView.h = 0.0f;
                chatActivityEnterView.f21994n = 0.0f;
                chatActivityEnterView.E1();
                ei.c0 c0Var = chatActivityEnterView.f21986l0;
                if (c0Var != null) {
                    c0Var.setAlpha(0.0f);
                    chatActivityEnterView.f21986l0.setScaleX(0.0f);
                    chatActivityEnterView.f21986l0.setScaleY(0.0f);
                }
                if (chatActivityEnterView.N1 != null && chatActivityEnterView.P && !chatActivityEnterView.O && MessagesController.getGlobalMainSettings().getInt("voiceoncehint", 0) < 3) {
                    chatActivityEnterView.N1.b();
                    return;
                }
                return;
            case 3:
                ((ChatAttachAlertPhotoLayout) this.d).T = false;
                ((View) this.f1751b).setVisibility(4);
                ((ImageView) this.f1752c).sendAccessibilityEvent(8);
                return;
            case 4:
                if (((com.google.firebase.messaging.m) this.d).f7326a) {
                    ((View) this.f1752c).postDelayed((org.telegram.ui.Cells.t6) this.f1751b, 300L);
                    return;
                }
                return;
            case 5:
                wl0 wl0Var = (wl0) this.f1752c;
                s4.s sVar = (s4.s) this.f1751b;
                kz kzVar = (kz) this.d;
                if (animator.equals(kzVar.M0)) {
                    int L0 = sVar.L0();
                    wl0Var.setTranslationY(0.0f);
                    if (wl0Var == kzVar.D0) {
                        wl0Var.setPadding(0, AndroidUtilities.dp(36.0f), 0, AndroidUtilities.dp(44.0f) + kzVar.f25932p2);
                    } else if (wl0Var == kzVar.f25907h0) {
                        wl0Var.setPadding(0, kzVar.f25888b1, 0, AndroidUtilities.dp(44.0f) + kzVar.f25932p2);
                    } else if (wl0Var == kzVar.P) {
                        wl0Var.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(44.0f) + kzVar.f25932p2);
                    }
                    if (L0 != -1) {
                        sVar.h1(L0, 0);
                    }
                    kzVar.M0 = null;
                    return;
                }
                return;
            case 6:
                b60 b60Var = (b60) this.d;
                super.onAnimationEnd(animator);
                boolean[] zArr2 = (boolean[]) this.f1751b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    ((d50) this.f1752c).run();
                }
                b60Var.e.setRotationY(0.0f);
                b60Var.f22849p0.setRotationY(0.0f);
                b60Var.H0 = false;
                b60Var.invalidate();
                return;
            case 7:
                u70 u70Var = (u70) this.f1751b;
                u70Var.setProgress(0.0f);
                u70Var.invalidate();
                AndroidUtilities.removeFromParent(u70Var);
                ViewTreeObserver viewTreeObserver = ((ViewGroup) this.f1752c).getViewTreeObserver();
                w70 w70Var = (w70) this.d;
                View view2 = w70Var.f29901f;
                viewTreeObserver.removeOnPreDrawListener(w70Var.f29929y);
                if (w70Var.P) {
                    view2.setVisibility(0);
                    if (view2 instanceof xh.j1) {
                        xh.j1 j1Var = (xh.j1) view2;
                        FrameLayout frameLayout = j1Var.d;
                        frameLayout.invalidate();
                        frameLayout.invalidateDrawable(j1Var.e);
                        return;
                    }
                    return;
                }
                return;
            default:
                g71 g71Var = (g71) this.d;
                g71Var.f33749r1 = null;
                g71Var.invalidate();
                boolean[] zArr3 = (boolean[]) this.f1751b;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    ((h90) this.f1752c).run();
                    return;
                }
                return;
        }
    }

    public y4(com.google.firebase.messaging.m mVar, View view) {
        this.f1750a = 4;
        this.d = mVar;
        this.f1752c = view;
        this.f1751b = new org.telegram.ui.Cells.t6(this, 11);
    }
}
