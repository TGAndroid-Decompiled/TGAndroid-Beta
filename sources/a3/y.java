package a3;

import a8.ja;
import e2.s1;
import j$.util.Objects;
import l2.m1;
public final class y {
    public final int f143a;
    public final m1[] f144b;
    public final u[] f145c;
    public final s1 d;
    public final Object f146e;

    public y(m1[] m1VarArr, u[] uVarArr, s1 s1Var, Object obj) {
        boolean z10;
        if (m1VarArr.length == uVarArr.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        ja.f(z10);
        this.f144b = m1VarArr;
        this.f145c = (u[]) uVarArr.clone();
        this.d = s1Var;
        this.f146e = obj;
        this.f143a = m1VarArr.length;
    }

    public final boolean a(y yVar, int i7) {
        if (yVar == null || !Objects.equals(this.f144b[i7], yVar.f144b[i7]) || !Objects.equals(this.f145c[i7], yVar.f145c[i7])) {
            return false;
        }
        return true;
    }

    public final boolean b(int i7) {
        if (this.f144b[i7] != null) {
            return true;
        }
        return false;
    }
}
