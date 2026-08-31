package hg;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.Utilities;
public final class c2 implements Utilities.Callback {
    public final int f7435a;
    public final f2 f7436b;
    public final boolean f7437c;

    public c2(f2 f2Var, boolean z4, int i10) {
        this.f7435a = i10;
        this.f7436b = f2Var;
        this.f7437c = z4;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f7435a) {
            case 0:
                List list = (List) obj;
                f2 f2Var = this.f7436b;
                ArrayList arrayList = f2Var.f7473d0;
                if (this.f7437c) {
                    f2Var.f7474e0.addAll(list);
                }
                if (f2Var.f7483o0 == 1) {
                    arrayList.clear();
                    arrayList.addAll(list);
                    f2Var.b0(true, true);
                    f2Var.X(true);
                    return;
                }
                return;
            default:
                f2.P(this.f7436b, this.f7437c, (Pair) obj);
                return;
        }
    }
}
