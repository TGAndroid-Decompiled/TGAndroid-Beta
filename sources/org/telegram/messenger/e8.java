package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class e8 implements Runnable {
    public final int f19973a;
    public final MediaDataController f19974b;
    public final TLRPC.Document f19975c;

    public e8(int i10, MediaDataController mediaDataController, TLRPC.Document document) {
        this.f19973a = i10;
        this.f19974b = mediaDataController;
        this.f19975c = document;
    }

    @Override
    public final void run() {
        switch (this.f19973a) {
            case 0:
                this.f19974b.lambda$removeRecentGif$25(this.f19975c);
                return;
            default:
                this.f19974b.lambda$addRecentGif$26(this.f19975c);
                return;
        }
    }
}
