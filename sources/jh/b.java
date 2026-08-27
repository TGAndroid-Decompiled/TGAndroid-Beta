package jh;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import j$.util.Objects;
import java.util.HashSet;

public class b implements org.telegram.ui.ActionBar.c6 {

    public final HashSet f13065a = new HashSet();

    public final SparseIntArray f13066b;

    public final Paint f13067c;
    public Paint d;

    public PorterDuffColorFilter f13068e;

    public org.telegram.ui.ActionBar.d5 f13069f;

    public b() {
        SparseIntArray sparseIntArray = new SparseIntArray();
        this.f13066b = sparseIntArray;
        Paint paint = new Paint();
        this.f13067c = paint;
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.f23414xf, -1308622848);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.f23432yf, -1056964608);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.Yi, -1214008894);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.Zi, -1946157057);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.aj, 452984831);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.bj, -665229191);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.cj, -667862461);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.dj, -665229191);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.Oi, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.J5, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.f23284q7, -2406842);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.H5, -10177041);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.f23291qf, i0.b.d(0.2f, -16777216, -1));
        int i10 = org.telegram.ui.ActionBar.g6.P5;
        sparseIntArray.put(i10, i0.b.d(0.5f, -16777216, -1));
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.Q5, i0.b.d(0.5f, -16777216, -1));
        int i11 = org.telegram.ui.ActionBar.g6.O5;
        sparseIntArray.put(i11, i0.b.k(-1, 17));
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.E8, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.F8, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.f23269p7, -1152913);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.f23144i6, 385875967);
        int i12 = org.telegram.ui.ActionBar.g6.I5;
        sparseIntArray.put(i12, 436207615);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.Se, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.ai, -1711276033);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.H6, i0.b.d(0.5f, -16777216, -1));
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.f23338t5, i0.b.d(0.5f, -16777216, -1));
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.Ii, i0.b.d(0.2f, -16777216, -1));
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.f23161j5, -592138);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.f23300r5, -8553091);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.f23373v6, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.Te, 1946157055);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.Ve, 1946157055);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.f23382vf, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.Mh, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.f23322s8, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.f23274pf, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.Ie, i0.b.k(-1, 30));
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.He, -14670806);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.f23425y8, -1);
        sparseIntArray.put(i10, i0.b.d(0.5f, -16777216, -1));
        sparseIntArray.put(i11, i0.b.k(-1, 17));
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.f23423y6, i0.b.k(-1, 127));
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.f23006ae, -14606046);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.Zd, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.f23171jf, -1221292);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.f23062df, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.f23189kf, -15033089);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.f23080ef, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.nf, 2030043135);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.f23224mf, -10638868);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.Wd, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.Vd, org.telegram.ui.ActionBar.g6.l1(0.6f, -1));
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.f23366uf, -1515107571);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.f23131hc, -5316609);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.Ud, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.Xd, org.telegram.ui.ActionBar.g6.l1(0.9f, -1));
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.Wk, org.telegram.ui.ActionBar.g6.l1(0.8f, -1));
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.Sd, -14670806);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.f23124h5, -14737633);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.f23143i5, -16777216);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.M5, -15393241);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.f23053d6, -15198183);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.G6, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.Le, -8553090);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.f23125h6, -10177027);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.Pe, 181267199);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.Je, i0.b.k(-1, 125));
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.Me, -2130706433);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.Ne, i0.b.k(-1, 125));
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.Oe, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.Qe, -10177041);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.Ke, i0.b.k(-16777216, 30));
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.Re, i0.b.k(-1, 125));
        int i13 = org.telegram.ui.ActionBar.g6.f23054d7;
        sparseIntArray.put(i13, -16777216);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.f23449zf, -15033089);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.U5, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.f23073e7, -14079703);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.f23091f7, -8158332);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.f22999a7, -16777216);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.L6, -15033089);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.f23198l6, -10177041);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.f23181k6, -10177041);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.A6, i0.b.d(0.3f, -1, -16777216));
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.Fi, -14605274);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.Gi, -7616267);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.Hi, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.H8, -233499371);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.Ue, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.B6, -8355712);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.f23242ng, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.f23099fg, -14538189);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.A5, -14538189);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.Z8, -9316522);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.X8, -1446156);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.f23203lc, -2110438831);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.M6, -10263709);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.N6, -15033089);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.B5, -15033089);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.E5, -15033089);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.f23233n5, -15033089);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.wj, -832444);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.f23145i7, -12692893);
        int i14 = org.telegram.ui.ActionBar.g6.f23163j7;
        sparseIntArray.put(i14, -10329502);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.C5, -1);
        sparseIntArray.put(i12, 436207615);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.ci, -13816531);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.di, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.bi, -657931);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.J7, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.Xh, -8553091);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.Yh, -10177041);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.G8, -232841441);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.f23341t8, 385875967);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.f23216m7, -12500671);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.f23199l7, -13133079);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.f23235n7, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.Oh, -15033089);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.f23180k5, -10177041);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.R5, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.gc, -12147733);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.f23283q5, -8553091);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.ui, -592138);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.wi, -14737633);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.xi, -12632257);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.vi, -8796932);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.Ji, 1140850687);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.Aa, i0.b.d(0.4f, -16777216, -1));
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.Da, 0);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.Ea, 0);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.Fa, 0);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.Md, i0.b.k(-1, 75));
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.f23126h7, -10177041);
        sparseIntArray.put(i14, -12237499);
        sparseIntArray.put(org.telegram.ui.ActionBar.g6.f23182k7, -1);
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
        paint.setColor(N0(i13));
    }

    @Override
    public final ColorFilter F() {
        if (this.f13068e == null) {
            this.f13068e = new PorterDuffColorFilter(N0(org.telegram.ui.ActionBar.g6.G6), PorterDuff.Mode.SRC_IN);
        }
        return this.f13068e;
    }

    @Override
    public final Paint N(String str) {
        if (str.equals("paintDivider")) {
            return this.f13067c;
        }
        if (!str.equals("paintChatActionBackground")) {
            return org.telegram.ui.ActionBar.g6.S0(str);
        }
        if (this.d == null) {
            Paint paint = new Paint(1);
            this.d = paint;
            paint.setColor(i0.b.d(0.1f, -16777216, -1));
        }
        return this.d;
    }

    @Override
    public final int N0(int i10) {
        SparseIntArray sparseIntArray = this.f13066b;
        int iIndexOfKey = sparseIntArray.indexOfKey(i10);
        if (iIndexOfKey >= 0) {
            return sparseIntArray.valueAt(iIndexOfKey);
        }
        Integer numValueOf = Integer.valueOf(i10);
        HashSet hashSet = this.f13065a;
        if (!hashSet.contains(numValueOf)) {
            hashSet.add(Integer.valueOf(i10));
        }
        return org.telegram.ui.ActionBar.g6.w0(null, i10, false);
    }

    @Override
    public final boolean a() {
        return org.telegram.ui.ActionBar.g6.I.q();
    }

    @Override
    public final Drawable getDrawable(String str) {
        if (!Objects.equals(str, "drawableMsgOutMedia")) {
            return null;
        }
        if (this.f13069f == null) {
            this.f13069f = new org.telegram.ui.ActionBar.d5(1, true, false, this);
        }
        return this.f13069f;
    }

    @Override
    public final void m(float f10, float f11, int i10, int i11) {
        org.telegram.ui.ActionBar.g6.q(f10, f11, i10, i11);
    }

    @Override
    public final int o1(int i10) {
        return N0(i10);
    }

    @Override
    public final int q0(int i10) {
        return N0(i10);
    }

    @Override
    public final boolean u0() {
        return false;
    }

    public void b() {
    }

    @Override
    public final void c1(int i10, int i11) {
    }
}
