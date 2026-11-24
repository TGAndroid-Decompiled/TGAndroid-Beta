package defpackage;

import org.telegram.messenger.MediaController;
import org.telegram.tgnet.ConnectionsManager;
public final class gs2 implements Runnable {
    public final byte a;
    public final int b;
    public final int c;

    public gs2(int i, int i2, byte b) {
        this.a = b;
        this.b = i;
        this.c = i2;
    }

    @Override
    public final void run() {
        byte b = this.a;
        int i = this.c;
        int i2 = this.b;
        switch (b) {
            case 0:
                ConnectionsManager.lambda$onConnectionStateChanged$15(i2, i);
                return;
            case 1:
                ConnectionsManager.lambda$onRequestNewServerIpAndPort$18(i2, i);
                return;
            case 2:
                ConnectionsManager.getInstance(i2).cancelRequest(i, true);
                return;
            case 3:
                ConnectionsManager.getInstance(i2).cancelRequest(i, true);
                return;
            case 4:
                ConnectionsManager.getInstance(i2).cancelRequest(i, true);
                return;
            case 5:
                String[] strArr = MediaController.W1;
                kk7.f(i2).k(156, Integer.valueOf(i));
                return;
            default:
                ConnectionsManager.getInstance(i2).cancelRequest(i, true);
                return;
        }
    }
}
