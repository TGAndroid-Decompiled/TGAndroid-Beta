package bi;

import android.content.Context;
import android.text.InputFilter;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.qp;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.lb0;
import org.telegram.ui.Components.wo;
public final class h1 extends org.telegram.ui.ActionBar.w2 {
    public final lb0 l1;
    public final EditTextBoldCursor f3970m1;
    public final TextView n1;
    public final org.telegram.ui.Components.i6 f3971o1;
    public final fi.d f3972p1;
    public final org.telegram.ui.Components.i6 f3973q1;
    public final org.telegram.ui.Cells.s8 f3974r1;
    public final ImageView f3975s1;
    public final ImageView f3976t1;
    public final cg.a f3977u1;
    public final cg.a f3978v1;
    public final cg.a f3979w1;
    public final cg.a f3980x1;
    public cg.a f3981y1;
    public int f3982z1;

    public h1(Context context, org.telegram.ui.ActionBar.h6 h6Var, int i7, cg.a aVar, ai.f1 f1Var) {
        super(1, context, h6Var, true);
        boolean z9;
        float f10;
        int i10;
        this.f28669a = i7;
        this.P0 = true;
        this.D = true;
        org.telegram.messenger.p0 p0Var = qp.s1(i7).f24946x7;
        long max = Math.max(((org.telegram.messenger.l0) p0Var.f24462r.f13891b).f23822c, 10000000L);
        cg.b bVar = cg.b.f6166b;
        this.f3979w1 = cg.a.i(max, bVar);
        this.f3980x1 = cg.a.i(((org.telegram.messenger.l0) p0Var.f24463s.f13891b).f23822c, bVar);
        cg.b bVar2 = cg.b.f6165a;
        this.f3977u1 = cg.a.g(((org.telegram.messenger.j0) p0Var.f24460p.f13557b).f23464c, bVar2);
        this.f3978v1 = cg.a.g(((org.telegram.messenger.j0) p0Var.f24461q.f13557b).f23464c, bVar2);
        P(org.telegram.ui.ActionBar.m6.f27963h5);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        LinearLayout f11 = org.telegram.messenger.k5.f(context, 0);
        linearLayout.addView(f11, c8.ha.t(-1, 56, 55, 0, 0, 0, 0));
        org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(context, false, false, false);
        this.f3971o1 = i6Var;
        int i11 = org.telegram.ui.ActionBar.m6.G6;
        org.telegram.ui.ActionBar.t6.Y(i6Var, i11, null);
        i6Var.setTextSize(org.telegram.messenger.g0.L(20.0f));
        i6Var.setGravity(8388627);
        i6Var.setTypeface(org.telegram.messenger.g0.o());
        f11.addView(i6Var, c8.ha.q(-1, -1, 1.0f, 119, 22, 0, 22, 0));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout.addView(linearLayout2, c8.ha.l(1.0f, -1, -2));
        lb0 lb0Var = new lb0(context, null);
        this.l1 = lb0Var;
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f3970m1 = editTextBoldCursor;
        editTextBoldCursor.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setImeOptions(268435462);
        editTextBoldCursor.setTextSize(1, 17.0f);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setPadding(org.telegram.messenger.g0.L(42.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
        org.telegram.ui.ActionBar.t6.U(editTextBoldCursor, i11, null);
        editTextBoldCursor.requestFocus();
        lb0Var.setLeftPadding(org.telegram.messenger.g0.L(28.0f));
        lb0Var.e(editTextBoldCursor);
        if (aVar != null && !aVar.k()) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        lb0Var.b(1.0f, f10, false);
        lb0Var.setForceUseCenter2(true);
        editTextBoldCursor.setOnFocusChangeListener(new n(this, 3));
        lb0Var.addView(editTextBoldCursor, c8.ha.e(-1, -2, 48));
        linearLayout2.addView(lb0Var, c8.ha.k(18.0f, 0.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView = new ImageView(context);
        this.f3975s1 = imageView;
        imageView.setImageResource(2131232752);
        lb0Var.addView(imageView, c8.ha.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f3976t1 = imageView2;
        imageView2.setImageResource(2131231957);
        lb0Var.addView(imageView2, c8.ha.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.i6 i6Var2 = new org.telegram.ui.Components.i6(context, false, false, false);
        this.f3973q1 = i6Var2;
        int i12 = org.telegram.ui.ActionBar.m6.f28282y6;
        org.telegram.ui.ActionBar.t6.Y(i6Var2, i12, null);
        i6Var2.setTextSize(org.telegram.messenger.g0.L(13.0f));
        i6Var2.setGravity(5);
        lb0Var.addView(i6Var2, c8.ha.d(-2, -1.0f, 21, 0.0f, 0.0f, 16.0f, 0.0f));
        TextView textView = new TextView(context);
        this.n1 = textView;
        org.telegram.ui.ActionBar.t6.U(textView, i12, null);
        textView.setTextSize(1, 13.0f);
        linearLayout2.addView(textView, c8.ha.t(-1, -2, 55, 33, 4, 33, 0));
        org.telegram.ui.Cells.s8 s8Var = new org.telegram.ui.Cells.s8(context);
        this.f3974r1 = s8Var;
        if (org.telegram.messenger.id.f23161a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        s8Var.f30299c.setLayoutParams(c8.ha.d(20, 20.0f, i10 | 48, 22.0f, 22.0f, 22.0f, 0.0f));
        s8Var.b(org.telegram.messenger.id.M0(2131746128, null), org.telegram.messenger.id.M0(2131746129, null), true, false);
        s8Var.setOnClickListener(new ah.d(this, 5));
        linearLayout2.addView(s8Var, c8.ha.t(-1, -2, 55, 0, 16, 0, 16));
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(1);
        linearLayout.addView(linearLayout3, c8.ha.r(-1, -2, 80));
        fi.d h = org.telegram.messenger.k5.h(24, context, h6Var, true);
        this.f3972p1 = h;
        h.setOnClickListener(new r(2, this, f1Var));
        h.i(org.telegram.messenger.id.M0(2131746151, null), false, true);
        linearLayout3.addView(h, c8.ha.k(18.0f, 0.0f, 18.0f, 8.0f, -1, 48));
        if (aVar != null) {
            J0(cg.a.i(aVar.f6164b, aVar.f6163a), !aVar.k(), true, false);
        } else {
            J0(cg.a.i(0L, bVar2), false, true, false);
        }
        this.N = linearLayout;
        editTextBoldCursor.addTextChangedListener(new ah.j(this, 3));
    }

    public final cg.a I0() {
        if (this.f3981y1.f6163a == cg.b.f6166b) {
            return this.f3980x1;
        }
        return this.f3978v1;
    }

    public final void J0(cg.a aVar, boolean z9, boolean z10, boolean z11) {
        long j3;
        boolean z12;
        boolean z13;
        boolean z14;
        cg.a aVar2;
        int i7;
        int i10;
        cg.a aVar3;
        boolean z15;
        float f10;
        float f11;
        double d;
        boolean z16;
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
        cg.a aVar5 = this.f3981y1;
        int i11 = this.f3982z1;
        this.f3982z1 = 0;
        if (aVar != null) {
            this.f3981y1 = aVar;
        } else {
            this.f3981y1 = cg.a.i(0L, aVar5.f6163a);
            this.f3982z1 |= 1;
        }
        long j10 = I0().f6164b;
        cg.a aVar6 = this.f3981y1;
        if (j10 < aVar6.f6164b) {
            this.f3982z1 |= 4;
        }
        boolean k10 = aVar6.k();
        cg.a aVar7 = this.f3977u1;
        cg.a aVar8 = this.f3979w1;
        cg.b bVar = cg.b.f6166b;
        if (!k10) {
            cg.a aVar9 = this.f3981y1;
            if (aVar9.f6163a == bVar) {
                aVar4 = aVar8;
            } else {
                aVar4 = aVar7;
            }
            j3 = 0;
            if (aVar4.f6164b > aVar9.f6164b) {
                this.f3982z1 |= 2;
            }
        } else {
            j3 = 0;
        }
        if (!z10 && aVar5.f6163a == this.f3981y1.f6163a) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (!z10 && aVar5.f6164b == this.f3981y1.f6164b) {
            z13 = false;
        } else {
            z13 = true;
        }
        if (!z10 && i11 == this.f3982z1) {
            z14 = false;
        } else {
            z14 = true;
        }
        lb0 lb0Var = this.l1;
        if (z14) {
            if ((this.f3982z1 & (-9)) == 0) {
                f20 = 0.0f;
            } else {
                f20 = 1.0f;
            }
            lb0Var.a(f20);
        }
        cg.b bVar2 = cg.b.f6165a;
        long j11 = j3;
        EditTextBoldCursor editTextBoldCursor = this.f3970m1;
        if (z12) {
            cg.b bVar3 = this.f3981y1.f6163a;
            org.telegram.ui.Components.i6 i6Var = this.f3971o1;
            if (bVar3 == bVar2) {
                i6Var.c(org.telegram.messenger.id.M0(2131746123, null), z11, true);
                editTextBoldCursor.setInputType(2);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(I0().a()).length())});
            } else if (bVar3 == bVar) {
                i6Var.c(org.telegram.messenger.id.M0(2131746122, null), z11, true);
                editTextBoldCursor.setInputType(8194);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(I0().a()).length() + 3)});
            }
            wo woVar = this.f3974r1.f30299c;
            if (this.f3981y1.f6163a == bVar) {
                z16 = true;
            } else {
                z16 = false;
            }
            woVar.a(z16, z11);
            ImageView imageView = this.f3976t1;
            ImageView imageView2 = this.f3975s1;
            if (z11) {
                ViewPropertyAnimator animate = imageView2.animate();
                i7 = 2;
                if (this.f3981y1.f6163a == bVar2) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                ViewPropertyAnimator alpha = animate.alpha(f14);
                if (this.f3981y1.f6163a == bVar2) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.0f;
                }
                ViewPropertyAnimator scaleX = alpha.scaleX(f15);
                if (this.f3981y1.f6163a == bVar2) {
                    f16 = 1.0f;
                } else {
                    f16 = 0.0f;
                }
                aVar2 = aVar7;
                scaleX.scaleY(f16).setDuration(180L).start();
                ViewPropertyAnimator animate2 = imageView.animate();
                if (this.f3981y1.f6163a == bVar) {
                    f17 = 1.0f;
                } else {
                    f17 = 0.0f;
                }
                ViewPropertyAnimator alpha2 = animate2.alpha(f17);
                if (this.f3981y1.f6163a == bVar) {
                    f18 = 1.0f;
                } else {
                    f18 = 0.0f;
                }
                ViewPropertyAnimator scaleX2 = alpha2.scaleX(f18);
                if (this.f3981y1.f6163a == bVar) {
                    f19 = 1.0f;
                } else {
                    f19 = 0.0f;
                }
                scaleX2.scaleY(f19).setDuration(180L).start();
            } else {
                aVar2 = aVar7;
                i7 = 2;
                if (this.f3981y1.f6163a == bVar2) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                imageView2.setAlpha(f12);
                if (this.f3981y1.f6163a == bVar) {
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
        if (z12 || z14) {
            int i12 = this.f3982z1;
            if ((i12 & 4) != 0) {
                lb0Var.setText(org.telegram.messenger.id.a0(null, null, 2131746125, I0().f()));
            } else if ((i12 & 2) != 0) {
                if (this.f3981y1.f6163a == bVar) {
                    aVar3 = aVar8;
                } else {
                    aVar3 = aVar2;
                }
                lb0Var.setText(org.telegram.messenger.id.a0(null, null, 2131746124, aVar3.f()));
            } else {
                if (this.f3981y1.f6163a == bVar2) {
                    i10 = 2131746127;
                } else {
                    i10 = 2131746126;
                }
                lb0Var.setText(org.telegram.messenger.id.M0(i10, null));
            }
        }
        if (z12 || z13 || z14) {
            if (this.f3982z1 == 0 && this.f3981y1.f6164b > j11) {
                z15 = true;
            } else {
                z15 = false;
            }
            fi.d dVar = this.f3972p1;
            if (dVar.f11756c0 != z15) {
                dVar.setEnabled(z15);
                dVar.setClickable(z15);
                if (z11) {
                    ViewPropertyAnimator animate3 = dVar.animate();
                    if (z15) {
                        f11 = 1.0f;
                    } else {
                        f11 = 0.6f;
                    }
                    org.telegram.messenger.camera.q.k(animate3, f11, 180L);
                } else {
                    if (z15) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.6f;
                    }
                    dVar.setAlpha(f10);
                }
            }
        }
        if (z12 || z13) {
            org.telegram.messenger.p0 p0Var = qp.s1(this.f28669a).f24946x7;
            cg.a aVar10 = this.f3981y1;
            cg.b bVar4 = aVar10.f6163a;
            long j12 = aVar10.f6164b;
            TextView textView = this.n1;
            if (bVar4 == bVar2) {
                textView.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.id.G((int) cg.a.i((j12 * ((org.telegram.messenger.j0) p0Var.f24456n.f13557b).f23464c) / 1000, bVar4).a(), "ResellGiftInfo", new Object[0])));
            } else if (bVar4 == bVar) {
                org.telegram.messenger.k5.r(null, null, 2131746132, new Object[]{cg.a.i((j12 * ((org.telegram.messenger.j0) p0Var.f24458o.f13557b).f23464c) / 1000, bVar4).b()}, textView);
            }
            StringBuilder sb2 = new StringBuilder(10);
            sb2.append('~');
            if (this.f3981y1.f6163a == bVar) {
                d = ((org.telegram.messenger.i0) qp.s1(this.f28669a).f24946x7.f24453l.f14325b).f23005a;
            } else {
                d = qp.s1(this.f28669a).f24759c6 * 1.0E-5d;
            }
            org.telegram.messenger.r1 i13 = org.telegram.messenger.r1.i();
            long c10 = (long) (this.f3981y1.c() * d * 100.0d);
            i13.getClass();
            sb2.append(org.telegram.messenger.r1.g("USD", i7, c10, false));
            this.f3973q1.c(sb2, z11, true);
        }
        if (z9 && z13) {
            String b10 = this.f3981y1.b();
            editTextBoldCursor.setText(b10);
            editTextBoldCursor.setSelection(b10.length());
        }
    }

    @Override
    public final void show() {
        super.show();
        org.telegram.messenger.g0.i3(new a3.f(this, 19), 50L);
    }
}
