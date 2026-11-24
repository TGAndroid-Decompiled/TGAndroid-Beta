package defpackage;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public class kha extends hha {
    public final ArrayList E;
    public boolean F;
    public final nha G;
    public final boolean h;
    public final int n;
    public final ArrayList r;
    public z3b s;
    public final int w;
    public final iha x;
    public boolean y;

    public kha(defpackage.nha r20, android.content.Context r21, int r22, boolean r23) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kha.<init>(nha, android.content.Context, int, boolean):void");
    }

    @Override
    public final boolean D(u69 u69Var) {
        return false;
    }

    @Override
    public final String F(int i) {
        k47 k47Var;
        TL_stories.StoryItem storyItem;
        z3b z3bVar = this.s;
        if (z3bVar == null || i < 0 || i >= z3bVar.i.size() || (k47Var = (k47) this.s.i.get(i)) == null || (storyItem = k47Var.l) == null) {
            return null;
        }
        return jb6.e0(storyItem.date, true);
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
        z3b z3bVar;
        if (!this.h && (z3bVar = this.s) != null) {
            if (z3bVar instanceof t3b) {
                nha nhaVar = this.G;
                TLRPC.User W1 = oc7.r1(nhaVar.y1.getCurrentAccount()).W1(Long.valueOf(nhaVar.m1));
                if (W1 != null && W1.bot && W1.bot_has_main_app && W1.bot_can_edit) {
                    return true;
                }
                return false;
            } else if (i >= 0 && i < z3bVar.i.size()) {
                k47 k47Var = (k47) this.s.i.get(i);
                z3b z3bVar2 = this.s;
                if (z3bVar2.f > 0) {
                    return true;
                }
                return z3bVar2.m(k47Var.e1());
            } else {
                return false;
            }
        }
        return false;
    }

    public final void N() {
        iga igaVar;
        iga igaVar2;
        iga igaVar3;
        iga igaVar4;
        z3b z3bVar = this.s;
        if (z3bVar != null && !this.h) {
            nha nhaVar = this.G;
            boolean z = nhaVar.o1;
            iga[] igaVarArr = nhaVar.n0;
            int[] iArr = nhaVar.p1;
            if ((!z || (nhaVar.n1 && z3bVar.g() > 1)) && this.s.g() > 0 && !nhaVar.s0()) {
                boolean z2 = false;
                if (this.s.g() < 5) {
                    iArr[1] = this.s.g();
                    if (igaVarArr != null && (igaVar3 = igaVarArr[0]) != null && (igaVar4 = igaVarArr[1]) != null && igaVar3.h != null && igaVar4.h != null) {
                        nhaVar.z1(false);
                    }
                    if (iArr[1] == 1) {
                        z2 = true;
                    }
                    nhaVar.n1 = z2;
                } else if (nhaVar.n1) {
                    nhaVar.n1 = false;
                    iArr[1] = Math.max(2, gda.q1);
                    if (igaVarArr != null && (igaVar = igaVarArr[0]) != null && (igaVar2 = igaVarArr[1]) != null && igaVar.h != null && igaVar2.h != null) {
                        nhaVar.z1(false);
                    }
                }
                nhaVar.o1 = true;
            }
        }
    }

    public final int O() {
        nha nhaVar = this.G;
        ufa ufaVar = nhaVar.K;
        int[] iArr = nhaVar.p1;
        if (this == ufaVar) {
            return iArr[0];
        }
        if (nhaVar.x1(this) != -1) {
            return iArr[1];
        }
        return nhaVar.t1;
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
            nha nhaVar = this.G;
            if (nhaVar.l0()) {
                ArrayList arrayList = this.r;
                arrayList.clear();
                ArrayList E = oc7.r1(this.s.c).N1().E(nhaVar.m1);
                if (E != null) {
                    arrayList.addAll(E);
                }
            }
        }
        super.f();
        N();
    }

    @Override
    public final void t(u69 u69Var, int i) {
        boolean z;
        boolean z2;
        char c;
        boolean z3;
        if (this.s != null && u69Var.f == 19) {
            View view = u69Var.a;
            if (view instanceof sha) {
                sha shaVar = (sha) view;
                shaVar.e0 = true;
                ArrayList arrayList = this.r;
                if (i >= 0 && i < arrayList.size()) {
                    g4b g4bVar = (g4b) arrayList.get(i);
                    shaVar.g0 = false;
                    k47 k47Var = g4bVar.L;
                    if (k47Var == null) {
                        TL_stories.TL_storyItem tL_storyItem = new TL_stories.TL_storyItem();
                        long j = g4bVar.a;
                        int i2 = (int) (j ^ (j >>> 32));
                        tL_storyItem.messageId = i2;
                        tL_storyItem.id = i2;
                        tL_storyItem.attachPath = g4bVar.f;
                        k47 k47Var2 = new k47(this.s.c, tL_storyItem);
                        g4bVar.L = k47Var2;
                        k47Var2.m = g4bVar;
                        k47Var = k47Var2;
                    }
                    shaVar.k(k47Var, O(), false);
                    shaVar.e0 = true;
                    shaVar.setReorder(false);
                    shaVar.i(false, false);
                    return;
                }
                int size = i - arrayList.size();
                if (size >= 0 && size < this.s.i.size()) {
                    k47 k47Var3 = (k47) this.s.i.get(size);
                    if (k47Var3 != null && this.s.m(k47Var3.e1())) {
                        z = true;
                    } else {
                        z = false;
                    }
                    shaVar.g0 = z;
                    nha nhaVar = this.G;
                    if (!nhaVar.l0() && !shaVar.g0) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    shaVar.setReorder(z2);
                    shaVar.h = nhaVar.q0();
                    shaVar.k(k47Var3, O(), false);
                    if (nhaVar.F1 && k47Var3 != null) {
                        SparseArray[] sparseArrayArr = nhaVar.c1;
                        if (k47.B0(k47Var3.k) == nhaVar.m1) {
                            c = 0;
                        } else {
                            c = 1;
                        }
                        if (sparseArrayArr[c].indexOfKey(k47Var3.e1()) >= 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        shaVar.i(z3, true);
                    } else {
                        shaVar.i(false, false);
                    }
                    shaVar.l(this.y, false);
                    return;
                }
                shaVar.g0 = false;
                shaVar.k(null, O(), false);
                shaVar.e0 = true;
            }
        }
    }

    @Override
    public final u69 x(ViewGroup viewGroup, int i) {
        u69 x = super.x(viewGroup, i);
        View view = x.a;
        if (view instanceof sha) {
            ((sha) view).e0 = true;
        }
        return x;
    }

    @Override
    public final int L(int i) {
        return i;
    }

    public kha(nha nhaVar, Context context, boolean z) {
        this(nhaVar, context, 0, z);
    }
}
