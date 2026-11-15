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
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.messenger.lj;
import org.telegram.messenger.np;
import org.telegram.messenger.z10;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.e30;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.mb0;
import org.telegram.ui.an;
public final class s0 extends org.telegram.ui.ActionBar.u2 {
    public final cg.a A1;
    public final cg.a B1;
    public cg.a C1;
    public long D1;
    public int E1;
    public boolean F1;
    public final eq[] G1;
    public final eq[] H1;
    public boolean I1;
    public final b f9364m1;
    public final boolean n1;
    public final int f9365o1;
    public final e30 f9366p1;
    public final mb0 f9367q1;
    public final EditTextBoldCursor f9368r1;
    public final TextView f9369s1;
    public final q f9370t1;
    public final hi.d f9371u1;
    public final org.telegram.ui.Components.h6 f9372v1;
    public final ImageView f9373w1;
    public final ImageView f9374x1;
    public final cg.a f9375y1;
    public final cg.a f9376z1;

    public s0(final Context context, int i7, long j3, lj ljVar, an anVar, final org.telegram.ui.ActionBar.e6 e6Var, int i10, z10 z10Var) {
        super(1, context, e6Var, true);
        boolean z10;
        int i11;
        boolean z11;
        float f10;
        boolean z12;
        this.D1 = -1L;
        this.G1 = new eq[1];
        this.H1 = new eq[1];
        this.f9365o1 = i10;
        this.E = true;
        this.Q0 = true;
        boolean z13 = org.telegram.messenger.t3.z(i7, 24, j3);
        this.n1 = z13;
        if (!z13 && !v8.y(i7, true).j()) {
            z10 = false;
        } else {
            z10 = true;
        }
        org.telegram.messenger.p0 p0Var = np.s1(i7).f25448y7;
        long j10 = ((org.telegram.messenger.l0) p0Var.f25846g.f14544b).f24785c;
        cg.b bVar = cg.b.f4988b;
        this.A1 = cg.a.i(j10, bVar);
        this.B1 = cg.a.i(((org.telegram.messenger.l0) p0Var.h.f14544b).f24785c, bVar);
        cg.b bVar2 = cg.b.f4987a;
        this.f9375y1 = cg.a.g(((org.telegram.messenger.j0) p0Var.d.f15881b).f24493c, bVar2);
        this.f9376z1 = cg.a.g(((org.telegram.messenger.j0) p0Var.f25842e.f15881b).f24493c, bVar2);
        if (!z13) {
            b bVar3 = new b(i7, context, e6Var);
            this.f9364m1 = bVar3;
            bVar3.setScaleX(0.6f);
            bVar3.setScaleY(0.6f);
            bVar3.setAlpha(0.0f);
            bVar3.setEnabled(false);
            bVar3.setClickable(false);
            this.f29685c.addView(bVar3, c8.ja.d(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
            c8.na.a(bVar3);
            bVar3.setOnClickListener(new View.OnClickListener(this) {
                public final s0 f9251b;

                {
                    this.f9251b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r4) {
                        case 0:
                            if (this.f9251b.C1.f4985a == cg.b.f4987a) {
                                new db(context, e6Var).show();
                                return;
                            }
                            return;
                        default:
                            s0 s0Var = this.f9251b;
                            ((org.telegram.ui.ActionBar.u2) org.telegram.ui.Components.t4.Q(context, s0Var.D1, new a1.c(s0Var, 23), e6Var, 0).f25804b).show();
                            return;
                    }
                }
            });
        } else {
            this.f9364m1 = null;
        }
        Q(org.telegram.ui.ActionBar.j6.f28922h5);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        LinearLayout f11 = org.telegram.messenger.k5.f(context, 0);
        linearLayout.addView(f11, c8.ja.t(-1, 56, 55, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        int i12 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.q6.U(textView, i12, null);
        textView.setTextSize(1, 20.0f);
        textView.setGravity(8388627);
        if (i10 == 0) {
            i11 = 2131747077;
        } else {
            i11 = 2131747084;
        }
        textView.setText(hd.M0(i11, null));
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setEllipsize(TextUtils.TruncateAt.END);
        f11.addView(textView, c8.ja.q(-1, -1, 1.0f, 119, 22, 0, 22, 0));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131231269);
        int i13 = org.telegram.ui.ActionBar.j6.W5;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        org.telegram.ui.ActionBar.q6.s(imageView, i13, e6Var, mode);
        c8.na.a(imageView);
        boolean z14 = z10;
        imageView.setOnClickListener(new ah.d(this, 11));
        f11.addView(imageView, c8.ja.q(48, 48, 0.0f, 21, 0, 0, 6, 0));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f9368r1 = editTextBoldCursor;
        if (z14) {
            e30 e30Var = new e30(context, e6Var);
            this.f9366p1 = e30Var;
            ArrayList arrayList = new ArrayList();
            arrayList.add(hd.M0(2131744377, null));
            arrayList.add(hd.M0(2131744376, null));
            e30Var.b(arrayList, new l0(this, 1));
            linearLayout.addView(e30Var, c8.ja.k(18.0f, 0.0f, 18.0f, 12.0f, -1, -2));
        } else {
            this.f9366p1 = null;
        }
        LinearLayout f12 = org.telegram.messenger.k5.f(context, 1);
        linearLayout.addView(f12, c8.ja.l(1.0f, -1, -2));
        mb0 mb0Var = new mb0(context, null);
        this.f9367q1 = mb0Var;
        editTextBoldCursor.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setImeOptions(268435462);
        editTextBoldCursor.setTextSize(1, 17.0f);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setPadding(org.telegram.messenger.g0.L(42.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
        org.telegram.ui.ActionBar.q6.U(editTextBoldCursor, i12, null);
        editTextBoldCursor.requestFocus();
        mb0Var.setLeftPadding(org.telegram.messenger.g0.L(28.0f));
        mb0Var.e(editTextBoldCursor);
        cg.a aVar = ljVar.f24838a;
        if (aVar != null && !aVar.k()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        mb0Var.b(1.0f, f10, false);
        mb0Var.setForceUseCenter2(true);
        editTextBoldCursor.setOnFocusChangeListener(new ch.c0(this, 3));
        mb0Var.addView(editTextBoldCursor, c8.ja.e(-1, -2, 48));
        f12.addView(mb0Var, c8.ja.k(18.0f, 0.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView2 = new ImageView(context);
        this.f9373w1 = imageView2;
        imageView2.setImageResource(2131232753);
        mb0Var.addView(imageView2, c8.ja.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView3 = new ImageView(context);
        this.f9374x1 = imageView3;
        imageView3.setImageResource(2131231957);
        mb0Var.addView(imageView3, c8.ja.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(context, false, false, false);
        this.f9372v1 = h6Var;
        int i14 = org.telegram.ui.ActionBar.j6.f29241y6;
        org.telegram.ui.ActionBar.q6.Y(h6Var, i14, null);
        h6Var.setTextSize(org.telegram.messenger.g0.L(13.0f));
        h6Var.setGravity(5);
        mb0Var.addView(h6Var, c8.ja.d(-2, -1.0f, 21, 0.0f, 0.0f, 16.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.f9369s1 = textView2;
        org.telegram.ui.ActionBar.q6.U(textView2, i14, null);
        textView2.setTextSize(1, 13.0f);
        f12.addView(textView2, c8.ja.t(-1, -2, 55, 33, 4, 33, 0));
        q qVar = new q(context, 1);
        this.f9370t1 = qVar;
        qVar.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        qVar.setCursorWidth(1.5f);
        qVar.setTextSize(1, 17.0f);
        qVar.setMaxLines(1);
        qVar.setBackground(null);
        qVar.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
        org.telegram.ui.ActionBar.q6.U(qVar, i12, null);
        qVar.setFocusable(false);
        qVar.setClickable(false);
        qVar.setEnabled(false);
        mb0 mb0Var2 = new mb0(context, null);
        mb0Var2.setText(hd.M0(2131747074, null));
        mb0Var2.e(qVar);
        mb0Var2.addView(qVar, c8.ja.d(-1, -2.0f, 48, 0.0f, 0.0f, 48.0f, 0.0f));
        c8.na.b(mb0Var2, 0.02f, 1.2f);
        mb0Var2.setOnClickListener(new View.OnClickListener(this) {
            public final s0 f9251b;

            {
                this.f9251b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r4) {
                    case 0:
                        if (this.f9251b.C1.f4985a == cg.b.f4987a) {
                            new db(context, e6Var).show();
                            return;
                        }
                        return;
                    default:
                        s0 s0Var = this.f9251b;
                        ((org.telegram.ui.ActionBar.u2) org.telegram.ui.Components.t4.Q(context, s0Var.D1, new a1.c(s0Var, 23), e6Var, 0).f25804b).show();
                        return;
                }
            }
        });
        f12.addView(mb0Var2, c8.ja.k(18.0f, 24.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView4 = new ImageView(context);
        imageView4.setImageResource(2131230871);
        org.telegram.ui.ActionBar.q6.s(imageView4, i13, e6Var, mode);
        mb0Var2.addView(imageView4, c8.ja.d(24, 24.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
        TextView textView3 = new TextView(context);
        org.telegram.ui.ActionBar.q6.U(textView3, i14, null);
        textView3.setTextSize(1, 13.0f);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.X2(hd.M0(2131747094, null)));
        spannableStringBuilder.append(' ');
        org.telegram.messenger.k5.p(null, null, 2131747093, new Object[]{Long.valueOf(np.s1(i7).f25448y7.f25849i.z0(TimeUnit.HOURS))}, spannableStringBuilder);
        textView3.setText(spannableStringBuilder);
        f12.addView(textView3, c8.ja.t(-1, -2, 55, 33, 4, 33, 24));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout.addView(linearLayout2, c8.ja.r(-1, -2, 80));
        hi.d dVar = new hi.d(context, e6Var, true);
        this.f9371u1 = dVar;
        dVar.setOnClickListener(new r0(this, anVar, i7, context, e6Var, j3, z10Var));
        if (i10 == 1) {
            dVar.i(hd.M0(2131747083, null), false, true);
        }
        linearLayout2.addView(dVar, c8.ja.k(18.0f, 0.0f, 18.0f, 8.0f, -1, 48));
        if (aVar != null) {
            z12 = false;
            M0(cg.a.i(aVar.f4986b, aVar.f4985a), !aVar.k(), true, false);
        } else {
            z12 = false;
            M0(cg.a.i(0L, bVar2), false, true, false);
        }
        long j11 = ljVar.f24839b;
        if (this.D1 != j11) {
            this.D1 = j11;
            qVar.setText(K0(j11));
        }
        J0(z12);
        this.O = linearLayout;
        editTextBoldCursor.addTextChangedListener(new ah.j(this, 3));
    }

    public static String K0(long j3) {
        if (j3 <= 0) {
            return hd.M0(2131747092, null);
        }
        String x10 = hd.x(j3, true);
        if (!x10.isEmpty()) {
            return Character.toUpperCase(x10.charAt(0)) + x10.substring(1);
        }
        return x10;
    }

    public final void I0() {
        boolean z10;
        float f10;
        boolean z11 = this.I1;
        b bVar = this.f9364m1;
        if ((z11 && !this.J && bVar != null && this.f29682b.getY() > org.telegram.messenger.g0.L(32.0f)) || this.f9366p1 == null) {
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
                i20.m(scaleY, f12, 180L);
            }
        }
    }

    public final void J0(boolean z10) {
        boolean z11;
        if (this.E1 == 0 && (this.C1.f4986b >= 0 || this.D1 > 0)) {
            z11 = true;
        } else {
            z11 = false;
        }
        hi.d dVar = this.f9371u1;
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

    public final cg.a L0() {
        if (this.C1.f4985a == cg.b.f4988b) {
            return this.B1;
        }
        return this.f9376z1;
    }

    public final void M0(cg.a aVar, boolean z10, boolean z11, boolean z12) {
        boolean z13;
        boolean z14;
        boolean z15;
        ?? r16;
        int i7;
        int i10;
        boolean z16;
        String E;
        eq[] eqVarArr;
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
            this.C1 = cg.a.i(0L, aVar3.f4985a);
            this.E1 |= 1;
        }
        long j3 = L0().f4986b;
        cg.a aVar4 = this.C1;
        if (j3 < aVar4.f4986b) {
            this.E1 |= 4;
        }
        boolean k10 = aVar4.k();
        cg.a aVar5 = this.f9375y1;
        cg.a aVar6 = this.A1;
        cg.b bVar = cg.b.f4988b;
        if (!k10) {
            cg.a aVar7 = this.C1;
            if (aVar7.f4985a == bVar) {
                aVar2 = aVar6;
            } else {
                aVar2 = aVar5;
            }
            if (aVar2.f4986b > aVar7.f4986b) {
                this.E1 |= 2;
            }
        }
        if (!z11 && aVar3.f4985a == this.C1.f4985a) {
            z13 = false;
        } else {
            z13 = true;
        }
        if (!z11 && aVar3.f4986b == this.C1.f4986b) {
            z14 = false;
        } else {
            z14 = true;
        }
        if (!z11 && i12 == this.E1) {
            z15 = false;
        } else {
            z15 = true;
        }
        mb0 mb0Var = this.f9367q1;
        if (z15) {
            if ((this.E1 & (-9)) == 0) {
                f18 = 0.0f;
            } else {
                f18 = 1.0f;
            }
            mb0Var.a(f18);
        }
        cg.b bVar2 = cg.b.f4987a;
        EditTextBoldCursor editTextBoldCursor = this.f9368r1;
        if (z13) {
            e30 e30Var = this.f9366p1;
            boolean z17 = false;
            if (e30Var != null) {
                if (this.C1.f4985a == bVar2) {
                    i11 = 0;
                } else {
                    i11 = 1;
                }
                e30Var.a(i11, z12);
            }
            cg.b bVar3 = this.C1.f4985a;
            TextView textView = this.f9369s1;
            if (bVar3 == bVar2) {
                textView.setText(hd.M0(2131747080, null));
                editTextBoldCursor.setInputType(2);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(L0().a()).length())});
            } else if (bVar3 == bVar) {
                textView.setText(hd.M0(2131747079, null));
                editTextBoldCursor.setInputType(8194);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(L0().a()).length() + 3)});
            }
            ImageView imageView = this.f9374x1;
            ImageView imageView2 = this.f9373w1;
            if (z12) {
                ViewPropertyAnimator animate = imageView2.animate();
                i7 = 2;
                if (this.C1.f4985a == bVar2) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                ViewPropertyAnimator alpha = animate.alpha(f12);
                if (this.C1.f4985a == bVar2) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                ViewPropertyAnimator scaleX = alpha.scaleX(f13);
                if (this.C1.f4985a == bVar2) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                scaleX.scaleY(f14).setDuration(180L).start();
                ViewPropertyAnimator animate2 = imageView.animate();
                if (this.C1.f4985a == bVar) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.0f;
                }
                ViewPropertyAnimator alpha2 = animate2.alpha(f15);
                if (this.C1.f4985a == bVar) {
                    f16 = 1.0f;
                } else {
                    f16 = 0.0f;
                }
                ViewPropertyAnimator scaleX2 = alpha2.scaleX(f16);
                if (this.C1.f4985a == bVar) {
                    f17 = 1.0f;
                } else {
                    f17 = 0.0f;
                }
                scaleX2.scaleY(f17).setDuration(180L).start();
            } else {
                i7 = 2;
                if (this.C1.f4985a == bVar2) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                imageView2.setAlpha(f10);
                if (this.C1.f4985a == bVar) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                imageView.setAlpha(f11);
            }
            b bVar4 = this.f9364m1;
            r16 = z17;
            if (bVar4 != null) {
                cg.b bVar5 = this.C1.f4985a;
                r16 = z17;
                if (bVar4.f8230e != bVar5) {
                    bVar4.f8230e = bVar5;
                    bVar4.a();
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
                objArr[r16] = L0().f();
                mb0Var.setText(hd.a0(null, null, 2131744418, objArr));
            } else if ((i13 & 2) != 0) {
                if (this.C1.f4985a == bVar) {
                    aVar5 = aVar6;
                }
                String f19 = aVar5.f();
                Object[] objArr2 = new Object[1];
                objArr2[r16] = f19;
                mb0Var.setText(hd.a0(null, null, 2131744417, objArr2));
            } else {
                if (this.C1.f4985a == bVar2) {
                    i10 = 2131747076;
                } else {
                    i10 = 2131747075;
                }
                mb0Var.setText(hd.M0(i10, null));
            }
        }
        if (z13 || z14 || z15) {
            int i14 = this.f9365o1;
            hi.d dVar = this.f9371u1;
            if (i14 == 0) {
                if (!this.C1.k()) {
                    cg.a aVar8 = this.C1;
                    if (aVar8.f4985a == bVar) {
                        z16 = true;
                    } else {
                        z16 = r16;
                    }
                    if (z16) {
                        E = aVar8.b();
                    } else {
                        E = hd.E(aVar8.a(), ',');
                    }
                    Object[] objArr3 = new Object[1];
                    objArr3[r16] = E;
                    String a02 = hd.a0(null, null, 2131747081, objArr3);
                    if (z16) {
                        eqVarArr = this.H1;
                    } else {
                        eqVarArr = this.G1;
                    }
                    dVar.i(mb.s1(mb.Y0(z16, a02, eqVarArr), z16), z12, true);
                } else {
                    dVar.i(hd.M0(2131747082, null), z12, true);
                }
            } else {
                dVar.i(hd.M0(2131747083, null), z12, true);
            }
            J0(z12);
        }
        if (z13 || z14) {
            StringBuilder sb2 = new StringBuilder(10);
            sb2.append('~');
            if (this.C1.f4985a == bVar) {
                d = ((org.telegram.messenger.i0) np.s1(this.f29679a).f25448y7.f25855l.f13134b).f24257a;
            } else {
                d = np.s1(this.f29679a).f25259d6 * 1.0E-5d;
            }
            org.telegram.messenger.r1.i().getClass();
            sb2.append(org.telegram.messenger.r1.g("USD", i7, (long) (this.C1.c() * d * 100.0d), r16));
            this.f9372v1.c(sb2, z12, true);
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
        if (this.F1 && (bVar = this.f9364m1) != null && f10 >= bVar.getX() && f10 <= bVar.getX() + bVar.getWidth() && f11 >= bVar.getY() && f11 <= bVar.getY() + bVar.getHeight()) {
            return false;
        }
        return super.Y(f10, f11);
    }

    @Override
    public final void g0(float f10) {
        super.g0(f10);
        I0();
    }

    @Override
    public final void show() {
        super.show();
        org.telegram.messenger.g0.i3(new ch.w(this, 9), 50L);
    }

    @Override
    public final void v() {
        this.I1 = true;
        I0();
    }
}
