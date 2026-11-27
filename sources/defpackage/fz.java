package defpackage;

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
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.a;
public final class fz extends ny0 implements nv4 {
    public static final y41[] k2 = new y41[1];
    public static final gjb[] l2 = new gjb[1];
    public final TL_stars.StarGift S1;
    public final long T1;
    public final LinearLayout U1;
    public final FrameLayout V1;
    public final TextView W1;
    public final y41 X1;
    public final y41 Y1;
    public final y41 Z1;
    public final y41 a2;
    public final gjb b2;
    public final p c2;
    public final TableRow d2;
    public final c51 e2;
    public final p66 f2;
    public final p66 g2;
    public kv4 h2;
    public final CharSequence i2;
    public l9c j2;

    public fz(Context context, vnb vnbVar, long j, TL_stars.StarGift starGift, ex4 ex4Var) {
        super(context, null, false, false, 1, vnbVar);
        boolean z;
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState;
        ArrayList<TL_stars.StarGiftAuctionRound> arrayList;
        int i;
        int i2;
        String a0;
        String G;
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState2;
        this.S1 = starGift;
        long j2 = starGift.id;
        this.T1 = j2;
        this.E1 = hl.L(6.0f);
        this.u1 = 0.2f;
        J();
        String str = starGift.title;
        String str2 = str == null ? "Gift" : str;
        LinearLayout linearLayout = new LinearLayout(context);
        this.U1 = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setClickable(true);
        a aVar = new a(context, vnbVar);
        aVar.H(-1, false);
        aVar.setOccupyStatusBar(false);
        Z0(aVar, context, vnbVar, starGift);
        FrameLayout frameLayout = new FrameLayout(context);
        this.V1 = frameLayout;
        frameLayout.addView(aVar, tre.o(-1, -2));
        linearLayout.addView(frameLayout);
        sx4 sx4Var = new sx4(this.a, vnbVar, context);
        sx4Var.d0 = true;
        sx4Var.h(starGift, false, false, false, false, false);
        sx4Var.setImageSize(hl.L(100.0f));
        sx4Var.setImageLayer(7);
        sx4Var.K.setVisibility(8);
        frameLayout.addView(sx4Var, tre.d(130, 130.0f, 17, 0.0f, 18.0f, 0.0f, 14.0f));
        TextView textView = new TextView(context);
        textView.setTypeface(hl.o());
        textView.setGravity(17);
        textView.setText(str2);
        textView.setTextSize(1, 20.0f);
        int i3 = aob.G6;
        yob.X(textView, i3, vnbVar);
        linearLayout.addView(textView, tre.t(-1, -2, 17, 20, 0, 20, 6));
        p66 p66Var = new p66(context, null);
        this.f2 = p66Var;
        p66Var.setGravity(17);
        p66Var.setText(TextUtils.concat(hl.S2(ob6.G(starGift.gifts_per_round, "Gift2AuctionInfo2", str2)), " ", hl.E2(hl.N2(ob6.M0(2131750318, null), -1, 0, new yy(context, vnbVar, starGift, (byte) 0), null), true, hl.L(2.6666667f), hl.L(1.0f))));
        p66Var.setTextSize(1, 14.0f);
        yob.X(p66Var, i3, vnbVar);
        int i4 = aob.J6;
        yob.G(p66Var, i4, vnbVar);
        linearLayout.addView(p66Var, tre.t(-1, -2, 17, 20, 0, 20, 4));
        hjb hjbVar = new hjb(context, vnbVar);
        String M0 = ob6.M0(2131750284, null);
        y41[] y41VarArr = k2;
        hjbVar.f(M0, "", null, y41VarArr);
        this.X1 = y41VarArr[0];
        hjbVar.f(ob6.M0(2131750285, null), "", null, y41VarArr);
        this.Y1 = y41VarArr[0];
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        frameLayout2.setClipChildren(false);
        frameLayout2.setClipToPadding(false);
        frameLayout2.addView(hjbVar, tre.e(-1, -2, 119));
        this.c2 = new p(this, new kg5[1], frameLayout2, (byte) 3);
        TableRow f = hjbVar.f(ob6.M0(2131749359, null), "", null, y41VarArr);
        this.d2 = f;
        f.setOnClickListener(new View.OnClickListener(this) {
            public final fz b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                fz fzVar = this.b;
                switch (b) {
                    case 0:
                        new xk8(40, (vnb) null, fzVar.getContext()).show();
                        return;
                    default:
                        fzVar.b1();
                        return;
                }
            }
        });
        this.Z1 = y41VarArr[0];
        gjb[] gjbVarArr = l2;
        hjbVar.f("", "", gjbVarArr, y41VarArr);
        this.a2 = y41VarArr[0];
        this.b2 = gjbVarArr[0];
        linearLayout.addView(frameLayout2, tre.k(16.0f, 16.0f, 14.0f, 18.0f, -1, -2));
        p66 p66Var2 = new p66(context, vnbVar);
        this.g2 = p66Var2;
        p66Var2.setGravity(17);
        p66Var2.setTextSize(1, 16.0f);
        yob.X(p66Var2, i4, vnbVar);
        yob.G(p66Var2, i4, vnbVar);
        p66Var2.setOnClickListener(new c0(this, new boolean[1], vnbVar, (byte) 9));
        iye.b(p66Var2, 0.02f, 1.5f);
        if (starGift.sticker != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("*");
            z = false;
            spannableStringBuilder.setSpan(new hm(starGift.sticker, p66Var2.getPaint().getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
            this.i2 = spannableStringBuilder;
        } else {
            z = false;
            this.i2 = "";
        }
        c51 c51Var = new c51(vnbVar, context, true);
        this.e2 = c51Var;
        c51Var.f();
        final int i5 = z;
        c51Var.setOnClickListener(new az(this, j, context, vnbVar, ex4Var, (byte) 0));
        FrameLayout.LayoutParams d = tre.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f);
        int i6 = d.leftMargin;
        int i7 = this.u0;
        d.leftMargin = i6 + i7;
        d.rightMargin += i7;
        this.b.addView(c51Var, d);
        d79 d79Var = this.n1;
        int i8 = this.u0;
        d79Var.setPadding(i8, i5, i8, hl.L(64.0f));
        this.j2.O(i5);
        kv4 l = ov4.c(this.a).l(j2, this);
        this.h2 = l;
        if (l != null && (tL_starGiftAuctionState2 = l.f) != null) {
            if (tL_starGiftAuctionState2.start_date > ConnectionsManager.getInstance(this.a).getCurrentTime()) {
                hjbVar.f(ob6.M0(2131750292, null), ob6.E(this.h2.f.total_rounds, ','), null, null);
            } else {
                String M02 = ob6.M0(2131750293, null);
                String E = ob6.E(this.h2.f.current_round, ',');
                String E2 = ob6.E(this.h2.f.total_rounds, ',');
                Object[] objArr = new Object[2];
                objArr[i5] = E;
                objArr[1] = E2;
                hjbVar.f(M02, ob6.a0(null, null, 2131747555, objArr), null, null);
            }
        }
        kv4 kv4Var = this.h2;
        if (kv4Var != null && (tL_starGiftAuctionState = kv4Var.f) != null && (arrayList = tL_starGiftAuctionState.rounds) != null) {
            int size = arrayList.size();
            for (int i9 = i5; i9 < size; i9++) {
                TL_stars.StarGiftAuctionRound starGiftAuctionRound = this.h2.f.rounds.get(i9);
                int i10 = size - 1;
                kv4 kv4Var2 = this.h2;
                if (i9 < i10) {
                    i = 1;
                    i2 = kv4Var2.f.rounds.get(i9 + 1).num - 1;
                } else {
                    i = 1;
                    i2 = kv4Var2.f.total_rounds;
                }
                int i11 = starGiftAuctionRound.num;
                if (i11 == i2) {
                    Object[] objArr2 = new Object[i];
                    objArr2[i5] = Integer.valueOf(i11);
                    a0 = ob6.a0(null, null, 2131750291, objArr2);
                } else {
                    Integer valueOf = Integer.valueOf(i11);
                    Integer valueOf2 = Integer.valueOf(i2);
                    Object[] objArr3 = new Object[2];
                    objArr3[i5] = valueOf;
                    objArr3[i] = valueOf2;
                    a0 = ob6.a0(null, null, 2131750289, objArr3);
                }
                int i12 = starGiftAuctionRound.num;
                int i13 = starGiftAuctionRound.duration;
                if (i12 == i2) {
                    String c0 = ob6.c0(i13);
                    String c02 = ob6.c0(starGiftAuctionRound.current_window);
                    Integer valueOf3 = Integer.valueOf(starGiftAuctionRound.extend_top);
                    Object[] objArr4 = new Object[3];
                    objArr4[i5] = c0;
                    objArr4[1] = c02;
                    objArr4[2] = valueOf3;
                    G = ob6.a0(null, null, 2131750290, objArr4);
                } else {
                    G = ob6.G(i13 / 60, "Gift2AuctionTableCurrentRoundsTwoDuration", new Object[i5]);
                }
                hjbVar.f(a0, G, null, null);
            }
        }
        kv4 kv4Var3 = this.h2;
        if (kv4Var3 != null && kv4Var3.h != null) {
            dz dzVar = new dz(this, context, vnbVar, new vy(this, i5), new y00((byte) 1), new y00((byte) 1), new y00((byte) 1), new y00((byte) 1), new y00((byte) 1), new y00((byte) 1));
            dzVar.d(new yta(1, 1));
            dzVar.setPreviewingAttributes(this.h2.h);
            dzVar.removeView(dzVar.Q);
            this.V1.addView(dzVar, i5, tre.e(-1, 288, 48));
            TextView textView2 = new TextView(context);
            this.W1 = textView2;
            textView2.setGravity(17);
            textView2.setTypeface(hl.o());
            textView2.setTextColor(-1);
            textView2.setTextSize(1, 12.0f);
            kv4 kv4Var4 = this.h2;
            if (kv4Var4.g != null) {
                textView2.setText(ob6.M0(2131750324, null));
            } else if (kv4Var4.g(ConnectionsManager.getInstance(yac.t0).getCurrentTime())) {
                textView2.setText(ob6.M0(2131750087, null));
            } else {
                textView2.setText(ob6.M0(2131750088, null));
            }
            textView2.setBackground(aob.Z(i5, 285212671, 13, 13));
            textView2.setPadding(hl.L(12.0f), i5, hl.L(12.0f), i5);
            TextView l3 = ik8.l(this.V1, textView2, tre.d(-2, 26.0f, 81, 16.0f, 0.0f, 16.0f, 77.0f), context);
            l3.setTypeface(hl.o());
            l3.setTextSize(1, 21.0f);
            l3.setText(str2);
            l3.setGravity(17);
            l3.setTextColor(-1);
            TextView l4 = ik8.l(this.V1, l3, tre.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 40.0f), context);
            l4.setTextSize(1, 13.0f);
            l4.setText(hl.E2(ob6.M0(2131750311, null), i5, hl.L(2.6666667f), hl.L(1.0f)));
            l4.setPadding(hl.L(8.0f), hl.L(8.0f), hl.L(8.0f), hl.L(8.0f));
            l4.setGravity(17);
            l4.setTextColor(-1342177281);
            l4.setOnClickListener(new View.OnClickListener(this) {
                public final fz b;

                {
                    this.b = this;
                }

                @Override
                public final void onClick(View view) {
                    byte b = i5;
                    fz fzVar = this.b;
                    switch (b) {
                        case 0:
                            new xk8(40, (vnb) null, fzVar.getContext()).show();
                            return;
                        default:
                            fzVar.b1();
                            return;
                    }
                }
            });
            iye.b(l4, 0.02f, 1.5f);
            this.V1.addView(l4, tre.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 12.0f));
            sx4Var.setVisibility(8);
            textView.setVisibility(8);
            this.f2.setVisibility(8);
            p66 p66Var3 = new p66(context, vnbVar);
            p66Var3.setGravity(17);
            p66Var3.setTextSize(1, 16.0f);
            int i14 = aob.J6;
            yob.X(p66Var3, i14, vnbVar);
            yob.G(p66Var3, i14, vnbVar);
            p66Var3.setOnClickListener(new c0(this, context, vnbVar, (byte) 8));
            iye.b(p66Var3, 0.02f, 1.5f);
            this.U1.addView(p66Var3, tre.k(16.0f, 0.0f, 14.0f, 18.0f, -1, -2));
            ge0 ge0Var = new ge0(atb.c(TL_stars.starGiftAttributeModel.class, this.h2.h));
            long j3 = starGift.upgrade_variants;
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            for (int i15 = i5; i15 < 3; i15++) {
                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) ge0Var.b();
                if (stargiftattributemodel != null) {
                    spannableStringBuilder2.append('*');
                    spannableStringBuilder2.setSpan(new hm(stargiftattributemodel.document, p66Var3.getPaint().getFontMetricsInt()), i15, i15 + 1, 33);
                }
            }
            String E3 = ob6.E(j3, ',');
            Object[] objArr5 = new Object[2];
            objArr5[i5] = spannableStringBuilder2;
            objArr5[1] = E3;
            p66Var3.setText(hl.E2(ob6.V(null, null, 2131750279, objArr5), true, hl.L(2.6666667f), hl.L(1.0f)));
        }
        this.U1.addView(this.g2, tre.k(16.0f, 0.0f, 14.0f, 18.0f, -1, -2));
        d1(i5);
    }

    public static void Z0(a aVar, Context context, vnb vnbVar, TL_stars.StarGift starGift) {
        aVar.setActionBarMenuOnItemClick(new ez(vnbVar, context, starGift));
        s7 a = aVar.u().a(0, 2131231247);
        a.setContentDescription(ob6.M0(2131754834, "AccDescrMoreOptions"));
        a.e(4, 2131232190, ob6.M0(2131748085, null));
        a.e(3, 2131231809, ob6.M0(2131751727, null));
        a.e(2, 2131232368, ob6.M0(2131745186, null));
    }

    public static void a1(Context context, vnb vnbVar, int i, long j, long j2, ex4 ex4Var) {
        ov4 c = ov4.c(i);
        ng ngVar = new ng(context, vnbVar, i, j, ex4Var);
        kv4 b = c.b(j2);
        if (b != null) {
            ngVar.a(b, null);
            return;
        }
        iv4 iv4Var = new iv4(c, ngVar, j2, (byte) 0);
        TL_stars.TL_inputStarGiftAuction tL_inputStarGiftAuction = new TL_stars.TL_inputStarGiftAuction();
        tL_inputStarGiftAuction.gift_id = j2;
        TL_payments.TL_getStarGiftAuctionState tL_getStarGiftAuctionState = new TL_payments.TL_getStarGiftAuctionState();
        tL_getStarGiftAuctionState.auction = tL_inputStarGiftAuction;
        tL_getStarGiftAuctionState.version = 0;
        c.getConnectionsManager().sendRequestTyped(tL_getStarGiftAuctionState, new ic((byte) 0), new qe2(c, iv4Var, (byte) 14));
    }

    public static void c1(vnb vnbVar, Context context, TL_stars.StarGift starGift) {
        if (context != null && starGift != null) {
            nx0 h = uh9.h(1, null, context, false);
            ax0 ax0Var = h.y0;
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            linearLayout.setClipChildren(false);
            linearLayout.setClipToPadding(false);
            ImageView imageView = new ImageView(context);
            imageView.setPadding(hl.L(17.0f), hl.L(17.0f), hl.L(17.0f), hl.L(17.0f));
            imageView.setImageResource(2131231119);
            ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
            Paint paint = shapeDrawable.getPaint();
            int i = aob.Fi;
            paint.setColor(aob.v0(i, vnbVar));
            uob M = yob.M(i);
            imageView.setBackground(shapeDrawable);
            yob.j(imageView, shapeDrawable, M, null, vnbVar);
            linearLayout.addView(imageView, tre.t(80, 80, 17, 0, 21, 0, 16));
            TextView textView = new TextView(context);
            textView.setTypeface(hl.o());
            textView.setGravity(17);
            textView.setText(ob6.M0(2131749764, null));
            textView.setTextSize(1, 20.0f);
            int i2 = aob.G6;
            yob.X(textView, i2, vnbVar);
            linearLayout.addView(textView, tre.t(-1, -2, 17, 20, 0, 20, 6));
            TextView textView2 = new TextView(context);
            textView2.setGravity(17);
            qd4.u(14.0f, 2131749763, 1, textView2, null);
            yob.X(textView2, i2, vnbVar);
            linearLayout.addView(textView2, tre.t(-1, -2, 17, 20, 0, 20, 16));
            yk8 yk8Var = new yk8(context, vnbVar);
            int i3 = starGift.gifts_per_round;
            yk8Var.a.l(ob6.G(i3, "GiftAuctionInfo1Header", Integer.valueOf(i3)), false);
            int i4 = starGift.gifts_per_round;
            yk8Var.b.setText(ob6.G(i4, "GiftAuctionInfo1Text", Integer.valueOf(i4)));
            yk8Var.d.setVisibility(8);
            ImageView imageView2 = yk8Var.c;
            imageView2.setImageResource(2131231907);
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
            yob.s(imageView2, i2, vnbVar, mode);
            linearLayout.addView(yk8Var, tre.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
            yk8 yk8Var2 = new yk8(context, vnbVar);
            yk8Var2.a.l(ob6.M0(2131749770, null), false);
            yk8Var2.b.setText(ob6.G(starGift.gifts_per_round, "GiftAuctionInfo2Text", new Object[0]));
            yk8Var2.d.setVisibility(8);
            ImageView imageView3 = yk8Var2.c;
            imageView3.setImageResource(2131231777);
            yob.s(imageView3, i2, vnbVar, mode);
            linearLayout.addView(yk8Var2, tre.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
            yk8 yk8Var3 = new yk8(context, vnbVar);
            yk8Var3.a.l(ob6.M0(2131749766, null), false);
            yk8Var3.b.setText(ob6.M0(2131749765, null));
            yk8Var3.d.setVisibility(8);
            ImageView imageView4 = yk8Var3.c;
            imageView4.setImageResource(2131231770);
            yob.s(imageView4, i2, vnbVar, mode);
            linearLayout.addView(yk8Var3, tre.k(6.0f, 0.0f, 6.0f, 8.0f, -1, -2));
            c51 c51Var = new c51(vnbVar, context, true);
            c51Var.setOnClickListener(new xy(ax0Var, (byte) 0));
            c51Var.i(wua.l2(ob6.M0(2131743543, null)), false, true);
            linearLayout.addView(c51Var, tre.k(16.0f, 10.0f, 16.0f, 8.0f, -1, 48));
            h.O = linearLayout;
            h.show();
        }
    }

    @Override
    public final c79 H0(d79 d79Var) {
        l9c l9cVar = new l9c(this.n1, getContext(), this.a, 0, true, new c(this, (byte) 11), this.J0);
        this.j2 = l9cVar;
        l9cVar.r = false;
        return l9cVar;
    }

    @Override
    public final CharSequence K0() {
        return "";
    }

    public final void b1() {
        TL_stars.TL_starGiftAuctionStateFinished tL_starGiftAuctionStateFinished;
        kv4 kv4Var = this.h2;
        if (kv4Var != null && (tL_starGiftAuctionStateFinished = kv4Var.g) != null && kv4Var.d.title != null) {
            this.c2.a(this.Z1, ob6.a0(null, null, 2131750250, Long.valueOf(tL_starGiftAuctionStateFinished.average_price), this.h2.d.title));
        }
    }

    public final void d1(boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fz.d1(boolean):void");
    }

    @Override
    public final void dismiss() {
        ov4.c(this.a).n(this.T1, this);
        super.dismiss();
    }

    @Override
    public final void q(kv4 kv4Var) {
        this.h2 = kv4Var;
        d1(true);
    }
}
