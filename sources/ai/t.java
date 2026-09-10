package ai;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.Layout;
import android.view.View;
import android.widget.TextView;
import hi.g6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.g90;
import org.telegram.ui.Components.q90;
import org.telegram.ui.Components.voip.w0;
import org.telegram.ui.Components.yi;
import org.telegram.ui.c80;
import qg.j0;
import qg.k0;
import qg.w1;
public final class t extends TextView {
    public final int f464a;
    public Object f465b;
    public final Object f466c;

    public t(g6 g6Var, Context context) {
        super(context);
        this.f464a = 3;
        this.f466c = g6Var;
        this.f465b = new Paint(1);
    }

    public void a() {
        q90 q90Var = (q90) this.f466c;
        g90 g90Var = (g90) this.f465b;
        if (g90Var != null && q90Var != null) {
            g90Var.rewind();
            if (getLayout() != null && getLayout().getText() != null) {
                g90Var.e(getLayout(), 0, getPaddingLeft(), getPaddingTop());
                getLayout().getSelectionPath(0, getLayout().getText().length(), g90Var);
            }
            q90Var.k();
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f464a) {
            case 0:
                Paint paint = (Paint) this.f465b;
                int dp = AndroidUtilities.dp(1.0f) + (getHeight() / 2);
                int max = Math.max(1, AndroidUtilities.dp(0.66f));
                Layout layout = getLayout();
                if (layout != null) {
                    paint.setColor(j6.l1(0.45f, j6.v0(j6.f18306y6, ((a0) this.f466c).W.f444c)));
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
                Paint paint2 = (Paint) this.f465b;
                int dp2 = AndroidUtilities.dp(1.0f) + (getHeight() / 2);
                int max2 = Math.max(1, AndroidUtilities.dp(0.66f));
                Layout layout2 = getLayout();
                if (layout2 != null) {
                    paint2.setColor(j6.l1(0.45f, j6.v0(j6.f18306y6, (f6) this.f466c)));
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
                Paint paint3 = (Paint) this.f465b;
                paint3.setColor(j6.l1(0.8f, j6.v0(j6.f18325z6, k0.U0(((j0) this.f466c).e))));
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
        switch (this.f464a) {
            case 4:
                ((org.telegram.ui.h) this.f466c).f33219b.draw(canvas);
                super.draw(canvas);
                return;
            case 9:
                ((c80) this.f466c).h.draw(canvas);
                super.draw(canvas);
                return;
            default:
                super.draw(canvas);
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f464a) {
            case 7:
                super.onDetachedFromWindow();
                ((q90) this.f466c).f26346b = -1L;
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f464a) {
            case 2:
                Paint paint = (Paint) this.f465b;
                paint.setColor(((ei.p) this.f466c).getThemedColor(j6.Oh));
                canvas.drawRoundRect(0.0f, (getHeight() / 2.0f) - AndroidUtilities.dp(14.0f), getWidth(), (getHeight() / 2.0f) + AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), paint);
                super.onDraw(canvas);
                return;
            case 3:
                Paint paint2 = (Paint) this.f465b;
                hi.a aVar = ((g6) this.f466c).f9626x;
                if (aVar != null && aVar.f9422c > 0 && aVar.d == 0 && !aVar.e) {
                    paint2.setColor(getCurrentTextColor());
                    float baseline = getBaseline() - (getTextSize() * 0.35f);
                    canvas.drawCircle(getWidth() / 2.0f, baseline, AndroidUtilities.dpf2(4.3f) / 2.0f, paint2);
                    return;
                }
                super.onDraw(canvas);
                return;
            case 4:
                super.onDraw(canvas);
                if (((org.telegram.ui.h) this.f466c).f33225w) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    ((org.telegram.ui.Components.voip.h) this.f465b).a(getMeasuredHeight() / 2.0f, canvas, rectF, null);
                    invalidate();
                    return;
                }
                return;
            case 5:
                Paint paint3 = (Paint) this.f465b;
                paint3.setColor(((yi) this.f466c).getThemedColor(j6.Oh));
                canvas.drawRoundRect(0.0f, (getHeight() / 2.0f) - AndroidUtilities.dp(14.0f), getWidth(), (getHeight() / 2.0f) + AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), paint3);
                super.onDraw(canvas);
                return;
            case 6:
                if (((w1) this.f465b) != null) {
                    canvas.save();
                    canvas.clipPath((Path) this.f466c);
                    ((w1) this.f465b).d(canvas);
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
                Paint[] paintArr = (Paint[]) this.f465b;
                w0 w0Var = (w0) this.f466c;
                paintArr[w0Var.f28513x].setAlpha(255);
                canvas.drawRoundRect(rectF2, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paintArr[w0Var.f28513x]);
                float f7 = w0Var.f28512w;
                if (f7 > 0.0f) {
                    int i10 = w0Var.f28513x;
                    if (i10 + 1 < paintArr.length) {
                        paintArr[i10 + 1].setAlpha((int) (f7 * 255.0f));
                        canvas.drawRoundRect(rectF2, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paintArr[w0Var.f28513x + 1]);
                    }
                }
                super.onDraw(canvas);
                return;
            case 9:
                super.onDraw(canvas);
                RectF rectF3 = AndroidUtilities.rectTmp;
                rectF3.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                ((org.telegram.ui.Components.voip.h) this.f465b).a(getMeasuredHeight() / 2.0f, canvas, rectF3, null);
                invalidate();
                return;
            case 11:
                Paint paint4 = (Paint) this.f465b;
                paint4.setColor(((sh.f) this.f466c).getThemedColor(j6.Oh));
                canvas.drawRoundRect(0.0f, (getHeight() / 2.0f) - AndroidUtilities.dp(14.0f), getWidth(), (getHeight() / 2.0f) + AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), paint4);
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f464a) {
            case 6:
                super.onLayout(z10, i10, i11, i12, i13);
                w1 w1Var = new w1(10);
                this.f465b = w1Var;
                w1Var.N = 100;
                w1Var.J = false;
                w1Var.M = true;
                w1Var.G = false;
                w1Var.K = true;
                w1Var.H = true;
                w1Var.f40969r = 1;
                w1Var.f40973w = 0.98f;
                w1Var.v = 0.98f;
                w1Var.f40972u = 0.98f;
                w1Var.f40959g = false;
                w1Var.f40966o = 0.0f;
                w1Var.f40974x = 750L;
                w1Var.f40975y = 750;
                w1Var.c();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                ((w1) this.f465b).f40955a.set(rectF);
                ((w1) this.f465b).f40956b.set(rectF);
                ((w1) this.f465b).f();
                Path path = (Path) this.f466c;
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
        switch (this.f464a) {
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
        throw new UnsupportedOperationException("Method not decompiled: ai.t.onSizeChanged(int, int, int, int):void");
    }

    @Override
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        switch (this.f464a) {
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
        switch (this.f464a) {
            case 7:
                super.setTextColor(j6.l1(0.2f, i10));
                ((q90) this.f466c).f(j6.l1(0.03f, i10), j6.l1(0.175f, i10), j6.l1(0.2f, i10), j6.l1(0.45f, i10));
                return;
            default:
                super.setTextColor(i10);
                return;
        }
    }

    public t(w0 w0Var, Context context) {
        super(context);
        this.f464a = 8;
        this.f466c = w0Var;
        this.f465b = new Paint[w0Var.f28508f.length];
        int i10 = 0;
        while (true) {
            Paint[] paintArr = (Paint[]) this.f465b;
            if (i10 >= paintArr.length) {
                return;
            }
            paintArr[i10] = new Paint(1);
            i10++;
        }
    }

    public t(Context context, int i10) {
        super(context);
        this.f464a = i10;
        switch (i10) {
            case 7:
                super(context);
                g90 g90Var = new g90(0);
                this.f465b = g90Var;
                q90 q90Var = new q90();
                this.f466c = q90Var;
                q90Var.f26364x = g90Var;
                q90Var.f26362u = 0.65f;
                q90Var.j(4.0f);
                setBackground(q90Var);
                return;
            default:
                this.f466c = new Path();
                return;
        }
    }

    public t(sh.f fVar, Context context) {
        super(context);
        this.f464a = 11;
        this.f466c = fVar;
        this.f465b = new Paint(1);
    }

    public t(ei.p pVar, Context context) {
        super(context);
        this.f464a = 2;
        this.f466c = pVar;
        this.f465b = new Paint(1);
    }

    public t(c80 c80Var, Context context) {
        super(context);
        this.f464a = 9;
        this.f466c = c80Var;
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.f465b = hVar;
        hVar.f28151k = false;
        hVar.f28153m = 2.0f;
    }

    public t(org.telegram.ui.h hVar, Context context) {
        super(context);
        this.f464a = 4;
        this.f466c = hVar;
        org.telegram.ui.Components.voip.h hVar2 = new org.telegram.ui.Components.voip.h();
        this.f465b = hVar2;
        hVar2.f28151k = false;
        hVar2.f28153m = 2.0f;
    }

    public t(a0 a0Var, Context context) {
        super(context);
        this.f464a = 0;
        this.f466c = a0Var;
        this.f465b = new Paint(1);
    }

    public t(Context context, f6 f6Var) {
        super(context);
        this.f464a = 1;
        this.f466c = f6Var;
        this.f465b = new Paint(1);
    }

    public t(j0 j0Var, Context context) {
        super(context);
        this.f464a = 10;
        this.f466c = j0Var;
        this.f465b = new Paint(1);
    }

    public t(yi yiVar, Context context) {
        super(context);
        this.f464a = 5;
        this.f466c = yiVar;
        this.f465b = new Paint(1);
    }
}
