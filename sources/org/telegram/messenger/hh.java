package org.telegram.messenger;

import org.telegram.tgnet.ConnectionsManager;
public final class hh implements Runnable {
    public final int f18548a;
    public final int f18549b;
    public final int f18550c;

    public hh(int i10, int i11, int i12) {
        this.f18548a = i12;
        this.f18549b = i10;
        this.f18550c = i11;
    }

    @Override
    public final void run() {
        switch (this.f18548a) {
            case 0:
                PasskeysController.f(this.f18549b, this.f18550c);
                return;
            case 1:
                ConnectionsManager.B(this.f18549b, this.f18550c);
                return;
            case 2:
                ConnectionsManager.r(this.f18549b, this.f18550c);
                return;
            default:
                ConnectionsManager.getInstance(this.f18549b).cancelRequest(this.f18550c, true);
                return;
        }
    }
}
