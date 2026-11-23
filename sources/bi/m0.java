package bi;

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
import c8.ma;
import c8.ra;
import java.util.ArrayList;
import org.telegram.messenger.hd;
import org.telegram.messenger.k10;
import org.telegram.messenger.o10;
import org.telegram.messenger.p9;
import org.telegram.messenger.r9;
import org.telegram.messenger.u9;
import org.telegram.messenger.v9;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.dy0;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.ey0;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.nc;
import org.telegram.ui.Components.sa;
import org.telegram.ui.js0;
public final class m0 extends sa implements u9 {
    public static final nc[] f3869l2 = new nc[1];
    public static final dy0[] f3870m2 = new dy0[1];
    public final TL_stars.StarGift T1;
    public final long U1;
    public final LinearLayout V1;
    public final FrameLayout W1;
    public final TextView X1;
    public final nc Y1;
    public final nc Z1;
    public final nc f3871a2;
    public final nc f3872b2;
    public final dy0 f3873c2;
    public final h0 d2;
    public final TableRow f3874e2;
    public final hi.e f3875f2;
    public final m80 f3876g2;
    public final m80 f3877h2;
    public r9 f3878i2;
    public final CharSequence f3879j2;
    public c51 f3880k2;

    public m0(Context context, org.telegram.ui.ActionBar.h6 h6Var, long j3, TL_stars.StarGift starGift, Runnable runnable) {
        super(context, null, false, false, 1, h6Var);
        boolean z10;
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState;
        ArrayList<TL_stars.StarGiftAuctionRound> arrayList;
        int i7;
        int i10;
        String a02;
        String G;
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState2;
        this.T1 = starGift;
        long j10 = starGift.f28663id;
        this.U1 = j10;
        this.F1 = org.telegram.messenger.g0.L(6.0f);
        this.f39539v1 = 0.2f;
        O();
        String str = starGift.title;
        String str2 = str == null ? "Gift" : str;
        LinearLayout linearLayout = new LinearLayout(context);
        this.V1 = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setClickable(true);
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, h6Var);
        kVar.G(-1, false);
        kVar.setOccupyStatusBar(false);
        e1(kVar, context, h6Var, starGift);
        FrameLayout frameLayout = new FrameLayout(context);
        this.W1 = frameLayout;
        frameLayout.addView(kVar, ma.o(-1, -2));
        linearLayout.addView(frameLayout);
        g3 g3Var = new g3(this.f30173a, context, h6Var);
        g3Var.f3651d0 = true;
        g3Var.h(starGift, false, false, false, false, false);
        g3Var.setImageSize(org.telegram.messenger.g0.L(100.0f));
        g3Var.setImageLayer(7);
        g3Var.K.setVisibility(8);
        frameLayout.addView(g3Var, ma.d(130, 130.0f, 17, 0.0f, 18.0f, 0.0f, 14.0f));
        TextView textView = new TextView(context);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(17);
        textView.setText(str2);
        textView.setTextSize(1, 20.0f);
        int i11 = org.telegram.ui.ActionBar.m6.G6;
        org.telegram.ui.ActionBar.t6.U(textView, i11, h6Var);
        linearLayout.addView(textView, ma.t(-1, -2, 17, 20, 0, 20, 6));
        m80 m80Var = new m80(context, null);
        this.f3876g2 = m80Var;
        m80Var.setGravity(17);
        m80Var.setText(TextUtils.concat(org.telegram.messenger.g0.W2(hd.G(starGift.gifts_per_round, "Gift2AuctionInfo2", str2)), " ", org.telegram.messenger.g0.I2(org.telegram.messenger.g0.T2(hd.N0(2131750340, null), new f0(0, context, starGift, h6Var)), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(1.0f))));
        m80Var.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.t6.U(m80Var, i11, h6Var);
        int i12 = org.telegram.ui.ActionBar.m6.J6;
        org.telegram.ui.ActionBar.t6.G(m80Var, i12, h6Var);
        linearLayout.addView(m80Var, ma.t(-1, -2, 17, 20, 0, 20, 4));
        ey0 ey0Var = new ey0(context, h6Var);
        String N0 = hd.N0(2131750306, null);
        nc[] ncVarArr = f3869l2;
        ey0Var.e(N0, "", null, ncVarArr);
        this.Y1 = ncVarArr[0];
        ey0Var.e(hd.N0(2131750307, null), "", null, ncVarArr);
        this.Z1 = ncVarArr[0];
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        frameLayout2.setClipChildren(false);
        frameLayout2.setClipToPadding(false);
        frameLayout2.addView(ey0Var, ma.e(-1, -2, 119));
        this.d2 = new h0(this, new hi.l3[1], frameLayout2, 0);
        TableRow e10 = ey0Var.e(hd.N0(2131749412, null), "", null, ncVarArr);
        this.f3874e2 = e10;
        e10.setOnClickListener(new View.OnClickListener(this) {
            public final m0 f3639b;

            {
                this.f3639b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        new ug.y0(40, this.f3639b.getContext(), (org.telegram.ui.ActionBar.h6) null).show();
                        return;
                    default:
                        this.f3639b.g1();
                        return;
                }
            }
        });
        this.f3871a2 = ncVarArr[0];
        dy0[] dy0VarArr = f3870m2;
        ey0Var.e("", "", dy0VarArr, ncVarArr);
        this.f3872b2 = ncVarArr[0];
        this.f3873c2 = dy0VarArr[0];
        linearLayout.addView(frameLayout2, ma.k(16.0f, 16.0f, 14.0f, 18.0f, -1, -2));
        m80 m80Var2 = new m80(context, h6Var);
        this.f3877h2 = m80Var2;
        m80Var2.setGravity(17);
        m80Var2.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.t6.U(m80Var2, i12, h6Var);
        org.telegram.ui.ActionBar.t6.G(m80Var2, i12, h6Var);
        m80Var2.setOnClickListener(new ah.h(this, new boolean[1], h6Var, 4));
        ra.b(m80Var2, 0.02f, 1.5f);
        if (starGift.sticker != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("*");
            z10 = false;
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.y5(starGift.sticker, m80Var2.getPaint().getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
            this.f3879j2 = spannableStringBuilder;
        } else {
            z10 = false;
            this.f3879j2 = "";
        }
        hi.e eVar = new hi.e(context, h6Var, true);
        this.f3875f2 = eVar;
        eVar.f();
        final int i13 = z10;
        eVar.setOnClickListener(new a0(this, j3, context, h6Var, runnable, 0));
        FrameLayout.LayoutParams d = ma.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f);
        int i14 = d.leftMargin;
        int i15 = this.f30211u0;
        d.leftMargin = i14 + i15;
        d.rightMargin += i15;
        this.f30176b.addView(eVar, d);
        ek0 ek0Var = this.f39532o1;
        int i16 = this.f30211u0;
        ek0Var.setPadding(i16, i13, i16, org.telegram.messenger.g0.L(64.0f));
        this.f3880k2.O(i13);
        r9 l10 = v9.c(this.f30173a).l(j10, this);
        this.f3878i2 = l10;
        if (l10 != null && (tL_starGiftAuctionState2 = l10.f26583f) != null) {
            if (tL_starGiftAuctionState2.start_date > ConnectionsManager.getInstance(this.f30173a).getCurrentTime()) {
                ey0Var.e(hd.N0(2131750314, null), hd.E(this.f3878i2.f26583f.total_rounds, ','), null, null);
            } else {
                String N02 = hd.N0(2131750315, null);
                String E = hd.E(this.f3878i2.f26583f.current_round, ',');
                String E2 = hd.E(this.f3878i2.f26583f.total_rounds, ',');
                Object[] objArr = new Object[2];
                objArr[i13] = E;
                objArr[1] = E2;
                ey0Var.e(N02, hd.a0(null, null, 2131747634, objArr), null, null);
            }
        }
        r9 r9Var = this.f3878i2;
        if (r9Var != null && (tL_starGiftAuctionState = r9Var.f26583f) != null && (arrayList = tL_starGiftAuctionState.rounds) != null) {
            int size = arrayList.size();
            for (int i17 = i13; i17 < size; i17++) {
                TL_stars.StarGiftAuctionRound starGiftAuctionRound = this.f3878i2.f26583f.rounds.get(i17);
                if (i17 < size - 1) {
                    i7 = 1;
                    i10 = this.f3878i2.f26583f.rounds.get(i17 + 1).num - 1;
                } else {
                    i7 = 1;
                    i10 = this.f3878i2.f26583f.total_rounds;
                }
                int i18 = starGiftAuctionRound.num;
                if (i18 == i10) {
                    Object[] objArr2 = new Object[i7];
                    objArr2[i13] = Integer.valueOf(i18);
                    a02 = hd.a0(null, null, 2131750313, objArr2);
                } else {
                    Integer valueOf = Integer.valueOf(i18);
                    Integer valueOf2 = Integer.valueOf(i10);
                    Object[] objArr3 = new Object[2];
                    objArr3[i13] = valueOf;
                    objArr3[i7] = valueOf2;
                    a02 = hd.a0(null, null, 2131750311, objArr3);
                }
                if (starGiftAuctionRound.num == i10) {
                    String c02 = hd.c0(starGiftAuctionRound.duration);
                    String c03 = hd.c0(starGiftAuctionRound.current_window);
                    Integer valueOf3 = Integer.valueOf(starGiftAuctionRound.extend_top);
                    Object[] objArr4 = new Object[3];
                    objArr4[i13] = c02;
                    objArr4[1] = c03;
                    objArr4[2] = valueOf3;
                    G = hd.a0(null, null, 2131750312, objArr4);
                } else {
                    G = hd.G(starGiftAuctionRound.duration / 60, "Gift2AuctionTableCurrentRoundsTwoDuration", new Object[i13]);
                }
                ey0Var.e(a02, G, null, null);
            }
        }
        r9 r9Var2 = this.f3878i2;
        if (r9Var2 != null && r9Var2.h != null) {
            k0 k0Var = new k0(this, context, h6Var, new b0(this, i13), new o(1), new o(1), new o(1), new o(1), new o(1), new o(1));
            k0Var.d(new di.e5(1, 1));
            k0Var.setPreviewingAttributes(this.f3878i2.h);
            k0Var.removeView(k0Var.Q);
            this.W1.addView(k0Var, i13, ma.e(-1, 288, 48));
            TextView textView2 = new TextView(context);
            this.X1 = textView2;
            textView2.setGravity(17);
            textView2.setTypeface(org.telegram.messenger.g0.o());
            textView2.setTextColor(-1);
            textView2.setTextSize(1, 12.0f);
            r9 r9Var3 = this.f3878i2;
            if (r9Var3.f26584g != null) {
                textView2.setText(hd.N0(2131750346, null));
            } else if (r9Var3.g(ConnectionsManager.getInstance(k10.f24968t0).getCurrentTime())) {
                textView2.setText(hd.N0(2131750111, null));
            } else {
                textView2.setText(hd.N0(2131750112, null));
            }
            textView2.setBackground(org.telegram.ui.ActionBar.m6.b0(i13, 285212671, 13, 13));
            textView2.setPadding(org.telegram.messenger.g0.L(12.0f), i13, org.telegram.messenger.g0.L(12.0f), i13);
            TextView m10 = org.telegram.ui.Cells.c0.m(this.W1, textView2, ma.d(-2, 26.0f, 81, 16.0f, 0.0f, 16.0f, 77.0f), context);
            m10.setTypeface(org.telegram.messenger.g0.o());
            m10.setTextSize(1, 21.0f);
            m10.setText(str2);
            m10.setGravity(17);
            m10.setTextColor(-1);
            TextView m11 = org.telegram.ui.Cells.c0.m(this.W1, m10, ma.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 40.0f), context);
            m11.setTextSize(1, 13.0f);
            m11.setText(org.telegram.messenger.g0.I2(hd.N0(2131750333, null), i13, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(1.0f)));
            m11.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
            m11.setGravity(17);
            m11.setTextColor(-1342177281);
            m11.setOnClickListener(new View.OnClickListener(this) {
                public final m0 f3639b;

                {
                    this.f3639b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (i13) {
                        case 0:
                            new ug.y0(40, this.f3639b.getContext(), (org.telegram.ui.ActionBar.h6) null).show();
                            return;
                        default:
                            this.f3639b.g1();
                            return;
                    }
                }
            });
            ra.b(m11, 0.02f, 1.5f);
            this.W1.addView(m11, ma.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 12.0f));
            g3Var.setVisibility(8);
            textView.setVisibility(8);
            this.f3876g2.setVisibility(8);
            m80 m80Var3 = new m80(context, h6Var);
            m80Var3.setGravity(17);
            m80Var3.setTextSize(1, 16.0f);
            int i19 = org.telegram.ui.ActionBar.m6.J6;
            org.telegram.ui.ActionBar.t6.U(m80Var3, i19, h6Var);
            org.telegram.ui.ActionBar.t6.G(m80Var3, i19, h6Var);
            m80Var3.setOnClickListener(new ah.h(this, context, h6Var, 3));
            ra.b(m80Var3, 0.02f, 1.5f);
            this.V1.addView(m80Var3, ma.k(16.0f, 0.0f, 14.0f, 18.0f, -1, -2));
            com.google.android.gms.common.api.internal.p pVar = new com.google.android.gms.common.api.internal.p(cg.d.c(TL_stars.starGiftAttributeModel.class, this.f3878i2.h));
            long j11 = starGift.upgrade_variants;
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            for (int i20 = i13; i20 < 3; i20++) {
                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) pVar.c();
                if (stargiftattributemodel != null) {
                    spannableStringBuilder2.append('*');
                    spannableStringBuilder2.setSpan(new org.telegram.ui.Components.y5(stargiftattributemodel.document, m80Var3.getPaint().getFontMetricsInt()), i20, i20 + 1, 33);
                }
            }
            String E3 = hd.E(j11, ',');
            Object[] objArr5 = new Object[2];
            objArr5[i13] = spannableStringBuilder2;
            objArr5[1] = E3;
            m80Var3.setText(org.telegram.messenger.g0.I2(hd.V(null, null, 2131750301, objArr5), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(1.0f)));
        }
        this.V1.addView(this.f3877h2, ma.k(16.0f, 0.0f, 14.0f, 18.0f, -1, -2));
        i1(i13);
    }

    public static void e1(org.telegram.ui.ActionBar.k kVar, Context context, org.telegram.ui.ActionBar.h6 h6Var, TL_stars.StarGift starGift) {
        kVar.setActionBarMenuOnItemClick(new l0(context, starGift, h6Var));
        org.telegram.ui.ActionBar.q0 a10 = kVar.s().a(0, 2131231244);
        a10.setContentDescription(hd.N0(2131754838, "AccDescrMoreOptions"));
        a10.e(4, 2131232187, hd.N0(2131748138, null));
        a10.e(3, 2131231806, hd.N0(2131751750, null));
        a10.e(2, 2131232365, hd.N0(2131745262, null));
    }

    public static void f1(Context context, org.telegram.ui.ActionBar.h6 h6Var, int i7, long j3, long j10, h2 h2Var) {
        v9 c10 = v9.c(i7);
        z zVar = new z(context, h6Var, i7, j3, h2Var);
        r9 b10 = c10.b(j10);
        if (b10 != null) {
            zVar.a(b10, null);
            return;
        }
        p9 p9Var = new p9(c10, zVar, j10, 0);
        TL_stars.TL_inputStarGiftAuction tL_inputStarGiftAuction = new TL_stars.TL_inputStarGiftAuction();
        tL_inputStarGiftAuction.gift_id = j10;
        TL_payments.TL_getStarGiftAuctionState tL_getStarGiftAuctionState = new TL_payments.TL_getStarGiftAuctionState();
        tL_getStarGiftAuctionState.auction = tL_inputStarGiftAuction;
        tL_getStarGiftAuctionState.version = 0;
        c10.getConnectionsManager().sendRequestTyped(tL_getStarGiftAuctionState, new d3.b(1), new org.telegram.messenger.z3(2, c10, p9Var));
    }

    public static void h1(Context context, TL_stars.StarGift starGift, org.telegram.ui.ActionBar.h6 h6Var) {
        if (context != null && starGift != null) {
            org.telegram.ui.ActionBar.w2 j3 = org.telegram.messenger.f3.j(1, context, null, false);
            org.telegram.ui.ActionBar.h2 h2Var = j3.f30218y0;
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            linearLayout.setClipChildren(false);
            linearLayout.setClipToPadding(false);
            ImageView imageView = new ImageView(context);
            imageView.setPadding(org.telegram.messenger.g0.L(17.0f), org.telegram.messenger.g0.L(17.0f), org.telegram.messenger.g0.L(17.0f), org.telegram.messenger.g0.L(17.0f));
            imageView.setImageResource(2131231117);
            ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
            Paint paint = shapeDrawable.getPaint();
            int i7 = org.telegram.ui.ActionBar.m6.Fi;
            paint.setColor(org.telegram.ui.ActionBar.m6.w0(i7, h6Var));
            org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i7);
            imageView.setBackground(shapeDrawable);
            org.telegram.ui.ActionBar.t6.j(imageView, shapeDrawable, M, null, h6Var);
            linearLayout.addView(imageView, ma.t(80, 80, 17, 0, 21, 0, 16));
            TextView textView = new TextView(context);
            textView.setTypeface(org.telegram.messenger.g0.o());
            textView.setGravity(17);
            textView.setText(hd.N0(2131749801, null));
            textView.setTextSize(1, 20.0f);
            int i10 = org.telegram.ui.ActionBar.m6.G6;
            org.telegram.ui.ActionBar.t6.U(textView, i10, h6Var);
            linearLayout.addView(textView, ma.t(-1, -2, 17, 20, 0, 20, 6));
            TextView textView2 = new TextView(context);
            textView2.setGravity(17);
            o10.l(14.0f, 2131749800, 1, textView2, null);
            org.telegram.ui.ActionBar.t6.U(textView2, i10, h6Var);
            linearLayout.addView(textView2, ma.t(-1, -2, 17, 20, 0, 20, 16));
            js0 js0Var = new js0(context, h6Var);
            int i11 = starGift.gifts_per_round;
            js0Var.f49088a.l(hd.G(i11, "GiftAuctionInfo1Header", Integer.valueOf(i11)), false);
            int i12 = starGift.gifts_per_round;
            js0Var.f49089b.setText(hd.G(i12, "GiftAuctionInfo1Text", Integer.valueOf(i12)));
            js0Var.d.setVisibility(8);
            ImageView imageView2 = js0Var.f49090c;
            imageView2.setImageResource(2131231904);
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
            org.telegram.ui.ActionBar.t6.s(imageView2, i10, h6Var, mode);
            linearLayout.addView(js0Var, ma.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
            js0 js0Var2 = new js0(context, h6Var);
            js0Var2.f49088a.l(hd.N0(2131749807, null), false);
            js0Var2.f49089b.setText(hd.G(starGift.gifts_per_round, "GiftAuctionInfo2Text", new Object[0]));
            js0Var2.d.setVisibility(8);
            ImageView imageView3 = js0Var2.f49090c;
            imageView3.setImageResource(2131231774);
            org.telegram.ui.ActionBar.t6.s(imageView3, i10, h6Var, mode);
            linearLayout.addView(js0Var2, ma.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
            js0 js0Var3 = new js0(context, h6Var);
            js0Var3.f49088a.l(hd.N0(2131749803, null), false);
            js0Var3.f49089b.setText(hd.N0(2131749802, null));
            js0Var3.d.setVisibility(8);
            ImageView imageView4 = js0Var3.f49090c;
            imageView4.setImageResource(2131231767);
            org.telegram.ui.ActionBar.t6.s(imageView4, i10, h6Var, mode);
            linearLayout.addView(js0Var3, ma.k(6.0f, 0.0f, 6.0f, 8.0f, -1, -2));
            hi.e eVar = new hi.e(context, h6Var, true);
            eVar.setOnClickListener(new d0(0, h2Var));
            eVar.i(di.f6.t2(hd.N0(2131743643, null)), false, true);
            linearLayout.addView(eVar, ma.k(16.0f, 10.0f, 16.0f, 8.0f, -1, 48));
            j3.O = linearLayout;
            j3.show();
        }
    }

    @Override
    public final dk0 M0(ek0 ek0Var) {
        c51 c51Var = new c51(this.f39532o1, getContext(), this.f30173a, 0, true, new b(this, 3), this.J0);
        this.f3880k2 = c51Var;
        c51Var.f34062r = false;
        return c51Var;
    }

    @Override
    public final CharSequence P0() {
        return "";
    }

    @Override
    public final void c(r9 r9Var) {
        this.f3878i2 = r9Var;
        i1(true);
    }

    @Override
    public final void dismiss() {
        v9.c(this.f30173a).n(this.U1, this);
        super.dismiss();
    }

    public final void g1() {
        TL_stars.TL_starGiftAuctionStateFinished tL_starGiftAuctionStateFinished;
        r9 r9Var = this.f3878i2;
        if (r9Var != null && (tL_starGiftAuctionStateFinished = r9Var.f26584g) != null && r9Var.d.title != null) {
            this.d2.a(this.f3871a2, hd.a0(null, null, 2131750272, Long.valueOf(tL_starGiftAuctionStateFinished.average_price), this.f3878i2.d.title));
        }
    }

    public final void i1(boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: bi.m0.i1(boolean):void");
    }
}
