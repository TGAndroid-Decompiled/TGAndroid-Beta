package ci;

import android.content.Context;
import android.text.InputFilter;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import b8.mf;
import org.telegram.messenger.bd;
import org.telegram.messenger.hp;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.gb0;
import org.telegram.ui.Components.wo;
public final class a1 extends org.telegram.ui.ActionBar.t2 {
    public final gb0 f4791j1;
    public final EditTextBoldCursor k1;
    public final TextView f4792l1;
    public final org.telegram.ui.Components.h6 m1;
    public final gi.d f4793n1;
    public final org.telegram.ui.Components.h6 f4794o1;
    public final org.telegram.ui.Cells.r8 f4795p1;
    public final ImageView f4796q1;
    public final ImageView f4797r1;
    public final dg.a f4798s1;
    public final dg.a f4799t1;
    public final dg.a f4800u1;
    public final dg.a f4801v1;
    public dg.a f4802w1;
    public int f4803x1;

    public a1(Context context, org.telegram.ui.ActionBar.e6 e6Var, int i3, dg.a aVar, ai.o1 o1Var) {
        super(1, context, e6Var, true);
        boolean z10;
        float f10;
        this.f28583a = i3;
        this.Q0 = true;
        this.E = true;
        org.telegram.messenger.p0 p0Var = hp.s1(i3).f23167x7;
        long max = Math.max(((org.telegram.messenger.l0) p0Var.f24673r.f13688b).f23921c, 10000000L);
        dg.b bVar = dg.b.f8926b;
        this.f4800u1 = dg.a.i(max, bVar);
        this.f4801v1 = dg.a.i(((org.telegram.messenger.l0) p0Var.f24674s.f13688b).f23921c, bVar);
        dg.b bVar2 = dg.b.f8925a;
        this.f4798s1 = dg.a.g(((org.telegram.messenger.j0) p0Var.f24671p.f13798b).f23620c, bVar2);
        this.f4799t1 = dg.a.g(((org.telegram.messenger.j0) p0Var.f24672q.f13798b).f23620c, bVar2);
        P(org.telegram.ui.ActionBar.k6.f27954h5);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        LinearLayout f11 = org.telegram.messenger.k5.f(context, 0);
        linearLayout.addView(f11, mf.t(-1, 56, 55, 0, 0, 0, 0));
        org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(context, false, false, false);
        this.m1 = h6Var;
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.Z(h6Var, i10, null);
        h6Var.setTextSize(org.telegram.messenger.g0.L(20.0f));
        h6Var.setGravity(8388627);
        h6Var.setTypeface(org.telegram.messenger.g0.o());
        f11.addView(h6Var, mf.q(-1, -1, 1.0f, 119, 22, 0, 22, 0));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout.addView(linearLayout2, mf.l(1.0f, -1, -2));
        gb0 gb0Var = new gb0(context, null);
        this.f4791j1 = gb0Var;
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.k1 = editTextBoldCursor;
        editTextBoldCursor.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setImeOptions(268435462);
        editTextBoldCursor.setTextSize(1, 17.0f);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setPadding(org.telegram.messenger.g0.L(42.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
        org.telegram.ui.ActionBar.r6.V(editTextBoldCursor, i10, null);
        editTextBoldCursor.requestFocus();
        gb0Var.setLeftPadding(org.telegram.messenger.g0.L(28.0f));
        gb0Var.e(editTextBoldCursor);
        if (aVar != null && !aVar.k()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        gb0Var.b(1.0f, f10, false);
        gb0Var.setForceUseCenter2(true);
        editTextBoldCursor.setOnFocusChangeListener(new m(this, 3));
        gb0Var.addView(editTextBoldCursor, mf.e(-1, -2, 48));
        linearLayout2.addView(gb0Var, mf.k(18.0f, 0.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView = new ImageView(context);
        this.f4796q1 = imageView;
        imageView.setImageResource(2131232750);
        gb0Var.addView(imageView, mf.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f4797r1 = imageView2;
        imageView2.setImageResource(2131231957);
        gb0Var.addView(imageView2, mf.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.h6 h6Var2 = new org.telegram.ui.Components.h6(context, false, false, false);
        this.f4794o1 = h6Var2;
        int i11 = org.telegram.ui.ActionBar.k6.f28273y6;
        org.telegram.ui.ActionBar.r6.Z(h6Var2, i11, null);
        h6Var2.setTextSize(org.telegram.messenger.g0.L(13.0f));
        h6Var2.setGravity(5);
        gb0Var.addView(h6Var2, mf.d(-2, -1.0f, 21, 0.0f, 0.0f, 16.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f4792l1 = textView;
        org.telegram.ui.ActionBar.r6.V(textView, i11, null);
        textView.setTextSize(1, 13.0f);
        linearLayout2.addView(textView, mf.t(-1, -2, 55, 33, 4, 33, 0));
        org.telegram.ui.Cells.r8 r8Var = new org.telegram.ui.Cells.r8(context);
        this.f4795p1 = r8Var;
        r8Var.f30286c.setLayoutParams(mf.d(20, 20.0f, (bd.f21784a0 ? 5 : 3) | 48, 22.0f, 22.0f, 22.0f, 0.0f));
        r8Var.b(bd.M0(2131746138, null), bd.M0(2131746139, null), true, false);
        r8Var.setOnClickListener(new ai.b(this, 8));
        linearLayout2.addView(r8Var, mf.t(-1, -2, 55, 0, 16, 0, 16));
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(1);
        linearLayout.addView(linearLayout3, mf.r(-1, -2, 80));
        gi.d h = org.telegram.messenger.k5.h(24, context, e6Var, true);
        this.f4793n1 = h;
        h.setOnClickListener(new ai.d(7, this, o1Var));
        h.i(bd.M0(2131746161, null), false, true);
        linearLayout3.addView(h, mf.k(18.0f, 0.0f, 18.0f, 8.0f, -1, 48));
        if (aVar != null) {
            J0(dg.a.i(aVar.f8924b, aVar.f8923a), !aVar.k(), true, false);
        } else {
            J0(dg.a.i(0L, bVar2), false, true, false);
        }
        this.O = linearLayout;
        editTextBoldCursor.addTextChangedListener(new bh.h(this, 3));
    }

    public final dg.a I0() {
        if (this.f4802w1.f8923a == dg.b.f8926b) {
            return this.f4801v1;
        }
        return this.f4799t1;
    }

    public final void J0(dg.a aVar, boolean z10, boolean z11, boolean z12) {
        long j10;
        boolean z13;
        boolean z14;
        boolean z15;
        dg.a aVar2;
        int i3;
        int i10;
        dg.a aVar3;
        boolean z16;
        float f10;
        float f11;
        double d;
        boolean z17;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        dg.a aVar4;
        dg.a aVar5 = this.f4802w1;
        int i11 = this.f4803x1;
        this.f4803x1 = 0;
        if (aVar != null) {
            this.f4802w1 = aVar;
        } else {
            this.f4802w1 = dg.a.i(0L, aVar5.f8923a);
            this.f4803x1 |= 1;
        }
        long j11 = I0().f8924b;
        dg.a aVar6 = this.f4802w1;
        if (j11 < aVar6.f8924b) {
            this.f4803x1 |= 4;
        }
        boolean k10 = aVar6.k();
        dg.a aVar7 = this.f4798s1;
        dg.a aVar8 = this.f4800u1;
        dg.b bVar = dg.b.f8926b;
        if (!k10) {
            dg.a aVar9 = this.f4802w1;
            if (aVar9.f8923a == bVar) {
                aVar4 = aVar8;
            } else {
                aVar4 = aVar7;
            }
            j10 = 0;
            if (aVar4.f8924b > aVar9.f8924b) {
                this.f4803x1 |= 2;
            }
        } else {
            j10 = 0;
        }
        if (!z11 && aVar5.f8923a == this.f4802w1.f8923a) {
            z13 = false;
        } else {
            z13 = true;
        }
        if (!z11 && aVar5.f8924b == this.f4802w1.f8924b) {
            z14 = false;
        } else {
            z14 = true;
        }
        if (!z11 && i11 == this.f4803x1) {
            z15 = false;
        } else {
            z15 = true;
        }
        gb0 gb0Var = this.f4791j1;
        if (z15) {
            if ((this.f4803x1 & (-9)) == 0) {
                f20 = 0.0f;
            } else {
                f20 = 1.0f;
            }
            gb0Var.a(f20);
        }
        dg.b bVar2 = dg.b.f8925a;
        long j12 = j10;
        EditTextBoldCursor editTextBoldCursor = this.k1;
        if (z13) {
            dg.b bVar3 = this.f4802w1.f8923a;
            org.telegram.ui.Components.h6 h6Var = this.m1;
            if (bVar3 == bVar2) {
                h6Var.c(bd.M0(2131746133, null), z12, true);
                editTextBoldCursor.setInputType(2);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(I0().a()).length())});
            } else if (bVar3 == bVar) {
                h6Var.c(bd.M0(2131746132, null), z12, true);
                editTextBoldCursor.setInputType(8194);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(I0().a()).length() + 3)});
            }
            wo woVar = this.f4795p1.f30286c;
            if (this.f4802w1.f8923a == bVar) {
                z17 = true;
            } else {
                z17 = false;
            }
            woVar.a(z17, z12);
            ImageView imageView = this.f4797r1;
            ImageView imageView2 = this.f4796q1;
            if (z12) {
                ViewPropertyAnimator animate = imageView2.animate();
                i3 = 2;
                if (this.f4802w1.f8923a == bVar2) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                ViewPropertyAnimator alpha = animate.alpha(f14);
                if (this.f4802w1.f8923a == bVar2) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.0f;
                }
                ViewPropertyAnimator scaleX = alpha.scaleX(f15);
                if (this.f4802w1.f8923a == bVar2) {
                    f16 = 1.0f;
                } else {
                    f16 = 0.0f;
                }
                aVar2 = aVar7;
                scaleX.scaleY(f16).setDuration(180L).start();
                ViewPropertyAnimator animate2 = imageView.animate();
                if (this.f4802w1.f8923a == bVar) {
                    f17 = 1.0f;
                } else {
                    f17 = 0.0f;
                }
                ViewPropertyAnimator alpha2 = animate2.alpha(f17);
                if (this.f4802w1.f8923a == bVar) {
                    f18 = 1.0f;
                } else {
                    f18 = 0.0f;
                }
                ViewPropertyAnimator scaleX2 = alpha2.scaleX(f18);
                if (this.f4802w1.f8923a == bVar) {
                    f19 = 1.0f;
                } else {
                    f19 = 0.0f;
                }
                scaleX2.scaleY(f19).setDuration(180L).start();
            } else {
                aVar2 = aVar7;
                i3 = 2;
                if (this.f4802w1.f8923a == bVar2) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                imageView2.setAlpha(f12);
                if (this.f4802w1.f8923a == bVar) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                imageView.setAlpha(f13);
            }
        } else {
            aVar2 = aVar7;
            i3 = 2;
        }
        if (z13 || z15) {
            int i12 = this.f4803x1;
            if ((i12 & 4) != 0) {
                gb0Var.setText(bd.a0(null, null, 2131746135, I0().f()));
            } else if ((i12 & 2) != 0) {
                if (this.f4802w1.f8923a == bVar) {
                    aVar3 = aVar8;
                } else {
                    aVar3 = aVar2;
                }
                gb0Var.setText(bd.a0(null, null, 2131746134, aVar3.f()));
            } else {
                if (this.f4802w1.f8923a == bVar2) {
                    i10 = 2131746137;
                } else {
                    i10 = 2131746136;
                }
                gb0Var.setText(bd.M0(i10, null));
            }
        }
        if (z13 || z14 || z15) {
            if (this.f4803x1 == 0 && this.f4802w1.f8924b > j12) {
                z16 = true;
            } else {
                z16 = false;
            }
            gi.d dVar = this.f4793n1;
            if (dVar.f12517d0 != z16) {
                dVar.setEnabled(z16);
                dVar.setClickable(z16);
                if (z12) {
                    ViewPropertyAnimator animate3 = dVar.animate();
                    if (z16) {
                        f11 = 1.0f;
                    } else {
                        f11 = 0.6f;
                    }
                    org.telegram.messenger.camera.q.k(animate3, f11, 180L);
                } else {
                    if (z16) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.6f;
                    }
                    dVar.setAlpha(f10);
                }
            }
        }
        if (z13 || z14) {
            org.telegram.messenger.p0 p0Var = hp.s1(this.f28583a).f23167x7;
            dg.a aVar10 = this.f4802w1;
            dg.b bVar4 = aVar10.f8923a;
            long j13 = aVar10.f8924b;
            TextView textView = this.f4792l1;
            if (bVar4 == bVar2) {
                textView.setText(org.telegram.messenger.g0.X2(bd.G((int) dg.a.i((j13 * ((org.telegram.messenger.j0) p0Var.f24668n.f13798b).f23620c) / 1000, bVar4).a(), "ResellGiftInfo", new Object[0])));
            } else if (bVar4 == bVar) {
                org.telegram.messenger.k5.r(null, null, 2131746142, new Object[]{dg.a.i((j13 * ((org.telegram.messenger.j0) p0Var.f24670o.f13798b).f23620c) / 1000, bVar4).b()}, textView);
            }
            StringBuilder sb2 = new StringBuilder(10);
            sb2.append('~');
            if (this.f4802w1.f8923a == bVar) {
                d = ((org.telegram.messenger.i0) hp.s1(this.f28583a).f23167x7.f24665l.f14429b).f23413a;
            } else {
                d = hp.s1(this.f28583a).f22979c6 * 1.0E-5d;
            }
            org.telegram.messenger.r1 i13 = org.telegram.messenger.r1.i();
            long c2 = (long) (this.f4802w1.c() * d * 100.0d);
            i13.getClass();
            sb2.append(org.telegram.messenger.r1.g("USD", i3, c2, false));
            this.f4794o1.c(sb2, z12, true);
        }
        if (z10 && z14) {
            String b10 = this.f4802w1.b();
            editTextBoldCursor.setText(b10);
            editTextBoldCursor.setSelection(b10.length());
        }
    }

    @Override
    public final void show() {
        super.show();
        org.telegram.messenger.g0.i3(new ai.s(this, 29), 50L);
    }
}
