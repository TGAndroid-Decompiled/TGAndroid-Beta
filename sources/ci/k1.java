package ci;

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
import org.telegram.ui.Components.tr;
public final class k1 extends FrameLayout {
    public final Paint f5283a;
    public final Paint f5284b;
    public final Paint f5285c;
    public Bitmap d;
    public BitmapShader f5286e;
    public Matrix f5287f;
    public final org.telegram.ui.Components.e6 h;
    public final RectF f5288n;
    public Boolean f5289r;
    public final s2 f5290s;

    public k1(s2 s2Var, Context context) {
        super(context);
        this.f5290s = s2Var;
        this.f5283a = new Paint(1);
        this.f5284b = new Paint(3);
        this.f5285c = new Paint(1);
        this.h = new org.telegram.ui.Components.e6(this, 0L, 250L, tr.h);
        this.f5288n = new RectF();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.d6 d6Var;
        float f7;
        float f10;
        int i10;
        int i11;
        boolean z10;
        int i12 = org.telegram.ui.ActionBar.i6.f20890h5;
        s2 s2Var = this.f5290s;
        i1 i1Var = s2Var.f5893f;
        d6Var = ((org.telegram.ui.ActionBar.f3) s2Var).resourcesProvider;
        int v02 = org.telegram.ui.ActionBar.i6.v0(i12, d6Var);
        Paint paint = this.f5283a;
        paint.setColor(v02);
        if (this.d == null) {
            f7 = 1.0f;
        } else {
            f7 = 0.85f;
        }
        paint.setAlpha((int) (f7 * 255.0f));
        View[] viewPages = i1Var.getViewPages();
        s2Var.f5898x = 0.0f;
        boolean z11 = false;
        for (View view : viewPages) {
            if (view instanceof a2) {
                a2 a2Var = (a2) view;
                s2Var.f5898x += Utilities.clamp(1.0f - Math.abs(a2Var.getTranslationX() / a2Var.getMeasuredWidth()), 1.0f, 0.0f) * a2Var.b();
                if (a2Var.getVisibility() == 0) {
                    a2Var.c();
                }
            }
        }
        if (s2Var.f5898x <= 0.0f) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        float d = this.h.d(f10, false);
        float paddingTop = (s2Var.f5898x + i1Var.getPaddingTop()) - AndroidUtilities.lerp(AndroidUtilities.dp(8.0f), i1Var.getPaddingTop(), d);
        RectF rectF = AndroidUtilities.rectTmp;
        i10 = ((org.telegram.ui.ActionBar.f3) s2Var).backgroundPaddingLeft;
        int width = getWidth();
        i11 = ((org.telegram.ui.ActionBar.f3) s2Var).backgroundPaddingLeft;
        rectF.set(i10, paddingTop, width - i11, AndroidUtilities.dp(8.0f) + getHeight());
        if (this.d != null) {
            this.f5287f.reset();
            this.f5287f.postScale(16.0f, 16.0f);
            this.f5287f.postTranslate(0.0f, -getY());
            this.f5286e.setLocalMatrix(this.f5287f);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), this.f5284b);
        }
        if (rectF.top < AndroidUtilities.statusBarHeight) {
            z10 = true;
        } else {
            z10 = false;
        }
        Boolean bool = this.f5289r;
        if (bool == null || bool.booleanValue() != z10) {
            this.f5289r = Boolean.valueOf(z10);
            Window window = s2Var.getWindow();
            if (z10 && AndroidUtilities.computePerceivedBrightness(paint.getColor()) >= 0.721f) {
                z11 = true;
            }
            AndroidUtilities.setLightStatusBar(window, z11);
        }
        float f11 = 1.0f - d;
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(14.0f) * f11, AndroidUtilities.dp(14.0f) * f11, paint);
        int width2 = getWidth();
        RectF rectF2 = this.f5288n;
        rectF2.set((getWidth() - AndroidUtilities.dp(36.0f)) / 2.0f, AndroidUtilities.dp(9.66f) + paddingTop, (AndroidUtilities.dp(36.0f) + width2) / 2.0f, paddingTop + AndroidUtilities.dp(13.66f));
        Paint paint2 = this.f5285c;
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
            s2 s2Var = this.f5290s;
            if (y3 < s2Var.f5898x) {
                s2Var.dismiss();
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
        this.f5284b.setShader(null);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        org.telegram.ui.ActionBar.d6 d6Var;
        org.telegram.ui.ActionBar.d6 d6Var2;
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.d == null) {
            s2 s2Var = this.f5290s;
            d6Var = ((org.telegram.ui.ActionBar.f3) s2Var).resourcesProvider;
            if (d6Var != null) {
                d6Var2 = ((org.telegram.ui.ActionBar.f3) s2Var).resourcesProvider;
                if (!d6Var2.a()) {
                    return;
                }
            } else if (!org.telegram.ui.ActionBar.i6.I.q()) {
                return;
            }
            if (s2Var.f5897w != null && SharedConfig.getDevicePerformanceClass() > 0 && !LiteMode.isPowerSaverApplied()) {
                Point point = AndroidUtilities.displaySize;
                Bitmap createBitmap = Bitmap.createBitmap(point.x / 16, point.y / 16, Bitmap.Config.ARGB_8888);
                s2Var.f5897w.run(createBitmap, Float.valueOf(16.0f));
                Utilities.stackBlurBitmap(createBitmap, 8);
                this.d = createBitmap;
                Bitmap bitmap = this.d;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                this.f5286e = bitmapShader;
                this.f5284b.setShader(bitmapShader);
                if (this.f5287f == null) {
                    this.f5287f = new Matrix();
                }
                this.f5287f.postScale(16.0f, 16.0f);
                this.f5286e.setLocalMatrix(this.f5287f);
                invalidate();
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        float min = Math.min(size2 * 0.45f, (AndroidUtilities.dp(350.0f) / 0.55f) * 0.45f);
        s2 s2Var = this.f5290s;
        s2Var.f5894n = min;
        i1 i1Var = s2Var.f5893f;
        i1Var.setPadding(0, AndroidUtilities.statusBarHeight, 0, 0);
        i1Var.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        r2 r2Var = s2Var.h;
        if (r2Var != null) {
            r2Var.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), 0);
        }
        setMeasuredDimension(size, size2);
    }

    @Override
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        invalidate();
    }
}
