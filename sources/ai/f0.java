package ai;

import org.telegram.messenger.c20;
import org.telegram.messenger.id;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.Components.hc;
public final class f0 implements Runnable {
    public final int f1176a = 1;
    public final String f1177b;
    public final c20 f1178c;
    public final f2 d;

    public f0(String str, c20 c20Var, f2 f2Var) {
        this.f1177b = str;
        this.f1178c = c20Var;
        this.d = f2Var;
    }

    @Override
    public final void run() {
        int i7 = this.f1176a;
        f2 f2Var = this.d;
        c20 c20Var = this.f1178c;
        String str = this.f1177b;
        switch (i7) {
            case 0:
                i0.p(f2Var, 0, new f0(str, c20Var, f2Var));
                return;
            default:
                if (str != null) {
                    c20Var.a(str);
                    return;
                } else {
                    hc.a0(f2Var).N(id.M0(2131745861, null), id.M0(2131751105, null)).j();
                    return;
                }
        }
    }

    public f0(f2 f2Var, String str, c20 c20Var) {
        this.d = f2Var;
        this.f1177b = str;
        this.f1178c = c20Var;
    }
}
