package lh;

import java.util.ArrayList;
import org.telegram.ui.Components.xi0;
public final class o1 implements Runnable {
    public final int f16011a;
    public final q1 f16012b;

    public o1(q1 q1Var, int i10) {
        this.f16011a = i10;
        this.f16012b = q1Var;
    }

    @Override
    public final void run() {
        switch (this.f16011a) {
            case 0:
                q1 q1Var = this.f16012b;
                q1Var.invalidate();
                q1Var.b();
                return;
            default:
                ArrayList arrayList = this.f16012b.f16112e;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((xi0) obj).A(true);
                }
                arrayList.clear();
                return;
        }
    }
}
