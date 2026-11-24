package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.Layout;
import android.view.View;
import android.widget.TextView;
public final class t8 extends TextView {
    public final byte a;
    public Object b;
    public final Object c;

    public t8(Activity activity, lfc lfcVar) {
        super(activity);
        this.a = (byte) 7;
        this.b = new RectF();
        this.c = lfcVar;
        lfcVar.a(this);
        setText(k96.M0(2131743061, null));
        setContentDescription(k96.M0(2131743061, null));
        setTextColor(-1);
        setTypeface(gl.o());
        setPadding(gl.L(14.0f), gl.L(4.0f), gl.L(14.0f), gl.L(4.0f));
    }

    public final void a() {
        r86 r86Var = (r86) this.c;
        b46 b46Var = (b46) this.b;
        if (b46Var != null && r86Var != null) {
            b46Var.rewind();
            if (getLayout() != null && getLayout().getText() != null) {
                b46Var.e(getLayout(), 0, getPaddingLeft(), getPaddingTop());
                getLayout().getSelectionPath(0, getLayout().getText().length(), b46Var);
            }
            r86Var.k();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 1:
                Paint paint = (Paint) this.b;
                int L = gl.L(1.0f) + (getHeight() / 2);
                int max = Math.max(1, gl.L(0.66f));
                Layout layout = getLayout();
                if (layout != null) {
                    paint.setColor(bkb.p1(0.45f, bkb.v0(bkb.x6, ((gr0) obj).a0.c)));
                    float f = L;
                    float f2 = max / 2.0f;
                    float f3 = f - f2;
                    float f4 = f + f2;
                    canvas.drawRect(0.0f, f3, (getWidth() - (layout.getLineWidth(0) + gl.L(16.0f))) / 2.0f, f4, paint);
                    canvas.drawRect(((layout.getLineWidth(0) + getWidth()) + gl.L(16.0f)) / 2.0f, f3, getWidth(), f4, paint);
                }
                super.dispatchDraw(canvas);
                return;
            case 2:
                Paint paint2 = (Paint) this.b;
                int L2 = gl.L(1.0f) + (getHeight() / 2);
                int max2 = Math.max(1, gl.L(0.66f));
                Layout layout2 = getLayout();
                if (layout2 != null) {
                    paint2.setColor(bkb.p1(0.45f, bkb.v0(bkb.x6, (wjb) obj)));
                    float f5 = L2;
                    float f6 = max2 / 2.0f;
                    float f7 = f5 - f6;
                    float f8 = f5 + f6;
                    canvas.drawRect(0.0f, f7, (getWidth() - (layout2.getLineWidth(0) + gl.L(16.0f))) / 2.0f, f8, paint2);
                    canvas.drawRect(((layout2.getLineWidth(0) + getWidth()) + gl.L(16.0f)) / 2.0f, f7, getWidth(), f8, paint2);
                }
                super.dispatchDraw(canvas);
                return;
            case 9:
                Paint paint3 = (Paint) this.b;
                int i = bkb.y6;
                h26 h26Var = ((f26) obj).e;
                int i2 = h26.R2;
                paint3.setColor(bkb.p1(0.8f, bkb.v0(i, h26Var.J0)));
                paint3.setStyle(Paint.Style.STROKE);
                paint3.setStrokeWidth(1.0f);
                float height = getHeight() / 2.0f;
                Layout layout3 = getLayout();
                int i3 = 0;
                for (int i4 = 0; i4 < layout3.getLineCount(); i4++) {
                    i3 = Math.max(i3, (int) layout3.getLineWidth(i4));
                }
                float f9 = i3 / 2.0f;
                canvas.drawLine(0.0f, height, ((getWidth() / 2.0f) - f9) - gl.L(8.0f), height, paint3);
                canvas.drawLine((getWidth() / 2.0f) + f9 + gl.L(8.0f), height, getWidth(), height, paint3);
                super.dispatchDraw(canvas);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                ((u8) obj).b.draw(canvas);
                super.draw(canvas);
                return;
            case 8:
                ((wp5) obj).h.draw(canvas);
                super.draw(canvas);
                return;
            default:
                super.draw(canvas);
                return;
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        switch (this.a) {
            case 12:
                super.onDetachedFromWindow();
                ((r86) this.c).b = -1L;
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i;
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                super.onDraw(canvas);
                if (((u8) obj).x) {
                    RectF rectF = gl.P;
                    rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    ((wd1) this.b).a(getMeasuredHeight() / 2.0f, canvas, rectF, null);
                    invalidate();
                    return;
                }
                return;
            case 1:
            case 2:
            case 9:
            default:
                super.onDraw(canvas);
                return;
            case 3:
                Paint paint = (Paint) this.b;
                paint.setColor(bkb.v0(bkb.Ei, ((x02) obj).J0));
                canvas.drawRoundRect(0.0f, (getHeight() / 2.0f) - gl.L(14.0f), getWidth(), (getHeight() / 2.0f) + gl.L(14.0f), gl.L(14.0f), gl.L(14.0f), paint);
                super.onDraw(canvas);
                return;
            case 4:
                if (((bra) this.b) != null) {
                    canvas.save();
                    canvas.clipPath((Path) obj);
                    ((bra) this.b).d(canvas);
                    canvas.restore();
                    invalidate();
                }
                super.onDraw(canvas);
                return;
            case 5:
                Paint paint2 = (Paint) this.b;
                paint2.setColor(((en2) obj).getThemedColor(bkb.Ei));
                canvas.drawRoundRect(0.0f, (getHeight() / 2.0f) - gl.L(14.0f), getWidth(), gl.L(14.0f) + (getHeight() / 2.0f), gl.L(14.0f), gl.L(14.0f), paint2);
                super.onDraw(canvas);
                return;
            case 6:
                Paint paint3 = (Paint) this.b;
                paint3.setColor(bkb.v0(bkb.Ei, ((xx2) obj).J0));
                canvas.drawRoundRect(0.0f, (getHeight() / 2.0f) - gl.L(14.0f), getWidth(), (getHeight() / 2.0f) + gl.L(14.0f), gl.L(14.0f), gl.L(14.0f), paint3);
                super.onDraw(canvas);
                return;
            case 7:
                RectF rectF2 = (RectF) this.b;
                rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                lfc lfcVar = (lfc) obj;
                lfcVar.d(((View) getParent()).getX() + getX(), ((View) getParent()).getY() + getY());
                canvas.drawRoundRect(rectF2, gl.L(16.0f), gl.L(16.0f), lfcVar.b());
                super.onDraw(canvas);
                return;
            case 8:
                super.onDraw(canvas);
                RectF rectF3 = gl.P;
                rectF3.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                ((wd1) this.b).a(getMeasuredHeight() / 2.0f, canvas, rectF3, null);
                invalidate();
                return;
            case 10:
                RectF rectF4 = gl.P;
                rectF4.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                Paint[] paintArr = (Paint[]) this.b;
                mk8 mk8Var = (mk8) obj;
                paintArr[mk8Var.y].setAlpha(255);
                canvas.drawRoundRect(rectF4, gl.L(6.0f), gl.L(6.0f), paintArr[mk8Var.y]);
                float f = mk8Var.x;
                if (f > 0.0f && (i = mk8Var.y + 1) < paintArr.length) {
                    paintArr[i].setAlpha((int) (f * 255.0f));
                    canvas.drawRoundRect(rectF4, gl.L(6.0f), gl.L(6.0f), paintArr[mk8Var.y + 1]);
                }
                super.onDraw(canvas);
                return;
            case 11:
                Paint paint4 = (Paint) this.b;
                lk0 lk0Var = ((wi9) obj).y;
                if (lk0Var != null && lk0Var.c > 0 && lk0Var.d == 0 && !lk0Var.e) {
                    paint4.setColor(getCurrentTextColor());
                    canvas.drawCircle(getWidth() / 2.0f, getBaseline() - (getTextSize() * 0.35f), gl.N(4.3f) / 2.0f, paint4);
                    return;
                }
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        switch (this.a) {
            case 4:
                super.onLayout(z, i, i2, i3, i4);
                bra braVar = new bra(10);
                this.b = braVar;
                braVar.N = 100;
                braVar.I = false;
                braVar.L = true;
                braVar.G = false;
                braVar.J = true;
                braVar.H = true;
                braVar.r = (byte) 1;
                braVar.w = 0.98f;
                braVar.v = 0.98f;
                braVar.u = 0.98f;
                braVar.g = false;
                braVar.o = 0.0f;
                braVar.x = (short) 750;
                braVar.y = (short) 750;
                braVar.c();
                RectF rectF = gl.P;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                ((bra) this.b).a.set(rectF);
                ((bra) this.b).b.set(rectF);
                ((bra) this.b).f();
                Path path = (Path) this.c;
                path.reset();
                path.addRoundRect(rectF, getHeight() / 2.0f, getHeight() / 2.0f, Path.Direction.CW);
                return;
            default:
                super.onLayout(z, i, i2, i3, i4);
                return;
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        switch (this.a) {
            case 8:
                if (View.MeasureSpec.getSize(i) > gl.L(260.0f)) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(gl.L(320.0f), 1073741824), i2);
                    return;
                } else {
                    super.onMeasure(i, i2);
                    return;
                }
            case 12:
                super.onMeasure(i, i2);
                a();
                return;
            default:
                super.onMeasure(i, i2);
                return;
        }
    }

    @Override
    public final void onSizeChanged(int r18, int r19, int r20, int r21) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t8.onSizeChanged(int, int, int, int):void");
    }

    @Override
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        switch (this.a) {
            case 12:
                super.setText(charSequence, bufferType);
                a();
                return;
            default:
                super.setText(charSequence, bufferType);
                return;
        }
    }

    @Override
    public final void setTextColor(int i) {
        switch (this.a) {
            case 12:
                super.setTextColor(bkb.p1(0.2f, i));
                ((r86) this.c).g(bkb.p1(0.03f, i), bkb.p1(0.175f, i), bkb.p1(0.2f, i), bkb.p1(0.45f, i));
                return;
            default:
                super.setTextColor(i);
                return;
        }
    }

    public t8(mk8 mk8Var, Context context) {
        super(context);
        this.a = (byte) 10;
        this.c = mk8Var;
        this.b = new Paint[mk8Var.f.length];
        int i = 0;
        while (true) {
            Paint[] paintArr = (Paint[]) this.b;
            if (i >= paintArr.length) {
                return;
            }
            paintArr[i] = new Paint(1);
            i++;
        }
    }

    public t8(wi9 wi9Var, Context context) {
        super(context);
        this.a = (byte) 11;
        this.c = wi9Var;
        this.b = new Paint(1);
    }

    public t8(Context context, byte b) {
        super(context);
        this.a = b;
        switch (b) {
            case 12:
                super(context);
                b46 b46Var = new b46(0);
                this.b = b46Var;
                r86 r86Var = new r86();
                this.c = r86Var;
                r86Var.y = b46Var;
                r86Var.u = 0.65f;
                r86Var.j(4.0f);
                setBackground(r86Var);
                return;
            default:
                this.c = new Path();
                return;
        }
    }

    public t8(xx2 xx2Var, Context context) {
        super(context);
        this.a = (byte) 6;
        this.c = xx2Var;
        this.b = new Paint(1);
    }

    public t8(en2 en2Var, Context context) {
        super(context);
        this.a = (byte) 5;
        this.c = en2Var;
        this.b = new Paint(1);
    }

    public t8(wp5 wp5Var, Context context) {
        super(context);
        this.a = (byte) 8;
        this.c = wp5Var;
        wd1 wd1Var = new wd1();
        this.b = wd1Var;
        wd1Var.k = false;
        wd1Var.m = 2.0f;
    }

    public t8(u8 u8Var, Context context) {
        super(context);
        this.a = (byte) 0;
        this.c = u8Var;
        wd1 wd1Var = new wd1();
        this.b = wd1Var;
        wd1Var.k = false;
        wd1Var.m = 2.0f;
    }

    public t8(gr0 gr0Var, Context context) {
        super(context);
        this.a = (byte) 1;
        this.c = gr0Var;
        this.b = new Paint(1);
    }

    public t8(Context context, wjb wjbVar) {
        super(context);
        this.a = (byte) 2;
        this.c = wjbVar;
        this.b = new Paint(1);
    }

    public t8(f26 f26Var, Context context) {
        super(context);
        this.a = (byte) 9;
        this.c = f26Var;
        this.b = new Paint(1);
    }

    public t8(x02 x02Var, Context context) {
        super(context);
        this.a = (byte) 3;
        this.c = x02Var;
        this.b = new Paint(1);
    }
}
