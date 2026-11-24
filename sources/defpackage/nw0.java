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
public final class nw0 extends cja implements wx0 {
    public final Paint m0;
    public boolean n0;
    public final RectF o0;
    public final Path p0;
    public final ow0 q0;

    public nw0(ow0 ow0Var, Context context) {
        super(context, null);
        this.q0 = ow0Var;
        setClipChildren(false);
        setClipToPadding(false);
        setWillNotDraw(false);
        this.m0 = new Paint(1);
        this.o0 = new RectF();
        this.p0 = new Path();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(bkb.c6));
        hashSet.add(Integer.valueOf(bkb.Z6));
        hashSet.add(Integer.valueOf(bkb.F6));
        hashSet.add(Integer.valueOf(bkb.t8));
        hashSet.add(Integer.valueOf(bkb.F8));
        hashSet.add(Integer.valueOf(bkb.D8));
        hashSet.add(Integer.valueOf(bkb.E8));
        hashSet.add(Integer.valueOf(bkb.H5));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z;
        Paint paint;
        float f;
        ow0 ow0Var = this.q0;
        yv7 yv7Var = ow0Var.u0;
        Rect rect = ow0Var.n;
        Rect rect2 = ow0Var.h;
        if (!this.n0) {
            int visibility = yv7Var.getVisibility();
            Paint paint2 = this.m0;
            if (visibility != 0) {
                float f2 = ow0Var.h0;
                if (f2 < 1.0f && f2 > 0.0f) {
                    paint2.setColor(bkb.p1(ow0Var.S0, ow0Var.T));
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
            if (ow0Var.w != null && !gl.O1()) {
                canvas.save();
                canvas.translate((1.0f - ow0Var.h0) * rect.left, 0.0f);
                gl2 gl2Var = ow0Var.w;
                int U1 = gl.U1(ow0Var.h0, (getWidth() - rect.left) - rect.right, getWidth());
                getHeight();
                gl2Var.m(canvas, true, false, U1, 1.0f - ow0Var.h0);
                canvas.translate((1.0f - ow0Var.h0) * (-rect.left), 0.0f);
                z = true;
            } else {
                z = false;
            }
            super.dispatchDraw(canvas);
            if (z) {
                canvas.restore();
            }
            if (yv7Var.getVisibility() != 0) {
                paint2.setColor(bkb.p1(ow0Var.S0, ow0Var.T));
                int i2 = rect2.left;
                if (i2 > 0) {
                    paint = paint2;
                    canvas.drawRect(0.0f, 0.0f, (1.0f - ow0Var.h0) * i2, getHeight(), paint);
                } else {
                    paint = paint2;
                }
                if (rect2.top > 0) {
                    canvas.drawRect(0.0f, 0.0f, getWidth(), (1.0f - ow0Var.h0) * rect2.top, paint);
                }
                if (rect2.bottom > 0) {
                    float height = getHeight();
                    float f3 = rect2.bottom;
                    kw0 kw0Var = ow0Var.n0;
                    if (kw0Var != null && kw0Var.getTotalHeight() > 0) {
                        f = 1.0f;
                    } else {
                        f = 1.0f - ow0Var.h0;
                    }
                    canvas.drawRect(0.0f, height - (f3 * f), getWidth(), getHeight(), paint);
                }
                if (rect2.right > 0) {
                    canvas.drawRect(ls6.B(1.0f, ow0Var.h0, rect2.right, getWidth()), 0.0f, getWidth(), getHeight(), paint);
                }
            }
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        qx0 qx0Var;
        ow0 ow0Var = this.q0;
        Rect rect = ow0Var.n;
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (launchActivity != null) {
            qx0Var = launchActivity.O();
        } else {
            qx0Var = null;
        }
        if (qx0Var != null && rect != null) {
            int i = (int) ((1.0f - ow0Var.h0) * ((int) qx0Var.H));
            if (motionEvent.getY() >= (getHeight() - rect.bottom) - i && motionEvent.getY() <= getHeight() - rect.bottom && !gl.O1()) {
                return qx0Var.j(motionEvent.getX(), motionEvent.getY() - ((getHeight() - rect.bottom) - i), motionEvent.getAction());
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void draw(Canvas canvas) {
        float f;
        float R1;
        ow0 ow0Var = this.q0;
        Rect rect = ow0Var.n;
        Paint paint = ow0Var.P;
        lw0 lw0Var = ow0Var.Y;
        Drawable drawable = ow0Var.a0;
        if (this.n0) {
            return;
        }
        super.draw(canvas);
        if (gl.O1()) {
            f = 0.0f;
        } else {
            f = ow0Var.c;
        }
        paint.setColor(ow0Var.a);
        paint.setAlpha((int) ((1.0f - ow0Var.h0) * (1.0f - (Math.min(0.5f, f) / 0.5f)) * paint.getAlpha()));
        canvas.save();
        float f2 = 1.0f - f;
        boolean O1 = gl.O1();
        fw0 fw0Var = ow0Var.x;
        if (O1) {
            R1 = gl.R1(fw0Var.getTranslationY() + gl.L(12.0f), gl.m / 2.0f, ow0Var.c);
        } else {
            R1 = gl.R1(fw0Var.getTranslationY(), (a.getCurrentActionBarHeight() / 2.0f) + gl.m, f) + gl.L(12.0f);
        }
        canvas.scale(f2, f2, getWidth() / 2.0f, R1);
        canvas.drawLine((getWidth() / 2.0f) - gl.L(16.0f), R1, (getWidth() / 2.0f) + gl.L(16.0f), R1, paint);
        canvas.restore();
        drawable.setAlpha((int) (lw0Var.getAlpha() * 255.0f));
        float translationY = lw0Var.getTranslationY() + lw0Var.getY() + lw0Var.getHeight();
        drawable.setBounds(rect.left, (int) translationY, getWidth() - rect.right, (int) (translationY + drawable.getIntrinsicHeight()));
        drawable.draw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        boolean z;
        ow0 ow0Var = this.q0;
        if (view == ow0Var.x && ow0Var.j0 && ow0Var.l0 > 0 && ow0Var.k0 > 0) {
            canvas.save();
            canvas.clipRect(view.getX(), view.getY(), view.getX() + gl.U1(ow0Var.i0, ow0Var.k0, view.getWidth()), view.getY() + gl.U1(ow0Var.i0, ow0Var.l0, view.getHeight()));
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
        fw0 fw0Var = this.q0.x;
        RectF rectF = this.o0;
        rectF.set(fw0Var.getLeft(), fw0Var.getTranslationY() + gl.L(24.0f), fw0Var.getRight(), getHeight());
        return rectF;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setTag(2131296353, new oy((byte) 2));
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
        ow0 ow0Var = this.q0;
        Paint paint = ow0Var.V;
        Paint paint2 = ow0Var.R;
        fw0 fw0Var = ow0Var.x;
        if (!this.n0) {
            super.onDraw(canvas);
            if (ow0Var.u0.getVisibility() != 0) {
                canvas.save();
                gl2 gl2Var = ow0Var.w;
                float f = 1.0f;
                if (gl2Var != null) {
                    int width = getWidth();
                    getHeight();
                    canvas2 = canvas;
                    gl2Var.m(canvas2, false, false, width, 1.0f - ow0Var.h0);
                } else {
                    canvas2 = canvas;
                }
                if (!ow0Var.X) {
                    int v0 = bkb.v0(bkb.c6, ow0Var.G);
                    paint2.setColor(v0);
                    ow0Var.E.setFlickerViewColor(v0);
                    cw cwVar = ow0Var.Z0;
                    if (cwVar != null) {
                        if (gl.B(paint2.getColor()) <= 0.721f) {
                            z = true;
                        } else {
                            z = false;
                        }
                        cwVar.b(z, false);
                        ow0Var.Z0.setBackgroundColor(paint2.getColor());
                    }
                }
                RectF rectF = gl.P;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                canvas2.drawRect(rectF, ow0Var.Q);
                qx0 qx0Var = ow0Var.s;
                if (qx0Var != null) {
                    i = (int) qx0Var.H;
                } else {
                    i = 0;
                }
                paint.setColor(ow0Var.S);
                float L = gl.L(16.0f);
                if (!gl.O1()) {
                    f = 1.0f - ow0Var.c;
                }
                float f2 = L * f;
                rectF.set(gl.U1(ow0Var.h0, fw0Var.getLeft(), 0), gl.R1(fw0Var.getTranslationY(), 0.0f, ow0Var.c), fw0Var.getRight(), fw0Var.getTranslationY() + gl.L(24.0f) + f2);
                canvas2.drawRoundRect(rectF, f2, f2, paint);
                int left = fw0Var.getLeft();
                rectF.set(gl.U1(ow0Var.h0, left, 0), fw0Var.getTranslationY() + gl.L(24.0f), gl.U1(ow0Var.h0, fw0Var.getRight(), getWidth()), getHeight() - i);
                canvas2.drawRect(rectF, paint2);
                canvas2.restore();
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ow0 ow0Var = this.q0;
        fw0 fw0Var = ow0Var.x;
        if (motionEvent.getAction() == 0 && (motionEvent.getY() <= gl.R1(fw0Var.getTranslationY() + gl.L(24.0f), 0.0f, ow0Var.c) || motionEvent.getX() > fw0Var.getRight() || motionEvent.getX() < fw0Var.getLeft())) {
            ow0Var.m(true);
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public void setDrawingFromOverlay(boolean z) {
        if (this.n0 != z) {
            this.n0 = z;
            invalidate();
            ow0 ow0Var = this.q0;
            ow0Var.L();
            LaunchActivity launchActivity = LaunchActivity.H1;
            if (launchActivity != null && ow0Var.f0) {
                launchActivity.D0(ow0Var.T);
            }
        }
    }

    @Override
    public final void updateColors() {
        int v0;
        ow0 ow0Var = this.q0;
        Paint paint = ow0Var.R;
        nw0 nw0Var = ow0Var.f;
        lw0 lw0Var = ow0Var.Y;
        wjb wjbVar = ow0Var.G;
        if (lw0Var != null && nw0Var != null) {
            try {
                if (ow0Var.E != null && paint != null) {
                    if (!ow0Var.W) {
                        int i = ow0Var.w0;
                        if (i < 0) {
                            i = bkb.c6;
                        }
                        int v02 = bkb.v0(i, wjbVar);
                        int i2 = ow0Var.S;
                        if (v02 != i2) {
                            ow0Var.S = v02;
                            if ((lw0Var.getBackground() instanceof ColorDrawable) && ((ColorDrawable) lw0Var.getBackground()).getColor() == i2) {
                                lw0Var.setBackgroundColor(ow0Var.S);
                            }
                        }
                    }
                    if (ow0Var.J0 && ow0Var.n0 != null && (v0 = bkb.v0(bkb.Z6, wjbVar)) != ow0Var.T) {
                        ow0Var.D(v0, false);
                        ow0Var.J0 = true;
                    }
                    if (ow0Var.a == ow0Var.b) {
                        int w0 = bkb.w0(null, bkb.yj, false);
                        ow0Var.b = w0;
                        ow0Var.a = w0;
                    }
                    int color = paint.getColor();
                    if (!ow0Var.W) {
                        color = (((((((((((color * 31) + bkb.v0(bkb.F6, wjbVar)) * 31) + bkb.v0(bkb.t8, wjbVar)) * 31) + bkb.v0(bkb.F8, wjbVar)) * 31) + bkb.v0(bkb.D8, wjbVar)) * 31) + bkb.v0(bkb.E8, wjbVar)) * 31) + bkb.v0(bkb.H5, wjbVar);
                    }
                    if (!ow0Var.K0 || color != ow0Var.L0) {
                        ow0Var.K0 = true;
                        ow0Var.L0 = color;
                        ow0Var.F();
                    }
                    ow0Var.J();
                    nw0Var.invalidate();
                }
            } catch (Exception e) {
                fa4.g(e, true);
            }
        }
    }

    @Override
    public final float y(Canvas canvas, RectF rectF, float f, RectF rectF2, float f2) {
        ow0 ow0Var = this.q0;
        fw0 fw0Var = ow0Var.x;
        RectF rectF3 = this.o0;
        rectF3.set(fw0Var.getLeft(), fw0Var.getTranslationY() + gl.L(24.0f), fw0Var.getRight(), getHeight());
        gl.a2(rectF3, rectF, f, rectF2);
        canvas.save();
        Path path = this.p0;
        path.rewind();
        float L = gl.L(16.0f);
        float f3 = 1.0f;
        if (!gl.O1()) {
            f3 = 1.0f - ow0Var.c;
        }
        float R1 = gl.R1(L * f3, gl.L(18.0f), f);
        path.addRoundRect(rectF2, R1, R1, Path.Direction.CW);
        canvas.clipPath(path);
        canvas.drawPaint(ow0Var.R);
        if (fw0Var != null) {
            canvas.save();
            canvas.translate(rectF2.left, (f * gl.L(51.0f)) + Math.max(fw0Var.getY(), rectF2.top));
            fw0Var.draw(canvas);
            canvas.restore();
        }
        canvas.restore();
        return R1;
    }
}
