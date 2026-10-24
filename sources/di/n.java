package di;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.Layout;
import android.view.View;
import android.widget.TextView;
import ki.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.aa0;
import org.telegram.ui.Components.q90;
import org.telegram.ui.Components.ri;
import org.telegram.ui.Components.voip.v0;
import org.telegram.ui.n70;
import sg.i0;
import sg.j0;
import sg.w1;
public final class n extends TextView {
    public final int f8049a;
    public Object f8050b;
    public final Object f8051c;

    public n(v0 v0Var, Context context) {
        super(context);
        this.f8049a = 8;
        this.f8051c = v0Var;
        this.f8050b = new Paint[v0Var.f31938f.length];
        int i10 = 0;
        while (true) {
            Paint[] paintArr = (Paint[]) this.f8050b;
            if (i10 >= paintArr.length) {
                return;
            }
            paintArr[i10] = new Paint(1);
            i10++;
        }
    }

    public void a() {
        aa0 aa0Var = (aa0) this.f8051c;
        q90 q90Var = (q90) this.f8050b;
        if (q90Var != null && aa0Var != null) {
            q90Var.rewind();
            if (getLayout() != null && getLayout().getText() != null) {
                q90Var.e(getLayout(), 0, getPaddingLeft(), getPaddingTop());
                getLayout().getSelectionPath(0, getLayout().getText().length(), q90Var);
            }
            aa0Var.l();
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f8049a) {
            case 0:
                Paint paint = (Paint) this.f8050b;
                int dp = AndroidUtilities.dp(1.0f) + (getHeight() / 2);
                int max = Math.max(1, AndroidUtilities.dp(0.66f));
                Layout layout = getLayout();
                if (layout != null) {
                    paint.setColor(k6.o1(0.45f, k6.w0(k6.f21572y6, ((r) this.f8051c).W.f8077c)));
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
                Paint paint2 = (Paint) this.f8050b;
                int dp2 = AndroidUtilities.dp(1.0f) + (getHeight() / 2);
                int max2 = Math.max(1, AndroidUtilities.dp(0.66f));
                Layout layout2 = getLayout();
                if (layout2 != null) {
                    paint2.setColor(k6.o1(0.45f, k6.w0(k6.f21572y6, (g6) this.f8051c)));
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
                Paint paint3 = (Paint) this.f8050b;
                paint3.setColor(k6.o1(0.8f, k6.w0(k6.f21589z6, j0.X0(((i0) this.f8051c).e))));
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
        switch (this.f8049a) {
            case 4:
                ((org.telegram.ui.g) this.f8051c).f37401b.draw(canvas);
                super.draw(canvas);
                return;
            case 9:
                ((n70) this.f8051c).h.draw(canvas);
                super.draw(canvas);
                return;
            default:
                super.draw(canvas);
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f8049a) {
            case 7:
                super.onDetachedFromWindow();
                ((aa0) this.f8051c).f24685b = -1L;
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f8049a) {
            case 2:
                Paint paint = (Paint) this.f8050b;
                paint.setColor(((hi.o) this.f8051c).getThemedColor(k6.Oh));
                canvas.drawRoundRect(0.0f, (getHeight() / 2.0f) - AndroidUtilities.dp(14.0f), getWidth(), (getHeight() / 2.0f) + AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), paint);
                super.onDraw(canvas);
                return;
            case 3:
                Paint paint2 = (Paint) this.f8050b;
                ki.a aVar = ((c6) this.f8051c).f15245x;
                if (aVar != null && aVar.f15142c > 0 && aVar.d == 0 && !aVar.e) {
                    paint2.setColor(getCurrentTextColor());
                    float baseline = getBaseline() - (getTextSize() * 0.35f);
                    canvas.drawCircle(getWidth() / 2.0f, baseline, AndroidUtilities.dpf2(4.3f) / 2.0f, paint2);
                    return;
                }
                super.onDraw(canvas);
                return;
            case 4:
                super.onDraw(canvas);
                if (((org.telegram.ui.g) this.f8051c).f37407w) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    ((org.telegram.ui.Components.voip.h) this.f8050b).a(getMeasuredHeight() / 2.0f, canvas, rectF, null);
                    invalidate();
                    return;
                }
                return;
            case 5:
                Paint paint3 = (Paint) this.f8050b;
                paint3.setColor(((ri) this.f8051c).getThemedColor(k6.Oh));
                canvas.drawRoundRect(0.0f, (getHeight() / 2.0f) - AndroidUtilities.dp(14.0f), getWidth(), (getHeight() / 2.0f) + AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), paint3);
                super.onDraw(canvas);
                return;
            case 6:
                if (((w1) this.f8050b) != null) {
                    canvas.save();
                    canvas.clipPath((Path) this.f8051c);
                    ((w1) this.f8050b).d(canvas);
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
                Paint[] paintArr = (Paint[]) this.f8050b;
                v0 v0Var = (v0) this.f8051c;
                paintArr[v0Var.f31943x].setAlpha(255);
                canvas.drawRoundRect(rectF2, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paintArr[v0Var.f31943x]);
                float f7 = v0Var.f31942w;
                if (f7 > 0.0f) {
                    int i10 = v0Var.f31943x;
                    if (i10 + 1 < paintArr.length) {
                        paintArr[i10 + 1].setAlpha((int) (f7 * 255.0f));
                        canvas.drawRoundRect(rectF2, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paintArr[v0Var.f31943x + 1]);
                    }
                }
                super.onDraw(canvas);
                return;
            case 9:
                super.onDraw(canvas);
                RectF rectF3 = AndroidUtilities.rectTmp;
                rectF3.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                ((org.telegram.ui.Components.voip.h) this.f8050b).a(getMeasuredHeight() / 2.0f, canvas, rectF3, null);
                invalidate();
                return;
            case 11:
                Paint paint4 = (Paint) this.f8050b;
                paint4.setColor(((uh.f) this.f8051c).getThemedColor(k6.Oh));
                canvas.drawRoundRect(0.0f, (getHeight() / 2.0f) - AndroidUtilities.dp(14.0f), getWidth(), (getHeight() / 2.0f) + AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), paint4);
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f8049a) {
            case 6:
                super.onLayout(z10, i10, i11, i12, i13);
                w1 w1Var = new w1(10);
                this.f8050b = w1Var;
                w1Var.O = 100;
                w1Var.J = false;
                w1Var.M = true;
                w1Var.G = false;
                w1Var.K = true;
                w1Var.H = true;
                w1Var.f46923r = 1;
                w1Var.f46927w = 0.98f;
                w1Var.v = 0.98f;
                w1Var.f46926u = 0.98f;
                w1Var.f46913g = false;
                w1Var.f46920o = 0.0f;
                w1Var.f46928x = 750L;
                w1Var.f46929y = 750;
                w1Var.c();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                ((w1) this.f8050b).f46909a.set(rectF);
                ((w1) this.f8050b).f46910b.set(rectF);
                ((w1) this.f8050b).f();
                Path path = (Path) this.f8051c;
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
        switch (this.f8049a) {
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
        throw new UnsupportedOperationException("Method not decompiled: di.n.onSizeChanged(int, int, int, int):void");
    }

    @Override
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        switch (this.f8049a) {
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
        switch (this.f8049a) {
            case 7:
                super.setTextColor(k6.o1(0.2f, i10));
                ((aa0) this.f8051c).g(k6.o1(0.03f, i10), k6.o1(0.175f, i10), k6.o1(0.2f, i10), k6.o1(0.45f, i10));
                return;
            default:
                super.setTextColor(i10);
                return;
        }
    }

    public n(c6 c6Var, Context context) {
        super(context);
        this.f8049a = 3;
        this.f8051c = c6Var;
        this.f8050b = new Paint(1);
    }

    public n(Context context, int i10) {
        super(context);
        this.f8049a = i10;
        switch (i10) {
            case 7:
                super(context);
                q90 q90Var = new q90(0);
                this.f8050b = q90Var;
                aa0 aa0Var = new aa0();
                this.f8051c = aa0Var;
                aa0Var.f24704y = q90Var;
                aa0Var.f24701u = 0.65f;
                aa0Var.k(4.0f);
                setBackground(aa0Var);
                return;
            default:
                this.f8051c = new Path();
                return;
        }
    }

    public n(uh.f fVar, Context context) {
        super(context);
        this.f8049a = 11;
        this.f8051c = fVar;
        this.f8050b = new Paint(1);
    }

    public n(hi.o oVar, Context context) {
        super(context);
        this.f8049a = 2;
        this.f8051c = oVar;
        this.f8050b = new Paint(1);
    }

    public n(n70 n70Var, Context context) {
        super(context);
        this.f8049a = 9;
        this.f8051c = n70Var;
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.f8050b = hVar;
        hVar.f31587k = false;
        hVar.f31589m = 2.0f;
    }

    public n(org.telegram.ui.g gVar, Context context) {
        super(context);
        this.f8049a = 4;
        this.f8051c = gVar;
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.f8050b = hVar;
        hVar.f31587k = false;
        hVar.f31589m = 2.0f;
    }

    public n(r rVar, Context context) {
        super(context);
        this.f8049a = 0;
        this.f8051c = rVar;
        this.f8050b = new Paint(1);
    }

    public n(Context context, g6 g6Var) {
        super(context);
        this.f8049a = 1;
        this.f8051c = g6Var;
        this.f8050b = new Paint(1);
    }

    public n(i0 i0Var, Context context) {
        super(context);
        this.f8049a = 10;
        this.f8051c = i0Var;
        this.f8050b = new Paint(1);
    }

    public n(ri riVar, Context context) {
        super(context);
        this.f8049a = 5;
        this.f8051c = riVar;
        this.f8050b = new Paint(1);
    }
}
