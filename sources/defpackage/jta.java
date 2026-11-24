package defpackage;

import java.util.ArrayList;
public final class jta implements Runnable {
    public final byte a;
    public final kta b;

    public jta(kta ktaVar, byte b) {
        this.a = b;
        this.b = ktaVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        int i = 0;
        kta ktaVar = this.b;
        switch (b) {
            case 0:
                ktaVar.r = false;
                ktaVar.invalidate();
                ktaVar.a();
                ktaVar.c();
                return;
            case 1:
                ktaVar.invalidate();
                return;
            default:
                ktaVar.setMessageCell(null);
                ArrayList arrayList = ktaVar.K;
                int size = arrayList.size();
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
