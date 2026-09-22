package org.telegram.messenger;

import org.telegram.tgnet.ConnectionsManager;
public final class lh implements Runnable {
    public final int f16923a;
    public final int f16924b;
    public final int f16925c;

    public lh(int i10, int i11, int i12) {
        this.f16923a = i12;
        this.f16924b = i10;
        this.f16925c = i11;
    }

    @Override
    public final void run() {
        switch (this.f16923a) {
            case 0:
                PasskeysController.f(this.f16924b, this.f16925c);
                return;
            case 1:
                ConnectionsManager.B(this.f16924b, this.f16925c);
                return;
            case 2:
                ConnectionsManager.s(this.f16924b, this.f16925c);
                return;
            default:
                ConnectionsManager.getInstance(this.f16924b).cancelRequest(this.f16925c, true);
                return;
        }
    }
}
