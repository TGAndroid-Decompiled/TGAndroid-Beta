package ei;

import java.util.ArrayList;
import org.telegram.ui.Components.ch0;
public final class t1 implements Runnable {
    public final int f11037a;
    public final v1 f11038b;

    public t1(v1 v1Var, int i3) {
        this.f11037a = i3;
        this.f11038b = v1Var;
    }

    @Override
    public final void run() {
        switch (this.f11037a) {
            case 0:
                v1 v1Var = this.f11038b;
                v1Var.invalidate();
                v1Var.b();
                return;
            default:
                ArrayList arrayList = this.f11038b.f11113e;
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    ((ch0) obj).C(true);
                }
                arrayList.clear();
                return;
        }
    }
}
