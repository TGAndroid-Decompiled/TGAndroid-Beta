package defpackage;

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
import org.telegram.ui.ActionBar.d;
public final class ec0 extends FrameLayout implements g94 {
    public final byte a;
    public Object b;
    public Object c;
    public Object d;

    public ec0(ylb ylbVar, Context context, boolean z) {
        super(context);
        this.a = (byte) 2;
        bf0 bf0Var = new bf0(context);
        this.b = bf0Var;
        bf0Var.setRoundRadius(gm.L(23.0f));
        addView(bf0Var, qoe.d(46, 46.0f, 19, 21.0f, 6.0f, 0.0f, 6.0f));
        if (z) {
            addView(new do2(context, ylbVar), qoe.b(22.66f, 22.66f, 83, 48.66f, 0.0f, 0.0f, 3.6599998f));
        }
        TextView textView = new TextView(context);
        this.c = textView;
        wi8.v(textView, 1, 16.0f);
        anb.X(textView, cmb.i5, ylbVar);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        addView(textView, qoe.d(-1, -2.0f, 51, 80.0f, 7.0f, 0.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 14.0f);
        anb.X(textView2, cmb.y6, ylbVar);
        textView2.setSingleLine(true);
        textView2.setEllipsize(truncateAt);
        addView(textView2, qoe.d(-1, -2.0f, 51, 80.0f, 30.33f, 0.0f, 0.0f));
    }

    @Override
    public final void D(int i, float f, float f2, h94 h94Var) {
        invalidate();
    }

    public final void a(TextView textView, boolean z) {
        float f;
        h94 h94Var = (h94) this.c;
        CharSequence text = textView.getText();
        if (text != null) {
            f = textView.getPaint().measureText(text, 0, text.length());
        } else {
            f = 0.0f;
        }
        float L = f + gm.L(32.0f);
        if (z && h94Var.f > 0.0f) {
            h94Var.a(L);
            return;
        }
        h94Var.c(L);
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i;
        boolean z;
        float f;
        float f2;
        float f3;
        float f4;
        int i2;
        float f5;
        Canvas canvas2;
        float f6;
        float f7;
        switch (this.a) {
            case 0:
                Paint paint = (Paint) this.c;
                cmb.m(paint);
                paint.setColor(cmb.v0(cmb.F8, ((mc0) this.d).getResourceProvider()));
                paint.setAlpha((int) (getAlpha() * 255.0f));
                RectF rectF = gm.P;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                Path path = (Path) this.b;
                path.rewind();
                path.addRoundRect(rectF, gm.L(12.0f), gm.L(12.0f), Path.Direction.CW);
                canvas.drawPath(path, paint);
                super.dispatchDraw(canvas);
                return;
            case 4:
                Paint paint2 = (Paint) this.c;
                oc5 oc5Var = (oc5) this.d;
                paint2.setColor(oc5Var.getThemedColor(cmb.c6));
                canvas.save();
                canvas.translate(0.0f, -getTop());
                RectF rectF2 = (RectF) this.b;
                rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                rectF2.offset(0.0f, getTop());
                oc5Var.n0(canvas, rectF2, paint2);
                canvas.restore();
                super.dispatchDraw(canvas);
                return;
            case 6:
                RectF rectF3 = (RectF) this.b;
                super.dispatchDraw(canvas);
                Paint paint3 = (Paint) this.c;
                paint3.setColor(-1);
                zk8 zk8Var = (zk8) this.d;
                float width = ((getWidth() - (gm.N(5.0f) * 2.0f)) - gm.N((zk8Var.b - 1) << 1)) / zk8Var.b;
                float N = gm.N(5.0f);
                for (int i3 = 0; i3 < zk8Var.b; i3++) {
                    rectF3.set(N, gm.N(8.0f), N + width, gm.N(10.0f));
                    if (i3 < zk8Var.b - 1) {
                        i = 255;
                    } else {
                        i = 133;
                    }
                    paint3.setAlpha(i);
                    canvas.drawRoundRect(rectF3, gm.N(1.0f), gm.N(1.0f), paint3);
                    N += gm.N(2.0f) + width;
                }
                return;
            case 13:
                lzb lzbVar = (lzb) this.d;
                ho hoVar = lzbVar.f;
                float i4 = hoVar.i();
                int i5 = (i4 > 0.0f ? 1 : (i4 == 0.0f ? 0 : -1));
                if (i5 > 0) {
                    z = true;
                } else {
                    z = false;
                }
                float R1 = gm.R1(0.5f, 1.0f, i4) * lzbVar.M;
                float L = gm.L(10.0f);
                float L2 = gm.L(8.33f);
                float width2 = (getWidth() / 2.0f) + gm.L(12.0f);
                float L3 = gm.L(12.0f);
                float max = Math.max(L2 + L2, hoVar.c() + gm.L(10.0f));
                if (z) {
                    f2 = L;
                    f = R1;
                    f3 = width2;
                    f5 = 255.0f;
                    canvas2 = canvas;
                    f4 = 2.0f;
                    f6 = L2;
                    i2 = i5;
                    f7 = L3;
                    canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                } else {
                    f = R1;
                    f2 = L;
                    f3 = width2;
                    f4 = 2.0f;
                    i2 = i5;
                    f5 = 255.0f;
                    canvas2 = canvas;
                    f6 = L2;
                    f7 = L3;
                }
                super.dispatchDraw(canvas);
                if (z) {
                    RectF rectF4 = gm.P;
                    float f8 = max / f4;
                    rectF4.set((f3 - f8) - gm.L(1.33f), f7 - f2, f8 + f3 + gm.L(1.33f), f7 + f2);
                    gm.e3(rectF4, i4, rectF4.centerX(), rectF4.centerY());
                    float f9 = f2 * i4;
                    canvas2.drawRoundRect(rectF4, f9, f9, (Paint) this.c);
                    canvas2.restore();
                }
                if (i2 > 0) {
                    canvas2.save();
                    canvas2.scale(f, f, f3, f7);
                    RectF rectF5 = gm.P;
                    float f10 = max / f4;
                    rectF5.set(f3 - f10, f7 - f6, f3 + f10, f7 + f6);
                    rn rnVar = (rn) this.b;
                    rnVar.setColor(cmb.p1(i4, rnVar.b.a(cmb.v0(lzbVar.G, rnVar.a), false)));
                    canvas2.drawRoundRect(rectF5, f6, f6, rnVar);
                    hoVar.p(rectF5);
                    hoVar.C = (int) (i4 * f5);
                    hoVar.draw(canvas2);
                    canvas2.restore();
                    return;
                }
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 1:
                if (motionEvent.getAction() == 0 && !((RectF) this.d).contains(motionEvent.getX(), motionEvent.getY())) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.a) {
            case 10:
                canvas.save();
                canvas.clipPath((Path) this.b);
                super.draw(canvas);
                canvas.restore();
                return;
            default:
                super.draw(canvas);
                return;
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        switch (this.a) {
            case 3:
                i15 i15Var = (i15) this.b;
                i15 i15Var2 = (i15) this.c;
                boolean drawChild = super.drawChild(canvas, view, j);
                po2 po2Var = (po2) this.d;
                if (view == po2Var.e) {
                    int i = cmb.Z6;
                    i15Var.b(po2Var.getThemedColor(i));
                    i15Var.setBounds(0, 0, getWidth(), gm.m);
                    i15Var.draw(canvas);
                    float Q0 = gm.Q0(gm.n);
                    if (Q0 > 0.0f) {
                        i15Var2.setAlpha((int) (Q0 * 255.0f));
                        i15Var2.b(po2Var.getThemedColor(i));
                        i15Var2.setBounds(0, getHeight() - gm.n, getWidth(), getHeight());
                        i15Var2.draw(canvas);
                    }
                }
                return drawChild;
            case 8:
                Paint paint = (Paint) this.c;
                if (((ixa) this.d).e > 1) {
                    paint.setColor(cmb.v0(cmb.c6, (ylb) this.b));
                    RectF rectF = gm.P;
                    rectF.set(view.getX(), view.getY(), view.getX() + view.getWidth(), view.getY() + view.getHeight());
                    rectF.inset(-gm.L(1.66f), -gm.L(1.66f));
                    canvas.drawRoundRect(rectF, gm.L(13.0f), gm.L(13.0f), paint);
                }
                return super.drawChild(canvas, view, j);
            case 11:
                l6b l6bVar = ((n6b) this.d).f;
                if (view == l6bVar) {
                    canvas.save();
                    canvas.translate(((ln) this.b).e(false, view.getX()), ((ln) this.c).e(false, view.getY()));
                    l6bVar.a(canvas);
                    canvas.restore();
                    return true;
                }
                return super.drawChild(canvas, view, j);
            default:
                return super.drawChild(canvas, view, j);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.a) {
            case 1:
                float min = Math.min(((h94) this.c).f, getWidth() - gm.L(24.0f));
                float width = getWidth() / 2.0f;
                float height = getHeight() / 2.0f;
                RectF rectF = (RectF) this.d;
                float f = min / 2.0f;
                rectF.set(width - f, height - (gm.L(38.0f) / 2.0f), width + f, (gm.L(38.0f) / 2.0f) + height);
                int L = gm.L(6.0f);
                im0 im0Var = (im0) this.b;
                im0Var.setBounds(((int) rectF.left) - L, ((int) rectF.top) - L, ((int) rectF.right) + L, ((int) rectF.bottom) + L);
                im0Var.draw(canvas);
                return;
            case 12:
                super.onDraw(canvas);
                Paint paint = (Paint) this.c;
                paint.setColor(cmb.w0(null, cmb.o7, false));
                canvas.save();
                TextPaint textPaint = (TextPaint) this.d;
                canvas.translate((getMeasuredWidth() - textPaint.measureText("500")) - gm.L(8.0f), gm.N(7.0f));
                RectF rectF2 = (RectF) this.b;
                rectF2.set(0.0f, 0.0f, textPaint.measureText("500"), textPaint.getTextSize());
                rectF2.inset(-gm.L(6.0f), -gm.L(3.0f));
                float textSize = (textPaint.getTextSize() / 2.0f) + gm.L(3.0f);
                canvas.drawRoundRect(rectF2, textSize, textSize, paint);
                canvas.drawText("500", 0.0f, textPaint.getTextSize() - gm.N(2.0f), textPaint);
                canvas.restore();
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        switch (this.a) {
            case 10:
                super.onMeasure(i, i2);
                Path path = (Path) this.b;
                path.rewind();
                RectF rectF = (RectF) this.c;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                path.addRoundRect(rectF, gm.L(10.0f), gm.L(10.0f), Path.Direction.CW);
                l6b l6bVar = ((n6b) this.d).f;
                if (l6bVar != null) {
                    l6bVar.setMaxWidth(getMeasuredWidth() - gm.L(32.0f));
                    return;
                }
                return;
            default:
                super.onMeasure(i, i2);
                return;
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        switch (this.a) {
            case 13:
                if (((lzb) this.d).f != drawable && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    @Override
    public final void V(float f, int i) {
    }

    public ec0(Context context) {
        super(context);
        this.a = (byte) 7;
    }

    public ec0(zk8 zk8Var, Context context) {
        super(context);
        this.a = (byte) 6;
        this.d = zk8Var;
        this.b = new RectF();
        this.c = new Paint(1);
    }

    public ec0(Context context, Paint paint, TextPaint textPaint) {
        super(context);
        this.a = (byte) 12;
        this.c = paint;
        this.d = textPaint;
        this.b = new RectF();
    }

    public ec0(n6b n6bVar, Context context, byte b) {
        super(context);
        this.a = b;
        switch (b) {
            case 11:
                this.d = n6bVar;
                super(context);
                d53 d53Var = d53.h;
                this.b = new ln(this, 0L, 350L, d53Var);
                this.c = new ln(this, 0L, 350L, d53Var);
                return;
            default:
                this.d = n6bVar;
                this.b = new Path();
                this.c = new RectF();
                return;
        }
    }

    public ec0(po2 po2Var, Context context) {
        super(context);
        this.a = (byte) 3;
        this.d = po2Var;
        this.b = new i15(2);
        this.c = new i15(8);
    }

    public ec0(h0b h0bVar, Context context) {
        super(context);
        this.a = (byte) 9;
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        anb.s(imageView, cmb.Ei, null, PorterDuff.Mode.MULTIPLY);
        addView(imageView, qoe.d(28, 28.0f, 0, 25.0f, 12.0f, 16.0f, 0.0f));
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTypeface(gm.o());
        anb.X(textView, cmb.F6, h0bVar.J0);
        textView.setTextSize(1, 14.0f);
        addView(textView, qoe.d(-1, -2.0f, 0, 68.0f, 8.0f, 16.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.c = textView2;
        anb.X(textView2, cmb.x6, h0bVar.J0);
        textView2.setTextSize(1, 14.0f);
        addView(textView2, qoe.d(-1, -2.0f, 0, 68.0f, 28.0f, 16.0f, 8.0f));
    }

    public ec0(mc0 mc0Var, Activity activity) {
        super(activity);
        this.a = (byte) 0;
        this.d = mc0Var;
        this.b = new Path();
        this.c = new Paint(1);
    }

    public ec0(f56 f56Var, Context context) {
        super(context);
        this.a = (byte) 5;
        this.d = f56Var;
        d56 d56Var = new d56(this, context);
        this.c = d56Var;
        LinearLayout i = hg9.i(context, 0);
        addView(i, qoe.e(-2, -1, 1));
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(gm.o());
        i.addView(d56Var, qoe.o(-2, -1));
        i.addView(textView, qoe.r(-2, -2, 16));
        setPadding(0, gm.L(8.0f), 0, gm.L(8.0f));
        d56Var.a(false);
    }

    public ec0(k91 k91Var, Context context) {
        super(context);
        ylb ylbVar;
        this.a = (byte) 1;
        this.c = new h94(0, this, d53.h, 350L, 0.0f);
        this.d = new RectF();
        setWillNotDraw(false);
        im0 c = k91Var.getBaseSimpleGlass().c.c(this, null, false);
        ylbVar = ((d) k91Var).resourceProvider;
        c.p(qqd.l(ylbVar));
        c.q(gm.L(6.0f));
        c.r(gm.L(19.0f));
        this.b = c;
    }

    public ec0(oc5 oc5Var, Context context) {
        super(context);
        this.a = (byte) 4;
        this.d = oc5Var;
        this.b = new RectF();
        this.c = new Paint(1);
    }

    public ec0(lzb lzbVar, Context context, ylb ylbVar) {
        super(context);
        this.a = (byte) 13;
        this.d = lzbVar;
        Paint paint = new Paint(1);
        this.c = paint;
        this.b = new rn(this, ylbVar);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        lzbVar.f.setCallback(this);
    }

    public ec0(ixa ixaVar, Context context, ylb ylbVar) {
        super(context);
        this.a = (byte) 8;
        this.d = ixaVar;
        this.b = ylbVar;
        this.c = new Paint(1);
    }
}
