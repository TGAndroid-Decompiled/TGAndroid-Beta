package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class bt5 extends q59 {
    public final it5 c;

    public bt5(it5 it5Var) {
        this.c = it5Var;
    }

    @Override
    public final boolean D(u69 u69Var) {
        int i = u69Var.f;
        if (i == 3 || i == 1) {
            return true;
        }
        return false;
    }

    public final TLObject E(int i) {
        it5 it5Var = this.c;
        if (it5Var.g2 != null) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) it5Var.h2.get(i - it5Var.S1);
            boolean D = pg3.D(dialog.id);
            int i2 = it5Var.a;
            if (D) {
                return oc7.r1(i2).W1(Long.valueOf(dialog.id));
            }
            return oc7.r1(i2).L0(Long.valueOf(-dialog.id));
        }
        return (TLObject) it5Var.Y1.get(i - it5Var.S1);
    }

    @Override
    public final int b() {
        return this.c.W1;
    }

    @Override
    public final int d(int i) {
        it5 it5Var = this.c;
        if (i == it5Var.R1) {
            return 1;
        }
        if (i == 0) {
            return 2;
        }
        if (i >= it5Var.S1 && i < it5Var.T1) {
            return 3;
        }
        if (i == it5Var.V1) {
            return 4;
        }
        if (i == it5Var.U1) {
            return 5;
        }
        return 0;
    }

    @Override
    public final void t(u69 u69Var, int i) {
        long j;
        boolean z;
        long j2;
        boolean z2;
        int i2 = u69Var.f;
        View view = u69Var.a;
        if (i2 != 2) {
            if (i2 == 3) {
                xc5 xc5Var = (xc5) view;
                TLObject E = E(i);
                Object object = xc5Var.getObject();
                if (object instanceof TLRPC.User) {
                    j = ((TLRPC.User) object).id;
                } else if (object instanceof TLRPC.Chat) {
                    j = -((TLRPC.Chat) object).id;
                } else {
                    j = 0;
                }
                it5 it5Var = this.c;
                boolean z3 = false;
                if (i != it5Var.T1) {
                    z = true;
                } else {
                    z = false;
                }
                xc5Var.e(E, null, null, z);
                if (E instanceof TLRPC.User) {
                    j2 = ((TLRPC.User) E).id;
                } else if (E instanceof TLRPC.Chat) {
                    j2 = -((TLRPC.Chat) E).id;
                } else {
                    j2 = 0;
                }
                if (j2 != 0) {
                    vh6 vh6Var = it5Var.N1;
                    if (vh6Var != null && vh6Var.h(j2) >= 0) {
                        xc5Var.c(true, false);
                        xc5Var.setCheckBoxEnabled(false);
                        return;
                    }
                    if (it5Var.Z1.h(j2) >= 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (j == j2) {
                        z3 = true;
                    }
                    xc5Var.c(z2, z3);
                    xc5Var.setCheckBoxEnabled(true);
                    return;
                }
                return;
            }
            return;
        }
        view.requestLayout();
    }

    @Override
    public final u69 x(ViewGroup viewGroup, int i) {
        View sbVar;
        fj6 fj6Var;
        boolean z;
        Context context = viewGroup.getContext();
        if (i != 2) {
            it5 it5Var = this.c;
            if (i != 3) {
                if (i != 4) {
                    if (i != 5) {
                        fj6 fj6Var2 = new fj6(context);
                        fj6Var2.b(2131232209, 7, jb6.M0(2131743074, null), true);
                        int i2 = cmb.m5;
                        fj6Var2.a(i2, i2);
                        fj6Var = fj6Var2;
                    } else {
                        lc5 lc5Var = new lc5(context, null, 0, null, (byte) 1);
                        lc5Var.setLayoutParams(new g69(-1, -1));
                        lc5Var.e.setVisibility(8);
                        yu3 yu3Var = it5Var.g2;
                        xna xnaVar = lc5Var.d;
                        if (yu3Var != null) {
                            xnaVar.setText(jb6.M0(2131750663, null));
                        } else {
                            xnaVar.setText(jb6.M0(2131747957, null));
                        }
                        lc5Var.setAnimateLayoutChange(true);
                        fj6Var = lc5Var;
                    }
                } else {
                    fj6Var = new View(context);
                }
                return new u69(fj6Var);
            }
            if (it5Var.g2 != null) {
                z = true;
            } else {
                z = false;
            }
            sbVar = new xc5(context, 1, 0, z);
        } else {
            sbVar = new sb((byte) 17, context, this);
        }
        fj6Var = sbVar;
        return new u69(fj6Var);
    }
}
