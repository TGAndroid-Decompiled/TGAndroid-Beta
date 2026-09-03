package org.telegram.messenger;

import org.telegram.tgnet.ConnectionsManager;
public final class nh implements Runnable {
    public final int f19484a;
    public final int f19485b;
    public final int f19486c;

    public nh(int i10, int i11, int i12) {
        this.f19484a = i12;
        this.f19485b = i10;
        this.f19486c = i11;
    }

    @Override
    public final void run() {
        switch (this.f19484a) {
            case 0:
                PasskeysController.f(this.f19485b, this.f19486c);
                return;
            case 1:
                ConnectionsManager.A(this.f19485b, this.f19486c);
                return;
            case 2:
                ConnectionsManager.s(this.f19485b, this.f19486c);
                return;
            default:
                ConnectionsManager.getInstance(this.f19485b).cancelRequest(this.f19486c, true);
                return;
        }
    }
}
