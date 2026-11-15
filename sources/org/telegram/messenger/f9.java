package org.telegram.messenger;

import org.telegram.tgnet.ConnectionsManager;
public final class f9 implements Runnable {
    public final int f23459a;
    public final int f23460b;
    public final int f23461c;

    public f9(int i7, int i10, int i11) {
        this.f23459a = i11;
        this.f23460b = i7;
        this.f23461c = i10;
    }

    @Override
    public final void run() {
        int i7 = this.f23459a;
        int i10 = this.f23461c;
        int i11 = this.f23460b;
        switch (i7) {
            case 0:
                ConnectionsManager.getInstance(i11).cancelRequest(i10, true);
                return;
            case 1:
                ConnectionsManager.getInstance(i11).cancelRequest(i10, true);
                return;
            case 2:
                String[] strArr = MediaController.W1;
                ns.f(i11).k(156, Integer.valueOf(i10));
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
