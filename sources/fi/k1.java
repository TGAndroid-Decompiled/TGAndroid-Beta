package fi;

import java.util.ArrayList;
import org.telegram.ui.Components.mh0;
public final class k1 implements Runnable {
    public final int f12175a;
    public final m1 f12176b;

    public k1(m1 m1Var, int i7) {
        this.f12175a = i7;
        this.f12176b = m1Var;
    }

    @Override
    public final void run() {
        switch (this.f12175a) {
            case 0:
                m1 m1Var = this.f12176b;
                m1Var.invalidate();
                m1Var.b();
                return;
            default:
                ArrayList arrayList = this.f12176b.f12255e;
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    ((mh0) obj).C(true);
                }
                arrayList.clear();
                return;
        }
    }
}
