package eg;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;
public final class i2 implements Utilities.Callback {
    public final int f6037a;
    public final w2 f6038b;

    public i2(w2 w2Var, int i10) {
        this.f6037a = i10;
        this.f6038b = w2Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f6037a) {
            case 0:
                w2 w2Var = this.f6038b;
                ArrayList arrayList = w2Var.f6174n0;
                arrayList.clear();
                arrayList.addAll((List) obj);
                t2 t2Var = w2Var.U;
                if (t2Var.J) {
                    t2Var.setLoading(false);
                    if (w2Var.d.C) {
                        w2Var.d0();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                this.f6038b.dismiss(((Boolean) obj).booleanValue());
                return;
            case 2:
                w2.T(this.f6038b, (TL_account.TL_birthday) obj);
                return;
            default:
                w2 w2Var2 = this.f6038b;
                w2Var2.f6172k0 = (String) obj;
                ag.q1 q1Var = w2Var2.f6179s0;
                AndroidUtilities.cancelRunOnUIThread(q1Var);
                AndroidUtilities.runOnUIThread(q1Var, 350L);
                return;
        }
    }
}
