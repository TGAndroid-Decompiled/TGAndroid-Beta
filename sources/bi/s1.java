package bi;

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
import org.telegram.ui.Components.l11;
import org.telegram.ui.Components.o70;
import org.telegram.ui.Components.q70;
import org.telegram.ui.Components.xq;
import org.telegram.ui.w40;
public final class s1 extends FrameLayout implements te.b {
    public final int f4661a;
    public Object f4662b;
    public Object f4663c;
    public Object d;

    public s1(Context context) {
        super(context);
        this.f4661a = 0;
    }

    @Override
    public void Y(int i7, float f10, float f11, te.c cVar) {
        invalidate();
    }

    public void a(TextView textView, boolean z9) {
        float f10;
        te.c cVar = (te.c) this.f4663c;
        CharSequence text = textView.getText();
        if (text != null) {
            f10 = textView.getPaint().measureText(text, 0, text.length());
        } else {
            f10 = 0.0f;
        }
        float L = f10 + org.telegram.messenger.g0.L(32.0f);
        if (z9 && cVar.f55492f > 0.0f) {
            cVar.a(L);
            return;
        }
        cVar.c(L);
        invalidate();
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        int i7;
        boolean z9;
        float f10;
        int i10;
        boolean z10;
        float f11;
        float f12;
        switch (this.f4661a) {
            case 3:
                RectF rectF = (RectF) this.f4662b;
                super.dispatchDraw(canvas);
                Paint paint = (Paint) this.f4663c;
                paint.setColor(-1);
                float width = getWidth() - (org.telegram.messenger.g0.N(5.0f) * 2.0f);
                fi.t5 t5Var = (fi.t5) this.d;
                float N = (width - org.telegram.messenger.g0.N((t5Var.f12855b - 1) * 2)) / t5Var.f12855b;
                float N2 = org.telegram.messenger.g0.N(5.0f);
                for (int i11 = 0; i11 < t5Var.f12855b; i11++) {
                    rectF.set(N2, org.telegram.messenger.g0.N(8.0f), N2 + N, org.telegram.messenger.g0.N(10.0f));
                    if (i11 < t5Var.f12855b - 1) {
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
                Paint paint2 = (Paint) this.f4663c;
                org.telegram.ui.ActionBar.k6.n(paint2);
                paint2.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G8, ((org.telegram.ui.Components.t8) this.d).getResourceProvider()));
                paint2.setAlpha((int) (getAlpha() * 255.0f));
                RectF rectF2 = org.telegram.messenger.g0.P;
                rectF2.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                Path path = (Path) this.f4662b;
                path.rewind();
                path.addRoundRect(rectF2, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), Path.Direction.CW);
                canvas.drawPath(path, paint2);
                super.dispatchDraw(canvas);
                return;
            case 10:
                l11 l11Var = (l11) this.d;
                org.telegram.ui.Components.i6 i6Var = l11Var.f35488f;
                float i12 = i6Var.i();
                int i13 = (i12 > 0.0f ? 1 : (i12 == 0.0f ? 0 : -1));
                if (i13 > 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                float T1 = org.telegram.messenger.g0.T1(0.5f, 1.0f, i12) * l11Var.L;
                float L = org.telegram.messenger.g0.L(10.0f);
                float L2 = org.telegram.messenger.g0.L(8.33f);
                float width2 = (getWidth() / 2.0f) + org.telegram.messenger.g0.L(12.0f);
                float L3 = org.telegram.messenger.g0.L(12.0f);
                float max = Math.max(L2 + L2, i6Var.c() + org.telegram.messenger.g0.L(10.0f));
                if (z9) {
                    i10 = i13;
                    f11 = width2;
                    z10 = z9;
                    f12 = L3;
                    f10 = L2;
                    canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                } else {
                    f10 = L2;
                    i10 = i13;
                    z10 = z9;
                    f11 = width2;
                    f12 = L3;
                }
                super.dispatchDraw(canvas);
                if (z10) {
                    RectF rectF3 = org.telegram.messenger.g0.P;
                    float f13 = max / 2.0f;
                    rectF3.set((f11 - f13) - org.telegram.messenger.g0.L(1.33f), f12 - L, f13 + f11 + org.telegram.messenger.g0.L(1.33f), f12 + L);
                    org.telegram.messenger.g0.j3(rectF3, i12, rectF3.centerX(), rectF3.centerY());
                    float f14 = L * i12;
                    canvas.drawRoundRect(rectF3, f14, f14, (Paint) this.f4662b);
                    canvas.restore();
                }
                if (i10 > 0) {
                    canvas.save();
                    canvas.scale(T1, T1, f11, f12);
                    RectF rectF4 = org.telegram.messenger.g0.P;
                    float f15 = max / 2.0f;
                    rectF4.set(f11 - f15, f12 - f10, f11 + f15, f12 + f10);
                    org.telegram.ui.Components.b6 b6Var = (org.telegram.ui.Components.b6) this.f4663c;
                    b6Var.setColor(org.telegram.ui.ActionBar.k6.r1(i12, b6Var.f32058b.a(org.telegram.ui.ActionBar.k6.w0(l11Var.F, b6Var.f32057a), false)));
                    canvas.drawRoundRect(rectF4, f10, f10, b6Var);
                    i6Var.p(rectF4);
                    i6Var.B = (int) (i12 * 255.0f);
                    i6Var.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            case 11:
                Paint paint3 = (Paint) this.f4663c;
                w40 w40Var = (w40) this.d;
                paint3.setColor(w40Var.getThemedColor(org.telegram.ui.ActionBar.k6.f27852d6));
                canvas.save();
                canvas.translate(0.0f, -getTop());
                RectF rectF5 = (RectF) this.f4662b;
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
        switch (this.f4661a) {
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
        switch (this.f4661a) {
            case 12:
                canvas.save();
                canvas.clipPath((Path) this.f4662b);
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
        switch (this.f4661a) {
            case 1:
                Paint paint = (Paint) this.f4662b;
                if (((yc) this.d).f5097e > 1) {
                    paint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27852d6, (org.telegram.ui.ActionBar.f6) this.f4663c));
                    RectF rectF = org.telegram.messenger.g0.P;
                    rectF.set(view.getX(), view.getY(), view.getX() + view.getWidth(), view.getY() + view.getHeight());
                    rectF.inset(-org.telegram.messenger.g0.L(1.66f), -org.telegram.messenger.g0.L(1.66f));
                    canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(13.0f), paint);
                }
                return super.drawChild(canvas, view, j3);
            case 4:
                bg.c0 c0Var = (bg.c0) this.f4662b;
                bg.c0 c0Var2 = (bg.c0) this.f4663c;
                boolean drawChild = super.drawChild(canvas, view, j3);
                ii.p pVar = (ii.p) this.d;
                if (view == pVar.f15586e) {
                    int i7 = org.telegram.ui.ActionBar.k6.f27796a7;
                    c0Var.b(pVar.getThemedColor(i7));
                    c0Var.setBounds(0, 0, getWidth(), org.telegram.messenger.g0.f22557m);
                    c0Var.draw(canvas);
                    float R0 = org.telegram.messenger.g0.R0(org.telegram.messenger.g0.f22558n);
                    if (R0 > 0.0f) {
                        c0Var2.setAlpha((int) (R0 * 255.0f));
                        c0Var2.b(pVar.getThemedColor(i7));
                        c0Var2.setBounds(0, getHeight() - org.telegram.messenger.g0.f22558n, getWidth(), getHeight());
                        c0Var2.draw(canvas);
                    }
                }
                return drawChild;
            case 13:
                tg.g2 g2Var = ((tg.i2) this.d).f55759f;
                if (view == g2Var) {
                    canvas.save();
                    canvas.translate(((org.telegram.ui.Components.w5) this.f4662b).e(false, view.getX()), ((org.telegram.ui.Components.w5) this.f4663c).e(false, view.getY()));
                    g2Var.a(canvas);
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
        switch (this.f4661a) {
            case 6:
                float min = Math.min(((te.c) this.f4663c).f55492f, getWidth() - org.telegram.messenger.g0.L(24.0f));
                float width = getWidth() / 2.0f;
                float height = getHeight() / 2.0f;
                RectF rectF = (RectF) this.d;
                float f10 = min / 2.0f;
                rectF.set(width - f10, height - (org.telegram.messenger.g0.L(38.0f) / 2.0f), width + f10, (org.telegram.messenger.g0.L(38.0f) / 2.0f) + height);
                int L = org.telegram.messenger.g0.L(6.0f);
                fh.g gVar = (fh.g) this.f4662b;
                gVar.setBounds(((int) rectF.left) - L, ((int) rectF.top) - L, ((int) rectF.right) + L, ((int) rectF.bottom) + L);
                gVar.draw(canvas);
                return;
            case 7:
                super.onDraw(canvas);
                Paint paint = (Paint) this.f4663c;
                paint.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28073p7, false));
                canvas.save();
                TextPaint textPaint = (TextPaint) this.d;
                canvas.translate((getMeasuredWidth() - textPaint.measureText("500")) - org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.N(7.0f));
                RectF rectF2 = (RectF) this.f4662b;
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
        switch (this.f4661a) {
            case 12:
                super.onMeasure(i7, i10);
                Path path = (Path) this.f4662b;
                path.rewind();
                RectF rectF = (RectF) this.f4663c;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                path.addRoundRect(rectF, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), Path.Direction.CW);
                tg.g2 g2Var = ((tg.i2) this.d).f55759f;
                if (g2Var != null) {
                    g2Var.setMaxWidth(getMeasuredWidth() - org.telegram.messenger.g0.L(32.0f));
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
        switch (this.f4661a) {
            case 10:
                if (((l11) this.d).f35488f != drawable && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public s1(Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z9) {
        super(context);
        this.f4661a = 5;
        org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(context);
        this.f4663c = l9Var;
        l9Var.setRoundRadius(org.telegram.messenger.g0.L(23.0f));
        addView(l9Var, c8.ha.d(46, 46.0f, 19, 21.0f, 6.0f, 0.0f, 6.0f));
        if (z9) {
            addView(new ji.a(context, f6Var), c8.ha.b(22.66f, 22.66f, 83, 48.66f, 0.0f, 0.0f, 3.6599998f));
        }
        TextView textView = new TextView(context);
        this.f4662b = textView;
        org.telegram.messenger.camera.q.m(textView, 1, 16.0f);
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f27960j5, f6Var);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        addView(textView, c8.ha.d(-1, -2.0f, 51, 80.0f, 7.0f, 0.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.f28262z6, f6Var);
        textView2.setSingleLine(true);
        textView2.setEllipsize(truncateAt);
        addView(textView2, c8.ha.d(-1, -2.0f, 51, 80.0f, 30.33f, 0.0f, 0.0f));
    }

    public s1(fi.t5 t5Var, Context context) {
        super(context);
        this.f4661a = 3;
        this.d = t5Var;
        this.f4662b = new RectF();
        this.f4663c = new Paint(1);
    }

    public s1(Context context, Paint paint, TextPaint textPaint) {
        super(context);
        this.f4661a = 7;
        this.f4663c = paint;
        this.d = textPaint;
        this.f4662b = new RectF();
    }

    public s1(tg.i2 i2Var, Context context, int i7) {
        super(context);
        this.f4661a = i7;
        switch (i7) {
            case 13:
                this.d = i2Var;
                super(context);
                xq xqVar = xq.h;
                this.f4662b = new org.telegram.ui.Components.w5(this, 0L, 350L, xqVar);
                this.f4663c = new org.telegram.ui.Components.w5(this, 0L, 350L, xqVar);
                return;
            default:
                this.d = i2Var;
                this.f4662b = new Path();
                this.f4663c = new RectF();
                return;
        }
    }

    public s1(ii.p pVar, Context context) {
        super(context);
        this.f4661a = 4;
        this.d = pVar;
        this.f4662b = new bg.c0(2);
        this.f4663c = new bg.c0(8);
    }

    public s1(di.w5 w5Var, Context context) {
        super(context);
        this.f4661a = 2;
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.Ci, null, PorterDuff.Mode.MULTIPLY);
        addView(imageView, c8.ha.d(28, 28.0f, 0, 25.0f, 12.0f, 16.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f4662b = textView;
        textView.setTypeface(org.telegram.messenger.g0.o());
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.G6, w5Var.I0);
        textView.setTextSize(1, 14.0f);
        addView(textView, c8.ha.d(-1, -2.0f, 0, 68.0f, 8.0f, 16.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.f4663c = textView2;
        org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.f28244y6, w5Var.I0);
        textView2.setTextSize(1, 14.0f);
        addView(textView2, c8.ha.d(-1, -2.0f, 0, 68.0f, 28.0f, 16.0f, 8.0f));
    }

    @Override
    public void F(float f10, int i7) {
    }

    public s1(org.telegram.ui.Components.t8 t8Var, Activity activity) {
        super(activity);
        this.f4661a = 8;
        this.d = t8Var;
        this.f4662b = new Path();
        this.f4663c = new Paint(1);
    }

    public s1(q70 q70Var, Context context) {
        super(context);
        this.f4661a = 9;
        this.d = q70Var;
        o70 o70Var = new o70(this, context);
        this.f4663c = o70Var;
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 0);
        addView(f10, c8.ha.e(-2, -1, 1));
        TextView textView = new TextView(context);
        this.f4662b = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        f10.addView(o70Var, c8.ha.o(-2, -1));
        f10.addView(textView, c8.ha.r(-2, -2, 16));
        setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
        o70Var.a(false);
    }

    public s1(org.telegram.ui.h8 h8Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.f6 f6Var;
        this.f4661a = 6;
        this.f4663c = new te.c(0, this, xq.h, 350L, 0.0f);
        this.d = new RectF();
        setWillNotDraw(false);
        fh.g c10 = h8Var.getBaseSimpleGlass().f21021c.c(this, null, false);
        f6Var = ((org.telegram.ui.ActionBar.f2) h8Var).resourceProvider;
        c10.p(c8.g0.m(f6Var));
        c10.q(org.telegram.messenger.g0.L(6.0f));
        c10.r(org.telegram.messenger.g0.L(19.0f));
        this.f4662b = c10;
    }

    public s1(w40 w40Var, Context context) {
        super(context);
        this.f4661a = 11;
        this.d = w40Var;
        this.f4662b = new RectF();
        this.f4663c = new Paint(1);
    }

    public s1(l11 l11Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f4661a = 10;
        this.d = l11Var;
        Paint paint = new Paint(1);
        this.f4662b = paint;
        this.f4663c = new org.telegram.ui.Components.b6(this, f6Var);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        l11Var.f35488f.setCallback(this);
    }

    public s1(yc ycVar, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f4661a = 1;
        this.d = ycVar;
        this.f4663c = f6Var;
        this.f4662b = new Paint(1);
    }
}
