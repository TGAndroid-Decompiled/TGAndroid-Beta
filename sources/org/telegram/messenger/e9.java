package org.telegram.messenger;

import org.telegram.tgnet.ConnectionsManager;
public final class e9 implements Runnable {
    public final int f23777a;
    public final int f23778b;
    public final int f23779c;

    public e9(int i7, int i10, int i11) {
        this.f23777a = i11;
        this.f23778b = i7;
        this.f23779c = i10;
    }

    @Override
    public final void run() {
        int i7 = this.f23777a;
        int i10 = this.f23779c;
        int i11 = this.f23778b;
        switch (i7) {
            case 0:
                ConnectionsManager.getInstance(i11).cancelRequest(i10, true);
                return;
            case 1:
                ConnectionsManager.getInstance(i11).cancelRequest(i10, true);
                return;
            case 2:
                String[] strArr = MediaController.W1;
                ks.f(i11).k(156, Integer.valueOf(i10));
                return;
            case 3:
                ConnectionsManager.getInstance(i11).cancelRequest(i10, true);
                return;
            case 4:
                ConnectionsManager.lambda$onConnectionStateChanged$15(i11, i10);
                return;
            case 5:
                ConnectionsManager.lambda$onRequestNewServerIpAndPort$18(i11, i10);
                return;
            default:
                ConnectionsManager.getInstance(i11).cancelRequest(i10, true);
                return;
        }
    }
}
