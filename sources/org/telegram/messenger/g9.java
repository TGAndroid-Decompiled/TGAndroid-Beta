package org.telegram.messenger;

import org.telegram.tgnet.ConnectionsManager;
public final class g9 implements Runnable {
    public final int f22605a;
    public final int f22606b;
    public final int f22607c;

    public g9(int i7, int i10, int i11) {
        this.f22605a = i11;
        this.f22606b = i7;
        this.f22607c = i10;
    }

    @Override
    public final void run() {
        int i7 = this.f22605a;
        int i10 = this.f22607c;
        int i11 = this.f22606b;
        switch (i7) {
            case 0:
                ConnectionsManager.getInstance(i11).cancelRequest(i10, true);
                return;
            case 1:
                ConnectionsManager.getInstance(i11).cancelRequest(i10, true);
                return;
            case 2:
                String[] strArr = MediaController.V1;
                qs.f(i11).k(156, Integer.valueOf(i10));
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
