package di;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.telegram.messenger.gd;
import org.telegram.messenger.kj;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.messenger.x10;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.lq;
import org.telegram.ui.Components.m30;
import org.telegram.ui.Components.xb0;
import org.telegram.ui.bn;
public final class r0 extends org.telegram.ui.ActionBar.x2 {
    public final cg.a A1;
    public final cg.a B1;
    public cg.a C1;
    public long D1;
    public int E1;
    public boolean F1;
    public final lq[] G1;
    public final lq[] H1;
    public boolean I1;
    public final b f9606m1;
    public final boolean n1;
    public final int f9607o1;
    public final m30 f9608p1;
    public final xb0 f9609q1;
    public final EditTextBoldCursor f9610r1;
    public final TextView f9611s1;
    public final q f9612t1;
    public final hi.d f9613u1;
    public final org.telegram.ui.Components.n6 f9614v1;
    public final ImageView f9615w1;
    public final ImageView f9616x1;
    public final cg.a f9617y1;
    public final cg.a f9618z1;

    public r0(final Context context, int i7, long j3, kj kjVar, bn bnVar, final org.telegram.ui.ActionBar.i6 i6Var, int i10, x10 x10Var) {
        super(1, context, i6Var, true);
        boolean z10;
        int i11;
        boolean z11;
        float f10;
        boolean z12;
        this.D1 = -1L;
        this.G1 = new lq[1];
        this.H1 = new lq[1];
        this.f9607o1 = i10;
        this.E = true;
        this.Q0 = true;
        boolean z13 = org.telegram.messenger.v3.z(i7, 24, j3);
        this.n1 = z13;
        if (!z13 && !x8.y(i7, true).j()) {
            z10 = false;
        } else {
            z10 = true;
        }
        org.telegram.messenger.p0 p0Var = mp.u1(i7).A7;
        long j10 = ((org.telegram.messenger.l0) p0Var.f26142g.f13998b).f25308c;
        cg.b bVar = cg.b.f5274b;
        this.A1 = cg.a.j(j10, bVar);
        this.B1 = cg.a.j(((org.telegram.messenger.l0) p0Var.h.f13998b).f25308c, bVar);
        cg.b bVar2 = cg.b.f5273a;
        this.f9617y1 = cg.a.h(((org.telegram.messenger.j0) p0Var.d.f15536b).f24764c, bVar2);
        this.f9618z1 = cg.a.h(((org.telegram.messenger.j0) p0Var.f26138e.f15536b).f24764c, bVar2);
        if (!z13) {
            b bVar3 = new b(i7, context, i6Var);
            this.f9606m1 = bVar3;
            bVar3.setScaleX(0.6f);
            bVar3.setScaleY(0.6f);
            bVar3.setAlpha(0.0f);
            bVar3.setEnabled(false);
            bVar3.setClickable(false);
            this.f30193c.addView(bVar3, c8.ma.d(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
            c8.ra.a(bVar3);
            bVar3.setOnClickListener(new View.OnClickListener(this) {
                public final r0 f9494b;

                {
                    this.f9494b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r4) {
                        case 0:
                            if (this.f9494b.C1.f5271a == cg.b.f5273a) {
                                new gb(context, i6Var).show();
                                return;
                            }
                            return;
                        default:
                            r0 r0Var = this.f9494b;
                            org.telegram.ui.Components.b5.Q(context, r0Var.D1, new a1.c(r0Var, 23), i6Var, 0).C2();
                            return;
                    }
                }
            });
        } else {
            this.f9606m1 = null;
        }
        Q(org.telegram.ui.ActionBar.n6.f29467h5);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        LinearLayout g10 = org.telegram.messenger.f3.g(context, 0);
        linearLayout.addView(g10, c8.ma.t(-1, 56, 55, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        int i12 = org.telegram.ui.ActionBar.n6.G6;
        org.telegram.ui.ActionBar.u6.U(textView, i12, null);
        textView.setTextSize(1, 20.0f);
        textView.setGravity(8388627);
        if (i10 == 0) {
            i11 = 2131746884;
        } else {
            i11 = 2131746891;
        }
        textView.setText(gd.M0(i11, null));
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setEllipsize(TextUtils.TruncateAt.END);
        g10.addView(textView, c8.ma.q(-1, -1, 1.0f, 119, 22, 0, 22, 0));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131231269);
        int i13 = org.telegram.ui.ActionBar.n6.W5;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        org.telegram.ui.ActionBar.u6.s(imageView, i13, i6Var, mode);
        c8.ra.a(imageView);
        boolean z14 = z10;
        imageView.setOnClickListener(new ah.d(this, 13));
        g10.addView(imageView, c8.ma.q(48, 48, 0.0f, 21, 0, 0, 6, 0));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f9610r1 = editTextBoldCursor;
        if (z14) {
            m30 m30Var = new m30(context, i6Var);
            this.f9608p1 = m30Var;
            ArrayList arrayList = new ArrayList();
            arrayList.add(gd.M0(2131744142, null));
            arrayList.add(gd.M0(2131744141, null));
            m30Var.b(arrayList, new k0(this, 1));
            linearLayout.addView(m30Var, c8.ma.k(18.0f, 0.0f, 18.0f, 12.0f, -1, -2));
        } else {
            this.f9608p1 = null;
        }
        LinearLayout g11 = org.telegram.messenger.f3.g(context, 1);
        linearLayout.addView(g11, c8.ma.l(1.0f, -1, -2));
        xb0 xb0Var = new xb0(context, null);
        this.f9609q1 = xb0Var;
        editTextBoldCursor.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setImeOptions(268435462);
        editTextBoldCursor.setTextSize(1, 17.0f);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setPadding(org.telegram.messenger.g0.L(42.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
        org.telegram.ui.ActionBar.u6.U(editTextBoldCursor, i12, null);
        editTextBoldCursor.requestFocus();
        xb0Var.setLeftPadding(org.telegram.messenger.g0.L(28.0f));
        xb0Var.e(editTextBoldCursor);
        cg.a aVar = kjVar.f25040a;
        if (aVar != null && !aVar.l()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        xb0Var.b(1.0f, f10, false);
        xb0Var.setForceUseCenter2(true);
        editTextBoldCursor.setOnFocusChangeListener(new ch.c0(this, 2));
        xb0Var.addView(editTextBoldCursor, c8.ma.e(-1, -2, 48));
        g11.addView(xb0Var, c8.ma.k(18.0f, 0.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView2 = new ImageView(context);
        this.f9615w1 = imageView2;
        imageView2.setImageResource(2131232754);
        xb0Var.addView(imageView2, c8.ma.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView3 = new ImageView(context);
        this.f9616x1 = imageView3;
        imageView3.setImageResource(2131231958);
        xb0Var.addView(imageView3, c8.ma.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(context, false, false, false);
        this.f9614v1 = n6Var;
        int i14 = org.telegram.ui.ActionBar.n6.f29786y6;
        org.telegram.ui.ActionBar.u6.Y(n6Var, i14, null);
        n6Var.setTextSize(org.telegram.messenger.g0.L(13.0f));
        n6Var.setGravity(5);
        xb0Var.addView(n6Var, c8.ma.d(-2, -1.0f, 21, 0.0f, 0.0f, 16.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.f9611s1 = textView2;
        org.telegram.ui.ActionBar.u6.U(textView2, i14, null);
        textView2.setTextSize(1, 13.0f);
        g11.addView(textView2, c8.ma.t(-1, -2, 55, 33, 4, 33, 0));
        q qVar = new q(context, 1);
        this.f9612t1 = qVar;
        qVar.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        qVar.setCursorWidth(1.5f);
        qVar.setTextSize(1, 17.0f);
        qVar.setMaxLines(1);
        qVar.setBackground(null);
        qVar.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
        org.telegram.ui.ActionBar.u6.U(qVar, i12, null);
        qVar.setFocusable(false);
        qVar.setClickable(false);
        qVar.setEnabled(false);
        xb0 xb0Var2 = new xb0(context, null);
        xb0Var2.setText(gd.M0(2131746881, null));
        xb0Var2.e(qVar);
        xb0Var2.addView(qVar, c8.ma.d(-1, -2.0f, 48, 0.0f, 0.0f, 48.0f, 0.0f));
        c8.ra.b(xb0Var2, 0.02f, 1.2f);
        xb0Var2.setOnClickListener(new View.OnClickListener(this) {
            public final r0 f9494b;

            {
                this.f9494b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r4) {
                    case 0:
                        if (this.f9494b.C1.f5271a == cg.b.f5273a) {
                            new gb(context, i6Var).show();
                            return;
                        }
                        return;
                    default:
                        r0 r0Var = this.f9494b;
                        org.telegram.ui.Components.b5.Q(context, r0Var.D1, new a1.c(r0Var, 23), i6Var, 0).C2();
                        return;
                }
            }
        });
        g11.addView(xb0Var2, c8.ma.k(18.0f, 24.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView4 = new ImageView(context);
        imageView4.setImageResource(2131230871);
        org.telegram.ui.ActionBar.u6.s(imageView4, i13, i6Var, mode);
        xb0Var2.addView(imageView4, c8.ma.d(24, 24.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
        TextView textView3 = new TextView(context);
        org.telegram.ui.ActionBar.u6.U(textView3, i14, null);
        textView3.setTextSize(1, 13.0f);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.W2(gd.M0(2131746901, null)));
        spannableStringBuilder.append(' ');
        org.telegram.messenger.f3.p(null, null, 2131746900, new Object[]{Long.valueOf(mp.u1(i7).A7.f26145i.n2(TimeUnit.HOURS))}, spannableStringBuilder);
        textView3.setText(spannableStringBuilder);
        g11.addView(textView3, c8.ma.t(-1, -2, 55, 33, 4, 33, 24));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout.addView(linearLayout2, c8.ma.r(-1, -2, 80));
        hi.d dVar = new hi.d(context, i6Var, true);
        this.f9613u1 = dVar;
        dVar.setOnClickListener(new q0(this, bnVar, i7, context, i6Var, j3, x10Var));
        if (i10 == 1) {
            dVar.i(gd.M0(2131746890, null), false, true);
        }
        linearLayout2.addView(dVar, c8.ma.k(18.0f, 0.0f, 18.0f, 8.0f, -1, 48));
        if (aVar != null) {
            z12 = false;
            N0(cg.a.j(aVar.f5272b, aVar.f5271a), !aVar.l(), true, false);
        } else {
            z12 = false;
            N0(cg.a.j(0L, bVar2), false, true, false);
        }
        long j11 = kjVar.f25041b;
        if (this.D1 != j11) {
            this.D1 = j11;
            qVar.setText(L0(j11));
        }
        K0(z12);
        this.O = linearLayout;
        editTextBoldCursor.addTextChangedListener(new ah.j(this, 4));
    }

    public static String L0(long j3) {
        if (j3 <= 0) {
            return gd.M0(2131746899, null);
        }
        String x10 = gd.x(j3, true);
        if (!x10.isEmpty()) {
            return Character.toUpperCase(x10.charAt(0)) + x10.substring(1);
        }
        return x10;
    }

    public final void J0() {
        boolean z10;
        float f10;
        boolean z11 = this.I1;
        b bVar = this.f9606m1;
        if ((z11 && !this.J && bVar != null && this.f30190b.getY() > org.telegram.messenger.g0.L(32.0f)) || this.f9608p1 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.F1 != z10) {
            this.F1 = z10;
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
                n10.n(scaleY, f12, 180L);
            }
        }
    }

    public final void K0(boolean z10) {
        boolean z11;
        if (this.E1 == 0 && (this.C1.f5272b >= 0 || this.D1 > 0)) {
            z11 = true;
        } else {
            z11 = false;
        }
        hi.d dVar = this.f9613u1;
        if (dVar.f14339e0 != z11) {
            dVar.setEnabled(z11);
            dVar.setClickable(z11);
            float f10 = 0.6f;
            if (z10) {
                ViewPropertyAnimator animate = dVar.animate();
                if (z11) {
                    f10 = 1.0f;
                }
                n10.n(animate, f10, 180L);
                return;
            }
            if (z11) {
                f10 = 1.0f;
            }
            dVar.setAlpha(f10);
        }
    }

    public final cg.a M0() {
        if (this.C1.f5271a == cg.b.f5274b) {
            return this.B1;
        }
        return this.f9618z1;
    }

    public final void N0(cg.a aVar, boolean z10, boolean z11, boolean z12) {
        boolean z13;
        boolean z14;
        boolean z15;
        ?? r16;
        int i7;
        int i10;
        boolean z16;
        String E;
        lq[] lqVarArr;
        double d;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        int i11;
        float f18;
        cg.a aVar2;
        cg.a aVar3 = this.C1;
        int i12 = this.E1;
        this.E1 = 0;
        if (aVar != null) {
            this.C1 = aVar;
        } else {
            this.C1 = cg.a.j(0L, aVar3.f5271a);
            this.E1 |= 1;
        }
        long j3 = M0().f5272b;
        cg.a aVar4 = this.C1;
        if (j3 < aVar4.f5272b) {
            this.E1 |= 4;
        }
        boolean l10 = aVar4.l();
        cg.a aVar5 = this.f9617y1;
        cg.a aVar6 = this.A1;
        cg.b bVar = cg.b.f5274b;
        if (!l10) {
            cg.a aVar7 = this.C1;
            if (aVar7.f5271a == bVar) {
                aVar2 = aVar6;
            } else {
                aVar2 = aVar5;
            }
            if (aVar2.f5272b > aVar7.f5272b) {
                this.E1 |= 2;
            }
        }
        if (!z11 && aVar3.f5271a == this.C1.f5271a) {
            z13 = false;
        } else {
            z13 = true;
        }
        if (!z11 && aVar3.f5272b == this.C1.f5272b) {
            z14 = false;
        } else {
            z14 = true;
        }
        if (!z11 && i12 == this.E1) {
            z15 = false;
        } else {
            z15 = true;
        }
        xb0 xb0Var = this.f9609q1;
        if (z15) {
            if ((this.E1 & (-9)) == 0) {
                f18 = 0.0f;
            } else {
                f18 = 1.0f;
            }
            xb0Var.a(f18);
        }
        cg.b bVar2 = cg.b.f5273a;
        EditTextBoldCursor editTextBoldCursor = this.f9610r1;
        if (z13) {
            m30 m30Var = this.f9608p1;
            boolean z17 = false;
            if (m30Var != null) {
                if (this.C1.f5271a == bVar2) {
                    i11 = 0;
                } else {
                    i11 = 1;
                }
                m30Var.a(i11, z12);
            }
            cg.b bVar3 = this.C1.f5271a;
            TextView textView = this.f9611s1;
            if (bVar3 == bVar2) {
                textView.setText(gd.M0(2131746887, null));
                editTextBoldCursor.setInputType(2);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(M0().a()).length())});
            } else if (bVar3 == bVar) {
                textView.setText(gd.M0(2131746886, null));
                editTextBoldCursor.setInputType(8194);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(M0().a()).length() + 3)});
            }
            ImageView imageView = this.f9616x1;
            ImageView imageView2 = this.f9615w1;
            if (z12) {
                ViewPropertyAnimator animate = imageView2.animate();
                i7 = 2;
                if (this.C1.f5271a == bVar2) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                ViewPropertyAnimator alpha = animate.alpha(f12);
                if (this.C1.f5271a == bVar2) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                ViewPropertyAnimator scaleX = alpha.scaleX(f13);
                if (this.C1.f5271a == bVar2) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                scaleX.scaleY(f14).setDuration(180L).start();
                ViewPropertyAnimator animate2 = imageView.animate();
                if (this.C1.f5271a == bVar) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.0f;
                }
                ViewPropertyAnimator alpha2 = animate2.alpha(f15);
                if (this.C1.f5271a == bVar) {
                    f16 = 1.0f;
                } else {
                    f16 = 0.0f;
                }
                ViewPropertyAnimator scaleX2 = alpha2.scaleX(f16);
                if (this.C1.f5271a == bVar) {
                    f17 = 1.0f;
                } else {
                    f17 = 0.0f;
                }
                scaleX2.scaleY(f17).setDuration(180L).start();
            } else {
                i7 = 2;
                if (this.C1.f5271a == bVar2) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                imageView2.setAlpha(f10);
                if (this.C1.f5271a == bVar) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                imageView.setAlpha(f11);
            }
            b bVar4 = this.f9606m1;
            r16 = z17;
            if (bVar4 != null) {
                cg.b bVar5 = this.C1.f5271a;
                r16 = z17;
                if (bVar4.f8511e != bVar5) {
                    bVar4.f8511e = bVar5;
                    bVar4.b();
                    r16 = z17;
                }
            }
        } else {
            r16 = 0;
            i7 = 2;
        }
        if (z13 || z15) {
            int i13 = this.E1;
            if ((i13 & 4) != 0) {
                Object[] objArr = new Object[1];
                objArr[r16] = M0().g();
                xb0Var.setText(gd.a0(null, null, 2131744183, objArr));
            } else if ((i13 & 2) != 0) {
                if (this.C1.f5271a == bVar) {
                    aVar5 = aVar6;
                }
                String g10 = aVar5.g();
                Object[] objArr2 = new Object[1];
                objArr2[r16] = g10;
                xb0Var.setText(gd.a0(null, null, 2131744182, objArr2));
            } else {
                if (this.C1.f5271a == bVar2) {
                    i10 = 2131746883;
                } else {
                    i10 = 2131746882;
                }
                xb0Var.setText(gd.M0(i10, null));
            }
        }
        if (z13 || z14 || z15) {
            int i14 = this.f9607o1;
            hi.d dVar = this.f9613u1;
            if (i14 == 0) {
                if (!this.C1.l()) {
                    cg.a aVar8 = this.C1;
                    if (aVar8.f5271a == bVar) {
                        z16 = true;
                    } else {
                        z16 = r16;
                    }
                    if (z16) {
                        E = aVar8.b();
                    } else {
                        E = gd.E(aVar8.a(), ',');
                    }
                    Object[] objArr3 = new Object[1];
                    objArr3[r16] = E;
                    String a02 = gd.a0(null, null, 2131746888, objArr3);
                    if (z16) {
                        lqVarArr = this.H1;
                    } else {
                        lqVarArr = this.G1;
                    }
                    dVar.i(pb.t1(pb.Z0(z16, a02, lqVarArr), z16), z12, true);
                } else {
                    dVar.i(gd.M0(2131746889, null), z12, true);
                }
            } else {
                dVar.i(gd.M0(2131746890, null), z12, true);
            }
            K0(z12);
        }
        if (z13 || z14) {
            StringBuilder sb2 = new StringBuilder(10);
            sb2.append('~');
            if (this.C1.f5271a == bVar) {
                d = ((org.telegram.messenger.i0) mp.u1(this.f30187a).A7.f26151l.f15642b).f24532a;
            } else {
                d = mp.u1(this.f30187a).f25648f6 * 1.0E-5d;
            }
            org.telegram.messenger.r1.i().getClass();
            sb2.append(org.telegram.messenger.r1.g("USD", i7, (long) (this.C1.c() * d * 100.0d), r16));
            this.f9614v1.c(sb2, z12, true);
        }
        if (z10 && z14) {
            String b10 = this.C1.b();
            editTextBoldCursor.setText(b10);
            editTextBoldCursor.setSelection(b10.length());
        }
    }

    @Override
    public final boolean Y(float f10, float f11) {
        b bVar;
        if (this.F1 && (bVar = this.f9606m1) != null && f10 >= bVar.getX() && f10 <= bVar.getX() + bVar.getWidth() && f11 >= bVar.getY() && f11 <= bVar.getY() + bVar.getHeight()) {
            return false;
        }
        return super.Y(f10, f11);
    }

    @Override
    public final void g0(float f10) {
        super.g0(f10);
        J0();
    }

    @Override
    public final void show() {
        super.show();
        org.telegram.messenger.g0.h3(new ca.r(this, 13), 50L);
    }

    @Override
    public final void v() {
        this.I1 = true;
        J0();
    }
}
