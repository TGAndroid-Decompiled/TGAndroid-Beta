package org.telegram.messenger;

import org.telegram.tgnet.ConnectionsManager;
public final class nh implements Runnable {
    public final int f18397a;
    public final int f18398b;
    public final int f18399c;

    public nh(int i10, int i11, int i12) {
        this.f18397a = i12;
        this.f18398b = i10;
        this.f18399c = i11;
    }

    @Override
    public final void run() {
        switch (this.f18397a) {
            case 0:
                PasskeysController.lambda$login$11(this.f18398b, this.f18399c);
                return;
            case 1:
                ConnectionsManager.B(this.f18398b, this.f18399c);
                return;
            case 2:
                ConnectionsManager.r(this.f18398b, this.f18399c);
                return;
            default:
                ConnectionsManager.getInstance(this.f18398b).cancelRequest(this.f18399c, true);
                return;
        }
    }
}
