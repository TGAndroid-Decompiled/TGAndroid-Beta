package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ft5 extends c79 {
    public final lt5 c;

    public ft5(lt5 lt5Var) {
        this.c = lt5Var;
    }

    @Override
    public final boolean D(f89 f89Var) {
        int i = f89Var.f;
        if (i == 3 || i == 1) {
            return true;
        }
        return false;
    }

    public final TLObject E(int i) {
        lt5 lt5Var = this.c;
        if (lt5Var.g2 != null) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) lt5Var.h2.get(i - lt5Var.S1);
            boolean D = wf3.D(dialog.id);
            int i2 = lt5Var.a;
            if (D) {
                return uc7.s1(i2).X1(Long.valueOf(dialog.id));
            }
            return uc7.s1(i2).M0(Long.valueOf(-dialog.id));
        }
        return (TLObject) lt5Var.Y1.get(i - lt5Var.S1);
    }

    @Override
    public final int b() {
        return this.c.W1;
    }

    @Override
    public final int d(int i) {
        lt5 lt5Var = this.c;
        if (i == lt5Var.R1) {
            return 1;
        }
        if (i == 0) {
            return 2;
        }
        if (i >= lt5Var.S1 && i < lt5Var.T1) {
            return 3;
        }
        if (i == lt5Var.V1) {
            return 4;
        }
        if (i == lt5Var.U1) {
            return 5;
        }
        return 0;
    }

    @Override
    public final void t(f89 f89Var, int i) {
        long j;
        boolean z;
        long j2;
        boolean z2;
        int i2 = f89Var.f;
        View view = f89Var.a;
        if (i2 != 2) {
            if (i2 == 3) {
                bd5 bd5Var = (bd5) view;
                TLObject E = E(i);
                Object object = bd5Var.getObject();
                if (object instanceof TLRPC.User) {
                    j = ((TLRPC.User) object).id;
                } else if (object instanceof TLRPC.Chat) {
                    j = -((TLRPC.Chat) object).id;
                } else {
                    j = 0;
                }
                lt5 lt5Var = this.c;
                boolean z3 = false;
                if (i != lt5Var.T1) {
                    z = true;
                } else {
                    z = false;
                }
                bd5Var.e(E, null, null, z);
                if (E instanceof TLRPC.User) {
                    j2 = ((TLRPC.User) E).id;
                } else if (E instanceof TLRPC.Chat) {
                    j2 = -((TLRPC.Chat) E).id;
                } else {
                    j2 = 0;
                }
                if (j2 != 0) {
                    zh6 zh6Var = lt5Var.N1;
                    if (zh6Var != null && zh6Var.h(j2) >= 0) {
                        bd5Var.c(true, false);
                        bd5Var.setCheckBoxEnabled(false);
                        return;
                    }
                    if (lt5Var.Z1.h(j2) >= 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (j == j2) {
                        z3 = true;
                    }
                    bd5Var.c(z2, z3);
                    bd5Var.setCheckBoxEnabled(true);
                    return;
                }
                return;
            }
            return;
        }
        view.requestLayout();
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
        View tbVar;
        ij6 ij6Var;
        boolean z;
        Context context = viewGroup.getContext();
        if (i != 2) {
            lt5 lt5Var = this.c;
            if (i != 3) {
                if (i != 4) {
                    if (i != 5) {
                        ij6 ij6Var2 = new ij6(context);
                        ij6Var2.b(2131232208, 7, ob6.M0(2131743042, null), true);
                        int i2 = aob.n5;
                        ij6Var2.a(i2, i2);
                        ij6Var = ij6Var2;
                    } else {
                        oc5 oc5Var = new oc5(context, null, 0, null, (byte) 1);
                        oc5Var.setLayoutParams(new r79(-1, -1));
                        oc5Var.e.setVisibility(8);
                        lu3 lu3Var = lt5Var.g2;
                        tpa tpaVar = oc5Var.d;
                        if (lu3Var != null) {
                            tpaVar.setText(ob6.M0(2131750691, null));
                        } else {
                            tpaVar.setText(ob6.M0(2131747954, null));
                        }
                        oc5Var.setAnimateLayoutChange(true);
                        ij6Var = oc5Var;
                    }
                } else {
                    ij6Var = new View(context);
                }
                return new f89(ij6Var);
            }
            if (lt5Var.g2 != null) {
                z = true;
            } else {
                z = false;
            }
            tbVar = new bd5(context, 1, 0, z);
        } else {
            tbVar = new tb((byte) 17, context, this);
        }
        ij6Var = tbVar;
        return new f89(ij6Var);
    }
}
