package org.telegram.messenger;

import org.telegram.tgnet.ConnectionsManager;
public final class gh implements Runnable {
    public final int f18461a;
    public final int f18462b;
    public final int f18463c;

    public gh(int i10, int i11, int i12) {
        this.f18461a = i12;
        this.f18462b = i10;
        this.f18463c = i11;
    }

    @Override
    public final void run() {
        switch (this.f18461a) {
            case 0:
                PasskeysController.f(this.f18462b, this.f18463c);
                return;
            case 1:
                ConnectionsManager.B(this.f18462b, this.f18463c);
                return;
            case 2:
                ConnectionsManager.r(this.f18462b, this.f18463c);
                return;
            default:
                ConnectionsManager.getInstance(this.f18462b).cancelRequest(this.f18463c, true);
                return;
        }
    }
}
