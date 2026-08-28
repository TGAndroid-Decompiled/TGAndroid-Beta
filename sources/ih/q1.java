package ih;

import java.util.ArrayList;
import org.telegram.ui.Components.mi0;
public final class q1 implements Runnable {
    public final int f11995a;
    public final s1 f11996b;

    public q1(s1 s1Var, int i9) {
        this.f11995a = i9;
        this.f11996b = s1Var;
    }

    @Override
    public final void run() {
        switch (this.f11995a) {
            case 0:
                s1 s1Var = this.f11996b;
                s1Var.invalidate();
                s1Var.b();
                return;
            default:
                ArrayList arrayList = this.f11996b.f12103e;
                int size = arrayList.size();
                int i9 = 0;
                while (i9 < size) {
                    Object obj = arrayList.get(i9);
                    i9++;
                    ((mi0) obj).A(true);
                }
                arrayList.clear();
                return;
        }
    }
}
