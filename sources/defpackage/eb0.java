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
public final class eb0 extends FrameLayout implements x74 {
    public final byte a;
    public Object b;
    public Object c;
    public Object d;

    public eb0(wjb wjbVar, Context context, boolean z) {
        super(context);
        this.a = (byte) 2;
        be0 be0Var = new be0(context);
        this.b = be0Var;
        be0Var.setRoundRadius(gl.L(23.0f));
        addView(be0Var, nme.d(46, 46.0f, 19, 21.0f, 6.0f, 0.0f, 6.0f));
        if (z) {
            addView(new rm2(context, wjbVar), nme.b(22.66f, 22.66f, 83, 48.66f, 0.0f, 0.0f, 3.6599998f));
        }
        TextView textView = new TextView(context);
        this.c = textView;
        ug8.v(textView, 1, 16.0f);
        zkb.X(textView, bkb.i5, wjbVar);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        addView(textView, nme.d(-1, -2.0f, 51, 80.0f, 7.0f, 0.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 14.0f);
        zkb.X(textView2, bkb.y6, wjbVar);
        textView2.setSingleLine(true);
        textView2.setEllipsize(truncateAt);
        addView(textView2, nme.d(-1, -2.0f, 51, 80.0f, 30.33f, 0.0f, 0.0f));
    }

    public final void a(TextView textView, boolean z) {
        float f;
        y74 y74Var = (y74) this.c;
        CharSequence text = textView.getText();
        if (text != null) {
            f = textView.getPaint().measureText(text, 0, text.length());
        } else {
            f = 0.0f;
        }
        float L = f + gl.L(32.0f);
        if (z && y74Var.f > 0.0f) {
            y74Var.a(L);
            return;
        }
        y74Var.c(L);
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
                bkb.m(paint);
                paint.setColor(bkb.v0(bkb.F8, ((mb0) this.d).getResourceProvider()));
                paint.setAlpha((int) (getAlpha() * 255.0f));
                RectF rectF = gl.P;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                Path path = (Path) this.b;
                path.rewind();
                path.addRoundRect(rectF, gl.L(12.0f), gl.L(12.0f), Path.Direction.CW);
                canvas.drawPath(path, paint);
                super.dispatchDraw(canvas);
                return;
            case 4:
                Paint paint2 = (Paint) this.c;
                qa5 qa5Var = (qa5) this.d;
                paint2.setColor(qa5Var.getThemedColor(bkb.c6));
                canvas.save();
                canvas.translate(0.0f, -getTop());
                RectF rectF2 = (RectF) this.b;
                rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                rectF2.offset(0.0f, getTop());
                qa5Var.m0(canvas, rectF2, paint2);
                canvas.restore();
                super.dispatchDraw(canvas);
                return;
            case 6:
                RectF rectF3 = (RectF) this.b;
                super.dispatchDraw(canvas);
                Paint paint3 = (Paint) this.c;
                paint3.setColor(-1);
                wi8 wi8Var = (wi8) this.d;
                float width = ((getWidth() - (gl.N(5.0f) * 2.0f)) - gl.N((wi8Var.b - 1) << 1)) / wi8Var.b;
                float N = gl.N(5.0f);
                for (int i3 = 0; i3 < wi8Var.b; i3++) {
                    rectF3.set(N, gl.N(8.0f), N + width, gl.N(10.0f));
                    if (i3 < wi8Var.b - 1) {
                        i = 255;
                    } else {
                        i = 133;
                    }
                    paint3.setAlpha(i);
                    canvas.drawRoundRect(rectF3, gl.N(1.0f), gl.N(1.0f), paint3);
                    N += gl.N(2.0f) + width;
                }
                return;
            case 13:
                jxb jxbVar = (jxb) this.d;
                gn gnVar = jxbVar.f;
                float i4 = gnVar.i();
                int i5 = (i4 > 0.0f ? 1 : (i4 == 0.0f ? 0 : -1));
                if (i5 > 0) {
                    z = true;
                } else {
                    z = false;
                }
                float R1 = gl.R1(0.5f, 1.0f, i4) * jxbVar.M;
                float L = gl.L(10.0f);
                float L2 = gl.L(8.33f);
                float width2 = (getWidth() / 2.0f) + gl.L(12.0f);
                float L3 = gl.L(12.0f);
                float max = Math.max(L2 + L2, gnVar.c() + gl.L(10.0f));
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
                    RectF rectF4 = gl.P;
                    float f8 = max / f4;
                    rectF4.set((f3 - f8) - gl.L(1.33f), f7 - f2, f8 + f3 + gl.L(1.33f), f7 + f2);
                    gl.f3(rectF4, i4, rectF4.centerX(), rectF4.centerY());
                    float f9 = f2 * i4;
                    canvas2.drawRoundRect(rectF4, f9, f9, (Paint) this.c);
                    canvas2.restore();
                }
                if (i2 > 0) {
                    canvas2.save();
                    canvas2.scale(f, f, f3, f7);
                    RectF rectF5 = gl.P;
                    float f10 = max / f4;
                    rectF5.set(f3 - f10, f7 - f6, f3 + f10, f7 + f6);
                    rm rmVar = (rm) this.b;
                    rmVar.setColor(bkb.p1(i4, rmVar.b.a(bkb.v0(jxbVar.G, rmVar.a), false)));
                    canvas2.drawRoundRect(rectF5, f6, f6, rmVar);
                    gnVar.p(rectF5);
                    gnVar.C = (int) (i4 * f5);
                    gnVar.draw(canvas2);
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
                jz4 jz4Var = (jz4) this.b;
                jz4 jz4Var2 = (jz4) this.c;
                boolean drawChild = super.drawChild(canvas, view, j);
                en2 en2Var = (en2) this.d;
                if (view == en2Var.e) {
                    int i = bkb.Z6;
                    jz4Var.b(en2Var.getThemedColor(i));
                    jz4Var.setBounds(0, 0, getWidth(), gl.m);
                    jz4Var.draw(canvas);
                    float Q0 = gl.Q0(gl.n);
                    if (Q0 > 0.0f) {
                        jz4Var2.setAlpha((int) (Q0 * 255.0f));
                        jz4Var2.b(en2Var.getThemedColor(i));
                        jz4Var2.setBounds(0, getHeight() - gl.n, getWidth(), getHeight());
                        jz4Var2.draw(canvas);
                    }
                }
                return drawChild;
            case 8:
                Paint paint = (Paint) this.c;
                if (((eva) this.d).e > 1) {
                    paint.setColor(bkb.v0(bkb.c6, (wjb) this.b));
                    RectF rectF = gl.P;
                    rectF.set(view.getX(), view.getY(), view.getX() + view.getWidth(), view.getY() + view.getHeight());
                    rectF.inset(-gl.L(1.66f), -gl.L(1.66f));
                    canvas.drawRoundRect(rectF, gl.L(13.0f), gl.L(13.0f), paint);
                }
                return super.drawChild(canvas, view, j);
            case 11:
                k4b k4bVar = ((m4b) this.d).f;
                if (view == k4bVar) {
                    canvas.save();
                    canvas.translate(((lm) this.b).e(false, view.getX()), ((lm) this.c).e(false, view.getY()));
                    k4bVar.a(canvas);
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
                float min = Math.min(((y74) this.c).f, getWidth() - gl.L(24.0f));
                float width = getWidth() / 2.0f;
                float height = getHeight() / 2.0f;
                RectF rectF = (RectF) this.d;
                float f = min / 2.0f;
                rectF.set(width - f, height - (gl.L(38.0f) / 2.0f), width + f, (gl.L(38.0f) / 2.0f) + height);
                int L = gl.L(6.0f);
                il0 il0Var = (il0) this.b;
                il0Var.setBounds(((int) rectF.left) - L, ((int) rectF.top) - L, ((int) rectF.right) + L, ((int) rectF.bottom) + L);
                il0Var.draw(canvas);
                return;
            case 12:
                super.onDraw(canvas);
                Paint paint = (Paint) this.c;
                paint.setColor(bkb.w0(null, bkb.o7, false));
                canvas.save();
                TextPaint textPaint = (TextPaint) this.d;
                canvas.translate((getMeasuredWidth() - textPaint.measureText("500")) - gl.L(8.0f), gl.N(7.0f));
                RectF rectF2 = (RectF) this.b;
                rectF2.set(0.0f, 0.0f, textPaint.measureText("500"), textPaint.getTextSize());
                rectF2.inset(-gl.L(6.0f), -gl.L(3.0f));
                float textSize = (textPaint.getTextSize() / 2.0f) + gl.L(3.0f);
                canvas.drawRoundRect(rectF2, textSize, textSize, paint);
                canvas.drawText("500", 0.0f, textPaint.getTextSize() - gl.N(2.0f), textPaint);
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
                path.addRoundRect(rectF, gl.L(10.0f), gl.L(10.0f), Path.Direction.CW);
                k4b k4bVar = ((m4b) this.d).f;
                if (k4bVar != null) {
                    k4bVar.setMaxWidth(getMeasuredWidth() - gl.L(32.0f));
                    return;
                }
                return;
            default:
                super.onMeasure(i, i2);
                return;
        }
    }

    @Override
    public final void p(int i, float f, float f2, y74 y74Var) {
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        switch (this.a) {
            case 13:
                if (((jxb) this.d).f != drawable && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    @Override
    public final void D(float f, int i) {
    }

    public eb0(Context context) {
        super(context);
        this.a = (byte) 7;
    }

    public eb0(wi8 wi8Var, Context context) {
        super(context);
        this.a = (byte) 6;
        this.d = wi8Var;
        this.b = new RectF();
        this.c = new Paint(1);
    }

    public eb0(Context context, Paint paint, TextPaint textPaint) {
        super(context);
        this.a = (byte) 12;
        this.c = paint;
        this.d = textPaint;
        this.b = new RectF();
    }

    public eb0(m4b m4bVar, Context context, byte b) {
        super(context);
        this.a = b;
        switch (b) {
            case 11:
                this.d = m4bVar;
                super(context);
                s33 s33Var = s33.h;
                this.b = new lm(this, 0L, 350L, s33Var);
                this.c = new lm(this, 0L, 350L, s33Var);
                return;
            default:
                this.d = m4bVar;
                this.b = new Path();
                this.c = new RectF();
                return;
        }
    }

    public eb0(en2 en2Var, Context context) {
        super(context);
        this.a = (byte) 3;
        this.d = en2Var;
        this.b = new jz4(2);
        this.c = new jz4(8);
    }

    public eb0(eya eyaVar, Context context) {
        super(context);
        this.a = (byte) 9;
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        zkb.s(imageView, bkb.Ei, null, PorterDuff.Mode.MULTIPLY);
        addView(imageView, nme.d(28, 28.0f, 0, 25.0f, 12.0f, 16.0f, 0.0f));
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTypeface(gl.o());
        zkb.X(textView, bkb.F6, eyaVar.J0);
        textView.setTextSize(1, 14.0f);
        addView(textView, nme.d(-1, -2.0f, 0, 68.0f, 8.0f, 16.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.c = textView2;
        zkb.X(textView2, bkb.x6, eyaVar.J0);
        textView2.setTextSize(1, 14.0f);
        addView(textView2, nme.d(-1, -2.0f, 0, 68.0f, 28.0f, 16.0f, 8.0f));
    }

    public eb0(mb0 mb0Var, Activity activity) {
        super(activity);
        this.a = (byte) 0;
        this.d = mb0Var;
        this.b = new Path();
        this.c = new Paint(1);
    }

    public eb0(f36 f36Var, Context context) {
        super(context);
        this.a = (byte) 5;
        this.d = f36Var;
        d36 d36Var = new d36(this, context);
        this.c = d36Var;
        LinearLayout j = de9.j(context, 0);
        addView(j, nme.e(-2, -1, 1));
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(gl.o());
        j.addView(d36Var, nme.o(-2, -1));
        j.addView(textView, nme.r(-2, -2, 16));
        setPadding(0, gl.L(8.0f), 0, gl.L(8.0f));
        d36Var.a(false);
    }

    public eb0(b81 b81Var, Context context) {
        super(context);
        wjb wjbVar;
        this.a = (byte) 1;
        this.c = new y74(0, this, s33.h, 350L, 0.0f);
        this.d = new RectF();
        setWillNotDraw(false);
        il0 c = b81Var.getBaseSimpleGlass().c.c(this, null, false);
        wjbVar = ((d) b81Var).resourceProvider;
        c.p(nod.l(wjbVar));
        c.q(gl.L(6.0f));
        c.r(gl.L(19.0f));
        this.b = c;
    }

    public eb0(qa5 qa5Var, Context context) {
        super(context);
        this.a = (byte) 4;
        this.d = qa5Var;
        this.b = new RectF();
        this.c = new Paint(1);
    }

    public eb0(jxb jxbVar, Context context, wjb wjbVar) {
        super(context);
        this.a = (byte) 13;
        this.d = jxbVar;
        Paint paint = new Paint(1);
        this.c = paint;
        this.b = new rm(this, wjbVar);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        jxbVar.f.setCallback(this);
    }

    public eb0(eva evaVar, Context context, wjb wjbVar) {
        super(context);
        this.a = (byte) 8;
        this.d = evaVar;
        this.b = wjbVar;
        this.c = new Paint(1);
    }
}
