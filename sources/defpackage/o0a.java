package defpackage;

import android.content.Context;
import android.text.InputFilter;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class o0a extends fx0 {
    public final er7 l1;
    public final EditTextBoldCursor m1;
    public final TextView n1;
    public final hn o1;
    public final u41 p1;
    public final hn q1;
    public final bhb r1;
    public final ImageView s1;
    public final ImageView t1;
    public final nj u1;
    public final nj v1;
    public final nj w1;
    public final nj x1;
    public nj y1;
    public int z1;

    public o0a(Context context, wjb wjbVar, int i, nj njVar, nu9 nu9Var) {
        super(1, wjbVar, context, true);
        boolean z;
        float f;
        this.a = i;
        this.Q0 = true;
        this.E = true;
        gr grVar = na7.q1(i).k4;
        long max = Math.max(grVar.q.f(), 10000000L);
        oj ojVar = oj.b;
        this.w1 = nj.j(max, ojVar);
        this.x1 = nj.j(grVar.r.f(), ojVar);
        oj ojVar2 = oj.a;
        this.u1 = nj.h(grVar.o.f(), ojVar2);
        this.v1 = nj.h(grVar.p.f(), ojVar2);
        M(bkb.g5);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        LinearLayout j = de9.j(context, 0);
        linearLayout.addView(j, nme.t(-1, 56, 55, 0, 0, 0, 0));
        hn hnVar = new hn(context, false, false, false);
        this.o1 = hnVar;
        int i2 = bkb.F6;
        zkb.U(hnVar, i2, null);
        hnVar.setTextSize(gl.L(20.0f));
        hnVar.setGravity(8388627);
        hnVar.setTypeface(gl.o());
        j.addView(hnVar, nme.q(-1, -1, 1.0f, 119, 22, 0, 22, 0));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout.addView(linearLayout2, nme.l(1.0f, -1, -2));
        er7 er7Var = new er7(context, null);
        this.l1 = er7Var;
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.m1 = editTextBoldCursor;
        editTextBoldCursor.setCursorSize(gl.L(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setImeOptions(268435462);
        editTextBoldCursor.setTextSize(1, 17.0f);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setPadding(gl.L(42.0f), gl.L(16.0f), gl.L(16.0f), gl.L(16.0f));
        zkb.X(editTextBoldCursor, i2, null);
        editTextBoldCursor.requestFocus();
        er7Var.setLeftPadding(gl.L(28.0f));
        er7Var.e(editTextBoldCursor);
        if (njVar != null && !njVar.l()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        er7Var.b(1.0f, f, false);
        er7Var.setForceUseCenter2(true);
        editTextBoldCursor.setOnFocusChangeListener(new ls0(this, (byte) 17));
        er7Var.addView(editTextBoldCursor, nme.e(-1, -2, 48));
        linearLayout2.addView(er7Var, nme.k(18.0f, 0.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView = new ImageView(context);
        this.s1 = imageView;
        imageView.setImageResource(2131232757);
        er7Var.addView(imageView, nme.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.t1 = imageView2;
        imageView2.setImageResource(2131231961);
        er7Var.addView(imageView2, nme.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        hn hnVar2 = new hn(context, false, false, false);
        this.q1 = hnVar2;
        int i3 = bkb.x6;
        zkb.U(hnVar2, i3, null);
        hnVar2.setTextSize(gl.L(13.0f));
        hnVar2.setGravity(5);
        er7Var.addView(hnVar2, nme.d(-2, -1.0f, 21, 0.0f, 0.0f, 16.0f, 0.0f));
        TextView textView = new TextView(context);
        this.n1 = textView;
        zkb.X(textView, i3, null);
        textView.setTextSize(1, 13.0f);
        linearLayout2.addView(textView, nme.t(-1, -2, 55, 33, 4, 33, 0));
        bhb bhbVar = new bhb(context);
        this.r1 = bhbVar;
        bhbVar.c.setLayoutParams(nme.d(20, 20.0f, (k96.a0 ? 5 : 3) | 48, 22.0f, 22.0f, 22.0f, 0.0f));
        bhbVar.b(k96.M0(2131745935, null), k96.M0(2131745936, null), true, false);
        bhbVar.setOnClickListener(new ik8(this, (byte) 22));
        linearLayout2.addView(bhbVar, nme.t(-1, -2, 55, 0, 16, 0, 16));
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(1);
        linearLayout.addView(linearLayout3, nme.r(-1, -2, 80));
        u41 i4 = yjb.i(24, wjbVar, context, true);
        this.p1 = i4;
        i4.setOnClickListener(new b99(this, nu9Var, (byte) 7));
        i4.i(k96.M0(2131745958, null), false, true);
        linearLayout3.addView(i4, nme.k(18.0f, 0.0f, 18.0f, 8.0f, -1, 48));
        if (njVar != null) {
            E0(nj.j(njVar.b, njVar.a), !njVar.l(), true, false);
        } else {
            E0(nj.j(0L, ojVar2), false, true, false);
        }
        this.O = linearLayout;
        editTextBoldCursor.addTextChangedListener(new jf6(this, (byte) 12));
    }

    public final nj D0() {
        if (this.y1.a == oj.b) {
            return this.x1;
        }
        return this.v1;
    }

    public final void E0(nj njVar, boolean z, boolean z2, boolean z3) {
        boolean z4;
        boolean z5;
        boolean z6;
        int i;
        int i2;
        nj njVar2;
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
        nj njVar3;
        oj ojVar = oj.b;
        oj ojVar2 = oj.a;
        nj njVar4 = this.y1;
        int i3 = this.z1;
        this.z1 = 0;
        if (njVar != null) {
            this.y1 = njVar;
        } else {
            this.y1 = nj.j(0L, njVar4.a);
            this.z1 |= 1;
        }
        long j = D0().b;
        nj njVar5 = this.y1;
        if (j < njVar5.b) {
            this.z1 |= 4;
        }
        if (!njVar5.l()) {
            nj njVar6 = this.y1;
            if (njVar6.a == ojVar) {
                njVar3 = this.w1;
            } else {
                njVar3 = this.u1;
            }
            if (njVar3.b > njVar6.b) {
                this.z1 |= 2;
            }
        }
        if (!z2 && njVar4.a == this.y1.a) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (!z2 && njVar4.b == this.y1.b) {
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
            er7 er7Var = this.l1;
            if ((this.z1 & (-9)) == 0) {
                f11 = 0.0f;
            } else {
                f11 = 1.0f;
            }
            er7Var.a(f11);
        }
        if (z4) {
            ImageView imageView = this.t1;
            hn hnVar = this.o1;
            EditTextBoldCursor editTextBoldCursor = this.m1;
            i = 0;
            oj ojVar3 = this.y1.a;
            if (ojVar3 == ojVar2) {
                hnVar.c(k96.M0(2131745930, null), z3, true);
                editTextBoldCursor.setInputType(2);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(D0().a()).length())});
            } else if (ojVar3 == ojVar) {
                hnVar.c(k96.M0(2131745929, null), z3, true);
                editTextBoldCursor.setInputType(8194);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(D0().a()).length() + 3)});
            }
            wf2 wf2Var = this.r1.c;
            if (this.y1.a == ojVar) {
                z8 = true;
            } else {
                z8 = false;
            }
            wf2Var.a(z8, z3);
            ImageView imageView2 = this.s1;
            if (z3) {
                ViewPropertyAnimator animate = imageView2.animate();
                if (this.y1.a == ojVar2) {
                    f5 = 1.0f;
                } else {
                    f5 = 0.0f;
                }
                ViewPropertyAnimator alpha = animate.alpha(f5);
                if (this.y1.a == ojVar2) {
                    f6 = 1.0f;
                } else {
                    f6 = 0.0f;
                }
                ViewPropertyAnimator scaleX = alpha.scaleX(f6);
                if (this.y1.a == ojVar2) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                scaleX.scaleY(f7).setDuration(180L).start();
                ViewPropertyAnimator animate2 = imageView.animate();
                if (this.y1.a == ojVar) {
                    f8 = 1.0f;
                } else {
                    f8 = 0.0f;
                }
                ViewPropertyAnimator alpha2 = animate2.alpha(f8);
                if (this.y1.a == ojVar) {
                    f9 = 1.0f;
                } else {
                    f9 = 0.0f;
                }
                ViewPropertyAnimator scaleX2 = alpha2.scaleX(f9);
                if (this.y1.a == ojVar) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                scaleX2.scaleY(f10).setDuration(180L).start();
            } else {
                if (this.y1.a == ojVar2) {
                    f3 = 1.0f;
                } else {
                    f3 = 0.0f;
                }
                imageView2.setAlpha(f3);
                if (this.y1.a == ojVar) {
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
            er7 er7Var2 = this.l1;
            int i4 = this.z1;
            if ((i4 & 4) != 0) {
                Object[] objArr = new Object[1];
                objArr[i] = D0().g();
                er7Var2.setText(k96.a0(null, null, 2131745932, objArr));
            } else {
                int i5 = i4 & 2;
                nj njVar7 = this.y1;
                if (i5 != 0) {
                    if (njVar7.a == ojVar) {
                        njVar2 = this.w1;
                    } else {
                        njVar2 = this.u1;
                    }
                    Object[] objArr2 = new Object[1];
                    objArr2[i] = njVar2.g();
                    er7Var2.setText(k96.a0(null, null, 2131745931, objArr2));
                } else {
                    if (njVar7.a == ojVar2) {
                        i2 = 2131745934;
                    } else {
                        i2 = 2131745933;
                    }
                    er7Var2.setText(k96.M0(i2, null));
                }
            }
        }
        if (z4 || z5 || z6) {
            u41 u41Var = this.p1;
            if (this.z1 == 0 && this.y1.b > 0) {
                z7 = 1;
            } else {
                z7 = i;
            }
            if (u41Var.e0 != z7) {
                u41Var.setEnabled(z7);
                u41Var.setClickable(z7);
                if (z3) {
                    ViewPropertyAnimator animate3 = u41Var.animate();
                    if (z7 != 0) {
                        f2 = 1.0f;
                    } else {
                        f2 = 0.6f;
                    }
                    ug8.s(animate3, f2, 180L);
                } else {
                    if (z7 != 0) {
                        f = 1.0f;
                    } else {
                        f = 0.6f;
                    }
                    u41Var.setAlpha(f);
                }
            }
        }
        if (z4 || z5) {
            gr grVar = na7.q1(this.a).k4;
            nj njVar8 = this.y1;
            oj ojVar4 = njVar8.a;
            if (ojVar4 == ojVar2) {
                this.n1.setText(gl.T2(k96.G((int) nj.j((njVar8.b * grVar.m.f()) / 1000, njVar8.a).a(), "ResellGiftInfo", new Object[i])));
            } else if (ojVar4 == ojVar) {
                this.n1.setText(gl.T2(k96.a0(null, null, 2131745939, nj.j((njVar8.b * grVar.n.f()) / 1000, njVar8.a).b())));
            }
            StringBuilder sb = new StringBuilder(10);
            sb.append('~');
            oj ojVar5 = this.y1.a;
            int i6 = this.a;
            if (ojVar5 == ojVar) {
                d = na7.q1(i6).k4.k.i;
            } else {
                d = na7.q1(i6).k4.s3.i * 1.0E-5d;
            }
            ci0.h();
            sb.append(ci0.f("USD", 2, (long) (this.y1.c() * d * 100.0d), false));
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
        gl.e3(new zk9(this, (byte) 25), 50L);
    }
}
