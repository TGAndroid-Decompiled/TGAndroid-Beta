package org.telegram.messenger;

import org.telegram.tgnet.ConnectionsManager;
public final class kh implements Runnable {
    public final int f20772a;
    public final int f20773b;
    public final int f20774c;

    public kh(int i10, int i11, int i12) {
        this.f20772a = i12;
        this.f20773b = i10;
        this.f20774c = i11;
    }

    @Override
    public final void run() {
        switch (this.f20772a) {
            case 0:
                PasskeysController.f(this.f20773b, this.f20774c);
                return;
            case 1:
                ConnectionsManager.A(this.f20773b, this.f20774c);
                return;
            case 2:
                ConnectionsManager.s(this.f20773b, this.f20774c);
                return;
            default:
                ConnectionsManager.getInstance(this.f20773b).cancelRequest(this.f20774c, true);
                return;
        }
    }
}
