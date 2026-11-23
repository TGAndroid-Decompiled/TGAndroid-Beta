package org.telegram.messenger;

import org.telegram.tgnet.ConnectionsManager;
public final class f9 implements Runnable {
    public final int f23881a;
    public final int f23882b;
    public final int f23883c;

    public f9(int i7, int i10, int i11) {
        this.f23881a = i11;
        this.f23882b = i7;
        this.f23883c = i10;
    }

    @Override
    public final void run() {
        int i7 = this.f23881a;
        int i10 = this.f23883c;
        int i11 = this.f23882b;
        switch (i7) {
            case 0:
                ConnectionsManager.getInstance(i11).cancelRequest(i10, true);
                return;
            case 1:
                ConnectionsManager.getInstance(i11).cancelRequest(i10, true);
                return;
            case 2:
                String[] strArr = MediaController.W1;
                ls.f(i11).k(156, Integer.valueOf(i10));
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
