package fi;

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
import org.telegram.ui.Components.ds;
public final class j1 extends FrameLayout {
    public final Paint f11034a;
    public final Paint f11035b;
    public final Paint f11036c;
    public Bitmap d;
    public BitmapShader e;
    public Matrix f11037f;
    public final org.telegram.ui.Components.h6 h;
    public final RectF f11038n;
    public Boolean f11039r;
    public final l2 f11040s;

    public j1(l2 l2Var, Context context) {
        super(context);
        this.f11040s = l2Var;
        this.f11034a = new Paint(1);
        this.f11035b = new Paint(3);
        this.f11036c = new Paint(1);
        this.h = new org.telegram.ui.Components.h6(this, 0L, 250L, ds.h);
        this.f11038n = new RectF();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.u6 u6Var;
        float f7;
        float f10;
        int i10;
        int i11;
        boolean z10;
        int i12 = org.telegram.ui.ActionBar.y6.f23427h5;
        l2 l2Var = this.f11040s;
        h1 h1Var = l2Var.f11158f;
        u6Var = ((org.telegram.ui.ActionBar.k3) l2Var).resourcesProvider;
        int w02 = org.telegram.ui.ActionBar.y6.w0(i12, u6Var);
        Paint paint = this.f11034a;
        paint.setColor(w02);
        if (this.d == null) {
            f7 = 1.0f;
        } else {
            f7 = 0.85f;
        }
        paint.setAlpha((int) (f7 * 255.0f));
        View[] viewPages = h1Var.getViewPages();
        l2Var.f11164y = 0.0f;
        boolean z11 = false;
        for (View view : viewPages) {
            if (view instanceof v1) {
                v1 v1Var = (v1) view;
                l2Var.f11164y += Utilities.clamp(1.0f - Math.abs(v1Var.getTranslationX() / v1Var.getMeasuredWidth()), 1.0f, 0.0f) * v1Var.b();
                if (v1Var.getVisibility() == 0) {
                    v1Var.c();
                }
            }
        }
        if (l2Var.f11164y <= 0.0f) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        float d = this.h.d(f10, false);
        float paddingTop = (l2Var.f11164y + h1Var.getPaddingTop()) - AndroidUtilities.lerp(AndroidUtilities.dp(8.0f), h1Var.getPaddingTop(), d);
        RectF rectF = AndroidUtilities.rectTmp;
        i10 = ((org.telegram.ui.ActionBar.k3) l2Var).backgroundPaddingLeft;
        int width = getWidth();
        i11 = ((org.telegram.ui.ActionBar.k3) l2Var).backgroundPaddingLeft;
        rectF.set(i10, paddingTop, width - i11, AndroidUtilities.dp(8.0f) + getHeight());
        if (this.d != null) {
            this.f11037f.reset();
            this.f11037f.postScale(16.0f, 16.0f);
            this.f11037f.postTranslate(0.0f, -getY());
            this.e.setLocalMatrix(this.f11037f);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), this.f11035b);
        }
        if (rectF.top < AndroidUtilities.statusBarHeight) {
            z10 = true;
        } else {
            z10 = false;
        }
        Boolean bool = this.f11039r;
        if (bool == null || bool.booleanValue() != z10) {
            this.f11039r = Boolean.valueOf(z10);
            Window window = l2Var.getWindow();
            if (z10 && AndroidUtilities.computePerceivedBrightness(paint.getColor()) >= 0.721f) {
                z11 = true;
            }
            AndroidUtilities.setLightStatusBar(window, z11);
        }
        float f11 = 1.0f - d;
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(14.0f) * f11, AndroidUtilities.dp(14.0f) * f11, paint);
        int width2 = getWidth();
        RectF rectF2 = this.f11038n;
        rectF2.set((getWidth() - AndroidUtilities.dp(36.0f)) / 2.0f, AndroidUtilities.dp(9.66f) + paddingTop, (AndroidUtilities.dp(36.0f) + width2) / 2.0f, paddingTop + AndroidUtilities.dp(13.66f));
        Paint paint2 = this.f11036c;
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
            l2 l2Var = this.f11040s;
            if (y3 < l2Var.f11164y) {
                l2Var.dismiss();
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
        this.f11035b.setShader(null);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        org.telegram.ui.ActionBar.u6 u6Var;
        org.telegram.ui.ActionBar.u6 u6Var2;
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.d == null) {
            l2 l2Var = this.f11040s;
            u6Var = ((org.telegram.ui.ActionBar.k3) l2Var).resourcesProvider;
            if (u6Var != null) {
                u6Var2 = ((org.telegram.ui.ActionBar.k3) l2Var).resourcesProvider;
                if (!u6Var2.a()) {
                    return;
                }
            } else if (!org.telegram.ui.ActionBar.y6.I.q()) {
                return;
            }
            if (l2Var.f11163x != null && SharedConfig.getDevicePerformanceClass() > 0 && !LiteMode.isPowerSaverApplied()) {
                Point point = AndroidUtilities.displaySize;
                Bitmap createBitmap = Bitmap.createBitmap(point.x / 16, point.y / 16, Bitmap.Config.ARGB_8888);
                l2Var.f11163x.run(createBitmap, Float.valueOf(16.0f));
                Utilities.stackBlurBitmap(createBitmap, 8);
                this.d = createBitmap;
                Bitmap bitmap = this.d;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                this.e = bitmapShader;
                this.f11035b.setShader(bitmapShader);
                if (this.f11037f == null) {
                    this.f11037f = new Matrix();
                }
                this.f11037f.postScale(16.0f, 16.0f);
                this.e.setLocalMatrix(this.f11037f);
                invalidate();
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        float min = Math.min(size2 * 0.45f, (AndroidUtilities.dp(350.0f) / 0.55f) * 0.45f);
        l2 l2Var = this.f11040s;
        l2Var.f11159n = min;
        h1 h1Var = l2Var.f11158f;
        h1Var.setPadding(0, AndroidUtilities.statusBarHeight, 0, 0);
        h1Var.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        k2 k2Var = l2Var.h;
        if (k2Var != null) {
            k2Var.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), 0);
        }
        setMeasuredDimension(size, size2);
    }

    @Override
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        invalidate();
    }
}
