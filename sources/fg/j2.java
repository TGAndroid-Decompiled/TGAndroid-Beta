package fg;

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
import k7.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.np;
import org.telegram.ui.Components.op;
import org.telegram.ui.xw0;
public class j2 extends ViewGroup {
    public j2 B;
    public int C;
    public int D;
    public final Matrix E;
    public long F;
    public int G;
    public float H;
    public boolean I;
    public boolean J;
    public final np f6355a;
    public final TextView f6356b;
    public final TextView f6357c;
    public final TextView d;
    public final TextView f6358e;
    public final int f6359f;
    public final int h;
    public xw0 f6360n;
    public final TextView f6361r;
    public final int f6362s;
    public final int v;
    public int f6363w;
    public LinearGradient f6364x;
    public final Paint f6365y;

    public j2(Context context) {
        super(context);
        int i10;
        int i11;
        int i12;
        this.f6359f = 12;
        this.h = 8;
        this.f6362s = k6.f21661d6;
        this.v = k6.f21607a7;
        this.f6365y = new Paint();
        this.E = new Matrix();
        np npVar = new np(context, 24, null);
        this.f6355a = npVar;
        npVar.setDrawBackgroundAsArc(10);
        int i13 = k6.f21717g7;
        npVar.b(i13, i13, k6.f21788k7);
        addView(npVar);
        TextView textView = new TextView(context);
        this.f6356b = textView;
        textView.setTextSize(1, 16.0f);
        textView.setTextColor(k6.w0(null, k6.G6, false));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setSingleLine();
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        addView(textView, c6.d(-2, -2.0f, i10 | 48, 0.0f, 8.0f, 0.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.f6361r = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(-1);
        textView2.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
        textView2.setTypeface(AndroidUtilities.bold());
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        addView(textView2, c6.d(-2, -2.0f, i11 | 80, 0.0f, 0.0f, 0.0f, 8.0f));
        TextView textView3 = new TextView(context);
        this.d = textView3;
        textView3.setTextSize(1, 14.0f);
        int i14 = k6.f22038y6;
        textView3.setTextColor(k6.w0(null, i14, false));
        textView3.getPaint().setStrikeThruText(true);
        textView3.setSingleLine();
        if (LocaleController.isRTL) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        addView(textView3, c6.d(-2, -2.0f, i12 | 80, 0.0f, 0.0f, 0.0f, 8.0f));
        TextView textView4 = new TextView(context);
        this.f6358e = textView4;
        textView4.setTextSize(1, 14.0f);
        textView4.setTextColor(k6.w0(null, i14, false));
        textView4.setSingleLine();
        addView(textView4, c6.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 80, 0.0f, 0.0f, 0.0f, 8.0f));
        TextView textView5 = new TextView(context);
        this.f6357c = textView5;
        textView5.setTextSize(1, 15.0f);
        textView5.setTextColor(k6.w0(null, i14, false));
        textView5.setSingleLine();
        addView(textView5, c6.e(-2, -2, 8388613));
        setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(8.0f));
        setClipToPadding(false);
        setWillNotDraw(false);
    }

    public final void a(org.telegram.ui.xw0 r11, boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: fg.j2.a(org.telegram.ui.xw0, boolean):void");
    }

    public final void b(View view) {
        Rect rect = AndroidUtilities.rectTmp2;
        rect.right = view.getMeasuredWidth() + rect.left;
        rect.bottom = view.getMeasuredHeight() + rect.top;
        if (LocaleController.isRTL) {
            int i10 = rect.right;
            rect.right = getWidth() - rect.left;
            rect.left = getWidth() - i10;
        }
        view.layout(rect.left, rect.top, rect.right, rect.bottom);
    }

    public final void c(boolean z4, boolean z10) {
        this.f6355a.a(z4, z10);
    }

    public final void d() {
        j2 j2Var = this.B;
        if (j2Var != null) {
            j2Var.d();
            return;
        }
        int w02 = k6.w0(null, this.f6362s, false);
        int w03 = k6.w0(null, this.v, false);
        if (this.D == w03 && this.C == w02) {
            return;
        }
        this.C = w02;
        this.D = w03;
        int dp = AndroidUtilities.dp(200.0f);
        this.f6363w = dp;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, dp, 0.0f, new int[]{w03, w02, w02, w03}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, Shader.TileMode.CLAMP);
        this.f6364x = linearGradient;
        this.f6365y.setShader(linearGradient);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        Paint paint;
        if (this.I) {
            j2 j2Var = this.B;
            if (j2Var != null) {
                paint = j2Var.f6365y;
            } else {
                paint = this.f6365y;
            }
            drawChild(canvas, this.f6355a, getDrawingTime());
            d();
            e();
            RectF rectF = AndroidUtilities.rectTmp;
            TextView textView = this.f6357c;
            rectF.set(textView.getLeft(), AndroidUtilities.dp(4.0f) + textView.getTop(), textView.getRight(), textView.getBottom() - AndroidUtilities.dp(4.0f));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), paint);
            TextView textView2 = this.d;
            rectF.set(textView2.getLeft(), AndroidUtilities.dp(3.0f) + textView2.getTop(), textView2.getRight(), textView2.getBottom() - AndroidUtilities.dp(3.0f));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), paint);
            TextView textView3 = this.f6356b;
            rectF.set(textView3.getLeft(), AndroidUtilities.dp(4.0f) + textView3.getTop(), textView3.getRight(), textView3.getBottom() - AndroidUtilities.dp(4.0f));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), paint);
            invalidate();
            return;
        }
        super.dispatchDraw(canvas);
    }

    public final void e() {
        j2 j2Var = this.B;
        if (j2Var != null) {
            j2Var.e();
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long abs = Math.abs(this.F - elapsedRealtime);
        if (abs > 17) {
            abs = 16;
        }
        if (abs < 4) {
            abs = 0;
        }
        int measuredWidth = getMeasuredWidth();
        this.F = elapsedRealtime;
        int i10 = (int) ((((float) (abs * measuredWidth)) / 400.0f) + this.G);
        this.G = i10;
        if (i10 >= measuredWidth * 4) {
            this.G = (-this.f6363w) * 2;
        }
        Matrix matrix = this.E;
        matrix.setTranslate(this.G + this.H, 0.0f);
        LinearGradient linearGradient = this.f6364x;
        if (linearGradient != null) {
            linearGradient.setLocalMatrix(matrix);
        }
    }

    public xw0 getTier() {
        return this.f6360n;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.J) {
            boolean z4 = LocaleController.isRTL;
            TextView textView = this.f6356b;
            if (z4) {
                canvas.drawLine(0.0f, getHeight() - 1, textView.getRight(), getHeight() - 1, k6.f21781k0);
            } else {
                canvas.drawLine(textView.getLeft(), getHeight() - 1, getWidth(), getHeight() - 1, k6.f21781k0);
            }
        }
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        int i14;
        int paddingTop;
        int i15;
        Rect rect = AndroidUtilities.rectTmp2;
        int i16 = this.h;
        int paddingLeft = getPaddingLeft() + AndroidUtilities.dp(i16);
        int measuredHeight = getMeasuredHeight();
        np npVar = this.f6355a;
        rect.set(paddingLeft, (int) ((measuredHeight - npVar.getMeasuredHeight()) / 2.0f), 0, 0);
        b(npVar);
        int measuredHeight2 = getMeasuredHeight();
        TextView textView = this.f6357c;
        int measuredHeight3 = (int) ((measuredHeight2 - textView.getMeasuredHeight()) / 2.0f);
        int i17 = i16 + this.f6359f;
        int measuredWidth = npVar.getMeasuredWidth() + AndroidUtilities.dp(i17 + 24);
        TextView textView2 = this.d;
        if (textView2.getVisibility() == 0) {
            i14 = textView2.getMeasuredWidth();
        } else {
            i14 = 0;
        }
        int i18 = measuredWidth + i14;
        TextView textView3 = this.f6358e;
        int paddingLeft2 = getPaddingLeft() + textView3.getMeasuredWidth() + i18;
        int measuredWidth2 = getMeasuredWidth() - textView.getMeasuredWidth();
        TextView textView4 = this.f6361r;
        if (paddingLeft2 > measuredWidth2 && textView4.getVisibility() == 0) {
            measuredHeight3 = getPaddingTop() + AndroidUtilities.dp(2.0f);
        }
        rect.set(((getMeasuredWidth() - textView.getMeasuredWidth()) - AndroidUtilities.dp(16.0f)) - getPaddingRight(), measuredHeight3, 0, 0);
        b(textView);
        float f10 = i17;
        int paddingLeft3 = getPaddingLeft() + npVar.getMeasuredWidth() + AndroidUtilities.dp(f10);
        int visibility = textView3.getVisibility();
        TextView textView5 = this.f6356b;
        if (visibility == 8) {
            paddingTop = (int) ((getMeasuredHeight() - textView5.getMeasuredHeight()) / 2.0f);
        } else {
            paddingTop = getPaddingTop();
        }
        rect.set(paddingLeft3, paddingTop, 0, 0);
        b(textView5);
        if (textView4.getVisibility() == 0) {
            rect.set(textView5.getMeasuredWidth() + getPaddingLeft() + npVar.getMeasuredWidth() + AndroidUtilities.dp(i17 + 6), AndroidUtilities.dp(2.0f) + getPaddingTop(), 0, 0);
            b(textView4);
        }
        rect.set(getPaddingLeft() + npVar.getMeasuredWidth() + AndroidUtilities.dp(f10), (getMeasuredHeight() - textView2.getMeasuredHeight()) - getPaddingBottom(), 0, 0);
        b(textView2);
        int measuredWidth3 = npVar.getMeasuredWidth() + AndroidUtilities.dp(f10);
        if (textView2.getVisibility() == 0) {
            i15 = AndroidUtilities.dp(6.0f) + textView2.getMeasuredWidth();
        } else {
            i15 = 0;
        }
        rect.set(getPaddingLeft() + measuredWidth3 + i15, (getMeasuredHeight() - textView3.getMeasuredHeight()) - getPaddingBottom(), 0, 0);
        b(textView3);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int dp = AndroidUtilities.dp(58.0f);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(28.0f), 1073741824);
        np npVar = this.f6355a;
        npVar.measure(makeMeasureSpec, makeMeasureSpec);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size - npVar.getMeasuredWidth(), Integer.MIN_VALUE);
        int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(dp, Integer.MIN_VALUE);
        TextView textView = this.f6357c;
        textView.measure(makeMeasureSpec2, makeMeasureSpec3);
        this.f6356b.measure(View.MeasureSpec.makeMeasureSpec((size - npVar.getMeasuredWidth()) - textView.getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(dp, Integer.MIN_VALUE));
        TextView textView2 = this.f6361r;
        int i12 = 0;
        if (textView2.getVisibility() == 0) {
            textView2.measure(View.MeasureSpec.makeMeasureSpec((size - npVar.getMeasuredWidth()) - textView.getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(dp, Integer.MIN_VALUE));
        } else {
            textView2.measure(View.MeasureSpec.makeMeasureSpec(0, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 1073741824));
        }
        int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(size - npVar.getMeasuredWidth(), Integer.MIN_VALUE);
        int makeMeasureSpec5 = View.MeasureSpec.makeMeasureSpec(dp, Integer.MIN_VALUE);
        TextView textView3 = this.d;
        textView3.measure(makeMeasureSpec4, makeMeasureSpec5);
        int measuredWidth = size - npVar.getMeasuredWidth();
        if (textView3.getVisibility() == 0) {
            i12 = textView3.getMeasuredWidth();
        }
        int d = org.telegram.ui.b.d(6.0f, measuredWidth - i12, Integer.MIN_VALUE);
        int makeMeasureSpec6 = View.MeasureSpec.makeMeasureSpec(dp, Integer.MIN_VALUE);
        TextView textView4 = this.f6358e;
        textView4.measure(d, makeMeasureSpec6);
        if (textView4.getVisibility() != 0) {
            dp -= AndroidUtilities.dp(8.0f);
        }
        setMeasuredDimension(size, dp);
    }

    public void setCirclePaintProvider(GenericProvider<Void, Paint> genericProvider) {
        this.f6355a.setCirclePaintProvider(genericProvider);
    }

    @Override
    public void setEnabled(boolean z4) {
        float f10;
        float f11;
        super.setEnabled(z4);
        float f12 = 0.6f;
        if (z4) {
            f10 = 1.0f;
        } else {
            f10 = 0.6f;
        }
        this.f6356b.setAlpha(f10);
        if (z4) {
            f11 = 1.0f;
        } else {
            f11 = 0.6f;
        }
        this.f6357c.setAlpha(f11);
        if (z4) {
            f12 = 1.0f;
        }
        this.f6355a.setAlpha(f12);
    }

    public void setGlobalGradientView(j2 j2Var) {
        this.B = j2Var;
    }

    public void setParentXOffset(float f10) {
        this.H = f10;
    }

    public void setProgressDelegate(op opVar) {
        this.f6355a.setProgressDelegate(opVar);
    }
}
