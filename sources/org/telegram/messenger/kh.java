package org.telegram.messenger;

import org.telegram.tgnet.ConnectionsManager;
public final class kh implements Runnable {
    public final int f18209a;
    public final int f18210b;
    public final int f18211c;

    public kh(int i10, int i11, int i12) {
        this.f18209a = i12;
        this.f18210b = i10;
        this.f18211c = i11;
    }

    @Override
    public final void run() {
        switch (this.f18209a) {
            case 0:
                PasskeysController.f(this.f18210b, this.f18211c);
                return;
            case 1:
                ConnectionsManager.A(this.f18210b, this.f18211c);
                return;
            case 2:
                ConnectionsManager.s(this.f18210b, this.f18211c);
                return;
            default:
                ConnectionsManager.getInstance(this.f18210b).cancelRequest(this.f18211c, true);
                return;
        }
    }
}
