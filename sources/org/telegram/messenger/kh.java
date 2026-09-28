package org.telegram.messenger;

import org.telegram.tgnet.ConnectionsManager;
public final class kh implements Runnable {
    public final int f16847a;
    public final int f16848b;
    public final int f16849c;

    public kh(int i10, int i11, int i12) {
        this.f16847a = i12;
        this.f16848b = i10;
        this.f16849c = i11;
    }

    @Override
    public final void run() {
        switch (this.f16847a) {
            case 0:
                PasskeysController.f(this.f16848b, this.f16849c);
                return;
            case 1:
                ConnectionsManager.B(this.f16848b, this.f16849c);
                return;
            case 2:
                ConnectionsManager.s(this.f16848b, this.f16849c);
                return;
            default:
                ConnectionsManager.getInstance(this.f16848b).cancelRequest(this.f16849c, true);
                return;
        }
    }
}
