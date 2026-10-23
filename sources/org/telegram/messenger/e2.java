package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class e2 implements Runnable {
    public final int f18247a;
    public final DownloadController f18248b;
    public final TLRPC.Document f18249c;
    public final MessageObject d;

    public e2(DownloadController downloadController, TLRPC.Document document, MessageObject messageObject, int i10) {
        this.f18247a = i10;
        this.f18248b = downloadController;
        this.f18249c = document;
        this.d = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f18247a) {
            case 0:
                this.f18248b.lambda$onDownloadComplete$7(this.f18249c, this.d);
                return;
            default:
                this.f18248b.lambda$startDownloadFile$5(this.f18249c, this.d);
                return;
        }
    }
}
