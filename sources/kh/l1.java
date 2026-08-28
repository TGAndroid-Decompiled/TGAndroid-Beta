package kh;

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
import org.telegram.ui.Components.gr;
public final class l1 extends FrameLayout {
    public final Paint f15574a;
    public final Paint f15575b;
    public final Paint f15576c;
    public Bitmap d;
    public BitmapShader f15577e;
    public Matrix f15578f;
    public final org.telegram.ui.Components.y5 h;
    public final RectF f15579n;
    public Boolean f15580r;
    public final n2 f15581s;

    public l1(n2 n2Var, Context context) {
        super(context);
        this.f15581s = n2Var;
        this.f15574a = new Paint(1);
        this.f15575b = new Paint(3);
        this.f15576c = new Paint(1);
        this.h = new org.telegram.ui.Components.y5(this, 0L, 250L, gr.h);
        this.f15579n = new RectF();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.b6 b6Var;
        float f10;
        float f11;
        int i9;
        int i10;
        boolean z10;
        int i11 = org.telegram.ui.ActionBar.f6.f23072h5;
        n2 n2Var = this.f15581s;
        j1 j1Var = n2Var.f15736f;
        b6Var = ((org.telegram.ui.ActionBar.f3) n2Var).resourcesProvider;
        int v02 = org.telegram.ui.ActionBar.f6.v0(i11, b6Var);
        Paint paint = this.f15574a;
        paint.setColor(v02);
        if (this.d == null) {
            f10 = 1.0f;
        } else {
            f10 = 0.85f;
        }
        paint.setAlpha((int) (f10 * 255.0f));
        View[] viewPages = j1Var.getViewPages();
        n2Var.f15741x = 0.0f;
        boolean z11 = false;
        for (View view : viewPages) {
            if (view instanceof x1) {
                x1 x1Var = (x1) view;
                n2Var.f15741x += Utilities.clamp(1.0f - Math.abs(x1Var.getTranslationX() / x1Var.getMeasuredWidth()), 1.0f, 0.0f) * x1Var.b();
                if (x1Var.getVisibility() == 0) {
                    x1Var.c();
                }
            }
        }
        if (n2Var.f15741x <= 0.0f) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        float d = this.h.d(f11, false);
        float paddingTop = (n2Var.f15741x + j1Var.getPaddingTop()) - AndroidUtilities.lerp(AndroidUtilities.dp(8.0f), j1Var.getPaddingTop(), d);
        RectF rectF = AndroidUtilities.rectTmp;
        i9 = ((org.telegram.ui.ActionBar.f3) n2Var).backgroundPaddingLeft;
        int width = getWidth();
        i10 = ((org.telegram.ui.ActionBar.f3) n2Var).backgroundPaddingLeft;
        rectF.set(i9, paddingTop, width - i10, AndroidUtilities.dp(8.0f) + getHeight());
        if (this.d != null) {
            this.f15578f.reset();
            this.f15578f.postScale(16.0f, 16.0f);
            this.f15578f.postTranslate(0.0f, -getY());
            this.f15577e.setLocalMatrix(this.f15578f);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), this.f15575b);
        }
        if (rectF.top < AndroidUtilities.statusBarHeight) {
            z10 = true;
        } else {
            z10 = false;
        }
        Boolean bool = this.f15580r;
        if (bool == null || bool.booleanValue() != z10) {
            this.f15580r = Boolean.valueOf(z10);
            Window window = n2Var.getWindow();
            if (z10 && AndroidUtilities.computePerceivedBrightness(paint.getColor()) >= 0.721f) {
                z11 = true;
            }
            AndroidUtilities.setLightStatusBar(window, z11);
        }
        float f12 = 1.0f - d;
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(14.0f) * f12, AndroidUtilities.dp(14.0f) * f12, paint);
        int width2 = getWidth();
        RectF rectF2 = this.f15579n;
        rectF2.set((getWidth() - AndroidUtilities.dp(36.0f)) / 2.0f, AndroidUtilities.dp(9.66f) + paddingTop, (AndroidUtilities.dp(36.0f) + width2) / 2.0f, paddingTop + AndroidUtilities.dp(13.66f));
        Paint paint2 = this.f15576c;
        paint2.setColor(1367573379);
        paint2.setAlpha((int) (f12 * 81.0f));
        canvas.drawRoundRect(rectF2, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint2);
        canvas.save();
        canvas.clipRect(rectF);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            float y10 = motionEvent.getY();
            n2 n2Var = this.f15581s;
            if (y10 < n2Var.f15741x) {
                n2Var.dismiss();
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
        this.f15575b.setShader(null);
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        org.telegram.ui.ActionBar.b6 b6Var;
        org.telegram.ui.ActionBar.b6 b6Var2;
        super.onLayout(z10, i9, i10, i11, i12);
        if (this.d == null) {
            n2 n2Var = this.f15581s;
            b6Var = ((org.telegram.ui.ActionBar.f3) n2Var).resourcesProvider;
            if (b6Var != null) {
                b6Var2 = ((org.telegram.ui.ActionBar.f3) n2Var).resourcesProvider;
                if (!b6Var2.a()) {
                    return;
                }
            } else if (!org.telegram.ui.ActionBar.f6.I.q()) {
                return;
            }
            if (n2Var.f15740w != null && SharedConfig.getDevicePerformanceClass() > 0 && !LiteMode.isPowerSaverApplied()) {
                Point point = AndroidUtilities.displaySize;
                Bitmap createBitmap = Bitmap.createBitmap(point.x / 16, point.y / 16, Bitmap.Config.ARGB_8888);
                n2Var.f15740w.run(createBitmap, Float.valueOf(16.0f));
                Utilities.stackBlurBitmap(createBitmap, 8);
                this.d = createBitmap;
                Bitmap bitmap = this.d;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                this.f15577e = bitmapShader;
                this.f15575b.setShader(bitmapShader);
                if (this.f15578f == null) {
                    this.f15578f = new Matrix();
                }
                this.f15578f.postScale(16.0f, 16.0f);
                this.f15577e.setLocalMatrix(this.f15578f);
                invalidate();
            }
        }
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        int size = View.MeasureSpec.getSize(i9);
        int size2 = View.MeasureSpec.getSize(i10);
        float min = Math.min(size2 * 0.45f, (AndroidUtilities.dp(350.0f) / 0.55f) * 0.45f);
        n2 n2Var = this.f15581s;
        n2Var.f15737n = min;
        j1 j1Var = n2Var.f15736f;
        j1Var.setPadding(0, AndroidUtilities.statusBarHeight, 0, 0);
        j1Var.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        m2 m2Var = n2Var.h;
        if (m2Var != null) {
            m2Var.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), 0);
        }
        setMeasuredDimension(size, size2);
    }

    @Override
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        invalidate();
    }
}
