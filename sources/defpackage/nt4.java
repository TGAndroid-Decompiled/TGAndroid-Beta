package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
public abstract class nt4 extends n39 {
    public final wjb c;
    public boolean d;
    public d e;
    public TLRPC.TL_payments_checkedGiftCode f;
    public String h;
    public ww0 n;

    public nt4(wjb wjbVar) {
        this.c = wjbVar;
    }

    @Override
    public final boolean D(s49 s49Var) {
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
    public final void t(defpackage.s49 r22, int r23) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nt4.t(s49, int):void");
    }

    @Override
    public final s49 x(ViewGroup viewGroup, int i) {
        View h36Var;
        Context context = viewGroup.getContext();
        wjb wjbVar = this.c;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            h36Var = new kd5(context, wjbVar);
                        } else {
                            h36Var = new View(context);
                        }
                    } else {
                        h36Var = new n8(context, wjbVar);
                        h36Var.setPadding(0, 0, 0, gl.L(14.0f));
                    }
                } else {
                    h36Var = new lhb(context, wjbVar);
                }
            } else {
                h36Var = new meb(context, wjbVar);
            }
        } else {
            h36Var = new h36(context, wjbVar);
        }
        return ls6.h(h36Var, h36Var, -1, -2);
    }
}
