package of;

import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.ui.Cells.d2;
import org.telegram.ui.Components.r90;
public final class s0 implements MediaDataController.KeywordResultCallback, d2 {
    public final f1 f19499a;

    public s0(f1 f1Var) {
        this.f19499a = f1Var;
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        boolean z10;
        f1 f1Var = this.f19499a;
        f1Var.J = arrayList;
        f1Var.E = null;
        f1Var.f19348w0 = null;
        f1Var.f19349x = null;
        f1Var.f19351y = null;
        f1Var.F = null;
        f1Var.M = null;
        f1Var.I = null;
        f1Var.G = null;
        f1Var.L = null;
        f1Var.l();
        r90 r90Var = f1Var.R;
        ArrayList arrayList2 = f1Var.J;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            z10 = true;
        } else {
            z10 = false;
        }
        r90Var.a(z10);
    }
}
