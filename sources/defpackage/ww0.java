package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import java.util.HashSet;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.LaunchActivity;
public final class ww0 extends wma implements ey0 {
    public final Paint g0;
    public boolean h0;
    public final RectF i0;
    public final Path j0;
    public final xw0 k0;

    public ww0(xw0 xw0Var, Context context) {
        super(context, null);
        this.k0 = xw0Var;
        setClipChildren(false);
        setClipToPadding(false);
        setWillNotDraw(false);
        this.g0 = new Paint(1);
        this.i0 = new RectF();
        this.j0 = new Path();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(aob.d6));
        hashSet.add(Integer.valueOf(aob.a7));
        hashSet.add(Integer.valueOf(aob.G6));
        hashSet.add(Integer.valueOf(aob.u8));
        hashSet.add(Integer.valueOf(aob.G8));
        hashSet.add(Integer.valueOf(aob.E8));
        hashSet.add(Integer.valueOf(aob.F8));
        hashSet.add(Integer.valueOf(aob.I5));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z;
        Paint paint;
        float f;
        xw0 xw0Var = this.k0;
        fz7 fz7Var = xw0Var.u0;
        Rect rect = xw0Var.n;
        Rect rect2 = xw0Var.h;
        if (!this.h0) {
            int visibility = fz7Var.getVisibility();
            Paint paint2 = this.g0;
            if (visibility != 0) {
                float f2 = xw0Var.h0;
                if (f2 < 1.0f && f2 > 0.0f) {
                    paint2.setColor(aob.p1(xw0Var.S0, xw0Var.T));
                    int i = rect2.left;
                    if (i > 0) {
                        canvas.drawRect(0.0f, 0.0f, i, getHeight(), paint2);
                    }
                    if (rect2.top > 0) {
                        canvas.drawRect(0.0f, 0.0f, getWidth(), rect2.top, paint2);
                    }
                    if (rect2.bottom > 0) {
                        canvas.drawRect(0.0f, getHeight() - rect2.bottom, getWidth(), getHeight(), paint2);
                    }
                    if (rect2.right > 0) {
                        canvas.drawRect(getWidth() - rect2.right, 0.0f, getWidth(), getHeight(), paint2);
                    }
                }
            }
            if (xw0Var.w != null && !hl.O1()) {
                canvas.save();
                canvas.translate((1.0f - xw0Var.h0) * rect.left, 0.0f);
                am2 am2Var = xw0Var.w;
                int U1 = hl.U1(xw0Var.h0, (getWidth() - rect.left) - rect.right, getWidth());
                getHeight();
                am2Var.u(canvas, true, false, U1, 1.0f - xw0Var.h0);
                canvas.translate((1.0f - xw0Var.h0) * (-rect.left), 0.0f);
                z = true;
            } else {
                z = false;
            }
            super.dispatchDraw(canvas);
            if (z) {
                canvas.restore();
            }
            if (fz7Var.getVisibility() != 0) {
                paint2.setColor(aob.p1(xw0Var.S0, xw0Var.T));
                int i2 = rect2.left;
                if (i2 > 0) {
                    paint = paint2;
                    canvas.drawRect(0.0f, 0.0f, (1.0f - xw0Var.h0) * i2, getHeight(), paint);
                } else {
                    paint = paint2;
                }
                if (rect2.top > 0) {
                    canvas.drawRect(0.0f, 0.0f, getWidth(), (1.0f - xw0Var.h0) * rect2.top, paint);
                }
                if (rect2.bottom > 0) {
                    float height = getHeight();
                    float f3 = rect2.bottom;
                    tw0 tw0Var = xw0Var.n0;
                    if (tw0Var != null && tw0Var.getTotalHeight() > 0) {
                        f = 1.0f;
                    } else {
                        f = 1.0f - xw0Var.h0;
                    }
                    canvas.drawRect(0.0f, height - (f3 * f), getWidth(), getHeight(), paint);
                }
                if (rect2.right > 0) {
                    canvas.drawRect(qu6.B(1.0f, xw0Var.h0, rect2.right, getWidth()), 0.0f, getWidth(), getHeight(), paint);
                }
            }
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        yx0 yx0Var;
        xw0 xw0Var = this.k0;
        Rect rect = xw0Var.n;
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (launchActivity != null) {
            yx0Var = launchActivity.O();
        } else {
            yx0Var = null;
        }
        if (yx0Var != null && rect != null) {
            int i = (int) ((1.0f - xw0Var.h0) * ((int) yx0Var.H));
            if (motionEvent.getY() >= (getHeight() - rect.bottom) - i && motionEvent.getY() <= getHeight() - rect.bottom && !hl.O1()) {
                return yx0Var.j(motionEvent.getX(), motionEvent.getY() - ((getHeight() - rect.bottom) - i), motionEvent.getAction());
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void draw(Canvas canvas) {
        float f;
        float R1;
        xw0 xw0Var = this.k0;
        Rect rect = xw0Var.n;
        Paint paint = xw0Var.P;
        uw0 uw0Var = xw0Var.Y;
        Drawable drawable = xw0Var.a0;
        if (this.h0) {
            return;
        }
        super.draw(canvas);
        if (hl.O1()) {
            f = 0.0f;
        } else {
            f = xw0Var.c;
        }
        paint.setColor(xw0Var.a);
        paint.setAlpha((int) ((1.0f - xw0Var.h0) * (1.0f - (Math.min(0.5f, f) / 0.5f)) * paint.getAlpha()));
        canvas.save();
        float f2 = 1.0f - f;
        boolean O1 = hl.O1();
        ow0 ow0Var = xw0Var.x;
        if (O1) {
            R1 = hl.R1(ow0Var.getTranslationY() + hl.L(12.0f), hl.m / 2.0f, xw0Var.c);
        } else {
            R1 = hl.R1(ow0Var.getTranslationY(), (a.getCurrentActionBarHeight() / 2.0f) + hl.m, f) + hl.L(12.0f);
        }
        canvas.scale(f2, f2, getWidth() / 2.0f, R1);
        canvas.drawLine((getWidth() / 2.0f) - hl.L(16.0f), R1, (getWidth() / 2.0f) + hl.L(16.0f), R1, paint);
        canvas.restore();
        drawable.setAlpha((int) (uw0Var.getAlpha() * 255.0f));
        float translationY = uw0Var.getTranslationY() + uw0Var.getY() + uw0Var.getHeight();
        drawable.setBounds(rect.left, (int) translationY, getWidth() - rect.right, (int) (translationY + drawable.getIntrinsicHeight()));
        drawable.draw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        boolean z;
        xw0 xw0Var = this.k0;
        if (view == xw0Var.x && xw0Var.j0 && xw0Var.l0 > 0 && xw0Var.k0 > 0) {
            canvas.save();
            canvas.clipRect(view.getX(), view.getY(), view.getX() + hl.U1(xw0Var.i0, xw0Var.k0, view.getWidth()), view.getY() + hl.U1(xw0Var.i0, xw0Var.l0, view.getHeight()));
            z = true;
        } else {
            z = false;
        }
        boolean drawChild = super.drawChild(canvas, view, j);
        if (z) {
            canvas.restore();
        }
        return drawChild;
    }

    @Override
    public RectF getRect() {
        ow0 ow0Var = this.k0.x;
        RectF rectF = this.i0;
        rectF.set(ow0Var.getLeft(), ow0Var.getTranslationY() + hl.L(24.0f), ow0Var.getRight(), getHeight());
        return rectF;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setTag(2131296353, new py((byte) 2));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setTag(2131296353, null);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        int i;
        boolean z;
        xw0 xw0Var = this.k0;
        Paint paint = xw0Var.V;
        Paint paint2 = xw0Var.R;
        ow0 ow0Var = xw0Var.x;
        if (!this.h0) {
            super.onDraw(canvas);
            if (xw0Var.u0.getVisibility() != 0) {
                canvas.save();
                am2 am2Var = xw0Var.w;
                float f = 1.0f;
                if (am2Var != null) {
                    int width = getWidth();
                    getHeight();
                    canvas2 = canvas;
                    am2Var.u(canvas2, false, false, width, 1.0f - xw0Var.h0);
                } else {
                    canvas2 = canvas;
                }
                if (!xw0Var.X) {
                    int v0 = aob.v0(aob.d6, xw0Var.G);
                    paint2.setColor(v0);
                    xw0Var.E.setFlickerViewColor(v0);
                    dw dwVar = xw0Var.Z0;
                    if (dwVar != null) {
                        if (hl.B(paint2.getColor()) <= 0.721f) {
                            z = true;
                        } else {
                            z = false;
                        }
                        dwVar.b(z, false);
                        xw0Var.Z0.setBackgroundColor(paint2.getColor());
                    }
                }
                RectF rectF = hl.P;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                canvas2.drawRect(rectF, xw0Var.Q);
                yx0 yx0Var = xw0Var.s;
                if (yx0Var != null) {
                    i = (int) yx0Var.H;
                } else {
                    i = 0;
                }
                paint.setColor(xw0Var.S);
                float L = hl.L(16.0f);
                if (!hl.O1()) {
                    f = 1.0f - xw0Var.c;
                }
                float f2 = L * f;
                rectF.set(hl.U1(xw0Var.h0, ow0Var.getLeft(), 0), hl.R1(ow0Var.getTranslationY(), 0.0f, xw0Var.c), ow0Var.getRight(), ow0Var.getTranslationY() + hl.L(24.0f) + f2);
                canvas2.drawRoundRect(rectF, f2, f2, paint);
                int left = ow0Var.getLeft();
                rectF.set(hl.U1(xw0Var.h0, left, 0), ow0Var.getTranslationY() + hl.L(24.0f), hl.U1(xw0Var.h0, ow0Var.getRight(), getWidth()), getHeight() - i);
                canvas2.drawRect(rectF, paint2);
                canvas2.restore();
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        xw0 xw0Var = this.k0;
        ow0 ow0Var = xw0Var.x;
        if (motionEvent.getAction() == 0 && (motionEvent.getY() <= hl.R1(ow0Var.getTranslationY() + hl.L(24.0f), 0.0f, xw0Var.c) || motionEvent.getX() > ow0Var.getRight() || motionEvent.getX() < ow0Var.getLeft())) {
            xw0Var.m(true);
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public void setDrawingFromOverlay(boolean z) {
        if (this.h0 != z) {
            this.h0 = z;
            invalidate();
            xw0 xw0Var = this.k0;
            xw0Var.L();
            LaunchActivity launchActivity = LaunchActivity.H1;
            if (launchActivity != null && xw0Var.f0) {
                launchActivity.D0(xw0Var.T);
            }
        }
    }

    @Override
    public final void updateColors() {
        int v0;
        xw0 xw0Var = this.k0;
        Paint paint = xw0Var.R;
        ww0 ww0Var = xw0Var.f;
        uw0 uw0Var = xw0Var.Y;
        vnb vnbVar = xw0Var.G;
        if (uw0Var != null && ww0Var != null) {
            try {
                if (xw0Var.E != null && paint != null) {
                    if (!xw0Var.W) {
                        int i = xw0Var.w0;
                        if (i < 0) {
                            i = aob.d6;
                        }
                        int v02 = aob.v0(i, vnbVar);
                        int i2 = xw0Var.S;
                        if (v02 != i2) {
                            xw0Var.S = v02;
                            if ((uw0Var.getBackground() instanceof ColorDrawable) && ((ColorDrawable) uw0Var.getBackground()).getColor() == i2) {
                                uw0Var.setBackgroundColor(xw0Var.S);
                            }
                        }
                    }
                    if (xw0Var.J0 && xw0Var.n0 != null && (v0 = aob.v0(aob.a7, vnbVar)) != xw0Var.T) {
                        xw0Var.D(v0, false);
                        xw0Var.J0 = true;
                    }
                    if (xw0Var.a == xw0Var.b) {
                        int w0 = aob.w0(null, aob.zj, false);
                        xw0Var.b = w0;
                        xw0Var.a = w0;
                    }
                    int color = paint.getColor();
                    if (!xw0Var.W) {
                        color = (((((((((((color * 31) + aob.v0(aob.G6, vnbVar)) * 31) + aob.v0(aob.u8, vnbVar)) * 31) + aob.v0(aob.G8, vnbVar)) * 31) + aob.v0(aob.E8, vnbVar)) * 31) + aob.v0(aob.F8, vnbVar)) * 31) + aob.v0(aob.I5, vnbVar);
                    }
                    if (!xw0Var.K0 || color != xw0Var.L0) {
                        xw0Var.K0 = true;
                        xw0Var.L0 = color;
                        xw0Var.F();
                    }
                    xw0Var.J();
                    ww0Var.invalidate();
                }
            } catch (Exception e) {
                cc4.g(e, true);
            }
        }
    }

    @Override
    public final float y(Canvas canvas, RectF rectF, float f, RectF rectF2, float f2) {
        xw0 xw0Var = this.k0;
        ow0 ow0Var = xw0Var.x;
        RectF rectF3 = this.i0;
        rectF3.set(ow0Var.getLeft(), ow0Var.getTranslationY() + hl.L(24.0f), ow0Var.getRight(), getHeight());
        hl.a2(rectF3, rectF, f, rectF2);
        canvas.save();
        Path path = this.j0;
        path.rewind();
        float L = hl.L(16.0f);
        float f3 = 1.0f;
        if (!hl.O1()) {
            f3 = 1.0f - xw0Var.c;
        }
        float R1 = hl.R1(L * f3, hl.L(18.0f), f);
        path.addRoundRect(rectF2, R1, R1, Path.Direction.CW);
        canvas.clipPath(path);
        canvas.drawPaint(xw0Var.R);
        if (ow0Var != null) {
            canvas.save();
            canvas.translate(rectF2.left, (f * hl.L(51.0f)) + Math.max(ow0Var.getY(), rectF2.top));
            ow0Var.draw(canvas);
            canvas.restore();
        }
        canvas.restore();
        return R1;
    }
}
