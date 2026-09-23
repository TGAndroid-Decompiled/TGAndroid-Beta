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
import org.telegram.ui.Components.bj0;
import org.telegram.ui.Components.e50;
import org.telegram.ui.Components.lz;
import org.telegram.ui.Components.m70;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.o70;
import org.telegram.ui.Components.x50;
import org.telegram.ui.d90;
import org.telegram.ui.z61;
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
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.d).f18407x.remove((AnimatorSet) this.f1746b);
                View view = (View) this.f1747c;
                if (view instanceof org.telegram.ui.ActionBar.f1) {
                    bj0 bj0Var = ((org.telegram.ui.ActionBar.f1) view).f18612c;
                    if (bj0Var.getAnimatedDrawable() != null) {
                        bj0Var.getAnimatedDrawable().start();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.d;
                ViewGroup viewGroup = (ViewGroup) this.f1746b;
                if (viewGroup != null) {
                    chatActivityEnterView.l1.removeView(chatActivityEnterView.f21729e1);
                    viewGroup.addView(chatActivityEnterView.f21729e1, (ViewGroup.LayoutParams) this.f1747c);
                }
                chatActivityEnterView.f21729e1.setAlpha(1.0f);
                chatActivityEnterView.f21748h1.setAlpha(1.0f);
                chatActivityEnterView.h = 0.0f;
                chatActivityEnterView.f21779n = 0.0f;
                chatActivityEnterView.G1();
                ei.c0 c0Var = chatActivityEnterView.f21770l0;
                if (c0Var != null) {
                    c0Var.setAlpha(0.0f);
                    chatActivityEnterView.f21770l0.setScaleX(0.0f);
                    chatActivityEnterView.f21770l0.setScaleY(0.0f);
                }
                if (chatActivityEnterView.N1 != null && chatActivityEnterView.P && !chatActivityEnterView.O && MessagesController.getGlobalMainSettings().getInt("voiceoncehint", 0) < 3) {
                    chatActivityEnterView.N1.b();
                    return;
                }
                return;
            case 3:
                ((ChatAttachAlertPhotoLayout) this.d).T = false;
                ((View) this.f1746b).setVisibility(4);
                ((ImageView) this.f1747c).sendAccessibilityEvent(8);
                return;
            case 4:
                if (((com.google.firebase.messaging.m) this.d).f7316a) {
                    ((View) this.f1747c).postDelayed((org.telegram.ui.Cells.l7) this.f1746b, 300L);
                    return;
                }
                return;
            case 5:
                ml0 ml0Var = (ml0) this.f1747c;
                s4.s sVar = (s4.s) this.f1746b;
                lz lzVar = (lz) this.d;
                if (animator.equals(lzVar.M0)) {
                    int L0 = sVar.L0();
                    ml0Var.setTranslationY(0.0f);
                    if (ml0Var == lzVar.D0) {
                        ml0Var.setPadding(0, AndroidUtilities.dp(36.0f), 0, AndroidUtilities.dp(44.0f) + lzVar.f26008p2);
                    } else if (ml0Var == lzVar.f25983h0) {
                        ml0Var.setPadding(0, lzVar.f25964b1, 0, AndroidUtilities.dp(44.0f) + lzVar.f26008p2);
                    } else if (ml0Var == lzVar.P) {
                        ml0Var.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(44.0f) + lzVar.f26008p2);
                    }
                    if (L0 != -1) {
                        sVar.h1(L0, 0);
                    }
                    lzVar.M0 = null;
                    return;
                }
                return;
            case 6:
                x50 x50Var = (x50) this.d;
                super.onAnimationEnd(animator);
                boolean[] zArr2 = (boolean[]) this.f1746b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    ((e50) this.f1747c).run();
                }
                x50Var.f29891b.setRotationY(0.0f);
                x50Var.m0.setRotationY(0.0f);
                x50Var.E0 = false;
                x50Var.invalidate();
                return;
            case 7:
                m70 m70Var = (m70) this.f1746b;
                m70Var.setProgress(0.0f);
                m70Var.invalidate();
                AndroidUtilities.removeFromParent(m70Var);
                ViewTreeObserver viewTreeObserver = ((ViewGroup) this.f1747c).getViewTreeObserver();
                o70 o70Var = (o70) this.d;
                View view2 = o70Var.f26646f;
                viewTreeObserver.removeOnPreDrawListener(o70Var.f26674y);
                if (o70Var.P) {
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
                z61 z61Var = (z61) this.d;
                z61Var.f40042r1 = null;
                z61Var.invalidate();
                boolean[] zArr3 = (boolean[]) this.f1746b;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    ((d90) this.f1747c).run();
                    return;
                }
                return;
        }
    }

    public y4(com.google.firebase.messaging.m mVar, View view) {
        this.f1745a = 4;
        this.d = mVar;
        this.f1747c = view;
        this.f1746b = new org.telegram.ui.Cells.l7(this, 10);
    }
}
