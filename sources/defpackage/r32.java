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
public final class r32 extends p02 implements gk7 {
    public float A0;
    public float B0;
    public boolean C0;
    public boolean D0;
    public final ShapeDrawable E;
    public boolean E0;
    public final m17 F;
    public float F0;
    public cm2 G;
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
    public final n32 O;
    public boolean O0;
    public final LinearLayout P;
    public et P0;
    public final FrameLayout Q;
    public TL_wallet.walletTransaction Q0;
    public final TextView R;
    public anc R0;
    public final ppc S;
    public cqc S0;
    public final EditTextBoldCursor T;
    public boolean T0;
    public final hn U;
    public hd U0;
    public final TextView V;
    public boolean V0;
    public final l46 W;
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
    public iu4 j0;
    public final FrameLayout k0;
    public final FrameLayout l0;
    public yla m0;
    public final int n;
    public float n0;
    public float o0;
    public final u41 p0;
    public boolean q0;
    public final TLRPC.User r;
    public final SpannableString r0;
    public final FrameLayout s;
    public final SpannableString s0;
    public String t0;
    public boolean u0;
    public boolean v0;
    public final xoc w;
    public int w0;
    public final r7 x;
    public DecimalFormat x0;
    public final r7 y;
    public final int[] y0;
    public boolean z0;

    public r32(x02 x02Var, Context context, int i, TLRPC.User user, wjb wjbVar) {
        super(x02Var, wjbVar, context);
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
        addView(frameLayout, nme.e(-1, -1, 55));
        r7 a = this.b.U2.t().a(31, 2131231247);
        this.x = a;
        a.setContentDescription(k96.M0(2131754838, null));
        a.e(2, 2131232049, k96.M0(2131742894, null));
        a.e(3, 2131231782, k96.M0(2131742962, null));
        a.setVisibility(8);
        r7 r7Var = new r7(context, null, 0, bkb.v0(bkb.F6, this.a), false, wjbVar);
        this.y = r7Var;
        r7Var.setIcon(2131231247);
        r7Var.setContentDescription(k96.M0(2131754838, null));
        int i2 = bkb.h6;
        ff0 f0 = bkb.f0(bkb.v0(i2, this.a), 1, -1);
        vkb M = zkb.M(i2);
        r7Var.setBackground(f0);
        zkb.j(r7Var, f0, null, M, wjbVar);
        r7Var.setOnClickListener(new wg(this, wjbVar, i, (byte) 5));
        xoc xocVar = new xoc(wjbVar, context, new kx1(this, user, (byte) 16), new kx1(this, wjbVar, (byte) 17));
        this.w = xocVar;
        xocVar.a(this.H, user);
        addView(xocVar, nme.d(-2, 64.0f, 49, 6.0f, 0.0f, 6.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setClipChildren(false);
        frameLayout2.setClipToPadding(false);
        frameLayout.addView(frameLayout2, nme.e(-1, -1, 55));
        ?? linearLayout = new LinearLayout(context);
        this.O = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setOnClickListener(new View.OnClickListener(this) {
            public final r32 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                r32 r32Var = this.b;
                switch (b) {
                    case 0:
                        r32Var.c0();
                        return;
                    case 1:
                        r32Var.Z();
                        return;
                    case 2:
                        r32Var.d0();
                        return;
                    case 3:
                        r32Var.c0();
                        return;
                    case 4:
                        r32Var.c0();
                        return;
                    case 5:
                        r32Var.c0();
                        return;
                    default:
                        r32Var.h0();
                        return;
                }
            }
        });
        frameLayout2.addView((View) linearLayout, nme.e(-1, -2, 17));
        ppc ppcVar = new ppc(context, wjbVar);
        this.S = ppcVar;
        ppcVar.setOnClickListener(new View.OnClickListener(this) {
            public final r32 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                r32 r32Var = this.b;
                switch (b) {
                    case 0:
                        r32Var.c0();
                        return;
                    case 1:
                        r32Var.Z();
                        return;
                    case 2:
                        r32Var.d0();
                        return;
                    case 3:
                        r32Var.c0();
                        return;
                    case 4:
                        r32Var.c0();
                        return;
                    case 5:
                        r32Var.c0();
                        return;
                    default:
                        r32Var.h0();
                        return;
                }
            }
        });
        linearLayout.addView(ppcVar, nme.t(-1, 64, 49, 16, 0, 16, 0));
        EditTextBoldCursor editText = ppcVar.getEditText();
        this.T = editText;
        editText.setFilters(new InputFilter[]{new g32(this, (byte) 0)});
        editText.setImeOptions(33554438);
        editText.setOnTouchListener(new a7(this, (byte) 2));
        editText.setOnClickListener(new View.OnClickListener(this) {
            public final r32 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                r32 r32Var = this.b;
                switch (b) {
                    case 0:
                        r32Var.c0();
                        return;
                    case 1:
                        r32Var.Z();
                        return;
                    case 2:
                        r32Var.d0();
                        return;
                    case 3:
                        r32Var.c0();
                        return;
                    case 4:
                        r32Var.c0();
                        return;
                    case 5:
                        r32Var.c0();
                        return;
                    default:
                        r32Var.h0();
                        return;
                }
            }
        });
        editText.setOnEditorActionListener(new j(this, (byte) 6));
        editText.addTextChangedListener(new o32(this));
        SpannableString spannableString = new SpannableString("⇅");
        this.r0 = spannableString;
        cm2 cm2Var = new cm2(2131232820, 0);
        cm2Var.x = 0.72f;
        spannableString.setSpan(cm2Var, 0, spannableString.length(), 33);
        SpannableString spannableString2 = new SpannableString("G");
        this.s0 = spannableString2;
        cm2 cm2Var2 = new cm2(2131232824, 0);
        cm2Var2.d = false;
        spannableString2.setSpan(cm2Var2, 0, spannableString2.length(), 33);
        hn hnVar = new hn(context, false, true, true, true, true);
        this.U = hnVar;
        hnVar.c.m(0.35f, 320L, 3.5f, s33.h);
        hnVar.setScaleProperty(0.35f);
        hnVar.setText(S(c.C(i), 0L));
        int i3 = bkb.c6;
        int i4 = bkb.y6;
        vkb p = zkb.p(i3, i4);
        zkb.m(hnVar, p.a, p.b, 4, 0.0f, wjbVar);
        hnVar.setTextSize(gl.L(14.0f));
        hnVar.setTypeface(gl.n1("fonts/gram.ttf"));
        hnVar.setGravity(17);
        hnVar.setPadding(gl.L(10.0f), 0, gl.L(10.0f), 0);
        hnVar.setAllowCancel(true);
        ShapeDrawable b0 = bkb.b0(gl.L(14.0f), bkb.p1(0.08f, bkb.v0(i4, this.a)));
        this.E = b0;
        hnVar.setSizeableBackground(b0);
        linearLayout.addView(hnVar, nme.t(-2, 28, 49, 0, 8, 0, 0));
        ote.a(hnVar);
        hnVar.setOnClickListener(new View.OnClickListener(this) {
            public final r32 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                r32 r32Var = this.b;
                switch (b) {
                    case 0:
                        r32Var.c0();
                        return;
                    case 1:
                        r32Var.Z();
                        return;
                    case 2:
                        r32Var.d0();
                        return;
                    case 3:
                        r32Var.c0();
                        return;
                    case 4:
                        r32Var.c0();
                        return;
                    case 5:
                        r32Var.c0();
                        return;
                    default:
                        r32Var.h0();
                        return;
                }
            }
        });
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.Q = frameLayout3;
        linearLayout.addView(frameLayout3, nme.r(-2, -2, 49));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.P = linearLayout2;
        linearLayout2.setOrientation(1);
        frameLayout3.addView(linearLayout2, nme.e(-2, -2, 49));
        TextView textView = new TextView(context);
        this.R = textView;
        textView.setTextSize(1, 14.0f);
        zkb.X(textView, i4, wjbVar);
        textView.setPadding(gl.L(10.0f), 0, gl.L(10.0f), 0);
        de9.q(textView, 17, null, 2131742744);
        frameLayout3.addView(textView, nme.d(-2, 28.0f, 49, 0.0f, 8.0f, 0.0f, 0.0f));
        ote.a(textView);
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final r32 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                r32 r32Var = this.b;
                switch (b) {
                    case 0:
                        r32Var.c0();
                        return;
                    case 1:
                        r32Var.Z();
                        return;
                    case 2:
                        r32Var.d0();
                        return;
                    case 3:
                        r32Var.c0();
                        return;
                    case 4:
                        r32Var.c0();
                        return;
                    case 5:
                        r32Var.c0();
                        return;
                    default:
                        r32Var.h0();
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
        m17 m17Var = new m17(0, true, false, null);
        this.F = m17Var;
        m17Var.x = false;
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = m17Var.c;
        paint.setStyle(style);
        paint.setStrokeWidth(Math.max(1.0f, gl.N(0.5f)));
        int i5 = bkb.am;
        paint.setColor(bkb.v0(i5, this.a));
        m17Var.w = Integer.valueOf(bkb.v0(i5, this.a));
        textView2.setPadding(gl.L(15.0f), gl.L(7.0f), gl.L(19.0f), gl.L(8.0f));
        textView2.setBackground(m17Var);
        textView2.setTextSize(1, 14.0f);
        zkb.X(textView2, i4, wjbVar);
        textView2.setTypeface(gl.o());
        textView2.setVisibility(8);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setMaxLines(4);
        linearLayout2.addView(textView2, nme.t(-2, -2, 49, 32, 12, 32, 0));
        textView2.setOnClickListener(new View.OnClickListener(this) {
            public final r32 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                r32 r32Var = this.b;
                switch (b) {
                    case 0:
                        r32Var.c0();
                        return;
                    case 1:
                        r32Var.Z();
                        return;
                    case 2:
                        r32Var.d0();
                        return;
                    case 3:
                        r32Var.c0();
                        return;
                    case 4:
                        r32Var.c0();
                        return;
                    case 5:
                        r32Var.c0();
                        return;
                    default:
                        r32Var.h0();
                        return;
                }
            }
        });
        ote.b(textView2, 0.02f, 1.2f);
        l46 l46Var = new l46(context, wjbVar);
        this.W = l46Var;
        zkb.X(l46Var, bkb.p7, wjbVar);
        zkb.G(l46Var, bkb.Ei, wjbVar);
        l46Var.setTextSize(1, 14.0f);
        l46Var.setGravity(17);
        l46Var.setTypeface(gl.o());
        l46Var.setPadding(gl.L(10.0f), 0, gl.L(10.0f), 0);
        f0(false);
        linearLayout2.addView(l46Var, nme.t(-2, -2, 49, 0, 10, 0, 0));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.k0 = frameLayout4;
        frameLayout4.setPadding(gl.L(16.0f), 0, gl.L(16.0f), gl.L(12.0f));
        FrameLayout frameLayout5 = new FrameLayout(context);
        this.l0 = frameLayout5;
        frameLayout4.setClipChildren(false);
        frameLayout4.setClipToPadding(false);
        frameLayout5.setClipChildren(false);
        frameLayout5.setClipToPadding(false);
        frameLayout4.addView(frameLayout5, nme.c(-1.0f, -1));
        TextView textView3 = new TextView(context);
        this.a0 = textView3;
        zkb.X(textView3, i4, wjbVar);
        textView3.setTextSize(1, 14.0f);
        textView3.setGravity(17);
        frameLayout5.addView(textView3, nme.e(-1, 20, 55));
        TextView textView4 = new TextView(context);
        this.b0 = textView4;
        zkb.X(textView4, i4, wjbVar);
        textView4.setTextSize(1, 14.0f);
        textView4.setGravity(17);
        textView4.setPadding(0, gl.L(4.0f), 0, gl.L(4.0f));
        textView4.setVisibility(8);
        frameLayout5.addView(textView4, nme.d(-1, -2.0f, 55, 0.0f, 24.0f, 0.0f, 0.0f));
        SpannableString spannableString3 = new SpannableString(k96.M0(2131748587, null));
        this.c0 = spannableString3;
        spannableString3.setSpan(new u86(gl.L(80.0f), textView4), 0, spannableString3.length(), 33);
        u41 i6 = yjb.i(24, wjbVar, context, true);
        this.p0 = i6;
        i6.setText(k96.M0(2131742757, null));
        i6.setEnabled(false);
        i6.setOnClickListener(new View.OnClickListener(this) {
            public final r32 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                r32 r32Var = this.b;
                switch (b) {
                    case 0:
                        r32Var.c0();
                        return;
                    case 1:
                        r32Var.Z();
                        return;
                    case 2:
                        r32Var.d0();
                        return;
                    case 3:
                        r32Var.c0();
                        return;
                    case 4:
                        r32Var.c0();
                        return;
                    case 5:
                        r32Var.c0();
                        return;
                    default:
                        r32Var.h0();
                        return;
                }
            }
        });
        frameLayout5.addView(i6, nme.e(-1, 48, 87));
        frameLayout.addView(frameLayout4, nme.d(-1, 92.0f, 87, 0.0f, 0.0f, 0.0f, 70.0f));
        o0(false, false);
        kk7.f(i).b(this, kk7.c4);
        j0();
        this.J = true;
        c.C(i).i0(user, new i32(this, (byte) 0));
    }

    public static int R(BigDecimal bigDecimal) {
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

    public static String T(long j) {
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
        return U(this.k0);
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
        double d = na7.q1(this.n).k4.k.i;
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
        a43 a43Var = c.C(this.n).h;
        TL_wallet.currencyRates f = a43Var.f();
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
            if (currencyrate2 != null && TextUtils.equals(currencyrate2.currency, a43Var.g())) {
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
        float U;
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
        xoc xocVar = this.w;
        if (z2) {
            U = this.G0;
        } else {
            U = U(xocVar);
        }
        this.H0 = U;
        this.K0 = getBottomYOnScreen() - this.k0.getTranslationY();
        this.I0 = U(xocVar) - xocVar.getTranslationY();
        n0();
    }

    @Override
    public final void B() {
        P();
        g0();
    }

    @Override
    public final void C(int i, int i2) {
        boolean z;
        int L;
        int i3;
        int L2;
        x02 x02Var = this.b;
        if (x02Var.o3.Q() > gl.L(20.0f)) {
            z = true;
        } else {
            z = false;
        }
        this.z0 = z;
        this.f = z;
        if (z) {
            L = 0;
        } else {
            L = gl.L(70.0f);
        }
        int round = Math.round(gl.L(32.0f) * this.f0) + gl.L(92.0f);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.k0.getLayoutParams();
        layoutParams.height = round;
        layoutParams.bottomMargin = L;
        if (this.z0) {
            i3 = gl.L(56.0f);
            x02Var.r0 = false;
        } else {
            if (!gl.O1()) {
                Point point = gl.q;
                if (point.x > point.y) {
                    i3 = (int) (i2 / 3.5f);
                    x02Var.r0 = true;
                }
            }
            i3 = (i2 / 5) << 1;
            x02Var.r0 = true;
        }
        int c = b00.c(1.0f, i3, 0) + gl.m;
        FrameLayout frameLayout = this.s;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
        if (layoutParams2.topMargin != c) {
            layoutParams2.topMargin = c;
            frameLayout.setLayoutParams(layoutParams2);
        }
        int e = ls6.e(4.0f, c - gl.m, 0);
        xoc xocVar = this.w;
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) xocVar.getLayoutParams();
        if (this.z0) {
            L2 = gl.L(4.0f) + a.getCurrentActionBarHeight();
        } else {
            L2 = e - gl.L(4.0f);
        }
        int max = Math.max(0, L2);
        if (layoutParams3.topMargin != max) {
            layoutParams3.topMargin = max;
            xocVar.setLayoutParams(layoutParams3);
        }
        k0();
    }

    @Override
    public final void I(p02 p02Var) {
        Activity W;
        P();
        if (this.M == null && !gl.O1()) {
            Point point = gl.q;
            if (Math.min(point.x, point.y) < gl.L(700.0f) && (W = gl.W(getContext())) != null) {
                try {
                    this.N = W.getRequestedOrientation();
                    W.setRequestedOrientation(1);
                    this.M = W;
                } catch (Exception e) {
                    fa4.g(e, true);
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
        xoc xocVar = this.w;
        xocVar.setTranslationY(0.0f);
        xocVar.setAlpha(1.0f);
        this.E0 = false;
        x02 x02Var = this.b;
        x02Var.U2.setTitle(k96.M0(2131742753, null));
        x02Var.U2.setDrawGlassTitle(false);
        this.x.setVisibility(0);
        editTextBoldCursor.clearFocus();
        Y();
        ppc ppcVar = this.S;
        if (ppcVar.getDiamondView().f == null) {
            f = 1.0f;
        }
        this.o0 = f;
        this.n0 = f;
        m0();
        if (this.n0 < 1.0f) {
            ppcVar.getDiamondView().l(new j32(this, (byte) 3));
        }
    }

    @Override
    public final void J() {
        this.M0 = true;
        post(new j32(this, (byte) 4));
    }

    @Override
    public final boolean O() {
        return !this.O0;
    }

    public final void P() {
        this.S.getDiamondView().l(null);
        yla ylaVar = this.m0;
        if (ylaVar != null) {
            ylaVar.d();
        }
        this.n0 = 1.0f;
        m0();
    }

    public final String Q(long j, BigDecimal bigDecimal) {
        BigDecimal stripTrailingZeros;
        BigDecimal movePointLeft = BigDecimal.valueOf(j).multiply(bigDecimal).movePointLeft(9);
        int max = Math.max(0, Math.min(getCurrencyFractionDigits(), 20));
        RoundingMode roundingMode = RoundingMode.HALF_UP;
        BigDecimal scale = movePointLeft.setScale(max, roundingMode);
        if (scale.signum() == 0 && movePointLeft.signum() != 0) {
            scale = movePointLeft.setScale(Math.min(20, Math.max(max, movePointLeft.scale())), roundingMode);
        }
        int R = R(bigDecimal);
        if (scale.scale() > R) {
            scale = scale.setScale(R, RoundingMode.DOWN);
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

    public final SpannableStringBuilder S(c cVar, long j) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("≈ ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append(cVar.q(j, false));
        e0(spannableStringBuilder, length, spannableStringBuilder.length(), getCurrencyDecimalSeparator());
        return spannableStringBuilder.append((CharSequence) " ").append((CharSequence) this.r0);
    }

    public final float U(View view) {
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

    public final float V(View view) {
        if (view.getVisibility() == 0 && view.getAlpha() > 0.0f) {
            return ((1.0f - view.getScaleY()) * view.getPivotY()) + (U(view) - this.l0.getTranslationY());
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
            i5 = R(currencyPerGram);
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
            iu4 iu4Var = this.j0;
            byte[] bArr = null;
            if (iu4Var != null) {
                iu4Var.run();
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
                this.j0 = C.l(str, max, str2, bArr, new i32(this, (byte) 1));
            }
        }
    }

    public final void Z() {
        if (!this.L && !this.O0 && this.P0 == null && this.U0 == null) {
            c0();
            et etVar = new et(this, SystemClock.uptimeMillis() + 1500, (byte) 7);
            this.P0 = etVar;
            post(etVar);
        }
    }

    public final void b0() {
        if (this.M0 && !this.C0 && !this.L0 && isAttachedToWindow() && Math.abs(getTranslationY()) < 0.5f && this.O.getHeight() > 0 && this.k0.getHeight() > 0) {
            this.F0 = getBottomYOnScreen();
            this.G0 = U(this.w);
            this.E0 = true;
        }
    }

    public final void c0() {
        if (!this.L && !this.O0) {
            x02 x02Var = this.b;
            if (!x02Var.J) {
                if (!this.M0) {
                    this.N0 = true;
                    return;
                }
                this.N0 = false;
                EditTextBoldCursor editTextBoldCursor = this.T;
                editTextBoldCursor.setFocusableInTouchMode(true);
                editTextBoldCursor.setShowSoftInputOnFocus(true);
                x02Var.c1(editTextBoldCursor, true);
                editTextBoldCursor.requestFocus();
                gl.F3(editTextBoldCursor);
                editTextBoldCursor.postDelayed(new j32(this, (byte) 1), 220L);
            }
        }
    }

    @Override
    public final void d() {
        try {
            r7 r7Var = this.y;
            wjb wjbVar = this.a;
            if (r7Var != null) {
                r7Var.setIconColor(bkb.v0(bkb.F6, wjbVar));
            }
            ShapeDrawable shapeDrawable = this.E;
            if (shapeDrawable != null) {
                bkb.A1(bkb.p1(0.08f, bkb.v0(bkb.y6, wjbVar)), shapeDrawable);
                hn hnVar = this.U;
                if (hnVar != null) {
                    hnVar.invalidate();
                }
            }
            m17 m17Var = this.F;
            if (m17Var != null) {
                int v0 = bkb.v0(bkb.am, wjbVar);
                m17Var.c.setColor(v0);
                m17Var.w = Integer.valueOf(v0);
                TextView textView = this.V;
                if (textView != null) {
                    textView.invalidate();
                }
            }
            cm2 cm2Var = this.G;
            if (cm2Var != null) {
                cm2Var.y = bkb.v0(bkb.Ei, wjbVar);
                l46 l46Var = this.W;
                if (l46Var != null) {
                    l46Var.invalidate();
                }
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    public final void d0() {
        boolean z;
        String T;
        u41 u41Var = this.p0;
        if (u41Var.e0 && !u41Var.R) {
            c C = c.C(this.n);
            long gramNanoAmount = getGramNanoAmount();
            long z2 = C.z();
            if (WalletEngine2.isValidAddress(this.H) && gramNanoAmount > 0) {
                long f = na7.q1(this.n).k4.p0.f();
                byte[] bArr = null;
                if (gramNanoAmount < f) {
                    if (this.v0) {
                        T = Q(f, getCurrencyPerGram());
                    } else {
                        T = T(f);
                    }
                    this.T.setText(T);
                    this.T.setSelection(T.length());
                    EditTextBoldCursor editTextBoldCursor = this.T;
                    int i = -this.w0;
                    this.w0 = i;
                    gl.B3(i, editTextBoldCursor, null);
                } else if (gramNanoAmount > z2) {
                    pw0.APP_ERROR.a();
                    l46 l46Var = this.W;
                    int i2 = -this.w0;
                    this.w0 = i2;
                    gl.B3(i2, l46Var, null);
                } else {
                    na7 q1 = na7.q1(this.n);
                    long K1 = q1.K1(this.r.id);
                    if (q1.k4.o0.f && K1 > 0 && (gramNanoAmount / 1.0E9d) * q1.k4.k.i < (K1 / 1000.0d) * q1.k4.s3.i) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.T0 = z;
                    this.p0.setLoading(true);
                    this.O0 = true;
                    this.N0 = false;
                    et etVar = this.P0;
                    if (etVar != null) {
                        removeCallbacks(etVar);
                        this.P0 = null;
                    }
                    this.Q0 = null;
                    TLRPC.User user = this.r;
                    String str = this.H;
                    String str2 = this.t0;
                    if (this.u0) {
                        bArr = getPublicKey();
                    }
                    C.l0(user, str, gramNanoAmount, str2, bArr, null, null, new p8c(this) {
                        public final r32 b;

                        {
                            this.b = this;
                        }

                        @Override
                        public final void a(Object obj) {
                            byte b = r2;
                            r32 r32Var = this.b;
                            switch (b) {
                                case 0:
                                    String str3 = (String) obj;
                                    u41 u41Var2 = r32Var.p0;
                                    x02 x02Var = r32Var.b;
                                    if (!r32Var.L && !x02Var.J) {
                                        if (c.K(str3)) {
                                            u41Var2.setLoading(false);
                                            r32Var.O0 = false;
                                            return;
                                        } else if (TextUtils.isEmpty(str3)) {
                                            x02Var.dismiss();
                                            return;
                                        } else {
                                            u41Var2.setLoading(false);
                                            r32Var.O0 = false;
                                            u21.Y().f0(str3, false);
                                            return;
                                        }
                                    }
                                    return;
                                default:
                                    r32Var.Q0 = (TL_wallet.walletTransaction) obj;
                                    return;
                            }
                        }
                    }, new p8c(this) {
                        public final r32 b;

                        {
                            this.b = this;
                        }

                        @Override
                        public final void a(Object obj) {
                            byte b = r2;
                            r32 r32Var = this.b;
                            switch (b) {
                                case 0:
                                    String str3 = (String) obj;
                                    u41 u41Var2 = r32Var.p0;
                                    x02 x02Var = r32Var.b;
                                    if (!r32Var.L && !x02Var.J) {
                                        if (c.K(str3)) {
                                            u41Var2.setLoading(false);
                                            r32Var.O0 = false;
                                            return;
                                        } else if (TextUtils.isEmpty(str3)) {
                                            x02Var.dismiss();
                                            return;
                                        } else {
                                            u41Var2.setLoading(false);
                                            r32Var.O0 = false;
                                            u21.Y().f0(str3, false);
                                            return;
                                        }
                                    }
                                    return;
                                default:
                                    r32Var.Q0 = (TL_wallet.walletTransaction) obj;
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
        if (i == kk7.c4) {
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
        l46 l46Var = this.W;
        if (z) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) k96.M0(2131742840, null));
            spannableStringBuilder.append((CharSequence) " ");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) k96.M0(2131742894, null));
            spannableStringBuilder.append((CharSequence) " >");
            cm2 cm2Var = new cm2(2131232702, 0);
            cm2Var.y = bkb.v0(bkb.Ei, this.a);
            float N = gl.N(0.66f);
            cm2Var.r = 0.0f;
            cm2Var.s = N;
            this.G = cm2Var;
            spannableStringBuilder.setSpan(cm2Var, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            spannableStringBuilder.setSpan(new r21(this, (byte) 4), length, spannableStringBuilder.length(), 33);
            l46Var.setText(spannableStringBuilder);
        }
        ViewPropertyAnimator animate = l46Var.animate();
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
        scaleX.scaleY(f3).setDuration(320L).setInterpolator(s33.h).start();
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
        return gl.L(62.0f);
    }

    @Override
    public int getCurrentItemTop() {
        int top = this.s.getTop();
        if (top <= 0) {
            top = getListTopPadding();
        }
        return gl.L(13.0f) + Math.max(0, top - (gl.L(12.0f) + gl.m));
    }

    @Override
    public int getCustomBackground() {
        return bkb.v0(bkb.c6, this.a);
    }

    @Override
    public int getFirstOffset() {
        return gl.L(5.0f) + getListTopPadding();
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
        String T;
        BigDecimal currencyPerGram = getCurrencyPerGram();
        if (!this.v0 && currencyPerGram.signum() <= 0) {
            return;
        }
        long gramNanoAmount = getGramNanoAmount();
        this.v0 = !this.v0;
        this.S.d(c.C(this.n), this.v0);
        if (gramNanoAmount <= 0) {
            T = "";
        } else if (this.v0) {
            T = Q(gramNanoAmount, currencyPerGram);
        } else {
            T = T(gramNanoAmount);
        }
        EditTextBoldCursor editTextBoldCursor = this.T;
        editTextBoldCursor.setText(T);
        editTextBoldCursor.setSelection(T.length());
    }

    public final void i0() {
        boolean z;
        boolean z2;
        boolean z3;
        CharSequence V;
        SpannableStringBuilder S;
        String T;
        k0();
        int i = this.n;
        c C = c.C(i);
        long z4 = C.z();
        long gramNanoAmount = getGramNanoAmount();
        long f = na7.q1(i).k4.p0.f();
        int i2 = (gramNanoAmount > 0L ? 1 : (gramNanoAmount == 0L ? 0 : -1));
        EditTextBoldCursor editTextBoldCursor = this.T;
        if (i2 > 0 && gramNanoAmount < f) {
            if (this.v0) {
                T = Q(f, getCurrencyPerGram());
            } else {
                T = T(f);
            }
            editTextBoldCursor.setText(T);
            editTextBoldCursor.setSelection(T.length());
            int i3 = -this.w0;
            this.w0 = i3;
            gl.B3(i3, editTextBoldCursor, null);
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
        u41 u41Var = this.p0;
        u41Var.setLoading(z3);
        if (TextUtils.isEmpty(gramsText)) {
            V = k96.M0(2131742757, null);
        } else {
            V = k96.V(null, null, 2131742758, c.p("Grams", gramsText, 2131749315));
        }
        u41Var.i(V, true, true);
        boolean isEmpty = TextUtils.isEmpty(editTextBoldCursor.getText());
        boolean z6 = !isEmpty;
        if (!isEmpty && z && !this.K) {
            z5 = true;
        }
        u41Var.setEnabled(z5);
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
            spannableStringBuilder.append((CharSequence) k96.M0(2131749341, null));
            spannableStringBuilder.setSpan(new RelativeSizeSpan(0.85714287f), length2, spannableStringBuilder.length(), 33);
            S = spannableStringBuilder.append((CharSequence) " ").append((CharSequence) this.r0);
        } else {
            S = S(C, gramNanoAmount);
        }
        this.U.setText(S);
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
        this.a0.setText(k96.V(null, null, 2131742942, c.p("Grams", c.t(C.z(), true), 2131749315)));
        long f2 = na7.q1(i).k4.p0.f();
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
                this.g0.setInterpolator(s33.h);
                this.g0.addUpdateListener(new uz1(this, (byte) 2));
                this.g0.start();
            } else {
                setFeeVisibilityProgress(f);
            }
        }
        long j = this.h0;
        int i2 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        TextView textView = this.b0;
        if (i2 >= 0) {
            textView.setText(k96.V(null, null, 2131742828, c.w(j, false)));
        } else {
            textView.setText(k96.V(null, null, 2131742828, this.c0));
        }
    }

    @Override
    public final boolean k() {
        if (this.b.o3.Q() <= gl.L(20.0f)) {
            return false;
        }
        this.N0 = false;
        et etVar = this.P0;
        if (etVar != null) {
            removeCallbacks(etVar);
            this.P0 = null;
        }
        EditTextBoldCursor editTextBoldCursor = this.T;
        editTextBoldCursor.clearFocus();
        gl.t1(editTextBoldCursor);
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
                    public final r32 b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void run() {
                        byte b = r3;
                        int i = 4;
                        boolean z2 = z;
                        r32 r32Var = this.b;
                        switch (b) {
                            case 0:
                                LinearLayout linearLayout2 = r32Var.P;
                                if (z2) {
                                    i = 0;
                                }
                                linearLayout2.setVisibility(i);
                                return;
                            default:
                                TextView textView2 = r32Var.R;
                                if (!z2) {
                                    i = 0;
                                }
                                textView2.setVisibility(i);
                                return;
                        }
                    }
                }).setDuration(320L);
                s33 s33Var = s33.h;
                duration.setInterpolator(s33Var).start();
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
                    public final r32 b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void run() {
                        byte b = r3;
                        int i = 4;
                        boolean z2 = z;
                        r32 r32Var = this.b;
                        switch (b) {
                            case 0:
                                LinearLayout linearLayout2 = r32Var.P;
                                if (z2) {
                                    i = 0;
                                }
                                linearLayout2.setVisibility(i);
                                return;
                            default:
                                TextView textView2 = r32Var.R;
                                if (!z2) {
                                    i = 0;
                                }
                                textView2.setVisibility(i);
                                return;
                        }
                    }
                }).setDuration(320L).setInterpolator(s33Var).start();
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
                float U = U(view2);
                xoc xocVar = this.w;
                if (xocVar.getVisibility() == 0) {
                    f = Math.max(U, (xocVar.getScaleY() * (xocVar.getContentBottom() - xocVar.getPivotY())) + xocVar.getPivotY() + U(xocVar));
                } else {
                    f = U;
                }
                float max = Math.max(0.0f, Math.min(Math.min(Math.min((U + view2.getHeight()) - ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).bottomMargin, V(this.a0)), V(this.b0)), V(this.p0)) - f);
                float min = Math.min(1.0f, Math.max(0.0f, max - (Math.min(gl.L(12.0f), max / 4.0f) * 2.0f)) / view.getHeight());
                view.setPivotX(view.getWidth() / 2.0f);
                view.setPivotY(view.getHeight() / 2.0f);
                view.setScaleX(min);
                view.setScaleY(min);
                float f2 = (max / 2.0f) + f;
                view.setTranslationY(f2 - ((view.getHeight() / 2.0f) + (U(view) - view.getTranslationY())));
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
        ppc ppcVar = this.S;
        ppcVar.e(f2, max, z);
        ppcVar.setTranslationY((1.0f - this.n0) * (((this.O.getHeight() / 2.0f) - ppcVar.getTop()) - (ppcVar.getHeight() / 2.0f)));
        float f3 = this.o0;
        hn hnVar = this.U;
        hnVar.setAlpha(f3);
        hnVar.setTranslationY(gl.L(16.0f) * f);
        float f4 = this.o0;
        FrameLayout frameLayout = this.Q;
        frameLayout.setAlpha(f4);
        frameLayout.setTranslationY(gl.L(16.0f) * f);
        float f5 = this.o0;
        FrameLayout frameLayout2 = this.l0;
        frameLayout2.setAlpha(f5);
        frameLayout2.setTranslationY(gl.L(24.0f) * f);
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
                float A = tb4.A(this.K0, f2, f, f2);
                float f3 = this.H0;
                float A2 = tb4.A(this.I0, f3, f, f3);
                frameLayout.setTranslationY(A - (getBottomYOnScreen() - frameLayout.getTranslationY()));
                xoc xocVar = this.w;
                xocVar.setTranslationY(A2 - (U(xocVar) - xocVar.getTranslationY()));
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
        u41 u41Var = this.p0;
        u41Var.animate().cancel();
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
            f3 = gl.L(60.0f);
        }
        int i = 0;
        if (!z2) {
            if (!z) {
                i = 4;
            }
            u41Var.setVisibility(i);
            u41Var.setAlpha(f2);
            u41Var.setScaleX(f);
            u41Var.setScaleY(f);
            textView.setTranslationY(f3);
            textView2.setTranslationY(f3);
            return;
        }
        u41Var.setVisibility(0);
        ViewPropertyAnimator duration = u41Var.animate().alpha(f2).scaleX(f).scaleY(f).setDuration(320L);
        s33 s33Var = s33.h;
        duration.setInterpolator(s33Var).withEndAction(new j32(this, (byte) 5)).start();
        textView.animate().translationY(f3).setDuration(320L).setInterpolator(s33Var).start();
        textView2.animate().translationY(f3).setDuration(320L).setInterpolator(s33Var).start();
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
    public final void q() {
        if (this.L) {
            return;
        }
        this.L = true;
        P();
        anc ancVar = this.R0;
        if (ancVar != null) {
            AnimatorSet animatorSet = ancVar.m;
            if (!ancVar.v) {
                if (animatorSet.isStarted()) {
                    animatorSet.cancel();
                } else {
                    ancVar.a(false);
                }
            }
            this.R0 = null;
        }
        cqc cqcVar = this.S0;
        if (cqcVar != null) {
            AnimatorSet animatorSet2 = cqcVar.m;
            if (!cqcVar.s) {
                if (animatorSet2.isStarted()) {
                    animatorSet2.cancel();
                } else {
                    cqcVar.b();
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
                fa4.g(e, true);
            }
            this.M = null;
        }
        this.P.animate().cancel();
        this.R.animate().cancel();
        this.W.animate().cancel();
        this.p0.animate().cancel();
        this.a0.animate().cancel();
        this.b0.animate().cancel();
        et etVar = this.P0;
        if (etVar != null) {
            removeCallbacks(etVar);
            this.P0 = null;
        }
        hd hdVar = this.U0;
        if (hdVar != null) {
            hdVar.dismiss();
        }
        iu4 iu4Var = this.j0;
        if (iu4Var != null) {
            iu4Var.run();
            this.j0 = null;
        }
        kk7.f(this.n).n(this, kk7.c4);
        this.b.U2.t().removeView(this.x);
        gl.t1(this.T);
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
        P();
        Activity activity = this.M;
        if (activity != null) {
            try {
                activity.setRequestedOrientation(this.N);
            } catch (Exception e) {
                fa4.g(e, true);
            }
            this.M = null;
        }
        this.b.U2.setDrawGlassTitle(true);
        this.M0 = false;
        this.N0 = false;
        et etVar = this.P0;
        if (etVar != null) {
            removeCallbacks(etVar);
            this.P0 = null;
        }
        hd hdVar = this.U0;
        if (hdVar != null) {
            hdVar.dismiss();
        }
        this.x.setVisibility(8);
        EditTextBoldCursor editTextBoldCursor = this.T;
        gl.t1(editTextBoldCursor);
        editTextBoldCursor.clearFocus();
    }

    @Override
    public final void x(int i) {
        if (i == 2) {
            hmc.L0(this.n, this.a, getContext());
        } else if (i == 3) {
            Z();
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
        xoc xocVar = this.w;
        xocVar.setTranslationY(this.I0 - (U(xocVar) - xocVar.getTranslationY()));
        this.L0 = true;
        requestLayout();
    }
}
