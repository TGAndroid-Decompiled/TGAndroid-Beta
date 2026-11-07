package di;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.dt;
import org.telegram.ui.Components.gy;
import org.telegram.ui.Components.i60;
import org.telegram.ui.Components.k60;
import org.telegram.ui.Components.o40;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.r30;
import org.telegram.ui.Components.xz0;
import org.telegram.ui.Components.zg0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.c01;
import org.telegram.ui.q11;
import org.telegram.ui.ww;
public final class h3 extends AnimatorListenerAdapter {
    public final int f9071a;
    public final Object f9072b;
    public final Object f9073c;
    public final Object d;

    public h3(Object obj, Object obj2, Object obj3, int i7) {
        this.f9071a = i7;
        this.d = obj;
        this.f9072b = obj2;
        this.f9073c = obj3;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f9071a) {
            case 6:
                gy gyVar = (gy) this.d;
                if (animator.equals(gyVar.M0)) {
                    gyVar.M0 = null;
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
        int i7;
        int i10;
        switch (this.f9071a) {
            case 0:
                d7 d7Var = (d7) this.f9073c;
                i3 i3Var = (i3) this.d;
                i4 i4Var = i3Var.f9129a;
                i4Var.f9140d3 = false;
                i4Var.f9143e3 = 1.0f;
                i4Var.invalidate();
                boolean[] zArr = (boolean[]) this.f9072b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    i4 i4Var2 = i3Var.f9129a;
                    i4Var2.Z2 = true;
                    try {
                        i4Var2.performHapticFeedback(3);
                    } catch (Exception unused) {
                    }
                }
                d7Var.setAllowDrawReaction(true);
                d7Var.f8932r = true;
                ImageReceiver imageReceiver = d7Var.f8929e;
                if (imageReceiver.B() != null) {
                    imageReceiver.B().N(0, false, true);
                }
                i4 i4Var3 = i3Var.f9129a;
                org.telegram.ui.Components.i5 i5Var = i4Var3.X2;
                if (i5Var != null) {
                    i5Var.n(i4Var3);
                    i3Var.f9129a.X2 = null;
                    return;
                }
                return;
            case 1:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.d).f27292y.remove((AnimatorSet) this.f9072b);
                View view = (View) this.f9073c;
                if (view instanceof org.telegram.ui.ActionBar.z0) {
                    ch0 ch0Var = ((org.telegram.ui.ActionBar.z0) view).f28813c;
                    if (ch0Var.getAnimatedDrawable() != null) {
                        ch0Var.getAnimatedDrawable().start();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                org.telegram.ui.ActionBar.k3 k3Var = (org.telegram.ui.ActionBar.k3) this.d;
                org.telegram.ui.ActionBar.h3 h3Var = (org.telegram.ui.ActionBar.h3) this.f9073c;
                org.telegram.ui.ActionBar.c3 c3Var = (org.telegram.ui.ActionBar.c3) this.f9072b;
                ViewGroup viewGroup = c3Var.f27372b;
                if (viewGroup == null) {
                    viewGroup = c3Var.f27373c;
                }
                if (viewGroup != null && c3Var.f27381m == null && (i7 = c3Var.f27376g) > 0 && (i10 = c3Var.h) > 0) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        org.telegram.ui.ActionBar.k3.g(viewGroup, -c3Var.f27377i, new org.telegram.messenger.voip.k(2, c3Var, h3Var));
                        k3Var.f27714b = null;
                        k3Var.invalidate();
                        return;
                    }
                    c3Var.f27381m = Bitmap.createBitmap(i7, i10, Bitmap.Config.RGB_565);
                    Canvas canvas = new Canvas(c3Var.f27381m);
                    canvas.translate(0.0f, -c3Var.f27377i);
                    viewGroup.draw(canvas);
                }
                h3Var.mo25d().setDrawingFromOverlay(false);
                h3Var.release();
                k3Var.f27714b = null;
                k3Var.invalidate();
                return;
            case 3:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.d;
                ViewGroup viewGroup2 = (ViewGroup) this.f9072b;
                if (viewGroup2 != null) {
                    chatActivityEnterView.f31083m1.removeView(chatActivityEnterView.f31037e1);
                    viewGroup2.addView(chatActivityEnterView.f31037e1, (ViewGroup.LayoutParams) this.f9073c);
                }
                chatActivityEnterView.f31037e1.setAlpha(1.0f);
                chatActivityEnterView.f31056h1.setAlpha(1.0f);
                chatActivityEnterView.h = 0.0f;
                chatActivityEnterView.f31088n = 0.0f;
                chatActivityEnterView.H1();
                hi.y yVar = chatActivityEnterView.f31078l0;
                if (yVar != null) {
                    yVar.setAlpha(0.0f);
                    chatActivityEnterView.f31078l0.setScaleX(0.0f);
                    chatActivityEnterView.f31078l0.setScaleY(0.0f);
                }
                if (chatActivityEnterView.O1 != null && chatActivityEnterView.P && !chatActivityEnterView.O && qp.e1().getInt("voiceoncehint", 0) < 3) {
                    chatActivityEnterView.O1.b();
                    return;
                }
                return;
            case 4:
                ((ChatAttachAlertPhotoLayout) this.d).T = false;
                ((View) this.f9072b).setVisibility(4);
                ((ImageView) this.f9073c).sendAccessibilityEvent(8);
                return;
            case 5:
                if (((ab.q) this.d).f989a) {
                    ((View) this.f9073c).postDelayed((dt) this.f9072b, 300L);
                    return;
                }
                return;
            case 6:
                pj0 pj0Var = (pj0) this.f9073c;
                v4.s sVar = (v4.s) this.f9072b;
                gy gyVar = (gy) this.d;
                if (animator.equals(gyVar.M0)) {
                    int L0 = sVar.L0();
                    pj0Var.setTranslationY(0.0f);
                    if (pj0Var == gyVar.D0) {
                        pj0Var.setPadding(0, org.telegram.messenger.g0.L(36.0f), 0, org.telegram.messenger.g0.L(44.0f) + gyVar.f34074q2);
                    } else if (pj0Var == gyVar.f34047h0) {
                        pj0Var.setPadding(0, gyVar.f34028b1, 0, org.telegram.messenger.g0.L(44.0f) + gyVar.f34074q2);
                    } else if (pj0Var == gyVar.P) {
                        pj0Var.setPadding(org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(44.0f) + gyVar.f34074q2);
                    }
                    if (L0 != -1) {
                        sVar.h1(L0, 0);
                    }
                    gyVar.M0 = null;
                    return;
                }
                return;
            case 7:
                o40 o40Var = (o40) this.d;
                super.onAnimationEnd(animator);
                boolean[] zArr2 = (boolean[]) this.f9072b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    ((r30) this.f9073c).run();
                }
                o40Var.f36525f.setRotationY(0.0f);
                o40Var.f36543q0.setRotationY(0.0f);
                o40Var.N0 = false;
                o40Var.invalidate();
                return;
            case 8:
                i60 i60Var = (i60) this.f9072b;
                i60Var.setProgress(0.0f);
                i60Var.invalidate();
                org.telegram.messenger.g0.E2(i60Var);
                ViewTreeObserver viewTreeObserver = ((ViewGroup) this.f9073c).getViewTreeObserver();
                k60 k60Var = (k60) this.d;
                View view2 = k60Var.f35182f;
                viewTreeObserver.removeOnPreDrawListener(k60Var.f35210y);
                if (k60Var.P) {
                    view2.setVisibility(0);
                    if (view2 instanceof zh.z0) {
                        zh.z0 z0Var = (zh.z0) view2;
                        FrameLayout frameLayout = z0Var.d;
                        frameLayout.invalidate();
                        frameLayout.invalidateDrawable(z0Var.f60516e);
                        return;
                    }
                    return;
                }
                return;
            case 9:
                org.telegram.ui.Components.voip.k0 k0Var = (org.telegram.ui.Components.voip.k0) this.d;
                k0Var.N0 = null;
                ((org.telegram.ui.Components.voip.y) this.f9072b).E = false;
                org.telegram.ui.Components.voip.y yVar2 = k0Var.E;
                if (yVar2 != null) {
                    if (yVar2.getParent() != null) {
                        k0Var.removeView(k0Var.E);
                        ((org.telegram.ui.Components.voip.y) this.f9073c).e();
                    }
                    k0Var.E = null;
                    return;
                }
                return;
            case 10:
                LaunchActivity launchActivity = (LaunchActivity) this.d;
                launchActivity.E0 = null;
                launchActivity.f41293x0.invalidate();
                launchActivity.m0.invalidate();
                launchActivity.m0.setImageDrawable(null);
                xz0 xz0Var = launchActivity.m0;
                xz0Var.f40491c = null;
                xz0Var.f40489a.setShader(null);
                xz0Var.f40494n = null;
                xz0Var.f40495r = null;
                launchActivity.m0.setVisibility(8);
                launchActivity.f41274n0.setVisibility(8);
                ch0 ch0Var2 = (ch0) this.f9072b;
                if (ch0Var2 != null) {
                    ch0Var2.setImageDrawable((zg0) this.f9073c);
                }
                qs.e().k(267, new Object[0]);
                if (ch0Var2 != null) {
                    ch0Var2.setVisibility(0);
                }
                ww.f51523x4 = false;
                return;
            default:
                q11 q11Var = (q11) this.d;
                q11Var.f49057s1 = null;
                q11Var.invalidate();
                boolean[] zArr3 = (boolean[]) this.f9072b;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    ((c01) this.f9073c).run();
                    return;
                }
                return;
        }
    }

    public h3(ab.q qVar, View view) {
        this.f9071a = 5;
        this.d = qVar;
        this.f9073c = view;
        this.f9072b = new dt(this, 1);
    }
}
