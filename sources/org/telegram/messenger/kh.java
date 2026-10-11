package org.telegram.messenger;

import org.telegram.tgnet.ConnectionsManager;
public final class kh implements Runnable {
    public final int f18369a;
    public final int f18370b;
    public final int f18371c;

    public kh(int i10, int i11, int i12) {
        this.f18369a = i12;
        this.f18370b = i10;
        this.f18371c = i11;
    }

    @Override
    public final void run() {
        switch (this.f18369a) {
            case 0:
                PasskeysController.f(this.f18370b, this.f18371c);
                return;
            case 1:
                ConnectionsManager.B(this.f18370b, this.f18371c);
                return;
            case 2:
                ConnectionsManager.r(this.f18370b, this.f18371c);
                return;
            default:
                ConnectionsManager.getInstance(this.f18370b).cancelRequest(this.f18371c, true);
                return;
        }
    }
}
