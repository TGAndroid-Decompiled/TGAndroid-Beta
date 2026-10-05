package org.telegram.messenger;

import org.telegram.tgnet.ConnectionsManager;
public final class kh implements Runnable {
    public final int f18386a;
    public final int f18387b;
    public final int f18388c;

    public kh(int i10, int i11, int i12) {
        this.f18386a = i12;
        this.f18387b = i10;
        this.f18388c = i11;
    }

    @Override
    public final void run() {
        switch (this.f18386a) {
            case 0:
                PasskeysController.f(this.f18387b, this.f18388c);
                return;
            case 1:
                ConnectionsManager.B(this.f18387b, this.f18388c);
                return;
            case 2:
                ConnectionsManager.r(this.f18387b, this.f18388c);
                return;
            default:
                ConnectionsManager.getInstance(this.f18387b).cancelRequest(this.f18388c, true);
                return;
        }
    }
}
