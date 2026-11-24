package defpackage;

import j$.util.Objects;
public final class rh7 {
    public final qzb a;
    public final zzb b;
    public final yzb c;
    public final g4c d;
    public final boolean e;
    public final boolean f;
    public int g;
    public go4 h;

    public rh7(qzb qzbVar, zzb zzbVar, yzb yzbVar) {
        boolean z;
        g4c g4cVar;
        this.a = qzbVar;
        this.b = zzbVar;
        this.c = yzbVar;
        int i = qzbVar.b;
        go4 go4Var = qzbVar.g;
        if (i == 2) {
            z = true;
        } else {
            z = false;
        }
        this.e = z;
        this.f = Objects.equals(go4Var.t, "application/x-itut-t35");
        if ("audio/true-hd".equals(go4Var.t)) {
            g4cVar = new g4c();
        } else {
            g4cVar = null;
        }
        this.d = g4cVar;
    }
}
