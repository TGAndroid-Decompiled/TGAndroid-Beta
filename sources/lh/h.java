package lh;

import ai.v;
import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import c8.ha;
import c8.ka;
import h6.m;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.cq;
import org.telegram.ui.Components.xq;
public final class h extends FrameLayout implements te.b {
    public static final int[] f18379s = {2131232186, 2131232508, 2131231760, 2131232672, 2131231848, 2131232508, 2131232508};
    public final String[] f18380a;
    public final f6 f18381b;
    public final gh.a f18382c;
    public final dh.c d;
    public final m[] f18383e;
    public final bg.f[] f18384f;
    public a h;
    public b f18385n;
    public int f18386r;

    public h(Context context, f6 f6Var, gh.b bVar, dh.c cVar) {
        super(context);
        this.f18380a = new String[]{hd.M0(2131753953, null), hd.M0(2131754815, null), hd.M0(2131754842, null), hd.M0(2131754790, null), hd.M0(2131754804, null), hd.M0(2131754778, null), hd.M0(2131754779, null)};
        this.f18383e = new m[7];
        this.f18384f = new bg.f[7];
        this.f18386r = 83;
        this.d = cVar;
        this.f18382c = bVar;
        this.f18381b = f6Var;
    }

    @Override
    public final void Y(int i7, float f10, float f11, te.c cVar) {
        int i10 = i7 >> 16;
        int i11 = i7 & 65535;
        if (i10 >= 0) {
            m[] mVarArr = this.f18383e;
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
            m[] mVarArr = this.f18383e;
            if (i10 < mVarArr.length) {
                m mVar = mVarArr[i10];
                if (mVar != null) {
                    kh.b bVar = (kh.b) mVar.f14264b;
                    float f11 = ((te.a) mVar.f14265c).f55395e;
                    float f12 = ((te.a) mVar.d).f55395e;
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
        bg.f[] fVarArr = this.f18384f;
        if (fVarArr[i7] == 0) {
            ?? obj = new Object();
            obj.f3275a = 0;
            obj.f3276b = false;
            obj.f3277c = true;
            fVarArr[i7] = obj;
        }
        return fVarArr[i7];
    }

    public final void c(int i7, int i10, boolean z9) {
        boolean z10;
        b(i7).f3275a = i10;
        m mVar = this.f18383e[i7];
        if (mVar != null) {
            ((kh.b) mVar.f14264b).a(i10, z9);
            te.a aVar = (te.a) mVar.d;
            if (i10 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            aVar.a(z10, z9);
        }
    }

    public final void d(boolean z9) {
        b(1).f3276b = z9;
        m mVar = this.f18383e[1];
        if (mVar != null) {
            ((kh.b) mVar.f14264b).c(z9, true);
        }
    }

    public final void e(int i7, boolean z9, boolean z10) {
        Interpolator interpolator;
        long j3;
        Interpolator interpolator2;
        long j10;
        int i10;
        int i11;
        m[] mVarArr = this.f18383e;
        m mVar = mVarArr[i7];
        if (mVar == null && !z9) {
            return;
        }
        if (mVar == null) {
            int i12 = i7 << 16;
            int i13 = i12 | 1;
            if (i7 == 0) {
                interpolator = xq.h;
            } else {
                interpolator = se.a.f54913a;
            }
            if (i7 == 0) {
                j3 = 300;
            } else {
                j3 = 280;
            }
            te.a aVar = new te.a(i13, this, interpolator, j3, false);
            int i14 = i12 | 2;
            if (i7 == 0) {
                interpolator2 = xq.h;
            } else {
                interpolator2 = se.a.f54913a;
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
            int i16 = f18379s[i7];
            f6 f6Var = this.f18381b;
            kh.b bVar = new kh.b(context, f6Var);
            kh.a d = kh.a.d(context, this.d, this.f18382c, f6Var, i16, i15);
            bVar.f17596b = d;
            bVar.addView(d, ha.e(i10, i10, 80));
            d.setIconPadding(g0.L(2.0f));
            ka.b(bVar, 0.13f, 2.0f);
            float f10 = i10 / 2.0f;
            bVar.setPivotX(g0.L(f10));
            bVar.setPivotY(g0.L(f10 + 8.0f));
            bVar.setVisibility(8);
            bVar.setContentDescription(this.f18380a[i7]);
            bVar.setOnClickListener(new v(this, i7, 6));
            bVar.setOnLongClickListener(new g(this, i7, 0));
            if (i7 == 6) {
                kh.a aVar3 = bVar.f17596b;
                aVar3.h = -1.0f;
                aVar3.a();
            }
            boolean z11 = true;
            if (i7 == 1) {
                bVar.d = true;
                cq cqVar = bVar.f17597c;
                if (cqVar != null) {
                    cqVar.setReverse(true);
                }
            }
            addView(bVar, ha.e(i10, i10 + 8, this.f18386r));
            mVarArr[i7] = new m(bVar, aVar, aVar2, 9);
            bg.f fVar = this.f18384f[i7];
            if (fVar != null) {
                bVar.a(fVar.f3275a, false);
                aVar.a(false, false);
                if (fVar.f3275a <= 0) {
                    z11 = false;
                }
                aVar2.a(z11, false);
                bVar.c(fVar.f3276b, false);
                bVar.b(fVar.f3277c, false);
            }
            a();
        }
        ((te.a) mVarArr[i7].f14265c).a(z9, z10);
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    public void setGravity(int i7) {
        this.f18386r = i7;
    }

    public void setOnClickListener(a aVar) {
        this.h = aVar;
    }

    public void setOnLongClickListener(b bVar) {
        this.f18385n = bVar;
    }

    @Override
    public final void F(float f10, int i7) {
    }
}
