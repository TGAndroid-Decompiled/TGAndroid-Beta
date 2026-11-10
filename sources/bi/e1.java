package bi;

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
import org.telegram.messenger.c20;
import org.telegram.messenger.nj;
import org.telegram.messenger.qp;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.b30;
import org.telegram.ui.Components.lb0;
import org.telegram.ui.Components.wp;
import org.telegram.ui.cn;
public final class e1 extends org.telegram.ui.ActionBar.w2 {
    public final cg.a A1;
    public cg.a B1;
    public long C1;
    public int D1;
    public boolean E1;
    public final wp[] F1;
    public final wp[] G1;
    public boolean H1;
    public final c l1;
    public final boolean f3734m1;
    public final int n1;
    public final b30 f3735o1;
    public final lb0 f3736p1;
    public final EditTextBoldCursor f3737q1;
    public final TextView f3738r1;
    public final v f3739s1;
    public final fi.d f3740t1;
    public final org.telegram.ui.Components.i6 f3741u1;
    public final ImageView f3742v1;
    public final ImageView f3743w1;
    public final cg.a f3744x1;
    public final cg.a f3745y1;
    public final cg.a f3746z1;

    public e1(final Context context, int i7, long j3, nj njVar, cn cnVar, final org.telegram.ui.ActionBar.h6 h6Var, int i10, c20 c20Var) {
        super(1, context, h6Var, true);
        boolean z9;
        int i11;
        boolean z10;
        float f10;
        boolean z11;
        this.C1 = -1L;
        this.F1 = new wp[1];
        this.G1 = new wp[1];
        this.n1 = i10;
        this.D = true;
        this.P0 = true;
        boolean z12 = org.telegram.messenger.t3.z(i7, 24, j3);
        this.f3734m1 = z12;
        if (!z12 && !ea.y(i7, true).j()) {
            z9 = false;
        } else {
            z9 = true;
        }
        org.telegram.messenger.p0 p0Var = qp.s1(i7).f24946x7;
        long j10 = ((org.telegram.messenger.l0) p0Var.f24444g.f13891b).f23822c;
        cg.b bVar = cg.b.f6166b;
        this.f3746z1 = cg.a.i(j10, bVar);
        this.A1 = cg.a.i(((org.telegram.messenger.l0) p0Var.h.f13891b).f23822c, bVar);
        cg.b bVar2 = cg.b.f6165a;
        this.f3744x1 = cg.a.g(((org.telegram.messenger.j0) p0Var.d.f13557b).f23464c, bVar2);
        this.f3745y1 = cg.a.g(((org.telegram.messenger.j0) p0Var.f24440e.f13557b).f23464c, bVar2);
        if (!z12) {
            c cVar = new c(i7, context, h6Var);
            this.l1 = cVar;
            cVar.setScaleX(0.6f);
            cVar.setScaleY(0.6f);
            cVar.setAlpha(0.0f);
            cVar.setEnabled(false);
            cVar.setClickable(false);
            this.f28675c.addView(cVar, c8.ha.d(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
            c8.ka.a(cVar);
            cVar.setOnClickListener(new View.OnClickListener(this) {
                public final e1 f3556b;

                {
                    this.f3556b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r4) {
                        case 0:
                            if (this.f3556b.B1.f6163a == cg.b.f6165a) {
                                new uc(context, h6Var).show();
                                return;
                            }
                            return;
                        default:
                            e1 e1Var = this.f3556b;
                            ((org.telegram.ui.ActionBar.w2) org.telegram.ui.Components.u4.Q(context, e1Var.C1, new a1.c(e1Var, 11), h6Var, 0).f14325b).show();
                            return;
                    }
                }
            });
        } else {
            this.l1 = null;
        }
        P(org.telegram.ui.ActionBar.m6.f27963h5);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        LinearLayout f11 = org.telegram.messenger.k5.f(context, 0);
        linearLayout.addView(f11, c8.ha.t(-1, 56, 55, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        int i12 = org.telegram.ui.ActionBar.m6.G6;
        org.telegram.ui.ActionBar.t6.U(textView, i12, null);
        textView.setTextSize(1, 20.0f);
        textView.setGravity(8388627);
        if (i10 == 0) {
            i11 = 2131747077;
        } else {
            i11 = 2131747084;
        }
        textView.setText(org.telegram.messenger.id.M0(i11, null));
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setEllipsize(TextUtils.TruncateAt.END);
        f11.addView(textView, c8.ha.q(-1, -1, 1.0f, 119, 22, 0, 22, 0));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131231269);
        int i13 = org.telegram.ui.ActionBar.m6.W5;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        org.telegram.ui.ActionBar.t6.s(imageView, i13, h6Var, mode);
        c8.ka.a(imageView);
        boolean z13 = z9;
        imageView.setOnClickListener(new ah.d(this, 4));
        f11.addView(imageView, c8.ha.q(48, 48, 0.0f, 21, 0, 0, 6, 0));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f3737q1 = editTextBoldCursor;
        if (z13) {
            b30 b30Var = new b30(context, h6Var);
            this.f3735o1 = b30Var;
            ArrayList arrayList = new ArrayList();
            arrayList.add(org.telegram.messenger.id.M0(2131744377, null));
            arrayList.add(org.telegram.messenger.id.M0(2131744376, null));
            b30Var.b(arrayList, new w0(this, 1));
            linearLayout.addView(b30Var, c8.ha.k(18.0f, 0.0f, 18.0f, 12.0f, -1, -2));
        } else {
            this.f3735o1 = null;
        }
        LinearLayout f12 = org.telegram.messenger.k5.f(context, 1);
        linearLayout.addView(f12, c8.ha.l(1.0f, -1, -2));
        lb0 lb0Var = new lb0(context, null);
        this.f3736p1 = lb0Var;
        editTextBoldCursor.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setImeOptions(268435462);
        editTextBoldCursor.setTextSize(1, 17.0f);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setPadding(org.telegram.messenger.g0.L(42.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
        org.telegram.ui.ActionBar.t6.U(editTextBoldCursor, i12, null);
        editTextBoldCursor.requestFocus();
        lb0Var.setLeftPadding(org.telegram.messenger.g0.L(28.0f));
        lb0Var.e(editTextBoldCursor);
        cg.a aVar = njVar.f24206a;
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
        lb0Var.b(1.0f, f10, false);
        lb0Var.setForceUseCenter2(true);
        editTextBoldCursor.setOnFocusChangeListener(new n(this, 2));
        lb0Var.addView(editTextBoldCursor, c8.ha.e(-1, -2, 48));
        f12.addView(lb0Var, c8.ha.k(18.0f, 0.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView2 = new ImageView(context);
        this.f3742v1 = imageView2;
        imageView2.setImageResource(2131232752);
        lb0Var.addView(imageView2, c8.ha.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView3 = new ImageView(context);
        this.f3743w1 = imageView3;
        imageView3.setImageResource(2131231957);
        lb0Var.addView(imageView3, c8.ha.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(context, false, false, false);
        this.f3741u1 = i6Var;
        int i14 = org.telegram.ui.ActionBar.m6.f28282y6;
        org.telegram.ui.ActionBar.t6.Y(i6Var, i14, null);
        i6Var.setTextSize(org.telegram.messenger.g0.L(13.0f));
        i6Var.setGravity(5);
        lb0Var.addView(i6Var, c8.ha.d(-2, -1.0f, 21, 0.0f, 0.0f, 16.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.f3738r1 = textView2;
        org.telegram.ui.ActionBar.t6.U(textView2, i14, null);
        textView2.setTextSize(1, 13.0f);
        f12.addView(textView2, c8.ha.t(-1, -2, 55, 33, 4, 33, 0));
        v vVar = new v(context, 1);
        this.f3739s1 = vVar;
        vVar.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        vVar.setCursorWidth(1.5f);
        vVar.setTextSize(1, 17.0f);
        vVar.setMaxLines(1);
        vVar.setBackground(null);
        vVar.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
        org.telegram.ui.ActionBar.t6.U(vVar, i12, null);
        vVar.setFocusable(false);
        vVar.setClickable(false);
        vVar.setEnabled(false);
        lb0 lb0Var2 = new lb0(context, null);
        lb0Var2.setText(org.telegram.messenger.id.M0(2131747074, null));
        lb0Var2.e(vVar);
        lb0Var2.addView(vVar, c8.ha.d(-1, -2.0f, 48, 0.0f, 0.0f, 48.0f, 0.0f));
        c8.ka.b(lb0Var2, 0.02f, 1.2f);
        lb0Var2.setOnClickListener(new View.OnClickListener(this) {
            public final e1 f3556b;

            {
                this.f3556b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r4) {
                    case 0:
                        if (this.f3556b.B1.f6163a == cg.b.f6165a) {
                            new uc(context, h6Var).show();
                            return;
                        }
                        return;
                    default:
                        e1 e1Var = this.f3556b;
                        ((org.telegram.ui.ActionBar.w2) org.telegram.ui.Components.u4.Q(context, e1Var.C1, new a1.c(e1Var, 11), h6Var, 0).f14325b).show();
                        return;
                }
            }
        });
        f12.addView(lb0Var2, c8.ha.k(18.0f, 24.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView4 = new ImageView(context);
        imageView4.setImageResource(2131230871);
        org.telegram.ui.ActionBar.t6.s(imageView4, i13, h6Var, mode);
        lb0Var2.addView(imageView4, c8.ha.d(24, 24.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
        TextView textView3 = new TextView(context);
        org.telegram.ui.ActionBar.t6.U(textView3, i14, null);
        textView3.setTextSize(1, 13.0f);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(2131747094, null)));
        spannableStringBuilder.append(' ');
        org.telegram.messenger.k5.q(null, null, 2131747093, new Object[]{Long.valueOf(qp.s1(i7).f24946x7.f24447i.M1(TimeUnit.HOURS))}, spannableStringBuilder);
        textView3.setText(spannableStringBuilder);
        f12.addView(textView3, c8.ha.t(-1, -2, 55, 33, 4, 33, 24));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout.addView(linearLayout2, c8.ha.r(-1, -2, 80));
        fi.d dVar = new fi.d(context, h6Var, true);
        this.f3740t1 = dVar;
        dVar.setOnClickListener(new d1(this, cnVar, i7, context, h6Var, j3, c20Var));
        if (i10 == 1) {
            dVar.i(org.telegram.messenger.id.M0(2131747083, null), false, true);
        }
        linearLayout2.addView(dVar, c8.ha.k(18.0f, 0.0f, 18.0f, 8.0f, -1, 48));
        if (aVar != null) {
            z11 = false;
            M0(cg.a.i(aVar.f6164b, aVar.f6163a), !aVar.k(), true, false);
        } else {
            z11 = false;
            M0(cg.a.i(0L, bVar2), false, true, false);
        }
        long j11 = njVar.f24207b;
        if (this.C1 != j11) {
            this.C1 = j11;
            vVar.setText(K0(j11));
        }
        J0(z11);
        this.N = linearLayout;
        editTextBoldCursor.addTextChangedListener(new ah.j(this, 2));
    }

    public static String K0(long j3) {
        if (j3 <= 0) {
            return org.telegram.messenger.id.M0(2131747092, null);
        }
        String x10 = org.telegram.messenger.id.x(j3, true);
        if (!x10.isEmpty()) {
            return Character.toUpperCase(x10.charAt(0)) + x10.substring(1);
        }
        return x10;
    }

    public final void I0() {
        boolean z9;
        float f10;
        boolean z10 = this.H1;
        c cVar = this.l1;
        if ((z10 && !this.I && cVar != null && this.f28672b.getY() > org.telegram.messenger.g0.L(32.0f)) || this.f3735o1 == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (this.E1 != z9) {
            this.E1 = z9;
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

    public final void J0(boolean z9) {
        boolean z10;
        if (this.D1 == 0 && (this.B1.f6164b >= 0 || this.C1 > 0)) {
            z10 = true;
        } else {
            z10 = false;
        }
        fi.d dVar = this.f3740t1;
        if (dVar.f11756c0 != z10) {
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

    public final cg.a L0() {
        if (this.B1.f6163a == cg.b.f6166b) {
            return this.A1;
        }
        return this.f3745y1;
    }

    public final void M0(cg.a aVar, boolean z9, boolean z10, boolean z11) {
        boolean z12;
        boolean z13;
        boolean z14;
        ?? r16;
        int i7;
        int i10;
        boolean z15;
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
        cg.a aVar2;
        cg.a aVar3 = this.B1;
        int i12 = this.D1;
        this.D1 = 0;
        if (aVar != null) {
            this.B1 = aVar;
        } else {
            this.B1 = cg.a.i(0L, aVar3.f6163a);
            this.D1 |= 1;
        }
        long j3 = L0().f6164b;
        cg.a aVar4 = this.B1;
        if (j3 < aVar4.f6164b) {
            this.D1 |= 4;
        }
        boolean k10 = aVar4.k();
        cg.a aVar5 = this.f3744x1;
        cg.a aVar6 = this.f3746z1;
        cg.b bVar = cg.b.f6166b;
        if (!k10) {
            cg.a aVar7 = this.B1;
            if (aVar7.f6163a == bVar) {
                aVar2 = aVar6;
            } else {
                aVar2 = aVar5;
            }
            if (aVar2.f6164b > aVar7.f6164b) {
                this.D1 |= 2;
            }
        }
        if (!z10 && aVar3.f6163a == this.B1.f6163a) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (!z10 && aVar3.f6164b == this.B1.f6164b) {
            z13 = false;
        } else {
            z13 = true;
        }
        if (!z10 && i12 == this.D1) {
            z14 = false;
        } else {
            z14 = true;
        }
        lb0 lb0Var = this.f3736p1;
        if (z14) {
            if ((this.D1 & (-9)) == 0) {
                f18 = 0.0f;
            } else {
                f18 = 1.0f;
            }
            lb0Var.a(f18);
        }
        cg.b bVar2 = cg.b.f6165a;
        EditTextBoldCursor editTextBoldCursor = this.f3737q1;
        if (z12) {
            b30 b30Var = this.f3735o1;
            boolean z16 = false;
            if (b30Var != null) {
                if (this.B1.f6163a == bVar2) {
                    i11 = 0;
                } else {
                    i11 = 1;
                }
                b30Var.a(i11, z11);
            }
            cg.b bVar3 = this.B1.f6163a;
            TextView textView = this.f3738r1;
            if (bVar3 == bVar2) {
                textView.setText(org.telegram.messenger.id.M0(2131747080, null));
                editTextBoldCursor.setInputType(2);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(L0().a()).length())});
            } else if (bVar3 == bVar) {
                textView.setText(org.telegram.messenger.id.M0(2131747079, null));
                editTextBoldCursor.setInputType(8194);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(L0().a()).length() + 3)});
            }
            ImageView imageView = this.f3743w1;
            ImageView imageView2 = this.f3742v1;
            if (z11) {
                ViewPropertyAnimator animate = imageView2.animate();
                i7 = 2;
                if (this.B1.f6163a == bVar2) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                ViewPropertyAnimator alpha = animate.alpha(f12);
                if (this.B1.f6163a == bVar2) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                ViewPropertyAnimator scaleX = alpha.scaleX(f13);
                if (this.B1.f6163a == bVar2) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                scaleX.scaleY(f14).setDuration(180L).start();
                ViewPropertyAnimator animate2 = imageView.animate();
                if (this.B1.f6163a == bVar) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.0f;
                }
                ViewPropertyAnimator alpha2 = animate2.alpha(f15);
                if (this.B1.f6163a == bVar) {
                    f16 = 1.0f;
                } else {
                    f16 = 0.0f;
                }
                ViewPropertyAnimator scaleX2 = alpha2.scaleX(f16);
                if (this.B1.f6163a == bVar) {
                    f17 = 1.0f;
                } else {
                    f17 = 0.0f;
                }
                scaleX2.scaleY(f17).setDuration(180L).start();
            } else {
                i7 = 2;
                if (this.B1.f6163a == bVar2) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                imageView2.setAlpha(f10);
                if (this.B1.f6163a == bVar) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                imageView.setAlpha(f11);
            }
            c cVar = this.l1;
            r16 = z16;
            if (cVar != null) {
                cg.b bVar4 = this.B1.f6163a;
                r16 = z16;
                if (cVar.f3550e != bVar4) {
                    cVar.f3550e = bVar4;
                    cVar.a();
                    r16 = z16;
                }
            }
        } else {
            r16 = 0;
            i7 = 2;
        }
        if (z12 || z14) {
            int i13 = this.D1;
            if ((i13 & 4) != 0) {
                Object[] objArr = new Object[1];
                objArr[r16] = L0().f();
                lb0Var.setText(org.telegram.messenger.id.a0(null, null, 2131744418, objArr));
            } else if ((i13 & 2) != 0) {
                if (this.B1.f6163a == bVar) {
                    aVar5 = aVar6;
                }
                String f19 = aVar5.f();
                Object[] objArr2 = new Object[1];
                objArr2[r16] = f19;
                lb0Var.setText(org.telegram.messenger.id.a0(null, null, 2131744417, objArr2));
            } else {
                if (this.B1.f6163a == bVar2) {
                    i10 = 2131747076;
                } else {
                    i10 = 2131747075;
                }
                lb0Var.setText(org.telegram.messenger.id.M0(i10, null));
            }
        }
        if (z12 || z13 || z14) {
            int i14 = this.n1;
            fi.d dVar = this.f3740t1;
            if (i14 == 0) {
                if (!this.B1.k()) {
                    cg.a aVar8 = this.B1;
                    if (aVar8.f6163a == bVar) {
                        z15 = true;
                    } else {
                        z15 = r16;
                    }
                    if (z15) {
                        E = aVar8.b();
                    } else {
                        E = org.telegram.messenger.id.E(aVar8.a(), ',');
                    }
                    Object[] objArr3 = new Object[1];
                    objArr3[r16] = E;
                    String a02 = org.telegram.messenger.id.a0(null, null, 2131747081, objArr3);
                    if (z15) {
                        wpVarArr = this.G1;
                    } else {
                        wpVarArr = this.F1;
                    }
                    dVar.i(dd.s1(dd.Y0(z15, a02, wpVarArr), z15), z11, true);
                } else {
                    dVar.i(org.telegram.messenger.id.M0(2131747082, null), z11, true);
                }
            } else {
                dVar.i(org.telegram.messenger.id.M0(2131747083, null), z11, true);
            }
            J0(z11);
        }
        if (z12 || z13) {
            StringBuilder sb2 = new StringBuilder(10);
            sb2.append('~');
            if (this.B1.f6163a == bVar) {
                d = ((org.telegram.messenger.i0) qp.s1(this.f28669a).f24946x7.f24453l.f14325b).f23005a;
            } else {
                d = qp.s1(this.f28669a).f24759c6 * 1.0E-5d;
            }
            org.telegram.messenger.r1.i().getClass();
            sb2.append(org.telegram.messenger.r1.g("USD", i7, (long) (this.B1.c() * d * 100.0d), r16));
            this.f3741u1.c(sb2, z11, true);
        }
        if (z9 && z13) {
            String b10 = this.B1.b();
            editTextBoldCursor.setText(b10);
            editTextBoldCursor.setSelection(b10.length());
        }
    }

    @Override
    public final boolean X(float f10, float f11) {
        c cVar;
        if (this.E1 && (cVar = this.l1) != null && f10 >= cVar.getX() && f10 <= cVar.getX() + cVar.getWidth() && f11 >= cVar.getY() && f11 <= cVar.getY() + cVar.getHeight()) {
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
        org.telegram.messenger.g0.i3(new a3.f(this, 18), 50L);
    }

    @Override
    public final void v() {
        this.H1 = true;
        I0();
    }
}
