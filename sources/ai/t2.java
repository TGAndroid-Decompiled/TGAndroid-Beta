package ai;

import java.util.ArrayList;
import org.telegram.ui.Components.dk0;
public final class t2 implements Runnable {
    public final int f1725a;
    public final x2 f1726b;

    public t2(x2 x2Var, int i10) {
        this.f1725a = i10;
        this.f1726b = x2Var;
    }

    @Override
    public final void run() {
        switch (this.f1725a) {
            case 0:
                x2 x2Var = this.f1726b;
                x2Var.invalidate();
                x2Var.b();
                return;
            default:
                ArrayList arrayList = this.f1726b.f1898e;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((dk0) obj).C(true);
                }
                arrayList.clear();
                return;
        }
    }
}
