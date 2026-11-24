package defpackage;

import java.util.ArrayList;
public final class i56 implements gk, ee, gla {
    public final byte a;
    public final s56 b;

    public i56(s56 s56Var, byte b) {
        this.a = b;
        this.b = s56Var;
    }

    @Override
    public final void i(int i) {
        byte b = this.a;
        s56 s56Var = this.b;
        switch (b) {
            case 2:
                ArrayList arrayList = s56Var.P;
                if (i < arrayList.size()) {
                    s56Var.x.setText(jb6.s(s56Var.getConnectionsManager().getCurrentTime() + ((Integer) arrayList.get(i)).intValue(), false));
                    return;
                }
                s56Var.x.setText("");
                return;
            default:
                s56Var.G.clearFocus();
                s56Var.O = true;
                ArrayList arrayList2 = s56Var.R;
                int size = arrayList2.size();
                n56 n56Var = s56Var.G;
                if (i < size) {
                    n56Var.setText(((Integer) arrayList2.get(i)).toString());
                } else {
                    n56Var.setText("");
                }
                s56Var.O = false;
                return;
        }
    }

    @Override
    public final void m() {
        byte b = this.a;
    }

    @Override
    public final void r(he heVar, int i) {
        s56 s56Var = this.b;
        s56Var.T.a(s56Var.e);
        s56Var.finishFragment();
    }

    @Override
    public final void y(int i, int i2, boolean z) {
        this.b.a0(i);
    }

    private final void a() {
    }

    private final void b() {
    }
}
