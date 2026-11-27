package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
public final class j49 extends c79 {
    public final Context c;
    public final n49 d;

    public j49(n49 n49Var, Context context) {
        this.d = n49Var;
        this.c = context;
    }

    @Override
    public final boolean D(f89 f89Var) {
        int i = f89Var.f;
        if (i != 3 && i != 2) {
            return false;
        }
        return true;
    }

    @Override
    public final int b() {
        int i;
        n49 n49Var = this.d;
        int i2 = n49Var.f;
        if (n49Var.e < 0) {
            i = n49Var.getMediaDataController().h.size();
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
        n49 n49Var = this.d;
        if (i == n49Var.c) {
            return 2;
        }
        if (i == n49Var.e) {
            return 3;
        }
        if (i != b() - 1) {
            return 1;
        }
        return 4;
    }

    @Override
    public final void t(f89 f89Var, int i) {
        int i2;
        int i3;
        if (d(i) != 1) {
            return;
        }
        n49 n49Var = this.d;
        TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) n49Var.getMediaDataController().h.get(i - n49Var.d);
        String str = tL_availableReaction.reaction;
        i2 = ((e) n49Var).currentAccount;
        boolean contains = str.contains(ls6.d0(i2).S());
        i3 = ((e) n49Var).currentAccount;
        ((xa0) f89Var.a).a(tL_availableReaction, contains, i3);
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
        wk5 wk5Var;
        m49 m49Var;
        n49 n49Var = this.d;
        Context context = this.c;
        if (i == 0) {
            wk5Var = ((e) n49Var).parentLayout;
            sqb sqbVar = new sqb(context, wk5Var, 2);
            sqbVar.setImportantForAccessibility(4);
            sqbVar.x = n49Var;
            m49Var = sqbVar;
        } else if (i != 2) {
            if (i != 3) {
                if (i != 4) {
                    m49Var = new xa0(context, true, true);
                } else {
                    View t62Var = new t62(context, (byte) 22);
                    t62Var.setTag(-33024);
                    m49Var = t62Var;
                }
            } else {
                m49 m49Var2 = new m49(n49Var, context);
                m49Var2.a(false);
                m49Var = m49Var2;
            }
        } else {
            ilb ilbVar = new ilb(context);
            ilbVar.setText(ob6.M0(2131751317, null));
            m49Var = ilbVar;
        }
        return new f89(m49Var);
    }
}
