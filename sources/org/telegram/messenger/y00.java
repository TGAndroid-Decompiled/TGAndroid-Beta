package org.telegram.messenger;
public final class y00 implements qc, pc {
    public final t10 f19317a;
    public final jj f19318b;
    public final c3.s f19319c;
    public final bi.i6 d;

    public y00(t10 t10Var, jj jjVar, c3.s sVar, bi.i6 i6Var) {
        this.f19317a = t10Var;
        this.f19318b = jjVar;
        this.f19319c = sVar;
        this.d = i6Var;
    }

    @Override
    public void a(String str) {
        i0.g3(new cn(this.f19317a, this.f19318b, str, this.f19319c, this.d, 18));
    }

    @Override
    public void q(Exception exc) {
        i0.g3(new ul(this.f19317a, this.f19318b, this.f19319c, this.d, 27));
    }
}
