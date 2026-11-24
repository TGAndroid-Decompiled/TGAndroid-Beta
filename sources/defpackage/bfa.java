package defpackage;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class bfa extends j39 {
    public final Context r;
    public final nfa s;

    public bfa(nfa nfaVar, Context context) {
        this.s = nfaVar;
        this.r = context;
    }

    @Override
    public final String F(int i) {
        return null;
    }

    @Override
    public final void G(o39 o39Var, float f, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override
    public final int M(int i) {
        cfa[] cfaVarArr = this.s.w1;
        int i2 = 1;
        if ((cfaVarArr[3].c.size() == 0 && !cfaVarArr[3].g) || i >= cfaVarArr[3].c.size()) {
            return 1;
        }
        cfa cfaVar = cfaVarArr[3];
        int size = ((ArrayList) cfaVar.d.get(cfaVar.c.get(i))).size();
        if (i == 0) {
            i2 = 0;
        }
        return size + i2;
    }

    @Override
    public final Object O(int i, int i2) {
        return null;
    }

    @Override
    public final int P(int i, int i2) {
        cfa[] cfaVarArr = this.s.w1;
        if (cfaVarArr[3].c.size() == 0 && !cfaVarArr[3].g) {
            return 5;
        }
        if (i < cfaVarArr[3].c.size()) {
            if (i != 0 && i2 == 0) {
                return 3;
            }
            return 4;
        }
        return 6;
    }

    @Override
    public final int R() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bfa.R():int");
    }

    @Override
    public final View T(int i, View view) {
        nfa nfaVar = this.s;
        cfa[] cfaVarArr = nfaVar.w1;
        if (view == null) {
            view = new l35(28, nfaVar.I1, this.r);
        }
        if (i == 0) {
            view.setAlpha(0.0f);
            return view;
        }
        if (i < cfaVarArr[3].c.size()) {
            view.setAlpha(1.0f);
            ((l35) view).setText(k96.e0(((k27) ((ArrayList) cfaVarArr[3].d.get((String) cfaVarArr[3].c.get(i))).get(0)).k.date, false));
        }
        return view;
    }

    @Override
    public final boolean V(int i, int i2, s49 s49Var) {
        cfa[] cfaVarArr = this.s.w1;
        if (cfaVarArr[3].c.size() != 0 || cfaVarArr[3].g) {
            if (i != 0 && i2 == 0) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public final void W(int i, int i2, s49 s49Var) {
        boolean z;
        char c;
        nfa nfaVar = this.s;
        cfa[] cfaVarArr = nfaVar.w1;
        int i3 = s49Var.f;
        View view = s49Var.a;
        if (i3 != 6 && i3 != 5) {
            ArrayList arrayList = (ArrayList) cfaVarArr[3].d.get((String) cfaVarArr[3].c.get(i));
            int i4 = s49Var.f;
            boolean z2 = false;
            if (i4 != 3) {
                if (i4 == 4) {
                    if (i != 0) {
                        i2--;
                    }
                    if ((view instanceof lba) && i2 >= 0 && i2 < arrayList.size()) {
                        lba lbaVar = (lba) view;
                        k27 k27Var = (k27) arrayList.get(i2);
                        if (i2 == arrayList.size() - 1 && (i != cfaVarArr[3].c.size() - 1 || !cfaVarArr[3].g)) {
                            z = false;
                        } else {
                            z = true;
                        }
                        lbaVar.E = z;
                        lbaVar.e();
                        lbaVar.c0 = k27Var;
                        lbaVar.requestLayout();
                        if (nfaVar.F1) {
                            SparseArray[] sparseArrayArr = nfaVar.c1;
                            if (k27.B0(k27Var.k) == nfaVar.m1) {
                                c = 0;
                            } else {
                                c = 1;
                            }
                            if (sparseArrayArr[c].indexOfKey(k27Var.e1()) >= 0) {
                                z2 = true;
                            }
                            lbaVar.f(z2, !nfaVar.e1);
                            return;
                        }
                        lbaVar.f(false, !nfaVar.e1);
                        return;
                    }
                    return;
                }
                return;
            }
            k27 k27Var2 = (k27) arrayList.get(0);
            if (view instanceof l35) {
                ((l35) view).setText(k96.e0(k27Var2.k.date, false));
            }
        }
    }

    @Override
    public final s49 x(ViewGroup viewGroup, int i) {
        l35 l35Var;
        nfa nfaVar = this.s;
        wjb wjbVar = nfaVar.I1;
        Context context = this.r;
        if (i != 3) {
            if (i != 4) {
                if (i != 5) {
                    pi4 pi4Var = new pi4(context, wjbVar);
                    pi4Var.setIsSingleCell(true);
                    pi4Var.x = false;
                    pi4Var.setViewType(5);
                    l35Var = pi4Var;
                } else {
                    bi G = nfa.G(3, nfaVar.m1, wjbVar, context);
                    G.setLayoutParams(new e49(-1, -1));
                    return new s49(G);
                }
            } else {
                lba lbaVar = new lba(0, wjbVar, context);
                lbaVar.setDelegate(nfaVar.W1);
                l35Var = lbaVar;
            }
        } else {
            l35Var = new l35(28, wjbVar, context);
        }
        return ls6.h(l35Var, l35Var, -1, -2);
    }
}
