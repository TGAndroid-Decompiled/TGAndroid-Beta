package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.TwoStepVerificationActivity;
public final class ij1 extends wka implements snb {
    public static ij1 t1;
    public static HashMap u1;
    public final c51 A0;
    public int B0;
    public final u1 C0;
    public TL_stars.StarsAmount D0;
    public final in E0;
    public final in F0;
    public final xi1 G0;
    public final wm2[] H0;
    public final LinearLayout I0;
    public final c51 J0;
    public final ws0 K0;
    public boolean L0;
    public boolean M0;
    public long N0;
    public final xs0 O0;
    public v21 P0;
    public boolean Q0;
    public int R0;
    public Runnable S0;
    public final nf9 T0;
    public int U0;
    public int V0;
    public int W0;
    public final q9c X0;
    public final FrameLayout Y0;
    public DecimalFormat Z0;
    public final ej1 a1;
    public final boolean b1;
    public final boolean c1;
    public final vy4 d1;
    public SpannableStringBuilder e1;
    public final oi1 f1;
    public double g1;
    public double h1;
    public a i1;
    public boolean j1;
    public boolean k1;
    public i1b l1;
    public final w1b m0;
    public i1b m1;
    public final vnb n0;
    public i1b n1;
    public final int o0;
    public boolean o1;
    public final long p0;
    public final fj1 p1;
    public TL_stories.TL_premium_boostsStatus q0;
    public final fj1 q1;
    public int r0;
    public final fj1 r1;
    public final SpannableStringBuilder s0;
    public final ni1 s1;
    public final SpannableStringBuilder t0;
    public final SpannableStringBuilder u0;
    public final SpannableStringBuilder v0;
    public final u1 w0;
    public final RelativeSizeSpan x0;
    public final in y0;
    public final in z0;

    public ij1(Activity activity, w1b w1bVar, int i, long j, vnb vnbVar, vy4 vy4Var, boolean z, boolean z2) {
        super(activity);
        this.D0 = TL_stars.StarsAmount.ofStars(0L);
        this.H0 = new wm2[1];
        this.L0 = false;
        this.M0 = true;
        this.Q0 = true;
        this.R0 = -1;
        this.j1 = false;
        this.k1 = false;
        this.o1 = false;
        String M0 = ob6.M0(2131748138, null);
        fj1 fj1Var = new fj1();
        fj1Var.a = false;
        fj1Var.b = "TON";
        fj1Var.h = "XTR";
        fj1Var.c = M0;
        this.p1 = fj1Var;
        String M02 = ob6.M0(2131748137, null);
        fj1 fj1Var2 = new fj1();
        fj1Var2.a = false;
        fj1Var2.b = "TON";
        fj1Var2.h = "XTR";
        fj1Var2.c = M02;
        this.q1 = fj1Var2;
        String M03 = ob6.M0(2131748136, null);
        fj1 fj1Var3 = new fj1();
        fj1Var3.a = false;
        fj1Var3.b = "TON";
        fj1Var3.h = "XTR";
        fj1Var3.c = M03;
        this.r1 = fj1Var3;
        this.s1 = new ni1(this, (byte) 7);
        this.d1 = vy4Var;
        this.b1 = z;
        this.c1 = z2;
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
        decimalFormatSymbols.setDecimalSeparator('.');
        DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
        this.Z0 = decimalFormat;
        decimalFormat.setMinimumFractionDigits(2);
        this.Z0.setMaximumFractionDigits(12);
        this.Z0.setGroupingUsed(false);
        this.m0 = w1bVar;
        this.n0 = vnbVar;
        this.o0 = i;
        this.p0 = j;
        long j2 = -j;
        TLRPC.Chat M04 = uc7.s1(i).M0(Long.valueOf(j2));
        if (M04 != null) {
            this.r0 = M04.level;
        }
        uc7.s1(i).G0().a(j, new te2(this, (byte) 15));
        I(false);
        if (z) {
            TLRPC.TL_payments_getStarsRevenueStats tL_payments_getStarsRevenueStats = new TLRPC.TL_payments_getStarsRevenueStats();
            tL_payments_getStarsRevenueStats.dark = aob.I.o();
            tL_payments_getStarsRevenueStats.ton = true;
            tL_payments_getStarsRevenueStats.peer = uc7.s1(i).j1(j);
            TLRPC.ChatFull N0 = uc7.s1(i).N0(j2);
            if (N0 != null) {
                boolean z3 = N0.restricted_sponsored;
                this.j1 = z3;
                this.k1 = z3;
            }
            ConnectionsManager.getInstance(i).sendRequest(tL_payments_getStarsRevenueStats, new ri1(this, (byte) 1), null, null, 0, Integer.MAX_VALUE, 1, true);
        }
        TLRPC.Chat M05 = uc7.s1(i).M0(Long.valueOf(j2));
        this.s0 = hl.D2(hl.N2(ob6.a0(null, null, 2131748153, 50), -1, 3, new tu0(w1bVar, activity, vnbVar, (byte) 21), vnbVar), true);
        this.t0 = hl.D2(hl.N2(ob6.M0(uc7.s1(i).l4.b3.f ? 2131748159 : 2131748157, null), -1, 3, new ni1(this, (byte) 0), null), true);
        this.u0 = hl.D2(hl.N2(ob6.M0(z2 ? z ? 2131748133 : 2131748135 : 2131748131, null), -1, 3, new oi1(this, z2 ? z ? 2131748132 : 2131748134 : 2131748130, (byte) 0), vnbVar), true);
        this.v0 = hl.D2(hl.N2(ob6.M0(xc2.V(M05) ? 2131748126 : 2131748125, null), -1, 0, new ni1(this, (byte) 1), null), true);
        setCommonInsetsManagedExternally(true);
        setGeometry(new ri6(this, (byte) 16));
        this.T0 = new nf9((byte) 7, activity, this);
        ej1 ej1Var = new ej1(this, activity, i, j, w1bVar.getClassGuid(), new ni1(this, (byte) 2), vnbVar);
        this.a1 = ej1Var;
        u1 u1Var = new u1((byte) 3, activity, false);
        this.w0 = u1Var;
        u1Var.setOrientation(1);
        int i2 = aob.d6;
        yob.h(i2, vnbVar, u1Var);
        u1Var.setPadding(0, 0, 0, hl.L(17.0f));
        in inVar = new in(activity, false, true, true);
        this.y0 = inVar;
        inVar.setTypeface(hl.o());
        int i3 = aob.G6;
        yob.U(inVar, i3, vnbVar);
        inVar.setTextSize(hl.L(32.0f));
        inVar.setGravity(17);
        this.x0 = new RelativeSizeSpan(0.6770833f);
        u1Var.addView(inVar, tre.t(-1, 38, 49, 22, 15, 22, 0));
        in inVar2 = new in(activity, true, true, true);
        this.z0 = inVar2;
        inVar2.setGravity(17);
        int i4 = aob.y6;
        yob.U(inVar2, i4, vnbVar);
        inVar2.setTextSize(hl.L(14.0f));
        u1Var.addView(inVar2, tre.d(-1, 17.0f, 49, 22.0f, 4.0f, 22.0f, 0.0f));
        c51 c51Var = new c51(vnbVar, activity, true);
        c51Var.setRoundRadius(24);
        this.A0 = c51Var;
        c51Var.setEnabled(uc7.s1(i).l4.b3.f);
        c51Var.i(ob6.M0(2131748105, null), false, true);
        c51Var.setVisibility(8);
        c51Var.setOnClickListener(new sb1(this, w1bVar, (byte) 3));
        u1Var.addView(c51Var, tre.d(-1, 48.0f, 55, 18.0f, 13.0f, 18.0f, 0.0f));
        u1 u1Var2 = new u1((byte) 4, activity, false);
        this.C0 = u1Var2;
        u1Var2.setOrientation(1);
        yob.h(i2, vnbVar, u1Var2);
        u1Var2.setPadding(0, 0, 0, hl.L(17.0f));
        in inVar3 = new in(activity, false, true, true);
        this.E0 = inVar3;
        inVar3.setTypeface(hl.o());
        yob.U(inVar3, i3, vnbVar);
        inVar3.setTextSize(hl.L(32.0f));
        inVar3.setGravity(17);
        new RelativeSizeSpan(0.6770833f);
        u1Var2.addView(inVar3, tre.t(-1, 38, 49, 22, 15, 22, 0));
        in inVar4 = new in(activity, true, true, true);
        this.F0 = inVar4;
        inVar4.setGravity(17);
        yob.U(inVar4, i4, vnbVar);
        inVar4.setTextSize(hl.L(14.0f));
        u1Var2.addView(inVar4, tre.d(-1, 17.0f, 49, 22.0f, 4.0f, 22.0f, 0.0f));
        ws0 ws0Var = new ws0((byte) 1, activity, this);
        this.K0 = ws0Var;
        ws0Var.setVisibility(8);
        ws0Var.setText(ob6.M0(2131752934, null));
        ws0Var.setLeftPadding(hl.L(36.0f));
        xs0 xs0Var = new xs0(activity, (byte) 1);
        this.O0 = xs0Var;
        xs0Var.setFocusable(false);
        yob.X(xs0Var, i3, vnbVar);
        xs0Var.setCursorSize(hl.L(20.0f));
        xs0Var.setCursorWidth(1.5f);
        xs0Var.setBackground(null);
        xs0Var.setTextSize(1, 18.0f);
        xs0Var.setMaxLines(1);
        int L = hl.L(16.0f);
        xs0Var.setPadding(hl.L(6.0f), L, L, L);
        xs0Var.setInputType(2);
        xs0Var.setTypeface(Typeface.DEFAULT);
        yob.C(xs0Var, aob.lg, vnbVar);
        yob.l(xs0Var, 36, aob.mg, vnbVar);
        xs0Var.setGravity(ob6.a0 ? 5 : 3);
        xs0Var.setOnFocusChangeListener(new ts0(this, (byte) 1));
        xs0Var.addTextChangedListener(new wi1(this));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(0);
        ImageView imageView = new ImageView(activity);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(2131232775);
        linearLayout.addView(imageView, tre.q(-2, -2, 0.0f, 19, 14, 0, 0, 0));
        linearLayout.addView(xs0Var, tre.p(-1, -2, 1.0f, 119));
        ws0Var.e(xs0Var);
        ws0Var.addView(linearLayout, tre.e(-1, -2, 48));
        u1Var2.addView(ws0Var, tre.t(-1, -2, 1, 18, 14, 18, 2));
        LinearLayout linearLayout2 = new LinearLayout(activity);
        this.I0 = linearLayout2;
        linearLayout2.setOrientation(0);
        ?? c51Var2 = new c51(vnbVar, activity, true);
        c51Var2.setRoundRadius(24);
        this.G0 = c51Var2;
        c51Var2.setEnabled(false);
        c51Var2.i(ob6.G(0, "MonetizationStarsWithdraw", new Object[0]), false, true);
        c51Var2.setVisibility(0);
        c51Var2.setOnClickListener(new ae(this, i, w1bVar, (byte) 1));
        c51 c51Var3 = new c51(vnbVar, activity, true);
        c51Var3.setRoundRadius(24);
        this.J0 = c51Var3;
        c51Var3.setEnabled(false);
        c51Var3.i(ob6.M0(2131748128, null), false, true);
        c51Var3.setOnClickListener(new jh(this, i, j, activity));
        linearLayout2.addView((View) c51Var2, tre.p(-1, 48, 1.0f, 119));
        if (xc2.V(M05)) {
            linearLayout2.addView(new Space(activity), tre.p(8, 48, 0.0f, 119));
            linearLayout2.addView(c51Var3, tre.p(-1, 48, 1.0f, 119));
        }
        u1Var2.addView(linearLayout2, tre.d(-1, 48.0f, 55, 18.0f, 13.0f, 18.0f, 0.0f));
        xs0Var.setOnEditorActionListener(new hf(this, w1bVar, (byte) 1));
        this.f1 = new oi1(this, i, (byte) 2);
        q9c q9cVar = new q9c(w1bVar, new c(this, (byte) 24), new mi1(this), new rm0(this, (byte) 22));
        this.X0 = q9cVar;
        of2 of2Var = new of2((Object) this, (byte) 5);
        q9cVar.f3 = of2Var;
        q9cVar.setLayoutManager(of2Var);
        q9cVar.setClipToPadding(false);
        q9cVar.s1();
        q9cVar.setCaptureSectionsDecoratorAllowed(true);
        q9cVar.g3.r = false;
        v(q9cVar, new mi1(this));
        y(ej1Var, ej1Var.b, new rm0((byte) 21));
        z(ej1Var.d);
        ej1Var.d.setLayoutParams(tre.d(-1, -2.0f, 48, -4.0f, 0.0f, -4.0f, 0.0f));
        if (vy4Var != null) {
            vy4Var.b(q9cVar);
        }
        LinearLayout m = bs2.m(activity, 1);
        FrameLayout frameLayout = new FrameLayout(activity);
        this.Y0 = frameLayout;
        yob.h(aob.a7, vnbVar, frameLayout);
        frameLayout.addView(m, tre.e(-2, -2, 17));
        ?? imageView2 = new ImageView(activity);
        imageView2.setAutoRepeat(true);
        imageView2.f(2131624223, 120, 120, null);
        imageView2.d();
        TextView textView = new TextView(activity);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(hl.o());
        int i5 = aob.Fj;
        yob.X(textView, i5, null);
        textView.setTag(Integer.valueOf(i5));
        textView.setText(ob6.M0(2131748531, "LoadingStats"));
        textView.setGravity(1);
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 15.0f);
        int i6 = aob.Gj;
        yob.X(textView2, i6, null);
        textView2.setTag(Integer.valueOf(i6));
        textView2.setText(ob6.M0(2131748530, null));
        textView2.setGravity(1);
        m.addView((View) imageView2, tre.t(120, 120, 1, 0, 0, 0, 20));
        m.addView(textView, tre.t(-2, -2, 1, 0, 0, 0, 10));
        m.addView(textView2, tre.r(-2, -2, 1));
        addView(frameLayout, tre.e(-1, -1, 119));
    }

    public static nx0 J(vnb vnbVar, Context context, boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        nx0 h = uh9.h(1, vnbVar, context, false);
        LinearLayout j = uh9.j(context, 1);
        j.setPadding(hl.L(8.0f), 0, hl.L(8.0f), 0);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131231616);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        int L = hl.L(80.0f);
        int i10 = aob.Fi;
        ShapeDrawable K = aob.K(L, aob.v0(i10, vnbVar));
        uob M = yob.M(i10);
        imageView.setBackground(K);
        yob.j(imageView, K, M, null, vnbVar);
        j.addView(imageView, tre.t(80, 80, 1, 0, 16, 0, 16));
        TextView textView = new TextView(context);
        textView.setGravity(17);
        bs2.t(textView, 1, 20.0f);
        int i11 = aob.G6;
        yob.X(textView, i11, vnbVar);
        if (z) {
            i = 2131753019;
        } else {
            i = 2131748143;
        }
        textView.setText(ob6.M0(i, null));
        j.addView(textView, tre.k(8.0f, 0.0f, 8.0f, 25.0f, -1, -2));
        if (z) {
            i2 = 2131753028;
        } else {
            i2 = 2131748152;
        }
        String M0 = ob6.M0(i2, null);
        if (z) {
            i3 = 2131753027;
        } else {
            i3 = 2131748151;
        }
        j.addView(new b6(context, 2131232093, M0, ob6.M0(i3, null), vnbVar), tre.t(-1, -2, 49, 8, 0, 8, 16));
        if (z) {
            i4 = 2131753026;
        } else {
            i4 = 2131748150;
        }
        String M02 = ob6.M0(i4, null);
        if (z) {
            i5 = 2131753025;
        } else {
            i5 = 2131748149;
        }
        j.addView(new b6(context, 2131231818, M02, ob6.M0(i5, null), vnbVar), tre.t(-1, -2, 49, 8, 0, 8, 16));
        if (z) {
            i6 = 2131753024;
        } else {
            i6 = 2131748148;
        }
        String M03 = ob6.M0(i6, null);
        if (z) {
            i7 = 2131753023;
        } else {
            i7 = 2131748147;
        }
        j.addView(new b6(context, 2131231828, M03, ob6.M0(i7, null), vnbVar), tre.t(-1, -2, 49, 8, 0, 8, 16));
        View view = new View(context);
        yob.h(aob.d7, vnbVar, view);
        j.addView(view, tre.n(1.0f / hl.p, -1, 55, 12, 0, 12, 0));
        gm gmVar = new gm(context);
        gmVar.setGravity(17);
        gmVar.setTextSize(1, 20.0f);
        gmVar.setTypeface(hl.o());
        yob.X(gmVar, i11, vnbVar);
        SpannableString spannableString = new SpannableString("💎");
        wm2 wm2Var = new wm2(2131231961, 0);
        wm2Var.d = false;
        wm2Var.I = 0.9f;
        wm2Var.J = 0.9f;
        wm2Var.b(gmVar.getPaint().getFontMetricsInt());
        wm2Var.H = 0.9f;
        spannableString.setSpan(wm2Var, 0, spannableString.length(), 33);
        if (z) {
            i8 = 2131753020;
        } else {
            i8 = 2131748144;
        }
        gmVar.setText(hl.G2(ob6.M0(i8, null), spannableString, "💎"));
        j.addView(gmVar, tre.k(8.0f, 20.0f, 8.0f, 0.0f, -1, -2));
        p66 p66Var = new p66(context, vnbVar);
        p66Var.setGravity(17);
        p66Var.setTextSize(1, 14.0f);
        yob.X(p66Var, i11, vnbVar);
        yob.G(p66Var, aob.Xc, vnbVar);
        if (z) {
            i9 = 2131753021;
        } else {
            i9 = 2131748145;
        }
        p66Var.setText(hl.X3(hl.S2(ob6.M0(i9, null)), new xac((byte) 8, context, z)));
        j.addView(p66Var, tre.k(28.0f, 9.0f, 28.0f, 0.0f, -1, -2));
        c51 i12 = xnb.i(24, vnbVar, context, true);
        i12.i(ob6.M0(2131749302, null), false, true);
        i12.setOnClickListener(new rg(h, (byte) 2));
        j.addView(i12, tre.t(-1, 48, 55, 10, 25, 10, 14));
        h.O = j;
        return h;
    }

    public static SpannableStringBuilder L(CharSequence charSequence, TextPaint textPaint, float f, float f2, boolean z) {
        int i;
        if (u1 == null) {
            u1 = new HashMap();
        }
        int i2 = textPaint.getFontMetricsInt().bottom;
        if (z) {
            i = 1;
        } else {
            i = -1;
        }
        int i3 = ((i2 * i) * ((int) (f * 100.0f))) - ((int) (100.0f * f2));
        SpannableString spannableString = (SpannableString) u1.get(Integer.valueOf(i3));
        if (spannableString == null) {
            spannableString = new SpannableString("T");
            if (z) {
                wm2 wm2Var = new wm2(2131231961, 0);
                wm2Var.d = false;
                wm2Var.I = f;
                wm2Var.J = f;
                wm2Var.a(aob.o6);
                wm2Var.b(textPaint.getFontMetricsInt());
                wm2Var.H = 0.9f;
                spannableString.setSpan(wm2Var, 0, spannableString.length(), 33);
            } else {
                wm2 wm2Var2 = new wm2(2131231959, 0);
                wm2Var2.d = false;
                wm2Var2.I = f;
                wm2Var2.J = f;
                wm2Var2.s = f2;
                wm2Var2.H = 0.95f;
                spannableString.setSpan(wm2Var2, 0, spannableString.length(), 33);
            }
            u1.put(Integer.valueOf(i3), spannableString);
        }
        return hl.I2(charSequence, spannableString, "TON");
    }

    public static void N(Context context, int i, TL_stats.BroadcastRevenueTransaction broadcastRevenueTransaction, long j, vnb vnbVar) {
        long j2;
        String M0;
        long j3;
        long j4;
        long j5;
        char c;
        boolean z;
        boolean z2;
        int i2;
        String str;
        String r;
        TLRPC.Chat chat;
        nx0 h = uh9.h(1, vnbVar, context, false);
        LinearLayout j6 = uh9.j(context, 1);
        boolean z3 = broadcastRevenueTransaction instanceof TL_stats.TL_broadcastRevenueTransactionWithdrawal;
        if (z3) {
            TL_stats.TL_broadcastRevenueTransactionWithdrawal tL_broadcastRevenueTransactionWithdrawal = (TL_stats.TL_broadcastRevenueTransactionWithdrawal) broadcastRevenueTransaction;
            M0 = ob6.M0(2131748115, null);
            j2 = 0;
            j3 = tL_broadcastRevenueTransactionWithdrawal.date;
            j4 = tL_broadcastRevenueTransactionWithdrawal.amount;
            boolean z4 = tL_broadcastRevenueTransactionWithdrawal.pending;
            z2 = tL_broadcastRevenueTransactionWithdrawal.failed;
            z = z4;
            j5 = 0;
            c = 65535;
        } else {
            j2 = 0;
            if (broadcastRevenueTransaction instanceof TL_stats.TL_broadcastRevenueTransactionProceeds) {
                TL_stats.TL_broadcastRevenueTransactionProceeds tL_broadcastRevenueTransactionProceeds = (TL_stats.TL_broadcastRevenueTransactionProceeds) broadcastRevenueTransaction;
                M0 = ob6.M0(2131748117, null);
                j3 = tL_broadcastRevenueTransactionProceeds.from_date;
                j5 = tL_broadcastRevenueTransactionProceeds.to_date;
                j4 = tL_broadcastRevenueTransactionProceeds.amount;
            } else if (broadcastRevenueTransaction instanceof TL_stats.TL_broadcastRevenueTransactionRefund) {
                TL_stats.TL_broadcastRevenueTransactionRefund tL_broadcastRevenueTransactionRefund = (TL_stats.TL_broadcastRevenueTransactionRefund) broadcastRevenueTransaction;
                M0 = ob6.M0(2131748116, null);
                j3 = tL_broadcastRevenueTransactionRefund.from_date;
                j4 = tL_broadcastRevenueTransactionRefund.amount;
                j5 = 0;
            } else {
                return;
            }
            c = 1;
            z = false;
            z2 = false;
        }
        long j7 = j4;
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
        decimalFormatSymbols.setDecimalSeparator('.');
        DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
        decimalFormat.setMinimumFractionDigits(2);
        decimalFormat.setMaximumFractionDigits(12);
        decimalFormat.setGroupingUsed(false);
        TextView textView = new TextView(context);
        textView.setGravity(17);
        ik8.v(textView, 1, 18.0f);
        if (c < 0) {
            i2 = aob.q7;
        } else {
            i2 = aob.l8;
        }
        yob.X(textView, i2, null);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (c < 0) {
            str = "-";
        } else {
            str = "+";
        }
        spannableStringBuilder.append((CharSequence) str);
        long j8 = j3;
        spannableStringBuilder.append((CharSequence) decimalFormat.format(Math.round((Math.abs(j7) / 1.0E9d) * 100000.0d) / 100000.0d));
        spannableStringBuilder.append((CharSequence) " TON");
        int indexOf = TextUtils.indexOf(spannableStringBuilder, ".");
        if (indexOf >= 0) {
            spannableStringBuilder.setSpan(new RelativeSizeSpan(1.3333334f), 0, indexOf, 33);
        }
        textView.setText(spannableStringBuilder);
        j6.addView(textView, tre.t(-1, -2, 49, 0, 24, 0, 6));
        TextView textView2 = new TextView(context);
        textView2.setGravity(17);
        textView2.setTextSize(1, 13.0f);
        yob.X(textView2, aob.y6, vnbVar);
        if (z) {
            textView2.setText(ob6.M0(2131748112, null));
        } else if (j8 == j2) {
            textView2.setText(ob6.Q(j5));
        } else if (j5 == j2) {
            textView2.setText(ob6.Q(j8));
        } else {
            textView2.setText(ob6.Q(j8) + " - " + ob6.Q(j5));
        }
        if (z2) {
            yob.X(textView2, aob.q7, vnbVar);
            textView2.setText(TextUtils.concat(textView2.getText(), " — ", ob6.M0(2131748113, null)));
        }
        j6.addView(textView2, tre.t(-1, -2, 49, 0, 0, 0, 0));
        TextView textView3 = new TextView(context);
        textView3.setGravity(17);
        ik8.v(textView3, 1, 14.0f);
        yob.X(textView3, aob.G6, vnbVar);
        textView3.setText(M0);
        j6.addView(textView3, tre.t(-1, -2, 49, 0, 27, 0, 0));
        if (broadcastRevenueTransaction instanceof TL_stats.TL_broadcastRevenueTransactionProceeds) {
            FrameLayout frameLayout = new FrameLayout(context);
            int L = hl.L(28.0f);
            int L2 = hl.L(28.0f);
            int i3 = aob.Ti;
            ShapeDrawable c0 = aob.c0(L, L2, aob.v0(i3, vnbVar));
            uob M = yob.M(i3);
            frameLayout.setBackground(c0);
            yob.j(frameLayout, c0, M, null, vnbVar);
            if (j < j2) {
                TLRPC.Chat M02 = uc7.s1(i).M0(Long.valueOf(-j));
                if (M02 == null) {
                    r = "";
                    chat = M02;
                } else {
                    r = M02.title;
                    chat = M02;
                }
            } else {
                TLRPC.User X1 = uc7.s1(i).X1(Long.valueOf(j));
                r = lbc.r(X1);
                chat = X1;
            }
            de0 de0Var = new de0(context);
            de0Var.setRoundRadius(hl.L(28.0f));
            rb0 rb0Var = new rb0((vnb) null);
            rb0Var.k(chat);
            de0Var.f(chat, rb0Var);
            frameLayout.addView(de0Var, tre.e(28, 28, 51));
            TextView textView4 = new TextView(context);
            yob.X(textView4, aob.j5, vnbVar);
            textView4.setTextSize(1, 13.0f);
            textView4.setSingleLine();
            textView4.setText(r);
            frameLayout.addView(textView4, tre.d(-2, -2.0f, 19, 37.0f, 0.0f, 10.0f, 0.0f));
            j6.addView(frameLayout, tre.t(-2, 28, 1, 42, 10, 42, 0));
        }
        c51 i4 = xnb.i(24, vnbVar, context, true);
        if (z3) {
            TL_stats.TL_broadcastRevenueTransactionWithdrawal tL_broadcastRevenueTransactionWithdrawal2 = (TL_stats.TL_broadcastRevenueTransactionWithdrawal) broadcastRevenueTransaction;
            if ((tL_broadcastRevenueTransactionWithdrawal2.flags & 2) != 0) {
                i4.i(ob6.M0(2131748114, null), false, true);
                i4.setOnClickListener(new sb1(context, tL_broadcastRevenueTransactionWithdrawal2, (byte) 4));
                j6.addView(i4, tre.t(-1, 48, 55, 18, 30, 18, 14));
                h.O = j6;
                h.show();
            }
        }
        i4.i(ob6.M0(2131747558, null), false, true);
        i4.setOnClickListener(new rg(h, (byte) 3));
        j6.addView(i4, tre.t(-1, 48, 55, 18, 30, 18, 14));
        h.O = j6;
        h.show();
    }

    public final void E(TLRPC.TL_payments_starsRevenueStats tL_payments_starsRevenueStats) {
        boolean z;
        FrameLayout frameLayout;
        ok1 ok1Var;
        ArrayList arrayList;
        if (this.n1 == null) {
            z = true;
        } else {
            z = false;
        }
        this.h1 = tL_payments_starsRevenueStats.usd_rate;
        i1b f0 = w1b.f0(tL_payments_starsRevenueStats.revenue_graph, ob6.M0(2131748154, null), 2, false);
        this.n1 = f0;
        if (f0 != null && (ok1Var = f0.d) != null && (arrayList = ok1Var.d) != null && !arrayList.isEmpty() && this.n1.d.d.get(0) != null) {
            ((nk1) this.n1.d.d.get(0)).g = aob.bk;
            this.n1.d.h = (float) ((1.0d / this.h1) / 100.0d);
        }
        M(false, tL_payments_starsRevenueStats.status);
        if (!this.b1 && (frameLayout = this.Y0) != null) {
            frameLayout.animate().alpha(0.0f).setDuration(380L).setInterpolator(k43.h).withEndAction(new ni1(this, (byte) 6)).start();
        }
        q9c q9cVar = this.X0;
        if (q9cVar != null) {
            q9cVar.g3.O(!z);
            if (z) {
                q9cVar.x0(0);
            }
        }
    }

    public final void F() {
        if (isAttachedToWindow() && this.b1 && this.o1 && uc7.e1().getBoolean("monetizationadshint", true)) {
            this.m0.showDialog(J(this.n0, getContext(), false));
            uc7.e1().edit().putBoolean("monetizationadshint", false).apply();
        }
    }

    public final void G(boolean z, TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity) {
        TLRPC.TL_payments_getStarsRevenueWithdrawalUrl tL_payments_getStarsRevenueWithdrawalUrl;
        w1b w1bVar = this.m0;
        if (w1bVar != null) {
            Activity parentActivity = w1bVar.getParentActivity();
            int i = this.o0;
            TLRPC.User f = yac.h(i).f();
            if (parentActivity != null && f != null) {
                long j = this.p0;
                if (z) {
                    tL_payments_getStarsRevenueWithdrawalUrl = new TLRPC.TL_payments_getStarsRevenueWithdrawalUrl();
                    tL_payments_getStarsRevenueWithdrawalUrl.ton = false;
                    tL_payments_getStarsRevenueWithdrawalUrl.peer = uc7.s1(i).j1(j);
                    TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP = tL_inputCheckPasswordSRP;
                    if (tL_inputCheckPasswordSRP == null) {
                        inputCheckPasswordSRP = new TLRPC.TL_inputCheckPasswordEmpty();
                    }
                    tL_payments_getStarsRevenueWithdrawalUrl.password = inputCheckPasswordSRP;
                    tL_payments_getStarsRevenueWithdrawalUrl.flags |= 2;
                    tL_payments_getStarsRevenueWithdrawalUrl.amount = this.N0;
                } else {
                    tL_payments_getStarsRevenueWithdrawalUrl = new TLRPC.TL_payments_getStarsRevenueWithdrawalUrl();
                    tL_payments_getStarsRevenueWithdrawalUrl.ton = true;
                    tL_payments_getStarsRevenueWithdrawalUrl.peer = uc7.s1(i).j1(j);
                    TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP2 = tL_inputCheckPasswordSRP;
                    if (tL_inputCheckPasswordSRP == null) {
                        inputCheckPasswordSRP2 = new TLRPC.TL_inputCheckPasswordEmpty();
                    }
                    tL_payments_getStarsRevenueWithdrawalUrl.password = inputCheckPasswordSRP2;
                }
                ConnectionsManager.getInstance(i).sendRequest(tL_payments_getStarsRevenueWithdrawalUrl, new si1(this, twoStepVerificationActivity, parentActivity, z, (byte) 0));
            }
        }
    }

    public final boolean H(float f, float f2) {
        if (this.Y0.getVisibility() != 0 && c() && f >= 0.0f && f < getWidth() && f2 >= getTabsTop() && f2 < getHeight()) {
            return true;
        }
        return false;
    }

    public final void I(boolean z) {
        if (!this.c1) {
            return;
        }
        int i = this.o0;
        kt0 g = kt0.g(i);
        long j = this.p0;
        TLRPC.TL_payments_starsRevenueStats h = g.h(j, z);
        if (h != null) {
            hl.c3(new z21(this, h, (byte) 29));
            return;
        }
        TLRPC.TL_payments_getStarsRevenueStats tL_payments_getStarsRevenueStats = new TLRPC.TL_payments_getStarsRevenueStats();
        tL_payments_getStarsRevenueStats.peer = uc7.s1(i).j1(j);
        tL_payments_getStarsRevenueStats.dark = aob.I.o();
        ConnectionsManager.getInstance(i).sendRequest(tL_payments_getStarsRevenueStats, new ri1(this, (byte) 2));
    }

    public final void K() {
        ej1 ej1Var = this.a1;
        ni1 ni1Var = ej1Var.f;
        boolean[] zArr = ej1Var.w;
        boolean a = ej1Var.a();
        for (int i = 0; i < 2; i++) {
            if (!zArr[i]) {
                if (i == 1) {
                    ej1Var.n.clear();
                    ej1Var.h = "";
                } else {
                    ej1Var.r.clear();
                    ej1Var.s = "";
                }
                zArr[i] = false;
                ej1Var.c(i);
            } else {
                return;
            }
        }
        if (ej1Var.a() != a && ni1Var != null) {
            ej1Var.e();
            ni1Var.run();
        }
    }

    public final void M(boolean z, TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus) {
        fj1 fj1Var;
        int i;
        TL_stars.StarsAmount starsAmount;
        TL_stars.StarsAmount starsAmount2;
        int i2;
        int i3;
        int i4;
        boolean z2;
        boolean z3;
        l9c l9cVar;
        long j;
        fj1 fj1Var2;
        int i5;
        int i6;
        ij1 ij1Var = this;
        fj1 fj1Var3 = ij1Var.r1;
        fj1 fj1Var4 = ij1Var.q1;
        in inVar = ij1Var.z0;
        RelativeSizeSpan relativeSizeSpan = ij1Var.x0;
        in inVar2 = ij1Var.y0;
        fj1 fj1Var5 = ij1Var.p1;
        if (z) {
            fj1Var5.a = true;
            long j2 = tL_starsRevenueStatus.available_balance.amount;
            fj1Var5.d = j2;
            double d = j2 / 1.0E9d;
            fj1Var5.e = (long) (ij1Var.g1 * d * 100.0d);
            if (ij1Var.Z0 == null) {
                DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
                decimalFormatSymbols.setDecimalSeparator('.');
                fj1Var2 = fj1Var3;
                DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
                ij1Var.Z0 = decimalFormat;
                decimalFormat.setMinimumFractionDigits(2);
                i5 = 6;
                ij1Var.Z0.setMaximumFractionDigits(6);
                ij1Var.Z0.setGroupingUsed(false);
            } else {
                fj1Var2 = fj1Var3;
                i5 = 6;
            }
            DecimalFormat decimalFormat2 = ij1Var.Z0;
            if (d > 1.5d) {
                i5 = 2;
            }
            decimalFormat2.setMaximumFractionDigits(i5);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(L("TON " + ij1Var.Z0.format(d), inVar2.getPaint(), 0.9f, 0.0f, true));
            int indexOf = TextUtils.indexOf(spannableStringBuilder, ".");
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(relativeSizeSpan, indexOf, spannableStringBuilder.length(), 33);
            }
            inVar2.setText(spannableStringBuilder);
            inVar.setText("≈" + di0.h().e(j, "USD"));
            fj1Var5.f = "USD";
            fj1Var4.a = true;
            long j3 = tL_starsRevenueStatus.current_balance.amount;
            fj1Var4.d = j3;
            ij1Var = this;
            double d2 = ij1Var.g1;
            fj1Var4.e = (long) ((j3 / 1.0E9d) * d2 * 100.0d);
            fj1Var4.f = "USD";
            fj1 fj1Var6 = fj1Var2;
            fj1Var6.a = true;
            long j4 = tL_starsRevenueStatus.overall_revenue.amount;
            fj1Var6.d = j4;
            fj1Var6.e = (long) ((j4 / 1.0E9d) * d2 * 100.0d);
            fj1Var6.f = "USD";
            ij1Var.o1 = true;
            if (tL_starsRevenueStatus.available_balance.amount > 0 && tL_starsRevenueStatus.withdrawal_enabled) {
                i6 = 0;
            } else {
                i6 = 8;
            }
            ij1Var.A0.setVisibility(i6);
        } else {
            double d3 = ij1Var.h1;
            if (d3 != 0.0d) {
                fj1Var5.g = true;
                TL_stars.StarsAmount starsAmount3 = tL_starsRevenueStatus.available_balance;
                fj1Var5.i = starsAmount3;
                fj1Var5.j = (long) (starsAmount3.amount * d3 * 100.0d);
                int i7 = tL_starsRevenueStatus.next_withdrawal_at;
                xi1 xi1Var = ij1Var.G0;
                if (inVar2 != null && inVar != null) {
                    fj1Var = fj1Var3;
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(nza.b1(false, TextUtils.concat("XTR ", nza.H0(starsAmount3, 0.8f, ' ')), 1.0f, null));
                    int indexOf2 = TextUtils.indexOf(spannableStringBuilder2, ".");
                    if (indexOf2 >= 0) {
                        spannableStringBuilder2.setSpan(relativeSizeSpan, indexOf2, spannableStringBuilder2.length(), 33);
                    }
                    ij1Var.D0 = starsAmount3;
                    ij1Var.E0.setText(spannableStringBuilder2);
                    ij1Var.F0.setText("≈" + di0.h().e((long) (ij1Var.h1 * starsAmount3.amount * 100.0d), "USD"));
                    if (starsAmount3.amount > 0) {
                        i4 = 0;
                    } else {
                        i4 = 8;
                    }
                    ij1Var.K0.setVisibility(i4);
                    if (ij1Var.M0) {
                        ij1Var.L0 = true;
                        long j5 = starsAmount3.amount;
                        ij1Var.N0 = j5;
                        String l = Long.toString(j5);
                        xs0 xs0Var = ij1Var.O0;
                        xs0Var.setText(l);
                        xs0Var.setSelection(xs0Var.getText().length());
                        i = 0;
                        ij1Var.L0 = false;
                        if (ij1Var.N0 > 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        xi1Var.setEnabled(z3);
                    } else {
                        i = 0;
                    }
                    c51 c51Var = ij1Var.J0;
                    if (c51Var != null) {
                        if (starsAmount3.amount > 0) {
                            z2 = 1;
                        } else {
                            z2 = i;
                        }
                        c51Var.setEnabled(z2);
                    }
                    ij1Var.B0 = i7;
                    oi1 oi1Var = ij1Var.f1;
                    hl.r(oi1Var);
                    oi1Var.run();
                } else {
                    fj1Var = fj1Var3;
                    i = 0;
                }
                fj1Var5.f = "USD";
                fj1Var4.g = true;
                fj1Var4.i = tL_starsRevenueStatus.current_balance;
                double d4 = ij1Var.h1;
                fj1Var4.j = (long) (starsAmount.amount * d4 * 100.0d);
                fj1Var4.f = "USD";
                fj1 fj1Var7 = fj1Var;
                fj1Var7.g = true;
                fj1Var7.i = tL_starsRevenueStatus.overall_revenue;
                fj1Var7.j = (long) (starsAmount2.amount * d4 * 100.0d);
                fj1Var7.f = "USD";
                ij1Var.o1 = true;
                LinearLayout linearLayout = ij1Var.I0;
                if (linearLayout != null) {
                    if (tL_starsRevenueStatus.withdrawal_enabled) {
                        i3 = i;
                    } else {
                        i3 = 8;
                    }
                    linearLayout.setVisibility(i3);
                }
                if (xi1Var != null) {
                    if (tL_starsRevenueStatus.available_balance.amount <= 0) {
                        boolean z4 = f11.a;
                        i2 = 8;
                    } else {
                        i2 = i;
                    }
                    xi1Var.setVisibility(i2);
                }
            } else {
                return;
            }
        }
        q9c q9cVar = ij1Var.X0;
        if (q9cVar != null && (l9cVar = q9cVar.g3) != null) {
            l9cVar.O(true);
        }
    }

    public View getTransactionTabs() {
        return this.a1.d;
    }

    @Override
    public final void onAttachedToWindow() {
        t1 = this;
        super.onAttachedToWindow();
        F();
    }

    @Override
    public final void onDetachedFromWindow() {
        t1 = null;
        super.onDetachedFromWindow();
        a aVar = this.i1;
        if (aVar != null) {
            aVar.setCastShadows(true);
        }
    }

    public void setActionBar(a aVar) {
        this.i1 = aVar;
    }

    public void setTabsPinnedChangedListener(Runnable runnable) {
        this.S0 = runnable;
    }

    @Override
    public final void updateColors() {
        try {
            xs0 xs0Var = this.O0;
            if (xs0Var != null) {
                xs0Var.setHandlesColor(aob.v0(aob.mg, this.n0));
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
