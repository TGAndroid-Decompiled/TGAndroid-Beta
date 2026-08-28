package ih;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import j$.util.Objects;
import java.util.HashSet;
public class b implements org.telegram.ui.ActionBar.b6 {
    public final HashSet f11244a = new HashSet();
    public final SparseIntArray f11245b;
    public final Paint f11246c;
    public Paint d;
    public PorterDuffColorFilter f11247e;
    public org.telegram.ui.ActionBar.d5 f11248f;

    public b() {
        SparseIntArray sparseIntArray = new SparseIntArray();
        this.f11245b = sparseIntArray;
        Paint paint = new Paint();
        this.f11246c = paint;
        sparseIntArray.put(org.telegram.ui.ActionBar.f6.f23360xf, -1308622848);
        sparseIntArray.put(org.telegram.ui.ActionBar.f6.f23377yf, -1056964608);
        sparseIntArray.put(org.telegram.ui.ActionBar.f6.Yi, -1214008894);
        sparseIntArray.put(org.telegram.ui.ActionBar.f6.Zi, -1946157057);
        sparseIntArray.put(org.telegram.ui.ActionBar.f6.aj, 452984831);
        sparseIntArray.put(org.telegram.ui.ActionBar.f6.bj, -665229191);
        sparseIntArray.put(org.telegram.ui.ActionBar.f6.cj, -667862461);
        sparseIntArray.put(org.telegram.ui.ActionBar.f6.dj, -665229191);
        sparseIntArray.put(org.telegram.ui.ActionBar.f6.Oi, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.f6.J5, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.f6.f23230q7, -2406842);
        sparseIntArray.put(org.telegram.ui.ActionBar.f6.H5, -10177041);
        sparseIntArray.put(org.telegram.ui.ActionBar.f6.f23238qf, i0.a.d(0.2f, -16777216, -1));
        int i9 = org.telegram.ui.ActionBar.f6.P5;
        sparseIntArray.put(i9, i0.a.d(0.5f, -16777216, -1));
        sparseIntArray.put(org.telegram.ui.ActionBar.f6.Q5, i0.a.d(0.5f, -16777216, -1));
        int i10 = org.telegram.ui.ActionBar.f6.O5;
        sparseIntArray.put(i10, i0.a.k(-1, 17));
        sparseIntArray.put(org.telegram.ui.ActionBar.f6.E8, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.f6.F8, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.f6.f23212p7, -1152913);
        sparseIntArray.put(org.telegram.ui.ActionBar.f6.f23092i6, 385875967);
        int i11 = org.telegram.ui.ActionBar.f6.I5;
        sparseIntArray.put(i11, 436207615);
        sparseIntArray.put(org.telegram.ui.ActionBar.f6.Se, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.f6.ai, -1711276033);
        sparseIntArray.put(org.telegram.ui.ActionBar.f6.H6, i0.a.d(0.5f, -16777216, -1));
        sparseIntArray.put(org.telegram.ui.ActionBar.f6.f23284t5, i0.a.d(0.5f, -16777216, -1));
        sparseIntArray.put(org.telegram.ui.ActionBar.f6.Ii, i0.a.d(0.2f, -16777216, -1));
        sparseIntArray.put(org.telegram.ui.ActionBar.f6.f23108j5, -592138);
        sparseIntArray.put(org.telegram.ui.ActionBar.f6.f23247r5, -8553091);
        sparseIntArray.put(org.telegram.ui.ActionBar.f6.f23319v6, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.f6.Te, 1946157055);
        sparseIntArray.put(org.telegram.ui.ActionBar.f6.Ve, 1946157055);
        sparseIntArray.put(org.telegram.ui.ActionBar.f6.f23325vf, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.f6.Mh, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.f6.f23269s8, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.f6.f23219pf, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.f6.Ie, i0.a.k(-1, 30));
        sparseIntArray.put(org.telegram.ui.ActionBar.f6.He, -14670806);
        sparseIntArray.put(org.telegram.ui.ActionBar.f6.f23371y8, -1);
        sparseIntArray.put(i9, i0.a.d(0.5f, -16777216, -1));
        sparseIntArray.put(i10, i0.a.k(-1, 17));
        sparseIntArray.put(org.telegram.ui.ActionBar.f6.f23369y6, i0.a.k(-1, 127));
        sparseIntArray.put(org.telegram.ui.ActionBar.f6.f22954ae, -14606046);
        sparseIntArray.put(org.telegram.ui.ActionBar.f6.Zd, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.f6.f23117jf, -1221292);
        sparseIntArray.put(org.telegram.ui.ActionBar.f6.f23009df, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.f6.f23135kf, -15033089);
        sparseIntArray.put(org.telegram.ui.ActionBar.f6.f23027ef, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.f6.f23187nf, 2030043135);
        sparseIntArray.put(org.telegram.ui.ActionBar.f6.mf, -10638868);
        sparseIntArray.put(org.telegram.ui.ActionBar.f6.Wd, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.f6.Vd, org.telegram.ui.ActionBar.f6.l1(0.6f, -1));
        sparseIntArray.put(org.telegram.ui.ActionBar.f6.f23312uf, -1515107571);
        sparseIntArray.put(org.telegram.ui.ActionBar.f6.f23079hc, -5316609);
        sparseIntArray.put(org.telegram.ui.ActionBar.f6.Ud, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.f6.Xd, org.telegram.ui.ActionBar.f6.l1(0.9f, -1));
        sparseIntArray.put(org.telegram.ui.ActionBar.f6.Wk, org.telegram.ui.ActionBar.f6.l1(0.8f, -1));
        sparseIntArray.put(org.telegram.ui.ActionBar.f6.Sd, -14670806);
        sparseIntArray.put(org.telegram.ui.ActionBar.f6.f23072h5, -14737633);
        sparseIntArray.put(org.telegram.ui.ActionBar.f6.f23091i5, -16777216);
        sparseIntArray.put(org.telegram.ui.ActionBar.f6.M5, -15393241);
        sparseIntArray.put(org.telegram.ui.ActionBar.f6.f23001d6, -15198183);
        sparseIntArray.put(org.telegram.ui.ActionBar.f6.G6, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.f6.Le, -8553090);
        sparseIntArray.put(org.telegram.ui.ActionBar.f6.f23073h6, -10177027);
        sparseIntArray.put(org.telegram.ui.ActionBar.f6.Pe, 181267199);
        sparseIntArray.put(org.telegram.ui.ActionBar.f6.Je, i0.a.k(-1, 125));
        sparseIntArray.put(org.telegram.ui.ActionBar.f6.Me, -2130706433);
        sparseIntArray.put(org.telegram.ui.ActionBar.f6.Ne, i0.a.k(-1, 125));
        sparseIntArray.put(org.telegram.ui.ActionBar.f6.Oe, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.f6.Qe, -10177041);
        sparseIntArray.put(org.telegram.ui.ActionBar.f6.Ke, i0.a.k(-16777216, 30));
        sparseIntArray.put(org.telegram.ui.ActionBar.f6.Re, i0.a.k(-1, 125));
        int i12 = org.telegram.ui.ActionBar.f6.f23002d7;
        sparseIntArray.put(i12, -16777216);
        sparseIntArray.put(org.telegram.ui.ActionBar.f6.f23395zf, -15033089);
        sparseIntArray.put(org.telegram.ui.ActionBar.f6.U5, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.f6.f23020e7, -14079703);
        sparseIntArray.put(org.telegram.ui.ActionBar.f6.f23038f7, -8158332);
        sparseIntArray.put(org.telegram.ui.ActionBar.f6.f22947a7, -16777216);
        sparseIntArray.put(org.telegram.ui.ActionBar.f6.L6, -15033089);
        sparseIntArray.put(org.telegram.ui.ActionBar.f6.f23144l6, -10177041);
        sparseIntArray.put(org.telegram.ui.ActionBar.f6.f23127k6, -10177041);
        sparseIntArray.put(org.telegram.ui.ActionBar.f6.A6, i0.a.d(0.3f, -1, -16777216));
        sparseIntArray.put(org.telegram.ui.ActionBar.f6.Fi, -14605274);
        sparseIntArray.put(org.telegram.ui.ActionBar.f6.Gi, -7616267);
        sparseIntArray.put(org.telegram.ui.ActionBar.f6.Hi, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.f6.H8, -233499371);
        sparseIntArray.put(org.telegram.ui.ActionBar.f6.Ue, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.f6.B6, -8355712);
        sparseIntArray.put(org.telegram.ui.ActionBar.f6.f23188ng, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.f6.f23046fg, -14538189);
        sparseIntArray.put(org.telegram.ui.ActionBar.f6.A5, -14538189);
        sparseIntArray.put(org.telegram.ui.ActionBar.f6.Z8, -9316522);
        sparseIntArray.put(org.telegram.ui.ActionBar.f6.X8, -1446156);
        sparseIntArray.put(org.telegram.ui.ActionBar.f6.f23150lc, -2110438831);
        sparseIntArray.put(org.telegram.ui.ActionBar.f6.M6, -10263709);
        sparseIntArray.put(org.telegram.ui.ActionBar.f6.N6, -15033089);
        sparseIntArray.put(org.telegram.ui.ActionBar.f6.B5, -15033089);
        sparseIntArray.put(org.telegram.ui.ActionBar.f6.E5, -15033089);
        sparseIntArray.put(org.telegram.ui.ActionBar.f6.f23178n5, -15033089);
        sparseIntArray.put(org.telegram.ui.ActionBar.f6.wj, -832444);
        sparseIntArray.put(org.telegram.ui.ActionBar.f6.f23093i7, -12692893);
        int i13 = org.telegram.ui.ActionBar.f6.f23110j7;
        sparseIntArray.put(i13, -10329502);
        sparseIntArray.put(org.telegram.ui.ActionBar.f6.C5, -1);
        sparseIntArray.put(i11, 436207615);
        sparseIntArray.put(org.telegram.ui.ActionBar.f6.ci, -13816531);
        sparseIntArray.put(org.telegram.ui.ActionBar.f6.di, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.f6.bi, -657931);
        sparseIntArray.put(org.telegram.ui.ActionBar.f6.J7, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.f6.Xh, -8553091);
        sparseIntArray.put(org.telegram.ui.ActionBar.f6.Yh, -10177041);
        sparseIntArray.put(org.telegram.ui.ActionBar.f6.G8, -232841441);
        sparseIntArray.put(org.telegram.ui.ActionBar.f6.f23287t8, 385875967);
        sparseIntArray.put(org.telegram.ui.ActionBar.f6.f23163m7, -12500671);
        sparseIntArray.put(org.telegram.ui.ActionBar.f6.f23145l7, -13133079);
        sparseIntArray.put(org.telegram.ui.ActionBar.f6.f23180n7, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.f6.Oh, -15033089);
        sparseIntArray.put(org.telegram.ui.ActionBar.f6.f23126k5, -10177041);
        sparseIntArray.put(org.telegram.ui.ActionBar.f6.R5, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.f6.f23061gc, -12147733);
        sparseIntArray.put(org.telegram.ui.ActionBar.f6.f23228q5, -8553091);
        sparseIntArray.put(org.telegram.ui.ActionBar.f6.ui, -592138);
        sparseIntArray.put(org.telegram.ui.ActionBar.f6.wi, -14737633);
        sparseIntArray.put(org.telegram.ui.ActionBar.f6.xi, -12632257);
        sparseIntArray.put(org.telegram.ui.ActionBar.f6.vi, -8796932);
        sparseIntArray.put(org.telegram.ui.ActionBar.f6.Ji, 1140850687);
        sparseIntArray.put(org.telegram.ui.ActionBar.f6.Aa, i0.a.d(0.4f, -16777216, -1));
        sparseIntArray.put(org.telegram.ui.ActionBar.f6.Da, 0);
        sparseIntArray.put(org.telegram.ui.ActionBar.f6.Ea, 0);
        sparseIntArray.put(org.telegram.ui.ActionBar.f6.Fa, 0);
        sparseIntArray.put(org.telegram.ui.ActionBar.f6.Md, i0.a.k(-1, 75));
        sparseIntArray.put(org.telegram.ui.ActionBar.f6.f23074h7, -10177041);
        sparseIntArray.put(i13, -12237499);
        sparseIntArray.put(org.telegram.ui.ActionBar.f6.f23128k7, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.f6.K7, -10703370);
        sparseIntArray.put(org.telegram.ui.ActionBar.f6.L7, -12547121);
        sparseIntArray.put(org.telegram.ui.ActionBar.f6.Vk, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.f6.Tk, -1207959553);
        sparseIntArray.put(org.telegram.ui.ActionBar.f6.Uk, 352321535);
        sparseIntArray.put(org.telegram.ui.ActionBar.f6.Si, -8553091);
        sparseIntArray.put(org.telegram.ui.ActionBar.f6.Vi, -11292689);
        sparseIntArray.put(org.telegram.ui.ActionBar.f6.Ti, -12829636);
        sparseIntArray.put(org.telegram.ui.ActionBar.f6.Ui, -11184811);
        sparseIntArray.put(org.telegram.ui.ActionBar.f6.Zk, -15198183);
        b();
        paint.setColor(N0(i12));
    }

    @Override
    public final ColorFilter H() {
        if (this.f11247e == null) {
            this.f11247e = new PorterDuffColorFilter(N0(org.telegram.ui.ActionBar.f6.G6), PorterDuff.Mode.SRC_IN);
        }
        return this.f11247e;
    }

    @Override
    public final int N0(int i9) {
        SparseIntArray sparseIntArray = this.f11245b;
        int indexOfKey = sparseIntArray.indexOfKey(i9);
        if (indexOfKey >= 0) {
            return sparseIntArray.valueAt(indexOfKey);
        }
        Integer valueOf = Integer.valueOf(i9);
        HashSet hashSet = this.f11244a;
        if (!hashSet.contains(valueOf)) {
            hashSet.add(Integer.valueOf(i9));
        }
        return org.telegram.ui.ActionBar.f6.w0(null, i9, false);
    }

    @Override
    public final Paint O(String str) {
        if (str.equals("paintDivider")) {
            return this.f11246c;
        }
        if (str.equals("paintChatActionBackground")) {
            if (this.d == null) {
                Paint paint = new Paint(1);
                this.d = paint;
                paint.setColor(i0.a.d(0.1f, -16777216, -1));
            }
            return this.d;
        }
        return org.telegram.ui.ActionBar.f6.S0(str);
    }

    @Override
    public final boolean a() {
        return org.telegram.ui.ActionBar.f6.I.q();
    }

    @Override
    public final Drawable getDrawable(String str) {
        if (Objects.equals(str, "drawableMsgOutMedia")) {
            if (this.f11248f == null) {
                this.f11248f = new org.telegram.ui.ActionBar.d5(1, true, false, this);
            }
            return this.f11248f;
        }
        return null;
    }

    @Override
    public final void o(float f10, float f11, int i9, int i10) {
        org.telegram.ui.ActionBar.f6.q(f10, f11, i9, i10);
    }

    @Override
    public final int p0(int i9) {
        return N0(i9);
    }

    @Override
    public final int q1(int i9) {
        return N0(i9);
    }

    @Override
    public final boolean t0() {
        return false;
    }

    public void b() {
    }

    @Override
    public final void c1(int i9, int i10) {
    }
}
