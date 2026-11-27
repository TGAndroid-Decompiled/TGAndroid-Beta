package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.InputFilter;
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
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
import org.telegram.messenger.time.FastDateFormat;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.Wallet.c;
public class wua extends ny0 implements fn7 {
    public TL_stars.SavedStarGift A2;
    public bxa B2;
    public r47 C2;
    public String D2;
    public TL_stars.TL_starGiftUnique E2;
    public boolean F2;
    public boolean G2;
    public boolean H2;
    public boolean I2;
    public boolean J2;
    public iua K2;
    public boolean L2;
    public ita M2;
    public final int[] N2;
    public ox0 O2;
    public int P2;
    public String Q2;
    public ld9 R2;
    public final long S1;
    public wm2 S2;
    public final jo0 T1;
    public boolean T2;
    public final fta U1;
    public zsa U2;
    public final tj4 V1;
    public Float V2;
    public final View W1;
    public yta W2;
    public mx4 X1;
    public ValueAnimator X2;
    public mx4 Y1;
    public wm2 Y2;
    public final hta Z1;
    public boolean Z2;
    public final sua a2;
    public TL_wallet.nftItem a3;
    public final gta b2;
    public dqc b3;
    public final p66 c2;
    public eqc c3;
    public final hjb d2;
    public TL_wallet.walletTransaction d3;
    public final p66 e2;
    public final LinearLayout e3;
    public final c51 f2;
    public final TextView f3;
    public final FrameLayout g2;
    public final TextView g3;
    public final p66 h2;
    public View h3;
    public final FrameLayout i2;
    public qt8 i3;
    public final View j2;
    public boolean j3;
    public final FrameLayout k2;
    public Boolean k3;
    public uua l2;
    public boolean l3;
    public boolean m2;
    public ArrayList m3;
    public final gta n2;
    public ArrayList n3;
    public final bc[] o2;
    public ArrayList o3;
    public final View p2;
    public boolean p3;
    public final LinearLayout q2;
    public TLRPC.PaymentForm q3;
    public final og2 r2;
    public final wm2[] r3;
    public final TextView s2;
    public final jra s3;
    public final LinearLayout t2;
    public int t3;
    public final og2 u2;
    public Boolean u3;
    public boolean v2;
    public boolean v3;
    public final gta w2;
    public kg5 w3;
    public final TextView x2;
    public View x3;
    public final gta y2;
    public boolean z2;

    public wua(Context context, int i, long j, vnb vnbVar, View view) {
        super(context, null, false, false, vnbVar);
        this.m2 = false;
        this.N2 = new int[2];
        this.P2 = -1;
        this.Q2 = "";
        this.W2 = new yta(0, 0);
        this.Z2 = true;
        this.r3 = new wm2[1];
        this.s3 = new jra(this, (byte) 15);
        this.v3 = true;
        this.a = i;
        this.S1 = j;
        this.u1 = Math.max(0.05f, hl.L(82.0f) / (hl.q.y + hl.m));
        this.x = true;
        this.b = new d26((byte) 26, context, this);
        jo0 jo0Var = new jo0(this, context);
        this.T1 = jo0Var;
        fta ftaVar = new fta(this, context);
        this.U1 = ftaVar;
        ftaVar.setAdapter(new bn0((byte) 7, context, this));
        D2();
        View view2 = new View(context);
        this.W1 = view2;
        int i2 = aob.h5;
        yob.h(i2, vnbVar, view2);
        FrameLayout.LayoutParams e = tre.e(-1, 50, 80);
        int i3 = this.u0;
        e.rightMargin = i3;
        e.leftMargin = i3;
        this.b.addView(view2, e);
        this.b.addView(ftaVar, tre.e(-1, -1, 119));
        L(i2);
        hl.B2(this.n1);
        jo0Var.addView(this.n1, tre.e(-1, -1, 119));
        if (Build.VERSION.SDK_INT >= 26) {
            this.n1.setDefaultFocusHighlightEnabled(false);
        }
        gta gtaVar = new gta(this, context, (byte) 0);
        this.b2 = gtaVar;
        gtaVar.setOrientation(1);
        gtaVar.setPadding(hl.L(14.0f) + this.u0, hl.L(16.0f), hl.L(14.0f) + this.u0, hl.L(68.0f));
        jo0Var.addView(gtaVar, tre.e(-1, -1, 55));
        LinearLayout linearLayout = new LinearLayout(context);
        this.e3 = linearLayout;
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        this.f3 = textView;
        textView.setSingleLine(true);
        textView.setGravity(17);
        textView.setIncludeFontPadding(false);
        bs2.t(textView, 1, 40.0f);
        int i4 = aob.Fi;
        yob.X(textView, i4, vnbVar);
        linearLayout.addView(textView, tre.r(-1, 50, 1));
        TextView textView2 = new TextView(context);
        this.g3 = textView2;
        textView2.setGravity(17);
        textView2.setIncludeFontPadding(false);
        textView2.setTextSize(1, 14.0f);
        yob.X(textView2, aob.z6, vnbVar);
        linearLayout.addView(textView2, tre.t(-1, 20, 1, 0, 3, 0, 0));
        gtaVar.addView(linearLayout, tre.k(0.0f, 4.0f, 0.0f, 16.0f, -1, -2));
        linearLayout.setVisibility(8);
        p66 p66Var = new p66(context, vnbVar);
        this.c2 = p66Var;
        int i5 = aob.q5;
        yob.X(p66Var, i5, vnbVar);
        p66Var.setTextSize(1, 12.0f);
        p66Var.setGravity(17);
        p66Var.setLineSpacing(hl.L(2.0f), 1.0f);
        yob.G(p66Var, aob.Xc, vnbVar);
        p66Var.setDisablePaddingsOffsetY(true);
        gtaVar.addView(p66Var, tre.t(-2, -2, 1, 4, -2, 4, 16));
        p66Var.setVisibility(8);
        hjb hjbVar = new hjb(context, vnbVar);
        this.d2 = hjbVar;
        gtaVar.addView(hjbVar, tre.k(0.0f, 0.0f, 0.0f, 12.0f, -1, -2));
        p66 p66Var2 = new p66(context, vnbVar);
        this.e2 = p66Var2;
        yob.X(p66Var2, i5, vnbVar);
        p66Var2.setTextSize(1, 12.0f);
        p66Var2.setGravity(17);
        p66Var2.setLineSpacing(hl.L(2.0f), 1.0f);
        yob.G(p66Var2, i4, vnbVar);
        p66Var2.setDisablePaddingsOffsetY(true);
        p66Var2.setPadding(hl.L(5.0f), 0, hl.L(5.0f), 0);
        gtaVar.addView(p66Var2, tre.t(-2, -2, 1, 4, 2, 4, 8));
        p66Var2.setVisibility(8);
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.t2 = linearLayout2;
        linearLayout2.setPadding(hl.L(12.0f), hl.L(8.0f), hl.L(12.0f), hl.L(8.0f));
        linearLayout2.setOrientation(0);
        int i6 = aob.i6;
        hf0 Y = aob.Y(aob.v0(i6, vnbVar), 21, 21);
        uob M = yob.M(i6);
        linearLayout2.setBackground(Y);
        yob.j(linearLayout2, Y, null, M, vnbVar);
        og2 og2Var = new og2(24, vnbVar, context);
        this.u2 = og2Var;
        int i7 = aob.h7;
        int i8 = aob.j7;
        int i9 = aob.k7;
        og2Var.b(i7, i8, i9);
        og2Var.setDrawUnchecked(true);
        og2Var.a(false, false);
        og2Var.setDrawBackgroundAsArc(10);
        linearLayout2.addView(og2Var, tre.t(26, 26, 16, 0, 0, 0, 0));
        TextView textView3 = new TextView(context);
        int i10 = aob.j5;
        yob.X(textView3, i10, vnbVar);
        bs2.r(14.0f, 1, 2131750350, textView3, null);
        linearLayout2.addView(textView3, tre.t(-2, -2, 16, 9, 0, 0, 0));
        gtaVar.addView(linearLayout2, tre.t(-2, -2, 1, 0, -4, 0, 4));
        iye.b(linearLayout2, 0.025f, 1.5f);
        linearLayout2.setOnClickListener(new hra(this, (byte) 21));
        linearLayout2.setVisibility(8);
        gta gtaVar2 = new gta(this, context, (byte) 1);
        this.n2 = gtaVar2;
        gtaVar2.setOrientation(1);
        gtaVar2.setPadding(hl.L(4.0f) + this.u0, hl.L(24.0f), hl.L(4.0f) + this.u0, hl.L(66.0f));
        jo0Var.addView(gtaVar2, tre.e(-1, -1, 55));
        this.o2 = r6;
        bc bcVar = new bc(vnbVar, context, false);
        bcVar.a(2131231825, ob6.M0(2131749811, null), ob6.M0(2131749346, null));
        gtaVar2.addView(r6[0], tre.o(-1, -2));
        bc bcVar2 = new bc(vnbVar, context, false);
        bcVar2.a(2131231821, ob6.M0(2131749805, null), ob6.M0(2131749344, null));
        gtaVar2.addView(r6[1], tre.o(-1, -2));
        bc bcVar3 = new bc(vnbVar, context, false);
        bc[] bcVarArr = {bcVar, bcVar2, bcVar3};
        bcVar3.a(2131231928, ob6.M0(2131749341, null), ob6.M0(2131749342, null));
        gtaVar2.addView(bcVarArr[2], tre.o(-1, -2));
        View view3 = new View(context);
        this.p2 = view3;
        int i11 = aob.d7;
        yob.h(i11, vnbVar, view3);
        gtaVar2.addView(view3, tre.n(1.0f / hl.p, -2, 7, 17, -4, 17, 6));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.q2 = linearLayout3;
        linearLayout3.setPadding(hl.L(12.0f), hl.L(8.0f), hl.L(12.0f), hl.L(8.0f));
        linearLayout3.setOrientation(0);
        hf0 Y2 = aob.Y(aob.v0(i6, vnbVar), 6, 6);
        uob M2 = yob.M(i6);
        linearLayout3.setBackground(Y2);
        yob.j(linearLayout3, Y2, null, M2, vnbVar);
        og2 og2Var2 = new og2(24, vnbVar, context);
        this.r2 = og2Var2;
        og2Var2.b(i7, i8, i9);
        og2Var2.setDrawUnchecked(true);
        og2Var2.a(false, false);
        og2Var2.setDrawBackgroundAsArc(10);
        linearLayout3.addView(og2Var2, tre.t(26, 26, 16, 0, 0, 0, 0));
        TextView textView4 = new TextView(context);
        this.s2 = textView4;
        yob.X(textView4, i10, vnbVar);
        bs2.r(14.0f, 1, 2131750358, textView4, null);
        linearLayout3.addView(textView4, tre.t(-2, -2, 16, 9, 0, 0, 0));
        gtaVar2.addView(linearLayout3, tre.t(-2, -2, 1, 0, 0, 0, 4));
        iye.b(linearLayout3, 0.025f, 1.5f);
        gta gtaVar3 = new gta(this, context, (byte) 2);
        this.w2 = gtaVar3;
        gtaVar3.setOrientation(1);
        gtaVar3.setPadding(hl.L(4.0f) + this.u0, hl.L(20.0f), hl.L(4.0f) + this.u0, hl.L(66.0f));
        jo0Var.addView(gtaVar3, tre.e(-1, -1, 55));
        TextView textView5 = new TextView(context);
        this.x2 = textView5;
        yob.X(textView5, i10, vnbVar);
        textView5.setTextSize(1, 20.0f);
        textView5.setGravity(17);
        textView5.setTypeface(hl.o());
        gtaVar3.addView(textView5, tre.t(-1, -2, 7, 20, 0, 20, 0));
        TextView textView6 = new TextView(context);
        yob.X(textView6, i10, vnbVar);
        textView6.setTextSize(1, 14.0f);
        uh9.q(textView6, 17, null, 2131749780);
        gtaVar3.addView(textView6, tre.t(-1, -2, 7, 20, 6, 20, 24));
        bc bcVar4 = new bc(vnbVar, context, false);
        bcVar4.a(2131231825, ob6.M0(2131749786, null), ob6.M0(2131749787, null));
        gtaVar3.addView(r6[0], tre.o(-1, -2));
        bc bcVar5 = new bc(vnbVar, context, false);
        bcVar5.a(2131231803, ob6.M0(2131749784, null), ob6.M0(2131749785, null));
        gtaVar3.addView(r6[1], tre.o(-1, -2));
        bc bcVar6 = new bc(vnbVar, context, false);
        bc[] bcVarArr2 = {bcVar4, bcVar5, bcVar6};
        bcVar6.a(2131231915, ob6.M0(2131749782, null), ob6.M0(2131749783, null));
        gtaVar3.addView(bcVarArr2[2], tre.o(-1, -2));
        gta gtaVar4 = new gta(this, context, (byte) 3);
        this.y2 = gtaVar4;
        gtaVar4.setOrientation(1);
        gtaVar4.setPadding(hl.L(4.0f) + this.u0, hl.L(10.0f), hl.L(4.0f) + this.u0, hl.L(92.0f));
        jo0Var.addView(gtaVar4, tre.e(-1, -1, 55));
        bc bcVar7 = new bc(vnbVar, context, false);
        bcVar7.a(2131231825, ob6.M0(2131749731, null), ob6.M0(2131749732, null));
        gtaVar4.addView(r7[0], tre.o(-1, -2));
        bc bcVar8 = new bc(vnbVar, context, false);
        bcVar8.a(2131231877, ob6.M0(2131749729, null), ob6.M0(2131749730, null));
        gtaVar4.addView(r7[1], tre.o(-1, -2));
        bc bcVar9 = new bc(vnbVar, context, false);
        bc[] bcVarArr3 = {bcVar7, bcVar8, bcVar9};
        bcVar9.a(2131231799, ob6.M0(2131749727, null), ob6.M0(2131749728, null));
        gtaVar4.addView(bcVarArr3[2], tre.o(-1, -2));
        gtaVar.setAlpha(1.0f);
        gtaVar2.setAlpha(0.0f);
        gtaVar3.setAlpha(0.0f);
        gtaVar4.setAlpha(0.0f);
        sua suaVar = new sua(context, vnbVar, new jra(this, (byte) 16), new hra(this, (byte) 22), new hra(this, (byte) 23), new hra(this, (byte) 24), new hra(this, (byte) 25), new hra(this, (byte) 26), new hra(this, (byte) 27), new hra(this, (byte) 28));
        this.a2 = suaVar;
        suaVar.N.c.setOnClickListener(new hra(this, (byte) 19));
        int i12 = this.u0;
        suaVar.setPadding(i12, 0, i12, 0);
        jo0Var.addView(suaVar, tre.e(-1, -2, 55));
        as asVar = this.m1;
        this.J1 = true;
        asVar.j1(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.g2 = frameLayout;
        yob.h(i2, vnbVar, frameLayout);
        View view4 = new View(context);
        this.j2 = view4;
        yob.h(i11, vnbVar, view4);
        view4.setAlpha(0.0f);
        frameLayout.addView(view4, tre.a(-1.0f, 1.0f / hl.p, 55));
        c51 i13 = xnb.i(24, vnbVar, context, true);
        this.f2 = i13;
        i13.i(ob6.M0(2131747558, null), false, true);
        i13.g(null, false);
        FrameLayout.LayoutParams d = tre.d(-1, 48.0f, 119, 0.0f, 12.0f, 0.0f, 12.0f);
        d.leftMargin = hl.L(14.0f) + this.u0;
        d.rightMargin = hl.L(14.0f) + this.u0;
        frameLayout.addView(i13, d);
        jo0Var.addView(frameLayout, tre.e(-1, 72, 87));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.i2 = frameLayout2;
        yob.h(i2, vnbVar, frameLayout2);
        p66 p66Var3 = new p66(context, null);
        this.h2 = p66Var3;
        p66Var3.setTextSize(1, 12.0f);
        yob.X(p66Var3, i4, vnbVar);
        yob.G(p66Var3, i4, vnbVar);
        p66Var3.setGravity(17);
        frameLayout2.addView(p66Var3, tre.d(-1, -2.0f, 17, 16.0f, 8.0f, 16.0f, 14.0f));
        jo0Var.addView(frameLayout2, tre.e(-1, -2, 87));
        frameLayout2.setVisibility(8);
        this.n1.setOnScrollListener(new e98(this, (byte) 25));
        linearLayout3.setOnClickListener(new hra(this, (byte) 20));
        tj4 tj4Var = new tj4(context);
        this.V1 = tj4Var;
        jo0Var.addView(tj4Var, tre.c(-1.0f, -1));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.k2 = frameLayout3;
        frameLayout3.setPadding(hl.L(6.0f) + this.u0, 0, hl.L(6.0f) + this.u0, 0);
        jo0Var.addView(frameLayout3, tre.d(-1, 200.0f, 87, 0.0f, 0.0f, 0.0f, 60.0f));
        hl.B2(this.o1);
        jo0Var.addView(this.o1, tre.d(-1, -2.0f, 0, 6.0f, 0.0f, 6.0f, 0.0f));
        hta htaVar = new hta(context);
        this.Z1 = htaVar;
        jo0Var.addView(htaVar, tre.e(-1, -2, 55));
        ArrayList arrayList = new ArrayList();
        if (view != null) {
            arrayList.add(view);
        }
        hl.k2(new sh9(htaVar, (byte) 8), 12.0f, 12, arrayList);
    }

    public static String A1(TL_stars.StarGiftAttributeRarity starGiftAttributeRarity, Integer[] numArr) {
        if (starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarityUncommon) {
            numArr[0] = -12539616;
            return ob6.M0(2131749408, null);
        } else if (starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarityRare) {
            numArr[0] = -15619394;
            return ob6.M0(2131749409, null);
        } else if (starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarityEpic) {
            numArr[0] = -6988581;
            return ob6.M0(2131749411, null);
        } else if (starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarityLegendary) {
            numArr[0] = -4229632;
            return ob6.M0(2131749410, null);
        } else if (starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarity) {
            int i = ((TL_stars.TL_starGiftAttributeRarity) starGiftAttributeRarity).permille;
            if (i <= 0) {
                return "<0.1%";
            }
            return cc.J0(i);
        } else {
            return "";
        }
    }

    public static boolean E1(int i, TL_stars.StarGift starGift) {
        if (it7.n(starGift)) {
            hr hrVar = uc7.s1(i).l4;
            if (!hrVar.v0.f) {
                return true;
            }
            if (((TL_stars.TL_starGiftUnique) starGift).fixed_sale) {
                return false;
            }
            return !hrVar.s.f;
        }
        return false;
    }

    public static boolean G1(int i, long j) {
        if (j >= 0) {
            if (yac.h(i).e() == j) {
                return true;
            }
            return false;
        }
        return xc2.w(5, uc7.s1(i).M0(Long.valueOf(-j)));
    }

    public static boolean H1(int i, long j) {
        if (j >= 0) {
            if (yac.h(i).e() != j) {
                return false;
            }
            return true;
        }
        TLRPC.Chat M0 = uc7.s1(i).M0(Long.valueOf(-j));
        if (M0 == null || !M0.creator) {
            return false;
        }
        return true;
    }

    public static boolean J1(int i, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        if (tL_starGiftUnique == null) {
            return false;
        }
        TLRPC.Peer peer = tL_starGiftUnique.owner_id;
        if (peer == null) {
            peer = tL_starGiftUnique.host_id;
        }
        long n = wf3.n(peer);
        int i2 = (n > 0L ? 1 : (n == 0L ? 0 : -1));
        if (i2 == 0) {
            return false;
        }
        if (i2 > 0) {
            TLRPC.User X1 = uc7.s1(i).X1(Long.valueOf(n));
            if (X1 != null) {
                TLRPC.EmojiStatus emojiStatus = X1.emoji_status;
                if (!(emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) || ((TLRPC.TL_emojiStatusCollectible) emojiStatus).collectible_id != tL_starGiftUnique.id) {
                    return false;
                }
                return true;
            }
        } else {
            TLRPC.Chat M0 = uc7.s1(i).M0(Long.valueOf(-n));
            if (M0 != null) {
                TLRPC.EmojiStatus emojiStatus2 = M0.emoji_status;
                if ((emojiStatus2 instanceof TLRPC.TL_emojiStatusCollectible) && ((TLRPC.TL_emojiStatusCollectible) emojiStatus2).collectible_id == tL_starGiftUnique.id) {
                    return true;
                }
            }
        }
        return false;
    }

    public static TableRow Z0(hjb hjbVar, String str, String str2, vnb vnbVar) {
        String str3;
        if (!WalletEngine2.isValidAddress(str2)) {
            return hjbVar.f(str, str2, null, null);
        }
        float L = hl.L(14.0f);
        TextView ctaVar = new cta(hjbVar.getContext(), L);
        ctaVar.setTypeface(hl.n1("fonts/rmono.ttf"));
        int i = 0;
        ctaVar.setTextSize(0, L);
        ctaVar.setLineSpacing(hl.L(2.0f), 1.0f);
        yob.X(ctaVar, aob.G6, vnbVar);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i2 = 0;
        while (i < str2.length()) {
            int i3 = i2 / 4;
            int i4 = i2 % 4;
            if (i2 > 0) {
                if (i4 == 0) {
                    str3 = "\n";
                } else {
                    str3 = " ";
                }
                spannableStringBuilder.append((CharSequence) str3);
            }
            int length = spannableStringBuilder.length();
            int i5 = i + 4;
            spannableStringBuilder.append((CharSequence) str2, i, Math.min(str2.length(), i5));
            if (((i3 + i4) & 1) == 1) {
                spannableStringBuilder.setSpan(new ho4(aob.y6, vnbVar), length, spannableStringBuilder.length(), 33);
            }
            i2++;
            i = i5;
        }
        ctaVar.setText(spannableStringBuilder);
        return hjbVar.c(ctaVar, str);
    }

    public static void a1(hjb hjbVar, TL_stars.StarGiftAttribute starGiftAttribute) {
        String M0;
        if (starGiftAttribute instanceof TL_stars.starGiftAttributeModel) {
            M0 = ob6.M0(2131750348, null);
        } else if (starGiftAttribute instanceof TL_stars.starGiftAttributePattern) {
            M0 = ob6.M0(2131750341, null);
        } else if (starGiftAttribute instanceof TL_stars.starGiftAttributeBackdrop) {
            M0 = ob6.M0(2131750349, null);
        } else {
            return;
        }
        String str = M0;
        Integer[] numArr = new Integer[1];
        hjbVar.e(str, starGiftAttribute.name, A1(starGiftAttribute.rarity, numArr), null, numArr[0]);
    }

    public static void h2(e eVar) {
        e S = LaunchActivity.S();
        if (S == 0) {
            return;
        }
        ?? obj = new Object();
        obj.a = true;
        S.showAsSheet(eVar, obj);
    }

    public static SpannableStringBuilder k2(String str) {
        int i;
        int i2;
        int indexOf = str.indexOf("**");
        int indexOf2 = str.indexOf("**", indexOf + 1);
        String replace = str.replace("**", "");
        if (indexOf >= 0 && indexOf2 >= 0 && (i2 = indexOf2 - indexOf) > 2) {
            i = i2 - 2;
        } else {
            indexOf = -1;
            i = 0;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(replace);
        if (indexOf >= 0) {
            spannableStringBuilder.setSpan(new f92((byte) 1), indexOf, i + indexOf, 0);
        }
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder l2(String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        SpannableString spannableString = new SpannableString("👌");
        spannableString.setSpan(new wm2(2131231182, 0), 0, spannableString.length(), 33);
        SpannableString spannableString2 = new SpannableString("👍");
        spannableString2.setSpan(new wm2(2131231166, 0), 0, spannableString2.length(), 33);
        hl.I2(spannableStringBuilder, spannableString, "👌");
        hl.I2(spannableStringBuilder, spannableString2, "👍");
        return spannableStringBuilder;
    }

    public static boolean n1(TL_stars.SavedStarGift savedStarGift, TL_stars.SavedStarGift savedStarGift2) {
        if (savedStarGift != savedStarGift2) {
            if (savedStarGift != null) {
                TL_stars.StarGift starGift = savedStarGift.gift;
                TL_stars.StarGift starGift2 = savedStarGift2.gift;
                if (starGift != starGift2) {
                    if ((starGift instanceof TL_stars.TL_starGiftUnique) && (starGift2 instanceof TL_stars.TL_starGiftUnique)) {
                        if (starGift.id == starGift2.id) {
                            return true;
                        }
                        return false;
                    } else if ((starGift instanceof TL_stars.TL_starGift) && (starGift2 instanceof TL_stars.TL_starGift) && starGift.id == starGift2.id && savedStarGift.date == savedStarGift2.date) {
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

    public static boolean o1(TL_stars.TL_starGiftUnique tL_starGiftUnique, TL_stars.TL_starGiftUnique tL_starGiftUnique2) {
        if (tL_starGiftUnique != tL_starGiftUnique2) {
            if (tL_starGiftUnique != null) {
                if (tL_starGiftUnique.id == tL_starGiftUnique2.id || TextUtils.equals(tL_starGiftUnique.slug, tL_starGiftUnique2.slug)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public static String p1(int i) {
        FastDateFormat r0;
        Date date = new Date(i * 1000);
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar.setTime(date);
        ob6 D0 = ob6.D0();
        if (calendar.get(1) == calendar2.get(1)) {
            r0 = D0.p0();
        } else {
            r0 = D0.r0();
        }
        return ob6.a0(null, null, 2131742414, r0.format(date), D0.o0().format(date));
    }

    public static String u1(TL_stars.StarGift starGift) {
        if (starGift instanceof TL_stars.TL_starGiftUnique) {
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
            StringBuilder sb = new StringBuilder();
            sb.append(tL_starGiftUnique.title);
            sb.append(" #");
            return qu6.m(tL_starGiftUnique.num, ',', sb);
        } else if ((starGift instanceof TL_stars.TL_starGift) && !TextUtils.isEmpty(starGift.title)) {
            return starGift.title;
        } else {
            return ob6.M0(2131750151, null);
        }
    }

    public final void A2(int r13, boolean r14, defpackage.q38 r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wua.A2(int, boolean, q38):void");
    }

    public final TL_stars.TL_starGiftUnique B1() {
        TL_stars.StarGift s1 = s1();
        if (s1 instanceof TL_stars.TL_starGiftUnique) {
            return (TL_stars.TL_starGiftUnique) s1;
        }
        return null;
    }

    public final void B2(boolean z) {
        boolean z2;
        int i;
        int i2;
        TL_stars.TL_starGiftUnique B1 = B1();
        if (B1 == null) {
            return;
        }
        uc7.e1().edit().putInt("statusgiftpage", 3).apply();
        boolean J1 = J1(this.a, B1());
        boolean z3 = !J1;
        boolean J12 = J1(this.a, B1());
        c51 c51Var = this.f2;
        if (J12) {
            uc7.s1(this.a).u5(r1(), new TLRPC.TL_emojiStatusEmpty(), null);
            z2 = z3;
        } else {
            z2 = z3;
            long r1 = r1();
            if (r1 >= 0) {
                if (!yac.h(this.a).p()) {
                    v21 P = j().P(2131624211, hl.N2(ob6.M0(2131750384, null), -1, 2, new jra(this, (byte) 6), null));
                    P.u = true;
                    P.j();
                    return;
                }
            } else if (!z) {
                uc7 s1 = uc7.s1(this.a);
                c51Var.setLoading(true);
                uc7.s1(this.a).G0().a(r1, new p4c(this, s1, r1, (byte) 8));
                return;
            }
            TLRPC.TL_inputEmojiStatusCollectible tL_inputEmojiStatusCollectible = new TLRPC.TL_inputEmojiStatusCollectible();
            tL_inputEmojiStatusCollectible.collectible_id = B1.id;
            uc7.s1(this.a).u5(r1(), tL_inputEmojiStatusCollectible, B1);
        }
        iy9 iy9Var = this.a2.J[1];
        if (!J1) {
            i = 2131231104;
            i2 = 2131750383;
        } else {
            i = 2131231105;
            i2 = 2131750386;
        }
        iy9Var.a(i, ob6.M0(i2, null), true);
        if (this.v2) {
            dismiss();
            return;
        }
        q38 q38Var = new q38((byte) 18, this, z2);
        if (this.W2.c(0)) {
            q38Var.run();
        } else {
            A2(0, true, q38Var);
        }
        c51Var.i(ob6.M0(2131747558, null), !this.Z2, true);
        c51Var.g(null, !this.Z2);
        c51Var.setOnClickListener(new hra(this, (byte) 13));
    }

    public final boolean C1(boolean z) {
        if (y1(z) == null && z1(z) == null) {
            return false;
        }
        return true;
    }

    public final void C2() {
        FrameLayout frameLayout = this.i2;
        int visibility = frameLayout.getVisibility();
        FrameLayout frameLayout2 = this.k2;
        FrameLayout frameLayout3 = this.g2;
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

    @Override
    public final boolean D() {
        if (this.W2.c(4)) {
            boolean z = this.a2.N.i0;
        }
        return false;
    }

    public final void D1(byte[] bArr, TwoStepVerificationActivity twoStepVerificationActivity, boolean z, s45 s45Var) {
        TL_stars.getStarGiftWithdrawalUrl getstargiftwithdrawalurl;
        TL_stars.InputSavedStarGift v1 = v1();
        if (v1 == null) {
            if (s45Var != null) {
                s45Var.a(Boolean.FALSE);
                return;
            }
            return;
        }
        if (z) {
            TL_stars.withdrawStarGift withdrawstargift = new TL_stars.withdrawStarGift();
            withdrawstargift.keep_on_profile = this.v3;
            withdrawstargift.stargift = v1;
            withdrawstargift.tmp_password = bArr;
            getstargiftwithdrawalurl = withdrawstargift;
        } else {
            TL_stars.getStarGiftWithdrawalUrl getstargiftwithdrawalurl2 = new TL_stars.getStarGiftWithdrawalUrl();
            getstargiftwithdrawalurl2.stargift = v1;
            getstargiftwithdrawalurl2.tmp_password = bArr;
            getstargiftwithdrawalurl = getstargiftwithdrawalurl2;
        }
        ConnectionsManager.getInstance(this.a).sendRequest(getstargiftwithdrawalurl, new si1(this, s45Var, twoStepVerificationActivity, z));
    }

    public final void D2() {
        boolean C1 = C1(false);
        fta ftaVar = this.U1;
        ftaVar.setPosition(C1 ? 1 : 0);
        ftaVar.E(false);
        if (this.B2 != null && !C1(true) && this.B2.e() < this.B2.c()) {
            this.B2.a();
        }
    }

    @Override
    public final boolean E() {
        if (this.W2.c(4) && this.a2.N.i0) {
            return false;
        }
        return this.d0;
    }

    public final void E2() {
        TL_stars.TL_starGiftUnique B1 = B1();
        TL_wallet.nftItem nftitem = this.a3;
        LinearLayout linearLayout = this.t2;
        if (nftitem != null && B1 != null) {
            this.c2.setVisibility(8);
            this.e2.setVisibility(8);
            boolean z = false;
            linearLayout.setVisibility(0);
            if (B1.host_id != null) {
                z = true;
            }
            this.u2.a(z, linearLayout.isAttachedToWindow());
            return;
        }
        linearLayout.setVisibility(8);
    }

    @Override
    public final boolean F(MotionEvent motionEvent) {
        if (this.W2.c(4)) {
            boolean z = this.a2.N.i0;
        }
        return false;
    }

    public final boolean F1(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        if (tL_starGiftUnique != null && !TextUtils.isEmpty(tL_starGiftUnique.owner_address)) {
            c C = c.C(this.a);
            String x = C.x();
            if (TextUtils.isEmpty(x)) {
                TLRPC.Peer peer = tL_starGiftUnique.host_id;
                if (peer == null || wf3.n(peer) != yac.h(this.a).e()) {
                    return false;
                }
                return true;
            } else if (c.b(tL_starGiftUnique.owner_address, x) || C.A().c(tL_starGiftUnique.gift_address)) {
                return true;
            }
        }
        return false;
    }

    public final TL_wallet.nftItem F2() {
        TL_wallet.nftItem nftitem = this.a3;
        if (nftitem != null) {
            return nftitem;
        }
        TL_stars.TL_starGiftUnique B1 = B1();
        if (y2(B1)) {
            c C = c.C(this.a);
            if (B1 != null && !TextUtils.isEmpty(B1.gift_address)) {
                ArrayList arrayList = C.A().b;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    TL_wallet.nftItem nftitem2 = (TL_wallet.nftItem) obj;
                    if (c.b(nftitem2.address, B1.gift_address)) {
                        return nftitem2;
                    }
                }
                TL_wallet.nftItem nftitem3 = new TL_wallet.nftItem();
                nftitem3.address = B1.gift_address;
                nftitem3.owner_address = C.x();
                nftitem3.index = "";
                nftitem3.name = B1.title + " #" + B1.num;
                nftitem3.gift = B1;
                return nftitem3;
            }
            return null;
        }
        return null;
    }

    @Override
    public final c79 H0(d79 d79Var) {
        ox0 ox0Var = new ox0(this, (byte) 10);
        this.O2 = ox0Var;
        return ox0Var;
    }

    public final boolean I1(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        if (ik8.A(tL_starGiftUnique) && it7.n(tL_starGiftUnique)) {
            if (!tL_starGiftUnique.my_sale && this.a3 == null) {
                TLRPC.Peer peer = tL_starGiftUnique.host_id;
                if (peer == null || wf3.n(peer) != yac.h(this.a).e()) {
                    if (!TextUtils.isEmpty(tL_starGiftUnique.owner_address) && c.b(tL_starGiftUnique.owner_address, c.C(this.a).x())) {
                        return true;
                    }
                    return false;
                }
                return true;
            }
            return true;
        }
        return false;
    }

    @Override
    public final int J0() {
        return hl.L(12.0f);
    }

    @Override
    public final CharSequence K0() {
        return this.Q2;
    }

    public final void K1(TL_stars.TL_payments_uniqueStarGift tL_payments_uniqueStarGift) {
        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) tL_payments_uniqueStarGift.gift;
        this.E2 = tL_starGiftUnique;
        p2(tL_starGiftUnique, false, null, null);
        super.show();
    }

    public final void L1(id idVar, r47 r47Var) {
        idVar.dismiss();
        this.H2 = true;
        m2(r47Var, null);
        super.show();
    }

    public final void M1(id idVar, TL_stars.SavedStarGift savedStarGift) {
        if (savedStarGift != null) {
            idVar.dismiss();
            this.J2 = true;
            o2(savedStarGift, null);
            super.show();
            return;
        }
        idVar.dismiss();
        e S = LaunchActivity.S();
        if (S != null) {
            v21 Q = d31.b0(S).Q(2131624012, 36, ob6.M0(2131748306, null));
            Q.u = true;
            Q.j();
        }
    }

    public final void N1() {
        pj pjVar;
        TL_stars.TL_starGiftUnique B1 = B1();
        c51 c51Var = this.f2;
        if (!c51Var.R && B1 != null && !E1(this.a, B1) && !I1(B1)) {
            boolean n = it7.n(B1);
            TL_stars.TL_starGiftUnique tL_starGiftUnique = this.E2;
            long j = this.S1;
            if (n) {
                if (tL_starGiftUnique == null || !this.F2 || j == 0) {
                    j = yac.h(this.a).e();
                }
                long j2 = j;
                if (this.E2 != null && this.F2 && j2 != yac.h(this.a).e()) {
                    hw4 hw4Var = new hw4(getContext(), this.J0, B1, j2);
                    hw4Var.E1 = new jn1(this, hw4Var, B1, j2, (byte) 8);
                    hw4Var.show();
                    return;
                }
                e1(B1, j2, null, true, null);
                return;
            }
            if (tL_starGiftUnique == null || !this.F2 || j == 0) {
                j = yac.h(this.a).e();
            }
            long j3 = j;
            if (B1.resale_ton_only) {
                pjVar = pj.b;
            } else {
                pjVar = pj.a;
            }
            pj pjVar2 = pjVar;
            if (this.E2 != null && this.F2 && j3 != yac.h(this.a).e()) {
                hw4 hw4Var2 = new hw4(getContext(), this.J0, B1, j3);
                hw4Var2.E1 = new oo1(this, hw4Var2, B1, j3, pjVar2, (byte) 3);
                hw4Var2.show();
                return;
            }
            c51Var.setLoading(true);
            jxa.u(this.a, pjVar2).E(B1, j3, null, true, new pra(this, null, pjVar2, B1, j3, null, true));
        }
    }

    public final void O1() {
        zsa zsaVar = this.U2;
        if (zsaVar != null && !zsaVar.J) {
            zsaVar.dismiss();
        }
        String w1 = w1();
        zsa zsaVar2 = new zsa(this, getContext(), w1, w1, this.J0);
        this.U2 = zsaVar2;
        zsaVar2.n2 = new pq8(this, (byte) 17);
        zsaVar2.show();
    }

    public final void P1() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wua.P1():void");
    }

    public final void Q1(TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, boolean z) {
        int i;
        int i2;
        int L;
        int i3;
        int i4;
        int L2;
        int i5;
        int i6;
        int i7;
        if (getContext() == null) {
            return;
        }
        if (tL_error == null) {
            if (twoStepVerificationActivity != null) {
                twoStepVerificationActivity.s0();
            }
            d31.c0("NULL_ERROR");
        } else if (!"PASSWORD_MISSING".equals(tL_error.text) && !tL_error.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error.text.startsWith("SESSION_TOO_FRESH_")) {
            if ("SRP_ID_INVALID".equals(tL_error.text)) {
                ConnectionsManager.getInstance(this.a).sendRequest(new TL_account.getPassword(), new qsa(this, twoStepVerificationActivity, z, (byte) 1), 8);
                return;
            }
            if (twoStepVerificationActivity != null) {
                twoStepVerificationActivity.s0();
                twoStepVerificationActivity.finishFragment();
            }
            if (z && ("WALLET_CREATING".equals(tL_error.text) || "WALLET_UNAVAILABLE".equals(tL_error.text))) {
                it7.t(getContext(), this.a, this.J0, null, tL_error.text, null);
                return;
            }
            String str = tL_error.text;
            if (str != null && str.startsWith("FLOOD_WAIT")) {
                xnb.x(null, 2131750647, d31.Y(), null);
            } else {
                d31.e0(tL_error);
            }
        } else {
            if (twoStepVerificationActivity != null) {
                twoStepVerificationActivity.s0();
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
            String M0 = ob6.M0(2131749846, null);
            id idVar = alertDialog$Builder.a;
            idVar.S = M0;
            LinearLayout linearLayout = new LinearLayout(getContext());
            linearLayout.setPadding(hl.L(24.0f), hl.L(2.0f), hl.L(24.0f), 0);
            linearLayout.setOrientation(1);
            alertDialog$Builder.n(linearLayout);
            TextView textView = new TextView(getContext());
            int i8 = aob.j5;
            yob.X(textView, i8, null);
            textView.setTextSize(1, 16.0f);
            if (ob6.a0) {
                i = 5;
            } else {
                i = 3;
            }
            textView.setGravity(i | 48);
            textView.setText(hl.S2(ob6.M0(2131749850, null)));
            linearLayout.addView(textView, tre.o(-1, -2));
            LinearLayout linearLayout2 = new LinearLayout(getContext());
            linearLayout2.setOrientation(0);
            linearLayout.addView(linearLayout2, tre.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
            ImageView imageView = new ImageView(getContext());
            imageView.setImageResource(2131231627);
            if (ob6.a0) {
                i2 = hl.L(11.0f);
            } else {
                i2 = 0;
            }
            int L3 = hl.L(9.0f);
            if (ob6.a0) {
                L = 0;
            } else {
                L = hl.L(11.0f);
            }
            imageView.setPadding(i2, L3, L, 0);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            yob.s(imageView, i8, null, mode);
            TextView textView2 = new TextView(getContext());
            yob.X(textView2, i8, null);
            textView2.setTextSize(1, 16.0f);
            if (ob6.a0) {
                i3 = 5;
            } else {
                i3 = 3;
            }
            textView2.setGravity(i3 | 48);
            textView2.setText(hl.S2(ob6.M0(2131749849, null)));
            if (ob6.a0) {
                linearLayout2.addView(textView2, tre.o(-1, -2));
                linearLayout2.addView(imageView, tre.r(-2, -2, 5));
            } else {
                linearLayout2.addView(imageView, tre.o(-2, -2));
                linearLayout2.addView(textView2, tre.o(-1, -2));
            }
            LinearLayout linearLayout3 = new LinearLayout(getContext());
            linearLayout3.setOrientation(0);
            linearLayout.addView(linearLayout3, tre.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
            ImageView imageView2 = new ImageView(getContext());
            imageView2.setImageResource(2131231627);
            if (ob6.a0) {
                i4 = hl.L(11.0f);
            } else {
                i4 = 0;
            }
            int L4 = hl.L(9.0f);
            if (ob6.a0) {
                L2 = 0;
            } else {
                L2 = hl.L(11.0f);
            }
            imageView2.setPadding(i4, L4, L2, 0);
            yob.s(imageView2, i8, null, mode);
            TextView textView3 = new TextView(getContext());
            yob.X(textView3, i8, null);
            textView3.setTextSize(1, 16.0f);
            if (ob6.a0) {
                i5 = 5;
            } else {
                i5 = 3;
            }
            textView3.setGravity(i5 | 48);
            textView3.setText(hl.S2(ob6.M0(2131749848, null)));
            if (ob6.a0) {
                linearLayout3.addView(textView3, tre.o(-1, -2));
                i6 = 5;
                linearLayout3.addView(imageView2, tre.r(-2, -2, 5));
            } else {
                i6 = 5;
                linearLayout3.addView(imageView2, tre.o(-2, -2));
                linearLayout3.addView(textView3, tre.o(-1, -2));
            }
            if ("PASSWORD_MISSING".equals(tL_error.text)) {
                alertDialog$Builder.j(ob6.M0(2131749845, null), new vr9(this, (byte) 26));
                alertDialog$Builder.g(ob6.M0(2131752570, null), null);
            } else {
                TextView textView4 = new TextView(getContext());
                yob.X(textView4, i8, null);
                textView4.setTextSize(1, 16.0f);
                if (ob6.a0) {
                    i7 = i6;
                } else {
                    i7 = 3;
                }
                uh9.q(textView4, i7 | 48, null, 2131749847);
                linearLayout.addView(textView4, tre.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                alertDialog$Builder.g(ob6.M0(2131747558, null), null);
            }
            if (twoStepVerificationActivity != null) {
                twoStepVerificationActivity.showDialog(idVar);
            } else {
                alertDialog$Builder.o();
            }
        }
    }

    public final void R1() {
        TL_stars.TL_starGiftUnique B1 = B1();
        if (B1 == null) {
            return;
        }
        if (it7.y(B1)) {
            if (i1()) {
                W1();
                return;
            } else {
                it7.t(getContext(), this.a, this.J0, j(), "STARGIFT_ONCHAIN_SALE_DISABLED", Boolean.valueOf(B1.fixed_sale));
                return;
            }
        }
        nza.j1(getContext(), this.a, B1, new usa(this, B1, (byte) 2), this.J0);
    }

    public final void S1() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wua.S1():void");
    }

    public final void T1() {
        if (yac.h(this.a).p() && (J1(this.a, B1()) || this.T2)) {
            B2(false);
            return;
        }
        TL_stars.TL_starGiftUnique B1 = B1();
        if (B1 == null) {
            return;
        }
        TLRPC.Peer peer = B1.owner_id;
        if (peer == null) {
            peer = B1.host_id;
        }
        long n = wf3.n(peer);
        StringBuilder sb = new StringBuilder();
        sb.append(B1.title);
        sb.append(" #");
        this.x2.setText(ob6.a0(null, null, 2131749779, qu6.m(B1.num, ',', sb)));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(ob6.M0(2131749781, null));
        if (!yac.h(this.a).p()) {
            spannableStringBuilder.append((CharSequence) " l");
            wm2 wm2Var = this.S2;
            if (wm2Var == null) {
                wm2Var = new wm2(2131232248, 0);
                this.S2 = wm2Var;
            }
            spannableStringBuilder.setSpan(wm2Var, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        c51 c51Var = this.f2;
        c51Var.i(spannableStringBuilder, true, true);
        c51Var.g(null, true);
        c51Var.setOnClickListener(new hra(this, (byte) 8));
        this.a2.setWearPreview(uc7.s1(this.a).b2(n));
        A2(2, true, null);
    }

    public final void U1(boolean z) {
        int i;
        r47 r47Var = this.C2;
        int i2 = 0;
        if (r47Var != null) {
            TLRPC.Message message = r47Var.k;
            if (message != null) {
                TLRPC.MessageAction messageAction = message.action;
                if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                    i = ((TLRPC.TL_messageActionStarGiftUnique) messageAction).can_craft_at;
                }
            }
            i = 0;
        } else {
            TL_stars.SavedStarGift savedStarGift = this.A2;
            if (savedStarGift != null) {
                i = savedStarGift.can_craft_at;
            }
            i = 0;
        }
        if (i > ConnectionsManager.getInstance(this.a).getCurrentTime()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.J0, getContext());
            alertDialog$Builder.a.S = ob6.M0(2131749723, null);
            alertDialog$Builder.a.U = ob6.a0(null, null, 2131749724, ob6.x(i, true));
            c00.u(null, 2131747558, alertDialog$Builder, null);
            return;
        }
        TL_stars.TL_starGiftUnique B1 = B1();
        if (B1 == null) {
            return;
        }
        if (!TextUtils.isEmpty(B1.gift_address) && !uc7.s1(this.a).l4.y.f) {
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, this.J0, getContext());
            alertDialog$Builder2.a.S = ob6.M0(2131749738, null);
            alertDialog$Builder2.a.U = ob6.M0(2131749739, null);
            c00.u(null, 2131747558, alertDialog$Builder2, null);
            return;
        }
        if (z) {
            this.a2.N.a(this.a, B1.gift_id, B1.getDocument(), B1.title);
            if (g1()) {
                vta vtaVar = this.a2.N;
                TL_stars.TL_starGiftUnique B12 = B1();
                if (B12 == null) {
                    vtaVar.getClass();
                } else {
                    while (true) {
                        tta[] ttaVarArr = vtaVar.n;
                        if (i2 >= ttaVarArr.length) {
                            break;
                        }
                        tta ttaVar = ttaVarArr[i2];
                        TL_stars.StarGift starGift = ttaVar.h;
                        if (starGift == null) {
                            starGift = null;
                        }
                        if (starGift == null) {
                            ttaVar.a(B12, true);
                            break;
                        }
                        i2++;
                    }
                    vtaVar.d(true);
                }
            }
        }
        this.a2.N.setOnCraft(new ora(this, (byte) 1));
        if (this.R2 == null) {
            ld9 ld9Var = new ld9(this.a, B1.gift_id);
            this.R2 = ld9Var;
            ld9Var.a();
        }
        this.a2.N.setOnAddGift(new usa(this, B1, (byte) 1));
        this.a2.N.setOnClose(new ssa(this, (byte) 1));
        A2(4, true, null);
    }

    @Override
    public final boolean V0() {
        return false;
    }

    public final void V1(long j) {
        if (j > 0 && lbc.c(uc7.s1(this.a).Y1(j))) {
            j().Q(2131624012, 36, hl.S2(ob6.a0(null, null, 2131743397, wf3.s(j)))).k(false);
        } else {
            new yx4(getContext(), this.a, j, null, new mra(this, (byte) 0)).show();
        }
    }

    public final void W1() {
        TL_stars.TL_starGiftUnique B1 = B1();
        if (B1 != null && B1.fixed_sale) {
            if (!i1()) {
                return;
            }
            pt7 pt7Var = new pt7(this.a, this.J0, new sra(this, r5, B1, (byte) 1), getContext());
            pt7[] pt7VarArr = {pt7Var};
            pj pjVar = pj.b;
            long j = B1.getResellAmount(pjVar).b;
            pt7Var.u1 = true;
            pt7Var.v1 = j;
            pt7Var.r1.setText(ob6.M0(2131750223, null));
            if (j > 0) {
                String b = oj.j(j, pjVar).b();
                EditTextBoldCursor editTextBoldCursor = pt7Var.n1;
                InputFilter[] filters = editTextBoldCursor.getFilters();
                editTextBoldCursor.setFilters(new InputFilter[0]);
                pt7Var.w1 = true;
                editTextBoldCursor.setText(b);
                pt7Var.w1 = false;
                editTextBoldCursor.setFilters(filters);
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
            }
            pt7Var.E0(pt7Var.s1);
            pt7VarArr[0].show();
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.J0, getContext());
        String M0 = ob6.M0(2131750223, null);
        id idVar = alertDialog$Builder.a;
        idVar.S = M0;
        idVar.U = ob6.M0(2131749612, null);
        alertDialog$Builder.j(ob6.M0(2131750393, null), new yra(this, (byte) 0));
        alertDialog$Builder.g(ob6.M0(2131752570, null), null);
        alertDialog$Builder.o();
    }

    public final void X1() {
        boolean z;
        int i;
        TL_stars.TL_starGiftUnique B1 = B1();
        if (!i1()) {
            return;
        }
        pt7[] pt7VarArr = {new pt7(this.a, this.J0, new sra(this, pt7VarArr, B1, (byte) 0), getContext())};
        hr hrVar = uc7.s1(this.a).l4;
        pt7 pt7Var = pt7VarArr[0];
        if (B1 != null && B1.onchain_sale) {
            z = B1.fixed_sale;
        } else {
            z = hrVar.t.f;
        }
        pt7Var.x1 = z;
        if (!pt7Var.u1) {
            TextView textView = pt7Var.r1;
            if (z) {
                i = 2131749490;
            } else {
                i = 2131749477;
            }
            textView.setText(ob6.M0(i, null));
        }
        pt7Var.E0(pt7Var.s1);
        pt7VarArr[0].show();
    }

    public final void Y1() {
        TL_stars.TL_starGiftUnique B1 = B1();
        if (i1()) {
            Context context = getContext();
            int i = this.a;
            vnb vnbVar = this.J0;
            c51 c51Var = this.f2;
            Objects.requireNonNull(c51Var);
            ji7 ji7Var = new ji7(c51Var, (byte) 7);
            d31 j = j();
            jra jraVar = new jra(this, (byte) 7);
            HashMap hashMap = it7.a;
            if (B1 != null && !TextUtils.isEmpty(B1.slug)) {
                TL_stars.cancelStarGiftOnchainSale cancelstargiftonchainsale = new TL_stars.cancelStarGiftOnchainSale();
                cancelstargiftonchainsale.slug = B1.slug;
                it7.q(context, i, cancelstargiftonchainsale, Boolean.valueOf(B1.fixed_sale), vnbVar, ji7Var, j, new b55(B1, context, i, vnbVar, it7.i(B1), jraVar));
            }
        }
    }

    public final void Z1(long j) {
        kg5 kg5Var = this.w3;
        if (kg5Var != null) {
            kg5Var.f(true);
            this.w3 = null;
        }
        dismiss();
        e S = LaunchActivity.S();
        if (S != null && !lbc.C(j)) {
            Bundle bundle = new Bundle();
            if (j > 0) {
                bundle.putLong("user_id", j);
                if (j == yac.h(this.a).e()) {
                    bundle.putBoolean("my_profile", true);
                }
            } else {
                bundle.putLong("chat_id", -j);
            }
            bundle.putBoolean("open_gifts", true);
            S.presentFragment(new ProfileActivity(bundle, null));
        }
    }

    public final void a2(boolean z, l01 l01Var, Runnable runnable) {
        byte b;
        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
        if (z) {
            b = 3;
        } else {
            b = 2;
        }
        bh bhVar = new bh(this, twoStepVerificationActivity, z, (byte) 13);
        twoStepVerificationActivity.a0 = b;
        twoStepVerificationActivity.c0 = bhVar;
        twoStepVerificationActivity.b0 = t1();
        twoStepVerificationActivity.x0(new jr9(this, runnable, l01Var, twoStepVerificationActivity));
    }

    public final void b1(TL_stars.StarGiftAttribute starGiftAttribute) {
        String M0;
        boolean z;
        iua iuaVar;
        wua wuaVar;
        TL_stars.StarGiftAttribute starGiftAttribute2;
        vp8 vp8Var;
        if (starGiftAttribute instanceof TL_stars.starGiftAttributeModel) {
            M0 = ob6.M0(2131750348, null);
            z = true;
        } else if (starGiftAttribute instanceof TL_stars.starGiftAttributePattern) {
            M0 = ob6.M0(2131750341, null);
            z = true;
        } else if (starGiftAttribute instanceof TL_stars.starGiftAttributeBackdrop) {
            M0 = ob6.M0(2131750349, null);
            z = false;
        } else {
            return;
        }
        if (!this.L2 && ((iuaVar = this.K2) == null || !iuaVar.o)) {
            boolean[] zArr = new boolean[1];
            y41[] y41VarArr = new y41[1];
            Integer[] numArr = new Integer[1];
            String A1 = A1(starGiftAttribute.rarity, numArr);
            if (starGiftAttribute.rarity instanceof TL_stars.TL_starGiftAttributeRarity) {
                wuaVar = this;
                starGiftAttribute2 = starGiftAttribute;
                vp8Var = new vp8(wuaVar, zArr, starGiftAttribute2, y41VarArr, (byte) 25);
            } else {
                wuaVar = this;
                starGiftAttribute2 = starGiftAttribute;
                vp8Var = null;
            }
            y41VarArr[0] = (y41) ((ejb) wuaVar.d2.e(M0, starGiftAttribute2.name, A1, vp8Var, numArr[0]).getChildAt(1)).getChildAt(0);
            return;
        }
        nua nuaVar = new nua(getContext(), this.J0, new ora(this, (byte) 0));
        TableRow tableRow = new TableRow(getContext());
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
        hjb hjbVar = this.d2;
        tableRow.addView(new gjb(hjbVar, M0), layoutParams);
        tableRow.addView(new ejb(hjbVar, nuaVar, true), new TableRow.LayoutParams(0, -1, 1.0f));
        hjbVar.addView(tableRow);
        iua iuaVar2 = this.K2;
        if (iuaVar2 != null) {
            if (!z) {
                iuaVar2.d = nuaVar;
            }
            if (z) {
                iuaVar2.c = nuaVar;
            }
            if (z) {
                iuaVar2.b = nuaVar;
            }
        }
    }

    public final void b2() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wua.b2():void");
    }

    public final void c1(LinearLayout linearLayout, int i, int i2, int i3, String str, boolean z) {
        int i4;
        int i5;
        ImageView imageView = new ImageView(getContext());
        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(i);
        vnb vnbVar = this.J0;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        yob.s(imageView, i3, vnbVar, mode);
        if (i2 < 15) {
            i4 = 1;
        } else {
            i4 = 0;
        }
        if (i2 < 15) {
            i5 = 1;
        } else {
            i5 = 0;
        }
        linearLayout.addView(imageView, tre.t(i2, i2, 16, i4, 0, i5, 0));
        TextView textView = new TextView(getContext());
        textView.setTextSize(1, 13.0f);
        int i6 = aob.r5;
        yob.X(textView, i6, this.J0);
        textView.setText(str);
        linearLayout.addView(textView, tre.t(-2, -2, 16, 4, 0, 0, 0));
        if (z) {
            ImageView imageView2 = new ImageView(getContext());
            imageView2.setScaleType(scaleType);
            imageView2.setImageResource(2131232255);
            yob.s(imageView2, i6, this.J0, mode);
            linearLayout.addView(imageView2, tre.t(11, 11, 16, 5, 0, 2, 0));
        }
    }

    public final void c2(long j, long j2, SpannableStringBuilder spannableStringBuilder, boolean z, pcc pccVar) {
        String str;
        TLRPC.User user;
        String a0;
        SpannableStringBuilder S2;
        CharSequence M0;
        TL_stars.TL_starGiftUnique B1 = B1();
        if (B1 == null) {
            return;
        }
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        int i2 = this.a;
        if (i >= 0) {
            TLRPC.User X1 = uc7.s1(i2).X1(Long.valueOf(j));
            str = lbc.l(X1);
            user = X1;
        } else {
            TLRPC.Chat M02 = uc7.s1(i2).M0(Long.valueOf(-j));
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
        linearLayout.addView(new xta(getContext(), B1, user), tre.t(-1, -2, 48, 0, -4, 0, 0));
        TextView textView = new TextView(getContext());
        yob.X(textView, aob.j5, this.J0);
        textView.setTextSize(1, 16.0f);
        if (spannableStringBuilder != null) {
            S2 = spannableStringBuilder;
        } else {
            if (j2 > 0) {
                a0 = ob6.K("Gift2TransferPriceText", (int) j2, ',', t1(), wf3.s(j));
            } else {
                a0 = ob6.a0(null, null, 2131749859, t1(), str);
            }
            S2 = hl.S2(a0);
        }
        textView.setText(S2);
        linearLayout.addView(textView, tre.t(-1, -2, 48, 24, 4, 24, 4));
        hjb hjbVar = new hjb(getContext(), this.J0);
        a1(hjbVar, jxa.i(B1.attributes, TL_stars.starGiftAttributeModel.class));
        a1(hjbVar, jxa.i(B1.attributes, TL_stars.starGiftAttributeBackdrop.class));
        a1(hjbVar, jxa.i(B1.attributes, TL_stars.starGiftAttributePattern.class));
        if (!TextUtils.isEmpty(B1.slug) && (B1.flags & 256) != 0) {
            di0.h();
            hjbVar.f(ob6.M0(2131749362, null), c00.i("~", di0.f(B1.value_currency, di0.h().g(B1.value_currency), B1.value_amount, true)), null, null);
        }
        linearLayout.addView(hjbVar, tre.t(-1, -2, 48, 23, 16, 23, 4));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.J0, getContext());
        alertDialog$Builder.n(linearLayout);
        if (j2 > 0) {
            M0 = nza.T0(ob6.a0(null, null, 2131749866, Integer.valueOf((int) j2)));
        } else {
            M0 = ob6.M0(2131749867, null);
        }
        alertDialog$Builder.j(M0, new f62(pccVar, (byte) 2));
        alertDialog$Builder.g(ob6.M0(2131752570, null), null);
        id idVar = alertDialog$Builder.a;
        idVar.Y0 = z;
        idVar.show();
    }

    public final void d1(TL_stars.InputSavedStarGift inputSavedStarGift, TLRPC.Updates updates, Runnable runnable) {
        TLRPC.Message message;
        TL_stars.StarGift starGift;
        if (updates == null) {
            jxa.v(this.a, false).M(r1());
            dismiss();
            return;
        }
        TLRPC.Update update = updates.update;
        if (update instanceof TL_update.TL_updateNewMessage) {
            message = ((TL_update.TL_updateNewMessage) update).message;
        } else {
            if (updates.updates != null) {
                for (int i = 0; i < updates.updates.size(); i++) {
                    TLRPC.Update update2 = updates.updates.get(i);
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
                    savedStarGift2.msg_id = message.id;
                    savedStarGift2.flags = (savedStarGift2.flags | 8) & (-2049);
                    savedStarGift2.saved_id = 0L;
                    savedStarGift2.unsaved = !tL_messageActionStarGiftUnique.saved;
                    savedStarGift2.refunded = tL_messageActionStarGiftUnique.refunded;
                    savedStarGift2.can_upgrade = false;
                    savedStarGift2.can_resell_at = tL_messageActionStarGiftUnique.can_resell_at;
                    savedStarGift2.can_transfer_at = tL_messageActionStarGiftUnique.can_transfer_at;
                    savedStarGift2.can_export_at = tL_messageActionStarGiftUnique.can_export_at;
                    o2(savedStarGift2, this.B2);
                    this.m3 = null;
                    this.L2 = false;
                    bxa bxaVar = this.B2;
                    if (bxaVar != null) {
                        bxaVar.d();
                    } else {
                        jxa.v(this.a, false).M(this.S1);
                    }
                    hl.c3(runnable);
                    return;
                }
            }
            if (this.B2 == null) {
                jxa.v(this.a, false).M(r1());
            }
            this.L2 = true;
            this.A2 = null;
            this.z2 = false;
            r47 r47Var = new r47(this.a, message, false, false);
            r47Var.K5();
            m2(r47Var, this.B2);
            this.m3 = null;
            this.L2 = false;
            hl.c3(runnable);
            return;
        }
        jxa.v(this.a, false).M(r1());
        dismiss();
    }

    public final void d2(long j, pcc pccVar) {
        TLRPC.Message message;
        long j2;
        TL_stars.SavedStarGift savedStarGift = this.A2;
        if (savedStarGift != null && (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
            j2 = savedStarGift.transfer_stars;
        } else {
            r47 r47Var = this.C2;
            if (r47Var != null && (message = r47Var.k) != null) {
                TLRPC.MessageAction messageAction = message.action;
                if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                    TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
                    if (tL_messageActionStarGiftUnique.gift instanceof TL_stars.TL_starGiftUnique) {
                        j2 = tL_messageActionStarGiftUnique.transfer_stars;
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
        c2(j, j2, null, true, pccVar);
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3 = jn7.I3;
        sua suaVar = this.a2;
        boolean z = true;
        if (i == i3) {
            if (this.B2 == ((axa) objArr[1])) {
                vta vtaVar = suaVar.N;
                if (vtaVar == null || !vtaVar.i0) {
                    D2();
                }
            }
        } else if (i == jn7.d4) {
            suaVar.setInWallet((this.d3 == null && this.a3 == null && y2(B1())) ? false : false);
        }
    }

    @Override
    public final void dismiss() {
        if (this.W2.c(4) && this.a2.N.i0) {
            return;
        }
        ld9 ld9Var = this.R2;
        if (ld9Var != null) {
            ld9Var.b();
            this.R2 = null;
        }
        iua iuaVar = this.K2;
        if (iuaVar != null) {
            iuaVar.a();
        }
        super.dismiss();
    }

    public final void e1(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z, hw4 hw4Var) {
        d31 j2;
        bxa bxaVar = this.B2;
        if (hw4Var != null) {
            ex0 ex0Var = hw4Var.c;
            hl.t1(ex0Var.findFocus());
            j2 = new d31(ex0Var, this.J0);
        } else {
            j2 = j();
        }
        it7.d(getContext(), this.a, tL_starGiftUnique, j, tL_textWithEntities, !z, this.J0, new vra(this, hw4Var, (byte) 0), j2, new wra(this, hw4Var, (byte) 0), new xra(bxaVar, tL_starGiftUnique, (byte) 0));
    }

    public final void e2() {
        TL_stars.InputSavedStarGift v1;
        long j;
        long j2;
        long j3;
        boolean z;
        boolean z2;
        boolean z3;
        String str;
        boolean z4;
        boolean z5;
        int i;
        kg5 kg5Var = this.w3;
        if (kg5Var != null) {
            kg5Var.f(true);
            this.w3 = null;
        }
        if (this.X2 == null && (v1 = v1()) != null) {
            r47 r47Var = this.C2;
            long j4 = this.S1;
            if (r47Var != null) {
                TLRPC.MessageAction messageAction = r47Var.k.action;
                if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                    TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                    j2 = tL_messageActionStarGift.gift.id;
                    j3 = tL_messageActionStarGift.upgrade_stars;
                    z = tL_messageActionStarGift.name_hidden;
                    TLRPC.TL_textWithEntities tL_textWithEntities = tL_messageActionStarGift.message;
                    if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    j = 0;
                    z3 = tL_messageActionStarGift.peer instanceof TLRPC.TL_peerChannel;
                    str = tL_messageActionStarGift.prepaid_upgrade_hash;
                    if (tL_messageActionStarGift.prepaid_upgrade) {
                        if (wf3.n(tL_messageActionStarGift.from_id) != this.C2.Z0()) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                    } else {
                        z4 = tL_messageActionStarGift.upgrade_separate;
                    }
                } else {
                    return;
                }
            } else {
                j = 0;
                TL_stars.SavedStarGift savedStarGift = this.A2;
                if (savedStarGift != null) {
                    TL_stars.StarGift starGift = savedStarGift.gift;
                    j2 = starGift.id;
                    j3 = savedStarGift.upgrade_stars;
                    if ((starGift instanceof TL_stars.TL_starGift) && savedStarGift.name_hidden) {
                        z = true;
                    } else {
                        z = false;
                    }
                    TLRPC.TL_textWithEntities tL_textWithEntities2 = savedStarGift.message;
                    if (tL_textWithEntities2 != null && !TextUtils.isEmpty(tL_textWithEntities2.text)) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (j4 < 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    TL_stars.SavedStarGift savedStarGift2 = this.A2;
                    str = savedStarGift2.prepaid_upgrade_hash;
                    z4 = savedStarGift2.upgrade_separate;
                } else {
                    return;
                }
            }
            TextView textView = this.s2;
            if (z) {
                if (z3) {
                    i = 2131750359;
                } else {
                    i = 2131750360;
                }
                textView.setText(ob6.M0(i, null));
            } else if (z2) {
                textView.setText(ob6.M0(2131750357, null));
            } else {
                textView.setText(ob6.M0(2131750358, null));
            }
            if (!z && j3 > j && !z4) {
                z5 = true;
            } else {
                z5 = false;
            }
            og2 og2Var = this.r2;
            og2Var.a(z5, false);
            if (this.m3 != null) {
                if (j3 > j || this.q3 != null) {
                    f2();
                    return;
                }
            } else {
                jxa.v(this.a, false).H(j2, new mra(this, (byte) 2));
            }
            if (j3 <= j && this.q3 == null) {
                this.p3 = true;
                TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                if (!TextUtils.isEmpty(str)) {
                    TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade tL_inputInvoiceStarGiftPrepaidUpgrade = new TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade();
                    tL_inputInvoiceStarGiftPrepaidUpgrade.hash = str;
                    tL_inputInvoiceStarGiftPrepaidUpgrade.peer = uc7.s1(this.a).j1(j4);
                    tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftPrepaidUpgrade;
                } else {
                    TLRPC.TL_inputInvoiceStarGiftUpgrade tL_inputInvoiceStarGiftUpgrade = new TLRPC.TL_inputInvoiceStarGiftUpgrade();
                    tL_inputInvoiceStarGiftUpgrade.keep_original_details = og2Var.a.q;
                    tL_inputInvoiceStarGiftUpgrade.stargift = v1;
                    tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftUpgrade;
                }
                JSONObject u = xw0.u(this.J0, false);
                if (u != null) {
                    TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                    tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                    tL_dataJSON.data = u.toString();
                    tL_payments_getPaymentForm.flags |= 1;
                }
                ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_getPaymentForm, new xsa(this, (byte) 0));
            }
        }
    }

    public final boolean f1() {
        int i;
        boolean z;
        boolean z2;
        TLRPC.Peer peer;
        if (v1() == null) {
            return false;
        }
        r47 r47Var = this.C2;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        if (r47Var != null) {
            TLRPC.MessageAction messageAction = r47Var.k.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                if (tL_messageActionStarGift.peer != null) {
                    z = true;
                } else {
                    z = false;
                }
                boolean O3 = r47Var.O3();
                if (r47.B0(this.C2.k) == yac.h(this.a).e()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                int g = ((int) uc7.s1(this.a).l4.D3.g(timeUnit)) - (ConnectionsManager.getInstance(this.a).getCurrentTime() - this.C2.k.date);
                if (((z || (O3 && !z2)) && ((peer = tL_messageActionStarGift.peer) == null || !H1(this.a, wf3.n(peer)))) || tL_messageActionStarGift.converted || tL_messageActionStarGift.convert_stars <= 0 || g <= 0) {
                    return false;
                }
                return true;
            }
        } else {
            TL_stars.SavedStarGift savedStarGift = this.A2;
            if (savedStarGift != null) {
                int g2 = ((int) uc7.s1(this.a).l4.D3.g(timeUnit)) - (ConnectionsManager.getInstance(this.a).getCurrentTime() - savedStarGift.date);
                int i2 = this.a;
                long j = this.S1;
                if (H1(i2, j)) {
                    int i3 = this.A2.flags;
                    if (j < 0) {
                        i = 2048;
                    } else {
                        i = 8;
                    }
                    if ((i & i3) != 0 && (i3 & 16) != 0 && (i3 & 2) != 0 && g2 > 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void f2() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wua.f2():void");
    }

    public final boolean g1() {
        int i;
        TL_stars.TL_starGiftUnique B1 = B1();
        if (B1 == null || B1.crafted || it7.n(B1) || !H1(this.a, wf3.n(B1.owner_id))) {
            return false;
        }
        r47 r47Var = this.C2;
        if (r47Var != null) {
            TLRPC.Message message = r47Var.k;
            if (message == null) {
                return false;
            }
            TLRPC.MessageAction messageAction = message.action;
            if (!(messageAction instanceof TLRPC.TL_messageActionStarGiftUnique)) {
                return false;
            }
            i = ((TLRPC.TL_messageActionStarGiftUnique) messageAction).can_craft_at;
        } else {
            TL_stars.SavedStarGift savedStarGift = this.A2;
            if (savedStarGift != null && (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
                i = savedStarGift.can_craft_at;
            }
            return false;
        }
        int currentTime = ConnectionsManager.getInstance(this.a).getCurrentTime();
        if (i <= 0 || currentTime < i) {
            return false;
        }
        return true;
    }

    public final void g2() {
        TL_stars.TL_starGiftUnique B1 = B1();
        if (!x2() && F2() != null && B1 != null && !TextUtils.isEmpty(B1.slug)) {
            ?? obj = new Object();
            obj.a = ob6.M0(2131749860, null);
            obj.b = true;
            obj.e = new ku9(this, r1, (byte) 9);
            Context context = getContext();
            int i = this.a;
            bx4 bx4Var = new bx4(context, i, false, pj0.a(i).b(), null, obj, this.J0);
            bx4[] bx4VarArr = {bx4Var};
            bx4Var.show();
        }
    }

    public final boolean h1() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wua.h1():boolean");
    }

    public final boolean i1() {
        TL_stars.TL_starGiftUnique B1 = B1();
        if (B1 != null && !TextUtils.isEmpty(B1.slug)) {
            if (this.a3 != null || I1(B1) || F1(B1) || (it7.y(B1) && G1(this.a, wf3.n(B1.owner_id)))) {
                hr hrVar = uc7.s1(this.a).l4;
                if (hrVar.v0.f) {
                    if (hrVar.s.f || hrVar.t.f || I1(B1)) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final SpannableStringBuilder i2(TLRPC.Peer peer) {
        if (peer != null) {
            String q = wf3.q(uc7.s1(this.a).b2(wf3.n(peer)));
            if (!TextUtils.isEmpty(q)) {
                return hl.N2(ob6.a0(null, null, 2131750001, c00.i("@", q)), -1, 0, new tra(this, q, (byte) 6), null);
            }
        }
        return null;
    }

    @Override
    public d31 j() {
        return new d31(this.k2, this.J0);
    }

    public final void j1() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.J0, getContext());
        String M0 = ob6.M0(2131750225, null);
        id idVar = alertDialog$Builder.a;
        idVar.S = M0;
        idVar.U = ob6.M0(2131750226, null);
        TL_stars.TL_starGiftUnique B1 = B1();
        if (B1 != null && !TextUtils.isEmpty(B1.slug)) {
            alertDialog$Builder.j(ob6.M0(2131747532, null), new tsa(this, B1, (byte) 1));
        }
        ik8.y(null, 2131752570, alertDialog$Builder, null);
    }

    public final SpannableStringBuilder j2(TL_stars.StarGift starGift) {
        if (starGift != null && !(starGift instanceof TL_stars.TL_starGiftUnique)) {
            return i2(starGift.released_by);
        }
        return null;
    }

    public final void k1(long j, TL_stars.starGiftDepositPayload stargiftdepositpayload, long j2, l01 l01Var, bx4 bx4Var) {
        boolean z;
        TL_wallet.nftItem F2 = F2();
        TL_stars.TL_starGiftUnique B1 = B1();
        if (F2 != null && B1 != null && !TextUtils.isEmpty(B1.slug)) {
            if (this.a3 != null) {
                z = true;
            } else {
                z = false;
            }
            String t1 = t1();
            l01Var.d();
            hsa hsaVar = new hsa(this, j2, l01Var, j, B1, F2, bx4Var, z, t1);
            if (stargiftdepositpayload != null) {
                hsaVar.a(stargiftdepositpayload);
                return;
            }
            TL_stars.depositStarGift depositstargift = new TL_stars.depositStarGift();
            depositstargift.peer = uc7.s1(this.a).j1(j);
            depositstargift.slug = B1.slug;
            ConnectionsManager.getInstance(this.a).sendRequestTyped(depositstargift, new ic((byte) 0), new nu0(this, l01Var, bx4Var, hsaVar, (byte) 15));
        }
    }

    public final void l1(long j, pcc pccVar) {
        TLRPC.Message message;
        long n;
        long j2;
        TL_stars.InputSavedStarGift v1 = v1();
        if (v1 != null) {
            TL_stars.SavedStarGift savedStarGift = this.A2;
            if (savedStarGift != null && (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
                j2 = savedStarGift.transfer_stars;
                n = this.S1;
            } else {
                r47 r47Var = this.C2;
                if (r47Var != null && (message = r47Var.k) != null) {
                    TLRPC.MessageAction messageAction = message.action;
                    if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                        TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
                        n = wf3.n(tL_messageActionStarGiftUnique.gift.owner_id);
                        j2 = tL_messageActionStarGiftUnique.transfer_stars;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            long j3 = n;
            if (j2 <= 0) {
                TL_stars.transferStarGift transferstargift = new TL_stars.transferStarGift();
                transferstargift.stargift = v1;
                transferstargift.to_id = uc7.s1(this.a).j1(j);
                ConnectionsManager.getInstance(this.a).sendRequest(transferstargift, new op6(this, pccVar, j, j3, (byte) 2));
                return;
            }
            jxa v = jxa.v(this.a, false);
            if (!v.e) {
                v.o(new z09(this, v, j, pccVar, (byte) 3));
                return;
            }
            TLRPC.TL_inputInvoiceStarGiftTransfer tL_inputInvoiceStarGiftTransfer = new TLRPC.TL_inputInvoiceStarGiftTransfer();
            tL_inputInvoiceStarGiftTransfer.stargift = v1;
            tL_inputInvoiceStarGiftTransfer.to_id = uc7.s1(this.a).j1(j);
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftTransfer;
            JSONObject u = xw0.u(this.J0, false);
            if (u != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = u.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_getPaymentForm, new z95(this, tL_inputInvoiceStarGiftTransfer, j, j3, pccVar));
        }
    }

    public final void m1() {
        TL_stars.InputSavedStarGift v1;
        long j;
        c51 c51Var = this.f2;
        if (!c51Var.R && (v1 = v1()) != null) {
            r47 r47Var = this.C2;
            String str = null;
            long j2 = 0;
            if (r47Var != null) {
                TLRPC.MessageAction messageAction = r47Var.k.action;
                if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                    TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                    j = tL_messageActionStarGift.upgrade_stars;
                    if (j <= 0) {
                        str = tL_messageActionStarGift.prepaid_upgrade_hash;
                    }
                } else {
                    return;
                }
            } else {
                TL_stars.SavedStarGift savedStarGift = this.A2;
                if (savedStarGift != null) {
                    j = savedStarGift.upgrade_stars;
                    if (j <= 0) {
                        str = savedStarGift.prepaid_upgrade_hash;
                    }
                } else {
                    return;
                }
            }
            int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
            if (i > 0 || this.q3 != null) {
                c51Var.setLoading(true);
                int i2 = 0;
                og2 og2Var = this.r2;
                if (i > 0) {
                    TL_stars.upgradeStarGift upgradestargift = new TL_stars.upgradeStarGift();
                    upgradestargift.keep_original_details = og2Var.a.q;
                    upgradestargift.stargift = v1;
                    ConnectionsManager.getInstance(this.a).sendRequest(upgradestargift, new isa(this, v1, (byte) 0));
                    return;
                }
                jxa v = jxa.v(this.a, false);
                if (!v.e) {
                    v.o(new kba(this, v, (byte) 13));
                    return;
                }
                TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
                tL_payments_sendStarsForm.form_id = this.q3.form_id;
                if (!TextUtils.isEmpty(str)) {
                    TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade tL_inputInvoiceStarGiftPrepaidUpgrade = new TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade();
                    tL_inputInvoiceStarGiftPrepaidUpgrade.hash = str;
                    tL_inputInvoiceStarGiftPrepaidUpgrade.peer = uc7.s1(this.a).j1(this.S1);
                    tL_payments_sendStarsForm.invoice = tL_inputInvoiceStarGiftPrepaidUpgrade;
                } else {
                    TLRPC.TL_inputInvoiceStarGiftUpgrade tL_inputInvoiceStarGiftUpgrade = new TLRPC.TL_inputInvoiceStarGiftUpgrade();
                    tL_inputInvoiceStarGiftUpgrade.keep_original_details = og2Var.a.q;
                    tL_inputInvoiceStarGiftUpgrade.stargift = v1;
                    tL_payments_sendStarsForm.invoice = tL_inputInvoiceStarGiftUpgrade;
                }
                ArrayList<TLRPC.TL_labeledPrice> arrayList = this.q3.invoice.prices;
                int size = arrayList.size();
                while (i2 < size) {
                    TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i2);
                    i2++;
                    j2 += tL_labeledPrice.amount;
                }
                ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_sendStarsForm, new ft0(this, str, v1, j2, (byte) 5));
            }
        }
    }

    public final void m2(defpackage.r47 r58, defpackage.bxa r59) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wua.m2(r47, bxa):void");
    }

    public final void n2(String str, TL_stars.TL_starGiftUnique tL_starGiftUnique, bxa bxaVar) {
        boolean z;
        boolean z2;
        float f;
        iua iuaVar;
        TL_stars.TL_starGiftUnique tL_starGiftUnique2;
        this.D2 = str;
        this.E2 = tL_starGiftUnique;
        this.B2 = bxaVar;
        if (this.d3 == null && tL_starGiftUnique.resell_amount != null && !G1(this.a, wf3.n(tL_starGiftUnique.owner_id)) && !E1(this.a, tL_starGiftUnique) && !I1(tL_starGiftUnique)) {
            z = true;
        } else {
            z = false;
        }
        this.F2 = z;
        if (!this.L2 && (iuaVar = this.K2) != null && iuaVar.o && (tL_starGiftUnique2 = iuaVar.l) != null && tL_starGiftUnique2.id != tL_starGiftUnique.id) {
            iuaVar.a();
            this.K2 = null;
            sua suaVar = this.a2;
            suaVar.b.setAlpha(1.0f);
            suaVar.c.setAlpha(0.0f);
        }
        this.Z1.b(this.a, this.A2);
        p2(tL_starGiftUnique, false, null, null);
        String str2 = tL_starGiftUnique.owner_address;
        String str3 = tL_starGiftUnique.gift_address;
        if (tL_starGiftUnique.host_id != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        TL_wallet.walletTransaction wallettransaction = this.d3;
        p66 p66Var = this.c2;
        if (wallettransaction == null && z2 && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            f = 0.66f;
            p66Var.setText(hl.E2(hl.N2(ob6.M0(2131750140, null), -1, 0, new tra(this, str3, (byte) 0), null), true, hl.L(2.6666667f), hl.L(0.66f)));
            p66Var.setVisibility(0);
            yob.X(p66Var, aob.q5, this.J0);
        } else {
            f = 0.66f;
            p66Var.setVisibility(8);
        }
        TL_wallet.walletTransaction wallettransaction2 = this.d3;
        p66 p66Var2 = this.e2;
        if (wallettransaction2 == null && !z2 && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            p66Var2.setText(hl.E2(hl.N2(ob6.M0(2131750140, null), -1, 0, new tra(this, str3, (byte) 1), null), true, hl.L(2.6666667f), hl.L(f)));
            p66Var2.setVisibility(0);
        } else {
            p66Var2.setVisibility(8);
        }
        E2();
        if (this.F2) {
            q2(tL_starGiftUnique);
            this.f2.setOnClickListener(new hra(this, (byte) 12));
        }
        if (this.Z2) {
            A2(0, false, null);
            this.m1.m0(1);
            this.Z2 = false;
        }
        D2();
    }

    @Override
    public final void o0() {
        kg5 kg5Var = this.w3;
        if (kg5Var != null) {
            kg5Var.f(true);
            this.w3 = null;
        }
    }

    public final void o2(org.telegram.tgnet.tl.TL_stars.SavedStarGift r35, defpackage.bxa r36) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wua.o2(org.telegram.tgnet.tl.TL_stars$SavedStarGift, bxa):void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        jn7.f(this.a).b(this, jn7.I3);
        jn7.f(this.a).b(this, jn7.d4);
    }

    @Override
    public final void onBackPressed() {
        sua suaVar;
        vta vtaVar;
        if (this.W2.c(4) && (suaVar = this.a2) != null && (vtaVar = suaVar.N) != null) {
            if (vtaVar.i0) {
                return;
            }
            if (vtaVar.j0) {
                super.onBackPressed();
                return;
            }
        }
        if (!this.v2 && this.W2.b > 0 && !this.f2.R && !this.l3) {
            r47 r47Var = this.C2;
            if (r47Var != null) {
                m2(r47Var, null);
            } else {
                TL_stars.SavedStarGift savedStarGift = this.A2;
                if (savedStarGift != null) {
                    o2(savedStarGift, this.B2);
                } else {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = this.E2;
                    if (tL_starGiftUnique != null) {
                        n2(this.D2, tL_starGiftUnique, this.B2);
                    }
                }
            }
            A2(0, true, null);
            return;
        }
        super.onBackPressed();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        jn7.f(this.a).n(this, jn7.I3);
        jn7.f(this.a).n(this, jn7.d4);
    }

    @Override
    public final void p0() {
        super.p0();
        try {
            L(aob.h5);
            sua suaVar = this.a2;
            if (suaVar != null) {
                suaVar.l();
            }
            wm2 wm2Var = this.Y2;
            if (wm2Var != null) {
                Drawable drawable = wm2Var.c;
                if (drawable instanceof tua) {
                    ((tua) drawable).d.setColor(aob.v0(aob.Fi, this.J0));
                    c51 c51Var = this.f2;
                    if (c51Var != null) {
                        c51Var.invalidate();
                    }
                }
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    public final void p2(org.telegram.tgnet.tl.TL_stars.TL_starGiftUnique r43, boolean r44, org.telegram.tgnet.TLObject r45, org.telegram.tgnet.TLRPC.TL_textWithEntities r46) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wua.p2(org.telegram.tgnet.tl.TL_stars$TL_starGiftUnique, boolean, org.telegram.tgnet.TLObject, org.telegram.tgnet.TLRPC$TL_textWithEntities):void");
    }

    public final int q1() {
        if (this.W2.d(1)) {
            return this.n2.getMeasuredHeight();
        }
        if (this.W2.d(2)) {
            return this.w2.getMeasuredHeight();
        }
        if (this.W2.d(3)) {
            return this.y2.getMeasuredHeight();
        }
        if (this.W2.d(4)) {
            return 0;
        }
        return this.b2.getMeasuredHeight();
    }

    public final void q2(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        oj resellAmount = tL_starGiftUnique.getResellAmount(pj.a);
        boolean z = tL_starGiftUnique.resale_ton_only;
        SpannableStringBuilder spannableStringBuilder = null;
        c51 c51Var = this.f2;
        if (z) {
            c51Var.i(nza.t1(nza.V0(ob6.a0(null, null, 2131745873, tL_starGiftUnique.getResellAmount(pj.b).d()), true), true), !this.Z2, true);
            if (!it7.n(tL_starGiftUnique)) {
                spannableStringBuilder = nza.T0(ob6.H(',', "ResellGiftBuyEq", (int) resellAmount.a()));
            }
            c51Var.g(spannableStringBuilder, !this.Z2);
            return;
        }
        c51Var.i(nza.T0(ob6.H(',', "ResellGiftBuy", (int) resellAmount.a())), !this.Z2, true);
        c51Var.g(null, !this.Z2);
    }

    public final long r1() {
        TLRPC.Peer peer;
        r47 r47Var = this.C2;
        if (r47Var != null) {
            TLRPC.Message message = r47Var.k;
            if (message != null) {
                TLRPC.MessageAction messageAction = message.action;
                if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                    TLRPC.Peer peer2 = ((TLRPC.TL_messageActionStarGift) messageAction).peer;
                    if (peer2 != null) {
                        return wf3.n(peer2);
                    }
                    if (r47Var.O3()) {
                        return r47.B0(this.C2.k);
                    }
                    return yac.h(this.a).e();
                } else if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                    TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
                    TL_stars.StarGift starGift = tL_messageActionStarGiftUnique.gift;
                    if ((starGift instanceof TL_stars.TL_starGiftUnique) && (peer = starGift.owner_id) != null) {
                        return wf3.n(peer);
                    }
                    TLRPC.Peer peer3 = tL_messageActionStarGiftUnique.peer;
                    if (peer3 != null) {
                        return wf3.n(peer3);
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
                return wf3.n(((TL_stars.TL_starGiftUnique) starGift2).owner_id);
            }
            return this.S1;
        }
        TL_stars.TL_starGiftUnique tL_starGiftUnique = this.E2;
        if (tL_starGiftUnique != null) {
            return wf3.n(tL_starGiftUnique.owner_id);
        }
        return 0L;
    }

    public final void r2(TL_stars.TL_starGiftUnique tL_starGiftUnique, boolean z) {
        if (z) {
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_peerUser.user_id = yac.h(this.a).e();
            tL_starGiftUnique.host_id = tL_peerUser;
            tL_starGiftUnique.flags |= 4096;
        } else {
            tL_starGiftUnique.host_id = null;
            tL_starGiftUnique.flags &= -4097;
        }
        this.a2.setWalletDisplayed(z);
        E2();
    }

    public final TL_stars.StarGift s1() {
        r47 r47Var = this.C2;
        if (r47Var != null) {
            TLRPC.Message message = r47Var.k;
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

    public final void s2(boolean z) {
        int i;
        Object obj;
        mx4 mx4Var;
        mx4 mx4Var2;
        mx4 mx4Var3;
        int x1 = x1();
        if (x1 >= 0) {
            if (z) {
                i = 1;
            } else {
                i = -1;
            }
            int i2 = i + x1;
            int i3 = this.P2;
            if (i3 >= 0 && (!z ? i3 < x1 : i3 > x1)) {
                i2 = i3;
            }
            bxa bxaVar = this.B2;
            if (bxaVar != null && i2 >= 0 && i2 < bxaVar.e()) {
                obj = this.B2.get(i2);
            } else {
                obj = null;
            }
            if (obj != null) {
                if (z) {
                    mx4Var = this.Y1;
                } else {
                    mx4Var = this.X1;
                }
                if (mx4Var != null) {
                    if (obj instanceof TL_stars.SavedStarGift) {
                        if (z) {
                            mx4Var3 = this.Y1;
                        } else {
                            mx4Var3 = this.X1;
                        }
                        if (n1(mx4Var3.A2, (TL_stars.SavedStarGift) obj)) {
                            return;
                        }
                    }
                    if (obj instanceof TL_stars.TL_starGiftUnique) {
                        if (z) {
                            mx4Var2 = this.Y1;
                        } else {
                            mx4Var2 = this.X1;
                        }
                        if (o1(mx4Var2.E2, (TL_stars.TL_starGiftUnique) obj)) {
                            return;
                        }
                    }
                }
                mx4 mx4Var4 = new mx4(this, getContext(), this.a, this.S1, this.J0, this.T1.getRootView());
                if (obj instanceof TL_stars.SavedStarGift) {
                    mx4Var4.o2((TL_stars.SavedStarGift) obj, this.B2);
                } else if (obj instanceof TL_stars.TL_starGiftUnique) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj;
                    mx4Var4.n2(tL_starGiftUnique.slug, tL_starGiftUnique, this.B2);
                }
                hl.B2(mx4Var4.b);
                if (z) {
                    this.Y1 = mx4Var4;
                } else {
                    this.X1 = mx4Var4;
                }
            }
        }
    }

    @Override
    public final void show() {
        r47 r47Var;
        TLRPC.Message message;
        String str;
        if (uc7.s1(this.a).x2()) {
            i5.b(this.a);
            return;
        }
        TL_wallet.nftItem nftitem = this.a3;
        if (nftitem != null && (str = this.D2) != null && this.E2 != null) {
            TL_stars.getUniqueStarGift getuniquestargift = new TL_stars.getUniqueStarGift();
            getuniquestargift.slug = str;
            ConnectionsManager.getInstance(this.a).sendRequest(getuniquestargift, new qn8(this, nftitem, str, (byte) 16));
        }
        if (this.D2 != null && this.E2 == null) {
            id idVar = new id(3, null, getContext());
            idVar.q(500L);
            TL_stars.getUniqueStarGift getuniquestargift2 = new TL_stars.getUniqueStarGift();
            getuniquestargift2.slug = this.D2;
            ConnectionsManager.getInstance(this.a).sendRequest(getuniquestargift2, new pl7(this, idVar, (byte) 28));
        } else if (this.A2 == null && (r47Var = this.C2) != null && (message = r47Var.k) != null) {
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                if (tL_messageActionStarGift.upgraded) {
                    if (tL_messageActionStarGift.upgrade_msg_id != 0) {
                        id idVar2 = new id(3, null, getContext());
                        idVar2.q(500L);
                        TLRPC.TL_messages_getMessages tL_messages_getMessages = new TLRPC.TL_messages_getMessages();
                        tL_messages_getMessages.id.add(Integer.valueOf(tL_messageActionStarGift.upgrade_msg_id));
                        ConnectionsManager.getInstance(this.a).sendRequest(tL_messages_getMessages, new qn8((Object) this, (Object) tL_messageActionStarGift, idVar2, (byte) 14));
                        return;
                    } else if (v1() != null) {
                        id idVar3 = new id(3, null, getContext());
                        idVar3.q(500L);
                        jxa.v(this.a, false).J(v1(), new ku9(this, idVar3, (byte) 7));
                        return;
                    }
                }
            }
        }
        super.show();
    }

    public final String t1() {
        TL_stars.StarGift s1 = s1();
        if (s1 instanceof TL_stars.TL_starGiftUnique) {
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) s1;
            StringBuilder sb = new StringBuilder();
            sb.append(tL_starGiftUnique.title);
            sb.append(" #");
            return qu6.m(tL_starGiftUnique.num, ',', sb);
        }
        return "";
    }

    public final void t2() {
        TL_stars.TL_starGiftUnique B1 = B1();
        if (B1 == null) {
            return;
        }
        TLRPC.Peer peer = B1.owner_id;
        if (peer == null) {
            peer = B1.host_id;
        }
        long n = wf3.n(peer);
        StringBuilder sb = new StringBuilder();
        sb.append(B1.title);
        sb.append(" #");
        this.x2.setText(ob6.a0(null, null, 2131749779, qu6.m(B1.num, ',', sb)));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(ob6.M0(2131749781, null));
        if (n == yac.h(this.a).e() && !yac.h(this.a).p()) {
            spannableStringBuilder.append((CharSequence) " l");
            wm2 wm2Var = this.S2;
            if (wm2Var == null) {
                wm2Var = new wm2(2131232248, 0);
                this.S2 = wm2Var;
            }
            spannableStringBuilder.setSpan(wm2Var, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        c51 c51Var = this.f2;
        c51Var.i(spannableStringBuilder, true, true);
        c51Var.g(null, true);
        c51Var.setOnClickListener(new hra(this, (byte) 9));
        this.a2.setWearPreview(uc7.s1(this.a).b2(n));
        A2(2, false, null);
        this.v2 = true;
    }

    public final void u2(CharSequence charSequence) {
        TL_stars.TL_starGiftUnique B1 = B1();
        TL_stars.InputSavedStarGift v1 = v1();
        if (v1 != null && B1 != null) {
            TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails tL_inputInvoiceStarGiftDropOriginalDetails = new TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails();
            tL_inputInvoiceStarGiftDropOriginalDetails.stargift = v1;
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftDropOriginalDetails;
            JSONObject u = xw0.u(this.J0, false);
            if (u != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = u.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_getPaymentForm, new au0(this, charSequence, B1, tL_inputInvoiceStarGiftDropOriginalDetails, (byte) 20));
        }
    }

    public final TL_stars.InputSavedStarGift v1() {
        TLRPC.Message message;
        long B0;
        TLRPC.Message message2;
        long B02;
        TLRPC.Message message3;
        long j = this.S1;
        if (j < 0) {
            TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat = new TL_stars.TL_inputSavedStarGiftChat();
            tL_inputSavedStarGiftChat.peer = uc7.s1(this.a).j1(j);
            r47 r47Var = this.C2;
            if (r47Var != null && (message3 = r47Var.k) != null) {
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
        r47 r47Var2 = this.C2;
        if (r47Var2 != null && (message2 = r47Var2.k) != null) {
            TLRPC.MessageAction messageAction2 = message2.action;
            if ((messageAction2 instanceof TLRPC.TL_messageActionStarGift) && (messageAction2.flags & 4096) != 0) {
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift2 = (TLRPC.TL_messageActionStarGift) messageAction2;
                TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat2 = new TL_stars.TL_inputSavedStarGiftChat();
                uc7 s1 = uc7.s1(this.a);
                TLRPC.Peer peer = tL_messageActionStarGift2.peer;
                if (peer != null) {
                    B02 = wf3.n(peer);
                } else {
                    B02 = r47.B0(this.C2.k);
                }
                tL_inputSavedStarGiftChat2.peer = s1.j1(B02);
                tL_inputSavedStarGiftChat2.saved_id = tL_messageActionStarGift2.saved_id;
                return tL_inputSavedStarGiftChat2;
            }
        }
        if (r47Var2 != null && (message = r47Var2.k) != null) {
            TLRPC.MessageAction messageAction3 = message.action;
            if ((messageAction3 instanceof TLRPC.TL_messageActionStarGiftUnique) && (messageAction3.flags & 128) != 0) {
                TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique2 = (TLRPC.TL_messageActionStarGiftUnique) messageAction3;
                TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat3 = new TL_stars.TL_inputSavedStarGiftChat();
                uc7 s12 = uc7.s1(this.a);
                TLRPC.Peer peer2 = tL_messageActionStarGiftUnique2.peer;
                if (peer2 != null) {
                    B0 = wf3.n(peer2);
                } else {
                    B0 = r47.B0(this.C2.k);
                }
                tL_inputSavedStarGiftChat3.peer = s12.j1(B0);
                tL_inputSavedStarGiftChat3.saved_id = tL_messageActionStarGiftUnique2.saved_id;
                return tL_inputSavedStarGiftChat3;
            }
        }
        TL_stars.TL_inputSavedStarGiftUser tL_inputSavedStarGiftUser = new TL_stars.TL_inputSavedStarGiftUser();
        r47 r47Var3 = this.C2;
        if (r47Var3 != null) {
            TLRPC.Message message4 = r47Var3.k;
            if (message4 != null) {
                TLRPC.MessageAction messageAction4 = message4.action;
                if ((messageAction4 instanceof TLRPC.TL_messageActionStarGift) && (messageAction4.flags & 32768) != 0) {
                    tL_inputSavedStarGiftUser.msg_id = ((TLRPC.TL_messageActionStarGift) messageAction4).gift_msg_id;
                    return tL_inputSavedStarGiftUser;
                }
            }
            tL_inputSavedStarGiftUser.msg_id = r47Var3.e1();
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

    public final void v2(View view, CharSequence charSequence, boolean z) {
        Layout layout;
        z41 z41Var;
        float primaryHorizontal;
        int i;
        kg5 kg5Var = this.w3;
        if ((kg5Var == null || !kg5Var.W || this.x3 != view) && view != null) {
            if (z) {
                if (view instanceof ema) {
                    ema emaVar = (ema) view;
                    primaryHorizontal = (emaVar.getRightDrawableWidth() / 2.0f) + emaVar.getRightDrawableX();
                } else {
                    return;
                }
            } else {
                if (view instanceof TextView) {
                    layout = ((TextView) view).getLayout();
                } else if (view instanceof ema) {
                    layout = ((ema) view).getLayout();
                } else {
                    return;
                }
                if (layout != null) {
                    CharSequence text = layout.getText();
                    if (text instanceof Spanned) {
                        Spanned spanned = (Spanned) text;
                        z41[] z41VarArr = (z41[]) spanned.getSpans(0, spanned.length(), z41.class);
                        if (z41VarArr != null && z41VarArr.length > 0) {
                            primaryHorizontal = layout.getPrimaryHorizontal(spanned.getSpanStart(z41VarArr[z41VarArr.length - 1])) + view.getPaddingLeft() + (z41Var.a() / 2.0f);
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
            jo0 jo0Var = this.T1;
            jo0Var.getLocationOnScreen(iArr);
            int[] iArr2 = {iArr2[0] - iArr[0], iArr2[1] - iArr[1]};
            kg5 kg5Var2 = this.w3;
            if (kg5Var2 != null) {
                kg5Var2.f(true);
                this.w3 = null;
            }
            kg5 kg5Var3 = new kg5(getContext(), 3);
            kg5Var3.p(!z);
            kg5Var3.t(charSequence);
            kg5Var3.o(0.0f, (iArr2[0] + primaryHorizontal) - (hl.L(16.0f) + this.u0));
            float L = (iArr2[1] - hl.L(100.0f)) - (view.getHeight() / 2.0f);
            if (z) {
                i = 18;
            } else {
                i = 0;
            }
            kg5Var3.setTranslationY(L + hl.L(i + 4.33f));
            kg5Var3.d = 3000L;
            kg5Var3.setPadding(hl.L(16.0f) + this.u0, 0, hl.L(16.0f) + this.u0, 0);
            kg5Var3.r0 = new ug(kg5Var3, (byte) 8);
            kg5Var3.v();
            jo0Var.addView(kg5Var3, tre.c(100.0f, -1));
            this.w3 = kg5Var3;
            this.x3 = view;
        }
    }

    public final String w1() {
        TL_stars.StarGift s1 = s1();
        if ((s1 instanceof TL_stars.TL_starGiftUnique) && s1.slug != null) {
            return uc7.s1(this.a).N2 + "/nft/" + s1.slug;
        }
        return null;
    }

    public final void w2(int i, Context context, boolean z) {
        int i2;
        int i3;
        LinearLayout j = uh9.j(context, 1);
        FrameLayout frameLayout = new FrameLayout(context);
        int L = hl.L(64.0f);
        int i4 = aob.Fi;
        ShapeDrawable K = aob.K(L, aob.v0(i4, this.J0));
        uob M = yob.M(i4);
        vnb vnbVar = this.J0;
        frameLayout.setBackground(K);
        yob.j(frameLayout, K, M, null, vnbVar);
        j.addView(frameLayout, tre.t(64, 64, 49, 0, 6, 0, 0));
        ?? imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.f(2131624287, 42, 42, null);
        frameLayout.addView((View) imageView, tre.r(64, 64, 17));
        imageView.d();
        TextView b = zze.b(context, 20.0f, aob.G6, true, null);
        b.setGravity(17);
        if (z) {
            i2 = 2131749951;
        } else {
            i2 = 2131749857;
        }
        b.setText(ob6.M0(i2, null));
        j.addView(b, tre.t(-1, -2, 48, 24, 14, 24, 0));
        TextView b2 = zze.b(context, 14.0f, aob.F6, false, null);
        b2.setGravity(17);
        if (z) {
            i3 = 2131749952;
        } else {
            i3 = 2131749858;
        }
        b2.setText(ob6.a0(null, null, i3, ob6.c0(Math.max(10, i))));
        j.addView(b2, tre.t(-1, -2, 48, 24, 6, 24, 6));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.J0, context);
        alertDialog$Builder.n(j);
        alertDialog$Builder.j(ob6.M0(2131747558, null), null);
        alertDialog$Builder.o();
    }

    public final int x1() {
        int indexOf;
        bxa bxaVar = this.B2;
        if (bxaVar != null) {
            TL_stars.SavedStarGift savedStarGift = this.A2;
            if (savedStarGift != null) {
                indexOf = bxaVar.indexOf(savedStarGift);
            } else {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = this.E2;
                if (tL_starGiftUnique != null) {
                    indexOf = bxaVar.indexOf(tL_starGiftUnique);
                } else {
                    return -1;
                }
            }
            if (indexOf >= 0) {
                return indexOf;
            }
            TL_stars.StarGift s1 = s1();
            for (int i = 0; i < this.B2.e(); i++) {
                Object obj = this.B2.get(i);
                if (obj instanceof TL_stars.SavedStarGift) {
                    TL_stars.SavedStarGift savedStarGift2 = this.A2;
                    if (savedStarGift2 != null) {
                        if (n1(savedStarGift2, (TL_stars.SavedStarGift) obj)) {
                            return i;
                        }
                    }
                    if (s1 != null) {
                        TL_stars.StarGift starGift = ((TL_stars.SavedStarGift) obj).gift;
                        if (s1 != starGift) {
                            if ((s1 instanceof TL_stars.TL_starGiftUnique) && (starGift instanceof TL_stars.TL_starGiftUnique) && s1.id == starGift.id) {
                            }
                        }
                        return i;
                    }
                    continue;
                } else {
                    if ((obj instanceof TL_stars.TL_starGiftUnique) && o1(this.E2, (TL_stars.TL_starGiftUnique) obj)) {
                        return i;
                    }
                }
            }
            return -1;
        }
        return -1;
    }

    public final boolean x2() {
        if (!it7.n(B1())) {
            return false;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.J0, getContext());
        String M0 = ob6.M0(2131749864, null);
        id idVar = alertDialog$Builder.a;
        idVar.S = M0;
        idVar.U = ob6.M0(2131749476, null);
        if (i1()) {
            alertDialog$Builder.j(ob6.M0(2131750393, null), new yra(this, (byte) 2));
            alertDialog$Builder.g(ob6.M0(2131752570, null), null);
        } else {
            alertDialog$Builder.j(ob6.M0(2131747558, null), null);
        }
        alertDialog$Builder.o();
        return true;
    }

    @Override
    public final void y0(int i) {
        super.y0(i);
        hl.o3(this, 0, false, null);
    }

    public final TL_stars.SavedStarGift y1(boolean z) {
        int i;
        Object obj;
        int x1 = x1();
        if (x1 >= 0) {
            if (z) {
                i = 1;
            } else {
                i = -1;
            }
            int i2 = i + x1;
            int i3 = this.P2;
            if (i3 >= 0 && (!z ? i3 < x1 : i3 > x1)) {
                i2 = i3;
            }
            bxa bxaVar = this.B2;
            if (bxaVar != null && i2 >= 0 && i2 < bxaVar.e()) {
                obj = this.B2.get(i2);
            } else {
                obj = null;
            }
            if (obj instanceof TL_stars.SavedStarGift) {
                return (TL_stars.SavedStarGift) obj;
            }
        }
        return null;
    }

    public final boolean y2(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        if (ik8.A(tL_starGiftUnique) && !TextUtils.isEmpty(tL_starGiftUnique.gift_address) && !TextUtils.isEmpty(tL_starGiftUnique.owner_address) && !it7.n(tL_starGiftUnique)) {
            c C = c.C(this.a);
            if (c.b(tL_starGiftUnique.owner_address, C.x()) || C.A().c(tL_starGiftUnique.gift_address)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final TL_stars.TL_starGiftUnique z1(boolean z) {
        int i;
        Object obj;
        int x1 = x1();
        if (x1 >= 0) {
            if (z) {
                i = 1;
            } else {
                i = -1;
            }
            int i2 = i + x1;
            int i3 = this.P2;
            if (i3 >= 0 && (!z ? i3 < x1 : i3 > x1)) {
                i2 = i3;
            }
            bxa bxaVar = this.B2;
            if (bxaVar != null && i2 >= 0 && i2 < bxaVar.e()) {
                obj = this.B2.get(i2);
            } else {
                obj = null;
            }
            if (obj instanceof TL_stars.TL_starGiftUnique) {
                return (TL_stars.TL_starGiftUnique) obj;
            }
        }
        return null;
    }

    public final void z2(boolean z, id idVar, l01 l01Var, Runnable runnable) {
        l01Var.d();
        yac h = yac.h(this.a);
        TL_account.tmpPassword tmppassword = h.y;
        if (tmppassword != null && tmppassword.valid_until < ConnectionsManager.getInstance(this.a).getCurrentTime() + 60) {
            h.y = null;
            h.u(false);
        }
        TL_account.tmpPassword tmppassword2 = h.y;
        if (tmppassword2 == null) {
            a2(z, l01Var, runnable);
        } else {
            D1(tmppassword2.tmp_password, null, z, new s45(this, z, l01Var, runnable, idVar));
        }
    }
}
