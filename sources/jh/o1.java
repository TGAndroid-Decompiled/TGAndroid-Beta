package jh;

import java.util.ArrayList;
import org.telegram.ui.Components.oi0;

public final class o1 implements Runnable {

    public final int f13736a;

    public final q1 f13737b;

    public o1(q1 q1Var, int i10) {
        this.f13736a = i10;
        this.f13737b = q1Var;
    }

    @Override
    public final void run() {
        switch (this.f13736a) {
            case 0:
                q1 q1Var = this.f13737b;
                q1Var.invalidate();
                q1Var.b();
                break;
            default:
                ArrayList arrayList = this.f13737b.f13846e;
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
