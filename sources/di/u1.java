package di;

import java.util.ArrayList;
import org.telegram.ui.Components.xj0;
public final class u1 implements Runnable {
    public final int f9221a;
    public final w1 f9222b;

    public u1(w1 w1Var, int i10) {
        this.f9221a = i10;
        this.f9222b = w1Var;
    }

    @Override
    public final void run() {
        switch (this.f9221a) {
            case 0:
                w1 w1Var = this.f9222b;
                w1Var.invalidate();
                w1Var.b();
                return;
            default:
                ArrayList arrayList = this.f9222b.e;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((xj0) obj).C(true);
                }
                arrayList.clear();
                return;
        }
    }
}
