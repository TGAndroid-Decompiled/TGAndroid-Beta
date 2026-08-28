package bg;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.Utilities;
public final class m2 implements Utilities.Callback {
    public final int f1879a;
    public final q2 f1880b;
    public final boolean f1881c;

    public m2(q2 q2Var, boolean z10, int i9) {
        this.f1879a = i9;
        this.f1880b = q2Var;
        this.f1881c = z10;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f1879a) {
            case 0:
                List list = (List) obj;
                q2 q2Var = this.f1880b;
                ArrayList arrayList = q2Var.f1925c0;
                if (this.f1881c) {
                    q2Var.f1926d0.addAll(list);
                }
                if (q2Var.f1935n0 == 1) {
                    arrayList.clear();
                    arrayList.addAll(list);
                    q2Var.a0(true, true);
                    q2Var.W(true);
                    return;
                }
                return;
            default:
                q2.O(this.f1880b, this.f1881c, (Pair) obj);
                return;
        }
    }
}
