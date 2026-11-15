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
import c8.na;
import java.util.ArrayList;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.messenger.p9;
import org.telegram.messenger.r9;
import org.telegram.messenger.u9;
import org.telegram.messenger.v9;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.ja;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.ux0;
import org.telegram.ui.Components.vx0;
import org.telegram.ui.Components.z70;
import org.telegram.ui.fs0;
public final class m0 extends ja implements u9 {
    public static final ec[] f3683l2 = new ec[1];
    public static final ux0[] f3684m2 = new ux0[1];
    public final TL_stars.StarGift T1;
    public final long U1;
    public final LinearLayout V1;
    public final FrameLayout W1;
    public final TextView X1;
    public final ec Y1;
    public final ec Z1;
    public final ec f3685a2;
    public final ec f3686b2;
    public final ux0 f3687c2;
    public final h0 d2;
    public final TableRow f3688e2;
    public final hi.d f3689f2;
    public final z70 f3690g2;
    public final z70 f3691h2;
    public r9 f3692i2;
    public final CharSequence f3693j2;
    public p41 f3694k2;

    public m0(Context context, org.telegram.ui.ActionBar.e6 e6Var, long j3, TL_stars.StarGift starGift, Runnable runnable) {
        super(context, null, false, false, 1, e6Var);
        boolean z10;
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState;
        ArrayList<TL_stars.StarGiftAuctionRound> arrayList;
        int i7;
        int i10;
        String a02;
        String G;
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState2;
        this.T1 = starGift;
        long j10 = starGift.f28280id;
        this.U1 = j10;
        this.F1 = org.telegram.messenger.g0.L(6.0f);
        this.f35943v1 = 0.2f;
        O();
        String str = starGift.title;
        String str2 = str == null ? "Gift" : str;
        LinearLayout linearLayout = new LinearLayout(context);
        this.V1 = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setClickable(true);
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, e6Var);
        kVar.H(-1, false);
        kVar.setOccupyStatusBar(false);
        d1(kVar, context, e6Var, starGift);
        FrameLayout frameLayout = new FrameLayout(context);
        this.W1 = frameLayout;
        frameLayout.addView(kVar, c8.ja.o(-1, -2));
        linearLayout.addView(frameLayout);
        i2 i2Var = new i2(this.f29679a, context, e6Var);
        i2Var.f3581d0 = true;
        i2Var.h(starGift, false, false, false, false, false);
        i2Var.setImageSize(org.telegram.messenger.g0.L(100.0f));
        i2Var.setImageLayer(7);
        i2Var.K.setVisibility(8);
        frameLayout.addView(i2Var, c8.ja.d(130, 130.0f, 17, 0.0f, 18.0f, 0.0f, 14.0f));
        TextView textView = new TextView(context);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(17);
        textView.setText(str2);
        textView.setTextSize(1, 20.0f);
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.q6.U(textView, i11, e6Var);
        linearLayout.addView(textView, c8.ja.t(-1, -2, 17, 20, 0, 20, 6));
        z70 z70Var = new z70(context, null);
        this.f3690g2 = z70Var;
        z70Var.setGravity(17);
        z70Var.setText(TextUtils.concat(org.telegram.messenger.g0.X2(hd.G(starGift.gifts_per_round, "Gift2AuctionInfo2", str2)), " ", org.telegram.messenger.g0.I2(org.telegram.messenger.g0.U2(hd.M0(2131750357, null), new f0(context, e6Var, starGift, 0)), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(1.0f))));
        z70Var.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.q6.U(z70Var, i11, e6Var);
        int i12 = org.telegram.ui.ActionBar.j6.J6;
        org.telegram.ui.ActionBar.q6.G(z70Var, i12, e6Var);
        linearLayout.addView(z70Var, c8.ja.t(-1, -2, 17, 20, 0, 20, 4));
        vx0 vx0Var = new vx0(context, e6Var);
        String M0 = hd.M0(2131750323, null);
        ec[] ecVarArr = f3683l2;
        vx0Var.c(M0, "", null, ecVarArr);
        this.Y1 = ecVarArr[0];
        vx0Var.c(hd.M0(2131750324, null), "", null, ecVarArr);
        this.Z1 = ecVarArr[0];
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        frameLayout2.setClipChildren(false);
        frameLayout2.setClipToPadding(false);
        frameLayout2.addView(vx0Var, c8.ja.e(-1, -2, 119));
        this.d2 = new h0(this, new hi.l3[1], frameLayout2, 0);
        TableRow c10 = vx0Var.c(hd.M0(2131749588, null), "", null, ecVarArr);
        this.f3688e2 = c10;
        c10.setOnClickListener(new View.OnClickListener(this) {
            public final m0 f3524b;

            {
                this.f3524b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        new ug.x0(40, this.f3524b.getContext(), (org.telegram.ui.ActionBar.e6) null).show();
                        return;
                    default:
                        this.f3524b.f1();
                        return;
                }
            }
        });
        this.f3685a2 = ecVarArr[0];
        ux0[] ux0VarArr = f3684m2;
        vx0Var.c("", "", ux0VarArr, ecVarArr);
        this.f3686b2 = ecVarArr[0];
        this.f3687c2 = ux0VarArr[0];
        linearLayout.addView(frameLayout2, c8.ja.k(16.0f, 16.0f, 14.0f, 18.0f, -1, -2));
        z70 z70Var2 = new z70(context, e6Var);
        this.f3691h2 = z70Var2;
        z70Var2.setGravity(17);
        z70Var2.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.q6.U(z70Var2, i12, e6Var);
        org.telegram.ui.ActionBar.q6.G(z70Var2, i12, e6Var);
        z70Var2.setOnClickListener(new ah.g(this, new boolean[1], e6Var, 4));
        na.b(z70Var2, 0.02f, 1.5f);
        if (starGift.sticker != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("*");
            z10 = false;
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.p5(starGift.sticker, z70Var2.getPaint().getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
            this.f3693j2 = spannableStringBuilder;
        } else {
            z10 = false;
            this.f3693j2 = "";
        }
        hi.d dVar = new hi.d(context, e6Var, true);
        this.f3689f2 = dVar;
        dVar.f();
        final int i13 = z10;
        dVar.setOnClickListener(new a0(this, j3, context, e6Var, runnable, 0));
        FrameLayout.LayoutParams d = c8.ja.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f);
        int i14 = d.leftMargin;
        int i15 = this.f29717u0;
        d.leftMargin = i14 + i15;
        d.rightMargin += i15;
        this.f29682b.addView(dVar, d);
        uj0 uj0Var = this.f35936o1;
        int i16 = this.f29717u0;
        uj0Var.setPadding(i16, i13, i16, org.telegram.messenger.g0.L(64.0f));
        this.f3694k2.O(i13);
        r9 l10 = v9.c(this.f29679a).l(j10, this);
        this.f3692i2 = l10;
        if (l10 != null && (tL_starGiftAuctionState2 = l10.f26262f) != null) {
            if (tL_starGiftAuctionState2.start_date > ConnectionsManager.getInstance(this.f29679a).getCurrentTime()) {
                vx0Var.c(hd.M0(2131750331, null), hd.E(this.f3692i2.f26262f.total_rounds, ','), null, null);
            } else {
                String M02 = hd.M0(2131750332, null);
                String E = hd.E(this.f3692i2.f26262f.current_round, ',');
                String E2 = hd.E(this.f3692i2.f26262f.total_rounds, ',');
                Object[] objArr = new Object[2];
                objArr[i13] = E;
                objArr[1] = E2;
                vx0Var.c(M02, hd.a0(null, null, 2131747828, objArr), null, null);
            }
        }
        r9 r9Var = this.f3692i2;
        if (r9Var != null && (tL_starGiftAuctionState = r9Var.f26262f) != null && (arrayList = tL_starGiftAuctionState.rounds) != null) {
            int size = arrayList.size();
            for (int i17 = i13; i17 < size; i17++) {
                TL_stars.StarGiftAuctionRound starGiftAuctionRound = this.f3692i2.f26262f.rounds.get(i17);
                if (i17 < size - 1) {
                    i7 = 1;
                    i10 = this.f3692i2.f26262f.rounds.get(i17 + 1).num - 1;
                } else {
                    i7 = 1;
                    i10 = this.f3692i2.f26262f.total_rounds;
                }
                int i18 = starGiftAuctionRound.num;
                if (i18 == i10) {
                    Object[] objArr2 = new Object[i7];
                    objArr2[i13] = Integer.valueOf(i18);
                    a02 = hd.a0(null, null, 2131750330, objArr2);
                } else {
                    Integer valueOf = Integer.valueOf(i18);
                    Integer valueOf2 = Integer.valueOf(i10);
                    Object[] objArr3 = new Object[2];
                    objArr3[i13] = valueOf;
                    objArr3[i7] = valueOf2;
                    a02 = hd.a0(null, null, 2131750328, objArr3);
                }
                if (starGiftAuctionRound.num == i10) {
                    String c02 = hd.c0(starGiftAuctionRound.duration);
                    String c03 = hd.c0(starGiftAuctionRound.current_window);
                    Integer valueOf3 = Integer.valueOf(starGiftAuctionRound.extend_top);
                    Object[] objArr4 = new Object[3];
                    objArr4[i13] = c02;
                    objArr4[1] = c03;
                    objArr4[2] = valueOf3;
                    G = hd.a0(null, null, 2131750329, objArr4);
                } else {
                    G = hd.G(starGiftAuctionRound.duration / 60, "Gift2AuctionTableCurrentRoundsTwoDuration", new Object[i13]);
                }
                vx0Var.c(a02, G, null, null);
            }
        }
        r9 r9Var2 = this.f3692i2;
        if (r9Var2 != null && r9Var2.h != null) {
            k0 k0Var = new k0(this, context, e6Var, new b0(this, i13), new o(1), new o(1), new o(1), new o(1), new o(1), new o(1));
            k0Var.d(new di.b5(1, 1));
            k0Var.setPreviewingAttributes(this.f3692i2.h);
            k0Var.removeView(k0Var.Q);
            this.W1.addView(k0Var, i13, c8.ja.e(-1, 288, 48));
            TextView textView2 = new TextView(context);
            this.X1 = textView2;
            textView2.setGravity(17);
            textView2.setTypeface(org.telegram.messenger.g0.o());
            textView2.setTextColor(-1);
            textView2.setTextSize(1, 12.0f);
            r9 r9Var3 = this.f3692i2;
            if (r9Var3.f26263g != null) {
                textView2.setText(hd.M0(2131750363, null));
            } else if (r9Var3.g(ConnectionsManager.getInstance(m10.f24934t0).getCurrentTime())) {
                textView2.setText(hd.M0(2131750128, null));
            } else {
                textView2.setText(hd.M0(2131750129, null));
            }
            textView2.setBackground(org.telegram.ui.ActionBar.j6.b0(i13, 285212671, 13, 13));
            textView2.setPadding(org.telegram.messenger.g0.L(12.0f), i13, org.telegram.messenger.g0.L(12.0f), i13);
            TextView k10 = org.telegram.ui.Cells.y0.k(this.W1, textView2, c8.ja.d(-2, 26.0f, 81, 16.0f, 0.0f, 16.0f, 77.0f), context);
            k10.setTypeface(org.telegram.messenger.g0.o());
            k10.setTextSize(1, 21.0f);
            k10.setText(str2);
            k10.setGravity(17);
            k10.setTextColor(-1);
            TextView k11 = org.telegram.ui.Cells.y0.k(this.W1, k10, c8.ja.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 40.0f), context);
            k11.setTextSize(1, 13.0f);
            k11.setText(org.telegram.messenger.g0.I2(hd.M0(2131750350, null), i13, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(1.0f)));
            k11.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
            k11.setGravity(17);
            k11.setTextColor(-1342177281);
            k11.setOnClickListener(new View.OnClickListener(this) {
                public final m0 f3524b;

                {
                    this.f3524b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (i13) {
                        case 0:
                            new ug.x0(40, this.f3524b.getContext(), (org.telegram.ui.ActionBar.e6) null).show();
                            return;
                        default:
                            this.f3524b.f1();
                            return;
                    }
                }
            });
            na.b(k11, 0.02f, 1.5f);
            this.W1.addView(k11, c8.ja.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 12.0f));
            i2Var.setVisibility(8);
            textView.setVisibility(8);
            this.f3690g2.setVisibility(8);
            z70 z70Var3 = new z70(context, e6Var);
            z70Var3.setGravity(17);
            z70Var3.setTextSize(1, 16.0f);
            int i19 = org.telegram.ui.ActionBar.j6.J6;
            org.telegram.ui.ActionBar.q6.U(z70Var3, i19, e6Var);
            org.telegram.ui.ActionBar.q6.G(z70Var3, i19, e6Var);
            z70Var3.setOnClickListener(new ah.g(this, context, e6Var, 3));
            na.b(z70Var3, 0.02f, 1.5f);
            this.V1.addView(z70Var3, c8.ja.k(16.0f, 0.0f, 14.0f, 18.0f, -1, -2));
            com.google.android.gms.common.api.internal.p pVar = new com.google.android.gms.common.api.internal.p(cg.d.c(TL_stars.starGiftAttributeModel.class, this.f3692i2.h));
            long j11 = starGift.upgrade_variants;
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            for (int i20 = i13; i20 < 3; i20++) {
                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) pVar.c();
                if (stargiftattributemodel != null) {
                    spannableStringBuilder2.append('*');
                    spannableStringBuilder2.setSpan(new org.telegram.ui.Components.p5(stargiftattributemodel.document, z70Var3.getPaint().getFontMetricsInt()), i20, i20 + 1, 33);
                }
            }
            String E3 = hd.E(j11, ',');
            Object[] objArr5 = new Object[2];
            objArr5[i13] = spannableStringBuilder2;
            objArr5[1] = E3;
            z70Var3.setText(org.telegram.messenger.g0.I2(hd.V(null, null, 2131750318, objArr5), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(1.0f)));
        }
        this.V1.addView(this.f3691h2, c8.ja.k(16.0f, 0.0f, 14.0f, 18.0f, -1, -2));
        h1(i13);
    }

    public static void d1(org.telegram.ui.ActionBar.k kVar, Context context, org.telegram.ui.ActionBar.e6 e6Var, TL_stars.StarGift starGift) {
        kVar.setActionBarMenuOnItemClick(new l0(context, starGift, e6Var));
        org.telegram.ui.ActionBar.q0 a10 = kVar.s().a(0, 2131231244);
        a10.setContentDescription(hd.M0(2131754839, "AccDescrMoreOptions"));
        a10.e(4, 2131232186, hd.M0(2131748331, null));
        a10.e(3, 2131231805, hd.M0(2131751762, null));
        a10.e(2, 2131232364, hd.M0(2131745458, null));
    }

    public static void e1(Context context, org.telegram.ui.ActionBar.e6 e6Var, int i7, long j3, long j10, k1 k1Var) {
        v9 c10 = v9.c(i7);
        z zVar = new z(context, e6Var, i7, j3, k1Var);
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
        c10.getConnectionsManager().sendRequestTyped(tL_getStarGiftAuctionState, new d3.b(1), new org.telegram.messenger.x3(2, c10, p9Var));
    }

    public static void g1(Context context, TL_stars.StarGift starGift, org.telegram.ui.ActionBar.e6 e6Var) {
        if (context != null && starGift != null) {
            org.telegram.ui.ActionBar.u2 k10 = org.telegram.messenger.k5.k(1, context, null, false);
            org.telegram.ui.ActionBar.f2 f2Var = k10.f29724y0;
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            linearLayout.setClipChildren(false);
            linearLayout.setClipToPadding(false);
            ImageView imageView = new ImageView(context);
            imageView.setPadding(org.telegram.messenger.g0.L(17.0f), org.telegram.messenger.g0.L(17.0f), org.telegram.messenger.g0.L(17.0f), org.telegram.messenger.g0.L(17.0f));
            imageView.setImageResource(2131231117);
            ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
            Paint paint = shapeDrawable.getPaint();
            int i7 = org.telegram.ui.ActionBar.j6.Fi;
            paint.setColor(org.telegram.ui.ActionBar.j6.w0(i7, e6Var));
            org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i7);
            imageView.setBackground(shapeDrawable);
            org.telegram.ui.ActionBar.q6.j(imageView, shapeDrawable, M, null, e6Var);
            linearLayout.addView(imageView, c8.ja.t(80, 80, 17, 0, 21, 0, 16));
            TextView textView = new TextView(context);
            textView.setTypeface(org.telegram.messenger.g0.o());
            textView.setGravity(17);
            textView.setText(hd.M0(2131749818, null));
            textView.setTextSize(1, 20.0f);
            int i10 = org.telegram.ui.ActionBar.j6.G6;
            org.telegram.ui.ActionBar.q6.U(textView, i10, e6Var);
            linearLayout.addView(textView, c8.ja.t(-1, -2, 17, 20, 0, 20, 6));
            TextView textView2 = new TextView(context);
            textView2.setGravity(17);
            textView2.setText(hd.M0(2131749817, null));
            textView2.setTextSize(1, 14.0f);
            org.telegram.ui.ActionBar.q6.U(textView2, i10, e6Var);
            linearLayout.addView(textView2, c8.ja.t(-1, -2, 17, 20, 0, 20, 16));
            fs0 fs0Var = new fs0(context, e6Var);
            int i11 = starGift.gifts_per_round;
            fs0Var.f47186a.l(hd.G(i11, "GiftAuctionInfo1Header", Integer.valueOf(i11)), false);
            int i12 = starGift.gifts_per_round;
            fs0Var.f47187b.setText(hd.G(i12, "GiftAuctionInfo1Text", Integer.valueOf(i12)));
            fs0Var.d.setVisibility(8);
            ImageView imageView2 = fs0Var.f47188c;
            imageView2.setImageResource(2131231903);
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
            org.telegram.ui.ActionBar.q6.s(imageView2, i10, e6Var, mode);
            linearLayout.addView(fs0Var, c8.ja.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
            fs0 fs0Var2 = new fs0(context, e6Var);
            fs0Var2.f47186a.l(hd.M0(2131749824, null), false);
            fs0Var2.f47187b.setText(hd.G(starGift.gifts_per_round, "GiftAuctionInfo2Text", new Object[0]));
            fs0Var2.d.setVisibility(8);
            ImageView imageView3 = fs0Var2.f47188c;
            imageView3.setImageResource(2131231773);
            org.telegram.ui.ActionBar.q6.s(imageView3, i10, e6Var, mode);
            linearLayout.addView(fs0Var2, c8.ja.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
            fs0 fs0Var3 = new fs0(context, e6Var);
            fs0Var3.f47186a.l(hd.M0(2131749820, null), false);
            fs0Var3.f47187b.setText(hd.M0(2131749819, null));
            fs0Var3.d.setVisibility(8);
            ImageView imageView4 = fs0Var3.f47188c;
            imageView4.setImageResource(2131231766);
            org.telegram.ui.ActionBar.q6.s(imageView4, i10, e6Var, mode);
            linearLayout.addView(fs0Var3, c8.ja.k(6.0f, 0.0f, 6.0f, 8.0f, -1, -2));
            hi.d dVar = new hi.d(context, e6Var, true);
            dVar.setOnClickListener(new d0(0, f2Var));
            dVar.i(di.c6.h2(hd.M0(2131743888, null)), false, true);
            linearLayout.addView(dVar, c8.ja.k(16.0f, 10.0f, 16.0f, 8.0f, -1, 48));
            k10.O = linearLayout;
            k10.show();
        }
    }

    @Override
    public final tj0 L0(uj0 uj0Var) {
        p41 p41Var = new p41(this.f35936o1, getContext(), this.f29679a, 0, true, new b(this, 3), this.J0);
        this.f3694k2 = p41Var;
        p41Var.f38201r = false;
        return p41Var;
    }

    @Override
    public final CharSequence O0() {
        return "";
    }

    @Override
    public final void c(r9 r9Var) {
        this.f3692i2 = r9Var;
        h1(true);
    }

    @Override
    public final void dismiss() {
        v9.c(this.f29679a).n(this.U1, this);
        super.dismiss();
    }

    public final void f1() {
        TL_stars.TL_starGiftAuctionStateFinished tL_starGiftAuctionStateFinished;
        r9 r9Var = this.f3692i2;
        if (r9Var != null && (tL_starGiftAuctionStateFinished = r9Var.f26263g) != null && r9Var.d.title != null) {
            this.d2.a(this.f3685a2, hd.a0(null, null, 2131750289, Long.valueOf(tL_starGiftAuctionStateFinished.average_price), this.f3692i2.d.title));
        }
    }

    public final void h1(boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: bi.m0.h1(boolean):void");
    }
}
