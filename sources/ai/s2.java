package ai;

import java.util.ArrayList;
import org.telegram.ui.Components.xi0;
public final class s2 implements Runnable {
    public final int f1494a;
    public final w2 f1495b;

    public s2(w2 w2Var, int i10) {
        this.f1494a = i10;
        this.f1495b = w2Var;
    }

    @Override
    public final void run() {
        switch (this.f1494a) {
            case 0:
                w2 w2Var = this.f1495b;
                w2Var.invalidate();
                w2Var.b();
                return;
            default:
                ArrayList arrayList = this.f1495b.e;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((xi0) obj).C(true);
                }
                arrayList.clear();
                return;
        }
    }
}
