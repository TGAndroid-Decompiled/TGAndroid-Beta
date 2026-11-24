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
public final class c52 extends a22 implements jm7 {
    public float A0;
    public float B0;
    public boolean C0;
    public boolean D0;
    public final ShapeDrawable E;
    public boolean E0;
    public final m37 F;
    public float F0;
    public pn2 G;
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
    public final y42 O;
    public boolean O0;
    public final LinearLayout P;
    public fu P0;
    public final FrameLayout Q;
    public TL_wallet.walletTransaction Q0;
    public final TextView R;
    public apc R0;
    public final qrc S;
    public esc S0;
    public final EditTextBoldCursor T;
    public boolean T0;
    public final io U;
    public he U0;
    public final TextView V;
    public boolean V0;
    public final l66 W;
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
    public qn4 j0;
    public final FrameLayout k0;
    public final FrameLayout l0;
    public zna m0;
    public final int n;
    public float n0;
    public float o0;
    public final b61 p0;
    public boolean q0;
    public final TLRPC.User r;
    public final SpannableString r0;
    public final FrameLayout s;
    public final SpannableString s0;
    public String t0;
    public boolean u0;
    public boolean v0;
    public final zqc w;
    public int w0;
    public final r7 x;
    public DecimalFormat x0;
    public final r7 y;
    public final int[] y0;
    public boolean z0;

    public c52(i22 i22Var, Context context, int i, TLRPC.User user, ylb ylbVar) {
        super(i22Var, ylbVar, context);
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
        addView(frameLayout, qoe.e(-1, -1, 55));
        r7 a = this.b.U2.t().a(31, 2131231248);
        this.x = a;
        a.setContentDescription(jb6.M0(2131754838, null));
        a.e(2, 2131232050, jb6.M0(2131742820, null));
        a.e(3, 2131231783, jb6.M0(2131742888, null));
        a.setVisibility(8);
        r7 r7Var = new r7(context, null, 0, cmb.v0(cmb.F6, this.a), false, ylbVar);
        this.y = r7Var;
        r7Var.setIcon(2131231248);
        r7Var.setContentDescription(jb6.M0(2131754838, null));
        int i2 = cmb.h6;
        fg0 f0 = cmb.f0(cmb.v0(i2, this.a), 1, -1);
        wmb M = anb.M(i2);
        r7Var.setBackground(f0);
        anb.j(r7Var, f0, null, M, ylbVar);
        r7Var.setOnClickListener(new wh(this, ylbVar, i, (byte) 5));
        zqc zqcVar = new zqc(ylbVar, context, new lx1(this, user, (byte) 17), new lx1(this, ylbVar, (byte) 18));
        this.w = zqcVar;
        zqcVar.a(this.H, user);
        addView(zqcVar, qoe.d(-2, 64.0f, 49, 6.0f, 0.0f, 6.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setClipChildren(false);
        frameLayout2.setClipToPadding(false);
        frameLayout.addView(frameLayout2, qoe.e(-1, -1, 55));
        ?? linearLayout = new LinearLayout(context);
        this.O = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setOnClickListener(new View.OnClickListener(this) {
            public final c52 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                c52 c52Var = this.b;
                switch (b) {
                    case 0:
                        c52Var.c0();
                        return;
                    case 1:
                        c52Var.Z();
                        return;
                    case 2:
                        c52Var.d0();
                        return;
                    case 3:
                        c52Var.c0();
                        return;
                    case 4:
                        c52Var.c0();
                        return;
                    case 5:
                        c52Var.c0();
                        return;
                    default:
                        c52Var.h0();
                        return;
                }
            }
        });
        frameLayout2.addView((View) linearLayout, qoe.e(-1, -2, 17));
        qrc qrcVar = new qrc(context, ylbVar);
        this.S = qrcVar;
        qrcVar.setOnClickListener(new View.OnClickListener(this) {
            public final c52 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                c52 c52Var = this.b;
                switch (b) {
                    case 0:
                        c52Var.c0();
                        return;
                    case 1:
                        c52Var.Z();
                        return;
                    case 2:
                        c52Var.d0();
                        return;
                    case 3:
                        c52Var.c0();
                        return;
                    case 4:
                        c52Var.c0();
                        return;
                    case 5:
                        c52Var.c0();
                        return;
                    default:
                        c52Var.h0();
                        return;
                }
            }
        });
        linearLayout.addView(qrcVar, qoe.t(-1, 64, 49, 16, 0, 16, 0));
        EditTextBoldCursor editText = qrcVar.getEditText();
        this.T = editText;
        editText.setFilters(new InputFilter[]{new s42(this, (byte) 0)});
        editText.setImeOptions(33554438);
        editText.setOnTouchListener(new a7(this, (byte) 2));
        editText.setOnClickListener(new View.OnClickListener(this) {
            public final c52 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                c52 c52Var = this.b;
                switch (b) {
                    case 0:
                        c52Var.c0();
                        return;
                    case 1:
                        c52Var.Z();
                        return;
                    case 2:
                        c52Var.d0();
                        return;
                    case 3:
                        c52Var.c0();
                        return;
                    case 4:
                        c52Var.c0();
                        return;
                    case 5:
                        c52Var.c0();
                        return;
                    default:
                        c52Var.h0();
                        return;
                }
            }
        });
        editText.setOnEditorActionListener(new j(this, (byte) 7));
        editText.addTextChangedListener(new z42(this));
        SpannableString spannableString = new SpannableString("⇅");
        this.r0 = spannableString;
        pn2 pn2Var = new pn2(2131232833, 0);
        pn2Var.x = 0.72f;
        spannableString.setSpan(pn2Var, 0, spannableString.length(), 33);
        SpannableString spannableString2 = new SpannableString("G");
        this.s0 = spannableString2;
        pn2 pn2Var2 = new pn2(2131232837, 0);
        pn2Var2.d = false;
        spannableString2.setSpan(pn2Var2, 0, spannableString2.length(), 33);
        io ioVar = new io(context, false, true, true, true, true);
        this.U = ioVar;
        ioVar.c.m(0.35f, 320L, 3.5f, d53.h);
        ioVar.setScaleProperty(0.35f);
        ioVar.setText(R(c.C(i), 0L));
        int i3 = cmb.c6;
        int i4 = cmb.y6;
        wmb p = anb.p(i3, i4);
        anb.m(ioVar, p.a, p.b, 4, 0.0f, ylbVar);
        ioVar.setTextSize(gm.L(14.0f));
        ioVar.setTypeface(gm.n1("fonts/gram.ttf"));
        ioVar.setGravity(17);
        ioVar.setPadding(gm.L(10.0f), 0, gm.L(10.0f), 0);
        ioVar.setAllowCancel(true);
        ShapeDrawable b0 = cmb.b0(gm.L(14.0f), cmb.p1(0.08f, cmb.v0(i4, this.a)));
        this.E = b0;
        ioVar.setSizeableBackground(b0);
        linearLayout.addView(ioVar, qoe.t(-2, 28, 49, 0, 8, 0, 0));
        rve.a(ioVar);
        ioVar.setOnClickListener(new View.OnClickListener(this) {
            public final c52 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                c52 c52Var = this.b;
                switch (b) {
                    case 0:
                        c52Var.c0();
                        return;
                    case 1:
                        c52Var.Z();
                        return;
                    case 2:
                        c52Var.d0();
                        return;
                    case 3:
                        c52Var.c0();
                        return;
                    case 4:
                        c52Var.c0();
                        return;
                    case 5:
                        c52Var.c0();
                        return;
                    default:
                        c52Var.h0();
                        return;
                }
            }
        });
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.Q = frameLayout3;
        linearLayout.addView(frameLayout3, qoe.r(-2, -2, 49));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.P = linearLayout2;
        linearLayout2.setOrientation(1);
        frameLayout3.addView(linearLayout2, qoe.e(-2, -2, 49));
        TextView textView = new TextView(context);
        this.R = textView;
        textView.setTextSize(1, 14.0f);
        anb.X(textView, i4, ylbVar);
        textView.setPadding(gm.L(10.0f), 0, gm.L(10.0f), 0);
        hg9.p(textView, 17, null, 2131742670);
        frameLayout3.addView(textView, qoe.d(-2, 28.0f, 49, 0.0f, 8.0f, 0.0f, 0.0f));
        rve.a(textView);
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final c52 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                c52 c52Var = this.b;
                switch (b) {
                    case 0:
                        c52Var.c0();
                        return;
                    case 1:
                        c52Var.Z();
                        return;
                    case 2:
                        c52Var.d0();
                        return;
                    case 3:
                        c52Var.c0();
                        return;
                    case 4:
                        c52Var.c0();
                        return;
                    case 5:
                        c52Var.c0();
                        return;
                    default:
                        c52Var.h0();
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
        m37 m37Var = new m37(0, true, false, null);
        this.F = m37Var;
        m37Var.x = false;
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = m37Var.c;
        paint.setStyle(style);
        paint.setStrokeWidth(Math.max(1.0f, gm.N(0.5f)));
        int i5 = cmb.am;
        paint.setColor(cmb.v0(i5, this.a));
        m37Var.w = Integer.valueOf(cmb.v0(i5, this.a));
        textView2.setPadding(gm.L(15.0f), gm.L(7.0f), gm.L(19.0f), gm.L(8.0f));
        textView2.setBackground(m37Var);
        textView2.setTextSize(1, 14.0f);
        anb.X(textView2, i4, ylbVar);
        textView2.setTypeface(gm.o());
        textView2.setVisibility(8);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setMaxLines(4);
        linearLayout2.addView(textView2, qoe.t(-2, -2, 49, 32, 12, 32, 0));
        textView2.setOnClickListener(new View.OnClickListener(this) {
            public final c52 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                c52 c52Var = this.b;
                switch (b) {
                    case 0:
                        c52Var.c0();
                        return;
                    case 1:
                        c52Var.Z();
                        return;
                    case 2:
                        c52Var.d0();
                        return;
                    case 3:
                        c52Var.c0();
                        return;
                    case 4:
                        c52Var.c0();
                        return;
                    case 5:
                        c52Var.c0();
                        return;
                    default:
                        c52Var.h0();
                        return;
                }
            }
        });
        rve.b(textView2, 0.02f, 1.2f);
        l66 l66Var = new l66(context, ylbVar);
        this.W = l66Var;
        anb.X(l66Var, cmb.p7, ylbVar);
        anb.G(l66Var, cmb.Ei, ylbVar);
        l66Var.setTextSize(1, 14.0f);
        l66Var.setGravity(17);
        l66Var.setTypeface(gm.o());
        l66Var.setPadding(gm.L(10.0f), 0, gm.L(10.0f), 0);
        f0(false);
        linearLayout2.addView(l66Var, qoe.t(-2, -2, 49, 0, 10, 0, 0));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.k0 = frameLayout4;
        frameLayout4.setPadding(gm.L(16.0f), 0, gm.L(16.0f), gm.L(12.0f));
        FrameLayout frameLayout5 = new FrameLayout(context);
        this.l0 = frameLayout5;
        frameLayout4.setClipChildren(false);
        frameLayout4.setClipToPadding(false);
        frameLayout5.setClipChildren(false);
        frameLayout5.setClipToPadding(false);
        frameLayout4.addView(frameLayout5, qoe.c(-1.0f, -1));
        TextView textView3 = new TextView(context);
        this.a0 = textView3;
        anb.X(textView3, i4, ylbVar);
        textView3.setTextSize(1, 14.0f);
        textView3.setGravity(17);
        frameLayout5.addView(textView3, qoe.e(-1, 20, 55));
        TextView textView4 = new TextView(context);
        this.b0 = textView4;
        anb.X(textView4, i4, ylbVar);
        textView4.setTextSize(1, 14.0f);
        textView4.setGravity(17);
        textView4.setPadding(0, gm.L(4.0f), 0, gm.L(4.0f));
        textView4.setVisibility(8);
        frameLayout5.addView(textView4, qoe.d(-1, -2.0f, 55, 0.0f, 24.0f, 0.0f, 0.0f));
        SpannableString spannableString3 = new SpannableString(jb6.M0(2131748536, null));
        this.c0 = spannableString3;
        spannableString3.setSpan(new ta6(gm.L(80.0f), textView4), 0, spannableString3.length(), 33);
        b61 i6 = mlb.i(24, ylbVar, context, true);
        this.p0 = i6;
        i6.setText(jb6.M0(2131742683, null));
        i6.setEnabled(false);
        i6.setOnClickListener(new View.OnClickListener(this) {
            public final c52 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                c52 c52Var = this.b;
                switch (b) {
                    case 0:
                        c52Var.c0();
                        return;
                    case 1:
                        c52Var.Z();
                        return;
                    case 2:
                        c52Var.d0();
                        return;
                    case 3:
                        c52Var.c0();
                        return;
                    case 4:
                        c52Var.c0();
                        return;
                    case 5:
                        c52Var.c0();
                        return;
                    default:
                        c52Var.h0();
                        return;
                }
            }
        });
        frameLayout5.addView(i6, qoe.e(-1, 48, 87));
        frameLayout.addView(frameLayout4, qoe.d(-1, 92.0f, 87, 0.0f, 0.0f, 0.0f, 70.0f));
        o0(false, false);
        nm7.f(i).b(this, nm7.e4);
        j0();
        this.J = true;
        c.C(i).i0(user, new u42(this, (byte) 0));
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

    public static BigDecimal a0(String str) {
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

    public static void e0(SpannableStringBuilder spannableStringBuilder, int i, int i2, char c) {
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
        double d = oc7.r1(this.n).l4.k.i;
        if (h > 0.0d && d > 0.0d && !Double.isNaN(h) && !Double.isInfinite(h) && !Double.isNaN(d) && !Double.isInfinite(d)) {
            return BigDecimal.valueOf(h).multiply(BigDecimal.valueOf(d));
        }
        return BigDecimal.ZERO;
    }

    private long getGramNanoAmount() {
        BigDecimal a0 = a0(this.T.getText().toString());
        if (this.v0) {
            BigDecimal currencyPerGram = getCurrencyPerGram();
            if (currencyPerGram.signum() <= 0) {
                return 0L;
            }
            a0 = a0.divide(currencyPerGram, 9, RoundingMode.DOWN).setScale(2, RoundingMode.HALF_UP);
        }
        BigInteger bigInteger = a0.movePointRight(9).toBigInteger();
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
        l53 l53Var = c.C(this.n).h;
        TL_wallet.currencyRates f = l53Var.f();
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
            if (currencyrate2 != null && TextUtils.equals(currencyrate2.currency, l53Var.g())) {
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
    public final void A() {
        O();
        g0();
    }

    @Override
    public final void B(int i, int i2) {
        boolean z;
        int L;
        int i3;
        int L2;
        i22 i22Var = this.b;
        if (i22Var.o3.Q() > gm.L(20.0f)) {
            z = true;
        } else {
            z = false;
        }
        this.z0 = z;
        this.f = z;
        if (z) {
            L = 0;
        } else {
            L = gm.L(70.0f);
        }
        int round = Math.round(gm.L(32.0f) * this.f0) + gm.L(92.0f);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.k0.getLayoutParams();
        layoutParams.height = round;
        layoutParams.bottomMargin = L;
        if (this.z0) {
            i3 = gm.L(56.0f);
            i22Var.r0 = false;
        } else {
            if (!gm.O1()) {
                Point point = gm.q;
                if (point.x > point.y) {
                    i3 = (int) (i2 / 3.5f);
                    i22Var.r0 = true;
                }
            }
            i3 = (i2 / 5) << 1;
            i22Var.r0 = true;
        }
        int c = b10.c(1.0f, i3, 0) + gm.m;
        FrameLayout frameLayout = this.s;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
        if (layoutParams2.topMargin != c) {
            layoutParams2.topMargin = c;
            frameLayout.setLayoutParams(layoutParams2);
        }
        int e = kt6.e(4.0f, c - gm.m, 0);
        zqc zqcVar = this.w;
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) zqcVar.getLayoutParams();
        if (this.z0) {
            L2 = gm.L(4.0f) + a.getCurrentActionBarHeight();
        } else {
            L2 = e - gm.L(4.0f);
        }
        int max = Math.max(0, L2);
        if (layoutParams3.topMargin != max) {
            layoutParams3.topMargin = max;
            zqcVar.setLayoutParams(layoutParams3);
        }
        k0();
    }

    @Override
    public final void H(a22 a22Var) {
        Activity W;
        O();
        if (this.M == null && !gm.O1()) {
            Point point = gm.q;
            if (Math.min(point.x, point.y) < gm.L(700.0f) && (W = gm.W(getContext())) != null) {
                try {
                    this.N = W.getRequestedOrientation();
                    W.setRequestedOrientation(1);
                    this.M = W;
                } catch (Exception e) {
                    fc4.g(e, true);
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
        zqc zqcVar = this.w;
        zqcVar.setTranslationY(0.0f);
        zqcVar.setAlpha(1.0f);
        this.E0 = false;
        i22 i22Var = this.b;
        i22Var.U2.setTitle(jb6.M0(2131742679, null));
        i22Var.U2.setDrawGlassTitle(false);
        this.x.setVisibility(0);
        editTextBoldCursor.clearFocus();
        Y();
        qrc qrcVar = this.S;
        if (qrcVar.getDiamondView().f == null) {
            f = 1.0f;
        }
        this.o0 = f;
        this.n0 = f;
        m0();
        if (this.n0 < 1.0f) {
            qrcVar.getDiamondView().l(new v42(this, (byte) 3));
        }
    }

    @Override
    public final void I() {
        this.M0 = true;
        post(new v42(this, (byte) 4));
    }

    @Override
    public final boolean N() {
        return !this.O0;
    }

    public final void O() {
        this.S.getDiamondView().l(null);
        zna znaVar = this.m0;
        if (znaVar != null) {
            znaVar.d();
        }
        this.n0 = 1.0f;
        m0();
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
        e0(spannableStringBuilder, length, spannableStringBuilder.length(), getCurrencyDecimalSeparator());
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

    public final CharSequence W(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
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
        if (a0(sb2).compareTo(valueOf) > 0) {
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

    public final void X(ValueAnimator valueAnimator) {
        setFeeVisibilityProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public final void Y() {
        if (!this.L && !TextUtils.isEmpty(this.H)) {
            qn4 qn4Var = this.j0;
            byte[] bArr = null;
            if (qn4Var != null) {
                qn4Var.run();
                this.j0 = null;
            }
            this.h0 = -1L;
            j0();
            c C = c.C(this.n);
            if (this.i0) {
                String str = this.H;
                long max = Math.max(100000000L, getGramNanoAmount());
                String str2 = this.t0;
                if (this.u0) {
                    bArr = getPublicKey();
                }
                this.j0 = C.l(str, max, str2, bArr, new u42(this, (byte) 1));
            }
        }
    }

    public final void Z() {
        if (!this.L && !this.O0 && this.P0 == null && this.U0 == null) {
            c0();
            fu fuVar = new fu(this, SystemClock.uptimeMillis() + 1500, (byte) 7);
            this.P0 = fuVar;
            post(fuVar);
        }
    }

    public final void b0() {
        if (this.M0 && !this.C0 && !this.L0 && isAttachedToWindow() && Math.abs(getTranslationY()) < 0.5f && this.O.getHeight() > 0 && this.k0.getHeight() > 0) {
            this.F0 = getBottomYOnScreen();
            this.G0 = T(this.w);
            this.E0 = true;
        }
    }

    public final void c0() {
        if (!this.L && !this.O0) {
            i22 i22Var = this.b;
            if (!i22Var.J) {
                if (!this.M0) {
                    this.N0 = true;
                    return;
                }
                this.N0 = false;
                EditTextBoldCursor editTextBoldCursor = this.T;
                editTextBoldCursor.setFocusableInTouchMode(true);
                editTextBoldCursor.setShowSoftInputOnFocus(true);
                i22Var.c1(editTextBoldCursor, true);
                editTextBoldCursor.requestFocus();
                gm.E3(editTextBoldCursor);
                editTextBoldCursor.postDelayed(new v42(this, (byte) 1), 220L);
            }
        }
    }

    @Override
    public final void d() {
        try {
            r7 r7Var = this.y;
            ylb ylbVar = this.a;
            if (r7Var != null) {
                r7Var.setIconColor(cmb.v0(cmb.F6, ylbVar));
            }
            ShapeDrawable shapeDrawable = this.E;
            if (shapeDrawable != null) {
                cmb.A1(cmb.p1(0.08f, cmb.v0(cmb.y6, ylbVar)), shapeDrawable);
                io ioVar = this.U;
                if (ioVar != null) {
                    ioVar.invalidate();
                }
            }
            m37 m37Var = this.F;
            if (m37Var != null) {
                int v0 = cmb.v0(cmb.am, ylbVar);
                m37Var.c.setColor(v0);
                m37Var.w = Integer.valueOf(v0);
                TextView textView = this.V;
                if (textView != null) {
                    textView.invalidate();
                }
            }
            pn2 pn2Var = this.G;
            if (pn2Var != null) {
                pn2Var.y = cmb.v0(cmb.Ei, ylbVar);
                l66 l66Var = this.W;
                if (l66Var != null) {
                    l66Var.invalidate();
                }
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    public final void d0() {
        boolean z;
        String S;
        b61 b61Var = this.p0;
        if (b61Var.e0 && !b61Var.R) {
            c C = c.C(this.n);
            long gramNanoAmount = getGramNanoAmount();
            long z2 = C.z();
            if (WalletEngine2.isValidAddress(this.H) && gramNanoAmount > 0) {
                long f = oc7.r1(this.n).l4.p0.f();
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
                    gm.A3(i, editTextBoldCursor, null);
                } else if (gramNanoAmount > z2) {
                    xx0.APP_ERROR.a();
                    l66 l66Var = this.W;
                    int i2 = -this.w0;
                    this.w0 = i2;
                    gm.A3(i2, l66Var, null);
                } else {
                    oc7 r1 = oc7.r1(this.n);
                    long L1 = r1.L1(this.r.id);
                    if (r1.l4.o0.f && L1 > 0 && (gramNanoAmount / 1.0E9d) * r1.l4.k.i < (L1 / 1000.0d) * r1.l4.s3.i) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.T0 = z;
                    this.p0.setLoading(true);
                    this.O0 = true;
                    this.N0 = false;
                    fu fuVar = this.P0;
                    if (fuVar != null) {
                        removeCallbacks(fuVar);
                        this.P0 = null;
                    }
                    this.Q0 = null;
                    TLRPC.User user = this.r;
                    String str = this.H;
                    String str2 = this.t0;
                    if (this.u0) {
                        bArr = getPublicKey();
                    }
                    C.l0(user, str, gramNanoAmount, str2, bArr, null, null, new qac(this) {
                        public final c52 b;

                        {
                            this.b = this;
                        }

                        @Override
                        public final void a(Object obj) {
                            byte b = r2;
                            c52 c52Var = this.b;
                            switch (b) {
                                case 0:
                                    String str3 = (String) obj;
                                    b61 b61Var2 = c52Var.p0;
                                    i22 i22Var = c52Var.b;
                                    if (!c52Var.L && !i22Var.J) {
                                        if (c.K(str3)) {
                                            b61Var2.setLoading(false);
                                            c52Var.O0 = false;
                                            return;
                                        } else if (TextUtils.isEmpty(str3)) {
                                            i22Var.dismiss();
                                            return;
                                        } else {
                                            b61Var2.setLoading(false);
                                            c52Var.O0 = false;
                                            c41.Y().f0(str3, false);
                                            return;
                                        }
                                    }
                                    return;
                                default:
                                    c52Var.Q0 = (TL_wallet.walletTransaction) obj;
                                    return;
                            }
                        }
                    }, new qac(this) {
                        public final c52 b;

                        {
                            this.b = this;
                        }

                        @Override
                        public final void a(Object obj) {
                            byte b = r2;
                            c52 c52Var = this.b;
                            switch (b) {
                                case 0:
                                    String str3 = (String) obj;
                                    b61 b61Var2 = c52Var.p0;
                                    i22 i22Var = c52Var.b;
                                    if (!c52Var.L && !i22Var.J) {
                                        if (c.K(str3)) {
                                            b61Var2.setLoading(false);
                                            c52Var.O0 = false;
                                            return;
                                        } else if (TextUtils.isEmpty(str3)) {
                                            i22Var.dismiss();
                                            return;
                                        } else {
                                            b61Var2.setLoading(false);
                                            c52Var.O0 = false;
                                            c41.Y().f0(str3, false);
                                            return;
                                        }
                                    }
                                    return;
                                default:
                                    c52Var.Q0 = (TL_wallet.walletTransaction) obj;
                                    return;
                            }
                        }
                    });
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == nm7.e4) {
            boolean z = this.i0;
            i0();
            if (z != this.i0) {
                Y();
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        this.b.U2.getAlpha();
        l0();
        if (this.m0 != null || this.n0 < 1.0f) {
            m0();
        }
        super.dispatchDraw(canvas);
        b0();
    }

    public final void f0(boolean z) {
        float f;
        float f2 = 0.0f;
        l66 l66Var = this.W;
        if (z) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) jb6.M0(2131742766, null));
            spannableStringBuilder.append((CharSequence) " ");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) jb6.M0(2131742820, null));
            spannableStringBuilder.append((CharSequence) " >");
            pn2 pn2Var = new pn2(2131232714, 0);
            pn2Var.y = cmb.v0(cmb.Ei, this.a);
            float N = gm.N(0.66f);
            pn2Var.r = 0.0f;
            pn2Var.s = N;
            this.G = pn2Var;
            spannableStringBuilder.setSpan(pn2Var, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            spannableStringBuilder.setSpan(new z31(this, (byte) 4), length, spannableStringBuilder.length(), 33);
            l66Var.setText(spannableStringBuilder);
        }
        ViewPropertyAnimator animate = l66Var.animate();
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
        scaleX.scaleY(f3).setDuration(320L).setInterpolator(d53.h).start();
    }

    public final void g0() {
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

    @Override
    public int getButtonsHideOffset() {
        return gm.L(62.0f);
    }

    @Override
    public int getCurrentItemTop() {
        int top = this.s.getTop();
        if (top <= 0) {
            top = getListTopPadding();
        }
        return gm.L(13.0f) + Math.max(0, top - (gm.L(12.0f) + gm.m));
    }

    @Override
    public int getCustomBackground() {
        return cmb.v0(cmb.c6, this.a);
    }

    @Override
    public int getFirstOffset() {
        return gm.L(5.0f) + getListTopPadding();
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

    public final void i0() {
        boolean z;
        boolean z2;
        boolean z3;
        CharSequence V;
        SpannableStringBuilder R;
        String S;
        k0();
        int i = this.n;
        c C = c.C(i);
        long z4 = C.z();
        long gramNanoAmount = getGramNanoAmount();
        long f = oc7.r1(i).l4.p0.f();
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
            gm.A3(i3, editTextBoldCursor, null);
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
        f0(z2);
        String gramsText = getGramsText();
        if (this.H == null && this.J) {
            z3 = true;
        } else {
            z3 = false;
        }
        b61 b61Var = this.p0;
        b61Var.setLoading(z3);
        if (TextUtils.isEmpty(gramsText)) {
            V = jb6.M0(2131742683, null);
        } else {
            V = jb6.V(null, null, 2131742684, c.p("Grams", gramsText, 2131749264));
        }
        b61Var.i(V, true, true);
        boolean isEmpty = TextUtils.isEmpty(editTextBoldCursor.getText());
        boolean z6 = !isEmpty;
        if (!isEmpty && z && !this.K) {
            z5 = true;
        }
        b61Var.setEnabled(z5);
        o0(z6, this.M0);
        j0();
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
            e0(spannableStringBuilder, length, spannableStringBuilder.length(), '.');
            spannableStringBuilder.append((CharSequence) " ");
            int length2 = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) jb6.M0(2131749290, null));
            spannableStringBuilder.setSpan(new RelativeSizeSpan(0.85714287f), length2, spannableStringBuilder.length(), 33);
            R = spannableStringBuilder.append((CharSequence) " ").append((CharSequence) this.r0);
        } else {
            R = R(C, gramNanoAmount);
        }
        this.U.setText(R);
    }

    @Override
    public final int j() {
        return 1;
    }

    public final void j0() {
        boolean z;
        boolean z2;
        float f;
        int i = this.n;
        c C = c.C(i);
        this.a0.setText(jb6.V(null, null, 2131742868, c.p("Grams", c.t(C.z(), true), 2131749264)));
        long f2 = oc7.r1(i).l4.p0.f();
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
                this.g0.setInterpolator(d53.h);
                this.g0.addUpdateListener(new et1(this, (byte) 4));
                this.g0.start();
            } else {
                setFeeVisibilityProgress(f);
            }
        }
        long j = this.h0;
        int i2 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        TextView textView = this.b0;
        if (i2 >= 0) {
            textView.setText(jb6.V(null, null, 2131742754, c.w(j, false)));
        } else {
            textView.setText(jb6.V(null, null, 2131742754, this.c0));
        }
    }

    @Override
    public final boolean k() {
        if (this.b.o3.Q() <= gm.L(20.0f)) {
            return false;
        }
        this.N0 = false;
        fu fuVar = this.P0;
        if (fuVar != null) {
            removeCallbacks(fuVar);
            this.P0 = null;
        }
        EditTextBoldCursor editTextBoldCursor = this.T;
        editTextBoldCursor.clearFocus();
        gm.t1(editTextBoldCursor);
        return true;
    }

    public final void k0() {
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
                    public final c52 b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void run() {
                        byte b = r3;
                        int i = 4;
                        boolean z2 = z;
                        c52 c52Var = this.b;
                        switch (b) {
                            case 0:
                                LinearLayout linearLayout2 = c52Var.P;
                                if (z2) {
                                    i = 0;
                                }
                                linearLayout2.setVisibility(i);
                                return;
                            default:
                                TextView textView2 = c52Var.R;
                                if (!z2) {
                                    i = 0;
                                }
                                textView2.setVisibility(i);
                                return;
                        }
                    }
                }).setDuration(320L);
                d53 d53Var = d53.h;
                duration.setInterpolator(d53Var).start();
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
                    public final c52 b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void run() {
                        byte b = r3;
                        int i = 4;
                        boolean z2 = z;
                        c52 c52Var = this.b;
                        switch (b) {
                            case 0:
                                LinearLayout linearLayout2 = c52Var.P;
                                if (z2) {
                                    i = 0;
                                }
                                linearLayout2.setVisibility(i);
                                return;
                            default:
                                TextView textView2 = c52Var.R;
                                if (!z2) {
                                    i = 0;
                                }
                                textView2.setVisibility(i);
                                return;
                        }
                    }
                }).setDuration(320L).setInterpolator(d53Var).start();
            }
        }
    }

    public final void l0() {
        float f;
        View view = this.O;
        if (view.getHeight() > 0) {
            FrameLayout frameLayout = this.k0;
            if (frameLayout.getHeight() > 0) {
                View view2 = this.s;
                float T = T(view2);
                zqc zqcVar = this.w;
                if (zqcVar.getVisibility() == 0) {
                    f = Math.max(T, (zqcVar.getScaleY() * (zqcVar.getContentBottom() - zqcVar.getPivotY())) + zqcVar.getPivotY() + T(zqcVar));
                } else {
                    f = T;
                }
                float max = Math.max(0.0f, Math.min(Math.min(Math.min((T + view2.getHeight()) - ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).bottomMargin, U(this.a0)), U(this.b0)), U(this.p0)) - f);
                float min = Math.min(1.0f, Math.max(0.0f, max - (Math.min(gm.L(12.0f), max / 4.0f) * 2.0f)) / view.getHeight());
                view.setPivotX(view.getWidth() / 2.0f);
                view.setPivotY(view.getHeight() / 2.0f);
                view.setScaleX(min);
                view.setScaleY(min);
                float f2 = (max / 2.0f) + f;
                view.setTranslationY(f2 - ((view.getHeight() / 2.0f) + (T(view) - view.getTranslationY())));
            }
        }
    }

    public final void m0() {
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
        qrc qrcVar = this.S;
        qrcVar.e(f2, max, z);
        qrcVar.setTranslationY((1.0f - this.n0) * (((this.O.getHeight() / 2.0f) - qrcVar.getTop()) - (qrcVar.getHeight() / 2.0f)));
        float f3 = this.o0;
        io ioVar = this.U;
        ioVar.setAlpha(f3);
        ioVar.setTranslationY(gm.L(16.0f) * f);
        float f4 = this.o0;
        FrameLayout frameLayout = this.Q;
        frameLayout.setAlpha(f4);
        frameLayout.setTranslationY(gm.L(16.0f) * f);
        float f5 = this.o0;
        FrameLayout frameLayout2 = this.l0;
        frameLayout2.setAlpha(f5);
        frameLayout2.setTranslationY(gm.L(24.0f) * f);
    }

    @Override
    public final void n(float f, float f2) {
        this.A0 = f;
        this.B0 = f2;
        n0();
    }

    public final void n0() {
        if (this.C0 && this.O.getHeight() > 0) {
            FrameLayout frameLayout = this.k0;
            if (frameLayout.getHeight() > 0) {
                boolean z = this.D0;
                float f = this.B0;
                if (!z) {
                    f = 1.0f - f;
                }
                float f2 = this.J0;
                float A = td4.A(this.K0, f2, f, f2);
                float f3 = this.H0;
                float A2 = td4.A(this.I0, f3, f, f3);
                frameLayout.setTranslationY(A - (getBottomYOnScreen() - frameLayout.getTranslationY()));
                zqc zqcVar = this.w;
                zqcVar.setTranslationY(A2 - (T(zqcVar) - zqcVar.getTranslationY()));
                l0();
            }
        }
    }

    public final void o0(boolean z, boolean z2) {
        float f;
        float f2;
        if (z2 && this.q0 == z) {
            return;
        }
        this.q0 = z;
        b61 b61Var = this.p0;
        b61Var.animate().cancel();
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
            f3 = gm.L(60.0f);
        }
        int i = 0;
        if (!z2) {
            if (!z) {
                i = 4;
            }
            b61Var.setVisibility(i);
            b61Var.setAlpha(f2);
            b61Var.setScaleX(f);
            b61Var.setScaleY(f);
            textView.setTranslationY(f3);
            textView2.setTranslationY(f3);
            return;
        }
        b61Var.setVisibility(0);
        ViewPropertyAnimator duration = b61Var.animate().alpha(f2).scaleX(f).scaleY(f).setDuration(320L);
        d53 d53Var = d53.h;
        duration.setInterpolator(d53Var).withEndAction(new v42(this, (byte) 5)).start();
        textView.animate().translationY(f3).setDuration(320L).setInterpolator(d53Var).start();
        textView2.animate().translationY(f3).setDuration(320L).setInterpolator(d53Var).start();
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.L0) {
            this.L0 = false;
            this.O.setTranslationY(0.0f);
            this.k0.setTranslationY(0.0f);
            this.w.setTranslationY(0.0f);
            b0();
        } else if (this.C0) {
            n0();
        }
        l0();
    }

    @Override
    public final void onWindowFocusChanged(boolean z) {
        if (!z) {
            g0();
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
        apc apcVar = this.R0;
        if (apcVar != null) {
            AnimatorSet animatorSet = apcVar.m;
            if (!apcVar.v) {
                if (animatorSet.isStarted()) {
                    animatorSet.cancel();
                } else {
                    apcVar.a(false);
                }
            }
            this.R0 = null;
        }
        esc escVar = this.S0;
        if (escVar != null) {
            AnimatorSet animatorSet2 = escVar.m;
            if (!escVar.s) {
                if (animatorSet2.isStarted()) {
                    animatorSet2.cancel();
                } else {
                    escVar.b();
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
                fc4.g(e, true);
            }
            this.M = null;
        }
        this.P.animate().cancel();
        this.R.animate().cancel();
        this.W.animate().cancel();
        this.p0.animate().cancel();
        this.a0.animate().cancel();
        this.b0.animate().cancel();
        fu fuVar = this.P0;
        if (fuVar != null) {
            removeCallbacks(fuVar);
            this.P0 = null;
        }
        he heVar = this.U0;
        if (heVar != null) {
            heVar.dismiss();
        }
        qn4 qn4Var = this.j0;
        if (qn4Var != null) {
            qn4Var.run();
            this.j0 = null;
        }
        nm7.f(this.n).n(this, nm7.e4);
        this.b.U2.t().removeView(this.x);
        gm.t1(this.T);
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
    public final void u() {
        O();
        Activity activity = this.M;
        if (activity != null) {
            try {
                activity.setRequestedOrientation(this.N);
            } catch (Exception e) {
                fc4.g(e, true);
            }
            this.M = null;
        }
        this.b.U2.setDrawGlassTitle(true);
        this.M0 = false;
        this.N0 = false;
        fu fuVar = this.P0;
        if (fuVar != null) {
            removeCallbacks(fuVar);
            this.P0 = null;
        }
        he heVar = this.U0;
        if (heVar != null) {
            heVar.dismiss();
        }
        this.x.setVisibility(8);
        EditTextBoldCursor editTextBoldCursor = this.T;
        gm.t1(editTextBoldCursor);
        editTextBoldCursor.clearFocus();
    }

    @Override
    public final void w(int i) {
        if (i == 2) {
            goc.M0(this.n, this.a, getContext());
        } else if (i == 3) {
            Z();
        }
    }

    @Override
    public final void y() {
        if (!this.C0) {
            return;
        }
        this.C0 = false;
        float bottomYOnScreen = getBottomYOnScreen();
        FrameLayout frameLayout = this.k0;
        frameLayout.setTranslationY(this.K0 - (bottomYOnScreen - frameLayout.getTranslationY()));
        zqc zqcVar = this.w;
        zqcVar.setTranslationY(this.I0 - (T(zqcVar) - zqcVar.getTranslationY()));
        this.L0 = true;
        requestLayout();
    }

    @Override
    public final void z(int i, boolean z) {
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
        zqc zqcVar = this.w;
        if (z2) {
            T = this.G0;
        } else {
            T = T(zqcVar);
        }
        this.H0 = T;
        this.K0 = getBottomYOnScreen() - this.k0.getTranslationY();
        this.I0 = T(zqcVar) - zqcVar.getTranslationY();
        n0();
    }
}
