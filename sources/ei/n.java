package ei;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.Layout;
import android.view.View;
import android.widget.TextView;
import li.d6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.ea0;
import org.telegram.ui.Components.t90;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.voip.v0;
import org.telegram.ui.r70;
import tg.i0;
import tg.j0;
import tg.w1;
public final class n extends TextView {
    public final int f9988a;
    public Object f9989b;
    public final Object f9990c;

    public n(v0 v0Var, Context context) {
        super(context);
        this.f9988a = 8;
        this.f9990c = v0Var;
        this.f9989b = new Paint[v0Var.f34248f.length];
        int i10 = 0;
        while (true) {
            Paint[] paintArr = (Paint[]) this.f9989b;
            if (i10 >= paintArr.length) {
                return;
            }
            paintArr[i10] = new Paint(1);
            i10++;
        }
    }

    public void a() {
        ea0 ea0Var = (ea0) this.f9990c;
        t90 t90Var = (t90) this.f9989b;
        if (t90Var != null && ea0Var != null) {
            t90Var.rewind();
            if (getLayout() != null && getLayout().getText() != null) {
                t90Var.e(getLayout(), 0, getPaddingLeft(), getPaddingTop());
                getLayout().getSelectionPath(0, getLayout().getText().length(), t90Var);
            }
            ea0Var.l();
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f9988a) {
            case 0:
                Paint paint = (Paint) this.f9989b;
                int dp = AndroidUtilities.dp(1.0f) + (getHeight() / 2);
                int max = Math.max(1, AndroidUtilities.dp(0.66f));
                Layout layout = getLayout();
                if (layout != null) {
                    paint.setColor(y6.o1(0.45f, y6.w0(y6.f23749y6, ((r) this.f9990c).W.f10016c)));
                    float f7 = dp;
                    float f10 = max / 2.0f;
                    float f11 = f7 - f10;
                    float f12 = f7 + f10;
                    canvas.drawRect(0.0f, f11, (getWidth() - (layout.getLineWidth(0) + AndroidUtilities.dp(16.0f))) / 2.0f, f12, paint);
                    canvas.drawRect(((layout.getLineWidth(0) + getWidth()) + AndroidUtilities.dp(16.0f)) / 2.0f, f11, getWidth(), f12, paint);
                }
                super.dispatchDraw(canvas);
                return;
            case 1:
                Paint paint2 = (Paint) this.f9989b;
                int dp2 = AndroidUtilities.dp(1.0f) + (getHeight() / 2);
                int max2 = Math.max(1, AndroidUtilities.dp(0.66f));
                Layout layout2 = getLayout();
                if (layout2 != null) {
                    paint2.setColor(y6.o1(0.45f, y6.w0(y6.f23749y6, (u6) this.f9990c)));
                    float f13 = dp2;
                    float f14 = max2 / 2.0f;
                    float f15 = f13 - f14;
                    float f16 = f13 + f14;
                    canvas.drawRect(0.0f, f15, (getWidth() - (layout2.getLineWidth(0) + AndroidUtilities.dp(16.0f))) / 2.0f, f16, paint2);
                    canvas.drawRect(((layout2.getLineWidth(0) + getWidth()) + AndroidUtilities.dp(16.0f)) / 2.0f, f15, getWidth(), f16, paint2);
                }
                super.dispatchDraw(canvas);
                return;
            case 10:
                Paint paint3 = (Paint) this.f9989b;
                paint3.setColor(y6.o1(0.8f, y6.w0(y6.f23768z6, j0.X0(((i0) this.f9990c).e))));
                paint3.setStyle(Paint.Style.STROKE);
                paint3.setStrokeWidth(1.0f);
                float height = getHeight() / 2.0f;
                Layout layout3 = getLayout();
                int i10 = 0;
                for (int i11 = 0; i11 < layout3.getLineCount(); i11++) {
                    i10 = Math.max(i10, (int) layout3.getLineWidth(i11));
                }
                float f17 = i10 / 2.0f;
                canvas.drawLine(0.0f, height, ((getWidth() / 2.0f) - f17) - AndroidUtilities.dp(8.0f), height, paint3);
                canvas.drawLine((getWidth() / 2.0f) + f17 + AndroidUtilities.dp(8.0f), height, getWidth(), height, paint3);
                super.dispatchDraw(canvas);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f9988a) {
            case 4:
                ((org.telegram.ui.g) this.f9990c).f39454b.draw(canvas);
                super.draw(canvas);
                return;
            case 9:
                ((r70) this.f9990c).h.draw(canvas);
                super.draw(canvas);
                return;
            default:
                super.draw(canvas);
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f9988a) {
            case 7:
                super.onDetachedFromWindow();
                ((ea0) this.f9990c).f27787b = -1L;
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f9988a) {
            case 2:
                Paint paint = (Paint) this.f9989b;
                paint.setColor(((ii.o) this.f9990c).getThemedColor(y6.Oh));
                canvas.drawRoundRect(0.0f, (getHeight() / 2.0f) - AndroidUtilities.dp(14.0f), getWidth(), (getHeight() / 2.0f) + AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), paint);
                super.onDraw(canvas);
                return;
            case 3:
                Paint paint2 = (Paint) this.f9989b;
                li.a aVar = ((d6) this.f9990c).f17201x;
                if (aVar != null && aVar.f17054c > 0 && aVar.d == 0 && !aVar.e) {
                    paint2.setColor(getCurrentTextColor());
                    float baseline = getBaseline() - (getTextSize() * 0.35f);
                    canvas.drawCircle(getWidth() / 2.0f, baseline, AndroidUtilities.dpf2(4.3f) / 2.0f, paint2);
                    return;
                }
                super.onDraw(canvas);
                return;
            case 4:
                super.onDraw(canvas);
                if (((org.telegram.ui.g) this.f9990c).f39460w) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    ((org.telegram.ui.Components.voip.h) this.f9989b).a(getMeasuredHeight() / 2.0f, canvas, rectF, null);
                    invalidate();
                    return;
                }
                return;
            case 5:
                Paint paint3 = (Paint) this.f9989b;
                paint3.setColor(((ti) this.f9990c).getThemedColor(y6.Oh));
                canvas.drawRoundRect(0.0f, (getHeight() / 2.0f) - AndroidUtilities.dp(14.0f), getWidth(), (getHeight() / 2.0f) + AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), paint3);
                super.onDraw(canvas);
                return;
            case 6:
                if (((w1) this.f9989b) != null) {
                    canvas.save();
                    canvas.clipPath((Path) this.f9990c);
                    ((w1) this.f9989b).d(canvas);
                    canvas.restore();
                    invalidate();
                }
                super.onDraw(canvas);
                return;
            case 7:
            case 10:
            default:
                super.onDraw(canvas);
                return;
            case 8:
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                Paint[] paintArr = (Paint[]) this.f9989b;
                v0 v0Var = (v0) this.f9990c;
                paintArr[v0Var.f34253x].setAlpha(255);
                canvas.drawRoundRect(rectF2, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paintArr[v0Var.f34253x]);
                float f7 = v0Var.f34252w;
                if (f7 > 0.0f) {
                    int i10 = v0Var.f34253x;
                    if (i10 + 1 < paintArr.length) {
                        paintArr[i10 + 1].setAlpha((int) (f7 * 255.0f));
                        canvas.drawRoundRect(rectF2, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paintArr[v0Var.f34253x + 1]);
                    }
                }
                super.onDraw(canvas);
                return;
            case 9:
                super.onDraw(canvas);
                RectF rectF3 = AndroidUtilities.rectTmp;
                rectF3.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                ((org.telegram.ui.Components.voip.h) this.f9989b).a(getMeasuredHeight() / 2.0f, canvas, rectF3, null);
                invalidate();
                return;
            case 11:
                Paint paint4 = (Paint) this.f9989b;
                paint4.setColor(((vh.f) this.f9990c).getThemedColor(y6.Oh));
                canvas.drawRoundRect(0.0f, (getHeight() / 2.0f) - AndroidUtilities.dp(14.0f), getWidth(), (getHeight() / 2.0f) + AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), paint4);
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f9988a) {
            case 6:
                super.onLayout(z10, i10, i11, i12, i13);
                w1 w1Var = new w1(10);
                this.f9989b = w1Var;
                w1Var.O = 100;
                w1Var.J = false;
                w1Var.M = true;
                w1Var.G = false;
                w1Var.K = true;
                w1Var.H = true;
                w1Var.f49139r = 1;
                w1Var.f49143w = 0.98f;
                w1Var.v = 0.98f;
                w1Var.f49142u = 0.98f;
                w1Var.f49129g = false;
                w1Var.f49136o = 0.0f;
                w1Var.f49144x = 750L;
                w1Var.f49145y = 750;
                w1Var.c();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                ((w1) this.f9989b).f49125a.set(rectF);
                ((w1) this.f9989b).f49126b.set(rectF);
                ((w1) this.f9989b).f();
                Path path = (Path) this.f9990c;
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
        switch (this.f9988a) {
            case 7:
                super.onMeasure(i10, i11);
                a();
                return;
            case 8:
            default:
                super.onMeasure(i10, i11);
                return;
            case 9:
                if (View.MeasureSpec.getSize(i10) > AndroidUtilities.dp(260.0f)) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(320.0f), 1073741824), i11);
                    return;
                } else {
                    super.onMeasure(i10, i11);
                    return;
                }
        }
    }

    @Override
    public void onSizeChanged(int r18, int r19, int r20, int r21) {
        throw new UnsupportedOperationException("Method not decompiled: ei.n.onSizeChanged(int, int, int, int):void");
    }

    @Override
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        switch (this.f9988a) {
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
    public void setTextColor(int i10) {
        switch (this.f9988a) {
            case 7:
                super.setTextColor(y6.o1(0.2f, i10));
                ((ea0) this.f9990c).g(y6.o1(0.03f, i10), y6.o1(0.175f, i10), y6.o1(0.2f, i10), y6.o1(0.45f, i10));
                return;
            default:
                super.setTextColor(i10);
                return;
        }
    }

    public n(d6 d6Var, Context context) {
        super(context);
        this.f9988a = 3;
        this.f9990c = d6Var;
        this.f9989b = new Paint(1);
    }

    public n(Context context, int i10) {
        super(context);
        this.f9988a = i10;
        switch (i10) {
            case 7:
                super(context);
                t90 t90Var = new t90(0);
                this.f9989b = t90Var;
                ea0 ea0Var = new ea0();
                this.f9990c = ea0Var;
                ea0Var.f27806y = t90Var;
                ea0Var.f27803u = 0.65f;
                ea0Var.k(4.0f);
                setBackground(ea0Var);
                return;
            default:
                this.f9990c = new Path();
                return;
        }
    }

    public n(vh.f fVar, Context context) {
        super(context);
        this.f9988a = 11;
        this.f9990c = fVar;
        this.f9989b = new Paint(1);
    }

    public n(ii.o oVar, Context context) {
        super(context);
        this.f9988a = 2;
        this.f9990c = oVar;
        this.f9989b = new Paint(1);
    }

    public n(r70 r70Var, Context context) {
        super(context);
        this.f9988a = 9;
        this.f9990c = r70Var;
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.f9989b = hVar;
        hVar.f33929k = false;
        hVar.f33931m = 2.0f;
    }

    public n(org.telegram.ui.g gVar, Context context) {
        super(context);
        this.f9988a = 4;
        this.f9990c = gVar;
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.f9989b = hVar;
        hVar.f33929k = false;
        hVar.f33931m = 2.0f;
    }

    public n(r rVar, Context context) {
        super(context);
        this.f9988a = 0;
        this.f9990c = rVar;
        this.f9989b = new Paint(1);
    }

    public n(Context context, u6 u6Var) {
        super(context);
        this.f9988a = 1;
        this.f9990c = u6Var;
        this.f9989b = new Paint(1);
    }

    public n(i0 i0Var, Context context) {
        super(context);
        this.f9988a = 10;
        this.f9990c = i0Var;
        this.f9989b = new Paint(1);
    }

    public n(ti tiVar, Context context) {
        super(context);
        this.f9988a = 5;
        this.f9990c = tiVar;
        this.f9989b = new Paint(1);
    }
}
