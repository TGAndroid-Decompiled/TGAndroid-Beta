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
import oi.y5;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.d80;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.u70;
import org.telegram.ui.Components.voip.m1;
import org.telegram.ui.Components.voip.x0;
import org.telegram.ui.t50;
import ug.i0;
import ug.j0;
import ug.r1;
public final class j extends TextView {
    public final int f13326a;
    public Object f13327b;
    public final Object f13328c;

    public j(Activity activity, m1 m1Var) {
        super(activity);
        this.f13326a = 8;
        this.f13327b = new RectF();
        this.f13328c = m1Var;
        m1Var.a(this);
        setText(hd.M0(2131743303, null));
        setContentDescription(hd.M0(2131743303, null));
        setTextColor(-1);
        setTypeface(g0.o());
        setPadding(g0.L(14.0f), g0.L(4.0f), g0.L(14.0f), g0.L(4.0f));
    }

    public void a() {
        d80 d80Var = (d80) this.f13328c;
        u70 u70Var = (u70) this.f13327b;
        if (u70Var != null && d80Var != null) {
            u70Var.rewind();
            if (getLayout() != null && getLayout().getText() != null) {
                u70Var.e(getLayout(), 0, getPaddingLeft(), getPaddingTop());
                getLayout().getSelectionPath(0, getLayout().getText().length(), u70Var);
            }
            d80Var.l();
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        int i7 = this.f13326a;
        Object obj = this.f13328c;
        switch (i7) {
            case 0:
                Paint paint = (Paint) this.f13327b;
                int L = g0.L(1.0f) + (getHeight() / 2);
                int max = Math.max(1, g0.L(0.66f));
                Layout layout = getLayout();
                if (layout != null) {
                    paint.setColor(j6.r1(0.45f, j6.w0(j6.f29241y6, ((m) obj).f13337a0.f13354c)));
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
                Paint paint2 = (Paint) this.f13327b;
                int L2 = g0.L(1.0f) + (getHeight() / 2);
                int max2 = Math.max(1, g0.L(0.66f));
                Layout layout2 = getLayout();
                if (layout2 != null) {
                    paint2.setColor(j6.r1(0.45f, j6.w0(j6.f29241y6, (e6) obj)));
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
                Paint paint3 = (Paint) this.f13327b;
                int i10 = j6.f29260z6;
                j0 j0Var = ((i0) obj).f58122e;
                int i11 = j0.S2;
                paint3.setColor(j6.r1(0.8f, j6.w0(i10, j0Var.J0)));
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
        switch (this.f13326a) {
            case 4:
                ((org.telegram.ui.g) this.f13328c).f47248b.draw(canvas);
                super.draw(canvas);
                return;
            case 10:
                ((t50) this.f13328c).h.draw(canvas);
                super.draw(canvas);
                return;
            default:
                super.draw(canvas);
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f13326a) {
            case 7:
                super.onDetachedFromWindow();
                ((d80) this.f13328c).f33865b = -1L;
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f13326a) {
            case 2:
                Paint paint = (Paint) this.f13327b;
                paint.setColor(((li.n) this.f13328c).getThemedColor(j6.Fi));
                canvas.drawRoundRect(0.0f, (getHeight() / 2.0f) - g0.L(14.0f), getWidth(), (getHeight() / 2.0f) + g0.L(14.0f), g0.L(14.0f), g0.L(14.0f), paint);
                super.onDraw(canvas);
                return;
            case 3:
                Paint paint2 = (Paint) this.f13327b;
                oi.a aVar = ((y5) this.f13328c).f22151y;
                if (aVar != null && aVar.f21545c > 0 && aVar.d == 0 && !aVar.f21546e) {
                    paint2.setColor(getCurrentTextColor());
                    float baseline = getBaseline() - (getTextSize() * 0.35f);
                    canvas.drawCircle(getWidth() / 2.0f, baseline, g0.N(4.3f) / 2.0f, paint2);
                    return;
                }
                super.onDraw(canvas);
                return;
            case 4:
                super.onDraw(canvas);
                if (((org.telegram.ui.g) this.f13328c).f47256x) {
                    RectF rectF = g0.P;
                    rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    ((org.telegram.ui.Components.voip.n) this.f13327b).a(getMeasuredHeight() / 2.0f, canvas, rectF, null);
                    invalidate();
                    return;
                }
                return;
            case 5:
                Paint paint3 = (Paint) this.f13327b;
                paint3.setColor(j6.w0(j6.Fi, ((ki) this.f13328c).J0));
                canvas.drawRoundRect(0.0f, (getHeight() / 2.0f) - g0.L(14.0f), getWidth(), (getHeight() / 2.0f) + g0.L(14.0f), g0.L(14.0f), g0.L(14.0f), paint3);
                super.onDraw(canvas);
                return;
            case 6:
                if (((r1) this.f13327b) != null) {
                    canvas.save();
                    canvas.clipPath((Path) this.f13328c);
                    ((r1) this.f13327b).d(canvas);
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
                RectF rectF2 = (RectF) this.f13327b;
                rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                m1 m1Var = (m1) this.f13328c;
                m1Var.d(((View) getParent()).getX() + getX(), ((View) getParent()).getY() + getY());
                canvas.drawRoundRect(rectF2, g0.L(16.0f), g0.L(16.0f), m1Var.b());
                super.onDraw(canvas);
                return;
            case 9:
                RectF rectF3 = g0.P;
                rectF3.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                Paint[] paintArr = (Paint[]) this.f13327b;
                x0 x0Var = (x0) this.f13328c;
                paintArr[x0Var.f41042y].setAlpha(255);
                canvas.drawRoundRect(rectF3, g0.L(6.0f), g0.L(6.0f), paintArr[x0Var.f41042y]);
                float f10 = x0Var.f41041x;
                if (f10 > 0.0f) {
                    int i7 = x0Var.f41042y;
                    if (i7 + 1 < paintArr.length) {
                        paintArr[i7 + 1].setAlpha((int) (f10 * 255.0f));
                        canvas.drawRoundRect(rectF3, g0.L(6.0f), g0.L(6.0f), paintArr[x0Var.f41042y + 1]);
                    }
                }
                super.onDraw(canvas);
                return;
            case 10:
                super.onDraw(canvas);
                RectF rectF4 = g0.P;
                rectF4.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                ((org.telegram.ui.Components.voip.n) this.f13327b).a(getMeasuredHeight() / 2.0f, canvas, rectF4, null);
                invalidate();
                return;
            case 12:
                Paint paint4 = (Paint) this.f13327b;
                paint4.setColor(j6.w0(j6.Fi, ((vh.h) this.f13328c).J0));
                canvas.drawRoundRect(0.0f, (getHeight() / 2.0f) - g0.L(14.0f), getWidth(), (getHeight() / 2.0f) + g0.L(14.0f), g0.L(14.0f), g0.L(14.0f), paint4);
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        switch (this.f13326a) {
            case 6:
                super.onLayout(z10, i7, i10, i11, i12);
                r1 r1Var = new r1(10);
                this.f13327b = r1Var;
                r1Var.O = 100;
                r1Var.J = false;
                r1Var.M = true;
                r1Var.G = false;
                r1Var.K = true;
                r1Var.H = true;
                r1Var.f58320r = 1;
                r1Var.f58324w = 0.98f;
                r1Var.v = 0.98f;
                r1Var.f58323u = 0.98f;
                r1Var.f58310g = false;
                r1Var.f58317o = 0.0f;
                r1Var.f58325x = 750L;
                r1Var.f58326y = 750;
                r1Var.c();
                RectF rectF = g0.P;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                ((r1) this.f13327b).f58305a.set(rectF);
                ((r1) this.f13327b).f58306b.set(rectF);
                ((r1) this.f13327b).f();
                Path path = (Path) this.f13328c;
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
        switch (this.f13326a) {
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
        switch (this.f13326a) {
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
        switch (this.f13326a) {
            case 7:
                super.setTextColor(j6.r1(0.2f, i7));
                ((d80) this.f13328c).g(j6.r1(0.03f, i7), j6.r1(0.175f, i7), j6.r1(0.2f, i7), j6.r1(0.45f, i7));
                return;
            default:
                super.setTextColor(i7);
                return;
        }
    }

    public j(x0 x0Var, Context context) {
        super(context);
        this.f13326a = 9;
        this.f13328c = x0Var;
        this.f13327b = new Paint[x0Var.f41036f.length];
        int i7 = 0;
        while (true) {
            Paint[] paintArr = (Paint[]) this.f13327b;
            if (i7 >= paintArr.length) {
                return;
            }
            paintArr[i7] = new Paint(1);
            i7++;
        }
    }

    public j(y5 y5Var, Context context) {
        super(context);
        this.f13326a = 3;
        this.f13328c = y5Var;
        this.f13327b = new Paint(1);
    }

    public j(Context context, int i7) {
        super(context);
        this.f13326a = i7;
        switch (i7) {
            case 7:
                super(context);
                u70 u70Var = new u70(0);
                this.f13327b = u70Var;
                d80 d80Var = new d80();
                this.f13328c = d80Var;
                d80Var.f33885y = u70Var;
                d80Var.f33882u = 0.65f;
                d80Var.k(4.0f);
                setBackground(d80Var);
                return;
            default:
                this.f13328c = new Path();
                return;
        }
    }

    public j(vh.h hVar, Context context) {
        super(context);
        this.f13326a = 12;
        this.f13328c = hVar;
        this.f13327b = new Paint(1);
    }

    public j(li.n nVar, Context context) {
        super(context);
        this.f13326a = 2;
        this.f13328c = nVar;
        this.f13327b = new Paint(1);
    }

    public j(t50 t50Var, Context context) {
        super(context);
        this.f13326a = 10;
        this.f13328c = t50Var;
        org.telegram.ui.Components.voip.n nVar = new org.telegram.ui.Components.voip.n();
        this.f13327b = nVar;
        nVar.f40799k = false;
        nVar.f40801m = 2.0f;
    }

    public j(org.telegram.ui.g gVar, Context context) {
        super(context);
        this.f13326a = 4;
        this.f13328c = gVar;
        org.telegram.ui.Components.voip.n nVar = new org.telegram.ui.Components.voip.n();
        this.f13327b = nVar;
        nVar.f40799k = false;
        nVar.f40801m = 2.0f;
    }

    public j(m mVar, Context context) {
        super(context);
        this.f13326a = 0;
        this.f13328c = mVar;
        this.f13327b = new Paint(1);
    }

    public j(Context context, e6 e6Var) {
        super(context);
        this.f13326a = 1;
        this.f13328c = e6Var;
        this.f13327b = new Paint(1);
    }

    public j(i0 i0Var, Context context) {
        super(context);
        this.f13326a = 11;
        this.f13328c = i0Var;
        this.f13327b = new Paint(1);
    }

    public j(ki kiVar, Context context) {
        super(context);
        this.f13326a = 5;
        this.f13328c = kiVar;
        this.f13327b = new Paint(1);
    }
}
