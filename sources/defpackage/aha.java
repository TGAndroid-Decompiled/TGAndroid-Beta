package defpackage;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class aha extends z49 {
    public final Context c;
    public final byte d;
    public boolean e;
    public final nha f;

    public aha(nha nhaVar, Context context, int i) {
        this.f = nhaVar;
        this.c = context;
        this.d = i;
    }

    @Override
    public final boolean D(u69 u69Var) {
        return true;
    }

    @Override
    public final String F(int i) {
        ArrayList arrayList = this.f.w1[this.d].e;
        if (!arrayList.isEmpty()) {
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                if (i <= ((nga) arrayList.get(i2)).b) {
                    return ((nga) arrayList.get(i2)).a;
                }
            }
            return ((nga) b10.f(1, arrayList)).a;
        }
        return "";
    }

    @Override
    public final void G(r59 r59Var, float f, int[] iArr) {
        int measuredHeight = r59Var.getChildAt(0).getMeasuredHeight();
        float e = f * ((e() * measuredHeight) - (r59Var.getMeasuredHeight() - r59Var.getPaddingTop()));
        iArr[0] = (int) (e / measuredHeight);
        iArr[1] = ((int) e) % measuredHeight;
    }

    @Override
    public final void J(r59 r59Var) {
        if (this.e) {
            this.e = false;
            int i = 0;
            for (int i2 = 0; i2 < r59Var.getChildCount() && (i = nha.Q(r59Var.getChildAt(i2))) == 0; i2++) {
            }
            if (i == 0) {
                this.f.L(this.d, r59Var, true);
            }
        }
    }

    @Override
    public final void K() {
        this.e = true;
        iga P = this.f.P(this.d);
        if (P != null) {
            nha.m1(P, null, false);
        }
    }

    @Override
    public final int b() {
        int i;
        int i2;
        cha[] chaVarArr = this.f.w1;
        byte b = this.d;
        cha chaVar = chaVarArr[b];
        if (chaVar.o) {
            return chaVar.e();
        }
        if (chaVar.a.size() == 0 && !chaVarArr[b].g) {
            return 1;
        }
        if (chaVarArr[b].a.size() == 0) {
            cha chaVar2 = chaVarArr[b];
            boolean[] zArr = chaVar2.i;
            if ((!zArr[0] || !zArr[1]) && chaVar2.l) {
                return 0;
            }
        }
        if (chaVarArr[b].e() == 0) {
            int size = chaVarArr[b].c().size() + chaVarArr[b].d();
            if (size != 0) {
                cha chaVar3 = chaVarArr[b];
                boolean[] zArr2 = chaVar3.i;
                if (!zArr2[0] || !zArr2[1]) {
                    boolean z = chaVar3.r;
                    if (z) {
                        i = chaVar3.u;
                    } else {
                        i = chaVar3.n;
                    }
                    if (i != 0) {
                        if (z) {
                            i2 = chaVar3.u;
                        } else {
                            i2 = chaVar3.n;
                        }
                        return i2 + size;
                    }
                    return size + 1;
                }
                return size;
            }
            return size;
        }
        return Math.max(chaVarArr[b].e(), chaVarArr[b].c().size() + chaVarArr[b].d());
    }

    @Override
    public final int d(int i) {
        cha[] chaVarArr = this.f.w1;
        byte b = this.d;
        if (chaVarArr[b].c.size() == 0 && !chaVarArr[b].g) {
            return 9;
        }
        cha chaVar = chaVarArr[b];
        int i2 = chaVar.m;
        if (i >= i2 && i < chaVar.a.size() + i2) {
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
    public final void t(u69 u69Var, int i) {
        boolean z;
        char c;
        boolean z2;
        char c2;
        nha nhaVar = this.f;
        long j = nhaVar.m1;
        SparseArray[] sparseArrayArr = nhaVar.c1;
        cha chaVar = nhaVar.w1[this.d];
        ArrayList arrayList = chaVar.a;
        int i2 = u69Var.f;
        View view = u69Var.a;
        boolean z3 = false;
        if (i2 != 7) {
            if (i2 == 10 && (view instanceof eda)) {
                eda edaVar = (eda) view;
                k47 k47Var = (k47) arrayList.get(i - chaVar.m);
                if (i != arrayList.size() - 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                edaVar.f(k47Var, z2);
                if (nhaVar.F1) {
                    if (k47.B0(k47Var.k) == j) {
                        c2 = 0;
                    } else {
                        c2 = 1;
                    }
                    if (sparseArrayArr[c2].indexOfKey(k47Var.e1()) >= 0) {
                        z3 = true;
                    }
                    edaVar.e(z3, !nhaVar.e1);
                    return;
                }
                edaVar.e(false, !nhaVar.e1);
            }
        } else if (!(view instanceof ida)) {
        } else {
            ida idaVar = (ida) view;
            k47 k47Var2 = (k47) arrayList.get(i - chaVar.m);
            if (i != arrayList.size() - 1) {
                z = true;
            } else {
                z = false;
            }
            idaVar.c(k47Var2, z);
            if (nhaVar.F1) {
                if (k47.B0(k47Var2.k) == j) {
                    c = 0;
                } else {
                    c = 1;
                }
                if (sparseArrayArr[c].indexOfKey(k47Var2.e1()) >= 0) {
                    z3 = true;
                }
                idaVar.b(z3, !nhaVar.e1);
                return;
            }
            idaVar.b(false, !nhaVar.e1);
        }
    }

    @Override
    public final u69 x(ViewGroup viewGroup, int i) {
        View view;
        View wg4Var;
        nha nhaVar = this.f;
        tk4 tk4Var = nhaVar.E;
        ArrayList arrayList = nhaVar.J0;
        ylb ylbVar = nhaVar.I1;
        Context context = this.c;
        if (i != 7) {
            byte b = this.d;
            if (i != 8) {
                if (i != 9) {
                    if (b == 4 && !arrayList.isEmpty()) {
                        View view2 = (View) arrayList.get(0);
                        arrayList.remove(0);
                        ViewGroup viewGroup2 = (ViewGroup) view2.getParent();
                        wg4Var = view2;
                        if (viewGroup2 != null) {
                            viewGroup2.removeView(view2);
                            wg4Var = view2;
                        }
                    } else {
                        wg4Var = new wg4(this, context, ylbVar, (byte) 2);
                    }
                    eda edaVar = (eda) wg4Var;
                    edaVar.setGlobalGradientView(tk4Var);
                    view = wg4Var;
                    if (b == 4) {
                        nhaVar.K0.add(edaVar);
                        view = wg4Var;
                    }
                } else {
                    bj G = nha.G(b, nhaVar.m1, ylbVar, context);
                    G.setLayoutParams(new g69(-1, -1));
                    return new u69(G);
                }
            } else {
                tk4 tk4Var2 = new tk4(context, ylbVar);
                if (b == 2) {
                    tk4Var2.setViewType(4);
                } else {
                    tk4Var2.setViewType(3);
                }
                tk4Var2.x = false;
                tk4Var2.setIsSingleCell(true);
                tk4Var2.setGlobalGradientView(tk4Var);
                view = tk4Var2;
            }
        } else {
            ida idaVar = new ida(0, ylbVar, context);
            idaVar.setGlobalGradientView(tk4Var);
            view = idaVar;
        }
        return kt6.h(view, view, -1, -2);
    }
}
