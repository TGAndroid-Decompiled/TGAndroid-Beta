package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
public abstract class pv4 extends q59 {
    public final ylb c;
    public boolean d;
    public d e;
    public TLRPC.TL_payments_checkedGiftCode f;
    public String h;
    public dy0 n;

    public pv4(ylb ylbVar) {
        this.c = ylbVar;
    }

    @Override
    public final boolean D(u69 u69Var) {
        return false;
    }

    public abstract void E();

    public abstract void F(TLObject tLObject);

    @Override
    public final int b() {
        return 5;
    }

    @Override
    public final int d(int i) {
        if (i != 0) {
            if (i == 1) {
                return 1;
            }
            if (i == 2) {
                return 2;
            }
            if (i == 3) {
                return 3;
            }
            if (i == 4) {
                return 4;
            }
            return 5;
        }
        return 0;
    }

    @Override
    public final void t(defpackage.u69 r22, int r23) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pv4.t(u69, int):void");
    }

    @Override
    public final u69 x(ViewGroup viewGroup, int i) {
        View h56Var;
        Context context = viewGroup.getContext();
        ylb ylbVar = this.c;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            h56Var = new if5(context, ylbVar);
                        } else {
                            h56Var = new View(context);
                        }
                    } else {
                        h56Var = new n8(context, ylbVar);
                        h56Var.setPadding(0, 0, 0, gm.L(14.0f));
                    }
                } else {
                    h56Var = new mjb(context, ylbVar);
                }
            } else {
                h56Var = new mgb(context, ylbVar);
            }
        } else {
            h56Var = new h56(context, ylbVar);
        }
        return kt6.h(h56Var, h56Var, -1, -2);
    }
}
