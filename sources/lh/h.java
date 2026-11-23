package lh;

import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import c8.na;
import c8.sa;
import ci.q;
import h6.m;
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.qq;
public final class h extends FrameLayout implements te.b {
    public static final int[] f19976s = {2131232191, 2131232513, 2131231764, 2131232677, 2131231852, 2131232513, 2131232513};
    public final String[] f19977a;
    public final i6 f19978b;
    public final gh.a f19979c;
    public final dh.c d;
    public final m[] f19980e;
    public final bg.f[] f19981f;
    public a h;
    public b f19982n;
    public int f19983r;

    public h(Context context, i6 i6Var, gh.b bVar, dh.c cVar) {
        super(context);
        this.f19977a = new String[]{gd.N0(2131753950, null), gd.N0(2131754814, null), gd.N0(2131754841, null), gd.N0(2131754789, null), gd.N0(2131754803, null), gd.N0(2131754777, null), gd.N0(2131754778, null)};
        this.f19980e = new m[7];
        this.f19981f = new bg.f[7];
        this.f19983r = 83;
        this.d = cVar;
        this.f19979c = bVar;
        this.f19978b = i6Var;
    }

    @Override
    public final void K(int i7, float f10, float f11, te.c cVar) {
        int i10 = i7 >> 16;
        int i11 = i7 & 65535;
        if (i10 >= 0) {
            m[] mVarArr = this.f19980e;
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
            m[] mVarArr = this.f19980e;
            if (i10 < mVarArr.length) {
                m mVar = mVarArr[i10];
                if (mVar != null) {
                    kh.b bVar = (kh.b) mVar.f13931b;
                    float f11 = ((te.a) mVar.f13932c).f57779e;
                    float f12 = ((te.a) mVar.d).f57779e;
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
        bg.f[] fVarArr = this.f19981f;
        if (fVarArr[i7] == 0) {
            ?? obj = new Object();
            obj.f3196a = 0;
            obj.f3197b = false;
            obj.f3198c = true;
            fVarArr[i7] = obj;
        }
        return fVarArr[i7];
    }

    public final void c(int i7, int i10, boolean z10) {
        boolean z11;
        b(i7).f3196a = i10;
        m mVar = this.f19980e[i7];
        if (mVar != null) {
            ((kh.b) mVar.f13931b).a(i10, z10);
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
        b(1).f3197b = z10;
        m mVar = this.f19980e[1];
        if (mVar != null) {
            ((kh.b) mVar.f13931b).c(z10, true);
        }
    }

    public final void e(int i7, boolean z10, boolean z11) {
        Interpolator interpolator;
        long j3;
        Interpolator interpolator2;
        long j10;
        int i10;
        int i11;
        m[] mVarArr = this.f19980e;
        m mVar = mVarArr[i7];
        if (mVar == null && !z10) {
            return;
        }
        if (mVar == null) {
            int i12 = i7 << 16;
            int i13 = i12 | 1;
            if (i7 == 0) {
                interpolator = kr.h;
            } else {
                interpolator = se.a.f57270a;
            }
            if (i7 == 0) {
                j3 = 300;
            } else {
                j3 = 280;
            }
            te.a aVar = new te.a(i13, this, interpolator, j3, false);
            int i14 = i12 | 2;
            if (i7 == 0) {
                interpolator2 = kr.h;
            } else {
                interpolator2 = se.a.f57270a;
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
            int i16 = f19976s[i7];
            i6 i6Var = this.f19978b;
            kh.b bVar = new kh.b(context, i6Var);
            kh.a d = kh.a.d(context, this.d, this.f19979c, i6Var, i16, i15);
            bVar.f18656b = d;
            bVar.addView(d, na.e(i10, i10, 80));
            d.setIconPadding(g0.L(2.0f));
            sa.b(bVar, 0.13f, 2.0f);
            float f10 = i10 / 2.0f;
            bVar.setPivotX(g0.L(f10));
            bVar.setPivotY(g0.L(f10 + 8.0f));
            bVar.setVisibility(8);
            bVar.setContentDescription(this.f19977a[i7]);
            bVar.setOnClickListener(new q(this, i7, 6));
            bVar.setOnLongClickListener(new g(this, i7, 0));
            if (i7 == 6) {
                kh.a aVar3 = bVar.f18656b;
                aVar3.h = -1.0f;
                aVar3.a();
            }
            boolean z12 = true;
            if (i7 == 1) {
                bVar.d = true;
                qq qqVar = bVar.f18657c;
                if (qqVar != null) {
                    qqVar.setReverse(true);
                }
            }
            addView(bVar, na.e(i10, i10 + 8, this.f19983r));
            mVarArr[i7] = new m(bVar, aVar, aVar2, false, 11);
            bg.f fVar = this.f19981f[i7];
            if (fVar != null) {
                bVar.a(fVar.f3196a, false);
                aVar.a(false, false);
                if (fVar.f3196a <= 0) {
                    z12 = false;
                }
                aVar2.a(z12, false);
                bVar.c(fVar.f3197b, false);
                bVar.b(fVar.f3198c, false);
            }
            a();
        }
        ((te.a) mVarArr[i7].f13932c).a(z10, z11);
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    public void setGravity(int i7) {
        this.f19983r = i7;
    }

    public void setOnClickListener(a aVar) {
        this.h = aVar;
    }

    public void setOnLongClickListener(b bVar) {
        this.f19982n = bVar;
    }

    @Override
    public final void G(float f10, int i7) {
    }
}
