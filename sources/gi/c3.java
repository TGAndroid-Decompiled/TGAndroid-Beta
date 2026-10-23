package gi;

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
import com.google.android.gms.internal.cast.z5;
import ei.o8;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.ow0;
import org.telegram.ui.Components.pe0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.LaunchActivity;
public final class c3 extends ow0 implements org.telegram.ui.ActionBar.x3 {
    public final d3 A0;
    public final Paint f11131w0;
    public boolean f11132x0;
    public final RectF f11133y0;
    public final Path f11134z0;

    public c3(d3 d3Var, Context context) {
        super(context, null);
        this.A0 = d3Var;
        setClipChildren(false);
        setClipToPadding(false);
        setWillNotDraw(false);
        this.f11131w0 = new Paint(1);
        this.f11133y0 = new RectF();
        this.f11134z0 = new Path();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(k6.f21183d6));
        hashSet.add(Integer.valueOf(k6.f21125a7));
        hashSet.add(Integer.valueOf(k6.G6));
        hashSet.add(Integer.valueOf(k6.f21501u8));
        hashSet.add(Integer.valueOf(k6.G8));
        hashSet.add(Integer.valueOf(k6.E8));
        hashSet.add(Integer.valueOf(k6.F8));
        hashSet.add(Integer.valueOf(k6.I5));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        Paint paint;
        float f7;
        d3 d3Var = this.A0;
        pe0 pe0Var = d3Var.f11181t0;
        Rect rect = d3Var.f11172n;
        Rect rect2 = d3Var.h;
        if (!this.f11132x0) {
            int visibility = pe0Var.getVisibility();
            Paint paint2 = this.f11131w0;
            if (visibility != 0) {
                float f10 = d3Var.f11166g0;
                if (f10 < 1.0f && f10 > 0.0f) {
                    paint2.setColor(k6.o1(d3Var.R0, d3Var.S));
                    int i10 = rect2.left;
                    if (i10 > 0) {
                        canvas.drawRect(0.0f, 0.0f, i10, getHeight(), paint2);
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
            if (d3Var.v != null && !AndroidUtilities.isTablet()) {
                canvas.save();
                canvas.translate((1.0f - d3Var.f11166g0) * rect.left, 0.0f);
                z5 z5Var = d3Var.v;
                int lerp = AndroidUtilities.lerp((getWidth() - rect.left) - rect.right, getWidth(), d3Var.f11166g0);
                getHeight();
                z5Var.n(canvas, true, false, lerp, 1.0f - d3Var.f11166g0);
                canvas.translate((1.0f - d3Var.f11166g0) * (-rect.left), 0.0f);
                z10 = true;
            } else {
                z10 = false;
            }
            super.dispatchDraw(canvas);
            if (z10) {
                canvas.restore();
            }
            if (pe0Var.getVisibility() != 0) {
                paint2.setColor(k6.o1(d3Var.R0, d3Var.S));
                int i11 = rect2.left;
                if (i11 > 0) {
                    paint = paint2;
                    canvas.drawRect(0.0f, 0.0f, (1.0f - d3Var.f11166g0) * i11, getHeight(), paint);
                } else {
                    paint = paint2;
                }
                if (rect2.top > 0) {
                    canvas.drawRect(0.0f, 0.0f, getWidth(), (1.0f - d3Var.f11166g0) * rect2.top, paint);
                }
                if (rect2.bottom > 0) {
                    float height = getHeight();
                    float f11 = rect2.bottom;
                    z2 z2Var = d3Var.m0;
                    if (z2Var != null && z2Var.getTotalHeight() > 0) {
                        f7 = 1.0f;
                    } else {
                        f7 = 1.0f - d3Var.f11166g0;
                    }
                    canvas.drawRect(0.0f, height - (f11 * f7), getWidth(), getHeight(), paint);
                }
                if (rect2.right > 0) {
                    canvas.drawRect(com.google.android.gms.internal.play_billing.k3.D(1.0f, d3Var.f11166g0, rect2.right, getWidth()), 0.0f, getWidth(), getHeight(), paint);
                }
            }
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.q3 q3Var;
        d3 d3Var = this.A0;
        Rect rect = d3Var.f11172n;
        LaunchActivity launchActivity = LaunchActivity.J1;
        if (launchActivity != null) {
            q3Var = launchActivity.P();
        } else {
            q3Var = null;
        }
        if (q3Var != null && rect != null) {
            int i10 = (int) ((1.0f - d3Var.f11166g0) * ((int) q3Var.G));
            if (motionEvent.getY() >= (getHeight() - rect.bottom) - i10 && motionEvent.getY() <= getHeight() - rect.bottom && !AndroidUtilities.isTablet()) {
                return q3Var.j(motionEvent.getX(), motionEvent.getY() - ((getHeight() - rect.bottom) - i10), motionEvent.getAction());
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void draw(Canvas canvas) {
        float f7;
        float lerp;
        d3 d3Var = this.A0;
        Rect rect = d3Var.f11172n;
        u2 u2Var = d3Var.f11184w;
        Paint paint = d3Var.O;
        a3 a3Var = d3Var.X;
        Drawable drawable = d3Var.Z;
        if (this.f11132x0) {
            return;
        }
        super.draw(canvas);
        if (AndroidUtilities.isTablet()) {
            f7 = 0.0f;
        } else {
            f7 = d3Var.f11160c;
        }
        paint.setColor(d3Var.f11156a);
        paint.setAlpha((int) ((1.0f - d3Var.f11166g0) * (1.0f - (Math.min(0.5f, f7) / 0.5f)) * paint.getAlpha()));
        canvas.save();
        float f10 = 1.0f - f7;
        if (AndroidUtilities.isTablet()) {
            lerp = AndroidUtilities.lerp(u2Var.getTranslationY() + AndroidUtilities.dp(12.0f), AndroidUtilities.statusBarHeight / 2.0f, d3Var.f11160c);
        } else {
            lerp = AndroidUtilities.lerp(u2Var.getTranslationY(), (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f) + AndroidUtilities.statusBarHeight, f7) + AndroidUtilities.dp(12.0f);
        }
        canvas.scale(f10, f10, getWidth() / 2.0f, lerp);
        canvas.drawLine((getWidth() / 2.0f) - AndroidUtilities.dp(16.0f), lerp, (getWidth() / 2.0f) + AndroidUtilities.dp(16.0f), lerp, paint);
        canvas.restore();
        drawable.setAlpha((int) (a3Var.getAlpha() * 255.0f));
        float translationY = a3Var.getTranslationY() + a3Var.getY() + a3Var.getHeight();
        drawable.setBounds(rect.left, (int) translationY, getWidth() - rect.right, (int) (translationY + drawable.getIntrinsicHeight()));
        drawable.draw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        boolean z10;
        d3 d3Var = this.A0;
        if (view == d3Var.f11184w && d3Var.f11168i0 && d3Var.f11170k0 > 0 && d3Var.f11169j0 > 0) {
            canvas.save();
            canvas.clipRect(view.getX(), view.getY(), view.getX() + AndroidUtilities.lerp(d3Var.f11169j0, view.getWidth(), d3Var.f11167h0), view.getY() + AndroidUtilities.lerp(d3Var.f11170k0, view.getHeight(), d3Var.f11167h0));
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
        u2 u2Var = this.A0.f11184w;
        RectF rectF = this.f11133y0;
        rectF.set(u2Var.getLeft(), u2Var.getTranslationY() + AndroidUtilities.dp(24.0f), u2Var.getRight(), getHeight());
        return rectF;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        qc.a(this, new o8(3));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        qc.h(this);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        int i10;
        boolean z10;
        d3 d3Var = this.A0;
        Paint paint = d3Var.U;
        Paint paint2 = d3Var.Q;
        u2 u2Var = d3Var.f11184w;
        if (!this.f11132x0) {
            super.onDraw(canvas);
            if (d3Var.f11181t0.getVisibility() != 0) {
                canvas.save();
                z5 z5Var = d3Var.v;
                float f7 = 1.0f;
                if (z5Var != null) {
                    int width = getWidth();
                    getHeight();
                    canvas2 = canvas;
                    z5Var.n(canvas2, false, false, width, 1.0f - d3Var.f11166g0);
                } else {
                    canvas2 = canvas;
                }
                if (!d3Var.W) {
                    int w02 = k6.w0(k6.f21183d6, d3Var.F);
                    paint2.setColor(w02);
                    d3Var.f11188y.setFlickerViewColor(w02);
                    org.telegram.ui.e3 e3Var = d3Var.Y0;
                    if (e3Var != null) {
                        if (AndroidUtilities.computePerceivedBrightness(paint2.getColor()) <= 0.721f) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        e3Var.b(z10, false);
                        d3Var.Y0.setBackgroundColor(paint2.getColor());
                    }
                }
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                canvas2.drawRect(rectF, d3Var.P);
                org.telegram.ui.ActionBar.q3 q3Var = d3Var.f11179s;
                if (q3Var != null) {
                    i10 = (int) q3Var.G;
                } else {
                    i10 = 0;
                }
                paint.setColor(d3Var.R);
                float dp = AndroidUtilities.dp(16.0f);
                if (!AndroidUtilities.isTablet()) {
                    f7 = 1.0f - d3Var.f11160c;
                }
                float f10 = dp * f7;
                rectF.set(AndroidUtilities.lerp(u2Var.getLeft(), 0, d3Var.f11166g0), AndroidUtilities.lerp(u2Var.getTranslationY(), 0.0f, d3Var.f11160c), u2Var.getRight(), u2Var.getTranslationY() + AndroidUtilities.dp(24.0f) + f10);
                canvas2.drawRoundRect(rectF, f10, f10, paint);
                rectF.set(AndroidUtilities.lerp(u2Var.getLeft(), 0, d3Var.f11166g0), u2Var.getTranslationY() + AndroidUtilities.dp(24.0f), AndroidUtilities.lerp(u2Var.getRight(), getWidth(), d3Var.f11166g0), getHeight() - i10);
                canvas2.drawRect(rectF, paint2);
                canvas2.restore();
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        d3 d3Var = this.A0;
        u2 u2Var = d3Var.f11184w;
        if (motionEvent.getAction() == 0 && (motionEvent.getY() <= AndroidUtilities.lerp(u2Var.getTranslationY() + AndroidUtilities.dp(24.0f), 0.0f, d3Var.f11160c) || motionEvent.getX() > u2Var.getRight() || motionEvent.getX() < u2Var.getLeft())) {
            d3Var.k(true);
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public void setDrawingFromOverlay(boolean z10) {
        if (this.f11132x0 != z10) {
            this.f11132x0 = z10;
            invalidate();
            d3 d3Var = this.A0;
            d3Var.H();
            LaunchActivity launchActivity = LaunchActivity.J1;
            if (launchActivity != null && d3Var.f11163e0) {
                launchActivity.E0(d3Var.S);
            }
        }
    }

    @Override
    public final void updateColors() {
        int w02;
        d3 d3Var = this.A0;
        Paint paint = d3Var.Q;
        c3 c3Var = d3Var.f11164f;
        a3 a3Var = d3Var.X;
        g6 g6Var = d3Var.F;
        if (a3Var != null && c3Var != null) {
            try {
                if (d3Var.f11188y != null && paint != null) {
                    if (!d3Var.V) {
                        int i10 = d3Var.f11183v0;
                        if (i10 < 0) {
                            i10 = k6.f21183d6;
                        }
                        int w03 = k6.w0(i10, g6Var);
                        int i11 = d3Var.R;
                        if (w03 != i11) {
                            d3Var.R = w03;
                            if ((a3Var.getBackground() instanceof ColorDrawable) && ((ColorDrawable) a3Var.getBackground()).getColor() == i11) {
                                a3Var.setBackgroundColor(d3Var.R);
                            }
                        }
                    }
                    if (d3Var.I0 && d3Var.m0 != null && (w02 = k6.w0(k6.f21125a7, g6Var)) != d3Var.S) {
                        d3Var.z(w02, false);
                        d3Var.I0 = true;
                    }
                    if (d3Var.f11156a == d3Var.f11158b) {
                        int x02 = k6.x0(null, k6.Ii, false);
                        d3Var.f11158b = x02;
                        d3Var.f11156a = x02;
                    }
                    int color = paint.getColor();
                    if (!d3Var.V) {
                        color = (((((((((((color * 31) + k6.w0(k6.G6, g6Var)) * 31) + k6.w0(k6.f21501u8, g6Var)) * 31) + k6.w0(k6.G8, g6Var)) * 31) + k6.w0(k6.E8, g6Var)) * 31) + k6.w0(k6.F8, g6Var)) * 31) + k6.w0(k6.I5, g6Var);
                    }
                    if (!d3Var.J0 || color != d3Var.K0) {
                        d3Var.J0 = true;
                        d3Var.K0 = color;
                        d3Var.B();
                    }
                    d3Var.F();
                    c3Var.invalidate();
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    @Override
    public final float y(Canvas canvas, RectF rectF, float f7, RectF rectF2, float f10) {
        d3 d3Var = this.A0;
        u2 u2Var = d3Var.f11184w;
        RectF rectF3 = this.f11133y0;
        rectF3.set(u2Var.getLeft(), u2Var.getTranslationY() + AndroidUtilities.dp(24.0f), u2Var.getRight(), getHeight());
        AndroidUtilities.lerpCentered(rectF3, rectF, f7, rectF2);
        canvas.save();
        Path path = this.f11134z0;
        path.rewind();
        float dp = AndroidUtilities.dp(16.0f);
        float f11 = 1.0f;
        if (!AndroidUtilities.isTablet()) {
            f11 = 1.0f - d3Var.f11160c;
        }
        float lerp = AndroidUtilities.lerp(dp * f11, AndroidUtilities.dp(18.0f), f7);
        path.addRoundRect(rectF2, lerp, lerp, Path.Direction.CW);
        canvas.clipPath(path);
        canvas.drawPaint(d3Var.Q);
        if (u2Var != null) {
            canvas.save();
            canvas.translate(rectF2.left, (f7 * AndroidUtilities.dp(51.0f)) + Math.max(u2Var.getY(), rectF2.top));
            u2Var.draw(canvas);
            canvas.restore();
        }
        canvas.restore();
        return lerp;
    }
}
