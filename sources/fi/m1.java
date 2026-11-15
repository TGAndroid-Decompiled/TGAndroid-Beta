package fi;

import java.util.ArrayList;
import org.telegram.ui.Components.ch0;
public final class m1 implements Runnable {
    public final int f12023a;
    public final o1 f12024b;

    public m1(o1 o1Var, int i7) {
        this.f12023a = i7;
        this.f12024b = o1Var;
    }

    @Override
    public final void run() {
        switch (this.f12023a) {
            case 0:
                o1 o1Var = this.f12024b;
                o1Var.invalidate();
                o1Var.b();
                return;
            default:
                ArrayList arrayList = this.f12024b.f12106e;
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    ((ch0) obj).C(true);
                }
                arrayList.clear();
                return;
        }
    }
}
