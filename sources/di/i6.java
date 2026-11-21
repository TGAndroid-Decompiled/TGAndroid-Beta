package di;

import java.util.ArrayList;
import org.telegram.ui.Components.oh0;
public final class i6 implements Runnable {
    public final int f9038a;
    public final k6 f9039b;

    public i6(k6 k6Var, int i7) {
        this.f9038a = i7;
        this.f9039b = k6Var;
    }

    @Override
    public final void run() {
        switch (this.f9038a) {
            case 0:
                k6 k6Var = this.f9039b;
                k6Var.f9200r = false;
                k6Var.invalidate();
                k6Var.a();
                k6Var.c();
                return;
            case 1:
                this.f9039b.invalidate();
                return;
            default:
                k6 k6Var2 = this.f9039b;
                k6Var2.setMessageCell(null);
                ArrayList arrayList = k6Var2.K;
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    ((oh0) obj).C(true);
                }
                arrayList.clear();
                return;
        }
    }
}
