package org.telegram.messenger;

import org.telegram.tgnet.ConnectionsManager;
public final class hh implements Runnable {
    public final int f18551a;
    public final int f18552b;
    public final int f18553c;

    public hh(int i10, int i11, int i12) {
        this.f18551a = i12;
        this.f18552b = i10;
        this.f18553c = i11;
    }

    @Override
    public final void run() {
        switch (this.f18551a) {
            case 0:
                PasskeysController.f(this.f18552b, this.f18553c);
                return;
            case 1:
                ConnectionsManager.B(this.f18552b, this.f18553c);
                return;
            case 2:
                ConnectionsManager.r(this.f18552b, this.f18553c);
                return;
            default:
                ConnectionsManager.getInstance(this.f18552b).cancelRequest(this.f18553c, true);
                return;
        }
    }
}
