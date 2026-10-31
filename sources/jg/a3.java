package jg;

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
import org.telegram.messenger.m5;
import org.telegram.messenger.z20;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.e6;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.h80;
import org.telegram.ui.Components.j80;
import org.telegram.ui.Components.n21;
import org.telegram.ui.Components.o8;
import org.telegram.ui.Components.t5;
import org.telegram.ui.Components.y5;
import org.telegram.ui.h8;
import org.telegram.ui.v50;
import rh.c8;
import th.h4;
import vh.g4;
import w7.b6;
import w7.b9;
public final class a3 extends FrameLayout implements fe.e {
    public final int f9889a;
    public Object f9890b;
    public Object f9891c;
    public Object d;

    public a3(Context context) {
        super(context);
        this.f9889a = 8;
    }

    public void a(TextView textView, boolean z10) {
        float f7;
        fe.f fVar = (fe.f) this.f9890b;
        CharSequence text = textView.getText();
        if (text != null) {
            f7 = textView.getPaint().measureText(text, 0, text.length());
        } else {
            f7 = 0.0f;
        }
        float L = f7 + org.telegram.messenger.i0.L(32.0f);
        if (z10 && fVar.f7031f > 0.0f) {
            fVar.a(L);
            return;
        }
        fVar.c(L);
        invalidate();
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        boolean z10;
        float f7;
        int i10;
        boolean z11;
        float f10;
        float f11;
        int i11;
        switch (this.f9889a) {
            case 4:
                Paint paint = (Paint) this.d;
                t6.n(paint);
                paint.setColor(t6.w0(t6.G8, ((o8) this.f9890b).getResourceProvider()));
                paint.setAlpha((int) (getAlpha() * 255.0f));
                RectF rectF = org.telegram.messenger.i0.P;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                Path path = (Path) this.f9891c;
                path.rewind();
                path.addRoundRect(rectF, org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f), Path.Direction.CW);
                canvas.drawPath(path, paint);
                super.dispatchDraw(canvas);
                return;
            case 6:
                n21 n21Var = (n21) this.f9890b;
                e6 e6Var = n21Var.f28665f;
                float i12 = e6Var.i();
                int i13 = (i12 > 0.0f ? 1 : (i12 == 0.0f ? 0 : -1));
                if (i13 > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                float T1 = org.telegram.messenger.i0.T1(0.5f, 1.0f, i12) * n21Var.L;
                float L = org.telegram.messenger.i0.L(10.0f);
                float L2 = org.telegram.messenger.i0.L(8.33f);
                float width = (getWidth() / 2.0f) + org.telegram.messenger.i0.L(12.0f);
                float L3 = org.telegram.messenger.i0.L(12.0f);
                float max = Math.max(L2 + L2, e6Var.c() + org.telegram.messenger.i0.L(10.0f));
                if (z10) {
                    i10 = i13;
                    f10 = width;
                    z11 = z10;
                    f11 = L3;
                    f7 = L2;
                    canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                } else {
                    f7 = L2;
                    i10 = i13;
                    z11 = z10;
                    f10 = width;
                    f11 = L3;
                }
                super.dispatchDraw(canvas);
                if (z11) {
                    RectF rectF2 = org.telegram.messenger.i0.P;
                    float f12 = max / 2.0f;
                    rectF2.set((f10 - f12) - org.telegram.messenger.i0.L(1.33f), f11 - L, f12 + f10 + org.telegram.messenger.i0.L(1.33f), f11 + L);
                    org.telegram.messenger.i0.i3(rectF2, i12, rectF2.centerX(), rectF2.centerY());
                    float f13 = L * i12;
                    canvas.drawRoundRect(rectF2, f13, f13, (Paint) this.f9891c);
                    canvas.restore();
                }
                if (i10 > 0) {
                    canvas.save();
                    canvas.scale(T1, T1, f10, f11);
                    RectF rectF3 = org.telegram.messenger.i0.P;
                    float f14 = max / 2.0f;
                    rectF3.set(f10 - f14, f11 - f7, f10 + f14, f11 + f7);
                    y5 y5Var = (y5) this.d;
                    y5Var.setColor(t6.r1(i12, y5Var.f32638b.a(t6.w0(n21Var.F, y5Var.f32637a), false)));
                    canvas.drawRoundRect(rectF3, f7, f7, y5Var);
                    e6Var.p(rectF3);
                    e6Var.B = (int) (i12 * 255.0f);
                    e6Var.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            case 7:
                Paint paint2 = (Paint) this.f9891c;
                v50 v50Var = (v50) this.f9890b;
                paint2.setColor(v50Var.getThemedColor(t6.f20929d6));
                canvas.save();
                canvas.translate(0.0f, -getTop());
                RectF rectF4 = (RectF) this.d;
                rectF4.set(0.0f, 0.0f, getWidth(), getHeight());
                rectF4.offset(0.0f, getTop());
                v50.e0(v50Var, canvas, rectF4, paint2);
                canvas.restore();
                super.dispatchDraw(canvas);
                return;
            case 11:
                RectF rectF5 = (RectF) this.d;
                super.dispatchDraw(canvas);
                Paint paint3 = (Paint) this.f9891c;
                paint3.setColor(-1);
                float width2 = getWidth() - (org.telegram.messenger.i0.N(5.0f) * 2.0f);
                g4 g4Var = (g4) this.f9890b;
                float N = (width2 - org.telegram.messenger.i0.N((g4Var.f51194b - 1) * 2)) / g4Var.f51194b;
                float N2 = org.telegram.messenger.i0.N(5.0f);
                for (int i14 = 0; i14 < g4Var.f51194b; i14++) {
                    rectF5.set(N2, org.telegram.messenger.i0.N(8.0f), N2 + N, org.telegram.messenger.i0.N(10.0f));
                    if (i14 < g4Var.f51194b - 1) {
                        i11 = 255;
                    } else {
                        i11 = 133;
                    }
                    paint3.setAlpha(i11);
                    canvas.drawRoundRect(rectF5, org.telegram.messenger.i0.N(1.0f), org.telegram.messenger.i0.N(1.0f), paint3);
                    N2 += org.telegram.messenger.i0.N(2.0f) + N;
                }
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f9889a) {
            case 2:
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
        switch (this.f9889a) {
            case 0:
                canvas.save();
                canvas.clipPath((Path) this.f9891c);
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
        switch (this.f9889a) {
            case 1:
                b3 b3Var = ((d3) this.f9890b).f9934f;
                if (view == b3Var) {
                    canvas.save();
                    canvas.translate(((t5) this.f9891c).e(false, view.getX()), ((t5) this.d).e(false, view.getY()));
                    b3Var.a(canvas);
                    canvas.restore();
                    return true;
                }
                return super.drawChild(canvas, view, j10);
            case 9:
                Paint paint = (Paint) this.f9891c;
                if (((c8) this.f9890b).e > 1) {
                    paint.setColor(t6.w0(t6.f20929d6, (p6) this.d));
                    RectF rectF = org.telegram.messenger.i0.P;
                    rectF.set(view.getX(), view.getY(), view.getX() + view.getWidth(), view.getY() + view.getHeight());
                    rectF.inset(-org.telegram.messenger.i0.L(1.66f), -org.telegram.messenger.i0.L(1.66f));
                    canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(13.0f), org.telegram.messenger.i0.L(13.0f), paint);
                }
                return super.drawChild(canvas, view, j10);
            case 12:
                rf.w wVar = (rf.w) this.f9891c;
                rf.w wVar2 = (rf.w) this.d;
                boolean drawChild = super.drawChild(canvas, view, j10);
                yh.l lVar = (yh.l) this.f9890b;
                if (view == lVar.e) {
                    int i10 = t6.f20872a7;
                    wVar.b(lVar.getThemedColor(i10));
                    wVar.setBounds(0, 0, getWidth(), org.telegram.messenger.i0.f16020m);
                    wVar.draw(canvas);
                    float R0 = org.telegram.messenger.i0.R0(org.telegram.messenger.i0.f16021n);
                    if (R0 > 0.0f) {
                        wVar2.setAlpha((int) (R0 * 255.0f));
                        wVar2.b(lVar.getThemedColor(i10));
                        wVar2.setBounds(0, getHeight() - org.telegram.messenger.i0.f16021n, getWidth(), getHeight());
                        wVar2.draw(canvas);
                    }
                }
                return drawChild;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f9889a) {
            case 2:
                float min = Math.min(((fe.f) this.f9890b).f7031f, getWidth() - org.telegram.messenger.i0.L(24.0f));
                float width = getWidth() / 2.0f;
                float height = getHeight() / 2.0f;
                RectF rectF = (RectF) this.d;
                float f7 = min / 2.0f;
                rectF.set(width - f7, height - (org.telegram.messenger.i0.L(38.0f) / 2.0f), width + f7, (org.telegram.messenger.i0.L(38.0f) / 2.0f) + height);
                int L = org.telegram.messenger.i0.L(6.0f);
                vg.f fVar = (vg.f) this.f9891c;
                fVar.setBounds(((int) rectF.left) - L, ((int) rectF.top) - L, ((int) rectF.right) + L, ((int) rectF.bottom) + L);
                fVar.draw(canvas);
                return;
            case 3:
                super.onDraw(canvas);
                Paint paint = (Paint) this.f9891c;
                paint.setColor(t6.x0(null, t6.f21153p7, false));
                canvas.save();
                TextPaint textPaint = (TextPaint) this.f9890b;
                canvas.translate((getMeasuredWidth() - textPaint.measureText("500")) - org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.N(7.0f));
                RectF rectF2 = (RectF) this.d;
                rectF2.set(0.0f, 0.0f, textPaint.measureText("500"), textPaint.getTextSize());
                rectF2.inset(-org.telegram.messenger.i0.L(6.0f), -org.telegram.messenger.i0.L(3.0f));
                float textSize = (textPaint.getTextSize() / 2.0f) + org.telegram.messenger.i0.L(3.0f);
                canvas.drawRoundRect(rectF2, textSize, textSize, paint);
                canvas.drawText("500", 0.0f, textPaint.getTextSize() - org.telegram.messenger.i0.N(2.0f), textPaint);
                canvas.restore();
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f9889a) {
            case 0:
                super.onMeasure(i10, i11);
                Path path = (Path) this.f9891c;
                path.rewind();
                RectF rectF = (RectF) this.d;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                path.addRoundRect(rectF, org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(10.0f), Path.Direction.CW);
                b3 b3Var = ((d3) this.f9890b).f9934f;
                if (b3Var != null) {
                    b3Var.setMaxWidth(getMeasuredWidth() - org.telegram.messenger.i0.L(32.0f));
                    return;
                }
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public void v(int i10, float f7, float f10, fe.f fVar) {
        invalidate();
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.f9889a) {
            case 6:
                if (((n21) this.f9890b).f28665f != drawable && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public a3(Context context, p6 p6Var, boolean z10) {
        super(context);
        this.f9889a = 13;
        g9 g9Var = new g9(context);
        this.f9891c = g9Var;
        g9Var.setRoundRadius(org.telegram.messenger.i0.L(23.0f));
        addView(g9Var, b6.d(46, 46.0f, 19, 21.0f, 6.0f, 0.0f, 6.0f));
        if (z10) {
            addView(new zh.a(context, p6Var), b6.b(22.66f, 22.66f, 83, 48.66f, 0.0f, 0.0f, 3.6599998f));
        }
        TextView textView = new TextView(context);
        this.d = textView;
        z20.n(textView, 1, 16.0f);
        a7.V(textView, t6.f21037j5, p6Var);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        addView(textView, b6.d(-1, -2.0f, 51, 80.0f, 7.0f, 0.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.f9890b = textView2;
        textView2.setTextSize(1, 14.0f);
        a7.V(textView2, t6.f21330z6, p6Var);
        textView2.setSingleLine(true);
        textView2.setEllipsize(truncateAt);
        addView(textView2, b6.d(-1, -2.0f, 51, 80.0f, 30.33f, 0.0f, 0.0f));
    }

    public a3(g4 g4Var, Context context) {
        super(context);
        this.f9889a = 11;
        this.f9890b = g4Var;
        this.d = new RectF();
        this.f9891c = new Paint(1);
    }

    public a3(Context context, Paint paint, TextPaint textPaint) {
        super(context);
        this.f9889a = 3;
        this.f9891c = paint;
        this.f9890b = textPaint;
        this.d = new RectF();
    }

    public a3(d3 d3Var, Context context, int i10) {
        super(context);
        this.f9889a = i10;
        switch (i10) {
            case 1:
                this.f9890b = d3Var;
                super(context);
                gr grVar = gr.h;
                this.f9891c = new t5(this, 0L, 350L, grVar);
                this.d = new t5(this, 0L, 350L, grVar);
                return;
            default:
                this.f9890b = d3Var;
                this.f9891c = new Path();
                this.d = new RectF();
                return;
        }
    }

    public a3(yh.l lVar, Context context) {
        super(context);
        this.f9889a = 12;
        this.f9890b = lVar;
        this.f9891c = new rf.w(2);
        this.d = new rf.w(8);
    }

    public a3(h4 h4Var, Context context) {
        super(context);
        this.f9889a = 10;
        ImageView imageView = new ImageView(context);
        this.f9890b = imageView;
        a7.t(imageView, t6.Ci, null, PorterDuff.Mode.MULTIPLY);
        addView(imageView, b6.d(28, 28.0f, 0, 25.0f, 12.0f, 16.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f9891c = textView;
        textView.setTypeface(org.telegram.messenger.i0.o());
        a7.V(textView, t6.G6, h4Var.I0);
        textView.setTextSize(1, 14.0f);
        addView(textView, b6.d(-1, -2.0f, 0, 68.0f, 8.0f, 16.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        a7.V(textView2, t6.f21311y6, h4Var.I0);
        textView2.setTextSize(1, 14.0f);
        addView(textView2, b6.d(-1, -2.0f, 0, 68.0f, 28.0f, 16.0f, 8.0f));
    }

    @Override
    public void E(float f7, int i10) {
    }

    public a3(o8 o8Var, Activity activity) {
        super(activity);
        this.f9889a = 4;
        this.f9890b = o8Var;
        this.f9891c = new Path();
        this.d = new Paint(1);
    }

    public a3(h8 h8Var, Context context) {
        super(context);
        p6 p6Var;
        this.f9889a = 2;
        this.f9890b = new fe.f(0, this, gr.h, 350L, 0.0f);
        this.d = new RectF();
        setWillNotDraw(false);
        vg.f c10 = h8Var.getBaseSimpleGlass().f6599c.c(this, null, false);
        p6Var = ((org.telegram.ui.ActionBar.k2) h8Var).resourceProvider;
        c10.o(b9.m(p6Var));
        c10.p(org.telegram.messenger.i0.L(6.0f));
        c10.q(org.telegram.messenger.i0.L(19.0f));
        this.f9891c = c10;
    }

    public a3(j80 j80Var, Context context) {
        super(context);
        this.f9889a = 5;
        this.f9890b = j80Var;
        h80 h80Var = new h80(this, context);
        this.d = h80Var;
        LinearLayout f7 = m5.f(context, 0);
        addView(f7, b6.e(-2, -1, 1));
        TextView textView = new TextView(context);
        this.f9891c = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.i0.o());
        f7.addView(h80Var, b6.o(-2, -1));
        f7.addView(textView, b6.r(-2, -2, 16));
        setPadding(0, org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(8.0f));
        h80Var.a(false);
    }

    public a3(v50 v50Var, Context context) {
        super(context);
        this.f9889a = 7;
        this.f9890b = v50Var;
        this.d = new RectF();
        this.f9891c = new Paint(1);
    }

    public a3(n21 n21Var, Context context, p6 p6Var) {
        super(context);
        this.f9889a = 6;
        this.f9890b = n21Var;
        Paint paint = new Paint(1);
        this.f9891c = paint;
        this.d = new y5(this, p6Var);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        n21Var.f28665f.setCallback(this);
    }

    public a3(c8 c8Var, Context context, p6 p6Var) {
        super(context);
        this.f9889a = 9;
        this.f9890b = c8Var;
        this.d = p6Var;
        this.f9891c = new Paint(1);
    }
}
