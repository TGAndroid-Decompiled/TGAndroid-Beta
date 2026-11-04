package fi;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.Layout;
import android.view.View;
import android.widget.TextView;
import mi.b6;
import org.telegram.messenger.bd;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.voip.f0;
import org.telegram.ui.Components.voip.x0;
import org.telegram.ui.Components.w70;
import org.telegram.ui.o50;
import vg.h0;
import vg.i0;
import vg.s1;
public final class j extends TextView {
    public final int f11605a;
    public Object f11606b;
    public final Object f11607c;

    public j(Activity activity, x0 x0Var) {
        super(activity);
        this.f11605a = 8;
        this.f11606b = new RectF();
        this.f11607c = x0Var;
        x0Var.a(this);
        setText(bd.M0(2131743313, null));
        setContentDescription(bd.M0(2131743313, null));
        setTextColor(-1);
        setTypeface(g0.o());
        setPadding(g0.L(14.0f), g0.L(4.0f), g0.L(14.0f), g0.L(4.0f));
    }

    public void a() {
        w70 w70Var = (w70) this.f11607c;
        n70 n70Var = (n70) this.f11606b;
        if (n70Var != null && w70Var != null) {
            n70Var.rewind();
            if (getLayout() != null && getLayout().getText() != null) {
                n70Var.e(getLayout(), 0, getPaddingLeft(), getPaddingTop());
                getLayout().getSelectionPath(0, getLayout().getText().length(), n70Var);
            }
            w70Var.l();
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        int i3 = this.f11605a;
        Object obj = this.f11607c;
        switch (i3) {
            case 0:
                Paint paint = (Paint) this.f11606b;
                int L = g0.L(1.0f) + (getHeight() / 2);
                int max = Math.max(1, g0.L(0.66f));
                Layout layout = getLayout();
                if (layout != null) {
                    paint.setColor(k6.r1(0.45f, k6.w0(k6.f28273y6, ((m) obj).f11616a0.f11633c)));
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
                Paint paint2 = (Paint) this.f11606b;
                int L2 = g0.L(1.0f) + (getHeight() / 2);
                int max2 = Math.max(1, g0.L(0.66f));
                Layout layout2 = getLayout();
                if (layout2 != null) {
                    paint2.setColor(k6.r1(0.45f, k6.w0(k6.f28273y6, (e6) obj)));
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
                Paint paint3 = (Paint) this.f11606b;
                int i10 = k6.f28290z6;
                i0 i0Var = ((h0) obj).f56623e;
                int i11 = i0.P2;
                paint3.setColor(k6.r1(0.8f, k6.w0(i10, i0Var.J0)));
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
        switch (this.f11605a) {
            case 4:
                ((org.telegram.ui.g) this.f11607c).f45413b.draw(canvas);
                super.draw(canvas);
                return;
            case 10:
                ((o50) this.f11607c).h.draw(canvas);
                super.draw(canvas);
                return;
            default:
                super.draw(canvas);
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f11605a) {
            case 7:
                super.onDetachedFromWindow();
                ((w70) this.f11607c).f39925b = -1L;
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f11605a) {
            case 2:
                Paint paint = (Paint) this.f11606b;
                paint.setColor(((ji.n) this.f11607c).getThemedColor(k6.Ci));
                canvas.drawRoundRect(0.0f, (getHeight() / 2.0f) - g0.L(14.0f), getWidth(), (getHeight() / 2.0f) + g0.L(14.0f), g0.L(14.0f), g0.L(14.0f), paint);
                super.onDraw(canvas);
                return;
            case 3:
                Paint paint2 = (Paint) this.f11606b;
                mi.a aVar = ((b6) this.f11607c).f19491y;
                if (aVar != null && aVar.f19432c > 0 && aVar.d == 0 && !aVar.f19433e) {
                    paint2.setColor(getCurrentTextColor());
                    float baseline = getBaseline() - (getTextSize() * 0.35f);
                    canvas.drawCircle(getWidth() / 2.0f, baseline, g0.N(4.3f) / 2.0f, paint2);
                    return;
                }
                super.onDraw(canvas);
                return;
            case 4:
                super.onDraw(canvas);
                if (((org.telegram.ui.g) this.f11607c).f45421x) {
                    RectF rectF = g0.P;
                    rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    ((org.telegram.ui.Components.voip.g) this.f11606b).a(getMeasuredHeight() / 2.0f, canvas, rectF, null);
                    invalidate();
                    return;
                }
                return;
            case 5:
                Paint paint3 = (Paint) this.f11606b;
                paint3.setColor(k6.w0(k6.Ci, ((bi) this.f11607c).J0));
                canvas.drawRoundRect(0.0f, (getHeight() / 2.0f) - g0.L(14.0f), getWidth(), (getHeight() / 2.0f) + g0.L(14.0f), g0.L(14.0f), g0.L(14.0f), paint3);
                super.onDraw(canvas);
                return;
            case 6:
                if (((s1) this.f11606b) != null) {
                    canvas.save();
                    canvas.clipPath((Path) this.f11607c);
                    ((s1) this.f11606b).d(canvas);
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
                RectF rectF2 = (RectF) this.f11606b;
                rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                x0 x0Var = (x0) this.f11607c;
                x0Var.d(((View) getParent()).getX() + getX(), ((View) getParent()).getY() + getY());
                canvas.drawRoundRect(rectF2, g0.L(16.0f), g0.L(16.0f), x0Var.b());
                super.onDraw(canvas);
                return;
            case 9:
                RectF rectF3 = g0.P;
                rectF3.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                Paint[] paintArr = (Paint[]) this.f11606b;
                f0 f0Var = (f0) this.f11607c;
                paintArr[f0Var.f39335y].setAlpha(255);
                canvas.drawRoundRect(rectF3, g0.L(6.0f), g0.L(6.0f), paintArr[f0Var.f39335y]);
                float f10 = f0Var.f39334x;
                if (f10 > 0.0f) {
                    int i3 = f0Var.f39335y;
                    if (i3 + 1 < paintArr.length) {
                        paintArr[i3 + 1].setAlpha((int) (f10 * 255.0f));
                        canvas.drawRoundRect(rectF3, g0.L(6.0f), g0.L(6.0f), paintArr[f0Var.f39335y + 1]);
                    }
                }
                super.onDraw(canvas);
                return;
            case 10:
                super.onDraw(canvas);
                RectF rectF4 = g0.P;
                rectF4.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                ((org.telegram.ui.Components.voip.g) this.f11606b).a(getMeasuredHeight() / 2.0f, canvas, rectF4, null);
                invalidate();
                return;
            case 12:
                Paint paint4 = (Paint) this.f11606b;
                paint4.setColor(k6.w0(k6.Ci, ((wh.h) this.f11607c).J0));
                canvas.drawRoundRect(0.0f, (getHeight() / 2.0f) - g0.L(14.0f), getWidth(), (getHeight() / 2.0f) + g0.L(14.0f), g0.L(14.0f), g0.L(14.0f), paint4);
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        switch (this.f11605a) {
            case 6:
                super.onLayout(z10, i3, i10, i11, i12);
                s1 s1Var = new s1(10);
                this.f11606b = s1Var;
                s1Var.O = 100;
                s1Var.J = false;
                s1Var.M = true;
                s1Var.G = false;
                s1Var.K = true;
                s1Var.H = true;
                s1Var.f56844r = 1;
                s1Var.f56848w = 0.98f;
                s1Var.v = 0.98f;
                s1Var.f56847u = 0.98f;
                s1Var.f56834g = false;
                s1Var.f56841o = 0.0f;
                s1Var.f56849x = 750L;
                s1Var.f56850y = 750;
                s1Var.c();
                RectF rectF = g0.P;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                ((s1) this.f11606b).f56829a.set(rectF);
                ((s1) this.f11606b).f56830b.set(rectF);
                ((s1) this.f11606b).f();
                Path path = (Path) this.f11607c;
                path.reset();
                path.addRoundRect(rectF, getHeight() / 2.0f, getHeight() / 2.0f, Path.Direction.CW);
                return;
            default:
                super.onLayout(z10, i3, i10, i11, i12);
                return;
        }
    }

    @Override
    public void onMeasure(int i3, int i10) {
        switch (this.f11605a) {
            case 7:
                super.onMeasure(i3, i10);
                a();
                return;
            case 10:
                if (View.MeasureSpec.getSize(i3) > g0.L(260.0f)) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(g0.L(320.0f), 1073741824), i10);
                    return;
                } else {
                    super.onMeasure(i3, i10);
                    return;
                }
            default:
                super.onMeasure(i3, i10);
                return;
        }
    }

    @Override
    public void onSizeChanged(int r18, int r19, int r20, int r21) {
        throw new UnsupportedOperationException("Method not decompiled: fi.j.onSizeChanged(int, int, int, int):void");
    }

    @Override
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        switch (this.f11605a) {
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
    public void setTextColor(int i3) {
        switch (this.f11605a) {
            case 7:
                super.setTextColor(k6.r1(0.2f, i3));
                ((w70) this.f11607c).g(k6.r1(0.03f, i3), k6.r1(0.175f, i3), k6.r1(0.2f, i3), k6.r1(0.45f, i3));
                return;
            default:
                super.setTextColor(i3);
                return;
        }
    }

    public j(f0 f0Var, Context context) {
        super(context);
        this.f11605a = 9;
        this.f11607c = f0Var;
        this.f11606b = new Paint[f0Var.f39329f.length];
        int i3 = 0;
        while (true) {
            Paint[] paintArr = (Paint[]) this.f11606b;
            if (i3 >= paintArr.length) {
                return;
            }
            paintArr[i3] = new Paint(1);
            i3++;
        }
    }

    public j(b6 b6Var, Context context) {
        super(context);
        this.f11605a = 3;
        this.f11607c = b6Var;
        this.f11606b = new Paint(1);
    }

    public j(Context context, int i3) {
        super(context);
        this.f11605a = i3;
        switch (i3) {
            case 7:
                super(context);
                n70 n70Var = new n70(0);
                this.f11606b = n70Var;
                w70 w70Var = new w70();
                this.f11607c = w70Var;
                w70Var.f39945y = n70Var;
                w70Var.f39942u = 0.65f;
                w70Var.k(4.0f);
                setBackground(w70Var);
                return;
            default:
                this.f11607c = new Path();
                return;
        }
    }

    public j(wh.h hVar, Context context) {
        super(context);
        this.f11605a = 12;
        this.f11607c = hVar;
        this.f11606b = new Paint(1);
    }

    public j(ji.n nVar, Context context) {
        super(context);
        this.f11605a = 2;
        this.f11607c = nVar;
        this.f11606b = new Paint(1);
    }

    public j(o50 o50Var, Context context) {
        super(context);
        this.f11605a = 10;
        this.f11607c = o50Var;
        org.telegram.ui.Components.voip.g gVar = new org.telegram.ui.Components.voip.g();
        this.f11606b = gVar;
        gVar.f39353k = false;
        gVar.f39355m = 2.0f;
    }

    public j(org.telegram.ui.g gVar, Context context) {
        super(context);
        this.f11605a = 4;
        this.f11607c = gVar;
        org.telegram.ui.Components.voip.g gVar2 = new org.telegram.ui.Components.voip.g();
        this.f11606b = gVar2;
        gVar2.f39353k = false;
        gVar2.f39355m = 2.0f;
    }

    public j(m mVar, Context context) {
        super(context);
        this.f11605a = 0;
        this.f11607c = mVar;
        this.f11606b = new Paint(1);
    }

    public j(Context context, e6 e6Var) {
        super(context);
        this.f11605a = 1;
        this.f11607c = e6Var;
        this.f11606b = new Paint(1);
    }

    public j(h0 h0Var, Context context) {
        super(context);
        this.f11605a = 11;
        this.f11607c = h0Var;
        this.f11606b = new Paint(1);
    }

    public j(bi biVar, Context context) {
        super(context);
        this.f11605a = 5;
        this.f11607c = biVar;
        this.f11606b = new Paint(1);
    }
}
