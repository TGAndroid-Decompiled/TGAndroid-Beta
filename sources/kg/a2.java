package kg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.a30;
import org.telegram.messenger.dd;
import org.telegram.messenger.m9;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.ep;
import org.telegram.ui.Components.fp;
import org.telegram.ui.eu0;
import w7.b6;
public class a2 extends ViewGroup {
    public final Paint D;
    public a2 E;
    public int F;
    public int G;
    public final Matrix H;
    public long I;
    public int J;
    public float K;
    public boolean L;
    public boolean M;
    public final ep f10996a;
    public final TextView f10997b;
    public final TextView f10998c;
    public final TextView d;
    public final TextView e;
    public final int f10999f;
    public final int h;
    public eu0 f11000n;
    public final TextView f11001r;
    public final int f11002s;
    public final int f11003w;
    public int f11004x;
    public LinearGradient f11005y;

    public a2(Context context) {
        super(context);
        int i10;
        int i11;
        int i12;
        this.f10999f = 12;
        this.h = 8;
        this.f11002s = t6.f20930d6;
        this.f11003w = t6.f20873a7;
        this.D = new Paint();
        this.H = new Matrix();
        ep epVar = new ep(24, context, null);
        this.f10996a = epVar;
        epVar.setDrawBackgroundAsArc(10);
        int i13 = t6.f20987g7;
        epVar.b(i13, i13, t6.f21060k7);
        addView(epVar);
        TextView textView = new TextView(context);
        this.f10997b = textView;
        textView.setTextSize(1, 16.0f);
        a7.V(textView, t6.G6, null);
        textView.setTypeface(org.telegram.messenger.i0.o());
        textView.setSingleLine();
        if (dd.X) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        addView(textView, b6.d(-2, -2.0f, i10 | 48, 0.0f, 8.0f, 0.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.f11001r = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(-1);
        textView2.setPadding(org.telegram.messenger.i0.L(3.0f), 0, org.telegram.messenger.i0.L(3.0f), 0);
        textView2.setTypeface(org.telegram.messenger.i0.o());
        if (dd.X) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        addView(textView2, b6.d(-2, -2.0f, i11 | 80, 0.0f, 0.0f, 0.0f, 8.0f));
        TextView textView3 = new TextView(context);
        this.d = textView3;
        textView3.setTextSize(1, 14.0f);
        int i14 = t6.f21312y6;
        a7.V(textView3, i14, null);
        textView3.getPaint().setStrikeThruText(true);
        textView3.setSingleLine();
        if (dd.X) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        addView(textView3, b6.d(-2, -2.0f, i12 | 80, 0.0f, 0.0f, 0.0f, 8.0f));
        TextView textView4 = new TextView(context);
        this.e = textView4;
        textView4.setTextSize(1, 14.0f);
        a7.V(textView4, i14, null);
        textView4.setSingleLine();
        addView(textView4, b6.d(-2, -2.0f, (dd.X ? 5 : 3) | 80, 0.0f, 0.0f, 0.0f, 8.0f));
        TextView textView5 = new TextView(context);
        this.f10998c = textView5;
        textView5.setTextSize(1, 15.0f);
        a7.V(textView5, i14, null);
        textView5.setSingleLine();
        addView(textView5, b6.e(-2, -2, 8388613));
        setPadding(org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(8.0f));
        setClipToPadding(false);
        setWillNotDraw(false);
    }

    public final void a(org.telegram.ui.eu0 r17, boolean r18) {
        throw new UnsupportedOperationException("Method not decompiled: kg.a2.a(org.telegram.ui.eu0, boolean):void");
    }

    public final void b(View view) {
        Rect rect = org.telegram.messenger.i0.Q;
        rect.right = view.getMeasuredWidth() + rect.left;
        rect.bottom = view.getMeasuredHeight() + rect.top;
        if (dd.X) {
            int i10 = rect.right;
            rect.right = getWidth() - rect.left;
            rect.left = getWidth() - i10;
        }
        view.layout(rect.left, rect.top, rect.right, rect.bottom);
    }

    public final void c(boolean z10, boolean z11) {
        this.f10996a.a(z10, z11);
    }

    public final void d() {
        a2 a2Var = this.E;
        if (a2Var != null) {
            a2Var.d();
            return;
        }
        int x02 = t6.x0(null, this.f11002s, false);
        int x03 = t6.x0(null, this.f11003w, false);
        if (this.G == x03 && this.F == x02) {
            return;
        }
        this.F = x02;
        this.G = x03;
        int L = org.telegram.messenger.i0.L(200.0f);
        this.f11004x = L;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, L, 0.0f, new int[]{x03, x02, x02, x03}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, Shader.TileMode.CLAMP);
        this.f11005y = linearGradient;
        this.D.setShader(linearGradient);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        Paint paint;
        if (this.L) {
            a2 a2Var = this.E;
            if (a2Var != null) {
                paint = a2Var.D;
            } else {
                paint = this.D;
            }
            drawChild(canvas, this.f10996a, getDrawingTime());
            d();
            e();
            RectF rectF = org.telegram.messenger.i0.P;
            TextView textView = this.f10998c;
            rectF.set(textView.getLeft(), org.telegram.messenger.i0.L(4.0f) + textView.getTop(), textView.getRight(), textView.getBottom() - org.telegram.messenger.i0.L(4.0f));
            canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), paint);
            TextView textView2 = this.d;
            rectF.set(textView2.getLeft(), org.telegram.messenger.i0.L(3.0f) + textView2.getTop(), textView2.getRight(), textView2.getBottom() - org.telegram.messenger.i0.L(3.0f));
            canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), paint);
            TextView textView3 = this.f10997b;
            rectF.set(textView3.getLeft(), org.telegram.messenger.i0.L(4.0f) + textView3.getTop(), textView3.getRight(), textView3.getBottom() - org.telegram.messenger.i0.L(4.0f));
            canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), paint);
            invalidate();
            return;
        }
        super.dispatchDraw(canvas);
    }

    public final void e() {
        a2 a2Var = this.E;
        if (a2Var != null) {
            a2Var.e();
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long abs = Math.abs(this.I - elapsedRealtime);
        if (abs > 17) {
            abs = 16;
        }
        if (abs < 4) {
            abs = 0;
        }
        int measuredWidth = getMeasuredWidth();
        this.I = elapsedRealtime;
        int i10 = (int) ((((float) (abs * measuredWidth)) / 400.0f) + this.J);
        this.J = i10;
        if (i10 >= measuredWidth * 4) {
            this.J = (-this.f11004x) * 2;
        }
        Matrix matrix = this.H;
        matrix.setTranslate(this.J + this.K, 0.0f);
        LinearGradient linearGradient = this.f11005y;
        if (linearGradient != null) {
            linearGradient.setLocalMatrix(matrix);
        }
    }

    public eu0 getTier() {
        return this.f11000n;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.M) {
            boolean z10 = dd.X;
            TextView textView = this.f10997b;
            if (z10) {
                canvas.drawLine(0.0f, getHeight() - 1, textView.getRight(), getHeight() - 1, t6.f21053k0);
            } else {
                canvas.drawLine(textView.getLeft(), getHeight() - 1, getWidth(), getHeight() - 1, t6.f21053k0);
            }
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int paddingTop;
        int i15;
        Rect rect = org.telegram.messenger.i0.Q;
        int i16 = this.h;
        int paddingLeft = getPaddingLeft() + org.telegram.messenger.i0.L(i16);
        int measuredHeight = getMeasuredHeight();
        ep epVar = this.f10996a;
        rect.set(paddingLeft, (int) ((measuredHeight - epVar.getMeasuredHeight()) / 2.0f), 0, 0);
        b(epVar);
        int measuredHeight2 = getMeasuredHeight();
        TextView textView = this.f10998c;
        int measuredHeight3 = (int) ((measuredHeight2 - textView.getMeasuredHeight()) / 2.0f);
        int i17 = i16 + this.f10999f;
        int measuredWidth = epVar.getMeasuredWidth() + org.telegram.messenger.i0.L(i17 + 24);
        TextView textView2 = this.d;
        if (textView2.getVisibility() == 0) {
            i14 = textView2.getMeasuredWidth();
        } else {
            i14 = 0;
        }
        int i18 = measuredWidth + i14;
        TextView textView3 = this.e;
        int paddingLeft2 = getPaddingLeft() + textView3.getMeasuredWidth() + i18;
        int measuredWidth2 = getMeasuredWidth() - textView.getMeasuredWidth();
        TextView textView4 = this.f11001r;
        if (paddingLeft2 > measuredWidth2 && textView4.getVisibility() == 0) {
            measuredHeight3 = getPaddingTop() + org.telegram.messenger.i0.L(2.0f);
        }
        rect.set(((getMeasuredWidth() - textView.getMeasuredWidth()) - org.telegram.messenger.i0.L(16.0f)) - getPaddingRight(), measuredHeight3, 0, 0);
        b(textView);
        float f7 = i17;
        int paddingLeft3 = getPaddingLeft() + epVar.getMeasuredWidth() + org.telegram.messenger.i0.L(f7);
        int visibility = textView3.getVisibility();
        TextView textView5 = this.f10997b;
        if (visibility == 8) {
            paddingTop = (int) ((getMeasuredHeight() - textView5.getMeasuredHeight()) / 2.0f);
        } else {
            paddingTop = getPaddingTop();
        }
        rect.set(paddingLeft3, paddingTop, 0, 0);
        b(textView5);
        if (textView4.getVisibility() == 0) {
            rect.set(textView5.getMeasuredWidth() + getPaddingLeft() + epVar.getMeasuredWidth() + org.telegram.messenger.i0.L(i17 + 6), org.telegram.messenger.i0.L(2.0f) + getPaddingTop(), 0, 0);
            b(textView4);
        }
        rect.set(getPaddingLeft() + epVar.getMeasuredWidth() + org.telegram.messenger.i0.L(f7), (getMeasuredHeight() - textView2.getMeasuredHeight()) - getPaddingBottom(), 0, 0);
        b(textView2);
        int measuredWidth3 = epVar.getMeasuredWidth() + org.telegram.messenger.i0.L(f7);
        if (textView2.getVisibility() == 0) {
            i15 = org.telegram.messenger.i0.L(6.0f) + textView2.getMeasuredWidth();
        } else {
            i15 = 0;
        }
        rect.set(getPaddingLeft() + measuredWidth3 + i15, (getMeasuredHeight() - textView3.getMeasuredHeight()) - getPaddingBottom(), 0, 0);
        b(textView3);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int L = org.telegram.messenger.i0.L(58.0f);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(28.0f), 1073741824);
        ep epVar = this.f10996a;
        epVar.measure(makeMeasureSpec, makeMeasureSpec);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size - epVar.getMeasuredWidth(), Integer.MIN_VALUE);
        int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(L, Integer.MIN_VALUE);
        TextView textView = this.f10998c;
        textView.measure(makeMeasureSpec2, makeMeasureSpec3);
        this.f10997b.measure(View.MeasureSpec.makeMeasureSpec((size - epVar.getMeasuredWidth()) - textView.getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(L, Integer.MIN_VALUE));
        TextView textView2 = this.f11001r;
        int i12 = 0;
        if (textView2.getVisibility() == 0) {
            textView2.measure(View.MeasureSpec.makeMeasureSpec((size - epVar.getMeasuredWidth()) - textView.getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(L, Integer.MIN_VALUE));
        } else {
            textView2.measure(View.MeasureSpec.makeMeasureSpec(0, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 1073741824));
        }
        int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(size - epVar.getMeasuredWidth(), Integer.MIN_VALUE);
        int makeMeasureSpec5 = View.MeasureSpec.makeMeasureSpec(L, Integer.MIN_VALUE);
        TextView textView3 = this.d;
        textView3.measure(makeMeasureSpec4, makeMeasureSpec5);
        int measuredWidth = size - epVar.getMeasuredWidth();
        if (textView3.getVisibility() == 0) {
            i12 = textView3.getMeasuredWidth();
        }
        int c10 = a30.c(6.0f, measuredWidth - i12, Integer.MIN_VALUE);
        int makeMeasureSpec6 = View.MeasureSpec.makeMeasureSpec(L, Integer.MIN_VALUE);
        TextView textView4 = this.e;
        textView4.measure(c10, makeMeasureSpec6);
        if (textView4.getVisibility() != 0) {
            L -= org.telegram.messenger.i0.L(8.0f);
        }
        setMeasuredDimension(size, L);
    }

    public void setCirclePaintProvider(m9 m9Var) {
        this.f10996a.setCirclePaintProvider(m9Var);
    }

    @Override
    public void setEnabled(boolean z10) {
        float f7;
        float f10;
        super.setEnabled(z10);
        float f11 = 0.6f;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.6f;
        }
        this.f10997b.setAlpha(f7);
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.6f;
        }
        this.f10998c.setAlpha(f10);
        if (z10) {
            f11 = 1.0f;
        }
        this.f10996a.setAlpha(f11);
    }

    public void setGlobalGradientView(a2 a2Var) {
        this.E = a2Var;
    }

    public void setParentXOffset(float f7) {
        this.K = f7;
    }

    public void setProgressDelegate(fp fpVar) {
        this.f10996a.setProgressDelegate(fpVar);
    }
}
