package bi;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.Layout;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.dd;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.t80;
import org.telegram.ui.r60;
public final class j6 extends TextView {
    public final int f3123a;
    public Object f3124b;
    public final Object f3125c;

    public j6(Activity activity, org.telegram.ui.Components.voip.y0 y0Var) {
        super(activity);
        this.f3123a = 7;
        this.f3124b = new RectF();
        this.f3125c = y0Var;
        y0Var.a(this);
        setText(dd.L0(2131743329, null));
        setContentDescription(dd.L0(2131743329, null));
        setTextColor(-1);
        setTypeface(org.telegram.messenger.i0.o());
        setPadding(org.telegram.messenger.i0.L(14.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(14.0f), org.telegram.messenger.i0.L(4.0f));
    }

    public void a() {
        t80 t80Var = (t80) this.f3125c;
        k80 k80Var = (k80) this.f3124b;
        if (k80Var != null && t80Var != null) {
            k80Var.rewind();
            if (getLayout() != null && getLayout().getText() != null) {
                k80Var.e(getLayout(), 0, getPaddingLeft(), getPaddingTop());
                getLayout().getSelectionPath(0, getLayout().getText().length(), k80Var);
            }
            t80Var.l();
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        int i10 = this.f3123a;
        Object obj = this.f3125c;
        switch (i10) {
            case 1:
                Paint paint = (Paint) this.f3124b;
                int i11 = org.telegram.ui.ActionBar.t6.f21331z6;
                kg.q0 q0Var = ((kg.p0) obj).e;
                int i12 = kg.q0.O2;
                paint.setColor(org.telegram.ui.ActionBar.t6.r1(0.8f, org.telegram.ui.ActionBar.t6.w0(i11, q0Var.I0)));
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(1.0f);
                float height = getHeight() / 2.0f;
                Layout layout = getLayout();
                int i13 = 0;
                for (int i14 = 0; i14 < layout.getLineCount(); i14++) {
                    i13 = Math.max(i13, (int) layout.getLineWidth(i14));
                }
                float f7 = i13 / 2.0f;
                canvas.drawLine(0.0f, height, ((getWidth() / 2.0f) - f7) - org.telegram.messenger.i0.L(8.0f), height, paint);
                canvas.drawLine((getWidth() / 2.0f) + f7 + org.telegram.messenger.i0.L(8.0f), height, getWidth(), height, paint);
                super.dispatchDraw(canvas);
                return;
            case 10:
                Paint paint2 = (Paint) this.f3124b;
                int L = org.telegram.messenger.i0.L(1.0f) + (getHeight() / 2);
                int max = Math.max(1, org.telegram.messenger.i0.L(0.66f));
                Layout layout2 = getLayout();
                if (layout2 != null) {
                    paint2.setColor(org.telegram.ui.ActionBar.t6.r1(0.45f, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21312y6, ((uh.i) obj).W.f50275c)));
                    float f10 = L;
                    float f11 = max / 2.0f;
                    float f12 = f10 - f11;
                    float f13 = f10 + f11;
                    canvas.drawRect(0.0f, f12, (getWidth() - (layout2.getLineWidth(0) + org.telegram.messenger.i0.L(16.0f))) / 2.0f, f13, paint2);
                    canvas.drawRect(((layout2.getLineWidth(0) + getWidth()) + org.telegram.messenger.i0.L(16.0f)) / 2.0f, f12, getWidth(), f13, paint2);
                }
                super.dispatchDraw(canvas);
                return;
            case 11:
                Paint paint3 = (Paint) this.f3124b;
                int L2 = org.telegram.messenger.i0.L(1.0f) + (getHeight() / 2);
                int max2 = Math.max(1, org.telegram.messenger.i0.L(0.66f));
                Layout layout3 = getLayout();
                if (layout3 != null) {
                    paint3.setColor(org.telegram.ui.ActionBar.t6.r1(0.45f, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21312y6, (org.telegram.ui.ActionBar.p6) obj)));
                    float f14 = L2;
                    float f15 = max2 / 2.0f;
                    float f16 = f14 - f15;
                    float f17 = f14 + f15;
                    canvas.drawRect(0.0f, f16, (getWidth() - (layout3.getLineWidth(0) + org.telegram.messenger.i0.L(16.0f))) / 2.0f, f17, paint3);
                    canvas.drawRect(((layout3.getLineWidth(0) + getWidth()) + org.telegram.messenger.i0.L(16.0f)) / 2.0f, f16, getWidth(), f17, paint3);
                }
                super.dispatchDraw(canvas);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f3123a) {
            case 3:
                ((org.telegram.ui.f) this.f3125c).f36932b.draw(canvas);
                super.draw(canvas);
                return;
            case 9:
                ((r60) this.f3125c).h.draw(canvas);
                super.draw(canvas);
                return;
            default:
                super.draw(canvas);
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f3123a) {
            case 6:
                super.onDetachedFromWindow();
                ((t80) this.f3125c).f30574b = -1L;
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f3123a) {
            case 0:
                Paint paint = (Paint) this.f3124b;
                a aVar = ((q6) this.f3125c).f3309y;
                if (aVar != null && aVar.f2819c > 0 && aVar.d == 0 && !aVar.e) {
                    paint.setColor(getCurrentTextColor());
                    float baseline = getBaseline() - (getTextSize() * 0.35f);
                    canvas.drawCircle(getWidth() / 2.0f, baseline, org.telegram.messenger.i0.N(4.3f) / 2.0f, paint);
                    return;
                }
                super.onDraw(canvas);
                return;
            case 1:
            case 6:
            case 10:
            case 11:
            default:
                super.onDraw(canvas);
                return;
            case 2:
                Paint paint2 = (Paint) this.f3124b;
                paint2.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Ci, ((lh.g) this.f3125c).I0));
                canvas.drawRoundRect(0.0f, (getHeight() / 2.0f) - org.telegram.messenger.i0.L(14.0f), getWidth(), (getHeight() / 2.0f) + org.telegram.messenger.i0.L(14.0f), org.telegram.messenger.i0.L(14.0f), org.telegram.messenger.i0.L(14.0f), paint2);
                super.onDraw(canvas);
                return;
            case 3:
                super.onDraw(canvas);
                if (((org.telegram.ui.f) this.f3125c).f36939x) {
                    RectF rectF = org.telegram.messenger.i0.P;
                    rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    ((org.telegram.ui.Components.voip.g) this.f3124b).a(getMeasuredHeight() / 2.0f, canvas, rectF, null);
                    invalidate();
                    return;
                }
                return;
            case 4:
                Paint paint3 = (Paint) this.f3124b;
                paint3.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Ci, ((bi) this.f3125c).I0));
                canvas.drawRoundRect(0.0f, (getHeight() / 2.0f) - org.telegram.messenger.i0.L(14.0f), getWidth(), (getHeight() / 2.0f) + org.telegram.messenger.i0.L(14.0f), org.telegram.messenger.i0.L(14.0f), org.telegram.messenger.i0.L(14.0f), paint3);
                super.onDraw(canvas);
                return;
            case 5:
                if (((kg.f2) this.f3124b) != null) {
                    canvas.save();
                    canvas.clipPath((Path) this.f3125c);
                    ((kg.f2) this.f3124b).d(canvas);
                    canvas.restore();
                    invalidate();
                }
                super.onDraw(canvas);
                return;
            case 7:
                RectF rectF2 = (RectF) this.f3124b;
                rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                org.telegram.ui.Components.voip.y0 y0Var = (org.telegram.ui.Components.voip.y0) this.f3125c;
                y0Var.d(((View) getParent()).getX() + getX(), ((View) getParent()).getY() + getY());
                canvas.drawRoundRect(rectF2, org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f), y0Var.b());
                super.onDraw(canvas);
                return;
            case 8:
                RectF rectF3 = org.telegram.messenger.i0.P;
                rectF3.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                Paint[] paintArr = (Paint[]) this.f3124b;
                org.telegram.ui.Components.voip.f0 f0Var = (org.telegram.ui.Components.voip.f0) this.f3125c;
                paintArr[f0Var.f31482y].setAlpha(255);
                canvas.drawRoundRect(rectF3, org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(6.0f), paintArr[f0Var.f31482y]);
                float f7 = f0Var.f31481x;
                if (f7 > 0.0f) {
                    int i10 = f0Var.f31482y;
                    if (i10 + 1 < paintArr.length) {
                        paintArr[i10 + 1].setAlpha((int) (f7 * 255.0f));
                        canvas.drawRoundRect(rectF3, org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(6.0f), paintArr[f0Var.f31482y + 1]);
                    }
                }
                super.onDraw(canvas);
                return;
            case 9:
                super.onDraw(canvas);
                RectF rectF4 = org.telegram.messenger.i0.P;
                rectF4.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                ((org.telegram.ui.Components.voip.g) this.f3124b).a(getMeasuredHeight() / 2.0f, canvas, rectF4, null);
                invalidate();
                return;
            case 12:
                Paint paint4 = (Paint) this.f3124b;
                paint4.setColor(((yh.l) this.f3125c).getThemedColor(org.telegram.ui.ActionBar.t6.Ci));
                canvas.drawRoundRect(0.0f, (getHeight() / 2.0f) - org.telegram.messenger.i0.L(14.0f), getWidth(), (getHeight() / 2.0f) + org.telegram.messenger.i0.L(14.0f), org.telegram.messenger.i0.L(14.0f), org.telegram.messenger.i0.L(14.0f), paint4);
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f3123a) {
            case 5:
                super.onLayout(z10, i10, i11, i12, i13);
                kg.f2 f2Var = new kg.f2(10);
                this.f3124b = f2Var;
                f2Var.O = 100;
                f2Var.J = false;
                f2Var.M = true;
                f2Var.G = false;
                f2Var.K = true;
                f2Var.H = true;
                f2Var.f11083r = 1;
                f2Var.f11087w = 0.98f;
                f2Var.v = 0.98f;
                f2Var.f11086u = 0.98f;
                f2Var.f11073g = false;
                f2Var.f11080o = 0.0f;
                f2Var.f11088x = 750L;
                f2Var.f11089y = 750;
                f2Var.c();
                RectF rectF = org.telegram.messenger.i0.P;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                ((kg.f2) this.f3124b).f11069a.set(rectF);
                ((kg.f2) this.f3124b).f11070b.set(rectF);
                ((kg.f2) this.f3124b).f();
                Path path = (Path) this.f3125c;
                path.reset();
                path.addRoundRect(rectF, getHeight() / 2.0f, getHeight() / 2.0f, Path.Direction.CW);
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f3123a) {
            case 6:
                super.onMeasure(i10, i11);
                a();
                return;
            case 9:
                if (View.MeasureSpec.getSize(i10) > org.telegram.messenger.i0.L(260.0f)) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(320.0f), 1073741824), i11);
                    return;
                } else {
                    super.onMeasure(i10, i11);
                    return;
                }
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public void onSizeChanged(int r18, int r19, int r20, int r21) {
        throw new UnsupportedOperationException("Method not decompiled: bi.j6.onSizeChanged(int, int, int, int):void");
    }

    @Override
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        switch (this.f3123a) {
            case 6:
                super.setText(charSequence, bufferType);
                a();
                return;
            default:
                super.setText(charSequence, bufferType);
                return;
        }
    }

    @Override
    public void setTextColor(int i10) {
        switch (this.f3123a) {
            case 6:
                super.setTextColor(org.telegram.ui.ActionBar.t6.r1(0.2f, i10));
                ((t80) this.f3125c).g(org.telegram.ui.ActionBar.t6.r1(0.03f, i10), org.telegram.ui.ActionBar.t6.r1(0.175f, i10), org.telegram.ui.ActionBar.t6.r1(0.2f, i10), org.telegram.ui.ActionBar.t6.r1(0.45f, i10));
                return;
            default:
                super.setTextColor(i10);
                return;
        }
    }

    public j6(org.telegram.ui.Components.voip.f0 f0Var, Context context) {
        super(context);
        this.f3123a = 8;
        this.f3125c = f0Var;
        this.f3124b = new Paint[f0Var.f31476f.length];
        int i10 = 0;
        while (true) {
            Paint[] paintArr = (Paint[]) this.f3124b;
            if (i10 >= paintArr.length) {
                return;
            }
            paintArr[i10] = new Paint(1);
            i10++;
        }
    }

    public j6(q6 q6Var, Context context) {
        super(context);
        this.f3123a = 0;
        this.f3125c = q6Var;
        this.f3124b = new Paint(1);
    }

    public j6(Context context, int i10) {
        super(context);
        this.f3123a = i10;
        switch (i10) {
            case 6:
                super(context);
                k80 k80Var = new k80(0);
                this.f3124b = k80Var;
                t80 t80Var = new t80();
                this.f3125c = t80Var;
                t80Var.f30593y = k80Var;
                t80Var.f30590u = 0.65f;
                t80Var.k(4.0f);
                setBackground(t80Var);
                return;
            default:
                this.f3125c = new Path();
                return;
        }
    }

    public j6(lh.g gVar, Context context) {
        super(context);
        this.f3123a = 2;
        this.f3125c = gVar;
        this.f3124b = new Paint(1);
    }

    public j6(yh.l lVar, Context context) {
        super(context);
        this.f3123a = 12;
        this.f3125c = lVar;
        this.f3124b = new Paint(1);
    }

    public j6(r60 r60Var, Context context) {
        super(context);
        this.f3123a = 9;
        this.f3125c = r60Var;
        org.telegram.ui.Components.voip.g gVar = new org.telegram.ui.Components.voip.g();
        this.f3124b = gVar;
        gVar.f31498k = false;
        gVar.f31500m = 2.0f;
    }

    public j6(org.telegram.ui.f fVar, Context context) {
        super(context);
        this.f3123a = 3;
        this.f3125c = fVar;
        org.telegram.ui.Components.voip.g gVar = new org.telegram.ui.Components.voip.g();
        this.f3124b = gVar;
        gVar.f31498k = false;
        gVar.f31500m = 2.0f;
    }

    public j6(uh.i iVar, Context context) {
        super(context);
        this.f3123a = 10;
        this.f3125c = iVar;
        this.f3124b = new Paint(1);
    }

    public j6(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.f3123a = 11;
        this.f3125c = p6Var;
        this.f3124b = new Paint(1);
    }

    public j6(kg.p0 p0Var, Context context) {
        super(context);
        this.f3123a = 1;
        this.f3125c = p0Var;
        this.f3124b = new Paint(1);
    }

    public j6(bi biVar, Context context) {
        super(context);
        this.f3123a = 4;
        this.f3125c = biVar;
        this.f3124b = new Paint(1);
    }
}
