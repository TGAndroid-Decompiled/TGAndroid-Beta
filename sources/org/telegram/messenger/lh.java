package org.telegram.messenger;

import org.telegram.tgnet.ConnectionsManager;
public final class lh implements Runnable {
    public final int f16698a;
    public final int f16699b;
    public final int f16700c;

    public lh(int i10, int i11, int i12) {
        this.f16698a = i12;
        this.f16699b = i10;
        this.f16700c = i11;
    }

    @Override
    public final void run() {
        switch (this.f16698a) {
            case 0:
                PasskeysController.f(this.f16699b, this.f16700c);
                return;
            case 1:
                ConnectionsManager.B(this.f16699b, this.f16700c);
                return;
            case 2:
                ConnectionsManager.s(this.f16699b, this.f16700c);
                return;
            default:
                ConnectionsManager.getInstance(this.f16699b).cancelRequest(this.f16700c, true);
                return;
        }
    }
}
