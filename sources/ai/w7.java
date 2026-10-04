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
import org.telegram.ui.Components.h90;
import org.telegram.ui.Components.j90;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.u31;
import org.telegram.ui.d70;
public final class w7 extends FrameLayout {
    public final int f1804a;
    public Object f1805b;
    public Object f1806c;
    public Object d;

    public w7(Context context) {
        super(context);
        this.f1804a = 11;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        int i10;
        boolean z10;
        float f7;
        int i11;
        float f10;
        switch (this.f1804a) {
            case 1:
                RectF rectF = (RectF) this.f1805b;
                super.dispatchDraw(canvas);
                Paint paint = (Paint) this.f1806c;
                paint.setColor(-1);
                float width = getWidth() - (AndroidUtilities.dpf2(5.0f) * 2.0f);
                ci.v6 v6Var = (ci.v6) this.d;
                float dpf2 = (width - AndroidUtilities.dpf2((v6Var.f6117b - 1) * 2)) / v6Var.f6117b;
                float dpf22 = AndroidUtilities.dpf2(5.0f);
                for (int i12 = 0; i12 < v6Var.f6117b; i12++) {
                    rectF.set(dpf22, AndroidUtilities.dpf2(8.0f), dpf22 + dpf2, AndroidUtilities.dpf2(10.0f));
                    if (i12 < v6Var.f6117b - 1) {
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
                Paint paint2 = (Paint) this.f1806c;
                org.telegram.ui.ActionBar.i6.m(paint2);
                paint2.setColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.G8, ((org.telegram.ui.Components.e9) this.d).getResourceProvider()));
                paint2.setAlpha((int) (getAlpha() * 255.0f));
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                Path path = (Path) this.f1805b;
                path.rewind();
                path.addRoundRect(rectF2, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), Path.Direction.CW);
                canvas.drawPath(path, paint2);
                super.dispatchDraw(canvas);
                return;
            case 7:
                u31 u31Var = (u31) this.d;
                float g10 = u31Var.f31278f.g();
                int i13 = (g10 > 0.0f ? 1 : (g10 == 0.0f ? 0 : -1));
                if (i13 > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                float lerp = AndroidUtilities.lerp(0.5f, 1.0f, g10) * u31Var.K;
                float dp = AndroidUtilities.dp(10.0f);
                float dp2 = AndroidUtilities.dp(8.33f);
                float width2 = (getWidth() / 2.0f) + AndroidUtilities.dp(12.0f);
                float dp3 = AndroidUtilities.dp(12.0f);
                float max = Math.max(dp2 + dp2, u31Var.f31278f.d() + AndroidUtilities.dp(10.0f));
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
                    canvas.drawRoundRect(rectF3, f12, f12, (Paint) this.f1805b);
                    canvas.restore();
                }
                if (i11 > 0) {
                    canvas.save();
                    canvas.scale(lerp, lerp, f7, f10);
                    RectF rectF4 = AndroidUtilities.rectTmp;
                    float f13 = max / 2.0f;
                    rectF4.set(f7 - f13, f10 - dp2, f7 + f13, f10 + dp2);
                    org.telegram.ui.Components.i6 i6Var = (org.telegram.ui.Components.i6) this.f1806c;
                    i6Var.setColor(org.telegram.ui.ActionBar.i6.l1(g10, i6Var.f27321b.a(org.telegram.ui.ActionBar.i6.v0(u31Var.E, i6Var.f27320a), false)));
                    canvas.drawRoundRect(rectF4, dp2, dp2, i6Var);
                    u31Var.f31278f.m(rectF4);
                    org.telegram.ui.Components.o6 o6Var = u31Var.f31278f;
                    o6Var.f29258w = (int) (g10 * 255.0f);
                    o6Var.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            case 8:
                Paint paint3 = (Paint) this.f1806c;
                d70 d70Var = (d70) this.d;
                paint3.setColor(d70Var.getThemedColor(org.telegram.ui.ActionBar.i6.f20818d6));
                canvas.save();
                canvas.translate(0.0f, -getTop());
                RectF rectF5 = (RectF) this.f1805b;
                rectF5.set(0.0f, 0.0f, getWidth(), getHeight());
                rectF5.offset(0.0f, getTop());
                d70.Z(d70Var, canvas, rectF5, paint3);
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
        switch (this.f1804a) {
            case 9:
                canvas.save();
                canvas.clipPath((Path) this.f1805b);
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
        switch (this.f1804a) {
            case 2:
                yf.y yVar = (yf.y) this.f1805b;
                yf.y yVar2 = (yf.y) this.f1806c;
                boolean drawChild = super.drawChild(canvas, view, j3);
                fi.p pVar = (fi.p) this.d;
                if (view == pVar.d) {
                    int i10 = org.telegram.ui.ActionBar.i6.f20762a7;
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
                qg.r2 r2Var = ((qg.t2) this.d).f45348f;
                if (view == r2Var) {
                    canvas.save();
                    canvas.translate(((org.telegram.ui.Components.e6) this.f1805b).d(view.getX(), false), ((org.telegram.ui.Components.e6) this.f1806c).d(view.getY(), false));
                    r2Var.a(canvas);
                    canvas.restore();
                    return true;
                }
                return super.drawChild(canvas, view, j3);
            case 12:
                Paint paint = (Paint) this.f1805b;
                if (((yh.r7) this.d).f51911e > 1) {
                    paint.setColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20818d6, (org.telegram.ui.ActionBar.d6) this.f1806c));
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
        switch (this.f1804a) {
            case 4:
                super.onDraw(canvas);
                Paint paint = (Paint) this.f1806c;
                paint.setColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f21040p7, false));
                canvas.save();
                TextPaint textPaint = (TextPaint) this.d;
                canvas.translate((getMeasuredWidth() - textPaint.measureText("500")) - AndroidUtilities.dp(8.0f), AndroidUtilities.dpf2(7.0f));
                RectF rectF = (RectF) this.f1805b;
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
        switch (this.f1804a) {
            case 9:
                super.onMeasure(i10, i11);
                Path path = (Path) this.f1805b;
                path.rewind();
                RectF rectF = (RectF) this.f1806c;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                path.addRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), Path.Direction.CW);
                qg.r2 r2Var = ((qg.t2) this.d).f45348f;
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
        switch (this.f1804a) {
            case 7:
                if (((u31) this.d).f31278f != drawable && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public w7(Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10) {
        super(context);
        this.f1804a = 3;
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        this.d = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(23.0f));
        addView(w9Var, w7.z5.d(46, 46.0f, 19, 21.0f, 6.0f, 0.0f, 6.0f));
        if (z10) {
            addView(new gi.a(context, d6Var), w7.z5.b(22.66f, 22.66f, 83, 48.66f, 0.0f, 0.0f, 3.6599998f));
        }
        TextView textView = new TextView(context);
        this.f1805b = textView;
        ok.k(16.0f, 1, textView);
        textView.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20926j5, d6Var));
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        addView(textView, w7.z5.d(-1, -2.0f, 51, 80.0f, 7.0f, 0.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.f1806c = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f21224z6, d6Var));
        textView2.setSingleLine(true);
        textView2.setEllipsize(truncateAt);
        addView(textView2, w7.z5.d(-1, -2.0f, 51, 80.0f, 30.33f, 0.0f, 0.0f));
    }

    public w7(ci.v6 v6Var, Context context) {
        super(context);
        this.f1804a = 1;
        this.d = v6Var;
        this.f1805b = new RectF();
        this.f1806c = new Paint(1);
    }

    public w7(Context context, Paint paint, TextPaint textPaint) {
        super(context);
        this.f1804a = 4;
        this.f1806c = paint;
        this.d = textPaint;
        this.f1805b = new RectF();
    }

    public w7(qg.t2 t2Var, Context context, int i10) {
        super(context);
        this.f1804a = i10;
        switch (i10) {
            case 10:
                this.d = t2Var;
                super(context);
                tr trVar = tr.h;
                this.f1805b = new org.telegram.ui.Components.e6(this, 0L, 350L, trVar);
                this.f1806c = new org.telegram.ui.Components.e6(this, 0L, 350L, trVar);
                return;
            default:
                this.d = t2Var;
                this.f1805b = new Path();
                this.f1806c = new RectF();
                return;
        }
    }

    public w7(fi.p pVar, Context context) {
        super(context);
        this.f1804a = 2;
        this.d = pVar;
        this.f1805b = new yf.y(2);
        this.f1806c = new yf.y(8);
    }

    public w7(x7 x7Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.d6 d6Var;
        org.telegram.ui.ActionBar.d6 d6Var2;
        this.f1804a = 0;
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Oh, false), PorterDuff.Mode.MULTIPLY));
        addView(imageView, w7.z5.d(28, 28.0f, 0, 25.0f, 12.0f, 16.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f1805b = textView;
        textView.setTypeface(AndroidUtilities.bold());
        int i10 = org.telegram.ui.ActionBar.i6.G6;
        d6Var = ((org.telegram.ui.ActionBar.f3) x7Var).resourcesProvider;
        textView.setTextColor(org.telegram.ui.ActionBar.i6.v0(i10, d6Var));
        textView.setTextSize(1, 14.0f);
        addView(textView, w7.z5.d(-1, -2.0f, 0, 68.0f, 8.0f, 16.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.f1806c = textView2;
        int i11 = org.telegram.ui.ActionBar.i6.f21205y6;
        d6Var2 = ((org.telegram.ui.ActionBar.f3) x7Var).resourcesProvider;
        textView2.setTextColor(org.telegram.ui.ActionBar.i6.v0(i11, d6Var2));
        textView2.setTextSize(1, 14.0f);
        addView(textView2, w7.z5.d(-1, -2.0f, 0, 68.0f, 28.0f, 16.0f, 8.0f));
    }

    public w7(org.telegram.ui.Components.e9 e9Var, Activity activity) {
        super(activity);
        this.f1804a = 5;
        this.d = e9Var;
        this.f1805b = new Path();
        this.f1806c = new Paint(1);
    }

    public w7(j90 j90Var, Context context) {
        super(context);
        this.f1804a = 6;
        this.d = j90Var;
        h90 h90Var = new h90(this, context);
        this.f1806c = h90Var;
        LinearLayout f7 = ok.f(context, 0);
        addView(f7, w7.z5.e(-2, -1, 1));
        TextView textView = new TextView(context);
        this.f1805b = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        f7.addView(h90Var, w7.z5.n(-2, -1));
        f7.addView(textView, w7.z5.q(-2, -2, 16));
        setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        h90Var.a(false);
    }

    public w7(d70 d70Var, Context context) {
        super(context);
        this.f1804a = 8;
        this.d = d70Var;
        this.f1805b = new RectF();
        this.f1806c = new Paint(1);
    }

    public w7(u31 u31Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f1804a = 7;
        this.d = u31Var;
        Paint paint = new Paint(1);
        this.f1805b = paint;
        this.f1806c = new org.telegram.ui.Components.i6(this, d6Var);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        u31Var.f31278f.setCallback(this);
    }

    public w7(yh.r7 r7Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f1804a = 12;
        this.d = r7Var;
        this.f1806c = d6Var;
        this.f1805b = new Paint(1);
    }
}
