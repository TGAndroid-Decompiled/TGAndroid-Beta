package org.telegram.messenger;

import org.telegram.tgnet.ConnectionsManager;
public final class s6 implements Runnable {
    public final int f19559a;
    public final int f19560b;
    public final int f19561c;

    public s6(int i10, int i11, int i12) {
        this.f19559a = i12;
        this.f19560b = i10;
        this.f19561c = i11;
    }

    @Override
    public final void run() {
        switch (this.f19559a) {
            case 0:
                MediaController.lambda$startRecording$35(this.f19560b, this.f19561c);
                return;
            case 1:
                PasskeysController.lambda$login$11(this.f19560b, this.f19561c);
                return;
            case 2:
                ConnectionsManager.B(this.f19560b, this.f19561c);
                return;
            case 3:
                ConnectionsManager.r(this.f19560b, this.f19561c);
                return;
            default:
                ConnectionsManager.getInstance(this.f19560b).cancelRequest(this.f19561c, true);
                return;
        }
    }
}
