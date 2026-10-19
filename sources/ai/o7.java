package ai;

import java.util.ArrayList;
import org.telegram.ui.Components.uj0;
public final class o7 implements Runnable {
    public final int f1938a;
    public final q7 f1939b;

    public o7(q7 q7Var, int i10) {
        this.f1938a = i10;
        this.f1939b = q7Var;
    }

    @Override
    public final void run() {
        switch (this.f1938a) {
            case 0:
                q7 q7Var = this.f1939b;
                q7Var.f2069r = false;
                q7Var.invalidate();
                q7Var.a();
                q7Var.c();
                return;
            case 1:
                this.f1939b.invalidate();
                return;
            default:
                q7 q7Var2 = this.f1939b;
                q7Var2.setMessageCell(null);
                ArrayList arrayList = q7Var2.J;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((uj0) obj).C(true);
                }
                arrayList.clear();
                return;
        }
    }
}
