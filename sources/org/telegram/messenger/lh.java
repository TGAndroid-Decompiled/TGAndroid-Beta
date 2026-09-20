package org.telegram.messenger;

import org.telegram.tgnet.ConnectionsManager;
public final class lh implements Runnable {
    public final int f16908a;
    public final int f16909b;
    public final int f16910c;

    public lh(int i10, int i11, int i12) {
        this.f16908a = i12;
        this.f16909b = i10;
        this.f16910c = i11;
    }

    @Override
    public final void run() {
        switch (this.f16908a) {
            case 0:
                PasskeysController.f(this.f16909b, this.f16910c);
                return;
            case 1:
                ConnectionsManager.B(this.f16909b, this.f16910c);
                return;
            case 2:
                ConnectionsManager.s(this.f16909b, this.f16910c);
                return;
            default:
                ConnectionsManager.getInstance(this.f16909b).cancelRequest(this.f16910c, true);
                return;
        }
    }
}
