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
import org.telegram.messenger.ul;
import org.telegram.ui.Components.rr;
import org.telegram.ui.Components.u80;
import org.telegram.ui.Components.v21;
import org.telegram.ui.Components.w80;
import org.telegram.ui.b70;
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
                v21 v21Var = (v21) this.d;
                float g10 = v21Var.f28635f.g();
                int i13 = (g10 > 0.0f ? 1 : (g10 == 0.0f ? 0 : -1));
                if (i13 > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                float lerp = AndroidUtilities.lerp(0.5f, 1.0f, g10) * v21Var.K;
                float dp = AndroidUtilities.dp(10.0f);
                float dp2 = AndroidUtilities.dp(8.33f);
                float width2 = (getWidth() / 2.0f) + AndroidUtilities.dp(12.0f);
                float dp3 = AndroidUtilities.dp(12.0f);
                float max = Math.max(dp2 + dp2, v21Var.f28635f.d() + AndroidUtilities.dp(10.0f));
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
                    i6Var.setColor(org.telegram.ui.ActionBar.h6.l1(g10, i6Var.f24883b.a(org.telegram.ui.ActionBar.h6.v0(v21Var.E, i6Var.f24882a), false)));
                    canvas.drawRoundRect(rectF4, dp2, dp2, i6Var);
                    v21Var.f28635f.m(rectF4);
                    org.telegram.ui.Components.o6 o6Var = v21Var.f28635f;
                    o6Var.f26631w = (int) (g10 * 255.0f);
                    o6Var.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            case 8:
                Paint paint3 = (Paint) this.f1658c;
                b70 b70Var = (b70) this.d;
                paint3.setColor(b70Var.getThemedColor(org.telegram.ui.ActionBar.h6.f18789d6));
                canvas.save();
                canvas.translate(0.0f, -getTop());
                RectF rectF5 = (RectF) this.f1657b;
                rectF5.set(0.0f, 0.0f, getWidth(), getHeight());
                rectF5.offset(0.0f, getTop());
                b70.a0(b70Var, canvas, rectF5, paint3);
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
                    int i10 = org.telegram.ui.ActionBar.h6.f18733a7;
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
                qg.t2 t2Var = ((qg.v2) this.d).f41639f;
                if (view == t2Var) {
                    canvas.save();
                    canvas.translate(((org.telegram.ui.Components.e6) this.f1657b).d(view.getX(), false), ((org.telegram.ui.Components.e6) this.f1658c).d(view.getY(), false));
                    t2Var.a(canvas);
                    canvas.restore();
                    return true;
                }
                return super.drawChild(canvas, view, j3);
            case 12:
                Paint paint = (Paint) this.f1657b;
                if (((yh.q7) this.d).e > 1) {
                    paint.setColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f18789d6, (org.telegram.ui.ActionBar.d6) this.f1658c));
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
                paint.setColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19008p7, false));
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
                qg.t2 t2Var = ((qg.v2) this.d).f41639f;
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
        switch (this.f1656a) {
            case 7:
                if (((v21) this.d).f28635f != drawable && !super.verifyDrawable(drawable)) {
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
        addView(w9Var, w7.x5.d(46, 46.0f, 19, 21.0f, 6.0f, 0.0f, 6.0f));
        if (z10) {
            addView(new gi.a(context, d6Var), w7.x5.b(22.66f, 22.66f, 83, 48.66f, 0.0f, 0.0f, 3.6599998f));
        }
        TextView textView = new TextView(context);
        this.f1657b = textView;
        ul.k(16.0f, 1, textView);
        textView.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f18895j5, d6Var));
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        addView(textView, w7.x5.d(-1, -2.0f, 51, 80.0f, 7.0f, 0.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.f1658c = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19189z6, d6Var));
        textView2.setSingleLine(true);
        textView2.setEllipsize(truncateAt);
        addView(textView2, w7.x5.d(-1, -2.0f, 51, 80.0f, 30.33f, 0.0f, 0.0f));
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

    public w7(qg.v2 v2Var, Context context, int i10) {
        super(context);
        this.f1656a = i10;
        switch (i10) {
            case 10:
                this.d = v2Var;
                super(context);
                rr rrVar = rr.h;
                this.f1657b = new org.telegram.ui.Components.e6(this, 0L, 350L, rrVar);
                this.f1658c = new org.telegram.ui.Components.e6(this, 0L, 350L, rrVar);
                return;
            default:
                this.d = v2Var;
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
        addView(imageView, w7.x5.d(28, 28.0f, 0, 25.0f, 12.0f, 16.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f1657b = textView;
        textView.setTypeface(AndroidUtilities.bold());
        int i10 = org.telegram.ui.ActionBar.h6.G6;
        d6Var = ((org.telegram.ui.ActionBar.f3) x7Var).resourcesProvider;
        textView.setTextColor(org.telegram.ui.ActionBar.h6.v0(i10, d6Var));
        textView.setTextSize(1, 14.0f);
        addView(textView, w7.x5.d(-1, -2.0f, 0, 68.0f, 8.0f, 16.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.f1658c = textView2;
        int i11 = org.telegram.ui.ActionBar.h6.f19170y6;
        d6Var2 = ((org.telegram.ui.ActionBar.f3) x7Var).resourcesProvider;
        textView2.setTextColor(org.telegram.ui.ActionBar.h6.v0(i11, d6Var2));
        textView2.setTextSize(1, 14.0f);
        addView(textView2, w7.x5.d(-1, -2.0f, 0, 68.0f, 28.0f, 16.0f, 8.0f));
    }

    public w7(org.telegram.ui.Components.e9 e9Var, Activity activity) {
        super(activity);
        this.f1656a = 5;
        this.d = e9Var;
        this.f1657b = new Path();
        this.f1658c = new Paint(1);
    }

    public w7(w80 w80Var, Context context) {
        super(context);
        this.f1656a = 6;
        this.d = w80Var;
        u80 u80Var = new u80(this, context);
        this.f1658c = u80Var;
        LinearLayout f7 = ul.f(context, 0);
        addView(f7, w7.x5.e(-2, -1, 1));
        TextView textView = new TextView(context);
        this.f1657b = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        f7.addView(u80Var, w7.x5.n(-2, -1));
        f7.addView(textView, w7.x5.q(-2, -2, 16));
        setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        u80Var.a(false);
    }

    public w7(b70 b70Var, Context context) {
        super(context);
        this.f1656a = 8;
        this.d = b70Var;
        this.f1657b = new RectF();
        this.f1658c = new Paint(1);
    }

    public w7(v21 v21Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f1656a = 7;
        this.d = v21Var;
        Paint paint = new Paint(1);
        this.f1657b = paint;
        this.f1658c = new org.telegram.ui.Components.i6(this, d6Var);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        v21Var.f28635f.setCallback(this);
    }

    public w7(yh.q7 q7Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f1656a = 12;
        this.d = q7Var;
        this.f1658c = d6Var;
        this.f1657b = new Paint(1);
    }
}
