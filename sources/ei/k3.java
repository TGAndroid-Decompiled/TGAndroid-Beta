package ei;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import ci.z8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.ee0;
import org.telegram.ui.Components.lw0;
import org.telegram.ui.Components.rc;
import org.telegram.ui.LaunchActivity;
public final class k3 extends lw0 implements org.telegram.ui.ActionBar.u3 {
    public final l3 A0;
    public final Paint f9129w0;
    public boolean f9130x0;
    public final RectF f9131y0;
    public final Path f9132z0;

    public k3(l3 l3Var, Context context) {
        super(context, null);
        this.A0 = l3Var;
        setClipChildren(false);
        setClipToPadding(false);
        setWillNotDraw(false);
        this.f9129w0 = new Paint(1);
        this.f9131y0 = new RectF();
        this.f9132z0 = new Path();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        Paint paint;
        float f7;
        l3 l3Var = this.A0;
        ee0 ee0Var = l3Var.f9174s0;
        Rect rect = l3Var.h;
        Rect rect2 = l3Var.f9158f;
        if (!this.f9130x0) {
            int visibility = ee0Var.getVisibility();
            Paint paint2 = this.f9129w0;
            if (visibility != 0) {
                float f10 = l3Var.f9159f0;
                if (f10 < 1.0f && f10 > 0.0f) {
                    paint2.setColor(i6.l1(l3Var.N0, l3Var.R));
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
            if (l3Var.f9173s != null && !AndroidUtilities.isTablet()) {
                canvas.save();
                canvas.translate((1.0f - l3Var.f9159f0) * rect.left, 0.0f);
                cf.c cVar = l3Var.f9173s;
                int lerp = AndroidUtilities.lerp((getWidth() - rect.left) - rect.right, getWidth(), l3Var.f9159f0);
                getHeight();
                cVar.q(canvas, true, false, lerp, 1.0f - l3Var.f9159f0);
                canvas.translate((1.0f - l3Var.f9159f0) * (-rect.left), 0.0f);
                z10 = true;
            } else {
                z10 = false;
            }
            super.dispatchDraw(canvas);
            if (z10) {
                canvas.restore();
            }
            if (ee0Var.getVisibility() != 0) {
                paint2.setColor(i6.l1(l3Var.N0, l3Var.R));
                int i11 = rect2.left;
                if (i11 > 0) {
                    paint = paint2;
                    canvas.drawRect(0.0f, 0.0f, (1.0f - l3Var.f9159f0) * i11, getHeight(), paint);
                } else {
                    paint = paint2;
                }
                if (rect2.top > 0) {
                    canvas.drawRect(0.0f, 0.0f, getWidth(), (1.0f - l3Var.f9159f0) * rect2.top, paint);
                }
                if (rect2.bottom > 0) {
                    float height = getHeight();
                    float f11 = rect2.bottom;
                    h3 h3Var = l3Var.f9165l0;
                    if (h3Var != null && h3Var.getTotalHeight() > 0) {
                        f7 = 1.0f;
                    } else {
                        f7 = 1.0f - l3Var.f9159f0;
                    }
                    canvas.drawRect(0.0f, height - (f11 * f7), getWidth(), getHeight(), paint);
                }
                if (rect2.right > 0) {
                    canvas.drawRect(com.google.android.gms.internal.vision.e2.b(1.0f, l3Var.f9159f0, rect2.right, getWidth()), 0.0f, getWidth(), getHeight(), paint);
                }
            }
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.n3 n3Var;
        l3 l3Var = this.A0;
        Rect rect = l3Var.h;
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity != null) {
            n3Var = launchActivity.P();
        } else {
            n3Var = null;
        }
        if (n3Var != null && rect != null) {
            int i10 = (int) ((1.0f - l3Var.f9159f0) * ((int) n3Var.G));
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
        l3 l3Var = this.A0;
        Rect rect = l3Var.h;
        b3 b3Var = l3Var.v;
        Paint paint = l3Var.N;
        i3 i3Var = l3Var.W;
        Drawable drawable = l3Var.Y;
        if (this.f9130x0) {
            return;
        }
        super.draw(canvas);
        if (AndroidUtilities.isTablet()) {
            f7 = 0.0f;
        } else {
            f7 = l3Var.f9151b;
        }
        paint.setColor(l3Var.f9149a);
        paint.setAlpha((int) ((1.0f - l3Var.f9159f0) * (1.0f - (Math.min(0.5f, f7) / 0.5f)) * paint.getAlpha()));
        canvas.save();
        float f10 = 1.0f - f7;
        if (AndroidUtilities.isTablet()) {
            lerp = AndroidUtilities.lerp(b3Var.getTranslationY() + AndroidUtilities.dp(12.0f), AndroidUtilities.statusBarHeight / 2.0f, l3Var.f9151b);
        } else {
            lerp = AndroidUtilities.lerp(b3Var.getTranslationY(), (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f) + AndroidUtilities.statusBarHeight, f7) + AndroidUtilities.dp(12.0f);
        }
        canvas.scale(f10, f10, getWidth() / 2.0f, lerp);
        canvas.drawLine((getWidth() / 2.0f) - AndroidUtilities.dp(16.0f), lerp, (getWidth() / 2.0f) + AndroidUtilities.dp(16.0f), lerp, paint);
        canvas.restore();
        drawable.setAlpha((int) (i3Var.getAlpha() * 255.0f));
        float translationY = i3Var.getTranslationY() + i3Var.getY() + i3Var.getHeight();
        drawable.setBounds(rect.left, (int) translationY, getWidth() - rect.right, (int) (translationY + drawable.getIntrinsicHeight()));
        drawable.draw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        boolean z10;
        l3 l3Var = this.A0;
        if (view == l3Var.v && l3Var.f9161h0 && l3Var.f9163j0 > 0 && l3Var.f9162i0 > 0) {
            canvas.save();
            canvas.clipRect(view.getX(), view.getY(), view.getX() + AndroidUtilities.lerp(l3Var.f9162i0, view.getWidth(), l3Var.f9160g0), view.getY() + AndroidUtilities.lerp(l3Var.f9163j0, view.getHeight(), l3Var.f9160g0));
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
        b3 b3Var = this.A0.v;
        RectF rectF = this.f9131y0;
        rectF.set(b3Var.getLeft(), b3Var.getTranslationY() + AndroidUtilities.dp(24.0f), b3Var.getRight(), getHeight());
        return rectF;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        rc.a(this, new z8(3));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        rc.h(this);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        int i10;
        boolean z10;
        l3 l3Var = this.A0;
        Paint paint = l3Var.T;
        Paint paint2 = l3Var.P;
        b3 b3Var = l3Var.v;
        if (!this.f9130x0) {
            super.onDraw(canvas);
            if (l3Var.f9174s0.getVisibility() != 0) {
                canvas.save();
                cf.c cVar = l3Var.f9173s;
                float f7 = 1.0f;
                if (cVar != null) {
                    int width = getWidth();
                    getHeight();
                    canvas2 = canvas;
                    cVar.q(canvas2, false, false, width, 1.0f - l3Var.f9159f0);
                } else {
                    canvas2 = canvas;
                }
                if (!l3Var.V) {
                    int v02 = i6.v0(i6.f20817d6, l3Var.E);
                    paint2.setColor(v02);
                    l3Var.f9180x.setFlickerViewColor(v02);
                    org.telegram.ui.d3 d3Var = l3Var.U0;
                    if (d3Var != null) {
                        if (AndroidUtilities.computePerceivedBrightness(paint2.getColor()) <= 0.721f) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        d3Var.b(z10, false);
                        l3Var.U0.setBackgroundColor(paint2.getColor());
                    }
                }
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                canvas2.drawRect(rectF, l3Var.O);
                org.telegram.ui.ActionBar.n3 n3Var = l3Var.f9171r;
                if (n3Var != null) {
                    i10 = (int) n3Var.G;
                } else {
                    i10 = 0;
                }
                paint.setColor(l3Var.Q);
                float dp = AndroidUtilities.dp(16.0f);
                if (!AndroidUtilities.isTablet()) {
                    f7 = 1.0f - l3Var.f9151b;
                }
                float f10 = dp * f7;
                rectF.set(AndroidUtilities.lerp(b3Var.getLeft(), 0, l3Var.f9159f0), AndroidUtilities.lerp(b3Var.getTranslationY(), 0.0f, l3Var.f9151b), b3Var.getRight(), b3Var.getTranslationY() + AndroidUtilities.dp(24.0f) + f10);
                canvas2.drawRoundRect(rectF, f10, f10, paint);
                rectF.set(AndroidUtilities.lerp(b3Var.getLeft(), 0, l3Var.f9159f0), b3Var.getTranslationY() + AndroidUtilities.dp(24.0f), AndroidUtilities.lerp(b3Var.getRight(), getWidth(), l3Var.f9159f0), getHeight() - i10);
                canvas2.drawRect(rectF, paint2);
                canvas2.restore();
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        l3 l3Var = this.A0;
        b3 b3Var = l3Var.v;
        if (motionEvent.getAction() == 0 && (motionEvent.getY() <= AndroidUtilities.lerp(b3Var.getTranslationY() + AndroidUtilities.dp(24.0f), 0.0f, l3Var.f9151b) || motionEvent.getX() > b3Var.getRight() || motionEvent.getX() < b3Var.getLeft())) {
            l3Var.k(true);
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public void setDrawingFromOverlay(boolean z10) {
        if (this.f9130x0 != z10) {
            this.f9130x0 = z10;
            invalidate();
            l3 l3Var = this.A0;
            l3Var.G();
            LaunchActivity launchActivity = LaunchActivity.G1;
            if (launchActivity != null && l3Var.f9155d0) {
                launchActivity.z0(l3Var.R);
            }
        }
    }

    @Override
    public final float y(Canvas canvas, RectF rectF, float f7, RectF rectF2, float f10) {
        l3 l3Var = this.A0;
        b3 b3Var = l3Var.v;
        RectF rectF3 = this.f9131y0;
        rectF3.set(b3Var.getLeft(), b3Var.getTranslationY() + AndroidUtilities.dp(24.0f), b3Var.getRight(), getHeight());
        AndroidUtilities.lerpCentered(rectF3, rectF, f7, rectF2);
        canvas.save();
        Path path = this.f9132z0;
        path.rewind();
        float dp = AndroidUtilities.dp(16.0f);
        float f11 = 1.0f;
        if (!AndroidUtilities.isTablet()) {
            f11 = 1.0f - l3Var.f9151b;
        }
        float lerp = AndroidUtilities.lerp(dp * f11, AndroidUtilities.dp(18.0f), f7);
        path.addRoundRect(rectF2, lerp, lerp, Path.Direction.CW);
        canvas.clipPath(path);
        canvas.drawPaint(l3Var.P);
        if (b3Var != null) {
            canvas.save();
            canvas.translate(rectF2.left, (f7 * AndroidUtilities.dp(51.0f)) + Math.max(b3Var.getY(), rectF2.top));
            b3Var.draw(canvas);
            canvas.restore();
        }
        canvas.restore();
        return lerp;
    }
}
