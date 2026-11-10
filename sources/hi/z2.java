package hi;

import a8.r7;
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
import org.telegram.messenger.a8;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.ec0;
import org.telegram.ui.Components.st0;
import org.telegram.ui.LaunchActivity;
public final class z2 extends st0 implements org.telegram.ui.ActionBar.j3 {
    public final Paint f15071f0;
    public boolean f15072g0;
    public final RectF f15073h0;
    public final Path f15074i0;
    public final a3 f15075j0;

    public z2(a3 a3Var, Context context) {
        super(context, null);
        this.f15075j0 = a3Var;
        setClipChildren(false);
        setClipToPadding(false);
        setWillNotDraw(false);
        this.f15071f0 = new Paint(1);
        this.f15073h0 = new RectF();
        this.f15074i0 = new Path();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(m6.f27890d6));
        hashSet.add(Integer.valueOf(m6.f27834a7));
        hashSet.add(Integer.valueOf(m6.G6));
        hashSet.add(Integer.valueOf(m6.f28208u8));
        hashSet.add(Integer.valueOf(m6.G8));
        hashSet.add(Integer.valueOf(m6.E8));
        hashSet.add(Integer.valueOf(m6.F8));
        hashSet.add(Integer.valueOf(m6.I5));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z9;
        Paint paint;
        float f10;
        a3 a3Var = this.f15075j0;
        ec0 ec0Var = a3Var.f14538t0;
        Rect rect = a3Var.f14529n;
        Rect rect2 = a3Var.h;
        if (!this.f15072g0) {
            int visibility = ec0Var.getVisibility();
            Paint paint2 = this.f15071f0;
            if (visibility != 0) {
                float f11 = a3Var.f14523g0;
                if (f11 < 1.0f && f11 > 0.0f) {
                    paint2.setColor(m6.r1(a3Var.R0, a3Var.S));
                    int i7 = rect2.left;
                    if (i7 > 0) {
                        canvas.drawRect(0.0f, 0.0f, i7, getHeight(), paint2);
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
            if (a3Var.f14541w != null && !org.telegram.messenger.g0.Q1()) {
                canvas.save();
                canvas.translate((1.0f - a3Var.f14523g0) * rect.left, 0.0f);
                r7 r7Var = a3Var.f14541w;
                int W1 = org.telegram.messenger.g0.W1(a3Var.f14523g0, (getWidth() - rect.left) - rect.right, getWidth());
                getHeight();
                r7Var.j(canvas, true, false, W1, 1.0f - a3Var.f14523g0);
                canvas.translate((1.0f - a3Var.f14523g0) * (-rect.left), 0.0f);
                z9 = true;
            } else {
                z9 = false;
            }
            super.dispatchDraw(canvas);
            if (z9) {
                canvas.restore();
            }
            if (ec0Var.getVisibility() != 0) {
                paint2.setColor(m6.r1(a3Var.R0, a3Var.S));
                int i10 = rect2.left;
                if (i10 > 0) {
                    paint = paint2;
                    canvas.drawRect(0.0f, 0.0f, (1.0f - a3Var.f14523g0) * i10, getHeight(), paint);
                } else {
                    paint = paint2;
                }
                if (rect2.top > 0) {
                    canvas.drawRect(0.0f, 0.0f, getWidth(), (1.0f - a3Var.f14523g0) * rect2.top, paint);
                }
                if (rect2.bottom > 0) {
                    float height = getHeight();
                    float f12 = rect2.bottom;
                    w2 w2Var = a3Var.m0;
                    if (w2Var != null && w2Var.getTotalHeight() > 0) {
                        f10 = 1.0f;
                    } else {
                        f10 = 1.0f - a3Var.f14523g0;
                    }
                    canvas.drawRect(0.0f, height - (f12 * f10), getWidth(), getHeight(), paint);
                }
                if (rect2.right > 0) {
                    canvas.drawRect(com.google.android.recaptcha.internal.a.v(1.0f, a3Var.f14523g0, rect2.right, getWidth()), 0.0f, getWidth(), getHeight(), paint);
                }
            }
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.e3 e3Var;
        a3 a3Var = this.f15075j0;
        Rect rect = a3Var.f14529n;
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity != null) {
            e3Var = launchActivity.O();
        } else {
            e3Var = null;
        }
        if (e3Var != null && rect != null) {
            int i7 = (int) ((1.0f - a3Var.f14523g0) * ((int) e3Var.G));
            if (motionEvent.getY() >= (getHeight() - rect.bottom) - i7 && motionEvent.getY() <= getHeight() - rect.bottom && !org.telegram.messenger.g0.Q1()) {
                return e3Var.j(motionEvent.getX(), motionEvent.getY() - ((getHeight() - rect.bottom) - i7), motionEvent.getAction());
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void draw(Canvas canvas) {
        float f10;
        float T1;
        a3 a3Var = this.f15075j0;
        Rect rect = a3Var.f14529n;
        r2 r2Var = a3Var.f14543x;
        Paint paint = a3Var.O;
        x2 x2Var = a3Var.X;
        Drawable drawable = a3Var.Z;
        if (this.f15072g0) {
            return;
        }
        super.draw(canvas);
        if (org.telegram.messenger.g0.Q1()) {
            f10 = 0.0f;
        } else {
            f10 = a3Var.f14516c;
        }
        paint.setColor(a3Var.f14512a);
        paint.setAlpha((int) ((1.0f - a3Var.f14523g0) * (1.0f - (Math.min(0.5f, f10) / 0.5f)) * paint.getAlpha()));
        canvas.save();
        float f11 = 1.0f - f10;
        if (org.telegram.messenger.g0.Q1()) {
            T1 = org.telegram.messenger.g0.T1(r2Var.getTranslationY() + org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.f22561m / 2.0f, a3Var.f14516c);
        } else {
            T1 = org.telegram.messenger.g0.T1(r2Var.getTranslationY(), (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() / 2.0f) + org.telegram.messenger.g0.f22561m, f10) + org.telegram.messenger.g0.L(12.0f);
        }
        canvas.scale(f11, f11, getWidth() / 2.0f, T1);
        canvas.drawLine((getWidth() / 2.0f) - org.telegram.messenger.g0.L(16.0f), T1, (getWidth() / 2.0f) + org.telegram.messenger.g0.L(16.0f), T1, paint);
        canvas.restore();
        drawable.setAlpha((int) (x2Var.getAlpha() * 255.0f));
        float translationY = x2Var.getTranslationY() + x2Var.getY() + x2Var.getHeight();
        drawable.setBounds(rect.left, (int) translationY, getWidth() - rect.right, (int) (translationY + drawable.getIntrinsicHeight()));
        drawable.draw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        boolean z9;
        a3 a3Var = this.f15075j0;
        if (view == a3Var.f14543x && a3Var.f14525i0 && a3Var.f14527k0 > 0 && a3Var.f14526j0 > 0) {
            canvas.save();
            canvas.clipRect(view.getX(), view.getY(), view.getX() + org.telegram.messenger.g0.W1(a3Var.f14524h0, a3Var.f14526j0, view.getWidth()), view.getY() + org.telegram.messenger.g0.W1(a3Var.f14524h0, a3Var.f14527k0, view.getHeight()));
            z9 = true;
        } else {
            z9 = false;
        }
        boolean drawChild = super.drawChild(canvas, view, j3);
        if (z9) {
            canvas.restore();
        }
        return drawChild;
    }

    @Override
    public RectF getRect() {
        r2 r2Var = this.f15075j0.f14543x;
        RectF rectF = this.f15073h0;
        rectF.set(r2Var.getLeft(), r2Var.getTranslationY() + org.telegram.messenger.g0.L(24.0f), r2Var.getRight(), getHeight());
        return rectF;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setTag(2131296351, new fi.r7(3));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setTag(2131296351, null);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        int i7;
        boolean z9;
        a3 a3Var = this.f15075j0;
        Paint paint = a3Var.U;
        Paint paint2 = a3Var.Q;
        r2 r2Var = a3Var.f14543x;
        if (!this.f15072g0) {
            super.onDraw(canvas);
            if (a3Var.f14538t0.getVisibility() != 0) {
                canvas.save();
                r7 r7Var = a3Var.f14541w;
                float f10 = 1.0f;
                if (r7Var != null) {
                    int width = getWidth();
                    getHeight();
                    canvas2 = canvas;
                    r7Var.j(canvas2, false, false, width, 1.0f - a3Var.f14523g0);
                } else {
                    canvas2 = canvas;
                }
                if (!a3Var.W) {
                    int w02 = m6.w0(m6.f27890d6, a3Var.F);
                    paint2.setColor(w02);
                    a3Var.D.setFlickerViewColor(w02);
                    org.telegram.ui.b3 b3Var = a3Var.Y0;
                    if (b3Var != null) {
                        if (org.telegram.messenger.g0.B(paint2.getColor()) <= 0.721f) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        b3Var.b(z9, false);
                        a3Var.Y0.setBackgroundColor(paint2.getColor());
                    }
                }
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                canvas2.drawRect(rectF, a3Var.P);
                org.telegram.ui.ActionBar.e3 e3Var = a3Var.f14536s;
                if (e3Var != null) {
                    i7 = (int) e3Var.G;
                } else {
                    i7 = 0;
                }
                paint.setColor(a3Var.R);
                float L = org.telegram.messenger.g0.L(16.0f);
                if (!org.telegram.messenger.g0.Q1()) {
                    f10 = 1.0f - a3Var.f14516c;
                }
                float f11 = L * f10;
                rectF.set(org.telegram.messenger.g0.W1(a3Var.f14523g0, r2Var.getLeft(), 0), org.telegram.messenger.g0.T1(r2Var.getTranslationY(), 0.0f, a3Var.f14516c), r2Var.getRight(), r2Var.getTranslationY() + org.telegram.messenger.g0.L(24.0f) + f11);
                canvas2.drawRoundRect(rectF, f11, f11, paint);
                int left = r2Var.getLeft();
                rectF.set(org.telegram.messenger.g0.W1(a3Var.f14523g0, left, 0), r2Var.getTranslationY() + org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.W1(a3Var.f14523g0, r2Var.getRight(), getWidth()), getHeight() - i7);
                canvas2.drawRect(rectF, paint2);
                canvas2.restore();
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        a3 a3Var = this.f15075j0;
        r2 r2Var = a3Var.f14543x;
        if (motionEvent.getAction() == 0 && (motionEvent.getY() <= org.telegram.messenger.g0.T1(r2Var.getTranslationY() + org.telegram.messenger.g0.L(24.0f), 0.0f, a3Var.f14516c) || motionEvent.getX() > r2Var.getRight() || motionEvent.getX() < r2Var.getLeft())) {
            a3Var.o(true);
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public void setDrawingFromOverlay(boolean z9) {
        if (this.f15072g0 != z9) {
            this.f15072g0 = z9;
            invalidate();
            a3 a3Var = this.f15075j0;
            a3Var.L();
            LaunchActivity launchActivity = LaunchActivity.G1;
            if (launchActivity != null && a3Var.f14520e0) {
                launchActivity.D0(a3Var.S);
            }
        }
    }

    @Override
    public final void updateColors() {
        int w02;
        a3 a3Var = this.f15075j0;
        Paint paint = a3Var.Q;
        z2 z2Var = a3Var.f14521f;
        x2 x2Var = a3Var.X;
        h6 h6Var = a3Var.F;
        if (x2Var != null && z2Var != null) {
            try {
                if (a3Var.D != null && paint != null) {
                    if (!a3Var.V) {
                        int i7 = a3Var.f14540v0;
                        if (i7 < 0) {
                            i7 = m6.f27890d6;
                        }
                        int w03 = m6.w0(i7, h6Var);
                        int i10 = a3Var.R;
                        if (w03 != i10) {
                            a3Var.R = w03;
                            if ((x2Var.getBackground() instanceof ColorDrawable) && ((ColorDrawable) x2Var.getBackground()).getColor() == i10) {
                                x2Var.setBackgroundColor(a3Var.R);
                            }
                        }
                    }
                    if (a3Var.I0 && a3Var.m0 != null && (w02 = m6.w0(m6.f27834a7, h6Var)) != a3Var.S) {
                        a3Var.D(w02, false);
                        a3Var.I0 = true;
                    }
                    if (a3Var.f14512a == a3Var.f14514b) {
                        int x02 = m6.x0(null, m6.wj, false);
                        a3Var.f14514b = x02;
                        a3Var.f14512a = x02;
                    }
                    int color = paint.getColor();
                    if (!a3Var.V) {
                        color = (((((((((((color * 31) + m6.w0(m6.G6, h6Var)) * 31) + m6.w0(m6.f28208u8, h6Var)) * 31) + m6.w0(m6.G8, h6Var)) * 31) + m6.w0(m6.E8, h6Var)) * 31) + m6.w0(m6.F8, h6Var)) * 31) + m6.w0(m6.I5, h6Var);
                    }
                    if (!a3Var.J0 || color != a3Var.K0) {
                        a3Var.J0 = true;
                        a3Var.K0 = color;
                        a3Var.F();
                    }
                    a3Var.J();
                    z2Var.invalidate();
                }
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
    }

    @Override
    public final float z(Canvas canvas, RectF rectF, float f10, RectF rectF2, float f11) {
        a3 a3Var = this.f15075j0;
        r2 r2Var = a3Var.f14543x;
        RectF rectF3 = this.f15073h0;
        rectF3.set(r2Var.getLeft(), r2Var.getTranslationY() + org.telegram.messenger.g0.L(24.0f), r2Var.getRight(), getHeight());
        org.telegram.messenger.g0.c2(rectF3, rectF, f10, rectF2);
        canvas.save();
        Path path = this.f15074i0;
        path.rewind();
        float L = org.telegram.messenger.g0.L(16.0f);
        float f12 = 1.0f;
        if (!org.telegram.messenger.g0.Q1()) {
            f12 = 1.0f - a3Var.f14516c;
        }
        float T1 = org.telegram.messenger.g0.T1(L * f12, org.telegram.messenger.g0.L(18.0f), f10);
        path.addRoundRect(rectF2, T1, T1, Path.Direction.CW);
        canvas.clipPath(path);
        canvas.drawPaint(a3Var.Q);
        if (r2Var != null) {
            canvas.save();
            canvas.translate(rectF2.left, (f10 * org.telegram.messenger.g0.L(51.0f)) + Math.max(r2Var.getY(), rectF2.top));
            r2Var.draw(canvas);
            canvas.restore();
        }
        canvas.restore();
        return T1;
    }
}
