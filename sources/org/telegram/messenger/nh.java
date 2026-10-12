package org.telegram.messenger;

import org.telegram.tgnet.ConnectionsManager;
public final class nh implements Runnable {
    public final int f17966a;
    public final int f17967b;
    public final int f17968c;

    public nh(int i10, int i11, int i12) {
        this.f17966a = i12;
        this.f17967b = i10;
        this.f17968c = i11;
    }

    @Override
    public final void run() {
        switch (this.f17966a) {
            case 0:
                PasskeysController.lambda$login$11(this.f17967b, this.f17968c);
                return;
            case 1:
                ConnectionsManager.B(this.f17967b, this.f17968c);
                return;
            case 2:
                ConnectionsManager.r(this.f17967b, this.f17968c);
                return;
            default:
                ConnectionsManager.getInstance(this.f17967b).cancelRequest(this.f17968c, true);
                return;
        }
    }
}
