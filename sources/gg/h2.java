package gg;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;
public final class h2 implements Utilities.Callback {
    public final int f6661a;
    public final v2 f6662b;

    public h2(v2 v2Var, int i10) {
        this.f6661a = i10;
        this.f6662b = v2Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f6661a) {
            case 0:
                v2 v2Var = this.f6662b;
                ArrayList arrayList = v2Var.f6789o0;
                arrayList.clear();
                arrayList.addAll((List) obj);
                s2 s2Var = v2Var.V;
                if (s2Var.K) {
                    s2Var.setLoading(false);
                    if (v2Var.d.D) {
                        v2Var.d0();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                this.f6662b.dismiss(((Boolean) obj).booleanValue());
                return;
            case 2:
                v2.T(this.f6662b, (TL_account.TL_birthday) obj);
                return;
            default:
                v2 v2Var2 = this.f6662b;
                v2Var2.f6787l0 = (String) obj;
                androidx.activity.i iVar = v2Var2.f6794t0;
                AndroidUtilities.cancelRunOnUIThread(iVar);
                AndroidUtilities.runOnUIThread(iVar, 350L);
                return;
        }
    }
}
