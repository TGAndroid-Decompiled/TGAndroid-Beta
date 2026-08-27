package hh;

import java.util.ArrayList;
import org.telegram.ui.Components.oi0;

public final class l5 implements Runnable {

    public final int f9670a;

    public final o5 f9671b;

    public l5(o5 o5Var, int i10) {
        this.f9670a = i10;
        this.f9671b = o5Var;
    }

    @Override
    public final void run() {
        switch (this.f9670a) {
            case 0:
                o5 o5Var = this.f9671b;
                o5Var.f9832r = false;
                o5Var.invalidate();
                o5Var.a();
                o5Var.c();
                break;
            case 1:
                this.f9671b.invalidate();
                break;
            default:
                o5 o5Var2 = this.f9671b;
                o5Var2.setMessageCell(null);
                ArrayList arrayList = o5Var2.F;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((oi0) obj).A(true);
                }
                arrayList.clear();
                break;
        }
    }
}
