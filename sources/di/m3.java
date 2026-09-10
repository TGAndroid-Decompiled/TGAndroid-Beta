package di;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import bi.fa;
import bi.u6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.aw0;
import org.telegram.ui.Components.be0;
import org.telegram.ui.Components.pc;
import org.telegram.ui.LaunchActivity;
public final class m3 extends aw0 implements org.telegram.ui.ActionBar.x3 {
    public final n3 A0;
    public final Paint f6762w0;
    public boolean f6763x0;
    public final RectF f6764y0;
    public final Path f6765z0;

    public m3(n3 n3Var, Context context) {
        super(context, null);
        this.A0 = n3Var;
        setClipChildren(false);
        setClipToPadding(false);
        setWillNotDraw(false);
        this.f6762w0 = new Paint(1);
        this.f6764y0 = new RectF();
        this.f6765z0 = new Path();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        Paint paint;
        float f7;
        n3 n3Var = this.A0;
        be0 be0Var = n3Var.f6806s0;
        Rect rect = n3Var.h;
        Rect rect2 = n3Var.f6790f;
        if (!this.f6763x0) {
            int visibility = be0Var.getVisibility();
            Paint paint2 = this.f6762w0;
            if (visibility != 0) {
                float f10 = n3Var.f6791f0;
                if (f10 < 1.0f && f10 > 0.0f) {
                    paint2.setColor(j6.l1(n3Var.N0, n3Var.R));
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
            if (n3Var.f6805s != null && !AndroidUtilities.isTablet()) {
                canvas.save();
                canvas.translate((1.0f - n3Var.f6791f0) * rect.left, 0.0f);
                u6 u6Var = n3Var.f6805s;
                int lerp = AndroidUtilities.lerp((getWidth() - rect.left) - rect.right, getWidth(), n3Var.f6791f0);
                getHeight();
                u6Var.n(canvas, true, false, lerp, 1.0f - n3Var.f6791f0);
                canvas.translate((1.0f - n3Var.f6791f0) * (-rect.left), 0.0f);
                z10 = true;
            } else {
                z10 = false;
            }
            super.dispatchDraw(canvas);
            if (z10) {
                canvas.restore();
            }
            if (be0Var.getVisibility() != 0) {
                paint2.setColor(j6.l1(n3Var.N0, n3Var.R));
                int i11 = rect2.left;
                if (i11 > 0) {
                    paint = paint2;
                    canvas.drawRect(0.0f, 0.0f, (1.0f - n3Var.f6791f0) * i11, getHeight(), paint);
                } else {
                    paint = paint2;
                }
                if (rect2.top > 0) {
                    canvas.drawRect(0.0f, 0.0f, getWidth(), (1.0f - n3Var.f6791f0) * rect2.top, paint);
                }
                if (rect2.bottom > 0) {
                    float height = getHeight();
                    float f11 = rect2.bottom;
                    j3 j3Var = n3Var.f6797l0;
                    if (j3Var != null && j3Var.getTotalHeight() > 0) {
                        f7 = 1.0f;
                    } else {
                        f7 = 1.0f - n3Var.f6791f0;
                    }
                    canvas.drawRect(0.0f, height - (f11 * f7), getWidth(), getHeight(), paint);
                }
                if (rect2.right > 0) {
                    canvas.drawRect(com.google.android.gms.internal.vision.e2.a(1.0f, n3Var.f6791f0, rect2.right, getWidth()), 0.0f, getWidth(), getHeight(), paint);
                }
            }
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.q3 q3Var;
        n3 n3Var = this.A0;
        Rect rect = n3Var.h;
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity != null) {
            q3Var = launchActivity.P();
        } else {
            q3Var = null;
        }
        if (q3Var != null && rect != null) {
            int i10 = (int) ((1.0f - n3Var.f6791f0) * ((int) q3Var.G));
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
        n3 n3Var = this.A0;
        Rect rect = n3Var.h;
        d3 d3Var = n3Var.v;
        Paint paint = n3Var.N;
        k3 k3Var = n3Var.W;
        Drawable drawable = n3Var.Y;
        if (this.f6763x0) {
            return;
        }
        super.draw(canvas);
        if (AndroidUtilities.isTablet()) {
            f7 = 0.0f;
        } else {
            f7 = n3Var.f6784b;
        }
        paint.setColor(n3Var.f6782a);
        paint.setAlpha((int) ((1.0f - n3Var.f6791f0) * (1.0f - (Math.min(0.5f, f7) / 0.5f)) * paint.getAlpha()));
        canvas.save();
        float f10 = 1.0f - f7;
        if (AndroidUtilities.isTablet()) {
            lerp = AndroidUtilities.lerp(d3Var.getTranslationY() + AndroidUtilities.dp(12.0f), AndroidUtilities.statusBarHeight / 2.0f, n3Var.f6784b);
        } else {
            lerp = AndroidUtilities.lerp(d3Var.getTranslationY(), (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() / 2.0f) + AndroidUtilities.statusBarHeight, f7) + AndroidUtilities.dp(12.0f);
        }
        canvas.scale(f10, f10, getWidth() / 2.0f, lerp);
        canvas.drawLine((getWidth() / 2.0f) - AndroidUtilities.dp(16.0f), lerp, (getWidth() / 2.0f) + AndroidUtilities.dp(16.0f), lerp, paint);
        canvas.restore();
        drawable.setAlpha((int) (k3Var.getAlpha() * 255.0f));
        float translationY = k3Var.getTranslationY() + k3Var.getY() + k3Var.getHeight();
        drawable.setBounds(rect.left, (int) translationY, getWidth() - rect.right, (int) (translationY + drawable.getIntrinsicHeight()));
        drawable.draw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        boolean z10;
        n3 n3Var = this.A0;
        if (view == n3Var.v && n3Var.f6793h0 && n3Var.f6795j0 > 0 && n3Var.f6794i0 > 0) {
            canvas.save();
            canvas.clipRect(view.getX(), view.getY(), view.getX() + AndroidUtilities.lerp(n3Var.f6794i0, view.getWidth(), n3Var.f6792g0), view.getY() + AndroidUtilities.lerp(n3Var.f6795j0, view.getHeight(), n3Var.f6792g0));
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
    public int[] getColorKeys() {
        return null;
    }

    @Override
    public RectF getRect() {
        d3 d3Var = this.A0.v;
        RectF rectF = this.f6764y0;
        rectF.set(d3Var.getLeft(), d3Var.getTranslationY() + AndroidUtilities.dp(24.0f), d3Var.getRight(), getHeight());
        return rectF;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        pc.a(this, new fa(3));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        pc.h(this);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        int i10;
        boolean z10;
        n3 n3Var = this.A0;
        Paint paint = n3Var.T;
        Paint paint2 = n3Var.P;
        d3 d3Var = n3Var.v;
        if (!this.f6763x0) {
            super.onDraw(canvas);
            if (n3Var.f6806s0.getVisibility() != 0) {
                canvas.save();
                u6 u6Var = n3Var.f6805s;
                float f7 = 1.0f;
                if (u6Var != null) {
                    int width = getWidth();
                    getHeight();
                    canvas2 = canvas;
                    u6Var.n(canvas2, false, false, width, 1.0f - n3Var.f6791f0);
                } else {
                    canvas2 = canvas;
                }
                if (!n3Var.V) {
                    int v02 = j6.v0(j6.f17928d6, n3Var.E);
                    paint2.setColor(v02);
                    n3Var.f6812x.setFlickerViewColor(v02);
                    org.telegram.ui.e3 e3Var = n3Var.U0;
                    if (e3Var != null) {
                        if (AndroidUtilities.computePerceivedBrightness(paint2.getColor()) <= 0.721f) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        e3Var.b(z10, false);
                        n3Var.U0.setBackgroundColor(paint2.getColor());
                    }
                }
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                canvas2.drawRect(rectF, n3Var.O);
                org.telegram.ui.ActionBar.q3 q3Var = n3Var.f6803r;
                if (q3Var != null) {
                    i10 = (int) q3Var.G;
                } else {
                    i10 = 0;
                }
                paint.setColor(n3Var.Q);
                float dp = AndroidUtilities.dp(16.0f);
                if (!AndroidUtilities.isTablet()) {
                    f7 = 1.0f - n3Var.f6784b;
                }
                float f10 = dp * f7;
                rectF.set(AndroidUtilities.lerp(d3Var.getLeft(), 0, n3Var.f6791f0), AndroidUtilities.lerp(d3Var.getTranslationY(), 0.0f, n3Var.f6784b), d3Var.getRight(), d3Var.getTranslationY() + AndroidUtilities.dp(24.0f) + f10);
                canvas2.drawRoundRect(rectF, f10, f10, paint);
                rectF.set(AndroidUtilities.lerp(d3Var.getLeft(), 0, n3Var.f6791f0), d3Var.getTranslationY() + AndroidUtilities.dp(24.0f), AndroidUtilities.lerp(d3Var.getRight(), getWidth(), n3Var.f6791f0), getHeight() - i10);
                canvas2.drawRect(rectF, paint2);
                canvas2.restore();
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        n3 n3Var = this.A0;
        d3 d3Var = n3Var.v;
        if (motionEvent.getAction() == 0 && (motionEvent.getY() <= AndroidUtilities.lerp(d3Var.getTranslationY() + AndroidUtilities.dp(24.0f), 0.0f, n3Var.f6784b) || motionEvent.getX() > d3Var.getRight() || motionEvent.getX() < d3Var.getLeft())) {
            n3Var.k(true);
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public void setDrawingFromOverlay(boolean z10) {
        if (this.f6763x0 != z10) {
            this.f6763x0 = z10;
            invalidate();
            n3 n3Var = this.A0;
            n3Var.G();
            LaunchActivity launchActivity = LaunchActivity.G1;
            if (launchActivity != null && n3Var.f6788d0) {
                launchActivity.z0(n3Var.R);
            }
        }
    }

    @Override
    public final float w(Canvas canvas, RectF rectF, float f7, RectF rectF2, float f10) {
        n3 n3Var = this.A0;
        d3 d3Var = n3Var.v;
        RectF rectF3 = this.f6764y0;
        rectF3.set(d3Var.getLeft(), d3Var.getTranslationY() + AndroidUtilities.dp(24.0f), d3Var.getRight(), getHeight());
        AndroidUtilities.lerpCentered(rectF3, rectF, f7, rectF2);
        canvas.save();
        Path path = this.f6765z0;
        path.rewind();
        float dp = AndroidUtilities.dp(16.0f);
        float f11 = 1.0f;
        if (!AndroidUtilities.isTablet()) {
            f11 = 1.0f - n3Var.f6784b;
        }
        float lerp = AndroidUtilities.lerp(dp * f11, AndroidUtilities.dp(18.0f), f7);
        path.addRoundRect(rectF2, lerp, lerp, Path.Direction.CW);
        canvas.clipPath(path);
        canvas.drawPaint(n3Var.P);
        if (d3Var != null) {
            canvas.save();
            canvas.translate(rectF2.left, (f7 * AndroidUtilities.dp(51.0f)) + Math.max(d3Var.getY(), rectF2.top));
            d3Var.draw(canvas);
            canvas.restore();
        }
        canvas.restore();
        return lerp;
    }
}
