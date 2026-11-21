package lh;

import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import c8.ma;
import c8.ra;
import ci.q;
import h6.m;
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.tq;
public final class h extends FrameLayout implements te.b {
    public static final int[] f19907s = {2131232188, 2131232510, 2131231761, 2131232674, 2131231849, 2131232510, 2131232510};
    public final String[] f19908a;
    public final h6 f19909b;
    public final gh.a f19910c;
    public final dh.c d;
    public final m[] f19911e;
    public final bg.f[] f19912f;
    public a h;
    public b f19913n;
    public int f19914r;

    public h(Context context, h6 h6Var, gh.b bVar, dh.c cVar) {
        super(context);
        this.f19908a = new String[]{gd.N0(2131753950, null), gd.N0(2131754814, null), gd.N0(2131754841, null), gd.N0(2131754789, null), gd.N0(2131754803, null), gd.N0(2131754777, null), gd.N0(2131754778, null)};
        this.f19911e = new m[7];
        this.f19912f = new bg.f[7];
        this.f19914r = 83;
        this.d = cVar;
        this.f19910c = bVar;
        this.f19909b = h6Var;
    }

    @Override
    public final void H(int i7, float f10, float f11, te.c cVar) {
        int i10 = i7 >> 16;
        int i11 = i7 & 65535;
        if (i10 >= 0) {
            m[] mVarArr = this.f19911e;
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
            m[] mVarArr = this.f19911e;
            if (i10 < mVarArr.length) {
                m mVar = mVarArr[i10];
                if (mVar != null) {
                    kh.b bVar = (kh.b) mVar.f13965b;
                    float f11 = ((te.a) mVar.f13966c).f57696e;
                    float f12 = ((te.a) mVar.d).f57696e;
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
        bg.f[] fVarArr = this.f19912f;
        if (fVarArr[i7] == 0) {
            ?? obj = new Object();
            obj.f3238a = 0;
            obj.f3239b = false;
            obj.f3240c = true;
            fVarArr[i7] = obj;
        }
        return fVarArr[i7];
    }

    public final void c(int i7, int i10, boolean z10) {
        boolean z11;
        b(i7).f3238a = i10;
        m mVar = this.f19911e[i7];
        if (mVar != null) {
            ((kh.b) mVar.f13965b).a(i10, z10);
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
        b(1).f3239b = z10;
        m mVar = this.f19911e[1];
        if (mVar != null) {
            ((kh.b) mVar.f13965b).c(z10, true);
        }
    }

    public final void e(int i7, boolean z10, boolean z11) {
        Interpolator interpolator;
        long j3;
        Interpolator interpolator2;
        long j10;
        int i10;
        int i11;
        m[] mVarArr = this.f19911e;
        m mVar = mVarArr[i7];
        if (mVar == null && !z10) {
            return;
        }
        if (mVar == null) {
            int i12 = i7 << 16;
            int i13 = i12 | 1;
            if (i7 == 0) {
                interpolator = nr.h;
            } else {
                interpolator = se.a.f57187a;
            }
            if (i7 == 0) {
                j3 = 300;
            } else {
                j3 = 280;
            }
            te.a aVar = new te.a(i13, this, interpolator, j3, false);
            int i14 = i12 | 2;
            if (i7 == 0) {
                interpolator2 = nr.h;
            } else {
                interpolator2 = se.a.f57187a;
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
            int i16 = f19907s[i7];
            h6 h6Var = this.f19909b;
            kh.b bVar = new kh.b(context, h6Var);
            kh.a d = kh.a.d(context, this.d, this.f19910c, h6Var, i16, i15);
            bVar.f18591b = d;
            bVar.addView(d, ma.e(i10, i10, 80));
            d.setIconPadding(g0.L(2.0f));
            ra.b(bVar, 0.13f, 2.0f);
            float f10 = i10 / 2.0f;
            bVar.setPivotX(g0.L(f10));
            bVar.setPivotY(g0.L(f10 + 8.0f));
            bVar.setVisibility(8);
            bVar.setContentDescription(this.f19908a[i7]);
            bVar.setOnClickListener(new q(this, i7, 6));
            bVar.setOnLongClickListener(new g(this, i7, 0));
            if (i7 == 6) {
                kh.a aVar3 = bVar.f18591b;
                aVar3.h = -1.0f;
                aVar3.a();
            }
            boolean z12 = true;
            if (i7 == 1) {
                bVar.d = true;
                tq tqVar = bVar.f18592c;
                if (tqVar != null) {
                    tqVar.setReverse(true);
                }
            }
            addView(bVar, ma.e(i10, i10 + 8, this.f19914r));
            mVarArr[i7] = new m(bVar, aVar, aVar2, false, 10);
            bg.f fVar = this.f19912f[i7];
            if (fVar != null) {
                bVar.a(fVar.f3238a, false);
                aVar.a(false, false);
                if (fVar.f3238a <= 0) {
                    z12 = false;
                }
                aVar2.a(z12, false);
                bVar.c(fVar.f3239b, false);
                bVar.b(fVar.f3240c, false);
            }
            a();
        }
        ((te.a) mVarArr[i7].f13966c).a(z10, z11);
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    public void setGravity(int i7) {
        this.f19914r = i7;
    }

    public void setOnClickListener(a aVar) {
        this.h = aVar;
    }

    public void setOnLongClickListener(b bVar) {
        this.f19913n = bVar;
    }

    @Override
    public final void D(float f10, int i7) {
    }
}
