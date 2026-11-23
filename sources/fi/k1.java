package fi;

import java.util.ArrayList;
import org.telegram.ui.Components.nh0;
public final class k1 implements Runnable {
    public final int f12179a;
    public final m1 f12180b;

    public k1(m1 m1Var, int i7) {
        this.f12179a = i7;
        this.f12180b = m1Var;
    }

    @Override
    public final void run() {
        switch (this.f12179a) {
            case 0:
                m1 m1Var = this.f12180b;
                m1Var.invalidate();
                m1Var.b();
                return;
            default:
                ArrayList arrayList = this.f12180b.f12263e;
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    ((nh0) obj).C(true);
                }
                arrayList.clear();
                return;
        }
    }
}
