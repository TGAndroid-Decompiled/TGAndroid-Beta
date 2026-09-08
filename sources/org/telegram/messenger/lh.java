package org.telegram.messenger;

import org.telegram.tgnet.ConnectionsManager;
public final class lh implements Runnable {
    public final int f18316a;
    public final int f18317b;
    public final int f18318c;

    public lh(int i10, int i11, int i12) {
        this.f18316a = i12;
        this.f18317b = i10;
        this.f18318c = i11;
    }

    @Override
    public final void run() {
        switch (this.f18316a) {
            case 0:
                PasskeysController.f(this.f18317b, this.f18318c);
                return;
            case 1:
                ConnectionsManager.A(this.f18317b, this.f18318c);
                return;
            case 2:
                ConnectionsManager.s(this.f18317b, this.f18318c);
                return;
            default:
                ConnectionsManager.getInstance(this.f18317b).cancelRequest(this.f18318c, true);
                return;
        }
    }
}
