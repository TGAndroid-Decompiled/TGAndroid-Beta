package nh;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.jr;
public final class i1 extends FrameLayout {
    public final Paint f17869a;
    public final Paint f17870b;
    public final Paint f17871c;
    public Bitmap d;
    public BitmapShader f17872e;
    public Matrix f17873f;
    public final org.telegram.ui.Components.d6 h;
    public final RectF f17874n;
    public Boolean f17875r;
    public final k2 f17876s;

    public i1(k2 k2Var, Context context) {
        super(context);
        this.f17876s = k2Var;
        this.f17869a = new Paint(1);
        this.f17870b = new Paint(3);
        this.f17871c = new Paint(1);
        this.h = new org.telegram.ui.Components.d6(this, 0L, 250L, jr.h);
        this.f17874n = new RectF();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.c6 c6Var;
        float f9;
        float f10;
        int i10;
        int i11;
        boolean z10;
        int i12 = org.telegram.ui.ActionBar.g6.f23133h5;
        k2 k2Var = this.f17876s;
        g1 g1Var = k2Var.f17993f;
        c6Var = ((org.telegram.ui.ActionBar.f3) k2Var).resourcesProvider;
        int v02 = org.telegram.ui.ActionBar.g6.v0(i12, c6Var);
        Paint paint = this.f17869a;
        paint.setColor(v02);
        if (this.d == null) {
            f9 = 1.0f;
        } else {
            f9 = 0.85f;
        }
        paint.setAlpha((int) (f9 * 255.0f));
        View[] viewPages = g1Var.getViewPages();
        k2Var.f17998x = 0.0f;
        boolean z11 = false;
        for (View view : viewPages) {
            if (view instanceof u1) {
                u1 u1Var = (u1) view;
                k2Var.f17998x += Utilities.clamp(1.0f - Math.abs(u1Var.getTranslationX() / u1Var.getMeasuredWidth()), 1.0f, 0.0f) * u1Var.b();
                if (u1Var.getVisibility() == 0) {
                    u1Var.c();
                }
            }
        }
        if (k2Var.f17998x <= 0.0f) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        float d = this.h.d(f10, false);
        float paddingTop = (k2Var.f17998x + g1Var.getPaddingTop()) - AndroidUtilities.lerp(AndroidUtilities.dp(8.0f), g1Var.getPaddingTop(), d);
        RectF rectF = AndroidUtilities.rectTmp;
        i10 = ((org.telegram.ui.ActionBar.f3) k2Var).backgroundPaddingLeft;
        int width = getWidth();
        i11 = ((org.telegram.ui.ActionBar.f3) k2Var).backgroundPaddingLeft;
        rectF.set(i10, paddingTop, width - i11, AndroidUtilities.dp(8.0f) + getHeight());
        if (this.d != null) {
            this.f17873f.reset();
            this.f17873f.postScale(16.0f, 16.0f);
            this.f17873f.postTranslate(0.0f, -getY());
            this.f17872e.setLocalMatrix(this.f17873f);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), this.f17870b);
        }
        if (rectF.top < AndroidUtilities.statusBarHeight) {
            z10 = true;
        } else {
            z10 = false;
        }
        Boolean bool = this.f17875r;
        if (bool == null || bool.booleanValue() != z10) {
            this.f17875r = Boolean.valueOf(z10);
            Window window = k2Var.getWindow();
            if (z10 && AndroidUtilities.computePerceivedBrightness(paint.getColor()) >= 0.721f) {
                z11 = true;
            }
            AndroidUtilities.setLightStatusBar(window, z11);
        }
        float f11 = 1.0f - d;
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(14.0f) * f11, AndroidUtilities.dp(14.0f) * f11, paint);
        int width2 = getWidth();
        RectF rectF2 = this.f17874n;
        rectF2.set((getWidth() - AndroidUtilities.dp(36.0f)) / 2.0f, AndroidUtilities.dp(9.66f) + paddingTop, (AndroidUtilities.dp(36.0f) + width2) / 2.0f, paddingTop + AndroidUtilities.dp(13.66f));
        Paint paint2 = this.f17871c;
        paint2.setColor(1367573379);
        paint2.setAlpha((int) (f11 * 81.0f));
        canvas.drawRoundRect(rectF2, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint2);
        canvas.save();
        canvas.clipRect(rectF);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            float y8 = motionEvent.getY();
            k2 k2Var = this.f17876s;
            if (y8 < k2Var.f17998x) {
                k2Var.dismiss();
                return true;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Bitmap bitmap = this.d;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.f17870b.setShader(null);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        org.telegram.ui.ActionBar.c6 c6Var;
        org.telegram.ui.ActionBar.c6 c6Var2;
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.d == null) {
            k2 k2Var = this.f17876s;
            c6Var = ((org.telegram.ui.ActionBar.f3) k2Var).resourcesProvider;
            if (c6Var != null) {
                c6Var2 = ((org.telegram.ui.ActionBar.f3) k2Var).resourcesProvider;
                if (!c6Var2.a()) {
                    return;
                }
            } else if (!org.telegram.ui.ActionBar.g6.I.q()) {
                return;
            }
            if (k2Var.f17997w != null && SharedConfig.getDevicePerformanceClass() > 0 && !LiteMode.isPowerSaverApplied()) {
                Point point = AndroidUtilities.displaySize;
                Bitmap createBitmap = Bitmap.createBitmap(point.x / 16, point.y / 16, Bitmap.Config.ARGB_8888);
                k2Var.f17997w.run(createBitmap, Float.valueOf(16.0f));
                Utilities.stackBlurBitmap(createBitmap, 8);
                this.d = createBitmap;
                Bitmap bitmap = this.d;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                this.f17872e = bitmapShader;
                this.f17870b.setShader(bitmapShader);
                if (this.f17873f == null) {
                    this.f17873f = new Matrix();
                }
                this.f17873f.postScale(16.0f, 16.0f);
                this.f17872e.setLocalMatrix(this.f17873f);
                invalidate();
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        float min = Math.min(size2 * 0.45f, (AndroidUtilities.dp(350.0f) / 0.55f) * 0.45f);
        k2 k2Var = this.f17876s;
        k2Var.f17994n = min;
        g1 g1Var = k2Var.f17993f;
        g1Var.setPadding(0, AndroidUtilities.statusBarHeight, 0, 0);
        g1Var.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        j2 j2Var = k2Var.h;
        if (j2Var != null) {
            j2Var.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), 0);
        }
        setMeasuredDimension(size, size2);
    }

    @Override
    public final void setTranslationY(float f9) {
        super.setTranslationY(f9);
        invalidate();
    }
}
