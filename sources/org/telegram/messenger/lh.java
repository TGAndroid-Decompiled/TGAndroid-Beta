package org.telegram.messenger;

import org.telegram.tgnet.ConnectionsManager;
public final class lh implements Runnable {
    public final int f16866a;
    public final int f16867b;
    public final int f16868c;

    public lh(int i10, int i11, int i12) {
        this.f16866a = i12;
        this.f16867b = i10;
        this.f16868c = i11;
    }

    @Override
    public final void run() {
        switch (this.f16866a) {
            case 0:
                PasskeysController.f(this.f16867b, this.f16868c);
                return;
            case 1:
                ConnectionsManager.B(this.f16867b, this.f16868c);
                return;
            case 2:
                ConnectionsManager.s(this.f16867b, this.f16868c);
                return;
            default:
                ConnectionsManager.getInstance(this.f16867b).cancelRequest(this.f16868c, true);
                return;
        }
    }
}
