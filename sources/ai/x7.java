package ai;

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
import org.telegram.messenger.am;
import org.telegram.ui.Components.ba0;
import org.telegram.ui.Components.g41;
import org.telegram.ui.Components.js;
import org.telegram.ui.Components.z90;
import org.telegram.ui.e70;
public final class x7 extends FrameLayout {
    public final int f1908a;
    public Object f1909b;
    public Object f1910c;
    public Object d;

    public x7(Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        super(context);
        this.f1908a = 3;
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
        this.d = y9Var;
        y9Var.setRoundRadius(AndroidUtilities.dp(23.0f));
        addView(y9Var, w7.w5.a(46.0f, 21.0f, 6.0f, 0.0f, 6.0f, 46, 19));
        if (z10) {
            addView(new gi.a(context, c6Var), w7.w5.c(22.66f, 22.66f, 83, 48.66f, 0.0f, 0.0f, 3.6599998f));
        }
        TextView textView = new TextView(context);
        this.f1909b = textView;
        am.k(16.0f, 1, textView);
        textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20667j5, c6Var));
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        addView(textView, w7.w5.a(-2.0f, 80.0f, 7.0f, 0.0f, 0.0f, -1, 51));
        TextView textView2 = new TextView(context);
        this.f1910c = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20963z6, c6Var));
        textView2.setSingleLine(true);
        textView2.setEllipsize(truncateAt);
        addView(textView2, w7.w5.a(-2.0f, 80.0f, 30.33f, 0.0f, 0.0f, -1, 51));
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        int i10;
        boolean z10;
        float f7;
        int i11;
        float f10;
        switch (this.f1908a) {
            case 1:
                RectF rectF = (RectF) this.f1909b;
                super.dispatchDraw(canvas);
                Paint paint = (Paint) this.f1910c;
                paint.setColor(-1);
                float width = getWidth() - (AndroidUtilities.dpf2(5.0f) * 2.0f);
                ci.v6 v6Var = (ci.v6) this.d;
                float dpf2 = (width - AndroidUtilities.dpf2((v6Var.f6152b - 1) * 2)) / v6Var.f6152b;
                float dpf22 = AndroidUtilities.dpf2(5.0f);
                for (int i12 = 0; i12 < v6Var.f6152b; i12++) {
                    rectF.set(dpf22, AndroidUtilities.dpf2(8.0f), dpf22 + dpf2, AndroidUtilities.dpf2(10.0f));
                    if (i12 < v6Var.f6152b - 1) {
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
                Paint paint2 = (Paint) this.f1910c;
                org.telegram.ui.ActionBar.h6.m(paint2);
                paint2.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G8, ((org.telegram.ui.Components.g9) this.d).getResourceProvider()));
                paint2.setAlpha((int) (getAlpha() * 255.0f));
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                Path path = (Path) this.f1909b;
                path.rewind();
                path.addRoundRect(rectF2, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), Path.Direction.CW);
                canvas.drawPath(path, paint2);
                super.dispatchDraw(canvas);
                return;
            case 7:
                g41 g41Var = (g41) this.d;
                float i13 = g41Var.f26273f.i();
                int i14 = (i13 > 0.0f ? 1 : (i13 == 0.0f ? 0 : -1));
                if (i14 > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                float lerp = AndroidUtilities.lerp(0.5f, 1.0f, i13) * g41Var.K;
                float dp = AndroidUtilities.dp(10.0f);
                float dp2 = AndroidUtilities.dp(8.33f);
                float width2 = (getWidth() / 2.0f) + AndroidUtilities.dp(12.0f);
                float dp3 = AndroidUtilities.dp(12.0f);
                float max = Math.max(dp2 + dp2, g41Var.f26273f.c() + AndroidUtilities.dp(10.0f));
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
                    canvas.drawRoundRect(rectF3, f12, f12, (Paint) this.f1909b);
                    canvas.restore();
                }
                if (i11 > 0) {
                    canvas.save();
                    canvas.scale(lerp, lerp, f7, f10);
                    RectF rectF4 = AndroidUtilities.rectTmp;
                    float f13 = max / 2.0f;
                    rectF4.set(f7 - f13, f10 - dp2, f7 + f13, f10 + dp2);
                    org.telegram.ui.Components.k6 k6Var = (org.telegram.ui.Components.k6) this.f1910c;
                    k6Var.setColor(org.telegram.ui.ActionBar.h6.m1(i13, k6Var.f27763b.a(org.telegram.ui.ActionBar.h6.w0(g41Var.E, k6Var.f27762a), false)));
                    canvas.drawRoundRect(rectF4, dp2, dp2, k6Var);
                    g41Var.f26273f.p(rectF4);
                    org.telegram.ui.Components.q6 q6Var = g41Var.f26273f;
                    q6Var.B = (int) (i13 * 255.0f);
                    q6Var.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            case 8:
                Paint paint3 = (Paint) this.f1910c;
                e70 e70Var = (e70) this.d;
                paint3.setColor(e70Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20559d6));
                canvas.save();
                canvas.translate(0.0f, -getTop());
                RectF rectF5 = (RectF) this.f1909b;
                rectF5.set(0.0f, 0.0f, getWidth(), getHeight());
                rectF5.offset(0.0f, getTop());
                e70.a0(e70Var, canvas, rectF5, paint3);
                canvas.restore();
                super.dispatchDraw(canvas);
                return;
            case 9:
                int save = canvas.save();
                canvas.concat((Matrix) this.f1909b);
                Path path2 = (Path) this.f1910c;
                w7.f6.a(path2, getWidth(), getHeight());
                canvas.clipPath(path2);
                super.dispatchDraw(canvas);
                canvas.restoreToCount(save);
                return;
        }
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f1908a) {
            case 10:
                canvas.save();
                canvas.clipPath((Path) this.f1909b);
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
        switch (this.f1908a) {
            case 2:
                yf.y yVar = (yf.y) this.f1909b;
                yf.y yVar2 = (yf.y) this.f1910c;
                boolean drawChild = super.drawChild(canvas, view, j3);
                fi.p pVar = (fi.p) this.d;
                if (view == pVar.d) {
                    int i10 = org.telegram.ui.ActionBar.h6.f20503a7;
                    yVar.b(pVar.getThemedColor(i10));
                    yVar.setBounds(0, 0, getWidth(), AndroidUtilities.statusBarHeight);
                    yVar.draw(canvas);
                    float navigationBarThirdButtonsFactor = AndroidUtilities.getNavigationBarThirdButtonsFactor(AndroidUtilities.navigationBarHeight);
                    if (navigationBarThirdButtonsFactor > 0.0f) {
                        yVar2.setAlpha((int) (navigationBarThirdButtonsFactor * 255.0f));
                        yVar2.b(pVar.getThemedColor(i10));
                        yVar2.setBounds(0, getHeight() - AndroidUtilities.navigationBarHeight, getWidth(), getHeight());
                        yVar2.draw(canvas);
                    }
                }
                return drawChild;
            case 11:
                qg.s2 s2Var = ((qg.u2) this.d).f46513f;
                if (view == s2Var) {
                    canvas.save();
                    canvas.translate(((org.telegram.ui.Components.g6) this.f1909b).d(view.getX(), false), ((org.telegram.ui.Components.g6) this.f1910c).d(view.getY(), false));
                    s2Var.a(canvas);
                    canvas.restore();
                    return true;
                }
                return super.drawChild(canvas, view, j3);
            case 13:
                Paint paint = (Paint) this.f1909b;
                if (((yh.j7) this.d).f52974e > 1) {
                    paint.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20559d6, (org.telegram.ui.ActionBar.c6) this.f1910c));
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
        switch (this.f1908a) {
            case 4:
                super.onDraw(canvas);
                Paint paint = (Paint) this.f1910c;
                paint.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20780p7, false));
                canvas.save();
                TextPaint textPaint = (TextPaint) this.d;
                canvas.translate((getMeasuredWidth() - textPaint.measureText("500")) - AndroidUtilities.dp(8.0f), AndroidUtilities.dpf2(7.0f));
                RectF rectF = (RectF) this.f1909b;
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
        switch (this.f1908a) {
            case 10:
                super.onMeasure(i10, i11);
                Path path = (Path) this.f1909b;
                path.rewind();
                RectF rectF = (RectF) this.f1910c;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                path.addRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), Path.Direction.CW);
                qg.s2 s2Var = ((qg.u2) this.d).f46513f;
                if (s2Var != null) {
                    s2Var.setMaxWidth(getMeasuredWidth() - AndroidUtilities.dp(32.0f));
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
        switch (this.f1908a) {
            case 7:
                if (((g41) this.d).f26273f != drawable && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public x7(ci.v6 v6Var, Context context) {
        super(context);
        this.f1908a = 1;
        this.d = v6Var;
        this.f1909b = new RectF();
        this.f1910c = new Paint(1);
    }

    public x7(Context context, Paint paint, TextPaint textPaint) {
        super(context);
        this.f1908a = 4;
        this.f1910c = paint;
        this.d = textPaint;
        this.f1909b = new RectF();
    }

    public x7(qg.u2 u2Var, Context context, int i10) {
        super(context);
        this.f1908a = i10;
        switch (i10) {
            case 11:
                this.d = u2Var;
                super(context);
                js jsVar = js.h;
                this.f1909b = new org.telegram.ui.Components.g6(this, 0L, 350L, jsVar);
                this.f1910c = new org.telegram.ui.Components.g6(this, 0L, 350L, jsVar);
                return;
            default:
                this.d = u2Var;
                this.f1909b = new Path();
                this.f1910c = new RectF();
                return;
        }
    }

    public x7(fi.p pVar, Context context) {
        super(context);
        this.f1908a = 2;
        this.d = pVar;
        this.f1909b = new yf.y(2);
        this.f1910c = new yf.y(8);
    }

    public x7(y7 y7Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.c6 c6Var;
        org.telegram.ui.ActionBar.c6 c6Var2;
        this.f1908a = 0;
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Oh, false), PorterDuff.Mode.MULTIPLY));
        addView(imageView, w7.w5.a(28.0f, 25.0f, 12.0f, 16.0f, 0.0f, 28, 0));
        TextView textView = new TextView(context);
        this.f1909b = textView;
        textView.setTypeface(AndroidUtilities.bold());
        int i10 = org.telegram.ui.ActionBar.h6.G6;
        c6Var = ((org.telegram.ui.ActionBar.e3) y7Var).resourcesProvider;
        textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(i10, c6Var));
        textView.setTextSize(1, 14.0f);
        addView(textView, w7.w5.a(-2.0f, 68.0f, 8.0f, 16.0f, 0.0f, -1, 0));
        TextView textView2 = new TextView(context);
        this.f1910c = textView2;
        int i11 = org.telegram.ui.ActionBar.h6.f20945y6;
        c6Var2 = ((org.telegram.ui.ActionBar.e3) y7Var).resourcesProvider;
        textView2.setTextColor(org.telegram.ui.ActionBar.h6.w0(i11, c6Var2));
        textView2.setTextSize(1, 14.0f);
        addView(textView2, w7.w5.a(-2.0f, 68.0f, 28.0f, 16.0f, 8.0f, -1, 0));
    }

    public x7(org.telegram.ui.Components.g9 g9Var, Activity activity) {
        super(activity);
        this.f1908a = 5;
        this.d = g9Var;
        this.f1909b = new Path();
        this.f1910c = new Paint(1);
    }

    public x7(Context context, int i10) {
        super(context);
        this.f1908a = i10;
        switch (i10) {
            case 12:
                super(context);
                return;
            default:
                this.f1909b = new Matrix();
                this.f1910c = new Path();
                this.d = new float[8];
                setClipChildren(false);
                setClipToPadding(false);
                return;
        }
    }

    public x7(ba0 ba0Var, Context context) {
        super(context);
        this.f1908a = 6;
        this.d = ba0Var;
        z90 z90Var = new z90(this, context);
        this.f1910c = z90Var;
        LinearLayout e7 = am.e(context, 0);
        addView(e7, w7.w5.e(-2, -1, 1));
        TextView textView = new TextView(context);
        this.f1909b = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        e7.addView(z90Var, w7.w5.n(-2, -1));
        e7.addView(textView, w7.w5.q(-2, -2, 16));
        setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        z90Var.a(false);
    }

    public x7(e70 e70Var, Context context) {
        super(context);
        this.f1908a = 8;
        this.d = e70Var;
        this.f1909b = new RectF();
        this.f1910c = new Paint(1);
    }

    public x7(g41 g41Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f1908a = 7;
        this.d = g41Var;
        Paint paint = new Paint(1);
        this.f1909b = paint;
        this.f1910c = new org.telegram.ui.Components.k6(this, c6Var);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        g41Var.f26273f.setCallback(this);
    }

    public x7(yh.j7 j7Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f1908a = 13;
        this.d = j7Var;
        this.f1910c = c6Var;
        this.f1909b = new Paint(1);
    }
}
