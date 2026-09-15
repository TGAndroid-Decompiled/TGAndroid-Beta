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
import org.telegram.ui.Components.aj0;
import org.telegram.ui.Components.d50;
import org.telegram.ui.Components.kz;
import org.telegram.ui.Components.l70;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.w50;
import org.telegram.ui.g71;
import org.telegram.ui.g90;
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
        switch (this.f1745a) {
            case 0:
                q9 q9Var = (q9) this.f1747c;
                z4 z4Var = (z4) this.d;
                f6 f6Var = z4Var.f1779a;
                f6Var.f854u3 = false;
                f6Var.f857v3 = 1.0f;
                f6Var.invalidate();
                boolean[] zArr = (boolean[]) this.f1746b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    f6 f6Var2 = z4Var.f1779a;
                    f6Var2.f842q3 = true;
                    try {
                        f6Var2.performHapticFeedback(3);
                    } catch (Exception unused) {
                    }
                }
                q9Var.setAllowDrawReaction(true);
                q9Var.f1435r = true;
                ImageReceiver imageReceiver = q9Var.e;
                if (imageReceiver.getLottieAnimation() != null) {
                    imageReceiver.getLottieAnimation().N(0, false, true);
                }
                f6 f6Var3 = z4Var.f1779a;
                org.telegram.ui.Components.o5 o5Var = f6Var3.f836o3;
                if (o5Var != null) {
                    o5Var.o(f6Var3);
                    z4Var.f1779a.f836o3 = null;
                    return;
                }
                return;
            case 1:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.d).f18435x.remove((AnimatorSet) this.f1746b);
                View view = (View) this.f1747c;
                if (view instanceof org.telegram.ui.ActionBar.f1) {
                    aj0 aj0Var = ((org.telegram.ui.ActionBar.f1) view).f18625c;
                    if (aj0Var.getAnimatedDrawable() != null) {
                        aj0Var.getAnimatedDrawable().start();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.d;
                ViewGroup viewGroup = (ViewGroup) this.f1746b;
                if (viewGroup != null) {
                    chatActivityEnterView.l1.removeView(chatActivityEnterView.f21759e1);
                    viewGroup.addView(chatActivityEnterView.f21759e1, (ViewGroup.LayoutParams) this.f1747c);
                }
                chatActivityEnterView.f21759e1.setAlpha(1.0f);
                chatActivityEnterView.f21778h1.setAlpha(1.0f);
                chatActivityEnterView.h = 0.0f;
                chatActivityEnterView.f21808n = 0.0f;
                chatActivityEnterView.E1();
                ei.c0 c0Var = chatActivityEnterView.f21800l0;
                if (c0Var != null) {
                    c0Var.setAlpha(0.0f);
                    chatActivityEnterView.f21800l0.setScaleX(0.0f);
                    chatActivityEnterView.f21800l0.setScaleY(0.0f);
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
                if (((com.google.firebase.messaging.m) this.d).f7328a) {
                    ((View) this.f1747c).postDelayed((org.telegram.ui.Cells.l7) this.f1746b, 300L);
                    return;
                }
                return;
            case 5:
                ll0 ll0Var = (ll0) this.f1747c;
                s4.s sVar = (s4.s) this.f1746b;
                kz kzVar = (kz) this.d;
                if (animator.equals(kzVar.M0)) {
                    int L0 = sVar.L0();
                    ll0Var.setTranslationY(0.0f);
                    if (ll0Var == kzVar.D0) {
                        ll0Var.setPadding(0, AndroidUtilities.dp(36.0f), 0, AndroidUtilities.dp(44.0f) + kzVar.f25743p2);
                    } else if (ll0Var == kzVar.f25718h0) {
                        ll0Var.setPadding(0, kzVar.f25699b1, 0, AndroidUtilities.dp(44.0f) + kzVar.f25743p2);
                    } else if (ll0Var == kzVar.P) {
                        ll0Var.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(44.0f) + kzVar.f25743p2);
                    }
                    if (L0 != -1) {
                        sVar.h1(L0, 0);
                    }
                    kzVar.M0 = null;
                    return;
                }
                return;
            case 6:
                w50 w50Var = (w50) this.d;
                super.onAnimationEnd(animator);
                boolean[] zArr2 = (boolean[]) this.f1746b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    ((d50) this.f1747c).run();
                }
                w50Var.f29577b.setRotationY(0.0f);
                w50Var.m0.setRotationY(0.0f);
                w50Var.E0 = false;
                w50Var.invalidate();
                return;
            case 7:
                l70 l70Var = (l70) this.f1746b;
                l70Var.setProgress(0.0f);
                l70Var.invalidate();
                AndroidUtilities.removeFromParent(l70Var);
                ViewTreeObserver viewTreeObserver = ((ViewGroup) this.f1747c).getViewTreeObserver();
                n70 n70Var = (n70) this.d;
                View view2 = n70Var.f26345f;
                viewTreeObserver.removeOnPreDrawListener(n70Var.f26373y);
                if (n70Var.P) {
                    view2.setVisibility(0);
                    if (view2 instanceof xh.i1) {
                        xh.i1 i1Var = (xh.i1) view2;
                        FrameLayout frameLayout = i1Var.d;
                        frameLayout.invalidate();
                        frameLayout.invalidateDrawable(i1Var.e);
                        return;
                    }
                    return;
                }
                return;
            default:
                g71 g71Var = (g71) this.d;
                g71Var.f33817r1 = null;
                g71Var.invalidate();
                boolean[] zArr3 = (boolean[]) this.f1746b;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    ((g90) this.f1747c).run();
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
