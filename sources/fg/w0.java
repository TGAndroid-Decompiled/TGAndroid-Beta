package fg;

import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.ui.Components.sa0;
public final class w0 implements MediaDataController.KeywordResultCallback, org.telegram.ui.Cells.d2 {
    public final l1 f8244a;

    public w0(l1 l1Var) {
        this.f8244a = l1Var;
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        boolean z10;
        l1 l1Var = this.f8244a;
        l1Var.N = arrayList;
        l1Var.I = null;
        l1Var.A0 = null;
        l1Var.f8130x = null;
        l1Var.f8132y = null;
        l1Var.J = null;
        l1Var.Q = null;
        l1Var.M = null;
        l1Var.K = null;
        l1Var.P = null;
        l1Var.l();
        sa0 sa0Var = l1Var.V;
        ArrayList arrayList2 = l1Var.N;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            z10 = true;
        } else {
            z10 = false;
        }
        sa0Var.a(z10);
    }
}
