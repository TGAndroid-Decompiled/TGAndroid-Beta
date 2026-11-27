package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.text.method.DigitsKeyListener;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Wallet.c;
public final class duc extends FrameLayout implements snb {
    public static final k43 T = k43.h;
    public int E;
    public final vnb F;
    public final boolean G;
    public final ArrayList H;
    public ValueAnimator I;
    public float J;
    public float K;
    public String L;
    public final ArrayList M;
    public float N;
    public float O;
    public float P;
    public String Q;
    public String R;
    public boolean S;
    public int a;
    public final LinearLayout b;
    public final ytc c;
    public final yrc d;
    public final FrameLayout e;
    public final TextView f;
    public final si h;
    public ValueAnimator n;
    public vpa r;
    public vpa s;
    public boolean w;
    public boolean x;
    public boolean y;

    public duc(Context context, vnb vnbVar) {
        super(context);
        int i = aob.Fi;
        this.a = i;
        this.H = new ArrayList();
        this.J = 1.0f;
        this.L = "";
        this.M = new ArrayList();
        this.P = 0.5f;
        this.Q = ",";
        this.R = ".";
        this.F = vnbVar;
        this.G = true;
        setClipChildren(false);
        setClipToPadding(false);
        LinearLayout linearLayout = new LinearLayout(context);
        this.b = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.setLayoutDirection(0);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        addView(linearLayout, tre.e(-2, -1, 17));
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        frameLayout.setTranslationZ(hl.L(1.0f));
        linearLayout.addView(frameLayout, tre.r(59, 60, 16));
        this.E = hl.L(59.0f);
        yrc yrcVar = new yrc(60, context, true);
        this.d = yrcVar;
        yrcVar.g();
        frameLayout.addView(yrcVar, tre.d(60, 60.0f, 19, 0.0f, -5.0f, -2.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f = textView;
        int i2 = aob.z6;
        yob.X(textView, i2, vnbVar);
        textView.setTextSize(1, 44.0f);
        textView.setTypeface(hl.n1("fonts/gram.ttf"));
        textView.setGravity(16);
        textView.setIncludeFontPadding(false);
        textView.setSingleLine(true);
        textView.setVisibility(4);
        textView.setAlpha(0.0f);
        frameLayout.addView(textView, tre.e(-2, 60, 19));
        ytc ytcVar = new ytc(this, context);
        this.c = ytcVar;
        yob.X(ytcVar, aob.G6, vnbVar);
        yob.D(ytcVar, i2, vnbVar);
        ytcVar.setHint("0");
        ytcVar.setTextSize(1, 44.0f);
        ytcVar.setTypeface(hl.n1("fonts/gram.ttf"));
        ytcVar.setIncludeFontPadding(false);
        ytcVar.setSingleLine(true);
        ytcVar.setGravity(21);
        ytcVar.setBackground(null);
        ytcVar.setPadding(hl.L(3.0f), 0, hl.L(3.0f), 0);
        ytcVar.setMinWidth(hl.L(24.0f));
        ytcVar.setHorizontallyScrolling(true);
        ytcVar.setCursorWidth(3.0f);
        ytcVar.setCursorSize(hl.L(48.0f));
        aob.v0(i, vnbVar);
        yob.l(ytcVar, 30, i, vnbVar);
        yob.l(ytcVar, 36, i, vnbVar);
        uob K = yob.K(0.3f, i);
        yob.n(ytcVar, 3, K.a, -1, 2, K.d, vnbVar);
        ytcVar.setAllowDrawCursor(true);
        ytcVar.setInputType(8194);
        ytcVar.setKeyListener(DigitsKeyListener.getInstance("0123456789.,"));
        ytcVar.setImeOptions(33554438);
        linearLayout.addView(ytcVar, tre.r(-2, 60, 16));
        si siVar = new si(context, false, true, false, true, true);
        this.h = siVar;
        siVar.c.m(0.35f, 420L, 3.5f, k43.h);
        siVar.setScaleProperty(0.2f);
        siVar.setAllowCancel(true);
        siVar.getDrawable().c0 = new olc(siVar, (byte) 14);
        siVar.setTextColor(aob.v0(this.a, vnbVar));
        siVar.setTextSize(hl.L(28.0f));
        siVar.setTypeface(hl.n1("fonts/gram.ttf"));
        siVar.setGravity(3);
        siVar.getDrawable().T = false;
        siVar.c(ob6.M0(2131749287, null), false, true);
        linearLayout.addView(siVar, tre.t(-2, 60, 16, 4, 0, 0, 0));
        setOnClickListener(new xtc(this, (byte) 0));
        ytcVar.addTextChangedListener(new q02(this, (byte) 1));
    }

    public final void a(boolean z) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        int i;
        ValueAnimator valueAnimator = this.n;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.n.cancel();
            this.n = null;
        }
        vpa vpaVar = this.r;
        if (vpaVar != null) {
            vpaVar.d();
        }
        vpa vpaVar2 = this.s;
        if (vpaVar2 != null) {
            vpaVar2.d();
        }
        int i2 = 0;
        TextView textView = this.f;
        float f6 = 1.0f;
        yrc yrcVar = this.d;
        FrameLayout frameLayout = this.e;
        if (!z) {
            if (this.x) {
                f5 = 0.0f;
            } else {
                f5 = 1.0f;
            }
            yrcVar.setAlpha(f5);
            if (!this.y) {
                f6 = 0.0f;
            }
            textView.setAlpha(f6);
            yrcVar.setConversionWobble(0.0f);
            textView.setRotation(0.0f);
            yrcVar.setEnabled(!this.x);
            if (this.x) {
                i = 4;
            } else {
                i = 0;
            }
            yrcVar.setVisibility(i);
            if (!this.y) {
                i2 = 4;
            }
            textView.setVisibility(i2);
            frameLayout.getLayoutParams().width = this.E;
            frameLayout.requestLayout();
            return;
        }
        int i3 = frameLayout.getLayoutParams().width;
        float alpha = yrcVar.getAlpha();
        float alpha2 = textView.getAlpha();
        if (this.x) {
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        if (this.y) {
            f2 = 1.0f;
        } else {
            f2 = 0.0f;
        }
        if (alpha > 0.0f || f > 0.0f) {
            yrcVar.setVisibility(0);
        }
        if (alpha2 > 0.0f || f2 > 0.0f) {
            textView.setVisibility(0);
        }
        yrcVar.setEnabled(!this.x);
        if (this.x) {
            f3 = 24.0f;
        } else {
            f3 = -24.0f;
        }
        if (yrcVar.getAlpha() < 0.01f) {
            yrcVar.setConversionWobble(f3);
        }
        vpa vpaVar3 = new vpa(new xk4(yrcVar.getConversionWobble()));
        wpa wpaVar = new wpa(0.0f);
        wpaVar.a(0.3f);
        wpaVar.b(180.0f);
        vpaVar3.m = wpaVar;
        vpaVar3.f(0.1f);
        vpaVar3.a = (-f3) * 10.0f;
        vpaVar3.b(new i10(this, (byte) 22));
        vpaVar3.h();
        this.s = vpaVar3;
        if (this.x) {
            f4 = 18.0f;
        } else {
            f4 = -18.0f;
        }
        textView.setPivotX(textView.getLayoutParams().width / 2.0f);
        textView.setPivotY(0.0f);
        if (textView.getAlpha() < 0.01f) {
            textView.setRotation(f4);
        }
        vpa vpaVar4 = new vpa(textView, vpa.s);
        wpa wpaVar2 = new wpa(0.0f);
        wpaVar2.a(0.3f);
        wpaVar2.b(180.0f);
        vpaVar4.m = wpaVar2;
        vpaVar4.a = (-f4) * 10.0f;
        vpaVar4.h();
        this.r = vpaVar4;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.n = ofFloat;
        ofFloat.setDuration(320L);
        this.n.setInterpolator(new LinearInterpolator());
        this.n.addUpdateListener(new y07(this, alpha, f, alpha2, f2, i3, (byte) 1));
        this.n.addListener(new ztc(this, (byte) 0));
        this.n.start();
    }

    public final void b() {
        ValueAnimator valueAnimator = this.I;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.I = null;
            this.J = 1.0f;
            c();
        }
    }

    public final void c() {
        int L;
        CharSequence charSequence;
        ytc ytcVar = this.c;
        Editable text = ytcVar.getText();
        boolean z = this.G;
        if (z) {
            if (text.length() == 0) {
                charSequence = "0";
            } else {
                charSequence = null;
            }
            if (!TextUtils.equals(ytcVar.getHint(), charSequence)) {
                ytcVar.setHint(charSequence);
            }
        }
        float f = 0.0f;
        int i = 0;
        while (true) {
            ArrayList arrayList = this.H;
            if (i >= arrayList.size()) {
                break;
            }
            auc aucVar = (auc) arrayList.get(i);
            aucVar.d = f;
            f += aucVar.a();
            if (text.getSpanStart(aucVar) >= 0) {
                text.setSpan(aucVar, text.getSpanStart(aucVar), text.getSpanEnd(aucVar), 33);
            }
            i++;
        }
        if (text.length() == 0 && this.J < 1.0f) {
            float measureText = ytcVar.getPaint().measureText("0");
            int L2 = hl.L(24.0f);
            float f2 = this.N;
            ytcVar.setMinWidth(Math.max(L2, ytcVar.getPaddingRight() + ytcVar.getPaddingLeft() + Math.round((T.getInterpolation(this.J) * (measureText - f2)) + f2)));
        } else {
            if (z && text.length() > 0) {
                L = hl.L(3.0f) + ytcVar.getPaddingRight() + ytcVar.getPaddingLeft();
            } else {
                L = hl.L(24.0f);
            }
            ytcVar.setMinWidth(L);
        }
        ytcVar.requestLayout();
        ytcVar.invalidate();
    }

    public final void d(c cVar, boolean z) {
        boolean z2;
        String str;
        boolean z3;
        boolean z4;
        boolean z5;
        TL_wallet.currencyRate currencyrate;
        int i;
        int i2;
        boolean z6;
        int L;
        TL_wallet.currencyRate currencyrate2;
        String str2;
        String str3;
        int i3;
        int i4;
        int i5;
        s43 s43Var = cVar.h;
        if (this.w && isAttachedToWindow() && isShown()) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z7 = this.G;
        ytc ytcVar = this.c;
        si siVar = this.h;
        TextView textView = this.f;
        if (z7) {
            if (z) {
                i3 = aob.cm;
            } else {
                i3 = aob.Fi;
            }
            this.a = i3;
            vnb vnbVar = this.F;
            int v0 = aob.v0(i3, vnbVar);
            if (z) {
                i4 = aob.cm;
            } else {
                i4 = aob.Fi;
            }
            yob.X(textView, i4, vnbVar);
            siVar.c.v(v0, z2);
            siVar.invalidate();
            yob.v(ytcVar, this.a, vnbVar);
            yob.l(ytcVar, 36, this.a, vnbVar);
            if (z) {
                i5 = aob.cm;
            } else {
                i5 = aob.Fi;
            }
            uob K = yob.K(0.3f, i5);
            yob.n(ytcVar, 3, K.a, -1, 2, K.d, vnbVar);
        }
        TL_wallet.currencyRate j = s43Var.j();
        String g = s43Var.g();
        boolean equals = TextUtils.equals(g, "USD");
        if (j != null && !TextUtils.isEmpty(j.symbol)) {
            str = j.symbol;
        } else if (equals) {
            str = "$";
        } else {
            str = g;
        }
        if (z && (j == null ? equals : j.symbolLeft)) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (j != null && j.spaceBetween) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (this.x == z && this.y == z3 && (!z3 || TextUtils.equals(textView.getText(), str))) {
            z5 = false;
        } else {
            z5 = true;
        }
        if (z3) {
            textView.setText(str);
            currencyrate = j;
            textView.getLayoutParams().width = (int) Math.ceil(textView.getPaint().measureText(str));
            textView.requestLayout();
        } else {
            currencyrate = j;
        }
        this.x = z;
        this.y = z3;
        if (!z) {
            i = hl.L(59.0f);
        } else if (z3) {
            int ceil = (int) Math.ceil(textView.getPaint().measureText(str));
            if (z4) {
                i2 = hl.L(8.0f);
            } else {
                i2 = 0;
            }
            i = ceil + i2;
        } else {
            i = 0;
        }
        this.E = i;
        if (z5 || !this.w) {
            if (z2 && z5) {
                z6 = true;
            } else {
                z6 = false;
            }
            a(z6);
        }
        this.w = true;
        if (!z) {
            g = ob6.M0(2131749287, null);
        } else if (!z3) {
            g = str;
        }
        siVar.c(g, z2, true);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) siVar.getLayoutParams();
        if (z && !z3 && !z4) {
            L = 0;
        } else {
            L = hl.L(4.0f);
        }
        layoutParams.leftMargin = L;
        siVar.setLayoutParams(layoutParams);
        if (z && currencyrate != null) {
            currencyrate2 = currencyrate;
            str2 = currencyrate2.thousandsSeparator;
            if (str2 == null) {
                str2 = "";
            }
        } else {
            currencyrate2 = currencyrate;
            str2 = ",";
        }
        if (z && currencyrate2 != null && !TextUtils.isEmpty(currencyrate2.decimalSeparator)) {
            str3 = currencyrate2.decimalSeparator;
        } else {
            str3 = ".";
        }
        if (TextUtils.equals(this.Q, str2) && TextUtils.equals(this.R, str3)) {
            return;
        }
        b();
        this.Q = str2;
        this.R = str3;
        f(ytcVar.getText());
        b();
    }

    public final void e(float f, float f2, boolean z) {
        int right;
        boolean z2;
        float f3 = 1.0f - f;
        LinearLayout linearLayout = this.b;
        float width = (getWidth() / 2.0f) - linearLayout.getLeft();
        FrameLayout frameLayout = this.e;
        yrc yrcVar = this.d;
        frameLayout.setTranslationX((((width - frameLayout.getLeft()) - yrcVar.getLeft()) - (yrcVar.getWidth() / 2.0f)) * f3);
        frameLayout.setTranslationY(uh9.e(yrcVar.getHeight(), 2.0f, (((getHeight() / 2.0f) - linearLayout.getTop()) - frameLayout.getTop()) - yrcVar.getTop(), f3) - (hl.L(36.0f) * ((float) Math.sin(f * 3.141592653589793d))));
        si siVar = this.h;
        int visibility = siVar.getVisibility();
        ytc ytcVar = this.c;
        if (visibility == 8) {
            right = ytcVar.getRight();
        } else {
            right = siVar.getRight();
        }
        float left = (1.0f - f2) * (width - ((ytcVar.getLeft() + right) / 2.0f));
        ytcVar.setTranslationX(left);
        siVar.setTranslationX(left);
        ytcVar.setAlpha(f2);
        siVar.setAlpha(f2);
        if (z && !this.x) {
            z2 = true;
        } else {
            z2 = false;
        }
        yrcVar.setEnabled(z2);
        yrcVar.setIntroProgress(f);
    }

    public final void f(android.text.Editable r37) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.duc.f(android.text.Editable):void");
    }

    public in getCurrencyView() {
        return this.h;
    }

    public yrc getDiamondView() {
        return this.d;
    }

    public EditTextBoldCursor getEditText() {
        return this.c;
    }

    @Override
    public final void onDetachedFromWindow() {
        b();
        a(false);
        super.onDetachedFromWindow();
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        ytc ytcVar = this.c;
        int baseline = ytcVar.getBaseline() + ytcVar.getTop();
        TextView textView = this.f;
        if (textView.getVisibility() == 0) {
            textView.setTranslationY(((baseline - this.e.getTop()) - textView.getTop()) - textView.getBaseline());
        }
        si siVar = this.h;
        siVar.setTranslationY((baseline - siVar.getTop()) - siVar.getBaseline());
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        LinearLayout linearLayout = this.b;
        linearLayout.measure(0, makeMeasureSpec);
        float min = Math.min(1.0f, getMeasuredWidth() / Math.max(1, linearLayout.getMeasuredWidth()));
        linearLayout.setPivotX(linearLayout.getMeasuredWidth() / 2.0f);
        linearLayout.setPivotY(linearLayout.getMeasuredHeight() / 2.0f);
        linearLayout.setScaleX(min);
        linearLayout.setScaleY(min);
    }

    public void setAmountText(String str) {
        this.S = true;
        try {
            this.c.setText(str);
        } finally {
            this.S = false;
        }
    }

    public void setScaleProperty(float f) {
        this.P = 1.0f - Math.max(0.0f, Math.min(1.0f, f));
    }

    @Override
    public final void updateColors() {
        si siVar;
        ytc ytcVar = this.c;
        if (ytcVar != null) {
            try {
                int v0 = aob.v0(this.a, this.F);
                ytcVar.setCursorColor(v0);
                ytcVar.setHandlesColor(v0);
                if (this.G && (siVar = this.h) != null) {
                    siVar.c.v(v0, false);
                    siVar.invalidate();
                }
            } catch (Exception e) {
                cc4.g(e, true);
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
