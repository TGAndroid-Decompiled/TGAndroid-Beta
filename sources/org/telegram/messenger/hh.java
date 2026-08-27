package org.telegram.messenger;

import org.telegram.tgnet.ConnectionsManager;

public final class hh implements Runnable {

    public final int f20501a;

    public final int f20502b;

    public final int f20503c;

    public hh(int i10, int i11, int i12) {
        this.f20501a = i12;
        this.f20502b = i10;
        this.f20503c = i11;
    }

    @Override
    public final void run() {
        switch (this.f20501a) {
            case 0:
                PasskeysController.lambda$login$11(this.f20502b, this.f20503c);
                break;
            case 1:
                ConnectionsManager.lambda$onRequestNewServerIpAndPort$18(this.f20502b, this.f20503c);
                break;
            case 2:
                ConnectionsManager.lambda$onConnectionStateChanged$15(this.f20502b, this.f20503c);
                break;
            default:
                ConnectionsManager.getInstance(this.f20502b).cancelRequest(this.f20503c, true);
                break;
        }
    }
}
