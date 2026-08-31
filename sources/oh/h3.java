package oh;

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
import org.telegram.ui.Components.h50;
import org.telegram.ui.Components.ky0;
import org.telegram.ui.Components.lj0;
import org.telegram.ui.Components.mz;
import org.telegram.ui.Components.o70;
import org.telegram.ui.Components.q70;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.Components.z50;
import org.telegram.ui.r61;
public final class h3 extends AnimatorListenerAdapter {
    public final int f17176a;
    public final Object f17177b;
    public final Object f17178c;
    public final Object d;

    public h3(Object obj, Object obj2, Object obj3, int i10) {
        this.f17176a = i10;
        this.d = obj;
        this.f17177b = obj2;
        this.f17178c = obj3;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f17176a) {
            case 5:
                mz mzVar = (mz) this.d;
                if (animator.equals(mzVar.J0)) {
                    mzVar.J0 = null;
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
        switch (this.f17176a) {
            case 0:
                y6 y6Var = (y6) this.f17178c;
                i3 i3Var = (i3) this.d;
                f4 f4Var = i3Var.f17206a;
                f4Var.f17103r3 = false;
                f4Var.f17106s3 = 1.0f;
                f4Var.invalidate();
                boolean[] zArr = (boolean[]) this.f17177b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    f4 f4Var2 = i3Var.f17206a;
                    f4Var2.f17091n3 = true;
                    try {
                        f4Var2.performHapticFeedback(3);
                    } catch (Exception unused) {
                    }
                }
                y6Var.setAllowDrawReaction(true);
                y6Var.f17962r = true;
                ImageReceiver imageReceiver = y6Var.f17959e;
                if (imageReceiver.getLottieAnimation() != null) {
                    imageReceiver.getLottieAnimation().L(0, false, true);
                }
                f4 f4Var3 = i3Var.f17206a;
                org.telegram.ui.Components.l5 l5Var = f4Var3.f17085l3;
                if (l5Var != null) {
                    l5Var.o(f4Var3);
                    i3Var.f17206a.f17085l3 = null;
                    return;
                }
                return;
            case 1:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.d).f21164x.remove((AnimatorSet) this.f17177b);
                View view = (View) this.f17178c;
                if (view instanceof org.telegram.ui.ActionBar.g1) {
                    lj0 lj0Var = ((org.telegram.ui.ActionBar.g1) view).f21375c;
                    if (lj0Var.getAnimatedDrawable() != null) {
                        lj0Var.getAnimatedDrawable().start();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.d;
                ViewGroup viewGroup = (ViewGroup) this.f17177b;
                if (viewGroup != null) {
                    chatActivityEnterView.f24621i1.removeView(chatActivityEnterView.f24577b1);
                    viewGroup.addView(chatActivityEnterView.f24577b1, (ViewGroup.LayoutParams) this.f17178c);
                }
                chatActivityEnterView.f24577b1.setAlpha(1.0f);
                chatActivityEnterView.f24596e1.setAlpha(1.0f);
                chatActivityEnterView.h = 0.0f;
                chatActivityEnterView.f24644n = 0.0f;
                chatActivityEnterView.F1();
                sh.z zVar = chatActivityEnterView.f24620i0;
                if (zVar != null) {
                    zVar.setAlpha(0.0f);
                    chatActivityEnterView.f24620i0.setScaleX(0.0f);
                    chatActivityEnterView.f24620i0.setScaleY(0.0f);
                }
                if (chatActivityEnterView.K1 != null && chatActivityEnterView.M && !chatActivityEnterView.L && MessagesController.getGlobalMainSettings().getInt("voiceoncehint", 0) < 3) {
                    chatActivityEnterView.K1.b();
                    return;
                }
                return;
            case 3:
                ((ChatAttachAlertPhotoLayout) this.d).Q = false;
                ((View) this.f17177b).setVisibility(4);
                ((ImageView) this.f17178c).sendAccessibilityEvent(8);
                return;
            case 4:
                if (((cb.m) this.d).f2424a) {
                    ((View) this.f17178c).postDelayed((m2.b) this.f17177b, 300L);
                    return;
                }
                return;
            case 5:
                tl0 tl0Var = (tl0) this.f17178c;
                f2.w wVar = (f2.w) this.f17177b;
                mz mzVar = (mz) this.d;
                if (animator.equals(mzVar.J0)) {
                    int L0 = wVar.L0();
                    tl0Var.setTranslationY(0.0f);
                    if (tl0Var == mzVar.A0) {
                        tl0Var.setPadding(0, AndroidUtilities.dp(36.0f), 0, AndroidUtilities.dp(44.0f) + mzVar.f29307n2);
                    } else if (tl0Var == mzVar.f29278e0) {
                        tl0Var.setPadding(0, mzVar.Y0, 0, AndroidUtilities.dp(44.0f) + mzVar.f29307n2);
                    } else if (tl0Var == mzVar.M) {
                        tl0Var.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(44.0f) + mzVar.f29307n2);
                    }
                    if (L0 != -1) {
                        wVar.h1(L0, 0);
                    }
                    mzVar.J0 = null;
                    return;
                }
                return;
            case 6:
                z50 z50Var = (z50) this.d;
                super.onAnimationEnd(animator);
                boolean[] zArr2 = (boolean[]) this.f17177b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    ((h50) this.f17178c).run();
                }
                z50Var.f33734b.setRotationY(0.0f);
                z50Var.f33746j0.setRotationY(0.0f);
                z50Var.B0 = false;
                z50Var.invalidate();
                return;
            case 7:
                o70 o70Var = (o70) this.f17177b;
                o70Var.setProgress(0.0f);
                o70Var.invalidate();
                AndroidUtilities.removeFromParent(o70Var);
                ViewTreeObserver viewTreeObserver = ((ViewGroup) this.f17178c).getViewTreeObserver();
                q70 q70Var = (q70) this.d;
                View view2 = q70Var.f30306f;
                viewTreeObserver.removeOnPreDrawListener(q70Var.f30334y);
                if (q70Var.P) {
                    view2.setVisibility(0);
                    if (view2 instanceof lh.x1) {
                        lh.x1 x1Var = (lh.x1) view2;
                        FrameLayout frameLayout = x1Var.d;
                        frameLayout.invalidate();
                        frameLayout.invalidateDrawable(x1Var.f13081e);
                        return;
                    }
                    return;
                }
                return;
            default:
                r61 r61Var = (r61) this.d;
                r61Var.f40812o1 = null;
                r61Var.invalidate();
                boolean[] zArr3 = (boolean[]) this.f17177b;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    ((ky0) this.f17178c).run();
                    return;
                }
                return;
        }
    }

    public h3(cb.m mVar, View view) {
        this.f17176a = 4;
        this.d = mVar;
        this.f17178c = view;
        this.f17177b = new m2.b(this, 19);
    }
}
