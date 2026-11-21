package fi;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import j$.util.Objects;
import java.util.HashSet;
import org.telegram.messenger.bz;
public class b implements org.telegram.ui.ActionBar.h6 {
    public final HashSet f11783a = new HashSet();
    public final SparseIntArray f11784b;
    public final Paint f11785c;
    public Paint d;
    public PorterDuffColorFilter f11786e;
    public org.telegram.ui.ActionBar.u4 f11787f;

    public b() {
        SparseIntArray sparseIntArray = new SparseIntArray();
        this.f11784b = sparseIntArray;
        Paint paint = new Paint();
        this.f11785c = paint;
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.f29588og, -1308622848);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.f29608pg, -1056964608);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.Pj, -1214008894);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.Qj, -1946157057);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.Rj, 452984831);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.Sj, -665229191);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.Tj, -667862461);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.Uj, -665229191);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.Fj, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.J5, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.f29619q7, -2406842);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.H5, -10177041);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.hg, i0.a.f(0.2f, -16777216, -1));
        int i7 = org.telegram.ui.ActionBar.m6.P5;
        sparseIntArray.put(i7, i0.a.f(0.5f, -16777216, -1));
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.Q5, i0.a.f(0.5f, -16777216, -1));
        int i10 = org.telegram.ui.ActionBar.m6.O5;
        sparseIntArray.put(i10, i0.a.o(-1, 17));
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.E8, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.F8, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.f29599p7, -1152913);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.f29470i6, 385875967);
        int i11 = org.telegram.ui.ActionBar.m6.I5;
        sparseIntArray.put(i11, 436207615);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.Kf, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.Ri, -1711276033);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.H6, i0.a.f(0.5f, -16777216, -1));
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.f29674t5, i0.a.f(0.5f, -16777216, -1));
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.zj, i0.a.f(0.2f, -16777216, -1));
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.f29486j5, -592138);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.f29636r5, -8553091);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.f29713v6, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.Lf, 1946157055);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.Nf, 1946157055);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.f29551mg, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.Di, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.f29658s8, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.f29443gg, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.Af, i0.a.o(-1, 30));
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.f29798zf, -14670806);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.f29772y8, -1);
        sparseIntArray.put(i7, i0.a.f(0.5f, -16777216, -1));
        sparseIntArray.put(i10, i0.a.o(-1, 17));
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.f29770y6, i0.a.o(-1, 127));
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.Re, -14606046);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.Qe, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.f29330ag, -1221292);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.Vf, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.f29350bg, -15033089);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.Wf, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.f29406eg, 2030043135);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.f29387dg, -10638868);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.Ne, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.Me, org.telegram.ui.ActionBar.m6.r1(0.6f, -1));
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.f29534lg, -1515107571);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.Yc, -5316609);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.Le, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.Oe, org.telegram.ui.ActionBar.m6.r1(0.9f, -1));
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.Nl, org.telegram.ui.ActionBar.m6.r1(0.8f, -1));
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.Je, -14670806);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.f29451h5, -14737633);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.f29469i5, -16777216);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.M5, -15393241);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.f29378d6, -15198183);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.Pl, -15198183);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.Tl, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.G6, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.Df, -8553090);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.f29452h6, -10177027);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.Hf, 181267199);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.Bf, i0.a.o(-1, 125));
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.Ef, -2130706433);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.Ff, i0.a.o(-1, 125));
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.Gf, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.If, -10177041);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.Cf, i0.a.o(-16777216, 30));
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.Jf, i0.a.o(-1, 125));
        int i12 = org.telegram.ui.ActionBar.m6.f29379d7;
        sparseIntArray.put(i12, -16777216);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.f29627qg, -15033089);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.U5, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.f29398e7, -14079703);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.f29417f7, -8158332);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.f29321a7, -16777216);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.L6, -15033089);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.f29525l6, -10177041);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.f29507k6, -10177041);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.A6, i0.a.f(0.3f, -1, -16777216));
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.wj, -14605274);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.xj, -7616267);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.yj, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.H8, -233499371);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.Mf, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.B6, -8355712);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.f29407eh, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.Wg, -14538189);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.A5, -14538189);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.Z8, -9316522);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.X8, -1446156);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.f29367cd, -2110438831);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.M6, -10263709);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.N6, -15033089);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.B5, -15033089);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.E5, -15033089);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.f29559n5, -15033089);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.nk, -832444);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.i7, -12692893);
        int i13 = org.telegram.ui.ActionBar.m6.f29488j7;
        sparseIntArray.put(i13, -10329502);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.C5, -1);
        sparseIntArray.put(i11, 436207615);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.Ti, -13816531);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.Ui, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.Si, -657931);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.J7, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.Oi, -8553091);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.Pi, -10177041);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.G8, -232841441);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.f29676t8, 385875967);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.f29544m7, -12500671);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.f29526l7, -13133079);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.f29561n7, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.Fi, -15033089);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.f29506k5, -10177041);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.R5, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.Xc, -12147733);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.f29617q5, -8553091);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.lj, -592138);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.nj, -14737633);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.oj, -12632257);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.mj, -8796932);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.Aj, 1140850687);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.f29642rb, i0.a.f(0.4f, -16777216, -1));
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.f29699ub, 0);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.f29718vb, 0);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.f29737wb, 0);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.De, i0.a.o(-1, 75));
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.h7, -10177041);
        sparseIntArray.put(i13, -12237499);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.f29508k7, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.K7, -10703370);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.L7, -12547121);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.Ml, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.Kl, -1207959553);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.Ll, 352321535);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.Jj, -8553091);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.Mj, -11292689);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.Kj, -12829636);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.Lj, -11184811);
        sparseIntArray.put(org.telegram.ui.ActionBar.m6.Ql, -15198183);
        a();
        paint.setColor(k(i12));
    }

    @Override
    public final boolean d() {
        return org.telegram.ui.ActionBar.m6.I.q();
    }

    @Override
    public final void e(float f10, float f11, int i7, int i10) {
        org.telegram.ui.ActionBar.m6.r(f10, f11, i7, i10);
    }

    @Override
    public final ColorFilter f() {
        if (this.f11786e == null) {
            this.f11786e = new PorterDuffColorFilter(k(org.telegram.ui.ActionBar.m6.G6), PorterDuff.Mode.SRC_IN);
        }
        return this.f11786e;
    }

    @Override
    public final Paint g(String str) {
        if (str.equals("paintDivider")) {
            return this.f11785c;
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
    public final Drawable getDrawable(String str) {
        if (Objects.equals(str, "drawableMsgOutMedia")) {
            if (this.f11787f == null) {
                this.f11787f = new org.telegram.ui.ActionBar.u4(1, true, false, this);
            }
            return this.f11787f;
        }
        return null;
    }

    @Override
    public final boolean h() {
        return bz.H0;
    }

    @Override
    public final int i(int i7) {
        return k(i7);
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final int k(int i7) {
        SparseIntArray sparseIntArray = this.f11784b;
        int indexOfKey = sparseIntArray.indexOfKey(i7);
        if (indexOfKey >= 0) {
            return sparseIntArray.valueAt(indexOfKey);
        }
        Integer valueOf = Integer.valueOf(i7);
        HashSet hashSet = this.f11783a;
        if (!hashSet.contains(valueOf)) {
            hashSet.add(Integer.valueOf(i7));
        }
        return org.telegram.ui.ActionBar.m6.v0(i7);
    }

    @Override
    public final int m(int i7) {
        return k(i7);
    }

    public void a() {
    }

    @Override
    public final void l(int i7, int i10) {
    }
}
