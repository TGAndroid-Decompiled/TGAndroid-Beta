package org.telegram.messenger;

import org.telegram.tgnet.ConnectionsManager;
public final class kh implements Runnable {
    public final int f16846a;
    public final int f16847b;
    public final int f16848c;

    public kh(int i10, int i11, int i12) {
        this.f16846a = i12;
        this.f16847b = i10;
        this.f16848c = i11;
    }

    @Override
    public final void run() {
        switch (this.f16846a) {
            case 0:
                PasskeysController.f(this.f16847b, this.f16848c);
                return;
            case 1:
                ConnectionsManager.B(this.f16847b, this.f16848c);
                return;
            case 2:
                ConnectionsManager.s(this.f16847b, this.f16848c);
                return;
            default:
                ConnectionsManager.getInstance(this.f16847b).cancelRequest(this.f16848c, true);
                return;
        }
    }
}
