package org.telegram.messenger;

import org.telegram.tgnet.ConnectionsManager;
public final class fh implements Runnable {
    public final int f18380a;
    public final int f18381b;
    public final int f18382c;

    public fh(int i10, int i11, int i12) {
        this.f18380a = i12;
        this.f18381b = i10;
        this.f18382c = i11;
    }

    @Override
    public final void run() {
        switch (this.f18380a) {
            case 0:
                PasskeysController.f(this.f18381b, this.f18382c);
                return;
            case 1:
                ConnectionsManager.B(this.f18381b, this.f18382c);
                return;
            case 2:
                ConnectionsManager.r(this.f18381b, this.f18382c);
                return;
            default:
                ConnectionsManager.getInstance(this.f18381b).cancelRequest(this.f18382c, true);
                return;
        }
    }
}
