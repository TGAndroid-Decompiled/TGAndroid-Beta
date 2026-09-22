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
import org.telegram.ui.Components.c60;
import org.telegram.ui.Components.d50;
import org.telegram.ui.Components.kz;
import org.telegram.ui.Components.nj0;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.y70;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.h90;
import org.telegram.ui.j71;
public final class y4 extends AnimatorListenerAdapter {
    public final int f1747a;
    public final Object f1748b;
    public final Object f1749c;
    public final Object d;

    public y4(Object obj, Object obj2, Object obj3, int i10) {
        this.f1747a = i10;
        this.d = obj;
        this.f1748b = obj2;
        this.f1749c = obj3;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f1747a) {
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
        switch (this.f1747a) {
            case 0:
                q9 q9Var = (q9) this.f1749c;
                z4 z4Var = (z4) this.d;
                f6 f6Var = z4Var.f1781a;
                f6Var.f856u3 = false;
                f6Var.f859v3 = 1.0f;
                f6Var.invalidate();
                boolean[] zArr = (boolean[]) this.f1748b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    f6 f6Var2 = z4Var.f1781a;
                    f6Var2.f844q3 = true;
                    try {
                        f6Var2.performHapticFeedback(3);
                    } catch (Exception unused) {
                    }
                }
                q9Var.setAllowDrawReaction(true);
                q9Var.f1437r = true;
                ImageReceiver imageReceiver = q9Var.e;
                if (imageReceiver.getLottieAnimation() != null) {
                    imageReceiver.getLottieAnimation().N(0, false, true);
                }
                f6 f6Var3 = z4Var.f1781a;
                org.telegram.ui.Components.p5 p5Var = f6Var3.f838o3;
                if (p5Var != null) {
                    p5Var.o(f6Var3);
                    z4Var.f1781a.f838o3 = null;
                    return;
                }
                return;
            case 1:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.d).f18667x.remove((AnimatorSet) this.f1748b);
                View view = (View) this.f1749c;
                if (view instanceof org.telegram.ui.ActionBar.f1) {
                    nj0 nj0Var = ((org.telegram.ui.ActionBar.f1) view).f18860c;
                    if (nj0Var.getAnimatedDrawable() != null) {
                        nj0Var.getAnimatedDrawable().start();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.d;
                ViewGroup viewGroup = (ViewGroup) this.f1748b;
                if (viewGroup != null) {
                    chatActivityEnterView.f22040m1.removeView(chatActivityEnterView.f21995e1);
                    viewGroup.addView(chatActivityEnterView.f21995e1, (ViewGroup.LayoutParams) this.f1749c);
                }
                chatActivityEnterView.f21995e1.setAlpha(1.0f);
                chatActivityEnterView.f22014h1.setAlpha(1.0f);
                chatActivityEnterView.h = 0.0f;
                chatActivityEnterView.f22045n = 0.0f;
                chatActivityEnterView.E1();
                ei.c0 c0Var = chatActivityEnterView.f22036l0;
                if (c0Var != null) {
                    c0Var.setAlpha(0.0f);
                    chatActivityEnterView.f22036l0.setScaleX(0.0f);
                    chatActivityEnterView.f22036l0.setScaleY(0.0f);
                }
                if (chatActivityEnterView.O1 != null && chatActivityEnterView.P && !chatActivityEnterView.O && MessagesController.getGlobalMainSettings().getInt("voiceoncehint", 0) < 3) {
                    chatActivityEnterView.O1.b();
                    return;
                }
                return;
            case 3:
                ((ChatAttachAlertPhotoLayout) this.d).T = false;
                ((View) this.f1748b).setVisibility(4);
                ((ImageView) this.f1749c).sendAccessibilityEvent(8);
                return;
            case 4:
                if (((com.google.firebase.messaging.m) this.d).f7325a) {
                    ((View) this.f1749c).postDelayed((org.telegram.ui.Cells.u6) this.f1748b, 300L);
                    return;
                }
                return;
            case 5:
                yl0 yl0Var = (yl0) this.f1749c;
                s4.s sVar = (s4.s) this.f1748b;
                kz kzVar = (kz) this.d;
                if (animator.equals(kzVar.M0)) {
                    int L0 = sVar.L0();
                    yl0Var.setTranslationY(0.0f);
                    if (yl0Var == kzVar.D0) {
                        yl0Var.setPadding(0, AndroidUtilities.dp(36.0f), 0, AndroidUtilities.dp(44.0f) + kzVar.f25898p2);
                    } else if (yl0Var == kzVar.f25873h0) {
                        yl0Var.setPadding(0, kzVar.f25854b1, 0, AndroidUtilities.dp(44.0f) + kzVar.f25898p2);
                    } else if (yl0Var == kzVar.P) {
                        yl0Var.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(44.0f) + kzVar.f25898p2);
                    }
                    if (L0 != -1) {
                        sVar.h1(L0, 0);
                    }
                    kzVar.M0 = null;
                    return;
                }
                return;
            case 6:
                c60 c60Var = (c60) this.d;
                super.onAnimationEnd(animator);
                boolean[] zArr2 = (boolean[]) this.f1748b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    ((d50) this.f1749c).run();
                }
                c60Var.h.setRotationY(0.0f);
                c60Var.f23248r0.setRotationY(0.0f);
                c60Var.J0 = false;
                c60Var.invalidate();
                return;
            case 7:
                w70 w70Var = (w70) this.f1748b;
                w70Var.setProgress(0.0f);
                w70Var.invalidate();
                AndroidUtilities.removeFromParent(w70Var);
                ViewTreeObserver viewTreeObserver = ((ViewGroup) this.f1749c).getViewTreeObserver();
                y70 y70Var = (y70) this.d;
                View view2 = y70Var.f30545f;
                viewTreeObserver.removeOnPreDrawListener(y70Var.f30573y);
                if (y70Var.P) {
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
                j71 j71Var = (j71) this.d;
                j71Var.f34838r1 = null;
                j71Var.invalidate();
                boolean[] zArr3 = (boolean[]) this.f1748b;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    ((h90) this.f1749c).run();
                    return;
                }
                return;
        }
    }

    public y4(com.google.firebase.messaging.m mVar, View view) {
        this.f1747a = 4;
        this.d = mVar;
        this.f1749c = view;
        this.f1748b = new org.telegram.ui.Cells.u6(this, 11);
    }
}
