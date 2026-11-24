package defpackage;

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
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.LaunchActivity;
public final class i8 extends AnimatorListenerAdapter {
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;

    public i8(xf4 xf4Var, View view) {
        this.a = (byte) 4;
        this.d = xf4Var;
        this.c = view;
        this.b = new o1(this, (byte) 29);
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 5:
                t14 t14Var = (t14) this.d;
                if (animator.equals(t14Var.N0)) {
                    t14Var.N0 = null;
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
        int i;
        int i2;
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        Object obj3 = this.d;
        switch (b) {
            case 0:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj3).y.remove((AnimatorSet) obj2);
                View view = (View) obj;
                if (view instanceof a8) {
                    ry8 ry8Var = ((a8) view).c;
                    if (ry8Var.getAnimatedDrawable() != null) {
                        ry8Var.getAnimatedDrawable().start();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                yx0 yx0Var = (yx0) obj3;
                vx0 vx0Var = (vx0) obj;
                px0 px0Var = (px0) obj2;
                ViewGroup viewGroup = px0Var.b;
                if (viewGroup == null) {
                    viewGroup = px0Var.c;
                }
                if (viewGroup != null && px0Var.m == null && (i = px0Var.g) > 0 && (i2 = px0Var.h) > 0) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        yx0.g(viewGroup, -px0Var.i, new x0(px0Var, vx0Var, (byte) 9));
                        yx0Var.b = null;
                        yx0Var.invalidate();
                        return;
                    }
                    px0Var.m = Bitmap.createBitmap(i, i2, Bitmap.Config.RGB_565);
                    Canvas canvas = new Canvas(px0Var.m);
                    canvas.translate(0.0f, -px0Var.i);
                    viewGroup.draw(canvas);
                }
                vx0Var.mo23d().setDrawingFromOverlay(false);
                vx0Var.release();
                yx0Var.b = null;
                yx0Var.invalidate();
                return;
            case 2:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj3;
                ViewGroup viewGroup2 = (ViewGroup) obj2;
                if (viewGroup2 != null) {
                    chatActivityEnterView.c2.removeView(chatActivityEnterView.f1);
                    viewGroup2.addView(chatActivityEnterView.f1, (ViewGroup.LayoutParams) obj);
                }
                chatActivityEnterView.f1.setAlpha(1.0f);
                chatActivityEnterView.i1.setAlpha(1.0f);
                chatActivityEnterView.h = 0.0f;
                chatActivityEnterView.n = 0.0f;
                chatActivityEnterView.l2();
                ep0 ep0Var = chatActivityEnterView.m0;
                if (ep0Var != null) {
                    ep0Var.setAlpha(0.0f);
                    chatActivityEnterView.m0.setScaleX(0.0f);
                    chatActivityEnterView.m0.setScaleY(0.0f);
                }
                if (chatActivityEnterView.E2 != null && chatActivityEnterView.Q && !chatActivityEnterView.P && na7.c1().getInt("voiceoncehint", 0) < 3) {
                    chatActivityEnterView.E2.h();
                    return;
                }
                return;
            case 3:
                ((ChatAttachAlertPhotoLayout) obj3).U = false;
                ((View) obj).setVisibility(4);
                ((ImageView) obj2).sendAccessibilityEvent(8);
                return;
            case 4:
                if (((xf4) obj3).a) {
                    ((View) obj).postDelayed((o1) obj2, 300L);
                    return;
                }
                return;
            case 5:
                o39 o39Var = (o39) obj;
                r35 r35Var = (r35) obj2;
                t14 t14Var = (t14) obj3;
                if (animator.equals(t14Var.N0)) {
                    int K0 = r35Var.K0();
                    o39Var.setTranslationY(0.0f);
                    if (o39Var == t14Var.E0) {
                        o39Var.setPadding(0, gl.L(36.0f), 0, gl.L(44.0f) + t14Var.q2);
                    } else if (o39Var == t14Var.i0) {
                        o39Var.setPadding(0, t14Var.c1, 0, gl.L(44.0f) + t14Var.q2);
                    } else if (o39Var == t14Var.Q) {
                        o39Var.setPadding(gl.L(5.0f), gl.L(36.0f), gl.L(5.0f), gl.L(44.0f) + t14Var.q2);
                    }
                    if (K0 != -1) {
                        r35Var.g1(K0, 0);
                    }
                    t14Var.N0 = null;
                    return;
                }
                return;
            case 6:
                l95 l95Var = (l95) obj3;
                l95Var.O0 = null;
                ((h85) obj2).F = false;
                h85 h85Var = l95Var.F;
                if (h85Var != null) {
                    if (h85Var.getParent() != null) {
                        l95Var.removeView(l95Var.F);
                        ((h85) obj).e();
                    }
                    l95Var.F = null;
                    return;
                }
                return;
            case 7:
                zr5 zr5Var = (zr5) obj2;
                zr5Var.setProgress(0.0f);
                zr5Var.invalidate();
                gl.B2(zr5Var);
                ViewTreeObserver viewTreeObserver = ((ViewGroup) obj).getViewTreeObserver();
                cs5 cs5Var = (cs5) obj3;
                View view2 = cs5Var.f;
                viewTreeObserver.removeOnPreDrawListener(cs5Var.y);
                if (cs5Var.S) {
                    if (view2 instanceof bs5) {
                        ((bs5) view2).setScrimHidden(false);
                    } else {
                        view2.setVisibility(0);
                    }
                    if (view2 instanceof nv4) {
                        nv4 nv4Var = (nv4) view2;
                        FrameLayout frameLayout = nv4Var.d;
                        frameLayout.invalidate();
                        frameLayout.invalidateDrawable(nv4Var.e);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                LaunchActivity launchActivity = (LaunchActivity) obj3;
                launchActivity.F0 = null;
                launchActivity.y0.invalidate();
                launchActivity.n0.invalidate();
                launchActivity.n0.setImageDrawable(null);
                umb umbVar = launchActivity.n0;
                umbVar.c = null;
                umbVar.a.setShader(null);
                umbVar.n = null;
                umbVar.r = null;
                launchActivity.n0.setVisibility(8);
                launchActivity.o0.setVisibility(8);
                ry8 ry8Var2 = (ry8) obj2;
                if (ry8Var2 != null) {
                    ry8Var2.setImageDrawable((oy8) obj);
                }
                kk7.e().k(270, new Object[0]);
                if (ry8Var2 != null) {
                    ry8Var2.setVisibility(0);
                }
                cj3.C4 = false;
                return;
            case 9:
                l2b l2bVar = (l2b) obj;
                y28 y28Var = ((c28) obj3).a;
                y28Var.k3 = false;
                y28Var.l3 = 1.0f;
                y28Var.invalidate();
                boolean[] zArr = (boolean[]) obj2;
                if (!zArr[0]) {
                    zArr[0] = true;
                    y28Var.g3 = true;
                    try {
                        y28Var.performHapticFeedback(3);
                    } catch (Exception unused) {
                    }
                }
                l2bVar.setAllowDrawReaction(true);
                l2bVar.r = true;
                ImageReceiver imageReceiver = l2bVar.e;
                if (imageReceiver.y() != null) {
                    imageReceiver.y().I(0, false, true);
                }
                vl vlVar = y28Var.e3;
                if (vlVar != null) {
                    vlVar.o(y28Var);
                    y28Var.e3 = null;
                    return;
                }
                return;
            default:
                tx9 tx9Var = (tx9) obj3;
                tx9Var.t1 = null;
                tx9Var.invalidate();
                boolean[] zArr2 = (boolean[]) obj2;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    ((ex7) obj).run();
                    return;
                }
                return;
        }
    }

    public i8(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.d = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public i8(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, View view, ImageView imageView) {
        this.a = (byte) 3;
        this.d = chatAttachAlertPhotoLayout;
        this.c = view;
        this.b = imageView;
    }
}
