package defpackage;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class ze implements Runnable {
    public final byte a;
    public final int b;
    public final TLRPC.Updates c;

    public ze(int i, TLRPC.Updates updates, byte b) {
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
                na7.q1(i).R3(updates, false);
                return;
            case 1:
                ConnectionsManager.lambda$onUnparsedMessageReceived$12(i, updates);
                return;
            default:
                na7.q1(i).R3(updates, false);
                return;
        }
    }
}
