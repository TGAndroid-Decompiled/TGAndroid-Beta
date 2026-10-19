package ci;

import java.util.ArrayList;
import org.telegram.ui.Components.uj0;
public final class v1 implements Runnable {
    public final int f6069a;
    public final x1 f6070b;

    public v1(x1 x1Var, int i10) {
        this.f6069a = i10;
        this.f6070b = x1Var;
    }

    @Override
    public final void run() {
        switch (this.f6069a) {
            case 0:
                x1 x1Var = this.f6070b;
                x1Var.invalidate();
                x1Var.b();
                return;
            default:
                ArrayList arrayList = this.f6070b.e;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((uj0) obj).C(true);
                }
                arrayList.clear();
                return;
        }
    }
}
