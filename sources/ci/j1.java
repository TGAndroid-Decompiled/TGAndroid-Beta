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
import org.telegram.ui.Components.is;
public final class j1 extends FrameLayout {
    public final Paint f5221a;
    public final Paint f5222b;
    public final Paint f5223c;
    public Bitmap d;
    public BitmapShader f5224e;
    public Matrix f5225f;
    public final org.telegram.ui.Components.g6 h;
    public final RectF f5226n;
    public Boolean f5227r;
    public final r2 f5228s;

    public j1(r2 r2Var, Context context) {
        super(context);
        this.f5228s = r2Var;
        this.f5221a = new Paint(1);
        this.f5222b = new Paint(3);
        this.f5223c = new Paint(1);
        this.h = new org.telegram.ui.Components.g6(this, 0L, 250L, is.h);
        this.f5226n = new RectF();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.e6 e6Var;
        float f7;
        float f10;
        int i10;
        int i11;
        boolean z10;
        int i12 = org.telegram.ui.ActionBar.i6.f20872h5;
        r2 r2Var = this.f5228s;
        h1 h1Var = r2Var.f5885f;
        e6Var = ((org.telegram.ui.ActionBar.f3) r2Var).resourcesProvider;
        int w02 = org.telegram.ui.ActionBar.i6.w0(i12, e6Var);
        Paint paint = this.f5221a;
        paint.setColor(w02);
        if (this.d == null) {
            f7 = 1.0f;
        } else {
            f7 = 0.85f;
        }
        paint.setAlpha((int) (f7 * 255.0f));
        View[] viewPages = h1Var.getViewPages();
        r2Var.f5890x = 0.0f;
        boolean z11 = false;
        for (View view : viewPages) {
            if (view instanceof z1) {
                z1 z1Var = (z1) view;
                r2Var.f5890x += Utilities.clamp(1.0f - Math.abs(z1Var.getTranslationX() / z1Var.getMeasuredWidth()), 1.0f, 0.0f) * z1Var.b();
                if (z1Var.getVisibility() == 0) {
                    z1Var.c();
                }
            }
        }
        if (r2Var.f5890x <= 0.0f) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        float d = this.h.d(f10, false);
        float paddingTop = (r2Var.f5890x + h1Var.getPaddingTop()) - AndroidUtilities.lerp(AndroidUtilities.dp(8.0f), h1Var.getPaddingTop(), d);
        RectF rectF = AndroidUtilities.rectTmp;
        i10 = ((org.telegram.ui.ActionBar.f3) r2Var).backgroundPaddingLeft;
        int width = getWidth();
        i11 = ((org.telegram.ui.ActionBar.f3) r2Var).backgroundPaddingLeft;
        rectF.set(i10, paddingTop, width - i11, AndroidUtilities.dp(8.0f) + getHeight());
        if (this.d != null) {
            this.f5225f.reset();
            this.f5225f.postScale(16.0f, 16.0f);
            this.f5225f.postTranslate(0.0f, -getY());
            this.f5224e.setLocalMatrix(this.f5225f);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), this.f5222b);
        }
        if (rectF.top < AndroidUtilities.statusBarHeight) {
            z10 = true;
        } else {
            z10 = false;
        }
        Boolean bool = this.f5227r;
        if (bool == null || bool.booleanValue() != z10) {
            this.f5227r = Boolean.valueOf(z10);
            Window window = r2Var.getWindow();
            if (z10 && AndroidUtilities.computePerceivedBrightness(paint.getColor()) >= 0.721f) {
                z11 = true;
            }
            AndroidUtilities.setLightStatusBar(window, z11);
        }
        float f11 = 1.0f - d;
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(14.0f) * f11, AndroidUtilities.dp(14.0f) * f11, paint);
        int width2 = getWidth();
        RectF rectF2 = this.f5226n;
        rectF2.set((getWidth() - AndroidUtilities.dp(36.0f)) / 2.0f, AndroidUtilities.dp(9.66f) + paddingTop, (AndroidUtilities.dp(36.0f) + width2) / 2.0f, paddingTop + AndroidUtilities.dp(13.66f));
        Paint paint2 = this.f5223c;
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
            r2 r2Var = this.f5228s;
            if (y3 < r2Var.f5890x) {
                r2Var.dismiss();
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
        this.f5222b.setShader(null);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        org.telegram.ui.ActionBar.e6 e6Var;
        org.telegram.ui.ActionBar.e6 e6Var2;
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.d == null) {
            r2 r2Var = this.f5228s;
            e6Var = ((org.telegram.ui.ActionBar.f3) r2Var).resourcesProvider;
            if (e6Var != null) {
                e6Var2 = ((org.telegram.ui.ActionBar.f3) r2Var).resourcesProvider;
                if (!e6Var2.a()) {
                    return;
                }
            } else if (!org.telegram.ui.ActionBar.i6.I.q()) {
                return;
            }
            if (r2Var.f5889w != null && SharedConfig.getDevicePerformanceClass() > 0 && !LiteMode.isPowerSaverApplied()) {
                Point point = AndroidUtilities.displaySize;
                Bitmap createBitmap = Bitmap.createBitmap(point.x / 16, point.y / 16, Bitmap.Config.ARGB_8888);
                r2Var.f5889w.run(createBitmap, Float.valueOf(16.0f));
                Utilities.stackBlurBitmap(createBitmap, 8);
                this.d = createBitmap;
                Bitmap bitmap = this.d;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                this.f5224e = bitmapShader;
                this.f5222b.setShader(bitmapShader);
                if (this.f5225f == null) {
                    this.f5225f = new Matrix();
                }
                this.f5225f.postScale(16.0f, 16.0f);
                this.f5224e.setLocalMatrix(this.f5225f);
                invalidate();
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        float min = Math.min(size2 * 0.45f, (AndroidUtilities.dp(350.0f) / 0.55f) * 0.45f);
        r2 r2Var = this.f5228s;
        r2Var.f5886n = min;
        h1 h1Var = r2Var.f5885f;
        h1Var.setPadding(0, AndroidUtilities.statusBarHeight, 0, 0);
        h1Var.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        q2 q2Var = r2Var.h;
        if (q2Var != null) {
            q2Var.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), 0);
        }
        setMeasuredDimension(size, size2);
    }

    @Override
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        invalidate();
    }
}
