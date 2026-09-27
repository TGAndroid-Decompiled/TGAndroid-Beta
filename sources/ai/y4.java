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
import org.telegram.ui.Components.a80;
import org.telegram.ui.Components.e60;
import org.telegram.ui.Components.g50;
import org.telegram.ui.Components.mz;
import org.telegram.ui.Components.nj0;
import org.telegram.ui.Components.y70;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.c71;
import org.telegram.ui.e90;
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
                mz mzVar = (mz) this.d;
                if (animator.equals(mzVar.M0)) {
                    mzVar.M0 = null;
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
                e6 e6Var = z4Var.f1780a;
                e6Var.f835u3 = false;
                e6Var.f838v3 = 1.0f;
                e6Var.invalidate();
                boolean[] zArr = (boolean[]) this.f1748b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    e6 e6Var2 = z4Var.f1780a;
                    e6Var2.f823q3 = true;
                    try {
                        e6Var2.performHapticFeedback(3);
                    } catch (Exception unused) {
                    }
                }
                q9Var.setAllowDrawReaction(true);
                q9Var.f1440r = true;
                ImageReceiver imageReceiver = q9Var.e;
                if (imageReceiver.getLottieAnimation() != null) {
                    imageReceiver.getLottieAnimation().N(0, false, true);
                }
                e6 e6Var3 = z4Var.f1780a;
                org.telegram.ui.Components.q5 q5Var = e6Var3.f817o3;
                if (q5Var != null) {
                    q5Var.o(e6Var3);
                    z4Var.f1780a.f817o3 = null;
                    return;
                }
                return;
            case 1:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.d).f18653x.remove((AnimatorSet) this.f1748b);
                View view = (View) this.f1749c;
                if (view instanceof org.telegram.ui.ActionBar.g1) {
                    nj0 nj0Var = ((org.telegram.ui.ActionBar.g1) view).f18882c;
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
                    chatActivityEnterView.f22028m1.removeView(chatActivityEnterView.f21983e1);
                    viewGroup.addView(chatActivityEnterView.f21983e1, (ViewGroup.LayoutParams) this.f1749c);
                }
                chatActivityEnterView.f21983e1.setAlpha(1.0f);
                chatActivityEnterView.f22002h1.setAlpha(1.0f);
                chatActivityEnterView.h = 0.0f;
                chatActivityEnterView.f22033n = 0.0f;
                chatActivityEnterView.E1();
                ei.c0 c0Var = chatActivityEnterView.f22024l0;
                if (c0Var != null) {
                    c0Var.setAlpha(0.0f);
                    chatActivityEnterView.f22024l0.setScaleX(0.0f);
                    chatActivityEnterView.f22024l0.setScaleY(0.0f);
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
                if (((com.google.firebase.messaging.m) this.d).f7317a) {
                    ((View) this.f1749c).postDelayed((org.telegram.ui.Cells.t6) this.f1748b, 300L);
                    return;
                }
                return;
            case 5:
                yl0 yl0Var = (yl0) this.f1749c;
                s4.s sVar = (s4.s) this.f1748b;
                mz mzVar = (mz) this.d;
                if (animator.equals(mzVar.M0)) {
                    int L0 = sVar.L0();
                    yl0Var.setTranslationY(0.0f);
                    if (yl0Var == mzVar.D0) {
                        yl0Var.setPadding(0, AndroidUtilities.dp(36.0f), 0, AndroidUtilities.dp(44.0f) + mzVar.f26614p2);
                    } else if (yl0Var == mzVar.f26589h0) {
                        yl0Var.setPadding(0, mzVar.f26570b1, 0, AndroidUtilities.dp(44.0f) + mzVar.f26614p2);
                    } else if (yl0Var == mzVar.P) {
                        yl0Var.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(44.0f) + mzVar.f26614p2);
                    }
                    if (L0 != -1) {
                        sVar.h1(L0, 0);
                    }
                    mzVar.M0 = null;
                    return;
                }
                return;
            case 6:
                e60 e60Var = (e60) this.d;
                super.onAnimationEnd(animator);
                boolean[] zArr2 = (boolean[]) this.f1748b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    ((g50) this.f1749c).run();
                }
                e60Var.h.setRotationY(0.0f);
                e60Var.f23923r0.setRotationY(0.0f);
                e60Var.J0 = false;
                e60Var.invalidate();
                return;
            case 7:
                y70 y70Var = (y70) this.f1748b;
                y70Var.setProgress(0.0f);
                y70Var.invalidate();
                AndroidUtilities.removeFromParent(y70Var);
                ViewTreeObserver viewTreeObserver = ((ViewGroup) this.f1749c).getViewTreeObserver();
                a80 a80Var = (a80) this.d;
                View view2 = a80Var.f22583f;
                viewTreeObserver.removeOnPreDrawListener(a80Var.f22611y);
                if (a80Var.P) {
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
                c71 c71Var = (c71) this.d;
                c71Var.f32606r1 = null;
                c71Var.invalidate();
                boolean[] zArr3 = (boolean[]) this.f1748b;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    ((e90) this.f1749c).run();
                    return;
                }
                return;
        }
    }

    public y4(com.google.firebase.messaging.m mVar, View view) {
        this.f1747a = 4;
        this.d = mVar;
        this.f1749c = view;
        this.f1748b = new org.telegram.ui.Cells.t6(this, 11);
    }
}
