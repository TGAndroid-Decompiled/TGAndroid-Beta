package org.telegram.messenger;

import org.telegram.tgnet.ConnectionsManager;
public final class nh implements Runnable {
    public final int f17950a;
    public final int f17951b;
    public final int f17952c;

    public nh(int i10, int i11, int i12) {
        this.f17950a = i12;
        this.f17951b = i10;
        this.f17952c = i11;
    }

    @Override
    public final void run() {
        switch (this.f17950a) {
            case 0:
                PasskeysController.f(this.f17951b, this.f17952c);
                return;
            case 1:
                ConnectionsManager.A(this.f17951b, this.f17952c);
                return;
            case 2:
                ConnectionsManager.s(this.f17951b, this.f17952c);
                return;
            default:
                ConnectionsManager.getInstance(this.f17951b).cancelRequest(this.f17952c, true);
                return;
        }
    }
}
