package cg;

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
import i7.f6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.hp;
import org.telegram.ui.Components.ip;
import org.telegram.ui.gw0;
public class l2 extends ViewGroup {
    public l2 A;
    public int B;
    public int C;
    public final Matrix D;
    public long E;
    public int F;
    public float G;
    public boolean H;
    public boolean I;
    public final hp f3200a;
    public final TextView f3201b;
    public final TextView f3202c;
    public final TextView d;
    public final TextView f3203e;
    public final int f3204f;
    public final int h;
    public gw0 f3205n;
    public final TextView f3206r;
    public final int f3207s;
    public final int v;
    public int f3208w;
    public LinearGradient f3209x;
    public final Paint f3210y;

    public l2(Context context) {
        super(context);
        int i10;
        int i11;
        int i12;
        this.f3204f = 12;
        this.h = 8;
        this.f3207s = g6.f23062d6;
        this.v = g6.f23009a7;
        this.f3210y = new Paint();
        this.D = new Matrix();
        hp hpVar = new hp(context, 24, null);
        this.f3200a = hpVar;
        hpVar.setDrawBackgroundAsArc(10);
        int i13 = g6.f23118g7;
        hpVar.b(i13, i13, g6.f23190k7);
        addView(hpVar);
        TextView textView = new TextView(context);
        this.f3201b = textView;
        textView.setTextSize(1, 16.0f);
        textView.setTextColor(g6.w0(null, g6.G6, false));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setSingleLine();
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        addView(textView, f6.d(-2, -2.0f, i10 | 48, 0.0f, 8.0f, 0.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.f3206r = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(-1);
        textView2.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
        textView2.setTypeface(AndroidUtilities.bold());
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        addView(textView2, f6.d(-2, -2.0f, i11 | 80, 0.0f, 0.0f, 0.0f, 8.0f));
        TextView textView3 = new TextView(context);
        this.d = textView3;
        textView3.setTextSize(1, 14.0f);
        int i14 = g6.f23433y6;
        textView3.setTextColor(g6.w0(null, i14, false));
        textView3.getPaint().setStrikeThruText(true);
        textView3.setSingleLine();
        if (LocaleController.isRTL) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        addView(textView3, f6.d(-2, -2.0f, i12 | 80, 0.0f, 0.0f, 0.0f, 8.0f));
        TextView textView4 = new TextView(context);
        this.f3203e = textView4;
        textView4.setTextSize(1, 14.0f);
        textView4.setTextColor(g6.w0(null, i14, false));
        textView4.setSingleLine();
        addView(textView4, f6.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 80, 0.0f, 0.0f, 0.0f, 8.0f));
        TextView textView5 = new TextView(context);
        this.f3202c = textView5;
        textView5.setTextSize(1, 15.0f);
        textView5.setTextColor(g6.w0(null, i14, false));
        textView5.setSingleLine();
        addView(textView5, f6.e(-2, -2, 8388613));
        setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(8.0f));
        setClipToPadding(false);
        setWillNotDraw(false);
    }

    public final void a(org.telegram.ui.gw0 r11, boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: cg.l2.a(org.telegram.ui.gw0, boolean):void");
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

    public final void c(boolean z10, boolean z11) {
        this.f3200a.a(z10, z11);
    }

    public final void d() {
        l2 l2Var = this.A;
        if (l2Var != null) {
            l2Var.d();
            return;
        }
        int w02 = g6.w0(null, this.f3207s, false);
        int w03 = g6.w0(null, this.v, false);
        if (this.C == w03 && this.B == w02) {
            return;
        }
        this.B = w02;
        this.C = w03;
        int dp = AndroidUtilities.dp(200.0f);
        this.f3208w = dp;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, dp, 0.0f, new int[]{w03, w02, w02, w03}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, Shader.TileMode.CLAMP);
        this.f3209x = linearGradient;
        this.f3210y.setShader(linearGradient);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        Paint paint;
        if (this.H) {
            l2 l2Var = this.A;
            if (l2Var != null) {
                paint = l2Var.f3210y;
            } else {
                paint = this.f3210y;
            }
            drawChild(canvas, this.f3200a, getDrawingTime());
            d();
            e();
            RectF rectF = AndroidUtilities.rectTmp;
            TextView textView = this.f3202c;
            rectF.set(textView.getLeft(), AndroidUtilities.dp(4.0f) + textView.getTop(), textView.getRight(), textView.getBottom() - AndroidUtilities.dp(4.0f));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), paint);
            TextView textView2 = this.d;
            rectF.set(textView2.getLeft(), AndroidUtilities.dp(3.0f) + textView2.getTop(), textView2.getRight(), textView2.getBottom() - AndroidUtilities.dp(3.0f));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), paint);
            TextView textView3 = this.f3201b;
            rectF.set(textView3.getLeft(), AndroidUtilities.dp(4.0f) + textView3.getTop(), textView3.getRight(), textView3.getBottom() - AndroidUtilities.dp(4.0f));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), paint);
            invalidate();
            return;
        }
        super.dispatchDraw(canvas);
    }

    public final void e() {
        l2 l2Var = this.A;
        if (l2Var != null) {
            l2Var.e();
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long abs = Math.abs(this.E - elapsedRealtime);
        if (abs > 17) {
            abs = 16;
        }
        if (abs < 4) {
            abs = 0;
        }
        int measuredWidth = getMeasuredWidth();
        this.E = elapsedRealtime;
        int i10 = (int) ((((float) (abs * measuredWidth)) / 400.0f) + this.F);
        this.F = i10;
        if (i10 >= measuredWidth * 4) {
            this.F = (-this.f3208w) * 2;
        }
        Matrix matrix = this.D;
        matrix.setTranslate(this.F + this.G, 0.0f);
        LinearGradient linearGradient = this.f3209x;
        if (linearGradient != null) {
            linearGradient.setLocalMatrix(matrix);
        }
    }

    public gw0 getTier() {
        return this.f3205n;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.I) {
            boolean z10 = LocaleController.isRTL;
            TextView textView = this.f3201b;
            if (z10) {
                canvas.drawLine(0.0f, getHeight() - 1, textView.getRight(), getHeight() - 1, g6.f23183k0);
            } else {
                canvas.drawLine(textView.getLeft(), getHeight() - 1, getWidth(), getHeight() - 1, g6.f23183k0);
            }
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int paddingTop;
        int i15;
        Rect rect = AndroidUtilities.rectTmp2;
        int i16 = this.h;
        int paddingLeft = getPaddingLeft() + AndroidUtilities.dp(i16);
        int measuredHeight = getMeasuredHeight();
        hp hpVar = this.f3200a;
        rect.set(paddingLeft, (int) ((measuredHeight - hpVar.getMeasuredHeight()) / 2.0f), 0, 0);
        b(hpVar);
        int measuredHeight2 = getMeasuredHeight();
        TextView textView = this.f3202c;
        int measuredHeight3 = (int) ((measuredHeight2 - textView.getMeasuredHeight()) / 2.0f);
        int i17 = i16 + this.f3204f;
        int measuredWidth = hpVar.getMeasuredWidth() + AndroidUtilities.dp(i17 + 24);
        TextView textView2 = this.d;
        if (textView2.getVisibility() == 0) {
            i14 = textView2.getMeasuredWidth();
        } else {
            i14 = 0;
        }
        int i18 = measuredWidth + i14;
        TextView textView3 = this.f3203e;
        int paddingLeft2 = getPaddingLeft() + textView3.getMeasuredWidth() + i18;
        int measuredWidth2 = getMeasuredWidth() - textView.getMeasuredWidth();
        TextView textView4 = this.f3206r;
        if (paddingLeft2 > measuredWidth2 && textView4.getVisibility() == 0) {
            measuredHeight3 = getPaddingTop() + AndroidUtilities.dp(2.0f);
        }
        rect.set(((getMeasuredWidth() - textView.getMeasuredWidth()) - AndroidUtilities.dp(16.0f)) - getPaddingRight(), measuredHeight3, 0, 0);
        b(textView);
        float f9 = i17;
        int paddingLeft3 = getPaddingLeft() + hpVar.getMeasuredWidth() + AndroidUtilities.dp(f9);
        int visibility = textView3.getVisibility();
        TextView textView5 = this.f3201b;
        if (visibility == 8) {
            paddingTop = (int) ((getMeasuredHeight() - textView5.getMeasuredHeight()) / 2.0f);
        } else {
            paddingTop = getPaddingTop();
        }
        rect.set(paddingLeft3, paddingTop, 0, 0);
        b(textView5);
        if (textView4.getVisibility() == 0) {
            rect.set(textView5.getMeasuredWidth() + getPaddingLeft() + hpVar.getMeasuredWidth() + AndroidUtilities.dp(i17 + 6), AndroidUtilities.dp(2.0f) + getPaddingTop(), 0, 0);
            b(textView4);
        }
        rect.set(getPaddingLeft() + hpVar.getMeasuredWidth() + AndroidUtilities.dp(f9), (getMeasuredHeight() - textView2.getMeasuredHeight()) - getPaddingBottom(), 0, 0);
        b(textView2);
        int measuredWidth3 = hpVar.getMeasuredWidth() + AndroidUtilities.dp(f9);
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
        hp hpVar = this.f3200a;
        hpVar.measure(makeMeasureSpec, makeMeasureSpec);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size - hpVar.getMeasuredWidth(), Integer.MIN_VALUE);
        int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(dp, Integer.MIN_VALUE);
        TextView textView = this.f3202c;
        textView.measure(makeMeasureSpec2, makeMeasureSpec3);
        this.f3201b.measure(View.MeasureSpec.makeMeasureSpec((size - hpVar.getMeasuredWidth()) - textView.getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(dp, Integer.MIN_VALUE));
        TextView textView2 = this.f3206r;
        int i12 = 0;
        if (textView2.getVisibility() == 0) {
            textView2.measure(View.MeasureSpec.makeMeasureSpec((size - hpVar.getMeasuredWidth()) - textView.getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(dp, Integer.MIN_VALUE));
        } else {
            textView2.measure(View.MeasureSpec.makeMeasureSpec(0, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 1073741824));
        }
        int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(size - hpVar.getMeasuredWidth(), Integer.MIN_VALUE);
        int makeMeasureSpec5 = View.MeasureSpec.makeMeasureSpec(dp, Integer.MIN_VALUE);
        TextView textView3 = this.d;
        textView3.measure(makeMeasureSpec4, makeMeasureSpec5);
        int measuredWidth = size - hpVar.getMeasuredWidth();
        if (textView3.getVisibility() == 0) {
            i12 = textView3.getMeasuredWidth();
        }
        int d = org.telegram.ui.b.d(6.0f, measuredWidth - i12, Integer.MIN_VALUE);
        int makeMeasureSpec6 = View.MeasureSpec.makeMeasureSpec(dp, Integer.MIN_VALUE);
        TextView textView4 = this.f3203e;
        textView4.measure(d, makeMeasureSpec6);
        if (textView4.getVisibility() != 0) {
            dp -= AndroidUtilities.dp(8.0f);
        }
        setMeasuredDimension(size, dp);
    }

    public void setCirclePaintProvider(GenericProvider<Void, Paint> genericProvider) {
        this.f3200a.setCirclePaintProvider(genericProvider);
    }

    @Override
    public void setEnabled(boolean z10) {
        float f9;
        float f10;
        super.setEnabled(z10);
        float f11 = 0.6f;
        if (z10) {
            f9 = 1.0f;
        } else {
            f9 = 0.6f;
        }
        this.f3201b.setAlpha(f9);
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.6f;
        }
        this.f3202c.setAlpha(f10);
        if (z10) {
            f11 = 1.0f;
        }
        this.f3200a.setAlpha(f11);
    }

    public void setGlobalGradientView(l2 l2Var) {
        this.A = l2Var;
    }

    public void setParentXOffset(float f9) {
        this.G = f9;
    }

    public void setProgressDelegate(ip ipVar) {
        this.f3200a.setProgressDelegate(ipVar);
    }
}
