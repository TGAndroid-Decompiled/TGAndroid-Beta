package di;

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
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ak0;
import org.telegram.ui.Components.b31;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.o60;
import org.telegram.ui.Components.p50;
import org.telegram.ui.Components.sz;
import org.telegram.ui.Components.xj0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.c61;
import org.telegram.ui.cy;
import org.telegram.ui.o01;
public final class o3 extends AnimatorListenerAdapter {
    public final int f8868a;
    public final Object f8869b;
    public final Object f8870c;
    public final Object d;

    public o3(Object obj, Object obj2, Object obj3, int i10) {
        this.f8868a = i10;
        this.d = obj;
        this.f8869b = obj2;
        this.f8870c = obj3;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f8868a) {
            case 5:
                sz szVar = (sz) this.d;
                if (animator.equals(szVar.M0)) {
                    szVar.M0 = null;
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
        switch (this.f8868a) {
            case 0:
                m7 m7Var = (m7) this.f8870c;
                p3 p3Var = (p3) this.d;
                q4 q4Var = p3Var.f8899a;
                q4Var.f8993j3 = false;
                q4Var.f8996k3 = 1.0f;
                q4Var.invalidate();
                boolean[] zArr = (boolean[]) this.f8869b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    q4 q4Var2 = p3Var.f8899a;
                    q4Var2.f8981f3 = true;
                    try {
                        q4Var2.performHapticFeedback(3);
                    } catch (Exception unused) {
                    }
                }
                m7Var.setAllowDrawReaction(true);
                m7Var.f8792r = true;
                ImageReceiver imageReceiver = m7Var.e;
                if (imageReceiver.getLottieAnimation() != null) {
                    imageReceiver.getLottieAnimation().N(0, false, true);
                }
                q4 q4Var3 = p3Var.f8899a;
                org.telegram.ui.Components.t5 t5Var = q4Var3.f8975d3;
                if (t5Var != null) {
                    t5Var.o(q4Var3);
                    p3Var.f8899a.f8975d3 = null;
                    return;
                }
                return;
            case 1:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.d).f22364x.remove((AnimatorSet) this.f8869b);
                View view = (View) this.f8870c;
                if (view instanceof org.telegram.ui.ActionBar.g1) {
                    ak0 ak0Var = ((org.telegram.ui.ActionBar.g1) view).f22636c;
                    if (ak0Var.getAnimatedDrawable() != null) {
                        ak0Var.getAnimatedDrawable().start();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.d;
                ViewGroup viewGroup = (ViewGroup) this.f8869b;
                if (viewGroup != null) {
                    chatActivityEnterView.f25915m1.removeView(chatActivityEnterView.f25869e1);
                    viewGroup.addView(chatActivityEnterView.f25869e1, (ViewGroup.LayoutParams) this.f8870c);
                }
                chatActivityEnterView.f25869e1.setAlpha(1.0f);
                chatActivityEnterView.f25888h1.setAlpha(1.0f);
                chatActivityEnterView.h = 0.0f;
                chatActivityEnterView.f25920n = 0.0f;
                chatActivityEnterView.C1();
                hi.i0 i0Var = chatActivityEnterView.f25911l0;
                if (i0Var != null) {
                    i0Var.setAlpha(0.0f);
                    chatActivityEnterView.f25911l0.setScaleX(0.0f);
                    chatActivityEnterView.f25911l0.setScaleY(0.0f);
                }
                if (chatActivityEnterView.O1 != null && chatActivityEnterView.P && !chatActivityEnterView.O && MessagesController.getGlobalMainSettings().getInt("voiceoncehint", 0) < 3) {
                    chatActivityEnterView.O1.b();
                    return;
                }
                return;
            case 3:
                ((ChatAttachAlertPhotoLayout) this.d).T = false;
                ((View) this.f8869b).setVisibility(4);
                ((ImageView) this.f8870c).sendAccessibilityEvent(8);
                return;
            case 4:
                if (((c2.b) this.d).f5929a) {
                    ((View) this.f8870c).postDelayed((m.g3) this.f8869b, 300L);
                    return;
                }
                return;
            case 5:
                mm0 mm0Var = (mm0) this.f8870c;
                s4.t tVar = (s4.t) this.f8869b;
                sz szVar = (sz) this.d;
                if (animator.equals(szVar.M0)) {
                    int L0 = tVar.L0();
                    mm0Var.setTranslationY(0.0f);
                    if (mm0Var == szVar.D0) {
                        mm0Var.setPadding(0, AndroidUtilities.dp(36.0f), 0, AndroidUtilities.dp(44.0f) + szVar.f32759q2);
                    } else if (mm0Var == szVar.f32731h0) {
                        mm0Var.setPadding(0, szVar.f32712b1, 0, AndroidUtilities.dp(44.0f) + szVar.f32759q2);
                    } else if (mm0Var == szVar.P) {
                        mm0Var.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(44.0f) + szVar.f32759q2);
                    }
                    if (L0 != -1) {
                        tVar.h1(L0, 0);
                    }
                    szVar.M0 = null;
                    return;
                }
                return;
            case 6:
                o60 o60Var = (o60) this.d;
                super.onAnimationEnd(animator);
                boolean[] zArr2 = (boolean[]) this.f8869b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    ((p50) this.f8870c).run();
                }
                o60Var.h.setRotationY(0.0f);
                o60Var.f31196r0.setRotationY(0.0f);
                o60Var.O0 = false;
                o60Var.invalidate();
                return;
            case 7:
                i80 i80Var = (i80) this.f8869b;
                i80Var.setProgress(0.0f);
                i80Var.invalidate();
                AndroidUtilities.removeFromParent(i80Var);
                ViewTreeObserver viewTreeObserver = ((ViewGroup) this.f8870c).getViewTreeObserver();
                k80 k80Var = (k80) this.d;
                View view2 = k80Var.f29843f;
                viewTreeObserver.removeOnPreDrawListener(k80Var.f29871y);
                if (k80Var.P) {
                    view2.setVisibility(0);
                    if (view2 instanceof zh.g1) {
                        zh.g1 g1Var = (zh.g1) view2;
                        FrameLayout frameLayout = g1Var.d;
                        frameLayout.invalidate();
                        frameLayout.invalidateDrawable(g1Var.e);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                LaunchActivity launchActivity = (LaunchActivity) this.d;
                launchActivity.G0 = null;
                launchActivity.f35568z0.invalidate();
                launchActivity.f35546o0.invalidate();
                launchActivity.f35546o0.setImageDrawable(null);
                b31 b31Var = launchActivity.f35546o0;
                b31Var.f26741c = null;
                b31Var.f26739a.setShader(null);
                b31Var.f26743n = null;
                b31Var.f26744r = null;
                launchActivity.f35546o0.setVisibility(8);
                launchActivity.f35548p0.setVisibility(8);
                ak0 ak0Var2 = (ak0) this.f8869b;
                if (ak0Var2 != null) {
                    ak0Var2.setImageDrawable((xj0) this.f8870c);
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.themeAccentListUpdated, new Object[0]);
                if (ak0Var2 != null) {
                    ak0Var2.setVisibility(0);
                }
                cy.f38559y4 = false;
                return;
            default:
                c61 c61Var = (c61) this.d;
                c61Var.f38320s1 = null;
                c61Var.invalidate();
                boolean[] zArr3 = (boolean[]) this.f8869b;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    ((o01) this.f8870c).run();
                    return;
                }
                return;
        }
    }

    public o3(c2.b bVar, View view) {
        this.f8868a = 4;
        this.d = bVar;
        this.f8870c = view;
        this.f8869b = new m.g3(this, 15);
    }
}
