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
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.cu0;
import org.telegram.ui.Components.oc0;
import org.telegram.ui.LaunchActivity;
public final class s2 extends cu0 implements org.telegram.ui.ActionBar.k3 {
    public final Paint f18982g0;
    public boolean f18983h0;
    public final RectF f18984i0;
    public final Path f18985j0;
    public final t2 f18986k0;

    public s2(t2 t2Var, Context context) {
        super(context, null);
        this.f18986k0 = t2Var;
        setClipChildren(false);
        setClipToPadding(false);
        setWillNotDraw(false);
        this.f18982g0 = new Paint(1);
        this.f18984i0 = new RectF();
        this.f18985j0 = new Path();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(n6.f29451d6));
        hashSet.add(Integer.valueOf(n6.f29394a7));
        hashSet.add(Integer.valueOf(n6.G6));
        hashSet.add(Integer.valueOf(n6.f29769u8));
        hashSet.add(Integer.valueOf(n6.G8));
        hashSet.add(Integer.valueOf(n6.E8));
        hashSet.add(Integer.valueOf(n6.F8));
        hashSet.add(Integer.valueOf(n6.I5));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        Paint paint;
        float f10;
        t2 t2Var = this.f18986k0;
        oc0 oc0Var = t2Var.f19043u0;
        Rect rect = t2Var.f19033n;
        Rect rect2 = t2Var.h;
        if (!this.f18983h0) {
            int visibility = oc0Var.getVisibility();
            Paint paint2 = this.f18982g0;
            if (visibility != 0) {
                float f11 = t2Var.f19028h0;
                if (f11 < 1.0f && f11 > 0.0f) {
                    paint2.setColor(n6.r1(t2Var.S0, t2Var.T));
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
            if (t2Var.f19045w != null && !org.telegram.messenger.g0.Q1()) {
                canvas.save();
                canvas.translate((1.0f - t2Var.f19028h0) * rect.left, 0.0f);
                r7 r7Var = t2Var.f19045w;
                int W1 = org.telegram.messenger.g0.W1(t2Var.f19028h0, (getWidth() - rect.left) - rect.right, getWidth());
                getHeight();
                r7Var.p(canvas, true, false, W1, 1.0f - t2Var.f19028h0);
                canvas.translate((1.0f - t2Var.f19028h0) * (-rect.left), 0.0f);
                z10 = true;
            } else {
                z10 = false;
            }
            super.dispatchDraw(canvas);
            if (z10) {
                canvas.restore();
            }
            if (oc0Var.getVisibility() != 0) {
                paint2.setColor(n6.r1(t2Var.S0, t2Var.T));
                int i10 = rect2.left;
                if (i10 > 0) {
                    paint = paint2;
                    canvas.drawRect(0.0f, 0.0f, (1.0f - t2Var.f19028h0) * i10, getHeight(), paint);
                } else {
                    paint = paint2;
                }
                if (rect2.top > 0) {
                    canvas.drawRect(0.0f, 0.0f, getWidth(), (1.0f - t2Var.f19028h0) * rect2.top, paint);
                }
                if (rect2.bottom > 0) {
                    float height = getHeight();
                    float f12 = rect2.bottom;
                    p2 p2Var = t2Var.f19034n0;
                    if (p2Var != null && p2Var.getTotalHeight() > 0) {
                        f10 = 1.0f;
                    } else {
                        f10 = 1.0f - t2Var.f19028h0;
                    }
                    canvas.drawRect(0.0f, height - (f12 * f10), getWidth(), getHeight(), paint);
                }
                if (rect2.right > 0) {
                    canvas.drawRect(com.google.android.gms.internal.vision.e2.t(1.0f, t2Var.f19028h0, rect2.right, getWidth()), 0.0f, getWidth(), getHeight(), paint);
                }
            }
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.f3 f3Var;
        t2 t2Var = this.f18986k0;
        Rect rect = t2Var.f19033n;
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (launchActivity != null) {
            f3Var = launchActivity.N();
        } else {
            f3Var = null;
        }
        if (f3Var != null && rect != null) {
            int i7 = (int) ((1.0f - t2Var.f19028h0) * ((int) f3Var.H));
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
        t2 t2Var = this.f18986k0;
        Rect rect = t2Var.f19033n;
        j2 j2Var = t2Var.f19047x;
        Paint paint = t2Var.P;
        q2 q2Var = t2Var.Y;
        Drawable drawable = t2Var.f19016a0;
        if (this.f18983h0) {
            return;
        }
        super.draw(canvas);
        if (org.telegram.messenger.g0.Q1()) {
            f10 = 0.0f;
        } else {
            f10 = t2Var.f19020c;
        }
        paint.setColor(t2Var.f19015a);
        paint.setAlpha((int) ((1.0f - t2Var.f19028h0) * (1.0f - (Math.min(0.5f, f10) / 0.5f)) * paint.getAlpha()));
        canvas.save();
        float f11 = 1.0f - f10;
        if (org.telegram.messenger.g0.Q1()) {
            T1 = org.telegram.messenger.g0.T1(j2Var.getTranslationY() + org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.f24220m / 2.0f, t2Var.f19020c);
        } else {
            T1 = org.telegram.messenger.g0.T1(j2Var.getTranslationY(), (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f) + org.telegram.messenger.g0.f24220m, f10) + org.telegram.messenger.g0.L(12.0f);
        }
        canvas.scale(f11, f11, getWidth() / 2.0f, T1);
        canvas.drawLine((getWidth() / 2.0f) - org.telegram.messenger.g0.L(16.0f), T1, (getWidth() / 2.0f) + org.telegram.messenger.g0.L(16.0f), T1, paint);
        canvas.restore();
        drawable.setAlpha((int) (q2Var.getAlpha() * 255.0f));
        float translationY = q2Var.getTranslationY() + q2Var.getY() + q2Var.getHeight();
        drawable.setBounds(rect.left, (int) translationY, getWidth() - rect.right, (int) (translationY + drawable.getIntrinsicHeight()));
        drawable.draw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        boolean z10;
        t2 t2Var = this.f18986k0;
        if (view == t2Var.f19047x && t2Var.f19030j0 && t2Var.f19032l0 > 0 && t2Var.f19031k0 > 0) {
            canvas.save();
            canvas.clipRect(view.getX(), view.getY(), view.getX() + org.telegram.messenger.g0.W1(t2Var.f19029i0, t2Var.f19031k0, view.getWidth()), view.getY() + org.telegram.messenger.g0.W1(t2Var.f19029i0, t2Var.f19032l0, view.getHeight()));
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
        j2 j2Var = this.f18986k0.f19047x;
        RectF rectF = this.f18984i0;
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
        t2 t2Var = this.f18986k0;
        Paint paint = t2Var.V;
        Paint paint2 = t2Var.R;
        j2 j2Var = t2Var.f19047x;
        if (!this.f18983h0) {
            super.onDraw(canvas);
            if (t2Var.f19043u0.getVisibility() != 0) {
                canvas.save();
                r7 r7Var = t2Var.f19045w;
                float f10 = 1.0f;
                if (r7Var != null) {
                    int width = getWidth();
                    getHeight();
                    canvas2 = canvas;
                    r7Var.p(canvas2, false, false, width, 1.0f - t2Var.f19028h0);
                } else {
                    canvas2 = canvas;
                }
                if (!t2Var.X) {
                    int w02 = n6.w0(n6.f29451d6, t2Var.G);
                    paint2.setColor(w02);
                    t2Var.E.setFlickerViewColor(w02);
                    org.telegram.ui.b3 b3Var = t2Var.Z0;
                    if (b3Var != null) {
                        if (org.telegram.messenger.g0.B(paint2.getColor()) <= 0.721f) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        b3Var.b(z10, false);
                        t2Var.Z0.setBackgroundColor(paint2.getColor());
                    }
                }
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                canvas2.drawRect(rectF, t2Var.Q);
                org.telegram.ui.ActionBar.f3 f3Var = t2Var.f19040s;
                if (f3Var != null) {
                    i7 = (int) f3Var.H;
                } else {
                    i7 = 0;
                }
                paint.setColor(t2Var.S);
                float L = org.telegram.messenger.g0.L(16.0f);
                if (!org.telegram.messenger.g0.Q1()) {
                    f10 = 1.0f - t2Var.f19020c;
                }
                float f11 = L * f10;
                rectF.set(org.telegram.messenger.g0.W1(t2Var.f19028h0, j2Var.getLeft(), 0), org.telegram.messenger.g0.T1(j2Var.getTranslationY(), 0.0f, t2Var.f19020c), j2Var.getRight(), j2Var.getTranslationY() + org.telegram.messenger.g0.L(24.0f) + f11);
                canvas2.drawRoundRect(rectF, f11, f11, paint);
                int left = j2Var.getLeft();
                rectF.set(org.telegram.messenger.g0.W1(t2Var.f19028h0, left, 0), j2Var.getTranslationY() + org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.W1(t2Var.f19028h0, j2Var.getRight(), getWidth()), getHeight() - i7);
                canvas2.drawRect(rectF, paint2);
                canvas2.restore();
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        t2 t2Var = this.f18986k0;
        j2 j2Var = t2Var.f19047x;
        if (motionEvent.getAction() == 0 && (motionEvent.getY() <= org.telegram.messenger.g0.T1(j2Var.getTranslationY() + org.telegram.messenger.g0.L(24.0f), 0.0f, t2Var.f19020c) || motionEvent.getX() > j2Var.getRight() || motionEvent.getX() < j2Var.getLeft())) {
            t2Var.o(true);
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public void setDrawingFromOverlay(boolean z10) {
        if (this.f18983h0 != z10) {
            this.f18983h0 = z10;
            invalidate();
            t2 t2Var = this.f18986k0;
            t2Var.L();
            LaunchActivity launchActivity = LaunchActivity.H1;
            if (launchActivity != null && t2Var.f19026f0) {
                launchActivity.D0(t2Var.T);
            }
        }
    }

    @Override
    public final void updateColors() {
        int w02;
        t2 t2Var = this.f18986k0;
        Paint paint = t2Var.R;
        s2 s2Var = t2Var.f19025f;
        q2 q2Var = t2Var.Y;
        i6 i6Var = t2Var.G;
        if (q2Var != null && s2Var != null) {
            try {
                if (t2Var.E != null && paint != null) {
                    if (!t2Var.W) {
                        int i7 = t2Var.f19046w0;
                        if (i7 < 0) {
                            i7 = n6.f29451d6;
                        }
                        int w03 = n6.w0(i7, i6Var);
                        int i10 = t2Var.S;
                        if (w03 != i10) {
                            t2Var.S = w03;
                            if ((q2Var.getBackground() instanceof ColorDrawable) && ((ColorDrawable) q2Var.getBackground()).getColor() == i10) {
                                q2Var.setBackgroundColor(t2Var.S);
                            }
                        }
                    }
                    if (t2Var.J0 && t2Var.f19034n0 != null && (w02 = n6.w0(n6.f29394a7, i6Var)) != t2Var.T) {
                        t2Var.D(w02, false);
                        t2Var.J0 = true;
                    }
                    if (t2Var.f19015a == t2Var.f19018b) {
                        int x02 = n6.x0(null, n6.zj, false);
                        t2Var.f19018b = x02;
                        t2Var.f19015a = x02;
                    }
                    int color = paint.getColor();
                    if (!t2Var.W) {
                        color = (((((((((((color * 31) + n6.w0(n6.G6, i6Var)) * 31) + n6.w0(n6.f29769u8, i6Var)) * 31) + n6.w0(n6.G8, i6Var)) * 31) + n6.w0(n6.E8, i6Var)) * 31) + n6.w0(n6.F8, i6Var)) * 31) + n6.w0(n6.I5, i6Var);
                    }
                    if (!t2Var.K0 || color != t2Var.L0) {
                        t2Var.K0 = true;
                        t2Var.L0 = color;
                        t2Var.F();
                    }
                    t2Var.J();
                    s2Var.invalidate();
                }
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
    }

    @Override
    public final float z(Canvas canvas, RectF rectF, float f10, RectF rectF2, float f11) {
        t2 t2Var = this.f18986k0;
        j2 j2Var = t2Var.f19047x;
        RectF rectF3 = this.f18984i0;
        rectF3.set(j2Var.getLeft(), j2Var.getTranslationY() + org.telegram.messenger.g0.L(24.0f), j2Var.getRight(), getHeight());
        org.telegram.messenger.g0.c2(rectF3, rectF, f10, rectF2);
        canvas.save();
        Path path = this.f18985j0;
        path.rewind();
        float L = org.telegram.messenger.g0.L(16.0f);
        float f12 = 1.0f;
        if (!org.telegram.messenger.g0.Q1()) {
            f12 = 1.0f - t2Var.f19020c;
        }
        float T1 = org.telegram.messenger.g0.T1(L * f12, org.telegram.messenger.g0.L(18.0f), f10);
        path.addRoundRect(rectF2, T1, T1, Path.Direction.CW);
        canvas.clipPath(path);
        canvas.drawPaint(t2Var.R);
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
