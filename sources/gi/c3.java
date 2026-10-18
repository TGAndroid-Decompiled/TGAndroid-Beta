package gi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.cast.z5;
import ei.o8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.jw0;
import org.telegram.ui.Components.le0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.LaunchActivity;
public final class c3 extends jw0 implements org.telegram.ui.ActionBar.u3 {
    public final d3 A0;
    public final Paint f11113w0;
    public boolean f11114x0;
    public final RectF f11115y0;
    public final Path f11116z0;

    public c3(d3 d3Var, Context context) {
        super(context, null);
        this.A0 = d3Var;
        setClipChildren(false);
        setClipToPadding(false);
        setWillNotDraw(false);
        this.f11113w0 = new Paint(1);
        this.f11115y0 = new RectF();
        this.f11116z0 = new Path();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        Paint paint;
        float f7;
        d3 d3Var = this.A0;
        le0 le0Var = d3Var.f11159s0;
        Rect rect = d3Var.h;
        Rect rect2 = d3Var.f11143f;
        if (!this.f11114x0) {
            int visibility = le0Var.getVisibility();
            Paint paint2 = this.f11113w0;
            if (visibility != 0) {
                float f10 = d3Var.f11144f0;
                if (f10 < 1.0f && f10 > 0.0f) {
                    paint2.setColor(h6.m1(d3Var.N0, d3Var.R));
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
            if (d3Var.f11158s != null && !AndroidUtilities.isTablet()) {
                canvas.save();
                canvas.translate((1.0f - d3Var.f11144f0) * rect.left, 0.0f);
                z5 z5Var = d3Var.f11158s;
                int lerp = AndroidUtilities.lerp((getWidth() - rect.left) - rect.right, getWidth(), d3Var.f11144f0);
                getHeight();
                z5Var.r(canvas, true, false, lerp, 1.0f - d3Var.f11144f0);
                canvas.translate((1.0f - d3Var.f11144f0) * (-rect.left), 0.0f);
                z10 = true;
            } else {
                z10 = false;
            }
            super.dispatchDraw(canvas);
            if (z10) {
                canvas.restore();
            }
            if (le0Var.getVisibility() != 0) {
                paint2.setColor(h6.m1(d3Var.N0, d3Var.R));
                int i11 = rect2.left;
                if (i11 > 0) {
                    paint = paint2;
                    canvas.drawRect(0.0f, 0.0f, (1.0f - d3Var.f11144f0) * i11, getHeight(), paint);
                } else {
                    paint = paint2;
                }
                if (rect2.top > 0) {
                    canvas.drawRect(0.0f, 0.0f, getWidth(), (1.0f - d3Var.f11144f0) * rect2.top, paint);
                }
                if (rect2.bottom > 0) {
                    float height = getHeight();
                    float f11 = rect2.bottom;
                    z2 z2Var = d3Var.f11150l0;
                    if (z2Var != null && z2Var.getTotalHeight() > 0) {
                        f7 = 1.0f;
                    } else {
                        f7 = 1.0f - d3Var.f11144f0;
                    }
                    canvas.drawRect(0.0f, height - (f11 * f7), getWidth(), getHeight(), paint);
                }
                if (rect2.right > 0) {
                    canvas.drawRect(com.google.android.gms.internal.play_billing.k3.D(1.0f, d3Var.f11144f0, rect2.right, getWidth()), 0.0f, getWidth(), getHeight(), paint);
                }
            }
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.n3 n3Var;
        d3 d3Var = this.A0;
        Rect rect = d3Var.h;
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (launchActivity != null) {
            n3Var = launchActivity.P();
        } else {
            n3Var = null;
        }
        if (n3Var != null && rect != null) {
            int i10 = (int) ((1.0f - d3Var.f11144f0) * ((int) n3Var.G));
            if (motionEvent.getY() >= (getHeight() - rect.bottom) - i10 && motionEvent.getY() <= getHeight() - rect.bottom && !AndroidUtilities.isTablet()) {
                return n3Var.j(motionEvent.getX(), motionEvent.getY() - ((getHeight() - rect.bottom) - i10), motionEvent.getAction());
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void draw(Canvas canvas) {
        float f7;
        float lerp;
        d3 d3Var = this.A0;
        Rect rect = d3Var.h;
        u2 u2Var = d3Var.v;
        Paint paint = d3Var.N;
        a3 a3Var = d3Var.W;
        Drawable drawable = d3Var.Y;
        if (this.f11114x0) {
            return;
        }
        super.draw(canvas);
        if (AndroidUtilities.isTablet()) {
            f7 = 0.0f;
        } else {
            f7 = d3Var.f11137b;
        }
        paint.setColor(d3Var.f11135a);
        paint.setAlpha((int) ((1.0f - d3Var.f11144f0) * (1.0f - (Math.min(0.5f, f7) / 0.5f)) * paint.getAlpha()));
        canvas.save();
        float f10 = 1.0f - f7;
        if (AndroidUtilities.isTablet()) {
            lerp = AndroidUtilities.lerp(u2Var.getTranslationY() + AndroidUtilities.dp(12.0f), AndroidUtilities.statusBarHeight / 2.0f, d3Var.f11137b);
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
        if (view == d3Var.v && d3Var.f11146h0 && d3Var.f11148j0 > 0 && d3Var.f11147i0 > 0) {
            canvas.save();
            canvas.clipRect(view.getX(), view.getY(), view.getX() + AndroidUtilities.lerp(d3Var.f11147i0, view.getWidth(), d3Var.f11145g0), view.getY() + AndroidUtilities.lerp(d3Var.f11148j0, view.getHeight(), d3Var.f11145g0));
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
    public int[] getColorKeys() {
        return null;
    }

    @Override
    public RectF getRect() {
        u2 u2Var = this.A0.v;
        RectF rectF = this.f11115y0;
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
        Paint paint = d3Var.T;
        Paint paint2 = d3Var.P;
        u2 u2Var = d3Var.v;
        if (!this.f11114x0) {
            super.onDraw(canvas);
            if (d3Var.f11159s0.getVisibility() != 0) {
                canvas.save();
                z5 z5Var = d3Var.f11158s;
                float f7 = 1.0f;
                if (z5Var != null) {
                    int width = getWidth();
                    getHeight();
                    canvas2 = canvas;
                    z5Var.r(canvas2, false, false, width, 1.0f - d3Var.f11144f0);
                } else {
                    canvas2 = canvas;
                }
                if (!d3Var.V) {
                    int w02 = h6.w0(h6.f20986d6, d3Var.E);
                    paint2.setColor(w02);
                    d3Var.f11165x.setFlickerViewColor(w02);
                    org.telegram.ui.f3 f3Var = d3Var.U0;
                    if (f3Var != null) {
                        if (AndroidUtilities.computePerceivedBrightness(paint2.getColor()) <= 0.721f) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        f3Var.b(z10, false);
                        d3Var.U0.setBackgroundColor(paint2.getColor());
                    }
                }
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                canvas2.drawRect(rectF, d3Var.O);
                org.telegram.ui.ActionBar.n3 n3Var = d3Var.f11156r;
                if (n3Var != null) {
                    i10 = (int) n3Var.G;
                } else {
                    i10 = 0;
                }
                paint.setColor(d3Var.Q);
                float dp = AndroidUtilities.dp(16.0f);
                if (!AndroidUtilities.isTablet()) {
                    f7 = 1.0f - d3Var.f11137b;
                }
                float f10 = dp * f7;
                rectF.set(AndroidUtilities.lerp(u2Var.getLeft(), 0, d3Var.f11144f0), AndroidUtilities.lerp(u2Var.getTranslationY(), 0.0f, d3Var.f11137b), u2Var.getRight(), u2Var.getTranslationY() + AndroidUtilities.dp(24.0f) + f10);
                canvas2.drawRoundRect(rectF, f10, f10, paint);
                rectF.set(AndroidUtilities.lerp(u2Var.getLeft(), 0, d3Var.f11144f0), u2Var.getTranslationY() + AndroidUtilities.dp(24.0f), AndroidUtilities.lerp(u2Var.getRight(), getWidth(), d3Var.f11144f0), getHeight() - i10);
                canvas2.drawRect(rectF, paint2);
                canvas2.restore();
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        d3 d3Var = this.A0;
        u2 u2Var = d3Var.v;
        if (motionEvent.getAction() == 0 && (motionEvent.getY() <= AndroidUtilities.lerp(u2Var.getTranslationY() + AndroidUtilities.dp(24.0f), 0.0f, d3Var.f11137b) || motionEvent.getX() > u2Var.getRight() || motionEvent.getX() < u2Var.getLeft())) {
            d3Var.k(true);
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public void setDrawingFromOverlay(boolean z10) {
        if (this.f11114x0 != z10) {
            this.f11114x0 = z10;
            invalidate();
            d3 d3Var = this.A0;
            d3Var.H();
            LaunchActivity launchActivity = LaunchActivity.H1;
            if (launchActivity != null && d3Var.f11141d0) {
                launchActivity.D0(d3Var.R);
            }
        }
    }

    @Override
    public final float z(Canvas canvas, RectF rectF, float f7, RectF rectF2, float f10) {
        d3 d3Var = this.A0;
        u2 u2Var = d3Var.v;
        RectF rectF3 = this.f11115y0;
        rectF3.set(u2Var.getLeft(), u2Var.getTranslationY() + AndroidUtilities.dp(24.0f), u2Var.getRight(), getHeight());
        AndroidUtilities.lerpCentered(rectF3, rectF, f7, rectF2);
        canvas.save();
        Path path = this.f11116z0;
        path.rewind();
        float dp = AndroidUtilities.dp(16.0f);
        float f11 = 1.0f;
        if (!AndroidUtilities.isTablet()) {
            f11 = 1.0f - d3Var.f11137b;
        }
        float lerp = AndroidUtilities.lerp(dp * f11, AndroidUtilities.dp(18.0f), f7);
        path.addRoundRect(rectF2, lerp, lerp, Path.Direction.CW);
        canvas.clipPath(path);
        canvas.drawPaint(d3Var.P);
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
