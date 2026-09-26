package ai;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import j$.util.Objects;
import java.util.HashSet;
public class d implements org.telegram.ui.ActionBar.d6 {
    public final HashSet f684a = new HashSet();
    public final SparseIntArray f685b;
    public final Paint f686c;
    public Paint d;
    public PorterDuffColorFilter e;
    public org.telegram.ui.ActionBar.d5 f687f;

    public d() {
        SparseIntArray sparseIntArray = new SparseIntArray();
        this.f685b = sparseIntArray;
        Paint paint = new Paint();
        this.f686c = paint;
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.f19433xf, -1308622848);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.f19451yf, -1056964608);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.Yi, -1214008894);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.Zi, -1946157057);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.aj, 452984831);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.bj, -665229191);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.cj, -667862461);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.dj, -665229191);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.Oi, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.J5, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.f19298q7, -2406842);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.H5, -10177041);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.f19306qf, i0.a.d(0.2f, -16777216, -1));
        int i10 = org.telegram.ui.ActionBar.h6.P5;
        sparseIntArray.put(i10, i0.a.d(0.5f, -16777216, -1));
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.Q5, i0.a.d(0.5f, -16777216, -1));
        int i11 = org.telegram.ui.ActionBar.h6.O5;
        sparseIntArray.put(i11, i0.a.k(-1, 17));
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.E8, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.F8, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.f19279p7, -1152913);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.f19148i6, 385875967);
        int i12 = org.telegram.ui.ActionBar.h6.I5;
        sparseIntArray.put(i12, 436207615);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.Se, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.f19014ai, -1711276033);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.H6, i0.a.d(0.5f, -16777216, -1));
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.f19353t5, i0.a.d(0.5f, -16777216, -1));
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.Ii, i0.a.d(0.2f, -16777216, -1));
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.f19165j5, -592138);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.f19315r5, -8553091);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.f19390v6, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.Te, 1946157055);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.Ve, 1946157055);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.f19398vf, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.Mh, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.f19337s8, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.f19287pf, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.Ie, i0.a.k(-1, 30));
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.He, -14670806);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.f19444y8, -1);
        sparseIntArray.put(i10, i0.a.d(0.5f, -16777216, -1));
        sparseIntArray.put(i11, i0.a.k(-1, 17));
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.f19442y6, i0.a.k(-1, 127));
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.f19010ae, -14606046);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.Zd, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.f19175jf, -1221292);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.f19068df, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.f19195kf, -15033089);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.f19085ef, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.f19249nf, 2030043135);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.f19232mf, -10638868);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.Wd, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.Vd, org.telegram.ui.ActionBar.h6.l1(0.6f, -1));
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.f19381uf, -1515107571);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.f19135hc, -5316609);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.Ud, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.Xd, org.telegram.ui.ActionBar.h6.l1(0.9f, -1));
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.Wk, org.telegram.ui.ActionBar.h6.l1(0.8f, -1));
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.Sd, -14670806);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.f19129h5, -14737633);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.f19147i5, -16777216);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.M5, -15393241);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.f19059d6, -15198183);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.Yk, -15198183);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.cl, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.G6, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.Le, -8553090);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.f19130h6, -10177027);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.Pe, 181267199);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.Je, i0.a.k(-1, 125));
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.Me, -2130706433);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.Ne, i0.a.k(-1, 125));
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.Oe, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.Qe, -10177041);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.Ke, i0.a.k(-16777216, 30));
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.Re, i0.a.k(-1, 125));
        int i13 = org.telegram.ui.ActionBar.h6.f19060d7;
        sparseIntArray.put(i13, -16777216);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.f19470zf, -15033089);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.U5, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.e7, -14079703);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.f7, -8158332);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.f19003a7, -16777216);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.L6, -15033089);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.f19204l6, -10177041);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.f19186k6, -10177041);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.A6, i0.a.d(0.3f, -1, -16777216));
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.Fi, -14605274);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.Gi, -7616267);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.Hi, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.H8, -233499371);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.Ue, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.B6, -8355712);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.f19250ng, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.f19103fg, -14538189);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.A5, -14538189);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.Z8, -9316522);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.X8, -1446156);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.f19210lc, -2110438831);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.M6, -10263709);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.N6, -15033089);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.B5, -15033089);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.E5, -15033089);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.f19242n5, -15033089);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.wj, -832444);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.f19149i7, -12692893);
        int i14 = org.telegram.ui.ActionBar.h6.f19167j7;
        sparseIntArray.put(i14, -10329502);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.C5, -1);
        sparseIntArray.put(i12, 436207615);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.f19052ci, -13816531);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.f19071di, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.f19033bi, -657931);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.J7, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.Xh, -8553091);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.Yh, -10177041);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.G8, -232841441);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.f19356t8, 385875967);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.f19224m7, -12500671);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.f19205l7, -13133079);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.f19244n7, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.Oh, -15033089);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.f19185k5, -10177041);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.R5, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.gc, -12147733);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.f19297q5, -8553091);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.ui, -592138);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.wi, -14737633);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.xi, -12632257);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.vi, -8796932);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.Ji, 1140850687);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.Aa, i0.a.d(0.4f, -16777216, -1));
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.Da, 0);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.Ea, 0);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.Fa, 0);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.Md, i0.a.k(-1, 75));
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.f19131h7, -10177041);
        sparseIntArray.put(i14, -12237499);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.f19187k7, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.K7, -10703370);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.L7, -12547121);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.Vk, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.Tk, -1207959553);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.Uk, 352321535);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.Si, -8553091);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.Vi, -11292689);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.Ti, -12829636);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.Ui, -11184811);
        sparseIntArray.put(org.telegram.ui.ActionBar.h6.Zk, -15198183);
        b();
        paint.setColor(G0(i13));
    }

    @Override
    public final Paint G(String str) {
        if (str.equals("paintDivider")) {
            return this.f686c;
        }
        if (str.equals("paintChatActionBackground")) {
            if (this.d == null) {
                Paint paint = new Paint(1);
                this.d = paint;
                paint.setColor(i0.a.d(0.1f, -16777216, -1));
            }
            return this.d;
        }
        return org.telegram.ui.ActionBar.h6.S0(str);
    }

    @Override
    public final int G0(int i10) {
        SparseIntArray sparseIntArray = this.f685b;
        int indexOfKey = sparseIntArray.indexOfKey(i10);
        if (indexOfKey >= 0) {
            return sparseIntArray.valueAt(indexOfKey);
        }
        Integer valueOf = Integer.valueOf(i10);
        HashSet hashSet = this.f684a;
        if (!hashSet.contains(valueOf)) {
            hashSet.add(Integer.valueOf(i10));
        }
        return org.telegram.ui.ActionBar.h6.w0(null, i10, false);
    }

    @Override
    public final boolean a() {
        return org.telegram.ui.ActionBar.h6.I.q();
    }

    @Override
    public final int g0(int i10) {
        return G0(i10);
    }

    @Override
    public final int g1(int i10) {
        return G0(i10);
    }

    @Override
    public final Drawable getDrawable(String str) {
        if (Objects.equals(str, "drawableMsgOutMedia")) {
            if (this.f687f == null) {
                this.f687f = new org.telegram.ui.ActionBar.d5(1, true, false, this);
            }
            return this.f687f;
        }
        return null;
    }

    @Override
    public final void m(float f7, float f10, int i10, int i11) {
        org.telegram.ui.ActionBar.h6.q(f7, f10, i10, i11);
    }

    @Override
    public final boolean p0() {
        return false;
    }

    @Override
    public final ColorFilter x() {
        if (this.e == null) {
            this.e = new PorterDuffColorFilter(G0(org.telegram.ui.ActionBar.h6.G6), PorterDuff.Mode.SRC_IN);
        }
        return this.e;
    }

    public void b() {
    }

    @Override
    public final void L0(int i10, int i11) {
    }
}
