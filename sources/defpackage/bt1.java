package defpackage;

import android.animation.Animator;
import android.os.Bundle;
import android.util.SparseArray;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
public final class bt1 extends gib {
    public mu1 w0;

    @Override
    public final void H(int i, int i2, k27 k27Var) {
        a aVar;
        a aVar2;
        f27 M6;
        mu1 mu1Var = this.w0;
        if (mu1Var != null) {
            int min = Math.min(i2, mu1Var.getMessagesController().k4.N1.f() + i);
            if (k27Var.c1() != 0 && (M6 = this.w0.M6(k27Var.c1())) != null && !M6.i) {
                k27Var = M6.h;
            }
            if (k27Var != null) {
                bu1 b = bu1.b(i, min, k27Var);
                if (b.i != null) {
                    ar1 ar1Var = this.w0.a0;
                    boolean z = false;
                    if (ar1Var != null && ar1Var.getVisibility() == 0) {
                        aVar = ((d) this.w0).actionBar;
                        if (aVar != null) {
                            aVar2 = ((d) this.w0).actionBar;
                            if (aVar2.y()) {
                                this.w0.F5(false);
                            }
                        }
                        this.w0.Sb(k27Var, b);
                        ar1 ar1Var2 = this.w0.a0;
                        if (ar1Var2 != null) {
                            ar1Var2.h1();
                            return;
                        }
                        return;
                    }
                    mu1 mu1Var2 = this.w0;
                    mu1Var2.D5 = b;
                    mu1Var2.F5 = k27Var;
                    if (mu1Var2.h != null) {
                        z = true;
                    }
                    mu1Var2.x5 = new o27(z, mu1Var2.R7(), hc2.p0(this.w0.e));
                    mu1 mu1Var3 = this.w0;
                    mu1Var3.x5.f(mu1Var3.F5, mu1Var3.M6(k27Var.c1()), this.w0.a(), this.w0.D5);
                    Bundle j = tb4.j(3, "onlySelect", "dialogsType", true);
                    j.putBoolean("quote", true);
                    j.putInt("messagesCount", 1);
                    j.putBoolean("canSelectTopics", true);
                    cj3 cj3Var = new cj3(j);
                    mu1 mu1Var4 = this.w0;
                    cj3Var.E2 = mu1Var4;
                    mu1Var4.presentFragment(cj3Var);
                }
            }
        }
    }

    @Override
    public final boolean a() {
        mu1 mu1Var;
        mu1 mu1Var2 = this.w0;
        if ((mu1Var2 == null || mu1Var2.a() != 489000) && (mu1Var = this.w0) != null) {
            if (cf3.B(mu1Var.a()) || !this.w0.R7()) {
                mib mibVar = this.W;
                if (mibVar != null && ((gb2) mibVar).getMessageObject() != null && ((gb2) this.W).getMessageObject().k != null && ((gb2) this.W).getMessageObject().k.noforwards) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final void c0(mu1 mu1Var) {
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.p0;
            if (i < sparseArray.size()) {
                ((Animator) sparseArray.get(sparseArray.keyAt(i))).cancel();
                i++;
            } else {
                sparseArray.clear();
                e(false);
                this.C = null;
                this.w0 = mu1Var;
                return;
            }
        }
    }

    @Override
    public final boolean d() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bt1.d():boolean");
    }

    @Override
    public final int n() {
        mu1 mu1Var = this.w0;
        if (mu1Var == null) {
            return 0;
        }
        return mu1Var.Ya;
    }

    @Override
    public final int o() {
        mu1 mu1Var = this.w0;
        if (mu1Var == null) {
            return 0;
        }
        return (int) mu1Var.P9;
    }

    @Override
    public final wjb p() {
        mu1 mu1Var = this.w0;
        if (mu1Var != null) {
            return mu1Var.Ba;
        }
        return null;
    }

    @Override
    public final int s(int i) {
        return bkb.v0(i, this.w0.Ba);
    }
}
