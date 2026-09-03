package gg;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;
public final class h2 implements Utilities.Callback {
    public final int f6648a;
    public final v2 f6649b;

    public h2(v2 v2Var, int i10) {
        this.f6648a = i10;
        this.f6649b = v2Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f6648a) {
            case 0:
                v2 v2Var = this.f6649b;
                ArrayList arrayList = v2Var.f6776o0;
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
                this.f6649b.dismiss(((Boolean) obj).booleanValue());
                return;
            case 2:
                v2.T(this.f6649b, (TL_account.TL_birthday) obj);
                return;
            default:
                v2 v2Var2 = this.f6649b;
                v2Var2.f6774l0 = (String) obj;
                androidx.activity.i iVar = v2Var2.f6781t0;
                AndroidUtilities.cancelRunOnUIThread(iVar);
                AndroidUtilities.runOnUIThread(iVar, 350L);
                return;
        }
    }
}
