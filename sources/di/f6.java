package di;

import java.util.ArrayList;
import org.telegram.ui.Components.ch0;
public final class f6 implements Runnable {
    public final int f8535a;
    public final h6 f8536b;

    public f6(h6 h6Var, int i7) {
        this.f8535a = i7;
        this.f8536b = h6Var;
    }

    @Override
    public final void run() {
        switch (this.f8535a) {
            case 0:
                h6 h6Var = this.f8536b;
                h6Var.f8695r = false;
                h6Var.invalidate();
                h6Var.a();
                h6Var.c();
                return;
            case 1:
                this.f8536b.invalidate();
                return;
            default:
                h6 h6Var2 = this.f8536b;
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
