package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
public final class w29 extends q59 {
    public final Context c;
    public final a39 d;

    public w29(a39 a39Var, Context context) {
        this.d = a39Var;
        this.c = context;
    }

    @Override
    public final boolean D(u69 u69Var) {
        int i = u69Var.f;
        if (i != 3 && i != 2) {
            return false;
        }
        return true;
    }

    @Override
    public final int b() {
        int i;
        a39 a39Var = this.d;
        int i2 = a39Var.f;
        if (a39Var.e < 0) {
            i = a39Var.getMediaDataController().h.size();
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
        a39 a39Var = this.d;
        if (i == a39Var.c) {
            return 2;
        }
        if (i == a39Var.e) {
            return 3;
        }
        if (i != b() - 1) {
            return 1;
        }
        return 4;
    }

    @Override
    public final void t(u69 u69Var, int i) {
        int i2;
        int i3;
        if (d(i) != 1) {
            return;
        }
        a39 a39Var = this.d;
        TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) a39Var.getMediaDataController().h.get(i - a39Var.d);
        String str = tL_availableReaction.reaction;
        i2 = ((d) a39Var).currentAccount;
        boolean contains = str.contains(hs6.d0(i2).S());
        i3 = ((d) a39Var).currentAccount;
        ((vb0) u69Var.a).a(tL_availableReaction, contains, i3);
    }

    @Override
    public final u69 x(ViewGroup viewGroup, int i) {
        tk5 tk5Var;
        z29 z29Var;
        a39 a39Var = this.d;
        Context context = this.c;
        if (i == 0) {
            tk5Var = ((d) a39Var).parentLayout;
            uob uobVar = new uob(context, tk5Var, 2);
            uobVar.setImportantForAccessibility(4);
            uobVar.x = a39Var;
            z29Var = uobVar;
        } else if (i != 2) {
            if (i != 3) {
                if (i != 4) {
                    z29Var = new vb0(context, true, true);
                } else {
                    View o72Var = new o72(context, (byte) 22);
                    o72Var.setTag(-33024);
                    z29Var = o72Var;
                }
            } else {
                z29 z29Var2 = new z29(a39Var, context);
                z29Var2.a(false);
                z29Var = z29Var2;
            }
        } else {
            njb njbVar = new njb(context);
            njbVar.setText(jb6.M0(2131751289, null));
            z29Var = njbVar;
        }
        return new u69(z29Var);
    }
}
