package defpackage;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public class yia extends l69 {
    public final Context c;
    public boolean d;
    public gd4 e;
    public final eja f;

    public yia(eja ejaVar, Context context) {
        this.f = ejaVar;
        this.c = context;
    }

    @Override
    public boolean D(f89 f89Var) {
        return false;
    }

    @Override
    public final boolean E(d79 d79Var) {
        int i;
        eja ejaVar = this.f;
        if (!ejaVar.q0()) {
            if (this != ejaVar.K && ejaVar.x1(this) == -1) {
                i = ejaVar.t1;
            } else {
                i = ejaVar.p1[0];
            }
            int ceil = (int) Math.ceil(e() / i);
            if (d79Var.getChildCount() != 0 && d79Var.getChildAt(0).getMeasuredHeight() * ceil > d79Var.getMeasuredHeight()) {
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
                if (i <= ((eia) arrayList.get(i2)).b) {
                    return ((eia) arrayList.get(i2)).a;
                }
            }
            return ((eia) c00.g(1, arrayList)).a;
        }
        return "";
    }

    @Override
    public final void G(d79 d79Var, float f, int[] iArr) {
        int i;
        int measuredHeight = d79Var.getChildAt(0).getMeasuredHeight();
        eja ejaVar = this.f;
        if (ejaVar.y1(this) == -1 && this != ejaVar.L) {
            int x1 = ejaVar.x1(this);
            int[] iArr2 = ejaVar.p1;
            if (x1 != -1) {
                i = iArr2[1];
            } else {
                i = iArr2[0];
            }
        } else {
            i = ejaVar.t1;
        }
        int ceil = (int) (Math.ceil(e() / i) * measuredHeight);
        int measuredHeight2 = d79Var.getMeasuredHeight() - d79Var.getPaddingTop();
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
    public final float H(d79 d79Var) {
        int i;
        eja ejaVar = this.f;
        if (this != ejaVar.L && ejaVar.y1(this) == -1) {
            int x1 = ejaVar.x1(this);
            int[] iArr = ejaVar.p1;
            if (x1 != -1) {
                i = iArr[1];
            } else {
                i = iArr[0];
            }
        } else {
            i = ejaVar.t1;
        }
        int ceil = (int) Math.ceil(e() / i);
        if (d79Var.getChildCount() != 0) {
            int measuredHeight = d79Var.getChildAt(0).getMeasuredHeight();
            View childAt = d79Var.getChildAt(0);
            int S = RecyclerView.S(childAt);
            if (S < 0) {
                return 0.0f;
            }
            return (((S / i) * measuredHeight) - (childAt.getTop() - d79Var.getPaddingTop())) / ((ceil * measuredHeight) - (d79Var.getMeasuredHeight() - d79Var.getPaddingTop()));
        }
        return 0.0f;
    }

    @Override
    public void I() {
        this.f.n1(0, true);
    }

    @Override
    public final void J(d79 d79Var) {
        if (this.d) {
            this.d = false;
            int i = 0;
            for (int i2 = 0; i2 < d79Var.getChildCount(); i2++) {
                View childAt = d79Var.getChildAt(i2);
                if (childAt instanceof jja) {
                    i = ((jja) childAt).getMessageId();
                }
                if (i != 0) {
                    break;
                }
            }
            if (i == 0) {
                this.f.L(0, d79Var, true);
            }
        }
    }

    @Override
    public final void K() {
        this.d = true;
        zha P = this.f.P(0);
        if (P != null) {
            eja.m1(P, null, false);
        }
    }

    public int L(int i) {
        return this.f.w1[0].m + i;
    }

    @Override
    public int b() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yia.b():int");
    }

    @Override
    public int d(int i) {
        tia[] tiaVarArr = this.f.w1;
        if (!this.d && tiaVarArr[0].c().size() == 0) {
            tia tiaVar = tiaVarArr[0];
            if (!tiaVar.g && tiaVar.l) {
                return 2;
            }
        }
        tiaVarArr[0].getClass();
        tiaVarArr[0].c().size();
        tiaVarArr[0].getClass();
        return 0;
    }

    @Override
    public int e() {
        return this.f.w1[0].e();
    }

    @Override
    public void t(f89 f89Var, int i) {
        int i2;
        boolean z;
        char c;
        eja ejaVar = this.f;
        int[] iArr = ejaVar.p1;
        tia[] tiaVarArr = ejaVar.w1;
        if (f89Var.f == 0) {
            ArrayList c2 = tiaVarArr[0].c();
            int d = i - tiaVarArr[0].d();
            View view = f89Var.a;
            if (view instanceof jja) {
                jja jjaVar = (jja) view;
                int messageId = jjaVar.getMessageId();
                boolean z2 = true;
                if (this == ejaVar.K) {
                    i2 = iArr[0];
                } else if (ejaVar.x1(this) != -1) {
                    i2 = iArr[1];
                } else {
                    i2 = ejaVar.t1;
                }
                if (d >= 0 && d < c2.size()) {
                    r47 r47Var = (r47) c2.get(d);
                    if (r47Var.e1() == messageId) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (ejaVar.F1) {
                        SparseArray[] sparseArrayArr = ejaVar.c1;
                        if (r47.B0(r47Var.k) == ejaVar.m1) {
                            c = 0;
                        } else {
                            c = 1;
                        }
                        if (sparseArrayArr[c].indexOfKey(r47Var.e1()) < 0) {
                            z2 = false;
                        }
                        jjaVar.i(z2, z);
                    } else {
                        jjaVar.i(false, z);
                    }
                    jjaVar.k(i2, r47Var, false);
                    return;
                }
                jjaVar.k(i2, null, false);
                jjaVar.i(false, false);
            }
        }
    }

    @Override
    public f89 x(ViewGroup viewGroup, int i) {
        eja ejaVar = this.f;
        vnb vnbVar = ejaVar.I1;
        Context context = this.c;
        if (i != 0 && i != 19) {
            ci G = eja.G(0, ejaVar.m1, vnbVar, context);
            G.setLayoutParams(new r79(-1, -1));
            return new f89(G);
        }
        if (this.e == null) {
            this.e = new gd4(viewGroup.getContext(), vnbVar);
        }
        jja jjaVar = new jja(context, this.e, ejaVar.y1.getCurrentAccount());
        if (i == 19) {
            jjaVar.x0 = true;
        }
        jjaVar.setGradientView(ejaVar.E);
        if (ejaVar.x1(this) != -1) {
            jjaVar.e0 = true;
        }
        jjaVar.setLayoutParams(new r79(-1, -2));
        return new f89(jjaVar);
    }
}
