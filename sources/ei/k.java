package ei;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.Layout;
import android.view.View;
import android.widget.TextView;
import li.a6;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.a80;
import org.telegram.ui.Components.di;
import org.telegram.ui.Components.r70;
import org.telegram.ui.Components.voip.i1;
import org.telegram.ui.Components.voip.t0;
import org.telegram.ui.u50;
import ug.h0;
import ug.i0;
import ug.p1;
public final class k extends TextView {
    public final int f10819a;
    public Object f10820b;
    public final Object f10821c;

    public k(Activity activity, i1 i1Var) {
        super(activity);
        this.f10819a = 8;
        this.f10820b = new RectF();
        this.f10821c = i1Var;
        i1Var.a(this);
        setText(hd.M0(2131743304, null));
        setContentDescription(hd.M0(2131743304, null));
        setTextColor(-1);
        setTypeface(g0.o());
        setPadding(g0.L(14.0f), g0.L(4.0f), g0.L(14.0f), g0.L(4.0f));
    }

    public void a() {
        a80 a80Var = (a80) this.f10821c;
        r70 r70Var = (r70) this.f10820b;
        if (r70Var != null && a80Var != null) {
            r70Var.rewind();
            if (getLayout() != null && getLayout().getText() != null) {
                r70Var.e(getLayout(), 0, getPaddingLeft(), getPaddingTop());
                getLayout().getSelectionPath(0, getLayout().getText().length(), r70Var);
            }
            a80Var.l();
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        int i7 = this.f10819a;
        Object obj = this.f10821c;
        switch (i7) {
            case 0:
                Paint paint = (Paint) this.f10820b;
                int L = g0.L(1.0f) + (getHeight() / 2);
                int max = Math.max(1, g0.L(0.66f));
                Layout layout = getLayout();
                if (layout != null) {
                    paint.setColor(k6.r1(0.45f, k6.w0(k6.f28240y6, ((n) obj).W.f10846c)));
                    float f10 = L;
                    float f11 = max / 2.0f;
                    float f12 = f10 - f11;
                    float f13 = f10 + f11;
                    canvas.drawRect(0.0f, f12, (getWidth() - (layout.getLineWidth(0) + g0.L(16.0f))) / 2.0f, f13, paint);
                    canvas.drawRect(((layout.getLineWidth(0) + getWidth()) + g0.L(16.0f)) / 2.0f, f12, getWidth(), f13, paint);
                }
                super.dispatchDraw(canvas);
                return;
            case 1:
                Paint paint2 = (Paint) this.f10820b;
                int L2 = g0.L(1.0f) + (getHeight() / 2);
                int max2 = Math.max(1, g0.L(0.66f));
                Layout layout2 = getLayout();
                if (layout2 != null) {
                    paint2.setColor(k6.r1(0.45f, k6.w0(k6.f28240y6, (f6) obj)));
                    float f14 = L2;
                    float f15 = max2 / 2.0f;
                    float f16 = f14 - f15;
                    float f17 = f14 + f15;
                    canvas.drawRect(0.0f, f16, (getWidth() - (layout2.getLineWidth(0) + g0.L(16.0f))) / 2.0f, f17, paint2);
                    canvas.drawRect(((layout2.getLineWidth(0) + getWidth()) + g0.L(16.0f)) / 2.0f, f16, getWidth(), f17, paint2);
                }
                super.dispatchDraw(canvas);
                return;
            case 11:
                Paint paint3 = (Paint) this.f10820b;
                int i10 = k6.f28258z6;
                i0 i0Var = ((h0) obj).f56483e;
                int i11 = i0.O2;
                paint3.setColor(k6.r1(0.8f, k6.w0(i10, i0Var.I0)));
                paint3.setStyle(Paint.Style.STROKE);
                paint3.setStrokeWidth(1.0f);
                float height = getHeight() / 2.0f;
                Layout layout3 = getLayout();
                int i12 = 0;
                for (int i13 = 0; i13 < layout3.getLineCount(); i13++) {
                    i12 = Math.max(i12, (int) layout3.getLineWidth(i13));
                }
                float f18 = i12 / 2.0f;
                canvas.drawLine(0.0f, height, ((getWidth() / 2.0f) - f18) - g0.L(8.0f), height, paint3);
                canvas.drawLine((getWidth() / 2.0f) + f18 + g0.L(8.0f), height, getWidth(), height, paint3);
                super.dispatchDraw(canvas);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f10819a) {
            case 4:
                ((org.telegram.ui.g) this.f10821c).f45728b.draw(canvas);
                super.draw(canvas);
                return;
            case 10:
                ((u50) this.f10821c).h.draw(canvas);
                super.draw(canvas);
                return;
            default:
                super.draw(canvas);
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f10819a) {
            case 7:
                super.onDetachedFromWindow();
                ((a80) this.f10821c).f31715b = -1L;
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f10819a) {
            case 2:
                Paint paint = (Paint) this.f10820b;
                paint.setColor(((ii.p) this.f10821c).getThemedColor(k6.Ci));
                canvas.drawRoundRect(0.0f, (getHeight() / 2.0f) - g0.L(14.0f), getWidth(), (getHeight() / 2.0f) + g0.L(14.0f), g0.L(14.0f), g0.L(14.0f), paint);
                super.onDraw(canvas);
                return;
            case 3:
                Paint paint2 = (Paint) this.f10820b;
                li.a aVar = ((a6) this.f10821c).f18432y;
                if (aVar != null && aVar.f18390c > 0 && aVar.d == 0 && !aVar.f18391e) {
                    paint2.setColor(getCurrentTextColor());
                    float baseline = getBaseline() - (getTextSize() * 0.35f);
                    canvas.drawCircle(getWidth() / 2.0f, baseline, g0.N(4.3f) / 2.0f, paint2);
                    return;
                }
                super.onDraw(canvas);
                return;
            case 4:
                super.onDraw(canvas);
                if (((org.telegram.ui.g) this.f10821c).f45736x) {
                    RectF rectF = g0.P;
                    rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    ((org.telegram.ui.Components.voip.n) this.f10820b).a(getMeasuredHeight() / 2.0f, canvas, rectF, null);
                    invalidate();
                    return;
                }
                return;
            case 5:
                Paint paint3 = (Paint) this.f10820b;
                paint3.setColor(k6.w0(k6.Ci, ((di) this.f10821c).I0));
                canvas.drawRoundRect(0.0f, (getHeight() / 2.0f) - g0.L(14.0f), getWidth(), (getHeight() / 2.0f) + g0.L(14.0f), g0.L(14.0f), g0.L(14.0f), paint3);
                super.onDraw(canvas);
                return;
            case 6:
                if (((p1) this.f10820b) != null) {
                    canvas.save();
                    canvas.clipPath((Path) this.f10821c);
                    ((p1) this.f10820b).d(canvas);
                    canvas.restore();
                    invalidate();
                }
                super.onDraw(canvas);
                return;
            case 7:
            case 11:
            default:
                super.onDraw(canvas);
                return;
            case 8:
                RectF rectF2 = (RectF) this.f10820b;
                rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                i1 i1Var = (i1) this.f10821c;
                i1Var.d(((View) getParent()).getX() + getX(), ((View) getParent()).getY() + getY());
                canvas.drawRoundRect(rectF2, g0.L(16.0f), g0.L(16.0f), i1Var.b());
                super.onDraw(canvas);
                return;
            case 9:
                RectF rectF3 = g0.P;
                rectF3.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                Paint[] paintArr = (Paint[]) this.f10820b;
                t0 t0Var = (t0) this.f10821c;
                paintArr[t0Var.f39487y].setAlpha(255);
                canvas.drawRoundRect(rectF3, g0.L(6.0f), g0.L(6.0f), paintArr[t0Var.f39487y]);
                float f10 = t0Var.f39486x;
                if (f10 > 0.0f) {
                    int i7 = t0Var.f39487y;
                    if (i7 + 1 < paintArr.length) {
                        paintArr[i7 + 1].setAlpha((int) (f10 * 255.0f));
                        canvas.drawRoundRect(rectF3, g0.L(6.0f), g0.L(6.0f), paintArr[t0Var.f39487y + 1]);
                    }
                }
                super.onDraw(canvas);
                return;
            case 10:
                super.onDraw(canvas);
                RectF rectF4 = g0.P;
                rectF4.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                ((org.telegram.ui.Components.voip.n) this.f10820b).a(getMeasuredHeight() / 2.0f, canvas, rectF4, null);
                invalidate();
                return;
            case 12:
                Paint paint4 = (Paint) this.f10820b;
                paint4.setColor(k6.w0(k6.Ci, ((vh.g) this.f10821c).I0));
                canvas.drawRoundRect(0.0f, (getHeight() / 2.0f) - g0.L(14.0f), getWidth(), (getHeight() / 2.0f) + g0.L(14.0f), g0.L(14.0f), g0.L(14.0f), paint4);
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        switch (this.f10819a) {
            case 6:
                super.onLayout(z9, i7, i10, i11, i12);
                p1 p1Var = new p1(10);
                this.f10820b = p1Var;
                p1Var.O = 100;
                p1Var.J = false;
                p1Var.M = true;
                p1Var.G = false;
                p1Var.K = true;
                p1Var.H = true;
                p1Var.f56662r = 1;
                p1Var.f56666w = 0.98f;
                p1Var.v = 0.98f;
                p1Var.f56665u = 0.98f;
                p1Var.f56652g = false;
                p1Var.f56659o = 0.0f;
                p1Var.f56667x = 750L;
                p1Var.f56668y = 750;
                p1Var.c();
                RectF rectF = g0.P;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                ((p1) this.f10820b).f56647a.set(rectF);
                ((p1) this.f10820b).f56648b.set(rectF);
                ((p1) this.f10820b).f();
                Path path = (Path) this.f10821c;
                path.reset();
                path.addRoundRect(rectF, getHeight() / 2.0f, getHeight() / 2.0f, Path.Direction.CW);
                return;
            default:
                super.onLayout(z9, i7, i10, i11, i12);
                return;
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        switch (this.f10819a) {
            case 7:
                super.onMeasure(i7, i10);
                a();
                return;
            case 10:
                if (View.MeasureSpec.getSize(i7) > g0.L(260.0f)) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(g0.L(320.0f), 1073741824), i10);
                    return;
                } else {
                    super.onMeasure(i7, i10);
                    return;
                }
            default:
                super.onMeasure(i7, i10);
                return;
        }
    }

    @Override
    public void onSizeChanged(int r18, int r19, int r20, int r21) {
        throw new UnsupportedOperationException("Method not decompiled: ei.k.onSizeChanged(int, int, int, int):void");
    }

    @Override
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        switch (this.f10819a) {
            case 7:
                super.setText(charSequence, bufferType);
                a();
                return;
            default:
                super.setText(charSequence, bufferType);
                return;
        }
    }

    @Override
    public void setTextColor(int i7) {
        switch (this.f10819a) {
            case 7:
                super.setTextColor(k6.r1(0.2f, i7));
                ((a80) this.f10821c).g(k6.r1(0.03f, i7), k6.r1(0.175f, i7), k6.r1(0.2f, i7), k6.r1(0.45f, i7));
                return;
            default:
                super.setTextColor(i7);
                return;
        }
    }

    public k(t0 t0Var, Context context) {
        super(context);
        this.f10819a = 9;
        this.f10821c = t0Var;
        this.f10820b = new Paint[t0Var.f39481f.length];
        int i7 = 0;
        while (true) {
            Paint[] paintArr = (Paint[]) this.f10820b;
            if (i7 >= paintArr.length) {
                return;
            }
            paintArr[i7] = new Paint(1);
            i7++;
        }
    }

    public k(a6 a6Var, Context context) {
        super(context);
        this.f10819a = 3;
        this.f10821c = a6Var;
        this.f10820b = new Paint(1);
    }

    public k(Context context, int i7) {
        super(context);
        this.f10819a = i7;
        switch (i7) {
            case 7:
                super(context);
                r70 r70Var = new r70(0);
                this.f10820b = r70Var;
                a80 a80Var = new a80();
                this.f10821c = a80Var;
                a80Var.f31735y = r70Var;
                a80Var.f31732u = 0.65f;
                a80Var.k(4.0f);
                setBackground(a80Var);
                return;
            default:
                this.f10821c = new Path();
                return;
        }
    }

    public k(vh.g gVar, Context context) {
        super(context);
        this.f10819a = 12;
        this.f10821c = gVar;
        this.f10820b = new Paint(1);
    }

    public k(ii.p pVar, Context context) {
        super(context);
        this.f10819a = 2;
        this.f10821c = pVar;
        this.f10820b = new Paint(1);
    }

    public k(u50 u50Var, Context context) {
        super(context);
        this.f10819a = 10;
        this.f10821c = u50Var;
        org.telegram.ui.Components.voip.n nVar = new org.telegram.ui.Components.voip.n();
        this.f10820b = nVar;
        nVar.f39325k = false;
        nVar.f39327m = 2.0f;
    }

    public k(org.telegram.ui.g gVar, Context context) {
        super(context);
        this.f10819a = 4;
        this.f10821c = gVar;
        org.telegram.ui.Components.voip.n nVar = new org.telegram.ui.Components.voip.n();
        this.f10820b = nVar;
        nVar.f39325k = false;
        nVar.f39327m = 2.0f;
    }

    public k(n nVar, Context context) {
        super(context);
        this.f10819a = 0;
        this.f10821c = nVar;
        this.f10820b = new Paint(1);
    }

    public k(Context context, f6 f6Var) {
        super(context);
        this.f10819a = 1;
        this.f10821c = f6Var;
        this.f10820b = new Paint(1);
    }

    public k(h0 h0Var, Context context) {
        super(context);
        this.f10819a = 11;
        this.f10821c = h0Var;
        this.f10820b = new Paint(1);
    }

    public k(di diVar, Context context) {
        super(context);
        this.f10819a = 5;
        this.f10821c = diVar;
        this.f10820b = new Paint(1);
    }
}
