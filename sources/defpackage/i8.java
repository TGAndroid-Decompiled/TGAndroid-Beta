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
public final class i8 extends AnimatorListenerAdapter {
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;

    public i8(yh4 yh4Var, View view) {
        this.a = (byte) 5;
        this.d = yh4Var;
        this.c = view;
        this.b = new o1(this, (byte) 29);
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 6:
                e34 e34Var = (e34) this.d;
                if (animator.equals(e34Var.N0)) {
                    e34Var.N0 = null;
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
                    s09 s09Var = ((a8) view).c;
                    if (s09Var.getAnimatedDrawable() != null) {
                        s09Var.getAnimatedDrawable().start();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                rs0 rs0Var = (rs0) obj3;
                a aVar = (a) ((eq) obj2).e;
                if (aVar != null) {
                    aVar.setAlpha(1.0f);
                }
                rs0Var.d.setLayerType(0, null);
                rs0Var.w = false;
                rs0Var.s = null;
                rs0Var.y = null;
                rs0Var.n0(1.0f);
                ((Runnable) obj).run();
                return;
            case 2:
                fz0 fz0Var = (fz0) obj3;
                cz0 cz0Var = (cz0) obj;
                wy0 wy0Var = (wy0) obj2;
                ViewGroup viewGroup = wy0Var.b;
                if (viewGroup == null) {
                    viewGroup = wy0Var.c;
                }
                if (viewGroup != null && wy0Var.m == null && (i = wy0Var.g) > 0 && (i2 = wy0Var.h) > 0) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        fz0.g(viewGroup, -wy0Var.i, new x0(wy0Var, cz0Var, (byte) 10));
                        fz0Var.b = null;
                        fz0Var.invalidate();
                        return;
                    }
                    wy0Var.m = Bitmap.createBitmap(i, i2, Bitmap.Config.RGB_565);
                    Canvas canvas = new Canvas(wy0Var.m);
                    canvas.translate(0.0f, -wy0Var.i);
                    viewGroup.draw(canvas);
                }
                cz0Var.mo21d().setDrawingFromOverlay(false);
                cz0Var.release();
                fz0Var.b = null;
                fz0Var.invalidate();
                return;
            case 3:
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
                chatActivityEnterView.q2();
                eq0 eq0Var = chatActivityEnterView.m0;
                if (eq0Var != null) {
                    eq0Var.setAlpha(0.0f);
                    chatActivityEnterView.m0.setScaleX(0.0f);
                    chatActivityEnterView.m0.setScaleY(0.0f);
                }
                if (chatActivityEnterView.E2 != null && chatActivityEnterView.Q && !chatActivityEnterView.P && oc7.d1().getInt("voiceoncehint", 0) < 3) {
                    chatActivityEnterView.E2.h();
                    return;
                }
                return;
            case 4:
                ((ChatAttachAlertPhotoLayout) obj3).U = false;
                ((View) obj).setVisibility(4);
                ((ImageView) obj2).sendAccessibilityEvent(8);
                return;
            case 5:
                if (((yh4) obj3).a) {
                    ((View) obj).postDelayed((o1) obj2, 300L);
                    return;
                }
                return;
            case 6:
                r59 r59Var = (r59) obj;
                q55 q55Var = (q55) obj2;
                e34 e34Var = (e34) obj3;
                if (animator.equals(e34Var.N0)) {
                    int K0 = q55Var.K0();
                    r59Var.setTranslationY(0.0f);
                    if (r59Var == e34Var.E0) {
                        r59Var.setPadding(0, gm.L(36.0f), 0, gm.L(44.0f) + e34Var.q2);
                    } else if (r59Var == e34Var.i0) {
                        r59Var.setPadding(0, e34Var.c1, 0, gm.L(44.0f) + e34Var.q2);
                    } else if (r59Var == e34Var.Q) {
                        r59Var.setPadding(gm.L(5.0f), gm.L(36.0f), gm.L(5.0f), gm.L(44.0f) + e34Var.q2);
                    }
                    if (K0 != -1) {
                        q55Var.g1(K0, 0);
                    }
                    e34Var.N0 = null;
                    return;
                }
                return;
            case 7:
                jb5 jb5Var = (jb5) obj3;
                jb5Var.O0 = null;
                ((ha5) obj2).F = false;
                ha5 ha5Var = jb5Var.F;
                if (ha5Var != null) {
                    if (ha5Var.getParent() != null) {
                        jb5Var.removeView(jb5Var.F);
                        ((ha5) obj).e();
                    }
                    jb5Var.F = null;
                    return;
                }
                return;
            case 8:
                yt5 yt5Var = (yt5) obj2;
                yt5Var.setProgress(0.0f);
                yt5Var.invalidate();
                gm.B2(yt5Var);
                ViewTreeObserver viewTreeObserver = ((ViewGroup) obj).getViewTreeObserver();
                bu5 bu5Var = (bu5) obj3;
                View view2 = bu5Var.f;
                viewTreeObserver.removeOnPreDrawListener(bu5Var.y);
                if (bu5Var.S) {
                    if (view2 instanceof au5) {
                        ((au5) view2).setScrimHidden(false);
                    } else {
                        view2.setVisibility(0);
                    }
                    if (view2 instanceof ox4) {
                        ox4 ox4Var = (ox4) view2;
                        FrameLayout frameLayout = ox4Var.d;
                        frameLayout.invalidate();
                        frameLayout.invalidateDrawable(ox4Var.e);
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
                vob vobVar = launchActivity.n0;
                vobVar.c = null;
                vobVar.a.setShader(null);
                vobVar.n = null;
                vobVar.r = null;
                launchActivity.n0.setVisibility(8);
                launchActivity.o0.setVisibility(8);
                s09 s09Var2 = (s09) obj2;
                if (s09Var2 != null) {
                    s09Var2.setImageDrawable((p09) obj);
                }
                nm7.e().k(272, new Object[0]);
                if (s09Var2 != null) {
                    s09Var2.setVisibility(0);
                }
                nk3.E4 = false;
                return;
            case 10:
                m4b m4bVar = (m4b) obj;
                a58 a58Var = ((f48) obj3).a;
                a58Var.k3 = false;
                a58Var.l3 = 1.0f;
                a58Var.invalidate();
                boolean[] zArr = (boolean[]) obj2;
                if (!zArr[0]) {
                    zArr[0] = true;
                    a58Var.g3 = true;
                    try {
                        a58Var.performHapticFeedback(3);
                    } catch (Exception unused) {
                    }
                }
                m4bVar.setAllowDrawReaction(true);
                m4bVar.r = true;
                ImageReceiver imageReceiver = m4bVar.e;
                if (imageReceiver.y() != null) {
                    imageReceiver.y().I(0, false, true);
                }
                vm vmVar = a58Var.e3;
                if (vmVar != null) {
                    vmVar.o(a58Var);
                    a58Var.e3 = null;
                    return;
                }
                return;
            default:
                vz9 vz9Var = (vz9) obj3;
                vz9Var.t1 = null;
                vz9Var.invalidate();
                boolean[] zArr2 = (boolean[]) obj2;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    ((hz7) obj).run();
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
        this.a = (byte) 4;
        this.d = chatAttachAlertPhotoLayout;
        this.c = view;
        this.b = imageView;
    }
}
