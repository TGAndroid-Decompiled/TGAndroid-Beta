package bi;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.yh;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.u90;
import org.telegram.ui.Components.w90;
import org.telegram.ui.Components.x31;
import org.telegram.ui.j70;
public final class i7 extends FrameLayout {
    public final int f3173a;
    public Object f3174b;
    public Object f3175c;
    public Object d;

    public i7(Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        super(context);
        this.f3173a = 3;
        org.telegram.ui.Components.z9 z9Var = new org.telegram.ui.Components.z9(context);
        this.d = z9Var;
        z9Var.setRoundRadius(AndroidUtilities.dp(23.0f));
        addView(z9Var, w7.a6.a(46.0f, 21.0f, 6.0f, 0.0f, 6.0f, 46, 19));
        if (z10) {
            addView(new hi.a(context, c6Var), w7.a6.c(22.66f, 22.66f, 83, 48.66f, 0.0f, 0.0f, 3.6599998f));
        }
        TextView textView = new TextView(context);
        this.f3174b = textView;
        yh.k(16.0f, 1, textView);
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20007j5, c6Var));
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        addView(textView, w7.a6.a(-2.0f, 80.0f, 7.0f, 0.0f, 0.0f, -1, 51));
        TextView textView2 = new TextView(context);
        this.f3175c = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20305z6, c6Var));
        textView2.setSingleLine(true);
        textView2.setEllipsize(truncateAt);
        addView(textView2, w7.a6.a(-2.0f, 80.0f, 30.33f, 0.0f, 0.0f, -1, 51));
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        int i10;
        boolean z10;
        float f7;
        int i11;
        float f10;
        switch (this.f3173a) {
            case 1:
                RectF rectF = (RectF) this.f3174b;
                super.dispatchDraw(canvas);
                Paint paint = (Paint) this.f3175c;
                paint.setColor(-1);
                float width = getWidth() - (AndroidUtilities.dpf2(5.0f) * 2.0f);
                di.t6 t6Var = (di.t6) this.d;
                float dpf2 = (width - AndroidUtilities.dpf2((t6Var.f7833b - 1) * 2)) / t6Var.f7833b;
                float dpf22 = AndroidUtilities.dpf2(5.0f);
                for (int i12 = 0; i12 < t6Var.f7833b; i12++) {
                    rectF.set(dpf22, AndroidUtilities.dpf2(8.0f), dpf22 + dpf2, AndroidUtilities.dpf2(10.0f));
                    if (i12 < t6Var.f7833b - 1) {
                        i10 = 255;
                    } else {
                        i10 = 133;
                    }
                    paint.setAlpha(i10);
                    canvas.drawRoundRect(rectF, AndroidUtilities.dpf2(1.0f), AndroidUtilities.dpf2(1.0f), paint);
                    dpf22 += AndroidUtilities.dpf2(2.0f) + dpf2;
                }
                return;
            case 2:
            case 3:
            case 4:
            case 6:
            default:
                super.dispatchDraw(canvas);
                return;
            case 5:
                Paint paint2 = (Paint) this.f3175c;
                org.telegram.ui.ActionBar.g6.m(paint2);
                paint2.setColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.G8, ((org.telegram.ui.Components.h9) this.d).getResourceProvider()));
                paint2.setAlpha((int) (getAlpha() * 255.0f));
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                Path path = (Path) this.f3174b;
                path.rewind();
                path.addRoundRect(rectF2, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), Path.Direction.CW);
                canvas.drawPath(path, paint2);
                super.dispatchDraw(canvas);
                return;
            case 7:
                x31 x31Var = (x31) this.d;
                float i13 = x31Var.f31151f.i();
                int i14 = (i13 > 0.0f ? 1 : (i13 == 0.0f ? 0 : -1));
                if (i14 > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                float lerp = AndroidUtilities.lerp(0.5f, 1.0f, i13) * x31Var.K;
                float dp = AndroidUtilities.dp(10.0f);
                float dp2 = AndroidUtilities.dp(8.33f);
                float width2 = (getWidth() / 2.0f) + AndroidUtilities.dp(12.0f);
                float dp3 = AndroidUtilities.dp(12.0f);
                float max = Math.max(dp2 + dp2, x31Var.f31151f.c() + AndroidUtilities.dp(10.0f));
                if (z10) {
                    i11 = i14;
                    f10 = dp3;
                    f7 = width2;
                    canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                } else {
                    f7 = width2;
                    i11 = i14;
                    f10 = dp3;
                }
                super.dispatchDraw(canvas);
                if (z10) {
                    RectF rectF3 = AndroidUtilities.rectTmp;
                    float f11 = max / 2.0f;
                    rectF3.set((f7 - f11) - AndroidUtilities.dp(1.33f), f10 - dp, f11 + f7 + AndroidUtilities.dp(1.33f), f10 + dp);
                    AndroidUtilities.scaleRect(rectF3, i13);
                    float f12 = dp * i13;
                    canvas.drawRoundRect(rectF3, f12, f12, (Paint) this.f3174b);
                    canvas.restore();
                }
                if (i11 > 0) {
                    canvas.save();
                    canvas.scale(lerp, lerp, f7, f10);
                    RectF rectF4 = AndroidUtilities.rectTmp;
                    float f13 = max / 2.0f;
                    rectF4.set(f7 - f13, f10 - dp2, f7 + f13, f10 + dp2);
                    org.telegram.ui.Components.k6 k6Var = (org.telegram.ui.Components.k6) this.f3175c;
                    k6Var.setColor(org.telegram.ui.ActionBar.g6.m1(i13, k6Var.f26590b.a(org.telegram.ui.ActionBar.g6.w0(x31Var.E, k6Var.f26589a), false)));
                    canvas.drawRoundRect(rectF4, dp2, dp2, k6Var);
                    x31Var.f31151f.p(rectF4);
                    org.telegram.ui.Components.r6 r6Var = x31Var.f31151f;
                    r6Var.B = (int) (i13 * 255.0f);
                    r6Var.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            case 8:
                Paint paint3 = (Paint) this.f3175c;
                j70 j70Var = (j70) this.d;
                paint3.setColor(j70Var.getThemedColor(org.telegram.ui.ActionBar.g6.f19901d6));
                canvas.save();
                canvas.translate(0.0f, -getTop());
                RectF rectF5 = (RectF) this.f3174b;
                rectF5.set(0.0f, 0.0f, getWidth(), getHeight());
                rectF5.offset(0.0f, getTop());
                j70.a0(j70Var, canvas, rectF5, paint3);
                canvas.restore();
                super.dispatchDraw(canvas);
                return;
            case 9:
                int save = canvas.save();
                canvas.concat((Matrix) this.f3174b);
                Path path2 = (Path) this.f3175c;
                w7.j6.a(path2, getWidth(), getHeight());
                canvas.clipPath(path2);
                super.dispatchDraw(canvas);
                canvas.restoreToCount(save);
                return;
        }
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f3173a) {
            case 10:
                canvas.save();
                canvas.clipPath((Path) this.f3174b);
                super.draw(canvas);
                canvas.restore();
                return;
            default:
                super.draw(canvas);
                return;
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        switch (this.f3173a) {
            case 2:
                zf.z zVar = (zf.z) this.f3174b;
                zf.z zVar2 = (zf.z) this.f3175c;
                boolean drawChild = super.drawChild(canvas, view, j10);
                gi.p pVar = (gi.p) this.d;
                if (view == pVar.d) {
                    int i10 = org.telegram.ui.ActionBar.g6.f19843a7;
                    zVar.b(pVar.getThemedColor(i10));
                    zVar.setBounds(0, 0, getWidth(), AndroidUtilities.statusBarHeight);
                    zVar.draw(canvas);
                    float navigationBarThirdButtonsFactor = AndroidUtilities.getNavigationBarThirdButtonsFactor(AndroidUtilities.navigationBarHeight);
                    if (navigationBarThirdButtonsFactor > 0.0f) {
                        zVar2.setAlpha((int) (navigationBarThirdButtonsFactor * 255.0f));
                        zVar2.b(pVar.getThemedColor(i10));
                        zVar2.setBounds(0, getHeight() - AndroidUtilities.navigationBarHeight, getWidth(), getHeight());
                        zVar2.draw(canvas);
                    }
                }
                return drawChild;
            case 11:
                rg.t2 t2Var = ((rg.v2) this.d).f44584f;
                if (view == t2Var) {
                    canvas.save();
                    canvas.translate(((org.telegram.ui.Components.g6) this.f3174b).d(view.getX(), false), ((org.telegram.ui.Components.g6) this.f3175c).d(view.getY(), false));
                    t2Var.a(canvas);
                    canvas.restore();
                    return true;
                }
                return super.drawChild(canvas, view, j10);
            case 13:
                Paint paint = (Paint) this.f3174b;
                if (((zh.j7) this.d).e > 1) {
                    paint.setColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19901d6, (org.telegram.ui.ActionBar.c6) this.f3175c));
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(view.getX(), view.getY(), view.getX() + view.getWidth(), view.getY() + view.getHeight());
                    rectF.inset(-AndroidUtilities.dp(1.66f), -AndroidUtilities.dp(1.66f));
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), paint);
                }
                return super.drawChild(canvas, view, j10);
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f3173a) {
            case 4:
                super.onDraw(canvas);
                Paint paint = (Paint) this.f3175c;
                paint.setColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f20122p7, false));
                canvas.save();
                TextPaint textPaint = (TextPaint) this.d;
                canvas.translate((getMeasuredWidth() - textPaint.measureText("500")) - AndroidUtilities.dp(8.0f), AndroidUtilities.dpf2(7.0f));
                RectF rectF = (RectF) this.f3174b;
                rectF.set(0.0f, 0.0f, textPaint.measureText("500"), textPaint.getTextSize());
                rectF.inset(-AndroidUtilities.dp(6.0f), -AndroidUtilities.dp(3.0f));
                float textSize = (textPaint.getTextSize() / 2.0f) + AndroidUtilities.dp(3.0f);
                canvas.drawRoundRect(rectF, textSize, textSize, paint);
                canvas.drawText("500", 0.0f, textPaint.getTextSize() - AndroidUtilities.dpf2(2.0f), textPaint);
                canvas.restore();
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f3173a) {
            case 10:
                super.onMeasure(i10, i11);
                Path path = (Path) this.f3174b;
                path.rewind();
                RectF rectF = (RectF) this.f3175c;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                path.addRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), Path.Direction.CW);
                rg.t2 t2Var = ((rg.v2) this.d).f44584f;
                if (t2Var != null) {
                    t2Var.setMaxWidth(getMeasuredWidth() - AndroidUtilities.dp(32.0f));
                    return;
                }
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.f3173a) {
            case 7:
                if (((x31) this.d).f31151f != drawable && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public i7(di.t6 t6Var, Context context) {
        super(context);
        this.f3173a = 1;
        this.d = t6Var;
        this.f3174b = new RectF();
        this.f3175c = new Paint(1);
    }

    public i7(Context context, Paint paint, TextPaint textPaint) {
        super(context);
        this.f3173a = 4;
        this.f3175c = paint;
        this.d = textPaint;
        this.f3174b = new RectF();
    }

    public i7(rg.v2 v2Var, Context context, int i10) {
        super(context);
        this.f3173a = i10;
        switch (i10) {
            case 11:
                this.d = v2Var;
                super(context);
                es esVar = es.h;
                this.f3174b = new org.telegram.ui.Components.g6(this, 0L, 350L, esVar);
                this.f3175c = new org.telegram.ui.Components.g6(this, 0L, 350L, esVar);
                return;
            default:
                this.d = v2Var;
                this.f3174b = new Path();
                this.f3175c = new RectF();
                return;
        }
    }

    public i7(gi.p pVar, Context context) {
        super(context);
        this.f3173a = 2;
        this.d = pVar;
        this.f3174b = new zf.z(2);
        this.f3175c = new zf.z(8);
    }

    public i7(j7 j7Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.c6 c6Var;
        org.telegram.ui.ActionBar.c6 c6Var2;
        this.f3173a = 0;
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Oh, false), PorterDuff.Mode.MULTIPLY));
        addView(imageView, w7.a6.a(28.0f, 25.0f, 12.0f, 16.0f, 0.0f, 28, 0));
        TextView textView = new TextView(context);
        this.f3174b = textView;
        textView.setTypeface(AndroidUtilities.bold());
        int i10 = org.telegram.ui.ActionBar.g6.G6;
        c6Var = ((org.telegram.ui.ActionBar.e3) j7Var).resourcesProvider;
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(i10, c6Var));
        textView.setTextSize(1, 14.0f);
        addView(textView, w7.a6.a(-2.0f, 68.0f, 8.0f, 16.0f, 0.0f, -1, 0));
        TextView textView2 = new TextView(context);
        this.f3175c = textView2;
        int i11 = org.telegram.ui.ActionBar.g6.f20288y6;
        c6Var2 = ((org.telegram.ui.ActionBar.e3) j7Var).resourcesProvider;
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(i11, c6Var2));
        textView2.setTextSize(1, 14.0f);
        addView(textView2, w7.a6.a(-2.0f, 68.0f, 28.0f, 16.0f, 8.0f, -1, 0));
    }

    public i7(org.telegram.ui.Components.h9 h9Var, Activity activity) {
        super(activity);
        this.f3173a = 5;
        this.d = h9Var;
        this.f3174b = new Path();
        this.f3175c = new Paint(1);
    }

    public i7(Context context, int i10) {
        super(context);
        this.f3173a = i10;
        switch (i10) {
            case 12:
                super(context);
                return;
            default:
                this.f3174b = new Matrix();
                this.f3175c = new Path();
                this.d = new float[8];
                setClipChildren(false);
                setClipToPadding(false);
                return;
        }
    }

    public i7(w90 w90Var, Context context) {
        super(context);
        this.f3173a = 6;
        this.d = w90Var;
        u90 u90Var = new u90(this, context);
        this.f3175c = u90Var;
        LinearLayout e = yh.e(context, 0);
        addView(e, w7.a6.e(-2, -1, 1));
        TextView textView = new TextView(context);
        this.f3174b = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        e.addView(u90Var, w7.a6.n(-2, -1));
        e.addView(textView, w7.a6.q(-2, -2, 16));
        setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        u90Var.a(false);
    }

    public i7(j70 j70Var, Context context) {
        super(context);
        this.f3173a = 8;
        this.d = j70Var;
        this.f3174b = new RectF();
        this.f3175c = new Paint(1);
    }

    public i7(x31 x31Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f3173a = 7;
        this.d = x31Var;
        Paint paint = new Paint(1);
        this.f3174b = paint;
        this.f3175c = new org.telegram.ui.Components.k6(this, c6Var);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        x31Var.f31151f.setCallback(this);
    }

    public i7(zh.j7 j7Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f3173a = 13;
        this.d = j7Var;
        this.f3175c = c6Var;
        this.f3174b = new Paint(1);
    }
}
