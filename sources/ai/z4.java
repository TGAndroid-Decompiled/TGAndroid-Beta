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
import org.telegram.ui.Components.a00;
import org.telegram.ui.Components.fk0;
import org.telegram.ui.Components.n80;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.qm0;
import org.telegram.ui.Components.t60;
import org.telegram.ui.Components.v50;
import org.telegram.ui.g90;
import org.telegram.ui.k71;
public final class z4 extends AnimatorListenerAdapter {
    public final int f2004a;
    public final Object f2005b;
    public final Object f2006c;
    public final Object d;

    public z4(Object obj, Object obj2, Object obj3, int i10) {
        this.f2004a = i10;
        this.d = obj;
        this.f2005b = obj2;
        this.f2006c = obj3;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f2004a) {
            case 5:
                a00 a00Var = (a00) this.d;
                if (animator.equals(a00Var.M0)) {
                    a00Var.M0 = null;
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
        switch (this.f2004a) {
            case 0:
                r9 r9Var = (r9) this.f2006c;
                a5 a5Var = (a5) this.d;
                f6 f6Var = a5Var.f642a;
                f6Var.f1011u3 = false;
                f6Var.f1014v3 = 1.0f;
                f6Var.invalidate();
                boolean[] zArr = (boolean[]) this.f2005b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    f6 f6Var2 = a5Var.f642a;
                    f6Var2.f999q3 = true;
                    try {
                        f6Var2.performHapticFeedback(3);
                    } catch (Exception unused) {
                    }
                }
                r9Var.setAllowDrawReaction(true);
                r9Var.f1675r = true;
                ImageReceiver imageReceiver = r9Var.f1672e;
                if (imageReceiver.getLottieAnimation() != null) {
                    imageReceiver.getLottieAnimation().N(0, false, true);
                }
                f6 f6Var3 = a5Var.f642a;
                org.telegram.ui.Components.s5 s5Var = f6Var3.f993o3;
                if (s5Var != null) {
                    s5Var.o(f6Var3);
                    a5Var.f642a.f993o3 = null;
                    return;
                }
                return;
            case 1:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.d).f20372x.remove((AnimatorSet) this.f2005b);
                View view = (View) this.f2006c;
                if (view instanceof org.telegram.ui.ActionBar.f1) {
                    fk0 fk0Var = ((org.telegram.ui.ActionBar.f1) view).f20577c;
                    if (fk0Var.getAnimatedDrawable() != null) {
                        fk0Var.getAnimatedDrawable().start();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.d;
                ViewGroup viewGroup = (ViewGroup) this.f2005b;
                if (viewGroup != null) {
                    chatActivityEnterView.f23924m1.removeView(chatActivityEnterView.f23879e1);
                    viewGroup.addView(chatActivityEnterView.f23879e1, (ViewGroup.LayoutParams) this.f2006c);
                }
                chatActivityEnterView.f23879e1.setAlpha(1.0f);
                chatActivityEnterView.f23898h1.setAlpha(1.0f);
                chatActivityEnterView.h = 0.0f;
                chatActivityEnterView.f23929n = 0.0f;
                chatActivityEnterView.D1();
                ei.c0 c0Var = chatActivityEnterView.f23920l0;
                if (c0Var != null) {
                    c0Var.setAlpha(0.0f);
                    chatActivityEnterView.f23920l0.setScaleX(0.0f);
                    chatActivityEnterView.f23920l0.setScaleY(0.0f);
                }
                if (chatActivityEnterView.O1 != null && chatActivityEnterView.P && !chatActivityEnterView.O && MessagesController.getGlobalMainSettings().getInt("voiceoncehint", 0) < 3) {
                    chatActivityEnterView.O1.b();
                    return;
                }
                return;
            case 3:
                ((ChatAttachAlertPhotoLayout) this.d).T = false;
                ((View) this.f2005b).setVisibility(4);
                ((ImageView) this.f2006c).sendAccessibilityEvent(8);
                return;
            case 4:
                if (((com.google.firebase.messaging.m) this.d).f7951a) {
                    ((View) this.f2006c).postDelayed((org.telegram.ui.Cells.t6) this.f2005b, 300L);
                    return;
                }
                return;
            case 5:
                qm0 qm0Var = (qm0) this.f2006c;
                s4.s sVar = (s4.s) this.f2005b;
                a00 a00Var = (a00) this.d;
                if (animator.equals(a00Var.M0)) {
                    int L0 = sVar.L0();
                    qm0Var.setTranslationY(0.0f);
                    if (qm0Var == a00Var.D0) {
                        qm0Var.setPadding(0, AndroidUtilities.dp(36.0f), 0, AndroidUtilities.dp(44.0f) + a00Var.f24442p2);
                    } else if (qm0Var == a00Var.f24417h0) {
                        qm0Var.setPadding(0, a00Var.f24397b1, 0, AndroidUtilities.dp(44.0f) + a00Var.f24442p2);
                    } else if (qm0Var == a00Var.P) {
                        qm0Var.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(44.0f) + a00Var.f24442p2);
                    }
                    if (L0 != -1) {
                        sVar.h1(L0, 0);
                    }
                    a00Var.M0 = null;
                    return;
                }
                return;
            case 6:
                t60 t60Var = (t60) this.d;
                super.onAnimationEnd(animator);
                boolean[] zArr2 = (boolean[]) this.f2005b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    ((v50) this.f2006c).run();
                }
                t60Var.h.setRotationY(0.0f);
                t60Var.f31032r0.setRotationY(0.0f);
                t60Var.O0 = false;
                t60Var.invalidate();
                return;
            case 7:
                n80 n80Var = (n80) this.f2005b;
                n80Var.setProgress(0.0f);
                n80Var.invalidate();
                AndroidUtilities.removeFromParent(n80Var);
                ViewTreeObserver viewTreeObserver = ((ViewGroup) this.f2006c).getViewTreeObserver();
                p80 p80Var = (p80) this.d;
                View view2 = p80Var.f29766f;
                viewTreeObserver.removeOnPreDrawListener(p80Var.f29794y);
                if (p80Var.P) {
                    view2.setVisibility(0);
                    if (view2 instanceof xh.j1) {
                        xh.j1 j1Var = (xh.j1) view2;
                        FrameLayout frameLayout = j1Var.d;
                        frameLayout.invalidate();
                        frameLayout.invalidateDrawable(j1Var.f51301e);
                        return;
                    }
                    return;
                }
                return;
            default:
                k71 k71Var = (k71) this.d;
                k71Var.f39151r1 = null;
                k71Var.invalidate();
                boolean[] zArr3 = (boolean[]) this.f2005b;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    ((g90) this.f2006c).run();
                    return;
                }
                return;
        }
    }

    public z4(com.google.firebase.messaging.m mVar, View view) {
        this.f2004a = 4;
        this.d = mVar;
        this.f2006c = view;
        this.f2005b = new org.telegram.ui.Cells.t6(this, 10);
    }
}
