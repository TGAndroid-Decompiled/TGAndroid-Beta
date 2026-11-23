package di;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.gd;
import org.telegram.messenger.m10;
import org.telegram.messenger.mp;
import org.telegram.messenger.zy;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.dy0;
import org.telegram.ui.Components.kq;
import org.telegram.ui.Components.m30;
public final class o0 extends org.telegram.ui.ActionBar.w2 {
    public static final int[] H1 = {21600, 43200, 86400, 129600, 172800, 259200};
    public final cb.c A1;
    public cg.a B1;
    public int C1;
    public int D1;
    public final k1 E1;
    public final kq[] F1;
    public final kq[] G1;
    public final b f9392m1;
    public final TL_stars.TL_starGiftUnique n1;
    public final String f9393o1;
    public final long f9394p1;
    public final m30 f9395q1;
    public final TextView f9396r1;
    public final EditTextBoldCursor f9397s1;
    public final TextView f9398t1;
    public final TextView f9399u1;
    public final TextView f9400v1;
    public final hi.e f9401w1;
    public final org.telegram.ui.Components.n6 f9402x1;
    public final ImageView f9403y1;
    public final ImageView f9404z1;

    public o0(final int i7, final long j3, final Context context, k1 k1Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, final org.telegram.ui.ActionBar.i6 i6Var) {
        super(1, context, i6Var, true);
        boolean z10;
        TLRPC.User c22;
        cb.c cVar = new cb.c(10);
        q4.q[] qVarArr = (q4.q[]) cVar.f5146b;
        this.A1 = cVar;
        this.F1 = new kq[1];
        this.G1 = new kq[1];
        this.f30223a = i7;
        this.f9394p1 = j3;
        this.n1 = tL_starGiftUnique;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(tL_starGiftUnique.title);
        sb2.append(" #");
        this.f9393o1 = i5.c.l(tL_starGiftUnique.num, ',', sb2);
        this.E1 = k1Var;
        this.E = true;
        this.Q0 = true;
        int i10 = org.telegram.ui.ActionBar.n6.f29394a7;
        w0(i10);
        Q(i10);
        this.f30227b0 = i10;
        boolean j10 = y8.y(i7, true).j();
        if (j3 > 0 && mp.u1(i7).d2(j3) == null && (c22 = mp.u1(i7).c2(Long.valueOf(j3))) != null) {
            mp.u1(i7).c3(c22, 0, false, null);
        }
        org.telegram.messenger.p0 p0Var = mp.u1(i7).A7;
        long j11 = tL_starGiftUnique.offer_min_stars;
        cg.b bVar = cg.b.f5268a;
        cg.a h = cg.a.h(j11, bVar);
        cg.a h7 = cg.a.h(Math.max(h.a() * 2, ((org.telegram.messenger.j0) p0Var.f26255q.f15482b).f24899c), bVar);
        cg.b bVar2 = cg.b.f5269b;
        cg.a j12 = cg.a.j(Math.max(h.e(bVar2).o(2).f5267b, ((org.telegram.messenger.l0) p0Var.f26257r.f17372b).f25429c), bVar2);
        cg.a j13 = cg.a.j(Math.max(j12.f5267b * 2, ((org.telegram.messenger.l0) p0Var.f26259s.f17372b).f25429c), bVar2);
        cg.b bVar3 = h.f5266a;
        if (bVar3 != h7.f5266a) {
            z10 = false;
        } else {
            z10 = false;
            qVarArr[bVar3.ordinal()] = new q4.q(h, h7, false, 12);
        }
        cg.b bVar4 = j12.f5266a;
        if (bVar4 == j13.f5266a) {
            qVarArr[bVar4.ordinal()] = new q4.q(j12, j13, z10, 12);
        }
        LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
        TextView textView = new TextView(context);
        textView.setText(gd.N0(2131749668, null));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(8388627);
        int i11 = org.telegram.ui.ActionBar.n6.G6;
        org.telegram.ui.ActionBar.u6.U(textView, i11, i6Var);
        g10.addView(textView, c8.na.k(22.0f, 0.0f, 22.0f, 4.0f, -1, 52));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f9397s1 = editTextBoldCursor;
        if (j10) {
            m30 m30Var = new m30(context, i6Var);
            this.f9395q1 = m30Var;
            ArrayList arrayList = new ArrayList();
            arrayList.add(gd.N0(2131744132, null));
            arrayList.add(gd.N0(2131744131, null));
            m30Var.b(arrayList, new k0(this, 0));
            g10.addView(m30Var, c8.na.k(16.0f, 0.0f, 16.0f, 14.0f, -1, -2));
        } else {
            this.f9395q1 = null;
        }
        LinearLayout J0 = bi.f5.J0(context, i6Var);
        g10.addView(J0, c8.na.k(12.0f, 0.0f, 12.0f, 0.0f, -1, -2));
        TextView textView2 = new TextView(context);
        this.f9396r1 = textView2;
        i5.c.x(textView2, 1, 15.0f);
        org.telegram.ui.ActionBar.u6.U(textView2, org.telegram.ui.ActionBar.n6.L6, i6Var);
        J0.addView(textView2, c8.na.k(18.0f, 15.0f, 18.0f, 0.0f, -1, -2));
        FrameLayout frameLayout = new FrameLayout(context);
        J0.addView(frameLayout, c8.na.k(0.0f, 2.0f, 0.0f, 4.0f, -1, 52));
        ImageView imageView = new ImageView(context);
        this.f9403y1 = imageView;
        imageView.setImageResource(2131232757);
        frameLayout.addView(imageView, c8.na.d(22, 22.0f, 19, 18.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f9404z1 = imageView2;
        imageView2.setImageResource(2131231961);
        frameLayout.addView(imageView2, c8.na.d(22, 22.0f, 19, 18.0f, 0.0f, 0.0f, 0.0f));
        editTextBoldCursor.setCursorSize(org.telegram.messenger.g0.L(22.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setImeOptions(268435462);
        editTextBoldCursor.setTextSize(1, 20.0f);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setPadding(0, 0, 0, 0);
        int i12 = org.telegram.ui.ActionBar.n6.f29651o6;
        editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.n6.w0(i12, i6Var));
        editTextBoldCursor.setHintText("0");
        editTextBoldCursor.setHintColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.H6, i6Var));
        org.telegram.ui.ActionBar.u6.U(editTextBoldCursor, i11, i6Var);
        frameLayout.addView(editTextBoldCursor, c8.na.d(-1, -1.0f, 119, 50.0f, 0.0f, 120.0f, 0.0f));
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(context, false, false, false);
        this.f9402x1 = n6Var;
        int i13 = org.telegram.ui.ActionBar.n6.f29843y6;
        org.telegram.ui.ActionBar.u6.Y(n6Var, i13, i6Var);
        n6Var.setTextSize(org.telegram.messenger.g0.L(17.0f));
        n6Var.setGravity(5);
        frameLayout.addView(n6Var, c8.na.d(-2, -1.0f, 21, 0.0f, 0.0f, 18.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.f9398t1 = textView3;
        textView3.setTextSize(1, 14.0f);
        g10.addView(textView3, c8.na.k(24.0f, 9.0f, 24.0f, 0.0f, -1, -2));
        LinearLayout J02 = bi.f5.J0(context, i6Var);
        J02.setOrientation(0);
        J02.setGravity(16);
        g10.addView(J02, c8.na.k(12.0f, 20.0f, 12.0f, 0.0f, -1, 50));
        TextView textView4 = new TextView(context);
        m10.l(16.0f, 2131749712, 1, textView4, null);
        org.telegram.ui.ActionBar.u6.U(textView4, i11, i6Var);
        TextView f10 = m10.f(J02, textView4, c8.na.q(0, -2, 1.0f, 16, 18, 0, 8, 0), context);
        this.f9399u1 = f10;
        f10.setTextSize(1, 16.0f);
        f10.setGravity(16);
        f10.setCompoundDrawablePadding(org.telegram.messenger.g0.L(4.0f));
        org.telegram.ui.ActionBar.u6.U(f10, i12, i6Var);
        J02.addView(f10, c8.na.t(-2, -1, 16, 0, 0, 14, 0));
        J02.setOnClickListener(new ah.d(this, 11));
        TextView textView5 = new TextView(context);
        this.f9400v1 = textView5;
        textView5.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.u6.U(textView5, i13, i6Var);
        g10.addView(textView5, c8.na.k(24.0f, 9.0f, 24.0f, 0.0f, -1, -2));
        hi.e g11 = m10.g(24, context, i6Var, true);
        this.f9401w1 = g11;
        g11.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                cg.a aVar;
                String str;
                boolean z11;
                String a02;
                int i14;
                boolean z12;
                long j14;
                int i15;
                final o0 o0Var = o0.this;
                if (o0Var.f9401w1.f14340e0) {
                    int i16 = i7;
                    if (mp.u1(i16).A2()) {
                        org.telegram.ui.b.b(i16);
                        return;
                    }
                    y8 x10 = y8.x(i16, o0Var.B1.f5266a);
                    if (x10.f10049e) {
                        aVar = cg.a.m(x10.p());
                    } else {
                        aVar = null;
                    }
                    cg.b bVar5 = cg.b.f5268a;
                    cg.b bVar6 = cg.b.f5269b;
                    if (aVar != null) {
                        long j15 = aVar.f5267b;
                        cg.a aVar2 = o0Var.B1;
                        if (j15 >= aVar2.f5267b) {
                            String str2 = o0Var.f9393o1;
                            long j16 = o0Var.f9394p1;
                            String d = aVar2.d();
                            if (o0Var.B1.f5266a == bVar6) {
                                str = str2;
                                z11 = true;
                            } else {
                                str = str2;
                                z11 = false;
                            }
                            LinearLayout linearLayout = new LinearLayout(o0Var.getContext());
                            linearLayout.setOrientation(1);
                            TextView textView6 = new TextView(o0Var.getContext());
                            textView6.setText(gd.N0(2131749714, null));
                            int i17 = org.telegram.ui.ActionBar.n6.f29559j5;
                            org.telegram.messenger.f3.l(textView6, i17, o0Var.J0, 1, 20.0f);
                            linearLayout.addView(textView6, c8.na.t(-1, -2, 48, 24, 4, 24, 14));
                            TextView textView7 = new TextView(o0Var.getContext());
                            org.telegram.ui.ActionBar.u6.U(textView7, i17, o0Var.J0);
                            textView7.setTextSize(1, 16.0f);
                            if (o0Var.B1.f5266a == bVar5) {
                                a02 = gd.a0(null, null, 2131749665, d, org.telegram.messenger.n5.t(j16), str);
                            } else {
                                a02 = gd.a0(null, null, 2131749664, d, org.telegram.messenger.n5.t(j16), str);
                            }
                            textView7.setText(org.telegram.messenger.g0.W2(a02));
                            linearLayout.addView(textView7, c8.na.t(-1, -2, 48, 24, 4, 24, 4));
                            dy0 dy0Var = new dy0(o0Var.getContext(), o0Var.J0);
                            final long P1 = mp.u1(o0Var.f30223a).P1(j16);
                            final cg.a h10 = cg.a.h(P1, bVar5);
                            dy0Var.e(gd.N0(2131749686, null), pb.b1(z11, gd.a0(null, null, 2131749722, d), 0.8f, null), null, null);
                            int i18 = (P1 > 0L ? 1 : (P1 == 0L ? 0 : -1));
                            if (i18 > 0) {
                                i14 = 0;
                                dy0Var.e(gd.N0(2131749687, null), pb.b1(false, gd.a0(null, null, 2131749722, h10.d()), 0.8f, null), null, null);
                            } else {
                                i14 = 0;
                            }
                            dy0Var.e(gd.N0(2131749688, null), gd.G(o0Var.C1 / 3600, "GiftOfferHours", new Object[i14]), null, null);
                            linearLayout.addView(dy0Var, c8.na.t(-1, -2, 48, 23, 16, 23, 4));
                            zy.C(o0Var.f30223a);
                            long E = zy.E();
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                            if (i18 == 0) {
                                spannableStringBuilder.append((CharSequence) pb.V0(gd.a0(null, null, 2131749694, d), z11));
                                z12 = z11;
                                j14 = E;
                                i15 = 0;
                            } else if (z11) {
                                spannableStringBuilder.append(gd.V(null, null, 2131749693, pb.V0(gd.a0(null, null, 2131749692, d), true), pb.T0(gd.a0(null, null, 2131749692, h10.d()))));
                                z12 = z11;
                                j14 = E;
                                i15 = 0;
                            } else {
                                z12 = z11;
                                j14 = E;
                                i15 = 0;
                                spannableStringBuilder.append((CharSequence) pb.T0(gd.a0(null, null, 2131749694, cg.a.j(o0Var.B1.f5267b + h10.f5267b, bVar5).d())));
                            }
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(i15, o0Var.getContext(), o0Var.J0);
                            alertDialog$Builder.o(linearLayout);
                            final boolean z13 = z12;
                            final long j17 = j14;
                            alertDialog$Builder.k(spannableStringBuilder, new org.telegram.ui.ActionBar.q1() {
                                @Override
                                public final void i(org.telegram.ui.ActionBar.t1 t1Var, int i19) {
                                    cg.a aVar3;
                                    cg.a j18;
                                    long j19 = P1;
                                    int i20 = (j19 > 0L ? 1 : (j19 == 0L ? 0 : -1));
                                    o0 o0Var2 = o0.this;
                                    if (i20 > 0) {
                                        int i21 = o0Var2.f30223a;
                                        cg.b bVar7 = cg.b.f5268a;
                                        y8 x11 = y8.x(i21, bVar7);
                                        if (x11.f10049e) {
                                            aVar3 = cg.a.m(x11.p());
                                        } else {
                                            aVar3 = null;
                                        }
                                        if (z13) {
                                            j18 = cg.a.h(j19, bVar7);
                                        } else {
                                            j18 = cg.a.j(o0Var2.B1.f5267b + h10.f5267b, bVar7);
                                        }
                                        if (aVar3 == null || aVar3.f5267b < j18.f5267b) {
                                            new fb(o0Var2.getContext(), o0Var2.J0, j18.a(), 14, null, null, o0Var2.f9394p1).show();
                                            return;
                                        }
                                    }
                                    vf.b h11 = t1Var.h(-1, true, true);
                                    h11.d();
                                    TL_payments.TL_sendStarGiftOffer tL_sendStarGiftOffer = new TL_payments.TL_sendStarGiftOffer();
                                    tL_sendStarGiftOffer.price = o0Var2.B1.q();
                                    tL_sendStarGiftOffer.peer = mp.u1(o0Var2.f30223a).l1(o0Var2.f9394p1);
                                    tL_sendStarGiftOffer.duration = o0Var2.C1;
                                    tL_sendStarGiftOffer.slug = o0Var2.n1.slug;
                                    tL_sendStarGiftOffer.random_id = j17;
                                    if (i20 > 0) {
                                        tL_sendStarGiftOffer.flags |= 1;
                                        tL_sendStarGiftOffer.allow_paid_stars = j19;
                                    }
                                    ConnectionsManager.getInstance(o0Var2.f30223a).sendRequestTyped(tL_sendStarGiftOffer, new bi.h0(o0Var2, h11, t1Var, 3));
                                }
                            });
                            alertDialog$Builder.h(gd.N0(2131752577, null), null);
                            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
                            t1Var.Y0 = true;
                            t1Var.show();
                            return;
                        }
                    }
                    cg.a aVar3 = o0Var.B1;
                    cg.b bVar7 = aVar3.f5266a;
                    Context context2 = context;
                    org.telegram.ui.ActionBar.i6 i6Var2 = i6Var;
                    if (bVar7 == bVar5) {
                        new fb(context2, i6Var2, aVar3.a(), 14, null, null, j3).show();
                    } else if (bVar7 == bVar6) {
                        new ii.s(context2, i6Var2, aVar3, true, null).show();
                    }
                }
            }
        });
        g10.addView(g11, c8.na.k(12.0f, 22.0f, 12.0f, 12.0f, -1, 48));
        this.O = g10;
        b bVar5 = new b(i7, context, i6Var);
        this.f9392m1 = bVar5;
        c8.sa.a(bVar5);
        bVar5.setOnClickListener(new ah.h(this, context, i6Var, 6));
        this.f30229c.addView(bVar5, c8.na.d(-2, -2.0f, 49, 0.0f, (org.telegram.messenger.g0.f24220m / org.telegram.messenger.g0.f24225p) + 8.0f, 0.0f, 0.0f));
        K0(cg.a.j(0L, bVar), false, true, false);
        L0(86400, false);
        editTextBoldCursor.addTextChangedListener(new n0(this));
    }

    public final void J0(boolean z10) {
        boolean z11;
        if (this.D1 == 0 && this.B1.f5267b > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        hi.e eVar = this.f9401w1;
        if (eVar.f14340e0 != z11) {
            eVar.setEnabled(z11);
            eVar.setClickable(z11);
            float f10 = 0.6f;
            if (z10) {
                ViewPropertyAnimator animate = eVar.animate();
                if (z11) {
                    f10 = 1.0f;
                }
                m10.n(animate, f10, 180L);
                return;
            }
            if (z11) {
                f10 = 1.0f;
            }
            eVar.setAlpha(f10);
        }
    }

    public final void K0(cg.a aVar, boolean z10, boolean z11, boolean z12) {
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        int i7;
        int i10;
        int i11;
        int i12;
        boolean z17;
        int i13;
        int i14;
        int i15;
        ?? r19;
        boolean z18;
        String E;
        kq[] kqVarArr;
        double d;
        boolean z19;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        int i16;
        cg.a aVar2 = this.B1;
        int i17 = this.D1;
        this.D1 = 0;
        if (aVar != null) {
            this.B1 = aVar;
        } else {
            this.B1 = cg.a.j(0L, aVar2.f5266a);
            this.D1 |= 1;
        }
        cg.b bVar = this.B1.f5266a;
        cb.c cVar = this.A1;
        q4.q[] qVarArr = (q4.q[]) cVar.f5146b;
        long j3 = ((cg.a) ((q4.q[]) cVar.f5146b)[bVar.ordinal()].f55950c).f5267b;
        cg.a aVar3 = this.B1;
        if (j3 < aVar3.f5267b) {
            this.D1 |= 4;
        }
        if (!aVar3.l() && ((cg.a) qVarArr[this.B1.f5266a.ordinal()].f55949b).f5267b > this.B1.f5267b) {
            this.D1 |= 2;
        }
        if (!z11 && aVar2.f5266a == this.B1.f5266a) {
            z13 = false;
        } else {
            z13 = true;
        }
        if (!z11 && aVar2.f5267b == this.B1.f5267b) {
            z14 = false;
        } else {
            z14 = true;
        }
        if (!z11 && i17 == this.D1) {
            z15 = false;
        } else {
            z15 = true;
        }
        cg.b bVar2 = cg.b.f5268a;
        cg.b bVar3 = cg.b.f5269b;
        EditTextBoldCursor editTextBoldCursor = this.f9397s1;
        if (z13) {
            m30 m30Var = this.f9395q1;
            if (m30Var != null) {
                if (this.B1.f5266a == bVar2) {
                    i16 = 0;
                } else {
                    i16 = 1;
                }
                m30Var.a(i16, z12);
            }
            String t6 = org.telegram.messenger.n5.t(this.f9394p1);
            cg.b bVar4 = this.B1.f5266a;
            TextView textView = this.f9400v1;
            if (bVar4 == bVar2) {
                org.telegram.messenger.f3.q(null, null, 2131749711, new Object[]{t6}, textView);
                editTextBoldCursor.setInputType(2);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(((cg.a) qVarArr[this.B1.f5266a.ordinal()].f55950c).a()).length())});
            } else if (bVar4 == bVar3) {
                org.telegram.messenger.f3.q(null, null, 2131749710, new Object[]{t6}, textView);
                editTextBoldCursor.setInputType(8194);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(((cg.a) qVarArr[this.B1.f5266a.ordinal()].f55950c).a()).length() + 3)});
            }
            ImageView imageView = this.f9404z1;
            ImageView imageView2 = this.f9403y1;
            if (z12) {
                ViewPropertyAnimator animate = imageView2.animate();
                if (this.B1.f5266a == bVar2) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                ViewPropertyAnimator alpha = animate.alpha(f12);
                if (this.B1.f5266a == bVar2) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                ViewPropertyAnimator scaleX = alpha.scaleX(f13);
                if (this.B1.f5266a == bVar2) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                ViewPropertyAnimator scaleY = scaleX.scaleY(f14);
                z19 = false;
                i7 = 1;
                scaleY.setDuration(180L).start();
                ViewPropertyAnimator animate2 = imageView.animate();
                if (this.B1.f5266a == bVar3) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.0f;
                }
                ViewPropertyAnimator alpha2 = animate2.alpha(f15);
                if (this.B1.f5266a == bVar3) {
                    f16 = 1.0f;
                } else {
                    f16 = 0.0f;
                }
                ViewPropertyAnimator scaleX2 = alpha2.scaleX(f16);
                if (this.B1.f5266a == bVar3) {
                    f17 = 1.0f;
                } else {
                    f17 = 0.0f;
                }
                scaleX2.scaleY(f17).setDuration(180L).start();
            } else {
                z19 = false;
                i7 = 1;
                if (this.B1.f5266a == bVar2) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                imageView2.setAlpha(f10);
                if (this.B1.f5266a == bVar3) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                imageView.setAlpha(f11);
            }
            b bVar5 = this.f9392m1;
            z16 = z19;
            if (bVar5 != null) {
                cg.b bVar6 = this.B1.f5266a;
                z16 = z19;
                if (bVar5.f8497e != bVar6) {
                    bVar5.f8497e = bVar6;
                    bVar5.b();
                    z16 = z19;
                }
            }
        } else {
            z16 = false;
            i7 = 1;
        }
        if (!z13 && !z15) {
            r19 = z16;
        } else {
            if (this.B1.f5266a == bVar2) {
                i10 = 2131749681;
            } else {
                i10 = 2131749673;
            }
            this.f9396r1.setText(gd.N0(i10, null));
            cg.b bVar7 = this.B1.f5266a;
            int i18 = this.D1;
            int i19 = i18 & 4;
            String str = this.f9393o1;
            boolean z20 = z16;
            TextView textView2 = this.f9398t1;
            if (i19 != 0) {
                if (bVar7 == bVar2) {
                    i15 = 2131749679;
                } else {
                    i15 = 2131749671;
                }
                String d2 = ((cg.a) qVarArr[bVar7.ordinal()].f55950c).o(2).d();
                Object[] objArr = new Object[2];
                objArr[z20 ? 1 : 0] = d2;
                objArr[i7] = str;
                org.telegram.messenger.f3.q(null, null, i15, objArr, textView2);
            } else if ((i18 & 2) != 0) {
                if (bVar7 == bVar2) {
                    i12 = 2131749678;
                } else {
                    i12 = 2131749670;
                }
                String d10 = ((cg.a) qVarArr[bVar7.ordinal()].f55949b).p().d();
                Object[] objArr2 = new Object[2];
                objArr2[z20 ? 1 : 0] = d10;
                objArr2[i7] = str;
                org.telegram.messenger.f3.q(null, null, i12, objArr2, textView2);
            } else {
                if (bVar7 == bVar2) {
                    i11 = 2131749680;
                } else {
                    i11 = 2131749672;
                }
                Object[] objArr3 = new Object[i7];
                objArr3[z20 ? 1 : 0] = str;
                org.telegram.messenger.f3.q(null, null, i11, objArr3, textView2);
            }
            if ((this.D1 & (-9)) != 0) {
                z17 = true;
            } else {
                z17 = z20 ? 1 : 0;
            }
            if (z17) {
                i13 = org.telegram.ui.ActionBar.n6.f29692q7;
            } else {
                i13 = org.telegram.ui.ActionBar.n6.f29843y6;
            }
            org.telegram.ui.ActionBar.u6.U(textView2, i13, this.J0);
            if (z17) {
                i14 = org.telegram.ui.ActionBar.n6.f29692q7;
            } else {
                i14 = org.telegram.ui.ActionBar.n6.G6;
            }
            org.telegram.ui.ActionBar.u6.U(editTextBoldCursor, i14, this.J0);
            r19 = z20;
        }
        if (z13 || z14 || z15) {
            cg.a aVar4 = this.B1;
            if (aVar4.f5266a == bVar3) {
                z18 = true;
            } else {
                z18 = r19;
            }
            if (z18) {
                E = aVar4.b();
            } else {
                E = gd.E(aVar4.a(), ',');
            }
            Object[] objArr4 = new Object[1];
            objArr4[r19] = E;
            String a02 = gd.a0(null, null, 2131749715, objArr4);
            if (z18) {
                kqVarArr = this.G1;
            } else {
                kqVarArr = this.F1;
            }
            this.f9401w1.i(pb.t1(pb.Z0(z18, a02, kqVarArr), z18), z12, true);
            J0(z12);
        }
        if (z13 || z14) {
            StringBuilder sb2 = new StringBuilder(10);
            sb2.append('~');
            if (this.B1.f5266a == bVar3) {
                d = ((org.telegram.messenger.i0) mp.u1(this.f30223a).A7.f26246l.f13936b).f24630a;
            } else {
                d = mp.u1(this.f30223a).f25743f6 * 1.0E-5d;
            }
            org.telegram.messenger.r1.i().getClass();
            sb2.append(org.telegram.messenger.r1.g("USD", 2, (long) (this.B1.c() * d * 100.0d), r19));
            this.f9402x1.c(sb2, z12, true);
        }
        if (z10 && z14) {
            String b10 = this.B1.b();
            editTextBoldCursor.setText(b10);
            editTextBoldCursor.setSelection(b10.length());
        }
    }

    public final void L0(int i7, boolean z10) {
        if (this.C1 != i7) {
            this.C1 = i7;
            String G = gd.G(i7 / 3600, "GiftOfferHours", new Object[0]);
            TextView textView = this.f9399u1;
            textView.setText(G);
            Drawable mutate = getContext().getResources().getDrawable(2131230873).mutate();
            mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29651o6, this.J0), PorterDuff.Mode.SRC_IN));
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, mutate, (Drawable) null);
        }
        J0(z10);
    }

    @Override
    public final void show() {
        super.show();
        org.telegram.messenger.g0.h3(new ca.r(this, 11), 50L);
    }
}
