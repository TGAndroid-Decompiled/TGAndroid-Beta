package hg;

import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.ui.Components.ja0;
public final class w0 implements MediaDataController.KeywordResultCallback, org.telegram.ui.Cells.d2 {
    public final k1 f11295a;

    public w0(k1 k1Var) {
        this.f11295a = k1Var;
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        boolean z10;
        k1 k1Var = this.f11295a;
        k1Var.N = arrayList;
        k1Var.I = null;
        k1Var.A0 = null;
        k1Var.f11157x = null;
        k1Var.f11159y = null;
        k1Var.J = null;
        k1Var.Q = null;
        k1Var.M = null;
        k1Var.K = null;
        k1Var.P = null;
        k1Var.l();
        ja0 ja0Var = k1Var.V;
        ArrayList arrayList2 = k1Var.N;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            z10 = true;
        } else {
            z10 = false;
        }
        ja0Var.a(z10);
    }
}
