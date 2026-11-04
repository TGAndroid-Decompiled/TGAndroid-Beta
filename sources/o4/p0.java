package o4;

import java.util.List;
public final class p0 implements d1, e1, g2.k {
    public final h1 f20792a;
    public final int f20793b;
    public final int f20794c;

    public p0(h1 h1Var, int i3, int i10) {
        this.f20792a = h1Var;
        this.f20793b = i3;
        this.f20794c = i10;
    }

    @Override
    public void accept(Object obj) {
        l1 l1Var = (l1) obj;
        h1 h1Var = this.f20792a;
        ((e0) h1Var.f20660a.get()).getClass();
        g1 g1Var = h1Var.f20665i;
        if (g1Var != null) {
            g1Var.setFixedSize(this.f20793b, this.f20794c);
        }
    }

    @Override
    public void b(l1 l1Var, v vVar) {
        h1 h1Var = this.f20792a;
        l1Var.P(h1Var.M0(vVar, l1Var, this.f20793b), h1Var.M0(vVar, l1Var, this.f20794c));
    }

    @Override
    public void c(l1 l1Var, v vVar, List list) {
        h1 h1Var = this.f20792a;
        l1Var.p0(list, h1Var.M0(vVar, l1Var, this.f20793b), h1Var.M0(vVar, l1Var, this.f20794c));
    }
}
