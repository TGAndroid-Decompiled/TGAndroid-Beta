package bi;

import java.util.ArrayList;
import org.telegram.ui.Components.xj0;
public final class k7 implements Runnable {
    public final int f4966a;
    public final m7 f4967b;

    public k7(m7 m7Var, int i10) {
        this.f4966a = i10;
        this.f4967b = m7Var;
    }

    @Override
    public final void run() {
        switch (this.f4966a) {
            case 0:
                m7 m7Var = this.f4967b;
                m7Var.f5092r = false;
                m7Var.invalidate();
                m7Var.a();
                m7Var.c();
                return;
            case 1:
                this.f4967b.invalidate();
                return;
            default:
                m7 m7Var2 = this.f4967b;
                m7Var2.setMessageCell(null);
                ArrayList arrayList = m7Var2.J;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((xj0) obj).C(true);
                }
                arrayList.clear();
                return;
        }
    }
}
