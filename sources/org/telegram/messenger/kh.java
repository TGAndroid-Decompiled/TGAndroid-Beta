package org.telegram.messenger;

import org.telegram.tgnet.ConnectionsManager;
public final class kh implements Runnable {
    public final int f16845a;
    public final int f16846b;
    public final int f16847c;

    public kh(int i10, int i11, int i12) {
        this.f16845a = i12;
        this.f16846b = i10;
        this.f16847c = i11;
    }

    @Override
    public final void run() {
        switch (this.f16845a) {
            case 0:
                PasskeysController.f(this.f16846b, this.f16847c);
                return;
            case 1:
                ConnectionsManager.B(this.f16846b, this.f16847c);
                return;
            case 2:
                ConnectionsManager.s(this.f16846b, this.f16847c);
                return;
            default:
                ConnectionsManager.getInstance(this.f16846b).cancelRequest(this.f16847c, true);
                return;
        }
    }
}
