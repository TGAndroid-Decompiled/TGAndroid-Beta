package dg;

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
import k7.b6;
import lh.ea;
import lh.f5;
import nh.r5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.v21;
import org.telegram.ui.Components.v80;
import org.telegram.ui.Components.w8;
import org.telegram.ui.Components.x80;
import org.telegram.ui.Components.z5;
import org.telegram.ui.y60;
import ph.g5;
public final class v3 extends FrameLayout {
    public final int f4830a;
    public Object f4831b;
    public Object f4832c;
    public Object d;

    public v3(Context context) {
        super(context);
        this.f4830a = 2;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        boolean z4;
        float f10;
        int i10;
        float f11;
        int i11;
        switch (this.f4830a) {
            case 6:
                Paint paint = (Paint) this.d;
                j6.m(paint);
                paint.setColor(j6.v0(j6.G8, ((w8) this.f4831b).getResourceProvider()));
                paint.setAlpha((int) (getAlpha() * 255.0f));
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                Path path = (Path) this.f4832c;
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
                v21 v21Var = (v21) this.f4831b;
                float g10 = v21Var.f29343f.g();
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
                float max = Math.max(dp2 + dp2, v21Var.f29343f.d() + AndroidUtilities.dp(10.0f));
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
                    canvas.drawRoundRect(rectF2, f13, f13, (Paint) this.f4832c);
                    canvas.restore();
                }
                if (i10 > 0) {
                    canvas.save();
                    canvas.scale(lerp, lerp, f10, f11);
                    RectF rectF3 = AndroidUtilities.rectTmp;
                    float f14 = max / 2.0f;
                    rectF3.set(f10 - f14, f11 - dp2, f10 + f14, f11 + dp2);
                    d6 d6Var = (d6) this.d;
                    d6Var.setColor(j6.l1(g10, d6Var.f24174b.a(j6.v0(v21Var.B, d6Var.f24173a), false)));
                    canvas.drawRoundRect(rectF3, dp2, dp2, d6Var);
                    v21Var.f29343f.m(rectF3);
                    org.telegram.ui.Components.j6 j6Var = v21Var.f29343f;
                    j6Var.f25901w = (int) (g10 * 255.0f);
                    j6Var.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            case 9:
                Paint paint2 = (Paint) this.f4832c;
                y60 y60Var = (y60) this.f4831b;
                paint2.setColor(y60Var.getThemedColor(j6.f19906d6));
                canvas.save();
                canvas.translate(0.0f, -getTop());
                RectF rectF4 = (RectF) this.d;
                rectF4.set(0.0f, 0.0f, getWidth(), getHeight());
                rectF4.offset(0.0f, getTop());
                y60.a0(y60Var, canvas, rectF4, paint2);
                canvas.restore();
                super.dispatchDraw(canvas);
                return;
            case 10:
                RectF rectF5 = (RectF) this.d;
                super.dispatchDraw(canvas);
                Paint paint3 = (Paint) this.f4832c;
                paint3.setColor(-1);
                float width2 = getWidth() - (AndroidUtilities.dpf2(5.0f) * 2.0f);
                g5 g5Var = (g5) this.f4831b;
                float dpf2 = (width2 - AndroidUtilities.dpf2((g5Var.f41682b - 1) * 2)) / g5Var.f41682b;
                float dpf22 = AndroidUtilities.dpf2(5.0f);
                for (int i13 = 0; i13 < g5Var.f41682b; i13++) {
                    rectF5.set(dpf22, AndroidUtilities.dpf2(8.0f), dpf22 + dpf2, AndroidUtilities.dpf2(10.0f));
                    if (i13 < g5Var.f41682b - 1) {
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
        switch (this.f4830a) {
            case 0:
                canvas.save();
                canvas.clipPath((Path) this.f4832c);
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
        switch (this.f4830a) {
            case 1:
                w3 w3Var = ((y3) this.f4831b).f4865f;
                if (view == w3Var) {
                    canvas.save();
                    canvas.translate(((z5) this.f4832c).d(view.getX(), false), ((z5) this.d).d(view.getY(), false));
                    w3Var.a(canvas);
                    canvas.restore();
                    return true;
                }
                return super.drawChild(canvas, view, j10);
            case 3:
                Paint paint = (Paint) this.f4832c;
                if (((ea) this.f4831b).e > 1) {
                    paint.setColor(j6.v0(j6.f19906d6, (f6) this.d));
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(view.getX(), view.getY(), view.getX() + view.getWidth(), view.getY() + view.getHeight());
                    rectF.inset(-AndroidUtilities.dp(1.66f), -AndroidUtilities.dp(1.66f));
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), paint);
                }
                return super.drawChild(canvas, view, j10);
            case 11:
                lf.b0 b0Var = (lf.b0) this.f4832c;
                lf.b0 b0Var2 = (lf.b0) this.d;
                boolean drawChild = super.drawChild(canvas, view, j10);
                sh.n nVar = (sh.n) this.f4831b;
                if (view == nVar.d) {
                    int i10 = j6.f19852a7;
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
        switch (this.f4830a) {
            case 5:
                super.onDraw(canvas);
                Paint paint = (Paint) this.f4832c;
                paint.setColor(j6.w0(null, j6.f20122p7, false));
                canvas.save();
                TextPaint textPaint = (TextPaint) this.f4831b;
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
        switch (this.f4830a) {
            case 0:
                super.onMeasure(i10, i11);
                Path path = (Path) this.f4832c;
                path.rewind();
                RectF rectF = (RectF) this.d;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                path.addRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), Path.Direction.CW);
                w3 w3Var = ((y3) this.f4831b).f4865f;
                if (w3Var != null) {
                    w3Var.setMaxWidth(getMeasuredWidth() - AndroidUtilities.dp(32.0f));
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
        switch (this.f4830a) {
            case 8:
                if (((v21) this.f4831b).f29343f != drawable && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public v3(Context context, f6 f6Var, boolean z4) {
        super(context);
        this.f4830a = 12;
        p9 p9Var = new p9(context);
        this.f4832c = p9Var;
        p9Var.setRoundRadius(AndroidUtilities.dp(23.0f));
        addView(p9Var, b6.d(46, 46.0f, 19, 21.0f, 6.0f, 0.0f, 6.0f));
        if (z4) {
            addView(new f5(context, f6Var), b6.b(22.66f, 22.66f, 83, 48.66f, 0.0f, 0.0f, 3.6599998f));
        }
        TextView textView = new TextView(context);
        this.d = textView;
        org.telegram.ui.b.g(16.0f, 1, textView);
        textView.setTextColor(j6.v0(j6.f20012j5, f6Var));
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        addView(textView, b6.d(-1, -2.0f, 51, 80.0f, 7.0f, 0.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.f4831b = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(j6.v0(j6.f20298z6, f6Var));
        textView2.setSingleLine(true);
        textView2.setEllipsize(truncateAt);
        addView(textView2, b6.d(-1, -2.0f, 51, 80.0f, 30.33f, 0.0f, 0.0f));
    }

    public v3(g5 g5Var, Context context) {
        super(context);
        this.f4830a = 10;
        this.f4831b = g5Var;
        this.d = new RectF();
        this.f4832c = new Paint(1);
    }

    public v3(Context context, Paint paint, TextPaint textPaint) {
        super(context);
        this.f4830a = 5;
        this.f4832c = paint;
        this.f4831b = textPaint;
        this.d = new RectF();
    }

    public v3(y3 y3Var, Context context, int i10) {
        super(context);
        this.f4830a = i10;
        switch (i10) {
            case 1:
                this.f4831b = y3Var;
                super(context);
                nr nrVar = nr.h;
                this.f4832c = new z5(this, 0L, 350L, nrVar);
                this.d = new z5(this, 0L, 350L, nrVar);
                return;
            default:
                this.f4831b = y3Var;
                this.f4832c = new Path();
                this.d = new RectF();
                return;
        }
    }

    public v3(sh.n nVar, Context context) {
        super(context);
        this.f4830a = 11;
        this.f4831b = nVar;
        this.f4832c = new lf.b0(2);
        this.d = new lf.b0(8);
    }

    public v3(r5 r5Var, Context context) {
        super(context);
        f6 f6Var;
        f6 f6Var2;
        this.f4830a = 4;
        ImageView imageView = new ImageView(context);
        this.f4831b = imageView;
        imageView.setColorFilter(new PorterDuffColorFilter(j6.w0(null, j6.Oh, false), PorterDuff.Mode.MULTIPLY));
        addView(imageView, b6.d(28, 28.0f, 0, 25.0f, 12.0f, 16.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f4832c = textView;
        textView.setTypeface(AndroidUtilities.bold());
        int i10 = j6.G6;
        f6Var = ((org.telegram.ui.ActionBar.g3) r5Var).resourcesProvider;
        textView.setTextColor(j6.v0(i10, f6Var));
        textView.setTextSize(1, 14.0f);
        addView(textView, b6.d(-1, -2.0f, 0, 68.0f, 8.0f, 16.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        int i11 = j6.f20281y6;
        f6Var2 = ((org.telegram.ui.ActionBar.g3) r5Var).resourcesProvider;
        textView2.setTextColor(j6.v0(i11, f6Var2));
        textView2.setTextSize(1, 14.0f);
        addView(textView2, b6.d(-1, -2.0f, 0, 68.0f, 28.0f, 16.0f, 8.0f));
    }

    public v3(w8 w8Var, Activity activity) {
        super(activity);
        this.f4830a = 6;
        this.f4831b = w8Var;
        this.f4832c = new Path();
        this.d = new Paint(1);
    }

    public v3(x80 x80Var, Context context) {
        super(context);
        this.f4830a = 7;
        this.f4831b = x80Var;
        v80 v80Var = new v80(this, context);
        this.d = v80Var;
        LinearLayout f10 = org.telegram.messenger.y3.f(context, 0);
        addView(f10, b6.e(-2, -1, 1));
        TextView textView = new TextView(context);
        this.f4832c = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        f10.addView(v80Var, b6.n(-2, -1));
        f10.addView(textView, b6.q(-2, -2, 16));
        setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        v80Var.a(false);
    }

    public v3(y60 y60Var, Context context) {
        super(context);
        this.f4830a = 9;
        this.f4831b = y60Var;
        this.d = new RectF();
        this.f4832c = new Paint(1);
    }

    public v3(v21 v21Var, Context context, f6 f6Var) {
        super(context);
        this.f4830a = 8;
        this.f4831b = v21Var;
        Paint paint = new Paint(1);
        this.f4832c = paint;
        this.d = new d6(this, f6Var);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        v21Var.f29343f.setCallback(this);
    }

    public v3(ea eaVar, Context context, f6 f6Var) {
        super(context);
        this.f4830a = 3;
        this.f4831b = eaVar;
        this.d = f6Var;
        this.f4832c = new Paint(1);
    }
}
