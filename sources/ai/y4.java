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
import org.telegram.ui.Components.e50;
import org.telegram.ui.Components.lj0;
import org.telegram.ui.Components.lz;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.Components.y70;
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
                lz lzVar = (lz) this.d;
                if (animator.equals(lzVar.M0)) {
                    lzVar.M0 = null;
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
                    lj0 lj0Var = ((org.telegram.ui.ActionBar.e1) view).f18834c;
                    if (lj0Var.getAnimatedDrawable() != null) {
                        lj0Var.getAnimatedDrawable().start();
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
                wl0 wl0Var = (wl0) this.f1747c;
                s4.s sVar = (s4.s) this.f1746b;
                lz lzVar = (lz) this.d;
                if (animator.equals(lzVar.M0)) {
                    int L0 = sVar.L0();
                    wl0Var.setTranslationY(0.0f);
                    if (wl0Var == lzVar.D0) {
                        wl0Var.setPadding(0, AndroidUtilities.dp(36.0f), 0, AndroidUtilities.dp(44.0f) + lzVar.f26276p2);
                    } else if (wl0Var == lzVar.f26251h0) {
                        wl0Var.setPadding(0, lzVar.f26232b1, 0, AndroidUtilities.dp(44.0f) + lzVar.f26276p2);
                    } else if (wl0Var == lzVar.P) {
                        wl0Var.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(44.0f) + lzVar.f26276p2);
                    }
                    if (L0 != -1) {
                        sVar.h1(L0, 0);
                    }
                    lzVar.M0 = null;
                    return;
                }
                return;
            case 6:
                c60 c60Var = (c60) this.d;
                super.onAnimationEnd(animator);
                boolean[] zArr2 = (boolean[]) this.f1746b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    ((e50) this.f1747c).run();
                }
                c60Var.h.setRotationY(0.0f);
                c60Var.f23237r0.setRotationY(0.0f);
                c60Var.J0 = false;
                c60Var.invalidate();
                return;
            case 7:
                w70 w70Var = (w70) this.f1746b;
                w70Var.setProgress(0.0f);
                w70Var.invalidate();
                AndroidUtilities.removeFromParent(w70Var);
                ViewTreeObserver viewTreeObserver = ((ViewGroup) this.f1747c).getViewTreeObserver();
                y70 y70Var = (y70) this.d;
                View view2 = y70Var.f30531f;
                viewTreeObserver.removeOnPreDrawListener(y70Var.f30559y);
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
                a71 a71Var = (a71) this.d;
                a71Var.f32048r1 = null;
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
