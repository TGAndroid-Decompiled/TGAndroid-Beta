package defpackage;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class sia extends y69 {
    public final Context r;
    public final eja s;

    public sia(eja ejaVar, Context context) {
        this.s = ejaVar;
        this.r = context;
    }

    @Override
    public final String F(int i) {
        return null;
    }

    @Override
    public final void G(d79 d79Var, float f, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override
    public final int M(int i) {
        tia[] tiaVarArr = this.s.w1;
        int i2 = 1;
        if ((tiaVarArr[3].c.size() == 0 && !tiaVarArr[3].g) || i >= tiaVarArr[3].c.size()) {
            return 1;
        }
        tia tiaVar = tiaVarArr[3];
        int size = ((ArrayList) tiaVar.d.get(tiaVar.c.get(i))).size();
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
        tia[] tiaVarArr = this.s.w1;
        if (tiaVarArr[3].c.size() == 0 && !tiaVarArr[3].g) {
            return 5;
        }
        if (i < tiaVarArr[3].c.size()) {
            if (i != 0 && i2 == 0) {
                return 3;
            }
            return 4;
        }
        return 6;
    }

    @Override
    public final int R() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sia.R():int");
    }

    @Override
    public final View T(int i, View view) {
        eja ejaVar = this.s;
        tia[] tiaVarArr = ejaVar.w1;
        if (view == null) {
            view = new p55(28, ejaVar.I1, this.r);
        }
        if (i == 0) {
            view.setAlpha(0.0f);
            return view;
        }
        if (i < tiaVarArr[3].c.size()) {
            view.setAlpha(1.0f);
            ((p55) view).setText(ob6.e0(((r47) ((ArrayList) tiaVarArr[3].d.get((String) tiaVarArr[3].c.get(i))).get(0)).k.date, false));
        }
        return view;
    }

    @Override
    public final boolean V(int i, int i2, f89 f89Var) {
        tia[] tiaVarArr = this.s.w1;
        if (tiaVarArr[3].c.size() != 0 || tiaVarArr[3].g) {
            if (i != 0 && i2 == 0) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public final void W(int i, int i2, f89 f89Var) {
        boolean z;
        char c;
        eja ejaVar = this.s;
        tia[] tiaVarArr = ejaVar.w1;
        int i3 = f89Var.f;
        View view = f89Var.a;
        if (i3 != 6 && i3 != 5) {
            ArrayList arrayList = (ArrayList) tiaVarArr[3].d.get((String) tiaVarArr[3].c.get(i));
            int i4 = f89Var.f;
            boolean z2 = false;
            if (i4 != 3) {
                if (i4 == 4) {
                    if (i != 0) {
                        i2--;
                    }
                    if ((view instanceof cfa) && i2 >= 0 && i2 < arrayList.size()) {
                        cfa cfaVar = (cfa) view;
                        r47 r47Var = (r47) arrayList.get(i2);
                        if (i2 == arrayList.size() - 1 && (i != tiaVarArr[3].c.size() - 1 || !tiaVarArr[3].g)) {
                            z = false;
                        } else {
                            z = true;
                        }
                        cfaVar.E = z;
                        cfaVar.e();
                        cfaVar.c0 = r47Var;
                        cfaVar.requestLayout();
                        if (ejaVar.F1) {
                            SparseArray[] sparseArrayArr = ejaVar.c1;
                            if (r47.B0(r47Var.k) == ejaVar.m1) {
                                c = 0;
                            } else {
                                c = 1;
                            }
                            if (sparseArrayArr[c].indexOfKey(r47Var.e1()) >= 0) {
                                z2 = true;
                            }
                            cfaVar.f(z2, !ejaVar.e1);
                            return;
                        }
                        cfaVar.f(false, !ejaVar.e1);
                        return;
                    }
                    return;
                }
                return;
            }
            r47 r47Var2 = (r47) arrayList.get(0);
            if (view instanceof p55) {
                ((p55) view).setText(ob6.e0(r47Var2.k.date, false));
            }
        }
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
        p55 p55Var;
        eja ejaVar = this.s;
        vnb vnbVar = ejaVar.I1;
        Context context = this.r;
        if (i != 3) {
            if (i != 4) {
                if (i != 5) {
                    tk4 tk4Var = new tk4(context, vnbVar);
                    tk4Var.setIsSingleCell(true);
                    tk4Var.x = false;
                    tk4Var.setViewType(5);
                    p55Var = tk4Var;
                } else {
                    ci G = eja.G(3, ejaVar.m1, vnbVar, context);
                    G.setLayoutParams(new r79(-1, -1));
                    return new f89(G);
                }
            } else {
                cfa cfaVar = new cfa(0, vnbVar, context);
                cfaVar.setDelegate(ejaVar.W1);
                p55Var = cfaVar;
            }
        } else {
            p55Var = new p55(28, vnbVar, context);
        }
        return qu6.h(p55Var, p55Var, -1, -2);
    }
}
