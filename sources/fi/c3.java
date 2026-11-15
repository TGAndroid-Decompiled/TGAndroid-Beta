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
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.fh0;
import org.telegram.ui.Components.k60;
import org.telegram.ui.Components.ly;
import org.telegram.ui.Components.m60;
import org.telegram.ui.Components.r40;
import org.telegram.ui.Components.u30;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.zj;
import org.telegram.ui.Components.zz0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.cu0;
import org.telegram.ui.n11;
import org.telegram.ui.yw;
public final class c3 extends AnimatorListenerAdapter {
    public final int f11590a;
    public final Object f11591b;
    public final Object f11592c;
    public final Object d;

    public c3(Object obj, Object obj2, Object obj3, int i7) {
        this.f11590a = i7;
        this.d = obj;
        this.f11591b = obj2;
        this.f11592c = obj3;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f11590a) {
            case 6:
                ly lyVar = (ly) this.d;
                if (animator.equals(lyVar.N0)) {
                    lyVar.N0 = null;
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
        switch (this.f11590a) {
            case 0:
                x6 x6Var = (x6) this.f11592c;
                d3 d3Var = (d3) this.d;
                b4 b4Var = d3Var.f11623a;
                b4Var.f11470e3 = false;
                b4Var.f11473f3 = 1.0f;
                b4Var.invalidate();
                boolean[] zArr = (boolean[]) this.f11591b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    b4 b4Var2 = d3Var.f11623a;
                    b4Var2.f11459a3 = true;
                    try {
                        b4Var2.performHapticFeedback(3);
                    } catch (Exception unused) {
                    }
                }
                x6Var.setAllowDrawReaction(true);
                x6Var.f12509r = true;
                ImageReceiver imageReceiver = x6Var.f12506e;
                if (imageReceiver.B() != null) {
                    imageReceiver.B().N(0, false, true);
                }
                b4 b4Var3 = d3Var.f11623a;
                org.telegram.ui.Components.g5 g5Var = b4Var3.Y2;
                if (g5Var != null) {
                    g5Var.n(b4Var3);
                    d3Var.f11623a.Y2 = null;
                    return;
                }
                return;
            case 1:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.d).f28391y.remove((AnimatorSet) this.f11591b);
                View view = (View) this.f11592c;
                if (view instanceof org.telegram.ui.ActionBar.z0) {
                    fh0 fh0Var = ((org.telegram.ui.ActionBar.z0) view).f29901c;
                    if (fh0Var.getAnimatedDrawable() != null) {
                        fh0Var.getAnimatedDrawable().start();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                org.telegram.ui.ActionBar.j3 j3Var = (org.telegram.ui.ActionBar.j3) this.d;
                org.telegram.ui.ActionBar.g3 g3Var = (org.telegram.ui.ActionBar.g3) this.f11592c;
                org.telegram.ui.ActionBar.b3 b3Var = (org.telegram.ui.ActionBar.b3) this.f11591b;
                ViewGroup viewGroup = b3Var.f28425b;
                if (viewGroup == null) {
                    viewGroup = b3Var.f28426c;
                }
                if (viewGroup != null && b3Var.f28434m == null && (i7 = b3Var.f28429g) > 0 && (i10 = b3Var.h) > 0) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        org.telegram.ui.ActionBar.j3.g(viewGroup, -b3Var.f28430i, new li.v(7, b3Var, g3Var));
                        j3Var.f28727b = null;
                        j3Var.invalidate();
                        return;
                    }
                    b3Var.f28434m = Bitmap.createBitmap(i7, i10, Bitmap.Config.RGB_565);
                    Canvas canvas = new Canvas(b3Var.f28434m);
                    canvas.translate(0.0f, -b3Var.f28430i);
                    viewGroup.draw(canvas);
                }
                g3Var.mo25d().setDrawingFromOverlay(false);
                g3Var.release();
                j3Var.f28727b = null;
                j3Var.invalidate();
                return;
            case 3:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.d;
                ViewGroup viewGroup2 = (ViewGroup) this.f11591b;
                if (viewGroup2 != null) {
                    chatActivityEnterView.U1.removeView(chatActivityEnterView.f32193f1);
                    viewGroup2.addView(chatActivityEnterView.f32193f1, (ViewGroup.LayoutParams) this.f11592c);
                }
                chatActivityEnterView.f32193f1.setAlpha(1.0f);
                chatActivityEnterView.f32214i1.setAlpha(1.0f);
                chatActivityEnterView.h = 0.0f;
                chatActivityEnterView.f32245n = 0.0f;
                chatActivityEnterView.Z1();
                ki.a0 a0Var = chatActivityEnterView.m0;
                if (a0Var != null) {
                    a0Var.setAlpha(0.0f);
                    chatActivityEnterView.m0.setScaleX(0.0f);
                    chatActivityEnterView.m0.setScaleY(0.0f);
                }
                if (chatActivityEnterView.f32310w2 != null && chatActivityEnterView.Q && !chatActivityEnterView.P && np.e1().getInt("voiceoncehint", 0) < 3) {
                    chatActivityEnterView.f32310w2.i();
                    return;
                }
                return;
            case 4:
                ((ChatAttachAlertPhotoLayout) this.d).U = false;
                ((View) this.f11591b).setVisibility(4);
                ((ImageView) this.f11592c).sendAccessibilityEvent(8);
                return;
            case 5:
                if (((ab.q) this.d).f988a) {
                    ((View) this.f11592c).postDelayed((zj) this.f11591b, 300L);
                    return;
                }
                return;
            case 6:
                uj0 uj0Var = (uj0) this.f11592c;
                v4.s sVar = (v4.s) this.f11591b;
                ly lyVar = (ly) this.d;
                if (animator.equals(lyVar.N0)) {
                    int L0 = sVar.L0();
                    uj0Var.setTranslationY(0.0f);
                    if (uj0Var == lyVar.E0) {
                        uj0Var.setPadding(0, org.telegram.messenger.g0.L(36.0f), 0, org.telegram.messenger.g0.L(44.0f) + lyVar.f36984r2);
                    } else if (uj0Var == lyVar.f36956i0) {
                        uj0Var.setPadding(0, lyVar.f36938c1, 0, org.telegram.messenger.g0.L(44.0f) + lyVar.f36984r2);
                    } else if (uj0Var == lyVar.Q) {
                        uj0Var.setPadding(org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(44.0f) + lyVar.f36984r2);
                    }
                    if (L0 != -1) {
                        sVar.h1(L0, 0);
                    }
                    lyVar.N0 = null;
                    return;
                }
                return;
            case 7:
                r40 r40Var = (r40) this.d;
                super.onAnimationEnd(animator);
                boolean[] zArr2 = (boolean[]) this.f11591b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    ((u30) this.f11592c).run();
                }
                r40Var.f38847f.setRotationY(0.0f);
                r40Var.f38867r0.setRotationY(0.0f);
                r40Var.O0 = false;
                r40Var.invalidate();
                return;
            case 8:
                k60 k60Var = (k60) this.f11591b;
                k60Var.setProgress(0.0f);
                k60Var.invalidate();
                org.telegram.messenger.g0.E2(k60Var);
                ViewTreeObserver viewTreeObserver = ((ViewGroup) this.f11592c).getViewTreeObserver();
                m60 m60Var = (m60) this.d;
                View view2 = m60Var.f37088f;
                viewTreeObserver.removeOnPreDrawListener(m60Var.f37116y);
                if (m60Var.P) {
                    view2.setVisibility(0);
                    if (view2 instanceof bi.i2) {
                        bi.i2 i2Var = (bi.i2) view2;
                        FrameLayout frameLayout = i2Var.d;
                        frameLayout.invalidate();
                        frameLayout.invalidateDrawable(i2Var.f3585e);
                        return;
                    }
                    return;
                }
                return;
            case 9:
                org.telegram.ui.Components.voip.l0 l0Var = (org.telegram.ui.Components.voip.l0) this.d;
                l0Var.O0 = null;
                ((org.telegram.ui.Components.voip.z) this.f11591b).F = false;
                org.telegram.ui.Components.voip.z zVar = l0Var.F;
                if (zVar != null) {
                    if (zVar.getParent() != null) {
                        l0Var.removeView(l0Var.F);
                        ((org.telegram.ui.Components.voip.z) this.f11592c).e();
                    }
                    l0Var.F = null;
                    return;
                }
                return;
            case 10:
                LaunchActivity launchActivity = (LaunchActivity) this.d;
                launchActivity.F0 = null;
                launchActivity.f42667y0.invalidate();
                launchActivity.f42646n0.invalidate();
                launchActivity.f42646n0.setImageDrawable(null);
                zz0 zz0Var = launchActivity.f42646n0;
                zz0Var.f42525c = null;
                zz0Var.f42523a.setShader(null);
                zz0Var.f42528n = null;
                zz0Var.f42529r = null;
                launchActivity.f42646n0.setVisibility(8);
                launchActivity.f42647o0.setVisibility(8);
                fh0 fh0Var2 = (fh0) this.f11591b;
                if (fh0Var2 != null) {
                    fh0Var2.setImageDrawable((ch0) this.f11592c);
                }
                ns.e().k(267, new Object[0]);
                if (fh0Var2 != null) {
                    fh0Var2.setVisibility(0);
                }
                yw.f53608z4 = false;
                return;
            default:
                n11 n11Var = (n11) this.d;
                n11Var.f49408t1 = null;
                n11Var.invalidate();
                boolean[] zArr3 = (boolean[]) this.f11591b;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    ((cu0) this.f11592c).run();
                    return;
                }
                return;
        }
    }

    public c3(ab.q qVar, View view) {
        this.f11590a = 5;
        this.d = qVar;
        this.f11592c = view;
        this.f11591b = new zj(this, 4);
    }
}
