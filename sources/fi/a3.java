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
import org.telegram.ui.Components.a70;
import org.telegram.ui.Components.c50;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.f40;
import org.telegram.ui.Components.i01;
import org.telegram.ui.Components.ik;
import org.telegram.ui.Components.oh0;
import org.telegram.ui.Components.rh0;
import org.telegram.ui.Components.ty;
import org.telegram.ui.Components.w60;
import org.telegram.ui.Components.z60;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.cx;
import org.telegram.ui.s11;
import org.telegram.ui.wt0;
public final class a3 extends AnimatorListenerAdapter {
    public final int f11747a;
    public final Object f11748b;
    public final Object f11749c;
    public final Object d;

    public a3(Object obj, Object obj2, Object obj3, int i7) {
        this.f11747a = i7;
        this.d = obj;
        this.f11748b = obj2;
        this.f11749c = obj3;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f11747a) {
            case 6:
                ty tyVar = (ty) this.d;
                if (animator.equals(tyVar.N0)) {
                    tyVar.N0 = null;
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
        switch (this.f11747a) {
            case 0:
                u6 u6Var = (u6) this.f11749c;
                b3 b3Var = (b3) this.d;
                z3 z3Var = b3Var.f11794a;
                z3Var.f12861e3 = false;
                z3Var.f12864f3 = 1.0f;
                z3Var.invalidate();
                boolean[] zArr = (boolean[]) this.f11748b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    z3 z3Var2 = b3Var.f11794a;
                    z3Var2.f12850a3 = true;
                    try {
                        z3Var2.performHapticFeedback(3);
                    } catch (Exception unused) {
                    }
                }
                u6Var.setAllowDrawReaction(true);
                u6Var.f12665r = true;
                ImageReceiver imageReceiver = u6Var.f12662e;
                if (imageReceiver.B() != null) {
                    imageReceiver.B().N(0, false, true);
                }
                z3 z3Var3 = b3Var.f11794a;
                org.telegram.ui.Components.p5 p5Var = z3Var3.Y2;
                if (p5Var != null) {
                    p5Var.n(z3Var3);
                    b3Var.f11794a.Y2 = null;
                    return;
                }
                return;
            case 1:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.d).f28773y.remove((AnimatorSet) this.f11748b);
                View view = (View) this.f11749c;
                if (view instanceof org.telegram.ui.ActionBar.y0) {
                    rh0 rh0Var = ((org.telegram.ui.ActionBar.y0) view).f30286c;
                    if (rh0Var.getAnimatedDrawable() != null) {
                        rh0Var.getAnimatedDrawable().start();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                org.telegram.ui.ActionBar.m3 m3Var = (org.telegram.ui.ActionBar.m3) this.d;
                org.telegram.ui.ActionBar.j3 j3Var = (org.telegram.ui.ActionBar.j3) this.f11749c;
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) this.f11748b;
                ViewGroup viewGroup = e3Var.f28907b;
                if (viewGroup == null) {
                    viewGroup = e3Var.f28908c;
                }
                if (viewGroup != null && e3Var.f28916m == null && (i7 = e3Var.f28911g) > 0 && (i10 = e3Var.h) > 0) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        org.telegram.ui.ActionBar.m3.g(viewGroup, -e3Var.f28912i, new org.telegram.ui.ActionBar.b3(e3Var, j3Var));
                        m3Var.f29256b = null;
                        m3Var.invalidate();
                        return;
                    }
                    e3Var.f28916m = Bitmap.createBitmap(i7, i10, Bitmap.Config.RGB_565);
                    Canvas canvas = new Canvas(e3Var.f28916m);
                    canvas.translate(0.0f, -e3Var.f28912i);
                    viewGroup.draw(canvas);
                }
                j3Var.mo25d().setDrawingFromOverlay(false);
                j3Var.release();
                m3Var.f29256b = null;
                m3Var.invalidate();
                return;
            case 3:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.d;
                ViewGroup viewGroup2 = (ViewGroup) this.f11748b;
                if (viewGroup2 != null) {
                    chatActivityEnterView.f32588c2.removeView(chatActivityEnterView.f32612f1);
                    viewGroup2.addView(chatActivityEnterView.f32612f1, (ViewGroup.LayoutParams) this.f11749c);
                }
                chatActivityEnterView.f32612f1.setAlpha(1.0f);
                chatActivityEnterView.f32635i1.setAlpha(1.0f);
                chatActivityEnterView.h = 0.0f;
                chatActivityEnterView.f32670n = 0.0f;
                chatActivityEnterView.m2();
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
                ((View) this.f11748b).setVisibility(4);
                ((ImageView) this.f11749c).sendAccessibilityEvent(8);
                return;
            case 5:
                if (((ab.q) this.d).f987a) {
                    ((View) this.f11749c).postDelayed((ik) this.f11748b, 300L);
                    return;
                }
                return;
            case 6:
                ek0 ek0Var = (ek0) this.f11749c;
                v4.t tVar = (v4.t) this.f11748b;
                ty tyVar = (ty) this.d;
                if (animator.equals(tyVar.N0)) {
                    int L0 = tVar.L0();
                    ek0Var.setTranslationY(0.0f);
                    if (ek0Var == tyVar.E0) {
                        ek0Var.setPadding(0, org.telegram.messenger.g0.L(36.0f), 0, org.telegram.messenger.g0.L(44.0f) + tyVar.f40142r2);
                    } else if (ek0Var == tyVar.f40114i0) {
                        ek0Var.setPadding(0, tyVar.f40096c1, 0, org.telegram.messenger.g0.L(44.0f) + tyVar.f40142r2);
                    } else if (ek0Var == tyVar.Q) {
                        ek0Var.setPadding(org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(44.0f) + tyVar.f40142r2);
                    }
                    if (L0 != -1) {
                        tVar.h1(L0, 0);
                    }
                    tyVar.N0 = null;
                    return;
                }
                return;
            case 7:
                c50 c50Var = (c50) this.d;
                super.onAnimationEnd(animator);
                boolean[] zArr2 = (boolean[]) this.f11748b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    ((f40) this.f11749c).run();
                }
                c50Var.f34032f.setRotationY(0.0f);
                c50Var.f34052r0.setRotationY(0.0f);
                c50Var.O0 = false;
                c50Var.invalidate();
                return;
            case 8:
                w60 w60Var = (w60) this.f11748b;
                w60Var.setProgress(0.0f);
                w60Var.invalidate();
                org.telegram.messenger.g0.E2(w60Var);
                ViewTreeObserver viewTreeObserver = ((ViewGroup) this.f11749c).getViewTreeObserver();
                a70 a70Var = (a70) this.d;
                View view2 = a70Var.f33360f;
                viewTreeObserver.removeOnPreDrawListener(a70Var.f33391y);
                if (a70Var.S) {
                    if (view2 instanceof z60) {
                        ((z60) view2).setScrimHidden(false);
                    } else {
                        view2.setVisibility(0);
                    }
                    if (view2 instanceof bi.g3) {
                        bi.g3 g3Var = (bi.g3) view2;
                        FrameLayout frameLayout = g3Var.d;
                        frameLayout.invalidate();
                        frameLayout.invalidateDrawable(g3Var.f3644e);
                        return;
                    }
                    return;
                }
                return;
            case 9:
                org.telegram.ui.Components.voip.k0 k0Var = (org.telegram.ui.Components.voip.k0) this.d;
                k0Var.O0 = null;
                ((org.telegram.ui.Components.voip.y) this.f11748b).F = false;
                org.telegram.ui.Components.voip.y yVar2 = k0Var.F;
                if (yVar2 != null) {
                    if (yVar2.getParent() != null) {
                        k0Var.removeView(k0Var.F);
                        ((org.telegram.ui.Components.voip.y) this.f11749c).e();
                    }
                    k0Var.F = null;
                    return;
                }
                return;
            case 10:
                LaunchActivity launchActivity = (LaunchActivity) this.d;
                launchActivity.F0 = null;
                launchActivity.f43153y0.invalidate();
                launchActivity.f43132n0.invalidate();
                launchActivity.f43132n0.setImageDrawable(null);
                i01 i01Var = launchActivity.f43132n0;
                i01Var.f36102c = null;
                i01Var.f36100a.setShader(null);
                i01Var.f36105n = null;
                i01Var.f36106r = null;
                launchActivity.f43132n0.setVisibility(8);
                launchActivity.f43133o0.setVisibility(8);
                rh0 rh0Var2 = (rh0) this.f11748b;
                if (rh0Var2 != null) {
                    rh0Var2.setImageDrawable((oh0) this.f11749c);
                }
                ks.e().k(270, new Object[0]);
                if (rh0Var2 != null) {
                    rh0Var2.setVisibility(0);
                }
                cx.C4 = false;
                return;
            default:
                s11 s11Var = (s11) this.d;
                s11Var.f51863t1 = null;
                s11Var.invalidate();
                boolean[] zArr3 = (boolean[]) this.f11748b;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    ((wt0) this.f11749c).run();
                    return;
                }
                return;
        }
    }

    public a3(ab.q qVar, View view) {
        this.f11747a = 5;
        this.d = qVar;
        this.f11749c = view;
        this.f11748b = new ik(this, 4);
    }
}
