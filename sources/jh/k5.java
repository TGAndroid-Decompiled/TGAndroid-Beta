package jh;

import java.util.ArrayList;
import org.telegram.ui.Components.xi0;
public final class k5 implements Runnable {
    public final int f12365a;
    public final m5 f12366b;

    public k5(m5 m5Var, int i10) {
        this.f12365a = i10;
        this.f12366b = m5Var;
    }

    @Override
    public final void run() {
        switch (this.f12365a) {
            case 0:
                m5 m5Var = this.f12366b;
                m5Var.f12460r = false;
                m5Var.invalidate();
                m5Var.a();
                m5Var.c();
                return;
            case 1:
                this.f12366b.invalidate();
                return;
            default:
                m5 m5Var2 = this.f12366b;
                m5Var2.setMessageCell(null);
                ArrayList arrayList = m5Var2.F;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((xi0) obj).A(true);
                }
                arrayList.clear();
                return;
        }
    }
}
