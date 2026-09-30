package org.telegram.messenger;

import org.telegram.tgnet.ConnectionsManager;
public final class kh implements Runnable {
    public final int f16863a;
    public final int f16864b;
    public final int f16865c;

    public kh(int i10, int i11, int i12) {
        this.f16863a = i12;
        this.f16864b = i10;
        this.f16865c = i11;
    }

    @Override
    public final void run() {
        switch (this.f16863a) {
            case 0:
                PasskeysController.f(this.f16864b, this.f16865c);
                return;
            case 1:
                ConnectionsManager.B(this.f16864b, this.f16865c);
                return;
            case 2:
                ConnectionsManager.s(this.f16864b, this.f16865c);
                return;
            default:
                ConnectionsManager.getInstance(this.f16864b).cancelRequest(this.f16865c, true);
                return;
        }
    }
}
