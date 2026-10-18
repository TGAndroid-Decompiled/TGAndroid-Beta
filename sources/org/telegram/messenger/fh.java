package org.telegram.messenger;

import org.telegram.tgnet.ConnectionsManager;
public final class fh implements Runnable {
    public final int f18388a;
    public final int f18389b;
    public final int f18390c;

    public fh(int i10, int i11, int i12) {
        this.f18388a = i12;
        this.f18389b = i10;
        this.f18390c = i11;
    }

    @Override
    public final void run() {
        switch (this.f18388a) {
            case 0:
                PasskeysController.f(this.f18389b, this.f18390c);
                return;
            case 1:
                ConnectionsManager.B(this.f18389b, this.f18390c);
                return;
            case 2:
                ConnectionsManager.r(this.f18389b, this.f18390c);
                return;
            default:
                ConnectionsManager.getInstance(this.f18389b).cancelRequest(this.f18390c, true);
                return;
        }
    }
}
