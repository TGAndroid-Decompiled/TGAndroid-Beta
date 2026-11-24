package defpackage;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public class hha extends z49 {
    public final Context c;
    public boolean d;
    public jd4 e;
    public final nha f;

    public hha(nha nhaVar, Context context) {
        this.f = nhaVar;
        this.c = context;
    }

    @Override
    public boolean D(u69 u69Var) {
        return false;
    }

    @Override
    public final boolean E(r59 r59Var) {
        int i;
        nha nhaVar = this.f;
        if (!nhaVar.q0()) {
            if (this != nhaVar.K && nhaVar.x1(this) == -1) {
                i = nhaVar.t1;
            } else {
                i = nhaVar.p1[0];
            }
            int ceil = (int) Math.ceil(e() / i);
            if (r59Var.getChildCount() != 0 && r59Var.getChildAt(0).getMeasuredHeight() * ceil > r59Var.getMeasuredHeight()) {
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
        int i;
        int measuredHeight = r59Var.getChildAt(0).getMeasuredHeight();
        nha nhaVar = this.f;
        if (nhaVar.y1(this) == -1 && this != nhaVar.L) {
            int x1 = nhaVar.x1(this);
            int[] iArr2 = nhaVar.p1;
            if (x1 != -1) {
                i = iArr2[1];
            } else {
                i = iArr2[0];
            }
        } else {
            i = nhaVar.t1;
        }
        int ceil = (int) (Math.ceil(e() / i) * measuredHeight);
        int measuredHeight2 = r59Var.getMeasuredHeight() - r59Var.getPaddingTop();
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
    public final float H(r59 r59Var) {
        int i;
        nha nhaVar = this.f;
        if (this != nhaVar.L && nhaVar.y1(this) == -1) {
            int x1 = nhaVar.x1(this);
            int[] iArr = nhaVar.p1;
            if (x1 != -1) {
                i = iArr[1];
            } else {
                i = iArr[0];
            }
        } else {
            i = nhaVar.t1;
        }
        int ceil = (int) Math.ceil(e() / i);
        if (r59Var.getChildCount() != 0) {
            int measuredHeight = r59Var.getChildAt(0).getMeasuredHeight();
            View childAt = r59Var.getChildAt(0);
            int R = RecyclerView.R(childAt);
            if (R < 0) {
                return 0.0f;
            }
            return (((R / i) * measuredHeight) - (childAt.getTop() - r59Var.getPaddingTop())) / ((ceil * measuredHeight) - (r59Var.getMeasuredHeight() - r59Var.getPaddingTop()));
        }
        return 0.0f;
    }

    @Override
    public void I() {
        this.f.n1(0, true);
    }

    @Override
    public final void J(r59 r59Var) {
        if (this.d) {
            this.d = false;
            int i = 0;
            for (int i2 = 0; i2 < r59Var.getChildCount(); i2++) {
                View childAt = r59Var.getChildAt(i2);
                if (childAt instanceof sha) {
                    i = ((sha) childAt).getMessageId();
                }
                if (i != 0) {
                    break;
                }
            }
            if (i == 0) {
                this.f.L(0, r59Var, true);
            }
        }
    }

    @Override
    public final void K() {
        this.d = true;
        iga P = this.f.P(0);
        if (P != null) {
            nha.m1(P, null, false);
        }
    }

    public int L(int i) {
        return this.f.w1[0].m + i;
    }

    @Override
    public int b() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hha.b():int");
    }

    @Override
    public int d(int i) {
        cha[] chaVarArr = this.f.w1;
        if (!this.d && chaVarArr[0].c().size() == 0) {
            cha chaVar = chaVarArr[0];
            if (!chaVar.g && chaVar.l) {
                return 2;
            }
        }
        chaVarArr[0].getClass();
        chaVarArr[0].c().size();
        chaVarArr[0].getClass();
        return 0;
    }

    @Override
    public int e() {
        return this.f.w1[0].e();
    }

    @Override
    public void t(u69 u69Var, int i) {
        int i2;
        boolean z;
        char c;
        nha nhaVar = this.f;
        int[] iArr = nhaVar.p1;
        cha[] chaVarArr = nhaVar.w1;
        if (u69Var.f == 0) {
            ArrayList c2 = chaVarArr[0].c();
            int d = i - chaVarArr[0].d();
            View view = u69Var.a;
            if (view instanceof sha) {
                sha shaVar = (sha) view;
                int messageId = shaVar.getMessageId();
                boolean z2 = true;
                if (this == nhaVar.K) {
                    i2 = iArr[0];
                } else if (nhaVar.x1(this) != -1) {
                    i2 = iArr[1];
                } else {
                    i2 = nhaVar.t1;
                }
                if (d >= 0 && d < c2.size()) {
                    k47 k47Var = (k47) c2.get(d);
                    if (k47Var.e1() == messageId) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (nhaVar.F1) {
                        SparseArray[] sparseArrayArr = nhaVar.c1;
                        if (k47.B0(k47Var.k) == nhaVar.m1) {
                            c = 0;
                        } else {
                            c = 1;
                        }
                        if (sparseArrayArr[c].indexOfKey(k47Var.e1()) < 0) {
                            z2 = false;
                        }
                        shaVar.i(z2, z);
                    } else {
                        shaVar.i(false, z);
                    }
                    shaVar.k(k47Var, i2, false);
                    return;
                }
                shaVar.k(null, i2, false);
                shaVar.i(false, false);
            }
        }
    }

    @Override
    public u69 x(ViewGroup viewGroup, int i) {
        nha nhaVar = this.f;
        ylb ylbVar = nhaVar.I1;
        Context context = this.c;
        if (i != 0 && i != 19) {
            bj G = nha.G(0, nhaVar.m1, ylbVar, context);
            G.setLayoutParams(new g69(-1, -1));
            return new u69(G);
        }
        if (this.e == null) {
            this.e = new jd4(viewGroup.getContext(), ylbVar);
        }
        sha shaVar = new sha(context, this.e, nhaVar.y1.getCurrentAccount());
        if (i == 19) {
            shaVar.x0 = true;
        }
        shaVar.setGradientView(nhaVar.E);
        if (nhaVar.x1(this) != -1) {
            shaVar.e0 = true;
        }
        shaVar.setLayoutParams(new g69(-1, -2));
        return new u69(shaVar);
    }
}
