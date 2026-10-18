package ci;

import java.util.ArrayList;
import org.telegram.ui.Components.uj0;
public final class u1 implements Runnable {
    public final int f5969a;
    public final w1 f5970b;

    public u1(w1 w1Var, int i10) {
        this.f5969a = i10;
        this.f5970b = w1Var;
    }

    @Override
    public final void run() {
        switch (this.f5969a) {
            case 0:
                w1 w1Var = this.f5970b;
                w1Var.invalidate();
                w1Var.b();
                return;
            default:
                ArrayList arrayList = this.f5970b.e;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((uj0) obj).C(true);
                }
                arrayList.clear();
                return;
        }
    }
}
