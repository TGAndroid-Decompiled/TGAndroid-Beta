package ci;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import b8.mf;
import b8.pf;
import java.util.ArrayList;
import org.telegram.messenger.bd;
import org.telegram.messenger.hp;
import org.telegram.messenger.yy;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.gb0;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.rx0;
import org.telegram.ui.Components.sj0;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.x20;
public final class t0 extends org.telegram.ui.Components.ma {
    public static final int[] f5995q2 = {21600, 43200, 86400, 129600, 172800, 259200};
    public int Q1;
    public final c R1;
    public final TL_stars.TL_starGiftUnique S1;
    public final String T1;
    public final long U1;
    public final x20 V1;
    public final gb0 W1;
    public final EditTextBoldCursor X1;
    public final TextView Y1;
    public final r0 Z1;
    public final TextView f5996a2;
    public final gi.d f5997b2;
    public final org.telegram.ui.Components.h6 c2;
    public final ImageView f5998d2;
    public final ImageView f5999e2;
    public final bb.c f6000f2;
    public dg.a f6001g2;
    public int f6002h2;
    public int f6003i2;
    public boolean f6004j2;
    public final s1 f6005k2;
    public final wp[] f6006l2;
    public final wp[] f6007m2;
    public boolean f6008n2;
    public f41 f6009o2;
    public final r31 f6010p2;

    public t0(final Context context, final int i3, final long j10, TL_stars.TL_starGiftUnique tL_starGiftUnique, final org.telegram.ui.ActionBar.e6 e6Var, s1 s1Var) {
        super(context, null, true, false, 2, e6Var);
        float f10;
        org.telegram.ui.ActionBar.e6 e6Var2;
        bb.c cVar = new bb.c(17);
        tf.b[] bVarArr = (tf.b[]) cVar.f3211b;
        this.f6000f2 = cVar;
        this.f6006l2 = new wp[1];
        this.f6007m2 = new wp[1];
        this.D1 = false;
        this.C1 = org.telegram.messenger.g0.L(12.0f);
        this.f36108s1 = 0.2f;
        this.U1 = j10;
        this.S1 = tL_starGiftUnique;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(tL_starGiftUnique.title);
        sb2.append(" #");
        this.T1 = k2.p1.l(tL_starGiftUnique.num, ',', sb2);
        this.f6005k2 = s1Var;
        this.E = true;
        this.Q0 = true;
        boolean j11 = e9.y(i3, true).j();
        if (j10 > 0 && hp.s1(i3).b2(j10) == null) {
            f10 = 12.0f;
            TLRPC.User a22 = hp.s1(i3).a2(Long.valueOf(j10));
            if (a22 != null) {
                hp.s1(i3).W2(a22, 0, false, null);
            }
        } else {
            f10 = 12.0f;
        }
        org.telegram.messenger.p0 p0Var = hp.s1(i3).f23167x7;
        dg.b bVar = dg.b.f8925a;
        dg.a g7 = dg.a.g(tL_starGiftUnique.offer_min_stars, bVar);
        dg.a g10 = dg.a.g(Math.max(g7.a() * 2, ((org.telegram.messenger.j0) p0Var.f24672q.f13798b).f23620c), bVar);
        dg.b bVar2 = dg.b.f8926b;
        dg.a i10 = dg.a.i(Math.max(g7.e(bVar2).n(2).f8924b, ((org.telegram.messenger.l0) p0Var.f24673r.f13688b).f23921c), bVar2);
        dg.a i11 = dg.a.i(Math.max(i10.f8924b * 2, ((org.telegram.messenger.l0) p0Var.f24674s.f13688b).f23921c), bVar2);
        dg.b bVar3 = g7.f8923a;
        if (bVar3 == g10.f8923a) {
            bVarArr[bVar3.ordinal()] = new tf.b(g7, g10);
        }
        dg.b bVar4 = i10.f8923a;
        if (bVar4 == i11.f8923a) {
            bVarArr[bVar4.ordinal()] = new tf.b(i10, i11);
        }
        c cVar2 = new c(i3, context, e6Var);
        this.R1 = cVar2;
        cVar2.setScaleX(0.6f);
        cVar2.setScaleY(0.6f);
        cVar2.setAlpha(0.0f);
        cVar2.setEnabled(false);
        cVar2.setClickable(false);
        this.f28589c.addView(cVar2, mf.d(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
        pf.a(cVar2);
        cVar2.setOnClickListener(new ai.h(this, context, e6Var, 6));
        P(org.telegram.ui.ActionBar.k6.f27954h5);
        this.Q1 = this.H0;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setClickable(true);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(0, org.telegram.messenger.g0.L(f10), 0, org.telegram.messenger.g0.L(16.0f));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.X1 = editTextBoldCursor;
        if (j11) {
            x20 x20Var = new x20(context, e6Var);
            this.V1 = x20Var;
            ArrayList arrayList = new ArrayList();
            arrayList.add(bd.M0(2131744387, null));
            arrayList.add(bd.M0(2131744386, null));
            x20Var.b(arrayList, new p0(this, 0));
            linearLayout.addView(x20Var, mf.k(18.0f, 0.0f, 18.0f, 18.0f, -1, -2));
            e6Var2 = null;
        } else {
            e6Var2 = null;
            this.V1 = null;
        }
        LinearLayout f11 = org.telegram.messenger.k5.f(context, 1);
        linearLayout.addView(f11, mf.l(1.0f, -1, -2));
        gb0 gb0Var = new gb0(context, e6Var2);
        this.W1 = gb0Var;
        editTextBoldCursor.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setImeOptions(268435462);
        editTextBoldCursor.setTextSize(1, 17.0f);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setPadding(org.telegram.messenger.g0.L(42.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
        int i12 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.V(editTextBoldCursor, i12, null);
        editTextBoldCursor.requestFocus();
        gb0Var.setLeftPadding(org.telegram.messenger.g0.L(28.0f));
        gb0Var.e(editTextBoldCursor);
        gb0Var.b(1.0f, 0.0f, false);
        gb0Var.setForceUseCenter2(true);
        editTextBoldCursor.setOnFocusChangeListener(new m(this, 1));
        gb0Var.addView(editTextBoldCursor, mf.e(-1, -2, 48));
        f11.addView(gb0Var, mf.k(18.0f, 0.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView = new ImageView(context);
        this.f5998d2 = imageView;
        imageView.setImageResource(2131232750);
        gb0Var.addView(imageView, mf.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f5999e2 = imageView2;
        imageView2.setImageResource(2131231957);
        gb0Var.addView(imageView2, mf.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(context, false, false, false);
        this.c2 = h6Var;
        int i13 = org.telegram.ui.ActionBar.k6.f28273y6;
        org.telegram.ui.ActionBar.r6.Z(h6Var, i13, null);
        h6Var.setTextSize(org.telegram.messenger.g0.L(13.0f));
        h6Var.setGravity(5);
        gb0Var.addView(h6Var, mf.d(-2, -1.0f, 21, 0.0f, 0.0f, 16.0f, 0.0f));
        TextView textView = new TextView(context);
        this.Y1 = textView;
        textView.setTextSize(1, 13.0f);
        f11.addView(textView, mf.t(-1, -2, 55, 33, 4, 33, 0));
        ?? editTextBoldCursor2 = new EditTextBoldCursor(context);
        this.Z1 = editTextBoldCursor2;
        editTextBoldCursor2.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        editTextBoldCursor2.setCursorWidth(1.5f);
        editTextBoldCursor2.setTextSize(1, 17.0f);
        editTextBoldCursor2.setMaxLines(1);
        editTextBoldCursor2.setBackground(null);
        editTextBoldCursor2.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
        org.telegram.ui.ActionBar.r6.V(editTextBoldCursor2, i12, null);
        editTextBoldCursor2.setFocusable(false);
        editTextBoldCursor2.setClickable(false);
        editTextBoldCursor2.setEnabled(false);
        gb0 gb0Var2 = new gb0(context, null);
        gb0Var2.setText(bd.M0(2131749738, null));
        gb0Var2.e(editTextBoldCursor2);
        gb0Var2.addView((View) editTextBoldCursor2, mf.d(-1, -2.0f, 48, 0.0f, 0.0f, 48.0f, 0.0f));
        pf.b(gb0Var2, 0.02f, 1.2f);
        gb0Var2.setOnClickListener(new ai.d(6, this, context));
        f11.addView(gb0Var2, mf.k(18.0f, 18.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView3 = new ImageView(context);
        imageView3.setImageResource(2131230871);
        org.telegram.ui.ActionBar.r6.t(imageView3, org.telegram.ui.ActionBar.k6.W5, e6Var, PorterDuff.Mode.SRC_IN);
        gb0Var2.addView(imageView3, mf.d(24, 24.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.f5996a2 = textView2;
        org.telegram.ui.ActionBar.r6.V(textView2, i13, null);
        textView2.setTextSize(1, 13.0f);
        f11.addView(textView2, mf.t(-1, -2, 55, 33, 4, 33, 0));
        gi.d dVar = new gi.d(context, e6Var, true);
        this.f5997b2 = dVar;
        dVar.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                dg.a aVar;
                String str;
                boolean z10;
                String a02;
                int i14;
                boolean z11;
                long j12;
                int i15;
                final t0 t0Var = t0.this;
                if (t0Var.f5997b2.f12517d0) {
                    int i16 = i3;
                    if (hp.s1(i16).v2()) {
                        org.telegram.ui.b.b(i16);
                        return;
                    }
                    e9 x10 = e9.x(i16, t0Var.f6001g2.f8923a);
                    if (x10.f5032e) {
                        aVar = dg.a.l(x10.p());
                    } else {
                        aVar = null;
                    }
                    dg.b bVar5 = dg.b.f8925a;
                    dg.b bVar6 = dg.b.f8926b;
                    if (aVar != null) {
                        long j13 = aVar.f8924b;
                        dg.a aVar2 = t0Var.f6001g2;
                        if (j13 >= aVar2.f8924b) {
                            String str2 = t0Var.T1;
                            long j14 = t0Var.U1;
                            String d = aVar2.d();
                            if (t0Var.f6001g2.f8923a == bVar6) {
                                str = str2;
                                z10 = true;
                            } else {
                                str = str2;
                                z10 = false;
                            }
                            LinearLayout linearLayout2 = new LinearLayout(t0Var.getContext());
                            linearLayout2.setOrientation(1);
                            TextView textView3 = new TextView(t0Var.getContext());
                            textView3.setText(bd.M0(2131749740, null));
                            int i17 = org.telegram.ui.ActionBar.k6.f27988j5;
                            org.telegram.messenger.k5.n(textView3, i17, t0Var.J0, 1, 20.0f);
                            linearLayout2.addView(textView3, mf.t(-1, -2, 48, 24, 4, 24, 14));
                            TextView textView4 = new TextView(t0Var.getContext());
                            org.telegram.ui.ActionBar.r6.V(textView4, i17, t0Var.J0);
                            textView4.setTextSize(1, 16.0f);
                            if (t0Var.f6001g2.f8923a == bVar5) {
                                a02 = bd.a0(null, null, 2131749691, d, org.telegram.messenger.m5.t(j14), str);
                            } else {
                                a02 = bd.a0(null, null, 2131749690, d, org.telegram.messenger.m5.t(j14), str);
                            }
                            textView4.setText(org.telegram.messenger.g0.X2(a02));
                            linearLayout2.addView(textView4, mf.t(-1, -2, 48, 24, 4, 24, 4));
                            rx0 rx0Var = new rx0(t0Var.getContext(), t0Var.J0);
                            final long N1 = hp.s1(t0Var.f28583a).N1(j14);
                            final dg.a g11 = dg.a.g(N1, bVar5);
                            rx0Var.c(bd.M0(2131749712, null), wb.a1(z10, bd.a0(null, null, 2131749748, d), 0.8f, null), null, null);
                            int i18 = (N1 > 0L ? 1 : (N1 == 0L ? 0 : -1));
                            if (i18 > 0) {
                                i14 = 0;
                                rx0Var.c(bd.M0(2131749713, null), wb.a1(false, bd.a0(null, null, 2131749748, g11.d()), 0.8f, null), null, null);
                            } else {
                                i14 = 0;
                            }
                            rx0Var.c(bd.M0(2131749714, null), bd.G(t0Var.f6002h2 / 3600, "GiftOfferHours", new Object[i14]), null, null);
                            linearLayout2.addView(rx0Var, mf.t(-1, -2, 48, 23, 16, 23, 4));
                            yy.C(t0Var.f28583a);
                            long E = yy.E();
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                            if (i18 == 0) {
                                spannableStringBuilder.append((CharSequence) wb.V0(bd.a0(null, null, 2131749720, d), z10));
                                z11 = z10;
                                j12 = E;
                                i15 = 0;
                            } else if (z10) {
                                spannableStringBuilder.append(bd.V(null, null, 2131749719, wb.V0(bd.a0(null, null, 2131749718, d), true), wb.T0(bd.a0(null, null, 2131749718, g11.d()))));
                                z11 = z10;
                                j12 = E;
                                i15 = 0;
                            } else {
                                z11 = z10;
                                j12 = E;
                                i15 = 0;
                                spannableStringBuilder.append((CharSequence) wb.T0(bd.a0(null, null, 2131749720, dg.a.i(t0Var.f6001g2.f8924b + g11.f8924b, bVar5).d())));
                            }
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(i15, t0Var.getContext(), t0Var.J0);
                            alertDialog$Builder.o(linearLayout2);
                            final boolean z12 = z11;
                            final long j15 = j12;
                            alertDialog$Builder.k(spannableStringBuilder, new org.telegram.ui.ActionBar.p1() {
                                @Override
                                public final void g(org.telegram.ui.ActionBar.s1 s1Var2, int i19) {
                                    dg.a aVar3;
                                    dg.a i20;
                                    long j16 = N1;
                                    int i21 = (j16 > 0L ? 1 : (j16 == 0L ? 0 : -1));
                                    t0 t0Var2 = t0.this;
                                    if (i21 > 0) {
                                        int i22 = t0Var2.f28583a;
                                        dg.b bVar7 = dg.b.f8925a;
                                        e9 x11 = e9.x(i22, bVar7);
                                        if (x11.f5032e) {
                                            aVar3 = dg.a.l(x11.p());
                                        } else {
                                            aVar3 = null;
                                        }
                                        if (z12) {
                                            i20 = dg.a.g(j16, bVar7);
                                        } else {
                                            i20 = dg.a.i(t0Var2.f6001g2.f8924b + g11.f8924b, bVar7);
                                        }
                                        if (aVar3 == null || aVar3.f8924b < i20.f8924b) {
                                            new mb(t0Var2.getContext(), t0Var2.J0, i20.a(), 14, null, null, t0Var2.U1).show();
                                            return;
                                        }
                                    }
                                    sf.b h = s1Var2.h(-1, true, true);
                                    h.d();
                                    TL_payments.TL_sendStarGiftOffer tL_sendStarGiftOffer = new TL_payments.TL_sendStarGiftOffer();
                                    tL_sendStarGiftOffer.price = t0Var2.f6001g2.o();
                                    tL_sendStarGiftOffer.peer = hp.s1(t0Var2.f28583a).j1(t0Var2.U1);
                                    tL_sendStarGiftOffer.duration = t0Var2.f6002h2;
                                    tL_sendStarGiftOffer.slug = t0Var2.S1.slug;
                                    tL_sendStarGiftOffer.random_id = j15;
                                    if (i21 > 0) {
                                        tL_sendStarGiftOffer.flags |= 1;
                                        tL_sendStarGiftOffer.allow_paid_stars = j16;
                                    }
                                    ConnectionsManager.getInstance(t0Var2.f28583a).sendRequestTyped(tL_sendStarGiftOffer, new ai.n0(t0Var2, h, s1Var2, 2));
                                }
                            });
                            alertDialog$Builder.h(bd.M0(2131752589, null), null);
                            org.telegram.ui.ActionBar.s1 s1Var2 = alertDialog$Builder.f27343a;
                            s1Var2.f28525a1 = true;
                            s1Var2.show();
                            return;
                        }
                    }
                    dg.a aVar3 = t0Var.f6001g2;
                    dg.b bVar7 = aVar3.f8923a;
                    Context context2 = context;
                    org.telegram.ui.ActionBar.e6 e6Var3 = e6Var;
                    if (bVar7 == bVar5) {
                        new mb(context2, e6Var3, aVar3.a(), 14, null, null, j10).show();
                    } else if (bVar7 == bVar6) {
                        new hi.f(context2, e6Var3, aVar3, true, null).show();
                    }
                }
            }
        });
        f1(dg.a.i(0L, bVar), false, true, false);
        if (this.f6002h2 != 86400) {
            this.f6002h2 = 86400;
            editTextBoldCursor2.setText(bd.G(24, "GiftOfferHours", new Object[0]));
        }
        e1(false);
        editTextBoldCursor.addTextChangedListener(new s0(this));
        FrameLayout.LayoutParams d = mf.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f);
        int i14 = d.leftMargin;
        int i15 = this.f28618u0;
        d.leftMargin = i14 + i15;
        d.rightMargin += i15;
        this.f28586b.addView(dVar, d);
        tj0 tj0Var = this.f36102l1;
        int i16 = this.f28618u0;
        tj0Var.setPadding(i16, 0, i16, org.telegram.messenger.g0.L(64.0f));
        this.f36102l1.setOverScrollMode(2);
        this.f6010p2 = r31.k(linearLayout);
        this.f6009o2.O(false);
    }

    @Override
    public final sj0 L0(tj0 tj0Var) {
        f41 f41Var = new f41(this.f36102l1, getContext(), this.f28583a, 0, true, new ai.c(this, 14), this.J0);
        this.f6009o2 = f41Var;
        f41Var.f33698r = false;
        return f41Var;
    }

    @Override
    public final CharSequence O0() {
        return bd.M0(2131749694, null);
    }

    @Override
    public final boolean X(float f10, float f11) {
        c cVar;
        if (this.f6004j2 && (cVar = this.R1) != null && f10 >= cVar.getX() && f10 <= cVar.getX() + cVar.getWidth() && f11 >= cVar.getY() && f11 <= cVar.getY() + cVar.getHeight()) {
            return false;
        }
        return super.X(f10, f11);
    }

    public final void d1() {
        boolean z10;
        float f10;
        boolean z11 = this.f6008n2;
        c cVar = this.R1;
        if ((z11 && !this.J && cVar != null && this.f28586b.getY() > org.telegram.messenger.g0.L(32.0f)) || this.V1 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f6004j2 != z10) {
            this.f6004j2 = z10;
            if (cVar != null) {
                cVar.setEnabled(z10);
                cVar.setClickable(z10);
                ViewPropertyAnimator animate = cVar.animate();
                float f11 = 0.6f;
                float f12 = 1.0f;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.6f;
                }
                ViewPropertyAnimator scaleX = animate.scaleX(f10);
                if (z10) {
                    f11 = 1.0f;
                }
                ViewPropertyAnimator scaleY = scaleX.scaleY(f11);
                if (!z10) {
                    f12 = 0.0f;
                }
                org.telegram.messenger.camera.q.k(scaleY, f12, 180L);
            }
        }
    }

    public final void e1(boolean z10) {
        boolean z11;
        if (this.f6003i2 == 0 && this.f6001g2.f8924b > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        gi.d dVar = this.f5997b2;
        if (dVar.f12517d0 != z11) {
            dVar.setEnabled(z11);
            dVar.setClickable(z11);
            float f10 = 0.6f;
            if (z10) {
                ViewPropertyAnimator animate = dVar.animate();
                if (z11) {
                    f10 = 1.0f;
                }
                org.telegram.messenger.camera.q.k(animate, f10, 180L);
                return;
            }
            if (z11) {
                f10 = 1.0f;
            }
            dVar.setAlpha(f10);
        }
    }

    public final void f1(dg.a aVar, boolean z10, boolean z11, boolean z12) {
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        int i3;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        ?? r19;
        boolean z17;
        String E;
        wp[] wpVarArr;
        double d;
        boolean z18;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        int i15;
        dg.a aVar2 = this.f6001g2;
        int i16 = this.f6003i2;
        this.f6003i2 = 0;
        if (aVar != null) {
            this.f6001g2 = aVar;
        } else {
            this.f6001g2 = dg.a.i(0L, aVar2.f8923a);
            this.f6003i2 |= 1;
        }
        dg.b bVar = this.f6001g2.f8923a;
        bb.c cVar = this.f6000f2;
        tf.b[] bVarArr = (tf.b[]) cVar.f3211b;
        long j10 = ((dg.a) ((tf.b[]) cVar.f3211b)[bVar.ordinal()].f55095b).f8924b;
        dg.a aVar3 = this.f6001g2;
        if (j10 < aVar3.f8924b) {
            this.f6003i2 |= 4;
        }
        if (!aVar3.k() && ((dg.a) bVarArr[this.f6001g2.f8923a.ordinal()].f55094a).f8924b > this.f6001g2.f8924b) {
            this.f6003i2 |= 2;
        }
        if (!z11 && aVar2.f8923a == this.f6001g2.f8923a) {
            z13 = false;
        } else {
            z13 = true;
        }
        if (!z11 && aVar2.f8924b == this.f6001g2.f8924b) {
            z14 = false;
        } else {
            z14 = true;
        }
        if (!z11 && i16 == this.f6003i2) {
            z15 = false;
        } else {
            z15 = true;
        }
        dg.b bVar2 = dg.b.f8925a;
        EditTextBoldCursor editTextBoldCursor = this.X1;
        dg.b bVar3 = dg.b.f8926b;
        if (z13) {
            x20 x20Var = this.V1;
            if (x20Var != null) {
                if (this.f6001g2.f8923a == bVar2) {
                    i15 = 0;
                } else {
                    i15 = 1;
                }
                x20Var.a(i15, z12);
            }
            String t10 = org.telegram.messenger.m5.t(this.U1);
            dg.b bVar4 = this.f6001g2.f8923a;
            TextView textView = this.f5996a2;
            if (bVar4 == bVar2) {
                org.telegram.messenger.k5.r(null, null, 2131749737, new Object[]{t10}, textView);
                editTextBoldCursor.setInputType(2);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(((dg.a) bVarArr[this.f6001g2.f8923a.ordinal()].f55095b).a()).length())});
            } else if (bVar4 == bVar3) {
                org.telegram.messenger.k5.r(null, null, 2131749736, new Object[]{t10}, textView);
                editTextBoldCursor.setInputType(8194);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(((dg.a) bVarArr[this.f6001g2.f8923a.ordinal()].f55095b).a()).length() + 3)});
            }
            ImageView imageView = this.f5999e2;
            ImageView imageView2 = this.f5998d2;
            if (z12) {
                ViewPropertyAnimator animate = imageView2.animate();
                if (this.f6001g2.f8923a == bVar2) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                ViewPropertyAnimator alpha = animate.alpha(f12);
                if (this.f6001g2.f8923a == bVar2) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                ViewPropertyAnimator scaleX = alpha.scaleX(f13);
                if (this.f6001g2.f8923a == bVar2) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                ViewPropertyAnimator scaleY = scaleX.scaleY(f14);
                z18 = false;
                i3 = 1;
                scaleY.setDuration(180L).start();
                ViewPropertyAnimator animate2 = imageView.animate();
                if (this.f6001g2.f8923a == bVar3) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.0f;
                }
                ViewPropertyAnimator alpha2 = animate2.alpha(f15);
                if (this.f6001g2.f8923a == bVar3) {
                    f16 = 1.0f;
                } else {
                    f16 = 0.0f;
                }
                ViewPropertyAnimator scaleX2 = alpha2.scaleX(f16);
                if (this.f6001g2.f8923a == bVar3) {
                    f17 = 1.0f;
                } else {
                    f17 = 0.0f;
                }
                scaleX2.scaleY(f17).setDuration(180L).start();
            } else {
                z18 = false;
                i3 = 1;
                if (this.f6001g2.f8923a == bVar2) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                imageView2.setAlpha(f10);
                if (this.f6001g2.f8923a == bVar3) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                imageView.setAlpha(f11);
            }
            c cVar2 = this.R1;
            z16 = z18;
            if (cVar2 != null) {
                dg.b bVar5 = this.f6001g2.f8923a;
                z16 = z18;
                if (cVar2.f4900e != bVar5) {
                    cVar2.f4900e = bVar5;
                    cVar2.a();
                    z16 = z18;
                }
            }
        } else {
            z16 = false;
            i3 = 1;
        }
        if (!z13 && !z15) {
            r19 = z16;
        } else {
            if (this.f6001g2.f8923a == bVar2) {
                i10 = 2131749707;
            } else {
                i10 = 2131749699;
            }
            this.W1.setText(bd.M0(i10, null));
            dg.b bVar6 = this.f6001g2.f8923a;
            int i17 = this.f6003i2;
            int i18 = i17 & 4;
            String str = this.T1;
            boolean z19 = z16;
            TextView textView2 = this.Y1;
            if (i18 != 0) {
                if (bVar6 == bVar2) {
                    i14 = 2131749705;
                } else {
                    i14 = 2131749697;
                }
                String d10 = ((dg.a) bVarArr[bVar6.ordinal()].f55095b).d();
                Object[] objArr = new Object[2];
                objArr[z19 ? 1 : 0] = d10;
                objArr[i3] = str;
                org.telegram.messenger.k5.r(null, null, i14, objArr, textView2);
            } else if ((i17 & 2) != 0) {
                if (bVar6 == bVar2) {
                    i12 = 2131749704;
                } else {
                    i12 = 2131749696;
                }
                String d11 = ((dg.a) bVarArr[bVar6.ordinal()].f55094a).d();
                Object[] objArr2 = new Object[2];
                objArr2[z19 ? 1 : 0] = d11;
                objArr2[i3] = str;
                org.telegram.messenger.k5.r(null, null, i12, objArr2, textView2);
            } else {
                if (bVar6 == bVar2) {
                    i11 = 2131749706;
                } else {
                    i11 = 2131749698;
                }
                Object[] objArr3 = new Object[i3];
                objArr3[z19 ? 1 : 0] = str;
                org.telegram.messenger.k5.r(null, null, i11, objArr3, textView2);
            }
            if ((this.f6003i2 & (-9)) == 0) {
                i13 = org.telegram.ui.ActionBar.k6.f28273y6;
            } else {
                i13 = org.telegram.ui.ActionBar.k6.f28122q7;
            }
            org.telegram.ui.ActionBar.r6.V(textView2, i13, this.J0);
            r19 = z19;
        }
        if (z13 || z14 || z15) {
            dg.a aVar4 = this.f6001g2;
            if (aVar4.f8923a == bVar3) {
                z17 = true;
            } else {
                z17 = r19;
            }
            if (z17) {
                E = aVar4.b();
            } else {
                E = bd.E(aVar4.a(), ',');
            }
            Object[] objArr4 = new Object[1];
            objArr4[r19] = E;
            String a02 = bd.a0(null, null, 2131749741, objArr4);
            if (z17) {
                wpVarArr = this.f6007m2;
            } else {
                wpVarArr = this.f6006l2;
            }
            this.f5997b2.i(wb.s1(wb.Y0(z17, a02, wpVarArr), z17), z12, true);
            e1(z12);
        }
        if (z13 || z14) {
            StringBuilder sb2 = new StringBuilder(10);
            sb2.append('~');
            if (this.f6001g2.f8923a == bVar3) {
                d = ((org.telegram.messenger.i0) hp.s1(this.f28583a).f23167x7.f24665l.f14429b).f23413a;
            } else {
                d = hp.s1(this.f28583a).f22979c6 * 1.0E-5d;
            }
            org.telegram.messenger.r1.i().getClass();
            sb2.append(org.telegram.messenger.r1.g("USD", 2, (long) (this.f6001g2.c() * d * 100.0d), r19));
            this.c2.c(sb2, z12, true);
        }
        if (z10 && z14) {
            String b10 = this.f6001g2.b();
            editTextBoldCursor.setText(b10);
            editTextBoldCursor.setSelection(b10.length());
        }
    }

    @Override
    public final void g0(float f10) {
        super.g0(f10);
        d1();
    }

    @Override
    public final void s0() {
        int w02;
        super.s0();
        try {
            if (this.H0 == this.Q1 && (w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27954h5, this.J0)) != this.H0) {
                O(w02);
                this.Q1 = this.H0;
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void show() {
        super.show();
        org.telegram.messenger.g0.i3(new ai.s(this, 27), 50L);
    }

    @Override
    public final void v() {
        this.f6008n2 = true;
        d1();
    }
}
