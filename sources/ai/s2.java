package ai;

import java.util.ArrayList;
import org.telegram.ui.Components.lj0;
public final class s2 implements Runnable {
    public final int f1491a;
    public final w2 f1492b;

    public s2(w2 w2Var, int i10) {
        this.f1491a = i10;
        this.f1492b = w2Var;
    }

    @Override
    public final void run() {
        switch (this.f1491a) {
            case 0:
                w2 w2Var = this.f1492b;
                w2Var.invalidate();
                w2Var.b();
                return;
            default:
                ArrayList arrayList = this.f1492b.e;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((lj0) obj).C(true);
                }
                arrayList.clear();
                return;
        }
    }
}
