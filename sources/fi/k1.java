package fi;

import java.util.ArrayList;
import org.telegram.ui.Components.oh0;
public final class k1 implements Runnable {
    public final int f12170a;
    public final m1 f12171b;

    public k1(m1 m1Var, int i7) {
        this.f12170a = i7;
        this.f12171b = m1Var;
    }

    @Override
    public final void run() {
        switch (this.f12170a) {
            case 0:
                m1 m1Var = this.f12171b;
                m1Var.invalidate();
                m1Var.b();
                return;
            default:
                ArrayList arrayList = this.f12171b.f12250e;
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
