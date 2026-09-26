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
import org.telegram.ui.Components.d60;
import org.telegram.ui.Components.f50;
import org.telegram.ui.Components.mj0;
import org.telegram.ui.Components.mz;
import org.telegram.ui.Components.x70;
import org.telegram.ui.Components.xl0;
import org.telegram.ui.Components.z70;
import org.telegram.ui.a71;
import org.telegram.ui.c90;
public final class y4 extends AnimatorListenerAdapter {
    public final int f1745a;
    public final Object f1746b;
    public final Object f1747c;
    public final Object d;

    public y4(Object obj, Object obj2, Object obj3, int i10) {
        this.f1745a = i10;
        this.d = obj;
        this.f1746b = obj2;
        this.f1747c = obj3;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f1745a) {
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
        switch (this.f1745a) {
            case 0:
                q9 q9Var = (q9) this.f1747c;
                z4 z4Var = (z4) this.d;
                e6 e6Var = z4Var.f1778a;
                e6Var.f832u3 = false;
                e6Var.f835v3 = 1.0f;
                e6Var.invalidate();
                boolean[] zArr = (boolean[]) this.f1746b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    e6 e6Var2 = z4Var.f1778a;
                    e6Var2.f820q3 = true;
                    try {
                        e6Var2.performHapticFeedback(3);
                    } catch (Exception unused) {
                    }
                }
                q9Var.setAllowDrawReaction(true);
                q9Var.f1438r = true;
                ImageReceiver imageReceiver = q9Var.e;
                if (imageReceiver.getLottieAnimation() != null) {
                    imageReceiver.getLottieAnimation().N(0, false, true);
                }
                e6 e6Var3 = z4Var.f1778a;
                org.telegram.ui.Components.q5 q5Var = e6Var3.f814o3;
                if (q5Var != null) {
                    q5Var.o(e6Var3);
                    z4Var.f1778a.f814o3 = null;
                    return;
                }
                return;
            case 1:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.d).f18659x.remove((AnimatorSet) this.f1746b);
                View view = (View) this.f1747c;
                if (view instanceof org.telegram.ui.ActionBar.e1) {
                    mj0 mj0Var = ((org.telegram.ui.ActionBar.e1) view).f18834c;
                    if (mj0Var.getAnimatedDrawable() != null) {
                        mj0Var.getAnimatedDrawable().start();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.d;
                ViewGroup viewGroup = (ViewGroup) this.f1746b;
                if (viewGroup != null) {
                    chatActivityEnterView.f22025m1.removeView(chatActivityEnterView.f21980e1);
                    viewGroup.addView(chatActivityEnterView.f21980e1, (ViewGroup.LayoutParams) this.f1747c);
                }
                chatActivityEnterView.f21980e1.setAlpha(1.0f);
                chatActivityEnterView.f21999h1.setAlpha(1.0f);
                chatActivityEnterView.h = 0.0f;
                chatActivityEnterView.f22030n = 0.0f;
                chatActivityEnterView.F1();
                ei.c0 c0Var = chatActivityEnterView.f22021l0;
                if (c0Var != null) {
                    c0Var.setAlpha(0.0f);
                    chatActivityEnterView.f22021l0.setScaleX(0.0f);
                    chatActivityEnterView.f22021l0.setScaleY(0.0f);
                }
                if (chatActivityEnterView.O1 != null && chatActivityEnterView.P && !chatActivityEnterView.O && MessagesController.getGlobalMainSettings().getInt("voiceoncehint", 0) < 3) {
                    chatActivityEnterView.O1.b();
                    return;
                }
                return;
            case 3:
                ((ChatAttachAlertPhotoLayout) this.d).T = false;
                ((View) this.f1746b).setVisibility(4);
                ((ImageView) this.f1747c).sendAccessibilityEvent(8);
                return;
            case 4:
                if (((com.google.firebase.messaging.m) this.d).f7309a) {
                    ((View) this.f1747c).postDelayed((org.telegram.ui.Cells.t6) this.f1746b, 300L);
                    return;
                }
                return;
            case 5:
                xl0 xl0Var = (xl0) this.f1747c;
                s4.s sVar = (s4.s) this.f1746b;
                mz mzVar = (mz) this.d;
                if (animator.equals(mzVar.M0)) {
                    int L0 = sVar.L0();
                    xl0Var.setTranslationY(0.0f);
                    if (xl0Var == mzVar.D0) {
                        xl0Var.setPadding(0, AndroidUtilities.dp(36.0f), 0, AndroidUtilities.dp(44.0f) + mzVar.f26588p2);
                    } else if (xl0Var == mzVar.f26563h0) {
                        xl0Var.setPadding(0, mzVar.f26544b1, 0, AndroidUtilities.dp(44.0f) + mzVar.f26588p2);
                    } else if (xl0Var == mzVar.P) {
                        xl0Var.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(44.0f) + mzVar.f26588p2);
                    }
                    if (L0 != -1) {
                        sVar.h1(L0, 0);
                    }
                    mzVar.M0 = null;
                    return;
                }
                return;
            case 6:
                d60 d60Var = (d60) this.d;
                super.onAnimationEnd(animator);
                boolean[] zArr2 = (boolean[]) this.f1746b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    ((f50) this.f1747c).run();
                }
                d60Var.h.setRotationY(0.0f);
                d60Var.f23575r0.setRotationY(0.0f);
                d60Var.J0 = false;
                d60Var.invalidate();
                return;
            case 7:
                x70 x70Var = (x70) this.f1746b;
                x70Var.setProgress(0.0f);
                x70Var.invalidate();
                AndroidUtilities.removeFromParent(x70Var);
                ViewTreeObserver viewTreeObserver = ((ViewGroup) this.f1747c).getViewTreeObserver();
                z70 z70Var = (z70) this.d;
                View view2 = z70Var.f30816f;
                viewTreeObserver.removeOnPreDrawListener(z70Var.f30844y);
                if (z70Var.P) {
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
                a71 a71Var = (a71) this.d;
                a71Var.f32047r1 = null;
                a71Var.invalidate();
                boolean[] zArr3 = (boolean[]) this.f1746b;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    ((c90) this.f1747c).run();
                    return;
                }
                return;
        }
    }

    public y4(com.google.firebase.messaging.m mVar, View view) {
        this.f1745a = 4;
        this.d = mVar;
        this.f1747c = view;
        this.f1746b = new org.telegram.ui.Cells.t6(this, 11);
    }
}
