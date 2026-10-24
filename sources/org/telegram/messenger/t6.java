package org.telegram.messenger;

import org.telegram.tgnet.ConnectionsManager;
public final class t6 implements Runnable {
    public final int f19634a;
    public final int f19635b;
    public final int f19636c;

    public t6(int i10, int i11, int i12) {
        this.f19634a = i12;
        this.f19635b = i10;
        this.f19636c = i11;
    }

    @Override
    public final void run() {
        switch (this.f19634a) {
            case 0:
                MediaController.lambda$startRecording$35(this.f19635b, this.f19636c);
                return;
            case 1:
                PasskeysController.lambda$login$11(this.f19635b, this.f19636c);
                return;
            case 2:
                ConnectionsManager.B(this.f19635b, this.f19636c);
                return;
            case 3:
                ConnectionsManager.r(this.f19635b, this.f19636c);
                return;
            default:
                ConnectionsManager.getInstance(this.f19635b).cancelRequest(this.f19636c, true);
                return;
        }
    }
}
