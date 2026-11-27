package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
public abstract class rv4 extends c79 {
    public final vnb c;
    public boolean d;
    public e e;
    public TLRPC.TL_payments_checkedGiftCode f;
    public String h;
    public ex0 n;

    public rv4(vnb vnbVar) {
        this.c = vnbVar;
    }

    @Override
    public final boolean D(f89 f89Var) {
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
    public final void t(defpackage.f89 r23, int r24) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rv4.t(f89, int):void");
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
        View k56Var;
        Context context = viewGroup.getContext();
        vnb vnbVar = this.c;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            k56Var = new lf5(context, vnbVar);
                        } else {
                            k56Var = new View(context);
                        }
                    } else {
                        k56Var = new o8(context, vnbVar);
                        k56Var.setPadding(0, 0, 0, hl.L(14.0f));
                    }
                } else {
                    k56Var = new hlb(context, vnbVar);
                }
            } else {
                k56Var = new hib(context, vnbVar);
            }
        } else {
            k56Var = new k56(context, vnbVar);
        }
        return qu6.h(k56Var, k56Var, -1, -2);
    }
}
