package di;

import java.util.ArrayList;
import org.telegram.ui.Components.ah0;
public final class o1 implements Runnable {
    public final int f9423a;
    public final q1 f9424b;

    public o1(q1 q1Var, int i7) {
        this.f9423a = i7;
        this.f9424b = q1Var;
    }

    @Override
    public final void run() {
        switch (this.f9423a) {
            case 0:
                q1 q1Var = this.f9424b;
                q1Var.invalidate();
                q1Var.b();
                return;
            default:
                ArrayList arrayList = this.f9424b.f9566e;
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    ((ah0) obj).C(true);
                }
                arrayList.clear();
                return;
        }
    }
}
