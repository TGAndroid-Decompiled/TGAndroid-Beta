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
import org.telegram.ui.Components.da0;
import org.telegram.ui.Components.s90;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.voip.v0;
import org.telegram.ui.p70;
import tg.i0;
import tg.j0;
import tg.w1;
public final class n extends TextView {
    public final int f9989a;
    public Object f9990b;
    public final Object f9991c;

    public n(v0 v0Var, Context context) {
        super(context);
        this.f9989a = 8;
        this.f9991c = v0Var;
        this.f9990b = new Paint[v0Var.f34140f.length];
        int i10 = 0;
        while (true) {
            Paint[] paintArr = (Paint[]) this.f9990b;
            if (i10 >= paintArr.length) {
                return;
            }
            paintArr[i10] = new Paint(1);
            i10++;
        }
    }

    public void a() {
        da0 da0Var = (da0) this.f9991c;
        s90 s90Var = (s90) this.f9990b;
        if (s90Var != null && da0Var != null) {
            s90Var.rewind();
            if (getLayout() != null && getLayout().getText() != null) {
                s90Var.e(getLayout(), 0, getPaddingLeft(), getPaddingTop());
                getLayout().getSelectionPath(0, getLayout().getText().length(), s90Var);
            }
            da0Var.l();
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f9989a) {
            case 0:
                Paint paint = (Paint) this.f9990b;
                int dp = AndroidUtilities.dp(1.0f) + (getHeight() / 2);
                int max = Math.max(1, AndroidUtilities.dp(0.66f));
                Layout layout = getLayout();
                if (layout != null) {
                    paint.setColor(y6.o1(0.45f, y6.w0(y6.f23746y6, ((r) this.f9991c).W.f10017c)));
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
                Paint paint2 = (Paint) this.f9990b;
                int dp2 = AndroidUtilities.dp(1.0f) + (getHeight() / 2);
                int max2 = Math.max(1, AndroidUtilities.dp(0.66f));
                Layout layout2 = getLayout();
                if (layout2 != null) {
                    paint2.setColor(y6.o1(0.45f, y6.w0(y6.f23746y6, (u6) this.f9991c)));
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
                Paint paint3 = (Paint) this.f9990b;
                paint3.setColor(y6.o1(0.8f, y6.w0(y6.f23765z6, j0.X0(((i0) this.f9991c).e))));
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
        switch (this.f9989a) {
            case 4:
                ((org.telegram.ui.g) this.f9991c).f39496b.draw(canvas);
                super.draw(canvas);
                return;
            case 9:
                ((p70) this.f9991c).h.draw(canvas);
                super.draw(canvas);
                return;
            default:
                super.draw(canvas);
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f9989a) {
            case 7:
                super.onDetachedFromWindow();
                ((da0) this.f9991c).f27460b = -1L;
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f9989a) {
            case 2:
                Paint paint = (Paint) this.f9990b;
                paint.setColor(((ii.o) this.f9991c).getThemedColor(y6.Oh));
                canvas.drawRoundRect(0.0f, (getHeight() / 2.0f) - AndroidUtilities.dp(14.0f), getWidth(), (getHeight() / 2.0f) + AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), paint);
                super.onDraw(canvas);
                return;
            case 3:
                Paint paint2 = (Paint) this.f9990b;
                li.a aVar = ((d6) this.f9991c).f17202x;
                if (aVar != null && aVar.f17055c > 0 && aVar.d == 0 && !aVar.e) {
                    paint2.setColor(getCurrentTextColor());
                    float baseline = getBaseline() - (getTextSize() * 0.35f);
                    canvas.drawCircle(getWidth() / 2.0f, baseline, AndroidUtilities.dpf2(4.3f) / 2.0f, paint2);
                    return;
                }
                super.onDraw(canvas);
                return;
            case 4:
                super.onDraw(canvas);
                if (((org.telegram.ui.g) this.f9991c).f39502w) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    ((org.telegram.ui.Components.voip.h) this.f9990b).a(getMeasuredHeight() / 2.0f, canvas, rectF, null);
                    invalidate();
                    return;
                }
                return;
            case 5:
                Paint paint3 = (Paint) this.f9990b;
                paint3.setColor(((ti) this.f9991c).getThemedColor(y6.Oh));
                canvas.drawRoundRect(0.0f, (getHeight() / 2.0f) - AndroidUtilities.dp(14.0f), getWidth(), (getHeight() / 2.0f) + AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), paint3);
                super.onDraw(canvas);
                return;
            case 6:
                if (((w1) this.f9990b) != null) {
                    canvas.save();
                    canvas.clipPath((Path) this.f9991c);
                    ((w1) this.f9990b).d(canvas);
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
                Paint[] paintArr = (Paint[]) this.f9990b;
                v0 v0Var = (v0) this.f9991c;
                paintArr[v0Var.f34145x].setAlpha(255);
                canvas.drawRoundRect(rectF2, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paintArr[v0Var.f34145x]);
                float f7 = v0Var.f34144w;
                if (f7 > 0.0f) {
                    int i10 = v0Var.f34145x;
                    if (i10 + 1 < paintArr.length) {
                        paintArr[i10 + 1].setAlpha((int) (f7 * 255.0f));
                        canvas.drawRoundRect(rectF2, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paintArr[v0Var.f34145x + 1]);
                    }
                }
                super.onDraw(canvas);
                return;
            case 9:
                super.onDraw(canvas);
                RectF rectF3 = AndroidUtilities.rectTmp;
                rectF3.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                ((org.telegram.ui.Components.voip.h) this.f9990b).a(getMeasuredHeight() / 2.0f, canvas, rectF3, null);
                invalidate();
                return;
            case 11:
                Paint paint4 = (Paint) this.f9990b;
                paint4.setColor(((vh.f) this.f9991c).getThemedColor(y6.Oh));
                canvas.drawRoundRect(0.0f, (getHeight() / 2.0f) - AndroidUtilities.dp(14.0f), getWidth(), (getHeight() / 2.0f) + AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), paint4);
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f9989a) {
            case 6:
                super.onLayout(z10, i10, i11, i12, i13);
                w1 w1Var = new w1(10);
                this.f9990b = w1Var;
                w1Var.O = 100;
                w1Var.J = false;
                w1Var.M = true;
                w1Var.G = false;
                w1Var.K = true;
                w1Var.H = true;
                w1Var.f49101r = 1;
                w1Var.f49105w = 0.98f;
                w1Var.v = 0.98f;
                w1Var.f49104u = 0.98f;
                w1Var.f49091g = false;
                w1Var.f49098o = 0.0f;
                w1Var.f49106x = 750L;
                w1Var.f49107y = 750;
                w1Var.c();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                ((w1) this.f9990b).f49087a.set(rectF);
                ((w1) this.f9990b).f49088b.set(rectF);
                ((w1) this.f9990b).f();
                Path path = (Path) this.f9991c;
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
        switch (this.f9989a) {
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
        switch (this.f9989a) {
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
        switch (this.f9989a) {
            case 7:
                super.setTextColor(y6.o1(0.2f, i10));
                ((da0) this.f9991c).g(y6.o1(0.03f, i10), y6.o1(0.175f, i10), y6.o1(0.2f, i10), y6.o1(0.45f, i10));
                return;
            default:
                super.setTextColor(i10);
                return;
        }
    }

    public n(d6 d6Var, Context context) {
        super(context);
        this.f9989a = 3;
        this.f9991c = d6Var;
        this.f9990b = new Paint(1);
    }

    public n(Context context, int i10) {
        super(context);
        this.f9989a = i10;
        switch (i10) {
            case 7:
                super(context);
                s90 s90Var = new s90(0);
                this.f9990b = s90Var;
                da0 da0Var = new da0();
                this.f9991c = da0Var;
                da0Var.f27479y = s90Var;
                da0Var.f27476u = 0.65f;
                da0Var.k(4.0f);
                setBackground(da0Var);
                return;
            default:
                this.f9991c = new Path();
                return;
        }
    }

    public n(vh.f fVar, Context context) {
        super(context);
        this.f9989a = 11;
        this.f9991c = fVar;
        this.f9990b = new Paint(1);
    }

    public n(ii.o oVar, Context context) {
        super(context);
        this.f9989a = 2;
        this.f9991c = oVar;
        this.f9990b = new Paint(1);
    }

    public n(p70 p70Var, Context context) {
        super(context);
        this.f9989a = 9;
        this.f9991c = p70Var;
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.f9990b = hVar;
        hVar.f33821k = false;
        hVar.f33823m = 2.0f;
    }

    public n(org.telegram.ui.g gVar, Context context) {
        super(context);
        this.f9989a = 4;
        this.f9991c = gVar;
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.f9990b = hVar;
        hVar.f33821k = false;
        hVar.f33823m = 2.0f;
    }

    public n(r rVar, Context context) {
        super(context);
        this.f9989a = 0;
        this.f9991c = rVar;
        this.f9990b = new Paint(1);
    }

    public n(Context context, u6 u6Var) {
        super(context);
        this.f9989a = 1;
        this.f9991c = u6Var;
        this.f9990b = new Paint(1);
    }

    public n(i0 i0Var, Context context) {
        super(context);
        this.f9989a = 10;
        this.f9991c = i0Var;
        this.f9990b = new Paint(1);
    }

    public n(ti tiVar, Context context) {
        super(context);
        this.f9989a = 5;
        this.f9991c = tiVar;
        this.f9990b = new Paint(1);
    }
}
