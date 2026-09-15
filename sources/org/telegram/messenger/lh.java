package org.telegram.messenger;

import org.telegram.tgnet.ConnectionsManager;
public final class lh implements Runnable {
    public final int f16689a;
    public final int f16690b;
    public final int f16691c;

    public lh(int i10, int i11, int i12) {
        this.f16689a = i12;
        this.f16690b = i10;
        this.f16691c = i11;
    }

    @Override
    public final void run() {
        switch (this.f16689a) {
            case 0:
                PasskeysController.f(this.f16690b, this.f16691c);
                return;
            case 1:
                ConnectionsManager.B(this.f16690b, this.f16691c);
                return;
            case 2:
                ConnectionsManager.s(this.f16690b, this.f16691c);
                return;
            default:
                ConnectionsManager.getInstance(this.f16690b).cancelRequest(this.f16691c, true);
                return;
        }
    }
}
