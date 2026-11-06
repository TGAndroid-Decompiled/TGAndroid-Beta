package bi;

import java.util.ArrayList;
import org.telegram.ui.Components.zg0;
public final class n7 implements Runnable {
    public final int f4410a;
    public final p7 f4411b;

    public n7(p7 p7Var, int i7) {
        this.f4410a = i7;
        this.f4411b = p7Var;
    }

    @Override
    public final void run() {
        switch (this.f4410a) {
            case 0:
                p7 p7Var = this.f4411b;
                p7Var.f4524r = false;
                p7Var.invalidate();
                p7Var.a();
                p7Var.c();
                return;
            case 1:
                this.f4411b.invalidate();
                return;
            default:
                p7 p7Var2 = this.f4411b;
                p7Var2.setMessageCell(null);
                ArrayList arrayList = p7Var2.J;
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
