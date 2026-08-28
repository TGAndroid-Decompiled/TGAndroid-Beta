package gh;

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
import org.telegram.messenger.ll;
import org.telegram.ui.Components.a21;
import org.telegram.ui.Components.c80;
import org.telegram.ui.Components.e80;
import org.telegram.ui.Components.gr;
import org.telegram.ui.k60;
public final class h1 extends FrameLayout {
    public final int f8191a;
    public Object f8192b;
    public Object f8193c;
    public Object d;

    public h1(Context context) {
        super(context);
        this.f8191a = 0;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        int i9;
        boolean z10;
        float f10;
        int i10;
        float f11;
        switch (this.f8191a) {
            case 3:
                RectF rectF = (RectF) this.f8192b;
                super.dispatchDraw(canvas);
                Paint paint = (Paint) this.f8193c;
                paint.setColor(-1);
                float width = getWidth() - (AndroidUtilities.dpf2(5.0f) * 2.0f);
                kh.l6 l6Var = (kh.l6) this.d;
                float dpf2 = (width - AndroidUtilities.dpf2((l6Var.f15601b - 1) * 2)) / l6Var.f15601b;
                float dpf22 = AndroidUtilities.dpf2(5.0f);
                for (int i11 = 0; i11 < l6Var.f15601b; i11++) {
                    rectF.set(dpf22, AndroidUtilities.dpf2(8.0f), dpf22 + dpf2, AndroidUtilities.dpf2(10.0f));
                    if (i11 < l6Var.f15601b - 1) {
                        i9 = 255;
                    } else {
                        i9 = 133;
                    }
                    paint.setAlpha(i9);
                    canvas.drawRoundRect(rectF, AndroidUtilities.dpf2(1.0f), AndroidUtilities.dpf2(1.0f), paint);
                    dpf22 += AndroidUtilities.dpf2(2.0f) + dpf2;
                }
                return;
            case 7:
                Paint paint2 = (Paint) this.f8193c;
                org.telegram.ui.ActionBar.f6.m(paint2);
                paint2.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.G8, ((org.telegram.ui.Components.w8) this.d).getResourceProvider()));
                paint2.setAlpha((int) (getAlpha() * 255.0f));
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                Path path = (Path) this.f8192b;
                path.rewind();
                path.addRoundRect(rectF2, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), Path.Direction.CW);
                canvas.drawPath(path, paint2);
                super.dispatchDraw(canvas);
                return;
            case 9:
                a21 a21Var = (a21) this.d;
                float g10 = a21Var.f26638f.g();
                int i12 = (g10 > 0.0f ? 1 : (g10 == 0.0f ? 0 : -1));
                if (i12 > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                float lerp = AndroidUtilities.lerp(0.5f, 1.0f, g10) * a21Var.G;
                float dp = AndroidUtilities.dp(10.0f);
                float dp2 = AndroidUtilities.dp(8.33f);
                float width2 = (getWidth() / 2.0f) + AndroidUtilities.dp(12.0f);
                float dp3 = AndroidUtilities.dp(12.0f);
                float max = Math.max(dp2 + dp2, a21Var.f26638f.d() + AndroidUtilities.dp(10.0f));
                if (z10) {
                    i10 = i12;
                    f11 = dp3;
                    f10 = width2;
                    canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                } else {
                    f10 = width2;
                    i10 = i12;
                    f11 = dp3;
                }
                super.dispatchDraw(canvas);
                if (z10) {
                    RectF rectF3 = AndroidUtilities.rectTmp;
                    float f12 = max / 2.0f;
                    rectF3.set((f10 - f12) - AndroidUtilities.dp(1.33f), f11 - dp, f12 + f10 + AndroidUtilities.dp(1.33f), f11 + dp);
                    AndroidUtilities.scaleRect(rectF3, g10);
                    float f13 = dp * g10;
                    canvas.drawRoundRect(rectF3, f13, f13, (Paint) this.f8192b);
                    canvas.restore();
                }
                if (i10 > 0) {
                    canvas.save();
                    canvas.scale(lerp, lerp, f10, f11);
                    RectF rectF4 = AndroidUtilities.rectTmp;
                    float f14 = max / 2.0f;
                    rectF4.set(f10 - f14, f11 - dp2, f10 + f14, f11 + dp2);
                    org.telegram.ui.Components.c6 c6Var = (org.telegram.ui.Components.c6) this.f8193c;
                    c6Var.setColor(org.telegram.ui.ActionBar.f6.l1(g10, c6Var.f27372b.a(org.telegram.ui.ActionBar.f6.v0(a21Var.A, c6Var.f27371a), false)));
                    canvas.drawRoundRect(rectF4, dp2, dp2, c6Var);
                    a21Var.f26638f.m(rectF4);
                    org.telegram.ui.Components.i6 i6Var = a21Var.f26638f;
                    i6Var.f29351w = (int) (g10 * 255.0f);
                    i6Var.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            case 10:
                Paint paint3 = (Paint) this.f8193c;
                k60 k60Var = (k60) this.d;
                paint3.setColor(k60Var.getThemedColor(org.telegram.ui.ActionBar.f6.f23001d6));
                canvas.save();
                canvas.translate(0.0f, -getTop());
                RectF rectF5 = (RectF) this.f8192b;
                rectF5.set(0.0f, 0.0f, getWidth(), getHeight());
                rectF5.offset(0.0f, getTop());
                k60.Z(k60Var, canvas, rectF5, paint3);
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
        switch (this.f8191a) {
            case 11:
                canvas.save();
                canvas.clipPath((Path) this.f8192b);
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
        switch (this.f8191a) {
            case 1:
                Paint paint = (Paint) this.f8192b;
                if (((ja) this.d).f8360e > 1) {
                    paint.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23001d6, (org.telegram.ui.ActionBar.b6) this.f8193c));
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(view.getX(), view.getY(), view.getX() + view.getWidth(), view.getY() + view.getHeight());
                    rectF.inset(-AndroidUtilities.dp(1.66f), -AndroidUtilities.dp(1.66f));
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), paint);
                }
                return super.drawChild(canvas, view, j10);
            case 4:
                ff.c0 c0Var = (ff.c0) this.f8192b;
                ff.c0 c0Var2 = (ff.c0) this.f8193c;
                boolean drawChild = super.drawChild(canvas, view, j10);
                nh.o oVar = (nh.o) this.d;
                if (view == oVar.d) {
                    int i9 = org.telegram.ui.ActionBar.f6.f22947a7;
                    c0Var.b(oVar.getThemedColor(i9));
                    c0Var.setBounds(0, 0, getWidth(), AndroidUtilities.statusBarHeight);
                    c0Var.draw(canvas);
                    float navigationBarThirdButtonsFactor = AndroidUtilities.getNavigationBarThirdButtonsFactor(AndroidUtilities.navigationBarHeight);
                    if (navigationBarThirdButtonsFactor > 0.0f) {
                        c0Var2.setAlpha((int) (navigationBarThirdButtonsFactor * 255.0f));
                        c0Var2.b(oVar.getThemedColor(i9));
                        c0Var2.setBounds(0, getHeight() - AndroidUtilities.navigationBarHeight, getWidth(), getHeight());
                        c0Var2.draw(canvas);
                    }
                }
                return drawChild;
            case 12:
                yf.r2 r2Var = ((yf.t2) this.d).f50114f;
                if (view == r2Var) {
                    canvas.save();
                    canvas.translate(((org.telegram.ui.Components.y5) this.f8192b).d(view.getX(), false), ((org.telegram.ui.Components.y5) this.f8193c).d(view.getY(), false));
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
        switch (this.f8191a) {
            case 6:
                super.onDraw(canvas);
                Paint paint = (Paint) this.f8193c;
                paint.setColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23212p7, false));
                canvas.save();
                TextPaint textPaint = (TextPaint) this.d;
                canvas.translate((getMeasuredWidth() - textPaint.measureText("500")) - AndroidUtilities.dp(8.0f), AndroidUtilities.dpf2(7.0f));
                RectF rectF = (RectF) this.f8192b;
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
    public void onMeasure(int i9, int i10) {
        switch (this.f8191a) {
            case 11:
                super.onMeasure(i9, i10);
                Path path = (Path) this.f8192b;
                path.rewind();
                RectF rectF = (RectF) this.f8193c;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                path.addRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), Path.Direction.CW);
                yf.r2 r2Var = ((yf.t2) this.d).f50114f;
                if (r2Var != null) {
                    r2Var.setMaxWidth(getMeasuredWidth() - AndroidUtilities.dp(32.0f));
                    return;
                }
                return;
            default:
                super.onMeasure(i9, i10);
                return;
        }
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.f8191a) {
            case 9:
                if (((a21) this.d).f26638f != drawable && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public h1(Context context, org.telegram.ui.ActionBar.b6 b6Var, boolean z10) {
        super(context);
        this.f8191a = 5;
        org.telegram.ui.Components.o9 o9Var = new org.telegram.ui.Components.o9(context);
        this.f8193c = o9Var;
        o9Var.setRoundRadius(AndroidUtilities.dp(23.0f));
        addView(o9Var, g7.e6.d(46, 46.0f, 19, 21.0f, 6.0f, 0.0f, 6.0f));
        if (z10) {
            addView(new j5(context, b6Var), g7.e6.b(22.66f, 22.66f, 83, 48.66f, 0.0f, 0.0f, 3.6599998f));
        }
        TextView textView = new TextView(context);
        this.f8192b = textView;
        ll.k(16.0f, 1, textView);
        textView.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23108j5, b6Var));
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        addView(textView, g7.e6.d(-1, -2.0f, 51, 80.0f, 7.0f, 0.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23386z6, b6Var));
        textView2.setSingleLine(true);
        textView2.setEllipsize(truncateAt);
        addView(textView2, g7.e6.d(-1, -2.0f, 51, 80.0f, 30.33f, 0.0f, 0.0f));
    }

    public h1(kh.l6 l6Var, Context context) {
        super(context);
        this.f8191a = 3;
        this.d = l6Var;
        this.f8192b = new RectF();
        this.f8193c = new Paint(1);
    }

    public h1(Context context, Paint paint, TextPaint textPaint) {
        super(context);
        this.f8191a = 6;
        this.f8193c = paint;
        this.d = textPaint;
        this.f8192b = new RectF();
    }

    public h1(yf.t2 t2Var, Context context, int i9) {
        super(context);
        this.f8191a = i9;
        switch (i9) {
            case 12:
                this.d = t2Var;
                super(context);
                gr grVar = gr.h;
                this.f8192b = new org.telegram.ui.Components.y5(this, 0L, 350L, grVar);
                this.f8193c = new org.telegram.ui.Components.y5(this, 0L, 350L, grVar);
                return;
            default:
                this.d = t2Var;
                this.f8192b = new Path();
                this.f8193c = new RectF();
                return;
        }
    }

    public h1(nh.o oVar, Context context) {
        super(context);
        this.f8191a = 4;
        this.d = oVar;
        this.f8192b = new ff.c0(2);
        this.f8193c = new ff.c0(8);
    }

    public h1(ih.s5 s5Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.b6 b6Var;
        org.telegram.ui.ActionBar.b6 b6Var2;
        this.f8191a = 2;
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Oh, false), PorterDuff.Mode.MULTIPLY));
        addView(imageView, g7.e6.d(28, 28.0f, 0, 25.0f, 12.0f, 16.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f8192b = textView;
        textView.setTypeface(AndroidUtilities.bold());
        int i9 = org.telegram.ui.ActionBar.f6.G6;
        b6Var = ((org.telegram.ui.ActionBar.f3) s5Var).resourcesProvider;
        textView.setTextColor(org.telegram.ui.ActionBar.f6.v0(i9, b6Var));
        textView.setTextSize(1, 14.0f);
        addView(textView, g7.e6.d(-1, -2.0f, 0, 68.0f, 8.0f, 16.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.f8193c = textView2;
        int i10 = org.telegram.ui.ActionBar.f6.f23369y6;
        b6Var2 = ((org.telegram.ui.ActionBar.f3) s5Var).resourcesProvider;
        textView2.setTextColor(org.telegram.ui.ActionBar.f6.v0(i10, b6Var2));
        textView2.setTextSize(1, 14.0f);
        addView(textView2, g7.e6.d(-1, -2.0f, 0, 68.0f, 28.0f, 16.0f, 8.0f));
    }

    public h1(org.telegram.ui.Components.w8 w8Var, Activity activity) {
        super(activity);
        this.f8191a = 7;
        this.d = w8Var;
        this.f8192b = new Path();
        this.f8193c = new Paint(1);
    }

    public h1(e80 e80Var, Context context) {
        super(context);
        this.f8191a = 8;
        this.d = e80Var;
        c80 c80Var = new c80(this, context);
        this.f8193c = c80Var;
        LinearLayout f10 = ll.f(context, 0);
        addView(f10, g7.e6.e(-2, -1, 1));
        TextView textView = new TextView(context);
        this.f8192b = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        f10.addView(c80Var, g7.e6.n(-2, -1));
        f10.addView(textView, g7.e6.q(-2, -2, 16));
        setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        c80Var.a(false);
    }

    public h1(k60 k60Var, Context context) {
        super(context);
        this.f8191a = 10;
        this.d = k60Var;
        this.f8192b = new RectF();
        this.f8193c = new Paint(1);
    }

    public h1(a21 a21Var, Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.f8191a = 9;
        this.d = a21Var;
        Paint paint = new Paint(1);
        this.f8192b = paint;
        this.f8193c = new org.telegram.ui.Components.c6(this, b6Var);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        a21Var.f26638f.setCallback(this);
    }

    public h1(ja jaVar, Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.f8191a = 1;
        this.d = jaVar;
        this.f8193c = b6Var;
        this.f8192b = new Paint(1);
    }
}
