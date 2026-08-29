package eg;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class c2 implements Utilities.Callback {
    public final int f5955a;
    public final g2 f5956b;

    public c2(g2 g2Var, int i10) {
        this.f5955a = i10;
        this.f5956b = g2Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f5955a) {
            case 0:
                String str = (String) obj;
                g2 g2Var = this.f5956b;
                ArrayList arrayList = g2Var.f6005c0;
                ag.q1 q1Var = g2Var.f6019r0;
                g2Var.f6012j0 = str;
                int i10 = g2Var.f6015n0;
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 == 3) {
                            g2Var.a0(false, true);
                            g2Var.X(true);
                            return;
                        }
                        return;
                    } else if (TextUtils.isEmpty(str)) {
                        AndroidUtilities.cancelRunOnUIThread(q1Var);
                        arrayList.clear();
                        arrayList.addAll(q0.e(g2Var.m0.f22392id));
                        g2Var.a0(false, true);
                        g2Var.X(true);
                        return;
                    } else {
                        AndroidUtilities.cancelRunOnUIThread(q1Var);
                        AndroidUtilities.runOnUIThread(q1Var, 350L);
                        return;
                    }
                }
                AndroidUtilities.cancelRunOnUIThread(q1Var);
                AndroidUtilities.runOnUIThread(q1Var, 350L);
                return;
            default:
                List list = (List) obj;
                g2 g2Var2 = this.f5956b;
                ArrayList arrayList2 = g2Var2.f6005c0;
                if (!TextUtils.isEmpty(g2Var2.f6012j0)) {
                    arrayList2.clear();
                    arrayList2.addAll(list);
                    g2Var2.b0(true, true);
                    g2Var2.X(true);
                    return;
                }
                return;
        }
    }
}
