package bi;

import java.util.ArrayList;
import org.telegram.ui.Components.yj0;
public final class h2 implements Runnable {
    public final int f3113a;
    public final l2 f3114b;

    public h2(l2 l2Var, int i10) {
        this.f3113a = i10;
        this.f3114b = l2Var;
    }

    @Override
    public final void run() {
        switch (this.f3113a) {
            case 0:
                l2 l2Var = this.f3114b;
                l2Var.invalidate();
                l2Var.b();
                return;
            default:
                ArrayList arrayList = this.f3114b.e;
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
