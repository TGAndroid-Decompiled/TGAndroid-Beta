package defpackage;

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
public class ri8 extends ViewGroup {
    public final Paint E;
    public ri8 F;
    public int G;
    public int H;
    public final Matrix I;
    public long J;
    public int K;
    public float L;
    public boolean M;
    public boolean N;
    public final wf2 a;
    public final TextView b;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    public final byte f;
    public final byte h;
    public gi8 n;
    public final TextView r;
    public final int s;
    public final int w;
    public int x;
    public LinearGradient y;

    public ri8(Context context) {
        super(context);
        int i;
        int i2;
        int i3;
        this.f = (byte) 12;
        this.h = (byte) 8;
        this.s = bkb.c6;
        this.w = bkb.Z6;
        this.E = new Paint();
        this.I = new Matrix();
        wf2 wf2Var = new wf2(24, null, context);
        this.a = wf2Var;
        wf2Var.setDrawBackgroundAsArc(10);
        int i4 = bkb.f7;
        wf2Var.b(i4, i4, bkb.j7);
        addView(wf2Var);
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTextSize(1, 16.0f);
        zkb.X(textView, bkb.F6, null);
        textView.setTypeface(gl.o());
        textView.setSingleLine();
        if (k96.a0) {
            i = 5;
        } else {
            i = 3;
        }
        addView(textView, nme.d(-2, -2.0f, i | 48, 0.0f, 8.0f, 0.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.r = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(-1);
        textView2.setPadding(gl.L(3.0f), 0, gl.L(3.0f), 0);
        textView2.setTypeface(gl.o());
        if (k96.a0) {
            i2 = 5;
        } else {
            i2 = 3;
        }
        addView(textView2, nme.d(-2, -2.0f, i2 | 80, 0.0f, 0.0f, 0.0f, 8.0f));
        TextView textView3 = new TextView(context);
        this.d = textView3;
        textView3.setTextSize(1, 14.0f);
        int i5 = bkb.x6;
        zkb.X(textView3, i5, null);
        textView3.getPaint().setStrikeThruText(true);
        textView3.setSingleLine();
        if (k96.a0) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        addView(textView3, nme.d(-2, -2.0f, i3 | 80, 0.0f, 0.0f, 0.0f, 8.0f));
        TextView textView4 = new TextView(context);
        this.e = textView4;
        textView4.setTextSize(1, 14.0f);
        zkb.X(textView4, i5, null);
        textView4.setSingleLine();
        addView(textView4, nme.d(-2, -2.0f, (k96.a0 ? 5 : 3) | 80, 0.0f, 0.0f, 0.0f, 8.0f));
        TextView textView5 = new TextView(context);
        this.c = textView5;
        textView5.setTextSize(1, 15.0f);
        zkb.X(textView5, i5, null);
        textView5.setSingleLine();
        addView(textView5, nme.e(-2, -2, 8388613));
        setPadding(gl.L(4.0f), gl.L(8.0f), gl.L(4.0f), gl.L(8.0f));
        setClipToPadding(false);
        setWillNotDraw(false);
    }

    public final void a(defpackage.gi8 r14, boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ri8.a(gi8, boolean):void");
    }

    public final void b(View view) {
        Rect rect = gl.Q;
        rect.right = view.getMeasuredWidth() + rect.left;
        rect.bottom = view.getMeasuredHeight() + rect.top;
        if (k96.a0) {
            int i = rect.right;
            rect.right = getWidth() - rect.left;
            rect.left = getWidth() - i;
        }
        view.layout(rect.left, rect.top, rect.right, rect.bottom);
    }

    public final void c(boolean z, boolean z2) {
        this.a.a(z, z2);
    }

    public final void d() {
        ri8 ri8Var = this.F;
        if (ri8Var != null) {
            ri8Var.d();
            return;
        }
        int w0 = bkb.w0(null, this.s, false);
        int w02 = bkb.w0(null, this.w, false);
        if (this.H == w02 && this.G == w0) {
            return;
        }
        this.G = w0;
        this.H = w02;
        int L = gl.L(200.0f);
        this.x = L;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, L, 0.0f, new int[]{w02, w0, w0, w02}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, Shader.TileMode.CLAMP);
        this.y = linearGradient;
        this.E.setShader(linearGradient);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        Paint paint;
        if (this.M) {
            ri8 ri8Var = this.F;
            if (ri8Var != null) {
                paint = ri8Var.E;
            } else {
                paint = this.E;
            }
            drawChild(canvas, this.a, getDrawingTime());
            d();
            e();
            RectF rectF = gl.P;
            TextView textView = this.c;
            rectF.set(textView.getLeft(), gl.L(4.0f) + textView.getTop(), textView.getRight(), textView.getBottom() - gl.L(4.0f));
            canvas.drawRoundRect(rectF, gl.L(8.0f), gl.L(8.0f), paint);
            TextView textView2 = this.d;
            rectF.set(textView2.getLeft(), gl.L(3.0f) + textView2.getTop(), textView2.getRight(), textView2.getBottom() - gl.L(3.0f));
            canvas.drawRoundRect(rectF, gl.L(8.0f), gl.L(8.0f), paint);
            TextView textView3 = this.b;
            rectF.set(textView3.getLeft(), gl.L(4.0f) + textView3.getTop(), textView3.getRight(), textView3.getBottom() - gl.L(4.0f));
            canvas.drawRoundRect(rectF, gl.L(8.0f), gl.L(8.0f), paint);
            invalidate();
            return;
        }
        super.dispatchDraw(canvas);
    }

    public final void e() {
        ri8 ri8Var = this.F;
        if (ri8Var != null) {
            ri8Var.e();
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long abs = Math.abs(this.J - elapsedRealtime);
        if (abs > 17) {
            abs = 16;
        }
        if (abs < 4) {
            abs = 0;
        }
        int measuredWidth = getMeasuredWidth();
        this.J = elapsedRealtime;
        int i = (int) ((((float) (abs * measuredWidth)) / 400.0f) + this.K);
        this.K = i;
        if (i >= (measuredWidth << 2)) {
            i = (-this.x) << 1;
            this.K = i;
        }
        Matrix matrix = this.I;
        matrix.setTranslate(i + this.L, 0.0f);
        LinearGradient linearGradient = this.y;
        if (linearGradient != null) {
            linearGradient.setLocalMatrix(matrix);
        }
    }

    public gi8 getTier() {
        return this.n;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.N) {
            boolean z = k96.a0;
            TextView textView = this.b;
            if (z) {
                canvas.drawLine(0.0f, getHeight() - 1, textView.getRight(), getHeight() - 1, bkb.j0);
            } else {
                canvas.drawLine(textView.getLeft(), getHeight() - 1, getWidth(), getHeight() - 1, bkb.j0);
            }
        }
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int paddingTop;
        int i6;
        Rect rect = gl.Q;
        byte b = this.h;
        int paddingLeft = getPaddingLeft() + gl.L(b);
        int measuredHeight = getMeasuredHeight();
        wf2 wf2Var = this.a;
        rect.set(paddingLeft, (int) ((measuredHeight - wf2Var.getMeasuredHeight()) / 2.0f), 0, 0);
        b(wf2Var);
        int measuredHeight2 = getMeasuredHeight();
        TextView textView = this.c;
        int measuredHeight3 = (int) ((measuredHeight2 - textView.getMeasuredHeight()) / 2.0f);
        int i7 = b + this.f;
        int measuredWidth = wf2Var.getMeasuredWidth() + gl.L(i7 + 24);
        TextView textView2 = this.d;
        if (textView2.getVisibility() == 0) {
            i5 = textView2.getMeasuredWidth();
        } else {
            i5 = 0;
        }
        int i8 = measuredWidth + i5;
        TextView textView3 = this.e;
        int paddingLeft2 = getPaddingLeft() + textView3.getMeasuredWidth() + i8;
        int measuredWidth2 = getMeasuredWidth() - textView.getMeasuredWidth();
        TextView textView4 = this.r;
        if (paddingLeft2 > measuredWidth2 && textView4.getVisibility() == 0) {
            measuredHeight3 = getPaddingTop() + gl.L(2.0f);
        }
        rect.set(((getMeasuredWidth() - textView.getMeasuredWidth()) - gl.L(16.0f)) - getPaddingRight(), measuredHeight3, 0, 0);
        b(textView);
        float f = i7;
        int paddingLeft3 = getPaddingLeft() + wf2Var.getMeasuredWidth() + gl.L(f);
        int visibility = textView3.getVisibility();
        TextView textView5 = this.b;
        if (visibility == 8) {
            paddingTop = (int) ((getMeasuredHeight() - textView5.getMeasuredHeight()) / 2.0f);
        } else {
            paddingTop = getPaddingTop();
        }
        rect.set(paddingLeft3, paddingTop, 0, 0);
        b(textView5);
        if (textView4.getVisibility() == 0) {
            rect.set(textView5.getMeasuredWidth() + getPaddingLeft() + wf2Var.getMeasuredWidth() + gl.L(i7 + 6), gl.L(2.0f) + getPaddingTop(), 0, 0);
            b(textView4);
        }
        rect.set(getPaddingLeft() + wf2Var.getMeasuredWidth() + gl.L(f), (getMeasuredHeight() - textView2.getMeasuredHeight()) - getPaddingBottom(), 0, 0);
        b(textView2);
        int measuredWidth3 = wf2Var.getMeasuredWidth() + gl.L(f);
        if (textView2.getVisibility() == 0) {
            i6 = gl.L(6.0f) + textView2.getMeasuredWidth();
        } else {
            i6 = 0;
        }
        rect.set(getPaddingLeft() + measuredWidth3 + i6, (getMeasuredHeight() - textView3.getMeasuredHeight()) - getPaddingBottom(), 0, 0);
        b(textView3);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int i3;
        int size = View.MeasureSpec.getSize(i);
        int L = gl.L(58.0f);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(gl.L(28.0f), 1073741824);
        wf2 wf2Var = this.a;
        wf2Var.measure(makeMeasureSpec, makeMeasureSpec);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size - wf2Var.getMeasuredWidth(), Integer.MIN_VALUE);
        int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(L, Integer.MIN_VALUE);
        TextView textView = this.c;
        textView.measure(makeMeasureSpec2, makeMeasureSpec3);
        this.b.measure(View.MeasureSpec.makeMeasureSpec((size - wf2Var.getMeasuredWidth()) - textView.getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(L, Integer.MIN_VALUE));
        TextView textView2 = this.r;
        if (textView2.getVisibility() == 0) {
            textView2.measure(View.MeasureSpec.makeMeasureSpec((size - wf2Var.getMeasuredWidth()) - textView.getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(L, Integer.MIN_VALUE));
        } else {
            textView2.measure(1073741824, 1073741824);
        }
        int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(size - wf2Var.getMeasuredWidth(), Integer.MIN_VALUE);
        int makeMeasureSpec5 = View.MeasureSpec.makeMeasureSpec(L, Integer.MIN_VALUE);
        TextView textView3 = this.d;
        textView3.measure(makeMeasureSpec4, makeMeasureSpec5);
        int measuredWidth = size - wf2Var.getMeasuredWidth();
        if (textView3.getVisibility() == 0) {
            i3 = textView3.getMeasuredWidth();
        } else {
            i3 = 0;
        }
        int f = ug8.f(6.0f, measuredWidth - i3, Integer.MIN_VALUE);
        int makeMeasureSpec6 = View.MeasureSpec.makeMeasureSpec(L, Integer.MIN_VALUE);
        TextView textView4 = this.e;
        textView4.measure(f, makeMeasureSpec6);
        if (textView4.getVisibility() != 0) {
            L -= gl.L(8.0f);
        }
        setMeasuredDimension(size, L);
    }

    public void setCirclePaintProvider(js4 js4Var) {
        this.a.setCirclePaintProvider(js4Var);
    }

    @Override
    public void setEnabled(boolean z) {
        float f;
        float f2;
        super.setEnabled(z);
        float f3 = 0.6f;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.6f;
        }
        this.b.setAlpha(f);
        if (z) {
            f2 = 1.0f;
        } else {
            f2 = 0.6f;
        }
        this.c.setAlpha(f2);
        if (z) {
            f3 = 1.0f;
        }
        this.a.setAlpha(f3);
    }

    public void setGlobalGradientView(ri8 ri8Var) {
        this.F = ri8Var;
    }

    public void setParentXOffset(float f) {
        this.L = f;
    }

    public void setProgressDelegate(xf2 xf2Var) {
        this.a.setProgressDelegate(xf2Var);
    }
}
