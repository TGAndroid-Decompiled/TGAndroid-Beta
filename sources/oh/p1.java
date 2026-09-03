package oh;

import java.util.ArrayList;
import org.telegram.ui.Components.hj0;
public final class p1 implements Runnable {
    public final int f17617a;
    public final r1 f17618b;

    public p1(r1 r1Var, int i10) {
        this.f17617a = i10;
        this.f17618b = r1Var;
    }

    @Override
    public final void run() {
        switch (this.f17617a) {
            case 0:
                r1 r1Var = this.f17618b;
                r1Var.invalidate();
                r1Var.b();
                return;
            default:
                ArrayList arrayList = this.f17618b.f17680e;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((hj0) obj).A(true);
                }
                arrayList.clear();
                return;
        }
    }
}
