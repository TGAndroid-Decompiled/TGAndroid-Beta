package ci;

import org.telegram.messenger.hd;
import org.telegram.messenger.z10;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.Components.cc;
public final class y implements Runnable {
    public final int f5560a = 1;
    public final String f5561b;
    public final z10 f5562c;
    public final e2 d;

    public y(String str, z10 z10Var, e2 e2Var) {
        this.f5561b = str;
        this.f5562c = z10Var;
        this.d = e2Var;
    }

    @Override
    public final void run() {
        int i7 = this.f5560a;
        e2 e2Var = this.d;
        z10 z10Var = this.f5562c;
        String str = this.f5561b;
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
        this.f5561b = str;
        this.f5562c = z10Var;
    }
}
