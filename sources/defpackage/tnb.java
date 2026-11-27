package defpackage;
public enum tnb {
    DEFAULT(aob.rg, aob.sg, aob.tg, aob.Gg, aob.Hg, aob.Ig),
    PRIMARY(aob.ug, aob.vg, aob.wg, aob.Jg, aob.Kg, aob.Lg),
    DANGER(aob.xg, aob.yg, aob.zg, aob.Mg, aob.Ng, aob.Og),
    SUCCESS(aob.Ag, aob.Bg, aob.Cg, aob.Pg, aob.Qg, aob.Rg),
    DEFAULT_IN_TEXT(aob.Dg, aob.Eg, aob.Fg, aob.Sg, aob.Tg, aob.Ug);
    
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;

    tnb(int i, int i2, int i3, int i4, int i5, int i6) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
    }
}
