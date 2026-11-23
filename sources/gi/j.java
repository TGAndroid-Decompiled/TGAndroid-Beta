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
import oi.a6;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.h80;
import org.telegram.ui.Components.q80;
import org.telegram.ui.Components.ui;
import org.telegram.ui.Components.voip.l1;
import org.telegram.ui.Components.voip.w0;
import org.telegram.ui.v50;
import ug.j0;
import ug.k0;
import ug.s1;
public final class j extends TextView {
    public final int f13670a;
    public Object f13671b;
    public final Object f13672c;

    public j(Activity activity, l1 l1Var) {
        super(activity);
        this.f13670a = 8;
        this.f13671b = new RectF();
        this.f13672c = l1Var;
        l1Var.a(this);
        setText(hd.N0(2131743058, null));
        setContentDescription(hd.N0(2131743058, null));
        setTextColor(-1);
        setTypeface(g0.o());
        setPadding(g0.L(14.0f), g0.L(4.0f), g0.L(14.0f), g0.L(4.0f));
    }

    public void a() {
        q80 q80Var = (q80) this.f13672c;
        h80 h80Var = (h80) this.f13671b;
        if (h80Var != null && q80Var != null) {
            h80Var.rewind();
            if (getLayout() != null && getLayout().getText() != null) {
                h80Var.e(getLayout(), 0, getPaddingLeft(), getPaddingTop());
                getLayout().getSelectionPath(0, getLayout().getText().length(), h80Var);
            }
            q80Var.l();
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        int i7 = this.f13670a;
        Object obj = this.f13672c;
        switch (i7) {
            case 0:
                Paint paint = (Paint) this.f13671b;
                int L = g0.L(1.0f) + (getHeight() / 2);
                int max = Math.max(1, g0.L(0.66f));
                Layout layout = getLayout();
                if (layout != null) {
                    paint.setColor(m6.r1(0.45f, m6.w0(m6.f29773y6, ((m) obj).f13681a0.f13698c)));
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
                Paint paint2 = (Paint) this.f13671b;
                int L2 = g0.L(1.0f) + (getHeight() / 2);
                int max2 = Math.max(1, g0.L(0.66f));
                Layout layout2 = getLayout();
                if (layout2 != null) {
                    paint2.setColor(m6.r1(0.45f, m6.w0(m6.f29773y6, (h6) obj)));
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
                Paint paint3 = (Paint) this.f13671b;
                int i10 = m6.f29792z6;
                k0 k0Var = ((j0) obj).f58755e;
                int i11 = k0.S2;
                paint3.setColor(m6.r1(0.8f, m6.w0(i10, k0Var.J0)));
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
        switch (this.f13670a) {
            case 4:
                ((org.telegram.ui.g) this.f13672c).f47885b.draw(canvas);
                super.draw(canvas);
                return;
            case 10:
                ((v50) this.f13672c).h.draw(canvas);
                super.draw(canvas);
                return;
            default:
                super.draw(canvas);
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f13670a) {
            case 7:
                super.onDetachedFromWindow();
                ((q80) this.f13672c).f38813b = -1L;
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f13670a) {
            case 2:
                Paint paint = (Paint) this.f13671b;
                paint.setColor(((li.p) this.f13672c).getThemedColor(m6.Fi));
                canvas.drawRoundRect(0.0f, (getHeight() / 2.0f) - g0.L(14.0f), getWidth(), (getHeight() / 2.0f) + g0.L(14.0f), g0.L(14.0f), g0.L(14.0f), paint);
                super.onDraw(canvas);
                return;
            case 3:
                Paint paint2 = (Paint) this.f13671b;
                oi.a aVar = ((a6) this.f13672c).f21978y;
                if (aVar != null && aVar.f21936c > 0 && aVar.d == 0 && !aVar.f21937e) {
                    paint2.setColor(getCurrentTextColor());
                    float baseline = getBaseline() - (getTextSize() * 0.35f);
                    canvas.drawCircle(getWidth() / 2.0f, baseline, g0.N(4.3f) / 2.0f, paint2);
                    return;
                }
                super.onDraw(canvas);
                return;
            case 4:
                super.onDraw(canvas);
                if (((org.telegram.ui.g) this.f13672c).f47893x) {
                    RectF rectF = g0.P;
                    rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    ((org.telegram.ui.Components.voip.n) this.f13671b).a(getMeasuredHeight() / 2.0f, canvas, rectF, null);
                    invalidate();
                    return;
                }
                return;
            case 5:
                Paint paint3 = (Paint) this.f13671b;
                paint3.setColor(m6.w0(m6.Fi, ((ui) this.f13672c).J0));
                canvas.drawRoundRect(0.0f, (getHeight() / 2.0f) - g0.L(14.0f), getWidth(), (getHeight() / 2.0f) + g0.L(14.0f), g0.L(14.0f), g0.L(14.0f), paint3);
                super.onDraw(canvas);
                return;
            case 6:
                if (((s1) this.f13671b) != null) {
                    canvas.save();
                    canvas.clipPath((Path) this.f13672c);
                    ((s1) this.f13671b).d(canvas);
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
                RectF rectF2 = (RectF) this.f13671b;
                rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                l1 l1Var = (l1) this.f13672c;
                l1Var.d(((View) getParent()).getX() + getX(), ((View) getParent()).getY() + getY());
                canvas.drawRoundRect(rectF2, g0.L(16.0f), g0.L(16.0f), l1Var.b());
                super.onDraw(canvas);
                return;
            case 9:
                RectF rectF3 = g0.P;
                rectF3.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                Paint[] paintArr = (Paint[]) this.f13671b;
                w0 w0Var = (w0) this.f13672c;
                paintArr[w0Var.f41425y].setAlpha(255);
                canvas.drawRoundRect(rectF3, g0.L(6.0f), g0.L(6.0f), paintArr[w0Var.f41425y]);
                float f10 = w0Var.f41424x;
                if (f10 > 0.0f) {
                    int i7 = w0Var.f41425y;
                    if (i7 + 1 < paintArr.length) {
                        paintArr[i7 + 1].setAlpha((int) (f10 * 255.0f));
                        canvas.drawRoundRect(rectF3, g0.L(6.0f), g0.L(6.0f), paintArr[w0Var.f41425y + 1]);
                    }
                }
                super.onDraw(canvas);
                return;
            case 10:
                super.onDraw(canvas);
                RectF rectF4 = g0.P;
                rectF4.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                ((org.telegram.ui.Components.voip.n) this.f13671b).a(getMeasuredHeight() / 2.0f, canvas, rectF4, null);
                invalidate();
                return;
            case 12:
                Paint paint4 = (Paint) this.f13671b;
                paint4.setColor(m6.w0(m6.Fi, ((vh.g) this.f13672c).J0));
                canvas.drawRoundRect(0.0f, (getHeight() / 2.0f) - g0.L(14.0f), getWidth(), (getHeight() / 2.0f) + g0.L(14.0f), g0.L(14.0f), g0.L(14.0f), paint4);
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        switch (this.f13670a) {
            case 6:
                super.onLayout(z10, i7, i10, i11, i12);
                s1 s1Var = new s1(10);
                this.f13671b = s1Var;
                s1Var.O = 100;
                s1Var.J = false;
                s1Var.M = true;
                s1Var.G = false;
                s1Var.K = true;
                s1Var.H = true;
                s1Var.f58946r = 1;
                s1Var.f58950w = 0.98f;
                s1Var.v = 0.98f;
                s1Var.f58949u = 0.98f;
                s1Var.f58936g = false;
                s1Var.f58943o = 0.0f;
                s1Var.f58951x = 750L;
                s1Var.f58952y = 750;
                s1Var.c();
                RectF rectF = g0.P;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                ((s1) this.f13671b).f58931a.set(rectF);
                ((s1) this.f13671b).f58932b.set(rectF);
                ((s1) this.f13671b).f();
                Path path = (Path) this.f13672c;
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
        switch (this.f13670a) {
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
        switch (this.f13670a) {
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
        switch (this.f13670a) {
            case 7:
                super.setTextColor(m6.r1(0.2f, i7));
                ((q80) this.f13672c).g(m6.r1(0.03f, i7), m6.r1(0.175f, i7), m6.r1(0.2f, i7), m6.r1(0.45f, i7));
                return;
            default:
                super.setTextColor(i7);
                return;
        }
    }

    public j(w0 w0Var, Context context) {
        super(context);
        this.f13670a = 9;
        this.f13672c = w0Var;
        this.f13671b = new Paint[w0Var.f41419f.length];
        int i7 = 0;
        while (true) {
            Paint[] paintArr = (Paint[]) this.f13671b;
            if (i7 >= paintArr.length) {
                return;
            }
            paintArr[i7] = new Paint(1);
            i7++;
        }
    }

    public j(a6 a6Var, Context context) {
        super(context);
        this.f13670a = 3;
        this.f13672c = a6Var;
        this.f13671b = new Paint(1);
    }

    public j(Context context, int i7) {
        super(context);
        this.f13670a = i7;
        switch (i7) {
            case 7:
                super(context);
                h80 h80Var = new h80(0);
                this.f13671b = h80Var;
                q80 q80Var = new q80();
                this.f13672c = q80Var;
                q80Var.f38833y = h80Var;
                q80Var.f38830u = 0.65f;
                q80Var.k(4.0f);
                setBackground(q80Var);
                return;
            default:
                this.f13672c = new Path();
                return;
        }
    }

    public j(vh.g gVar, Context context) {
        super(context);
        this.f13670a = 12;
        this.f13672c = gVar;
        this.f13671b = new Paint(1);
    }

    public j(li.p pVar, Context context) {
        super(context);
        this.f13670a = 2;
        this.f13672c = pVar;
        this.f13671b = new Paint(1);
    }

    public j(v50 v50Var, Context context) {
        super(context);
        this.f13670a = 10;
        this.f13672c = v50Var;
        org.telegram.ui.Components.voip.n nVar = new org.telegram.ui.Components.voip.n();
        this.f13671b = nVar;
        nVar.f41190k = false;
        nVar.f41192m = 2.0f;
    }

    public j(org.telegram.ui.g gVar, Context context) {
        super(context);
        this.f13670a = 4;
        this.f13672c = gVar;
        org.telegram.ui.Components.voip.n nVar = new org.telegram.ui.Components.voip.n();
        this.f13671b = nVar;
        nVar.f41190k = false;
        nVar.f41192m = 2.0f;
    }

    public j(m mVar, Context context) {
        super(context);
        this.f13670a = 0;
        this.f13672c = mVar;
        this.f13671b = new Paint(1);
    }

    public j(Context context, h6 h6Var) {
        super(context);
        this.f13670a = 1;
        this.f13672c = h6Var;
        this.f13671b = new Paint(1);
    }

    public j(j0 j0Var, Context context) {
        super(context);
        this.f13670a = 11;
        this.f13672c = j0Var;
        this.f13671b = new Paint(1);
    }

    public j(ui uiVar, Context context) {
        super(context);
        this.f13670a = 5;
        this.f13672c = uiVar;
        this.f13671b = new Paint(1);
    }
}
