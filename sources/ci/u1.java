package ci;

import java.util.ArrayList;
import org.telegram.ui.Components.xj0;
public final class u1 implements Runnable {
    public final int f5975a;
    public final w1 f5976b;

    public u1(w1 w1Var, int i10) {
        this.f5975a = i10;
        this.f5976b = w1Var;
    }

    @Override
    public final void run() {
        switch (this.f5975a) {
            case 0:
                w1 w1Var = this.f5976b;
                w1Var.invalidate();
                w1Var.b();
                return;
            default:
                ArrayList arrayList = this.f5976b.e;
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
