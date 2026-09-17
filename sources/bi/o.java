package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.Layout;
import android.view.View;
import android.widget.TextView;
import ii.d6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.g90;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.voip.x0;
import org.telegram.ui.Components.w80;
import org.telegram.ui.f80;
import rg.i0;
import rg.j0;
import rg.u1;
public final class o extends TextView {
    public final int f3576a;
    public Object f3577b;
    public final Object f3578c;

    public o(d6 d6Var, Context context) {
        super(context);
        this.f3576a = 3;
        this.f3578c = d6Var;
        this.f3577b = new Paint(1);
    }

    public void a() {
        g90 g90Var = (g90) this.f3578c;
        w80 w80Var = (w80) this.f3577b;
        if (w80Var != null && g90Var != null) {
            w80Var.rewind();
            if (getLayout() != null && getLayout().getText() != null) {
                w80Var.e(getLayout(), 0, getPaddingLeft(), getPaddingTop());
                getLayout().getSelectionPath(0, getLayout().getText().length(), w80Var);
            }
            g90Var.k();
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f3576a) {
            case 0:
                Paint paint = (Paint) this.f3577b;
                int dp = AndroidUtilities.dp(1.0f) + (getHeight() / 2);
                int max = Math.max(1, AndroidUtilities.dp(0.66f));
                Layout layout = getLayout();
                if (layout != null) {
                    paint.setColor(j6.l1(0.45f, j6.v0(j6.f19244y6, ((u) this.f3578c).W.f3609c)));
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
                Paint paint2 = (Paint) this.f3577b;
                int dp2 = AndroidUtilities.dp(1.0f) + (getHeight() / 2);
                int max2 = Math.max(1, AndroidUtilities.dp(0.66f));
                Layout layout2 = getLayout();
                if (layout2 != null) {
                    paint2.setColor(j6.l1(0.45f, j6.v0(j6.f19244y6, (f6) this.f3578c)));
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
                Paint paint3 = (Paint) this.f3577b;
                paint3.setColor(j6.l1(0.8f, j6.v0(j6.f19263z6, j0.U0(((i0) this.f3578c).e))));
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
        switch (this.f3576a) {
            case 4:
                ((org.telegram.ui.h) this.f3578c).f34071b.draw(canvas);
                super.draw(canvas);
                return;
            case 9:
                ((f80) this.f3578c).h.draw(canvas);
                super.draw(canvas);
                return;
            default:
                super.draw(canvas);
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f3576a) {
            case 7:
                super.onDetachedFromWindow();
                ((g90) this.f3578c).f24131b = -1L;
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f3576a) {
            case 2:
                Paint paint = (Paint) this.f3577b;
                paint.setColor(((fi.p) this.f3578c).getThemedColor(j6.Oh));
                canvas.drawRoundRect(0.0f, (getHeight() / 2.0f) - AndroidUtilities.dp(14.0f), getWidth(), (getHeight() / 2.0f) + AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), paint);
                super.onDraw(canvas);
                return;
            case 3:
                Paint paint2 = (Paint) this.f3577b;
                ii.a aVar = ((d6) this.f3578c).f11345x;
                if (aVar != null && aVar.f11205c > 0 && aVar.d == 0 && !aVar.e) {
                    paint2.setColor(getCurrentTextColor());
                    float baseline = getBaseline() - (getTextSize() * 0.35f);
                    canvas.drawCircle(getWidth() / 2.0f, baseline, AndroidUtilities.dpf2(4.3f) / 2.0f, paint2);
                    return;
                }
                super.onDraw(canvas);
                return;
            case 4:
                super.onDraw(canvas);
                if (((org.telegram.ui.h) this.f3578c).f34077w) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    ((org.telegram.ui.Components.voip.h) this.f3577b).a(getMeasuredHeight() / 2.0f, canvas, rectF, null);
                    invalidate();
                    return;
                }
                return;
            case 5:
                Paint paint3 = (Paint) this.f3577b;
                paint3.setColor(((vi) this.f3578c).getThemedColor(j6.Oh));
                canvas.drawRoundRect(0.0f, (getHeight() / 2.0f) - AndroidUtilities.dp(14.0f), getWidth(), (getHeight() / 2.0f) + AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), paint3);
                super.onDraw(canvas);
                return;
            case 6:
                if (((u1) this.f3577b) != null) {
                    canvas.save();
                    canvas.clipPath((Path) this.f3578c);
                    ((u1) this.f3577b).d(canvas);
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
                Paint[] paintArr = (Paint[]) this.f3577b;
                x0 x0Var = (x0) this.f3578c;
                paintArr[x0Var.f29325x].setAlpha(255);
                canvas.drawRoundRect(rectF2, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paintArr[x0Var.f29325x]);
                float f7 = x0Var.f29324w;
                if (f7 > 0.0f) {
                    int i10 = x0Var.f29325x;
                    if (i10 + 1 < paintArr.length) {
                        paintArr[i10 + 1].setAlpha((int) (f7 * 255.0f));
                        canvas.drawRoundRect(rectF2, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paintArr[x0Var.f29325x + 1]);
                    }
                }
                super.onDraw(canvas);
                return;
            case 9:
                super.onDraw(canvas);
                RectF rectF3 = AndroidUtilities.rectTmp;
                rectF3.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                ((org.telegram.ui.Components.voip.h) this.f3577b).a(getMeasuredHeight() / 2.0f, canvas, rectF3, null);
                invalidate();
                return;
            case 11:
                Paint paint4 = (Paint) this.f3577b;
                paint4.setColor(((th.f) this.f3578c).getThemedColor(j6.Oh));
                canvas.drawRoundRect(0.0f, (getHeight() / 2.0f) - AndroidUtilities.dp(14.0f), getWidth(), (getHeight() / 2.0f) + AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), paint4);
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f3576a) {
            case 6:
                super.onLayout(z10, i10, i11, i12, i13);
                u1 u1Var = new u1(10);
                this.f3577b = u1Var;
                u1Var.N = 100;
                u1Var.J = false;
                u1Var.M = true;
                u1Var.G = false;
                u1Var.K = true;
                u1Var.H = true;
                u1Var.f42532r = 1;
                u1Var.f42536w = 0.98f;
                u1Var.v = 0.98f;
                u1Var.f42535u = 0.98f;
                u1Var.f42522g = false;
                u1Var.f42529o = 0.0f;
                u1Var.f42537x = 750L;
                u1Var.f42538y = 750;
                u1Var.c();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                ((u1) this.f3577b).f42518a.set(rectF);
                ((u1) this.f3577b).f42519b.set(rectF);
                ((u1) this.f3577b).f();
                Path path = (Path) this.f3578c;
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
        switch (this.f3576a) {
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
        switch (this.f3576a) {
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
        switch (this.f3576a) {
            case 7:
                super.setTextColor(j6.l1(0.2f, i10));
                ((g90) this.f3578c).f(j6.l1(0.03f, i10), j6.l1(0.175f, i10), j6.l1(0.2f, i10), j6.l1(0.45f, i10));
                return;
            default:
                super.setTextColor(i10);
                return;
        }
    }

    public o(x0 x0Var, Context context) {
        super(context);
        this.f3576a = 8;
        this.f3578c = x0Var;
        this.f3577b = new Paint[x0Var.f29320f.length];
        int i10 = 0;
        while (true) {
            Paint[] paintArr = (Paint[]) this.f3577b;
            if (i10 >= paintArr.length) {
                return;
            }
            paintArr[i10] = new Paint(1);
            i10++;
        }
    }

    public o(Context context, int i10) {
        super(context);
        this.f3576a = i10;
        switch (i10) {
            case 7:
                super(context);
                w80 w80Var = new w80(0);
                this.f3577b = w80Var;
                g90 g90Var = new g90();
                this.f3578c = g90Var;
                g90Var.f24149x = w80Var;
                g90Var.f24147u = 0.65f;
                g90Var.j(4.0f);
                setBackground(g90Var);
                return;
            default:
                this.f3578c = new Path();
                return;
        }
    }

    public o(th.f fVar, Context context) {
        super(context);
        this.f3576a = 11;
        this.f3578c = fVar;
        this.f3577b = new Paint(1);
    }

    public o(fi.p pVar, Context context) {
        super(context);
        this.f3576a = 2;
        this.f3578c = pVar;
        this.f3577b = new Paint(1);
    }

    public o(f80 f80Var, Context context) {
        super(context);
        this.f3576a = 9;
        this.f3578c = f80Var;
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.f3577b = hVar;
        hVar.f28946k = false;
        hVar.f28948m = 2.0f;
    }

    public o(org.telegram.ui.h hVar, Context context) {
        super(context);
        this.f3576a = 4;
        this.f3578c = hVar;
        org.telegram.ui.Components.voip.h hVar2 = new org.telegram.ui.Components.voip.h();
        this.f3577b = hVar2;
        hVar2.f28946k = false;
        hVar2.f28948m = 2.0f;
    }

    public o(u uVar, Context context) {
        super(context);
        this.f3576a = 0;
        this.f3578c = uVar;
        this.f3577b = new Paint(1);
    }

    public o(Context context, f6 f6Var) {
        super(context);
        this.f3576a = 1;
        this.f3578c = f6Var;
        this.f3577b = new Paint(1);
    }

    public o(i0 i0Var, Context context) {
        super(context);
        this.f3576a = 10;
        this.f3578c = i0Var;
        this.f3577b = new Paint(1);
    }

    public o(vi viVar, Context context) {
        super(context);
        this.f3576a = 5;
        this.f3578c = viVar;
        this.f3577b = new Paint(1);
    }
}
