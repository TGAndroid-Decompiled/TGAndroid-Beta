package org.telegram.messenger;

import org.telegram.tgnet.ConnectionsManager;
public final class nh implements Runnable {
    public final int f19482a;
    public final int f19483b;
    public final int f19484c;

    public nh(int i10, int i11, int i12) {
        this.f19482a = i12;
        this.f19483b = i10;
        this.f19484c = i11;
    }

    @Override
    public final void run() {
        switch (this.f19482a) {
            case 0:
                PasskeysController.f(this.f19483b, this.f19484c);
                return;
            case 1:
                ConnectionsManager.A(this.f19483b, this.f19484c);
                return;
            case 2:
                ConnectionsManager.s(this.f19483b, this.f19484c);
                return;
            default:
                ConnectionsManager.getInstance(this.f19483b).cancelRequest(this.f19484c, true);
                return;
        }
    }
}
