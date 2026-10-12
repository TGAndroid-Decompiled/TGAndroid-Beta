package bi;

import java.util.ArrayList;
import org.telegram.ui.Components.yj0;
public final class h2 implements Runnable {
    public final int f3109a;
    public final l2 f3110b;

    public h2(l2 l2Var, int i10) {
        this.f3109a = i10;
        this.f3110b = l2Var;
    }

    @Override
    public final void run() {
        switch (this.f3109a) {
            case 0:
                l2 l2Var = this.f3110b;
                l2Var.invalidate();
                l2Var.b();
                return;
            default:
                ArrayList arrayList = this.f3110b.e;
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
