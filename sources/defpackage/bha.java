package defpackage;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class bha extends m59 {
    public final Context r;
    public final nha s;

    public bha(nha nhaVar, Context context) {
        this.s = nhaVar;
        this.r = context;
    }

    @Override
    public final String F(int i) {
        return null;
    }

    @Override
    public final void G(r59 r59Var, float f, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override
    public final int M(int i) {
        cha[] chaVarArr = this.s.w1;
        int i2 = 1;
        if ((chaVarArr[3].c.size() == 0 && !chaVarArr[3].g) || i >= chaVarArr[3].c.size()) {
            return 1;
        }
        cha chaVar = chaVarArr[3];
        int size = ((ArrayList) chaVar.d.get(chaVar.c.get(i))).size();
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
        cha[] chaVarArr = this.s.w1;
        if (chaVarArr[3].c.size() == 0 && !chaVarArr[3].g) {
            return 5;
        }
        if (i < chaVarArr[3].c.size()) {
            if (i != 0 && i2 == 0) {
                return 3;
            }
            return 4;
        }
        return 6;
    }

    @Override
    public final int R() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bha.R():int");
    }

    @Override
    public final View T(int i, View view) {
        nha nhaVar = this.s;
        cha[] chaVarArr = nhaVar.w1;
        if (view == null) {
            view = new l55(28, nhaVar.I1, this.r);
        }
        if (i == 0) {
            view.setAlpha(0.0f);
            return view;
        }
        if (i < chaVarArr[3].c.size()) {
            view.setAlpha(1.0f);
            ((l55) view).setText(jb6.e0(((k47) ((ArrayList) chaVarArr[3].d.get((String) chaVarArr[3].c.get(i))).get(0)).k.date, false));
        }
        return view;
    }

    @Override
    public final boolean V(int i, int i2, u69 u69Var) {
        cha[] chaVarArr = this.s.w1;
        if (chaVarArr[3].c.size() != 0 || chaVarArr[3].g) {
            if (i != 0 && i2 == 0) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public final void W(int i, int i2, u69 u69Var) {
        boolean z;
        char c;
        nha nhaVar = this.s;
        cha[] chaVarArr = nhaVar.w1;
        int i3 = u69Var.f;
        View view = u69Var.a;
        if (i3 != 6 && i3 != 5) {
            ArrayList arrayList = (ArrayList) chaVarArr[3].d.get((String) chaVarArr[3].c.get(i));
            int i4 = u69Var.f;
            boolean z2 = false;
            if (i4 != 3) {
                if (i4 == 4) {
                    if (i != 0) {
                        i2--;
                    }
                    if ((view instanceof lda) && i2 >= 0 && i2 < arrayList.size()) {
                        lda ldaVar = (lda) view;
                        k47 k47Var = (k47) arrayList.get(i2);
                        if (i2 == arrayList.size() - 1 && (i != chaVarArr[3].c.size() - 1 || !chaVarArr[3].g)) {
                            z = false;
                        } else {
                            z = true;
                        }
                        ldaVar.E = z;
                        ldaVar.e();
                        ldaVar.c0 = k47Var;
                        ldaVar.requestLayout();
                        if (nhaVar.F1) {
                            SparseArray[] sparseArrayArr = nhaVar.c1;
                            if (k47.B0(k47Var.k) == nhaVar.m1) {
                                c = 0;
                            } else {
                                c = 1;
                            }
                            if (sparseArrayArr[c].indexOfKey(k47Var.e1()) >= 0) {
                                z2 = true;
                            }
                            ldaVar.f(z2, !nhaVar.e1);
                            return;
                        }
                        ldaVar.f(false, !nhaVar.e1);
                        return;
                    }
                    return;
                }
                return;
            }
            k47 k47Var2 = (k47) arrayList.get(0);
            if (view instanceof l55) {
                ((l55) view).setText(jb6.e0(k47Var2.k.date, false));
            }
        }
    }

    @Override
    public final u69 x(ViewGroup viewGroup, int i) {
        l55 l55Var;
        nha nhaVar = this.s;
        ylb ylbVar = nhaVar.I1;
        Context context = this.r;
        if (i != 3) {
            if (i != 4) {
                if (i != 5) {
                    tk4 tk4Var = new tk4(context, ylbVar);
                    tk4Var.setIsSingleCell(true);
                    tk4Var.x = false;
                    tk4Var.setViewType(5);
                    l55Var = tk4Var;
                } else {
                    bj G = nha.G(3, nhaVar.m1, ylbVar, context);
                    G.setLayoutParams(new g69(-1, -1));
                    return new u69(G);
                }
            } else {
                lda ldaVar = new lda(0, ylbVar, context);
                ldaVar.setDelegate(nhaVar.W1);
                l55Var = ldaVar;
            }
        } else {
            l55Var = new l55(28, ylbVar, context);
        }
        return kt6.h(l55Var, l55Var, -1, -2);
    }
}
