package di;

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
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.messenger.is;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.q10;
import org.telegram.messenger.z10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.fp;
import org.telegram.ui.Components.nz;
import org.telegram.ui.Components.sx0;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.ux0;
import org.telegram.ui.Components.vx0;
import org.telegram.ui.Components.z70;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.mg0;
public class c6 extends org.telegram.ui.Components.ja implements is {
    public static final int f8306w3 = 0;
    public boolean A2;
    public TL_stars.SavedStarGift B2;
    public n8 C2;
    public gj D2;
    public String E2;
    public TL_stars.TL_starGiftUnique F2;
    public boolean G2;
    public boolean H2;
    public boolean I2;
    public boolean J2;
    public boolean K2;
    public l5 L2;
    public boolean M2;
    public j4 N2;
    public final int[] O2;
    public i4 P2;
    public int Q2;
    public String R2;
    public bi.y5 S2;
    public final long T1;
    public eq T2;
    public final k4 U1;
    public boolean U2;
    public final e4 V1;
    public x3 V2;
    public final nz W1;
    public Float W2;
    public final View X1;
    public b5 X2;
    public bi.b2 Y1;
    public ValueAnimator Y2;
    public bi.b2 Z1;
    public eq Z2;
    public final h4 f8307a2;
    public boolean f8308a3;
    public final w5 f8309b2;
    public TL_wallet.nftItem f8310b3;
    public final g4 f8311c2;
    public org.telegram.ui.Wallet.g5 f8312c3;
    public final z70 d2;
    public org.telegram.ui.Wallet.h5 f8313d3;
    public final vx0 f8314e2;
    public TL_wallet.walletTransaction f8315e3;
    public final z70 f8316f2;
    public View f8317f3;
    public final hi.d f8318g2;
    public bi.o3 f8319g3;
    public final FrameLayout f8320h2;
    public boolean f8321h3;
    public final z70 f8322i2;
    public Boolean f8323i3;
    public final FrameLayout f8324j2;
    public boolean j3;
    public final View f8325k2;
    public ArrayList f8326k3;
    public final FrameLayout f8327l2;
    public ArrayList f8328l3;
    public y5 f8329m2;
    public ArrayList f8330m3;
    public boolean f8331n2;
    public boolean f8332n3;
    public final g4 f8333o2;
    public TLRPC.PaymentForm f8334o3;
    public final ki.j[] f8335p2;
    public final eq[] f8336p3;
    public final View f8337q2;
    public final l1 f8338q3;
    public final LinearLayout f8339r2;
    public int f8340r3;
    public final fp f8341s2;
    public Boolean f8342s3;
    public final TextView f8343t2;
    public boolean f8344t3;
    public final LinearLayout f8345u2;
    public hi.l3 f8346u3;
    public final fp f8347v2;
    public View f8348v3;
    public boolean f8349w2;
    public final g4 f8350x2;
    public final TextView f8351y2;
    public final g4 f8352z2;

    public c6(Context context, int i7, long j3, org.telegram.ui.ActionBar.e6 e6Var, View view) {
        super(context, null, false, false, e6Var);
        this.f8331n2 = false;
        this.O2 = new int[2];
        this.Q2 = -1;
        this.R2 = "";
        this.X2 = new b5(0, 0);
        this.f8308a3 = true;
        this.f8336p3 = new eq[1];
        this.f8338q3 = new l1(this, 11);
        this.f8344t3 = true;
        this.f29679a = i7;
        this.T1 = j3;
        this.f35943v1 = Math.max(0.05f, org.telegram.messenger.g0.L(82.0f) / (org.telegram.messenger.g0.f23609q.y + org.telegram.messenger.g0.f23603m));
        this.f29721x = true;
        this.f29682b = new bi.g2(2, context, this);
        k4 k4Var = new k4(this, context);
        this.U1 = k4Var;
        e4 e4Var = new e4(this, context);
        this.V1 = e4Var;
        e4Var.setAdapter(new f4(0, context, this));
        w2();
        View view2 = new View(context);
        this.X1 = view2;
        int i10 = org.telegram.ui.ActionBar.j6.f28922h5;
        org.telegram.ui.ActionBar.q6.h(i10, view2, e6Var);
        FrameLayout.LayoutParams e10 = c8.ja.e(-1, 50, 80);
        int i11 = this.f29717u0;
        e10.rightMargin = i11;
        e10.leftMargin = i11;
        this.f29682b.addView(view2, e10);
        this.f29682b.addView(e4Var, c8.ja.e(-1, -1, 119));
        Q(i10);
        org.telegram.messenger.g0.E2(this.f35936o1);
        k4Var.addView(this.f35936o1, c8.ja.e(-1, -1, 119));
        g4 g4Var = new g4(this, context, 0);
        this.f8311c2 = g4Var;
        g4Var.setOrientation(1);
        g4Var.setPadding(org.telegram.messenger.g0.L(14.0f) + this.f29717u0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(14.0f) + this.f29717u0, org.telegram.messenger.g0.L(68.0f));
        k4Var.addView(g4Var, c8.ja.e(-1, -1, 55));
        z70 z70Var = new z70(context, e6Var);
        this.d2 = z70Var;
        int i12 = org.telegram.ui.ActionBar.j6.f29088q5;
        org.telegram.ui.ActionBar.q6.U(z70Var, i12, e6Var);
        z70Var.setTextSize(1, 12.0f);
        z70Var.setGravity(17);
        z70Var.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        org.telegram.ui.ActionBar.q6.G(z70Var, org.telegram.ui.ActionBar.j6.Xc, e6Var);
        z70Var.setDisablePaddingsOffsetY(true);
        g4Var.addView(z70Var, c8.ja.t(-2, -2, 1, 4, -2, 4, 16));
        z70Var.setVisibility(8);
        vx0 vx0Var = new vx0(context, e6Var);
        this.f8314e2 = vx0Var;
        g4Var.addView(vx0Var, c8.ja.k(0.0f, 0.0f, 0.0f, 12.0f, -1, -2));
        z70 z70Var2 = new z70(context, e6Var);
        this.f8316f2 = z70Var2;
        org.telegram.ui.ActionBar.q6.U(z70Var2, i12, e6Var);
        z70Var2.setTextSize(1, 12.0f);
        z70Var2.setGravity(17);
        z70Var2.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        int i13 = org.telegram.ui.ActionBar.j6.Fi;
        org.telegram.ui.ActionBar.q6.G(z70Var2, i13, e6Var);
        z70Var2.setDisablePaddingsOffsetY(true);
        z70Var2.setPadding(org.telegram.messenger.g0.L(5.0f), 0, org.telegram.messenger.g0.L(5.0f), 0);
        g4Var.addView(z70Var2, c8.ja.t(-2, -2, 1, 4, 2, 4, 8));
        z70Var2.setVisibility(8);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f8345u2 = linearLayout;
        linearLayout.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f));
        linearLayout.setOrientation(0);
        int i14 = org.telegram.ui.ActionBar.j6.f28941i6;
        org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.j6.a0(org.telegram.ui.ActionBar.j6.w0(i14, e6Var), 21, 21);
        org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i14);
        linearLayout.setBackground(a02);
        org.telegram.ui.ActionBar.q6.j(linearLayout, a02, null, M, e6Var);
        fp fpVar = new fp(24, context, e6Var);
        this.f8347v2 = fpVar;
        int i15 = org.telegram.ui.ActionBar.j6.h7;
        int i16 = org.telegram.ui.ActionBar.j6.f28959j7;
        int i17 = org.telegram.ui.ActionBar.j6.f28979k7;
        fpVar.b(i15, i16, i17);
        fpVar.setDrawUnchecked(true);
        fpVar.a(false, false);
        fpVar.setDrawBackgroundAsArc(10);
        linearLayout.addView(fpVar, c8.ja.t(26, 26, 16, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        int i18 = org.telegram.ui.ActionBar.j6.f28957j5;
        org.telegram.ui.ActionBar.q6.U(textView, i18, e6Var);
        i5.c.w(textView, 1, 14.0f, null, 2131750389);
        linearLayout.addView(textView, c8.ja.t(-2, -2, 16, 9, 0, 0, 0));
        g4Var.addView(linearLayout, c8.ja.t(-2, -2, 1, 0, -4, 0, 4));
        c8.na.b(linearLayout, 0.025f, 1.5f);
        linearLayout.setOnClickListener(new k1(this, 18));
        linearLayout.setVisibility(8);
        g4 g4Var2 = new g4(this, context, 1);
        this.f8333o2 = g4Var2;
        g4Var2.setOrientation(1);
        g4Var2.setPadding(org.telegram.messenger.g0.L(4.0f) + this.f29717u0, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(4.0f) + this.f29717u0, org.telegram.messenger.g0.L(66.0f));
        k4Var.addView(g4Var2, c8.ja.e(-1, -1, 55));
        this.f8335p2 = r8;
        ki.j jVar = new ki.j(context, e6Var, false);
        jVar.a(2131231821, hd.M0(2131749865, null), hd.M0(2131749575, null));
        g4Var2.addView(r8[0], c8.ja.o(-1, -2));
        ki.j jVar2 = new ki.j(context, e6Var, false);
        jVar2.a(2131231817, hd.M0(2131749859, null), hd.M0(2131749573, null));
        g4Var2.addView(r8[1], c8.ja.o(-1, -2));
        ki.j jVar3 = new ki.j(context, e6Var, false);
        ki.j[] jVarArr = {jVar, jVar2, jVar3};
        jVar3.a(2131231924, hd.M0(2131749570, null), hd.M0(2131749571, null));
        g4Var2.addView(jVarArr[2], c8.ja.o(-1, -2));
        View view3 = new View(context);
        this.f8337q2 = view3;
        int i19 = org.telegram.ui.ActionBar.j6.f28850d7;
        org.telegram.ui.ActionBar.q6.h(i19, view3, e6Var);
        g4Var2.addView(view3, c8.ja.n(1.0f / org.telegram.messenger.g0.f23608p, -2, 7, 17, -4, 17, 6));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f8339r2 = linearLayout2;
        linearLayout2.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f));
        linearLayout2.setOrientation(0);
        org.telegram.ui.Cells.y a03 = org.telegram.ui.ActionBar.j6.a0(org.telegram.ui.ActionBar.j6.w0(i14, e6Var), 6, 6);
        org.telegram.ui.ActionBar.m6 M2 = org.telegram.ui.ActionBar.q6.M(i14);
        linearLayout2.setBackground(a03);
        org.telegram.ui.ActionBar.q6.j(linearLayout2, a03, null, M2, e6Var);
        fp fpVar2 = new fp(24, context, e6Var);
        this.f8341s2 = fpVar2;
        fpVar2.b(i15, i16, i17);
        fpVar2.setDrawUnchecked(true);
        fpVar2.a(false, false);
        fpVar2.setDrawBackgroundAsArc(10);
        linearLayout2.addView(fpVar2, c8.ja.t(26, 26, 16, 0, 0, 0, 0));
        TextView textView2 = new TextView(context);
        this.f8343t2 = textView2;
        org.telegram.ui.ActionBar.q6.U(textView2, i18, e6Var);
        i5.c.w(textView2, 1, 14.0f, null, 2131750397);
        linearLayout2.addView(textView2, c8.ja.t(-2, -2, 16, 9, 0, 0, 0));
        g4Var2.addView(linearLayout2, c8.ja.t(-2, -2, 1, 0, 0, 0, 4));
        c8.na.b(linearLayout2, 0.025f, 1.5f);
        g4 g4Var3 = new g4(this, context, 2);
        this.f8350x2 = g4Var3;
        g4Var3.setOrientation(1);
        g4Var3.setPadding(org.telegram.messenger.g0.L(4.0f) + this.f29717u0, org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(4.0f) + this.f29717u0, org.telegram.messenger.g0.L(66.0f));
        k4Var.addView(g4Var3, c8.ja.e(-1, -1, 55));
        TextView textView3 = new TextView(context);
        this.f8351y2 = textView3;
        org.telegram.ui.ActionBar.q6.U(textView3, i18, e6Var);
        textView3.setTextSize(1, 20.0f);
        textView3.setGravity(17);
        textView3.setTypeface(org.telegram.messenger.g0.o());
        g4Var3.addView(textView3, c8.ja.t(-1, -2, 7, 20, 0, 20, 0));
        TextView textView4 = new TextView(context);
        org.telegram.ui.ActionBar.q6.U(textView4, i18, e6Var);
        textView4.setTextSize(1, 14.0f);
        org.telegram.messenger.k5.l(textView4, 17, null, 2131749834);
        g4Var3.addView(textView4, c8.ja.t(-1, -2, 7, 20, 6, 20, 24));
        ki.j jVar4 = new ki.j(context, e6Var, false);
        jVar4.a(2131231821, hd.M0(2131749840, null), hd.M0(2131749841, null));
        g4Var3.addView(r6[0], c8.ja.o(-1, -2));
        ki.j jVar5 = new ki.j(context, e6Var, false);
        jVar5.a(2131231799, hd.M0(2131749838, null), hd.M0(2131749839, null));
        g4Var3.addView(r6[1], c8.ja.o(-1, -2));
        ki.j jVar6 = new ki.j(context, e6Var, false);
        ki.j[] jVarArr2 = {jVar4, jVar5, jVar6};
        jVar6.a(2131231911, hd.M0(2131749836, null), hd.M0(2131749837, null));
        g4Var3.addView(jVarArr2[2], c8.ja.o(-1, -2));
        g4 g4Var4 = new g4(this, context, 3);
        this.f8352z2 = g4Var4;
        g4Var4.setOrientation(1);
        g4Var4.setPadding(org.telegram.messenger.g0.L(4.0f) + this.f29717u0, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(4.0f) + this.f29717u0, org.telegram.messenger.g0.L(92.0f));
        k4Var.addView(g4Var4, c8.ja.e(-1, -1, 55));
        ki.j jVar7 = new ki.j(context, e6Var, false);
        jVar7.a(2131231821, hd.M0(2131749785, null), hd.M0(2131749786, null));
        g4Var4.addView(r8[0], c8.ja.o(-1, -2));
        ki.j jVar8 = new ki.j(context, e6Var, false);
        jVar8.a(2131231873, hd.M0(2131749783, null), hd.M0(2131749784, null));
        g4Var4.addView(r8[1], c8.ja.o(-1, -2));
        ki.j jVar9 = new ki.j(context, e6Var, false);
        ki.j[] jVarArr3 = {jVar7, jVar8, jVar9};
        jVar9.a(2131231795, hd.M0(2131749781, null), hd.M0(2131749782, null));
        g4Var4.addView(jVarArr3[2], c8.ja.o(-1, -2));
        g4Var.setAlpha(1.0f);
        g4Var2.setAlpha(0.0f);
        g4Var3.setAlpha(0.0f);
        g4Var4.setAlpha(0.0f);
        w5 w5Var = new w5(context, e6Var, new l1(this, 12), new k1(this, 19), new k1(this, 20), new k1(this, 21), new k1(this, 22), new k1(this, 23), new k1(this, 24), new k1(this, 25));
        this.f8309b2 = w5Var;
        w5Var.N.f9773c.setOnClickListener(new k1(this, 16));
        int i20 = this.f29717u0;
        w5Var.setPadding(i20, 0, i20, 0);
        k4Var.addView(w5Var, c8.ja.e(-1, -2, 55));
        jg.b0 b0Var = this.n1;
        this.K1 = true;
        b0Var.k1(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f8320h2 = frameLayout;
        org.telegram.ui.ActionBar.q6.h(i10, frameLayout, e6Var);
        View view4 = new View(context);
        this.f8325k2 = view4;
        org.telegram.ui.ActionBar.q6.h(i19, view4, e6Var);
        view4.setAlpha(0.0f);
        frameLayout.addView(view4, c8.ja.a(-1.0f, 1.0f / org.telegram.messenger.g0.f23608p, 55));
        hi.d g10 = i20.g(24, context, e6Var, true);
        this.f8318g2 = g10;
        g10.i(hd.M0(2131747831, null), false, true);
        g10.g(null, false);
        FrameLayout.LayoutParams d = c8.ja.d(-1, 48.0f, 119, 0.0f, 12.0f, 0.0f, 12.0f);
        d.leftMargin = org.telegram.messenger.g0.L(14.0f) + this.f29717u0;
        d.rightMargin = org.telegram.messenger.g0.L(14.0f) + this.f29717u0;
        frameLayout.addView(g10, d);
        k4Var.addView(frameLayout, c8.ja.e(-1, 72, 87));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f8324j2 = frameLayout2;
        org.telegram.ui.ActionBar.q6.h(i10, frameLayout2, e6Var);
        z70 z70Var3 = new z70(context, null);
        this.f8322i2 = z70Var3;
        z70Var3.setTextSize(1, 12.0f);
        org.telegram.ui.ActionBar.q6.U(z70Var3, i13, e6Var);
        org.telegram.ui.ActionBar.q6.G(z70Var3, i13, e6Var);
        z70Var3.setGravity(17);
        frameLayout2.addView(z70Var3, c8.ja.d(-1, -2.0f, 17, 16.0f, 8.0f, 16.0f, 14.0f));
        k4Var.addView(frameLayout2, c8.ja.e(-1, -2, 87));
        frameLayout2.setVisibility(8);
        this.f35936o1.setOnScrollListener(new bi.z4(this, 8));
        linearLayout2.setOnClickListener(new k1(this, 17));
        nz nzVar = new nz(context);
        this.W1 = nzVar;
        k4Var.addView(nzVar, c8.ja.c(-1.0f, -1));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f8327l2 = frameLayout3;
        frameLayout3.setPadding(org.telegram.messenger.g0.L(6.0f) + this.f29717u0, 0, org.telegram.messenger.g0.L(6.0f) + this.f29717u0, 0);
        k4Var.addView(frameLayout3, c8.ja.d(-1, 200.0f, 87, 0.0f, 0.0f, 0.0f, 60.0f));
        org.telegram.messenger.g0.E2(this.f35937p1);
        k4Var.addView(this.f35937p1, c8.ja.d(-1, -2.0f, 0, 6.0f, 0.0f, 6.0f, 0.0f));
        h4 h4Var = new h4(context);
        this.f8307a2 = h4Var;
        k4Var.addView(h4Var, c8.ja.e(-1, -2, 55));
        ArrayList arrayList = new ArrayList();
        if (view != null) {
            arrayList.add(view);
        }
        org.telegram.messenger.g0.m2(new ai.f0(h4Var, 10), 12.0f, 12, arrayList);
    }

    public static String A1(TL_stars.StarGift starGift) {
        if (starGift instanceof TL_stars.TL_starGiftUnique) {
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(tL_starGiftUnique.title);
            sb2.append(" #");
            return i5.c.l(tL_starGiftUnique.num, ',', sb2);
        } else if ((starGift instanceof TL_stars.TL_starGift) && !TextUtils.isEmpty(starGift.title)) {
            return starGift.title;
        } else {
            return hd.M0(2131750192, null);
        }
    }

    public static String G1(TL_stars.StarGiftAttributeRarity starGiftAttributeRarity, Integer[] numArr) {
        if (starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarityUncommon) {
            numArr[0] = -12539616;
            return hd.M0(2131749619, null);
        } else if (starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarityRare) {
            numArr[0] = -15619394;
            return hd.M0(2131749620, null);
        } else if (starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarityEpic) {
            numArr[0] = -6988581;
            return hd.M0(2131749622, null);
        } else if (starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarityLegendary) {
            numArr[0] = -4229632;
            return hd.M0(2131749621, null);
        } else if (starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarity) {
            int i7 = ((TL_stars.TL_starGiftAttributeRarity) starGiftAttributeRarity).permille;
            if (i7 <= 0) {
                return "<0.1%";
            }
            return ki.k.J0(i7);
        } else {
            return "";
        }
    }

    public static boolean K1(int i7, long j3) {
        if (j3 >= 0) {
            if (m10.i(i7).e() == j3) {
                return true;
            }
            return false;
        }
        return org.telegram.messenger.t3.w(5, np.s1(i7).M0(Long.valueOf(-j3)));
    }

    public static boolean L1(int i7, long j3) {
        if (j3 >= 0) {
            if (m10.i(i7).e() != j3) {
                return false;
            }
            return true;
        }
        TLRPC.Chat M0 = np.s1(i7).M0(Long.valueOf(-j3));
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
            TLRPC.User a22 = np.s1(i7).a2(Long.valueOf(o4));
            if (a22 != null) {
                TLRPC.EmojiStatus emojiStatus = a22.emoji_status;
                if (!(emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) || ((TLRPC.TL_emojiStatusCollectible) emojiStatus).collectible_id != tL_starGiftUnique.f28280id) {
                    return false;
                }
                return true;
            }
        } else {
            TLRPC.Chat M0 = np.s1(i7).M0(Long.valueOf(-o4));
            if (M0 != null) {
                TLRPC.EmojiStatus emojiStatus2 = M0.emoji_status;
                if ((emojiStatus2 instanceof TLRPC.TL_emojiStatusCollectible) && ((TLRPC.TL_emojiStatusCollectible) emojiStatus2).collectible_id == tL_starGiftUnique.f28280id) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void d1(c6 c6Var) {
        boolean z10;
        TLRPC.Document document;
        boolean z11;
        k8 F;
        TLRPC.Message message;
        hi.d dVar = c6Var.f8318g2;
        if (!dVar.R) {
            TL_stars.InputSavedStarGift B1 = c6Var.B1();
            gj gjVar = c6Var.D2;
            if (gjVar != null && (message = gjVar.f23817k) != null) {
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
                TL_stars.SavedStarGift savedStarGift = c6Var.B2;
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
            if (c6Var.B2 != null && (F = v8.y(c6Var.f29679a, false).F(c6Var.T1, false)) != null) {
                F.m(c6Var.B2, savestargift.unsave);
                z11 = true;
            } else {
                z11 = false;
            }
            ConnectionsManager.getInstance(c6Var.f29679a).sendRequest(savestargift, new u3(c6Var, z11, document2, z12, savestargift));
        }
    }

    public static void d2(org.telegram.ui.ActionBar.e2 e2Var) {
        org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
        if (T == 0) {
            return;
        }
        ?? obj = new Object();
        obj.f28476a = true;
        T.showAsSheet(e2Var, obj);
    }

    public static void e1(final c6 c6Var) {
        int i7;
        long j3;
        long j10;
        long j11;
        String M0;
        final long e10 = m10.i(c6Var.f29679a).e();
        final TL_stars.InputSavedStarGift B1 = c6Var.B1();
        if (B1 != null) {
            gj gjVar = c6Var.D2;
            if (gjVar != null) {
                i7 = gjVar.f23817k.date;
                boolean P3 = gjVar.P3();
                TLRPC.Message message = c6Var.D2.f23817k;
                if (message != null) {
                    TLRPC.MessageAction messageAction = message.action;
                    if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                        TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                        TLRPC.Peer peer = tL_messageActionStarGift.peer;
                        if (peer != null) {
                            j11 = org.telegram.messenger.m5.o(peer);
                        } else if (P3) {
                            j11 = gj.B0(message);
                        } else {
                            j11 = e10;
                        }
                        TLRPC.Peer peer2 = tL_messageActionStarGift.from_id;
                        if (peer2 != null) {
                            j3 = org.telegram.messenger.m5.o(peer2);
                        } else if (P3) {
                            j3 = e10;
                        } else {
                            j3 = gj.B0(c6Var.D2.f23817k);
                        }
                        j10 = tL_messageActionStarGift.convert_stars;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else {
                TL_stars.SavedStarGift savedStarGift = c6Var.B2;
                if (savedStarGift != null) {
                    i7 = savedStarGift.date;
                    if ((savedStarGift.flags & 2) != 0 && !savedStarGift.name_hidden) {
                        j3 = org.telegram.messenger.m5.o(savedStarGift.from_id);
                    } else {
                        j3 = 2666000;
                    }
                    j10 = c6Var.B2.convert_stars;
                    j11 = c6Var.T1;
                } else {
                    return;
                }
            }
            int max = Math.max(1, (np.s1(c6Var.f29679a).F6 - (ConnectionsManager.getInstance(c6Var.f29679a).getCurrentTime() - i7)) / 86400);
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, c6Var.getContext(), c6Var.J0);
            String M02 = hd.M0(2131750226, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
            t1Var.S = M02;
            if (!q10.A(j3) && j3 != 2666000) {
                M0 = org.telegram.messenger.m5.t(j3);
            } else {
                M0 = hd.M0(2131744949, null);
            }
            t1Var.U = org.telegram.messenger.g0.X2(hd.G(max, "Gift2ConvertText2", M0, hd.H(',', "Gift2ConvertStars", (int) j10)));
            final long j12 = j10;
            final long j13 = j11;
            alertDialog$Builder.k(hd.M0(2131750233, null), new org.telegram.ui.ActionBar.q1() {
                @Override
                public final void h(org.telegram.ui.ActionBar.t1 t1Var2, int i10) {
                    c6 c6Var2 = c6.this;
                    TL_stars.InputSavedStarGift inputSavedStarGift = B1;
                    long j14 = j13;
                    long j15 = e10;
                    long j16 = j12;
                    org.telegram.ui.ActionBar.t1 t1Var3 = new org.telegram.ui.ActionBar.t1(3, org.telegram.messenger.t0.f26600b, null);
                    t1Var3.r(500L);
                    TL_stars.convertStarGift convertstargift = new TL_stars.convertStarGift();
                    convertstargift.stargift = inputSavedStarGift;
                    ConnectionsManager.getInstance(c6Var2.f29679a).sendRequest(convertstargift, new c2(c6Var2, t1Var3, j14, j15, j16));
                }
            });
            i5.c.x(null, 2131752589, alertDialog$Builder, null);
        }
    }

    public static void f1(c6 c6Var, org.telegram.ui.ActionBar.t1 t1Var, TL_stars.SavedStarGift savedStarGift) {
        if (savedStarGift != null) {
            t1Var.dismiss();
            c6Var.K2 = true;
            c6Var.k2(savedStarGift, null);
            super.show();
            return;
        }
        t1Var.dismiss();
        org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
        if (T != null) {
            org.telegram.ui.Components.xb Q = org.telegram.ui.Components.cc.a0(T).Q(2131624012, 36, hd.M0(2131748552, null));
            Q.f41653t = true;
            Q.j();
        }
    }

    public static void g1(c6 c6Var, TL_stars.TL_payments_uniqueStarGift tL_payments_uniqueStarGift) {
        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) tL_payments_uniqueStarGift.gift;
        c6Var.F2 = tL_starGiftUnique;
        c6Var.l2(tL_starGiftUnique, false, null, null);
        super.show();
    }

    public static SpannableStringBuilder g2(String str) {
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
            spannableStringBuilder.setSpan(new b4(0), indexOf, i7 + indexOf, 0);
        }
        return spannableStringBuilder;
    }

    public static void h1(c6 c6Var, org.telegram.ui.ActionBar.t1 t1Var, gj gjVar) {
        t1Var.dismiss();
        c6Var.I2 = true;
        c6Var.j2(gjVar, null);
        super.show();
    }

    public static SpannableStringBuilder h2(String str) {
        if (str == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        SpannableString spannableString = new SpannableString("👌");
        spannableString.setSpan(new eq(2131231180, 0), 0, spannableString.length(), 33);
        SpannableString spannableString2 = new SpannableString("👍");
        spannableString2.setSpan(new eq(2131231164, 0), 0, spannableString2.length(), 33);
        org.telegram.messenger.g0.M2(spannableStringBuilder, spannableString, "👌");
        org.telegram.messenger.g0.M2(spannableStringBuilder, spannableString2, "👍");
        return spannableStringBuilder;
    }

    public static void i1(c6 c6Var, boolean z10) {
        int i7;
        Object obj;
        bi.b2 b2Var;
        bi.b2 b2Var2;
        bi.b2 b2Var3;
        int D1 = c6Var.D1();
        if (D1 >= 0) {
            if (z10) {
                i7 = 1;
            } else {
                i7 = -1;
            }
            int i10 = i7 + D1;
            int i11 = c6Var.Q2;
            if (i11 >= 0 && (!z10 ? i11 < D1 : i11 > D1)) {
                i10 = i11;
            }
            n8 n8Var = c6Var.C2;
            if (n8Var != null && i10 >= 0 && i10 < n8Var.e()) {
                obj = c6Var.C2.get(i10);
            } else {
                obj = null;
            }
            if (obj != null) {
                if (z10) {
                    b2Var = c6Var.Z1;
                } else {
                    b2Var = c6Var.Y1;
                }
                if (b2Var != null) {
                    if (obj instanceof TL_stars.SavedStarGift) {
                        if (z10) {
                            b2Var3 = c6Var.Z1;
                        } else {
                            b2Var3 = c6Var.Y1;
                        }
                        if (u1(b2Var3.B2, (TL_stars.SavedStarGift) obj)) {
                            return;
                        }
                    }
                    if (obj instanceof TL_stars.TL_starGiftUnique) {
                        if (z10) {
                            b2Var2 = c6Var.Z1;
                        } else {
                            b2Var2 = c6Var.Y1;
                        }
                        if (v1(b2Var2.F2, (TL_stars.TL_starGiftUnique) obj)) {
                            return;
                        }
                    }
                }
                bi.b2 b2Var4 = new bi.b2(c6Var, c6Var.getContext(), c6Var.f29679a, c6Var.T1, c6Var.J0, c6Var.U1.getRootView());
                if (obj instanceof TL_stars.SavedStarGift) {
                    b2Var4.k2((TL_stars.SavedStarGift) obj, c6Var.C2);
                } else if (obj instanceof TL_stars.TL_starGiftUnique) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj;
                    b2Var4.i2(tL_starGiftUnique.slug, tL_starGiftUnique, c6Var.C2);
                }
                org.telegram.messenger.g0.E2(b2Var4.f29682b);
                if (z10) {
                    c6Var.Z1 = b2Var4;
                } else {
                    c6Var.Y1 = b2Var4;
                }
            }
        }
    }

    public static void k1(vx0 vx0Var, TL_stars.StarGiftAttribute starGiftAttribute) {
        String M0;
        if (starGiftAttribute instanceof TL_stars.starGiftAttributeModel) {
            M0 = hd.M0(2131750387, null);
        } else if (starGiftAttribute instanceof TL_stars.starGiftAttributePattern) {
            M0 = hd.M0(2131750380, null);
        } else if (starGiftAttribute instanceof TL_stars.starGiftAttributeBackdrop) {
            M0 = hd.M0(2131750388, null);
        } else {
            return;
        }
        String str = M0;
        Integer[] numArr = new Integer[1];
        vx0Var.e(str, starGiftAttribute.name, G1(starGiftAttribute.rarity, numArr), null, numArr[0]);
    }

    public static boolean u1(TL_stars.SavedStarGift savedStarGift, TL_stars.SavedStarGift savedStarGift2) {
        if (savedStarGift != savedStarGift2) {
            if (savedStarGift != null) {
                TL_stars.StarGift starGift = savedStarGift.gift;
                TL_stars.StarGift starGift2 = savedStarGift2.gift;
                if (starGift != starGift2) {
                    if ((starGift instanceof TL_stars.TL_starGiftUnique) && (starGift2 instanceof TL_stars.TL_starGiftUnique)) {
                        if (starGift.f28280id == starGift2.f28280id) {
                            return true;
                        }
                        return false;
                    } else if ((starGift instanceof TL_stars.TL_starGift) && (starGift2 instanceof TL_stars.TL_starGift) && starGift.f28280id == starGift2.f28280id && savedStarGift.date == savedStarGift2.date) {
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
                if (tL_starGiftUnique.f28280id == tL_starGiftUnique2.f28280id || TextUtils.equals(tL_starGiftUnique.slug, tL_starGiftUnique2.slug)) {
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
        long j3 = this.T1;
        if (j3 < 0) {
            TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat = new TL_stars.TL_inputSavedStarGiftChat();
            tL_inputSavedStarGiftChat.peer = np.s1(this.f29679a).j1(j3);
            gj gjVar = this.D2;
            if (gjVar != null && (message3 = gjVar.f23817k) != null) {
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
            TL_stars.SavedStarGift savedStarGift = this.B2;
            if (savedStarGift != null) {
                if ((savedStarGift.flags & 2048) == 0) {
                    return null;
                }
                tL_inputSavedStarGiftChat.saved_id = savedStarGift.saved_id;
                return tL_inputSavedStarGiftChat;
            } else if (this.F2 != null && !TextUtils.isEmpty(this.E2)) {
                TL_stars.TL_inputSavedStarGiftSlug tL_inputSavedStarGiftSlug = new TL_stars.TL_inputSavedStarGiftSlug();
                tL_inputSavedStarGiftSlug.slug = this.E2;
                return tL_inputSavedStarGiftSlug;
            } else {
                return tL_inputSavedStarGiftChat;
            }
        }
        gj gjVar2 = this.D2;
        if (gjVar2 != null && (message2 = gjVar2.f23817k) != null) {
            TLRPC.MessageAction messageAction2 = message2.action;
            if ((messageAction2 instanceof TLRPC.TL_messageActionStarGift) && (messageAction2.flags & 4096) != 0) {
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift2 = (TLRPC.TL_messageActionStarGift) messageAction2;
                TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat2 = new TL_stars.TL_inputSavedStarGiftChat();
                np s12 = np.s1(this.f29679a);
                TLRPC.Peer peer = tL_messageActionStarGift2.peer;
                if (peer != null) {
                    B02 = org.telegram.messenger.m5.o(peer);
                } else {
                    B02 = gj.B0(this.D2.f23817k);
                }
                tL_inputSavedStarGiftChat2.peer = s12.j1(B02);
                tL_inputSavedStarGiftChat2.saved_id = tL_messageActionStarGift2.saved_id;
                return tL_inputSavedStarGiftChat2;
            }
        }
        if (gjVar2 != null && (message = gjVar2.f23817k) != null) {
            TLRPC.MessageAction messageAction3 = message.action;
            if ((messageAction3 instanceof TLRPC.TL_messageActionStarGiftUnique) && (messageAction3.flags & 128) != 0) {
                TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique2 = (TLRPC.TL_messageActionStarGiftUnique) messageAction3;
                TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat3 = new TL_stars.TL_inputSavedStarGiftChat();
                np s13 = np.s1(this.f29679a);
                TLRPC.Peer peer2 = tL_messageActionStarGiftUnique2.peer;
                if (peer2 != null) {
                    B0 = org.telegram.messenger.m5.o(peer2);
                } else {
                    B0 = gj.B0(this.D2.f23817k);
                }
                tL_inputSavedStarGiftChat3.peer = s13.j1(B0);
                tL_inputSavedStarGiftChat3.saved_id = tL_messageActionStarGiftUnique2.saved_id;
                return tL_inputSavedStarGiftChat3;
            }
        }
        TL_stars.TL_inputSavedStarGiftUser tL_inputSavedStarGiftUser = new TL_stars.TL_inputSavedStarGiftUser();
        gj gjVar3 = this.D2;
        if (gjVar3 != null) {
            TLRPC.Message message4 = gjVar3.f23817k;
            if (message4 != null) {
                TLRPC.MessageAction messageAction4 = message4.action;
                if ((messageAction4 instanceof TLRPC.TL_messageActionStarGift) && (messageAction4.flags & 32768) != 0) {
                    tL_inputSavedStarGiftUser.msg_id = ((TLRPC.TL_messageActionStarGift) messageAction4).gift_msg_id;
                    return tL_inputSavedStarGiftUser;
                }
            }
            tL_inputSavedStarGiftUser.msg_id = gjVar3.e1();
            return tL_inputSavedStarGiftUser;
        }
        TL_stars.SavedStarGift savedStarGift2 = this.B2;
        if (savedStarGift2 != null) {
            tL_inputSavedStarGiftUser.msg_id = savedStarGift2.msg_id;
            return tL_inputSavedStarGiftUser;
        } else if (this.F2 != null && !TextUtils.isEmpty(this.E2)) {
            TL_stars.TL_inputSavedStarGiftSlug tL_inputSavedStarGiftSlug2 = new TL_stars.TL_inputSavedStarGiftSlug();
            tL_inputSavedStarGiftSlug2.slug = this.E2;
            return tL_inputSavedStarGiftSlug2;
        } else {
            return tL_inputSavedStarGiftUser;
        }
    }

    public final String C1() {
        TL_stars.StarGift y12 = y1();
        if ((y12 instanceof TL_stars.TL_starGiftUnique) && y12.slug != null) {
            return np.s1(this.f29679a).V2 + "/nft/" + y12.slug;
        }
        return null;
    }

    public final int D1() {
        int indexOf;
        n8 n8Var = this.C2;
        if (n8Var != null) {
            TL_stars.SavedStarGift savedStarGift = this.B2;
            if (savedStarGift != null) {
                indexOf = n8Var.indexOf(savedStarGift);
            } else {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = this.F2;
                if (tL_starGiftUnique != null) {
                    indexOf = n8Var.indexOf(tL_starGiftUnique);
                } else {
                    return -1;
                }
            }
            if (indexOf >= 0) {
                return indexOf;
            }
            TL_stars.StarGift y12 = y1();
            for (int i7 = 0; i7 < this.C2.e(); i7++) {
                Object obj = this.C2.get(i7);
                if (obj instanceof TL_stars.SavedStarGift) {
                    TL_stars.SavedStarGift savedStarGift2 = this.B2;
                    if (savedStarGift2 != null) {
                        if (u1(savedStarGift2, (TL_stars.SavedStarGift) obj)) {
                            return i7;
                        }
                    }
                    if (y12 != null) {
                        TL_stars.StarGift starGift = ((TL_stars.SavedStarGift) obj).gift;
                        if (y12 != starGift) {
                            if ((y12 instanceof TL_stars.TL_starGiftUnique) && (starGift instanceof TL_stars.TL_starGiftUnique) && y12.f28280id == starGift.f28280id) {
                            }
                        }
                        return i7;
                    }
                    continue;
                } else {
                    if ((obj instanceof TL_stars.TL_starGiftUnique) && v1(this.F2, (TL_stars.TL_starGiftUnique) obj)) {
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
        org.telegram.messenger.g0.t3(this, 0, false, null);
    }

    public final TL_stars.SavedStarGift E1(boolean z10) {
        int i7;
        Object obj;
        int D1 = D1();
        if (D1 < 0) {
            return null;
        }
        if (z10) {
            i7 = 1;
        } else {
            i7 = -1;
        }
        int i10 = i7 + D1;
        int i11 = this.Q2;
        if (i11 >= 0 && (!z10 ? i11 < D1 : i11 > D1)) {
            i10 = i11;
        }
        n8 n8Var = this.C2;
        if (n8Var != null && i10 >= 0 && i10 < n8Var.e()) {
            obj = this.C2.get(i10);
        } else {
            obj = null;
        }
        if (!(obj instanceof TL_stars.SavedStarGift)) {
            return null;
        }
        return (TL_stars.SavedStarGift) obj;
    }

    public final TL_stars.TL_starGiftUnique F1(boolean z10) {
        int i7;
        Object obj;
        int D1 = D1();
        if (D1 < 0) {
            return null;
        }
        if (z10) {
            i7 = 1;
        } else {
            i7 = -1;
        }
        int i10 = i7 + D1;
        int i11 = this.Q2;
        if (i11 >= 0 && (!z10 ? i11 < D1 : i11 > D1)) {
            i10 = i11;
        }
        n8 n8Var = this.C2;
        if (n8Var != null && i10 >= 0 && i10 < n8Var.e()) {
            obj = this.C2.get(i10);
        } else {
            obj = null;
        }
        if (!(obj instanceof TL_stars.TL_starGiftUnique)) {
            return null;
        }
        return (TL_stars.TL_starGiftUnique) obj;
    }

    @Override
    public final boolean H() {
        if (this.X2.c(4)) {
            boolean z10 = this.f8309b2.N.f9782i0;
        }
        return false;
    }

    public final TL_stars.TL_starGiftUnique H1() {
        TL_stars.StarGift y12 = y1();
        if (y12 instanceof TL_stars.TL_starGiftUnique) {
            return (TL_stars.TL_starGiftUnique) y12;
        }
        return null;
    }

    @Override
    public final boolean I() {
        if (this.X2.c(4) && this.f8309b2.N.f9782i0) {
            return false;
        }
        return this.f29688d0;
    }

    public final boolean I1(boolean z10) {
        if (E1(z10) == null && F1(z10) == null) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean J(MotionEvent motionEvent) {
        if (this.X2.c(4)) {
            boolean z10 = this.f8309b2.N.f9782i0;
        }
        return false;
    }

    public final void J1(byte[] bArr, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10, t2 t2Var) {
        TL_stars.getStarGiftWithdrawalUrl getstargiftwithdrawalurl;
        TL_stars.InputSavedStarGift B1 = B1();
        if (B1 == null) {
            if (t2Var != null) {
                t2Var.a(Boolean.FALSE);
                return;
            }
            return;
        }
        if (z10) {
            TL_stars.withdrawStarGift withdrawstargift = new TL_stars.withdrawStarGift();
            withdrawstargift.keep_on_profile = this.f8344t3;
            withdrawstargift.stargift = B1;
            withdrawstargift.tmp_password = bArr;
            getstargiftwithdrawalurl = withdrawstargift;
        } else {
            TL_stars.getStarGiftWithdrawalUrl getstargiftwithdrawalurl2 = new TL_stars.getStarGiftWithdrawalUrl();
            getstargiftwithdrawalurl2.stargift = B1;
            getstargiftwithdrawalurl2.tmp_password = bArr;
            getstargiftwithdrawalurl = getstargiftwithdrawalurl2;
        }
        ConnectionsManager.getInstance(this.f29679a).sendRequest(getstargiftwithdrawalurl, new f3(this, t2Var, twoStepVerificationActivity, z10, 0));
    }

    @Override
    public final tj0 L0(uj0 uj0Var) {
        i4 i4Var = new i4(this, 0);
        this.P2 = i4Var;
        return i4Var;
    }

    @Override
    public final int N0() {
        return org.telegram.messenger.g0.L(12.0f);
    }

    public final void N1() {
        throw new UnsupportedOperationException("Method not decompiled: di.c6.N1():void");
    }

    @Override
    public final CharSequence O0() {
        return this.R2;
    }

    public final void O1() {
        x3 x3Var = this.V2;
        if (x3Var != null && !x3Var.J) {
            x3Var.dismiss();
        }
        String C1 = C1();
        x3 x3Var2 = new x3(this, getContext(), C1, C1, this.J0);
        this.V2 = x3Var2;
        x3Var2.f38355o2 = new d6.i(this, 13);
        x3Var2.show();
    }

    public final void P1() {
        throw new UnsupportedOperationException("Method not decompiled: di.c6.P1():void");
    }

    public final void Q1(TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10) {
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
            org.telegram.ui.Components.cc.b0("NULL_ERROR");
        } else if (!"PASSWORD_MISSING".equals(tL_error.text) && !tL_error.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error.text.startsWith("SESSION_TOO_FRESH_")) {
            if ("SRP_ID_INVALID".equals(tL_error.text)) {
                ConnectionsManager.getInstance(this.f29679a).sendRequest(new TL_account.getPassword(), new j3(this, twoStepVerificationActivity, z10, 1), 8);
                return;
            }
            if (twoStepVerificationActivity != null) {
                twoStepVerificationActivity.t0();
                twoStepVerificationActivity.finishFragment();
            }
            org.telegram.ui.Components.cc.d0(tL_error);
        } else {
            if (twoStepVerificationActivity != null) {
                twoStepVerificationActivity.t0();
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
            String M0 = hd.M0(2131749900, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
            t1Var.S = M0;
            LinearLayout linearLayout = new LinearLayout(getContext());
            linearLayout.setPadding(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(24.0f), 0);
            linearLayout.setOrientation(1);
            alertDialog$Builder.o(linearLayout);
            TextView textView = new TextView(getContext());
            int i16 = org.telegram.ui.ActionBar.j6.f28957j5;
            org.telegram.ui.ActionBar.q6.U(textView, i16, null);
            textView.setTextSize(1, 16.0f);
            if (hd.f24101a0) {
                i7 = 5;
            } else {
                i7 = 3;
            }
            textView.setGravity(i7 | 48);
            textView.setText(org.telegram.messenger.g0.X2(hd.M0(2131749904, null)));
            linearLayout.addView(textView, c8.ja.o(-1, -2));
            LinearLayout linearLayout2 = new LinearLayout(getContext());
            linearLayout2.setOrientation(0);
            linearLayout.addView(linearLayout2, c8.ja.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
            ImageView imageView = new ImageView(getContext());
            imageView.setImageResource(2131231623);
            if (hd.f24101a0) {
                i10 = org.telegram.messenger.g0.L(11.0f);
            } else {
                i10 = 0;
            }
            int L3 = org.telegram.messenger.g0.L(9.0f);
            if (hd.f24101a0) {
                L = 0;
            } else {
                L = org.telegram.messenger.g0.L(11.0f);
            }
            imageView.setPadding(i10, L3, L, 0);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            org.telegram.ui.ActionBar.q6.s(imageView, i16, null, mode);
            TextView textView2 = new TextView(getContext());
            org.telegram.ui.ActionBar.q6.U(textView2, i16, null);
            textView2.setTextSize(1, 16.0f);
            if (hd.f24101a0) {
                i11 = 5;
            } else {
                i11 = 3;
            }
            textView2.setGravity(i11 | 48);
            textView2.setText(org.telegram.messenger.g0.X2(hd.M0(2131749903, null)));
            if (hd.f24101a0) {
                linearLayout2.addView(textView2, c8.ja.o(-1, -2));
                linearLayout2.addView(imageView, c8.ja.r(-2, -2, 5));
            } else {
                linearLayout2.addView(imageView, c8.ja.o(-2, -2));
                linearLayout2.addView(textView2, c8.ja.o(-1, -2));
            }
            LinearLayout linearLayout3 = new LinearLayout(getContext());
            linearLayout3.setOrientation(0);
            linearLayout.addView(linearLayout3, c8.ja.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
            ImageView imageView2 = new ImageView(getContext());
            imageView2.setImageResource(2131231623);
            if (hd.f24101a0) {
                i12 = org.telegram.messenger.g0.L(11.0f);
            } else {
                i12 = 0;
            }
            int L4 = org.telegram.messenger.g0.L(9.0f);
            if (hd.f24101a0) {
                L2 = 0;
            } else {
                L2 = org.telegram.messenger.g0.L(11.0f);
            }
            imageView2.setPadding(i12, L4, L2, 0);
            org.telegram.ui.ActionBar.q6.s(imageView2, i16, null, mode);
            TextView textView3 = new TextView(getContext());
            org.telegram.ui.ActionBar.q6.U(textView3, i16, null);
            textView3.setTextSize(1, 16.0f);
            if (hd.f24101a0) {
                i13 = 5;
            } else {
                i13 = 3;
            }
            textView3.setGravity(i13 | 48);
            textView3.setText(org.telegram.messenger.g0.X2(hd.M0(2131749902, null)));
            if (hd.f24101a0) {
                linearLayout3.addView(textView3, c8.ja.o(-1, -2));
                i14 = 5;
                linearLayout3.addView(imageView2, c8.ja.r(-2, -2, 5));
            } else {
                i14 = 5;
                linearLayout3.addView(imageView2, c8.ja.o(-2, -2));
                linearLayout3.addView(textView3, c8.ja.o(-1, -2));
            }
            if ("PASSWORD_MISSING".equals(tL_error.text)) {
                alertDialog$Builder.k(hd.M0(2131749899, null), new o(this, 2));
                alertDialog$Builder.h(hd.M0(2131752589, null), null);
            } else {
                TextView textView4 = new TextView(getContext());
                org.telegram.ui.ActionBar.q6.U(textView4, i16, null);
                textView4.setTextSize(1, 16.0f);
                if (hd.f24101a0) {
                    i15 = i14;
                } else {
                    i15 = 3;
                }
                org.telegram.messenger.k5.l(textView4, i15 | 48, null, 2131749901);
                linearLayout.addView(textView4, c8.ja.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                alertDialog$Builder.h(hd.M0(2131747831, null), null);
            }
            if (twoStepVerificationActivity != null) {
                twoStepVerificationActivity.showDialog(t1Var);
            } else {
                alertDialog$Builder.p();
            }
        }
    }

    public final void R1() {
        throw new UnsupportedOperationException("Method not decompiled: di.c6.R1():void");
    }

    public final void S1() {
        if (m10.i(this.f29679a).q() && (M1(this.f29679a, H1()) || this.U2)) {
            u2(false);
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
        this.f8351y2.setText(hd.a0(null, null, 2131749833, i5.c.l(H1.num, ',', sb2)));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(hd.M0(2131749835, null));
        if (!m10.i(this.f29679a).q()) {
            spannableStringBuilder.append((CharSequence) " l");
            if (this.T2 == null) {
                this.T2 = new eq(2131232244, 0);
            }
            spannableStringBuilder.setSpan(this.T2, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        hi.d dVar = this.f8318g2;
        dVar.i(spannableStringBuilder, true, true);
        dVar.g(null, true);
        dVar.setOnClickListener(new k1(this, 3));
        this.f8309b2.setWearPreview(np.s1(this.f29679a).e2(o4));
        t2(2, true, null);
    }

    public final void T1(boolean z10) {
        int i7;
        gj gjVar = this.D2;
        int i10 = 0;
        if (gjVar != null) {
            TLRPC.Message message = gjVar.f23817k;
            if (message != null) {
                TLRPC.MessageAction messageAction = message.action;
                if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                    i7 = ((TLRPC.TL_messageActionStarGiftUnique) messageAction).can_craft_at;
                }
            }
            i7 = 0;
        } else {
            TL_stars.SavedStarGift savedStarGift = this.B2;
            if (savedStarGift != null) {
                i7 = savedStarGift.can_craft_at;
            }
            i7 = 0;
        }
        if (i7 > ConnectionsManager.getInstance(this.f29679a).getCurrentTime()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.J0);
            String M0 = hd.M0(2131749777, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
            t1Var.S = M0;
            t1Var.U = hd.a0(null, null, 2131749778, hd.x(i7, true));
            i5.c.C(null, 2131747831, alertDialog$Builder, null);
            return;
        }
        TL_stars.TL_starGiftUnique H1 = H1();
        if (H1 == null) {
            return;
        }
        if (!TextUtils.isEmpty(H1.gift_address)) {
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, getContext(), this.J0);
            String M02 = hd.M0(2131749792, null);
            org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.f28392a;
            t1Var2.S = M02;
            t1Var2.U = hd.M0(2131749793, null);
            i5.c.C(null, 2131747831, alertDialog$Builder2, null);
            return;
        }
        w5 w5Var = this.f8309b2;
        if (z10) {
            w5Var.N.a(this.f29679a, H1.gift_id, H1.getDocument(), H1.title);
            if (o1()) {
                y4 y4Var = w5Var.N;
                TL_stars.TL_starGiftUnique H12 = H1();
                if (H12 == null) {
                    y4Var.getClass();
                } else {
                    while (true) {
                        w4[] w4VarArr = y4Var.f9786n;
                        if (i10 >= w4VarArr.length) {
                            break;
                        }
                        w4 w4Var = w4VarArr[i10];
                        TL_stars.StarGift starGift = w4Var.h;
                        if (starGift == null) {
                            starGift = null;
                        }
                        if (starGift == null) {
                            w4Var.a(H12, true);
                            break;
                        }
                        i10++;
                    }
                    y4Var.d(true);
                }
            }
        }
        y4 y4Var2 = w5Var.N;
        y4 y4Var3 = w5Var.N;
        y4Var2.setOnCraft(new s1(this, 1));
        if (this.S2 == null) {
            bi.y5 y5Var = new bi.y5(this.f29679a, H1.gift_id);
            this.S2 = y5Var;
            y5Var.a();
        }
        y4Var3.setOnAddGift(new q3(this, H1, 1));
        y4Var3.setOnClose(new l1(this, 23));
        t2(4, true, null);
    }

    public final void U1(long j3) {
        if (j3 > 0 && q10.b(np.s1(this.f29679a).b2(j3))) {
            k().Q(2131624012, 36, org.telegram.messenger.g0.X2(hd.a0(null, null, 2131743742, org.telegram.messenger.m5.t(j3)))).k(false);
        } else {
            new bi.s2(getContext(), this.f29679a, j3, null, new n1(this, 0)).show();
        }
    }

    public final void V1(long j3) {
        hi.l3 l3Var = this.f8346u3;
        if (l3Var != null) {
            l3Var.f(true);
            this.f8346u3 = null;
        }
        dismiss();
        org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
        if (T != null && !q10.A(j3)) {
            Bundle bundle = new Bundle();
            if (j3 > 0) {
                bundle.putLong("user_id", j3);
                if (j3 == m10.i(this.f29679a).e()) {
                    bundle.putBoolean("my_profile", true);
                }
            } else {
                bundle.putLong("chat_id", -j3);
            }
            bundle.putBoolean("open_gifts", true);
            T.presentFragment(new ProfileActivity(bundle, null));
        }
    }

    public final void W1(boolean z10, vf.b bVar, Runnable runnable) {
        int i7;
        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
        if (z10) {
            i7 = 3;
        } else {
            i7 = 2;
        }
        ab.j jVar = new ab.j(this, twoStepVerificationActivity, z10, 1);
        twoStepVerificationActivity.f43426a0 = i7;
        twoStepVerificationActivity.f43430c0 = jVar;
        twoStepVerificationActivity.f43428b0 = z1();
        twoStepVerificationActivity.x0(new aa.r(this, runnable, bVar, twoStepVerificationActivity, 18));
    }

    public final void X1() {
        throw new UnsupportedOperationException("Method not decompiled: di.c6.X1():void");
    }

    public final void Y1(long j3, long j10, boolean z10, z10 z10Var) {
        String str;
        TLRPC.User user;
        String a02;
        CharSequence M0;
        TL_stars.TL_starGiftUnique H1 = H1();
        if (H1 == null) {
            return;
        }
        if (j3 >= 0) {
            TLRPC.User a22 = np.s1(this.f29679a).a2(Long.valueOf(j3));
            str = q10.k(a22);
            user = a22;
        } else {
            TLRPC.Chat M02 = np.s1(this.f29679a).M0(Long.valueOf(-j3));
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
        linearLayout.addView(new a5(getContext(), H1, user), c8.ja.t(-1, -2, 48, 0, -4, 0, 0));
        TextView textView = new TextView(getContext());
        org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.f28957j5, this.J0);
        textView.setTextSize(1, 16.0f);
        if (j10 > 0) {
            a02 = hd.K("Gift2TransferPriceText", (int) j10, ',', z1(), org.telegram.messenger.m5.t(j3));
        } else {
            a02 = hd.a0(null, null, 2131749913, z1(), str);
        }
        textView.setText(org.telegram.messenger.g0.X2(a02));
        linearLayout.addView(textView, c8.ja.t(-1, -2, 48, 24, 4, 24, 4));
        vx0 vx0Var = new vx0(getContext(), this.J0);
        k1(vx0Var, v8.l(H1.attributes, TL_stars.starGiftAttributeModel.class));
        k1(vx0Var, v8.l(H1.attributes, TL_stars.starGiftAttributeBackdrop.class));
        k1(vx0Var, v8.l(H1.attributes, TL_stars.starGiftAttributePattern.class));
        if (!TextUtils.isEmpty(H1.slug) && (H1.flags & 256) != 0) {
            org.telegram.messenger.r1 i7 = org.telegram.messenger.r1.i();
            long j11 = H1.value_amount;
            String str2 = H1.value_currency;
            int h = org.telegram.messenger.r1.i().h(H1.value_currency);
            i7.getClass();
            vx0Var.c(hd.M0(2131749591, null), r.b.k("~", org.telegram.messenger.r1.g(str2, h, j11, true)), null, null);
        }
        linearLayout.addView(vx0Var, c8.ja.t(-1, -2, 48, 23, 16, 23, 4));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.J0);
        alertDialog$Builder.o(linearLayout);
        if (j10 > 0) {
            M0 = mb.T0(hd.a0(null, null, 2131749920, Integer.valueOf((int) j10)));
        } else {
            M0 = hd.M0(2131749921, null);
        }
        alertDialog$Builder.k(M0, new a1.c(z10Var, 24));
        alertDialog$Builder.h(hd.M0(2131752589, null), null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
        t1Var.Y0 = z10;
        t1Var.show();
    }

    @Override
    public final boolean Z0() {
        return false;
    }

    public final void Z1(long j3, z10 z10Var) {
        TLRPC.Message message;
        long j10;
        TL_stars.SavedStarGift savedStarGift = this.B2;
        if (savedStarGift != null && (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
            j10 = savedStarGift.transfer_stars;
        } else {
            gj gjVar = this.D2;
            if (gjVar != null && (message = gjVar.f23817k) != null) {
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
        Y1(j3, j10, true, z10Var);
    }

    public final void a2() {
        TL_stars.InputSavedStarGift B1;
        long j3;
        long j10;
        long j11;
        boolean z10;
        boolean z11;
        boolean z12;
        String str;
        boolean z13;
        boolean z14;
        int i7;
        hi.l3 l3Var = this.f8346u3;
        if (l3Var != null) {
            l3Var.f(true);
            this.f8346u3 = null;
        }
        if (this.Y2 == null && (B1 = B1()) != null) {
            gj gjVar = this.D2;
            long j12 = this.T1;
            if (gjVar != null) {
                TLRPC.MessageAction messageAction = gjVar.f23817k.action;
                if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                    TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                    j10 = tL_messageActionStarGift.gift.f28280id;
                    j11 = tL_messageActionStarGift.upgrade_stars;
                    z10 = tL_messageActionStarGift.name_hidden;
                    TLRPC.TL_textWithEntities tL_textWithEntities = tL_messageActionStarGift.message;
                    if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    j3 = 0;
                    z12 = tL_messageActionStarGift.peer instanceof TLRPC.TL_peerChannel;
                    str = tL_messageActionStarGift.prepaid_upgrade_hash;
                    if (tL_messageActionStarGift.prepaid_upgrade) {
                        if (org.telegram.messenger.m5.o(tL_messageActionStarGift.from_id) != this.D2.Z0()) {
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
                j3 = 0;
                TL_stars.SavedStarGift savedStarGift = this.B2;
                if (savedStarGift != null) {
                    TL_stars.StarGift starGift = savedStarGift.gift;
                    j10 = starGift.f28280id;
                    j11 = savedStarGift.upgrade_stars;
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
                    if (j12 < 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    TL_stars.SavedStarGift savedStarGift2 = this.B2;
                    str = savedStarGift2.prepaid_upgrade_hash;
                    z13 = savedStarGift2.upgrade_separate;
                } else {
                    return;
                }
            }
            TextView textView = this.f8343t2;
            if (z10) {
                if (z12) {
                    i7 = 2131750398;
                } else {
                    i7 = 2131750399;
                }
                textView.setText(hd.M0(i7, null));
            } else if (z11) {
                textView.setText(hd.M0(2131750396, null));
            } else {
                textView.setText(hd.M0(2131750397, null));
            }
            if (!z10 && j11 > j3 && !z13) {
                z14 = true;
            } else {
                z14 = false;
            }
            fp fpVar = this.f8341s2;
            fpVar.a(z14, false);
            ArrayList arrayList = this.f8326k3;
            if (arrayList != null && (j11 > j3 || this.f8334o3 != null)) {
                b2();
                return;
            }
            if (arrayList == null) {
                v8.y(this.f29679a, false).K(j10, new n1(this, 2));
            }
            if (j11 <= j3 && this.f8334o3 == null) {
                this.f8332n3 = true;
                TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                if (!TextUtils.isEmpty(str)) {
                    TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade tL_inputInvoiceStarGiftPrepaidUpgrade = new TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade();
                    tL_inputInvoiceStarGiftPrepaidUpgrade.hash = str;
                    tL_inputInvoiceStarGiftPrepaidUpgrade.peer = np.s1(this.f29679a).j1(j12);
                    tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftPrepaidUpgrade;
                } else {
                    TLRPC.TL_inputInvoiceStarGiftUpgrade tL_inputInvoiceStarGiftUpgrade = new TLRPC.TL_inputInvoiceStarGiftUpgrade();
                    tL_inputInvoiceStarGiftUpgrade.keep_original_details = fpVar.f34663a.f32441q;
                    tL_inputInvoiceStarGiftUpgrade.stargift = B1;
                    tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftUpgrade;
                }
                JSONObject u10 = ki.x2.u(this.J0, false);
                if (u10 != null) {
                    TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                    tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                    tL_dataJSON.data = u10.toString();
                    tL_payments_getPaymentForm.flags |= 1;
                }
                ConnectionsManager.getInstance(this.f29679a).sendRequest(tL_payments_getPaymentForm, new t3(this, 0));
            }
        }
    }

    public final void b2() {
        throw new UnsupportedOperationException("Method not decompiled: di.c6.b2():void");
    }

    public final void c2() {
        TL_stars.TL_starGiftUnique H1 = H1();
        if (this.f8310b3 != null && H1 != null && !TextUtils.isEmpty(H1.slug)) {
            Context context = getContext();
            int i7 = this.f29679a;
            wg.c1[] c1VarArr = {new wg.c1(context, i7, org.telegram.messenger.v1.a(i7).b(), 3, this.J0)};
            wg.c1 c1Var = c1VarArr[0];
            c1Var.f59164v2 = hd.M0(2131749914, null);
            org.telegram.ui.Components.fa faVar = c1Var.f35937p1;
            if (faVar != null) {
                faVar.setTitle(c1Var.O0());
            }
            mg0 mg0Var = c1Var.X1;
            if (mg0Var != null) {
                mg0Var.setText(c1Var.O0());
            }
            wg.c1 c1Var2 = c1VarArr[0];
            c1Var2.C2 = true;
            c1Var2.o1(false, true);
            wg.c1 c1Var3 = c1VarArr[0];
            c1Var3.f59166x2 = new ai.u1(6, this, c1VarArr);
            c1Var3.show();
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ns.G3) {
            if (this.C2 == ((m8) objArr[1])) {
                y4 y4Var = this.f8309b2.N;
                if (y4Var == null || !y4Var.f9782i0) {
                    w2();
                }
            }
        }
    }

    @Override
    public final void dismiss() {
        if (this.X2.c(4) && this.f8309b2.N.f9782i0) {
            return;
        }
        bi.y5 y5Var = this.S2;
        if (y5Var != null) {
            y5Var.b();
            this.S2 = null;
        }
        l5 l5Var = this.L2;
        if (l5Var != null) {
            l5Var.a();
        }
        super.dismiss();
    }

    public final SpannableStringBuilder e2(TLRPC.Peer peer) {
        if (peer != null) {
            String r10 = org.telegram.messenger.m5.r(np.s1(this.f29679a).e2(org.telegram.messenger.m5.o(peer)));
            if (!TextUtils.isEmpty(r10)) {
                return org.telegram.messenger.g0.U2(hd.a0(null, null, 2131750043, r.b.k("@", r10)), new d3(this, r10, 8));
            }
        }
        return null;
    }

    public final SpannableStringBuilder f2(TL_stars.StarGift starGift) {
        if (starGift != null && !(starGift instanceof TL_stars.TL_starGiftUnique)) {
            return e2(starGift.released_by);
        }
        return null;
    }

    public final void i2(String str, TL_stars.TL_starGiftUnique tL_starGiftUnique, n8 n8Var) {
        boolean z10;
        boolean z11;
        l5 l5Var;
        TL_stars.TL_starGiftUnique tL_starGiftUnique2;
        this.E2 = str;
        this.F2 = tL_starGiftUnique;
        this.C2 = n8Var;
        if (tL_starGiftUnique.resell_amount != null && !K1(this.f29679a, org.telegram.messenger.m5.o(tL_starGiftUnique.owner_id))) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.G2 = z10;
        if (!this.M2 && (l5Var = this.L2) != null && l5Var.f8972o && (tL_starGiftUnique2 = l5Var.f8969l) != null && tL_starGiftUnique2.f28280id != tL_starGiftUnique.f28280id) {
            l5Var.a();
            this.L2 = null;
            w5 w5Var = this.f8309b2;
            w5Var.f9659b.setAlpha(1.0f);
            w5Var.f9661c.setAlpha(0.0f);
        }
        this.f8307a2.b(this.f29679a, this.B2);
        l2(tL_starGiftUnique, false, null, null);
        String str2 = tL_starGiftUnique.owner_address;
        String str3 = tL_starGiftUnique.gift_address;
        if (tL_starGiftUnique.host_id != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        TL_wallet.walletTransaction wallettransaction = this.f8315e3;
        z70 z70Var = this.d2;
        if (wallettransaction == null && z11 && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            z70Var.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.g0.U2(hd.M0(2131750181, null), new d3(this, str3, 3)), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(0.66f)));
            z70Var.setVisibility(0);
            org.telegram.ui.ActionBar.q6.U(z70Var, org.telegram.ui.ActionBar.j6.f29088q5, this.J0);
        } else {
            z70Var.setVisibility(8);
        }
        TL_wallet.walletTransaction wallettransaction2 = this.f8315e3;
        z70 z70Var2 = this.f8316f2;
        if (wallettransaction2 == null && !z11 && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            z70Var2.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.g0.U2(hd.M0(2131750181, null), new d3(this, str3, 4)), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(0.66f)));
            z70Var2.setVisibility(0);
        } else {
            z70Var2.setVisibility(8);
        }
        x2();
        if (this.G2) {
            m2(tL_starGiftUnique);
            this.f8318g2.setOnClickListener(new k1(this, 11));
        }
        if (this.f8308a3) {
            t2(0, false, null);
            this.n1.n0(1);
            this.f8308a3 = false;
        }
        w2();
    }

    public final void j1(TL_stars.StarGiftAttribute starGiftAttribute) {
        String M0;
        boolean z10;
        l5 l5Var;
        TL_stars.StarGiftAttribute starGiftAttribute2;
        c6 c6Var;
        androidx.car.app.utils.a aVar;
        if (starGiftAttribute instanceof TL_stars.starGiftAttributeModel) {
            M0 = hd.M0(2131750387, null);
            z10 = true;
        } else if (starGiftAttribute instanceof TL_stars.starGiftAttributePattern) {
            M0 = hd.M0(2131750380, null);
            z10 = true;
        } else if (starGiftAttribute instanceof TL_stars.starGiftAttributeBackdrop) {
            M0 = hd.M0(2131750388, null);
            z10 = false;
        } else {
            return;
        }
        if (!this.M2 && ((l5Var = this.L2) == null || !l5Var.f8972o)) {
            boolean[] zArr = new boolean[1];
            org.telegram.ui.Components.ec[] ecVarArr = new org.telegram.ui.Components.ec[1];
            Integer[] numArr = new Integer[1];
            String G1 = G1(starGiftAttribute.rarity, numArr);
            if (starGiftAttribute.rarity instanceof TL_stars.TL_starGiftAttributeRarity) {
                starGiftAttribute2 = starGiftAttribute;
                c6Var = this;
                aVar = new androidx.car.app.utils.a(this, zArr, starGiftAttribute2, ecVarArr, 7);
            } else {
                starGiftAttribute2 = starGiftAttribute;
                c6Var = this;
                aVar = null;
            }
            ecVarArr[0] = (org.telegram.ui.Components.ec) ((sx0) c6Var.f8314e2.e(M0, starGiftAttribute2.name, G1, aVar, numArr[0]).getChildAt(1)).getChildAt(0);
            return;
        }
        q5 q5Var = new q5(getContext(), this.J0, new s1(this, 0));
        TableRow tableRow = new TableRow(getContext());
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
        vx0 vx0Var = this.f8314e2;
        tableRow.addView(new ux0(vx0Var, M0), layoutParams);
        tableRow.addView(new sx0(vx0Var, q5Var, true), new TableRow.LayoutParams(0, -1, 1.0f));
        vx0Var.addView(tableRow);
        l5 l5Var2 = this.L2;
        if (l5Var2 != null) {
            if (!z10) {
                l5Var2.d = q5Var;
            }
            if (z10) {
                l5Var2.f8962c = q5Var;
            }
            if (z10) {
                l5Var2.f8961b = q5Var;
            }
        }
    }

    public final void j2(org.telegram.messenger.gj r59, di.n8 r60) {
        throw new UnsupportedOperationException("Method not decompiled: di.c6.j2(org.telegram.messenger.gj, di.n8):void");
    }

    @Override
    public org.telegram.ui.Components.cc k() {
        return new org.telegram.ui.Components.cc(this.f8327l2, this.J0);
    }

    public final void k2(org.telegram.tgnet.tl.TL_stars.SavedStarGift r36, di.n8 r37) {
        throw new UnsupportedOperationException("Method not decompiled: di.c6.k2(org.telegram.tgnet.tl.TL_stars$SavedStarGift, di.n8):void");
    }

    public final void l1(LinearLayout linearLayout, int i7, int i10, int i11, String str, boolean z10) {
        int i12;
        int i13;
        ImageView imageView = new ImageView(getContext());
        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(i7);
        org.telegram.ui.ActionBar.e6 e6Var = this.J0;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        org.telegram.ui.ActionBar.q6.s(imageView, i11, e6Var, mode);
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
        linearLayout.addView(imageView, c8.ja.t(i10, i10, 16, i12, 0, i13, 0));
        TextView textView = new TextView(getContext());
        textView.setTextSize(1, 13.0f);
        int i14 = org.telegram.ui.ActionBar.j6.f29107r5;
        org.telegram.ui.ActionBar.q6.U(textView, i14, this.J0);
        textView.setText(str);
        linearLayout.addView(textView, c8.ja.t(-2, -2, 16, 4, 0, 0, 0));
        if (z10) {
            ImageView imageView2 = new ImageView(getContext());
            imageView2.setScaleType(scaleType);
            imageView2.setImageResource(2131232251);
            org.telegram.ui.ActionBar.q6.s(imageView2, i14, this.J0, mode);
            linearLayout.addView(imageView2, c8.ja.t(11, 11, 16, 5, 0, 2, 0));
        }
    }

    public final void l2(org.telegram.tgnet.tl.TL_stars.TL_starGiftUnique r37, boolean r38, org.telegram.tgnet.TLObject r39, org.telegram.tgnet.TLRPC.TL_textWithEntities r40) {
        throw new UnsupportedOperationException("Method not decompiled: di.c6.l2(org.telegram.tgnet.tl.TL_stars$TL_starGiftUnique, boolean, org.telegram.tgnet.TLObject, org.telegram.tgnet.TLRPC$TL_textWithEntities):void");
    }

    public final void m1(TL_stars.InputSavedStarGift inputSavedStarGift, TLRPC.Updates updates, Runnable runnable) {
        TLRPC.Message message;
        TL_stars.StarGift starGift;
        if (updates == null) {
            v8.y(this.f29679a, false).P(x1());
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
            TL_stars.SavedStarGift savedStarGift = this.B2;
            if (savedStarGift != null && (!(inputSavedStarGift instanceof TL_stars.TL_inputSavedStarGiftUser) ? !(!(inputSavedStarGift instanceof TL_stars.TL_inputSavedStarGiftChat) ? !(inputSavedStarGift instanceof TL_stars.TL_inputSavedStarGiftSlug) || (starGift = savedStarGift.gift) == null || !TextUtils.equals(starGift.slug, ((TL_stars.TL_inputSavedStarGiftSlug) inputSavedStarGift).slug) : savedStarGift.saved_id != ((TL_stars.TL_inputSavedStarGiftChat) inputSavedStarGift).saved_id) : savedStarGift.msg_id == ((TL_stars.TL_inputSavedStarGiftUser) inputSavedStarGift).msg_id)) {
                TLRPC.MessageAction messageAction = message.action;
                if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                    this.M2 = true;
                    TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
                    TL_stars.SavedStarGift savedStarGift2 = this.B2;
                    savedStarGift2.gift = tL_messageActionStarGiftUnique.gift;
                    savedStarGift2.msg_id = message.f28072id;
                    savedStarGift2.flags = (savedStarGift2.flags | 8) & (-2049);
                    savedStarGift2.saved_id = 0L;
                    savedStarGift2.unsaved = !tL_messageActionStarGiftUnique.saved;
                    savedStarGift2.refunded = tL_messageActionStarGiftUnique.refunded;
                    savedStarGift2.can_upgrade = false;
                    savedStarGift2.can_resell_at = tL_messageActionStarGiftUnique.can_resell_at;
                    savedStarGift2.can_transfer_at = tL_messageActionStarGiftUnique.can_transfer_at;
                    savedStarGift2.can_export_at = tL_messageActionStarGiftUnique.can_export_at;
                    k2(savedStarGift2, this.C2);
                    this.f8326k3 = null;
                    this.M2 = false;
                    n8 n8Var = this.C2;
                    if (n8Var != null) {
                        n8Var.d();
                    } else {
                        v8.y(this.f29679a, false).P(this.T1);
                    }
                    org.telegram.messenger.g0.h3(runnable);
                    return;
                }
            }
            if (this.C2 == null) {
                v8.y(this.f29679a, false).P(x1());
            }
            this.M2 = true;
            this.B2 = null;
            this.A2 = false;
            gj gjVar = new gj(this.f29679a, message, false, false);
            gjVar.L5();
            j2(gjVar, this.C2);
            this.f8326k3 = null;
            this.M2 = false;
            org.telegram.messenger.g0.h3(runnable);
            return;
        }
        v8.y(this.f29679a, false).P(x1());
        dismiss();
    }

    public final void m2(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        cg.a resellAmount = tL_starGiftUnique.getResellAmount(cg.b.f4987a);
        boolean z10 = tL_starGiftUnique.resale_ton_only;
        hi.d dVar = this.f8318g2;
        if (z10) {
            dVar.i(mb.s1(mb.V0(hd.a0(null, null, 2131746146, tL_starGiftUnique.getResellAmount(cg.b.f4988b).d()), true), true), !this.f8308a3, true);
            dVar.g(mb.T0(hd.H(',', "ResellGiftBuyEq", (int) resellAmount.a())), !this.f8308a3);
            return;
        }
        dVar.i(mb.T0(hd.H(',', "ResellGiftBuy", (int) resellAmount.a())), !this.f8308a3, true);
        dVar.g(null, !this.f8308a3);
    }

    public final boolean n1() {
        int i7;
        boolean z10;
        boolean z11;
        TLRPC.Peer peer;
        if (B1() == null) {
            return false;
        }
        gj gjVar = this.D2;
        if (gjVar != null) {
            TLRPC.MessageAction messageAction = gjVar.f23817k.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                if (tL_messageActionStarGift.peer != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                boolean P3 = gjVar.P3();
                if (gj.B0(this.D2.f23817k) == m10.i(this.f29679a).e()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                int currentTime = np.s1(this.f29679a).F6 - (ConnectionsManager.getInstance(this.f29679a).getCurrentTime() - this.D2.f23817k.date);
                if (((z10 || (P3 && !z11)) && ((peer = tL_messageActionStarGift.peer) == null || !L1(this.f29679a, org.telegram.messenger.m5.o(peer)))) || tL_messageActionStarGift.converted || tL_messageActionStarGift.convert_stars <= 0 || currentTime <= 0) {
                    return false;
                }
                return true;
            }
        } else {
            TL_stars.SavedStarGift savedStarGift = this.B2;
            if (savedStarGift != null) {
                int currentTime2 = np.s1(this.f29679a).F6 - (ConnectionsManager.getInstance(this.f29679a).getCurrentTime() - savedStarGift.date);
                int i10 = this.f29679a;
                long j3 = this.T1;
                if (L1(i10, j3)) {
                    int i11 = this.B2.flags;
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

    public final void n2(TL_stars.TL_starGiftUnique tL_starGiftUnique, boolean z10) {
        if (z10) {
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_peerUser.user_id = m10.i(this.f29679a).e();
            tL_starGiftUnique.host_id = tL_peerUser;
            tL_starGiftUnique.flags |= 4096;
        } else {
            tL_starGiftUnique.host_id = null;
            tL_starGiftUnique.flags &= -4097;
        }
        this.f8309b2.setWalletDisplayed(z10);
        x2();
    }

    public final boolean o1() {
        int i7;
        TL_stars.TL_starGiftUnique H1 = H1();
        if (H1 == null || H1.crafted || !L1(this.f29679a, org.telegram.messenger.m5.o(H1.owner_id))) {
            return false;
        }
        gj gjVar = this.D2;
        if (gjVar != null) {
            TLRPC.Message message = gjVar.f23817k;
            if (message == null) {
                return false;
            }
            TLRPC.MessageAction messageAction = message.action;
            if (!(messageAction instanceof TLRPC.TL_messageActionStarGiftUnique)) {
                return false;
            }
            i7 = ((TLRPC.TL_messageActionStarGiftUnique) messageAction).can_craft_at;
        } else {
            TL_stars.SavedStarGift savedStarGift = this.B2;
            if (savedStarGift != null && (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
                i7 = savedStarGift.can_craft_at;
            }
            return false;
        }
        int currentTime = ConnectionsManager.getInstance(this.f29679a).getCurrentTime();
        if (i7 <= 0 || currentTime < i7) {
            return false;
        }
        return true;
    }

    public final void o2() {
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
        this.f8351y2.setText(hd.a0(null, null, 2131749833, i5.c.l(H1.num, ',', sb2)));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(hd.M0(2131749835, null));
        if (o4 == m10.i(this.f29679a).e() && !m10.i(this.f29679a).q()) {
            spannableStringBuilder.append((CharSequence) " l");
            if (this.T2 == null) {
                this.T2 = new eq(2131232244, 0);
            }
            spannableStringBuilder.setSpan(this.T2, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        hi.d dVar = this.f8318g2;
        dVar.i(spannableStringBuilder, true, true);
        dVar.g(null, true);
        dVar.setOnClickListener(new k1(this, 26));
        this.f8309b2.setWearPreview(np.s1(this.f29679a).e2(o4));
        t2(2, false, null);
        this.f8349w2 = true;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ns.f(this.f29679a).c(this, ns.G3);
    }

    @Override
    public final void onBackPressed() {
        w5 w5Var;
        y4 y4Var;
        if (this.X2.c(4) && (w5Var = this.f8309b2) != null && (y4Var = w5Var.N) != null) {
            if (y4Var.f9782i0) {
                return;
            }
            if (y4Var.f9783j0) {
                super.onBackPressed();
                return;
            }
        }
        if (!this.f8349w2 && this.X2.f8251c > 0 && !this.f8318g2.R && !this.j3) {
            gj gjVar = this.D2;
            if (gjVar != null) {
                j2(gjVar, null);
            } else {
                TL_stars.SavedStarGift savedStarGift = this.B2;
                if (savedStarGift != null) {
                    k2(savedStarGift, this.C2);
                } else {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = this.F2;
                    if (tL_starGiftUnique != null) {
                        i2(this.E2, tL_starGiftUnique, this.C2);
                    }
                }
            }
            t2(0, true, null);
            return;
        }
        super.onBackPressed();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ns.f(this.f29679a).n(this, ns.G3);
    }

    public final boolean p1() {
        throw new UnsupportedOperationException("Method not decompiled: di.c6.p1():boolean");
    }

    public final void p2(CharSequence charSequence) {
        TL_stars.TL_starGiftUnique H1 = H1();
        TL_stars.InputSavedStarGift B1 = B1();
        if (B1 != null && H1 != null) {
            TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails tL_inputInvoiceStarGiftDropOriginalDetails = new TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails();
            tL_inputInvoiceStarGiftDropOriginalDetails.stargift = B1;
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftDropOriginalDetails;
            JSONObject u10 = ki.x2.u(this.J0, false);
            if (u10 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = u10.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            ConnectionsManager.getInstance(this.f29679a).sendRequest(tL_payments_getPaymentForm, new bi.l1(this, charSequence, H1, tL_inputInvoiceStarGiftDropOriginalDetails, 2));
        }
    }

    public final void q1() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.J0);
        String M0 = hd.M0(2131750266, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
        t1Var.S = M0;
        t1Var.U = hd.M0(2131750267, null);
        TL_stars.TL_starGiftUnique H1 = H1();
        if (H1 != null && !TextUtils.isEmpty(H1.slug)) {
            alertDialog$Builder.k(hd.M0(2131747805, null), new p3(this, H1, 1));
        }
        i5.c.x(null, 2131752589, alertDialog$Builder, null);
    }

    public final void q2(View view, CharSequence charSequence, boolean z10) {
        Layout layout;
        org.telegram.ui.Components.fc fcVar;
        float primaryHorizontal;
        int i7;
        hi.l3 l3Var = this.f8346u3;
        if ((l3Var == null || !l3Var.W || this.f8348v3 != view) && view != null) {
            if (z10) {
                if (view instanceof org.telegram.ui.ActionBar.j5) {
                    org.telegram.ui.ActionBar.j5 j5Var = (org.telegram.ui.ActionBar.j5) view;
                    primaryHorizontal = (j5Var.getRightDrawableWidth() / 2.0f) + j5Var.getRightDrawableX();
                } else {
                    return;
                }
            } else {
                if (view instanceof TextView) {
                    layout = ((TextView) view).getLayout();
                } else if (view instanceof org.telegram.ui.ActionBar.j5) {
                    layout = ((org.telegram.ui.ActionBar.j5) view).getLayout();
                } else {
                    return;
                }
                if (layout != null) {
                    CharSequence text = layout.getText();
                    if (text instanceof Spanned) {
                        Spanned spanned = (Spanned) text;
                        org.telegram.ui.Components.fc[] fcVarArr = (org.telegram.ui.Components.fc[]) spanned.getSpans(0, spanned.length(), org.telegram.ui.Components.fc.class);
                        if (fcVarArr != null && fcVarArr.length > 0) {
                            primaryHorizontal = layout.getPrimaryHorizontal(spanned.getSpanStart(fcVarArr[fcVarArr.length - 1])) + view.getPaddingLeft() + (fcVar.a() / 2.0f);
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
            k4 k4Var = this.U1;
            k4Var.getLocationOnScreen(iArr);
            int[] iArr2 = {iArr2[0] - iArr[0], iArr2[1] - iArr[1]};
            hi.l3 l3Var2 = this.f8346u3;
            if (l3Var2 != null) {
                l3Var2.f(true);
                this.f8346u3 = null;
            }
            hi.l3 l3Var3 = new hi.l3(getContext(), 3);
            l3Var3.r(!z10);
            l3Var3.u(charSequence);
            l3Var3.p(0.0f, (iArr2[0] + primaryHorizontal) - (org.telegram.messenger.g0.L(16.0f) + this.f29717u0));
            float L = (iArr2[1] - org.telegram.messenger.g0.L(100.0f)) - (view.getHeight() / 2.0f);
            if (z10) {
                i7 = 18;
            } else {
                i7 = 0;
            }
            l3Var3.setTranslationY(L + org.telegram.messenger.g0.L(i7 + 4.33f));
            l3Var3.d = 3000L;
            l3Var3.setPadding(org.telegram.messenger.g0.L(16.0f) + this.f29717u0, 0, org.telegram.messenger.g0.L(16.0f) + this.f29717u0, 0);
            l3Var3.f14570r0 = new bi.c0(l3Var3, 1);
            l3Var3.w();
            k4Var.addView(l3Var3, c8.ja.c(100.0f, -1));
            this.f8346u3 = l3Var3;
            this.f8348v3 = view;
        }
    }

    @Override
    public final void r0() {
        hi.l3 l3Var = this.f8346u3;
        if (l3Var != null) {
            l3Var.f(true);
            this.f8346u3 = null;
        }
    }

    public final void r1(long j3, TL_stars.starGiftDepositPayload stargiftdepositpayload, vf.b bVar, wg.c1 c1Var) {
        TL_wallet.nftItem nftitem = this.f8310b3;
        TL_stars.TL_starGiftUnique H1 = H1();
        if (nftitem != null && H1 != null && !TextUtils.isEmpty(H1.slug)) {
            bVar.d();
            w2 w2Var = new w2(this, bVar, c1Var, j3, H1, nftitem, 0);
            if (stargiftdepositpayload != null) {
                w2Var.a(stargiftdepositpayload);
                return;
            }
            TL_stars.depositStarGift depositstargift = new TL_stars.depositStarGift();
            depositstargift.peer = np.s1(this.f29679a).j1(j3);
            depositstargift.slug = H1.slug;
            ConnectionsManager.getInstance(this.f29679a).sendRequestTyped(depositstargift, new d3.b(1), new b2(this, bVar, c1Var, w2Var, 1));
        }
    }

    public final void r2(int i7, Context context, boolean z10) {
        int i10;
        int i11;
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        FrameLayout frameLayout = new FrameLayout(context);
        int L = org.telegram.messenger.g0.L(64.0f);
        int i12 = org.telegram.ui.ActionBar.j6.Fi;
        ShapeDrawable L2 = org.telegram.ui.ActionBar.j6.L(L, org.telegram.ui.ActionBar.j6.w0(i12, this.J0));
        org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i12);
        org.telegram.ui.ActionBar.e6 e6Var = this.J0;
        frameLayout.setBackground(L2);
        org.telegram.ui.ActionBar.q6.j(frameLayout, L2, M, null, e6Var);
        f10.addView(frameLayout, c8.ja.t(64, 64, 49, 0, 6, 0, 0));
        ?? imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.f(2131624292, 42, 42, null);
        frameLayout.addView((View) imageView, c8.ja.r(64, 64, 17));
        imageView.d();
        TextView b10 = c8.sa.b(context, 20.0f, org.telegram.ui.ActionBar.j6.G6, true, null);
        b10.setGravity(17);
        if (z10) {
            i10 = 2131750005;
        } else {
            i10 = 2131749911;
        }
        b10.setText(hd.M0(i10, null));
        f10.addView(b10, c8.ja.t(-1, -2, 48, 24, 14, 24, 0));
        TextView b11 = c8.sa.b(context, 14.0f, org.telegram.ui.ActionBar.j6.F6, false, null);
        b11.setGravity(17);
        if (z10) {
            i11 = 2131750006;
        } else {
            i11 = 2131749912;
        }
        b11.setText(hd.a0(null, null, i11, hd.c0(Math.max(10, i7))));
        f10.addView(b11, c8.ja.t(-1, -2, 48, 24, 6, 24, 6));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, this.J0);
        alertDialog$Builder.o(f10);
        alertDialog$Builder.k(hd.M0(2131747831, null), null);
        alertDialog$Builder.p();
    }

    @Override
    public final void s0() {
        super.s0();
        try {
            Q(org.telegram.ui.ActionBar.j6.f28922h5);
            w5 w5Var = this.f8309b2;
            if (w5Var != null) {
                w5Var.l();
            }
            eq eqVar = this.Z2;
            if (eqVar != null) {
                Drawable drawable = eqVar.f34411c;
                if (drawable instanceof x5) {
                    ((x5) drawable).d.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Fi, this.J0));
                    hi.d dVar = this.f8318g2;
                    if (dVar != null) {
                        dVar.invalidate();
                    }
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void s1(final long j3, final z10 z10Var) {
        TLRPC.Message message;
        long o4;
        long j10;
        TL_stars.InputSavedStarGift B1 = B1();
        if (B1 != null) {
            TL_stars.SavedStarGift savedStarGift = this.B2;
            if (savedStarGift != null && (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
                j10 = savedStarGift.transfer_stars;
                o4 = this.T1;
            } else {
                gj gjVar = this.D2;
                if (gjVar != null && (message = gjVar.f23817k) != null) {
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
                transferstargift.to_id = np.s1(this.f29679a).j1(j3);
                final long j11 = o4;
                ConnectionsManager.getInstance(this.f29679a).sendRequest(transferstargift, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        boolean z10 = tLObject instanceof TLRPC.Updates;
                        c6 c6Var = c6.this;
                        if (z10) {
                            np.s1(c6Var.f29679a).O3((TLRPC.Updates) tLObject, false);
                        }
                        org.telegram.messenger.g0.h3(new p2(c6Var, z10Var, tL_error, tLObject, j3, j11));
                    }
                });
                return;
            }
            long j12 = o4;
            v8 y10 = v8.y(this.f29679a, false);
            if (!y10.f9601e) {
                y10.r(new f2(this, y10, j3, z10Var, 0));
                return;
            }
            TLRPC.TL_inputInvoiceStarGiftTransfer tL_inputInvoiceStarGiftTransfer = new TLRPC.TL_inputInvoiceStarGiftTransfer();
            tL_inputInvoiceStarGiftTransfer.stargift = B1;
            tL_inputInvoiceStarGiftTransfer.to_id = np.s1(this.f29679a).j1(j3);
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftTransfer;
            JSONObject u10 = ki.x2.u(this.J0, false);
            if (u10 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = u10.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            ConnectionsManager.getInstance(this.f29679a).sendRequest(tL_payments_getPaymentForm, new g2(this, tL_inputInvoiceStarGiftTransfer, j3, j12, z10Var));
        }
    }

    public final void s2(boolean z10, org.telegram.ui.ActionBar.t1 t1Var, vf.b bVar, Runnable runnable) {
        bVar.d();
        m10 i7 = m10.i(this.f29679a);
        TL_account.tmpPassword tmppassword = i7.f24964y;
        if (tmppassword != null && tmppassword.valid_until < ConnectionsManager.getInstance(this.f29679a).getCurrentTime() + 60) {
            i7.f24964y = null;
            i7.v(false);
        }
        TL_account.tmpPassword tmppassword2 = i7.f24964y;
        if (tmppassword2 == null) {
            W1(z10, bVar, runnable);
        } else {
            J1(tmppassword2.tmp_password, null, z10, new t2(this, z10, bVar, runnable, t1Var));
        }
    }

    @Override
    public final void show() {
        gj gjVar;
        TLRPC.Message message;
        if (np.s1(this.f29679a).v2()) {
            org.telegram.ui.b.b(this.f29679a);
            return;
        }
        if (this.E2 != null && this.F2 == null) {
            org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, getContext(), null);
            t1Var.r(500L);
            TL_stars.getUniqueStarGift getuniquestargift = new TL_stars.getUniqueStarGift();
            getuniquestargift.slug = this.E2;
            ConnectionsManager.getInstance(this.f29679a).sendRequest(getuniquestargift, new bi.v2(4, this, t1Var));
        } else if (this.B2 == null && (gjVar = this.D2) != null && (message = gjVar.f23817k) != null) {
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                if (tL_messageActionStarGift.upgraded) {
                    if (tL_messageActionStarGift.upgrade_msg_id != 0) {
                        org.telegram.ui.ActionBar.t1 t1Var2 = new org.telegram.ui.ActionBar.t1(3, getContext(), null);
                        t1Var2.r(500L);
                        TLRPC.TL_messages_getMessages tL_messages_getMessages = new TLRPC.TL_messages_getMessages();
                        tL_messages_getMessages.f28147id.add(Integer.valueOf(tL_messageActionStarGift.upgrade_msg_id));
                        ConnectionsManager.getInstance(this.f29679a).sendRequest(tL_messages_getMessages, new bi.j6(this, tL_messageActionStarGift, t1Var2, 1));
                        return;
                    } else if (B1() != null) {
                        org.telegram.ui.ActionBar.t1 t1Var3 = new org.telegram.ui.ActionBar.t1(3, getContext(), null);
                        t1Var3.r(500L);
                        v8.y(this.f29679a, false).M(B1(), new ai.u1(7, this, t1Var3));
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
        hi.d dVar = this.f8318g2;
        if (!dVar.R && (B1 = B1()) != null) {
            gj gjVar = this.D2;
            String str = null;
            long j10 = 0;
            if (gjVar != null) {
                TLRPC.MessageAction messageAction = gjVar.f23817k.action;
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
                TL_stars.SavedStarGift savedStarGift = this.B2;
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
            if (i7 > 0 || this.f8334o3 != null) {
                dVar.setLoading(true);
                fp fpVar = this.f8341s2;
                if (i7 > 0) {
                    TL_stars.upgradeStarGift upgradestargift = new TL_stars.upgradeStarGift();
                    upgradestargift.keep_original_details = fpVar.f34663a.f32441q;
                    upgradestargift.stargift = B1;
                    ConnectionsManager.getInstance(this.f29679a).sendRequest(upgradestargift, new bi.v2(6, this, B1));
                    return;
                }
                int i10 = 0;
                v8 y10 = v8.y(this.f29679a, false);
                if (!y10.f9601e) {
                    y10.r(new s2(0, this, y10));
                    return;
                }
                TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
                tL_payments_sendStarsForm.form_id = this.f8334o3.form_id;
                if (!TextUtils.isEmpty(str)) {
                    TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade tL_inputInvoiceStarGiftPrepaidUpgrade = new TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade();
                    tL_inputInvoiceStarGiftPrepaidUpgrade.hash = str;
                    tL_inputInvoiceStarGiftPrepaidUpgrade.peer = np.s1(this.f29679a).j1(this.T1);
                    tL_payments_sendStarsForm.invoice = tL_inputInvoiceStarGiftPrepaidUpgrade;
                } else {
                    TLRPC.TL_inputInvoiceStarGiftUpgrade tL_inputInvoiceStarGiftUpgrade = new TLRPC.TL_inputInvoiceStarGiftUpgrade();
                    tL_inputInvoiceStarGiftUpgrade.keep_original_details = fpVar.f34663a.f32441q;
                    tL_inputInvoiceStarGiftUpgrade.stargift = B1;
                    tL_payments_sendStarsForm.invoice = tL_inputInvoiceStarGiftUpgrade;
                }
                ArrayList<TLRPC.TL_labeledPrice> arrayList = this.f8334o3.invoice.prices;
                int size = arrayList.size();
                while (i10 < size) {
                    TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i10);
                    i10++;
                    j10 += tL_labeledPrice.amount;
                }
                ConnectionsManager.getInstance(this.f29679a).sendRequest(tL_payments_sendStarsForm, new y(this, str, B1, j10, 1));
            }
        }
    }

    public final void t2(int r12, boolean r13, ai.q r14) {
        throw new UnsupportedOperationException("Method not decompiled: di.c6.t2(int, boolean, ai.q):void");
    }

    public final void u2(boolean z10) {
        boolean z11;
        int i7;
        int i10;
        int i11;
        TL_stars.TL_starGiftUnique H1 = H1();
        if (H1 == null) {
            return;
        }
        np.e1().edit().putInt("statusgiftpage", 3).apply();
        boolean M1 = M1(this.f29679a, H1());
        boolean z12 = !M1;
        boolean M12 = M1(this.f29679a, H1());
        hi.d dVar = this.f8318g2;
        if (M12) {
            np.s1(this.f29679a).h5(x1(), new TLRPC.TL_emojiStatusEmpty(), null);
            z11 = z12;
            i7 = 3;
        } else {
            z11 = z12;
            i7 = 3;
            long x12 = x1();
            if (x12 >= 0) {
                if (!m10.i(this.f29679a).q()) {
                    org.telegram.ui.Components.xb P = k().P(2131624217, org.telegram.messenger.g0.x2(hd.M0(2131750423, null), new l1(this, 2)));
                    P.f41653t = true;
                    P.j();
                    return;
                }
            } else if (!z10) {
                np s12 = np.s1(this.f29679a);
                dVar.setLoading(true);
                np.s1(this.f29679a).G0().a(x12, new o1(this, s12, x12, 0));
                return;
            }
            TLRPC.TL_inputEmojiStatusCollectible tL_inputEmojiStatusCollectible = new TLRPC.TL_inputEmojiStatusCollectible();
            tL_inputEmojiStatusCollectible.collectible_id = H1.f28280id;
            np.s1(this.f29679a).h5(x1(), tL_inputEmojiStatusCollectible, H1);
        }
        ai.j0 j0Var = this.f8309b2.J[1];
        if (!M1) {
            i10 = 2131231102;
        } else {
            i10 = 2131231103;
        }
        if (!M1) {
            i11 = 2131750422;
        } else {
            i11 = 2131750425;
        }
        j0Var.e(i10, hd.M0(i11, null), true);
        if (this.f8349w2) {
            dismiss();
            return;
        }
        ai.q qVar = new ai.q(i7, this, z11);
        if (this.X2.c(0)) {
            qVar.run();
        } else {
            t2(0, true, qVar);
        }
        dVar.i(hd.M0(2131747831, null), !this.f8308a3, true);
        dVar.g(null, !this.f8308a3);
        dVar.setOnClickListener(new k1(this, 4));
    }

    public final void v2() {
        FrameLayout frameLayout = this.f8324j2;
        int visibility = frameLayout.getVisibility();
        FrameLayout frameLayout2 = this.f8327l2;
        FrameLayout frameLayout3 = this.f8320h2;
        if (visibility == 0) {
            frameLayout3.setTranslationY(this.X2.a(1) * (-frameLayout.getMeasuredHeight()));
            frameLayout.setTranslationY((1.0f - this.X2.a(1)) * frameLayout.getMeasuredHeight());
            frameLayout2.setTranslationY(this.X2.a(1) * (-frameLayout.getMeasuredHeight()));
            return;
        }
        frameLayout3.setTranslationY(0.0f);
        frameLayout.setTranslationY(0.0f);
        frameLayout2.setTranslationY(0.0f);
    }

    public final int w1() {
        if (this.X2.d(1)) {
            return this.f8333o2.getMeasuredHeight();
        }
        if (this.X2.d(2)) {
            return this.f8350x2.getMeasuredHeight();
        }
        if (this.X2.d(3)) {
            return this.f8352z2.getMeasuredHeight();
        }
        if (this.X2.d(4)) {
            return 0;
        }
        return this.f8311c2.getMeasuredHeight();
    }

    public final void w2() {
        boolean I1 = I1(false);
        e4 e4Var = this.V1;
        e4Var.setPosition(I1 ? 1 : 0);
        e4Var.B(false);
        if (this.C2 != null && !I1(true) && this.C2.e() < this.C2.c()) {
            this.C2.a();
        }
    }

    public final long x1() {
        TLRPC.Peer peer;
        gj gjVar = this.D2;
        if (gjVar != null) {
            TLRPC.Message message = gjVar.f23817k;
            if (message != null) {
                TLRPC.MessageAction messageAction = message.action;
                if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                    TLRPC.Peer peer2 = ((TLRPC.TL_messageActionStarGift) messageAction).peer;
                    if (peer2 != null) {
                        return org.telegram.messenger.m5.o(peer2);
                    }
                    if (gjVar.P3()) {
                        return gj.B0(this.D2.f23817k);
                    }
                    return m10.i(this.f29679a).e();
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
        TL_stars.SavedStarGift savedStarGift = this.B2;
        if (savedStarGift != null) {
            TL_stars.StarGift starGift2 = savedStarGift.gift;
            if (starGift2 instanceof TL_stars.TL_starGiftUnique) {
                return org.telegram.messenger.m5.o(((TL_stars.TL_starGiftUnique) starGift2).owner_id);
            }
            return this.T1;
        }
        TL_stars.TL_starGiftUnique tL_starGiftUnique = this.F2;
        if (tL_starGiftUnique != null) {
            return org.telegram.messenger.m5.o(tL_starGiftUnique.owner_id);
        }
        return 0L;
    }

    public final void x2() {
        TL_stars.TL_starGiftUnique H1 = H1();
        TL_wallet.nftItem nftitem = this.f8310b3;
        LinearLayout linearLayout = this.f8345u2;
        if (nftitem != null && H1 != null) {
            this.d2.setVisibility(8);
            this.f8316f2.setVisibility(8);
            boolean z10 = false;
            linearLayout.setVisibility(0);
            if (H1.host_id != null) {
                z10 = true;
            }
            this.f8347v2.a(z10, linearLayout.isAttachedToWindow());
            return;
        }
        linearLayout.setVisibility(8);
    }

    public final TL_stars.StarGift y1() {
        gj gjVar = this.D2;
        if (gjVar != null) {
            TLRPC.Message message = gjVar.f23817k;
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
            TL_stars.SavedStarGift savedStarGift = this.B2;
            if (savedStarGift != null) {
                return savedStarGift.gift;
            }
            TL_stars.TL_starGiftUnique tL_starGiftUnique = this.F2;
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
            return i5.c.l(tL_starGiftUnique.num, ',', sb2);
        }
        return "";
    }
}
