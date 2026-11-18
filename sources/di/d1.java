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
import org.telegram.messenger.n10;
import org.telegram.ui.Components.c80;
import org.telegram.ui.Components.e80;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.y11;
import org.telegram.ui.z40;
public final class d1 extends FrameLayout implements te.b {
    public final int f8644a;
    public Object f8645b;
    public Object f8646c;
    public Object d;

    public d1(Context context) {
        super(context);
        this.f8644a = 0;
    }

    @Override
    public void H(int i7, float f10, float f11, te.c cVar) {
        invalidate();
    }

    public void a(TextView textView, boolean z10) {
        float f10;
        te.c cVar = (te.c) this.f8646c;
        CharSequence text = textView.getText();
        if (text != null) {
            f10 = textView.getPaint().measureText(text, 0, text.length());
        } else {
            f10 = 0.0f;
        }
        float L = f10 + org.telegram.messenger.g0.L(32.0f);
        if (z10 && cVar.f57663f > 0.0f) {
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
        switch (this.f8644a) {
            case 3:
                RectF rectF = (RectF) this.f8645b;
                super.dispatchDraw(canvas);
                Paint paint = (Paint) this.f8646c;
                paint.setColor(-1);
                float width = getWidth() - (org.telegram.messenger.g0.N(5.0f) * 2.0f);
                hi.q5 q5Var = (hi.q5) this.d;
                float N = (width - org.telegram.messenger.g0.N((q5Var.f15274b - 1) * 2)) / q5Var.f15274b;
                float N2 = org.telegram.messenger.g0.N(5.0f);
                for (int i11 = 0; i11 < q5Var.f15274b; i11++) {
                    rectF.set(N2, org.telegram.messenger.g0.N(8.0f), N2 + N, org.telegram.messenger.g0.N(10.0f));
                    if (i11 < q5Var.f15274b - 1) {
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
                Paint paint2 = (Paint) this.f8646c;
                org.telegram.ui.ActionBar.n6.n(paint2);
                paint2.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.G8, ((org.telegram.ui.Components.y8) this.d).getResourceProvider()));
                paint2.setAlpha((int) (getAlpha() * 255.0f));
                RectF rectF2 = org.telegram.messenger.g0.P;
                rectF2.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                Path path = (Path) this.f8645b;
                path.rewind();
                path.addRoundRect(rectF2, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), Path.Direction.CW);
                canvas.drawPath(path, paint2);
                super.dispatchDraw(canvas);
                return;
            case 10:
                y11 y11Var = (y11) this.d;
                org.telegram.ui.Components.m6 m6Var = y11Var.f42265f;
                float i12 = m6Var.i();
                int i13 = (i12 > 0.0f ? 1 : (i12 == 0.0f ? 0 : -1));
                if (i13 > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                float T1 = org.telegram.messenger.g0.T1(0.5f, 1.0f, i12) * y11Var.M;
                float L = org.telegram.messenger.g0.L(10.0f);
                float L2 = org.telegram.messenger.g0.L(8.33f);
                float width2 = (getWidth() / 2.0f) + org.telegram.messenger.g0.L(12.0f);
                float L3 = org.telegram.messenger.g0.L(12.0f);
                float max = Math.max(L2 + L2, m6Var.c() + org.telegram.messenger.g0.L(10.0f));
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
                    org.telegram.messenger.g0.i3(rectF3, i12, rectF3.centerX(), rectF3.centerY());
                    float f14 = L * i12;
                    canvas.drawRoundRect(rectF3, f14, f14, (Paint) this.f8645b);
                    canvas.restore();
                }
                if (i10 > 0) {
                    canvas.save();
                    canvas.scale(T1, T1, f11, f12);
                    RectF rectF4 = org.telegram.messenger.g0.P;
                    float f15 = max / 2.0f;
                    rectF4.set(f11 - f15, f12 - f10, f11 + f15, f12 + f10);
                    org.telegram.ui.Components.g6 g6Var = (org.telegram.ui.Components.g6) this.f8646c;
                    g6Var.setColor(org.telegram.ui.ActionBar.n6.r1(i12, g6Var.f35356b.a(org.telegram.ui.ActionBar.n6.w0(y11Var.G, g6Var.f35355a), false)));
                    canvas.drawRoundRect(rectF4, f10, f10, g6Var);
                    m6Var.p(rectF4);
                    m6Var.C = (int) (i12 * 255.0f);
                    m6Var.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            case 11:
                Paint paint3 = (Paint) this.f8646c;
                z40 z40Var = (z40) this.d;
                paint3.setColor(z40Var.getThemedColor(org.telegram.ui.ActionBar.n6.f29396d6));
                canvas.save();
                canvas.translate(0.0f, -getTop());
                RectF rectF5 = (RectF) this.f8645b;
                rectF5.set(0.0f, 0.0f, getWidth(), getHeight());
                rectF5.offset(0.0f, getTop());
                z40.f0(z40Var, canvas, rectF5, paint3);
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
        switch (this.f8644a) {
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
        switch (this.f8644a) {
            case 12:
                canvas.save();
                canvas.clipPath((Path) this.f8645b);
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
        switch (this.f8644a) {
            case 1:
                Paint paint = (Paint) this.f8645b;
                if (((kb) this.d).f9206e > 1) {
                    paint.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29396d6, (org.telegram.ui.ActionBar.i6) this.f8646c));
                    RectF rectF = org.telegram.messenger.g0.P;
                    rectF.set(view.getX(), view.getY(), view.getX() + view.getWidth(), view.getY() + view.getHeight());
                    rectF.inset(-org.telegram.messenger.g0.L(1.66f), -org.telegram.messenger.g0.L(1.66f));
                    canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(13.0f), paint);
                }
                return super.drawChild(canvas, view, j3);
            case 4:
                bg.d0 d0Var = (bg.d0) this.f8645b;
                bg.d0 d0Var2 = (bg.d0) this.f8646c;
                boolean drawChild = super.drawChild(canvas, view, j3);
                li.p pVar = (li.p) this.d;
                if (view == pVar.f19983e) {
                    int i7 = org.telegram.ui.ActionBar.n6.f29339a7;
                    d0Var.b(pVar.getThemedColor(i7));
                    d0Var.setBounds(0, 0, getWidth(), org.telegram.messenger.g0.f24115m);
                    d0Var.draw(canvas);
                    float R0 = org.telegram.messenger.g0.R0(org.telegram.messenger.g0.f24116n);
                    if (R0 > 0.0f) {
                        d0Var2.setAlpha((int) (R0 * 255.0f));
                        d0Var2.b(pVar.getThemedColor(i7));
                        d0Var2.setBounds(0, getHeight() - org.telegram.messenger.g0.f24116n, getWidth(), getHeight());
                        d0Var2.draw(canvas);
                    }
                }
                return drawChild;
            case 13:
                tg.i2 i2Var = ((tg.k2) this.d).f57991f;
                if (view == i2Var) {
                    canvas.save();
                    canvas.translate(((org.telegram.ui.Components.c6) this.f8645b).e(false, view.getX()), ((org.telegram.ui.Components.c6) this.f8646c).e(false, view.getY()));
                    i2Var.a(canvas);
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
        switch (this.f8644a) {
            case 6:
                float min = Math.min(((te.c) this.f8646c).f57663f, getWidth() - org.telegram.messenger.g0.L(24.0f));
                float width = getWidth() / 2.0f;
                float height = getHeight() / 2.0f;
                RectF rectF = (RectF) this.d;
                float f10 = min / 2.0f;
                rectF.set(width - f10, height - (org.telegram.messenger.g0.L(38.0f) / 2.0f), width + f10, (org.telegram.messenger.g0.L(38.0f) / 2.0f) + height);
                int L = org.telegram.messenger.g0.L(6.0f);
                fh.g gVar = (fh.g) this.f8645b;
                gVar.setBounds(((int) rectF.left) - L, ((int) rectF.top) - L, ((int) rectF.right) + L, ((int) rectF.bottom) + L);
                gVar.draw(canvas);
                return;
            case 7:
                super.onDraw(canvas);
                Paint paint = (Paint) this.f8646c;
                paint.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29617p7, false));
                canvas.save();
                TextPaint textPaint = (TextPaint) this.d;
                canvas.translate((getMeasuredWidth() - textPaint.measureText("500")) - org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.N(7.0f));
                RectF rectF2 = (RectF) this.f8645b;
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
        switch (this.f8644a) {
            case 12:
                super.onMeasure(i7, i10);
                Path path = (Path) this.f8645b;
                path.rewind();
                RectF rectF = (RectF) this.f8646c;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                path.addRoundRect(rectF, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), Path.Direction.CW);
                tg.i2 i2Var = ((tg.k2) this.d).f57991f;
                if (i2Var != null) {
                    i2Var.setMaxWidth(getMeasuredWidth() - org.telegram.messenger.g0.L(32.0f));
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
        switch (this.f8644a) {
            case 10:
                if (((y11) this.d).f42265f != drawable && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public d1(Context context, org.telegram.ui.ActionBar.i6 i6Var, boolean z10) {
        super(context);
        this.f8644a = 5;
        org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(context);
        this.f8646c = q9Var;
        q9Var.setRoundRadius(org.telegram.messenger.g0.L(23.0f));
        addView(q9Var, c8.ma.d(46, 46.0f, 19, 21.0f, 6.0f, 0.0f, 6.0f));
        if (z10) {
            addView(new mi.a(context, i6Var), c8.ma.b(22.66f, 22.66f, 83, 48.66f, 0.0f, 0.0f, 3.6599998f));
        }
        TextView textView = new TextView(context);
        this.f8645b = textView;
        n10.p(textView, 1, 16.0f);
        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29504j5, i6Var);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        addView(textView, c8.ma.d(-1, -2.0f, 51, 80.0f, 7.0f, 0.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.u6.U(textView2, org.telegram.ui.ActionBar.n6.f29807z6, i6Var);
        textView2.setSingleLine(true);
        textView2.setEllipsize(truncateAt);
        addView(textView2, c8.ma.d(-1, -2.0f, 51, 80.0f, 30.33f, 0.0f, 0.0f));
    }

    public d1(hi.q5 q5Var, Context context) {
        super(context);
        this.f8644a = 3;
        this.d = q5Var;
        this.f8645b = new RectF();
        this.f8646c = new Paint(1);
    }

    public d1(Context context, Paint paint, TextPaint textPaint) {
        super(context);
        this.f8644a = 7;
        this.f8646c = paint;
        this.d = textPaint;
        this.f8645b = new RectF();
    }

    public d1(tg.k2 k2Var, Context context, int i7) {
        super(context);
        this.f8644a = i7;
        switch (i7) {
            case 13:
                this.d = k2Var;
                super(context);
                lr lrVar = lr.h;
                this.f8645b = new org.telegram.ui.Components.c6(this, 0L, 350L, lrVar);
                this.f8646c = new org.telegram.ui.Components.c6(this, 0L, 350L, lrVar);
                return;
            default:
                this.d = k2Var;
                this.f8645b = new Path();
                this.f8646c = new RectF();
                return;
        }
    }

    public d1(li.p pVar, Context context) {
        super(context);
        this.f8644a = 4;
        this.d = pVar;
        this.f8645b = new bg.d0(2);
        this.f8646c = new bg.d0(8);
    }

    public d1(fi.m5 m5Var, Context context) {
        super(context);
        this.f8644a = 2;
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        org.telegram.ui.ActionBar.u6.s(imageView, org.telegram.ui.ActionBar.n6.Fi, null, PorterDuff.Mode.MULTIPLY);
        addView(imageView, c8.ma.d(28, 28.0f, 0, 25.0f, 12.0f, 16.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f8645b = textView;
        textView.setTypeface(org.telegram.messenger.g0.o());
        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.G6, m5Var.J0);
        textView.setTextSize(1, 14.0f);
        addView(textView, c8.ma.d(-1, -2.0f, 0, 68.0f, 8.0f, 16.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.f8646c = textView2;
        org.telegram.ui.ActionBar.u6.U(textView2, org.telegram.ui.ActionBar.n6.f29788y6, m5Var.J0);
        textView2.setTextSize(1, 14.0f);
        addView(textView2, c8.ma.d(-1, -2.0f, 0, 68.0f, 28.0f, 16.0f, 8.0f));
    }

    @Override
    public void D(float f10, int i7) {
    }

    public d1(org.telegram.ui.Components.y8 y8Var, Activity activity) {
        super(activity);
        this.f8644a = 8;
        this.d = y8Var;
        this.f8645b = new Path();
        this.f8646c = new Paint(1);
    }

    public d1(e80 e80Var, Context context) {
        super(context);
        this.f8644a = 9;
        this.d = e80Var;
        c80 c80Var = new c80(this, context);
        this.f8646c = c80Var;
        LinearLayout g10 = org.telegram.messenger.f3.g(context, 0);
        addView(g10, c8.ma.e(-2, -1, 1));
        TextView textView = new TextView(context);
        this.f8645b = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        g10.addView(c80Var, c8.ma.o(-2, -1));
        g10.addView(textView, c8.ma.r(-2, -2, 16));
        setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
        c80Var.a(false);
    }

    public d1(org.telegram.ui.i8 i8Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.i6 i6Var;
        this.f8644a = 6;
        this.f8646c = new te.c(0, this, lr.h, 350L, 0.0f);
        this.d = new RectF();
        setWillNotDraw(false);
        fh.g c10 = i8Var.getBaseSimpleGlass().f56616c.c(this, null, false);
        i6Var = ((org.telegram.ui.ActionBar.h2) i8Var).resourceProvider;
        c10.p(c8.i0.m(i6Var));
        c10.q(org.telegram.messenger.g0.L(6.0f));
        c10.r(org.telegram.messenger.g0.L(19.0f));
        this.f8645b = c10;
    }

    public d1(z40 z40Var, Context context) {
        super(context);
        this.f8644a = 11;
        this.d = z40Var;
        this.f8645b = new RectF();
        this.f8646c = new Paint(1);
    }

    public d1(y11 y11Var, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.f8644a = 10;
        this.d = y11Var;
        Paint paint = new Paint(1);
        this.f8645b = paint;
        this.f8646c = new org.telegram.ui.Components.g6(this, i6Var);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        y11Var.f42265f.setCallback(this);
    }

    public d1(kb kbVar, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.f8644a = 1;
        this.d = kbVar;
        this.f8646c = i6Var;
        this.f8645b = new Paint(1);
    }
}
