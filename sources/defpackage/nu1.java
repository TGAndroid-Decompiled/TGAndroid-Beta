package defpackage;

import android.animation.Animator;
import android.os.Bundle;
import android.util.SparseArray;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
public final class nu1 extends hkb {
    public yv1 w0;

    @Override
    public final void H(int i, int i2, k47 k47Var) {
        a aVar;
        a aVar2;
        f47 T6;
        yv1 yv1Var = this.w0;
        if (yv1Var != null) {
            int min = Math.min(i2, yv1Var.getMessagesController().l4.N1.f() + i);
            if (k47Var.c1() != 0 && (T6 = this.w0.T6(k47Var.c1())) != null && !T6.i) {
                k47Var = T6.h;
            }
            if (k47Var != null) {
                nv1 b = nv1.b(i, min, k47Var);
                if (b.i != null) {
                    ms1 ms1Var = this.w0.a0;
                    boolean z = false;
                    if (ms1Var != null && ms1Var.getVisibility() == 0) {
                        aVar = ((d) this.w0).actionBar;
                        if (aVar != null) {
                            aVar2 = ((d) this.w0).actionBar;
                            if (aVar2.y()) {
                                this.w0.M5(false);
                            }
                        }
                        this.w0.ec(k47Var, b);
                        ms1 ms1Var2 = this.w0.a0;
                        if (ms1Var2 != null) {
                            ms1Var2.j1();
                            return;
                        }
                        return;
                    }
                    yv1 yv1Var2 = this.w0;
                    yv1Var2.D5 = b;
                    yv1Var2.F5 = k47Var;
                    if (yv1Var2.h != null) {
                        z = true;
                    }
                    yv1Var2.x5 = new o47(z, yv1Var2.a8(), sd2.p0(this.w0.e));
                    yv1 yv1Var3 = this.w0;
                    yv1Var3.x5.f(yv1Var3.F5, yv1Var3.T6(k47Var.c1()), this.w0.a(), this.w0.D5);
                    Bundle j = td4.j(3, "onlySelect", "dialogsType", true);
                    j.putBoolean("quote", true);
                    j.putInt("messagesCount", 1);
                    j.putBoolean("canSelectTopics", true);
                    nk3 nk3Var = new nk3(j);
                    yv1 yv1Var4 = this.w0;
                    nk3Var.E2 = yv1Var4;
                    yv1Var4.presentFragment(nk3Var);
                }
            }
        }
    }

    @Override
    public final boolean a() {
        yv1 yv1Var;
        yv1 yv1Var2 = this.w0;
        if ((yv1Var2 == null || yv1Var2.a() != 489000) && (yv1Var = this.w0) != null) {
            if (pg3.B(yv1Var.a()) || !this.w0.a8()) {
                nkb nkbVar = this.W;
                if (nkbVar != null && ((rc2) nkbVar).getMessageObject() != null && ((rc2) this.W).getMessageObject().k != null && ((rc2) this.W).getMessageObject().k.noforwards) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final void c0(yv1 yv1Var) {
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
                this.w0 = yv1Var;
                return;
            }
        }
    }

    @Override
    public final boolean d() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nu1.d():boolean");
    }

    @Override
    public final int n() {
        yv1 yv1Var = this.w0;
        if (yv1Var == null) {
            return 0;
        }
        return yv1Var.Ya;
    }

    @Override
    public final int o() {
        yv1 yv1Var = this.w0;
        if (yv1Var == null) {
            return 0;
        }
        return (int) yv1Var.P9;
    }

    @Override
    public final ylb p() {
        yv1 yv1Var = this.w0;
        if (yv1Var != null) {
            return yv1Var.Ba;
        }
        return null;
    }

    @Override
    public final int s(int i) {
        return cmb.v0(i, this.w0.Ba);
    }
}
