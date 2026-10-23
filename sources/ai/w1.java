package ai;

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
import org.telegram.messenger.nk;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.o90;
import org.telegram.ui.Components.q90;
import org.telegram.ui.Components.r31;
import org.telegram.ui.l60;
public final class w1 extends FrameLayout {
    public final int f2340a;
    public Object f2341b;
    public Object f2342c;
    public Object d;

    public w1(Context context) {
        super(context);
        this.f2340a = 0;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        int i10;
        boolean z10;
        float f7;
        int i11;
        float f10;
        switch (this.f2340a) {
            case 3:
                RectF rectF = (RectF) this.f2341b;
                super.dispatchDraw(canvas);
                Paint paint = (Paint) this.f2342c;
                paint.setColor(-1);
                float width = getWidth() - (AndroidUtilities.dpf2(5.0f) * 2.0f);
                ei.l6 l6Var = (ei.l6) this.d;
                float dpf2 = (width - AndroidUtilities.dpf2((l6Var.f9377b - 1) * 2)) / l6Var.f9377b;
                float dpf22 = AndroidUtilities.dpf2(5.0f);
                for (int i12 = 0; i12 < l6Var.f9377b; i12++) {
                    rectF.set(dpf22, AndroidUtilities.dpf2(8.0f), dpf22 + dpf2, AndroidUtilities.dpf2(10.0f));
                    if (i12 < l6Var.f9377b - 1) {
                        i10 = 255;
                    } else {
                        i10 = 133;
                    }
                    paint.setAlpha(i10);
                    canvas.drawRoundRect(rectF, AndroidUtilities.dpf2(1.0f), AndroidUtilities.dpf2(1.0f), paint);
                    dpf22 += AndroidUtilities.dpf2(2.0f) + dpf2;
                }
                return;
            case 7:
                Paint paint2 = (Paint) this.f2342c;
                org.telegram.ui.ActionBar.h6.m(paint2);
                paint2.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G8, ((org.telegram.ui.Components.e9) this.d).getResourceProvider()));
                paint2.setAlpha((int) (getAlpha() * 255.0f));
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                Path path = (Path) this.f2341b;
                path.rewind();
                path.addRoundRect(rectF2, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), Path.Direction.CW);
                canvas.drawPath(path, paint2);
                super.dispatchDraw(canvas);
                return;
            case 9:
                r31 r31Var = (r31) this.d;
                float i13 = r31Var.f29807f.i();
                int i14 = (i13 > 0.0f ? 1 : (i13 == 0.0f ? 0 : -1));
                if (i14 > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                float lerp = AndroidUtilities.lerp(0.5f, 1.0f, i13) * r31Var.K;
                float dp = AndroidUtilities.dp(10.0f);
                float dp2 = AndroidUtilities.dp(8.33f);
                float width2 = (getWidth() / 2.0f) + AndroidUtilities.dp(12.0f);
                float dp3 = AndroidUtilities.dp(12.0f);
                float max = Math.max(dp2 + dp2, r31Var.f29807f.c() + AndroidUtilities.dp(10.0f));
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
                    canvas.drawRoundRect(rectF3, f12, f12, (Paint) this.f2341b);
                    canvas.restore();
                }
                if (i11 > 0) {
                    canvas.save();
                    canvas.scale(lerp, lerp, f7, f10);
                    RectF rectF4 = AndroidUtilities.rectTmp;
                    float f13 = max / 2.0f;
                    rectF4.set(f7 - f13, f10 - dp2, f7 + f13, f10 + dp2);
                    org.telegram.ui.Components.j6 j6Var = (org.telegram.ui.Components.j6) this.f2342c;
                    j6Var.setColor(org.telegram.ui.ActionBar.h6.m1(i13, j6Var.f27413b.a(org.telegram.ui.ActionBar.h6.w0(r31Var.E, j6Var.f27412a), false)));
                    canvas.drawRoundRect(rectF4, dp2, dp2, j6Var);
                    r31Var.f29807f.p(rectF4);
                    org.telegram.ui.Components.p6 p6Var = r31Var.f29807f;
                    p6Var.B = (int) (i13 * 255.0f);
                    p6Var.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            case 10:
                Paint paint3 = (Paint) this.f2342c;
                l60 l60Var = (l60) this.d;
                paint3.setColor(l60Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20994d6));
                canvas.save();
                canvas.translate(0.0f, -getTop());
                RectF rectF5 = (RectF) this.f2341b;
                rectF5.set(0.0f, 0.0f, getWidth(), getHeight());
                rectF5.offset(0.0f, getTop());
                l60.a0(l60Var, canvas, rectF5, paint3);
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
        switch (this.f2340a) {
            case 11:
                canvas.save();
                canvas.clipPath((Path) this.f2341b);
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
        switch (this.f2340a) {
            case 1:
                Paint paint = (Paint) this.f2341b;
                if (((hd) this.d).e > 1) {
                    paint.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20994d6, (org.telegram.ui.ActionBar.d6) this.f2342c));
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(view.getX(), view.getY(), view.getX() + view.getWidth(), view.getY() + view.getHeight());
                    rectF.inset(-AndroidUtilities.dp(1.66f), -AndroidUtilities.dp(1.66f));
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), paint);
                }
                return super.drawChild(canvas, view, j10);
            case 4:
                zf.y yVar = (zf.y) this.f2341b;
                zf.y yVar2 = (zf.y) this.f2342c;
                boolean drawChild = super.drawChild(canvas, view, j10);
                hi.o oVar = (hi.o) this.d;
                if (view == oVar.d) {
                    int i10 = org.telegram.ui.ActionBar.h6.f20936a7;
                    yVar.b(oVar.getThemedColor(i10));
                    yVar.setBounds(0, 0, getWidth(), AndroidUtilities.statusBarHeight);
                    yVar.draw(canvas);
                    float navigationBarThirdButtonsFactor = AndroidUtilities.getNavigationBarThirdButtonsFactor(AndroidUtilities.navigationBarHeight);
                    if (navigationBarThirdButtonsFactor > 0.0f) {
                        yVar2.setAlpha((int) (navigationBarThirdButtonsFactor * 255.0f));
                        yVar2.b(oVar.getThemedColor(i10));
                        yVar2.setBounds(0, getHeight() - AndroidUtilities.navigationBarHeight, getWidth(), getHeight());
                        yVar2.draw(canvas);
                    }
                }
                return drawChild;
            case 12:
                rg.r2 r2Var = ((rg.t2) this.d).f45659f;
                if (view == r2Var) {
                    canvas.save();
                    canvas.translate(((org.telegram.ui.Components.f6) this.f2341b).d(view.getX(), false), ((org.telegram.ui.Components.f6) this.f2342c).d(view.getY(), false));
                    r2Var.a(canvas);
                    canvas.restore();
                    return true;
                }
                return super.drawChild(canvas, view, j10);
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f2340a) {
            case 6:
                super.onDraw(canvas);
                Paint paint = (Paint) this.f2342c;
                paint.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21215p7, false));
                canvas.save();
                TextPaint textPaint = (TextPaint) this.d;
                canvas.translate((getMeasuredWidth() - textPaint.measureText("500")) - AndroidUtilities.dp(8.0f), AndroidUtilities.dpf2(7.0f));
                RectF rectF = (RectF) this.f2341b;
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
        switch (this.f2340a) {
            case 11:
                super.onMeasure(i10, i11);
                Path path = (Path) this.f2341b;
                path.rewind();
                RectF rectF = (RectF) this.f2342c;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                path.addRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), Path.Direction.CW);
                rg.r2 r2Var = ((rg.t2) this.d).f45659f;
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
        switch (this.f2340a) {
            case 9:
                if (((r31) this.d).f29807f != drawable && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public w1(Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10) {
        super(context);
        this.f2340a = 5;
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        this.f2342c = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(23.0f));
        addView(w9Var, w7.z5.d(46, 46.0f, 19, 21.0f, 6.0f, 0.0f, 6.0f));
        if (z10) {
            addView(new i7(context, d6Var), w7.z5.b(22.66f, 22.66f, 83, 48.66f, 0.0f, 0.0f, 3.6599998f));
        }
        TextView textView = new TextView(context);
        this.f2341b = textView;
        nk.k(16.0f, 1, textView);
        textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21100j5, d6Var));
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        addView(textView, w7.z5.d(-1, -2.0f, 51, 80.0f, 7.0f, 0.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21399z6, d6Var));
        textView2.setSingleLine(true);
        textView2.setEllipsize(truncateAt);
        addView(textView2, w7.z5.d(-1, -2.0f, 51, 80.0f, 30.33f, 0.0f, 0.0f));
    }

    public w1(ei.l6 l6Var, Context context) {
        super(context);
        this.f2340a = 3;
        this.d = l6Var;
        this.f2341b = new RectF();
        this.f2342c = new Paint(1);
    }

    public w1(Context context, Paint paint, TextPaint textPaint) {
        super(context);
        this.f2340a = 6;
        this.f2342c = paint;
        this.d = textPaint;
        this.f2341b = new RectF();
    }

    public w1(rg.t2 t2Var, Context context, int i10) {
        super(context);
        this.f2340a = i10;
        switch (i10) {
            case 12:
                this.d = t2Var;
                super(context);
                bs bsVar = bs.h;
                this.f2341b = new org.telegram.ui.Components.f6(this, 0L, 350L, bsVar);
                this.f2342c = new org.telegram.ui.Components.f6(this, 0L, 350L, bsVar);
                return;
            default:
                this.d = t2Var;
                this.f2341b = new Path();
                this.f2342c = new RectF();
                return;
        }
    }

    public w1(hi.o oVar, Context context) {
        super(context);
        this.f2340a = 4;
        this.d = oVar;
        this.f2341b = new zf.y(2);
        this.f2342c = new zf.y(8);
    }

    public w1(ci.g6 g6Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.d6 d6Var;
        org.telegram.ui.ActionBar.d6 d6Var2;
        this.f2340a = 2;
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Oh, false), PorterDuff.Mode.MULTIPLY));
        addView(imageView, w7.z5.d(28, 28.0f, 0, 25.0f, 12.0f, 16.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f2341b = textView;
        textView.setTypeface(AndroidUtilities.bold());
        int i10 = org.telegram.ui.ActionBar.h6.G6;
        d6Var = ((org.telegram.ui.ActionBar.f3) g6Var).resourcesProvider;
        textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(i10, d6Var));
        textView.setTextSize(1, 14.0f);
        addView(textView, w7.z5.d(-1, -2.0f, 0, 68.0f, 8.0f, 16.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.f2342c = textView2;
        int i11 = org.telegram.ui.ActionBar.h6.f21382y6;
        d6Var2 = ((org.telegram.ui.ActionBar.f3) g6Var).resourcesProvider;
        textView2.setTextColor(org.telegram.ui.ActionBar.h6.w0(i11, d6Var2));
        textView2.setTextSize(1, 14.0f);
        addView(textView2, w7.z5.d(-1, -2.0f, 0, 68.0f, 28.0f, 16.0f, 8.0f));
    }

    public w1(org.telegram.ui.Components.e9 e9Var, Activity activity) {
        super(activity);
        this.f2340a = 7;
        this.d = e9Var;
        this.f2341b = new Path();
        this.f2342c = new Paint(1);
    }

    public w1(q90 q90Var, Context context) {
        super(context);
        this.f2340a = 8;
        this.d = q90Var;
        o90 o90Var = new o90(this, context);
        this.f2342c = o90Var;
        LinearLayout e = nk.e(context, 0);
        addView(e, w7.z5.e(-2, -1, 1));
        TextView textView = new TextView(context);
        this.f2341b = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        e.addView(o90Var, w7.z5.n(-2, -1));
        e.addView(textView, w7.z5.q(-2, -2, 16));
        setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        o90Var.a(false);
    }

    public w1(l60 l60Var, Context context) {
        super(context);
        this.f2340a = 10;
        this.d = l60Var;
        this.f2341b = new RectF();
        this.f2342c = new Paint(1);
    }

    public w1(r31 r31Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f2340a = 9;
        this.d = r31Var;
        Paint paint = new Paint(1);
        this.f2341b = paint;
        this.f2342c = new org.telegram.ui.Components.j6(this, d6Var);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        r31Var.f29807f.setCallback(this);
    }

    public w1(hd hdVar, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f2340a = 1;
        this.d = hdVar;
        this.f2342c = d6Var;
        this.f2341b = new Paint(1);
    }
}
