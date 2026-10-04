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
import org.telegram.ui.Components.b80;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.h50;
import org.telegram.ui.Components.nj0;
import org.telegram.ui.Components.nz;
import org.telegram.ui.Components.z70;
import org.telegram.ui.Components.zl0;
import org.telegram.ui.c71;
import org.telegram.ui.f90;
public final class y4 extends AnimatorListenerAdapter {
    public final int f1898a;
    public final Object f1899b;
    public final Object f1900c;
    public final Object d;

    public y4(Object obj, Object obj2, Object obj3, int i10) {
        this.f1898a = i10;
        this.d = obj;
        this.f1899b = obj2;
        this.f1900c = obj3;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f1898a) {
            case 5:
                nz nzVar = (nz) this.d;
                if (animator.equals(nzVar.M0)) {
                    nzVar.M0 = null;
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
        switch (this.f1898a) {
            case 0:
                q9 q9Var = (q9) this.f1900c;
                z4 z4Var = (z4) this.d;
                e6 e6Var = z4Var.f1933a;
                e6Var.f900u3 = false;
                e6Var.f903v3 = 1.0f;
                e6Var.invalidate();
                boolean[] zArr = (boolean[]) this.f1899b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    e6 e6Var2 = z4Var.f1933a;
                    e6Var2.f888q3 = true;
                    try {
                        e6Var2.performHapticFeedback(3);
                    } catch (Exception unused) {
                    }
                }
                q9Var.setAllowDrawReaction(true);
                q9Var.f1564r = true;
                ImageReceiver imageReceiver = q9Var.f1561e;
                if (imageReceiver.getLottieAnimation() != null) {
                    imageReceiver.getLottieAnimation().N(0, false, true);
                }
                e6 e6Var3 = z4Var.f1933a;
                org.telegram.ui.Components.q5 q5Var = e6Var3.f882o3;
                if (q5Var != null) {
                    q5Var.o(e6Var3);
                    z4Var.f1933a.f882o3 = null;
                    return;
                }
                return;
            case 1:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.d).f20370x.remove((AnimatorSet) this.f1899b);
                View view = (View) this.f1900c;
                if (view instanceof org.telegram.ui.ActionBar.f1) {
                    nj0 nj0Var = ((org.telegram.ui.ActionBar.f1) view).f20589c;
                    if (nj0Var.getAnimatedDrawable() != null) {
                        nj0Var.getAnimatedDrawable().start();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.d;
                ViewGroup viewGroup = (ViewGroup) this.f1899b;
                if (viewGroup != null) {
                    chatActivityEnterView.f23925m1.removeView(chatActivityEnterView.f23880e1);
                    viewGroup.addView(chatActivityEnterView.f23880e1, (ViewGroup.LayoutParams) this.f1900c);
                }
                chatActivityEnterView.f23880e1.setAlpha(1.0f);
                chatActivityEnterView.f23899h1.setAlpha(1.0f);
                chatActivityEnterView.h = 0.0f;
                chatActivityEnterView.f23930n = 0.0f;
                chatActivityEnterView.E1();
                ei.d0 d0Var = chatActivityEnterView.f23921l0;
                if (d0Var != null) {
                    d0Var.setAlpha(0.0f);
                    chatActivityEnterView.f23921l0.setScaleX(0.0f);
                    chatActivityEnterView.f23921l0.setScaleY(0.0f);
                }
                if (chatActivityEnterView.O1 != null && chatActivityEnterView.P && !chatActivityEnterView.O && MessagesController.getGlobalMainSettings().getInt("voiceoncehint", 0) < 3) {
                    chatActivityEnterView.O1.b();
                    return;
                }
                return;
            case 3:
                ((ChatAttachAlertPhotoLayout) this.d).T = false;
                ((View) this.f1899b).setVisibility(4);
                ((ImageView) this.f1900c).sendAccessibilityEvent(8);
                return;
            case 4:
                if (((com.google.firebase.messaging.m) this.d).f7902a) {
                    ((View) this.f1900c).postDelayed((org.telegram.ui.Cells.t6) this.f1899b, 300L);
                    return;
                }
                return;
            case 5:
                zl0 zl0Var = (zl0) this.f1900c;
                s4.s sVar = (s4.s) this.f1899b;
                nz nzVar = (nz) this.d;
                if (animator.equals(nzVar.M0)) {
                    int L0 = sVar.L0();
                    zl0Var.setTranslationY(0.0f);
                    if (zl0Var == nzVar.D0) {
                        zl0Var.setPadding(0, AndroidUtilities.dp(36.0f), 0, AndroidUtilities.dp(44.0f) + nzVar.f29138p2);
                    } else if (zl0Var == nzVar.f29113h0) {
                        zl0Var.setPadding(0, nzVar.f29093b1, 0, AndroidUtilities.dp(44.0f) + nzVar.f29138p2);
                    } else if (zl0Var == nzVar.P) {
                        zl0Var.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(44.0f) + nzVar.f29138p2);
                    }
                    if (L0 != -1) {
                        sVar.h1(L0, 0);
                    }
                    nzVar.M0 = null;
                    return;
                }
                return;
            case 6:
                f60 f60Var = (f60) this.d;
                super.onAnimationEnd(animator);
                boolean[] zArr2 = (boolean[]) this.f1899b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    ((h50) this.f1900c).run();
                }
                f60Var.h.setRotationY(0.0f);
                f60Var.f26326r0.setRotationY(0.0f);
                f60Var.J0 = false;
                f60Var.invalidate();
                return;
            case 7:
                z70 z70Var = (z70) this.f1899b;
                z70Var.setProgress(0.0f);
                z70Var.invalidate();
                AndroidUtilities.removeFromParent(z70Var);
                ViewTreeObserver viewTreeObserver = ((ViewGroup) this.f1900c).getViewTreeObserver();
                b80 b80Var = (b80) this.d;
                View view2 = b80Var.f24826f;
                viewTreeObserver.removeOnPreDrawListener(b80Var.f24854y);
                if (b80Var.P) {
                    view2.setVisibility(0);
                    if (view2 instanceof xh.i1) {
                        xh.i1 i1Var = (xh.i1) view2;
                        FrameLayout frameLayout = i1Var.d;
                        frameLayout.invalidate();
                        frameLayout.invalidateDrawable(i1Var.f50000e);
                        return;
                    }
                    return;
                }
                return;
            default:
                c71 c71Var = (c71) this.d;
                c71Var.f35341r1 = null;
                c71Var.invalidate();
                boolean[] zArr3 = (boolean[]) this.f1899b;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    ((f90) this.f1900c).run();
                    return;
                }
                return;
        }
    }

    public y4(com.google.firebase.messaging.m mVar, View view) {
        this.f1898a = 4;
        this.d = mVar;
        this.f1900c = view;
        this.f1899b = new org.telegram.ui.Cells.t6(this, 11);
    }
}
