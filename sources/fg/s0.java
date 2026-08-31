package fg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.Layout;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.k90;
import org.telegram.ui.Components.mi;
import org.telegram.ui.Components.z80;
import org.telegram.ui.v70;
import wh.v5;
public final class s0 extends TextView {
    public final int f6546a;
    public Object f6547b;
    public final Object f6548c;

    public s0(org.telegram.ui.Components.voip.v0 v0Var, Context context) {
        super(context);
        this.f6546a = 6;
        this.f6548c = v0Var;
        this.f6547b = new Paint[v0Var.f32412f.length];
        int i10 = 0;
        while (true) {
            Paint[] paintArr = (Paint[]) this.f6547b;
            if (i10 >= paintArr.length) {
                return;
            }
            paintArr[i10] = new Paint(1);
            i10++;
        }
    }

    public void a() {
        k90 k90Var = (k90) this.f6548c;
        z80 z80Var = (z80) this.f6547b;
        if (z80Var != null && k90Var != null) {
            z80Var.rewind();
            if (getLayout() != null && getLayout().getText() != null) {
                z80Var.e(getLayout(), 0, getPaddingLeft(), getPaddingTop());
                getLayout().getSelectionPath(0, getLayout().getText().length(), z80Var);
            }
            k90Var.k();
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f6546a) {
            case 0:
                Paint paint = (Paint) this.f6547b;
                paint.setColor(k6.l1(0.8f, k6.v0(k6.f22053z6, v0.U0(((u0) this.f6548c).f6574e))));
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(1.0f);
                float height = getHeight() / 2.0f;
                Layout layout = getLayout();
                int i10 = 0;
                for (int i11 = 0; i11 < layout.getLineCount(); i11++) {
                    i10 = Math.max(i10, (int) layout.getLineWidth(i11));
                }
                float f10 = i10 / 2.0f;
                canvas.drawLine(0.0f, height, ((getWidth() / 2.0f) - f10) - AndroidUtilities.dp(8.0f), height, paint);
                canvas.drawLine((getWidth() / 2.0f) + f10 + AndroidUtilities.dp(8.0f), height, getWidth(), height, paint);
                super.dispatchDraw(canvas);
                return;
            case 8:
                Paint paint2 = (Paint) this.f6547b;
                int dp = AndroidUtilities.dp(1.0f) + (getHeight() / 2);
                int max = Math.max(1, AndroidUtilities.dp(0.66f));
                Layout layout2 = getLayout();
                if (layout2 != null) {
                    paint2.setColor(k6.l1(0.45f, k6.v0(k6.f22036y6, ((ph.l) this.f6548c).T.f44408c)));
                    float f11 = dp;
                    float f12 = max / 2.0f;
                    float f13 = f11 - f12;
                    float f14 = f11 + f12;
                    canvas.drawRect(0.0f, f13, (getWidth() - (layout2.getLineWidth(0) + AndroidUtilities.dp(16.0f))) / 2.0f, f14, paint2);
                    canvas.drawRect(((layout2.getLineWidth(0) + getWidth()) + AndroidUtilities.dp(16.0f)) / 2.0f, f13, getWidth(), f14, paint2);
                }
                super.dispatchDraw(canvas);
                return;
            case 9:
                Paint paint3 = (Paint) this.f6547b;
                int dp2 = AndroidUtilities.dp(1.0f) + (getHeight() / 2);
                int max2 = Math.max(1, AndroidUtilities.dp(0.66f));
                Layout layout3 = getLayout();
                if (layout3 != null) {
                    paint3.setColor(k6.l1(0.45f, k6.v0(k6.f22036y6, (g6) this.f6548c)));
                    float f15 = dp2;
                    float f16 = max2 / 2.0f;
                    float f17 = f15 - f16;
                    float f18 = f15 + f16;
                    canvas.drawRect(0.0f, f17, (getWidth() - (layout3.getLineWidth(0) + AndroidUtilities.dp(16.0f))) / 2.0f, f18, paint3);
                    canvas.drawRect(((layout3.getLineWidth(0) + getWidth()) + AndroidUtilities.dp(16.0f)) / 2.0f, f17, getWidth(), f18, paint3);
                }
                super.dispatchDraw(canvas);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f6546a) {
            case 2:
                ((org.telegram.ui.i) this.f6548c).f37702b.draw(canvas);
                super.draw(canvas);
                return;
            case 7:
                ((v70) this.f6548c).h.draw(canvas);
                super.draw(canvas);
                return;
            default:
                super.draw(canvas);
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f6546a) {
            case 5:
                super.onDetachedFromWindow();
                ((k90) this.f6548c).f28329b = -1L;
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f6546a) {
            case 1:
                Paint paint = (Paint) this.f6547b;
                paint.setColor(((hh.f) this.f6548c).getThemedColor(k6.Oh));
                canvas.drawRoundRect(0.0f, (getHeight() / 2.0f) - AndroidUtilities.dp(14.0f), getWidth(), (getHeight() / 2.0f) + AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), paint);
                super.onDraw(canvas);
                return;
            case 2:
                super.onDraw(canvas);
                if (((org.telegram.ui.i) this.f6548c).f37709w) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    ((org.telegram.ui.Components.voip.h) this.f6547b).a(getMeasuredHeight() / 2.0f, canvas, rectF, null);
                    invalidate();
                    return;
                }
                return;
            case 3:
                Paint paint2 = (Paint) this.f6547b;
                paint2.setColor(((mi) this.f6548c).getThemedColor(k6.Oh));
                canvas.drawRoundRect(0.0f, (getHeight() / 2.0f) - AndroidUtilities.dp(14.0f), getWidth(), (getHeight() / 2.0f) + AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), paint2);
                super.onDraw(canvas);
                return;
            case 4:
                if (((o2) this.f6547b) != null) {
                    canvas.save();
                    canvas.clipPath((Path) this.f6548c);
                    ((o2) this.f6547b).d(canvas);
                    canvas.restore();
                    invalidate();
                }
                super.onDraw(canvas);
                return;
            case 5:
            case 8:
            case 9:
            default:
                super.onDraw(canvas);
                return;
            case 6:
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                Paint[] paintArr = (Paint[]) this.f6547b;
                org.telegram.ui.Components.voip.v0 v0Var = (org.telegram.ui.Components.voip.v0) this.f6548c;
                paintArr[v0Var.f32417x].setAlpha(255);
                canvas.drawRoundRect(rectF2, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paintArr[v0Var.f32417x]);
                float f10 = v0Var.f32416w;
                if (f10 > 0.0f) {
                    int i10 = v0Var.f32417x;
                    if (i10 + 1 < paintArr.length) {
                        paintArr[i10 + 1].setAlpha((int) (f10 * 255.0f));
                        canvas.drawRoundRect(rectF2, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paintArr[v0Var.f32417x + 1]);
                    }
                }
                super.onDraw(canvas);
                return;
            case 7:
                super.onDraw(canvas);
                RectF rectF3 = AndroidUtilities.rectTmp;
                rectF3.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                ((org.telegram.ui.Components.voip.h) this.f6547b).a(getMeasuredHeight() / 2.0f, canvas, rectF3, null);
                invalidate();
                return;
            case 10:
                Paint paint3 = (Paint) this.f6547b;
                paint3.setColor(((th.n) this.f6548c).getThemedColor(k6.Oh));
                canvas.drawRoundRect(0.0f, (getHeight() / 2.0f) - AndroidUtilities.dp(14.0f), getWidth(), (getHeight() / 2.0f) + AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), paint3);
                super.onDraw(canvas);
                return;
            case 11:
                Paint paint4 = (Paint) this.f6547b;
                wh.a aVar = ((v5) this.f6548c).f50118x;
                if (aVar != null && aVar.f49617c > 0 && aVar.d == 0 && !aVar.f49618e) {
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
    public void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        switch (this.f6546a) {
            case 4:
                super.onLayout(z4, i10, i11, i12, i13);
                o2 o2Var = new o2(10);
                this.f6547b = o2Var;
                o2Var.N = 100;
                o2Var.J = false;
                o2Var.M = true;
                o2Var.G = false;
                o2Var.K = true;
                o2Var.H = true;
                o2Var.f6466r = 1;
                o2Var.f6470w = 0.98f;
                o2Var.v = 0.98f;
                o2Var.f6469u = 0.98f;
                o2Var.f6456g = false;
                o2Var.f6463o = 0.0f;
                o2Var.f6471x = 750L;
                o2Var.f6472y = 750;
                o2Var.c();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                ((o2) this.f6547b).f6451a.set(rectF);
                ((o2) this.f6547b).f6452b.set(rectF);
                ((o2) this.f6547b).f();
                Path path = (Path) this.f6548c;
                path.reset();
                path.addRoundRect(rectF, getHeight() / 2.0f, getHeight() / 2.0f, Path.Direction.CW);
                return;
            default:
                super.onLayout(z4, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f6546a) {
            case 5:
                super.onMeasure(i10, i11);
                a();
                return;
            case 6:
            default:
                super.onMeasure(i10, i11);
                return;
            case 7:
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
        throw new UnsupportedOperationException("Method not decompiled: fg.s0.onSizeChanged(int, int, int, int):void");
    }

    @Override
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        switch (this.f6546a) {
            case 5:
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
        switch (this.f6546a) {
            case 5:
                super.setTextColor(k6.l1(0.2f, i10));
                ((k90) this.f6548c).f(k6.l1(0.03f, i10), k6.l1(0.175f, i10), k6.l1(0.2f, i10), k6.l1(0.45f, i10));
                return;
            default:
                super.setTextColor(i10);
                return;
        }
    }

    public s0(v5 v5Var, Context context) {
        super(context);
        this.f6546a = 11;
        this.f6548c = v5Var;
        this.f6547b = new Paint(1);
    }

    public s0(Context context, int i10) {
        super(context);
        this.f6546a = i10;
        switch (i10) {
            case 5:
                super(context);
                z80 z80Var = new z80(0);
                this.f6547b = z80Var;
                k90 k90Var = new k90();
                this.f6548c = k90Var;
                k90Var.f28348x = z80Var;
                k90Var.f28346u = 0.65f;
                k90Var.j(4.0f);
                setBackground(k90Var);
                return;
            default:
                this.f6548c = new Path();
                return;
        }
    }

    public s0(hh.f fVar, Context context) {
        super(context);
        this.f6546a = 1;
        this.f6548c = fVar;
        this.f6547b = new Paint(1);
    }

    public s0(th.n nVar, Context context) {
        super(context);
        this.f6546a = 10;
        this.f6548c = nVar;
        this.f6547b = new Paint(1);
    }

    public s0(v70 v70Var, Context context) {
        super(context);
        this.f6546a = 7;
        this.f6548c = v70Var;
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.f6547b = hVar;
        hVar.f32059k = false;
        hVar.f32061m = 2.0f;
    }

    public s0(org.telegram.ui.i iVar, Context context) {
        super(context);
        this.f6546a = 2;
        this.f6548c = iVar;
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.f6547b = hVar;
        hVar.f32059k = false;
        hVar.f32061m = 2.0f;
    }

    public s0(ph.l lVar, Context context) {
        super(context);
        this.f6546a = 8;
        this.f6548c = lVar;
        this.f6547b = new Paint(1);
    }

    public s0(Context context, g6 g6Var) {
        super(context);
        this.f6546a = 9;
        this.f6548c = g6Var;
        this.f6547b = new Paint(1);
    }

    public s0(u0 u0Var, Context context) {
        super(context);
        this.f6546a = 0;
        this.f6548c = u0Var;
        this.f6547b = new Paint(1);
    }

    public s0(mi miVar, Context context) {
        super(context);
        this.f6546a = 3;
        this.f6548c = miVar;
        this.f6547b = new Paint(1);
    }
}
