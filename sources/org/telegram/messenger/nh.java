package org.telegram.messenger;

import org.telegram.tgnet.ConnectionsManager;
public final class nh implements Runnable {
    public final int f18398a;
    public final int f18399b;
    public final int f18400c;

    public nh(int i10, int i11, int i12) {
        this.f18398a = i12;
        this.f18399b = i10;
        this.f18400c = i11;
    }

    @Override
    public final void run() {
        switch (this.f18398a) {
            case 0:
                PasskeysController.lambda$login$11(this.f18399b, this.f18400c);
                return;
            case 1:
                ConnectionsManager.B(this.f18399b, this.f18400c);
                return;
            case 2:
                ConnectionsManager.r(this.f18399b, this.f18400c);
                return;
            default:
                ConnectionsManager.getInstance(this.f18399b).cancelRequest(this.f18400c, true);
                return;
        }
    }
}
