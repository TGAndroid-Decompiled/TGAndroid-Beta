package org.telegram.messenger;

import org.telegram.tgnet.ConnectionsManager;
public final class lh implements Runnable {
    public final int f16685a;
    public final int f16686b;
    public final int f16687c;

    public lh(int i10, int i11, int i12) {
        this.f16685a = i12;
        this.f16686b = i10;
        this.f16687c = i11;
    }

    @Override
    public final void run() {
        switch (this.f16685a) {
            case 0:
                PasskeysController.f(this.f16686b, this.f16687c);
                return;
            case 1:
                ConnectionsManager.B(this.f16686b, this.f16687c);
                return;
            case 2:
                ConnectionsManager.s(this.f16686b, this.f16687c);
                return;
            default:
                ConnectionsManager.getInstance(this.f16686b).cancelRequest(this.f16687c, true);
                return;
        }
    }
}
