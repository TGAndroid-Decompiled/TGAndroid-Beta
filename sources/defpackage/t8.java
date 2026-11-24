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

    public t8(Activity activity, lhc lhcVar) {
        super(activity);
        this.a = (byte) 7;
        this.b = new RectF();
        this.c = lhcVar;
        lhcVar.a(this);
        setText(jb6.M0(2131742987, null));
        setContentDescription(jb6.M0(2131742987, null));
        setTextColor(-1);
        setTypeface(gm.o());
        setPadding(gm.L(14.0f), gm.L(4.0f), gm.L(14.0f), gm.L(4.0f));
    }

    public final void a() {
        qa6 qa6Var = (qa6) this.c;
        b66 b66Var = (b66) this.b;
        if (b66Var != null && qa6Var != null) {
            b66Var.rewind();
            if (getLayout() != null && getLayout().getText() != null) {
                b66Var.e(getLayout(), 0, getPaddingLeft(), getPaddingTop());
                getLayout().getSelectionPath(0, getLayout().getText().length(), b66Var);
            }
            qa6Var.k();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 1:
                Paint paint = (Paint) this.b;
                int L = gm.L(1.0f) + (getHeight() / 2);
                int max = Math.max(1, gm.L(0.66f));
                Layout layout = getLayout();
                if (layout != null) {
                    paint.setColor(cmb.p1(0.45f, cmb.v0(cmb.x6, ((gs0) obj).a0.c)));
                    float f = L;
                    float f2 = max / 2.0f;
                    float f3 = f - f2;
                    float f4 = f + f2;
                    canvas.drawRect(0.0f, f3, (getWidth() - (layout.getLineWidth(0) + gm.L(16.0f))) / 2.0f, f4, paint);
                    canvas.drawRect(((layout.getLineWidth(0) + getWidth()) + gm.L(16.0f)) / 2.0f, f3, getWidth(), f4, paint);
                }
                super.dispatchDraw(canvas);
                return;
            case 2:
                Paint paint2 = (Paint) this.b;
                int L2 = gm.L(1.0f) + (getHeight() / 2);
                int max2 = Math.max(1, gm.L(0.66f));
                Layout layout2 = getLayout();
                if (layout2 != null) {
                    paint2.setColor(cmb.p1(0.45f, cmb.v0(cmb.x6, (ylb) obj)));
                    float f5 = L2;
                    float f6 = max2 / 2.0f;
                    float f7 = f5 - f6;
                    float f8 = f5 + f6;
                    canvas.drawRect(0.0f, f7, (getWidth() - (layout2.getLineWidth(0) + gm.L(16.0f))) / 2.0f, f8, paint2);
                    canvas.drawRect(((layout2.getLineWidth(0) + getWidth()) + gm.L(16.0f)) / 2.0f, f7, getWidth(), f8, paint2);
                }
                super.dispatchDraw(canvas);
                return;
            case 9:
                Paint paint3 = (Paint) this.b;
                int i = cmb.y6;
                i46 i46Var = ((g46) obj).e;
                int i2 = i46.R2;
                paint3.setColor(cmb.p1(0.8f, cmb.v0(i, i46Var.J0)));
                paint3.setStyle(Paint.Style.STROKE);
                paint3.setStrokeWidth(1.0f);
                float height = getHeight() / 2.0f;
                Layout layout3 = getLayout();
                int i3 = 0;
                for (int i4 = 0; i4 < layout3.getLineCount(); i4++) {
                    i3 = Math.max(i3, (int) layout3.getLineWidth(i4));
                }
                float f9 = i3 / 2.0f;
                canvas.drawLine(0.0f, height, ((getWidth() / 2.0f) - f9) - gm.L(8.0f), height, paint3);
                canvas.drawLine((getWidth() / 2.0f) + f9 + gm.L(8.0f), height, getWidth(), height, paint3);
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
                ((vr5) obj).h.draw(canvas);
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
                ((qa6) this.c).b = -1L;
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
                    RectF rectF = gm.P;
                    rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    ((ef1) this.b).a(getMeasuredHeight() / 2.0f, canvas, rectF, null);
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
                paint.setColor(cmb.v0(cmb.Ei, ((i22) obj).J0));
                canvas.drawRoundRect(0.0f, (getHeight() / 2.0f) - gm.L(14.0f), getWidth(), (getHeight() / 2.0f) + gm.L(14.0f), gm.L(14.0f), gm.L(14.0f), paint);
                super.onDraw(canvas);
                return;
            case 4:
                if (((cta) this.b) != null) {
                    canvas.save();
                    canvas.clipPath((Path) obj);
                    ((cta) this.b).d(canvas);
                    canvas.restore();
                    invalidate();
                }
                super.onDraw(canvas);
                return;
            case 5:
                Paint paint2 = (Paint) this.b;
                paint2.setColor(((po2) obj).getThemedColor(cmb.Ei));
                canvas.drawRoundRect(0.0f, (getHeight() / 2.0f) - gm.L(14.0f), getWidth(), gm.L(14.0f) + (getHeight() / 2.0f), gm.L(14.0f), gm.L(14.0f), paint2);
                super.onDraw(canvas);
                return;
            case 6:
                Paint paint3 = (Paint) this.b;
                paint3.setColor(cmb.v0(cmb.Ei, ((hz2) obj).J0));
                canvas.drawRoundRect(0.0f, (getHeight() / 2.0f) - gm.L(14.0f), getWidth(), (getHeight() / 2.0f) + gm.L(14.0f), gm.L(14.0f), gm.L(14.0f), paint3);
                super.onDraw(canvas);
                return;
            case 7:
                RectF rectF2 = (RectF) this.b;
                rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                lhc lhcVar = (lhc) obj;
                lhcVar.d(((View) getParent()).getX() + getX(), ((View) getParent()).getY() + getY());
                canvas.drawRoundRect(rectF2, gm.L(16.0f), gm.L(16.0f), lhcVar.b());
                super.onDraw(canvas);
                return;
            case 8:
                super.onDraw(canvas);
                RectF rectF3 = gm.P;
                rectF3.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                ((ef1) this.b).a(getMeasuredHeight() / 2.0f, canvas, rectF3, null);
                invalidate();
                return;
            case 10:
                RectF rectF4 = gm.P;
                rectF4.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                Paint[] paintArr = (Paint[]) this.b;
                om8 om8Var = (om8) obj;
                paintArr[om8Var.y].setAlpha(255);
                canvas.drawRoundRect(rectF4, gm.L(6.0f), gm.L(6.0f), paintArr[om8Var.y]);
                float f = om8Var.x;
                if (f > 0.0f && (i = om8Var.y + 1) < paintArr.length) {
                    paintArr[i].setAlpha((int) (f * 255.0f));
                    canvas.drawRoundRect(rectF4, gm.L(6.0f), gm.L(6.0f), paintArr[om8Var.y + 1]);
                }
                super.onDraw(canvas);
                return;
            case 11:
                Paint paint4 = (Paint) this.b;
                ll0 ll0Var = ((xk9) obj).y;
                if (ll0Var != null && ll0Var.c > 0 && ll0Var.d == 0 && !ll0Var.e) {
                    paint4.setColor(getCurrentTextColor());
                    canvas.drawCircle(getWidth() / 2.0f, getBaseline() - (getTextSize() * 0.35f), gm.N(4.3f) / 2.0f, paint4);
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
                cta ctaVar = new cta(10);
                this.b = ctaVar;
                ctaVar.N = 100;
                ctaVar.I = false;
                ctaVar.L = true;
                ctaVar.G = false;
                ctaVar.J = true;
                ctaVar.H = true;
                ctaVar.r = (byte) 1;
                ctaVar.w = 0.98f;
                ctaVar.v = 0.98f;
                ctaVar.u = 0.98f;
                ctaVar.g = false;
                ctaVar.o = 0.0f;
                ctaVar.x = (short) 750;
                ctaVar.y = (short) 750;
                ctaVar.c();
                RectF rectF = gm.P;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                ((cta) this.b).a.set(rectF);
                ((cta) this.b).b.set(rectF);
                ((cta) this.b).f();
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
                if (View.MeasureSpec.getSize(i) > gm.L(260.0f)) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(gm.L(320.0f), 1073741824), i2);
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
                super.setTextColor(cmb.p1(0.2f, i));
                ((qa6) this.c).g(cmb.p1(0.03f, i), cmb.p1(0.175f, i), cmb.p1(0.2f, i), cmb.p1(0.45f, i));
                return;
            default:
                super.setTextColor(i);
                return;
        }
    }

    public t8(om8 om8Var, Context context) {
        super(context);
        this.a = (byte) 10;
        this.c = om8Var;
        this.b = new Paint[om8Var.f.length];
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

    public t8(xk9 xk9Var, Context context) {
        super(context);
        this.a = (byte) 11;
        this.c = xk9Var;
        this.b = new Paint(1);
    }

    public t8(Context context, byte b) {
        super(context);
        this.a = b;
        switch (b) {
            case 12:
                super(context);
                b66 b66Var = new b66(0);
                this.b = b66Var;
                qa6 qa6Var = new qa6();
                this.c = qa6Var;
                qa6Var.y = b66Var;
                qa6Var.u = 0.65f;
                qa6Var.j(4.0f);
                setBackground(qa6Var);
                return;
            default:
                this.c = new Path();
                return;
        }
    }

    public t8(hz2 hz2Var, Context context) {
        super(context);
        this.a = (byte) 6;
        this.c = hz2Var;
        this.b = new Paint(1);
    }

    public t8(po2 po2Var, Context context) {
        super(context);
        this.a = (byte) 5;
        this.c = po2Var;
        this.b = new Paint(1);
    }

    public t8(vr5 vr5Var, Context context) {
        super(context);
        this.a = (byte) 8;
        this.c = vr5Var;
        ef1 ef1Var = new ef1();
        this.b = ef1Var;
        ef1Var.k = false;
        ef1Var.m = 2.0f;
    }

    public t8(u8 u8Var, Context context) {
        super(context);
        this.a = (byte) 0;
        this.c = u8Var;
        ef1 ef1Var = new ef1();
        this.b = ef1Var;
        ef1Var.k = false;
        ef1Var.m = 2.0f;
    }

    public t8(gs0 gs0Var, Context context) {
        super(context);
        this.a = (byte) 1;
        this.c = gs0Var;
        this.b = new Paint(1);
    }

    public t8(Context context, ylb ylbVar) {
        super(context);
        this.a = (byte) 2;
        this.c = ylbVar;
        this.b = new Paint(1);
    }

    public t8(g46 g46Var, Context context) {
        super(context);
        this.a = (byte) 9;
        this.c = g46Var;
        this.b = new Paint(1);
    }

    public t8(i22 i22Var, Context context) {
        super(context);
        this.a = (byte) 3;
        this.c = i22Var;
        this.b = new Paint(1);
    }
}
