package cg;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

public final class e2 implements Utilities.Callback {

    public final int f2670a;

    public final i2 f2671b;

    public e2(i2 i2Var, int i10) {
        this.f2670a = i10;
        this.f2671b = i2Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f2670a) {
            case 0:
                String str = (String) obj;
                i2 i2Var = this.f2671b;
                ArrayList arrayList = i2Var.f2711c0;
                a8.b bVar = i2Var.f2725r0;
                i2Var.f2718j0 = str;
                int i10 = i2Var.f2721n0;
                if (i10 == 1) {
                    AndroidUtilities.cancelRunOnUIThread(bVar);
                    AndroidUtilities.runOnUIThread(bVar, 350L);
                    break;
                } else if (i10 == 2) {
                    if (!TextUtils.isEmpty(str)) {
                        AndroidUtilities.cancelRunOnUIThread(bVar);
                        AndroidUtilities.runOnUIThread(bVar, 350L);
                    } else {
                        AndroidUtilities.cancelRunOnUIThread(bVar);
                        arrayList.clear();
                        arrayList.addAll(q0.e(i2Var.m0.f22380id));
                        i2Var.a0(false, true);
                        i2Var.X(true);
                    }
                    break;
                } else if (i10 == 3) {
                    i2Var.a0(false, true);
                    i2Var.X(true);
                    break;
                }
                break;
            default:
                List list = (List) obj;
                i2 i2Var2 = this.f2671b;
                ArrayList arrayList2 = i2Var2.f2711c0;
                if (!TextUtils.isEmpty(i2Var2.f2718j0)) {
                    arrayList2.clear();
                    arrayList2.addAll(list);
                    i2Var2.b0(true, true);
                    i2Var2.X(true);
                    break;
                }
                break;
        }
    }
}
