package org.telegram.messenger;

import org.telegram.tgnet.ConnectionsManager;
public final class kh implements Runnable {
    public final int f18405a;
    public final int f18406b;
    public final int f18407c;

    public kh(int i10, int i11, int i12) {
        this.f18405a = i12;
        this.f18406b = i10;
        this.f18407c = i11;
    }

    @Override
    public final void run() {
        switch (this.f18405a) {
            case 0:
                PasskeysController.f(this.f18406b, this.f18407c);
                return;
            case 1:
                ConnectionsManager.B(this.f18406b, this.f18407c);
                return;
            case 2:
                ConnectionsManager.r(this.f18406b, this.f18407c);
                return;
            default:
                ConnectionsManager.getInstance(this.f18406b).cancelRequest(this.f18407c, true);
                return;
        }
    }
}
