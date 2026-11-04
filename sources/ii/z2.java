package ii;

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
import b8.ke;
import java.util.HashSet;
import org.telegram.messenger.a8;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.qt0;
import org.telegram.ui.Components.zb0;
import org.telegram.ui.LaunchActivity;
public final class z2 extends qt0 implements org.telegram.ui.ActionBar.h3 {
    public final Paint f15343g0;
    public boolean f15344h0;
    public final RectF f15345i0;
    public final Path f15346j0;
    public final a3 f15347k0;

    public z2(a3 a3Var, Context context) {
        super(context, null);
        this.f15347k0 = a3Var;
        setClipChildren(false);
        setClipToPadding(false);
        setWillNotDraw(false);
        this.f15343g0 = new Paint(1);
        this.f15345i0 = new RectF();
        this.f15346j0 = new Path();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(k6.f27878d6));
        hashSet.add(Integer.valueOf(k6.f27824a7));
        hashSet.add(Integer.valueOf(k6.G6));
        hashSet.add(Integer.valueOf(k6.f28198u8));
        hashSet.add(Integer.valueOf(k6.G8));
        hashSet.add(Integer.valueOf(k6.E8));
        hashSet.add(Integer.valueOf(k6.F8));
        hashSet.add(Integer.valueOf(k6.I5));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        Paint paint;
        float f10;
        a3 a3Var = this.f15347k0;
        zb0 zb0Var = a3Var.f14820u0;
        Rect rect = a3Var.f14810n;
        Rect rect2 = a3Var.h;
        if (!this.f15344h0) {
            int visibility = zb0Var.getVisibility();
            Paint paint2 = this.f15343g0;
            if (visibility != 0) {
                float f11 = a3Var.f14805h0;
                if (f11 < 1.0f && f11 > 0.0f) {
                    paint2.setColor(k6.r1(a3Var.S0, a3Var.T));
                    int i3 = rect2.left;
                    if (i3 > 0) {
                        canvas.drawRect(0.0f, 0.0f, i3, getHeight(), paint2);
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
            if (a3Var.f14822w != null && !org.telegram.messenger.g0.Q1()) {
                canvas.save();
                canvas.translate((1.0f - a3Var.f14805h0) * rect.left, 0.0f);
                ke keVar = a3Var.f14822w;
                int W1 = org.telegram.messenger.g0.W1(a3Var.f14805h0, (getWidth() - rect.left) - rect.right, getWidth());
                getHeight();
                keVar.j(canvas, true, false, W1, 1.0f - a3Var.f14805h0);
                canvas.translate((1.0f - a3Var.f14805h0) * (-rect.left), 0.0f);
                z10 = true;
            } else {
                z10 = false;
            }
            super.dispatchDraw(canvas);
            if (z10) {
                canvas.restore();
            }
            if (zb0Var.getVisibility() != 0) {
                paint2.setColor(k6.r1(a3Var.S0, a3Var.T));
                int i10 = rect2.left;
                if (i10 > 0) {
                    paint = paint2;
                    canvas.drawRect(0.0f, 0.0f, (1.0f - a3Var.f14805h0) * i10, getHeight(), paint);
                } else {
                    paint = paint2;
                }
                if (rect2.top > 0) {
                    canvas.drawRect(0.0f, 0.0f, getWidth(), (1.0f - a3Var.f14805h0) * rect2.top, paint);
                }
                if (rect2.bottom > 0) {
                    float height = getHeight();
                    float f12 = rect2.bottom;
                    w2 w2Var = a3Var.f14811n0;
                    if (w2Var != null && w2Var.getTotalHeight() > 0) {
                        f10 = 1.0f;
                    } else {
                        f10 = 1.0f - a3Var.f14805h0;
                    }
                    canvas.drawRect(0.0f, height - (f12 * f10), getWidth(), getHeight(), paint);
                }
                if (rect2.right > 0) {
                    canvas.drawRect(a1.g.D(1.0f, a3Var.f14805h0, rect2.right, getWidth()), 0.0f, getWidth(), getHeight(), paint);
                }
            }
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.b3 b3Var;
        a3 a3Var = this.f15347k0;
        Rect rect = a3Var.f14810n;
        LaunchActivity launchActivity = LaunchActivity.K1;
        if (launchActivity != null) {
            b3Var = launchActivity.O();
        } else {
            b3Var = null;
        }
        if (b3Var != null && rect != null) {
            int i3 = (int) ((1.0f - a3Var.f14805h0) * ((int) b3Var.H));
            if (motionEvent.getY() >= (getHeight() - rect.bottom) - i3 && motionEvent.getY() <= getHeight() - rect.bottom && !org.telegram.messenger.g0.Q1()) {
                return b3Var.j(motionEvent.getX(), motionEvent.getY() - ((getHeight() - rect.bottom) - i3), motionEvent.getAction());
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void draw(Canvas canvas) {
        float f10;
        float T1;
        a3 a3Var = this.f15347k0;
        Rect rect = a3Var.f14810n;
        r2 r2Var = a3Var.f14824x;
        Paint paint = a3Var.P;
        x2 x2Var = a3Var.Y;
        Drawable drawable = a3Var.f14793a0;
        if (this.f15344h0) {
            return;
        }
        super.draw(canvas);
        if (org.telegram.messenger.g0.Q1()) {
            f10 = 0.0f;
        } else {
            f10 = a3Var.f14797c;
        }
        paint.setColor(a3Var.f14792a);
        paint.setAlpha((int) ((1.0f - a3Var.f14805h0) * (1.0f - (Math.min(0.5f, f10) / 0.5f)) * paint.getAlpha()));
        canvas.save();
        float f11 = 1.0f - f10;
        if (org.telegram.messenger.g0.Q1()) {
            T1 = org.telegram.messenger.g0.T1(r2Var.getTranslationY() + org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.f22602m / 2.0f, a3Var.f14797c);
        } else {
            T1 = org.telegram.messenger.g0.T1(r2Var.getTranslationY(), (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f) + org.telegram.messenger.g0.f22602m, f10) + org.telegram.messenger.g0.L(12.0f);
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
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        boolean z10;
        a3 a3Var = this.f15347k0;
        if (view == a3Var.f14824x && a3Var.f14807j0 && a3Var.f14809l0 > 0 && a3Var.f14808k0 > 0) {
            canvas.save();
            canvas.clipRect(view.getX(), view.getY(), view.getX() + org.telegram.messenger.g0.W1(a3Var.f14806i0, a3Var.f14808k0, view.getWidth()), view.getY() + org.telegram.messenger.g0.W1(a3Var.f14806i0, a3Var.f14809l0, view.getHeight()));
            z10 = true;
        } else {
            z10 = false;
        }
        boolean drawChild = super.drawChild(canvas, view, j10);
        if (z10) {
            canvas.restore();
        }
        return drawChild;
    }

    @Override
    public RectF getRect() {
        r2 r2Var = this.f15347k0.f14824x;
        RectF rectF = this.f15345i0;
        rectF.set(r2Var.getLeft(), r2Var.getTranslationY() + org.telegram.messenger.g0.L(24.0f), r2Var.getRight(), getHeight());
        return rectF;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setTag(2131296351, new ai.y(4));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setTag(2131296351, null);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        int i3;
        boolean z10;
        a3 a3Var = this.f15347k0;
        Paint paint = a3Var.V;
        Paint paint2 = a3Var.R;
        r2 r2Var = a3Var.f14824x;
        if (!this.f15344h0) {
            super.onDraw(canvas);
            if (a3Var.f14820u0.getVisibility() != 0) {
                canvas.save();
                ke keVar = a3Var.f14822w;
                float f10 = 1.0f;
                if (keVar != null) {
                    int width = getWidth();
                    getHeight();
                    canvas2 = canvas;
                    keVar.j(canvas2, false, false, width, 1.0f - a3Var.f14805h0);
                } else {
                    canvas2 = canvas;
                }
                if (!a3Var.X) {
                    int w02 = k6.w0(k6.f27878d6, a3Var.G);
                    paint2.setColor(w02);
                    a3Var.E.setFlickerViewColor(w02);
                    org.telegram.ui.c3 c3Var = a3Var.Z0;
                    if (c3Var != null) {
                        if (org.telegram.messenger.g0.B(paint2.getColor()) <= 0.721f) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        c3Var.b(z10, false);
                        a3Var.Z0.setBackgroundColor(paint2.getColor());
                    }
                }
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                canvas2.drawRect(rectF, a3Var.Q);
                org.telegram.ui.ActionBar.b3 b3Var = a3Var.f14817s;
                if (b3Var != null) {
                    i3 = (int) b3Var.H;
                } else {
                    i3 = 0;
                }
                paint.setColor(a3Var.S);
                float L = org.telegram.messenger.g0.L(16.0f);
                if (!org.telegram.messenger.g0.Q1()) {
                    f10 = 1.0f - a3Var.f14797c;
                }
                float f11 = L * f10;
                rectF.set(org.telegram.messenger.g0.W1(a3Var.f14805h0, r2Var.getLeft(), 0), org.telegram.messenger.g0.T1(r2Var.getTranslationY(), 0.0f, a3Var.f14797c), r2Var.getRight(), r2Var.getTranslationY() + org.telegram.messenger.g0.L(24.0f) + f11);
                canvas2.drawRoundRect(rectF, f11, f11, paint);
                int left = r2Var.getLeft();
                rectF.set(org.telegram.messenger.g0.W1(a3Var.f14805h0, left, 0), r2Var.getTranslationY() + org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.W1(a3Var.f14805h0, r2Var.getRight(), getWidth()), getHeight() - i3);
                canvas2.drawRect(rectF, paint2);
                canvas2.restore();
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        a3 a3Var = this.f15347k0;
        r2 r2Var = a3Var.f14824x;
        if (motionEvent.getAction() == 0 && (motionEvent.getY() <= org.telegram.messenger.g0.T1(r2Var.getTranslationY() + org.telegram.messenger.g0.L(24.0f), 0.0f, a3Var.f14797c) || motionEvent.getX() > r2Var.getRight() || motionEvent.getX() < r2Var.getLeft())) {
            a3Var.o(true);
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public void setDrawingFromOverlay(boolean z10) {
        if (this.f15344h0 != z10) {
            this.f15344h0 = z10;
            invalidate();
            a3 a3Var = this.f15347k0;
            a3Var.L();
            LaunchActivity launchActivity = LaunchActivity.K1;
            if (launchActivity != null && a3Var.f14803f0) {
                launchActivity.D0(a3Var.T);
            }
        }
    }

    @Override
    public final void updateColors() {
        int w02;
        a3 a3Var = this.f15347k0;
        Paint paint = a3Var.R;
        z2 z2Var = a3Var.f14802f;
        x2 x2Var = a3Var.Y;
        e6 e6Var = a3Var.G;
        if (x2Var != null && z2Var != null) {
            try {
                if (a3Var.E != null && paint != null) {
                    if (!a3Var.W) {
                        int i3 = a3Var.f14823w0;
                        if (i3 < 0) {
                            i3 = k6.f27878d6;
                        }
                        int w03 = k6.w0(i3, e6Var);
                        int i10 = a3Var.S;
                        if (w03 != i10) {
                            a3Var.S = w03;
                            if ((x2Var.getBackground() instanceof ColorDrawable) && ((ColorDrawable) x2Var.getBackground()).getColor() == i10) {
                                x2Var.setBackgroundColor(a3Var.S);
                            }
                        }
                    }
                    if (a3Var.J0 && a3Var.f14811n0 != null && (w02 = k6.w0(k6.f27824a7, e6Var)) != a3Var.T) {
                        a3Var.D(w02, false);
                        a3Var.J0 = true;
                    }
                    if (a3Var.f14792a == a3Var.f14795b) {
                        int x02 = k6.x0(null, k6.wj, false);
                        a3Var.f14795b = x02;
                        a3Var.f14792a = x02;
                    }
                    int color = paint.getColor();
                    if (!a3Var.W) {
                        color = (((((((((((color * 31) + k6.w0(k6.G6, e6Var)) * 31) + k6.w0(k6.f28198u8, e6Var)) * 31) + k6.w0(k6.G8, e6Var)) * 31) + k6.w0(k6.E8, e6Var)) * 31) + k6.w0(k6.F8, e6Var)) * 31) + k6.w0(k6.I5, e6Var);
                    }
                    if (!a3Var.K0 || color != a3Var.L0) {
                        a3Var.K0 = true;
                        a3Var.L0 = color;
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
    public final float y(Canvas canvas, RectF rectF, float f10, RectF rectF2, float f11) {
        a3 a3Var = this.f15347k0;
        r2 r2Var = a3Var.f14824x;
        RectF rectF3 = this.f15345i0;
        rectF3.set(r2Var.getLeft(), r2Var.getTranslationY() + org.telegram.messenger.g0.L(24.0f), r2Var.getRight(), getHeight());
        org.telegram.messenger.g0.c2(rectF3, rectF, f10, rectF2);
        canvas.save();
        Path path = this.f15346j0;
        path.rewind();
        float L = org.telegram.messenger.g0.L(16.0f);
        float f12 = 1.0f;
        if (!org.telegram.messenger.g0.Q1()) {
            f12 = 1.0f - a3Var.f14797c;
        }
        float T1 = org.telegram.messenger.g0.T1(L * f12, org.telegram.messenger.g0.L(18.0f), f10);
        path.addRoundRect(rectF2, T1, T1, Path.Direction.CW);
        canvas.clipPath(path);
        canvas.drawPaint(a3Var.R);
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
