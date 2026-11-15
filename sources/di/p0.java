package di;

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
import org.telegram.messenger.ez;
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.messenger.np;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.e30;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.mb0;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.vx0;
public final class p0 extends org.telegram.ui.Components.ja {
    public static final int[] f9195t2 = {21600, 43200, 86400, 129600, 172800, 259200};
    public int T1;
    public final b U1;
    public final TL_stars.TL_starGiftUnique V1;
    public final String W1;
    public final long X1;
    public final e30 Y1;
    public final mb0 Z1;
    public final EditTextBoldCursor f9196a2;
    public final TextView f9197b2;
    public final n0 f9198c2;
    public final TextView d2;
    public final hi.d f9199e2;
    public final org.telegram.ui.Components.h6 f9200f2;
    public final ImageView f9201g2;
    public final ImageView f9202h2;
    public final ob.c f9203i2;
    public cg.a f9204j2;
    public int f9205k2;
    public int f9206l2;
    public boolean f9207m2;
    public final l1 f9208n2;
    public final eq[] f9209o2;
    public final eq[] f9210p2;
    public boolean f9211q2;
    public p41 f9212r2;
    public final b41 f9213s2;

    public p0(final Context context, final int i7, final long j3, TL_stars.TL_starGiftUnique tL_starGiftUnique, final org.telegram.ui.ActionBar.e6 e6Var, l1 l1Var) {
        super(context, null, true, false, 2, e6Var);
        float f10;
        boolean z10;
        org.telegram.ui.ActionBar.e6 e6Var2;
        ob.c cVar = new ob.c(9);
        q4.q[] qVarArr = (q4.q[]) cVar.f21417b;
        this.f9203i2 = cVar;
        this.f9209o2 = new eq[1];
        this.f9210p2 = new eq[1];
        this.G1 = false;
        this.F1 = org.telegram.messenger.g0.L(12.0f);
        this.f35943v1 = 0.2f;
        this.X1 = j3;
        this.V1 = tL_starGiftUnique;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(tL_starGiftUnique.title);
        sb2.append(" #");
        this.W1 = i5.c.l(tL_starGiftUnique.num, ',', sb2);
        this.f9208n2 = l1Var;
        this.E = true;
        this.Q0 = true;
        boolean j10 = v8.y(i7, true).j();
        if (j3 > 0 && np.s1(i7).b2(j3) == null) {
            f10 = 12.0f;
            TLRPC.User a22 = np.s1(i7).a2(Long.valueOf(j3));
            if (a22 != null) {
                np.s1(i7).W2(a22, 0, false, null);
            }
        } else {
            f10 = 12.0f;
        }
        org.telegram.messenger.p0 p0Var = np.s1(i7).f25448y7;
        cg.b bVar = cg.b.f4987a;
        cg.a g10 = cg.a.g(tL_starGiftUnique.offer_min_stars, bVar);
        cg.a g11 = cg.a.g(Math.max(g10.a() * 2, ((org.telegram.messenger.j0) p0Var.f25863q.f15881b).f24493c), bVar);
        cg.b bVar2 = cg.b.f4988b;
        cg.a i10 = cg.a.i(Math.max(g10.e(bVar2).n(2).f4986b, ((org.telegram.messenger.l0) p0Var.f25864r.f14544b).f24785c), bVar2);
        cg.a i11 = cg.a.i(Math.max(i10.f4986b * 2, ((org.telegram.messenger.l0) p0Var.f25865s.f14544b).f24785c), bVar2);
        cg.b bVar3 = g10.f4985a;
        if (bVar3 != g11.f4985a) {
            z10 = false;
        } else {
            z10 = false;
            qVarArr[bVar3.ordinal()] = new q4.q(g10, g11, false, 12);
        }
        cg.b bVar4 = i10.f4985a;
        if (bVar4 == i11.f4985a) {
            qVarArr[bVar4.ordinal()] = new q4.q(i10, i11, z10, 12);
        }
        b bVar5 = new b(i7, context, e6Var);
        this.U1 = bVar5;
        bVar5.setScaleX(0.6f);
        bVar5.setScaleY(0.6f);
        bVar5.setAlpha(0.0f);
        bVar5.setEnabled(z10);
        bVar5.setClickable(z10);
        this.f29685c.addView(bVar5, c8.ja.d(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
        c8.na.a(bVar5);
        bVar5.setOnClickListener(new ah.g(this, context, e6Var, 6));
        Q(org.telegram.ui.ActionBar.j6.f28922h5);
        this.T1 = this.H0;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setClickable(true);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(0, org.telegram.messenger.g0.L(f10), 0, org.telegram.messenger.g0.L(16.0f));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f9196a2 = editTextBoldCursor;
        if (j10) {
            e30 e30Var = new e30(context, e6Var);
            this.Y1 = e30Var;
            ArrayList arrayList = new ArrayList();
            arrayList.add(hd.M0(2131744377, null));
            arrayList.add(hd.M0(2131744376, null));
            e30Var.b(arrayList, new l0(this, 0));
            linearLayout.addView(e30Var, c8.ja.k(18.0f, 0.0f, 18.0f, 18.0f, -1, -2));
            e6Var2 = null;
        } else {
            e6Var2 = null;
            this.Y1 = null;
        }
        LinearLayout f11 = org.telegram.messenger.k5.f(context, 1);
        linearLayout.addView(f11, c8.ja.l(1.0f, -1, -2));
        mb0 mb0Var = new mb0(context, e6Var2);
        this.Z1 = mb0Var;
        editTextBoldCursor.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setImeOptions(268435462);
        editTextBoldCursor.setTextSize(1, 17.0f);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setPadding(org.telegram.messenger.g0.L(42.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
        int i12 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.q6.U(editTextBoldCursor, i12, null);
        editTextBoldCursor.requestFocus();
        mb0Var.setLeftPadding(org.telegram.messenger.g0.L(28.0f));
        mb0Var.e(editTextBoldCursor);
        mb0Var.b(1.0f, 0.0f, false);
        mb0Var.setForceUseCenter2(true);
        editTextBoldCursor.setOnFocusChangeListener(new ch.c0(this, 2));
        mb0Var.addView(editTextBoldCursor, c8.ja.e(-1, -2, 48));
        f11.addView(mb0Var, c8.ja.k(18.0f, 0.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView = new ImageView(context);
        this.f9201g2 = imageView;
        imageView.setImageResource(2131232753);
        mb0Var.addView(imageView, c8.ja.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f9202h2 = imageView2;
        imageView2.setImageResource(2131231957);
        mb0Var.addView(imageView2, c8.ja.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(context, false, false, false);
        this.f9200f2 = h6Var;
        int i13 = org.telegram.ui.ActionBar.j6.f29241y6;
        org.telegram.ui.ActionBar.q6.Y(h6Var, i13, null);
        h6Var.setTextSize(org.telegram.messenger.g0.L(13.0f));
        h6Var.setGravity(5);
        mb0Var.addView(h6Var, c8.ja.d(-2, -1.0f, 21, 0.0f, 0.0f, 16.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f9197b2 = textView;
        textView.setTextSize(1, 13.0f);
        f11.addView(textView, c8.ja.t(-1, -2, 55, 33, 4, 33, 0));
        ?? editTextBoldCursor2 = new EditTextBoldCursor(context);
        this.f9198c2 = editTextBoldCursor2;
        editTextBoldCursor2.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        editTextBoldCursor2.setCursorWidth(1.5f);
        editTextBoldCursor2.setTextSize(1, 17.0f);
        editTextBoldCursor2.setMaxLines(1);
        editTextBoldCursor2.setBackground(null);
        editTextBoldCursor2.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
        org.telegram.ui.ActionBar.q6.U(editTextBoldCursor2, i12, null);
        editTextBoldCursor2.setFocusable(false);
        editTextBoldCursor2.setClickable(false);
        editTextBoldCursor2.setEnabled(false);
        mb0 mb0Var2 = new mb0(context, null);
        mb0Var2.setText(hd.M0(2131749730, null));
        mb0Var2.e(editTextBoldCursor2);
        mb0Var2.addView((View) editTextBoldCursor2, c8.ja.d(-1, -2.0f, 48, 0.0f, 0.0f, 48.0f, 0.0f));
        c8.na.b(mb0Var2, 0.02f, 1.2f);
        mb0Var2.setOnClickListener(new ai.t2(8, this, context));
        f11.addView(mb0Var2, c8.ja.k(18.0f, 18.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView3 = new ImageView(context);
        imageView3.setImageResource(2131230871);
        org.telegram.ui.ActionBar.q6.s(imageView3, org.telegram.ui.ActionBar.j6.W5, e6Var, PorterDuff.Mode.SRC_IN);
        mb0Var2.addView(imageView3, c8.ja.d(24, 24.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.d2 = textView2;
        org.telegram.ui.ActionBar.q6.U(textView2, i13, null);
        textView2.setTextSize(1, 13.0f);
        f11.addView(textView2, c8.ja.t(-1, -2, 55, 33, 4, 33, 0));
        hi.d dVar = new hi.d(context, e6Var, true);
        this.f9199e2 = dVar;
        dVar.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                cg.a aVar;
                String str;
                boolean z11;
                String a02;
                int i14;
                boolean z12;
                long j11;
                int i15;
                final p0 p0Var2 = p0.this;
                if (p0Var2.f9199e2.f14056d0) {
                    int i16 = i7;
                    if (np.s1(i16).v2()) {
                        org.telegram.ui.b.b(i16);
                        return;
                    }
                    v8 x10 = v8.x(i16, p0Var2.f9204j2.f4985a);
                    if (x10.f9601e) {
                        aVar = cg.a.l(x10.p());
                    } else {
                        aVar = null;
                    }
                    cg.b bVar6 = cg.b.f4987a;
                    cg.b bVar7 = cg.b.f4988b;
                    if (aVar != null) {
                        long j12 = aVar.f4986b;
                        cg.a aVar2 = p0Var2.f9204j2;
                        if (j12 >= aVar2.f4986b) {
                            String str2 = p0Var2.W1;
                            long j13 = p0Var2.X1;
                            String d = aVar2.d();
                            if (p0Var2.f9204j2.f4985a == bVar7) {
                                str = str2;
                                z11 = true;
                            } else {
                                str = str2;
                                z11 = false;
                            }
                            LinearLayout linearLayout2 = new LinearLayout(p0Var2.getContext());
                            linearLayout2.setOrientation(1);
                            TextView textView3 = new TextView(p0Var2.getContext());
                            textView3.setText(hd.M0(2131749732, null));
                            int i17 = org.telegram.ui.ActionBar.j6.f28957j5;
                            org.telegram.messenger.k5.m(textView3, i17, p0Var2.J0, 1, 20.0f);
                            linearLayout2.addView(textView3, c8.ja.t(-1, -2, 48, 24, 4, 24, 14));
                            TextView textView4 = new TextView(p0Var2.getContext());
                            org.telegram.ui.ActionBar.q6.U(textView4, i17, p0Var2.J0);
                            textView4.setTextSize(1, 16.0f);
                            if (p0Var2.f9204j2.f4985a == bVar6) {
                                a02 = hd.a0(null, null, 2131749683, d, org.telegram.messenger.m5.t(j13), str);
                            } else {
                                a02 = hd.a0(null, null, 2131749682, d, org.telegram.messenger.m5.t(j13), str);
                            }
                            textView4.setText(org.telegram.messenger.g0.X2(a02));
                            linearLayout2.addView(textView4, c8.ja.t(-1, -2, 48, 24, 4, 24, 4));
                            vx0 vx0Var = new vx0(p0Var2.getContext(), p0Var2.J0);
                            final long N1 = np.s1(p0Var2.f29679a).N1(j13);
                            final cg.a g12 = cg.a.g(N1, bVar6);
                            vx0Var.c(hd.M0(2131749704, null), mb.a1(z11, hd.a0(null, null, 2131749740, d), 0.8f, null), null, null);
                            int i18 = (N1 > 0L ? 1 : (N1 == 0L ? 0 : -1));
                            if (i18 > 0) {
                                i14 = 0;
                                vx0Var.c(hd.M0(2131749705, null), mb.a1(false, hd.a0(null, null, 2131749740, g12.d()), 0.8f, null), null, null);
                            } else {
                                i14 = 0;
                            }
                            vx0Var.c(hd.M0(2131749706, null), hd.G(p0Var2.f9205k2 / 3600, "GiftOfferHours", new Object[i14]), null, null);
                            linearLayout2.addView(vx0Var, c8.ja.t(-1, -2, 48, 23, 16, 23, 4));
                            ez.C(p0Var2.f29679a);
                            long E = ez.E();
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                            if (i18 == 0) {
                                spannableStringBuilder.append((CharSequence) mb.V0(hd.a0(null, null, 2131749712, d), z11));
                                z12 = z11;
                                j11 = E;
                                i15 = 0;
                            } else if (z11) {
                                spannableStringBuilder.append(hd.V(null, null, 2131749711, mb.V0(hd.a0(null, null, 2131749710, d), true), mb.T0(hd.a0(null, null, 2131749710, g12.d()))));
                                z12 = z11;
                                j11 = E;
                                i15 = 0;
                            } else {
                                z12 = z11;
                                j11 = E;
                                i15 = 0;
                                spannableStringBuilder.append((CharSequence) mb.T0(hd.a0(null, null, 2131749712, cg.a.i(p0Var2.f9204j2.f4986b + g12.f4986b, bVar6).d())));
                            }
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(i15, p0Var2.getContext(), p0Var2.J0);
                            alertDialog$Builder.o(linearLayout2);
                            final boolean z13 = z12;
                            final long j14 = j11;
                            alertDialog$Builder.k(spannableStringBuilder, new org.telegram.ui.ActionBar.q1() {
                                @Override
                                public final void h(org.telegram.ui.ActionBar.t1 t1Var, int i19) {
                                    cg.a aVar3;
                                    cg.a i20;
                                    long j15 = N1;
                                    int i21 = (j15 > 0L ? 1 : (j15 == 0L ? 0 : -1));
                                    p0 p0Var3 = p0.this;
                                    if (i21 > 0) {
                                        int i22 = p0Var3.f29679a;
                                        cg.b bVar8 = cg.b.f4987a;
                                        v8 x11 = v8.x(i22, bVar8);
                                        if (x11.f9601e) {
                                            aVar3 = cg.a.l(x11.p());
                                        } else {
                                            aVar3 = null;
                                        }
                                        if (z13) {
                                            i20 = cg.a.g(j15, bVar8);
                                        } else {
                                            i20 = cg.a.i(p0Var3.f9204j2.f4986b + g12.f4986b, bVar8);
                                        }
                                        if (aVar3 == null || aVar3.f4986b < i20.f4986b) {
                                            new cb(p0Var3.getContext(), p0Var3.J0, i20.a(), 14, null, null, p0Var3.X1).show();
                                            return;
                                        }
                                    }
                                    vf.b h = t1Var.h(-1, true, true);
                                    h.d();
                                    TL_payments.TL_sendStarGiftOffer tL_sendStarGiftOffer = new TL_payments.TL_sendStarGiftOffer();
                                    tL_sendStarGiftOffer.price = p0Var3.f9204j2.o();
                                    tL_sendStarGiftOffer.peer = np.s1(p0Var3.f29679a).j1(p0Var3.X1);
                                    tL_sendStarGiftOffer.duration = p0Var3.f9205k2;
                                    tL_sendStarGiftOffer.slug = p0Var3.V1.slug;
                                    tL_sendStarGiftOffer.random_id = j14;
                                    if (i21 > 0) {
                                        tL_sendStarGiftOffer.flags |= 1;
                                        tL_sendStarGiftOffer.allow_paid_stars = j15;
                                    }
                                    ConnectionsManager.getInstance(p0Var3.f29679a).sendRequestTyped(tL_sendStarGiftOffer, new bi.h0(p0Var3, h, t1Var, 2));
                                }
                            });
                            alertDialog$Builder.h(hd.M0(2131752589, null), null);
                            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                            t1Var.Y0 = true;
                            t1Var.show();
                            return;
                        }
                    }
                    cg.a aVar3 = p0Var2.f9204j2;
                    cg.b bVar8 = aVar3.f4985a;
                    Context context2 = context;
                    org.telegram.ui.ActionBar.e6 e6Var3 = e6Var;
                    if (bVar8 == bVar6) {
                        new cb(context2, e6Var3, aVar3.a(), 14, null, null, j3).show();
                    } else if (bVar8 == bVar7) {
                        new ii.e(context2, e6Var3, aVar3, true, null).show();
                    }
                }
            }
        });
        f1(cg.a.i(0L, bVar), false, true, false);
        if (this.f9205k2 != 86400) {
            this.f9205k2 = 86400;
            editTextBoldCursor2.setText(hd.G(24, "GiftOfferHours", new Object[0]));
        }
        e1(false);
        editTextBoldCursor.addTextChangedListener(new o0(this));
        FrameLayout.LayoutParams d = c8.ja.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f);
        int i14 = d.leftMargin;
        int i15 = this.f29717u0;
        d.leftMargin = i14 + i15;
        d.rightMargin += i15;
        this.f29682b.addView(dVar, d);
        uj0 uj0Var = this.f35936o1;
        int i16 = this.f29717u0;
        uj0Var.setPadding(i16, 0, i16, org.telegram.messenger.g0.L(64.0f));
        this.f35936o1.setOverScrollMode(2);
        this.f9213s2 = b41.k(linearLayout);
        this.f9212r2.O(false);
    }

    @Override
    public final tj0 L0(uj0 uj0Var) {
        p41 p41Var = new p41(this.f35936o1, getContext(), this.f29679a, 0, true, new bi.b(this, 15), this.J0);
        this.f9212r2 = p41Var;
        p41Var.f38201r = false;
        return p41Var;
    }

    @Override
    public final CharSequence O0() {
        return hd.M0(2131749686, null);
    }

    @Override
    public final boolean Y(float f10, float f11) {
        b bVar;
        if (this.f9207m2 && (bVar = this.U1) != null && f10 >= bVar.getX() && f10 <= bVar.getX() + bVar.getWidth() && f11 >= bVar.getY() && f11 <= bVar.getY() + bVar.getHeight()) {
            return false;
        }
        return super.Y(f10, f11);
    }

    public final void d1() {
        boolean z10;
        float f10;
        boolean z11 = this.f9211q2;
        b bVar = this.U1;
        if ((z11 && !this.J && bVar != null && this.f29682b.getY() > org.telegram.messenger.g0.L(32.0f)) || this.Y1 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f9207m2 != z10) {
            this.f9207m2 = z10;
            if (bVar != null) {
                bVar.setEnabled(z10);
                bVar.setClickable(z10);
                ViewPropertyAnimator animate = bVar.animate();
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
                i20.m(scaleY, f12, 180L);
            }
        }
    }

    public final void e1(boolean z10) {
        boolean z11;
        if (this.f9206l2 == 0 && this.f9204j2.f4986b > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        hi.d dVar = this.f9199e2;
        if (dVar.f14056d0 != z11) {
            dVar.setEnabled(z11);
            dVar.setClickable(z11);
            float f10 = 0.6f;
            if (z10) {
                ViewPropertyAnimator animate = dVar.animate();
                if (z11) {
                    f10 = 1.0f;
                }
                i20.m(animate, f10, 180L);
                return;
            }
            if (z11) {
                f10 = 1.0f;
            }
            dVar.setAlpha(f10);
        }
    }

    public final void f1(cg.a aVar, boolean z10, boolean z11, boolean z12) {
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        ?? r19;
        boolean z17;
        String E;
        eq[] eqVarArr;
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
        cg.a aVar2 = this.f9204j2;
        int i16 = this.f9206l2;
        this.f9206l2 = 0;
        if (aVar != null) {
            this.f9204j2 = aVar;
        } else {
            this.f9204j2 = cg.a.i(0L, aVar2.f4985a);
            this.f9206l2 |= 1;
        }
        cg.b bVar = this.f9204j2.f4985a;
        ob.c cVar = this.f9203i2;
        q4.q[] qVarArr = (q4.q[]) cVar.f21417b;
        long j3 = ((cg.a) ((q4.q[]) cVar.f21417b)[bVar.ordinal()].f55253c).f4986b;
        cg.a aVar3 = this.f9204j2;
        if (j3 < aVar3.f4986b) {
            this.f9206l2 |= 4;
        }
        if (!aVar3.k() && ((cg.a) qVarArr[this.f9204j2.f4985a.ordinal()].f55252b).f4986b > this.f9204j2.f4986b) {
            this.f9206l2 |= 2;
        }
        if (!z11 && aVar2.f4985a == this.f9204j2.f4985a) {
            z13 = false;
        } else {
            z13 = true;
        }
        if (!z11 && aVar2.f4986b == this.f9204j2.f4986b) {
            z14 = false;
        } else {
            z14 = true;
        }
        if (!z11 && i16 == this.f9206l2) {
            z15 = false;
        } else {
            z15 = true;
        }
        cg.b bVar2 = cg.b.f4987a;
        EditTextBoldCursor editTextBoldCursor = this.f9196a2;
        cg.b bVar3 = cg.b.f4988b;
        if (z13) {
            e30 e30Var = this.Y1;
            if (e30Var != null) {
                if (this.f9204j2.f4985a == bVar2) {
                    i15 = 0;
                } else {
                    i15 = 1;
                }
                e30Var.a(i15, z12);
            }
            String t6 = org.telegram.messenger.m5.t(this.X1);
            cg.b bVar4 = this.f9204j2.f4985a;
            TextView textView = this.d2;
            if (bVar4 == bVar2) {
                org.telegram.messenger.k5.q(null, null, 2131749729, new Object[]{t6}, textView);
                editTextBoldCursor.setInputType(2);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(((cg.a) qVarArr[this.f9204j2.f4985a.ordinal()].f55253c).a()).length())});
            } else if (bVar4 == bVar3) {
                org.telegram.messenger.k5.q(null, null, 2131749728, new Object[]{t6}, textView);
                editTextBoldCursor.setInputType(8194);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(((cg.a) qVarArr[this.f9204j2.f4985a.ordinal()].f55253c).a()).length() + 3)});
            }
            ImageView imageView = this.f9202h2;
            ImageView imageView2 = this.f9201g2;
            if (z12) {
                ViewPropertyAnimator animate = imageView2.animate();
                if (this.f9204j2.f4985a == bVar2) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                ViewPropertyAnimator alpha = animate.alpha(f12);
                if (this.f9204j2.f4985a == bVar2) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                ViewPropertyAnimator scaleX = alpha.scaleX(f13);
                if (this.f9204j2.f4985a == bVar2) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                ViewPropertyAnimator scaleY = scaleX.scaleY(f14);
                z18 = false;
                i7 = 1;
                scaleY.setDuration(180L).start();
                ViewPropertyAnimator animate2 = imageView.animate();
                if (this.f9204j2.f4985a == bVar3) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.0f;
                }
                ViewPropertyAnimator alpha2 = animate2.alpha(f15);
                if (this.f9204j2.f4985a == bVar3) {
                    f16 = 1.0f;
                } else {
                    f16 = 0.0f;
                }
                ViewPropertyAnimator scaleX2 = alpha2.scaleX(f16);
                if (this.f9204j2.f4985a == bVar3) {
                    f17 = 1.0f;
                } else {
                    f17 = 0.0f;
                }
                scaleX2.scaleY(f17).setDuration(180L).start();
            } else {
                z18 = false;
                i7 = 1;
                if (this.f9204j2.f4985a == bVar2) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                imageView2.setAlpha(f10);
                if (this.f9204j2.f4985a == bVar3) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                imageView.setAlpha(f11);
            }
            b bVar5 = this.U1;
            z16 = z18;
            if (bVar5 != null) {
                cg.b bVar6 = this.f9204j2.f4985a;
                z16 = z18;
                if (bVar5.f8230e != bVar6) {
                    bVar5.f8230e = bVar6;
                    bVar5.a();
                    z16 = z18;
                }
            }
        } else {
            z16 = false;
            i7 = 1;
        }
        if (!z13 && !z15) {
            r19 = z16;
        } else {
            if (this.f9204j2.f4985a == bVar2) {
                i10 = 2131749699;
            } else {
                i10 = 2131749691;
            }
            this.Z1.setText(hd.M0(i10, null));
            cg.b bVar7 = this.f9204j2.f4985a;
            int i17 = this.f9206l2;
            int i18 = i17 & 4;
            String str = this.W1;
            boolean z19 = z16;
            TextView textView2 = this.f9197b2;
            if (i18 != 0) {
                if (bVar7 == bVar2) {
                    i14 = 2131749697;
                } else {
                    i14 = 2131749689;
                }
                String d2 = ((cg.a) qVarArr[bVar7.ordinal()].f55253c).d();
                Object[] objArr = new Object[2];
                objArr[z19 ? 1 : 0] = d2;
                objArr[i7] = str;
                org.telegram.messenger.k5.q(null, null, i14, objArr, textView2);
            } else if ((i17 & 2) != 0) {
                if (bVar7 == bVar2) {
                    i12 = 2131749696;
                } else {
                    i12 = 2131749688;
                }
                String d10 = ((cg.a) qVarArr[bVar7.ordinal()].f55252b).d();
                Object[] objArr2 = new Object[2];
                objArr2[z19 ? 1 : 0] = d10;
                objArr2[i7] = str;
                org.telegram.messenger.k5.q(null, null, i12, objArr2, textView2);
            } else {
                if (bVar7 == bVar2) {
                    i11 = 2131749698;
                } else {
                    i11 = 2131749690;
                }
                Object[] objArr3 = new Object[i7];
                objArr3[z19 ? 1 : 0] = str;
                org.telegram.messenger.k5.q(null, null, i11, objArr3, textView2);
            }
            if ((this.f9206l2 & (-9)) == 0) {
                i13 = org.telegram.ui.ActionBar.j6.f29241y6;
            } else {
                i13 = org.telegram.ui.ActionBar.j6.f29090q7;
            }
            org.telegram.ui.ActionBar.q6.U(textView2, i13, this.J0);
            r19 = z19;
        }
        if (z13 || z14 || z15) {
            cg.a aVar4 = this.f9204j2;
            if (aVar4.f4985a == bVar3) {
                z17 = true;
            } else {
                z17 = r19;
            }
            if (z17) {
                E = aVar4.b();
            } else {
                E = hd.E(aVar4.a(), ',');
            }
            Object[] objArr4 = new Object[1];
            objArr4[r19] = E;
            String a02 = hd.a0(null, null, 2131749733, objArr4);
            if (z17) {
                eqVarArr = this.f9210p2;
            } else {
                eqVarArr = this.f9209o2;
            }
            this.f9199e2.i(mb.s1(mb.Y0(z17, a02, eqVarArr), z17), z12, true);
            e1(z12);
        }
        if (z13 || z14) {
            StringBuilder sb2 = new StringBuilder(10);
            sb2.append('~');
            if (this.f9204j2.f4985a == bVar3) {
                d = ((org.telegram.messenger.i0) np.s1(this.f29679a).f25448y7.f25855l.f13134b).f24257a;
            } else {
                d = np.s1(this.f29679a).f25259d6 * 1.0E-5d;
            }
            org.telegram.messenger.r1.i().getClass();
            sb2.append(org.telegram.messenger.r1.g("USD", 2, (long) (this.f9204j2.c() * d * 100.0d), r19));
            this.f9200f2.c(sb2, z12, true);
        }
        if (z10 && z14) {
            String b10 = this.f9204j2.b();
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
            if (this.H0 == this.T1 && (w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28922h5, this.J0)) != this.H0) {
                P(w02);
                this.T1 = this.H0;
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void show() {
        super.show();
        org.telegram.messenger.g0.i3(new ch.w(this, 8), 50L);
    }

    @Override
    public final void v() {
        this.f9211q2 = true;
        d1();
    }
}
