package defpackage;

import android.animation.Animator;
import android.os.Bundle;
import android.util.SparseArray;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.e;
public final class ot1 extends bmb {
    public zu1 w0;

    @Override
    public final void H(int i, int i2, r47 r47Var) {
        a aVar;
        a aVar2;
        m47 T6;
        zu1 zu1Var = this.w0;
        if (zu1Var != null) {
            int min = Math.min(i2, zu1Var.getMessagesController().k4.V1.f() + i);
            if (r47Var.c1() != 0 && (T6 = this.w0.T6(r47Var.c1())) != null && !T6.i) {
                r47Var = T6.h;
            }
            if (r47Var != null) {
                ou1 b = ou1.b(i, min, r47Var);
                if (b.i != null) {
                    nr1 nr1Var = this.w0.a0;
                    boolean z = false;
                    if (nr1Var != null && nr1Var.getVisibility() == 0) {
                        aVar = ((e) this.w0).actionBar;
                        if (aVar != null) {
                            aVar2 = ((e) this.w0).actionBar;
                            if (aVar2.z()) {
                                this.w0.L5(false);
                            }
                        }
                        this.w0.ec(r47Var, b);
                        nr1 nr1Var2 = this.w0.a0;
                        if (nr1Var2 != null) {
                            nr1Var2.o1();
                            return;
                        }
                        return;
                    }
                    zu1 zu1Var2 = this.w0;
                    zu1Var2.D5 = b;
                    zu1Var2.F5 = r47Var;
                    if (zu1Var2.h != null) {
                        z = true;
                    }
                    zu1Var2.x5 = new v47(z, zu1Var2.a8(), xc2.p0(this.w0.e));
                    zu1 zu1Var3 = this.w0;
                    zu1Var3.x5.f(zu1Var3.F5, zu1Var3.T6(r47Var.c1()), this.w0.a(), this.w0.D5);
                    Bundle j = qd4.j(3, "onlySelect", "dialogsType", true);
                    j.putBoolean("quote", true);
                    j.putInt("messagesCount", 1);
                    j.putBoolean("canSelectTopics", true);
                    uj3 uj3Var = new uj3(j);
                    zu1 zu1Var4 = this.w0;
                    uj3Var.E2 = zu1Var4;
                    zu1Var4.presentFragment(uj3Var);
                }
            }
        }
    }

    @Override
    public final boolean a() {
        zu1 zu1Var;
        zu1 zu1Var2 = this.w0;
        if ((zu1Var2 == null || zu1Var2.a() != 489000) && (zu1Var = this.w0) != null) {
            if (wf3.B(zu1Var.a()) || !this.w0.a8()) {
                hmb hmbVar = this.W;
                if (hmbVar != null && ((wb2) hmbVar).getMessageObject() != null && ((wb2) this.W).getMessageObject().k != null && ((wb2) this.W).getMessageObject().k.noforwards) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final void c0(zu1 zu1Var) {
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
                this.w0 = zu1Var;
                return;
            }
        }
    }

    @Override
    public final boolean d() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ot1.d():boolean");
    }

    @Override
    public final int n() {
        zu1 zu1Var = this.w0;
        if (zu1Var == null) {
            return 0;
        }
        return zu1Var.Ya;
    }

    @Override
    public final int o() {
        zu1 zu1Var = this.w0;
        if (zu1Var == null) {
            return 0;
        }
        return (int) zu1Var.P9;
    }

    @Override
    public final vnb p() {
        zu1 zu1Var = this.w0;
        if (zu1Var != null) {
            return zu1Var.Ba;
        }
        return null;
    }

    @Override
    public final int s(int i) {
        return aob.v0(i, this.w0.Ba);
    }
}
