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
import org.telegram.messenger.gd;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.e80;
import org.telegram.ui.Components.n80;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.voip.m1;
import org.telegram.ui.Components.voip.x0;
import org.telegram.ui.v50;
import ug.j0;
import ug.k0;
import ug.s1;
public final class j extends TextView {
    public final int f13633a;
    public Object f13634b;
    public final Object f13635c;

    public j(Activity activity, m1 m1Var) {
        super(activity);
        this.f13633a = 8;
        this.f13634b = new RectF();
        this.f13635c = m1Var;
        m1Var.a(this);
        setText(gd.N0(2131743053, null));
        setContentDescription(gd.N0(2131743053, null));
        setTextColor(-1);
        setTypeface(g0.o());
        setPadding(g0.L(14.0f), g0.L(4.0f), g0.L(14.0f), g0.L(4.0f));
    }

    public void a() {
        n80 n80Var = (n80) this.f13635c;
        e80 e80Var = (e80) this.f13634b;
        if (e80Var != null && n80Var != null) {
            e80Var.rewind();
            if (getLayout() != null && getLayout().getText() != null) {
                e80Var.e(getLayout(), 0, getPaddingLeft(), getPaddingTop());
                getLayout().getSelectionPath(0, getLayout().getText().length(), e80Var);
            }
            n80Var.l();
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        int i7 = this.f13633a;
        Object obj = this.f13635c;
        switch (i7) {
            case 0:
                Paint paint = (Paint) this.f13634b;
                int L = g0.L(1.0f) + (getHeight() / 2);
                int max = Math.max(1, g0.L(0.66f));
                Layout layout = getLayout();
                if (layout != null) {
                    paint.setColor(n6.r1(0.45f, n6.w0(n6.f29843y6, ((m) obj).f13644a0.f13661c)));
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
                Paint paint2 = (Paint) this.f13634b;
                int L2 = g0.L(1.0f) + (getHeight() / 2);
                int max2 = Math.max(1, g0.L(0.66f));
                Layout layout2 = getLayout();
                if (layout2 != null) {
                    paint2.setColor(n6.r1(0.45f, n6.w0(n6.f29843y6, (i6) obj)));
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
                Paint paint3 = (Paint) this.f13634b;
                int i10 = n6.f29862z6;
                k0 k0Var = ((j0) obj).f58835e;
                int i11 = k0.S2;
                paint3.setColor(n6.r1(0.8f, n6.w0(i10, k0Var.J0)));
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
        switch (this.f13633a) {
            case 4:
                ((org.telegram.ui.g) this.f13635c).f48000b.draw(canvas);
                super.draw(canvas);
                return;
            case 10:
                ((v50) this.f13635c).h.draw(canvas);
                super.draw(canvas);
                return;
            default:
                super.draw(canvas);
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f13633a) {
            case 7:
                super.onDetachedFromWindow();
                ((n80) this.f13635c).f37710b = -1L;
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f13633a) {
            case 2:
                Paint paint = (Paint) this.f13634b;
                paint.setColor(((li.o) this.f13635c).getThemedColor(n6.Fi));
                canvas.drawRoundRect(0.0f, (getHeight() / 2.0f) - g0.L(14.0f), getWidth(), (getHeight() / 2.0f) + g0.L(14.0f), g0.L(14.0f), g0.L(14.0f), paint);
                super.onDraw(canvas);
                return;
            case 3:
                Paint paint2 = (Paint) this.f13634b;
                oi.a aVar = ((a6) this.f13635c).f22044y;
                if (aVar != null && aVar.f22002c > 0 && aVar.d == 0 && !aVar.f22003e) {
                    paint2.setColor(getCurrentTextColor());
                    float baseline = getBaseline() - (getTextSize() * 0.35f);
                    canvas.drawCircle(getWidth() / 2.0f, baseline, g0.N(4.3f) / 2.0f, paint2);
                    return;
                }
                super.onDraw(canvas);
                return;
            case 4:
                super.onDraw(canvas);
                if (((org.telegram.ui.g) this.f13635c).f48008x) {
                    RectF rectF = g0.P;
                    rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    ((org.telegram.ui.Components.voip.n) this.f13634b).a(getMeasuredHeight() / 2.0f, canvas, rectF, null);
                    invalidate();
                    return;
                }
                return;
            case 5:
                Paint paint3 = (Paint) this.f13634b;
                paint3.setColor(n6.w0(n6.Fi, ((ti) this.f13635c).J0));
                canvas.drawRoundRect(0.0f, (getHeight() / 2.0f) - g0.L(14.0f), getWidth(), (getHeight() / 2.0f) + g0.L(14.0f), g0.L(14.0f), g0.L(14.0f), paint3);
                super.onDraw(canvas);
                return;
            case 6:
                if (((s1) this.f13634b) != null) {
                    canvas.save();
                    canvas.clipPath((Path) this.f13635c);
                    ((s1) this.f13634b).d(canvas);
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
                RectF rectF2 = (RectF) this.f13634b;
                rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                m1 m1Var = (m1) this.f13635c;
                m1Var.d(((View) getParent()).getX() + getX(), ((View) getParent()).getY() + getY());
                canvas.drawRoundRect(rectF2, g0.L(16.0f), g0.L(16.0f), m1Var.b());
                super.onDraw(canvas);
                return;
            case 9:
                RectF rectF3 = g0.P;
                rectF3.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                Paint[] paintArr = (Paint[]) this.f13634b;
                x0 x0Var = (x0) this.f13635c;
                paintArr[x0Var.f41321y].setAlpha(255);
                canvas.drawRoundRect(rectF3, g0.L(6.0f), g0.L(6.0f), paintArr[x0Var.f41321y]);
                float f10 = x0Var.f41320x;
                if (f10 > 0.0f) {
                    int i7 = x0Var.f41321y;
                    if (i7 + 1 < paintArr.length) {
                        paintArr[i7 + 1].setAlpha((int) (f10 * 255.0f));
                        canvas.drawRoundRect(rectF3, g0.L(6.0f), g0.L(6.0f), paintArr[x0Var.f41321y + 1]);
                    }
                }
                super.onDraw(canvas);
                return;
            case 10:
                super.onDraw(canvas);
                RectF rectF4 = g0.P;
                rectF4.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                ((org.telegram.ui.Components.voip.n) this.f13634b).a(getMeasuredHeight() / 2.0f, canvas, rectF4, null);
                invalidate();
                return;
            case 12:
                Paint paint4 = (Paint) this.f13634b;
                paint4.setColor(n6.w0(n6.Fi, ((vh.g) this.f13635c).J0));
                canvas.drawRoundRect(0.0f, (getHeight() / 2.0f) - g0.L(14.0f), getWidth(), (getHeight() / 2.0f) + g0.L(14.0f), g0.L(14.0f), g0.L(14.0f), paint4);
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        switch (this.f13633a) {
            case 6:
                super.onLayout(z10, i7, i10, i11, i12);
                s1 s1Var = new s1(10);
                this.f13634b = s1Var;
                s1Var.O = 100;
                s1Var.J = false;
                s1Var.M = true;
                s1Var.G = false;
                s1Var.K = true;
                s1Var.H = true;
                s1Var.f59026r = 1;
                s1Var.f59030w = 0.98f;
                s1Var.v = 0.98f;
                s1Var.f59029u = 0.98f;
                s1Var.f59016g = false;
                s1Var.f59023o = 0.0f;
                s1Var.f59031x = 750L;
                s1Var.f59032y = 750;
                s1Var.c();
                RectF rectF = g0.P;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                ((s1) this.f13634b).f59011a.set(rectF);
                ((s1) this.f13634b).f59012b.set(rectF);
                ((s1) this.f13634b).f();
                Path path = (Path) this.f13635c;
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
        switch (this.f13633a) {
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
        switch (this.f13633a) {
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
        switch (this.f13633a) {
            case 7:
                super.setTextColor(n6.r1(0.2f, i7));
                ((n80) this.f13635c).g(n6.r1(0.03f, i7), n6.r1(0.175f, i7), n6.r1(0.2f, i7), n6.r1(0.45f, i7));
                return;
            default:
                super.setTextColor(i7);
                return;
        }
    }

    public j(x0 x0Var, Context context) {
        super(context);
        this.f13633a = 9;
        this.f13635c = x0Var;
        this.f13634b = new Paint[x0Var.f41315f.length];
        int i7 = 0;
        while (true) {
            Paint[] paintArr = (Paint[]) this.f13634b;
            if (i7 >= paintArr.length) {
                return;
            }
            paintArr[i7] = new Paint(1);
            i7++;
        }
    }

    public j(a6 a6Var, Context context) {
        super(context);
        this.f13633a = 3;
        this.f13635c = a6Var;
        this.f13634b = new Paint(1);
    }

    public j(Context context, int i7) {
        super(context);
        this.f13633a = i7;
        switch (i7) {
            case 7:
                super(context);
                e80 e80Var = new e80(0);
                this.f13634b = e80Var;
                n80 n80Var = new n80();
                this.f13635c = n80Var;
                n80Var.f37730y = e80Var;
                n80Var.f37727u = 0.65f;
                n80Var.k(4.0f);
                setBackground(n80Var);
                return;
            default:
                this.f13635c = new Path();
                return;
        }
    }

    public j(vh.g gVar, Context context) {
        super(context);
        this.f13633a = 12;
        this.f13635c = gVar;
        this.f13634b = new Paint(1);
    }

    public j(li.o oVar, Context context) {
        super(context);
        this.f13633a = 2;
        this.f13635c = oVar;
        this.f13634b = new Paint(1);
    }

    public j(v50 v50Var, Context context) {
        super(context);
        this.f13633a = 10;
        this.f13635c = v50Var;
        org.telegram.ui.Components.voip.n nVar = new org.telegram.ui.Components.voip.n();
        this.f13634b = nVar;
        nVar.f41078k = false;
        nVar.f41080m = 2.0f;
    }

    public j(org.telegram.ui.g gVar, Context context) {
        super(context);
        this.f13633a = 4;
        this.f13635c = gVar;
        org.telegram.ui.Components.voip.n nVar = new org.telegram.ui.Components.voip.n();
        this.f13634b = nVar;
        nVar.f41078k = false;
        nVar.f41080m = 2.0f;
    }

    public j(m mVar, Context context) {
        super(context);
        this.f13633a = 0;
        this.f13635c = mVar;
        this.f13634b = new Paint(1);
    }

    public j(Context context, i6 i6Var) {
        super(context);
        this.f13633a = 1;
        this.f13635c = i6Var;
        this.f13634b = new Paint(1);
    }

    public j(j0 j0Var, Context context) {
        super(context);
        this.f13633a = 11;
        this.f13635c = j0Var;
        this.f13634b = new Paint(1);
    }

    public j(ti tiVar, Context context) {
        super(context);
        this.f13633a = 5;
        this.f13635c = tiVar;
        this.f13634b = new Paint(1);
    }
}
