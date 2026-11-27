package defpackage;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.InputFilter;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.Wallet.c;
public final class euc extends n9c implements fn7 {
    public LinearLayout E;
    public duc F;
    public ShapeDrawable G;
    public t37 H;
    public EditTextBoldCursor I;
    public boolean J;
    public final Runnable K;
    public final ViewTreeObserver.OnWindowFocusChangeListener L;
    public SpannableString M;
    public SpannableString N;
    public in O;
    public TextView P;
    public TextView Q;
    public p66 R;
    public TextView S;
    public SpannableString T;
    public fx0 U;
    public SpannableString V;
    public boolean W;
    public boolean X;
    public float Y;
    public ValueAnimator Z;
    public LinearLayout a0;
    public vpa b0;
    public float c0;
    public float d0;
    public TL_wallet.walletUserAddress e;
    public c51 e0;
    public TLRPC.User f;
    public long f0;
    public boolean g0;
    public String h;
    public String h0;
    public boolean i0;
    public int j0;
    public int k0;
    public boolean l0;
    public boolean m0;
    public String n;
    public DecimalFormat n0;
    public DecimalFormat o0;
    public int p0;
    public boolean q0;
    public boolean r;
    public TL_wallet.walletTransaction r0;
    public long s;
    public uqc s0;
    public quc t0;
    public zu1 u0;
    public nrc v0;
    public ktc w;
    public int w0;
    public g7 x;
    public int x0;
    public FrameLayout y;

    public euc(int i, String str) {
        this.s = 0L;
        this.K = new ptc(this, (byte) 0);
        this.L = new ViewTreeObserver.OnWindowFocusChangeListener() {
            @Override
            public final void onWindowFocusChanged(boolean z) {
                EditTextBoldCursor editTextBoldCursor;
                euc eucVar = euc.this;
                Runnable runnable = eucVar.K;
                if (z && eucVar.J && (editTextBoldCursor = eucVar.I) != null) {
                    editTextBoldCursor.removeCallbacks(runnable);
                    eucVar.I.post(runnable);
                }
            }
        };
        this.f0 = -1L;
        this.i0 = true;
        this.p0 = 6;
        setCurrentAccount(i);
        this.f = null;
        this.h = str;
        r0();
        this.r = true;
        c.C(this.currentAccount).j0(new rtc(this, (byte) 0), str);
    }

    public static int c0(euc eucVar) {
        return eucVar.currentAccount;
    }

    public static int d0(euc eucVar) {
        return eucVar.currentAccount;
    }

    public static int h0(BigDecimal bigDecimal) {
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

    public static String l0(long j) {
        BigDecimal stripTrailingZeros;
        BigDecimal scale = BigDecimal.valueOf(j).movePointLeft(9).setScale(2, RoundingMode.HALF_UP);
        if (scale.signum() == 0) {
            stripTrailingZeros = new BigDecimal(BigInteger.ZERO, 0);
        } else {
            stripTrailingZeros = scale.stripTrailingZeros();
        }
        return stripTrailingZeros.toPlainString();
    }

    public static BigDecimal t0(String str) {
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

    public static void z0(SpannableStringBuilder spannableStringBuilder, int i, int i2, char c) {
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

    public final void A0(String str) {
        this.n = str;
        a aVar = this.actionBar;
        if (aVar != null) {
            aVar.setTitle(ob6.M0(2131742647, null));
        }
    }

    public final void B0(boolean z) {
        float f;
        float f2 = 0.0f;
        if (z) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) ob6.M0(2131742734, null));
            spannableStringBuilder.append((CharSequence) " ");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) ob6.M0(2131742788, null));
            spannableStringBuilder.append((CharSequence) " >");
            wm2 wm2Var = new wm2(2131232713, 0);
            float N = hl.N(0.66f);
            wm2Var.r = 0.0f;
            wm2Var.s = N;
            spannableStringBuilder.setSpan(wm2Var, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            spannableStringBuilder.setSpan(new a31(this, (byte) 11), length, spannableStringBuilder.length(), 33);
            this.R.setText(spannableStringBuilder);
        }
        ViewPropertyAnimator animate = this.R.animate();
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

    public final void C0() {
        boolean z;
        boolean z2;
        String str;
        boolean z3;
        CharSequence V;
        String l0;
        E0();
        if (this.I != null && this.e0 != null) {
            c C = c.C(this.currentAccount);
            long z4 = C.z();
            long k0 = k0();
            long f = uc7.s1(this.currentAccount).l4.x0.f();
            int i = (k0 > 0L ? 1 : (k0 == 0L ? 0 : -1));
            if (i > 0 && k0 < f) {
                if (this.l0) {
                    l0 = g0(f, i0());
                } else {
                    l0 = l0(f);
                }
                this.F.setAmountText(l0);
                this.I.setSelection(l0.length());
                EditTextBoldCursor editTextBoldCursor = this.I;
                int i2 = -this.p0;
                this.p0 = i2;
                hl.A3(i2, editTextBoldCursor, null);
                return;
            }
            if (WalletEngine2.isValidRecipientAddress(this.h) && !this.r && i > 0 && k0 <= z4) {
                z = true;
            } else {
                z = false;
            }
            if (!TextUtils.isEmpty(this.I.getText()) && k0 > z4) {
                z2 = true;
            } else {
                z2 = false;
            }
            B0(z2);
            long k02 = k0();
            DecimalFormat decimalFormat = this.n0;
            if (decimalFormat == null) {
                decimalFormat = new DecimalFormat("#,##0.#########", new DecimalFormatSymbols(Locale.US));
                this.n0 = decimalFormat;
            }
            if (k02 > 0) {
                str = decimalFormat.format(BigDecimal.valueOf(k02, 9));
            } else {
                str = "";
            }
            c51 c51Var = this.e0;
            if (!this.r && !this.q0) {
                z3 = false;
            } else {
                z3 = true;
            }
            c51Var.setLoading(z3);
            c51 c51Var2 = this.e0;
            if (TextUtils.isEmpty(str)) {
                V = ob6.M0(2131742651, null);
            } else {
                V = ob6.V(null, null, 2131742652, c.p("Grams", str, 2131749261));
            }
            c51Var2.i(V, true, true);
            this.e0.setEnabled(z);
            D0();
            F0();
            boolean z5 = this.l0;
            in inVar = this.O;
            if (z5) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) this.N).append((CharSequence) " ");
                int length = spannableStringBuilder.length();
                if (this.o0 == null) {
                    DecimalFormat decimalFormat2 = new DecimalFormat("#,##0.##", new DecimalFormatSymbols(Locale.US));
                    this.o0 = decimalFormat2;
                    decimalFormat2.setRoundingMode(RoundingMode.HALF_UP);
                }
                spannableStringBuilder.append((CharSequence) this.o0.format(BigDecimal.valueOf(k0).movePointLeft(9)));
                z0(spannableStringBuilder, length, spannableStringBuilder.length(), '.');
                spannableStringBuilder.append((CharSequence) " ");
                int length2 = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) ob6.M0(2131749287, null));
                spannableStringBuilder.setSpan(new RelativeSizeSpan(0.85714287f), length2, spannableStringBuilder.length(), 33);
                inVar.setText(spannableStringBuilder.append((CharSequence) " ").append((CharSequence) this.M));
                return;
            }
            inVar.setText(j0(C, k0));
        }
    }

    public final void D0() {
        boolean z;
        boolean z2;
        float f;
        if (this.S != null) {
            c C = c.C(this.currentAccount);
            this.S.setText(ob6.V(null, null, 2131742836, c.p("Grams", c.t(C.z(), false), 2131749261)));
            boolean z3 = this.X;
            EditTextBoldCursor editTextBoldCursor = this.I;
            if (editTextBoldCursor != null && !TextUtils.isEmpty(editTextBoldCursor.getText())) {
                z = true;
            } else {
                z = false;
            }
            this.X = z3 | z;
            if ((!C.L() || c.b(C.x(), this.h)) && this.X) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                long j = this.f0;
                int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
                fx0 fx0Var = this.U;
                if (i >= 0) {
                    fx0Var.setText(ob6.V(null, null, 2131742722, c.w(j, false)));
                } else {
                    fx0Var.setText(ob6.V(null, null, 2131742722, this.V));
                }
            }
            if (this.W == z2) {
                return;
            }
            this.W = z2;
            ValueAnimator valueAnimator = this.Z;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.Z = null;
            }
            if (z2) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            if (!this.U.isAttachedToWindow()) {
                y0(f);
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.Y, f);
            this.Z = ofFloat;
            ofFloat.setDuration(320L);
            this.Z.setInterpolator(k43.h);
            this.Z.addUpdateListener(new pzb(this, (byte) 18));
            this.Z.start();
        }
    }

    public final void E0() {
        final boolean z;
        float f;
        float f2;
        float f3;
        float f4;
        if (this.E != null && this.P != null) {
            if (k0() <= 0 && this.Q.getVisibility() != 0) {
                z = false;
            } else {
                z = true;
            }
            if (z != this.m0) {
                this.m0 = z;
                this.E.setVisibility(0);
                this.P.setVisibility(0);
                ViewPropertyAnimator animate = this.E.animate();
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
                    public final euc b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void run() {
                        byte b = r3;
                        int i = 4;
                        boolean z2 = z;
                        euc eucVar = this.b;
                        switch (b) {
                            case 0:
                                LinearLayout linearLayout = eucVar.E;
                                if (z2) {
                                    i = 0;
                                }
                                linearLayout.setVisibility(i);
                                return;
                            default:
                                TextView textView = eucVar.P;
                                if (!z2) {
                                    i = 0;
                                }
                                textView.setVisibility(i);
                                return;
                        }
                    }
                }).setDuration(320L);
                k43 k43Var = k43.h;
                duration.setInterpolator(k43Var).start();
                ViewPropertyAnimator animate2 = this.P.animate();
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
                    public final euc b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void run() {
                        byte b = r3;
                        int i = 4;
                        boolean z2 = z;
                        euc eucVar = this.b;
                        switch (b) {
                            case 0:
                                LinearLayout linearLayout = eucVar.E;
                                if (z2) {
                                    i = 0;
                                }
                                linearLayout.setVisibility(i);
                                return;
                            default:
                                TextView textView = eucVar.P;
                                if (!z2) {
                                    i = 0;
                                }
                                textView.setVisibility(i);
                                return;
                        }
                    }
                }).setDuration(320L).setInterpolator(k43Var).start();
            }
        }
    }

    public final void F0() {
        this.F.d(c.C(this.currentAccount), this.l0);
    }

    public final void G0() {
        boolean z;
        float f = this.c0;
        float f2 = 1.0f - f;
        float max = Math.max(this.d0, Math.max(0.0f, Math.min(1.0f, f)));
        this.d0 = max;
        float f3 = 1.0f - max;
        duc ducVar = this.F;
        float f4 = this.c0;
        if (this.b0 == null && f4 == 1.0f) {
            z = true;
        } else {
            z = false;
        }
        ducVar.e(f4, max, z);
        this.F.setTranslationY((((this.x.getHeight() / 2.0f) - this.F.getTop()) - (this.F.getHeight() / 2.0f)) * f2);
        this.O.setAlpha(this.d0);
        this.O.setTranslationY(hl.L(16.0f) * f3);
        this.y.setAlpha(this.d0);
        this.y.setTranslationY(hl.L(16.0f) * f3);
        this.a0.setAlpha(this.d0);
        for (int i = 0; i < this.a0.getChildCount(); i++) {
            this.a0.getChildAt(i).setTranslationY(hl.L(24.0f) * f3);
        }
    }

    @Override
    public final CharSequence Z() {
        return ob6.M0(2131742647, null);
    }

    @Override
    public final boolean b0(b8c b8cVar, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        BigDecimal stripTrailingZeros;
        View createView = super.createView(context);
        this.fragmentView = createView;
        createView.setFocusableInTouchMode(true);
        this.a.setVisibility(8);
        View view = this.fragmentView;
        int i = aob.d6;
        yob.h(i, getResourceProvider(), view);
        yob.h(i, getResourceProvider(), this.actionBar);
        this.actionBar.setCastShadows(false);
        s7 a = this.actionBar.u().a(1, 2131231247);
        a.setContentDescription(ob6.M0(2131754834, null));
        a.e(2, 2131232049, ob6.M0(2131742788, null));
        a.e(3, 2131231782, ob6.M0(2131742856, null));
        this.actionBar.setActionBarMenuOnItemClick(new rn8(this, (byte) 28));
        FrameLayout frameLayout = (FrameLayout) this.fragmentView;
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        ktc ktcVar = new ktc(this.resourceProvider, context, new ptc(this, (byte) 5), new ptc(this, (byte) 6));
        this.w = ktcVar;
        frameLayout.addView(ktcVar, tre.d(-2, 64.0f, 49, 16.0f, 5.0f, 16.0f, 0.0f));
        ktc ktcVar2 = this.w;
        if (ktcVar2 != null) {
            ktcVar2.a(this.h, this.f);
        }
        g7 g7Var = new g7(this, context);
        this.x = g7Var;
        g7Var.setOrientation(1);
        this.x.setClipChildren(false);
        this.x.setClipToPadding(false);
        frameLayout.addView(this.x, tre.e(-1, -2, 17));
        duc ducVar = new duc(context, getResourceProvider());
        this.F = ducVar;
        if (ducVar.getDiamondView().f == null) {
            this.d0 = 1.0f;
            this.c0 = 1.0f;
        }
        this.x.addView(this.F, tre.t(-1, 64, 49, 16, 0, 16, 0));
        EditTextBoldCursor editText = this.F.getEditText();
        this.I = editText;
        editText.setFilters(new InputFilter[]{new x32(this, (byte) 3)});
        this.I.setImeOptions(33554438);
        this.I.setOnEditorActionListener(new wtc(this, (byte) 0));
        this.I.addTextChangedListener(new nh6(this, (byte) 26));
        long j = this.s;
        if (j > 0) {
            duc ducVar2 = this.F;
            BigDecimal valueOf = BigDecimal.valueOf(j, 9);
            if (valueOf.signum() == 0) {
                stripTrailingZeros = new BigDecimal(BigInteger.ZERO, 0);
            } else {
                stripTrailingZeros = valueOf.stripTrailingZeros();
            }
            ducVar2.setAmountText(stripTrailingZeros.toPlainString());
            EditTextBoldCursor editTextBoldCursor = this.I;
            editTextBoldCursor.setSelection(editTextBoldCursor.length());
        }
        this.M = new SpannableString("⇅");
        wm2 wm2Var = new wm2(2131232839, 0);
        wm2Var.x = 0.72f;
        SpannableString spannableString = this.M;
        spannableString.setSpan(wm2Var, 0, spannableString.length(), 33);
        this.N = new SpannableString("G");
        wm2 wm2Var2 = new wm2(2131232843, 0);
        wm2Var2.d = false;
        SpannableString spannableString2 = this.N;
        spannableString2.setSpan(wm2Var2, 0, spannableString2.length(), 33);
        in inVar = new in(context, false, true, true, true, true);
        this.O = inVar;
        inVar.c.m(0.35f, 320L, 3.5f, k43.h);
        this.O.setScaleProperty(0.25f);
        this.O.setText(j0(c.C(this.currentAccount), 0L));
        in inVar2 = this.O;
        int i2 = aob.z6;
        uob p = yob.p(i, i2);
        yob.m(inVar2, p.a, p.b, 4, 0.0f, getResourceProvider());
        this.O.setTextSize(hl.L(14.0f));
        this.O.setTypeface(hl.n1("fonts/gram.ttf"));
        this.O.setGravity(17);
        this.O.setPadding(hl.L(10.0f), 0, hl.L(10.0f), 0);
        this.O.setAllowCancel(true);
        int p1 = aob.p1(0.08f, getThemedColor(i2));
        in inVar3 = this.O;
        ShapeDrawable b0 = aob.b0(hl.L(14.0f), p1);
        this.G = b0;
        inVar3.setSizeableBackground(b0);
        this.x.addView(this.O, tre.t(-2, 28, 49, 0, 8, 0, 0));
        iye.a(this.O);
        this.O.setOnClickListener(new View.OnClickListener(this) {
            public final euc b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view2) {
                String l0;
                byte b = r2;
                euc eucVar = this.b;
                switch (b) {
                    case 0:
                        eucVar.s0();
                        return;
                    case 1:
                        eucVar.w0();
                        return;
                    case 2:
                        BigDecimal i0 = eucVar.i0();
                        if (eucVar.l0 || i0.signum() > 0) {
                            long k0 = eucVar.k0();
                            eucVar.l0 = !eucVar.l0;
                            eucVar.F0();
                            if (k0 <= 0) {
                                l0 = "";
                            } else if (eucVar.l0) {
                                l0 = eucVar.g0(k0, i0);
                            } else {
                                l0 = euc.l0(k0);
                            }
                            eucVar.F.setAmountText(l0);
                            eucVar.I.setSelection(l0.length());
                            return;
                        }
                        return;
                    default:
                        eucVar.o0();
                        return;
                }
            }
        });
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.y = frameLayout2;
        this.x.addView(frameLayout2, tre.r(-2, -2, 49));
        LinearLayout linearLayout = new LinearLayout(context);
        this.E = linearLayout;
        linearLayout.setOrientation(1);
        this.y.addView(this.E, tre.e(-2, -2, 49));
        TextView textView = new TextView(context);
        this.P = textView;
        textView.setTextSize(1, 14.0f);
        TextView textView2 = this.P;
        int i3 = aob.Fi;
        yob.X(textView2, i3, getResourceProvider());
        yob.R(this.P, aob.Z(aob.p1(0.1f, getThemedColor(i3)), aob.p1(0.25f, getThemedColor(i3)), 14, 14), yob.K(0.1f, i3), yob.K(0.25f, i3), getResourceProvider());
        this.P.setPadding(hl.L(10.0f), 0, hl.L(10.0f), 0);
        this.P.setGravity(17);
        this.P.setTypeface(hl.o());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(ob6.M0(2131742788, null));
        spannableStringBuilder.append((CharSequence) " >");
        wm2 wm2Var3 = new wm2(2131232713, 0);
        float N = hl.N(0.66f);
        wm2Var3.r = 0.0f;
        wm2Var3.s = N;
        spannableStringBuilder.setSpan(wm2Var3, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        this.P.setText(spannableStringBuilder);
        this.y.addView(this.P, tre.d(-2, 28.0f, 49, 0.0f, 8.0f, 0.0f, 0.0f));
        iye.a(this.P);
        this.P.setOnClickListener(new View.OnClickListener(this) {
            public final euc b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view2) {
                String l0;
                byte b = r2;
                euc eucVar = this.b;
                switch (b) {
                    case 0:
                        eucVar.s0();
                        return;
                    case 1:
                        eucVar.w0();
                        return;
                    case 2:
                        BigDecimal i0 = eucVar.i0();
                        if (eucVar.l0 || i0.signum() > 0) {
                            long k0 = eucVar.k0();
                            eucVar.l0 = !eucVar.l0;
                            eucVar.F0();
                            if (k0 <= 0) {
                                l0 = "";
                            } else if (eucVar.l0) {
                                l0 = eucVar.g0(k0, i0);
                            } else {
                                l0 = euc.l0(k0);
                            }
                            eucVar.F.setAmountText(l0);
                            eucVar.I.setSelection(l0.length());
                            return;
                        }
                        return;
                    default:
                        eucVar.o0();
                        return;
                }
            }
        });
        this.E.setVisibility(4);
        this.E.setAlpha(0.0f);
        this.E.setScaleX(0.8f);
        this.E.setScaleY(0.8f);
        this.P.setVisibility(0);
        this.P.setAlpha(1.0f);
        this.P.setScaleX(1.0f);
        this.P.setScaleY(1.0f);
        this.m0 = false;
        this.Q = new TextView(context);
        t37 t37Var = new t37(0, true, false, null);
        t37Var.x = false;
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = t37Var.c;
        paint.setStyle(style);
        paint.setStrokeWidth(Math.max(1.0f, hl.N(0.5f)));
        int i4 = aob.bm;
        paint.setColor(getThemedColor(i4));
        t37Var.w = Integer.valueOf(getThemedColor(i4));
        this.Q.setPadding(hl.L(15.0f), hl.L(7.0f), hl.L(19.0f), hl.L(8.0f));
        this.Q.setBackground(t37Var);
        this.H = t37Var;
        this.Q.setTextSize(1, 14.0f);
        yob.X(this.Q, i2, getResourceProvider());
        this.Q.setTypeface(hl.o());
        this.Q.setEllipsize(TextUtils.TruncateAt.END);
        this.Q.setMaxLines(4);
        boolean isEmpty = TextUtils.isEmpty(this.h0);
        TextView textView3 = this.Q;
        if (isEmpty) {
            textView3.setVisibility(8);
        } else {
            textView3.setText(this.h0);
            this.Q.setVisibility(0);
        }
        this.E.addView(this.Q, tre.t(-2, -2, 49, 32, 12, 32, 0));
        this.Q.setOnClickListener(new View.OnClickListener(this) {
            public final euc b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view2) {
                String l0;
                byte b = r2;
                euc eucVar = this.b;
                switch (b) {
                    case 0:
                        eucVar.s0();
                        return;
                    case 1:
                        eucVar.w0();
                        return;
                    case 2:
                        BigDecimal i0 = eucVar.i0();
                        if (eucVar.l0 || i0.signum() > 0) {
                            long k0 = eucVar.k0();
                            eucVar.l0 = !eucVar.l0;
                            eucVar.F0();
                            if (k0 <= 0) {
                                l0 = "";
                            } else if (eucVar.l0) {
                                l0 = eucVar.g0(k0, i0);
                            } else {
                                l0 = euc.l0(k0);
                            }
                            eucVar.F.setAmountText(l0);
                            eucVar.I.setSelection(l0.length());
                            return;
                        }
                        return;
                    default:
                        eucVar.o0();
                        return;
                }
            }
        });
        iye.b(this.Q, 0.02f, 1.2f);
        E0();
        p66 p66Var = new p66(context, this.resourceProvider);
        this.R = p66Var;
        yob.X(p66Var, aob.q7, getResourceProvider());
        yob.G(this.R, i3, getResourceProvider());
        this.R.setTextSize(1, 14.0f);
        this.R.setGravity(17);
        this.R.setTypeface(hl.o());
        this.R.setPadding(hl.L(10.0f), 0, hl.L(10.0f), 0);
        B0(false);
        this.E.addView(this.R, tre.t(-2, -2, 49, 0, 10, 0, 0));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.a0 = linearLayout2;
        linearLayout2.setOrientation(1);
        this.a0.setPadding(hl.L(16.0f), 0, hl.L(16.0f), hl.L(12.0f));
        this.a0.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{aob.p1(0.0f, getThemedColor(i)), getThemedColor(i), getThemedColor(i)}));
        TextView textView4 = new TextView(context);
        this.S = textView4;
        yob.X(textView4, i2, getResourceProvider());
        this.S.setTextSize(1, 14.0f);
        this.S.setGravity(17);
        this.a0.addView(this.S, tre.t(-1, -2, 55, 16, 0, 16, 0));
        this.T = new SpannableString(">");
        wm2 wm2Var4 = new wm2(2131232713, 0);
        wm2Var4.r = 0.0f;
        wm2Var4.s = hl.L(1.0f);
        SpannableString spannableString3 = this.T;
        spannableString3.setSpan(wm2Var4, 0, spannableString3.length(), 33);
        fx0 fx0Var = new fx0((byte) 10, context, this);
        this.U = fx0Var;
        yob.X(fx0Var, i2, getResourceProvider());
        this.U.setTextSize(1, 14.0f);
        this.U.setGravity(17);
        this.U.setPadding(0, hl.L(4.0f), 0, hl.L(4.0f));
        this.U.setVisibility(8);
        this.a0.addView(this.U, tre.t(-1, -2, 55, 16, 0, 16, 0));
        SpannableString spannableString4 = new SpannableString(ob6.M0(2131748533, null));
        this.V = spannableString4;
        spannableString4.setSpan(new ya6(hl.L(80.0f), this.U), 0, this.V.length(), 33);
        c51 c51Var = new c51(getResourceProvider(), context, true);
        c51Var.setRoundRadius(24);
        this.e0 = c51Var;
        c51Var.setText(ob6.M0(2131742651, null));
        this.e0.setEnabled(false);
        this.e0.setOnClickListener(new View.OnClickListener(this) {
            public final euc b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view2) {
                String l0;
                byte b = r2;
                euc eucVar = this.b;
                switch (b) {
                    case 0:
                        eucVar.s0();
                        return;
                    case 1:
                        eucVar.w0();
                        return;
                    case 2:
                        BigDecimal i0 = eucVar.i0();
                        if (eucVar.l0 || i0.signum() > 0) {
                            long k0 = eucVar.k0();
                            eucVar.l0 = !eucVar.l0;
                            eucVar.F0();
                            if (k0 <= 0) {
                                l0 = "";
                            } else if (eucVar.l0) {
                                l0 = eucVar.g0(k0, i0);
                            } else {
                                l0 = euc.l0(k0);
                            }
                            eucVar.F.setAmountText(l0);
                            eucVar.I.setSelection(l0.length());
                            return;
                        }
                        return;
                    default:
                        eucVar.o0();
                        return;
                }
            }
        });
        this.a0.addView(this.e0, tre.t(-1, 48, 87, 0, 14, 0, 0));
        frameLayout.addView(this.a0, tre.e(-1, -2, 87));
        C0();
        G0();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == jn7.d4) {
            D0();
            C0();
        }
    }

    public final void e0() {
        try {
            ShapeDrawable shapeDrawable = this.G;
            if (shapeDrawable != null) {
                shapeDrawable.getPaint().setColor(aob.p1(0.08f, getThemedColor(aob.z6)));
                this.G.invalidateSelf();
                in inVar = this.O;
                if (inVar != null) {
                    inVar.invalidate();
                }
            }
            if (this.H != null) {
                int themedColor = getThemedColor(aob.bm);
                this.H.c.setColor(themedColor);
                this.H.w = Integer.valueOf(themedColor);
                this.H.invalidateSelf();
                TextView textView = this.Q;
                if (textView != null) {
                    textView.invalidate();
                }
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    public final void f0() {
        duc ducVar = this.F;
        if (ducVar != null) {
            ducVar.getDiamondView().l(null);
        }
        vpa vpaVar = this.b0;
        if (vpaVar != null) {
            vpaVar.d();
        }
        this.c0 = 1.0f;
        if (this.F != null) {
            G0();
        }
    }

    public final String g0(long j, BigDecimal bigDecimal) {
        int i;
        BigDecimal stripTrailingZeros;
        BigDecimal movePointLeft = BigDecimal.valueOf(j).multiply(bigDecimal).movePointLeft(9);
        TL_wallet.currencyRate n0 = n0();
        if (n0 != null) {
            i = n0.exp;
        } else if (TextUtils.equals(c.C(this.currentAccount).h.g(), "USD")) {
            i = 2;
        } else {
            i = 0;
        }
        int max = Math.max(0, Math.min(i, 20));
        RoundingMode roundingMode = RoundingMode.HALF_UP;
        BigDecimal scale = movePointLeft.setScale(max, roundingMode);
        if (scale.signum() == 0 && movePointLeft.signum() != 0) {
            scale = movePointLeft.setScale(Math.min(20, Math.max(max, movePointLeft.scale())), roundingMode);
        }
        int h0 = h0(bigDecimal);
        if (scale.scale() > h0) {
            scale = scale.setScale(h0, RoundingMode.DOWN);
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

    public final BigDecimal i0() {
        c C = c.C(this.currentAccount);
        C.h.f();
        double h = C.h.h();
        double d = uc7.s1(this.currentAccount).l4.k.i;
        if (h > 0.0d && d > 0.0d && !Double.isNaN(h) && !Double.isInfinite(h) && !Double.isNaN(d) && !Double.isInfinite(d)) {
            return BigDecimal.valueOf(h).multiply(BigDecimal.valueOf(d));
        }
        return BigDecimal.ZERO;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final SpannableStringBuilder j0(c cVar, long j) {
        char c;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("≈ ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append(cVar.q(j, false));
        int length2 = spannableStringBuilder.length();
        TL_wallet.currencyRate n0 = n0();
        if (n0 != null && !TextUtils.isEmpty(n0.decimalSeparator)) {
            c = n0.decimalSeparator.charAt(0);
        } else {
            c = '.';
        }
        z0(spannableStringBuilder, length, length2, c);
        return spannableStringBuilder.append((CharSequence) " ").append((CharSequence) this.M);
    }

    public final long k0() {
        EditTextBoldCursor editTextBoldCursor = this.I;
        if (editTextBoldCursor != null) {
            BigDecimal t0 = t0(editTextBoldCursor.getText().toString());
            if (this.l0) {
                BigDecimal i0 = i0();
                if (i0.signum() <= 0) {
                    return 0L;
                }
                t0 = t0.divide(i0, 9, RoundingMode.DOWN).setScale(2, RoundingMode.HALF_UP);
            }
            BigInteger bigInteger = t0.movePointRight(9).toBigInteger();
            if (bigInteger.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) > 0) {
                return Long.MAX_VALUE;
            }
            return bigInteger.longValue();
        }
        return 0L;
    }

    public final byte[] m0() {
        TL_wallet.walletUserAddress walletuseraddress = this.e;
        if (walletuseraddress == null || walletuseraddress.public_key == null) {
            return null;
        }
        int i = 0;
        while (true) {
            byte[] bArr = this.e.public_key;
            if (i >= bArr.length) {
                return null;
            }
            if (bArr[i] != 0) {
                return bArr;
            }
            i++;
        }
    }

    public final TL_wallet.currencyRate n0() {
        s43 s43Var = c.C(this.currentAccount).h;
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

    public final void o0() {
        uqc.L0(this.currentAccount, getResourceProvider(), getParentActivity());
    }

    @Override
    public final AnimatorSet onCustomTransitionAnimation(boolean z, Runnable runnable) {
        View view;
        TL_wallet.walletTransaction wallettransaction;
        duc ducVar;
        View view2;
        if (!z && this.u0 != null && (wallettransaction = this.r0) != null && wallettransaction.localMessageId != 0 && (ducVar = this.F) != null) {
            yrc diamondView = ducVar.getDiamondView();
            if (diamondView.f != null && diamondView.isShown() && diamondView.getAlpha() > 0.01f && (view2 = this.fragmentView) != null && (view2.getParent() instanceof View) && getParentLayout() != null) {
                nrc nrcVar = new nrc(getParentLayout().getView(), (View) this.fragmentView.getParent(), this.F.getDiamondView(), this.u0, this.r0, runnable, null);
                this.v0 = nrcVar;
                return nrcVar.m;
            }
        }
        if (!z && this.s0 != null && this.r0 != null && this.F != null && (view = this.fragmentView) != null && (view.getParent() instanceof View) && getParentLayout() != null) {
            quc qucVar = new quc(getParentLayout().getView(), (View) this.fragmentView.getParent(), this.F.getDiamondView(), this.s0, this.r0, runnable, null);
            this.t0 = qucVar;
            return qucVar.m;
        }
        return super.onCustomTransitionAnimation(z, runnable);
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().b(this, jn7.d4);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        this.J = false;
        f0();
        nrc nrcVar = this.v0;
        if (nrcVar != null) {
            AnimatorSet animatorSet = nrcVar.m;
            if (!nrcVar.v) {
                if (animatorSet.isStarted()) {
                    animatorSet.cancel();
                } else {
                    nrcVar.a(false);
                }
            }
            this.v0 = null;
        }
        quc qucVar = this.t0;
        if (qucVar != null) {
            AnimatorSet animatorSet2 = qucVar.m;
            if (!qucVar.s) {
                if (animatorSet2.isStarted()) {
                    animatorSet2.cancel();
                } else {
                    qucVar.b();
                }
            }
            this.t0 = null;
        }
        ValueAnimator valueAnimator = this.Z;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.Z = null;
        }
        EditTextBoldCursor editTextBoldCursor = this.I;
        if (editTextBoldCursor != null) {
            editTextBoldCursor.removeCallbacks(this.K);
        }
        getNotificationCenter().n(this, jn7.d4);
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i, int i2, int i3, int i4) {
        this.j0 = i4;
        if (this.a0 != null) {
            int max = Math.max(0, this.k0 - i4);
            this.a0.setPadding(hl.L(16.0f), 0, hl.L(16.0f), hl.L(12.0f) + this.j0);
            if (this.w0 != max) {
                this.a0.animate().cancel();
                this.a0.animate().translationY(-max).setDuration(320L).setInterpolator(k43.h).start();
                this.w0 = max;
            }
        }
    }

    @Override
    public final l2d onInsetsInternal(View view, l2d l2dVar) {
        this.k0 = l2dVar.a.f(8).d;
        return super.onInsetsInternal(view, l2dVar);
    }

    @Override
    public final void onPause() {
        f0();
        this.J = false;
        EditTextBoldCursor editTextBoldCursor = this.I;
        if (editTextBoldCursor != null) {
            editTextBoldCursor.removeCallbacks(this.K);
            this.fragmentView.requestFocus();
            hl.t1(this.I);
        }
        super.onPause();
    }

    @Override
    public final void onResume() {
        super.onResume();
        r0();
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            e0();
            int themedColor = getThemedColor(aob.d6);
            LinearLayout linearLayout = this.a0;
            if (linearLayout != null && themedColor != this.x0 && (linearLayout.getBackground() instanceof GradientDrawable)) {
                this.x0 = themedColor;
                ((GradientDrawable) this.a0.getBackground()).setColors(new int[]{aob.p1(0.0f, themedColor), themedColor, themedColor});
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        EditTextBoldCursor editTextBoldCursor;
        super.onTransitionAnimationEnd(z, z2);
        if (z && !z2 && this.J && (editTextBoldCursor = this.I) != null) {
            Runnable runnable = this.K;
            editTextBoldCursor.removeCallbacks(runnable);
            this.I.post(runnable);
        }
    }

    @Override
    public final void onTransitionAnimationStart(boolean z, boolean z2) {
        EditTextBoldCursor editTextBoldCursor;
        duc ducVar;
        super.onTransitionAnimationStart(z, z2);
        if (z && !z2 && (ducVar = this.F) != null && this.c0 < 1.0f) {
            ducVar.getDiamondView().l(new ptc(this, (byte) 1));
        }
        if (z && !z2 && (editTextBoldCursor = this.I) != null) {
            Runnable runnable = this.K;
            editTextBoldCursor.removeCallbacks(runnable);
            if (this.s > 0) {
                EditTextBoldCursor editTextBoldCursor2 = this.I;
                editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                return;
            }
            this.J = true;
            this.I.requestFocus();
            this.I.post(runnable);
        }
    }

    public final void p0(TL_wallet.walletUserAddress walletuseraddress) {
        this.r = false;
        this.e = walletuseraddress;
        if (walletuseraddress != null && walletuseraddress.user_id != 0) {
            this.f = uc7.s1(this.currentAccount).X1(Long.valueOf(walletuseraddress.user_id));
        }
        wa waVar = this.a;
        if (waVar != null) {
            waVar.g3.O(true);
        }
        C0();
        ktc ktcVar = this.w;
        if (ktcVar != null) {
            ktcVar.a(this.h, this.f);
        }
    }

    public final void q0(String str) {
        if (c.K(str)) {
            this.q0 = false;
            this.e0.setLoading(false);
        } else if (str != null) {
            this.q0 = false;
            this.e0.setLoading(false);
            d31.b0(this).f0(str, false);
        } else if (this.g0) {
            wk5 parentLayout = getParentLayout();
            if (parentLayout == null) {
                finishFragment();
                return;
            }
            long j = this.f.id;
            ArrayList arrayList = new ArrayList(parentLayout.getFragmentStack());
            if (!arrayList.isEmpty() && c00.g(1, arrayList) == this) {
                int size = arrayList.size() - 2;
                while (true) {
                    if (size < 0) {
                        break;
                    }
                    e eVar = (e) arrayList.get(size);
                    if ((eVar instanceof zu1) && eVar.getCurrentAccount() == this.currentAccount) {
                        zu1 zu1Var = (zu1) eVar;
                        if (zu1Var.a() == j && zu1Var.g4 == 0) {
                            this.u0 = zu1Var;
                            for (int size2 = arrayList.size() - 2; size2 > size; size2--) {
                                ((ActionBarLayout) parentLayout).c0((e) arrayList.get(size2), false);
                            }
                        }
                    }
                    size--;
                }
                if (this.u0 == null) {
                    getNotificationCenter().k(jn7.u, Long.valueOf(j), Boolean.FALSE);
                    zu1 ha = zu1.ha(j);
                    ha.setCurrentAccount(this.currentAccount);
                    if (!((ActionBarLayout) parentLayout).b(parentLayout.getFragmentStack().size() - 1, ha)) {
                        finishFragment();
                        return;
                    }
                    this.u0 = ha;
                }
                finishFragment();
            }
        } else {
            u0();
        }
    }

    public final void r0() {
        byte[] bArr;
        if (WalletEngine2.isValidRecipientAddress(this.h)) {
            this.f0 = -1L;
            D0();
            c C = c.C(this.currentAccount);
            if (C.L() && !c.b(C.x(), this.h) && this.f != null && TextUtils.isEmpty(this.n)) {
                return;
            }
            String str = this.h;
            String str2 = this.h0;
            if (this.i0) {
                bArr = m0();
            } else {
                bArr = null;
            }
            C.l(str, 0L, str2, bArr, new rtc(this, (byte) 1));
        }
    }

    public final void s0() {
        boolean z;
        AlertDialog$Builder alertDialog$Builder;
        boolean z2;
        int i;
        int i2;
        int L;
        boolean z3;
        Activity parentActivity = getParentActivity();
        if (parentActivity != null) {
            if (this.k0 - this.j0 > hl.L(20.0f)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                alertDialog$Builder = new AlertDialog$Builder(0, getResourceProvider(), parentActivity);
            } else {
                alertDialog$Builder = new AlertDialog$Builder(0, getResourceProvider(), parentActivity);
            }
            String M0 = ob6.M0(2131742856, null);
            id idVar = alertDialog$Builder.a;
            idVar.S = M0;
            f42 f42Var = new f42(this, parentActivity);
            f42Var.setTextSize(1, 18.0f);
            yob.X(f42Var, aob.j5, getResourceProvider());
            yob.D(f42Var, aob.t5, getResourceProvider());
            f42Var.setHint(ob6.M0(2131742820, null));
            f42Var.setText(this.h0);
            f42Var.setSelection(f42Var.length());
            f42Var.setInputType(147457);
            f42Var.setMaxLines(5);
            f42Var.setImeOptions(6);
            yob.F(f42Var, aob.k6, aob.l6, aob.p7, getResourceProvider());
            f42Var.setBackground(null);
            f42Var.setPadding(0, hl.L(10.0f), hl.L(48.0f), hl.L(10.0f));
            sg2 sg2Var = new sg2(1, getResourceProvider(), parentActivity);
            int i3 = aob.i6;
            hf0 f0 = aob.f0(aob.v0(i3, this.resourceProvider), 7, hl.L(12.0f));
            uob M = yob.M(i3);
            vnb vnbVar = this.resourceProvider;
            sg2Var.setBackground(f0);
            yob.j(sg2Var, f0, null, M, vnbVar);
            String M02 = ob6.M0(2131742727, null);
            if (this.i0 && m0() != null) {
                z2 = false;
            } else {
                z2 = true;
            }
            sg2Var.e(M02, "", z2, false, false);
            sg2Var.setMultiline(true);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) sg2Var.getCheckBoxView().getLayoutParams();
            layoutParams.topMargin = 0;
            if (ob6.a0) {
                i = 5;
            } else {
                i = 3;
            }
            layoutParams.gravity = i | 16;
            sg2Var.getCheckBoxView().setLayoutParams(layoutParams);
            if (ob6.a0) {
                i2 = hl.L(4.0f);
            } else {
                i2 = 0;
            }
            int L2 = hl.L(12.0f);
            if (ob6.a0) {
                L = 0;
            } else {
                L = hl.L(4.0f);
            }
            sg2Var.setPadding(i2, L2, L, hl.L(12.0f));
            if (m0() != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            sg2Var.setEnabled(z3);
            sg2Var.setOnClickListener(new qd(sg2Var, (byte) 5));
            LinearLayout linearLayout = new LinearLayout(parentActivity);
            linearLayout.setOrientation(1);
            linearLayout.addView(f42Var, tre.k(24.0f, 4.0f, 24.0f, 4.0f, -1, -2));
            linearLayout.addView(sg2Var, tre.t(-1, -2, 83, 8, 0, 8, 0));
            idVar.H = (byte) 6;
            alertDialog$Builder.n(linearLayout);
            idVar.a = hl.L(292.0f);
            alertDialog$Builder.g(ob6.M0(2131752570, null), new grb((byte) 24));
            alertDialog$Builder.j(ob6.M0(2131754479, null), new o48(this, f42Var, sg2Var, (byte) 24));
            idVar.setOnShowListener(new ig(f42Var, (byte) 6));
            idVar.setOnDismissListener(new dl8(this, (byte) 17));
            if (z) {
                idVar.q(250L);
            } else {
                idVar.show();
            }
            idVar.k0 = false;
            View c = idVar.c(-1);
            if ((c instanceof TextView) && !TextUtils.isEmpty(this.h0)) {
                f42Var.addTextChangedListener(new g42(f42Var, (TextView) c, (byte) 0));
            }
        }
    }

    public final void u0() {
        wk5 parentLayout = getParentLayout();
        if (parentLayout == null) {
            finishFragment();
            return;
        }
        ArrayList arrayList = new ArrayList(parentLayout.getFragmentStack());
        if (!arrayList.isEmpty() && c00.g(1, arrayList) == this) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                e eVar = (e) obj;
                if (eVar instanceof muc) {
                    ((ActionBarLayout) parentLayout).c0(eVar, false);
                }
            }
            List fragmentStack = parentLayout.getFragmentStack();
            if (fragmentStack.size() >= 2 && (bp1.m(2, fragmentStack) instanceof uqc) && ((e) bp1.m(2, fragmentStack)).getCurrentAccount() == this.currentAccount) {
                this.s0 = (uqc) bp1.m(2, fragmentStack);
            } else {
                uqc uqcVar = new uqc();
                uqcVar.setCurrentAccount(this.currentAccount);
                if (((ActionBarLayout) parentLayout).b(fragmentStack.size() - 1, uqcVar)) {
                    this.s0 = uqcVar;
                }
            }
            finishFragment();
        }
    }

    public final void w0() {
        String l0;
        c51 c51Var = this.e0;
        if (c51Var.e0 && !c51Var.R) {
            c C = c.C(this.currentAccount);
            long k0 = k0();
            long z = C.z();
            if (!this.r && WalletEngine2.isValidRecipientAddress(this.h) && k0 > 0) {
                long f = uc7.s1(this.currentAccount).l4.x0.f();
                byte[] bArr = null;
                if (k0 < f) {
                    if (this.l0) {
                        l0 = g0(f, i0());
                    } else {
                        l0 = l0(f);
                    }
                    this.F.setAmountText(l0);
                    this.I.setSelection(l0.length());
                    EditTextBoldCursor editTextBoldCursor = this.I;
                    int i = -this.p0;
                    this.p0 = i;
                    hl.A3(i, editTextBoldCursor, null);
                } else if (k0 > z) {
                    yw0.APP_ERROR.a();
                    p66 p66Var = this.R;
                    int i2 = -this.p0;
                    this.p0 = i2;
                    hl.A3(i2, p66Var, null);
                } else {
                    long j = this.f0;
                    if (j >= 0 && k0 + j > z) {
                        k0 -= j;
                    }
                    boolean z2 = false;
                    this.J = false;
                    EditTextBoldCursor editTextBoldCursor2 = this.I;
                    if (editTextBoldCursor2 != null) {
                        editTextBoldCursor2.removeCallbacks(this.K);
                        this.fragmentView.requestFocus();
                        hl.t1(this.I);
                    }
                    this.e0.setLoading(true);
                    this.r0 = null;
                    if (this.f != null && TextUtils.isEmpty(this.n)) {
                        this.q0 = true;
                        TLRPC.User user = this.f;
                        long j2 = k0;
                        String str = this.h;
                        String str2 = this.h0;
                        if (this.i0) {
                            bArr = m0();
                        }
                        C.n0(user, str, j2, str2, bArr, null, null, new stc(this, (byte) 0), new stc(this, (byte) 1));
                        return;
                    }
                    String str3 = this.h0;
                    if (this.i0) {
                        bArr = m0();
                    }
                    if (bArr != null) {
                        z2 = true;
                    }
                    if (C.L()) {
                        TL_wallet.walletTransaction wallettransaction = new TL_wallet.walletTransaction();
                        wallettransaction.peer = c.h(this.f, this.h, this.n);
                        wallettransaction.comment = str3;
                        wallettransaction.comment_encrypted = z2;
                        wallettransaction.date = getConnectionsManager().getCurrentTime();
                        wallettransaction.fee = Math.max(0L, this.f0);
                        wallettransaction.gasless = true;
                        wallettransaction.amount = k0;
                        hl.t1(this.I);
                        uqc.I0(getParentActivity(), getCurrentAccount(), wallettransaction, new ttc(this, C, k0, (byte) 0), new rtc(this, (byte) 3), m0(), null, getResourceProvider());
                        hl.d3(new ptc(this, (byte) 2), 1000L);
                        return;
                    }
                    long j3 = k0;
                    C.l(this.h, j3, str3, bArr, new ua7(this, str3, z2, C, j3));
                }
            }
        }
    }

    public final void x0() {
        this.g0 = true;
    }

    public final void y0(float f) {
        int i;
        this.Y = f;
        this.U.setAlpha(f);
        fx0 fx0Var = this.U;
        if (f > 0.0f) {
            i = 0;
        } else {
            i = 8;
        }
        fx0Var.setVisibility(i);
        ((LinearLayout.LayoutParams) this.U.getLayoutParams()).topMargin = Math.round(hl.L(4.0f) * f);
        this.U.requestLayout();
    }

    public euc(String str) {
        this(yac.t0, str);
    }

    public euc(TLRPC.User user) {
        this.s = 0L;
        this.K = new ptc(this, (byte) 0);
        this.L = new ViewTreeObserver.OnWindowFocusChangeListener() {
            @Override
            public final void onWindowFocusChanged(boolean z) {
                EditTextBoldCursor editTextBoldCursor;
                euc eucVar = euc.this;
                Runnable runnable = eucVar.K;
                if (z && eucVar.J && (editTextBoldCursor = eucVar.I) != null) {
                    editTextBoldCursor.removeCallbacks(runnable);
                    eucVar.I.post(runnable);
                }
            }
        };
        this.f0 = -1L;
        this.i0 = true;
        this.p0 = 6;
        this.f = user;
        this.h = null;
        this.r = true;
        c.C(this.currentAccount).k0(user, new rtc(this, (byte) 2));
    }

    @Override
    public final void Y(ArrayList arrayList, l9c l9cVar) {
    }

    @Override
    public final void a0(b8c b8cVar, View view) {
    }
}
