package org.telegram.messenger;

import org.telegram.tgnet.ConnectionsManager;
public final class dh implements Runnable {
    public final int f20104a;
    public final int f20105b;
    public final int f20106c;

    public dh(int i9, int i10, int i11) {
        this.f20104a = i11;
        this.f20105b = i9;
        this.f20106c = i10;
    }

    @Override
    public final void run() {
        switch (this.f20104a) {
            case 0:
                PasskeysController.f(this.f20105b, this.f20106c);
                return;
            case 1:
                ConnectionsManager.A(this.f20105b, this.f20106c);
                return;
            case 2:
                ConnectionsManager.s(this.f20105b, this.f20106c);
                return;
            default:
                ConnectionsManager.getInstance(this.f20105b).cancelRequest(this.f20106c, true);
                return;
        }
    }
}
