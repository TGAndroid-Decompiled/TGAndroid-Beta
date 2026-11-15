package lh;

import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import c8.ja;
import c8.na;
import ci.q;
import h6.m;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.kq;
public final class h extends FrameLayout implements te.b {
    public static final int[] f19515s = {2131232187, 2131232509, 2131231760, 2131232673, 2131231848, 2131232509, 2131232509};
    public final String[] f19516a;
    public final e6 f19517b;
    public final gh.a f19518c;
    public final dh.c d;
    public final m[] f19519e;
    public final bg.f[] f19520f;
    public a h;
    public b f19521n;
    public int f19522r;

    public h(Context context, e6 e6Var, gh.b bVar, dh.c cVar) {
        super(context);
        this.f19516a = new String[]{hd.M0(2131753953, null), hd.M0(2131754815, null), hd.M0(2131754842, null), hd.M0(2131754790, null), hd.M0(2131754804, null), hd.M0(2131754778, null), hd.M0(2131754779, null)};
        this.f19519e = new m[7];
        this.f19520f = new bg.f[7];
        this.f19522r = 83;
        this.d = cVar;
        this.f19518c = bVar;
        this.f19517b = e6Var;
    }

    @Override
    public final void G(int i7, float f10, float f11, te.c cVar) {
        int i10 = i7 >> 16;
        int i11 = i7 & 65535;
        if (i10 >= 0) {
            m[] mVarArr = this.f19519e;
            if (i10 < mVarArr.length && mVarArr[i10] != null) {
                if (i11 == 1 || i11 == 2) {
                    a();
                }
            }
        }
    }

    public final void a() {
        int i7;
        float f10 = 0.0f;
        int i10 = 0;
        while (true) {
            m[] mVarArr = this.f19519e;
            if (i10 < mVarArr.length) {
                m mVar = mVarArr[i10];
                if (mVar != null) {
                    kh.b bVar = (kh.b) mVar.f13624b;
                    float f11 = ((te.a) mVar.f13625c).f57085e;
                    float f12 = ((te.a) mVar.d).f57085e;
                    if (f11 > 0.0f) {
                        i7 = 0;
                    } else {
                        i7 = 8;
                    }
                    bVar.setVisibility(i7);
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

    public final bg.f b(int i7) {
        bg.f[] fVarArr = this.f19520f;
        if (fVarArr[i7] == 0) {
            ?? obj = new Object();
            obj.f3233a = 0;
            obj.f3234b = false;
            obj.f3235c = true;
            fVarArr[i7] = obj;
        }
        return fVarArr[i7];
    }

    public final void c(int i7, int i10, boolean z10) {
        boolean z11;
        b(i7).f3233a = i10;
        m mVar = this.f19519e[i7];
        if (mVar != null) {
            ((kh.b) mVar.f13624b).a(i10, z10);
            te.a aVar = (te.a) mVar.d;
            if (i10 > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            aVar.a(z11, z10);
        }
    }

    public final void d(boolean z10) {
        b(1).f3234b = z10;
        m mVar = this.f19519e[1];
        if (mVar != null) {
            ((kh.b) mVar.f13624b).c(z10, true);
        }
    }

    public final void e(int i7, boolean z10, boolean z11) {
        Interpolator interpolator;
        long j3;
        Interpolator interpolator2;
        long j10;
        int i10;
        int i11;
        m[] mVarArr = this.f19519e;
        m mVar = mVarArr[i7];
        if (mVar == null && !z10) {
            return;
        }
        if (mVar == null) {
            int i12 = i7 << 16;
            int i13 = i12 | 1;
            if (i7 == 0) {
                interpolator = er.h;
            } else {
                interpolator = se.a.f56572a;
            }
            if (i7 == 0) {
                j3 = 300;
            } else {
                j3 = 280;
            }
            te.a aVar = new te.a(i13, this, interpolator, j3, false);
            int i14 = i12 | 2;
            if (i7 == 0) {
                interpolator2 = er.h;
            } else {
                interpolator2 = se.a.f56572a;
            }
            Interpolator interpolator3 = interpolator2;
            if (i7 == 0) {
                j10 = 300;
            } else {
                j10 = 280;
            }
            te.a aVar2 = new te.a(i14, this, interpolator3, j10, false);
            if (i7 == 0) {
                i10 = 50;
                i11 = 32;
            } else {
                i10 = 56;
                i11 = 48;
            }
            int i15 = i11;
            Context context = getContext();
            int i16 = f19515s[i7];
            e6 e6Var = this.f19517b;
            kh.b bVar = new kh.b(context, e6Var);
            kh.a d = kh.a.d(context, this.d, this.f19518c, e6Var, i16, i15);
            bVar.f18168b = d;
            bVar.addView(d, ja.e(i10, i10, 80));
            d.setIconPadding(g0.L(2.0f));
            na.b(bVar, 0.13f, 2.0f);
            float f10 = i10 / 2.0f;
            bVar.setPivotX(g0.L(f10));
            bVar.setPivotY(g0.L(f10 + 8.0f));
            bVar.setVisibility(8);
            bVar.setContentDescription(this.f19516a[i7]);
            bVar.setOnClickListener(new q(this, i7, 6));
            bVar.setOnLongClickListener(new g(this, i7, 0));
            if (i7 == 6) {
                kh.a aVar3 = bVar.f18168b;
                aVar3.h = -1.0f;
                aVar3.a();
            }
            boolean z12 = true;
            if (i7 == 1) {
                bVar.d = true;
                kq kqVar = bVar.f18169c;
                if (kqVar != null) {
                    kqVar.setReverse(true);
                }
            }
            addView(bVar, ja.e(i10, i10 + 8, this.f19522r));
            mVarArr[i7] = new m(bVar, aVar, aVar2, false, 10);
            bg.f fVar = this.f19520f[i7];
            if (fVar != null) {
                bVar.a(fVar.f3233a, false);
                aVar.a(false, false);
                if (fVar.f3233a <= 0) {
                    z12 = false;
                }
                aVar2.a(z12, false);
                bVar.c(fVar.f3234b, false);
                bVar.b(fVar.f3235c, false);
            }
            a();
        }
        ((te.a) mVarArr[i7].f13625c).a(z10, z11);
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    public void setGravity(int i7) {
        this.f19522r = i7;
    }

    public void setOnClickListener(a aVar) {
        this.h = aVar;
    }

    public void setOnLongClickListener(b bVar) {
        this.f19521n = bVar;
    }

    @Override
    public final void E(float f10, int i7) {
    }
}
