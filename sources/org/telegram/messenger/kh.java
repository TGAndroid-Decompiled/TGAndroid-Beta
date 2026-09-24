package org.telegram.messenger;

import org.telegram.tgnet.ConnectionsManager;
public final class kh implements Runnable {
    public final int f16830a;
    public final int f16831b;
    public final int f16832c;

    public kh(int i10, int i11, int i12) {
        this.f16830a = i12;
        this.f16831b = i10;
        this.f16832c = i11;
    }

    @Override
    public final void run() {
        switch (this.f16830a) {
            case 0:
                PasskeysController.f(this.f16831b, this.f16832c);
                return;
            case 1:
                ConnectionsManager.B(this.f16831b, this.f16832c);
                return;
            case 2:
                ConnectionsManager.s(this.f16831b, this.f16832c);
                return;
            default:
                ConnectionsManager.getInstance(this.f16831b).cancelRequest(this.f16832c, true);
                return;
        }
    }
}
