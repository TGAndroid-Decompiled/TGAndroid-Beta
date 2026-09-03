package hg;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class b2 implements Utilities.Callback {
    public final int f7423a;
    public final f2 f7424b;

    public b2(f2 f2Var, int i10) {
        this.f7423a = i10;
        this.f7424b = f2Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f7423a) {
            case 0:
                String str = (String) obj;
                f2 f2Var = this.f7424b;
                ArrayList arrayList = f2Var.f7473d0;
                androidx.activity.i iVar = f2Var.f7487s0;
                f2Var.f7480k0 = str;
                int i10 = f2Var.f7483o0;
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 == 3) {
                            f2Var.a0(false, true);
                            f2Var.X(true);
                            return;
                        }
                        return;
                    } else if (TextUtils.isEmpty(str)) {
                        AndroidUtilities.cancelRunOnUIThread(iVar);
                        arrayList.clear();
                        arrayList.addAll(p0.e(f2Var.f7482n0.f20845id));
                        f2Var.a0(false, true);
                        f2Var.X(true);
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
                f2 f2Var2 = this.f7424b;
                ArrayList arrayList2 = f2Var2.f7473d0;
                if (!TextUtils.isEmpty(f2Var2.f7480k0)) {
                    arrayList2.clear();
                    arrayList2.addAll(list);
                    f2Var2.b0(true, true);
                    f2Var2.X(true);
                    return;
                }
                return;
        }
    }
}
