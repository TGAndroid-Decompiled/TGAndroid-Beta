package bh;

import android.content.Context;
import android.support.v4.media.session.a0;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import b2.r1;
import org.telegram.messenger.dd;
import org.telegram.messenger.i0;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.lq;
import w7.b6;
import w7.e6;
public final class k extends FrameLayout implements fe.e {
    public static final int[] f2809s = {2131232185, 2131232507, 2131231759, 2131232669, 2131231847, 2131232507, 2131232507};
    public final String[] f2810a;
    public final p6 f2811b;
    public final wg.a f2812c;
    public final tg.b d;
    public final a0[] e;
    public final r1[] f2813f;
    public a h;
    public b f2814n;
    public int f2815r;

    public k(Context context, p6 p6Var, wg.b bVar, tg.b bVar2) {
        super(context);
        this.f2810a = new String[]{dd.L0(2131753953, null), dd.L0(2131754815, null), dd.L0(2131754842, null), dd.L0(2131754790, null), dd.L0(2131754804, null), dd.L0(2131754778, null), dd.L0(2131754779, null)};
        this.e = new a0[7];
        this.f2813f = new r1[7];
        this.f2815r = 83;
        this.d = bVar2;
        this.f2812c = bVar;
        this.f2811b = p6Var;
    }

    public final void a() {
        int i10;
        float f7 = 0.0f;
        int i11 = 0;
        while (true) {
            a0[] a0VarArr = this.e;
            if (i11 < a0VarArr.length) {
                a0 a0Var = a0VarArr[i11];
                if (a0Var != null) {
                    ah.b bVar = (ah.b) a0Var.f875b;
                    float f10 = ((fe.b) a0Var.f876c).e;
                    float f11 = ((fe.b) a0Var.d).e;
                    if (f10 > 0.0f) {
                        i10 = 0;
                    } else {
                        i10 = 8;
                    }
                    bVar.setVisibility(i10);
                    bVar.setAlpha(f10);
                    bVar.setScaleX(i0.T1(0.7f, 1.0f, f10));
                    bVar.setScaleY(i0.T1(0.7f, 1.0f, f10));
                    if (i11 != 0) {
                        bVar.setTranslationY(((1.0f - f10) * i0.L(80.0f)) - f7);
                    }
                    f7 += (i0.L((f11 * 10.0f) + 10.0f) + i0.L(44.0f)) * f10;
                }
                i11++;
            } else {
                return;
            }
        }
    }

    public final r1 b(int i10) {
        r1[] r1VarArr = this.f2813f;
        if (r1VarArr[i10] == 0) {
            ?? obj = new Object();
            obj.f2221a = 0;
            obj.f2222b = false;
            obj.f2223c = true;
            r1VarArr[i10] = obj;
        }
        return r1VarArr[i10];
    }

    public final void c(int i10, int i11, boolean z10) {
        boolean z11;
        b(i10).f2221a = i11;
        a0 a0Var = this.e[i10];
        if (a0Var != null) {
            ((ah.b) a0Var.f875b).a(i11, z10);
            fe.b bVar = (fe.b) a0Var.d;
            if (i11 > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            bVar.a(z11, z10);
        }
    }

    public final void d(boolean z10) {
        b(1).f2222b = z10;
        a0 a0Var = this.e[1];
        if (a0Var != null) {
            ((ah.b) a0Var.f875b).c(z10, true);
        }
    }

    public final void e(int i10, boolean z10, boolean z11) {
        Interpolator interpolator;
        long j10;
        Interpolator interpolator2;
        long j11;
        int i11;
        int i12;
        a0[] a0VarArr = this.e;
        a0 a0Var = a0VarArr[i10];
        if (a0Var == null && !z10) {
            return;
        }
        if (a0Var == null) {
            int i13 = i10 << 16;
            int i14 = i13 | 1;
            if (i10 == 0) {
                interpolator = gr.h;
            } else {
                interpolator = ee.a.f6489a;
            }
            if (i10 == 0) {
                j10 = 300;
            } else {
                j10 = 280;
            }
            fe.b bVar = new fe.b(i14, this, interpolator, j10, false);
            int i15 = i13 | 2;
            if (i10 == 0) {
                interpolator2 = gr.h;
            } else {
                interpolator2 = ee.a.f6489a;
            }
            Interpolator interpolator3 = interpolator2;
            if (i10 == 0) {
                j11 = 300;
            } else {
                j11 = 280;
            }
            fe.b bVar2 = new fe.b(i15, this, interpolator3, j11, false);
            if (i10 == 0) {
                i11 = 50;
                i12 = 32;
            } else {
                i11 = 56;
                i12 = 48;
            }
            int i16 = i12;
            Context context = getContext();
            int i17 = f2809s[i10];
            p6 p6Var = this.f2811b;
            ah.b bVar3 = new ah.b(context, p6Var);
            ah.a d = ah.a.d(context, this.d, this.f2812c, p6Var, i17, i16);
            bVar3.f830b = d;
            bVar3.addView(d, b6.e(i11, i11, 80));
            d.setIconPadding(i0.L(2.0f));
            e6.b(bVar3, 0.13f, 2.0f);
            float f7 = i11 / 2.0f;
            bVar3.setPivotX(i0.L(f7));
            bVar3.setPivotY(i0.L(f7 + 8.0f));
            bVar3.setVisibility(8);
            bVar3.setContentDescription(this.f2810a[i10]);
            bVar3.setOnClickListener(new f(this, i10, 1));
            bVar3.setOnLongClickListener(new j(this, i10, 0));
            if (i10 == 6) {
                ah.a aVar = bVar3.f830b;
                aVar.h = -1.0f;
                aVar.a();
            }
            boolean z12 = true;
            if (i10 == 1) {
                bVar3.d = true;
                lq lqVar = bVar3.f831c;
                if (lqVar != null) {
                    lqVar.setReverse(true);
                }
            }
            addView(bVar3, b6.e(i11, i11 + 8, this.f2815r));
            a0VarArr[i10] = new a0(bVar3, bVar, bVar2, 6);
            r1 r1Var = this.f2813f[i10];
            if (r1Var != null) {
                bVar3.a(r1Var.f2221a, false);
                bVar.a(false, false);
                if (r1Var.f2221a <= 0) {
                    z12 = false;
                }
                bVar2.a(z12, false);
                bVar3.c(r1Var.f2222b, false);
                bVar3.b(r1Var.f2223c, false);
            }
            a();
        }
        ((fe.b) a0VarArr[i10].f876c).a(z10, z11);
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    public void setGravity(int i10) {
        this.f2815r = i10;
    }

    public void setOnClickListener(a aVar) {
        this.h = aVar;
    }

    public void setOnLongClickListener(b bVar) {
        this.f2814n = bVar;
    }

    @Override
    public final void v(int i10, float f7, float f10, fe.f fVar) {
        int i11 = i10 >> 16;
        int i12 = i10 & 65535;
        if (i11 >= 0) {
            a0[] a0VarArr = this.e;
            if (i11 < a0VarArr.length && a0VarArr[i11] != null) {
                if (i12 == 1 || i12 == 2) {
                    a();
                }
            }
        }
    }

    @Override
    public final void E(float f7, int i10) {
    }
}
