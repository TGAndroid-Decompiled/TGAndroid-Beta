package di;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.i20;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.o11;
import org.telegram.ui.Components.r70;
import org.telegram.ui.Components.t70;
import org.telegram.ui.w40;
public final class e1 extends FrameLayout implements te.b {
    public final int f8440a;
    public Object f8441b;
    public Object f8442c;
    public Object d;

    public e1(Context context) {
        super(context);
        this.f8440a = 0;
    }

    @Override
    public void G(int i7, float f10, float f11, te.c cVar) {
        invalidate();
    }

    public void a(TextView textView, boolean z10) {
        float f10;
        te.c cVar = (te.c) this.f8442c;
        CharSequence text = textView.getText();
        if (text != null) {
            f10 = textView.getPaint().measureText(text, 0, text.length());
        } else {
            f10 = 0.0f;
        }
        float L = f10 + org.telegram.messenger.g0.L(32.0f);
        if (z10 && cVar.f57091f > 0.0f) {
            cVar.a(L);
            return;
        }
        cVar.c(L);
        invalidate();
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        int i7;
        boolean z10;
        float f10;
        int i10;
        boolean z11;
        float f11;
        float f12;
        switch (this.f8440a) {
            case 3:
                RectF rectF = (RectF) this.f8441b;
                super.dispatchDraw(canvas);
                Paint paint = (Paint) this.f8442c;
                paint.setColor(-1);
                float width = getWidth() - (org.telegram.messenger.g0.N(5.0f) * 2.0f);
                hi.s5 s5Var = (hi.s5) this.d;
                float N = (width - org.telegram.messenger.g0.N((s5Var.f15025b - 1) * 2)) / s5Var.f15025b;
                float N2 = org.telegram.messenger.g0.N(5.0f);
                for (int i11 = 0; i11 < s5Var.f15025b; i11++) {
                    rectF.set(N2, org.telegram.messenger.g0.N(8.0f), N2 + N, org.telegram.messenger.g0.N(10.0f));
                    if (i11 < s5Var.f15025b - 1) {
                        i7 = 255;
                    } else {
                        i7 = 133;
                    }
                    paint.setAlpha(i7);
                    canvas.drawRoundRect(rectF, org.telegram.messenger.g0.N(1.0f), org.telegram.messenger.g0.N(1.0f), paint);
                    N2 += org.telegram.messenger.g0.N(2.0f) + N;
                }
                return;
            case 8:
                Paint paint2 = (Paint) this.f8442c;
                org.telegram.ui.ActionBar.j6.n(paint2);
                paint2.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.G8, ((org.telegram.ui.Components.q8) this.d).getResourceProvider()));
                paint2.setAlpha((int) (getAlpha() * 255.0f));
                RectF rectF2 = org.telegram.messenger.g0.P;
                rectF2.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                Path path = (Path) this.f8441b;
                path.rewind();
                path.addRoundRect(rectF2, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), Path.Direction.CW);
                canvas.drawPath(path, paint2);
                super.dispatchDraw(canvas);
                return;
            case 10:
                o11 o11Var = (o11) this.d;
                org.telegram.ui.Components.g6 g6Var = o11Var.f37794f;
                float i12 = g6Var.i();
                int i13 = (i12 > 0.0f ? 1 : (i12 == 0.0f ? 0 : -1));
                if (i13 > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                float T1 = org.telegram.messenger.g0.T1(0.5f, 1.0f, i12) * o11Var.M;
                float L = org.telegram.messenger.g0.L(10.0f);
                float L2 = org.telegram.messenger.g0.L(8.33f);
                float width2 = (getWidth() / 2.0f) + org.telegram.messenger.g0.L(12.0f);
                float L3 = org.telegram.messenger.g0.L(12.0f);
                float max = Math.max(L2 + L2, g6Var.c() + org.telegram.messenger.g0.L(10.0f));
                if (z10) {
                    i10 = i13;
                    f11 = width2;
                    z11 = z10;
                    f12 = L3;
                    f10 = L2;
                    canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                } else {
                    f10 = L2;
                    i10 = i13;
                    z11 = z10;
                    f11 = width2;
                    f12 = L3;
                }
                super.dispatchDraw(canvas);
                if (z11) {
                    RectF rectF3 = org.telegram.messenger.g0.P;
                    float f13 = max / 2.0f;
                    rectF3.set((f11 - f13) - org.telegram.messenger.g0.L(1.33f), f12 - L, f13 + f11 + org.telegram.messenger.g0.L(1.33f), f12 + L);
                    org.telegram.messenger.g0.j3(rectF3, i12, rectF3.centerX(), rectF3.centerY());
                    float f14 = L * i12;
                    canvas.drawRoundRect(rectF3, f14, f14, (Paint) this.f8441b);
                    canvas.restore();
                }
                if (i10 > 0) {
                    canvas.save();
                    canvas.scale(T1, T1, f11, f12);
                    RectF rectF4 = org.telegram.messenger.g0.P;
                    float f15 = max / 2.0f;
                    rectF4.set(f11 - f15, f12 - f10, f11 + f15, f12 + f10);
                    org.telegram.ui.Components.z5 z5Var = (org.telegram.ui.Components.z5) this.f8442c;
                    z5Var.setColor(org.telegram.ui.ActionBar.j6.r1(i12, z5Var.f42250b.a(org.telegram.ui.ActionBar.j6.w0(o11Var.G, z5Var.f42249a), false)));
                    canvas.drawRoundRect(rectF4, f10, f10, z5Var);
                    g6Var.p(rectF4);
                    g6Var.C = (int) (i12 * 255.0f);
                    g6Var.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            case 11:
                Paint paint3 = (Paint) this.f8442c;
                w40 w40Var = (w40) this.d;
                paint3.setColor(w40Var.getThemedColor(org.telegram.ui.ActionBar.j6.f28849d6));
                canvas.save();
                canvas.translate(0.0f, -getTop());
                RectF rectF5 = (RectF) this.f8441b;
                rectF5.set(0.0f, 0.0f, getWidth(), getHeight());
                rectF5.offset(0.0f, getTop());
                w40.f0(w40Var, canvas, rectF5, paint3);
                canvas.restore();
                super.dispatchDraw(canvas);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f8440a) {
            case 6:
                if (motionEvent.getAction() == 0 && !((RectF) this.d).contains(motionEvent.getX(), motionEvent.getY())) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f8440a) {
            case 12:
                canvas.save();
                canvas.clipPath((Path) this.f8441b);
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
        switch (this.f8440a) {
            case 1:
                Paint paint = (Paint) this.f8441b;
                if (((gb) this.d).f8646e > 1) {
                    paint.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28849d6, (org.telegram.ui.ActionBar.e6) this.f8442c));
                    RectF rectF = org.telegram.messenger.g0.P;
                    rectF.set(view.getX(), view.getY(), view.getX() + view.getWidth(), view.getY() + view.getHeight());
                    rectF.inset(-org.telegram.messenger.g0.L(1.66f), -org.telegram.messenger.g0.L(1.66f));
                    canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(13.0f), paint);
                }
                return super.drawChild(canvas, view, j3);
            case 4:
                bg.c0 c0Var = (bg.c0) this.f8441b;
                bg.c0 c0Var2 = (bg.c0) this.f8442c;
                boolean drawChild = super.drawChild(canvas, view, j3);
                li.n nVar = (li.n) this.d;
                if (view == nVar.f19612e) {
                    int i7 = org.telegram.ui.ActionBar.j6.f28792a7;
                    c0Var.b(nVar.getThemedColor(i7));
                    c0Var.setBounds(0, 0, getWidth(), org.telegram.messenger.g0.f23605m);
                    c0Var.draw(canvas);
                    float R0 = org.telegram.messenger.g0.R0(org.telegram.messenger.g0.f23606n);
                    if (R0 > 0.0f) {
                        c0Var2.setAlpha((int) (R0 * 255.0f));
                        c0Var2.b(nVar.getThemedColor(i7));
                        c0Var2.setBounds(0, getHeight() - org.telegram.messenger.g0.f23606n, getWidth(), getHeight());
                        c0Var2.draw(canvas);
                    }
                }
                return drawChild;
            case 13:
                tg.j2 j2Var = ((tg.l2) this.d).f57426f;
                if (view == j2Var) {
                    canvas.save();
                    canvas.translate(((org.telegram.ui.Components.u5) this.f8441b).e(false, view.getX()), ((org.telegram.ui.Components.u5) this.f8442c).e(false, view.getY()));
                    j2Var.a(canvas);
                    canvas.restore();
                    return true;
                }
                return super.drawChild(canvas, view, j3);
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f8440a) {
            case 6:
                float min = Math.min(((te.c) this.f8442c).f57091f, getWidth() - org.telegram.messenger.g0.L(24.0f));
                float width = getWidth() / 2.0f;
                float height = getHeight() / 2.0f;
                RectF rectF = (RectF) this.d;
                float f10 = min / 2.0f;
                rectF.set(width - f10, height - (org.telegram.messenger.g0.L(38.0f) / 2.0f), width + f10, (org.telegram.messenger.g0.L(38.0f) / 2.0f) + height);
                int L = org.telegram.messenger.g0.L(6.0f);
                fh.g gVar = (fh.g) this.f8441b;
                gVar.setBounds(((int) rectF.left) - L, ((int) rectF.top) - L, ((int) rectF.right) + L, ((int) rectF.bottom) + L);
                gVar.draw(canvas);
                return;
            case 7:
                super.onDraw(canvas);
                Paint paint = (Paint) this.f8442c;
                paint.setColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f29070p7, false));
                canvas.save();
                TextPaint textPaint = (TextPaint) this.d;
                canvas.translate((getMeasuredWidth() - textPaint.measureText("500")) - org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.N(7.0f));
                RectF rectF2 = (RectF) this.f8441b;
                rectF2.set(0.0f, 0.0f, textPaint.measureText("500"), textPaint.getTextSize());
                rectF2.inset(-org.telegram.messenger.g0.L(6.0f), -org.telegram.messenger.g0.L(3.0f));
                float textSize = (textPaint.getTextSize() / 2.0f) + org.telegram.messenger.g0.L(3.0f);
                canvas.drawRoundRect(rectF2, textSize, textSize, paint);
                canvas.drawText("500", 0.0f, textPaint.getTextSize() - org.telegram.messenger.g0.N(2.0f), textPaint);
                canvas.restore();
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        switch (this.f8440a) {
            case 12:
                super.onMeasure(i7, i10);
                Path path = (Path) this.f8441b;
                path.rewind();
                RectF rectF = (RectF) this.f8442c;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                path.addRoundRect(rectF, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), Path.Direction.CW);
                tg.j2 j2Var = ((tg.l2) this.d).f57426f;
                if (j2Var != null) {
                    j2Var.setMaxWidth(getMeasuredWidth() - org.telegram.messenger.g0.L(32.0f));
                    return;
                }
                return;
            default:
                super.onMeasure(i7, i10);
                return;
        }
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.f8440a) {
            case 10:
                if (((o11) this.d).f37794f != drawable && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public e1(Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        super(context);
        this.f8440a = 5;
        org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9(context);
        this.f8442c = i9Var;
        i9Var.setRoundRadius(org.telegram.messenger.g0.L(23.0f));
        addView(i9Var, c8.ja.d(46, 46.0f, 19, 21.0f, 6.0f, 0.0f, 6.0f));
        if (z10) {
            addView(new mi.a(context, e6Var), c8.ja.b(22.66f, 22.66f, 83, 48.66f, 0.0f, 0.0f, 3.6599998f));
        }
        TextView textView = new TextView(context);
        this.f8441b = textView;
        i20.o(textView, 1, 16.0f);
        org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.f28957j5, e6Var);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        addView(textView, c8.ja.d(-1, -2.0f, 51, 80.0f, 7.0f, 0.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.q6.U(textView2, org.telegram.ui.ActionBar.j6.f29260z6, e6Var);
        textView2.setSingleLine(true);
        textView2.setEllipsize(truncateAt);
        addView(textView2, c8.ja.d(-1, -2.0f, 51, 80.0f, 30.33f, 0.0f, 0.0f));
    }

    public e1(hi.s5 s5Var, Context context) {
        super(context);
        this.f8440a = 3;
        this.d = s5Var;
        this.f8441b = new RectF();
        this.f8442c = new Paint(1);
    }

    public e1(Context context, Paint paint, TextPaint textPaint) {
        super(context);
        this.f8440a = 7;
        this.f8442c = paint;
        this.d = textPaint;
        this.f8441b = new RectF();
    }

    public e1(tg.l2 l2Var, Context context, int i7) {
        super(context);
        this.f8440a = i7;
        switch (i7) {
            case 13:
                this.d = l2Var;
                super(context);
                er erVar = er.h;
                this.f8441b = new org.telegram.ui.Components.u5(this, 0L, 350L, erVar);
                this.f8442c = new org.telegram.ui.Components.u5(this, 0L, 350L, erVar);
                return;
            default:
                this.d = l2Var;
                this.f8441b = new Path();
                this.f8442c = new RectF();
                return;
        }
    }

    public e1(li.n nVar, Context context) {
        super(context);
        this.f8440a = 4;
        this.d = nVar;
        this.f8441b = new bg.c0(2);
        this.f8442c = new bg.c0(8);
    }

    public e1(fi.o5 o5Var, Context context) {
        super(context);
        this.f8440a = 2;
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        org.telegram.ui.ActionBar.q6.s(imageView, org.telegram.ui.ActionBar.j6.Fi, null, PorterDuff.Mode.MULTIPLY);
        addView(imageView, c8.ja.d(28, 28.0f, 0, 25.0f, 12.0f, 16.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f8441b = textView;
        textView.setTypeface(org.telegram.messenger.g0.o());
        org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.G6, o5Var.J0);
        textView.setTextSize(1, 14.0f);
        addView(textView, c8.ja.d(-1, -2.0f, 0, 68.0f, 8.0f, 16.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.f8442c = textView2;
        org.telegram.ui.ActionBar.q6.U(textView2, org.telegram.ui.ActionBar.j6.f29241y6, o5Var.J0);
        textView2.setTextSize(1, 14.0f);
        addView(textView2, c8.ja.d(-1, -2.0f, 0, 68.0f, 28.0f, 16.0f, 8.0f));
    }

    @Override
    public void E(float f10, int i7) {
    }

    public e1(org.telegram.ui.Components.q8 q8Var, Activity activity) {
        super(activity);
        this.f8440a = 8;
        this.d = q8Var;
        this.f8441b = new Path();
        this.f8442c = new Paint(1);
    }

    public e1(t70 t70Var, Context context) {
        super(context);
        this.f8440a = 9;
        this.d = t70Var;
        r70 r70Var = new r70(this, context);
        this.f8442c = r70Var;
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 0);
        addView(f10, c8.ja.e(-2, -1, 1));
        TextView textView = new TextView(context);
        this.f8441b = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        f10.addView(r70Var, c8.ja.o(-2, -1));
        f10.addView(textView, c8.ja.r(-2, -2, 16));
        setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
        r70Var.a(false);
    }

    public e1(org.telegram.ui.i8 i8Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.e6 e6Var;
        this.f8440a = 6;
        this.f8442c = new te.c(0, this, er.h, 350L, 0.0f);
        this.d = new RectF();
        setWillNotDraw(false);
        fh.g c10 = i8Var.getBaseSimpleGlass().f56042c.c(this, null, false);
        e6Var = ((org.telegram.ui.ActionBar.e2) i8Var).resourceProvider;
        c10.p(c8.g0.l(e6Var));
        c10.q(org.telegram.messenger.g0.L(6.0f));
        c10.r(org.telegram.messenger.g0.L(19.0f));
        this.f8441b = c10;
    }

    public e1(w40 w40Var, Context context) {
        super(context);
        this.f8440a = 11;
        this.d = w40Var;
        this.f8441b = new RectF();
        this.f8442c = new Paint(1);
    }

    public e1(o11 o11Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f8440a = 10;
        this.d = o11Var;
        Paint paint = new Paint(1);
        this.f8441b = paint;
        this.f8442c = new org.telegram.ui.Components.z5(this, e6Var);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        o11Var.f37794f.setCallback(this);
    }

    public e1(gb gbVar, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f8440a = 1;
        this.d = gbVar;
        this.f8442c = e6Var;
        this.f8441b = new Paint(1);
    }
}
