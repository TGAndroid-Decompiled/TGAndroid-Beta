package gh;

import java.util.ArrayList;
import org.telegram.ui.Components.mi0;
public final class n5 implements Runnable {
    public final int f8603a;
    public final p5 f8604b;

    public n5(p5 p5Var, int i9) {
        this.f8603a = i9;
        this.f8604b = p5Var;
    }

    @Override
    public final void run() {
        switch (this.f8603a) {
            case 0:
                p5 p5Var = this.f8604b;
                p5Var.f8719r = false;
                p5Var.invalidate();
                p5Var.a();
                p5Var.c();
                return;
            case 1:
                this.f8604b.invalidate();
                return;
            default:
                p5 p5Var2 = this.f8604b;
                p5Var2.setMessageCell(null);
                ArrayList arrayList = p5Var2.F;
                int size = arrayList.size();
                int i9 = 0;
                while (i9 < size) {
                    Object obj = arrayList.get(i9);
                    i9++;
                    ((mi0) obj).A(true);
                }
                arrayList.clear();
                return;
        }
    }
}
