package defpackage;

import java.util.HashMap;
public final class zf implements Runnable {
    public final byte a;
    public final pcc b;
    public final HashMap c;

    public zf(pcc pccVar, HashMap hashMap, byte b) {
        this.a = b;
        this.b = pccVar;
        this.c = hashMap;
    }

    @Override
    public final void run() {
        byte b = this.a;
        HashMap hashMap = this.c;
        pcc pccVar = this.b;
        switch (b) {
            case 0:
                pccVar.a(hashMap);
                return;
            default:
                pccVar.a(hashMap);
                return;
        }
    }
}
