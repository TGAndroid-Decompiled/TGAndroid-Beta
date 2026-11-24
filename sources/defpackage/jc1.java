package defpackage;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.widget.FrameLayout;
public final class jc1 extends cv3 {
    public wm0 W;
    public im0 a0;
    public final ylb b0;
    public final sm0 c0;
    public final pc1 d0;

    public jc1(pc1 pc1Var, Context context, ela elaVar, int i, r63 r63Var, ylb ylbVar, sm0 sm0Var) {
        super(context, elaVar, null, i, true, r63Var);
        this.d0 = pc1Var;
        this.b0 = ylbVar;
        this.c0 = sm0Var;
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        pc1 pc1Var = this.d0;
        if ((pc1Var instanceof yc1) && ((yc1) pc1Var).O1) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void f() {
        super.f();
        e34 emojiView = getEmojiView();
        if (emojiView != null) {
            pc1 pc1Var = this.d0;
            if (pc1Var.getEditTextStyle() == 2 || pc1Var.getEditTextStyle() == 3) {
                emojiView.x0 = false;
                emojiView.x2 = false;
                emojiView.setShouldDrawBackground(false);
                if (pc1Var instanceof tc1) {
                    emojiView.setPadding(0, 0, 0, gm.n);
                    emojiView.c = 3;
                }
                emojiView.updateColors();
            }
        }
        if (emojiView != null) {
            emojiView.L2 = true;
            emojiView.setClipToOutline(true);
            emojiView.setOutlineProvider(new xj((byte) 1));
        }
    }

    @Override
    public final void g(Canvas canvas, xu3 xu3Var) {
        float U1;
        Bitmap bitmap;
        ?? r1;
        int i;
        int i2;
        WindowInsets rootWindowInsets;
        xu3 xu3Var2 = xu3Var;
        pc1 pc1Var = this.d0;
        wbb wbbVar = pc1Var.d;
        RectF rectF = pc1Var.z0;
        rectF.set(0.0f, 0.0f, xu3Var2.getWidth(), gm.L(29.0f) + xu3Var2.getHeight());
        int i3 = 0;
        if (pc1Var.h0 != null) {
            if (this.a0 == null) {
                if (Build.VERSION.SDK_INT >= 31 && (rootWindowInsets = getRootWindowInsets()) != null) {
                    RoundedCorner roundedCorner = rootWindowInsets.getRoundedCorner(3);
                    RoundedCorner roundedCorner2 = rootWindowInsets.getRoundedCorner(2);
                    if (roundedCorner == null) {
                        i2 = 0;
                    } else {
                        i2 = roundedCorner.getRadius();
                    }
                    if (roundedCorner2 == null) {
                        i = 0;
                    } else {
                        i = roundedCorner2.getRadius();
                    }
                } else {
                    i = 0;
                    i2 = 0;
                }
                im0 c = pc1Var.h0.c(xu3Var2, null, false);
                c.p(qqd.i(this.b0));
                this.a0 = c;
                c.t(gm.L(29.0f), gm.L(29.0f), i, i2, true);
                im0 im0Var = this.a0;
                im0Var.U = true;
                im0Var.u(gm.L(32.0f));
                im0 im0Var2 = this.a0;
                im0Var2.S.g = 0.4f;
                im0Var2.n();
            }
            Rect rect = gm.Q;
            rectF.round(rect);
            this.a0.setBounds(rect);
            this.a0.draw(canvas);
        } else if (pc1Var.g()) {
            wm0 wm0Var = this.W;
            if (wm0Var == null) {
                wm0Var = new wm0(this.c0, xu3Var2, 7, false);
                this.W = wm0Var;
            }
            pc1Var.h(wm0Var, canvas, pc1Var.z0, gm.L(29.0f), false, 0.0f, -xu3Var2.getY(), false);
            wbbVar.m = gm.L(29.0f);
            wbbVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, gm.L(29.0f) + ((int) rectF.bottom));
            wbbVar.draw(canvas);
        } else {
            Paint paint = pc1Var.e;
            FrameLayout frameLayout = pc1Var.K;
            if (pc1Var.o0 > 0.0f && pc1Var.u0 != null && pc1Var.s0 != null && (bitmap = pc1Var.r0) != null && !bitmap.isRecycled()) {
                pc1Var.t0.reset();
                pc1Var.t0.postScale(frameLayout.getWidth() / pc1Var.r0.getWidth(), frameLayout.getHeight() / pc1Var.r0.getHeight());
                float f = 0.0f;
                float f2 = 0.0f;
                xu3 xu3Var3 = xu3Var2;
                while (i3 < 8 && xu3Var3 != null) {
                    f += xu3Var3.getX();
                    f2 += xu3Var3.getY();
                    ViewParent parent = xu3Var3.getParent();
                    if (parent instanceof View) {
                        r1 = (View) parent;
                    } else {
                        r1 = 0;
                    }
                    i3++;
                    xu3Var3 = r1;
                }
                pc1Var.t0.postTranslate(-f, -f2);
                pc1Var.s0.setLocalMatrix(pc1Var.t0);
                pc1Var.u0.setAlpha((int) (pc1Var.o0 * 255.0f * 0.95f));
                canvas.drawRoundRect(rectF, 0.0f, 0.0f, pc1Var.u0);
            }
            if (pc1Var.u0 == null) {
                U1 = 128.0f;
            } else {
                U1 = gm.U1(pc1Var.o0, 128, 153) * 0.95f;
            }
            paint.setAlpha((int) U1);
            canvas.drawRoundRect(rectF, 0.0f, 0.0f, paint);
        }
    }

    @Override
    public final void p() {
        this.d0.M.a();
    }

    @Override
    public final void q(int i, int i2) {
        this.d0.s(i, i2);
    }

    @Override
    public final boolean t(int i) {
        pc1 pc1Var = this.d0;
        jc1 jc1Var = pc1Var.f;
        ObjectAnimator objectAnimator = pc1Var.g0;
        if (objectAnimator != null && objectAnimator.isRunning() && i == pc1Var.c0) {
            return false;
        }
        pc1Var.invalidate();
        if (pc1Var.a0) {
            pc1Var.a0 = false;
            if (pc1Var.b0 != i) {
                ObjectAnimator objectAnimator2 = pc1Var.g0;
                if (objectAnimator2 == null || !objectAnimator2.isRunning() || i != pc1Var.c0) {
                    ObjectAnimator objectAnimator3 = pc1Var.g0;
                    if (objectAnimator3 != null) {
                        objectAnimator3.cancel();
                    }
                    jc1Var.getEditText().setScrollY(pc1Var.b0);
                    qu3 editText = jc1Var.getEditText();
                    int i2 = pc1Var.b0;
                    pc1Var.c0 = i;
                    ObjectAnimator ofInt = ObjectAnimator.ofInt(editText, "scrollY", i2, i);
                    pc1Var.g0 = ofInt;
                    ofInt.setDuration(240L);
                    pc1Var.g0.setInterpolator(d53.h);
                    pc1Var.g0.addListener(new b91(this, (byte) 2));
                    pc1Var.g0.start();
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    @Override
    public final void u() {
        this.d0.M.e = true;
    }

    @Override
    public final void y() {
        this.d0.M.a();
    }
}
