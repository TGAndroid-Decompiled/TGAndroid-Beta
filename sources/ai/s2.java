package ai;

import java.util.ArrayList;
import org.telegram.ui.Components.kj0;
public final class s2 implements Runnable {
    public final int f1618a;
    public final w2 f1619b;

    public s2(w2 w2Var, int i10) {
        this.f1618a = i10;
        this.f1619b = w2Var;
    }

    @Override
    public final void run() {
        switch (this.f1618a) {
            case 0:
                w2 w2Var = this.f1619b;
                w2Var.invalidate();
                w2Var.b();
                return;
            default:
                ArrayList arrayList = this.f1619b.f1792e;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((kj0) obj).C(true);
                }
                arrayList.clear();
                return;
        }
    }
}
