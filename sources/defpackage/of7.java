package defpackage;

import j$.util.Objects;
public final class of7 {
    public final oxb a;
    public final xxb b;
    public final wxb c;
    public final g2c d;
    public final boolean e;
    public final boolean f;
    public int g;
    public fm4 h;

    public of7(oxb oxbVar, xxb xxbVar, wxb wxbVar) {
        boolean z;
        g2c g2cVar;
        this.a = oxbVar;
        this.b = xxbVar;
        this.c = wxbVar;
        int i = oxbVar.b;
        fm4 fm4Var = oxbVar.g;
        if (i == 2) {
            z = true;
        } else {
            z = false;
        }
        this.e = z;
        this.f = Objects.equals(fm4Var.t, "application/x-itut-t35");
        if ("audio/true-hd".equals(fm4Var.t)) {
            g2cVar = new g2c();
        } else {
            g2cVar = null;
        }
        this.d = g2cVar;
    }
}
