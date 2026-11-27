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
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.LaunchActivity;
public final class j8 extends AnimatorListenerAdapter {
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;

    public j8(vh4 vh4Var, View view) {
        this.a = (byte) 5;
        this.d = vh4Var;
        this.c = view;
        this.b = new p1(this, (byte) 29);
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 6:
                o24 o24Var = (o24) this.d;
                if (animator.equals(o24Var.N0)) {
                    o24Var.N0 = null;
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
                if (view instanceof b8) {
                    e29 e29Var = ((b8) view).c;
                    if (e29Var.getAnimatedDrawable() != null) {
                        e29Var.getAnimatedDrawable().start();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                rr0 rr0Var = (rr0) obj3;
                a aVar = (a) ((fp) obj2).e;
                if (aVar != null) {
                    aVar.setAlpha(1.0f);
                }
                rr0Var.d.setLayerType(0, null);
                rr0Var.w = false;
                rr0Var.s = null;
                rr0Var.y = null;
                rr0Var.m0(1.0f);
                ((Runnable) obj).run();
                return;
            case 2:
                gy0 gy0Var = (gy0) obj3;
                dy0 dy0Var = (dy0) obj;
                xx0 xx0Var = (xx0) obj2;
                ViewGroup viewGroup = xx0Var.b;
                if (viewGroup == null) {
                    viewGroup = xx0Var.c;
                }
                if (viewGroup != null && xx0Var.m == null && (i = xx0Var.g) > 0 && (i2 = xx0Var.h) > 0) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        gy0.g(viewGroup, -xx0Var.i, new y0(xx0Var, dy0Var, (byte) 9));
                        gy0Var.b = null;
                        gy0Var.invalidate();
                        return;
                    }
                    xx0Var.m = Bitmap.createBitmap(i, i2, Bitmap.Config.RGB_565);
                    Canvas canvas = new Canvas(xx0Var.m);
                    canvas.translate(0.0f, -xx0Var.i);
                    viewGroup.draw(canvas);
                }
                dy0Var.mo23d().setDrawingFromOverlay(false);
                dy0Var.release();
                gy0Var.b = null;
                gy0Var.invalidate();
                return;
            case 3:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj3;
                ViewGroup viewGroup2 = (ViewGroup) obj2;
                if (viewGroup2 != null) {
                    chatActivityEnterView.b2.removeView(chatActivityEnterView.f1);
                    viewGroup2.addView(chatActivityEnterView.f1, (ViewGroup.LayoutParams) obj);
                }
                chatActivityEnterView.f1.setAlpha(1.0f);
                chatActivityEnterView.i1.setAlpha(1.0f);
                chatActivityEnterView.h = 0.0f;
                chatActivityEnterView.n = 0.0f;
                chatActivityEnterView.x2();
                ep0 ep0Var = chatActivityEnterView.m0;
                if (ep0Var != null) {
                    ep0Var.setAlpha(0.0f);
                    chatActivityEnterView.m0.setScaleX(0.0f);
                    chatActivityEnterView.m0.setScaleY(0.0f);
                }
                if (chatActivityEnterView.D2 != null && chatActivityEnterView.Q && !chatActivityEnterView.P && uc7.e1().getInt("voiceoncehint", 0) < 3) {
                    chatActivityEnterView.D2.i();
                    return;
                }
                return;
            case 4:
                ((ChatAttachAlertPhotoLayout) obj3).U = false;
                ((View) obj).setVisibility(4);
                ((ImageView) obj2).sendAccessibilityEvent(8);
                return;
            case 5:
                if (((vh4) obj3).a) {
                    ((View) obj).postDelayed((p1) obj2, 300L);
                    return;
                }
                return;
            case 6:
                d79 d79Var = (d79) obj;
                u55 u55Var = (u55) obj2;
                o24 o24Var = (o24) obj3;
                if (animator.equals(o24Var.N0)) {
                    int K0 = u55Var.K0();
                    d79Var.setTranslationY(0.0f);
                    if (d79Var == o24Var.E0) {
                        d79Var.setPadding(0, hl.L(36.0f), 0, hl.L(44.0f) + o24Var.q2);
                    } else if (d79Var == o24Var.i0) {
                        d79Var.setPadding(0, o24Var.c1, 0, hl.L(44.0f) + o24Var.q2);
                    } else if (d79Var == o24Var.Q) {
                        d79Var.setPadding(hl.L(5.0f), hl.L(36.0f), hl.L(5.0f), hl.L(44.0f) + o24Var.q2);
                    }
                    if (K0 != -1) {
                        u55Var.g1(K0, 0);
                    }
                    o24Var.N0 = null;
                    return;
                }
                return;
            case 7:
                mb5 mb5Var = (mb5) obj3;
                mb5Var.O0 = null;
                ((ka5) obj2).F = false;
                ka5 ka5Var = mb5Var.F;
                if (ka5Var != null) {
                    if (ka5Var.getParent() != null) {
                        mb5Var.removeView(mb5Var.F);
                        ((ka5) obj).e();
                    }
                    mb5Var.F = null;
                    return;
                }
                return;
            case 8:
                bu5 bu5Var = (bu5) obj2;
                bu5Var.setProgress(0.0f);
                bu5Var.invalidate();
                hl.B2(bu5Var);
                ViewTreeObserver viewTreeObserver = ((ViewGroup) obj).getViewTreeObserver();
                fu5 fu5Var = (fu5) obj3;
                View view2 = fu5Var.f;
                viewTreeObserver.removeOnPreDrawListener(fu5Var.y);
                if (fu5Var.V) {
                    if (view2 instanceof eu5) {
                        ((eu5) view2).setScrimHidden(false);
                    } else {
                        view2.setVisibility(0);
                    }
                    if (view2 instanceof sx4) {
                        sx4 sx4Var = (sx4) view2;
                        FrameLayout frameLayout = sx4Var.d;
                        frameLayout.invalidate();
                        frameLayout.invalidateDrawable(sx4Var.e);
                        return;
                    }
                    return;
                }
                return;
            case 9:
                LaunchActivity launchActivity = (LaunchActivity) obj3;
                launchActivity.F0 = null;
                launchActivity.y0.invalidate();
                launchActivity.n0.invalidate();
                launchActivity.n0.setImageDrawable(null);
                tqb tqbVar = launchActivity.n0;
                tqbVar.c = null;
                tqbVar.a.setShader(null);
                tqbVar.n = null;
                tqbVar.r = null;
                launchActivity.n0.setVisibility(8);
                launchActivity.o0.setVisibility(8);
                e29 e29Var2 = (e29) obj2;
                if (e29Var2 != null) {
                    e29Var2.setImageDrawable((b29) obj);
                }
                jn7.e().k(271, new Object[0]);
                if (e29Var2 != null) {
                    e29Var2.setVisibility(0);
                }
                uj3.E4 = false;
                return;
            case 10:
                h6b h6bVar = (h6b) obj;
                o68 o68Var = ((s58) obj3).a;
                o68Var.e3 = false;
                o68Var.f3 = 1.0f;
                o68Var.invalidate();
                boolean[] zArr = (boolean[]) obj2;
                if (!zArr[0]) {
                    zArr[0] = true;
                    o68Var.a3 = true;
                    try {
                        o68Var.performHapticFeedback(3);
                    } catch (Exception unused) {
                    }
                }
                h6bVar.setAllowDrawReaction(true);
                h6bVar.r = true;
                ImageReceiver imageReceiver = h6bVar.e;
                if (imageReceiver.y() != null) {
                    imageReceiver.y().I(0, false, true);
                }
                wl wlVar = o68Var.Y2;
                if (wlVar != null) {
                    wlVar.o(o68Var);
                    o68Var.Y2 = null;
                    return;
                }
                return;
            default:
                n1a n1aVar = (n1a) obj3;
                n1aVar.t1 = null;
                n1aVar.invalidate();
                boolean[] zArr2 = (boolean[]) obj2;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    ((cp7) obj).run();
                    return;
                }
                return;
        }
    }

    public j8(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.d = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public j8(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, View view, ImageView imageView) {
        this.a = (byte) 4;
        this.d = chatAttachAlertPhotoLayout;
        this.c = view;
        this.b = imageView;
    }
}
