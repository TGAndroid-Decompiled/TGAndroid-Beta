package defpackage;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import j$.util.Objects;
import java.util.HashSet;
public class r63 implements ylb {
    public final HashSet a = new HashSet();
    public final SparseIntArray b;
    public final Paint c;
    public Paint d;
    public PorterDuffColorFilter e;
    public m37 f;

    public r63() {
        SparseIntArray sparseIntArray = new SparseIntArray();
        this.b = sparseIntArray;
        Paint paint = new Paint();
        this.c = paint;
        sparseIntArray.put(cmb.ng, -1308622848);
        sparseIntArray.put(cmb.og, -1056964608);
        sparseIntArray.put(cmb.Oj, -1214008894);
        sparseIntArray.put(cmb.Pj, -1946157057);
        sparseIntArray.put(cmb.Qj, 452984831);
        sparseIntArray.put(cmb.Rj, -665229191);
        sparseIntArray.put(cmb.Sj, -667862461);
        sparseIntArray.put(cmb.Tj, -665229191);
        sparseIntArray.put(cmb.Ej, -1);
        sparseIntArray.put(cmb.I5, -1);
        sparseIntArray.put(cmb.p7, -2406842);
        sparseIntArray.put(cmb.G5, -10177041);
        sparseIntArray.put(cmb.gg, on2.f(0.2f, -16777216, -1));
        int i = cmb.O5;
        sparseIntArray.put(i, on2.f(0.5f, -16777216, -1));
        sparseIntArray.put(cmb.P5, on2.f(0.5f, -16777216, -1));
        int i2 = cmb.N5;
        sparseIntArray.put(i2, on2.p(-1, 17));
        sparseIntArray.put(cmb.D8, -1);
        sparseIntArray.put(cmb.E8, -1);
        sparseIntArray.put(cmb.o7, -1152913);
        sparseIntArray.put(cmb.h6, 385875967);
        int i3 = cmb.H5;
        sparseIntArray.put(i3, 436207615);
        sparseIntArray.put(cmb.Jf, -1);
        sparseIntArray.put(cmb.Qi, -1711276033);
        sparseIntArray.put(cmb.G6, on2.f(0.5f, -16777216, -1));
        sparseIntArray.put(cmb.s5, on2.f(0.5f, -16777216, -1));
        sparseIntArray.put(cmb.yj, on2.f(0.2f, -16777216, -1));
        sparseIntArray.put(cmb.i5, -592138);
        sparseIntArray.put(cmb.q5, -8553091);
        sparseIntArray.put(cmb.u6, -1);
        sparseIntArray.put(cmb.Kf, 1946157055);
        sparseIntArray.put(cmb.Mf, 1946157055);
        sparseIntArray.put(cmb.lg, -1);
        sparseIntArray.put(cmb.Ci, -1);
        sparseIntArray.put(cmb.r8, -1);
        sparseIntArray.put(cmb.fg, -1);
        sparseIntArray.put(cmb.zf, on2.p(-1, 30));
        sparseIntArray.put(cmb.yf, -14670806);
        sparseIntArray.put(cmb.x8, -1);
        sparseIntArray.put(i, on2.f(0.5f, -16777216, -1));
        sparseIntArray.put(i2, on2.p(-1, 17));
        sparseIntArray.put(cmb.x6, on2.p(-1, 127));
        sparseIntArray.put(cmb.Qe, -14606046);
        sparseIntArray.put(cmb.Pe, -1);
        sparseIntArray.put(cmb.Zf, -1221292);
        sparseIntArray.put(cmb.Uf, -1);
        sparseIntArray.put(cmb.ag, -15033089);
        sparseIntArray.put(cmb.Vf, -1);
        sparseIntArray.put(cmb.dg, 2030043135);
        sparseIntArray.put(cmb.cg, -10638868);
        sparseIntArray.put(cmb.Me, -1);
        sparseIntArray.put(cmb.Le, cmb.p1(0.6f, -1));
        sparseIntArray.put(cmb.kg, -1515107571);
        sparseIntArray.put(cmb.Xc, -5316609);
        sparseIntArray.put(cmb.Ke, -1);
        sparseIntArray.put(cmb.Ne, cmb.p1(0.9f, -1));
        sparseIntArray.put(cmb.Ml, cmb.p1(0.8f, -1));
        sparseIntArray.put(cmb.Ie, -14670806);
        sparseIntArray.put(cmb.g5, -14737633);
        sparseIntArray.put(cmb.h5, -16777216);
        sparseIntArray.put(cmb.L5, -15393241);
        sparseIntArray.put(cmb.c6, -15198183);
        sparseIntArray.put(cmb.Ol, -15198183);
        sparseIntArray.put(cmb.Sl, -1);
        sparseIntArray.put(cmb.F6, -1);
        sparseIntArray.put(cmb.Cf, -8553090);
        sparseIntArray.put(cmb.g6, -10177027);
        sparseIntArray.put(cmb.Gf, 181267199);
        sparseIntArray.put(cmb.Af, on2.p(-1, 125));
        sparseIntArray.put(cmb.Df, -2130706433);
        sparseIntArray.put(cmb.Ef, on2.p(-1, 125));
        sparseIntArray.put(cmb.Ff, -1);
        sparseIntArray.put(cmb.Hf, -10177041);
        sparseIntArray.put(cmb.Bf, on2.p(-16777216, 30));
        sparseIntArray.put(cmb.If, on2.p(-1, 125));
        int i4 = cmb.c7;
        sparseIntArray.put(i4, -16777216);
        sparseIntArray.put(cmb.pg, -15033089);
        sparseIntArray.put(cmb.T5, -1);
        sparseIntArray.put(cmb.d7, -14079703);
        sparseIntArray.put(cmb.e7, -8158332);
        sparseIntArray.put(cmb.Z6, -16777216);
        sparseIntArray.put(cmb.K6, -15033089);
        sparseIntArray.put(cmb.k6, -10177041);
        sparseIntArray.put(cmb.j6, -10177041);
        sparseIntArray.put(cmb.z6, on2.f(0.3f, -1, -16777216));
        sparseIntArray.put(cmb.vj, -14605274);
        sparseIntArray.put(cmb.wj, -7616267);
        sparseIntArray.put(cmb.xj, -1);
        sparseIntArray.put(cmb.G8, -233499371);
        sparseIntArray.put(cmb.Lf, -1);
        sparseIntArray.put(cmb.A6, -8355712);
        sparseIntArray.put(cmb.dh, -1);
        sparseIntArray.put(cmb.Vg, -14538189);
        sparseIntArray.put(cmb.z5, -14538189);
        sparseIntArray.put(cmb.Y8, -9316522);
        sparseIntArray.put(cmb.W8, -1446156);
        sparseIntArray.put(cmb.bd, -2110438831);
        sparseIntArray.put(cmb.L6, -10263709);
        sparseIntArray.put(cmb.M6, -15033089);
        sparseIntArray.put(cmb.A5, -15033089);
        sparseIntArray.put(cmb.D5, -15033089);
        sparseIntArray.put(cmb.m5, -15033089);
        sparseIntArray.put(cmb.mk, -832444);
        sparseIntArray.put(cmb.h7, -12692893);
        int i5 = cmb.i7;
        sparseIntArray.put(i5, -10329502);
        sparseIntArray.put(cmb.B5, -1);
        sparseIntArray.put(i3, 436207615);
        sparseIntArray.put(cmb.Si, -13816531);
        sparseIntArray.put(cmb.Ti, -1);
        sparseIntArray.put(cmb.Ri, -657931);
        sparseIntArray.put(cmb.I7, -1);
        sparseIntArray.put(cmb.Ni, -8553091);
        sparseIntArray.put(cmb.Oi, -10177041);
        sparseIntArray.put(cmb.F8, -232841441);
        sparseIntArray.put(cmb.s8, 385875967);
        sparseIntArray.put(cmb.l7, -12500671);
        sparseIntArray.put(cmb.k7, -13133079);
        sparseIntArray.put(cmb.m7, -1);
        sparseIntArray.put(cmb.Ei, -15033089);
        sparseIntArray.put(cmb.j5, -10177041);
        sparseIntArray.put(cmb.Q5, -1);
        sparseIntArray.put(cmb.Wc, -12147733);
        sparseIntArray.put(cmb.p5, -8553091);
        sparseIntArray.put(cmb.kj, -592138);
        sparseIntArray.put(cmb.mj, -14737633);
        sparseIntArray.put(cmb.nj, -12632257);
        sparseIntArray.put(cmb.lj, -8796932);
        sparseIntArray.put(cmb.zj, 1140850687);
        sparseIntArray.put(cmb.qb, on2.f(0.4f, -16777216, -1));
        sparseIntArray.put(cmb.tb, 0);
        sparseIntArray.put(cmb.ub, 0);
        sparseIntArray.put(cmb.vb, 0);
        sparseIntArray.put(cmb.Ce, on2.p(-1, 75));
        sparseIntArray.put(cmb.g7, -10177041);
        sparseIntArray.put(i5, -12237499);
        sparseIntArray.put(cmb.j7, -1);
        sparseIntArray.put(cmb.J7, -10703370);
        sparseIntArray.put(cmb.K7, -12547121);
        sparseIntArray.put(cmb.Ll, -1);
        sparseIntArray.put(cmb.Jl, -1207959553);
        sparseIntArray.put(cmb.Kl, 352321535);
        sparseIntArray.put(cmb.Ij, -8553091);
        sparseIntArray.put(cmb.Lj, -11292689);
        sparseIntArray.put(cmb.Jj, -12829636);
        sparseIntArray.put(cmb.Kj, -11184811);
        sparseIntArray.put(cmb.Pl, -15198183);
        k();
        paint.setColor(h(i4));
    }

    @Override
    public final boolean a() {
        return cmb.I.o();
    }

    @Override
    public final void b(float f, float f2, int i, int i2) {
        cmb.q(f, f2, i, i2);
    }

    @Override
    public final ColorFilter c() {
        PorterDuffColorFilter porterDuffColorFilter = this.e;
        if (porterDuffColorFilter == null) {
            PorterDuffColorFilter porterDuffColorFilter2 = new PorterDuffColorFilter(h(cmb.F6), PorterDuff.Mode.SRC_IN);
            this.e = porterDuffColorFilter2;
            return porterDuffColorFilter2;
        }
        return porterDuffColorFilter;
    }

    @Override
    public final Paint d(String str) {
        if (str.equals("paintDivider")) {
            return this.c;
        }
        if (str.equals("paintChatActionBackground")) {
            if (this.d == null) {
                Paint paint = new Paint(1);
                this.d = paint;
                paint.setColor(on2.f(0.1f, -16777216, -1));
            }
            return this.d;
        }
        return cmb.T0(str);
    }

    @Override
    public final boolean e() {
        return gda.D0;
    }

    @Override
    public final int f(int i) {
        return h(i);
    }

    @Override
    public final boolean g() {
        return false;
    }

    @Override
    public final Drawable getDrawable(String str) {
        if (Objects.equals(str, "drawableMsgOutMedia")) {
            m37 m37Var = this.f;
            if (m37Var == null) {
                m37 m37Var2 = new m37(1, true, false, this);
                this.f = m37Var2;
                return m37Var2;
            }
            return m37Var;
        }
        return null;
    }

    @Override
    public final int h(int i) {
        SparseIntArray sparseIntArray = this.b;
        int indexOfKey = sparseIntArray.indexOfKey(i);
        if (indexOfKey >= 0) {
            return sparseIntArray.valueAt(indexOfKey);
        }
        Integer valueOf = Integer.valueOf(i);
        HashSet hashSet = this.a;
        if (!hashSet.contains(valueOf)) {
            hashSet.add(Integer.valueOf(i));
        }
        return cmb.u0(i);
    }

    @Override
    public final int j(int i) {
        return h(i);
    }

    public void k() {
    }

    @Override
    public final void i(int i, int i2) {
    }
}
