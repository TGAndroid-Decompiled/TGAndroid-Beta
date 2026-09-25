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
import org.telegram.messenger.ok;
import org.telegram.ui.Components.e90;
import org.telegram.ui.Components.g90;
import org.telegram.ui.Components.j31;
import org.telegram.ui.Components.rr;
import org.telegram.ui.z60;
public final class w7 extends FrameLayout {
    public final int f1656a;
    public Object f1657b;
    public Object f1658c;
    public Object d;

    public w7(Context context) {
        super(context);
        this.f1656a = 11;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        int i10;
        boolean z10;
        float f7;
        int i11;
        float f10;
        switch (this.f1656a) {
            case 1:
                RectF rectF = (RectF) this.f1657b;
                super.dispatchDraw(canvas);
                Paint paint = (Paint) this.f1658c;
                paint.setColor(-1);
                float width = getWidth() - (AndroidUtilities.dpf2(5.0f) * 2.0f);
                ci.v6 v6Var = (ci.v6) this.d;
                float dpf2 = (width - AndroidUtilities.dpf2((v6Var.f5673b - 1) * 2)) / v6Var.f5673b;
                float dpf22 = AndroidUtilities.dpf2(5.0f);
                for (int i12 = 0; i12 < v6Var.f5673b; i12++) {
                    rectF.set(dpf22, AndroidUtilities.dpf2(8.0f), dpf22 + dpf2, AndroidUtilities.dpf2(10.0f));
                    if (i12 < v6Var.f5673b - 1) {
                        i10 = 255;
                    } else {
                        i10 = 133;
                    }
                    paint.setAlpha(i10);
                    canvas.drawRoundRect(rectF, AndroidUtilities.dpf2(1.0f), AndroidUtilities.dpf2(1.0f), paint);
                    dpf22 += AndroidUtilities.dpf2(2.0f) + dpf2;
                }
                return;
            case 5:
                Paint paint2 = (Paint) this.f1658c;
                org.telegram.ui.ActionBar.h6.m(paint2);
                paint2.setColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.G8, ((org.telegram.ui.Components.e9) this.d).getResourceProvider()));
                paint2.setAlpha((int) (getAlpha() * 255.0f));
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                Path path = (Path) this.f1657b;
                path.rewind();
                path.addRoundRect(rectF2, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), Path.Direction.CW);
                canvas.drawPath(path, paint2);
                super.dispatchDraw(canvas);
                return;
            case 7:
                j31 j31Var = (j31) this.d;
                float g10 = j31Var.f25257f.g();
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
                float max = Math.max(dp2 + dp2, j31Var.f25257f.d() + AndroidUtilities.dp(10.0f));
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
                    canvas.drawRoundRect(rectF3, f12, f12, (Paint) this.f1657b);
                    canvas.restore();
                }
                if (i11 > 0) {
                    canvas.save();
                    canvas.scale(lerp, lerp, f7, f10);
                    RectF rectF4 = AndroidUtilities.rectTmp;
                    float f13 = max / 2.0f;
                    rectF4.set(f7 - f13, f10 - dp2, f7 + f13, f10 + dp2);
                    org.telegram.ui.Components.i6 i6Var = (org.telegram.ui.Components.i6) this.f1658c;
                    i6Var.setColor(org.telegram.ui.ActionBar.h6.l1(g10, i6Var.f24953b.a(org.telegram.ui.ActionBar.h6.v0(j31Var.E, i6Var.f24952a), false)));
                    canvas.drawRoundRect(rectF4, dp2, dp2, i6Var);
                    j31Var.f25257f.m(rectF4);
                    org.telegram.ui.Components.o6 o6Var = j31Var.f25257f;
                    o6Var.f26947w = (int) (g10 * 255.0f);
                    o6Var.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            case 8:
                Paint paint3 = (Paint) this.f1658c;
                z60 z60Var = (z60) this.d;
                paint3.setColor(z60Var.getThemedColor(org.telegram.ui.ActionBar.h6.f19060d6));
                canvas.save();
                canvas.translate(0.0f, -getTop());
                RectF rectF5 = (RectF) this.f1657b;
                rectF5.set(0.0f, 0.0f, getWidth(), getHeight());
                rectF5.offset(0.0f, getTop());
                z60.a0(z60Var, canvas, rectF5, paint3);
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
        switch (this.f1656a) {
            case 9:
                canvas.save();
                canvas.clipPath((Path) this.f1657b);
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
        switch (this.f1656a) {
            case 2:
                yf.y yVar = (yf.y) this.f1657b;
                yf.y yVar2 = (yf.y) this.f1658c;
                boolean drawChild = super.drawChild(canvas, view, j3);
                fi.p pVar = (fi.p) this.d;
                if (view == pVar.d) {
                    int i10 = org.telegram.ui.ActionBar.h6.f19004a7;
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
            case 10:
                qg.r2 r2Var = ((qg.t2) this.d).f41942f;
                if (view == r2Var) {
                    canvas.save();
                    canvas.translate(((org.telegram.ui.Components.e6) this.f1657b).d(view.getX(), false), ((org.telegram.ui.Components.e6) this.f1658c).d(view.getY(), false));
                    r2Var.a(canvas);
                    canvas.restore();
                    return true;
                }
                return super.drawChild(canvas, view, j3);
            case 12:
                Paint paint = (Paint) this.f1657b;
                if (((yh.q7) this.d).e > 1) {
                    paint.setColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19060d6, (org.telegram.ui.ActionBar.d6) this.f1658c));
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
        switch (this.f1656a) {
            case 4:
                super.onDraw(canvas);
                Paint paint = (Paint) this.f1658c;
                paint.setColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19280p7, false));
                canvas.save();
                TextPaint textPaint = (TextPaint) this.d;
                canvas.translate((getMeasuredWidth() - textPaint.measureText("500")) - AndroidUtilities.dp(8.0f), AndroidUtilities.dpf2(7.0f));
                RectF rectF = (RectF) this.f1657b;
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
        switch (this.f1656a) {
            case 9:
                super.onMeasure(i10, i11);
                Path path = (Path) this.f1657b;
                path.rewind();
                RectF rectF = (RectF) this.f1658c;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                path.addRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), Path.Direction.CW);
                qg.r2 r2Var = ((qg.t2) this.d).f41942f;
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
        switch (this.f1656a) {
            case 7:
                if (((j31) this.d).f25257f != drawable && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public w7(Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10) {
        super(context);
        this.f1656a = 3;
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        this.d = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(23.0f));
        addView(w9Var, w7.y5.d(46, 46.0f, 19, 21.0f, 6.0f, 0.0f, 6.0f));
        if (z10) {
            addView(new gi.a(context, d6Var), w7.y5.b(22.66f, 22.66f, 83, 48.66f, 0.0f, 0.0f, 3.6599998f));
        }
        TextView textView = new TextView(context);
        this.f1657b = textView;
        ok.k(16.0f, 1, textView);
        textView.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19166j5, d6Var));
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        addView(textView, w7.y5.d(-1, -2.0f, 51, 80.0f, 7.0f, 0.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.f1658c = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19462z6, d6Var));
        textView2.setSingleLine(true);
        textView2.setEllipsize(truncateAt);
        addView(textView2, w7.y5.d(-1, -2.0f, 51, 80.0f, 30.33f, 0.0f, 0.0f));
    }

    public w7(ci.v6 v6Var, Context context) {
        super(context);
        this.f1656a = 1;
        this.d = v6Var;
        this.f1657b = new RectF();
        this.f1658c = new Paint(1);
    }

    public w7(Context context, Paint paint, TextPaint textPaint) {
        super(context);
        this.f1656a = 4;
        this.f1658c = paint;
        this.d = textPaint;
        this.f1657b = new RectF();
    }

    public w7(qg.t2 t2Var, Context context, int i10) {
        super(context);
        this.f1656a = i10;
        switch (i10) {
            case 10:
                this.d = t2Var;
                super(context);
                rr rrVar = rr.h;
                this.f1657b = new org.telegram.ui.Components.e6(this, 0L, 350L, rrVar);
                this.f1658c = new org.telegram.ui.Components.e6(this, 0L, 350L, rrVar);
                return;
            default:
                this.d = t2Var;
                this.f1657b = new Path();
                this.f1658c = new RectF();
                return;
        }
    }

    public w7(fi.p pVar, Context context) {
        super(context);
        this.f1656a = 2;
        this.d = pVar;
        this.f1657b = new yf.y(2);
        this.f1658c = new yf.y(8);
    }

    public w7(x7 x7Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.d6 d6Var;
        org.telegram.ui.ActionBar.d6 d6Var2;
        this.f1656a = 0;
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Oh, false), PorterDuff.Mode.MULTIPLY));
        addView(imageView, w7.y5.d(28, 28.0f, 0, 25.0f, 12.0f, 16.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f1657b = textView;
        textView.setTypeface(AndroidUtilities.bold());
        int i10 = org.telegram.ui.ActionBar.h6.G6;
        d6Var = ((org.telegram.ui.ActionBar.e3) x7Var).resourcesProvider;
        textView.setTextColor(org.telegram.ui.ActionBar.h6.v0(i10, d6Var));
        textView.setTextSize(1, 14.0f);
        addView(textView, w7.y5.d(-1, -2.0f, 0, 68.0f, 8.0f, 16.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.f1658c = textView2;
        int i11 = org.telegram.ui.ActionBar.h6.f19443y6;
        d6Var2 = ((org.telegram.ui.ActionBar.e3) x7Var).resourcesProvider;
        textView2.setTextColor(org.telegram.ui.ActionBar.h6.v0(i11, d6Var2));
        textView2.setTextSize(1, 14.0f);
        addView(textView2, w7.y5.d(-1, -2.0f, 0, 68.0f, 28.0f, 16.0f, 8.0f));
    }

    public w7(org.telegram.ui.Components.e9 e9Var, Activity activity) {
        super(activity);
        this.f1656a = 5;
        this.d = e9Var;
        this.f1657b = new Path();
        this.f1658c = new Paint(1);
    }

    public w7(g90 g90Var, Context context) {
        super(context);
        this.f1656a = 6;
        this.d = g90Var;
        e90 e90Var = new e90(this, context);
        this.f1658c = e90Var;
        LinearLayout f7 = ok.f(context, 0);
        addView(f7, w7.y5.e(-2, -1, 1));
        TextView textView = new TextView(context);
        this.f1657b = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        f7.addView(e90Var, w7.y5.n(-2, -1));
        f7.addView(textView, w7.y5.q(-2, -2, 16));
        setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        e90Var.a(false);
    }

    public w7(z60 z60Var, Context context) {
        super(context);
        this.f1656a = 8;
        this.d = z60Var;
        this.f1657b = new RectF();
        this.f1658c = new Paint(1);
    }

    public w7(j31 j31Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f1656a = 7;
        this.d = j31Var;
        Paint paint = new Paint(1);
        this.f1657b = paint;
        this.f1658c = new org.telegram.ui.Components.i6(this, d6Var);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        j31Var.f25257f.setCallback(this);
    }

    public w7(yh.q7 q7Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f1656a = 12;
        this.d = q7Var;
        this.f1658c = d6Var;
        this.f1657b = new Paint(1);
    }
}
