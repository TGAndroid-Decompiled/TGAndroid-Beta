package gg;

import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.ui.Components.ta0;
public final class w0 implements MediaDataController.KeywordResultCallback, org.telegram.ui.Cells.e2 {
    public final k1 f9969a;

    public w0(k1 k1Var) {
        this.f9969a = k1Var;
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        boolean z10;
        k1 k1Var = this.f9969a;
        k1Var.N = arrayList;
        k1Var.I = null;
        k1Var.A0 = null;
        k1Var.f9843x = null;
        k1Var.f9845y = null;
        k1Var.J = null;
        k1Var.Q = null;
        k1Var.M = null;
        k1Var.K = null;
        k1Var.P = null;
        k1Var.l();
        ta0 ta0Var = k1Var.V;
        ArrayList arrayList2 = k1Var.N;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            z10 = true;
        } else {
            z10 = false;
        }
        ta0Var.a(z10);
    }
}
