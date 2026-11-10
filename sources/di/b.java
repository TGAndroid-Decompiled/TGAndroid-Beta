package di;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import j$.util.Objects;
import java.util.HashSet;
import org.telegram.messenger.iz;
public class b implements org.telegram.ui.ActionBar.h6 {
    public final HashSet f8825a = new HashSet();
    public final SparseIntArray f8826b;
    public final Paint f8827c;
    public Paint d;
    public PorterDuffColorFilter f8828e;
    public org.telegram.ui.ActionBar.u4 f8829f;

    public b() {
        SparseIntArray sparseIntArray = new SparseIntArray();
        this.f8826b = sparseIntArray;
        Paint paint = new Paint();
        this.f8827c = paint;
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.f28046lg, -1308622848);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.f28063mg, -1056964608);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.Mj, -1214008894);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.Nj, -1946157057);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.Oj, 452984831);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.Pj, -665229191);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.Qj, -667862461);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.Rj, -665229191);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.Cj, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.J5, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.f28131q7, -2406842);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.H5, -10177041);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.f27918eg, i0.a.f(0.2f, -16777216, -1));
        int i7 = org.telegram.ui.ActionBar.m6.P5;
        sparseIntArray.put(i7, i0.a.f(0.5f, -16777216, -1));
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.Q5, i0.a.f(0.5f, -16777216, -1));
        int i10 = org.telegram.ui.ActionBar.m6.O5;
        sparseIntArray.put(i10, i0.a.o(-1, 17));
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.E8, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.F8, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.f28111p7, -1152913);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.f27982i6, 385875967);
        int i11 = org.telegram.ui.ActionBar.m6.I5;
        sparseIntArray.put(i11, 436207615);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.Hf, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.Oi, -1711276033);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.H6, i0.a.f(0.5f, -16777216, -1));
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.f28186t5, i0.a.f(0.5f, -16777216, -1));
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.wj, i0.a.f(0.2f, -16777216, -1));
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.f27998j5, -592138);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.f28148r5, -8553091);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.f28225v6, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.If, 1946157055);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.Kf, 1946157055);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.f28009jg, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.Ai, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.f28170s8, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.f27899dg, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.f28271xf, i0.a.o(-1, 30));
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.f28252wf, -14670806);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.f28284y8, -1);
        sparseIntArray.put(i7, i0.a.f(0.5f, -16777216, -1));
        sparseIntArray.put(i10, i0.a.o(-1, 17));
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.f28282y6, i0.a.o(-1, 127));
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.Oe, -14606046);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.Ne, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.Xf, -1221292);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.Sf, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.Yf, -15033089);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.Tf, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.f27862bg, 2030043135);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.f27843ag, -10638868);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.Ke, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.Je, org.telegram.ui.ActionBar.m6.r1(0.6f, -1));
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.f27990ig, -1515107571);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.Vc, -5316609);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.Ie, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.Le, org.telegram.ui.ActionBar.m6.r1(0.9f, -1));
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.Kl, org.telegram.ui.ActionBar.m6.r1(0.8f, -1));
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.Ge, -14670806);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.f27963h5, -14737633);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.f27981i5, -16777216);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.M5, -15393241);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.f27890d6, -15198183);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.Ml, -15198183);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.Ql, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.G6, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.Af, -8553090);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.f27964h6, -10177027);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.Ef, 181267199);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.f28290yf, i0.a.o(-1, 125));
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.Bf, -2130706433);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.Cf, i0.a.o(-1, 125));
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.Df, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.Ff, -10177041);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.f28308zf, i0.a.o(-16777216, 30));
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.Gf, i0.a.o(-1, 125));
        int i12 = org.telegram.ui.ActionBar.m6.f27891d7;
        sparseIntArray.put(i12, -16777216);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.f28081ng, -15033089);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.U5, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.f27910e7, -14079703);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.f27929f7, -8158332);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.f27834a7, -16777216);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.L6, -15033089);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.f28037l6, -10177041);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.f28019k6, -10177041);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.A6, i0.a.f(0.3f, -1, -16777216));
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.tj, -14605274);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.uj, -7616267);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.vj, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.H8, -233499371);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.Jf, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.B6, -8355712);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.f27863bh, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.Tg, -14538189);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.A5, -14538189);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.Z8, -9316522);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.X8, -1446156);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.Zc, -2110438831);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.M6, -10263709);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.N6, -15033089);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.B5, -15033089);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.E5, -15033089);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.f28071n5, -15033089);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.kk, -832444);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.i7, -12692893);
        int i13 = org.telegram.ui.ActionBar.m6.f28000j7;
        sparseIntArray.put(i13, -10329502);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.C5, -1);
        sparseIntArray.put(i11, 436207615);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.Qi, -13816531);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.Ri, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.Pi, -657931);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.J7, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.Li, -8553091);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.Mi, -10177041);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.G8, -232841441);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.f28188t8, 385875967);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.f28056m7, -12500671);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.f28038l7, -13133079);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.f28073n7, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.Ci, -15033089);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.f28018k5, -10177041);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.R5, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.Uc, -12147733);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.f28129q5, -8553091);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.ij, -592138);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.kj, -14737633);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.lj, -12632257);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.jj, -8796932);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.xj, 1140850687);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.f28095ob, i0.a.f(0.4f, -16777216, -1));
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.f28154rb, 0);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.f28172sb, 0);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.f28191tb, 0);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.Ae, i0.a.o(-1, 75));
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.h7, -10177041);
        sparseIntArray.put(i13, -12237499);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.f28020k7, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.K7, -10703370);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.L7, -12547121);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.Jl, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.Hl, -1207959553);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.Il, 352321535);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.Gj, -8553091);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.Jj, -11292689);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.Hj, -12829636);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.Ij, -11184811);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.Nl, -15198183);
        k();
        paint.setColor(h(i12));
    }

    @Override
    public final boolean a() {
        return org.telegram.ui.ActionBar.m6.I.q();
    }

    @Override
    public final void b(float f10, float f11, int i7, int i10) {
        org.telegram.ui.ActionBar.m6.r(f10, f11, i7, i10);
    }

    @Override
    public final ColorFilter c() {
        if (this.f8828e == null) {
            this.f8828e = new PorterDuffColorFilter(h(org.telegram.ui.ActionBar.m6.G6), PorterDuff.Mode.SRC_IN);
        }
        return this.f8828e;
    }

    @Override
    public final Paint d(String str) {
        if (str.equals("paintDivider")) {
            return this.f8827c;
        }
        if (str.equals("paintChatActionBackground")) {
            if (this.d == null) {
                Paint paint = new Paint(1);
                this.d = paint;
                paint.setColor(i0.a.f(0.1f, -16777216, -1));
            }
            return this.d;
        }
        return org.telegram.ui.ActionBar.m6.V0(str);
    }

    @Override
    public final boolean e() {
        return iz.H0;
    }

    @Override
    public final int f(int i7) {
        return h(i7);
    }

    @Override
    public final boolean g() {
        return false;
    }

    @Override
    public final Drawable getDrawable(String str) {
        if (Objects.equals(str, "drawableMsgOutMedia")) {
            if (this.f8829f == null) {
                this.f8829f = new org.telegram.ui.ActionBar.u4(1, true, false, this);
            }
            return this.f8829f;
        }
        return null;
    }

    @Override
    public final int h(int i7) {
        SparseIntArray sparseIntArray = this.f8826b;
        int indexOfKey = sparseIntArray.indexOfKey(i7);
        if (indexOfKey >= 0) {
            return sparseIntArray.valueAt(indexOfKey);
        }
        Integer valueOf = Integer.valueOf(i7);
        HashSet hashSet = this.f8825a;
        if (!hashSet.contains(valueOf)) {
            hashSet.add(Integer.valueOf(i7));
        }
        return org.telegram.ui.ActionBar.m6.v0(i7);
    }

    @Override
    public final int j(int i7) {
        return h(i7);
    }

    public void k() {
    }

    @Override
    public final void i(int i7, int i10) {
    }
}
