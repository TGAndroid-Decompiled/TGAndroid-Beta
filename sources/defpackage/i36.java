package defpackage;

import java.util.ArrayList;
public final class i36 implements gj, ed, eja {
    public final byte a;
    public final s36 b;

    public i36(s36 s36Var, byte b) {
        this.a = b;
        this.b = s36Var;
    }

    @Override
    public final void k(int i) {
        byte b = this.a;
        s36 s36Var = this.b;
        switch (b) {
            case 2:
                ArrayList arrayList = s36Var.P;
                if (i < arrayList.size()) {
                    s36Var.x.setText(k96.s(s36Var.getConnectionsManager().getCurrentTime() + ((Integer) arrayList.get(i)).intValue(), false));
                    return;
                }
                s36Var.x.setText("");
                return;
            default:
                s36Var.G.clearFocus();
                s36Var.O = true;
                ArrayList arrayList2 = s36Var.R;
                int size = arrayList2.size();
                n36 n36Var = s36Var.G;
                if (i < size) {
                    n36Var.setText(((Integer) arrayList2.get(i)).toString());
                } else {
                    n36Var.setText("");
                }
                s36Var.O = false;
                return;
        }
    }

    @Override
    public final void n() {
        byte b = this.a;
    }

    @Override
    public final void s(int i, int i2, boolean z) {
        this.b.Z(i);
    }

    @Override
    public final void u(hd hdVar, int i) {
        s36 s36Var = this.b;
        s36Var.T.a(s36Var.e);
        s36Var.finishFragment();
    }

    private final void a() {
    }

    private final void b() {
    }
}
