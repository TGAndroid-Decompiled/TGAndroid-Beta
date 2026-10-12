package bi;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import j$.util.Objects;
import java.util.HashSet;
public class b implements org.telegram.ui.ActionBar.c6 {
    public final HashSet f2844a = new HashSet();
    public final SparseIntArray f2845b;
    public final Paint f2846c;
    public Paint d;
    public PorterDuffColorFilter e;
    public org.telegram.ui.ActionBar.d5 f2847f;

    public b() {
        SparseIntArray sparseIntArray = new SparseIntArray();
        this.f2845b = sparseIntArray;
        Paint paint = new Paint();
        this.f2846c = paint;
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.f20279xf, -1308622848);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.yf, -1056964608);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.Yi, -1214008894);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.Zi, -1946157057);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.aj, 452984831);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.bj, -665229191);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.cj, -667862461);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.dj, -665229191);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.Oi, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.J5, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.f20139q7, -2406842);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.H5, -10177041);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.f20147qf, i0.a.d(0.2f, -16777216, -1));
        int i10 = org.telegram.ui.ActionBar.g6.P5;
        sparseIntArray.put(i10, i0.a.d(0.5f, -16777216, -1));
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.Q5, i0.a.d(0.5f, -16777216, -1));
        int i11 = org.telegram.ui.ActionBar.g6.O5;
        sparseIntArray.put(i11, i0.a.k(-1, 17));
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.E8, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.F8, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.f20122p7, -1152913);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.f19990i6, 385875967);
        int i12 = org.telegram.ui.ActionBar.g6.I5;
        sparseIntArray.put(i12, 436207615);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.Se, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.f19854ai, -1711276033);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.H6, i0.a.d(0.5f, -16777216, -1));
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.f20196t5, i0.a.d(0.5f, -16777216, -1));
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.Ii, i0.a.d(0.2f, -16777216, -1));
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.f20007j5, -592138);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.f20157r5, -8553091);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.f20233v6, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.Te, 1946157055);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.Ve, 1946157055);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.f20242vf, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.Mh, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.f20180s8, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.f20128pf, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.Ie, i0.a.k(-1, 30));
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.He, -14670806);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.f20290y8, -1);
        sparseIntArray.put(i10, i0.a.d(0.5f, -16777216, -1));
        sparseIntArray.put(i11, i0.a.k(-1, 17));
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.f20288y6, i0.a.k(-1, 127));
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.f19850ae, -14606046);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.Zd, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.f20017jf, -1221292);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.f19908df, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.kf, -15033089);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.f19926ef, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.f20093nf, 2030043135);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.f20073mf, -10638868);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.Wd, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.Vd, org.telegram.ui.ActionBar.g6.m1(0.6f, -1));
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.f20224uf, -1515107571);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.hc, -5316609);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.Ud, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.Xd, org.telegram.ui.ActionBar.g6.m1(0.9f, -1));
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.Wk, org.telegram.ui.ActionBar.g6.m1(0.8f, -1));
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.Sd, -14670806);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.f19972h5, -14737633);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.f19989i5, -16777216);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.M5, -15393241);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.f19901d6, -15198183);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.Yk, -15198183);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.cl, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.G6, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.Le, -8553090);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.f19973h6, -10177027);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.Pe, 181267199);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.Je, i0.a.k(-1, 125));
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.Me, -2130706433);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.Ne, i0.a.k(-1, 125));
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.Oe, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.Qe, -10177041);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.Ke, i0.a.k(-16777216, 30));
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.Re, i0.a.k(-1, 125));
        int i13 = org.telegram.ui.ActionBar.g6.f19902d7;
        sparseIntArray.put(i13, -16777216);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.f20313zf, -15033089);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.U5, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.e7, -14079703);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.f7, -8158332);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.f19843a7, -16777216);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.L6, -15033089);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.f20045l6, -10177041);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.f20028k6, -10177041);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.A6, i0.a.d(0.3f, -1, -16777216));
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.Fi, -14605274);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.Gi, -7616267);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.Hi, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.H8, -233499371);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.Ue, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.B6, -8355712);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.f20094ng, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.fg, -14538189);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.A5, -14538189);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.Z8, -9316522);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.X8, -1446156);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.f20051lc, -2110438831);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.M6, -10263709);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.N6, -15033089);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.B5, -15033089);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.E5, -15033089);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.f20083n5, -15033089);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.wj, -832444);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.f19991i7, -12692893);
        int i14 = org.telegram.ui.ActionBar.g6.f20009j7;
        sparseIntArray.put(i14, -10329502);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.C5, -1);
        sparseIntArray.put(i12, 436207615);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.f19894ci, -13816531);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.f19911di, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.f19874bi, -657931);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.J7, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.Xh, -8553091);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.Yh, -10177041);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.G8, -232841441);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.f20199t8, 385875967);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.f20065m7, -12500671);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.f20046l7, -13133079);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.f20085n7, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.Oh, -15033089);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.f20027k5, -10177041);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.R5, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.f19960gc, -12147733);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.f20138q5, -8553091);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.ui, -592138);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.wi, -14737633);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.xi, -12632257);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.vi, -8796932);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.Ji, 1140850687);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.Aa, i0.a.d(0.4f, -16777216, -1));
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.Da, 0);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.Ea, 0);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.Fa, 0);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.Md, i0.a.k(-1, 75));
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.f19974h7, -10177041);
        sparseIntArray.put(i14, -12237499);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.f20029k7, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.K7, -10703370);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.L7, -12547121);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.Vk, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.Tk, -1207959553);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.Uk, 352321535);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.Si, -8553091);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.Vi, -11292689);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.Ti, -12829636);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.Ui, -11184811);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.Zk, -15198183);
        b();
        paint.setColor(F0(i13));
    }

    @Override
    public final int F0(int i10) {
        SparseIntArray sparseIntArray = this.f2845b;
        int indexOfKey = sparseIntArray.indexOfKey(i10);
        if (indexOfKey >= 0) {
            return sparseIntArray.valueAt(indexOfKey);
        }
        Integer valueOf = Integer.valueOf(i10);
        HashSet hashSet = this.f2844a;
        if (!hashSet.contains(valueOf)) {
            hashSet.add(Integer.valueOf(i10));
        }
        return org.telegram.ui.ActionBar.g6.x0(null, i10, false);
    }

    @Override
    public final Paint G(String str) {
        if (str.equals("paintDivider")) {
            return this.f2846c;
        }
        if (str.equals("paintChatActionBackground")) {
            if (this.d == null) {
                Paint paint = new Paint(1);
                this.d = paint;
                paint.setColor(i0.a.d(0.1f, -16777216, -1));
            }
            return this.d;
        }
        return org.telegram.ui.ActionBar.g6.T0(str);
    }

    @Override
    public final boolean a() {
        return org.telegram.ui.ActionBar.g6.I.q();
    }

    @Override
    public final int b0(int i10) {
        return F0(i10);
    }

    @Override
    public final int g1(int i10) {
        return F0(i10);
    }

    @Override
    public final Drawable getDrawable(String str) {
        if (Objects.equals(str, "drawableMsgOutMedia")) {
            if (this.f2847f == null) {
                this.f2847f = new org.telegram.ui.ActionBar.d5(1, true, false, this);
            }
            return this.f2847f;
        }
        return null;
    }

    @Override
    public final void l(float f7, float f10, int i10, int i11) {
        org.telegram.ui.ActionBar.g6.q(f7, f10, i10, i11);
    }

    @Override
    public final boolean m0() {
        return false;
    }

    @Override
    public final ColorFilter x() {
        if (this.e == null) {
            this.e = new PorterDuffColorFilter(F0(org.telegram.ui.ActionBar.g6.G6), PorterDuff.Mode.SRC_IN);
        }
        return this.e;
    }

    public void b() {
    }

    @Override
    public final void N0(int i10, int i11) {
    }
}
