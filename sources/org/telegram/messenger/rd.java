package org.telegram.messenger;

import org.telegram.tgnet.ConnectionsManager;
public final class rd implements Runnable {
    public final int f25107a;
    public final int f25108b;
    public final int f25109c;

    public rd(int i3, int i10, int i11) {
        this.f25107a = i11;
        this.f25108b = i3;
        this.f25109c = i10;
    }

    @Override
    public final void run() {
        int i3 = this.f25107a;
        int i10 = this.f25109c;
        int i11 = this.f25108b;
        switch (i3) {
            case 0:
                String[] strArr = MediaController.W1;
                hs.f(i11).k(156, Integer.valueOf(i10));
                return;
            case 1:
                ConnectionsManager.getInstance(i11).cancelRequest(i10, true);
                return;
            case 2:
                ConnectionsManager.lambda$onConnectionStateChanged$15(i11, i10);
                return;
            case 3:
                ConnectionsManager.lambda$onRequestNewServerIpAndPort$18(i11, i10);
                return;
            default:
                ConnectionsManager.getInstance(i11).cancelRequest(i10, true);
                return;
        }
    }
}
