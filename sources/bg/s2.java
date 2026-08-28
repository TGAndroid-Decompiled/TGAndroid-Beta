package bg;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;
public final class s2 implements Utilities.Callback {
    public final int f1959a;
    public final g3 f1960b;

    public s2(g3 g3Var, int i9) {
        this.f1959a = i9;
        this.f1960b = g3Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f1959a) {
            case 0:
                g3 g3Var = this.f1960b;
                ArrayList arrayList = g3Var.f1785n0;
                arrayList.clear();
                arrayList.addAll((List) obj);
                d3 d3Var = g3Var.U;
                if (d3Var.J) {
                    d3Var.setLoading(false);
                    if (g3Var.d.C) {
                        g3Var.c0();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                this.f1960b.dismiss(((Boolean) obj).booleanValue());
                return;
            case 2:
                g3.S(this.f1960b, (TL_account.TL_birthday) obj);
                return;
            default:
                g3 g3Var2 = this.f1960b;
                g3Var2.f1783k0 = (String) obj;
                androidx.activity.i iVar = g3Var2.f1790s0;
                AndroidUtilities.cancelRunOnUIThread(iVar);
                AndroidUtilities.runOnUIThread(iVar, 350L);
                return;
        }
    }
}
