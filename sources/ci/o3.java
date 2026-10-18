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
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.g80;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.m60;
import org.telegram.ui.Components.n50;
import org.telegram.ui.Components.tz;
import org.telegram.ui.Components.xj0;
import org.telegram.ui.i01;
import org.telegram.ui.z51;
public final class o3 extends AnimatorListenerAdapter {
    public final int f5624a;
    public final Object f5625b;
    public final Object f5626c;
    public final Object d;

    public o3(Object obj, Object obj2, Object obj3, int i10) {
        this.f5624a = i10;
        this.d = obj;
        this.f5625b = obj2;
        this.f5626c = obj3;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f5624a) {
            case 5:
                tz tzVar = (tz) this.d;
                if (animator.equals(tzVar.M0)) {
                    tzVar.M0 = null;
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
        switch (this.f5624a) {
            case 0:
                m7 m7Var = (m7) this.f5626c;
                p3 p3Var = (p3) this.d;
                p4 p4Var = p3Var.f5644a;
                p4Var.f5709u3 = false;
                p4Var.f5712v3 = 1.0f;
                p4Var.invalidate();
                boolean[] zArr = (boolean[]) this.f5625b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    p4 p4Var2 = p3Var.f5644a;
                    p4Var2.f5697q3 = true;
                    try {
                        p4Var2.performHapticFeedback(3);
                    } catch (Exception unused) {
                    }
                }
                m7Var.setAllowDrawReaction(true);
                m7Var.f5557r = true;
                ImageReceiver imageReceiver = m7Var.e;
                if (imageReceiver.getLottieAnimation() != null) {
                    imageReceiver.getLottieAnimation().N(0, false, true);
                }
                p4 p4Var3 = p3Var.f5644a;
                org.telegram.ui.Components.r5 r5Var = p4Var3.f5691o3;
                if (r5Var != null) {
                    r5Var.o(p4Var3);
                    p3Var.f5644a.f5691o3 = null;
                    return;
                }
                return;
            case 1:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.d).f20599x.remove((AnimatorSet) this.f5625b);
                View view = (View) this.f5626c;
                if (view instanceof org.telegram.ui.ActionBar.e1) {
                    xj0 xj0Var = ((org.telegram.ui.ActionBar.e1) view).f20759c;
                    if (xj0Var.getAnimatedDrawable() != null) {
                        xj0Var.getAnimatedDrawable().start();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.d;
                ViewGroup viewGroup = (ViewGroup) this.f5625b;
                if (viewGroup != null) {
                    chatActivityEnterView.f23978m1.removeView(chatActivityEnterView.f23932e1);
                    viewGroup.addView(chatActivityEnterView.f23932e1, (ViewGroup.LayoutParams) this.f5626c);
                }
                chatActivityEnterView.f23932e1.setAlpha(1.0f);
                chatActivityEnterView.f23951h1.setAlpha(1.0f);
                chatActivityEnterView.h = 0.0f;
                chatActivityEnterView.f23983n = 0.0f;
                chatActivityEnterView.D1();
                gi.b0 b0Var = chatActivityEnterView.f23974l0;
                if (b0Var != null) {
                    b0Var.setAlpha(0.0f);
                    chatActivityEnterView.f23974l0.setScaleX(0.0f);
                    chatActivityEnterView.f23974l0.setScaleY(0.0f);
                }
                if (chatActivityEnterView.O1 != null && chatActivityEnterView.P && !chatActivityEnterView.O && MessagesController.getGlobalMainSettings().getInt("voiceoncehint", 0) < 3) {
                    chatActivityEnterView.O1.b();
                    return;
                }
                return;
            case 3:
                ((ChatAttachAlertPhotoLayout) this.d).T = false;
                ((View) this.f5625b).setVisibility(4);
                ((ImageView) this.f5626c).sendAccessibilityEvent(8);
                return;
            case 4:
                if (((c2.b) this.d).f4493a) {
                    ((View) this.f5626c).postDelayed((org.telegram.ui.Cells.k7) this.f5625b, 300L);
                    return;
                }
                return;
            case 5:
                im0 im0Var = (im0) this.f5626c;
                s4.s sVar = (s4.s) this.f5625b;
                tz tzVar = (tz) this.d;
                if (animator.equals(tzVar.M0)) {
                    int L0 = sVar.L0();
                    im0Var.setTranslationY(0.0f);
                    if (im0Var == tzVar.D0) {
                        im0Var.setPadding(0, AndroidUtilities.dp(36.0f), 0, AndroidUtilities.dp(44.0f) + tzVar.f30787p2);
                    } else if (im0Var == tzVar.f30762h0) {
                        im0Var.setPadding(0, tzVar.f30743b1, 0, AndroidUtilities.dp(44.0f) + tzVar.f30787p2);
                    } else if (im0Var == tzVar.P) {
                        im0Var.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(44.0f) + tzVar.f30787p2);
                    }
                    if (L0 != -1) {
                        sVar.h1(L0, 0);
                    }
                    tzVar.M0 = null;
                    return;
                }
                return;
            case 6:
                m60 m60Var = (m60) this.d;
                super.onAnimationEnd(animator);
                boolean[] zArr2 = (boolean[]) this.f5625b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    ((n50) this.f5626c).run();
                }
                m60Var.h.setRotationY(0.0f);
                m60Var.f28440r0.setRotationY(0.0f);
                m60Var.O0 = false;
                m60Var.invalidate();
                return;
            case 7:
                g80 g80Var = (g80) this.f5625b;
                g80Var.setProgress(0.0f);
                g80Var.invalidate();
                AndroidUtilities.removeFromParent(g80Var);
                ViewTreeObserver viewTreeObserver = ((ViewGroup) this.f5626c).getViewTreeObserver();
                i80 i80Var = (i80) this.d;
                View view2 = i80Var.f27111f;
                viewTreeObserver.removeOnPreDrawListener(i80Var.f27139y);
                if (i80Var.P) {
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
            default:
                z51 z51Var = (z51) this.d;
                z51Var.f43607r1 = null;
                z51Var.invalidate();
                boolean[] zArr3 = (boolean[]) this.f5625b;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    ((i01) this.f5626c).run();
                    return;
                }
                return;
        }
    }

    public o3(c2.b bVar, View view) {
        this.f5624a = 4;
        this.d = bVar;
        this.f5626c = view;
        this.f5625b = new org.telegram.ui.Cells.k7(this, 9);
    }
}
