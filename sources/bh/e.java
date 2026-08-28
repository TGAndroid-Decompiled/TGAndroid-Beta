package bh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.Layout;
import android.view.View;
import android.widget.TextView;
import jh.q;
import nh.o;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.f80;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.voip.u0;
import org.telegram.ui.i70;
import qh.s5;
import zf.i0;
import zf.j0;
import zf.v1;
public final class e extends TextView {
    public final int f2021a;
    public Object f2022b;
    public final Object f2023c;

    public e(u0 u0Var, Context context) {
        super(context);
        this.f2021a = 8;
        this.f2023c = u0Var;
        this.f2022b = new Paint[u0Var.f33867f.length];
        int i9 = 0;
        while (true) {
            Paint[] paintArr = (Paint[]) this.f2022b;
            if (i9 >= paintArr.length) {
                return;
            }
            paintArr[i9] = new Paint(1);
            i9++;
        }
    }

    public void a() {
        p80 p80Var = (p80) this.f2023c;
        f80 f80Var = (f80) this.f2022b;
        if (f80Var != null && p80Var != null) {
            f80Var.rewind();
            if (getLayout() != null && getLayout().getText() != null) {
                f80Var.e(getLayout(), 0, getPaddingLeft(), getPaddingTop());
                getLayout().getSelectionPath(0, getLayout().getText().length(), f80Var);
            }
            p80Var.k();
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f2021a) {
            case 1:
                Paint paint = (Paint) this.f2022b;
                int dp = AndroidUtilities.dp(1.0f) + (getHeight() / 2);
                int max = Math.max(1, AndroidUtilities.dp(0.66f));
                Layout layout = getLayout();
                if (layout != null) {
                    paint.setColor(f6.l1(0.45f, f6.v0(f6.f23369y6, ((q) this.f2023c).S.f14380c)));
                    float f10 = dp;
                    float f11 = max / 2.0f;
                    float f12 = f10 - f11;
                    float f13 = f10 + f11;
                    canvas.drawRect(0.0f, f12, (getWidth() - (layout.getLineWidth(0) + AndroidUtilities.dp(16.0f))) / 2.0f, f13, paint);
                    canvas.drawRect(((layout.getLineWidth(0) + getWidth()) + AndroidUtilities.dp(16.0f)) / 2.0f, f12, getWidth(), f13, paint);
                }
                super.dispatchDraw(canvas);
                return;
            case 2:
                Paint paint2 = (Paint) this.f2022b;
                int dp2 = AndroidUtilities.dp(1.0f) + (getHeight() / 2);
                int max2 = Math.max(1, AndroidUtilities.dp(0.66f));
                Layout layout2 = getLayout();
                if (layout2 != null) {
                    paint2.setColor(f6.l1(0.45f, f6.v0(f6.f23369y6, (b6) this.f2023c)));
                    float f14 = dp2;
                    float f15 = max2 / 2.0f;
                    float f16 = f14 - f15;
                    float f17 = f14 + f15;
                    canvas.drawRect(0.0f, f16, (getWidth() - (layout2.getLineWidth(0) + AndroidUtilities.dp(16.0f))) / 2.0f, f17, paint2);
                    canvas.drawRect(((layout2.getLineWidth(0) + getWidth()) + AndroidUtilities.dp(16.0f)) / 2.0f, f16, getWidth(), f17, paint2);
                }
                super.dispatchDraw(canvas);
                return;
            case 11:
                Paint paint3 = (Paint) this.f2022b;
                paint3.setColor(f6.l1(0.8f, f6.v0(f6.f23386z6, j0.U0(((i0) this.f2023c).f50527e))));
                paint3.setStyle(Paint.Style.STROKE);
                paint3.setStrokeWidth(1.0f);
                float height = getHeight() / 2.0f;
                Layout layout3 = getLayout();
                int i9 = 0;
                for (int i10 = 0; i10 < layout3.getLineCount(); i10++) {
                    i9 = Math.max(i9, (int) layout3.getLineWidth(i10));
                }
                float f18 = i9 / 2.0f;
                canvas.drawLine(0.0f, height, ((getWidth() / 2.0f) - f18) - AndroidUtilities.dp(8.0f), height, paint3);
                canvas.drawLine((getWidth() / 2.0f) + f18 + AndroidUtilities.dp(8.0f), height, getWidth(), height, paint3);
                super.dispatchDraw(canvas);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f2021a) {
            case 4:
                ((org.telegram.ui.h) this.f2023c).f38624b.draw(canvas);
                super.draw(canvas);
                return;
            case 9:
                ((i70) this.f2023c).h.draw(canvas);
                super.draw(canvas);
                return;
            default:
                super.draw(canvas);
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f2021a) {
            case 7:
                super.onDetachedFromWindow();
                ((p80) this.f2023c).f31572b = -1L;
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f2021a) {
            case 0:
                Paint paint = (Paint) this.f2022b;
                paint.setColor(((j) this.f2023c).getThemedColor(f6.Oh));
                canvas.drawRoundRect(0.0f, (getHeight() / 2.0f) - AndroidUtilities.dp(14.0f), getWidth(), (getHeight() / 2.0f) + AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), paint);
                super.onDraw(canvas);
                return;
            case 1:
            case 2:
            case 7:
            default:
                super.onDraw(canvas);
                return;
            case 3:
                Paint paint2 = (Paint) this.f2022b;
                paint2.setColor(((o) this.f2023c).getThemedColor(f6.Oh));
                canvas.drawRoundRect(0.0f, (getHeight() / 2.0f) - AndroidUtilities.dp(14.0f), getWidth(), (getHeight() / 2.0f) + AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), paint2);
                super.onDraw(canvas);
                return;
            case 4:
                super.onDraw(canvas);
                if (((org.telegram.ui.h) this.f2023c).f38631w) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    ((org.telegram.ui.Components.voip.h) this.f2022b).a(getMeasuredHeight() / 2.0f, canvas, rectF, null);
                    invalidate();
                    return;
                }
                return;
            case 5:
                Paint paint3 = (Paint) this.f2022b;
                paint3.setColor(((ki) this.f2023c).getThemedColor(f6.Oh));
                canvas.drawRoundRect(0.0f, (getHeight() / 2.0f) - AndroidUtilities.dp(14.0f), getWidth(), (getHeight() / 2.0f) + AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), paint3);
                super.onDraw(canvas);
                return;
            case 6:
                if (((v1) this.f2022b) != null) {
                    canvas.save();
                    canvas.clipPath((Path) this.f2023c);
                    ((v1) this.f2022b).d(canvas);
                    canvas.restore();
                    invalidate();
                }
                super.onDraw(canvas);
                return;
            case 8:
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                Paint[] paintArr = (Paint[]) this.f2022b;
                u0 u0Var = (u0) this.f2023c;
                paintArr[u0Var.f33872x].setAlpha(255);
                canvas.drawRoundRect(rectF2, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paintArr[u0Var.f33872x]);
                float f10 = u0Var.f33871w;
                if (f10 > 0.0f) {
                    int i9 = u0Var.f33872x;
                    if (i9 + 1 < paintArr.length) {
                        paintArr[i9 + 1].setAlpha((int) (f10 * 255.0f));
                        canvas.drawRoundRect(rectF2, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paintArr[u0Var.f33872x + 1]);
                    }
                }
                super.onDraw(canvas);
                return;
            case 9:
                super.onDraw(canvas);
                RectF rectF3 = AndroidUtilities.rectTmp;
                rectF3.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                ((org.telegram.ui.Components.voip.h) this.f2022b).a(getMeasuredHeight() / 2.0f, canvas, rectF3, null);
                invalidate();
                return;
            case 10:
                Paint paint4 = (Paint) this.f2022b;
                qh.a aVar = ((s5) this.f2023c).f46709x;
                if (aVar != null && aVar.f46270c > 0 && aVar.d == 0 && !aVar.f46271e) {
                    paint4.setColor(getCurrentTextColor());
                    float baseline = getBaseline() - (getTextSize() * 0.35f);
                    canvas.drawCircle(getWidth() / 2.0f, baseline, AndroidUtilities.dpf2(4.3f) / 2.0f, paint4);
                    return;
                }
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        switch (this.f2021a) {
            case 6:
                super.onLayout(z10, i9, i10, i11, i12);
                v1 v1Var = new v1(10);
                this.f2022b = v1Var;
                v1Var.N = 100;
                v1Var.J = false;
                v1Var.M = true;
                v1Var.G = false;
                v1Var.K = true;
                v1Var.H = true;
                v1Var.f50748r = 1;
                v1Var.f50752w = 0.98f;
                v1Var.v = 0.98f;
                v1Var.f50751u = 0.98f;
                v1Var.f50738g = false;
                v1Var.f50745o = 0.0f;
                v1Var.f50753x = 750L;
                v1Var.f50754y = 750;
                v1Var.c();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                ((v1) this.f2022b).f50733a.set(rectF);
                ((v1) this.f2022b).f50734b.set(rectF);
                ((v1) this.f2022b).f();
                Path path = (Path) this.f2023c;
                path.reset();
                path.addRoundRect(rectF, getHeight() / 2.0f, getHeight() / 2.0f, Path.Direction.CW);
                return;
            default:
                super.onLayout(z10, i9, i10, i11, i12);
                return;
        }
    }

    @Override
    public void onMeasure(int i9, int i10) {
        switch (this.f2021a) {
            case 7:
                super.onMeasure(i9, i10);
                a();
                return;
            case 8:
            default:
                super.onMeasure(i9, i10);
                return;
            case 9:
                if (View.MeasureSpec.getSize(i9) > AndroidUtilities.dp(260.0f)) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(320.0f), 1073741824), i10);
                    return;
                } else {
                    super.onMeasure(i9, i10);
                    return;
                }
        }
    }

    @Override
    public void onSizeChanged(int r18, int r19, int r20, int r21) {
        throw new UnsupportedOperationException("Method not decompiled: bh.e.onSizeChanged(int, int, int, int):void");
    }

    @Override
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        switch (this.f2021a) {
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
    public void setTextColor(int i9) {
        switch (this.f2021a) {
            case 7:
                super.setTextColor(f6.l1(0.2f, i9));
                ((p80) this.f2023c).f(f6.l1(0.03f, i9), f6.l1(0.175f, i9), f6.l1(0.2f, i9), f6.l1(0.45f, i9));
                return;
            default:
                super.setTextColor(i9);
                return;
        }
    }

    public e(s5 s5Var, Context context) {
        super(context);
        this.f2021a = 10;
        this.f2023c = s5Var;
        this.f2022b = new Paint(1);
    }

    public e(Context context, int i9) {
        super(context);
        this.f2021a = i9;
        switch (i9) {
            case 7:
                super(context);
                f80 f80Var = new f80(0);
                this.f2022b = f80Var;
                p80 p80Var = new p80();
                this.f2023c = p80Var;
                p80Var.f31591x = f80Var;
                p80Var.f31589u = 0.65f;
                p80Var.j(4.0f);
                setBackground(p80Var);
                return;
            default:
                this.f2023c = new Path();
                return;
        }
    }

    public e(j jVar, Context context) {
        super(context);
        this.f2021a = 0;
        this.f2023c = jVar;
        this.f2022b = new Paint(1);
    }

    public e(o oVar, Context context) {
        super(context);
        this.f2021a = 3;
        this.f2023c = oVar;
        this.f2022b = new Paint(1);
    }

    public e(i70 i70Var, Context context) {
        super(context);
        this.f2021a = 9;
        this.f2023c = i70Var;
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.f2022b = hVar;
        hVar.f33545k = false;
        hVar.f33547m = 2.0f;
    }

    public e(org.telegram.ui.h hVar, Context context) {
        super(context);
        this.f2021a = 4;
        this.f2023c = hVar;
        org.telegram.ui.Components.voip.h hVar2 = new org.telegram.ui.Components.voip.h();
        this.f2022b = hVar2;
        hVar2.f33545k = false;
        hVar2.f33547m = 2.0f;
    }

    public e(q qVar, Context context) {
        super(context);
        this.f2021a = 1;
        this.f2023c = qVar;
        this.f2022b = new Paint(1);
    }

    public e(Context context, b6 b6Var) {
        super(context);
        this.f2021a = 2;
        this.f2023c = b6Var;
        this.f2022b = new Paint(1);
    }

    public e(i0 i0Var, Context context) {
        super(context);
        this.f2021a = 11;
        this.f2023c = i0Var;
        this.f2022b = new Paint(1);
    }

    public e(ki kiVar, Context context) {
        super(context);
        this.f2021a = 5;
        this.f2023c = kiVar;
        this.f2022b = new Paint(1);
    }
}
