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
public final class e00 extends mz0 implements kv4 {
    public static final x51[] k2 = new x51[1];
    public static final lhb[] l2 = new lhb[1];
    public final TL_stars.StarGift S1;
    public final long T1;
    public final LinearLayout U1;
    public final FrameLayout V1;
    public final TextView W1;
    public final x51 X1;
    public final x51 Y1;
    public final x51 Z1;
    public final x51 a2;
    public final lhb b2;
    public final p c2;
    public final TableRow d2;
    public final b61 e2;
    public final l66 f2;
    public final l66 g2;
    public hv4 h2;
    public final CharSequence i2;
    public l7c j2;

    public e00(Context context, ylb ylbVar, long j, TL_stars.StarGift starGift, bx4 bx4Var) {
        super(context, null, false, false, 1, ylbVar);
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
        this.E1 = gm.L(6.0f);
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
        a aVar = new a(context, ylbVar);
        aVar.H(-1, false);
        aVar.setOccupyStatusBar(false);
        Y0(aVar, context, ylbVar, starGift);
        FrameLayout frameLayout = new FrameLayout(context);
        this.V1 = frameLayout;
        frameLayout.addView(aVar, qoe.o(-1, -2));
        linearLayout.addView(frameLayout);
        ox4 ox4Var = new ox4(this.a, ylbVar, context);
        ox4Var.d0 = true;
        ox4Var.h(starGift, false, false, false, false, false);
        ox4Var.setImageSize(gm.L(100.0f));
        ox4Var.setImageLayer(7);
        ox4Var.K.setVisibility(8);
        frameLayout.addView(ox4Var, qoe.d(130, 130.0f, 17, 0.0f, 18.0f, 0.0f, 14.0f));
        TextView textView = new TextView(context);
        textView.setTypeface(gm.o());
        textView.setGravity(17);
        textView.setText(str2);
        textView.setTextSize(1, 20.0f);
        int i3 = cmb.F6;
        anb.X(textView, i3, ylbVar);
        linearLayout.addView(textView, qoe.t(-1, -2, 17, 20, 0, 20, 6));
        l66 l66Var = new l66(context, null);
        this.f2 = l66Var;
        l66Var.setGravity(17);
        l66Var.setText(TextUtils.concat(gm.S2(jb6.G(starGift.gifts_per_round, "Gift2AuctionInfo2", str2)), " ", gm.E2(gm.N2(jb6.M0(2131750290, null), -1, 0, new xz(context, ylbVar, starGift, (byte) 0), null), true, gm.L(2.6666667f), gm.L(1.0f))));
        l66Var.setTextSize(1, 14.0f);
        anb.X(l66Var, i3, ylbVar);
        int i4 = cmb.I6;
        anb.G(l66Var, i4, ylbVar);
        linearLayout.addView(l66Var, qoe.t(-1, -2, 17, 20, 0, 20, 4));
        mhb mhbVar = new mhb(context, ylbVar);
        String M0 = jb6.M0(2131750256, null);
        x51[] x51VarArr = k2;
        mhbVar.f(M0, "", null, x51VarArr);
        this.X1 = x51VarArr[0];
        mhbVar.f(jb6.M0(2131750257, null), "", null, x51VarArr);
        this.Y1 = x51VarArr[0];
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        frameLayout2.setClipChildren(false);
        frameLayout2.setClipToPadding(false);
        frameLayout2.addView(mhbVar, qoe.e(-1, -2, 119));
        this.c2 = new p(this, new hg5[1], frameLayout2, (byte) 3);
        TableRow f = mhbVar.f(jb6.M0(2131749362, null), "", null, x51VarArr);
        this.d2 = f;
        f.setOnClickListener(new View.OnClickListener(this) {
            public final e00 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                e00 e00Var = this.b;
                switch (b) {
                    case 0:
                        new kj8(40, (ylb) null, e00Var.getContext()).show();
                        return;
                    default:
                        e00Var.a1();
                        return;
                }
            }
        });
        this.Z1 = x51VarArr[0];
        lhb[] lhbVarArr = l2;
        mhbVar.f("", "", lhbVarArr, x51VarArr);
        this.a2 = x51VarArr[0];
        this.b2 = lhbVarArr[0];
        linearLayout.addView(frameLayout2, qoe.k(16.0f, 16.0f, 14.0f, 18.0f, -1, -2));
        l66 l66Var2 = new l66(context, ylbVar);
        this.g2 = l66Var2;
        l66Var2.setGravity(17);
        l66Var2.setTextSize(1, 16.0f);
        anb.X(l66Var2, i4, ylbVar);
        anb.G(l66Var2, i4, ylbVar);
        l66Var2.setOnClickListener(new b0(this, new boolean[1], ylbVar, (byte) 9));
        rve.b(l66Var2, 0.02f, 1.5f);
        if (starGift.sticker != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("*");
            z = false;
            spannableStringBuilder.setSpan(new gn(starGift.sticker, l66Var2.getPaint().getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
            this.i2 = spannableStringBuilder;
        } else {
            z = false;
            this.i2 = "";
        }
        b61 b61Var = new b61(ylbVar, context, true);
        this.e2 = b61Var;
        b61Var.f();
        final int i5 = z;
        b61Var.setOnClickListener(new zz(this, j, context, ylbVar, bx4Var, (byte) 0));
        FrameLayout.LayoutParams d = qoe.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f);
        int i6 = d.leftMargin;
        int i7 = this.u0;
        d.leftMargin = i6 + i7;
        d.rightMargin += i7;
        this.b.addView(b61Var, d);
        r59 r59Var = this.n1;
        int i8 = this.u0;
        r59Var.setPadding(i8, i5, i8, gm.L(64.0f));
        this.j2.O(i5);
        hv4 l = lv4.c(this.a).l(j2, this);
        this.h2 = l;
        if (l != null && (tL_starGiftAuctionState2 = l.f) != null) {
            if (tL_starGiftAuctionState2.start_date > ConnectionsManager.getInstance(this.a).getCurrentTime()) {
                mhbVar.f(jb6.M0(2131750264, null), jb6.E(this.h2.f.total_rounds, ','), null, null);
            } else {
                String M02 = jb6.M0(2131750265, null);
                String E = jb6.E(this.h2.f.current_round, ',');
                String E2 = jb6.E(this.h2.f.total_rounds, ',');
                Object[] objArr = new Object[2];
                objArr[i5] = E;
                objArr[1] = E2;
                mhbVar.f(M02, jb6.a0(null, null, 2131747561, objArr), null, null);
            }
        }
        hv4 hv4Var = this.h2;
        if (hv4Var != null && (tL_starGiftAuctionState = hv4Var.f) != null && (arrayList = tL_starGiftAuctionState.rounds) != null) {
            int size = arrayList.size();
            for (int i9 = i5; i9 < size; i9++) {
                TL_stars.StarGiftAuctionRound starGiftAuctionRound = this.h2.f.rounds.get(i9);
                int i10 = size - 1;
                hv4 hv4Var2 = this.h2;
                if (i9 < i10) {
                    i = 1;
                    i2 = hv4Var2.f.rounds.get(i9 + 1).num - 1;
                } else {
                    i = 1;
                    i2 = hv4Var2.f.total_rounds;
                }
                int i11 = starGiftAuctionRound.num;
                if (i11 == i2) {
                    Object[] objArr2 = new Object[i];
                    objArr2[i5] = Integer.valueOf(i11);
                    a0 = jb6.a0(null, null, 2131750263, objArr2);
                } else {
                    Integer valueOf = Integer.valueOf(i11);
                    Integer valueOf2 = Integer.valueOf(i2);
                    Object[] objArr3 = new Object[2];
                    objArr3[i5] = valueOf;
                    objArr3[i] = valueOf2;
                    a0 = jb6.a0(null, null, 2131750261, objArr3);
                }
                int i12 = starGiftAuctionRound.num;
                int i13 = starGiftAuctionRound.duration;
                if (i12 == i2) {
                    String c0 = jb6.c0(i13);
                    String c02 = jb6.c0(starGiftAuctionRound.current_window);
                    Integer valueOf3 = Integer.valueOf(starGiftAuctionRound.extend_top);
                    Object[] objArr4 = new Object[3];
                    objArr4[i5] = c0;
                    objArr4[1] = c02;
                    objArr4[2] = valueOf3;
                    G = jb6.a0(null, null, 2131750262, objArr4);
                } else {
                    G = jb6.G(i13 / 60, "Gift2AuctionTableCurrentRoundsTwoDuration", new Object[i5]);
                }
                mhbVar.f(a0, G, null, null);
            }
        }
        hv4 hv4Var3 = this.h2;
        if (hv4Var3 != null && hv4Var3.h != null) {
            c00 c00Var = new c00(this, context, ylbVar, new uz(this, i5), new x10((byte) 1), new x10((byte) 1), new x10((byte) 1), new x10((byte) 1), new x10((byte) 1), new x10((byte) 1));
            c00Var.d(new xra(1, 1));
            c00Var.setPreviewingAttributes(this.h2.h);
            c00Var.removeView(c00Var.Q);
            this.V1.addView(c00Var, i5, qoe.e(-1, 288, 48));
            TextView textView2 = new TextView(context);
            this.W1 = textView2;
            textView2.setGravity(17);
            textView2.setTypeface(gm.o());
            textView2.setTextColor(-1);
            textView2.setTextSize(1, 12.0f);
            hv4 hv4Var4 = this.h2;
            if (hv4Var4.g != null) {
                textView2.setText(jb6.M0(2131750296, null));
            } else if (hv4Var4.g(ConnectionsManager.getInstance(z8c.t0).getCurrentTime())) {
                textView2.setText(jb6.M0(2131750061, null));
            } else {
                textView2.setText(jb6.M0(2131750062, null));
            }
            textView2.setBackground(cmb.Z(i5, 285212671, 13, 13));
            textView2.setPadding(gm.L(12.0f), i5, gm.L(12.0f), i5);
            TextView l3 = wi8.l(this.V1, textView2, qoe.d(-2, 26.0f, 81, 16.0f, 0.0f, 16.0f, 77.0f), context);
            l3.setTypeface(gm.o());
            l3.setTextSize(1, 21.0f);
            l3.setText(str2);
            l3.setGravity(17);
            l3.setTextColor(-1);
            TextView l4 = wi8.l(this.V1, l3, qoe.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 40.0f), context);
            l4.setTextSize(1, 13.0f);
            l4.setText(gm.E2(jb6.M0(2131750283, null), i5, gm.L(2.6666667f), gm.L(1.0f)));
            l4.setPadding(gm.L(8.0f), gm.L(8.0f), gm.L(8.0f), gm.L(8.0f));
            l4.setGravity(17);
            l4.setTextColor(-1342177281);
            l4.setOnClickListener(new View.OnClickListener(this) {
                public final e00 b;

                {
                    this.b = this;
                }

                @Override
                public final void onClick(View view) {
                    byte b = i5;
                    e00 e00Var = this.b;
                    switch (b) {
                        case 0:
                            new kj8(40, (ylb) null, e00Var.getContext()).show();
                            return;
                        default:
                            e00Var.a1();
                            return;
                    }
                }
            });
            rve.b(l4, 0.02f, 1.5f);
            this.V1.addView(l4, qoe.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 12.0f));
            ox4Var.setVisibility(8);
            textView.setVisibility(8);
            this.f2.setVisibility(8);
            l66 l66Var3 = new l66(context, ylbVar);
            l66Var3.setGravity(17);
            l66Var3.setTextSize(1, 16.0f);
            int i14 = cmb.I6;
            anb.X(l66Var3, i14, ylbVar);
            anb.G(l66Var3, i14, ylbVar);
            l66Var3.setOnClickListener(new b0(this, context, ylbVar, (byte) 8));
            rve.b(l66Var3, 0.02f, 1.5f);
            this.U1.addView(l66Var3, qoe.k(16.0f, 0.0f, 14.0f, 18.0f, -1, -2));
            ef0 ef0Var = new ef0(brb.c(TL_stars.starGiftAttributeModel.class, this.h2.h));
            long j3 = starGift.upgrade_variants;
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            for (int i15 = i5; i15 < 3; i15++) {
                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) ef0Var.b();
                if (stargiftattributemodel != null) {
                    spannableStringBuilder2.append('*');
                    spannableStringBuilder2.setSpan(new gn(stargiftattributemodel.document, l66Var3.getPaint().getFontMetricsInt()), i15, i15 + 1, 33);
                }
            }
            String E3 = jb6.E(j3, ',');
            Object[] objArr5 = new Object[2];
            objArr5[i5] = spannableStringBuilder2;
            objArr5[1] = E3;
            l66Var3.setText(gm.E2(jb6.V(null, null, 2131750251, objArr5), true, gm.L(2.6666667f), gm.L(1.0f)));
        }
        this.U1.addView(this.g2, qoe.k(16.0f, 0.0f, 14.0f, 18.0f, -1, -2));
        c1(i5);
    }

    public static void Y0(a aVar, Context context, ylb ylbVar, TL_stars.StarGift starGift) {
        aVar.setActionBarMenuOnItemClick(new d00(ylbVar, context, starGift));
        r7 a = aVar.t().a(0, 2131231248);
        a.setContentDescription(jb6.M0(2131754838, "AccDescrMoreOptions"));
        a.e(4, 2131232191, jb6.M0(2131748088, null));
        a.e(3, 2131231810, jb6.M0(2131751699, null));
        a.e(2, 2131232369, jb6.M0(2131745192, null));
    }

    public static void Z0(Context context, ylb ylbVar, int i, long j, long j2, bx4 bx4Var) {
        lv4 c = lv4.c(i);
        yh yhVar = new yh(context, ylbVar, i, j, bx4Var);
        hv4 b = c.b(j2);
        if (b != null) {
            yhVar.a(b, null);
            return;
        }
        fv4 fv4Var = new fv4(c, yhVar, j2, (byte) 0);
        TL_stars.TL_inputStarGiftAuction tL_inputStarGiftAuction = new TL_stars.TL_inputStarGiftAuction();
        tL_inputStarGiftAuction.gift_id = j2;
        TL_payments.TL_getStarGiftAuctionState tL_getStarGiftAuctionState = new TL_payments.TL_getStarGiftAuctionState();
        tL_getStarGiftAuctionState.auction = tL_inputStarGiftAuction;
        tL_getStarGiftAuctionState.version = 0;
        c.getConnectionsManager().sendRequestTyped(tL_getStarGiftAuctionState, new kc((byte) 0), new lf2(c, fv4Var, (byte) 16));
    }

    public static void b1(ylb ylbVar, Context context, TL_stars.StarGift starGift) {
        if (context != null && starGift != null) {
            my0 h = hg9.h(1, null, context, false);
            zx0 zx0Var = h.y0;
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            linearLayout.setClipChildren(false);
            linearLayout.setClipToPadding(false);
            ImageView imageView = new ImageView(context);
            imageView.setPadding(gm.L(17.0f), gm.L(17.0f), gm.L(17.0f), gm.L(17.0f));
            imageView.setImageResource(2131231120);
            ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
            Paint paint = shapeDrawable.getPaint();
            int i = cmb.Ei;
            paint.setColor(cmb.v0(i, ylbVar));
            wmb M = anb.M(i);
            imageView.setBackground(shapeDrawable);
            anb.j(imageView, shapeDrawable, M, null, ylbVar);
            linearLayout.addView(imageView, qoe.t(80, 80, 17, 0, 21, 0, 16));
            TextView textView = new TextView(context);
            textView.setTypeface(gm.o());
            textView.setGravity(17);
            textView.setText(jb6.M0(2131749751, null));
            textView.setTextSize(1, 20.0f);
            int i2 = cmb.F6;
            anb.X(textView, i2, ylbVar);
            linearLayout.addView(textView, qoe.t(-1, -2, 17, 20, 0, 20, 6));
            TextView textView2 = new TextView(context);
            textView2.setGravity(17);
            td4.v(14.0f, 2131749750, 1, textView2, null);
            anb.X(textView2, i2, ylbVar);
            linearLayout.addView(textView2, qoe.t(-1, -2, 17, 20, 0, 20, 16));
            lj8 lj8Var = new lj8(context, ylbVar);
            int i3 = starGift.gifts_per_round;
            lj8Var.a.l(jb6.G(i3, "GiftAuctionInfo1Header", Integer.valueOf(i3)), false);
            int i4 = starGift.gifts_per_round;
            lj8Var.b.setText(jb6.G(i4, "GiftAuctionInfo1Text", Integer.valueOf(i4)));
            lj8Var.d.setVisibility(8);
            ImageView imageView2 = lj8Var.c;
            imageView2.setImageResource(2131231908);
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
            anb.s(imageView2, i2, ylbVar, mode);
            linearLayout.addView(lj8Var, qoe.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
            lj8 lj8Var2 = new lj8(context, ylbVar);
            lj8Var2.a.l(jb6.M0(2131749757, null), false);
            lj8Var2.b.setText(jb6.G(starGift.gifts_per_round, "GiftAuctionInfo2Text", new Object[0]));
            lj8Var2.d.setVisibility(8);
            ImageView imageView3 = lj8Var2.c;
            imageView3.setImageResource(2131231778);
            anb.s(imageView3, i2, ylbVar, mode);
            linearLayout.addView(lj8Var2, qoe.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
            lj8 lj8Var3 = new lj8(context, ylbVar);
            lj8Var3.a.l(jb6.M0(2131749753, null), false);
            lj8Var3.b.setText(jb6.M0(2131749752, null));
            lj8Var3.d.setVisibility(8);
            ImageView imageView4 = lj8Var3.c;
            imageView4.setImageResource(2131231771);
            anb.s(imageView4, i2, ylbVar, mode);
            linearLayout.addView(lj8Var3, qoe.k(6.0f, 0.0f, 6.0f, 8.0f, -1, -2));
            b61 b61Var = new b61(ylbVar, context, true);
            b61Var.setOnClickListener(new vz(zx0Var, (byte) 0));
            b61Var.i(wsa.k2(jb6.M0(2131743575, null)), false, true);
            linearLayout.addView(b61Var, qoe.k(16.0f, 10.0f, 16.0f, 8.0f, -1, 48));
            h.O = linearLayout;
            h.show();
        }
    }

    @Override
    public final q59 G0(r59 r59Var) {
        l7c l7cVar = new l7c(this.n1, getContext(), this.a, 0, true, new f(this, (byte) 11), this.J0);
        this.j2 = l7cVar;
        l7cVar.r = false;
        return l7cVar;
    }

    @Override
    public final CharSequence J0() {
        return "";
    }

    public final void a1() {
        TL_stars.TL_starGiftAuctionStateFinished tL_starGiftAuctionStateFinished;
        hv4 hv4Var = this.h2;
        if (hv4Var != null && (tL_starGiftAuctionStateFinished = hv4Var.g) != null && hv4Var.d.title != null) {
            this.c2.a(this.Z1, jb6.a0(null, null, 2131750222, Long.valueOf(tL_starGiftAuctionStateFinished.average_price), this.h2.d.title));
        }
    }

    public final void c1(boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e00.c1(boolean):void");
    }

    @Override
    public final void dismiss() {
        lv4.c(this.a).n(this.T1, this);
        super.dismiss();
    }

    @Override
    public final void q(hv4 hv4Var) {
        this.h2 = hv4Var;
        c1(true);
    }
}
