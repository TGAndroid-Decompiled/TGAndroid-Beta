package ai;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import j$.util.Objects;
import java.util.HashSet;
public class d implements org.telegram.ui.ActionBar.f6 {
    public final HashSet f678a = new HashSet();
    public final SparseIntArray f679b;
    public final Paint f680c;
    public Paint d;
    public PorterDuffColorFilter e;
    public org.telegram.ui.ActionBar.g5 f681f;

    public d() {
        SparseIntArray sparseIntArray = new SparseIntArray();
        this.f679b = sparseIntArray;
        Paint paint = new Paint();
        this.f680c = paint;
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.f19236xf, -1308622848);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.f19254yf, -1056964608);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Yi, -1214008894);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Zi, -1946157057);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.aj, 452984831);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.bj, -665229191);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.cj, -667862461);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.dj, -665229191);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Oi, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.J5, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.f19101q7, -2406842);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.H5, -10177041);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.f19109qf, i0.a.d(0.2f, -16777216, -1));
        int i10 = org.telegram.ui.ActionBar.j6.P5;
        sparseIntArray.put(i10, i0.a.d(0.5f, -16777216, -1));
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Q5, i0.a.d(0.5f, -16777216, -1));
        int i11 = org.telegram.ui.ActionBar.j6.O5;
        sparseIntArray.put(i11, i0.a.k(-1, 17));
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.E8, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.F8, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.f19083p7, -1152913);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.f18953i6, 385875967);
        int i12 = org.telegram.ui.ActionBar.j6.I5;
        sparseIntArray.put(i12, 436207615);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Se, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.f18818ai, -1711276033);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.H6, i0.a.d(0.5f, -16777216, -1));
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.f19156t5, i0.a.d(0.5f, -16777216, -1));
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Ii, i0.a.d(0.2f, -16777216, -1));
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.f18970j5, -592138);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.f19118r5, -8553091);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.f19193v6, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Te, 1946157055);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Ve, 1946157055);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.f19201vf, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Mh, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.f19140s8, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.f19091pf, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Ie, i0.a.k(-1, 30));
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.He, -14670806);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.f19247y8, -1);
        sparseIntArray.put(i10, i0.a.d(0.5f, -16777216, -1));
        sparseIntArray.put(i11, i0.a.k(-1, 17));
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.f19245y6, i0.a.k(-1, 127));
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.f18814ae, -14606046);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Zd, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.f18980jf, -1221292);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.f18872df, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.f19000kf, -15033089);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.f18889ef, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.f19054nf, 2030043135);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.f19037mf, -10638868);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Wd, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Vd, org.telegram.ui.ActionBar.j6.l1(0.6f, -1));
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.f19184uf, -1515107571);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.f18940hc, -5316609);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Ud, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Xd, org.telegram.ui.ActionBar.j6.l1(0.9f, -1));
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Wk, org.telegram.ui.ActionBar.j6.l1(0.8f, -1));
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Sd, -14670806);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.f18934h5, -14737633);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.f18952i5, -16777216);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.M5, -15393241);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.f18863d6, -15198183);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.G6, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Le, -8553090);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.f18935h6, -10177027);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Pe, 181267199);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Je, i0.a.k(-1, 125));
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Me, -2130706433);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Ne, i0.a.k(-1, 125));
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Oe, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Qe, -10177041);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Ke, i0.a.k(-16777216, 30));
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Re, i0.a.k(-1, 125));
        int i13 = org.telegram.ui.ActionBar.j6.f18864d7;
        sparseIntArray.put(i13, -16777216);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.f19273zf, -15033089);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.U5, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.e7, -14079703);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.f7, -8158332);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.f18807a7, -16777216);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.L6, -15033089);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.f19009l6, -10177041);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.f18991k6, -10177041);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.A6, i0.a.d(0.3f, -1, -16777216));
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Fi, -14605274);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Gi, -7616267);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Hi, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.H8, -233499371);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Ue, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.B6, -8355712);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.f19055ng, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.f18907fg, -14538189);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.A5, -14538189);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Z8, -9316522);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.X8, -1446156);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.f19015lc, -2110438831);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.M6, -10263709);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.N6, -15033089);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.B5, -15033089);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.E5, -15033089);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.f19047n5, -15033089);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.wj, -832444);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.f18954i7, -12692893);
        int i14 = org.telegram.ui.ActionBar.j6.f18972j7;
        sparseIntArray.put(i14, -10329502);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.C5, -1);
        sparseIntArray.put(i12, 436207615);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.f18856ci, -13816531);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.f18875di, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.f18837bi, -657931);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.J7, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Xh, -8553091);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Yh, -10177041);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.G8, -232841441);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.f19159t8, 385875967);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.f19029m7, -12500671);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.f19010l7, -13133079);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.f19049n7, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Oh, -15033089);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.f18990k5, -10177041);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.R5, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.gc, -12147733);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.f19100q5, -8553091);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.ui, -592138);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.wi, -14737633);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.xi, -12632257);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.vi, -8796932);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Ji, 1140850687);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Aa, i0.a.d(0.4f, -16777216, -1));
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Da, 0);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Ea, 0);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Fa, 0);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Md, i0.a.k(-1, 75));
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.f18936h7, -10177041);
        sparseIntArray.put(i14, -12237499);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.f18992k7, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.K7, -10703370);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.L7, -12547121);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Vk, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Tk, -1207959553);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Uk, 352321535);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Si, -8553091);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Vi, -11292689);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Ti, -12829636);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Ui, -11184811);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Zk, -15198183);
        b();
        paint.setColor(G0(i13));
    }

    @Override
    public final Paint G(String str) {
        if (str.equals("paintDivider")) {
            return this.f680c;
        }
        if (str.equals("paintChatActionBackground")) {
            if (this.d == null) {
                Paint paint = new Paint(1);
                this.d = paint;
                paint.setColor(i0.a.d(0.1f, -16777216, -1));
            }
            return this.d;
        }
        return org.telegram.ui.ActionBar.j6.S0(str);
    }

    @Override
    public final int G0(int i10) {
        SparseIntArray sparseIntArray = this.f679b;
        int indexOfKey = sparseIntArray.indexOfKey(i10);
        if (indexOfKey >= 0) {
            return sparseIntArray.valueAt(indexOfKey);
        }
        Integer valueOf = Integer.valueOf(i10);
        HashSet hashSet = this.f678a;
        if (!hashSet.contains(valueOf)) {
            hashSet.add(Integer.valueOf(i10));
        }
        return org.telegram.ui.ActionBar.j6.w0(null, i10, false);
    }

    @Override
    public final boolean a() {
        return org.telegram.ui.ActionBar.j6.I.q();
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
            if (this.f681f == null) {
                this.f681f = new org.telegram.ui.ActionBar.g5(1, true, false, this);
            }
            return this.f681f;
        }
        return null;
    }

    @Override
    public final void m(float f7, float f10, int i10, int i11) {
        org.telegram.ui.ActionBar.j6.q(f7, f10, i10, i11);
    }

    @Override
    public final boolean p0() {
        return false;
    }

    @Override
    public final ColorFilter x() {
        if (this.e == null) {
            this.e = new PorterDuffColorFilter(G0(org.telegram.ui.ActionBar.j6.G6), PorterDuff.Mode.SRC_IN);
        }
        return this.e;
    }

    public void b() {
    }

    @Override
    public final void L0(int i10, int i11) {
    }
}
