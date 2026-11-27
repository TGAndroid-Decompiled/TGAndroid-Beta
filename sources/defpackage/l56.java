package defpackage;

import java.util.ArrayList;
public final class l56 implements hj, fd, yma {
    public final byte a;
    public final v56 b;

    public l56(v56 v56Var, byte b) {
        this.a = b;
        this.b = v56Var;
    }

    @Override
    public final void j(int i) {
        byte b = this.a;
        v56 v56Var = this.b;
        switch (b) {
            case 2:
                ArrayList arrayList = v56Var.P;
                if (i < arrayList.size()) {
                    v56Var.x.setText(ob6.s(v56Var.getConnectionsManager().getCurrentTime() + ((Integer) arrayList.get(i)).intValue(), false));
                    return;
                }
                v56Var.x.setText("");
                return;
            default:
                v56Var.G.clearFocus();
                v56Var.O = true;
                ArrayList arrayList2 = v56Var.R;
                int size = arrayList2.size();
                q56 q56Var = v56Var.G;
                if (i < size) {
                    q56Var.setText(((Integer) arrayList2.get(i)).toString());
                } else {
                    q56Var.setText("");
                }
                v56Var.O = false;
                return;
        }
    }

    @Override
    public final void m() {
        byte b = this.a;
    }

    @Override
    public final void w(id idVar, int i) {
        v56 v56Var = this.b;
        v56Var.T.a(v56Var.e);
        v56Var.finishFragment();
    }

    @Override
    public final void y(int i, int i2, boolean z) {
        this.b.Z(i);
    }

    private final void a() {
    }

    private final void b() {
    }
}
