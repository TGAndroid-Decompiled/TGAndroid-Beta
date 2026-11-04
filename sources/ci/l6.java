package ci;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.Bundle;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TableRow;
import android.widget.TextView;
import b8.mf;
import b8.pf;
import b8.rf;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Locale;
import org.json.JSONObject;
import org.telegram.messenger.bd;
import org.telegram.messenger.cs;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.l10;
import org.telegram.messenger.u10;
import org.telegram.messenger.zi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.gz;
import org.telegram.ui.Components.ox0;
import org.telegram.ui.Components.qx0;
import org.telegram.ui.Components.rx0;
import org.telegram.ui.Components.s70;
import org.telegram.ui.Components.sj0;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.wo;
import org.telegram.ui.Components.wp;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.gg0;
public class l6 extends org.telegram.ui.Components.ma implements cs {
    public static final int f5445t3 = 0;
    public zi A2;
    public String B2;
    public TL_stars.TL_starGiftUnique C2;
    public boolean D2;
    public boolean E2;
    public boolean F2;
    public boolean G2;
    public boolean H2;
    public u5 I2;
    public boolean J2;
    public s4 K2;
    public final int[] L2;
    public r4 M2;
    public int N2;
    public String O2;
    public ai.g6 P2;
    public final long Q1;
    public wp Q2;
    public final t4 R1;
    public boolean R2;
    public final n4 S1;
    public g4 S2;
    public final gz T1;
    public Float T2;
    public final View U1;
    public k5 U2;
    public ai.j2 V1;
    public ValueAnimator V2;
    public ai.j2 W1;
    public wp W2;
    public final q4 X1;
    public boolean X2;
    public final f6 Y1;
    public TL_wallet.nftItem Y2;
    public final p4 Z1;
    public org.telegram.ui.Wallet.e5 Z2;
    public final s70 f5446a2;
    public org.telegram.ui.Wallet.f5 f5447a3;
    public final rx0 f5448b2;
    public TL_wallet.walletTransaction f5449b3;
    public final s70 c2;
    public View f5450c3;
    public final gi.d f5451d2;
    public ai.a4 f5452d3;
    public final FrameLayout f5453e2;
    public boolean f5454e3;
    public final s70 f5455f2;
    public Boolean f5456f3;
    public final FrameLayout f5457g2;
    public boolean f5458g3;
    public final View f5459h2;
    public ArrayList f5460h3;
    public final FrameLayout f5461i2;
    public ArrayList i3;
    public h6 f5462j2;
    public ArrayList f5463j3;
    public boolean f5464k2;
    public boolean f5465k3;
    public final p4 f5466l2;
    public TLRPC.PaymentForm f5467l3;
    public final ii.j[] f5468m2;
    public final wp[] f5469m3;
    public final View f5470n2;
    public final s1 f5471n3;
    public final LinearLayout f5472o2;
    public int f5473o3;
    public final wo f5474p2;
    public Boolean f5475p3;
    public final TextView f5476q2;
    public boolean f5477q3;
    public final LinearLayout f5478r2;
    public gi.l3 f5479r3;
    public final wo f5480s2;
    public View f5481s3;
    public boolean f5482t2;
    public final p4 f5483u2;
    public final TextView f5484v2;
    public final p4 f5485w2;
    public boolean f5486x2;
    public TL_stars.SavedStarGift f5487y2;
    public w8 f5488z2;

    public l6(Context context, int i3, long j10, org.telegram.ui.ActionBar.e6 e6Var, View view) {
        super(context, null, false, false, e6Var);
        this.f5464k2 = false;
        this.L2 = new int[2];
        this.N2 = -1;
        this.O2 = "";
        this.U2 = new k5(0, 0);
        this.X2 = true;
        this.f5469m3 = new wp[1];
        this.f5471n3 = new s1(this, 11);
        this.f5477q3 = true;
        this.f28583a = i3;
        this.Q1 = j10;
        this.f36108s1 = Math.max(0.05f, org.telegram.messenger.g0.L(82.0f) / (org.telegram.messenger.g0.f22608q.y + org.telegram.messenger.g0.f22602m));
        this.f28622x = true;
        this.f28586b = new ai.o2(1, context, this);
        t4 t4Var = new t4(this, context);
        this.R1 = t4Var;
        n4 n4Var = new n4(this, context);
        this.S1 = n4Var;
        n4Var.setAdapter(new o4(0, context, this));
        v2();
        View view2 = new View(context);
        this.U1 = view2;
        int i10 = org.telegram.ui.ActionBar.k6.f27954h5;
        org.telegram.ui.ActionBar.r6.i(i10, view2, e6Var);
        FrameLayout.LayoutParams e10 = mf.e(-1, 50, 80);
        int i11 = this.f28618u0;
        e10.rightMargin = i11;
        e10.leftMargin = i11;
        this.f28586b.addView(view2, e10);
        this.f28586b.addView(n4Var, mf.e(-1, -1, 119));
        P(i10);
        org.telegram.messenger.g0.E2(this.f36102l1);
        t4Var.addView(this.f36102l1, mf.e(-1, -1, 119));
        p4 p4Var = new p4(this, context, 0);
        this.Z1 = p4Var;
        p4Var.setOrientation(1);
        p4Var.setPadding(org.telegram.messenger.g0.L(14.0f) + this.f28618u0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(14.0f) + this.f28618u0, org.telegram.messenger.g0.L(68.0f));
        t4Var.addView(p4Var, mf.e(-1, -1, 55));
        s70 s70Var = new s70(context, e6Var);
        this.f5446a2 = s70Var;
        int i12 = org.telegram.ui.ActionBar.k6.f28120q5;
        org.telegram.ui.ActionBar.r6.V(s70Var, i12, e6Var);
        s70Var.setTextSize(1, 12.0f);
        s70Var.setGravity(17);
        s70Var.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        org.telegram.ui.ActionBar.r6.H(s70Var, org.telegram.ui.ActionBar.k6.Uc, e6Var);
        s70Var.setDisablePaddingsOffsetY(true);
        p4Var.addView(s70Var, mf.t(-2, -2, 1, 4, -2, 4, 16));
        s70Var.setVisibility(8);
        rx0 rx0Var = new rx0(context, e6Var);
        this.f5448b2 = rx0Var;
        p4Var.addView(rx0Var, mf.k(0.0f, 0.0f, 0.0f, 12.0f, -1, -2));
        s70 s70Var2 = new s70(context, e6Var);
        this.c2 = s70Var2;
        org.telegram.ui.ActionBar.r6.V(s70Var2, i12, e6Var);
        s70Var2.setTextSize(1, 12.0f);
        s70Var2.setGravity(17);
        s70Var2.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        int i13 = org.telegram.ui.ActionBar.k6.Ci;
        org.telegram.ui.ActionBar.r6.H(s70Var2, i13, e6Var);
        s70Var2.setDisablePaddingsOffsetY(true);
        s70Var2.setPadding(org.telegram.messenger.g0.L(5.0f), 0, org.telegram.messenger.g0.L(5.0f), 0);
        p4Var.addView(s70Var2, mf.t(-2, -2, 1, 4, 2, 4, 8));
        s70Var2.setVisibility(8);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f5478r2 = linearLayout;
        linearLayout.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f));
        linearLayout.setOrientation(0);
        int i14 = org.telegram.ui.ActionBar.k6.f27972i6;
        org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.k6.a0(org.telegram.ui.ActionBar.k6.w0(i14, e6Var), 21, 21);
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i14);
        linearLayout.setBackground(a02);
        org.telegram.ui.ActionBar.r6.k(linearLayout, a02, null, N, e6Var);
        wo woVar = new wo(24, context, e6Var);
        this.f5480s2 = woVar;
        int i15 = org.telegram.ui.ActionBar.k6.h7;
        int i16 = org.telegram.ui.ActionBar.k6.f27990j7;
        int i17 = org.telegram.ui.ActionBar.k6.f28008k7;
        woVar.b(i15, i16, i17);
        woVar.setDrawUnchecked(true);
        woVar.a(false, false);
        woVar.setDrawBackgroundAsArc(10);
        linearLayout.addView(woVar, mf.t(26, 26, 16, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        int i18 = org.telegram.ui.ActionBar.k6.f27988j5;
        org.telegram.ui.ActionBar.r6.V(textView, i18, e6Var);
        k2.p1.u(textView, 1, 14.0f, null, 2131750397);
        linearLayout.addView(textView, mf.t(-2, -2, 16, 9, 0, 0, 0));
        p4Var.addView(linearLayout, mf.t(-2, -2, 1, 0, -4, 0, 4));
        pf.b(linearLayout, 0.025f, 1.5f);
        linearLayout.setOnClickListener(new r1(this, 19));
        linearLayout.setVisibility(8);
        p4 p4Var2 = new p4(this, context, 1);
        this.f5466l2 = p4Var2;
        p4Var2.setOrientation(1);
        p4Var2.setPadding(org.telegram.messenger.g0.L(4.0f) + this.f28618u0, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(4.0f) + this.f28618u0, org.telegram.messenger.g0.L(66.0f));
        t4Var.addView(p4Var2, mf.e(-1, -1, 55));
        this.f5468m2 = r8;
        ii.j jVar = new ii.j(context, e6Var, false);
        jVar.a(2131231821, bd.M0(2131749873, null), bd.M0(2131749583, null));
        p4Var2.addView(r8[0], mf.o(-1, -2));
        ii.j jVar2 = new ii.j(context, e6Var, false);
        jVar2.a(2131231817, bd.M0(2131749867, null), bd.M0(2131749581, null));
        p4Var2.addView(r8[1], mf.o(-1, -2));
        ii.j jVar3 = new ii.j(context, e6Var, false);
        ii.j[] jVarArr = {jVar, jVar2, jVar3};
        jVar3.a(2131231924, bd.M0(2131749578, null), bd.M0(2131749579, null));
        p4Var2.addView(jVarArr[2], mf.o(-1, -2));
        View view3 = new View(context);
        this.f5470n2 = view3;
        int i19 = org.telegram.ui.ActionBar.k6.f27879d7;
        org.telegram.ui.ActionBar.r6.i(i19, view3, e6Var);
        p4Var2.addView(view3, mf.n(1.0f / org.telegram.messenger.g0.f22607p, -2, 7, 17, -4, 17, 6));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f5472o2 = linearLayout2;
        linearLayout2.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f));
        linearLayout2.setOrientation(0);
        org.telegram.ui.Cells.y a03 = org.telegram.ui.ActionBar.k6.a0(org.telegram.ui.ActionBar.k6.w0(i14, e6Var), 6, 6);
        org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i14);
        linearLayout2.setBackground(a03);
        org.telegram.ui.ActionBar.r6.k(linearLayout2, a03, null, N2, e6Var);
        wo woVar2 = new wo(24, context, e6Var);
        this.f5474p2 = woVar2;
        woVar2.b(i15, i16, i17);
        woVar2.setDrawUnchecked(true);
        woVar2.a(false, false);
        woVar2.setDrawBackgroundAsArc(10);
        linearLayout2.addView(woVar2, mf.t(26, 26, 16, 0, 0, 0, 0));
        TextView textView2 = new TextView(context);
        this.f5476q2 = textView2;
        org.telegram.ui.ActionBar.r6.V(textView2, i18, e6Var);
        k2.p1.u(textView2, 1, 14.0f, null, 2131750405);
        linearLayout2.addView(textView2, mf.t(-2, -2, 16, 9, 0, 0, 0));
        p4Var2.addView(linearLayout2, mf.t(-2, -2, 1, 0, 0, 0, 4));
        pf.b(linearLayout2, 0.025f, 1.5f);
        p4 p4Var3 = new p4(this, context, 2);
        this.f5483u2 = p4Var3;
        p4Var3.setOrientation(1);
        p4Var3.setPadding(org.telegram.messenger.g0.L(4.0f) + this.f28618u0, org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(4.0f) + this.f28618u0, org.telegram.messenger.g0.L(66.0f));
        t4Var.addView(p4Var3, mf.e(-1, -1, 55));
        TextView textView3 = new TextView(context);
        this.f5484v2 = textView3;
        org.telegram.ui.ActionBar.r6.V(textView3, i18, e6Var);
        textView3.setTextSize(1, 20.0f);
        textView3.setGravity(17);
        textView3.setTypeface(org.telegram.messenger.g0.o());
        p4Var3.addView(textView3, mf.t(-1, -2, 7, 20, 0, 20, 0));
        TextView textView4 = new TextView(context);
        org.telegram.ui.ActionBar.r6.V(textView4, i18, e6Var);
        textView4.setTextSize(1, 14.0f);
        org.telegram.messenger.k5.m(textView4, 17, null, 2131749842);
        p4Var3.addView(textView4, mf.t(-1, -2, 7, 20, 6, 20, 24));
        ii.j jVar4 = new ii.j(context, e6Var, false);
        jVar4.a(2131231821, bd.M0(2131749848, null), bd.M0(2131749849, null));
        p4Var3.addView(r6[0], mf.o(-1, -2));
        ii.j jVar5 = new ii.j(context, e6Var, false);
        jVar5.a(2131231799, bd.M0(2131749846, null), bd.M0(2131749847, null));
        p4Var3.addView(r6[1], mf.o(-1, -2));
        ii.j jVar6 = new ii.j(context, e6Var, false);
        ii.j[] jVarArr2 = {jVar4, jVar5, jVar6};
        jVar6.a(2131231911, bd.M0(2131749844, null), bd.M0(2131749845, null));
        p4Var3.addView(jVarArr2[2], mf.o(-1, -2));
        p4 p4Var4 = new p4(this, context, 3);
        this.f5485w2 = p4Var4;
        p4Var4.setOrientation(1);
        p4Var4.setPadding(org.telegram.messenger.g0.L(4.0f) + this.f28618u0, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(4.0f) + this.f28618u0, org.telegram.messenger.g0.L(92.0f));
        t4Var.addView(p4Var4, mf.e(-1, -1, 55));
        ii.j jVar7 = new ii.j(context, e6Var, false);
        jVar7.a(2131231821, bd.M0(2131749793, null), bd.M0(2131749794, null));
        p4Var4.addView(r8[0], mf.o(-1, -2));
        ii.j jVar8 = new ii.j(context, e6Var, false);
        jVar8.a(2131231873, bd.M0(2131749791, null), bd.M0(2131749792, null));
        p4Var4.addView(r8[1], mf.o(-1, -2));
        ii.j jVar9 = new ii.j(context, e6Var, false);
        ii.j[] jVarArr3 = {jVar7, jVar8, jVar9};
        jVar9.a(2131231795, bd.M0(2131749789, null), bd.M0(2131749790, null));
        p4Var4.addView(jVarArr3[2], mf.o(-1, -2));
        p4Var.setAlpha(1.0f);
        p4Var2.setAlpha(0.0f);
        p4Var3.setAlpha(0.0f);
        p4Var4.setAlpha(0.0f);
        f6 f6Var = new f6(context, e6Var, new s1(this, 12), new r1(this, 20), new r1(this, 21), new r1(this, 22), new r1(this, 23), new r1(this, 24), new r1(this, 25), new r1(this, 26));
        this.Y1 = f6Var;
        f6Var.N.f5221c.setOnClickListener(new r1(this, 17));
        int i20 = this.f28618u0;
        f6Var.setPadding(i20, 0, i20, 0);
        t4Var.addView(f6Var, mf.e(-1, -2, 55));
        kg.y yVar = this.k1;
        this.H1 = true;
        yVar.k1(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f5453e2 = frameLayout;
        org.telegram.ui.ActionBar.r6.i(i10, frameLayout, e6Var);
        View view4 = new View(context);
        this.f5459h2 = view4;
        org.telegram.ui.ActionBar.r6.i(i19, view4, e6Var);
        view4.setAlpha(0.0f);
        frameLayout.addView(view4, mf.a(-1.0f, 1.0f / org.telegram.messenger.g0.f22607p, 55));
        gi.d h = org.telegram.messenger.k5.h(24, context, e6Var, true);
        this.f5451d2 = h;
        h.i(bd.M0(2131747839, null), false, true);
        h.g(null, false);
        FrameLayout.LayoutParams d = mf.d(-1, 48.0f, 119, 0.0f, 12.0f, 0.0f, 12.0f);
        d.leftMargin = org.telegram.messenger.g0.L(14.0f) + this.f28618u0;
        d.rightMargin = org.telegram.messenger.g0.L(14.0f) + this.f28618u0;
        frameLayout.addView(h, d);
        t4Var.addView(frameLayout, mf.e(-1, 72, 87));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f5457g2 = frameLayout2;
        org.telegram.ui.ActionBar.r6.i(i10, frameLayout2, e6Var);
        s70 s70Var3 = new s70(context, null);
        this.f5455f2 = s70Var3;
        s70Var3.setTextSize(1, 12.0f);
        org.telegram.ui.ActionBar.r6.V(s70Var3, i13, e6Var);
        org.telegram.ui.ActionBar.r6.H(s70Var3, i13, e6Var);
        s70Var3.setGravity(17);
        frameLayout2.addView(s70Var3, mf.d(-1, -2.0f, 17, 16.0f, 8.0f, 16.0f, 14.0f));
        t4Var.addView(frameLayout2, mf.e(-1, -2, 87));
        frameLayout2.setVisibility(8);
        this.f36102l1.setOnScrollListener(new ai.j5(this, 7));
        linearLayout2.setOnClickListener(new r1(this, 18));
        gz gzVar = new gz(context);
        this.T1 = gzVar;
        t4Var.addView(gzVar, mf.c(-1.0f, -1));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f5461i2 = frameLayout3;
        frameLayout3.setPadding(org.telegram.messenger.g0.L(6.0f) + this.f28618u0, 0, org.telegram.messenger.g0.L(6.0f) + this.f28618u0, 0);
        t4Var.addView(frameLayout3, mf.d(-1, 200.0f, 87, 0.0f, 0.0f, 0.0f, 60.0f));
        org.telegram.messenger.g0.E2(this.m1);
        t4Var.addView(this.m1, mf.d(-1, -2.0f, 0, 6.0f, 0.0f, 6.0f, 0.0f));
        q4 q4Var = new q4(context);
        this.X1 = q4Var;
        t4Var.addView(q4Var, mf.e(-1, -2, 55));
        ArrayList arrayList = new ArrayList();
        if (view != null) {
            arrayList.add(view);
        }
        org.telegram.messenger.g0.m2(new ai.v2(q4Var, 10), 12.0f, 12, arrayList);
    }

    public static String A1(TL_stars.StarGift starGift) {
        if (starGift instanceof TL_stars.TL_starGiftUnique) {
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(tL_starGiftUnique.title);
            sb2.append(" #");
            return k2.p1.l(tL_starGiftUnique.num, ',', sb2);
        } else if ((starGift instanceof TL_stars.TL_starGift) && !TextUtils.isEmpty(starGift.title)) {
            return starGift.title;
        } else {
            return bd.M0(2131750200, null);
        }
    }

    public static String G1(TL_stars.StarGiftAttributeRarity starGiftAttributeRarity, Integer[] numArr) {
        if (starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarityUncommon) {
            numArr[0] = -12539616;
            return bd.M0(2131749627, null);
        } else if (starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarityRare) {
            numArr[0] = -15619394;
            return bd.M0(2131749628, null);
        } else if (starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarityEpic) {
            numArr[0] = -6988581;
            return bd.M0(2131749630, null);
        } else if (starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarityLegendary) {
            numArr[0] = -4229632;
            return bd.M0(2131749629, null);
        } else if (starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarity) {
            int i3 = ((TL_stars.TL_starGiftAttributeRarity) starGiftAttributeRarity).permille;
            if (i3 <= 0) {
                return "<0.1%";
            }
            return ii.k.J0(i3);
        } else {
            return "";
        }
    }

    public static boolean K1(int i3, long j10) {
        if (j10 >= 0) {
            if (h10.i(i3).e() == j10) {
                return true;
            }
            return false;
        }
        return org.telegram.messenger.t3.w(5, hp.s1(i3).M0(Long.valueOf(-j10)));
    }

    public static boolean L1(int i3, long j10) {
        if (j10 >= 0) {
            if (h10.i(i3).e() != j10) {
                return false;
            }
            return true;
        }
        TLRPC.Chat M0 = hp.s1(i3).M0(Long.valueOf(-j10));
        if (M0 == null || !M0.creator) {
            return false;
        }
        return true;
    }

    public static boolean M1(int i3, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        if (tL_starGiftUnique == null) {
            return false;
        }
        TLRPC.Peer peer = tL_starGiftUnique.owner_id;
        if (peer == null) {
            peer = tL_starGiftUnique.host_id;
        }
        long o10 = org.telegram.messenger.m5.o(peer);
        int i10 = (o10 > 0L ? 1 : (o10 == 0L ? 0 : -1));
        if (i10 == 0) {
            return false;
        }
        if (i10 > 0) {
            TLRPC.User a22 = hp.s1(i3).a2(Long.valueOf(o10));
            if (a22 != null) {
                TLRPC.EmojiStatus emojiStatus = a22.emoji_status;
                if (!(emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) || ((TLRPC.TL_emojiStatusCollectible) emojiStatus).collectible_id != tL_starGiftUnique.f27230id) {
                    return false;
                }
                return true;
            }
        } else {
            TLRPC.Chat M0 = hp.s1(i3).M0(Long.valueOf(-o10));
            if (M0 != null) {
                TLRPC.EmojiStatus emojiStatus2 = M0.emoji_status;
                if ((emojiStatus2 instanceof TLRPC.TL_emojiStatusCollectible) && ((TLRPC.TL_emojiStatusCollectible) emojiStatus2).collectible_id == tL_starGiftUnique.f27230id) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void c2(org.telegram.ui.ActionBar.d2 d2Var) {
        org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
        if (T == 0) {
            return;
        }
        ?? obj = new Object();
        obj.f27395a = true;
        T.showAsSheet(d2Var, obj);
    }

    public static void d1(l6 l6Var) {
        boolean z10;
        TLRPC.Document document;
        boolean z11;
        s8 F;
        TLRPC.Message message;
        gi.d dVar = l6Var.f5451d2;
        if (!dVar.R) {
            TL_stars.InputSavedStarGift B1 = l6Var.B1();
            zi ziVar = l6Var.A2;
            if (ziVar != null && (message = ziVar.f26868k) != null) {
                TLRPC.MessageAction messageAction = message.action;
                if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                    TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                    z10 = tL_messageActionStarGift.saved;
                    document = tL_messageActionStarGift.gift.getDocument();
                } else if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                    TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
                    z10 = tL_messageActionStarGiftUnique.saved;
                    document = tL_messageActionStarGiftUnique.gift.getDocument();
                } else {
                    return;
                }
            } else {
                TL_stars.SavedStarGift savedStarGift = l6Var.f5487y2;
                if (savedStarGift != null) {
                    z10 = !savedStarGift.unsaved;
                    document = savedStarGift.gift.getDocument();
                } else {
                    return;
                }
            }
            TLRPC.Document document2 = document;
            boolean z12 = z10;
            dVar.setLoading(true);
            TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
            savestargift.unsave = z12;
            savestargift.stargift = B1;
            if (l6Var.f5487y2 != null && (F = e9.y(l6Var.f28583a, false).F(l6Var.Q1, false)) != null) {
                F.m(l6Var.f5487y2, savestargift.unsave);
                z11 = true;
            } else {
                z11 = false;
            }
            ConnectionsManager.getInstance(l6Var.f28583a).sendRequest(savestargift, new d4(l6Var, z11, document2, z12, savestargift));
        }
    }

    public static void e1(final l6 l6Var) {
        int i3;
        long j10;
        long j11;
        long j12;
        String M0;
        final long e10 = h10.i(l6Var.f28583a).e();
        final TL_stars.InputSavedStarGift B1 = l6Var.B1();
        if (B1 != null) {
            zi ziVar = l6Var.A2;
            if (ziVar != null) {
                i3 = ziVar.f26868k.date;
                boolean Q3 = ziVar.Q3();
                TLRPC.Message message = l6Var.A2.f26868k;
                if (message != null) {
                    TLRPC.MessageAction messageAction = message.action;
                    if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                        TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                        TLRPC.Peer peer = tL_messageActionStarGift.peer;
                        if (peer != null) {
                            j12 = org.telegram.messenger.m5.o(peer);
                        } else if (Q3) {
                            j12 = zi.B0(message);
                        } else {
                            j12 = e10;
                        }
                        TLRPC.Peer peer2 = tL_messageActionStarGift.from_id;
                        if (peer2 != null) {
                            j10 = org.telegram.messenger.m5.o(peer2);
                        } else if (Q3) {
                            j10 = e10;
                        } else {
                            j10 = zi.B0(l6Var.A2.f26868k);
                        }
                        j11 = tL_messageActionStarGift.convert_stars;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else {
                TL_stars.SavedStarGift savedStarGift = l6Var.f5487y2;
                if (savedStarGift != null) {
                    i3 = savedStarGift.date;
                    if ((savedStarGift.flags & 2) != 0 && !savedStarGift.name_hidden) {
                        j10 = org.telegram.messenger.m5.o(savedStarGift.from_id);
                    } else {
                        j10 = 2666000;
                    }
                    j11 = l6Var.f5487y2.convert_stars;
                    j12 = l6Var.Q1;
                } else {
                    return;
                }
            }
            int max = Math.max(1, (hp.s1(l6Var.f28583a).E6 - (ConnectionsManager.getInstance(l6Var.f28583a).getCurrentTime() - i3)) / 86400);
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, l6Var.getContext(), l6Var.J0);
            String M02 = bd.M0(2131750234, null);
            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
            s1Var.S = M02;
            if (!l10.A(j10) && j10 != 2666000) {
                M0 = org.telegram.messenger.m5.t(j10);
            } else {
                M0 = bd.M0(2131744959, null);
            }
            s1Var.U = org.telegram.messenger.g0.X2(bd.G(max, "Gift2ConvertText2", M0, bd.H(',', "Gift2ConvertStars", (int) j11)));
            final long j13 = j11;
            final long j14 = j12;
            alertDialog$Builder.k(bd.M0(2131750241, null), new org.telegram.ui.ActionBar.p1() {
                @Override
                public final void g(org.telegram.ui.ActionBar.s1 s1Var2, int i10) {
                    l6 l6Var2 = l6.this;
                    TL_stars.InputSavedStarGift inputSavedStarGift = B1;
                    long j15 = j14;
                    long j16 = e10;
                    long j17 = j13;
                    org.telegram.ui.ActionBar.s1 s1Var3 = new org.telegram.ui.ActionBar.s1(3, org.telegram.messenger.t0.f25457b, null);
                    s1Var3.r(500L);
                    TL_stars.convertStarGift convertstargift = new TL_stars.convertStarGift();
                    convertstargift.stargift = inputSavedStarGift;
                    ConnectionsManager.getInstance(l6Var2.f28583a).sendRequest(convertstargift, new i2(l6Var2, s1Var3, j15, j16, j17));
                }
            });
            k2.p1.v(null, 2131752589, alertDialog$Builder, null);
        }
    }

    public static void f1(l6 l6Var, org.telegram.ui.ActionBar.s1 s1Var, TL_stars.SavedStarGift savedStarGift) {
        if (savedStarGift != null) {
            s1Var.dismiss();
            l6Var.H2 = true;
            l6Var.j2(savedStarGift, null);
            super.show();
            return;
        }
        s1Var.dismiss();
        org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
        if (T != null) {
            org.telegram.ui.Components.ac Q = org.telegram.ui.Components.fc.a0(T).Q(2131624011, 36, bd.M0(2131748560, null));
            Q.f31802t = true;
            Q.j();
        }
    }

    public static SpannableStringBuilder f2(String str) {
        int i3;
        int i10;
        int indexOf = str.indexOf("**");
        int indexOf2 = str.indexOf("**", indexOf + 1);
        String replace = str.replace("**", "");
        if (indexOf >= 0 && indexOf2 >= 0 && (i10 = indexOf2 - indexOf) > 2) {
            i3 = i10 - 2;
        } else {
            indexOf = -1;
            i3 = 0;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(replace);
        if (indexOf >= 0) {
            spannableStringBuilder.setSpan(new k4(0), indexOf, i3 + indexOf, 0);
        }
        return spannableStringBuilder;
    }

    public static void g1(l6 l6Var, TL_stars.TL_payments_uniqueStarGift tL_payments_uniqueStarGift) {
        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) tL_payments_uniqueStarGift.gift;
        l6Var.C2 = tL_starGiftUnique;
        l6Var.k2(tL_starGiftUnique, false, null, null);
        super.show();
    }

    public static SpannableStringBuilder g2(String str) {
        if (str == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        SpannableString spannableString = new SpannableString("👌");
        spannableString.setSpan(new wp(2131231180, 0), 0, spannableString.length(), 33);
        SpannableString spannableString2 = new SpannableString("👍");
        spannableString2.setSpan(new wp(2131231164, 0), 0, spannableString2.length(), 33);
        org.telegram.messenger.g0.M2(spannableStringBuilder, spannableString, "👌");
        org.telegram.messenger.g0.M2(spannableStringBuilder, spannableString2, "👍");
        return spannableStringBuilder;
    }

    public static void h1(l6 l6Var, org.telegram.ui.ActionBar.s1 s1Var, zi ziVar) {
        s1Var.dismiss();
        l6Var.F2 = true;
        l6Var.i2(ziVar, null);
        super.show();
    }

    public static void i1(l6 l6Var, boolean z10) {
        int i3;
        Object obj;
        ai.j2 j2Var;
        ai.j2 j2Var2;
        ai.j2 j2Var3;
        int D1 = l6Var.D1();
        if (D1 >= 0) {
            if (z10) {
                i3 = 1;
            } else {
                i3 = -1;
            }
            int i10 = i3 + D1;
            int i11 = l6Var.N2;
            if (i11 >= 0 && (!z10 ? i11 < D1 : i11 > D1)) {
                i10 = i11;
            }
            w8 w8Var = l6Var.f5488z2;
            if (w8Var != null && i10 >= 0 && i10 < w8Var.e()) {
                obj = l6Var.f5488z2.get(i10);
            } else {
                obj = null;
            }
            if (obj != null) {
                if (z10) {
                    j2Var = l6Var.W1;
                } else {
                    j2Var = l6Var.V1;
                }
                if (j2Var != null) {
                    if (obj instanceof TL_stars.SavedStarGift) {
                        if (z10) {
                            j2Var3 = l6Var.W1;
                        } else {
                            j2Var3 = l6Var.V1;
                        }
                        if (u1(j2Var3.f5487y2, (TL_stars.SavedStarGift) obj)) {
                            return;
                        }
                    }
                    if (obj instanceof TL_stars.TL_starGiftUnique) {
                        if (z10) {
                            j2Var2 = l6Var.W1;
                        } else {
                            j2Var2 = l6Var.V1;
                        }
                        if (v1(j2Var2.C2, (TL_stars.TL_starGiftUnique) obj)) {
                            return;
                        }
                    }
                }
                ai.j2 j2Var4 = new ai.j2(l6Var, l6Var.getContext(), l6Var.f28583a, l6Var.Q1, l6Var.J0, l6Var.R1.getRootView());
                if (obj instanceof TL_stars.SavedStarGift) {
                    j2Var4.j2((TL_stars.SavedStarGift) obj, l6Var.f5488z2);
                } else if (obj instanceof TL_stars.TL_starGiftUnique) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj;
                    j2Var4.h2(tL_starGiftUnique.slug, tL_starGiftUnique, l6Var.f5488z2);
                }
                org.telegram.messenger.g0.E2(j2Var4.f28586b);
                if (z10) {
                    l6Var.W1 = j2Var4;
                } else {
                    l6Var.V1 = j2Var4;
                }
            }
        }
    }

    public static void k1(rx0 rx0Var, TL_stars.StarGiftAttribute starGiftAttribute) {
        String M0;
        if (starGiftAttribute instanceof TL_stars.starGiftAttributeModel) {
            M0 = bd.M0(2131750395, null);
        } else if (starGiftAttribute instanceof TL_stars.starGiftAttributePattern) {
            M0 = bd.M0(2131750388, null);
        } else if (starGiftAttribute instanceof TL_stars.starGiftAttributeBackdrop) {
            M0 = bd.M0(2131750396, null);
        } else {
            return;
        }
        String str = M0;
        Integer[] numArr = new Integer[1];
        rx0Var.e(str, starGiftAttribute.name, G1(starGiftAttribute.rarity, numArr), null, numArr[0]);
    }

    public static boolean u1(TL_stars.SavedStarGift savedStarGift, TL_stars.SavedStarGift savedStarGift2) {
        if (savedStarGift != savedStarGift2) {
            if (savedStarGift != null) {
                TL_stars.StarGift starGift = savedStarGift.gift;
                TL_stars.StarGift starGift2 = savedStarGift2.gift;
                if (starGift != starGift2) {
                    if ((starGift instanceof TL_stars.TL_starGiftUnique) && (starGift2 instanceof TL_stars.TL_starGiftUnique)) {
                        if (starGift.f27230id == starGift2.f27230id) {
                            return true;
                        }
                        return false;
                    } else if ((starGift instanceof TL_stars.TL_starGift) && (starGift2 instanceof TL_stars.TL_starGift) && starGift.f27230id == starGift2.f27230id && savedStarGift.date == savedStarGift2.date) {
                        return true;
                    } else {
                        return false;
                    }
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public static boolean v1(TL_stars.TL_starGiftUnique tL_starGiftUnique, TL_stars.TL_starGiftUnique tL_starGiftUnique2) {
        if (tL_starGiftUnique != tL_starGiftUnique2) {
            if (tL_starGiftUnique != null) {
                if (tL_starGiftUnique.f27230id == tL_starGiftUnique2.f27230id || TextUtils.equals(tL_starGiftUnique.slug, tL_starGiftUnique2.slug)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final TL_stars.InputSavedStarGift B1() {
        TLRPC.Message message;
        long B0;
        TLRPC.Message message2;
        long B02;
        TLRPC.Message message3;
        long j10 = this.Q1;
        if (j10 < 0) {
            TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat = new TL_stars.TL_inputSavedStarGiftChat();
            tL_inputSavedStarGiftChat.peer = hp.s1(this.f28583a).j1(j10);
            zi ziVar = this.A2;
            if (ziVar != null && (message3 = ziVar.f26868k) != null) {
                TLRPC.MessageAction messageAction = message3.action;
                if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                    TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                    if ((tL_messageActionStarGift.flags & 4096) == 0) {
                        return null;
                    }
                    tL_inputSavedStarGiftChat.saved_id = tL_messageActionStarGift.saved_id;
                    return tL_inputSavedStarGiftChat;
                } else if (!(messageAction instanceof TLRPC.TL_messageActionStarGiftUnique)) {
                    return null;
                } else {
                    TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
                    if ((tL_messageActionStarGiftUnique.flags & 128) == 0) {
                        return null;
                    }
                    tL_inputSavedStarGiftChat.saved_id = tL_messageActionStarGiftUnique.saved_id;
                    return tL_inputSavedStarGiftChat;
                }
            }
            TL_stars.SavedStarGift savedStarGift = this.f5487y2;
            if (savedStarGift != null) {
                if ((savedStarGift.flags & 2048) == 0) {
                    return null;
                }
                tL_inputSavedStarGiftChat.saved_id = savedStarGift.saved_id;
                return tL_inputSavedStarGiftChat;
            } else if (this.C2 != null && !TextUtils.isEmpty(this.B2)) {
                TL_stars.TL_inputSavedStarGiftSlug tL_inputSavedStarGiftSlug = new TL_stars.TL_inputSavedStarGiftSlug();
                tL_inputSavedStarGiftSlug.slug = this.B2;
                return tL_inputSavedStarGiftSlug;
            } else {
                return tL_inputSavedStarGiftChat;
            }
        }
        zi ziVar2 = this.A2;
        if (ziVar2 != null && (message2 = ziVar2.f26868k) != null) {
            TLRPC.MessageAction messageAction2 = message2.action;
            if ((messageAction2 instanceof TLRPC.TL_messageActionStarGift) && (messageAction2.flags & 4096) != 0) {
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift2 = (TLRPC.TL_messageActionStarGift) messageAction2;
                TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat2 = new TL_stars.TL_inputSavedStarGiftChat();
                hp s12 = hp.s1(this.f28583a);
                TLRPC.Peer peer = tL_messageActionStarGift2.peer;
                if (peer != null) {
                    B02 = org.telegram.messenger.m5.o(peer);
                } else {
                    B02 = zi.B0(this.A2.f26868k);
                }
                tL_inputSavedStarGiftChat2.peer = s12.j1(B02);
                tL_inputSavedStarGiftChat2.saved_id = tL_messageActionStarGift2.saved_id;
                return tL_inputSavedStarGiftChat2;
            }
        }
        if (ziVar2 != null && (message = ziVar2.f26868k) != null) {
            TLRPC.MessageAction messageAction3 = message.action;
            if ((messageAction3 instanceof TLRPC.TL_messageActionStarGiftUnique) && (messageAction3.flags & 128) != 0) {
                TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique2 = (TLRPC.TL_messageActionStarGiftUnique) messageAction3;
                TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat3 = new TL_stars.TL_inputSavedStarGiftChat();
                hp s13 = hp.s1(this.f28583a);
                TLRPC.Peer peer2 = tL_messageActionStarGiftUnique2.peer;
                if (peer2 != null) {
                    B0 = org.telegram.messenger.m5.o(peer2);
                } else {
                    B0 = zi.B0(this.A2.f26868k);
                }
                tL_inputSavedStarGiftChat3.peer = s13.j1(B0);
                tL_inputSavedStarGiftChat3.saved_id = tL_messageActionStarGiftUnique2.saved_id;
                return tL_inputSavedStarGiftChat3;
            }
        }
        TL_stars.TL_inputSavedStarGiftUser tL_inputSavedStarGiftUser = new TL_stars.TL_inputSavedStarGiftUser();
        zi ziVar3 = this.A2;
        if (ziVar3 != null) {
            TLRPC.Message message4 = ziVar3.f26868k;
            if (message4 != null) {
                TLRPC.MessageAction messageAction4 = message4.action;
                if ((messageAction4 instanceof TLRPC.TL_messageActionStarGift) && (messageAction4.flags & 32768) != 0) {
                    tL_inputSavedStarGiftUser.msg_id = ((TLRPC.TL_messageActionStarGift) messageAction4).gift_msg_id;
                    return tL_inputSavedStarGiftUser;
                }
            }
            tL_inputSavedStarGiftUser.msg_id = ziVar3.f1();
            return tL_inputSavedStarGiftUser;
        }
        TL_stars.SavedStarGift savedStarGift2 = this.f5487y2;
        if (savedStarGift2 != null) {
            tL_inputSavedStarGiftUser.msg_id = savedStarGift2.msg_id;
            return tL_inputSavedStarGiftUser;
        } else if (this.C2 != null && !TextUtils.isEmpty(this.B2)) {
            TL_stars.TL_inputSavedStarGiftSlug tL_inputSavedStarGiftSlug2 = new TL_stars.TL_inputSavedStarGiftSlug();
            tL_inputSavedStarGiftSlug2.slug = this.B2;
            return tL_inputSavedStarGiftSlug2;
        } else {
            return tL_inputSavedStarGiftUser;
        }
    }

    public final String C1() {
        TL_stars.StarGift y12 = y1();
        if ((y12 instanceof TL_stars.TL_starGiftUnique) && y12.slug != null) {
            return hp.s1(this.f28583a).V2 + "/nft/" + y12.slug;
        }
        return null;
    }

    public final int D1() {
        int indexOf;
        w8 w8Var = this.f5488z2;
        if (w8Var != null) {
            TL_stars.SavedStarGift savedStarGift = this.f5487y2;
            if (savedStarGift != null) {
                indexOf = w8Var.indexOf(savedStarGift);
            } else {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = this.C2;
                if (tL_starGiftUnique != null) {
                    indexOf = w8Var.indexOf(tL_starGiftUnique);
                } else {
                    return -1;
                }
            }
            if (indexOf >= 0) {
                return indexOf;
            }
            TL_stars.StarGift y12 = y1();
            for (int i3 = 0; i3 < this.f5488z2.e(); i3++) {
                Object obj = this.f5488z2.get(i3);
                if (obj instanceof TL_stars.SavedStarGift) {
                    TL_stars.SavedStarGift savedStarGift2 = this.f5487y2;
                    if (savedStarGift2 != null) {
                        if (u1(savedStarGift2, (TL_stars.SavedStarGift) obj)) {
                            return i3;
                        }
                    }
                    if (y12 != null) {
                        TL_stars.StarGift starGift = ((TL_stars.SavedStarGift) obj).gift;
                        if (y12 != starGift) {
                            if ((y12 instanceof TL_stars.TL_starGiftUnique) && (starGift instanceof TL_stars.TL_starGiftUnique) && y12.f27230id == starGift.f27230id) {
                            }
                        }
                        return i3;
                    }
                    continue;
                } else {
                    if ((obj instanceof TL_stars.TL_starGiftUnique) && v1(this.C2, (TL_stars.TL_starGiftUnique) obj)) {
                        return i3;
                    }
                }
            }
            return -1;
        }
        return -1;
    }

    @Override
    public final void E0(int i3) {
        super.E0(i3);
        org.telegram.messenger.g0.u3(this, 0, false, null);
    }

    public final TL_stars.SavedStarGift E1(boolean z10) {
        int i3;
        Object obj;
        int D1 = D1();
        if (D1 < 0) {
            return null;
        }
        if (z10) {
            i3 = 1;
        } else {
            i3 = -1;
        }
        int i10 = i3 + D1;
        int i11 = this.N2;
        if (i11 >= 0 && (!z10 ? i11 < D1 : i11 > D1)) {
            i10 = i11;
        }
        w8 w8Var = this.f5488z2;
        if (w8Var != null && i10 >= 0 && i10 < w8Var.e()) {
            obj = this.f5488z2.get(i10);
        } else {
            obj = null;
        }
        if (!(obj instanceof TL_stars.SavedStarGift)) {
            return null;
        }
        return (TL_stars.SavedStarGift) obj;
    }

    public final TL_stars.TL_starGiftUnique F1(boolean z10) {
        int i3;
        Object obj;
        int D1 = D1();
        if (D1 < 0) {
            return null;
        }
        if (z10) {
            i3 = 1;
        } else {
            i3 = -1;
        }
        int i10 = i3 + D1;
        int i11 = this.N2;
        if (i11 >= 0 && (!z10 ? i11 < D1 : i11 > D1)) {
            i10 = i11;
        }
        w8 w8Var = this.f5488z2;
        if (w8Var != null && i10 >= 0 && i10 < w8Var.e()) {
            obj = this.f5488z2.get(i10);
        } else {
            obj = null;
        }
        if (!(obj instanceof TL_stars.TL_starGiftUnique)) {
            return null;
        }
        return (TL_stars.TL_starGiftUnique) obj;
    }

    @Override
    public final boolean G() {
        if (this.U2.c(4)) {
            boolean z10 = this.Y1.N.f5230i0;
        }
        return false;
    }

    @Override
    public final boolean H() {
        if (this.U2.c(4) && this.Y1.N.f5230i0) {
            return false;
        }
        return this.f28592d0;
    }

    public final TL_stars.TL_starGiftUnique H1() {
        TL_stars.StarGift y12 = y1();
        if (y12 instanceof TL_stars.TL_starGiftUnique) {
            return (TL_stars.TL_starGiftUnique) y12;
        }
        return null;
    }

    @Override
    public final boolean I(MotionEvent motionEvent) {
        if (this.U2.c(4)) {
            boolean z10 = this.Y1.N.f5230i0;
        }
        return false;
    }

    public final boolean I1(boolean z10) {
        if (E1(z10) == null && F1(z10) == null) {
            return false;
        }
        return true;
    }

    public final void J1(byte[] bArr, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10, a3 a3Var) {
        TL_stars.getStarGiftWithdrawalUrl getstargiftwithdrawalurl;
        TL_stars.InputSavedStarGift B1 = B1();
        if (B1 == null) {
            if (a3Var != null) {
                a3Var.a(Boolean.FALSE);
                return;
            }
            return;
        }
        if (z10) {
            TL_stars.withdrawStarGift withdrawstargift = new TL_stars.withdrawStarGift();
            withdrawstargift.keep_on_profile = this.f5477q3;
            withdrawstargift.stargift = B1;
            withdrawstargift.tmp_password = bArr;
            getstargiftwithdrawalurl = withdrawstargift;
        } else {
            TL_stars.getStarGiftWithdrawalUrl getstargiftwithdrawalurl2 = new TL_stars.getStarGiftWithdrawalUrl();
            getstargiftwithdrawalurl2.stargift = B1;
            getstargiftwithdrawalurl2.tmp_password = bArr;
            getstargiftwithdrawalurl = getstargiftwithdrawalurl2;
        }
        ConnectionsManager.getInstance(this.f28583a).sendRequest(getstargiftwithdrawalurl, new o3(this, a3Var, twoStepVerificationActivity, z10, 0));
    }

    @Override
    public final sj0 L0(tj0 tj0Var) {
        r4 r4Var = new r4(this, 0);
        this.M2 = r4Var;
        return r4Var;
    }

    @Override
    public final int N0() {
        return org.telegram.messenger.g0.L(12.0f);
    }

    public final void N1() {
        throw new UnsupportedOperationException("Method not decompiled: ci.l6.N1():void");
    }

    @Override
    public final CharSequence O0() {
        return this.O2;
    }

    public final void O1() {
        g4 g4Var = this.S2;
        if (g4Var != null && !g4Var.J) {
            g4Var.dismiss();
        }
        String C1 = C1();
        g4 g4Var2 = new g4(this, getContext(), C1, C1, this.J0);
        this.S2 = g4Var2;
        g4Var2.f36887l2 = new c6.i(this, 10);
        g4Var2.show();
    }

    public final void P1() {
        throw new UnsupportedOperationException("Method not decompiled: ci.l6.P1():void");
    }

    public final void Q1(TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10) {
        int i3;
        int i10;
        int L;
        int i11;
        int i12;
        int L2;
        int i13;
        int i14;
        int i15;
        if (getContext() == null) {
            return;
        }
        if (tL_error == null) {
            if (twoStepVerificationActivity != null) {
                twoStepVerificationActivity.t0();
            }
            org.telegram.ui.Components.fc.b0("NULL_ERROR");
        } else if (!"PASSWORD_MISSING".equals(tL_error.text) && !tL_error.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error.text.startsWith("SESSION_TOO_FRESH_")) {
            if ("SRP_ID_INVALID".equals(tL_error.text)) {
                ConnectionsManager.getInstance(this.f28583a).sendRequest(new TL_account.getPassword(), new s3(this, twoStepVerificationActivity, z10, 1), 8);
                return;
            }
            if (twoStepVerificationActivity != null) {
                twoStepVerificationActivity.t0();
                twoStepVerificationActivity.finishFragment();
            }
            org.telegram.ui.Components.fc.d0(tL_error);
        } else {
            if (twoStepVerificationActivity != null) {
                twoStepVerificationActivity.t0();
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
            String M0 = bd.M0(2131749908, null);
            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
            s1Var.S = M0;
            LinearLayout linearLayout = new LinearLayout(getContext());
            linearLayout.setPadding(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(24.0f), 0);
            linearLayout.setOrientation(1);
            alertDialog$Builder.o(linearLayout);
            TextView textView = new TextView(getContext());
            int i16 = org.telegram.ui.ActionBar.k6.f27988j5;
            org.telegram.ui.ActionBar.r6.V(textView, i16, null);
            textView.setTextSize(1, 16.0f);
            if (bd.f21784a0) {
                i3 = 5;
            } else {
                i3 = 3;
            }
            textView.setGravity(i3 | 48);
            textView.setText(org.telegram.messenger.g0.X2(bd.M0(2131749912, null)));
            linearLayout.addView(textView, mf.o(-1, -2));
            LinearLayout linearLayout2 = new LinearLayout(getContext());
            linearLayout2.setOrientation(0);
            linearLayout.addView(linearLayout2, mf.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
            ImageView imageView = new ImageView(getContext());
            imageView.setImageResource(2131231623);
            if (bd.f21784a0) {
                i10 = org.telegram.messenger.g0.L(11.0f);
            } else {
                i10 = 0;
            }
            int L3 = org.telegram.messenger.g0.L(9.0f);
            if (bd.f21784a0) {
                L = 0;
            } else {
                L = org.telegram.messenger.g0.L(11.0f);
            }
            imageView.setPadding(i10, L3, L, 0);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            org.telegram.ui.ActionBar.r6.t(imageView, i16, null, mode);
            TextView textView2 = new TextView(getContext());
            org.telegram.ui.ActionBar.r6.V(textView2, i16, null);
            textView2.setTextSize(1, 16.0f);
            if (bd.f21784a0) {
                i11 = 5;
            } else {
                i11 = 3;
            }
            textView2.setGravity(i11 | 48);
            textView2.setText(org.telegram.messenger.g0.X2(bd.M0(2131749911, null)));
            if (bd.f21784a0) {
                linearLayout2.addView(textView2, mf.o(-1, -2));
                linearLayout2.addView(imageView, mf.r(-2, -2, 5));
            } else {
                linearLayout2.addView(imageView, mf.o(-2, -2));
                linearLayout2.addView(textView2, mf.o(-1, -2));
            }
            LinearLayout linearLayout3 = new LinearLayout(getContext());
            linearLayout3.setOrientation(0);
            linearLayout.addView(linearLayout3, mf.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
            ImageView imageView2 = new ImageView(getContext());
            imageView2.setImageResource(2131231623);
            if (bd.f21784a0) {
                i12 = org.telegram.messenger.g0.L(11.0f);
            } else {
                i12 = 0;
            }
            int L4 = org.telegram.messenger.g0.L(9.0f);
            if (bd.f21784a0) {
                L2 = 0;
            } else {
                L2 = org.telegram.messenger.g0.L(11.0f);
            }
            imageView2.setPadding(i12, L4, L2, 0);
            org.telegram.ui.ActionBar.r6.t(imageView2, i16, null, mode);
            TextView textView3 = new TextView(getContext());
            org.telegram.ui.ActionBar.r6.V(textView3, i16, null);
            textView3.setTextSize(1, 16.0f);
            if (bd.f21784a0) {
                i13 = 5;
            } else {
                i13 = 3;
            }
            textView3.setGravity(i13 | 48);
            textView3.setText(org.telegram.messenger.g0.X2(bd.M0(2131749910, null)));
            if (bd.f21784a0) {
                linearLayout3.addView(textView3, mf.o(-1, -2));
                i14 = 5;
                linearLayout3.addView(imageView2, mf.r(-2, -2, 5));
            } else {
                i14 = 5;
                linearLayout3.addView(imageView2, mf.o(-2, -2));
                linearLayout3.addView(textView3, mf.o(-1, -2));
            }
            if ("PASSWORD_MISSING".equals(tL_error.text)) {
                alertDialog$Builder.k(bd.M0(2131749907, null), new a3.j(this, 19));
                alertDialog$Builder.h(bd.M0(2131752589, null), null);
            } else {
                TextView textView4 = new TextView(getContext());
                org.telegram.ui.ActionBar.r6.V(textView4, i16, null);
                textView4.setTextSize(1, 16.0f);
                if (bd.f21784a0) {
                    i15 = i14;
                } else {
                    i15 = 3;
                }
                org.telegram.messenger.k5.m(textView4, i15 | 48, null, 2131749909);
                linearLayout.addView(textView4, mf.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                alertDialog$Builder.h(bd.M0(2131747839, null), null);
            }
            if (twoStepVerificationActivity != null) {
                twoStepVerificationActivity.showDialog(s1Var);
            } else {
                alertDialog$Builder.p();
            }
        }
    }

    public final void R1() {
        int i3;
        CharSequence V;
        long j10;
        String str;
        String str2;
        String str3;
        String str4;
        TL_wallet.nftItem nftitem;
        String str5;
        org.telegram.ui.Wallet.e5 e5Var = this.Z2;
        if (e5Var != null) {
            i3 = ((org.telegram.ui.ActionBar.d2) e5Var.f42474c).currentAccount;
            if (!org.telegram.ui.Wallet.b8.F(i3, e5Var.f42472a.slug)) {
                org.telegram.ui.Wallet.e5 e5Var2 = this.Z2;
                org.telegram.ui.Wallet.b8 b8Var = e5Var2.f42474c.f43331k0;
                if (b8Var == null || (nftitem = e5Var2.f42473b) == null || (str5 = nftitem.address) == null || !str5.equals(b8Var.Q0)) {
                    Context context = getContext();
                    int i10 = this.f28583a;
                    org.telegram.ui.Components.fc k10 = k();
                    org.telegram.ui.ActionBar.e6 e6Var = this.J0;
                    TL_stars.TL_starGiftUnique H1 = H1();
                    ArrayList arrayList = new ArrayList(((org.telegram.messenger.o0) hp.s1(i10).f23167x7.m0.f13688b).f24470c);
                    if (arrayList.isEmpty()) {
                        return;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    int size = arrayList.size();
                    boolean z10 = false;
                    int i11 = 0;
                    while (i11 < size) {
                        int i12 = i11 + 1;
                        String str6 = (String) arrayList.get(i11);
                        String str7 = "[^\\p{L}\\p{N}]";
                        String replaceAll = str6.replaceAll("[^\\p{L}\\p{N}]", "");
                        Locale locale = Locale.ROOT;
                        String lowerCase = replaceAll.toLowerCase(locale);
                        if (H1 != null && (str4 = H1.title) != null && lowerCase.equals(str4.replaceAll("[^\\p{L}\\p{N}]", "").toLowerCase(locale))) {
                            str = H1.title;
                            j10 = H1.gift_id;
                        } else {
                            e9 y9 = e9.y(i10, z10);
                            y9.U();
                            ArrayList arrayList3 = y9.H;
                            int size2 = arrayList3.size();
                            ArrayList arrayList4 = arrayList3;
                            int i13 = z10;
                            while (true) {
                                if (i13 < size2) {
                                    Object obj = arrayList4.get(i13);
                                    int i14 = i13 + 1;
                                    ArrayList arrayList5 = arrayList4;
                                    TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                                    if (starGift != null && (str3 = starGift.title) != null) {
                                        str2 = str7;
                                        if (lowerCase.equals(str3.replaceAll(str7, "").toLowerCase(Locale.ROOT))) {
                                            str = starGift.title;
                                            j10 = starGift.f27230id;
                                            break;
                                        }
                                    } else {
                                        str2 = str7;
                                    }
                                    i13 = i14;
                                    arrayList4 = arrayList5;
                                    str7 = str2;
                                } else {
                                    j10 = 0;
                                    str = null;
                                    break;
                                }
                            }
                        }
                        if (str == null) {
                            str = str6.replaceAll("(?<=[a-z0-9])(?=[A-Z])", " ");
                        }
                        SpannableString spannableString = new SpannableString(str);
                        spannableString.setSpan(new j4(new boolean[1], i10, context, e6Var, j10, str, str6), 0, spannableString.length(), 33);
                        arrayList2.add(spannableString);
                        z10 = false;
                        i11 = i12;
                        H1 = H1;
                    }
                    int i15 = z10 ? 1 : 0;
                    if (arrayList2.size() == 1) {
                        Object[] objArr = new Object[1];
                        objArr[i15] = arrayList2.get(i15);
                        V = bd.V(null, null, 2131743117, objArr);
                    } else {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        int i16 = i15;
                        for (int i17 = 1; i16 < arrayList2.size() - i17; i17 = 1) {
                            if (i16 > 0) {
                                spannableStringBuilder.append((CharSequence) ", ");
                            }
                            spannableStringBuilder.append((CharSequence) arrayList2.get(i16));
                            i16++;
                        }
                        Object h = k2.p1.h(1, arrayList2);
                        Object[] objArr2 = new Object[2];
                        objArr2[i15] = spannableStringBuilder;
                        objArr2[1] = h;
                        V = bd.V(null, null, 2131743118, objArr2);
                    }
                    org.telegram.ui.Components.ac M = k10.M(context.getResources().getDrawable(2131231094).mutate(), V);
                    org.telegram.ui.Components.fb fbVar = M.f31788e;
                    if (fbVar instanceof org.telegram.ui.Components.ib) {
                        TextView textView = ((org.telegram.ui.Components.ib) fbVar).f34651b;
                        textView.setMaxLines(Integer.MAX_VALUE);
                        textView.setEllipsize(null);
                    }
                    M.j();
                    return;
                }
            }
            org.telegram.ui.Wallet.e5 e5Var3 = this.Z2;
            dismiss();
            Objects.requireNonNull(e5Var3);
            org.telegram.messenger.g0.i3(new d1(e5Var3, 1), 250L);
        }
    }

    public final void S1() {
        if (h10.i(this.f28583a).q() && (M1(this.f28583a, H1()) || this.R2)) {
            t2(false);
            return;
        }
        TL_stars.TL_starGiftUnique H1 = H1();
        if (H1 == null) {
            return;
        }
        TLRPC.Peer peer = H1.owner_id;
        if (peer == null) {
            peer = H1.host_id;
        }
        long o10 = org.telegram.messenger.m5.o(peer);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(H1.title);
        sb2.append(" #");
        this.f5484v2.setText(bd.a0(null, null, 2131749841, k2.p1.l(H1.num, ',', sb2)));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(bd.M0(2131749843, null));
        if (!h10.i(this.f28583a).q()) {
            spannableStringBuilder.append((CharSequence) " l");
            if (this.Q2 == null) {
                this.Q2 = new wp(2131232243, 0);
            }
            spannableStringBuilder.setSpan(this.Q2, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        gi.d dVar = this.f5451d2;
        dVar.i(spannableStringBuilder, true, true);
        dVar.g(null, true);
        dVar.setOnClickListener(new r1(this, 4));
        this.Y1.setWearPreview(hp.s1(this.f28583a).e2(o10));
        s2(2, true, null);
    }

    public final void T1(boolean z10) {
        int i3;
        zi ziVar = this.A2;
        int i10 = 0;
        if (ziVar != null) {
            TLRPC.Message message = ziVar.f26868k;
            if (message != null) {
                TLRPC.MessageAction messageAction = message.action;
                if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                    i3 = ((TLRPC.TL_messageActionStarGiftUnique) messageAction).can_craft_at;
                }
            }
            i3 = 0;
        } else {
            TL_stars.SavedStarGift savedStarGift = this.f5487y2;
            if (savedStarGift != null) {
                i3 = savedStarGift.can_craft_at;
            }
            i3 = 0;
        }
        if (i3 > ConnectionsManager.getInstance(this.f28583a).getCurrentTime()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.J0);
            String M0 = bd.M0(2131749785, null);
            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
            s1Var.S = M0;
            s1Var.U = bd.a0(null, null, 2131749786, bd.x(i3, true));
            k2.p1.B(null, 2131747839, alertDialog$Builder, null);
            return;
        }
        TL_stars.TL_starGiftUnique H1 = H1();
        if (H1 == null) {
            return;
        }
        if (!TextUtils.isEmpty(H1.gift_address)) {
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, getContext(), this.J0);
            String M02 = bd.M0(2131749800, null);
            org.telegram.ui.ActionBar.s1 s1Var2 = alertDialog$Builder2.f27343a;
            s1Var2.S = M02;
            s1Var2.U = bd.M0(2131749801, null);
            k2.p1.B(null, 2131747839, alertDialog$Builder2, null);
            return;
        }
        f6 f6Var = this.Y1;
        if (z10) {
            f6Var.N.a(this.f28583a, H1.gift_id, H1.getDocument(), H1.title);
            if (o1()) {
                h5 h5Var = f6Var.N;
                TL_stars.TL_starGiftUnique H12 = H1();
                if (H12 == null) {
                    h5Var.getClass();
                } else {
                    while (true) {
                        f5[] f5VarArr = h5Var.f5234n;
                        if (i10 >= f5VarArr.length) {
                            break;
                        }
                        f5 f5Var = f5VarArr[i10];
                        TL_stars.StarGift starGift = f5Var.h;
                        if (starGift == null) {
                            starGift = null;
                        }
                        if (starGift == null) {
                            f5Var.a(H12, true);
                            break;
                        }
                        i10++;
                    }
                    h5Var.d(true);
                }
            }
        }
        h5 h5Var2 = f6Var.N;
        h5 h5Var3 = f6Var.N;
        h5Var2.setOnCraft(new y1(this, 1));
        if (this.P2 == null) {
            ai.g6 g6Var = new ai.g6(this.f28583a, H1.gift_id);
            this.P2 = g6Var;
            g6Var.a();
        }
        h5Var3.setOnAddGift(new z3(this, H1, 1));
        h5Var3.setOnClose(new s1(this, 23));
        s2(4, true, null);
    }

    public final void U1(long j10) {
        gi.l3 l3Var = this.f5479r3;
        if (l3Var != null) {
            l3Var.f(true);
            this.f5479r3 = null;
        }
        dismiss();
        org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
        if (T != null && !l10.A(j10)) {
            Bundle bundle = new Bundle();
            if (j10 > 0) {
                bundle.putLong("user_id", j10);
                if (j10 == h10.i(this.f28583a).e()) {
                    bundle.putBoolean("my_profile", true);
                }
            } else {
                bundle.putLong("chat_id", -j10);
            }
            bundle.putBoolean("open_gifts", true);
            T.presentFragment(new ProfileActivity(bundle, null));
        }
    }

    public final void V1(boolean z10, sf.b bVar, Runnable runnable) {
        int i3;
        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
        if (z10) {
            i3 = 3;
        } else {
            i3 = 2;
        }
        l3 l3Var = new l3(this, twoStepVerificationActivity, z10, 0);
        twoStepVerificationActivity.f42083a0 = i3;
        twoStepVerificationActivity.f42087c0 = l3Var;
        twoStepVerificationActivity.f42085b0 = z1();
        twoStepVerificationActivity.x0(new ai.k3(this, runnable, bVar, twoStepVerificationActivity, 15));
    }

    public final void W1() {
        throw new UnsupportedOperationException("Method not decompiled: ci.l6.W1():void");
    }

    public final void X1(long j10, long j11, boolean z10, u10 u10Var) {
        String str;
        TLRPC.User user;
        String a02;
        CharSequence M0;
        TL_stars.TL_starGiftUnique H1 = H1();
        if (H1 == null) {
            return;
        }
        if (j10 >= 0) {
            TLRPC.User a22 = hp.s1(this.f28583a).a2(Long.valueOf(j10));
            str = l10.k(a22);
            user = a22;
        } else {
            TLRPC.Chat M02 = hp.s1(this.f28583a).M0(Long.valueOf(-j10));
            if (M02 == null) {
                str = "";
                user = M02;
            } else {
                str = M02.title;
                user = M02;
            }
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.addView(new j5(getContext(), H1, user), mf.t(-1, -2, 48, 0, -4, 0, 0));
        TextView textView = new TextView(getContext());
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f27988j5, this.J0);
        textView.setTextSize(1, 16.0f);
        if (j11 > 0) {
            a02 = bd.K("Gift2TransferPriceText", (int) j11, ',', z1(), org.telegram.messenger.m5.t(j10));
        } else {
            a02 = bd.a0(null, null, 2131749921, z1(), str);
        }
        textView.setText(org.telegram.messenger.g0.X2(a02));
        linearLayout.addView(textView, mf.t(-1, -2, 48, 24, 4, 24, 4));
        rx0 rx0Var = new rx0(getContext(), this.J0);
        k1(rx0Var, e9.l(H1.attributes, TL_stars.starGiftAttributeModel.class));
        k1(rx0Var, e9.l(H1.attributes, TL_stars.starGiftAttributeBackdrop.class));
        k1(rx0Var, e9.l(H1.attributes, TL_stars.starGiftAttributePattern.class));
        if (!TextUtils.isEmpty(H1.slug) && (H1.flags & 256) != 0) {
            org.telegram.messenger.r1 i3 = org.telegram.messenger.r1.i();
            long j12 = H1.value_amount;
            String str2 = H1.value_currency;
            int h = org.telegram.messenger.r1.i().h(H1.value_currency);
            i3.getClass();
            rx0Var.c(bd.M0(2131749599, null), t4.c.f("~", org.telegram.messenger.r1.g(str2, h, j12, true)), null, null);
        }
        linearLayout.addView(rx0Var, mf.t(-1, -2, 48, 23, 16, 23, 4));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.J0);
        alertDialog$Builder.o(linearLayout);
        if (j11 > 0) {
            M0 = wb.T0(bd.a0(null, null, 2131749928, Integer.valueOf((int) j11)));
        } else {
            M0 = bd.M0(2131749929, null);
        }
        alertDialog$Builder.k(M0, new a1.c(u10Var, 13));
        alertDialog$Builder.h(bd.M0(2131752589, null), null);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
        s1Var.f28525a1 = z10;
        s1Var.show();
    }

    public final void Y1(long j10, u10 u10Var) {
        TLRPC.Message message;
        long j11;
        TL_stars.SavedStarGift savedStarGift = this.f5487y2;
        if (savedStarGift != null && (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
            j11 = savedStarGift.transfer_stars;
        } else {
            zi ziVar = this.A2;
            if (ziVar != null && (message = ziVar.f26868k) != null) {
                TLRPC.MessageAction messageAction = message.action;
                if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                    TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
                    if (tL_messageActionStarGiftUnique.gift instanceof TL_stars.TL_starGiftUnique) {
                        j11 = tL_messageActionStarGiftUnique.transfer_stars;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
        X1(j10, j11, true, u10Var);
    }

    @Override
    public final boolean Z0() {
        return false;
    }

    public final void Z1() {
        TL_stars.InputSavedStarGift B1;
        long j10;
        long j11;
        long j12;
        boolean z10;
        boolean z11;
        boolean z12;
        String str;
        boolean z13;
        boolean z14;
        int i3;
        gi.l3 l3Var = this.f5479r3;
        if (l3Var != null) {
            l3Var.f(true);
            this.f5479r3 = null;
        }
        if (this.V2 == null && (B1 = B1()) != null) {
            zi ziVar = this.A2;
            long j13 = this.Q1;
            if (ziVar != null) {
                TLRPC.MessageAction messageAction = ziVar.f26868k.action;
                if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                    TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                    j11 = tL_messageActionStarGift.gift.f27230id;
                    j12 = tL_messageActionStarGift.upgrade_stars;
                    z10 = tL_messageActionStarGift.name_hidden;
                    TLRPC.TL_textWithEntities tL_textWithEntities = tL_messageActionStarGift.message;
                    if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    j10 = 0;
                    z12 = tL_messageActionStarGift.peer instanceof TLRPC.TL_peerChannel;
                    str = tL_messageActionStarGift.prepaid_upgrade_hash;
                    if (tL_messageActionStarGift.prepaid_upgrade) {
                        if (org.telegram.messenger.m5.o(tL_messageActionStarGift.from_id) != this.A2.Z0()) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                    } else {
                        z13 = tL_messageActionStarGift.upgrade_separate;
                    }
                } else {
                    return;
                }
            } else {
                j10 = 0;
                TL_stars.SavedStarGift savedStarGift = this.f5487y2;
                if (savedStarGift != null) {
                    TL_stars.StarGift starGift = savedStarGift.gift;
                    j11 = starGift.f27230id;
                    j12 = savedStarGift.upgrade_stars;
                    if ((starGift instanceof TL_stars.TL_starGift) && savedStarGift.name_hidden) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    TLRPC.TL_textWithEntities tL_textWithEntities2 = savedStarGift.message;
                    if (tL_textWithEntities2 != null && !TextUtils.isEmpty(tL_textWithEntities2.text)) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (j13 < 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    TL_stars.SavedStarGift savedStarGift2 = this.f5487y2;
                    str = savedStarGift2.prepaid_upgrade_hash;
                    z13 = savedStarGift2.upgrade_separate;
                } else {
                    return;
                }
            }
            TextView textView = this.f5476q2;
            if (z10) {
                if (z12) {
                    i3 = 2131750406;
                } else {
                    i3 = 2131750407;
                }
                textView.setText(bd.M0(i3, null));
            } else if (z11) {
                textView.setText(bd.M0(2131750404, null));
            } else {
                textView.setText(bd.M0(2131750405, null));
            }
            if (!z10 && j12 > j10 && !z13) {
                z14 = true;
            } else {
                z14 = false;
            }
            wo woVar = this.f5474p2;
            woVar.a(z14, false);
            ArrayList arrayList = this.f5460h3;
            if (arrayList != null && (j12 > j10 || this.f5467l3 != null)) {
                a2();
                return;
            }
            if (arrayList == null) {
                e9.y(this.f28583a, false).K(j11, new k3(this, 2));
            }
            if (j12 <= j10 && this.f5467l3 == null) {
                this.f5465k3 = true;
                TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                if (!TextUtils.isEmpty(str)) {
                    TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade tL_inputInvoiceStarGiftPrepaidUpgrade = new TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade();
                    tL_inputInvoiceStarGiftPrepaidUpgrade.hash = str;
                    tL_inputInvoiceStarGiftPrepaidUpgrade.peer = hp.s1(this.f28583a).j1(j13);
                    tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftPrepaidUpgrade;
                } else {
                    TLRPC.TL_inputInvoiceStarGiftUpgrade tL_inputInvoiceStarGiftUpgrade = new TLRPC.TL_inputInvoiceStarGiftUpgrade();
                    tL_inputInvoiceStarGiftUpgrade.keep_original_details = woVar.f40035a.f31334q;
                    tL_inputInvoiceStarGiftUpgrade.stargift = B1;
                    tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftUpgrade;
                }
                JSONObject u10 = ii.a3.u(this.J0, false);
                if (u10 != null) {
                    TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                    tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                    tL_dataJSON.data = u10.toString();
                    tL_payments_getPaymentForm.flags |= 1;
                }
                ConnectionsManager.getInstance(this.f28583a).sendRequest(tL_payments_getPaymentForm, new c4(this, 0));
            }
        }
    }

    public final void a2() {
        throw new UnsupportedOperationException("Method not decompiled: ci.l6.a2():void");
    }

    public final void b2() {
        TL_stars.TL_starGiftUnique H1 = H1();
        if (this.Y2 != null && H1 != null && !TextUtils.isEmpty(H1.slug)) {
            Context context = getContext();
            int i3 = this.f28583a;
            xg.e1[] e1VarArr = {new xg.e1(context, i3, org.telegram.messenger.v1.a(i3).b(), 3, this.J0)};
            xg.e1 e1Var = e1VarArr[0];
            e1Var.f58690s2 = bd.M0(2131749922, null);
            org.telegram.ui.Components.ia iaVar = e1Var.m1;
            if (iaVar != null) {
                iaVar.setTitle(e1Var.O0());
            }
            gg0 gg0Var = e1Var.U1;
            if (gg0Var != null) {
                gg0Var.setText(e1Var.O0());
            }
            xg.e1 e1Var2 = e1VarArr[0];
            e1Var2.f58697z2 = true;
            e1Var2.o1(false, true);
            xg.e1 e1Var3 = e1VarArr[0];
            e1Var3.f58692u2 = new ai.o1(5, this, e1VarArr);
            e1Var3.show();
        }
    }

    public final SpannableStringBuilder d2(TLRPC.Peer peer) {
        if (peer != null) {
            String r5 = org.telegram.messenger.m5.r(hp.s1(this.f28583a).e2(org.telegram.messenger.m5.o(peer)));
            if (!TextUtils.isEmpty(r5)) {
                return org.telegram.messenger.g0.U2(bd.a0(null, null, 2131750051, t4.c.f("@", r5)), new m3(this, r5, 8));
            }
        }
        return null;
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == hs.G3) {
            if (this.f5488z2 == ((v8) objArr[1])) {
                h5 h5Var = this.Y1.N;
                if (h5Var == null || !h5Var.f5230i0) {
                    v2();
                }
            }
        }
    }

    @Override
    public final void dismiss() {
        if (this.U2.c(4) && this.Y1.N.f5230i0) {
            return;
        }
        ai.g6 g6Var = this.P2;
        if (g6Var != null) {
            g6Var.b();
            this.P2 = null;
        }
        u5 u5Var = this.I2;
        if (u5Var != null) {
            u5Var.a();
        }
        super.dismiss();
    }

    public final SpannableStringBuilder e2(TL_stars.StarGift starGift) {
        if (starGift != null && !(starGift instanceof TL_stars.TL_starGiftUnique)) {
            return d2(starGift.released_by);
        }
        return null;
    }

    public final void h2(String str, TL_stars.TL_starGiftUnique tL_starGiftUnique, w8 w8Var) {
        boolean z10;
        boolean z11;
        u5 u5Var;
        TL_stars.TL_starGiftUnique tL_starGiftUnique2;
        this.B2 = str;
        this.C2 = tL_starGiftUnique;
        this.f5488z2 = w8Var;
        if (tL_starGiftUnique.resell_amount != null && !K1(this.f28583a, org.telegram.messenger.m5.o(tL_starGiftUnique.owner_id))) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.D2 = z10;
        if (!this.J2 && (u5Var = this.I2) != null && u5Var.f6099o && (tL_starGiftUnique2 = u5Var.f6096l) != null && tL_starGiftUnique2.f27230id != tL_starGiftUnique.f27230id) {
            u5Var.a();
            this.I2 = null;
            f6 f6Var = this.Y1;
            f6Var.f5085b.setAlpha(1.0f);
            f6Var.f5087c.setAlpha(0.0f);
        }
        this.X1.b(this.f28583a, this.f5487y2);
        k2(tL_starGiftUnique, false, null, null);
        String str2 = tL_starGiftUnique.owner_address;
        String str3 = tL_starGiftUnique.gift_address;
        if (tL_starGiftUnique.host_id != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        TL_wallet.walletTransaction wallettransaction = this.f5449b3;
        s70 s70Var = this.f5446a2;
        if (wallettransaction == null && z11 && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            s70Var.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.g0.U2(bd.M0(2131750189, null), new m3(this, str3, 3)), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(0.66f)));
            s70Var.setVisibility(0);
            org.telegram.ui.ActionBar.r6.V(s70Var, org.telegram.ui.ActionBar.k6.f28120q5, this.J0);
        } else {
            s70Var.setVisibility(8);
        }
        TL_wallet.walletTransaction wallettransaction2 = this.f5449b3;
        s70 s70Var2 = this.c2;
        if (wallettransaction2 == null && !z11 && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            s70Var2.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.g0.U2(bd.M0(2131750189, null), new m3(this, str3, 4)), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(0.66f)));
            s70Var2.setVisibility(0);
        } else {
            s70Var2.setVisibility(8);
        }
        w2();
        if (this.D2) {
            l2(tL_starGiftUnique);
            this.f5451d2.setOnClickListener(new r1(this, 12));
        }
        if (this.X2) {
            s2(0, false, null);
            this.k1.n0(1);
            this.X2 = false;
        }
        v2();
    }

    public final void i2(org.telegram.messenger.zi r59, ci.w8 r60) {
        throw new UnsupportedOperationException("Method not decompiled: ci.l6.i2(org.telegram.messenger.zi, ci.w8):void");
    }

    public final void j1(TL_stars.StarGiftAttribute starGiftAttribute) {
        String M0;
        boolean z10;
        u5 u5Var;
        TL_stars.StarGiftAttribute starGiftAttribute2;
        l6 l6Var;
        ai.z3 z3Var;
        if (starGiftAttribute instanceof TL_stars.starGiftAttributeModel) {
            M0 = bd.M0(2131750395, null);
            z10 = true;
        } else if (starGiftAttribute instanceof TL_stars.starGiftAttributePattern) {
            M0 = bd.M0(2131750388, null);
            z10 = true;
        } else if (starGiftAttribute instanceof TL_stars.starGiftAttributeBackdrop) {
            M0 = bd.M0(2131750396, null);
            z10 = false;
        } else {
            return;
        }
        if (!this.J2 && ((u5Var = this.I2) == null || !u5Var.f6099o)) {
            boolean[] zArr = new boolean[1];
            org.telegram.ui.Components.hc[] hcVarArr = new org.telegram.ui.Components.hc[1];
            Integer[] numArr = new Integer[1];
            String G1 = G1(starGiftAttribute.rarity, numArr);
            if (starGiftAttribute.rarity instanceof TL_stars.TL_starGiftAttributeRarity) {
                starGiftAttribute2 = starGiftAttribute;
                l6Var = this;
                z3Var = new ai.z3(this, zArr, starGiftAttribute2, hcVarArr, 7);
            } else {
                starGiftAttribute2 = starGiftAttribute;
                l6Var = this;
                z3Var = null;
            }
            hcVarArr[0] = (org.telegram.ui.Components.hc) ((ox0) l6Var.f5448b2.e(M0, starGiftAttribute2.name, G1, z3Var, numArr[0]).getChildAt(1)).getChildAt(0);
            return;
        }
        z5 z5Var = new z5(getContext(), this.J0, new y1(this, 0));
        TableRow tableRow = new TableRow(getContext());
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
        rx0 rx0Var = this.f5448b2;
        tableRow.addView(new qx0(rx0Var, M0), layoutParams);
        tableRow.addView(new ox0(rx0Var, z5Var, true), new TableRow.LayoutParams(0, -1, 1.0f));
        rx0Var.addView(tableRow);
        u5 u5Var2 = this.I2;
        if (u5Var2 != null) {
            if (!z10) {
                u5Var2.d = z5Var;
            }
            if (z10) {
                u5Var2.f6089c = z5Var;
            }
            if (z10) {
                u5Var2.f6088b = z5Var;
            }
        }
    }

    public final void j2(org.telegram.tgnet.tl.TL_stars.SavedStarGift r36, ci.w8 r37) {
        throw new UnsupportedOperationException("Method not decompiled: ci.l6.j2(org.telegram.tgnet.tl.TL_stars$SavedStarGift, ci.w8):void");
    }

    @Override
    public org.telegram.ui.Components.fc k() {
        return new org.telegram.ui.Components.fc(this.f5461i2, this.J0);
    }

    public final void k2(org.telegram.tgnet.tl.TL_stars.TL_starGiftUnique r36, boolean r37, org.telegram.tgnet.TLObject r38, org.telegram.tgnet.TLRPC.TL_textWithEntities r39) {
        throw new UnsupportedOperationException("Method not decompiled: ci.l6.k2(org.telegram.tgnet.tl.TL_stars$TL_starGiftUnique, boolean, org.telegram.tgnet.TLObject, org.telegram.tgnet.TLRPC$TL_textWithEntities):void");
    }

    public final void l1(LinearLayout linearLayout, int i3, int i10, int i11, String str, boolean z10) {
        int i12;
        int i13;
        ImageView imageView = new ImageView(getContext());
        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(i3);
        org.telegram.ui.ActionBar.e6 e6Var = this.J0;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        org.telegram.ui.ActionBar.r6.t(imageView, i11, e6Var, mode);
        if (i10 < 15) {
            i12 = 1;
        } else {
            i12 = 0;
        }
        if (i10 < 15) {
            i13 = 1;
        } else {
            i13 = 0;
        }
        linearLayout.addView(imageView, mf.t(i10, i10, 16, i12, 0, i13, 0));
        TextView textView = new TextView(getContext());
        textView.setTextSize(1, 13.0f);
        int i14 = org.telegram.ui.ActionBar.k6.r5;
        org.telegram.ui.ActionBar.r6.V(textView, i14, this.J0);
        textView.setText(str);
        linearLayout.addView(textView, mf.t(-2, -2, 16, 4, 0, 0, 0));
        if (z10) {
            ImageView imageView2 = new ImageView(getContext());
            imageView2.setScaleType(scaleType);
            imageView2.setImageResource(2131232250);
            org.telegram.ui.ActionBar.r6.t(imageView2, i14, this.J0, mode);
            linearLayout.addView(imageView2, mf.t(11, 11, 16, 5, 0, 2, 0));
        }
    }

    public final void l2(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        dg.a resellAmount = tL_starGiftUnique.getResellAmount(dg.b.f8925a);
        boolean z10 = tL_starGiftUnique.resale_ton_only;
        gi.d dVar = this.f5451d2;
        if (z10) {
            dVar.i(wb.s1(wb.V0(bd.a0(null, null, 2131746156, tL_starGiftUnique.getResellAmount(dg.b.f8926b).d()), true), true), !this.X2, true);
            dVar.g(wb.T0(bd.H(',', "ResellGiftBuyEq", (int) resellAmount.a())), !this.X2);
            return;
        }
        dVar.i(wb.T0(bd.H(',', "ResellGiftBuy", (int) resellAmount.a())), !this.X2, true);
        dVar.g(null, !this.X2);
    }

    public final void m1(TL_stars.InputSavedStarGift inputSavedStarGift, TLRPC.Updates updates, Runnable runnable) {
        TLRPC.Message message;
        TL_stars.StarGift starGift;
        if (updates == null) {
            e9.y(this.f28583a, false).P(x1());
            dismiss();
            return;
        }
        TLRPC.Update update = updates.update;
        if (update instanceof TL_update.TL_updateNewMessage) {
            message = ((TL_update.TL_updateNewMessage) update).message;
        } else {
            if (updates.updates != null) {
                for (int i3 = 0; i3 < updates.updates.size(); i3++) {
                    TLRPC.Update update2 = updates.updates.get(i3);
                    if (update2 instanceof TL_update.TL_updateNewMessage) {
                        message = ((TL_update.TL_updateNewMessage) update2).message;
                        break;
                    }
                }
            }
            message = null;
        }
        if (message != null) {
            TL_stars.SavedStarGift savedStarGift = this.f5487y2;
            if (savedStarGift != null && (!(inputSavedStarGift instanceof TL_stars.TL_inputSavedStarGiftUser) ? !(!(inputSavedStarGift instanceof TL_stars.TL_inputSavedStarGiftChat) ? !(inputSavedStarGift instanceof TL_stars.TL_inputSavedStarGiftSlug) || (starGift = savedStarGift.gift) == null || !TextUtils.equals(starGift.slug, ((TL_stars.TL_inputSavedStarGiftSlug) inputSavedStarGift).slug) : savedStarGift.saved_id != ((TL_stars.TL_inputSavedStarGiftChat) inputSavedStarGift).saved_id) : savedStarGift.msg_id == ((TL_stars.TL_inputSavedStarGiftUser) inputSavedStarGift).msg_id)) {
                TLRPC.MessageAction messageAction = message.action;
                if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                    this.J2 = true;
                    TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
                    TL_stars.SavedStarGift savedStarGift2 = this.f5487y2;
                    savedStarGift2.gift = tL_messageActionStarGiftUnique.gift;
                    savedStarGift2.msg_id = message.f27022id;
                    savedStarGift2.flags = (savedStarGift2.flags | 8) & (-2049);
                    savedStarGift2.saved_id = 0L;
                    savedStarGift2.unsaved = !tL_messageActionStarGiftUnique.saved;
                    savedStarGift2.refunded = tL_messageActionStarGiftUnique.refunded;
                    savedStarGift2.can_upgrade = false;
                    savedStarGift2.can_resell_at = tL_messageActionStarGiftUnique.can_resell_at;
                    savedStarGift2.can_transfer_at = tL_messageActionStarGiftUnique.can_transfer_at;
                    savedStarGift2.can_export_at = tL_messageActionStarGiftUnique.can_export_at;
                    j2(savedStarGift2, this.f5488z2);
                    this.f5460h3 = null;
                    this.J2 = false;
                    w8 w8Var = this.f5488z2;
                    if (w8Var != null) {
                        w8Var.d();
                    } else {
                        e9.y(this.f28583a, false).P(this.Q1);
                    }
                    org.telegram.messenger.g0.h3(runnable);
                    return;
                }
            }
            if (this.f5488z2 == null) {
                e9.y(this.f28583a, false).P(x1());
            }
            this.J2 = true;
            this.f5487y2 = null;
            this.f5486x2 = false;
            zi ziVar = new zi(this.f28583a, message, false, false);
            ziVar.M5();
            i2(ziVar, this.f5488z2);
            this.f5460h3 = null;
            this.J2 = false;
            org.telegram.messenger.g0.h3(runnable);
            return;
        }
        e9.y(this.f28583a, false).P(x1());
        dismiss();
    }

    public final void m2(TL_stars.TL_starGiftUnique tL_starGiftUnique, boolean z10) {
        if (z10) {
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_peerUser.user_id = h10.i(this.f28583a).e();
            tL_starGiftUnique.host_id = tL_peerUser;
            tL_starGiftUnique.flags |= 4096;
        } else {
            tL_starGiftUnique.host_id = null;
            tL_starGiftUnique.flags &= -4097;
        }
        this.Y1.setWalletDisplayed(z10);
        w2();
    }

    public final boolean n1() {
        int i3;
        boolean z10;
        boolean z11;
        TLRPC.Peer peer;
        if (B1() == null) {
            return false;
        }
        zi ziVar = this.A2;
        if (ziVar != null) {
            TLRPC.MessageAction messageAction = ziVar.f26868k.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                if (tL_messageActionStarGift.peer != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                boolean Q3 = ziVar.Q3();
                if (zi.B0(this.A2.f26868k) == h10.i(this.f28583a).e()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                int currentTime = hp.s1(this.f28583a).E6 - (ConnectionsManager.getInstance(this.f28583a).getCurrentTime() - this.A2.f26868k.date);
                if (((z10 || (Q3 && !z11)) && ((peer = tL_messageActionStarGift.peer) == null || !L1(this.f28583a, org.telegram.messenger.m5.o(peer)))) || tL_messageActionStarGift.converted || tL_messageActionStarGift.convert_stars <= 0 || currentTime <= 0) {
                    return false;
                }
                return true;
            }
        } else {
            TL_stars.SavedStarGift savedStarGift = this.f5487y2;
            if (savedStarGift != null) {
                int currentTime2 = hp.s1(this.f28583a).E6 - (ConnectionsManager.getInstance(this.f28583a).getCurrentTime() - savedStarGift.date);
                int i10 = this.f28583a;
                long j10 = this.Q1;
                if (L1(i10, j10)) {
                    int i11 = this.f5487y2.flags;
                    if (j10 < 0) {
                        i3 = 2048;
                    } else {
                        i3 = 8;
                    }
                    if ((i3 & i11) != 0 && (i11 & 16) != 0 && (i11 & 2) != 0 && currentTime2 > 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void n2() {
        TL_stars.TL_starGiftUnique H1 = H1();
        if (H1 == null) {
            return;
        }
        TLRPC.Peer peer = H1.owner_id;
        if (peer == null) {
            peer = H1.host_id;
        }
        long o10 = org.telegram.messenger.m5.o(peer);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(H1.title);
        sb2.append(" #");
        this.f5484v2.setText(bd.a0(null, null, 2131749841, k2.p1.l(H1.num, ',', sb2)));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(bd.M0(2131749843, null));
        if (o10 == h10.i(this.f28583a).e() && !h10.i(this.f28583a).q()) {
            spannableStringBuilder.append((CharSequence) " l");
            if (this.Q2 == null) {
                this.Q2 = new wp(2131232243, 0);
            }
            spannableStringBuilder.setSpan(this.Q2, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        gi.d dVar = this.f5451d2;
        dVar.i(spannableStringBuilder, true, true);
        dVar.g(null, true);
        dVar.setOnClickListener(new r1(this, 27));
        this.Y1.setWearPreview(hp.s1(this.f28583a).e2(o10));
        s2(2, false, null);
        this.f5482t2 = true;
    }

    public final boolean o1() {
        int i3;
        TL_stars.TL_starGiftUnique H1 = H1();
        if (H1 == null || H1.crafted || !L1(this.f28583a, org.telegram.messenger.m5.o(H1.owner_id))) {
            return false;
        }
        zi ziVar = this.A2;
        if (ziVar != null) {
            TLRPC.Message message = ziVar.f26868k;
            if (message == null) {
                return false;
            }
            TLRPC.MessageAction messageAction = message.action;
            if (!(messageAction instanceof TLRPC.TL_messageActionStarGiftUnique)) {
                return false;
            }
            i3 = ((TLRPC.TL_messageActionStarGiftUnique) messageAction).can_craft_at;
        } else {
            TL_stars.SavedStarGift savedStarGift = this.f5487y2;
            if (savedStarGift != null && (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
                i3 = savedStarGift.can_craft_at;
            }
            return false;
        }
        int currentTime = ConnectionsManager.getInstance(this.f28583a).getCurrentTime();
        if (i3 <= 0 || currentTime < i3) {
            return false;
        }
        return true;
    }

    public final void o2(CharSequence charSequence) {
        TL_stars.TL_starGiftUnique H1 = H1();
        TL_stars.InputSavedStarGift B1 = B1();
        if (B1 != null && H1 != null) {
            TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails tL_inputInvoiceStarGiftDropOriginalDetails = new TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails();
            tL_inputInvoiceStarGiftDropOriginalDetails.stargift = B1;
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftDropOriginalDetails;
            JSONObject u10 = ii.a3.u(this.J0, false);
            if (u10 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = u10.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            ConnectionsManager.getInstance(this.f28583a).sendRequest(tL_payments_getPaymentForm, new ai.q1(this, charSequence, H1, tL_inputInvoiceStarGiftDropOriginalDetails, 2));
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        hs.f(this.f28583a).c(this, hs.G3);
    }

    @Override
    public final void onBackPressed() {
        f6 f6Var;
        h5 h5Var;
        if (this.U2.c(4) && (f6Var = this.Y1) != null && (h5Var = f6Var.N) != null) {
            if (h5Var.f5230i0) {
                return;
            }
            if (h5Var.f5231j0) {
                super.onBackPressed();
                return;
            }
        }
        if (!this.f5482t2 && this.U2.f5382c > 0 && !this.f5451d2.R && !this.f5458g3) {
            zi ziVar = this.A2;
            if (ziVar != null) {
                i2(ziVar, null);
            } else {
                TL_stars.SavedStarGift savedStarGift = this.f5487y2;
                if (savedStarGift != null) {
                    j2(savedStarGift, this.f5488z2);
                } else {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = this.C2;
                    if (tL_starGiftUnique != null) {
                        h2(this.B2, tL_starGiftUnique, this.f5488z2);
                    }
                }
            }
            s2(0, true, null);
            return;
        }
        super.onBackPressed();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        hs.f(this.f28583a).n(this, hs.G3);
    }

    public final boolean p1() {
        throw new UnsupportedOperationException("Method not decompiled: ci.l6.p1():boolean");
    }

    public final void p2(View view, CharSequence charSequence, boolean z10) {
        Layout layout;
        org.telegram.ui.Components.ic icVar;
        float primaryHorizontal;
        int i3;
        gi.l3 l3Var = this.f5479r3;
        if ((l3Var == null || !l3Var.W || this.f5481s3 != view) && view != null) {
            if (z10) {
                if (view instanceof org.telegram.ui.ActionBar.k5) {
                    org.telegram.ui.ActionBar.k5 k5Var = (org.telegram.ui.ActionBar.k5) view;
                    primaryHorizontal = (k5Var.getRightDrawableWidth() / 2.0f) + k5Var.getRightDrawableX();
                } else {
                    return;
                }
            } else {
                if (view instanceof TextView) {
                    layout = ((TextView) view).getLayout();
                } else if (view instanceof org.telegram.ui.ActionBar.k5) {
                    layout = ((org.telegram.ui.ActionBar.k5) view).getLayout();
                } else {
                    return;
                }
                if (layout != null) {
                    CharSequence text = layout.getText();
                    if (text instanceof Spanned) {
                        Spanned spanned = (Spanned) text;
                        org.telegram.ui.Components.ic[] icVarArr = (org.telegram.ui.Components.ic[]) spanned.getSpans(0, spanned.length(), org.telegram.ui.Components.ic.class);
                        if (icVarArr != null && icVarArr.length > 0) {
                            primaryHorizontal = layout.getPrimaryHorizontal(spanned.getSpanStart(icVarArr[icVarArr.length - 1])) + view.getPaddingLeft() + (icVar.a() / 2.0f);
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            int[] iArr = new int[2];
            view.getLocationOnScreen(r5);
            t4 t4Var = this.R1;
            t4Var.getLocationOnScreen(iArr);
            int[] iArr2 = {iArr2[0] - iArr[0], iArr2[1] - iArr[1]};
            gi.l3 l3Var2 = this.f5479r3;
            if (l3Var2 != null) {
                l3Var2.f(true);
                this.f5479r3 = null;
            }
            gi.l3 l3Var3 = new gi.l3(getContext(), 3);
            l3Var3.r(!z10);
            l3Var3.u(charSequence);
            l3Var3.p(0.0f, (iArr2[0] + primaryHorizontal) - (org.telegram.messenger.g0.L(16.0f) + this.f28618u0));
            float L = (iArr2[1] - org.telegram.messenger.g0.L(100.0f)) - (view.getHeight() / 2.0f);
            if (z10) {
                i3 = 18;
            } else {
                i3 = 0;
            }
            l3Var3.setTranslationY(L + org.telegram.messenger.g0.L(i3 + 4.33f));
            l3Var3.d = 3000L;
            l3Var3.setPadding(org.telegram.messenger.g0.L(16.0f) + this.f28618u0, 0, org.telegram.messenger.g0.L(16.0f) + this.f28618u0, 0);
            l3Var3.f13100r0 = new ai.i0(l3Var3, 1);
            l3Var3.w();
            t4Var.addView(l3Var3, mf.c(100.0f, -1));
            this.f5479r3 = l3Var3;
            this.f5481s3 = view;
        }
    }

    public final void q1() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.J0);
        String M0 = bd.M0(2131750274, null);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
        s1Var.S = M0;
        s1Var.U = bd.M0(2131750275, null);
        TL_stars.TL_starGiftUnique H1 = H1();
        if (H1 != null && !TextUtils.isEmpty(H1.slug)) {
            alertDialog$Builder.k(bd.M0(2131747813, null), new y3(this, H1, 1));
        }
        k2.p1.v(null, 2131752589, alertDialog$Builder, null);
    }

    public final void q2(int i3, Context context, boolean z10) {
        int i10;
        int i11;
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        FrameLayout frameLayout = new FrameLayout(context);
        int L = org.telegram.messenger.g0.L(64.0f);
        int i12 = org.telegram.ui.ActionBar.k6.Ci;
        ShapeDrawable L2 = org.telegram.ui.ActionBar.k6.L(L, org.telegram.ui.ActionBar.k6.w0(i12, this.J0));
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i12);
        org.telegram.ui.ActionBar.e6 e6Var = this.J0;
        frameLayout.setBackground(L2);
        org.telegram.ui.ActionBar.r6.k(frameLayout, L2, N, null, e6Var);
        f10.addView(frameLayout, mf.t(64, 64, 49, 0, 6, 0, 0));
        ?? imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.f(2131624291, 42, 42, null);
        frameLayout.addView((View) imageView, mf.r(64, 64, 17));
        imageView.d();
        TextView b10 = rf.b(context, 20.0f, org.telegram.ui.ActionBar.k6.G6, true, null);
        b10.setGravity(17);
        if (z10) {
            i10 = 2131750013;
        } else {
            i10 = 2131749919;
        }
        b10.setText(bd.M0(i10, null));
        f10.addView(b10, mf.t(-1, -2, 48, 24, 14, 24, 0));
        TextView b11 = rf.b(context, 14.0f, org.telegram.ui.ActionBar.k6.F6, false, null);
        b11.setGravity(17);
        if (z10) {
            i11 = 2131750014;
        } else {
            i11 = 2131749920;
        }
        b11.setText(bd.a0(null, null, i11, bd.c0(Math.max(10, i3))));
        f10.addView(b11, mf.t(-1, -2, 48, 24, 6, 24, 6));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, this.J0);
        alertDialog$Builder.o(f10);
        alertDialog$Builder.k(bd.M0(2131747839, null), null);
        alertDialog$Builder.p();
    }

    @Override
    public final void r0() {
        gi.l3 l3Var = this.f5479r3;
        if (l3Var != null) {
            l3Var.f(true);
            this.f5479r3 = null;
        }
    }

    public final void r1(long j10, TL_stars.starGiftDepositPayload stargiftdepositpayload, sf.b bVar, xg.e1 e1Var) {
        TL_wallet.nftItem nftitem = this.Y2;
        TL_stars.TL_starGiftUnique H1 = H1();
        if (nftitem != null && H1 != null && !TextUtils.isEmpty(H1.slug)) {
            bVar.d();
            d3 d3Var = new d3(this, bVar, e1Var, j10, H1, nftitem, 0);
            if (stargiftdepositpayload != null) {
                d3Var.a(stargiftdepositpayload);
                return;
            }
            TL_stars.depositStarGift depositstargift = new TL_stars.depositStarGift();
            depositstargift.peer = hp.s1(this.f28583a).j1(j10);
            depositstargift.slug = H1.slug;
            ConnectionsManager.getInstance(this.f28583a).sendRequestTyped(depositstargift, new c3.b(1), new h2(this, bVar, e1Var, d3Var, 1));
        }
    }

    public final void r2(boolean z10, org.telegram.ui.ActionBar.s1 s1Var, sf.b bVar, Runnable runnable) {
        bVar.d();
        h10 i3 = h10.i(this.f28583a);
        TL_account.tmpPassword tmppassword = i3.f22859y;
        if (tmppassword != null && tmppassword.valid_until < ConnectionsManager.getInstance(this.f28583a).getCurrentTime() + 60) {
            i3.f22859y = null;
            i3.v(false);
        }
        TL_account.tmpPassword tmppassword2 = i3.f22859y;
        if (tmppassword2 == null) {
            V1(z10, bVar, runnable);
        } else {
            J1(tmppassword2.tmp_password, null, z10, new a3(this, z10, bVar, runnable, s1Var));
        }
    }

    @Override
    public final void s0() {
        super.s0();
        try {
            P(org.telegram.ui.ActionBar.k6.f27954h5);
            f6 f6Var = this.Y1;
            if (f6Var != null) {
                f6Var.l();
            }
            wp wpVar = this.W2;
            if (wpVar != null) {
                Drawable drawable = wpVar.f40041c;
                if (drawable instanceof g6) {
                    ((g6) drawable).d.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ci, this.J0));
                    gi.d dVar = this.f5451d2;
                    if (dVar != null) {
                        dVar.invalidate();
                    }
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void s1(final long j10, final u10 u10Var) {
        TLRPC.Message message;
        long o10;
        long j11;
        TL_stars.InputSavedStarGift B1 = B1();
        if (B1 != null) {
            TL_stars.SavedStarGift savedStarGift = this.f5487y2;
            if (savedStarGift != null && (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
                j11 = savedStarGift.transfer_stars;
                o10 = this.Q1;
            } else {
                zi ziVar = this.A2;
                if (ziVar != null && (message = ziVar.f26868k) != null) {
                    TLRPC.MessageAction messageAction = message.action;
                    if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                        TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
                        o10 = org.telegram.messenger.m5.o(tL_messageActionStarGiftUnique.gift.owner_id);
                        j11 = tL_messageActionStarGiftUnique.transfer_stars;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            if (j11 <= 0) {
                TL_stars.transferStarGift transferstargift = new TL_stars.transferStarGift();
                transferstargift.stargift = B1;
                transferstargift.to_id = hp.s1(this.f28583a).j1(j10);
                final long j12 = o10;
                ConnectionsManager.getInstance(this.f28583a).sendRequest(transferstargift, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        boolean z10 = tLObject instanceof TLRPC.Updates;
                        l6 l6Var = l6.this;
                        if (z10) {
                            hp.s1(l6Var.f28583a).O3((TLRPC.Updates) tLObject, false);
                        }
                        org.telegram.messenger.g0.h3(new v2(l6Var, u10Var, tL_error, tLObject, j10, j12));
                    }
                });
                return;
            }
            final long j13 = o10;
            e9 y9 = e9.y(this.f28583a, false);
            if (!y9.f5032e) {
                y9.r(new l2(this, y9, j10, u10Var, 0));
                return;
            }
            final TLRPC.TL_inputInvoiceStarGiftTransfer tL_inputInvoiceStarGiftTransfer = new TLRPC.TL_inputInvoiceStarGiftTransfer();
            tL_inputInvoiceStarGiftTransfer.stargift = B1;
            tL_inputInvoiceStarGiftTransfer.to_id = hp.s1(this.f28583a).j1(j10);
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftTransfer;
            JSONObject u10 = ii.a3.u(this.J0, false);
            if (u10 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = u10.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            ConnectionsManager.getInstance(this.f28583a).sendRequest(tL_payments_getPaymentForm, new RequestDelegate() {
                @Override
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    final l6 l6Var = l6.this;
                    final TLRPC.TL_inputInvoiceStarGiftTransfer tL_inputInvoiceStarGiftTransfer2 = tL_inputInvoiceStarGiftTransfer;
                    final long j14 = j10;
                    final long j15 = j13;
                    final u10 u10Var2 = u10Var;
                    org.telegram.messenger.g0.h3(new Runnable() {
                        @Override
                        public final void run() {
                            TLObject tLObject2 = tLObject;
                            boolean z10 = tLObject2 instanceof TLRPC.PaymentForm;
                            l6 l6Var2 = l6.this;
                            u10 u10Var3 = u10Var2;
                            if (z10) {
                                TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject2;
                                int i3 = 0;
                                hp.s1(l6Var2.f28583a).Y3(paymentForm.users, false);
                                TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
                                tL_payments_sendStarsForm.form_id = paymentForm.form_id;
                                tL_payments_sendStarsForm.invoice = tL_inputInvoiceStarGiftTransfer2;
                                ArrayList<TLRPC.TL_labeledPrice> arrayList = paymentForm.invoice.prices;
                                int size = arrayList.size();
                                long j16 = 0;
                                while (i3 < size) {
                                    TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i3);
                                    i3++;
                                    j16 += tL_labeledPrice.amount;
                                }
                                ConnectionsManager.getInstance(l6Var2.f28583a).sendRequest(tL_payments_sendStarsForm, new i2(l6Var2, j14, j15, u10Var3, j16));
                                return;
                            }
                            TLRPC.TL_error tL_error2 = tL_error;
                            u10Var3.a(tL_error2);
                            org.telegram.ui.Components.ac Y = l6Var2.k().Y(tL_error2);
                            Y.f31802t = true;
                            Y.j();
                        }
                    });
                }
            });
        }
    }

    public final void s2(int r12, boolean r13, ci.e1 r14) {
        throw new UnsupportedOperationException("Method not decompiled: ci.l6.s2(int, boolean, ci.e1):void");
    }

    @Override
    public final void show() {
        zi ziVar;
        TLRPC.Message message;
        if (hp.s1(this.f28583a).v2()) {
            org.telegram.ui.b.b(this.f28583a);
            return;
        }
        if (this.B2 != null && this.C2 == null) {
            org.telegram.ui.ActionBar.s1 s1Var = new org.telegram.ui.ActionBar.s1(3, getContext(), null);
            s1Var.r(500L);
            TL_stars.getUniqueStarGift getuniquestargift = new TL_stars.getUniqueStarGift();
            getuniquestargift.slug = this.B2;
            ConnectionsManager.getInstance(this.f28583a).sendRequest(getuniquestargift, new ai.f3(4, this, s1Var));
        } else if (this.f5487y2 == null && (ziVar = this.A2) != null && (message = ziVar.f26868k) != null) {
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                if (tL_messageActionStarGift.upgraded) {
                    if (tL_messageActionStarGift.upgrade_msg_id != 0) {
                        org.telegram.ui.ActionBar.s1 s1Var2 = new org.telegram.ui.ActionBar.s1(3, getContext(), null);
                        s1Var2.r(500L);
                        TLRPC.TL_messages_getMessages tL_messages_getMessages = new TLRPC.TL_messages_getMessages();
                        tL_messages_getMessages.f27097id.add(Integer.valueOf(tL_messageActionStarGift.upgrade_msg_id));
                        ConnectionsManager.getInstance(this.f28583a).sendRequest(tL_messages_getMessages, new ai.r6(this, tL_messageActionStarGift, s1Var2, 1));
                        return;
                    } else if (B1() != null) {
                        org.telegram.ui.ActionBar.s1 s1Var3 = new org.telegram.ui.ActionBar.s1(3, getContext(), null);
                        s1Var3.r(500L);
                        e9.y(this.f28583a, false).M(B1(), new ai.o1(6, this, s1Var3));
                        return;
                    }
                }
            }
        }
        super.show();
    }

    public final void t1() {
        TL_stars.InputSavedStarGift B1;
        long j10;
        gi.d dVar = this.f5451d2;
        if (!dVar.R && (B1 = B1()) != null) {
            zi ziVar = this.A2;
            String str = null;
            long j11 = 0;
            if (ziVar != null) {
                TLRPC.MessageAction messageAction = ziVar.f26868k.action;
                if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                    TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                    j10 = tL_messageActionStarGift.upgrade_stars;
                    if (j10 <= 0) {
                        str = tL_messageActionStarGift.prepaid_upgrade_hash;
                    }
                } else {
                    return;
                }
            } else {
                TL_stars.SavedStarGift savedStarGift = this.f5487y2;
                if (savedStarGift != null) {
                    j10 = savedStarGift.upgrade_stars;
                    if (j10 <= 0) {
                        str = savedStarGift.prepaid_upgrade_hash;
                    }
                } else {
                    return;
                }
            }
            int i3 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
            if (i3 > 0 || this.f5467l3 != null) {
                dVar.setLoading(true);
                wo woVar = this.f5474p2;
                if (i3 > 0) {
                    TL_stars.upgradeStarGift upgradestargift = new TL_stars.upgradeStarGift();
                    upgradestargift.keep_original_details = woVar.f40035a.f31334q;
                    upgradestargift.stargift = B1;
                    ConnectionsManager.getInstance(this.f28583a).sendRequest(upgradestargift, new ai.f3(6, this, B1));
                    return;
                }
                int i10 = 0;
                e9 y9 = e9.y(this.f28583a, false);
                if (!y9.f5032e) {
                    y9.r(new e0(5, this, y9));
                    return;
                }
                TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
                tL_payments_sendStarsForm.form_id = this.f5467l3.form_id;
                if (!TextUtils.isEmpty(str)) {
                    TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade tL_inputInvoiceStarGiftPrepaidUpgrade = new TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade();
                    tL_inputInvoiceStarGiftPrepaidUpgrade.hash = str;
                    tL_inputInvoiceStarGiftPrepaidUpgrade.peer = hp.s1(this.f28583a).j1(this.Q1);
                    tL_payments_sendStarsForm.invoice = tL_inputInvoiceStarGiftPrepaidUpgrade;
                } else {
                    TLRPC.TL_inputInvoiceStarGiftUpgrade tL_inputInvoiceStarGiftUpgrade = new TLRPC.TL_inputInvoiceStarGiftUpgrade();
                    tL_inputInvoiceStarGiftUpgrade.keep_original_details = woVar.f40035a.f31334q;
                    tL_inputInvoiceStarGiftUpgrade.stargift = B1;
                    tL_payments_sendStarsForm.invoice = tL_inputInvoiceStarGiftUpgrade;
                }
                ArrayList<TLRPC.TL_labeledPrice> arrayList = this.f5467l3.invoice.prices;
                int size = arrayList.size();
                while (i10 < size) {
                    TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i10);
                    i10++;
                    j11 += tL_labeledPrice.amount;
                }
                ConnectionsManager.getInstance(this.f28583a).sendRequest(tL_payments_sendStarsForm, new a0(this, str, B1, j11, 1));
            }
        }
    }

    public final void t2(boolean z10) {
        boolean z11;
        int i3;
        int i10;
        TL_stars.TL_starGiftUnique H1 = H1();
        if (H1 == null) {
            return;
        }
        hp.e1().edit().putInt("statusgiftpage", 3).apply();
        boolean M1 = M1(this.f28583a, H1());
        boolean z12 = !M1;
        boolean M12 = M1(this.f28583a, H1());
        gi.d dVar = this.f5451d2;
        if (M12) {
            hp.s1(this.f28583a).g5(x1(), new TLRPC.TL_emojiStatusEmpty(), null);
            z11 = z12;
        } else {
            z11 = z12;
            long x12 = x1();
            if (x12 >= 0) {
                if (!h10.i(this.f28583a).q()) {
                    org.telegram.ui.Components.ac P = k().P(2131624216, org.telegram.messenger.g0.x2(bd.M0(2131750431, null), new s1(this, 2)));
                    P.f31802t = true;
                    P.j();
                    return;
                }
            } else if (!z10) {
                hp s12 = hp.s1(this.f28583a);
                dVar.setLoading(true);
                hp.s1(this.f28583a).G0().a(x12, new u1(this, s12, x12, 0));
                return;
            }
            TLRPC.TL_inputEmojiStatusCollectible tL_inputEmojiStatusCollectible = new TLRPC.TL_inputEmojiStatusCollectible();
            tL_inputEmojiStatusCollectible.collectible_id = H1.f27230id;
            hp.s1(this.f28583a).g5(x1(), tL_inputEmojiStatusCollectible, H1);
        }
        ai.c0 c0Var = this.Y1.J[1];
        if (!M1) {
            i3 = 2131231102;
        } else {
            i3 = 2131231103;
        }
        if (!M1) {
            i10 = 2131750430;
        } else {
            i10 = 2131750433;
        }
        c0Var.e(i3, bd.M0(i10, null), true);
        if (this.f5482t2) {
            dismiss();
            return;
        }
        e1 e1Var = new e1(1, this, z11);
        if (this.U2.c(0)) {
            e1Var.run();
        } else {
            s2(0, true, e1Var);
        }
        dVar.i(bd.M0(2131747839, null), !this.X2, true);
        dVar.g(null, !this.X2);
        dVar.setOnClickListener(new r1(this, 5));
    }

    public final void u2() {
        FrameLayout frameLayout = this.f5457g2;
        int visibility = frameLayout.getVisibility();
        FrameLayout frameLayout2 = this.f5461i2;
        FrameLayout frameLayout3 = this.f5453e2;
        if (visibility == 0) {
            frameLayout3.setTranslationY(this.U2.a(1) * (-frameLayout.getMeasuredHeight()));
            frameLayout.setTranslationY((1.0f - this.U2.a(1)) * frameLayout.getMeasuredHeight());
            frameLayout2.setTranslationY(this.U2.a(1) * (-frameLayout.getMeasuredHeight()));
            return;
        }
        frameLayout3.setTranslationY(0.0f);
        frameLayout.setTranslationY(0.0f);
        frameLayout2.setTranslationY(0.0f);
    }

    public final void v2() {
        boolean I1 = I1(false);
        n4 n4Var = this.S1;
        n4Var.setPosition(I1 ? 1 : 0);
        n4Var.C(false);
        if (this.f5488z2 != null && !I1(true) && this.f5488z2.e() < this.f5488z2.c()) {
            this.f5488z2.a();
        }
    }

    public final int w1() {
        if (this.U2.d(1)) {
            return this.f5466l2.getMeasuredHeight();
        }
        if (this.U2.d(2)) {
            return this.f5483u2.getMeasuredHeight();
        }
        if (this.U2.d(3)) {
            return this.f5485w2.getMeasuredHeight();
        }
        if (this.U2.d(4)) {
            return 0;
        }
        return this.Z1.getMeasuredHeight();
    }

    public final void w2() {
        TL_stars.TL_starGiftUnique H1 = H1();
        TL_wallet.nftItem nftitem = this.Y2;
        LinearLayout linearLayout = this.f5478r2;
        if (nftitem != null && H1 != null) {
            this.f5446a2.setVisibility(8);
            this.c2.setVisibility(8);
            boolean z10 = false;
            linearLayout.setVisibility(0);
            if (H1.host_id != null) {
                z10 = true;
            }
            this.f5480s2.a(z10, linearLayout.isAttachedToWindow());
            return;
        }
        linearLayout.setVisibility(8);
    }

    public final long x1() {
        TLRPC.Peer peer;
        zi ziVar = this.A2;
        if (ziVar != null) {
            TLRPC.Message message = ziVar.f26868k;
            if (message != null) {
                TLRPC.MessageAction messageAction = message.action;
                if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                    TLRPC.Peer peer2 = ((TLRPC.TL_messageActionStarGift) messageAction).peer;
                    if (peer2 != null) {
                        return org.telegram.messenger.m5.o(peer2);
                    }
                    if (ziVar.Q3()) {
                        return zi.B0(this.A2.f26868k);
                    }
                    return h10.i(this.f28583a).e();
                } else if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                    TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
                    TL_stars.StarGift starGift = tL_messageActionStarGiftUnique.gift;
                    if ((starGift instanceof TL_stars.TL_starGiftUnique) && (peer = starGift.owner_id) != null) {
                        return org.telegram.messenger.m5.o(peer);
                    }
                    TLRPC.Peer peer3 = tL_messageActionStarGiftUnique.peer;
                    if (peer3 != null) {
                        return org.telegram.messenger.m5.o(peer3);
                    }
                    return 0L;
                } else {
                    return 0L;
                }
            }
            return 0L;
        }
        TL_stars.SavedStarGift savedStarGift = this.f5487y2;
        if (savedStarGift != null) {
            TL_stars.StarGift starGift2 = savedStarGift.gift;
            if (starGift2 instanceof TL_stars.TL_starGiftUnique) {
                return org.telegram.messenger.m5.o(((TL_stars.TL_starGiftUnique) starGift2).owner_id);
            }
            return this.Q1;
        }
        TL_stars.TL_starGiftUnique tL_starGiftUnique = this.C2;
        if (tL_starGiftUnique != null) {
            return org.telegram.messenger.m5.o(tL_starGiftUnique.owner_id);
        }
        return 0L;
    }

    public final TL_stars.StarGift y1() {
        zi ziVar = this.A2;
        if (ziVar != null) {
            TLRPC.Message message = ziVar.f26868k;
            if (message == null) {
                return null;
            }
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                return ((TLRPC.TL_messageActionStarGift) messageAction).gift;
            }
            if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                return ((TLRPC.TL_messageActionStarGiftUnique) messageAction).gift;
            }
        } else {
            TL_stars.SavedStarGift savedStarGift = this.f5487y2;
            if (savedStarGift != null) {
                return savedStarGift.gift;
            }
            TL_stars.TL_starGiftUnique tL_starGiftUnique = this.C2;
            if (tL_starGiftUnique != null) {
                return tL_starGiftUnique;
            }
        }
        return null;
    }

    public final String z1() {
        TL_stars.StarGift y12 = y1();
        if (y12 instanceof TL_stars.TL_starGiftUnique) {
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) y12;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(tL_starGiftUnique.title);
            sb2.append(" #");
            return k2.p1.l(tL_starGiftUnique.num, ',', sb2);
        }
        return "";
    }
}
