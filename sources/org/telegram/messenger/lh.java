package org.telegram.messenger;

import org.telegram.tgnet.ConnectionsManager;
public final class lh implements Runnable {
    public final int f18289a;
    public final int f18290b;
    public final int f18291c;

    public lh(int i10, int i11, int i12) {
        this.f18289a = i12;
        this.f18290b = i10;
        this.f18291c = i11;
    }

    @Override
    public final void run() {
        switch (this.f18289a) {
            case 0:
                PasskeysController.f(this.f18290b, this.f18291c);
                return;
            case 1:
                ConnectionsManager.A(this.f18290b, this.f18291c);
                return;
            case 2:
                ConnectionsManager.s(this.f18290b, this.f18291c);
                return;
            default:
                ConnectionsManager.getInstance(this.f18290b).cancelRequest(this.f18291c, true);
                return;
        }
    }
}
