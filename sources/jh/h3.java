package jh;

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
import org.telegram.ui.Components.b70;
import org.telegram.ui.Components.k50;
import org.telegram.ui.Components.ri0;
import org.telegram.ui.Components.s40;
import org.telegram.ui.Components.yy;
import org.telegram.ui.Components.z60;
import org.telegram.ui.Components.zk0;
import org.telegram.ui.a01;
import org.telegram.ui.a61;

public final class h3 extends AnimatorListenerAdapter {

    public final int f13378a;

    public final Object f13379b;

    public final Object f13380c;
    public final Object d;

    public h3(Object obj, Object obj2, Object obj3, int i10) {
        this.f13378a = i10;
        this.d = obj;
        this.f13379b = obj2;
        this.f13380c = obj3;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f13378a) {
            case 5:
                yy yyVar = (yy) this.d;
                if (animator.equals(yyVar.I0)) {
                    yyVar.I0 = null;
                }
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f13378a) {
            case 0:
                x6 x6Var = (x6) this.f13380c;
                i3 i3Var = (i3) this.d;
                e4 e4Var = i3Var.f13436a;
                e4Var.f13266q3 = false;
                e4Var.f13269r3 = 1.0f;
                e4Var.invalidate();
                boolean[] zArr = (boolean[]) this.f13379b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    e4 e4Var2 = i3Var.f13436a;
                    e4Var2.f13254m3 = true;
                    try {
                        e4Var2.performHapticFeedback(3);
                        break;
                    } catch (Exception unused) {
                    }
                }
                x6Var.setAllowDrawReaction(true);
                x6Var.f14139r = true;
                ImageReceiver imageReceiver = x6Var.f14136e;
                if (imageReceiver.getLottieAnimation() != null) {
                    imageReceiver.getLottieAnimation().L(0, false, true);
                }
                e4 e4Var3 = i3Var.f13436a;
                org.telegram.ui.Components.k5 k5Var = e4Var3.f13249k3;
                if (k5Var != null) {
                    k5Var.o(e4Var3);
                    i3Var.f13436a.f13249k3 = null;
                }
                break;
            case 1:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.d).f22700x.remove((AnimatorSet) this.f13379b);
                View view = (View) this.f13380c;
                if (view instanceof org.telegram.ui.ActionBar.f1) {
                    ri0 ri0Var = ((org.telegram.ui.ActionBar.f1) view).f22913c;
                    if (ri0Var.getAnimatedDrawable() != null) {
                        ri0Var.getAnimatedDrawable().start();
                    }
                }
                break;
            case 2:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.d;
                ViewGroup viewGroup = (ViewGroup) this.f13379b;
                if (viewGroup != null) {
                    chatActivityEnterView.f26117h1.removeView(chatActivityEnterView.f26073a1);
                    viewGroup.addView(chatActivityEnterView.f26073a1, (ViewGroup.LayoutParams) this.f13380c);
                }
                chatActivityEnterView.f26073a1.setAlpha(1.0f);
                chatActivityEnterView.f26091d1.setAlpha(1.0f);
                chatActivityEnterView.h = 0.0f;
                chatActivityEnterView.f26145n = 0.0f;
                chatActivityEnterView.E1();
                nh.a0 a0Var = chatActivityEnterView.f26116h0;
                if (a0Var != null) {
                    a0Var.setAlpha(0.0f);
                    chatActivityEnterView.f26116h0.setScaleX(0.0f);
                    chatActivityEnterView.f26116h0.setScaleY(0.0f);
                }
                if (chatActivityEnterView.J1 != null && chatActivityEnterView.L && !chatActivityEnterView.K && MessagesController.getGlobalMainSettings().getInt("voiceoncehint", 0) < 3) {
                    chatActivityEnterView.J1.b();
                    break;
                }
                break;
            case 3:
                ((ChatAttachAlertPhotoLayout) this.d).P = false;
                ((View) this.f13379b).setVisibility(4);
                ((ImageView) this.f13380c).sendAccessibilityEvent(8);
                break;
            case 4:
                if (((com.google.firebase.messaging.l) this.d).f4599a) {
                    ((View) this.f13380c).postDelayed((m.i3) this.f13379b, 300L);
                }
                break;
            case 5:
                zk0 zk0Var = (zk0) this.f13380c;
                f2.x xVar = (f2.x) this.f13379b;
                yy yyVar = (yy) this.d;
                if (animator.equals(yyVar.I0)) {
                    int iL0 = xVar.L0();
                    zk0Var.setTranslationY(0.0f);
                    if (zk0Var == yyVar.f35059z0) {
                        zk0Var.setPadding(0, AndroidUtilities.dp(36.0f), 0, AndroidUtilities.dp(44.0f) + yyVar.f35016m2);
                    } else if (zk0Var == yyVar.f34987d0) {
                        zk0Var.setPadding(0, yyVar.X0, 0, AndroidUtilities.dp(44.0f) + yyVar.f35016m2);
                    } else if (zk0Var == yyVar.L) {
                        zk0Var.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(44.0f) + yyVar.f35016m2);
                    }
                    if (iL0 != -1) {
                        xVar.h1(iL0, 0);
                    }
                    yyVar.I0 = null;
                }
                break;
            case 6:
                k50 k50Var = (k50) this.d;
                super.onAnimationEnd(animator);
                boolean[] zArr2 = (boolean[]) this.f13379b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    ((s40) this.f13380c).run();
                }
                k50Var.f29969b.setRotationY(0.0f);
                k50Var.f29980i0.setRotationY(0.0f);
                k50Var.A0 = false;
                k50Var.invalidate();
                break;
            case 7:
                z60 z60Var = (z60) this.f13379b;
                z60Var.setProgress(0.0f);
                z60Var.invalidate();
                AndroidUtilities.removeFromParent(z60Var);
                ViewTreeObserver viewTreeObserver = ((ViewGroup) this.f13380c).getViewTreeObserver();
                b70 b70Var = (b70) this.d;
                View view2 = b70Var.f26969f;
                viewTreeObserver.removeOnPreDrawListener(b70Var.f26997y);
                if (b70Var.P) {
                    view2.setVisibility(0);
                    if (view2 instanceof gh.b2) {
                        gh.b2 b2Var = (gh.b2) view2;
                        FrameLayout frameLayout = b2Var.d;
                        frameLayout.invalidate();
                        frameLayout.invalidateDrawable(b2Var.f7158e);
                    }
                }
                break;
            default:
                a61 a61Var = (a61) this.d;
                a61Var.f36414n1 = null;
                a61Var.invalidate();
                boolean[] zArr3 = (boolean[]) this.f13379b;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    ((a01) this.f13380c).run();
                }
                break;
        }
    }

    public h3(com.google.firebase.messaging.l lVar, View view) {
        this.f13378a = 4;
        this.d = lVar;
        this.f13380c = view;
        this.f13379b = new m.i3(this, 17);
    }
}
