package ai;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TableRow;
import android.widget.TextView;
import b8.mf;
import b8.pf;
import java.util.ArrayList;
import org.telegram.messenger.bd;
import org.telegram.messenger.h10;
import org.telegram.messenger.k9;
import org.telegram.messenger.m9;
import org.telegram.messenger.p9;
import org.telegram.messenger.q9;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.ma;
import org.telegram.ui.Components.qx0;
import org.telegram.ui.Components.rx0;
import org.telegram.ui.Components.s70;
import org.telegram.ui.Components.sj0;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.yr0;
public final class s0 extends ma implements p9 {
    public static final hc[] f956i2 = new hc[1];
    public static final qx0[] f957j2 = new qx0[1];
    public final TL_stars.StarGift Q1;
    public final long R1;
    public final LinearLayout S1;
    public final FrameLayout T1;
    public final TextView U1;
    public final hc V1;
    public final hc W1;
    public final hc X1;
    public final hc Y1;
    public final qx0 Z1;
    public final n0 f958a2;
    public final TableRow f959b2;
    public final gi.d c2;
    public final s70 f960d2;
    public final s70 f961e2;
    public m9 f962f2;
    public final CharSequence f963g2;
    public f41 f964h2;

    public s0(Context context, org.telegram.ui.ActionBar.e6 e6Var, long j10, TL_stars.StarGift starGift, Runnable runnable) {
        super(context, null, false, false, 1, e6Var);
        boolean z10;
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState;
        ArrayList<TL_stars.StarGiftAuctionRound> arrayList;
        int i3;
        int i10;
        String a02;
        String G;
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState2;
        this.Q1 = starGift;
        long j11 = starGift.f27230id;
        this.R1 = j11;
        this.C1 = org.telegram.messenger.g0.L(6.0f);
        this.f36108s1 = 0.2f;
        N();
        String str = starGift.title;
        String str2 = str == null ? "Gift" : str;
        LinearLayout linearLayout = new LinearLayout(context);
        this.S1 = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setClickable(true);
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, e6Var);
        kVar.D(-1, false);
        kVar.setOccupyStatusBar(false);
        d1(kVar, context, e6Var, starGift);
        FrameLayout frameLayout = new FrameLayout(context);
        this.T1 = frameLayout;
        frameLayout.addView(kVar, mf.o(-1, -2));
        linearLayout.addView(frameLayout);
        q2 q2Var = new q2(this.f28583a, context, e6Var);
        q2Var.f897d0 = true;
        q2Var.h(starGift, false, false, false, false, false);
        q2Var.setImageSize(org.telegram.messenger.g0.L(100.0f));
        q2Var.setImageLayer(7);
        q2Var.K.setVisibility(8);
        frameLayout.addView(q2Var, mf.d(130, 130.0f, 17, 0.0f, 18.0f, 0.0f, 14.0f));
        TextView textView = new TextView(context);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(17);
        textView.setText(str2);
        textView.setTextSize(1, 20.0f);
        int i11 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.V(textView, i11, e6Var);
        linearLayout.addView(textView, mf.t(-1, -2, 17, 20, 0, 20, 6));
        s70 s70Var = new s70(context, null);
        this.f960d2 = s70Var;
        s70Var.setGravity(17);
        s70Var.setText(TextUtils.concat(org.telegram.messenger.g0.X2(bd.G(starGift.gifts_per_round, "Gift2AuctionInfo2", str2)), " ", org.telegram.messenger.g0.I2(org.telegram.messenger.g0.U2(bd.M0(2131750365, null), new l0(context, e6Var, starGift, 0)), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(1.0f))));
        s70Var.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.r6.V(s70Var, i11, e6Var);
        int i12 = org.telegram.ui.ActionBar.k6.J6;
        org.telegram.ui.ActionBar.r6.H(s70Var, i12, e6Var);
        linearLayout.addView(s70Var, mf.t(-1, -2, 17, 20, 0, 20, 4));
        rx0 rx0Var = new rx0(context, e6Var);
        String M0 = bd.M0(2131750331, null);
        hc[] hcVarArr = f956i2;
        rx0Var.c(M0, "", null, hcVarArr);
        this.V1 = hcVarArr[0];
        rx0Var.c(bd.M0(2131750332, null), "", null, hcVarArr);
        this.W1 = hcVarArr[0];
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        frameLayout2.setClipChildren(false);
        frameLayout2.setClipToPadding(false);
        frameLayout2.addView(rx0Var, mf.e(-1, -2, 119));
        this.f958a2 = new n0(this, new gi.l3[1], frameLayout2, 0);
        TableRow c2 = rx0Var.c(bd.M0(2131749596, null), "", null, hcVarArr);
        this.f959b2 = c2;
        c2.setOnClickListener(new View.OnClickListener(this) {
            public final s0 f793b;

            {
                this.f793b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        new vg.v0(40, this.f793b.getContext(), (org.telegram.ui.ActionBar.e6) null).show();
                        return;
                    default:
                        this.f793b.f1();
                        return;
                }
            }
        });
        this.X1 = hcVarArr[0];
        qx0[] qx0VarArr = f957j2;
        rx0Var.c("", "", qx0VarArr, hcVarArr);
        this.Y1 = hcVarArr[0];
        this.Z1 = qx0VarArr[0];
        linearLayout.addView(frameLayout2, mf.k(16.0f, 16.0f, 14.0f, 18.0f, -1, -2));
        s70 s70Var2 = new s70(context, e6Var);
        this.f961e2 = s70Var2;
        s70Var2.setGravity(17);
        s70Var2.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.r6.V(s70Var2, i12, e6Var);
        org.telegram.ui.ActionBar.r6.H(s70Var2, i12, e6Var);
        s70Var2.setOnClickListener(new h(this, new boolean[1], e6Var, 3));
        pf.b(s70Var2, 0.02f, 1.5f);
        if (starGift.sticker != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("*");
            z10 = false;
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.p5(starGift.sticker, s70Var2.getPaint().getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
            this.f963g2 = spannableStringBuilder;
        } else {
            z10 = false;
            this.f963g2 = "";
        }
        gi.d dVar = new gi.d(context, e6Var, true);
        this.c2 = dVar;
        dVar.f();
        final int i13 = z10;
        dVar.setOnClickListener(new g0(this, j10, context, e6Var, runnable, 0));
        FrameLayout.LayoutParams d = mf.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f);
        int i14 = d.leftMargin;
        int i15 = this.f28618u0;
        d.leftMargin = i14 + i15;
        d.rightMargin += i15;
        this.f28586b.addView(dVar, d);
        tj0 tj0Var = this.f36102l1;
        int i16 = this.f28618u0;
        tj0Var.setPadding(i16, i13, i16, org.telegram.messenger.g0.L(64.0f));
        this.f964h2.O(i13);
        m9 l10 = q9.c(this.f28583a).l(j11, this);
        this.f962f2 = l10;
        if (l10 != null && (tL_starGiftAuctionState2 = l10.f24180f) != null) {
            if (tL_starGiftAuctionState2.start_date > ConnectionsManager.getInstance(this.f28583a).getCurrentTime()) {
                rx0Var.c(bd.M0(2131750339, null), bd.E(this.f962f2.f24180f.total_rounds, ','), null, null);
            } else {
                String M02 = bd.M0(2131750340, null);
                String E = bd.E(this.f962f2.f24180f.current_round, ',');
                String E2 = bd.E(this.f962f2.f24180f.total_rounds, ',');
                Object[] objArr = new Object[2];
                objArr[i13] = E;
                objArr[1] = E2;
                rx0Var.c(M02, bd.a0(null, null, 2131747836, objArr), null, null);
            }
        }
        m9 m9Var = this.f962f2;
        if (m9Var != null && (tL_starGiftAuctionState = m9Var.f24180f) != null && (arrayList = tL_starGiftAuctionState.rounds) != null) {
            int size = arrayList.size();
            for (int i17 = i13; i17 < size; i17++) {
                TL_stars.StarGiftAuctionRound starGiftAuctionRound = this.f962f2.f24180f.rounds.get(i17);
                if (i17 < size - 1) {
                    i3 = 1;
                    i10 = this.f962f2.f24180f.rounds.get(i17 + 1).num - 1;
                } else {
                    i3 = 1;
                    i10 = this.f962f2.f24180f.total_rounds;
                }
                int i18 = starGiftAuctionRound.num;
                if (i18 == i10) {
                    Object[] objArr2 = new Object[i3];
                    objArr2[i13] = Integer.valueOf(i18);
                    a02 = bd.a0(null, null, 2131750338, objArr2);
                } else {
                    Integer valueOf = Integer.valueOf(i18);
                    Integer valueOf2 = Integer.valueOf(i10);
                    Object[] objArr3 = new Object[2];
                    objArr3[i13] = valueOf;
                    objArr3[i3] = valueOf2;
                    a02 = bd.a0(null, null, 2131750336, objArr3);
                }
                if (starGiftAuctionRound.num == i10) {
                    String c02 = bd.c0(starGiftAuctionRound.duration);
                    String c03 = bd.c0(starGiftAuctionRound.current_window);
                    Integer valueOf3 = Integer.valueOf(starGiftAuctionRound.extend_top);
                    Object[] objArr4 = new Object[3];
                    objArr4[i13] = c02;
                    objArr4[1] = c03;
                    objArr4[2] = valueOf3;
                    G = bd.a0(null, null, 2131750337, objArr4);
                } else {
                    G = bd.G(starGiftAuctionRound.duration / 60, "Gift2AuctionTableCurrentRoundsTwoDuration", new Object[i13]);
                }
                rx0Var.c(a02, G, null, null);
            }
        }
        m9 m9Var2 = this.f962f2;
        if (m9Var2 != null && m9Var2.h != null) {
            q0 q0Var = new q0(this, context, e6Var, new h0(this, i13), new t(1), new t(1), new t(1), new t(1), new t(1), new t(1));
            q0Var.d(new ci.k5(1, 1));
            q0Var.setPreviewingAttributes(this.f962f2.h);
            q0Var.removeView(q0Var.Q);
            this.T1.addView(q0Var, i13, mf.e(-1, 288, 48));
            TextView textView2 = new TextView(context);
            this.U1 = textView2;
            textView2.setGravity(17);
            textView2.setTypeface(org.telegram.messenger.g0.o());
            textView2.setTextColor(-1);
            textView2.setTextSize(1, 12.0f);
            m9 m9Var3 = this.f962f2;
            if (m9Var3.f24181g != null) {
                textView2.setText(bd.M0(2131750371, null));
            } else if (m9Var3.g(ConnectionsManager.getInstance(h10.f22829t0).getCurrentTime())) {
                textView2.setText(bd.M0(2131750136, null));
            } else {
                textView2.setText(bd.M0(2131750137, null));
            }
            textView2.setBackground(org.telegram.ui.ActionBar.k6.b0(i13, 285212671, 13, 13));
            textView2.setPadding(org.telegram.messenger.g0.L(12.0f), i13, org.telegram.messenger.g0.L(12.0f), i13);
            TextView m10 = org.telegram.ui.Cells.f1.m(this.T1, textView2, mf.d(-2, 26.0f, 81, 16.0f, 0.0f, 16.0f, 77.0f), context);
            m10.setTypeface(org.telegram.messenger.g0.o());
            m10.setTextSize(1, 21.0f);
            m10.setText(str2);
            m10.setGravity(17);
            m10.setTextColor(-1);
            TextView m11 = org.telegram.ui.Cells.f1.m(this.T1, m10, mf.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 40.0f), context);
            m11.setTextSize(1, 13.0f);
            m11.setText(org.telegram.messenger.g0.I2(bd.M0(2131750358, null), i13, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(1.0f)));
            m11.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
            m11.setGravity(17);
            m11.setTextColor(-1342177281);
            m11.setOnClickListener(new View.OnClickListener(this) {
                public final s0 f793b;

                {
                    this.f793b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (i13) {
                        case 0:
                            new vg.v0(40, this.f793b.getContext(), (org.telegram.ui.ActionBar.e6) null).show();
                            return;
                        default:
                            this.f793b.f1();
                            return;
                    }
                }
            });
            pf.b(m11, 0.02f, 1.5f);
            this.T1.addView(m11, mf.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 12.0f));
            q2Var.setVisibility(8);
            textView.setVisibility(8);
            this.f960d2.setVisibility(8);
            s70 s70Var3 = new s70(context, e6Var);
            s70Var3.setGravity(17);
            s70Var3.setTextSize(1, 16.0f);
            int i19 = org.telegram.ui.ActionBar.k6.J6;
            org.telegram.ui.ActionBar.r6.V(s70Var3, i19, e6Var);
            org.telegram.ui.ActionBar.r6.H(s70Var3, i19, e6Var);
            s70Var3.setOnClickListener(new h(this, context, e6Var, 2));
            pf.b(s70Var3, 0.02f, 1.5f);
            this.S1.addView(s70Var3, mf.k(16.0f, 0.0f, 14.0f, 18.0f, -1, -2));
            ci.a aVar = new ci.a(dg.d.c(TL_stars.starGiftAttributeModel.class, this.f962f2.h));
            long j12 = starGift.upgrade_variants;
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            for (int i20 = i13; i20 < 3; i20++) {
                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) aVar.c();
                if (stargiftattributemodel != null) {
                    spannableStringBuilder2.append('*');
                    spannableStringBuilder2.setSpan(new org.telegram.ui.Components.p5(stargiftattributemodel.document, s70Var3.getPaint().getFontMetricsInt()), i20, i20 + 1, 33);
                }
            }
            String E3 = bd.E(j12, ',');
            Object[] objArr5 = new Object[2];
            objArr5[i13] = spannableStringBuilder2;
            objArr5[1] = E3;
            s70Var3.setText(org.telegram.messenger.g0.I2(bd.V(null, null, 2131750326, objArr5), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(1.0f)));
        }
        this.S1.addView(this.f961e2, mf.k(16.0f, 0.0f, 14.0f, 18.0f, -1, -2));
        h1(i13);
    }

    public static void d1(org.telegram.ui.ActionBar.k kVar, Context context, org.telegram.ui.ActionBar.e6 e6Var, TL_stars.StarGift starGift) {
        kVar.setActionBarMenuOnItemClick(new r0(context, starGift, e6Var));
        org.telegram.ui.ActionBar.q0 a10 = kVar.q().a(0, 2131231244);
        a10.setContentDescription(bd.M0(2131754839, "AccDescrMoreOptions"));
        a10.e(4, 2131232185, bd.M0(2131748339, null));
        a10.e(3, 2131231805, bd.M0(2131751762, null));
        a10.e(2, 2131232363, bd.M0(2131745468, null));
    }

    public static void e1(Context context, org.telegram.ui.ActionBar.e6 e6Var, int i3, long j10, long j11, l1 l1Var) {
        q9 c2 = q9.c(i3);
        f0 f0Var = new f0(context, e6Var, i3, j10, l1Var);
        m9 b10 = c2.b(j11);
        if (b10 != null) {
            f0Var.a(b10, null);
            return;
        }
        k9 k9Var = new k9(c2, f0Var, j11, 0);
        TL_stars.TL_inputStarGiftAuction tL_inputStarGiftAuction = new TL_stars.TL_inputStarGiftAuction();
        tL_inputStarGiftAuction.gift_id = j11;
        TL_payments.TL_getStarGiftAuctionState tL_getStarGiftAuctionState = new TL_payments.TL_getStarGiftAuctionState();
        tL_getStarGiftAuctionState.auction = tL_inputStarGiftAuction;
        tL_getStarGiftAuctionState.version = 0;
        c2.getConnectionsManager().sendRequestTyped(tL_getStarGiftAuctionState, new c3.b(1), new org.telegram.messenger.x3(1, c2, k9Var));
    }

    public static void g1(Context context, TL_stars.StarGift starGift, org.telegram.ui.ActionBar.e6 e6Var) {
        if (context != null && starGift != null) {
            org.telegram.ui.ActionBar.t2 l10 = org.telegram.messenger.k5.l(1, context, null, false);
            org.telegram.ui.ActionBar.e2 e2Var = l10.f28625y0;
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            linearLayout.setClipChildren(false);
            linearLayout.setClipToPadding(false);
            ImageView imageView = new ImageView(context);
            imageView.setPadding(org.telegram.messenger.g0.L(17.0f), org.telegram.messenger.g0.L(17.0f), org.telegram.messenger.g0.L(17.0f), org.telegram.messenger.g0.L(17.0f));
            imageView.setImageResource(2131231117);
            ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
            Paint paint = shapeDrawable.getPaint();
            int i3 = org.telegram.ui.ActionBar.k6.Ci;
            paint.setColor(org.telegram.ui.ActionBar.k6.w0(i3, e6Var));
            org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i3);
            imageView.setBackground(shapeDrawable);
            org.telegram.ui.ActionBar.r6.k(imageView, shapeDrawable, N, null, e6Var);
            linearLayout.addView(imageView, mf.t(80, 80, 17, 0, 21, 0, 16));
            TextView textView = new TextView(context);
            textView.setTypeface(org.telegram.messenger.g0.o());
            textView.setGravity(17);
            textView.setText(bd.M0(2131749826, null));
            textView.setTextSize(1, 20.0f);
            int i10 = org.telegram.ui.ActionBar.k6.G6;
            org.telegram.ui.ActionBar.r6.V(textView, i10, e6Var);
            linearLayout.addView(textView, mf.t(-1, -2, 17, 20, 0, 20, 6));
            TextView textView2 = new TextView(context);
            textView2.setGravity(17);
            textView2.setText(bd.M0(2131749825, null));
            textView2.setTextSize(1, 14.0f);
            org.telegram.ui.ActionBar.r6.V(textView2, i10, e6Var);
            linearLayout.addView(textView2, mf.t(-1, -2, 17, 20, 0, 20, 16));
            yr0 yr0Var = new yr0(context, e6Var);
            int i11 = starGift.gifts_per_round;
            yr0Var.f52386a.l(bd.G(i11, "GiftAuctionInfo1Header", Integer.valueOf(i11)), false);
            int i12 = starGift.gifts_per_round;
            yr0Var.f52387b.setText(bd.G(i12, "GiftAuctionInfo1Text", Integer.valueOf(i12)));
            yr0Var.d.setVisibility(8);
            ImageView imageView2 = yr0Var.f52388c;
            imageView2.setImageResource(2131231903);
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
            org.telegram.ui.ActionBar.r6.t(imageView2, i10, e6Var, mode);
            linearLayout.addView(yr0Var, mf.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
            yr0 yr0Var2 = new yr0(context, e6Var);
            yr0Var2.f52386a.l(bd.M0(2131749832, null), false);
            yr0Var2.f52387b.setText(bd.G(starGift.gifts_per_round, "GiftAuctionInfo2Text", new Object[0]));
            yr0Var2.d.setVisibility(8);
            ImageView imageView3 = yr0Var2.f52388c;
            imageView3.setImageResource(2131231773);
            org.telegram.ui.ActionBar.r6.t(imageView3, i10, e6Var, mode);
            linearLayout.addView(yr0Var2, mf.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
            yr0 yr0Var3 = new yr0(context, e6Var);
            yr0Var3.f52386a.l(bd.M0(2131749828, null), false);
            yr0Var3.f52387b.setText(bd.M0(2131749827, null));
            yr0Var3.d.setVisibility(8);
            ImageView imageView4 = yr0Var3.f52388c;
            imageView4.setImageResource(2131231766);
            org.telegram.ui.ActionBar.r6.t(imageView4, i10, e6Var, mode);
            linearLayout.addView(yr0Var3, mf.k(6.0f, 0.0f, 6.0f, 8.0f, -1, -2));
            gi.d dVar = new gi.d(context, e6Var, true);
            dVar.setOnClickListener(new j0(0, e2Var));
            dVar.i(ci.l6.g2(bd.M0(2131743898, null)), false, true);
            linearLayout.addView(dVar, mf.k(16.0f, 10.0f, 16.0f, 8.0f, -1, 48));
            l10.O = linearLayout;
            l10.show();
        }
    }

    @Override
    public final sj0 L0(tj0 tj0Var) {
        f41 f41Var = new f41(this.f36102l1, getContext(), this.f28583a, 0, true, new c(this, 3), this.J0);
        this.f964h2 = f41Var;
        f41Var.f33698r = false;
        return f41Var;
    }

    @Override
    public final CharSequence O0() {
        return "";
    }

    @Override
    public final void c(m9 m9Var) {
        this.f962f2 = m9Var;
        h1(true);
    }

    @Override
    public final void dismiss() {
        q9.c(this.f28583a).n(this.R1, this);
        super.dismiss();
    }

    public final void f1() {
        TL_stars.TL_starGiftAuctionStateFinished tL_starGiftAuctionStateFinished;
        m9 m9Var = this.f962f2;
        if (m9Var != null && (tL_starGiftAuctionStateFinished = m9Var.f24181g) != null && m9Var.d.title != null) {
            this.f958a2.a(this.X1, bd.a0(null, null, 2131750297, Long.valueOf(tL_starGiftAuctionStateFinished.average_price), this.f962f2.d.title));
        }
    }

    public final void h1(boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: ai.s0.h1(boolean):void");
    }
}
