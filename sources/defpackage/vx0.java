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
public final class vx0 extends ela implements dz0 {
    public final Paint m0;
    public boolean n0;
    public final RectF o0;
    public final Path p0;
    public final wx0 q0;

    public vx0(wx0 wx0Var, Context context) {
        super(context, null);
        this.q0 = wx0Var;
        setClipChildren(false);
        setClipToPadding(false);
        setWillNotDraw(false);
        this.m0 = new Paint(1);
        this.o0 = new RectF();
        this.p0 = new Path();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(cmb.c6));
        hashSet.add(Integer.valueOf(cmb.Z6));
        hashSet.add(Integer.valueOf(cmb.F6));
        hashSet.add(Integer.valueOf(cmb.t8));
        hashSet.add(Integer.valueOf(cmb.F8));
        hashSet.add(Integer.valueOf(cmb.D8));
        hashSet.add(Integer.valueOf(cmb.E8));
        hashSet.add(Integer.valueOf(cmb.H5));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z;
        Paint paint;
        float f;
        wx0 wx0Var = this.q0;
        by7 by7Var = wx0Var.u0;
        Rect rect = wx0Var.n;
        Rect rect2 = wx0Var.h;
        if (!this.n0) {
            int visibility = by7Var.getVisibility();
            Paint paint2 = this.m0;
            if (visibility != 0) {
                float f2 = wx0Var.h0;
                if (f2 < 1.0f && f2 > 0.0f) {
                    paint2.setColor(cmb.p1(wx0Var.S0, wx0Var.T));
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
            if (wx0Var.w != null && !gm.O1()) {
                canvas.save();
                canvas.translate((1.0f - wx0Var.h0) * rect.left, 0.0f);
                sm2 sm2Var = wx0Var.w;
                int U1 = gm.U1(wx0Var.h0, (getWidth() - rect.left) - rect.right, getWidth());
                getHeight();
                sm2Var.t(canvas, true, false, U1, 1.0f - wx0Var.h0);
                canvas.translate((1.0f - wx0Var.h0) * (-rect.left), 0.0f);
                z = true;
            } else {
                z = false;
            }
            super.dispatchDraw(canvas);
            if (z) {
                canvas.restore();
            }
            if (by7Var.getVisibility() != 0) {
                paint2.setColor(cmb.p1(wx0Var.S0, wx0Var.T));
                int i2 = rect2.left;
                if (i2 > 0) {
                    paint = paint2;
                    canvas.drawRect(0.0f, 0.0f, (1.0f - wx0Var.h0) * i2, getHeight(), paint);
                } else {
                    paint = paint2;
                }
                if (rect2.top > 0) {
                    canvas.drawRect(0.0f, 0.0f, getWidth(), (1.0f - wx0Var.h0) * rect2.top, paint);
                }
                if (rect2.bottom > 0) {
                    float height = getHeight();
                    float f3 = rect2.bottom;
                    sx0 sx0Var = wx0Var.n0;
                    if (sx0Var != null && sx0Var.getTotalHeight() > 0) {
                        f = 1.0f;
                    } else {
                        f = 1.0f - wx0Var.h0;
                    }
                    canvas.drawRect(0.0f, height - (f3 * f), getWidth(), getHeight(), paint);
                }
                if (rect2.right > 0) {
                    canvas.drawRect(kt6.B(1.0f, wx0Var.h0, rect2.right, getWidth()), 0.0f, getWidth(), getHeight(), paint);
                }
            }
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        xy0 xy0Var;
        wx0 wx0Var = this.q0;
        Rect rect = wx0Var.n;
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (launchActivity != null) {
            xy0Var = launchActivity.O();
        } else {
            xy0Var = null;
        }
        if (xy0Var != null && rect != null) {
            int i = (int) ((1.0f - wx0Var.h0) * ((int) xy0Var.H));
            if (motionEvent.getY() >= (getHeight() - rect.bottom) - i && motionEvent.getY() <= getHeight() - rect.bottom && !gm.O1()) {
                return xy0Var.j(motionEvent.getX(), motionEvent.getY() - ((getHeight() - rect.bottom) - i), motionEvent.getAction());
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void draw(Canvas canvas) {
        float f;
        float R1;
        wx0 wx0Var = this.q0;
        Rect rect = wx0Var.n;
        Paint paint = wx0Var.P;
        tx0 tx0Var = wx0Var.Y;
        Drawable drawable = wx0Var.a0;
        if (this.n0) {
            return;
        }
        super.draw(canvas);
        if (gm.O1()) {
            f = 0.0f;
        } else {
            f = wx0Var.c;
        }
        paint.setColor(wx0Var.a);
        paint.setAlpha((int) ((1.0f - wx0Var.h0) * (1.0f - (Math.min(0.5f, f) / 0.5f)) * paint.getAlpha()));
        canvas.save();
        float f2 = 1.0f - f;
        boolean O1 = gm.O1();
        nx0 nx0Var = wx0Var.x;
        if (O1) {
            R1 = gm.R1(nx0Var.getTranslationY() + gm.L(12.0f), gm.m / 2.0f, wx0Var.c);
        } else {
            R1 = gm.R1(nx0Var.getTranslationY(), (a.getCurrentActionBarHeight() / 2.0f) + gm.m, f) + gm.L(12.0f);
        }
        canvas.scale(f2, f2, getWidth() / 2.0f, R1);
        canvas.drawLine((getWidth() / 2.0f) - gm.L(16.0f), R1, (getWidth() / 2.0f) + gm.L(16.0f), R1, paint);
        canvas.restore();
        drawable.setAlpha((int) (tx0Var.getAlpha() * 255.0f));
        float translationY = tx0Var.getTranslationY() + tx0Var.getY() + tx0Var.getHeight();
        drawable.setBounds(rect.left, (int) translationY, getWidth() - rect.right, (int) (translationY + drawable.getIntrinsicHeight()));
        drawable.draw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        boolean z;
        wx0 wx0Var = this.q0;
        if (view == wx0Var.x && wx0Var.j0 && wx0Var.l0 > 0 && wx0Var.k0 > 0) {
            canvas.save();
            canvas.clipRect(view.getX(), view.getY(), view.getX() + gm.U1(wx0Var.i0, wx0Var.k0, view.getWidth()), view.getY() + gm.U1(wx0Var.i0, wx0Var.l0, view.getHeight()));
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
        nx0 nx0Var = this.q0.x;
        RectF rectF = this.o0;
        rectF.set(nx0Var.getLeft(), nx0Var.getTranslationY() + gm.L(24.0f), nx0Var.getRight(), getHeight());
        return rectF;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setTag(2131296353, new oz((byte) 2));
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
        wx0 wx0Var = this.q0;
        Paint paint = wx0Var.V;
        Paint paint2 = wx0Var.R;
        nx0 nx0Var = wx0Var.x;
        if (!this.n0) {
            super.onDraw(canvas);
            if (wx0Var.u0.getVisibility() != 0) {
                canvas.save();
                sm2 sm2Var = wx0Var.w;
                float f = 1.0f;
                if (sm2Var != null) {
                    int width = getWidth();
                    getHeight();
                    canvas2 = canvas;
                    sm2Var.t(canvas2, false, false, width, 1.0f - wx0Var.h0);
                } else {
                    canvas2 = canvas;
                }
                if (!wx0Var.X) {
                    int v0 = cmb.v0(cmb.c6, wx0Var.G);
                    paint2.setColor(v0);
                    wx0Var.E.setFlickerViewColor(v0);
                    cx cxVar = wx0Var.Z0;
                    if (cxVar != null) {
                        if (gm.B(paint2.getColor()) <= 0.721f) {
                            z = true;
                        } else {
                            z = false;
                        }
                        cxVar.b(z, false);
                        wx0Var.Z0.setBackgroundColor(paint2.getColor());
                    }
                }
                RectF rectF = gm.P;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                canvas2.drawRect(rectF, wx0Var.Q);
                xy0 xy0Var = wx0Var.s;
                if (xy0Var != null) {
                    i = (int) xy0Var.H;
                } else {
                    i = 0;
                }
                paint.setColor(wx0Var.S);
                float L = gm.L(16.0f);
                if (!gm.O1()) {
                    f = 1.0f - wx0Var.c;
                }
                float f2 = L * f;
                rectF.set(gm.U1(wx0Var.h0, nx0Var.getLeft(), 0), gm.R1(nx0Var.getTranslationY(), 0.0f, wx0Var.c), nx0Var.getRight(), nx0Var.getTranslationY() + gm.L(24.0f) + f2);
                canvas2.drawRoundRect(rectF, f2, f2, paint);
                int left = nx0Var.getLeft();
                rectF.set(gm.U1(wx0Var.h0, left, 0), nx0Var.getTranslationY() + gm.L(24.0f), gm.U1(wx0Var.h0, nx0Var.getRight(), getWidth()), getHeight() - i);
                canvas2.drawRect(rectF, paint2);
                canvas2.restore();
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        wx0 wx0Var = this.q0;
        nx0 nx0Var = wx0Var.x;
        if (motionEvent.getAction() == 0 && (motionEvent.getY() <= gm.R1(nx0Var.getTranslationY() + gm.L(24.0f), 0.0f, wx0Var.c) || motionEvent.getX() > nx0Var.getRight() || motionEvent.getX() < nx0Var.getLeft())) {
            wx0Var.m(true);
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public void setDrawingFromOverlay(boolean z) {
        if (this.n0 != z) {
            this.n0 = z;
            invalidate();
            wx0 wx0Var = this.q0;
            wx0Var.L();
            LaunchActivity launchActivity = LaunchActivity.H1;
            if (launchActivity != null && wx0Var.f0) {
                launchActivity.D0(wx0Var.T);
            }
        }
    }

    @Override
    public final void updateColors() {
        int v0;
        wx0 wx0Var = this.q0;
        Paint paint = wx0Var.R;
        vx0 vx0Var = wx0Var.f;
        tx0 tx0Var = wx0Var.Y;
        ylb ylbVar = wx0Var.G;
        if (tx0Var != null && vx0Var != null) {
            try {
                if (wx0Var.E != null && paint != null) {
                    if (!wx0Var.W) {
                        int i = wx0Var.w0;
                        if (i < 0) {
                            i = cmb.c6;
                        }
                        int v02 = cmb.v0(i, ylbVar);
                        int i2 = wx0Var.S;
                        if (v02 != i2) {
                            wx0Var.S = v02;
                            if ((tx0Var.getBackground() instanceof ColorDrawable) && ((ColorDrawable) tx0Var.getBackground()).getColor() == i2) {
                                tx0Var.setBackgroundColor(wx0Var.S);
                            }
                        }
                    }
                    if (wx0Var.J0 && wx0Var.n0 != null && (v0 = cmb.v0(cmb.Z6, ylbVar)) != wx0Var.T) {
                        wx0Var.D(v0, false);
                        wx0Var.J0 = true;
                    }
                    if (wx0Var.a == wx0Var.b) {
                        int w0 = cmb.w0(null, cmb.yj, false);
                        wx0Var.b = w0;
                        wx0Var.a = w0;
                    }
                    int color = paint.getColor();
                    if (!wx0Var.W) {
                        color = (((((((((((color * 31) + cmb.v0(cmb.F6, ylbVar)) * 31) + cmb.v0(cmb.t8, ylbVar)) * 31) + cmb.v0(cmb.F8, ylbVar)) * 31) + cmb.v0(cmb.D8, ylbVar)) * 31) + cmb.v0(cmb.E8, ylbVar)) * 31) + cmb.v0(cmb.H5, ylbVar);
                    }
                    if (!wx0Var.K0 || color != wx0Var.L0) {
                        wx0Var.K0 = true;
                        wx0Var.L0 = color;
                        wx0Var.F();
                    }
                    wx0Var.J();
                    vx0Var.invalidate();
                }
            } catch (Exception e) {
                fc4.g(e, true);
            }
        }
    }

    @Override
    public final float y(Canvas canvas, RectF rectF, float f, RectF rectF2, float f2) {
        wx0 wx0Var = this.q0;
        nx0 nx0Var = wx0Var.x;
        RectF rectF3 = this.o0;
        rectF3.set(nx0Var.getLeft(), nx0Var.getTranslationY() + gm.L(24.0f), nx0Var.getRight(), getHeight());
        gm.a2(rectF3, rectF, f, rectF2);
        canvas.save();
        Path path = this.p0;
        path.rewind();
        float L = gm.L(16.0f);
        float f3 = 1.0f;
        if (!gm.O1()) {
            f3 = 1.0f - wx0Var.c;
        }
        float R1 = gm.R1(L * f3, gm.L(18.0f), f);
        path.addRoundRect(rectF2, R1, R1, Path.Direction.CW);
        canvas.clipPath(path);
        canvas.drawPaint(wx0Var.R);
        if (nx0Var != null) {
            canvas.save();
            canvas.translate(rectF2.left, (f * gm.L(51.0f)) + Math.max(nx0Var.getY(), rectF2.top));
            nx0Var.draw(canvas);
            canvas.restore();
        }
        canvas.restore();
        return R1;
    }
}
