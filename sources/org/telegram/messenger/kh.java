package org.telegram.messenger;

import org.telegram.tgnet.ConnectionsManager;
public final class kh implements Runnable {
    public final int f16840a;
    public final int f16841b;
    public final int f16842c;

    public kh(int i10, int i11, int i12) {
        this.f16840a = i12;
        this.f16841b = i10;
        this.f16842c = i11;
    }

    @Override
    public final void run() {
        switch (this.f16840a) {
            case 0:
                PasskeysController.f(this.f16841b, this.f16842c);
                return;
            case 1:
                ConnectionsManager.B(this.f16841b, this.f16842c);
                return;
            case 2:
                ConnectionsManager.s(this.f16841b, this.f16842c);
                return;
            default:
                ConnectionsManager.getInstance(this.f16841b).cancelRequest(this.f16842c, true);
                return;
        }
    }
}
