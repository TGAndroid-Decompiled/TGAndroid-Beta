package di;

import java.util.ArrayList;
import org.telegram.ui.Components.yj0;
public final class u1 implements Runnable {
    public final int f9220a;
    public final w1 f9221b;

    public u1(w1 w1Var, int i10) {
        this.f9220a = i10;
        this.f9221b = w1Var;
    }

    @Override
    public final void run() {
        switch (this.f9220a) {
            case 0:
                w1 w1Var = this.f9221b;
                w1Var.invalidate();
                w1Var.b();
                return;
            default:
                ArrayList arrayList = this.f9221b.e;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((yj0) obj).C(true);
                }
                arrayList.clear();
                return;
        }
    }
}
