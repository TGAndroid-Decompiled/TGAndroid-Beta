package hh;

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
import org.telegram.messenger.rl;
import org.telegram.ui.Components.c21;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.g80;
import org.telegram.ui.Components.i80;
import org.telegram.ui.o60;

public final class h1 extends FrameLayout {

    public final int f9369a;

    public Object f9370b;

    public Object f9371c;
    public Object d;

    public h1(Context context) {
        super(context);
        this.f9369a = 0;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        float f10;
        float f11;
        switch (this.f9369a) {
            case 3:
                RectF rectF = (RectF) this.f9370b;
                super.dispatchDraw(canvas);
                Paint paint = (Paint) this.f9371c;
                paint.setColor(-1);
                float width = getWidth() - (AndroidUtilities.dpf2(5.0f) * 2.0f);
                lh.j6 j6Var = (lh.j6) this.d;
                float fDpf2 = (width - AndroidUtilities.dpf2((j6Var.f16189b - 1) * 2)) / j6Var.f16189b;
                float fDpf3 = AndroidUtilities.dpf2(5.0f);
                int i10 = 0;
                while (i10 < j6Var.f16189b) {
                    rectF.set(fDpf3, AndroidUtilities.dpf2(8.0f), fDpf3 + fDpf2, AndroidUtilities.dpf2(10.0f));
                    paint.setAlpha(i10 < j6Var.f16189b + (-1) ? 255 : 133);
                    canvas.drawRoundRect(rectF, AndroidUtilities.dpf2(1.0f), AndroidUtilities.dpf2(1.0f), paint);
                    fDpf3 += AndroidUtilities.dpf2(2.0f) + fDpf2;
                    i10++;
                }
                break;
            case 4:
            case 5:
            case 7:
            default:
                super.dispatchDraw(canvas);
                break;
            case 6:
                Paint paint2 = (Paint) this.f9371c;
                org.telegram.ui.ActionBar.g6.m(paint2);
                paint2.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G8, ((org.telegram.ui.Components.v8) this.d).getResourceProvider()));
                paint2.setAlpha((int) (getAlpha() * 255.0f));
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                Path path = (Path) this.f9370b;
                path.rewind();
                path.addRoundRect(rectF2, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), Path.Direction.CW);
                canvas.drawPath(path, paint2);
                super.dispatchDraw(canvas);
                break;
            case 8:
                c21 c21Var = (c21) this.d;
                float fG = c21Var.f27305f.g();
                boolean z10 = fG > 0.0f;
                float fLerp = AndroidUtilities.lerp(0.5f, 1.0f, fG) * c21Var.G;
                float fDp = AndroidUtilities.dp(10.0f);
                float fDp2 = AndroidUtilities.dp(8.33f);
                float width2 = (getWidth() / 2.0f) + AndroidUtilities.dp(12.0f);
                float fDp3 = AndroidUtilities.dp(12.0f);
                float fMax = Math.max(fDp2 + fDp2, c21Var.f27305f.d() + AndroidUtilities.dp(10.0f));
                if (z10) {
                    f11 = fDp3;
                    f10 = width2;
                    canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                } else {
                    f10 = width2;
                    f11 = fDp3;
                }
                super.dispatchDraw(canvas);
                if (z10) {
                    RectF rectF3 = AndroidUtilities.rectTmp;
                    float f12 = fMax / 2.0f;
                    rectF3.set((f10 - f12) - AndroidUtilities.dp(1.33f), f11 - fDp, f12 + f10 + AndroidUtilities.dp(1.33f), f11 + fDp);
                    AndroidUtilities.scaleRect(rectF3, fG);
                    float f13 = fDp * fG;
                    canvas.drawRoundRect(rectF3, f13, f13, (Paint) this.f9370b);
                    canvas.restore();
                }
                if (fG > 0.0f) {
                    canvas.save();
                    canvas.scale(fLerp, fLerp, f10, f11);
                    RectF rectF4 = AndroidUtilities.rectTmp;
                    float f14 = fMax / 2.0f;
                    rectF4.set(f10 - f14, f11 - fDp2, f10 + f14, f11 + fDp2);
                    org.telegram.ui.Components.c6 c6Var = (org.telegram.ui.Components.c6) this.f9371c;
                    c6Var.setColor(org.telegram.ui.ActionBar.g6.l1(fG, c6Var.f27325b.a(org.telegram.ui.ActionBar.g6.v0(c21Var.A, c6Var.f27324a), false)));
                    canvas.drawRoundRect(rectF4, fDp2, fDp2, c6Var);
                    c21Var.f27305f.m(rectF4);
                    org.telegram.ui.Components.i6 i6Var = c21Var.f27305f;
                    i6Var.f29257w = (int) (fG * 255.0f);
                    i6Var.draw(canvas);
                    canvas.restore();
                }
                break;
            case 9:
                Paint paint3 = (Paint) this.f9371c;
                o60 o60Var = (o60) this.d;
                paint3.setColor(o60Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23053d6));
                canvas.save();
                canvas.translate(0.0f, -getTop());
                RectF rectF5 = (RectF) this.f9370b;
                rectF5.set(0.0f, 0.0f, getWidth(), getHeight());
                rectF5.offset(0.0f, getTop());
                o60.a0(o60Var, canvas, rectF5, paint3);
                canvas.restore();
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f9369a) {
            case 11:
                canvas.save();
                canvas.clipPath((Path) this.f9370b);
                super.draw(canvas);
                canvas.restore();
                break;
            default:
                super.draw(canvas);
                break;
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        switch (this.f9369a) {
            case 1:
                Paint paint = (Paint) this.f9370b;
                if (((ja) this.d).f9548e > 1) {
                    paint.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23053d6, (org.telegram.ui.ActionBar.c6) this.f9371c));
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(view.getX(), view.getY(), view.getX() + view.getWidth(), view.getY() + view.getHeight());
                    rectF.inset(-AndroidUtilities.dp(1.66f), -AndroidUtilities.dp(1.66f));
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), paint);
                }
                return super.drawChild(canvas, view, j10);
            case 4:
                gf.c0 c0Var = (gf.c0) this.f9370b;
                gf.c0 c0Var2 = (gf.c0) this.f9371c;
                boolean zDrawChild = super.drawChild(canvas, view, j10);
                oh.o oVar = (oh.o) this.d;
                if (view == oVar.d) {
                    int i10 = org.telegram.ui.ActionBar.g6.f22999a7;
                    c0Var.b(oVar.getThemedColor(i10));
                    c0Var.setBounds(0, 0, getWidth(), AndroidUtilities.statusBarHeight);
                    c0Var.draw(canvas);
                    float navigationBarThirdButtonsFactor = AndroidUtilities.getNavigationBarThirdButtonsFactor(AndroidUtilities.navigationBarHeight);
                    if (navigationBarThirdButtonsFactor > 0.0f) {
                        c0Var2.setAlpha((int) (navigationBarThirdButtonsFactor * 255.0f));
                        c0Var2.b(oVar.getThemedColor(i10));
                        c0Var2.setBounds(0, getHeight() - AndroidUtilities.navigationBarHeight, getWidth(), getHeight());
                        c0Var2.draw(canvas);
                    }
                }
                return zDrawChild;
            case 12:
                zf.r2 r2Var = ((zf.t2) this.d).f50709f;
                if (view != r2Var) {
                    return super.drawChild(canvas, view, j10);
                }
                canvas.save();
                canvas.translate(((org.telegram.ui.Components.y5) this.f9370b).d(view.getX(), false), ((org.telegram.ui.Components.y5) this.f9371c).d(view.getY(), false));
                r2Var.a(canvas);
                canvas.restore();
                return true;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f9369a) {
            case 5:
                super.onDraw(canvas);
                Paint paint = (Paint) this.f9371c;
                paint.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23269p7, false));
                canvas.save();
                float measuredWidth = getMeasuredWidth();
                TextPaint textPaint = (TextPaint) this.d;
                canvas.translate((measuredWidth - textPaint.measureText("500")) - AndroidUtilities.dp(8.0f), AndroidUtilities.dpf2(7.0f));
                RectF rectF = (RectF) this.f9370b;
                rectF.set(0.0f, 0.0f, textPaint.measureText("500"), textPaint.getTextSize());
                rectF.inset(-AndroidUtilities.dp(6.0f), -AndroidUtilities.dp(3.0f));
                float textSize = (textPaint.getTextSize() / 2.0f) + AndroidUtilities.dp(3.0f);
                canvas.drawRoundRect(rectF, textSize, textSize, paint);
                canvas.drawText("500", 0.0f, textPaint.getTextSize() - AndroidUtilities.dpf2(2.0f), textPaint);
                canvas.restore();
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f9369a) {
            case 11:
                super.onMeasure(i10, i11);
                Path path = (Path) this.f9370b;
                path.rewind();
                RectF rectF = (RectF) this.f9371c;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                path.addRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), Path.Direction.CW);
                zf.r2 r2Var = ((zf.t2) this.d).f50709f;
                if (r2Var != null) {
                    r2Var.setMaxWidth(getMeasuredWidth() - AndroidUtilities.dp(32.0f));
                }
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.f9369a) {
            case 8:
                return ((c21) this.d).f27305f == drawable || super.verifyDrawable(drawable);
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public h1(Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        super(context);
        this.f9369a = 10;
        org.telegram.ui.Components.n9 n9Var = new org.telegram.ui.Components.n9(context);
        this.f9371c = n9Var;
        n9Var.setRoundRadius(AndroidUtilities.dp(23.0f));
        addView(n9Var, h7.z5.d(46, 46.0f, 19, 21.0f, 6.0f, 0.0f, 6.0f));
        if (z10) {
            addView(new h5(context, c6Var), h7.z5.b(22.66f, 22.66f, 83, 48.66f, 0.0f, 0.0f, 3.6599998f));
        }
        TextView textView = new TextView(context);
        this.f9370b = textView;
        rl.h(16.0f, 1, textView);
        textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23161j5, c6Var));
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        addView(textView, h7.z5.d(-1, -2.0f, 51, 80.0f, 7.0f, 0.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23441z6, c6Var));
        textView2.setSingleLine(true);
        textView2.setEllipsize(truncateAt);
        addView(textView2, h7.z5.d(-1, -2.0f, 51, 80.0f, 30.33f, 0.0f, 0.0f));
    }

    public h1(lh.j6 j6Var, Context context) {
        super(context);
        this.f9369a = 3;
        this.d = j6Var;
        this.f9370b = new RectF();
        this.f9371c = new Paint(1);
    }

    public h1(Context context, Paint paint, TextPaint textPaint) {
        super(context);
        this.f9369a = 5;
        this.f9371c = paint;
        this.d = textPaint;
        this.f9370b = new RectF();
    }

    public h1(zf.t2 t2Var, Context context, int i10) {
        super(context);
        this.f9369a = i10;
        switch (i10) {
            case 12:
                this.d = t2Var;
                super(context);
                er erVar = er.h;
                this.f9370b = new org.telegram.ui.Components.y5(this, 0L, 350L, erVar);
                this.f9371c = new org.telegram.ui.Components.y5(this, 0L, 350L, erVar);
                break;
            default:
                this.d = t2Var;
                this.f9370b = new Path();
                this.f9371c = new RectF();
                break;
        }
    }

    public h1(oh.o oVar, Context context) {
        super(context);
        this.f9369a = 4;
        this.d = oVar;
        this.f9370b = new gf.c0(2);
        this.f9371c = new gf.c0(8);
    }

    public h1(jh.o5 o5Var, Context context) {
        super(context);
        this.f9369a = 2;
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Oh, false), PorterDuff.Mode.MULTIPLY));
        addView(imageView, h7.z5.d(28, 28.0f, 0, 25.0f, 12.0f, 16.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f9370b = textView;
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, ((org.telegram.ui.ActionBar.e3) o5Var).resourcesProvider));
        textView.setTextSize(1, 14.0f);
        addView(textView, h7.z5.d(-1, -2.0f, 0, 68.0f, 8.0f, 16.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.f9371c = textView2;
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23423y6, ((org.telegram.ui.ActionBar.e3) o5Var).resourcesProvider));
        textView2.setTextSize(1, 14.0f);
        addView(textView2, h7.z5.d(-1, -2.0f, 0, 68.0f, 28.0f, 16.0f, 8.0f));
    }

    public h1(org.telegram.ui.Components.v8 v8Var, Activity activity) {
        super(activity);
        this.f9369a = 6;
        this.d = v8Var;
        this.f9370b = new Path();
        this.f9371c = new Paint(1);
    }

    public h1(i80 i80Var, Context context) {
        super(context);
        this.f9369a = 7;
        this.d = i80Var;
        g80 g80Var = new g80(this, context);
        this.f9371c = g80Var;
        LinearLayout linearLayoutG = org.telegram.messenger.y1.g(context, 0);
        addView(linearLayoutG, h7.z5.e(-2, -1, 1));
        TextView textView = new TextView(context);
        this.f9370b = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        linearLayoutG.addView(g80Var, h7.z5.n(-2, -1));
        linearLayoutG.addView(textView, h7.z5.q(-2, -2, 16));
        setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        g80Var.a(false);
    }

    public h1(o60 o60Var, Context context) {
        super(context);
        this.f9369a = 9;
        this.d = o60Var;
        this.f9370b = new RectF();
        this.f9371c = new Paint(1);
    }

    public h1(c21 c21Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f9369a = 8;
        this.d = c21Var;
        Paint paint = new Paint(1);
        this.f9370b = paint;
        this.f9371c = new org.telegram.ui.Components.c6(this, c6Var);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        c21Var.f27305f.setCallback(this);
    }

    public h1(ja jaVar, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f9369a = 1;
        this.d = jaVar;
        this.f9371c = c6Var;
        this.f9370b = new Paint(1);
    }
}
