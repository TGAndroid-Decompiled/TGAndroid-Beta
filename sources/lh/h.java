package lh;

import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import c8.ma;
import c8.ra;
import ci.q;
import h6.m;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.tq;
public final class h extends FrameLayout implements te.b {
    public static final int[] f19910s = {2131232188, 2131232510, 2131231761, 2131232674, 2131231849, 2131232510, 2131232510};
    public final String[] f19911a;
    public final h6 f19912b;
    public final gh.a f19913c;
    public final dh.c d;
    public final m[] f19914e;
    public final bg.f[] f19915f;
    public a h;
    public b f19916n;
    public int f19917r;

    public h(Context context, h6 h6Var, gh.b bVar, dh.c cVar) {
        super(context);
        this.f19911a = new String[]{hd.N0(2131753950, null), hd.N0(2131754814, null), hd.N0(2131754841, null), hd.N0(2131754789, null), hd.N0(2131754803, null), hd.N0(2131754777, null), hd.N0(2131754778, null)};
        this.f19914e = new m[7];
        this.f19915f = new bg.f[7];
        this.f19917r = 83;
        this.d = cVar;
        this.f19913c = bVar;
        this.f19912b = h6Var;
    }

    @Override
    public final void H(int i7, float f10, float f11, te.c cVar) {
        int i10 = i7 >> 16;
        int i11 = i7 & 65535;
        if (i10 >= 0) {
            m[] mVarArr = this.f19914e;
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
            m[] mVarArr = this.f19914e;
            if (i10 < mVarArr.length) {
                m mVar = mVarArr[i10];
                if (mVar != null) {
                    kh.b bVar = (kh.b) mVar.f13968b;
                    float f11 = ((te.a) mVar.f13969c).f57700e;
                    float f12 = ((te.a) mVar.d).f57700e;
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
        bg.f[] fVarArr = this.f19915f;
        if (fVarArr[i7] == 0) {
            ?? obj = new Object();
            obj.f3245a = 0;
            obj.f3246b = false;
            obj.f3247c = true;
            fVarArr[i7] = obj;
        }
        return fVarArr[i7];
    }

    public final void c(int i7, int i10, boolean z10) {
        boolean z11;
        b(i7).f3245a = i10;
        m mVar = this.f19914e[i7];
        if (mVar != null) {
            ((kh.b) mVar.f13968b).a(i10, z10);
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
        b(1).f3246b = z10;
        m mVar = this.f19914e[1];
        if (mVar != null) {
            ((kh.b) mVar.f13968b).c(z10, true);
        }
    }

    public final void e(int i7, boolean z10, boolean z11) {
        Interpolator interpolator;
        long j3;
        Interpolator interpolator2;
        long j10;
        int i10;
        int i11;
        m[] mVarArr = this.f19914e;
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
                interpolator = se.a.f57191a;
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
                interpolator2 = se.a.f57191a;
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
            int i16 = f19910s[i7];
            h6 h6Var = this.f19912b;
            kh.b bVar = new kh.b(context, h6Var);
            kh.a d = kh.a.d(context, this.d, this.f19913c, h6Var, i16, i15);
            bVar.f18594b = d;
            bVar.addView(d, ma.e(i10, i10, 80));
            d.setIconPadding(g0.L(2.0f));
            ra.b(bVar, 0.13f, 2.0f);
            float f10 = i10 / 2.0f;
            bVar.setPivotX(g0.L(f10));
            bVar.setPivotY(g0.L(f10 + 8.0f));
            bVar.setVisibility(8);
            bVar.setContentDescription(this.f19911a[i7]);
            bVar.setOnClickListener(new q(this, i7, 6));
            bVar.setOnLongClickListener(new g(this, i7, 0));
            if (i7 == 6) {
                kh.a aVar3 = bVar.f18594b;
                aVar3.h = -1.0f;
                aVar3.a();
            }
            boolean z12 = true;
            if (i7 == 1) {
                bVar.d = true;
                tq tqVar = bVar.f18595c;
                if (tqVar != null) {
                    tqVar.setReverse(true);
                }
            }
            addView(bVar, ma.e(i10, i10 + 8, this.f19917r));
            mVarArr[i7] = new m(bVar, aVar, aVar2, false, 10);
            bg.f fVar = this.f19915f[i7];
            if (fVar != null) {
                bVar.a(fVar.f3245a, false);
                aVar.a(false, false);
                if (fVar.f3245a <= 0) {
                    z12 = false;
                }
                aVar2.a(z12, false);
                bVar.c(fVar.f3246b, false);
                bVar.b(fVar.f3247c, false);
            }
            a();
        }
        ((te.a) mVarArr[i7].f13969c).a(z10, z11);
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    public void setGravity(int i7) {
        this.f19917r = i7;
    }

    public void setOnClickListener(a aVar) {
        this.h = aVar;
    }

    public void setOnLongClickListener(b bVar) {
        this.f19916n = bVar;
    }

    @Override
    public final void D(float f10, int i7) {
    }
}
