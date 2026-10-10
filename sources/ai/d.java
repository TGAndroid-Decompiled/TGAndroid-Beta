package ai;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import j$.util.Objects;
import java.util.HashSet;
public class d implements org.telegram.ui.ActionBar.e6 {
    public final HashSet f795a = new HashSet();
    public final SparseIntArray f796b;
    public final Paint f797c;
    public Paint d;
    public PorterDuffColorFilter f798e;
    public org.telegram.ui.ActionBar.f5 f799f;

    public d() {
        SparseIntArray sparseIntArray = new SparseIntArray();
        this.f796b = sparseIntArray;
        Paint paint = new Paint();
        this.f797c = paint;
        sparseIntArray.put(org.telegram.ui.ActionBar.i6.xf, -1308622848);
        sparseIntArray.put(org.telegram.ui.ActionBar.i6.f21193yf, -1056964608);
        sparseIntArray.put(org.telegram.ui.ActionBar.i6.Yi, -1214008894);
        sparseIntArray.put(org.telegram.ui.ActionBar.i6.Zi, -1946157057);
        sparseIntArray.put(org.telegram.ui.ActionBar.i6.aj, 452984831);
        sparseIntArray.put(org.telegram.ui.ActionBar.i6.bj, -665229191);
        sparseIntArray.put(org.telegram.ui.ActionBar.i6.cj, -667862461);
        sparseIntArray.put(org.telegram.ui.ActionBar.i6.dj, -665229191);
        sparseIntArray.put(org.telegram.ui.ActionBar.i6.Oi, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.i6.J5, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.i6.f21041q7, -2406842);
        sparseIntArray.put(org.telegram.ui.ActionBar.i6.H5, -10177041);
        sparseIntArray.put(org.telegram.ui.ActionBar.i6.f21049qf, i0.a.d(0.2f, -16777216, -1));
        int i10 = org.telegram.ui.ActionBar.i6.P5;
        sparseIntArray.put(i10, i0.a.d(0.5f, -16777216, -1));
        sparseIntArray.put(org.telegram.ui.ActionBar.i6.Q5, i0.a.d(0.5f, -16777216, -1));
        int i11 = org.telegram.ui.ActionBar.i6.O5;
        sparseIntArray.put(i11, i0.a.k(-1, 17));
        sparseIntArray.put(org.telegram.ui.ActionBar.i6.E8, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.i6.F8, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.i6.f21022p7, -1152913);
        sparseIntArray.put(org.telegram.ui.ActionBar.i6.f20892i6, 385875967);
        int i12 = org.telegram.ui.ActionBar.i6.I5;
        sparseIntArray.put(i12, 436207615);
        sparseIntArray.put(org.telegram.ui.ActionBar.i6.Se, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.i6.f20756ai, -1711276033);
        sparseIntArray.put(org.telegram.ui.ActionBar.i6.H6, i0.a.d(0.5f, -16777216, -1));
        sparseIntArray.put(org.telegram.ui.ActionBar.i6.f21095t5, i0.a.d(0.5f, -16777216, -1));
        sparseIntArray.put(org.telegram.ui.ActionBar.i6.Ii, i0.a.d(0.2f, -16777216, -1));
        sparseIntArray.put(org.telegram.ui.ActionBar.i6.f20909j5, -592138);
        sparseIntArray.put(org.telegram.ui.ActionBar.i6.f21058r5, -8553091);
        sparseIntArray.put(org.telegram.ui.ActionBar.i6.f21132v6, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.i6.Te, 1946157055);
        sparseIntArray.put(org.telegram.ui.ActionBar.i6.Ve, 1946157055);
        sparseIntArray.put(org.telegram.ui.ActionBar.i6.f21140vf, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.i6.Mh, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.i6.f21079s8, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.i6.f21030pf, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.i6.Ie, i0.a.k(-1, 30));
        sparseIntArray.put(org.telegram.ui.ActionBar.i6.He, -14670806);
        sparseIntArray.put(org.telegram.ui.ActionBar.i6.f21187y8, -1);
        sparseIntArray.put(i10, i0.a.d(0.5f, -16777216, -1));
        sparseIntArray.put(i11, i0.a.k(-1, 17));
        sparseIntArray.put(org.telegram.ui.ActionBar.i6.f21185y6, i0.a.k(-1, 127));
        sparseIntArray.put(org.telegram.ui.ActionBar.i6.f20752ae, -14606046);
        sparseIntArray.put(org.telegram.ui.ActionBar.i6.Zd, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.i6.jf, -1221292);
        sparseIntArray.put(org.telegram.ui.ActionBar.i6.f20810df, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.i6.f20938kf, -15033089);
        sparseIntArray.put(org.telegram.ui.ActionBar.i6.f20828ef, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.i6.f20993nf, 2030043135);
        sparseIntArray.put(org.telegram.ui.ActionBar.i6.f20975mf, -10638868);
        sparseIntArray.put(org.telegram.ui.ActionBar.i6.Wd, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.i6.Vd, org.telegram.ui.ActionBar.i6.m1(0.6f, -1));
        sparseIntArray.put(org.telegram.ui.ActionBar.i6.f21123uf, -1515107571);
        sparseIntArray.put(org.telegram.ui.ActionBar.i6.f20878hc, -5316609);
        sparseIntArray.put(org.telegram.ui.ActionBar.i6.Ud, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.i6.Xd, org.telegram.ui.ActionBar.i6.m1(0.9f, -1));
        sparseIntArray.put(org.telegram.ui.ActionBar.i6.Wk, org.telegram.ui.ActionBar.i6.m1(0.8f, -1));
        sparseIntArray.put(org.telegram.ui.ActionBar.i6.Sd, -14670806);
        sparseIntArray.put(org.telegram.ui.ActionBar.i6.f20872h5, -14737633);
        sparseIntArray.put(org.telegram.ui.ActionBar.i6.f20891i5, -16777216);
        sparseIntArray.put(org.telegram.ui.ActionBar.i6.M5, -15393241);
        sparseIntArray.put(org.telegram.ui.ActionBar.i6.f20801d6, -15198183);
        sparseIntArray.put(org.telegram.ui.ActionBar.i6.Yk, -15198183);
        sparseIntArray.put(org.telegram.ui.ActionBar.i6.cl, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.i6.G6, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.i6.Le, -8553090);
        sparseIntArray.put(org.telegram.ui.ActionBar.i6.f20873h6, -10177027);
        sparseIntArray.put(org.telegram.ui.ActionBar.i6.Pe, 181267199);
        sparseIntArray.put(org.telegram.ui.ActionBar.i6.Je, i0.a.k(-1, 125));
        sparseIntArray.put(org.telegram.ui.ActionBar.i6.Me, -2130706433);
        sparseIntArray.put(org.telegram.ui.ActionBar.i6.Ne, i0.a.k(-1, 125));
        sparseIntArray.put(org.telegram.ui.ActionBar.i6.Oe, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.i6.Qe, -10177041);
        sparseIntArray.put(org.telegram.ui.ActionBar.i6.Ke, i0.a.k(-16777216, 30));
        sparseIntArray.put(org.telegram.ui.ActionBar.i6.Re, i0.a.k(-1, 125));
        int i13 = org.telegram.ui.ActionBar.i6.f20802d7;
        sparseIntArray.put(i13, -16777216);
        sparseIntArray.put(org.telegram.ui.ActionBar.i6.f21212zf, -15033089);
        sparseIntArray.put(org.telegram.ui.ActionBar.i6.U5, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.i6.e7, -14079703);
        sparseIntArray.put(org.telegram.ui.ActionBar.i6.f7, -8158332);
        sparseIntArray.put(org.telegram.ui.ActionBar.i6.f20745a7, -16777216);
        sparseIntArray.put(org.telegram.ui.ActionBar.i6.L6, -15033089);
        sparseIntArray.put(org.telegram.ui.ActionBar.i6.f20947l6, -10177041);
        sparseIntArray.put(org.telegram.ui.ActionBar.i6.f20929k6, -10177041);
        sparseIntArray.put(org.telegram.ui.ActionBar.i6.A6, i0.a.d(0.3f, -1, -16777216));
        sparseIntArray.put(org.telegram.ui.ActionBar.i6.Fi, -14605274);
        sparseIntArray.put(org.telegram.ui.ActionBar.i6.Gi, -7616267);
        sparseIntArray.put(org.telegram.ui.ActionBar.i6.Hi, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.i6.H8, -233499371);
        sparseIntArray.put(org.telegram.ui.ActionBar.i6.Ue, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.i6.B6, -8355712);
        sparseIntArray.put(org.telegram.ui.ActionBar.i6.f20994ng, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.i6.f20847fg, -14538189);
        sparseIntArray.put(org.telegram.ui.ActionBar.i6.A5, -14538189);
        sparseIntArray.put(org.telegram.ui.ActionBar.i6.Z8, -9316522);
        sparseIntArray.put(org.telegram.ui.ActionBar.i6.X8, -1446156);
        sparseIntArray.put(org.telegram.ui.ActionBar.i6.f20953lc, -2110438831);
        sparseIntArray.put(org.telegram.ui.ActionBar.i6.M6, -10263709);
        sparseIntArray.put(org.telegram.ui.ActionBar.i6.N6, -15033089);
        sparseIntArray.put(org.telegram.ui.ActionBar.i6.B5, -15033089);
        sparseIntArray.put(org.telegram.ui.ActionBar.i6.E5, -15033089);
        sparseIntArray.put(org.telegram.ui.ActionBar.i6.f20985n5, -15033089);
        sparseIntArray.put(org.telegram.ui.ActionBar.i6.wj, -832444);
        sparseIntArray.put(org.telegram.ui.ActionBar.i6.f20893i7, -12692893);
        int i14 = org.telegram.ui.ActionBar.i6.f20911j7;
        sparseIntArray.put(i14, -10329502);
        sparseIntArray.put(org.telegram.ui.ActionBar.i6.C5, -1);
        sparseIntArray.put(i12, 436207615);
        sparseIntArray.put(org.telegram.ui.ActionBar.i6.f20794ci, -13816531);
        sparseIntArray.put(org.telegram.ui.ActionBar.i6.f20813di, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.i6.f20776bi, -657931);
        sparseIntArray.put(org.telegram.ui.ActionBar.i6.J7, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.i6.Xh, -8553091);
        sparseIntArray.put(org.telegram.ui.ActionBar.i6.Yh, -10177041);
        sparseIntArray.put(org.telegram.ui.ActionBar.i6.G8, -232841441);
        sparseIntArray.put(org.telegram.ui.ActionBar.i6.f21098t8, 385875967);
        sparseIntArray.put(org.telegram.ui.ActionBar.i6.f20967m7, -12500671);
        sparseIntArray.put(org.telegram.ui.ActionBar.i6.f20948l7, -13133079);
        sparseIntArray.put(org.telegram.ui.ActionBar.i6.f20987n7, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.i6.Oh, -15033089);
        sparseIntArray.put(org.telegram.ui.ActionBar.i6.f20928k5, -10177041);
        sparseIntArray.put(org.telegram.ui.ActionBar.i6.R5, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.i6.gc, -12147733);
        sparseIntArray.put(org.telegram.ui.ActionBar.i6.f21040q5, -8553091);
        sparseIntArray.put(org.telegram.ui.ActionBar.i6.ui, -592138);
        sparseIntArray.put(org.telegram.ui.ActionBar.i6.wi, -14737633);
        sparseIntArray.put(org.telegram.ui.ActionBar.i6.xi, -12632257);
        sparseIntArray.put(org.telegram.ui.ActionBar.i6.vi, -8796932);
        sparseIntArray.put(org.telegram.ui.ActionBar.i6.Ji, 1140850687);
        sparseIntArray.put(org.telegram.ui.ActionBar.i6.Aa, i0.a.d(0.4f, -16777216, -1));
        sparseIntArray.put(org.telegram.ui.ActionBar.i6.Da, 0);
        sparseIntArray.put(org.telegram.ui.ActionBar.i6.Ea, 0);
        sparseIntArray.put(org.telegram.ui.ActionBar.i6.Fa, 0);
        sparseIntArray.put(org.telegram.ui.ActionBar.i6.Md, i0.a.k(-1, 75));
        sparseIntArray.put(org.telegram.ui.ActionBar.i6.f20874h7, -10177041);
        sparseIntArray.put(i14, -12237499);
        sparseIntArray.put(org.telegram.ui.ActionBar.i6.f20930k7, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.i6.K7, -10703370);
        sparseIntArray.put(org.telegram.ui.ActionBar.i6.L7, -12547121);
        sparseIntArray.put(org.telegram.ui.ActionBar.i6.Vk, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.i6.Tk, -1207959553);
        sparseIntArray.put(org.telegram.ui.ActionBar.i6.Uk, 352321535);
        sparseIntArray.put(org.telegram.ui.ActionBar.i6.Si, -8553091);
        sparseIntArray.put(org.telegram.ui.ActionBar.i6.Vi, -11292689);
        sparseIntArray.put(org.telegram.ui.ActionBar.i6.Ti, -12829636);
        sparseIntArray.put(org.telegram.ui.ActionBar.i6.Ui, -11184811);
        sparseIntArray.put(org.telegram.ui.ActionBar.i6.Zk, -15198183);
        b();
        paint.setColor(x0(i13));
    }

    @Override
    public final Paint F(String str) {
        if (str.equals("paintDivider")) {
            return this.f797c;
        }
        if (str.equals("paintChatActionBackground")) {
            if (this.d == null) {
                Paint paint = new Paint(1);
                this.d = paint;
                paint.setColor(i0.a.d(0.1f, -16777216, -1));
            }
            return this.d;
        }
        return org.telegram.ui.ActionBar.i6.T0(str);
    }

    @Override
    public final boolean a() {
        return org.telegram.ui.ActionBar.i6.I.q();
    }

    @Override
    public final int a1(int i10) {
        return x0(i10);
    }

    @Override
    public final int c0(int i10) {
        return x0(i10);
    }

    @Override
    public final Drawable getDrawable(String str) {
        if (Objects.equals(str, "drawableMsgOutMedia")) {
            if (this.f799f == null) {
                this.f799f = new org.telegram.ui.ActionBar.f5(1, true, false, this);
            }
            return this.f799f;
        }
        return null;
    }

    @Override
    public final boolean k0() {
        return false;
    }

    @Override
    public final void m(float f7, float f10, int i10, int i11) {
        org.telegram.ui.ActionBar.i6.q(f7, f10, i10, i11);
    }

    @Override
    public final ColorFilter x() {
        if (this.f798e == null) {
            this.f798e = new PorterDuffColorFilter(x0(org.telegram.ui.ActionBar.i6.G6), PorterDuff.Mode.SRC_IN);
        }
        return this.f798e;
    }

    @Override
    public final int x0(int i10) {
        SparseIntArray sparseIntArray = this.f796b;
        int indexOfKey = sparseIntArray.indexOfKey(i10);
        if (indexOfKey >= 0) {
            return sparseIntArray.valueAt(indexOfKey);
        }
        Integer valueOf = Integer.valueOf(i10);
        HashSet hashSet = this.f795a;
        if (!hashSet.contains(valueOf)) {
            hashSet.add(Integer.valueOf(i10));
        }
        return org.telegram.ui.ActionBar.i6.x0(null, i10, false);
    }

    public void b() {
    }

    @Override
    public final void I0(int i10, int i11) {
    }
}
