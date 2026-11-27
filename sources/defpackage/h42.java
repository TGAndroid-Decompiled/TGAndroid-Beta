package defpackage;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.ShapeDrawable;
import android.os.SystemClock;
import android.text.InputFilter;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.Wallet.c;
public final class h42 extends f12 implements fn7 {
    public float A0;
    public float B0;
    public boolean C0;
    public boolean D0;
    public final ShapeDrawable E;
    public boolean E0;
    public final t37 F;
    public float F0;
    public wm2 G;
    public float G0;
    public String H;
    public float H0;
    public byte[] I;
    public float I0;
    public boolean J;
    public float J0;
    public boolean K;
    public float K0;
    public boolean L;
    public boolean L0;
    public Activity M;
    public boolean M0;
    public int N;
    public boolean N0;
    public final d42 O;
    public boolean O0;
    public final LinearLayout P;
    public kt P0;
    public final FrameLayout Q;
    public TL_wallet.walletTransaction Q0;
    public final TextView R;
    public nrc R0;
    public final duc S;
    public quc S0;
    public final EditTextBoldCursor T;
    public boolean T0;
    public final in U;
    public id U0;
    public final TextView V;
    public boolean V0;
    public final p66 W;
    public DecimalFormat W0;
    public final TextView a0;
    public final TextView b0;
    public final SpannableString c0;
    public boolean d0;
    public boolean e0;
    public float f0;
    public ValueAnimator g0;
    public long h0;
    public boolean i0;
    public rj4 j0;
    public final FrameLayout k0;
    public final FrameLayout l0;
    public vpa m0;
    public final int n;
    public float n0;
    public float o0;
    public final c51 p0;
    public boolean q0;
    public final TLRPC.User r;
    public final SpannableString r0;
    public final FrameLayout s;
    public final SpannableString s0;
    public String t0;
    public boolean u0;
    public boolean v0;
    public final ktc w;
    public int w0;
    public final s7 x;
    public DecimalFormat x0;
    public final s7 y;
    public final int[] y0;
    public boolean z0;

    public h42(n12 n12Var, Context context, int i, TLRPC.User user, vnb vnbVar) {
        super(n12Var, vnbVar, context);
        this.h0 = -1L;
        this.n0 = 1.0f;
        this.o0 = 1.0f;
        this.u0 = true;
        this.w0 = 6;
        this.y0 = new int[2];
        this.n = i;
        this.r = user;
        FrameLayout frameLayout = new FrameLayout(context);
        this.s = frameLayout;
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        addView(frameLayout, tre.e(-1, -1, 55));
        s7 a = this.b.U2.u().a(31, 2131231247);
        this.x = a;
        a.setContentDescription(ob6.M0(2131754834, null));
        a.e(2, 2131232049, ob6.M0(2131742788, null));
        a.e(3, 2131231782, ob6.M0(2131742856, null));
        a.setVisibility(8);
        s7 s7Var = new s7(context, null, 0, aob.v0(aob.G6, this.a), false, vnbVar);
        this.y = s7Var;
        s7Var.setIcon(2131231247);
        s7Var.setContentDescription(ob6.M0(2131754834, null));
        int i2 = aob.i6;
        hf0 f0 = aob.f0(aob.v0(i2, this.a), 1, -1);
        uob M = yob.M(i2);
        s7Var.setBackground(f0);
        yob.j(s7Var, f0, null, M, vnbVar);
        s7Var.setOnClickListener(new ae(this, vnbVar, i, (byte) 5));
        ktc ktcVar = new ktc(vnbVar, context, new dy1(this, user, (byte) 16), new dy1(this, vnbVar, (byte) 17));
        this.w = ktcVar;
        ktcVar.a(this.H, user);
        addView(ktcVar, tre.d(-2, 64.0f, 49, 6.0f, 0.0f, 6.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setClipChildren(false);
        frameLayout2.setClipToPadding(false);
        frameLayout.addView(frameLayout2, tre.e(-1, -1, 55));
        ?? linearLayout = new LinearLayout(context);
        this.O = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setOnClickListener(new View.OnClickListener(this) {
            public final h42 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                h42 h42Var = this.b;
                switch (b) {
                    case 0:
                        h42Var.b0();
                        return;
                    case 1:
                        h42Var.Y();
                        return;
                    case 2:
                        h42Var.c0();
                        return;
                    case 3:
                        h42Var.b0();
                        return;
                    case 4:
                        h42Var.b0();
                        return;
                    case 5:
                        h42Var.b0();
                        return;
                    default:
                        h42Var.g0();
                        return;
                }
            }
        });
        frameLayout2.addView((View) linearLayout, tre.e(-1, -2, 17));
        duc ducVar = new duc(context, vnbVar);
        this.S = ducVar;
        ducVar.setOnClickListener(new View.OnClickListener(this) {
            public final h42 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                h42 h42Var = this.b;
                switch (b) {
                    case 0:
                        h42Var.b0();
                        return;
                    case 1:
                        h42Var.Y();
                        return;
                    case 2:
                        h42Var.c0();
                        return;
                    case 3:
                        h42Var.b0();
                        return;
                    case 4:
                        h42Var.b0();
                        return;
                    case 5:
                        h42Var.b0();
                        return;
                    default:
                        h42Var.g0();
                        return;
                }
            }
        });
        linearLayout.addView(ducVar, tre.t(-1, 64, 49, 16, 0, 16, 0));
        EditTextBoldCursor editText = ducVar.getEditText();
        this.T = editText;
        editText.setFilters(new InputFilter[]{new x32(this, (byte) 0)});
        editText.setImeOptions(33554438);
        editText.setOnTouchListener(new b7(this, (byte) 2));
        editText.setOnClickListener(new View.OnClickListener(this) {
            public final h42 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                h42 h42Var = this.b;
                switch (b) {
                    case 0:
                        h42Var.b0();
                        return;
                    case 1:
                        h42Var.Y();
                        return;
                    case 2:
                        h42Var.c0();
                        return;
                    case 3:
                        h42Var.b0();
                        return;
                    case 4:
                        h42Var.b0();
                        return;
                    case 5:
                        h42Var.b0();
                        return;
                    default:
                        h42Var.g0();
                        return;
                }
            }
        });
        editText.setOnEditorActionListener(new j(this, (byte) 6));
        editText.addTextChangedListener(new e42(this));
        SpannableString spannableString = new SpannableString("⇅");
        this.r0 = spannableString;
        wm2 wm2Var = new wm2(2131232839, 0);
        wm2Var.x = 0.72f;
        spannableString.setSpan(wm2Var, 0, spannableString.length(), 33);
        SpannableString spannableString2 = new SpannableString("G");
        this.s0 = spannableString2;
        wm2 wm2Var2 = new wm2(2131232843, 0);
        wm2Var2.d = false;
        spannableString2.setSpan(wm2Var2, 0, spannableString2.length(), 33);
        in inVar = new in(context, false, true, true, true, true);
        this.U = inVar;
        inVar.c.m(0.35f, 320L, 3.5f, k43.h);
        inVar.setScaleProperty(0.35f);
        inVar.setText(R(c.C(i), 0L));
        int i3 = aob.d6;
        int i4 = aob.z6;
        uob p = yob.p(i3, i4);
        yob.m(inVar, p.a, p.b, 4, 0.0f, vnbVar);
        inVar.setTextSize(hl.L(14.0f));
        inVar.setTypeface(hl.n1("fonts/gram.ttf"));
        inVar.setGravity(17);
        inVar.setPadding(hl.L(10.0f), 0, hl.L(10.0f), 0);
        inVar.setAllowCancel(true);
        ShapeDrawable b0 = aob.b0(hl.L(14.0f), aob.p1(0.08f, aob.v0(i4, this.a)));
        this.E = b0;
        inVar.setSizeableBackground(b0);
        linearLayout.addView(inVar, tre.t(-2, 28, 49, 0, 8, 0, 0));
        iye.a(inVar);
        inVar.setOnClickListener(new View.OnClickListener(this) {
            public final h42 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                h42 h42Var = this.b;
                switch (b) {
                    case 0:
                        h42Var.b0();
                        return;
                    case 1:
                        h42Var.Y();
                        return;
                    case 2:
                        h42Var.c0();
                        return;
                    case 3:
                        h42Var.b0();
                        return;
                    case 4:
                        h42Var.b0();
                        return;
                    case 5:
                        h42Var.b0();
                        return;
                    default:
                        h42Var.g0();
                        return;
                }
            }
        });
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.Q = frameLayout3;
        linearLayout.addView(frameLayout3, tre.r(-2, -2, 49));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.P = linearLayout2;
        linearLayout2.setOrientation(1);
        frameLayout3.addView(linearLayout2, tre.e(-2, -2, 49));
        TextView textView = new TextView(context);
        this.R = textView;
        textView.setTextSize(1, 14.0f);
        yob.X(textView, i4, vnbVar);
        textView.setPadding(hl.L(10.0f), 0, hl.L(10.0f), 0);
        uh9.q(textView, 17, null, 2131742638);
        frameLayout3.addView(textView, tre.d(-2, 28.0f, 49, 0.0f, 8.0f, 0.0f, 0.0f));
        iye.a(textView);
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final h42 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                h42 h42Var = this.b;
                switch (b) {
                    case 0:
                        h42Var.b0();
                        return;
                    case 1:
                        h42Var.Y();
                        return;
                    case 2:
                        h42Var.c0();
                        return;
                    case 3:
                        h42Var.b0();
                        return;
                    case 4:
                        h42Var.b0();
                        return;
                    case 5:
                        h42Var.b0();
                        return;
                    default:
                        h42Var.g0();
                        return;
                }
            }
        });
        linearLayout2.setVisibility(4);
        linearLayout2.setAlpha(0.0f);
        linearLayout2.setScaleX(0.8f);
        linearLayout2.setScaleY(0.8f);
        textView.setVisibility(0);
        textView.setAlpha(1.0f);
        textView.setScaleX(1.0f);
        textView.setScaleY(1.0f);
        this.V0 = false;
        TextView textView2 = new TextView(context);
        this.V = textView2;
        t37 t37Var = new t37(0, true, false, null);
        this.F = t37Var;
        t37Var.x = false;
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = t37Var.c;
        paint.setStyle(style);
        paint.setStrokeWidth(Math.max(1.0f, hl.N(0.5f)));
        int i5 = aob.bm;
        paint.setColor(aob.v0(i5, this.a));
        t37Var.w = Integer.valueOf(aob.v0(i5, this.a));
        textView2.setPadding(hl.L(15.0f), hl.L(7.0f), hl.L(19.0f), hl.L(8.0f));
        textView2.setBackground(t37Var);
        textView2.setTextSize(1, 14.0f);
        yob.X(textView2, i4, vnbVar);
        textView2.setTypeface(hl.o());
        textView2.setVisibility(8);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setMaxLines(4);
        linearLayout2.addView(textView2, tre.t(-2, -2, 49, 32, 12, 32, 0));
        textView2.setOnClickListener(new View.OnClickListener(this) {
            public final h42 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                h42 h42Var = this.b;
                switch (b) {
                    case 0:
                        h42Var.b0();
                        return;
                    case 1:
                        h42Var.Y();
                        return;
                    case 2:
                        h42Var.c0();
                        return;
                    case 3:
                        h42Var.b0();
                        return;
                    case 4:
                        h42Var.b0();
                        return;
                    case 5:
                        h42Var.b0();
                        return;
                    default:
                        h42Var.g0();
                        return;
                }
            }
        });
        iye.b(textView2, 0.02f, 1.2f);
        p66 p66Var = new p66(context, vnbVar);
        this.W = p66Var;
        yob.X(p66Var, aob.q7, vnbVar);
        yob.G(p66Var, aob.Fi, vnbVar);
        p66Var.setTextSize(1, 14.0f);
        p66Var.setGravity(17);
        p66Var.setTypeface(hl.o());
        p66Var.setPadding(hl.L(10.0f), 0, hl.L(10.0f), 0);
        e0(false);
        linearLayout2.addView(p66Var, tre.t(-2, -2, 49, 0, 10, 0, 0));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.k0 = frameLayout4;
        frameLayout4.setPadding(hl.L(16.0f), 0, hl.L(16.0f), hl.L(12.0f));
        FrameLayout frameLayout5 = new FrameLayout(context);
        this.l0 = frameLayout5;
        frameLayout4.setClipChildren(false);
        frameLayout4.setClipToPadding(false);
        frameLayout5.setClipChildren(false);
        frameLayout5.setClipToPadding(false);
        frameLayout4.addView(frameLayout5, tre.c(-1.0f, -1));
        TextView textView3 = new TextView(context);
        this.a0 = textView3;
        yob.X(textView3, i4, vnbVar);
        textView3.setTextSize(1, 14.0f);
        textView3.setGravity(17);
        frameLayout5.addView(textView3, tre.e(-1, 20, 55));
        TextView textView4 = new TextView(context);
        this.b0 = textView4;
        yob.X(textView4, i4, vnbVar);
        textView4.setTextSize(1, 14.0f);
        textView4.setGravity(17);
        textView4.setPadding(0, hl.L(4.0f), 0, hl.L(4.0f));
        textView4.setVisibility(8);
        frameLayout5.addView(textView4, tre.d(-1, -2.0f, 55, 0.0f, 24.0f, 0.0f, 0.0f));
        SpannableString spannableString3 = new SpannableString(ob6.M0(2131748533, null));
        this.c0 = spannableString3;
        spannableString3.setSpan(new ya6(hl.L(80.0f), textView4), 0, spannableString3.length(), 33);
        c51 i6 = xnb.i(24, vnbVar, context, true);
        this.p0 = i6;
        i6.setText(ob6.M0(2131742651, null));
        i6.setEnabled(false);
        i6.setOnClickListener(new View.OnClickListener(this) {
            public final h42 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                h42 h42Var = this.b;
                switch (b) {
                    case 0:
                        h42Var.b0();
                        return;
                    case 1:
                        h42Var.Y();
                        return;
                    case 2:
                        h42Var.c0();
                        return;
                    case 3:
                        h42Var.b0();
                        return;
                    case 4:
                        h42Var.b0();
                        return;
                    case 5:
                        h42Var.b0();
                        return;
                    default:
                        h42Var.g0();
                        return;
                }
            }
        });
        frameLayout5.addView(i6, tre.e(-1, 48, 87));
        frameLayout.addView(frameLayout4, tre.d(-1, 92.0f, 87, 0.0f, 0.0f, 0.0f, 70.0f));
        n0(false, false);
        jn7.f(i).b(this, jn7.d4);
        i0();
        this.J = true;
        c.C(i).k0(user, new z32(this, (byte) 0));
    }

    public static int Q(BigDecimal bigDecimal) {
        if (bigDecimal.signum() <= 0) {
            return 9;
        }
        BigDecimal movePointLeft = bigDecimal.movePointLeft(9);
        int i = 0;
        for (BigDecimal movePointLeft2 = BigDecimal.ONE.movePointLeft(1); movePointLeft2.compareTo(movePointLeft) >= 0; movePointLeft2 = movePointLeft2.movePointLeft(1)) {
            i++;
        }
        return i;
    }

    public static String S(long j) {
        BigDecimal stripTrailingZeros;
        BigDecimal scale = BigDecimal.valueOf(j).movePointLeft(9).setScale(2, RoundingMode.HALF_UP);
        if (scale.signum() == 0) {
            stripTrailingZeros = new BigDecimal(BigInteger.ZERO, 0);
        } else {
            stripTrailingZeros = scale.stripTrailingZeros();
        }
        return stripTrailingZeros.toPlainString();
    }

    public static BigDecimal Z(String str) {
        if (TextUtils.isEmpty(str)) {
            return BigDecimal.ZERO;
        }
        try {
            BigDecimal bigDecimal = new BigDecimal(str.replace(',', '.'));
            if (bigDecimal.signum() < 0) {
                return BigDecimal.ZERO;
            }
            return bigDecimal;
        } catch (NumberFormatException unused) {
            return BigDecimal.ZERO;
        }
    }

    public static void d0(SpannableStringBuilder spannableStringBuilder, int i, int i2, char c) {
        int i3 = i + 1;
        while (true) {
            int i4 = i3 + 1;
            if (i4 < i2) {
                if (spannableStringBuilder.charAt(i3) == c && Character.isDigit(spannableStringBuilder.charAt(i3 - 1)) && Character.isDigit(spannableStringBuilder.charAt(i4))) {
                    int i5 = i4;
                    while (i5 < i2 && Character.isDigit(spannableStringBuilder.charAt(i5))) {
                        i5++;
                    }
                    spannableStringBuilder.setSpan(new RelativeSizeSpan(0.85714287f), i4, i5, 33);
                    return;
                }
                i3 = i4;
            } else {
                return;
            }
        }
    }

    private float getBottomYOnScreen() {
        return T(this.k0);
    }

    private char getCurrencyDecimalSeparator() {
        TL_wallet.currencyRate selectedCurrencyRate = getSelectedCurrencyRate();
        if (selectedCurrencyRate != null && !TextUtils.isEmpty(selectedCurrencyRate.decimalSeparator)) {
            return selectedCurrencyRate.decimalSeparator.charAt(0);
        }
        return '.';
    }

    private int getCurrencyFractionDigits() {
        TL_wallet.currencyRate selectedCurrencyRate = getSelectedCurrencyRate();
        if (selectedCurrencyRate != null) {
            return selectedCurrencyRate.exp;
        }
        if (TextUtils.equals(c.C(this.n).h.g(), "USD")) {
            return 2;
        }
        return 0;
    }

    private BigDecimal getCurrencyPerGram() {
        c C = c.C(this.n);
        C.h.f();
        double h = C.h.h();
        double d = uc7.s1(this.n).l4.k.i;
        if (h > 0.0d && d > 0.0d && !Double.isNaN(h) && !Double.isInfinite(h) && !Double.isNaN(d) && !Double.isInfinite(d)) {
            return BigDecimal.valueOf(h).multiply(BigDecimal.valueOf(d));
        }
        return BigDecimal.ZERO;
    }

    private long getGramNanoAmount() {
        BigDecimal Z = Z(this.T.getText().toString());
        if (this.v0) {
            BigDecimal currencyPerGram = getCurrencyPerGram();
            if (currencyPerGram.signum() <= 0) {
                return 0L;
            }
            Z = Z.divide(currencyPerGram, 9, RoundingMode.DOWN).setScale(2, RoundingMode.HALF_UP);
        }
        BigInteger bigInteger = Z.movePointRight(9).toBigInteger();
        if (bigInteger.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) > 0) {
            return Long.MAX_VALUE;
        }
        return bigInteger.longValue();
    }

    private String getGramsText() {
        long gramNanoAmount = getGramNanoAmount();
        DecimalFormat decimalFormat = this.W0;
        if (decimalFormat == null) {
            decimalFormat = new DecimalFormat("#,##0.#########", new DecimalFormatSymbols(Locale.US));
            this.W0 = decimalFormat;
        }
        if (gramNanoAmount > 0) {
            return decimalFormat.format(BigDecimal.valueOf(gramNanoAmount, 9));
        }
        return "";
    }

    private TL_wallet.currencyRate getSelectedCurrencyRate() {
        s43 s43Var = c.C(this.n).h;
        TL_wallet.currencyRates f = s43Var.f();
        if (f == null) {
            return null;
        }
        ArrayList<TL_wallet.currencyRate> arrayList = f.rates;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            TL_wallet.currencyRate currencyrate = arrayList.get(i);
            i++;
            TL_wallet.currencyRate currencyrate2 = currencyrate;
            if (currencyrate2 != null && TextUtils.equals(currencyrate2.currency, s43Var.g())) {
                return currencyrate2;
            }
        }
        return null;
    }

    private void setFeeVisibilityProgress(float f) {
        int i;
        this.f0 = f;
        TextView textView = this.b0;
        textView.setAlpha(f);
        if (f > 0.0f) {
            i = 0;
        } else {
            i = 8;
        }
        textView.setVisibility(i);
        requestLayout();
    }

    @Override
    public final void A(int i, boolean z) {
        float f;
        float bottomYOnScreen;
        float T;
        this.C0 = true;
        this.L0 = false;
        this.D0 = z;
        if (z) {
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        this.B0 = f;
        if (this.E0) {
            bottomYOnScreen = this.F0;
        } else {
            bottomYOnScreen = getBottomYOnScreen();
        }
        this.J0 = bottomYOnScreen;
        boolean z2 = this.E0;
        ktc ktcVar = this.w;
        if (z2) {
            T = this.G0;
        } else {
            T = T(ktcVar);
        }
        this.H0 = T;
        this.K0 = getBottomYOnScreen() - this.k0.getTranslationY();
        this.I0 = T(ktcVar) - ktcVar.getTranslationY();
        m0();
    }

    @Override
    public final void B() {
        O();
        f0();
    }

    @Override
    public final void C(int i, int i2) {
        boolean z;
        int L;
        int i3;
        int L2;
        n12 n12Var = this.b;
        if (n12Var.o3.Q() > hl.L(20.0f)) {
            z = true;
        } else {
            z = false;
        }
        this.z0 = z;
        this.f = z;
        if (z) {
            L = 0;
        } else {
            L = hl.L(70.0f);
        }
        int round = Math.round(hl.L(32.0f) * this.f0) + hl.L(92.0f);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.k0.getLayoutParams();
        layoutParams.height = round;
        layoutParams.bottomMargin = L;
        if (this.z0) {
            i3 = hl.L(56.0f);
            n12Var.r0 = false;
        } else {
            if (!hl.O1()) {
                Point point = hl.q;
                if (point.x > point.y) {
                    i3 = (int) (i2 / 3.5f);
                    n12Var.r0 = true;
                }
            }
            i3 = (i2 / 5) << 1;
            n12Var.r0 = true;
        }
        int d = c00.d(1.0f, i3, 0) + hl.m;
        FrameLayout frameLayout = this.s;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
        if (layoutParams2.topMargin != d) {
            layoutParams2.topMargin = d;
            frameLayout.setLayoutParams(layoutParams2);
        }
        int e = qu6.e(4.0f, d - hl.m, 0);
        ktc ktcVar = this.w;
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) ktcVar.getLayoutParams();
        if (this.z0) {
            L2 = hl.L(4.0f) + a.getCurrentActionBarHeight();
        } else {
            L2 = e - hl.L(4.0f);
        }
        int max = Math.max(0, L2);
        if (layoutParams3.topMargin != max) {
            layoutParams3.topMargin = max;
            ktcVar.setLayoutParams(layoutParams3);
        }
        j0();
    }

    @Override
    public final void H(f12 f12Var) {
        Activity W;
        O();
        if (this.M == null && !hl.O1()) {
            Point point = hl.q;
            if (Math.min(point.x, point.y) < hl.L(700.0f) && (W = hl.W(getContext())) != null) {
                try {
                    this.N = W.getRequestedOrientation();
                    W.setRequestedOrientation(1);
                    this.M = W;
                } catch (Exception e) {
                    cc4.g(e, true);
                }
            }
        }
        this.M0 = false;
        this.O0 = false;
        EditTextBoldCursor editTextBoldCursor = this.T;
        editTextBoldCursor.setFocusableInTouchMode(true);
        editTextBoldCursor.setShowSoftInputOnFocus(true);
        this.N0 = false;
        this.C0 = false;
        this.L0 = false;
        float f = 0.0f;
        this.O.setTranslationY(0.0f);
        this.k0.setTranslationY(0.0f);
        ktc ktcVar = this.w;
        ktcVar.setTranslationY(0.0f);
        ktcVar.setAlpha(1.0f);
        this.E0 = false;
        n12 n12Var = this.b;
        n12Var.U2.setTitle(ob6.M0(2131742647, null));
        n12Var.U2.setDrawGlassTitle(false);
        this.x.setVisibility(0);
        editTextBoldCursor.clearFocus();
        X();
        duc ducVar = this.S;
        if (ducVar.getDiamondView().f == null) {
            f = 1.0f;
        }
        this.o0 = f;
        this.n0 = f;
        l0();
        if (this.n0 < 1.0f) {
            ducVar.getDiamondView().l(new a42(this, (byte) 3));
        }
    }

    @Override
    public final void I() {
        this.M0 = true;
        post(new a42(this, (byte) 4));
    }

    @Override
    public final boolean N() {
        return !this.O0;
    }

    public final void O() {
        this.S.getDiamondView().l(null);
        vpa vpaVar = this.m0;
        if (vpaVar != null) {
            vpaVar.d();
        }
        this.n0 = 1.0f;
        l0();
    }

    public final String P(long j, BigDecimal bigDecimal) {
        BigDecimal stripTrailingZeros;
        BigDecimal movePointLeft = BigDecimal.valueOf(j).multiply(bigDecimal).movePointLeft(9);
        int max = Math.max(0, Math.min(getCurrencyFractionDigits(), 20));
        RoundingMode roundingMode = RoundingMode.HALF_UP;
        BigDecimal scale = movePointLeft.setScale(max, roundingMode);
        if (scale.signum() == 0 && movePointLeft.signum() != 0) {
            scale = movePointLeft.setScale(Math.min(20, Math.max(max, movePointLeft.scale())), roundingMode);
        }
        int Q = Q(bigDecimal);
        if (scale.scale() > Q) {
            scale = scale.setScale(Q, RoundingMode.DOWN);
        }
        BigDecimal multiply = BigDecimal.valueOf(Long.MAX_VALUE, 9).multiply(bigDecimal);
        if (scale.compareTo(multiply) > 0) {
            scale = multiply.setScale(scale.scale(), RoundingMode.DOWN);
        }
        if (scale.signum() == 0) {
            stripTrailingZeros = new BigDecimal(BigInteger.ZERO, 0);
        } else {
            stripTrailingZeros = scale.stripTrailingZeros();
        }
        return stripTrailingZeros.toPlainString();
    }

    public final SpannableStringBuilder R(c cVar, long j) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("≈ ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append(cVar.q(j, false));
        d0(spannableStringBuilder, length, spannableStringBuilder.length(), getCurrencyDecimalSeparator());
        return spannableStringBuilder.append((CharSequence) " ").append((CharSequence) this.r0);
    }

    public final float T(View view) {
        float f = 0.0f;
        while (view.getParent() instanceof View) {
            View view2 = (View) view.getParent();
            f += view.getY() - view2.getScrollY();
            view = view2;
        }
        int[] iArr = this.y0;
        view.getLocationOnScreen(iArr);
        return ((f + iArr[1]) + this.A0) - this.b.s2;
    }

    public final float U(View view) {
        if (view.getVisibility() == 0 && view.getAlpha() > 0.0f) {
            return ((1.0f - view.getScaleY()) * view.getPivotY()) + (T(view) - this.l0.getTranslationY());
        }
        return Float.POSITIVE_INFINITY;
    }

    public final CharSequence V(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        StringBuilder sb = new StringBuilder();
        sb.append(spanned.subSequence(0, i3).toString());
        sb.append((Object) charSequence.subSequence(i, i2));
        sb.append((Object) spanned.subSequence(i4, spanned.length()));
        String sb2 = sb.toString();
        int i5 = 9;
        BigDecimal valueOf = BigDecimal.valueOf(Long.MAX_VALUE, 9);
        if (this.v0) {
            BigDecimal currencyPerGram = getCurrencyPerGram();
            valueOf = valueOf.multiply(currencyPerGram);
            i5 = Q(currencyPerGram);
        }
        int max = Math.max(sb2.indexOf(46), sb2.indexOf(44));
        if (max >= 0 && (sb2.length() - max) - 1 > i5) {
            return spanned.subSequence(i3, i4);
        }
        if (Z(sb2).compareTo(valueOf) > 0) {
            return spanned.subSequence(i3, i4);
        }
        if (i != i2) {
            boolean z = false;
            for (int i6 = 0; i6 < sb2.length(); i6++) {
                char charAt = sb2.charAt(i6);
                if (charAt == '.' || charAt == ',') {
                    if (z) {
                        return spanned.subSequence(i3, i4);
                    }
                    z = true;
                }
            }
            if (i3 == 0 && (sb2.startsWith(".") || sb2.startsWith(","))) {
                return "0" + ((Object) charSequence.subSequence(i, i2));
            } else if (sb2.startsWith("00")) {
                return spanned.subSequence(i3, i4);
            } else {
                return null;
            }
        }
        return null;
    }

    public final void W(ValueAnimator valueAnimator) {
        setFeeVisibilityProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public final void X() {
        if (!this.L && !TextUtils.isEmpty(this.H)) {
            rj4 rj4Var = this.j0;
            byte[] bArr = null;
            if (rj4Var != null) {
                rj4Var.run();
                this.j0 = null;
            }
            this.h0 = -1L;
            i0();
            c C = c.C(this.n);
            if (this.i0) {
                String str = this.H;
                long max = Math.max(100000000L, getGramNanoAmount());
                String str2 = this.t0;
                if (this.u0) {
                    bArr = getPublicKey();
                }
                this.j0 = C.l(str, max, str2, bArr, new z32(this, (byte) 1));
            }
        }
    }

    public final void Y() {
        if (!this.L && !this.O0 && this.P0 == null && this.U0 == null) {
            b0();
            kt ktVar = new kt(this, SystemClock.uptimeMillis() + 1500, (byte) 7);
            this.P0 = ktVar;
            post(ktVar);
        }
    }

    public final void a0() {
        if (this.M0 && !this.C0 && !this.L0 && isAttachedToWindow() && Math.abs(getTranslationY()) < 0.5f && this.O.getHeight() > 0 && this.k0.getHeight() > 0) {
            this.F0 = getBottomYOnScreen();
            this.G0 = T(this.w);
            this.E0 = true;
        }
    }

    public final void b0() {
        if (!this.L && !this.O0) {
            n12 n12Var = this.b;
            if (!n12Var.J) {
                if (!this.M0) {
                    this.N0 = true;
                    return;
                }
                this.N0 = false;
                EditTextBoldCursor editTextBoldCursor = this.T;
                editTextBoldCursor.setFocusableInTouchMode(true);
                editTextBoldCursor.setShowSoftInputOnFocus(true);
                n12Var.d1(editTextBoldCursor, true);
                editTextBoldCursor.requestFocus();
                hl.E3(editTextBoldCursor);
                editTextBoldCursor.postDelayed(new a42(this, (byte) 1), 220L);
            }
        }
    }

    public final void c0() {
        boolean z;
        String S;
        c51 c51Var = this.p0;
        if (c51Var.e0 && !c51Var.R) {
            c C = c.C(this.n);
            long gramNanoAmount = getGramNanoAmount();
            long z2 = C.z();
            if (WalletEngine2.isValidAddress(this.H) && gramNanoAmount > 0) {
                long f = uc7.s1(this.n).l4.x0.f();
                byte[] bArr = null;
                if (gramNanoAmount < f) {
                    if (this.v0) {
                        S = P(f, getCurrencyPerGram());
                    } else {
                        S = S(f);
                    }
                    this.T.setText(S);
                    this.T.setSelection(S.length());
                    EditTextBoldCursor editTextBoldCursor = this.T;
                    int i = -this.w0;
                    this.w0 = i;
                    hl.A3(i, editTextBoldCursor, null);
                } else if (gramNanoAmount > z2) {
                    yw0.APP_ERROR.a();
                    p66 p66Var = this.W;
                    int i2 = -this.w0;
                    this.w0 = i2;
                    hl.A3(i2, p66Var, null);
                } else {
                    uc7 s1 = uc7.s1(this.n);
                    long M1 = s1.M1(this.r.id);
                    if (s1.l4.w0.f && M1 > 0 && (gramNanoAmount / 1.0E9d) * s1.l4.k.i < (M1 / 1000.0d) * s1.l4.A3.i) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.T0 = z;
                    this.p0.setLoading(true);
                    this.O0 = true;
                    this.N0 = false;
                    kt ktVar = this.P0;
                    if (ktVar != null) {
                        removeCallbacks(ktVar);
                        this.P0 = null;
                    }
                    this.Q0 = null;
                    TLRPC.User user = this.r;
                    String str = this.H;
                    String str2 = this.t0;
                    if (this.u0) {
                        bArr = getPublicKey();
                    }
                    C.n0(user, str, gramNanoAmount, str2, bArr, null, null, new pcc(this) {
                        public final h42 b;

                        {
                            this.b = this;
                        }

                        @Override
                        public final void a(Object obj) {
                            byte b = r2;
                            h42 h42Var = this.b;
                            switch (b) {
                                case 0:
                                    String str3 = (String) obj;
                                    c51 c51Var2 = h42Var.p0;
                                    n12 n12Var = h42Var.b;
                                    if (!h42Var.L && !n12Var.J) {
                                        if (c.K(str3)) {
                                            c51Var2.setLoading(false);
                                            h42Var.O0 = false;
                                            return;
                                        } else if (TextUtils.isEmpty(str3)) {
                                            n12Var.dismiss();
                                            return;
                                        } else {
                                            c51Var2.setLoading(false);
                                            h42Var.O0 = false;
                                            d31.Y().f0(str3, false);
                                            return;
                                        }
                                    }
                                    return;
                                default:
                                    h42Var.Q0 = (TL_wallet.walletTransaction) obj;
                                    return;
                            }
                        }
                    }, new pcc(this) {
                        public final h42 b;

                        {
                            this.b = this;
                        }

                        @Override
                        public final void a(Object obj) {
                            byte b = r2;
                            h42 h42Var = this.b;
                            switch (b) {
                                case 0:
                                    String str3 = (String) obj;
                                    c51 c51Var2 = h42Var.p0;
                                    n12 n12Var = h42Var.b;
                                    if (!h42Var.L && !n12Var.J) {
                                        if (c.K(str3)) {
                                            c51Var2.setLoading(false);
                                            h42Var.O0 = false;
                                            return;
                                        } else if (TextUtils.isEmpty(str3)) {
                                            n12Var.dismiss();
                                            return;
                                        } else {
                                            c51Var2.setLoading(false);
                                            h42Var.O0 = false;
                                            d31.Y().f0(str3, false);
                                            return;
                                        }
                                    }
                                    return;
                                default:
                                    h42Var.Q0 = (TL_wallet.walletTransaction) obj;
                                    return;
                            }
                        }
                    });
                }
            }
        }
    }

    @Override
    public final void d() {
        try {
            s7 s7Var = this.y;
            vnb vnbVar = this.a;
            if (s7Var != null) {
                s7Var.setIconColor(aob.v0(aob.G6, vnbVar));
            }
            ShapeDrawable shapeDrawable = this.E;
            if (shapeDrawable != null) {
                aob.A1(aob.p1(0.08f, aob.v0(aob.z6, vnbVar)), shapeDrawable);
                in inVar = this.U;
                if (inVar != null) {
                    inVar.invalidate();
                }
            }
            t37 t37Var = this.F;
            if (t37Var != null) {
                int v0 = aob.v0(aob.bm, vnbVar);
                t37Var.c.setColor(v0);
                t37Var.w = Integer.valueOf(v0);
                TextView textView = this.V;
                if (textView != null) {
                    textView.invalidate();
                }
            }
            wm2 wm2Var = this.G;
            if (wm2Var != null) {
                wm2Var.y = aob.v0(aob.Fi, vnbVar);
                p66 p66Var = this.W;
                if (p66Var != null) {
                    p66Var.invalidate();
                }
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == jn7.d4) {
            boolean z = this.i0;
            h0();
            if (z != this.i0) {
                X();
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        this.b.U2.getAlpha();
        k0();
        if (this.m0 != null || this.n0 < 1.0f) {
            l0();
        }
        super.dispatchDraw(canvas);
        a0();
    }

    public final void e0(boolean z) {
        float f;
        float f2 = 0.0f;
        p66 p66Var = this.W;
        if (z) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) ob6.M0(2131742734, null));
            spannableStringBuilder.append((CharSequence) " ");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) ob6.M0(2131742788, null));
            spannableStringBuilder.append((CharSequence) " >");
            wm2 wm2Var = new wm2(2131232713, 0);
            wm2Var.y = aob.v0(aob.Fi, this.a);
            float N = hl.N(0.66f);
            wm2Var.r = 0.0f;
            wm2Var.s = N;
            this.G = wm2Var;
            spannableStringBuilder.setSpan(wm2Var, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            spannableStringBuilder.setSpan(new a31(this, (byte) 4), length, spannableStringBuilder.length(), 33);
            p66Var.setText(spannableStringBuilder);
        }
        ViewPropertyAnimator animate = p66Var.animate();
        float f3 = 1.0f;
        if (z) {
            f2 = 1.0f;
        }
        ViewPropertyAnimator alpha = animate.alpha(f2);
        if (z) {
            f = 1.0f;
        } else {
            f = 0.6f;
        }
        ViewPropertyAnimator scaleX = alpha.scaleX(f);
        if (!z) {
            f3 = 0.6f;
        }
        scaleX.scaleY(f3).setDuration(320L).setInterpolator(k43.h).start();
    }

    public final void f0() {
        if (this.O0 && !this.L) {
            this.N0 = false;
            EditTextBoldCursor editTextBoldCursor = this.T;
            editTextBoldCursor.setShowSoftInputOnFocus(false);
            editTextBoldCursor.setFocusable(false);
            editTextBoldCursor.clearFocus();
            setFocusableInTouchMode(true);
            requestFocus();
        }
    }

    public final void g0() {
        String S;
        BigDecimal currencyPerGram = getCurrencyPerGram();
        if (!this.v0 && currencyPerGram.signum() <= 0) {
            return;
        }
        long gramNanoAmount = getGramNanoAmount();
        this.v0 = !this.v0;
        this.S.d(c.C(this.n), this.v0);
        if (gramNanoAmount <= 0) {
            S = "";
        } else if (this.v0) {
            S = P(gramNanoAmount, currencyPerGram);
        } else {
            S = S(gramNanoAmount);
        }
        EditTextBoldCursor editTextBoldCursor = this.T;
        editTextBoldCursor.setText(S);
        editTextBoldCursor.setSelection(S.length());
    }

    @Override
    public int getButtonsHideOffset() {
        return hl.L(62.0f);
    }

    @Override
    public int getCurrentItemTop() {
        int top = this.s.getTop();
        if (top <= 0) {
            top = getListTopPadding();
        }
        return hl.L(13.0f) + Math.max(0, top - (hl.L(12.0f) + hl.m));
    }

    @Override
    public int getCustomBackground() {
        return aob.v0(aob.d6, this.a);
    }

    @Override
    public int getFirstOffset() {
        return hl.L(5.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.s.getLayoutParams();
        if (layoutParams == null) {
            return 0;
        }
        return layoutParams.topMargin;
    }

    public byte[] getPublicKey() {
        if (this.I == null) {
            return null;
        }
        int i = 0;
        while (true) {
            byte[] bArr = this.I;
            if (i >= bArr.length) {
                return null;
            }
            if (bArr[i] != 0) {
                return bArr;
            }
            i++;
        }
    }

    public final void h0() {
        boolean z;
        boolean z2;
        boolean z3;
        CharSequence V;
        SpannableStringBuilder R;
        String S;
        j0();
        int i = this.n;
        c C = c.C(i);
        long z4 = C.z();
        long gramNanoAmount = getGramNanoAmount();
        long f = uc7.s1(i).l4.x0.f();
        int i2 = (gramNanoAmount > 0L ? 1 : (gramNanoAmount == 0L ? 0 : -1));
        EditTextBoldCursor editTextBoldCursor = this.T;
        if (i2 > 0 && gramNanoAmount < f) {
            if (this.v0) {
                S = P(f, getCurrencyPerGram());
            } else {
                S = S(f);
            }
            editTextBoldCursor.setText(S);
            editTextBoldCursor.setSelection(S.length());
            int i3 = -this.w0;
            this.w0 = i3;
            hl.A3(i3, editTextBoldCursor, null);
            return;
        }
        boolean z5 = false;
        if (WalletEngine2.isValidAddress(this.H) && gramNanoAmount <= z4) {
            z = true;
        } else {
            z = false;
        }
        if (!TextUtils.isEmpty(editTextBoldCursor.getText()) && gramNanoAmount > z4) {
            z2 = true;
        } else {
            z2 = false;
        }
        e0(z2);
        String gramsText = getGramsText();
        if (this.H == null && this.J) {
            z3 = true;
        } else {
            z3 = false;
        }
        c51 c51Var = this.p0;
        c51Var.setLoading(z3);
        if (TextUtils.isEmpty(gramsText)) {
            V = ob6.M0(2131742651, null);
        } else {
            V = ob6.V(null, null, 2131742652, c.p("Grams", gramsText, 2131749261));
        }
        c51Var.i(V, true, true);
        boolean isEmpty = TextUtils.isEmpty(editTextBoldCursor.getText());
        boolean z6 = !isEmpty;
        if (!isEmpty && z && !this.K) {
            z5 = true;
        }
        c51Var.setEnabled(z5);
        n0(z6, this.M0);
        i0();
        this.S.d(c.C(i), this.v0);
        if (this.v0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) this.s0).append((CharSequence) " ");
            int length = spannableStringBuilder.length();
            if (this.x0 == null) {
                DecimalFormat decimalFormat = new DecimalFormat("#,##0.##", new DecimalFormatSymbols(Locale.US));
                this.x0 = decimalFormat;
                decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
            }
            spannableStringBuilder.append((CharSequence) this.x0.format(BigDecimal.valueOf(gramNanoAmount).movePointLeft(9)));
            d0(spannableStringBuilder, length, spannableStringBuilder.length(), '.');
            spannableStringBuilder.append((CharSequence) " ");
            int length2 = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) ob6.M0(2131749287, null));
            spannableStringBuilder.setSpan(new RelativeSizeSpan(0.85714287f), length2, spannableStringBuilder.length(), 33);
            R = spannableStringBuilder.append((CharSequence) " ").append((CharSequence) this.r0);
        } else {
            R = R(C, gramNanoAmount);
        }
        this.U.setText(R);
    }

    public final void i0() {
        boolean z;
        boolean z2;
        float f;
        int i = this.n;
        c C = c.C(i);
        this.a0.setText(ob6.V(null, null, 2131742836, c.p("Grams", c.t(C.z(), true), 2131749261)));
        long f2 = uc7.s1(i).l4.x0.f();
        if (!C.L() && C.z() >= f2) {
            z = true;
        } else {
            z = false;
        }
        this.i0 = z;
        boolean z3 = this.e0 | (!TextUtils.isEmpty(this.T.getText()));
        this.e0 = z3;
        if (this.i0 && z3) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.d0 != z2) {
            this.d0 = z2;
            ValueAnimator valueAnimator = this.g0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.g0 = null;
            }
            if (z2) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            if (this.M0 && isAttachedToWindow()) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f0, f);
                this.g0 = ofFloat;
                ofFloat.setDuration(320L);
                this.g0.setInterpolator(k43.h);
                this.g0.addUpdateListener(new az1(this, (byte) 3));
                this.g0.start();
            } else {
                setFeeVisibilityProgress(f);
            }
        }
        long j = this.h0;
        int i2 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        TextView textView = this.b0;
        if (i2 >= 0) {
            textView.setText(ob6.V(null, null, 2131742722, c.w(j, false)));
        } else {
            textView.setText(ob6.V(null, null, 2131742722, this.c0));
        }
    }

    @Override
    public final int j() {
        return 1;
    }

    public final void j0() {
        TextView textView;
        final boolean z;
        float f;
        float f2;
        float f3;
        float f4;
        LinearLayout linearLayout = this.P;
        if (linearLayout != null && (textView = this.R) != null) {
            if (getGramNanoAmount() <= 0 && this.V.getVisibility() != 0 && !this.z0) {
                z = false;
            } else {
                z = true;
            }
            if (z != this.V0) {
                this.V0 = z;
                linearLayout.setVisibility(0);
                textView.setVisibility(0);
                ViewPropertyAnimator animate = linearLayout.animate();
                float f5 = 0.0f;
                float f6 = 1.0f;
                if (z) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                ViewPropertyAnimator alpha = animate.alpha(f);
                if (z) {
                    f2 = 1.0f;
                } else {
                    f2 = 0.8f;
                }
                ViewPropertyAnimator scaleX = alpha.scaleX(f2);
                if (z) {
                    f3 = 1.0f;
                } else {
                    f3 = 0.8f;
                }
                ViewPropertyAnimator duration = scaleX.scaleY(f3).withEndAction(new Runnable(this) {
                    public final h42 b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void run() {
                        byte b = r3;
                        int i = 4;
                        boolean z2 = z;
                        h42 h42Var = this.b;
                        switch (b) {
                            case 0:
                                LinearLayout linearLayout2 = h42Var.P;
                                if (z2) {
                                    i = 0;
                                }
                                linearLayout2.setVisibility(i);
                                return;
                            default:
                                TextView textView2 = h42Var.R;
                                if (!z2) {
                                    i = 0;
                                }
                                textView2.setVisibility(i);
                                return;
                        }
                    }
                }).setDuration(320L);
                k43 k43Var = k43.h;
                duration.setInterpolator(k43Var).start();
                ViewPropertyAnimator animate2 = textView.animate();
                if (!z) {
                    f5 = 1.0f;
                }
                ViewPropertyAnimator alpha2 = animate2.alpha(f5);
                if (!z) {
                    f4 = 1.0f;
                } else {
                    f4 = 0.8f;
                }
                ViewPropertyAnimator scaleX2 = alpha2.scaleX(f4);
                if (z) {
                    f6 = 0.8f;
                }
                scaleX2.scaleY(f6).withEndAction(new Runnable(this) {
                    public final h42 b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void run() {
                        byte b = r3;
                        int i = 4;
                        boolean z2 = z;
                        h42 h42Var = this.b;
                        switch (b) {
                            case 0:
                                LinearLayout linearLayout2 = h42Var.P;
                                if (z2) {
                                    i = 0;
                                }
                                linearLayout2.setVisibility(i);
                                return;
                            default:
                                TextView textView2 = h42Var.R;
                                if (!z2) {
                                    i = 0;
                                }
                                textView2.setVisibility(i);
                                return;
                        }
                    }
                }).setDuration(320L).setInterpolator(k43Var).start();
            }
        }
    }

    @Override
    public final boolean k() {
        if (this.b.o3.Q() <= hl.L(20.0f)) {
            return false;
        }
        this.N0 = false;
        kt ktVar = this.P0;
        if (ktVar != null) {
            removeCallbacks(ktVar);
            this.P0 = null;
        }
        EditTextBoldCursor editTextBoldCursor = this.T;
        editTextBoldCursor.clearFocus();
        hl.t1(editTextBoldCursor);
        return true;
    }

    public final void k0() {
        float f;
        View view = this.O;
        if (view.getHeight() > 0) {
            FrameLayout frameLayout = this.k0;
            if (frameLayout.getHeight() > 0) {
                View view2 = this.s;
                float T = T(view2);
                ktc ktcVar = this.w;
                if (ktcVar.getVisibility() == 0) {
                    f = Math.max(T, (ktcVar.getScaleY() * (ktcVar.getContentBottom() - ktcVar.getPivotY())) + ktcVar.getPivotY() + T(ktcVar));
                } else {
                    f = T;
                }
                float max = Math.max(0.0f, Math.min(Math.min(Math.min((T + view2.getHeight()) - ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).bottomMargin, U(this.a0)), U(this.b0)), U(this.p0)) - f);
                float min = Math.min(1.0f, Math.max(0.0f, max - (Math.min(hl.L(12.0f), max / 4.0f) * 2.0f)) / view.getHeight());
                view.setPivotX(view.getWidth() / 2.0f);
                view.setPivotY(view.getHeight() / 2.0f);
                view.setScaleX(min);
                view.setScaleY(min);
                float f2 = (max / 2.0f) + f;
                view.setTranslationY(f2 - ((view.getHeight() / 2.0f) + (T(view) - view.getTranslationY())));
            }
        }
    }

    public final void l0() {
        boolean z;
        float max = Math.max(this.o0, Math.max(0.0f, Math.min(1.0f, this.n0)));
        this.o0 = max;
        float f = 1.0f - max;
        float f2 = this.n0;
        if (this.m0 == null && f2 == 1.0f) {
            z = true;
        } else {
            z = false;
        }
        duc ducVar = this.S;
        ducVar.e(f2, max, z);
        ducVar.setTranslationY((1.0f - this.n0) * (((this.O.getHeight() / 2.0f) - ducVar.getTop()) - (ducVar.getHeight() / 2.0f)));
        float f3 = this.o0;
        in inVar = this.U;
        inVar.setAlpha(f3);
        inVar.setTranslationY(hl.L(16.0f) * f);
        float f4 = this.o0;
        FrameLayout frameLayout = this.Q;
        frameLayout.setAlpha(f4);
        frameLayout.setTranslationY(hl.L(16.0f) * f);
        float f5 = this.o0;
        FrameLayout frameLayout2 = this.l0;
        frameLayout2.setAlpha(f5);
        frameLayout2.setTranslationY(hl.L(24.0f) * f);
    }

    public final void m0() {
        if (this.C0 && this.O.getHeight() > 0) {
            FrameLayout frameLayout = this.k0;
            if (frameLayout.getHeight() > 0) {
                boolean z = this.D0;
                float f = this.B0;
                if (!z) {
                    f = 1.0f - f;
                }
                float f2 = this.J0;
                float A = qd4.A(this.K0, f2, f, f2);
                float f3 = this.H0;
                float A2 = qd4.A(this.I0, f3, f, f3);
                frameLayout.setTranslationY(A - (getBottomYOnScreen() - frameLayout.getTranslationY()));
                ktc ktcVar = this.w;
                ktcVar.setTranslationY(A2 - (T(ktcVar) - ktcVar.getTranslationY()));
                k0();
            }
        }
    }

    @Override
    public final void n(float f, float f2) {
        this.A0 = f;
        this.B0 = f2;
        m0();
    }

    public final void n0(boolean z, boolean z2) {
        float f;
        float f2;
        if (z2 && this.q0 == z) {
            return;
        }
        this.q0 = z;
        c51 c51Var = this.p0;
        c51Var.animate().cancel();
        TextView textView = this.a0;
        textView.animate().cancel();
        TextView textView2 = this.b0;
        textView2.animate().cancel();
        float f3 = 0.0f;
        if (z) {
            f2 = 1.0f;
            f = 1.0f;
        } else {
            f = 0.8f;
            f2 = 0.0f;
            f3 = hl.L(60.0f);
        }
        int i = 0;
        if (!z2) {
            if (!z) {
                i = 4;
            }
            c51Var.setVisibility(i);
            c51Var.setAlpha(f2);
            c51Var.setScaleX(f);
            c51Var.setScaleY(f);
            textView.setTranslationY(f3);
            textView2.setTranslationY(f3);
            return;
        }
        c51Var.setVisibility(0);
        ViewPropertyAnimator duration = c51Var.animate().alpha(f2).scaleX(f).scaleY(f).setDuration(320L);
        k43 k43Var = k43.h;
        duration.setInterpolator(k43Var).withEndAction(new a42(this, (byte) 5)).start();
        textView.animate().translationY(f3).setDuration(320L).setInterpolator(k43Var).start();
        textView2.animate().translationY(f3).setDuration(320L).setInterpolator(k43Var).start();
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.L0) {
            this.L0 = false;
            this.O.setTranslationY(0.0f);
            this.k0.setTranslationY(0.0f);
            this.w.setTranslationY(0.0f);
            a0();
        } else if (this.C0) {
            m0();
        }
        k0();
    }

    @Override
    public final void onWindowFocusChanged(boolean z) {
        if (!z) {
            f0();
        }
        super.onWindowFocusChanged(z);
    }

    @Override
    public final void p() {
        if (this.L) {
            return;
        }
        this.L = true;
        O();
        nrc nrcVar = this.R0;
        if (nrcVar != null) {
            AnimatorSet animatorSet = nrcVar.m;
            if (!nrcVar.v) {
                if (animatorSet.isStarted()) {
                    animatorSet.cancel();
                } else {
                    nrcVar.a(false);
                }
            }
            this.R0 = null;
        }
        quc qucVar = this.S0;
        if (qucVar != null) {
            AnimatorSet animatorSet2 = qucVar.m;
            if (!qucVar.s) {
                if (animatorSet2.isStarted()) {
                    animatorSet2.cancel();
                } else {
                    qucVar.b();
                }
            }
            this.S0 = null;
        }
        ValueAnimator valueAnimator = this.g0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.g0 = null;
        }
        Activity activity = this.M;
        if (activity != null) {
            try {
                activity.setRequestedOrientation(this.N);
            } catch (Exception e) {
                cc4.g(e, true);
            }
            this.M = null;
        }
        this.P.animate().cancel();
        this.R.animate().cancel();
        this.W.animate().cancel();
        this.p0.animate().cancel();
        this.a0.animate().cancel();
        this.b0.animate().cancel();
        kt ktVar = this.P0;
        if (ktVar != null) {
            removeCallbacks(ktVar);
            this.P0 = null;
        }
        id idVar = this.U0;
        if (idVar != null) {
            idVar.dismiss();
        }
        rj4 rj4Var = this.j0;
        if (rj4Var != null) {
            rj4Var.run();
            this.j0 = null;
        }
        jn7.f(this.n).n(this, jn7.d4);
        this.b.U2.u().removeView(this.x);
        hl.t1(this.T);
    }

    public void setSendTransitionProgress(float f) {
        this.w.setAlpha(1.0f - f);
    }

    @Override
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        this.b.b.invalidate();
    }

    @Override
    public final void v() {
        O();
        Activity activity = this.M;
        if (activity != null) {
            try {
                activity.setRequestedOrientation(this.N);
            } catch (Exception e) {
                cc4.g(e, true);
            }
            this.M = null;
        }
        this.b.U2.setDrawGlassTitle(true);
        this.M0 = false;
        this.N0 = false;
        kt ktVar = this.P0;
        if (ktVar != null) {
            removeCallbacks(ktVar);
            this.P0 = null;
        }
        id idVar = this.U0;
        if (idVar != null) {
            idVar.dismiss();
        }
        this.x.setVisibility(8);
        EditTextBoldCursor editTextBoldCursor = this.T;
        hl.t1(editTextBoldCursor);
        editTextBoldCursor.clearFocus();
    }

    @Override
    public final void x(int i) {
        if (i == 2) {
            uqc.L0(this.n, this.a, getContext());
        } else if (i == 3) {
            Y();
        }
    }

    @Override
    public final void z() {
        if (!this.C0) {
            return;
        }
        this.C0 = false;
        float bottomYOnScreen = getBottomYOnScreen();
        FrameLayout frameLayout = this.k0;
        frameLayout.setTranslationY(this.K0 - (bottomYOnScreen - frameLayout.getTranslationY()));
        ktc ktcVar = this.w;
        ktcVar.setTranslationY(this.I0 - (T(ktcVar) - ktcVar.getTranslationY()));
        this.L0 = true;
        requestLayout();
    }
}
