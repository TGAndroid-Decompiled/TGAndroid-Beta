package org.telegram.messenger;

import org.telegram.tgnet.ConnectionsManager;
public final class kh implements Runnable {
    public final int f18371a;
    public final int f18372b;
    public final int f18373c;

    public kh(int i10, int i11, int i12) {
        this.f18371a = i12;
        this.f18372b = i10;
        this.f18373c = i11;
    }

    @Override
    public final void run() {
        switch (this.f18371a) {
            case 0:
                PasskeysController.f(this.f18372b, this.f18373c);
                return;
            case 1:
                ConnectionsManager.B(this.f18372b, this.f18373c);
                return;
            case 2:
                ConnectionsManager.r(this.f18372b, this.f18373c);
                return;
            default:
                ConnectionsManager.getInstance(this.f18372b).cancelRequest(this.f18373c, true);
                return;
        }
    }
}
