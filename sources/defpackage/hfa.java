package defpackage;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public class hfa extends w29 {
    public final Context c;
    public boolean d;
    public jb4 e;
    public final nfa f;

    public hfa(nfa nfaVar, Context context) {
        this.f = nfaVar;
        this.c = context;
    }

    @Override
    public boolean D(s49 s49Var) {
        return false;
    }

    @Override
    public final boolean E(o39 o39Var) {
        int i;
        nfa nfaVar = this.f;
        if (!nfaVar.q0()) {
            if (this != nfaVar.K && nfaVar.x1(this) == -1) {
                i = nfaVar.t1;
            } else {
                i = nfaVar.p1[0];
            }
            int ceil = (int) Math.ceil(e() / i);
            if (o39Var.getChildCount() != 0 && o39Var.getChildAt(0).getMeasuredHeight() * ceil > o39Var.getMeasuredHeight()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String F(int i) {
        ArrayList arrayList = this.f.w1[0].e;
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
        int i;
        int measuredHeight = o39Var.getChildAt(0).getMeasuredHeight();
        nfa nfaVar = this.f;
        if (nfaVar.y1(this) == -1 && this != nfaVar.L) {
            int x1 = nfaVar.x1(this);
            int[] iArr2 = nfaVar.p1;
            if (x1 != -1) {
                i = iArr2[1];
            } else {
                i = iArr2[0];
            }
        } else {
            i = nfaVar.t1;
        }
        int ceil = (int) (Math.ceil(e() / i) * measuredHeight);
        int measuredHeight2 = o39Var.getMeasuredHeight() - o39Var.getPaddingTop();
        if (measuredHeight == 0) {
            iArr[1] = 0;
            iArr[0] = 0;
            return;
        }
        float f2 = f * (ceil - measuredHeight2);
        iArr[0] = ((int) (f2 / measuredHeight)) * i;
        iArr[1] = ((int) f2) % measuredHeight;
    }

    @Override
    public final float H(o39 o39Var) {
        int i;
        nfa nfaVar = this.f;
        if (this != nfaVar.L && nfaVar.y1(this) == -1) {
            int x1 = nfaVar.x1(this);
            int[] iArr = nfaVar.p1;
            if (x1 != -1) {
                i = iArr[1];
            } else {
                i = iArr[0];
            }
        } else {
            i = nfaVar.t1;
        }
        int ceil = (int) Math.ceil(e() / i);
        if (o39Var.getChildCount() != 0) {
            int measuredHeight = o39Var.getChildAt(0).getMeasuredHeight();
            View childAt = o39Var.getChildAt(0);
            int R = RecyclerView.R(childAt);
            if (R < 0) {
                return 0.0f;
            }
            return (((R / i) * measuredHeight) - (childAt.getTop() - o39Var.getPaddingTop())) / ((ceil * measuredHeight) - (o39Var.getMeasuredHeight() - o39Var.getPaddingTop()));
        }
        return 0.0f;
    }

    @Override
    public void I() {
        this.f.n1(0, true);
    }

    @Override
    public final void J(o39 o39Var) {
        if (this.d) {
            this.d = false;
            int i = 0;
            for (int i2 = 0; i2 < o39Var.getChildCount(); i2++) {
                View childAt = o39Var.getChildAt(i2);
                if (childAt instanceof qfa) {
                    i = ((qfa) childAt).getMessageId();
                }
                if (i != 0) {
                    break;
                }
            }
            if (i == 0) {
                this.f.L(0, o39Var, true);
            }
        }
    }

    @Override
    public final void K() {
        this.d = true;
        iea P = this.f.P(0);
        if (P != null) {
            nfa.m1(P, null, false);
        }
    }

    public int L(int i) {
        return this.f.w1[0].m + i;
    }

    @Override
    public int b() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hfa.b():int");
    }

    @Override
    public int d(int i) {
        cfa[] cfaVarArr = this.f.w1;
        if (!this.d && cfaVarArr[0].c().size() == 0) {
            cfa cfaVar = cfaVarArr[0];
            if (!cfaVar.g && cfaVar.l) {
                return 2;
            }
        }
        cfaVarArr[0].getClass();
        cfaVarArr[0].c().size();
        cfaVarArr[0].getClass();
        return 0;
    }

    @Override
    public int e() {
        return this.f.w1[0].e();
    }

    @Override
    public void t(s49 s49Var, int i) {
        int i2;
        boolean z;
        char c;
        nfa nfaVar = this.f;
        int[] iArr = nfaVar.p1;
        cfa[] cfaVarArr = nfaVar.w1;
        if (s49Var.f == 0) {
            ArrayList c2 = cfaVarArr[0].c();
            int d = i - cfaVarArr[0].d();
            View view = s49Var.a;
            if (view instanceof qfa) {
                qfa qfaVar = (qfa) view;
                int messageId = qfaVar.getMessageId();
                boolean z2 = true;
                if (this == nfaVar.K) {
                    i2 = iArr[0];
                } else if (nfaVar.x1(this) != -1) {
                    i2 = iArr[1];
                } else {
                    i2 = nfaVar.t1;
                }
                if (d >= 0 && d < c2.size()) {
                    k27 k27Var = (k27) c2.get(d);
                    if (k27Var.e1() == messageId) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (nfaVar.F1) {
                        SparseArray[] sparseArrayArr = nfaVar.c1;
                        if (k27.B0(k27Var.k) == nfaVar.m1) {
                            c = 0;
                        } else {
                            c = 1;
                        }
                        if (sparseArrayArr[c].indexOfKey(k27Var.e1()) < 0) {
                            z2 = false;
                        }
                        qfaVar.i(z2, z);
                    } else {
                        qfaVar.i(false, z);
                    }
                    qfaVar.k(k27Var, i2, false);
                    return;
                }
                qfaVar.k(null, i2, false);
                qfaVar.i(false, false);
            }
        }
    }

    @Override
    public s49 x(ViewGroup viewGroup, int i) {
        nfa nfaVar = this.f;
        wjb wjbVar = nfaVar.I1;
        Context context = this.c;
        if (i != 0 && i != 19) {
            bi G = nfa.G(0, nfaVar.m1, wjbVar, context);
            G.setLayoutParams(new e49(-1, -1));
            return new s49(G);
        }
        if (this.e == null) {
            this.e = new jb4(viewGroup.getContext(), wjbVar);
        }
        qfa qfaVar = new qfa(context, this.e, nfaVar.y1.getCurrentAccount());
        if (i == 19) {
            qfaVar.x0 = true;
        }
        qfaVar.setGradientView(nfaVar.E);
        if (nfaVar.x1(this) != -1) {
            qfaVar.e0 = true;
        }
        qfaVar.setLayoutParams(new e49(-1, -2));
        return new s49(qfaVar);
    }
}
