package cg;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;

public final class k2 implements Utilities.Callback {

    public final int f2748a;

    public final y2 f2749b;

    public k2(y2 y2Var, int i10) {
        this.f2748a = i10;
        this.f2749b = y2Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f2748a) {
            case 0:
                y2 y2Var = this.f2749b;
                ArrayList arrayList = y2Var.f2880n0;
                arrayList.clear();
                arrayList.addAll((List) obj);
                v2 v2Var = y2Var.U;
                if (v2Var.J) {
                    v2Var.setLoading(false);
                    if (y2Var.d.C) {
                        y2Var.d0();
                    }
                }
                break;
            case 1:
                this.f2749b.dismiss(((Boolean) obj).booleanValue());
                break;
            case 2:
                y2.T(this.f2749b, (TL_account.TL_birthday) obj);
                break;
            default:
                y2 y2Var2 = this.f2749b;
                y2Var2.f2878k0 = (String) obj;
                a8.b bVar = y2Var2.f2885s0;
                AndroidUtilities.cancelRunOnUIThread(bVar);
                AndroidUtilities.runOnUIThread(bVar, 350L);
                break;
        }
    }
}
