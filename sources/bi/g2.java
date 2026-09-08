package bi;

import java.util.ArrayList;
import org.telegram.ui.Components.xi0;
public final class g2 implements Runnable {
    public final int f3045a;
    public final k2 f3046b;

    public g2(k2 k2Var, int i10) {
        this.f3045a = i10;
        this.f3046b = k2Var;
    }

    @Override
    public final void run() {
        switch (this.f3045a) {
            case 0:
                k2 k2Var = this.f3046b;
                k2Var.invalidate();
                k2Var.b();
                return;
            default:
                ArrayList arrayList = this.f3046b.f3216e;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((xi0) obj).A(true);
                }
                arrayList.clear();
                return;
        }
    }
}
