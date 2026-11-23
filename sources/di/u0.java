package di;

import android.content.Context;
import android.text.InputFilter;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.messenger.o10;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.op;
import org.telegram.ui.Components.yb0;
public final class u0 extends org.telegram.ui.ActionBar.w2 {
    public int A1;
    public final yb0 f9867m1;
    public final EditTextBoldCursor n1;
    public final TextView f9868o1;
    public final org.telegram.ui.Components.o6 f9869p1;
    public final hi.e f9870q1;
    public final org.telegram.ui.Components.o6 f9871r1;
    public final org.telegram.ui.Cells.t8 f9872s1;
    public final ImageView f9873t1;
    public final ImageView f9874u1;
    public final cg.a f9875v1;
    public final cg.a f9876w1;
    public final cg.a f9877x1;
    public final cg.a f9878y1;
    public cg.a f9879z1;

    public u0(Context context, org.telegram.ui.ActionBar.h6 h6Var, int i7, cg.a aVar, ai.y1 y1Var) {
        super(1, context, h6Var, true);
        boolean z10;
        float f10;
        this.f30173a = i7;
        this.Q0 = true;
        this.E = true;
        org.telegram.messenger.p0 p0Var = np.u1(i7).A7;
        long max = Math.max(((org.telegram.messenger.l0) p0Var.f26242r.f14030b).f25176c, 10000000L);
        cg.b bVar = cg.b.f5306b;
        this.f9877x1 = cg.a.j(max, bVar);
        this.f9878y1 = cg.a.j(((org.telegram.messenger.l0) p0Var.f26244s.f14030b).f25176c, bVar);
        cg.b bVar2 = cg.b.f5305a;
        this.f9875v1 = cg.a.h(((org.telegram.messenger.j0) p0Var.f26238p.f15508b).f24812c, bVar2);
        this.f9876w1 = cg.a.h(((org.telegram.messenger.j0) p0Var.f26240q.f15508b).f24812c, bVar2);
        Q(org.telegram.ui.ActionBar.m6.f29454h5);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        LinearLayout g10 = org.telegram.messenger.f3.g(context, 0);
        linearLayout.addView(g10, c8.ma.t(-1, 56, 55, 0, 0, 0, 0));
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(context, false, false, false);
        this.f9869p1 = o6Var;
        int i10 = org.telegram.ui.ActionBar.m6.G6;
        org.telegram.ui.ActionBar.t6.Y(o6Var, i10, null);
        o6Var.setTextSize(org.telegram.messenger.g0.L(20.0f));
        o6Var.setGravity(8388627);
        o6Var.setTypeface(org.telegram.messenger.g0.o());
        g10.addView(o6Var, c8.ma.q(-1, -1, 1.0f, 119, 22, 0, 22, 0));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout.addView(linearLayout2, c8.ma.l(1.0f, -1, -2));
        yb0 yb0Var = new yb0(context, null);
        this.f9867m1 = yb0Var;
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.n1 = editTextBoldCursor;
        editTextBoldCursor.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setImeOptions(268435462);
        editTextBoldCursor.setTextSize(1, 17.0f);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setPadding(org.telegram.messenger.g0.L(42.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
        org.telegram.ui.ActionBar.t6.U(editTextBoldCursor, i10, null);
        editTextBoldCursor.requestFocus();
        yb0Var.setLeftPadding(org.telegram.messenger.g0.L(28.0f));
        yb0Var.e(editTextBoldCursor);
        if (aVar != null && !aVar.l()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        yb0Var.b(1.0f, f10, false);
        yb0Var.setForceUseCenter2(true);
        editTextBoldCursor.setOnFocusChangeListener(new ch.c0(this, 3));
        yb0Var.addView(editTextBoldCursor, c8.ma.e(-1, -2, 48));
        linearLayout2.addView(yb0Var, c8.ma.k(18.0f, 0.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView = new ImageView(context);
        this.f9873t1 = imageView;
        imageView.setImageResource(2131232754);
        yb0Var.addView(imageView, c8.ma.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f9874u1 = imageView2;
        imageView2.setImageResource(2131231958);
        yb0Var.addView(imageView2, c8.ma.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.o6 o6Var2 = new org.telegram.ui.Components.o6(context, false, false, false);
        this.f9871r1 = o6Var2;
        int i11 = org.telegram.ui.ActionBar.m6.f29773y6;
        org.telegram.ui.ActionBar.t6.Y(o6Var2, i11, null);
        o6Var2.setTextSize(org.telegram.messenger.g0.L(13.0f));
        o6Var2.setGravity(5);
        yb0Var.addView(o6Var2, c8.ma.d(-2, -1.0f, 21, 0.0f, 0.0f, 16.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f9868o1 = textView;
        org.telegram.ui.ActionBar.t6.U(textView, i11, null);
        textView.setTextSize(1, 13.0f);
        linearLayout2.addView(textView, c8.ma.t(-1, -2, 55, 33, 4, 33, 0));
        org.telegram.ui.Cells.t8 t8Var = new org.telegram.ui.Cells.t8(context);
        this.f9872s1 = t8Var;
        t8Var.f31882c.setLayoutParams(c8.ma.d(20, 20.0f, (hd.f24444a0 ? 5 : 3) | 48, 22.0f, 22.0f, 22.0f, 0.0f));
        t8Var.b(hd.N0(2131745932, null), hd.N0(2131745933, null), true, false);
        t8Var.setOnClickListener(new ah.d(this, 13));
        linearLayout2.addView(t8Var, c8.ma.t(-1, -2, 55, 0, 16, 0, 16));
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(1);
        linearLayout.addView(linearLayout3, c8.ma.r(-1, -2, 80));
        hi.e g11 = o10.g(24, context, h6Var, true);
        this.f9870q1 = g11;
        g11.setOnClickListener(new ai.y2(10, this, y1Var));
        g11.i(hd.N0(2131745955, null), false, true);
        linearLayout3.addView(g11, c8.ma.k(18.0f, 0.0f, 18.0f, 8.0f, -1, 48));
        if (aVar != null) {
            K0(cg.a.j(aVar.f5304b, aVar.f5303a), !aVar.l(), true, false);
        } else {
            K0(cg.a.j(0L, bVar2), false, true, false);
        }
        this.O = linearLayout;
        editTextBoldCursor.addTextChangedListener(new ah.j(this, 5));
    }

    public final cg.a J0() {
        if (this.f9879z1.f5303a == cg.b.f5306b) {
            return this.f9878y1;
        }
        return this.f9876w1;
    }

    public final void K0(cg.a aVar, boolean z10, boolean z11, boolean z12) {
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
        cg.a aVar5 = this.f9879z1;
        int i11 = this.A1;
        this.A1 = 0;
        if (aVar != null) {
            this.f9879z1 = aVar;
        } else {
            this.f9879z1 = cg.a.j(0L, aVar5.f5303a);
            this.A1 |= 1;
        }
        long j10 = J0().f5304b;
        cg.a aVar6 = this.f9879z1;
        if (j10 < aVar6.f5304b) {
            this.A1 |= 4;
        }
        boolean l10 = aVar6.l();
        cg.a aVar7 = this.f9875v1;
        cg.a aVar8 = this.f9877x1;
        cg.b bVar = cg.b.f5306b;
        if (!l10) {
            cg.a aVar9 = this.f9879z1;
            if (aVar9.f5303a == bVar) {
                aVar4 = aVar8;
            } else {
                aVar4 = aVar7;
            }
            j3 = 0;
            if (aVar4.f5304b > aVar9.f5304b) {
                this.A1 |= 2;
            }
        } else {
            j3 = 0;
        }
        if (!z11 && aVar5.f5303a == this.f9879z1.f5303a) {
            z13 = false;
        } else {
            z13 = true;
        }
        if (!z11 && aVar5.f5304b == this.f9879z1.f5304b) {
            z14 = false;
        } else {
            z14 = true;
        }
        if (!z11 && i11 == this.A1) {
            z15 = false;
        } else {
            z15 = true;
        }
        yb0 yb0Var = this.f9867m1;
        if (z15) {
            if ((this.A1 & (-9)) == 0) {
                f20 = 0.0f;
            } else {
                f20 = 1.0f;
            }
            yb0Var.a(f20);
        }
        cg.b bVar2 = cg.b.f5305a;
        long j11 = j3;
        EditTextBoldCursor editTextBoldCursor = this.n1;
        if (z13) {
            cg.b bVar3 = this.f9879z1.f5303a;
            org.telegram.ui.Components.o6 o6Var = this.f9869p1;
            if (bVar3 == bVar2) {
                o6Var.c(hd.N0(2131745927, null), z12, true);
                editTextBoldCursor.setInputType(2);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(J0().a()).length())});
            } else if (bVar3 == bVar) {
                o6Var.c(hd.N0(2131745926, null), z12, true);
                editTextBoldCursor.setInputType(8194);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(J0().a()).length() + 3)});
            }
            op opVar = this.f9872s1.f31882c;
            if (this.f9879z1.f5303a == bVar) {
                z17 = true;
            } else {
                z17 = false;
            }
            opVar.a(z17, z12);
            ImageView imageView = this.f9874u1;
            ImageView imageView2 = this.f9873t1;
            if (z12) {
                ViewPropertyAnimator animate = imageView2.animate();
                i7 = 2;
                if (this.f9879z1.f5303a == bVar2) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                ViewPropertyAnimator alpha = animate.alpha(f14);
                if (this.f9879z1.f5303a == bVar2) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.0f;
                }
                ViewPropertyAnimator scaleX = alpha.scaleX(f15);
                if (this.f9879z1.f5303a == bVar2) {
                    f16 = 1.0f;
                } else {
                    f16 = 0.0f;
                }
                aVar2 = aVar7;
                scaleX.scaleY(f16).setDuration(180L).start();
                ViewPropertyAnimator animate2 = imageView.animate();
                if (this.f9879z1.f5303a == bVar) {
                    f17 = 1.0f;
                } else {
                    f17 = 0.0f;
                }
                ViewPropertyAnimator alpha2 = animate2.alpha(f17);
                if (this.f9879z1.f5303a == bVar) {
                    f18 = 1.0f;
                } else {
                    f18 = 0.0f;
                }
                ViewPropertyAnimator scaleX2 = alpha2.scaleX(f18);
                if (this.f9879z1.f5303a == bVar) {
                    f19 = 1.0f;
                } else {
                    f19 = 0.0f;
                }
                scaleX2.scaleY(f19).setDuration(180L).start();
            } else {
                aVar2 = aVar7;
                i7 = 2;
                if (this.f9879z1.f5303a == bVar2) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                imageView2.setAlpha(f12);
                if (this.f9879z1.f5303a == bVar) {
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
                yb0Var.setText(hd.a0(null, null, 2131745929, J0().g()));
            } else if ((i12 & 2) != 0) {
                if (this.f9879z1.f5303a == bVar) {
                    aVar3 = aVar8;
                } else {
                    aVar3 = aVar2;
                }
                yb0Var.setText(hd.a0(null, null, 2131745928, aVar3.g()));
            } else {
                if (this.f9879z1.f5303a == bVar2) {
                    i10 = 2131745931;
                } else {
                    i10 = 2131745930;
                }
                yb0Var.setText(hd.N0(i10, null));
            }
        }
        if (z13 || z14 || z15) {
            if (this.A1 == 0 && this.f9879z1.f5304b > j11) {
                z16 = true;
            } else {
                z16 = false;
            }
            hi.e eVar = this.f9870q1;
            if (eVar.f14567e0 != z16) {
                eVar.setEnabled(z16);
                eVar.setClickable(z16);
                if (z12) {
                    ViewPropertyAnimator animate3 = eVar.animate();
                    if (z16) {
                        f11 = 1.0f;
                    } else {
                        f11 = 0.6f;
                    }
                    o10.n(animate3, f11, 180L);
                } else {
                    if (z16) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.6f;
                    }
                    eVar.setAlpha(f10);
                }
            }
        }
        if (z13 || z14) {
            org.telegram.messenger.p0 p0Var = np.u1(this.f30173a).A7;
            cg.a aVar10 = this.f9879z1;
            cg.b bVar4 = aVar10.f5303a;
            long j12 = aVar10.f5304b;
            TextView textView = this.f9868o1;
            if (bVar4 == bVar2) {
                textView.setText(org.telegram.messenger.g0.W2(hd.G((int) cg.a.j((j12 * ((org.telegram.messenger.j0) p0Var.f26234n.f15508b).f24812c) / 1000, bVar4).a(), "ResellGiftInfo", new Object[0])));
            } else if (bVar4 == bVar) {
                org.telegram.messenger.f3.q(null, null, 2131745936, new Object[]{cg.a.j((j12 * ((org.telegram.messenger.j0) p0Var.f26236o.f15508b).f24812c) / 1000, bVar4).b()}, textView);
            }
            StringBuilder sb2 = new StringBuilder(10);
            sb2.append('~');
            if (this.f9879z1.f5303a == bVar) {
                d = ((org.telegram.messenger.i0) np.u1(this.f30173a).A7.f26231l.f15708b).f24565a;
            } else {
                d = np.u1(this.f30173a).f25847f6 * 1.0E-5d;
            }
            org.telegram.messenger.r1 i13 = org.telegram.messenger.r1.i();
            long c10 = (long) (this.f9879z1.c() * d * 100.0d);
            i13.getClass();
            sb2.append(org.telegram.messenger.r1.g("USD", i7, c10, false));
            this.f9871r1.c(sb2, z12, true);
        }
        if (z10 && z14) {
            String b10 = this.f9879z1.b();
            editTextBoldCursor.setText(b10);
            editTextBoldCursor.setSelection(b10.length());
        }
    }

    @Override
    public final void show() {
        super.show();
        org.telegram.messenger.g0.h3(new ca.r(this, 14), 50L);
    }
}
