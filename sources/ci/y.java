package ci;

import org.telegram.messenger.hd;
import org.telegram.messenger.z10;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.Components.cc;
public final class y implements Runnable {
    public final int f5557a = 1;
    public final String f5558b;
    public final z10 f5559c;
    public final e2 d;

    public y(String str, z10 z10Var, e2 e2Var) {
        this.f5558b = str;
        this.f5559c = z10Var;
        this.d = e2Var;
    }

    @Override
    public final void run() {
        int i7 = this.f5557a;
        e2 e2Var = this.d;
        z10 z10Var = this.f5559c;
        String str = this.f5558b;
        switch (i7) {
            case 0:
                a0.p(e2Var, 0, new y(str, z10Var, e2Var));
                return;
            default:
                if (str != null) {
                    z10Var.a(str);
                    return;
                } else {
                    cc.a0(e2Var).N(hd.M0(2131745861, null), hd.M0(2131751105, null)).j();
                    return;
                }
        }
    }

    public y(e2 e2Var, String str, z10 z10Var) {
        this.d = e2Var;
        this.f5558b = str;
        this.f5559c = z10Var;
    }
}
