package lh;

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
import org.telegram.ui.Components.er;

public final class j1 extends FrameLayout {

    public final Paint f16160a;

    public final Paint f16161b;

    public final Paint f16162c;
    public Bitmap d;

    public BitmapShader f16163e;

    public Matrix f16164f;
    public final org.telegram.ui.Components.y5 h;

    public final RectF f16165n;

    public Boolean f16166r;

    public final l2 f16167s;

    public j1(l2 l2Var, Context context) {
        super(context);
        this.f16167s = l2Var;
        this.f16160a = new Paint(1);
        this.f16161b = new Paint(3);
        this.f16162c = new Paint(1);
        this.h = new org.telegram.ui.Components.y5(this, 0L, 250L, er.h);
        this.f16165n = new RectF();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10 = org.telegram.ui.ActionBar.g6.f23124h5;
        l2 l2Var = this.f16167s;
        h1 h1Var = l2Var.f16288f;
        int iV0 = org.telegram.ui.ActionBar.g6.v0(i10, ((org.telegram.ui.ActionBar.e3) l2Var).resourcesProvider);
        Paint paint = this.f16160a;
        paint.setColor(iV0);
        paint.setAlpha((int) ((this.d == null ? 1.0f : 0.85f) * 255.0f));
        View[] viewPages = h1Var.getViewPages();
        l2Var.f16293x = 0.0f;
        boolean z10 = false;
        for (View view : viewPages) {
            if (view instanceof v1) {
                v1 v1Var = (v1) view;
                l2Var.f16293x += Utilities.clamp(1.0f - Math.abs(v1Var.getTranslationX() / v1Var.getMeasuredWidth()), 1.0f, 0.0f) * v1Var.b();
                if (v1Var.getVisibility() == 0) {
                    v1Var.c();
                }
            }
        }
        float fD = this.h.d(l2Var.f16293x <= 0.0f ? 1.0f : 0.0f, false);
        float paddingTop = (l2Var.f16293x + h1Var.getPaddingTop()) - AndroidUtilities.lerp(AndroidUtilities.dp(8.0f), h1Var.getPaddingTop(), fD);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(((org.telegram.ui.ActionBar.e3) l2Var).backgroundPaddingLeft, paddingTop, getWidth() - ((org.telegram.ui.ActionBar.e3) l2Var).backgroundPaddingLeft, AndroidUtilities.dp(8.0f) + getHeight());
        if (this.d != null) {
            this.f16164f.reset();
            this.f16164f.postScale(16.0f, 16.0f);
            this.f16164f.postTranslate(0.0f, -getY());
            this.f16163e.setLocalMatrix(this.f16164f);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), this.f16161b);
        }
        boolean z11 = rectF.top < ((float) AndroidUtilities.statusBarHeight);
        Boolean bool = this.f16166r;
        if (bool == null || bool.booleanValue() != z11) {
            this.f16166r = Boolean.valueOf(z11);
            Window window = l2Var.getWindow();
            if (z11 && AndroidUtilities.computePerceivedBrightness(paint.getColor()) >= 0.721f) {
                z10 = true;
            }
            AndroidUtilities.setLightStatusBar(window, z10);
        }
        float f10 = 1.0f - fD;
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(14.0f) * f10, AndroidUtilities.dp(14.0f) * f10, paint);
        float width = (getWidth() - AndroidUtilities.dp(36.0f)) / 2.0f;
        float fDp = AndroidUtilities.dp(9.66f) + paddingTop;
        float fDp2 = (AndroidUtilities.dp(36.0f) + getWidth()) / 2.0f;
        float fDp3 = paddingTop + AndroidUtilities.dp(13.66f);
        RectF rectF2 = this.f16165n;
        rectF2.set(width, fDp, fDp2, fDp3);
        Paint paint2 = this.f16162c;
        paint2.setColor(1367573379);
        paint2.setAlpha((int) (f10 * 81.0f));
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
            l2 l2Var = this.f16167s;
            if (y10 < l2Var.f16293x) {
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
        this.f16161b.setShader(null);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.d == null) {
            l2 l2Var = this.f16167s;
            if (((org.telegram.ui.ActionBar.e3) l2Var).resourcesProvider == null) {
                if (!org.telegram.ui.ActionBar.g6.I.q()) {
                    return;
                }
            } else if (!((org.telegram.ui.ActionBar.e3) l2Var).resourcesProvider.a()) {
                return;
            }
            if (l2Var.f16292w == null || SharedConfig.getDevicePerformanceClass() <= 0 || LiteMode.isPowerSaverApplied()) {
                return;
            }
            Point point = AndroidUtilities.displaySize;
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(point.x / 16, point.y / 16, Bitmap.Config.ARGB_8888);
            l2Var.f16292w.run(bitmapCreateBitmap, Float.valueOf(16.0f));
            Utilities.stackBlurBitmap(bitmapCreateBitmap, 8);
            this.d = bitmapCreateBitmap;
            Bitmap bitmap = this.d;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
            this.f16163e = bitmapShader;
            this.f16161b.setShader(bitmapShader);
            if (this.f16164f == null) {
                this.f16164f = new Matrix();
            }
            this.f16164f.postScale(16.0f, 16.0f);
            this.f16163e.setLocalMatrix(this.f16164f);
            invalidate();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        float fMin = Math.min(size2 * 0.45f, (AndroidUtilities.dp(350.0f) / 0.55f) * 0.45f);
        l2 l2Var = this.f16167s;
        l2Var.f16289n = fMin;
        h1 h1Var = l2Var.f16288f;
        h1Var.setPadding(0, AndroidUtilities.statusBarHeight, 0, 0);
        h1Var.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        k2 k2Var = l2Var.h;
        if (k2Var != null) {
            k2Var.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), 0);
        }
        setMeasuredDimension(size, size2);
    }

    @Override
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        invalidate();
    }
}
