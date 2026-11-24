package defpackage;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class afa extends w29 {
    public final Context c;
    public final byte d;
    public boolean e;
    public final nfa f;

    public afa(nfa nfaVar, Context context, int i) {
        this.f = nfaVar;
        this.c = context;
        this.d = i;
    }

    @Override
    public final boolean D(s49 s49Var) {
        return true;
    }

    @Override
    public final String F(int i) {
        ArrayList arrayList = this.f.w1[this.d].e;
        if (!arrayList.isEmpty()) {
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                if (i <= ((nea) arrayList.get(i2)).b) {
                    return ((nea) arrayList.get(i2)).a;
                }
            }
            return ((nea) b00.f(1, arrayList)).a;
        }
        return "";
    }

    @Override
    public final void G(o39 o39Var, float f, int[] iArr) {
        int measuredHeight = o39Var.getChildAt(0).getMeasuredHeight();
        float e = f * ((e() * measuredHeight) - (o39Var.getMeasuredHeight() - o39Var.getPaddingTop()));
        iArr[0] = (int) (e / measuredHeight);
        iArr[1] = ((int) e) % measuredHeight;
    }

    @Override
    public final void J(o39 o39Var) {
        if (this.e) {
            this.e = false;
            int i = 0;
            for (int i2 = 0; i2 < o39Var.getChildCount() && (i = nfa.Q(o39Var.getChildAt(i2))) == 0; i2++) {
            }
            if (i == 0) {
                this.f.L(this.d, o39Var, true);
            }
        }
    }

    @Override
    public final void K() {
        this.e = true;
        iea P = this.f.P(this.d);
        if (P != null) {
            nfa.m1(P, null, false);
        }
    }

    @Override
    public final int b() {
        int i;
        int i2;
        cfa[] cfaVarArr = this.f.w1;
        byte b = this.d;
        cfa cfaVar = cfaVarArr[b];
        if (cfaVar.o) {
            return cfaVar.e();
        }
        if (cfaVar.a.size() == 0 && !cfaVarArr[b].g) {
            return 1;
        }
        if (cfaVarArr[b].a.size() == 0) {
            cfa cfaVar2 = cfaVarArr[b];
            boolean[] zArr = cfaVar2.i;
            if ((!zArr[0] || !zArr[1]) && cfaVar2.l) {
                return 0;
            }
        }
        if (cfaVarArr[b].e() == 0) {
            int size = cfaVarArr[b].c().size() + cfaVarArr[b].d();
            if (size != 0) {
                cfa cfaVar3 = cfaVarArr[b];
                boolean[] zArr2 = cfaVar3.i;
                if (!zArr2[0] || !zArr2[1]) {
                    boolean z = cfaVar3.r;
                    if (z) {
                        i = cfaVar3.u;
                    } else {
                        i = cfaVar3.n;
                    }
                    if (i != 0) {
                        if (z) {
                            i2 = cfaVar3.u;
                        } else {
                            i2 = cfaVar3.n;
                        }
                        return i2 + size;
                    }
                    return size + 1;
                }
                return size;
            }
            return size;
        }
        return Math.max(cfaVarArr[b].e(), cfaVarArr[b].c().size() + cfaVarArr[b].d());
    }

    @Override
    public final int d(int i) {
        cfa[] cfaVarArr = this.f.w1;
        byte b = this.d;
        if (cfaVarArr[b].c.size() == 0 && !cfaVarArr[b].g) {
            return 9;
        }
        cfa cfaVar = cfaVarArr[b];
        int i2 = cfaVar.m;
        if (i >= i2 && i < cfaVar.a.size() + i2) {
            if (b != 2 && b != 4) {
                return 7;
            }
            return 10;
        }
        return 8;
    }

    @Override
    public final int e() {
        return this.f.w1[this.d].e();
    }

    @Override
    public final void t(s49 s49Var, int i) {
        boolean z;
        char c;
        boolean z2;
        char c2;
        nfa nfaVar = this.f;
        long j = nfaVar.m1;
        SparseArray[] sparseArrayArr = nfaVar.c1;
        cfa cfaVar = nfaVar.w1[this.d];
        ArrayList arrayList = cfaVar.a;
        int i2 = s49Var.f;
        View view = s49Var.a;
        boolean z3 = false;
        if (i2 != 7) {
            if (i2 == 10 && (view instanceof eba)) {
                eba ebaVar = (eba) view;
                k27 k27Var = (k27) arrayList.get(i - cfaVar.m);
                if (i != arrayList.size() - 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                ebaVar.f(k27Var, z2);
                if (nfaVar.F1) {
                    if (k27.B0(k27Var.k) == j) {
                        c2 = 0;
                    } else {
                        c2 = 1;
                    }
                    if (sparseArrayArr[c2].indexOfKey(k27Var.e1()) >= 0) {
                        z3 = true;
                    }
                    ebaVar.e(z3, !nfaVar.e1);
                    return;
                }
                ebaVar.e(false, !nfaVar.e1);
            }
        } else if (!(view instanceof iba)) {
        } else {
            iba ibaVar = (iba) view;
            k27 k27Var2 = (k27) arrayList.get(i - cfaVar.m);
            if (i != arrayList.size() - 1) {
                z = true;
            } else {
                z = false;
            }
            ibaVar.c(k27Var2, z);
            if (nfaVar.F1) {
                if (k27.B0(k27Var2.k) == j) {
                    c = 0;
                } else {
                    c = 1;
                }
                if (sparseArrayArr[c].indexOfKey(k27Var2.e1()) >= 0) {
                    z3 = true;
                }
                ibaVar.b(z3, !nfaVar.e1);
                return;
            }
            ibaVar.b(false, !nfaVar.e1);
        }
    }

    @Override
    public final s49 x(ViewGroup viewGroup, int i) {
        View view;
        View ue4Var;
        nfa nfaVar = this.f;
        pi4 pi4Var = nfaVar.E;
        ArrayList arrayList = nfaVar.J0;
        wjb wjbVar = nfaVar.I1;
        Context context = this.c;
        if (i != 7) {
            byte b = this.d;
            if (i != 8) {
                if (i != 9) {
                    if (b == 4 && !arrayList.isEmpty()) {
                        View view2 = (View) arrayList.get(0);
                        arrayList.remove(0);
                        ViewGroup viewGroup2 = (ViewGroup) view2.getParent();
                        ue4Var = view2;
                        if (viewGroup2 != null) {
                            viewGroup2.removeView(view2);
                            ue4Var = view2;
                        }
                    } else {
                        ue4Var = new ue4(this, context, wjbVar, (byte) 2);
                    }
                    eba ebaVar = (eba) ue4Var;
                    ebaVar.setGlobalGradientView(pi4Var);
                    view = ue4Var;
                    if (b == 4) {
                        nfaVar.K0.add(ebaVar);
                        view = ue4Var;
                    }
                } else {
                    bi G = nfa.G(b, nfaVar.m1, wjbVar, context);
                    G.setLayoutParams(new e49(-1, -1));
                    return new s49(G);
                }
            } else {
                pi4 pi4Var2 = new pi4(context, wjbVar);
                if (b == 2) {
                    pi4Var2.setViewType(4);
                } else {
                    pi4Var2.setViewType(3);
                }
                pi4Var2.x = false;
                pi4Var2.setIsSingleCell(true);
                pi4Var2.setGlobalGradientView(pi4Var);
                view = pi4Var2;
            }
        } else {
            iba ibaVar = new iba(0, wjbVar, context);
            ibaVar.setGlobalGradientView(pi4Var);
            view = ibaVar;
        }
        return ls6.h(view, view, -1, -2);
    }
}
