package defpackage;

import org.telegram.tgnet.ConnectionsManager;
public final class hs2 implements Runnable {
    public final byte a;
    public final ConnectionsManager b;
    public final int c;

    public hs2(ConnectionsManager connectionsManager, int i, byte b) {
        this.a = b;
        this.b = connectionsManager;
        this.c = i;
    }

    @Override
    public final void run() {
        byte b = this.a;
        int i = this.c;
        ConnectionsManager connectionsManager = this.b;
        switch (b) {
            case 0:
                ConnectionsManager.D(connectionsManager, i);
                return;
            default:
                ConnectionsManager.l(connectionsManager, i);
                return;
        }
    }
}
