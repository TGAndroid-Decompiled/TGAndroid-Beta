package defpackage;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public class kfa extends hfa {
    public final ArrayList E;
    public boolean F;
    public final nfa G;
    public final boolean h;
    public final int n;
    public final ArrayList r;
    public y1b s;
    public final int w;
    public final ifa x;
    public boolean y;

    public kfa(defpackage.nfa r20, android.content.Context r21, int r22, boolean r23) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kfa.<init>(nfa, android.content.Context, int, boolean):void");
    }

    @Override
    public final boolean D(s49 s49Var) {
        return false;
    }

    @Override
    public final String F(int i) {
        k27 k27Var;
        TL_stories.StoryItem storyItem;
        y1b y1bVar = this.s;
        if (y1bVar == null || i < 0 || i >= y1bVar.i.size() || (k27Var = (k27) this.s.i.get(i)) == null || (storyItem = k27Var.l) == null) {
            return null;
        }
        return k96.e0(storyItem.date, true);
    }

    @Override
    public final void I() {
        int i;
        if (this.h) {
            i = 9;
        } else {
            i = 8;
        }
        this.G.n1(i, true);
    }

    public final boolean M(int i) {
        y1b y1bVar;
        if (!this.h && (y1bVar = this.s) != null) {
            if (y1bVar instanceof s1b) {
                nfa nfaVar = this.G;
                TLRPC.User V1 = na7.q1(nfaVar.y1.getCurrentAccount()).V1(Long.valueOf(nfaVar.m1));
                if (V1 != null && V1.bot && V1.bot_has_main_app && V1.bot_can_edit) {
                    return true;
                }
                return false;
            } else if (i >= 0 && i < y1bVar.i.size()) {
                k27 k27Var = (k27) this.s.i.get(i);
                y1b y1bVar2 = this.s;
                if (y1bVar2.f > 0) {
                    return true;
                }
                return y1bVar2.m(k27Var.e1());
            } else {
                return false;
            }
        }
        return false;
    }

    public final void N() {
        iea ieaVar;
        iea ieaVar2;
        iea ieaVar3;
        iea ieaVar4;
        y1b y1bVar = this.s;
        if (y1bVar != null && !this.h) {
            nfa nfaVar = this.G;
            boolean z = nfaVar.o1;
            iea[] ieaVarArr = nfaVar.n0;
            int[] iArr = nfaVar.p1;
            if ((!z || (nfaVar.n1 && y1bVar.g() > 1)) && this.s.g() > 0 && !nfaVar.s0()) {
                boolean z2 = false;
                if (this.s.g() < 5) {
                    iArr[1] = this.s.g();
                    if (ieaVarArr != null && (ieaVar3 = ieaVarArr[0]) != null && (ieaVar4 = ieaVarArr[1]) != null && ieaVar3.h != null && ieaVar4.h != null) {
                        nfaVar.z1(false);
                    }
                    if (iArr[1] == 1) {
                        z2 = true;
                    }
                    nfaVar.n1 = z2;
                } else if (nfaVar.n1) {
                    nfaVar.n1 = false;
                    iArr[1] = Math.max(2, gba.q1);
                    if (ieaVarArr != null && (ieaVar = ieaVarArr[0]) != null && (ieaVar2 = ieaVarArr[1]) != null && ieaVar.h != null && ieaVar2.h != null) {
                        nfaVar.z1(false);
                    }
                }
                nfaVar.o1 = true;
            }
        }
    }

    public final int O() {
        nfa nfaVar = this.G;
        uda udaVar = nfaVar.K;
        int[] iArr = nfaVar.p1;
        if (this == udaVar) {
            return iArr[0];
        }
        if (nfaVar.x1(this) != -1) {
            return iArr[1];
        }
        return nfaVar.t1;
    }

    public final void P() {
        if (this.s == null) {
            return;
        }
        int O = O();
        this.s.p(Math.min(100, Math.max(1, O / 2) * O * O), false);
    }

    @Override
    public final int b() {
        int i = 0;
        if (this.s == null) {
            return 0;
        }
        int size = this.r.size();
        if (!this.s.l() || !this.G.d0()) {
            i = this.s.g();
        }
        return size + i;
    }

    @Override
    public final int d(int i) {
        return 19;
    }

    @Override
    public final int e() {
        return b();
    }

    @Override
    public void f() {
        if (this.s != null) {
            nfa nfaVar = this.G;
            if (nfaVar.l0()) {
                ArrayList arrayList = this.r;
                arrayList.clear();
                ArrayList E = na7.q1(this.s.c).M1().E(nfaVar.m1);
                if (E != null) {
                    arrayList.addAll(E);
                }
            }
        }
        super.f();
        N();
    }

    @Override
    public final void t(s49 s49Var, int i) {
        boolean z;
        boolean z2;
        char c;
        boolean z3;
        if (this.s != null && s49Var.f == 19) {
            View view = s49Var.a;
            if (view instanceof qfa) {
                qfa qfaVar = (qfa) view;
                qfaVar.e0 = true;
                ArrayList arrayList = this.r;
                if (i >= 0 && i < arrayList.size()) {
                    f2b f2bVar = (f2b) arrayList.get(i);
                    qfaVar.g0 = false;
                    k27 k27Var = f2bVar.L;
                    if (k27Var == null) {
                        TL_stories.TL_storyItem tL_storyItem = new TL_stories.TL_storyItem();
                        long j = f2bVar.a;
                        int i2 = (int) (j ^ (j >>> 32));
                        tL_storyItem.messageId = i2;
                        tL_storyItem.id = i2;
                        tL_storyItem.attachPath = f2bVar.f;
                        k27 k27Var2 = new k27(this.s.c, tL_storyItem);
                        f2bVar.L = k27Var2;
                        k27Var2.m = f2bVar;
                        k27Var = k27Var2;
                    }
                    qfaVar.k(k27Var, O(), false);
                    qfaVar.e0 = true;
                    qfaVar.setReorder(false);
                    qfaVar.i(false, false);
                    return;
                }
                int size = i - arrayList.size();
                if (size >= 0 && size < this.s.i.size()) {
                    k27 k27Var3 = (k27) this.s.i.get(size);
                    if (k27Var3 != null && this.s.m(k27Var3.e1())) {
                        z = true;
                    } else {
                        z = false;
                    }
                    qfaVar.g0 = z;
                    nfa nfaVar = this.G;
                    if (!nfaVar.l0() && !qfaVar.g0) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    qfaVar.setReorder(z2);
                    qfaVar.h = nfaVar.q0();
                    qfaVar.k(k27Var3, O(), false);
                    if (nfaVar.F1 && k27Var3 != null) {
                        SparseArray[] sparseArrayArr = nfaVar.c1;
                        if (k27.B0(k27Var3.k) == nfaVar.m1) {
                            c = 0;
                        } else {
                            c = 1;
                        }
                        if (sparseArrayArr[c].indexOfKey(k27Var3.e1()) >= 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        qfaVar.i(z3, true);
                    } else {
                        qfaVar.i(false, false);
                    }
                    qfaVar.l(this.y, false);
                    return;
                }
                qfaVar.g0 = false;
                qfaVar.k(null, O(), false);
                qfaVar.e0 = true;
            }
        }
    }

    @Override
    public final s49 x(ViewGroup viewGroup, int i) {
        s49 x = super.x(viewGroup, i);
        View view = x.a;
        if (view instanceof qfa) {
            ((qfa) view).e0 = true;
        }
        return x;
    }

    @Override
    public final int L(int i) {
        return i;
    }

    public kfa(nfa nfaVar, Context context, boolean z) {
        this(nfaVar, context, 0, z);
    }
}
