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
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.Wallet.c;
public class wsa extends mz0 implements jm7 {
    public TL_stars.SavedStarGift A2;
    public bva B2;
    public k47 C2;
    public String D2;
    public TL_stars.TL_starGiftUnique E2;
    public boolean F2;
    public boolean G2;
    public boolean H2;
    public boolean I2;
    public boolean J2;
    public hsa K2;
    public boolean L2;
    public ira M2;
    public final int[] N2;
    public ny0 O2;
    public int P2;
    public String Q2;
    public xb9 R2;
    public final long S1;
    public pn2 S2;
    public final jp0 T1;
    public boolean T2;
    public final fra U1;
    public yqa U2;
    public final uj4 V1;
    public Float V2;
    public final View W1;
    public xra W2;
    public ix4 X1;
    public ValueAnimator X2;
    public ix4 Y1;
    public pn2 Y2;
    public final hra Z1;
    public boolean Z2;
    public final ssa a2;
    public TL_wallet.nftItem a3;
    public final gra b2;
    public pnc b3;
    public final l66 c2;
    public qnc c3;
    public final mhb d2;
    public TL_wallet.walletTransaction d3;
    public final l66 e2;
    public final LinearLayout e3;
    public final b61 f2;
    public final TextView f3;
    public final FrameLayout g2;
    public final TextView g3;
    public final l66 h2;
    public View h3;
    public final FrameLayout i2;
    public hs8 i3;
    public final View j2;
    public boolean j3;
    public final FrameLayout k2;
    public Boolean k3;
    public usa l2;
    public boolean l3;
    public boolean m2;
    public ArrayList m3;
    public final gra n2;
    public ArrayList n3;
    public final ac[] o2;
    public ArrayList o3;
    public final View p2;
    public boolean p3;
    public final LinearLayout q2;
    public TLRPC.PaymentForm q3;
    public final jh2 r2;
    public final pn2[] r3;
    public final TextView s2;
    public final npa s3;
    public final LinearLayout t2;
    public int t3;
    public final jh2 u2;
    public Boolean u3;
    public boolean v2;
    public boolean v3;
    public final gra w2;
    public hg5 w3;
    public final TextView x2;
    public View x3;
    public final gra y2;
    public boolean z2;

    public wsa(Context context, int i, long j, ylb ylbVar, View view) {
        super(context, null, false, false, ylbVar);
        this.m2 = false;
        this.N2 = new int[2];
        this.P2 = -1;
        this.Q2 = "";
        this.W2 = new xra(0, 0);
        this.Z2 = true;
        this.r3 = new pn2[1];
        this.s3 = new npa(this, (byte) 16);
        this.v3 = true;
        this.a = i;
        this.S1 = j;
        this.u1 = Math.max(0.05f, gm.L(82.0f) / (gm.q.y + gm.m));
        this.x = true;
        this.b = new ne6((byte) 24, context, this);
        jp0 jp0Var = new jp0(this, context);
        this.T1 = jp0Var;
        fra fraVar = new fra(this, context);
        this.U1 = fraVar;
        fraVar.setAdapter(new bo0((byte) 6, context, this));
        C2();
        View view2 = new View(context);
        this.W1 = view2;
        int i2 = cmb.g5;
        anb.h(i2, ylbVar, view2);
        FrameLayout.LayoutParams e = qoe.e(-1, 50, 80);
        int i3 = this.u0;
        e.rightMargin = i3;
        e.leftMargin = i3;
        this.b.addView(view2, e);
        this.b.addView(fraVar, qoe.e(-1, -1, 119));
        L(i2);
        gm.B2(this.n1);
        jp0Var.addView(this.n1, qoe.e(-1, -1, 119));
        if (Build.VERSION.SDK_INT >= 26) {
            this.n1.setDefaultFocusHighlightEnabled(false);
        }
        gra graVar = new gra(this, context, (byte) 0);
        this.b2 = graVar;
        graVar.setOrientation(1);
        graVar.setPadding(gm.L(14.0f) + this.u0, gm.L(16.0f), gm.L(14.0f) + this.u0, gm.L(68.0f));
        jp0Var.addView(graVar, qoe.e(-1, -1, 55));
        LinearLayout linearLayout = new LinearLayout(context);
        this.e3 = linearLayout;
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        this.f3 = textView;
        textView.setSingleLine(true);
        textView.setGravity(17);
        textView.setIncludeFontPadding(false);
        ts2.s(textView, 1, 40.0f);
        int i4 = cmb.Ei;
        anb.X(textView, i4, ylbVar);
        linearLayout.addView(textView, qoe.r(-1, 50, 1));
        TextView textView2 = new TextView(context);
        this.g3 = textView2;
        textView2.setGravity(17);
        textView2.setIncludeFontPadding(false);
        textView2.setTextSize(1, 14.0f);
        anb.X(textView2, cmb.y6, ylbVar);
        linearLayout.addView(textView2, qoe.t(-1, 20, 1, 0, 3, 0, 0));
        graVar.addView(linearLayout, qoe.k(0.0f, 4.0f, 0.0f, 16.0f, -1, -2));
        linearLayout.setVisibility(8);
        l66 l66Var = new l66(context, ylbVar);
        this.c2 = l66Var;
        int i5 = cmb.p5;
        anb.X(l66Var, i5, ylbVar);
        l66Var.setTextSize(1, 12.0f);
        l66Var.setGravity(17);
        l66Var.setLineSpacing(gm.L(2.0f), 1.0f);
        anb.G(l66Var, cmb.Wc, ylbVar);
        l66Var.setDisablePaddingsOffsetY(true);
        graVar.addView(l66Var, qoe.t(-2, -2, 1, 4, -2, 4, 16));
        l66Var.setVisibility(8);
        mhb mhbVar = new mhb(context, ylbVar);
        this.d2 = mhbVar;
        graVar.addView(mhbVar, qoe.k(0.0f, 0.0f, 0.0f, 12.0f, -1, -2));
        l66 l66Var2 = new l66(context, ylbVar);
        this.e2 = l66Var2;
        anb.X(l66Var2, i5, ylbVar);
        l66Var2.setTextSize(1, 12.0f);
        l66Var2.setGravity(17);
        l66Var2.setLineSpacing(gm.L(2.0f), 1.0f);
        anb.G(l66Var2, i4, ylbVar);
        l66Var2.setDisablePaddingsOffsetY(true);
        l66Var2.setPadding(gm.L(5.0f), 0, gm.L(5.0f), 0);
        graVar.addView(l66Var2, qoe.t(-2, -2, 1, 4, 2, 4, 8));
        l66Var2.setVisibility(8);
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.t2 = linearLayout2;
        linearLayout2.setPadding(gm.L(12.0f), gm.L(8.0f), gm.L(12.0f), gm.L(8.0f));
        linearLayout2.setOrientation(0);
        int i6 = cmb.h6;
        fg0 Y = cmb.Y(cmb.v0(i6, ylbVar), 21, 21);
        wmb M = anb.M(i6);
        linearLayout2.setBackground(Y);
        anb.j(linearLayout2, Y, null, M, ylbVar);
        jh2 jh2Var = new jh2(24, ylbVar, context);
        this.u2 = jh2Var;
        int i7 = cmb.g7;
        int i8 = cmb.i7;
        int i9 = cmb.j7;
        jh2Var.b(i7, i8, i9);
        jh2Var.setDrawUnchecked(true);
        jh2Var.a(false, false);
        jh2Var.setDrawBackgroundAsArc(10);
        linearLayout2.addView(jh2Var, qoe.t(26, 26, 16, 0, 0, 0, 0));
        TextView textView3 = new TextView(context);
        int i10 = cmb.i5;
        anb.X(textView3, i10, ylbVar);
        ts2.q(14.0f, 1, 2131750322, textView3, null);
        linearLayout2.addView(textView3, qoe.t(-2, -2, 16, 9, 0, 0, 0));
        graVar.addView(linearLayout2, qoe.t(-2, -2, 1, 0, -4, 0, 4));
        rve.b(linearLayout2, 0.025f, 1.5f);
        linearLayout2.setOnClickListener(new lpa(this, (byte) 24));
        linearLayout2.setVisibility(8);
        gra graVar2 = new gra(this, context, (byte) 1);
        this.n2 = graVar2;
        graVar2.setOrientation(1);
        graVar2.setPadding(gm.L(4.0f) + this.u0, gm.L(24.0f), gm.L(4.0f) + this.u0, gm.L(66.0f));
        jp0Var.addView(graVar2, qoe.e(-1, -1, 55));
        this.o2 = r7;
        ac acVar = new ac(ylbVar, context, false);
        acVar.a(2131231826, jb6.M0(2131749798, null), jb6.M0(2131749349, null));
        graVar2.addView(r7[0], qoe.o(-1, -2));
        ac acVar2 = new ac(ylbVar, context, false);
        acVar2.a(2131231822, jb6.M0(2131749792, null), jb6.M0(2131749347, null));
        graVar2.addView(r7[1], qoe.o(-1, -2));
        ac acVar3 = new ac(ylbVar, context, false);
        ac[] acVarArr = {acVar, acVar2, acVar3};
        acVar3.a(2131231929, jb6.M0(2131749344, null), jb6.M0(2131749345, null));
        graVar2.addView(acVarArr[2], qoe.o(-1, -2));
        View view3 = new View(context);
        this.p2 = view3;
        int i11 = cmb.c7;
        anb.h(i11, ylbVar, view3);
        graVar2.addView(view3, qoe.n(1.0f / gm.p, -2, 7, 17, -4, 17, 6));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.q2 = linearLayout3;
        linearLayout3.setPadding(gm.L(12.0f), gm.L(8.0f), gm.L(12.0f), gm.L(8.0f));
        linearLayout3.setOrientation(0);
        fg0 Y2 = cmb.Y(cmb.v0(i6, ylbVar), 6, 6);
        wmb M2 = anb.M(i6);
        linearLayout3.setBackground(Y2);
        anb.j(linearLayout3, Y2, null, M2, ylbVar);
        jh2 jh2Var2 = new jh2(24, ylbVar, context);
        this.r2 = jh2Var2;
        jh2Var2.b(i7, i8, i9);
        jh2Var2.setDrawUnchecked(true);
        jh2Var2.a(false, false);
        jh2Var2.setDrawBackgroundAsArc(10);
        linearLayout3.addView(jh2Var2, qoe.t(26, 26, 16, 0, 0, 0, 0));
        TextView textView4 = new TextView(context);
        this.s2 = textView4;
        anb.X(textView4, i10, ylbVar);
        ts2.q(14.0f, 1, 2131750330, textView4, null);
        linearLayout3.addView(textView4, qoe.t(-2, -2, 16, 9, 0, 0, 0));
        graVar2.addView(linearLayout3, qoe.t(-2, -2, 1, 0, 0, 0, 4));
        rve.b(linearLayout3, 0.025f, 1.5f);
        gra graVar3 = new gra(this, context, (byte) 2);
        this.w2 = graVar3;
        graVar3.setOrientation(1);
        graVar3.setPadding(gm.L(4.0f) + this.u0, gm.L(20.0f), gm.L(4.0f) + this.u0, gm.L(66.0f));
        jp0Var.addView(graVar3, qoe.e(-1, -1, 55));
        TextView textView5 = new TextView(context);
        this.x2 = textView5;
        anb.X(textView5, i10, ylbVar);
        textView5.setTextSize(1, 20.0f);
        textView5.setGravity(17);
        textView5.setTypeface(gm.o());
        graVar3.addView(textView5, qoe.t(-1, -2, 7, 20, 0, 20, 0));
        TextView textView6 = new TextView(context);
        anb.X(textView6, i10, ylbVar);
        textView6.setTextSize(1, 14.0f);
        hg9.p(textView6, 17, null, 2131749767);
        graVar3.addView(textView6, qoe.t(-1, -2, 7, 20, 6, 20, 24));
        ac acVar4 = new ac(ylbVar, context, false);
        acVar4.a(2131231826, jb6.M0(2131749773, null), jb6.M0(2131749774, null));
        graVar3.addView(r6[0], qoe.o(-1, -2));
        ac acVar5 = new ac(ylbVar, context, false);
        acVar5.a(2131231804, jb6.M0(2131749771, null), jb6.M0(2131749772, null));
        graVar3.addView(r6[1], qoe.o(-1, -2));
        ac acVar6 = new ac(ylbVar, context, false);
        ac[] acVarArr2 = {acVar4, acVar5, acVar6};
        acVar6.a(2131231916, jb6.M0(2131749769, null), jb6.M0(2131749770, null));
        graVar3.addView(acVarArr2[2], qoe.o(-1, -2));
        gra graVar4 = new gra(this, context, (byte) 3);
        this.y2 = graVar4;
        graVar4.setOrientation(1);
        graVar4.setPadding(gm.L(4.0f) + this.u0, gm.L(10.0f), gm.L(4.0f) + this.u0, gm.L(92.0f));
        jp0Var.addView(graVar4, qoe.e(-1, -1, 55));
        ac acVar7 = new ac(ylbVar, context, false);
        acVar7.a(2131231826, jb6.M0(2131749718, null), jb6.M0(2131749719, null));
        graVar4.addView(r7[0], qoe.o(-1, -2));
        ac acVar8 = new ac(ylbVar, context, false);
        acVar8.a(2131231878, jb6.M0(2131749716, null), jb6.M0(2131749717, null));
        graVar4.addView(r7[1], qoe.o(-1, -2));
        ac acVar9 = new ac(ylbVar, context, false);
        ac[] acVarArr3 = {acVar7, acVar8, acVar9};
        acVar9.a(2131231800, jb6.M0(2131749714, null), jb6.M0(2131749715, null));
        graVar4.addView(acVarArr3[2], qoe.o(-1, -2));
        graVar.setAlpha(1.0f);
        graVar2.setAlpha(0.0f);
        graVar3.setAlpha(0.0f);
        graVar4.setAlpha(0.0f);
        ssa ssaVar = new ssa(context, ylbVar, new npa(this, (byte) 17), new lpa(this, (byte) 25), new lpa(this, (byte) 26), new lpa(this, (byte) 27), new lpa(this, (byte) 28), new lpa(this, (byte) 29), new rqa(this, (byte) 0), new rqa(this, (byte) 1));
        this.a2 = ssaVar;
        ssaVar.N.c.setOnClickListener(new lpa(this, (byte) 22));
        int i12 = this.u0;
        ssaVar.setPadding(i12, 0, i12, 0);
        jp0Var.addView(ssaVar, qoe.e(-1, -2, 55));
        zs zsVar = this.m1;
        this.J1 = true;
        zsVar.j1(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.g2 = frameLayout;
        anb.h(i2, ylbVar, frameLayout);
        View view4 = new View(context);
        this.j2 = view4;
        anb.h(i11, ylbVar, view4);
        view4.setAlpha(0.0f);
        frameLayout.addView(view4, qoe.a(-1.0f, 1.0f / gm.p, 55));
        b61 i13 = mlb.i(24, ylbVar, context, true);
        this.f2 = i13;
        i13.i(jb6.M0(2131747564, null), false, true);
        i13.g(null, false);
        FrameLayout.LayoutParams d = qoe.d(-1, 48.0f, 119, 0.0f, 12.0f, 0.0f, 12.0f);
        d.leftMargin = gm.L(14.0f) + this.u0;
        d.rightMargin = gm.L(14.0f) + this.u0;
        frameLayout.addView(i13, d);
        jp0Var.addView(frameLayout, qoe.e(-1, 72, 87));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.i2 = frameLayout2;
        anb.h(i2, ylbVar, frameLayout2);
        l66 l66Var3 = new l66(context, null);
        this.h2 = l66Var3;
        l66Var3.setTextSize(1, 12.0f);
        anb.X(l66Var3, i4, ylbVar);
        anb.G(l66Var3, i4, ylbVar);
        l66Var3.setGravity(17);
        frameLayout2.addView(l66Var3, qoe.d(-1, -2.0f, 17, 16.0f, 8.0f, 16.0f, 14.0f));
        jp0Var.addView(frameLayout2, qoe.e(-1, -2, 87));
        frameLayout2.setVisibility(8);
        this.n1.setOnScrollListener(new so7(this, (byte) 26));
        linearLayout3.setOnClickListener(new lpa(this, (byte) 23));
        uj4 uj4Var = new uj4(context);
        this.V1 = uj4Var;
        jp0Var.addView(uj4Var, qoe.c(-1.0f, -1));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.k2 = frameLayout3;
        frameLayout3.setPadding(gm.L(6.0f) + this.u0, 0, gm.L(6.0f) + this.u0, 0);
        jp0Var.addView(frameLayout3, qoe.d(-1, 200.0f, 87, 0.0f, 0.0f, 0.0f, 60.0f));
        gm.B2(this.o1);
        jp0Var.addView(this.o1, qoe.d(-1, -2.0f, 0, 6.0f, 0.0f, 6.0f, 0.0f));
        hra hraVar = new hra(context);
        this.Z1 = hraVar;
        jp0Var.addView(hraVar, qoe.e(-1, -2, 55));
        ArrayList arrayList = new ArrayList();
        if (view != null) {
            arrayList.add(view);
        }
        gm.k2(new eg9(hraVar, (byte) 8), 12.0f, 12, arrayList);
    }

    public static boolean D1(int i, TL_stars.StarGift starGift) {
        if (fs7.m(starGift)) {
            gs gsVar = oc7.r1(i).l4;
            if (!gsVar.n0.f) {
                return true;
            }
            if (((TL_stars.TL_starGiftUnique) starGift).fixed_sale) {
                return false;
            }
            return !gsVar.s.f;
        }
        return false;
    }

    public static boolean F1(int i, long j) {
        if (j >= 0) {
            if (z8c.h(i).e() == j) {
                return true;
            }
            return false;
        }
        return sd2.w(5, oc7.r1(i).L0(Long.valueOf(-j)));
    }

    public static boolean G1(int i, long j) {
        if (j >= 0) {
            if (z8c.h(i).e() != j) {
                return false;
            }
            return true;
        }
        TLRPC.Chat L0 = oc7.r1(i).L0(Long.valueOf(-j));
        if (L0 == null || !L0.creator) {
            return false;
        }
        return true;
    }

    public static boolean I1(int i, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        if (tL_starGiftUnique == null) {
            return false;
        }
        TLRPC.Peer peer = tL_starGiftUnique.owner_id;
        if (peer == null) {
            peer = tL_starGiftUnique.host_id;
        }
        long n = pg3.n(peer);
        int i2 = (n > 0L ? 1 : (n == 0L ? 0 : -1));
        if (i2 == 0) {
            return false;
        }
        if (i2 > 0) {
            TLRPC.User W1 = oc7.r1(i).W1(Long.valueOf(n));
            if (W1 != null) {
                TLRPC.EmojiStatus emojiStatus = W1.emoji_status;
                if (!(emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) || ((TLRPC.TL_emojiStatusCollectible) emojiStatus).collectible_id != tL_starGiftUnique.id) {
                    return false;
                }
                return true;
            }
        } else {
            TLRPC.Chat L0 = oc7.r1(i).L0(Long.valueOf(-n));
            if (L0 != null) {
                TLRPC.EmojiStatus emojiStatus2 = L0.emoji_status;
                if ((emojiStatus2 instanceof TLRPC.TL_emojiStatusCollectible) && ((TLRPC.TL_emojiStatusCollectible) emojiStatus2).collectible_id == tL_starGiftUnique.id) {
                    return true;
                }
            }
        }
        return false;
    }

    public static TableRow Y0(mhb mhbVar, String str, String str2, ylb ylbVar) {
        String str3;
        if (!WalletEngine2.isValidAddress(str2)) {
            return mhbVar.f(str, str2, null, null);
        }
        float L = gm.L(14.0f);
        TextView craVar = new cra(mhbVar.getContext(), L);
        craVar.setTypeface(gm.n1("fonts/rmono.ttf"));
        int i = 0;
        craVar.setTextSize(0, L);
        craVar.setLineSpacing(gm.L(2.0f), 1.0f);
        anb.X(craVar, cmb.F6, ylbVar);
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
                spannableStringBuilder.setSpan(new do4(cmb.x6, ylbVar), length, spannableStringBuilder.length(), 33);
            }
            i2++;
            i = i5;
        }
        craVar.setText(spannableStringBuilder);
        return mhbVar.c(craVar, str);
    }

    public static void Z0(mhb mhbVar, TL_stars.StarGiftAttribute starGiftAttribute) {
        String M0;
        if (starGiftAttribute instanceof TL_stars.starGiftAttributeModel) {
            M0 = jb6.M0(2131750320, null);
        } else if (starGiftAttribute instanceof TL_stars.starGiftAttributePattern) {
            M0 = jb6.M0(2131750313, null);
        } else if (starGiftAttribute instanceof TL_stars.starGiftAttributeBackdrop) {
            M0 = jb6.M0(2131750321, null);
        } else {
            return;
        }
        String str = M0;
        Integer[] numArr = new Integer[1];
        mhbVar.e(str, starGiftAttribute.name, z1(starGiftAttribute.rarity, numArr), null, numArr[0]);
    }

    public static void g2(d dVar) {
        d S = LaunchActivity.S();
        if (S == 0) {
            return;
        }
        ?? obj = new Object();
        obj.a = true;
        S.showAsSheet(dVar, obj);
    }

    public static SpannableStringBuilder j2(String str) {
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
            spannableStringBuilder.setSpan(new aa2((byte) 1), indexOf, i + indexOf, 0);
        }
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder k2(String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        SpannableString spannableString = new SpannableString("👌");
        spannableString.setSpan(new pn2(2131231183, 0), 0, spannableString.length(), 33);
        SpannableString spannableString2 = new SpannableString("👍");
        spannableString2.setSpan(new pn2(2131231167, 0), 0, spannableString2.length(), 33);
        gm.I2(spannableStringBuilder, spannableString, "👌");
        gm.I2(spannableStringBuilder, spannableString2, "👍");
        return spannableStringBuilder;
    }

    public static boolean m1(TL_stars.SavedStarGift savedStarGift, TL_stars.SavedStarGift savedStarGift2) {
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

    public static boolean n1(TL_stars.TL_starGiftUnique tL_starGiftUnique, TL_stars.TL_starGiftUnique tL_starGiftUnique2) {
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

    public static String o1(int i) {
        FastDateFormat r0;
        Date date = new Date(i * 1000);
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar.setTime(date);
        jb6 D0 = jb6.D0();
        if (calendar.get(1) == calendar2.get(1)) {
            r0 = D0.p0();
        } else {
            r0 = D0.r0();
        }
        return jb6.a0(null, null, 2131742446, r0.format(date), D0.o0().format(date));
    }

    public static String t1(TL_stars.StarGift starGift) {
        if (starGift instanceof TL_stars.TL_starGiftUnique) {
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
            StringBuilder sb = new StringBuilder();
            sb.append(tL_starGiftUnique.title);
            sb.append(" #");
            return kt6.m(tL_starGiftUnique.num, ',', sb);
        } else if ((starGift instanceof TL_stars.TL_starGift) && !TextUtils.isEmpty(starGift.title)) {
            return starGift.title;
        } else {
            return jb6.M0(2131750125, null);
        }
    }

    public static String z1(TL_stars.StarGiftAttributeRarity starGiftAttributeRarity, Integer[] numArr) {
        if (starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarityUncommon) {
            numArr[0] = -12539616;
            return jb6.M0(2131749396, null);
        } else if (starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarityRare) {
            numArr[0] = -15619394;
            return jb6.M0(2131749397, null);
        } else if (starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarityEpic) {
            numArr[0] = -6988581;
            return jb6.M0(2131749399, null);
        } else if (starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarityLegendary) {
            numArr[0] = -4229632;
            return jb6.M0(2131749398, null);
        } else if (starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarity) {
            int i = ((TL_stars.TL_starGiftAttributeRarity) starGiftAttributeRarity).permille;
            if (i <= 0) {
                return "<0.1%";
            }
            return bc.J0(i);
        } else {
            return "";
        }
    }

    public final TL_stars.TL_starGiftUnique A1() {
        TL_stars.StarGift r1 = r1();
        if (r1 instanceof TL_stars.TL_starGiftUnique) {
            return (TL_stars.TL_starGiftUnique) r1;
        }
        return null;
    }

    public final void A2(boolean z) {
        wsa wsaVar;
        int i;
        int i2;
        TL_stars.TL_starGiftUnique A1 = A1();
        if (A1 == null) {
            return;
        }
        oc7.d1().edit().putInt("statusgiftpage", 3).apply();
        boolean I1 = I1(this.a, A1());
        boolean z2 = !I1;
        boolean I12 = I1(this.a, A1());
        b61 b61Var = this.f2;
        if (I12) {
            oc7.r1(this.a).o5(q1(), new TLRPC.TL_emojiStatusEmpty(), null);
            wsaVar = this;
        } else {
            long q1 = q1();
            if (q1 >= 0) {
                if (!z8c.h(this.a).p()) {
                    u31 P = j().P(2131624211, gm.N2(jb6.M0(2131750356, null), -1, 2, new npa(this, (byte) 3), null));
                    P.u = true;
                    P.j();
                    return;
                }
            } else if (!z) {
                oc7 r1 = oc7.r1(this.a);
                b61Var.setLoading(true);
                oc7.r1(this.a).F0().a(q1, new p2c(this, r1, q1, (byte) 8));
                return;
            }
            wsaVar = this;
            TLRPC.TL_inputEmojiStatusCollectible tL_inputEmojiStatusCollectible = new TLRPC.TL_inputEmojiStatusCollectible();
            tL_inputEmojiStatusCollectible.collectible_id = A1.id;
            oc7.r1(wsaVar.a).o5(wsaVar.q1(), tL_inputEmojiStatusCollectible, A1);
        }
        qw9 qw9Var = wsaVar.a2.J[1];
        if (!I1) {
            i = 2131231105;
            i2 = 2131750355;
        } else {
            i = 2131231106;
            i2 = 2131750358;
        }
        qw9Var.a(i, jb6.M0(i2, null), true);
        if (wsaVar.v2) {
            wsaVar.dismiss();
            return;
        }
        n28 n28Var = new n28((byte) 18, wsaVar, z2);
        if (wsaVar.W2.c(0)) {
            n28Var.run();
        } else {
            wsaVar.z2(0, true, n28Var);
        }
        b61Var.i(jb6.M0(2131747564, null), !wsaVar.Z2, true);
        b61Var.g(null, !wsaVar.Z2);
        b61Var.setOnClickListener(new lpa(wsaVar, (byte) 10));
    }

    public final boolean B1(boolean z) {
        if (x1(z) == null && y1(z) == null) {
            return false;
        }
        return true;
    }

    public final void B2() {
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
    public final boolean C() {
        if (this.W2.c(4)) {
            boolean z = this.a2.N.i0;
        }
        return false;
    }

    public final void C1(byte[] bArr, TwoStepVerificationActivity twoStepVerificationActivity, boolean z, m45 m45Var) {
        TL_stars.getStarGiftWithdrawalUrl getstargiftwithdrawalurl;
        TL_stars.InputSavedStarGift u1 = u1();
        if (u1 == null) {
            if (m45Var != null) {
                m45Var.a(Boolean.FALSE);
                return;
            }
            return;
        }
        if (z) {
            TL_stars.withdrawStarGift withdrawstargift = new TL_stars.withdrawStarGift();
            withdrawstargift.keep_on_profile = this.v3;
            withdrawstargift.stargift = u1;
            withdrawstargift.tmp_password = bArr;
            getstargiftwithdrawalurl = withdrawstargift;
        } else {
            TL_stars.getStarGiftWithdrawalUrl getstargiftwithdrawalurl2 = new TL_stars.getStarGiftWithdrawalUrl();
            getstargiftwithdrawalurl2.stargift = u1;
            getstargiftwithdrawalurl2.tmp_password = bArr;
            getstargiftwithdrawalurl = getstargiftwithdrawalurl2;
        }
        ConnectionsManager.getInstance(this.a).sendRequest(getstargiftwithdrawalurl, new rj1(this, m45Var, twoStepVerificationActivity, z));
    }

    public final void C2() {
        boolean B1 = B1(false);
        fra fraVar = this.U1;
        fraVar.setPosition(B1 ? 1 : 0);
        fraVar.D(false);
        if (this.B2 != null && !B1(true) && this.B2.e() < this.B2.c()) {
            this.B2.a();
        }
    }

    public final void D2() {
        TL_stars.TL_starGiftUnique A1 = A1();
        TL_wallet.nftItem nftitem = this.a3;
        LinearLayout linearLayout = this.t2;
        if (nftitem != null && A1 != null) {
            this.c2.setVisibility(8);
            this.e2.setVisibility(8);
            boolean z = false;
            linearLayout.setVisibility(0);
            if (A1.host_id != null) {
                z = true;
            }
            this.u2.a(z, linearLayout.isAttachedToWindow());
            return;
        }
        linearLayout.setVisibility(8);
    }

    @Override
    public final boolean E() {
        if (this.W2.c(4) && this.a2.N.i0) {
            return false;
        }
        return this.d0;
    }

    public final boolean E1(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        if (tL_starGiftUnique != null && !TextUtils.isEmpty(tL_starGiftUnique.owner_address)) {
            c C = c.C(this.a);
            String x = C.x();
            if (TextUtils.isEmpty(x)) {
                TLRPC.Peer peer = tL_starGiftUnique.host_id;
                if (peer == null || pg3.n(peer) != z8c.h(this.a).e()) {
                    return false;
                }
                return true;
            } else if (c.b(tL_starGiftUnique.owner_address, x) || C.A().c(tL_starGiftUnique.gift_address)) {
                return true;
            }
        }
        return false;
    }

    public final TL_wallet.nftItem E2() {
        TL_wallet.nftItem nftitem = this.a3;
        if (nftitem != null) {
            return nftitem;
        }
        TL_stars.TL_starGiftUnique A1 = A1();
        if (x2(A1)) {
            c C = c.C(this.a);
            if (A1 != null && !TextUtils.isEmpty(A1.gift_address)) {
                ArrayList arrayList = C.A().b;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    TL_wallet.nftItem nftitem2 = (TL_wallet.nftItem) obj;
                    if (c.b(nftitem2.address, A1.gift_address)) {
                        return nftitem2;
                    }
                }
                TL_wallet.nftItem nftitem3 = new TL_wallet.nftItem();
                nftitem3.address = A1.gift_address;
                nftitem3.owner_address = C.x();
                nftitem3.index = "";
                nftitem3.name = A1.title + " #" + A1.num;
                nftitem3.gift = A1;
                return nftitem3;
            }
            return null;
        }
        return null;
    }

    @Override
    public final boolean F(MotionEvent motionEvent) {
        if (this.W2.c(4)) {
            boolean z = this.a2.N.i0;
        }
        return false;
    }

    @Override
    public final q59 G0(r59 r59Var) {
        ny0 ny0Var = new ny0(this, (byte) 10);
        this.O2 = ny0Var;
        return ny0Var;
    }

    public final boolean H1(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        if (wi8.A(tL_starGiftUnique) && fs7.m(tL_starGiftUnique)) {
            if (!tL_starGiftUnique.my_sale && this.a3 == null) {
                TLRPC.Peer peer = tL_starGiftUnique.host_id;
                if (peer == null || pg3.n(peer) != z8c.h(this.a).e()) {
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
    public final int I0() {
        return gm.L(12.0f);
    }

    @Override
    public final CharSequence J0() {
        return this.Q2;
    }

    public final void J1(TL_stars.TL_payments_uniqueStarGift tL_payments_uniqueStarGift) {
        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) tL_payments_uniqueStarGift.gift;
        this.E2 = tL_starGiftUnique;
        o2(tL_starGiftUnique, false, null, null);
        super.show();
    }

    public final void K1(he heVar, k47 k47Var) {
        heVar.dismiss();
        this.H2 = true;
        l2(k47Var, null);
        super.show();
    }

    public final void L1(he heVar, TL_stars.SavedStarGift savedStarGift) {
        if (savedStarGift != null) {
            heVar.dismiss();
            this.J2 = true;
            n2(savedStarGift, null);
            super.show();
            return;
        }
        heVar.dismiss();
        d S = LaunchActivity.S();
        if (S != null) {
            u31 Q = c41.b0(S).Q(2131624012, 36, jb6.M0(2131748309, null));
            Q.u = true;
            Q.j();
        }
    }

    public final void M1() {
        ok okVar;
        TL_stars.TL_starGiftUnique A1 = A1();
        b61 b61Var = this.f2;
        if (!b61Var.R && A1 != null && !D1(this.a, A1) && !H1(A1)) {
            boolean m = fs7.m(A1);
            TL_stars.TL_starGiftUnique tL_starGiftUnique = this.E2;
            long j = this.S1;
            if (m) {
                if (tL_starGiftUnique == null || !this.F2 || j == 0) {
                    j = z8c.h(this.a).e();
                }
                long j2 = j;
                if (this.E2 != null && this.F2 && j2 != z8c.h(this.a).e()) {
                    fw4 fw4Var = new fw4(getContext(), this.J0, A1, j2);
                    fw4Var.E1 = new zn1(this, fw4Var, A1, j2, (byte) 8);
                    fw4Var.show();
                    return;
                }
                d1(A1, j2, null, true, null);
                return;
            }
            if (tL_starGiftUnique == null || !this.F2 || j == 0) {
                j = z8c.h(this.a).e();
            }
            long j3 = j;
            if (A1.resale_ton_only) {
                okVar = ok.b;
            } else {
                okVar = ok.a;
            }
            ok okVar2 = okVar;
            if (this.E2 != null && this.F2 && j3 != z8c.h(this.a).e()) {
                fw4 fw4Var2 = new fw4(getContext(), this.J0, A1, j3);
                fw4Var2.E1 = new jp1(this, fw4Var2, A1, j3, okVar2, (byte) 3);
                fw4Var2.show();
                return;
            }
            b61Var.setLoading(true);
            jva.u(this.a, okVar2).E(A1, j3, null, true, new tpa(this, null, okVar2, A1, j3, null, true));
        }
    }

    public final void N1() {
        yqa yqaVar = this.U2;
        if (yqaVar != null && !yqaVar.J) {
            yqaVar.dismiss();
        }
        String v1 = v1();
        yqa yqaVar2 = new yqa(this, getContext(), v1, v1, this.J0);
        this.U2 = yqaVar2;
        yqaVar2.n2 = new et8(this, (byte) 14);
        yqaVar2.show();
    }

    public final void O1() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wsa.O1():void");
    }

    public final void P1(TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, boolean z) {
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
                twoStepVerificationActivity.t0();
            }
            c41.c0("NULL_ERROR");
        } else if (!"PASSWORD_MISSING".equals(tL_error.text) && !tL_error.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error.text.startsWith("SESSION_TOO_FRESH_")) {
            if ("SRP_ID_INVALID".equals(tL_error.text)) {
                ConnectionsManager.getInstance(this.a).sendRequest(new TL_account.getPassword(), new pqa(this, twoStepVerificationActivity, z, (byte) 1), 8);
                return;
            }
            if (twoStepVerificationActivity != null) {
                twoStepVerificationActivity.t0();
                twoStepVerificationActivity.finishFragment();
            }
            if (z && ("WALLET_CREATING".equals(tL_error.text) || "WALLET_UNAVAILABLE".equals(tL_error.text))) {
                fs7.q(getContext(), this.a, this.J0, null, tL_error.text, null);
                return;
            }
            String str = tL_error.text;
            if (str != null && str.startsWith("FLOOD_WAIT")) {
                mlb.y(null, 2131750619, c41.Y(), null);
            } else {
                c41.e0(tL_error);
            }
        } else {
            if (twoStepVerificationActivity != null) {
                twoStepVerificationActivity.t0();
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
            String M0 = jb6.M0(2131749833, null);
            he heVar = alertDialog$Builder.a;
            heVar.S = M0;
            LinearLayout linearLayout = new LinearLayout(getContext());
            linearLayout.setPadding(gm.L(24.0f), gm.L(2.0f), gm.L(24.0f), 0);
            linearLayout.setOrientation(1);
            alertDialog$Builder.n(linearLayout);
            TextView textView = new TextView(getContext());
            int i8 = cmb.i5;
            anb.X(textView, i8, null);
            textView.setTextSize(1, 16.0f);
            if (jb6.a0) {
                i = 5;
            } else {
                i = 3;
            }
            textView.setGravity(i | 48);
            textView.setText(gm.S2(jb6.M0(2131749837, null)));
            linearLayout.addView(textView, qoe.o(-1, -2));
            LinearLayout linearLayout2 = new LinearLayout(getContext());
            linearLayout2.setOrientation(0);
            linearLayout.addView(linearLayout2, qoe.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
            ImageView imageView = new ImageView(getContext());
            imageView.setImageResource(2131231628);
            if (jb6.a0) {
                i2 = gm.L(11.0f);
            } else {
                i2 = 0;
            }
            int L3 = gm.L(9.0f);
            if (jb6.a0) {
                L = 0;
            } else {
                L = gm.L(11.0f);
            }
            imageView.setPadding(i2, L3, L, 0);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            anb.s(imageView, i8, null, mode);
            TextView textView2 = new TextView(getContext());
            anb.X(textView2, i8, null);
            textView2.setTextSize(1, 16.0f);
            if (jb6.a0) {
                i3 = 5;
            } else {
                i3 = 3;
            }
            textView2.setGravity(i3 | 48);
            textView2.setText(gm.S2(jb6.M0(2131749836, null)));
            if (jb6.a0) {
                linearLayout2.addView(textView2, qoe.o(-1, -2));
                linearLayout2.addView(imageView, qoe.r(-2, -2, 5));
            } else {
                linearLayout2.addView(imageView, qoe.o(-2, -2));
                linearLayout2.addView(textView2, qoe.o(-1, -2));
            }
            LinearLayout linearLayout3 = new LinearLayout(getContext());
            linearLayout3.setOrientation(0);
            linearLayout.addView(linearLayout3, qoe.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
            ImageView imageView2 = new ImageView(getContext());
            imageView2.setImageResource(2131231628);
            if (jb6.a0) {
                i4 = gm.L(11.0f);
            } else {
                i4 = 0;
            }
            int L4 = gm.L(9.0f);
            if (jb6.a0) {
                L2 = 0;
            } else {
                L2 = gm.L(11.0f);
            }
            imageView2.setPadding(i4, L4, L2, 0);
            anb.s(imageView2, i8, null, mode);
            TextView textView3 = new TextView(getContext());
            anb.X(textView3, i8, null);
            textView3.setTextSize(1, 16.0f);
            if (jb6.a0) {
                i5 = 5;
            } else {
                i5 = 3;
            }
            textView3.setGravity(i5 | 48);
            textView3.setText(gm.S2(jb6.M0(2131749835, null)));
            if (jb6.a0) {
                linearLayout3.addView(textView3, qoe.o(-1, -2));
                i6 = 5;
                linearLayout3.addView(imageView2, qoe.r(-2, -2, 5));
            } else {
                i6 = 5;
                linearLayout3.addView(imageView2, qoe.o(-2, -2));
                linearLayout3.addView(textView3, qoe.o(-1, -2));
            }
            if ("PASSWORD_MISSING".equals(tL_error.text)) {
                alertDialog$Builder.j(jb6.M0(2131749832, null), new dq9(this, (byte) 24));
                alertDialog$Builder.g(jb6.M0(2131752542, null), null);
            } else {
                TextView textView4 = new TextView(getContext());
                anb.X(textView4, i8, null);
                textView4.setTextSize(1, 16.0f);
                if (jb6.a0) {
                    i7 = i6;
                } else {
                    i7 = 3;
                }
                hg9.p(textView4, i7 | 48, null, 2131749834);
                linearLayout.addView(textView4, qoe.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                alertDialog$Builder.g(jb6.M0(2131747564, null), null);
            }
            if (twoStepVerificationActivity != null) {
                twoStepVerificationActivity.showDialog(heVar);
            } else {
                alertDialog$Builder.o();
            }
        }
    }

    public final void Q1() {
        TL_stars.TL_starGiftUnique A1 = A1();
        if (A1 == null) {
            return;
        }
        if (fs7.u(A1)) {
            if (h1()) {
                V1();
                return;
            } else {
                fs7.q(getContext(), this.a, this.J0, j(), "STARGIFT_ONCHAIN_SALE_DISABLED", Boolean.valueOf(A1.fixed_sale));
                return;
            }
        }
        nxa.j1(getContext(), this.a, A1, new vqa(this, A1, (byte) 2), this.J0);
    }

    public final void R1() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wsa.R1():void");
    }

    public final void S1() {
        if (z8c.h(this.a).p() && (I1(this.a, A1()) || this.T2)) {
            A2(false);
            return;
        }
        TL_stars.TL_starGiftUnique A1 = A1();
        if (A1 == null) {
            return;
        }
        TLRPC.Peer peer = A1.owner_id;
        if (peer == null) {
            peer = A1.host_id;
        }
        long n = pg3.n(peer);
        StringBuilder sb = new StringBuilder();
        sb.append(A1.title);
        sb.append(" #");
        this.x2.setText(jb6.a0(null, null, 2131749766, kt6.m(A1.num, ',', sb)));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(jb6.M0(2131749768, null));
        if (!z8c.h(this.a).p()) {
            spannableStringBuilder.append((CharSequence) " l");
            pn2 pn2Var = this.S2;
            if (pn2Var == null) {
                pn2Var = new pn2(2131232249, 0);
                this.S2 = pn2Var;
            }
            spannableStringBuilder.setSpan(pn2Var, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        b61 b61Var = this.f2;
        b61Var.i(spannableStringBuilder, true, true);
        b61Var.g(null, true);
        b61Var.setOnClickListener(new lpa(this, (byte) 9));
        this.a2.setWearPreview(oc7.r1(this.a).a2(n));
        z2(2, true, null);
    }

    public final void T1(boolean z) {
        int i;
        k47 k47Var = this.C2;
        int i2 = 0;
        if (k47Var != null) {
            TLRPC.Message message = k47Var.k;
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
            alertDialog$Builder.a.S = jb6.M0(2131749710, null);
            alertDialog$Builder.a.U = jb6.a0(null, null, 2131749711, jb6.x(i, true));
            b10.t(null, 2131747564, alertDialog$Builder, null);
            return;
        }
        TL_stars.TL_starGiftUnique A1 = A1();
        if (A1 == null) {
            return;
        }
        if (!TextUtils.isEmpty(A1.gift_address) && !oc7.r1(this.a).l4.w.f) {
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, this.J0, getContext());
            alertDialog$Builder2.a.S = jb6.M0(2131749725, null);
            alertDialog$Builder2.a.U = jb6.M0(2131749726, null);
            b10.t(null, 2131747564, alertDialog$Builder2, null);
            return;
        }
        if (z) {
            this.a2.N.a(this.a, A1.gift_id, A1.getDocument(), A1.title);
            if (f1()) {
                ura uraVar = this.a2.N;
                TL_stars.TL_starGiftUnique A12 = A1();
                if (A12 == null) {
                    uraVar.getClass();
                } else {
                    while (true) {
                        sra[] sraVarArr = uraVar.n;
                        if (i2 >= sraVarArr.length) {
                            break;
                        }
                        sra sraVar = sraVarArr[i2];
                        TL_stars.StarGift starGift = sraVar.h;
                        if (starGift == null) {
                            starGift = null;
                        }
                        if (starGift == null) {
                            sraVar.a(A12, true);
                            break;
                        }
                        i2++;
                    }
                    uraVar.d(true);
                }
            }
        }
        this.a2.N.setOnCraft(new spa(this, (byte) 1));
        if (this.R2 == null) {
            xb9 xb9Var = new xb9(this.a, A1.gift_id);
            this.R2 = xb9Var;
            xb9Var.a();
        }
        this.a2.N.setOnAddGift(new vqa(this, A1, (byte) 1));
        this.a2.N.setOnClose(new tqa(this, (byte) 2));
        z2(4, true, null);
    }

    @Override
    public final boolean U0() {
        return false;
    }

    public final void U1(long j) {
        if (j > 0 && m9c.c(oc7.r1(this.a).X1(j))) {
            j().Q(2131624012, 36, gm.S2(jb6.a0(null, null, 2131743429, pg3.s(j)))).k(false);
        } else {
            new ux4(getContext(), this.a, j, null, new qpa(this, (byte) 0)).show();
        }
    }

    public final void V1() {
        TL_stars.TL_starGiftUnique A1 = A1();
        if (A1 != null && A1.fixed_sale) {
            if (!h1()) {
                return;
            }
            ms7 ms7Var = new ms7(this.a, this.J0, new wpa(this, r5, A1, (byte) 1), getContext());
            ms7[] ms7VarArr = {ms7Var};
            ok okVar = ok.b;
            long j = A1.getResellAmount(okVar).b;
            ms7Var.u1 = true;
            ms7Var.v1 = j;
            ms7Var.r1.setText(jb6.M0(2131750197, null));
            if (j > 0) {
                String b = nk.j(j, okVar).b();
                EditTextBoldCursor editTextBoldCursor = ms7Var.n1;
                InputFilter[] filters = editTextBoldCursor.getFilters();
                editTextBoldCursor.setFilters(new InputFilter[0]);
                ms7Var.w1 = true;
                editTextBoldCursor.setText(b);
                ms7Var.w1 = false;
                editTextBoldCursor.setFilters(filters);
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
            }
            ms7Var.D0(ms7Var.s1);
            ms7VarArr[0].show();
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.J0, getContext());
        String M0 = jb6.M0(2131750197, null);
        he heVar = alertDialog$Builder.a;
        heVar.S = M0;
        heVar.U = jb6.M0(2131749599, null);
        alertDialog$Builder.j(jb6.M0(2131750365, null), new ypa(this, (byte) 0));
        alertDialog$Builder.g(jb6.M0(2131752542, null), null);
        alertDialog$Builder.o();
    }

    public final void W1() {
        boolean z;
        int i;
        TL_stars.TL_starGiftUnique A1 = A1();
        if (!h1()) {
            return;
        }
        ms7[] ms7VarArr = {new ms7(this.a, this.J0, new wpa(this, ms7VarArr, A1, (byte) 0), getContext())};
        gs gsVar = oc7.r1(this.a).l4;
        ms7 ms7Var = ms7VarArr[0];
        if (A1 != null && A1.onchain_sale) {
            z = A1.fixed_sale;
        } else {
            z = gsVar.t.f;
        }
        ms7Var.x1 = z;
        if (!ms7Var.u1) {
            TextView textView = ms7Var.r1;
            if (z) {
                i = 2131749478;
            } else {
                i = 2131749465;
            }
            textView.setText(jb6.M0(i, null));
        }
        ms7Var.D0(ms7Var.s1);
        ms7VarArr[0].show();
    }

    public final void X1() {
        TL_stars.TL_starGiftUnique A1 = A1();
        if (h1()) {
            Context context = getContext();
            int i = this.a;
            ylb ylbVar = this.J0;
            b61 b61Var = this.f2;
            Objects.requireNonNull(b61Var);
            ci7 ci7Var = new ci7(b61Var, (byte) 6);
            c41 j = j();
            npa npaVar = new npa(this, (byte) 9);
            if (A1 != null && !TextUtils.isEmpty(A1.slug)) {
                TL_stars.cancelStarGiftOnchainSale cancelstargiftonchainsale = new TL_stars.cancelStarGiftOnchainSale();
                cancelstargiftonchainsale.slug = A1.slug;
                fs7.o(context, i, cancelstargiftonchainsale, Boolean.valueOf(A1.fixed_sale), ylbVar, ci7Var, j, new e55(A1, context, i, ylbVar, fs7.h(A1), npaVar));
            }
        }
    }

    public final void Y1(long j) {
        hg5 hg5Var = this.w3;
        if (hg5Var != null) {
            hg5Var.f(true);
            this.w3 = null;
        }
        dismiss();
        d S = LaunchActivity.S();
        if (S != null && !m9c.C(j)) {
            Bundle bundle = new Bundle();
            if (j > 0) {
                bundle.putLong("user_id", j);
                if (j == z8c.h(this.a).e()) {
                    bundle.putBoolean("my_profile", true);
                }
            } else {
                bundle.putLong("chat_id", -j);
            }
            bundle.putBoolean("open_gifts", true);
            S.presentFragment(new ProfileActivity(bundle, null));
        }
    }

    public final void Z1(boolean z, k11 k11Var, Runnable runnable) {
        byte b;
        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
        if (z) {
            b = 3;
        } else {
            b = 2;
        }
        ci ciVar = new ci(this, twoStepVerificationActivity, z, (byte) 12);
        twoStepVerificationActivity.a0 = b;
        twoStepVerificationActivity.c0 = ciVar;
        twoStepVerificationActivity.b0 = s1();
        twoStepVerificationActivity.x0(new hw9(this, runnable, k11Var, twoStepVerificationActivity));
    }

    public final void a1(TL_stars.StarGiftAttribute starGiftAttribute) {
        String M0;
        boolean z;
        hsa hsaVar;
        wsa wsaVar;
        TL_stars.StarGiftAttribute starGiftAttribute2;
        no8 no8Var;
        if (starGiftAttribute instanceof TL_stars.starGiftAttributeModel) {
            M0 = jb6.M0(2131750320, null);
            z = true;
        } else if (starGiftAttribute instanceof TL_stars.starGiftAttributePattern) {
            M0 = jb6.M0(2131750313, null);
            z = true;
        } else if (starGiftAttribute instanceof TL_stars.starGiftAttributeBackdrop) {
            M0 = jb6.M0(2131750321, null);
            z = false;
        } else {
            return;
        }
        if (!this.L2 && ((hsaVar = this.K2) == null || !hsaVar.o)) {
            boolean[] zArr = new boolean[1];
            x51[] x51VarArr = new x51[1];
            Integer[] numArr = new Integer[1];
            String z1 = z1(starGiftAttribute.rarity, numArr);
            if (starGiftAttribute.rarity instanceof TL_stars.TL_starGiftAttributeRarity) {
                wsaVar = this;
                starGiftAttribute2 = starGiftAttribute;
                no8Var = new no8(wsaVar, zArr, starGiftAttribute2, x51VarArr, (byte) 24);
            } else {
                wsaVar = this;
                starGiftAttribute2 = starGiftAttribute;
                no8Var = null;
            }
            x51VarArr[0] = (x51) ((jhb) wsaVar.d2.e(M0, starGiftAttribute2.name, z1, no8Var, numArr[0]).getChildAt(1)).getChildAt(0);
            return;
        }
        msa msaVar = new msa(getContext(), this.J0, new spa(this, (byte) 0));
        TableRow tableRow = new TableRow(getContext());
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
        mhb mhbVar = this.d2;
        tableRow.addView(new lhb(mhbVar, M0), layoutParams);
        tableRow.addView(new jhb(mhbVar, msaVar, true), new TableRow.LayoutParams(0, -1, 1.0f));
        mhbVar.addView(tableRow);
        hsa hsaVar2 = this.K2;
        if (hsaVar2 != null) {
            if (!z) {
                hsaVar2.d = msaVar;
            }
            if (z) {
                hsaVar2.c = msaVar;
            }
            if (z) {
                hsaVar2.b = msaVar;
            }
        }
    }

    public final void a2() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wsa.a2():void");
    }

    public final void b1(LinearLayout linearLayout, int i, int i2, int i3, String str, boolean z) {
        int i4;
        int i5;
        ImageView imageView = new ImageView(getContext());
        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(i);
        ylb ylbVar = this.J0;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        anb.s(imageView, i3, ylbVar, mode);
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
        linearLayout.addView(imageView, qoe.t(i2, i2, 16, i4, 0, i5, 0));
        TextView textView = new TextView(getContext());
        textView.setTextSize(1, 13.0f);
        int i6 = cmb.q5;
        anb.X(textView, i6, this.J0);
        textView.setText(str);
        linearLayout.addView(textView, qoe.t(-2, -2, 16, 4, 0, 0, 0));
        if (z) {
            ImageView imageView2 = new ImageView(getContext());
            imageView2.setScaleType(scaleType);
            imageView2.setImageResource(2131232256);
            anb.s(imageView2, i6, this.J0, mode);
            linearLayout.addView(imageView2, qoe.t(11, 11, 16, 5, 0, 2, 0));
        }
    }

    public final void b2(long j, long j2, SpannableStringBuilder spannableStringBuilder, boolean z, qac qacVar) {
        String str;
        TLRPC.User user;
        String a0;
        SpannableStringBuilder S2;
        CharSequence M0;
        TL_stars.TL_starGiftUnique A1 = A1();
        if (A1 == null) {
            return;
        }
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        int i2 = this.a;
        if (i >= 0) {
            TLRPC.User W1 = oc7.r1(i2).W1(Long.valueOf(j));
            str = m9c.l(W1);
            user = W1;
        } else {
            TLRPC.Chat L0 = oc7.r1(i2).L0(Long.valueOf(-j));
            if (L0 == null) {
                str = "";
                user = L0;
            } else {
                str = L0.title;
                user = L0;
            }
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.addView(new wra(getContext(), A1, user), qoe.t(-1, -2, 48, 0, -4, 0, 0));
        TextView textView = new TextView(getContext());
        anb.X(textView, cmb.i5, this.J0);
        textView.setTextSize(1, 16.0f);
        if (spannableStringBuilder != null) {
            S2 = spannableStringBuilder;
        } else {
            if (j2 > 0) {
                a0 = jb6.K("Gift2TransferPriceText", (int) j2, ',', s1(), pg3.s(j));
            } else {
                a0 = jb6.a0(null, null, 2131749846, s1(), str);
            }
            S2 = gm.S2(a0);
        }
        textView.setText(S2);
        linearLayout.addView(textView, qoe.t(-1, -2, 48, 24, 4, 24, 4));
        mhb mhbVar = new mhb(getContext(), this.J0);
        Z0(mhbVar, jva.i(A1.attributes, TL_stars.starGiftAttributeModel.class));
        Z0(mhbVar, jva.i(A1.attributes, TL_stars.starGiftAttributeBackdrop.class));
        Z0(mhbVar, jva.i(A1.attributes, TL_stars.starGiftAttributePattern.class));
        if (!TextUtils.isEmpty(A1.slug) && (A1.flags & 256) != 0) {
            cj0.h();
            mhbVar.f(jb6.M0(2131749365, null), b10.h("~", cj0.f(A1.value_currency, cj0.h().g(A1.value_currency), A1.value_amount, true)), null, null);
        }
        linearLayout.addView(mhbVar, qoe.t(-1, -2, 48, 23, 16, 23, 4));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.J0, getContext());
        alertDialog$Builder.n(linearLayout);
        if (j2 > 0) {
            M0 = nxa.T0(jb6.a0(null, null, 2131749853, Integer.valueOf((int) j2)));
        } else {
            M0 = jb6.M0(2131749854, null);
        }
        alertDialog$Builder.j(M0, new a72(qacVar, (byte) 2));
        alertDialog$Builder.g(jb6.M0(2131752542, null), null);
        he heVar = alertDialog$Builder.a;
        heVar.Y0 = z;
        heVar.show();
    }

    public final void c1(TL_stars.InputSavedStarGift inputSavedStarGift, TLRPC.Updates updates, Runnable runnable) {
        TLRPC.Message message;
        TL_stars.StarGift starGift;
        if (updates == null) {
            jva.v(this.a, false).M(q1());
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
                    n2(savedStarGift2, this.B2);
                    this.m3 = null;
                    this.L2 = false;
                    bva bvaVar = this.B2;
                    if (bvaVar != null) {
                        bvaVar.d();
                    } else {
                        jva.v(this.a, false).M(this.S1);
                    }
                    gm.c3(runnable);
                    return;
                }
            }
            if (this.B2 == null) {
                jva.v(this.a, false).M(q1());
            }
            this.L2 = true;
            this.A2 = null;
            this.z2 = false;
            k47 k47Var = new k47(this.a, message, false, false);
            k47Var.K5();
            l2(k47Var, this.B2);
            this.m3 = null;
            this.L2 = false;
            gm.c3(runnable);
            return;
        }
        jva.v(this.a, false).M(q1());
        dismiss();
    }

    public final void c2(long j, qac qacVar) {
        TLRPC.Message message;
        long j2;
        TL_stars.SavedStarGift savedStarGift = this.A2;
        if (savedStarGift != null && (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
            j2 = savedStarGift.transfer_stars;
        } else {
            k47 k47Var = this.C2;
            if (k47Var != null && (message = k47Var.k) != null) {
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
        b2(j, j2, null, true, qacVar);
    }

    public final void d1(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z, fw4 fw4Var) {
        c41 j2;
        bva bvaVar = this.B2;
        if (fw4Var != null) {
            dy0 dy0Var = fw4Var.c;
            gm.t1(dy0Var.findFocus());
            j2 = new c41(dy0Var, this.J0);
        } else {
            j2 = j();
        }
        fs7.d(getContext(), this.a, tL_starGiftUnique, j, tL_textWithEntities, !z, this.J0, new ts9(this, fw4Var, (byte) 8), j2, new e6a(this, fw4Var, (byte) 14), new e6a(bvaVar, tL_starGiftUnique, (byte) 15));
    }

    public final void d2() {
        TL_stars.InputSavedStarGift u1;
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
        hg5 hg5Var = this.w3;
        if (hg5Var != null) {
            hg5Var.f(true);
            this.w3 = null;
        }
        if (this.X2 == null && (u1 = u1()) != null) {
            k47 k47Var = this.C2;
            long j4 = this.S1;
            if (k47Var != null) {
                TLRPC.MessageAction messageAction = k47Var.k.action;
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
                        if (pg3.n(tL_messageActionStarGift.from_id) != this.C2.Z0()) {
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
                    i = 2131750331;
                } else {
                    i = 2131750332;
                }
                textView.setText(jb6.M0(i, null));
            } else if (z2) {
                textView.setText(jb6.M0(2131750329, null));
            } else {
                textView.setText(jb6.M0(2131750330, null));
            }
            if (!z && j3 > j && !z4) {
                z5 = true;
            } else {
                z5 = false;
            }
            jh2 jh2Var = this.r2;
            jh2Var.a(z5, false);
            if (this.m3 != null) {
                if (j3 > j || this.q3 != null) {
                    e2();
                    return;
                }
            } else {
                jva.v(this.a, false).H(j2, new qpa(this, (byte) 2));
            }
            if (j3 <= j && this.q3 == null) {
                this.p3 = true;
                TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                if (!TextUtils.isEmpty(str)) {
                    TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade tL_inputInvoiceStarGiftPrepaidUpgrade = new TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade();
                    tL_inputInvoiceStarGiftPrepaidUpgrade.hash = str;
                    tL_inputInvoiceStarGiftPrepaidUpgrade.peer = oc7.r1(this.a).i1(j4);
                    tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftPrepaidUpgrade;
                } else {
                    TLRPC.TL_inputInvoiceStarGiftUpgrade tL_inputInvoiceStarGiftUpgrade = new TLRPC.TL_inputInvoiceStarGiftUpgrade();
                    tL_inputInvoiceStarGiftUpgrade.keep_original_details = jh2Var.a.q;
                    tL_inputInvoiceStarGiftUpgrade.stargift = u1;
                    tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftUpgrade;
                }
                JSONObject u = wx0.u(this.J0, false);
                if (u != null) {
                    TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                    tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                    tL_dataJSON.data = u.toString();
                    tL_payments_getPaymentForm.flags |= 1;
                }
                ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_getPaymentForm, new xqa(this, (byte) 0));
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3 = nm7.I3;
        ssa ssaVar = this.a2;
        boolean z = true;
        if (i == i3) {
            if (this.B2 == ((ava) objArr[1])) {
                ura uraVar = ssaVar.N;
                if (uraVar == null || !uraVar.i0) {
                    C2();
                }
            }
        } else if (i == nm7.e4) {
            ssaVar.setInWallet((this.d3 == null && this.a3 == null && x2(A1())) ? false : false);
        }
    }

    @Override
    public final void dismiss() {
        if (this.W2.c(4) && this.a2.N.i0) {
            return;
        }
        xb9 xb9Var = this.R2;
        if (xb9Var != null) {
            xb9Var.b();
            this.R2 = null;
        }
        hsa hsaVar = this.K2;
        if (hsaVar != null) {
            hsaVar.a();
        }
        super.dismiss();
    }

    public final boolean e1() {
        int i;
        boolean z;
        boolean z2;
        TLRPC.Peer peer;
        if (u1() == null) {
            return false;
        }
        k47 k47Var = this.C2;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        if (k47Var != null) {
            TLRPC.MessageAction messageAction = k47Var.k.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                if (tL_messageActionStarGift.peer != null) {
                    z = true;
                } else {
                    z = false;
                }
                boolean O3 = k47Var.O3();
                if (k47.B0(this.C2.k) == z8c.h(this.a).e()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                int g = ((int) oc7.r1(this.a).l4.v3.g(timeUnit)) - (ConnectionsManager.getInstance(this.a).getCurrentTime() - this.C2.k.date);
                if (((z || (O3 && !z2)) && ((peer = tL_messageActionStarGift.peer) == null || !G1(this.a, pg3.n(peer)))) || tL_messageActionStarGift.converted || tL_messageActionStarGift.convert_stars <= 0 || g <= 0) {
                    return false;
                }
                return true;
            }
        } else {
            TL_stars.SavedStarGift savedStarGift = this.A2;
            if (savedStarGift != null) {
                int g2 = ((int) oc7.r1(this.a).l4.v3.g(timeUnit)) - (ConnectionsManager.getInstance(this.a).getCurrentTime() - savedStarGift.date);
                int i2 = this.a;
                long j = this.S1;
                if (G1(i2, j)) {
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

    public final void e2() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wsa.e2():void");
    }

    public final boolean f1() {
        int i;
        TL_stars.TL_starGiftUnique A1 = A1();
        if (A1 == null || A1.crafted || fs7.m(A1) || !G1(this.a, pg3.n(A1.owner_id))) {
            return false;
        }
        k47 k47Var = this.C2;
        if (k47Var != null) {
            TLRPC.Message message = k47Var.k;
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

    public final void f2() {
        TL_stars.TL_starGiftUnique A1 = A1();
        if (!w2() && E2() != null && A1 != null && !TextUtils.isEmpty(A1.slug)) {
            ?? obj = new Object();
            obj.a = jb6.M0(2131749847, null);
            obj.b = true;
            obj.e = new ts9(this, r1, (byte) 10);
            Context context = getContext();
            int i = this.a;
            yw4 yw4Var = new yw4(context, i, false, ok0.a(i).b(), null, obj, this.J0);
            yw4[] yw4VarArr = {yw4Var};
            yw4Var.show();
        }
    }

    public final boolean g1() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wsa.g1():boolean");
    }

    public final boolean h1() {
        TL_stars.TL_starGiftUnique A1 = A1();
        if (A1 != null && !TextUtils.isEmpty(A1.slug)) {
            if (this.a3 != null || H1(A1) || E1(A1) || (fs7.u(A1) && F1(this.a, pg3.n(A1.owner_id)))) {
                gs gsVar = oc7.r1(this.a).l4;
                if (gsVar.n0.f) {
                    if (gsVar.s.f || gsVar.t.f || H1(A1)) {
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

    public final SpannableStringBuilder h2(TLRPC.Peer peer) {
        if (peer != null) {
            String q = pg3.q(oc7.r1(this.a).a2(pg3.n(peer)));
            if (!TextUtils.isEmpty(q)) {
                return gm.N2(jb6.a0(null, null, 2131749976, b10.h("@", q)), -1, 0, new nqa(this, q, (byte) 8), null);
            }
        }
        return null;
    }

    public final void i1() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.J0, getContext());
        String M0 = jb6.M0(2131750199, null);
        he heVar = alertDialog$Builder.a;
        heVar.S = M0;
        heVar.U = jb6.M0(2131750200, null);
        TL_stars.TL_starGiftUnique A1 = A1();
        if (A1 != null && !TextUtils.isEmpty(A1.slug)) {
            alertDialog$Builder.j(jb6.M0(2131747538, null), new uqa(this, A1, (byte) 1));
        }
        wi8.y(null, 2131752542, alertDialog$Builder, null);
    }

    public final SpannableStringBuilder i2(TL_stars.StarGift starGift) {
        if (starGift != null && !(starGift instanceof TL_stars.TL_starGiftUnique)) {
            return h2(starGift.released_by);
        }
        return null;
    }

    @Override
    public c41 j() {
        return new c41(this.k2, this.J0);
    }

    public final void j1(long j, TL_stars.starGiftDepositPayload stargiftdepositpayload, long j2, k11 k11Var, yw4 yw4Var) {
        boolean z;
        TL_wallet.nftItem E2 = E2();
        TL_stars.TL_starGiftUnique A1 = A1();
        if (E2 != null && A1 != null && !TextUtils.isEmpty(A1.slug)) {
            if (this.a3 != null) {
                z = true;
            } else {
                z = false;
            }
            String s1 = s1();
            k11Var.d();
            hqa hqaVar = new hqa(this, j2, k11Var, j, A1, E2, yw4Var, z, s1);
            if (stargiftdepositpayload != null) {
                hqaVar.a(stargiftdepositpayload);
                return;
            }
            TL_stars.depositStarGift depositstargift = new TL_stars.depositStarGift();
            depositstargift.peer = oc7.r1(this.a).i1(j);
            depositstargift.slug = A1.slug;
            ConnectionsManager.getInstance(this.a).sendRequestTyped(depositstargift, new kc((byte) 0), new nv0(this, k11Var, yw4Var, hqaVar, (byte) 15));
        }
    }

    public final void k1(long j, qac qacVar) {
        TLRPC.Message message;
        long n;
        long j2;
        TL_stars.InputSavedStarGift u1 = u1();
        if (u1 != null) {
            TL_stars.SavedStarGift savedStarGift = this.A2;
            if (savedStarGift != null && (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
                j2 = savedStarGift.transfer_stars;
                n = this.S1;
            } else {
                k47 k47Var = this.C2;
                if (k47Var != null && (message = k47Var.k) != null) {
                    TLRPC.MessageAction messageAction = message.action;
                    if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                        TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
                        n = pg3.n(tL_messageActionStarGiftUnique.gift.owner_id);
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
                transferstargift.stargift = u1;
                transferstargift.to_id = oc7.r1(this.a).i1(j);
                ConnectionsManager.getInstance(this.a).sendRequest(transferstargift, new qp6(this, qacVar, j, j3, (byte) 2));
                return;
            }
            jva v = jva.v(this.a, false);
            if (!v.e) {
                v.o(new nz8(this, v, j, qacVar, (byte) 3));
                return;
            }
            TLRPC.TL_inputInvoiceStarGiftTransfer tL_inputInvoiceStarGiftTransfer = new TLRPC.TL_inputInvoiceStarGiftTransfer();
            tL_inputInvoiceStarGiftTransfer.stargift = u1;
            tL_inputInvoiceStarGiftTransfer.to_id = oc7.r1(this.a).i1(j);
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftTransfer;
            JSONObject u = wx0.u(this.J0, false);
            if (u != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = u.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_getPaymentForm, new w95(this, tL_inputInvoiceStarGiftTransfer, j, j3, qacVar));
        }
    }

    public final void l1() {
        TL_stars.InputSavedStarGift u1;
        long j;
        b61 b61Var = this.f2;
        if (!b61Var.R && (u1 = u1()) != null) {
            k47 k47Var = this.C2;
            String str = null;
            long j2 = 0;
            if (k47Var != null) {
                TLRPC.MessageAction messageAction = k47Var.k.action;
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
                b61Var.setLoading(true);
                jh2 jh2Var = this.r2;
                if (i > 0) {
                    TL_stars.upgradeStarGift upgradestargift = new TL_stars.upgradeStarGift();
                    upgradestargift.keep_original_details = jh2Var.a.q;
                    upgradestargift.stargift = u1;
                    ConnectionsManager.getInstance(this.a).sendRequest(upgradestargift, new jl7(this, u1, (byte) 29));
                    return;
                }
                int i2 = 0;
                jva v = jva.v(this.a, false);
                if (!v.e) {
                    v.o(new e6a(this, v, (byte) 17));
                    return;
                }
                TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
                tL_payments_sendStarsForm.form_id = this.q3.form_id;
                if (!TextUtils.isEmpty(str)) {
                    TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade tL_inputInvoiceStarGiftPrepaidUpgrade = new TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade();
                    tL_inputInvoiceStarGiftPrepaidUpgrade.hash = str;
                    tL_inputInvoiceStarGiftPrepaidUpgrade.peer = oc7.r1(this.a).i1(this.S1);
                    tL_payments_sendStarsForm.invoice = tL_inputInvoiceStarGiftPrepaidUpgrade;
                } else {
                    TLRPC.TL_inputInvoiceStarGiftUpgrade tL_inputInvoiceStarGiftUpgrade = new TLRPC.TL_inputInvoiceStarGiftUpgrade();
                    tL_inputInvoiceStarGiftUpgrade.keep_original_details = jh2Var.a.q;
                    tL_inputInvoiceStarGiftUpgrade.stargift = u1;
                    tL_payments_sendStarsForm.invoice = tL_inputInvoiceStarGiftUpgrade;
                }
                ArrayList<TLRPC.TL_labeledPrice> arrayList = this.q3.invoice.prices;
                int size = arrayList.size();
                while (i2 < size) {
                    TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i2);
                    i2++;
                    j2 += tL_labeledPrice.amount;
                }
                ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_sendStarsForm, new eu0(this, str, u1, j2, (byte) 5));
            }
        }
    }

    public final void l2(defpackage.k47 r61, defpackage.bva r62) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wsa.l2(k47, bva):void");
    }

    public final void m2(String str, TL_stars.TL_starGiftUnique tL_starGiftUnique, bva bvaVar) {
        boolean z;
        boolean z2;
        float f;
        hsa hsaVar;
        TL_stars.TL_starGiftUnique tL_starGiftUnique2;
        this.D2 = str;
        this.E2 = tL_starGiftUnique;
        this.B2 = bvaVar;
        if (this.d3 == null && tL_starGiftUnique.resell_amount != null && !F1(this.a, pg3.n(tL_starGiftUnique.owner_id)) && !D1(this.a, tL_starGiftUnique) && !H1(tL_starGiftUnique)) {
            z = true;
        } else {
            z = false;
        }
        this.F2 = z;
        if (!this.L2 && (hsaVar = this.K2) != null && hsaVar.o && (tL_starGiftUnique2 = hsaVar.l) != null && tL_starGiftUnique2.id != tL_starGiftUnique.id) {
            hsaVar.a();
            this.K2 = null;
            ssa ssaVar = this.a2;
            ssaVar.b.setAlpha(1.0f);
            ssaVar.c.setAlpha(0.0f);
        }
        this.Z1.b(this.a, this.A2);
        o2(tL_starGiftUnique, false, null, null);
        String str2 = tL_starGiftUnique.owner_address;
        String str3 = tL_starGiftUnique.gift_address;
        if (tL_starGiftUnique.host_id != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        TL_wallet.walletTransaction wallettransaction = this.d3;
        l66 l66Var = this.c2;
        if (wallettransaction == null && z2 && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            f = 0.66f;
            l66Var.setText(gm.E2(gm.N2(jb6.M0(2131750114, null), -1, 0, new nqa(this, str3, (byte) 3), null), true, gm.L(2.6666667f), gm.L(0.66f)));
            l66Var.setVisibility(0);
            anb.X(l66Var, cmb.p5, this.J0);
        } else {
            f = 0.66f;
            l66Var.setVisibility(8);
        }
        TL_wallet.walletTransaction wallettransaction2 = this.d3;
        l66 l66Var2 = this.e2;
        if (wallettransaction2 == null && !z2 && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            l66Var2.setText(gm.E2(gm.N2(jb6.M0(2131750114, null), -1, 0, new nqa(this, str3, (byte) 4), null), true, gm.L(2.6666667f), gm.L(f)));
            l66Var2.setVisibility(0);
        } else {
            l66Var2.setVisibility(8);
        }
        D2();
        if (this.F2) {
            p2(tL_starGiftUnique);
            this.f2.setOnClickListener(new lpa(this, (byte) 17));
        }
        if (this.Z2) {
            z2(0, false, null);
            this.m1.m0(1);
            this.Z2 = false;
        }
        C2();
    }

    public final void n2(org.telegram.tgnet.tl.TL_stars.SavedStarGift r36, defpackage.bva r37) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wsa.n2(org.telegram.tgnet.tl.TL_stars$SavedStarGift, bva):void");
    }

    @Override
    public final void o0() {
        hg5 hg5Var = this.w3;
        if (hg5Var != null) {
            hg5Var.f(true);
            this.w3 = null;
        }
    }

    public final void o2(org.telegram.tgnet.tl.TL_stars.TL_starGiftUnique r42, boolean r43, org.telegram.tgnet.TLObject r44, org.telegram.tgnet.TLRPC.TL_textWithEntities r45) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wsa.o2(org.telegram.tgnet.tl.TL_stars$TL_starGiftUnique, boolean, org.telegram.tgnet.TLObject, org.telegram.tgnet.TLRPC$TL_textWithEntities):void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        nm7.f(this.a).b(this, nm7.I3);
        nm7.f(this.a).b(this, nm7.e4);
    }

    @Override
    public final void onBackPressed() {
        ssa ssaVar;
        ura uraVar;
        if (this.W2.c(4) && (ssaVar = this.a2) != null && (uraVar = ssaVar.N) != null) {
            if (uraVar.i0) {
                return;
            }
            if (uraVar.j0) {
                super.onBackPressed();
                return;
            }
        }
        if (!this.v2 && this.W2.b > 0 && !this.f2.R && !this.l3) {
            k47 k47Var = this.C2;
            if (k47Var != null) {
                l2(k47Var, null);
            } else {
                TL_stars.SavedStarGift savedStarGift = this.A2;
                if (savedStarGift != null) {
                    n2(savedStarGift, this.B2);
                } else {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = this.E2;
                    if (tL_starGiftUnique != null) {
                        m2(this.D2, tL_starGiftUnique, this.B2);
                    }
                }
            }
            z2(0, true, null);
            return;
        }
        super.onBackPressed();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        nm7.f(this.a).n(this, nm7.I3);
        nm7.f(this.a).n(this, nm7.e4);
    }

    @Override
    public final void p0() {
        super.p0();
        try {
            L(cmb.g5);
            ssa ssaVar = this.a2;
            if (ssaVar != null) {
                ssaVar.l();
            }
            pn2 pn2Var = this.Y2;
            if (pn2Var != null) {
                Drawable drawable = pn2Var.c;
                if (drawable instanceof tsa) {
                    ((tsa) drawable).d.setColor(cmb.v0(cmb.Ei, this.J0));
                    b61 b61Var = this.f2;
                    if (b61Var != null) {
                        b61Var.invalidate();
                    }
                }
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    public final int p1() {
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

    public final void p2(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        nk resellAmount = tL_starGiftUnique.getResellAmount(ok.a);
        boolean z = tL_starGiftUnique.resale_ton_only;
        SpannableStringBuilder spannableStringBuilder = null;
        b61 b61Var = this.f2;
        if (z) {
            b61Var.i(nxa.t1(nxa.V0(jb6.a0(null, null, 2131745879, tL_starGiftUnique.getResellAmount(ok.b).d()), true), true), !this.Z2, true);
            if (!fs7.m(tL_starGiftUnique)) {
                spannableStringBuilder = nxa.T0(jb6.H(',', "ResellGiftBuyEq", (int) resellAmount.a()));
            }
            b61Var.g(spannableStringBuilder, !this.Z2);
            return;
        }
        b61Var.i(nxa.T0(jb6.H(',', "ResellGiftBuy", (int) resellAmount.a())), !this.Z2, true);
        b61Var.g(null, !this.Z2);
    }

    public final long q1() {
        TLRPC.Peer peer;
        k47 k47Var = this.C2;
        if (k47Var != null) {
            TLRPC.Message message = k47Var.k;
            if (message != null) {
                TLRPC.MessageAction messageAction = message.action;
                if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                    TLRPC.Peer peer2 = ((TLRPC.TL_messageActionStarGift) messageAction).peer;
                    if (peer2 != null) {
                        return pg3.n(peer2);
                    }
                    if (k47Var.O3()) {
                        return k47.B0(this.C2.k);
                    }
                    return z8c.h(this.a).e();
                } else if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                    TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
                    TL_stars.StarGift starGift = tL_messageActionStarGiftUnique.gift;
                    if ((starGift instanceof TL_stars.TL_starGiftUnique) && (peer = starGift.owner_id) != null) {
                        return pg3.n(peer);
                    }
                    TLRPC.Peer peer3 = tL_messageActionStarGiftUnique.peer;
                    if (peer3 != null) {
                        return pg3.n(peer3);
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
                return pg3.n(((TL_stars.TL_starGiftUnique) starGift2).owner_id);
            }
            return this.S1;
        }
        TL_stars.TL_starGiftUnique tL_starGiftUnique = this.E2;
        if (tL_starGiftUnique != null) {
            return pg3.n(tL_starGiftUnique.owner_id);
        }
        return 0L;
    }

    public final void q2(TL_stars.TL_starGiftUnique tL_starGiftUnique, boolean z) {
        if (z) {
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_peerUser.user_id = z8c.h(this.a).e();
            tL_starGiftUnique.host_id = tL_peerUser;
            tL_starGiftUnique.flags |= 4096;
        } else {
            tL_starGiftUnique.host_id = null;
            tL_starGiftUnique.flags &= -4097;
        }
        this.a2.setWalletDisplayed(z);
        D2();
    }

    public final TL_stars.StarGift r1() {
        k47 k47Var = this.C2;
        if (k47Var != null) {
            TLRPC.Message message = k47Var.k;
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

    public final void r2(boolean z) {
        int i;
        Object obj;
        ix4 ix4Var;
        ix4 ix4Var2;
        ix4 ix4Var3;
        int w1 = w1();
        if (w1 >= 0) {
            if (z) {
                i = 1;
            } else {
                i = -1;
            }
            int i2 = i + w1;
            int i3 = this.P2;
            if (i3 >= 0 && (!z ? i3 < w1 : i3 > w1)) {
                i2 = i3;
            }
            bva bvaVar = this.B2;
            if (bvaVar != null && i2 >= 0 && i2 < bvaVar.e()) {
                obj = this.B2.get(i2);
            } else {
                obj = null;
            }
            if (obj != null) {
                if (z) {
                    ix4Var = this.Y1;
                } else {
                    ix4Var = this.X1;
                }
                if (ix4Var != null) {
                    if (obj instanceof TL_stars.SavedStarGift) {
                        if (z) {
                            ix4Var3 = this.Y1;
                        } else {
                            ix4Var3 = this.X1;
                        }
                        if (m1(ix4Var3.A2, (TL_stars.SavedStarGift) obj)) {
                            return;
                        }
                    }
                    if (obj instanceof TL_stars.TL_starGiftUnique) {
                        if (z) {
                            ix4Var2 = this.Y1;
                        } else {
                            ix4Var2 = this.X1;
                        }
                        if (n1(ix4Var2.E2, (TL_stars.TL_starGiftUnique) obj)) {
                            return;
                        }
                    }
                }
                ix4 ix4Var4 = new ix4(this, getContext(), this.a, this.S1, this.J0, this.T1.getRootView());
                if (obj instanceof TL_stars.SavedStarGift) {
                    ix4Var4.n2((TL_stars.SavedStarGift) obj, this.B2);
                } else if (obj instanceof TL_stars.TL_starGiftUnique) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj;
                    ix4Var4.m2(tL_starGiftUnique.slug, tL_starGiftUnique, this.B2);
                }
                gm.B2(ix4Var4.b);
                if (z) {
                    this.Y1 = ix4Var4;
                } else {
                    this.X1 = ix4Var4;
                }
            }
        }
    }

    public final String s1() {
        TL_stars.StarGift r1 = r1();
        if (r1 instanceof TL_stars.TL_starGiftUnique) {
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) r1;
            StringBuilder sb = new StringBuilder();
            sb.append(tL_starGiftUnique.title);
            sb.append(" #");
            return kt6.m(tL_starGiftUnique.num, ',', sb);
        }
        return "";
    }

    public final void s2() {
        TL_stars.TL_starGiftUnique A1 = A1();
        if (A1 == null) {
            return;
        }
        TLRPC.Peer peer = A1.owner_id;
        if (peer == null) {
            peer = A1.host_id;
        }
        long n = pg3.n(peer);
        StringBuilder sb = new StringBuilder();
        sb.append(A1.title);
        sb.append(" #");
        this.x2.setText(jb6.a0(null, null, 2131749766, kt6.m(A1.num, ',', sb)));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(jb6.M0(2131749768, null));
        if (n == z8c.h(this.a).e() && !z8c.h(this.a).p()) {
            spannableStringBuilder.append((CharSequence) " l");
            pn2 pn2Var = this.S2;
            if (pn2Var == null) {
                pn2Var = new pn2(2131232249, 0);
                this.S2 = pn2Var;
            }
            spannableStringBuilder.setSpan(pn2Var, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        b61 b61Var = this.f2;
        b61Var.i(spannableStringBuilder, true, true);
        b61Var.g(null, true);
        b61Var.setOnClickListener(new rqa(this, (byte) 2));
        this.a2.setWearPreview(oc7.r1(this.a).a2(n));
        z2(2, false, null);
        this.v2 = true;
    }

    @Override
    public final void show() {
        k47 k47Var;
        TLRPC.Message message;
        String str;
        if (oc7.r1(this.a).u2()) {
            h5.b(this.a);
            return;
        }
        TL_wallet.nftItem nftitem = this.a3;
        if (nftitem != null && (str = this.D2) != null && this.E2 != null) {
            TL_stars.getUniqueStarGift getuniquestargift = new TL_stars.getUniqueStarGift();
            getuniquestargift.slug = str;
            ConnectionsManager.getInstance(this.a).sendRequest(getuniquestargift, new fm8(this, nftitem, str, (byte) 16));
        }
        if (this.D2 != null && this.E2 == null) {
            he heVar = new he(3, null, getContext());
            heVar.q(500L);
            TL_stars.getUniqueStarGift getuniquestargift2 = new TL_stars.getUniqueStarGift();
            getuniquestargift2.slug = this.D2;
            ConnectionsManager.getInstance(this.a).sendRequest(getuniquestargift2, new jl7(this, heVar, (byte) 27));
        } else if (this.A2 == null && (k47Var = this.C2) != null && (message = k47Var.k) != null) {
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                if (tL_messageActionStarGift.upgraded) {
                    if (tL_messageActionStarGift.upgrade_msg_id != 0) {
                        he heVar2 = new he(3, null, getContext());
                        heVar2.q(500L);
                        TLRPC.TL_messages_getMessages tL_messages_getMessages = new TLRPC.TL_messages_getMessages();
                        tL_messages_getMessages.id.add(Integer.valueOf(tL_messageActionStarGift.upgrade_msg_id));
                        ConnectionsManager.getInstance(this.a).sendRequest(tL_messages_getMessages, new fm8((Object) this, (Object) tL_messageActionStarGift, heVar2, (byte) 14));
                        return;
                    } else if (u1() != null) {
                        he heVar3 = new he(3, null, getContext());
                        heVar3.q(500L);
                        jva.v(this.a, false).J(u1(), new ts9(this, heVar3, (byte) 7));
                        return;
                    }
                }
            }
        }
        super.show();
    }

    public final void t2(CharSequence charSequence) {
        TL_stars.TL_starGiftUnique A1 = A1();
        TL_stars.InputSavedStarGift u1 = u1();
        if (u1 != null && A1 != null) {
            TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails tL_inputInvoiceStarGiftDropOriginalDetails = new TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails();
            tL_inputInvoiceStarGiftDropOriginalDetails.stargift = u1;
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftDropOriginalDetails;
            JSONObject u = wx0.u(this.J0, false);
            if (u != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = u.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_getPaymentForm, new av0(this, charSequence, A1, tL_inputInvoiceStarGiftDropOriginalDetails, (byte) 20));
        }
    }

    public final TL_stars.InputSavedStarGift u1() {
        TLRPC.Message message;
        long B0;
        TLRPC.Message message2;
        long B02;
        TLRPC.Message message3;
        long j = this.S1;
        if (j < 0) {
            TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat = new TL_stars.TL_inputSavedStarGiftChat();
            tL_inputSavedStarGiftChat.peer = oc7.r1(this.a).i1(j);
            k47 k47Var = this.C2;
            if (k47Var != null && (message3 = k47Var.k) != null) {
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
        k47 k47Var2 = this.C2;
        if (k47Var2 != null && (message2 = k47Var2.k) != null) {
            TLRPC.MessageAction messageAction2 = message2.action;
            if ((messageAction2 instanceof TLRPC.TL_messageActionStarGift) && (messageAction2.flags & 4096) != 0) {
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift2 = (TLRPC.TL_messageActionStarGift) messageAction2;
                TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat2 = new TL_stars.TL_inputSavedStarGiftChat();
                oc7 r1 = oc7.r1(this.a);
                TLRPC.Peer peer = tL_messageActionStarGift2.peer;
                if (peer != null) {
                    B02 = pg3.n(peer);
                } else {
                    B02 = k47.B0(this.C2.k);
                }
                tL_inputSavedStarGiftChat2.peer = r1.i1(B02);
                tL_inputSavedStarGiftChat2.saved_id = tL_messageActionStarGift2.saved_id;
                return tL_inputSavedStarGiftChat2;
            }
        }
        if (k47Var2 != null && (message = k47Var2.k) != null) {
            TLRPC.MessageAction messageAction3 = message.action;
            if ((messageAction3 instanceof TLRPC.TL_messageActionStarGiftUnique) && (messageAction3.flags & 128) != 0) {
                TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique2 = (TLRPC.TL_messageActionStarGiftUnique) messageAction3;
                TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat3 = new TL_stars.TL_inputSavedStarGiftChat();
                oc7 r12 = oc7.r1(this.a);
                TLRPC.Peer peer2 = tL_messageActionStarGiftUnique2.peer;
                if (peer2 != null) {
                    B0 = pg3.n(peer2);
                } else {
                    B0 = k47.B0(this.C2.k);
                }
                tL_inputSavedStarGiftChat3.peer = r12.i1(B0);
                tL_inputSavedStarGiftChat3.saved_id = tL_messageActionStarGiftUnique2.saved_id;
                return tL_inputSavedStarGiftChat3;
            }
        }
        TL_stars.TL_inputSavedStarGiftUser tL_inputSavedStarGiftUser = new TL_stars.TL_inputSavedStarGiftUser();
        k47 k47Var3 = this.C2;
        if (k47Var3 != null) {
            TLRPC.Message message4 = k47Var3.k;
            if (message4 != null) {
                TLRPC.MessageAction messageAction4 = message4.action;
                if ((messageAction4 instanceof TLRPC.TL_messageActionStarGift) && (messageAction4.flags & 32768) != 0) {
                    tL_inputSavedStarGiftUser.msg_id = ((TLRPC.TL_messageActionStarGift) messageAction4).gift_msg_id;
                    return tL_inputSavedStarGiftUser;
                }
            }
            tL_inputSavedStarGiftUser.msg_id = k47Var3.e1();
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

    public final void u2(View view, CharSequence charSequence, boolean z) {
        Layout layout;
        y51 y51Var;
        float primaryHorizontal;
        int i;
        hg5 hg5Var = this.w3;
        if ((hg5Var == null || !hg5Var.W || this.x3 != view) && view != null) {
            if (z) {
                if (view instanceof lka) {
                    lka lkaVar = (lka) view;
                    primaryHorizontal = (lkaVar.getRightDrawableWidth() / 2.0f) + lkaVar.getRightDrawableX();
                } else {
                    return;
                }
            } else {
                if (view instanceof TextView) {
                    layout = ((TextView) view).getLayout();
                } else if (view instanceof lka) {
                    layout = ((lka) view).getLayout();
                } else {
                    return;
                }
                if (layout != null) {
                    CharSequence text = layout.getText();
                    if (text instanceof Spanned) {
                        Spanned spanned = (Spanned) text;
                        y51[] y51VarArr = (y51[]) spanned.getSpans(0, spanned.length(), y51.class);
                        if (y51VarArr != null && y51VarArr.length > 0) {
                            primaryHorizontal = layout.getPrimaryHorizontal(spanned.getSpanStart(y51VarArr[y51VarArr.length - 1])) + view.getPaddingLeft() + (y51Var.a() / 2.0f);
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
            jp0 jp0Var = this.T1;
            jp0Var.getLocationOnScreen(iArr);
            int[] iArr2 = {iArr2[0] - iArr[0], iArr2[1] - iArr[1]};
            hg5 hg5Var2 = this.w3;
            if (hg5Var2 != null) {
                hg5Var2.f(true);
                this.w3 = null;
            }
            hg5 hg5Var3 = new hg5(getContext(), 3);
            hg5Var3.p(!z);
            hg5Var3.t(charSequence);
            hg5Var3.o(0.0f, (iArr2[0] + primaryHorizontal) - (gm.L(16.0f) + this.u0));
            float L = (iArr2[1] - gm.L(100.0f)) - (view.getHeight() / 2.0f);
            if (z) {
                i = 18;
            } else {
                i = 0;
            }
            hg5Var3.setTranslationY(L + gm.L(i + 4.33f));
            hg5Var3.d = 3000L;
            hg5Var3.setPadding(gm.L(16.0f) + this.u0, 0, gm.L(16.0f) + this.u0, 0);
            hg5Var3.r0 = new hi(hg5Var3, (byte) 8);
            hg5Var3.v();
            jp0Var.addView(hg5Var3, qoe.c(100.0f, -1));
            this.w3 = hg5Var3;
            this.x3 = view;
        }
    }

    public final String v1() {
        TL_stars.StarGift r1 = r1();
        if ((r1 instanceof TL_stars.TL_starGiftUnique) && r1.slug != null) {
            return oc7.r1(this.a).N2 + "/nft/" + r1.slug;
        }
        return null;
    }

    public final void v2(int i, Context context, boolean z) {
        int i2;
        int i3;
        LinearLayout i4 = hg9.i(context, 1);
        FrameLayout frameLayout = new FrameLayout(context);
        int L = gm.L(64.0f);
        int i5 = cmb.Ei;
        ShapeDrawable K = cmb.K(L, cmb.v0(i5, this.J0));
        wmb M = anb.M(i5);
        ylb ylbVar = this.J0;
        frameLayout.setBackground(K);
        anb.j(frameLayout, K, M, null, ylbVar);
        i4.addView(frameLayout, qoe.t(64, 64, 49, 0, 6, 0, 0));
        ?? imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.f(2131624287, 42, 42, null);
        frameLayout.addView((View) imageView, qoe.r(64, 64, 17));
        imageView.d();
        TextView b = jxe.b(context, 20.0f, cmb.F6, true, null);
        b.setGravity(17);
        if (z) {
            i2 = 2131749938;
        } else {
            i2 = 2131749844;
        }
        b.setText(jb6.M0(i2, null));
        i4.addView(b, qoe.t(-1, -2, 48, 24, 14, 24, 0));
        TextView b2 = jxe.b(context, 14.0f, cmb.E6, false, null);
        b2.setGravity(17);
        if (z) {
            i3 = 2131749939;
        } else {
            i3 = 2131749845;
        }
        b2.setText(jb6.a0(null, null, i3, jb6.c0(Math.max(10, i))));
        i4.addView(b2, qoe.t(-1, -2, 48, 24, 6, 24, 6));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.J0, context);
        alertDialog$Builder.n(i4);
        alertDialog$Builder.j(jb6.M0(2131747564, null), null);
        alertDialog$Builder.o();
    }

    public final int w1() {
        int indexOf;
        bva bvaVar = this.B2;
        if (bvaVar != null) {
            TL_stars.SavedStarGift savedStarGift = this.A2;
            if (savedStarGift != null) {
                indexOf = bvaVar.indexOf(savedStarGift);
            } else {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = this.E2;
                if (tL_starGiftUnique != null) {
                    indexOf = bvaVar.indexOf(tL_starGiftUnique);
                } else {
                    return -1;
                }
            }
            if (indexOf >= 0) {
                return indexOf;
            }
            TL_stars.StarGift r1 = r1();
            for (int i = 0; i < this.B2.e(); i++) {
                Object obj = this.B2.get(i);
                if (obj instanceof TL_stars.SavedStarGift) {
                    TL_stars.SavedStarGift savedStarGift2 = this.A2;
                    if (savedStarGift2 != null) {
                        if (m1(savedStarGift2, (TL_stars.SavedStarGift) obj)) {
                            return i;
                        }
                    }
                    if (r1 != null) {
                        TL_stars.StarGift starGift = ((TL_stars.SavedStarGift) obj).gift;
                        if (r1 != starGift) {
                            if ((r1 instanceof TL_stars.TL_starGiftUnique) && (starGift instanceof TL_stars.TL_starGiftUnique) && r1.id == starGift.id) {
                            }
                        }
                        return i;
                    }
                    continue;
                } else {
                    if ((obj instanceof TL_stars.TL_starGiftUnique) && n1(this.E2, (TL_stars.TL_starGiftUnique) obj)) {
                        return i;
                    }
                }
            }
            return -1;
        }
        return -1;
    }

    public final boolean w2() {
        if (!fs7.m(A1())) {
            return false;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.J0, getContext());
        String M0 = jb6.M0(2131749851, null);
        he heVar = alertDialog$Builder.a;
        heVar.S = M0;
        heVar.U = jb6.M0(2131749464, null);
        if (h1()) {
            alertDialog$Builder.j(jb6.M0(2131750365, null), new ypa(this, (byte) 2));
            alertDialog$Builder.g(jb6.M0(2131752542, null), null);
        } else {
            alertDialog$Builder.j(jb6.M0(2131747564, null), null);
        }
        alertDialog$Builder.o();
        return true;
    }

    @Override
    public final void x0(int i) {
        super.x0(i);
        gm.o3(this, 0, false, null);
    }

    public final TL_stars.SavedStarGift x1(boolean z) {
        int i;
        Object obj;
        int w1 = w1();
        if (w1 >= 0) {
            if (z) {
                i = 1;
            } else {
                i = -1;
            }
            int i2 = i + w1;
            int i3 = this.P2;
            if (i3 >= 0 && (!z ? i3 < w1 : i3 > w1)) {
                i2 = i3;
            }
            bva bvaVar = this.B2;
            if (bvaVar != null && i2 >= 0 && i2 < bvaVar.e()) {
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

    public final boolean x2(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        if (wi8.A(tL_starGiftUnique) && !TextUtils.isEmpty(tL_starGiftUnique.gift_address) && !TextUtils.isEmpty(tL_starGiftUnique.owner_address) && !fs7.m(tL_starGiftUnique)) {
            c C = c.C(this.a);
            if (c.b(tL_starGiftUnique.owner_address, C.x()) || C.A().c(tL_starGiftUnique.gift_address)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final TL_stars.TL_starGiftUnique y1(boolean z) {
        int i;
        Object obj;
        int w1 = w1();
        if (w1 >= 0) {
            if (z) {
                i = 1;
            } else {
                i = -1;
            }
            int i2 = i + w1;
            int i3 = this.P2;
            if (i3 >= 0 && (!z ? i3 < w1 : i3 > w1)) {
                i2 = i3;
            }
            bva bvaVar = this.B2;
            if (bvaVar != null && i2 >= 0 && i2 < bvaVar.e()) {
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

    public final void y2(boolean z, he heVar, k11 k11Var, Runnable runnable) {
        k11Var.d();
        z8c h = z8c.h(this.a);
        TL_account.tmpPassword tmppassword = h.y;
        if (tmppassword != null && tmppassword.valid_until < ConnectionsManager.getInstance(this.a).getCurrentTime() + 60) {
            h.y = null;
            h.u(false);
        }
        TL_account.tmpPassword tmppassword2 = h.y;
        if (tmppassword2 == null) {
            Z1(z, k11Var, runnable);
        } else {
            C1(tmppassword2.tmp_password, null, z, new m45(this, z, k11Var, runnable, heVar));
        }
    }

    public final void z2(int r13, boolean r14, defpackage.n28 r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wsa.z2(int, boolean, n28):void");
    }
}
