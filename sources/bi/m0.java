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
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.n10;
import org.telegram.messenger.o9;
import org.telegram.messenger.q9;
import org.telegram.messenger.t9;
import org.telegram.messenger.u9;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.by0;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.cy0;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.nc;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.z41;
import org.telegram.ui.js0;
public final class m0 extends sa implements t9 {
    public static final nc[] f3857l2 = new nc[1];
    public static final by0[] f3858m2 = new by0[1];
    public final TL_stars.StarGift T1;
    public final long U1;
    public final LinearLayout V1;
    public final FrameLayout W1;
    public final TextView X1;
    public final nc Y1;
    public final nc Z1;
    public final nc f3859a2;
    public final nc f3860b2;
    public final by0 f3861c2;
    public final h0 d2;
    public final TableRow f3862e2;
    public final hi.d f3863f2;
    public final k80 f3864g2;
    public final k80 f3865h2;
    public q9 f3866i2;
    public final CharSequence f3867j2;
    public z41 f3868k2;

    public m0(Context context, org.telegram.ui.ActionBar.i6 i6Var, long j3, TL_stars.StarGift starGift, Runnable runnable) {
        super(context, null, false, false, 1, i6Var);
        boolean z10;
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState;
        ArrayList<TL_stars.StarGiftAuctionRound> arrayList;
        int i7;
        int i10;
        String a02;
        String G;
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState2;
        this.T1 = starGift;
        long j10 = starGift.f28634id;
        this.U1 = j10;
        this.F1 = org.telegram.messenger.g0.L(6.0f);
        this.f39541v1 = 0.2f;
        O();
        String str = starGift.title;
        String str2 = str == null ? "Gift" : str;
        LinearLayout linearLayout = new LinearLayout(context);
        this.V1 = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setClickable(true);
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, i6Var);
        kVar.I(-1, false);
        kVar.setOccupyStatusBar(false);
        e1(kVar, context, i6Var, starGift);
        FrameLayout frameLayout = new FrameLayout(context);
        this.W1 = frameLayout;
        frameLayout.addView(kVar, ma.o(-1, -2));
        linearLayout.addView(frameLayout);
        c3 c3Var = new c3(this.f30189a, context, i6Var);
        c3Var.f3493d0 = true;
        c3Var.h(starGift, false, false, false, false, false);
        c3Var.setImageSize(org.telegram.messenger.g0.L(100.0f));
        c3Var.setImageLayer(7);
        c3Var.K.setVisibility(8);
        frameLayout.addView(c3Var, ma.d(130, 130.0f, 17, 0.0f, 18.0f, 0.0f, 14.0f));
        TextView textView = new TextView(context);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(17);
        textView.setText(str2);
        textView.setTextSize(1, 20.0f);
        int i11 = org.telegram.ui.ActionBar.n6.G6;
        org.telegram.ui.ActionBar.u6.U(textView, i11, i6Var);
        linearLayout.addView(textView, ma.t(-1, -2, 17, 20, 0, 20, 6));
        k80 k80Var = new k80(context, null);
        this.f3864g2 = k80Var;
        k80Var.setGravity(17);
        k80Var.setText(TextUtils.concat(org.telegram.messenger.g0.W2(gd.G(starGift.gifts_per_round, "Gift2AuctionInfo2", str2)), " ", org.telegram.messenger.g0.I2(org.telegram.messenger.g0.T2(gd.M0(2131750341, null), new f0(0, context, starGift, i6Var)), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(1.0f))));
        k80Var.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.u6.U(k80Var, i11, i6Var);
        int i12 = org.telegram.ui.ActionBar.n6.J6;
        org.telegram.ui.ActionBar.u6.G(k80Var, i12, i6Var);
        linearLayout.addView(k80Var, ma.t(-1, -2, 17, 20, 0, 20, 4));
        cy0 cy0Var = new cy0(context, i6Var);
        String M0 = gd.M0(2131750307, null);
        nc[] ncVarArr = f3857l2;
        cy0Var.e(M0, "", null, ncVarArr);
        this.Y1 = ncVarArr[0];
        cy0Var.e(gd.M0(2131750308, null), "", null, ncVarArr);
        this.Z1 = ncVarArr[0];
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        frameLayout2.setClipChildren(false);
        frameLayout2.setClipToPadding(false);
        frameLayout2.addView(cy0Var, ma.e(-1, -2, 119));
        this.d2 = new h0(this, new hi.m3[1], frameLayout2, 0);
        TableRow e10 = cy0Var.e(gd.M0(2131749413, null), "", null, ncVarArr);
        this.f3862e2 = e10;
        e10.setOnClickListener(new View.OnClickListener(this) {
            public final m0 f3620b;

            {
                this.f3620b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        new ug.z0(40, this.f3620b.getContext(), (org.telegram.ui.ActionBar.i6) null).show();
                        return;
                    default:
                        this.f3620b.g1();
                        return;
                }
            }
        });
        this.f3859a2 = ncVarArr[0];
        by0[] by0VarArr = f3858m2;
        cy0Var.e("", "", by0VarArr, ncVarArr);
        this.f3860b2 = ncVarArr[0];
        this.f3861c2 = by0VarArr[0];
        linearLayout.addView(frameLayout2, ma.k(16.0f, 16.0f, 14.0f, 18.0f, -1, -2));
        k80 k80Var2 = new k80(context, i6Var);
        this.f3865h2 = k80Var2;
        k80Var2.setGravity(17);
        k80Var2.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.u6.U(k80Var2, i12, i6Var);
        org.telegram.ui.ActionBar.u6.G(k80Var2, i12, i6Var);
        k80Var2.setOnClickListener(new ah.h(this, new boolean[1], i6Var, 4));
        ra.b(k80Var2, 0.02f, 1.5f);
        if (starGift.sticker != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("*");
            z10 = false;
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.x5(starGift.sticker, k80Var2.getPaint().getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
            this.f3867j2 = spannableStringBuilder;
        } else {
            z10 = false;
            this.f3867j2 = "";
        }
        hi.d dVar = new hi.d(context, i6Var, true);
        this.f3863f2 = dVar;
        dVar.f();
        final int i13 = z10;
        dVar.setOnClickListener(new a0(this, j3, context, i6Var, runnable, 0));
        FrameLayout.LayoutParams d = ma.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f);
        int i14 = d.leftMargin;
        int i15 = this.f30227u0;
        d.leftMargin = i14 + i15;
        d.rightMargin += i15;
        this.f30192b.addView(dVar, d);
        ck0 ck0Var = this.f39534o1;
        int i16 = this.f30227u0;
        ck0Var.setPadding(i16, i13, i16, org.telegram.messenger.g0.L(64.0f));
        this.f3868k2.O(i13);
        q9 l10 = u9.c(this.f30189a).l(j10, this);
        this.f3866i2 = l10;
        if (l10 != null && (tL_starGiftAuctionState2 = l10.f26374f) != null) {
            if (tL_starGiftAuctionState2.start_date > ConnectionsManager.getInstance(this.f30189a).getCurrentTime()) {
                cy0Var.e(gd.M0(2131750315, null), gd.E(this.f3866i2.f26374f.total_rounds, ','), null, null);
            } else {
                String M02 = gd.M0(2131750316, null);
                String E = gd.E(this.f3866i2.f26374f.current_round, ',');
                String E2 = gd.E(this.f3866i2.f26374f.total_rounds, ',');
                Object[] objArr = new Object[2];
                objArr[i13] = E;
                objArr[1] = E2;
                cy0Var.e(M02, gd.a0(null, null, 2131747635, objArr), null, null);
            }
        }
        q9 q9Var = this.f3866i2;
        if (q9Var != null && (tL_starGiftAuctionState = q9Var.f26374f) != null && (arrayList = tL_starGiftAuctionState.rounds) != null) {
            int size = arrayList.size();
            for (int i17 = i13; i17 < size; i17++) {
                TL_stars.StarGiftAuctionRound starGiftAuctionRound = this.f3866i2.f26374f.rounds.get(i17);
                if (i17 < size - 1) {
                    i7 = 1;
                    i10 = this.f3866i2.f26374f.rounds.get(i17 + 1).num - 1;
                } else {
                    i7 = 1;
                    i10 = this.f3866i2.f26374f.total_rounds;
                }
                int i18 = starGiftAuctionRound.num;
                if (i18 == i10) {
                    Object[] objArr2 = new Object[i7];
                    objArr2[i13] = Integer.valueOf(i18);
                    a02 = gd.a0(null, null, 2131750314, objArr2);
                } else {
                    Integer valueOf = Integer.valueOf(i18);
                    Integer valueOf2 = Integer.valueOf(i10);
                    Object[] objArr3 = new Object[2];
                    objArr3[i13] = valueOf;
                    objArr3[i7] = valueOf2;
                    a02 = gd.a0(null, null, 2131750312, objArr3);
                }
                if (starGiftAuctionRound.num == i10) {
                    String c02 = gd.c0(starGiftAuctionRound.duration);
                    String c03 = gd.c0(starGiftAuctionRound.current_window);
                    Integer valueOf3 = Integer.valueOf(starGiftAuctionRound.extend_top);
                    Object[] objArr4 = new Object[3];
                    objArr4[i13] = c02;
                    objArr4[1] = c03;
                    objArr4[2] = valueOf3;
                    G = gd.a0(null, null, 2131750313, objArr4);
                } else {
                    G = gd.G(starGiftAuctionRound.duration / 60, "Gift2AuctionTableCurrentRoundsTwoDuration", new Object[i13]);
                }
                cy0Var.e(a02, G, null, null);
            }
        }
        q9 q9Var2 = this.f3866i2;
        if (q9Var2 != null && q9Var2.h != null) {
            k0 k0Var = new k0(this, context, i6Var, new b0(this, i13), new o(1), new o(1), new o(1), new o(1), new o(1), new o(1));
            k0Var.d(new di.e5(1, 1));
            k0Var.setPreviewingAttributes(this.f3866i2.h);
            k0Var.removeView(k0Var.Q);
            this.W1.addView(k0Var, i13, ma.e(-1, 288, 48));
            TextView textView2 = new TextView(context);
            this.X1 = textView2;
            textView2.setGravity(17);
            textView2.setTypeface(org.telegram.messenger.g0.o());
            textView2.setTextColor(-1);
            textView2.setTextSize(1, 12.0f);
            q9 q9Var3 = this.f3866i2;
            if (q9Var3.f26375g != null) {
                textView2.setText(gd.M0(2131750347, null));
            } else if (q9Var3.g(ConnectionsManager.getInstance(j10.f24773t0).getCurrentTime())) {
                textView2.setText(gd.M0(2131750112, null));
            } else {
                textView2.setText(gd.M0(2131750113, null));
            }
            textView2.setBackground(org.telegram.ui.ActionBar.n6.b0(i13, 285212671, 13, 13));
            textView2.setPadding(org.telegram.messenger.g0.L(12.0f), i13, org.telegram.messenger.g0.L(12.0f), i13);
            TextView m10 = org.telegram.ui.Cells.c0.m(this.W1, textView2, ma.d(-2, 26.0f, 81, 16.0f, 0.0f, 16.0f, 77.0f), context);
            m10.setTypeface(org.telegram.messenger.g0.o());
            m10.setTextSize(1, 21.0f);
            m10.setText(str2);
            m10.setGravity(17);
            m10.setTextColor(-1);
            TextView m11 = org.telegram.ui.Cells.c0.m(this.W1, m10, ma.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 40.0f), context);
            m11.setTextSize(1, 13.0f);
            m11.setText(org.telegram.messenger.g0.I2(gd.M0(2131750334, null), i13, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(1.0f)));
            m11.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
            m11.setGravity(17);
            m11.setTextColor(-1342177281);
            m11.setOnClickListener(new View.OnClickListener(this) {
                public final m0 f3620b;

                {
                    this.f3620b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (i13) {
                        case 0:
                            new ug.z0(40, this.f3620b.getContext(), (org.telegram.ui.ActionBar.i6) null).show();
                            return;
                        default:
                            this.f3620b.g1();
                            return;
                    }
                }
            });
            ra.b(m11, 0.02f, 1.5f);
            this.W1.addView(m11, ma.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 12.0f));
            c3Var.setVisibility(8);
            textView.setVisibility(8);
            this.f3864g2.setVisibility(8);
            k80 k80Var3 = new k80(context, i6Var);
            k80Var3.setGravity(17);
            k80Var3.setTextSize(1, 16.0f);
            int i19 = org.telegram.ui.ActionBar.n6.J6;
            org.telegram.ui.ActionBar.u6.U(k80Var3, i19, i6Var);
            org.telegram.ui.ActionBar.u6.G(k80Var3, i19, i6Var);
            k80Var3.setOnClickListener(new ah.h(this, context, i6Var, 3));
            ra.b(k80Var3, 0.02f, 1.5f);
            this.V1.addView(k80Var3, ma.k(16.0f, 0.0f, 14.0f, 18.0f, -1, -2));
            com.google.android.gms.common.api.internal.p pVar = new com.google.android.gms.common.api.internal.p(cg.d.c(TL_stars.starGiftAttributeModel.class, this.f3866i2.h));
            long j11 = starGift.upgrade_variants;
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            for (int i20 = i13; i20 < 3; i20++) {
                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) pVar.c();
                if (stargiftattributemodel != null) {
                    spannableStringBuilder2.append('*');
                    spannableStringBuilder2.setSpan(new org.telegram.ui.Components.x5(stargiftattributemodel.document, k80Var3.getPaint().getFontMetricsInt()), i20, i20 + 1, 33);
                }
            }
            String E3 = gd.E(j11, ',');
            Object[] objArr5 = new Object[2];
            objArr5[i13] = spannableStringBuilder2;
            objArr5[1] = E3;
            k80Var3.setText(org.telegram.messenger.g0.I2(gd.V(null, null, 2131750302, objArr5), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(1.0f)));
        }
        this.V1.addView(this.f3865h2, ma.k(16.0f, 0.0f, 14.0f, 18.0f, -1, -2));
        i1(i13);
    }

    public static void e1(org.telegram.ui.ActionBar.k kVar, Context context, org.telegram.ui.ActionBar.i6 i6Var, TL_stars.StarGift starGift) {
        kVar.setActionBarMenuOnItemClick(new l0(context, starGift, i6Var));
        org.telegram.ui.ActionBar.r0 a10 = kVar.t().a(0, 2131231244);
        a10.setContentDescription(gd.M0(2131754839, "AccDescrMoreOptions"));
        a10.e(4, 2131232187, gd.M0(2131748139, null));
        a10.e(3, 2131231806, gd.M0(2131751751, null));
        a10.e(2, 2131232365, gd.M0(2131745263, null));
    }

    public static void f1(Context context, org.telegram.ui.ActionBar.i6 i6Var, int i7, long j3, long j10, d2 d2Var) {
        u9 c10 = u9.c(i7);
        z zVar = new z(context, i6Var, i7, j3, d2Var);
        q9 b10 = c10.b(j10);
        if (b10 != null) {
            zVar.a(b10, null);
            return;
        }
        o9 o9Var = new o9(c10, zVar, j10, 0);
        TL_stars.TL_inputStarGiftAuction tL_inputStarGiftAuction = new TL_stars.TL_inputStarGiftAuction();
        tL_inputStarGiftAuction.gift_id = j10;
        TL_payments.TL_getStarGiftAuctionState tL_getStarGiftAuctionState = new TL_payments.TL_getStarGiftAuctionState();
        tL_getStarGiftAuctionState.auction = tL_inputStarGiftAuction;
        tL_getStarGiftAuctionState.version = 0;
        c10.getConnectionsManager().sendRequestTyped(tL_getStarGiftAuctionState, new d3.b(1), new org.telegram.messenger.z3(2, c10, o9Var));
    }

    public static void h1(Context context, TL_stars.StarGift starGift, org.telegram.ui.ActionBar.i6 i6Var) {
        if (context != null && starGift != null) {
            org.telegram.ui.ActionBar.x2 j3 = org.telegram.messenger.f3.j(1, context, null, false);
            org.telegram.ui.ActionBar.i2 i2Var = j3.f30234y0;
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            linearLayout.setClipChildren(false);
            linearLayout.setClipToPadding(false);
            ImageView imageView = new ImageView(context);
            imageView.setPadding(org.telegram.messenger.g0.L(17.0f), org.telegram.messenger.g0.L(17.0f), org.telegram.messenger.g0.L(17.0f), org.telegram.messenger.g0.L(17.0f));
            imageView.setImageResource(2131231117);
            ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
            Paint paint = shapeDrawable.getPaint();
            int i7 = org.telegram.ui.ActionBar.n6.Fi;
            paint.setColor(org.telegram.ui.ActionBar.n6.w0(i7, i6Var));
            org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i7);
            imageView.setBackground(shapeDrawable);
            org.telegram.ui.ActionBar.u6.j(imageView, shapeDrawable, M, null, i6Var);
            linearLayout.addView(imageView, ma.t(80, 80, 17, 0, 21, 0, 16));
            TextView textView = new TextView(context);
            textView.setTypeface(org.telegram.messenger.g0.o());
            textView.setGravity(17);
            textView.setText(gd.M0(2131749802, null));
            textView.setTextSize(1, 20.0f);
            int i10 = org.telegram.ui.ActionBar.n6.G6;
            org.telegram.ui.ActionBar.u6.U(textView, i10, i6Var);
            linearLayout.addView(textView, ma.t(-1, -2, 17, 20, 0, 20, 6));
            TextView textView2 = new TextView(context);
            textView2.setGravity(17);
            n10.l(14.0f, 2131749801, 1, textView2, null);
            org.telegram.ui.ActionBar.u6.U(textView2, i10, i6Var);
            linearLayout.addView(textView2, ma.t(-1, -2, 17, 20, 0, 20, 16));
            js0 js0Var = new js0(context, i6Var);
            int i11 = starGift.gifts_per_round;
            js0Var.f49074a.l(gd.G(i11, "GiftAuctionInfo1Header", Integer.valueOf(i11)), false);
            int i12 = starGift.gifts_per_round;
            js0Var.f49075b.setText(gd.G(i12, "GiftAuctionInfo1Text", Integer.valueOf(i12)));
            js0Var.d.setVisibility(8);
            ImageView imageView2 = js0Var.f49076c;
            imageView2.setImageResource(2131231904);
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
            org.telegram.ui.ActionBar.u6.s(imageView2, i10, i6Var, mode);
            linearLayout.addView(js0Var, ma.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
            js0 js0Var2 = new js0(context, i6Var);
            js0Var2.f49074a.l(gd.M0(2131749808, null), false);
            js0Var2.f49075b.setText(gd.G(starGift.gifts_per_round, "GiftAuctionInfo2Text", new Object[0]));
            js0Var2.d.setVisibility(8);
            ImageView imageView3 = js0Var2.f49076c;
            imageView3.setImageResource(2131231774);
            org.telegram.ui.ActionBar.u6.s(imageView3, i10, i6Var, mode);
            linearLayout.addView(js0Var2, ma.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
            js0 js0Var3 = new js0(context, i6Var);
            js0Var3.f49074a.l(gd.M0(2131749804, null), false);
            js0Var3.f49075b.setText(gd.M0(2131749803, null));
            js0Var3.d.setVisibility(8);
            ImageView imageView4 = js0Var3.f49076c;
            imageView4.setImageResource(2131231767);
            org.telegram.ui.ActionBar.u6.s(imageView4, i10, i6Var, mode);
            linearLayout.addView(js0Var3, ma.k(6.0f, 0.0f, 6.0f, 8.0f, -1, -2));
            hi.d dVar = new hi.d(context, i6Var, true);
            dVar.setOnClickListener(new d0(0, i2Var));
            dVar.i(di.f6.t2(gd.M0(2131743651, null)), false, true);
            linearLayout.addView(dVar, ma.k(16.0f, 10.0f, 16.0f, 8.0f, -1, 48));
            j3.O = linearLayout;
            j3.show();
        }
    }

    @Override
    public final bk0 M0(ck0 ck0Var) {
        z41 z41Var = new z41(this.f39534o1, getContext(), this.f30189a, 0, true, new b(this, 3), this.J0);
        this.f3868k2 = z41Var;
        z41Var.f42809r = false;
        return z41Var;
    }

    @Override
    public final CharSequence P0() {
        return "";
    }

    @Override
    public final void c(q9 q9Var) {
        this.f3866i2 = q9Var;
        i1(true);
    }

    @Override
    public final void dismiss() {
        u9.c(this.f30189a).n(this.U1, this);
        super.dismiss();
    }

    public final void g1() {
        TL_stars.TL_starGiftAuctionStateFinished tL_starGiftAuctionStateFinished;
        q9 q9Var = this.f3866i2;
        if (q9Var != null && (tL_starGiftAuctionStateFinished = q9Var.f26375g) != null && q9Var.d.title != null) {
            this.d2.a(this.f3859a2, gd.a0(null, null, 2131750273, Long.valueOf(tL_starGiftAuctionStateFinished.average_price), this.f3866i2.d.title));
        }
    }

    public final void i1(boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: bi.m0.i1(boolean):void");
    }
}
