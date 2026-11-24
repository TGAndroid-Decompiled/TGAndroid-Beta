package defpackage;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class mw4 extends my0 {
    public static final int[] G1 = {21600, 43200, 86400, 129600, 172800, 259200};
    public nk A1;
    public int B1;
    public int C1;
    public final npa D1;
    public final pn2[] E1;
    public final pn2[] F1;
    public final gf0 l1;
    public final TL_stars.TL_starGiftUnique m1;
    public final String n1;
    public final long o1;
    public final wh5 p1;
    public final TextView q1;
    public final EditTextBoldCursor r1;
    public final TextView s1;
    public final TextView t1;
    public final TextView u1;
    public final b61 v1;
    public final io w1;
    public final ImageView x1;
    public final ImageView y1;
    public final nl9 z1;

    public mw4(final int r29, final long r30, defpackage.npa r32, final defpackage.ylb r33, final android.content.Context r34, org.telegram.tgnet.tl.TL_stars.TL_starGiftUnique r35) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mw4.<init>(int, long, npa, ylb, android.content.Context, org.telegram.tgnet.tl.TL_stars$TL_starGiftUnique):void");
    }

    public final void D0(boolean z) {
        boolean z2;
        if (this.C1 == 0 && this.A1.b > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        b61 b61Var = this.v1;
        if (b61Var.e0 != z2) {
            b61Var.setEnabled(z2);
            b61Var.setClickable(z2);
            float f = 0.6f;
            if (z) {
                ViewPropertyAnimator animate = b61Var.animate();
                if (z2) {
                    f = 1.0f;
                }
                wi8.s(animate, f, 180L);
                return;
            }
            if (z2) {
                f = 1.0f;
            }
            b61Var.setAlpha(f);
        }
    }

    public final void E0(nk nkVar, boolean z, boolean z2, boolean z3) {
        boolean z4;
        boolean z5;
        boolean z6;
        ?? r16;
        int i;
        int i2;
        int i3;
        boolean z7;
        int i4;
        int i5;
        int i6;
        boolean z8;
        String E;
        pn2[] pn2VarArr;
        double d;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        int i7;
        nk nkVar2 = nkVar;
        ok okVar = ok.a;
        ok okVar2 = ok.b;
        nk nkVar3 = this.A1;
        int i8 = this.C1;
        this.C1 = 0;
        if (nkVar2 != null) {
            this.A1 = nkVar2;
        } else {
            nkVar2 = nk.j(0L, nkVar3.a);
            this.A1 = nkVar2;
            this.C1 |= 1;
        }
        long j = ((nk) ((lx6[]) this.z1.b)[nkVar2.a.ordinal()].c).b;
        nk nkVar4 = this.A1;
        if (j < nkVar4.b) {
            this.C1 |= 4;
        }
        if (!nkVar4.l() && ((nk) ((lx6[]) this.z1.b)[this.A1.a.ordinal()].b).b > this.A1.b) {
            this.C1 |= 2;
        }
        if (!z2 && nkVar3.a == this.A1.a) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (!z2 && nkVar3.b == this.A1.b) {
            z5 = false;
        } else {
            z5 = true;
        }
        if (!z2 && i8 == this.C1) {
            z6 = false;
        } else {
            z6 = true;
        }
        if (z4) {
            ImageView imageView = this.y1;
            nl9 nl9Var = this.z1;
            TextView textView = this.u1;
            EditTextBoldCursor editTextBoldCursor = this.r1;
            wh5 wh5Var = this.p1;
            boolean z9 = false;
            if (wh5Var != null) {
                if (this.A1.a == okVar) {
                    i7 = 0;
                } else {
                    i7 = 1;
                }
                wh5Var.a(i7, z3);
            }
            String s = pg3.s(this.o1);
            ok okVar3 = this.A1.a;
            if (okVar3 == okVar) {
                hg9.q(null, null, 2131749661, new Object[]{s}, textView);
                editTextBoldCursor.setInputType(2);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(((nk) ((lx6[]) nl9Var.b)[this.A1.a.ordinal()].c).a()).length())});
            } else if (okVar3 == okVar2) {
                hg9.q(null, null, 2131749660, new Object[]{s}, textView);
                editTextBoldCursor.setInputType(8194);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(((nk) ((lx6[]) nl9Var.b)[this.A1.a.ordinal()].c).a()).length() + 3)});
            }
            ImageView imageView2 = this.x1;
            float f7 = 0.0f;
            if (z3) {
                ViewPropertyAnimator animate = imageView2.animate();
                if (this.A1.a == okVar) {
                    f2 = 1.0f;
                } else {
                    f2 = 0.0f;
                }
                ViewPropertyAnimator alpha = animate.alpha(f2);
                if (this.A1.a == okVar) {
                    f3 = 1.0f;
                } else {
                    f3 = 0.0f;
                }
                ViewPropertyAnimator scaleX = alpha.scaleX(f3);
                if (this.A1.a == okVar) {
                    f4 = 1.0f;
                } else {
                    f4 = 0.0f;
                }
                scaleX.scaleY(f4).setDuration(180L).start();
                ViewPropertyAnimator animate2 = imageView.animate();
                if (this.A1.a == okVar2) {
                    f5 = 1.0f;
                } else {
                    f5 = 0.0f;
                }
                ViewPropertyAnimator alpha2 = animate2.alpha(f5);
                if (this.A1.a == okVar2) {
                    f6 = 1.0f;
                } else {
                    f6 = 0.0f;
                }
                ViewPropertyAnimator scaleX2 = alpha2.scaleX(f6);
                if (this.A1.a == okVar2) {
                    f7 = 1.0f;
                }
                scaleX2.scaleY(f7).setDuration(180L).start();
            } else {
                if (this.A1.a == okVar) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                imageView2.setAlpha(f);
                if (this.A1.a == okVar2) {
                    f7 = 1.0f;
                }
                imageView.setAlpha(f7);
            }
            gf0 gf0Var = this.l1;
            r16 = z9;
            if (gf0Var != null) {
                ok okVar4 = this.A1.a;
                r16 = z9;
                if (gf0Var.e != okVar4) {
                    gf0Var.e = okVar4;
                    gf0Var.b();
                    r16 = z9;
                }
            }
        } else {
            r16 = 0;
        }
        if (z4 || z6) {
            if (this.A1.a == okVar) {
                i = 2131749631;
            } else {
                i = 2131749623;
            }
            this.q1.setText(jb6.M0(i, null));
            nl9 nl9Var2 = this.z1;
            String str = this.n1;
            TextView textView2 = this.s1;
            ok okVar5 = this.A1.a;
            int i9 = this.C1;
            if ((i9 & 4) != 0) {
                if (okVar5 == okVar) {
                    i6 = 2131749629;
                } else {
                    i6 = 2131749621;
                }
                Object[] objArr = new Object[2];
                objArr[r16] = ((nk) ((lx6[]) nl9Var2.b)[okVar5.ordinal()].c).o(2).d();
                objArr[1] = str;
                hg9.q(null, null, i6, objArr, textView2);
            } else if ((i9 & 2) != 0) {
                if (okVar5 == okVar) {
                    i3 = 2131749628;
                } else {
                    i3 = 2131749620;
                }
                Object[] objArr2 = new Object[2];
                objArr2[r16] = ((nk) ((lx6[]) nl9Var2.b)[okVar5.ordinal()].b).p().d();
                objArr2[1] = str;
                hg9.q(null, null, i3, objArr2, textView2);
            } else {
                if (okVar5 == okVar) {
                    i2 = 2131749630;
                } else {
                    i2 = 2131749622;
                }
                Object[] objArr3 = new Object[1];
                objArr3[r16] = str;
                hg9.q(null, null, i2, objArr3, textView2);
            }
            if ((this.C1 & (-9)) != 0) {
                z7 = true;
            } else {
                z7 = r16;
            }
            if (z7) {
                i4 = cmb.p7;
            } else {
                i4 = cmb.x6;
            }
            anb.X(textView2, i4, this.J0);
            EditTextBoldCursor editTextBoldCursor2 = this.r1;
            if (z7) {
                i5 = cmb.p7;
            } else {
                i5 = cmb.F6;
            }
            anb.X(editTextBoldCursor2, i5, this.J0);
        }
        if (z4 || z5 || z6) {
            nk nkVar5 = this.A1;
            if (nkVar5.a == okVar2) {
                z8 = true;
            } else {
                z8 = r16;
            }
            b61 b61Var = this.v1;
            if (z8) {
                E = nkVar5.b();
            } else {
                E = jb6.E(nkVar5.a(), ',');
            }
            Object[] objArr4 = new Object[1];
            objArr4[r16] = E;
            String a0 = jb6.a0(null, null, 2131749665, objArr4);
            if (z8) {
                pn2VarArr = this.F1;
            } else {
                pn2VarArr = this.E1;
            }
            b61Var.i(nxa.t1(nxa.Z0(z8, a0, pn2VarArr), z8), z3, true);
            D0(z3);
        }
        if (z4 || z5) {
            StringBuilder sb = new StringBuilder(10);
            sb.append('~');
            ok okVar6 = this.A1.a;
            int i10 = this.a;
            if (okVar6 == okVar2) {
                d = oc7.r1(i10).l4.k.i;
            } else {
                d = oc7.r1(i10).l4.s3.i * 1.0E-5d;
            }
            cj0.h();
            sb.append(cj0.f("USD", 2, (long) (this.A1.c() * d * 100.0d), r16));
            this.w1.c(sb, z3, true);
        }
        if (z && z5) {
            String b = this.A1.b();
            this.r1.setText(b);
            this.r1.setSelection(b.length());
        }
    }

    public final void F0(int i, boolean z) {
        if (this.B1 != i) {
            this.B1 = i;
            String G = jb6.G(i / 3600, "GiftOfferHours", new Object[0]);
            TextView textView = this.t1;
            textView.setText(G);
            Drawable mutate = getContext().getResources().getDrawable(2131230874).mutate();
            mutate.setColorFilter(new PorterDuffColorFilter(cmb.v0(cmb.n6, this.J0), PorterDuff.Mode.SRC_IN));
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, mutate, (Drawable) null);
        }
        D0(z);
    }

    @Override
    public final void show() {
        super.show();
        gm.d3(new qn4(this, (byte) 7), 50L);
    }
}
