package bg;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class l2 implements Utilities.Callback {
    public final int f1866a;
    public final q2 f1867b;

    public l2(q2 q2Var, int i9) {
        this.f1866a = i9;
        this.f1867b = q2Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f1866a) {
            case 0:
                String str = (String) obj;
                q2 q2Var = this.f1867b;
                ArrayList arrayList = q2Var.f1925c0;
                androidx.activity.i iVar = q2Var.f1939r0;
                q2Var.f1932j0 = str;
                int i9 = q2Var.f1935n0;
                if (i9 != 1) {
                    if (i9 != 2) {
                        if (i9 == 3) {
                            q2Var.Z(false, true);
                            q2Var.W(true);
                            return;
                        }
                        return;
                    } else if (TextUtils.isEmpty(str)) {
                        AndroidUtilities.cancelRunOnUIThread(iVar);
                        arrayList.clear();
                        arrayList.addAll(u0.e(q2Var.m0.f22380id));
                        q2Var.Z(false, true);
                        q2Var.W(true);
                        return;
                    } else {
                        AndroidUtilities.cancelRunOnUIThread(iVar);
                        AndroidUtilities.runOnUIThread(iVar, 350L);
                        return;
                    }
                }
                AndroidUtilities.cancelRunOnUIThread(iVar);
                AndroidUtilities.runOnUIThread(iVar, 350L);
                return;
            default:
                List list = (List) obj;
                q2 q2Var2 = this.f1867b;
                ArrayList arrayList2 = q2Var2.f1925c0;
                if (!TextUtils.isEmpty(q2Var2.f1932j0)) {
                    arrayList2.clear();
                    arrayList2.addAll(list);
                    q2Var2.a0(true, true);
                    q2Var2.W(true);
                    return;
                }
                return;
        }
    }
}
