package org.telegram.messenger;

import org.telegram.tgnet.ConnectionsManager;
public final class td implements Runnable {
    public final int f18043a;
    public final int f18044b;
    public final int f18045c;

    public td(int i10, int i11, int i12) {
        this.f18043a = i12;
        this.f18044b = i10;
        this.f18045c = i11;
    }

    @Override
    public final void run() {
        int i10 = this.f18043a;
        int i11 = this.f18045c;
        int i12 = this.f18044b;
        switch (i10) {
            case 0:
                String[] strArr = MediaController.U1;
                zs.f(i12).k(156, Integer.valueOf(i11));
                return;
            case 1:
                ConnectionsManager.getInstance(i12).cancelRequest(i11, true);
                return;
            case 2:
                ConnectionsManager.lambda$onRequestNewServerIpAndPort$18(i12, i11);
                return;
            case 3:
                ConnectionsManager.lambda$onConnectionStateChanged$15(i12, i11);
                return;
            default:
                ConnectionsManager.getInstance(i12).cancelRequest(i11, true);
                return;
        }
    }
}
