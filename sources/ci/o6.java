package ci;

import java.util.ArrayList;
import org.telegram.ui.Components.ch0;
public final class o6 implements Runnable {
    public final int f5686a;
    public final q6 f5687b;

    public o6(q6 q6Var, int i3) {
        this.f5686a = i3;
        this.f5687b = q6Var;
    }

    @Override
    public final void run() {
        switch (this.f5686a) {
            case 0:
                q6 q6Var = this.f5687b;
                q6Var.f5838r = false;
                q6Var.invalidate();
                q6Var.a();
                q6Var.c();
                return;
            case 1:
                this.f5687b.invalidate();
                return;
            default:
                q6 q6Var2 = this.f5687b;
                q6Var2.setMessageCell(null);
                ArrayList arrayList = q6Var2.K;
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    ((ch0) obj).C(true);
                }
                arrayList.clear();
                return;
        }
    }
}
