package nh;

import java.util.ArrayList;
import org.telegram.ui.Components.gj0;
public final class p1 implements Runnable {
    public final int f15740a;
    public final r1 f15741b;

    public p1(r1 r1Var, int i10) {
        this.f15740a = i10;
        this.f15741b = r1Var;
    }

    @Override
    public final void run() {
        switch (this.f15740a) {
            case 0:
                r1 r1Var = this.f15741b;
                r1Var.invalidate();
                r1Var.b();
                return;
            default:
                ArrayList arrayList = this.f15741b.e;
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
