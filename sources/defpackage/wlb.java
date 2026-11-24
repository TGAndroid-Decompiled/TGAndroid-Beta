package defpackage;
public enum wlb {
    DEFAULT(cmb.qg, cmb.rg, cmb.sg, cmb.Fg, cmb.Gg, cmb.Hg),
    PRIMARY(cmb.tg, cmb.ug, cmb.vg, cmb.Ig, cmb.Jg, cmb.Kg),
    DANGER(cmb.wg, cmb.xg, cmb.yg, cmb.Lg, cmb.Mg, cmb.Ng),
    SUCCESS(cmb.zg, cmb.Ag, cmb.Bg, cmb.Og, cmb.Pg, cmb.Qg),
    DEFAULT_IN_TEXT(cmb.Cg, cmb.Dg, cmb.Eg, cmb.Rg, cmb.Sg, cmb.Tg);
    
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;

    wlb(int i, int i2, int i3, int i4, int i5, int i6) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
    }
}
