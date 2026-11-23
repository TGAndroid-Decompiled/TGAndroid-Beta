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
import c8.sa;
import java.util.ArrayList;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.m10;
import org.telegram.messenger.o9;
import org.telegram.messenger.q9;
import org.telegram.messenger.t9;
import org.telegram.messenger.u9;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.cy0;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.dy0;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.j80;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.ra;
import org.telegram.ui.is0;
public final class m0 extends ra implements t9 {
    public static final mc[] f3817l2 = new mc[1];
    public static final cy0[] f3818m2 = new cy0[1];
    public final TL_stars.StarGift T1;
    public final long U1;
    public final LinearLayout V1;
    public final FrameLayout W1;
    public final TextView X1;
    public final mc Y1;
    public final mc Z1;
    public final mc f3819a2;
    public final mc f3820b2;
    public final cy0 f3821c2;
    public final h0 d2;
    public final TableRow f3822e2;
    public final hi.e f3823f2;
    public final j80 f3824g2;
    public final j80 f3825h2;
    public q9 f3826i2;
    public final CharSequence f3827j2;
    public b51 f3828k2;

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
        long j10 = starGift.f28721id;
        this.U1 = j10;
        this.F1 = org.telegram.messenger.g0.L(6.0f);
        this.f39253v1 = 0.2f;
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
        kVar.F(-1, false);
        kVar.setOccupyStatusBar(false);
        e1(kVar, context, i6Var, starGift);
        FrameLayout frameLayout = new FrameLayout(context);
        this.W1 = frameLayout;
        frameLayout.addView(kVar, na.o(-1, -2));
        linearLayout.addView(frameLayout);
        i3 i3Var = new i3(this.f30223a, context, i6Var);
        i3Var.f3665d0 = true;
        i3Var.h(starGift, false, false, false, false, false);
        i3Var.setImageSize(org.telegram.messenger.g0.L(100.0f));
        i3Var.setImageLayer(7);
        i3Var.K.setVisibility(8);
        frameLayout.addView(i3Var, na.d(130, 130.0f, 17, 0.0f, 18.0f, 0.0f, 14.0f));
        TextView textView = new TextView(context);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(17);
        textView.setText(str2);
        textView.setTextSize(1, 20.0f);
        int i11 = org.telegram.ui.ActionBar.n6.G6;
        org.telegram.ui.ActionBar.u6.U(textView, i11, i6Var);
        linearLayout.addView(textView, na.t(-1, -2, 17, 20, 0, 20, 6));
        j80 j80Var = new j80(context, null);
        this.f3824g2 = j80Var;
        j80Var.setGravity(17);
        j80Var.setText(TextUtils.concat(org.telegram.messenger.g0.W2(gd.G(starGift.gifts_per_round, "Gift2AuctionInfo2", str2)), " ", org.telegram.messenger.g0.I2(org.telegram.messenger.g0.T2(gd.N0(2131750340, null), new f0(0, context, starGift, i6Var)), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(1.0f))));
        j80Var.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.u6.U(j80Var, i11, i6Var);
        int i12 = org.telegram.ui.ActionBar.n6.J6;
        org.telegram.ui.ActionBar.u6.G(j80Var, i12, i6Var);
        linearLayout.addView(j80Var, na.t(-1, -2, 17, 20, 0, 20, 4));
        dy0 dy0Var = new dy0(context, i6Var);
        String N0 = gd.N0(2131750306, null);
        mc[] mcVarArr = f3817l2;
        dy0Var.e(N0, "", null, mcVarArr);
        this.Y1 = mcVarArr[0];
        dy0Var.e(gd.N0(2131750307, null), "", null, mcVarArr);
        this.Z1 = mcVarArr[0];
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        frameLayout2.setClipChildren(false);
        frameLayout2.setClipToPadding(false);
        frameLayout2.addView(dy0Var, na.e(-1, -2, 119));
        this.d2 = new h0(this, new hi.u3[1], frameLayout2, 0);
        TableRow e10 = dy0Var.e(gd.N0(2131749412, null), "", null, mcVarArr);
        this.f3822e2 = e10;
        e10.setOnClickListener(new View.OnClickListener(this) {
            public final m0 f3599b;

            {
                this.f3599b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        new ug.y0(40, this.f3599b.getContext(), (org.telegram.ui.ActionBar.i6) null).show();
                        return;
                    default:
                        this.f3599b.g1();
                        return;
                }
            }
        });
        this.f3819a2 = mcVarArr[0];
        cy0[] cy0VarArr = f3818m2;
        dy0Var.e("", "", cy0VarArr, mcVarArr);
        this.f3820b2 = mcVarArr[0];
        this.f3821c2 = cy0VarArr[0];
        linearLayout.addView(frameLayout2, na.k(16.0f, 16.0f, 14.0f, 18.0f, -1, -2));
        j80 j80Var2 = new j80(context, i6Var);
        this.f3825h2 = j80Var2;
        j80Var2.setGravity(17);
        j80Var2.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.u6.U(j80Var2, i12, i6Var);
        org.telegram.ui.ActionBar.u6.G(j80Var2, i12, i6Var);
        j80Var2.setOnClickListener(new ah.h(this, new boolean[1], i6Var, 4));
        sa.b(j80Var2, 0.02f, 1.5f);
        if (starGift.sticker != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("*");
            z10 = false;
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.x5(starGift.sticker, j80Var2.getPaint().getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
            this.f3827j2 = spannableStringBuilder;
        } else {
            z10 = false;
            this.f3827j2 = "";
        }
        hi.e eVar = new hi.e(context, i6Var, true);
        this.f3823f2 = eVar;
        eVar.f();
        final int i13 = z10;
        eVar.setOnClickListener(new a0(this, j3, context, i6Var, runnable, 0));
        FrameLayout.LayoutParams d = na.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f);
        int i14 = d.leftMargin;
        int i15 = this.f30261u0;
        d.leftMargin = i14 + i15;
        d.rightMargin += i15;
        this.f30226b.addView(eVar, d);
        ek0 ek0Var = this.f39246o1;
        int i16 = this.f30261u0;
        ek0Var.setPadding(i16, i13, i16, org.telegram.messenger.g0.L(64.0f));
        this.f3828k2.O(i13);
        q9 l10 = u9.c(this.f30223a).l(j10, this);
        this.f3826i2 = l10;
        if (l10 != null && (tL_starGiftAuctionState2 = l10.f26484f) != null) {
            if (tL_starGiftAuctionState2.start_date > ConnectionsManager.getInstance(this.f30223a).getCurrentTime()) {
                dy0Var.e(gd.N0(2131750314, null), gd.E(this.f3826i2.f26484f.total_rounds, ','), null, null);
            } else {
                String N02 = gd.N0(2131750315, null);
                String E = gd.E(this.f3826i2.f26484f.current_round, ',');
                String E2 = gd.E(this.f3826i2.f26484f.total_rounds, ',');
                Object[] objArr = new Object[2];
                objArr[i13] = E;
                objArr[1] = E2;
                dy0Var.e(N02, gd.a0(null, null, 2131747634, objArr), null, null);
            }
        }
        q9 q9Var = this.f3826i2;
        if (q9Var != null && (tL_starGiftAuctionState = q9Var.f26484f) != null && (arrayList = tL_starGiftAuctionState.rounds) != null) {
            int size = arrayList.size();
            for (int i17 = i13; i17 < size; i17++) {
                TL_stars.StarGiftAuctionRound starGiftAuctionRound = this.f3826i2.f26484f.rounds.get(i17);
                if (i17 < size - 1) {
                    i7 = 1;
                    i10 = this.f3826i2.f26484f.rounds.get(i17 + 1).num - 1;
                } else {
                    i7 = 1;
                    i10 = this.f3826i2.f26484f.total_rounds;
                }
                int i18 = starGiftAuctionRound.num;
                if (i18 == i10) {
                    Object[] objArr2 = new Object[i7];
                    objArr2[i13] = Integer.valueOf(i18);
                    a02 = gd.a0(null, null, 2131750313, objArr2);
                } else {
                    Integer valueOf = Integer.valueOf(i18);
                    Integer valueOf2 = Integer.valueOf(i10);
                    Object[] objArr3 = new Object[2];
                    objArr3[i13] = valueOf;
                    objArr3[i7] = valueOf2;
                    a02 = gd.a0(null, null, 2131750311, objArr3);
                }
                if (starGiftAuctionRound.num == i10) {
                    String c02 = gd.c0(starGiftAuctionRound.duration);
                    String c03 = gd.c0(starGiftAuctionRound.current_window);
                    Integer valueOf3 = Integer.valueOf(starGiftAuctionRound.extend_top);
                    Object[] objArr4 = new Object[3];
                    objArr4[i13] = c02;
                    objArr4[1] = c03;
                    objArr4[2] = valueOf3;
                    G = gd.a0(null, null, 2131750312, objArr4);
                } else {
                    G = gd.G(starGiftAuctionRound.duration / 60, "Gift2AuctionTableCurrentRoundsTwoDuration", new Object[i13]);
                }
                dy0Var.e(a02, G, null, null);
            }
        }
        q9 q9Var2 = this.f3826i2;
        if (q9Var2 != null && q9Var2.h != null) {
            k0 k0Var = new k0(this, context, i6Var, new b0(this, i13), new o(1), new o(1), new o(1), new o(1), new o(1), new o(1));
            k0Var.d(new di.e5(1, 1));
            k0Var.setPreviewingAttributes(this.f3826i2.h);
            k0Var.removeView(k0Var.Q);
            this.W1.addView(k0Var, i13, na.e(-1, 288, 48));
            TextView textView2 = new TextView(context);
            this.X1 = textView2;
            textView2.setGravity(17);
            textView2.setTypeface(org.telegram.messenger.g0.o());
            textView2.setTextColor(-1);
            textView2.setTextSize(1, 12.0f);
            q9 q9Var3 = this.f3826i2;
            if (q9Var3.f26485g != null) {
                textView2.setText(gd.N0(2131750346, null));
            } else if (q9Var3.g(ConnectionsManager.getInstance(i10.f24637t0).getCurrentTime())) {
                textView2.setText(gd.N0(2131750111, null));
            } else {
                textView2.setText(gd.N0(2131750112, null));
            }
            textView2.setBackground(org.telegram.ui.ActionBar.n6.b0(i13, 285212671, 13, 13));
            textView2.setPadding(org.telegram.messenger.g0.L(12.0f), i13, org.telegram.messenger.g0.L(12.0f), i13);
            TextView m10 = org.telegram.ui.Cells.c0.m(this.W1, textView2, na.d(-2, 26.0f, 81, 16.0f, 0.0f, 16.0f, 77.0f), context);
            m10.setTypeface(org.telegram.messenger.g0.o());
            m10.setTextSize(1, 21.0f);
            m10.setText(str2);
            m10.setGravity(17);
            m10.setTextColor(-1);
            TextView m11 = org.telegram.ui.Cells.c0.m(this.W1, m10, na.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 40.0f), context);
            m11.setTextSize(1, 13.0f);
            m11.setText(org.telegram.messenger.g0.I2(gd.N0(2131750333, null), i13, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(1.0f)));
            m11.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
            m11.setGravity(17);
            m11.setTextColor(-1342177281);
            m11.setOnClickListener(new View.OnClickListener(this) {
                public final m0 f3599b;

                {
                    this.f3599b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (i13) {
                        case 0:
                            new ug.y0(40, this.f3599b.getContext(), (org.telegram.ui.ActionBar.i6) null).show();
                            return;
                        default:
                            this.f3599b.g1();
                            return;
                    }
                }
            });
            sa.b(m11, 0.02f, 1.5f);
            this.W1.addView(m11, na.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 12.0f));
            i3Var.setVisibility(8);
            textView.setVisibility(8);
            this.f3824g2.setVisibility(8);
            j80 j80Var3 = new j80(context, i6Var);
            j80Var3.setGravity(17);
            j80Var3.setTextSize(1, 16.0f);
            int i19 = org.telegram.ui.ActionBar.n6.J6;
            org.telegram.ui.ActionBar.u6.U(j80Var3, i19, i6Var);
            org.telegram.ui.ActionBar.u6.G(j80Var3, i19, i6Var);
            j80Var3.setOnClickListener(new ah.h(this, context, i6Var, 3));
            sa.b(j80Var3, 0.02f, 1.5f);
            this.V1.addView(j80Var3, na.k(16.0f, 0.0f, 14.0f, 18.0f, -1, -2));
            com.google.android.gms.common.api.internal.p pVar = new com.google.android.gms.common.api.internal.p(cg.d.c(TL_stars.starGiftAttributeModel.class, this.f3826i2.h));
            long j11 = starGift.upgrade_variants;
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            for (int i20 = i13; i20 < 3; i20++) {
                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) pVar.c();
                if (stargiftattributemodel != null) {
                    spannableStringBuilder2.append('*');
                    spannableStringBuilder2.setSpan(new org.telegram.ui.Components.x5(stargiftattributemodel.document, j80Var3.getPaint().getFontMetricsInt()), i20, i20 + 1, 33);
                }
            }
            String E3 = gd.E(j11, ',');
            Object[] objArr5 = new Object[2];
            objArr5[i13] = spannableStringBuilder2;
            objArr5[1] = E3;
            j80Var3.setText(org.telegram.messenger.g0.I2(gd.V(null, null, 2131750301, objArr5), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(1.0f)));
        }
        this.V1.addView(this.f3825h2, na.k(16.0f, 0.0f, 14.0f, 18.0f, -1, -2));
        i1(i13);
    }

    public static void e1(org.telegram.ui.ActionBar.k kVar, Context context, org.telegram.ui.ActionBar.i6 i6Var, TL_stars.StarGift starGift) {
        kVar.setActionBarMenuOnItemClick(new l0(context, starGift, i6Var));
        org.telegram.ui.ActionBar.q0 a10 = kVar.s().a(0, 2131231247);
        a10.setContentDescription(gd.N0(2131754838, "AccDescrMoreOptions"));
        a10.e(4, 2131232190, gd.N0(2131748138, null));
        a10.e(3, 2131231809, gd.N0(2131751750, null));
        a10.e(2, 2131232368, gd.N0(2131745262, null));
    }

    public static void f1(Context context, org.telegram.ui.ActionBar.i6 i6Var, int i7, long j3, long j10, j2 j2Var) {
        u9 c10 = u9.c(i7);
        z zVar = new z(context, i6Var, i7, j3, j2Var);
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
            org.telegram.ui.ActionBar.w2 j3 = org.telegram.messenger.f3.j(1, context, null, false);
            org.telegram.ui.ActionBar.h2 h2Var = j3.f30268y0;
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            linearLayout.setClipChildren(false);
            linearLayout.setClipToPadding(false);
            ImageView imageView = new ImageView(context);
            imageView.setPadding(org.telegram.messenger.g0.L(17.0f), org.telegram.messenger.g0.L(17.0f), org.telegram.messenger.g0.L(17.0f), org.telegram.messenger.g0.L(17.0f));
            imageView.setImageResource(2131231119);
            ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
            Paint paint = shapeDrawable.getPaint();
            int i7 = org.telegram.ui.ActionBar.n6.Fi;
            paint.setColor(org.telegram.ui.ActionBar.n6.w0(i7, i6Var));
            org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i7);
            imageView.setBackground(shapeDrawable);
            org.telegram.ui.ActionBar.u6.j(imageView, shapeDrawable, M, null, i6Var);
            linearLayout.addView(imageView, na.t(80, 80, 17, 0, 21, 0, 16));
            TextView textView = new TextView(context);
            textView.setTypeface(org.telegram.messenger.g0.o());
            textView.setGravity(17);
            textView.setText(gd.N0(2131749801, null));
            textView.setTextSize(1, 20.0f);
            int i10 = org.telegram.ui.ActionBar.n6.G6;
            org.telegram.ui.ActionBar.u6.U(textView, i10, i6Var);
            linearLayout.addView(textView, na.t(-1, -2, 17, 20, 0, 20, 6));
            TextView textView2 = new TextView(context);
            textView2.setGravity(17);
            m10.l(14.0f, 2131749800, 1, textView2, null);
            org.telegram.ui.ActionBar.u6.U(textView2, i10, i6Var);
            linearLayout.addView(textView2, na.t(-1, -2, 17, 20, 0, 20, 16));
            is0 is0Var = new is0(context, i6Var);
            int i11 = starGift.gifts_per_round;
            is0Var.f48912a.l(gd.G(i11, "GiftAuctionInfo1Header", Integer.valueOf(i11)), false);
            int i12 = starGift.gifts_per_round;
            is0Var.f48913b.setText(gd.G(i12, "GiftAuctionInfo1Text", Integer.valueOf(i12)));
            is0Var.d.setVisibility(8);
            ImageView imageView2 = is0Var.f48914c;
            imageView2.setImageResource(2131231907);
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
            org.telegram.ui.ActionBar.u6.s(imageView2, i10, i6Var, mode);
            linearLayout.addView(is0Var, na.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
            is0 is0Var2 = new is0(context, i6Var);
            is0Var2.f48912a.l(gd.N0(2131749807, null), false);
            is0Var2.f48913b.setText(gd.G(starGift.gifts_per_round, "GiftAuctionInfo2Text", new Object[0]));
            is0Var2.d.setVisibility(8);
            ImageView imageView3 = is0Var2.f48914c;
            imageView3.setImageResource(2131231777);
            org.telegram.ui.ActionBar.u6.s(imageView3, i10, i6Var, mode);
            linearLayout.addView(is0Var2, na.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
            is0 is0Var3 = new is0(context, i6Var);
            is0Var3.f48912a.l(gd.N0(2131749803, null), false);
            is0Var3.f48913b.setText(gd.N0(2131749802, null));
            is0Var3.d.setVisibility(8);
            ImageView imageView4 = is0Var3.f48914c;
            imageView4.setImageResource(2131231770);
            org.telegram.ui.ActionBar.u6.s(imageView4, i10, i6Var, mode);
            linearLayout.addView(is0Var3, na.k(6.0f, 0.0f, 6.0f, 8.0f, -1, -2));
            hi.e eVar = new hi.e(context, i6Var, true);
            eVar.setOnClickListener(new d0(0, h2Var));
            eVar.i(di.f6.t2(gd.N0(2131743641, null)), false, true);
            linearLayout.addView(eVar, na.k(16.0f, 10.0f, 16.0f, 8.0f, -1, 48));
            j3.O = linearLayout;
            j3.show();
        }
    }

    @Override
    public final dk0 M0(ek0 ek0Var) {
        b51 b51Var = new b51(this.f39246o1, getContext(), this.f30223a, 0, true, new b(this, 3), this.J0);
        this.f3828k2 = b51Var;
        b51Var.f33631r = false;
        return b51Var;
    }

    @Override
    public final CharSequence P0() {
        return "";
    }

    @Override
    public final void c(q9 q9Var) {
        this.f3826i2 = q9Var;
        i1(true);
    }

    @Override
    public final void dismiss() {
        u9.c(this.f30223a).n(this.U1, this);
        super.dismiss();
    }

    public final void g1() {
        TL_stars.TL_starGiftAuctionStateFinished tL_starGiftAuctionStateFinished;
        q9 q9Var = this.f3826i2;
        if (q9Var != null && (tL_starGiftAuctionStateFinished = q9Var.f26485g) != null && q9Var.d.title != null) {
            this.d2.a(this.f3819a2, gd.a0(null, null, 2131750272, Long.valueOf(tL_starGiftAuctionStateFinished.average_price), this.f3826i2.d.title));
        }
    }

    public final void i1(boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: bi.m0.i1(boolean):void");
    }
}
