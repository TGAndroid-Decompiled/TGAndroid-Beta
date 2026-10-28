package org.telegram.messenger;

import org.telegram.tgnet.ConnectionsManager;
public final class v6 implements Runnable {
    public final int f21496a;
    public final int f21497b;
    public final int f21498c;

    public v6(int i10, int i11, int i12) {
        this.f21496a = i12;
        this.f21497b = i10;
        this.f21498c = i11;
    }

    @Override
    public final void run() {
        switch (this.f21496a) {
            case 0:
                MediaController.lambda$startRecording$35(this.f21497b, this.f21498c);
                return;
            case 1:
                PasskeysController.f(this.f21497b, this.f21498c);
                return;
            case 2:
                ConnectionsManager.B(this.f21497b, this.f21498c);
                return;
            case 3:
                ConnectionsManager.r(this.f21497b, this.f21498c);
                return;
            default:
                ConnectionsManager.getInstance(this.f21497b).cancelRequest(this.f21498c, true);
                return;
        }
    }
}
