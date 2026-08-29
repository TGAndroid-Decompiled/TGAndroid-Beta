package cg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.Layout;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.c90;
import org.telegram.ui.Components.ni;
import org.telegram.ui.Components.s80;
import org.telegram.ui.k70;
import th.t5;
public final class s0 extends TextView {
    public final int f3356a;
    public Object f3357b;
    public final Object f3358c;

    public s0(org.telegram.ui.Components.voip.v0 v0Var, Context context) {
        super(context);
        this.f3356a = 8;
        this.f3358c = v0Var;
        this.f3357b = new Paint[v0Var.f34071f.length];
        int i10 = 0;
        while (true) {
            Paint[] paintArr = (Paint[]) this.f3357b;
            if (i10 >= paintArr.length) {
                return;
            }
            paintArr[i10] = new Paint(1);
            i10++;
        }
    }

    public void a() {
        c90 c90Var = (c90) this.f3358c;
        s80 s80Var = (s80) this.f3357b;
        if (s80Var != null && c90Var != null) {
            s80Var.rewind();
            if (getLayout() != null && getLayout().getText() != null) {
                s80Var.e(getLayout(), 0, getPaddingLeft(), getPaddingTop());
                getLayout().getSelectionPath(0, getLayout().getText().length(), s80Var);
            }
            c90Var.k();
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        c6 c6Var;
        switch (this.f3356a) {
            case 0:
                Paint paint = (Paint) this.f3357b;
                int i10 = g6.f23450z6;
                c6Var = ((f3) ((u0) this.f3358c).f3394e).resourcesProvider;
                paint.setColor(g6.l1(0.8f, g6.v0(i10, c6Var)));
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(1.0f);
                float height = getHeight() / 2.0f;
                Layout layout = getLayout();
                int i11 = 0;
                for (int i12 = 0; i12 < layout.getLineCount(); i12++) {
                    i11 = Math.max(i11, (int) layout.getLineWidth(i12));
                }
                float f9 = i11 / 2.0f;
                canvas.drawLine(0.0f, height, ((getWidth() / 2.0f) - f9) - AndroidUtilities.dp(8.0f), height, paint);
                canvas.drawLine((getWidth() / 2.0f) + f9 + AndroidUtilities.dp(8.0f), height, getWidth(), height, paint);
                super.dispatchDraw(canvas);
                return;
            case 1:
            default:
                super.dispatchDraw(canvas);
                return;
            case 2:
                Paint paint2 = (Paint) this.f3357b;
                int dp = AndroidUtilities.dp(1.0f) + (getHeight() / 2);
                int max = Math.max(1, AndroidUtilities.dp(0.66f));
                Layout layout2 = getLayout();
                if (layout2 != null) {
                    paint2.setColor(g6.l1(0.45f, g6.v0(g6.f23433y6, ((mh.r) this.f3358c).S.f17058c)));
                    float f10 = dp;
                    float f11 = max / 2.0f;
                    float f12 = f10 - f11;
                    float f13 = f10 + f11;
                    canvas.drawRect(0.0f, f12, (getWidth() - (layout2.getLineWidth(0) + AndroidUtilities.dp(16.0f))) / 2.0f, f13, paint2);
                    canvas.drawRect(((layout2.getLineWidth(0) + getWidth()) + AndroidUtilities.dp(16.0f)) / 2.0f, f12, getWidth(), f13, paint2);
                }
                super.dispatchDraw(canvas);
                return;
            case 3:
                Paint paint3 = (Paint) this.f3357b;
                int dp2 = AndroidUtilities.dp(1.0f) + (getHeight() / 2);
                int max2 = Math.max(1, AndroidUtilities.dp(0.66f));
                Layout layout3 = getLayout();
                if (layout3 != null) {
                    paint3.setColor(g6.l1(0.45f, g6.v0(g6.f23433y6, (c6) this.f3358c)));
                    float f14 = dp2;
                    float f15 = max2 / 2.0f;
                    float f16 = f14 - f15;
                    float f17 = f14 + f15;
                    canvas.drawRect(0.0f, f16, (getWidth() - (layout3.getLineWidth(0) + AndroidUtilities.dp(16.0f))) / 2.0f, f17, paint3);
                    canvas.drawRect(((layout3.getLineWidth(0) + getWidth()) + AndroidUtilities.dp(16.0f)) / 2.0f, f16, getWidth(), f17, paint3);
                }
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f3356a) {
            case 4:
                ((org.telegram.ui.i) this.f3358c).f39078b.draw(canvas);
                super.draw(canvas);
                return;
            case 9:
                ((k70) this.f3358c).h.draw(canvas);
                super.draw(canvas);
                return;
            default:
                super.draw(canvas);
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f3356a) {
            case 7:
                super.onDetachedFromWindow();
                ((c90) this.f3358c).f27381b = -1L;
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f3356a) {
            case 1:
                Paint paint = (Paint) this.f3357b;
                paint.setColor(((eh.f) this.f3358c).getThemedColor(g6.Oh));
                canvas.drawRoundRect(0.0f, (getHeight() / 2.0f) - AndroidUtilities.dp(14.0f), getWidth(), (getHeight() / 2.0f) + AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), paint);
                super.onDraw(canvas);
                return;
            case 2:
            case 3:
            case 7:
            default:
                super.onDraw(canvas);
                return;
            case 4:
                super.onDraw(canvas);
                if (((org.telegram.ui.i) this.f3358c).f39085w) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    ((org.telegram.ui.Components.voip.h) this.f3357b).a(getMeasuredHeight() / 2.0f, canvas, rectF, null);
                    invalidate();
                    return;
                }
                return;
            case 5:
                Paint paint2 = (Paint) this.f3357b;
                paint2.setColor(((ni) this.f3358c).getThemedColor(g6.Oh));
                canvas.drawRoundRect(0.0f, (getHeight() / 2.0f) - AndroidUtilities.dp(14.0f), getWidth(), (getHeight() / 2.0f) + AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), paint2);
                super.onDraw(canvas);
                return;
            case 6:
                if (((r2) this.f3357b) != null) {
                    canvas.save();
                    canvas.clipPath((Path) this.f3358c);
                    ((r2) this.f3357b).d(canvas);
                    canvas.restore();
                    invalidate();
                }
                super.onDraw(canvas);
                return;
            case 8:
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                Paint[] paintArr = (Paint[]) this.f3357b;
                org.telegram.ui.Components.voip.v0 v0Var = (org.telegram.ui.Components.voip.v0) this.f3358c;
                paintArr[v0Var.f34076x].setAlpha(255);
                canvas.drawRoundRect(rectF2, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paintArr[v0Var.f34076x]);
                float f9 = v0Var.f34075w;
                if (f9 > 0.0f) {
                    int i10 = v0Var.f34076x;
                    if (i10 + 1 < paintArr.length) {
                        paintArr[i10 + 1].setAlpha((int) (f9 * 255.0f));
                        canvas.drawRoundRect(rectF2, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paintArr[v0Var.f34076x + 1]);
                    }
                }
                super.onDraw(canvas);
                return;
            case 9:
                super.onDraw(canvas);
                RectF rectF3 = AndroidUtilities.rectTmp;
                rectF3.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                ((org.telegram.ui.Components.voip.h) this.f3357b).a(getMeasuredHeight() / 2.0f, canvas, rectF3, null);
                invalidate();
                return;
            case 10:
                Paint paint3 = (Paint) this.f3357b;
                paint3.setColor(((qh.n) this.f3358c).getThemedColor(g6.Oh));
                canvas.drawRoundRect(0.0f, (getHeight() / 2.0f) - AndroidUtilities.dp(14.0f), getWidth(), (getHeight() / 2.0f) + AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), paint3);
                super.onDraw(canvas);
                return;
            case 11:
                Paint paint4 = (Paint) this.f3357b;
                th.a aVar = ((t5) this.f3358c).f48785x;
                if (aVar != null && aVar.f48329c > 0 && aVar.d == 0 && !aVar.f48330e) {
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
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f3356a) {
            case 6:
                super.onLayout(z10, i10, i11, i12, i13);
                r2 r2Var = new r2(10);
                this.f3357b = r2Var;
                r2Var.N = 100;
                r2Var.J = false;
                r2Var.M = true;
                r2Var.G = false;
                r2Var.K = true;
                r2Var.H = true;
                r2Var.f3345r = 1;
                r2Var.f3349w = 0.98f;
                r2Var.v = 0.98f;
                r2Var.f3348u = 0.98f;
                r2Var.f3335g = false;
                r2Var.f3342o = 0.0f;
                r2Var.f3350x = 750L;
                r2Var.f3351y = 750;
                r2Var.c();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                ((r2) this.f3357b).f3330a.set(rectF);
                ((r2) this.f3357b).f3331b.set(rectF);
                ((r2) this.f3357b).f();
                Path path = (Path) this.f3358c;
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
        switch (this.f3356a) {
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
        throw new UnsupportedOperationException("Method not decompiled: cg.s0.onSizeChanged(int, int, int, int):void");
    }

    @Override
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        switch (this.f3356a) {
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
        switch (this.f3356a) {
            case 7:
                super.setTextColor(g6.l1(0.2f, i10));
                ((c90) this.f3358c).f(g6.l1(0.03f, i10), g6.l1(0.175f, i10), g6.l1(0.2f, i10), g6.l1(0.45f, i10));
                return;
            default:
                super.setTextColor(i10);
                return;
        }
    }

    public s0(t5 t5Var, Context context) {
        super(context);
        this.f3356a = 11;
        this.f3358c = t5Var;
        this.f3357b = new Paint(1);
    }

    public s0(Context context, int i10) {
        super(context);
        this.f3356a = i10;
        switch (i10) {
            case 7:
                super(context);
                s80 s80Var = new s80(0);
                this.f3357b = s80Var;
                c90 c90Var = new c90();
                this.f3358c = c90Var;
                c90Var.f27400x = s80Var;
                c90Var.f27398u = 0.65f;
                c90Var.j(4.0f);
                setBackground(c90Var);
                return;
            default:
                this.f3358c = new Path();
                return;
        }
    }

    public s0(eh.f fVar, Context context) {
        super(context);
        this.f3356a = 1;
        this.f3358c = fVar;
        this.f3357b = new Paint(1);
    }

    public s0(qh.n nVar, Context context) {
        super(context);
        this.f3356a = 10;
        this.f3358c = nVar;
        this.f3357b = new Paint(1);
    }

    public s0(k70 k70Var, Context context) {
        super(context);
        this.f3356a = 9;
        this.f3358c = k70Var;
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.f3357b = hVar;
        hVar.f33724k = false;
        hVar.f33726m = 2.0f;
    }

    public s0(org.telegram.ui.i iVar, Context context) {
        super(context);
        this.f3356a = 4;
        this.f3358c = iVar;
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.f3357b = hVar;
        hVar.f33724k = false;
        hVar.f33726m = 2.0f;
    }

    public s0(mh.r rVar, Context context) {
        super(context);
        this.f3356a = 2;
        this.f3358c = rVar;
        this.f3357b = new Paint(1);
    }

    public s0(Context context, c6 c6Var) {
        super(context);
        this.f3356a = 3;
        this.f3358c = c6Var;
        this.f3357b = new Paint(1);
    }

    public s0(u0 u0Var, Context context) {
        super(context);
        this.f3356a = 0;
        this.f3358c = u0Var;
        this.f3357b = new Paint(1);
    }

    public s0(ni niVar, Context context) {
        super(context);
        this.f3356a = 5;
        this.f3358c = niVar;
        this.f3357b = new Paint(1);
    }
}
