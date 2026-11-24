package defpackage;

import android.content.Context;
import android.text.InputFilter;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class q2a extends my0 {
    public final gt7 l1;
    public final EditTextBoldCursor m1;
    public final TextView n1;
    public final io o1;
    public final b61 p1;
    public final io q1;
    public final cjb r1;
    public final ImageView s1;
    public final ImageView t1;
    public final nk u1;
    public final nk v1;
    public final nk w1;
    public final nk x1;
    public nk y1;
    public int z1;

    public q2a(Context context, ylb ylbVar, int i, nk nkVar, ts9 ts9Var) {
        super(1, ylbVar, context, true);
        boolean z;
        float f;
        this.a = i;
        this.Q0 = true;
        this.E = true;
        gs gsVar = oc7.r1(i).l4;
        long max = Math.max(gsVar.q.f(), 10000000L);
        ok okVar = ok.b;
        this.w1 = nk.j(max, okVar);
        this.x1 = nk.j(gsVar.r.f(), okVar);
        ok okVar2 = ok.a;
        this.u1 = nk.h(gsVar.o.f(), okVar2);
        this.v1 = nk.h(gsVar.p.f(), okVar2);
        L(cmb.g5);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        LinearLayout i2 = hg9.i(context, 0);
        linearLayout.addView(i2, qoe.t(-1, 56, 55, 0, 0, 0, 0));
        io ioVar = new io(context, false, false, false);
        this.o1 = ioVar;
        int i3 = cmb.F6;
        anb.U(ioVar, i3, null);
        ioVar.setTextSize(gm.L(20.0f));
        ioVar.setGravity(8388627);
        ioVar.setTypeface(gm.o());
        i2.addView(ioVar, qoe.q(-1, -1, 1.0f, 119, 22, 0, 22, 0));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout.addView(linearLayout2, qoe.l(1.0f, -1, -2));
        gt7 gt7Var = new gt7(context, null);
        this.l1 = gt7Var;
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.m1 = editTextBoldCursor;
        editTextBoldCursor.setCursorSize(gm.L(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setImeOptions(268435462);
        editTextBoldCursor.setTextSize(1, 17.0f);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setPadding(gm.L(42.0f), gm.L(16.0f), gm.L(16.0f), gm.L(16.0f));
        anb.X(editTextBoldCursor, i3, null);
        editTextBoldCursor.requestFocus();
        gt7Var.setLeftPadding(gm.L(28.0f));
        gt7Var.e(editTextBoldCursor);
        if (nkVar != null && !nkVar.l()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        gt7Var.b(1.0f, f, false);
        gt7Var.setForceUseCenter2(true);
        editTextBoldCursor.setOnFocusChangeListener(new tt0(this, (byte) 17));
        gt7Var.addView(editTextBoldCursor, qoe.e(-1, -2, 48));
        linearLayout2.addView(gt7Var, qoe.k(18.0f, 0.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView = new ImageView(context);
        this.s1 = imageView;
        imageView.setImageResource(2131232769);
        gt7Var.addView(imageView, qoe.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.t1 = imageView2;
        imageView2.setImageResource(2131231962);
        gt7Var.addView(imageView2, qoe.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        io ioVar2 = new io(context, false, false, false);
        this.q1 = ioVar2;
        int i4 = cmb.x6;
        anb.U(ioVar2, i4, null);
        ioVar2.setTextSize(gm.L(13.0f));
        ioVar2.setGravity(5);
        gt7Var.addView(ioVar2, qoe.d(-2, -1.0f, 21, 0.0f, 0.0f, 16.0f, 0.0f));
        TextView textView = new TextView(context);
        this.n1 = textView;
        anb.X(textView, i4, null);
        textView.setTextSize(1, 13.0f);
        linearLayout2.addView(textView, qoe.t(-1, -2, 55, 33, 4, 33, 0));
        cjb cjbVar = new cjb(context);
        this.r1 = cjbVar;
        cjbVar.c.setLayoutParams(qoe.d(20, 20.0f, (jb6.a0 ? 5 : 3) | 48, 22.0f, 22.0f, 22.0f, 0.0f));
        cjbVar.b(jb6.M0(2131745861, null), jb6.M0(2131745862, null), true, false);
        cjbVar.setOnClickListener(new wk8(this, (byte) 25));
        linearLayout2.addView(cjbVar, qoe.t(-1, -2, 55, 0, 16, 0, 16));
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(1);
        linearLayout.addView(linearLayout3, qoe.r(-1, -2, 80));
        b61 i5 = mlb.i(24, ylbVar, context, true);
        this.p1 = i5;
        i5.setOnClickListener(new r39(this, ts9Var, (byte) 8));
        i5.i(jb6.M0(2131745884, null), false, true);
        linearLayout3.addView(i5, qoe.k(18.0f, 0.0f, 18.0f, 8.0f, -1, 48));
        if (nkVar != null) {
            E0(nk.j(nkVar.b, nkVar.a), !nkVar.l(), true, false);
        } else {
            E0(nk.j(0L, okVar2), false, true, false);
        }
        this.O = linearLayout;
        editTextBoldCursor.addTextChangedListener(new og6(this, (byte) 13));
    }

    public final nk D0() {
        if (this.y1.a == ok.b) {
            return this.x1;
        }
        return this.v1;
    }

    public final void E0(nk nkVar, boolean z, boolean z2, boolean z3) {
        boolean z4;
        boolean z5;
        boolean z6;
        int i;
        int i2;
        nk nkVar2;
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
        nk nkVar3;
        ok okVar = ok.b;
        ok okVar2 = ok.a;
        nk nkVar4 = this.y1;
        int i3 = this.z1;
        this.z1 = 0;
        if (nkVar != null) {
            this.y1 = nkVar;
        } else {
            this.y1 = nk.j(0L, nkVar4.a);
            this.z1 |= 1;
        }
        long j = D0().b;
        nk nkVar5 = this.y1;
        if (j < nkVar5.b) {
            this.z1 |= 4;
        }
        if (!nkVar5.l()) {
            nk nkVar6 = this.y1;
            if (nkVar6.a == okVar) {
                nkVar3 = this.w1;
            } else {
                nkVar3 = this.u1;
            }
            if (nkVar3.b > nkVar6.b) {
                this.z1 |= 2;
            }
        }
        if (!z2 && nkVar4.a == this.y1.a) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (!z2 && nkVar4.b == this.y1.b) {
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
            gt7 gt7Var = this.l1;
            if ((this.z1 & (-9)) == 0) {
                f11 = 0.0f;
            } else {
                f11 = 1.0f;
            }
            gt7Var.a(f11);
        }
        if (z4) {
            ImageView imageView = this.t1;
            io ioVar = this.o1;
            EditTextBoldCursor editTextBoldCursor = this.m1;
            i = 0;
            ok okVar3 = this.y1.a;
            if (okVar3 == okVar2) {
                ioVar.c(jb6.M0(2131745856, null), z3, true);
                editTextBoldCursor.setInputType(2);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(D0().a()).length())});
            } else if (okVar3 == okVar) {
                ioVar.c(jb6.M0(2131745855, null), z3, true);
                editTextBoldCursor.setInputType(8194);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(D0().a()).length() + 3)});
            }
            jh2 jh2Var = this.r1.c;
            if (this.y1.a == okVar) {
                z8 = true;
            } else {
                z8 = false;
            }
            jh2Var.a(z8, z3);
            ImageView imageView2 = this.s1;
            if (z3) {
                ViewPropertyAnimator animate = imageView2.animate();
                if (this.y1.a == okVar2) {
                    f5 = 1.0f;
                } else {
                    f5 = 0.0f;
                }
                ViewPropertyAnimator alpha = animate.alpha(f5);
                if (this.y1.a == okVar2) {
                    f6 = 1.0f;
                } else {
                    f6 = 0.0f;
                }
                ViewPropertyAnimator scaleX = alpha.scaleX(f6);
                if (this.y1.a == okVar2) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                scaleX.scaleY(f7).setDuration(180L).start();
                ViewPropertyAnimator animate2 = imageView.animate();
                if (this.y1.a == okVar) {
                    f8 = 1.0f;
                } else {
                    f8 = 0.0f;
                }
                ViewPropertyAnimator alpha2 = animate2.alpha(f8);
                if (this.y1.a == okVar) {
                    f9 = 1.0f;
                } else {
                    f9 = 0.0f;
                }
                ViewPropertyAnimator scaleX2 = alpha2.scaleX(f9);
                if (this.y1.a == okVar) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                scaleX2.scaleY(f10).setDuration(180L).start();
            } else {
                if (this.y1.a == okVar2) {
                    f3 = 1.0f;
                } else {
                    f3 = 0.0f;
                }
                imageView2.setAlpha(f3);
                if (this.y1.a == okVar) {
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
            gt7 gt7Var2 = this.l1;
            int i4 = this.z1;
            if ((i4 & 4) != 0) {
                Object[] objArr = new Object[1];
                objArr[i] = D0().g();
                gt7Var2.setText(jb6.a0(null, null, 2131745858, objArr));
            } else {
                int i5 = i4 & 2;
                nk nkVar7 = this.y1;
                if (i5 != 0) {
                    if (nkVar7.a == okVar) {
                        nkVar2 = this.w1;
                    } else {
                        nkVar2 = this.u1;
                    }
                    Object[] objArr2 = new Object[1];
                    objArr2[i] = nkVar2.g();
                    gt7Var2.setText(jb6.a0(null, null, 2131745857, objArr2));
                } else {
                    if (nkVar7.a == okVar2) {
                        i2 = 2131745860;
                    } else {
                        i2 = 2131745859;
                    }
                    gt7Var2.setText(jb6.M0(i2, null));
                }
            }
        }
        if (z4 || z5 || z6) {
            b61 b61Var = this.p1;
            if (this.z1 == 0 && this.y1.b > 0) {
                z7 = 1;
            } else {
                z7 = i;
            }
            if (b61Var.e0 != z7) {
                b61Var.setEnabled(z7);
                b61Var.setClickable(z7);
                if (z3) {
                    ViewPropertyAnimator animate3 = b61Var.animate();
                    if (z7 != 0) {
                        f2 = 1.0f;
                    } else {
                        f2 = 0.6f;
                    }
                    wi8.s(animate3, f2, 180L);
                } else {
                    if (z7 != 0) {
                        f = 1.0f;
                    } else {
                        f = 0.6f;
                    }
                    b61Var.setAlpha(f);
                }
            }
        }
        if (z4 || z5) {
            gs gsVar = oc7.r1(this.a).l4;
            nk nkVar8 = this.y1;
            ok okVar4 = nkVar8.a;
            if (okVar4 == okVar2) {
                this.n1.setText(gm.S2(jb6.G((int) nk.j((nkVar8.b * gsVar.m.f()) / 1000, nkVar8.a).a(), "ResellGiftInfo", new Object[i])));
            } else if (okVar4 == okVar) {
                this.n1.setText(gm.S2(jb6.a0(null, null, 2131745865, nk.j((nkVar8.b * gsVar.n.f()) / 1000, nkVar8.a).b())));
            }
            StringBuilder sb = new StringBuilder(10);
            sb.append('~');
            ok okVar5 = this.y1.a;
            int i6 = this.a;
            if (okVar5 == okVar) {
                d = oc7.r1(i6).l4.k.i;
            } else {
                d = oc7.r1(i6).l4.s3.i * 1.0E-5d;
            }
            cj0.h();
            sb.append(cj0.f("USD", 2, (long) (this.y1.c() * d * 100.0d), false));
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
        gm.d3(new c0a(this, (byte) 3), 50L);
    }
}
