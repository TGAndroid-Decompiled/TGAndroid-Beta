package org.telegram.messenger;

import org.telegram.tgnet.ConnectionsManager;
public final class th implements Runnable {
    public final int f16420a;
    public final int f16421b;
    public final int f16422c;

    public th(int i10, int i11, int i12) {
        this.f16420a = i12;
        this.f16421b = i10;
        this.f16422c = i11;
    }

    @Override
    public final void run() {
        switch (this.f16420a) {
            case 0:
                PasskeysController.f(this.f16421b, this.f16422c);
                return;
            case 1:
                ConnectionsManager.B(this.f16421b, this.f16422c);
                return;
            case 2:
                ConnectionsManager.s(this.f16421b, this.f16422c);
                return;
            default:
                ConnectionsManager.getInstance(this.f16421b).cancelRequest(this.f16422c, true);
                return;
        }
    }
}
