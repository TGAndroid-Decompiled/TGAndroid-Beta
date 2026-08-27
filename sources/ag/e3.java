package ag;

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
import h7.z5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.rl;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.bp;
import org.telegram.ui.Components.cp;
import org.telegram.ui.hw0;

public class e3 extends ViewGroup {
    public e3 A;
    public int B;
    public int C;
    public final Matrix D;
    public long E;
    public int F;
    public float G;
    public boolean H;
    public boolean I;

    public final bp f357a;

    public final TextView f358b;

    public final TextView f359c;
    public final TextView d;

    public final TextView f360e;

    public final int f361f;
    public final int h;

    public hw0 f362n;

    public final TextView f363r;

    public final int f364s;
    public final int v;

    public int f365w;

    public LinearGradient f366x;

    public final Paint f367y;

    public e3(Context context) {
        super(context);
        this.f361f = 12;
        this.h = 8;
        this.f364s = g6.f23053d6;
        this.v = g6.f22999a7;
        this.f367y = new Paint();
        this.D = new Matrix();
        bp bpVar = new bp(context, 24, null);
        this.f357a = bpVar;
        bpVar.setDrawBackgroundAsArc(10);
        int i10 = g6.f23109g7;
        bpVar.b(i10, i10, g6.f23182k7);
        addView(bpVar);
        TextView textView = new TextView(context);
        this.f358b = textView;
        textView.setTextSize(1, 16.0f);
        textView.setTextColor(g6.w0(null, g6.G6, false));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setSingleLine();
        addView(textView, z5.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 0.0f, 8.0f, 0.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.f363r = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(-1);
        textView2.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
        textView2.setTypeface(AndroidUtilities.bold());
        addView(textView2, z5.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 80, 0.0f, 0.0f, 0.0f, 8.0f));
        TextView textView3 = new TextView(context);
        this.d = textView3;
        textView3.setTextSize(1, 14.0f);
        int i11 = g6.f23423y6;
        textView3.setTextColor(g6.w0(null, i11, false));
        textView3.getPaint().setStrikeThruText(true);
        textView3.setSingleLine();
        addView(textView3, z5.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 80, 0.0f, 0.0f, 0.0f, 8.0f));
        TextView textView4 = new TextView(context);
        this.f360e = textView4;
        textView4.setTextSize(1, 14.0f);
        textView4.setTextColor(g6.w0(null, i11, false));
        textView4.setSingleLine();
        addView(textView4, z5.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 80, 0.0f, 0.0f, 0.0f, 8.0f));
        TextView textView5 = new TextView(context);
        this.f359c = textView5;
        textView5.setTextSize(1, 15.0f);
        textView5.setTextColor(g6.w0(null, i11, false));
        textView5.setSingleLine();
        addView(textView5, z5.e(-2, -2, 8388613));
        setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(8.0f));
        setClipToPadding(false);
        setWillNotDraw(false);
    }

    public final void a(hw0 hw0Var, boolean z10) {
        boolean z11;
        String currency;
        this.f362n = hw0Var;
        this.I = z10;
        TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption = hw0Var.f38895a;
        TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption2 = hw0Var.f38895a;
        int i10 = tL_premiumSubscriptionOption.months;
        TextView textView = this.f358b;
        if (i10 == 1) {
            textView.setText(LocaleController.getString(R.string.PremiumTierMonthly));
        } else if (i10 == 6) {
            textView.setText(LocaleController.getString(R.string.PremiumTierSemiannual));
        } else if (i10 != 12) {
            textView.setText((i10 <= 12 || i10 % 12 != 0) ? LocaleController.formatPluralString("Months", i10, new Object[0]) : LocaleController.formatPluralString("PremiumTierAnnualYears", i10 / 12, new Object[0]));
        } else {
            textView.setText(LocaleController.getString(R.string.PremiumTierAnnual));
        }
        if (BuildVars.useInvoiceBilling()) {
            z11 = false;
        } else {
            if (BillingController.getInstance().isReady()) {
                hw0Var.a();
                if (hw0Var.f38900g != null) {
                    z11 = false;
                }
            }
            z11 = true;
        }
        this.H = z11;
        TextView textView2 = this.f359c;
        TextView textView3 = this.d;
        TextView textView4 = this.f363r;
        TextView textView5 = this.f360e;
        if (z11) {
            textView4.setText(LocaleController.formatString(R.string.GiftPremiumOptionDiscount, 10));
            textView4.setVisibility(0);
            textView3.setVisibility(0);
            textView5.setVisibility(0);
            textView3.setText("USD00.00");
            textView5.setText(LocaleController.formatString(R.string.PricePerYear, 1000));
            textView2.setText(LocaleController.formatString(R.string.PricePerMonthMe, 100));
        } else {
            if (hw0Var.c() <= 0) {
                textView4.setVisibility(8);
                textView3.setVisibility(8);
                textView5.setVisibility(8);
            } else {
                textView4.setText(LocaleController.formatString(R.string.GiftPremiumOptionDiscount, Integer.valueOf(hw0Var.c())));
                textView4.setVisibility(0);
                textView3.setVisibility(0);
                textView5.setVisibility(0);
            }
            if (BuildVars.useInvoiceBilling() || tL_premiumSubscriptionOption2.store_product == null) {
                currency = BillingController.getInstance().formatCurrency(hw0Var.f38898e, hw0Var.b());
            } else {
                currency = hw0Var.f38899f == null ? "" : BillingController.getInstance().formatCurrency(hw0Var.f38898e, hw0Var.b(), 6);
            }
            textView3.setText(currency);
            textView5.setText(LocaleController.formatString(R.string.PricePerYear, hw0Var.f()));
            textView2.setText(LocaleController.formatString(R.string.PricePerMonthMe, hw0Var.e()));
            if (tL_premiumSubscriptionOption2.current) {
                textView5.setVisibility(0);
                textView5.setText(LocaleController.getString(R.string.YourCurrentPlan));
            }
        }
        requestLayout();
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
        this.f357a.a(z10, z11);
    }

    public final void d() {
        e3 e3Var = this.A;
        if (e3Var != null) {
            e3Var.d();
            return;
        }
        int iW0 = g6.w0(null, this.f364s, false);
        int iW1 = g6.w0(null, this.v, false);
        if (this.C == iW1 && this.B == iW0) {
            return;
        }
        this.B = iW0;
        this.C = iW1;
        int iDp = AndroidUtilities.dp(200.0f);
        this.f365w = iDp;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, iDp, 0.0f, new int[]{iW1, iW0, iW0, iW1}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, Shader.TileMode.CLAMP);
        this.f366x = linearGradient;
        this.f367y.setShader(linearGradient);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        if (!this.H) {
            super.dispatchDraw(canvas);
            return;
        }
        e3 e3Var = this.A;
        Paint paint = e3Var != null ? e3Var.f367y : this.f367y;
        drawChild(canvas, this.f357a, getDrawingTime());
        d();
        e();
        RectF rectF = AndroidUtilities.rectTmp;
        TextView textView = this.f359c;
        rectF.set(textView.getLeft(), AndroidUtilities.dp(4.0f) + textView.getTop(), textView.getRight(), textView.getBottom() - AndroidUtilities.dp(4.0f));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), paint);
        TextView textView2 = this.d;
        rectF.set(textView2.getLeft(), AndroidUtilities.dp(3.0f) + textView2.getTop(), textView2.getRight(), textView2.getBottom() - AndroidUtilities.dp(3.0f));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), paint);
        TextView textView3 = this.f358b;
        rectF.set(textView3.getLeft(), AndroidUtilities.dp(4.0f) + textView3.getTop(), textView3.getRight(), textView3.getBottom() - AndroidUtilities.dp(4.0f));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), paint);
        invalidate();
    }

    public final void e() {
        e3 e3Var = this.A;
        if (e3Var != null) {
            e3Var.e();
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long jAbs = Math.abs(this.E - jElapsedRealtime);
        if (jAbs > 17) {
            jAbs = 16;
        }
        if (jAbs < 4) {
            jAbs = 0;
        }
        int measuredWidth = getMeasuredWidth();
        this.E = jElapsedRealtime;
        int i10 = (int) (((jAbs * ((long) measuredWidth)) / 400.0f) + this.F);
        this.F = i10;
        if (i10 >= measuredWidth * 4) {
            this.F = (-this.f365w) * 2;
        }
        float f10 = this.F + this.G;
        Matrix matrix = this.D;
        matrix.setTranslate(f10, 0.0f);
        LinearGradient linearGradient = this.f366x;
        if (linearGradient != null) {
            linearGradient.setLocalMatrix(matrix);
        }
    }

    public hw0 getTier() {
        return this.f362n;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.I) {
            boolean z10 = LocaleController.isRTL;
            TextView textView = this.f358b;
            if (z10) {
                canvas.drawLine(0.0f, getHeight() - 1, textView.getRight(), getHeight() - 1, g6.f23175k0);
            } else {
                canvas.drawLine(textView.getLeft(), getHeight() - 1, getWidth(), getHeight() - 1, g6.f23175k0);
            }
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int iDp;
        Rect rect = AndroidUtilities.rectTmp2;
        int i14 = this.h;
        int paddingLeft = getPaddingLeft() + AndroidUtilities.dp(i14);
        int measuredHeight = getMeasuredHeight();
        bp bpVar = this.f357a;
        rect.set(paddingLeft, (int) ((measuredHeight - bpVar.getMeasuredHeight()) / 2.0f), 0, 0);
        b(bpVar);
        int measuredHeight2 = getMeasuredHeight();
        TextView textView = this.f359c;
        int measuredHeight3 = (int) ((measuredHeight2 - textView.getMeasuredHeight()) / 2.0f);
        int i15 = i14 + this.f361f;
        int measuredWidth = bpVar.getMeasuredWidth() + AndroidUtilities.dp(i15 + 24);
        TextView textView2 = this.d;
        int measuredWidth2 = measuredWidth + (textView2.getVisibility() == 0 ? textView2.getMeasuredWidth() : 0);
        TextView textView3 = this.f360e;
        int paddingLeft2 = getPaddingLeft() + textView3.getMeasuredWidth() + measuredWidth2;
        int measuredWidth3 = getMeasuredWidth() - textView.getMeasuredWidth();
        TextView textView4 = this.f363r;
        if (paddingLeft2 > measuredWidth3 && textView4.getVisibility() == 0) {
            measuredHeight3 = getPaddingTop() + AndroidUtilities.dp(2.0f);
        }
        rect.set(((getMeasuredWidth() - textView.getMeasuredWidth()) - AndroidUtilities.dp(16.0f)) - getPaddingRight(), measuredHeight3, 0, 0);
        b(textView);
        float f10 = i15;
        int paddingLeft3 = getPaddingLeft() + bpVar.getMeasuredWidth() + AndroidUtilities.dp(f10);
        int visibility = textView3.getVisibility();
        TextView textView5 = this.f358b;
        rect.set(paddingLeft3, visibility == 8 ? (int) ((getMeasuredHeight() - textView5.getMeasuredHeight()) / 2.0f) : getPaddingTop(), 0, 0);
        b(textView5);
        if (textView4.getVisibility() == 0) {
            rect.set(textView5.getMeasuredWidth() + getPaddingLeft() + bpVar.getMeasuredWidth() + AndroidUtilities.dp(i15 + 6), AndroidUtilities.dp(2.0f) + getPaddingTop(), 0, 0);
            b(textView4);
        }
        rect.set(getPaddingLeft() + bpVar.getMeasuredWidth() + AndroidUtilities.dp(f10), (getMeasuredHeight() - textView2.getMeasuredHeight()) - getPaddingBottom(), 0, 0);
        b(textView2);
        int measuredWidth4 = bpVar.getMeasuredWidth() + AndroidUtilities.dp(f10);
        if (textView2.getVisibility() == 0) {
            iDp = AndroidUtilities.dp(6.0f) + textView2.getMeasuredWidth();
        } else {
            iDp = 0;
        }
        rect.set(getPaddingLeft() + measuredWidth4 + iDp, (getMeasuredHeight() - textView3.getMeasuredHeight()) - getPaddingBottom(), 0, 0);
        b(textView3);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int iDp = AndroidUtilities.dp(58.0f);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(28.0f), 1073741824);
        bp bpVar = this.f357a;
        bpVar.measure(iMakeMeasureSpec, iMakeMeasureSpec);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size - bpVar.getMeasuredWidth(), Integer.MIN_VALUE);
        int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(iDp, Integer.MIN_VALUE);
        TextView textView = this.f359c;
        textView.measure(iMakeMeasureSpec2, iMakeMeasureSpec3);
        this.f358b.measure(View.MeasureSpec.makeMeasureSpec((size - bpVar.getMeasuredWidth()) - textView.getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(iDp, Integer.MIN_VALUE));
        TextView textView2 = this.f363r;
        if (textView2.getVisibility() == 0) {
            textView2.measure(View.MeasureSpec.makeMeasureSpec((size - bpVar.getMeasuredWidth()) - textView.getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(iDp, Integer.MIN_VALUE));
        } else {
            textView2.measure(View.MeasureSpec.makeMeasureSpec(0, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 1073741824));
        }
        int iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(size - bpVar.getMeasuredWidth(), Integer.MIN_VALUE);
        int iMakeMeasureSpec5 = View.MeasureSpec.makeMeasureSpec(iDp, Integer.MIN_VALUE);
        TextView textView3 = this.d;
        textView3.measure(iMakeMeasureSpec4, iMakeMeasureSpec5);
        int iD = rl.d(6.0f, (size - bpVar.getMeasuredWidth()) - (textView3.getVisibility() == 0 ? textView3.getMeasuredWidth() : 0), Integer.MIN_VALUE);
        int iMakeMeasureSpec6 = View.MeasureSpec.makeMeasureSpec(iDp, Integer.MIN_VALUE);
        TextView textView4 = this.f360e;
        textView4.measure(iD, iMakeMeasureSpec6);
        if (textView4.getVisibility() != 0) {
            iDp -= AndroidUtilities.dp(8.0f);
        }
        setMeasuredDimension(size, iDp);
    }

    public void setCirclePaintProvider(GenericProvider<Void, Paint> genericProvider) {
        this.f357a.setCirclePaintProvider(genericProvider);
    }

    @Override
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        this.f358b.setAlpha(z10 ? 1.0f : 0.6f);
        this.f359c.setAlpha(z10 ? 1.0f : 0.6f);
        this.f357a.setAlpha(z10 ? 1.0f : 0.6f);
    }

    public void setGlobalGradientView(e3 e3Var) {
        this.A = e3Var;
    }

    public void setParentXOffset(float f10) {
        this.G = f10;
    }

    public void setProgressDelegate(cp cpVar) {
        this.f357a.setProgressDelegate(cpVar);
    }
}
