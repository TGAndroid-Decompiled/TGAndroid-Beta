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
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.Wallet.c;
public final class qpc extends n5c implements gk7 {
    public LinearLayout E;
    public ppc F;
    public ShapeDrawable G;
    public m17 H;
    public EditTextBoldCursor I;
    public boolean J;
    public final Runnable K;
    public final ViewTreeObserver.OnWindowFocusChangeListener L;
    public SpannableString M;
    public SpannableString N;
    public hn O;
    public TextView P;
    public TextView Q;
    public l46 R;
    public TextView S;
    public SpannableString T;
    public xw0 U;
    public SpannableString V;
    public boolean W;
    public boolean X;
    public float Y;
    public ValueAnimator Z;
    public LinearLayout a0;
    public yla b0;
    public float c0;
    public float d0;
    public TL_wallet.walletUserAddress e;
    public u41 e0;
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
    public hmc s0;
    public cqc t0;
    public mu1 u0;
    public anc v0;
    public xoc w;
    public int w0;
    public f7 x;
    public int x0;
    public FrameLayout y;

    public qpc(int i, String str) {
        this.s = 0L;
        this.K = new dpc(this, (byte) 0);
        this.L = new ViewTreeObserver.OnWindowFocusChangeListener() {
            @Override
            public final void onWindowFocusChanged(boolean z) {
                EditTextBoldCursor editTextBoldCursor;
                qpc qpcVar = qpc.this;
                Runnable runnable = qpcVar.K;
                if (z && qpcVar.J && (editTextBoldCursor = qpcVar.I) != null) {
                    editTextBoldCursor.removeCallbacks(runnable);
                    qpcVar.I.post(runnable);
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
        c.C(this.currentAccount).h0(new fpc(this, (byte) 0), str);
    }

    public static int c0(qpc qpcVar) {
        return qpcVar.currentAccount;
    }

    public static int d0(qpc qpcVar) {
        return qpcVar.currentAccount;
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

    public static void y0(SpannableStringBuilder spannableStringBuilder, int i, int i2, char c) {
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

    public final void A0(boolean z) {
        float f;
        float f2 = 0.0f;
        if (z) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) k96.M0(2131742840, null));
            spannableStringBuilder.append((CharSequence) " ");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) k96.M0(2131742894, null));
            spannableStringBuilder.append((CharSequence) " >");
            cm2 cm2Var = new cm2(2131232702, 0);
            float N = gl.N(0.66f);
            cm2Var.r = 0.0f;
            cm2Var.s = N;
            spannableStringBuilder.setSpan(cm2Var, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            spannableStringBuilder.setSpan(new r21(this, (byte) 11), length, spannableStringBuilder.length(), 33);
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
        scaleX.scaleY(f3).setDuration(320L).setInterpolator(s33.h).start();
    }

    public final void B0() {
        boolean z;
        boolean z2;
        String str;
        boolean z3;
        CharSequence V;
        String l0;
        D0();
        if (this.I != null && this.e0 != null) {
            c C = c.C(this.currentAccount);
            long z4 = C.z();
            long k0 = k0();
            long f = na7.q1(this.currentAccount).k4.p0.f();
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
                gl.B3(i2, editTextBoldCursor, null);
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
            A0(z2);
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
            u41 u41Var = this.e0;
            if (!this.r && !this.q0) {
                z3 = false;
            } else {
                z3 = true;
            }
            u41Var.setLoading(z3);
            u41 u41Var2 = this.e0;
            if (TextUtils.isEmpty(str)) {
                V = k96.M0(2131742757, null);
            } else {
                V = k96.V(null, null, 2131742758, c.p("Grams", str, 2131749315));
            }
            u41Var2.i(V, true, true);
            this.e0.setEnabled(z);
            C0();
            E0();
            boolean z5 = this.l0;
            hn hnVar = this.O;
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
                y0(spannableStringBuilder, length, spannableStringBuilder.length(), '.');
                spannableStringBuilder.append((CharSequence) " ");
                int length2 = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) k96.M0(2131749341, null));
                spannableStringBuilder.setSpan(new RelativeSizeSpan(0.85714287f), length2, spannableStringBuilder.length(), 33);
                hnVar.setText(spannableStringBuilder.append((CharSequence) " ").append((CharSequence) this.M));
                return;
            }
            hnVar.setText(j0(C, k0));
        }
    }

    public final void C0() {
        boolean z;
        boolean z2;
        float f;
        if (this.S != null) {
            c C = c.C(this.currentAccount);
            this.S.setText(k96.V(null, null, 2131742942, c.p("Grams", c.t(C.z(), false), 2131749315)));
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
                xw0 xw0Var = this.U;
                if (i >= 0) {
                    xw0Var.setText(k96.V(null, null, 2131742828, c.w(j, false)));
                } else {
                    xw0Var.setText(k96.V(null, null, 2131742828, this.V));
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
                x0(f);
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.Y, f);
            this.Z = ofFloat;
            ofFloat.setDuration(320L);
            this.Z.setInterpolator(s33.h);
            this.Z.addUpdateListener(new uwb(this, (byte) 16));
            this.Z.start();
        }
    }

    public final void D0() {
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
                    public final qpc b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void run() {
                        byte b = r3;
                        int i = 4;
                        boolean z2 = z;
                        qpc qpcVar = this.b;
                        switch (b) {
                            case 0:
                                LinearLayout linearLayout = qpcVar.E;
                                if (z2) {
                                    i = 0;
                                }
                                linearLayout.setVisibility(i);
                                return;
                            default:
                                TextView textView = qpcVar.P;
                                if (!z2) {
                                    i = 0;
                                }
                                textView.setVisibility(i);
                                return;
                        }
                    }
                }).setDuration(320L);
                s33 s33Var = s33.h;
                duration.setInterpolator(s33Var).start();
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
                    public final qpc b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void run() {
                        byte b = r3;
                        int i = 4;
                        boolean z2 = z;
                        qpc qpcVar = this.b;
                        switch (b) {
                            case 0:
                                LinearLayout linearLayout = qpcVar.E;
                                if (z2) {
                                    i = 0;
                                }
                                linearLayout.setVisibility(i);
                                return;
                            default:
                                TextView textView = qpcVar.P;
                                if (!z2) {
                                    i = 0;
                                }
                                textView.setVisibility(i);
                                return;
                        }
                    }
                }).setDuration(320L).setInterpolator(s33Var).start();
            }
        }
    }

    public final void E0() {
        this.F.d(c.C(this.currentAccount), this.l0);
    }

    public final void F0() {
        boolean z;
        float f = this.c0;
        float f2 = 1.0f - f;
        float max = Math.max(this.d0, Math.max(0.0f, Math.min(1.0f, f)));
        this.d0 = max;
        float f3 = 1.0f - max;
        ppc ppcVar = this.F;
        float f4 = this.c0;
        if (this.b0 == null && f4 == 1.0f) {
            z = true;
        } else {
            z = false;
        }
        ppcVar.e(f4, max, z);
        this.F.setTranslationY((((this.x.getHeight() / 2.0f) - this.F.getTop()) - (this.F.getHeight() / 2.0f)) * f2);
        this.O.setAlpha(this.d0);
        this.O.setTranslationY(gl.L(16.0f) * f3);
        this.y.setAlpha(this.d0);
        this.y.setTranslationY(gl.L(16.0f) * f3);
        this.a0.setAlpha(this.d0);
        for (int i = 0; i < this.a0.getChildCount(); i++) {
            this.a0.getChildAt(i).setTranslationY(gl.L(24.0f) * f3);
        }
    }

    @Override
    public final CharSequence Z() {
        return k96.M0(2131742753, null);
    }

    @Override
    public final boolean b0(c4c c4cVar, View view) {
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
        int i = bkb.c6;
        zkb.h(i, getResourceProvider(), view);
        zkb.h(i, getResourceProvider(), this.actionBar);
        this.actionBar.setCastShadows(false);
        r7 a = this.actionBar.t().a(1, 2131231247);
        a.setContentDescription(k96.M0(2131754838, null));
        a.e(2, 2131232049, k96.M0(2131742894, null));
        a.e(3, 2131231782, k96.M0(2131742962, null));
        this.actionBar.setActionBarMenuOnItemClick(new kk8(this, (byte) 26));
        FrameLayout frameLayout = (FrameLayout) this.fragmentView;
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        xoc xocVar = new xoc(this.resourceProvider, context, new dpc(this, (byte) 5), new dpc(this, (byte) 6));
        this.w = xocVar;
        frameLayout.addView(xocVar, nme.d(-2, 64.0f, 49, 16.0f, 5.0f, 16.0f, 0.0f));
        xoc xocVar2 = this.w;
        if (xocVar2 != null) {
            xocVar2.a(this.h, this.f);
        }
        f7 f7Var = new f7(this, context);
        this.x = f7Var;
        f7Var.setOrientation(1);
        this.x.setClipChildren(false);
        this.x.setClipToPadding(false);
        frameLayout.addView(this.x, nme.e(-1, -2, 17));
        ppc ppcVar = new ppc(context, getResourceProvider());
        this.F = ppcVar;
        if (ppcVar.getDiamondView().f == null) {
            this.d0 = 1.0f;
            this.c0 = 1.0f;
        }
        this.x.addView(this.F, nme.t(-1, 64, 49, 16, 0, 16, 0));
        EditTextBoldCursor editText = this.F.getEditText();
        this.I = editText;
        editText.setFilters(new InputFilter[]{new g32(this, (byte) 3)});
        this.I.setImeOptions(33554438);
        this.I.setOnEditorActionListener(new kpc(this, (byte) 0));
        this.I.addTextChangedListener(new jf6(this, (byte) 25));
        long j = this.s;
        if (j > 0) {
            ppc ppcVar2 = this.F;
            BigDecimal valueOf = BigDecimal.valueOf(j, 9);
            if (valueOf.signum() == 0) {
                stripTrailingZeros = new BigDecimal(BigInteger.ZERO, 0);
            } else {
                stripTrailingZeros = valueOf.stripTrailingZeros();
            }
            ppcVar2.setAmountText(stripTrailingZeros.toPlainString());
            EditTextBoldCursor editTextBoldCursor = this.I;
            editTextBoldCursor.setSelection(editTextBoldCursor.length());
        }
        this.M = new SpannableString("⇅");
        cm2 cm2Var = new cm2(2131232820, 0);
        cm2Var.x = 0.72f;
        SpannableString spannableString = this.M;
        spannableString.setSpan(cm2Var, 0, spannableString.length(), 33);
        this.N = new SpannableString("G");
        cm2 cm2Var2 = new cm2(2131232824, 0);
        cm2Var2.d = false;
        SpannableString spannableString2 = this.N;
        spannableString2.setSpan(cm2Var2, 0, spannableString2.length(), 33);
        hn hnVar = new hn(context, false, true, true, true, true);
        this.O = hnVar;
        hnVar.c.m(0.35f, 320L, 3.5f, s33.h);
        this.O.setScaleProperty(0.25f);
        this.O.setText(j0(c.C(this.currentAccount), 0L));
        hn hnVar2 = this.O;
        int i2 = bkb.y6;
        vkb p = zkb.p(i, i2);
        zkb.m(hnVar2, p.a, p.b, 4, 0.0f, getResourceProvider());
        this.O.setTextSize(gl.L(14.0f));
        this.O.setTypeface(gl.n1("fonts/gram.ttf"));
        this.O.setGravity(17);
        this.O.setPadding(gl.L(10.0f), 0, gl.L(10.0f), 0);
        this.O.setAllowCancel(true);
        int p1 = bkb.p1(0.08f, getThemedColor(i2));
        hn hnVar3 = this.O;
        ShapeDrawable b0 = bkb.b0(gl.L(14.0f), p1);
        this.G = b0;
        hnVar3.setSizeableBackground(b0);
        this.x.addView(this.O, nme.t(-2, 28, 49, 0, 8, 0, 0));
        ote.a(this.O);
        this.O.setOnClickListener(new View.OnClickListener(this) {
            public final qpc b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view2) {
                String l0;
                byte b = r2;
                qpc qpcVar = this.b;
                switch (b) {
                    case 0:
                        qpcVar.s0();
                        return;
                    case 1:
                        qpcVar.v0();
                        return;
                    case 2:
                        BigDecimal i0 = qpcVar.i0();
                        if (qpcVar.l0 || i0.signum() > 0) {
                            long k0 = qpcVar.k0();
                            qpcVar.l0 = !qpcVar.l0;
                            qpcVar.E0();
                            if (k0 <= 0) {
                                l0 = "";
                            } else if (qpcVar.l0) {
                                l0 = qpcVar.g0(k0, i0);
                            } else {
                                l0 = qpc.l0(k0);
                            }
                            qpcVar.F.setAmountText(l0);
                            qpcVar.I.setSelection(l0.length());
                            return;
                        }
                        return;
                    default:
                        qpcVar.o0();
                        return;
                }
            }
        });
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.y = frameLayout2;
        this.x.addView(frameLayout2, nme.r(-2, -2, 49));
        LinearLayout linearLayout = new LinearLayout(context);
        this.E = linearLayout;
        linearLayout.setOrientation(1);
        this.y.addView(this.E, nme.e(-2, -2, 49));
        TextView textView = new TextView(context);
        this.P = textView;
        textView.setTextSize(1, 14.0f);
        TextView textView2 = this.P;
        int i3 = bkb.Ei;
        zkb.X(textView2, i3, getResourceProvider());
        zkb.R(this.P, bkb.Z(bkb.p1(0.1f, getThemedColor(i3)), bkb.p1(0.25f, getThemedColor(i3)), 14, 14), zkb.K(0.1f, i3), zkb.K(0.25f, i3), getResourceProvider());
        this.P.setPadding(gl.L(10.0f), 0, gl.L(10.0f), 0);
        this.P.setGravity(17);
        this.P.setTypeface(gl.o());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(k96.M0(2131742894, null));
        spannableStringBuilder.append((CharSequence) " >");
        cm2 cm2Var3 = new cm2(2131232702, 0);
        float N = gl.N(0.66f);
        cm2Var3.r = 0.0f;
        cm2Var3.s = N;
        spannableStringBuilder.setSpan(cm2Var3, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        this.P.setText(spannableStringBuilder);
        this.y.addView(this.P, nme.d(-2, 28.0f, 49, 0.0f, 8.0f, 0.0f, 0.0f));
        ote.a(this.P);
        this.P.setOnClickListener(new View.OnClickListener(this) {
            public final qpc b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view2) {
                String l0;
                byte b = r2;
                qpc qpcVar = this.b;
                switch (b) {
                    case 0:
                        qpcVar.s0();
                        return;
                    case 1:
                        qpcVar.v0();
                        return;
                    case 2:
                        BigDecimal i0 = qpcVar.i0();
                        if (qpcVar.l0 || i0.signum() > 0) {
                            long k0 = qpcVar.k0();
                            qpcVar.l0 = !qpcVar.l0;
                            qpcVar.E0();
                            if (k0 <= 0) {
                                l0 = "";
                            } else if (qpcVar.l0) {
                                l0 = qpcVar.g0(k0, i0);
                            } else {
                                l0 = qpc.l0(k0);
                            }
                            qpcVar.F.setAmountText(l0);
                            qpcVar.I.setSelection(l0.length());
                            return;
                        }
                        return;
                    default:
                        qpcVar.o0();
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
        m17 m17Var = new m17(0, true, false, null);
        m17Var.x = false;
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = m17Var.c;
        paint.setStyle(style);
        paint.setStrokeWidth(Math.max(1.0f, gl.N(0.5f)));
        int i4 = bkb.am;
        paint.setColor(getThemedColor(i4));
        m17Var.w = Integer.valueOf(getThemedColor(i4));
        this.Q.setPadding(gl.L(15.0f), gl.L(7.0f), gl.L(19.0f), gl.L(8.0f));
        this.Q.setBackground(m17Var);
        this.H = m17Var;
        this.Q.setTextSize(1, 14.0f);
        zkb.X(this.Q, i2, getResourceProvider());
        this.Q.setTypeface(gl.o());
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
        this.E.addView(this.Q, nme.t(-2, -2, 49, 32, 12, 32, 0));
        this.Q.setOnClickListener(new View.OnClickListener(this) {
            public final qpc b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view2) {
                String l0;
                byte b = r2;
                qpc qpcVar = this.b;
                switch (b) {
                    case 0:
                        qpcVar.s0();
                        return;
                    case 1:
                        qpcVar.v0();
                        return;
                    case 2:
                        BigDecimal i0 = qpcVar.i0();
                        if (qpcVar.l0 || i0.signum() > 0) {
                            long k0 = qpcVar.k0();
                            qpcVar.l0 = !qpcVar.l0;
                            qpcVar.E0();
                            if (k0 <= 0) {
                                l0 = "";
                            } else if (qpcVar.l0) {
                                l0 = qpcVar.g0(k0, i0);
                            } else {
                                l0 = qpc.l0(k0);
                            }
                            qpcVar.F.setAmountText(l0);
                            qpcVar.I.setSelection(l0.length());
                            return;
                        }
                        return;
                    default:
                        qpcVar.o0();
                        return;
                }
            }
        });
        ote.b(this.Q, 0.02f, 1.2f);
        D0();
        l46 l46Var = new l46(context, this.resourceProvider);
        this.R = l46Var;
        zkb.X(l46Var, bkb.p7, getResourceProvider());
        zkb.G(this.R, i3, getResourceProvider());
        this.R.setTextSize(1, 14.0f);
        this.R.setGravity(17);
        this.R.setTypeface(gl.o());
        this.R.setPadding(gl.L(10.0f), 0, gl.L(10.0f), 0);
        A0(false);
        this.E.addView(this.R, nme.t(-2, -2, 49, 0, 10, 0, 0));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.a0 = linearLayout2;
        linearLayout2.setOrientation(1);
        this.a0.setPadding(gl.L(16.0f), 0, gl.L(16.0f), gl.L(12.0f));
        this.a0.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{bkb.p1(0.0f, getThemedColor(i)), getThemedColor(i), getThemedColor(i)}));
        TextView textView4 = new TextView(context);
        this.S = textView4;
        zkb.X(textView4, i2, getResourceProvider());
        this.S.setTextSize(1, 14.0f);
        this.S.setGravity(17);
        this.a0.addView(this.S, nme.t(-1, -2, 55, 16, 0, 16, 0));
        this.T = new SpannableString(">");
        cm2 cm2Var4 = new cm2(2131232702, 0);
        cm2Var4.r = 0.0f;
        cm2Var4.s = gl.L(1.0f);
        SpannableString spannableString3 = this.T;
        spannableString3.setSpan(cm2Var4, 0, spannableString3.length(), 33);
        xw0 xw0Var = new xw0((byte) 10, context, this);
        this.U = xw0Var;
        zkb.X(xw0Var, i2, getResourceProvider());
        this.U.setTextSize(1, 14.0f);
        this.U.setGravity(17);
        this.U.setPadding(0, gl.L(4.0f), 0, gl.L(4.0f));
        this.U.setVisibility(8);
        this.a0.addView(this.U, nme.t(-1, -2, 55, 16, 0, 16, 0));
        SpannableString spannableString4 = new SpannableString(k96.M0(2131748587, null));
        this.V = spannableString4;
        spannableString4.setSpan(new u86(gl.L(80.0f), this.U), 0, this.V.length(), 33);
        u41 u41Var = new u41(getResourceProvider(), context, true);
        u41Var.setRoundRadius(24);
        this.e0 = u41Var;
        u41Var.setText(k96.M0(2131742757, null));
        this.e0.setEnabled(false);
        this.e0.setOnClickListener(new View.OnClickListener(this) {
            public final qpc b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view2) {
                String l0;
                byte b = r2;
                qpc qpcVar = this.b;
                switch (b) {
                    case 0:
                        qpcVar.s0();
                        return;
                    case 1:
                        qpcVar.v0();
                        return;
                    case 2:
                        BigDecimal i0 = qpcVar.i0();
                        if (qpcVar.l0 || i0.signum() > 0) {
                            long k0 = qpcVar.k0();
                            qpcVar.l0 = !qpcVar.l0;
                            qpcVar.E0();
                            if (k0 <= 0) {
                                l0 = "";
                            } else if (qpcVar.l0) {
                                l0 = qpcVar.g0(k0, i0);
                            } else {
                                l0 = qpc.l0(k0);
                            }
                            qpcVar.F.setAmountText(l0);
                            qpcVar.I.setSelection(l0.length());
                            return;
                        }
                        return;
                    default:
                        qpcVar.o0();
                        return;
                }
            }
        });
        this.a0.addView(this.e0, nme.t(-1, 48, 87, 0, 14, 0, 0));
        frameLayout.addView(this.a0, nme.e(-1, -2, 87));
        B0();
        F0();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == kk7.c4) {
            C0();
            B0();
        }
    }

    public final void e0() {
        try {
            ShapeDrawable shapeDrawable = this.G;
            if (shapeDrawable != null) {
                shapeDrawable.getPaint().setColor(bkb.p1(0.08f, getThemedColor(bkb.y6)));
                this.G.invalidateSelf();
                hn hnVar = this.O;
                if (hnVar != null) {
                    hnVar.invalidate();
                }
            }
            if (this.H != null) {
                int themedColor = getThemedColor(bkb.am);
                this.H.c.setColor(themedColor);
                this.H.w = Integer.valueOf(themedColor);
                this.H.invalidateSelf();
                TextView textView = this.Q;
                if (textView != null) {
                    textView.invalidate();
                }
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    public final void f0() {
        ppc ppcVar = this.F;
        if (ppcVar != null) {
            ppcVar.getDiamondView().l(null);
        }
        yla ylaVar = this.b0;
        if (ylaVar != null) {
            ylaVar.d();
        }
        this.c0 = 1.0f;
        if (this.F != null) {
            F0();
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
        double d = na7.q1(this.currentAccount).k4.k.i;
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
        y0(spannableStringBuilder, length, length2, c);
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
        a43 a43Var = c.C(this.currentAccount).h;
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

    public final void o0() {
        hmc.L0(this.currentAccount, getResourceProvider(), getParentActivity());
    }

    @Override
    public final AnimatorSet onCustomTransitionAnimation(boolean z, Runnable runnable) {
        View view;
        TL_wallet.walletTransaction wallettransaction;
        ppc ppcVar;
        View view2;
        if (!z && this.u0 != null && (wallettransaction = this.r0) != null && wallettransaction.localMessageId != 0 && (ppcVar = this.F) != null) {
            lnc diamondView = ppcVar.getDiamondView();
            if (diamondView.f != null && diamondView.isShown() && diamondView.getAlpha() > 0.01f && (view2 = this.fragmentView) != null && (view2.getParent() instanceof View) && getParentLayout() != null) {
                anc ancVar = new anc(getParentLayout().getView(), (View) this.fragmentView.getParent(), this.F.getDiamondView(), this.u0, this.r0, runnable, null);
                this.v0 = ancVar;
                return ancVar.m;
            }
        }
        if (!z && this.s0 != null && this.r0 != null && this.F != null && (view = this.fragmentView) != null && (view.getParent() instanceof View) && getParentLayout() != null) {
            cqc cqcVar = new cqc(getParentLayout().getView(), (View) this.fragmentView.getParent(), this.F.getDiamondView(), this.s0, this.r0, runnable, null);
            this.t0 = cqcVar;
            return cqcVar.m;
        }
        return super.onCustomTransitionAnimation(z, runnable);
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().b(this, kk7.c4);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        this.J = false;
        f0();
        anc ancVar = this.v0;
        if (ancVar != null) {
            AnimatorSet animatorSet = ancVar.m;
            if (!ancVar.v) {
                if (animatorSet.isStarted()) {
                    animatorSet.cancel();
                } else {
                    ancVar.a(false);
                }
            }
            this.v0 = null;
        }
        cqc cqcVar = this.t0;
        if (cqcVar != null) {
            AnimatorSet animatorSet2 = cqcVar.m;
            if (!cqcVar.s) {
                if (animatorSet2.isStarted()) {
                    animatorSet2.cancel();
                } else {
                    cqcVar.b();
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
        getNotificationCenter().n(this, kk7.c4);
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i, int i2, int i3, int i4) {
        this.j0 = i4;
        if (this.a0 != null) {
            int max = Math.max(0, this.k0 - i4);
            this.a0.setPadding(gl.L(16.0f), 0, gl.L(16.0f), gl.L(12.0f) + this.j0);
            if (this.w0 != max) {
                this.a0.animate().cancel();
                this.a0.animate().translationY(-max).setDuration(320L).setInterpolator(s33.h).start();
                this.w0 = max;
            }
        }
    }

    @Override
    public final vxc onInsetsInternal(View view, vxc vxcVar) {
        this.k0 = vxcVar.a.f(8).d;
        return super.onInsetsInternal(view, vxcVar);
    }

    @Override
    public final void onPause() {
        f0();
        this.J = false;
        EditTextBoldCursor editTextBoldCursor = this.I;
        if (editTextBoldCursor != null) {
            editTextBoldCursor.removeCallbacks(this.K);
            this.fragmentView.requestFocus();
            gl.t1(this.I);
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
            int themedColor = getThemedColor(bkb.c6);
            LinearLayout linearLayout = this.a0;
            if (linearLayout != null && themedColor != this.x0 && (linearLayout.getBackground() instanceof GradientDrawable)) {
                this.x0 = themedColor;
                ((GradientDrawable) this.a0.getBackground()).setColors(new int[]{bkb.p1(0.0f, themedColor), themedColor, themedColor});
            }
        } catch (Exception e) {
            fa4.g(e, true);
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
        ppc ppcVar;
        super.onTransitionAnimationStart(z, z2);
        if (z && !z2 && (ppcVar = this.F) != null && this.c0 < 1.0f) {
            ppcVar.getDiamondView().l(new dpc(this, (byte) 1));
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
            this.f = na7.q1(this.currentAccount).V1(Long.valueOf(walletuseraddress.user_id));
        }
        va vaVar = this.a;
        if (vaVar != null) {
            vaVar.g3.O(true);
        }
        B0();
        xoc xocVar = this.w;
        if (xocVar != null) {
            xocVar.a(this.h, this.f);
        }
    }

    public final void q0(String str) {
        if (c.K(str)) {
            this.q0 = false;
            this.e0.setLoading(false);
        } else if (str != null) {
            this.q0 = false;
            this.e0.setLoading(false);
            u21.b0(this).f0(str, false);
        } else if (this.g0) {
            ui5 parentLayout = getParentLayout();
            if (parentLayout == null) {
                finishFragment();
                return;
            }
            long j = this.f.id;
            ArrayList arrayList = new ArrayList(parentLayout.getFragmentStack());
            if (!arrayList.isEmpty() && b00.f(1, arrayList) == this) {
                int size = arrayList.size() - 2;
                while (true) {
                    if (size < 0) {
                        break;
                    }
                    d dVar = (d) arrayList.get(size);
                    if ((dVar instanceof mu1) && dVar.getCurrentAccount() == this.currentAccount) {
                        mu1 mu1Var = (mu1) dVar;
                        if (mu1Var.a() == j && mu1Var.g4 == 0) {
                            this.u0 = mu1Var;
                            for (int size2 = arrayList.size() - 2; size2 > size; size2--) {
                                ((ActionBarLayout) parentLayout).c0((d) arrayList.get(size2), false);
                            }
                        }
                    }
                    size--;
                }
                if (this.u0 == null) {
                    getNotificationCenter().k(kk7.u, Long.valueOf(j), Boolean.FALSE);
                    mu1 U9 = mu1.U9(j);
                    U9.setCurrentAccount(this.currentAccount);
                    if (!((ActionBarLayout) parentLayout).b(parentLayout.getFragmentStack().size() - 1, U9)) {
                        finishFragment();
                        return;
                    }
                    this.u0 = U9;
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
            C0();
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
            C.l(str, 0L, str2, bArr, new fpc(this, (byte) 1));
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
            if (this.k0 - this.j0 > gl.L(20.0f)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                alertDialog$Builder = new AlertDialog$Builder(0, getResourceProvider(), parentActivity);
            } else {
                alertDialog$Builder = new AlertDialog$Builder(0, getResourceProvider(), parentActivity);
            }
            String M0 = k96.M0(2131742962, null);
            hd hdVar = alertDialog$Builder.a;
            hdVar.S = M0;
            p32 p32Var = new p32(this, parentActivity);
            p32Var.setTextSize(1, 18.0f);
            zkb.X(p32Var, bkb.i5, getResourceProvider());
            zkb.D(p32Var, bkb.s5, getResourceProvider());
            p32Var.setHint(k96.M0(2131742926, null));
            p32Var.setText(this.h0);
            p32Var.setSelection(p32Var.length());
            p32Var.setInputType(147457);
            p32Var.setMaxLines(5);
            p32Var.setImeOptions(6);
            zkb.F(p32Var, bkb.j6, bkb.k6, bkb.o7, getResourceProvider());
            p32Var.setBackground(null);
            p32Var.setPadding(0, gl.L(10.0f), gl.L(48.0f), gl.L(10.0f));
            ag2 ag2Var = new ag2(1, getResourceProvider(), parentActivity);
            int i3 = bkb.h6;
            ff0 f0 = bkb.f0(bkb.v0(i3, this.resourceProvider), 7, gl.L(12.0f));
            vkb M = zkb.M(i3);
            wjb wjbVar = this.resourceProvider;
            ag2Var.setBackground(f0);
            zkb.j(ag2Var, f0, null, M, wjbVar);
            String M02 = k96.M0(2131742833, null);
            if (this.i0 && m0() != null) {
                z2 = false;
            } else {
                z2 = true;
            }
            ag2Var.e(M02, "", z2, false, false);
            ag2Var.setMultiline(true);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) ag2Var.getCheckBoxView().getLayoutParams();
            layoutParams.topMargin = 0;
            if (k96.a0) {
                i = 5;
            } else {
                i = 3;
            }
            layoutParams.gravity = i | 16;
            ag2Var.getCheckBoxView().setLayoutParams(layoutParams);
            if (k96.a0) {
                i2 = gl.L(4.0f);
            } else {
                i2 = 0;
            }
            int L2 = gl.L(12.0f);
            if (k96.a0) {
                L = 0;
            } else {
                L = gl.L(4.0f);
            }
            ag2Var.setPadding(i2, L2, L, gl.L(12.0f));
            if (m0() != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            ag2Var.setEnabled(z3);
            ag2Var.setOnClickListener(new ke(ag2Var, (byte) 5));
            LinearLayout linearLayout = new LinearLayout(parentActivity);
            linearLayout.setOrientation(1);
            linearLayout.addView(p32Var, nme.k(24.0f, 4.0f, 24.0f, 4.0f, -1, -2));
            linearLayout.addView(ag2Var, nme.t(-1, -2, 83, 8, 0, 8, 0));
            hdVar.H = (byte) 6;
            alertDialog$Builder.n(linearLayout);
            hdVar.a = gl.L(292.0f);
            alertDialog$Builder.g(k96.M0(2131752577, null), new fyb((byte) 15));
            alertDialog$Builder.j(k96.M0(2131754483, null), new io9(this, p32Var, ag2Var, (byte) 15));
            hdVar.setOnShowListener(new jg(p32Var, (byte) 6));
            hdVar.setOnDismissListener(new ph8(this, (byte) 17));
            if (z) {
                hdVar.q(250L);
            } else {
                hdVar.show();
            }
            hdVar.k0 = false;
            View c = hdVar.c(-1);
            if ((c instanceof TextView) && !TextUtils.isEmpty(this.h0)) {
                p32Var.addTextChangedListener(new q32(p32Var, (TextView) c, (byte) 0));
            }
        }
    }

    public final void u0() {
        ui5 parentLayout = getParentLayout();
        if (parentLayout == null) {
            finishFragment();
            return;
        }
        ArrayList arrayList = new ArrayList(parentLayout.getFragmentStack());
        if (!arrayList.isEmpty() && b00.f(1, arrayList) == this) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                d dVar = (d) obj;
                if (dVar instanceof ypc) {
                    ((ActionBarLayout) parentLayout).c0(dVar, false);
                }
            }
            List fragmentStack = parentLayout.getFragmentStack();
            if (fragmentStack.size() >= 2 && (oo1.m(2, fragmentStack) instanceof hmc) && ((d) oo1.m(2, fragmentStack)).getCurrentAccount() == this.currentAccount) {
                this.s0 = (hmc) oo1.m(2, fragmentStack);
            } else {
                hmc hmcVar = new hmc();
                hmcVar.setCurrentAccount(this.currentAccount);
                if (((ActionBarLayout) parentLayout).b(fragmentStack.size() - 1, hmcVar)) {
                    this.s0 = hmcVar;
                }
            }
            finishFragment();
        }
    }

    public final void v0() {
        String l0;
        u41 u41Var = this.e0;
        if (u41Var.e0 && !u41Var.R) {
            c C = c.C(this.currentAccount);
            long k0 = k0();
            long z = C.z();
            if (!this.r && WalletEngine2.isValidRecipientAddress(this.h) && k0 > 0) {
                long f = na7.q1(this.currentAccount).k4.p0.f();
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
                    gl.B3(i, editTextBoldCursor, null);
                } else if (k0 > z) {
                    pw0.APP_ERROR.a();
                    l46 l46Var = this.R;
                    int i2 = -this.p0;
                    this.p0 = i2;
                    gl.B3(i2, l46Var, null);
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
                        gl.t1(this.I);
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
                        C.l0(user, str, j2, str2, bArr, null, null, new gpc(this, (byte) 0), new gpc(this, (byte) 1));
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
                        gl.t1(this.I);
                        hmc.I0(getParentActivity(), getCurrentAccount(), wallettransaction, new hpc(this, C, k0, (byte) 0), new fpc(this, (byte) 3), m0(), null, getResourceProvider());
                        gl.e3(new dpc(this, (byte) 2), 1000L);
                        return;
                    }
                    long j3 = k0;
                    C.l(this.h, j3, str3, bArr, new k87(this, str3, z2, C, j3));
                }
            }
        }
    }

    public final void w0() {
        this.g0 = true;
    }

    public final void x0(float f) {
        int i;
        this.Y = f;
        this.U.setAlpha(f);
        xw0 xw0Var = this.U;
        if (f > 0.0f) {
            i = 0;
        } else {
            i = 8;
        }
        xw0Var.setVisibility(i);
        ((LinearLayout.LayoutParams) this.U.getLayoutParams()).topMargin = Math.round(gl.L(4.0f) * f);
        this.U.requestLayout();
    }

    public final void z0(String str) {
        this.n = str;
        a aVar = this.actionBar;
        if (aVar != null) {
            aVar.setTitle(k96.M0(2131742753, null));
        }
    }

    @Override
    public final void Y(ArrayList arrayList, l5c l5cVar) {
    }

    @Override
    public final void a0(c4c c4cVar, View view) {
    }

    public qpc(String str) {
        this(y6c.t0, str);
    }

    public qpc(TLRPC.User user) {
        this.s = 0L;
        this.K = new dpc(this, (byte) 0);
        this.L = new ViewTreeObserver.OnWindowFocusChangeListener() {
            @Override
            public final void onWindowFocusChanged(boolean z) {
                EditTextBoldCursor editTextBoldCursor;
                qpc qpcVar = qpc.this;
                Runnable runnable = qpcVar.K;
                if (z && qpcVar.J && (editTextBoldCursor = qpcVar.I) != null) {
                    editTextBoldCursor.removeCallbacks(runnable);
                    qpcVar.I.post(runnable);
                }
            }
        };
        this.f0 = -1L;
        this.i0 = true;
        this.p0 = 6;
        this.f = user;
        this.h = null;
        this.r = true;
        c.C(this.currentAccount).i0(user, new fpc(this, (byte) 2));
    }
}
