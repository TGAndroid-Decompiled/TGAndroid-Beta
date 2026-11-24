package defpackage;

import org.telegram.tgnet.ConnectionsManager;
public final class tt2 implements Runnable {
    public final byte a;
    public final boolean b;
    public final int c;
    public final int d;

    public tt2(boolean z, int i, int i2) {
        this.a = (byte) 1;
        this.b = z;
        this.c = i;
        this.d = i2;
    }

    @Override
    public final void run() {
        switch (this.a) {
            case 0:
                ConnectionsManager.lambda$onPremiumFloodWait$24(this.c, this.b, this.d);
                return;
            case 1:
                ConnectionsManager.lambda$onPremiumFloodWait$23(this.b, this.c, this.d);
                return;
            default:
                ConnectionsManager.lambda$onRequestNewServerIpAndPort$17(this.c, this.b, this.d);
                return;
        }
    }

    public tt2(int i, boolean z, int i2, byte b) {
        this.a = b;
        this.c = i;
        this.b = z;
        this.d = i2;
    }
}
