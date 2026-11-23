package fi;

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
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.c40;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.h01;
import org.telegram.ui.Components.nh0;
import org.telegram.ui.Components.qh0;
import org.telegram.ui.Components.qy;
import org.telegram.ui.Components.rc;
import org.telegram.ui.Components.t60;
import org.telegram.ui.Components.w60;
import org.telegram.ui.Components.x60;
import org.telegram.ui.Components.z40;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bx;
import org.telegram.ui.eu0;
import org.telegram.ui.q11;
public final class a3 extends AnimatorListenerAdapter {
    public final int f11712a;
    public final Object f11713b;
    public final Object f11714c;
    public final Object d;

    public a3(Object obj, Object obj2, Object obj3, int i7) {
        this.f11712a = i7;
        this.d = obj;
        this.f11713b = obj2;
        this.f11714c = obj3;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f11712a) {
            case 6:
                qy qyVar = (qy) this.d;
                if (animator.equals(qyVar.N0)) {
                    qyVar.N0 = null;
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
        switch (this.f11712a) {
            case 0:
                u6 u6Var = (u6) this.f11714c;
                b3 b3Var = (b3) this.d;
                z3 z3Var = b3Var.f11759a;
                z3Var.f12826e3 = false;
                z3Var.f12829f3 = 1.0f;
                z3Var.invalidate();
                boolean[] zArr = (boolean[]) this.f11713b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    z3 z3Var2 = b3Var.f11759a;
                    z3Var2.f12815a3 = true;
                    try {
                        z3Var2.performHapticFeedback(3);
                    } catch (Exception unused) {
                    }
                }
                u6Var.setAllowDrawReaction(true);
                u6Var.f12630r = true;
                ImageReceiver imageReceiver = u6Var.f12627e;
                if (imageReceiver.C() != null) {
                    imageReceiver.C().N(0, false, true);
                }
                z3 z3Var3 = b3Var.f11759a;
                org.telegram.ui.Components.o5 o5Var = z3Var3.Y2;
                if (o5Var != null) {
                    o5Var.n(z3Var3);
                    b3Var.f11759a.Y2 = null;
                    return;
                }
                return;
            case 1:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.d).f28834y.remove((AnimatorSet) this.f11713b);
                View view = (View) this.f11714c;
                if (view instanceof org.telegram.ui.ActionBar.y0) {
                    qh0 qh0Var = ((org.telegram.ui.ActionBar.y0) view).f30346c;
                    if (qh0Var.getAnimatedDrawable() != null) {
                        qh0Var.getAnimatedDrawable().start();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                org.telegram.ui.ActionBar.m3 m3Var = (org.telegram.ui.ActionBar.m3) this.d;
                org.telegram.ui.ActionBar.j3 j3Var = (org.telegram.ui.ActionBar.j3) this.f11714c;
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) this.f11713b;
                ViewGroup viewGroup = e3Var.f28953b;
                if (viewGroup == null) {
                    viewGroup = e3Var.f28954c;
                }
                if (viewGroup != null && e3Var.f28962m == null && (i7 = e3Var.f28957g) > 0 && (i10 = e3Var.h) > 0) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        org.telegram.ui.ActionBar.m3.g(viewGroup, -e3Var.f28958i, new org.telegram.ui.ActionBar.b3(e3Var, j3Var));
                        m3Var.f29299b = null;
                        m3Var.invalidate();
                        return;
                    }
                    e3Var.f28962m = Bitmap.createBitmap(i7, i10, Bitmap.Config.RGB_565);
                    Canvas canvas = new Canvas(e3Var.f28962m);
                    canvas.translate(0.0f, -e3Var.f28958i);
                    viewGroup.draw(canvas);
                }
                j3Var.mo25d().setDrawingFromOverlay(false);
                j3Var.release();
                m3Var.f29299b = null;
                m3Var.invalidate();
                return;
            case 3:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.d;
                ViewGroup viewGroup2 = (ViewGroup) this.f11713b;
                if (viewGroup2 != null) {
                    chatActivityEnterView.f32655c2.removeView(chatActivityEnterView.f32679f1);
                    viewGroup2.addView(chatActivityEnterView.f32679f1, (ViewGroup.LayoutParams) this.f11714c);
                }
                chatActivityEnterView.f32679f1.setAlpha(1.0f);
                chatActivityEnterView.f32702i1.setAlpha(1.0f);
                chatActivityEnterView.h = 0.0f;
                chatActivityEnterView.f32737n = 0.0f;
                chatActivityEnterView.o2();
                ki.y yVar = chatActivityEnterView.m0;
                if (yVar != null) {
                    yVar.setAlpha(0.0f);
                    chatActivityEnterView.m0.setScaleX(0.0f);
                    chatActivityEnterView.m0.setScaleY(0.0f);
                }
                if (chatActivityEnterView.E2 != null && chatActivityEnterView.Q && !chatActivityEnterView.P && mp.g1().getInt("voiceoncehint", 0) < 3) {
                    chatActivityEnterView.E2.i();
                    return;
                }
                return;
            case 4:
                ((ChatAttachAlertPhotoLayout) this.d).U = false;
                ((View) this.f11713b).setVisibility(4);
                ((ImageView) this.f11714c).sendAccessibilityEvent(8);
                return;
            case 5:
                if (((ab.q) this.d).f987a) {
                    ((View) this.f11714c).postDelayed((rc) this.f11713b, 300L);
                    return;
                }
                return;
            case 6:
                ek0 ek0Var = (ek0) this.f11714c;
                v4.t tVar = (v4.t) this.f11713b;
                qy qyVar = (qy) this.d;
                if (animator.equals(qyVar.N0)) {
                    int L0 = tVar.L0();
                    ek0Var.setTranslationY(0.0f);
                    if (ek0Var == qyVar.E0) {
                        ek0Var.setPadding(0, org.telegram.messenger.g0.L(36.0f), 0, org.telegram.messenger.g0.L(44.0f) + qyVar.f39090r2);
                    } else if (ek0Var == qyVar.f39062i0) {
                        ek0Var.setPadding(0, qyVar.f39044c1, 0, org.telegram.messenger.g0.L(44.0f) + qyVar.f39090r2);
                    } else if (ek0Var == qyVar.Q) {
                        ek0Var.setPadding(org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(44.0f) + qyVar.f39090r2);
                    }
                    if (L0 != -1) {
                        tVar.h1(L0, 0);
                    }
                    qyVar.N0 = null;
                    return;
                }
                return;
            case 7:
                z40 z40Var = (z40) this.d;
                super.onAnimationEnd(animator);
                boolean[] zArr2 = (boolean[]) this.f11713b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    ((c40) this.f11714c).run();
                }
                z40Var.f42668f.setRotationY(0.0f);
                z40Var.f42688r0.setRotationY(0.0f);
                z40Var.O0 = false;
                z40Var.invalidate();
                return;
            case 8:
                t60 t60Var = (t60) this.f11713b;
                t60Var.setProgress(0.0f);
                t60Var.invalidate();
                org.telegram.messenger.g0.E2(t60Var);
                ViewTreeObserver viewTreeObserver = ((ViewGroup) this.f11714c).getViewTreeObserver();
                x60 x60Var = (x60) this.d;
                View view2 = x60Var.f41868f;
                viewTreeObserver.removeOnPreDrawListener(x60Var.f41899y);
                if (x60Var.S) {
                    if (view2 instanceof w60) {
                        ((w60) view2).setScrimHidden(false);
                    } else {
                        view2.setVisibility(0);
                    }
                    if (view2 instanceof bi.i3) {
                        bi.i3 i3Var = (bi.i3) view2;
                        FrameLayout frameLayout = i3Var.d;
                        frameLayout.invalidate();
                        frameLayout.invalidateDrawable(i3Var.f3666e);
                        return;
                    }
                    return;
                }
                return;
            case 9:
                org.telegram.ui.Components.voip.l0 l0Var = (org.telegram.ui.Components.voip.l0) this.d;
                l0Var.O0 = null;
                ((org.telegram.ui.Components.voip.z) this.f11713b).F = false;
                org.telegram.ui.Components.voip.z zVar = l0Var.F;
                if (zVar != null) {
                    if (zVar.getParent() != null) {
                        l0Var.removeView(l0Var.F);
                        ((org.telegram.ui.Components.voip.z) this.f11714c).e();
                    }
                    l0Var.F = null;
                    return;
                }
                return;
            case 10:
                LaunchActivity launchActivity = (LaunchActivity) this.d;
                launchActivity.F0 = null;
                launchActivity.f43232y0.invalidate();
                launchActivity.f43211n0.invalidate();
                launchActivity.f43211n0.setImageDrawable(null);
                h01 h01Var = launchActivity.f43211n0;
                h01Var.f35600c = null;
                h01Var.f35598a.setShader(null);
                h01Var.f35603n = null;
                h01Var.f35604r = null;
                launchActivity.f43211n0.setVisibility(8);
                launchActivity.f43212o0.setVisibility(8);
                qh0 qh0Var2 = (qh0) this.f11713b;
                if (qh0Var2 != null) {
                    qh0Var2.setImageDrawable((nh0) this.f11714c);
                }
                ks.e().k(270, new Object[0]);
                if (qh0Var2 != null) {
                    qh0Var2.setVisibility(0);
                }
                bx.C4 = false;
                return;
            default:
                q11 q11Var = (q11) this.d;
                q11Var.f51270t1 = null;
                q11Var.invalidate();
                boolean[] zArr3 = (boolean[]) this.f11713b;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    ((eu0) this.f11714c).run();
                    return;
                }
                return;
        }
    }

    public a3(ab.q qVar, View view) {
        this.f11712a = 5;
        this.d = qVar;
        this.f11714c = view;
        this.f11713b = new rc(this, 5);
    }
}
