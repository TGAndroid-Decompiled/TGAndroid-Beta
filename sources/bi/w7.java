package bi;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
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
import org.telegram.messenger.em;
import org.telegram.ui.Components.d90;
import org.telegram.ui.Components.f90;
import org.telegram.ui.Components.j31;
import org.telegram.ui.Components.wr;
import org.telegram.ui.e70;
public final class w7 extends FrameLayout {
    public final int f3832a;
    public Object f3833b;
    public Object f3834c;
    public Object d;

    public w7(Context context) {
        super(context);
        this.f3832a = 10;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        int i10;
        boolean z10;
        float f7;
        int i11;
        float f10;
        switch (this.f3832a) {
            case 0:
                RectF rectF = (RectF) this.f3833b;
                super.dispatchDraw(canvas);
                Paint paint = (Paint) this.f3834c;
                paint.setColor(-1);
                float width = getWidth() - (AndroidUtilities.dpf2(5.0f) * 2.0f);
                x7 x7Var = (x7) this.d;
                float dpf2 = (width - AndroidUtilities.dpf2((x7Var.f3917b - 1) * 2)) / x7Var.f3917b;
                float dpf22 = AndroidUtilities.dpf2(5.0f);
                for (int i12 = 0; i12 < x7Var.f3917b; i12++) {
                    rectF.set(dpf22, AndroidUtilities.dpf2(8.0f), dpf22 + dpf2, AndroidUtilities.dpf2(10.0f));
                    if (i12 < x7Var.f3917b - 1) {
                        i10 = 255;
                    } else {
                        i10 = 133;
                    }
                    paint.setAlpha(i10);
                    canvas.drawRoundRect(rectF, AndroidUtilities.dpf2(1.0f), AndroidUtilities.dpf2(1.0f), paint);
                    dpf22 += AndroidUtilities.dpf2(2.0f) + dpf2;
                }
                return;
            case 4:
                Paint paint2 = (Paint) this.f3834c;
                org.telegram.ui.ActionBar.j6.m(paint2);
                paint2.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G8, ((org.telegram.ui.Components.d9) this.d).getResourceProvider()));
                paint2.setAlpha((int) (getAlpha() * 255.0f));
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                Path path = (Path) this.f3833b;
                path.rewind();
                path.addRoundRect(rectF2, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), Path.Direction.CW);
                canvas.drawPath(path, paint2);
                super.dispatchDraw(canvas);
                return;
            case 6:
                j31 j31Var = (j31) this.d;
                float g10 = j31Var.f24225f.g();
                int i13 = (g10 > 0.0f ? 1 : (g10 == 0.0f ? 0 : -1));
                if (i13 > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                float lerp = AndroidUtilities.lerp(0.5f, 1.0f, g10) * j31Var.K;
                float dp = AndroidUtilities.dp(10.0f);
                float dp2 = AndroidUtilities.dp(8.33f);
                float width2 = (getWidth() / 2.0f) + AndroidUtilities.dp(12.0f);
                float dp3 = AndroidUtilities.dp(12.0f);
                float max = Math.max(dp2 + dp2, j31Var.f24225f.d() + AndroidUtilities.dp(10.0f));
                if (z10) {
                    i11 = i13;
                    f10 = dp3;
                    f7 = width2;
                    canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                } else {
                    f7 = width2;
                    i11 = i13;
                    f10 = dp3;
                }
                super.dispatchDraw(canvas);
                if (z10) {
                    RectF rectF3 = AndroidUtilities.rectTmp;
                    float f11 = max / 2.0f;
                    rectF3.set((f7 - f11) - AndroidUtilities.dp(1.33f), f10 - dp, f11 + f7 + AndroidUtilities.dp(1.33f), f10 + dp);
                    AndroidUtilities.scaleRect(rectF3, g10);
                    float f12 = dp * g10;
                    canvas.drawRoundRect(rectF3, f12, f12, (Paint) this.f3834c);
                    canvas.restore();
                }
                if (i11 > 0) {
                    canvas.save();
                    canvas.scale(lerp, lerp, f7, f10);
                    RectF rectF4 = AndroidUtilities.rectTmp;
                    float f13 = max / 2.0f;
                    rectF4.set(f7 - f13, f10 - dp2, f7 + f13, f10 + dp2);
                    org.telegram.ui.Components.h6 h6Var = (org.telegram.ui.Components.h6) this.f3833b;
                    h6Var.setColor(org.telegram.ui.ActionBar.j6.l1(g10, h6Var.f23526b.a(org.telegram.ui.ActionBar.j6.v0(j31Var.E, h6Var.f23525a), false)));
                    canvas.drawRoundRect(rectF4, dp2, dp2, h6Var);
                    j31Var.f24225f.m(rectF4);
                    org.telegram.ui.Components.n6 n6Var = j31Var.f24225f;
                    n6Var.f25442w = (int) (g10 * 255.0f);
                    n6Var.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            case 7:
                Paint paint3 = (Paint) this.f3834c;
                e70 e70Var = (e70) this.d;
                paint3.setColor(e70Var.getThemedColor(org.telegram.ui.ActionBar.j6.f17928d6));
                canvas.save();
                canvas.translate(0.0f, -getTop());
                RectF rectF5 = (RectF) this.f3833b;
                rectF5.set(0.0f, 0.0f, getWidth(), getHeight());
                rectF5.offset(0.0f, getTop());
                e70.a0(e70Var, canvas, rectF5, paint3);
                canvas.restore();
                super.dispatchDraw(canvas);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f3832a) {
            case 8:
                canvas.save();
                canvas.clipPath((Path) this.f3834c);
                super.draw(canvas);
                canvas.restore();
                return;
            default:
                super.draw(canvas);
                return;
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j3) {
        switch (this.f3832a) {
            case 1:
                xf.z zVar = (xf.z) this.f3833b;
                xf.z zVar2 = (xf.z) this.f3834c;
                boolean drawChild = super.drawChild(canvas, view, j3);
                ei.p pVar = (ei.p) this.d;
                if (view == pVar.d) {
                    int i10 = org.telegram.ui.ActionBar.j6.f17872a7;
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
            case 9:
                pg.r2 r2Var = ((pg.t2) this.d).f40305f;
                if (view == r2Var) {
                    canvas.save();
                    canvas.translate(((org.telegram.ui.Components.d6) this.f3833b).d(view.getX(), false), ((org.telegram.ui.Components.d6) this.f3834c).d(view.getY(), false));
                    r2Var.a(canvas);
                    canvas.restore();
                    return true;
                }
                return super.drawChild(canvas, view, j3);
            case 11:
                Paint paint = (Paint) this.f3834c;
                if (((xh.t7) this.d).e > 1) {
                    paint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f17928d6, (org.telegram.ui.ActionBar.f6) this.f3833b));
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(view.getX(), view.getY(), view.getX() + view.getWidth(), view.getY() + view.getHeight());
                    rectF.inset(-AndroidUtilities.dp(1.66f), -AndroidUtilities.dp(1.66f));
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), paint);
                }
                return super.drawChild(canvas, view, j3);
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f3832a) {
            case 3:
                super.onDraw(canvas);
                Paint paint = (Paint) this.f3834c;
                paint.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18144p7, false));
                canvas.save();
                TextPaint textPaint = (TextPaint) this.d;
                canvas.translate((getMeasuredWidth() - textPaint.measureText("500")) - AndroidUtilities.dp(8.0f), AndroidUtilities.dpf2(7.0f));
                RectF rectF = (RectF) this.f3833b;
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
        switch (this.f3832a) {
            case 8:
                super.onMeasure(i10, i11);
                Path path = (Path) this.f3834c;
                path.rewind();
                RectF rectF = (RectF) this.f3833b;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                path.addRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), Path.Direction.CW);
                pg.r2 r2Var = ((pg.t2) this.d).f40305f;
                if (r2Var != null) {
                    r2Var.setMaxWidth(getMeasuredWidth() - AndroidUtilities.dp(32.0f));
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
        switch (this.f3832a) {
            case 6:
                if (((j31) this.d).f24225f != drawable && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public w7(Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10) {
        super(context);
        this.f3832a = 2;
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        this.f3833b = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(23.0f));
        addView(w9Var, w7.a6.d(46, 46.0f, 19, 21.0f, 6.0f, 0.0f, 6.0f));
        if (z10) {
            addView(new fi.a(context, f6Var), w7.a6.b(22.66f, 22.66f, 83, 48.66f, 0.0f, 0.0f, 3.6599998f));
        }
        TextView textView = new TextView(context);
        this.f3834c = textView;
        em.j(16.0f, 1, textView);
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18034j5, f6Var));
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        addView(textView, w7.a6.d(-1, -2.0f, 51, 80.0f, 7.0f, 0.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18325z6, f6Var));
        textView2.setSingleLine(true);
        textView2.setEllipsize(truncateAt);
        addView(textView2, w7.a6.d(-1, -2.0f, 51, 80.0f, 30.33f, 0.0f, 0.0f));
    }

    public w7(x7 x7Var, Context context) {
        super(context);
        this.f3832a = 0;
        this.d = x7Var;
        this.f3833b = new RectF();
        this.f3834c = new Paint(1);
    }

    public w7(Context context, Paint paint, TextPaint textPaint) {
        super(context);
        this.f3832a = 3;
        this.f3834c = paint;
        this.d = textPaint;
        this.f3833b = new RectF();
    }

    public w7(pg.t2 t2Var, Context context, int i10) {
        super(context);
        this.f3832a = i10;
        switch (i10) {
            case 9:
                this.d = t2Var;
                super(context);
                wr wrVar = wr.h;
                this.f3833b = new org.telegram.ui.Components.d6(this, 0L, 350L, wrVar);
                this.f3834c = new org.telegram.ui.Components.d6(this, 0L, 350L, wrVar);
                return;
            default:
                this.d = t2Var;
                this.f3834c = new Path();
                this.f3833b = new RectF();
                return;
        }
    }

    public w7(ei.p pVar, Context context) {
        super(context);
        this.f3832a = 1;
        this.d = pVar;
        this.f3833b = new xf.z(2);
        this.f3834c = new xf.z(8);
    }

    public w7(zh.i4 i4Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.f6 f6Var2;
        this.f3832a = 12;
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Oh, false), PorterDuff.Mode.MULTIPLY));
        addView(imageView, w7.a6.d(28, 28.0f, 0, 25.0f, 12.0f, 16.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f3833b = textView;
        textView.setTypeface(AndroidUtilities.bold());
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        f6Var = ((org.telegram.ui.ActionBar.h3) i4Var).resourcesProvider;
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        textView.setTextSize(1, 14.0f);
        addView(textView, w7.a6.d(-1, -2.0f, 0, 68.0f, 8.0f, 16.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.f3834c = textView2;
        int i11 = org.telegram.ui.ActionBar.j6.f18306y6;
        f6Var2 = ((org.telegram.ui.ActionBar.h3) i4Var).resourcesProvider;
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var2));
        textView2.setTextSize(1, 14.0f);
        addView(textView2, w7.a6.d(-1, -2.0f, 0, 68.0f, 28.0f, 16.0f, 8.0f));
    }

    public w7(org.telegram.ui.Components.d9 d9Var, Activity activity) {
        super(activity);
        this.f3832a = 4;
        this.d = d9Var;
        this.f3833b = new Path();
        this.f3834c = new Paint(1);
    }

    public w7(f90 f90Var, Context context) {
        super(context);
        this.f3832a = 5;
        this.d = f90Var;
        d90 d90Var = new d90(this, context);
        this.f3834c = d90Var;
        LinearLayout f7 = em.f(context, 0);
        addView(f7, w7.a6.e(-2, -1, 1));
        TextView textView = new TextView(context);
        this.f3833b = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        f7.addView(d90Var, w7.a6.n(-2, -1));
        f7.addView(textView, w7.a6.q(-2, -2, 16));
        setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        d90Var.a(false);
    }

    public w7(e70 e70Var, Context context) {
        super(context);
        this.f3832a = 7;
        this.d = e70Var;
        this.f3833b = new RectF();
        this.f3834c = new Paint(1);
    }

    public w7(j31 j31Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f3832a = 6;
        this.d = j31Var;
        Paint paint = new Paint(1);
        this.f3834c = paint;
        this.f3833b = new org.telegram.ui.Components.h6(this, f6Var);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        j31Var.f24225f.setCallback(this);
    }

    public w7(xh.t7 t7Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f3832a = 11;
        this.d = t7Var;
        this.f3833b = f6Var;
        this.f3834c = new Paint(1);
    }
}
