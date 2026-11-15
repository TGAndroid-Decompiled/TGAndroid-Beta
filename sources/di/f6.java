package di;

import java.util.ArrayList;
import org.telegram.ui.Components.ch0;
public final class f6 implements Runnable {
    public final int f8540a;
    public final h6 f8541b;

    public f6(h6 h6Var, int i7) {
        this.f8540a = i7;
        this.f8541b = h6Var;
    }

    @Override
    public final void run() {
        switch (this.f8540a) {
            case 0:
                h6 h6Var = this.f8541b;
                h6Var.f8721r = false;
                h6Var.invalidate();
                h6Var.a();
                h6Var.c();
                return;
            case 1:
                this.f8541b.invalidate();
                return;
            default:
                h6 h6Var2 = this.f8541b;
                h6Var2.setMessageCell(null);
                ArrayList arrayList = h6Var2.K;
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
