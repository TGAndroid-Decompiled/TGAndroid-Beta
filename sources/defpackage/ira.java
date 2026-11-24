package defpackage;

import java.util.ArrayList;
public final class ira implements Runnable {
    public final byte a;
    public final jra b;

    public ira(jra jraVar, byte b) {
        this.a = b;
        this.b = jraVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        int i = 0;
        jra jraVar = this.b;
        switch (b) {
            case 0:
                jraVar.r = false;
                jraVar.invalidate();
                jraVar.a();
                jraVar.c();
                return;
            case 1:
                jraVar.invalidate();
                return;
            default:
                jraVar.setMessageCell(null);
                ArrayList arrayList = jraVar.K;
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((oy8) obj).x(true);
                }
                arrayList.clear();
                return;
        }
    }
}
