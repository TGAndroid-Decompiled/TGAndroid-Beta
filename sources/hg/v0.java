package hg;

import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.ui.Components.eb0;
public final class v0 implements MediaDataController.KeywordResultCallback, org.telegram.ui.Cells.d2 {
    public final j1 f12107a;

    public v0(j1 j1Var) {
        this.f12107a = j1Var;
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        boolean z10;
        j1 j1Var = this.f12107a;
        j1Var.N = arrayList;
        j1Var.I = null;
        j1Var.A0 = null;
        j1Var.f11975x = null;
        j1Var.f11977y = null;
        j1Var.J = null;
        j1Var.Q = null;
        j1Var.M = null;
        j1Var.K = null;
        j1Var.P = null;
        j1Var.l();
        eb0 eb0Var = j1Var.V;
        ArrayList arrayList2 = j1Var.N;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            z10 = true;
        } else {
            z10 = false;
        }
        eb0Var.a(z10);
    }
}
