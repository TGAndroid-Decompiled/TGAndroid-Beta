package org.telegram.messenger;

import org.telegram.tgnet.ConnectionsManager;
public final class nh implements Runnable {
    public final int f17925a;
    public final int f17926b;
    public final int f17927c;

    public nh(int i10, int i11, int i12) {
        this.f17925a = i12;
        this.f17926b = i10;
        this.f17927c = i11;
    }

    @Override
    public final void run() {
        switch (this.f17925a) {
            case 0:
                PasskeysController.f(this.f17926b, this.f17927c);
                return;
            case 1:
                ConnectionsManager.A(this.f17926b, this.f17927c);
                return;
            case 2:
                ConnectionsManager.s(this.f17926b, this.f17927c);
                return;
            default:
                ConnectionsManager.getInstance(this.f17926b).cancelRequest(this.f17927c, true);
                return;
        }
    }
}
