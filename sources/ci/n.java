package ci;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.Layout;
import android.view.View;
import android.widget.TextView;
import ji.i6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.ha0;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.voip.v0;
import org.telegram.ui.Components.x90;
import org.telegram.ui.h80;
import sg.i0;
import sg.j0;
import sg.w1;
public final class n extends TextView {
    public final int f4768a;
    public Object f4769b;
    public final Object f4770c;

    public n(i6 i6Var, Context context) {
        super(context);
        this.f4768a = 3;
        this.f4770c = i6Var;
        this.f4769b = new Paint(1);
    }

    public void a() {
        ha0 ha0Var = (ha0) this.f4770c;
        x90 x90Var = (x90) this.f4769b;
        if (x90Var != null && ha0Var != null) {
            x90Var.rewind();
            if (getLayout() != null && getLayout().getText() != null) {
                x90Var.e(getLayout(), 0, getPaddingLeft(), getPaddingTop());
                getLayout().getSelectionPath(0, getLayout().getText().length(), x90Var);
            }
            ha0Var.l();
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f4768a) {
            case 0:
                Paint paint = (Paint) this.f4769b;
                int dp = AndroidUtilities.dp(1.0f) + (getHeight() / 2);
                int max = Math.max(1, AndroidUtilities.dp(0.66f));
                Layout layout = getLayout();
                if (layout != null) {
                    paint.setColor(g6.m1(0.45f, g6.w0(g6.f19988y6, ((t) this.f4770c).W.f4801c)));
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
                Paint paint2 = (Paint) this.f4769b;
                int dp2 = AndroidUtilities.dp(1.0f) + (getHeight() / 2);
                int max2 = Math.max(1, AndroidUtilities.dp(0.66f));
                Layout layout2 = getLayout();
                if (layout2 != null) {
                    paint2.setColor(g6.m1(0.45f, g6.w0(g6.f19988y6, (c6) this.f4770c)));
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
                Paint paint3 = (Paint) this.f4769b;
                paint3.setColor(g6.m1(0.8f, g6.w0(g6.f20005z6, j0.V0(((i0) this.f4770c).e))));
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
        switch (this.f4768a) {
            case 4:
                ((org.telegram.ui.h) this.f4770c).f36338b.draw(canvas);
                super.draw(canvas);
                return;
            case 9:
                ((h80) this.f4770c).h.draw(canvas);
                super.draw(canvas);
                return;
            default:
                super.draw(canvas);
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f4768a) {
            case 7:
                super.onDetachedFromWindow();
                ((ha0) this.f4770c).f25248b = -1L;
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f4768a) {
            case 2:
                Paint paint = (Paint) this.f4769b;
                paint.setColor(((gi.p) this.f4770c).getThemedColor(g6.Oh));
                canvas.drawRoundRect(0.0f, (getHeight() / 2.0f) - AndroidUtilities.dp(14.0f), getWidth(), (getHeight() / 2.0f) + AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), paint);
                super.onDraw(canvas);
                return;
            case 3:
                Paint paint2 = (Paint) this.f4769b;
                ji.a aVar = ((i6) this.f4770c).f13345x;
                if (aVar != null && aVar.f13108c > 0 && aVar.d == 0 && !aVar.e) {
                    paint2.setColor(getCurrentTextColor());
                    float baseline = getBaseline() - (getTextSize() * 0.35f);
                    canvas.drawCircle(getWidth() / 2.0f, baseline, AndroidUtilities.dpf2(4.3f) / 2.0f, paint2);
                    return;
                }
                super.onDraw(canvas);
                return;
            case 4:
                super.onDraw(canvas);
                if (((org.telegram.ui.h) this.f4770c).f36344w) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    ((org.telegram.ui.Components.voip.h) this.f4769b).a(getMeasuredHeight() / 2.0f, canvas, rectF, null);
                    invalidate();
                    return;
                }
                return;
            case 5:
                Paint paint3 = (Paint) this.f4769b;
                paint3.setColor(((vi) this.f4770c).getThemedColor(g6.Oh));
                canvas.drawRoundRect(0.0f, (getHeight() / 2.0f) - AndroidUtilities.dp(14.0f), getWidth(), (getHeight() / 2.0f) + AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), paint3);
                super.onDraw(canvas);
                return;
            case 6:
                if (((w1) this.f4769b) != null) {
                    canvas.save();
                    canvas.clipPath((Path) this.f4770c);
                    ((w1) this.f4769b).d(canvas);
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
                Paint[] paintArr = (Paint[]) this.f4769b;
                v0 v0Var = (v0) this.f4770c;
                paintArr[v0Var.f30221x].setAlpha(255);
                canvas.drawRoundRect(rectF2, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paintArr[v0Var.f30221x]);
                float f7 = v0Var.f30220w;
                if (f7 > 0.0f) {
                    int i10 = v0Var.f30221x;
                    if (i10 + 1 < paintArr.length) {
                        paintArr[i10 + 1].setAlpha((int) (f7 * 255.0f));
                        canvas.drawRoundRect(rectF2, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paintArr[v0Var.f30221x + 1]);
                    }
                }
                super.onDraw(canvas);
                return;
            case 9:
                super.onDraw(canvas);
                RectF rectF3 = AndroidUtilities.rectTmp;
                rectF3.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                ((org.telegram.ui.Components.voip.h) this.f4769b).a(getMeasuredHeight() / 2.0f, canvas, rectF3, null);
                invalidate();
                return;
            case 11:
                Paint paint4 = (Paint) this.f4769b;
                paint4.setColor(((uh.f) this.f4770c).getThemedColor(g6.Oh));
                canvas.drawRoundRect(0.0f, (getHeight() / 2.0f) - AndroidUtilities.dp(14.0f), getWidth(), (getHeight() / 2.0f) + AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), paint4);
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f4768a) {
            case 6:
                super.onLayout(z10, i10, i11, i12, i13);
                w1 w1Var = new w1(10);
                this.f4769b = w1Var;
                w1Var.N = 100;
                w1Var.J = false;
                w1Var.M = true;
                w1Var.G = false;
                w1Var.K = true;
                w1Var.H = true;
                w1Var.f45413r = 1;
                w1Var.f45417w = 0.98f;
                w1Var.v = 0.98f;
                w1Var.f45416u = 0.98f;
                w1Var.f45403g = false;
                w1Var.f45410o = 0.0f;
                w1Var.f45418x = 750L;
                w1Var.f45419y = 750;
                w1Var.c();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                ((w1) this.f4769b).f45399a.set(rectF);
                ((w1) this.f4769b).f45400b.set(rectF);
                ((w1) this.f4769b).f();
                Path path = (Path) this.f4770c;
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
        switch (this.f4768a) {
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
        throw new UnsupportedOperationException("Method not decompiled: ci.n.onSizeChanged(int, int, int, int):void");
    }

    @Override
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        switch (this.f4768a) {
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
        switch (this.f4768a) {
            case 7:
                super.setTextColor(g6.m1(0.2f, i10));
                ((ha0) this.f4770c).g(g6.m1(0.03f, i10), g6.m1(0.175f, i10), g6.m1(0.2f, i10), g6.m1(0.45f, i10));
                return;
            default:
                super.setTextColor(i10);
                return;
        }
    }

    public n(v0 v0Var, Context context) {
        super(context);
        this.f4768a = 8;
        this.f4770c = v0Var;
        this.f4769b = new Paint[v0Var.f30216f.length];
        int i10 = 0;
        while (true) {
            Paint[] paintArr = (Paint[]) this.f4769b;
            if (i10 >= paintArr.length) {
                return;
            }
            paintArr[i10] = new Paint(1);
            i10++;
        }
    }

    public n(Context context, int i10) {
        super(context);
        this.f4768a = i10;
        switch (i10) {
            case 7:
                super(context);
                x90 x90Var = new x90(0);
                this.f4769b = x90Var;
                ha0 ha0Var = new ha0();
                this.f4770c = ha0Var;
                ha0Var.f25267y = x90Var;
                ha0Var.f25264u = 0.65f;
                ha0Var.k(4.0f);
                setBackground(ha0Var);
                return;
            default:
                this.f4770c = new Path();
                return;
        }
    }

    public n(uh.f fVar, Context context) {
        super(context);
        this.f4768a = 11;
        this.f4770c = fVar;
        this.f4769b = new Paint(1);
    }

    public n(gi.p pVar, Context context) {
        super(context);
        this.f4768a = 2;
        this.f4770c = pVar;
        this.f4769b = new Paint(1);
    }

    public n(h80 h80Var, Context context) {
        super(context);
        this.f4768a = 9;
        this.f4770c = h80Var;
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.f4769b = hVar;
        hVar.f29869k = false;
        hVar.f29871m = 2.0f;
    }

    public n(org.telegram.ui.h hVar, Context context) {
        super(context);
        this.f4768a = 4;
        this.f4770c = hVar;
        org.telegram.ui.Components.voip.h hVar2 = new org.telegram.ui.Components.voip.h();
        this.f4769b = hVar2;
        hVar2.f29869k = false;
        hVar2.f29871m = 2.0f;
    }

    public n(t tVar, Context context) {
        super(context);
        this.f4768a = 0;
        this.f4770c = tVar;
        this.f4769b = new Paint(1);
    }

    public n(Context context, c6 c6Var) {
        super(context);
        this.f4768a = 1;
        this.f4770c = c6Var;
        this.f4769b = new Paint(1);
    }

    public n(i0 i0Var, Context context) {
        super(context);
        this.f4768a = 10;
        this.f4770c = i0Var;
        this.f4769b = new Paint(1);
    }

    public n(vi viVar, Context context) {
        super(context);
        this.f4768a = 5;
        this.f4770c = viVar;
        this.f4769b = new Paint(1);
    }
}
