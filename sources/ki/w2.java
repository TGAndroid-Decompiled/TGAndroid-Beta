package ki;

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
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.fc0;
import org.telegram.ui.Components.st0;
import org.telegram.ui.LaunchActivity;
public final class w2 extends st0 implements org.telegram.ui.ActionBar.h3 {
    public final Paint f18634g0;
    public boolean f18635h0;
    public final RectF f18636i0;
    public final Path f18637j0;
    public final x2 f18638k0;

    public w2(x2 x2Var, Context context) {
        super(context, null);
        this.f18638k0 = x2Var;
        setClipChildren(false);
        setClipToPadding(false);
        setWillNotDraw(false);
        this.f18634g0 = new Paint(1);
        this.f18636i0 = new RectF();
        this.f18637j0 = new Path();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(j6.f28849d6));
        hashSet.add(Integer.valueOf(j6.f28792a7));
        hashSet.add(Integer.valueOf(j6.G6));
        hashSet.add(Integer.valueOf(j6.f29167u8));
        hashSet.add(Integer.valueOf(j6.G8));
        hashSet.add(Integer.valueOf(j6.E8));
        hashSet.add(Integer.valueOf(j6.F8));
        hashSet.add(Integer.valueOf(j6.I5));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        Paint paint;
        float f10;
        x2 x2Var = this.f18638k0;
        fc0 fc0Var = x2Var.f18679u0;
        Rect rect = x2Var.f18669n;
        Rect rect2 = x2Var.h;
        if (!this.f18635h0) {
            int visibility = fc0Var.getVisibility();
            Paint paint2 = this.f18634g0;
            if (visibility != 0) {
                float f11 = x2Var.f18664h0;
                if (f11 < 1.0f && f11 > 0.0f) {
                    paint2.setColor(j6.r1(x2Var.S0, x2Var.T));
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
            if (x2Var.f18681w != null && !org.telegram.messenger.g0.Q1()) {
                canvas.save();
                canvas.translate((1.0f - x2Var.f18664h0) * rect.left, 0.0f);
                r7 r7Var = x2Var.f18681w;
                int W1 = org.telegram.messenger.g0.W1(x2Var.f18664h0, (getWidth() - rect.left) - rect.right, getWidth());
                getHeight();
                r7Var.k(canvas, true, false, W1, 1.0f - x2Var.f18664h0);
                canvas.translate((1.0f - x2Var.f18664h0) * (-rect.left), 0.0f);
                z10 = true;
            } else {
                z10 = false;
            }
            super.dispatchDraw(canvas);
            if (z10) {
                canvas.restore();
            }
            if (fc0Var.getVisibility() != 0) {
                paint2.setColor(j6.r1(x2Var.S0, x2Var.T));
                int i10 = rect2.left;
                if (i10 > 0) {
                    paint = paint2;
                    canvas.drawRect(0.0f, 0.0f, (1.0f - x2Var.f18664h0) * i10, getHeight(), paint);
                } else {
                    paint = paint2;
                }
                if (rect2.top > 0) {
                    canvas.drawRect(0.0f, 0.0f, getWidth(), (1.0f - x2Var.f18664h0) * rect2.top, paint);
                }
                if (rect2.bottom > 0) {
                    float height = getHeight();
                    float f12 = rect2.bottom;
                    t2 t2Var = x2Var.f18670n0;
                    if (t2Var != null && t2Var.getTotalHeight() > 0) {
                        f10 = 1.0f;
                    } else {
                        f10 = 1.0f - x2Var.f18664h0;
                    }
                    canvas.drawRect(0.0f, height - (f12 * f10), getWidth(), getHeight(), paint);
                }
                if (rect2.right > 0) {
                    canvas.drawRect(com.google.android.gms.internal.vision.e2.t(1.0f, x2Var.f18664h0, rect2.right, getWidth()), 0.0f, getWidth(), getHeight(), paint);
                }
            }
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.c3 c3Var;
        x2 x2Var = this.f18638k0;
        Rect rect = x2Var.f18669n;
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (launchActivity != null) {
            c3Var = launchActivity.N();
        } else {
            c3Var = null;
        }
        if (c3Var != null && rect != null) {
            int i7 = (int) ((1.0f - x2Var.f18664h0) * ((int) c3Var.H));
            if (motionEvent.getY() >= (getHeight() - rect.bottom) - i7 && motionEvent.getY() <= getHeight() - rect.bottom && !org.telegram.messenger.g0.Q1()) {
                return c3Var.j(motionEvent.getX(), motionEvent.getY() - ((getHeight() - rect.bottom) - i7), motionEvent.getAction());
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void draw(Canvas canvas) {
        float f10;
        float T1;
        x2 x2Var = this.f18638k0;
        Rect rect = x2Var.f18669n;
        o2 o2Var = x2Var.f18683x;
        Paint paint = x2Var.P;
        u2 u2Var = x2Var.Y;
        Drawable drawable = x2Var.f18652a0;
        if (this.f18635h0) {
            return;
        }
        super.draw(canvas);
        if (org.telegram.messenger.g0.Q1()) {
            f10 = 0.0f;
        } else {
            f10 = x2Var.f18656c;
        }
        paint.setColor(x2Var.f18651a);
        paint.setAlpha((int) ((1.0f - x2Var.f18664h0) * (1.0f - (Math.min(0.5f, f10) / 0.5f)) * paint.getAlpha()));
        canvas.save();
        float f11 = 1.0f - f10;
        if (org.telegram.messenger.g0.Q1()) {
            T1 = org.telegram.messenger.g0.T1(o2Var.getTranslationY() + org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.f23605m / 2.0f, x2Var.f18656c);
        } else {
            T1 = org.telegram.messenger.g0.T1(o2Var.getTranslationY(), (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f) + org.telegram.messenger.g0.f23605m, f10) + org.telegram.messenger.g0.L(12.0f);
        }
        canvas.scale(f11, f11, getWidth() / 2.0f, T1);
        canvas.drawLine((getWidth() / 2.0f) - org.telegram.messenger.g0.L(16.0f), T1, (getWidth() / 2.0f) + org.telegram.messenger.g0.L(16.0f), T1, paint);
        canvas.restore();
        drawable.setAlpha((int) (u2Var.getAlpha() * 255.0f));
        float translationY = u2Var.getTranslationY() + u2Var.getY() + u2Var.getHeight();
        drawable.setBounds(rect.left, (int) translationY, getWidth() - rect.right, (int) (translationY + drawable.getIntrinsicHeight()));
        drawable.draw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        boolean z10;
        x2 x2Var = this.f18638k0;
        if (view == x2Var.f18683x && x2Var.f18666j0 && x2Var.f18668l0 > 0 && x2Var.f18667k0 > 0) {
            canvas.save();
            canvas.clipRect(view.getX(), view.getY(), view.getX() + org.telegram.messenger.g0.W1(x2Var.f18665i0, x2Var.f18667k0, view.getWidth()), view.getY() + org.telegram.messenger.g0.W1(x2Var.f18665i0, x2Var.f18668l0, view.getHeight()));
            z10 = true;
        } else {
            z10 = false;
        }
        boolean drawChild = super.drawChild(canvas, view, j3);
        if (z10) {
            canvas.restore();
        }
        return drawChild;
    }

    @Override
    public RectF getRect() {
        o2 o2Var = this.f18638k0.f18683x;
        RectF rectF = this.f18636i0;
        rectF.set(o2Var.getLeft(), o2Var.getTranslationY() + org.telegram.messenger.g0.L(24.0f), o2Var.getRight(), getHeight());
        return rectF;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setTag(2131296351, new bi.t(4));
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
        boolean z10;
        x2 x2Var = this.f18638k0;
        Paint paint = x2Var.V;
        Paint paint2 = x2Var.R;
        o2 o2Var = x2Var.f18683x;
        if (!this.f18635h0) {
            super.onDraw(canvas);
            if (x2Var.f18679u0.getVisibility() != 0) {
                canvas.save();
                r7 r7Var = x2Var.f18681w;
                float f10 = 1.0f;
                if (r7Var != null) {
                    int width = getWidth();
                    getHeight();
                    canvas2 = canvas;
                    r7Var.k(canvas2, false, false, width, 1.0f - x2Var.f18664h0);
                } else {
                    canvas2 = canvas;
                }
                if (!x2Var.X) {
                    int w02 = j6.w0(j6.f28849d6, x2Var.G);
                    paint2.setColor(w02);
                    x2Var.E.setFlickerViewColor(w02);
                    org.telegram.ui.b3 b3Var = x2Var.Z0;
                    if (b3Var != null) {
                        if (org.telegram.messenger.g0.B(paint2.getColor()) <= 0.721f) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        b3Var.b(z10, false);
                        x2Var.Z0.setBackgroundColor(paint2.getColor());
                    }
                }
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                canvas2.drawRect(rectF, x2Var.Q);
                org.telegram.ui.ActionBar.c3 c3Var = x2Var.f18676s;
                if (c3Var != null) {
                    i7 = (int) c3Var.H;
                } else {
                    i7 = 0;
                }
                paint.setColor(x2Var.S);
                float L = org.telegram.messenger.g0.L(16.0f);
                if (!org.telegram.messenger.g0.Q1()) {
                    f10 = 1.0f - x2Var.f18656c;
                }
                float f11 = L * f10;
                rectF.set(org.telegram.messenger.g0.W1(x2Var.f18664h0, o2Var.getLeft(), 0), org.telegram.messenger.g0.T1(o2Var.getTranslationY(), 0.0f, x2Var.f18656c), o2Var.getRight(), o2Var.getTranslationY() + org.telegram.messenger.g0.L(24.0f) + f11);
                canvas2.drawRoundRect(rectF, f11, f11, paint);
                int left = o2Var.getLeft();
                rectF.set(org.telegram.messenger.g0.W1(x2Var.f18664h0, left, 0), o2Var.getTranslationY() + org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.W1(x2Var.f18664h0, o2Var.getRight(), getWidth()), getHeight() - i7);
                canvas2.drawRect(rectF, paint2);
                canvas2.restore();
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        x2 x2Var = this.f18638k0;
        o2 o2Var = x2Var.f18683x;
        if (motionEvent.getAction() == 0 && (motionEvent.getY() <= org.telegram.messenger.g0.T1(o2Var.getTranslationY() + org.telegram.messenger.g0.L(24.0f), 0.0f, x2Var.f18656c) || motionEvent.getX() > o2Var.getRight() || motionEvent.getX() < o2Var.getLeft())) {
            x2Var.o(true);
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public void setDrawingFromOverlay(boolean z10) {
        if (this.f18635h0 != z10) {
            this.f18635h0 = z10;
            invalidate();
            x2 x2Var = this.f18638k0;
            x2Var.L();
            LaunchActivity launchActivity = LaunchActivity.H1;
            if (launchActivity != null && x2Var.f18662f0) {
                launchActivity.D0(x2Var.T);
            }
        }
    }

    @Override
    public final void updateColors() {
        int w02;
        x2 x2Var = this.f18638k0;
        Paint paint = x2Var.R;
        w2 w2Var = x2Var.f18661f;
        u2 u2Var = x2Var.Y;
        e6 e6Var = x2Var.G;
        if (u2Var != null && w2Var != null) {
            try {
                if (x2Var.E != null && paint != null) {
                    if (!x2Var.W) {
                        int i7 = x2Var.f18682w0;
                        if (i7 < 0) {
                            i7 = j6.f28849d6;
                        }
                        int w03 = j6.w0(i7, e6Var);
                        int i10 = x2Var.S;
                        if (w03 != i10) {
                            x2Var.S = w03;
                            if ((u2Var.getBackground() instanceof ColorDrawable) && ((ColorDrawable) u2Var.getBackground()).getColor() == i10) {
                                u2Var.setBackgroundColor(x2Var.S);
                            }
                        }
                    }
                    if (x2Var.J0 && x2Var.f18670n0 != null && (w02 = j6.w0(j6.f28792a7, e6Var)) != x2Var.T) {
                        x2Var.D(w02, false);
                        x2Var.J0 = true;
                    }
                    if (x2Var.f18651a == x2Var.f18654b) {
                        int x02 = j6.x0(null, j6.zj, false);
                        x2Var.f18654b = x02;
                        x2Var.f18651a = x02;
                    }
                    int color = paint.getColor();
                    if (!x2Var.W) {
                        color = (((((((((((color * 31) + j6.w0(j6.G6, e6Var)) * 31) + j6.w0(j6.f29167u8, e6Var)) * 31) + j6.w0(j6.G8, e6Var)) * 31) + j6.w0(j6.E8, e6Var)) * 31) + j6.w0(j6.F8, e6Var)) * 31) + j6.w0(j6.I5, e6Var);
                    }
                    if (!x2Var.K0 || color != x2Var.L0) {
                        x2Var.K0 = true;
                        x2Var.L0 = color;
                        x2Var.F();
                    }
                    x2Var.J();
                    w2Var.invalidate();
                }
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
    }

    @Override
    public final float z(Canvas canvas, RectF rectF, float f10, RectF rectF2, float f11) {
        x2 x2Var = this.f18638k0;
        o2 o2Var = x2Var.f18683x;
        RectF rectF3 = this.f18636i0;
        rectF3.set(o2Var.getLeft(), o2Var.getTranslationY() + org.telegram.messenger.g0.L(24.0f), o2Var.getRight(), getHeight());
        org.telegram.messenger.g0.c2(rectF3, rectF, f10, rectF2);
        canvas.save();
        Path path = this.f18637j0;
        path.rewind();
        float L = org.telegram.messenger.g0.L(16.0f);
        float f12 = 1.0f;
        if (!org.telegram.messenger.g0.Q1()) {
            f12 = 1.0f - x2Var.f18656c;
        }
        float T1 = org.telegram.messenger.g0.T1(L * f12, org.telegram.messenger.g0.L(18.0f), f10);
        path.addRoundRect(rectF2, T1, T1, Path.Direction.CW);
        canvas.clipPath(path);
        canvas.drawPaint(x2Var.R);
        if (o2Var != null) {
            canvas.save();
            canvas.translate(rectF2.left, (f10 * org.telegram.messenger.g0.L(51.0f)) + Math.max(o2Var.getY(), rectF2.top));
            o2Var.draw(canvas);
            canvas.restore();
        }
        canvas.restore();
        return T1;
    }
}
