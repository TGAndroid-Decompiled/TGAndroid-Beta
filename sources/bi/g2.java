package bi;

import java.util.ArrayList;
import org.telegram.ui.Components.xi0;
public final class g2 implements Runnable {
    public final int f3018a;
    public final k2 f3019b;

    public g2(k2 k2Var, int i10) {
        this.f3018a = i10;
        this.f3019b = k2Var;
    }

    @Override
    public final void run() {
        switch (this.f3018a) {
            case 0:
                k2 k2Var = this.f3019b;
                k2Var.invalidate();
                k2Var.b();
                return;
            default:
                ArrayList arrayList = this.f3019b.f3189e;
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
