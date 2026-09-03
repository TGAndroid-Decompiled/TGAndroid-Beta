package lh;

import java.util.ArrayList;
import org.telegram.ui.Components.gj0;
public final class j5 implements Runnable {
    public final int f12650a;
    public final l5 f12651b;

    public j5(l5 l5Var, int i10) {
        this.f12650a = i10;
        this.f12651b = l5Var;
    }

    @Override
    public final void run() {
        switch (this.f12650a) {
            case 0:
                l5 l5Var = this.f12651b;
                l5Var.f12740r = false;
                l5Var.invalidate();
                l5Var.a();
                l5Var.c();
                return;
            case 1:
                this.f12651b.invalidate();
                return;
            default:
                l5 l5Var2 = this.f12651b;
                l5Var2.setMessageCell(null);
                ArrayList arrayList = l5Var2.G;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((gj0) obj).A(true);
                }
                arrayList.clear();
                return;
        }
    }
}
