package ci;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import j$.util.Objects;
import java.util.HashSet;
public class b implements org.telegram.ui.ActionBar.g6 {
    public final HashSet f5160a = new HashSet();
    public final SparseIntArray f5161b;
    public final Paint f5162c;
    public Paint d;
    public PorterDuffColorFilter e;
    public org.telegram.ui.ActionBar.j5 f5163f;

    public b() {
        SparseIntArray sparseIntArray = new SparseIntArray();
        this.f5161b = sparseIntArray;
        Paint paint = new Paint();
        this.f5162c = paint;
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.f21562xf, -1308622848);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.yf, -1056964608);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.Yi, -1214008894);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.Zi, -1946157057);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.aj, 452984831);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.bj, -665229191);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.cj, -667862461);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.dj, -665229191);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.Oi, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.J5, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.f21421q7, -2406842);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.H5, -10177041);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.f21429qf, i0.a.f(0.2f, -16777216, -1));
        int i10 = org.telegram.ui.ActionBar.k6.P5;
        sparseIntArray.put(i10, i0.a.f(0.5f, -16777216, -1));
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.Q5, i0.a.f(0.5f, -16777216, -1));
        int i11 = org.telegram.ui.ActionBar.k6.O5;
        sparseIntArray.put(i11, i0.a.o(-1, 17));
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.E8, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.F8, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.f21404p7, -1152913);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.f21272i6, 385875967);
        int i12 = org.telegram.ui.ActionBar.k6.I5;
        sparseIntArray.put(i12, 436207615);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.Se, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.f21136ai, -1711276033);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.H6, i0.a.f(0.5f, -16777216, -1));
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.f21478t5, i0.a.f(0.5f, -16777216, -1));
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.Ii, i0.a.f(0.2f, -16777216, -1));
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.f21289j5, -592138);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.f21439r5, -8553091);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.f21516v6, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.Te, 1946157055);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.Ve, 1946157055);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.f21525vf, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.Mh, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.f21462s8, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.f21410pf, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.Ie, i0.a.o(-1, 30));
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.He, -14670806);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.f21573y8, -1);
        sparseIntArray.put(i10, i0.a.f(0.5f, -16777216, -1));
        sparseIntArray.put(i11, i0.a.o(-1, 17));
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.f21571y6, i0.a.o(-1, 127));
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.f21132ae, -14606046);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.Zd, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.f21299jf, -1221292);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.f21190df, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.kf, -15033089);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.f21208ef, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.f21375nf, 2030043135);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.f21355mf, -10638868);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.Wd, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.Vd, org.telegram.ui.ActionBar.k6.o1(0.6f, -1));
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.f21507uf, -1515107571);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.hc, -5316609);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.Ud, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.Xd, org.telegram.ui.ActionBar.k6.o1(0.9f, -1));
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.Wk, org.telegram.ui.ActionBar.k6.o1(0.8f, -1));
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.Sd, -14670806);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.f21254h5, -14737633);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.f21271i5, -16777216);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.M5, -15393241);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.f21183d6, -15198183);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.Yk, -15198183);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.cl, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.G6, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.Le, -8553090);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.f21255h6, -10177027);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.Pe, 181267199);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.Je, i0.a.o(-1, 125));
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.Me, -2130706433);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.Ne, i0.a.o(-1, 125));
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.Oe, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.Qe, -10177041);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.Ke, i0.a.o(-16777216, 30));
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.Re, i0.a.o(-1, 125));
        int i13 = org.telegram.ui.ActionBar.k6.f21184d7;
        sparseIntArray.put(i13, -16777216);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.f21596zf, -15033089);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.U5, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.e7, -14079703);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.f7, -8158332);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.f21125a7, -16777216);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.L6, -15033089);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.f21327l6, -10177041);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.f21310k6, -10177041);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.A6, i0.a.f(0.3f, -1, -16777216));
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.Fi, -14605274);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.Gi, -7616267);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.Hi, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.H8, -233499371);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.Ue, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.B6, -8355712);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.f21376ng, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.fg, -14538189);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.A5, -14538189);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.Z8, -9316522);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.X8, -1446156);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.f21333lc, -2110438831);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.M6, -10263709);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.N6, -15033089);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.B5, -15033089);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.E5, -15033089);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.f21365n5, -15033089);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.wj, -832444);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.f21273i7, -12692893);
        int i14 = org.telegram.ui.ActionBar.k6.f21291j7;
        sparseIntArray.put(i14, -10329502);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.C5, -1);
        sparseIntArray.put(i12, 436207615);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.f21176ci, -13816531);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.f21193di, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.f21156bi, -657931);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.J7, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.Xh, -8553091);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.Yh, -10177041);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.G8, -232841441);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.f21481t8, 385875967);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.f21347m7, -12500671);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.f21328l7, -13133079);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.f21367n7, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.Oh, -15033089);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.f21309k5, -10177041);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.R5, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.f21242gc, -12147733);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.f21420q5, -8553091);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.ui, -592138);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.wi, -14737633);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.xi, -12632257);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.vi, -8796932);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.Ji, 1140850687);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.Aa, i0.a.f(0.4f, -16777216, -1));
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.Da, 0);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.Ea, 0);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.Fa, 0);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.Md, i0.a.o(-1, 75));
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.f21256h7, -10177041);
        sparseIntArray.put(i14, -12237499);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.f21311k7, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.K7, -10703370);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.L7, -12547121);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.Vk, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.Tk, -1207959553);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.Uk, 352321535);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.Si, -8553091);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.Vi, -11292689);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.Ti, -12829636);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.Ui, -11184811);
        sparseIntArray.put(org.telegram.ui.ActionBar.k6.Zk, -15198183);
        j();
        paint.setColor(g(i13));
    }

    @Override
    public final boolean a() {
        return org.telegram.ui.ActionBar.k6.I.q();
    }

    @Override
    public final void b(float f7, float f10, int i10, int i11) {
        org.telegram.ui.ActionBar.k6.q(f7, f10, i10, i11);
    }

    @Override
    public final ColorFilter c() {
        if (this.e == null) {
            this.e = new PorterDuffColorFilter(g(org.telegram.ui.ActionBar.k6.G6), PorterDuff.Mode.SRC_IN);
        }
        return this.e;
    }

    @Override
    public final Paint d(String str) {
        if (str.equals("paintDivider")) {
            return this.f5162c;
        }
        if (str.equals("paintChatActionBackground")) {
            if (this.d == null) {
                Paint paint = new Paint(1);
                this.d = paint;
                paint.setColor(i0.a.f(0.1f, -16777216, -1));
            }
            return this.d;
        }
        return org.telegram.ui.ActionBar.k6.U0(str);
    }

    @Override
    public final int e(int i10) {
        return g(i10);
    }

    @Override
    public final boolean f() {
        return false;
    }

    @Override
    public final int g(int i10) {
        SparseIntArray sparseIntArray = this.f5161b;
        int indexOfKey = sparseIntArray.indexOfKey(i10);
        if (indexOfKey >= 0) {
            return sparseIntArray.valueAt(indexOfKey);
        }
        Integer valueOf = Integer.valueOf(i10);
        HashSet hashSet = this.f5160a;
        if (!hashSet.contains(valueOf)) {
            hashSet.add(Integer.valueOf(i10));
        }
        return org.telegram.ui.ActionBar.k6.x0(null, i10, false);
    }

    @Override
    public final Drawable getDrawable(String str) {
        if (Objects.equals(str, "drawableMsgOutMedia")) {
            if (this.f5163f == null) {
                this.f5163f = new org.telegram.ui.ActionBar.j5(1, true, false, this);
            }
            return this.f5163f;
        }
        return null;
    }

    @Override
    public final int i(int i10) {
        return g(i10);
    }

    public void j() {
    }

    @Override
    public final void h(int i10, int i11) {
    }
}
