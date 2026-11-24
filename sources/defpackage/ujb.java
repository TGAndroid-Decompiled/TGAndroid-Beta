package defpackage;
public enum ujb {
    DEFAULT(bkb.qg, bkb.rg, bkb.sg, bkb.Fg, bkb.Gg, bkb.Hg),
    PRIMARY(bkb.tg, bkb.ug, bkb.vg, bkb.Ig, bkb.Jg, bkb.Kg),
    DANGER(bkb.wg, bkb.xg, bkb.yg, bkb.Lg, bkb.Mg, bkb.Ng),
    SUCCESS(bkb.zg, bkb.Ag, bkb.Bg, bkb.Og, bkb.Pg, bkb.Qg),
    DEFAULT_IN_TEXT(bkb.Cg, bkb.Dg, bkb.Eg, bkb.Rg, bkb.Sg, bkb.Tg);
    
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;

    ujb(int i, int i2, int i3, int i4, int i5, int i6) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
    }
}
