package gi;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.Layout;
import android.view.View;
import android.widget.TextView;
import oi.z5;
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.f80;
import org.telegram.ui.Components.o80;
import org.telegram.ui.Components.si;
import org.telegram.ui.Components.voip.l1;
import org.telegram.ui.Components.voip.w0;
import org.telegram.ui.v50;
import ug.k0;
import ug.l0;
import ug.t1;
public final class j extends TextView {
    public final int f13641a;
    public Object f13642b;
    public final Object f13643c;

    public j(Activity activity, l1 l1Var) {
        super(activity);
        this.f13641a = 8;
        this.f13642b = new RectF();
        this.f13643c = l1Var;
        l1Var.a(this);
        setText(gd.M0(2131743066, null));
        setContentDescription(gd.M0(2131743066, null));
        setTextColor(-1);
        setTypeface(g0.o());
        setPadding(g0.L(14.0f), g0.L(4.0f), g0.L(14.0f), g0.L(4.0f));
    }

    public void a() {
        o80 o80Var = (o80) this.f13643c;
        f80 f80Var = (f80) this.f13642b;
        if (f80Var != null && o80Var != null) {
            f80Var.rewind();
            if (getLayout() != null && getLayout().getText() != null) {
                f80Var.e(getLayout(), 0, getPaddingLeft(), getPaddingTop());
                getLayout().getSelectionPath(0, getLayout().getText().length(), f80Var);
            }
            o80Var.l();
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        int i7 = this.f13641a;
        Object obj = this.f13643c;
        switch (i7) {
            case 0:
                Paint paint = (Paint) this.f13642b;
                int L = g0.L(1.0f) + (getHeight() / 2);
                int max = Math.max(1, g0.L(0.66f));
                Layout layout = getLayout();
                if (layout != null) {
                    paint.setColor(n6.r1(0.45f, n6.w0(n6.f29788y6, ((m) obj).f13652a0.f13669c)));
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
                Paint paint2 = (Paint) this.f13642b;
                int L2 = g0.L(1.0f) + (getHeight() / 2);
                int max2 = Math.max(1, g0.L(0.66f));
                Layout layout2 = getLayout();
                if (layout2 != null) {
                    paint2.setColor(n6.r1(0.45f, n6.w0(n6.f29788y6, (i6) obj)));
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
                Paint paint3 = (Paint) this.f13642b;
                int i10 = n6.f29807z6;
                l0 l0Var = ((k0) obj).f58725e;
                int i11 = l0.S2;
                paint3.setColor(n6.r1(0.8f, n6.w0(i10, l0Var.J0)));
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
        switch (this.f13641a) {
            case 4:
                ((org.telegram.ui.g) this.f13643c).f47850b.draw(canvas);
                super.draw(canvas);
                return;
            case 10:
                ((v50) this.f13643c).h.draw(canvas);
                super.draw(canvas);
                return;
            default:
                super.draw(canvas);
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f13641a) {
            case 7:
                super.onDetachedFromWindow();
                ((o80) this.f13643c).f38013b = -1L;
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f13641a) {
            case 2:
                Paint paint = (Paint) this.f13642b;
                paint.setColor(((li.p) this.f13643c).getThemedColor(n6.Fi));
                canvas.drawRoundRect(0.0f, (getHeight() / 2.0f) - g0.L(14.0f), getWidth(), (getHeight() / 2.0f) + g0.L(14.0f), g0.L(14.0f), g0.L(14.0f), paint);
                super.onDraw(canvas);
                return;
            case 3:
                Paint paint2 = (Paint) this.f13642b;
                oi.a aVar = ((z5) this.f13643c).f22568y;
                if (aVar != null && aVar.f21911c > 0 && aVar.d == 0 && !aVar.f21912e) {
                    paint2.setColor(getCurrentTextColor());
                    float baseline = getBaseline() - (getTextSize() * 0.35f);
                    canvas.drawCircle(getWidth() / 2.0f, baseline, g0.N(4.3f) / 2.0f, paint2);
                    return;
                }
                super.onDraw(canvas);
                return;
            case 4:
                super.onDraw(canvas);
                if (((org.telegram.ui.g) this.f13643c).f47858x) {
                    RectF rectF = g0.P;
                    rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    ((org.telegram.ui.Components.voip.n) this.f13642b).a(getMeasuredHeight() / 2.0f, canvas, rectF, null);
                    invalidate();
                    return;
                }
                return;
            case 5:
                Paint paint3 = (Paint) this.f13642b;
                paint3.setColor(n6.w0(n6.Fi, ((si) this.f13643c).J0));
                canvas.drawRoundRect(0.0f, (getHeight() / 2.0f) - g0.L(14.0f), getWidth(), (getHeight() / 2.0f) + g0.L(14.0f), g0.L(14.0f), g0.L(14.0f), paint3);
                super.onDraw(canvas);
                return;
            case 6:
                if (((t1) this.f13642b) != null) {
                    canvas.save();
                    canvas.clipPath((Path) this.f13643c);
                    ((t1) this.f13642b).d(canvas);
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
                RectF rectF2 = (RectF) this.f13642b;
                rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                l1 l1Var = (l1) this.f13643c;
                l1Var.d(((View) getParent()).getX() + getX(), ((View) getParent()).getY() + getY());
                canvas.drawRoundRect(rectF2, g0.L(16.0f), g0.L(16.0f), l1Var.b());
                super.onDraw(canvas);
                return;
            case 9:
                RectF rectF3 = g0.P;
                rectF3.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                Paint[] paintArr = (Paint[]) this.f13642b;
                w0 w0Var = (w0) this.f13643c;
                paintArr[w0Var.f41289y].setAlpha(255);
                canvas.drawRoundRect(rectF3, g0.L(6.0f), g0.L(6.0f), paintArr[w0Var.f41289y]);
                float f10 = w0Var.f41288x;
                if (f10 > 0.0f) {
                    int i7 = w0Var.f41289y;
                    if (i7 + 1 < paintArr.length) {
                        paintArr[i7 + 1].setAlpha((int) (f10 * 255.0f));
                        canvas.drawRoundRect(rectF3, g0.L(6.0f), g0.L(6.0f), paintArr[w0Var.f41289y + 1]);
                    }
                }
                super.onDraw(canvas);
                return;
            case 10:
                super.onDraw(canvas);
                RectF rectF4 = g0.P;
                rectF4.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                ((org.telegram.ui.Components.voip.n) this.f13642b).a(getMeasuredHeight() / 2.0f, canvas, rectF4, null);
                invalidate();
                return;
            case 12:
                Paint paint4 = (Paint) this.f13642b;
                paint4.setColor(n6.w0(n6.Fi, ((vh.g) this.f13643c).J0));
                canvas.drawRoundRect(0.0f, (getHeight() / 2.0f) - g0.L(14.0f), getWidth(), (getHeight() / 2.0f) + g0.L(14.0f), g0.L(14.0f), g0.L(14.0f), paint4);
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        switch (this.f13641a) {
            case 6:
                super.onLayout(z10, i7, i10, i11, i12);
                t1 t1Var = new t1(10);
                this.f13642b = t1Var;
                t1Var.O = 100;
                t1Var.J = false;
                t1Var.M = true;
                t1Var.G = false;
                t1Var.K = true;
                t1Var.H = true;
                t1Var.f58907r = 1;
                t1Var.f58911w = 0.98f;
                t1Var.v = 0.98f;
                t1Var.f58910u = 0.98f;
                t1Var.f58897g = false;
                t1Var.f58904o = 0.0f;
                t1Var.f58912x = 750L;
                t1Var.f58913y = 750;
                t1Var.c();
                RectF rectF = g0.P;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                ((t1) this.f13642b).f58892a.set(rectF);
                ((t1) this.f13642b).f58893b.set(rectF);
                ((t1) this.f13642b).f();
                Path path = (Path) this.f13643c;
                path.reset();
                path.addRoundRect(rectF, getHeight() / 2.0f, getHeight() / 2.0f, Path.Direction.CW);
                return;
            default:
                super.onLayout(z10, i7, i10, i11, i12);
                return;
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        switch (this.f13641a) {
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
        throw new UnsupportedOperationException("Method not decompiled: gi.j.onSizeChanged(int, int, int, int):void");
    }

    @Override
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        switch (this.f13641a) {
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
        switch (this.f13641a) {
            case 7:
                super.setTextColor(n6.r1(0.2f, i7));
                ((o80) this.f13643c).g(n6.r1(0.03f, i7), n6.r1(0.175f, i7), n6.r1(0.2f, i7), n6.r1(0.45f, i7));
                return;
            default:
                super.setTextColor(i7);
                return;
        }
    }

    public j(w0 w0Var, Context context) {
        super(context);
        this.f13641a = 9;
        this.f13643c = w0Var;
        this.f13642b = new Paint[w0Var.f41283f.length];
        int i7 = 0;
        while (true) {
            Paint[] paintArr = (Paint[]) this.f13642b;
            if (i7 >= paintArr.length) {
                return;
            }
            paintArr[i7] = new Paint(1);
            i7++;
        }
    }

    public j(z5 z5Var, Context context) {
        super(context);
        this.f13641a = 3;
        this.f13643c = z5Var;
        this.f13642b = new Paint(1);
    }

    public j(Context context, int i7) {
        super(context);
        this.f13641a = i7;
        switch (i7) {
            case 7:
                super(context);
                f80 f80Var = new f80(0);
                this.f13642b = f80Var;
                o80 o80Var = new o80();
                this.f13643c = o80Var;
                o80Var.f38033y = f80Var;
                o80Var.f38030u = 0.65f;
                o80Var.k(4.0f);
                setBackground(o80Var);
                return;
            default:
                this.f13643c = new Path();
                return;
        }
    }

    public j(vh.g gVar, Context context) {
        super(context);
        this.f13641a = 12;
        this.f13643c = gVar;
        this.f13642b = new Paint(1);
    }

    public j(li.p pVar, Context context) {
        super(context);
        this.f13641a = 2;
        this.f13643c = pVar;
        this.f13642b = new Paint(1);
    }

    public j(v50 v50Var, Context context) {
        super(context);
        this.f13641a = 10;
        this.f13643c = v50Var;
        org.telegram.ui.Components.voip.n nVar = new org.telegram.ui.Components.voip.n();
        this.f13642b = nVar;
        nVar.f41054k = false;
        nVar.f41056m = 2.0f;
    }

    public j(org.telegram.ui.g gVar, Context context) {
        super(context);
        this.f13641a = 4;
        this.f13643c = gVar;
        org.telegram.ui.Components.voip.n nVar = new org.telegram.ui.Components.voip.n();
        this.f13642b = nVar;
        nVar.f41054k = false;
        nVar.f41056m = 2.0f;
    }

    public j(m mVar, Context context) {
        super(context);
        this.f13641a = 0;
        this.f13643c = mVar;
        this.f13642b = new Paint(1);
    }

    public j(Context context, i6 i6Var) {
        super(context);
        this.f13641a = 1;
        this.f13643c = i6Var;
        this.f13642b = new Paint(1);
    }

    public j(k0 k0Var, Context context) {
        super(context);
        this.f13641a = 11;
        this.f13643c = k0Var;
        this.f13642b = new Paint(1);
    }

    public j(si siVar, Context context) {
        super(context);
        this.f13641a = 5;
        this.f13643c = siVar;
        this.f13642b = new Paint(1);
    }
}
