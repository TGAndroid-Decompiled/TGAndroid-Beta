package cg;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.Utilities;

public final class f2 implements Utilities.Callback {

    public final int f2681a;

    public final i2 f2682b;

    public final boolean f2683c;

    public f2(i2 i2Var, boolean z10, int i10) {
        this.f2681a = i10;
        this.f2682b = i2Var;
        this.f2683c = z10;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f2681a) {
            case 0:
                List list = (List) obj;
                i2 i2Var = this.f2682b;
                ArrayList arrayList = i2Var.f2711c0;
                if (this.f2683c) {
                    i2Var.f2712d0.addAll(list);
                }
                if (i2Var.f2721n0 == 1) {
                    arrayList.clear();
                    arrayList.addAll(list);
                    i2Var.b0(true, true);
                    i2Var.X(true);
                }
                break;
            default:
                i2.P(this.f2682b, this.f2683c, (Pair) obj);
                break;
        }
    }
}
