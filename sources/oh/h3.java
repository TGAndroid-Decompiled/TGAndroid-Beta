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
import org.telegram.ui.Components.jy0;
import org.telegram.ui.Components.kj0;
import org.telegram.ui.Components.mz;
import org.telegram.ui.Components.o70;
import org.telegram.ui.Components.q70;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.z50;
import org.telegram.ui.w61;
public final class h3 extends AnimatorListenerAdapter {
    public final int f17178a;
    public final Object f17179b;
    public final Object f17180c;
    public final Object d;

    public h3(Object obj, Object obj2, Object obj3, int i10) {
        this.f17178a = i10;
        this.d = obj;
        this.f17179b = obj2;
        this.f17180c = obj3;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f17178a) {
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
        switch (this.f17178a) {
            case 0:
                y6 y6Var = (y6) this.f17180c;
                i3 i3Var = (i3) this.d;
                f4 f4Var = i3Var.f17208a;
                f4Var.f17105r3 = false;
                f4Var.f17108s3 = 1.0f;
                f4Var.invalidate();
                boolean[] zArr = (boolean[]) this.f17179b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    f4 f4Var2 = i3Var.f17208a;
                    f4Var2.f17093n3 = true;
                    try {
                        f4Var2.performHapticFeedback(3);
                    } catch (Exception unused) {
                    }
                }
                y6Var.setAllowDrawReaction(true);
                y6Var.f17964r = true;
                ImageReceiver imageReceiver = y6Var.f17961e;
                if (imageReceiver.getLottieAnimation() != null) {
                    imageReceiver.getLottieAnimation().L(0, false, true);
                }
                f4 f4Var3 = i3Var.f17208a;
                org.telegram.ui.Components.l5 l5Var = f4Var3.f17087l3;
                if (l5Var != null) {
                    l5Var.o(f4Var3);
                    i3Var.f17208a.f17087l3 = null;
                    return;
                }
                return;
            case 1:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.d).f21166x.remove((AnimatorSet) this.f17179b);
                View view = (View) this.f17180c;
                if (view instanceof org.telegram.ui.ActionBar.g1) {
                    kj0 kj0Var = ((org.telegram.ui.ActionBar.g1) view).f21377c;
                    if (kj0Var.getAnimatedDrawable() != null) {
                        kj0Var.getAnimatedDrawable().start();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.d;
                ViewGroup viewGroup = (ViewGroup) this.f17179b;
                if (viewGroup != null) {
                    chatActivityEnterView.f24623i1.removeView(chatActivityEnterView.f24579b1);
                    viewGroup.addView(chatActivityEnterView.f24579b1, (ViewGroup.LayoutParams) this.f17180c);
                }
                chatActivityEnterView.f24579b1.setAlpha(1.0f);
                chatActivityEnterView.f24598e1.setAlpha(1.0f);
                chatActivityEnterView.h = 0.0f;
                chatActivityEnterView.f24646n = 0.0f;
                chatActivityEnterView.F1();
                sh.z zVar = chatActivityEnterView.f24622i0;
                if (zVar != null) {
                    zVar.setAlpha(0.0f);
                    chatActivityEnterView.f24622i0.setScaleX(0.0f);
                    chatActivityEnterView.f24622i0.setScaleY(0.0f);
                }
                if (chatActivityEnterView.K1 != null && chatActivityEnterView.M && !chatActivityEnterView.L && MessagesController.getGlobalMainSettings().getInt("voiceoncehint", 0) < 3) {
                    chatActivityEnterView.K1.b();
                    return;
                }
                return;
            case 3:
                ((ChatAttachAlertPhotoLayout) this.d).Q = false;
                ((View) this.f17179b).setVisibility(4);
                ((ImageView) this.f17180c).sendAccessibilityEvent(8);
                return;
            case 4:
                if (((cb.m) this.d).f2424a) {
                    ((View) this.f17180c).postDelayed((m2.b) this.f17179b, 300L);
                    return;
                }
                return;
            case 5:
                sl0 sl0Var = (sl0) this.f17180c;
                f2.w wVar = (f2.w) this.f17179b;
                mz mzVar = (mz) this.d;
                if (animator.equals(mzVar.J0)) {
                    int L0 = wVar.L0();
                    sl0Var.setTranslationY(0.0f);
                    if (sl0Var == mzVar.A0) {
                        sl0Var.setPadding(0, AndroidUtilities.dp(36.0f), 0, AndroidUtilities.dp(44.0f) + mzVar.f29309n2);
                    } else if (sl0Var == mzVar.f29280e0) {
                        sl0Var.setPadding(0, mzVar.Y0, 0, AndroidUtilities.dp(44.0f) + mzVar.f29309n2);
                    } else if (sl0Var == mzVar.M) {
                        sl0Var.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(44.0f) + mzVar.f29309n2);
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
                boolean[] zArr2 = (boolean[]) this.f17179b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    ((h50) this.f17180c).run();
                }
                z50Var.f33772b.setRotationY(0.0f);
                z50Var.f33784j0.setRotationY(0.0f);
                z50Var.B0 = false;
                z50Var.invalidate();
                return;
            case 7:
                o70 o70Var = (o70) this.f17179b;
                o70Var.setProgress(0.0f);
                o70Var.invalidate();
                AndroidUtilities.removeFromParent(o70Var);
                ViewTreeObserver viewTreeObserver = ((ViewGroup) this.f17180c).getViewTreeObserver();
                q70 q70Var = (q70) this.d;
                View view2 = q70Var.f30310f;
                viewTreeObserver.removeOnPreDrawListener(q70Var.f30338y);
                if (q70Var.P) {
                    view2.setVisibility(0);
                    if (view2 instanceof lh.x1) {
                        lh.x1 x1Var = (lh.x1) view2;
                        FrameLayout frameLayout = x1Var.d;
                        frameLayout.invalidate();
                        frameLayout.invalidateDrawable(x1Var.f13083e);
                        return;
                    }
                    return;
                }
                return;
            default:
                w61 w61Var = (w61) this.d;
                w61Var.f42335o1 = null;
                w61Var.invalidate();
                boolean[] zArr3 = (boolean[]) this.f17179b;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    ((jy0) this.f17180c).run();
                    return;
                }
                return;
        }
    }

    public h3(cb.m mVar, View view) {
        this.f17178a = 4;
        this.d = mVar;
        this.f17180c = view;
        this.f17179b = new m2.b(this, 19);
    }
}
