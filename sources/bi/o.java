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
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.k90;
import org.telegram.ui.Components.u90;
import org.telegram.ui.Components.voip.x0;
import org.telegram.ui.Components.xi;
import org.telegram.ui.c80;
import rg.j0;
import rg.k0;
import rg.x1;
public final class o extends TextView {
    public final int f3858a;
    public Object f3859b;
    public final Object f3860c;

    public o(f6 f6Var, Context context) {
        super(context);
        this.f3858a = 3;
        this.f3860c = f6Var;
        this.f3859b = new Paint(1);
    }

    public void a() {
        u90 u90Var = (u90) this.f3860c;
        k90 k90Var = (k90) this.f3859b;
        if (k90Var != null && u90Var != null) {
            k90Var.rewind();
            if (getLayout() != null && getLayout().getText() != null) {
                k90Var.e(getLayout(), 0, getPaddingLeft(), getPaddingTop());
                getLayout().getSelectionPath(0, getLayout().getText().length(), k90Var);
            }
            u90Var.k();
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f3858a) {
            case 0:
                Paint paint = (Paint) this.f3859b;
                int dp = AndroidUtilities.dp(1.0f) + (getHeight() / 2);
                int max = Math.max(1, AndroidUtilities.dp(0.66f));
                Layout layout = getLayout();
                if (layout != null) {
                    paint.setColor(i6.l1(0.45f, i6.v0(i6.f21214y6, ((u) this.f3860c).W.f3893c)));
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
                Paint paint2 = (Paint) this.f3859b;
                int dp2 = AndroidUtilities.dp(1.0f) + (getHeight() / 2);
                int max2 = Math.max(1, AndroidUtilities.dp(0.66f));
                Layout layout2 = getLayout();
                if (layout2 != null) {
                    paint2.setColor(i6.l1(0.45f, i6.v0(i6.f21214y6, (d6) this.f3860c)));
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
                Paint paint3 = (Paint) this.f3859b;
                paint3.setColor(i6.l1(0.8f, i6.v0(i6.f21233z6, k0.U0(((j0) this.f3860c).f46149e))));
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
        switch (this.f3858a) {
            case 4:
                ((org.telegram.ui.h) this.f3860c).f36821b.draw(canvas);
                super.draw(canvas);
                return;
            case 9:
                ((c80) this.f3860c).h.draw(canvas);
                super.draw(canvas);
                return;
            default:
                super.draw(canvas);
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f3858a) {
            case 7:
                super.onDetachedFromWindow();
                ((u90) this.f3860c).f31387b = -1L;
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f3858a) {
            case 2:
                Paint paint = (Paint) this.f3859b;
                paint.setColor(((fi.p) this.f3860c).getThemedColor(i6.Oh));
                canvas.drawRoundRect(0.0f, (getHeight() / 2.0f) - AndroidUtilities.dp(14.0f), getWidth(), (getHeight() / 2.0f) + AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), paint);
                super.onDraw(canvas);
                return;
            case 3:
                Paint paint2 = (Paint) this.f3859b;
                ii.a aVar = ((f6) this.f3860c).f12377x;
                if (aVar != null && aVar.f12188c > 0 && aVar.d == 0 && !aVar.f12189e) {
                    paint2.setColor(getCurrentTextColor());
                    float baseline = getBaseline() - (getTextSize() * 0.35f);
                    canvas.drawCircle(getWidth() / 2.0f, baseline, AndroidUtilities.dpf2(4.3f) / 2.0f, paint2);
                    return;
                }
                super.onDraw(canvas);
                return;
            case 4:
                super.onDraw(canvas);
                if (((org.telegram.ui.h) this.f3860c).f36828w) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    ((org.telegram.ui.Components.voip.h) this.f3859b).a(getMeasuredHeight() / 2.0f, canvas, rectF, null);
                    invalidate();
                    return;
                }
                return;
            case 5:
                Paint paint3 = (Paint) this.f3859b;
                paint3.setColor(((xi) this.f3860c).getThemedColor(i6.Oh));
                canvas.drawRoundRect(0.0f, (getHeight() / 2.0f) - AndroidUtilities.dp(14.0f), getWidth(), (getHeight() / 2.0f) + AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), paint3);
                super.onDraw(canvas);
                return;
            case 6:
                if (((x1) this.f3859b) != null) {
                    canvas.save();
                    canvas.clipPath((Path) this.f3860c);
                    ((x1) this.f3859b).d(canvas);
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
                Paint[] paintArr = (Paint[]) this.f3859b;
                x0 x0Var = (x0) this.f3860c;
                paintArr[x0Var.f32354x].setAlpha(255);
                canvas.drawRoundRect(rectF2, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paintArr[x0Var.f32354x]);
                float f7 = x0Var.f32353w;
                if (f7 > 0.0f) {
                    int i10 = x0Var.f32354x;
                    if (i10 + 1 < paintArr.length) {
                        paintArr[i10 + 1].setAlpha((int) (f7 * 255.0f));
                        canvas.drawRoundRect(rectF2, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paintArr[x0Var.f32354x + 1]);
                    }
                }
                super.onDraw(canvas);
                return;
            case 9:
                super.onDraw(canvas);
                RectF rectF3 = AndroidUtilities.rectTmp;
                rectF3.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                ((org.telegram.ui.Components.voip.h) this.f3859b).a(getMeasuredHeight() / 2.0f, canvas, rectF3, null);
                invalidate();
                return;
            case 11:
                Paint paint4 = (Paint) this.f3859b;
                paint4.setColor(((th.f) this.f3860c).getThemedColor(i6.Oh));
                canvas.drawRoundRect(0.0f, (getHeight() / 2.0f) - AndroidUtilities.dp(14.0f), getWidth(), (getHeight() / 2.0f) + AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), paint4);
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f3858a) {
            case 6:
                super.onLayout(z10, i10, i11, i12, i13);
                x1 x1Var = new x1(10);
                this.f3859b = x1Var;
                x1Var.N = 100;
                x1Var.J = false;
                x1Var.M = true;
                x1Var.G = false;
                x1Var.K = true;
                x1Var.H = true;
                x1Var.f46387r = 1;
                x1Var.f46391w = 0.98f;
                x1Var.v = 0.98f;
                x1Var.f46390u = 0.98f;
                x1Var.f46377g = false;
                x1Var.f46384o = 0.0f;
                x1Var.f46392x = 750L;
                x1Var.f46393y = 750;
                x1Var.c();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                ((x1) this.f3859b).f46372a.set(rectF);
                ((x1) this.f3859b).f46373b.set(rectF);
                ((x1) this.f3859b).f();
                Path path = (Path) this.f3860c;
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
        switch (this.f3858a) {
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
        switch (this.f3858a) {
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
        switch (this.f3858a) {
            case 7:
                super.setTextColor(i6.l1(0.2f, i10));
                ((u90) this.f3860c).f(i6.l1(0.03f, i10), i6.l1(0.175f, i10), i6.l1(0.2f, i10), i6.l1(0.45f, i10));
                return;
            default:
                super.setTextColor(i10);
                return;
        }
    }

    public o(x0 x0Var, Context context) {
        super(context);
        this.f3858a = 8;
        this.f3860c = x0Var;
        this.f3859b = new Paint[x0Var.f32349f.length];
        int i10 = 0;
        while (true) {
            Paint[] paintArr = (Paint[]) this.f3859b;
            if (i10 >= paintArr.length) {
                return;
            }
            paintArr[i10] = new Paint(1);
            i10++;
        }
    }

    public o(Context context, int i10) {
        super(context);
        this.f3858a = i10;
        switch (i10) {
            case 7:
                super(context);
                k90 k90Var = new k90(0);
                this.f3859b = k90Var;
                u90 u90Var = new u90();
                this.f3860c = u90Var;
                u90Var.f31406x = k90Var;
                u90Var.f31404u = 0.65f;
                u90Var.j(4.0f);
                setBackground(u90Var);
                return;
            default:
                this.f3860c = new Path();
                return;
        }
    }

    public o(th.f fVar, Context context) {
        super(context);
        this.f3858a = 11;
        this.f3860c = fVar;
        this.f3859b = new Paint(1);
    }

    public o(fi.p pVar, Context context) {
        super(context);
        this.f3858a = 2;
        this.f3860c = pVar;
        this.f3859b = new Paint(1);
    }

    public o(c80 c80Var, Context context) {
        super(context);
        this.f3858a = 9;
        this.f3860c = c80Var;
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.f3859b = hVar;
        hVar.f31952k = false;
        hVar.f31954m = 2.0f;
    }

    public o(org.telegram.ui.h hVar, Context context) {
        super(context);
        this.f3858a = 4;
        this.f3860c = hVar;
        org.telegram.ui.Components.voip.h hVar2 = new org.telegram.ui.Components.voip.h();
        this.f3859b = hVar2;
        hVar2.f31952k = false;
        hVar2.f31954m = 2.0f;
    }

    public o(u uVar, Context context) {
        super(context);
        this.f3858a = 0;
        this.f3860c = uVar;
        this.f3859b = new Paint(1);
    }

    public o(Context context, d6 d6Var) {
        super(context);
        this.f3858a = 1;
        this.f3860c = d6Var;
        this.f3859b = new Paint(1);
    }

    public o(j0 j0Var, Context context) {
        super(context);
        this.f3858a = 10;
        this.f3860c = j0Var;
        this.f3859b = new Paint(1);
    }

    public o(xi xiVar, Context context) {
        super(context);
        this.f3858a = 5;
        this.f3860c = xiVar;
        this.f3859b = new Paint(1);
    }
}
