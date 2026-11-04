package mh;

import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import b8.mf;
import b8.pf;
import bd.i;
import bi.q;
import k4.j;
import org.telegram.messenger.bd;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.xq;
public final class h extends FrameLayout implements qe.b {
    public static final int[] f19421s = {2131232186, 2131232508, 2131231760, 2131232670, 2131231848, 2131232508, 2131232508};
    public final String[] f19422a;
    public final e6 f19423b;
    public final hh.a f19424c;
    public final eh.c d;
    public final j[] f19425e;
    public final i[] f19426f;
    public a h;
    public b f19427n;
    public int f19428r;

    public h(Context context, e6 e6Var, hh.b bVar, eh.c cVar) {
        super(context);
        this.f19422a = new String[]{bd.M0(2131753953, null), bd.M0(2131754815, null), bd.M0(2131754842, null), bd.M0(2131754790, null), bd.M0(2131754804, null), bd.M0(2131754778, null), bd.M0(2131754779, null)};
        this.f19425e = new j[7];
        this.f19426f = new i[7];
        this.f19428r = 83;
        this.d = cVar;
        this.f19424c = bVar;
        this.f19423b = e6Var;
    }

    @Override
    public final void Y(int i3, float f10, float f11, qe.c cVar) {
        int i10 = i3 >> 16;
        int i11 = i3 & 65535;
        if (i10 >= 0) {
            j[] jVarArr = this.f19425e;
            if (i10 < jVarArr.length && jVarArr[i10] != null) {
                if (i11 == 1 || i11 == 2) {
                    a();
                }
            }
        }
    }

    public final void a() {
        int i3;
        float f10 = 0.0f;
        int i10 = 0;
        while (true) {
            j[] jVarArr = this.f19425e;
            if (i10 < jVarArr.length) {
                j jVar = jVarArr[i10];
                if (jVar != null) {
                    lh.b bVar = (lh.b) jVar.f16869a;
                    float f11 = ((qe.a) jVar.f16870b).f53840e;
                    float f12 = ((qe.a) jVar.f16871c).f53840e;
                    if (f11 > 0.0f) {
                        i3 = 0;
                    } else {
                        i3 = 8;
                    }
                    bVar.setVisibility(i3);
                    bVar.setAlpha(f11);
                    bVar.setScaleX(g0.T1(0.7f, 1.0f, f11));
                    bVar.setScaleY(g0.T1(0.7f, 1.0f, f11));
                    if (i10 != 0) {
                        bVar.setTranslationY(((1.0f - f11) * g0.L(80.0f)) - f10);
                    }
                    f10 += (g0.L((f12 * 10.0f) + 10.0f) + g0.L(44.0f)) * f11;
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public final i b(int i3) {
        i[] iVarArr = this.f19426f;
        if (iVarArr[i3] == 0) {
            ?? obj = new Object();
            obj.f3232a = 0;
            obj.f3233b = false;
            obj.f3234c = true;
            iVarArr[i3] = obj;
        }
        return iVarArr[i3];
    }

    public final void c(int i3, int i10, boolean z10) {
        boolean z11;
        b(i3).f3232a = i10;
        j jVar = this.f19425e[i3];
        if (jVar != null) {
            ((lh.b) jVar.f16869a).a(i10, z10);
            qe.a aVar = (qe.a) jVar.f16871c;
            if (i10 > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            aVar.a(z11, z10);
        }
    }

    public final void d(boolean z10) {
        b(1).f3233b = z10;
        j jVar = this.f19425e[1];
        if (jVar != null) {
            ((lh.b) jVar.f16869a).c(z10, true);
        }
    }

    public final void e(int i3, boolean z10, boolean z11) {
        Interpolator interpolator;
        long j10;
        Interpolator interpolator2;
        long j11;
        int i10;
        int i11;
        j[] jVarArr = this.f19425e;
        j jVar = jVarArr[i3];
        if (jVar == null && !z10) {
            return;
        }
        if (jVar == null) {
            int i12 = i3 << 16;
            int i13 = i12 | 1;
            if (i3 == 0) {
                interpolator = xq.h;
            } else {
                interpolator = pe.a.f53446a;
            }
            if (i3 == 0) {
                j10 = 300;
            } else {
                j10 = 280;
            }
            qe.a aVar = new qe.a(i13, this, interpolator, j10, false);
            int i14 = i12 | 2;
            if (i3 == 0) {
                interpolator2 = xq.h;
            } else {
                interpolator2 = pe.a.f53446a;
            }
            Interpolator interpolator3 = interpolator2;
            if (i3 == 0) {
                j11 = 300;
            } else {
                j11 = 280;
            }
            qe.a aVar2 = new qe.a(i14, this, interpolator3, j11, false);
            if (i3 == 0) {
                i10 = 50;
                i11 = 32;
            } else {
                i10 = 56;
                i11 = 48;
            }
            int i15 = i11;
            Context context = getContext();
            int i16 = f19421s[i3];
            e6 e6Var = this.f19423b;
            lh.b bVar = new lh.b(context, e6Var);
            lh.a d = lh.a.d(context, this.d, this.f19424c, e6Var, i16, i15);
            bVar.f18536b = d;
            bVar.addView(d, mf.e(i10, i10, 80));
            d.setIconPadding(g0.L(2.0f));
            pf.b(bVar, 0.13f, 2.0f);
            float f10 = i10 / 2.0f;
            bVar.setPivotX(g0.L(f10));
            bVar.setPivotY(g0.L(f10 + 8.0f));
            bVar.setVisibility(8);
            bVar.setContentDescription(this.f19422a[i3]);
            bVar.setOnClickListener(new q(this, i3, 6));
            bVar.setOnLongClickListener(new g(this, i3, 0));
            if (i3 == 6) {
                lh.a aVar3 = bVar.f18536b;
                aVar3.h = -1.0f;
                aVar3.a();
            }
            boolean z12 = true;
            if (i3 == 1) {
                bVar.d = true;
                dq dqVar = bVar.f18537c;
                if (dqVar != null) {
                    dqVar.setReverse(true);
                }
            }
            addView(bVar, mf.e(i10, i10 + 8, this.f19428r));
            jVarArr[i3] = new j(bVar, aVar, aVar2);
            i iVar = this.f19426f[i3];
            if (iVar != null) {
                bVar.a(iVar.f3232a, false);
                aVar.a(false, false);
                if (iVar.f3232a <= 0) {
                    z12 = false;
                }
                aVar2.a(z12, false);
                bVar.c(iVar.f3233b, false);
                bVar.b(iVar.f3234c, false);
            }
            a();
        }
        ((qe.a) jVarArr[i3].f16870b).a(z10, z11);
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    public void setGravity(int i3) {
        this.f19428r = i3;
    }

    public void setOnClickListener(a aVar) {
        this.h = aVar;
    }

    public void setOnLongClickListener(b bVar) {
        this.f19427n = bVar;
    }

    @Override
    public final void F(float f10, int i3) {
    }
}
