package bi;

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
import java.util.ArrayList;
import org.telegram.messenger.gz;
import org.telegram.messenger.qp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.b30;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.lb0;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.sx0;
import org.telegram.ui.Components.wp;
public final class a1 extends org.telegram.ui.Components.na {
    public static final int[] f3420p2 = {21600, 43200, 86400, 129600, 172800, 259200};
    public int P1;
    public final c Q1;
    public final TL_stars.TL_starGiftUnique R1;
    public final String S1;
    public final long T1;
    public final b30 U1;
    public final lb0 V1;
    public final EditTextBoldCursor W1;
    public final TextView X1;
    public final y0 Y1;
    public final TextView Z1;
    public final fi.d f3421a2;
    public final org.telegram.ui.Components.j6 f3422b2;
    public final ImageView f3423c2;
    public final ImageView d2;
    public final aa.n f3424e2;
    public cg.a f3425f2;
    public int f3426g2;
    public int f3427h2;
    public boolean f3428i2;
    public final z1 f3429j2;
    public final wp[] f3430k2;
    public final wp[] f3431l2;
    public boolean f3432m2;
    public f41 f3433n2;
    public final r31 f3434o2;

    public a1(final Context context, final int i7, final long j3, TL_stars.TL_starGiftUnique tL_starGiftUnique, final org.telegram.ui.ActionBar.f6 f6Var, z1 z1Var) {
        super(context, null, true, false, 2, f6Var);
        float f10;
        boolean z9;
        org.telegram.ui.ActionBar.f6 f6Var2;
        aa.n nVar = new aa.n(8);
        q4.q[] qVarArr = (q4.q[]) nVar.f825b;
        this.f3424e2 = nVar;
        this.f3430k2 = new wp[1];
        this.f3431l2 = new wp[1];
        this.C1 = false;
        this.B1 = org.telegram.messenger.g0.L(12.0f);
        this.f36333r1 = 0.2f;
        this.T1 = j3;
        this.R1 = tL_starGiftUnique;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(tL_starGiftUnique.title);
        sb2.append(" #");
        this.S1 = jg.g.m(tL_starGiftUnique.num, ',', sb2);
        this.f3429j2 = z1Var;
        this.D = true;
        this.P0 = true;
        boolean j10 = ea.y(i7, true).j();
        if (j3 > 0 && qp.s1(i7).b2(j3) == null) {
            f10 = 12.0f;
            TLRPC.User a22 = qp.s1(i7).a2(Long.valueOf(j3));
            if (a22 != null) {
                qp.s1(i7).W2(a22, 0, false, null);
            }
        } else {
            f10 = 12.0f;
        }
        org.telegram.messenger.p0 p0Var = qp.s1(i7).f24927x7;
        cg.b bVar = cg.b.f6162a;
        cg.a g10 = cg.a.g(tL_starGiftUnique.offer_min_stars, bVar);
        cg.a g11 = cg.a.g(Math.max(g10.a() * 2, ((org.telegram.messenger.j0) p0Var.f24445q.f13555b).f23432c), bVar);
        cg.b bVar2 = cg.b.f6163b;
        cg.a i10 = cg.a.i(Math.max(g10.e(bVar2).n(2).f6161b, ((org.telegram.messenger.l0) p0Var.f24446r.f13889b).f23806c), bVar2);
        cg.a i11 = cg.a.i(Math.max(i10.f6161b * 2, ((org.telegram.messenger.l0) p0Var.f24447s.f13889b).f23806c), bVar2);
        cg.b bVar3 = g10.f6160a;
        if (bVar3 != g11.f6160a) {
            z9 = false;
        } else {
            z9 = false;
            qVarArr[bVar3.ordinal()] = new q4.q(g10, g11, false, 13);
        }
        cg.b bVar4 = i10.f6160a;
        if (bVar4 == i11.f6160a) {
            qVarArr[bVar4.ordinal()] = new q4.q(i10, i11, z9, 13);
        }
        c cVar = new c(i7, context, f6Var);
        this.Q1 = cVar;
        cVar.setScaleX(0.6f);
        cVar.setScaleY(0.6f);
        cVar.setAlpha(0.0f);
        cVar.setEnabled(z9);
        cVar.setClickable(z9);
        this.f28618c.addView(cVar, c8.ha.d(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
        c8.ka.a(cVar);
        cVar.setOnClickListener(new ah.g(this, context, f6Var, 1));
        P(org.telegram.ui.ActionBar.k6.f27921h5);
        this.P1 = this.G0;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setClickable(true);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(0, org.telegram.messenger.g0.L(f10), 0, org.telegram.messenger.g0.L(16.0f));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.W1 = editTextBoldCursor;
        if (j10) {
            b30 b30Var = new b30(context, f6Var);
            this.U1 = b30Var;
            ArrayList arrayList = new ArrayList();
            arrayList.add(org.telegram.messenger.hd.M0(2131744378, null));
            arrayList.add(org.telegram.messenger.hd.M0(2131744377, null));
            b30Var.b(arrayList, new w0(this, 0));
            linearLayout.addView(b30Var, c8.ha.k(18.0f, 0.0f, 18.0f, 18.0f, -1, -2));
            f6Var2 = null;
        } else {
            f6Var2 = null;
            this.U1 = null;
        }
        LinearLayout f11 = org.telegram.messenger.k5.f(context, 1);
        linearLayout.addView(f11, c8.ha.l(1.0f, -1, -2));
        lb0 lb0Var = new lb0(context, f6Var2);
        this.V1 = lb0Var;
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
        lb0Var.setLeftPadding(org.telegram.messenger.g0.L(28.0f));
        lb0Var.e(editTextBoldCursor);
        lb0Var.b(1.0f, 0.0f, false);
        lb0Var.setForceUseCenter2(true);
        editTextBoldCursor.setOnFocusChangeListener(new n(this, 1));
        lb0Var.addView(editTextBoldCursor, c8.ha.e(-1, -2, 48));
        f11.addView(lb0Var, c8.ha.k(18.0f, 0.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView = new ImageView(context);
        this.f3423c2 = imageView;
        imageView.setImageResource(2131232752);
        lb0Var.addView(imageView, c8.ha.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.d2 = imageView2;
        imageView2.setImageResource(2131231957);
        lb0Var.addView(imageView2, c8.ha.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(context, false, false, false);
        this.f3422b2 = j6Var;
        int i13 = org.telegram.ui.ActionBar.k6.f28240y6;
        org.telegram.ui.ActionBar.r6.Z(j6Var, i13, null);
        j6Var.setTextSize(org.telegram.messenger.g0.L(13.0f));
        j6Var.setGravity(5);
        lb0Var.addView(j6Var, c8.ha.d(-2, -1.0f, 21, 0.0f, 0.0f, 16.0f, 0.0f));
        TextView textView = new TextView(context);
        this.X1 = textView;
        textView.setTextSize(1, 13.0f);
        f11.addView(textView, c8.ha.t(-1, -2, 55, 33, 4, 33, 0));
        ?? editTextBoldCursor2 = new EditTextBoldCursor(context);
        this.Y1 = editTextBoldCursor2;
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
        lb0 lb0Var2 = new lb0(context, null);
        lb0Var2.setText(org.telegram.messenger.hd.M0(2131749729, null));
        lb0Var2.e(editTextBoldCursor2);
        lb0Var2.addView((View) editTextBoldCursor2, c8.ha.d(-1, -2.0f, 48, 0.0f, 0.0f, 48.0f, 0.0f));
        c8.ka.b(lb0Var2, 0.02f, 1.2f);
        lb0Var2.setOnClickListener(new r(1, this, context));
        f11.addView(lb0Var2, c8.ha.k(18.0f, 18.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView3 = new ImageView(context);
        imageView3.setImageResource(2131230871);
        org.telegram.ui.ActionBar.r6.t(imageView3, org.telegram.ui.ActionBar.k6.W5, f6Var, PorterDuff.Mode.SRC_IN);
        lb0Var2.addView(imageView3, c8.ha.d(24, 24.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.Z1 = textView2;
        org.telegram.ui.ActionBar.r6.V(textView2, i13, null);
        textView2.setTextSize(1, 13.0f);
        f11.addView(textView2, c8.ha.t(-1, -2, 55, 33, 4, 33, 0));
        fi.d dVar = new fi.d(context, f6Var, true);
        this.f3421a2 = dVar;
        dVar.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                cg.a aVar;
                String str;
                boolean z10;
                String a02;
                int i14;
                boolean z11;
                long j11;
                int i15;
                final a1 a1Var = a1.this;
                if (a1Var.f3421a2.f11752c0) {
                    int i16 = i7;
                    if (qp.s1(i16).v2()) {
                        org.telegram.ui.b.b(i16);
                        return;
                    }
                    ea x10 = ea.x(i16, a1Var.f3425f2.f6160a);
                    if (x10.f3810e) {
                        aVar = cg.a.l(x10.p());
                    } else {
                        aVar = null;
                    }
                    cg.b bVar5 = cg.b.f6162a;
                    cg.b bVar6 = cg.b.f6163b;
                    if (aVar != null) {
                        long j12 = aVar.f6161b;
                        cg.a aVar2 = a1Var.f3425f2;
                        if (j12 >= aVar2.f6161b) {
                            String str2 = a1Var.S1;
                            long j13 = a1Var.T1;
                            String d = aVar2.d();
                            if (a1Var.f3425f2.f6160a == bVar6) {
                                str = str2;
                                z10 = true;
                            } else {
                                str = str2;
                                z10 = false;
                            }
                            LinearLayout linearLayout2 = new LinearLayout(a1Var.getContext());
                            linearLayout2.setOrientation(1);
                            TextView textView3 = new TextView(a1Var.getContext());
                            textView3.setText(org.telegram.messenger.hd.M0(2131749731, null));
                            int i17 = org.telegram.ui.ActionBar.k6.f27956j5;
                            org.telegram.messenger.k5.n(textView3, i17, a1Var.I0, 1, 20.0f);
                            linearLayout2.addView(textView3, c8.ha.t(-1, -2, 48, 24, 4, 24, 14));
                            TextView textView4 = new TextView(a1Var.getContext());
                            org.telegram.ui.ActionBar.r6.V(textView4, i17, a1Var.I0);
                            textView4.setTextSize(1, 16.0f);
                            if (a1Var.f3425f2.f6160a == bVar5) {
                                a02 = org.telegram.messenger.hd.a0(null, null, 2131749682, d, org.telegram.messenger.m5.t(j13), str);
                            } else {
                                a02 = org.telegram.messenger.hd.a0(null, null, 2131749681, d, org.telegram.messenger.m5.t(j13), str);
                            }
                            textView4.setText(org.telegram.messenger.g0.X2(a02));
                            linearLayout2.addView(textView4, c8.ha.t(-1, -2, 48, 24, 4, 24, 4));
                            sx0 sx0Var = new sx0(a1Var.getContext(), a1Var.I0);
                            final long N1 = qp.s1(a1Var.f28612a).N1(j13);
                            final cg.a g12 = cg.a.g(N1, bVar5);
                            sx0Var.c(org.telegram.messenger.hd.M0(2131749703, null), dd.a1(z10, org.telegram.messenger.hd.a0(null, null, 2131749739, d), 0.8f, null), null, null);
                            int i18 = (N1 > 0L ? 1 : (N1 == 0L ? 0 : -1));
                            if (i18 > 0) {
                                i14 = 0;
                                sx0Var.c(org.telegram.messenger.hd.M0(2131749704, null), dd.a1(false, org.telegram.messenger.hd.a0(null, null, 2131749739, g12.d()), 0.8f, null), null, null);
                            } else {
                                i14 = 0;
                            }
                            sx0Var.c(org.telegram.messenger.hd.M0(2131749705, null), org.telegram.messenger.hd.G(a1Var.f3426g2 / 3600, "GiftOfferHours", new Object[i14]), null, null);
                            linearLayout2.addView(sx0Var, c8.ha.t(-1, -2, 48, 23, 16, 23, 4));
                            gz.C(a1Var.f28612a);
                            long E = gz.E();
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                            if (i18 == 0) {
                                spannableStringBuilder.append((CharSequence) dd.V0(org.telegram.messenger.hd.a0(null, null, 2131749711, d), z10));
                                z11 = z10;
                                j11 = E;
                                i15 = 0;
                            } else if (z10) {
                                spannableStringBuilder.append(org.telegram.messenger.hd.V(null, null, 2131749710, dd.V0(org.telegram.messenger.hd.a0(null, null, 2131749709, d), true), dd.T0(org.telegram.messenger.hd.a0(null, null, 2131749709, g12.d()))));
                                z11 = z10;
                                j11 = E;
                                i15 = 0;
                            } else {
                                z11 = z10;
                                j11 = E;
                                i15 = 0;
                                spannableStringBuilder.append((CharSequence) dd.T0(org.telegram.messenger.hd.a0(null, null, 2131749711, cg.a.i(a1Var.f3425f2.f6161b + g12.f6161b, bVar5).d())));
                            }
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(i15, a1Var.getContext(), a1Var.I0);
                            alertDialog$Builder.o(linearLayout2);
                            final boolean z12 = z11;
                            final long j14 = j11;
                            alertDialog$Builder.k(spannableStringBuilder, new org.telegram.ui.ActionBar.r1() {
                                @Override
                                public final void g(org.telegram.ui.ActionBar.u1 u1Var, int i19) {
                                    cg.a aVar3;
                                    cg.a i20;
                                    long j15 = N1;
                                    int i21 = (j15 > 0L ? 1 : (j15 == 0L ? 0 : -1));
                                    a1 a1Var2 = a1.this;
                                    if (i21 > 0) {
                                        int i22 = a1Var2.f28612a;
                                        cg.b bVar7 = cg.b.f6162a;
                                        ea x11 = ea.x(i22, bVar7);
                                        if (x11.f3810e) {
                                            aVar3 = cg.a.l(x11.p());
                                        } else {
                                            aVar3 = null;
                                        }
                                        if (z12) {
                                            i20 = cg.a.g(j15, bVar7);
                                        } else {
                                            i20 = cg.a.i(a1Var2.f3425f2.f6161b + g12.f6161b, bVar7);
                                        }
                                        if (aVar3 == null || aVar3.f6161b < i20.f6161b) {
                                            new tc(a1Var2.getContext(), a1Var2.I0, i20.a(), 14, null, null, a1Var2.T1).show();
                                            return;
                                        }
                                    }
                                    vf.b h = u1Var.h(-1, true, true);
                                    h.d();
                                    TL_payments.TL_sendStarGiftOffer tL_sendStarGiftOffer = new TL_payments.TL_sendStarGiftOffer();
                                    tL_sendStarGiftOffer.price = a1Var2.f3425f2.o();
                                    tL_sendStarGiftOffer.peer = qp.s1(a1Var2.f28612a).j1(a1Var2.T1);
                                    tL_sendStarGiftOffer.duration = a1Var2.f3426g2;
                                    tL_sendStarGiftOffer.slug = a1Var2.R1.slug;
                                    tL_sendStarGiftOffer.random_id = j14;
                                    if (i21 > 0) {
                                        tL_sendStarGiftOffer.flags |= 1;
                                        tL_sendStarGiftOffer.allow_paid_stars = j15;
                                    }
                                    ConnectionsManager.getInstance(a1Var2.f28612a).sendRequestTyped(tL_sendStarGiftOffer, new t0(a1Var2, h, u1Var, 0));
                                }
                            });
                            alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27292a;
                            u1Var.X0 = true;
                            u1Var.show();
                            return;
                        }
                    }
                    cg.a aVar3 = a1Var.f3425f2;
                    cg.b bVar7 = aVar3.f6160a;
                    Context context2 = context;
                    org.telegram.ui.ActionBar.f6 f6Var3 = f6Var;
                    if (bVar7 == bVar5) {
                        new tc(context2, f6Var3, aVar3.a(), 14, null, null, j3).show();
                    } else if (bVar7 == bVar6) {
                        new gi.e(context2, f6Var3, aVar3, true, null).show();
                    }
                }
            }
        });
        f1(cg.a.i(0L, bVar), false, true, false);
        if (this.f3426g2 != 86400) {
            this.f3426g2 = 86400;
            editTextBoldCursor2.setText(org.telegram.messenger.hd.G(24, "GiftOfferHours", new Object[0]));
        }
        e1(false);
        editTextBoldCursor.addTextChangedListener(new z0(this));
        FrameLayout.LayoutParams d = c8.ha.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f);
        int i14 = d.leftMargin;
        int i15 = this.f28645t0;
        d.leftMargin = i14 + i15;
        d.rightMargin += i15;
        this.f28615b.addView(dVar, d);
        pj0 pj0Var = this.f36328k1;
        int i16 = this.f28645t0;
        pj0Var.setPadding(i16, 0, i16, org.telegram.messenger.g0.L(64.0f));
        this.f36328k1.setOverScrollMode(2);
        this.f3434o2 = r31.k(linearLayout);
        this.f3433n2.O(false);
    }

    @Override
    public final oj0 L0(pj0 pj0Var) {
        f41 f41Var = new f41(this.f36328k1, getContext(), this.f28612a, 0, true, new ai.e(this, 4), this.I0);
        this.f3433n2 = f41Var;
        f41Var.f33473r = false;
        return f41Var;
    }

    @Override
    public final CharSequence O0() {
        return org.telegram.messenger.hd.M0(2131749685, null);
    }

    @Override
    public final boolean X(float f10, float f11) {
        c cVar;
        if (this.f3428i2 && (cVar = this.Q1) != null && f10 >= cVar.getX() && f10 <= cVar.getX() + cVar.getWidth() && f11 >= cVar.getY() && f11 <= cVar.getY() + cVar.getHeight()) {
            return false;
        }
        return super.X(f10, f11);
    }

    public final void d1() {
        boolean z9;
        float f10;
        boolean z10 = this.f3432m2;
        c cVar = this.Q1;
        if ((z10 && !this.I && cVar != null && this.f28615b.getY() > org.telegram.messenger.g0.L(32.0f)) || this.U1 == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (this.f3428i2 != z9) {
            this.f3428i2 = z9;
            if (cVar != null) {
                cVar.setEnabled(z9);
                cVar.setClickable(z9);
                ViewPropertyAnimator animate = cVar.animate();
                float f11 = 0.6f;
                float f12 = 1.0f;
                if (z9) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.6f;
                }
                ViewPropertyAnimator scaleX = animate.scaleX(f10);
                if (z9) {
                    f11 = 1.0f;
                }
                ViewPropertyAnimator scaleY = scaleX.scaleY(f11);
                if (!z9) {
                    f12 = 0.0f;
                }
                org.telegram.messenger.camera.q.k(scaleY, f12, 180L);
            }
        }
    }

    public final void e1(boolean z9) {
        boolean z10;
        if (this.f3427h2 == 0 && this.f3425f2.f6161b > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        fi.d dVar = this.f3421a2;
        if (dVar.f11752c0 != z10) {
            dVar.setEnabled(z10);
            dVar.setClickable(z10);
            float f10 = 0.6f;
            if (z9) {
                ViewPropertyAnimator animate = dVar.animate();
                if (z10) {
                    f10 = 1.0f;
                }
                org.telegram.messenger.camera.q.k(animate, f10, 180L);
                return;
            }
            if (z10) {
                f10 = 1.0f;
            }
            dVar.setAlpha(f10);
        }
    }

    public final void f1(cg.a aVar, boolean z9, boolean z10, boolean z11) {
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        ?? r19;
        boolean z16;
        String E;
        wp[] wpVarArr;
        double d;
        boolean z17;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        int i15;
        cg.a aVar2 = this.f3425f2;
        int i16 = this.f3427h2;
        this.f3427h2 = 0;
        if (aVar != null) {
            this.f3425f2 = aVar;
        } else {
            this.f3425f2 = cg.a.i(0L, aVar2.f6160a);
            this.f3427h2 |= 1;
        }
        cg.b bVar = this.f3425f2.f6160a;
        aa.n nVar = this.f3424e2;
        q4.q[] qVarArr = (q4.q[]) nVar.f825b;
        long j3 = ((cg.a) ((q4.q[]) nVar.f825b)[bVar.ordinal()].f53687c).f6161b;
        cg.a aVar3 = this.f3425f2;
        if (j3 < aVar3.f6161b) {
            this.f3427h2 |= 4;
        }
        if (!aVar3.k() && ((cg.a) qVarArr[this.f3425f2.f6160a.ordinal()].f53686b).f6161b > this.f3425f2.f6161b) {
            this.f3427h2 |= 2;
        }
        if (!z10 && aVar2.f6160a == this.f3425f2.f6160a) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (!z10 && aVar2.f6161b == this.f3425f2.f6161b) {
            z13 = false;
        } else {
            z13 = true;
        }
        if (!z10 && i16 == this.f3427h2) {
            z14 = false;
        } else {
            z14 = true;
        }
        cg.b bVar2 = cg.b.f6162a;
        EditTextBoldCursor editTextBoldCursor = this.W1;
        cg.b bVar3 = cg.b.f6163b;
        if (z12) {
            b30 b30Var = this.U1;
            if (b30Var != null) {
                if (this.f3425f2.f6160a == bVar2) {
                    i15 = 0;
                } else {
                    i15 = 1;
                }
                b30Var.a(i15, z11);
            }
            String t6 = org.telegram.messenger.m5.t(this.T1);
            cg.b bVar4 = this.f3425f2.f6160a;
            TextView textView = this.Z1;
            if (bVar4 == bVar2) {
                org.telegram.messenger.k5.r(null, null, 2131749728, new Object[]{t6}, textView);
                editTextBoldCursor.setInputType(2);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(((cg.a) qVarArr[this.f3425f2.f6160a.ordinal()].f53687c).a()).length())});
            } else if (bVar4 == bVar3) {
                org.telegram.messenger.k5.r(null, null, 2131749727, new Object[]{t6}, textView);
                editTextBoldCursor.setInputType(8194);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(((cg.a) qVarArr[this.f3425f2.f6160a.ordinal()].f53687c).a()).length() + 3)});
            }
            ImageView imageView = this.d2;
            ImageView imageView2 = this.f3423c2;
            if (z11) {
                ViewPropertyAnimator animate = imageView2.animate();
                if (this.f3425f2.f6160a == bVar2) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                ViewPropertyAnimator alpha = animate.alpha(f12);
                if (this.f3425f2.f6160a == bVar2) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                ViewPropertyAnimator scaleX = alpha.scaleX(f13);
                if (this.f3425f2.f6160a == bVar2) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                ViewPropertyAnimator scaleY = scaleX.scaleY(f14);
                z17 = false;
                i7 = 1;
                scaleY.setDuration(180L).start();
                ViewPropertyAnimator animate2 = imageView.animate();
                if (this.f3425f2.f6160a == bVar3) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.0f;
                }
                ViewPropertyAnimator alpha2 = animate2.alpha(f15);
                if (this.f3425f2.f6160a == bVar3) {
                    f16 = 1.0f;
                } else {
                    f16 = 0.0f;
                }
                ViewPropertyAnimator scaleX2 = alpha2.scaleX(f16);
                if (this.f3425f2.f6160a == bVar3) {
                    f17 = 1.0f;
                } else {
                    f17 = 0.0f;
                }
                scaleX2.scaleY(f17).setDuration(180L).start();
            } else {
                z17 = false;
                i7 = 1;
                if (this.f3425f2.f6160a == bVar2) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                imageView2.setAlpha(f10);
                if (this.f3425f2.f6160a == bVar3) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                imageView.setAlpha(f11);
            }
            c cVar = this.Q1;
            z15 = z17;
            if (cVar != null) {
                cg.b bVar5 = this.f3425f2.f6160a;
                z15 = z17;
                if (cVar.f3547e != bVar5) {
                    cVar.f3547e = bVar5;
                    cVar.a();
                    z15 = z17;
                }
            }
        } else {
            z15 = false;
            i7 = 1;
        }
        if (!z12 && !z14) {
            r19 = z15;
        } else {
            if (this.f3425f2.f6160a == bVar2) {
                i10 = 2131749698;
            } else {
                i10 = 2131749690;
            }
            this.V1.setText(org.telegram.messenger.hd.M0(i10, null));
            cg.b bVar6 = this.f3425f2.f6160a;
            int i17 = this.f3427h2;
            int i18 = i17 & 4;
            String str = this.S1;
            boolean z18 = z15;
            TextView textView2 = this.X1;
            if (i18 != 0) {
                if (bVar6 == bVar2) {
                    i14 = 2131749696;
                } else {
                    i14 = 2131749688;
                }
                String d2 = ((cg.a) qVarArr[bVar6.ordinal()].f53687c).d();
                Object[] objArr = new Object[2];
                objArr[z18 ? 1 : 0] = d2;
                objArr[i7] = str;
                org.telegram.messenger.k5.r(null, null, i14, objArr, textView2);
            } else if ((i17 & 2) != 0) {
                if (bVar6 == bVar2) {
                    i12 = 2131749695;
                } else {
                    i12 = 2131749687;
                }
                String d10 = ((cg.a) qVarArr[bVar6.ordinal()].f53686b).d();
                Object[] objArr2 = new Object[2];
                objArr2[z18 ? 1 : 0] = d10;
                objArr2[i7] = str;
                org.telegram.messenger.k5.r(null, null, i12, objArr2, textView2);
            } else {
                if (bVar6 == bVar2) {
                    i11 = 2131749697;
                } else {
                    i11 = 2131749689;
                }
                Object[] objArr3 = new Object[i7];
                objArr3[z18 ? 1 : 0] = str;
                org.telegram.messenger.k5.r(null, null, i11, objArr3, textView2);
            }
            if ((this.f3427h2 & (-9)) == 0) {
                i13 = org.telegram.ui.ActionBar.k6.f28240y6;
            } else {
                i13 = org.telegram.ui.ActionBar.k6.f28089q7;
            }
            org.telegram.ui.ActionBar.r6.V(textView2, i13, this.I0);
            r19 = z18;
        }
        if (z12 || z13 || z14) {
            cg.a aVar4 = this.f3425f2;
            if (aVar4.f6160a == bVar3) {
                z16 = true;
            } else {
                z16 = r19;
            }
            if (z16) {
                E = aVar4.b();
            } else {
                E = org.telegram.messenger.hd.E(aVar4.a(), ',');
            }
            Object[] objArr4 = new Object[1];
            objArr4[r19] = E;
            String a02 = org.telegram.messenger.hd.a0(null, null, 2131749732, objArr4);
            if (z16) {
                wpVarArr = this.f3431l2;
            } else {
                wpVarArr = this.f3430k2;
            }
            this.f3421a2.i(dd.s1(dd.Y0(z16, a02, wpVarArr), z16), z11, true);
            e1(z11);
        }
        if (z12 || z13) {
            StringBuilder sb2 = new StringBuilder(10);
            sb2.append('~');
            if (this.f3425f2.f6160a == bVar3) {
                d = ((org.telegram.messenger.i0) qp.s1(this.f28612a).f24927x7.f24438l.f14323b).f23003a;
            } else {
                d = qp.s1(this.f28612a).f24740c6 * 1.0E-5d;
            }
            org.telegram.messenger.r1.i().getClass();
            sb2.append(org.telegram.messenger.r1.g("USD", 2, (long) (this.f3425f2.c() * d * 100.0d), r19));
            this.f3422b2.c(sb2, z11, true);
        }
        if (z9 && z13) {
            String b10 = this.f3425f2.b();
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
            if (this.G0 == this.P1 && (w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27921h5, this.I0)) != this.G0) {
                O(w02);
                this.P1 = this.G0;
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void show() {
        super.show();
        org.telegram.messenger.g0.i3(new a3.f(this, 17), 50L);
    }

    @Override
    public final void v() {
        this.f3432m2 = true;
        d1();
    }
}
