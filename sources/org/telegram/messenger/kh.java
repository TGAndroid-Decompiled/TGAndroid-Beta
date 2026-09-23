package org.telegram.messenger;

import org.telegram.tgnet.ConnectionsManager;
public final class kh implements Runnable {
    public final int f16590a;
    public final int f16591b;
    public final int f16592c;

    public kh(int i10, int i11, int i12) {
        this.f16590a = i12;
        this.f16591b = i10;
        this.f16592c = i11;
    }

    @Override
    public final void run() {
        switch (this.f16590a) {
            case 0:
                PasskeysController.f(this.f16591b, this.f16592c);
                return;
            case 1:
                ConnectionsManager.B(this.f16591b, this.f16592c);
                return;
            case 2:
                ConnectionsManager.s(this.f16591b, this.f16592c);
                return;
            default:
                ConnectionsManager.getInstance(this.f16591b).cancelRequest(this.f16592c, true);
                return;
        }
    }
}
