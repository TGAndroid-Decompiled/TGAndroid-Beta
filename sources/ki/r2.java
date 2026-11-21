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
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.du0;
import org.telegram.ui.Components.qc0;
import org.telegram.ui.LaunchActivity;
public final class r2 extends du0 implements org.telegram.ui.ActionBar.k3 {
    public final Paint f18893g0;
    public boolean f18894h0;
    public final RectF f18895i0;
    public final Path f18896j0;
    public final s2 f18897k0;

    public r2(s2 s2Var, Context context) {
        super(context, null);
        this.f18897k0 = s2Var;
        setClipChildren(false);
        setClipToPadding(false);
        setWillNotDraw(false);
        this.f18893g0 = new Paint(1);
        this.f18895i0 = new RectF();
        this.f18896j0 = new Path();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(m6.f29378d6));
        hashSet.add(Integer.valueOf(m6.f29321a7));
        hashSet.add(Integer.valueOf(m6.G6));
        hashSet.add(Integer.valueOf(m6.f29696u8));
        hashSet.add(Integer.valueOf(m6.G8));
        hashSet.add(Integer.valueOf(m6.E8));
        hashSet.add(Integer.valueOf(m6.F8));
        hashSet.add(Integer.valueOf(m6.I5));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        Paint paint;
        float f10;
        s2 s2Var = this.f18897k0;
        qc0 qc0Var = s2Var.f18955u0;
        Rect rect = s2Var.f18945n;
        Rect rect2 = s2Var.h;
        if (!this.f18894h0) {
            int visibility = qc0Var.getVisibility();
            Paint paint2 = this.f18893g0;
            if (visibility != 0) {
                float f11 = s2Var.f18940h0;
                if (f11 < 1.0f && f11 > 0.0f) {
                    paint2.setColor(m6.r1(s2Var.S0, s2Var.T));
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
            if (s2Var.f18957w != null && !org.telegram.messenger.g0.Q1()) {
                canvas.save();
                canvas.translate((1.0f - s2Var.f18940h0) * rect.left, 0.0f);
                r7 r7Var = s2Var.f18957w;
                int W1 = org.telegram.messenger.g0.W1(s2Var.f18940h0, (getWidth() - rect.left) - rect.right, getWidth());
                getHeight();
                r7Var.k(canvas, true, false, W1, 1.0f - s2Var.f18940h0);
                canvas.translate((1.0f - s2Var.f18940h0) * (-rect.left), 0.0f);
                z10 = true;
            } else {
                z10 = false;
            }
            super.dispatchDraw(canvas);
            if (z10) {
                canvas.restore();
            }
            if (qc0Var.getVisibility() != 0) {
                paint2.setColor(m6.r1(s2Var.S0, s2Var.T));
                int i10 = rect2.left;
                if (i10 > 0) {
                    paint = paint2;
                    canvas.drawRect(0.0f, 0.0f, (1.0f - s2Var.f18940h0) * i10, getHeight(), paint);
                } else {
                    paint = paint2;
                }
                if (rect2.top > 0) {
                    canvas.drawRect(0.0f, 0.0f, getWidth(), (1.0f - s2Var.f18940h0) * rect2.top, paint);
                }
                if (rect2.bottom > 0) {
                    float height = getHeight();
                    float f12 = rect2.bottom;
                    o2 o2Var = s2Var.f18946n0;
                    if (o2Var != null && o2Var.getTotalHeight() > 0) {
                        f10 = 1.0f;
                    } else {
                        f10 = 1.0f - s2Var.f18940h0;
                    }
                    canvas.drawRect(0.0f, height - (f12 * f10), getWidth(), getHeight(), paint);
                }
                if (rect2.right > 0) {
                    canvas.drawRect(com.google.android.gms.internal.vision.e2.t(1.0f, s2Var.f18940h0, rect2.right, getWidth()), 0.0f, getWidth(), getHeight(), paint);
                }
            }
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.f3 f3Var;
        s2 s2Var = this.f18897k0;
        Rect rect = s2Var.f18945n;
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (launchActivity != null) {
            f3Var = launchActivity.N();
        } else {
            f3Var = null;
        }
        if (f3Var != null && rect != null) {
            int i7 = (int) ((1.0f - s2Var.f18940h0) * ((int) f3Var.H));
            if (motionEvent.getY() >= (getHeight() - rect.bottom) - i7 && motionEvent.getY() <= getHeight() - rect.bottom && !org.telegram.messenger.g0.Q1()) {
                return f3Var.j(motionEvent.getX(), motionEvent.getY() - ((getHeight() - rect.bottom) - i7), motionEvent.getAction());
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void draw(Canvas canvas) {
        float f10;
        float T1;
        s2 s2Var = this.f18897k0;
        Rect rect = s2Var.f18945n;
        j2 j2Var = s2Var.f18959x;
        Paint paint = s2Var.P;
        p2 p2Var = s2Var.Y;
        Drawable drawable = s2Var.f18928a0;
        if (this.f18894h0) {
            return;
        }
        super.draw(canvas);
        if (org.telegram.messenger.g0.Q1()) {
            f10 = 0.0f;
        } else {
            f10 = s2Var.f18932c;
        }
        paint.setColor(s2Var.f18927a);
        paint.setAlpha((int) ((1.0f - s2Var.f18940h0) * (1.0f - (Math.min(0.5f, f10) / 0.5f)) * paint.getAlpha()));
        canvas.save();
        float f11 = 1.0f - f10;
        if (org.telegram.messenger.g0.Q1()) {
            T1 = org.telegram.messenger.g0.T1(j2Var.getTranslationY() + org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.f24140m / 2.0f, s2Var.f18932c);
        } else {
            T1 = org.telegram.messenger.g0.T1(j2Var.getTranslationY(), (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f) + org.telegram.messenger.g0.f24140m, f10) + org.telegram.messenger.g0.L(12.0f);
        }
        canvas.scale(f11, f11, getWidth() / 2.0f, T1);
        canvas.drawLine((getWidth() / 2.0f) - org.telegram.messenger.g0.L(16.0f), T1, (getWidth() / 2.0f) + org.telegram.messenger.g0.L(16.0f), T1, paint);
        canvas.restore();
        drawable.setAlpha((int) (p2Var.getAlpha() * 255.0f));
        float translationY = p2Var.getTranslationY() + p2Var.getY() + p2Var.getHeight();
        drawable.setBounds(rect.left, (int) translationY, getWidth() - rect.right, (int) (translationY + drawable.getIntrinsicHeight()));
        drawable.draw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        boolean z10;
        s2 s2Var = this.f18897k0;
        if (view == s2Var.f18959x && s2Var.f18942j0 && s2Var.f18944l0 > 0 && s2Var.f18943k0 > 0) {
            canvas.save();
            canvas.clipRect(view.getX(), view.getY(), view.getX() + org.telegram.messenger.g0.W1(s2Var.f18941i0, s2Var.f18943k0, view.getWidth()), view.getY() + org.telegram.messenger.g0.W1(s2Var.f18941i0, s2Var.f18944l0, view.getHeight()));
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
        j2 j2Var = this.f18897k0.f18959x;
        RectF rectF = this.f18895i0;
        rectF.set(j2Var.getLeft(), j2Var.getTranslationY() + org.telegram.messenger.g0.L(24.0f), j2Var.getRight(), getHeight());
        return rectF;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setTag(2131296353, new bi.t(4));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setTag(2131296353, null);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        int i7;
        boolean z10;
        s2 s2Var = this.f18897k0;
        Paint paint = s2Var.V;
        Paint paint2 = s2Var.R;
        j2 j2Var = s2Var.f18959x;
        if (!this.f18894h0) {
            super.onDraw(canvas);
            if (s2Var.f18955u0.getVisibility() != 0) {
                canvas.save();
                r7 r7Var = s2Var.f18957w;
                float f10 = 1.0f;
                if (r7Var != null) {
                    int width = getWidth();
                    getHeight();
                    canvas2 = canvas;
                    r7Var.k(canvas2, false, false, width, 1.0f - s2Var.f18940h0);
                } else {
                    canvas2 = canvas;
                }
                if (!s2Var.X) {
                    int w02 = m6.w0(m6.f29378d6, s2Var.G);
                    paint2.setColor(w02);
                    s2Var.E.setFlickerViewColor(w02);
                    org.telegram.ui.b3 b3Var = s2Var.Z0;
                    if (b3Var != null) {
                        if (org.telegram.messenger.g0.B(paint2.getColor()) <= 0.721f) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        b3Var.b(z10, false);
                        s2Var.Z0.setBackgroundColor(paint2.getColor());
                    }
                }
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                canvas2.drawRect(rectF, s2Var.Q);
                org.telegram.ui.ActionBar.f3 f3Var = s2Var.f18952s;
                if (f3Var != null) {
                    i7 = (int) f3Var.H;
                } else {
                    i7 = 0;
                }
                paint.setColor(s2Var.S);
                float L = org.telegram.messenger.g0.L(16.0f);
                if (!org.telegram.messenger.g0.Q1()) {
                    f10 = 1.0f - s2Var.f18932c;
                }
                float f11 = L * f10;
                rectF.set(org.telegram.messenger.g0.W1(s2Var.f18940h0, j2Var.getLeft(), 0), org.telegram.messenger.g0.T1(j2Var.getTranslationY(), 0.0f, s2Var.f18932c), j2Var.getRight(), j2Var.getTranslationY() + org.telegram.messenger.g0.L(24.0f) + f11);
                canvas2.drawRoundRect(rectF, f11, f11, paint);
                int left = j2Var.getLeft();
                rectF.set(org.telegram.messenger.g0.W1(s2Var.f18940h0, left, 0), j2Var.getTranslationY() + org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.W1(s2Var.f18940h0, j2Var.getRight(), getWidth()), getHeight() - i7);
                canvas2.drawRect(rectF, paint2);
                canvas2.restore();
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        s2 s2Var = this.f18897k0;
        j2 j2Var = s2Var.f18959x;
        if (motionEvent.getAction() == 0 && (motionEvent.getY() <= org.telegram.messenger.g0.T1(j2Var.getTranslationY() + org.telegram.messenger.g0.L(24.0f), 0.0f, s2Var.f18932c) || motionEvent.getX() > j2Var.getRight() || motionEvent.getX() < j2Var.getLeft())) {
            s2Var.o(true);
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public void setDrawingFromOverlay(boolean z10) {
        if (this.f18894h0 != z10) {
            this.f18894h0 = z10;
            invalidate();
            s2 s2Var = this.f18897k0;
            s2Var.L();
            LaunchActivity launchActivity = LaunchActivity.H1;
            if (launchActivity != null && s2Var.f18938f0) {
                launchActivity.D0(s2Var.T);
            }
        }
    }

    @Override
    public final void updateColors() {
        int w02;
        s2 s2Var = this.f18897k0;
        Paint paint = s2Var.R;
        r2 r2Var = s2Var.f18937f;
        p2 p2Var = s2Var.Y;
        h6 h6Var = s2Var.G;
        if (p2Var != null && r2Var != null) {
            try {
                if (s2Var.E != null && paint != null) {
                    if (!s2Var.W) {
                        int i7 = s2Var.f18958w0;
                        if (i7 < 0) {
                            i7 = m6.f29378d6;
                        }
                        int w03 = m6.w0(i7, h6Var);
                        int i10 = s2Var.S;
                        if (w03 != i10) {
                            s2Var.S = w03;
                            if ((p2Var.getBackground() instanceof ColorDrawable) && ((ColorDrawable) p2Var.getBackground()).getColor() == i10) {
                                p2Var.setBackgroundColor(s2Var.S);
                            }
                        }
                    }
                    if (s2Var.J0 && s2Var.f18946n0 != null && (w02 = m6.w0(m6.f29321a7, h6Var)) != s2Var.T) {
                        s2Var.D(w02, false);
                        s2Var.J0 = true;
                    }
                    if (s2Var.f18927a == s2Var.f18930b) {
                        int x02 = m6.x0(null, m6.zj, false);
                        s2Var.f18930b = x02;
                        s2Var.f18927a = x02;
                    }
                    int color = paint.getColor();
                    if (!s2Var.W) {
                        color = (((((((((((color * 31) + m6.w0(m6.G6, h6Var)) * 31) + m6.w0(m6.f29696u8, h6Var)) * 31) + m6.w0(m6.G8, h6Var)) * 31) + m6.w0(m6.E8, h6Var)) * 31) + m6.w0(m6.F8, h6Var)) * 31) + m6.w0(m6.I5, h6Var);
                    }
                    if (!s2Var.K0 || color != s2Var.L0) {
                        s2Var.K0 = true;
                        s2Var.L0 = color;
                        s2Var.F();
                    }
                    s2Var.J();
                    r2Var.invalidate();
                }
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
    }

    @Override
    public final float z(Canvas canvas, RectF rectF, float f10, RectF rectF2, float f11) {
        s2 s2Var = this.f18897k0;
        j2 j2Var = s2Var.f18959x;
        RectF rectF3 = this.f18895i0;
        rectF3.set(j2Var.getLeft(), j2Var.getTranslationY() + org.telegram.messenger.g0.L(24.0f), j2Var.getRight(), getHeight());
        org.telegram.messenger.g0.c2(rectF3, rectF, f10, rectF2);
        canvas.save();
        Path path = this.f18896j0;
        path.rewind();
        float L = org.telegram.messenger.g0.L(16.0f);
        float f12 = 1.0f;
        if (!org.telegram.messenger.g0.Q1()) {
            f12 = 1.0f - s2Var.f18932c;
        }
        float T1 = org.telegram.messenger.g0.T1(L * f12, org.telegram.messenger.g0.L(18.0f), f10);
        path.addRoundRect(rectF2, T1, T1, Path.Direction.CW);
        canvas.clipPath(path);
        canvas.drawPaint(s2Var.R);
        if (j2Var != null) {
            canvas.save();
            canvas.translate(rectF2.left, (f10 * org.telegram.messenger.g0.L(51.0f)) + Math.max(j2Var.getY(), rectF2.top));
            j2Var.draw(canvas);
            canvas.restore();
        }
        canvas.restore();
        return T1;
    }
}
