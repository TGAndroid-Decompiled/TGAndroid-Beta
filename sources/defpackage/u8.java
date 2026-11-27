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
public final class u8 extends TextView {
    public final byte a;
    public Object b;
    public final Object c;

    public u8(Activity activity, kjc kjcVar) {
        super(activity);
        this.a = (byte) 7;
        this.b = new RectF();
        this.c = kjcVar;
        kjcVar.a(this);
        setText(ob6.M0(2131742955, null));
        setContentDescription(ob6.M0(2131742955, null));
        setTextColor(-1);
        setTypeface(hl.o());
        setPadding(hl.L(14.0f), hl.L(4.0f), hl.L(14.0f), hl.L(4.0f));
    }

    public final void a() {
        va6 va6Var = (va6) this.c;
        f66 f66Var = (f66) this.b;
        if (f66Var != null && va6Var != null) {
            f66Var.rewind();
            if (getLayout() != null && getLayout().getText() != null) {
                f66Var.e(getLayout(), 0, getPaddingLeft(), getPaddingTop());
                getLayout().getSelectionPath(0, getLayout().getText().length(), f66Var);
            }
            va6Var.k();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 1:
                Paint paint = (Paint) this.b;
                int L = hl.L(1.0f) + (getHeight() / 2);
                int max = Math.max(1, hl.L(0.66f));
                Layout layout = getLayout();
                if (layout != null) {
                    paint.setColor(aob.p1(0.45f, aob.v0(aob.y6, ((gr0) obj).a0.c)));
                    float f = L;
                    float f2 = max / 2.0f;
                    float f3 = f - f2;
                    float f4 = f + f2;
                    canvas.drawRect(0.0f, f3, (getWidth() - (layout.getLineWidth(0) + hl.L(16.0f))) / 2.0f, f4, paint);
                    canvas.drawRect(((layout.getLineWidth(0) + getWidth()) + hl.L(16.0f)) / 2.0f, f3, getWidth(), f4, paint);
                }
                super.dispatchDraw(canvas);
                return;
            case 2:
                Paint paint2 = (Paint) this.b;
                int L2 = hl.L(1.0f) + (getHeight() / 2);
                int max2 = Math.max(1, hl.L(0.66f));
                Layout layout2 = getLayout();
                if (layout2 != null) {
                    paint2.setColor(aob.p1(0.45f, aob.v0(aob.y6, (vnb) obj)));
                    float f5 = L2;
                    float f6 = max2 / 2.0f;
                    float f7 = f5 - f6;
                    float f8 = f5 + f6;
                    canvas.drawRect(0.0f, f7, (getWidth() - (layout2.getLineWidth(0) + hl.L(16.0f))) / 2.0f, f8, paint2);
                    canvas.drawRect(((layout2.getLineWidth(0) + getWidth()) + hl.L(16.0f)) / 2.0f, f7, getWidth(), f8, paint2);
                }
                super.dispatchDraw(canvas);
                return;
            case 9:
                Paint paint3 = (Paint) this.b;
                int i = aob.z6;
                l46 l46Var = ((j46) obj).e;
                int i2 = l46.R2;
                paint3.setColor(aob.p1(0.8f, aob.v0(i, l46Var.J0)));
                paint3.setStyle(Paint.Style.STROKE);
                paint3.setStrokeWidth(1.0f);
                float height = getHeight() / 2.0f;
                Layout layout3 = getLayout();
                int i3 = 0;
                for (int i4 = 0; i4 < layout3.getLineCount(); i4++) {
                    i3 = Math.max(i3, (int) layout3.getLineWidth(i4));
                }
                float f9 = i3 / 2.0f;
                canvas.drawLine(0.0f, height, ((getWidth() / 2.0f) - f9) - hl.L(8.0f), height, paint3);
                canvas.drawLine((getWidth() / 2.0f) + f9 + hl.L(8.0f), height, getWidth(), height, paint3);
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
                ((v8) obj).b.draw(canvas);
                super.draw(canvas);
                return;
            case 8:
                ((yr5) obj).h.draw(canvas);
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
                ((va6) this.c).b = -1L;
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
                if (((v8) obj).x) {
                    RectF rectF = hl.P;
                    rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    ((fe1) this.b).a(getMeasuredHeight() / 2.0f, canvas, rectF, null);
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
                paint.setColor(aob.v0(aob.Fi, ((n12) obj).J0));
                canvas.drawRoundRect(0.0f, (getHeight() / 2.0f) - hl.L(14.0f), getWidth(), (getHeight() / 2.0f) + hl.L(14.0f), hl.L(14.0f), hl.L(14.0f), paint);
                super.onDraw(canvas);
                return;
            case 4:
                if (((dva) this.b) != null) {
                    canvas.save();
                    canvas.clipPath((Path) obj);
                    ((dva) this.b).d(canvas);
                    canvas.restore();
                    invalidate();
                }
                super.onDraw(canvas);
                return;
            case 5:
                Paint paint2 = (Paint) this.b;
                paint2.setColor(((xn2) obj).getThemedColor(aob.Fi));
                canvas.drawRoundRect(0.0f, (getHeight() / 2.0f) - hl.L(14.0f), getWidth(), hl.L(14.0f) + (getHeight() / 2.0f), hl.L(14.0f), hl.L(14.0f), paint2);
                super.onDraw(canvas);
                return;
            case 6:
                Paint paint3 = (Paint) this.b;
                paint3.setColor(aob.v0(aob.Fi, ((ry2) obj).J0));
                canvas.drawRoundRect(0.0f, (getHeight() / 2.0f) - hl.L(14.0f), getWidth(), (getHeight() / 2.0f) + hl.L(14.0f), hl.L(14.0f), hl.L(14.0f), paint3);
                super.onDraw(canvas);
                return;
            case 7:
                RectF rectF2 = (RectF) this.b;
                rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                kjc kjcVar = (kjc) obj;
                kjcVar.d(((View) getParent()).getX() + getX(), ((View) getParent()).getY() + getY());
                canvas.drawRoundRect(rectF2, hl.L(16.0f), hl.L(16.0f), kjcVar.b());
                super.onDraw(canvas);
                return;
            case 8:
                super.onDraw(canvas);
                RectF rectF3 = hl.P;
                rectF3.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                ((fe1) this.b).a(getMeasuredHeight() / 2.0f, canvas, rectF3, null);
                invalidate();
                return;
            case 10:
                RectF rectF4 = hl.P;
                rectF4.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                Paint[] paintArr = (Paint[]) this.b;
                zn8 zn8Var = (zn8) obj;
                paintArr[zn8Var.y].setAlpha(255);
                canvas.drawRoundRect(rectF4, hl.L(6.0f), hl.L(6.0f), paintArr[zn8Var.y]);
                float f = zn8Var.x;
                if (f > 0.0f && (i = zn8Var.y + 1) < paintArr.length) {
                    paintArr[i].setAlpha((int) (f * 255.0f));
                    canvas.drawRoundRect(rectF4, hl.L(6.0f), hl.L(6.0f), paintArr[zn8Var.y + 1]);
                }
                super.onDraw(canvas);
                return;
            case 11:
                Paint paint4 = (Paint) this.b;
                mk0 mk0Var = ((km9) obj).y;
                if (mk0Var != null && mk0Var.c > 0 && mk0Var.d == 0 && !mk0Var.e) {
                    paint4.setColor(getCurrentTextColor());
                    canvas.drawCircle(getWidth() / 2.0f, getBaseline() - (getTextSize() * 0.35f), hl.N(4.3f) / 2.0f, paint4);
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
                dva dvaVar = new dva(10);
                this.b = dvaVar;
                dvaVar.N = 100;
                dvaVar.I = false;
                dvaVar.L = true;
                dvaVar.G = false;
                dvaVar.J = true;
                dvaVar.H = true;
                dvaVar.r = (byte) 1;
                dvaVar.w = 0.98f;
                dvaVar.v = 0.98f;
                dvaVar.u = 0.98f;
                dvaVar.g = false;
                dvaVar.o = 0.0f;
                dvaVar.x = (short) 750;
                dvaVar.y = (short) 750;
                dvaVar.c();
                RectF rectF = hl.P;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                ((dva) this.b).a.set(rectF);
                ((dva) this.b).b.set(rectF);
                ((dva) this.b).f();
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
                if (View.MeasureSpec.getSize(i) > hl.L(260.0f)) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(hl.L(320.0f), 1073741824), i2);
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u8.onSizeChanged(int, int, int, int):void");
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
                super.setTextColor(aob.p1(0.2f, i));
                ((va6) this.c).g(aob.p1(0.03f, i), aob.p1(0.175f, i), aob.p1(0.2f, i), aob.p1(0.45f, i));
                return;
            default:
                super.setTextColor(i);
                return;
        }
    }

    public u8(zn8 zn8Var, Context context) {
        super(context);
        this.a = (byte) 10;
        this.c = zn8Var;
        this.b = new Paint[zn8Var.f.length];
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

    public u8(km9 km9Var, Context context) {
        super(context);
        this.a = (byte) 11;
        this.c = km9Var;
        this.b = new Paint(1);
    }

    public u8(Context context, byte b) {
        super(context);
        this.a = b;
        switch (b) {
            case 12:
                super(context);
                f66 f66Var = new f66(0);
                this.b = f66Var;
                va6 va6Var = new va6();
                this.c = va6Var;
                va6Var.y = f66Var;
                va6Var.u = 0.65f;
                va6Var.j(4.0f);
                setBackground(va6Var);
                return;
            default:
                this.c = new Path();
                return;
        }
    }

    public u8(ry2 ry2Var, Context context) {
        super(context);
        this.a = (byte) 6;
        this.c = ry2Var;
        this.b = new Paint(1);
    }

    public u8(xn2 xn2Var, Context context) {
        super(context);
        this.a = (byte) 5;
        this.c = xn2Var;
        this.b = new Paint(1);
    }

    public u8(yr5 yr5Var, Context context) {
        super(context);
        this.a = (byte) 8;
        this.c = yr5Var;
        fe1 fe1Var = new fe1();
        this.b = fe1Var;
        fe1Var.k = false;
        fe1Var.m = 2.0f;
    }

    public u8(v8 v8Var, Context context) {
        super(context);
        this.a = (byte) 0;
        this.c = v8Var;
        fe1 fe1Var = new fe1();
        this.b = fe1Var;
        fe1Var.k = false;
        fe1Var.m = 2.0f;
    }

    public u8(gr0 gr0Var, Context context) {
        super(context);
        this.a = (byte) 1;
        this.c = gr0Var;
        this.b = new Paint(1);
    }

    public u8(Context context, vnb vnbVar) {
        super(context);
        this.a = (byte) 2;
        this.c = vnbVar;
        this.b = new Paint(1);
    }

    public u8(j46 j46Var, Context context) {
        super(context);
        this.a = (byte) 9;
        this.c = j46Var;
        this.b = new Paint(1);
    }

    public u8(n12 n12Var, Context context) {
        super(context);
        this.a = (byte) 3;
        this.c = n12Var;
        this.b = new Paint(1);
    }
}
