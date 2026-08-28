package ih;

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
import org.telegram.ui.Components.f50;
import org.telegram.ui.Components.n40;
import org.telegram.ui.Components.pi0;
import org.telegram.ui.Components.v60;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.wy;
import org.telegram.ui.Components.x60;
import org.telegram.ui.b61;
import org.telegram.ui.rx0;
public final class j3 extends AnimatorListenerAdapter {
    public final int f11624a;
    public final Object f11625b;
    public final Object f11626c;
    public final Object d;

    public j3(Object obj, Object obj2, Object obj3, int i9) {
        this.f11624a = i9;
        this.d = obj;
        this.f11625b = obj2;
        this.f11626c = obj3;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f11624a) {
            case 5:
                wy wyVar = (wy) this.d;
                if (animator.equals(wyVar.I0)) {
                    wyVar.I0 = null;
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
        switch (this.f11624a) {
            case 0:
                a7 a7Var = (a7) this.f11626c;
                k3 k3Var = (k3) this.d;
                i4 i4Var = k3Var.f11670a;
                i4Var.f11579q3 = false;
                i4Var.f11582r3 = 1.0f;
                i4Var.invalidate();
                boolean[] zArr = (boolean[]) this.f11625b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    i4 i4Var2 = k3Var.f11670a;
                    i4Var2.f11567m3 = true;
                    try {
                        i4Var2.performHapticFeedback(3);
                    } catch (Exception unused) {
                    }
                }
                a7Var.setAllowDrawReaction(true);
                a7Var.f11229r = true;
                ImageReceiver imageReceiver = a7Var.f11226e;
                if (imageReceiver.getLottieAnimation() != null) {
                    imageReceiver.getLottieAnimation().L(0, false, true);
                }
                i4 i4Var3 = k3Var.f11670a;
                org.telegram.ui.Components.k5 k5Var = i4Var3.f11562k3;
                if (k5Var != null) {
                    k5Var.o(i4Var3);
                    k3Var.f11670a.f11562k3 = null;
                    return;
                }
                return;
            case 1:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.d).f22700x.remove((AnimatorSet) this.f11625b);
                View view = (View) this.f11626c;
                if (view instanceof org.telegram.ui.ActionBar.g1) {
                    pi0 pi0Var = ((org.telegram.ui.ActionBar.g1) view).f23405c;
                    if (pi0Var.getAnimatedDrawable() != null) {
                        pi0Var.getAnimatedDrawable().start();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.d;
                ViewGroup viewGroup = (ViewGroup) this.f11625b;
                if (viewGroup != null) {
                    chatActivityEnterView.f26121h1.removeView(chatActivityEnterView.f26077a1);
                    viewGroup.addView(chatActivityEnterView.f26077a1, (ViewGroup.LayoutParams) this.f11626c);
                }
                chatActivityEnterView.f26077a1.setAlpha(1.0f);
                chatActivityEnterView.f26095d1.setAlpha(1.0f);
                chatActivityEnterView.h = 0.0f;
                chatActivityEnterView.f26149n = 0.0f;
                chatActivityEnterView.F1();
                mh.c0 c0Var = chatActivityEnterView.f26120h0;
                if (c0Var != null) {
                    c0Var.setAlpha(0.0f);
                    chatActivityEnterView.f26120h0.setScaleX(0.0f);
                    chatActivityEnterView.f26120h0.setScaleY(0.0f);
                }
                if (chatActivityEnterView.J1 != null && chatActivityEnterView.L && !chatActivityEnterView.K && MessagesController.getGlobalMainSettings().getInt("voiceoncehint", 0) < 3) {
                    chatActivityEnterView.J1.b();
                    return;
                }
                return;
            case 3:
                ((ChatAttachAlertPhotoLayout) this.d).P = false;
                ((View) this.f11625b).setVisibility(4);
                ((ImageView) this.f11626c).sendAccessibilityEvent(8);
                return;
            case 4:
                if (((com.google.firebase.messaging.l) this.d).f4157a) {
                    ((View) this.f11626c).postDelayed((m.i3) this.f11625b, 300L);
                    return;
                }
                return;
            case 5:
                wk0 wk0Var = (wk0) this.f11626c;
                f2.y yVar = (f2.y) this.f11625b;
                wy wyVar = (wy) this.d;
                if (animator.equals(wyVar.I0)) {
                    int L0 = yVar.L0();
                    wk0Var.setTranslationY(0.0f);
                    if (wk0Var == wyVar.f34466z0) {
                        wk0Var.setPadding(0, AndroidUtilities.dp(36.0f), 0, AndroidUtilities.dp(44.0f) + wyVar.f34423m2);
                    } else if (wk0Var == wyVar.f34394d0) {
                        wk0Var.setPadding(0, wyVar.X0, 0, AndroidUtilities.dp(44.0f) + wyVar.f34423m2);
                    } else if (wk0Var == wyVar.L) {
                        wk0Var.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(44.0f) + wyVar.f34423m2);
                    }
                    if (L0 != -1) {
                        yVar.h1(L0, 0);
                    }
                    wyVar.I0 = null;
                    return;
                }
                return;
            case 6:
                f50 f50Var = (f50) this.d;
                super.onAnimationEnd(animator);
                boolean[] zArr2 = (boolean[]) this.f11625b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    ((n40) this.f11626c).run();
                }
                f50Var.f28274b.setRotationY(0.0f);
                f50Var.f28285i0.setRotationY(0.0f);
                f50Var.A0 = false;
                f50Var.invalidate();
                return;
            case 7:
                v60 v60Var = (v60) this.f11625b;
                v60Var.setProgress(0.0f);
                v60Var.invalidate();
                AndroidUtilities.removeFromParent(v60Var);
                ViewTreeObserver viewTreeObserver = ((ViewGroup) this.f11626c).getViewTreeObserver();
                x60 x60Var = (x60) this.d;
                View view2 = x60Var.f34557f;
                viewTreeObserver.removeOnPreDrawListener(x60Var.f34585y);
                if (x60Var.P) {
                    view2.setVisibility(0);
                    if (view2 instanceof fh.f2) {
                        fh.f2 f2Var = (fh.f2) view2;
                        FrameLayout frameLayout = f2Var.d;
                        frameLayout.invalidate();
                        frameLayout.invalidateDrawable(f2Var.f6446e);
                        return;
                    }
                    return;
                }
                return;
            default:
                b61 b61Var = (b61) this.d;
                b61Var.f36691n1 = null;
                b61Var.invalidate();
                boolean[] zArr3 = (boolean[]) this.f11625b;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    ((rx0) this.f11626c).run();
                    return;
                }
                return;
        }
    }

    public j3(com.google.firebase.messaging.l lVar, View view) {
        this.f11624a = 4;
        this.d = lVar;
        this.f11626c = view;
        this.f11625b = new m.i3(this, 17);
    }
}
