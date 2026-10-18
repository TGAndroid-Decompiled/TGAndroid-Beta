package ei;

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
import org.telegram.ui.Components.bs;
public final class j1 extends FrameLayout {
    public final Paint f9232a;
    public final Paint f9233b;
    public final Paint f9234c;
    public Bitmap d;
    public BitmapShader e;
    public Matrix f9235f;
    public final org.telegram.ui.Components.f6 h;
    public final RectF f9236n;
    public Boolean f9237r;
    public final n2 f9238s;

    public j1(n2 n2Var, Context context) {
        super(context);
        this.f9238s = n2Var;
        this.f9232a = new Paint(1);
        this.f9233b = new Paint(3);
        this.f9234c = new Paint(1);
        this.h = new org.telegram.ui.Components.f6(this, 0L, 250L, bs.h);
        this.f9236n = new RectF();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.d6 d6Var;
        float f7;
        float f10;
        int i10;
        int i11;
        boolean z10;
        int i12 = org.telegram.ui.ActionBar.h6.f21064h5;
        n2 n2Var = this.f9238s;
        h1 h1Var = n2Var.f9504f;
        d6Var = ((org.telegram.ui.ActionBar.f3) n2Var).resourcesProvider;
        int w02 = org.telegram.ui.ActionBar.h6.w0(i12, d6Var);
        Paint paint = this.f9232a;
        paint.setColor(w02);
        if (this.d == null) {
            f7 = 1.0f;
        } else {
            f7 = 0.85f;
        }
        paint.setAlpha((int) (f7 * 255.0f));
        View[] viewPages = h1Var.getViewPages();
        n2Var.f9509x = 0.0f;
        boolean z11 = false;
        for (View view : viewPages) {
            if (view instanceof w1) {
                w1 w1Var = (w1) view;
                n2Var.f9509x += Utilities.clamp(1.0f - Math.abs(w1Var.getTranslationX() / w1Var.getMeasuredWidth()), 1.0f, 0.0f) * w1Var.b();
                if (w1Var.getVisibility() == 0) {
                    w1Var.c();
                }
            }
        }
        if (n2Var.f9509x <= 0.0f) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        float d = this.h.d(f10, false);
        float paddingTop = (n2Var.f9509x + h1Var.getPaddingTop()) - AndroidUtilities.lerp(AndroidUtilities.dp(8.0f), h1Var.getPaddingTop(), d);
        RectF rectF = AndroidUtilities.rectTmp;
        i10 = ((org.telegram.ui.ActionBar.f3) n2Var).backgroundPaddingLeft;
        int width = getWidth();
        i11 = ((org.telegram.ui.ActionBar.f3) n2Var).backgroundPaddingLeft;
        rectF.set(i10, paddingTop, width - i11, AndroidUtilities.dp(8.0f) + getHeight());
        if (this.d != null) {
            this.f9235f.reset();
            this.f9235f.postScale(16.0f, 16.0f);
            this.f9235f.postTranslate(0.0f, -getY());
            this.e.setLocalMatrix(this.f9235f);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), this.f9233b);
        }
        if (rectF.top < AndroidUtilities.statusBarHeight) {
            z10 = true;
        } else {
            z10 = false;
        }
        Boolean bool = this.f9237r;
        if (bool == null || bool.booleanValue() != z10) {
            this.f9237r = Boolean.valueOf(z10);
            Window window = n2Var.getWindow();
            if (z10 && AndroidUtilities.computePerceivedBrightness(paint.getColor()) >= 0.721f) {
                z11 = true;
            }
            AndroidUtilities.setLightStatusBar(window, z11);
        }
        float f11 = 1.0f - d;
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(14.0f) * f11, AndroidUtilities.dp(14.0f) * f11, paint);
        int width2 = getWidth();
        RectF rectF2 = this.f9236n;
        rectF2.set((getWidth() - AndroidUtilities.dp(36.0f)) / 2.0f, AndroidUtilities.dp(9.66f) + paddingTop, (AndroidUtilities.dp(36.0f) + width2) / 2.0f, paddingTop + AndroidUtilities.dp(13.66f));
        Paint paint2 = this.f9234c;
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
            float y3 = motionEvent.getY();
            n2 n2Var = this.f9238s;
            if (y3 < n2Var.f9509x) {
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
        this.f9233b.setShader(null);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        org.telegram.ui.ActionBar.d6 d6Var;
        org.telegram.ui.ActionBar.d6 d6Var2;
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.d == null) {
            n2 n2Var = this.f9238s;
            d6Var = ((org.telegram.ui.ActionBar.f3) n2Var).resourcesProvider;
            if (d6Var != null) {
                d6Var2 = ((org.telegram.ui.ActionBar.f3) n2Var).resourcesProvider;
                if (!d6Var2.a()) {
                    return;
                }
            } else if (!org.telegram.ui.ActionBar.h6.I.q()) {
                return;
            }
            if (n2Var.f9508w != null && SharedConfig.getDevicePerformanceClass() > 0 && !LiteMode.isPowerSaverApplied()) {
                Point point = AndroidUtilities.displaySize;
                Bitmap createBitmap = Bitmap.createBitmap(point.x / 16, point.y / 16, Bitmap.Config.ARGB_8888);
                n2Var.f9508w.run(createBitmap, Float.valueOf(16.0f));
                Utilities.stackBlurBitmap(createBitmap, 8);
                this.d = createBitmap;
                Bitmap bitmap = this.d;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                this.e = bitmapShader;
                this.f9233b.setShader(bitmapShader);
                if (this.f9235f == null) {
                    this.f9235f = new Matrix();
                }
                this.f9235f.postScale(16.0f, 16.0f);
                this.e.setLocalMatrix(this.f9235f);
                invalidate();
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        float min = Math.min(size2 * 0.45f, (AndroidUtilities.dp(350.0f) / 0.55f) * 0.45f);
        n2 n2Var = this.f9238s;
        n2Var.f9505n = min;
        h1 h1Var = n2Var.f9504f;
        h1Var.setPadding(0, AndroidUtilities.statusBarHeight, 0, 0);
        h1Var.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        m2 m2Var = n2Var.h;
        if (m2Var != null) {
            m2Var.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), 0);
        }
        setMeasuredDimension(size, size2);
    }

    @Override
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        invalidate();
    }
}
