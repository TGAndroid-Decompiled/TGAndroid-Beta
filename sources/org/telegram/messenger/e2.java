package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class e2 implements Runnable {
    public final int f18226a;
    public final DownloadController f18227b;
    public final TLRPC.Document f18228c;
    public final MessageObject d;

    public e2(DownloadController downloadController, TLRPC.Document document, MessageObject messageObject, int i10) {
        this.f18226a = i10;
        this.f18227b = downloadController;
        this.f18228c = document;
        this.d = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f18226a) {
            case 0:
                this.f18227b.lambda$onDownloadComplete$7(this.f18228c, this.d);
                return;
            default:
                this.f18227b.lambda$startDownloadFile$5(this.f18228c, this.d);
                return;
        }
    }
}
