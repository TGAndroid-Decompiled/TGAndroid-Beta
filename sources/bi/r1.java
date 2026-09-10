package bi;

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
import org.telegram.ui.Components.wr;
public final class r1 extends FrameLayout {
    public final Paint f3485a;
    public final Paint f3486b;
    public final Paint f3487c;
    public Bitmap d;
    public BitmapShader e;
    public Matrix f3488f;
    public final org.telegram.ui.Components.d6 h;
    public final RectF f3489n;
    public Boolean f3490r;
    public final f3 f3491s;

    public r1(f3 f3Var, Context context) {
        super(context);
        this.f3491s = f3Var;
        this.f3485a = new Paint(1);
        this.f3486b = new Paint(3);
        this.f3487c = new Paint(1);
        this.h = new org.telegram.ui.Components.d6(this, 0L, 250L, wr.h);
        this.f3489n = new RectF();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.f6 f6Var;
        float f7;
        float f10;
        int i10;
        int i11;
        boolean z10;
        int i12 = org.telegram.ui.ActionBar.j6.f17998h5;
        f3 f3Var = this.f3491s;
        p1 p1Var = f3Var.f2693f;
        f6Var = ((org.telegram.ui.ActionBar.h3) f3Var).resourcesProvider;
        int v02 = org.telegram.ui.ActionBar.j6.v0(i12, f6Var);
        Paint paint = this.f3485a;
        paint.setColor(v02);
        if (this.d == null) {
            f7 = 1.0f;
        } else {
            f7 = 0.85f;
        }
        paint.setAlpha((int) (f7 * 255.0f));
        View[] viewPages = p1Var.getViewPages();
        f3Var.f2698x = 0.0f;
        boolean z11 = false;
        for (View view : viewPages) {
            if (view instanceof l2) {
                l2 l2Var = (l2) view;
                f3Var.f2698x += Utilities.clamp(1.0f - Math.abs(l2Var.getTranslationX() / l2Var.getMeasuredWidth()), 1.0f, 0.0f) * l2Var.b();
                if (l2Var.getVisibility() == 0) {
                    l2Var.c();
                }
            }
        }
        if (f3Var.f2698x <= 0.0f) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        float d = this.h.d(f10, false);
        float paddingTop = (f3Var.f2698x + p1Var.getPaddingTop()) - AndroidUtilities.lerp(AndroidUtilities.dp(8.0f), p1Var.getPaddingTop(), d);
        RectF rectF = AndroidUtilities.rectTmp;
        i10 = ((org.telegram.ui.ActionBar.h3) f3Var).backgroundPaddingLeft;
        int width = getWidth();
        i11 = ((org.telegram.ui.ActionBar.h3) f3Var).backgroundPaddingLeft;
        rectF.set(i10, paddingTop, width - i11, AndroidUtilities.dp(8.0f) + getHeight());
        if (this.d != null) {
            this.f3488f.reset();
            this.f3488f.postScale(16.0f, 16.0f);
            this.f3488f.postTranslate(0.0f, -getY());
            this.e.setLocalMatrix(this.f3488f);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), this.f3486b);
        }
        if (rectF.top < AndroidUtilities.statusBarHeight) {
            z10 = true;
        } else {
            z10 = false;
        }
        Boolean bool = this.f3490r;
        if (bool == null || bool.booleanValue() != z10) {
            this.f3490r = Boolean.valueOf(z10);
            Window window = f3Var.getWindow();
            if (z10 && AndroidUtilities.computePerceivedBrightness(paint.getColor()) >= 0.721f) {
                z11 = true;
            }
            AndroidUtilities.setLightStatusBar(window, z11);
        }
        float f11 = 1.0f - d;
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(14.0f) * f11, AndroidUtilities.dp(14.0f) * f11, paint);
        int width2 = getWidth();
        RectF rectF2 = this.f3489n;
        rectF2.set((getWidth() - AndroidUtilities.dp(36.0f)) / 2.0f, AndroidUtilities.dp(9.66f) + paddingTop, (AndroidUtilities.dp(36.0f) + width2) / 2.0f, paddingTop + AndroidUtilities.dp(13.66f));
        Paint paint2 = this.f3487c;
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
            f3 f3Var = this.f3491s;
            if (y3 < f3Var.f2698x) {
                f3Var.dismiss();
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
        this.f3486b.setShader(null);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.f6 f6Var2;
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.d == null) {
            f3 f3Var = this.f3491s;
            f6Var = ((org.telegram.ui.ActionBar.h3) f3Var).resourcesProvider;
            if (f6Var != null) {
                f6Var2 = ((org.telegram.ui.ActionBar.h3) f3Var).resourcesProvider;
                if (!f6Var2.a()) {
                    return;
                }
            } else if (!org.telegram.ui.ActionBar.j6.I.q()) {
                return;
            }
            if (f3Var.f2697w != null && SharedConfig.getDevicePerformanceClass() > 0 && !LiteMode.isPowerSaverApplied()) {
                Point point = AndroidUtilities.displaySize;
                Bitmap createBitmap = Bitmap.createBitmap(point.x / 16, point.y / 16, Bitmap.Config.ARGB_8888);
                f3Var.f2697w.run(createBitmap, Float.valueOf(16.0f));
                Utilities.stackBlurBitmap(createBitmap, 8);
                this.d = createBitmap;
                Bitmap bitmap = this.d;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                this.e = bitmapShader;
                this.f3486b.setShader(bitmapShader);
                if (this.f3488f == null) {
                    this.f3488f = new Matrix();
                }
                this.f3488f.postScale(16.0f, 16.0f);
                this.e.setLocalMatrix(this.f3488f);
                invalidate();
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        float min = Math.min(size2 * 0.45f, (AndroidUtilities.dp(350.0f) / 0.55f) * 0.45f);
        f3 f3Var = this.f3491s;
        f3Var.f2694n = min;
        p1 p1Var = f3Var.f2693f;
        p1Var.setPadding(0, AndroidUtilities.statusBarHeight, 0, 0);
        p1Var.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        e3 e3Var = f3Var.h;
        if (e3Var != null) {
            e3Var.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), 0);
        }
        setMeasuredDimension(size, size2);
    }

    @Override
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        invalidate();
    }
}
