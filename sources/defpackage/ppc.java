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
public final class ppc extends FrameLayout implements tjb {
    public static final s33 T = s33.h;
    public int E;
    public final wjb F;
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
    public final lpc c;
    public final lnc d;
    public final FrameLayout e;
    public final TextView f;
    public final ri h;
    public ValueAnimator n;
    public yla r;
    public yla s;
    public boolean w;
    public boolean x;
    public boolean y;

    public ppc(Context context, wjb wjbVar) {
        super(context);
        int i = bkb.Ei;
        this.a = i;
        this.H = new ArrayList();
        this.J = 1.0f;
        this.L = "";
        this.M = new ArrayList();
        this.P = 0.5f;
        this.Q = ",";
        this.R = ".";
        this.F = wjbVar;
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
        addView(linearLayout, nme.e(-2, -1, 17));
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        frameLayout.setTranslationZ(gl.L(1.0f));
        linearLayout.addView(frameLayout, nme.r(59, 60, 16));
        this.E = gl.L(59.0f);
        lnc lncVar = new lnc(60, context, true);
        this.d = lncVar;
        lncVar.g();
        frameLayout.addView(lncVar, nme.d(60, 60.0f, 19, 0.0f, -5.0f, -2.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f = textView;
        int i2 = bkb.y6;
        zkb.X(textView, i2, wjbVar);
        textView.setTextSize(1, 44.0f);
        textView.setTypeface(gl.n1("fonts/gram.ttf"));
        textView.setGravity(16);
        textView.setIncludeFontPadding(false);
        textView.setSingleLine(true);
        textView.setVisibility(4);
        textView.setAlpha(0.0f);
        frameLayout.addView(textView, nme.e(-2, 60, 19));
        lpc lpcVar = new lpc(this, context);
        this.c = lpcVar;
        zkb.X(lpcVar, bkb.F6, wjbVar);
        zkb.D(lpcVar, i2, wjbVar);
        lpcVar.setHint("0");
        lpcVar.setTextSize(1, 44.0f);
        lpcVar.setTypeface(gl.n1("fonts/gram.ttf"));
        lpcVar.setIncludeFontPadding(false);
        lpcVar.setSingleLine(true);
        lpcVar.setGravity(21);
        lpcVar.setBackground(null);
        lpcVar.setPadding(gl.L(3.0f), 0, gl.L(3.0f), 0);
        lpcVar.setMinWidth(gl.L(24.0f));
        lpcVar.setHorizontallyScrolling(true);
        lpcVar.setCursorWidth(3.0f);
        lpcVar.setCursorSize(gl.L(48.0f));
        bkb.v0(i, wjbVar);
        zkb.l(lpcVar, 30, i, wjbVar);
        zkb.l(lpcVar, 36, i, wjbVar);
        vkb K = zkb.K(0.3f, i);
        zkb.n(lpcVar, 3, K.a, -1, 2, K.d, wjbVar);
        lpcVar.setAllowDrawCursor(true);
        lpcVar.setInputType(8194);
        lpcVar.setKeyListener(DigitsKeyListener.getInstance("0123456789.,"));
        lpcVar.setImeOptions(33554438);
        linearLayout.addView(lpcVar, nme.r(-2, 60, 16));
        ri riVar = new ri(context, false, true, false, true, true);
        this.h = riVar;
        riVar.c.m(0.35f, 420L, 3.5f, s33.h);
        riVar.setScaleProperty(0.2f);
        riVar.setAllowCancel(true);
        riVar.getDrawable().c0 = new kbc(riVar, (byte) 27);
        riVar.setTextColor(bkb.v0(this.a, wjbVar));
        riVar.setTextSize(gl.L(28.0f));
        riVar.setTypeface(gl.n1("fonts/gram.ttf"));
        riVar.setGravity(3);
        riVar.getDrawable().T = false;
        riVar.c(k96.M0(2131749341, null), false, true);
        linearLayout.addView(riVar, nme.t(-2, 60, 16, 4, 0, 0, 0));
        setOnClickListener(new bna(this, (byte) 29));
        lpcVar.addTextChangedListener(new a02(this, (byte) 1));
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
        yla ylaVar = this.r;
        if (ylaVar != null) {
            ylaVar.d();
        }
        yla ylaVar2 = this.s;
        if (ylaVar2 != null) {
            ylaVar2.d();
        }
        int i2 = 0;
        TextView textView = this.f;
        float f6 = 1.0f;
        lnc lncVar = this.d;
        FrameLayout frameLayout = this.e;
        if (!z) {
            if (this.x) {
                f5 = 0.0f;
            } else {
                f5 = 1.0f;
            }
            lncVar.setAlpha(f5);
            if (!this.y) {
                f6 = 0.0f;
            }
            textView.setAlpha(f6);
            lncVar.setConversionWobble(0.0f);
            textView.setRotation(0.0f);
            lncVar.setEnabled(!this.x);
            if (this.x) {
                i = 4;
            } else {
                i = 0;
            }
            lncVar.setVisibility(i);
            if (!this.y) {
                i2 = 4;
            }
            textView.setVisibility(i2);
            frameLayout.getLayoutParams().width = this.E;
            frameLayout.requestLayout();
            return;
        }
        int i3 = frameLayout.getLayoutParams().width;
        float alpha = lncVar.getAlpha();
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
            lncVar.setVisibility(0);
        }
        if (alpha2 > 0.0f || f2 > 0.0f) {
            textView.setVisibility(0);
        }
        lncVar.setEnabled(!this.x);
        if (this.x) {
            f3 = 24.0f;
        } else {
            f3 = -24.0f;
        }
        if (lncVar.getAlpha() < 0.01f) {
            lncVar.setConversionWobble(f3);
        }
        yla ylaVar3 = new yla(new ti4(lncVar.getConversionWobble()));
        zla zlaVar = new zla(0.0f);
        zlaVar.a(0.3f);
        zlaVar.b(180.0f);
        ylaVar3.m = zlaVar;
        ylaVar3.f(0.1f);
        ylaVar3.a = (-f3) * 10.0f;
        ylaVar3.b(new h10(this, (byte) 21));
        ylaVar3.h();
        this.s = ylaVar3;
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
        yla ylaVar4 = new yla(textView, yla.s);
        zla zlaVar2 = new zla(0.0f);
        zlaVar2.a(0.3f);
        zlaVar2.b(180.0f);
        ylaVar4.m = zlaVar2;
        ylaVar4.a = (-f4) * 10.0f;
        ylaVar4.h();
        this.r = ylaVar4;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.n = ofFloat;
        ofFloat.setDuration(320L);
        this.n.setInterpolator(new LinearInterpolator());
        this.n.addUpdateListener(new ry6(this, alpha, f, alpha2, f2, i3, (byte) 1));
        this.n.addListener(new yoc(this, (byte) 1));
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
        lpc lpcVar = this.c;
        Editable text = lpcVar.getText();
        boolean z = this.G;
        if (z) {
            if (text.length() == 0) {
                charSequence = "0";
            } else {
                charSequence = null;
            }
            if (!TextUtils.equals(lpcVar.getHint(), charSequence)) {
                lpcVar.setHint(charSequence);
            }
        }
        float f = 0.0f;
        int i = 0;
        while (true) {
            ArrayList arrayList = this.H;
            if (i >= arrayList.size()) {
                break;
            }
            mpc mpcVar = (mpc) arrayList.get(i);
            mpcVar.d = f;
            f += mpcVar.a();
            if (text.getSpanStart(mpcVar) >= 0) {
                text.setSpan(mpcVar, text.getSpanStart(mpcVar), text.getSpanEnd(mpcVar), 33);
            }
            i++;
        }
        if (text.length() == 0 && this.J < 1.0f) {
            float measureText = lpcVar.getPaint().measureText("0");
            int L2 = gl.L(24.0f);
            float f2 = this.N;
            lpcVar.setMinWidth(Math.max(L2, lpcVar.getPaddingRight() + lpcVar.getPaddingLeft() + Math.round((T.getInterpolation(this.J) * (measureText - f2)) + f2)));
        } else {
            if (z && text.length() > 0) {
                L = gl.L(3.0f) + lpcVar.getPaddingRight() + lpcVar.getPaddingLeft();
            } else {
                L = gl.L(24.0f);
            }
            lpcVar.setMinWidth(L);
        }
        lpcVar.requestLayout();
        lpcVar.invalidate();
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
        a43 a43Var = cVar.h;
        if (this.w && isAttachedToWindow() && isShown()) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z7 = this.G;
        lpc lpcVar = this.c;
        ri riVar = this.h;
        TextView textView = this.f;
        if (z7) {
            if (z) {
                i3 = bkb.bm;
            } else {
                i3 = bkb.Ei;
            }
            this.a = i3;
            wjb wjbVar = this.F;
            int v0 = bkb.v0(i3, wjbVar);
            if (z) {
                i4 = bkb.bm;
            } else {
                i4 = bkb.Ei;
            }
            zkb.X(textView, i4, wjbVar);
            riVar.c.v(v0, z2);
            riVar.invalidate();
            zkb.v(lpcVar, this.a, wjbVar);
            zkb.l(lpcVar, 36, this.a, wjbVar);
            if (z) {
                i5 = bkb.bm;
            } else {
                i5 = bkb.Ei;
            }
            vkb K = zkb.K(0.3f, i5);
            zkb.n(lpcVar, 3, K.a, -1, 2, K.d, wjbVar);
        }
        TL_wallet.currencyRate j = a43Var.j();
        String g = a43Var.g();
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
            i = gl.L(59.0f);
        } else if (z3) {
            int ceil = (int) Math.ceil(textView.getPaint().measureText(str));
            if (z4) {
                i2 = gl.L(8.0f);
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
            g = k96.M0(2131749341, null);
        } else if (!z3) {
            g = str;
        }
        riVar.c(g, z2, true);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) riVar.getLayoutParams();
        if (z && !z3 && !z4) {
            L = 0;
        } else {
            L = gl.L(4.0f);
        }
        layoutParams.leftMargin = L;
        riVar.setLayoutParams(layoutParams);
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
        f(lpcVar.getText());
        b();
    }

    public final void e(float f, float f2, boolean z) {
        int right;
        boolean z2;
        float f3 = 1.0f - f;
        LinearLayout linearLayout = this.b;
        float width = (getWidth() / 2.0f) - linearLayout.getLeft();
        FrameLayout frameLayout = this.e;
        lnc lncVar = this.d;
        frameLayout.setTranslationX((((width - frameLayout.getLeft()) - lncVar.getLeft()) - (lncVar.getWidth() / 2.0f)) * f3);
        frameLayout.setTranslationY(de9.e(lncVar.getHeight(), 2.0f, (((getHeight() / 2.0f) - linearLayout.getTop()) - frameLayout.getTop()) - lncVar.getTop(), f3) - (gl.L(36.0f) * ((float) Math.sin(f * 3.141592653589793d))));
        ri riVar = this.h;
        int visibility = riVar.getVisibility();
        lpc lpcVar = this.c;
        if (visibility == 8) {
            right = lpcVar.getRight();
        } else {
            right = riVar.getRight();
        }
        float left = (1.0f - f2) * (width - ((lpcVar.getLeft() + right) / 2.0f));
        lpcVar.setTranslationX(left);
        riVar.setTranslationX(left);
        lpcVar.setAlpha(f2);
        riVar.setAlpha(f2);
        if (z && !this.x) {
            z2 = true;
        } else {
            z2 = false;
        }
        lncVar.setEnabled(z2);
        lncVar.setIntroProgress(f);
    }

    public final void f(android.text.Editable r37) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ppc.f(android.text.Editable):void");
    }

    public hn getCurrencyView() {
        return this.h;
    }

    public lnc getDiamondView() {
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
        lpc lpcVar = this.c;
        int baseline = lpcVar.getBaseline() + lpcVar.getTop();
        TextView textView = this.f;
        if (textView.getVisibility() == 0) {
            textView.setTranslationY(((baseline - this.e.getTop()) - textView.getTop()) - textView.getBaseline());
        }
        ri riVar = this.h;
        riVar.setTranslationY((baseline - riVar.getTop()) - riVar.getBaseline());
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
        ri riVar;
        lpc lpcVar = this.c;
        if (lpcVar != null) {
            try {
                int v0 = bkb.v0(this.a, this.F);
                lpcVar.setCursorColor(v0);
                lpcVar.setHandlesColor(v0);
                if (this.G && (riVar = this.h) != null) {
                    riVar.c.v(v0, false);
                    riVar.invalidate();
                }
            } catch (Exception e) {
                fa4.g(e, true);
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
