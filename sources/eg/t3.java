package eg;

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
import k7.c6;
import mh.ea;
import mh.f5;
import oh.r5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.j6;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.v21;
import org.telegram.ui.Components.w8;
import org.telegram.ui.Components.w80;
import org.telegram.ui.Components.y80;
import org.telegram.ui.Components.z5;
import org.telegram.ui.z60;
import qh.e5;
public final class t3 extends FrameLayout {
    public final int f5495a;
    public Object f5496b;
    public Object f5497c;
    public Object d;

    public t3(Context context) {
        super(context);
        this.f5495a = 2;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        boolean z4;
        float f10;
        int i10;
        float f11;
        int i11;
        switch (this.f5495a) {
            case 6:
                Paint paint = (Paint) this.d;
                k6.m(paint);
                paint.setColor(k6.v0(k6.G8, ((w8) this.f5496b).getResourceProvider()));
                paint.setAlpha((int) (getAlpha() * 255.0f));
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                Path path = (Path) this.f5497c;
                path.rewind();
                path.addRoundRect(rectF, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), Path.Direction.CW);
                canvas.drawPath(path, paint);
                super.dispatchDraw(canvas);
                return;
            case 7:
            default:
                super.dispatchDraw(canvas);
                return;
            case 8:
                v21 v21Var = (v21) this.f5496b;
                float g10 = v21Var.f31757f.g();
                int i12 = (g10 > 0.0f ? 1 : (g10 == 0.0f ? 0 : -1));
                if (i12 > 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                float lerp = AndroidUtilities.lerp(0.5f, 1.0f, g10) * v21Var.H;
                float dp = AndroidUtilities.dp(10.0f);
                float dp2 = AndroidUtilities.dp(8.33f);
                float width = (getWidth() / 2.0f) + AndroidUtilities.dp(12.0f);
                float dp3 = AndroidUtilities.dp(12.0f);
                float max = Math.max(dp2 + dp2, v21Var.f31757f.d() + AndroidUtilities.dp(10.0f));
                if (z4) {
                    i10 = i12;
                    f11 = dp3;
                    f10 = width;
                    canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                } else {
                    f10 = width;
                    i10 = i12;
                    f11 = dp3;
                }
                super.dispatchDraw(canvas);
                if (z4) {
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    float f12 = max / 2.0f;
                    rectF2.set((f10 - f12) - AndroidUtilities.dp(1.33f), f11 - dp, f12 + f10 + AndroidUtilities.dp(1.33f), f11 + dp);
                    AndroidUtilities.scaleRect(rectF2, g10);
                    float f13 = dp * g10;
                    canvas.drawRoundRect(rectF2, f13, f13, (Paint) this.f5497c);
                    canvas.restore();
                }
                if (i10 > 0) {
                    canvas.save();
                    canvas.scale(lerp, lerp, f10, f11);
                    RectF rectF3 = AndroidUtilities.rectTmp;
                    float f14 = max / 2.0f;
                    rectF3.set(f10 - f14, f11 - dp2, f10 + f14, f11 + dp2);
                    d6 d6Var = (d6) this.d;
                    d6Var.setColor(k6.l1(g10, d6Var.f26198b.a(k6.v0(v21Var.B, d6Var.f26197a), false)));
                    canvas.drawRoundRect(rectF3, dp2, dp2, d6Var);
                    v21Var.f31757f.m(rectF3);
                    j6 j6Var = v21Var.f31757f;
                    j6Var.f28017w = (int) (g10 * 255.0f);
                    j6Var.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            case 9:
                Paint paint2 = (Paint) this.f5497c;
                z60 z60Var = (z60) this.f5496b;
                paint2.setColor(z60Var.getThemedColor(k6.f21661d6));
                canvas.save();
                canvas.translate(0.0f, -getTop());
                RectF rectF4 = (RectF) this.d;
                rectF4.set(0.0f, 0.0f, getWidth(), getHeight());
                rectF4.offset(0.0f, getTop());
                z60.a0(z60Var, canvas, rectF4, paint2);
                canvas.restore();
                super.dispatchDraw(canvas);
                return;
            case 10:
                RectF rectF5 = (RectF) this.d;
                super.dispatchDraw(canvas);
                Paint paint3 = (Paint) this.f5497c;
                paint3.setColor(-1);
                float width2 = getWidth() - (AndroidUtilities.dpf2(5.0f) * 2.0f);
                e5 e5Var = (e5) this.f5496b;
                float dpf2 = (width2 - AndroidUtilities.dpf2((e5Var.f45299b - 1) * 2)) / e5Var.f45299b;
                float dpf22 = AndroidUtilities.dpf2(5.0f);
                for (int i13 = 0; i13 < e5Var.f45299b; i13++) {
                    rectF5.set(dpf22, AndroidUtilities.dpf2(8.0f), dpf22 + dpf2, AndroidUtilities.dpf2(10.0f));
                    if (i13 < e5Var.f45299b - 1) {
                        i11 = 255;
                    } else {
                        i11 = 133;
                    }
                    paint3.setAlpha(i11);
                    canvas.drawRoundRect(rectF5, AndroidUtilities.dpf2(1.0f), AndroidUtilities.dpf2(1.0f), paint3);
                    dpf22 += AndroidUtilities.dpf2(2.0f) + dpf2;
                }
                return;
        }
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f5495a) {
            case 0:
                canvas.save();
                canvas.clipPath((Path) this.f5497c);
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
        switch (this.f5495a) {
            case 1:
                u3 u3Var = ((w3) this.f5496b).f5533f;
                if (view == u3Var) {
                    canvas.save();
                    canvas.translate(((z5) this.f5497c).d(view.getX(), false), ((z5) this.d).d(view.getY(), false));
                    u3Var.a(canvas);
                    canvas.restore();
                    return true;
                }
                return super.drawChild(canvas, view, j10);
            case 3:
                Paint paint = (Paint) this.f5497c;
                if (((ea) this.f5496b).f13982e > 1) {
                    paint.setColor(k6.v0(k6.f21661d6, (g6) this.d));
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(view.getX(), view.getY(), view.getX() + view.getWidth(), view.getY() + view.getHeight());
                    rectF.inset(-AndroidUtilities.dp(1.66f), -AndroidUtilities.dp(1.66f));
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), paint);
                }
                return super.drawChild(canvas, view, j10);
            case 11:
                lf.b0 b0Var = (lf.b0) this.f5497c;
                lf.b0 b0Var2 = (lf.b0) this.d;
                boolean drawChild = super.drawChild(canvas, view, j10);
                th.n nVar = (th.n) this.f5496b;
                if (view == nVar.d) {
                    int i10 = k6.f21607a7;
                    b0Var.b(nVar.getThemedColor(i10));
                    b0Var.setBounds(0, 0, getWidth(), AndroidUtilities.statusBarHeight);
                    b0Var.draw(canvas);
                    float navigationBarThirdButtonsFactor = AndroidUtilities.getNavigationBarThirdButtonsFactor(AndroidUtilities.navigationBarHeight);
                    if (navigationBarThirdButtonsFactor > 0.0f) {
                        b0Var2.setAlpha((int) (navigationBarThirdButtonsFactor * 255.0f));
                        b0Var2.b(nVar.getThemedColor(i10));
                        b0Var2.setBounds(0, getHeight() - AndroidUtilities.navigationBarHeight, getWidth(), getHeight());
                        b0Var2.draw(canvas);
                    }
                }
                return drawChild;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f5495a) {
            case 5:
                super.onDraw(canvas);
                Paint paint = (Paint) this.f5497c;
                paint.setColor(k6.w0(null, k6.f21878p7, false));
                canvas.save();
                TextPaint textPaint = (TextPaint) this.f5496b;
                canvas.translate((getMeasuredWidth() - textPaint.measureText("500")) - AndroidUtilities.dp(8.0f), AndroidUtilities.dpf2(7.0f));
                RectF rectF = (RectF) this.d;
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
        switch (this.f5495a) {
            case 0:
                super.onMeasure(i10, i11);
                Path path = (Path) this.f5497c;
                path.rewind();
                RectF rectF = (RectF) this.d;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                path.addRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), Path.Direction.CW);
                u3 u3Var = ((w3) this.f5496b).f5533f;
                if (u3Var != null) {
                    u3Var.setMaxWidth(getMeasuredWidth() - AndroidUtilities.dp(32.0f));
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
        switch (this.f5495a) {
            case 8:
                if (((v21) this.f5496b).f31757f != drawable && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public t3(Context context, g6 g6Var, boolean z4) {
        super(context);
        this.f5495a = 12;
        p9 p9Var = new p9(context);
        this.f5497c = p9Var;
        p9Var.setRoundRadius(AndroidUtilities.dp(23.0f));
        addView(p9Var, c6.d(46, 46.0f, 19, 21.0f, 6.0f, 0.0f, 6.0f));
        if (z4) {
            addView(new f5(context, g6Var), c6.b(22.66f, 22.66f, 83, 48.66f, 0.0f, 0.0f, 3.6599998f));
        }
        TextView textView = new TextView(context);
        this.d = textView;
        org.telegram.ui.b.g(16.0f, 1, textView);
        textView.setTextColor(k6.v0(k6.f21768j5, g6Var));
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        addView(textView, c6.d(-1, -2.0f, 51, 80.0f, 7.0f, 0.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.f5496b = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(k6.v0(k6.f22055z6, g6Var));
        textView2.setSingleLine(true);
        textView2.setEllipsize(truncateAt);
        addView(textView2, c6.d(-1, -2.0f, 51, 80.0f, 30.33f, 0.0f, 0.0f));
    }

    public t3(e5 e5Var, Context context) {
        super(context);
        this.f5495a = 10;
        this.f5496b = e5Var;
        this.d = new RectF();
        this.f5497c = new Paint(1);
    }

    public t3(Context context, Paint paint, TextPaint textPaint) {
        super(context);
        this.f5495a = 5;
        this.f5497c = paint;
        this.f5496b = textPaint;
        this.d = new RectF();
    }

    public t3(w3 w3Var, Context context, int i10) {
        super(context);
        this.f5495a = i10;
        switch (i10) {
            case 1:
                this.f5496b = w3Var;
                super(context);
                pr prVar = pr.h;
                this.f5497c = new z5(this, 0L, 350L, prVar);
                this.d = new z5(this, 0L, 350L, prVar);
                return;
            default:
                this.f5496b = w3Var;
                this.f5497c = new Path();
                this.d = new RectF();
                return;
        }
    }

    public t3(th.n nVar, Context context) {
        super(context);
        this.f5495a = 11;
        this.f5496b = nVar;
        this.f5497c = new lf.b0(2);
        this.d = new lf.b0(8);
    }

    public t3(r5 r5Var, Context context) {
        super(context);
        g6 g6Var;
        g6 g6Var2;
        this.f5495a = 4;
        ImageView imageView = new ImageView(context);
        this.f5496b = imageView;
        imageView.setColorFilter(new PorterDuffColorFilter(k6.w0(null, k6.Oh, false), PorterDuff.Mode.MULTIPLY));
        addView(imageView, c6.d(28, 28.0f, 0, 25.0f, 12.0f, 16.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f5497c = textView;
        textView.setTypeface(AndroidUtilities.bold());
        int i10 = k6.G6;
        g6Var = ((org.telegram.ui.ActionBar.h3) r5Var).resourcesProvider;
        textView.setTextColor(k6.v0(i10, g6Var));
        textView.setTextSize(1, 14.0f);
        addView(textView, c6.d(-1, -2.0f, 0, 68.0f, 8.0f, 16.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        int i11 = k6.f22038y6;
        g6Var2 = ((org.telegram.ui.ActionBar.h3) r5Var).resourcesProvider;
        textView2.setTextColor(k6.v0(i11, g6Var2));
        textView2.setTextSize(1, 14.0f);
        addView(textView2, c6.d(-1, -2.0f, 0, 68.0f, 28.0f, 16.0f, 8.0f));
    }

    public t3(w8 w8Var, Activity activity) {
        super(activity);
        this.f5495a = 6;
        this.f5496b = w8Var;
        this.f5497c = new Path();
        this.d = new Paint(1);
    }

    public t3(y80 y80Var, Context context) {
        super(context);
        this.f5495a = 7;
        this.f5496b = y80Var;
        w80 w80Var = new w80(this, context);
        this.d = w80Var;
        LinearLayout f10 = org.telegram.messenger.y3.f(context, 0);
        addView(f10, c6.e(-2, -1, 1));
        TextView textView = new TextView(context);
        this.f5497c = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        f10.addView(w80Var, c6.n(-2, -1));
        f10.addView(textView, c6.q(-2, -2, 16));
        setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        w80Var.a(false);
    }

    public t3(z60 z60Var, Context context) {
        super(context);
        this.f5495a = 9;
        this.f5496b = z60Var;
        this.d = new RectF();
        this.f5497c = new Paint(1);
    }

    public t3(v21 v21Var, Context context, g6 g6Var) {
        super(context);
        this.f5495a = 8;
        this.f5496b = v21Var;
        Paint paint = new Paint(1);
        this.f5497c = paint;
        this.d = new d6(this, g6Var);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        v21Var.f31757f.setCallback(this);
    }

    public t3(ea eaVar, Context context, g6 g6Var) {
        super(context);
        this.f5495a = 3;
        this.f5496b = eaVar;
        this.d = g6Var;
        this.f5497c = new Paint(1);
    }
}
