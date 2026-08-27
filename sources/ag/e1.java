package ag;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.text.Layout;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.gi;
import org.telegram.ui.Components.j80;
import org.telegram.ui.Components.t80;
import org.telegram.ui.l70;
import rh.t5;

public final class e1 extends TextView {

    public final int f352a;

    public Object f353b;

    public final Object f354c;

    public e1(org.telegram.ui.Components.voip.u0 u0Var, Context context) {
        super(context);
        this.f352a = 9;
        this.f354c = u0Var;
        this.f353b = new Paint[u0Var.f33917f.length];
        int i10 = 0;
        while (true) {
            Paint[] paintArr = (Paint[]) this.f353b;
            if (i10 >= paintArr.length) {
                return;
            }
            paintArr[i10] = new Paint(1);
            i10++;
        }
    }

    public void a() {
        t80 t80Var = (t80) this.f354c;
        j80 j80Var = (j80) this.f353b;
        if (j80Var == null || t80Var == null) {
            return;
        }
        j80Var.rewind();
        if (getLayout() != null && getLayout().getText() != null) {
            j80Var.e(getLayout(), 0, getPaddingLeft(), getPaddingTop());
            getLayout().getSelectionPath(0, getLayout().getText().length(), j80Var);
        }
        t80Var.k();
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f352a) {
            case 0:
                Paint paint = (Paint) this.f353b;
                paint.setColor(g6.l1(0.8f, g6.v0(g6.f23441z6, ((org.telegram.ui.ActionBar.e3) ((g1) this.f354c).f389e).resourcesProvider)));
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(1.0f);
                float height = getHeight() / 2.0f;
                Layout layout = getLayout();
                int iMax = 0;
                for (int i10 = 0; i10 < layout.getLineCount(); i10++) {
                    iMax = Math.max(iMax, (int) layout.getLineWidth(i10));
                }
                float f10 = iMax / 2.0f;
                canvas.drawLine(0.0f, height, ((getWidth() / 2.0f) - f10) - AndroidUtilities.dp(8.0f), height, paint);
                canvas.drawLine((getWidth() / 2.0f) + f10 + AndroidUtilities.dp(8.0f), height, getWidth(), height, paint);
                super.dispatchDraw(canvas);
                break;
            case 1:
            default:
                super.dispatchDraw(canvas);
                break;
            case 2:
                Paint paint2 = (Paint) this.f353b;
                int iDp = AndroidUtilities.dp(1.0f) + (getHeight() / 2);
                int iMax2 = Math.max(1, AndroidUtilities.dp(0.66f));
                Layout layout2 = getLayout();
                if (layout2 != null) {
                    paint2.setColor(g6.l1(0.45f, g6.v0(g6.f23423y6, ((kh.r) this.f354c).S.f15231c)));
                    float f11 = iDp;
                    float f12 = iMax2 / 2.0f;
                    float f13 = f11 - f12;
                    float f14 = f11 + f12;
                    canvas.drawRect(0.0f, f13, (getWidth() - (layout2.getLineWidth(0) + AndroidUtilities.dp(16.0f))) / 2.0f, f14, paint2);
                    canvas.drawRect(((layout2.getLineWidth(0) + getWidth()) + AndroidUtilities.dp(16.0f)) / 2.0f, f13, getWidth(), f14, paint2);
                }
                super.dispatchDraw(canvas);
                break;
            case 3:
                Paint paint3 = (Paint) this.f353b;
                int iDp2 = AndroidUtilities.dp(1.0f) + (getHeight() / 2);
                int iMax3 = Math.max(1, AndroidUtilities.dp(0.66f));
                Layout layout3 = getLayout();
                if (layout3 != null) {
                    paint3.setColor(g6.l1(0.45f, g6.v0(g6.f23423y6, (c6) this.f354c)));
                    float f15 = iDp2;
                    float f16 = iMax3 / 2.0f;
                    float f17 = f15 - f16;
                    float f18 = f15 + f16;
                    canvas.drawRect(0.0f, f17, (getWidth() - (layout3.getLineWidth(0) + AndroidUtilities.dp(16.0f))) / 2.0f, f18, paint3);
                    canvas.drawRect(((layout3.getLineWidth(0) + getWidth()) + AndroidUtilities.dp(16.0f)) / 2.0f, f17, getWidth(), f18, paint3);
                }
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f352a) {
            case 5:
                ((org.telegram.ui.h) this.f354c).f38631b.draw(canvas);
                super.draw(canvas);
                break;
            case 10:
                ((l70) this.f354c).h.draw(canvas);
                super.draw(canvas);
                break;
            default:
                super.draw(canvas);
                break;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f352a) {
            case 8:
                super.onDetachedFromWindow();
                ((t80) this.f354c).f32692b = -1L;
                break;
            default:
                super.onDetachedFromWindow();
                break;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f352a) {
            case 1:
                Paint paint = (Paint) this.f353b;
                paint.setColor(((ch.h) this.f354c).getThemedColor(g6.Oh));
                canvas.drawRoundRect(0.0f, (getHeight() / 2.0f) - AndroidUtilities.dp(14.0f), getWidth(), (getHeight() / 2.0f) + AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), paint);
                super.onDraw(canvas);
                break;
            case 2:
            case 3:
            case 8:
            default:
                super.onDraw(canvas);
                break;
            case 4:
                Paint paint2 = (Paint) this.f353b;
                paint2.setColor(((oh.o) this.f354c).getThemedColor(g6.Oh));
                canvas.drawRoundRect(0.0f, (getHeight() / 2.0f) - AndroidUtilities.dp(14.0f), getWidth(), (getHeight() / 2.0f) + AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), paint2);
                super.onDraw(canvas);
                break;
            case 5:
                super.onDraw(canvas);
                if (((org.telegram.ui.h) this.f354c).f38638w) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    ((org.telegram.ui.Components.voip.h) this.f353b).a(getMeasuredHeight() / 2.0f, canvas, rectF, null);
                    invalidate();
                }
                break;
            case 6:
                Paint paint3 = (Paint) this.f353b;
                paint3.setColor(((gi) this.f354c).getThemedColor(g6.Oh));
                canvas.drawRoundRect(0.0f, (getHeight() / 2.0f) - AndroidUtilities.dp(14.0f), getWidth(), (getHeight() / 2.0f) + AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), paint3);
                super.onDraw(canvas);
                break;
            case 7:
                if (((j3) this.f353b) != null) {
                    canvas.save();
                    canvas.clipPath((Path) this.f354c);
                    ((j3) this.f353b).d(canvas);
                    canvas.restore();
                    invalidate();
                }
                super.onDraw(canvas);
                break;
            case 9:
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                Paint[] paintArr = (Paint[]) this.f353b;
                org.telegram.ui.Components.voip.u0 u0Var = (org.telegram.ui.Components.voip.u0) this.f354c;
                paintArr[u0Var.f33922x].setAlpha(255);
                canvas.drawRoundRect(rectF2, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paintArr[u0Var.f33922x]);
                float f10 = u0Var.f33921w;
                if (f10 > 0.0f) {
                    int i10 = u0Var.f33922x;
                    if (i10 + 1 < paintArr.length) {
                        paintArr[i10 + 1].setAlpha((int) (f10 * 255.0f));
                        canvas.drawRoundRect(rectF2, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paintArr[u0Var.f33922x + 1]);
                    }
                }
                super.onDraw(canvas);
                break;
            case 10:
                super.onDraw(canvas);
                RectF rectF3 = AndroidUtilities.rectTmp;
                rectF3.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                ((org.telegram.ui.Components.voip.h) this.f353b).a(getMeasuredHeight() / 2.0f, canvas, rectF3, null);
                invalidate();
                break;
            case 11:
                Paint paint4 = (Paint) this.f353b;
                rh.a aVar = ((t5) this.f354c).f47487x;
                if (aVar != null && aVar.f47029c > 0 && aVar.d == 0 && !aVar.f47030e) {
                    paint4.setColor(getCurrentTextColor());
                    canvas.drawCircle(getWidth() / 2.0f, getBaseline() - (getTextSize() * 0.35f), AndroidUtilities.dpf2(4.3f) / 2.0f, paint4);
                } else {
                    super.onDraw(canvas);
                }
                break;
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f352a) {
            case 7:
                super.onLayout(z10, i10, i11, i12, i13);
                j3 j3Var = new j3(10);
                this.f353b = j3Var;
                j3Var.N = 100;
                j3Var.J = false;
                j3Var.M = true;
                j3Var.G = false;
                j3Var.K = true;
                j3Var.H = true;
                j3Var.f514r = 1;
                j3Var.f518w = 0.98f;
                j3Var.v = 0.98f;
                j3Var.f517u = 0.98f;
                j3Var.f504g = false;
                j3Var.f511o = 0.0f;
                j3Var.f519x = 750L;
                j3Var.f520y = 750;
                j3Var.c();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                ((j3) this.f353b).f499a.set(rectF);
                ((j3) this.f353b).f500b.set(rectF);
                ((j3) this.f353b).f();
                Path path = (Path) this.f354c;
                path.reset();
                path.addRoundRect(rectF, getHeight() / 2.0f, getHeight() / 2.0f, Path.Direction.CW);
                break;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                break;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f352a) {
            case 8:
                super.onMeasure(i10, i11);
                a();
                break;
            case 9:
            default:
                super.onMeasure(i10, i11);
                break;
            case 10:
                if (View.MeasureSpec.getSize(i10) <= AndroidUtilities.dp(260.0f)) {
                    super.onMeasure(i10, i11);
                } else {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(320.0f), 1073741824), i11);
                }
                break;
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        LinearGradient linearGradient;
        switch (this.f352a) {
            case 5:
                super.onSizeChanged(i10, i11, i12, i13);
                org.telegram.ui.h hVar = (org.telegram.ui.h) this.f354c;
                hVar.f38631b.setBounds(0, 0, i10, i11);
                hVar.f38631b.setCornerRadius(Math.min(i10, i11) / 2.0f);
                ((org.telegram.ui.Components.voip.h) this.f353b).f33591f = i10;
                break;
            case 9:
                org.telegram.ui.Components.voip.u0 u0Var = (org.telegram.ui.Components.voip.u0) this.f354c;
                Paint[] paintArr = (Paint[]) this.f353b;
                super.onSizeChanged(i10, i11, i12, i13);
                for (int i17 = 0; i17 < paintArr.length; i17++) {
                    if (i17 == 0 && u0Var.f33923y) {
                        i14 = -8919716;
                        i15 = -11089922;
                    } else {
                        i14 = -9015575;
                        if (i17 == 0 || (i17 == 1 && u0Var.f33923y)) {
                            i14 = -11033346;
                            i15 = -9015575;
                        } else {
                            i15 = -1026983;
                            i16 = -1792170;
                        }
                        if (i16 != 0) {
                            linearGradient = new LinearGradient(0.0f, 0.0f, getMeasuredWidth(), 0.0f, new int[]{i14, i15, i16}, (float[]) null, Shader.TileMode.CLAMP);
                        } else {
                            linearGradient = new LinearGradient(0.0f, 0.0f, getMeasuredWidth(), 0.0f, new int[]{i14, i15}, (float[]) null, Shader.TileMode.CLAMP);
                        }
                        paintArr[i17].setShader(linearGradient);
                    }
                    i16 = 0;
                    if (i16 != 0) {
                        linearGradient = new LinearGradient(0.0f, 0.0f, getMeasuredWidth(), 0.0f, new int[]{i14, i15, i16}, (float[]) null, Shader.TileMode.CLAMP);
                    } else {
                        linearGradient = new LinearGradient(0.0f, 0.0f, getMeasuredWidth(), 0.0f, new int[]{i14, i15}, (float[]) null, Shader.TileMode.CLAMP);
                    }
                    paintArr[i17].setShader(linearGradient);
                }
                break;
            case 10:
                super.onSizeChanged(i10, i11, i12, i13);
                l70 l70Var = (l70) this.f354c;
                l70Var.h.setBounds(0, 0, i10, i11);
                l70Var.h.setCornerRadius(Math.min(i10, i11) / 2.0f);
                ((org.telegram.ui.Components.voip.h) this.f353b).f33591f = i10;
                break;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                break;
        }
    }

    @Override
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        switch (this.f352a) {
            case 8:
                super.setText(charSequence, bufferType);
                a();
                break;
            default:
                super.setText(charSequence, bufferType);
                break;
        }
    }

    @Override
    public void setTextColor(int i10) {
        switch (this.f352a) {
            case 8:
                super.setTextColor(g6.l1(0.2f, i10));
                ((t80) this.f354c).f(g6.l1(0.03f, i10), g6.l1(0.175f, i10), g6.l1(0.2f, i10), g6.l1(0.45f, i10));
                break;
            default:
                super.setTextColor(i10);
                break;
        }
    }

    public e1(t5 t5Var, Context context) {
        super(context);
        this.f352a = 11;
        this.f354c = t5Var;
        this.f353b = new Paint(1);
    }

    public e1(Context context, int i10) {
        super(context);
        this.f352a = i10;
        switch (i10) {
            case 8:
                super(context);
                j80 j80Var = new j80(0);
                this.f353b = j80Var;
                t80 t80Var = new t80();
                this.f354c = t80Var;
                t80Var.f32711x = j80Var;
                t80Var.f32709u = 0.65f;
                t80Var.j(4.0f);
                setBackground(t80Var);
                break;
            default:
                this.f354c = new Path();
                break;
        }
    }

    public e1(ch.h hVar, Context context) {
        super(context);
        this.f352a = 1;
        this.f354c = hVar;
        this.f353b = new Paint(1);
    }

    public e1(oh.o oVar, Context context) {
        super(context);
        this.f352a = 4;
        this.f354c = oVar;
        this.f353b = new Paint(1);
    }

    public e1(l70 l70Var, Context context) {
        super(context);
        this.f352a = 10;
        this.f354c = l70Var;
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.f353b = hVar;
        hVar.f33595k = false;
        hVar.f33597m = 2.0f;
    }

    public e1(org.telegram.ui.h hVar, Context context) {
        super(context);
        this.f352a = 5;
        this.f354c = hVar;
        org.telegram.ui.Components.voip.h hVar2 = new org.telegram.ui.Components.voip.h();
        this.f353b = hVar2;
        hVar2.f33595k = false;
        hVar2.f33597m = 2.0f;
    }

    public e1(kh.r rVar, Context context) {
        super(context);
        this.f352a = 2;
        this.f354c = rVar;
        this.f353b = new Paint(1);
    }

    public e1(Context context, c6 c6Var) {
        super(context);
        this.f352a = 3;
        this.f354c = c6Var;
        this.f353b = new Paint(1);
    }

    public e1(g1 g1Var, Context context) {
        super(context);
        this.f352a = 0;
        this.f354c = g1Var;
        this.f353b = new Paint(1);
    }

    public e1(gi giVar, Context context) {
        super(context);
        this.f352a = 6;
        this.f354c = giVar;
        this.f353b = new Paint(1);
    }
}
