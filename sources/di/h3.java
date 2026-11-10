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
import org.telegram.ui.sw0;
import org.telegram.ui.t11;
import org.telegram.ui.zw;
public final class h3 extends AnimatorListenerAdapter {
    public final int f9066a;
    public final Object f9067b;
    public final Object f9068c;
    public final Object d;

    public h3(Object obj, Object obj2, Object obj3, int i7) {
        this.f9066a = i7;
        this.d = obj;
        this.f9067b = obj2;
        this.f9068c = obj3;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f9066a) {
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
        switch (this.f9066a) {
            case 0:
                e7 e7Var = (e7) this.f9068c;
                i3 i3Var = (i3) this.d;
                j4 j4Var = i3Var.f9108a;
                j4Var.f9177d3 = false;
                j4Var.f9180e3 = 1.0f;
                j4Var.invalidate();
                boolean[] zArr = (boolean[]) this.f9067b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    j4 j4Var2 = i3Var.f9108a;
                    j4Var2.Z2 = true;
                    try {
                        j4Var2.performHapticFeedback(3);
                    } catch (Exception unused) {
                    }
                }
                e7Var.setAllowDrawReaction(true);
                e7Var.f8965r = true;
                ImageReceiver imageReceiver = e7Var.f8962e;
                if (imageReceiver.B() != null) {
                    imageReceiver.B().N(0, false, true);
                }
                j4 j4Var3 = i3Var.f9108a;
                org.telegram.ui.Components.h5 h5Var = j4Var3.X2;
                if (h5Var != null) {
                    h5Var.n(j4Var3);
                    i3Var.f9108a.X2 = null;
                    return;
                }
                return;
            case 1:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.d).f27299y.remove((AnimatorSet) this.f9067b);
                View view = (View) this.f9068c;
                if (view instanceof org.telegram.ui.ActionBar.z0) {
                    ch0 ch0Var = ((org.telegram.ui.ActionBar.z0) view).f28804c;
                    if (ch0Var.getAnimatedDrawable() != null) {
                        ch0Var.getAnimatedDrawable().start();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                org.telegram.ui.ActionBar.l3 l3Var = (org.telegram.ui.ActionBar.l3) this.d;
                org.telegram.ui.ActionBar.i3 i3Var2 = (org.telegram.ui.ActionBar.i3) this.f9068c;
                org.telegram.ui.ActionBar.d3 d3Var = (org.telegram.ui.ActionBar.d3) this.f9067b;
                ViewGroup viewGroup = d3Var.f27393b;
                if (viewGroup == null) {
                    viewGroup = d3Var.f27394c;
                }
                if (viewGroup != null && d3Var.f27402m == null && (i7 = d3Var.f27397g) > 0 && (i10 = d3Var.h) > 0) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        org.telegram.ui.ActionBar.l3.g(viewGroup, -d3Var.f27398i, new org.telegram.messenger.voip.k(2, d3Var, i3Var2));
                        l3Var.f27730b = null;
                        l3Var.invalidate();
                        return;
                    }
                    d3Var.f27402m = Bitmap.createBitmap(i7, i10, Bitmap.Config.RGB_565);
                    Canvas canvas = new Canvas(d3Var.f27402m);
                    canvas.translate(0.0f, -d3Var.f27398i);
                    viewGroup.draw(canvas);
                }
                i3Var2.mo25d().setDrawingFromOverlay(false);
                i3Var2.release();
                l3Var.f27730b = null;
                l3Var.invalidate();
                return;
            case 3:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.d;
                ViewGroup viewGroup2 = (ViewGroup) this.f9067b;
                if (viewGroup2 != null) {
                    chatActivityEnterView.f31103m1.removeView(chatActivityEnterView.f31057e1);
                    viewGroup2.addView(chatActivityEnterView.f31057e1, (ViewGroup.LayoutParams) this.f9068c);
                }
                chatActivityEnterView.f31057e1.setAlpha(1.0f);
                chatActivityEnterView.f31076h1.setAlpha(1.0f);
                chatActivityEnterView.h = 0.0f;
                chatActivityEnterView.f31108n = 0.0f;
                chatActivityEnterView.H1();
                hi.y yVar = chatActivityEnterView.f31098l0;
                if (yVar != null) {
                    yVar.setAlpha(0.0f);
                    chatActivityEnterView.f31098l0.setScaleX(0.0f);
                    chatActivityEnterView.f31098l0.setScaleY(0.0f);
                }
                if (chatActivityEnterView.O1 != null && chatActivityEnterView.P && !chatActivityEnterView.O && qp.e1().getInt("voiceoncehint", 0) < 3) {
                    chatActivityEnterView.O1.b();
                    return;
                }
                return;
            case 4:
                ((ChatAttachAlertPhotoLayout) this.d).T = false;
                ((View) this.f9067b).setVisibility(4);
                ((ImageView) this.f9068c).sendAccessibilityEvent(8);
                return;
            case 5:
                if (((ab.q) this.d).f989a) {
                    ((View) this.f9068c).postDelayed((dt) this.f9067b, 300L);
                    return;
                }
                return;
            case 6:
                pj0 pj0Var = (pj0) this.f9068c;
                v4.s sVar = (v4.s) this.f9067b;
                gy gyVar = (gy) this.d;
                if (animator.equals(gyVar.M0)) {
                    int L0 = sVar.L0();
                    pj0Var.setTranslationY(0.0f);
                    if (pj0Var == gyVar.D0) {
                        pj0Var.setPadding(0, org.telegram.messenger.g0.L(36.0f), 0, org.telegram.messenger.g0.L(44.0f) + gyVar.f34058q2);
                    } else if (pj0Var == gyVar.f34031h0) {
                        pj0Var.setPadding(0, gyVar.f34012b1, 0, org.telegram.messenger.g0.L(44.0f) + gyVar.f34058q2);
                    } else if (pj0Var == gyVar.P) {
                        pj0Var.setPadding(org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(44.0f) + gyVar.f34058q2);
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
                boolean[] zArr2 = (boolean[]) this.f9067b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    ((r30) this.f9068c).run();
                }
                o40Var.f36485f.setRotationY(0.0f);
                o40Var.f36503q0.setRotationY(0.0f);
                o40Var.N0 = false;
                o40Var.invalidate();
                return;
            case 8:
                i60 i60Var = (i60) this.f9067b;
                i60Var.setProgress(0.0f);
                i60Var.invalidate();
                org.telegram.messenger.g0.E2(i60Var);
                ViewTreeObserver viewTreeObserver = ((ViewGroup) this.f9068c).getViewTreeObserver();
                k60 k60Var = (k60) this.d;
                View view2 = k60Var.f35196f;
                viewTreeObserver.removeOnPreDrawListener(k60Var.f35224y);
                if (k60Var.P) {
                    view2.setVisibility(0);
                    if (view2 instanceof zh.y0) {
                        zh.y0 y0Var = (zh.y0) view2;
                        FrameLayout frameLayout = y0Var.d;
                        frameLayout.invalidate();
                        frameLayout.invalidateDrawable(y0Var.f60620e);
                        return;
                    }
                    return;
                }
                return;
            case 9:
                org.telegram.ui.Components.voip.k0 k0Var = (org.telegram.ui.Components.voip.k0) this.d;
                k0Var.N0 = null;
                ((org.telegram.ui.Components.voip.y) this.f9067b).E = false;
                org.telegram.ui.Components.voip.y yVar2 = k0Var.E;
                if (yVar2 != null) {
                    if (yVar2.getParent() != null) {
                        k0Var.removeView(k0Var.E);
                        ((org.telegram.ui.Components.voip.y) this.f9068c).e();
                    }
                    k0Var.E = null;
                    return;
                }
                return;
            case 10:
                LaunchActivity launchActivity = (LaunchActivity) this.d;
                launchActivity.E0 = null;
                launchActivity.f41295x0.invalidate();
                launchActivity.m0.invalidate();
                launchActivity.m0.setImageDrawable(null);
                xz0 xz0Var = launchActivity.m0;
                xz0Var.f40442c = null;
                xz0Var.f40440a.setShader(null);
                xz0Var.f40445n = null;
                xz0Var.f40446r = null;
                launchActivity.m0.setVisibility(8);
                launchActivity.f41276n0.setVisibility(8);
                ch0 ch0Var2 = (ch0) this.f9067b;
                if (ch0Var2 != null) {
                    ch0Var2.setImageDrawable((zg0) this.f9068c);
                }
                qs.e().k(267, new Object[0]);
                if (ch0Var2 != null) {
                    ch0Var2.setVisibility(0);
                }
                zw.f52552y4 = false;
                return;
            default:
                t11 t11Var = (t11) this.d;
                t11Var.f50059s1 = null;
                t11Var.invalidate();
                boolean[] zArr3 = (boolean[]) this.f9067b;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    ((sw0) this.f9068c).run();
                    return;
                }
                return;
        }
    }

    public h3(ab.q qVar, View view) {
        this.f9066a = 5;
        this.d = qVar;
        this.f9068c = view;
        this.f9067b = new dt(this, 1);
    }
}
