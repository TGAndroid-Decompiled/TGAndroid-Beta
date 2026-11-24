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
public class vqa extends fy0 implements gk7 {
    public TL_stars.SavedStarGift A2;
    public ysa B2;
    public k27 C2;
    public String D2;
    public TL_stars.TL_starGiftUnique E2;
    public boolean F2;
    public boolean G2;
    public boolean H2;
    public boolean I2;
    public boolean J2;
    public hqa K2;
    public boolean L2;
    public ipa M2;
    public final int[] N2;
    public gx0 O2;
    public int P2;
    public String Q2;
    public x99 R2;
    public final long S1;
    public cm2 S2;
    public final jo0 T1;
    public boolean T2;
    public final fpa U1;
    public yoa U2;
    public final qh4 V1;
    public Float V2;
    public final View W1;
    public xpa W2;
    public hv4 X1;
    public ValueAnimator X2;
    public hv4 Y1;
    public cm2 Y2;
    public final hpa Z1;
    public boolean Z2;
    public final rqa a2;
    public TL_wallet.nftItem a3;
    public final gpa b2;
    public qlc b3;
    public final l46 c2;
    public rlc c3;
    public final mfb d2;
    public TL_wallet.walletTransaction d3;
    public final l46 e2;
    public final LinearLayout e3;
    public final u41 f2;
    public final TextView f3;
    public final FrameLayout g2;
    public final TextView g3;
    public final l46 h2;
    public View h3;
    public final FrameLayout i2;
    public eq8 i3;
    public final View j2;
    public boolean j3;
    public final FrameLayout k2;
    public Boolean k3;
    public tqa l2;
    public boolean l3;
    public boolean m2;
    public ArrayList m3;
    public final gpa n2;
    public ArrayList n3;
    public final ac[] o2;
    public ArrayList o3;
    public final View p2;
    public boolean p3;
    public final LinearLayout q2;
    public TLRPC.PaymentForm q3;
    public final wf2 r2;
    public final cm2[] r3;
    public final TextView s2;
    public final nna s3;
    public final LinearLayout t2;
    public int t3;
    public final wf2 u2;
    public Boolean u3;
    public boolean v2;
    public boolean v3;
    public final gpa w2;
    public je5 w3;
    public final TextView x2;
    public View x3;
    public final gpa y2;
    public boolean z2;

    public vqa(Context context, int i, long j, wjb wjbVar, View view) {
        super(context, null, false, false, wjbVar);
        this.m2 = false;
        this.N2 = new int[2];
        this.P2 = -1;
        this.Q2 = "";
        this.W2 = new xpa(0, 0);
        this.Z2 = true;
        this.r3 = new cm2[1];
        this.s3 = new nna(this, (byte) 16);
        this.v3 = true;
        this.a = i;
        this.S1 = j;
        this.u1 = Math.max(0.05f, gl.L(82.0f) / (gl.q.y + gl.m));
        this.x = true;
        this.b = new oc6((byte) 24, context, this);
        jo0 jo0Var = new jo0(this, context);
        this.T1 = jo0Var;
        fpa fpaVar = new fpa(this, context);
        this.U1 = fpaVar;
        fpaVar.setAdapter(new bn0((byte) 6, context, this));
        C2();
        View view2 = new View(context);
        this.W1 = view2;
        int i2 = bkb.g5;
        zkb.h(i2, wjbVar, view2);
        FrameLayout.LayoutParams e = nme.e(-1, 50, 80);
        int i3 = this.u0;
        e.rightMargin = i3;
        e.leftMargin = i3;
        this.b.addView(view2, e);
        this.b.addView(fpaVar, nme.e(-1, -1, 119));
        M(i2);
        gl.B2(this.n1);
        jo0Var.addView(this.n1, nme.e(-1, -1, 119));
        if (Build.VERSION.SDK_INT >= 26) {
            this.n1.setDefaultFocusHighlightEnabled(false);
        }
        gpa gpaVar = new gpa(this, context, (byte) 0);
        this.b2 = gpaVar;
        gpaVar.setOrientation(1);
        gpaVar.setPadding(gl.L(14.0f) + this.u0, gl.L(16.0f), gl.L(14.0f) + this.u0, gl.L(68.0f));
        jo0Var.addView(gpaVar, nme.e(-1, -1, 55));
        LinearLayout linearLayout = new LinearLayout(context);
        this.e3 = linearLayout;
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        this.f3 = textView;
        textView.setSingleLine(true);
        textView.setGravity(17);
        textView.setIncludeFontPadding(false);
        ir2.t(textView, 1, 40.0f);
        int i4 = bkb.Ei;
        zkb.X(textView, i4, wjbVar);
        linearLayout.addView(textView, nme.r(-1, 50, 1));
        TextView textView2 = new TextView(context);
        this.g3 = textView2;
        textView2.setGravity(17);
        textView2.setIncludeFontPadding(false);
        textView2.setTextSize(1, 14.0f);
        zkb.X(textView2, bkb.y6, wjbVar);
        linearLayout.addView(textView2, nme.t(-1, 20, 1, 0, 3, 0, 0));
        gpaVar.addView(linearLayout, nme.k(0.0f, 4.0f, 0.0f, 16.0f, -1, -2));
        linearLayout.setVisibility(8);
        l46 l46Var = new l46(context, wjbVar);
        this.c2 = l46Var;
        int i5 = bkb.p5;
        zkb.X(l46Var, i5, wjbVar);
        l46Var.setTextSize(1, 12.0f);
        l46Var.setGravity(17);
        l46Var.setLineSpacing(gl.L(2.0f), 1.0f);
        zkb.G(l46Var, bkb.Wc, wjbVar);
        l46Var.setDisablePaddingsOffsetY(true);
        gpaVar.addView(l46Var, nme.t(-2, -2, 1, 4, -2, 4, 16));
        l46Var.setVisibility(8);
        mfb mfbVar = new mfb(context, wjbVar);
        this.d2 = mfbVar;
        gpaVar.addView(mfbVar, nme.k(0.0f, 0.0f, 0.0f, 12.0f, -1, -2));
        l46 l46Var2 = new l46(context, wjbVar);
        this.e2 = l46Var2;
        zkb.X(l46Var2, i5, wjbVar);
        l46Var2.setTextSize(1, 12.0f);
        l46Var2.setGravity(17);
        l46Var2.setLineSpacing(gl.L(2.0f), 1.0f);
        zkb.G(l46Var2, i4, wjbVar);
        l46Var2.setDisablePaddingsOffsetY(true);
        l46Var2.setPadding(gl.L(5.0f), 0, gl.L(5.0f), 0);
        gpaVar.addView(l46Var2, nme.t(-2, -2, 1, 4, 2, 4, 8));
        l46Var2.setVisibility(8);
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.t2 = linearLayout2;
        linearLayout2.setPadding(gl.L(12.0f), gl.L(8.0f), gl.L(12.0f), gl.L(8.0f));
        linearLayout2.setOrientation(0);
        int i6 = bkb.h6;
        ff0 Y = bkb.Y(bkb.v0(i6, wjbVar), 21, 21);
        vkb M = zkb.M(i6);
        linearLayout2.setBackground(Y);
        zkb.j(linearLayout2, Y, null, M, wjbVar);
        wf2 wf2Var = new wf2(24, wjbVar, context);
        this.u2 = wf2Var;
        int i7 = bkb.g7;
        int i8 = bkb.i7;
        int i9 = bkb.j7;
        wf2Var.b(i7, i8, i9);
        wf2Var.setDrawUnchecked(true);
        wf2Var.a(false, false);
        wf2Var.setDrawBackgroundAsArc(10);
        linearLayout2.addView(wf2Var, nme.t(26, 26, 16, 0, 0, 0, 0));
        TextView textView3 = new TextView(context);
        int i10 = bkb.i5;
        zkb.X(textView3, i10, wjbVar);
        ir2.r(14.0f, 1, 2131750373, textView3, null);
        linearLayout2.addView(textView3, nme.t(-2, -2, 16, 9, 0, 0, 0));
        gpaVar.addView(linearLayout2, nme.t(-2, -2, 1, 0, -4, 0, 4));
        ote.b(linearLayout2, 0.025f, 1.5f);
        linearLayout2.setOnClickListener(new lna(this, (byte) 24));
        linearLayout2.setVisibility(8);
        gpa gpaVar2 = new gpa(this, context, (byte) 1);
        this.n2 = gpaVar2;
        gpaVar2.setOrientation(1);
        gpaVar2.setPadding(gl.L(4.0f) + this.u0, gl.L(24.0f), gl.L(4.0f) + this.u0, gl.L(66.0f));
        jo0Var.addView(gpaVar2, nme.e(-1, -1, 55));
        this.o2 = r7;
        ac acVar = new ac(wjbVar, context, false);
        acVar.a(2131231825, k96.M0(2131749849, null), k96.M0(2131749400, null));
        gpaVar2.addView(r7[0], nme.o(-1, -2));
        ac acVar2 = new ac(wjbVar, context, false);
        acVar2.a(2131231821, k96.M0(2131749843, null), k96.M0(2131749398, null));
        gpaVar2.addView(r7[1], nme.o(-1, -2));
        ac acVar3 = new ac(wjbVar, context, false);
        ac[] acVarArr = {acVar, acVar2, acVar3};
        acVar3.a(2131231928, k96.M0(2131749395, null), k96.M0(2131749396, null));
        gpaVar2.addView(acVarArr[2], nme.o(-1, -2));
        View view3 = new View(context);
        this.p2 = view3;
        int i11 = bkb.c7;
        zkb.h(i11, wjbVar, view3);
        gpaVar2.addView(view3, nme.n(1.0f / gl.p, -2, 7, 17, -4, 17, 6));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.q2 = linearLayout3;
        linearLayout3.setPadding(gl.L(12.0f), gl.L(8.0f), gl.L(12.0f), gl.L(8.0f));
        linearLayout3.setOrientation(0);
        ff0 Y2 = bkb.Y(bkb.v0(i6, wjbVar), 6, 6);
        vkb M2 = zkb.M(i6);
        linearLayout3.setBackground(Y2);
        zkb.j(linearLayout3, Y2, null, M2, wjbVar);
        wf2 wf2Var2 = new wf2(24, wjbVar, context);
        this.r2 = wf2Var2;
        wf2Var2.b(i7, i8, i9);
        wf2Var2.setDrawUnchecked(true);
        wf2Var2.a(false, false);
        wf2Var2.setDrawBackgroundAsArc(10);
        linearLayout3.addView(wf2Var2, nme.t(26, 26, 16, 0, 0, 0, 0));
        TextView textView4 = new TextView(context);
        this.s2 = textView4;
        zkb.X(textView4, i10, wjbVar);
        ir2.r(14.0f, 1, 2131750381, textView4, null);
        linearLayout3.addView(textView4, nme.t(-2, -2, 16, 9, 0, 0, 0));
        gpaVar2.addView(linearLayout3, nme.t(-2, -2, 1, 0, 0, 0, 4));
        ote.b(linearLayout3, 0.025f, 1.5f);
        gpa gpaVar3 = new gpa(this, context, (byte) 2);
        this.w2 = gpaVar3;
        gpaVar3.setOrientation(1);
        gpaVar3.setPadding(gl.L(4.0f) + this.u0, gl.L(20.0f), gl.L(4.0f) + this.u0, gl.L(66.0f));
        jo0Var.addView(gpaVar3, nme.e(-1, -1, 55));
        TextView textView5 = new TextView(context);
        this.x2 = textView5;
        zkb.X(textView5, i10, wjbVar);
        textView5.setTextSize(1, 20.0f);
        textView5.setGravity(17);
        textView5.setTypeface(gl.o());
        gpaVar3.addView(textView5, nme.t(-1, -2, 7, 20, 0, 20, 0));
        TextView textView6 = new TextView(context);
        zkb.X(textView6, i10, wjbVar);
        textView6.setTextSize(1, 14.0f);
        de9.q(textView6, 17, null, 2131749818);
        gpaVar3.addView(textView6, nme.t(-1, -2, 7, 20, 6, 20, 24));
        ac acVar4 = new ac(wjbVar, context, false);
        acVar4.a(2131231825, k96.M0(2131749824, null), k96.M0(2131749825, null));
        gpaVar3.addView(r6[0], nme.o(-1, -2));
        ac acVar5 = new ac(wjbVar, context, false);
        acVar5.a(2131231803, k96.M0(2131749822, null), k96.M0(2131749823, null));
        gpaVar3.addView(r6[1], nme.o(-1, -2));
        ac acVar6 = new ac(wjbVar, context, false);
        ac[] acVarArr2 = {acVar4, acVar5, acVar6};
        acVar6.a(2131231915, k96.M0(2131749820, null), k96.M0(2131749821, null));
        gpaVar3.addView(acVarArr2[2], nme.o(-1, -2));
        gpa gpaVar4 = new gpa(this, context, (byte) 3);
        this.y2 = gpaVar4;
        gpaVar4.setOrientation(1);
        gpaVar4.setPadding(gl.L(4.0f) + this.u0, gl.L(10.0f), gl.L(4.0f) + this.u0, gl.L(92.0f));
        jo0Var.addView(gpaVar4, nme.e(-1, -1, 55));
        ac acVar7 = new ac(wjbVar, context, false);
        acVar7.a(2131231825, k96.M0(2131749769, null), k96.M0(2131749770, null));
        gpaVar4.addView(r7[0], nme.o(-1, -2));
        ac acVar8 = new ac(wjbVar, context, false);
        acVar8.a(2131231877, k96.M0(2131749767, null), k96.M0(2131749768, null));
        gpaVar4.addView(r7[1], nme.o(-1, -2));
        ac acVar9 = new ac(wjbVar, context, false);
        ac[] acVarArr3 = {acVar7, acVar8, acVar9};
        acVar9.a(2131231799, k96.M0(2131749765, null), k96.M0(2131749766, null));
        gpaVar4.addView(acVarArr3[2], nme.o(-1, -2));
        gpaVar.setAlpha(1.0f);
        gpaVar2.setAlpha(0.0f);
        gpaVar3.setAlpha(0.0f);
        gpaVar4.setAlpha(0.0f);
        rqa rqaVar = new rqa(context, wjbVar, new nna(this, (byte) 17), new lna(this, (byte) 25), new lna(this, (byte) 26), new lna(this, (byte) 27), new lna(this, (byte) 28), new lna(this, (byte) 29), new roa(this, (byte) 0), new roa(this, (byte) 1));
        this.a2 = rqaVar;
        rqaVar.N.c.setOnClickListener(new lna(this, (byte) 22));
        int i12 = this.u0;
        rqaVar.setPadding(i12, 0, i12, 0);
        jo0Var.addView(rqaVar, nme.e(-1, -2, 55));
        zr zrVar = this.m1;
        this.J1 = true;
        zrVar.j1(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.g2 = frameLayout;
        zkb.h(i2, wjbVar, frameLayout);
        View view4 = new View(context);
        this.j2 = view4;
        zkb.h(i11, wjbVar, view4);
        view4.setAlpha(0.0f);
        frameLayout.addView(view4, nme.a(-1.0f, 1.0f / gl.p, 55));
        u41 i13 = yjb.i(24, wjbVar, context, true);
        this.f2 = i13;
        i13.i(k96.M0(2131747638, null), false, true);
        i13.g(null, false);
        FrameLayout.LayoutParams d = nme.d(-1, 48.0f, 119, 0.0f, 12.0f, 0.0f, 12.0f);
        d.leftMargin = gl.L(14.0f) + this.u0;
        d.rightMargin = gl.L(14.0f) + this.u0;
        frameLayout.addView(i13, d);
        jo0Var.addView(frameLayout, nme.e(-1, 72, 87));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.i2 = frameLayout2;
        zkb.h(i2, wjbVar, frameLayout2);
        l46 l46Var3 = new l46(context, null);
        this.h2 = l46Var3;
        l46Var3.setTextSize(1, 12.0f);
        zkb.X(l46Var3, i4, wjbVar);
        zkb.G(l46Var3, i4, wjbVar);
        l46Var3.setGravity(17);
        frameLayout2.addView(l46Var3, nme.d(-1, -2.0f, 17, 16.0f, 8.0f, 16.0f, 14.0f));
        jo0Var.addView(frameLayout2, nme.e(-1, -2, 87));
        frameLayout2.setVisibility(8);
        this.n1.setOnScrollListener(new n58(this, (byte) 25));
        linearLayout3.setOnClickListener(new lna(this, (byte) 23));
        qh4 qh4Var = new qh4(context);
        this.V1 = qh4Var;
        jo0Var.addView(qh4Var, nme.c(-1.0f, -1));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.k2 = frameLayout3;
        frameLayout3.setPadding(gl.L(6.0f) + this.u0, 0, gl.L(6.0f) + this.u0, 0);
        jo0Var.addView(frameLayout3, nme.d(-1, 200.0f, 87, 0.0f, 0.0f, 0.0f, 60.0f));
        gl.B2(this.o1);
        jo0Var.addView(this.o1, nme.d(-1, -2.0f, 0, 6.0f, 0.0f, 6.0f, 0.0f));
        hpa hpaVar = new hpa(context);
        this.Z1 = hpaVar;
        jo0Var.addView(hpaVar, nme.e(-1, -2, 55));
        ArrayList arrayList = new ArrayList();
        if (view != null) {
            arrayList.add(view);
        }
        gl.k2(new ae9(hpaVar, (byte) 8), 12.0f, 12, arrayList);
    }

    public static boolean D1(int i, TL_stars.StarGift starGift) {
        if (cq7.m(starGift)) {
            gr grVar = na7.q1(i).k4;
            if (!grVar.n0.f) {
                return true;
            }
            if (((TL_stars.TL_starGiftUnique) starGift).fixed_sale) {
                return false;
            }
            return !grVar.s.f;
        }
        return false;
    }

    public static boolean F1(int i, long j) {
        if (j >= 0) {
            if (y6c.h(i).e() == j) {
                return true;
            }
            return false;
        }
        return hc2.w(5, na7.q1(i).K0(Long.valueOf(-j)));
    }

    public static boolean G1(int i, long j) {
        if (j >= 0) {
            if (y6c.h(i).e() != j) {
                return false;
            }
            return true;
        }
        TLRPC.Chat K0 = na7.q1(i).K0(Long.valueOf(-j));
        if (K0 == null || !K0.creator) {
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
        long n = cf3.n(peer);
        int i2 = (n > 0L ? 1 : (n == 0L ? 0 : -1));
        if (i2 == 0) {
            return false;
        }
        if (i2 > 0) {
            TLRPC.User V1 = na7.q1(i).V1(Long.valueOf(n));
            if (V1 != null) {
                TLRPC.EmojiStatus emojiStatus = V1.emoji_status;
                if (!(emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) || ((TLRPC.TL_emojiStatusCollectible) emojiStatus).collectible_id != tL_starGiftUnique.id) {
                    return false;
                }
                return true;
            }
        } else {
            TLRPC.Chat K0 = na7.q1(i).K0(Long.valueOf(-n));
            if (K0 != null) {
                TLRPC.EmojiStatus emojiStatus2 = K0.emoji_status;
                if ((emojiStatus2 instanceof TLRPC.TL_emojiStatusCollectible) && ((TLRPC.TL_emojiStatusCollectible) emojiStatus2).collectible_id == tL_starGiftUnique.id) {
                    return true;
                }
            }
        }
        return false;
    }

    public static TableRow Y0(mfb mfbVar, String str, String str2, wjb wjbVar) {
        String str3;
        if (!WalletEngine2.isValidAddress(str2)) {
            return mfbVar.f(str, str2, null, null);
        }
        float L = gl.L(14.0f);
        TextView cpaVar = new cpa(mfbVar.getContext(), L);
        cpaVar.setTypeface(gl.n1("fonts/rmono.ttf"));
        int i = 0;
        cpaVar.setTextSize(0, L);
        cpaVar.setLineSpacing(gl.L(2.0f), 1.0f);
        zkb.X(cpaVar, bkb.F6, wjbVar);
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
                spannableStringBuilder.setSpan(new cm4(bkb.x6, wjbVar), length, spannableStringBuilder.length(), 33);
            }
            i2++;
            i = i5;
        }
        cpaVar.setText(spannableStringBuilder);
        return mfbVar.c(cpaVar, str);
    }

    public static void Z0(mfb mfbVar, TL_stars.StarGiftAttribute starGiftAttribute) {
        String M0;
        if (starGiftAttribute instanceof TL_stars.starGiftAttributeModel) {
            M0 = k96.M0(2131750371, null);
        } else if (starGiftAttribute instanceof TL_stars.starGiftAttributePattern) {
            M0 = k96.M0(2131750364, null);
        } else if (starGiftAttribute instanceof TL_stars.starGiftAttributeBackdrop) {
            M0 = k96.M0(2131750372, null);
        } else {
            return;
        }
        String str = M0;
        Integer[] numArr = new Integer[1];
        mfbVar.e(str, starGiftAttribute.name, z1(starGiftAttribute.rarity, numArr), null, numArr[0]);
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
            spannableStringBuilder.setSpan(new o82((byte) 1), indexOf, i + indexOf, 0);
        }
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder k2(String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        SpannableString spannableString = new SpannableString("👌");
        spannableString.setSpan(new cm2(2131231182, 0), 0, spannableString.length(), 33);
        SpannableString spannableString2 = new SpannableString("👍");
        spannableString2.setSpan(new cm2(2131231166, 0), 0, spannableString2.length(), 33);
        gl.J2(spannableStringBuilder, spannableString, "👌");
        gl.J2(spannableStringBuilder, spannableString2, "👍");
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
        k96 D0 = k96.D0();
        if (calendar.get(1) == calendar2.get(1)) {
            r0 = D0.p0();
        } else {
            r0 = D0.r0();
        }
        return k96.a0(null, null, 2131742520, r0.format(date), D0.o0().format(date));
    }

    public static String t1(TL_stars.StarGift starGift) {
        if (starGift instanceof TL_stars.TL_starGiftUnique) {
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
            StringBuilder sb = new StringBuilder();
            sb.append(tL_starGiftUnique.title);
            sb.append(" #");
            return ls6.m(tL_starGiftUnique.num, ',', sb);
        } else if ((starGift instanceof TL_stars.TL_starGift) && !TextUtils.isEmpty(starGift.title)) {
            return starGift.title;
        } else {
            return k96.M0(2131750176, null);
        }
    }

    public static String z1(TL_stars.StarGiftAttributeRarity starGiftAttributeRarity, Integer[] numArr) {
        if (starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarityUncommon) {
            numArr[0] = -12539616;
            return k96.M0(2131749447, null);
        } else if (starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarityRare) {
            numArr[0] = -15619394;
            return k96.M0(2131749448, null);
        } else if (starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarityEpic) {
            numArr[0] = -6988581;
            return k96.M0(2131749450, null);
        } else if (starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarityLegendary) {
            numArr[0] = -4229632;
            return k96.M0(2131749449, null);
        } else if (starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarity) {
            int i = ((TL_stars.TL_starGiftAttributeRarity) starGiftAttributeRarity).permille;
            if (i <= 0) {
                return "<0.1%";
            }
            return bc.I0(i);
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
        vqa vqaVar;
        int i;
        int i2;
        TL_stars.TL_starGiftUnique A1 = A1();
        if (A1 == null) {
            return;
        }
        na7.c1().edit().putInt("statusgiftpage", 3).apply();
        boolean I1 = I1(this.a, A1());
        boolean z2 = !I1;
        boolean I12 = I1(this.a, A1());
        u41 u41Var = this.f2;
        if (I12) {
            na7.q1(this.a).l5(q1(), new TLRPC.TL_emojiStatusEmpty(), null);
            vqaVar = this;
        } else {
            long q1 = q1();
            if (q1 >= 0) {
                if (!y6c.h(this.a).p()) {
                    m21 P = j().P(2131624212, gl.O2(k96.M0(2131750407, null), -1, 2, new nna(this, (byte) 3), null));
                    P.t = true;
                    P.j();
                    return;
                }
            } else if (!z) {
                na7 q12 = na7.q1(this.a);
                u41Var.setLoading(true);
                na7.q1(this.a).E0().a(q1, new p0c(this, q12, q1, (byte) 8));
                return;
            }
            vqaVar = this;
            TLRPC.TL_inputEmojiStatusCollectible tL_inputEmojiStatusCollectible = new TLRPC.TL_inputEmojiStatusCollectible();
            tL_inputEmojiStatusCollectible.collectible_id = A1.id;
            na7.q1(vqaVar.a).l5(vqaVar.q1(), tL_inputEmojiStatusCollectible, A1);
        }
        gw9 gw9Var = vqaVar.a2.J[1];
        if (!I1) {
            i = 2131231104;
            i2 = 2131750406;
        } else {
            i = 2131231105;
            i2 = 2131750409;
        }
        gw9Var.a(i, k96.M0(i2, null), true);
        if (vqaVar.v2) {
            vqaVar.dismiss();
            return;
        }
        k08 k08Var = new k08((byte) 18, vqaVar, z2);
        if (vqaVar.W2.c(0)) {
            k08Var.run();
        } else {
            vqaVar.z2(0, true, k08Var);
        }
        u41Var.i(k96.M0(2131747638, null), !vqaVar.Z2, true);
        u41Var.g(null, !vqaVar.Z2);
        u41Var.setOnClickListener(new lna(vqaVar, (byte) 10));
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

    public final void C1(byte[] bArr, TwoStepVerificationActivity twoStepVerificationActivity, boolean z, m25 m25Var) {
        TL_stars.getStarGiftWithdrawalUrl getstargiftwithdrawalurl;
        TL_stars.InputSavedStarGift u1 = u1();
        if (u1 == null) {
            if (m25Var != null) {
                m25Var.a(Boolean.FALSE);
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
        ConnectionsManager.getInstance(this.a).sendRequest(getstargiftwithdrawalurl, new ji1(this, m25Var, twoStepVerificationActivity, z));
    }

    public final void C2() {
        boolean B1 = B1(false);
        fpa fpaVar = this.U1;
        fpaVar.setPosition(B1 ? 1 : 0);
        fpaVar.D(false);
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
        if (this.W2.c(4)) {
            boolean z = this.a2.N.i0;
        }
        return false;
    }

    public final boolean E1(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        if (tL_starGiftUnique != null && !TextUtils.isEmpty(tL_starGiftUnique.owner_address)) {
            c C = c.C(this.a);
            String x = C.x();
            if (TextUtils.isEmpty(x)) {
                TLRPC.Peer peer = tL_starGiftUnique.host_id;
                if (peer == null || cf3.n(peer) != y6c.h(this.a).e()) {
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
    public final boolean F() {
        if (this.W2.c(4) && this.a2.N.i0) {
            return false;
        }
        return this.d0;
    }

    @Override
    public final boolean G(MotionEvent motionEvent) {
        if (this.W2.c(4)) {
            boolean z = this.a2.N.i0;
        }
        return false;
    }

    @Override
    public final n39 G0(o39 o39Var) {
        gx0 gx0Var = new gx0(this, (byte) 10);
        this.O2 = gx0Var;
        return gx0Var;
    }

    public final boolean H1(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        if (ug8.A(tL_starGiftUnique) && cq7.m(tL_starGiftUnique)) {
            if (!tL_starGiftUnique.my_sale && this.a3 == null) {
                TLRPC.Peer peer = tL_starGiftUnique.host_id;
                if (peer == null || cf3.n(peer) != y6c.h(this.a).e()) {
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
        return gl.L(12.0f);
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

    public final void K1(hd hdVar, k27 k27Var) {
        hdVar.dismiss();
        this.H2 = true;
        l2(k27Var, null);
        super.show();
    }

    public final void L1(hd hdVar, TL_stars.SavedStarGift savedStarGift) {
        if (savedStarGift != null) {
            hdVar.dismiss();
            this.J2 = true;
            n2(savedStarGift, null);
            super.show();
            return;
        }
        hdVar.dismiss();
        d S = LaunchActivity.S();
        if (S != null) {
            m21 Q = u21.b0(S).Q(2131624012, 36, k96.M0(2131748360, null));
            Q.t = true;
            Q.j();
        }
    }

    public final void M1() {
        oj ojVar;
        TL_stars.TL_starGiftUnique A1 = A1();
        u41 u41Var = this.f2;
        if (!u41Var.R && A1 != null && !D1(this.a, A1) && !H1(A1)) {
            boolean m = cq7.m(A1);
            TL_stars.TL_starGiftUnique tL_starGiftUnique = this.E2;
            long j = this.S1;
            if (m) {
                if (tL_starGiftUnique == null || !this.F2 || j == 0) {
                    j = y6c.h(this.a).e();
                }
                long j2 = j;
                if (this.E2 != null && this.F2 && j2 != y6c.h(this.a).e()) {
                    du4 du4Var = new du4(getContext(), this.J0, A1, j2);
                    du4Var.E1 = new qm1(this, du4Var, A1, j2, (byte) 8);
                    du4Var.show();
                    return;
                }
                d1(A1, j2, null, true, null);
                return;
            }
            if (tL_starGiftUnique == null || !this.F2 || j == 0) {
                j = y6c.h(this.a).e();
            }
            long j3 = j;
            if (A1.resale_ton_only) {
                ojVar = oj.b;
            } else {
                ojVar = oj.a;
            }
            oj ojVar2 = ojVar;
            if (this.E2 != null && this.F2 && j3 != y6c.h(this.a).e()) {
                du4 du4Var2 = new du4(getContext(), this.J0, A1, j3);
                du4Var2.E1 = new xn1(this, du4Var2, A1, j3, ojVar2, (byte) 3);
                du4Var2.show();
                return;
            }
            u41Var.setLoading(true);
            gta.u(this.a, ojVar2).E(A1, j3, null, true, new tna(this, null, ojVar2, A1, j3, null, true));
        }
    }

    public final void N1() {
        yoa yoaVar = this.U2;
        if (yoaVar != null && !yoaVar.J) {
            yoaVar.dismiss();
        }
        String v1 = v1();
        yoa yoaVar2 = new yoa(this, getContext(), v1, v1, this.J0);
        this.U2 = yoaVar2;
        yoaVar2.n2 = new g29(this, (byte) 13);
        yoaVar2.show();
    }

    public final void O1() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vqa.O1():void");
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
                twoStepVerificationActivity.s0();
            }
            u21.c0("NULL_ERROR");
        } else if (!"PASSWORD_MISSING".equals(tL_error.text) && !tL_error.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error.text.startsWith("SESSION_TOO_FRESH_")) {
            if ("SRP_ID_INVALID".equals(tL_error.text)) {
                ConnectionsManager.getInstance(this.a).sendRequest(new TL_account.getPassword(), new poa(this, twoStepVerificationActivity, z, (byte) 1), 8);
                return;
            }
            if (twoStepVerificationActivity != null) {
                twoStepVerificationActivity.s0();
                twoStepVerificationActivity.finishFragment();
            }
            if (z && ("WALLET_CREATING".equals(tL_error.text) || "WALLET_UNAVAILABLE".equals(tL_error.text))) {
                cq7.q(getContext(), this.a, this.J0, null, tL_error.text, null);
                return;
            }
            String str = tL_error.text;
            if (str != null && str.startsWith("FLOOD_WAIT")) {
                yjb.x(null, 2131750670, u21.Y(), null);
            } else {
                u21.e0(tL_error);
            }
        } else {
            if (twoStepVerificationActivity != null) {
                twoStepVerificationActivity.s0();
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
            String M0 = k96.M0(2131749884, null);
            hd hdVar = alertDialog$Builder.a;
            hdVar.S = M0;
            LinearLayout linearLayout = new LinearLayout(getContext());
            linearLayout.setPadding(gl.L(24.0f), gl.L(2.0f), gl.L(24.0f), 0);
            linearLayout.setOrientation(1);
            alertDialog$Builder.n(linearLayout);
            TextView textView = new TextView(getContext());
            int i8 = bkb.i5;
            zkb.X(textView, i8, null);
            textView.setTextSize(1, 16.0f);
            if (k96.a0) {
                i = 5;
            } else {
                i = 3;
            }
            textView.setGravity(i | 48);
            textView.setText(gl.T2(k96.M0(2131749888, null)));
            linearLayout.addView(textView, nme.o(-1, -2));
            LinearLayout linearLayout2 = new LinearLayout(getContext());
            linearLayout2.setOrientation(0);
            linearLayout.addView(linearLayout2, nme.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
            ImageView imageView = new ImageView(getContext());
            imageView.setImageResource(2131231627);
            if (k96.a0) {
                i2 = gl.L(11.0f);
            } else {
                i2 = 0;
            }
            int L3 = gl.L(9.0f);
            if (k96.a0) {
                L = 0;
            } else {
                L = gl.L(11.0f);
            }
            imageView.setPadding(i2, L3, L, 0);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            zkb.s(imageView, i8, null, mode);
            TextView textView2 = new TextView(getContext());
            zkb.X(textView2, i8, null);
            textView2.setTextSize(1, 16.0f);
            if (k96.a0) {
                i3 = 5;
            } else {
                i3 = 3;
            }
            textView2.setGravity(i3 | 48);
            textView2.setText(gl.T2(k96.M0(2131749887, null)));
            if (k96.a0) {
                linearLayout2.addView(textView2, nme.o(-1, -2));
                linearLayout2.addView(imageView, nme.r(-2, -2, 5));
            } else {
                linearLayout2.addView(imageView, nme.o(-2, -2));
                linearLayout2.addView(textView2, nme.o(-1, -2));
            }
            LinearLayout linearLayout3 = new LinearLayout(getContext());
            linearLayout3.setOrientation(0);
            linearLayout.addView(linearLayout3, nme.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
            ImageView imageView2 = new ImageView(getContext());
            imageView2.setImageResource(2131231627);
            if (k96.a0) {
                i4 = gl.L(11.0f);
            } else {
                i4 = 0;
            }
            int L4 = gl.L(9.0f);
            if (k96.a0) {
                L2 = 0;
            } else {
                L2 = gl.L(11.0f);
            }
            imageView2.setPadding(i4, L4, L2, 0);
            zkb.s(imageView2, i8, null, mode);
            TextView textView3 = new TextView(getContext());
            zkb.X(textView3, i8, null);
            textView3.setTextSize(1, 16.0f);
            if (k96.a0) {
                i5 = 5;
            } else {
                i5 = 3;
            }
            textView3.setGravity(i5 | 48);
            textView3.setText(gl.T2(k96.M0(2131749886, null)));
            if (k96.a0) {
                linearLayout3.addView(textView3, nme.o(-1, -2));
                i6 = 5;
                linearLayout3.addView(imageView2, nme.r(-2, -2, 5));
            } else {
                i6 = 5;
                linearLayout3.addView(imageView2, nme.o(-2, -2));
                linearLayout3.addView(textView3, nme.o(-1, -2));
            }
            if ("PASSWORD_MISSING".equals(tL_error.text)) {
                alertDialog$Builder.j(k96.M0(2131749883, null), new ho9(this, (byte) 23));
                alertDialog$Builder.g(k96.M0(2131752577, null), null);
            } else {
                TextView textView4 = new TextView(getContext());
                zkb.X(textView4, i8, null);
                textView4.setTextSize(1, 16.0f);
                if (k96.a0) {
                    i7 = i6;
                } else {
                    i7 = 3;
                }
                de9.q(textView4, i7 | 48, null, 2131749885);
                linearLayout.addView(textView4, nme.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                alertDialog$Builder.g(k96.M0(2131747638, null), null);
            }
            if (twoStepVerificationActivity != null) {
                twoStepVerificationActivity.showDialog(hdVar);
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
        if (cq7.u(A1)) {
            if (h1()) {
                V1();
                return;
            } else {
                cq7.q(getContext(), this.a, this.J0, j(), "STARGIFT_ONCHAIN_SALE_DISABLED", Boolean.valueOf(A1.fixed_sale));
                return;
            }
        }
        jva.i1(getContext(), this.a, A1, new voa(this, A1, (byte) 2), this.J0);
    }

    public final void R1() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vqa.R1():void");
    }

    public final void S1() {
        if (y6c.h(this.a).p() && (I1(this.a, A1()) || this.T2)) {
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
        long n = cf3.n(peer);
        StringBuilder sb = new StringBuilder();
        sb.append(A1.title);
        sb.append(" #");
        this.x2.setText(k96.a0(null, null, 2131749817, ls6.m(A1.num, ',', sb)));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(k96.M0(2131749819, null));
        if (!y6c.h(this.a).p()) {
            spannableStringBuilder.append((CharSequence) " l");
            cm2 cm2Var = this.S2;
            if (cm2Var == null) {
                cm2Var = new cm2(2131232248, 0);
                this.S2 = cm2Var;
            }
            spannableStringBuilder.setSpan(cm2Var, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        u41 u41Var = this.f2;
        u41Var.i(spannableStringBuilder, true, true);
        u41Var.g(null, true);
        u41Var.setOnClickListener(new lna(this, (byte) 9));
        this.a2.setWearPreview(na7.q1(this.a).Z1(n));
        z2(2, true, null);
    }

    public final void T1(boolean z) {
        int i;
        k27 k27Var = this.C2;
        int i2 = 0;
        if (k27Var != null) {
            TLRPC.Message message = k27Var.k;
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
            alertDialog$Builder.a.S = k96.M0(2131749761, null);
            alertDialog$Builder.a.U = k96.a0(null, null, 2131749762, k96.x(i, true));
            b00.t(null, 2131747638, alertDialog$Builder, null);
            return;
        }
        TL_stars.TL_starGiftUnique A1 = A1();
        if (A1 == null) {
            return;
        }
        if (!TextUtils.isEmpty(A1.gift_address) && !na7.q1(this.a).k4.w.f) {
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, this.J0, getContext());
            alertDialog$Builder2.a.S = k96.M0(2131749776, null);
            alertDialog$Builder2.a.U = k96.M0(2131749777, null);
            b00.t(null, 2131747638, alertDialog$Builder2, null);
            return;
        }
        if (z) {
            this.a2.N.a(this.a, A1.gift_id, A1.getDocument(), A1.title);
            if (f1()) {
                upa upaVar = this.a2.N;
                TL_stars.TL_starGiftUnique A12 = A1();
                if (A12 == null) {
                    upaVar.getClass();
                } else {
                    while (true) {
                        spa[] spaVarArr = upaVar.n;
                        if (i2 >= spaVarArr.length) {
                            break;
                        }
                        spa spaVar = spaVarArr[i2];
                        TL_stars.StarGift starGift = spaVar.h;
                        if (starGift == null) {
                            starGift = null;
                        }
                        if (starGift == null) {
                            spaVar.a(A12, true);
                            break;
                        }
                        i2++;
                    }
                    upaVar.d(true);
                }
            }
        }
        this.a2.N.setOnCraft(new sna(this, (byte) 1));
        if (this.R2 == null) {
            x99 x99Var = new x99(this.a, A1.gift_id);
            this.R2 = x99Var;
            x99Var.a();
        }
        this.a2.N.setOnAddGift(new voa(this, A1, (byte) 1));
        this.a2.N.setOnClose(new toa(this, (byte) 2));
        z2(4, true, null);
    }

    @Override
    public final boolean U0() {
        return false;
    }

    public final void U1(long j) {
        if (j > 0 && l7c.c(na7.q1(this.a).W1(j))) {
            j().Q(2131624012, 36, gl.T2(k96.a0(null, null, 2131743503, cf3.s(j)))).k(false);
        } else {
            new tv4(getContext(), this.a, j, null, new qna(this, (byte) 0)).show();
        }
    }

    public final void V1() {
        TL_stars.TL_starGiftUnique A1 = A1();
        if (A1 != null && A1.fixed_sale) {
            if (!h1()) {
                return;
            }
            jq7 jq7Var = new jq7(this.a, this.J0, new wna(this, r5, A1, (byte) 1), getContext());
            jq7[] jq7VarArr = {jq7Var};
            oj ojVar = oj.b;
            long j = A1.getResellAmount(ojVar).b;
            jq7Var.u1 = true;
            jq7Var.v1 = j;
            jq7Var.r1.setText(k96.M0(2131750248, null));
            if (j > 0) {
                String b = nj.j(j, ojVar).b();
                EditTextBoldCursor editTextBoldCursor = jq7Var.n1;
                InputFilter[] filters = editTextBoldCursor.getFilters();
                editTextBoldCursor.setFilters(new InputFilter[0]);
                jq7Var.w1 = true;
                editTextBoldCursor.setText(b);
                jq7Var.w1 = false;
                editTextBoldCursor.setFilters(filters);
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
            }
            jq7Var.D0(jq7Var.s1);
            jq7VarArr[0].show();
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.J0, getContext());
        String M0 = k96.M0(2131750248, null);
        hd hdVar = alertDialog$Builder.a;
        hdVar.S = M0;
        hdVar.U = k96.M0(2131749650, null);
        alertDialog$Builder.j(k96.M0(2131750416, null), new yna(this, (byte) 0));
        alertDialog$Builder.g(k96.M0(2131752577, null), null);
        alertDialog$Builder.o();
    }

    public final void W1() {
        boolean z;
        int i;
        TL_stars.TL_starGiftUnique A1 = A1();
        if (!h1()) {
            return;
        }
        jq7[] jq7VarArr = {new jq7(this.a, this.J0, new wna(this, jq7VarArr, A1, (byte) 0), getContext())};
        gr grVar = na7.q1(this.a).k4;
        jq7 jq7Var = jq7VarArr[0];
        if (A1 != null && A1.onchain_sale) {
            z = A1.fixed_sale;
        } else {
            z = grVar.t.f;
        }
        jq7Var.x1 = z;
        if (!jq7Var.u1) {
            TextView textView = jq7Var.r1;
            if (z) {
                i = 2131749529;
            } else {
                i = 2131749516;
            }
            textView.setText(k96.M0(i, null));
        }
        jq7Var.D0(jq7Var.s1);
        jq7VarArr[0].show();
    }

    public final void X1() {
        TL_stars.TL_starGiftUnique A1 = A1();
        if (h1()) {
            Context context = getContext();
            int i = this.a;
            wjb wjbVar = this.J0;
            u41 u41Var = this.f2;
            Objects.requireNonNull(u41Var);
            zf7 zf7Var = new zf7(u41Var, (byte) 6);
            u21 j = j();
            nna nnaVar = new nna(this, (byte) 9);
            if (A1 != null && !TextUtils.isEmpty(A1.slug)) {
                TL_stars.cancelStarGiftOnchainSale cancelstargiftonchainsale = new TL_stars.cancelStarGiftOnchainSale();
                cancelstargiftonchainsale.slug = A1.slug;
                cq7.o(context, i, cancelstargiftonchainsale, Boolean.valueOf(A1.fixed_sale), wjbVar, zf7Var, j, new e35(A1, context, i, wjbVar, cq7.h(A1), nnaVar));
            }
        }
    }

    public final void Y1(long j) {
        je5 je5Var = this.w3;
        if (je5Var != null) {
            je5Var.f(true);
            this.w3 = null;
        }
        dismiss();
        d S = LaunchActivity.S();
        if (S != null && !l7c.B(j)) {
            Bundle bundle = new Bundle();
            if (j > 0) {
                bundle.putLong("user_id", j);
                if (j == y6c.h(this.a).e()) {
                    bundle.putBoolean("my_profile", true);
                }
            } else {
                bundle.putLong("chat_id", -j);
            }
            bundle.putBoolean("open_gifts", true);
            S.presentFragment(new ProfileActivity(bundle, null));
        }
    }

    public final void Z1(boolean z, c01 c01Var, Runnable runnable) {
        byte b;
        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
        if (z) {
            b = 3;
        } else {
            b = 2;
        }
        ch chVar = new ch(this, twoStepVerificationActivity, z, (byte) 12);
        twoStepVerificationActivity.a0 = b;
        twoStepVerificationActivity.c0 = chVar;
        twoStepVerificationActivity.b0 = s1();
        twoStepVerificationActivity.w0(new q3a(this, runnable, c01Var, twoStepVerificationActivity));
    }

    public final void a1(TL_stars.StarGiftAttribute starGiftAttribute) {
        String M0;
        boolean z;
        hqa hqaVar;
        vqa vqaVar;
        TL_stars.StarGiftAttribute starGiftAttribute2;
        bm8 bm8Var;
        if (starGiftAttribute instanceof TL_stars.starGiftAttributeModel) {
            M0 = k96.M0(2131750371, null);
            z = true;
        } else if (starGiftAttribute instanceof TL_stars.starGiftAttributePattern) {
            M0 = k96.M0(2131750364, null);
            z = true;
        } else if (starGiftAttribute instanceof TL_stars.starGiftAttributeBackdrop) {
            M0 = k96.M0(2131750372, null);
            z = false;
        } else {
            return;
        }
        if (!this.L2 && ((hqaVar = this.K2) == null || !hqaVar.o)) {
            boolean[] zArr = new boolean[1];
            q41[] q41VarArr = new q41[1];
            Integer[] numArr = new Integer[1];
            String z1 = z1(starGiftAttribute.rarity, numArr);
            if (starGiftAttribute.rarity instanceof TL_stars.TL_starGiftAttributeRarity) {
                vqaVar = this;
                starGiftAttribute2 = starGiftAttribute;
                bm8Var = new bm8(vqaVar, zArr, starGiftAttribute2, q41VarArr, (byte) 24);
            } else {
                vqaVar = this;
                starGiftAttribute2 = starGiftAttribute;
                bm8Var = null;
            }
            q41VarArr[0] = (q41) ((jfb) vqaVar.d2.e(M0, starGiftAttribute2.name, z1, bm8Var, numArr[0]).getChildAt(1)).getChildAt(0);
            return;
        }
        mqa mqaVar = new mqa(getContext(), this.J0, new sna(this, (byte) 0));
        TableRow tableRow = new TableRow(getContext());
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
        mfb mfbVar = this.d2;
        tableRow.addView(new lfb(mfbVar, M0), layoutParams);
        tableRow.addView(new jfb(mfbVar, mqaVar, true), new TableRow.LayoutParams(0, -1, 1.0f));
        mfbVar.addView(tableRow);
        hqa hqaVar2 = this.K2;
        if (hqaVar2 != null) {
            if (!z) {
                hqaVar2.d = mqaVar;
            }
            if (z) {
                hqaVar2.c = mqaVar;
            }
            if (z) {
                hqaVar2.b = mqaVar;
            }
        }
    }

    public final void a2() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vqa.a2():void");
    }

    public final void b1(LinearLayout linearLayout, int i, int i2, int i3, String str, boolean z) {
        int i4;
        int i5;
        ImageView imageView = new ImageView(getContext());
        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(i);
        wjb wjbVar = this.J0;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        zkb.s(imageView, i3, wjbVar, mode);
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
        linearLayout.addView(imageView, nme.t(i2, i2, 16, i4, 0, i5, 0));
        TextView textView = new TextView(getContext());
        textView.setTextSize(1, 13.0f);
        int i6 = bkb.q5;
        zkb.X(textView, i6, this.J0);
        textView.setText(str);
        linearLayout.addView(textView, nme.t(-2, -2, 16, 4, 0, 0, 0));
        if (z) {
            ImageView imageView2 = new ImageView(getContext());
            imageView2.setScaleType(scaleType);
            imageView2.setImageResource(2131232255);
            zkb.s(imageView2, i6, this.J0, mode);
            linearLayout.addView(imageView2, nme.t(11, 11, 16, 5, 0, 2, 0));
        }
    }

    public final void b2(long j, long j2, SpannableStringBuilder spannableStringBuilder, boolean z, p8c p8cVar) {
        String str;
        TLRPC.User user;
        String a0;
        SpannableStringBuilder T2;
        CharSequence M0;
        TL_stars.TL_starGiftUnique A1 = A1();
        if (A1 == null) {
            return;
        }
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        int i2 = this.a;
        if (i >= 0) {
            TLRPC.User V1 = na7.q1(i2).V1(Long.valueOf(j));
            str = l7c.l(V1);
            user = V1;
        } else {
            TLRPC.Chat K0 = na7.q1(i2).K0(Long.valueOf(-j));
            if (K0 == null) {
                str = "";
                user = K0;
            } else {
                str = K0.title;
                user = K0;
            }
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.addView(new wpa(getContext(), A1, user), nme.t(-1, -2, 48, 0, -4, 0, 0));
        TextView textView = new TextView(getContext());
        zkb.X(textView, bkb.i5, this.J0);
        textView.setTextSize(1, 16.0f);
        if (spannableStringBuilder != null) {
            T2 = spannableStringBuilder;
        } else {
            if (j2 > 0) {
                a0 = k96.K("Gift2TransferPriceText", (int) j2, ',', s1(), cf3.s(j));
            } else {
                a0 = k96.a0(null, null, 2131749897, s1(), str);
            }
            T2 = gl.T2(a0);
        }
        textView.setText(T2);
        linearLayout.addView(textView, nme.t(-1, -2, 48, 24, 4, 24, 4));
        mfb mfbVar = new mfb(getContext(), this.J0);
        Z0(mfbVar, gta.i(A1.attributes, TL_stars.starGiftAttributeModel.class));
        Z0(mfbVar, gta.i(A1.attributes, TL_stars.starGiftAttributeBackdrop.class));
        Z0(mfbVar, gta.i(A1.attributes, TL_stars.starGiftAttributePattern.class));
        if (!TextUtils.isEmpty(A1.slug) && (A1.flags & 256) != 0) {
            ci0.h();
            mfbVar.f(k96.M0(2131749416, null), b00.h("~", ci0.f(A1.value_currency, ci0.h().g(A1.value_currency), A1.value_amount, true)), null, null);
        }
        linearLayout.addView(mfbVar, nme.t(-1, -2, 48, 23, 16, 23, 4));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.J0, getContext());
        alertDialog$Builder.n(linearLayout);
        if (j2 > 0) {
            M0 = jva.S0(k96.a0(null, null, 2131749904, Integer.valueOf((int) j2)));
        } else {
            M0 = k96.M0(2131749905, null);
        }
        alertDialog$Builder.j(M0, new p52(p8cVar, (byte) 2));
        alertDialog$Builder.g(k96.M0(2131752577, null), null);
        hd hdVar = alertDialog$Builder.a;
        hdVar.Y0 = z;
        hdVar.show();
    }

    public final void c1(TL_stars.InputSavedStarGift inputSavedStarGift, TLRPC.Updates updates, Runnable runnable) {
        TLRPC.Message message;
        TL_stars.StarGift starGift;
        if (updates == null) {
            gta.v(this.a, false).M(q1());
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
                    ysa ysaVar = this.B2;
                    if (ysaVar != null) {
                        ysaVar.d();
                    } else {
                        gta.v(this.a, false).M(this.S1);
                    }
                    gl.d3(runnable);
                    return;
                }
            }
            if (this.B2 == null) {
                gta.v(this.a, false).M(q1());
            }
            this.L2 = true;
            this.A2 = null;
            this.z2 = false;
            k27 k27Var = new k27(this.a, message, false, false);
            k27Var.K5();
            l2(k27Var, this.B2);
            this.m3 = null;
            this.L2 = false;
            gl.d3(runnable);
            return;
        }
        gta.v(this.a, false).M(q1());
        dismiss();
    }

    public final void c2(long j, p8c p8cVar) {
        TLRPC.Message message;
        long j2;
        TL_stars.SavedStarGift savedStarGift = this.A2;
        if (savedStarGift != null && (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
            j2 = savedStarGift.transfer_stars;
        } else {
            k27 k27Var = this.C2;
            if (k27Var != null && (message = k27Var.k) != null) {
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
        b2(j, j2, null, true, p8cVar);
    }

    public final void d1(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z, du4 du4Var) {
        u21 j2;
        ysa ysaVar = this.B2;
        if (du4Var != null) {
            ww0 ww0Var = du4Var.c;
            gl.t1(ww0Var.findFocus());
            j2 = new u21(ww0Var, this.J0);
        } else {
            j2 = j();
        }
        cq7.d(getContext(), this.a, tL_starGiftUnique, j, tL_textWithEntities, !z, this.J0, new nu9(this, du4Var, (byte) 7), j2, new t7a(this, du4Var, (byte) 12), new t7a(ysaVar, tL_starGiftUnique, (byte) 13));
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
        je5 je5Var = this.w3;
        if (je5Var != null) {
            je5Var.f(true);
            this.w3 = null;
        }
        if (this.X2 == null && (u1 = u1()) != null) {
            k27 k27Var = this.C2;
            long j4 = this.S1;
            if (k27Var != null) {
                TLRPC.MessageAction messageAction = k27Var.k.action;
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
                        if (cf3.n(tL_messageActionStarGift.from_id) != this.C2.Z0()) {
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
                    i = 2131750382;
                } else {
                    i = 2131750383;
                }
                textView.setText(k96.M0(i, null));
            } else if (z2) {
                textView.setText(k96.M0(2131750380, null));
            } else {
                textView.setText(k96.M0(2131750381, null));
            }
            if (!z && j3 > j && !z4) {
                z5 = true;
            } else {
                z5 = false;
            }
            wf2 wf2Var = this.r2;
            wf2Var.a(z5, false);
            if (this.m3 != null) {
                if (j3 > j || this.q3 != null) {
                    e2();
                    return;
                }
            } else {
                gta.v(this.a, false).H(j2, new qna(this, (byte) 2));
            }
            if (j3 <= j && this.q3 == null) {
                this.p3 = true;
                TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                if (!TextUtils.isEmpty(str)) {
                    TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade tL_inputInvoiceStarGiftPrepaidUpgrade = new TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade();
                    tL_inputInvoiceStarGiftPrepaidUpgrade.hash = str;
                    tL_inputInvoiceStarGiftPrepaidUpgrade.peer = na7.q1(this.a).h1(j4);
                    tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftPrepaidUpgrade;
                } else {
                    TLRPC.TL_inputInvoiceStarGiftUpgrade tL_inputInvoiceStarGiftUpgrade = new TLRPC.TL_inputInvoiceStarGiftUpgrade();
                    tL_inputInvoiceStarGiftUpgrade.keep_original_details = wf2Var.a.q;
                    tL_inputInvoiceStarGiftUpgrade.stargift = u1;
                    tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftUpgrade;
                }
                JSONObject u = ow0.u(this.J0, false);
                if (u != null) {
                    TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                    tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                    tL_dataJSON.data = u.toString();
                    tL_payments_getPaymentForm.flags |= 1;
                }
                ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_getPaymentForm, new xoa(this, (byte) 0));
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3 = kk7.H3;
        rqa rqaVar = this.a2;
        boolean z = true;
        if (i == i3) {
            if (this.B2 == ((xsa) objArr[1])) {
                upa upaVar = rqaVar.N;
                if (upaVar == null || !upaVar.i0) {
                    C2();
                }
            }
        } else if (i == kk7.c4) {
            rqaVar.setInWallet((this.d3 == null && this.a3 == null && x2(A1())) ? false : false);
        }
    }

    @Override
    public final void dismiss() {
        if (this.W2.c(4) && this.a2.N.i0) {
            return;
        }
        x99 x99Var = this.R2;
        if (x99Var != null) {
            x99Var.b();
            this.R2 = null;
        }
        hqa hqaVar = this.K2;
        if (hqaVar != null) {
            hqaVar.a();
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
        k27 k27Var = this.C2;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        if (k27Var != null) {
            TLRPC.MessageAction messageAction = k27Var.k.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                if (tL_messageActionStarGift.peer != null) {
                    z = true;
                } else {
                    z = false;
                }
                boolean O3 = k27Var.O3();
                if (k27.B0(this.C2.k) == y6c.h(this.a).e()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                int g = ((int) na7.q1(this.a).k4.v3.g(timeUnit)) - (ConnectionsManager.getInstance(this.a).getCurrentTime() - this.C2.k.date);
                if (((z || (O3 && !z2)) && ((peer = tL_messageActionStarGift.peer) == null || !G1(this.a, cf3.n(peer)))) || tL_messageActionStarGift.converted || tL_messageActionStarGift.convert_stars <= 0 || g <= 0) {
                    return false;
                }
                return true;
            }
        } else {
            TL_stars.SavedStarGift savedStarGift = this.A2;
            if (savedStarGift != null) {
                int g2 = ((int) na7.q1(this.a).k4.v3.g(timeUnit)) - (ConnectionsManager.getInstance(this.a).getCurrentTime() - savedStarGift.date);
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vqa.e2():void");
    }

    public final boolean f1() {
        int i;
        TL_stars.TL_starGiftUnique A1 = A1();
        if (A1 == null || A1.crafted || cq7.m(A1) || !G1(this.a, cf3.n(A1.owner_id))) {
            return false;
        }
        k27 k27Var = this.C2;
        if (k27Var != null) {
            TLRPC.Message message = k27Var.k;
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
            obj.a = k96.M0(2131749898, null);
            obj.b = true;
            obj.e = new nu9(this, r1, (byte) 9);
            Context context = getContext();
            int i = this.a;
            xu4 xu4Var = new xu4(context, i, false, oj0.a(i).b(), null, obj, this.J0);
            xu4[] xu4VarArr = {xu4Var};
            xu4Var.show();
        }
    }

    public final boolean g1() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vqa.g1():boolean");
    }

    public final boolean h1() {
        TL_stars.TL_starGiftUnique A1 = A1();
        if (A1 != null && !TextUtils.isEmpty(A1.slug)) {
            if (this.a3 != null || H1(A1) || E1(A1) || (cq7.u(A1) && F1(this.a, cf3.n(A1.owner_id)))) {
                gr grVar = na7.q1(this.a).k4;
                if (grVar.n0.f) {
                    if (grVar.s.f || grVar.t.f || H1(A1)) {
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
            String q = cf3.q(na7.q1(this.a).Z1(cf3.n(peer)));
            if (!TextUtils.isEmpty(q)) {
                return gl.O2(k96.a0(null, null, 2131750027, b00.h("@", q)), -1, 0, new noa(this, q, (byte) 8), null);
            }
        }
        return null;
    }

    public final void i1() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.J0, getContext());
        String M0 = k96.M0(2131750250, null);
        hd hdVar = alertDialog$Builder.a;
        hdVar.S = M0;
        hdVar.U = k96.M0(2131750251, null);
        TL_stars.TL_starGiftUnique A1 = A1();
        if (A1 != null && !TextUtils.isEmpty(A1.slug)) {
            alertDialog$Builder.j(k96.M0(2131747612, null), new uoa(this, A1, (byte) 1));
        }
        ug8.y(null, 2131752577, alertDialog$Builder, null);
    }

    public final SpannableStringBuilder i2(TL_stars.StarGift starGift) {
        if (starGift != null && !(starGift instanceof TL_stars.TL_starGiftUnique)) {
            return h2(starGift.released_by);
        }
        return null;
    }

    @Override
    public u21 j() {
        return new u21(this.k2, this.J0);
    }

    public final void j1(long j, TL_stars.starGiftDepositPayload stargiftdepositpayload, long j2, c01 c01Var, xu4 xu4Var) {
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
            c01Var.d();
            hoa hoaVar = new hoa(this, j2, c01Var, j, A1, E2, xu4Var, z, s1);
            if (stargiftdepositpayload != null) {
                hoaVar.a(stargiftdepositpayload);
                return;
            }
            TL_stars.depositStarGift depositstargift = new TL_stars.depositStarGift();
            depositstargift.peer = na7.q1(this.a).h1(j);
            depositstargift.slug = A1.slug;
            ConnectionsManager.getInstance(this.a).sendRequestTyped(depositstargift, new hc((byte) 0), new eu0(this, c01Var, xu4Var, hoaVar, (byte) 15));
        }
    }

    public final void k1(long j, p8c p8cVar) {
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
                k27 k27Var = this.C2;
                if (k27Var != null && (message = k27Var.k) != null) {
                    TLRPC.MessageAction messageAction = message.action;
                    if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                        TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
                        n = cf3.n(tL_messageActionStarGiftUnique.gift.owner_id);
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
                transferstargift.to_id = na7.q1(this.a).h1(j);
                ConnectionsManager.getInstance(this.a).sendRequest(transferstargift, new pn6(this, p8cVar, j, j3, (byte) 2));
                return;
            }
            gta v = gta.v(this.a, false);
            if (!v.e) {
                v.o(new mx8(this, v, j, p8cVar, (byte) 3));
                return;
            }
            TLRPC.TL_inputInvoiceStarGiftTransfer tL_inputInvoiceStarGiftTransfer = new TLRPC.TL_inputInvoiceStarGiftTransfer();
            tL_inputInvoiceStarGiftTransfer.stargift = u1;
            tL_inputInvoiceStarGiftTransfer.to_id = na7.q1(this.a).h1(j);
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftTransfer;
            JSONObject u = ow0.u(this.J0, false);
            if (u != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = u.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_getPaymentForm, new x75(this, tL_inputInvoiceStarGiftTransfer, j, j3, p8cVar));
        }
    }

    public final void l1() {
        TL_stars.InputSavedStarGift u1;
        long j;
        u41 u41Var = this.f2;
        if (!u41Var.R && (u1 = u1()) != null) {
            k27 k27Var = this.C2;
            String str = null;
            long j2 = 0;
            if (k27Var != null) {
                TLRPC.MessageAction messageAction = k27Var.k.action;
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
                u41Var.setLoading(true);
                wf2 wf2Var = this.r2;
                if (i > 0) {
                    TL_stars.upgradeStarGift upgradestargift = new TL_stars.upgradeStarGift();
                    upgradestargift.keep_original_details = wf2Var.a.q;
                    upgradestargift.stargift = u1;
                    ConnectionsManager.getInstance(this.a).sendRequest(upgradestargift, new hj7(this, u1, (byte) 29));
                    return;
                }
                int i2 = 0;
                gta v = gta.v(this.a, false);
                if (!v.e) {
                    v.o(new t7a(this, v, (byte) 15));
                    return;
                }
                TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
                tL_payments_sendStarsForm.form_id = this.q3.form_id;
                if (!TextUtils.isEmpty(str)) {
                    TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade tL_inputInvoiceStarGiftPrepaidUpgrade = new TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade();
                    tL_inputInvoiceStarGiftPrepaidUpgrade.hash = str;
                    tL_inputInvoiceStarGiftPrepaidUpgrade.peer = na7.q1(this.a).h1(this.S1);
                    tL_payments_sendStarsForm.invoice = tL_inputInvoiceStarGiftPrepaidUpgrade;
                } else {
                    TLRPC.TL_inputInvoiceStarGiftUpgrade tL_inputInvoiceStarGiftUpgrade = new TLRPC.TL_inputInvoiceStarGiftUpgrade();
                    tL_inputInvoiceStarGiftUpgrade.keep_original_details = wf2Var.a.q;
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
                ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_sendStarsForm, new ws0(this, str, u1, j2, (byte) 5));
            }
        }
    }

    public final void l2(defpackage.k27 r61, defpackage.ysa r62) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vqa.l2(k27, ysa):void");
    }

    public final void m2(String str, TL_stars.TL_starGiftUnique tL_starGiftUnique, ysa ysaVar) {
        boolean z;
        boolean z2;
        float f;
        hqa hqaVar;
        TL_stars.TL_starGiftUnique tL_starGiftUnique2;
        this.D2 = str;
        this.E2 = tL_starGiftUnique;
        this.B2 = ysaVar;
        if (this.d3 == null && tL_starGiftUnique.resell_amount != null && !F1(this.a, cf3.n(tL_starGiftUnique.owner_id)) && !D1(this.a, tL_starGiftUnique) && !H1(tL_starGiftUnique)) {
            z = true;
        } else {
            z = false;
        }
        this.F2 = z;
        if (!this.L2 && (hqaVar = this.K2) != null && hqaVar.o && (tL_starGiftUnique2 = hqaVar.l) != null && tL_starGiftUnique2.id != tL_starGiftUnique.id) {
            hqaVar.a();
            this.K2 = null;
            rqa rqaVar = this.a2;
            rqaVar.b.setAlpha(1.0f);
            rqaVar.c.setAlpha(0.0f);
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
        l46 l46Var = this.c2;
        if (wallettransaction == null && z2 && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            f = 0.66f;
            l46Var.setText(gl.F2(gl.O2(k96.M0(2131750165, null), -1, 0, new noa(this, str3, (byte) 3), null), true, gl.L(2.6666667f), gl.L(0.66f)));
            l46Var.setVisibility(0);
            zkb.X(l46Var, bkb.p5, this.J0);
        } else {
            f = 0.66f;
            l46Var.setVisibility(8);
        }
        TL_wallet.walletTransaction wallettransaction2 = this.d3;
        l46 l46Var2 = this.e2;
        if (wallettransaction2 == null && !z2 && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            l46Var2.setText(gl.F2(gl.O2(k96.M0(2131750165, null), -1, 0, new noa(this, str3, (byte) 4), null), true, gl.L(2.6666667f), gl.L(f)));
            l46Var2.setVisibility(0);
        } else {
            l46Var2.setVisibility(8);
        }
        D2();
        if (this.F2) {
            p2(tL_starGiftUnique);
            this.f2.setOnClickListener(new lna(this, (byte) 17));
        }
        if (this.Z2) {
            z2(0, false, null);
            this.m1.m0(1);
            this.Z2 = false;
        }
        C2();
    }

    public final void n2(org.telegram.tgnet.tl.TL_stars.SavedStarGift r36, defpackage.ysa r37) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vqa.n2(org.telegram.tgnet.tl.TL_stars$SavedStarGift, ysa):void");
    }

    @Override
    public final void o0() {
        je5 je5Var = this.w3;
        if (je5Var != null) {
            je5Var.f(true);
            this.w3 = null;
        }
    }

    public final void o2(org.telegram.tgnet.tl.TL_stars.TL_starGiftUnique r45, boolean r46, org.telegram.tgnet.TLObject r47, org.telegram.tgnet.TLRPC.TL_textWithEntities r48) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vqa.o2(org.telegram.tgnet.tl.TL_stars$TL_starGiftUnique, boolean, org.telegram.tgnet.TLObject, org.telegram.tgnet.TLRPC$TL_textWithEntities):void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        kk7.f(this.a).b(this, kk7.H3);
        kk7.f(this.a).b(this, kk7.c4);
    }

    @Override
    public final void onBackPressed() {
        rqa rqaVar;
        upa upaVar;
        if (this.W2.c(4) && (rqaVar = this.a2) != null && (upaVar = rqaVar.N) != null) {
            if (upaVar.i0) {
                return;
            }
            if (upaVar.j0) {
                super.onBackPressed();
                return;
            }
        }
        if (!this.v2 && this.W2.b > 0 && !this.f2.R && !this.l3) {
            k27 k27Var = this.C2;
            if (k27Var != null) {
                l2(k27Var, null);
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
        kk7.f(this.a).n(this, kk7.H3);
        kk7.f(this.a).n(this, kk7.c4);
    }

    @Override
    public final void p0() {
        super.p0();
        try {
            M(bkb.g5);
            rqa rqaVar = this.a2;
            if (rqaVar != null) {
                rqaVar.l();
            }
            cm2 cm2Var = this.Y2;
            if (cm2Var != null) {
                Drawable drawable = cm2Var.c;
                if (drawable instanceof sqa) {
                    ((sqa) drawable).d.setColor(bkb.v0(bkb.Ei, this.J0));
                    u41 u41Var = this.f2;
                    if (u41Var != null) {
                        u41Var.invalidate();
                    }
                }
            }
        } catch (Exception e) {
            fa4.g(e, true);
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
        nj resellAmount = tL_starGiftUnique.getResellAmount(oj.a);
        boolean z = tL_starGiftUnique.resale_ton_only;
        SpannableStringBuilder spannableStringBuilder = null;
        u41 u41Var = this.f2;
        if (z) {
            u41Var.i(jva.s1(jva.U0(k96.a0(null, null, 2131745953, tL_starGiftUnique.getResellAmount(oj.b).d()), true), true), !this.Z2, true);
            if (!cq7.m(tL_starGiftUnique)) {
                spannableStringBuilder = jva.S0(k96.H(',', "ResellGiftBuyEq", (int) resellAmount.a()));
            }
            u41Var.g(spannableStringBuilder, !this.Z2);
            return;
        }
        u41Var.i(jva.S0(k96.H(',', "ResellGiftBuy", (int) resellAmount.a())), !this.Z2, true);
        u41Var.g(null, !this.Z2);
    }

    public final long q1() {
        TLRPC.Peer peer;
        k27 k27Var = this.C2;
        if (k27Var != null) {
            TLRPC.Message message = k27Var.k;
            if (message != null) {
                TLRPC.MessageAction messageAction = message.action;
                if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                    TLRPC.Peer peer2 = ((TLRPC.TL_messageActionStarGift) messageAction).peer;
                    if (peer2 != null) {
                        return cf3.n(peer2);
                    }
                    if (k27Var.O3()) {
                        return k27.B0(this.C2.k);
                    }
                    return y6c.h(this.a).e();
                } else if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                    TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
                    TL_stars.StarGift starGift = tL_messageActionStarGiftUnique.gift;
                    if ((starGift instanceof TL_stars.TL_starGiftUnique) && (peer = starGift.owner_id) != null) {
                        return cf3.n(peer);
                    }
                    TLRPC.Peer peer3 = tL_messageActionStarGiftUnique.peer;
                    if (peer3 != null) {
                        return cf3.n(peer3);
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
                return cf3.n(((TL_stars.TL_starGiftUnique) starGift2).owner_id);
            }
            return this.S1;
        }
        TL_stars.TL_starGiftUnique tL_starGiftUnique = this.E2;
        if (tL_starGiftUnique != null) {
            return cf3.n(tL_starGiftUnique.owner_id);
        }
        return 0L;
    }

    public final void q2(TL_stars.TL_starGiftUnique tL_starGiftUnique, boolean z) {
        if (z) {
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_peerUser.user_id = y6c.h(this.a).e();
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
        k27 k27Var = this.C2;
        if (k27Var != null) {
            TLRPC.Message message = k27Var.k;
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
        hv4 hv4Var;
        hv4 hv4Var2;
        hv4 hv4Var3;
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
            ysa ysaVar = this.B2;
            if (ysaVar != null && i2 >= 0 && i2 < ysaVar.e()) {
                obj = this.B2.get(i2);
            } else {
                obj = null;
            }
            if (obj != null) {
                if (z) {
                    hv4Var = this.Y1;
                } else {
                    hv4Var = this.X1;
                }
                if (hv4Var != null) {
                    if (obj instanceof TL_stars.SavedStarGift) {
                        if (z) {
                            hv4Var3 = this.Y1;
                        } else {
                            hv4Var3 = this.X1;
                        }
                        if (m1(hv4Var3.A2, (TL_stars.SavedStarGift) obj)) {
                            return;
                        }
                    }
                    if (obj instanceof TL_stars.TL_starGiftUnique) {
                        if (z) {
                            hv4Var2 = this.Y1;
                        } else {
                            hv4Var2 = this.X1;
                        }
                        if (n1(hv4Var2.E2, (TL_stars.TL_starGiftUnique) obj)) {
                            return;
                        }
                    }
                }
                hv4 hv4Var4 = new hv4(this, getContext(), this.a, this.S1, this.J0, this.T1.getRootView());
                if (obj instanceof TL_stars.SavedStarGift) {
                    hv4Var4.n2((TL_stars.SavedStarGift) obj, this.B2);
                } else if (obj instanceof TL_stars.TL_starGiftUnique) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj;
                    hv4Var4.m2(tL_starGiftUnique.slug, tL_starGiftUnique, this.B2);
                }
                gl.B2(hv4Var4.b);
                if (z) {
                    this.Y1 = hv4Var4;
                } else {
                    this.X1 = hv4Var4;
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
            return ls6.m(tL_starGiftUnique.num, ',', sb);
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
        long n = cf3.n(peer);
        StringBuilder sb = new StringBuilder();
        sb.append(A1.title);
        sb.append(" #");
        this.x2.setText(k96.a0(null, null, 2131749817, ls6.m(A1.num, ',', sb)));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(k96.M0(2131749819, null));
        if (n == y6c.h(this.a).e() && !y6c.h(this.a).p()) {
            spannableStringBuilder.append((CharSequence) " l");
            cm2 cm2Var = this.S2;
            if (cm2Var == null) {
                cm2Var = new cm2(2131232248, 0);
                this.S2 = cm2Var;
            }
            spannableStringBuilder.setSpan(cm2Var, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        u41 u41Var = this.f2;
        u41Var.i(spannableStringBuilder, true, true);
        u41Var.g(null, true);
        u41Var.setOnClickListener(new roa(this, (byte) 2));
        this.a2.setWearPreview(na7.q1(this.a).Z1(n));
        z2(2, false, null);
        this.v2 = true;
    }

    @Override
    public final void show() {
        k27 k27Var;
        TLRPC.Message message;
        String str;
        if (na7.q1(this.a).t2()) {
            h5.b(this.a);
            return;
        }
        TL_wallet.nftItem nftitem = this.a3;
        if (nftitem != null && (str = this.D2) != null && this.E2 != null) {
            TL_stars.getUniqueStarGift getuniquestargift = new TL_stars.getUniqueStarGift();
            getuniquestargift.slug = str;
            ConnectionsManager.getInstance(this.a).sendRequest(getuniquestargift, new ck8(this, nftitem, str, (byte) 16));
        }
        if (this.D2 != null && this.E2 == null) {
            hd hdVar = new hd(3, null, getContext());
            hdVar.q(500L);
            TL_stars.getUniqueStarGift getuniquestargift2 = new TL_stars.getUniqueStarGift();
            getuniquestargift2.slug = this.D2;
            ConnectionsManager.getInstance(this.a).sendRequest(getuniquestargift2, new hj7(this, hdVar, (byte) 27));
        } else if (this.A2 == null && (k27Var = this.C2) != null && (message = k27Var.k) != null) {
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                if (tL_messageActionStarGift.upgraded) {
                    if (tL_messageActionStarGift.upgrade_msg_id != 0) {
                        hd hdVar2 = new hd(3, null, getContext());
                        hdVar2.q(500L);
                        TLRPC.TL_messages_getMessages tL_messages_getMessages = new TLRPC.TL_messages_getMessages();
                        tL_messages_getMessages.id.add(Integer.valueOf(tL_messageActionStarGift.upgrade_msg_id));
                        ConnectionsManager.getInstance(this.a).sendRequest(tL_messages_getMessages, new ck8((Object) this, (Object) tL_messageActionStarGift, hdVar2, (byte) 14));
                        return;
                    } else if (u1() != null) {
                        hd hdVar3 = new hd(3, null, getContext());
                        hdVar3.q(500L);
                        gta.v(this.a, false).J(u1(), new nu9(this, hdVar3, (byte) 6));
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
            JSONObject u = ow0.u(this.J0, false);
            if (u != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = u.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_getPaymentForm, new rt0(this, charSequence, A1, tL_inputInvoiceStarGiftDropOriginalDetails, (byte) 20));
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
            tL_inputSavedStarGiftChat.peer = na7.q1(this.a).h1(j);
            k27 k27Var = this.C2;
            if (k27Var != null && (message3 = k27Var.k) != null) {
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
        k27 k27Var2 = this.C2;
        if (k27Var2 != null && (message2 = k27Var2.k) != null) {
            TLRPC.MessageAction messageAction2 = message2.action;
            if ((messageAction2 instanceof TLRPC.TL_messageActionStarGift) && (messageAction2.flags & 4096) != 0) {
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift2 = (TLRPC.TL_messageActionStarGift) messageAction2;
                TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat2 = new TL_stars.TL_inputSavedStarGiftChat();
                na7 q1 = na7.q1(this.a);
                TLRPC.Peer peer = tL_messageActionStarGift2.peer;
                if (peer != null) {
                    B02 = cf3.n(peer);
                } else {
                    B02 = k27.B0(this.C2.k);
                }
                tL_inputSavedStarGiftChat2.peer = q1.h1(B02);
                tL_inputSavedStarGiftChat2.saved_id = tL_messageActionStarGift2.saved_id;
                return tL_inputSavedStarGiftChat2;
            }
        }
        if (k27Var2 != null && (message = k27Var2.k) != null) {
            TLRPC.MessageAction messageAction3 = message.action;
            if ((messageAction3 instanceof TLRPC.TL_messageActionStarGiftUnique) && (messageAction3.flags & 128) != 0) {
                TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique2 = (TLRPC.TL_messageActionStarGiftUnique) messageAction3;
                TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat3 = new TL_stars.TL_inputSavedStarGiftChat();
                na7 q12 = na7.q1(this.a);
                TLRPC.Peer peer2 = tL_messageActionStarGiftUnique2.peer;
                if (peer2 != null) {
                    B0 = cf3.n(peer2);
                } else {
                    B0 = k27.B0(this.C2.k);
                }
                tL_inputSavedStarGiftChat3.peer = q12.h1(B0);
                tL_inputSavedStarGiftChat3.saved_id = tL_messageActionStarGiftUnique2.saved_id;
                return tL_inputSavedStarGiftChat3;
            }
        }
        TL_stars.TL_inputSavedStarGiftUser tL_inputSavedStarGiftUser = new TL_stars.TL_inputSavedStarGiftUser();
        k27 k27Var3 = this.C2;
        if (k27Var3 != null) {
            TLRPC.Message message4 = k27Var3.k;
            if (message4 != null) {
                TLRPC.MessageAction messageAction4 = message4.action;
                if ((messageAction4 instanceof TLRPC.TL_messageActionStarGift) && (messageAction4.flags & 32768) != 0) {
                    tL_inputSavedStarGiftUser.msg_id = ((TLRPC.TL_messageActionStarGift) messageAction4).gift_msg_id;
                    return tL_inputSavedStarGiftUser;
                }
            }
            tL_inputSavedStarGiftUser.msg_id = k27Var3.e1();
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
        r41 r41Var;
        float primaryHorizontal;
        int i;
        je5 je5Var = this.w3;
        if ((je5Var == null || !je5Var.W || this.x3 != view) && view != null) {
            if (z) {
                if (view instanceof jia) {
                    jia jiaVar = (jia) view;
                    primaryHorizontal = (jiaVar.getRightDrawableWidth() / 2.0f) + jiaVar.getRightDrawableX();
                } else {
                    return;
                }
            } else {
                if (view instanceof TextView) {
                    layout = ((TextView) view).getLayout();
                } else if (view instanceof jia) {
                    layout = ((jia) view).getLayout();
                } else {
                    return;
                }
                if (layout != null) {
                    CharSequence text = layout.getText();
                    if (text instanceof Spanned) {
                        Spanned spanned = (Spanned) text;
                        r41[] r41VarArr = (r41[]) spanned.getSpans(0, spanned.length(), r41.class);
                        if (r41VarArr != null && r41VarArr.length > 0) {
                            primaryHorizontal = layout.getPrimaryHorizontal(spanned.getSpanStart(r41VarArr[r41VarArr.length - 1])) + view.getPaddingLeft() + (r41Var.a() / 2.0f);
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
            je5 je5Var2 = this.w3;
            if (je5Var2 != null) {
                je5Var2.f(true);
                this.w3 = null;
            }
            je5 je5Var3 = new je5(getContext(), 3);
            je5Var3.p(!z);
            je5Var3.t(charSequence);
            je5Var3.o(0.0f, (iArr2[0] + primaryHorizontal) - (gl.L(16.0f) + this.u0));
            float L = (iArr2[1] - gl.L(100.0f)) - (view.getHeight() / 2.0f);
            if (z) {
                i = 18;
            } else {
                i = 0;
            }
            je5Var3.setTranslationY(L + gl.L(i + 4.33f));
            je5Var3.d = 3000L;
            je5Var3.setPadding(gl.L(16.0f) + this.u0, 0, gl.L(16.0f) + this.u0, 0);
            je5Var3.r0 = new hh(je5Var3, (byte) 8);
            je5Var3.v();
            jo0Var.addView(je5Var3, nme.c(100.0f, -1));
            this.w3 = je5Var3;
            this.x3 = view;
        }
    }

    public final String v1() {
        TL_stars.StarGift r1 = r1();
        if ((r1 instanceof TL_stars.TL_starGiftUnique) && r1.slug != null) {
            return na7.q1(this.a).N2 + "/nft/" + r1.slug;
        }
        return null;
    }

    public final void v2(int i, Context context, boolean z) {
        int i2;
        int i3;
        LinearLayout j = de9.j(context, 1);
        FrameLayout frameLayout = new FrameLayout(context);
        int L = gl.L(64.0f);
        int i4 = bkb.Ei;
        ShapeDrawable K = bkb.K(L, bkb.v0(i4, this.J0));
        vkb M = zkb.M(i4);
        wjb wjbVar = this.J0;
        frameLayout.setBackground(K);
        zkb.j(frameLayout, K, M, null, wjbVar);
        j.addView(frameLayout, nme.t(64, 64, 49, 0, 6, 0, 0));
        ?? imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.f(2131624287, 42, 42, null);
        frameLayout.addView((View) imageView, nme.r(64, 64, 17));
        imageView.d();
        TextView b = hve.b(context, 20.0f, bkb.F6, true, null);
        b.setGravity(17);
        if (z) {
            i2 = 2131749989;
        } else {
            i2 = 2131749895;
        }
        b.setText(k96.M0(i2, null));
        j.addView(b, nme.t(-1, -2, 48, 24, 14, 24, 0));
        TextView b2 = hve.b(context, 14.0f, bkb.E6, false, null);
        b2.setGravity(17);
        if (z) {
            i3 = 2131749990;
        } else {
            i3 = 2131749896;
        }
        b2.setText(k96.a0(null, null, i3, k96.c0(Math.max(10, i))));
        j.addView(b2, nme.t(-1, -2, 48, 24, 6, 24, 6));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.J0, context);
        alertDialog$Builder.n(j);
        alertDialog$Builder.j(k96.M0(2131747638, null), null);
        alertDialog$Builder.o();
    }

    public final int w1() {
        int indexOf;
        ysa ysaVar = this.B2;
        if (ysaVar != null) {
            TL_stars.SavedStarGift savedStarGift = this.A2;
            if (savedStarGift != null) {
                indexOf = ysaVar.indexOf(savedStarGift);
            } else {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = this.E2;
                if (tL_starGiftUnique != null) {
                    indexOf = ysaVar.indexOf(tL_starGiftUnique);
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
        if (!cq7.m(A1())) {
            return false;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.J0, getContext());
        String M0 = k96.M0(2131749902, null);
        hd hdVar = alertDialog$Builder.a;
        hdVar.S = M0;
        hdVar.U = k96.M0(2131749515, null);
        if (h1()) {
            alertDialog$Builder.j(k96.M0(2131750416, null), new yna(this, (byte) 2));
            alertDialog$Builder.g(k96.M0(2131752577, null), null);
        } else {
            alertDialog$Builder.j(k96.M0(2131747638, null), null);
        }
        alertDialog$Builder.o();
        return true;
    }

    @Override
    public final void x0(int i) {
        super.x0(i);
        gl.p3(this, 0, false, null);
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
            ysa ysaVar = this.B2;
            if (ysaVar != null && i2 >= 0 && i2 < ysaVar.e()) {
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
        if (ug8.A(tL_starGiftUnique) && !TextUtils.isEmpty(tL_starGiftUnique.gift_address) && !TextUtils.isEmpty(tL_starGiftUnique.owner_address) && !cq7.m(tL_starGiftUnique)) {
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
            ysa ysaVar = this.B2;
            if (ysaVar != null && i2 >= 0 && i2 < ysaVar.e()) {
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

    public final void y2(boolean z, hd hdVar, c01 c01Var, Runnable runnable) {
        c01Var.d();
        y6c h = y6c.h(this.a);
        TL_account.tmpPassword tmppassword = h.y;
        if (tmppassword != null && tmppassword.valid_until < ConnectionsManager.getInstance(this.a).getCurrentTime() + 60) {
            h.y = null;
            h.u(false);
        }
        TL_account.tmpPassword tmppassword2 = h.y;
        if (tmppassword2 == null) {
            Z1(z, c01Var, runnable);
        } else {
            C1(tmppassword2.tmp_password, null, z, new m25(this, z, c01Var, runnable, hdVar));
        }
    }

    public final void z2(int r13, boolean r14, defpackage.k08 r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vqa.z2(int, boolean, k08):void");
    }
}
