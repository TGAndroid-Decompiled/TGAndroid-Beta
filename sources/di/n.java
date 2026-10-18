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
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.ba0;
import org.telegram.ui.Components.r90;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.voip.v0;
import org.telegram.ui.l70;
import sg.j0;
import sg.k0;
import sg.w1;
public final class n extends TextView {
    public final int f8043a;
    public Object f8044b;
    public final Object f8045c;

    public n(c6 c6Var, Context context) {
        super(context);
        this.f8043a = 3;
        this.f8045c = c6Var;
        this.f8044b = new Paint(1);
    }

    public void a() {
        ba0 ba0Var = (ba0) this.f8045c;
        r90 r90Var = (r90) this.f8044b;
        if (r90Var != null && ba0Var != null) {
            r90Var.rewind();
            if (getLayout() != null && getLayout().getText() != null) {
                r90Var.e(getLayout(), 0, getPaddingLeft(), getPaddingTop());
                getLayout().getSelectionPath(0, getLayout().getText().length(), r90Var);
            }
            ba0Var.l();
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f8043a) {
            case 0:
                Paint paint = (Paint) this.f8044b;
                int dp = AndroidUtilities.dp(1.0f) + (getHeight() / 2);
                int max = Math.max(1, AndroidUtilities.dp(0.66f));
                Layout layout = getLayout();
                if (layout != null) {
                    paint.setColor(h6.m1(0.45f, h6.w0(h6.f21374y6, ((r) this.f8045c).W.f8071c)));
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
                Paint paint2 = (Paint) this.f8044b;
                int dp2 = AndroidUtilities.dp(1.0f) + (getHeight() / 2);
                int max2 = Math.max(1, AndroidUtilities.dp(0.66f));
                Layout layout2 = getLayout();
                if (layout2 != null) {
                    paint2.setColor(h6.m1(0.45f, h6.w0(h6.f21374y6, (d6) this.f8045c)));
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
                Paint paint3 = (Paint) this.f8044b;
                paint3.setColor(h6.m1(0.8f, h6.w0(h6.f21391z6, k0.V0(((j0) this.f8045c).e))));
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
        switch (this.f8043a) {
            case 4:
                ((org.telegram.ui.h) this.f8045c).f37360b.draw(canvas);
                super.draw(canvas);
                return;
            case 9:
                ((l70) this.f8045c).h.draw(canvas);
                super.draw(canvas);
                return;
            default:
                super.draw(canvas);
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f8043a) {
            case 7:
                super.onDetachedFromWindow();
                ((ba0) this.f8045c).f24891b = -1L;
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f8043a) {
            case 2:
                Paint paint = (Paint) this.f8044b;
                paint.setColor(((hi.o) this.f8045c).getThemedColor(h6.Oh));
                canvas.drawRoundRect(0.0f, (getHeight() / 2.0f) - AndroidUtilities.dp(14.0f), getWidth(), (getHeight() / 2.0f) + AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), paint);
                super.onDraw(canvas);
                return;
            case 3:
                Paint paint2 = (Paint) this.f8044b;
                ki.a aVar = ((c6) this.f8045c).f15186x;
                if (aVar != null && aVar.f15095c > 0 && aVar.d == 0 && !aVar.e) {
                    paint2.setColor(getCurrentTextColor());
                    float baseline = getBaseline() - (getTextSize() * 0.35f);
                    canvas.drawCircle(getWidth() / 2.0f, baseline, AndroidUtilities.dpf2(4.3f) / 2.0f, paint2);
                    return;
                }
                super.onDraw(canvas);
                return;
            case 4:
                super.onDraw(canvas);
                if (((org.telegram.ui.h) this.f8045c).f37366w) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    ((org.telegram.ui.Components.voip.h) this.f8044b).a(getMeasuredHeight() / 2.0f, canvas, rectF, null);
                    invalidate();
                    return;
                }
                return;
            case 5:
                Paint paint3 = (Paint) this.f8044b;
                paint3.setColor(((ti) this.f8045c).getThemedColor(h6.Oh));
                canvas.drawRoundRect(0.0f, (getHeight() / 2.0f) - AndroidUtilities.dp(14.0f), getWidth(), (getHeight() / 2.0f) + AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), paint3);
                super.onDraw(canvas);
                return;
            case 6:
                if (((w1) this.f8044b) != null) {
                    canvas.save();
                    canvas.clipPath((Path) this.f8045c);
                    ((w1) this.f8044b).d(canvas);
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
                Paint[] paintArr = (Paint[]) this.f8044b;
                v0 v0Var = (v0) this.f8045c;
                paintArr[v0Var.f31827x].setAlpha(255);
                canvas.drawRoundRect(rectF2, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paintArr[v0Var.f31827x]);
                float f7 = v0Var.f31826w;
                if (f7 > 0.0f) {
                    int i10 = v0Var.f31827x;
                    if (i10 + 1 < paintArr.length) {
                        paintArr[i10 + 1].setAlpha((int) (f7 * 255.0f));
                        canvas.drawRoundRect(rectF2, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paintArr[v0Var.f31827x + 1]);
                    }
                }
                super.onDraw(canvas);
                return;
            case 9:
                super.onDraw(canvas);
                RectF rectF3 = AndroidUtilities.rectTmp;
                rectF3.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                ((org.telegram.ui.Components.voip.h) this.f8044b).a(getMeasuredHeight() / 2.0f, canvas, rectF3, null);
                invalidate();
                return;
            case 11:
                Paint paint4 = (Paint) this.f8044b;
                paint4.setColor(((uh.f) this.f8045c).getThemedColor(h6.Oh));
                canvas.drawRoundRect(0.0f, (getHeight() / 2.0f) - AndroidUtilities.dp(14.0f), getWidth(), (getHeight() / 2.0f) + AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), paint4);
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f8043a) {
            case 6:
                super.onLayout(z10, i10, i11, i12, i13);
                w1 w1Var = new w1(10);
                this.f8044b = w1Var;
                w1Var.O = 100;
                w1Var.J = false;
                w1Var.M = true;
                w1Var.G = false;
                w1Var.K = true;
                w1Var.H = true;
                w1Var.f46482r = 1;
                w1Var.f46486w = 0.98f;
                w1Var.v = 0.98f;
                w1Var.f46485u = 0.98f;
                w1Var.f46472g = false;
                w1Var.f46479o = 0.0f;
                w1Var.f46487x = 750L;
                w1Var.f46488y = 750;
                w1Var.c();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                ((w1) this.f8044b).f46468a.set(rectF);
                ((w1) this.f8044b).f46469b.set(rectF);
                ((w1) this.f8044b).f();
                Path path = (Path) this.f8045c;
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
        switch (this.f8043a) {
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
        switch (this.f8043a) {
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
        switch (this.f8043a) {
            case 7:
                super.setTextColor(h6.m1(0.2f, i10));
                ((ba0) this.f8045c).g(h6.m1(0.03f, i10), h6.m1(0.175f, i10), h6.m1(0.2f, i10), h6.m1(0.45f, i10));
                return;
            default:
                super.setTextColor(i10);
                return;
        }
    }

    public n(v0 v0Var, Context context) {
        super(context);
        this.f8043a = 8;
        this.f8045c = v0Var;
        this.f8044b = new Paint[v0Var.f31822f.length];
        int i10 = 0;
        while (true) {
            Paint[] paintArr = (Paint[]) this.f8044b;
            if (i10 >= paintArr.length) {
                return;
            }
            paintArr[i10] = new Paint(1);
            i10++;
        }
    }

    public n(Context context, int i10) {
        super(context);
        this.f8043a = i10;
        switch (i10) {
            case 7:
                super(context);
                r90 r90Var = new r90(0);
                this.f8044b = r90Var;
                ba0 ba0Var = new ba0();
                this.f8045c = ba0Var;
                ba0Var.f24910y = r90Var;
                ba0Var.f24907u = 0.65f;
                ba0Var.k(4.0f);
                setBackground(ba0Var);
                return;
            default:
                this.f8045c = new Path();
                return;
        }
    }

    public n(uh.f fVar, Context context) {
        super(context);
        this.f8043a = 11;
        this.f8045c = fVar;
        this.f8044b = new Paint(1);
    }

    public n(hi.o oVar, Context context) {
        super(context);
        this.f8043a = 2;
        this.f8045c = oVar;
        this.f8044b = new Paint(1);
    }

    public n(l70 l70Var, Context context) {
        super(context);
        this.f8043a = 9;
        this.f8045c = l70Var;
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.f8044b = hVar;
        hVar.f31471k = false;
        hVar.f31473m = 2.0f;
    }

    public n(org.telegram.ui.h hVar, Context context) {
        super(context);
        this.f8043a = 4;
        this.f8045c = hVar;
        org.telegram.ui.Components.voip.h hVar2 = new org.telegram.ui.Components.voip.h();
        this.f8044b = hVar2;
        hVar2.f31471k = false;
        hVar2.f31473m = 2.0f;
    }

    public n(r rVar, Context context) {
        super(context);
        this.f8043a = 0;
        this.f8045c = rVar;
        this.f8044b = new Paint(1);
    }

    public n(Context context, d6 d6Var) {
        super(context);
        this.f8043a = 1;
        this.f8045c = d6Var;
        this.f8044b = new Paint(1);
    }

    public n(j0 j0Var, Context context) {
        super(context);
        this.f8043a = 10;
        this.f8045c = j0Var;
        this.f8044b = new Paint(1);
    }

    public n(ti tiVar, Context context) {
        super(context);
        this.f8043a = 5;
        this.f8045c = tiVar;
        this.f8044b = new Paint(1);
    }
}
