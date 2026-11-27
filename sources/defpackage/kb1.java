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
public final class kb1 extends iu3 {
    public xl0 W;
    public jl0 a0;
    public final vnb b0;
    public final tl0 c0;
    public final qb1 d0;

    public kb1(qb1 qb1Var, Context context, wma wmaVar, int i, x53 x53Var, vnb vnbVar, tl0 tl0Var) {
        super(context, wmaVar, null, i, true, x53Var);
        this.d0 = qb1Var;
        this.b0 = vnbVar;
        this.c0 = tl0Var;
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        qb1 qb1Var = this.d0;
        if ((qb1Var instanceof zb1) && ((zb1) qb1Var).O1) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void f() {
        super.f();
        o24 emojiView = getEmojiView();
        if (emojiView != null) {
            qb1 qb1Var = this.d0;
            if (qb1Var.getEditTextStyle() == 2 || qb1Var.getEditTextStyle() == 3) {
                emojiView.x0 = false;
                emojiView.x2 = false;
                emojiView.setShouldDrawBackground(false);
                if (qb1Var instanceof ub1) {
                    emojiView.setPadding(0, 0, 0, hl.n);
                    emojiView.c = 3;
                }
                emojiView.updateColors();
            }
        }
        if (emojiView != null) {
            emojiView.L2 = true;
            emojiView.setClipToOutline(true);
            emojiView.setOutlineProvider(new yi((byte) 1));
        }
    }

    @Override
    public final void g(Canvas canvas, eu3 eu3Var) {
        float U1;
        Bitmap bitmap;
        ?? r1;
        int i;
        int i2;
        WindowInsets rootWindowInsets;
        eu3 eu3Var2 = eu3Var;
        qb1 qb1Var = this.d0;
        sdb sdbVar = qb1Var.d;
        RectF rectF = qb1Var.z0;
        rectF.set(0.0f, 0.0f, eu3Var2.getWidth(), hl.L(29.0f) + eu3Var2.getHeight());
        int i3 = 0;
        if (qb1Var.h0 != null) {
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
                jl0 c = qb1Var.h0.c(eu3Var2, null, false);
                c.p(dtd.i(this.b0));
                this.a0 = c;
                c.t(hl.L(29.0f), hl.L(29.0f), i, i2, true);
                jl0 jl0Var = this.a0;
                jl0Var.U = true;
                jl0Var.u(hl.L(32.0f));
                jl0 jl0Var2 = this.a0;
                jl0Var2.S.g = 0.4f;
                jl0Var2.n();
            }
            Rect rect = hl.Q;
            rectF.round(rect);
            this.a0.setBounds(rect);
            this.a0.draw(canvas);
        } else if (qb1Var.g()) {
            xl0 xl0Var = this.W;
            if (xl0Var == null) {
                xl0Var = new xl0(this.c0, eu3Var2, 7, false);
                this.W = xl0Var;
            }
            qb1Var.h(xl0Var, canvas, qb1Var.z0, hl.L(29.0f), false, 0.0f, -eu3Var2.getY(), false);
            sdbVar.m = hl.L(29.0f);
            sdbVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, hl.L(29.0f) + ((int) rectF.bottom));
            sdbVar.draw(canvas);
        } else {
            Paint paint = qb1Var.e;
            FrameLayout frameLayout = qb1Var.K;
            if (qb1Var.o0 > 0.0f && qb1Var.u0 != null && qb1Var.s0 != null && (bitmap = qb1Var.r0) != null && !bitmap.isRecycled()) {
                qb1Var.t0.reset();
                qb1Var.t0.postScale(frameLayout.getWidth() / qb1Var.r0.getWidth(), frameLayout.getHeight() / qb1Var.r0.getHeight());
                float f = 0.0f;
                float f2 = 0.0f;
                eu3 eu3Var3 = eu3Var2;
                while (i3 < 8 && eu3Var3 != null) {
                    f += eu3Var3.getX();
                    f2 += eu3Var3.getY();
                    ViewParent parent = eu3Var3.getParent();
                    if (parent instanceof View) {
                        r1 = (View) parent;
                    } else {
                        r1 = 0;
                    }
                    i3++;
                    eu3Var3 = r1;
                }
                qb1Var.t0.postTranslate(-f, -f2);
                qb1Var.s0.setLocalMatrix(qb1Var.t0);
                qb1Var.u0.setAlpha((int) (qb1Var.o0 * 255.0f * 0.95f));
                canvas.drawRoundRect(rectF, 0.0f, 0.0f, qb1Var.u0);
            }
            if (qb1Var.u0 == null) {
                U1 = 128.0f;
            } else {
                U1 = hl.U1(qb1Var.o0, 128, 153) * 0.95f;
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
        qb1 qb1Var = this.d0;
        kb1 kb1Var = qb1Var.f;
        ObjectAnimator objectAnimator = qb1Var.g0;
        if (objectAnimator != null && objectAnimator.isRunning() && i == qb1Var.c0) {
            return false;
        }
        qb1Var.invalidate();
        if (qb1Var.a0) {
            qb1Var.a0 = false;
            if (qb1Var.b0 != i) {
                ObjectAnimator objectAnimator2 = qb1Var.g0;
                if (objectAnimator2 == null || !objectAnimator2.isRunning() || i != qb1Var.c0) {
                    ObjectAnimator objectAnimator3 = qb1Var.g0;
                    if (objectAnimator3 != null) {
                        objectAnimator3.cancel();
                    }
                    kb1Var.getEditText().setScrollY(qb1Var.b0);
                    xt3 editText = kb1Var.getEditText();
                    int i2 = qb1Var.b0;
                    qb1Var.c0 = i;
                    ObjectAnimator ofInt = ObjectAnimator.ofInt(editText, "scrollY", i2, i);
                    qb1Var.g0 = ofInt;
                    ofInt.setDuration(240L);
                    qb1Var.g0.setInterpolator(k43.h);
                    qb1Var.g0.addListener(new jb1(this, (byte) 0));
                    qb1Var.g0.start();
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
