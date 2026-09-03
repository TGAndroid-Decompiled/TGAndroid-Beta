package gg;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.Utilities;
public final class c2 implements Utilities.Callback {
    public final int f6582a;
    public final f2 f6583b;
    public final boolean f6584c;

    public c2(f2 f2Var, boolean z4, int i10) {
        this.f6582a = i10;
        this.f6583b = f2Var;
        this.f6584c = z4;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f6582a) {
            case 0:
                List list = (List) obj;
                f2 f2Var = this.f6583b;
                ArrayList arrayList = f2Var.f6616d0;
                if (this.f6584c) {
                    f2Var.f6617e0.addAll(list);
                }
                if (f2Var.f6626o0 == 1) {
                    arrayList.clear();
                    arrayList.addAll(list);
                    f2Var.b0(true, true);
                    f2Var.X(true);
                    return;
                }
                return;
            default:
                f2.P(this.f6583b, this.f6584c, (Pair) obj);
                return;
        }
    }
}
