package ai;

import java.util.ArrayList;
import org.telegram.ui.Components.fk0;
public final class t2 implements Runnable {
    public final int f1723a;
    public final x2 f1724b;

    public t2(x2 x2Var, int i10) {
        this.f1723a = i10;
        this.f1724b = x2Var;
    }

    @Override
    public final void run() {
        switch (this.f1723a) {
            case 0:
                x2 x2Var = this.f1724b;
                x2Var.invalidate();
                x2Var.b();
                return;
            default:
                ArrayList arrayList = this.f1724b.f1896e;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((fk0) obj).C(true);
                }
                arrayList.clear();
                return;
        }
    }
}
