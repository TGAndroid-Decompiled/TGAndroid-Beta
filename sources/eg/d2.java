package eg;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.Utilities;
public final class d2 implements Utilities.Callback {
    public final int f5967a;
    public final g2 f5968b;
    public final boolean f5969c;

    public d2(g2 g2Var, boolean z10, int i10) {
        this.f5967a = i10;
        this.f5968b = g2Var;
        this.f5969c = z10;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f5967a) {
            case 0:
                List list = (List) obj;
                g2 g2Var = this.f5968b;
                ArrayList arrayList = g2Var.f6005c0;
                if (this.f5969c) {
                    g2Var.f6006d0.addAll(list);
                }
                if (g2Var.f6015n0 == 1) {
                    arrayList.clear();
                    arrayList.addAll(list);
                    g2Var.b0(true, true);
                    g2Var.X(true);
                    return;
                }
                return;
            default:
                g2.P(this.f5968b, this.f5969c, (Pair) obj);
                return;
        }
    }
}
