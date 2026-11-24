package defpackage;

import java.util.HashMap;
public final class ug implements Runnable {
    public final byte a;
    public final qac b;
    public final HashMap c;

    public ug(qac qacVar, HashMap hashMap, byte b) {
        this.a = b;
        this.b = qacVar;
        this.c = hashMap;
    }

    @Override
    public final void run() {
        byte b = this.a;
        HashMap hashMap = this.c;
        qac qacVar = this.b;
        switch (b) {
            case 0:
                qacVar.a(hashMap);
                return;
            default:
                qacVar.a(hashMap);
                return;
        }
    }
}
