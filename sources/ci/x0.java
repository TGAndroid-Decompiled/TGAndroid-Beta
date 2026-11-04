package ci;

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
import b8.mf;
import b8.pf;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.telegram.messenger.bd;
import org.telegram.messenger.ej;
import org.telegram.messenger.hp;
import org.telegram.messenger.u10;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.gb0;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.x20;
import org.telegram.ui.wm;
public final class x0 extends org.telegram.ui.ActionBar.t2 {
    public long A1;
    public int B1;
    public boolean C1;
    public final wp[] D1;
    public final wp[] E1;
    public boolean F1;
    public final c f6310j1;
    public final boolean k1;
    public final int f6311l1;
    public final x20 m1;
    public final gb0 f6312n1;
    public final EditTextBoldCursor f6313o1;
    public final TextView f6314p1;
    public final s f6315q1;
    public final gi.d f6316r1;
    public final org.telegram.ui.Components.h6 f6317s1;
    public final ImageView f6318t1;
    public final ImageView f6319u1;
    public final dg.a f6320v1;
    public final dg.a f6321w1;
    public final dg.a f6322x1;
    public final dg.a f6323y1;
    public dg.a f6324z1;

    public x0(final Context context, int i3, long j10, ej ejVar, wm wmVar, final org.telegram.ui.ActionBar.e6 e6Var, int i10, u10 u10Var) {
        super(1, context, e6Var, true);
        boolean z10;
        int i11;
        boolean z11;
        float f10;
        boolean z12;
        this.A1 = -1L;
        this.D1 = new wp[1];
        this.E1 = new wp[1];
        this.f6311l1 = i10;
        this.E = true;
        this.Q0 = true;
        boolean z13 = org.telegram.messenger.t3.z(i3, 24, j10);
        this.k1 = z13;
        if (!z13 && !e9.y(i3, true).j()) {
            z10 = false;
        } else {
            z10 = true;
        }
        org.telegram.messenger.p0 p0Var = hp.s1(i3).f23167x7;
        long j11 = ((org.telegram.messenger.l0) p0Var.f24656g.f13688b).f23921c;
        dg.b bVar = dg.b.f8926b;
        this.f6322x1 = dg.a.i(j11, bVar);
        this.f6323y1 = dg.a.i(((org.telegram.messenger.l0) p0Var.h.f13688b).f23921c, bVar);
        dg.b bVar2 = dg.b.f8925a;
        this.f6320v1 = dg.a.g(((org.telegram.messenger.j0) p0Var.d.f13798b).f23620c, bVar2);
        this.f6321w1 = dg.a.g(((org.telegram.messenger.j0) p0Var.f24652e.f13798b).f23620c, bVar2);
        if (!z13) {
            c cVar = new c(i3, context, e6Var);
            this.f6310j1 = cVar;
            cVar.setScaleX(0.6f);
            cVar.setScaleY(0.6f);
            cVar.setAlpha(0.0f);
            cVar.setEnabled(false);
            cVar.setClickable(false);
            this.f28589c.addView(cVar, mf.d(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
            pf.a(cVar);
            cVar.setOnClickListener(new View.OnClickListener(this) {
                public final x0 f6162b;

                {
                    this.f6162b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r4) {
                        case 0:
                            if (this.f6162b.f6324z1.f8923a == dg.b.f8925a) {
                                new nb(context, e6Var).show();
                                return;
                            }
                            return;
                        default:
                            x0 x0Var = this.f6162b;
                            ((org.telegram.ui.ActionBar.t2) org.telegram.ui.Components.t4.S(context, x0Var.A1, new a1.c(x0Var, 12), e6Var, 0).f14429b).show();
                            return;
                    }
                }
            });
        } else {
            this.f6310j1 = null;
        }
        P(org.telegram.ui.ActionBar.k6.f27954h5);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        LinearLayout f11 = org.telegram.messenger.k5.f(context, 0);
        linearLayout.addView(f11, mf.t(-1, 56, 55, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        int i12 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.V(textView, i12, null);
        textView.setTextSize(1, 20.0f);
        textView.setGravity(8388627);
        if (i10 == 0) {
            i11 = 2131747085;
        } else {
            i11 = 2131747092;
        }
        textView.setText(bd.M0(i11, null));
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setEllipsize(TextUtils.TruncateAt.END);
        f11.addView(textView, mf.q(-1, -1, 1.0f, 119, 22, 0, 22, 0));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131231269);
        int i13 = org.telegram.ui.ActionBar.k6.W5;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        org.telegram.ui.ActionBar.r6.t(imageView, i13, e6Var, mode);
        pf.a(imageView);
        boolean z14 = z10;
        imageView.setOnClickListener(new ai.b(this, 7));
        f11.addView(imageView, mf.q(48, 48, 0.0f, 21, 0, 0, 6, 0));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f6313o1 = editTextBoldCursor;
        if (z14) {
            x20 x20Var = new x20(context, e6Var);
            this.m1 = x20Var;
            ArrayList arrayList = new ArrayList();
            arrayList.add(bd.M0(2131744387, null));
            arrayList.add(bd.M0(2131744386, null));
            x20Var.b(arrayList, new p0(this, 1));
            linearLayout.addView(x20Var, mf.k(18.0f, 0.0f, 18.0f, 12.0f, -1, -2));
        } else {
            this.m1 = null;
        }
        LinearLayout f12 = org.telegram.messenger.k5.f(context, 1);
        linearLayout.addView(f12, mf.l(1.0f, -1, -2));
        gb0 gb0Var = new gb0(context, null);
        this.f6312n1 = gb0Var;
        editTextBoldCursor.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setImeOptions(268435462);
        editTextBoldCursor.setTextSize(1, 17.0f);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setPadding(org.telegram.messenger.g0.L(42.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
        org.telegram.ui.ActionBar.r6.V(editTextBoldCursor, i12, null);
        editTextBoldCursor.requestFocus();
        gb0Var.setLeftPadding(org.telegram.messenger.g0.L(28.0f));
        gb0Var.e(editTextBoldCursor);
        dg.a aVar = ejVar.f22361a;
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
        gb0Var.b(1.0f, f10, false);
        gb0Var.setForceUseCenter2(true);
        editTextBoldCursor.setOnFocusChangeListener(new m(this, 2));
        gb0Var.addView(editTextBoldCursor, mf.e(-1, -2, 48));
        f12.addView(gb0Var, mf.k(18.0f, 0.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView2 = new ImageView(context);
        this.f6318t1 = imageView2;
        imageView2.setImageResource(2131232750);
        gb0Var.addView(imageView2, mf.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView3 = new ImageView(context);
        this.f6319u1 = imageView3;
        imageView3.setImageResource(2131231957);
        gb0Var.addView(imageView3, mf.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(context, false, false, false);
        this.f6317s1 = h6Var;
        int i14 = org.telegram.ui.ActionBar.k6.f28273y6;
        org.telegram.ui.ActionBar.r6.Z(h6Var, i14, null);
        h6Var.setTextSize(org.telegram.messenger.g0.L(13.0f));
        h6Var.setGravity(5);
        gb0Var.addView(h6Var, mf.d(-2, -1.0f, 21, 0.0f, 0.0f, 16.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.f6314p1 = textView2;
        org.telegram.ui.ActionBar.r6.V(textView2, i14, null);
        textView2.setTextSize(1, 13.0f);
        f12.addView(textView2, mf.t(-1, -2, 55, 33, 4, 33, 0));
        s sVar = new s(context, 1);
        this.f6315q1 = sVar;
        sVar.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        sVar.setCursorWidth(1.5f);
        sVar.setTextSize(1, 17.0f);
        sVar.setMaxLines(1);
        sVar.setBackground(null);
        sVar.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
        org.telegram.ui.ActionBar.r6.V(sVar, i12, null);
        sVar.setFocusable(false);
        sVar.setClickable(false);
        sVar.setEnabled(false);
        gb0 gb0Var2 = new gb0(context, null);
        gb0Var2.setText(bd.M0(2131747082, null));
        gb0Var2.e(sVar);
        gb0Var2.addView(sVar, mf.d(-1, -2.0f, 48, 0.0f, 0.0f, 48.0f, 0.0f));
        pf.b(gb0Var2, 0.02f, 1.2f);
        gb0Var2.setOnClickListener(new View.OnClickListener(this) {
            public final x0 f6162b;

            {
                this.f6162b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r4) {
                    case 0:
                        if (this.f6162b.f6324z1.f8923a == dg.b.f8925a) {
                            new nb(context, e6Var).show();
                            return;
                        }
                        return;
                    default:
                        x0 x0Var = this.f6162b;
                        ((org.telegram.ui.ActionBar.t2) org.telegram.ui.Components.t4.S(context, x0Var.A1, new a1.c(x0Var, 12), e6Var, 0).f14429b).show();
                        return;
                }
            }
        });
        f12.addView(gb0Var2, mf.k(18.0f, 24.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView4 = new ImageView(context);
        imageView4.setImageResource(2131230871);
        org.telegram.ui.ActionBar.r6.t(imageView4, i13, e6Var, mode);
        gb0Var2.addView(imageView4, mf.d(24, 24.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
        TextView textView3 = new TextView(context);
        org.telegram.ui.ActionBar.r6.V(textView3, i14, null);
        textView3.setTextSize(1, 13.0f);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.X2(bd.M0(2131747102, null)));
        spannableStringBuilder.append(' ');
        org.telegram.messenger.k5.q(null, null, 2131747101, new Object[]{Long.valueOf(hp.s1(i3).f23167x7.f24659i.g2(TimeUnit.HOURS))}, spannableStringBuilder);
        textView3.setText(spannableStringBuilder);
        f12.addView(textView3, mf.t(-1, -2, 55, 33, 4, 33, 24));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout.addView(linearLayout2, mf.r(-1, -2, 80));
        gi.d dVar = new gi.d(context, e6Var, true);
        this.f6316r1 = dVar;
        dVar.setOnClickListener(new w0(this, wmVar, i3, context, e6Var, j10, u10Var));
        if (i10 == 1) {
            dVar.i(bd.M0(2131747091, null), false, true);
        }
        linearLayout2.addView(dVar, mf.k(18.0f, 0.0f, 18.0f, 8.0f, -1, 48));
        if (aVar != null) {
            z12 = false;
            M0(dg.a.i(aVar.f8924b, aVar.f8923a), !aVar.k(), true, false);
        } else {
            z12 = false;
            M0(dg.a.i(0L, bVar2), false, true, false);
        }
        long j12 = ejVar.f22362b;
        if (this.A1 != j12) {
            this.A1 = j12;
            sVar.setText(K0(j12));
        }
        J0(z12);
        this.O = linearLayout;
        editTextBoldCursor.addTextChangedListener(new bh.h(this, 2));
    }

    public static String K0(long j10) {
        if (j10 <= 0) {
            return bd.M0(2131747100, null);
        }
        String x10 = bd.x(j10, true);
        if (!x10.isEmpty()) {
            return Character.toUpperCase(x10.charAt(0)) + x10.substring(1);
        }
        return x10;
    }

    public final void I0() {
        boolean z10;
        float f10;
        boolean z11 = this.F1;
        c cVar = this.f6310j1;
        if ((z11 && !this.J && cVar != null && this.f28586b.getY() > org.telegram.messenger.g0.L(32.0f)) || this.m1 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.C1 != z10) {
            this.C1 = z10;
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

    public final void J0(boolean z10) {
        boolean z11;
        if (this.B1 == 0 && (this.f6324z1.f8924b >= 0 || this.A1 > 0)) {
            z11 = true;
        } else {
            z11 = false;
        }
        gi.d dVar = this.f6316r1;
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

    public final dg.a L0() {
        if (this.f6324z1.f8923a == dg.b.f8926b) {
            return this.f6323y1;
        }
        return this.f6321w1;
    }

    public final void M0(dg.a aVar, boolean z10, boolean z11, boolean z12) {
        boolean z13;
        boolean z14;
        boolean z15;
        ?? r16;
        int i3;
        int i10;
        boolean z16;
        String E;
        wp[] wpVarArr;
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
        dg.a aVar2;
        dg.a aVar3 = this.f6324z1;
        int i12 = this.B1;
        this.B1 = 0;
        if (aVar != null) {
            this.f6324z1 = aVar;
        } else {
            this.f6324z1 = dg.a.i(0L, aVar3.f8923a);
            this.B1 |= 1;
        }
        long j10 = L0().f8924b;
        dg.a aVar4 = this.f6324z1;
        if (j10 < aVar4.f8924b) {
            this.B1 |= 4;
        }
        boolean k10 = aVar4.k();
        dg.a aVar5 = this.f6320v1;
        dg.a aVar6 = this.f6322x1;
        dg.b bVar = dg.b.f8926b;
        if (!k10) {
            dg.a aVar7 = this.f6324z1;
            if (aVar7.f8923a == bVar) {
                aVar2 = aVar6;
            } else {
                aVar2 = aVar5;
            }
            if (aVar2.f8924b > aVar7.f8924b) {
                this.B1 |= 2;
            }
        }
        if (!z11 && aVar3.f8923a == this.f6324z1.f8923a) {
            z13 = false;
        } else {
            z13 = true;
        }
        if (!z11 && aVar3.f8924b == this.f6324z1.f8924b) {
            z14 = false;
        } else {
            z14 = true;
        }
        if (!z11 && i12 == this.B1) {
            z15 = false;
        } else {
            z15 = true;
        }
        gb0 gb0Var = this.f6312n1;
        if (z15) {
            if ((this.B1 & (-9)) == 0) {
                f18 = 0.0f;
            } else {
                f18 = 1.0f;
            }
            gb0Var.a(f18);
        }
        dg.b bVar2 = dg.b.f8925a;
        EditTextBoldCursor editTextBoldCursor = this.f6313o1;
        if (z13) {
            x20 x20Var = this.m1;
            boolean z17 = false;
            if (x20Var != null) {
                if (this.f6324z1.f8923a == bVar2) {
                    i11 = 0;
                } else {
                    i11 = 1;
                }
                x20Var.a(i11, z12);
            }
            dg.b bVar3 = this.f6324z1.f8923a;
            TextView textView = this.f6314p1;
            if (bVar3 == bVar2) {
                textView.setText(bd.M0(2131747088, null));
                editTextBoldCursor.setInputType(2);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(L0().a()).length())});
            } else if (bVar3 == bVar) {
                textView.setText(bd.M0(2131747087, null));
                editTextBoldCursor.setInputType(8194);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(L0().a()).length() + 3)});
            }
            ImageView imageView = this.f6319u1;
            ImageView imageView2 = this.f6318t1;
            if (z12) {
                ViewPropertyAnimator animate = imageView2.animate();
                i3 = 2;
                if (this.f6324z1.f8923a == bVar2) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                ViewPropertyAnimator alpha = animate.alpha(f12);
                if (this.f6324z1.f8923a == bVar2) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                ViewPropertyAnimator scaleX = alpha.scaleX(f13);
                if (this.f6324z1.f8923a == bVar2) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                scaleX.scaleY(f14).setDuration(180L).start();
                ViewPropertyAnimator animate2 = imageView.animate();
                if (this.f6324z1.f8923a == bVar) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.0f;
                }
                ViewPropertyAnimator alpha2 = animate2.alpha(f15);
                if (this.f6324z1.f8923a == bVar) {
                    f16 = 1.0f;
                } else {
                    f16 = 0.0f;
                }
                ViewPropertyAnimator scaleX2 = alpha2.scaleX(f16);
                if (this.f6324z1.f8923a == bVar) {
                    f17 = 1.0f;
                } else {
                    f17 = 0.0f;
                }
                scaleX2.scaleY(f17).setDuration(180L).start();
            } else {
                i3 = 2;
                if (this.f6324z1.f8923a == bVar2) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                imageView2.setAlpha(f10);
                if (this.f6324z1.f8923a == bVar) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                imageView.setAlpha(f11);
            }
            c cVar = this.f6310j1;
            r16 = z17;
            if (cVar != null) {
                dg.b bVar4 = this.f6324z1.f8923a;
                r16 = z17;
                if (cVar.f4900e != bVar4) {
                    cVar.f4900e = bVar4;
                    cVar.a();
                    r16 = z17;
                }
            }
        } else {
            r16 = 0;
            i3 = 2;
        }
        if (z13 || z15) {
            int i13 = this.B1;
            if ((i13 & 4) != 0) {
                Object[] objArr = new Object[1];
                objArr[r16] = L0().f();
                gb0Var.setText(bd.a0(null, null, 2131744428, objArr));
            } else if ((i13 & 2) != 0) {
                if (this.f6324z1.f8923a == bVar) {
                    aVar5 = aVar6;
                }
                String f19 = aVar5.f();
                Object[] objArr2 = new Object[1];
                objArr2[r16] = f19;
                gb0Var.setText(bd.a0(null, null, 2131744427, objArr2));
            } else {
                if (this.f6324z1.f8923a == bVar2) {
                    i10 = 2131747084;
                } else {
                    i10 = 2131747083;
                }
                gb0Var.setText(bd.M0(i10, null));
            }
        }
        if (z13 || z14 || z15) {
            int i14 = this.f6311l1;
            gi.d dVar = this.f6316r1;
            if (i14 == 0) {
                if (!this.f6324z1.k()) {
                    dg.a aVar8 = this.f6324z1;
                    if (aVar8.f8923a == bVar) {
                        z16 = true;
                    } else {
                        z16 = r16;
                    }
                    if (z16) {
                        E = aVar8.b();
                    } else {
                        E = bd.E(aVar8.a(), ',');
                    }
                    Object[] objArr3 = new Object[1];
                    objArr3[r16] = E;
                    String a02 = bd.a0(null, null, 2131747089, objArr3);
                    if (z16) {
                        wpVarArr = this.E1;
                    } else {
                        wpVarArr = this.D1;
                    }
                    dVar.i(wb.s1(wb.Y0(z16, a02, wpVarArr), z16), z12, true);
                } else {
                    dVar.i(bd.M0(2131747090, null), z12, true);
                }
            } else {
                dVar.i(bd.M0(2131747091, null), z12, true);
            }
            J0(z12);
        }
        if (z13 || z14) {
            StringBuilder sb2 = new StringBuilder(10);
            sb2.append('~');
            if (this.f6324z1.f8923a == bVar) {
                d = ((org.telegram.messenger.i0) hp.s1(this.f28583a).f23167x7.f24665l.f14429b).f23413a;
            } else {
                d = hp.s1(this.f28583a).f22979c6 * 1.0E-5d;
            }
            org.telegram.messenger.r1.i().getClass();
            sb2.append(org.telegram.messenger.r1.g("USD", i3, (long) (this.f6324z1.c() * d * 100.0d), r16));
            this.f6317s1.c(sb2, z12, true);
        }
        if (z10 && z14) {
            String b10 = this.f6324z1.b();
            editTextBoldCursor.setText(b10);
            editTextBoldCursor.setSelection(b10.length());
        }
    }

    @Override
    public final boolean X(float f10, float f11) {
        c cVar;
        if (this.C1 && (cVar = this.f6310j1) != null && f10 >= cVar.getX() && f10 <= cVar.getX() + cVar.getWidth() && f11 >= cVar.getY() && f11 <= cVar.getY() + cVar.getHeight()) {
            return false;
        }
        return super.X(f10, f11);
    }

    @Override
    public final void g0(float f10) {
        super.g0(f10);
        I0();
    }

    @Override
    public final void show() {
        super.show();
        org.telegram.messenger.g0.i3(new ai.s(this, 28), 50L);
    }

    @Override
    public final void v() {
        this.F1 = true;
        I0();
    }
}
