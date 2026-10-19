package org.telegram.messenger;

import org.telegram.tgnet.ConnectionsManager;
public final class gh implements Runnable {
    public final int f18464a;
    public final int f18465b;
    public final int f18466c;

    public gh(int i10, int i11, int i12) {
        this.f18464a = i12;
        this.f18465b = i10;
        this.f18466c = i11;
    }

    @Override
    public final void run() {
        switch (this.f18464a) {
            case 0:
                PasskeysController.f(this.f18465b, this.f18466c);
                return;
            case 1:
                ConnectionsManager.B(this.f18465b, this.f18466c);
                return;
            case 2:
                ConnectionsManager.r(this.f18465b, this.f18466c);
                return;
            default:
                ConnectionsManager.getInstance(this.f18465b).cancelRequest(this.f18466c, true);
                return;
        }
    }
}
