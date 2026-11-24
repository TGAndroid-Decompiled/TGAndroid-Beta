package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class dr5 extends n39 {
    public final jr5 c;

    public dr5(jr5 jr5Var) {
        this.c = jr5Var;
    }

    @Override
    public final boolean D(s49 s49Var) {
        int i = s49Var.f;
        if (i == 3 || i == 1) {
            return true;
        }
        return false;
    }

    public final TLObject E(int i) {
        jr5 jr5Var = this.c;
        if (jr5Var.g2 != null) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) jr5Var.h2.get(i - jr5Var.S1);
            boolean D = cf3.D(dialog.id);
            int i2 = jr5Var.a;
            if (D) {
                return na7.q1(i2).V1(Long.valueOf(dialog.id));
            }
            return na7.q1(i2).K0(Long.valueOf(-dialog.id));
        }
        return (TLObject) jr5Var.Y1.get(i - jr5Var.S1);
    }

    @Override
    public final int b() {
        return this.c.W1;
    }

    @Override
    public final int d(int i) {
        jr5 jr5Var = this.c;
        if (i == jr5Var.R1) {
            return 1;
        }
        if (i == 0) {
            return 2;
        }
        if (i >= jr5Var.S1 && i < jr5Var.T1) {
            return 3;
        }
        if (i == jr5Var.V1) {
            return 4;
        }
        if (i == jr5Var.U1) {
            return 5;
        }
        return 0;
    }

    @Override
    public final void t(s49 s49Var, int i) {
        long j;
        boolean z;
        long j2;
        boolean z2;
        int i2 = s49Var.f;
        View view = s49Var.a;
        if (i2 != 2) {
            if (i2 == 3) {
                za5 za5Var = (za5) view;
                TLObject E = E(i);
                Object object = za5Var.getObject();
                if (object instanceof TLRPC.User) {
                    j = ((TLRPC.User) object).id;
                } else if (object instanceof TLRPC.Chat) {
                    j = -((TLRPC.Chat) object).id;
                } else {
                    j = 0;
                }
                jr5 jr5Var = this.c;
                boolean z3 = false;
                if (i != jr5Var.T1) {
                    z = true;
                } else {
                    z = false;
                }
                za5Var.e(E, null, null, z);
                if (E instanceof TLRPC.User) {
                    j2 = ((TLRPC.User) E).id;
                } else if (E instanceof TLRPC.Chat) {
                    j2 = -((TLRPC.Chat) E).id;
                } else {
                    j2 = 0;
                }
                if (j2 != 0) {
                    vf6 vf6Var = jr5Var.N1;
                    if (vf6Var != null && vf6Var.h(j2) >= 0) {
                        za5Var.c(true, false);
                        za5Var.setCheckBoxEnabled(false);
                        return;
                    }
                    if (jr5Var.Z1.h(j2) >= 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (j == j2) {
                        z3 = true;
                    }
                    za5Var.c(z2, z3);
                    za5Var.setCheckBoxEnabled(true);
                    return;
                }
                return;
            }
            return;
        }
        view.requestLayout();
    }

    @Override
    public final s49 x(ViewGroup viewGroup, int i) {
        View sbVar;
        dh6 dh6Var;
        boolean z;
        Context context = viewGroup.getContext();
        if (i != 2) {
            jr5 jr5Var = this.c;
            if (i != 3) {
                if (i != 4) {
                    if (i != 5) {
                        dh6 dh6Var2 = new dh6(context);
                        dh6Var2.b(2131232208, 7, k96.M0(2131743148, null), true);
                        int i2 = bkb.m5;
                        dh6Var2.a(i2, i2);
                        dh6Var = dh6Var2;
                    } else {
                        na5 na5Var = new na5(context, null, 0, null, (byte) 1);
                        na5Var.setLayoutParams(new e49(-1, -1));
                        na5Var.e.setVisibility(8);
                        vu2 vu2Var = jr5Var.g2;
                        wla wlaVar = na5Var.d;
                        if (vu2Var != null) {
                            wlaVar.setText(k96.M0(2131750714, null));
                        } else {
                            wlaVar.setText(k96.M0(2131748031, null));
                        }
                        na5Var.setAnimateLayoutChange(true);
                        dh6Var = na5Var;
                    }
                } else {
                    dh6Var = new View(context);
                }
                return new s49(dh6Var);
            }
            if (jr5Var.g2 != null) {
                z = true;
            } else {
                z = false;
            }
            sbVar = new za5(context, 1, 0, z);
        } else {
            sbVar = new sb((byte) 16, context, this);
        }
        dh6Var = sbVar;
        return new s49(dh6Var);
    }
}
