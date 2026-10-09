package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.Layout;
import android.view.View;
import android.widget.TextView;
import ii.f6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.ia0;
import org.telegram.ui.Components.voip.x0;
import org.telegram.ui.Components.y90;
import org.telegram.ui.Components.yi;
import org.telegram.ui.d80;
import rg.i0;
import rg.j0;
import rg.v1;
public final class o extends TextView {
    public final int f3907a;
    public Object f3908b;
    public final Object f3909c;

    public o(f6 f6Var, Context context) {
        super(context);
        this.f3907a = 3;
        this.f3909c = f6Var;
        this.f3908b = new Paint(1);
    }

    public void a() {
        ia0 ia0Var = (ia0) this.f3909c;
        y90 y90Var = (y90) this.f3908b;
        if (y90Var != null && ia0Var != null) {
            y90Var.rewind();
            if (getLayout() != null && getLayout().getText() != null) {
                y90Var.e(getLayout(), 0, getPaddingLeft(), getPaddingTop());
                getLayout().getSelectionPath(0, getLayout().getText().length(), y90Var);
            }
            ia0Var.l();
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f3907a) {
            case 0:
                Paint paint = (Paint) this.f3908b;
                int dp = AndroidUtilities.dp(1.0f) + (getHeight() / 2);
                int max = Math.max(1, AndroidUtilities.dp(0.66f));
                Layout layout = getLayout();
                if (layout != null) {
                    paint.setColor(i6.m1(0.45f, i6.w0(i6.f21181y6, ((u) this.f3909c).W.f3942c)));
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
                Paint paint2 = (Paint) this.f3908b;
                int dp2 = AndroidUtilities.dp(1.0f) + (getHeight() / 2);
                int max2 = Math.max(1, AndroidUtilities.dp(0.66f));
                Layout layout2 = getLayout();
                if (layout2 != null) {
                    paint2.setColor(i6.m1(0.45f, i6.w0(i6.f21181y6, (e6) this.f3909c)));
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
                Paint paint3 = (Paint) this.f3908b;
                paint3.setColor(i6.m1(0.8f, i6.w0(i6.f21199z6, j0.V0(((i0) this.f3909c).f47269e))));
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
        switch (this.f3907a) {
            case 4:
                ((org.telegram.ui.h) this.f3909c).f38154b.draw(canvas);
                super.draw(canvas);
                return;
            case 9:
                ((d80) this.f3909c).h.draw(canvas);
                super.draw(canvas);
                return;
            default:
                super.draw(canvas);
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f3907a) {
            case 7:
                super.onDetachedFromWindow();
                ((ia0) this.f3909c).f27321b = -1L;
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f3907a) {
            case 2:
                Paint paint = (Paint) this.f3908b;
                paint.setColor(((fi.p) this.f3909c).getThemedColor(i6.Oh));
                canvas.drawRoundRect(0.0f, (getHeight() / 2.0f) - AndroidUtilities.dp(14.0f), getWidth(), (getHeight() / 2.0f) + AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), paint);
                super.onDraw(canvas);
                return;
            case 3:
                Paint paint2 = (Paint) this.f3908b;
                ii.a aVar = ((f6) this.f3909c).f12424x;
                if (aVar != null && aVar.f12235c > 0 && aVar.d == 0 && !aVar.f12236e) {
                    paint2.setColor(getCurrentTextColor());
                    float baseline = getBaseline() - (getTextSize() * 0.35f);
                    canvas.drawCircle(getWidth() / 2.0f, baseline, AndroidUtilities.dpf2(4.3f) / 2.0f, paint2);
                    return;
                }
                super.onDraw(canvas);
                return;
            case 4:
                super.onDraw(canvas);
                if (((org.telegram.ui.h) this.f3909c).f38161w) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    ((org.telegram.ui.Components.voip.h) this.f3908b).a(getMeasuredHeight() / 2.0f, canvas, rectF, null);
                    invalidate();
                    return;
                }
                return;
            case 5:
                Paint paint3 = (Paint) this.f3908b;
                paint3.setColor(((yi) this.f3909c).getThemedColor(i6.Oh));
                canvas.drawRoundRect(0.0f, (getHeight() / 2.0f) - AndroidUtilities.dp(14.0f), getWidth(), (getHeight() / 2.0f) + AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), paint3);
                super.onDraw(canvas);
                return;
            case 6:
                if (((v1) this.f3908b) != null) {
                    canvas.save();
                    canvas.clipPath((Path) this.f3909c);
                    ((v1) this.f3908b).d(canvas);
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
                Paint[] paintArr = (Paint[]) this.f3908b;
                x0 x0Var = (x0) this.f3909c;
                paintArr[x0Var.f32367x].setAlpha(255);
                canvas.drawRoundRect(rectF2, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paintArr[x0Var.f32367x]);
                float f7 = x0Var.f32366w;
                if (f7 > 0.0f) {
                    int i10 = x0Var.f32367x;
                    if (i10 + 1 < paintArr.length) {
                        paintArr[i10 + 1].setAlpha((int) (f7 * 255.0f));
                        canvas.drawRoundRect(rectF2, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paintArr[x0Var.f32367x + 1]);
                    }
                }
                super.onDraw(canvas);
                return;
            case 9:
                super.onDraw(canvas);
                RectF rectF3 = AndroidUtilities.rectTmp;
                rectF3.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                ((org.telegram.ui.Components.voip.h) this.f3908b).a(getMeasuredHeight() / 2.0f, canvas, rectF3, null);
                invalidate();
                return;
            case 11:
                Paint paint4 = (Paint) this.f3908b;
                paint4.setColor(((th.f) this.f3909c).getThemedColor(i6.Oh));
                canvas.drawRoundRect(0.0f, (getHeight() / 2.0f) - AndroidUtilities.dp(14.0f), getWidth(), (getHeight() / 2.0f) + AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), paint4);
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f3907a) {
            case 6:
                super.onLayout(z10, i10, i11, i12, i13);
                v1 v1Var = new v1(10);
                this.f3908b = v1Var;
                v1Var.N = 100;
                v1Var.J = false;
                v1Var.M = true;
                v1Var.G = false;
                v1Var.K = true;
                v1Var.H = true;
                v1Var.f47491r = 1;
                v1Var.f47495w = 0.98f;
                v1Var.v = 0.98f;
                v1Var.f47494u = 0.98f;
                v1Var.f47481g = false;
                v1Var.f47488o = 0.0f;
                v1Var.f47496x = 750L;
                v1Var.f47497y = 750;
                v1Var.c();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                ((v1) this.f3908b).f47476a.set(rectF);
                ((v1) this.f3908b).f47477b.set(rectF);
                ((v1) this.f3908b).f();
                Path path = (Path) this.f3909c;
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
        switch (this.f3907a) {
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
        throw new UnsupportedOperationException("Method not decompiled: bi.o.onSizeChanged(int, int, int, int):void");
    }

    @Override
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        switch (this.f3907a) {
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
        switch (this.f3907a) {
            case 7:
                super.setTextColor(i6.m1(0.2f, i10));
                ((ia0) this.f3909c).g(i6.m1(0.03f, i10), i6.m1(0.175f, i10), i6.m1(0.2f, i10), i6.m1(0.45f, i10));
                return;
            default:
                super.setTextColor(i10);
                return;
        }
    }

    public o(x0 x0Var, Context context) {
        super(context);
        this.f3907a = 8;
        this.f3909c = x0Var;
        this.f3908b = new Paint[x0Var.f32362f.length];
        int i10 = 0;
        while (true) {
            Paint[] paintArr = (Paint[]) this.f3908b;
            if (i10 >= paintArr.length) {
                return;
            }
            paintArr[i10] = new Paint(1);
            i10++;
        }
    }

    public o(Context context, int i10) {
        super(context);
        this.f3907a = i10;
        switch (i10) {
            case 7:
                super(context);
                y90 y90Var = new y90(0);
                this.f3908b = y90Var;
                ia0 ia0Var = new ia0();
                this.f3909c = ia0Var;
                ia0Var.f27341y = y90Var;
                ia0Var.f27338u = 0.65f;
                ia0Var.k(4.0f);
                setBackground(ia0Var);
                return;
            default:
                this.f3909c = new Path();
                return;
        }
    }

    public o(th.f fVar, Context context) {
        super(context);
        this.f3907a = 11;
        this.f3909c = fVar;
        this.f3908b = new Paint(1);
    }

    public o(fi.p pVar, Context context) {
        super(context);
        this.f3907a = 2;
        this.f3909c = pVar;
        this.f3908b = new Paint(1);
    }

    public o(d80 d80Var, Context context) {
        super(context);
        this.f3907a = 9;
        this.f3909c = d80Var;
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.f3908b = hVar;
        hVar.f31959k = false;
        hVar.f31961m = 2.0f;
    }

    public o(org.telegram.ui.h hVar, Context context) {
        super(context);
        this.f3907a = 4;
        this.f3909c = hVar;
        org.telegram.ui.Components.voip.h hVar2 = new org.telegram.ui.Components.voip.h();
        this.f3908b = hVar2;
        hVar2.f31959k = false;
        hVar2.f31961m = 2.0f;
    }

    public o(u uVar, Context context) {
        super(context);
        this.f3907a = 0;
        this.f3909c = uVar;
        this.f3908b = new Paint(1);
    }

    public o(Context context, e6 e6Var) {
        super(context);
        this.f3907a = 1;
        this.f3909c = e6Var;
        this.f3908b = new Paint(1);
    }

    public o(i0 i0Var, Context context) {
        super(context);
        this.f3907a = 10;
        this.f3909c = i0Var;
        this.f3908b = new Paint(1);
    }

    public o(yi yiVar, Context context) {
        super(context);
        this.f3907a = 5;
        this.f3909c = yiVar;
        this.f3908b = new Paint(1);
    }
}
