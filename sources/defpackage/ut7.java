package defpackage;

import java.util.ArrayList;
public final class ut7 implements Runnable {
    public final byte a;
    public final wt7 b;

    public ut7(wt7 wt7Var, byte b) {
        this.a = b;
        this.b = wt7Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        wt7 wt7Var = this.b;
        switch (b) {
            case 0:
                wt7Var.invalidate();
                wt7Var.b();
                return;
            default:
                ArrayList arrayList = wt7Var.e;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((p09) obj).x(true);
                }
                arrayList.clear();
                return;
        }
    }
}
