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
public final class ik1 extends fja implements vlb {
    public static ik1 t1;
    public static HashMap u1;
    public final b61 A0;
    public int B0;
    public final t1 C0;
    public TL_stars.StarsAmount D0;
    public final io E0;
    public final io F0;
    public final xj1 G0;
    public final pn2[] H0;
    public final LinearLayout I0;
    public final b61 J0;
    public final wt0 K0;
    public boolean L0;
    public boolean M0;
    public long N0;
    public final vc O0;
    public u31 P0;
    public boolean Q0;
    public int R0;
    public Runnable S0;
    public final xd9 T0;
    public int U0;
    public int V0;
    public int W0;
    public final q7c X0;
    public final FrameLayout Y0;
    public DecimalFormat Z0;
    public final ek1 a1;
    public final boolean b1;
    public final boolean c1;
    public final sy4 d1;
    public SpannableStringBuilder e1;
    public final nj1 f1;
    public double g1;
    public double h1;
    public a i1;
    public boolean j1;
    public boolean k1;
    public jza l1;
    public final xza m0;
    public jza m1;
    public final ylb n0;
    public jza n1;
    public final int o0;
    public boolean o1;
    public final long p0;
    public final fk1 p1;
    public TL_stories.TL_premium_boostsStatus q0;
    public final fk1 q1;
    public int r0;
    public final fk1 r1;
    public final SpannableStringBuilder s0;
    public final mj1 s1;
    public final SpannableStringBuilder t0;
    public final SpannableStringBuilder u0;
    public final SpannableStringBuilder v0;
    public final t1 w0;
    public final RelativeSizeSpan x0;
    public final io y0;
    public final io z0;

    public ik1(Activity activity, xza xzaVar, int i, long j, ylb ylbVar, sy4 sy4Var, boolean z, boolean z2) {
        super(activity);
        this.D0 = TL_stars.StarsAmount.ofStars(0L);
        this.H0 = new pn2[1];
        this.L0 = false;
        this.M0 = true;
        this.Q0 = true;
        this.R0 = -1;
        this.j1 = false;
        this.k1 = false;
        this.o1 = false;
        String M0 = jb6.M0(2131748141, null);
        fk1 fk1Var = new fk1();
        fk1Var.a = false;
        fk1Var.b = "TON";
        fk1Var.h = "XTR";
        fk1Var.c = M0;
        this.p1 = fk1Var;
        String M02 = jb6.M0(2131748140, null);
        fk1 fk1Var2 = new fk1();
        fk1Var2.a = false;
        fk1Var2.b = "TON";
        fk1Var2.h = "XTR";
        fk1Var2.c = M02;
        this.q1 = fk1Var2;
        String M03 = jb6.M0(2131748139, null);
        fk1 fk1Var3 = new fk1();
        fk1Var3.a = false;
        fk1Var3.b = "TON";
        fk1Var3.h = "XTR";
        fk1Var3.c = M03;
        this.r1 = fk1Var3;
        this.s1 = new mj1(this, (byte) 7);
        this.d1 = sy4Var;
        this.b1 = z;
        this.c1 = z2;
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
        decimalFormatSymbols.setDecimalSeparator('.');
        DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
        this.Z0 = decimalFormat;
        decimalFormat.setMinimumFractionDigits(2);
        this.Z0.setMaximumFractionDigits(12);
        this.Z0.setGroupingUsed(false);
        this.m0 = xzaVar;
        this.n0 = ylbVar;
        this.o0 = i;
        this.p0 = j;
        long j2 = -j;
        TLRPC.Chat L0 = oc7.r1(i).L0(Long.valueOf(j2));
        if (L0 != null) {
            this.r0 = L0.level;
        }
        oc7.r1(i).F0().a(j, new mf2(this, (byte) 15));
        I(false);
        if (z) {
            TLRPC.TL_payments_getStarsRevenueStats tL_payments_getStarsRevenueStats = new TLRPC.TL_payments_getStarsRevenueStats();
            tL_payments_getStarsRevenueStats.dark = cmb.I.o();
            tL_payments_getStarsRevenueStats.ton = true;
            tL_payments_getStarsRevenueStats.peer = oc7.r1(i).i1(j);
            TLRPC.ChatFull M04 = oc7.r1(i).M0(j2);
            if (M04 != null) {
                boolean z3 = M04.restricted_sponsored;
                this.j1 = z3;
                this.k1 = z3;
            }
            ConnectionsManager.getInstance(i).sendRequest(tL_payments_getStarsRevenueStats, new qj1(this, (byte) 1), null, null, 0, Integer.MAX_VALUE, 1, true);
        }
        TLRPC.Chat L02 = oc7.r1(i).L0(Long.valueOf(j2));
        this.s0 = gm.D2(gm.N2(jb6.a0(null, null, 2131748156, 50), -1, 3, new tv0(xzaVar, activity, ylbVar, (byte) 21), ylbVar), true);
        this.t0 = gm.D2(gm.N2(jb6.M0(oc7.r1(i).l4.T2.f ? 2131748162 : 2131748160, null), -1, 3, new mj1(this, (byte) 0), null), true);
        this.u0 = gm.D2(gm.N2(jb6.M0(z2 ? z ? 2131748136 : 2131748138 : 2131748134, null), -1, 3, new nj1(this, z2 ? z ? 2131748135 : 2131748137 : 2131748133, (byte) 0), ylbVar), true);
        this.v0 = gm.D2(gm.N2(jb6.M0(sd2.V(L02) ? 2131748129 : 2131748128, null), -1, 0, new mj1(this, (byte) 1), null), true);
        setCommonInsetsManagedExternally(true);
        setGeometry(new ni6(this, (byte) 16));
        this.T0 = new xd9((byte) 7, activity, this);
        ek1 ek1Var = new ek1(this, activity, i, j, xzaVar.getClassGuid(), new mj1(this, (byte) 2), ylbVar);
        this.a1 = ek1Var;
        t1 t1Var = new t1((byte) 3, activity, false);
        this.w0 = t1Var;
        t1Var.setOrientation(1);
        int i2 = cmb.c6;
        anb.h(i2, ylbVar, t1Var);
        t1Var.setPadding(0, 0, 0, gm.L(17.0f));
        io ioVar = new io(activity, false, true, true);
        this.y0 = ioVar;
        ioVar.setTypeface(gm.o());
        int i3 = cmb.F6;
        anb.U(ioVar, i3, ylbVar);
        ioVar.setTextSize(gm.L(32.0f));
        ioVar.setGravity(17);
        this.x0 = new RelativeSizeSpan(0.6770833f);
        t1Var.addView(ioVar, qoe.t(-1, 38, 49, 22, 15, 22, 0));
        io ioVar2 = new io(activity, true, true, true);
        this.z0 = ioVar2;
        ioVar2.setGravity(17);
        int i4 = cmb.x6;
        anb.U(ioVar2, i4, ylbVar);
        ioVar2.setTextSize(gm.L(14.0f));
        t1Var.addView(ioVar2, qoe.d(-1, 17.0f, 49, 22.0f, 4.0f, 22.0f, 0.0f));
        b61 b61Var = new b61(ylbVar, activity, true);
        b61Var.setRoundRadius(24);
        this.A0 = b61Var;
        b61Var.setEnabled(oc7.r1(i).l4.T2.f);
        b61Var.i(jb6.M0(2131748108, null), false, true);
        b61Var.setVisibility(8);
        b61Var.setOnClickListener(new rc1(this, xzaVar, (byte) 3));
        t1Var.addView(b61Var, qoe.d(-1, 48.0f, 55, 18.0f, 13.0f, 18.0f, 0.0f));
        t1 t1Var2 = new t1((byte) 4, activity, false);
        this.C0 = t1Var2;
        t1Var2.setOrientation(1);
        anb.h(i2, ylbVar, t1Var2);
        t1Var2.setPadding(0, 0, 0, gm.L(17.0f));
        io ioVar3 = new io(activity, false, true, true);
        this.E0 = ioVar3;
        ioVar3.setTypeface(gm.o());
        anb.U(ioVar3, i3, ylbVar);
        ioVar3.setTextSize(gm.L(32.0f));
        ioVar3.setGravity(17);
        new RelativeSizeSpan(0.6770833f);
        t1Var2.addView(ioVar3, qoe.t(-1, 38, 49, 22, 15, 22, 0));
        io ioVar4 = new io(activity, true, true, true);
        this.F0 = ioVar4;
        ioVar4.setGravity(17);
        anb.U(ioVar4, i4, ylbVar);
        ioVar4.setTextSize(gm.L(14.0f));
        t1Var2.addView(ioVar4, qoe.d(-1, 17.0f, 49, 22.0f, 4.0f, 22.0f, 0.0f));
        wt0 wt0Var = new wt0((byte) 1, activity, this);
        this.K0 = wt0Var;
        wt0Var.setVisibility(8);
        wt0Var.setText(jb6.M0(2131752906, null));
        wt0Var.setLeftPadding(gm.L(36.0f));
        vc vcVar = new vc(activity, (byte) 2);
        this.O0 = vcVar;
        vcVar.setFocusable(false);
        anb.X(vcVar, i3, ylbVar);
        vcVar.setCursorSize(gm.L(20.0f));
        vcVar.setCursorWidth(1.5f);
        vcVar.setBackground(null);
        vcVar.setTextSize(1, 18.0f);
        vcVar.setMaxLines(1);
        int L = gm.L(16.0f);
        vcVar.setPadding(gm.L(6.0f), L, L, L);
        vcVar.setInputType(2);
        vcVar.setTypeface(Typeface.DEFAULT);
        anb.C(vcVar, cmb.kg, ylbVar);
        anb.l(vcVar, 36, cmb.lg, ylbVar);
        vcVar.setGravity(jb6.a0 ? 5 : 3);
        vcVar.setOnFocusChangeListener(new tt0(this, (byte) 1));
        vcVar.addTextChangedListener(new wj1(this));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(0);
        ImageView imageView = new ImageView(activity);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(2131232769);
        linearLayout.addView(imageView, qoe.q(-2, -2, 0.0f, 19, 14, 0, 0, 0));
        linearLayout.addView(vcVar, qoe.p(-1, -2, 1.0f, 119));
        wt0Var.e(vcVar);
        wt0Var.addView(linearLayout, qoe.e(-1, -2, 48));
        t1Var2.addView(wt0Var, qoe.t(-1, -2, 1, 18, 14, 18, 2));
        LinearLayout linearLayout2 = new LinearLayout(activity);
        this.I0 = linearLayout2;
        linearLayout2.setOrientation(0);
        ?? b61Var2 = new b61(ylbVar, activity, true);
        b61Var2.setRoundRadius(24);
        this.G0 = b61Var2;
        b61Var2.setEnabled(false);
        b61Var2.i(jb6.G(0, "MonetizationStarsWithdraw", new Object[0]), false, true);
        b61Var2.setVisibility(0);
        b61Var2.setOnClickListener(new wh(this, i, xzaVar, (byte) 1));
        b61 b61Var3 = new b61(ylbVar, activity, true);
        b61Var3.setRoundRadius(24);
        this.J0 = b61Var3;
        b61Var3.setEnabled(false);
        b61Var3.i(jb6.M0(2131748131, null), false, true);
        b61Var3.setOnClickListener(new ii(this, i, j, activity));
        linearLayout2.addView((View) b61Var2, qoe.p(-1, 48, 1.0f, 119));
        if (sd2.V(L02)) {
            linearLayout2.addView(new Space(activity), qoe.p(8, 48, 0.0f, 119));
            linearLayout2.addView(b61Var3, qoe.p(-1, 48, 1.0f, 119));
        }
        t1Var2.addView(linearLayout2, qoe.d(-1, 48.0f, 55, 18.0f, 13.0f, 18.0f, 0.0f));
        vcVar.setOnEditorActionListener(new eg(this, xzaVar, (byte) 1));
        this.f1 = new nj1(this, i, (byte) 2);
        q7c q7cVar = new q7c(xzaVar, new f(this, (byte) 24), new lj1(this), new qn0(this, (byte) 19));
        this.X0 = q7cVar;
        jg2 jg2Var = new jg2((Object) this, (byte) 5);
        q7cVar.f3 = jg2Var;
        q7cVar.setLayoutManager(jg2Var);
        q7cVar.setClipToPadding(false);
        q7cVar.r1();
        q7cVar.setCaptureSectionsDecoratorAllowed(true);
        q7cVar.g3.r = false;
        v(q7cVar, new lj1(this));
        y(ek1Var, ek1Var.b, new qn0((byte) 18));
        z(ek1Var.d);
        ek1Var.d.setLayoutParams(qoe.d(-1, -2.0f, 48, -4.0f, 0.0f, -4.0f, 0.0f));
        if (sy4Var != null) {
            sy4Var.b(q7cVar);
        }
        LinearLayout l = td4.l(activity, 1);
        FrameLayout frameLayout = new FrameLayout(activity);
        this.Y0 = frameLayout;
        anb.h(cmb.Z6, ylbVar, frameLayout);
        frameLayout.addView(l, qoe.e(-2, -2, 17));
        ?? imageView2 = new ImageView(activity);
        imageView2.setAutoRepeat(true);
        imageView2.f(2131624223, 120, 120, null);
        imageView2.d();
        TextView textView = new TextView(activity);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(gm.o());
        int i5 = cmb.Ej;
        anb.X(textView, i5, null);
        textView.setTag(Integer.valueOf(i5));
        textView.setText(jb6.M0(2131748534, "LoadingStats"));
        textView.setGravity(1);
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 15.0f);
        int i6 = cmb.Fj;
        anb.X(textView2, i6, null);
        textView2.setTag(Integer.valueOf(i6));
        textView2.setText(jb6.M0(2131748533, null));
        textView2.setGravity(1);
        l.addView((View) imageView2, qoe.t(120, 120, 1, 0, 0, 0, 20));
        l.addView(textView, qoe.t(-2, -2, 1, 0, 0, 0, 10));
        l.addView(textView2, qoe.r(-2, -2, 1));
        addView(frameLayout, qoe.e(-1, -1, 119));
    }

    public static my0 J(ylb ylbVar, Context context, boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        my0 h = hg9.h(1, ylbVar, context, false);
        LinearLayout i10 = hg9.i(context, 1);
        i10.setPadding(gm.L(8.0f), 0, gm.L(8.0f), 0);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131231617);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        int L = gm.L(80.0f);
        int i11 = cmb.Ei;
        ShapeDrawable K = cmb.K(L, cmb.v0(i11, ylbVar));
        wmb M = anb.M(i11);
        imageView.setBackground(K);
        anb.j(imageView, K, M, null, ylbVar);
        i10.addView(imageView, qoe.t(80, 80, 1, 0, 16, 0, 16));
        TextView textView = new TextView(context);
        textView.setGravity(17);
        ts2.s(textView, 1, 20.0f);
        int i12 = cmb.F6;
        anb.X(textView, i12, ylbVar);
        if (z) {
            i = 2131752991;
        } else {
            i = 2131748146;
        }
        textView.setText(jb6.M0(i, null));
        i10.addView(textView, qoe.k(8.0f, 0.0f, 8.0f, 25.0f, -1, -2));
        if (z) {
            i2 = 2131753000;
        } else {
            i2 = 2131748155;
        }
        String M0 = jb6.M0(i2, null);
        if (z) {
            i3 = 2131752999;
        } else {
            i3 = 2131748154;
        }
        i10.addView(new a6(context, 2131232094, M0, jb6.M0(i3, null), ylbVar), qoe.t(-1, -2, 49, 8, 0, 8, 16));
        if (z) {
            i4 = 2131752998;
        } else {
            i4 = 2131748153;
        }
        String M02 = jb6.M0(i4, null);
        if (z) {
            i5 = 2131752997;
        } else {
            i5 = 2131748152;
        }
        i10.addView(new a6(context, 2131231819, M02, jb6.M0(i5, null), ylbVar), qoe.t(-1, -2, 49, 8, 0, 8, 16));
        if (z) {
            i6 = 2131752996;
        } else {
            i6 = 2131748151;
        }
        String M03 = jb6.M0(i6, null);
        if (z) {
            i7 = 2131752995;
        } else {
            i7 = 2131748150;
        }
        i10.addView(new a6(context, 2131231829, M03, jb6.M0(i7, null), ylbVar), qoe.t(-1, -2, 49, 8, 0, 8, 16));
        View view = new View(context);
        anb.h(cmb.c7, ylbVar, view);
        i10.addView(view, qoe.n(1.0f / gm.p, -1, 55, 12, 0, 12, 0));
        fn fnVar = new fn(context);
        fnVar.setGravity(17);
        fnVar.setTextSize(1, 20.0f);
        fnVar.setTypeface(gm.o());
        anb.X(fnVar, i12, ylbVar);
        SpannableString spannableString = new SpannableString("💎");
        pn2 pn2Var = new pn2(2131231962, 0);
        pn2Var.d = false;
        pn2Var.I = 0.9f;
        pn2Var.J = 0.9f;
        pn2Var.b(fnVar.getPaint().getFontMetricsInt());
        pn2Var.H = 0.9f;
        spannableString.setSpan(pn2Var, 0, spannableString.length(), 33);
        if (z) {
            i8 = 2131752992;
        } else {
            i8 = 2131748147;
        }
        fnVar.setText(gm.G2(jb6.M0(i8, null), spannableString, "💎"));
        i10.addView(fnVar, qoe.k(8.0f, 20.0f, 8.0f, 0.0f, -1, -2));
        l66 l66Var = new l66(context, ylbVar);
        l66Var.setGravity(17);
        l66Var.setTextSize(1, 14.0f);
        anb.X(l66Var, i12, ylbVar);
        anb.G(l66Var, cmb.Wc, ylbVar);
        if (z) {
            i9 = 2131752993;
        } else {
            i9 = 2131748148;
        }
        l66Var.setText(gm.X3(gm.S2(jb6.M0(i9, null)), new y8c((byte) 8, context, z)));
        i10.addView(l66Var, qoe.k(28.0f, 9.0f, 28.0f, 0.0f, -1, -2));
        b61 i13 = mlb.i(24, ylbVar, context, true);
        i13.i(jb6.M0(2131749305, null), false, true);
        i13.setOnClickListener(new di(h, (byte) 2));
        i10.addView(i13, qoe.t(-1, 48, 55, 10, 25, 10, 14));
        h.O = i10;
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
                pn2 pn2Var = new pn2(2131231962, 0);
                pn2Var.d = false;
                pn2Var.I = f;
                pn2Var.J = f;
                pn2Var.a(cmb.n6);
                pn2Var.b(textPaint.getFontMetricsInt());
                pn2Var.H = 0.9f;
                spannableString.setSpan(pn2Var, 0, spannableString.length(), 33);
            } else {
                pn2 pn2Var2 = new pn2(2131231960, 0);
                pn2Var2.d = false;
                pn2Var2.I = f;
                pn2Var2.J = f;
                pn2Var2.s = f2;
                pn2Var2.H = 0.95f;
                spannableString.setSpan(pn2Var2, 0, spannableString.length(), 33);
            }
            u1.put(Integer.valueOf(i3), spannableString);
        }
        return gm.I2(charSequence, spannableString, "TON");
    }

    public static void N(Context context, int i, TL_stats.BroadcastRevenueTransaction broadcastRevenueTransaction, long j, ylb ylbVar) {
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
        my0 h = hg9.h(1, ylbVar, context, false);
        LinearLayout i3 = hg9.i(context, 1);
        boolean z3 = broadcastRevenueTransaction instanceof TL_stats.TL_broadcastRevenueTransactionWithdrawal;
        if (z3) {
            TL_stats.TL_broadcastRevenueTransactionWithdrawal tL_broadcastRevenueTransactionWithdrawal = (TL_stats.TL_broadcastRevenueTransactionWithdrawal) broadcastRevenueTransaction;
            M0 = jb6.M0(2131748118, null);
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
                M0 = jb6.M0(2131748120, null);
                j3 = tL_broadcastRevenueTransactionProceeds.from_date;
                j5 = tL_broadcastRevenueTransactionProceeds.to_date;
                j4 = tL_broadcastRevenueTransactionProceeds.amount;
            } else if (broadcastRevenueTransaction instanceof TL_stats.TL_broadcastRevenueTransactionRefund) {
                TL_stats.TL_broadcastRevenueTransactionRefund tL_broadcastRevenueTransactionRefund = (TL_stats.TL_broadcastRevenueTransactionRefund) broadcastRevenueTransaction;
                M0 = jb6.M0(2131748119, null);
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
        long j6 = j4;
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
        decimalFormatSymbols.setDecimalSeparator('.');
        DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
        decimalFormat.setMinimumFractionDigits(2);
        decimalFormat.setMaximumFractionDigits(12);
        decimalFormat.setGroupingUsed(false);
        TextView textView = new TextView(context);
        textView.setGravity(17);
        wi8.v(textView, 1, 18.0f);
        if (c < 0) {
            i2 = cmb.p7;
        } else {
            i2 = cmb.k8;
        }
        anb.X(textView, i2, null);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (c < 0) {
            str = "-";
        } else {
            str = "+";
        }
        spannableStringBuilder.append((CharSequence) str);
        long j7 = j3;
        spannableStringBuilder.append((CharSequence) decimalFormat.format(Math.round((Math.abs(j6) / 1.0E9d) * 100000.0d) / 100000.0d));
        spannableStringBuilder.append((CharSequence) " TON");
        int indexOf = TextUtils.indexOf(spannableStringBuilder, ".");
        if (indexOf >= 0) {
            spannableStringBuilder.setSpan(new RelativeSizeSpan(1.3333334f), 0, indexOf, 33);
        }
        textView.setText(spannableStringBuilder);
        i3.addView(textView, qoe.t(-1, -2, 49, 0, 24, 0, 6));
        TextView textView2 = new TextView(context);
        textView2.setGravity(17);
        textView2.setTextSize(1, 13.0f);
        anb.X(textView2, cmb.x6, ylbVar);
        if (z) {
            textView2.setText(jb6.M0(2131748115, null));
        } else if (j7 == j2) {
            textView2.setText(jb6.Q(j5));
        } else if (j5 == j2) {
            textView2.setText(jb6.Q(j7));
        } else {
            textView2.setText(jb6.Q(j7) + " - " + jb6.Q(j5));
        }
        if (z2) {
            anb.X(textView2, cmb.p7, ylbVar);
            textView2.setText(TextUtils.concat(textView2.getText(), " — ", jb6.M0(2131748116, null)));
        }
        i3.addView(textView2, qoe.t(-1, -2, 49, 0, 0, 0, 0));
        TextView textView3 = new TextView(context);
        textView3.setGravity(17);
        wi8.v(textView3, 1, 14.0f);
        anb.X(textView3, cmb.F6, ylbVar);
        textView3.setText(M0);
        i3.addView(textView3, qoe.t(-1, -2, 49, 0, 27, 0, 0));
        if (broadcastRevenueTransaction instanceof TL_stats.TL_broadcastRevenueTransactionProceeds) {
            FrameLayout frameLayout = new FrameLayout(context);
            int L = gm.L(28.0f);
            int L2 = gm.L(28.0f);
            int i4 = cmb.Si;
            ShapeDrawable c0 = cmb.c0(L, L2, cmb.v0(i4, ylbVar));
            wmb M = anb.M(i4);
            frameLayout.setBackground(c0);
            anb.j(frameLayout, c0, M, null, ylbVar);
            if (j < j2) {
                TLRPC.Chat L0 = oc7.r1(i).L0(Long.valueOf(-j));
                if (L0 == null) {
                    r = "";
                    chat = L0;
                } else {
                    r = L0.title;
                    chat = L0;
                }
            } else {
                TLRPC.User W1 = oc7.r1(i).W1(Long.valueOf(j));
                r = m9c.r(W1);
                chat = W1;
            }
            bf0 bf0Var = new bf0(context);
            bf0Var.setRoundRadius(gm.L(28.0f));
            pc0 pc0Var = new pc0((ylb) null);
            pc0Var.k(chat);
            bf0Var.f(chat, pc0Var);
            frameLayout.addView(bf0Var, qoe.e(28, 28, 51));
            TextView textView4 = new TextView(context);
            anb.X(textView4, cmb.i5, ylbVar);
            textView4.setTextSize(1, 13.0f);
            textView4.setSingleLine();
            textView4.setText(r);
            frameLayout.addView(textView4, qoe.d(-2, -2.0f, 19, 37.0f, 0.0f, 10.0f, 0.0f));
            i3.addView(frameLayout, qoe.t(-2, 28, 1, 42, 10, 42, 0));
        }
        b61 i5 = mlb.i(24, ylbVar, context, true);
        if (z3) {
            TL_stats.TL_broadcastRevenueTransactionWithdrawal tL_broadcastRevenueTransactionWithdrawal2 = (TL_stats.TL_broadcastRevenueTransactionWithdrawal) broadcastRevenueTransaction;
            if ((tL_broadcastRevenueTransactionWithdrawal2.flags & 2) != 0) {
                i5.i(jb6.M0(2131748117, null), false, true);
                i5.setOnClickListener(new rc1(context, tL_broadcastRevenueTransactionWithdrawal2, (byte) 4));
                i3.addView(i5, qoe.t(-1, 48, 55, 18, 30, 18, 14));
                h.O = i3;
                h.show();
            }
        }
        i5.i(jb6.M0(2131747564, null), false, true);
        i5.setOnClickListener(new di(h, (byte) 3));
        i3.addView(i5, qoe.t(-1, 48, 55, 18, 30, 18, 14));
        h.O = i3;
        h.show();
    }

    public final void E(TLRPC.TL_payments_starsRevenueStats tL_payments_starsRevenueStats) {
        boolean z;
        FrameLayout frameLayout;
        nl1 nl1Var;
        ArrayList arrayList;
        if (this.n1 == null) {
            z = true;
        } else {
            z = false;
        }
        this.h1 = tL_payments_starsRevenueStats.usd_rate;
        jza g0 = xza.g0(tL_payments_starsRevenueStats.revenue_graph, jb6.M0(2131748157, null), 2, false);
        this.n1 = g0;
        if (g0 != null && (nl1Var = g0.d) != null && (arrayList = nl1Var.d) != null && !arrayList.isEmpty() && this.n1.d.d.get(0) != null) {
            ((ml1) this.n1.d.d.get(0)).g = cmb.ak;
            this.n1.d.h = (float) ((1.0d / this.h1) / 100.0d);
        }
        M(false, tL_payments_starsRevenueStats.status);
        if (!this.b1 && (frameLayout = this.Y0) != null) {
            frameLayout.animate().alpha(0.0f).setDuration(380L).setInterpolator(d53.h).withEndAction(new mj1(this, (byte) 6)).start();
        }
        q7c q7cVar = this.X0;
        if (q7cVar != null) {
            q7cVar.g3.O(!z);
            if (z) {
                q7cVar.w0(0);
            }
        }
    }

    public final void F() {
        if (isAttachedToWindow() && this.b1 && this.o1 && oc7.d1().getBoolean("monetizationadshint", true)) {
            this.m0.showDialog(J(this.n0, getContext(), false));
            oc7.d1().edit().putBoolean("monetizationadshint", false).apply();
        }
    }

    public final void G(boolean z, TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity) {
        TLRPC.TL_payments_getStarsRevenueWithdrawalUrl tL_payments_getStarsRevenueWithdrawalUrl;
        xza xzaVar = this.m0;
        if (xzaVar != null) {
            Activity parentActivity = xzaVar.getParentActivity();
            int i = this.o0;
            TLRPC.User f = z8c.h(i).f();
            if (parentActivity != null && f != null) {
                long j = this.p0;
                if (z) {
                    tL_payments_getStarsRevenueWithdrawalUrl = new TLRPC.TL_payments_getStarsRevenueWithdrawalUrl();
                    tL_payments_getStarsRevenueWithdrawalUrl.ton = false;
                    tL_payments_getStarsRevenueWithdrawalUrl.peer = oc7.r1(i).i1(j);
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
                    tL_payments_getStarsRevenueWithdrawalUrl.peer = oc7.r1(i).i1(j);
                    TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP2 = tL_inputCheckPasswordSRP;
                    if (tL_inputCheckPasswordSRP == null) {
                        inputCheckPasswordSRP2 = new TLRPC.TL_inputCheckPasswordEmpty();
                    }
                    tL_payments_getStarsRevenueWithdrawalUrl.password = inputCheckPasswordSRP2;
                }
                ConnectionsManager.getInstance(i).sendRequest(tL_payments_getStarsRevenueWithdrawalUrl, new rj1(this, twoStepVerificationActivity, parentActivity, z, (byte) 0));
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
        ku0 g = ku0.g(i);
        long j = this.p0;
        TLRPC.TL_payments_starsRevenueStats h = g.h(j, z);
        if (h != null) {
            gm.c3(new uj1(this, h, (byte) 0));
            return;
        }
        TLRPC.TL_payments_getStarsRevenueStats tL_payments_getStarsRevenueStats = new TLRPC.TL_payments_getStarsRevenueStats();
        tL_payments_getStarsRevenueStats.peer = oc7.r1(i).i1(j);
        tL_payments_getStarsRevenueStats.dark = cmb.I.o();
        ConnectionsManager.getInstance(i).sendRequest(tL_payments_getStarsRevenueStats, new qj1(this, (byte) 2));
    }

    public final void K() {
        ek1 ek1Var = this.a1;
        mj1 mj1Var = ek1Var.f;
        boolean[] zArr = ek1Var.w;
        boolean a = ek1Var.a();
        for (int i = 0; i < 2; i++) {
            if (!zArr[i]) {
                if (i == 1) {
                    ek1Var.n.clear();
                    ek1Var.h = "";
                } else {
                    ek1Var.r.clear();
                    ek1Var.s = "";
                }
                zArr[i] = false;
                ek1Var.c(i);
            } else {
                return;
            }
        }
        if (ek1Var.a() != a && mj1Var != null) {
            ek1Var.e();
            mj1Var.run();
        }
    }

    public final void M(boolean z, TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus) {
        fk1 fk1Var;
        int i;
        TL_stars.StarsAmount starsAmount;
        TL_stars.StarsAmount starsAmount2;
        int i2;
        int i3;
        int i4;
        boolean z2;
        boolean z3;
        l7c l7cVar;
        long j;
        fk1 fk1Var2;
        int i5;
        int i6;
        ik1 ik1Var = this;
        fk1 fk1Var3 = ik1Var.r1;
        fk1 fk1Var4 = ik1Var.q1;
        io ioVar = ik1Var.z0;
        RelativeSizeSpan relativeSizeSpan = ik1Var.x0;
        io ioVar2 = ik1Var.y0;
        fk1 fk1Var5 = ik1Var.p1;
        if (z) {
            fk1Var5.a = true;
            long j2 = tL_starsRevenueStatus.available_balance.amount;
            fk1Var5.d = j2;
            double d = j2 / 1.0E9d;
            fk1Var5.e = (long) (ik1Var.g1 * d * 100.0d);
            if (ik1Var.Z0 == null) {
                DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
                decimalFormatSymbols.setDecimalSeparator('.');
                fk1Var2 = fk1Var3;
                DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
                ik1Var.Z0 = decimalFormat;
                decimalFormat.setMinimumFractionDigits(2);
                i5 = 6;
                ik1Var.Z0.setMaximumFractionDigits(6);
                ik1Var.Z0.setGroupingUsed(false);
            } else {
                fk1Var2 = fk1Var3;
                i5 = 6;
            }
            DecimalFormat decimalFormat2 = ik1Var.Z0;
            if (d > 1.5d) {
                i5 = 2;
            }
            decimalFormat2.setMaximumFractionDigits(i5);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(L("TON " + ik1Var.Z0.format(d), ioVar2.getPaint(), 0.9f, 0.0f, true));
            int indexOf = TextUtils.indexOf(spannableStringBuilder, ".");
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(relativeSizeSpan, indexOf, spannableStringBuilder.length(), 33);
            }
            ioVar2.setText(spannableStringBuilder);
            ioVar.setText("≈" + cj0.h().e(j, "USD"));
            fk1Var5.f = "USD";
            fk1Var4.a = true;
            long j3 = tL_starsRevenueStatus.current_balance.amount;
            fk1Var4.d = j3;
            ik1Var = this;
            double d2 = ik1Var.g1;
            fk1Var4.e = (long) ((j3 / 1.0E9d) * d2 * 100.0d);
            fk1Var4.f = "USD";
            fk1 fk1Var6 = fk1Var2;
            fk1Var6.a = true;
            long j4 = tL_starsRevenueStatus.overall_revenue.amount;
            fk1Var6.d = j4;
            fk1Var6.e = (long) ((j4 / 1.0E9d) * d2 * 100.0d);
            fk1Var6.f = "USD";
            ik1Var.o1 = true;
            if (tL_starsRevenueStatus.available_balance.amount > 0 && tL_starsRevenueStatus.withdrawal_enabled) {
                i6 = 0;
            } else {
                i6 = 8;
            }
            ik1Var.A0.setVisibility(i6);
        } else {
            double d3 = ik1Var.h1;
            if (d3 != 0.0d) {
                fk1Var5.g = true;
                TL_stars.StarsAmount starsAmount3 = tL_starsRevenueStatus.available_balance;
                fk1Var5.i = starsAmount3;
                fk1Var5.j = (long) (starsAmount3.amount * d3 * 100.0d);
                int i7 = tL_starsRevenueStatus.next_withdrawal_at;
                xj1 xj1Var = ik1Var.G0;
                if (ioVar2 != null && ioVar != null) {
                    fk1Var = fk1Var3;
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(nxa.b1(false, TextUtils.concat("XTR ", nxa.H0(starsAmount3, 0.8f, ' ')), 1.0f, null));
                    int indexOf2 = TextUtils.indexOf(spannableStringBuilder2, ".");
                    if (indexOf2 >= 0) {
                        spannableStringBuilder2.setSpan(relativeSizeSpan, indexOf2, spannableStringBuilder2.length(), 33);
                    }
                    ik1Var.D0 = starsAmount3;
                    ik1Var.E0.setText(spannableStringBuilder2);
                    ik1Var.F0.setText("≈" + cj0.h().e((long) (ik1Var.h1 * starsAmount3.amount * 100.0d), "USD"));
                    if (starsAmount3.amount > 0) {
                        i4 = 0;
                    } else {
                        i4 = 8;
                    }
                    ik1Var.K0.setVisibility(i4);
                    if (ik1Var.M0) {
                        ik1Var.L0 = true;
                        long j5 = starsAmount3.amount;
                        ik1Var.N0 = j5;
                        String l = Long.toString(j5);
                        vc vcVar = ik1Var.O0;
                        vcVar.setText(l);
                        vcVar.setSelection(vcVar.getText().length());
                        i = 0;
                        ik1Var.L0 = false;
                        if (ik1Var.N0 > 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        xj1Var.setEnabled(z3);
                    } else {
                        i = 0;
                    }
                    b61 b61Var = ik1Var.J0;
                    if (b61Var != null) {
                        if (starsAmount3.amount > 0) {
                            z2 = 1;
                        } else {
                            z2 = i;
                        }
                        b61Var.setEnabled(z2);
                    }
                    ik1Var.B0 = i7;
                    nj1 nj1Var = ik1Var.f1;
                    gm.r(nj1Var);
                    nj1Var.run();
                } else {
                    fk1Var = fk1Var3;
                    i = 0;
                }
                fk1Var5.f = "USD";
                fk1Var4.g = true;
                fk1Var4.i = tL_starsRevenueStatus.current_balance;
                double d4 = ik1Var.h1;
                fk1Var4.j = (long) (starsAmount.amount * d4 * 100.0d);
                fk1Var4.f = "USD";
                fk1 fk1Var7 = fk1Var;
                fk1Var7.g = true;
                fk1Var7.i = tL_starsRevenueStatus.overall_revenue;
                fk1Var7.j = (long) (starsAmount2.amount * d4 * 100.0d);
                fk1Var7.f = "USD";
                ik1Var.o1 = true;
                LinearLayout linearLayout = ik1Var.I0;
                if (linearLayout != null) {
                    if (tL_starsRevenueStatus.withdrawal_enabled) {
                        i3 = i;
                    } else {
                        i3 = 8;
                    }
                    linearLayout.setVisibility(i3);
                }
                if (xj1Var != null) {
                    if (tL_starsRevenueStatus.available_balance.amount <= 0) {
                        boolean z4 = e21.a;
                        i2 = 8;
                    } else {
                        i2 = i;
                    }
                    xj1Var.setVisibility(i2);
                }
            } else {
                return;
            }
        }
        q7c q7cVar = ik1Var.X0;
        if (q7cVar != null && (l7cVar = q7cVar.g3) != null) {
            l7cVar.O(true);
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
            vc vcVar = this.O0;
            if (vcVar != null) {
                vcVar.setHandlesColor(cmb.v0(cmb.lg, this.n0));
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
