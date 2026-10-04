package org.telegram.messenger;

import org.telegram.tgnet.ConnectionsManager;
public final class kh implements Runnable {
    public final int f18381a;
    public final int f18382b;
    public final int f18383c;

    public kh(int i10, int i11, int i12) {
        this.f18381a = i12;
        this.f18382b = i10;
        this.f18383c = i11;
    }

    @Override
    public final void run() {
        switch (this.f18381a) {
            case 0:
                PasskeysController.f(this.f18382b, this.f18383c);
                return;
            case 1:
                ConnectionsManager.B(this.f18382b, this.f18383c);
                return;
            case 2:
                ConnectionsManager.r(this.f18382b, this.f18383c);
                return;
            default:
                ConnectionsManager.getInstance(this.f18382b).cancelRequest(this.f18383c, true);
                return;
        }
    }
}
