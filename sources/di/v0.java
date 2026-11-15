package di;

import android.content.Context;
import android.text.InputFilter;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.messenger.np;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.fp;
import org.telegram.ui.Components.mb0;
public final class v0 extends org.telegram.ui.ActionBar.u2 {
    public int A1;
    public final mb0 f9571m1;
    public final EditTextBoldCursor n1;
    public final TextView f9572o1;
    public final org.telegram.ui.Components.h6 f9573p1;
    public final hi.d f9574q1;
    public final org.telegram.ui.Components.h6 f9575r1;
    public final org.telegram.ui.Cells.r8 f9576s1;
    public final ImageView f9577t1;
    public final ImageView f9578u1;
    public final cg.a f9579v1;
    public final cg.a f9580w1;
    public final cg.a f9581x1;
    public final cg.a f9582y1;
    public cg.a f9583z1;

    public v0(Context context, org.telegram.ui.ActionBar.e6 e6Var, int i7, cg.a aVar, ai.v1 v1Var) {
        super(1, context, e6Var, true);
        boolean z10;
        float f10;
        this.f29679a = i7;
        this.Q0 = true;
        this.E = true;
        org.telegram.messenger.p0 p0Var = np.s1(i7).f25451y7;
        long max = Math.max(((org.telegram.messenger.l0) p0Var.f25866r.f14544b).f24791c, 10000000L);
        cg.b bVar = cg.b.f4991b;
        this.f9581x1 = cg.a.i(max, bVar);
        this.f9582y1 = cg.a.i(((org.telegram.messenger.l0) p0Var.f25867s.f14544b).f24791c, bVar);
        cg.b bVar2 = cg.b.f4990a;
        this.f9579v1 = cg.a.g(((org.telegram.messenger.j0) p0Var.f25864p.f15881b).f24498c, bVar2);
        this.f9580w1 = cg.a.g(((org.telegram.messenger.j0) p0Var.f25865q.f15881b).f24498c, bVar2);
        Q(org.telegram.ui.ActionBar.j6.f28922h5);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        LinearLayout f11 = org.telegram.messenger.k5.f(context, 0);
        linearLayout.addView(f11, c8.ja.t(-1, 56, 55, 0, 0, 0, 0));
        org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(context, false, false, false);
        this.f9573p1 = h6Var;
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.q6.Y(h6Var, i10, null);
        h6Var.setTextSize(org.telegram.messenger.g0.L(20.0f));
        h6Var.setGravity(8388627);
        h6Var.setTypeface(org.telegram.messenger.g0.o());
        f11.addView(h6Var, c8.ja.q(-1, -1, 1.0f, 119, 22, 0, 22, 0));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout.addView(linearLayout2, c8.ja.l(1.0f, -1, -2));
        mb0 mb0Var = new mb0(context, null);
        this.f9571m1 = mb0Var;
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.n1 = editTextBoldCursor;
        editTextBoldCursor.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setImeOptions(268435462);
        editTextBoldCursor.setTextSize(1, 17.0f);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setPadding(org.telegram.messenger.g0.L(42.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
        org.telegram.ui.ActionBar.q6.U(editTextBoldCursor, i10, null);
        editTextBoldCursor.requestFocus();
        mb0Var.setLeftPadding(org.telegram.messenger.g0.L(28.0f));
        mb0Var.e(editTextBoldCursor);
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
        mb0Var.b(1.0f, f10, false);
        mb0Var.setForceUseCenter2(true);
        editTextBoldCursor.setOnFocusChangeListener(new ch.c0(this, 4));
        mb0Var.addView(editTextBoldCursor, c8.ja.e(-1, -2, 48));
        linearLayout2.addView(mb0Var, c8.ja.k(18.0f, 0.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView = new ImageView(context);
        this.f9577t1 = imageView;
        imageView.setImageResource(2131232753);
        mb0Var.addView(imageView, c8.ja.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f9578u1 = imageView2;
        imageView2.setImageResource(2131231957);
        mb0Var.addView(imageView2, c8.ja.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.h6 h6Var2 = new org.telegram.ui.Components.h6(context, false, false, false);
        this.f9575r1 = h6Var2;
        int i11 = org.telegram.ui.ActionBar.j6.f29241y6;
        org.telegram.ui.ActionBar.q6.Y(h6Var2, i11, null);
        h6Var2.setTextSize(org.telegram.messenger.g0.L(13.0f));
        h6Var2.setGravity(5);
        mb0Var.addView(h6Var2, c8.ja.d(-2, -1.0f, 21, 0.0f, 0.0f, 16.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f9572o1 = textView;
        org.telegram.ui.ActionBar.q6.U(textView, i11, null);
        textView.setTextSize(1, 13.0f);
        linearLayout2.addView(textView, c8.ja.t(-1, -2, 55, 33, 4, 33, 0));
        org.telegram.ui.Cells.r8 r8Var = new org.telegram.ui.Cells.r8(context);
        this.f9576s1 = r8Var;
        r8Var.f31362c.setLayoutParams(c8.ja.d(20, 20.0f, (hd.f24104a0 ? 5 : 3) | 48, 22.0f, 22.0f, 22.0f, 0.0f));
        r8Var.b(hd.M0(2131746128, null), hd.M0(2131746129, null), true, false);
        r8Var.setOnClickListener(new ah.d(this, 12));
        linearLayout2.addView(r8Var, c8.ja.t(-1, -2, 55, 0, 16, 0, 16));
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(1);
        linearLayout.addView(linearLayout3, c8.ja.r(-1, -2, 80));
        hi.d g10 = i20.g(24, context, e6Var, true);
        this.f9574q1 = g10;
        g10.setOnClickListener(new ai.v2(9, this, v1Var));
        g10.i(hd.M0(2131746151, null), false, true);
        linearLayout3.addView(g10, c8.ja.k(18.0f, 0.0f, 18.0f, 8.0f, -1, 48));
        if (aVar != null) {
            J0(cg.a.i(aVar.f4989b, aVar.f4988a), !aVar.k(), true, false);
        } else {
            J0(cg.a.i(0L, bVar2), false, true, false);
        }
        this.O = linearLayout;
        editTextBoldCursor.addTextChangedListener(new ah.j(this, 4));
    }

    public final cg.a I0() {
        if (this.f9583z1.f4988a == cg.b.f4991b) {
            return this.f9582y1;
        }
        return this.f9580w1;
    }

    public final void J0(cg.a aVar, boolean z10, boolean z11, boolean z12) {
        long j3;
        boolean z13;
        boolean z14;
        boolean z15;
        cg.a aVar2;
        int i7;
        int i10;
        cg.a aVar3;
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
        cg.a aVar4;
        cg.a aVar5 = this.f9583z1;
        int i11 = this.A1;
        this.A1 = 0;
        if (aVar != null) {
            this.f9583z1 = aVar;
        } else {
            this.f9583z1 = cg.a.i(0L, aVar5.f4988a);
            this.A1 |= 1;
        }
        long j10 = I0().f4989b;
        cg.a aVar6 = this.f9583z1;
        if (j10 < aVar6.f4989b) {
            this.A1 |= 4;
        }
        boolean k10 = aVar6.k();
        cg.a aVar7 = this.f9579v1;
        cg.a aVar8 = this.f9581x1;
        cg.b bVar = cg.b.f4991b;
        if (!k10) {
            cg.a aVar9 = this.f9583z1;
            if (aVar9.f4988a == bVar) {
                aVar4 = aVar8;
            } else {
                aVar4 = aVar7;
            }
            j3 = 0;
            if (aVar4.f4989b > aVar9.f4989b) {
                this.A1 |= 2;
            }
        } else {
            j3 = 0;
        }
        if (!z11 && aVar5.f4988a == this.f9583z1.f4988a) {
            z13 = false;
        } else {
            z13 = true;
        }
        if (!z11 && aVar5.f4989b == this.f9583z1.f4989b) {
            z14 = false;
        } else {
            z14 = true;
        }
        if (!z11 && i11 == this.A1) {
            z15 = false;
        } else {
            z15 = true;
        }
        mb0 mb0Var = this.f9571m1;
        if (z15) {
            if ((this.A1 & (-9)) == 0) {
                f20 = 0.0f;
            } else {
                f20 = 1.0f;
            }
            mb0Var.a(f20);
        }
        cg.b bVar2 = cg.b.f4990a;
        long j11 = j3;
        EditTextBoldCursor editTextBoldCursor = this.n1;
        if (z13) {
            cg.b bVar3 = this.f9583z1.f4988a;
            org.telegram.ui.Components.h6 h6Var = this.f9573p1;
            if (bVar3 == bVar2) {
                h6Var.c(hd.M0(2131746123, null), z12, true);
                editTextBoldCursor.setInputType(2);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(I0().a()).length())});
            } else if (bVar3 == bVar) {
                h6Var.c(hd.M0(2131746122, null), z12, true);
                editTextBoldCursor.setInputType(8194);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(I0().a()).length() + 3)});
            }
            fp fpVar = this.f9576s1.f31362c;
            if (this.f9583z1.f4988a == bVar) {
                z17 = true;
            } else {
                z17 = false;
            }
            fpVar.a(z17, z12);
            ImageView imageView = this.f9578u1;
            ImageView imageView2 = this.f9577t1;
            if (z12) {
                ViewPropertyAnimator animate = imageView2.animate();
                i7 = 2;
                if (this.f9583z1.f4988a == bVar2) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                ViewPropertyAnimator alpha = animate.alpha(f14);
                if (this.f9583z1.f4988a == bVar2) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.0f;
                }
                ViewPropertyAnimator scaleX = alpha.scaleX(f15);
                if (this.f9583z1.f4988a == bVar2) {
                    f16 = 1.0f;
                } else {
                    f16 = 0.0f;
                }
                aVar2 = aVar7;
                scaleX.scaleY(f16).setDuration(180L).start();
                ViewPropertyAnimator animate2 = imageView.animate();
                if (this.f9583z1.f4988a == bVar) {
                    f17 = 1.0f;
                } else {
                    f17 = 0.0f;
                }
                ViewPropertyAnimator alpha2 = animate2.alpha(f17);
                if (this.f9583z1.f4988a == bVar) {
                    f18 = 1.0f;
                } else {
                    f18 = 0.0f;
                }
                ViewPropertyAnimator scaleX2 = alpha2.scaleX(f18);
                if (this.f9583z1.f4988a == bVar) {
                    f19 = 1.0f;
                } else {
                    f19 = 0.0f;
                }
                scaleX2.scaleY(f19).setDuration(180L).start();
            } else {
                aVar2 = aVar7;
                i7 = 2;
                if (this.f9583z1.f4988a == bVar2) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                imageView2.setAlpha(f12);
                if (this.f9583z1.f4988a == bVar) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                imageView.setAlpha(f13);
            }
        } else {
            aVar2 = aVar7;
            i7 = 2;
        }
        if (z13 || z15) {
            int i12 = this.A1;
            if ((i12 & 4) != 0) {
                mb0Var.setText(hd.a0(null, null, 2131746125, I0().f()));
            } else if ((i12 & 2) != 0) {
                if (this.f9583z1.f4988a == bVar) {
                    aVar3 = aVar8;
                } else {
                    aVar3 = aVar2;
                }
                mb0Var.setText(hd.a0(null, null, 2131746124, aVar3.f()));
            } else {
                if (this.f9583z1.f4988a == bVar2) {
                    i10 = 2131746127;
                } else {
                    i10 = 2131746126;
                }
                mb0Var.setText(hd.M0(i10, null));
            }
        }
        if (z13 || z14 || z15) {
            if (this.A1 == 0 && this.f9583z1.f4989b > j11) {
                z16 = true;
            } else {
                z16 = false;
            }
            hi.d dVar = this.f9574q1;
            if (dVar.f14056d0 != z16) {
                dVar.setEnabled(z16);
                dVar.setClickable(z16);
                if (z12) {
                    ViewPropertyAnimator animate3 = dVar.animate();
                    if (z16) {
                        f11 = 1.0f;
                    } else {
                        f11 = 0.6f;
                    }
                    i20.m(animate3, f11, 180L);
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
            org.telegram.messenger.p0 p0Var = np.s1(this.f29679a).f25451y7;
            cg.a aVar10 = this.f9583z1;
            cg.b bVar4 = aVar10.f4988a;
            long j12 = aVar10.f4989b;
            TextView textView = this.f9572o1;
            if (bVar4 == bVar2) {
                textView.setText(org.telegram.messenger.g0.X2(hd.G((int) cg.a.i((j12 * ((org.telegram.messenger.j0) p0Var.f25860n.f15881b).f24498c) / 1000, bVar4).a(), "ResellGiftInfo", new Object[0])));
            } else if (bVar4 == bVar) {
                org.telegram.messenger.k5.q(null, null, 2131746132, new Object[]{cg.a.i((j12 * ((org.telegram.messenger.j0) p0Var.f25862o.f15881b).f24498c) / 1000, bVar4).b()}, textView);
            }
            StringBuilder sb2 = new StringBuilder(10);
            sb2.append('~');
            if (this.f9583z1.f4988a == bVar) {
                d = ((org.telegram.messenger.i0) np.s1(this.f29679a).f25451y7.f25857l.f13134b).f24257a;
            } else {
                d = np.s1(this.f29679a).f25262d6 * 1.0E-5d;
            }
            org.telegram.messenger.r1 i13 = org.telegram.messenger.r1.i();
            long c10 = (long) (this.f9583z1.c() * d * 100.0d);
            i13.getClass();
            sb2.append(org.telegram.messenger.r1.g("USD", i7, c10, false));
            this.f9575r1.c(sb2, z12, true);
        }
        if (z10 && z14) {
            String b10 = this.f9583z1.b();
            editTextBoldCursor.setText(b10);
            editTextBoldCursor.setSelection(b10.length());
        }
    }

    @Override
    public final void show() {
        super.show();
        org.telegram.messenger.g0.i3(new ch.w(this, 10), 50L);
    }
}
