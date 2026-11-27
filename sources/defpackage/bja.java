package defpackage;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public class bja extends yia {
    public final ArrayList E;
    public boolean F;
    public final eja G;
    public final boolean h;
    public final int n;
    public final ArrayList r;
    public v5b s;
    public final int w;
    public final zia x;
    public boolean y;

    public bja(defpackage.eja r20, android.content.Context r21, int r22, boolean r23) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bja.<init>(eja, android.content.Context, int, boolean):void");
    }

    @Override
    public final boolean D(f89 f89Var) {
        return false;
    }

    @Override
    public final String F(int i) {
        r47 r47Var;
        TL_stories.StoryItem storyItem;
        v5b v5bVar = this.s;
        if (v5bVar == null || i < 0 || i >= v5bVar.i.size() || (r47Var = (r47) this.s.i.get(i)) == null || (storyItem = r47Var.l) == null) {
            return null;
        }
        return ob6.e0(storyItem.date, true);
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
        v5b v5bVar;
        if (!this.h && (v5bVar = this.s) != null) {
            if (v5bVar instanceof p5b) {
                eja ejaVar = this.G;
                TLRPC.User X1 = uc7.s1(ejaVar.y1.getCurrentAccount()).X1(Long.valueOf(ejaVar.m1));
                if (X1 != null && X1.bot && X1.bot_has_main_app && X1.bot_can_edit) {
                    return true;
                }
                return false;
            } else if (i >= 0 && i < v5bVar.i.size()) {
                r47 r47Var = (r47) this.s.i.get(i);
                v5b v5bVar2 = this.s;
                if (v5bVar2.f > 0) {
                    return true;
                }
                return v5bVar2.m(r47Var.e1());
            } else {
                return false;
            }
        }
        return false;
    }

    public final void N() {
        zha zhaVar;
        zha zhaVar2;
        zha zhaVar3;
        zha zhaVar4;
        v5b v5bVar = this.s;
        if (v5bVar != null && !this.h) {
            eja ejaVar = this.G;
            boolean z = ejaVar.o1;
            zha[] zhaVarArr = ejaVar.n0;
            int[] iArr = ejaVar.p1;
            if ((!z || (ejaVar.n1 && v5bVar.g() > 1)) && this.s.g() > 0 && !ejaVar.s0()) {
                boolean z2 = false;
                if (this.s.g() < 5) {
                    iArr[1] = this.s.g();
                    if (zhaVarArr != null && (zhaVar3 = zhaVarArr[0]) != null && (zhaVar4 = zhaVarArr[1]) != null && zhaVar3.h != null && zhaVar4.h != null) {
                        ejaVar.z1(false);
                    }
                    if (iArr[1] == 1) {
                        z2 = true;
                    }
                    ejaVar.n1 = z2;
                } else if (ejaVar.n1) {
                    ejaVar.n1 = false;
                    iArr[1] = Math.max(2, xea.q1);
                    if (zhaVarArr != null && (zhaVar = zhaVarArr[0]) != null && (zhaVar2 = zhaVarArr[1]) != null && zhaVar.h != null && zhaVar2.h != null) {
                        ejaVar.z1(false);
                    }
                }
                ejaVar.o1 = true;
            }
        }
    }

    public final int O() {
        eja ejaVar = this.G;
        lha lhaVar = ejaVar.K;
        int[] iArr = ejaVar.p1;
        if (this == lhaVar) {
            return iArr[0];
        }
        if (ejaVar.x1(this) != -1) {
            return iArr[1];
        }
        return ejaVar.t1;
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
            eja ejaVar = this.G;
            if (ejaVar.l0()) {
                ArrayList arrayList = this.r;
                arrayList.clear();
                ArrayList E = uc7.s1(this.s.c).O1().E(ejaVar.m1);
                if (E != null) {
                    arrayList.addAll(E);
                }
            }
        }
        super.f();
        N();
    }

    @Override
    public final void t(f89 f89Var, int i) {
        boolean z;
        boolean z2;
        char c;
        boolean z3;
        if (this.s != null && f89Var.f == 19) {
            View view = f89Var.a;
            if (view instanceof jja) {
                jja jjaVar = (jja) view;
                jjaVar.e0 = true;
                ArrayList arrayList = this.r;
                if (i >= 0 && i < arrayList.size()) {
                    b6b b6bVar = (b6b) arrayList.get(i);
                    jjaVar.g0 = false;
                    r47 r47Var = b6bVar.L;
                    if (r47Var == null) {
                        TL_stories.TL_storyItem tL_storyItem = new TL_stories.TL_storyItem();
                        long j = b6bVar.a;
                        int i2 = (int) (j ^ (j >>> 32));
                        tL_storyItem.messageId = i2;
                        tL_storyItem.id = i2;
                        tL_storyItem.attachPath = b6bVar.f;
                        r47 r47Var2 = new r47(this.s.c, tL_storyItem);
                        b6bVar.L = r47Var2;
                        r47Var2.m = b6bVar;
                        r47Var = r47Var2;
                    }
                    jjaVar.k(O(), r47Var, false);
                    jjaVar.e0 = true;
                    jjaVar.setReorder(false);
                    jjaVar.i(false, false);
                    return;
                }
                int size = i - arrayList.size();
                if (size >= 0 && size < this.s.i.size()) {
                    r47 r47Var3 = (r47) this.s.i.get(size);
                    if (r47Var3 != null && this.s.m(r47Var3.e1())) {
                        z = true;
                    } else {
                        z = false;
                    }
                    jjaVar.g0 = z;
                    eja ejaVar = this.G;
                    if (!ejaVar.l0() && !jjaVar.g0) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    jjaVar.setReorder(z2);
                    jjaVar.h = ejaVar.q0();
                    jjaVar.k(O(), r47Var3, false);
                    if (ejaVar.F1 && r47Var3 != null) {
                        SparseArray[] sparseArrayArr = ejaVar.c1;
                        if (r47.B0(r47Var3.k) == ejaVar.m1) {
                            c = 0;
                        } else {
                            c = 1;
                        }
                        if (sparseArrayArr[c].indexOfKey(r47Var3.e1()) >= 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        jjaVar.i(z3, true);
                    } else {
                        jjaVar.i(false, false);
                    }
                    jjaVar.l(this.y, false);
                    return;
                }
                jjaVar.g0 = false;
                jjaVar.k(O(), null, false);
                jjaVar.e0 = true;
            }
        }
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
        f89 x = super.x(viewGroup, i);
        View view = x.a;
        if (view instanceof jja) {
            ((jja) view).e0 = true;
        }
        return x;
    }

    @Override
    public final int L(int i) {
        return i;
    }

    public bja(eja ejaVar, Context context, boolean z) {
        this(ejaVar, context, 0, z);
    }
}
