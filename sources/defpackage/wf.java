package defpackage;

import java.util.HashMap;
public final class wf implements Runnable {
    public final byte a;
    public final p8c b;
    public final HashMap c;

    public wf(p8c p8cVar, HashMap hashMap, byte b) {
        this.a = b;
        this.b = p8cVar;
        this.c = hashMap;
    }

    @Override
    public final void run() {
        byte b = this.a;
        HashMap hashMap = this.c;
        p8c p8cVar = this.b;
        switch (b) {
            case 0:
                p8cVar.a(hashMap);
                return;
            default:
                p8cVar.a(hashMap);
                return;
        }
    }
}
