package org.telegram.messenger;

import org.telegram.tgnet.ConnectionsManager;
public final class kh implements Runnable {
    public final int f18367a;
    public final int f18368b;
    public final int f18369c;

    public kh(int i10, int i11, int i12) {
        this.f18367a = i12;
        this.f18368b = i10;
        this.f18369c = i11;
    }

    @Override
    public final void run() {
        switch (this.f18367a) {
            case 0:
                PasskeysController.f(this.f18368b, this.f18369c);
                return;
            case 1:
                ConnectionsManager.B(this.f18368b, this.f18369c);
                return;
            case 2:
                ConnectionsManager.r(this.f18368b, this.f18369c);
                return;
            default:
                ConnectionsManager.getInstance(this.f18368b).cancelRequest(this.f18369c, true);
                return;
        }
    }
}
