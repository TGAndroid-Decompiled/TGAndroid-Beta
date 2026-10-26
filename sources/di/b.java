package di;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import j$.util.Objects;
import java.util.HashSet;
public class b implements org.telegram.ui.ActionBar.u6 {
    public final HashSet f8408a = new HashSet();
    public final SparseIntArray f8409b;
    public final Paint f8410c;
    public Paint d;
    public PorterDuffColorFilter e;
    public org.telegram.ui.ActionBar.l5 f8411f;

    public b() {
        SparseIntArray sparseIntArray = new SparseIntArray();
        this.f8409b = sparseIntArray;
        Paint paint = new Paint();
        this.f8410c = paint;
        sparseIntArray.put(org.telegram.ui.ActionBar.y6.f23739xf, -1308622848);
        sparseIntArray.put(org.telegram.ui.ActionBar.y6.f23757yf, -1056964608);
        sparseIntArray.put(org.telegram.ui.ActionBar.y6.Yi, -1214008894);
        sparseIntArray.put(org.telegram.ui.ActionBar.y6.Zi, -1946157057);
        sparseIntArray.put(org.telegram.ui.ActionBar.y6.aj, 452984831);
        sparseIntArray.put(org.telegram.ui.ActionBar.y6.bj, -665229191);
        sparseIntArray.put(org.telegram.ui.ActionBar.y6.cj, -667862461);
        sparseIntArray.put(org.telegram.ui.ActionBar.y6.dj, -665229191);
        sparseIntArray.put(org.telegram.ui.ActionBar.y6.Oi, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.y6.J5, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.y6.f23598q7, -2406842);
        sparseIntArray.put(org.telegram.ui.ActionBar.y6.H5, -10177041);
        sparseIntArray.put(org.telegram.ui.ActionBar.y6.f23604qf, i0.a.f(0.2f, -16777216, -1));
        int i10 = org.telegram.ui.ActionBar.y6.P5;
        sparseIntArray.put(i10, i0.a.f(0.5f, -16777216, -1));
        sparseIntArray.put(org.telegram.ui.ActionBar.y6.Q5, i0.a.f(0.5f, -16777216, -1));
        int i11 = org.telegram.ui.ActionBar.y6.O5;
        sparseIntArray.put(i11, i0.a.o(-1, 17));
        sparseIntArray.put(org.telegram.ui.ActionBar.y6.E8, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.y6.F8, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.y6.f23581p7, -1152913);
        sparseIntArray.put(org.telegram.ui.ActionBar.y6.f23448i6, 385875967);
        int i12 = org.telegram.ui.ActionBar.y6.I5;
        sparseIntArray.put(i12, 436207615);
        sparseIntArray.put(org.telegram.ui.ActionBar.y6.Se, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.y6.f23309ai, -1711276033);
        sparseIntArray.put(org.telegram.ui.ActionBar.y6.H6, i0.a.f(0.5f, -16777216, -1));
        sparseIntArray.put(org.telegram.ui.ActionBar.y6.f23653t5, i0.a.f(0.5f, -16777216, -1));
        sparseIntArray.put(org.telegram.ui.ActionBar.y6.Ii, i0.a.f(0.2f, -16777216, -1));
        sparseIntArray.put(org.telegram.ui.ActionBar.y6.f23464j5, -592138);
        sparseIntArray.put(org.telegram.ui.ActionBar.y6.f23614r5, -8553091);
        sparseIntArray.put(org.telegram.ui.ActionBar.y6.f23692v6, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.y6.Te, 1946157055);
        sparseIntArray.put(org.telegram.ui.ActionBar.y6.Ve, 1946157055);
        sparseIntArray.put(org.telegram.ui.ActionBar.y6.f23700vf, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.y6.Mh, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.y6.f23636s8, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.y6.f23587pf, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.y6.Ie, i0.a.o(-1, 30));
        sparseIntArray.put(org.telegram.ui.ActionBar.y6.He, -14670806);
        sparseIntArray.put(org.telegram.ui.ActionBar.y6.f23750y8, -1);
        sparseIntArray.put(i10, i0.a.f(0.5f, -16777216, -1));
        sparseIntArray.put(i11, i0.a.o(-1, 17));
        sparseIntArray.put(org.telegram.ui.ActionBar.y6.f23748y6, i0.a.o(-1, 127));
        sparseIntArray.put(org.telegram.ui.ActionBar.y6.f23305ae, -14606046);
        sparseIntArray.put(org.telegram.ui.ActionBar.y6.Zd, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.y6.f23473jf, -1221292);
        sparseIntArray.put(org.telegram.ui.ActionBar.y6.f23365df, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.y6.f23493kf, -15033089);
        sparseIntArray.put(org.telegram.ui.ActionBar.y6.f23382ef, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.y6.f23549nf, 2030043135);
        sparseIntArray.put(org.telegram.ui.ActionBar.y6.f23529mf, -10638868);
        sparseIntArray.put(org.telegram.ui.ActionBar.y6.Wd, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.y6.Vd, org.telegram.ui.ActionBar.y6.o1(0.6f, -1));
        sparseIntArray.put(org.telegram.ui.ActionBar.y6.f23682uf, -1515107571);
        sparseIntArray.put(org.telegram.ui.ActionBar.y6.f23434hc, -5316609);
        sparseIntArray.put(org.telegram.ui.ActionBar.y6.Ud, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.y6.Xd, org.telegram.ui.ActionBar.y6.o1(0.9f, -1));
        sparseIntArray.put(org.telegram.ui.ActionBar.y6.Wk, org.telegram.ui.ActionBar.y6.o1(0.8f, -1));
        sparseIntArray.put(org.telegram.ui.ActionBar.y6.Sd, -14670806);
        sparseIntArray.put(org.telegram.ui.ActionBar.y6.f23427h5, -14737633);
        sparseIntArray.put(org.telegram.ui.ActionBar.y6.f23447i5, -16777216);
        sparseIntArray.put(org.telegram.ui.ActionBar.y6.M5, -15393241);
        sparseIntArray.put(org.telegram.ui.ActionBar.y6.f23356d6, -15198183);
        sparseIntArray.put(org.telegram.ui.ActionBar.y6.Yk, -15198183);
        sparseIntArray.put(org.telegram.ui.ActionBar.y6.cl, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.y6.G6, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.y6.Le, -8553090);
        sparseIntArray.put(org.telegram.ui.ActionBar.y6.f23428h6, -10177027);
        sparseIntArray.put(org.telegram.ui.ActionBar.y6.Pe, 181267199);
        sparseIntArray.put(org.telegram.ui.ActionBar.y6.Je, i0.a.o(-1, 125));
        sparseIntArray.put(org.telegram.ui.ActionBar.y6.Me, -2130706433);
        sparseIntArray.put(org.telegram.ui.ActionBar.y6.Ne, i0.a.o(-1, 125));
        sparseIntArray.put(org.telegram.ui.ActionBar.y6.Oe, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.y6.Qe, -10177041);
        sparseIntArray.put(org.telegram.ui.ActionBar.y6.Ke, i0.a.o(-16777216, 30));
        sparseIntArray.put(org.telegram.ui.ActionBar.y6.Re, i0.a.o(-1, 125));
        int i13 = org.telegram.ui.ActionBar.y6.f23357d7;
        sparseIntArray.put(i13, -16777216);
        sparseIntArray.put(org.telegram.ui.ActionBar.y6.zf, -15033089);
        sparseIntArray.put(org.telegram.ui.ActionBar.y6.U5, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.y6.f23376e7, -14079703);
        sparseIntArray.put(org.telegram.ui.ActionBar.y6.f7, -8158332);
        sparseIntArray.put(org.telegram.ui.ActionBar.y6.f23299a7, -16777216);
        sparseIntArray.put(org.telegram.ui.ActionBar.y6.L6, -15033089);
        sparseIntArray.put(org.telegram.ui.ActionBar.y6.f23502l6, -10177041);
        sparseIntArray.put(org.telegram.ui.ActionBar.y6.f23484k6, -10177041);
        sparseIntArray.put(org.telegram.ui.ActionBar.y6.A6, i0.a.f(0.3f, -1, -16777216));
        sparseIntArray.put(org.telegram.ui.ActionBar.y6.Fi, -14605274);
        sparseIntArray.put(org.telegram.ui.ActionBar.y6.Gi, -7616267);
        sparseIntArray.put(org.telegram.ui.ActionBar.y6.Hi, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.y6.H8, -233499371);
        sparseIntArray.put(org.telegram.ui.ActionBar.y6.Ue, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.y6.B6, -8355712);
        sparseIntArray.put(org.telegram.ui.ActionBar.y6.f23550ng, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.y6.f23402fg, -14538189);
        sparseIntArray.put(org.telegram.ui.ActionBar.y6.A5, -14538189);
        sparseIntArray.put(org.telegram.ui.ActionBar.y6.Z8, -9316522);
        sparseIntArray.put(org.telegram.ui.ActionBar.y6.X8, -1446156);
        sparseIntArray.put(org.telegram.ui.ActionBar.y6.f23508lc, -2110438831);
        sparseIntArray.put(org.telegram.ui.ActionBar.y6.M6, -10263709);
        sparseIntArray.put(org.telegram.ui.ActionBar.y6.N6, -15033089);
        sparseIntArray.put(org.telegram.ui.ActionBar.y6.B5, -15033089);
        sparseIntArray.put(org.telegram.ui.ActionBar.y6.E5, -15033089);
        sparseIntArray.put(org.telegram.ui.ActionBar.y6.f23539n5, -15033089);
        sparseIntArray.put(org.telegram.ui.ActionBar.y6.wj, -832444);
        sparseIntArray.put(org.telegram.ui.ActionBar.y6.f23449i7, -12692893);
        int i14 = org.telegram.ui.ActionBar.y6.f23466j7;
        sparseIntArray.put(i14, -10329502);
        sparseIntArray.put(org.telegram.ui.ActionBar.y6.C5, -1);
        sparseIntArray.put(i12, 436207615);
        sparseIntArray.put(org.telegram.ui.ActionBar.y6.f23349ci, -13816531);
        sparseIntArray.put(org.telegram.ui.ActionBar.y6.f23368di, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.y6.f23329bi, -657931);
        sparseIntArray.put(org.telegram.ui.ActionBar.y6.J7, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.y6.Xh, -8553091);
        sparseIntArray.put(org.telegram.ui.ActionBar.y6.Yh, -10177041);
        sparseIntArray.put(org.telegram.ui.ActionBar.y6.G8, -232841441);
        sparseIntArray.put(org.telegram.ui.ActionBar.y6.f23656t8, 385875967);
        sparseIntArray.put(org.telegram.ui.ActionBar.y6.f23521m7, -12500671);
        sparseIntArray.put(org.telegram.ui.ActionBar.y6.f23503l7, -13133079);
        sparseIntArray.put(org.telegram.ui.ActionBar.y6.f23541n7, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.y6.Oh, -15033089);
        sparseIntArray.put(org.telegram.ui.ActionBar.y6.f23483k5, -10177041);
        sparseIntArray.put(org.telegram.ui.ActionBar.y6.R5, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.y6.gc, -12147733);
        sparseIntArray.put(org.telegram.ui.ActionBar.y6.q5, -8553091);
        sparseIntArray.put(org.telegram.ui.ActionBar.y6.f23685ui, -592138);
        sparseIntArray.put(org.telegram.ui.ActionBar.y6.f23723wi, -14737633);
        sparseIntArray.put(org.telegram.ui.ActionBar.y6.xi, -12632257);
        sparseIntArray.put(org.telegram.ui.ActionBar.y6.f23703vi, -8796932);
        sparseIntArray.put(org.telegram.ui.ActionBar.y6.Ji, 1140850687);
        sparseIntArray.put(org.telegram.ui.ActionBar.y6.Aa, i0.a.f(0.4f, -16777216, -1));
        sparseIntArray.put(org.telegram.ui.ActionBar.y6.Da, 0);
        sparseIntArray.put(org.telegram.ui.ActionBar.y6.Ea, 0);
        sparseIntArray.put(org.telegram.ui.ActionBar.y6.Fa, 0);
        sparseIntArray.put(org.telegram.ui.ActionBar.y6.Md, i0.a.o(-1, 75));
        sparseIntArray.put(org.telegram.ui.ActionBar.y6.f23429h7, -10177041);
        sparseIntArray.put(i14, -12237499);
        sparseIntArray.put(org.telegram.ui.ActionBar.y6.f23485k7, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.y6.K7, -10703370);
        sparseIntArray.put(org.telegram.ui.ActionBar.y6.L7, -12547121);
        sparseIntArray.put(org.telegram.ui.ActionBar.y6.Vk, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.y6.Tk, -1207959553);
        sparseIntArray.put(org.telegram.ui.ActionBar.y6.Uk, 352321535);
        sparseIntArray.put(org.telegram.ui.ActionBar.y6.Si, -8553091);
        sparseIntArray.put(org.telegram.ui.ActionBar.y6.Vi, -11292689);
        sparseIntArray.put(org.telegram.ui.ActionBar.y6.Ti, -12829636);
        sparseIntArray.put(org.telegram.ui.ActionBar.y6.Ui, -11184811);
        sparseIntArray.put(org.telegram.ui.ActionBar.y6.Zk, -15198183);
        j();
        paint.setColor(g(i13));
    }

    @Override
    public final boolean a() {
        return org.telegram.ui.ActionBar.y6.I.q();
    }

    @Override
    public final void b(float f7, float f10, int i10, int i11) {
        org.telegram.ui.ActionBar.y6.q(f7, f10, i10, i11);
    }

    @Override
    public final ColorFilter c() {
        if (this.e == null) {
            this.e = new PorterDuffColorFilter(g(org.telegram.ui.ActionBar.y6.G6), PorterDuff.Mode.SRC_IN);
        }
        return this.e;
    }

    @Override
    public final Paint d(String str) {
        if (str.equals("paintDivider")) {
            return this.f8410c;
        }
        if (str.equals("paintChatActionBackground")) {
            if (this.d == null) {
                Paint paint = new Paint(1);
                this.d = paint;
                paint.setColor(i0.a.f(0.1f, -16777216, -1));
            }
            return this.d;
        }
        return org.telegram.ui.ActionBar.y6.U0(str);
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
        SparseIntArray sparseIntArray = this.f8409b;
        int indexOfKey = sparseIntArray.indexOfKey(i10);
        if (indexOfKey >= 0) {
            return sparseIntArray.valueAt(indexOfKey);
        }
        Integer valueOf = Integer.valueOf(i10);
        HashSet hashSet = this.f8408a;
        if (!hashSet.contains(valueOf)) {
            hashSet.add(Integer.valueOf(i10));
        }
        return org.telegram.ui.ActionBar.y6.x0(null, i10, false);
    }

    @Override
    public final Drawable getDrawable(String str) {
        if (Objects.equals(str, "drawableMsgOutMedia")) {
            if (this.f8411f == null) {
                this.f8411f = new org.telegram.ui.ActionBar.l5(1, true, false, this);
            }
            return this.f8411f;
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
