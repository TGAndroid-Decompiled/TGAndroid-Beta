package ai;

import java.util.ArrayList;
import org.telegram.ui.Components.uj0;
public final class n7 implements Runnable {
    public final int f1898a;
    public final p7 f1899b;

    public n7(p7 p7Var, int i10) {
        this.f1898a = i10;
        this.f1899b = p7Var;
    }

    @Override
    public final void run() {
        switch (this.f1898a) {
            case 0:
                p7 p7Var = this.f1899b;
                p7Var.f2019r = false;
                p7Var.invalidate();
                p7Var.a();
                p7Var.c();
                return;
            case 1:
                this.f1899b.invalidate();
                return;
            default:
                p7 p7Var2 = this.f1899b;
                p7Var2.setMessageCell(null);
                ArrayList arrayList = p7Var2.J;
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
