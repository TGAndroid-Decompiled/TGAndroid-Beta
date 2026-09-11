package ci;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.Layout;
import android.view.View;
import android.widget.TextView;
import ji.g6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.h90;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.voip.v0;
import org.telegram.ui.Components.x80;
import org.telegram.ui.d80;
import sg.j0;
import sg.k0;
import sg.y1;
public final class n extends TextView {
    public final int f4815a;
    public Object f4816b;
    public final Object f4817c;

    public n(g6 g6Var, Context context) {
        super(context);
        this.f4815a = 3;
        this.f4817c = g6Var;
        this.f4816b = new Paint(1);
    }

    public void a() {
        h90 h90Var = (h90) this.f4817c;
        x80 x80Var = (x80) this.f4816b;
        if (x80Var != null && h90Var != null) {
            x80Var.rewind();
            if (getLayout() != null && getLayout().getText() != null) {
                x80Var.e(getLayout(), 0, getPaddingLeft(), getPaddingTop());
                getLayout().getSelectionPath(0, getLayout().getText().length(), x80Var);
            }
            h90Var.k();
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f4815a) {
            case 0:
                Paint paint = (Paint) this.f4816b;
                int dp = AndroidUtilities.dp(1.0f) + (getHeight() / 2);
                int max = Math.max(1, AndroidUtilities.dp(0.66f));
                Layout layout = getLayout();
                if (layout != null) {
                    paint.setColor(j6.l1(0.45f, j6.v0(j6.f21042y6, ((t) this.f4817c).W.f4850c)));
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
                Paint paint2 = (Paint) this.f4816b;
                int dp2 = AndroidUtilities.dp(1.0f) + (getHeight() / 2);
                int max2 = Math.max(1, AndroidUtilities.dp(0.66f));
                Layout layout2 = getLayout();
                if (layout2 != null) {
                    paint2.setColor(j6.l1(0.45f, j6.v0(j6.f21042y6, (f6) this.f4817c)));
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
                Paint paint3 = (Paint) this.f4816b;
                paint3.setColor(j6.l1(0.8f, j6.v0(j6.f21061z6, k0.U0(((j0) this.f4817c).f46123e))));
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
        switch (this.f4815a) {
            case 4:
                ((org.telegram.ui.h) this.f4817c).f36824b.draw(canvas);
                super.draw(canvas);
                return;
            case 9:
                ((d80) this.f4817c).h.draw(canvas);
                super.draw(canvas);
                return;
            default:
                super.draw(canvas);
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f4815a) {
            case 7:
                super.onDetachedFromWindow();
                ((h90) this.f4817c).f26672b = -1L;
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f4815a) {
            case 2:
                Paint paint = (Paint) this.f4816b;
                paint.setColor(((gi.p) this.f4817c).getThemedColor(j6.Oh));
                canvas.drawRoundRect(0.0f, (getHeight() / 2.0f) - AndroidUtilities.dp(14.0f), getWidth(), (getHeight() / 2.0f) + AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), paint);
                super.onDraw(canvas);
                return;
            case 3:
                Paint paint2 = (Paint) this.f4816b;
                ji.a aVar = ((g6) this.f4817c).f13938x;
                if (aVar != null && aVar.f13733c > 0 && aVar.d == 0 && !aVar.f13734e) {
                    paint2.setColor(getCurrentTextColor());
                    float baseline = getBaseline() - (getTextSize() * 0.35f);
                    canvas.drawCircle(getWidth() / 2.0f, baseline, AndroidUtilities.dpf2(4.3f) / 2.0f, paint2);
                    return;
                }
                super.onDraw(canvas);
                return;
            case 4:
                super.onDraw(canvas);
                if (((org.telegram.ui.h) this.f4817c).f36831w) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    ((org.telegram.ui.Components.voip.h) this.f4816b).a(getMeasuredHeight() / 2.0f, canvas, rectF, null);
                    invalidate();
                    return;
                }
                return;
            case 5:
                Paint paint3 = (Paint) this.f4816b;
                paint3.setColor(((vi) this.f4817c).getThemedColor(j6.Oh));
                canvas.drawRoundRect(0.0f, (getHeight() / 2.0f) - AndroidUtilities.dp(14.0f), getWidth(), (getHeight() / 2.0f) + AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), paint3);
                super.onDraw(canvas);
                return;
            case 6:
                if (((y1) this.f4816b) != null) {
                    canvas.save();
                    canvas.clipPath((Path) this.f4817c);
                    ((y1) this.f4816b).d(canvas);
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
                Paint[] paintArr = (Paint[]) this.f4816b;
                v0 v0Var = (v0) this.f4817c;
                paintArr[v0Var.f31890x].setAlpha(255);
                canvas.drawRoundRect(rectF2, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paintArr[v0Var.f31890x]);
                float f7 = v0Var.f31889w;
                if (f7 > 0.0f) {
                    int i10 = v0Var.f31890x;
                    if (i10 + 1 < paintArr.length) {
                        paintArr[i10 + 1].setAlpha((int) (f7 * 255.0f));
                        canvas.drawRoundRect(rectF2, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paintArr[v0Var.f31890x + 1]);
                    }
                }
                super.onDraw(canvas);
                return;
            case 9:
                super.onDraw(canvas);
                RectF rectF3 = AndroidUtilities.rectTmp;
                rectF3.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                ((org.telegram.ui.Components.voip.h) this.f4816b).a(getMeasuredHeight() / 2.0f, canvas, rectF3, null);
                invalidate();
                return;
            case 11:
                Paint paint4 = (Paint) this.f4816b;
                paint4.setColor(((uh.f) this.f4817c).getThemedColor(j6.Oh));
                canvas.drawRoundRect(0.0f, (getHeight() / 2.0f) - AndroidUtilities.dp(14.0f), getWidth(), (getHeight() / 2.0f) + AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), paint4);
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f4815a) {
            case 6:
                super.onLayout(z10, i10, i11, i12, i13);
                y1 y1Var = new y1(10);
                this.f4816b = y1Var;
                y1Var.N = 100;
                y1Var.J = false;
                y1Var.M = true;
                y1Var.G = false;
                y1Var.K = true;
                y1Var.H = true;
                y1Var.f46359r = 1;
                y1Var.f46363w = 0.98f;
                y1Var.v = 0.98f;
                y1Var.f46362u = 0.98f;
                y1Var.f46349g = false;
                y1Var.f46356o = 0.0f;
                y1Var.f46364x = 750L;
                y1Var.f46365y = 750;
                y1Var.c();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                ((y1) this.f4816b).f46344a.set(rectF);
                ((y1) this.f4816b).f46345b.set(rectF);
                ((y1) this.f4816b).f();
                Path path = (Path) this.f4817c;
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
        switch (this.f4815a) {
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
        switch (this.f4815a) {
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
        switch (this.f4815a) {
            case 7:
                super.setTextColor(j6.l1(0.2f, i10));
                ((h90) this.f4817c).f(j6.l1(0.03f, i10), j6.l1(0.175f, i10), j6.l1(0.2f, i10), j6.l1(0.45f, i10));
                return;
            default:
                super.setTextColor(i10);
                return;
        }
    }

    public n(v0 v0Var, Context context) {
        super(context);
        this.f4815a = 8;
        this.f4817c = v0Var;
        this.f4816b = new Paint[v0Var.f31885f.length];
        int i10 = 0;
        while (true) {
            Paint[] paintArr = (Paint[]) this.f4816b;
            if (i10 >= paintArr.length) {
                return;
            }
            paintArr[i10] = new Paint(1);
            i10++;
        }
    }

    public n(Context context, int i10) {
        super(context);
        this.f4815a = i10;
        switch (i10) {
            case 7:
                super(context);
                x80 x80Var = new x80(0);
                this.f4816b = x80Var;
                h90 h90Var = new h90();
                this.f4817c = h90Var;
                h90Var.f26691x = x80Var;
                h90Var.f26689u = 0.65f;
                h90Var.j(4.0f);
                setBackground(h90Var);
                return;
            default:
                this.f4817c = new Path();
                return;
        }
    }

    public n(uh.f fVar, Context context) {
        super(context);
        this.f4815a = 11;
        this.f4817c = fVar;
        this.f4816b = new Paint(1);
    }

    public n(gi.p pVar, Context context) {
        super(context);
        this.f4815a = 2;
        this.f4817c = pVar;
        this.f4816b = new Paint(1);
    }

    public n(d80 d80Var, Context context) {
        super(context);
        this.f4815a = 9;
        this.f4817c = d80Var;
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.f4816b = hVar;
        hVar.f31507k = false;
        hVar.f31509m = 2.0f;
    }

    public n(org.telegram.ui.h hVar, Context context) {
        super(context);
        this.f4815a = 4;
        this.f4817c = hVar;
        org.telegram.ui.Components.voip.h hVar2 = new org.telegram.ui.Components.voip.h();
        this.f4816b = hVar2;
        hVar2.f31507k = false;
        hVar2.f31509m = 2.0f;
    }

    public n(t tVar, Context context) {
        super(context);
        this.f4815a = 0;
        this.f4817c = tVar;
        this.f4816b = new Paint(1);
    }

    public n(Context context, f6 f6Var) {
        super(context);
        this.f4815a = 1;
        this.f4817c = f6Var;
        this.f4816b = new Paint(1);
    }

    public n(j0 j0Var, Context context) {
        super(context);
        this.f4815a = 10;
        this.f4817c = j0Var;
        this.f4816b = new Paint(1);
    }

    public n(vi viVar, Context context) {
        super(context);
        this.f4815a = 5;
        this.f4817c = viVar;
        this.f4816b = new Paint(1);
    }
}
