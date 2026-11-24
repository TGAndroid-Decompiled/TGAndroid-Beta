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
public final class qrc extends FrameLayout implements vlb {
    public static final d53 T = d53.h;
    public int E;
    public final ylb F;
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
    public final mrc c;
    public final npc d;
    public final FrameLayout e;
    public final TextView f;
    public final rj h;
    public ValueAnimator n;
    public zna r;
    public zna s;
    public boolean w;
    public boolean x;
    public boolean y;

    public qrc(Context context, ylb ylbVar) {
        super(context);
        int i = cmb.Ei;
        this.a = i;
        this.H = new ArrayList();
        this.J = 1.0f;
        this.L = "";
        this.M = new ArrayList();
        this.P = 0.5f;
        this.Q = ",";
        this.R = ".";
        this.F = ylbVar;
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
        addView(linearLayout, qoe.e(-2, -1, 17));
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        frameLayout.setTranslationZ(gm.L(1.0f));
        linearLayout.addView(frameLayout, qoe.r(59, 60, 16));
        this.E = gm.L(59.0f);
        npc npcVar = new npc(60, context, true);
        this.d = npcVar;
        npcVar.g();
        frameLayout.addView(npcVar, qoe.d(60, 60.0f, 19, 0.0f, -5.0f, -2.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f = textView;
        int i2 = cmb.y6;
        anb.X(textView, i2, ylbVar);
        textView.setTextSize(1, 44.0f);
        textView.setTypeface(gm.n1("fonts/gram.ttf"));
        textView.setGravity(16);
        textView.setIncludeFontPadding(false);
        textView.setSingleLine(true);
        textView.setVisibility(4);
        textView.setAlpha(0.0f);
        frameLayout.addView(textView, qoe.e(-2, 60, 19));
        mrc mrcVar = new mrc(this, context);
        this.c = mrcVar;
        anb.X(mrcVar, cmb.F6, ylbVar);
        anb.D(mrcVar, i2, ylbVar);
        mrcVar.setHint("0");
        mrcVar.setTextSize(1, 44.0f);
        mrcVar.setTypeface(gm.n1("fonts/gram.ttf"));
        mrcVar.setIncludeFontPadding(false);
        mrcVar.setSingleLine(true);
        mrcVar.setGravity(21);
        mrcVar.setBackground(null);
        mrcVar.setPadding(gm.L(3.0f), 0, gm.L(3.0f), 0);
        mrcVar.setMinWidth(gm.L(24.0f));
        mrcVar.setHorizontallyScrolling(true);
        mrcVar.setCursorWidth(3.0f);
        mrcVar.setCursorSize(gm.L(48.0f));
        cmb.v0(i, ylbVar);
        anb.l(mrcVar, 30, i, ylbVar);
        anb.l(mrcVar, 36, i, ylbVar);
        wmb K = anb.K(0.3f, i);
        anb.n(mrcVar, 3, K.a, -1, 2, K.d, ylbVar);
        mrcVar.setAllowDrawCursor(true);
        mrcVar.setInputType(8194);
        mrcVar.setKeyListener(DigitsKeyListener.getInstance("0123456789.,"));
        mrcVar.setImeOptions(33554438);
        linearLayout.addView(mrcVar, qoe.r(-2, 60, 16));
        rj rjVar = new rj(context, false, true, false, true, true);
        this.h = rjVar;
        rjVar.c.m(0.35f, 420L, 3.5f, d53.h);
        rjVar.setScaleProperty(0.2f);
        rjVar.setAllowCancel(true);
        rjVar.getDrawable().c0 = new cpc(rjVar, (byte) 5);
        rjVar.setTextColor(cmb.v0(this.a, ylbVar));
        rjVar.setTextSize(gm.L(28.0f));
        rjVar.setTypeface(gm.n1("fonts/gram.ttf"));
        rjVar.setGravity(3);
        rjVar.getDrawable().T = false;
        rjVar.c(jb6.M0(2131749290, null), false, true);
        linearLayout.addView(rjVar, qoe.t(-2, 60, 16, 4, 0, 0, 0));
        setOnClickListener(new kpc(this, (byte) 2));
        mrcVar.addTextChangedListener(new l12(this, (byte) 1));
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
        zna znaVar = this.r;
        if (znaVar != null) {
            znaVar.d();
        }
        zna znaVar2 = this.s;
        if (znaVar2 != null) {
            znaVar2.d();
        }
        int i2 = 0;
        TextView textView = this.f;
        float f6 = 1.0f;
        npc npcVar = this.d;
        FrameLayout frameLayout = this.e;
        if (!z) {
            if (this.x) {
                f5 = 0.0f;
            } else {
                f5 = 1.0f;
            }
            npcVar.setAlpha(f5);
            if (!this.y) {
                f6 = 0.0f;
            }
            textView.setAlpha(f6);
            npcVar.setConversionWobble(0.0f);
            textView.setRotation(0.0f);
            npcVar.setEnabled(!this.x);
            if (this.x) {
                i = 4;
            } else {
                i = 0;
            }
            npcVar.setVisibility(i);
            if (!this.y) {
                i2 = 4;
            }
            textView.setVisibility(i2);
            frameLayout.getLayoutParams().width = this.E;
            frameLayout.requestLayout();
            return;
        }
        int i3 = frameLayout.getLayoutParams().width;
        float alpha = npcVar.getAlpha();
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
            npcVar.setVisibility(0);
        }
        if (alpha2 > 0.0f || f2 > 0.0f) {
            textView.setVisibility(0);
        }
        npcVar.setEnabled(!this.x);
        if (this.x) {
            f3 = 24.0f;
        } else {
            f3 = -24.0f;
        }
        if (npcVar.getAlpha() < 0.01f) {
            npcVar.setConversionWobble(f3);
        }
        zna znaVar3 = new zna(new xk4(npcVar.getConversionWobble()));
        aoa aoaVar = new aoa(0.0f);
        aoaVar.a(0.3f);
        aoaVar.b(180.0f);
        znaVar3.m = aoaVar;
        znaVar3.f(0.1f);
        znaVar3.a = (-f3) * 10.0f;
        znaVar3.b(new h20(this, (byte) 21));
        znaVar3.h();
        this.s = znaVar3;
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
        zna znaVar4 = new zna(textView, zna.s);
        aoa aoaVar2 = new aoa(0.0f);
        aoaVar2.a(0.3f);
        aoaVar2.b(180.0f);
        znaVar4.m = aoaVar2;
        znaVar4.a = (-f4) * 10.0f;
        znaVar4.h();
        this.r = znaVar4;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.n = ofFloat;
        ofFloat.setDuration(320L);
        this.n.setInterpolator(new LinearInterpolator());
        this.n.addUpdateListener(new r07(this, alpha, f, alpha2, f2, i3, (byte) 1));
        this.n.addListener(new koc(this, (byte) 3));
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
        mrc mrcVar = this.c;
        Editable text = mrcVar.getText();
        boolean z = this.G;
        if (z) {
            if (text.length() == 0) {
                charSequence = "0";
            } else {
                charSequence = null;
            }
            if (!TextUtils.equals(mrcVar.getHint(), charSequence)) {
                mrcVar.setHint(charSequence);
            }
        }
        float f = 0.0f;
        int i = 0;
        while (true) {
            ArrayList arrayList = this.H;
            if (i >= arrayList.size()) {
                break;
            }
            nrc nrcVar = (nrc) arrayList.get(i);
            nrcVar.d = f;
            f += nrcVar.a();
            if (text.getSpanStart(nrcVar) >= 0) {
                text.setSpan(nrcVar, text.getSpanStart(nrcVar), text.getSpanEnd(nrcVar), 33);
            }
            i++;
        }
        if (text.length() == 0 && this.J < 1.0f) {
            float measureText = mrcVar.getPaint().measureText("0");
            int L2 = gm.L(24.0f);
            float f2 = this.N;
            mrcVar.setMinWidth(Math.max(L2, mrcVar.getPaddingRight() + mrcVar.getPaddingLeft() + Math.round((T.getInterpolation(this.J) * (measureText - f2)) + f2)));
        } else {
            if (z && text.length() > 0) {
                L = gm.L(3.0f) + mrcVar.getPaddingRight() + mrcVar.getPaddingLeft();
            } else {
                L = gm.L(24.0f);
            }
            mrcVar.setMinWidth(L);
        }
        mrcVar.requestLayout();
        mrcVar.invalidate();
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
        l53 l53Var = cVar.h;
        if (this.w && isAttachedToWindow() && isShown()) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z7 = this.G;
        mrc mrcVar = this.c;
        rj rjVar = this.h;
        TextView textView = this.f;
        if (z7) {
            if (z) {
                i3 = cmb.bm;
            } else {
                i3 = cmb.Ei;
            }
            this.a = i3;
            ylb ylbVar = this.F;
            int v0 = cmb.v0(i3, ylbVar);
            if (z) {
                i4 = cmb.bm;
            } else {
                i4 = cmb.Ei;
            }
            anb.X(textView, i4, ylbVar);
            rjVar.c.v(v0, z2);
            rjVar.invalidate();
            anb.v(mrcVar, this.a, ylbVar);
            anb.l(mrcVar, 36, this.a, ylbVar);
            if (z) {
                i5 = cmb.bm;
            } else {
                i5 = cmb.Ei;
            }
            wmb K = anb.K(0.3f, i5);
            anb.n(mrcVar, 3, K.a, -1, 2, K.d, ylbVar);
        }
        TL_wallet.currencyRate j = l53Var.j();
        String g = l53Var.g();
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
            i = gm.L(59.0f);
        } else if (z3) {
            int ceil = (int) Math.ceil(textView.getPaint().measureText(str));
            if (z4) {
                i2 = gm.L(8.0f);
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
            g = jb6.M0(2131749290, null);
        } else if (!z3) {
            g = str;
        }
        rjVar.c(g, z2, true);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) rjVar.getLayoutParams();
        if (z && !z3 && !z4) {
            L = 0;
        } else {
            L = gm.L(4.0f);
        }
        layoutParams.leftMargin = L;
        rjVar.setLayoutParams(layoutParams);
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
        f(mrcVar.getText());
        b();
    }

    public final void e(float f, float f2, boolean z) {
        int right;
        boolean z2;
        float f3 = 1.0f - f;
        LinearLayout linearLayout = this.b;
        float width = (getWidth() / 2.0f) - linearLayout.getLeft();
        FrameLayout frameLayout = this.e;
        npc npcVar = this.d;
        frameLayout.setTranslationX((((width - frameLayout.getLeft()) - npcVar.getLeft()) - (npcVar.getWidth() / 2.0f)) * f3);
        frameLayout.setTranslationY(hg9.e(npcVar.getHeight(), 2.0f, (((getHeight() / 2.0f) - linearLayout.getTop()) - frameLayout.getTop()) - npcVar.getTop(), f3) - (gm.L(36.0f) * ((float) Math.sin(f * 3.141592653589793d))));
        rj rjVar = this.h;
        int visibility = rjVar.getVisibility();
        mrc mrcVar = this.c;
        if (visibility == 8) {
            right = mrcVar.getRight();
        } else {
            right = rjVar.getRight();
        }
        float left = (1.0f - f2) * (width - ((mrcVar.getLeft() + right) / 2.0f));
        mrcVar.setTranslationX(left);
        rjVar.setTranslationX(left);
        mrcVar.setAlpha(f2);
        rjVar.setAlpha(f2);
        if (z && !this.x) {
            z2 = true;
        } else {
            z2 = false;
        }
        npcVar.setEnabled(z2);
        npcVar.setIntroProgress(f);
    }

    public final void f(android.text.Editable r37) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qrc.f(android.text.Editable):void");
    }

    public io getCurrencyView() {
        return this.h;
    }

    public npc getDiamondView() {
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
        mrc mrcVar = this.c;
        int baseline = mrcVar.getBaseline() + mrcVar.getTop();
        TextView textView = this.f;
        if (textView.getVisibility() == 0) {
            textView.setTranslationY(((baseline - this.e.getTop()) - textView.getTop()) - textView.getBaseline());
        }
        rj rjVar = this.h;
        rjVar.setTranslationY((baseline - rjVar.getTop()) - rjVar.getBaseline());
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
        rj rjVar;
        mrc mrcVar = this.c;
        if (mrcVar != null) {
            try {
                int v0 = cmb.v0(this.a, this.F);
                mrcVar.setCursorColor(v0);
                mrcVar.setHandlesColor(v0);
                if (this.G && (rjVar = this.h) != null) {
                    rjVar.c.v(v0, false);
                    rjVar.invalidate();
                }
            } catch (Exception e) {
                fc4.g(e, true);
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
