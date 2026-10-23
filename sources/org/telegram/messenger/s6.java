package org.telegram.messenger;

import org.telegram.tgnet.ConnectionsManager;
public final class s6 implements Runnable {
    public final int f19491a;
    public final int f19492b;
    public final int f19493c;

    public s6(int i10, int i11, int i12) {
        this.f19491a = i12;
        this.f19492b = i10;
        this.f19493c = i11;
    }

    @Override
    public final void run() {
        switch (this.f19491a) {
            case 0:
                MediaController.lambda$startRecording$35(this.f19492b, this.f19493c);
                return;
            case 1:
                PasskeysController.lambda$login$11(this.f19492b, this.f19493c);
                return;
            case 2:
                ConnectionsManager.B(this.f19492b, this.f19493c);
                return;
            case 3:
                ConnectionsManager.r(this.f19492b, this.f19493c);
                return;
            default:
                ConnectionsManager.getInstance(this.f19492b).cancelRequest(this.f19493c, true);
                return;
        }
    }
}
