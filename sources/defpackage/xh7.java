package defpackage;

import j$.util.Objects;
public final class xh7 {
    public final p1c a;
    public final y1c b;
    public final x1c c;
    public final g6c d;
    public final boolean e;
    public final boolean f;
    public int g;
    public ko4 h;

    public xh7(p1c p1cVar, y1c y1cVar, x1c x1cVar) {
        boolean z;
        g6c g6cVar;
        this.a = p1cVar;
        this.b = y1cVar;
        this.c = x1cVar;
        int i = p1cVar.b;
        ko4 ko4Var = p1cVar.g;
        if (i == 2) {
            z = true;
        } else {
            z = false;
        }
        this.e = z;
        this.f = Objects.equals(ko4Var.t, "application/x-itut-t35");
        if ("audio/true-hd".equals(ko4Var.t)) {
            g6cVar = new g6c();
        } else {
            g6cVar = null;
        }
        this.d = g6cVar;
    }
}
