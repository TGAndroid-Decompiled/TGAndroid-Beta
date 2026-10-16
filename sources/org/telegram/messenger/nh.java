package org.telegram.messenger;

import org.telegram.tgnet.ConnectionsManager;
public final class nh implements Runnable {
    public final int f17663a;
    public final int f17664b;
    public final int f17665c;

    public nh(int i10, int i11, int i12) {
        this.f17663a = i12;
        this.f17664b = i10;
        this.f17665c = i11;
    }

    @Override
    public final void run() {
        switch (this.f17663a) {
            case 0:
                PasskeysController.lambda$login$11(this.f17664b, this.f17665c);
                return;
            case 1:
                ConnectionsManager.B(this.f17664b, this.f17665c);
                return;
            case 2:
                ConnectionsManager.r(this.f17664b, this.f17665c);
                return;
            default:
                ConnectionsManager.getInstance(this.f17664b).cancelRequest(this.f17665c, true);
                return;
        }
    }
}
