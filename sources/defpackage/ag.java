package defpackage;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class ag implements Runnable {
    public final byte a;
    public final int b;
    public final TLRPC.Updates c;

    public ag(int i, TLRPC.Updates updates, byte b) {
        this.a = b;
        this.b = i;
        this.c = updates;
    }

    @Override
    public final void run() {
        byte b = this.a;
        TLRPC.Updates updates = this.c;
        int i = this.b;
        switch (b) {
            case 0:
                oc7.r1(i).T3(updates, false);
                return;
            case 1:
                ConnectionsManager.lambda$onUnparsedMessageReceived$12(i, updates);
                return;
            default:
                oc7.r1(i).T3(updates, false);
                return;
        }
    }
}
