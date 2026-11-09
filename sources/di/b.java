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
public class b implements org.telegram.ui.ActionBar.g6 {
    public final HashSet f8820a = new HashSet();
    public final SparseIntArray f8821b;
    public final Paint f8822c;
    public Paint d;
    public PorterDuffColorFilter f8823e;
    public org.telegram.ui.ActionBar.t4 f8824f;

    public b() {
        SparseIntArray sparseIntArray = new SparseIntArray();
        this.f8821b = sparseIntArray;
        Paint paint = new Paint();
        this.f8822c = paint;
        sparseIntArray.put(org.telegram.ui.ActionBar.l6.f28021lg, -1308622848);
        sparseIntArray.put(org.telegram.ui.ActionBar.l6.f28038mg, -1056964608);
        sparseIntArray.put(org.telegram.ui.ActionBar.l6.Mj, -1214008894);
        sparseIntArray.put(org.telegram.ui.ActionBar.l6.Nj, -1946157057);
        sparseIntArray.put(org.telegram.ui.ActionBar.l6.Oj, 452984831);
        sparseIntArray.put(org.telegram.ui.ActionBar.l6.Pj, -665229191);
        sparseIntArray.put(org.telegram.ui.ActionBar.l6.Qj, -667862461);
        sparseIntArray.put(org.telegram.ui.ActionBar.l6.Rj, -665229191);
        sparseIntArray.put(org.telegram.ui.ActionBar.l6.Cj, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.l6.J5, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.l6.f28106q7, -2406842);
        sparseIntArray.put(org.telegram.ui.ActionBar.l6.H5, -10177041);
        sparseIntArray.put(org.telegram.ui.ActionBar.l6.f27893eg, i0.a.f(0.2f, -16777216, -1));
        int i7 = org.telegram.ui.ActionBar.l6.P5;
        sparseIntArray.put(i7, i0.a.f(0.5f, -16777216, -1));
        sparseIntArray.put(org.telegram.ui.ActionBar.l6.Q5, i0.a.f(0.5f, -16777216, -1));
        int i10 = org.telegram.ui.ActionBar.l6.O5;
        sparseIntArray.put(i10, i0.a.o(-1, 17));
        sparseIntArray.put(org.telegram.ui.ActionBar.l6.E8, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.l6.F8, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.l6.f28086p7, -1152913);
        sparseIntArray.put(org.telegram.ui.ActionBar.l6.f27957i6, 385875967);
        int i11 = org.telegram.ui.ActionBar.l6.I5;
        sparseIntArray.put(i11, 436207615);
        sparseIntArray.put(org.telegram.ui.ActionBar.l6.Hf, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.l6.Oi, -1711276033);
        sparseIntArray.put(org.telegram.ui.ActionBar.l6.H6, i0.a.f(0.5f, -16777216, -1));
        sparseIntArray.put(org.telegram.ui.ActionBar.l6.f28161t5, i0.a.f(0.5f, -16777216, -1));
        sparseIntArray.put(org.telegram.ui.ActionBar.l6.wj, i0.a.f(0.2f, -16777216, -1));
        sparseIntArray.put(org.telegram.ui.ActionBar.l6.f27973j5, -592138);
        sparseIntArray.put(org.telegram.ui.ActionBar.l6.f28123r5, -8553091);
        sparseIntArray.put(org.telegram.ui.ActionBar.l6.f28200v6, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.l6.If, 1946157055);
        sparseIntArray.put(org.telegram.ui.ActionBar.l6.Kf, 1946157055);
        sparseIntArray.put(org.telegram.ui.ActionBar.l6.f27984jg, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.l6.Ai, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.l6.f28145s8, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.l6.f27874dg, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.l6.f28246xf, i0.a.o(-1, 30));
        sparseIntArray.put(org.telegram.ui.ActionBar.l6.f28227wf, -14670806);
        sparseIntArray.put(org.telegram.ui.ActionBar.l6.f28259y8, -1);
        sparseIntArray.put(i7, i0.a.f(0.5f, -16777216, -1));
        sparseIntArray.put(i10, i0.a.o(-1, 17));
        sparseIntArray.put(org.telegram.ui.ActionBar.l6.f28257y6, i0.a.o(-1, 127));
        sparseIntArray.put(org.telegram.ui.ActionBar.l6.Oe, -14606046);
        sparseIntArray.put(org.telegram.ui.ActionBar.l6.Ne, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.l6.Xf, -1221292);
        sparseIntArray.put(org.telegram.ui.ActionBar.l6.Sf, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.l6.Yf, -15033089);
        sparseIntArray.put(org.telegram.ui.ActionBar.l6.Tf, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.l6.f27837bg, 2030043135);
        sparseIntArray.put(org.telegram.ui.ActionBar.l6.f27818ag, -10638868);
        sparseIntArray.put(org.telegram.ui.ActionBar.l6.Ke, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.l6.Je, org.telegram.ui.ActionBar.l6.r1(0.6f, -1));
        sparseIntArray.put(org.telegram.ui.ActionBar.l6.f27965ig, -1515107571);
        sparseIntArray.put(org.telegram.ui.ActionBar.l6.Vc, -5316609);
        sparseIntArray.put(org.telegram.ui.ActionBar.l6.Ie, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.l6.Le, org.telegram.ui.ActionBar.l6.r1(0.9f, -1));
        sparseIntArray.put(org.telegram.ui.ActionBar.l6.Kl, org.telegram.ui.ActionBar.l6.r1(0.8f, -1));
        sparseIntArray.put(org.telegram.ui.ActionBar.l6.Ge, -14670806);
        sparseIntArray.put(org.telegram.ui.ActionBar.l6.f27938h5, -14737633);
        sparseIntArray.put(org.telegram.ui.ActionBar.l6.f27956i5, -16777216);
        sparseIntArray.put(org.telegram.ui.ActionBar.l6.M5, -15393241);
        sparseIntArray.put(org.telegram.ui.ActionBar.l6.f27865d6, -15198183);
        sparseIntArray.put(org.telegram.ui.ActionBar.l6.Ml, -15198183);
        sparseIntArray.put(org.telegram.ui.ActionBar.l6.Ql, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.l6.G6, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.l6.Af, -8553090);
        sparseIntArray.put(org.telegram.ui.ActionBar.l6.f27939h6, -10177027);
        sparseIntArray.put(org.telegram.ui.ActionBar.l6.Ef, 181267199);
        sparseIntArray.put(org.telegram.ui.ActionBar.l6.f28265yf, i0.a.o(-1, 125));
        sparseIntArray.put(org.telegram.ui.ActionBar.l6.Bf, -2130706433);
        sparseIntArray.put(org.telegram.ui.ActionBar.l6.Cf, i0.a.o(-1, 125));
        sparseIntArray.put(org.telegram.ui.ActionBar.l6.Df, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.l6.Ff, -10177041);
        sparseIntArray.put(org.telegram.ui.ActionBar.l6.f28283zf, i0.a.o(-16777216, 30));
        sparseIntArray.put(org.telegram.ui.ActionBar.l6.Gf, i0.a.o(-1, 125));
        int i12 = org.telegram.ui.ActionBar.l6.f27866d7;
        sparseIntArray.put(i12, -16777216);
        sparseIntArray.put(org.telegram.ui.ActionBar.l6.f28056ng, -15033089);
        sparseIntArray.put(org.telegram.ui.ActionBar.l6.U5, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.l6.f27885e7, -14079703);
        sparseIntArray.put(org.telegram.ui.ActionBar.l6.f27904f7, -8158332);
        sparseIntArray.put(org.telegram.ui.ActionBar.l6.f27809a7, -16777216);
        sparseIntArray.put(org.telegram.ui.ActionBar.l6.L6, -15033089);
        sparseIntArray.put(org.telegram.ui.ActionBar.l6.f28012l6, -10177041);
        sparseIntArray.put(org.telegram.ui.ActionBar.l6.f27994k6, -10177041);
        sparseIntArray.put(org.telegram.ui.ActionBar.l6.A6, i0.a.f(0.3f, -1, -16777216));
        sparseIntArray.put(org.telegram.ui.ActionBar.l6.tj, -14605274);
        sparseIntArray.put(org.telegram.ui.ActionBar.l6.uj, -7616267);
        sparseIntArray.put(org.telegram.ui.ActionBar.l6.vj, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.l6.H8, -233499371);
        sparseIntArray.put(org.telegram.ui.ActionBar.l6.Jf, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.l6.B6, -8355712);
        sparseIntArray.put(org.telegram.ui.ActionBar.l6.f27838bh, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.l6.Tg, -14538189);
        sparseIntArray.put(org.telegram.ui.ActionBar.l6.A5, -14538189);
        sparseIntArray.put(org.telegram.ui.ActionBar.l6.Z8, -9316522);
        sparseIntArray.put(org.telegram.ui.ActionBar.l6.X8, -1446156);
        sparseIntArray.put(org.telegram.ui.ActionBar.l6.Zc, -2110438831);
        sparseIntArray.put(org.telegram.ui.ActionBar.l6.M6, -10263709);
        sparseIntArray.put(org.telegram.ui.ActionBar.l6.N6, -15033089);
        sparseIntArray.put(org.telegram.ui.ActionBar.l6.B5, -15033089);
        sparseIntArray.put(org.telegram.ui.ActionBar.l6.E5, -15033089);
        sparseIntArray.put(org.telegram.ui.ActionBar.l6.f28046n5, -15033089);
        sparseIntArray.put(org.telegram.ui.ActionBar.l6.kk, -832444);
        sparseIntArray.put(org.telegram.ui.ActionBar.l6.i7, -12692893);
        int i13 = org.telegram.ui.ActionBar.l6.f27975j7;
        sparseIntArray.put(i13, -10329502);
        sparseIntArray.put(org.telegram.ui.ActionBar.l6.C5, -1);
        sparseIntArray.put(i11, 436207615);
        sparseIntArray.put(org.telegram.ui.ActionBar.l6.Qi, -13816531);
        sparseIntArray.put(org.telegram.ui.ActionBar.l6.Ri, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.l6.Pi, -657931);
        sparseIntArray.put(org.telegram.ui.ActionBar.l6.J7, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.l6.Li, -8553091);
        sparseIntArray.put(org.telegram.ui.ActionBar.l6.Mi, -10177041);
        sparseIntArray.put(org.telegram.ui.ActionBar.l6.G8, -232841441);
        sparseIntArray.put(org.telegram.ui.ActionBar.l6.f28163t8, 385875967);
        sparseIntArray.put(org.telegram.ui.ActionBar.l6.f28031m7, -12500671);
        sparseIntArray.put(org.telegram.ui.ActionBar.l6.f28013l7, -13133079);
        sparseIntArray.put(org.telegram.ui.ActionBar.l6.f28048n7, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.l6.Ci, -15033089);
        sparseIntArray.put(org.telegram.ui.ActionBar.l6.f27993k5, -10177041);
        sparseIntArray.put(org.telegram.ui.ActionBar.l6.R5, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.l6.Uc, -12147733);
        sparseIntArray.put(org.telegram.ui.ActionBar.l6.f28104q5, -8553091);
        sparseIntArray.put(org.telegram.ui.ActionBar.l6.ij, -592138);
        sparseIntArray.put(org.telegram.ui.ActionBar.l6.kj, -14737633);
        sparseIntArray.put(org.telegram.ui.ActionBar.l6.lj, -12632257);
        sparseIntArray.put(org.telegram.ui.ActionBar.l6.jj, -8796932);
        sparseIntArray.put(org.telegram.ui.ActionBar.l6.xj, 1140850687);
        sparseIntArray.put(org.telegram.ui.ActionBar.l6.f28070ob, i0.a.f(0.4f, -16777216, -1));
        sparseIntArray.put(org.telegram.ui.ActionBar.l6.f28129rb, 0);
        sparseIntArray.put(org.telegram.ui.ActionBar.l6.f28147sb, 0);
        sparseIntArray.put(org.telegram.ui.ActionBar.l6.f28166tb, 0);
        sparseIntArray.put(org.telegram.ui.ActionBar.l6.Ae, i0.a.o(-1, 75));
        sparseIntArray.put(org.telegram.ui.ActionBar.l6.h7, -10177041);
        sparseIntArray.put(i13, -12237499);
        sparseIntArray.put(org.telegram.ui.ActionBar.l6.f27995k7, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.l6.K7, -10703370);
        sparseIntArray.put(org.telegram.ui.ActionBar.l6.L7, -12547121);
        sparseIntArray.put(org.telegram.ui.ActionBar.l6.Jl, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.l6.Hl, -1207959553);
        sparseIntArray.put(org.telegram.ui.ActionBar.l6.Il, 352321535);
        sparseIntArray.put(org.telegram.ui.ActionBar.l6.Gj, -8553091);
        sparseIntArray.put(org.telegram.ui.ActionBar.l6.Jj, -11292689);
        sparseIntArray.put(org.telegram.ui.ActionBar.l6.Hj, -12829636);
        sparseIntArray.put(org.telegram.ui.ActionBar.l6.Ij, -11184811);
        sparseIntArray.put(org.telegram.ui.ActionBar.l6.Nl, -15198183);
        k();
        paint.setColor(h(i12));
    }

    @Override
    public final boolean a() {
        return org.telegram.ui.ActionBar.l6.I.q();
    }

    @Override
    public final void b(float f10, float f11, int i7, int i10) {
        org.telegram.ui.ActionBar.l6.r(f10, f11, i7, i10);
    }

    @Override
    public final ColorFilter c() {
        if (this.f8823e == null) {
            this.f8823e = new PorterDuffColorFilter(h(org.telegram.ui.ActionBar.l6.G6), PorterDuff.Mode.SRC_IN);
        }
        return this.f8823e;
    }

    @Override
    public final Paint d(String str) {
        if (str.equals("paintDivider")) {
            return this.f8822c;
        }
        if (str.equals("paintChatActionBackground")) {
            if (this.d == null) {
                Paint paint = new Paint(1);
                this.d = paint;
                paint.setColor(i0.a.f(0.1f, -16777216, -1));
            }
            return this.d;
        }
        return org.telegram.ui.ActionBar.l6.V0(str);
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
            if (this.f8824f == null) {
                this.f8824f = new org.telegram.ui.ActionBar.t4(1, true, false, this);
            }
            return this.f8824f;
        }
        return null;
    }

    @Override
    public final int h(int i7) {
        SparseIntArray sparseIntArray = this.f8821b;
        int indexOfKey = sparseIntArray.indexOfKey(i7);
        if (indexOfKey >= 0) {
            return sparseIntArray.valueAt(indexOfKey);
        }
        Integer valueOf = Integer.valueOf(i7);
        HashSet hashSet = this.f8820a;
        if (!hashSet.contains(valueOf)) {
            hashSet.add(Integer.valueOf(i7));
        }
        return org.telegram.ui.ActionBar.l6.v0(i7);
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
