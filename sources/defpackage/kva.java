package defpackage;

import java.util.ArrayList;
public final class kva implements Runnable {
    public final byte a;
    public final lva b;

    public kva(lva lvaVar, byte b) {
        this.a = b;
        this.b = lvaVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        int i = 0;
        lva lvaVar = this.b;
        switch (b) {
            case 0:
                lvaVar.r = false;
                lvaVar.invalidate();
                lvaVar.a();
                lvaVar.c();
                return;
            case 1:
                lvaVar.invalidate();
                return;
            default:
                lvaVar.setMessageCell(null);
                ArrayList arrayList = lvaVar.K;
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((b29) obj).x(true);
                }
                arrayList.clear();
                return;
        }
    }
}
