package fi;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import j$.util.Objects;
import java.util.HashSet;
import org.telegram.messenger.gz;
public class b implements org.telegram.ui.ActionBar.e6 {
    public final HashSet f11442a = new HashSet();
    public final SparseIntArray f11443b;
    public final Paint f11444c;
    public Paint d;
    public PorterDuffColorFilter f11445e;
    public org.telegram.ui.ActionBar.r4 f11446f;

    public b() {
        SparseIntArray sparseIntArray = new SparseIntArray();
        this.f11443b = sparseIntArray;
        Paint paint = new Paint();
        this.f11444c = paint;
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.f29059og, -1308622848);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.f29079pg, -1056964608);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Pj, -1214008894);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Qj, -1946157057);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Rj, 452984831);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Sj, -665229191);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Tj, -667862461);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Uj, -665229191);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Fj, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.J5, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.f29090q7, -2406842);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.H5, -10177041);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.hg, i0.a.f(0.2f, -16777216, -1));
        int i7 = org.telegram.ui.ActionBar.j6.P5;
        sparseIntArray.put(i7, i0.a.f(0.5f, -16777216, -1));
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Q5, i0.a.f(0.5f, -16777216, -1));
        int i10 = org.telegram.ui.ActionBar.j6.O5;
        sparseIntArray.put(i10, i0.a.o(-1, 17));
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.E8, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.F8, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.f29070p7, -1152913);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.f28941i6, 385875967);
        int i11 = org.telegram.ui.ActionBar.j6.I5;
        sparseIntArray.put(i11, 436207615);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Kf, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Ri, -1711276033);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.H6, i0.a.f(0.5f, -16777216, -1));
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.f29145t5, i0.a.f(0.5f, -16777216, -1));
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.zj, i0.a.f(0.2f, -16777216, -1));
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.f28957j5, -592138);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.f29107r5, -8553091);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.f29184v6, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Lf, 1946157055);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Nf, 1946157055);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.f29022mg, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Di, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.f29129s8, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.f28914gg, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Af, i0.a.o(-1, 30));
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.f29269zf, -14670806);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.f29243y8, -1);
        sparseIntArray.put(i7, i0.a.f(0.5f, -16777216, -1));
        sparseIntArray.put(i10, i0.a.o(-1, 17));
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.f29241y6, i0.a.o(-1, 127));
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Re, -14606046);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Qe, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.f28801ag, -1221292);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Vf, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.f28821bg, -15033089);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Wf, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.f28877eg, 2030043135);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.f28858dg, -10638868);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Ne, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Me, org.telegram.ui.ActionBar.j6.r1(0.6f, -1));
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.f29005lg, -1515107571);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Yc, -5316609);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Le, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Oe, org.telegram.ui.ActionBar.j6.r1(0.9f, -1));
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Nl, org.telegram.ui.ActionBar.j6.r1(0.8f, -1));
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Je, -14670806);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.f28922h5, -14737633);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.f28940i5, -16777216);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.M5, -15393241);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.f28849d6, -15198183);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Pl, -15198183);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Tl, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.G6, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Df, -8553090);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.f28923h6, -10177027);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Hf, 181267199);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Bf, i0.a.o(-1, 125));
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Ef, -2130706433);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Ff, i0.a.o(-1, 125));
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Gf, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.If, -10177041);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Cf, i0.a.o(-16777216, 30));
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Jf, i0.a.o(-1, 125));
        int i12 = org.telegram.ui.ActionBar.j6.f28850d7;
        sparseIntArray.put(i12, -16777216);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.f29098qg, -15033089);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.U5, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.f28869e7, -14079703);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.f28888f7, -8158332);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.f28792a7, -16777216);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.L6, -15033089);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.f28996l6, -10177041);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.f28978k6, -10177041);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.A6, i0.a.f(0.3f, -1, -16777216));
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.wj, -14605274);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.xj, -7616267);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.yj, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.H8, -233499371);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Mf, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.B6, -8355712);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.f28878eh, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Wg, -14538189);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.A5, -14538189);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Z8, -9316522);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.X8, -1446156);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.f28838cd, -2110438831);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.M6, -10263709);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.N6, -15033089);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.B5, -15033089);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.E5, -15033089);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.f29030n5, -15033089);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.nk, -832444);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.i7, -12692893);
        int i13 = org.telegram.ui.ActionBar.j6.f28959j7;
        sparseIntArray.put(i13, -10329502);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.C5, -1);
        sparseIntArray.put(i11, 436207615);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Ti, -13816531);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Ui, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Si, -657931);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.J7, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Oi, -8553091);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Pi, -10177041);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.G8, -232841441);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.f29147t8, 385875967);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.f29015m7, -12500671);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.f28997l7, -13133079);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.f29032n7, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Fi, -15033089);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.f28977k5, -10177041);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.R5, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Xc, -12147733);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.f29088q5, -8553091);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.lj, -592138);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.nj, -14737633);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.oj, -12632257);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.mj, -8796932);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Aj, 1140850687);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.f29113rb, i0.a.f(0.4f, -16777216, -1));
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.f29170ub, 0);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.f29189vb, 0);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.f29208wb, 0);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.De, i0.a.o(-1, 75));
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.h7, -10177041);
        sparseIntArray.put(i13, -12237499);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.f28979k7, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.K7, -10703370);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.L7, -12547121);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Ml, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Kl, -1207959553);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Ll, 352321535);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Jj, -8553091);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Mj, -11292689);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Kj, -12829636);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Lj, -11184811);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Ql, -15198183);
        k();
        paint.setColor(h(i12));
    }

    @Override
    public final boolean a() {
        return org.telegram.ui.ActionBar.j6.I.q();
    }

    @Override
    public final void b(float f10, float f11, int i7, int i10) {
        org.telegram.ui.ActionBar.j6.r(f10, f11, i7, i10);
    }

    @Override
    public final ColorFilter c() {
        if (this.f11445e == null) {
            this.f11445e = new PorterDuffColorFilter(h(org.telegram.ui.ActionBar.j6.G6), PorterDuff.Mode.SRC_IN);
        }
        return this.f11445e;
    }

    @Override
    public final Paint d(String str) {
        if (str.equals("paintDivider")) {
            return this.f11444c;
        }
        if (str.equals("paintChatActionBackground")) {
            if (this.d == null) {
                Paint paint = new Paint(1);
                this.d = paint;
                paint.setColor(i0.a.f(0.1f, -16777216, -1));
            }
            return this.d;
        }
        return org.telegram.ui.ActionBar.j6.V0(str);
    }

    @Override
    public final boolean e() {
        return gz.H0;
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
            if (this.f11446f == null) {
                this.f11446f = new org.telegram.ui.ActionBar.r4(1, true, false, this);
            }
            return this.f11446f;
        }
        return null;
    }

    @Override
    public final int h(int i7) {
        SparseIntArray sparseIntArray = this.f11443b;
        int indexOfKey = sparseIntArray.indexOfKey(i7);
        if (indexOfKey >= 0) {
            return sparseIntArray.valueAt(indexOfKey);
        }
        Integer valueOf = Integer.valueOf(i7);
        HashSet hashSet = this.f11442a;
        if (!hashSet.contains(valueOf)) {
            hashSet.add(Integer.valueOf(i7));
        }
        return org.telegram.ui.ActionBar.j6.v0(i7);
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
