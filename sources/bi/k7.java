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
import org.telegram.ui.Components.jz;
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
import org.telegram.ui.pg0;
public class k7 extends org.telegram.ui.Components.ma implements ls {
    public static final int f4160v3 = 0;
    public TL_stars.SavedStarGift A2;
    public w9 B2;
    public ij C2;
    public String D2;
    public TL_stars.TL_starGiftUnique E2;
    public boolean F2;
    public boolean G2;
    public boolean H2;
    public boolean I2;
    public boolean J2;
    public s6 K2;
    public boolean L2;
    public l5 M2;
    public final int[] N2;
    public k5 O2;
    public int P2;
    public String Q2;
    public zh.k3 R2;
    public final long S1;
    public wp S2;
    public final m5 T1;
    public boolean T2;
    public final f5 U1;
    public x4 U2;
    public final jz V1;
    public Float V2;
    public final View W1;
    public g6 W2;
    public i5 X1;
    public ValueAnimator X2;
    public i5 Y1;
    public wp Y2;
    public final j5 Z1;
    public boolean Z2;
    public final e7 f4161a2;
    public TL_wallet.nftItem f4162a3;
    public final h5 f4163b2;
    public org.telegram.ui.Wallet.h5 f4164b3;
    public final w70 f4165c2;
    public org.telegram.ui.Wallet.i5 f4166c3;
    public final tx0 d2;
    public TL_wallet.walletTransaction f4167d3;
    public final w70 f4168e2;
    public View f4169e3;
    public final fi.d f4170f2;
    public zh.p1 f4171f3;
    public final FrameLayout f4172g2;
    public boolean f4173g3;
    public final w70 f4174h2;
    public Boolean f4175h3;
    public final FrameLayout f4176i2;
    public boolean f4177i3;
    public final View f4178j2;
    public ArrayList j3;
    public final FrameLayout f4179k2;
    public ArrayList f4180k3;
    public g7 f4181l2;
    public ArrayList f4182l3;
    public boolean f4183m2;
    public boolean f4184m3;
    public final h5 f4185n2;
    public TLRPC.PaymentForm f4186n3;
    public final hi.i[] f4187o2;
    public final wp[] f4188o3;
    public final View f4189p2;
    public final z1 f4190p3;
    public final LinearLayout f4191q2;
    public int f4192q3;
    public final wo f4193r2;
    public Boolean f4194r3;
    public final TextView f4195s2;
    public boolean f4196s3;
    public final LinearLayout f4197t2;
    public fi.m3 f4198t3;
    public final wo f4199u2;
    public View f4200u3;
    public boolean f4201v2;
    public final h5 f4202w2;
    public final TextView f4203x2;
    public final h5 f4204y2;
    public boolean f4205z2;

    public k7(Context context, int i7, long j3, org.telegram.ui.ActionBar.h6 h6Var, View view) {
        super(context, null, false, false, h6Var);
        this.f4183m2 = false;
        this.N2 = new int[2];
        this.P2 = -1;
        this.Q2 = "";
        this.W2 = new g6(0, 0);
        this.Z2 = true;
        this.f4188o3 = new wp[1];
        this.f4190p3 = new z1(this, 11);
        this.f4196s3 = true;
        this.f28669a = i7;
        this.S1 = j3;
        this.f35908u1 = Math.max(0.05f, org.telegram.messenger.g0.L(82.0f) / (org.telegram.messenger.g0.f22567q.y + org.telegram.messenger.g0.f22561m));
        this.f28710x = true;
        this.f28672b = new e5(0, context, this);
        m5 m5Var = new m5(this, context);
        this.T1 = m5Var;
        f5 f5Var = new f5(this, context);
        this.U1 = f5Var;
        f5Var.setAdapter(new g5(0, context, this));
        v2();
        View view2 = new View(context);
        this.W1 = view2;
        int i10 = org.telegram.ui.ActionBar.m6.f27963h5;
        org.telegram.ui.ActionBar.t6.h(i10, view2, h6Var);
        FrameLayout.LayoutParams e10 = c8.ha.e(-1, 50, 80);
        int i11 = this.f28705t0;
        e10.rightMargin = i11;
        e10.leftMargin = i11;
        this.f28672b.addView(view2, e10);
        this.f28672b.addView(f5Var, c8.ha.e(-1, -1, 119));
        P(i10);
        org.telegram.messenger.g0.E2(this.n1);
        m5Var.addView(this.n1, c8.ha.e(-1, -1, 119));
        h5 h5Var = new h5(this, context, 0);
        this.f4163b2 = h5Var;
        h5Var.setOrientation(1);
        h5Var.setPadding(org.telegram.messenger.g0.L(14.0f) + this.f28705t0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(14.0f) + this.f28705t0, org.telegram.messenger.g0.L(68.0f));
        m5Var.addView(h5Var, c8.ha.e(-1, -1, 55));
        w70 w70Var = new w70(context, h6Var);
        this.f4165c2 = w70Var;
        int i12 = org.telegram.ui.ActionBar.m6.f28129q5;
        org.telegram.ui.ActionBar.t6.U(w70Var, i12, h6Var);
        w70Var.setTextSize(1, 12.0f);
        w70Var.setGravity(17);
        w70Var.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        org.telegram.ui.ActionBar.t6.G(w70Var, org.telegram.ui.ActionBar.m6.Uc, h6Var);
        w70Var.setDisablePaddingsOffsetY(true);
        h5Var.addView(w70Var, c8.ha.t(-2, -2, 1, 4, -2, 4, 16));
        w70Var.setVisibility(8);
        tx0 tx0Var = new tx0(context, h6Var);
        this.d2 = tx0Var;
        h5Var.addView(tx0Var, c8.ha.k(0.0f, 0.0f, 0.0f, 12.0f, -1, -2));
        w70 w70Var2 = new w70(context, h6Var);
        this.f4168e2 = w70Var2;
        org.telegram.ui.ActionBar.t6.U(w70Var2, i12, h6Var);
        w70Var2.setTextSize(1, 12.0f);
        w70Var2.setGravity(17);
        w70Var2.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        int i13 = org.telegram.ui.ActionBar.m6.Ci;
        org.telegram.ui.ActionBar.t6.G(w70Var2, i13, h6Var);
        w70Var2.setDisablePaddingsOffsetY(true);
        w70Var2.setPadding(org.telegram.messenger.g0.L(5.0f), 0, org.telegram.messenger.g0.L(5.0f), 0);
        h5Var.addView(w70Var2, c8.ha.t(-2, -2, 1, 4, 2, 4, 8));
        w70Var2.setVisibility(8);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f4197t2 = linearLayout;
        linearLayout.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f));
        linearLayout.setOrientation(0);
        int i14 = org.telegram.ui.ActionBar.m6.f27982i6;
        org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.m6.a0(org.telegram.ui.ActionBar.m6.w0(i14, h6Var), 21, 21);
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i14);
        linearLayout.setBackground(a02);
        org.telegram.ui.ActionBar.t6.j(linearLayout, a02, null, M, h6Var);
        wo woVar = new wo(24, context, h6Var);
        this.f4199u2 = woVar;
        int i15 = org.telegram.ui.ActionBar.m6.h7;
        int i16 = org.telegram.ui.ActionBar.m6.f28000j7;
        int i17 = org.telegram.ui.ActionBar.m6.f28020k7;
        woVar.b(i15, i16, i17);
        woVar.setDrawUnchecked(true);
        woVar.a(false, false);
        woVar.setDrawBackgroundAsArc(10);
        linearLayout.addView(woVar, c8.ha.t(26, 26, 16, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        int i18 = org.telegram.ui.ActionBar.m6.f27998j5;
        org.telegram.ui.ActionBar.t6.U(textView, i18, h6Var);
        jg.g.v(textView, 1, 14.0f, null, 2131750389);
        linearLayout.addView(textView, c8.ha.t(-2, -2, 16, 9, 0, 0, 0));
        h5Var.addView(linearLayout, c8.ha.t(-2, -2, 1, 0, -4, 0, 4));
        c8.ka.b(linearLayout, 0.025f, 1.5f);
        linearLayout.setOnClickListener(new y1(this, 19));
        linearLayout.setVisibility(8);
        h5 h5Var2 = new h5(this, context, 1);
        this.f4185n2 = h5Var2;
        h5Var2.setOrientation(1);
        h5Var2.setPadding(org.telegram.messenger.g0.L(4.0f) + this.f28705t0, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(4.0f) + this.f28705t0, org.telegram.messenger.g0.L(66.0f));
        m5Var.addView(h5Var2, c8.ha.e(-1, -1, 55));
        this.f4187o2 = r8;
        hi.i iVar = new hi.i(context, h6Var, false);
        iVar.a(2131231821, org.telegram.messenger.id.M0(2131749865, null), org.telegram.messenger.id.M0(2131749575, null));
        h5Var2.addView(r8[0], c8.ha.o(-1, -2));
        hi.i iVar2 = new hi.i(context, h6Var, false);
        iVar2.a(2131231817, org.telegram.messenger.id.M0(2131749859, null), org.telegram.messenger.id.M0(2131749573, null));
        h5Var2.addView(r8[1], c8.ha.o(-1, -2));
        hi.i iVar3 = new hi.i(context, h6Var, false);
        hi.i[] iVarArr = {iVar, iVar2, iVar3};
        iVar3.a(2131231924, org.telegram.messenger.id.M0(2131749570, null), org.telegram.messenger.id.M0(2131749571, null));
        h5Var2.addView(iVarArr[2], c8.ha.o(-1, -2));
        View view3 = new View(context);
        this.f4189p2 = view3;
        int i19 = org.telegram.ui.ActionBar.m6.f27891d7;
        org.telegram.ui.ActionBar.t6.h(i19, view3, h6Var);
        h5Var2.addView(view3, c8.ha.n(1.0f / org.telegram.messenger.g0.f22566p, -2, 7, 17, -4, 17, 6));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f4191q2 = linearLayout2;
        linearLayout2.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f));
        linearLayout2.setOrientation(0);
        org.telegram.ui.Cells.y a03 = org.telegram.ui.ActionBar.m6.a0(org.telegram.ui.ActionBar.m6.w0(i14, h6Var), 6, 6);
        org.telegram.ui.ActionBar.p6 M2 = org.telegram.ui.ActionBar.t6.M(i14);
        linearLayout2.setBackground(a03);
        org.telegram.ui.ActionBar.t6.j(linearLayout2, a03, null, M2, h6Var);
        wo woVar2 = new wo(24, context, h6Var);
        this.f4193r2 = woVar2;
        woVar2.b(i15, i16, i17);
        woVar2.setDrawUnchecked(true);
        woVar2.a(false, false);
        woVar2.setDrawBackgroundAsArc(10);
        linearLayout2.addView(woVar2, c8.ha.t(26, 26, 16, 0, 0, 0, 0));
        TextView textView2 = new TextView(context);
        this.f4195s2 = textView2;
        org.telegram.ui.ActionBar.t6.U(textView2, i18, h6Var);
        jg.g.v(textView2, 1, 14.0f, null, 2131750397);
        linearLayout2.addView(textView2, c8.ha.t(-2, -2, 16, 9, 0, 0, 0));
        h5Var2.addView(linearLayout2, c8.ha.t(-2, -2, 1, 0, 0, 0, 4));
        c8.ka.b(linearLayout2, 0.025f, 1.5f);
        h5 h5Var3 = new h5(this, context, 2);
        this.f4202w2 = h5Var3;
        h5Var3.setOrientation(1);
        h5Var3.setPadding(org.telegram.messenger.g0.L(4.0f) + this.f28705t0, org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(4.0f) + this.f28705t0, org.telegram.messenger.g0.L(66.0f));
        m5Var.addView(h5Var3, c8.ha.e(-1, -1, 55));
        TextView textView3 = new TextView(context);
        this.f4203x2 = textView3;
        org.telegram.ui.ActionBar.t6.U(textView3, i18, h6Var);
        textView3.setTextSize(1, 20.0f);
        textView3.setGravity(17);
        textView3.setTypeface(org.telegram.messenger.g0.o());
        h5Var3.addView(textView3, c8.ha.t(-1, -2, 7, 20, 0, 20, 0));
        TextView textView4 = new TextView(context);
        org.telegram.ui.ActionBar.t6.U(textView4, i18, h6Var);
        textView4.setTextSize(1, 14.0f);
        org.telegram.messenger.k5.m(textView4, 17, null, 2131749834);
        h5Var3.addView(textView4, c8.ha.t(-1, -2, 7, 20, 6, 20, 24));
        hi.i iVar4 = new hi.i(context, h6Var, false);
        iVar4.a(2131231821, org.telegram.messenger.id.M0(2131749840, null), org.telegram.messenger.id.M0(2131749841, null));
        h5Var3.addView(r6[0], c8.ha.o(-1, -2));
        hi.i iVar5 = new hi.i(context, h6Var, false);
        iVar5.a(2131231799, org.telegram.messenger.id.M0(2131749838, null), org.telegram.messenger.id.M0(2131749839, null));
        h5Var3.addView(r6[1], c8.ha.o(-1, -2));
        hi.i iVar6 = new hi.i(context, h6Var, false);
        hi.i[] iVarArr2 = {iVar4, iVar5, iVar6};
        iVar6.a(2131231911, org.telegram.messenger.id.M0(2131749836, null), org.telegram.messenger.id.M0(2131749837, null));
        h5Var3.addView(iVarArr2[2], c8.ha.o(-1, -2));
        h5 h5Var4 = new h5(this, context, 3);
        this.f4204y2 = h5Var4;
        h5Var4.setOrientation(1);
        h5Var4.setPadding(org.telegram.messenger.g0.L(4.0f) + this.f28705t0, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(4.0f) + this.f28705t0, org.telegram.messenger.g0.L(92.0f));
        m5Var.addView(h5Var4, c8.ha.e(-1, -1, 55));
        hi.i iVar7 = new hi.i(context, h6Var, false);
        iVar7.a(2131231821, org.telegram.messenger.id.M0(2131749785, null), org.telegram.messenger.id.M0(2131749786, null));
        h5Var4.addView(r6[0], c8.ha.o(-1, -2));
        hi.i iVar8 = new hi.i(context, h6Var, false);
        iVar8.a(2131231873, org.telegram.messenger.id.M0(2131749783, null), org.telegram.messenger.id.M0(2131749784, null));
        h5Var4.addView(r6[1], c8.ha.o(-1, -2));
        hi.i iVar9 = new hi.i(context, h6Var, false);
        hi.i[] iVarArr3 = {iVar7, iVar8, iVar9};
        iVar9.a(2131231795, org.telegram.messenger.id.M0(2131749781, null), org.telegram.messenger.id.M0(2131749782, null));
        h5Var4.addView(iVarArr3[2], c8.ha.o(-1, -2));
        h5Var.setAlpha(1.0f);
        h5Var2.setAlpha(0.0f);
        h5Var3.setAlpha(0.0f);
        h5Var4.setAlpha(0.0f);
        e7 e7Var = new e7(context, h6Var, new z1(this, 12), new y1(this, 20), new y1(this, 21), new y1(this, 22), new y1(this, 23), new y1(this, 24), new y1(this, 25), new y1(this, 26));
        this.f4161a2 = e7Var;
        e7Var.M.f3658c.setOnClickListener(new y1(this, 17));
        int i20 = this.f28705t0;
        e7Var.setPadding(i20, 0, i20, 0);
        m5Var.addView(e7Var, c8.ha.e(-1, -2, 55));
        jg.b0 b0Var = this.f35901m1;
        this.J1 = true;
        b0Var.k1(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f4172g2 = frameLayout;
        org.telegram.ui.ActionBar.t6.h(i10, frameLayout, h6Var);
        View view4 = new View(context);
        this.f4178j2 = view4;
        org.telegram.ui.ActionBar.t6.h(i19, view4, h6Var);
        view4.setAlpha(0.0f);
        frameLayout.addView(view4, c8.ha.a(-1.0f, 1.0f / org.telegram.messenger.g0.f22566p, 55));
        fi.d h = org.telegram.messenger.k5.h(24, context, h6Var, true);
        this.f4170f2 = h;
        h.i(org.telegram.messenger.id.M0(2131747831, null), false, true);
        h.g(null, false);
        FrameLayout.LayoutParams d = c8.ha.d(-1, 48.0f, 119, 0.0f, 12.0f, 0.0f, 12.0f);
        d.leftMargin = org.telegram.messenger.g0.L(14.0f) + this.f28705t0;
        d.rightMargin = org.telegram.messenger.g0.L(14.0f) + this.f28705t0;
        frameLayout.addView(h, d);
        m5Var.addView(frameLayout, c8.ha.e(-1, 72, 87));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f4176i2 = frameLayout2;
        org.telegram.ui.ActionBar.t6.h(i10, frameLayout2, h6Var);
        w70 w70Var3 = new w70(context, null);
        this.f4174h2 = w70Var3;
        w70Var3.setTextSize(1, 12.0f);
        org.telegram.ui.ActionBar.t6.U(w70Var3, i13, h6Var);
        org.telegram.ui.ActionBar.t6.G(w70Var3, i13, h6Var);
        w70Var3.setGravity(17);
        frameLayout2.addView(w70Var3, c8.ha.d(-1, -2.0f, 17, 16.0f, 8.0f, 16.0f, 14.0f));
        m5Var.addView(frameLayout2, c8.ha.e(-1, -2, 87));
        frameLayout2.setVisibility(8);
        this.n1.setOnScrollListener(new ai.b(this, 4));
        linearLayout2.setOnClickListener(new y1(this, 18));
        jz jzVar = new jz(context);
        this.V1 = jzVar;
        m5Var.addView(jzVar, c8.ha.c(-1.0f, -1));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f4179k2 = frameLayout3;
        frameLayout3.setPadding(org.telegram.messenger.g0.L(6.0f) + this.f28705t0, 0, org.telegram.messenger.g0.L(6.0f) + this.f28705t0, 0);
        m5Var.addView(frameLayout3, c8.ha.d(-1, 200.0f, 87, 0.0f, 0.0f, 0.0f, 60.0f));
        org.telegram.messenger.g0.E2(this.f35902o1);
        m5Var.addView(this.f35902o1, c8.ha.d(-1, -2.0f, 0, 6.0f, 0.0f, 6.0f, 0.0f));
        j5 j5Var = new j5(context);
        this.Z1 = j5Var;
        m5Var.addView(j5Var, c8.ha.e(-1, -2, 55));
        ArrayList arrayList = new ArrayList();
        if (view != null) {
            arrayList.add(view);
        }
        org.telegram.messenger.g0.m2(new ai.i(j5Var, 6), 12.0f, 12, arrayList);
    }

    public static String F1(TL_stars.StarGiftAttributeRarity starGiftAttributeRarity, Integer[] numArr) {
        if (starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarityUncommon) {
            numArr[0] = -12539616;
            return org.telegram.messenger.id.M0(2131749619, null);
        } else if (starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarityRare) {
            numArr[0] = -15619394;
            return org.telegram.messenger.id.M0(2131749620, null);
        } else if (starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarityEpic) {
            numArr[0] = -6988581;
            return org.telegram.messenger.id.M0(2131749622, null);
        } else if (starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarityLegendary) {
            numArr[0] = -4229632;
            return org.telegram.messenger.id.M0(2131749621, null);
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

    public static boolean J1(int i7, long j3) {
        if (j3 >= 0) {
            if (p10.i(i7).e() == j3) {
                return true;
            }
            return false;
        }
        return org.telegram.messenger.t3.w(5, qp.s1(i7).M0(Long.valueOf(-j3)));
    }

    public static boolean K1(int i7, long j3) {
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

    public static boolean L1(int i7, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
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
                if (!(emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) || ((TLRPC.TL_emojiStatusCollectible) emojiStatus).collectible_id != tL_starGiftUnique.f27189id) {
                    return false;
                }
                return true;
            }
        } else {
            TLRPC.Chat M0 = qp.s1(i7).M0(Long.valueOf(-o4));
            if (M0 != null) {
                TLRPC.EmojiStatus emojiStatus2 = M0.emoji_status;
                if ((emojiStatus2 instanceof TLRPC.TL_emojiStatusCollectible) && ((TLRPC.TL_emojiStatusCollectible) emojiStatus2).collectible_id == tL_starGiftUnique.f27189id) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void b2(org.telegram.ui.ActionBar.f2 f2Var) {
        org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
        if (T == 0) {
            return;
        }
        ?? obj = new Object();
        obj.f27388a = true;
        T.showAsSheet(f2Var, obj);
    }

    public static void d1(k7 k7Var) {
        boolean z9;
        TLRPC.Document document;
        boolean z10;
        t9 F;
        TLRPC.Message message;
        fi.d dVar = k7Var.f4170f2;
        if (!dVar.Q) {
            TL_stars.InputSavedStarGift A1 = k7Var.A1();
            ij ijVar = k7Var.C2;
            if (ijVar != null && (message = ijVar.f23266k) != null) {
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
                TL_stars.SavedStarGift savedStarGift = k7Var.A2;
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
            savestargift.stargift = A1;
            if (k7Var.A2 != null && (F = ea.y(k7Var.f28669a, false).F(k7Var.S1, false)) != null) {
                F.m(k7Var.A2, savestargift.unsave);
                z10 = true;
            } else {
                z10 = false;
            }
            ConnectionsManager.getInstance(k7Var.f28669a).sendRequest(savestargift, new t4(k7Var, z10, document2, z11, savestargift));
        }
    }

    public static void e1(final k7 k7Var) {
        int i7;
        long j3;
        long j10;
        long j11;
        String M0;
        final long e10 = p10.i(k7Var.f28669a).e();
        final TL_stars.InputSavedStarGift A1 = k7Var.A1();
        if (A1 != null) {
            ij ijVar = k7Var.C2;
            if (ijVar != null) {
                i7 = ijVar.f23266k.date;
                boolean P3 = ijVar.P3();
                TLRPC.Message message = k7Var.C2.f23266k;
                if (message != null) {
                    TLRPC.MessageAction messageAction = message.action;
                    if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                        TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                        TLRPC.Peer peer = tL_messageActionStarGift.peer;
                        if (peer != null) {
                            j11 = org.telegram.messenger.m5.o(peer);
                        } else if (P3) {
                            j11 = ij.B0(message);
                        } else {
                            j11 = e10;
                        }
                        TLRPC.Peer peer2 = tL_messageActionStarGift.from_id;
                        if (peer2 != null) {
                            j3 = org.telegram.messenger.m5.o(peer2);
                        } else if (P3) {
                            j3 = e10;
                        } else {
                            j3 = ij.B0(k7Var.C2.f23266k);
                        }
                        j10 = tL_messageActionStarGift.convert_stars;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else {
                TL_stars.SavedStarGift savedStarGift = k7Var.A2;
                if (savedStarGift != null) {
                    i7 = savedStarGift.date;
                    if ((savedStarGift.flags & 2) != 0 && !savedStarGift.name_hidden) {
                        j3 = org.telegram.messenger.m5.o(savedStarGift.from_id);
                    } else {
                        j3 = 2666000;
                    }
                    j10 = k7Var.A2.convert_stars;
                    j11 = k7Var.S1;
                } else {
                    return;
                }
            }
            int max = Math.max(1, (qp.s1(k7Var.f28669a).E6 - (ConnectionsManager.getInstance(k7Var.f28669a).getCurrentTime() - i7)) / 86400);
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, k7Var.getContext(), k7Var.I0);
            String M02 = org.telegram.messenger.id.M0(2131750226, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27300a;
            u1Var.R = M02;
            if (!t10.A(j3) && j3 != 2666000) {
                M0 = org.telegram.messenger.m5.t(j3);
            } else {
                M0 = org.telegram.messenger.id.M0(2131744949, null);
            }
            u1Var.T = org.telegram.messenger.g0.X2(org.telegram.messenger.id.G(max, "Gift2ConvertText2", M0, org.telegram.messenger.id.H(',', "Gift2ConvertStars", (int) j10)));
            final long j12 = j10;
            final long j13 = j11;
            alertDialog$Builder.k(org.telegram.messenger.id.M0(2131750233, null), new org.telegram.ui.ActionBar.r1() {
                @Override
                public final void g(org.telegram.ui.ActionBar.u1 u1Var2, int i10) {
                    k7 k7Var2 = k7.this;
                    TL_stars.InputSavedStarGift inputSavedStarGift = A1;
                    long j14 = j13;
                    long j15 = e10;
                    long j16 = j12;
                    org.telegram.ui.ActionBar.u1 u1Var3 = new org.telegram.ui.ActionBar.u1(3, org.telegram.messenger.t0.f25570b, null);
                    u1Var3.r(500L);
                    TL_stars.convertStarGift convertstargift = new TL_stars.convertStarGift();
                    convertstargift.stargift = inputSavedStarGift;
                    ConnectionsManager.getInstance(k7Var2.f28669a).sendRequest(convertstargift, new t2(k7Var2, u1Var3, j14, j15, j16));
                }
            });
            jg.g.w(null, 2131752589, alertDialog$Builder, null);
        }
    }

    public static SpannableStringBuilder e2(String str) {
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

    public static void f1(k7 k7Var, org.telegram.ui.ActionBar.u1 u1Var, TL_stars.SavedStarGift savedStarGift) {
        if (savedStarGift != null) {
            u1Var.dismiss();
            k7Var.J2 = true;
            k7Var.i2(savedStarGift, null);
            super.show();
            return;
        }
        u1Var.dismiss();
        org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
        if (T != null) {
            org.telegram.ui.Components.bc Q = org.telegram.ui.Components.gc.a0(T).Q(2131624011, 36, org.telegram.messenger.id.M0(2131748552, null));
            Q.f32213t = true;
            Q.j();
        }
    }

    public static SpannableStringBuilder f2(String str) {
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

    public static void g1(k7 k7Var, TL_stars.TL_payments_uniqueStarGift tL_payments_uniqueStarGift) {
        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) tL_payments_uniqueStarGift.gift;
        k7Var.E2 = tL_starGiftUnique;
        k7Var.j2(tL_starGiftUnique, false, null, null);
        super.show();
    }

    public static void h1(k7 k7Var, org.telegram.ui.ActionBar.u1 u1Var, ij ijVar) {
        u1Var.dismiss();
        k7Var.H2 = true;
        k7Var.h2(ijVar, null);
        super.show();
    }

    public static void j1(tx0 tx0Var, TL_stars.StarGiftAttribute starGiftAttribute) {
        String M0;
        if (starGiftAttribute instanceof TL_stars.starGiftAttributeModel) {
            M0 = org.telegram.messenger.id.M0(2131750387, null);
        } else if (starGiftAttribute instanceof TL_stars.starGiftAttributePattern) {
            M0 = org.telegram.messenger.id.M0(2131750380, null);
        } else if (starGiftAttribute instanceof TL_stars.starGiftAttributeBackdrop) {
            M0 = org.telegram.messenger.id.M0(2131750388, null);
        } else {
            return;
        }
        String str = M0;
        Integer[] numArr = new Integer[1];
        tx0Var.e(str, starGiftAttribute.name, F1(starGiftAttribute.rarity, numArr), null, numArr[0]);
    }

    public static boolean t1(TL_stars.SavedStarGift savedStarGift, TL_stars.SavedStarGift savedStarGift2) {
        if (savedStarGift != savedStarGift2) {
            if (savedStarGift != null) {
                TL_stars.StarGift starGift = savedStarGift.gift;
                TL_stars.StarGift starGift2 = savedStarGift2.gift;
                if (starGift != starGift2) {
                    if ((starGift instanceof TL_stars.TL_starGiftUnique) && (starGift2 instanceof TL_stars.TL_starGiftUnique)) {
                        if (starGift.f27189id == starGift2.f27189id) {
                            return true;
                        }
                        return false;
                    } else if ((starGift instanceof TL_stars.TL_starGift) && (starGift2 instanceof TL_stars.TL_starGift) && starGift.f27189id == starGift2.f27189id && savedStarGift.date == savedStarGift2.date) {
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

    public static boolean u1(TL_stars.TL_starGiftUnique tL_starGiftUnique, TL_stars.TL_starGiftUnique tL_starGiftUnique2) {
        if (tL_starGiftUnique != tL_starGiftUnique2) {
            if (tL_starGiftUnique != null) {
                if (tL_starGiftUnique.f27189id == tL_starGiftUnique2.f27189id || TextUtils.equals(tL_starGiftUnique.slug, tL_starGiftUnique2.slug)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public static String z1(TL_stars.StarGift starGift) {
        if (starGift instanceof TL_stars.TL_starGiftUnique) {
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(tL_starGiftUnique.title);
            sb2.append(" #");
            return jg.g.m(tL_starGiftUnique.num, ',', sb2);
        } else if ((starGift instanceof TL_stars.TL_starGift) && !TextUtils.isEmpty(starGift.title)) {
            return starGift.title;
        } else {
            return org.telegram.messenger.id.M0(2131750192, null);
        }
    }

    public final TL_stars.InputSavedStarGift A1() {
        TLRPC.Message message;
        long B0;
        TLRPC.Message message2;
        long B02;
        TLRPC.Message message3;
        long j3 = this.S1;
        if (j3 < 0) {
            TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat = new TL_stars.TL_inputSavedStarGiftChat();
            tL_inputSavedStarGiftChat.peer = qp.s1(this.f28669a).j1(j3);
            ij ijVar = this.C2;
            if (ijVar != null && (message3 = ijVar.f23266k) != null) {
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
            TL_stars.SavedStarGift savedStarGift = this.A2;
            if (savedStarGift != null) {
                if ((savedStarGift.flags & 2048) == 0) {
                    return null;
                }
                tL_inputSavedStarGiftChat.saved_id = savedStarGift.saved_id;
                return tL_inputSavedStarGiftChat;
            } else if (this.E2 != null && !TextUtils.isEmpty(this.D2)) {
                TL_stars.TL_inputSavedStarGiftSlug tL_inputSavedStarGiftSlug = new TL_stars.TL_inputSavedStarGiftSlug();
                tL_inputSavedStarGiftSlug.slug = this.D2;
                return tL_inputSavedStarGiftSlug;
            } else {
                return tL_inputSavedStarGiftChat;
            }
        }
        ij ijVar2 = this.C2;
        if (ijVar2 != null && (message2 = ijVar2.f23266k) != null) {
            TLRPC.MessageAction messageAction2 = message2.action;
            if ((messageAction2 instanceof TLRPC.TL_messageActionStarGift) && (messageAction2.flags & 4096) != 0) {
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift2 = (TLRPC.TL_messageActionStarGift) messageAction2;
                TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat2 = new TL_stars.TL_inputSavedStarGiftChat();
                qp s12 = qp.s1(this.f28669a);
                TLRPC.Peer peer = tL_messageActionStarGift2.peer;
                if (peer != null) {
                    B02 = org.telegram.messenger.m5.o(peer);
                } else {
                    B02 = ij.B0(this.C2.f23266k);
                }
                tL_inputSavedStarGiftChat2.peer = s12.j1(B02);
                tL_inputSavedStarGiftChat2.saved_id = tL_messageActionStarGift2.saved_id;
                return tL_inputSavedStarGiftChat2;
            }
        }
        if (ijVar2 != null && (message = ijVar2.f23266k) != null) {
            TLRPC.MessageAction messageAction3 = message.action;
            if ((messageAction3 instanceof TLRPC.TL_messageActionStarGiftUnique) && (messageAction3.flags & 128) != 0) {
                TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique2 = (TLRPC.TL_messageActionStarGiftUnique) messageAction3;
                TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat3 = new TL_stars.TL_inputSavedStarGiftChat();
                qp s13 = qp.s1(this.f28669a);
                TLRPC.Peer peer2 = tL_messageActionStarGiftUnique2.peer;
                if (peer2 != null) {
                    B0 = org.telegram.messenger.m5.o(peer2);
                } else {
                    B0 = ij.B0(this.C2.f23266k);
                }
                tL_inputSavedStarGiftChat3.peer = s13.j1(B0);
                tL_inputSavedStarGiftChat3.saved_id = tL_messageActionStarGiftUnique2.saved_id;
                return tL_inputSavedStarGiftChat3;
            }
        }
        TL_stars.TL_inputSavedStarGiftUser tL_inputSavedStarGiftUser = new TL_stars.TL_inputSavedStarGiftUser();
        ij ijVar3 = this.C2;
        if (ijVar3 != null) {
            TLRPC.Message message4 = ijVar3.f23266k;
            if (message4 != null) {
                TLRPC.MessageAction messageAction4 = message4.action;
                if ((messageAction4 instanceof TLRPC.TL_messageActionStarGift) && (messageAction4.flags & 32768) != 0) {
                    tL_inputSavedStarGiftUser.msg_id = ((TLRPC.TL_messageActionStarGift) messageAction4).gift_msg_id;
                    return tL_inputSavedStarGiftUser;
                }
            }
            tL_inputSavedStarGiftUser.msg_id = ijVar3.e1();
            return tL_inputSavedStarGiftUser;
        }
        TL_stars.SavedStarGift savedStarGift2 = this.A2;
        if (savedStarGift2 != null) {
            tL_inputSavedStarGiftUser.msg_id = savedStarGift2.msg_id;
            return tL_inputSavedStarGiftUser;
        } else if (this.E2 != null && !TextUtils.isEmpty(this.D2)) {
            TL_stars.TL_inputSavedStarGiftSlug tL_inputSavedStarGiftSlug2 = new TL_stars.TL_inputSavedStarGiftSlug();
            tL_inputSavedStarGiftSlug2.slug = this.D2;
            return tL_inputSavedStarGiftSlug2;
        } else {
            return tL_inputSavedStarGiftUser;
        }
    }

    public final String B1() {
        TL_stars.StarGift x12 = x1();
        if ((x12 instanceof TL_stars.TL_starGiftUnique) && x12.slug != null) {
            return qp.s1(this.f28669a).U2 + "/nft/" + x12.slug;
        }
        return null;
    }

    public final int C1() {
        int indexOf;
        w9 w9Var = this.B2;
        if (w9Var != null) {
            TL_stars.SavedStarGift savedStarGift = this.A2;
            if (savedStarGift != null) {
                indexOf = w9Var.indexOf(savedStarGift);
            } else {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = this.E2;
                if (tL_starGiftUnique != null) {
                    indexOf = w9Var.indexOf(tL_starGiftUnique);
                } else {
                    return -1;
                }
            }
            if (indexOf >= 0) {
                return indexOf;
            }
            TL_stars.StarGift x12 = x1();
            for (int i7 = 0; i7 < this.B2.e(); i7++) {
                Object obj = this.B2.get(i7);
                if (obj instanceof TL_stars.SavedStarGift) {
                    TL_stars.SavedStarGift savedStarGift2 = this.A2;
                    if (savedStarGift2 != null) {
                        if (t1(savedStarGift2, (TL_stars.SavedStarGift) obj)) {
                            return i7;
                        }
                    }
                    if (x12 != null) {
                        TL_stars.StarGift starGift = ((TL_stars.SavedStarGift) obj).gift;
                        if (x12 != starGift) {
                            if ((x12 instanceof TL_stars.TL_starGiftUnique) && (starGift instanceof TL_stars.TL_starGiftUnique) && x12.f27189id == starGift.f27189id) {
                            }
                        }
                        return i7;
                    }
                    continue;
                } else {
                    if ((obj instanceof TL_stars.TL_starGiftUnique) && u1(this.E2, (TL_stars.TL_starGiftUnique) obj)) {
                        return i7;
                    }
                }
            }
            return -1;
        }
        return -1;
    }

    public final TL_stars.SavedStarGift D1(boolean z9) {
        int i7;
        Object obj;
        int C1 = C1();
        if (C1 < 0) {
            return null;
        }
        if (z9) {
            i7 = 1;
        } else {
            i7 = -1;
        }
        int i10 = i7 + C1;
        int i11 = this.P2;
        if (i11 >= 0 && (!z9 ? i11 < C1 : i11 > C1)) {
            i10 = i11;
        }
        w9 w9Var = this.B2;
        if (w9Var != null && i10 >= 0 && i10 < w9Var.e()) {
            obj = this.B2.get(i10);
        } else {
            obj = null;
        }
        if (!(obj instanceof TL_stars.SavedStarGift)) {
            return null;
        }
        return (TL_stars.SavedStarGift) obj;
    }

    @Override
    public final void E0(int i7) {
        super.E0(i7);
        org.telegram.messenger.g0.u3(this, 0, false, null);
    }

    public final TL_stars.TL_starGiftUnique E1(boolean z9) {
        int i7;
        Object obj;
        int C1 = C1();
        if (C1 < 0) {
            return null;
        }
        if (z9) {
            i7 = 1;
        } else {
            i7 = -1;
        }
        int i10 = i7 + C1;
        int i11 = this.P2;
        if (i11 >= 0 && (!z9 ? i11 < C1 : i11 > C1)) {
            i10 = i11;
        }
        w9 w9Var = this.B2;
        if (w9Var != null && i10 >= 0 && i10 < w9Var.e()) {
            obj = this.B2.get(i10);
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
        if (this.W2.c(4)) {
            boolean z9 = this.f4161a2.M.f3666h0;
        }
        return false;
    }

    public final TL_stars.TL_starGiftUnique G1() {
        TL_stars.StarGift x12 = x1();
        if (x12 instanceof TL_stars.TL_starGiftUnique) {
            return (TL_stars.TL_starGiftUnique) x12;
        }
        return null;
    }

    @Override
    public final boolean H() {
        if (this.W2.c(4) && this.f4161a2.M.f3666h0) {
            return false;
        }
        return this.f28676c0;
    }

    public final boolean H1(boolean z9) {
        if (D1(z9) == null && E1(z9) == null) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean I(MotionEvent motionEvent) {
        if (this.W2.c(4)) {
            boolean z9 = this.f4161a2.M.f3666h0;
        }
        return false;
    }

    public final void I1(byte[] bArr, TwoStepVerificationActivity twoStepVerificationActivity, boolean z9, n3 n3Var) {
        TL_stars.getStarGiftWithdrawalUrl getstargiftwithdrawalurl;
        TL_stars.InputSavedStarGift A1 = A1();
        if (A1 == null) {
            if (n3Var != null) {
                n3Var.a(Boolean.FALSE);
                return;
            }
            return;
        }
        if (z9) {
            TL_stars.withdrawStarGift withdrawstargift = new TL_stars.withdrawStarGift();
            withdrawstargift.keep_on_profile = this.f4196s3;
            withdrawstargift.stargift = A1;
            withdrawstargift.tmp_password = bArr;
            getstargiftwithdrawalurl = withdrawstargift;
        } else {
            TL_stars.getStarGiftWithdrawalUrl getstargiftwithdrawalurl2 = new TL_stars.getStarGiftWithdrawalUrl();
            getstargiftwithdrawalurl2.stargift = A1;
            getstargiftwithdrawalurl2.tmp_password = bArr;
            getstargiftwithdrawalurl = getstargiftwithdrawalurl2;
        }
        ConnectionsManager.getInstance(this.f28669a).sendRequest(getstargiftwithdrawalurl, new d4(this, n3Var, twoStepVerificationActivity, z9, 0));
    }

    @Override
    public final oj0 L0(pj0 pj0Var) {
        k5 k5Var = new k5(this, 0);
        this.O2 = k5Var;
        return k5Var;
    }

    public final void M1() {
        throw new UnsupportedOperationException("Method not decompiled: bi.k7.M1():void");
    }

    @Override
    public final int N0() {
        return org.telegram.messenger.g0.L(12.0f);
    }

    public final void N1() {
        x4 x4Var = this.U2;
        if (x4Var != null && !x4Var.I) {
            x4Var.dismiss();
        }
        String B1 = B1();
        x4 x4Var2 = new x4(this, getContext(), B1, B1, this.I0);
        this.U2 = x4Var2;
        x4Var2.f36040n2 = new cb.c(this, 11);
        x4Var2.show();
    }

    @Override
    public final CharSequence O0() {
        return this.Q2;
    }

    public final void O1() {
        throw new UnsupportedOperationException("Method not decompiled: bi.k7.O1():void");
    }

    public final void P1(TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, boolean z9) {
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
            org.telegram.ui.Components.gc.b0("NULL_ERROR");
        } else if (!"PASSWORD_MISSING".equals(tL_error.text) && !tL_error.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error.text.startsWith("SESSION_TOO_FRESH_")) {
            if ("SRP_ID_INVALID".equals(tL_error.text)) {
                ConnectionsManager.getInstance(this.f28669a).sendRequest(new TL_account.getPassword(), new i4(this, twoStepVerificationActivity, z9, 1), 8);
                return;
            }
            if (twoStepVerificationActivity != null) {
                twoStepVerificationActivity.t0();
                twoStepVerificationActivity.finishFragment();
            }
            org.telegram.ui.Components.gc.d0(tL_error);
        } else {
            if (twoStepVerificationActivity != null) {
                twoStepVerificationActivity.t0();
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
            String M0 = org.telegram.messenger.id.M0(2131749900, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27300a;
            u1Var.R = M0;
            LinearLayout linearLayout = new LinearLayout(getContext());
            linearLayout.setPadding(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(24.0f), 0);
            linearLayout.setOrientation(1);
            alertDialog$Builder.o(linearLayout);
            TextView textView = new TextView(getContext());
            int i16 = org.telegram.ui.ActionBar.m6.f27998j5;
            org.telegram.ui.ActionBar.t6.U(textView, i16, null);
            textView.setTextSize(1, 16.0f);
            if (org.telegram.messenger.id.f23161a0) {
                i7 = 5;
            } else {
                i7 = 3;
            }
            textView.setGravity(i7 | 48);
            textView.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(2131749904, null)));
            linearLayout.addView(textView, c8.ha.o(-1, -2));
            LinearLayout linearLayout2 = new LinearLayout(getContext());
            linearLayout2.setOrientation(0);
            linearLayout.addView(linearLayout2, c8.ha.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
            ImageView imageView = new ImageView(getContext());
            imageView.setImageResource(2131231623);
            if (org.telegram.messenger.id.f23161a0) {
                i10 = org.telegram.messenger.g0.L(11.0f);
            } else {
                i10 = 0;
            }
            int L3 = org.telegram.messenger.g0.L(9.0f);
            if (org.telegram.messenger.id.f23161a0) {
                L = 0;
            } else {
                L = org.telegram.messenger.g0.L(11.0f);
            }
            imageView.setPadding(i10, L3, L, 0);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            org.telegram.ui.ActionBar.t6.s(imageView, i16, null, mode);
            TextView textView2 = new TextView(getContext());
            org.telegram.ui.ActionBar.t6.U(textView2, i16, null);
            textView2.setTextSize(1, 16.0f);
            if (org.telegram.messenger.id.f23161a0) {
                i11 = 5;
            } else {
                i11 = 3;
            }
            textView2.setGravity(i11 | 48);
            textView2.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(2131749903, null)));
            if (org.telegram.messenger.id.f23161a0) {
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
            if (org.telegram.messenger.id.f23161a0) {
                i12 = org.telegram.messenger.g0.L(11.0f);
            } else {
                i12 = 0;
            }
            int L4 = org.telegram.messenger.g0.L(9.0f);
            if (org.telegram.messenger.id.f23161a0) {
                L2 = 0;
            } else {
                L2 = org.telegram.messenger.g0.L(11.0f);
            }
            imageView2.setPadding(i12, L4, L2, 0);
            org.telegram.ui.ActionBar.t6.s(imageView2, i16, null, mode);
            TextView textView3 = new TextView(getContext());
            org.telegram.ui.ActionBar.t6.U(textView3, i16, null);
            textView3.setTextSize(1, 16.0f);
            if (org.telegram.messenger.id.f23161a0) {
                i13 = 5;
            } else {
                i13 = 3;
            }
            textView3.setGravity(i13 | 48);
            textView3.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(2131749902, null)));
            if (org.telegram.messenger.id.f23161a0) {
                linearLayout3.addView(textView3, c8.ha.o(-1, -2));
                i14 = 5;
                linearLayout3.addView(imageView2, c8.ha.r(-2, -2, 5));
            } else {
                i14 = 5;
                linearLayout3.addView(imageView2, c8.ha.o(-2, -2));
                linearLayout3.addView(textView3, c8.ha.o(-1, -2));
            }
            if ("PASSWORD_MISSING".equals(tL_error.text)) {
                alertDialog$Builder.k(org.telegram.messenger.id.M0(2131749899, null), new a3.l(this, 23));
                alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
            } else {
                TextView textView4 = new TextView(getContext());
                org.telegram.ui.ActionBar.t6.U(textView4, i16, null);
                textView4.setTextSize(1, 16.0f);
                if (org.telegram.messenger.id.f23161a0) {
                    i15 = i14;
                } else {
                    i15 = 3;
                }
                org.telegram.messenger.k5.m(textView4, i15 | 48, null, 2131749901);
                linearLayout.addView(textView4, c8.ha.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                alertDialog$Builder.h(org.telegram.messenger.id.M0(2131747831, null), null);
            }
            if (twoStepVerificationActivity != null) {
                twoStepVerificationActivity.showDialog(u1Var);
            } else {
                alertDialog$Builder.p();
            }
        }
    }

    public final void Q1() {
        throw new UnsupportedOperationException("Method not decompiled: bi.k7.Q1():void");
    }

    public final void R1() {
        if (p10.i(this.f28669a).q() && (L1(this.f28669a, G1()) || this.T2)) {
            t2(false);
            return;
        }
        TL_stars.TL_starGiftUnique G1 = G1();
        if (G1 == null) {
            return;
        }
        TLRPC.Peer peer = G1.owner_id;
        if (peer == null) {
            peer = G1.host_id;
        }
        long o4 = org.telegram.messenger.m5.o(peer);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(G1.title);
        sb2.append(" #");
        this.f4203x2.setText(org.telegram.messenger.id.a0(null, null, 2131749833, jg.g.m(G1.num, ',', sb2)));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.id.M0(2131749835, null));
        if (!p10.i(this.f28669a).q()) {
            spannableStringBuilder.append((CharSequence) " l");
            if (this.S2 == null) {
                this.S2 = new wp(2131232243, 0);
            }
            spannableStringBuilder.setSpan(this.S2, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        fi.d dVar = this.f4170f2;
        dVar.i(spannableStringBuilder, true, true);
        dVar.g(null, true);
        dVar.setOnClickListener(new y1(this, 4));
        this.f4161a2.setWearPreview(qp.s1(this.f28669a).e2(o4));
        s2(2, true, null);
    }

    public final void S1(boolean z9) {
        int i7;
        ij ijVar = this.C2;
        int i10 = 0;
        if (ijVar != null) {
            TLRPC.Message message = ijVar.f23266k;
            if (message != null) {
                TLRPC.MessageAction messageAction = message.action;
                if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                    i7 = ((TLRPC.TL_messageActionStarGiftUnique) messageAction).can_craft_at;
                }
            }
            i7 = 0;
        } else {
            TL_stars.SavedStarGift savedStarGift = this.A2;
            if (savedStarGift != null) {
                i7 = savedStarGift.can_craft_at;
            }
            i7 = 0;
        }
        if (i7 > ConnectionsManager.getInstance(this.f28669a).getCurrentTime()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.I0);
            String M0 = org.telegram.messenger.id.M0(2131749777, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27300a;
            u1Var.R = M0;
            u1Var.T = org.telegram.messenger.id.a0(null, null, 2131749778, org.telegram.messenger.id.x(i7, true));
            jg.g.C(null, 2131747831, alertDialog$Builder, null);
            return;
        }
        TL_stars.TL_starGiftUnique G1 = G1();
        if (G1 == null) {
            return;
        }
        if (!TextUtils.isEmpty(G1.gift_address)) {
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, getContext(), this.I0);
            String M02 = org.telegram.messenger.id.M0(2131749792, null);
            org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.f27300a;
            u1Var2.R = M02;
            u1Var2.T = org.telegram.messenger.id.M0(2131749793, null);
            jg.g.C(null, 2131747831, alertDialog$Builder2, null);
            return;
        }
        e7 e7Var = this.f4161a2;
        if (z9) {
            e7Var.M.a(this.f28669a, G1.gift_id, G1.getDocument(), G1.title);
            if (n1()) {
                d6 d6Var = e7Var.M;
                TL_stars.TL_starGiftUnique G12 = G1();
                if (G12 == null) {
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
                            b6Var.a(G12, true);
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
        if (this.R2 == null) {
            zh.k3 k3Var = new zh.k3(this.f28669a, G1.gift_id);
            this.R2 = k3Var;
            k3Var.a();
        }
        d6Var3.setOnAddGift(new p4(this, G1, 1));
        d6Var3.setOnClose(new z1(this, 23));
        s2(4, true, null);
    }

    public final void T1(long j3) {
        fi.m3 m3Var = this.f4198t3;
        if (m3Var != null) {
            m3Var.f(true);
            this.f4198t3 = null;
        }
        dismiss();
        org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
        if (T != null && !t10.A(j3)) {
            Bundle bundle = new Bundle();
            if (j3 > 0) {
                bundle.putLong("user_id", j3);
                if (j3 == p10.i(this.f28669a).e()) {
                    bundle.putBoolean("my_profile", true);
                }
            } else {
                bundle.putLong("chat_id", -j3);
            }
            bundle.putBoolean("open_gifts", true);
            T.presentFragment(new ProfileActivity(bundle, null));
        }
    }

    public final void U1(boolean z9, vf.b bVar, Runnable runnable) {
        int i7;
        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
        if (z9) {
            i7 = 3;
        } else {
            i7 = 2;
        }
        ab.j jVar = new ab.j(this, twoStepVerificationActivity, z9, 1);
        twoStepVerificationActivity.Z = i7;
        twoStepVerificationActivity.f42053b0 = jVar;
        twoStepVerificationActivity.f42051a0 = y1();
        twoStepVerificationActivity.x0(new aa.s(this, runnable, bVar, twoStepVerificationActivity, 12));
    }

    public final void V1() {
        throw new UnsupportedOperationException("Method not decompiled: bi.k7.V1():void");
    }

    public final void W1(long j3, long j10, boolean z9, c20 c20Var) {
        String str;
        TLRPC.User user;
        String a02;
        CharSequence M0;
        TL_stars.TL_starGiftUnique G1 = G1();
        if (G1 == null) {
            return;
        }
        if (j3 >= 0) {
            TLRPC.User a22 = qp.s1(this.f28669a).a2(Long.valueOf(j3));
            str = t10.k(a22);
            user = a22;
        } else {
            TLRPC.Chat M02 = qp.s1(this.f28669a).M0(Long.valueOf(-j3));
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
        linearLayout.addView(new f6(getContext(), G1, user), c8.ha.t(-1, -2, 48, 0, -4, 0, 0));
        TextView textView = new TextView(getContext());
        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f27998j5, this.I0);
        textView.setTextSize(1, 16.0f);
        if (j10 > 0) {
            a02 = org.telegram.messenger.id.K("Gift2TransferPriceText", (int) j10, ',', y1(), org.telegram.messenger.m5.t(j3));
        } else {
            a02 = org.telegram.messenger.id.a0(null, null, 2131749913, y1(), str);
        }
        textView.setText(org.telegram.messenger.g0.X2(a02));
        linearLayout.addView(textView, c8.ha.t(-1, -2, 48, 24, 4, 24, 4));
        tx0 tx0Var = new tx0(getContext(), this.I0);
        j1(tx0Var, ea.l(G1.attributes, TL_stars.starGiftAttributeModel.class));
        j1(tx0Var, ea.l(G1.attributes, TL_stars.starGiftAttributeBackdrop.class));
        j1(tx0Var, ea.l(G1.attributes, TL_stars.starGiftAttributePattern.class));
        if (!TextUtils.isEmpty(G1.slug) && (G1.flags & 256) != 0) {
            org.telegram.messenger.r1 i7 = org.telegram.messenger.r1.i();
            long j11 = G1.value_amount;
            String str2 = G1.value_currency;
            int h = org.telegram.messenger.r1.i().h(G1.value_currency);
            i7.getClass();
            tx0Var.c(org.telegram.messenger.id.M0(2131749591, null), rf.b.i("~", org.telegram.messenger.r1.g(str2, h, j11, true)), null, null);
        }
        linearLayout.addView(tx0Var, c8.ha.t(-1, -2, 48, 23, 16, 23, 4));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.I0);
        alertDialog$Builder.o(linearLayout);
        if (j10 > 0) {
            M0 = dd.T0(org.telegram.messenger.id.a0(null, null, 2131749920, Integer.valueOf((int) j10)));
        } else {
            M0 = org.telegram.messenger.id.M0(2131749921, null);
        }
        alertDialog$Builder.k(M0, new a1.c(c20Var, 12));
        alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27300a;
        u1Var.X0 = z9;
        u1Var.show();
    }

    public final void X1(long j3, c20 c20Var) {
        TLRPC.Message message;
        long j10;
        TL_stars.SavedStarGift savedStarGift = this.A2;
        if (savedStarGift != null && (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
            j10 = savedStarGift.transfer_stars;
        } else {
            ij ijVar = this.C2;
            if (ijVar != null && (message = ijVar.f23266k) != null) {
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
        W1(j3, j10, true, c20Var);
    }

    public final void Y1() {
        TL_stars.InputSavedStarGift A1;
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
        fi.m3 m3Var = this.f4198t3;
        if (m3Var != null) {
            m3Var.f(true);
            this.f4198t3 = null;
        }
        if (this.X2 == null && (A1 = A1()) != null) {
            ij ijVar = this.C2;
            long j12 = this.S1;
            if (ijVar != null) {
                TLRPC.MessageAction messageAction = ijVar.f23266k.action;
                if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                    TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                    j10 = tL_messageActionStarGift.gift.f27189id;
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
                        if (org.telegram.messenger.m5.o(tL_messageActionStarGift.from_id) != this.C2.Z0()) {
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
                TL_stars.SavedStarGift savedStarGift = this.A2;
                if (savedStarGift != null) {
                    TL_stars.StarGift starGift = savedStarGift.gift;
                    j10 = starGift.f27189id;
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
                    TL_stars.SavedStarGift savedStarGift2 = this.A2;
                    str = savedStarGift2.prepaid_upgrade_hash;
                    z12 = savedStarGift2.upgrade_separate;
                } else {
                    return;
                }
            }
            TextView textView = this.f4195s2;
            if (z9) {
                if (z11) {
                    i7 = 2131750398;
                } else {
                    i7 = 2131750399;
                }
                textView.setText(org.telegram.messenger.id.M0(i7, null));
            } else if (z10) {
                textView.setText(org.telegram.messenger.id.M0(2131750396, null));
            } else {
                textView.setText(org.telegram.messenger.id.M0(2131750397, null));
            }
            if (!z9 && j11 > j3 && !z12) {
                z13 = true;
            } else {
                z13 = false;
            }
            wo woVar = this.f4193r2;
            woVar.a(z13, false);
            ArrayList arrayList = this.j3;
            if (arrayList != null && (j11 > j3 || this.f4186n3 != null)) {
                Z1();
                return;
            }
            if (arrayList == null) {
                ea.y(this.f28669a, false).K(j10, new y3(this, 2));
            }
            if (j11 <= j3 && this.f4186n3 == null) {
                this.f4184m3 = true;
                TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                if (!TextUtils.isEmpty(str)) {
                    TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade tL_inputInvoiceStarGiftPrepaidUpgrade = new TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade();
                    tL_inputInvoiceStarGiftPrepaidUpgrade.hash = str;
                    tL_inputInvoiceStarGiftPrepaidUpgrade.peer = qp.s1(this.f28669a).j1(j12);
                    tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftPrepaidUpgrade;
                } else {
                    TLRPC.TL_inputInvoiceStarGiftUpgrade tL_inputInvoiceStarGiftUpgrade = new TLRPC.TL_inputInvoiceStarGiftUpgrade();
                    tL_inputInvoiceStarGiftUpgrade.keep_original_details = woVar.f40026a.f31279q;
                    tL_inputInvoiceStarGiftUpgrade.stargift = A1;
                    tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftUpgrade;
                }
                JSONObject u10 = hi.a3.u(this.I0, false);
                if (u10 != null) {
                    TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                    tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                    tL_dataJSON.data = u10.toString();
                    tL_payments_getPaymentForm.flags |= 1;
                }
                ConnectionsManager.getInstance(this.f28669a).sendRequest(tL_payments_getPaymentForm, new s4(this, 0));
            }
        }
    }

    @Override
    public final boolean Z0() {
        return false;
    }

    public final void Z1() {
        throw new UnsupportedOperationException("Method not decompiled: bi.k7.Z1():void");
    }

    public final void a2() {
        TL_stars.TL_starGiftUnique G1 = G1();
        if (this.f4162a3 != null && G1 != null && !TextUtils.isEmpty(G1.slug)) {
            Context context = getContext();
            int i7 = this.f28669a;
            wg.f1[] f1VarArr = {new wg.f1(context, i7, org.telegram.messenger.v1.a(i7).b(), 3, this.I0)};
            wg.f1 f1Var = f1VarArr[0];
            f1Var.f57744u2 = org.telegram.messenger.id.M0(2131749914, null);
            org.telegram.ui.Components.ia iaVar = f1Var.f35902o1;
            if (iaVar != null) {
                iaVar.setTitle(f1Var.O0());
            }
            pg0 pg0Var = f1Var.W1;
            if (pg0Var != null) {
                pg0Var.setText(f1Var.O0());
            }
            wg.f1 f1Var2 = f1VarArr[0];
            f1Var2.B2 = true;
            f1Var2.o1(false, true);
            wg.f1 f1Var3 = f1VarArr[0];
            f1Var3.f57746w2 = new ai.f1(1, this, f1VarArr);
            f1Var3.show();
        }
    }

    public final SpannableStringBuilder c2(TLRPC.Peer peer) {
        if (peer != null) {
            String r10 = org.telegram.messenger.m5.r(qp.s1(this.f28669a).e2(org.telegram.messenger.m5.o(peer)));
            if (!TextUtils.isEmpty(r10)) {
                return org.telegram.messenger.g0.U2(org.telegram.messenger.id.a0(null, null, 2131750043, rf.b.i("@", r10)), new b4(this, r10, 8));
            }
        }
        return null;
    }

    public final SpannableStringBuilder d2(TL_stars.StarGift starGift) {
        if (starGift != null && !(starGift instanceof TL_stars.TL_starGiftUnique)) {
            return c2(starGift.released_by);
        }
        return null;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == qs.G3) {
            if (this.B2 == ((v9) objArr[1])) {
                d6 d6Var = this.f4161a2.M;
                if (d6Var == null || !d6Var.f3666h0) {
                    v2();
                }
            }
        }
    }

    @Override
    public final void dismiss() {
        if (this.W2.c(4) && this.f4161a2.M.f3666h0) {
            return;
        }
        zh.k3 k3Var = this.R2;
        if (k3Var != null) {
            k3Var.b();
            this.R2 = null;
        }
        s6 s6Var = this.K2;
        if (s6Var != null) {
            s6Var.a();
        }
        super.dismiss();
    }

    public final void g2(String str, TL_stars.TL_starGiftUnique tL_starGiftUnique, w9 w9Var) {
        boolean z9;
        boolean z10;
        s6 s6Var;
        TL_stars.TL_starGiftUnique tL_starGiftUnique2;
        this.D2 = str;
        this.E2 = tL_starGiftUnique;
        this.B2 = w9Var;
        if (tL_starGiftUnique.resell_amount != null && !J1(this.f28669a, org.telegram.messenger.m5.o(tL_starGiftUnique.owner_id))) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.F2 = z9;
        if (!this.L2 && (s6Var = this.K2) != null && s6Var.f4685o && (tL_starGiftUnique2 = s6Var.f4682l) != null && tL_starGiftUnique2.f27189id != tL_starGiftUnique.f27189id) {
            s6Var.a();
            this.K2 = null;
            e7 e7Var = this.f4161a2;
            e7Var.f3764b.setAlpha(1.0f);
            e7Var.f3766c.setAlpha(0.0f);
        }
        this.Z1.b(this.f28669a, this.A2);
        j2(tL_starGiftUnique, false, null, null);
        String str2 = tL_starGiftUnique.owner_address;
        String str3 = tL_starGiftUnique.gift_address;
        if (tL_starGiftUnique.host_id != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        TL_wallet.walletTransaction wallettransaction = this.f4167d3;
        w70 w70Var = this.f4165c2;
        if (wallettransaction == null && z10 && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            w70Var.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.g0.U2(org.telegram.messenger.id.M0(2131750181, null), new b4(this, str3, 3)), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(0.66f)));
            w70Var.setVisibility(0);
            org.telegram.ui.ActionBar.t6.U(w70Var, org.telegram.ui.ActionBar.m6.f28129q5, this.I0);
        } else {
            w70Var.setVisibility(8);
        }
        TL_wallet.walletTransaction wallettransaction2 = this.f4167d3;
        w70 w70Var2 = this.f4168e2;
        if (wallettransaction2 == null && !z10 && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            w70Var2.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.g0.U2(org.telegram.messenger.id.M0(2131750181, null), new b4(this, str3, 4)), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(0.66f)));
            w70Var2.setVisibility(0);
        } else {
            w70Var2.setVisibility(8);
        }
        w2();
        if (this.F2) {
            k2(tL_starGiftUnique);
            this.f4170f2.setOnClickListener(new y1(this, 12));
        }
        if (this.Z2) {
            s2(0, false, null);
            this.f35901m1.n0(1);
            this.Z2 = false;
        }
        v2();
    }

    public final void h2(org.telegram.messenger.ij r59, bi.w9 r60) {
        throw new UnsupportedOperationException("Method not decompiled: bi.k7.h2(org.telegram.messenger.ij, bi.w9):void");
    }

    public final void i1(TL_stars.StarGiftAttribute starGiftAttribute) {
        String M0;
        boolean z9;
        s6 s6Var;
        TL_stars.StarGiftAttribute starGiftAttribute2;
        k7 k7Var;
        ai.d0 d0Var;
        if (starGiftAttribute instanceof TL_stars.starGiftAttributeModel) {
            M0 = org.telegram.messenger.id.M0(2131750387, null);
            z9 = true;
        } else if (starGiftAttribute instanceof TL_stars.starGiftAttributePattern) {
            M0 = org.telegram.messenger.id.M0(2131750380, null);
            z9 = true;
        } else if (starGiftAttribute instanceof TL_stars.starGiftAttributeBackdrop) {
            M0 = org.telegram.messenger.id.M0(2131750388, null);
            z9 = false;
        } else {
            return;
        }
        if (!this.L2 && ((s6Var = this.K2) == null || !s6Var.f4685o)) {
            boolean[] zArr = new boolean[1];
            org.telegram.ui.Components.ic[] icVarArr = new org.telegram.ui.Components.ic[1];
            Integer[] numArr = new Integer[1];
            String F1 = F1(starGiftAttribute.rarity, numArr);
            if (starGiftAttribute.rarity instanceof TL_stars.TL_starGiftAttributeRarity) {
                starGiftAttribute2 = starGiftAttribute;
                k7Var = this;
                d0Var = new ai.d0(this, zArr, starGiftAttribute2, icVarArr, 5);
            } else {
                starGiftAttribute2 = starGiftAttribute;
                k7Var = this;
                d0Var = null;
            }
            icVarArr[0] = (org.telegram.ui.Components.ic) ((qx0) k7Var.d2.e(M0, starGiftAttribute2.name, F1, d0Var, numArr[0]).getChildAt(1)).getChildAt(0);
            return;
        }
        x6 x6Var = new x6(getContext(), this.I0, new h2(this, 0));
        TableRow tableRow = new TableRow(getContext());
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
        tx0 tx0Var = this.d2;
        tableRow.addView(new sx0(tx0Var, M0), layoutParams);
        tableRow.addView(new qx0(tx0Var, x6Var, true), new TableRow.LayoutParams(0, -1, 1.0f));
        tx0Var.addView(tableRow);
        s6 s6Var2 = this.K2;
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

    public final void i2(org.telegram.tgnet.tl.TL_stars.SavedStarGift r36, bi.w9 r37) {
        throw new UnsupportedOperationException("Method not decompiled: bi.k7.i2(org.telegram.tgnet.tl.TL_stars$SavedStarGift, bi.w9):void");
    }

    public final void j2(org.telegram.tgnet.tl.TL_stars.TL_starGiftUnique r36, boolean r37, org.telegram.tgnet.TLObject r38, org.telegram.tgnet.TLRPC.TL_textWithEntities r39) {
        throw new UnsupportedOperationException("Method not decompiled: bi.k7.j2(org.telegram.tgnet.tl.TL_stars$TL_starGiftUnique, boolean, org.telegram.tgnet.TLObject, org.telegram.tgnet.TLRPC$TL_textWithEntities):void");
    }

    @Override
    public org.telegram.ui.Components.gc k() {
        return new org.telegram.ui.Components.gc(this.f4179k2, this.I0);
    }

    public final void k1(LinearLayout linearLayout, int i7, int i10, int i11, String str, boolean z9) {
        int i12;
        int i13;
        ImageView imageView = new ImageView(getContext());
        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(i7);
        org.telegram.ui.ActionBar.h6 h6Var = this.I0;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        org.telegram.ui.ActionBar.t6.s(imageView, i11, h6Var, mode);
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
        int i14 = org.telegram.ui.ActionBar.m6.f28148r5;
        org.telegram.ui.ActionBar.t6.U(textView, i14, this.I0);
        textView.setText(str);
        linearLayout.addView(textView, c8.ha.t(-2, -2, 16, 4, 0, 0, 0));
        if (z9) {
            ImageView imageView2 = new ImageView(getContext());
            imageView2.setScaleType(scaleType);
            imageView2.setImageResource(2131232250);
            org.telegram.ui.ActionBar.t6.s(imageView2, i14, this.I0, mode);
            linearLayout.addView(imageView2, c8.ha.t(11, 11, 16, 5, 0, 2, 0));
        }
    }

    public final void k2(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        cg.a resellAmount = tL_starGiftUnique.getResellAmount(cg.b.f6165a);
        boolean z9 = tL_starGiftUnique.resale_ton_only;
        fi.d dVar = this.f4170f2;
        if (z9) {
            dVar.i(dd.s1(dd.V0(org.telegram.messenger.id.a0(null, null, 2131746146, tL_starGiftUnique.getResellAmount(cg.b.f6166b).d()), true), true), !this.Z2, true);
            dVar.g(dd.T0(org.telegram.messenger.id.H(',', "ResellGiftBuyEq", (int) resellAmount.a())), !this.Z2);
            return;
        }
        dVar.i(dd.T0(org.telegram.messenger.id.H(',', "ResellGiftBuy", (int) resellAmount.a())), !this.Z2, true);
        dVar.g(null, !this.Z2);
    }

    public final void l1(TL_stars.InputSavedStarGift inputSavedStarGift, TLRPC.Updates updates, Runnable runnable) {
        TLRPC.Message message;
        TL_stars.StarGift starGift;
        if (updates == null) {
            ea.y(this.f28669a, false).P(w1());
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
            TL_stars.SavedStarGift savedStarGift = this.A2;
            if (savedStarGift != null && (!(inputSavedStarGift instanceof TL_stars.TL_inputSavedStarGiftUser) ? !(!(inputSavedStarGift instanceof TL_stars.TL_inputSavedStarGiftChat) ? !(inputSavedStarGift instanceof TL_stars.TL_inputSavedStarGiftSlug) || (starGift = savedStarGift.gift) == null || !TextUtils.equals(starGift.slug, ((TL_stars.TL_inputSavedStarGiftSlug) inputSavedStarGift).slug) : savedStarGift.saved_id != ((TL_stars.TL_inputSavedStarGiftChat) inputSavedStarGift).saved_id) : savedStarGift.msg_id == ((TL_stars.TL_inputSavedStarGiftUser) inputSavedStarGift).msg_id)) {
                TLRPC.MessageAction messageAction = message.action;
                if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                    this.L2 = true;
                    TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
                    TL_stars.SavedStarGift savedStarGift2 = this.A2;
                    savedStarGift2.gift = tL_messageActionStarGiftUnique.gift;
                    savedStarGift2.msg_id = message.f26981id;
                    savedStarGift2.flags = (savedStarGift2.flags | 8) & (-2049);
                    savedStarGift2.saved_id = 0L;
                    savedStarGift2.unsaved = !tL_messageActionStarGiftUnique.saved;
                    savedStarGift2.refunded = tL_messageActionStarGiftUnique.refunded;
                    savedStarGift2.can_upgrade = false;
                    savedStarGift2.can_resell_at = tL_messageActionStarGiftUnique.can_resell_at;
                    savedStarGift2.can_transfer_at = tL_messageActionStarGiftUnique.can_transfer_at;
                    savedStarGift2.can_export_at = tL_messageActionStarGiftUnique.can_export_at;
                    i2(savedStarGift2, this.B2);
                    this.j3 = null;
                    this.L2 = false;
                    w9 w9Var = this.B2;
                    if (w9Var != null) {
                        w9Var.d();
                    } else {
                        ea.y(this.f28669a, false).P(this.S1);
                    }
                    org.telegram.messenger.g0.h3(runnable);
                    return;
                }
            }
            if (this.B2 == null) {
                ea.y(this.f28669a, false).P(w1());
            }
            this.L2 = true;
            this.A2 = null;
            this.f4205z2 = false;
            ij ijVar = new ij(this.f28669a, message, false, false);
            ijVar.L5();
            h2(ijVar, this.B2);
            this.j3 = null;
            this.L2 = false;
            org.telegram.messenger.g0.h3(runnable);
            return;
        }
        ea.y(this.f28669a, false).P(w1());
        dismiss();
    }

    public final void l2(TL_stars.TL_starGiftUnique tL_starGiftUnique, boolean z9) {
        if (z9) {
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_peerUser.user_id = p10.i(this.f28669a).e();
            tL_starGiftUnique.host_id = tL_peerUser;
            tL_starGiftUnique.flags |= 4096;
        } else {
            tL_starGiftUnique.host_id = null;
            tL_starGiftUnique.flags &= -4097;
        }
        this.f4161a2.setWalletDisplayed(z9);
        w2();
    }

    public final boolean m1() {
        int i7;
        boolean z9;
        boolean z10;
        TLRPC.Peer peer;
        if (A1() == null) {
            return false;
        }
        ij ijVar = this.C2;
        if (ijVar != null) {
            TLRPC.MessageAction messageAction = ijVar.f23266k.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                if (tL_messageActionStarGift.peer != null) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                boolean P3 = ijVar.P3();
                if (ij.B0(this.C2.f23266k) == p10.i(this.f28669a).e()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                int currentTime = qp.s1(this.f28669a).E6 - (ConnectionsManager.getInstance(this.f28669a).getCurrentTime() - this.C2.f23266k.date);
                if (((z9 || (P3 && !z10)) && ((peer = tL_messageActionStarGift.peer) == null || !K1(this.f28669a, org.telegram.messenger.m5.o(peer)))) || tL_messageActionStarGift.converted || tL_messageActionStarGift.convert_stars <= 0 || currentTime <= 0) {
                    return false;
                }
                return true;
            }
        } else {
            TL_stars.SavedStarGift savedStarGift = this.A2;
            if (savedStarGift != null) {
                int currentTime2 = qp.s1(this.f28669a).E6 - (ConnectionsManager.getInstance(this.f28669a).getCurrentTime() - savedStarGift.date);
                int i10 = this.f28669a;
                long j3 = this.S1;
                if (K1(i10, j3)) {
                    int i11 = this.A2.flags;
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

    public final void m2(boolean z9) {
        int i7;
        Object obj;
        i5 i5Var;
        i5 i5Var2;
        i5 i5Var3;
        int C1 = C1();
        if (C1 >= 0) {
            if (z9) {
                i7 = 1;
            } else {
                i7 = -1;
            }
            int i10 = i7 + C1;
            int i11 = this.P2;
            if (i11 >= 0 && (!z9 ? i11 < C1 : i11 > C1)) {
                i10 = i11;
            }
            w9 w9Var = this.B2;
            if (w9Var != null && i10 >= 0 && i10 < w9Var.e()) {
                obj = this.B2.get(i10);
            } else {
                obj = null;
            }
            if (obj != null) {
                if (z9) {
                    i5Var = this.Y1;
                } else {
                    i5Var = this.X1;
                }
                if (i5Var != null) {
                    if (obj instanceof TL_stars.SavedStarGift) {
                        if (z9) {
                            i5Var3 = this.Y1;
                        } else {
                            i5Var3 = this.X1;
                        }
                        if (t1(i5Var3.A2, (TL_stars.SavedStarGift) obj)) {
                            return;
                        }
                    }
                    if (obj instanceof TL_stars.TL_starGiftUnique) {
                        if (z9) {
                            i5Var2 = this.Y1;
                        } else {
                            i5Var2 = this.X1;
                        }
                        if (u1(i5Var2.E2, (TL_stars.TL_starGiftUnique) obj)) {
                            return;
                        }
                    }
                }
                i5 i5Var4 = new i5(this, getContext(), this.f28669a, this.S1, this.I0, this.T1.getRootView());
                if (obj instanceof TL_stars.SavedStarGift) {
                    i5Var4.i2((TL_stars.SavedStarGift) obj, this.B2);
                } else if (obj instanceof TL_stars.TL_starGiftUnique) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj;
                    i5Var4.g2(tL_starGiftUnique.slug, tL_starGiftUnique, this.B2);
                }
                org.telegram.messenger.g0.E2(i5Var4.f28672b);
                if (z9) {
                    this.Y1 = i5Var4;
                } else {
                    this.X1 = i5Var4;
                }
            }
        }
    }

    public final boolean n1() {
        int i7;
        TL_stars.TL_starGiftUnique G1 = G1();
        if (G1 == null || G1.crafted || !K1(this.f28669a, org.telegram.messenger.m5.o(G1.owner_id))) {
            return false;
        }
        ij ijVar = this.C2;
        if (ijVar != null) {
            TLRPC.Message message = ijVar.f23266k;
            if (message == null) {
                return false;
            }
            TLRPC.MessageAction messageAction = message.action;
            if (!(messageAction instanceof TLRPC.TL_messageActionStarGiftUnique)) {
                return false;
            }
            i7 = ((TLRPC.TL_messageActionStarGiftUnique) messageAction).can_craft_at;
        } else {
            TL_stars.SavedStarGift savedStarGift = this.A2;
            if (savedStarGift != null && (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
                i7 = savedStarGift.can_craft_at;
            }
            return false;
        }
        int currentTime = ConnectionsManager.getInstance(this.f28669a).getCurrentTime();
        if (i7 <= 0 || currentTime < i7) {
            return false;
        }
        return true;
    }

    public final void n2() {
        TL_stars.TL_starGiftUnique G1 = G1();
        if (G1 == null) {
            return;
        }
        TLRPC.Peer peer = G1.owner_id;
        if (peer == null) {
            peer = G1.host_id;
        }
        long o4 = org.telegram.messenger.m5.o(peer);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(G1.title);
        sb2.append(" #");
        this.f4203x2.setText(org.telegram.messenger.id.a0(null, null, 2131749833, jg.g.m(G1.num, ',', sb2)));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.id.M0(2131749835, null));
        if (o4 == p10.i(this.f28669a).e() && !p10.i(this.f28669a).q()) {
            spannableStringBuilder.append((CharSequence) " l");
            if (this.S2 == null) {
                this.S2 = new wp(2131232243, 0);
            }
            spannableStringBuilder.setSpan(this.S2, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        fi.d dVar = this.f4170f2;
        dVar.i(spannableStringBuilder, true, true);
        dVar.g(null, true);
        dVar.setOnClickListener(new y1(this, 27));
        this.f4161a2.setWearPreview(qp.s1(this.f28669a).e2(o4));
        s2(2, false, null);
        this.f4201v2 = true;
    }

    public final boolean o1() {
        throw new UnsupportedOperationException("Method not decompiled: bi.k7.o1():boolean");
    }

    public final void o2(CharSequence charSequence) {
        TL_stars.TL_starGiftUnique G1 = G1();
        TL_stars.InputSavedStarGift A1 = A1();
        if (A1 != null && G1 != null) {
            TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails tL_inputInvoiceStarGiftDropOriginalDetails = new TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails();
            tL_inputInvoiceStarGiftDropOriginalDetails.stargift = A1;
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftDropOriginalDetails;
            JSONObject u10 = hi.a3.u(this.I0, false);
            if (u10 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = u10.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            ConnectionsManager.getInstance(this.f28669a).sendRequest(tL_payments_getPaymentForm, new g2(this, charSequence, G1, tL_inputInvoiceStarGiftDropOriginalDetails, 1));
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        qs.f(this.f28669a).c(this, qs.G3);
    }

    @Override
    public final void onBackPressed() {
        e7 e7Var;
        d6 d6Var;
        if (this.W2.c(4) && (e7Var = this.f4161a2) != null && (d6Var = e7Var.M) != null) {
            if (d6Var.f3666h0) {
                return;
            }
            if (d6Var.f3667i0) {
                super.onBackPressed();
                return;
            }
        }
        if (!this.f4201v2 && this.W2.f3941c > 0 && !this.f4170f2.Q && !this.f4177i3) {
            ij ijVar = this.C2;
            if (ijVar != null) {
                h2(ijVar, null);
            } else {
                TL_stars.SavedStarGift savedStarGift = this.A2;
                if (savedStarGift != null) {
                    i2(savedStarGift, this.B2);
                } else {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = this.E2;
                    if (tL_starGiftUnique != null) {
                        g2(this.D2, tL_starGiftUnique, this.B2);
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
        qs.f(this.f28669a).n(this, qs.G3);
    }

    public final void p1() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.I0);
        String M0 = org.telegram.messenger.id.M0(2131750266, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27300a;
        u1Var.R = M0;
        u1Var.T = org.telegram.messenger.id.M0(2131750267, null);
        TL_stars.TL_starGiftUnique G1 = G1();
        if (G1 != null && !TextUtils.isEmpty(G1.slug)) {
            alertDialog$Builder.k(org.telegram.messenger.id.M0(2131747805, null), new o4(this, G1, 1));
        }
        jg.g.w(null, 2131752589, alertDialog$Builder, null);
    }

    public final void p2(View view, CharSequence charSequence, boolean z9) {
        Layout layout;
        org.telegram.ui.Components.jc jcVar;
        float primaryHorizontal;
        int i7;
        fi.m3 m3Var = this.f4198t3;
        if ((m3Var == null || !m3Var.V || this.f4200u3 != view) && view != null) {
            if (z9) {
                if (view instanceof org.telegram.ui.ActionBar.m5) {
                    org.telegram.ui.ActionBar.m5 m5Var = (org.telegram.ui.ActionBar.m5) view;
                    primaryHorizontal = (m5Var.getRightDrawableWidth() / 2.0f) + m5Var.getRightDrawableX();
                } else {
                    return;
                }
            } else {
                if (view instanceof TextView) {
                    layout = ((TextView) view).getLayout();
                } else if (view instanceof org.telegram.ui.ActionBar.m5) {
                    layout = ((org.telegram.ui.ActionBar.m5) view).getLayout();
                } else {
                    return;
                }
                if (layout != null) {
                    CharSequence text = layout.getText();
                    if (text instanceof Spanned) {
                        Spanned spanned = (Spanned) text;
                        org.telegram.ui.Components.jc[] jcVarArr = (org.telegram.ui.Components.jc[]) spanned.getSpans(0, spanned.length(), org.telegram.ui.Components.jc.class);
                        if (jcVarArr != null && jcVarArr.length > 0) {
                            primaryHorizontal = layout.getPrimaryHorizontal(spanned.getSpanStart(jcVarArr[jcVarArr.length - 1])) + view.getPaddingLeft() + (jcVar.a() / 2.0f);
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
            m5 m5Var2 = this.T1;
            m5Var2.getLocationOnScreen(iArr);
            int[] iArr2 = {iArr2[0] - iArr[0], iArr2[1] - iArr[1]};
            fi.m3 m3Var2 = this.f4198t3;
            if (m3Var2 != null) {
                m3Var2.f(true);
                this.f4198t3 = null;
            }
            fi.m3 m3Var3 = new fi.m3(getContext(), 3);
            m3Var3.r(!z9);
            m3Var3.u(charSequence);
            m3Var3.p(0.0f, (iArr2[0] + primaryHorizontal) - (org.telegram.messenger.g0.L(16.0f) + this.f28705t0));
            float L = (iArr2[1] - org.telegram.messenger.g0.L(100.0f)) - (view.getHeight() / 2.0f);
            if (z9) {
                i7 = 18;
            } else {
                i7 = 0;
            }
            m3Var3.setTranslationY(L + org.telegram.messenger.g0.L(i7 + 4.33f));
            m3Var3.d = 3000L;
            m3Var3.setPadding(org.telegram.messenger.g0.L(16.0f) + this.f28705t0, 0, org.telegram.messenger.g0.L(16.0f) + this.f28705t0, 0);
            m3Var3.f12438q0 = new s2(m3Var3, 0);
            m3Var3.w();
            m5Var2.addView(m3Var3, c8.ha.c(100.0f, -1));
            this.f4198t3 = m3Var3;
            this.f4200u3 = view;
        }
    }

    public final void q1(long j3, TL_stars.starGiftDepositPayload stargiftdepositpayload, vf.b bVar, wg.f1 f1Var) {
        TL_wallet.nftItem nftitem = this.f4162a3;
        TL_stars.TL_starGiftUnique G1 = G1();
        if (nftitem != null && G1 != null && !TextUtils.isEmpty(G1.slug)) {
            bVar.d();
            q3 q3Var = new q3(this, bVar, f1Var, j3, G1, nftitem, 0);
            if (stargiftdepositpayload != null) {
                q3Var.a(stargiftdepositpayload);
                return;
            }
            TL_stars.depositStarGift depositstargift = new TL_stars.depositStarGift();
            depositstargift.peer = qp.s1(this.f28669a).j1(j3);
            depositstargift.slug = G1.slug;
            ConnectionsManager.getInstance(this.f28669a).sendRequestTyped(depositstargift, new d3.b(1), new q2(this, bVar, f1Var, q3Var, 1));
        }
    }

    public final void q2(int i7, Context context, boolean z9) {
        int i10;
        int i11;
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        FrameLayout frameLayout = new FrameLayout(context);
        int L = org.telegram.messenger.g0.L(64.0f);
        int i12 = org.telegram.ui.ActionBar.m6.Ci;
        ShapeDrawable L2 = org.telegram.ui.ActionBar.m6.L(L, org.telegram.ui.ActionBar.m6.w0(i12, this.I0));
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i12);
        org.telegram.ui.ActionBar.h6 h6Var = this.I0;
        frameLayout.setBackground(L2);
        org.telegram.ui.ActionBar.t6.j(frameLayout, L2, M, null, h6Var);
        f10.addView(frameLayout, c8.ha.t(64, 64, 49, 0, 6, 0, 0));
        ?? imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.f(2131624291, 42, 42, null);
        frameLayout.addView((View) imageView, c8.ha.r(64, 64, 17));
        imageView.d();
        TextView b10 = c8.qa.b(context, 20.0f, org.telegram.ui.ActionBar.m6.G6, true, null);
        b10.setGravity(17);
        if (z9) {
            i10 = 2131750005;
        } else {
            i10 = 2131749911;
        }
        b10.setText(org.telegram.messenger.id.M0(i10, null));
        f10.addView(b10, c8.ha.t(-1, -2, 48, 24, 14, 24, 0));
        TextView b11 = c8.qa.b(context, 14.0f, org.telegram.ui.ActionBar.m6.F6, false, null);
        b11.setGravity(17);
        if (z9) {
            i11 = 2131750006;
        } else {
            i11 = 2131749912;
        }
        b11.setText(org.telegram.messenger.id.a0(null, null, i11, org.telegram.messenger.id.c0(Math.max(10, i7))));
        f10.addView(b11, c8.ha.t(-1, -2, 48, 24, 6, 24, 6));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, this.I0);
        alertDialog$Builder.o(f10);
        alertDialog$Builder.k(org.telegram.messenger.id.M0(2131747831, null), null);
        alertDialog$Builder.p();
    }

    @Override
    public final void r0() {
        fi.m3 m3Var = this.f4198t3;
        if (m3Var != null) {
            m3Var.f(true);
            this.f4198t3 = null;
        }
    }

    public final void r1(final long j3, final c20 c20Var) {
        TLRPC.Message message;
        long o4;
        long j10;
        TL_stars.InputSavedStarGift A1 = A1();
        if (A1 != null) {
            TL_stars.SavedStarGift savedStarGift = this.A2;
            if (savedStarGift != null && (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
                j10 = savedStarGift.transfer_stars;
                o4 = this.S1;
            } else {
                ij ijVar = this.C2;
                if (ijVar != null && (message = ijVar.f23266k) != null) {
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
                transferstargift.stargift = A1;
                transferstargift.to_id = qp.s1(this.f28669a).j1(j3);
                final long j11 = o4;
                ConnectionsManager.getInstance(this.f28669a).sendRequest(transferstargift, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        boolean z9 = tLObject instanceof TLRPC.Updates;
                        k7 k7Var = k7.this;
                        if (z9) {
                            qp.s1(k7Var.f28669a).O3((TLRPC.Updates) tLObject, false);
                        }
                        org.telegram.messenger.g0.h3(new i3(k7Var, c20Var, tL_error, tLObject, j3, j11));
                    }
                });
                return;
            }
            long j12 = o4;
            ea y10 = ea.y(this.f28669a, false);
            if (!y10.f3807e) {
                y10.r(new w2(this, y10, j3, c20Var, 0));
                return;
            }
            TLRPC.TL_inputInvoiceStarGiftTransfer tL_inputInvoiceStarGiftTransfer = new TLRPC.TL_inputInvoiceStarGiftTransfer();
            tL_inputInvoiceStarGiftTransfer.stargift = A1;
            tL_inputInvoiceStarGiftTransfer.to_id = qp.s1(this.f28669a).j1(j3);
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftTransfer;
            JSONObject u10 = hi.a3.u(this.I0, false);
            if (u10 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = u10.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            ConnectionsManager.getInstance(this.f28669a).sendRequest(tL_payments_getPaymentForm, new x2(this, tL_inputInvoiceStarGiftTransfer, j3, j12, c20Var));
        }
    }

    public final void r2(boolean z9, org.telegram.ui.ActionBar.u1 u1Var, vf.b bVar, Runnable runnable) {
        bVar.d();
        p10 i7 = p10.i(this.f28669a);
        TL_account.tmpPassword tmppassword = i7.f24503y;
        if (tmppassword != null && tmppassword.valid_until < ConnectionsManager.getInstance(this.f28669a).getCurrentTime() + 60) {
            i7.f24503y = null;
            i7.v(false);
        }
        TL_account.tmpPassword tmppassword2 = i7.f24503y;
        if (tmppassword2 == null) {
            U1(z9, bVar, runnable);
        } else {
            I1(tmppassword2.tmp_password, null, z9, new n3(this, z9, bVar, runnable, u1Var));
        }
    }

    @Override
    public final void s0() {
        super.s0();
        try {
            P(org.telegram.ui.ActionBar.m6.f27963h5);
            e7 e7Var = this.f4161a2;
            if (e7Var != null) {
                e7Var.l();
            }
            wp wpVar = this.Y2;
            if (wpVar != null) {
                Drawable drawable = wpVar.f40034c;
                if (drawable instanceof f7) {
                    ((f7) drawable).d.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Ci, this.I0));
                    fi.d dVar = this.f4170f2;
                    if (dVar != null) {
                        dVar.invalidate();
                    }
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void s1() {
        TL_stars.InputSavedStarGift A1;
        long j3;
        fi.d dVar = this.f4170f2;
        if (!dVar.Q && (A1 = A1()) != null) {
            ij ijVar = this.C2;
            String str = null;
            long j10 = 0;
            if (ijVar != null) {
                TLRPC.MessageAction messageAction = ijVar.f23266k.action;
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
                TL_stars.SavedStarGift savedStarGift = this.A2;
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
            if (i7 > 0 || this.f4186n3 != null) {
                dVar.setLoading(true);
                wo woVar = this.f4193r2;
                if (i7 > 0) {
                    TL_stars.upgradeStarGift upgradestargift = new TL_stars.upgradeStarGift();
                    upgradestargift.keep_original_details = woVar.f40026a.f31279q;
                    upgradestargift.stargift = A1;
                    ConnectionsManager.getInstance(this.f28669a).sendRequest(upgradestargift, new j(4, this, A1));
                    return;
                }
                int i10 = 0;
                ea y10 = ea.y(this.f28669a, false);
                if (!y10.f3807e) {
                    y10.r(new a1.e(28, this, y10));
                    return;
                }
                TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
                tL_payments_sendStarsForm.form_id = this.f4186n3.form_id;
                if (!TextUtils.isEmpty(str)) {
                    TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade tL_inputInvoiceStarGiftPrepaidUpgrade = new TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade();
                    tL_inputInvoiceStarGiftPrepaidUpgrade.hash = str;
                    tL_inputInvoiceStarGiftPrepaidUpgrade.peer = qp.s1(this.f28669a).j1(this.S1);
                    tL_payments_sendStarsForm.invoice = tL_inputInvoiceStarGiftPrepaidUpgrade;
                } else {
                    TLRPC.TL_inputInvoiceStarGiftUpgrade tL_inputInvoiceStarGiftUpgrade = new TLRPC.TL_inputInvoiceStarGiftUpgrade();
                    tL_inputInvoiceStarGiftUpgrade.keep_original_details = woVar.f40026a.f31279q;
                    tL_inputInvoiceStarGiftUpgrade.stargift = A1;
                    tL_payments_sendStarsForm.invoice = tL_inputInvoiceStarGiftUpgrade;
                }
                ArrayList<TLRPC.TL_labeledPrice> arrayList = this.f4186n3.invoice.prices;
                int size = arrayList.size();
                while (i10 < size) {
                    TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i10);
                    i10++;
                    j10 += tL_labeledPrice.amount;
                }
                ConnectionsManager.getInstance(this.f28669a).sendRequest(tL_payments_sendStarsForm, new f0(this, str, A1, j10, 1));
            }
        }
    }

    public final void s2(int r12, boolean r13, bi.k1 r14) {
        throw new UnsupportedOperationException("Method not decompiled: bi.k7.s2(int, boolean, bi.k1):void");
    }

    @Override
    public final void show() {
        ij ijVar;
        TLRPC.Message message;
        if (qp.s1(this.f28669a).v2()) {
            org.telegram.ui.b.b(this.f28669a);
            return;
        }
        if (this.D2 != null && this.E2 == null) {
            org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, getContext(), null);
            u1Var.r(500L);
            TL_stars.getUniqueStarGift getuniquestargift = new TL_stars.getUniqueStarGift();
            getuniquestargift.slug = this.D2;
            ConnectionsManager.getInstance(this.f28669a).sendRequest(getuniquestargift, new j(2, this, u1Var));
        } else if (this.A2 == null && (ijVar = this.C2) != null && (message = ijVar.f23266k) != null) {
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                if (tL_messageActionStarGift.upgraded) {
                    if (tL_messageActionStarGift.upgrade_msg_id != 0) {
                        org.telegram.ui.ActionBar.u1 u1Var2 = new org.telegram.ui.ActionBar.u1(3, getContext(), null);
                        u1Var2.r(500L);
                        TLRPC.TL_messages_getMessages tL_messages_getMessages = new TLRPC.TL_messages_getMessages();
                        tL_messages_getMessages.f27056id.add(Integer.valueOf(tL_messageActionStarGift.upgrade_msg_id));
                        ConnectionsManager.getInstance(this.f28669a).sendRequest(tL_messages_getMessages, new f2(this, tL_messageActionStarGift, u1Var2, 0));
                        return;
                    } else if (A1() != null) {
                        org.telegram.ui.ActionBar.u1 u1Var3 = new org.telegram.ui.ActionBar.u1(3, getContext(), null);
                        u1Var3.r(500L);
                        ea.y(this.f28669a, false).M(A1(), new ai.f1(2, this, u1Var3));
                        return;
                    }
                }
            }
        }
        super.show();
    }

    public final void t2(boolean z9) {
        boolean z10;
        int i7;
        int i10;
        TL_stars.TL_starGiftUnique G1 = G1();
        if (G1 == null) {
            return;
        }
        qp.e1().edit().putInt("statusgiftpage", 3).apply();
        boolean L1 = L1(this.f28669a, G1());
        boolean z11 = !L1;
        boolean L12 = L1(this.f28669a, G1());
        fi.d dVar = this.f4170f2;
        if (L12) {
            qp.s1(this.f28669a).g5(w1(), new TLRPC.TL_emojiStatusEmpty(), null);
            z10 = z11;
        } else {
            z10 = z11;
            long w12 = w1();
            if (w12 >= 0) {
                if (!p10.i(this.f28669a).q()) {
                    org.telegram.ui.Components.bc P = k().P(2131624216, org.telegram.messenger.g0.x2(org.telegram.messenger.id.M0(2131750423, null), new z1(this, 2)));
                    P.f32213t = true;
                    P.j();
                    return;
                }
            } else if (!z9) {
                qp s12 = qp.s1(this.f28669a);
                dVar.setLoading(true);
                qp.s1(this.f28669a).G0().a(w12, new b2(this, s12, w12, 0));
                return;
            }
            TLRPC.TL_inputEmojiStatusCollectible tL_inputEmojiStatusCollectible = new TLRPC.TL_inputEmojiStatusCollectible();
            tL_inputEmojiStatusCollectible.collectible_id = G1.f27189id;
            qp.s1(this.f28669a).g5(w1(), tL_inputEmojiStatusCollectible, G1);
        }
        x5 x5Var = this.f4161a2.I[1];
        if (!L1) {
            i7 = 2131231102;
        } else {
            i7 = 2131231103;
        }
        if (!L1) {
            i10 = 2131750422;
        } else {
            i10 = 2131750425;
        }
        x5Var.e(i7, org.telegram.messenger.id.M0(i10, null), true);
        if (this.f4201v2) {
            dismiss();
            return;
        }
        k1 k1Var = new k1(1, this, z10);
        if (this.W2.c(0)) {
            k1Var.run();
        } else {
            s2(0, true, k1Var);
        }
        dVar.i(org.telegram.messenger.id.M0(2131747831, null), !this.Z2, true);
        dVar.g(null, !this.Z2);
        dVar.setOnClickListener(new y1(this, 5));
    }

    public final void u2() {
        FrameLayout frameLayout = this.f4176i2;
        int visibility = frameLayout.getVisibility();
        FrameLayout frameLayout2 = this.f4179k2;
        FrameLayout frameLayout3 = this.f4172g2;
        if (visibility == 0) {
            frameLayout3.setTranslationY(this.W2.a(1) * (-frameLayout.getMeasuredHeight()));
            frameLayout.setTranslationY((1.0f - this.W2.a(1)) * frameLayout.getMeasuredHeight());
            frameLayout2.setTranslationY(this.W2.a(1) * (-frameLayout.getMeasuredHeight()));
            return;
        }
        frameLayout3.setTranslationY(0.0f);
        frameLayout.setTranslationY(0.0f);
        frameLayout2.setTranslationY(0.0f);
    }

    public final int v1() {
        if (this.W2.d(1)) {
            return this.f4185n2.getMeasuredHeight();
        }
        if (this.W2.d(2)) {
            return this.f4202w2.getMeasuredHeight();
        }
        if (this.W2.d(3)) {
            return this.f4204y2.getMeasuredHeight();
        }
        if (this.W2.d(4)) {
            return 0;
        }
        return this.f4163b2.getMeasuredHeight();
    }

    public final void v2() {
        boolean H1 = H1(false);
        f5 f5Var = this.U1;
        f5Var.setPosition(H1 ? 1 : 0);
        f5Var.D(false);
        if (this.B2 != null && !H1(true) && this.B2.e() < this.B2.c()) {
            this.B2.a();
        }
    }

    public final long w1() {
        TLRPC.Peer peer;
        ij ijVar = this.C2;
        if (ijVar != null) {
            TLRPC.Message message = ijVar.f23266k;
            if (message != null) {
                TLRPC.MessageAction messageAction = message.action;
                if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                    TLRPC.Peer peer2 = ((TLRPC.TL_messageActionStarGift) messageAction).peer;
                    if (peer2 != null) {
                        return org.telegram.messenger.m5.o(peer2);
                    }
                    if (ijVar.P3()) {
                        return ij.B0(this.C2.f23266k);
                    }
                    return p10.i(this.f28669a).e();
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
        TL_stars.SavedStarGift savedStarGift = this.A2;
        if (savedStarGift != null) {
            TL_stars.StarGift starGift2 = savedStarGift.gift;
            if (starGift2 instanceof TL_stars.TL_starGiftUnique) {
                return org.telegram.messenger.m5.o(((TL_stars.TL_starGiftUnique) starGift2).owner_id);
            }
            return this.S1;
        }
        TL_stars.TL_starGiftUnique tL_starGiftUnique = this.E2;
        if (tL_starGiftUnique != null) {
            return org.telegram.messenger.m5.o(tL_starGiftUnique.owner_id);
        }
        return 0L;
    }

    public final void w2() {
        TL_stars.TL_starGiftUnique G1 = G1();
        TL_wallet.nftItem nftitem = this.f4162a3;
        LinearLayout linearLayout = this.f4197t2;
        if (nftitem != null && G1 != null) {
            this.f4165c2.setVisibility(8);
            this.f4168e2.setVisibility(8);
            boolean z9 = false;
            linearLayout.setVisibility(0);
            if (G1.host_id != null) {
                z9 = true;
            }
            this.f4199u2.a(z9, linearLayout.isAttachedToWindow());
            return;
        }
        linearLayout.setVisibility(8);
    }

    public final TL_stars.StarGift x1() {
        ij ijVar = this.C2;
        if (ijVar != null) {
            TLRPC.Message message = ijVar.f23266k;
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
            TL_stars.SavedStarGift savedStarGift = this.A2;
            if (savedStarGift != null) {
                return savedStarGift.gift;
            }
            TL_stars.TL_starGiftUnique tL_starGiftUnique = this.E2;
            if (tL_starGiftUnique != null) {
                return tL_starGiftUnique;
            }
        }
        return null;
    }

    public final String y1() {
        TL_stars.StarGift x12 = x1();
        if (x12 instanceof TL_stars.TL_starGiftUnique) {
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) x12;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(tL_starGiftUnique.title);
            sb2.append(" #");
            return jg.g.m(tL_starGiftUnique.num, ',', sb2);
        }
        return "";
    }
}
