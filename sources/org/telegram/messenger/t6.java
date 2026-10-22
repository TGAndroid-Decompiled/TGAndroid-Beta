package org.telegram.messenger;

import org.telegram.tgnet.ConnectionsManager;
public final class t6 implements Runnable {
    public final int f19567a;
    public final int f19568b;
    public final int f19569c;

    public t6(int i10, int i11, int i12) {
        this.f19567a = i12;
        this.f19568b = i10;
        this.f19569c = i11;
    }

    @Override
    public final void run() {
        switch (this.f19567a) {
            case 0:
                MediaController.lambda$startRecording$35(this.f19568b, this.f19569c);
                return;
            case 1:
                PasskeysController.lambda$login$11(this.f19568b, this.f19569c);
                return;
            case 2:
                ConnectionsManager.B(this.f19568b, this.f19569c);
                return;
            case 3:
                ConnectionsManager.r(this.f19568b, this.f19569c);
                return;
            default:
                ConnectionsManager.getInstance(this.f19568b).cancelRequest(this.f19569c, true);
                return;
        }
    }
}
