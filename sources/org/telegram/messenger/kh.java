package org.telegram.messenger;

import org.telegram.tgnet.ConnectionsManager;
public final class kh implements Runnable {
    public final int f18385a;
    public final int f18386b;
    public final int f18387c;

    public kh(int i10, int i11, int i12) {
        this.f18385a = i12;
        this.f18386b = i10;
        this.f18387c = i11;
    }

    @Override
    public final void run() {
        switch (this.f18385a) {
            case 0:
                PasskeysController.f(this.f18386b, this.f18387c);
                return;
            case 1:
                ConnectionsManager.B(this.f18386b, this.f18387c);
                return;
            case 2:
                ConnectionsManager.s(this.f18386b, this.f18387c);
                return;
            default:
                ConnectionsManager.getInstance(this.f18386b).cancelRequest(this.f18387c, true);
                return;
        }
    }
}
