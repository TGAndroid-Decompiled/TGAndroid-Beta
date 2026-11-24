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
public final class rrc extends n7c implements jm7 {
    public LinearLayout E;
    public qrc F;
    public ShapeDrawable G;
    public m37 H;
    public EditTextBoldCursor I;
    public boolean J;
    public final Runnable K;
    public final ViewTreeObserver.OnWindowFocusChangeListener L;
    public SpannableString M;
    public SpannableString N;
    public io O;
    public TextView P;
    public TextView Q;
    public l66 R;
    public TextView S;
    public SpannableString T;
    public ey0 U;
    public SpannableString V;
    public boolean W;
    public boolean X;
    public float Y;
    public ValueAnimator Z;
    public LinearLayout a0;
    public zna b0;
    public float c0;
    public float d0;
    public TL_wallet.walletUserAddress e;
    public b61 e0;
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
    public goc s0;
    public esc t0;
    public yv1 u0;
    public apc v0;
    public zqc w;
    public int w0;
    public f7 x;
    public int x0;
    public FrameLayout y;

    public rrc(int i, String str) {
        this.s = 0L;
        this.K = new frc(this, (byte) 0);
        this.L = new ViewTreeObserver.OnWindowFocusChangeListener() {
            @Override
            public final void onWindowFocusChanged(boolean z) {
                EditTextBoldCursor editTextBoldCursor;
                rrc rrcVar = rrc.this;
                Runnable runnable = rrcVar.K;
                if (z && rrcVar.J && (editTextBoldCursor = rrcVar.I) != null) {
                    editTextBoldCursor.removeCallbacks(runnable);
                    rrcVar.I.post(runnable);
                }
            }
        };
        this.f0 = -1L;
        this.i0 = true;
        this.p0 = 6;
        setCurrentAccount(i);
        this.f = null;
        this.h = str;
        s0();
        this.r = true;
        c.C(this.currentAccount).h0(new hrc(this, (byte) 0), str);
    }

    public static int d0(rrc rrcVar) {
        return rrcVar.currentAccount;
    }

    public static int e0(rrc rrcVar) {
        return rrcVar.currentAccount;
    }

    public static int i0(BigDecimal bigDecimal) {
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

    public static String m0(long j) {
        BigDecimal stripTrailingZeros;
        BigDecimal scale = BigDecimal.valueOf(j).movePointLeft(9).setScale(2, RoundingMode.HALF_UP);
        if (scale.signum() == 0) {
            stripTrailingZeros = new BigDecimal(BigInteger.ZERO, 0);
        } else {
            stripTrailingZeros = scale.stripTrailingZeros();
        }
        return stripTrailingZeros.toPlainString();
    }

    public static BigDecimal u0(String str) {
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
            aVar.setTitle(jb6.M0(2131742679, null));
        }
    }

    public final void B0(boolean z) {
        float f;
        float f2 = 0.0f;
        if (z) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) jb6.M0(2131742766, null));
            spannableStringBuilder.append((CharSequence) " ");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) jb6.M0(2131742820, null));
            spannableStringBuilder.append((CharSequence) " >");
            pn2 pn2Var = new pn2(2131232714, 0);
            float N = gm.N(0.66f);
            pn2Var.r = 0.0f;
            pn2Var.s = N;
            spannableStringBuilder.setSpan(pn2Var, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            spannableStringBuilder.setSpan(new z31(this, (byte) 11), length, spannableStringBuilder.length(), 33);
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
        scaleX.scaleY(f3).setDuration(320L).setInterpolator(d53.h).start();
    }

    public final void C0() {
        boolean z;
        boolean z2;
        String str;
        boolean z3;
        CharSequence V;
        String m0;
        E0();
        if (this.I != null && this.e0 != null) {
            c C = c.C(this.currentAccount);
            long z4 = C.z();
            long l0 = l0();
            long f = oc7.r1(this.currentAccount).l4.p0.f();
            int i = (l0 > 0L ? 1 : (l0 == 0L ? 0 : -1));
            if (i > 0 && l0 < f) {
                if (this.l0) {
                    m0 = h0(f, j0());
                } else {
                    m0 = m0(f);
                }
                this.F.setAmountText(m0);
                this.I.setSelection(m0.length());
                EditTextBoldCursor editTextBoldCursor = this.I;
                int i2 = -this.p0;
                this.p0 = i2;
                gm.A3(i2, editTextBoldCursor, null);
                return;
            }
            if (WalletEngine2.isValidRecipientAddress(this.h) && !this.r && i > 0 && l0 <= z4) {
                z = true;
            } else {
                z = false;
            }
            if (!TextUtils.isEmpty(this.I.getText()) && l0 > z4) {
                z2 = true;
            } else {
                z2 = false;
            }
            B0(z2);
            long l02 = l0();
            DecimalFormat decimalFormat = this.n0;
            if (decimalFormat == null) {
                decimalFormat = new DecimalFormat("#,##0.#########", new DecimalFormatSymbols(Locale.US));
                this.n0 = decimalFormat;
            }
            if (l02 > 0) {
                str = decimalFormat.format(BigDecimal.valueOf(l02, 9));
            } else {
                str = "";
            }
            b61 b61Var = this.e0;
            if (!this.r && !this.q0) {
                z3 = false;
            } else {
                z3 = true;
            }
            b61Var.setLoading(z3);
            b61 b61Var2 = this.e0;
            if (TextUtils.isEmpty(str)) {
                V = jb6.M0(2131742683, null);
            } else {
                V = jb6.V(null, null, 2131742684, c.p("Grams", str, 2131749264));
            }
            b61Var2.i(V, true, true);
            this.e0.setEnabled(z);
            D0();
            F0();
            boolean z5 = this.l0;
            io ioVar = this.O;
            if (z5) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) this.N).append((CharSequence) " ");
                int length = spannableStringBuilder.length();
                if (this.o0 == null) {
                    DecimalFormat decimalFormat2 = new DecimalFormat("#,##0.##", new DecimalFormatSymbols(Locale.US));
                    this.o0 = decimalFormat2;
                    decimalFormat2.setRoundingMode(RoundingMode.HALF_UP);
                }
                spannableStringBuilder.append((CharSequence) this.o0.format(BigDecimal.valueOf(l0).movePointLeft(9)));
                z0(spannableStringBuilder, length, spannableStringBuilder.length(), '.');
                spannableStringBuilder.append((CharSequence) " ");
                int length2 = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) jb6.M0(2131749290, null));
                spannableStringBuilder.setSpan(new RelativeSizeSpan(0.85714287f), length2, spannableStringBuilder.length(), 33);
                ioVar.setText(spannableStringBuilder.append((CharSequence) " ").append((CharSequence) this.M));
                return;
            }
            ioVar.setText(k0(C, l0));
        }
    }

    public final void D0() {
        boolean z;
        boolean z2;
        float f;
        if (this.S != null) {
            c C = c.C(this.currentAccount);
            this.S.setText(jb6.V(null, null, 2131742868, c.p("Grams", c.t(C.z(), false), 2131749264)));
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
                ey0 ey0Var = this.U;
                if (i >= 0) {
                    ey0Var.setText(jb6.V(null, null, 2131742754, c.w(j, false)));
                } else {
                    ey0Var.setText(jb6.V(null, null, 2131742754, this.V));
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
            this.Z.setInterpolator(d53.h);
            this.Z.addUpdateListener(new oxb(this, (byte) 18));
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
            if (l0() <= 0 && this.Q.getVisibility() != 0) {
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
                    public final rrc b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void run() {
                        byte b = r3;
                        int i = 4;
                        boolean z2 = z;
                        rrc rrcVar = this.b;
                        switch (b) {
                            case 0:
                                LinearLayout linearLayout = rrcVar.E;
                                if (z2) {
                                    i = 0;
                                }
                                linearLayout.setVisibility(i);
                                return;
                            default:
                                TextView textView = rrcVar.P;
                                if (!z2) {
                                    i = 0;
                                }
                                textView.setVisibility(i);
                                return;
                        }
                    }
                }).setDuration(320L);
                d53 d53Var = d53.h;
                duration.setInterpolator(d53Var).start();
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
                    public final rrc b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void run() {
                        byte b = r3;
                        int i = 4;
                        boolean z2 = z;
                        rrc rrcVar = this.b;
                        switch (b) {
                            case 0:
                                LinearLayout linearLayout = rrcVar.E;
                                if (z2) {
                                    i = 0;
                                }
                                linearLayout.setVisibility(i);
                                return;
                            default:
                                TextView textView = rrcVar.P;
                                if (!z2) {
                                    i = 0;
                                }
                                textView.setVisibility(i);
                                return;
                        }
                    }
                }).setDuration(320L).setInterpolator(d53Var).start();
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
        qrc qrcVar = this.F;
        float f4 = this.c0;
        if (this.b0 == null && f4 == 1.0f) {
            z = true;
        } else {
            z = false;
        }
        qrcVar.e(f4, max, z);
        this.F.setTranslationY((((this.x.getHeight() / 2.0f) - this.F.getTop()) - (this.F.getHeight() / 2.0f)) * f2);
        this.O.setAlpha(this.d0);
        this.O.setTranslationY(gm.L(16.0f) * f3);
        this.y.setAlpha(this.d0);
        this.y.setTranslationY(gm.L(16.0f) * f3);
        this.a0.setAlpha(this.d0);
        for (int i = 0; i < this.a0.getChildCount(); i++) {
            this.a0.getChildAt(i).setTranslationY(gm.L(24.0f) * f3);
        }
    }

    @Override
    public final CharSequence a0() {
        return jb6.M0(2131742679, null);
    }

    @Override
    public final boolean c0(c6c c6cVar, View view) {
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
        int i = cmb.c6;
        anb.h(i, getResourceProvider(), view);
        anb.h(i, getResourceProvider(), this.actionBar);
        this.actionBar.setCastShadows(false);
        r7 a = this.actionBar.t().a(1, 2131231248);
        a.setContentDescription(jb6.M0(2131754838, null));
        a.e(2, 2131232050, jb6.M0(2131742820, null));
        a.e(3, 2131231783, jb6.M0(2131742888, null));
        this.actionBar.setActionBarMenuOnItemClick(new im8(this, (byte) 27));
        FrameLayout frameLayout = (FrameLayout) this.fragmentView;
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        zqc zqcVar = new zqc(this.resourceProvider, context, new frc(this, (byte) 5), new frc(this, (byte) 6));
        this.w = zqcVar;
        frameLayout.addView(zqcVar, qoe.d(-2, 64.0f, 49, 16.0f, 5.0f, 16.0f, 0.0f));
        zqc zqcVar2 = this.w;
        if (zqcVar2 != null) {
            zqcVar2.a(this.h, this.f);
        }
        f7 f7Var = new f7(this, context);
        this.x = f7Var;
        f7Var.setOrientation(1);
        this.x.setClipChildren(false);
        this.x.setClipToPadding(false);
        frameLayout.addView(this.x, qoe.e(-1, -2, 17));
        qrc qrcVar = new qrc(context, getResourceProvider());
        this.F = qrcVar;
        if (qrcVar.getDiamondView().f == null) {
            this.d0 = 1.0f;
            this.c0 = 1.0f;
        }
        this.x.addView(this.F, qoe.t(-1, 64, 49, 16, 0, 16, 0));
        EditTextBoldCursor editText = this.F.getEditText();
        this.I = editText;
        editText.setFilters(new InputFilter[]{new s42(this, (byte) 3)});
        this.I.setImeOptions(33554438);
        this.I.setOnEditorActionListener(new arc(this, (byte) 1));
        this.I.addTextChangedListener(new og6(this, (byte) 26));
        long j = this.s;
        if (j > 0) {
            qrc qrcVar2 = this.F;
            BigDecimal valueOf = BigDecimal.valueOf(j, 9);
            if (valueOf.signum() == 0) {
                stripTrailingZeros = new BigDecimal(BigInteger.ZERO, 0);
            } else {
                stripTrailingZeros = valueOf.stripTrailingZeros();
            }
            qrcVar2.setAmountText(stripTrailingZeros.toPlainString());
            EditTextBoldCursor editTextBoldCursor = this.I;
            editTextBoldCursor.setSelection(editTextBoldCursor.length());
        }
        this.M = new SpannableString("⇅");
        pn2 pn2Var = new pn2(2131232833, 0);
        pn2Var.x = 0.72f;
        SpannableString spannableString = this.M;
        spannableString.setSpan(pn2Var, 0, spannableString.length(), 33);
        this.N = new SpannableString("G");
        pn2 pn2Var2 = new pn2(2131232837, 0);
        pn2Var2.d = false;
        SpannableString spannableString2 = this.N;
        spannableString2.setSpan(pn2Var2, 0, spannableString2.length(), 33);
        io ioVar = new io(context, false, true, true, true, true);
        this.O = ioVar;
        ioVar.c.m(0.35f, 320L, 3.5f, d53.h);
        this.O.setScaleProperty(0.25f);
        this.O.setText(k0(c.C(this.currentAccount), 0L));
        io ioVar2 = this.O;
        int i2 = cmb.y6;
        wmb p = anb.p(i, i2);
        anb.m(ioVar2, p.a, p.b, 4, 0.0f, getResourceProvider());
        this.O.setTextSize(gm.L(14.0f));
        this.O.setTypeface(gm.n1("fonts/gram.ttf"));
        this.O.setGravity(17);
        this.O.setPadding(gm.L(10.0f), 0, gm.L(10.0f), 0);
        this.O.setAllowCancel(true);
        int p1 = cmb.p1(0.08f, getThemedColor(i2));
        io ioVar3 = this.O;
        ShapeDrawable b0 = cmb.b0(gm.L(14.0f), p1);
        this.G = b0;
        ioVar3.setSizeableBackground(b0);
        this.x.addView(this.O, qoe.t(-2, 28, 49, 0, 8, 0, 0));
        rve.a(this.O);
        this.O.setOnClickListener(new View.OnClickListener(this) {
            public final rrc b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view2) {
                String m0;
                byte b = r2;
                rrc rrcVar = this.b;
                switch (b) {
                    case 0:
                        rrcVar.t0();
                        return;
                    case 1:
                        rrcVar.w0();
                        return;
                    case 2:
                        BigDecimal j0 = rrcVar.j0();
                        if (rrcVar.l0 || j0.signum() > 0) {
                            long l0 = rrcVar.l0();
                            rrcVar.l0 = !rrcVar.l0;
                            rrcVar.F0();
                            if (l0 <= 0) {
                                m0 = "";
                            } else if (rrcVar.l0) {
                                m0 = rrcVar.h0(l0, j0);
                            } else {
                                m0 = rrc.m0(l0);
                            }
                            rrcVar.F.setAmountText(m0);
                            rrcVar.I.setSelection(m0.length());
                            return;
                        }
                        return;
                    default:
                        rrcVar.p0();
                        return;
                }
            }
        });
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.y = frameLayout2;
        this.x.addView(frameLayout2, qoe.r(-2, -2, 49));
        LinearLayout linearLayout = new LinearLayout(context);
        this.E = linearLayout;
        linearLayout.setOrientation(1);
        this.y.addView(this.E, qoe.e(-2, -2, 49));
        TextView textView = new TextView(context);
        this.P = textView;
        textView.setTextSize(1, 14.0f);
        TextView textView2 = this.P;
        int i3 = cmb.Ei;
        anb.X(textView2, i3, getResourceProvider());
        anb.R(this.P, cmb.Z(cmb.p1(0.1f, getThemedColor(i3)), cmb.p1(0.25f, getThemedColor(i3)), 14, 14), anb.K(0.1f, i3), anb.K(0.25f, i3), getResourceProvider());
        this.P.setPadding(gm.L(10.0f), 0, gm.L(10.0f), 0);
        this.P.setGravity(17);
        this.P.setTypeface(gm.o());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(jb6.M0(2131742820, null));
        spannableStringBuilder.append((CharSequence) " >");
        pn2 pn2Var3 = new pn2(2131232714, 0);
        float N = gm.N(0.66f);
        pn2Var3.r = 0.0f;
        pn2Var3.s = N;
        spannableStringBuilder.setSpan(pn2Var3, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        this.P.setText(spannableStringBuilder);
        this.y.addView(this.P, qoe.d(-2, 28.0f, 49, 0.0f, 8.0f, 0.0f, 0.0f));
        rve.a(this.P);
        this.P.setOnClickListener(new View.OnClickListener(this) {
            public final rrc b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view2) {
                String m0;
                byte b = r2;
                rrc rrcVar = this.b;
                switch (b) {
                    case 0:
                        rrcVar.t0();
                        return;
                    case 1:
                        rrcVar.w0();
                        return;
                    case 2:
                        BigDecimal j0 = rrcVar.j0();
                        if (rrcVar.l0 || j0.signum() > 0) {
                            long l0 = rrcVar.l0();
                            rrcVar.l0 = !rrcVar.l0;
                            rrcVar.F0();
                            if (l0 <= 0) {
                                m0 = "";
                            } else if (rrcVar.l0) {
                                m0 = rrcVar.h0(l0, j0);
                            } else {
                                m0 = rrc.m0(l0);
                            }
                            rrcVar.F.setAmountText(m0);
                            rrcVar.I.setSelection(m0.length());
                            return;
                        }
                        return;
                    default:
                        rrcVar.p0();
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
        m37 m37Var = new m37(0, true, false, null);
        m37Var.x = false;
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = m37Var.c;
        paint.setStyle(style);
        paint.setStrokeWidth(Math.max(1.0f, gm.N(0.5f)));
        int i4 = cmb.am;
        paint.setColor(getThemedColor(i4));
        m37Var.w = Integer.valueOf(getThemedColor(i4));
        this.Q.setPadding(gm.L(15.0f), gm.L(7.0f), gm.L(19.0f), gm.L(8.0f));
        this.Q.setBackground(m37Var);
        this.H = m37Var;
        this.Q.setTextSize(1, 14.0f);
        anb.X(this.Q, i2, getResourceProvider());
        this.Q.setTypeface(gm.o());
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
        this.E.addView(this.Q, qoe.t(-2, -2, 49, 32, 12, 32, 0));
        this.Q.setOnClickListener(new View.OnClickListener(this) {
            public final rrc b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view2) {
                String m0;
                byte b = r2;
                rrc rrcVar = this.b;
                switch (b) {
                    case 0:
                        rrcVar.t0();
                        return;
                    case 1:
                        rrcVar.w0();
                        return;
                    case 2:
                        BigDecimal j0 = rrcVar.j0();
                        if (rrcVar.l0 || j0.signum() > 0) {
                            long l0 = rrcVar.l0();
                            rrcVar.l0 = !rrcVar.l0;
                            rrcVar.F0();
                            if (l0 <= 0) {
                                m0 = "";
                            } else if (rrcVar.l0) {
                                m0 = rrcVar.h0(l0, j0);
                            } else {
                                m0 = rrc.m0(l0);
                            }
                            rrcVar.F.setAmountText(m0);
                            rrcVar.I.setSelection(m0.length());
                            return;
                        }
                        return;
                    default:
                        rrcVar.p0();
                        return;
                }
            }
        });
        rve.b(this.Q, 0.02f, 1.2f);
        E0();
        l66 l66Var = new l66(context, this.resourceProvider);
        this.R = l66Var;
        anb.X(l66Var, cmb.p7, getResourceProvider());
        anb.G(this.R, i3, getResourceProvider());
        this.R.setTextSize(1, 14.0f);
        this.R.setGravity(17);
        this.R.setTypeface(gm.o());
        this.R.setPadding(gm.L(10.0f), 0, gm.L(10.0f), 0);
        B0(false);
        this.E.addView(this.R, qoe.t(-2, -2, 49, 0, 10, 0, 0));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.a0 = linearLayout2;
        linearLayout2.setOrientation(1);
        this.a0.setPadding(gm.L(16.0f), 0, gm.L(16.0f), gm.L(12.0f));
        this.a0.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{cmb.p1(0.0f, getThemedColor(i)), getThemedColor(i), getThemedColor(i)}));
        TextView textView4 = new TextView(context);
        this.S = textView4;
        anb.X(textView4, i2, getResourceProvider());
        this.S.setTextSize(1, 14.0f);
        this.S.setGravity(17);
        this.a0.addView(this.S, qoe.t(-1, -2, 55, 16, 0, 16, 0));
        this.T = new SpannableString(">");
        pn2 pn2Var4 = new pn2(2131232714, 0);
        pn2Var4.r = 0.0f;
        pn2Var4.s = gm.L(1.0f);
        SpannableString spannableString3 = this.T;
        spannableString3.setSpan(pn2Var4, 0, spannableString3.length(), 33);
        ey0 ey0Var = new ey0((byte) 10, context, this);
        this.U = ey0Var;
        anb.X(ey0Var, i2, getResourceProvider());
        this.U.setTextSize(1, 14.0f);
        this.U.setGravity(17);
        this.U.setPadding(0, gm.L(4.0f), 0, gm.L(4.0f));
        this.U.setVisibility(8);
        this.a0.addView(this.U, qoe.t(-1, -2, 55, 16, 0, 16, 0));
        SpannableString spannableString4 = new SpannableString(jb6.M0(2131748536, null));
        this.V = spannableString4;
        spannableString4.setSpan(new ta6(gm.L(80.0f), this.U), 0, this.V.length(), 33);
        b61 b61Var = new b61(getResourceProvider(), context, true);
        b61Var.setRoundRadius(24);
        this.e0 = b61Var;
        b61Var.setText(jb6.M0(2131742683, null));
        this.e0.setEnabled(false);
        this.e0.setOnClickListener(new View.OnClickListener(this) {
            public final rrc b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view2) {
                String m0;
                byte b = r2;
                rrc rrcVar = this.b;
                switch (b) {
                    case 0:
                        rrcVar.t0();
                        return;
                    case 1:
                        rrcVar.w0();
                        return;
                    case 2:
                        BigDecimal j0 = rrcVar.j0();
                        if (rrcVar.l0 || j0.signum() > 0) {
                            long l0 = rrcVar.l0();
                            rrcVar.l0 = !rrcVar.l0;
                            rrcVar.F0();
                            if (l0 <= 0) {
                                m0 = "";
                            } else if (rrcVar.l0) {
                                m0 = rrcVar.h0(l0, j0);
                            } else {
                                m0 = rrc.m0(l0);
                            }
                            rrcVar.F.setAmountText(m0);
                            rrcVar.I.setSelection(m0.length());
                            return;
                        }
                        return;
                    default:
                        rrcVar.p0();
                        return;
                }
            }
        });
        this.a0.addView(this.e0, qoe.t(-1, 48, 87, 0, 14, 0, 0));
        frameLayout.addView(this.a0, qoe.e(-1, -2, 87));
        C0();
        G0();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == nm7.e4) {
            D0();
            C0();
        }
    }

    public final void f0() {
        try {
            ShapeDrawable shapeDrawable = this.G;
            if (shapeDrawable != null) {
                shapeDrawable.getPaint().setColor(cmb.p1(0.08f, getThemedColor(cmb.y6)));
                this.G.invalidateSelf();
                io ioVar = this.O;
                if (ioVar != null) {
                    ioVar.invalidate();
                }
            }
            if (this.H != null) {
                int themedColor = getThemedColor(cmb.am);
                this.H.c.setColor(themedColor);
                this.H.w = Integer.valueOf(themedColor);
                this.H.invalidateSelf();
                TextView textView = this.Q;
                if (textView != null) {
                    textView.invalidate();
                }
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    public final void g0() {
        qrc qrcVar = this.F;
        if (qrcVar != null) {
            qrcVar.getDiamondView().l(null);
        }
        zna znaVar = this.b0;
        if (znaVar != null) {
            znaVar.d();
        }
        this.c0 = 1.0f;
        if (this.F != null) {
            G0();
        }
    }

    public final String h0(long j, BigDecimal bigDecimal) {
        int i;
        BigDecimal stripTrailingZeros;
        BigDecimal movePointLeft = BigDecimal.valueOf(j).multiply(bigDecimal).movePointLeft(9);
        TL_wallet.currencyRate o0 = o0();
        if (o0 != null) {
            i = o0.exp;
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
        int i0 = i0(bigDecimal);
        if (scale.scale() > i0) {
            scale = scale.setScale(i0, RoundingMode.DOWN);
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

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final BigDecimal j0() {
        c C = c.C(this.currentAccount);
        C.h.f();
        double h = C.h.h();
        double d = oc7.r1(this.currentAccount).l4.k.i;
        if (h > 0.0d && d > 0.0d && !Double.isNaN(h) && !Double.isInfinite(h) && !Double.isNaN(d) && !Double.isInfinite(d)) {
            return BigDecimal.valueOf(h).multiply(BigDecimal.valueOf(d));
        }
        return BigDecimal.ZERO;
    }

    public final SpannableStringBuilder k0(c cVar, long j) {
        char c;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("≈ ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append(cVar.q(j, false));
        int length2 = spannableStringBuilder.length();
        TL_wallet.currencyRate o0 = o0();
        if (o0 != null && !TextUtils.isEmpty(o0.decimalSeparator)) {
            c = o0.decimalSeparator.charAt(0);
        } else {
            c = '.';
        }
        z0(spannableStringBuilder, length, length2, c);
        return spannableStringBuilder.append((CharSequence) " ").append((CharSequence) this.M);
    }

    public final long l0() {
        EditTextBoldCursor editTextBoldCursor = this.I;
        if (editTextBoldCursor != null) {
            BigDecimal u0 = u0(editTextBoldCursor.getText().toString());
            if (this.l0) {
                BigDecimal j0 = j0();
                if (j0.signum() <= 0) {
                    return 0L;
                }
                u0 = u0.divide(j0, 9, RoundingMode.DOWN).setScale(2, RoundingMode.HALF_UP);
            }
            BigInteger bigInteger = u0.movePointRight(9).toBigInteger();
            if (bigInteger.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) > 0) {
                return Long.MAX_VALUE;
            }
            return bigInteger.longValue();
        }
        return 0L;
    }

    public final byte[] n0() {
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

    public final TL_wallet.currencyRate o0() {
        l53 l53Var = c.C(this.currentAccount).h;
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

    @Override
    public final AnimatorSet onCustomTransitionAnimation(boolean z, Runnable runnable) {
        View view;
        TL_wallet.walletTransaction wallettransaction;
        qrc qrcVar;
        View view2;
        if (!z && this.u0 != null && (wallettransaction = this.r0) != null && wallettransaction.localMessageId != 0 && (qrcVar = this.F) != null) {
            npc diamondView = qrcVar.getDiamondView();
            if (diamondView.f != null && diamondView.isShown() && diamondView.getAlpha() > 0.01f && (view2 = this.fragmentView) != null && (view2.getParent() instanceof View) && getParentLayout() != null) {
                apc apcVar = new apc(getParentLayout().getView(), (View) this.fragmentView.getParent(), this.F.getDiamondView(), this.u0, this.r0, runnable, null);
                this.v0 = apcVar;
                return apcVar.m;
            }
        }
        if (!z && this.s0 != null && this.r0 != null && this.F != null && (view = this.fragmentView) != null && (view.getParent() instanceof View) && getParentLayout() != null) {
            esc escVar = new esc(getParentLayout().getView(), (View) this.fragmentView.getParent(), this.F.getDiamondView(), this.s0, this.r0, runnable, null);
            this.t0 = escVar;
            return escVar.m;
        }
        return super.onCustomTransitionAnimation(z, runnable);
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().b(this, nm7.e4);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        this.J = false;
        g0();
        apc apcVar = this.v0;
        if (apcVar != null) {
            AnimatorSet animatorSet = apcVar.m;
            if (!apcVar.v) {
                if (animatorSet.isStarted()) {
                    animatorSet.cancel();
                } else {
                    apcVar.a(false);
                }
            }
            this.v0 = null;
        }
        esc escVar = this.t0;
        if (escVar != null) {
            AnimatorSet animatorSet2 = escVar.m;
            if (!escVar.s) {
                if (animatorSet2.isStarted()) {
                    animatorSet2.cancel();
                } else {
                    escVar.b();
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
        getNotificationCenter().n(this, nm7.e4);
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i, int i2, int i3, int i4) {
        this.j0 = i4;
        if (this.a0 != null) {
            int max = Math.max(0, this.k0 - i4);
            this.a0.setPadding(gm.L(16.0f), 0, gm.L(16.0f), gm.L(12.0f) + this.j0);
            if (this.w0 != max) {
                this.a0.animate().cancel();
                this.a0.animate().translationY(-max).setDuration(320L).setInterpolator(d53.h).start();
                this.w0 = max;
            }
        }
    }

    @Override
    public final wzc onInsetsInternal(View view, wzc wzcVar) {
        this.k0 = wzcVar.a.f(8).d;
        return super.onInsetsInternal(view, wzcVar);
    }

    @Override
    public final void onPause() {
        g0();
        this.J = false;
        EditTextBoldCursor editTextBoldCursor = this.I;
        if (editTextBoldCursor != null) {
            editTextBoldCursor.removeCallbacks(this.K);
            this.fragmentView.requestFocus();
            gm.t1(this.I);
        }
        super.onPause();
    }

    @Override
    public final void onResume() {
        super.onResume();
        s0();
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            f0();
            int themedColor = getThemedColor(cmb.c6);
            LinearLayout linearLayout = this.a0;
            if (linearLayout != null && themedColor != this.x0 && (linearLayout.getBackground() instanceof GradientDrawable)) {
                this.x0 = themedColor;
                ((GradientDrawable) this.a0.getBackground()).setColors(new int[]{cmb.p1(0.0f, themedColor), themedColor, themedColor});
            }
        } catch (Exception e) {
            fc4.g(e, true);
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
        qrc qrcVar;
        super.onTransitionAnimationStart(z, z2);
        if (z && !z2 && (qrcVar = this.F) != null && this.c0 < 1.0f) {
            qrcVar.getDiamondView().l(new frc(this, (byte) 1));
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

    public final void p0() {
        goc.M0(this.currentAccount, getResourceProvider(), getParentActivity());
    }

    public final void q0(TL_wallet.walletUserAddress walletuseraddress) {
        this.r = false;
        this.e = walletuseraddress;
        if (walletuseraddress != null && walletuseraddress.user_id != 0) {
            this.f = oc7.r1(this.currentAccount).W1(Long.valueOf(walletuseraddress.user_id));
        }
        va vaVar = this.a;
        if (vaVar != null) {
            vaVar.g3.O(true);
        }
        C0();
        zqc zqcVar = this.w;
        if (zqcVar != null) {
            zqcVar.a(this.h, this.f);
        }
    }

    public final void r0(String str) {
        if (c.K(str)) {
            this.q0 = false;
            this.e0.setLoading(false);
        } else if (str != null) {
            this.q0 = false;
            this.e0.setLoading(false);
            c41.b0(this).f0(str, false);
        } else if (this.g0) {
            tk5 parentLayout = getParentLayout();
            if (parentLayout == null) {
                finishFragment();
                return;
            }
            long j = this.f.id;
            ArrayList arrayList = new ArrayList(parentLayout.getFragmentStack());
            if (!arrayList.isEmpty() && b10.f(1, arrayList) == this) {
                int size = arrayList.size() - 2;
                while (true) {
                    if (size < 0) {
                        break;
                    }
                    d dVar = (d) arrayList.get(size);
                    if ((dVar instanceof yv1) && dVar.getCurrentAccount() == this.currentAccount) {
                        yv1 yv1Var = (yv1) dVar;
                        if (yv1Var.a() == j && yv1Var.g4 == 0) {
                            this.u0 = yv1Var;
                            for (int size2 = arrayList.size() - 2; size2 > size; size2--) {
                                ((ActionBarLayout) parentLayout).c0((d) arrayList.get(size2), false);
                            }
                        }
                    }
                    size--;
                }
                if (this.u0 == null) {
                    getNotificationCenter().k(nm7.u, Long.valueOf(j), Boolean.FALSE);
                    yv1 ga = yv1.ga(j);
                    ga.setCurrentAccount(this.currentAccount);
                    if (!((ActionBarLayout) parentLayout).b(parentLayout.getFragmentStack().size() - 1, ga)) {
                        finishFragment();
                        return;
                    }
                    this.u0 = ga;
                }
                finishFragment();
            }
        } else {
            v0();
        }
    }

    public final void s0() {
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
                bArr = n0();
            } else {
                bArr = null;
            }
            C.l(str, 0L, str2, bArr, new hrc(this, (byte) 1));
        }
    }

    public final void t0() {
        boolean z;
        AlertDialog$Builder alertDialog$Builder;
        boolean z2;
        int i;
        int i2;
        int L;
        boolean z3;
        Activity parentActivity = getParentActivity();
        if (parentActivity != null) {
            if (this.k0 - this.j0 > gm.L(20.0f)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                alertDialog$Builder = new AlertDialog$Builder(0, getResourceProvider(), parentActivity);
            } else {
                alertDialog$Builder = new AlertDialog$Builder(0, getResourceProvider(), parentActivity);
            }
            String M0 = jb6.M0(2131742888, null);
            he heVar = alertDialog$Builder.a;
            heVar.S = M0;
            a52 a52Var = new a52(this, parentActivity);
            a52Var.setTextSize(1, 18.0f);
            anb.X(a52Var, cmb.i5, getResourceProvider());
            anb.D(a52Var, cmb.s5, getResourceProvider());
            a52Var.setHint(jb6.M0(2131742852, null));
            a52Var.setText(this.h0);
            a52Var.setSelection(a52Var.length());
            a52Var.setInputType(147457);
            a52Var.setMaxLines(5);
            a52Var.setImeOptions(6);
            anb.F(a52Var, cmb.j6, cmb.k6, cmb.o7, getResourceProvider());
            a52Var.setBackground(null);
            a52Var.setPadding(0, gm.L(10.0f), gm.L(48.0f), gm.L(10.0f));
            oh2 oh2Var = new oh2(1, getResourceProvider(), parentActivity);
            int i3 = cmb.h6;
            fg0 f0 = cmb.f0(cmb.v0(i3, this.resourceProvider), 7, gm.L(12.0f));
            wmb M = anb.M(i3);
            ylb ylbVar = this.resourceProvider;
            oh2Var.setBackground(f0);
            anb.j(oh2Var, f0, null, M, ylbVar);
            String M02 = jb6.M0(2131742759, null);
            if (this.i0 && n0() != null) {
                z2 = false;
            } else {
                z2 = true;
            }
            oh2Var.e(M02, "", z2, false, false);
            oh2Var.setMultiline(true);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) oh2Var.getCheckBoxView().getLayoutParams();
            layoutParams.topMargin = 0;
            if (jb6.a0) {
                i = 5;
            } else {
                i = 3;
            }
            layoutParams.gravity = i | 16;
            oh2Var.getCheckBoxView().setLayoutParams(layoutParams);
            if (jb6.a0) {
                i2 = gm.L(4.0f);
            } else {
                i2 = 0;
            }
            int L2 = gm.L(12.0f);
            if (jb6.a0) {
                L = 0;
            } else {
                L = gm.L(4.0f);
            }
            oh2Var.setPadding(i2, L2, L, gm.L(12.0f));
            if (n0() != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            oh2Var.setEnabled(z3);
            oh2Var.setOnClickListener(new kf(oh2Var, (byte) 5));
            LinearLayout linearLayout = new LinearLayout(parentActivity);
            linearLayout.setOrientation(1);
            linearLayout.addView(a52Var, qoe.k(24.0f, 4.0f, 24.0f, 4.0f, -1, -2));
            linearLayout.addView(oh2Var, qoe.t(-1, -2, 83, 8, 0, 8, 0));
            heVar.H = (byte) 6;
            alertDialog$Builder.n(linearLayout);
            heVar.a = gm.L(292.0f);
            alertDialog$Builder.g(jb6.M0(2131752542, null), new rjb((byte) 21));
            alertDialog$Builder.j(jb6.M0(2131754483, null), new jq9(this, a52Var, oh2Var, (byte) 15));
            heVar.setOnShowListener(new jh(a52Var, (byte) 6));
            heVar.setOnDismissListener(new qj8(this, (byte) 17));
            if (z) {
                heVar.q(250L);
            } else {
                heVar.show();
            }
            heVar.k0 = false;
            View c = heVar.c(-1);
            if ((c instanceof TextView) && !TextUtils.isEmpty(this.h0)) {
                a52Var.addTextChangedListener(new b52(a52Var, (TextView) c, (byte) 0));
            }
        }
    }

    public final void v0() {
        tk5 parentLayout = getParentLayout();
        if (parentLayout == null) {
            finishFragment();
            return;
        }
        ArrayList arrayList = new ArrayList(parentLayout.getFragmentStack());
        if (!arrayList.isEmpty() && b10.f(1, arrayList) == this) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                d dVar = (d) obj;
                if (dVar instanceof asc) {
                    ((ActionBarLayout) parentLayout).c0(dVar, false);
                }
            }
            List fragmentStack = parentLayout.getFragmentStack();
            if (fragmentStack.size() >= 2 && (aq1.m(2, fragmentStack) instanceof goc) && ((d) aq1.m(2, fragmentStack)).getCurrentAccount() == this.currentAccount) {
                this.s0 = (goc) aq1.m(2, fragmentStack);
            } else {
                goc gocVar = new goc();
                gocVar.setCurrentAccount(this.currentAccount);
                if (((ActionBarLayout) parentLayout).b(fragmentStack.size() - 1, gocVar)) {
                    this.s0 = gocVar;
                }
            }
            finishFragment();
        }
    }

    public final void w0() {
        String m0;
        b61 b61Var = this.e0;
        if (b61Var.e0 && !b61Var.R) {
            c C = c.C(this.currentAccount);
            long l0 = l0();
            long z = C.z();
            if (!this.r && WalletEngine2.isValidRecipientAddress(this.h) && l0 > 0) {
                long f = oc7.r1(this.currentAccount).l4.p0.f();
                byte[] bArr = null;
                if (l0 < f) {
                    if (this.l0) {
                        m0 = h0(f, j0());
                    } else {
                        m0 = m0(f);
                    }
                    this.F.setAmountText(m0);
                    this.I.setSelection(m0.length());
                    EditTextBoldCursor editTextBoldCursor = this.I;
                    int i = -this.p0;
                    this.p0 = i;
                    gm.A3(i, editTextBoldCursor, null);
                } else if (l0 > z) {
                    xx0.APP_ERROR.a();
                    l66 l66Var = this.R;
                    int i2 = -this.p0;
                    this.p0 = i2;
                    gm.A3(i2, l66Var, null);
                } else {
                    long j = this.f0;
                    if (j >= 0 && l0 + j > z) {
                        l0 -= j;
                    }
                    boolean z2 = false;
                    this.J = false;
                    EditTextBoldCursor editTextBoldCursor2 = this.I;
                    if (editTextBoldCursor2 != null) {
                        editTextBoldCursor2.removeCallbacks(this.K);
                        this.fragmentView.requestFocus();
                        gm.t1(this.I);
                    }
                    this.e0.setLoading(true);
                    this.r0 = null;
                    if (this.f != null && TextUtils.isEmpty(this.n)) {
                        this.q0 = true;
                        TLRPC.User user = this.f;
                        long j2 = l0;
                        String str = this.h;
                        String str2 = this.h0;
                        if (this.i0) {
                            bArr = n0();
                        }
                        C.l0(user, str, j2, str2, bArr, null, null, new irc(this, (byte) 0), new irc(this, (byte) 1));
                        return;
                    }
                    String str3 = this.h0;
                    if (this.i0) {
                        bArr = n0();
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
                        wallettransaction.amount = l0;
                        gm.t1(this.I);
                        goc.J0(getParentActivity(), getCurrentAccount(), wallettransaction, new jrc(this, C, l0, (byte) 0), new hrc(this, (byte) 3), n0(), null, getResourceProvider());
                        gm.d3(new frc(this, (byte) 2), 1000L);
                        return;
                    }
                    long j3 = l0;
                    C.l(this.h, j3, str3, bArr, new la7(this, str3, z2, C, j3));
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
        ey0 ey0Var = this.U;
        if (f > 0.0f) {
            i = 0;
        } else {
            i = 8;
        }
        ey0Var.setVisibility(i);
        ((LinearLayout.LayoutParams) this.U.getLayoutParams()).topMargin = Math.round(gm.L(4.0f) * f);
        this.U.requestLayout();
    }

    public rrc(String str) {
        this(z8c.t0, str);
    }

    public rrc(TLRPC.User user) {
        this.s = 0L;
        this.K = new frc(this, (byte) 0);
        this.L = new ViewTreeObserver.OnWindowFocusChangeListener() {
            @Override
            public final void onWindowFocusChanged(boolean z) {
                EditTextBoldCursor editTextBoldCursor;
                rrc rrcVar = rrc.this;
                Runnable runnable = rrcVar.K;
                if (z && rrcVar.J && (editTextBoldCursor = rrcVar.I) != null) {
                    editTextBoldCursor.removeCallbacks(runnable);
                    rrcVar.I.post(runnable);
                }
            }
        };
        this.f0 = -1L;
        this.i0 = true;
        this.p0 = 6;
        this.f = user;
        this.h = null;
        this.r = true;
        c.C(this.currentAccount).i0(user, new hrc(this, (byte) 2));
    }

    @Override
    public final void Z(ArrayList arrayList, l7c l7cVar) {
    }

    @Override
    public final void b0(c6c c6cVar, View view) {
    }
}
