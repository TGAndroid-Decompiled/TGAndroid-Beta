package bi;

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
import java.util.ArrayList;
import org.json.JSONObject;
import org.telegram.messenger.c20;
import org.telegram.messenger.ij;
import org.telegram.messenger.ls;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.t10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.kz;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.qx0;
import org.telegram.ui.Components.sx0;
import org.telegram.ui.Components.tx0;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.wo;
import org.telegram.ui.Components.wp;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.mg0;
public class k7 extends org.telegram.ui.Components.na implements ls {
    public static final int f4163s3 = 0;
    public String A2;
    public TL_stars.TL_starGiftUnique B2;
    public boolean C2;
    public boolean D2;
    public boolean E2;
    public boolean F2;
    public boolean G2;
    public s6 H2;
    public boolean I2;
    public l5 J2;
    public final int[] K2;
    public k5 L2;
    public int M2;
    public String N2;
    public zh.j3 O2;
    public final long P1;
    public wp P2;
    public final m5 Q1;
    public boolean Q2;
    public final f5 R1;
    public x4 R2;
    public final kz S1;
    public Float S2;
    public final View T1;
    public g6 T2;
    public i5 U1;
    public ValueAnimator U2;
    public i5 V1;
    public wp V2;
    public final j5 W1;
    public boolean W2;
    public final e7 X1;
    public TL_wallet.nftItem X2;
    public final h5 Y1;
    public org.telegram.ui.Wallet.f5 Y2;
    public final w70 Z1;
    public org.telegram.ui.Wallet.g5 Z2;
    public final tx0 f4164a2;
    public TL_wallet.walletTransaction f4165a3;
    public final w70 f4166b2;
    public View f4167b3;
    public final fi.d f4168c2;
    public zh.p1 f4169c3;
    public final FrameLayout d2;
    public boolean f4170d3;
    public final w70 f4171e2;
    public Boolean f4172e3;
    public final FrameLayout f4173f2;
    public boolean f4174f3;
    public final View f4175g2;
    public ArrayList f4176g3;
    public final FrameLayout f4177h2;
    public ArrayList f4178h3;
    public g7 f4179i2;
    public ArrayList f4180i3;
    public boolean f4181j2;
    public boolean j3;
    public final h5 f4182k2;
    public TLRPC.PaymentForm f4183k3;
    public final hi.i[] f4184l2;
    public final wp[] f4185l3;
    public final View f4186m2;
    public final z1 f4187m3;
    public final LinearLayout f4188n2;
    public int f4189n3;
    public final wo f4190o2;
    public Boolean f4191o3;
    public final TextView f4192p2;
    public boolean f4193p3;
    public final LinearLayout f4194q2;
    public fi.m3 f4195q3;
    public final wo f4196r2;
    public View f4197r3;
    public boolean f4198s2;
    public final h5 f4199t2;
    public final TextView f4200u2;
    public final h5 f4201v2;
    public boolean f4202w2;
    public TL_stars.SavedStarGift f4203x2;
    public w9 f4204y2;
    public ij f4205z2;

    public k7(Context context, int i7, long j3, org.telegram.ui.ActionBar.f6 f6Var, View view) {
        super(context, null, false, false, f6Var);
        this.f4181j2 = false;
        this.K2 = new int[2];
        this.M2 = -1;
        this.N2 = "";
        this.T2 = new g6(0, 0);
        this.W2 = true;
        this.f4185l3 = new wp[1];
        this.f4187m3 = new z1(this, 11);
        this.f4193p3 = true;
        this.f28616a = i7;
        this.P1 = j3;
        this.f36282r1 = Math.max(0.05f, org.telegram.messenger.g0.L(82.0f) / (org.telegram.messenger.g0.f22563q.y + org.telegram.messenger.g0.f22557m));
        this.f28654x = true;
        this.f28619b = new e5(0, context, this);
        m5 m5Var = new m5(this, context);
        this.Q1 = m5Var;
        f5 f5Var = new f5(this, context);
        this.R1 = f5Var;
        f5Var.setAdapter(new g5(0, context, this));
        v2();
        View view2 = new View(context);
        this.T1 = view2;
        int i10 = org.telegram.ui.ActionBar.k6.f27925h5;
        org.telegram.ui.ActionBar.r6.i(i10, view2, f6Var);
        FrameLayout.LayoutParams e10 = c8.ha.e(-1, 50, 80);
        int i11 = this.f28649t0;
        e10.rightMargin = i11;
        e10.leftMargin = i11;
        this.f28619b.addView(view2, e10);
        this.f28619b.addView(f5Var, c8.ha.e(-1, -1, 119));
        P(i10);
        org.telegram.messenger.g0.E2(this.f36277k1);
        m5Var.addView(this.f36277k1, c8.ha.e(-1, -1, 119));
        h5 h5Var = new h5(this, context, 0);
        this.Y1 = h5Var;
        h5Var.setOrientation(1);
        h5Var.setPadding(org.telegram.messenger.g0.L(14.0f) + this.f28649t0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(14.0f) + this.f28649t0, org.telegram.messenger.g0.L(68.0f));
        m5Var.addView(h5Var, c8.ha.e(-1, -1, 55));
        w70 w70Var = new w70(context, f6Var);
        this.Z1 = w70Var;
        int i12 = org.telegram.ui.ActionBar.k6.f28091q5;
        org.telegram.ui.ActionBar.r6.V(w70Var, i12, f6Var);
        w70Var.setTextSize(1, 12.0f);
        w70Var.setGravity(17);
        w70Var.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        org.telegram.ui.ActionBar.r6.H(w70Var, org.telegram.ui.ActionBar.k6.Uc, f6Var);
        w70Var.setDisablePaddingsOffsetY(true);
        h5Var.addView(w70Var, c8.ha.t(-2, -2, 1, 4, -2, 4, 16));
        w70Var.setVisibility(8);
        tx0 tx0Var = new tx0(context, f6Var);
        this.f4164a2 = tx0Var;
        h5Var.addView(tx0Var, c8.ha.k(0.0f, 0.0f, 0.0f, 12.0f, -1, -2));
        w70 w70Var2 = new w70(context, f6Var);
        this.f4166b2 = w70Var2;
        org.telegram.ui.ActionBar.r6.V(w70Var2, i12, f6Var);
        w70Var2.setTextSize(1, 12.0f);
        w70Var2.setGravity(17);
        w70Var2.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        int i13 = org.telegram.ui.ActionBar.k6.Ci;
        org.telegram.ui.ActionBar.r6.H(w70Var2, i13, f6Var);
        w70Var2.setDisablePaddingsOffsetY(true);
        w70Var2.setPadding(org.telegram.messenger.g0.L(5.0f), 0, org.telegram.messenger.g0.L(5.0f), 0);
        h5Var.addView(w70Var2, c8.ha.t(-2, -2, 1, 4, 2, 4, 8));
        w70Var2.setVisibility(8);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f4194q2 = linearLayout;
        linearLayout.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f));
        linearLayout.setOrientation(0);
        int i14 = org.telegram.ui.ActionBar.k6.f27944i6;
        org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.k6.a0(org.telegram.ui.ActionBar.k6.w0(i14, f6Var), 21, 21);
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i14);
        linearLayout.setBackground(a02);
        org.telegram.ui.ActionBar.r6.k(linearLayout, a02, null, N, f6Var);
        wo woVar = new wo(24, context, f6Var);
        this.f4196r2 = woVar;
        int i15 = org.telegram.ui.ActionBar.k6.h7;
        int i16 = org.telegram.ui.ActionBar.k6.f27962j7;
        int i17 = org.telegram.ui.ActionBar.k6.f27982k7;
        woVar.b(i15, i16, i17);
        woVar.setDrawUnchecked(true);
        woVar.a(false, false);
        woVar.setDrawBackgroundAsArc(10);
        linearLayout.addView(woVar, c8.ha.t(26, 26, 16, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        int i18 = org.telegram.ui.ActionBar.k6.f27960j5;
        org.telegram.ui.ActionBar.r6.V(textView, i18, f6Var);
        jg.g.v(textView, 1, 14.0f, null, 2131750390);
        linearLayout.addView(textView, c8.ha.t(-2, -2, 16, 9, 0, 0, 0));
        h5Var.addView(linearLayout, c8.ha.t(-2, -2, 1, 0, -4, 0, 4));
        c8.ka.b(linearLayout, 0.025f, 1.5f);
        linearLayout.setOnClickListener(new y1(this, 19));
        linearLayout.setVisibility(8);
        h5 h5Var2 = new h5(this, context, 1);
        this.f4182k2 = h5Var2;
        h5Var2.setOrientation(1);
        h5Var2.setPadding(org.telegram.messenger.g0.L(4.0f) + this.f28649t0, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(4.0f) + this.f28649t0, org.telegram.messenger.g0.L(66.0f));
        m5Var.addView(h5Var2, c8.ha.e(-1, -1, 55));
        this.f4184l2 = r8;
        hi.i iVar = new hi.i(context, f6Var, false);
        iVar.a(2131231821, org.telegram.messenger.id.M0(2131749866, null), org.telegram.messenger.id.M0(2131749576, null));
        h5Var2.addView(r8[0], c8.ha.o(-1, -2));
        hi.i iVar2 = new hi.i(context, f6Var, false);
        iVar2.a(2131231817, org.telegram.messenger.id.M0(2131749860, null), org.telegram.messenger.id.M0(2131749574, null));
        h5Var2.addView(r8[1], c8.ha.o(-1, -2));
        hi.i iVar3 = new hi.i(context, f6Var, false);
        hi.i[] iVarArr = {iVar, iVar2, iVar3};
        iVar3.a(2131231924, org.telegram.messenger.id.M0(2131749571, null), org.telegram.messenger.id.M0(2131749572, null));
        h5Var2.addView(iVarArr[2], c8.ha.o(-1, -2));
        View view3 = new View(context);
        this.f4186m2 = view3;
        int i19 = org.telegram.ui.ActionBar.k6.f27853d7;
        org.telegram.ui.ActionBar.r6.i(i19, view3, f6Var);
        h5Var2.addView(view3, c8.ha.n(1.0f / org.telegram.messenger.g0.f22562p, -2, 7, 17, -4, 17, 6));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f4188n2 = linearLayout2;
        linearLayout2.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f));
        linearLayout2.setOrientation(0);
        org.telegram.ui.Cells.y a03 = org.telegram.ui.ActionBar.k6.a0(org.telegram.ui.ActionBar.k6.w0(i14, f6Var), 6, 6);
        org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i14);
        linearLayout2.setBackground(a03);
        org.telegram.ui.ActionBar.r6.k(linearLayout2, a03, null, N2, f6Var);
        wo woVar2 = new wo(24, context, f6Var);
        this.f4190o2 = woVar2;
        woVar2.b(i15, i16, i17);
        woVar2.setDrawUnchecked(true);
        woVar2.a(false, false);
        woVar2.setDrawBackgroundAsArc(10);
        linearLayout2.addView(woVar2, c8.ha.t(26, 26, 16, 0, 0, 0, 0));
        TextView textView2 = new TextView(context);
        this.f4192p2 = textView2;
        org.telegram.ui.ActionBar.r6.V(textView2, i18, f6Var);
        jg.g.v(textView2, 1, 14.0f, null, 2131750398);
        linearLayout2.addView(textView2, c8.ha.t(-2, -2, 16, 9, 0, 0, 0));
        h5Var2.addView(linearLayout2, c8.ha.t(-2, -2, 1, 0, 0, 0, 4));
        c8.ka.b(linearLayout2, 0.025f, 1.5f);
        h5 h5Var3 = new h5(this, context, 2);
        this.f4199t2 = h5Var3;
        h5Var3.setOrientation(1);
        h5Var3.setPadding(org.telegram.messenger.g0.L(4.0f) + this.f28649t0, org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(4.0f) + this.f28649t0, org.telegram.messenger.g0.L(66.0f));
        m5Var.addView(h5Var3, c8.ha.e(-1, -1, 55));
        TextView textView3 = new TextView(context);
        this.f4200u2 = textView3;
        org.telegram.ui.ActionBar.r6.V(textView3, i18, f6Var);
        textView3.setTextSize(1, 20.0f);
        textView3.setGravity(17);
        textView3.setTypeface(org.telegram.messenger.g0.o());
        h5Var3.addView(textView3, c8.ha.t(-1, -2, 7, 20, 0, 20, 0));
        TextView textView4 = new TextView(context);
        org.telegram.ui.ActionBar.r6.V(textView4, i18, f6Var);
        textView4.setTextSize(1, 14.0f);
        org.telegram.messenger.k5.m(textView4, 17, null, 2131749835);
        h5Var3.addView(textView4, c8.ha.t(-1, -2, 7, 20, 6, 20, 24));
        hi.i iVar4 = new hi.i(context, f6Var, false);
        iVar4.a(2131231821, org.telegram.messenger.id.M0(2131749841, null), org.telegram.messenger.id.M0(2131749842, null));
        h5Var3.addView(r6[0], c8.ha.o(-1, -2));
        hi.i iVar5 = new hi.i(context, f6Var, false);
        iVar5.a(2131231799, org.telegram.messenger.id.M0(2131749839, null), org.telegram.messenger.id.M0(2131749840, null));
        h5Var3.addView(r6[1], c8.ha.o(-1, -2));
        hi.i iVar6 = new hi.i(context, f6Var, false);
        hi.i[] iVarArr2 = {iVar4, iVar5, iVar6};
        iVar6.a(2131231911, org.telegram.messenger.id.M0(2131749837, null), org.telegram.messenger.id.M0(2131749838, null));
        h5Var3.addView(iVarArr2[2], c8.ha.o(-1, -2));
        h5 h5Var4 = new h5(this, context, 3);
        this.f4201v2 = h5Var4;
        h5Var4.setOrientation(1);
        h5Var4.setPadding(org.telegram.messenger.g0.L(4.0f) + this.f28649t0, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(4.0f) + this.f28649t0, org.telegram.messenger.g0.L(92.0f));
        m5Var.addView(h5Var4, c8.ha.e(-1, -1, 55));
        hi.i iVar7 = new hi.i(context, f6Var, false);
        iVar7.a(2131231821, org.telegram.messenger.id.M0(2131749786, null), org.telegram.messenger.id.M0(2131749787, null));
        h5Var4.addView(r6[0], c8.ha.o(-1, -2));
        hi.i iVar8 = new hi.i(context, f6Var, false);
        iVar8.a(2131231873, org.telegram.messenger.id.M0(2131749784, null), org.telegram.messenger.id.M0(2131749785, null));
        h5Var4.addView(r6[1], c8.ha.o(-1, -2));
        hi.i iVar9 = new hi.i(context, f6Var, false);
        hi.i[] iVarArr3 = {iVar7, iVar8, iVar9};
        iVar9.a(2131231795, org.telegram.messenger.id.M0(2131749782, null), org.telegram.messenger.id.M0(2131749783, null));
        h5Var4.addView(iVarArr3[2], c8.ha.o(-1, -2));
        h5Var.setAlpha(1.0f);
        h5Var2.setAlpha(0.0f);
        h5Var3.setAlpha(0.0f);
        h5Var4.setAlpha(0.0f);
        e7 e7Var = new e7(context, f6Var, new z1(this, 12), new y1(this, 20), new y1(this, 21), new y1(this, 22), new y1(this, 23), new y1(this, 24), new y1(this, 25), new y1(this, 26));
        this.X1 = e7Var;
        e7Var.M.f3658c.setOnClickListener(new y1(this, 17));
        int i20 = this.f28649t0;
        e7Var.setPadding(i20, 0, i20, 0);
        m5Var.addView(e7Var, c8.ha.e(-1, -2, 55));
        jg.b0 b0Var = this.f36276j1;
        this.G1 = true;
        b0Var.k1(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d2 = frameLayout;
        org.telegram.ui.ActionBar.r6.i(i10, frameLayout, f6Var);
        View view4 = new View(context);
        this.f4175g2 = view4;
        org.telegram.ui.ActionBar.r6.i(i19, view4, f6Var);
        view4.setAlpha(0.0f);
        frameLayout.addView(view4, c8.ha.a(-1.0f, 1.0f / org.telegram.messenger.g0.f22562p, 55));
        fi.d h = org.telegram.messenger.k5.h(24, context, f6Var, true);
        this.f4168c2 = h;
        h.i(org.telegram.messenger.id.M0(2131747832, null), false, true);
        h.g(null, false);
        FrameLayout.LayoutParams d = c8.ha.d(-1, 48.0f, 119, 0.0f, 12.0f, 0.0f, 12.0f);
        d.leftMargin = org.telegram.messenger.g0.L(14.0f) + this.f28649t0;
        d.rightMargin = org.telegram.messenger.g0.L(14.0f) + this.f28649t0;
        frameLayout.addView(h, d);
        m5Var.addView(frameLayout, c8.ha.e(-1, 72, 87));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f4173f2 = frameLayout2;
        org.telegram.ui.ActionBar.r6.i(i10, frameLayout2, f6Var);
        w70 w70Var3 = new w70(context, null);
        this.f4171e2 = w70Var3;
        w70Var3.setTextSize(1, 12.0f);
        org.telegram.ui.ActionBar.r6.V(w70Var3, i13, f6Var);
        org.telegram.ui.ActionBar.r6.H(w70Var3, i13, f6Var);
        w70Var3.setGravity(17);
        frameLayout2.addView(w70Var3, c8.ha.d(-1, -2.0f, 17, 16.0f, 8.0f, 16.0f, 14.0f));
        m5Var.addView(frameLayout2, c8.ha.e(-1, -2, 87));
        frameLayout2.setVisibility(8);
        this.f36277k1.setOnScrollListener(new ai.b(this, 4));
        linearLayout2.setOnClickListener(new y1(this, 18));
        kz kzVar = new kz(context);
        this.S1 = kzVar;
        m5Var.addView(kzVar, c8.ha.c(-1.0f, -1));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f4177h2 = frameLayout3;
        frameLayout3.setPadding(org.telegram.messenger.g0.L(6.0f) + this.f28649t0, 0, org.telegram.messenger.g0.L(6.0f) + this.f28649t0, 0);
        m5Var.addView(frameLayout3, c8.ha.d(-1, 200.0f, 87, 0.0f, 0.0f, 0.0f, 60.0f));
        org.telegram.messenger.g0.E2(this.l1);
        m5Var.addView(this.l1, c8.ha.d(-1, -2.0f, 0, 6.0f, 0.0f, 6.0f, 0.0f));
        j5 j5Var = new j5(context);
        this.W1 = j5Var;
        m5Var.addView(j5Var, c8.ha.e(-1, -2, 55));
        ArrayList arrayList = new ArrayList();
        if (view != null) {
            arrayList.add(view);
        }
        org.telegram.messenger.g0.m2(new ai.i(j5Var, 6), 12.0f, 12, arrayList);
    }

    public static String A1(TL_stars.StarGift starGift) {
        if (starGift instanceof TL_stars.TL_starGiftUnique) {
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(tL_starGiftUnique.title);
            sb2.append(" #");
            return jg.g.m(tL_starGiftUnique.num, ',', sb2);
        } else if ((starGift instanceof TL_stars.TL_starGift) && !TextUtils.isEmpty(starGift.title)) {
            return starGift.title;
        } else {
            return org.telegram.messenger.id.M0(2131750193, null);
        }
    }

    public static String G1(TL_stars.StarGiftAttributeRarity starGiftAttributeRarity, Integer[] numArr) {
        if (starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarityUncommon) {
            numArr[0] = -12539616;
            return org.telegram.messenger.id.M0(2131749620, null);
        } else if (starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarityRare) {
            numArr[0] = -15619394;
            return org.telegram.messenger.id.M0(2131749621, null);
        } else if (starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarityEpic) {
            numArr[0] = -6988581;
            return org.telegram.messenger.id.M0(2131749623, null);
        } else if (starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarityLegendary) {
            numArr[0] = -4229632;
            return org.telegram.messenger.id.M0(2131749622, null);
        } else if (starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarity) {
            int i7 = ((TL_stars.TL_starGiftAttributeRarity) starGiftAttributeRarity).permille;
            if (i7 <= 0) {
                return "<0.1%";
            }
            return hi.j.J0(i7);
        } else {
            return "";
        }
    }

    public static boolean K1(int i7, long j3) {
        if (j3 >= 0) {
            if (p10.i(i7).e() == j3) {
                return true;
            }
            return false;
        }
        return org.telegram.messenger.t3.w(5, qp.s1(i7).M0(Long.valueOf(-j3)));
    }

    public static boolean L1(int i7, long j3) {
        if (j3 >= 0) {
            if (p10.i(i7).e() != j3) {
                return false;
            }
            return true;
        }
        TLRPC.Chat M0 = qp.s1(i7).M0(Long.valueOf(-j3));
        if (M0 == null || !M0.creator) {
            return false;
        }
        return true;
    }

    public static boolean M1(int i7, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        if (tL_starGiftUnique == null) {
            return false;
        }
        TLRPC.Peer peer = tL_starGiftUnique.owner_id;
        if (peer == null) {
            peer = tL_starGiftUnique.host_id;
        }
        long o4 = org.telegram.messenger.m5.o(peer);
        int i10 = (o4 > 0L ? 1 : (o4 == 0L ? 0 : -1));
        if (i10 == 0) {
            return false;
        }
        if (i10 > 0) {
            TLRPC.User a22 = qp.s1(i7).a2(Long.valueOf(o4));
            if (a22 != null) {
                TLRPC.EmojiStatus emojiStatus = a22.emoji_status;
                if (!(emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) || ((TLRPC.TL_emojiStatusCollectible) emojiStatus).collectible_id != tL_starGiftUnique.f27185id) {
                    return false;
                }
                return true;
            }
        } else {
            TLRPC.Chat M0 = qp.s1(i7).M0(Long.valueOf(-o4));
            if (M0 != null) {
                TLRPC.EmojiStatus emojiStatus2 = M0.emoji_status;
                if ((emojiStatus2 instanceof TLRPC.TL_emojiStatusCollectible) && ((TLRPC.TL_emojiStatusCollectible) emojiStatus2).collectible_id == tL_starGiftUnique.f27185id) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void c2(org.telegram.ui.ActionBar.f2 f2Var) {
        org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
        if (T == 0) {
            return;
        }
        ?? obj = new Object();
        obj.f27424a = true;
        T.showAsSheet(f2Var, obj);
    }

    public static void d1(k7 k7Var) {
        boolean z9;
        TLRPC.Document document;
        boolean z10;
        t9 F;
        TLRPC.Message message;
        fi.d dVar = k7Var.f4168c2;
        if (!dVar.Q) {
            TL_stars.InputSavedStarGift B1 = k7Var.B1();
            ij ijVar = k7Var.f4205z2;
            if (ijVar != null && (message = ijVar.f23262k) != null) {
                TLRPC.MessageAction messageAction = message.action;
                if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                    TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                    z9 = tL_messageActionStarGift.saved;
                    document = tL_messageActionStarGift.gift.getDocument();
                } else if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                    TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
                    z9 = tL_messageActionStarGiftUnique.saved;
                    document = tL_messageActionStarGiftUnique.gift.getDocument();
                } else {
                    return;
                }
            } else {
                TL_stars.SavedStarGift savedStarGift = k7Var.f4203x2;
                if (savedStarGift != null) {
                    z9 = !savedStarGift.unsaved;
                    document = savedStarGift.gift.getDocument();
                } else {
                    return;
                }
            }
            TLRPC.Document document2 = document;
            boolean z11 = z9;
            dVar.setLoading(true);
            TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
            savestargift.unsave = z11;
            savestargift.stargift = B1;
            if (k7Var.f4203x2 != null && (F = ea.y(k7Var.f28616a, false).F(k7Var.P1, false)) != null) {
                F.m(k7Var.f4203x2, savestargift.unsave);
                z10 = true;
            } else {
                z10 = false;
            }
            ConnectionsManager.getInstance(k7Var.f28616a).sendRequest(savestargift, new t4(k7Var, z10, document2, z11, savestargift));
        }
    }

    public static void e1(final k7 k7Var) {
        int i7;
        long j3;
        long j10;
        long j11;
        String M0;
        final long e10 = p10.i(k7Var.f28616a).e();
        final TL_stars.InputSavedStarGift B1 = k7Var.B1();
        if (B1 != null) {
            ij ijVar = k7Var.f4205z2;
            if (ijVar != null) {
                i7 = ijVar.f23262k.date;
                boolean Q3 = ijVar.Q3();
                TLRPC.Message message = k7Var.f4205z2.f23262k;
                if (message != null) {
                    TLRPC.MessageAction messageAction = message.action;
                    if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                        TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                        TLRPC.Peer peer = tL_messageActionStarGift.peer;
                        if (peer != null) {
                            j11 = org.telegram.messenger.m5.o(peer);
                        } else if (Q3) {
                            j11 = ij.B0(message);
                        } else {
                            j11 = e10;
                        }
                        TLRPC.Peer peer2 = tL_messageActionStarGift.from_id;
                        if (peer2 != null) {
                            j3 = org.telegram.messenger.m5.o(peer2);
                        } else if (Q3) {
                            j3 = e10;
                        } else {
                            j3 = ij.B0(k7Var.f4205z2.f23262k);
                        }
                        j10 = tL_messageActionStarGift.convert_stars;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else {
                TL_stars.SavedStarGift savedStarGift = k7Var.f4203x2;
                if (savedStarGift != null) {
                    i7 = savedStarGift.date;
                    if ((savedStarGift.flags & 2) != 0 && !savedStarGift.name_hidden) {
                        j3 = org.telegram.messenger.m5.o(savedStarGift.from_id);
                    } else {
                        j3 = 2666000;
                    }
                    j10 = k7Var.f4203x2.convert_stars;
                    j11 = k7Var.P1;
                } else {
                    return;
                }
            }
            int max = Math.max(1, (qp.s1(k7Var.f28616a).E6 - (ConnectionsManager.getInstance(k7Var.f28616a).getCurrentTime() - i7)) / 86400);
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, k7Var.getContext(), k7Var.I0);
            String M02 = org.telegram.messenger.id.M0(2131750227, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
            u1Var.R = M02;
            if (!t10.A(j3) && j3 != 2666000) {
                M0 = org.telegram.messenger.m5.t(j3);
            } else {
                M0 = org.telegram.messenger.id.M0(2131744952, null);
            }
            u1Var.T = org.telegram.messenger.g0.X2(org.telegram.messenger.id.G(max, "Gift2ConvertText2", M0, org.telegram.messenger.id.H(',', "Gift2ConvertStars", (int) j10)));
            final long j12 = j10;
            final long j13 = j11;
            alertDialog$Builder.k(org.telegram.messenger.id.M0(2131750234, null), new org.telegram.ui.ActionBar.r1() {
                @Override
                public final void g(org.telegram.ui.ActionBar.u1 u1Var2, int i10) {
                    k7 k7Var2 = k7.this;
                    TL_stars.InputSavedStarGift inputSavedStarGift = B1;
                    long j14 = j13;
                    long j15 = e10;
                    long j16 = j12;
                    org.telegram.ui.ActionBar.u1 u1Var3 = new org.telegram.ui.ActionBar.u1(3, org.telegram.messenger.t0.f25566b, null);
                    u1Var3.r(500L);
                    TL_stars.convertStarGift convertstargift = new TL_stars.convertStarGift();
                    convertstargift.stargift = inputSavedStarGift;
                    ConnectionsManager.getInstance(k7Var2.f28616a).sendRequest(convertstargift, new t2(k7Var2, u1Var3, j14, j15, j16));
                }
            });
            jg.g.w(null, 2131752589, alertDialog$Builder, null);
        }
    }

    public static void f1(k7 k7Var, org.telegram.ui.ActionBar.u1 u1Var, TL_stars.SavedStarGift savedStarGift) {
        if (savedStarGift != null) {
            u1Var.dismiss();
            k7Var.G2 = true;
            k7Var.j2(savedStarGift, null);
            super.show();
            return;
        }
        u1Var.dismiss();
        org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
        if (T != null) {
            org.telegram.ui.Components.cc Q = org.telegram.ui.Components.hc.a0(T).Q(2131624011, 36, org.telegram.messenger.id.M0(2131748553, null));
            Q.f32555t = true;
            Q.j();
        }
    }

    public static SpannableStringBuilder f2(String str) {
        int i7;
        int i10;
        int indexOf = str.indexOf("**");
        int indexOf2 = str.indexOf("**", indexOf + 1);
        String replace = str.replace("**", "");
        if (indexOf >= 0 && indexOf2 >= 0 && (i10 = indexOf2 - indexOf) > 2) {
            i7 = i10 - 2;
        } else {
            indexOf = -1;
            i7 = 0;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(replace);
        if (indexOf >= 0) {
            spannableStringBuilder.setSpan(new b5(0), indexOf, i7 + indexOf, 0);
        }
        return spannableStringBuilder;
    }

    public static void g1(k7 k7Var, TL_stars.TL_payments_uniqueStarGift tL_payments_uniqueStarGift) {
        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) tL_payments_uniqueStarGift.gift;
        k7Var.B2 = tL_starGiftUnique;
        k7Var.k2(tL_starGiftUnique, false, null, null);
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

    public static void h1(k7 k7Var, org.telegram.ui.ActionBar.u1 u1Var, ij ijVar) {
        u1Var.dismiss();
        k7Var.E2 = true;
        k7Var.i2(ijVar, null);
        super.show();
    }

    public static void i1(k7 k7Var, boolean z9) {
        int i7;
        Object obj;
        i5 i5Var;
        i5 i5Var2;
        i5 i5Var3;
        int D1 = k7Var.D1();
        if (D1 >= 0) {
            if (z9) {
                i7 = 1;
            } else {
                i7 = -1;
            }
            int i10 = i7 + D1;
            int i11 = k7Var.M2;
            if (i11 >= 0 && (!z9 ? i11 < D1 : i11 > D1)) {
                i10 = i11;
            }
            w9 w9Var = k7Var.f4204y2;
            if (w9Var != null && i10 >= 0 && i10 < w9Var.e()) {
                obj = k7Var.f4204y2.get(i10);
            } else {
                obj = null;
            }
            if (obj != null) {
                if (z9) {
                    i5Var = k7Var.V1;
                } else {
                    i5Var = k7Var.U1;
                }
                if (i5Var != null) {
                    if (obj instanceof TL_stars.SavedStarGift) {
                        if (z9) {
                            i5Var3 = k7Var.V1;
                        } else {
                            i5Var3 = k7Var.U1;
                        }
                        if (u1(i5Var3.f4203x2, (TL_stars.SavedStarGift) obj)) {
                            return;
                        }
                    }
                    if (obj instanceof TL_stars.TL_starGiftUnique) {
                        if (z9) {
                            i5Var2 = k7Var.V1;
                        } else {
                            i5Var2 = k7Var.U1;
                        }
                        if (v1(i5Var2.B2, (TL_stars.TL_starGiftUnique) obj)) {
                            return;
                        }
                    }
                }
                i5 i5Var4 = new i5(k7Var, k7Var.getContext(), k7Var.f28616a, k7Var.P1, k7Var.I0, k7Var.Q1.getRootView());
                if (obj instanceof TL_stars.SavedStarGift) {
                    i5Var4.j2((TL_stars.SavedStarGift) obj, k7Var.f4204y2);
                } else if (obj instanceof TL_stars.TL_starGiftUnique) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj;
                    i5Var4.h2(tL_starGiftUnique.slug, tL_starGiftUnique, k7Var.f4204y2);
                }
                org.telegram.messenger.g0.E2(i5Var4.f28619b);
                if (z9) {
                    k7Var.V1 = i5Var4;
                } else {
                    k7Var.U1 = i5Var4;
                }
            }
        }
    }

    public static void k1(tx0 tx0Var, TL_stars.StarGiftAttribute starGiftAttribute) {
        String M0;
        if (starGiftAttribute instanceof TL_stars.starGiftAttributeModel) {
            M0 = org.telegram.messenger.id.M0(2131750388, null);
        } else if (starGiftAttribute instanceof TL_stars.starGiftAttributePattern) {
            M0 = org.telegram.messenger.id.M0(2131750381, null);
        } else if (starGiftAttribute instanceof TL_stars.starGiftAttributeBackdrop) {
            M0 = org.telegram.messenger.id.M0(2131750389, null);
        } else {
            return;
        }
        String str = M0;
        Integer[] numArr = new Integer[1];
        tx0Var.e(str, starGiftAttribute.name, G1(starGiftAttribute.rarity, numArr), null, numArr[0]);
    }

    public static boolean u1(TL_stars.SavedStarGift savedStarGift, TL_stars.SavedStarGift savedStarGift2) {
        if (savedStarGift != savedStarGift2) {
            if (savedStarGift != null) {
                TL_stars.StarGift starGift = savedStarGift.gift;
                TL_stars.StarGift starGift2 = savedStarGift2.gift;
                if (starGift != starGift2) {
                    if ((starGift instanceof TL_stars.TL_starGiftUnique) && (starGift2 instanceof TL_stars.TL_starGiftUnique)) {
                        if (starGift.f27185id == starGift2.f27185id) {
                            return true;
                        }
                        return false;
                    } else if ((starGift instanceof TL_stars.TL_starGift) && (starGift2 instanceof TL_stars.TL_starGift) && starGift.f27185id == starGift2.f27185id && savedStarGift.date == savedStarGift2.date) {
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
                if (tL_starGiftUnique.f27185id == tL_starGiftUnique2.f27185id || TextUtils.equals(tL_starGiftUnique.slug, tL_starGiftUnique2.slug)) {
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
        long j3 = this.P1;
        if (j3 < 0) {
            TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat = new TL_stars.TL_inputSavedStarGiftChat();
            tL_inputSavedStarGiftChat.peer = qp.s1(this.f28616a).j1(j3);
            ij ijVar = this.f4205z2;
            if (ijVar != null && (message3 = ijVar.f23262k) != null) {
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
            TL_stars.SavedStarGift savedStarGift = this.f4203x2;
            if (savedStarGift != null) {
                if ((savedStarGift.flags & 2048) == 0) {
                    return null;
                }
                tL_inputSavedStarGiftChat.saved_id = savedStarGift.saved_id;
                return tL_inputSavedStarGiftChat;
            } else if (this.B2 != null && !TextUtils.isEmpty(this.A2)) {
                TL_stars.TL_inputSavedStarGiftSlug tL_inputSavedStarGiftSlug = new TL_stars.TL_inputSavedStarGiftSlug();
                tL_inputSavedStarGiftSlug.slug = this.A2;
                return tL_inputSavedStarGiftSlug;
            } else {
                return tL_inputSavedStarGiftChat;
            }
        }
        ij ijVar2 = this.f4205z2;
        if (ijVar2 != null && (message2 = ijVar2.f23262k) != null) {
            TLRPC.MessageAction messageAction2 = message2.action;
            if ((messageAction2 instanceof TLRPC.TL_messageActionStarGift) && (messageAction2.flags & 4096) != 0) {
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift2 = (TLRPC.TL_messageActionStarGift) messageAction2;
                TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat2 = new TL_stars.TL_inputSavedStarGiftChat();
                qp s12 = qp.s1(this.f28616a);
                TLRPC.Peer peer = tL_messageActionStarGift2.peer;
                if (peer != null) {
                    B02 = org.telegram.messenger.m5.o(peer);
                } else {
                    B02 = ij.B0(this.f4205z2.f23262k);
                }
                tL_inputSavedStarGiftChat2.peer = s12.j1(B02);
                tL_inputSavedStarGiftChat2.saved_id = tL_messageActionStarGift2.saved_id;
                return tL_inputSavedStarGiftChat2;
            }
        }
        if (ijVar2 != null && (message = ijVar2.f23262k) != null) {
            TLRPC.MessageAction messageAction3 = message.action;
            if ((messageAction3 instanceof TLRPC.TL_messageActionStarGiftUnique) && (messageAction3.flags & 128) != 0) {
                TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique2 = (TLRPC.TL_messageActionStarGiftUnique) messageAction3;
                TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat3 = new TL_stars.TL_inputSavedStarGiftChat();
                qp s13 = qp.s1(this.f28616a);
                TLRPC.Peer peer2 = tL_messageActionStarGiftUnique2.peer;
                if (peer2 != null) {
                    B0 = org.telegram.messenger.m5.o(peer2);
                } else {
                    B0 = ij.B0(this.f4205z2.f23262k);
                }
                tL_inputSavedStarGiftChat3.peer = s13.j1(B0);
                tL_inputSavedStarGiftChat3.saved_id = tL_messageActionStarGiftUnique2.saved_id;
                return tL_inputSavedStarGiftChat3;
            }
        }
        TL_stars.TL_inputSavedStarGiftUser tL_inputSavedStarGiftUser = new TL_stars.TL_inputSavedStarGiftUser();
        ij ijVar3 = this.f4205z2;
        if (ijVar3 != null) {
            TLRPC.Message message4 = ijVar3.f23262k;
            if (message4 != null) {
                TLRPC.MessageAction messageAction4 = message4.action;
                if ((messageAction4 instanceof TLRPC.TL_messageActionStarGift) && (messageAction4.flags & 32768) != 0) {
                    tL_inputSavedStarGiftUser.msg_id = ((TLRPC.TL_messageActionStarGift) messageAction4).gift_msg_id;
                    return tL_inputSavedStarGiftUser;
                }
            }
            tL_inputSavedStarGiftUser.msg_id = ijVar3.f1();
            return tL_inputSavedStarGiftUser;
        }
        TL_stars.SavedStarGift savedStarGift2 = this.f4203x2;
        if (savedStarGift2 != null) {
            tL_inputSavedStarGiftUser.msg_id = savedStarGift2.msg_id;
            return tL_inputSavedStarGiftUser;
        } else if (this.B2 != null && !TextUtils.isEmpty(this.A2)) {
            TL_stars.TL_inputSavedStarGiftSlug tL_inputSavedStarGiftSlug2 = new TL_stars.TL_inputSavedStarGiftSlug();
            tL_inputSavedStarGiftSlug2.slug = this.A2;
            return tL_inputSavedStarGiftSlug2;
        } else {
            return tL_inputSavedStarGiftUser;
        }
    }

    public final String C1() {
        TL_stars.StarGift y12 = y1();
        if ((y12 instanceof TL_stars.TL_starGiftUnique) && y12.slug != null) {
            return qp.s1(this.f28616a).U2 + "/nft/" + y12.slug;
        }
        return null;
    }

    public final int D1() {
        int indexOf;
        w9 w9Var = this.f4204y2;
        if (w9Var != null) {
            TL_stars.SavedStarGift savedStarGift = this.f4203x2;
            if (savedStarGift != null) {
                indexOf = w9Var.indexOf(savedStarGift);
            } else {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = this.B2;
                if (tL_starGiftUnique != null) {
                    indexOf = w9Var.indexOf(tL_starGiftUnique);
                } else {
                    return -1;
                }
            }
            if (indexOf >= 0) {
                return indexOf;
            }
            TL_stars.StarGift y12 = y1();
            for (int i7 = 0; i7 < this.f4204y2.e(); i7++) {
                Object obj = this.f4204y2.get(i7);
                if (obj instanceof TL_stars.SavedStarGift) {
                    TL_stars.SavedStarGift savedStarGift2 = this.f4203x2;
                    if (savedStarGift2 != null) {
                        if (u1(savedStarGift2, (TL_stars.SavedStarGift) obj)) {
                            return i7;
                        }
                    }
                    if (y12 != null) {
                        TL_stars.StarGift starGift = ((TL_stars.SavedStarGift) obj).gift;
                        if (y12 != starGift) {
                            if ((y12 instanceof TL_stars.TL_starGiftUnique) && (starGift instanceof TL_stars.TL_starGiftUnique) && y12.f27185id == starGift.f27185id) {
                            }
                        }
                        return i7;
                    }
                    continue;
                } else {
                    if ((obj instanceof TL_stars.TL_starGiftUnique) && v1(this.B2, (TL_stars.TL_starGiftUnique) obj)) {
                        return i7;
                    }
                }
            }
            return -1;
        }
        return -1;
    }

    @Override
    public final void E0(int i7) {
        super.E0(i7);
        org.telegram.messenger.g0.u3(this, 0, false, null);
    }

    public final TL_stars.SavedStarGift E1(boolean z9) {
        int i7;
        Object obj;
        int D1 = D1();
        if (D1 < 0) {
            return null;
        }
        if (z9) {
            i7 = 1;
        } else {
            i7 = -1;
        }
        int i10 = i7 + D1;
        int i11 = this.M2;
        if (i11 >= 0 && (!z9 ? i11 < D1 : i11 > D1)) {
            i10 = i11;
        }
        w9 w9Var = this.f4204y2;
        if (w9Var != null && i10 >= 0 && i10 < w9Var.e()) {
            obj = this.f4204y2.get(i10);
        } else {
            obj = null;
        }
        if (!(obj instanceof TL_stars.SavedStarGift)) {
            return null;
        }
        return (TL_stars.SavedStarGift) obj;
    }

    public final TL_stars.TL_starGiftUnique F1(boolean z9) {
        int i7;
        Object obj;
        int D1 = D1();
        if (D1 < 0) {
            return null;
        }
        if (z9) {
            i7 = 1;
        } else {
            i7 = -1;
        }
        int i10 = i7 + D1;
        int i11 = this.M2;
        if (i11 >= 0 && (!z9 ? i11 < D1 : i11 > D1)) {
            i10 = i11;
        }
        w9 w9Var = this.f4204y2;
        if (w9Var != null && i10 >= 0 && i10 < w9Var.e()) {
            obj = this.f4204y2.get(i10);
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
        if (this.T2.c(4)) {
            boolean z9 = this.X1.M.f3666h0;
        }
        return false;
    }

    @Override
    public final boolean H() {
        if (this.T2.c(4) && this.X1.M.f3666h0) {
            return false;
        }
        return this.f28623c0;
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
        if (this.T2.c(4)) {
            boolean z9 = this.X1.M.f3666h0;
        }
        return false;
    }

    public final boolean I1(boolean z9) {
        if (E1(z9) == null && F1(z9) == null) {
            return false;
        }
        return true;
    }

    public final void J1(byte[] bArr, TwoStepVerificationActivity twoStepVerificationActivity, boolean z9, n3 n3Var) {
        TL_stars.getStarGiftWithdrawalUrl getstargiftwithdrawalurl;
        TL_stars.InputSavedStarGift B1 = B1();
        if (B1 == null) {
            if (n3Var != null) {
                n3Var.a(Boolean.FALSE);
                return;
            }
            return;
        }
        if (z9) {
            TL_stars.withdrawStarGift withdrawstargift = new TL_stars.withdrawStarGift();
            withdrawstargift.keep_on_profile = this.f4193p3;
            withdrawstargift.stargift = B1;
            withdrawstargift.tmp_password = bArr;
            getstargiftwithdrawalurl = withdrawstargift;
        } else {
            TL_stars.getStarGiftWithdrawalUrl getstargiftwithdrawalurl2 = new TL_stars.getStarGiftWithdrawalUrl();
            getstargiftwithdrawalurl2.stargift = B1;
            getstargiftwithdrawalurl2.tmp_password = bArr;
            getstargiftwithdrawalurl = getstargiftwithdrawalurl2;
        }
        ConnectionsManager.getInstance(this.f28616a).sendRequest(getstargiftwithdrawalurl, new d4(this, n3Var, twoStepVerificationActivity, z9, 0));
    }

    @Override
    public final oj0 L0(pj0 pj0Var) {
        k5 k5Var = new k5(this, 0);
        this.L2 = k5Var;
        return k5Var;
    }

    @Override
    public final int N0() {
        return org.telegram.messenger.g0.L(12.0f);
    }

    public final void N1() {
        throw new UnsupportedOperationException("Method not decompiled: bi.k7.N1():void");
    }

    @Override
    public final CharSequence O0() {
        return this.N2;
    }

    public final void O1() {
        x4 x4Var = this.R2;
        if (x4Var != null && !x4Var.I) {
            x4Var.dismiss();
        }
        String C1 = C1();
        x4 x4Var2 = new x4(this, getContext(), C1, C1, this.I0);
        this.R2 = x4Var2;
        x4Var2.f36048k2 = new cb.c(this, 11);
        x4Var2.show();
    }

    public final void P1() {
        throw new UnsupportedOperationException("Method not decompiled: bi.k7.P1():void");
    }

    public final void Q1(TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, boolean z9) {
        int i7;
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
            org.telegram.ui.Components.hc.b0("NULL_ERROR");
        } else if (!"PASSWORD_MISSING".equals(tL_error.text) && !tL_error.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error.text.startsWith("SESSION_TOO_FRESH_")) {
            if ("SRP_ID_INVALID".equals(tL_error.text)) {
                ConnectionsManager.getInstance(this.f28616a).sendRequest(new TL_account.getPassword(), new i4(this, twoStepVerificationActivity, z9, 1), 8);
                return;
            }
            if (twoStepVerificationActivity != null) {
                twoStepVerificationActivity.t0();
                twoStepVerificationActivity.finishFragment();
            }
            org.telegram.ui.Components.hc.d0(tL_error);
        } else {
            if (twoStepVerificationActivity != null) {
                twoStepVerificationActivity.t0();
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
            String M0 = org.telegram.messenger.id.M0(2131749901, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
            u1Var.R = M0;
            LinearLayout linearLayout = new LinearLayout(getContext());
            linearLayout.setPadding(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(24.0f), 0);
            linearLayout.setOrientation(1);
            alertDialog$Builder.o(linearLayout);
            TextView textView = new TextView(getContext());
            int i16 = org.telegram.ui.ActionBar.k6.f27960j5;
            org.telegram.ui.ActionBar.r6.V(textView, i16, null);
            textView.setTextSize(1, 16.0f);
            if (org.telegram.messenger.id.f23157a0) {
                i7 = 5;
            } else {
                i7 = 3;
            }
            textView.setGravity(i7 | 48);
            textView.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(2131749905, null)));
            linearLayout.addView(textView, c8.ha.o(-1, -2));
            LinearLayout linearLayout2 = new LinearLayout(getContext());
            linearLayout2.setOrientation(0);
            linearLayout.addView(linearLayout2, c8.ha.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
            ImageView imageView = new ImageView(getContext());
            imageView.setImageResource(2131231623);
            if (org.telegram.messenger.id.f23157a0) {
                i10 = org.telegram.messenger.g0.L(11.0f);
            } else {
                i10 = 0;
            }
            int L3 = org.telegram.messenger.g0.L(9.0f);
            if (org.telegram.messenger.id.f23157a0) {
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
            if (org.telegram.messenger.id.f23157a0) {
                i11 = 5;
            } else {
                i11 = 3;
            }
            textView2.setGravity(i11 | 48);
            textView2.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(2131749904, null)));
            if (org.telegram.messenger.id.f23157a0) {
                linearLayout2.addView(textView2, c8.ha.o(-1, -2));
                linearLayout2.addView(imageView, c8.ha.r(-2, -2, 5));
            } else {
                linearLayout2.addView(imageView, c8.ha.o(-2, -2));
                linearLayout2.addView(textView2, c8.ha.o(-1, -2));
            }
            LinearLayout linearLayout3 = new LinearLayout(getContext());
            linearLayout3.setOrientation(0);
            linearLayout.addView(linearLayout3, c8.ha.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
            ImageView imageView2 = new ImageView(getContext());
            imageView2.setImageResource(2131231623);
            if (org.telegram.messenger.id.f23157a0) {
                i12 = org.telegram.messenger.g0.L(11.0f);
            } else {
                i12 = 0;
            }
            int L4 = org.telegram.messenger.g0.L(9.0f);
            if (org.telegram.messenger.id.f23157a0) {
                L2 = 0;
            } else {
                L2 = org.telegram.messenger.g0.L(11.0f);
            }
            imageView2.setPadding(i12, L4, L2, 0);
            org.telegram.ui.ActionBar.r6.t(imageView2, i16, null, mode);
            TextView textView3 = new TextView(getContext());
            org.telegram.ui.ActionBar.r6.V(textView3, i16, null);
            textView3.setTextSize(1, 16.0f);
            if (org.telegram.messenger.id.f23157a0) {
                i13 = 5;
            } else {
                i13 = 3;
            }
            textView3.setGravity(i13 | 48);
            textView3.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(2131749903, null)));
            if (org.telegram.messenger.id.f23157a0) {
                linearLayout3.addView(textView3, c8.ha.o(-1, -2));
                i14 = 5;
                linearLayout3.addView(imageView2, c8.ha.r(-2, -2, 5));
            } else {
                i14 = 5;
                linearLayout3.addView(imageView2, c8.ha.o(-2, -2));
                linearLayout3.addView(textView3, c8.ha.o(-1, -2));
            }
            if ("PASSWORD_MISSING".equals(tL_error.text)) {
                alertDialog$Builder.k(org.telegram.messenger.id.M0(2131749900, null), new a3.l(this, 23));
                alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
            } else {
                TextView textView4 = new TextView(getContext());
                org.telegram.ui.ActionBar.r6.V(textView4, i16, null);
                textView4.setTextSize(1, 16.0f);
                if (org.telegram.messenger.id.f23157a0) {
                    i15 = i14;
                } else {
                    i15 = 3;
                }
                org.telegram.messenger.k5.m(textView4, i15 | 48, null, 2131749902);
                linearLayout.addView(textView4, c8.ha.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                alertDialog$Builder.h(org.telegram.messenger.id.M0(2131747832, null), null);
            }
            if (twoStepVerificationActivity != null) {
                twoStepVerificationActivity.showDialog(u1Var);
            } else {
                alertDialog$Builder.p();
            }
        }
    }

    public final void R1() {
        throw new UnsupportedOperationException("Method not decompiled: bi.k7.R1():void");
    }

    public final void S1() {
        if (p10.i(this.f28616a).q() && (M1(this.f28616a, H1()) || this.Q2)) {
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
        long o4 = org.telegram.messenger.m5.o(peer);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(H1.title);
        sb2.append(" #");
        this.f4200u2.setText(org.telegram.messenger.id.a0(null, null, 2131749834, jg.g.m(H1.num, ',', sb2)));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.id.M0(2131749836, null));
        if (!p10.i(this.f28616a).q()) {
            spannableStringBuilder.append((CharSequence) " l");
            if (this.P2 == null) {
                this.P2 = new wp(2131232243, 0);
            }
            spannableStringBuilder.setSpan(this.P2, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        fi.d dVar = this.f4168c2;
        dVar.i(spannableStringBuilder, true, true);
        dVar.g(null, true);
        dVar.setOnClickListener(new y1(this, 4));
        this.X1.setWearPreview(qp.s1(this.f28616a).e2(o4));
        s2(2, true, null);
    }

    public final void T1(boolean z9) {
        int i7;
        ij ijVar = this.f4205z2;
        int i10 = 0;
        if (ijVar != null) {
            TLRPC.Message message = ijVar.f23262k;
            if (message != null) {
                TLRPC.MessageAction messageAction = message.action;
                if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                    i7 = ((TLRPC.TL_messageActionStarGiftUnique) messageAction).can_craft_at;
                }
            }
            i7 = 0;
        } else {
            TL_stars.SavedStarGift savedStarGift = this.f4203x2;
            if (savedStarGift != null) {
                i7 = savedStarGift.can_craft_at;
            }
            i7 = 0;
        }
        if (i7 > ConnectionsManager.getInstance(this.f28616a).getCurrentTime()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.I0);
            String M0 = org.telegram.messenger.id.M0(2131749778, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
            u1Var.R = M0;
            u1Var.T = org.telegram.messenger.id.a0(null, null, 2131749779, org.telegram.messenger.id.x(i7, true));
            jg.g.C(null, 2131747832, alertDialog$Builder, null);
            return;
        }
        TL_stars.TL_starGiftUnique H1 = H1();
        if (H1 == null) {
            return;
        }
        if (!TextUtils.isEmpty(H1.gift_address)) {
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, getContext(), this.I0);
            String M02 = org.telegram.messenger.id.M0(2131749793, null);
            org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.f27296a;
            u1Var2.R = M02;
            u1Var2.T = org.telegram.messenger.id.M0(2131749794, null);
            jg.g.C(null, 2131747832, alertDialog$Builder2, null);
            return;
        }
        e7 e7Var = this.X1;
        if (z9) {
            e7Var.M.a(this.f28616a, H1.gift_id, H1.getDocument(), H1.title);
            if (o1()) {
                d6 d6Var = e7Var.M;
                TL_stars.TL_starGiftUnique H12 = H1();
                if (H12 == null) {
                    d6Var.getClass();
                } else {
                    while (true) {
                        b6[] b6VarArr = d6Var.f3671n;
                        if (i10 >= b6VarArr.length) {
                            break;
                        }
                        b6 b6Var = b6VarArr[i10];
                        TL_stars.StarGift starGift = b6Var.h;
                        if (starGift == null) {
                            starGift = null;
                        }
                        if (starGift == null) {
                            b6Var.a(H12, true);
                            break;
                        }
                        i10++;
                    }
                    d6Var.d(true);
                }
            }
        }
        d6 d6Var2 = e7Var.M;
        d6 d6Var3 = e7Var.M;
        d6Var2.setOnCraft(new h2(this, 1));
        if (this.O2 == null) {
            zh.j3 j3Var = new zh.j3(this.f28616a, H1.gift_id);
            this.O2 = j3Var;
            j3Var.a();
        }
        d6Var3.setOnAddGift(new p4(this, H1, 1));
        d6Var3.setOnClose(new z1(this, 23));
        s2(4, true, null);
    }

    public final void U1(long j3) {
        fi.m3 m3Var = this.f4195q3;
        if (m3Var != null) {
            m3Var.f(true);
            this.f4195q3 = null;
        }
        dismiss();
        org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
        if (T != null && !t10.A(j3)) {
            Bundle bundle = new Bundle();
            if (j3 > 0) {
                bundle.putLong("user_id", j3);
                if (j3 == p10.i(this.f28616a).e()) {
                    bundle.putBoolean("my_profile", true);
                }
            } else {
                bundle.putLong("chat_id", -j3);
            }
            bundle.putBoolean("open_gifts", true);
            T.presentFragment(new ProfileActivity(bundle, null));
        }
    }

    public final void V1(boolean z9, vf.b bVar, Runnable runnable) {
        int i7;
        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
        if (z9) {
            i7 = 3;
        } else {
            i7 = 2;
        }
        ab.j jVar = new ab.j(this, twoStepVerificationActivity, z9, 1);
        twoStepVerificationActivity.Z = i7;
        twoStepVerificationActivity.f42055b0 = jVar;
        twoStepVerificationActivity.f42053a0 = z1();
        twoStepVerificationActivity.x0(new aa.s(this, runnable, bVar, twoStepVerificationActivity, 12));
    }

    public final void W1() {
        throw new UnsupportedOperationException("Method not decompiled: bi.k7.W1():void");
    }

    public final void X1(long j3, long j10, boolean z9, c20 c20Var) {
        String str;
        TLRPC.User user;
        String a02;
        CharSequence M0;
        TL_stars.TL_starGiftUnique H1 = H1();
        if (H1 == null) {
            return;
        }
        if (j3 >= 0) {
            TLRPC.User a22 = qp.s1(this.f28616a).a2(Long.valueOf(j3));
            str = t10.k(a22);
            user = a22;
        } else {
            TLRPC.Chat M02 = qp.s1(this.f28616a).M0(Long.valueOf(-j3));
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
        linearLayout.addView(new f6(getContext(), H1, user), c8.ha.t(-1, -2, 48, 0, -4, 0, 0));
        TextView textView = new TextView(getContext());
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f27960j5, this.I0);
        textView.setTextSize(1, 16.0f);
        if (j10 > 0) {
            a02 = org.telegram.messenger.id.K("Gift2TransferPriceText", (int) j10, ',', z1(), org.telegram.messenger.m5.t(j3));
        } else {
            a02 = org.telegram.messenger.id.a0(null, null, 2131749914, z1(), str);
        }
        textView.setText(org.telegram.messenger.g0.X2(a02));
        linearLayout.addView(textView, c8.ha.t(-1, -2, 48, 24, 4, 24, 4));
        tx0 tx0Var = new tx0(getContext(), this.I0);
        k1(tx0Var, ea.l(H1.attributes, TL_stars.starGiftAttributeModel.class));
        k1(tx0Var, ea.l(H1.attributes, TL_stars.starGiftAttributeBackdrop.class));
        k1(tx0Var, ea.l(H1.attributes, TL_stars.starGiftAttributePattern.class));
        if (!TextUtils.isEmpty(H1.slug) && (H1.flags & 256) != 0) {
            org.telegram.messenger.r1 i7 = org.telegram.messenger.r1.i();
            long j11 = H1.value_amount;
            String str2 = H1.value_currency;
            int h = org.telegram.messenger.r1.i().h(H1.value_currency);
            i7.getClass();
            tx0Var.c(org.telegram.messenger.id.M0(2131749592, null), rf.b.i("~", org.telegram.messenger.r1.g(str2, h, j11, true)), null, null);
        }
        linearLayout.addView(tx0Var, c8.ha.t(-1, -2, 48, 23, 16, 23, 4));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.I0);
        alertDialog$Builder.o(linearLayout);
        if (j10 > 0) {
            M0 = dd.T0(org.telegram.messenger.id.a0(null, null, 2131749921, Integer.valueOf((int) j10)));
        } else {
            M0 = org.telegram.messenger.id.M0(2131749922, null);
        }
        alertDialog$Builder.k(M0, new a1.c(c20Var, 12));
        alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
        u1Var.X0 = z9;
        u1Var.show();
    }

    public final void Y1(long j3, c20 c20Var) {
        TLRPC.Message message;
        long j10;
        TL_stars.SavedStarGift savedStarGift = this.f4203x2;
        if (savedStarGift != null && (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
            j10 = savedStarGift.transfer_stars;
        } else {
            ij ijVar = this.f4205z2;
            if (ijVar != null && (message = ijVar.f23262k) != null) {
                TLRPC.MessageAction messageAction = message.action;
                if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                    TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
                    if (tL_messageActionStarGiftUnique.gift instanceof TL_stars.TL_starGiftUnique) {
                        j10 = tL_messageActionStarGiftUnique.transfer_stars;
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
        X1(j3, j10, true, c20Var);
    }

    @Override
    public final boolean Z0() {
        return false;
    }

    public final void Z1() {
        TL_stars.InputSavedStarGift B1;
        long j3;
        long j10;
        long j11;
        boolean z9;
        boolean z10;
        boolean z11;
        String str;
        boolean z12;
        boolean z13;
        int i7;
        fi.m3 m3Var = this.f4195q3;
        if (m3Var != null) {
            m3Var.f(true);
            this.f4195q3 = null;
        }
        if (this.U2 == null && (B1 = B1()) != null) {
            ij ijVar = this.f4205z2;
            long j12 = this.P1;
            if (ijVar != null) {
                TLRPC.MessageAction messageAction = ijVar.f23262k.action;
                if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                    TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                    j10 = tL_messageActionStarGift.gift.f27185id;
                    j11 = tL_messageActionStarGift.upgrade_stars;
                    z9 = tL_messageActionStarGift.name_hidden;
                    TLRPC.TL_textWithEntities tL_textWithEntities = tL_messageActionStarGift.message;
                    if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    j3 = 0;
                    z11 = tL_messageActionStarGift.peer instanceof TLRPC.TL_peerChannel;
                    str = tL_messageActionStarGift.prepaid_upgrade_hash;
                    if (tL_messageActionStarGift.prepaid_upgrade) {
                        if (org.telegram.messenger.m5.o(tL_messageActionStarGift.from_id) != this.f4205z2.Z0()) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                    } else {
                        z12 = tL_messageActionStarGift.upgrade_separate;
                    }
                } else {
                    return;
                }
            } else {
                j3 = 0;
                TL_stars.SavedStarGift savedStarGift = this.f4203x2;
                if (savedStarGift != null) {
                    TL_stars.StarGift starGift = savedStarGift.gift;
                    j10 = starGift.f27185id;
                    j11 = savedStarGift.upgrade_stars;
                    if ((starGift instanceof TL_stars.TL_starGift) && savedStarGift.name_hidden) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    TLRPC.TL_textWithEntities tL_textWithEntities2 = savedStarGift.message;
                    if (tL_textWithEntities2 != null && !TextUtils.isEmpty(tL_textWithEntities2.text)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (j12 < 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    TL_stars.SavedStarGift savedStarGift2 = this.f4203x2;
                    str = savedStarGift2.prepaid_upgrade_hash;
                    z12 = savedStarGift2.upgrade_separate;
                } else {
                    return;
                }
            }
            TextView textView = this.f4192p2;
            if (z9) {
                if (z11) {
                    i7 = 2131750399;
                } else {
                    i7 = 2131750400;
                }
                textView.setText(org.telegram.messenger.id.M0(i7, null));
            } else if (z10) {
                textView.setText(org.telegram.messenger.id.M0(2131750397, null));
            } else {
                textView.setText(org.telegram.messenger.id.M0(2131750398, null));
            }
            if (!z9 && j11 > j3 && !z12) {
                z13 = true;
            } else {
                z13 = false;
            }
            wo woVar = this.f4190o2;
            woVar.a(z13, false);
            ArrayList arrayList = this.f4176g3;
            if (arrayList != null && (j11 > j3 || this.f4183k3 != null)) {
                a2();
                return;
            }
            if (arrayList == null) {
                ea.y(this.f28616a, false).K(j10, new y3(this, 2));
            }
            if (j11 <= j3 && this.f4183k3 == null) {
                this.j3 = true;
                TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                if (!TextUtils.isEmpty(str)) {
                    TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade tL_inputInvoiceStarGiftPrepaidUpgrade = new TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade();
                    tL_inputInvoiceStarGiftPrepaidUpgrade.hash = str;
                    tL_inputInvoiceStarGiftPrepaidUpgrade.peer = qp.s1(this.f28616a).j1(j12);
                    tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftPrepaidUpgrade;
                } else {
                    TLRPC.TL_inputInvoiceStarGiftUpgrade tL_inputInvoiceStarGiftUpgrade = new TLRPC.TL_inputInvoiceStarGiftUpgrade();
                    tL_inputInvoiceStarGiftUpgrade.keep_original_details = woVar.f40008a.f31263q;
                    tL_inputInvoiceStarGiftUpgrade.stargift = B1;
                    tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftUpgrade;
                }
                JSONObject u10 = hi.a3.u(this.I0, false);
                if (u10 != null) {
                    TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                    tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                    tL_dataJSON.data = u10.toString();
                    tL_payments_getPaymentForm.flags |= 1;
                }
                ConnectionsManager.getInstance(this.f28616a).sendRequest(tL_payments_getPaymentForm, new s4(this, 0));
            }
        }
    }

    public final void a2() {
        throw new UnsupportedOperationException("Method not decompiled: bi.k7.a2():void");
    }

    public final void b2() {
        TL_stars.TL_starGiftUnique H1 = H1();
        if (this.X2 != null && H1 != null && !TextUtils.isEmpty(H1.slug)) {
            Context context = getContext();
            int i7 = this.f28616a;
            wg.f1[] f1VarArr = {new wg.f1(context, i7, org.telegram.messenger.v1.a(i7).b(), 3, this.I0)};
            wg.f1 f1Var = f1VarArr[0];
            f1Var.f57744r2 = org.telegram.messenger.id.M0(2131749915, null);
            org.telegram.ui.Components.ja jaVar = f1Var.l1;
            if (jaVar != null) {
                jaVar.setTitle(f1Var.O0());
            }
            mg0 mg0Var = f1Var.T1;
            if (mg0Var != null) {
                mg0Var.setText(f1Var.O0());
            }
            wg.f1 f1Var2 = f1VarArr[0];
            f1Var2.f57751y2 = true;
            f1Var2.o1(false, true);
            wg.f1 f1Var3 = f1VarArr[0];
            f1Var3.f57746t2 = new ai.f1(1, this, f1VarArr);
            f1Var3.show();
        }
    }

    public final SpannableStringBuilder d2(TLRPC.Peer peer) {
        if (peer != null) {
            String r10 = org.telegram.messenger.m5.r(qp.s1(this.f28616a).e2(org.telegram.messenger.m5.o(peer)));
            if (!TextUtils.isEmpty(r10)) {
                return org.telegram.messenger.g0.U2(org.telegram.messenger.id.a0(null, null, 2131750044, rf.b.i("@", r10)), new b4(this, r10, 8));
            }
        }
        return null;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == qs.G3) {
            if (this.f4204y2 == ((v9) objArr[1])) {
                d6 d6Var = this.X1.M;
                if (d6Var == null || !d6Var.f3666h0) {
                    v2();
                }
            }
        }
    }

    @Override
    public final void dismiss() {
        if (this.T2.c(4) && this.X1.M.f3666h0) {
            return;
        }
        zh.j3 j3Var = this.O2;
        if (j3Var != null) {
            j3Var.b();
            this.O2 = null;
        }
        s6 s6Var = this.H2;
        if (s6Var != null) {
            s6Var.a();
        }
        super.dismiss();
    }

    public final SpannableStringBuilder e2(TL_stars.StarGift starGift) {
        if (starGift != null && !(starGift instanceof TL_stars.TL_starGiftUnique)) {
            return d2(starGift.released_by);
        }
        return null;
    }

    public final void h2(String str, TL_stars.TL_starGiftUnique tL_starGiftUnique, w9 w9Var) {
        boolean z9;
        boolean z10;
        s6 s6Var;
        TL_stars.TL_starGiftUnique tL_starGiftUnique2;
        this.A2 = str;
        this.B2 = tL_starGiftUnique;
        this.f4204y2 = w9Var;
        if (tL_starGiftUnique.resell_amount != null && !K1(this.f28616a, org.telegram.messenger.m5.o(tL_starGiftUnique.owner_id))) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.C2 = z9;
        if (!this.I2 && (s6Var = this.H2) != null && s6Var.f4685o && (tL_starGiftUnique2 = s6Var.f4682l) != null && tL_starGiftUnique2.f27185id != tL_starGiftUnique.f27185id) {
            s6Var.a();
            this.H2 = null;
            e7 e7Var = this.X1;
            e7Var.f3767b.setAlpha(1.0f);
            e7Var.f3769c.setAlpha(0.0f);
        }
        this.W1.b(this.f28616a, this.f4203x2);
        k2(tL_starGiftUnique, false, null, null);
        String str2 = tL_starGiftUnique.owner_address;
        String str3 = tL_starGiftUnique.gift_address;
        if (tL_starGiftUnique.host_id != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        TL_wallet.walletTransaction wallettransaction = this.f4165a3;
        w70 w70Var = this.Z1;
        if (wallettransaction == null && z10 && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            w70Var.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.g0.U2(org.telegram.messenger.id.M0(2131750182, null), new b4(this, str3, 3)), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(0.66f)));
            w70Var.setVisibility(0);
            org.telegram.ui.ActionBar.r6.V(w70Var, org.telegram.ui.ActionBar.k6.f28091q5, this.I0);
        } else {
            w70Var.setVisibility(8);
        }
        TL_wallet.walletTransaction wallettransaction2 = this.f4165a3;
        w70 w70Var2 = this.f4166b2;
        if (wallettransaction2 == null && !z10 && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            w70Var2.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.g0.U2(org.telegram.messenger.id.M0(2131750182, null), new b4(this, str3, 4)), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(0.66f)));
            w70Var2.setVisibility(0);
        } else {
            w70Var2.setVisibility(8);
        }
        w2();
        if (this.C2) {
            l2(tL_starGiftUnique);
            this.f4168c2.setOnClickListener(new y1(this, 12));
        }
        if (this.W2) {
            s2(0, false, null);
            this.f36276j1.n0(1);
            this.W2 = false;
        }
        v2();
    }

    public final void i2(org.telegram.messenger.ij r59, bi.w9 r60) {
        throw new UnsupportedOperationException("Method not decompiled: bi.k7.i2(org.telegram.messenger.ij, bi.w9):void");
    }

    public final void j1(TL_stars.StarGiftAttribute starGiftAttribute) {
        String M0;
        boolean z9;
        s6 s6Var;
        TL_stars.StarGiftAttribute starGiftAttribute2;
        k7 k7Var;
        ai.d0 d0Var;
        if (starGiftAttribute instanceof TL_stars.starGiftAttributeModel) {
            M0 = org.telegram.messenger.id.M0(2131750388, null);
            z9 = true;
        } else if (starGiftAttribute instanceof TL_stars.starGiftAttributePattern) {
            M0 = org.telegram.messenger.id.M0(2131750381, null);
            z9 = true;
        } else if (starGiftAttribute instanceof TL_stars.starGiftAttributeBackdrop) {
            M0 = org.telegram.messenger.id.M0(2131750389, null);
            z9 = false;
        } else {
            return;
        }
        if (!this.I2 && ((s6Var = this.H2) == null || !s6Var.f4685o)) {
            boolean[] zArr = new boolean[1];
            org.telegram.ui.Components.jc[] jcVarArr = new org.telegram.ui.Components.jc[1];
            Integer[] numArr = new Integer[1];
            String G1 = G1(starGiftAttribute.rarity, numArr);
            if (starGiftAttribute.rarity instanceof TL_stars.TL_starGiftAttributeRarity) {
                starGiftAttribute2 = starGiftAttribute;
                k7Var = this;
                d0Var = new ai.d0(this, zArr, starGiftAttribute2, jcVarArr, 5);
            } else {
                starGiftAttribute2 = starGiftAttribute;
                k7Var = this;
                d0Var = null;
            }
            jcVarArr[0] = (org.telegram.ui.Components.jc) ((qx0) k7Var.f4164a2.e(M0, starGiftAttribute2.name, G1, d0Var, numArr[0]).getChildAt(1)).getChildAt(0);
            return;
        }
        x6 x6Var = new x6(getContext(), this.I0, new h2(this, 0));
        TableRow tableRow = new TableRow(getContext());
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
        tx0 tx0Var = this.f4164a2;
        tableRow.addView(new sx0(tx0Var, M0), layoutParams);
        tableRow.addView(new qx0(tx0Var, x6Var, true), new TableRow.LayoutParams(0, -1, 1.0f));
        tx0Var.addView(tableRow);
        s6 s6Var2 = this.H2;
        if (s6Var2 != null) {
            if (!z9) {
                s6Var2.d = x6Var;
            }
            if (z9) {
                s6Var2.f4675c = x6Var;
            }
            if (z9) {
                s6Var2.f4674b = x6Var;
            }
        }
    }

    public final void j2(org.telegram.tgnet.tl.TL_stars.SavedStarGift r36, bi.w9 r37) {
        throw new UnsupportedOperationException("Method not decompiled: bi.k7.j2(org.telegram.tgnet.tl.TL_stars$SavedStarGift, bi.w9):void");
    }

    @Override
    public org.telegram.ui.Components.hc k() {
        return new org.telegram.ui.Components.hc(this.f4177h2, this.I0);
    }

    public final void k2(org.telegram.tgnet.tl.TL_stars.TL_starGiftUnique r36, boolean r37, org.telegram.tgnet.TLObject r38, org.telegram.tgnet.TLRPC.TL_textWithEntities r39) {
        throw new UnsupportedOperationException("Method not decompiled: bi.k7.k2(org.telegram.tgnet.tl.TL_stars$TL_starGiftUnique, boolean, org.telegram.tgnet.TLObject, org.telegram.tgnet.TLRPC$TL_textWithEntities):void");
    }

    public final void l1(LinearLayout linearLayout, int i7, int i10, int i11, String str, boolean z9) {
        int i12;
        int i13;
        ImageView imageView = new ImageView(getContext());
        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(i7);
        org.telegram.ui.ActionBar.f6 f6Var = this.I0;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        org.telegram.ui.ActionBar.r6.t(imageView, i11, f6Var, mode);
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
        linearLayout.addView(imageView, c8.ha.t(i10, i10, 16, i12, 0, i13, 0));
        TextView textView = new TextView(getContext());
        textView.setTextSize(1, 13.0f);
        int i14 = org.telegram.ui.ActionBar.k6.f28110r5;
        org.telegram.ui.ActionBar.r6.V(textView, i14, this.I0);
        textView.setText(str);
        linearLayout.addView(textView, c8.ha.t(-2, -2, 16, 4, 0, 0, 0));
        if (z9) {
            ImageView imageView2 = new ImageView(getContext());
            imageView2.setScaleType(scaleType);
            imageView2.setImageResource(2131232250);
            org.telegram.ui.ActionBar.r6.t(imageView2, i14, this.I0, mode);
            linearLayout.addView(imageView2, c8.ha.t(11, 11, 16, 5, 0, 2, 0));
        }
    }

    public final void l2(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        cg.a resellAmount = tL_starGiftUnique.getResellAmount(cg.b.f6162a);
        boolean z9 = tL_starGiftUnique.resale_ton_only;
        fi.d dVar = this.f4168c2;
        if (z9) {
            dVar.i(dd.s1(dd.V0(org.telegram.messenger.id.a0(null, null, 2131746149, tL_starGiftUnique.getResellAmount(cg.b.f6163b).d()), true), true), !this.W2, true);
            dVar.g(dd.T0(org.telegram.messenger.id.H(',', "ResellGiftBuyEq", (int) resellAmount.a())), !this.W2);
            return;
        }
        dVar.i(dd.T0(org.telegram.messenger.id.H(',', "ResellGiftBuy", (int) resellAmount.a())), !this.W2, true);
        dVar.g(null, !this.W2);
    }

    public final void m1(TL_stars.InputSavedStarGift inputSavedStarGift, TLRPC.Updates updates, Runnable runnable) {
        TLRPC.Message message;
        TL_stars.StarGift starGift;
        if (updates == null) {
            ea.y(this.f28616a, false).P(x1());
            dismiss();
            return;
        }
        TLRPC.Update update = updates.update;
        if (update instanceof TL_update.TL_updateNewMessage) {
            message = ((TL_update.TL_updateNewMessage) update).message;
        } else {
            if (updates.updates != null) {
                for (int i7 = 0; i7 < updates.updates.size(); i7++) {
                    TLRPC.Update update2 = updates.updates.get(i7);
                    if (update2 instanceof TL_update.TL_updateNewMessage) {
                        message = ((TL_update.TL_updateNewMessage) update2).message;
                        break;
                    }
                }
            }
            message = null;
        }
        if (message != null) {
            TL_stars.SavedStarGift savedStarGift = this.f4203x2;
            if (savedStarGift != null && (!(inputSavedStarGift instanceof TL_stars.TL_inputSavedStarGiftUser) ? !(!(inputSavedStarGift instanceof TL_stars.TL_inputSavedStarGiftChat) ? !(inputSavedStarGift instanceof TL_stars.TL_inputSavedStarGiftSlug) || (starGift = savedStarGift.gift) == null || !TextUtils.equals(starGift.slug, ((TL_stars.TL_inputSavedStarGiftSlug) inputSavedStarGift).slug) : savedStarGift.saved_id != ((TL_stars.TL_inputSavedStarGiftChat) inputSavedStarGift).saved_id) : savedStarGift.msg_id == ((TL_stars.TL_inputSavedStarGiftUser) inputSavedStarGift).msg_id)) {
                TLRPC.MessageAction messageAction = message.action;
                if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                    this.I2 = true;
                    TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
                    TL_stars.SavedStarGift savedStarGift2 = this.f4203x2;
                    savedStarGift2.gift = tL_messageActionStarGiftUnique.gift;
                    savedStarGift2.msg_id = message.f26977id;
                    savedStarGift2.flags = (savedStarGift2.flags | 8) & (-2049);
                    savedStarGift2.saved_id = 0L;
                    savedStarGift2.unsaved = !tL_messageActionStarGiftUnique.saved;
                    savedStarGift2.refunded = tL_messageActionStarGiftUnique.refunded;
                    savedStarGift2.can_upgrade = false;
                    savedStarGift2.can_resell_at = tL_messageActionStarGiftUnique.can_resell_at;
                    savedStarGift2.can_transfer_at = tL_messageActionStarGiftUnique.can_transfer_at;
                    savedStarGift2.can_export_at = tL_messageActionStarGiftUnique.can_export_at;
                    j2(savedStarGift2, this.f4204y2);
                    this.f4176g3 = null;
                    this.I2 = false;
                    w9 w9Var = this.f4204y2;
                    if (w9Var != null) {
                        w9Var.d();
                    } else {
                        ea.y(this.f28616a, false).P(this.P1);
                    }
                    org.telegram.messenger.g0.h3(runnable);
                    return;
                }
            }
            if (this.f4204y2 == null) {
                ea.y(this.f28616a, false).P(x1());
            }
            this.I2 = true;
            this.f4203x2 = null;
            this.f4202w2 = false;
            ij ijVar = new ij(this.f28616a, message, false, false);
            ijVar.M5();
            i2(ijVar, this.f4204y2);
            this.f4176g3 = null;
            this.I2 = false;
            org.telegram.messenger.g0.h3(runnable);
            return;
        }
        ea.y(this.f28616a, false).P(x1());
        dismiss();
    }

    public final void m2(TL_stars.TL_starGiftUnique tL_starGiftUnique, boolean z9) {
        if (z9) {
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_peerUser.user_id = p10.i(this.f28616a).e();
            tL_starGiftUnique.host_id = tL_peerUser;
            tL_starGiftUnique.flags |= 4096;
        } else {
            tL_starGiftUnique.host_id = null;
            tL_starGiftUnique.flags &= -4097;
        }
        this.X1.setWalletDisplayed(z9);
        w2();
    }

    public final boolean n1() {
        int i7;
        boolean z9;
        boolean z10;
        TLRPC.Peer peer;
        if (B1() == null) {
            return false;
        }
        ij ijVar = this.f4205z2;
        if (ijVar != null) {
            TLRPC.MessageAction messageAction = ijVar.f23262k.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                if (tL_messageActionStarGift.peer != null) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                boolean Q3 = ijVar.Q3();
                if (ij.B0(this.f4205z2.f23262k) == p10.i(this.f28616a).e()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                int currentTime = qp.s1(this.f28616a).E6 - (ConnectionsManager.getInstance(this.f28616a).getCurrentTime() - this.f4205z2.f23262k.date);
                if (((z9 || (Q3 && !z10)) && ((peer = tL_messageActionStarGift.peer) == null || !L1(this.f28616a, org.telegram.messenger.m5.o(peer)))) || tL_messageActionStarGift.converted || tL_messageActionStarGift.convert_stars <= 0 || currentTime <= 0) {
                    return false;
                }
                return true;
            }
        } else {
            TL_stars.SavedStarGift savedStarGift = this.f4203x2;
            if (savedStarGift != null) {
                int currentTime2 = qp.s1(this.f28616a).E6 - (ConnectionsManager.getInstance(this.f28616a).getCurrentTime() - savedStarGift.date);
                int i10 = this.f28616a;
                long j3 = this.P1;
                if (L1(i10, j3)) {
                    int i11 = this.f4203x2.flags;
                    if (j3 < 0) {
                        i7 = 2048;
                    } else {
                        i7 = 8;
                    }
                    if ((i7 & i11) != 0 && (i11 & 16) != 0 && (i11 & 2) != 0 && currentTime2 > 0) {
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
        long o4 = org.telegram.messenger.m5.o(peer);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(H1.title);
        sb2.append(" #");
        this.f4200u2.setText(org.telegram.messenger.id.a0(null, null, 2131749834, jg.g.m(H1.num, ',', sb2)));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.id.M0(2131749836, null));
        if (o4 == p10.i(this.f28616a).e() && !p10.i(this.f28616a).q()) {
            spannableStringBuilder.append((CharSequence) " l");
            if (this.P2 == null) {
                this.P2 = new wp(2131232243, 0);
            }
            spannableStringBuilder.setSpan(this.P2, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        fi.d dVar = this.f4168c2;
        dVar.i(spannableStringBuilder, true, true);
        dVar.g(null, true);
        dVar.setOnClickListener(new y1(this, 27));
        this.X1.setWearPreview(qp.s1(this.f28616a).e2(o4));
        s2(2, false, null);
        this.f4198s2 = true;
    }

    public final boolean o1() {
        int i7;
        TL_stars.TL_starGiftUnique H1 = H1();
        if (H1 == null || H1.crafted || !L1(this.f28616a, org.telegram.messenger.m5.o(H1.owner_id))) {
            return false;
        }
        ij ijVar = this.f4205z2;
        if (ijVar != null) {
            TLRPC.Message message = ijVar.f23262k;
            if (message == null) {
                return false;
            }
            TLRPC.MessageAction messageAction = message.action;
            if (!(messageAction instanceof TLRPC.TL_messageActionStarGiftUnique)) {
                return false;
            }
            i7 = ((TLRPC.TL_messageActionStarGiftUnique) messageAction).can_craft_at;
        } else {
            TL_stars.SavedStarGift savedStarGift = this.f4203x2;
            if (savedStarGift != null && (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
                i7 = savedStarGift.can_craft_at;
            }
            return false;
        }
        int currentTime = ConnectionsManager.getInstance(this.f28616a).getCurrentTime();
        if (i7 <= 0 || currentTime < i7) {
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
            JSONObject u10 = hi.a3.u(this.I0, false);
            if (u10 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = u10.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            ConnectionsManager.getInstance(this.f28616a).sendRequest(tL_payments_getPaymentForm, new g2(this, charSequence, H1, tL_inputInvoiceStarGiftDropOriginalDetails, 1));
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        qs.f(this.f28616a).c(this, qs.G3);
    }

    @Override
    public final void onBackPressed() {
        e7 e7Var;
        d6 d6Var;
        if (this.T2.c(4) && (e7Var = this.X1) != null && (d6Var = e7Var.M) != null) {
            if (d6Var.f3666h0) {
                return;
            }
            if (d6Var.f3667i0) {
                super.onBackPressed();
                return;
            }
        }
        if (!this.f4198s2 && this.T2.f3944c > 0 && !this.f4168c2.Q && !this.f4174f3) {
            ij ijVar = this.f4205z2;
            if (ijVar != null) {
                i2(ijVar, null);
            } else {
                TL_stars.SavedStarGift savedStarGift = this.f4203x2;
                if (savedStarGift != null) {
                    j2(savedStarGift, this.f4204y2);
                } else {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = this.B2;
                    if (tL_starGiftUnique != null) {
                        h2(this.A2, tL_starGiftUnique, this.f4204y2);
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
        qs.f(this.f28616a).n(this, qs.G3);
    }

    public final boolean p1() {
        throw new UnsupportedOperationException("Method not decompiled: bi.k7.p1():boolean");
    }

    public final void p2(View view, CharSequence charSequence, boolean z9) {
        Layout layout;
        org.telegram.ui.Components.kc kcVar;
        float primaryHorizontal;
        int i7;
        fi.m3 m3Var = this.f4195q3;
        if ((m3Var == null || !m3Var.V || this.f4197r3 != view) && view != null) {
            if (z9) {
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
                        org.telegram.ui.Components.kc[] kcVarArr = (org.telegram.ui.Components.kc[]) spanned.getSpans(0, spanned.length(), org.telegram.ui.Components.kc.class);
                        if (kcVarArr != null && kcVarArr.length > 0) {
                            primaryHorizontal = layout.getPrimaryHorizontal(spanned.getSpanStart(kcVarArr[kcVarArr.length - 1])) + view.getPaddingLeft() + (kcVar.a() / 2.0f);
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
            m5 m5Var = this.Q1;
            m5Var.getLocationOnScreen(iArr);
            int[] iArr2 = {iArr2[0] - iArr[0], iArr2[1] - iArr[1]};
            fi.m3 m3Var2 = this.f4195q3;
            if (m3Var2 != null) {
                m3Var2.f(true);
                this.f4195q3 = null;
            }
            fi.m3 m3Var3 = new fi.m3(getContext(), 3);
            m3Var3.r(!z9);
            m3Var3.u(charSequence);
            m3Var3.p(0.0f, (iArr2[0] + primaryHorizontal) - (org.telegram.messenger.g0.L(16.0f) + this.f28649t0));
            float L = (iArr2[1] - org.telegram.messenger.g0.L(100.0f)) - (view.getHeight() / 2.0f);
            if (z9) {
                i7 = 18;
            } else {
                i7 = 0;
            }
            m3Var3.setTranslationY(L + org.telegram.messenger.g0.L(i7 + 4.33f));
            m3Var3.d = 3000L;
            m3Var3.setPadding(org.telegram.messenger.g0.L(16.0f) + this.f28649t0, 0, org.telegram.messenger.g0.L(16.0f) + this.f28649t0, 0);
            m3Var3.f12436q0 = new s2(m3Var3, 0);
            m3Var3.w();
            m5Var.addView(m3Var3, c8.ha.c(100.0f, -1));
            this.f4195q3 = m3Var3;
            this.f4197r3 = view;
        }
    }

    public final void q1() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.I0);
        String M0 = org.telegram.messenger.id.M0(2131750267, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
        u1Var.R = M0;
        u1Var.T = org.telegram.messenger.id.M0(2131750268, null);
        TL_stars.TL_starGiftUnique H1 = H1();
        if (H1 != null && !TextUtils.isEmpty(H1.slug)) {
            alertDialog$Builder.k(org.telegram.messenger.id.M0(2131747806, null), new o4(this, H1, 1));
        }
        jg.g.w(null, 2131752589, alertDialog$Builder, null);
    }

    public final void q2(int i7, Context context, boolean z9) {
        int i10;
        int i11;
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        FrameLayout frameLayout = new FrameLayout(context);
        int L = org.telegram.messenger.g0.L(64.0f);
        int i12 = org.telegram.ui.ActionBar.k6.Ci;
        ShapeDrawable L2 = org.telegram.ui.ActionBar.k6.L(L, org.telegram.ui.ActionBar.k6.w0(i12, this.I0));
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i12);
        org.telegram.ui.ActionBar.f6 f6Var = this.I0;
        frameLayout.setBackground(L2);
        org.telegram.ui.ActionBar.r6.k(frameLayout, L2, N, null, f6Var);
        f10.addView(frameLayout, c8.ha.t(64, 64, 49, 0, 6, 0, 0));
        ?? imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.f(2131624291, 42, 42, null);
        frameLayout.addView((View) imageView, c8.ha.r(64, 64, 17));
        imageView.d();
        TextView b10 = c8.qa.b(context, 20.0f, org.telegram.ui.ActionBar.k6.G6, true, null);
        b10.setGravity(17);
        if (z9) {
            i10 = 2131750006;
        } else {
            i10 = 2131749912;
        }
        b10.setText(org.telegram.messenger.id.M0(i10, null));
        f10.addView(b10, c8.ha.t(-1, -2, 48, 24, 14, 24, 0));
        TextView b11 = c8.qa.b(context, 14.0f, org.telegram.ui.ActionBar.k6.F6, false, null);
        b11.setGravity(17);
        if (z9) {
            i11 = 2131750007;
        } else {
            i11 = 2131749913;
        }
        b11.setText(org.telegram.messenger.id.a0(null, null, i11, org.telegram.messenger.id.c0(Math.max(10, i7))));
        f10.addView(b11, c8.ha.t(-1, -2, 48, 24, 6, 24, 6));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, this.I0);
        alertDialog$Builder.o(f10);
        alertDialog$Builder.k(org.telegram.messenger.id.M0(2131747832, null), null);
        alertDialog$Builder.p();
    }

    @Override
    public final void r0() {
        fi.m3 m3Var = this.f4195q3;
        if (m3Var != null) {
            m3Var.f(true);
            this.f4195q3 = null;
        }
    }

    public final void r1(long j3, TL_stars.starGiftDepositPayload stargiftdepositpayload, vf.b bVar, wg.f1 f1Var) {
        TL_wallet.nftItem nftitem = this.X2;
        TL_stars.TL_starGiftUnique H1 = H1();
        if (nftitem != null && H1 != null && !TextUtils.isEmpty(H1.slug)) {
            bVar.d();
            q3 q3Var = new q3(this, bVar, f1Var, j3, H1, nftitem, 0);
            if (stargiftdepositpayload != null) {
                q3Var.a(stargiftdepositpayload);
                return;
            }
            TL_stars.depositStarGift depositstargift = new TL_stars.depositStarGift();
            depositstargift.peer = qp.s1(this.f28616a).j1(j3);
            depositstargift.slug = H1.slug;
            ConnectionsManager.getInstance(this.f28616a).sendRequestTyped(depositstargift, new d3.b(1), new q2(this, bVar, f1Var, q3Var, 1));
        }
    }

    public final void r2(boolean z9, org.telegram.ui.ActionBar.u1 u1Var, vf.b bVar, Runnable runnable) {
        bVar.d();
        p10 i7 = p10.i(this.f28616a);
        TL_account.tmpPassword tmppassword = i7.f24499y;
        if (tmppassword != null && tmppassword.valid_until < ConnectionsManager.getInstance(this.f28616a).getCurrentTime() + 60) {
            i7.f24499y = null;
            i7.v(false);
        }
        TL_account.tmpPassword tmppassword2 = i7.f24499y;
        if (tmppassword2 == null) {
            V1(z9, bVar, runnable);
        } else {
            J1(tmppassword2.tmp_password, null, z9, new n3(this, z9, bVar, runnable, u1Var));
        }
    }

    @Override
    public final void s0() {
        super.s0();
        try {
            P(org.telegram.ui.ActionBar.k6.f27925h5);
            e7 e7Var = this.X1;
            if (e7Var != null) {
                e7Var.l();
            }
            wp wpVar = this.V2;
            if (wpVar != null) {
                Drawable drawable = wpVar.f40016c;
                if (drawable instanceof f7) {
                    ((f7) drawable).d.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ci, this.I0));
                    fi.d dVar = this.f4168c2;
                    if (dVar != null) {
                        dVar.invalidate();
                    }
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void s1(final long j3, final c20 c20Var) {
        TLRPC.Message message;
        long o4;
        long j10;
        TL_stars.InputSavedStarGift B1 = B1();
        if (B1 != null) {
            TL_stars.SavedStarGift savedStarGift = this.f4203x2;
            if (savedStarGift != null && (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
                j10 = savedStarGift.transfer_stars;
                o4 = this.P1;
            } else {
                ij ijVar = this.f4205z2;
                if (ijVar != null && (message = ijVar.f23262k) != null) {
                    TLRPC.MessageAction messageAction = message.action;
                    if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                        TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
                        o4 = org.telegram.messenger.m5.o(tL_messageActionStarGiftUnique.gift.owner_id);
                        j10 = tL_messageActionStarGiftUnique.transfer_stars;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            if (j10 <= 0) {
                TL_stars.transferStarGift transferstargift = new TL_stars.transferStarGift();
                transferstargift.stargift = B1;
                transferstargift.to_id = qp.s1(this.f28616a).j1(j3);
                final long j11 = o4;
                ConnectionsManager.getInstance(this.f28616a).sendRequest(transferstargift, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        boolean z9 = tLObject instanceof TLRPC.Updates;
                        k7 k7Var = k7.this;
                        if (z9) {
                            qp.s1(k7Var.f28616a).O3((TLRPC.Updates) tLObject, false);
                        }
                        org.telegram.messenger.g0.h3(new i3(k7Var, c20Var, tL_error, tLObject, j3, j11));
                    }
                });
                return;
            }
            final long j12 = o4;
            ea y10 = ea.y(this.f28616a, false);
            if (!y10.f3810e) {
                y10.r(new w2(this, y10, j3, c20Var, 0));
                return;
            }
            final TLRPC.TL_inputInvoiceStarGiftTransfer tL_inputInvoiceStarGiftTransfer = new TLRPC.TL_inputInvoiceStarGiftTransfer();
            tL_inputInvoiceStarGiftTransfer.stargift = B1;
            tL_inputInvoiceStarGiftTransfer.to_id = qp.s1(this.f28616a).j1(j3);
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftTransfer;
            JSONObject u10 = hi.a3.u(this.I0, false);
            if (u10 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = u10.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            ConnectionsManager.getInstance(this.f28616a).sendRequest(tL_payments_getPaymentForm, new RequestDelegate() {
                @Override
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    final k7 k7Var = k7.this;
                    final TLRPC.TL_inputInvoiceStarGiftTransfer tL_inputInvoiceStarGiftTransfer2 = tL_inputInvoiceStarGiftTransfer;
                    final long j13 = j3;
                    final long j14 = j12;
                    final c20 c20Var2 = c20Var;
                    org.telegram.messenger.g0.h3(new Runnable() {
                        @Override
                        public final void run() {
                            TLObject tLObject2 = tLObject;
                            boolean z9 = tLObject2 instanceof TLRPC.PaymentForm;
                            k7 k7Var2 = k7.this;
                            c20 c20Var3 = c20Var2;
                            if (z9) {
                                TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject2;
                                int i7 = 0;
                                qp.s1(k7Var2.f28616a).Y3(paymentForm.users, false);
                                TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
                                tL_payments_sendStarsForm.form_id = paymentForm.form_id;
                                tL_payments_sendStarsForm.invoice = tL_inputInvoiceStarGiftTransfer2;
                                ArrayList<TLRPC.TL_labeledPrice> arrayList = paymentForm.invoice.prices;
                                int size = arrayList.size();
                                long j15 = 0;
                                while (i7 < size) {
                                    TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i7);
                                    i7++;
                                    j15 += tL_labeledPrice.amount;
                                }
                                ConnectionsManager.getInstance(k7Var2.f28616a).sendRequest(tL_payments_sendStarsForm, new t2(k7Var2, j13, j14, c20Var3, j15));
                                return;
                            }
                            TLRPC.TL_error tL_error2 = tL_error;
                            c20Var3.a(tL_error2);
                            org.telegram.ui.Components.cc Y = k7Var2.k().Y(tL_error2);
                            Y.f32555t = true;
                            Y.j();
                        }
                    });
                }
            });
        }
    }

    public final void s2(int r12, boolean r13, bi.k1 r14) {
        throw new UnsupportedOperationException("Method not decompiled: bi.k7.s2(int, boolean, bi.k1):void");
    }

    @Override
    public final void show() {
        ij ijVar;
        TLRPC.Message message;
        if (qp.s1(this.f28616a).v2()) {
            org.telegram.ui.b.b(this.f28616a);
            return;
        }
        if (this.A2 != null && this.B2 == null) {
            org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, getContext(), null);
            u1Var.r(500L);
            TL_stars.getUniqueStarGift getuniquestargift = new TL_stars.getUniqueStarGift();
            getuniquestargift.slug = this.A2;
            ConnectionsManager.getInstance(this.f28616a).sendRequest(getuniquestargift, new j(2, this, u1Var));
        } else if (this.f4203x2 == null && (ijVar = this.f4205z2) != null && (message = ijVar.f23262k) != null) {
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                if (tL_messageActionStarGift.upgraded) {
                    if (tL_messageActionStarGift.upgrade_msg_id != 0) {
                        org.telegram.ui.ActionBar.u1 u1Var2 = new org.telegram.ui.ActionBar.u1(3, getContext(), null);
                        u1Var2.r(500L);
                        TLRPC.TL_messages_getMessages tL_messages_getMessages = new TLRPC.TL_messages_getMessages();
                        tL_messages_getMessages.f27052id.add(Integer.valueOf(tL_messageActionStarGift.upgrade_msg_id));
                        ConnectionsManager.getInstance(this.f28616a).sendRequest(tL_messages_getMessages, new f2(this, tL_messageActionStarGift, u1Var2, 0));
                        return;
                    } else if (B1() != null) {
                        org.telegram.ui.ActionBar.u1 u1Var3 = new org.telegram.ui.ActionBar.u1(3, getContext(), null);
                        u1Var3.r(500L);
                        ea.y(this.f28616a, false).M(B1(), new ai.f1(2, this, u1Var3));
                        return;
                    }
                }
            }
        }
        super.show();
    }

    public final void t1() {
        TL_stars.InputSavedStarGift B1;
        long j3;
        fi.d dVar = this.f4168c2;
        if (!dVar.Q && (B1 = B1()) != null) {
            ij ijVar = this.f4205z2;
            String str = null;
            long j10 = 0;
            if (ijVar != null) {
                TLRPC.MessageAction messageAction = ijVar.f23262k.action;
                if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                    TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                    j3 = tL_messageActionStarGift.upgrade_stars;
                    if (j3 <= 0) {
                        str = tL_messageActionStarGift.prepaid_upgrade_hash;
                    }
                } else {
                    return;
                }
            } else {
                TL_stars.SavedStarGift savedStarGift = this.f4203x2;
                if (savedStarGift != null) {
                    j3 = savedStarGift.upgrade_stars;
                    if (j3 <= 0) {
                        str = savedStarGift.prepaid_upgrade_hash;
                    }
                } else {
                    return;
                }
            }
            int i7 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
            if (i7 > 0 || this.f4183k3 != null) {
                dVar.setLoading(true);
                wo woVar = this.f4190o2;
                if (i7 > 0) {
                    TL_stars.upgradeStarGift upgradestargift = new TL_stars.upgradeStarGift();
                    upgradestargift.keep_original_details = woVar.f40008a.f31263q;
                    upgradestargift.stargift = B1;
                    ConnectionsManager.getInstance(this.f28616a).sendRequest(upgradestargift, new j(4, this, B1));
                    return;
                }
                int i10 = 0;
                ea y10 = ea.y(this.f28616a, false);
                if (!y10.f3810e) {
                    y10.r(new a1.e(28, this, y10));
                    return;
                }
                TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
                tL_payments_sendStarsForm.form_id = this.f4183k3.form_id;
                if (!TextUtils.isEmpty(str)) {
                    TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade tL_inputInvoiceStarGiftPrepaidUpgrade = new TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade();
                    tL_inputInvoiceStarGiftPrepaidUpgrade.hash = str;
                    tL_inputInvoiceStarGiftPrepaidUpgrade.peer = qp.s1(this.f28616a).j1(this.P1);
                    tL_payments_sendStarsForm.invoice = tL_inputInvoiceStarGiftPrepaidUpgrade;
                } else {
                    TLRPC.TL_inputInvoiceStarGiftUpgrade tL_inputInvoiceStarGiftUpgrade = new TLRPC.TL_inputInvoiceStarGiftUpgrade();
                    tL_inputInvoiceStarGiftUpgrade.keep_original_details = woVar.f40008a.f31263q;
                    tL_inputInvoiceStarGiftUpgrade.stargift = B1;
                    tL_payments_sendStarsForm.invoice = tL_inputInvoiceStarGiftUpgrade;
                }
                ArrayList<TLRPC.TL_labeledPrice> arrayList = this.f4183k3.invoice.prices;
                int size = arrayList.size();
                while (i10 < size) {
                    TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i10);
                    i10++;
                    j10 += tL_labeledPrice.amount;
                }
                ConnectionsManager.getInstance(this.f28616a).sendRequest(tL_payments_sendStarsForm, new f0(this, str, B1, j10, 1));
            }
        }
    }

    public final void t2(boolean z9) {
        boolean z10;
        int i7;
        int i10;
        TL_stars.TL_starGiftUnique H1 = H1();
        if (H1 == null) {
            return;
        }
        qp.e1().edit().putInt("statusgiftpage", 3).apply();
        boolean M1 = M1(this.f28616a, H1());
        boolean z11 = !M1;
        boolean M12 = M1(this.f28616a, H1());
        fi.d dVar = this.f4168c2;
        if (M12) {
            qp.s1(this.f28616a).g5(x1(), new TLRPC.TL_emojiStatusEmpty(), null);
            z10 = z11;
        } else {
            z10 = z11;
            long x12 = x1();
            if (x12 >= 0) {
                if (!p10.i(this.f28616a).q()) {
                    org.telegram.ui.Components.cc P = k().P(2131624216, org.telegram.messenger.g0.x2(org.telegram.messenger.id.M0(2131750424, null), new z1(this, 2)));
                    P.f32555t = true;
                    P.j();
                    return;
                }
            } else if (!z9) {
                qp s12 = qp.s1(this.f28616a);
                dVar.setLoading(true);
                qp.s1(this.f28616a).G0().a(x12, new b2(this, s12, x12, 0));
                return;
            }
            TLRPC.TL_inputEmojiStatusCollectible tL_inputEmojiStatusCollectible = new TLRPC.TL_inputEmojiStatusCollectible();
            tL_inputEmojiStatusCollectible.collectible_id = H1.f27185id;
            qp.s1(this.f28616a).g5(x1(), tL_inputEmojiStatusCollectible, H1);
        }
        x5 x5Var = this.X1.I[1];
        if (!M1) {
            i7 = 2131231102;
        } else {
            i7 = 2131231103;
        }
        if (!M1) {
            i10 = 2131750423;
        } else {
            i10 = 2131750426;
        }
        x5Var.e(i7, org.telegram.messenger.id.M0(i10, null), true);
        if (this.f4198s2) {
            dismiss();
            return;
        }
        k1 k1Var = new k1(1, this, z10);
        if (this.T2.c(0)) {
            k1Var.run();
        } else {
            s2(0, true, k1Var);
        }
        dVar.i(org.telegram.messenger.id.M0(2131747832, null), !this.W2, true);
        dVar.g(null, !this.W2);
        dVar.setOnClickListener(new y1(this, 5));
    }

    public final void u2() {
        FrameLayout frameLayout = this.f4173f2;
        int visibility = frameLayout.getVisibility();
        FrameLayout frameLayout2 = this.f4177h2;
        FrameLayout frameLayout3 = this.d2;
        if (visibility == 0) {
            frameLayout3.setTranslationY(this.T2.a(1) * (-frameLayout.getMeasuredHeight()));
            frameLayout.setTranslationY((1.0f - this.T2.a(1)) * frameLayout.getMeasuredHeight());
            frameLayout2.setTranslationY(this.T2.a(1) * (-frameLayout.getMeasuredHeight()));
            return;
        }
        frameLayout3.setTranslationY(0.0f);
        frameLayout.setTranslationY(0.0f);
        frameLayout2.setTranslationY(0.0f);
    }

    public final void v2() {
        boolean I1 = I1(false);
        f5 f5Var = this.R1;
        f5Var.setPosition(I1 ? 1 : 0);
        f5Var.D(false);
        if (this.f4204y2 != null && !I1(true) && this.f4204y2.e() < this.f4204y2.c()) {
            this.f4204y2.a();
        }
    }

    public final int w1() {
        if (this.T2.d(1)) {
            return this.f4182k2.getMeasuredHeight();
        }
        if (this.T2.d(2)) {
            return this.f4199t2.getMeasuredHeight();
        }
        if (this.T2.d(3)) {
            return this.f4201v2.getMeasuredHeight();
        }
        if (this.T2.d(4)) {
            return 0;
        }
        return this.Y1.getMeasuredHeight();
    }

    public final void w2() {
        TL_stars.TL_starGiftUnique H1 = H1();
        TL_wallet.nftItem nftitem = this.X2;
        LinearLayout linearLayout = this.f4194q2;
        if (nftitem != null && H1 != null) {
            this.Z1.setVisibility(8);
            this.f4166b2.setVisibility(8);
            boolean z9 = false;
            linearLayout.setVisibility(0);
            if (H1.host_id != null) {
                z9 = true;
            }
            this.f4196r2.a(z9, linearLayout.isAttachedToWindow());
            return;
        }
        linearLayout.setVisibility(8);
    }

    public final long x1() {
        TLRPC.Peer peer;
        ij ijVar = this.f4205z2;
        if (ijVar != null) {
            TLRPC.Message message = ijVar.f23262k;
            if (message != null) {
                TLRPC.MessageAction messageAction = message.action;
                if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                    TLRPC.Peer peer2 = ((TLRPC.TL_messageActionStarGift) messageAction).peer;
                    if (peer2 != null) {
                        return org.telegram.messenger.m5.o(peer2);
                    }
                    if (ijVar.Q3()) {
                        return ij.B0(this.f4205z2.f23262k);
                    }
                    return p10.i(this.f28616a).e();
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
        TL_stars.SavedStarGift savedStarGift = this.f4203x2;
        if (savedStarGift != null) {
            TL_stars.StarGift starGift2 = savedStarGift.gift;
            if (starGift2 instanceof TL_stars.TL_starGiftUnique) {
                return org.telegram.messenger.m5.o(((TL_stars.TL_starGiftUnique) starGift2).owner_id);
            }
            return this.P1;
        }
        TL_stars.TL_starGiftUnique tL_starGiftUnique = this.B2;
        if (tL_starGiftUnique != null) {
            return org.telegram.messenger.m5.o(tL_starGiftUnique.owner_id);
        }
        return 0L;
    }

    public final TL_stars.StarGift y1() {
        ij ijVar = this.f4205z2;
        if (ijVar != null) {
            TLRPC.Message message = ijVar.f23262k;
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
            TL_stars.SavedStarGift savedStarGift = this.f4203x2;
            if (savedStarGift != null) {
                return savedStarGift.gift;
            }
            TL_stars.TL_starGiftUnique tL_starGiftUnique = this.B2;
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
            return jg.g.m(tL_starGiftUnique.num, ',', sb2);
        }
        return "";
    }
}
