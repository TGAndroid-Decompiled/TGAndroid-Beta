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
import org.telegram.ui.Components.d00;
import org.telegram.ui.Components.ik0;
import org.telegram.ui.Components.q80;
import org.telegram.ui.Components.s80;
import org.telegram.ui.Components.w60;
import org.telegram.ui.Components.wm0;
import org.telegram.ui.Components.y50;
import org.telegram.ui.i90;
import org.telegram.ui.n71;
public final class z4 extends AnimatorListenerAdapter {
    public final int f2002a;
    public final Object f2003b;
    public final Object f2004c;
    public final Object d;

    public z4(Object obj, Object obj2, Object obj3, int i10) {
        this.f2002a = i10;
        this.d = obj;
        this.f2003b = obj2;
        this.f2004c = obj3;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f2002a) {
            case 5:
                d00 d00Var = (d00) this.d;
                if (animator.equals(d00Var.M0)) {
                    d00Var.M0 = null;
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
        switch (this.f2002a) {
            case 0:
                r9 r9Var = (r9) this.f2004c;
                a5 a5Var = (a5) this.d;
                f6 f6Var = a5Var.f644a;
                f6Var.f1009u3 = false;
                f6Var.f1012v3 = 1.0f;
                f6Var.invalidate();
                boolean[] zArr = (boolean[]) this.f2003b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    f6 f6Var2 = a5Var.f644a;
                    f6Var2.f997q3 = true;
                    try {
                        f6Var2.performHapticFeedback(3);
                    } catch (Exception unused) {
                    }
                }
                r9Var.setAllowDrawReaction(true);
                r9Var.f1673r = true;
                ImageReceiver imageReceiver = r9Var.f1670e;
                if (imageReceiver.getLottieAnimation() != null) {
                    imageReceiver.getLottieAnimation().N(0, false, true);
                }
                f6 f6Var3 = a5Var.f644a;
                org.telegram.ui.Components.s5 s5Var = f6Var3.f991o3;
                if (s5Var != null) {
                    s5Var.o(f6Var3);
                    a5Var.f644a.f991o3 = null;
                    return;
                }
                return;
            case 1:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.d).f20140x.remove((AnimatorSet) this.f2003b);
                View view = (View) this.f2004c;
                if (view instanceof org.telegram.ui.ActionBar.e1) {
                    ik0 ik0Var = ((org.telegram.ui.ActionBar.e1) view).f20324c;
                    if (ik0Var.getAnimatedDrawable() != null) {
                        ik0Var.getAnimatedDrawable().start();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.d;
                ViewGroup viewGroup = (ViewGroup) this.f2003b;
                if (viewGroup != null) {
                    chatActivityEnterView.f23690m1.removeView(chatActivityEnterView.f23645e1);
                    viewGroup.addView(chatActivityEnterView.f23645e1, (ViewGroup.LayoutParams) this.f2004c);
                }
                chatActivityEnterView.f23645e1.setAlpha(1.0f);
                chatActivityEnterView.f23664h1.setAlpha(1.0f);
                chatActivityEnterView.h = 0.0f;
                chatActivityEnterView.f23695n = 0.0f;
                chatActivityEnterView.I1();
                ei.c0 c0Var = chatActivityEnterView.f23686l0;
                if (c0Var != null) {
                    c0Var.setAlpha(0.0f);
                    chatActivityEnterView.f23686l0.setScaleX(0.0f);
                    chatActivityEnterView.f23686l0.setScaleY(0.0f);
                }
                if (chatActivityEnterView.O1 != null && chatActivityEnterView.P && !chatActivityEnterView.O && MessagesController.getGlobalMainSettings().getInt("voiceoncehint", 0) < 3) {
                    chatActivityEnterView.O1.c();
                    return;
                }
                return;
            case 3:
                ((ChatAttachAlertPhotoLayout) this.d).T = false;
                ((View) this.f2003b).setVisibility(4);
                ((ImageView) this.f2004c).sendAccessibilityEvent(8);
                return;
            case 4:
                if (((com.google.firebase.messaging.m) this.d).f7947a) {
                    ((View) this.f2004c).postDelayed((org.telegram.ui.Cells.l7) this.f2003b, 300L);
                    return;
                }
                return;
            case 5:
                wm0 wm0Var = (wm0) this.f2004c;
                s4.s sVar = (s4.s) this.f2003b;
                d00 d00Var = (d00) this.d;
                if (animator.equals(d00Var.M0)) {
                    int L0 = sVar.L0();
                    wm0Var.setTranslationY(0.0f);
                    if (wm0Var == d00Var.D0) {
                        wm0Var.setPadding(0, AndroidUtilities.dp(36.0f), 0, AndroidUtilities.dp(44.0f) + d00Var.f25113p2);
                    } else if (wm0Var == d00Var.f25088h0) {
                        wm0Var.setPadding(0, d00Var.f25068b1, 0, AndroidUtilities.dp(44.0f) + d00Var.f25113p2);
                    } else if (wm0Var == d00Var.P) {
                        wm0Var.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(44.0f) + d00Var.f25113p2);
                    }
                    if (L0 != -1) {
                        sVar.h1(L0, 0);
                    }
                    d00Var.M0 = null;
                    return;
                }
                return;
            case 6:
                w60 w60Var = (w60) this.d;
                super.onAnimationEnd(animator);
                boolean[] zArr2 = (boolean[]) this.f2003b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    ((y50) this.f2004c).run();
                }
                w60Var.h.setRotationY(0.0f);
                w60Var.f32303r0.setRotationY(0.0f);
                w60Var.O0 = false;
                w60Var.invalidate();
                return;
            case 7:
                q80 q80Var = (q80) this.f2003b;
                q80Var.setProgress(0.0f);
                q80Var.invalidate();
                AndroidUtilities.removeFromParent(q80Var);
                ViewTreeObserver viewTreeObserver = ((ViewGroup) this.f2004c).getViewTreeObserver();
                s80 s80Var = (s80) this.d;
                View view2 = s80Var.f30445f;
                viewTreeObserver.removeOnPreDrawListener(s80Var.f30473y);
                if (s80Var.P) {
                    view2.setVisibility(0);
                    if (view2 instanceof xh.i1) {
                        xh.i1 i1Var = (xh.i1) view2;
                        FrameLayout frameLayout = i1Var.d;
                        frameLayout.invalidate();
                        frameLayout.invalidateDrawable(i1Var.f51524e);
                        return;
                    }
                    return;
                }
                return;
            default:
                n71 n71Var = (n71) this.d;
                n71Var.f40296r1 = null;
                n71Var.invalidate();
                boolean[] zArr3 = (boolean[]) this.f2003b;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    ((i90) this.f2004c).run();
                    return;
                }
                return;
        }
    }

    public z4(com.google.firebase.messaging.m mVar, View view) {
        this.f2002a = 4;
        this.d = mVar;
        this.f2004c = view;
        this.f2003b = new org.telegram.ui.Cells.l7(this, 9);
    }
}
