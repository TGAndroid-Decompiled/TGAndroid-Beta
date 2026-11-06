package di;

import java.util.ArrayList;
import org.telegram.ui.Components.zg0;
public final class o1 implements Runnable {
    public final int f9445a;
    public final q1 f9446b;

    public o1(q1 q1Var, int i7) {
        this.f9445a = i7;
        this.f9446b = q1Var;
    }

    @Override
    public final void run() {
        switch (this.f9445a) {
            case 0:
                q1 q1Var = this.f9446b;
                q1Var.invalidate();
                q1Var.b();
                return;
            default:
                ArrayList arrayList = this.f9446b.f9625e;
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    ((zg0) obj).C(true);
                }
                arrayList.clear();
                return;
        }
    }
}
