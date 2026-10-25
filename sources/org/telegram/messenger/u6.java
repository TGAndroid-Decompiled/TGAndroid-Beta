package org.telegram.messenger;

import org.telegram.tgnet.ConnectionsManager;
public final class u6 implements Runnable {
    public final int f21390a;
    public final int f21391b;
    public final int f21392c;

    public u6(int i10, int i11, int i12) {
        this.f21390a = i12;
        this.f21391b = i10;
        this.f21392c = i11;
    }

    @Override
    public final void run() {
        switch (this.f21390a) {
            case 0:
                MediaController.lambda$startRecording$35(this.f21391b, this.f21392c);
                return;
            case 1:
                PasskeysController.f(this.f21391b, this.f21392c);
                return;
            case 2:
                ConnectionsManager.B(this.f21391b, this.f21392c);
                return;
            case 3:
                ConnectionsManager.r(this.f21391b, this.f21392c);
                return;
            default:
                ConnectionsManager.getInstance(this.f21391b).cancelRequest(this.f21392c, true);
                return;
        }
    }
}
