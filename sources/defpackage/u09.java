package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
public final class u09 extends n39 {
    public final Context c;
    public final y09 d;

    public u09(y09 y09Var, Context context) {
        this.d = y09Var;
        this.c = context;
    }

    @Override
    public final boolean D(s49 s49Var) {
        int i = s49Var.f;
        if (i != 3 && i != 2) {
            return false;
        }
        return true;
    }

    @Override
    public final int b() {
        int i;
        y09 y09Var = this.d;
        int i2 = y09Var.f;
        if (y09Var.e < 0) {
            i = y09Var.getMediaDataController().h.size();
        } else {
            i = 0;
        }
        return i2 + i + 1;
    }

    @Override
    public final int d(int i) {
        if (i == 0) {
            return 0;
        }
        y09 y09Var = this.d;
        if (i == y09Var.c) {
            return 2;
        }
        if (i == y09Var.e) {
            return 3;
        }
        if (i != b() - 1) {
            return 1;
        }
        return 4;
    }

    @Override
    public final void t(s49 s49Var, int i) {
        int i2;
        int i3;
        if (d(i) != 1) {
            return;
        }
        y09 y09Var = this.d;
        TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) y09Var.getMediaDataController().h.get(i - y09Var.d);
        String str = tL_availableReaction.reaction;
        i2 = ((d) y09Var).currentAccount;
        boolean contains = str.contains(hq6.d0(i2).S());
        i3 = ((d) y09Var).currentAccount;
        ((va0) s49Var.a).a(tL_availableReaction, contains, i3);
    }

    @Override
    public final s49 x(ViewGroup viewGroup, int i) {
        ui5 ui5Var;
        x09 x09Var;
        y09 y09Var = this.d;
        Context context = this.c;
        if (i == 0) {
            ui5Var = ((d) y09Var).parentLayout;
            tmb tmbVar = new tmb(context, ui5Var, 2);
            tmbVar.setImportantForAccessibility(4);
            tmbVar.x = y09Var;
            x09Var = tmbVar;
        } else if (i != 2) {
            if (i != 3) {
                if (i != 4) {
                    x09Var = new va0(context, true, true);
                } else {
                    View d62Var = new d62(context, (byte) 22);
                    d62Var.setTag(-33024);
                    x09Var = d62Var;
                }
            } else {
                x09 x09Var2 = new x09(y09Var, context);
                x09Var2.a(false);
                x09Var = x09Var2;
            }
        } else {
            mhb mhbVar = new mhb(context);
            mhbVar.setText(k96.M0(2131751340, null));
            x09Var = mhbVar;
        }
        return new s49(x09Var);
    }
}
