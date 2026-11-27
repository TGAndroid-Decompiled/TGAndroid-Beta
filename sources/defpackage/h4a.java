package defpackage;

import android.content.Context;
import android.text.InputFilter;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class h4a extends nx0 {
    public final lu7 l1;
    public final EditTextBoldCursor m1;
    public final TextView n1;
    public final in o1;
    public final c51 p1;
    public final in q1;
    public final xkb r1;
    public final ImageView s1;
    public final ImageView t1;
    public final oj u1;
    public final oj v1;
    public final oj w1;
    public final oj x1;
    public oj y1;
    public int z1;

    public h4a(Context context, vnb vnbVar, int i, oj ojVar, ku9 ku9Var) {
        super(1, vnbVar, context, true);
        boolean z;
        float f;
        this.a = i;
        this.Q0 = true;
        this.E = true;
        hr hrVar = uc7.s1(i).k4;
        long max = Math.max(hrVar.q.f(), 10000000L);
        pj pjVar = pj.b;
        this.w1 = oj.j(max, pjVar);
        this.x1 = oj.j(hrVar.r.f(), pjVar);
        pj pjVar2 = pj.a;
        this.u1 = oj.h(hrVar.o.f(), pjVar2);
        this.v1 = oj.h(hrVar.p.f(), pjVar2);
        L(aob.h5);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        LinearLayout j = uh9.j(context, 0);
        linearLayout.addView(j, tre.t(-1, 56, 55, 0, 0, 0, 0));
        in inVar = new in(context, false, false, false);
        this.o1 = inVar;
        int i2 = aob.G6;
        yob.U(inVar, i2, null);
        inVar.setTextSize(hl.L(20.0f));
        inVar.setGravity(8388627);
        inVar.setTypeface(hl.o());
        j.addView(inVar, tre.q(-1, -1, 1.0f, 119, 22, 0, 22, 0));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout.addView(linearLayout2, tre.l(1.0f, -1, -2));
        lu7 lu7Var = new lu7(context, null);
        this.l1 = lu7Var;
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.m1 = editTextBoldCursor;
        editTextBoldCursor.setCursorSize(hl.L(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setImeOptions(268435462);
        editTextBoldCursor.setTextSize(1, 17.0f);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setPadding(hl.L(42.0f), hl.L(16.0f), hl.L(16.0f), hl.L(16.0f));
        yob.X(editTextBoldCursor, i2, null);
        editTextBoldCursor.requestFocus();
        lu7Var.setLeftPadding(hl.L(28.0f));
        lu7Var.e(editTextBoldCursor);
        if (ojVar != null && !ojVar.l()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        lu7Var.b(1.0f, f, false);
        lu7Var.setForceUseCenter2(true);
        editTextBoldCursor.setOnFocusChangeListener(new ts0(this, (byte) 18));
        lu7Var.addView(editTextBoldCursor, tre.e(-1, -2, 48));
        linearLayout2.addView(lu7Var, tre.k(18.0f, 0.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView = new ImageView(context);
        this.s1 = imageView;
        imageView.setImageResource(2131232775);
        lu7Var.addView(imageView, tre.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.t1 = imageView2;
        imageView2.setImageResource(2131231961);
        lu7Var.addView(imageView2, tre.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        in inVar2 = new in(context, false, false, false);
        this.q1 = inVar2;
        int i3 = aob.y6;
        yob.U(inVar2, i3, null);
        inVar2.setTextSize(hl.L(13.0f));
        inVar2.setGravity(5);
        lu7Var.addView(inVar2, tre.d(-2, -1.0f, 21, 0.0f, 0.0f, 16.0f, 0.0f));
        TextView textView = new TextView(context);
        this.n1 = textView;
        yob.X(textView, i3, null);
        textView.setTextSize(1, 13.0f);
        linearLayout2.addView(textView, tre.t(-1, -2, 55, 33, 4, 33, 0));
        xkb xkbVar = new xkb(context);
        this.r1 = xkbVar;
        xkbVar.c.setLayoutParams(tre.d(20, 20.0f, (ob6.a0 ? 5 : 3) | 48, 22.0f, 22.0f, 22.0f, 0.0f));
        xkbVar.b(ob6.M0(2131745855, null), ob6.M0(2131745856, null), true, false);
        xkbVar.setOnClickListener(new jn8(this, (byte) 24));
        linearLayout2.addView(xkbVar, tre.t(-1, -2, 55, 0, 16, 0, 16));
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(1);
        linearLayout.addView(linearLayout3, tre.r(-1, -2, 80));
        c51 i4 = xnb.i(24, vnbVar, context, true);
        this.p1 = i4;
        i4.setOnClickListener(new jy8(this, ku9Var, (byte) 10));
        i4.i(ob6.M0(2131745878, null), false, true);
        linearLayout3.addView(i4, tre.k(18.0f, 0.0f, 18.0f, 8.0f, -1, 48));
        if (ojVar != null) {
            F0(oj.j(ojVar.b, ojVar.a), !ojVar.l(), true, false);
        } else {
            F0(oj.j(0L, pjVar2), false, true, false);
        }
        this.O = linearLayout;
        editTextBoldCursor.addTextChangedListener(new nh6(this, (byte) 13));
    }

    public final oj E0() {
        if (this.y1.a == pj.b) {
            return this.x1;
        }
        return this.v1;
    }

    public final void F0(oj ojVar, boolean z, boolean z2, boolean z3) {
        boolean z4;
        boolean z5;
        boolean z6;
        int i;
        int i2;
        oj ojVar2;
        boolean z7;
        float f;
        float f2;
        double d;
        boolean z8;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        oj ojVar3;
        pj pjVar = pj.b;
        pj pjVar2 = pj.a;
        oj ojVar4 = this.y1;
        int i3 = this.z1;
        this.z1 = 0;
        if (ojVar != null) {
            this.y1 = ojVar;
        } else {
            this.y1 = oj.j(0L, ojVar4.a);
            this.z1 |= 1;
        }
        long j = E0().b;
        oj ojVar5 = this.y1;
        if (j < ojVar5.b) {
            this.z1 |= 4;
        }
        if (!ojVar5.l()) {
            oj ojVar6 = this.y1;
            if (ojVar6.a == pjVar) {
                ojVar3 = this.w1;
            } else {
                ojVar3 = this.u1;
            }
            if (ojVar3.b > ojVar6.b) {
                this.z1 |= 2;
            }
        }
        if (!z2 && ojVar4.a == this.y1.a) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (!z2 && ojVar4.b == this.y1.b) {
            z5 = false;
        } else {
            z5 = true;
        }
        if (!z2 && i3 == this.z1) {
            z6 = false;
        } else {
            z6 = true;
        }
        if (z6) {
            lu7 lu7Var = this.l1;
            if ((this.z1 & (-9)) == 0) {
                f11 = 0.0f;
            } else {
                f11 = 1.0f;
            }
            lu7Var.a(f11);
        }
        if (z4) {
            ImageView imageView = this.t1;
            in inVar = this.o1;
            EditTextBoldCursor editTextBoldCursor = this.m1;
            i = 0;
            pj pjVar3 = this.y1.a;
            if (pjVar3 == pjVar2) {
                inVar.c(ob6.M0(2131745850, null), z3, true);
                editTextBoldCursor.setInputType(2);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(E0().a()).length())});
            } else if (pjVar3 == pjVar) {
                inVar.c(ob6.M0(2131745849, null), z3, true);
                editTextBoldCursor.setInputType(8194);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(E0().a()).length() + 3)});
            }
            og2 og2Var = this.r1.c;
            if (this.y1.a == pjVar) {
                z8 = true;
            } else {
                z8 = false;
            }
            og2Var.a(z8, z3);
            ImageView imageView2 = this.s1;
            if (z3) {
                ViewPropertyAnimator animate = imageView2.animate();
                if (this.y1.a == pjVar2) {
                    f5 = 1.0f;
                } else {
                    f5 = 0.0f;
                }
                ViewPropertyAnimator alpha = animate.alpha(f5);
                if (this.y1.a == pjVar2) {
                    f6 = 1.0f;
                } else {
                    f6 = 0.0f;
                }
                ViewPropertyAnimator scaleX = alpha.scaleX(f6);
                if (this.y1.a == pjVar2) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                scaleX.scaleY(f7).setDuration(180L).start();
                ViewPropertyAnimator animate2 = imageView.animate();
                if (this.y1.a == pjVar) {
                    f8 = 1.0f;
                } else {
                    f8 = 0.0f;
                }
                ViewPropertyAnimator alpha2 = animate2.alpha(f8);
                if (this.y1.a == pjVar) {
                    f9 = 1.0f;
                } else {
                    f9 = 0.0f;
                }
                ViewPropertyAnimator scaleX2 = alpha2.scaleX(f9);
                if (this.y1.a == pjVar) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                scaleX2.scaleY(f10).setDuration(180L).start();
            } else {
                if (this.y1.a == pjVar2) {
                    f3 = 1.0f;
                } else {
                    f3 = 0.0f;
                }
                imageView2.setAlpha(f3);
                if (this.y1.a == pjVar) {
                    f4 = 1.0f;
                } else {
                    f4 = 0.0f;
                }
                imageView.setAlpha(f4);
            }
        } else {
            i = 0;
        }
        if (z4 || z6) {
            lu7 lu7Var2 = this.l1;
            int i4 = this.z1;
            if ((i4 & 4) != 0) {
                Object[] objArr = new Object[1];
                objArr[i] = E0().g();
                lu7Var2.setText(ob6.a0(null, null, 2131745852, objArr));
            } else {
                int i5 = i4 & 2;
                oj ojVar7 = this.y1;
                if (i5 != 0) {
                    if (ojVar7.a == pjVar) {
                        ojVar2 = this.w1;
                    } else {
                        ojVar2 = this.u1;
                    }
                    Object[] objArr2 = new Object[1];
                    objArr2[i] = ojVar2.g();
                    lu7Var2.setText(ob6.a0(null, null, 2131745851, objArr2));
                } else {
                    if (ojVar7.a == pjVar2) {
                        i2 = 2131745854;
                    } else {
                        i2 = 2131745853;
                    }
                    lu7Var2.setText(ob6.M0(i2, null));
                }
            }
        }
        if (z4 || z5 || z6) {
            c51 c51Var = this.p1;
            if (this.z1 == 0 && this.y1.b > 0) {
                z7 = 1;
            } else {
                z7 = i;
            }
            if (c51Var.e0 != z7) {
                c51Var.setEnabled(z7);
                c51Var.setClickable(z7);
                if (z3) {
                    ViewPropertyAnimator animate3 = c51Var.animate();
                    if (z7 != 0) {
                        f2 = 1.0f;
                    } else {
                        f2 = 0.6f;
                    }
                    ik8.s(animate3, f2, 180L);
                } else {
                    if (z7 != 0) {
                        f = 1.0f;
                    } else {
                        f = 0.6f;
                    }
                    c51Var.setAlpha(f);
                }
            }
        }
        if (z4 || z5) {
            hr hrVar = uc7.s1(this.a).k4;
            oj ojVar8 = this.y1;
            pj pjVar4 = ojVar8.a;
            if (pjVar4 == pjVar2) {
                this.n1.setText(hl.S2(ob6.G((int) oj.j((ojVar8.b * hrVar.m.f()) / 1000, ojVar8.a).a(), "ResellGiftInfo", new Object[i])));
            } else if (pjVar4 == pjVar) {
                this.n1.setText(hl.S2(ob6.a0(null, null, 2131745859, oj.j((ojVar8.b * hrVar.n.f()) / 1000, ojVar8.a).b())));
            }
            StringBuilder sb = new StringBuilder(10);
            sb.append('~');
            pj pjVar5 = this.y1.a;
            int i6 = this.a;
            if (pjVar5 == pjVar) {
                d = uc7.s1(i6).k4.k.i;
            } else {
                d = uc7.s1(i6).k4.A3.i * 1.0E-5d;
            }
            di0.h();
            sb.append(di0.f("USD", 2, (long) (this.y1.c() * d * 100.0d), false));
            this.q1.c(sb, z3, true);
        }
        if (z && z5) {
            String b = this.y1.b();
            this.m1.setText(b);
            this.m1.setSelection(b.length());
        }
    }

    @Override
    public final void show() {
        super.show();
        hl.d3(new ux9(this, (byte) 12), 50L);
    }
}
